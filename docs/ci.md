# GitHub CI

The repository runs four GitHub Actions workflows: pull-request validation,
license-header enforcement, snapshot publication from the `snapshot` branch,
and release publication from the `main` branch.

All workflow definitions live in [`.github/workflows`](../.github/workflows).

## Branch model

`snapshot` is the active development line — all PRs target it, and every push
publishes a `-SNAPSHOT` artifact. `main` always holds the latest released
version, which is available on
[Maven Central](https://repo1.maven.org/maven2/org/eclipse/fennec/models/) under
`org.eclipse.fennec.models:*`.

| Branch     | Purpose                                            | Publishes to                                              |
|------------|----------------------------------------------------|-----------------------------------------------------------|
| `snapshot` | Active development. PRs target this branch.        | Sonatype Central — `-SNAPSHOT` versions                   |
| `main`     | Latest release — code here matches what is on Maven Central. | Sonatype Central → Maven Central — final versions, signed with project GPG key |

## Workflow overview

```
┌─────────────────────────┐
│   PR / feature branch   │
└────────────┬────────────┘
             │  push / pull_request
             ▼
    ┌─────────────────┐    ┌──────────────────┐
    │   build.yml     │    │   license.yml    │
    │   (CI Build)    │    │ (License header) │
    └─────────────────┘    └──────────────────┘
             │
             │  merge into snapshot
             ▼
    ┌─────────────────┐
    │  snapshot.yml   │  →  publishes SNAPSHOT artifacts
    └─────────────────┘
             │
             │  merge into main
             ▼
    ┌─────────────────┐
    │   release.yml   │  →  publishes signed release artifacts
    └─────────────────┘
```

## `build.yml` — CI Build

* **File:** [`.github/workflows/build.yml`](../.github/workflows/build.yml)
* **Triggers:** every `push` and `pull_request` on any branch.
* **Purpose:** Verify the source tree compiles and tests pass.
* **JDK:** Java 21 (Temurin) on `ubuntu-latest`.
* **Steps:** checkout → Gradle wrapper validation → set up JDK with Gradle
  cache → `./gradlew build --info`.
* **Secrets used:** none — this workflow does not publish anything.

A green run is the gating signal for review.

## `license.yml` — License header check

* **File:** [`.github/workflows/license.yml`](../.github/workflows/license.yml)
* **Triggers:** `push`, `pull_request`, and manual `workflow_dispatch`.
* **Purpose:** Verify every source file carries the Eclipse Public License
  2.0 header. Uses [apache/skywalking-eyes](https://github.com/apache/skywalking-eyes)
  driven by [`.licenserc.yaml`](../.licenserc.yaml).
* **What it checks:** the SPDX header pattern declared in `.licenserc.yaml`,
  applied to every file *not* listed under `paths-ignore`.
* **Failure mode:** on a PR the action comments on the offending lines via
  `GITHUB_TOKEN`. The fix is to add the standard header (template in
  [`CONTRIBUTING.md`](../CONTRIBUTING.md#license-headers)) and push again.

## `snapshot.yml` — Snapshot Build

* **File:** [`.github/workflows/snapshot.yml`](../.github/workflows/snapshot.yml)
* **Triggers:** `push` to the `snapshot` branch only. Pull requests are
  explicitly excluded so untrusted code cannot reach the publishing step.
* **Purpose:** Build, sign, and publish `-SNAPSHOT` artifacts whenever the
  `snapshot` branch advances.
* **JDK:** Java 21 (Temurin) on `ubuntu-latest`.
* **Command:** `./gradlew release --info`.
* **Secrets used:**
  * `CENTRAL_SONATYPE_TOKEN_USERNAME`, `CENTRAL_SONATYPE_TOKEN_PASSWORD` — Sonatype Central credentials
  * `GPG_PRIVATE_KEY`, `GPG_PASSPHRASE`, `GPG_KEY_ID` — signing key (imported into the runner's keyring, deleted at the end of the job)

## `release.yml` — Release Build

* **File:** [`.github/workflows/release.yml`](../.github/workflows/release.yml)
* **Triggers:** `push` to the `main` branch only. PRs are explicitly excluded.
* **Purpose:** Cut a signed release to Sonatype Central whenever `main` advances.
* **JDK:** Java 21.
* **Command:** `./gradlew release --info` with `DO_RELEASE=true`.
* **Secrets used:** same set as `snapshot.yml`.
* **Result:** signed artifacts pushed to Sonatype Central and (after the
  Central sync) to Maven Central.

## Published artifacts

Releases and snapshots are published to **Sonatype Central**, from which
releases sync to Maven Central. The group id is `org.eclipse.fennec.models`.

| Channel    | Repository URL                                                                                                                       | Pushed by                    |
|------------|--------------------------------------------------------------------------------------------------------------------------------------|------------------------------|
| Release    | [Maven Central](https://repo1.maven.org/maven2/org/eclipse/fennec/models/) — `org.eclipse.fennec.models:*`                            | `release.yml` on `main`      |
| Snapshot   | [Sonatype Central snapshots](https://central.sonatype.com/repository/maven-snapshots/org/eclipse/fennec/models/) — `*-SNAPSHOT`      | `snapshot.yml` on `snapshot` |
| Browse     | [search.maven.org `org.eclipse.fennec.models`](https://search.maven.org/search?q=g:org.eclipse.fennec.models) — find a version       |                              |

The Maven BOM coordinate to depend on the whole stack from a Gradle/Maven
build:

```xml
<dependency>
    <groupId>org.eclipse.fennec.models</groupId>
    <artifactId>org.eclipse.fennec.common.models.bom</artifactId>
    <version>${fennec.models.version}</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```

For BND workspaces, consume the bundle via the
`-library: fennecEMFModels` directive — see the
[README](../readme.md#fennec-emf-model-bndtools-library) for details.

## Secrets

The following repository / organisation secrets must be defined for
`snapshot.yml` and `release.yml` to succeed:

| Secret name                          | Purpose                                  |
|--------------------------------------|------------------------------------------|
| `CENTRAL_SONATYPE_TOKEN_USERNAME`    | Sonatype Central user token              |
| `CENTRAL_SONATYPE_TOKEN_PASSWORD`    | Sonatype Central token password          |
| `GPG_PRIVATE_KEY`                    | ASCII-armored GPG private key            |
| `GPG_PASSPHRASE`                     | Passphrase for the private key           |
| `GPG_KEY_ID`                         | Long-form key id (used by the build)     |

The GPG key is imported on the fly and the keyring is removed in a final
step that runs even when the job fails (`if: always()`). The build never
echoes secret values.

## Reproducing CI locally

* Full PR build:
  ```bash
  ./gradlew clean build --info
  ```
* License headers:
  ```bash
  docker run --rm -v $(pwd):/github/workspace \
    ghcr.io/apache/skywalking-eyes/license-eye header check
  ```
* The snapshot / release workflows cannot be reproduced locally because they
  publish to Sonatype Central and require the project signing key.

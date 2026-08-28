# GitHub CI

CI is built from **centralized reusable workflows** that live in
[`eclipse-fennec/.github`](https://github.com/eclipse-fennec/.github). This
repository contains only thin callers: all build logic and all action versions
are maintained in one place for the whole organisation, so bumping an action is a
single edit there instead of the same SHA in a dozen files per repo.

The design is documented in
[`ci-cd-reusable-workflows.md`](https://github.com/eclipse-fennec/.github/blob/main/docs/ci-cd-reusable-workflows.md).

All caller definitions live in [`.github/workflows`](../.github/workflows) and are
pinned by SHA to `eclipse-fennec/.github@v1.1.1`
(`9292fbff296548018fa9e4b0f6ad49ba7c639501`). Dependabot rewrites the SHA together
with its `# v1.1.1` comment, so pinning does not mean going stale.

## Branch model

`snapshot` is the active development line — all PRs target it, and every push
publishes a `-SNAPSHOT` artifact. `main` always holds the latest released version,
available on [Maven Central](https://repo1.maven.org/maven2/org/eclipse/fennec/models/)
under `org.eclipse.fennec.models:*`.

| Branch | Purpose | Publishes to |
|---|---|---|
| feature branches / PRs | verification only | – |
| `snapshot` | Active development. PRs target this branch. | Sonatype Central — `-SNAPSHOT` versions |
| `main` | Latest release — matches what is on Maven Central. | Sonatype Central → Maven Central — signed with the project GPG key |

**Verification is identical everywhere** — license gate, build and tests run the
same way on PRs, feature branches, `snapshot` and `main`. The only difference
between the two publishing branches is the `do-release` flag: `false` publishes a
snapshot, `true` publishes a release. Both invoke the same Gradle `release` task.

## Workflow overview

```
PR / feature branch          push to snapshot              push to main
        │                          │                            │
        ▼                          ▼                            ▼
   build.yml                 snapshot.yml                  release.yml
        │                          │                            │
        │                     ┌────┴────┐                  ┌────┴────┐
        └──► verify           │ verify  │                  │ verify  │  license + JDK 21 + JDK 25
                              └────┬────┘                  └────┬────┘  [no secrets]
                                   ▼                            ▼
                              release                       release       Gradle release task
                              do-release: false            do-release: true
                              → Maven Snapshot             → Maven Central
                                   │  [Sonatype + GPG]          │  [Sonatype + GPG]
                                   ▼                            ▼
                                 docs                         docs        VitePress + Pages
                                        [no secrets]
```

`needs:` is what gates the publish: nothing reaches Sonatype until the license
gate **and both JDKs** are green.

## Credential scoping

This is the central design decision, not an implementation detail. The publishing
step lives in its own reusable workflow (`reusable-release.yml`), and it is the
only one that declares `secrets:`. Therefore:

- the matrix build, the tests and the docs build never see publishing credentials,
- exactly **one** JDK publishes (21 for this repo), not the whole matrix,
- `secrets: inherit` in the callers forwards secrets only to the release job.

## The callers

| File | Trigger | Calls |
|---|---|---|
| [`build.yml`](../.github/workflows/build.yml) | push to any branch except `main`/`snapshot`, and every PR | `reusable-verify` |
| [`snapshot.yml`](../.github/workflows/snapshot.yml) | push to `snapshot` | `reusable-verify` → `reusable-release` (`do-release: false`) → `reusable-docs` |
| [`release.yml`](../.github/workflows/release.yml) | push to `main` | `reusable-verify` → `reusable-release` (`do-release: true`) → `reusable-docs` |
| [`docs.yml`](../.github/workflows/docs.yml) | `workflow_dispatch` | `reusable-docs` — manual site rebuild |
| [`scorecard.yml`](../.github/workflows/scorecard.yml) | weekly schedule, push to `main`, branch protection changes | `reusable-scorecard` |
| [`dependency-review.yml`](../.github/workflows/dependency-review.yml) | PR | `reusable-dependency-review` |

### What `verify` does

License gate first — [apache/skywalking-eyes](https://github.com/apache/skywalking-eyes)
driven by this repo's [`.licenserc.yaml`](../.licenserc.yaml) — then the Gradle
build on the JDK matrix `[21, 25]`, then `perfTest`. The license configuration
stays project-local; a centralized default is an open proposal, not current
practice.

There is **no standalone `license.yml`** any more. The gate is the first, gating
job inside `reusable-verify`, which applies it to every branch and PR without a
second run.

The reusable runs `clean build testOSGi`. This repository has no OSGi test
projects, so `testOSGi` resolves to SKIPPED in every module — it is a no-op here,
and no input is needed to suppress it.

### What `release` does

Imports the GPG key, runs `./gradlew build testOSGi release` with
`DO_RELEASE` set from `do-release`, uploads test results, then removes the
keyring. Tests and the release happen in **one** Gradle invocation, so the jars
that were tested are the jars that get published.

### What `docs` does

Builds the VitePress site in [`docs-site/`](../docs-site) and deploys it to
GitHub Pages under `https://eclipse-fennec.github.io/common.models/<branch>/`.
The publish path comes from `docs-site/docs/.vitepress/config.mts` via
`DOCS_BRANCH`, not from the workflow. See [overview.md](overview.md) for how the
documentation sources are organised.

## Published artifacts

| Channel | Repository URL | Pushed by |
|---|---|---|
| Release | [Maven Central](https://repo1.maven.org/maven2/org/eclipse/fennec/models/) — `org.eclipse.fennec.models:*` | `release.yml` on `main` |
| Snapshot | [Sonatype Central snapshots](https://central.sonatype.com/repository/maven-snapshots/org/eclipse/fennec/models/) — `*-SNAPSHOT` | `snapshot.yml` on `snapshot` |
| Browse | [search.maven.org `org.eclipse.fennec.models`](https://search.maven.org/search?q=g:org.eclipse.fennec.models) | |

See [consuming.md](consuming.md) for the BOM and workspace-library coordinates.

## Secrets

Required at repository or organisation level for the release job:

| Secret | Purpose |
|---|---|
| `CENTRAL_SONATYPE_TOKEN_USERNAME` | Sonatype Central user token |
| `CENTRAL_SONATYPE_TOKEN_PASSWORD` | Sonatype Central token password |
| `GPG_PRIVATE_KEY` | ASCII-armored GPG private key |
| `GPG_PASSPHRASE` | Passphrase for the private key |
| `GPG_KEY_ID` | Long-form key id |

They flow only through `secrets: inherit` into `reusable-release.yml`. Verify and
docs never receive them.

## Reproducing CI locally

```bash
./gradlew clean build            # what verify runs (per JDK)
./gradlew perfTest               # the perf/thread-safety tests

docker run --rm -v $(pwd):/github/workspace \
  ghcr.io/apache/skywalking-eyes/license-eye header check   # the license gate

cd docs-site && npm ci && npm run docs:build                # the docs build
```

The release path cannot be reproduced locally — it publishes to Sonatype Central
and needs the project signing key.

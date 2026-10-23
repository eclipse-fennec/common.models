# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Eclipse Fennec Common Models — a collection of ~38 OSGi bundles containing EMF (Eclipse Modeling Framework) models of **external standards** (OGC, W3C, OMG, HL7, XOeV, OSCAL, ...) generated from XSD/Ecore definitions using the fennecEMF code generation framework. Published to Maven Central under group ID `org.eclipse.fennec.models`.

### Split from the Fennec-own models (since 0.1.0)

- The Fennec-own models (`org.eclipse.fennec.model`, `org.eclipse.fennec.gdpr.*`, `org.eclipse.fennec.compliance.*`) moved to **eclipse-fennec/fennec.models** (library `fennecEMFModels`). Do not add `org.eclipse.fennec.*` models here.
- `org.eclipse.fennec.query.model` was dropped; it lives on in **eclipse-fennec/emf.persistence-jpa** (together with expression/stream/command).
- This repo's library was renamed from `fennecEMFModels` to **`fennecEMFCommonModels`** in 0.1.0. The frozen `0.0.1-SNAPSHOT` library still has the old name and all models, so consumers can migrate one by one: they change the library version (0.0.1 → 0.1.0) and name together and add `org.eclipse.fennec.models.library` only if they need Fennec-own models. Never mix the 0.0.1 library with the new `fennecEMFModels` — both provide that name.

## Build Commands

```bash
./gradlew build              # Build all modules
./gradlew perfTest            # Run performance/thread-safety tests (@Tag("perf"))
./gradlew codeCoverageReport  # Generate JaCoCo coverage report
./gradlew clean build         # Clean rebuild
```

- Java 21+ required (bundles target Java 21; CI tests on Java 21 and 25)
- Gradle 9 (wrapper 9.8.2)
- Gradle parallelism is enabled by default

## Build System

- **Gradle** with **biz.aQute.bnd.workspace** plugin (Bnd 7.2.1)
- Workspace configuration lives in `cnf/ext/fennec.bnd` (libraries, base version, Maven repos) and `cnf/ext/*.mvn` (Maven repo indexes); `cnf/build.bnd` only holds `-fixupmessages`. Project coordinates (`github_org`, `github_repository`, `maven_group_id`) come from `gradle.properties`.
- Each module has a `bnd.bnd` file defining its OSGi bundle metadata, dependencies, and code generation directives
- Testing: JUnit 5, Mockito 5.21, AssertJ 3.27

## Architecture

### Module Types

1. **Model bundles** (e.g., `net.opengis.gml3.model`, `org.hl7.fhir.model`, `de.xoev.code`): Each contains Ecore/XSD model definitions in `model/` and generated Java code in `src/` or `src-gen/`
2. **BOM** (`org.eclipse.fennec.common.models.bom`): Maven Bill-of-Materials aggregating all model dependencies
3. **Library** (`org.eclipse.fennec.common.models.library`): Bndtools workspace library providing `-library: fennecEMFCommonModels` for IDE integration. Its `-runbundles` in `required.bndrun` are resolved (`./gradlew :org.eclipse.fennec.common.models.library:resolve.required`); add new models to `-runrequires` there.

### Module Layout

```
<module>/
├── bnd.bnd           # Bundle config, dependencies, generation directives
├── model/            # Ecore, genmodel, and XSD source files
├── src/              # Generated Java code (default output)
├── src-gen/          # Generated Java code (alternative output, used by some modules)
└── test/             # Test sources
```

### Code Generation

Models are generated via fennecEMF, configured in each module's `bnd.bnd`:
```bnd
-generate: \
    model/foo.genmodel; \
        generate=fennecEMF; \
        genmodel=model/foo.genmodel; \
        output=src
```

- `src-gen/` and `src-gen*` directories contain **generated code** — do not hand-edit
- `src/` in model modules is also typically generated output
- **The `-generate` block is commented out in every module** of this repo; the generated code is committed. To regenerate, uncomment the blocks, run `./gradlew build`, then comment them out again — the committed state must have them disabled (see `docs/overview.md`)
- When working with ecore files, it is faster to ask the user for the generated code rather than generating it yourself

### Dependencies

All model bundles depend on `org.osgi.service.condition;version=latest`. Cross-model dependencies (e.g., GML depends on XLink) are declared in `-buildpath` within `bnd.bnd`.

## Branching & CI

- `main` — release builds (GPG-signed, deployed to Maven Central)
- `snapshot` — snapshot builds (deployed to Sonatype snapshots)
- Feature branches — PR builds (build + test only)
- License: EPL-2.0, headers checked in CI via SkyWalking Eyes

## Key Configuration Files

- `cnf/ext/fennec.bnd` — libraries, base version (0.1.0), Java level, Maven repos
- `cnf/ext/central.mvn`, `cnf/ext/dim-uml.mvn` — Maven repo indexes
- `gradle.properties` — Bnd version, JVM args, project coordinates
- `.licenserc.yaml` — license header exclusions (generated files, model files, bnd files)

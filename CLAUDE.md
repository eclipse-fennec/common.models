# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Eclipse Fennec Common Models — a collection of 40+ OSGi bundles containing EMF (Eclipse Modeling Framework) models generated from XSD/Ecore definitions using the fennecEMF code generation framework. Published to Maven Central under group ID `org.eclipse.fennec.models`.

## Build Commands

```bash
./gradlew build              # Build all modules
./gradlew perfTest            # Run performance/thread-safety tests (@Tag("perf"))
./gradlew codeCoverageReport  # Generate JaCoCo coverage report
./gradlew clean build         # Clean rebuild
```

- Java 21+ required (CI tests on Java 21 and 25)
- Gradle parallelism is enabled by default

## Build System

- **Gradle** with **biz.aQute.bnd.workspace** plugin (Bnd 7.2.1)
- Workspace configuration lives in `cnf/` (build.bnd, Maven repo indexes)
- Each module has a `bnd.bnd` file defining its OSGi bundle metadata, dependencies, and code generation directives
- Testing: JUnit 5, Mockito 5.21, AssertJ 3.27

## Architecture

### Module Types

1. **Model bundles** (e.g., `net.opengis.gml3.model`, `org.hl7.fhir.model`, `de.xoev.code`): Each contains Ecore/XSD model definitions in `model/` and generated Java code in `src/` or `src-gen/`
2. **BOM** (`org.eclipse.fennec.common.models.bom`): Maven Bill-of-Materials aggregating all model dependencies
3. **Library** (`org.eclipse.fennec.common.models.library`): Bndtools workspace library providing `-library: fennecEMFModels` for IDE integration

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
- To regenerate, modify the `.ecore`/`.genmodel` files and rebuild
- When working with ecore files, it is faster to ask the user for the generated code rather than generating it yourself

### Dependencies

All model bundles depend on `org.osgi.service.condition;version=latest`. Cross-model dependencies (e.g., GML depends on XLink) are declared in `-buildpath` within `bnd.bnd`.

## Branching & CI

- `main` — release builds (GPG-signed, deployed to Maven Central)
- `snapshot` — snapshot builds (deployed to Sonatype snapshots)
- Feature branches — PR builds (build + test only)
- License: EPL-2.0, headers checked in CI via SkyWalking Eyes

## Key Configuration Files

- `cnf/build.bnd` — workspace-wide Bnd settings, Maven repos, base version
- `gradle.properties` — Bnd version, JVM args
- `.licenserc.yaml` — license header exclusions (generated files, model files, bnd files)

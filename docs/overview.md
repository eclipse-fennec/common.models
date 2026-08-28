# Overview

Fennec Common Models is a collection of **EMF models for published standards**,
packaged as OSGi bundles. There is no runtime, no framework and no API here — the
entire deliverable is Ecore models plus the Java code generated from them.

If a standard you need already has an XML Schema, chances are this repository
already contains the corresponding Ecore model: 40 modules covering OGC
geospatial standards, W3C formats, OMG process notations, HL7 FHIR, OASIS OData,
the German XOeV family and more. See
[Model catalog & origins](/guides/model-catalog) for the full list and where each
model came from.

## What you get

- **An `EPackage` per standard**, registered as an OSGi service with the
  namespace URI, file extension and content type as service properties.
- **Generated Java checked in.** Consuming a model requires no code generation
  and no `.ecore` loading at build time.
- **Reuse instead of duplication.** Shared namespaces such as XLink live in one
  bundle; other models depend on it rather than generating their own copy, so an
  `EPackage` identity is unique at runtime.
- **One dependency for everything** — a Bndtools workspace library and a Maven
  BOM, see [Consuming the models](/guides/consuming).

## Repository layout

Three kinds of module live side by side:

| Kind | Example | Contents |
|---|---|---|
| **Model bundle** | `net.opengis.gml3.model`, `org.hl7.fhir.model` | `model/` with Ecore + genmodel + the original schemas, and the generated Java in `src/` or `src-gen*/` |
| **Workspace library** | `org.eclipse.fennec.common.models.library` | Resource-only bundle providing `-library: fennecEMFModels` for Bndtools |
| **Maven BOM** | `org.eclipse.fennec.common.models.bom` | Dependency management for all model bundles |

A model bundle looks like this:

```
<module>/
├── bnd.bnd           # bundle config, dependencies, generation directive
├── model/            # Ecore, genmodel and the original XSD/WSDL/XMI sources
├── src/  or src-gen/ # generated Java — do not hand-edit
└── test/             # tests, where a module has any
```

Both `src/` and `src-gen*/` hold **generated** code. `src-gen/` is the current
convention; modules using `src/` predate it.

## What a model bundle contains

Take `org.geojson.model` as the example. Generation produces, next to the model
classes themselves:

**`GeoJsonPackage`** — the `EPackage` interface, annotated so the runtime can
find the model sources and identify the model version:

```java
@EPackage(
    uri = GeoJsonPackage.eNS_URI,
    fingerprint = "fp1:998cd2df693d523081ff97740365b10c7380b9236abf3f5ab153dbacf1087dd0",
    genModel = "/model/geojson.genmodel",
    ecore = "/model/geojson.ecore")
public interface GeoJsonPackage extends org.eclipse.emf.ecore.EPackage { … }
```

**`GeoJsonEPackageConfigurator`** — the `EPackageConfigurator` whose service
properties are how consumers select a model:

```java
properties.put(EMFNamespaces.EMF_NAME, "geojson");
properties.put(EMFNamespaces.EMF_MODEL_NSURI, GeoJsonPackage.eNS_URI);
properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "geojson");
properties.put(EMFNamespaces.EMF_MODEL_CONTENT_TYPE, "application/geo+json");
properties.put(EMFNamespaces.EMF_MODEL_VERSION, "1.0");
properties.put(EMFNamespaces.EMF_MODEL_FINGERPRINT, FINGERPRINT);
```

**`GeoJsonConfigurationComponent`** — the Declarative Services component that
registers the configurator and the `EPackage` when the bundle starts.

### The model fingerprint

`emf.fingerprint` is a hash of the `.ecore` content, computed at generation time
and emitted as a constant. It identifies the **model version by content**, not
the artifact — two bundles built from the same Ecore carry the same fingerprint,
and a changed Ecore changes it.

This matters when one namespace URI is live in several versions at once: keying a
registry by `nsURI` alone cannot represent that, and the newer Fennec metadata
services key by fingerprint instead. If you keep your own map of tracked
`EPackage` services, key it by `emf.fingerprint`.

## How the code is generated

Generation runs through Fennec EMF's bnd `-generate` instruction, declared in
each module's `bnd.bnd`:

```bnd
-generate:\
	model/geojson.genmodel;\
		generate=fennecEMF;\
		genmodel=model/geojson.genmodel;\
		output=src-gen
```

**In the committed state this block is commented out in every module**, and the
generated code is checked in. Generation is slow — regenerating 40 models takes
minutes — and consumers never need it.

That has one consequence worth knowing: a plain `./gradlew build` does **not**
pick up a new generator version. To actually regenerate, uncomment the block,
build, then comment it out again — see
[Adding a new model](/guides/adding-a-model#regenerating-an-existing-model).

## Build

```bash
./gradlew build              # build all modules
./gradlew perfTest           # performance / thread-safety tests (@Tag("perf"))
./gradlew codeCoverageReport # aggregated JaCoCo report
```

Java 21+ is required; CI builds on 21 and 25. The workspace is a
[bnd/Bndtools](https://bnd.bndtools.org/) workspace driven by Gradle — bnd owns
the dependency resolution via each module's `-buildpath`, not Gradle. Workspace
configuration lives in `cnf/`.

`snapshot` is the active development branch and publishes `-SNAPSHOT` artifacts on
every push; `main` holds the latest release and publishes to Maven Central. The
pipeline is described in [ci.md](ci.md).

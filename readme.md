[![Snapshot Build](https://github.com/eclipse-fennec/common.models/actions/workflows/snapshot.yml/badge.svg)](https://github.com/eclipse-fennec/common.models/actions/workflows/snapshot.yml)[![License](https://github.com/eclipse-fennec/common.models/actions/workflows/license.yml/badge.svg)](https://github.com/eclipse-fennec/common.models/actions/workflows/license.yml)

# Eclipse Fennec Common Models

A collection of EMF models generated from XSD schemas. The packages contain generated code. Where possible, basic models like XHTML or Atom are reused across modules.

## Fennec EMF Model Bndtools Library

To simplify using these models in Bndtools, a workspace library is provided that integrates all dependencies.

Add this dependency:

`org.eclipse.fennec.models:org.eclipse.fennec.common.models.library:<version>`

Then add the following to your `build.bnd`:

`-library: fennecEMFModels`

## Fennec EMF Model Maven BOM

To simplify using these models in Maven, a BOM is provided that contains all dependencies.

Use the following coordinates on Maven Central:

```xml
<dependency>
	<groupId>org.eclipse.fennec.models</groupId>
	<artifactId>org.eclipse.fennec.common.models.bom</artifactId>
	<version>${fennec.models.version}</version>
	<type>pom</type>
	<scope>import</scope>
</dependency>
```

## Available Models

### W3C Standards

| Module | Description |
|---|---|
| `org.w3.atom.model` | W3C Atom Syndication Format (2005) |
| `org.w3.rdf.model` | W3C RDF, RDFS, and OWL ontology models |
| `org.w3.smil.model` | W3C SMIL 2.0 and SMIL-Language (2001) |
| `org.w3.xhtml.model` | W3C XHTML model |
| `org.w3.xinclude.model` | W3C XInclude model |
| `org.w3.xlink.model` | W3C XLink (1999) |
| `org.xmlsoap.model` | SOAP Envelope schema |

### OGC / OpenGIS Geospatial Standards

| Module | Description |
|---|---|
| `net.opengis.gml3.model` | Geography Markup Language (GML) 3.2.1 |
| `net.opengis.kml.model` | OGC KML 2.2 |
| `net.opengis.ogc` | OGC Filter and Exception handling |
| `net.opengis.ogc.features.model` | OGC API Features Core |
| `net.opengis.wfs.model` | Web Feature Service (WFS) 1.1 |
| `net.opengis.wfs2.model` | Web Feature Service (WFS) 2.0 |
| `net.opengis.wms` | Web Map Service (WMS) 1.3 |
| `org.geojson.model` | GeoJSON (RFC 7946) |

### German Public Sector (XOeV)

| Module | Description |
|---|---|
| `de.xoev.basisnachricht` | XOeV base message model (qualified and unqualified) |
| `de.xoev.code` | XOeV code lists and Latin character definitions |
| `de.xoev.din91379` | DIN 91379 character sets for public administration (2019-03 and 2022-04) |
| `de.xoev.domea` | XDOMEA 4.0 — document management and electronic archiving |
| `de.xoev.familie` | XFamilie — family-related civil registry data exchange |

### German Weather Service (DWD)

| Module | Description |
|---|---|
| `de.dwd.cdc.common.model` | DWD Climate Data Center — common meteorological definitions |
| `de.dwd.cdc.forecast.model` | DWD CDC forecast model |
| `de.dwd.cdc.model` | DWD CDC WFS model |

### German Surveying (AdV)

| Module | Description |
|---|---|
| `de.adv-online.aaa.model` | AdV AFIS-ALKIS-ATKIS (AAA) geospatial data model |

### OMG Business Process Standards

| Module | Description |
|---|---|
| `org.omg.bpmn.model` | OMG BPMN 2.0 — Business Process Model and Notation |
| `org.omg.cmmn.model` | OMG CMMN 1.1 — Case Management Model and Notation |
| `org.omg.dmn.model` | OMG DMN 1.6 — Decision Model and Notation |
| `org.camunda.bpmn.model` | Camunda BPMN 2.0 extensions |

### Healthcare

| Module | Description |
|---|---|
| `org.hl7.fhir.model` | HL7 FHIR R5 — Fast Healthcare Interoperability Resources |
| `org.emau.icmvc.ganimed.ttp.cm2` | gICS — Generic Informed Consent Service (SOAP model) |

### Other Standards

| Module | Description |
|---|---|
| `io.cloudevents.model` | CloudEvents specification model |
| `jakarta.persistence` | Jakarta Persistence 3.2 (JPA) mapping metadata |
| `org.apache.maven.model` | Apache Maven POM 4.0 model |
| `org.cyclonedx.schema` | CycloneDX 1.6 Software Bill of Materials (SBOM) |
| `org.docbook.model` | DocBook 5.0 documentation format |
| `org.odata.csdl.model` | OData CSDL 4.01 (Common Schema Definition Language) |
| `org.openmicroscopy` | OME (Open Microscopy Environment) data model |

### Fennec Internal

| Module | Description |
|---|---|
| `org.eclipse.fennec.query.model` | Fennec EMF query model |

## Adding a New Model Module

### Project Setup

1. **Module name**: Derived from the schema's namespace URI, with `.model` appended if needed (e.g., `http://www.opengis.net/gml/3.2` becomes `net.opengis.gml3.model`)
2. **Directory layout**:
   ```
   <module>/
   ├── bnd.bnd
   ├── model/          # Ecore, genmodel, and XSD source files
   ├── src/            # Generated Java code (default)
   └── .settings/org.eclipse.jdt.core.prefs
   ```
3. **`.settings/org.eclipse.jdt.core.prefs`**: Set Java compliance, source, and target to `21`

### Versioning

- **Bundle-Version** must reflect the specification version of the underlying schema (e.g., WFS 2.0 → `2.0.0.SNAPSHOT`, FHIR R5 → `5.0.0.SNAPSHOT`)
- If no specification version exists, use `1.0.0.SNAPSHOT`
- Always use the `.SNAPSHOT` qualifier

### bnd.bnd Configuration

```bnd
-library: enableEMF

#-generate:\
#	model/example.genmodel;\
#		generate=fennecEMF;\
#		genmodel=model/example.genmodel;\
#		output=src

-includeresource.model: model=model

Bundle-Version: <spec-version>.SNAPSHOT

-buildpath: \
	org.osgi.service.condition;version=latest
```

- The `-generate:` block must be **commented out** after initial code generation. Generated code is checked in so that builds do not require running the code generator every time.
- To regenerate, temporarily uncomment the block, run `./gradlew build`, then comment it out again and commit the updated sources.
- Cross-model dependencies go into `-buildpath` with `;version=snapshot`.

### Genmodel Settings

| Setting | Value |
|---|---|
| `complianceLevel` | `21.0` |
| `oSGiCompatible` | `true` |
| `basePackage` | `...` |
| `copyrightText` | EPL-2.0 header (see existing modules for exact text) |

### Checklist

- [ ] Ecore/XSD model files placed in `model/`
- [ ] Genmodel created with settings above
- [ ] Code generated and committed to `src/` (or `src-gen/`)
- [ ] `-generate:` block commented out in `bnd.bnd`
- [ ] Bundle-Version matches specification version
- [ ] Java 21 compliance in `.settings/org.eclipse.jdt.core.prefs`
- [ ] EPL-2.0 copyright header set in genmodel
- [ ] Module added to `org.eclipse.fennec.common.models.library/required.bnd` (run-requires) and *Resolve*  (This includes you new model into the *Bnd library* and the *Maven BOM*)
- [ ] `./gradlew build` passes

## Links

* [Documentation](https://github.com/eclipse-fennec/common.models)
* [Source Code](https://github.com/eclipse-fennec/common.models) (clone with `scm:git:git@github.com:eclipse-fennec/common.models.git`)

## Developers

* **Juergen Albert** (jalbert) / [j.albert@datainmotion.com](mailto:j.albert@datainmotion.com) @ [Data In Motion](https://www.datainmotion.com) - *architect*, *developer*
* **Mark Hoffmann** (mhoffmann) / [m.hoffmann@datainmotion.com](mailto:m.hoffmann@datainmotion.com) @ [Data In Motion](https://www.datainmotion.com) - *developer*, *architect*

## License

**Eclipse Public License 2.0**

## Copyright

Data In Motion Consulting GmbH - All rights reserved

Data In Motion Consulting GmbH - [info@datainmotion.com](mailto:info@datainmotion.com)

# Model catalog & origins

Every module in this repository is an EMF model of a **published, external
specification**. This page records, per module, which specification it covers,
the namespace URI the generated `EPackage` registers under, and **where the
source schema came from**.

## How to read this page

| Column | Meaning |
|---|---|
| **Module** | The bundle / directory name. Also the OSGi Bundle-Symbolic-Name. |
| **Version** | `Bundle-Version` — by repository convention this tracks the *specification* version, not a release counter (WFS 2.0 → `2.0.0`, FHIR R5 → `5.0.0`). Where the standard has no version, `1.0.0` is used. |
| **Namespace URI** | The `nsURI` of the generated `EPackage`, i.e. the value of the `emf.nsURI` service property. This is the identity a consumer filters on. |
| **Origin** | Where the schema in `<module>/model/` came from. |

**How the origin was determined.** Two kinds of evidence, marked in the tables:

- **Traceable** — the schema files in `model/` still carry the original
  `schemaLocation` / import URLs, or the module has its own `model/README.md`
  recording the derivation. These origins are taken straight from the files in
  this repository.
- **Attributed** — the schema files are local copies without an embedded source
  URL. The origin is then given as the canonical publication location for that
  namespace and version. It is the authoritative place to obtain the same
  schema, but it is not proof that this exact file was downloaded from there.

A handful of models have **no XML Schema at all** — they were authored as Ecore
directly from a prose or JSON specification. Those are marked
**hand-authored** and the reference points at the specification text.

::: tip Checking a namespace yourself
Every bundle carries its `model/` directory as a resource, so the original
schema travels with the artifact:

```bash
unzip -l org.hl7.fhir.model.jar | grep model/
```
:::

---

## W3C standards

| Module | Version | Namespace URI | Origin |
|---|---|---|---|
| `org.w3.atom.model` | 1.0.0 | `http://www.w3.org/2005/Atom` | **Attributed** — [RFC 4287, Atom Syndication Format](https://www.rfc-editor.org/rfc/rfc4287). The local `atom-author-link.xsd` is the schema fragment OGC redistributes with KML; see the KML entry below. |
| `org.w3.xlink.model` | 1.0.0 | `http://www.w3.org/1999/xlink` | **Attributed** — [XLink 1.1](https://www.w3.org/TR/xlink11/), schema at [`w3.org/1999/xlink.xsd`](http://www.w3.org/1999/xlink.xsd). Imported by GML, WFS, WMS, DocBook and AAA — hence its own bundle. |
| `org.w3.xinclude.model` | 1.0.0 | `http://www.w3.org/2001/XInclude` | **Attributed** — [XInclude 1.1](https://www.w3.org/TR/xinclude-11/). |
| `org.w3.xhtml.model` | 1.0.0 | `http://www.w3.org/1999/xhtml` | **Attributed** — [XHTML 1.0](https://www.w3.org/TR/xhtml1/). Hand-trimmed Ecore; no XSD is kept in the module. |
| `org.w3.smil.model` | 2.0.0 | `http://www.w3.org/2001/SMIL20/`<br>`http://www.w3.org/2001/SMIL20/Language` | **Traceable** — the local XSDs import [`w3.org/2001/SMIL20/smil20.xsd`](http://www.w3.org/2001/SMIL20/smil20.xsd) and `smil20-language.xsd`. Spec: [SMIL 2.0](https://www.w3.org/TR/SMIL2/). GML 3.1.1 also redistributes these. |
| `org.w3.rdf.model` | 1.0.0 | `http://www.w3.org/1999/02/22-rdf-syntax-ns#`<br>`http://www.w3.org/2000/01/rdf-schema#`<br>`http://www.w3.org/2002/07/owl#` | **Traceable** — *not* generated from XSD. Derived from the OMG ODM UML profile/library XMI, per [`model/README.MD`](https://github.com/eclipse-fennec/common.models/blob/main/org.w3.rdf.model/model/README.MD): [`RDFProfile.xmi`](http://www.omg.org/spec/ODM/20131101/RDFProfile.xmi) and [`RDFLibrary.xmi`](https://www.omg.org/spec/ODM/20131101/RDFLibrary.xmi) (ODM 1.1). That README also documents the manual Ecore fixes that were needed. |
| `org.xmlsoap.model` | 1.1.0 | `http://schemas.xmlsoap.org/soap/envelope/` | **Traceable** — the local `xmlsoap.xsd` declares the [SOAP 1.1 envelope](http://schemas.xmlsoap.org/soap/envelope/) and encoding namespaces. Spec: [SOAP 1.1](https://www.w3.org/TR/2000/NOTE-SOAP-20000508/). |

## OGC / OpenGIS

| Module | Version | Namespace URI | Origin |
|---|---|---|---|
| `net.opengis.gml3.model` | 3.2.0 | `http://www.opengis.net/gml/3.2` plus the ISO/TC 211 namespaces `.../2005/{gco,gmd,gsr,gss,gts}` | **Traceable** — 29 XSDs; the imports point at [`schemas.opengis.net/gml/3.1.1/`](http://schemas.opengis.net/gml/3.1.1/) and [`schemas.opengis.net/iso/19139/20070417/gmd/gmd.xsd`](http://schemas.opengis.net/iso/19139/20070417/gmd/gmd.xsd). Spec: GML 3.2.1 = [OGC 07-036](https://www.ogc.org/standard/gml/) = ISO 19136. The `gco`/`gmd`/`gsr`/`gss`/`gts` packages are the [ISO 19139 metadata schemas](http://standards.iso.org/iso/19139/). |
| `net.opengis.kml.model` | 2.2.0 | `http://www.opengis.net/kml/2.2`<br>`urn:oasis:names:tc:ciq:xsdschema:xAL:2.0` | **Traceable** — `ogckml22.xsd` imports [`docs.oasis-open.org/election/external/xAL.xsd`](http://docs.oasis-open.org/election/external/xAL.xsd) for the address model. Spec: [OGC KML 2.2](https://www.ogc.org/standard/kml/) (OGC 07-147r2); canonical schema [`schemas.opengis.net/kml/2.2.0/ogckml22.xsd`](http://schemas.opengis.net/kml/2.2.0/ogckml22.xsd). xAL is [OASIS CIQ](https://www.oasis-open.org/committees/ciq/). |
| `net.opengis.wfs.model` | 1.1.0 | `http://www.opengis.net/wfs`<br>`.../ogc`, `.../ows`, `.../gml` | **Traceable** — `wfs-1.1.0.xsd` imports [`filter/1.1.0/filter.xsd`](http://schemas.opengis.net/filter/1.1.0/filter.xsd), [`gml/3.1.1/base/gml.xsd`](http://schemas.opengis.net/gml/3.1.1/base/gml.xsd) and [`ows/1.0.0/owsAll.xsd`](http://schemas.opengis.net/ows/1.0.0/owsAll.xsd). Spec: [WFS 1.1.0](https://www.ogc.org/standard/wfs/) (OGC 04-094). |
| `net.opengis.wfs2.model` | 2.0.0 | `http://www.opengis.net/wfs/2.0`<br>`http://www.opengis.net/fes/2.0`<br>`http://www.opengis.net/ows/1.1` | **Traceable** — `wfs.xsd` imports [`filter/2.0/filterAll.xsd`](http://schemas.opengis.net/filter/2.0/filterAll.xsd) and [`ows/1.1.0/owsAll.xsd`](http://schemas.opengis.net/ows/1.1.0/owsAll.xsd). Spec: [WFS 2.0](https://www.ogc.org/standard/wfs/) (OGC 09-025r2 / ISO 19142), Filter Encoding 2.0 (OGC 09-026r1 / ISO 19143). |
| `net.opengis.wms` | 1.3.0 | `http://www.opengis.net/wms` | **Attributed** — local `capabilities_1_3_0.xsd`, canonical [`schemas.opengis.net/wms/1.3.0/capabilities_1_3_0.xsd`](http://schemas.opengis.net/wms/1.3.0/capabilities_1_3_0.xsd). Spec: [WMS 1.3.0](https://www.ogc.org/standard/wms/) (OGC 06-042 / ISO 19128). |
| `net.opengis.ogc` | 1.3.0 | `http://www.opengis.net/ogc` | **Attributed** — `exceptions_1_3_0.xsd`, the OGC service exception report shared by WMS/WFS; canonical [`schemas.opengis.net/wms/1.3.0/exceptions_1_3_0.xsd`](http://schemas.opengis.net/wms/1.3.0/exceptions_1_3_0.xsd). |
| `net.opengis.ogc.features.model` | 1.0.0 | `http://www.opengis.net/ogcapi-features-1/1.0`<br>`.../1.0/sf`<br>`http://www.opengis.net/gmlsf/2.0` | **Traceable** — imports [`gmlsfProfile/2.0/gmlsfLevels.xsd`](http://schemas.opengis.net/gmlsfProfile/2.0/gmlsfLevels.xsd) and [`kml/2.3/atom-author-link.xsd`](http://schemas.opengis.net/kml/2.3/atom-author-link.xsd). Spec: [OGC API — Features Part 1: Core](https://docs.ogc.org/is/17-069r4/17-069r4.html) (OGC 17-069r4). |
| `org.geojson.model` | 1.0.0 | `https://geojson.org/model/2016` | **Hand-authored** — GeoJSON has no XML Schema. Ecore written against [RFC 7946](https://www.rfc-editor.org/rfc/rfc7946). The namespace URI is a Fennec-local identifier, not a GeoJSON-assigned one. |

## German public sector (XOeV)

The XOeV standards are maintained by [KoSIT](https://www.xoev.de/) and published
through the [XRepository](https://www.xrepository.de/).

| Module | Version | Namespace URI | Origin |
|---|---|---|---|
| `de.xoev.basisnachricht` | 1.0.0 | `http://xoev.de/schemata/basisnachricht/{behoerde,g2g,kommunikation}/1_0`<br>`.../unqualified/g2g/1_0` | **Traceable** — the local XSDs import [`xoev.de/schemata/code/1_0/xoev-code.xsd`](http://xoev.de/schemata/code/1_0/xoev-code.xsd) and the DIN 91379 datatypes. Both a qualified and an *unqualified* variant are generated (two genmodels, two source folders). |
| `de.xoev.code` | 1.0.0 | `http://xoev.de/schemata/code/1_0`<br>`http://xoev.de/latinchars/1_1/datatypes` | **Traceable** — `xoev-code.xsd` (XOeV code list datatypes) and `latinchars.xsd`. Canonical: [`xoev.de/schemata/code/1_0/xoev-code.xsd`](http://xoev.de/schemata/code/1_0/xoev-code.xsd). |
| `de.xoev.din91379` | 1.0.0 | `urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03`<br>`urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08` | **Traceable** — both revisions are kept side by side (`din-91379-datatypes-2019-03.xsd`, `-2022-04.xsd`) and generated into separate source folders. The 2022 file is published at [`xoev.de/schemata/din/91379/2022-08/din-norm-91379-datatypes.xsd`](https://xoev.de/schemata/din/91379/2022-08/din-norm-91379-datatypes.xsd). Standard: DIN 91379 (character repertoire for public administration). |
| `de.xoev.domea` | 4.0.0 | `urn:xoev-de:xdomea:schema:4.0.0` | **Traceable** — 19 XSDs; imports resolve to [`xoev.de/schemata/basisnachricht/unqualified/g2g/1_1/…`](http://xoev.de/schemata/basisnachricht/unqualified/g2g/1_1/xoev-basisnachricht-unqualified-g2g_1.1.xsd) and the DIN 91379 2022-08 datatypes. Standard: [XDOMEA 4.0](https://www.xoev.de/xdomea-2410) — records management / electronic archiving. |
| `de.xoev.familie` | 1.3.0 | 11 namespaces `http://www.xoev.de/xfamilie/<domain>/1.3.0` | **Traceable** — 15 XSDs covering adoption, allgemeine Nachrichten, Baukasten, Beistandschaft, DSRV, Elterngeld, Geburt, Hilfen zur Erziehung, Kinderwunsch, Mutterschaftsgeld and Unterhaltsvorschuss, plus the DIN 91379 datatypes. Standard: [XFamilie](https://www.xoev.de/xfamilie-2411). The module's [`model/README.md`](https://github.com/eclipse-fennec/common.models/blob/main/de.xoev.familie/model/README.md) documents one deliberate deviation: the DIN 91379 `pattern` facets were removed from two datatypes, because the generated regexes are not usable in Java. |

## German Weather Service (DWD)

| Module | Version | Namespace URI | Origin |
|---|---|---|---|
| `de.dwd.cdc.model` | 1.0.0 | `http://cdc.dwd.de` | **Traceable** — `wfs_neu.xsd`, the WFS feature schema of the DWD [Climate Data Center](https://opendata.dwd.de/climate_environment/CDC/); imports [`cdc.dwd.de/geoserver/schemas/gml/3.1.1/base/gml.xsd`](https://cdc.dwd.de/geoserver/schemas/gml/3.1.1/base/gml.xsd), i.e. the schema was taken from the CDC GeoServer. |
| `de.dwd.cdc.common.model` | 1.0.1 | `http://cdc.dwd.de/common/metelements` | **Attributed** — `MetElementDefinition.xsd`, the CDC meteorological element definitions. Shared by the other two DWD modules. |
| `de.dwd.cdc.forecast.model` | 1.0.0 | `https://opendata.dwd.de/weather/lib/pointforecast_dwd_extension_V1_0.xsd` | **Traceable** — the namespace *is* the source URL: [`opendata.dwd.de/weather/lib/pointforecast_dwd_extension_V1_0.xsd`](https://opendata.dwd.de/weather/lib/pointforecast_dwd_extension_V1_0.xsd), the DWD MOSMIX point-forecast KML extension. |

## German surveying (AdV)

| Module | Version | Namespace URI | Origin |
|---|---|---|---|
| `de.adv-online.aaa.model` | 6.0.0 | `http://www.adv-online.de/namespaces/adv/sk-xml/6.0` | **Attributed** — `sk-xml.xsd` (imports XLink). The AAA reference model (AFIS-ALKIS-ATKIS) and its NAS exchange format are published by the [AdV](https://www.adv-online.de/AAA-Modell/). Version 6.0 of the *Schlüsselkatalog* XML binding. |

## OMG business process standards

The OMG publishes each specification's XSDs under a dated path. In this
repository the schemas are kept in a directory named after that date, which
makes the exact revision traceable.

| Module | Version | Namespace URI | Origin |
|---|---|---|---|
| `org.omg.bpmn.model` | 2.0.0 | `http://www.omg.org/spec/BPMN/20100524/MODEL`<br>`.../BPMN/20100524/DI`<br>`http://www.omg.org/spec/DD/20100524/{DC,DI}` | **Traceable** — `model/20100201/` holds `BPMN20.xsd`, `Semantic.xsd`, `BPMNDI.xsd`, `DC.xsd`, `DI.xsd`. Spec: [BPMN 2.0](https://www.omg.org/spec/BPMN/2.0/) with the shared [Diagram Definition](https://www.omg.org/spec/DD/) DC/DI packages. |
| `org.omg.cmmn.model` | 1.1.0 | `http://www.omg.org/spec/CMMN/20151109/{MODEL,CMMNDI,DC,DI}` | **Traceable** — `model/20151109/` holds `CMMN11.xsd`, `CMMN11CaseModel.xsd`, `CMMNDI11.xsd`, `DC.xsd`, `DI.xsd`. Spec: [CMMN 1.1](https://www.omg.org/spec/CMMN/1.1/). |
| `org.omg.dmn.model` | 1.6.0 | `https://www.omg.org/spec/DMN/20240513/MODEL/`<br>`https://www.omg.org/spec/DMN/20230324/DMNDI/`<br>`http://www.omg.org/spec/DMN/20180521/{DC,DI}/` | **Traceable** — `model/20240513/` holds `DMN16.xsd`, `DMNDI15.xsd`, `DC.xsd`, `DI.xsd`; the FEEL namespace is referenced as well. Spec: [DMN 1.6](https://www.omg.org/spec/DMN/1.6/). |
| `org.camunda.bpmn.model` | 1.0.0 | `http://camunda.org/schema/1.0/bpmn` | **Attributed** — the [Camunda BPMN extension elements](https://docs.camunda.org/manual/latest/user-guide/model-api/bpmn-model-api/extension-elements/) (`camunda:executionListener`, `camunda:field`, …), namespace [`camunda.org/schema/1.0/bpmn`](http://camunda.org/schema/1.0/bpmn). No XSD is kept; the Ecore extends `org.omg.bpmn.model` and was maintained as Ecore (an Obeo-tooling variant is kept in `model/obeo/`). |

## Healthcare

| Module | Version | Namespace URI | Origin |
|---|---|---|---|
| `org.hl7.fhir.model` | 5.0.0 | `http://hl7.org/fhir` | **Traceable** — `model/xsd/fhir-all-xsd.zip`, the complete XSD distribution as shipped by HL7. Spec: [FHIR R5](https://hl7.org/fhir/R5/); the archive is published at [`hl7.org/fhir/R5/fhir-all-xsd.zip`](https://hl7.org/fhir/R5/fhir-all-xsd.zip). |
| `org.emau.icmvc.ganimed.ttp.cm2` | 1.0.0 | `http://cm2.ttp.ganimed.icmvc.emau.org/`<br>`http://www.ttp.ganimed.icmvc.emau.org/cm2/config` | **Traceable** — derived from the WSDL of a running gICS instance, not from a published schema. The module's [`model/README.md`](https://github.com/eclipse-fennec/common.models/blob/main/org.emau.icmvc.ganimed.ttp.cm2/model/README.md) names the endpoints (`/gics/gicsService?wsdl`, `/gics/gicsManagementService?wsdl`, `/gics/gicsServiceWithNotification?wsdl`) and records that `gicsServiceWithNotification` was deliberately ignored because it contradicts `gicsService`. Project: [gICS — Generic Informed Consent Service](https://www.ths-greifswald.de/gics/) (University Medicine Greifswald). |

## Other standards

| Module | Version | Namespace URI | Origin |
|---|---|---|---|
| `org.odata.csdl.model` | 4.0.1 | `http://docs.oasis-open.org/odata/ns/edmx`<br>`http://docs.oasis-open.org/odata/ns/edm` | **Traceable** — the XSDs reference [`docs.oasis-open.org/odata/odata-csdl-xml/v4.01/os/schemas`](https://docs.oasis-open.org/odata/odata-csdl-xml/v4.01/os/schemas/). Spec: [OData CSDL XML 4.01](https://docs.oasis-open.org/odata/odata-csdl-xml/v4.01/) (OASIS Standard). |
| `org.cyclonedx.schema` | 1.6.0 | `http://cyclonedx.org/schema/bom/1.6`<br>`http://cyclonedx.org/schema/spdx` | **Traceable** — `model/xsd/` keeps `bom-1.0.xsd` … `bom-1.6.xsd` plus `spdx.xsd`; only 1.6 is generated. The schemas reference [purl-spec](https://github.com/package-url/purl-spec) and [spdx.org/specifications](https://spdx.org/specifications). Spec: [CycloneDX 1.6](https://cyclonedx.org/docs/1.6/xml/), schema [`cyclonedx.org/schema/bom-1.6.xsd`](https://cyclonedx.org/schema/bom-1.6.xsd). |
| `jakarta.persistence` | 3.2.0 | `https://jakarta.ee/xml/ns/persistence`<br>`https://jakarta.ee/xml/ns/persistence/orm` | **Traceable** — the local files are the published schemas [`persistence_3_2.xsd`](https://jakarta.ee/xml/ns/persistence/persistence_3_2.xsd) and [`orm/orm_3_2.xsd`](https://jakarta.ee/xml/ns/persistence/orm/orm_3_2.xsd). Spec: [Jakarta Persistence 3.2](https://jakarta.ee/specifications/persistence/3.2/). This models the *deployment descriptors* (`persistence.xml`, `orm.xml`), not the JPA API. |
| `org.apache.maven.model` | 4.0.0 | `http://maven.apache.org/POM/4.0.0` | **Attributed** — `maven-4.0.0.xsd`, canonical [`maven.apache.org/xsd/maven-4.0.0.xsd`](https://maven.apache.org/xsd/maven-4.0.0.xsd). Models the POM. |
| `org.docbook.model` | 5.0.0 | `http://docbook.org/ns/docbook`<br>`http://www.w3.org/1999/xlink` | **Attributed** — `docbook.xsd` with the imported `xlink.xsd`, `xinclude.xsd` and `xml.xsd`. Spec: [DocBook 5.0](https://docbook.org/xml/5.0/) — note the normative DocBook 5 grammar is RELAX NG; the W3C XML Schema is the derived variant. |
| `io.cloudevents.model` | 1.0.2 | `https://cloudevents.io/1.0.2` | **Hand-authored** — CloudEvents defines no XML Schema. Ecore written against the [CloudEvents v1.0.2 core specification](https://github.com/cloudevents/spec/blob/v1.0.2/cloudevents/spec.md). The namespace URI is a Fennec-local identifier. |
| `org.openmicroscopy` | 1.0.0 | `http://www.openmicroscopy.org/Schemas/OME/2016-06` | **Attributed** — `ome.xsd`, canonical [`openmicroscopy.org/Schemas/OME/2016-06/ome.xsd`](https://www.openmicroscopy.org/Schemas/OME/2016-06/ome.xsd). Spec: [OME Data Model](https://www.openmicroscopy.org/Schemas/) (2016-06 release). |

## Fennec-internal models

These are not external standards — they are Fennec's own models, kept here so
they ship through the same library and BOM.

| Module | Namespace URI | Purpose |
|---|---|---|
| `org.eclipse.fennec.model` | `https://org.eclipse/fennec/collection/1.0`<br>`https://org.eclipse/fennec/pushstream/1.0`<br>`https://org.eclipse/fennec/utils/1.0` | Three small utility models — collection wrappers, OSGi PushStream types and general utilities. Generated into `src-gen-coll/`, `src-gen-ps/` and `src-gen-util/`. |
| `org.eclipse.fennec.query.model` | `https://org.eclipse/fennec/query/1.0.0` | The Fennec query model — comparators, operations and sort orders used to express queries over EMF instances. |

::: warning Work in progress
`org.eclipse.fennec.service.model` (`http://eclipse.org/fennec/service/1.0`)
exists in the workspace but is not part of the build yet — it has a
`model/service.ecore` but no genmodel, so nothing is generated from it.
:::

## Shared models and cross-module dependencies

Several namespaces appear in more than one standard. Where a namespace has its
own bundle, other modules depend on that bundle instead of re-generating it —
this is what keeps `EPackage` identities unique at runtime.

| Namespace | Owning module | Reused by |
|---|---|---|
| `http://www.w3.org/1999/xlink` | `org.w3.xlink.model` | GML, WFS, WMS, DocBook, AAA, OGC API Features |
| `http://www.w3.org/2001/SMIL20/` | `org.w3.smil.model` | GML 3.1.1 (redistributed there) |
| `http://www.opengis.net/gml` | `net.opengis.wfs.model` (3.1.1 base) / `net.opengis.gml3.model` (3.2) | WFS, DWD CDC |
| `http://www.w3.org/2005/Atom` | `org.w3.atom.model` | KML 2.3, OGC API Features |
| BPMN 2.0 semantic model | `org.omg.bpmn.model` | `org.camunda.bpmn.model` |
| DIN 91379 datatypes | `de.xoev.din91379` | `de.xoev.basisnachricht`, `de.xoev.domea`, `de.xoev.familie` |
| XOeV code lists | `de.xoev.code` | `de.xoev.basisnachricht`, `de.xoev.domea` |

Where a module still contains a *local* copy of a foreign namespace's Ecore
(for example `gml.ecore` inside `net.opengis.wfs.model`, or `xlink.ecore` inside
`org.docbook.model`), that copy exists because the standard's own schema set
bundles a specific revision that differs from the standalone bundle.

## Licensing of the source schemas

The Java code in this repository is EPL-2.0. The **schemas** in each `model/`
directory remain under the terms of their respective publisher — OGC, W3C, OMG,
OASIS, HL7, KoSIT, AdV, DWD and others. They are redistributed here as the
generator input and as a runtime resource. Consult the publisher's terms before
redistributing a schema outside this context; the links in the tables above are
the authoritative source for each one.

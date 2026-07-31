---
layout: home

hero:
  name: Fennec Common Models
  text: EMF models for common standards
  tagline: Forty ready-to-use Ecore models — OGC, W3C, OMG, HL7 FHIR, OASIS, XOeV and more — generated from the official schemas and packaged as OSGi bundles.
  image:
    src: /fennec-logo.png
    alt: Eclipse Fennec logo
  actions:
    - theme: brand
      text: Model catalog & origins
      link: /guides/model-catalog
    - theme: alt
      text: Start using them
      link: /guides/consuming
    - theme: alt
      text: View on GitHub
      link: https://github.com/eclipse-fennec/common.models

features:
  - icon: 🗺️
    title: Geospatial
    details: GML 3.2.1, KML 2.2, WFS 1.1 and 2.0, WMS 1.3, OGC API Features, GeoJSON — plus the ISO 19139 metadata schemas GML builds on.
    link: /guides/model-catalog#ogc-opengis
    linkText: See origins
  - icon: 🏛️
    title: German public sector
    details: XOeV base messages, XDOMEA 4.0, XFamilie 1.3, DIN 91379 character sets, AdV AAA, and the DWD Climate Data Center schemas.
    link: /guides/model-catalog#german-public-sector-xoev
    linkText: See origins
  - icon: ⚙️
    title: Business process & data
    details: OMG BPMN 2.0, CMMN 1.1, DMN 1.6 with their DI/DC diagram models, Camunda extensions, OData CSDL 4.01 and CycloneDX 1.6.
    link: /guides/model-catalog#omg-business-process-standards
    linkText: See origins
  - icon: 🩺
    title: Healthcare
    details: HL7 FHIR R5 — the full resource model from the official XSD distribution — and the gICS consent service model derived from its WSDL.
    link: /guides/model-catalog#healthcare
    linkText: See origins
  - icon: 📦
    title: One dependency, all models
    details: "A Bndtools workspace library (-library: fennecEMFModels) and a Maven BOM pull in every model with correct versions. Cross-model dependencies are already wired."
    link: /guides/consuming
    linkText: How to consume
  - icon: 🔌
    title: OSGi-native
    details: Every bundle registers its EPackage through an EPackageConfigurator service with emf.name, emf.nsURI and a content fingerprint — discoverable at runtime, no manual registry calls.
    link: /guides/overview#what-a-model-bundle-contains
    linkText: What is inside
---

## About Fennec Common Models

Writing an EMF model for a standard that already has an XML Schema is
mechanical, repetitive work — and everybody does it again. This repository does
it once: it holds **40 model bundles**, each generated with
[Fennec EMF](https://github.com/eclipse-fennec/emf.osgi) from the official schema
of a published standard, with the generated Java checked in so consuming them
needs no code generation at all.

- **[Model catalog & origins](/guides/model-catalog)** — every module with its
  specification, namespace URI and the original schema it was generated from.
  Start here if you want to know *where a model comes from*.
- **[Consuming the models](/guides/consuming)** — the Bndtools workspace library,
  the Maven BOM, and how to get at an `EPackage` at runtime.
- **[Overview](/guides/overview)** — repository layout, what a model bundle
  contains, and how the code is generated.
- **[Adding a new model](/guides/adding-a-model)** — the checklist for
  contributing another standard.

Artifacts are published under the Maven group id `org.eclipse.fennec.models`
— releases on [Maven Central](https://repo1.maven.org/maven2/org/eclipse/fennec/models/),
snapshots on [Sonatype Central](https://central.sonatype.com/repository/maven-snapshots/org/eclipse/fennec/models/).

# DMTF CIM Schema 2.56.0

EMF model of the complete **DMTF Common Information Model (CIM) Schema 2.56.0** — the standard
model for systems, network and device management (DMTF [DSP0004](https://www.dmtf.org/dsp/DSP0004)).
Microsoft WMI (`root\cimv2`, `root\StandardCimv2`), SMI-S and SMASH/DASH are built on it.

## Source

`cim_schema_2.56.0/` is `cim_schema_2.56.0Final-MOFs.zip` from
<https://www.dmtf.org/standards/cim>, unpacked as published (1,651 files): the root file
`cim_schema_2.56.0.mof`, `qualifiers.mof`, `qualifiers_optional.mof` and one file per class in
`Core/`, `Device/`, `Network/`, …. The schema is published as **MOF** (Managed Object Format), not
as XML Schema. dmtf.org refuses scripted downloads, so the archive has to be fetched by hand.

Every file carries: *"Copyright (c) 2023 DMTF. All rights reserved. … DMTF specifications and
documents may be reproduced by members and non-members, provided that correct attribution is
given."*

## Derivation

`cim.ecore`, `prs.ecore` and `cim.genmodel` are written by `MofGenerator` from eclipse-fennec/emf.util
(bundle `org.eclipse.fennec.mof.ecore.generator`, around the importer `org.eclipse.fennec.mof.ecore`)
with [`regenerate.sh`](regenerate.sh). **No manual edits** — change the options in the script and
regenerate instead.

| Setting | Value | Why |
|---|---|---|
| Packages | `cim` (1,587 classes), `prs` (61 classes) | one package per CIM schema prefix: `CIM_…`, and `PRS_…` (Problem Resolution Schema, shipped with CIM; references CIM classes) |
| nsURI | `https://eclipse.org/fennec/model/dmtf/cim/2`, `…/prs/2` | CIM has no XML namespace. Major schema version only, so instances survive minor schema updates. (WS-CIM's `http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/<Class>` is one namespace per class and does not fit a package.) |
| Java packages | `org.dmtf.cim`, `org.dmtf.prs` | base package `org.dmtf` |
| `adapterFactory` | `false` | as for `org.hl7.fhir.model`: the generated `CimSwitch` over ≈ 1,600 classes exceeds the JVM's 64 KB method limit |

The mapping (from the emf.util MOF user guide):

- class names and property names are the exact CIM names (`CIM_EthernetPort.PermanentAddress`),
  so WMI / WBEM / WS-Management instances fit without renaming;
- superclass → `eSuperTypes`; `REF` properties → non-containment `EReference`s; methods →
  `EOperation`s (generated unimplemented);
- keys (class annotation `keys`, inherited keys first), property overrides (`override.<name>`)
  and **all** qualifiers (`ValueMap`/`Values`, `Units`, `MaxLen`, …; arrays as JSON) are kept in
  the annotation `http://schemas.dmtf.org/wbem/cim`; `Description` becomes GenModel
  documentation. `org.eclipse.fennec.mof.ecore.MofAnnotations` reads them back;
- `uint8/16` and `sint8/16/32` → `EIntegerObject`, `uint32/64` and `sint64` → `ELongObject` (object
  types, so "not set" stays apart from 0), `datetime` → `EString`.

## Regenerating

For a new schema version: replace `cim_schema_2.56.0/` with the unpacked new archive, adjust the
entry file in `regenerate.sh` and `Bundle-Version` in `bnd.bnd`, then:

```bash
bash model/regenerate.sh           # .ecore + .genmodel (same input → byte-identical output)
# uncomment -generate in bnd.bnd
./gradlew :org.dmtf.cim.model:generate
# comment -generate out again
./gradlew :org.dmtf.cim.model:build
```

Loading `CimPackage` takes a few seconds: the package is initialised from ≈ 1,600 classes with
their annotations.

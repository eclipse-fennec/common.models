# Updating the OSCAL model

`model/oscal.ecore` is not the raw output of the EMF XSD importer. Two scripts post-process it,
so that a new OSCAL release can go through the same steps and produce the same model shape.

| Script | What it does |
|---|---|
| `cleanup_oscal_ecore.py` | Merges the ~190 anonymous markup clones (`RemarksTypeN`, `TitleTypeN`, …) into `MarkupMultilineDatatype` / `MarkupLineDatatype`, removes unused markup FIELD classes, renames the Metaschema classes (`OscalCatalogControlASSEMBLY` → `Control`) and the inline types (`PartyType` → `Party`). Updates the genmodel to match. |
| `annotate_json_keys.py` | Adds the OSCAL JSON property names as fennec codec annotations (`http://eclipse.org/fennec/codec`, key `key`) wherever they differ from the XML names, e.g. `prop` → `props`, `associated-risk` → `related-risks`. |

Both scripts change only class names, types and annotations. XML names stay in `ExtendedMetaData`, so XML read and written through `XMLResource` is unchanged. They need Python 3.9 or later and use only the standard library.

## Steps for a new OSCAL release

1. **Download** the XSD and JSON Schema of the release:
   ```bash
   gh release download v<version> -R usnistgov/OSCAL \
     -p oscal_complete_schema.xsd -p oscal_complete_schema.json
   ```
   Replace `model/xsd/oscal_complete_schema.xsd`. The JSON Schema is only an input for step 4 and is not committed. Check whether `LICENSE.md` of the release has changed (`model/xsd/LICENSE-NIST-OSCAL.md`).
2. **Import** the XSD with the EMF XSD importer (*EMF Generator Model → XML Schema*), into `model/oscal.ecore` and `model/oscal.genmodel`. In the genmodel set:
   - `basePackage="gov.nist.csrc.ns"`
   - `copyrightText` to the EPL-2.0 header used by the other genmodels in this repository
3. **Clean up.** The script expects the files exactly as the importer wrote them, so do not run it twice on the same files.
   ```bash
   python3 tools/cleanup_oscal_ecore.py model/oscal.ecore model/oscal.genmodel
   ```
   If OSCAL introduced a new numbered or clashing inline type, the script stops and names it. Add the name to `TYPE_NAMES` in the script, then start again from step 2.
4. **Annotate** the JSON names. This step is idempotent.
   ```bash
   python3 tools/annotate_json_keys.py model/oscal.ecore <path>/oscal_complete_schema.json
   ```
   It prints the features it could not match. Expected are the markup features (`p`, `ul`, `em`, …), `Revisions.revision` and `Combine.method`; see below.
5. **Regenerate.** Uncomment the `-generate` block in `bnd.bnd`, delete `src/gov` (the generator does not remove classes that no longer exist), run `./gradlew :gov.nist.oscal.model:build`, then comment the block out again.
6. **Review** the diff of `model/oscal.ecore`, update `Bundle-Version` / `Bundle-Description` in `bnd.bnd` and the version in `NOTICE.md` and `readme.md`.

## Not handled here

These are JSON-specific shapes that the Ecore cannot express. The OSCAL codec handles them (eclipse-fennec/emf.codec#248, #250):

- **Markup** is structured in XML and a Markdown string in JSON. In `Part`, `AssessmentPart` and `ParameterGuideline`, the block elements map to the single JSON key `prose`.
- **`metadata/revisions`** is a wrapper element in XML (`<revisions><revision/>…`) but a plain array in JSON.
- **`combine/@method`** exists in the XSD but not in the JSON Schema (1.2.3).

# Updating the OSCAL model

`model/oscal.ecore` is not the raw output of the EMF XSD importer. Two scripts post-process it,
so that a new OSCAL release can go through the same steps and produce the same model shape.

| Script | What it does |
|---|---|
| `cleanup_oscal_ecore.py` | Merges the ~190 anonymous markup clones (`RemarksTypeN`, `TitleTypeN`, …) into `MarkupMultilineDatatype` / `MarkupLineDatatype`, removes unused markup FIELD classes, renames the Metaschema classes (`OscalCatalogControlASSEMBLY` → `Control`) and the inline types (`PartyType` → `Party`). Updates the genmodel to match. |
| `annotate_json_keys.py` | Adds the OSCAL JSON property names as fennec codec annotations (`http://eclipse.org/fennec/codec`, key `key`) wherever they differ from the XML names, e.g. `prop` → `props`, `associated-risk` → `related-risks`. |
| `json_shape_oscal_ecore.py` | Gives the model the shape of OSCAL JSON where XML and JSON differ: markup becomes a Markdown `String`, `Part`/`AssessmentPart`/`ParameterGuideline` get `prose`, the JSON value keys of FIELDs with flags (`identifier`, `number`, ...), `metadata/revisions` without wrapper, `DocumentRoot.schema` for `$schema`. Sorts classifiers and features into genmodel order (see below). |

The first two scripts change only class names, types and annotations; XML names stay in `ExtendedMetaData`. `json_shape_oscal_ecore.py` changes the structure: after it, the model reads and writes OSCAL JSON exactly (eclipse-fennec/emf.codec#248), but no longer OSCAL XML (markup is text, `revisions` has no wrapper element). The scripts need Python 3.9 or later and use only the standard library.

**Classifier and feature order.** The genmodel uses `loadInitialization`: the package is loaded from `oscal.ecore` at runtime, and a classifier or feature ID is its position in that file. The generator numbers classes, then enums, then data types, each in genmodel order, and features in genFeature order. The XSD importer writes the data types alphabetically between the classes, which puts every data type ID off; `json_shape_oscal_ecore.py` sorts the file into generator order, and the codec test `OscalModelIdsTest` checks all IDs against the generated constants.

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
5. **Shape for JSON.** Run once, on the output of step 4; it stops with a message if the genmodel and the Ecore disagree.
   ```bash
   python3 tools/json_shape_oscal_ecore.py model/oscal.ecore model/oscal.genmodel
   ```
6. **Regenerate.** Uncomment the `-generate` block in `bnd.bnd`, delete `src/gov` (the generator does not remove classes that no longer exist), run `./gradlew :gov.nist.oscal.model:build`, then comment the block out again.
7. **Review** the diff of `model/oscal.ecore`, update `Bundle-Version` / `Bundle-Description` in `bnd.bnd` and the version in `NOTICE.md` and `readme.md`.

## Not handled here

- **`combine/@method`** exists in the XSD but not in the JSON Schema (1.2.3). It stays in the model; OSCAL JSON never sets it.
- **`mappings`** of a mapping collection may be a single object or an array in OSCAL JSON. The model has a list; the codec reads a single object as a list of one and writes an array.
- **Markup conversion** between Markdown (JSON) and XHTML (XML) is out of scope.

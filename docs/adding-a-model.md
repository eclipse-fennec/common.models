# Adding a new model

Adding a standard means creating one bnd project, generating from its schema
once, and committing the generated code.

## 1. Name the module

Derive the module name from the schema's namespace URI, reversed, with `.model`
appended where that helps readability:

| Namespace URI | Module |
|---|---|
| `http://www.opengis.net/gml/3.2` | `net.opengis.gml3.model` |
| `http://docbook.org/ns/docbook` | `org.docbook.model` |
| `http://cyclonedx.org/schema/bom/1.6` | `org.cyclonedx.schema` |

The module name is also the Bundle-Symbolic-Name and the Maven artifact id.

## 2. Create the project

```
<module>/
├── bnd.bnd
├── model/                              # schema + ecore + genmodel
├── src-gen/                            # generated output
└── .settings/org.eclipse.jdt.core.prefs
```

Set Java compliance, source and target to `21` in
`.settings/org.eclipse.jdt.core.prefs`. Bndtools also needs `.project` and
`.classpath` for the module to show up in the IDE — copy them from a comparable
module and adjust the name.

No registration in `settings.gradle` is needed: every directory containing a
`bnd.bnd` becomes a Gradle subproject automatically.

## 3. Put the original schema in `model/`

Keep the schema **as published**, and keep the imports intact — the embedded
`schemaLocation` URLs are what makes a model's origin traceable later. If the
standard ships a versioned directory (as the OMG specifications do), mirror that
directory name.

Then record the origin in
[`docs/model-catalog.md`](/guides/model-catalog). If the derivation needed manual
intervention — schema edits, ignored parts, workarounds for the generator — add a
`model/README.md` in the module explaining it, as `org.w3.rdf.model`,
`de.xoev.familie` and `org.emau.icmvc.ganimed.ttp.cm2` do.

## 4. `bnd.bnd`

```bnd
-library: enableEMF

src: src-gen

-generate:\
	model/example.genmodel;\
		generate=fennecEMF;\
		genmodel=model/example.genmodel;\
		output=src-gen

-includeresource.model: model=model

Bundle-Version: <spec-version>.SNAPSHOT

-buildpath: \
	org.osgi.service.condition;version=latest
```

- `-includeresource.model` ships the schema inside the bundle. Use the
  `.model` instruction namespace — a bare `-includeresource` makes bnd assume you
  are taking full control of the bundle contents and it will ignore the
  `@Export`/`@Version` annotations in the generated `package-info.java`.
- Cross-model dependencies go into `-buildpath` with `;version=snapshot`, so they
  resolve against the workspace rather than a released bundle.
- If the standard's schema imports a namespace that already has its own bundle
  here (XLink, Atom, SMIL, GML, DIN 91379, XOeV code lists), depend on that
  bundle instead of generating a second copy.

## 5. Versioning

`Bundle-Version` tracks the **specification** version, not a release counter:

| Standard | Bundle-Version |
|---|---|
| WFS 2.0 | `2.0.0.SNAPSHOT` |
| HL7 FHIR R5 | `5.0.0.SNAPSHOT` |
| XDOMEA 4.0 | `4.0.0.SNAPSHOT` |

If the standard has no version, use `1.0.0.SNAPSHOT`. Always keep the
`.SNAPSHOT` qualifier.

::: warning
`Bundle-Version` is set explicitly here *because* it must follow the
specification. That is the exception to the usual Fennec rule, where the
workspace library owns the version via `base-version`.
:::

## 6. Genmodel settings

Put the GenModel settings into the `.ecore` as a `GenModel` annotation on the
`EPackage`, so a genmodel re-import cannot lose them:

| Setting | Value |
|---|---|
| `complianceLevel` | `21.0` |
| `oSGiCompatible` | `true` |
| `basePackage` | the Java base package |
| `resource` | `XMI` or `XML` |
| `copyrightText` | the EPL-2.0 header — copy it verbatim from any existing module |

The `copyrightText` must be set in **both** the `.genmodel` and the `.ecore`
annotation. The genmodel value produces the file headers; the ecore value is what
a genmodel re-import reads back. If they disagree, regenerating silently reverts
the license headers.

## 7. Generate, then switch generation off

```bash
./gradlew :<module>:generate
./gradlew build
```

Then **comment the `-generate:` block out again** and commit the generated
sources. This is the committed state for every module in the repository.

`-generate` via fennecEMF almost always logs a
`java.net.MalformedURLException ("spec" is null)` — that is expected noise, not a
failure. What counts are `error:` lines and the final `BUILD` line.

## Regenerating an existing model

Because `-generate` is commented out everywhere, `./gradlew build` alone never
regenerates — so a new generator version does not reach the committed code by
itself. The full cycle:

1. Uncomment the `-generate:` block in the modules to regenerate.
2. `./gradlew generate` — then `./gradlew build`.
3. Comment the blocks out again, and check `git diff -- '*/bnd.bnd'` is empty.
4. Review the diff of generated code before committing.

Two traps seen in practice:

- **A change to the `.ecore` alone does not retrigger generation.** Gradle
  declares only the file named in `-generate` (the `.genmodel`) as a task input,
  and bnd's own staleness check compares source timestamps against the output
  directory. An ecore-only edit is invisible to both.
- **The generator clears the output directory first.** An aborted run therefore
  leaves the module half-generated and non-compiling. Check `git status` for
  unexpected deletions after regenerating.

## 8. Wire the module into the library and BOM

Add the module to the run-requires of
`org.eclipse.fennec.common.models.library/required.bndrun`:

```bnd
-runrequires: \
	bnd.identity;id='<module>',\
	…
```

Then resolve, which rewrites `-runbundles`:

```bash
./gradlew :org.eclipse.fennec.common.models.library:resolve
```

This single step is what puts the new model into **both** the Bndtools workspace
library and the Maven BOM.

## Checklist

- [ ] Original schema in `model/`, imports left intact
- [ ] Ecore + genmodel created, GenModel settings per §6 in both files
- [ ] EPL-2.0 `copyrightText` in `.genmodel` **and** `.ecore` annotation
- [ ] Code generated and committed
- [ ] `-generate:` block commented out again
- [ ] `Bundle-Version` matches the specification version
- [ ] Java 21 compliance in `.settings/org.eclipse.jdt.core.prefs`
- [ ] `-includeresource.model: model=model` present
- [ ] Shared namespaces reused via `-buildpath` instead of regenerated
- [ ] Module added to `required.bndrun` and resolved
- [ ] Origin documented in [`docs/model-catalog.md`](/guides/model-catalog); manual deviations in a `model/README.md`
- [ ] `./gradlew build` passes

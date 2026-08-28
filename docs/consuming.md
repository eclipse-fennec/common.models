# Consuming the models

All artifacts are published under the Maven group id
`org.eclipse.fennec.models`:

- **Releases** — [Maven Central](https://repo1.maven.org/maven2/org/eclipse/fennec/models/), built from `main`
- **Snapshots** — [Sonatype Central snapshots](https://central.sonatype.com/repository/maven-snapshots/org/eclipse/fennec/models/), built from `snapshot`

Pick a model's coordinates from the
[model catalog](/guides/model-catalog) — the module name *is* the artifact id and
the OSGi Bundle-Symbolic-Name.

## In a Bndtools workspace

A workspace library brings in every model with matching versions, so you do not
maintain 40 coordinates by hand.

Add the library artifact to your Maven index (e.g. `cnf/central.mvn`):

```
org.eclipse.fennec.models:org.eclipse.fennec.common.models.library:<version>
```

Then enable it in `cnf/build.bnd`:

```bnd
-library: fennecEMFModels
```

The models are now resolvable; put the ones you need on the buildpath of the
module that uses them:

```bnd
-buildpath: \
	net.opengis.gml3.model;version=latest,\
	org.w3.xlink.model;version=latest
```

## In Maven

Import the BOM, then declare dependencies without versions:

```xml
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>org.eclipse.fennec.models</groupId>
      <artifactId>org.eclipse.fennec.common.models.bom</artifactId>
      <version>${fennec.models.version}</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency>
  </dependencies>
</dependencyManagement>

<dependencies>
  <dependency>
    <groupId>org.eclipse.fennec.models</groupId>
    <artifactId>net.opengis.gml3.model</artifactId>
  </dependency>
</dependencies>
```

To consume snapshots, add the snapshot repository:

```xml
<repositories>
  <repository>
    <id>central-snapshots</id>
    <url>https://central.sonatype.com/repository/maven-snapshots/</url>
    <releases><enabled>false</enabled></releases>
    <snapshots><enabled>true</enabled></snapshots>
  </repository>
</repositories>
```

## Using a model at runtime

### With OSGi

Every model bundle registers its `EPackage` through an `EPackageConfigurator`
service. Inject what you need with a target filter on the service properties —
do **not** call `EPackage.Registry.INSTANCE` and do **not** construct a
`ResourceSetImpl` yourself:

```java
@Component
public class GmlReader {

    @Reference(target = "(emf.name=gml)")
    EPackage gmlPackage;

    @Reference
    ResourceSet resourceSet;   // provided by the Fennec EMF runtime

    public EObject read(URI uri) {
        Resource resource = resourceSet.createResource(uri);
        resource.load(null);
        return resource.getContents().get(0);
    }
}
```

Useful filter properties, all set by the generated configurator:

| Property | Example |
|---|---|
| `emf.name` | `gml` |
| `emf.nsURI` | `http://www.opengis.net/gml/3.2` |
| `emf.model.filext` | `gml` |
| `emf.model.contentType` | `application/gml+xml` |
| `emf.model.version` | `3.2` |
| `emf.fingerprint` | `fp1:…` — the content hash of the `.ecore` |

If a namespace URI can be live in more than one version in your system, filter on
`emf.fingerprint` rather than `emf.nsURI`. See
[the fingerprint section](/guides/overview#the-model-fingerprint).

The Fennec EMF runtime bundles come with the models transitively; the workspace
library's resolved `-runbundles` already contain
`org.eclipse.fennec.emf.osgi.component.minimal`.

### Without OSGi

On a flat classpath, initialise the package the usual EMF way and register the
resource factory for its file extension:

```java
GeoJsonPackage.eINSTANCE.eClass();   // force initialisation

ResourceSet rs = new ResourceSetImpl();
rs.getResourceFactoryRegistry()
  .getExtensionToFactoryMap()
  .put("geojson", new GeoJsonResourceFactoryImpl());
```

The generated `*ResourceFactoryImpl` and `*ResourceImpl` classes live in the
model's `util` package.

## Getting at the original schema

Each bundle ships its `model/` directory as a resource, so the schema the model
was generated from travels with the artifact:

```bash
unzip -l net.opengis.gml3.model.jar | grep 'model/'
```

That is also the fastest way to confirm which revision of a standard a given
bundle version corresponds to.

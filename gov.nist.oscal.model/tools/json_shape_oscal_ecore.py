# Copyright (c) 2026 Contributors to the Eclipse Foundation.
#
# This program and the accompanying materials are made
# available under the terms of the Eclipse Public License 2.0
# which is available at https://www.eclipse.org/legal/epl-2.0/
#
# SPDX-License-Identifier: EPL-2.0
#
# Contributors:
#   Data In Motion Consulting - initial implementation
"""Gives the Ecore the shape of OSCAL JSON where XML and JSON differ.

Run after annotate_json_keys.py. Changes:

1. Markup as Markdown string. MarkupLineDatatype and MarkupMultilineDatatype become EDataTypes
   (java.lang.String). Every feature of these types becomes an EAttribute. In JSON, markup is a
   Markdown string, and keeping it as that string is what makes a JSON round trip exact.
2. prose. Part, AssessmentPart and ParameterGuideline carry the block elements (p, ul, h1, ...)
   directly. They are replaced by one attribute `prose` of type MarkupMultilineDatatype.
3. Unused markup classes (InlineMarkup, MarkupList, ...) are removed.
4. Simple content. The value of a FIELD with flags (document-id, hash, telephone-number, ...) is
   ExtendedMetaData name ":0" in XML; its JSON value key is added as codec `key`.
5. metadata/revisions is a wrapper element in XML but an array in JSON. The Revisions wrapper
   class is removed and Metadata.revision holds the Revision list directly (JSON key `revisions`).
6. DocumentRoot gets a transient `schema` attribute for the JSON member `$schema`.
   XMLResource does not save transient features; the OSCAL codec reads and writes it.

After this the model no longer round-trips OSCAL XML exactly (markup is text, revisions has no
wrapper element). OSCAL XML is out of scope of eclipse-fennec/emf.codec#248.

Not idempotent: run it once on the output of annotate_json_keys.py.

Usage: json_shape_oscal_ecore.py <oscal.ecore> <oscal.genmodel>
"""
import sys, xml.etree.ElementTree as ET

X = '{http://www.w3.org/2001/XMLSchema-instance}type'
EMD = 'http:///org/eclipse/emf/ecore/util/ExtendedMetaData'
CODEC = 'http://eclipse.org/fennec/codec'
NS = {'xmi': 'http://www.omg.org/XMI', 'xsi': 'http://www.w3.org/2001/XMLSchema-instance',
      'ecore': 'http://www.eclipse.org/emf/2002/Ecore', 'genmodel': 'http://www.eclipse.org/emf/2002/GenModel'}
for p_, u_ in NS.items():
    ET.register_namespace(p_, u_)

MARKUP_TYPES = ('MarkupLineDatatype', 'MarkupMultilineDatatype')
PROSE_CLASSES = ('Part', 'AssessmentPart', 'ParameterGuideline')
# JSON value key of the simple content of a FIELD with flags (Metaschema json-value-key)
VALUE_KEYS = {'Base64': 'value', 'DocumentId': 'identifier', 'ExternalId': 'id', 'Hash': 'value',
              'SystemId': 'id', 'TelephoneNumber': 'number', 'ThreatId': 'id',
              'Coverage': 'target-coverage'}

tree = ET.parse(sys.argv[1]); eco = tree.getroot()
gen_tree = ET.parse(sys.argv[2]); gen = gen_tree.getroot()


def classifier(name):
    c = next((c for c in eco.findall('eClassifiers') if c.get('name') == name), None)
    if c is None:
        sys.exit('classifier not found: ' + name)
    return c


def md(e):
    return {d.get('key'): d.get('value') for a in e.findall('eAnnotations') if a.get('source') == EMD
            for d in a.findall('details')}


def annotation(e, source, details, index=None):
    a = ET.Element('eAnnotations', {'source': source})
    for k, v in details.items():
        ET.SubElement(a, 'details', {'key': k, 'value': v})
    if index is None:
        e.append(a)
    else:
        e.insert(index, a)
    return a


def set_codec_key(f, key):
    a = next((a for a in f.findall('eAnnotations') if a.get('source') == CODEC), None)
    if a is None:
        a = annotation(f, CODEC, {})
    d = next((d for d in a.findall('details') if d.get('key') == 'key'), None)
    if d is None:
        d = ET.SubElement(a, 'details', {'key': 'key'})
    d.set('value', key)


def type_name(f):
    return (f.get('eType') or '').split('#//')[-1]


# 1. markup classes -> EDataTypes
for name in MARKUP_TYPES:
    old = classifier(name)
    idx = list(eco).index(old)
    eco.remove(old)
    dt = ET.Element('eClassifiers', {X: 'ecore:EDataType', 'name': name, 'instanceClassName': 'java.lang.String'})
    annotation(dt, 'http://www.eclipse.org/emf/2002/GenModel', {'documentation':
        ('Markdown string (OSCAL %s). In OSCAL JSON, markup is a Markdown string; it is kept as that '
         'string so that a JSON round trip is exact.') % ('markup-line' if 'Line' in name else 'markup-multiline')})
    annotation(dt, EMD, {'name': name, 'baseType': 'http://www.eclipse.org/emf/2003/XMLType#string'})
    eco.insert(idx, dt)

markup_features = 0
for c in eco.findall('eClassifiers'):
    for f in c.findall('eStructuralFeatures'):
        if type_name(f) in MARKUP_TYPES and f.get(X) == 'ecore:EReference':
            f.set(X, 'ecore:EAttribute')
            for k in ('containment', 'resolveProxies'):
                f.attrib.pop(k, None)
            markup_features += 1

# 2. block elements -> prose
for name in PROSE_CLASSES:
    c = classifier(name)
    feats = c.findall('eStructuralFeatures')
    group = next(f for f in feats if md(f).get('kind') == 'group')
    gname = '#' + md(group)['name']
    idx = list(c).index(group)
    for f in feats:
        if f is group or md(f).get('group') == gname:
            c.remove(f)
    prose = ET.Element('eStructuralFeatures', {X: 'ecore:EAttribute', 'name': 'prose',
                                               'eType': '#//MarkupMultilineDatatype'})
    annotation(prose, 'http://www.eclipse.org/emf/2002/GenModel', {'documentation':
        'The prose of this part as a Markdown string (OSCAL JSON key prose).'})
    annotation(prose, EMD, {'kind': 'element', 'name': 'prose', 'namespace': '##targetNamespace'})
    c.insert(idx, prose)

# 4. simple content -> JSON value key
for name, key in VALUE_KEYS.items():
    f = next(f for f in classifier(name).findall('eStructuralFeatures') if md(f).get('kind') == 'simple')
    set_codec_key(f, key)

# 5. revisions without wrapper
metadata = classifier('Metadata')
rev = next(f for f in metadata.findall('eStructuralFeatures') if f.get('name') == 'revisions')
rev.set('name', 'revision'); rev.set('eType', '#//Revision'); rev.set('upperBound', '-1')
for a in rev.findall('eAnnotations'):
    if a.get('source') == EMD:
        next(d for d in a.findall('details') if d.get('key') == 'name').set('value', 'revision')
set_codec_key(rev, 'revisions')
# annotate_json_keys.py did not reach Revision behind the unmatched wrapper
for f in classifier('Revision').findall('eStructuralFeatures'):
    if f.get('name') in ('prop', 'link'):
        set_codec_key(f, f.get('name') + 's')
eco.remove(classifier('Revisions'))

# 6. $schema on the document root
root = classifier('DocumentRoot')
schema = ET.Element('eStructuralFeatures', {X: 'ecore:EAttribute', 'name': 'schema', 'transient': 'true',
                                            'eType': 'ecore:EDataType http://www.eclipse.org/emf/2002/Ecore#//EString'})
annotation(schema, 'http://www.eclipse.org/emf/2002/GenModel', {'documentation':
    'The JSON member $schema of an OSCAL JSON document. Transient, so XMLResource ignores it.'})
annotation(schema, CODEC, {'key': '$schema'})
root.append(schema)

# 3. remove the markup classes that no non-markup class reaches any more
def is_markup(n):
    return (n.startswith('Markup') or n == 'InlineMarkup' or n.startswith('AlignType')) and n not in MARKUP_TYPES

def uses(c):
    out = {s.split('#//')[-1] for s in (c.get('eSuperTypes') or '').split()}
    out |= {type_name(f) for f in c.findall('eStructuralFeatures')}
    return out

by_name = {c.get('name'): c for c in eco.findall('eClassifiers')}
reached = set(); todo = [n for n in by_name if not is_markup(n)]
while todo:
    n = todo.pop()
    if n in reached or n not in by_name:
        continue
    reached.add(n); todo.extend(uses(by_name[n]))
removed = sorted(n for n in by_name if is_markup(n) and n not in reached)
for n in removed:
    eco.remove(by_name[n])

# genmodel: drop GenClasses / GenDataTypes / GenEnums of removed or retyped classifiers
gone = set(removed) | {'Revisions'} | set(MARKUP_TYPES)
pkg = gen.find('genPackages')
for g in list(pkg):
    ref = g.get('ecoreClass') or g.get('ecoreDataType') or g.get('ecoreEnum') or ''
    if ref.split('#//')[-1] in gone:
        pkg.remove(g)
# new data types go where the generator expects them: sorted among the other data types
data_types = pkg.findall('genDataTypes')
for name in MARKUP_TYPES:
    new = ET.Element('genDataTypes', {'ecoreDataType': 'oscal.ecore#//' + name})
    after = [g for g in data_types if g.get('ecoreDataType').split('#//')[-1] < name]
    pkg.insert(list(pkg).index(after[-1]) + 1 if after else list(pkg).index(data_types[0]), new)
    data_types = pkg.findall('genDataTypes')
# GenFeatures of features that were removed, renamed or retyped
features = {(c.get('name'), f.get('name')): f for c in eco.findall('eClassifiers')
            for f in c.findall('eStructuralFeatures')}
for gc in pkg.findall('genClasses'):
    cname = gc.get('ecoreClass').split('#//')[-1]
    for gf in list(gc.findall('genFeatures')):
        fname = gf.get('ecoreFeature').split('/')[-1]
        f = features.get((cname, fname))
        if cname == 'Metadata' and fname == 'revisions':
            gf.set('ecoreFeature', gf.get('ecoreFeature').rsplit('/', 1)[0] + '/revision')
            gf.set('children', 'true'); gf.set('createChild', 'true'); gf.set('property', 'None')
        elif f is None:
            gc.remove(gf)
        elif f.get(X) == 'ecore:EAttribute' and type_name(f) in MARKUP_TYPES:
            for k in ('children', 'createChild', 'notify'):
                gf.attrib.pop(k, None)
            gf.set('ecoreFeature', 'ecore:EAttribute ' + gf.get('ecoreFeature').split(' ', 1)[-1])
            gf.attrib.pop('property', None)
            gf.set('createChild', 'false')
    if cname in PROSE_CLASSES:
        ET.SubElement(gc, 'genFeatures', {'createChild': 'false',
                                          'ecoreFeature': 'ecore:EAttribute oscal.ecore#//%s/prose' % cname})
    if cname == 'DocumentRoot':
        ET.SubElement(gc, 'genFeatures', {'createChild': 'false',
                                          'ecoreFeature': 'ecore:EAttribute oscal.ecore#//DocumentRoot/schema'})

# With loadInitialization the package is loaded from the .ecore, so a classifier ID is its index
# in the file. The generator numbers classes, enums and data types in genmodel order; the file
# has to follow that order or every ID after a misplaced classifier is off.
order = [g.get('ecoreClass') or g.get('ecoreEnum') or g.get('ecoreDataType')
         for kind in ('genClasses', 'genEnums', 'genDataTypes') for g in pkg.findall(kind)]
order = [o.split('#//')[-1] for o in order]
classifiers = {c.get('name'): c for c in eco.findall('eClassifiers')}
if set(order) != set(classifiers):
    sys.exit('genmodel and ecore differ: %s' % sorted(set(order) ^ set(classifiers)))
first = list(eco).index(eco.find('eClassifiers'))
for c in classifiers.values():
    eco.remove(c)
for i, name in enumerate(order):
    eco.insert(first + i, classifiers[name])

# The same holds for feature IDs: genFeatures follow the order of the features in the class.
for gc in pkg.findall('genClasses'):
    cls = classifiers[gc.get('ecoreClass').split('#//')[-1]]
    index = {f.get('name'): i for i, f in enumerate(cls.findall('eStructuralFeatures'))}
    gfs = gc.findall('genFeatures')
    if set(index) != {gf.get('ecoreFeature').split('/')[-1] for gf in gfs}:
        sys.exit('genmodel and ecore features differ in ' + cls.get('name'))
    start = list(gc).index(gfs[0]) if gfs else 0
    for gf in gfs:
        gc.remove(gf)
    for i, gf in enumerate(sorted(gfs, key=lambda g: index[g.get('ecoreFeature').split('/')[-1]])):
        gc.insert(start + i, gf)


def write(t, r, path):
    ET.indent(t, '  ')
    text = ET.tostring(r, encoding='unicode')
    head, rest = text.split('>', 1)
    for p_, u_ in NS.items():
        if 'xmlns:%s=' % p_ not in head and (p_ + ':') in text:
            head += ' xmlns:%s="%s"' % (p_, u_)
    with open(path, 'w', encoding='UTF-8') as out:
        out.write('<?xml version="1.0" encoding="UTF-8"?>\n' + head + '>' + rest + '\n')


write(tree, eco, sys.argv[1])
write(gen_tree, gen, sys.argv[2])
print('markup features as attributes:', markup_features)
print('prose classes:', ', '.join(PROSE_CLASSES))
print('removed classifiers:', len(removed), ', '.join(sorted(removed)))

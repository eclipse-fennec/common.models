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

"""Cleans up the XSD-derived OSCAL Ecore and keeps the genmodel in sync.

1. Merges anonymous markup clones (RemarksTypeN, DescriptionTypeN, TitleTypeN, ...) into
   MarkupMultilineDatatype / MarkupLineDatatype; the clone's documentation moves to the feature.
2. Removes unreferenced, featureless markup FIELD classes.
3. Renames the Metaschema classes (OscalCatalogControlASSEMBLY -> Control, ...). Names that
   occur in several OSCAL models keep the model as prefix (CatalogGroup / ProfileGroup).
4. Renames the anonymous inline types (PartyType -> Party, StatusType1 -> SystemComponentStatus,
   ...), see TYPE_NAMES. A new numbered or clashing name in a later OSCAL release stops the
   script with a message naming the entry to add.
XML names stay in ExtendedMetaData, so XML serialisation is unchanged.

The script expects the Ecore and genmodel exactly as the EMF XSD importer wrote them; it is
not meant to run twice on the same files. Both files are rewritten in place.

Usage: cleanup_oscal_ecore.py <oscal.ecore> <oscal.genmodel>
"""
import re, sys, collections, xml.etree.ElementTree as ET

ECORE, GENMODEL = sys.argv[1], sys.argv[2]
NS = {'xmi': 'http://www.omg.org/XMI', 'xsi': 'http://www.w3.org/2001/XMLSchema-instance',
      'ecore': 'http://www.eclipse.org/emf/2002/Ecore', 'genmodel': 'http://www.eclipse.org/emf/2002/GenModel'}
for p, u in NS.items():
    ET.register_namespace(p, u)
X = '{%s}type' % NS['xsi']
EMD = 'http:///org/eclipse/emf/ecore/util/ExtendedMetaData'
GM = 'http://www.eclipse.org/emf/2002/GenModel'
ML, MM = 'MarkupLineDatatype', 'MarkupMultilineDatatype'


def write(tree, path):
    """ElementTree drops namespace declarations that are only used inside attribute values
    (e.g. ecoreFeature="ecore:EReference ..."), so declare every prefix EMF needs on the root."""
    ET.indent(tree, '  ')
    text = ET.tostring(tree.getroot(), encoding='unicode')
    head, rest = text.split('>', 1)
    for p, u in NS.items():
        if 'xmlns:%s=' % p not in head and (p + ':') in text:
            head += ' xmlns:%s="%s"' % (p, u)
    with open(path, 'w', encoding='UTF-8') as f:
        f.write('<?xml version="1.0" encoding="UTF-8"?>\n' + head + '>' + rest + '\n')

tree = ET.parse(ECORE); root = tree.getroot()
classes = {c.get('name'): c for c in root.findall('eClassifiers') if c.get(X) == 'ecore:EClass'}

def ann(e, src):
    return tuple((d.get('key'), d.get('value')) for a in e.findall('eAnnotations') if a.get('source') == src for d in a.findall('details'))
def emd(e): return dict(ann(e, EMD))
def doc_ann(e):
    return next((a for a in e.findall('eAnnotations') if a.get('source') == GM), None)
def feat_sig(c):
    return tuple((f.get(X), f.get('name'), f.get('eType'), f.get('lowerBound'), f.get('upperBound'),
                  f.get('containment'), ann(f, EMD)) for f in c.findall('eStructuralFeatures'))
def ref_name(v): return v.split('#//')[-1] if v else None

# --- 1. markup clones ------------------------------------------------------------
mm_sig = feat_sig(classes[MM])
merge = {}
for n, c in classes.items():
    if '_._type' not in (emd(c).get('name') or ''):
        continue
    sup, own = ref_name(c.get('eSuperTypes')), c.findall('eStructuralFeatures')
    if sup in (ML, MM) and not own:
        merge[n] = sup
    elif sup is None and feat_sig(c) == mm_sig and emd(c).get('kind') == emd(classes[MM]).get('kind'):
        merge[n] = MM

features = [(c, f) for c in root.findall('eClassifiers') for f in c.findall('eStructuralFeatures')]
moved_docs = 0
for owner, f in features:
    tgt = merge.get(ref_name(f.get('eType')))
    if not tgt:
        continue
    clone = classes[ref_name(f.get('eType'))]
    f.set('eType', '#//' + tgt)
    d = doc_ann(clone)
    if d is not None and doc_ann(f) is None:
        f.insert(0, d); moved_docs += 1

# --- 2. unreferenced featureless markup FIELD classes ----------------------------
used = {ref_name(f.get('eType')) for _, f in features} | \
       {ref_name(s) for c in classes.values() for s in (c.get('eSuperTypes') or '').split()}
drop = set(merge)
for n, c in classes.items():
    if n.endswith('FIELD') and n not in used and ref_name(c.get('eSuperTypes')) in (ML, MM) \
            and not c.findall('eStructuralFeatures'):
        drop.add(n)
for n in drop:
    root.remove(classes[n])

# --- 3. renames ------------------------------------------------------------------
MODULES = ['AssessmentCommon', 'ImplementationCommon', 'ControlCommon', 'MappingCommon',
           'ComponentDefinition', 'Metadata', 'Catalog', 'Profile', 'Mapping', 'Poam', 'Ssp', 'Ap', 'Ar']
SHORT = {'AssessmentCommon': 'Assessment', 'ImplementationCommon': 'Implementation', 'ControlCommon': 'Control',
         'MappingCommon': 'Mapping', 'ComponentDefinition': 'Component', 'Metadata': 'Metadata',
         'Catalog': 'Catalog', 'Profile': 'Profile', 'Mapping': 'Mapping', 'Poam': 'Poam', 'Ssp': 'Ssp',
         'Ap': 'AssessmentPlan', 'Ar': 'AssessmentResults'}
SPECIAL = {'Map': 'MapEntry'}   # avoid clashing with java.util.Map in generated code
remaining = [n for n in classes if n not in drop]
base = {}
for n in remaining:
    m = re.match(r'^Oscal(.+?)(ASSEMBLY|FIELD)$', n)
    if not m:
        continue
    body = m.group(1)
    mod = next(p for p in MODULES if body.startswith(p) and len(body) > len(p))
    base[n] = (mod, SPECIAL.get(body[len(mod):], body[len(mod):]))
counts = collections.Counter(b for _, b in base.values())
taken = {n for n in remaining if n not in base}
rename = {}
for n, (mod, b) in sorted(base.items()):
    new = b if counts[b] == 1 and b not in taken else (b if b.startswith(SHORT[mod]) else SHORT[mod] + b)
    assert new not in taken, (n, new)
    taken.add(new); rename[n] = new

# --- 4. anonymous inline types (PartyType, StatusType1, ...) ----------------------
# Default: drop the "Type" suffix. TYPE_NAMES holds the names that need context, because the
# XSD numbered them (StatusType / StatusType1), because they are markup internals, or because the
# plain name clashes with Java / EMF types used by the generated code. Keys are the names after
# step 3, so classes from step 3 can be adjusted here as well.
TYPE_NAMES = {
    # markup internals
    'InlineMarkupType': 'InlineMarkup', 'AnchorType': 'MarkupAnchor', 'BlockQuoteType': 'MarkupBlockQuote',
    'CodeType': 'MarkupCode', 'ImageType': 'MarkupImage', 'InsertType': 'MarkupInsert',
    'ListType': 'MarkupList', 'OrderedListType': 'MarkupOrderedList', 'ListItemType': 'MarkupListItem',
    'PreformattedType': 'MarkupPreformatted', 'TableType': 'MarkupTable', 'TableRowType': 'MarkupTableRow',
    'TableCellType': 'MarkupTableCell',
    # numbered by the XSD importer, named after their owner
    'EntryType': 'RiskLogEntry', 'EntryType1': 'AssessmentLogEntry',
    'LocalDefinitionsType': 'ResultLocalDefinitions', 'LocalDefinitionsType1': 'AssessmentResultsLocalDefinitions',
    'LocalDefinitionsType2': 'AssessmentPlanLocalDefinitions', 'LocalDefinitions': 'PoamLocalDefinitions',
    'StatusType': 'FindingTargetStatus', 'StatusType1': 'SystemComponentStatus', 'Status': 'SystemStatus',
    # plain name taken by another class or ambiguous without context
    'OriginType': 'PoamItemOrigin', 'SetParameterType': 'ProfileSetParameter',
    'SourceType': 'PlaceholderSource', 'TestType': 'ConstraintTest',
    # plain name clashes with org.eclipse.emf.ecore.resource.Resource
    'ResourceType': 'BackMatterResource',
}
RESERVED = {'Resource', 'List', 'Map', 'Object', 'String', 'Class', 'Package', 'Module', 'Record', 'System'}
step3 = [rename.get(n, n) for n in remaining]
rename4 = {}
for n in step3:
    new = TYPE_NAMES.get(n)
    if new is None and re.search(r'Type\d*$', n):
        assert not re.search(r'Type\d+$', n), f'numbered type {n} needs an entry in TYPE_NAMES'
        new = n[:-len('Type')]
    if new and new != n:
        assert new not in RESERVED, f'{n} -> {new} clashes with a Java/EMF type, add it to TYPE_NAMES'
        rename4[n] = new
final = set(step3) - set(rename4) | set(rename4.values())
assert len(final) == len(step3), 'type renames produce duplicate class names: ' + \
    str([k for k, v in collections.Counter([rename4.get(n, n) for n in step3]).items() if v > 1])
for n in remaining:
    n3 = rename.get(n, n)
    if n3 in rename4:
        rename[n] = rename4[n3]

def fix(v):
    if not v:
        return v
    return ' '.join(re.sub(r'#//([A-Za-z0-9_]+)', lambda m: '#//' + rename.get(m.group(1), m.group(1)), t) for t in v.split(' '))
for e in root.iter():
    if e.tag == 'eClassifiers' and e.get('name') in rename:
        e.set('name', rename[e.get('name')])
    for a in ('eType', 'eSuperTypes', 'eOpposite', 'eKeys'):
        if e.get(a):
            e.set(a, fix(e.get(a)))
write(tree, ECORE)

# --- genmodel --------------------------------------------------------------------
gtree = ET.parse(GENMODEL); groot = gtree.getroot()
for pkg in groot.iter('genPackages'):
    for gc in list(pkg.findall('genClasses')):
        if ref_name(gc.get('ecoreClass')) in drop:
            pkg.remove(gc)
def gfix(v):
    return re.sub(r'oscal\.ecore#//([A-Za-z0-9_]+)', lambda m: 'oscal.ecore#//' + rename.get(m.group(1), m.group(1)), v)
for e in groot.iter():
    for k, v in list(e.attrib.items()):
        if 'oscal.ecore#//' in v:
            e.set(k, gfix(v))
write(gtree, GENMODEL)

print(f'merged clones: {len(merge)} (docs moved: {moved_docs}), dropped FIELD classes: {len(drop) - len(merge)}, renamed: {len(rename)}')
print('classes left:', len([n for n in classes if n not in drop]))
for o, n in sorted(rename.items(), key=lambda x: x[1]):
    print(f'  {n:40} <- {o}')

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
"""Adds the OSCAL JSON property names to the Ecore as fennec codec annotations.

Walks the Ecore and the OSCAL JSON Schema of the same release in parallel, starting at the
document roots. Wherever the JSON key differs from the XML name (group-as plurals such as
prop -> props, or renames such as associated-risk -> related-risks), the feature gets
  <eAnnotations source="http://eclipse.org/fennec/codec"><details key="key" value="..."/></eAnnotations>
Run after cleanup_oscal_ecore.py. Idempotent.

Usage: annotate_json_keys.py <oscal.ecore> <oscal_complete_schema.json>
"""
import sys, json, re, collections, xml.etree.ElementTree as ET
X='{http://www.w3.org/2001/XMLSchema-instance}type'
EMD='http:///org/eclipse/emf/ecore/util/ExtendedMetaData'
NS = {'xmi': 'http://www.omg.org/XMI', 'xsi': 'http://www.w3.org/2001/XMLSchema-instance',
      'ecore': 'http://www.eclipse.org/emf/2002/Ecore'}
for p_, u_ in NS.items():
    ET.register_namespace(p_, u_)
tree=ET.parse(sys.argv[1]); eco=tree.getroot(); js=json.load(open(sys.argv[2]))
defs={}
for n,d in js['definitions'].items():
    defs['#/definitions/'+n]=d
    if '$id' in d: defs[d['$id']]=d
cls={c.get('name'):c for c in eco.findall('eClassifiers') if c.get(X)=='ecore:EClass'}
def md(e): return {d.get('key'):d.get('value') for a in e.findall('eAnnotations') if a.get('source')==EMD for d in a.findall('details')}
def deref(s):
    while isinstance(s,dict) and '$ref' in s: s=defs[s['$ref']]
    return s
def props(s, acc=None):
    acc={} if acc is None else acc; s=deref(s)
    if not isinstance(s,dict): return acc
    acc.update(s.get('properties',{}))
    for k in ('allOf','anyOf','oneOf'):
        for x in s.get(k,[]): props(x,acc)
    return acc
def item(s):
    s=deref(s)
    if isinstance(s,dict) and s.get('type')=='array': return deref(s['items'])
    return s
IRREGULAR = {'function-performed': 'functions-performed', 'associated-risk': 'related-risks',
             'assessment-task': 'tasks', 'response': 'remediations'}
def plural(n): return {n, n+'s', n+'es', n[:-1]+'ies' if n.endswith('y') else None, IRREGULAR.get(n)}
def feats(cname):
    out=[]; c=cls[cname]
    while c is not None:
        out+=c.findall('eStructuralFeatures')
        sup=c.get('eSuperTypes'); c=cls.get(sup.split('#//')[-1]) if sup else None
    return out
result=collections.defaultdict(set); unmatched=collections.defaultdict(set); seen=set()
def walk(cname, schema, path):
    key=(cname, json.dumps(schema,sort_keys=True)[:200])
    if key in seen: return
    seen.add(key)
    P=props(schema)
    for f in feats(cname):
        m=md(f); xn=m.get('name'); kind=m.get('kind')
        if kind not in ('element','attribute'): continue
        cand=[k for k in P if k in plural(xn)]
        if not cand:
            unmatched[(cname,f.get('name'),xn)].add(path); continue
        jk=cand[0]; result[(cname,f.get('name'),xn)].add(jk)
        et=(f.get('eType') or '').split('#//')[-1]
        if f.get(X)=='ecore:EReference' and et in cls: walk(et, item(P[jk]), path+'/'+jk)
root=cls['DocumentRoot']
for f in root.findall('eStructuralFeatures'):
    xn=md(f).get('name')
    if xn in js.get('properties',{}) or any(xn in props(o) for o in js.get('oneOf',[])):
        sch=next(props(o)[xn] for o in js['oneOf'] if xn in props(o))
        walk(f.get('eType').split('#//')[-1], sch, xn)
diff={k:v for k,v in result.items() if v!={k[2]}}
conflict={k:v for k,v in result.items() if len(v)>1}
print('matched features:',len(result),' differing JSON key:',len(diff),' conflicting:',len(conflict))
print('differing:', sorted(collections.Counter(f"{k[2]}->{next(iter(v))}" for k,v in diff.items()).items()))
print('unmatched:'); 
for k,v in sorted(unmatched.items()): print('  ',k, sorted(v)[:2])
CODEC = 'http://eclipse.org/fennec/codec'
fobj = {}
for c in cls.values():
    for f in c.findall('eStructuralFeatures'):
        fobj[(c.get('name'), f.get('name'))] = f
for (cname, fname, _), keys in diff.items():
    f = fobj[(cname, fname)]
    a = next((a for a in f.findall('eAnnotations') if a.get('source') == CODEC), None)
    if a is None:
        a = ET.SubElement(f, 'eAnnotations', {'source': CODEC})
    d = next((d for d in a.findall('details') if d.get('key') == 'key'), None)
    if d is None:
        d = ET.SubElement(a, 'details', {'key': 'key'})
    d.set('value', sorted(keys)[0])

ET.indent(tree, '  ')
text = ET.tostring(eco, encoding='unicode')
head, rest = text.split('>', 1)
for p_, u_ in NS.items():
    if 'xmlns:%s=' % p_ not in head and (p_ + ':') in text:
        head += ' xmlns:%s="%s"' % (p_, u_)
with open(sys.argv[1], 'w', encoding='UTF-8') as out:
    out.write('<?xml version="1.0" encoding="UTF-8"?>\n' + head + '>' + rest + '\n')
print('annotated features:', len(diff))

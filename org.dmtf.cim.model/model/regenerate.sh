#!/bin/bash
# Copyright (c) 2026 Contributors to the Eclipse Foundation.
#
# This program and the accompanying materials are made
# available under the terms of the Eclipse Public License 2.0
# which is available at https://www.eclipse.org/legal/epl-2.0/
#
# SPDX-License-Identifier: EPL-2.0
#
# Writes model/cim.ecore, model/prs.ecore and model/cim.genmodel from the DMTF MOF in
# model/cim_schema_<version>/ with eclipse-fennec/emf.util's MofGenerator. See model/README.md.
#
# The jars come from Maven (snapshots from central.sonatype.com). To use a local emf.util
# build instead, set MOF_GENERATOR_CP to a classpath holding org.eclipse.fennec.mof.ecore and
# org.eclipse.fennec.mof.ecore.generator.
set -euo pipefail
cd "$(dirname "$0")/.."

ENTRY=model/cim_schema_2.56.0/cim_schema_2.56.0.mof

M2="${M2_REPO:-$HOME/.m2/repository}"
SNAPSHOTS=https://central.sonatype.com/repository/maven-snapshots/
ARTIFACTS=(
  org.eclipse.fennec.util:org.eclipse.fennec.mof.ecore:1.0.0-SNAPSHOT
  org.eclipse.fennec.util:org.eclipse.fennec.mof.ecore.generator:1.0.0-SNAPSHOT
  org.eclipse.emf:org.eclipse.emf.common:2.46.0
  org.eclipse.emf:org.eclipse.emf.ecore:2.43.0
  org.eclipse.emf:org.eclipse.emf.ecore.xmi:2.41.0
  org.eclipse.emf:org.eclipse.emf.codegen.ecore:2.47.0
  org.eclipse.emf:org.eclipse.emf.codegen:2.29.0
)

SEP=":"; case "$(uname -s)" in MINGW*|MSYS*|CYGWIN*) SEP=";"; M2=$(cygpath -m "$M2");; esac
CP="${MOF_GENERATOR_CP:-}"
for a in "${ARTIFACTS[@]}"; do
  IFS=: read -r group artifact version <<< "$a"
  if [[ -n "${MOF_GENERATOR_CP:-}" && "$group" == org.eclipse.fennec.util ]]; then
    continue
  fi
  jar="$M2/${group//.//}/$artifact/$version/$artifact-$version.jar"
  if [[ ! -f "$jar" ]]; then
    mvn -q dependency:get -Dartifact="$a" -Dtransitive=false -DremoteRepositories="fennec-snapshots::::$SNAPSHOTS"
  fi
  CP="${CP:+$CP$SEP}$jar"
done

COPYRIGHT=$(mktemp)
trap 'rm -f "$COPYRIGHT"' EXIT
COPYRIGHT_ARG="$COPYRIGHT"; [[ "$SEP" == ";" ]] && COPYRIGHT_ARG=$(cygpath -m "$COPYRIGHT")
cat > "$COPYRIGHT" <<'EOF'
Copyright (c) 2026 Contributors to the Eclipse Foundation.

This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/

SPDX-License-Identifier: EPL-2.0

Contributors:
  Data In Motion Consulting - initial implementation
EOF

java -cp "$CP" org.eclipse.fennec.mof.ecore.generator.MofGenerator \
  --lower-case-packages \
  --ns-uri 'https://eclipse.org/fennec/model/dmtf/{package}/2' \
  --genmodel --model-name Cim --model-plugin org.dmtf.cim.model --base-package org.dmtf \
  --no-adapter-factory \
  --copyright "$COPYRIGHT_ARG" \
  "$ENTRY" model

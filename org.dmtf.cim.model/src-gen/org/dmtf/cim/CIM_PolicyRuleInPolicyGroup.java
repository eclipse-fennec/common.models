/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Policy Rule In Policy Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PolicySetComponent provides a more general mechanism for aggregating both PolicyGroups and PolicyRules and doing so with the priority value applying only to the aggregated set rather than policy wide. 
 * 
 * A relationship that aggregates one or more PolicyRules into a PolicyGroup. A PolicyGroup may aggregate PolicyRules and/or other PolicyGroups.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRuleInPolicyGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_PolicySetComponent\"]' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Policy' override.GroupComponent='CIM_PolicyGroup REF' override.GroupComponent.Deprecated='[\"CIM_PolicySetComponent.GroupComponent\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='A PolicyGroup that aggregates one or more PolicyRules.' override.PartComponent='CIM_PolicyRule REF' override.PartComponent.Deprecated='[\"CIM_PolicySetComponent.PartComponent\"]' override.PartComponent.Description='A PolicyRule aggregated by a PolicyGroup.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyRuleInPolicyGroup extends CIM_PolicyComponent {
} // CIM_PolicyRuleInPolicyGroup

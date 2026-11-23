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
 * A representation of the model object '<em><b>CIM Policy Group In Policy Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PolicySetComponent provides a more general mechanism for aggregating both PolicyGroups and PolicyRules and doing so with the priority value applying only to the aggregated set rather than policy wide. 
 * 
 * A relationship that aggregates one or more lower-level PolicyGroups into a higher-level Group. A Policy Group may aggregate PolicyRules and/or other Policy Groups.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyGroupInPolicyGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_PolicySetComponent\"]' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Policy' override.GroupComponent='CIM_PolicyGroup REF' override.GroupComponent.Deprecated='[\"CIM_PolicySetComponent.GroupComponent\"]' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='A PolicyGroup that aggregates other Groups.' override.PartComponent='CIM_PolicyGroup REF' override.PartComponent.Deprecated='[\"CIM_PolicySetComponent.PartComponent\"]' override.PartComponent.Description='A PolicyGroup aggregated by another Group.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyGroupInPolicyGroup extends CIM_PolicyComponent {
} // CIM_PolicyGroupInPolicyGroup

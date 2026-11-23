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
 * A representation of the model object '<em><b>CIM Policy Condition In Policy Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CompoundPolicyCondition aggregates zero or more instances of the PolicyCondition class, via the PolicyConditionInPolicyCondition association. A CompoundPolicyCondition that aggregates zero Conditions is not valid; it may, however, be in the process of being defined. Note that a CompoundPolicyCondition should have no effect until it is valid.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyConditionInPolicyCondition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Policy' override.GroupComponent='CIM_CompoundPolicyCondition REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='This property represents the CompoundPolicyCondition that contains one or more PolicyConditions.' override.PartComponent='CIM_PolicyCondition REF' override.PartComponent.Description='This property holds the name of a PolicyCondition contained by one or more PolicyRules.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyConditionInPolicyCondition extends CIM_PolicyConditionStructure {
} // CIM_PolicyConditionInPolicyCondition

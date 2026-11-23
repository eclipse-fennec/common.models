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
 * A representation of the model object '<em><b>CIM Packet Condition In SA Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PacketConditionInSARule aggregates an SARule with at least one instance of PacketFilterCondition. This is a specialization of the PolicyConditionInPolicyRule association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PacketConditionInSARule()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|SAConditionInRule\"]' override.GroupComponent='CIM_SARule REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='An SARule subclass of PolicyRule.' override.GroupComponent.MappingStrings='[\"IPSP Policy Model.IETF|SAConditionInRule.GroupComponent\"]' override.PartComponent='CIM_PacketFilterCondition REF' override.PartComponent.Min='1' override.PartComponent.Description='An SACondition that is required for the SARule.' override.PartComponent.MappingStrings='[\"IPSP Policy Model.IETF|SAConditionInRule.PartComponent\"]' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_PacketConditionInSARule extends CIM_PolicyConditionInPolicyRule {
} // CIM_PacketConditionInSARule

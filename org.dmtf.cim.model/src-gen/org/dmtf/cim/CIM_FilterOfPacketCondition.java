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
 * A representation of the model object '<em><b>CIM Filter Of Packet Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FilterOfPacketCondition associates a network traffic specification (i.e., a FilterList) with a PolicyRule's PacketFilterCondition.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FilterOfPacketCondition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Policy' MappingStrings='[\"IPSP Policy Model.IETF|FilterOfSACondition\"]' override.Antecedent='CIM_FilterList REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='A FilterList describes the traffic selected by the PacketFilterCondition. A PacketFilterCondition is associated with one and only one FilterList, but that filter list may aggregate many filter entries.' override.Antecedent.MappingStrings='[\"IPSP Policy Model.IETF|FilterOfSACondition.Antecedent\"]' override.Dependent='CIM_PacketFilterCondition REF' override.Dependent.Description='The PacketFilterCondition that uses the FilterList as part of a PolicyRule.' override.Dependent.MappingStrings='[\"IPSP Policy Model.IETF|FilterOfSACondition.Dependent\"]' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_FilterOfPacketCondition extends CIM_Dependency {
} // CIM_FilterOfPacketCondition

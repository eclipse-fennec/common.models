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
 * A representation of the model object '<em><b>CIM Switch Port Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association represents information regarding port pairings that is used by the SourceRoutingService of a switch.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortPair#getBridgeNum <em>Bridge Num</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchPortPair#getBridgeState <em>Bridge State</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortPair()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::SwitchingBridging' override.Antecedent='CIM_SwitchPort REF' override.Antecedent.Description='The lower numbered port.' override.Dependent='CIM_SwitchPort REF' override.Dependent.Description='The higher numbered port.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SwitchPortPair extends CIM_SAPSAPDependency {
	/**
	 * Returns the value of the '<em><b>Bridge Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A bridge number that uniquely identifies the path provided by this source routing bridge between the segments connected to high and low ports. The purpose of bridge number is to disambiguate between multiple paths connecting the same two LANs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bridge Num</em>' attribute.
	 * @see #setBridgeNum(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortPair_BridgeNum()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dPortPairBridgeNum\"]'"
	 * @generated
	 */
	Integer getBridgeNum();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortPair#getBridgeNum <em>Bridge Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridge Num</em>' attribute.
	 * @see #getBridgeNum()
	 * @generated
	 */
	void setBridgeNum(Integer value);

	/**
	 * Returns the value of the '<em><b>Bridge State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state of the pairing. Writing 'invalid(3)' to this property removes the association instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bridge State</em>' attribute.
	 * @see #setBridgeState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchPortPair_BridgeState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Enabled\",\"Disabled\",\"Invalid\"]' MappingStrings='[\"MIB.IETF|SOURCE-ROUTING-MIB.dot1dPortPairBridgeState\"]'"
	 * @generated
	 */
	Integer getBridgeState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchPortPair#getBridgeState <em>Bridge State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridge State</em>' attribute.
	 * @see #getBridgeState()
	 * @generated
	 */
	void setBridgeState(Integer value);

} // CIM_SwitchPortPair

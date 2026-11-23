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
 * A representation of the model object '<em><b>CIM Switch Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic switch (bridging) service class. Additional switching functions are incorporated as subordinate services related to this class via ServiceComponent associations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SwitchService#getBridgeAddress <em>Bridge Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchService#getNumPorts <em>Num Ports</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchService#getBridgeType <em>Bridge Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SwitchService#getBridgeAddressType <em>Bridge Address Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SwitchService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::SwitchingBridging' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_SwitchService extends CIM_ForwardingService {
	/**
	 * Returns the value of the '<em><b>Bridge Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address used by this SwitchService when it must be uniquely identified. For an ethernet bridge, the MAC Address serves as the BridgeAddress. When concatenated with a SpanningTreeService Priority, a unique bridge identifier results. The MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order according to RFC 2469. In other scenarios, like Ipv6, the address is formatted as "ffff:ffff:ffff:ffff".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bridge Address</em>' attribute.
	 * @see #setBridgeAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchService_BridgeAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='32' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dBaseBridgeAddress\"]' ModelCorrespondence='[\"CIM_SwitchService.BridgeAddressType\"]'"
	 * @generated
	 */
	String getBridgeAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchService#getBridgeAddress <em>Bridge Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridge Address</em>' attribute.
	 * @see #getBridgeAddress()
	 * @generated
	 */
	void setBridgeAddress(String value);

	/**
	 * Returns the value of the '<em><b>Num Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of switch ports controlled by this switching service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Ports</em>' attribute.
	 * @see #setNumPorts(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchService_NumPorts()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dBaseNumPorts\"]'"
	 * @generated
	 */
	Integer getNumPorts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchService#getNumPorts <em>Num Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Ports</em>' attribute.
	 * @see #getNumPorts()
	 * @generated
	 */
	void setNumPorts(Integer value);

	/**
	 * Returns the value of the '<em><b>Bridge Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what type of switching service can be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bridge Type</em>' attribute.
	 * @see #setBridgeType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchService_BridgeType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Transparent-only\",\"SourceRoute-only\",\"SRT\"]' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dBaseType\"]'"
	 * @generated
	 */
	Integer getBridgeType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchService#getBridgeType <em>Bridge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridge Type</em>' attribute.
	 * @see #getBridgeType()
	 * @generated
	 */
	void setBridgeType(Integer value);

	/**
	 * Returns the value of the '<em><b>Bridge Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BridgeAddressType defines the type of addressing scheme used for this Bridge and its BridgeAddress property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bridge Address Type</em>' attribute.
	 * @see #setBridgeAddressType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SwitchService_BridgeAddressType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"IPv4\",\"IPv6\",\"MAC\",\"MAC + Spanning Tree Priority\"]' ModelCorrespondence='[\"CIM_SwitchService.BridgeAddress\"]'"
	 * @generated
	 */
	Integer getBridgeAddressType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SwitchService#getBridgeAddressType <em>Bridge Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridge Address Type</em>' attribute.
	 * @see #getBridgeAddressType()
	 * @generated
	 */
	void setBridgeAddressType(Integer value);

} // CIM_SwitchService

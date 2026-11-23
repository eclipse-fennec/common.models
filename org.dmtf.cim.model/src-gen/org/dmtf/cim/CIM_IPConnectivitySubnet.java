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
 * A representation of the model object '<em><b>CIM IP Connectivity Subnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An IPConnectivitySubnet represents a group of related IPProtocolEndpoints that can communicate with each other, as members of a subnet. The class describes the characteristics of the subnet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPConnectivitySubnet#getSubnetNumber <em>Subnet Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPConnectivitySubnet#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPConnectivitySubnet#getPrefixLength <em>Prefix Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPConnectivitySubnet#getAddressType <em>Address Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPConnectivitySubnet()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::Collections' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_IPConnectivitySubnet extends CIM_ConnectivityCollection {
	/**
	 * Returns the value of the '<em><b>Subnet Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IP address of the entire subnet, formatted according to the appropriate convention as defined in the AddressType property of this class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subnet Number</em>' attribute.
	 * @see #setSubnetNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPConnectivitySubnet_SubnetNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IPConnectivitySubnet.AddressType\"]'"
	 * @generated
	 */
	String getSubnetNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPConnectivitySubnet#getSubnetNumber <em>Subnet Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Number</em>' attribute.
	 * @see #getSubnetNumber()
	 * @generated
	 */
	void setSubnetNumber(String value);

	/**
	 * Returns the value of the '<em><b>Subnet Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mask for the starting IPv4 address of the IP subnet, if needed (i.e., if the AddressType property is 1, "IPv4").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subnet Mask</em>' attribute.
	 * @see #setSubnetMask(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPConnectivitySubnet_SubnetMask()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSubnetMask();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPConnectivitySubnet#getSubnetMask <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Mask</em>' attribute.
	 * @see #getSubnetMask()
	 * @generated
	 */
	void setSubnetMask(String value);

	/**
	 * Returns the value of the '<em><b>Prefix Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The prefix length for IPv6 addresses in the IP subnet, if needed (i.e., if the AddressType property is 2, "IPv6").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix Length</em>' attribute.
	 * @see #setPrefixLength(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPConnectivitySubnet_PrefixLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getPrefixLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPConnectivitySubnet#getPrefixLength <em>Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix Length</em>' attribute.
	 * @see #getPrefixLength()
	 * @generated
	 */
	void setPrefixLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that describes the format of the address properties in IPConnectivitySubnet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Type</em>' attribute.
	 * @see #setAddressType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPConnectivitySubnet_AddressType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"IPv4\",\"IPv6\"]'"
	 * @generated
	 */
	Integer getAddressType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPConnectivitySubnet#getAddressType <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Type</em>' attribute.
	 * @see #getAddressType()
	 * @generated
	 */
	void setAddressType(Integer value);

} // CIM_IPConnectivitySubnet

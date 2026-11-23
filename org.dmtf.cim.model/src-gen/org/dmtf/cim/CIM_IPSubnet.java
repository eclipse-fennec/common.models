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
 * A representation of the model object '<em><b>CIM IP Subnet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An IPSubnet represents a group of related IPProtocolEndpoints that can communicate with each other directly using IP. It is used for describing the characteristics of the grouping. 
 * 
 * Since this class' superclass (LogicalNetwork) has been deprecated (in order to define more consistent 'collection' semantics), this class is also deprecated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPSubnet#getSubnetNumber <em>Subnet Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPSubnet#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPSubnet#getPrefixLength <em>Prefix Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPSubnet#getAddressType <em>Address Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPSubnet()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_IPConnectivitySubnet\"]' Version='2.7.0' UMLPackagePath='CIM::Network::Collections' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IPSubnet extends CIM_LogicalNetwork {
	/**
	 * Returns the value of the '<em><b>Subnet Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IP address of the entire subnet, formatted according to the appropriate convention as defined in the AddressType property of this class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subnet Number</em>' attribute.
	 * @see #setSubnetNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPSubnet_SubnetNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_IPConnectivitySubnet.SubnetNumber\"]'"
	 * @generated
	 */
	String getSubnetNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPSubnet#getSubnetNumber <em>Subnet Number</em>}' attribute.
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
	 * The mask for the starting IPv4 address of the IPSubnet, if needed (i.e., if the AddressType property is 1, "IPv4").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subnet Mask</em>' attribute.
	 * @see #setSubnetMask(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPSubnet_SubnetMask()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_IPConnectivitySubnet.SubnetMask\"]'"
	 * @generated
	 */
	String getSubnetMask();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPSubnet#getSubnetMask <em>Subnet Mask</em>}' attribute.
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
	 * The prefix length for IPv6 addresses in the IPSubnet, if needed (i.e., if the AddressType property is 2, "IPv6").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix Length</em>' attribute.
	 * @see #setPrefixLength(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPSubnet_PrefixLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Deprecated='[\"CIM_IPConnectivitySubnet.PrefixLength\"]'"
	 * @generated
	 */
	Integer getPrefixLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPSubnet#getPrefixLength <em>Prefix Length</em>}' attribute.
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
	 * An enumeration that describes the format of the address properties in IPSubnet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Type</em>' attribute.
	 * @see #setAddressType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPSubnet_AddressType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_IPConnectivitySubnet.AddressType\"]' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"IPv4\",\"IPv6\"]'"
	 * @generated
	 */
	Integer getAddressType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPSubnet#getAddressType <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Type</em>' attribute.
	 * @see #getAddressType()
	 * @generated
	 */
	void setAddressType(Integer value);

} // CIM_IPSubnet

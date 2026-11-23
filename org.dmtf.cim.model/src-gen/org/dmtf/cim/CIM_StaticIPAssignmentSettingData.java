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
 * A representation of the model object '<em><b>CIM Static IP Assignment Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_StaticIPAssignmentSettingData defines a basic IP configuration which could be statically assigned to an IPProtocolEndpoint. This class defines a partial configuration. Instances are aggregated into an instance of IPAssignmentSettingData which defines a full configuration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StaticIPAssignmentSettingData#getIPv4Address <em>IPv4 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StaticIPAssignmentSettingData#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StaticIPAssignmentSettingData#getGatewayIPv4Address <em>Gateway IPv4 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StaticIPAssignmentSettingData#getGatewayIPv6Address <em>Gateway IPv6 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StaticIPAssignmentSettingData#getIPv6Address <em>IPv6 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StaticIPAssignmentSettingData#getIPv6AddressType <em>IPv6 Address Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StaticIPAssignmentSettingData#getIPv6SubnetPrefixLength <em>IPv6 Subnet Prefix Length</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StaticIPAssignmentSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.27.0' UMLPackagePath='CIM::Network::IP' override.AddressOrigin='uint16' override.AddressOrigin.Description='AddressOrigin identifies the method by which the IP Address, Subnet Mask, and Gateway were assigned to the IPProtocolEndpoint. A value of 2 indicates that the application of the IPAssignmentSettingData instance does not affect these properties.' override.AddressOrigin.ValueMap='[\"0..2\",\"3\",\"4..32767\",\"32768..\"]' override.AddressOrigin.Values='[\"DMTF Reserved\",\"Static\",\"DMTF Reserved\",\"Vendor Reserved\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StaticIPAssignmentSettingData extends CIM_IPAssignmentSettingData {
	/**
	 * Returns the value of the '<em><b>IPv4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IPv4 address that will be assigned to the ProtocolEndpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IPv4 Address</em>' attribute.
	 * @see #setIPv4Address(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StaticIPAssignmentSettingData_IPv4Address()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true'"
	 * @generated
	 */
	String getIPv4Address();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StaticIPAssignmentSettingData#getIPv4Address <em>IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPv4 Address</em>' attribute.
	 * @see #getIPv4Address()
	 * @generated
	 */
	void setIPv4Address(String value);

	/**
	 * Returns the value of the '<em><b>Subnet Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subnet mask for the IPv4 address of this ProtocolEndpoint, if one is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subnet Mask</em>' attribute.
	 * @see #setSubnetMask(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StaticIPAssignmentSettingData_SubnetMask()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true'"
	 * @generated
	 */
	String getSubnetMask();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StaticIPAssignmentSettingData#getSubnetMask <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Mask</em>' attribute.
	 * @see #getSubnetMask()
	 * @generated
	 */
	void setSubnetMask(String value);

	/**
	 * Returns the value of the '<em><b>Gateway IPv4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IP v4 address of the default gateway.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gateway IPv4 Address</em>' attribute.
	 * @see #setGatewayIPv4Address(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StaticIPAssignmentSettingData_GatewayIPv4Address()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true'"
	 * @generated
	 */
	String getGatewayIPv4Address();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StaticIPAssignmentSettingData#getGatewayIPv4Address <em>Gateway IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway IPv4 Address</em>' attribute.
	 * @see #getGatewayIPv4Address()
	 * @generated
	 */
	void setGatewayIPv4Address(String value);

	/**
	 * Returns the value of the '<em><b>Gateway IPv6 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GatewayIPv6Address is used to identify the IPv6 address of the Gateway
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gateway IPv6 Address</em>' attribute.
	 * @see #setGatewayIPv6Address(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StaticIPAssignmentSettingData_GatewayIPv6Address()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true'"
	 * @generated
	 */
	String getGatewayIPv6Address();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StaticIPAssignmentSettingData#getGatewayIPv6Address <em>Gateway IPv6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway IPv6 Address</em>' attribute.
	 * @see #getGatewayIPv6Address()
	 * @generated
	 */
	void setGatewayIPv6Address(String value);

	/**
	 * Returns the value of the '<em><b>IPv6 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IPv6 address that this ProtocolEndpoint represents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IPv6 Address</em>' attribute.
	 * @see #setIPv6Address(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StaticIPAssignmentSettingData_IPv6Address()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_StaticIPAssignmentSettingData.IPv6AddressType\",\"CIM_StaticIPAssignmentSettingData.IPv6SubnetPrefixLength\"]'"
	 * @generated
	 */
	String getIPv6Address();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StaticIPAssignmentSettingData#getIPv6Address <em>IPv6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPv6 Address</em>' attribute.
	 * @see #getIPv6Address()
	 * @generated
	 */
	void setIPv6Address(String value);

	/**
	 * Returns the value of the '<em><b>IPv6 Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IPv6AddressType identifies the type of address found in the IPv6Address property of this class. The values of this property shall be interpreted according to RFC4291, Section 2.4
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IPv6 Address Type</em>' attribute.
	 * @see #setIPv6AddressType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StaticIPAssignmentSettingData_IPv6AddressType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"32768..65535\"]' Values='[\"Unspecified\",\"Loopback\",\"Multicast\",\"Link Local Unicast\",\"Global Unicast\",\"Embedded IPv4 Address\",\"Site Local Unicast\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_StaticIPAssignmentSettingData.IPv6AddressType\"]'"
	 * @generated
	 */
	Integer getIPv6AddressType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StaticIPAssignmentSettingData#getIPv6AddressType <em>IPv6 Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPv6 Address Type</em>' attribute.
	 * @see #getIPv6AddressType()
	 * @generated
	 */
	void setIPv6AddressType(Integer value);

	/**
	 * Returns the value of the '<em><b>IPv6 Subnet Prefix Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IPv6SubnetPrefixLength is used to identify the prefix length of the IPv6Address property that is used to specify a subnet
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IPv6 Subnet Prefix Length</em>' attribute.
	 * @see #setIPv6SubnetPrefixLength(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StaticIPAssignmentSettingData_IPv6SubnetPrefixLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ModelCorrespondence='[\"CIM_StaticIPAssignmentSettingData.IPv6Address\"]'"
	 * @generated
	 */
	Integer getIPv6SubnetPrefixLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StaticIPAssignmentSettingData#getIPv6SubnetPrefixLength <em>IPv6 Subnet Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPv6 Subnet Prefix Length</em>' attribute.
	 * @see #getIPv6SubnetPrefixLength()
	 * @generated
	 */
	void setIPv6SubnetPrefixLength(Integer value);

} // CIM_StaticIPAssignmentSettingData

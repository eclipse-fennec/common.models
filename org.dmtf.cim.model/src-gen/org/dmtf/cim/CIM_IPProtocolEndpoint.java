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
 * A representation of the model object '<em><b>CIM IP Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ProtocolEndpoint that is dedicated to running IP.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getIPv4Address <em>IPv4 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getIPv6Address <em>IPv6 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getAddress <em>Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getPrefixLength <em>Prefix Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getAddressType <em>Address Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getIPVersionSupport <em>IP Version Support</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getAddressOrigin <em>Address Origin</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getIPv6AddressType <em>IPv6 Address Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getIPv6SubnetPrefixLength <em>IPv6 Subnet Prefix Length</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPProtocolEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.35.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' override.ProtocolIFType='uint16' override.ProtocolIFType.Description='ProtocolIFType\'s enumeration is limited to IP-related and reserved values for this subclass of ProtocolEndpoint.' override.ProtocolIFType.ValueMap='[\"1\",\"225..4095\",\"4096\",\"4097\",\"4098\",\"4301..32767\",\"32768..\"]' override.ProtocolIFType.Values='[\"Other\",\"IANA Reserved\",\"IPv4\",\"IPv6\",\"IPv4/v6\",\"DMTF Reserved\",\"Vendor Reserved\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IPProtocolEndpoint extends CIM_ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>IPv4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IPv4 address that this ProtocolEndpoint represents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IPv4 Address</em>' attribute.
	 * @see #setIPv4Address(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPProtocolEndpoint_IPv4Address()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getIPv4Address();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getIPv4Address <em>IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPv4 Address</em>' attribute.
	 * @see #getIPv4Address()
	 * @generated
	 */
	void setIPv4Address(String value);

	/**
	 * Returns the value of the '<em><b>IPv6 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IPv6 address that this ProtocolEndpoint represents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IPv6 Address</em>' attribute.
	 * @see #setIPv6Address(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPProtocolEndpoint_IPv6Address()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IPProtocolEndpoint.IPv6AddressType\",\"CIM_IPProtocolEndpoint.IPv6SubnetPrefixLength\"]'"
	 * @generated
	 */
	String getIPv6Address();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getIPv6Address <em>IPv6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPv6 Address</em>' attribute.
	 * @see #getIPv6Address()
	 * @generated
	 */
	void setIPv6Address(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IP address that this ProtocolEndpoint represents, formatted according to the appropriate convention as defined in the AddressType property of this class (e.g., 171.79.6.40). This single property is deprecated to replace it by specific IPv4 and v6 addresses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPProtocolEndpoint_Address()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_IPProtocolEndpoint.IPv4Address\",\"CIM_IPProtocolEndpoint.IPv6Address\"]'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Subnet Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mask for the IPv4 address of this ProtocolEndpoint, if one is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subnet Mask</em>' attribute.
	 * @see #setSubnetMask(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPProtocolEndpoint_SubnetMask()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSubnetMask();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getSubnetMask <em>Subnet Mask</em>}' attribute.
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
	 * The prefix length for the IPv6 address of this Protocol Endpoint, if one is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefix Length</em>' attribute.
	 * @see #setPrefixLength(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPProtocolEndpoint_PrefixLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getPrefixLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getPrefixLength <em>Prefix Length</em>}' attribute.
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
	 * An enumeration that describes the format of the Address property. It is deprecated since it is not needed, as the class contains both IPv4 and v6 addresses).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Type</em>' attribute.
	 * @see #setAddressType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPProtocolEndpoint_AddressType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"IPv4\",\"IPv6\"]'"
	 * @generated
	 */
	Integer getAddressType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getAddressType <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Type</em>' attribute.
	 * @see #getAddressType()
	 * @generated
	 */
	void setAddressType(Integer value);

	/**
	 * Returns the value of the '<em><b>IP Version Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property explicitly defines support for different versions of the IP protocol, for this Endpoint. It is deprecated since the ProtocolIFType also provides this functionality by describing an endpoint as IPv4 only (value=4096), IPv6 only (value=4097), or IPv4/v6 (value=4098).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Version Support</em>' attribute.
	 * @see #setIPVersionSupport(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPProtocolEndpoint_IPVersionSupport()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_ProtocolEndpoint.ProtocolIFType\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"IPv4 Only\",\"IPv6 Only\",\"Both IPv4 and IPv6\"]'"
	 * @generated
	 */
	Integer getIPVersionSupport();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getIPVersionSupport <em>IP Version Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Version Support</em>' attribute.
	 * @see #getIPVersionSupport()
	 * @generated
	 */
	void setIPVersionSupport(Integer value);

	/**
	 * Returns the value of the '<em><b>Address Origin</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AddressOrigin identifies the method by which the IP Address, Subnet Mask, and Gateway were assigned to the IPProtocolEndpoint.A value of 3 "Static" shall indicate the values were assigned manually. A value of 4 "DHCP" shall indicate the values were assigned utilizing the Dynamic Host Configuration Protocol. See RFC 2131 and related. 
	 * A value of 5 "BOOTP" shall indicate the values were assigned utilizing BOOTP. See RFC 951 and related. 
	 * A value of 6 "IPv4 Link Local" shall indicate the values were assigned using the IPv4 Link Local protocol. See RFC 3927.
	 * A value of 7 "DHCPv6" shall indicate the values were assigned using DHCPv6. See RFC 3315. 
	 * A value of 8 "IPv6 AutoConfig" shall indicate the values were assinged using the IPv6 AutoConfig Protocol. See RFC 4862. 
	 * A value of 9 "Stateless" shall indicate Stateless values were assigned. 
	 * A value of 10 "Link Local" shall indicate Link Local values were assigned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Origin</em>' attribute.
	 * @see #setAddressOrigin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPProtocolEndpoint_AddressOrigin()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"Static\",\"DHCP\",\"BOOTP\",\"IPv4 Link Local\",\"DHCPv6\",\"IPv6AutoConfig\",\"Stateless\",\"Link Local\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getAddressOrigin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getAddressOrigin <em>Address Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Origin</em>' attribute.
	 * @see #getAddressOrigin()
	 * @generated
	 */
	void setAddressOrigin(Integer value);

	/**
	 * Returns the value of the '<em><b>IPv6 Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IPv6AddressType indentified the type of address found in the IPv6Address property. The values of this property shall be interpreted according to RFC4291, Section 2.4
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IPv6 Address Type</em>' attribute.
	 * @see #setIPv6AddressType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPProtocolEndpoint_IPv6AddressType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"32768..65535\"]' Values='[\"Unspecified\",\"Loopback\",\"Multicast\",\"Link Local Unicast\",\"Global Unicast\",\"Embedded IPv4 Address\",\"Site Local Unicast\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_IPProtocolEndpoint.IPv6Address\"]'"
	 * @generated
	 */
	Integer getIPv6AddressType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getIPv6AddressType <em>IPv6 Address Type</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_IPProtocolEndpoint_IPv6SubnetPrefixLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_IPProtocolEndpoint.IPv6Address\"]'"
	 * @generated
	 */
	Integer getIPv6SubnetPrefixLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPProtocolEndpoint#getIPv6SubnetPrefixLength <em>IPv6 Subnet Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPv6 Subnet Prefix Length</em>' attribute.
	 * @see #getIPv6SubnetPrefixLength()
	 * @generated
	 */
	void setIPv6SubnetPrefixLength(Integer value);

} // CIM_IPProtocolEndpoint

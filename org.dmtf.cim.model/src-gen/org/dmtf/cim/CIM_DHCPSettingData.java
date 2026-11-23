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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM DHCP Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the desired configuration settings for the DHCPProtocolEndpoint (i.e. DHCP client configuration.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DHCPSettingData#getRequestedIPv4Address <em>Requested IPv4 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DHCPSettingData#getRequestedLeaseTime <em>Requested Lease Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DHCPSettingData#getClientIdentifier <em>Client Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DHCPSettingData#getVendorClassIdentifier <em>Vendor Class Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DHCPSettingData#getRequestedOptions <em>Requested Options</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DHCPSettingData#getRequiredOptions <em>Required Options</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DHCPSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.32.0' UMLPackagePath='CIM::Network::DHCP' override.AddressOrigin='uint16' override.AddressOrigin.Description='AddressOrigin identifies the method by which the IP Address, Subnet Mask, and Gateway were assigned to the IPProtocolEndpoint. \nA value of 4 indicates that the values will be assigned via DHCP. See RFC 2131 and related. \nA value of 7 \"DHCPv6\" shall indicate the values will be assigned using DHCPv6. See RFC 3315.' override.AddressOrigin.ValueMap='[\"4\",\"7\",\"..\",\"32768..\"]' override.AddressOrigin.Values='[\"DHCP\",\"DHCPv6\",\"DMTF Reserved\",\"Vendor Reserved\"]' override.AddressOrigin.ModelCorrespondence='[\"CIM_IPProtocolEndpoint.AddressOrigin\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DHCPSettingData extends CIM_IPAssignmentSettingData {
	/**
	 * Returns the value of the '<em><b>Requested IPv4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A previously allocated IPv4 address for which the client is requesting re-allocation. This property is used in a client request (DHCPREQUEST) as the value of the ciaddr field. For AddressOrigin other than 4, this property shall be NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested IPv4 Address</em>' attribute.
	 * @see #setRequestedIPv4Address(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DHCPSettingData_RequestedIPv4Address()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"RFC1541.IETF|Section 3.2\"]' ModelCorrespondence='[\"CIM_IPProtocolEndpoint.IPv4Address\"]'"
	 * @generated
	 */
	String getRequestedIPv4Address();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DHCPSettingData#getRequestedIPv4Address <em>Requested IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested IPv4 Address</em>' attribute.
	 * @see #getRequestedIPv4Address()
	 * @generated
	 */
	void setRequestedIPv4Address(String value);

	/**
	 * Returns the value of the '<em><b>Requested Lease Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used in a client request (DHCPREQUEST) to allow the client to request a lease time for the IP address. The value shall be specified as an interval at a granularity of seconds. This value corresponds to the value for code 51 as defined in RFC2132.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Lease Time</em>' attribute.
	 * @see #setRequestedLeaseTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DHCPSettingData_RequestedLeaseTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' MappingStrings='[\"RFC2132.IETF|Section 9.2\"]' ModelCorrespondence='[\"CIM_DHCPProtocolEndpoint.LeaseTime\"]' PUnit='second'"
	 * @generated
	 */
	Long getRequestedLeaseTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DHCPSettingData#getRequestedLeaseTime <em>Requested Lease Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Lease Time</em>' attribute.
	 * @see #getRequestedLeaseTime()
	 * @generated
	 */
	void setRequestedLeaseTime(Long value);

	/**
	 * Returns the value of the '<em><b>Client Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used by DHCP clients to specify their unique identifier. DHCP servers use this value to index their database of address bindings. This value is expected to be unique for all clients in an administrative domain. This corresponds to DHCP Option Code 61 as defined in RFC2132. 
	 * While this value is an option and therefore could be expressed using the RequestedOption property, it differs from other properties in that it includes a value when specified from the client.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Identifier</em>' attribute.
	 * @see #setClientIdentifier(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DHCPSettingData_ClientIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' MappingStrings='[\"RFC2132.IETF|Section 9.14\"]'"
	 * @generated
	 */
	String getClientIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DHCPSettingData#getClientIdentifier <em>Client Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Identifier</em>' attribute.
	 * @see #getClientIdentifier()
	 * @generated
	 */
	void setClientIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Vendor Class Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used by DHCP clients to optionally identify the vendor type and configuration of a DHCP client. This corresponds to DHCP Option Code 60 as defined in RFC2132. While this is value is an option and therefore could be expressed using the RequestedOption property, it differs from other properties in that it includes a value when specified from the client.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Class Identifier</em>' attribute.
	 * @see #setVendorClassIdentifier(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DHCPSettingData_VendorClassIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' MappingStrings='[\"RFC2132.IETF|Section 9.13\"]'"
	 * @generated
	 */
	String getVendorClassIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DHCPSettingData#getVendorClassIdentifier <em>Vendor Class Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Class Identifier</em>' attribute.
	 * @see #getVendorClassIdentifier()
	 * @generated
	 */
	void setVendorClassIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Requested Options</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of requested DHCP options which the client is capable of interpreting but not necessarily required for the client to operate properly. This list of DHCP options is for IPv4.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Options</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DHCPSettingData_RequestedOptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82..83\",\"84\",\"85..118\",\"119\",\"120\",\"121..122\",\"123\",\"124..256\",\"257\",\"258..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Pad\",\"Subnet Mask\",\"Time Offset\",\"Router Option\",\"Time Server\",\"Name Server\",\"Domain Name Server\",\"Log Server\",\"Cookie Server\",\"LPR Server\",\"Impress Server\",\"Resource Location Server\",\"Host Name\",\"Boot File Size\",\"Merit Dump File\",\"Domain Name\",\"Swap Server\",\"Root Path\",\"Extensions Path\",\"IP Forwarding Enable/Disable\",\"Non-Local Source Routing Enable/Disable\",\"Policy Filter\",\"Maximum Datagram Reassembly Size\",\"Default IP Time-to-live\",\"Path MTU Aging Timeout\",\"Path MTU Plateau Table\",\"Interface MTU\",\"All Subnets are Local\",\"Broadcast Address\",\"Perform Subnet Mask Discovery\",\"Mask Supplier\",\"Perform Router Discovery\",\"Router Solicitation Address\",\"Static Route\",\"Trailer Encapsulation\",\"ARP Cache Timeout\",\"Ethernet Encapsulation\",\"TCP Default TTL\",\"TCP Keepalive Interval\",\"TCP Keepalive Garbage\",\"Network Information Service Domain\",\"Network Information Servers\",\"Network Time Protocol Servers\",\"Vendor Specific Information\",\"NetBIOS over TCP/IP Name Server\",\"NetBIOS over TCP/IP Datagram Distribution Server\",\"NetBIOS over TCP/IP Node Type\",\"NetBIOS over TCP/IP Scope\",\"X Window System Font Server\",\"X Window System Display Manager\",\"Requested IP Address\",\"Lease Time\",\"Option Overload\",\"Message Type\",\"Server Identifier\",\"Parameter Request List\",\"Error Message\",\"Maximum Message Size\",\"Renewal (T1) Time\",\"Rebinding (T2) Time\",\"Vendor Class Identifier\",\"Client Identifier\",\"DMTF Reserved\",\"DMTF Reserved\",\"Network Information Service+ Domain\",\"Network Information Service+ Servers\",\"TFTP Server Name\",\"Bootfile Name\",\"Mobile IP Home Agent\",\"Simple Mail Transport Protocol (SMTP) Server\",\"Post Office Protocol (POP3) Server\",\"Network News Transport Protocol (NNTP) Server\",\"Default World Wide Web (WWW) Server\",\"Default Finger Server\",\"Default Internet Relay Chat (IRC) Server\",\"StreetTalk Server\",\"StreetTalk Directory Assistance (STDA) Server\",\"User Class\",\"SLP Directory Agent\",\"SLP Service Scope\",\"DMTF Reserved\",\"Relay Agent Information\",\"DMTF Reserved\",\"Name Service Search\",\"Subnet Selection\",\"DMTF Reserved\",\"Classless Route\",\"DMTF Reserved\",\"End\",\"DMTF Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"RFC2132.IETF\",\"RFC2937.IETF\",\"RFC3011.IETF\",\"RFC3046.IETF\",\"RFC3004.IETF\",\"RFC2610.IETF\",\"RFC3442.IETF\"]' ModelCorrespondence='[\"CIM_DHCPProtocolEndpoint.OptionsReceived\"]'"
	 * @generated
	 */
	EList<Integer> getRequestedOptions();

	/**
	 * Returns the value of the '<em><b>Required Options</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of DHCP options required for the client to operate properly. This list of DHCP options is for IPv4.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Options</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DHCPSettingData_RequiredOptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82..83\",\"84\",\"85..118\",\"119\",\"120\",\"121..122\",\"123\",\"124..256\",\"257\",\"258..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Pad\",\"Subnet Mask\",\"Time Offset\",\"Router Option\",\"Time Server\",\"Name Server\",\"Domain Name Server\",\"Log Server\",\"Cookie Server\",\"LPR Server\",\"Impress Server\",\"Resource Location Server\",\"Host Name\",\"Boot File Size\",\"Merit Dump File\",\"Domain Name\",\"Swap Server\",\"Root Path\",\"Extensions Path\",\"IP Forwarding Enable/Disable\",\"Non-Local Source Routing Enable/Disable\",\"Policy Filter\",\"Maximum Datagram Reassembly Size\",\"Default IP Time-to-live\",\"Path MTU Aging Timeout\",\"Path MTU Plateau Table\",\"Interface MTU\",\"All Subnets are Local\",\"Broadcast Address\",\"Perform Subnet Mask Discovery\",\"Mask Supplier\",\"Perform Router Discovery\",\"Router Solicitation Address\",\"Static Route\",\"Trailer Encapsulation\",\"ARP Cache Timeout\",\"Ethernet Encapsulation\",\"TCP Default TTL\",\"TCP Keepalive Interval\",\"TCP Keepalive Garbage\",\"Network Information Service Domain\",\"Network Information Servers\",\"Network Time Protocol Servers\",\"Vendor Specific Information\",\"NetBIOS over TCP/IP Name Server\",\"NetBIOS over TCP/IP Datagram Distribution Server\",\"NetBIOS over TCP/IP Node Type\",\"NetBIOS over TCP/IP Scope\",\"X Window System Font Server\",\"X Window System Display Manager\",\"Requested IP Address\",\"Lease Time\",\"Option Overload\",\"Message Type\",\"Server Identifier\",\"Parameter Request List\",\"Error Message\",\"Maximum Message Size\",\"Renewal (T1) Time\",\"Rebinding (T2) Time\",\"Vendor Class Identifier\",\"Client Identifier\",\"DMTF Reserved\",\"DMTF Reserved\",\"Network Information Service+ Domain\",\"Network Information Service+ Servers\",\"TFTP Server Name\",\"Bootfile Name\",\"Mobile IP Home Agent\",\"Simple Mail Transport Protocol (SMTP) Server\",\"Post Office Protocol (POP3) Server\",\"Network News Transport Protocol (NNTP) Server\",\"Default World Wide Web (WWW) Server\",\"Default Finger Server\",\"Default Internet Relay Chat (IRC) Server\",\"StreetTalk Server\",\"StreetTalk Directory Assistance (STDA) Server\",\"User Class\",\"SLP Directory Agent\",\"SLP Service Scope\",\"DMTF Reserved\",\"Relay Agent Information\",\"DMTF Reserved\",\"Name Service Search\",\"Subnet Selection\",\"DMTF Reserved\",\"Classless Route\",\"DMTF Reserved\",\"End\",\"DMTF Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"RFC2132.IETF\",\"RFC2937.IETF\",\"RFC3011.IETF\",\"RFC3046.IETF\",\"RFC3004.IETF\",\"RFC2610.IETF\",\"RFC3442.IETF\"]' ModelCorrespondence='[\"CIM_DHCPProtocolEndpoint.OptionsReceived\"]'"
	 * @generated
	 */
	EList<Integer> getRequiredOptions();

} // CIM_DHCPSettingData

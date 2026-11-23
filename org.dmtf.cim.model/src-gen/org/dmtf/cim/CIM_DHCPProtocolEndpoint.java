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
 * A representation of the model object '<em><b>CIM DHCP Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from ProtocolEndpoint representing the configuration of a DHCP client. The configuration information contained by this ProtocolEndpoint is the current configuration obtained/received from a DHCP server. An instance of CIM_RemoteAccessAvailableToElement is used to relate the DHCPProtocolEndpoint to the RemoteServiceAccessPoint which represents the DHCP server. An EndpointIdentity association from the DHCPProtocolEndpoint to an IPProtocolEndpoint is established.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DHCPProtocolEndpoint#getClientState <em>Client State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DHCPProtocolEndpoint#getRenewalTime <em>Renewal Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DHCPProtocolEndpoint#getRebindingTime <em>Rebinding Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DHCPProtocolEndpoint#getLeaseTime <em>Lease Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DHCPProtocolEndpoint#getLeaseObtained <em>Lease Obtained</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DHCPProtocolEndpoint#getLeaseExpires <em>Lease Expires</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DHCPProtocolEndpoint#getOptionsReceived <em>Options Received</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DHCPProtocolEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.19.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_DHCPProtocolEndpoint extends CIM_ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Client State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClientState represents the current state of the DHCP client. See RFC1541 for more information on the meaning of each state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client State</em>' attribute.
	 * @see #setClientState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DHCPProtocolEndpoint_ClientState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"DMTF Reserved\",\"Init\",\"Selecting\",\"Requesting\",\"Rebinding\",\"Init-Reboot\",\"Rebooting\",\"Bound\",\"DMTF Reserved\",\"Vendor Specified\"]' MappingStrings='[\"RFC1541.IETF|Section 4.4.1\"]'"
	 * @generated
	 */
	Integer getClientState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DHCPProtocolEndpoint#getClientState <em>Client State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client State</em>' attribute.
	 * @see #getClientState()
	 * @generated
	 */
	void setClientState(Integer value);

	/**
	 * Returns the value of the '<em><b>Renewal Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This option specifies the time interval from address assignment until the client transitions to the RENEWING state. This value corresponds to the value for code 58 as defined in RFC2132.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Renewal Time</em>' attribute.
	 * @see #setRenewalTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DHCPProtocolEndpoint_RenewalTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' MappingStrings='[\"RFC2132.IETF|Section 9.11\"]' PUnit='second'"
	 * @generated
	 */
	Long getRenewalTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DHCPProtocolEndpoint#getRenewalTime <em>Renewal Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renewal Time</em>' attribute.
	 * @see #getRenewalTime()
	 * @generated
	 */
	void setRenewalTime(Long value);

	/**
	 * Returns the value of the '<em><b>Rebinding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the time interval from address assignment until the client transitions to the REBINDING state. This value corresponds to the value for code 59 as defined in RFC2132.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rebinding Time</em>' attribute.
	 * @see #setRebindingTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DHCPProtocolEndpoint_RebindingTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' MappingStrings='[\"RFC2132.IETF|Section 9.12\"]' PUnit='second'"
	 * @generated
	 */
	Long getRebindingTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DHCPProtocolEndpoint#getRebindingTime <em>Rebinding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rebinding Time</em>' attribute.
	 * @see #getRebindingTime()
	 * @generated
	 */
	void setRebindingTime(Long value);

	/**
	 * Returns the value of the '<em><b>Lease Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used in a client request (DHCPDISCOVER or DHCPREQUEST) to allow the client to request a lease time for the IP address. In a server reply (DHCPOFFER), a DHCP server uses this option to specify the lease time it is willing to offer. This value corresponds to the value for code 51 as defined in RFC2132.or as specified in RFC3315, Section 9
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lease Time</em>' attribute.
	 * @see #setLeaseTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DHCPProtocolEndpoint_LeaseTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' MappingStrings='[\"RFC2132.IETF|Section 9.2\"]' PUnit='second'"
	 * @generated
	 */
	Long getLeaseTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DHCPProtocolEndpoint#getLeaseTime <em>Lease Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lease Time</em>' attribute.
	 * @see #getLeaseTime()
	 * @generated
	 */
	void setLeaseTime(Long value);

	/**
	 * Returns the value of the '<em><b>Lease Obtained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the time a DHCP lease was obtained by the client. There is no correlating value defined in RFC2132. This value is persisted by the client when it obtains a DHCP lease from a DHCP server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lease Obtained</em>' attribute.
	 * @see #setLeaseObtained(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DHCPProtocolEndpoint_LeaseObtained()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getLeaseObtained();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DHCPProtocolEndpoint#getLeaseObtained <em>Lease Obtained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lease Obtained</em>' attribute.
	 * @see #getLeaseObtained()
	 * @generated
	 */
	void setLeaseObtained(String value);

	/**
	 * Returns the value of the '<em><b>Lease Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the time a DHCP lease will expire. There is no correlating value defined in RFC2132. This value is calculated by the client by adding the interval specified in LeaseTime to the value of LeaseObtained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lease Expires</em>' attribute.
	 * @see #setLeaseExpires(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DHCPProtocolEndpoint_LeaseExpires()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getLeaseExpires();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DHCPProtocolEndpoint#getLeaseExpires <em>Lease Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lease Expires</em>' attribute.
	 * @see #getLeaseExpires()
	 * @generated
	 */
	void setLeaseExpires(String value);

	/**
	 * Returns the value of the '<em><b>Options Received</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more DHCP options received by the DHCP client. These may include: Subnet Mask, Default Router, DNS Server, etc. See the RFCs for a description of each option.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Options Received</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DHCPProtocolEndpoint_OptionsReceived()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82..83\",\"84\",\"85..118\",\"119\",\"120\",\"121..122\",\"123\",\"124..256\",\"257\",\"258..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Pad\",\"Subnet Mask\",\"Time Offset\",\"Router Option\",\"Time Server\",\"Name Server\",\"Domain Name Server\",\"Log Server\",\"Cookie Server\",\"LPR Server\",\"Impress Server\",\"Resource Location Server\",\"Host Name\",\"Boot File Size\",\"Merit Dump File\",\"Domain Name\",\"Swap Server\",\"Root Path\",\"Extensions Path\",\"IP Forwarding Enable/Disable\",\"Non-Local Source Routing Enable/Disable\",\"Policy Filter\",\"Maximum Datagram Reassembly Size\",\"Default IP Time-to-live\",\"Path MTU Aging Timeout\",\"Path MTU Plateau Table\",\"Interface MTU\",\"All Subnets are Local\",\"Broadcast Address\",\"Perform Subnet Mask Discovery\",\"Mask Supplier\",\"Perform Router Discovery\",\"Router Solicitation Address\",\"Static Route\",\"Trailer Encapsulation\",\"ARP Cache Timeout\",\"Ethernet Encapsulation\",\"TCP Default TTL\",\"TCP Keepalive Interval\",\"TCP Keepalive Garbage\",\"Network Information Service Domain\",\"Network Information Servers\",\"Network Time Protocol Servers\",\"Vendor Specific Information\",\"NetBIOS over TCP/IP Name Server\",\"NetBIOS over TCP/IP Datagram Distribution Server\",\"NetBIOS over TCP/IP Node Type\",\"NetBIOS over TCP/IP Scope\",\"X Window System Font Server\",\"X Window System Display Manager\",\"Requested IP Address\",\"Lease Time\",\"Option Overload\",\"Message Type\",\"Server Identifier\",\"Parameter Request List\",\"Error Message\",\"Maximum Message Size\",\"Renewal (T1) Time\",\"Rebinding (T2) Time\",\"Vendor Class Identifier\",\"Client Identifier\",\"DMTF Reserved\",\"DMTF Reserved\",\"Network Information Service+ Domain\",\"Network Information Service+ Servers\",\"TFTP Server Name\",\"Bootfile Name\",\"Mobile IP Home Agent\",\"Simple Mail Transport Protocol (SMTP) Server\",\"Post Office Protocol (POP3) Server\",\"Network News Transport Protocol (NNTP) Server\",\"Default World Wide Web (WWW) Server\",\"Default Finger Server\",\"Default Internet Relay Chat (IRC) Server\",\"StreetTalk Server\",\"StreetTalk Directory Assistance (STDA) Server\",\"User Class\",\"SLP Directory Agent\",\"SLP Service Scope\",\"DMTF Reserved\",\"Relay Agent Information\",\"DMTF Reserved\",\"Name Service Search\",\"Subnet Selection\",\"DMTF Reserved\",\"Classless Route\",\"DMTF Reserved\",\"End\",\"DMTF Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"RFC2132.IETF\",\"RFC2937.IETF\",\"RFC3011.IETF\",\"RFC3046.IETF\",\"RFC3004.IETF\",\"RFC2610.IETF\",\"RFC3442.IETF\"]'"
	 * @generated
	 */
	EList<Integer> getOptionsReceived();

} // CIM_DHCPProtocolEndpoint

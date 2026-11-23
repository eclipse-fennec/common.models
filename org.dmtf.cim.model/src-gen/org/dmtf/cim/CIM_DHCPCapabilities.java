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
 * A representation of the model object '<em><b>CIM DHCP Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from EnabledLogicalElementCapabilities representing the capabilities of a DHCP client.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DHCPCapabilities#getOptionsSupported <em>Options Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DHCPCapabilities#getIPv6OptionsSupported <em>IPv6 Options Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DHCPCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.27.0' UMLPackagePath='CIM::Network::DHCP' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DHCPCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Options Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more DHCP options supported by the DHCP client. These may include: Subnet Mask, Default Router, DNS Server, etc. See RFC2132 for a description of each option.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Options Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DHCPCapabilities_OptionsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82..83\",\"84\",\"85..118\",\"119\",\"120\",\"121..122\",\"123\",\"124..256\",\"257\",\"258..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Pad\",\"Subnet Mask\",\"Time Offset\",\"Router Option\",\"Time Server\",\"Name Server\",\"Domain Name Server\",\"Log Server\",\"Cookie Server\",\"LPR Server\",\"Impress Server\",\"Resource Location Server\",\"Host Name\",\"Boot File Size\",\"Merit Dump File\",\"Domain Name\",\"Swap Server\",\"Root Path\",\"Extensions Path\",\"IP Forwarding Enable/Disable\",\"Non-Local Source Routing Enable/Disable\",\"Policy Filter\",\"Maximum Datagram Reassembly Size\",\"Default IP Time-to-live\",\"Path MTU Aging Timeout\",\"Path MTU Plateau Table\",\"Interface MTU\",\"All Subnets are Local\",\"Broadcast Address\",\"Perform Subnet Mask Discovery\",\"Mask Supplier\",\"Perform Router Discovery\",\"Router Solicitation Address\",\"Static Route\",\"Trailer Encapsulation\",\"ARP Cache Timeout\",\"Ethernet Encapsulation\",\"TCP Default TTL\",\"TCP Keepalive Interval\",\"TCP Keepalive Garbage\",\"Network Information Service Domain\",\"Network Information Servers\",\"Network Time Protocol Servers\",\"Vendor Specific Information\",\"NetBIOS over TCP/IP Name Server\",\"NetBIOS over TCP/IP Datagram Distribution Server\",\"NetBIOS over TCP/IP Node Type\",\"NetBIOS over TCP/IP Scope\",\"X Window System Font Server\",\"X Window System Display Manager\",\"Requested IP Address\",\"Lease Time\",\"Option Overload\",\"Message Type\",\"Server Identifier\",\"Parameter Request List\",\"Error Message\",\"Maximum Message Size\",\"Renewal (T1) Time\",\"Rebinding (T2) Time\",\"Vendor Class Identifier\",\"Client Identifier\",\"DMTF Reserved\",\"DMTF Reserved\",\"Network Information Service+ Domain\",\"Network Information Service+ Servers\",\"TFTP Server Name\",\"Bootfile Name\",\"Mobile IP Home Agent\",\"Simple Mail Transport Protocol (SMTP) Server\",\"Post Office Protocol (POP3) Server\",\"Network News Transport Protocol (NNTP) Server\",\"Default World Wide Web (WWW) Server\",\"Default Finger Server\",\"Default Internet Relay Chat (IRC) Server\",\"StreetTalk Server\",\"StreetTalk Directory Assistance (STDA) Server\",\"User Class\",\"SLP Directory Agent\",\"SLP Service Scope\",\"DMTF Reserved\",\"Relay Agent Information\",\"DMTF Reserved\",\"Name Service Search\",\"Subnet Selection\",\"DMTF Reserved\",\"Classless Route\",\"DMTF Reserved\",\"End\",\"DMTF Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"RFC2132.IETF\",\"RFC2937.IETF\",\"RFC3011.IETF\",\"RFC3046.IETF\",\"RFC3004.IETF\",\"RFC2610.IETF\",\"RFC3442.IETF\"]' ModelCorrespondence='[\"CIM_DHCPProtocolEndpoint.OptionsReceived\"]'"
	 * @generated
	 */
	EList<Integer> getOptionsSupported();

	/**
	 * Returns the value of the '<em><b>IPv6 Options Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more DHCP option opcodes supported by the DHCP client for IPv6. 
	 * The values of this property shall be the option-codes specified 
	 * in RFC3315, Section 22.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IPv6 Options Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DHCPCapabilities_IPv6OptionsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' MappingStrings='[\"RFC3315.IETF\"]'"
	 * @generated
	 */
	EList<Integer> getIPv6OptionsSupported();

} // CIM_DHCPCapabilities

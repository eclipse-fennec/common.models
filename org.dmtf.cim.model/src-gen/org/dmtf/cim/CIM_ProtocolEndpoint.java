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
 * A representation of the model object '<em><b>CIM Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A communication point from which data can be sent or received. ProtocolEndpoints link system or computer interfaces to LogicalNetworks.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolEndpoint#getNameFormat <em>Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolEndpoint#getProtocolType <em>Protocol Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolEndpoint#getProtocolIFType <em>Protocol IF Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolEndpoint#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtocolEndpoint#getBroadcastResetSupported <em>Broadcast Reset Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Core::Service' override.Description='string' override.Description.MappingStrings='[\"MIB.IETF|IF-MIB.ifDescr\"]' override.OperationalStatus='uint16[]' override.OperationalStatus.MappingStrings='[\"MIB.IETF|IF-MIB.ifOperStatus\"]' override.EnabledState='uint16' override.EnabledState.MappingStrings='[\"MIB.IETF|IF-MIB.ifAdminStatus\"]' override.TimeOfLastStateChange='datetime' override.TimeOfLastStateChange.MappingStrings='[\"MIB.IETF|IF-MIB.ifLastChange\"]' override.Name='string' override.Name.Description='A string that identifies this ProtocolEndpoint with either a port or an interface on a device. To ensure uniqueness, the Name property should be prepended or appended with information from the Type or OtherTypeDescription properties. The method selected is described in the NameFormat property of this class.' override.Name.MaxLen='256' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ProtocolEndpoint extends CIM_ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Name Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NameFormat contains the naming heuristic that is selected to ensure that the value of the Name property is unique. For example, you might choose to prepend the name of the port or interface with the Type of ProtocolEndpoint (for example, IPv4) of this instance followed by an underscore.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Format</em>' attribute.
	 * @see #setNameFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolEndpoint_NameFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getNameFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolEndpoint#getNameFormat <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Format</em>' attribute.
	 * @see #getNameFormat()
	 * @generated
	 */
	void setNameFormat(String value);

	/**
	 * Returns the value of the '<em><b>Protocol Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: This property is deprecated in lieu of the ProtocolIFType enumeration. This deprecation was done to have better alignment between the IF-MIB of the IETF and this CIM class. 
	 * Deprecated description: ProtocolType is an enumeration that provides information to categorize and classify different instances of this class. For most instances, information in this enumeration and the definition of the subclass overlap. However, there are several cases where a specific subclass of ProtocolEndpoint is not required (for example, there is no Fibre Channel subclass of ProtocolEndpoint). Therefore, this property is needed to define the type of Endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Type</em>' attribute.
	 * @see #setProtocolType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolEndpoint_ProtocolType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_ProtocolEndpoint.ProtocolIFType\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\"]' Values='[\"Unknown\",\"Other\",\"IPv4\",\"IPv6\",\"IPX\",\"AppleTalk\",\"DECnet\",\"SNA\",\"CONP\",\"CLNP\",\"VINES\",\"XNS\",\"ATM\",\"Frame Relay\",\"Ethernet\",\"TokenRing\",\"FDDI\",\"Infiniband\",\"Fibre Channel\",\"ISDN BRI Endpoint\",\"ISDN B Channel Endpoint\",\"ISDN D Channel Endpoint\",\"IPv4/v6\",\"BGP\",\"OSPF\",\"MPLS\",\"UDP\",\"TCP\"]' ModelCorrespondence='[\"CIM_ProtocolEndpoint.OtherTypeDescription\"]'"
	 * @generated
	 */
	Integer getProtocolType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolEndpoint#getProtocolType <em>Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Type</em>' attribute.
	 * @see #getProtocolType()
	 * @generated
	 */
	void setProtocolType(Integer value);

	/**
	 * Returns the value of the '<em><b>Protocol IF Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProtocolIFType is an enumeration that is synchronized with the IANA ifType MIB. The ifType MIB is maintained at the URL, http://www.iana.org/assignments/ianaiftype-mib. Also, additional values defined by the DMTF are included. The property is used to categorize and classify instances of the ProtocolEndpoint class. Note that if the ProtocolIFType is set to 1 (Other), then the type information should be provided in the OtherTypeDescription string property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol IF Type</em>' attribute.
	 * @see #setProtocolIFType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolEndpoint_ProtocolIFType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82\",\"83\",\"84\",\"85\",\"86\",\"87\",\"88\",\"89\",\"90\",\"91\",\"92\",\"93\",\"94\",\"95\",\"96\",\"97\",\"98\",\"99\",\"100\",\"101\",\"102\",\"103\",\"104\",\"105\",\"106\",\"107\",\"108\",\"109\",\"110\",\"111\",\"112\",\"113\",\"114\",\"115\",\"116\",\"117\",\"118\",\"119\",\"120\",\"121\",\"122\",\"123\",\"124\",\"125\",\"126\",\"127\",\"128\",\"129\",\"130\",\"131\",\"132\",\"133\",\"134\",\"135\",\"136\",\"137\",\"138\",\"139\",\"140\",\"141\",\"142\",\"143\",\"144\",\"145\",\"146\",\"147\",\"148\",\"149\",\"150\",\"151\",\"152\",\"153\",\"154\",\"155\",\"156\",\"157\",\"158\",\"159\",\"160\",\"161\",\"162\",\"163\",\"164\",\"165\",\"166\",\"167\",\"168\",\"169\",\"170\",\"171\",\"172\",\"173\",\"174\",\"175\",\"176\",\"177\",\"178\",\"179\",\"180\",\"181\",\"182\",\"183\",\"184\",\"185\",\"186\",\"187\",\"188\",\"189\",\"190\",\"191\",\"192\",\"193\",\"194\",\"195\",\"196\",\"197\",\"198\",\"199\",\"200\",\"201\",\"202\",\"203\",\"204\",\"205\",\"206\",\"207\",\"208\",\"209\",\"210\",\"211\",\"212\",\"213\",\"214\",\"215\",\"216\",\"217\",\"218\",\"219\",\"220\",\"221\",\"222\",\"223\",\"224\",\"225..4095\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100\",\"4101\",\"4102\",\"4103\",\"4104\",\"4105\",\"4106\",\"4107\",\"4108\",\"4109\",\"4110\",\"4111\",\"4112\",\"4113\",\"4114\",\"4115\",\"4200\",\"4201\",\"4202\",\"4203\",\"4204\",\"4205\",\"4300\",\"4400\",\"4401\",\"4402\",\"4403\",\"4404\",\"4405\",\"4406\",\"..\",\"32768..\"]' Values='[\"Unknown\",\"Other\",\"Regular 1822\",\"HDH 1822\",\"DDN X.25\",\"RFC877 X.25\",\"Ethernet CSMA/CD\",\"ISO 802.3 CSMA/CD\",\"ISO 802.4 Token Bus\",\"ISO 802.5 Token Ring\",\"ISO 802.6 MAN\",\"StarLAN\",\"Proteon 10Mbit\",\"Proteon 80Mbit\",\"HyperChannel\",\"FDDI\",\"LAP-B\",\"SDLC\",\"DS1\",\"E1\",\"Basic ISDN\",\"Primary ISDN\",\"Proprietary Point-to-Point Serial\",\"PPP\",\"Software Loopback\",\"EON\",\"Ethernet 3Mbit\",\"NSIP\",\"SLIP\",\"Ultra\",\"DS3\",\"SIP\",\"Frame Relay\",\"RS-232\",\"Parallel\",\"ARCNet\",\"ARCNet Plus\",\"ATM\",\"MIO X.25\",\"SONET\",\"X.25 PLE\",\"ISO 802.211c\",\"LocalTalk\",\"SMDS DXI\",\"Frame Relay Service\",\"V.35\",\"HSSI\",\"HIPPI\",\"Modem\",\"AAL5\",\"SONET Path\",\"SONET VT\",\"SMDS ICIP\",\"Proprietary Virtual/Internal\",\"Proprietary Multiplexor\",\"IEEE 802.12\",\"Fibre Channel\",\"HIPPI Interface\",\"Frame Relay Interconnect\",\"ATM Emulated LAN for 802.3\",\"ATM Emulated LAN for 802.5\",\"ATM Emulated Circuit\",\"Fast Ethernet (100BaseT)\",\"ISDN\",\"V.11\",\"V.36\",\"G703 at 64K\",\"G703 at 2Mb\",\"QLLC\",\"Fast Ethernet 100BaseFX\",\"Channel\",\"IEEE 802.11\",\"IBM 260/370 OEMI Channel\",\"ESCON\",\"Data Link Switching\",\"ISDN S/T Interface\",\"ISDN U Interface\",\"LAP-D\",\"IP Switch\",\"Remote Source Route Bridging\",\"ATM Logical\",\"DS0\",\"DS0 Bundle\",\"BSC\",\"Async\",\"Combat Net Radio\",\"ISO 802.5r DTR\",\"Ext Pos Loc Report System\",\"AppleTalk Remote Access Protocol\",\"Proprietary Connectionless\",\"ITU X.29 Host PAD\",\"ITU X.3 Terminal PAD\",\"Frame Relay MPI\",\"ITU X.213\",\"ADSL\",\"RADSL\",\"SDSL\",\"VDSL\",\"ISO 802.5 CRFP\",\"Myrinet\",\"Voice Receive and Transmit\",\"Voice Foreign Exchange Office\",\"Voice Foreign Exchange Service\",\"Voice Encapsulation\",\"Voice over IP\",\"ATM DXI\",\"ATM FUNI\",\"ATM IMA\",\"PPP Multilink Bundle\",\"IP over CDLC\",\"IP over CLAW\",\"Stack to Stack\",\"Virtual IP Address\",\"MPC\",\"IP over ATM\",\"ISO 802.5j Fibre Token Ring\",\"TDLC\",\"Gigabit Ethernet\",\"HDLC\",\"LAP-F\",\"V.37\",\"X.25 MLP\",\"X.25 Hunt Group\",\"Transp HDLC\",\"Interleave Channel\",\"FAST Channel\",\"IP (for APPN HPR in IP Networks)\",\"CATV MAC Layer\",\"CATV Downstream\",\"CATV Upstream\",\"Avalon 12MPP Switch\",\"Tunnel\",\"Coffee\",\"Circuit Emulation Service\",\"ATM SubInterface\",\"Layer 2 VLAN using 802.1Q\",\"Layer 3 VLAN using IP\",\"Layer 3 VLAN using IPX\",\"Digital Power Line\",\"Multimedia Mail over IP\",\"DTM\",\"DCN\",\"IP Forwarding\",\"MSDSL\",\"IEEE 1394\",\"IF-GSN/HIPPI-6400\",\"DVB-RCC MAC Layer\",\"DVB-RCC Downstream\",\"DVB-RCC Upstream\",\"ATM Virtual\",\"MPLS Tunnel\",\"SRP\",\"Voice over ATM\",\"Voice over Frame Relay\",\"ISDL\",\"Composite Link\",\"SS7 Signaling Link\",\"Proprietary P2P Wireless\",\"Frame Forward\",\"RFC1483 Multiprotocol over ATM\",\"USB\",\"IEEE 802.3ad Link Aggregate\",\"BGP Policy Accounting\",\"FRF .16 Multilink FR\",\"H.323 Gatekeeper\",\"H.323 Proxy\",\"MPLS\",\"Multi-Frequency Signaling Link\",\"HDSL-2\",\"S-HDSL\",\"DS1 Facility Data Link\",\"Packet over SONET/SDH\",\"DVB-ASI Input\",\"DVB-ASI Output\",\"Power Line\",\"Non Facility Associated Signaling\",\"TR008\",\"GR303 RDT\",\"GR303 IDT\",\"ISUP\",\"Proprietary Wireless MAC Layer\",\"Proprietary Wireless Downstream\",\"Proprietary Wireless Upstream\",\"HIPERLAN Type 2\",\"Proprietary Broadband Wireless Access Point to Mulipoint\",\"SONET Overhead Channel\",\"Digital Wrapper Overhead Channel\",\"ATM Adaptation Layer 2\",\"Radio MAC\",\"ATM Radio\",\"Inter Machine Trunk\",\"MVL DSL\",\"Long Read DSL\",\"Frame Relay DLCI Endpoint\",\"ATM VCI Endpoint\",\"Optical Channel\",\"Optical Transport\",\"Proprietary ATM\",\"Voice over Cable\",\"Infiniband\",\"TE Link\",\"Q.2931\",\"Virtual Trunk Group\",\"SIP Trunk Group\",\"SIP Signaling\",\"CATV Upstream Channel\",\"Econet\",\"FSAN 155Mb PON\",\"FSAN 622Mb PON\",\"Transparent Bridge\",\"Line Group\",\"Voice E&amp;M Feature Group\",\"Voice FGD EANA\",\"Voice DID\",\"MPEG Transport\",\"6To4\",\"GTP\",\"Paradyne EtherLoop 1\",\"Paradyne EtherLoop 2\",\"Optical Channel Group\",\"HomePNA\",\"GFP\",\"ciscoISLvlan\",\"actelisMetaLOOP\",\"Fcip\",\"IANA Reserved\",\"IPv4\",\"IPv6\",\"IPv4/v6\",\"IPX\",\"DECnet\",\"SNA\",\"CONP\",\"CLNP\",\"VINES\",\"XNS\",\"ISDN B Channel Endpoint\",\"ISDN D Channel Endpoint\",\"BGP\",\"OSPF\",\"UDP\",\"TCP\",\"802.11a\",\"802.11b\",\"802.11g\",\"802.11h\",\"NFS\",\"CIFS\",\"DAFS\",\"WebDAV\",\"HTTP\",\"FTP\",\"NDMP\",\"Telnet\",\"SSH\",\"SM CLP\",\"SMTP\",\"LDAP\",\"RDP\",\"HTTPS\",\"DMTF Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"MIB.IETF|IF-MIB.ifType\"]' ModelCorrespondence='[\"CIM_ProtocolEndpoint.OtherTypeDescription\"]'"
	 * @generated
	 */
	Integer getProtocolIFType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolEndpoint#getProtocolIFType <em>Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol IF Type</em>' attribute.
	 * @see #getProtocolIFType()
	 * @generated
	 */
	void setProtocolIFType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the type of ProtocolEndpoint when the Type property of this class (or any of its subclasses) is set to 1 (Other). This property should be set to null when the Type property is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Type Description</em>' attribute.
	 * @see #setOtherTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolEndpoint_OtherTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' ModelCorrespondence='[\"CIM_ProtocolEndpoint.ProtocolType\",\"CIM_ProtocolEndpoint.ProtocolIFType\"]'"
	 * @generated
	 */
	String getOtherTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolEndpoint#getOtherTypeDescription <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Type Description</em>' attribute.
	 * @see #getOtherTypeDescription()
	 * @generated
	 */
	void setOtherTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Broadcast Reset Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean indicating whether the instrumentation supports the BroadcastReset method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Broadcast Reset Supported</em>' attribute.
	 * @see #setBroadcastResetSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtocolEndpoint_BroadcastResetSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"FC-SWAPI.INCITS-T11|SWAPI_PORT_CONFIG_CAPS_T.PortForceLipSupported\"]' ModelCorrespondence='[\"CIM_ProtocolEndpoint.BroadcastReset\"]'"
	 * @generated
	 */
	Boolean getBroadcastResetSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtocolEndpoint#getBroadcastResetSupported <em>Broadcast Reset Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broadcast Reset Supported</em>' attribute.
	 * @see #getBroadcastResetSupported()
	 * @generated
	 */
	void setBroadcastResetSupported(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Send a broadcast reset. A broadcast reset is a request that peers perform a reset. Examples include a parallel SCSI Bus Reset and a Fibre Channel LIP.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5..0x0FFF\",\"0x1000..0x7777\",\"0x8000..\"]' Values='[\"Success\",\"Not_Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"DMTF_Reserved\",\"Method_Reserved\",\"Vendor_Reserved\"]' ModelCorrespondence='[\"CIM_ProtocolEndpoint.BroadcastResetSupported\"]'"
	 * @generated
	 */
	Long BroadcastReset();

} // CIM_ProtocolEndpoint

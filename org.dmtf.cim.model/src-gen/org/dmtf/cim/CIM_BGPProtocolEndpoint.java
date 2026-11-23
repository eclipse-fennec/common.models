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
 * A representation of the model object '<em><b>CIM BGP Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ProtocolEndpoint that is dedicated to running BGP.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getIsEBGP <em>Is EBGP</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getIsEBGPMultihop <em>Is EBGP Multihop</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getLocalIdentifier <em>Local Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getPeerIdentifier <em>Peer Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getState <em>State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getAdminStatus <em>Admin Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getNegotiatedVersion <em>Negotiated Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getLocalAddress <em>Local Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getLocalPort <em>Local Port</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getRemoteAddress <em>Remote Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getRemotePort <em>Remote Port</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getRemoteAS <em>Remote AS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getConnectRetryInterval <em>Connect Retry Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getHoldTimeConfigured <em>Hold Time Configured</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getKeepAliveConfigured <em>Keep Alive Configured</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getMinASOriginationInterval <em>Min AS Origination Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getMinRouteAdvertisementInterval <em>Min Route Advertisement Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getHoldTime <em>Hold Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getKeepAlive <em>Keep Alive</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' override.ProtocolIFType='uint16' override.ProtocolIFType.Description='ProtocolIFType\'s enumeration is limited to BGP and reserved values for this subclass of ProtocolEndpoint.' override.ProtocolIFType.ValueMap='[\"1\",\"225..4095\",\"4108\",\"4301..32767\",\"32768..\"]' override.ProtocolIFType.Values='[\"Other\",\"IANA Reserved\",\"BGP\",\"DMTF Reserved\",\"Vendor Reserved\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_BGPProtocolEndpoint extends CIM_ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Is EBGP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean that, when TRUE, signifies that this is an instance of the external version of BGP (FALSE is the internal version).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is EBGP</em>' attribute.
	 * @see #setIsEBGP(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_IsEBGP()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsEBGP();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getIsEBGP <em>Is EBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is EBGP</em>' attribute.
	 * @see #getIsEBGP()
	 * @generated
	 */
	void setIsEBGP(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is EBGP Multihop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Normally, two routers running EBGP must be physically connected. This boolean, when TRUE, denotes a LOGICAL connection between two routers that are running EBGP (e.g., there is an intermediate router or interface between them).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is EBGP Multihop</em>' attribute.
	 * @see #setIsEBGPMultihop(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_IsEBGPMultihop()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsEBGPMultihop();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getIsEBGPMultihop <em>Is EBGP Multihop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is EBGP Multihop</em>' attribute.
	 * @see #getIsEBGPMultihop()
	 * @generated
	 */
	void setIsEBGPMultihop(Boolean value);

	/**
	 * Returns the value of the '<em><b>Local Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the unique identifier of the local BGP router. This is often the router ID (e.g., an IP address).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Identifier</em>' attribute.
	 * @see #setLocalIdentifier(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_LocalIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpIdentifier\"]'"
	 * @generated
	 */
	String getLocalIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getLocalIdentifier <em>Local Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Identifier</em>' attribute.
	 * @see #getLocalIdentifier()
	 * @generated
	 */
	void setLocalIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Peer Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the unique identifier of the peer BGP router. This is often the router ID (e.g., an IP address).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peer Identifier</em>' attribute.
	 * @see #setPeerIdentifier(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_PeerIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerIdentifier\"]'"
	 * @generated
	 */
	String getPeerIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getPeerIdentifier <em>Peer Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peer Identifier</em>' attribute.
	 * @see #getPeerIdentifier()
	 * @generated
	 */
	void setPeerIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the current connection state of the BGP Peer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_State()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Idle\",\"Connect\",\"Active\",\"OpenSet\",\"OpenConfirm\",\"Established\"]' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerState\"]'"
	 * @generated
	 */
	Integer getState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(Integer value);

	/**
	 * Returns the value of the '<em><b>Admin Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the desired state of the BGP connection. It is equivalent to the RequestedState property (i.e., enabled/disabled status) that is inherited from EnabledLogicalElement. AdminStatus is deprecated in lieu of this inherited property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Admin Status</em>' attribute.
	 * @see #setAdminStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_AdminStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_EnabledLogicalElement.RequestedState\"]' ValueMap='[\"1\",\"2\"]' Values='[\"Stop\",\"Start\"]' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerAdminStatus\"]'"
	 * @generated
	 */
	Integer getAdminStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getAdminStatus <em>Admin Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Status</em>' attribute.
	 * @see #getAdminStatus()
	 * @generated
	 */
	void setAdminStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Negotiated Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the negotiated version of BGP that is running between the two peers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Negotiated Version</em>' attribute.
	 * @see #setNegotiatedVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_NegotiatedVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerNegotiatedVersion\"]'"
	 * @generated
	 */
	String getNegotiatedVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getNegotiatedVersion <em>Negotiated Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negotiated Version</em>' attribute.
	 * @see #getNegotiatedVersion()
	 * @generated
	 */
	void setNegotiatedVersion(String value);

	/**
	 * Returns the value of the '<em><b>Local Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the local IP address of this router's BGP connection. It is deprecated since a binding should be defined using the CIM_BindsTo association. Ideally the binding is to a TCPProtocolEndpoint which then handles the association to its IPEndpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Address</em>' attribute.
	 * @see #setLocalAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_LocalAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_BindsTo\",\"CIM_IPProtocolEndpoint\"]' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerLocalAddr\"]'"
	 * @generated
	 */
	String getLocalAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getLocalAddress <em>Local Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Address</em>' attribute.
	 * @see #getLocalAddress()
	 * @generated
	 */
	void setLocalAddress(String value);

	/**
	 * Returns the value of the '<em><b>Local Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the local port number for the TCP connection of this router's BGP connection. It is deprecated since a binding should be defined (to a TCPProtocolEndpoint) using the CIM_BindsTo association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Port</em>' attribute.
	 * @see #setLocalPort(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_LocalPort()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_BindsTo\",\"CIM_TCPProtocolEndpoint\"]' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerLocalPort\"]'"
	 * @generated
	 */
	Integer getLocalPort();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getLocalPort <em>Local Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Port</em>' attribute.
	 * @see #getLocalPort()
	 * @generated
	 */
	void setLocalPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Remote Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the remote IP address of this router's BGP connection. It is deprecated since a binding to a Remote ServiceAccessPoint should be instantiated, using CIM_BindsTo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Address</em>' attribute.
	 * @see #setRemoteAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_RemoteAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_BindsTo\",\"CIM_RemoteServiceAccessPoint\"]' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerRemoteAddr\"]'"
	 * @generated
	 */
	String getRemoteAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getRemoteAddress <em>Remote Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Address</em>' attribute.
	 * @see #getRemoteAddress()
	 * @generated
	 */
	void setRemoteAddress(String value);

	/**
	 * Returns the value of the '<em><b>Remote Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the remote port number for the TCP connection of this router's BGP connection. It is deprecated since a binding to a RemotePort should be instantiated, using CIM_BindsTo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Port</em>' attribute.
	 * @see #setRemotePort(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_RemotePort()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_BindsTo\",\"CIM_RemotePort\"]' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerRemotePort\"]'"
	 * @generated
	 */
	Integer getRemotePort();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getRemotePort <em>Remote Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Port</em>' attribute.
	 * @see #getRemotePort()
	 * @generated
	 */
	void setRemotePort(Integer value);

	/**
	 * Returns the value of the '<em><b>Remote AS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the remote AS number for this router's BGP connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote AS</em>' attribute.
	 * @see #setRemoteAS(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_RemoteAS()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerRemoteAs\"]'"
	 * @generated
	 */
	Integer getRemoteAS();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getRemoteAS <em>Remote AS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote AS</em>' attribute.
	 * @see #getRemoteAS()
	 * @generated
	 */
	void setRemoteAS(Integer value);

	/**
	 * Returns the value of the '<em><b>Connect Retry Interval</b></em>' attribute.
	 * The default value is <code>"120"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the time interval, in seconds, for the ConnectRetry timer. The suggested value is 120 seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connect Retry Interval</em>' attribute.
	 * @see #setConnectRetryInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_ConnectRetryInterval()
	 * @model default="120"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpConnectRetryInterval\"]' PUnit='second'"
	 * @generated
	 */
	Long getConnectRetryInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getConnectRetryInterval <em>Connect Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect Retry Interval</em>' attribute.
	 * @see #getConnectRetryInterval()
	 * @generated
	 */
	void setConnectRetryInterval(Long value);

	/**
	 * Returns the value of the '<em><b>Hold Time Configured</b></em>' attribute.
	 * The default value is <code>"90"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the time interval in seconds for the Hold Time configured for this BGP speaker with a peer. This value is placed in an OPEN message sent to a peer by this BGP speaker, and is compared with the Hold Time field in the OPEN message received from the peer. It enables this speaker to establish a mutually agreeable Hold Time with the peer. This value must not be less than three seconds. If it is zero, then the Hold Time is NOT to be established with the peer. The suggested value for this timer is 90 seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hold Time Configured</em>' attribute.
	 * @see #setHoldTimeConfigured(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_HoldTimeConfigured()
	 * @model default="90"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerHoldTimeConfigured\"]' PUnit='second'"
	 * @generated
	 */
	Integer getHoldTimeConfigured();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getHoldTimeConfigured <em>Hold Time Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold Time Configured</em>' attribute.
	 * @see #getHoldTimeConfigured()
	 * @generated
	 */
	void setHoldTimeConfigured(Integer value);

	/**
	 * Returns the value of the '<em><b>Keep Alive Configured</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the time interval in seconds for the KeepAlive timer configured for this BGP speaker with a peer. This value will determine the frequency of the KEEPALIVE messages relative to the value of the HoldTimeConfigured property; the actual frequency is specified by the value of the KeepAlive property. A reasonable value is one third of that of the value of the HoldTimeConfigured property. If it is zero, then NO periodic KEEPALIVE messages are sent to the peer. The suggested value for this property is 30 seconds. The maximum value of this property is 21845 seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keep Alive Configured</em>' attribute.
	 * @see #setKeepAliveConfigured(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_KeepAliveConfigured()
	 * @model default="30"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerKeepAliveConfigured\"]' PUnit='second'"
	 * @generated
	 */
	Integer getKeepAliveConfigured();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getKeepAliveConfigured <em>Keep Alive Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Alive Configured</em>' attribute.
	 * @see #getKeepAliveConfigured()
	 * @generated
	 */
	void setKeepAliveConfigured(Integer value);

	/**
	 * Returns the value of the '<em><b>Min AS Origination Interval</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the time interval in seconds for the MinASOriginationInterval timer. The suggested value for this property is 15 seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min AS Origination Interval</em>' attribute.
	 * @see #setMinASOriginationInterval(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_MinASOriginationInterval()
	 * @model default="15"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerMinASOriginationInterval\"]' PUnit='second'"
	 * @generated
	 */
	Integer getMinASOriginationInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getMinASOriginationInterval <em>Min AS Origination Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min AS Origination Interval</em>' attribute.
	 * @see #getMinASOriginationInterval()
	 * @generated
	 */
	void setMinASOriginationInterval(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Route Advertisement Interval</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the time interval in seconds for the MinRouteAdvertisementInterval timer. The suggested value for this property is 30 seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Route Advertisement Interval</em>' attribute.
	 * @see #setMinRouteAdvertisementInterval(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_MinRouteAdvertisementInterval()
	 * @model default="30"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerMinRouteAdvertisementInterval\"]' PUnit='second'"
	 * @generated
	 */
	Integer getMinRouteAdvertisementInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getMinRouteAdvertisementInterval <em>Min Route Advertisement Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Route Advertisement Interval</em>' attribute.
	 * @see #getMinRouteAdvertisementInterval()
	 * @generated
	 */
	void setMinRouteAdvertisementInterval(Integer value);

	/**
	 * Returns the value of the '<em><b>Hold Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the maximum amount of time in seconds that may elapse between the receipt of successive KEEPALIVE or UPDATE messages. This is instrumented as a counter that increments from zero to the value specified in this property. The value of this property is calculated by the BGP speaker by using the smaller of the values of bgpPeerHoldTimeConfigured and the Hold Time received in the OPEN message. This value, if not zero seconds, must be at least three seconds, up to a maximum of 65535 seconds. Receipt of either a KEEPALIVE or an UPDATE message resets this value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hold Time</em>' attribute.
	 * @see #setHoldTime(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_HoldTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerHoldTime\"]' PUnit='second'"
	 * @generated
	 */
	Integer getHoldTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getHoldTime <em>Hold Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold Time</em>' attribute.
	 * @see #getHoldTime()
	 * @generated
	 */
	void setHoldTime(Integer value);

	/**
	 * Returns the value of the '<em><b>Keep Alive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the time interval in seconds for the KeepAlive timer established with the peer. The value of this property is calculated by the speaker such that, when compared with the HoldTime property, it has the same proportion as the KeepAliveConfigured property has with the HoldTimeConfigured property. A value of 0 indicates that the KeepAlive timer has not yet been established. The maximum value of this property is 21845 seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keep Alive</em>' attribute.
	 * @see #setKeepAlive(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPProtocolEndpoint_KeepAlive()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Seconds' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpPeerKeepAlive\"]' PUnit='second'"
	 * @generated
	 */
	Integer getKeepAlive();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPProtocolEndpoint#getKeepAlive <em>Keep Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Alive</em>' attribute.
	 * @see #getKeepAlive()
	 * @generated
	 */
	void setKeepAlive(Integer value);

} // CIM_BGPProtocolEndpoint

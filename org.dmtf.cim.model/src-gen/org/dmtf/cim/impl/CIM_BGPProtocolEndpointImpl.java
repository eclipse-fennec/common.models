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
package org.dmtf.cim.impl;

import org.dmtf.cim.CIM_BGPProtocolEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BGP Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getIsEBGP <em>Is EBGP</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getIsEBGPMultihop <em>Is EBGP Multihop</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getLocalIdentifier <em>Local Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getPeerIdentifier <em>Peer Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getState <em>State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getAdminStatus <em>Admin Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getNegotiatedVersion <em>Negotiated Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getLocalAddress <em>Local Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getLocalPort <em>Local Port</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getRemoteAddress <em>Remote Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getRemotePort <em>Remote Port</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getRemoteAS <em>Remote AS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getConnectRetryInterval <em>Connect Retry Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getHoldTimeConfigured <em>Hold Time Configured</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getKeepAliveConfigured <em>Keep Alive Configured</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getMinASOriginationInterval <em>Min AS Origination Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getMinRouteAdvertisementInterval <em>Min Route Advertisement Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getHoldTime <em>Hold Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BGPProtocolEndpointImpl#getKeepAlive <em>Keep Alive</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BGPProtocolEndpointImpl extends CIM_ProtocolEndpointImpl implements CIM_BGPProtocolEndpoint {
	/**
	 * The default value of the '{@link #getIsEBGP() <em>Is EBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEBGP()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_EBGP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsEBGP() <em>Is EBGP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEBGP()
	 * @generated
	 * @ordered
	 */
	protected Boolean isEBGP = IS_EBGP_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsEBGPMultihop() <em>Is EBGP Multihop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEBGPMultihop()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_EBGP_MULTIHOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsEBGPMultihop() <em>Is EBGP Multihop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEBGPMultihop()
	 * @generated
	 * @ordered
	 */
	protected Boolean isEBGPMultihop = IS_EBGP_MULTIHOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalIdentifier() <em>Local Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalIdentifier() <em>Local Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String localIdentifier = LOCAL_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeerIdentifier() <em>Peer Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeerIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String PEER_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeerIdentifier() <em>Peer Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeerIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String peerIdentifier = PEER_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected Integer state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdminStatus() <em>Admin Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADMIN_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdminStatus() <em>Admin Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer adminStatus = ADMIN_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNegotiatedVersion() <em>Negotiated Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String NEGOTIATED_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegotiatedVersion() <em>Negotiated Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedVersion()
	 * @generated
	 * @ordered
	 */
	protected String negotiatedVersion = NEGOTIATED_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalAddress() <em>Local Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalAddress() <em>Local Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalAddress()
	 * @generated
	 * @ordered
	 */
	protected String localAddress = LOCAL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalPort() <em>Local Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOCAL_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalPort() <em>Local Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPort()
	 * @generated
	 * @ordered
	 */
	protected Integer localPort = LOCAL_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteAddress() <em>Remote Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteAddress() <em>Remote Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteAddress()
	 * @generated
	 * @ordered
	 */
	protected String remoteAddress = REMOTE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemotePort() <em>Remote Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemotePort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REMOTE_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemotePort() <em>Remote Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemotePort()
	 * @generated
	 * @ordered
	 */
	protected Integer remotePort = REMOTE_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteAS() <em>Remote AS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteAS()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REMOTE_AS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteAS() <em>Remote AS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteAS()
	 * @generated
	 * @ordered
	 */
	protected Integer remoteAS = REMOTE_AS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectRetryInterval() <em>Connect Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long CONNECT_RETRY_INTERVAL_EDEFAULT = Long.valueOf(120L);

	/**
	 * The cached value of the '{@link #getConnectRetryInterval() <em>Connect Retry Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectRetryInterval()
	 * @generated
	 * @ordered
	 */
	protected Long connectRetryInterval = CONNECT_RETRY_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoldTimeConfigured() <em>Hold Time Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldTimeConfigured()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOLD_TIME_CONFIGURED_EDEFAULT = Integer.valueOf(90);

	/**
	 * The cached value of the '{@link #getHoldTimeConfigured() <em>Hold Time Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldTimeConfigured()
	 * @generated
	 * @ordered
	 */
	protected Integer holdTimeConfigured = HOLD_TIME_CONFIGURED_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeepAliveConfigured() <em>Keep Alive Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAliveConfigured()
	 * @generated
	 * @ordered
	 */
	protected static final Integer KEEP_ALIVE_CONFIGURED_EDEFAULT = Integer.valueOf(30);

	/**
	 * The cached value of the '{@link #getKeepAliveConfigured() <em>Keep Alive Configured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAliveConfigured()
	 * @generated
	 * @ordered
	 */
	protected Integer keepAliveConfigured = KEEP_ALIVE_CONFIGURED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinASOriginationInterval() <em>Min AS Origination Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinASOriginationInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_AS_ORIGINATION_INTERVAL_EDEFAULT = Integer.valueOf(15);

	/**
	 * The cached value of the '{@link #getMinASOriginationInterval() <em>Min AS Origination Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinASOriginationInterval()
	 * @generated
	 * @ordered
	 */
	protected Integer minASOriginationInterval = MIN_AS_ORIGINATION_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinRouteAdvertisementInterval() <em>Min Route Advertisement Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRouteAdvertisementInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT = Integer.valueOf(30);

	/**
	 * The cached value of the '{@link #getMinRouteAdvertisementInterval() <em>Min Route Advertisement Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRouteAdvertisementInterval()
	 * @generated
	 * @ordered
	 */
	protected Integer minRouteAdvertisementInterval = MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoldTime() <em>Hold Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOLD_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHoldTime() <em>Hold Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldTime()
	 * @generated
	 * @ordered
	 */
	protected Integer holdTime = HOLD_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeepAlive() <em>Keep Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAlive()
	 * @generated
	 * @ordered
	 */
	protected static final Integer KEEP_ALIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeepAlive() <em>Keep Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeepAlive()
	 * @generated
	 * @ordered
	 */
	protected Integer keepAlive = KEEP_ALIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BGPProtocolEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BGPProtocolEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsEBGP() {
		return isEBGP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsEBGP(Boolean newIsEBGP) {
		Boolean oldIsEBGP = isEBGP;
		isEBGP = newIsEBGP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__IS_EBGP, oldIsEBGP, isEBGP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsEBGPMultihop() {
		return isEBGPMultihop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsEBGPMultihop(Boolean newIsEBGPMultihop) {
		Boolean oldIsEBGPMultihop = isEBGPMultihop;
		isEBGPMultihop = newIsEBGPMultihop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__IS_EBGP_MULTIHOP, oldIsEBGPMultihop, isEBGPMultihop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalIdentifier() {
		return localIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalIdentifier(String newLocalIdentifier) {
		String oldLocalIdentifier = localIdentifier;
		localIdentifier = newLocalIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__LOCAL_IDENTIFIER, oldLocalIdentifier, localIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPeerIdentifier() {
		return peerIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeerIdentifier(String newPeerIdentifier) {
		String oldPeerIdentifier = peerIdentifier;
		peerIdentifier = newPeerIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__PEER_IDENTIFIER, oldPeerIdentifier, peerIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(Integer newState) {
		Integer oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAdminStatus() {
		return adminStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdminStatus(Integer newAdminStatus) {
		Integer oldAdminStatus = adminStatus;
		adminStatus = newAdminStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__ADMIN_STATUS, oldAdminStatus, adminStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNegotiatedVersion() {
		return negotiatedVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNegotiatedVersion(String newNegotiatedVersion) {
		String oldNegotiatedVersion = negotiatedVersion;
		negotiatedVersion = newNegotiatedVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__NEGOTIATED_VERSION, oldNegotiatedVersion, negotiatedVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalAddress() {
		return localAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalAddress(String newLocalAddress) {
		String oldLocalAddress = localAddress;
		localAddress = newLocalAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__LOCAL_ADDRESS, oldLocalAddress, localAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocalPort() {
		return localPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalPort(Integer newLocalPort) {
		Integer oldLocalPort = localPort;
		localPort = newLocalPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__LOCAL_PORT, oldLocalPort, localPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemoteAddress() {
		return remoteAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteAddress(String newRemoteAddress) {
		String oldRemoteAddress = remoteAddress;
		remoteAddress = newRemoteAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__REMOTE_ADDRESS, oldRemoteAddress, remoteAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemotePort() {
		return remotePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemotePort(Integer newRemotePort) {
		Integer oldRemotePort = remotePort;
		remotePort = newRemotePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__REMOTE_PORT, oldRemotePort, remotePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemoteAS() {
		return remoteAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteAS(Integer newRemoteAS) {
		Integer oldRemoteAS = remoteAS;
		remoteAS = newRemoteAS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__REMOTE_AS, oldRemoteAS, remoteAS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getConnectRetryInterval() {
		return connectRetryInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectRetryInterval(Long newConnectRetryInterval) {
		Long oldConnectRetryInterval = connectRetryInterval;
		connectRetryInterval = newConnectRetryInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__CONNECT_RETRY_INTERVAL, oldConnectRetryInterval, connectRetryInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHoldTimeConfigured() {
		return holdTimeConfigured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHoldTimeConfigured(Integer newHoldTimeConfigured) {
		Integer oldHoldTimeConfigured = holdTimeConfigured;
		holdTimeConfigured = newHoldTimeConfigured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__HOLD_TIME_CONFIGURED, oldHoldTimeConfigured, holdTimeConfigured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getKeepAliveConfigured() {
		return keepAliveConfigured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeepAliveConfigured(Integer newKeepAliveConfigured) {
		Integer oldKeepAliveConfigured = keepAliveConfigured;
		keepAliveConfigured = newKeepAliveConfigured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE_CONFIGURED, oldKeepAliveConfigured, keepAliveConfigured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinASOriginationInterval() {
		return minASOriginationInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinASOriginationInterval(Integer newMinASOriginationInterval) {
		Integer oldMinASOriginationInterval = minASOriginationInterval;
		minASOriginationInterval = newMinASOriginationInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__MIN_AS_ORIGINATION_INTERVAL, oldMinASOriginationInterval, minASOriginationInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinRouteAdvertisementInterval() {
		return minRouteAdvertisementInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinRouteAdvertisementInterval(Integer newMinRouteAdvertisementInterval) {
		Integer oldMinRouteAdvertisementInterval = minRouteAdvertisementInterval;
		minRouteAdvertisementInterval = newMinRouteAdvertisementInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__MIN_ROUTE_ADVERTISEMENT_INTERVAL, oldMinRouteAdvertisementInterval, minRouteAdvertisementInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHoldTime() {
		return holdTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHoldTime(Integer newHoldTime) {
		Integer oldHoldTime = holdTime;
		holdTime = newHoldTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__HOLD_TIME, oldHoldTime, holdTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getKeepAlive() {
		return keepAlive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeepAlive(Integer newKeepAlive) {
		Integer oldKeepAlive = keepAlive;
		keepAlive = newKeepAlive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE, oldKeepAlive, keepAlive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__IS_EBGP:
				return getIsEBGP();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__IS_EBGP_MULTIHOP:
				return getIsEBGPMultihop();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__LOCAL_IDENTIFIER:
				return getLocalIdentifier();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__PEER_IDENTIFIER:
				return getPeerIdentifier();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__STATE:
				return getState();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__ADMIN_STATUS:
				return getAdminStatus();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__NEGOTIATED_VERSION:
				return getNegotiatedVersion();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__LOCAL_ADDRESS:
				return getLocalAddress();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__LOCAL_PORT:
				return getLocalPort();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__REMOTE_ADDRESS:
				return getRemoteAddress();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__REMOTE_PORT:
				return getRemotePort();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__REMOTE_AS:
				return getRemoteAS();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__CONNECT_RETRY_INTERVAL:
				return getConnectRetryInterval();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__HOLD_TIME_CONFIGURED:
				return getHoldTimeConfigured();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE_CONFIGURED:
				return getKeepAliveConfigured();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__MIN_AS_ORIGINATION_INTERVAL:
				return getMinASOriginationInterval();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				return getMinRouteAdvertisementInterval();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__HOLD_TIME:
				return getHoldTime();
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE:
				return getKeepAlive();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__IS_EBGP:
				setIsEBGP((Boolean)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__IS_EBGP_MULTIHOP:
				setIsEBGPMultihop((Boolean)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__LOCAL_IDENTIFIER:
				setLocalIdentifier((String)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__PEER_IDENTIFIER:
				setPeerIdentifier((String)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__STATE:
				setState((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__ADMIN_STATUS:
				setAdminStatus((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__NEGOTIATED_VERSION:
				setNegotiatedVersion((String)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__LOCAL_ADDRESS:
				setLocalAddress((String)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__LOCAL_PORT:
				setLocalPort((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__REMOTE_ADDRESS:
				setRemoteAddress((String)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__REMOTE_PORT:
				setRemotePort((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__REMOTE_AS:
				setRemoteAS((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__CONNECT_RETRY_INTERVAL:
				setConnectRetryInterval((Long)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__HOLD_TIME_CONFIGURED:
				setHoldTimeConfigured((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE_CONFIGURED:
				setKeepAliveConfigured((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__MIN_AS_ORIGINATION_INTERVAL:
				setMinASOriginationInterval((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				setMinRouteAdvertisementInterval((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__HOLD_TIME:
				setHoldTime((Integer)newValue);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE:
				setKeepAlive((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__IS_EBGP:
				setIsEBGP(IS_EBGP_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__IS_EBGP_MULTIHOP:
				setIsEBGPMultihop(IS_EBGP_MULTIHOP_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__LOCAL_IDENTIFIER:
				setLocalIdentifier(LOCAL_IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__PEER_IDENTIFIER:
				setPeerIdentifier(PEER_IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__ADMIN_STATUS:
				setAdminStatus(ADMIN_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__NEGOTIATED_VERSION:
				setNegotiatedVersion(NEGOTIATED_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__LOCAL_ADDRESS:
				setLocalAddress(LOCAL_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__LOCAL_PORT:
				setLocalPort(LOCAL_PORT_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__REMOTE_ADDRESS:
				setRemoteAddress(REMOTE_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__REMOTE_PORT:
				setRemotePort(REMOTE_PORT_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__REMOTE_AS:
				setRemoteAS(REMOTE_AS_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__CONNECT_RETRY_INTERVAL:
				setConnectRetryInterval(CONNECT_RETRY_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__HOLD_TIME_CONFIGURED:
				setHoldTimeConfigured(HOLD_TIME_CONFIGURED_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE_CONFIGURED:
				setKeepAliveConfigured(KEEP_ALIVE_CONFIGURED_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__MIN_AS_ORIGINATION_INTERVAL:
				setMinASOriginationInterval(MIN_AS_ORIGINATION_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				setMinRouteAdvertisementInterval(MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__HOLD_TIME:
				setHoldTime(HOLD_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE:
				setKeepAlive(KEEP_ALIVE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__IS_EBGP:
				return IS_EBGP_EDEFAULT == null ? isEBGP != null : !IS_EBGP_EDEFAULT.equals(isEBGP);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__IS_EBGP_MULTIHOP:
				return IS_EBGP_MULTIHOP_EDEFAULT == null ? isEBGPMultihop != null : !IS_EBGP_MULTIHOP_EDEFAULT.equals(isEBGPMultihop);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__LOCAL_IDENTIFIER:
				return LOCAL_IDENTIFIER_EDEFAULT == null ? localIdentifier != null : !LOCAL_IDENTIFIER_EDEFAULT.equals(localIdentifier);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__PEER_IDENTIFIER:
				return PEER_IDENTIFIER_EDEFAULT == null ? peerIdentifier != null : !PEER_IDENTIFIER_EDEFAULT.equals(peerIdentifier);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__ADMIN_STATUS:
				return ADMIN_STATUS_EDEFAULT == null ? adminStatus != null : !ADMIN_STATUS_EDEFAULT.equals(adminStatus);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__NEGOTIATED_VERSION:
				return NEGOTIATED_VERSION_EDEFAULT == null ? negotiatedVersion != null : !NEGOTIATED_VERSION_EDEFAULT.equals(negotiatedVersion);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__LOCAL_ADDRESS:
				return LOCAL_ADDRESS_EDEFAULT == null ? localAddress != null : !LOCAL_ADDRESS_EDEFAULT.equals(localAddress);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__LOCAL_PORT:
				return LOCAL_PORT_EDEFAULT == null ? localPort != null : !LOCAL_PORT_EDEFAULT.equals(localPort);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__REMOTE_ADDRESS:
				return REMOTE_ADDRESS_EDEFAULT == null ? remoteAddress != null : !REMOTE_ADDRESS_EDEFAULT.equals(remoteAddress);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__REMOTE_PORT:
				return REMOTE_PORT_EDEFAULT == null ? remotePort != null : !REMOTE_PORT_EDEFAULT.equals(remotePort);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__REMOTE_AS:
				return REMOTE_AS_EDEFAULT == null ? remoteAS != null : !REMOTE_AS_EDEFAULT.equals(remoteAS);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__CONNECT_RETRY_INTERVAL:
				return CONNECT_RETRY_INTERVAL_EDEFAULT == null ? connectRetryInterval != null : !CONNECT_RETRY_INTERVAL_EDEFAULT.equals(connectRetryInterval);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__HOLD_TIME_CONFIGURED:
				return HOLD_TIME_CONFIGURED_EDEFAULT == null ? holdTimeConfigured != null : !HOLD_TIME_CONFIGURED_EDEFAULT.equals(holdTimeConfigured);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE_CONFIGURED:
				return KEEP_ALIVE_CONFIGURED_EDEFAULT == null ? keepAliveConfigured != null : !KEEP_ALIVE_CONFIGURED_EDEFAULT.equals(keepAliveConfigured);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__MIN_AS_ORIGINATION_INTERVAL:
				return MIN_AS_ORIGINATION_INTERVAL_EDEFAULT == null ? minASOriginationInterval != null : !MIN_AS_ORIGINATION_INTERVAL_EDEFAULT.equals(minASOriginationInterval);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__MIN_ROUTE_ADVERTISEMENT_INTERVAL:
				return MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT == null ? minRouteAdvertisementInterval != null : !MIN_ROUTE_ADVERTISEMENT_INTERVAL_EDEFAULT.equals(minRouteAdvertisementInterval);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__HOLD_TIME:
				return HOLD_TIME_EDEFAULT == null ? holdTime != null : !HOLD_TIME_EDEFAULT.equals(holdTime);
			case CimPackage.CIM_BGP_PROTOCOL_ENDPOINT__KEEP_ALIVE:
				return KEEP_ALIVE_EDEFAULT == null ? keepAlive != null : !KEEP_ALIVE_EDEFAULT.equals(keepAlive);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (IsEBGP: ");
		result.append(isEBGP);
		result.append(", IsEBGPMultihop: ");
		result.append(isEBGPMultihop);
		result.append(", LocalIdentifier: ");
		result.append(localIdentifier);
		result.append(", PeerIdentifier: ");
		result.append(peerIdentifier);
		result.append(", State: ");
		result.append(state);
		result.append(", AdminStatus: ");
		result.append(adminStatus);
		result.append(", NegotiatedVersion: ");
		result.append(negotiatedVersion);
		result.append(", LocalAddress: ");
		result.append(localAddress);
		result.append(", LocalPort: ");
		result.append(localPort);
		result.append(", RemoteAddress: ");
		result.append(remoteAddress);
		result.append(", RemotePort: ");
		result.append(remotePort);
		result.append(", RemoteAS: ");
		result.append(remoteAS);
		result.append(", ConnectRetryInterval: ");
		result.append(connectRetryInterval);
		result.append(", HoldTimeConfigured: ");
		result.append(holdTimeConfigured);
		result.append(", KeepAliveConfigured: ");
		result.append(keepAliveConfigured);
		result.append(", MinASOriginationInterval: ");
		result.append(minASOriginationInterval);
		result.append(", MinRouteAdvertisementInterval: ");
		result.append(minRouteAdvertisementInterval);
		result.append(", HoldTime: ");
		result.append(holdTime);
		result.append(", KeepAlive: ");
		result.append(keepAlive);
		result.append(')');
		return result.toString();
	}

} //CIM_BGPProtocolEndpointImpl

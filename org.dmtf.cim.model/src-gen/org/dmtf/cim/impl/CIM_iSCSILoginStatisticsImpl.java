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

import org.dmtf.cim.CIM_iSCSILoginStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM iSCSI Login Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSILoginStatisticsImpl#getLoginFailures <em>Login Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSILoginStatisticsImpl#getLastLoginFailureTime <em>Last Login Failure Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSILoginStatisticsImpl#getLastLoginFailureType <em>Last Login Failure Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSILoginStatisticsImpl#getOtherLastLoginFailureType <em>Other Last Login Failure Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSILoginStatisticsImpl#getLastLoginFailureRemoteNodeName <em>Last Login Failure Remote Node Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSILoginStatisticsImpl#getLastLoginFailureRemoteAddressType <em>Last Login Failure Remote Address Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSILoginStatisticsImpl#getLastLoginFailureRemoteAddress <em>Last Login Failure Remote Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSILoginStatisticsImpl#getSuccessfulLogins <em>Successful Logins</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSILoginStatisticsImpl#getNegotiationLoginFailures <em>Negotiation Login Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSILoginStatisticsImpl#getAuthenticationLoginFailures <em>Authentication Login Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSILoginStatisticsImpl#getAuthorizationLoginFailures <em>Authorization Login Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSILoginStatisticsImpl#getLoginRedirects <em>Login Redirects</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSILoginStatisticsImpl#getOtherLoginFailures <em>Other Login Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSILoginStatisticsImpl#getNormalLogouts <em>Normal Logouts</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSILoginStatisticsImpl#getOtherLogouts <em>Other Logouts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_iSCSILoginStatisticsImpl extends CIM_StatisticalDataImpl implements CIM_iSCSILoginStatistics {
	/**
	 * The default value of the '{@link #getLoginFailures() <em>Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginFailures()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOGIN_FAILURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoginFailures() <em>Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginFailures()
	 * @generated
	 * @ordered
	 */
	protected Long loginFailures = LOGIN_FAILURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastLoginFailureTime() <em>Last Login Failure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoginFailureTime()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_LOGIN_FAILURE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastLoginFailureTime() <em>Last Login Failure Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoginFailureTime()
	 * @generated
	 * @ordered
	 */
	protected String lastLoginFailureTime = LAST_LOGIN_FAILURE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastLoginFailureType() <em>Last Login Failure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoginFailureType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LAST_LOGIN_FAILURE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastLoginFailureType() <em>Last Login Failure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoginFailureType()
	 * @generated
	 * @ordered
	 */
	protected Integer lastLoginFailureType = LAST_LOGIN_FAILURE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherLastLoginFailureType() <em>Other Last Login Failure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLastLoginFailureType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_LAST_LOGIN_FAILURE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLastLoginFailureType() <em>Other Last Login Failure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLastLoginFailureType()
	 * @generated
	 * @ordered
	 */
	protected String otherLastLoginFailureType = OTHER_LAST_LOGIN_FAILURE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastLoginFailureRemoteNodeName() <em>Last Login Failure Remote Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoginFailureRemoteNodeName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_LOGIN_FAILURE_REMOTE_NODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastLoginFailureRemoteNodeName() <em>Last Login Failure Remote Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoginFailureRemoteNodeName()
	 * @generated
	 * @ordered
	 */
	protected String lastLoginFailureRemoteNodeName = LAST_LOGIN_FAILURE_REMOTE_NODE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastLoginFailureRemoteAddressType() <em>Last Login Failure Remote Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoginFailureRemoteAddressType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LAST_LOGIN_FAILURE_REMOTE_ADDRESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastLoginFailureRemoteAddressType() <em>Last Login Failure Remote Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoginFailureRemoteAddressType()
	 * @generated
	 * @ordered
	 */
	protected Integer lastLoginFailureRemoteAddressType = LAST_LOGIN_FAILURE_REMOTE_ADDRESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastLoginFailureRemoteAddress() <em>Last Login Failure Remote Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoginFailureRemoteAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Long LAST_LOGIN_FAILURE_REMOTE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastLoginFailureRemoteAddress() <em>Last Login Failure Remote Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLoginFailureRemoteAddress()
	 * @generated
	 * @ordered
	 */
	protected Long lastLoginFailureRemoteAddress = LAST_LOGIN_FAILURE_REMOTE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuccessfulLogins() <em>Successful Logins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessfulLogins()
	 * @generated
	 * @ordered
	 */
	protected static final Long SUCCESSFUL_LOGINS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuccessfulLogins() <em>Successful Logins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessfulLogins()
	 * @generated
	 * @ordered
	 */
	protected Long successfulLogins = SUCCESSFUL_LOGINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNegotiationLoginFailures() <em>Negotiation Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiationLoginFailures()
	 * @generated
	 * @ordered
	 */
	protected static final Long NEGOTIATION_LOGIN_FAILURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegotiationLoginFailures() <em>Negotiation Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiationLoginFailures()
	 * @generated
	 * @ordered
	 */
	protected Long negotiationLoginFailures = NEGOTIATION_LOGIN_FAILURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthenticationLoginFailures() <em>Authentication Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationLoginFailures()
	 * @generated
	 * @ordered
	 */
	protected static final Long AUTHENTICATION_LOGIN_FAILURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthenticationLoginFailures() <em>Authentication Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationLoginFailures()
	 * @generated
	 * @ordered
	 */
	protected Long authenticationLoginFailures = AUTHENTICATION_LOGIN_FAILURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorizationLoginFailures() <em>Authorization Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationLoginFailures()
	 * @generated
	 * @ordered
	 */
	protected static final Long AUTHORIZATION_LOGIN_FAILURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorizationLoginFailures() <em>Authorization Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationLoginFailures()
	 * @generated
	 * @ordered
	 */
	protected Long authorizationLoginFailures = AUTHORIZATION_LOGIN_FAILURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoginRedirects() <em>Login Redirects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginRedirects()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOGIN_REDIRECTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoginRedirects() <em>Login Redirects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoginRedirects()
	 * @generated
	 * @ordered
	 */
	protected Long loginRedirects = LOGIN_REDIRECTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherLoginFailures() <em>Other Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLoginFailures()
	 * @generated
	 * @ordered
	 */
	protected static final Long OTHER_LOGIN_FAILURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLoginFailures() <em>Other Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLoginFailures()
	 * @generated
	 * @ordered
	 */
	protected Long otherLoginFailures = OTHER_LOGIN_FAILURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNormalLogouts() <em>Normal Logouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalLogouts()
	 * @generated
	 * @ordered
	 */
	protected static final Long NORMAL_LOGOUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNormalLogouts() <em>Normal Logouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalLogouts()
	 * @generated
	 * @ordered
	 */
	protected Long normalLogouts = NORMAL_LOGOUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherLogouts() <em>Other Logouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLogouts()
	 * @generated
	 * @ordered
	 */
	protected static final Long OTHER_LOGOUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLogouts() <em>Other Logouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLogouts()
	 * @generated
	 * @ordered
	 */
	protected Long otherLogouts = OTHER_LOGOUTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_iSCSILoginStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_iSCSILoginStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLoginFailures() {
		return loginFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoginFailures(Long newLoginFailures) {
		Long oldLoginFailures = loginFailures;
		loginFailures = newLoginFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LOGIN_FAILURES, oldLoginFailures, loginFailures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastLoginFailureTime() {
		return lastLoginFailureTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastLoginFailureTime(String newLastLoginFailureTime) {
		String oldLastLoginFailureTime = lastLoginFailureTime;
		lastLoginFailureTime = newLastLoginFailureTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_TIME, oldLastLoginFailureTime, lastLoginFailureTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLastLoginFailureType() {
		return lastLoginFailureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastLoginFailureType(Integer newLastLoginFailureType) {
		Integer oldLastLoginFailureType = lastLoginFailureType;
		lastLoginFailureType = newLastLoginFailureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_TYPE, oldLastLoginFailureType, lastLoginFailureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherLastLoginFailureType() {
		return otherLastLoginFailureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherLastLoginFailureType(String newOtherLastLoginFailureType) {
		String oldOtherLastLoginFailureType = otherLastLoginFailureType;
		otherLastLoginFailureType = newOtherLastLoginFailureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_LOGIN_STATISTICS__OTHER_LAST_LOGIN_FAILURE_TYPE, oldOtherLastLoginFailureType, otherLastLoginFailureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastLoginFailureRemoteNodeName() {
		return lastLoginFailureRemoteNodeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastLoginFailureRemoteNodeName(String newLastLoginFailureRemoteNodeName) {
		String oldLastLoginFailureRemoteNodeName = lastLoginFailureRemoteNodeName;
		lastLoginFailureRemoteNodeName = newLastLoginFailureRemoteNodeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_REMOTE_NODE_NAME, oldLastLoginFailureRemoteNodeName, lastLoginFailureRemoteNodeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLastLoginFailureRemoteAddressType() {
		return lastLoginFailureRemoteAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastLoginFailureRemoteAddressType(Integer newLastLoginFailureRemoteAddressType) {
		Integer oldLastLoginFailureRemoteAddressType = lastLoginFailureRemoteAddressType;
		lastLoginFailureRemoteAddressType = newLastLoginFailureRemoteAddressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_REMOTE_ADDRESS_TYPE, oldLastLoginFailureRemoteAddressType, lastLoginFailureRemoteAddressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLastLoginFailureRemoteAddress() {
		return lastLoginFailureRemoteAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastLoginFailureRemoteAddress(Long newLastLoginFailureRemoteAddress) {
		Long oldLastLoginFailureRemoteAddress = lastLoginFailureRemoteAddress;
		lastLoginFailureRemoteAddress = newLastLoginFailureRemoteAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_REMOTE_ADDRESS, oldLastLoginFailureRemoteAddress, lastLoginFailureRemoteAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSuccessfulLogins() {
		return successfulLogins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccessfulLogins(Long newSuccessfulLogins) {
		Long oldSuccessfulLogins = successfulLogins;
		successfulLogins = newSuccessfulLogins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_LOGIN_STATISTICS__SUCCESSFUL_LOGINS, oldSuccessfulLogins, successfulLogins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNegotiationLoginFailures() {
		return negotiationLoginFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNegotiationLoginFailures(Long newNegotiationLoginFailures) {
		Long oldNegotiationLoginFailures = negotiationLoginFailures;
		negotiationLoginFailures = newNegotiationLoginFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_LOGIN_STATISTICS__NEGOTIATION_LOGIN_FAILURES, oldNegotiationLoginFailures, negotiationLoginFailures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAuthenticationLoginFailures() {
		return authenticationLoginFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationLoginFailures(Long newAuthenticationLoginFailures) {
		Long oldAuthenticationLoginFailures = authenticationLoginFailures;
		authenticationLoginFailures = newAuthenticationLoginFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_LOGIN_STATISTICS__AUTHENTICATION_LOGIN_FAILURES, oldAuthenticationLoginFailures, authenticationLoginFailures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAuthorizationLoginFailures() {
		return authorizationLoginFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizationLoginFailures(Long newAuthorizationLoginFailures) {
		Long oldAuthorizationLoginFailures = authorizationLoginFailures;
		authorizationLoginFailures = newAuthorizationLoginFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_LOGIN_STATISTICS__AUTHORIZATION_LOGIN_FAILURES, oldAuthorizationLoginFailures, authorizationLoginFailures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLoginRedirects() {
		return loginRedirects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoginRedirects(Long newLoginRedirects) {
		Long oldLoginRedirects = loginRedirects;
		loginRedirects = newLoginRedirects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LOGIN_REDIRECTS, oldLoginRedirects, loginRedirects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getOtherLoginFailures() {
		return otherLoginFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherLoginFailures(Long newOtherLoginFailures) {
		Long oldOtherLoginFailures = otherLoginFailures;
		otherLoginFailures = newOtherLoginFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_LOGIN_STATISTICS__OTHER_LOGIN_FAILURES, oldOtherLoginFailures, otherLoginFailures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNormalLogouts() {
		return normalLogouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNormalLogouts(Long newNormalLogouts) {
		Long oldNormalLogouts = normalLogouts;
		normalLogouts = newNormalLogouts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_LOGIN_STATISTICS__NORMAL_LOGOUTS, oldNormalLogouts, normalLogouts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getOtherLogouts() {
		return otherLogouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherLogouts(Long newOtherLogouts) {
		Long oldOtherLogouts = otherLogouts;
		otherLogouts = newOtherLogouts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_LOGIN_STATISTICS__OTHER_LOGOUTS, oldOtherLogouts, otherLogouts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LOGIN_FAILURES:
				return getLoginFailures();
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_TIME:
				return getLastLoginFailureTime();
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_TYPE:
				return getLastLoginFailureType();
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__OTHER_LAST_LOGIN_FAILURE_TYPE:
				return getOtherLastLoginFailureType();
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_REMOTE_NODE_NAME:
				return getLastLoginFailureRemoteNodeName();
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_REMOTE_ADDRESS_TYPE:
				return getLastLoginFailureRemoteAddressType();
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_REMOTE_ADDRESS:
				return getLastLoginFailureRemoteAddress();
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__SUCCESSFUL_LOGINS:
				return getSuccessfulLogins();
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__NEGOTIATION_LOGIN_FAILURES:
				return getNegotiationLoginFailures();
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__AUTHENTICATION_LOGIN_FAILURES:
				return getAuthenticationLoginFailures();
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__AUTHORIZATION_LOGIN_FAILURES:
				return getAuthorizationLoginFailures();
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LOGIN_REDIRECTS:
				return getLoginRedirects();
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__OTHER_LOGIN_FAILURES:
				return getOtherLoginFailures();
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__NORMAL_LOGOUTS:
				return getNormalLogouts();
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__OTHER_LOGOUTS:
				return getOtherLogouts();
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
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LOGIN_FAILURES:
				setLoginFailures((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_TIME:
				setLastLoginFailureTime((String)newValue);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_TYPE:
				setLastLoginFailureType((Integer)newValue);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__OTHER_LAST_LOGIN_FAILURE_TYPE:
				setOtherLastLoginFailureType((String)newValue);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_REMOTE_NODE_NAME:
				setLastLoginFailureRemoteNodeName((String)newValue);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_REMOTE_ADDRESS_TYPE:
				setLastLoginFailureRemoteAddressType((Integer)newValue);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_REMOTE_ADDRESS:
				setLastLoginFailureRemoteAddress((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__SUCCESSFUL_LOGINS:
				setSuccessfulLogins((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__NEGOTIATION_LOGIN_FAILURES:
				setNegotiationLoginFailures((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__AUTHENTICATION_LOGIN_FAILURES:
				setAuthenticationLoginFailures((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__AUTHORIZATION_LOGIN_FAILURES:
				setAuthorizationLoginFailures((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LOGIN_REDIRECTS:
				setLoginRedirects((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__OTHER_LOGIN_FAILURES:
				setOtherLoginFailures((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__NORMAL_LOGOUTS:
				setNormalLogouts((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__OTHER_LOGOUTS:
				setOtherLogouts((Long)newValue);
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
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LOGIN_FAILURES:
				setLoginFailures(LOGIN_FAILURES_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_TIME:
				setLastLoginFailureTime(LAST_LOGIN_FAILURE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_TYPE:
				setLastLoginFailureType(LAST_LOGIN_FAILURE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__OTHER_LAST_LOGIN_FAILURE_TYPE:
				setOtherLastLoginFailureType(OTHER_LAST_LOGIN_FAILURE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_REMOTE_NODE_NAME:
				setLastLoginFailureRemoteNodeName(LAST_LOGIN_FAILURE_REMOTE_NODE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_REMOTE_ADDRESS_TYPE:
				setLastLoginFailureRemoteAddressType(LAST_LOGIN_FAILURE_REMOTE_ADDRESS_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_REMOTE_ADDRESS:
				setLastLoginFailureRemoteAddress(LAST_LOGIN_FAILURE_REMOTE_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__SUCCESSFUL_LOGINS:
				setSuccessfulLogins(SUCCESSFUL_LOGINS_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__NEGOTIATION_LOGIN_FAILURES:
				setNegotiationLoginFailures(NEGOTIATION_LOGIN_FAILURES_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__AUTHENTICATION_LOGIN_FAILURES:
				setAuthenticationLoginFailures(AUTHENTICATION_LOGIN_FAILURES_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__AUTHORIZATION_LOGIN_FAILURES:
				setAuthorizationLoginFailures(AUTHORIZATION_LOGIN_FAILURES_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LOGIN_REDIRECTS:
				setLoginRedirects(LOGIN_REDIRECTS_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__OTHER_LOGIN_FAILURES:
				setOtherLoginFailures(OTHER_LOGIN_FAILURES_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__NORMAL_LOGOUTS:
				setNormalLogouts(NORMAL_LOGOUTS_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__OTHER_LOGOUTS:
				setOtherLogouts(OTHER_LOGOUTS_EDEFAULT);
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
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LOGIN_FAILURES:
				return LOGIN_FAILURES_EDEFAULT == null ? loginFailures != null : !LOGIN_FAILURES_EDEFAULT.equals(loginFailures);
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_TIME:
				return LAST_LOGIN_FAILURE_TIME_EDEFAULT == null ? lastLoginFailureTime != null : !LAST_LOGIN_FAILURE_TIME_EDEFAULT.equals(lastLoginFailureTime);
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_TYPE:
				return LAST_LOGIN_FAILURE_TYPE_EDEFAULT == null ? lastLoginFailureType != null : !LAST_LOGIN_FAILURE_TYPE_EDEFAULT.equals(lastLoginFailureType);
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__OTHER_LAST_LOGIN_FAILURE_TYPE:
				return OTHER_LAST_LOGIN_FAILURE_TYPE_EDEFAULT == null ? otherLastLoginFailureType != null : !OTHER_LAST_LOGIN_FAILURE_TYPE_EDEFAULT.equals(otherLastLoginFailureType);
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_REMOTE_NODE_NAME:
				return LAST_LOGIN_FAILURE_REMOTE_NODE_NAME_EDEFAULT == null ? lastLoginFailureRemoteNodeName != null : !LAST_LOGIN_FAILURE_REMOTE_NODE_NAME_EDEFAULT.equals(lastLoginFailureRemoteNodeName);
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_REMOTE_ADDRESS_TYPE:
				return LAST_LOGIN_FAILURE_REMOTE_ADDRESS_TYPE_EDEFAULT == null ? lastLoginFailureRemoteAddressType != null : !LAST_LOGIN_FAILURE_REMOTE_ADDRESS_TYPE_EDEFAULT.equals(lastLoginFailureRemoteAddressType);
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LAST_LOGIN_FAILURE_REMOTE_ADDRESS:
				return LAST_LOGIN_FAILURE_REMOTE_ADDRESS_EDEFAULT == null ? lastLoginFailureRemoteAddress != null : !LAST_LOGIN_FAILURE_REMOTE_ADDRESS_EDEFAULT.equals(lastLoginFailureRemoteAddress);
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__SUCCESSFUL_LOGINS:
				return SUCCESSFUL_LOGINS_EDEFAULT == null ? successfulLogins != null : !SUCCESSFUL_LOGINS_EDEFAULT.equals(successfulLogins);
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__NEGOTIATION_LOGIN_FAILURES:
				return NEGOTIATION_LOGIN_FAILURES_EDEFAULT == null ? negotiationLoginFailures != null : !NEGOTIATION_LOGIN_FAILURES_EDEFAULT.equals(negotiationLoginFailures);
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__AUTHENTICATION_LOGIN_FAILURES:
				return AUTHENTICATION_LOGIN_FAILURES_EDEFAULT == null ? authenticationLoginFailures != null : !AUTHENTICATION_LOGIN_FAILURES_EDEFAULT.equals(authenticationLoginFailures);
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__AUTHORIZATION_LOGIN_FAILURES:
				return AUTHORIZATION_LOGIN_FAILURES_EDEFAULT == null ? authorizationLoginFailures != null : !AUTHORIZATION_LOGIN_FAILURES_EDEFAULT.equals(authorizationLoginFailures);
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__LOGIN_REDIRECTS:
				return LOGIN_REDIRECTS_EDEFAULT == null ? loginRedirects != null : !LOGIN_REDIRECTS_EDEFAULT.equals(loginRedirects);
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__OTHER_LOGIN_FAILURES:
				return OTHER_LOGIN_FAILURES_EDEFAULT == null ? otherLoginFailures != null : !OTHER_LOGIN_FAILURES_EDEFAULT.equals(otherLoginFailures);
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__NORMAL_LOGOUTS:
				return NORMAL_LOGOUTS_EDEFAULT == null ? normalLogouts != null : !NORMAL_LOGOUTS_EDEFAULT.equals(normalLogouts);
			case CimPackage.CIM_ISCSI_LOGIN_STATISTICS__OTHER_LOGOUTS:
				return OTHER_LOGOUTS_EDEFAULT == null ? otherLogouts != null : !OTHER_LOGOUTS_EDEFAULT.equals(otherLogouts);
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
		result.append(" (LoginFailures: ");
		result.append(loginFailures);
		result.append(", LastLoginFailureTime: ");
		result.append(lastLoginFailureTime);
		result.append(", LastLoginFailureType: ");
		result.append(lastLoginFailureType);
		result.append(", OtherLastLoginFailureType: ");
		result.append(otherLastLoginFailureType);
		result.append(", LastLoginFailureRemoteNodeName: ");
		result.append(lastLoginFailureRemoteNodeName);
		result.append(", LastLoginFailureRemoteAddressType: ");
		result.append(lastLoginFailureRemoteAddressType);
		result.append(", LastLoginFailureRemoteAddress: ");
		result.append(lastLoginFailureRemoteAddress);
		result.append(", SuccessfulLogins: ");
		result.append(successfulLogins);
		result.append(", NegotiationLoginFailures: ");
		result.append(negotiationLoginFailures);
		result.append(", AuthenticationLoginFailures: ");
		result.append(authenticationLoginFailures);
		result.append(", AuthorizationLoginFailures: ");
		result.append(authorizationLoginFailures);
		result.append(", LoginRedirects: ");
		result.append(loginRedirects);
		result.append(", OtherLoginFailures: ");
		result.append(otherLoginFailures);
		result.append(", NormalLogouts: ");
		result.append(normalLogouts);
		result.append(", OtherLogouts: ");
		result.append(otherLogouts);
		result.append(')');
		return result.toString();
	}

} //CIM_iSCSILoginStatisticsImpl

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

import org.dmtf.cim.CIM_iSCSISessionFailures;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM iSCSI Session Failures</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionFailuresImpl#getSessionFailures <em>Session Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionFailuresImpl#getLastSessionFailureType <em>Last Session Failure Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionFailuresImpl#getOtherLastSessionFailureType <em>Other Last Session Failure Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionFailuresImpl#getLastSessionFailureRemoteNodeName <em>Last Session Failure Remote Node Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionFailuresImpl#getSessionDigestFailures <em>Session Digest Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionFailuresImpl#getSessionConnectionTimeoutFailures <em>Session Connection Timeout Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionFailuresImpl#getSessionFormatErrors <em>Session Format Errors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_iSCSISessionFailuresImpl extends CIM_StatisticalDataImpl implements CIM_iSCSISessionFailures {
	/**
	 * The default value of the '{@link #getSessionFailures() <em>Session Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionFailures()
	 * @generated
	 * @ordered
	 */
	protected static final Long SESSION_FAILURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionFailures() <em>Session Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionFailures()
	 * @generated
	 * @ordered
	 */
	protected Long sessionFailures = SESSION_FAILURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastSessionFailureType() <em>Last Session Failure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSessionFailureType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LAST_SESSION_FAILURE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastSessionFailureType() <em>Last Session Failure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSessionFailureType()
	 * @generated
	 * @ordered
	 */
	protected Integer lastSessionFailureType = LAST_SESSION_FAILURE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherLastSessionFailureType() <em>Other Last Session Failure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLastSessionFailureType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_LAST_SESSION_FAILURE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLastSessionFailureType() <em>Other Last Session Failure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLastSessionFailureType()
	 * @generated
	 * @ordered
	 */
	protected String otherLastSessionFailureType = OTHER_LAST_SESSION_FAILURE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastSessionFailureRemoteNodeName() <em>Last Session Failure Remote Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSessionFailureRemoteNodeName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_SESSION_FAILURE_REMOTE_NODE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastSessionFailureRemoteNodeName() <em>Last Session Failure Remote Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSessionFailureRemoteNodeName()
	 * @generated
	 * @ordered
	 */
	protected String lastSessionFailureRemoteNodeName = LAST_SESSION_FAILURE_REMOTE_NODE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSessionDigestFailures() <em>Session Digest Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionDigestFailures()
	 * @generated
	 * @ordered
	 */
	protected static final Long SESSION_DIGEST_FAILURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionDigestFailures() <em>Session Digest Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionDigestFailures()
	 * @generated
	 * @ordered
	 */
	protected Long sessionDigestFailures = SESSION_DIGEST_FAILURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSessionConnectionTimeoutFailures() <em>Session Connection Timeout Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionConnectionTimeoutFailures()
	 * @generated
	 * @ordered
	 */
	protected static final Long SESSION_CONNECTION_TIMEOUT_FAILURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionConnectionTimeoutFailures() <em>Session Connection Timeout Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionConnectionTimeoutFailures()
	 * @generated
	 * @ordered
	 */
	protected Long sessionConnectionTimeoutFailures = SESSION_CONNECTION_TIMEOUT_FAILURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSessionFormatErrors() <em>Session Format Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionFormatErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long SESSION_FORMAT_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionFormatErrors() <em>Session Format Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionFormatErrors()
	 * @generated
	 * @ordered
	 */
	protected Long sessionFormatErrors = SESSION_FORMAT_ERRORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_iSCSISessionFailuresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_iSCSISessionFailures();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSessionFailures() {
		return sessionFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionFailures(Long newSessionFailures) {
		Long oldSessionFailures = sessionFailures;
		sessionFailures = newSessionFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_FAILURES, oldSessionFailures, sessionFailures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLastSessionFailureType() {
		return lastSessionFailureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastSessionFailureType(Integer newLastSessionFailureType) {
		Integer oldLastSessionFailureType = lastSessionFailureType;
		lastSessionFailureType = newLastSessionFailureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_FAILURES__LAST_SESSION_FAILURE_TYPE, oldLastSessionFailureType, lastSessionFailureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherLastSessionFailureType() {
		return otherLastSessionFailureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherLastSessionFailureType(String newOtherLastSessionFailureType) {
		String oldOtherLastSessionFailureType = otherLastSessionFailureType;
		otherLastSessionFailureType = newOtherLastSessionFailureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_FAILURES__OTHER_LAST_SESSION_FAILURE_TYPE, oldOtherLastSessionFailureType, otherLastSessionFailureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastSessionFailureRemoteNodeName() {
		return lastSessionFailureRemoteNodeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastSessionFailureRemoteNodeName(String newLastSessionFailureRemoteNodeName) {
		String oldLastSessionFailureRemoteNodeName = lastSessionFailureRemoteNodeName;
		lastSessionFailureRemoteNodeName = newLastSessionFailureRemoteNodeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_FAILURES__LAST_SESSION_FAILURE_REMOTE_NODE_NAME, oldLastSessionFailureRemoteNodeName, lastSessionFailureRemoteNodeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSessionDigestFailures() {
		return sessionDigestFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionDigestFailures(Long newSessionDigestFailures) {
		Long oldSessionDigestFailures = sessionDigestFailures;
		sessionDigestFailures = newSessionDigestFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_DIGEST_FAILURES, oldSessionDigestFailures, sessionDigestFailures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSessionConnectionTimeoutFailures() {
		return sessionConnectionTimeoutFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionConnectionTimeoutFailures(Long newSessionConnectionTimeoutFailures) {
		Long oldSessionConnectionTimeoutFailures = sessionConnectionTimeoutFailures;
		sessionConnectionTimeoutFailures = newSessionConnectionTimeoutFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_CONNECTION_TIMEOUT_FAILURES, oldSessionConnectionTimeoutFailures, sessionConnectionTimeoutFailures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSessionFormatErrors() {
		return sessionFormatErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionFormatErrors(Long newSessionFormatErrors) {
		Long oldSessionFormatErrors = sessionFormatErrors;
		sessionFormatErrors = newSessionFormatErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_FORMAT_ERRORS, oldSessionFormatErrors, sessionFormatErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_FAILURES:
				return getSessionFailures();
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__LAST_SESSION_FAILURE_TYPE:
				return getLastSessionFailureType();
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__OTHER_LAST_SESSION_FAILURE_TYPE:
				return getOtherLastSessionFailureType();
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__LAST_SESSION_FAILURE_REMOTE_NODE_NAME:
				return getLastSessionFailureRemoteNodeName();
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_DIGEST_FAILURES:
				return getSessionDigestFailures();
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_CONNECTION_TIMEOUT_FAILURES:
				return getSessionConnectionTimeoutFailures();
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_FORMAT_ERRORS:
				return getSessionFormatErrors();
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
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_FAILURES:
				setSessionFailures((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__LAST_SESSION_FAILURE_TYPE:
				setLastSessionFailureType((Integer)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__OTHER_LAST_SESSION_FAILURE_TYPE:
				setOtherLastSessionFailureType((String)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__LAST_SESSION_FAILURE_REMOTE_NODE_NAME:
				setLastSessionFailureRemoteNodeName((String)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_DIGEST_FAILURES:
				setSessionDigestFailures((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_CONNECTION_TIMEOUT_FAILURES:
				setSessionConnectionTimeoutFailures((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_FORMAT_ERRORS:
				setSessionFormatErrors((Long)newValue);
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
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_FAILURES:
				setSessionFailures(SESSION_FAILURES_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__LAST_SESSION_FAILURE_TYPE:
				setLastSessionFailureType(LAST_SESSION_FAILURE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__OTHER_LAST_SESSION_FAILURE_TYPE:
				setOtherLastSessionFailureType(OTHER_LAST_SESSION_FAILURE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__LAST_SESSION_FAILURE_REMOTE_NODE_NAME:
				setLastSessionFailureRemoteNodeName(LAST_SESSION_FAILURE_REMOTE_NODE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_DIGEST_FAILURES:
				setSessionDigestFailures(SESSION_DIGEST_FAILURES_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_CONNECTION_TIMEOUT_FAILURES:
				setSessionConnectionTimeoutFailures(SESSION_CONNECTION_TIMEOUT_FAILURES_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_FORMAT_ERRORS:
				setSessionFormatErrors(SESSION_FORMAT_ERRORS_EDEFAULT);
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
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_FAILURES:
				return SESSION_FAILURES_EDEFAULT == null ? sessionFailures != null : !SESSION_FAILURES_EDEFAULT.equals(sessionFailures);
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__LAST_SESSION_FAILURE_TYPE:
				return LAST_SESSION_FAILURE_TYPE_EDEFAULT == null ? lastSessionFailureType != null : !LAST_SESSION_FAILURE_TYPE_EDEFAULT.equals(lastSessionFailureType);
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__OTHER_LAST_SESSION_FAILURE_TYPE:
				return OTHER_LAST_SESSION_FAILURE_TYPE_EDEFAULT == null ? otherLastSessionFailureType != null : !OTHER_LAST_SESSION_FAILURE_TYPE_EDEFAULT.equals(otherLastSessionFailureType);
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__LAST_SESSION_FAILURE_REMOTE_NODE_NAME:
				return LAST_SESSION_FAILURE_REMOTE_NODE_NAME_EDEFAULT == null ? lastSessionFailureRemoteNodeName != null : !LAST_SESSION_FAILURE_REMOTE_NODE_NAME_EDEFAULT.equals(lastSessionFailureRemoteNodeName);
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_DIGEST_FAILURES:
				return SESSION_DIGEST_FAILURES_EDEFAULT == null ? sessionDigestFailures != null : !SESSION_DIGEST_FAILURES_EDEFAULT.equals(sessionDigestFailures);
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_CONNECTION_TIMEOUT_FAILURES:
				return SESSION_CONNECTION_TIMEOUT_FAILURES_EDEFAULT == null ? sessionConnectionTimeoutFailures != null : !SESSION_CONNECTION_TIMEOUT_FAILURES_EDEFAULT.equals(sessionConnectionTimeoutFailures);
			case CimPackage.CIM_ISCSI_SESSION_FAILURES__SESSION_FORMAT_ERRORS:
				return SESSION_FORMAT_ERRORS_EDEFAULT == null ? sessionFormatErrors != null : !SESSION_FORMAT_ERRORS_EDEFAULT.equals(sessionFormatErrors);
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
		result.append(" (SessionFailures: ");
		result.append(sessionFailures);
		result.append(", LastSessionFailureType: ");
		result.append(lastSessionFailureType);
		result.append(", OtherLastSessionFailureType: ");
		result.append(otherLastSessionFailureType);
		result.append(", LastSessionFailureRemoteNodeName: ");
		result.append(lastSessionFailureRemoteNodeName);
		result.append(", SessionDigestFailures: ");
		result.append(sessionDigestFailures);
		result.append(", SessionConnectionTimeoutFailures: ");
		result.append(sessionConnectionTimeoutFailures);
		result.append(", SessionFormatErrors: ");
		result.append(sessionFormatErrors);
		result.append(')');
		return result.toString();
	}

} //CIM_iSCSISessionFailuresImpl

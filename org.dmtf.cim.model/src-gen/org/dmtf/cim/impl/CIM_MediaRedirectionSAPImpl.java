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

import org.dmtf.cim.CIM_MediaRedirectionSAP;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Media Redirection SAP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaRedirectionSAPImpl#getConnectionMode <em>Connection Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaRedirectionSAPImpl#getCommandTimeout <em>Command Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaRedirectionSAPImpl#getResetTimeout <em>Reset Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MediaRedirectionSAPImpl#getSessionTimeout <em>Session Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MediaRedirectionSAPImpl extends CIM_ServiceAccessPointImpl implements CIM_MediaRedirectionSAP {
	/**
	 * The default value of the '{@link #getConnectionMode() <em>Connection Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONNECTION_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionMode() <em>Connection Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionMode()
	 * @generated
	 * @ordered
	 */
	protected Integer connectionMode = CONNECTION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommandTimeout() <em>Command Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandTimeout() <em>Command Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandTimeout()
	 * @generated
	 * @ordered
	 */
	protected String commandTimeout = COMMAND_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResetTimeout() <em>Reset Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String RESET_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResetTimeout() <em>Reset Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetTimeout()
	 * @generated
	 * @ordered
	 */
	protected String resetTimeout = RESET_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSessionTimeout() <em>Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionTimeout() <em>Session Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionTimeout()
	 * @generated
	 * @ordered
	 */
	protected String sessionTimeout = SESSION_TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MediaRedirectionSAPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MediaRedirectionSAP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConnectionMode() {
		return connectionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionMode(Integer newConnectionMode) {
		Integer oldConnectionMode = connectionMode;
		connectionMode = newConnectionMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_REDIRECTION_SAP__CONNECTION_MODE, oldConnectionMode, connectionMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommandTimeout() {
		return commandTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommandTimeout(String newCommandTimeout) {
		String oldCommandTimeout = commandTimeout;
		commandTimeout = newCommandTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_REDIRECTION_SAP__COMMAND_TIMEOUT, oldCommandTimeout, commandTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResetTimeout() {
		return resetTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResetTimeout(String newResetTimeout) {
		String oldResetTimeout = resetTimeout;
		resetTimeout = newResetTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_REDIRECTION_SAP__RESET_TIMEOUT, oldResetTimeout, resetTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSessionTimeout() {
		return sessionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionTimeout(String newSessionTimeout) {
		String oldSessionTimeout = sessionTimeout;
		sessionTimeout = newSessionTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEDIA_REDIRECTION_SAP__SESSION_TIMEOUT, oldSessionTimeout, sessionTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__CONNECTION_MODE:
				return getConnectionMode();
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__COMMAND_TIMEOUT:
				return getCommandTimeout();
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__RESET_TIMEOUT:
				return getResetTimeout();
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__SESSION_TIMEOUT:
				return getSessionTimeout();
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
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__CONNECTION_MODE:
				setConnectionMode((Integer)newValue);
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__COMMAND_TIMEOUT:
				setCommandTimeout((String)newValue);
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__RESET_TIMEOUT:
				setResetTimeout((String)newValue);
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__SESSION_TIMEOUT:
				setSessionTimeout((String)newValue);
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
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__CONNECTION_MODE:
				setConnectionMode(CONNECTION_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__COMMAND_TIMEOUT:
				setCommandTimeout(COMMAND_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__RESET_TIMEOUT:
				setResetTimeout(RESET_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__SESSION_TIMEOUT:
				setSessionTimeout(SESSION_TIMEOUT_EDEFAULT);
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
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__CONNECTION_MODE:
				return CONNECTION_MODE_EDEFAULT == null ? connectionMode != null : !CONNECTION_MODE_EDEFAULT.equals(connectionMode);
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__COMMAND_TIMEOUT:
				return COMMAND_TIMEOUT_EDEFAULT == null ? commandTimeout != null : !COMMAND_TIMEOUT_EDEFAULT.equals(commandTimeout);
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__RESET_TIMEOUT:
				return RESET_TIMEOUT_EDEFAULT == null ? resetTimeout != null : !RESET_TIMEOUT_EDEFAULT.equals(resetTimeout);
			case CimPackage.CIM_MEDIA_REDIRECTION_SAP__SESSION_TIMEOUT:
				return SESSION_TIMEOUT_EDEFAULT == null ? sessionTimeout != null : !SESSION_TIMEOUT_EDEFAULT.equals(sessionTimeout);
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
		result.append(" (ConnectionMode: ");
		result.append(connectionMode);
		result.append(", CommandTimeout: ");
		result.append(commandTimeout);
		result.append(", ResetTimeout: ");
		result.append(resetTimeout);
		result.append(", SessionTimeout: ");
		result.append(sessionTimeout);
		result.append(')');
		return result.toString();
	}

} //CIM_MediaRedirectionSAPImpl

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

import org.dmtf.cim.CIM_DatabaseService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Database Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceImpl#getStartupTime <em>Startup Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceImpl#getLastStatusChangeTime <em>Last Status Change Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseServiceImpl#getConnectionLimit <em>Connection Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DatabaseServiceImpl extends CIM_ServiceImpl implements CIM_DatabaseService {
	/**
	 * The default value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupTime()
	 * @generated
	 * @ordered
	 */
	protected static final String STARTUP_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupTime()
	 * @generated
	 * @ordered
	 */
	protected String startupTime = STARTUP_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastStatusChangeTime() <em>Last Status Change Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStatusChangeTime()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_STATUS_CHANGE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastStatusChangeTime() <em>Last Status Change Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastStatusChangeTime()
	 * @generated
	 * @ordered
	 */
	protected String lastStatusChangeTime = LAST_STATUS_CHANGE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionLimit() <em>Connection Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Long CONNECTION_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionLimit() <em>Connection Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionLimit()
	 * @generated
	 * @ordered
	 */
	protected Long connectionLimit = CONNECTION_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DatabaseServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DatabaseService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartupTime() {
		return startupTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartupTime(String newStartupTime) {
		String oldStartupTime = startupTime;
		startupTime = newStartupTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE__STARTUP_TIME, oldStartupTime, startupTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastStatusChangeTime() {
		return lastStatusChangeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastStatusChangeTime(String newLastStatusChangeTime) {
		String oldLastStatusChangeTime = lastStatusChangeTime;
		lastStatusChangeTime = newLastStatusChangeTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE__LAST_STATUS_CHANGE_TIME, oldLastStatusChangeTime, lastStatusChangeTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getConnectionLimit() {
		return connectionLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionLimit(Long newConnectionLimit) {
		Long oldConnectionLimit = connectionLimit;
		connectionLimit = newConnectionLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_SERVICE__CONNECTION_LIMIT, oldConnectionLimit, connectionLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DATABASE_SERVICE__STARTUP_TIME:
				return getStartupTime();
			case CimPackage.CIM_DATABASE_SERVICE__LAST_STATUS_CHANGE_TIME:
				return getLastStatusChangeTime();
			case CimPackage.CIM_DATABASE_SERVICE__CONNECTION_LIMIT:
				return getConnectionLimit();
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
			case CimPackage.CIM_DATABASE_SERVICE__STARTUP_TIME:
				setStartupTime((String)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE__LAST_STATUS_CHANGE_TIME:
				setLastStatusChangeTime((String)newValue);
				return;
			case CimPackage.CIM_DATABASE_SERVICE__CONNECTION_LIMIT:
				setConnectionLimit((Long)newValue);
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
			case CimPackage.CIM_DATABASE_SERVICE__STARTUP_TIME:
				setStartupTime(STARTUP_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE__LAST_STATUS_CHANGE_TIME:
				setLastStatusChangeTime(LAST_STATUS_CHANGE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_SERVICE__CONNECTION_LIMIT:
				setConnectionLimit(CONNECTION_LIMIT_EDEFAULT);
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
			case CimPackage.CIM_DATABASE_SERVICE__STARTUP_TIME:
				return STARTUP_TIME_EDEFAULT == null ? startupTime != null : !STARTUP_TIME_EDEFAULT.equals(startupTime);
			case CimPackage.CIM_DATABASE_SERVICE__LAST_STATUS_CHANGE_TIME:
				return LAST_STATUS_CHANGE_TIME_EDEFAULT == null ? lastStatusChangeTime != null : !LAST_STATUS_CHANGE_TIME_EDEFAULT.equals(lastStatusChangeTime);
			case CimPackage.CIM_DATABASE_SERVICE__CONNECTION_LIMIT:
				return CONNECTION_LIMIT_EDEFAULT == null ? connectionLimit != null : !CONNECTION_LIMIT_EDEFAULT.equals(connectionLimit);
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
		result.append(" (StartupTime: ");
		result.append(startupTime);
		result.append(", LastStatusChangeTime: ");
		result.append(lastStatusChangeTime);
		result.append(", ConnectionLimit: ");
		result.append(connectionLimit);
		result.append(')');
		return result.toString();
	}

} //CIM_DatabaseServiceImpl

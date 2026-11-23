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

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_Log;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogImpl#getMaxNumberOfRecords <em>Max Number Of Records</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogImpl#getCurrentNumberOfRecords <em>Current Number Of Records</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogImpl#getOverwritePolicy <em>Overwrite Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogImpl#getLogState <em>Log State</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_LogImpl extends CIM_EnabledLogicalElementImpl implements CIM_Log {
	/**
	 * The default value of the '{@link #getMaxNumberOfRecords() <em>Max Number Of Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfRecords()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_NUMBER_OF_RECORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumberOfRecords() <em>Max Number Of Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfRecords()
	 * @generated
	 * @ordered
	 */
	protected Long maxNumberOfRecords = MAX_NUMBER_OF_RECORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentNumberOfRecords() <em>Current Number Of Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentNumberOfRecords()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_NUMBER_OF_RECORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentNumberOfRecords() <em>Current Number Of Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentNumberOfRecords()
	 * @generated
	 * @ordered
	 */
	protected Long currentNumberOfRecords = CURRENT_NUMBER_OF_RECORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverwritePolicy() <em>Overwrite Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverwritePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OVERWRITE_POLICY_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getOverwritePolicy() <em>Overwrite Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverwritePolicy()
	 * @generated
	 * @ordered
	 */
	protected Integer overwritePolicy = OVERWRITE_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogState() <em>Log State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOG_STATE_EDEFAULT = Integer.valueOf(4);

	/**
	 * The cached value of the '{@link #getLogState() <em>Log State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogState()
	 * @generated
	 * @ordered
	 */
	protected Integer logState = LOG_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Log();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxNumberOfRecords() {
		return maxNumberOfRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNumberOfRecords(Long newMaxNumberOfRecords) {
		Long oldMaxNumberOfRecords = maxNumberOfRecords;
		maxNumberOfRecords = newMaxNumberOfRecords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG__MAX_NUMBER_OF_RECORDS, oldMaxNumberOfRecords, maxNumberOfRecords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentNumberOfRecords() {
		return currentNumberOfRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentNumberOfRecords(Long newCurrentNumberOfRecords) {
		Long oldCurrentNumberOfRecords = currentNumberOfRecords;
		currentNumberOfRecords = newCurrentNumberOfRecords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG__CURRENT_NUMBER_OF_RECORDS, oldCurrentNumberOfRecords, currentNumberOfRecords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOverwritePolicy() {
		return overwritePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverwritePolicy(Integer newOverwritePolicy) {
		Integer oldOverwritePolicy = overwritePolicy;
		overwritePolicy = newOverwritePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG__OVERWRITE_POLICY, oldOverwritePolicy, overwritePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLogState() {
		return logState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogState(Integer newLogState) {
		Integer oldLogState = logState;
		logState = newLogState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG__LOG_STATE, oldLogState, logState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ClearLog() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOG__MAX_NUMBER_OF_RECORDS:
				return getMaxNumberOfRecords();
			case CimPackage.CIM_LOG__CURRENT_NUMBER_OF_RECORDS:
				return getCurrentNumberOfRecords();
			case CimPackage.CIM_LOG__OVERWRITE_POLICY:
				return getOverwritePolicy();
			case CimPackage.CIM_LOG__LOG_STATE:
				return getLogState();
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
			case CimPackage.CIM_LOG__MAX_NUMBER_OF_RECORDS:
				setMaxNumberOfRecords((Long)newValue);
				return;
			case CimPackage.CIM_LOG__CURRENT_NUMBER_OF_RECORDS:
				setCurrentNumberOfRecords((Long)newValue);
				return;
			case CimPackage.CIM_LOG__OVERWRITE_POLICY:
				setOverwritePolicy((Integer)newValue);
				return;
			case CimPackage.CIM_LOG__LOG_STATE:
				setLogState((Integer)newValue);
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
			case CimPackage.CIM_LOG__MAX_NUMBER_OF_RECORDS:
				setMaxNumberOfRecords(MAX_NUMBER_OF_RECORDS_EDEFAULT);
				return;
			case CimPackage.CIM_LOG__CURRENT_NUMBER_OF_RECORDS:
				setCurrentNumberOfRecords(CURRENT_NUMBER_OF_RECORDS_EDEFAULT);
				return;
			case CimPackage.CIM_LOG__OVERWRITE_POLICY:
				setOverwritePolicy(OVERWRITE_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_LOG__LOG_STATE:
				setLogState(LOG_STATE_EDEFAULT);
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
			case CimPackage.CIM_LOG__MAX_NUMBER_OF_RECORDS:
				return MAX_NUMBER_OF_RECORDS_EDEFAULT == null ? maxNumberOfRecords != null : !MAX_NUMBER_OF_RECORDS_EDEFAULT.equals(maxNumberOfRecords);
			case CimPackage.CIM_LOG__CURRENT_NUMBER_OF_RECORDS:
				return CURRENT_NUMBER_OF_RECORDS_EDEFAULT == null ? currentNumberOfRecords != null : !CURRENT_NUMBER_OF_RECORDS_EDEFAULT.equals(currentNumberOfRecords);
			case CimPackage.CIM_LOG__OVERWRITE_POLICY:
				return OVERWRITE_POLICY_EDEFAULT == null ? overwritePolicy != null : !OVERWRITE_POLICY_EDEFAULT.equals(overwritePolicy);
			case CimPackage.CIM_LOG__LOG_STATE:
				return LOG_STATE_EDEFAULT == null ? logState != null : !LOG_STATE_EDEFAULT.equals(logState);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_LOG___CLEAR_LOG:
				return ClearLog();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (MaxNumberOfRecords: ");
		result.append(maxNumberOfRecords);
		result.append(", CurrentNumberOfRecords: ");
		result.append(currentNumberOfRecords);
		result.append(", OverwritePolicy: ");
		result.append(overwritePolicy);
		result.append(", LogState: ");
		result.append(logState);
		result.append(')');
		return result.toString();
	}

} //CIM_LogImpl

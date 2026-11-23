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

import org.dmtf.cim.CIM_J2eeConnectionStats;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM J2ee Connection Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionStatsImpl#getWaitTime <em>Wait Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionStatsImpl#getWaitTimeMaxTime <em>Wait Time Max Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionStatsImpl#getWaitTimeMinTime <em>Wait Time Min Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionStatsImpl#getWaitTimeTotalTime <em>Wait Time Total Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionStatsImpl#getUseTime <em>Use Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionStatsImpl#getUseTimeMaxTime <em>Use Time Max Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionStatsImpl#getUseTimeMinTime <em>Use Time Min Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionStatsImpl#getUseTimeTotalTime <em>Use Time Total Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_J2eeConnectionStatsImpl extends CIM_J2eeStatisticImpl implements CIM_J2eeConnectionStats {
	/**
	 * The default value of the '{@link #getWaitTime() <em>Wait Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitTime()
	 * @generated
	 * @ordered
	 */
	protected static final String WAIT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitTime() <em>Wait Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitTime()
	 * @generated
	 * @ordered
	 */
	protected String waitTime = WAIT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitTimeMaxTime() <em>Wait Time Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitTimeMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final String WAIT_TIME_MAX_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitTimeMaxTime() <em>Wait Time Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitTimeMaxTime()
	 * @generated
	 * @ordered
	 */
	protected String waitTimeMaxTime = WAIT_TIME_MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitTimeMinTime() <em>Wait Time Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitTimeMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final String WAIT_TIME_MIN_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitTimeMinTime() <em>Wait Time Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitTimeMinTime()
	 * @generated
	 * @ordered
	 */
	protected String waitTimeMinTime = WAIT_TIME_MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitTimeTotalTime() <em>Wait Time Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitTimeTotalTime()
	 * @generated
	 * @ordered
	 */
	protected static final String WAIT_TIME_TOTAL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitTimeTotalTime() <em>Wait Time Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitTimeTotalTime()
	 * @generated
	 * @ordered
	 */
	protected String waitTimeTotalTime = WAIT_TIME_TOTAL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseTime() <em>Use Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTime()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseTime() <em>Use Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTime()
	 * @generated
	 * @ordered
	 */
	protected String useTime = USE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseTimeMaxTime() <em>Use Time Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTimeMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_TIME_MAX_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseTimeMaxTime() <em>Use Time Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTimeMaxTime()
	 * @generated
	 * @ordered
	 */
	protected String useTimeMaxTime = USE_TIME_MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseTimeMinTime() <em>Use Time Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTimeMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_TIME_MIN_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseTimeMinTime() <em>Use Time Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTimeMinTime()
	 * @generated
	 * @ordered
	 */
	protected String useTimeMinTime = USE_TIME_MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseTimeTotalTime() <em>Use Time Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTimeTotalTime()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_TIME_TOTAL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseTimeTotalTime() <em>Use Time Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTimeTotalTime()
	 * @generated
	 * @ordered
	 */
	protected String useTimeTotalTime = USE_TIME_TOTAL_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_J2eeConnectionStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_J2eeConnectionStats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWaitTime() {
		return waitTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaitTime(String newWaitTime) {
		String oldWaitTime = waitTime;
		waitTime = newWaitTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME, oldWaitTime, waitTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWaitTimeMaxTime() {
		return waitTimeMaxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaitTimeMaxTime(String newWaitTimeMaxTime) {
		String oldWaitTimeMaxTime = waitTimeMaxTime;
		waitTimeMaxTime = newWaitTimeMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME_MAX_TIME, oldWaitTimeMaxTime, waitTimeMaxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWaitTimeMinTime() {
		return waitTimeMinTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaitTimeMinTime(String newWaitTimeMinTime) {
		String oldWaitTimeMinTime = waitTimeMinTime;
		waitTimeMinTime = newWaitTimeMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME_MIN_TIME, oldWaitTimeMinTime, waitTimeMinTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWaitTimeTotalTime() {
		return waitTimeTotalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaitTimeTotalTime(String newWaitTimeTotalTime) {
		String oldWaitTimeTotalTime = waitTimeTotalTime;
		waitTimeTotalTime = newWaitTimeTotalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME_TOTAL_TIME, oldWaitTimeTotalTime, waitTimeTotalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseTime() {
		return useTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTime(String newUseTime) {
		String oldUseTime = useTime;
		useTime = newUseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME, oldUseTime, useTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseTimeMaxTime() {
		return useTimeMaxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTimeMaxTime(String newUseTimeMaxTime) {
		String oldUseTimeMaxTime = useTimeMaxTime;
		useTimeMaxTime = newUseTimeMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME_MAX_TIME, oldUseTimeMaxTime, useTimeMaxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseTimeMinTime() {
		return useTimeMinTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTimeMinTime(String newUseTimeMinTime) {
		String oldUseTimeMinTime = useTimeMinTime;
		useTimeMinTime = newUseTimeMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME_MIN_TIME, oldUseTimeMinTime, useTimeMinTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUseTimeTotalTime() {
		return useTimeTotalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTimeTotalTime(String newUseTimeTotalTime) {
		String oldUseTimeTotalTime = useTimeTotalTime;
		useTimeTotalTime = newUseTimeTotalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME_TOTAL_TIME, oldUseTimeTotalTime, useTimeTotalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME:
				return getWaitTime();
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME_MAX_TIME:
				return getWaitTimeMaxTime();
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME_MIN_TIME:
				return getWaitTimeMinTime();
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME_TOTAL_TIME:
				return getWaitTimeTotalTime();
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME:
				return getUseTime();
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME_MAX_TIME:
				return getUseTimeMaxTime();
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME_MIN_TIME:
				return getUseTimeMinTime();
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME_TOTAL_TIME:
				return getUseTimeTotalTime();
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
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME:
				setWaitTime((String)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME_MAX_TIME:
				setWaitTimeMaxTime((String)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME_MIN_TIME:
				setWaitTimeMinTime((String)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME_TOTAL_TIME:
				setWaitTimeTotalTime((String)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME:
				setUseTime((String)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME_MAX_TIME:
				setUseTimeMaxTime((String)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME_MIN_TIME:
				setUseTimeMinTime((String)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME_TOTAL_TIME:
				setUseTimeTotalTime((String)newValue);
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
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME:
				setWaitTime(WAIT_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME_MAX_TIME:
				setWaitTimeMaxTime(WAIT_TIME_MAX_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME_MIN_TIME:
				setWaitTimeMinTime(WAIT_TIME_MIN_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME_TOTAL_TIME:
				setWaitTimeTotalTime(WAIT_TIME_TOTAL_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME:
				setUseTime(USE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME_MAX_TIME:
				setUseTimeMaxTime(USE_TIME_MAX_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME_MIN_TIME:
				setUseTimeMinTime(USE_TIME_MIN_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME_TOTAL_TIME:
				setUseTimeTotalTime(USE_TIME_TOTAL_TIME_EDEFAULT);
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
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME:
				return WAIT_TIME_EDEFAULT == null ? waitTime != null : !WAIT_TIME_EDEFAULT.equals(waitTime);
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME_MAX_TIME:
				return WAIT_TIME_MAX_TIME_EDEFAULT == null ? waitTimeMaxTime != null : !WAIT_TIME_MAX_TIME_EDEFAULT.equals(waitTimeMaxTime);
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME_MIN_TIME:
				return WAIT_TIME_MIN_TIME_EDEFAULT == null ? waitTimeMinTime != null : !WAIT_TIME_MIN_TIME_EDEFAULT.equals(waitTimeMinTime);
			case CimPackage.CIM_J2EE_CONNECTION_STATS__WAIT_TIME_TOTAL_TIME:
				return WAIT_TIME_TOTAL_TIME_EDEFAULT == null ? waitTimeTotalTime != null : !WAIT_TIME_TOTAL_TIME_EDEFAULT.equals(waitTimeTotalTime);
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME:
				return USE_TIME_EDEFAULT == null ? useTime != null : !USE_TIME_EDEFAULT.equals(useTime);
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME_MAX_TIME:
				return USE_TIME_MAX_TIME_EDEFAULT == null ? useTimeMaxTime != null : !USE_TIME_MAX_TIME_EDEFAULT.equals(useTimeMaxTime);
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME_MIN_TIME:
				return USE_TIME_MIN_TIME_EDEFAULT == null ? useTimeMinTime != null : !USE_TIME_MIN_TIME_EDEFAULT.equals(useTimeMinTime);
			case CimPackage.CIM_J2EE_CONNECTION_STATS__USE_TIME_TOTAL_TIME:
				return USE_TIME_TOTAL_TIME_EDEFAULT == null ? useTimeTotalTime != null : !USE_TIME_TOTAL_TIME_EDEFAULT.equals(useTimeTotalTime);
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
		result.append(" (WaitTime: ");
		result.append(waitTime);
		result.append(", WaitTimeMaxTime: ");
		result.append(waitTimeMaxTime);
		result.append(", WaitTimeMinTime: ");
		result.append(waitTimeMinTime);
		result.append(", WaitTimeTotalTime: ");
		result.append(waitTimeTotalTime);
		result.append(", UseTime: ");
		result.append(useTime);
		result.append(", UseTimeMaxTime: ");
		result.append(useTimeMaxTime);
		result.append(", UseTimeMinTime: ");
		result.append(useTimeMinTime);
		result.append(", UseTimeTotalTime: ");
		result.append(useTimeTotalTime);
		result.append(')');
		return result.toString();
	}

} //CIM_J2eeConnectionStatsImpl

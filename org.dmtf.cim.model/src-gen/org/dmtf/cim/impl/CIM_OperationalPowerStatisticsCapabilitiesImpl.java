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

import org.dmtf.cim.CIM_OperationalPowerStatisticsCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Operational Power Statistics Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperationalPowerStatisticsCapabilitiesImpl#getClockTickInterval <em>Clock Tick Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OperationalPowerStatisticsCapabilitiesImpl extends CIM_StatisticsCapabilitiesImpl implements CIM_OperationalPowerStatisticsCapabilities {
	/**
	 * The default value of the '{@link #getClockTickInterval() <em>Clock Tick Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockTickInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLOCK_TICK_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClockTickInterval() <em>Clock Tick Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockTickInterval()
	 * @generated
	 * @ordered
	 */
	protected Long clockTickInterval = CLOCK_TICK_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OperationalPowerStatisticsCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OperationalPowerStatisticsCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClockTickInterval() {
		return clockTickInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClockTickInterval(Long newClockTickInterval) {
		Long oldClockTickInterval = clockTickInterval;
		clockTickInterval = newClockTickInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATIONAL_POWER_STATISTICS_CAPABILITIES__CLOCK_TICK_INTERVAL, oldClockTickInterval, clockTickInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICS_CAPABILITIES__CLOCK_TICK_INTERVAL:
				return getClockTickInterval();
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
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICS_CAPABILITIES__CLOCK_TICK_INTERVAL:
				setClockTickInterval((Long)newValue);
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
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICS_CAPABILITIES__CLOCK_TICK_INTERVAL:
				setClockTickInterval(CLOCK_TICK_INTERVAL_EDEFAULT);
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
			case CimPackage.CIM_OPERATIONAL_POWER_STATISTICS_CAPABILITIES__CLOCK_TICK_INTERVAL:
				return CLOCK_TICK_INTERVAL_EDEFAULT == null ? clockTickInterval != null : !CLOCK_TICK_INTERVAL_EDEFAULT.equals(clockTickInterval);
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
		result.append(" (ClockTickInterval: ");
		result.append(clockTickInterval);
		result.append(')');
		return result.toString();
	}

} //CIM_OperationalPowerStatisticsCapabilitiesImpl

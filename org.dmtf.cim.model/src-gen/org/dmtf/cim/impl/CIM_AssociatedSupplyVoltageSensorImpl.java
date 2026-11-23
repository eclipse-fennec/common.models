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

import org.dmtf.cim.CIM_AssociatedSupplyVoltageSensor;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Associated Supply Voltage Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedSupplyVoltageSensorImpl#getMonitoringRange <em>Monitoring Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AssociatedSupplyVoltageSensorImpl extends CIM_AssociatedSensorImpl implements CIM_AssociatedSupplyVoltageSensor {
	/**
	 * The default value of the '{@link #getMonitoringRange() <em>Monitoring Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringRange()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MONITORING_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonitoringRange() <em>Monitoring Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringRange()
	 * @generated
	 * @ordered
	 */
	protected Integer monitoringRange = MONITORING_RANGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AssociatedSupplyVoltageSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AssociatedSupplyVoltageSensor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMonitoringRange() {
		return monitoringRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoringRange(Integer newMonitoringRange) {
		Integer oldMonitoringRange = monitoringRange;
		monitoringRange = newMonitoringRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_SUPPLY_VOLTAGE_SENSOR__MONITORING_RANGE, oldMonitoringRange, monitoringRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ASSOCIATED_SUPPLY_VOLTAGE_SENSOR__MONITORING_RANGE:
				return getMonitoringRange();
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
			case CimPackage.CIM_ASSOCIATED_SUPPLY_VOLTAGE_SENSOR__MONITORING_RANGE:
				setMonitoringRange((Integer)newValue);
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
			case CimPackage.CIM_ASSOCIATED_SUPPLY_VOLTAGE_SENSOR__MONITORING_RANGE:
				setMonitoringRange(MONITORING_RANGE_EDEFAULT);
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
			case CimPackage.CIM_ASSOCIATED_SUPPLY_VOLTAGE_SENSOR__MONITORING_RANGE:
				return MONITORING_RANGE_EDEFAULT == null ? monitoringRange != null : !MONITORING_RANGE_EDEFAULT.equals(monitoringRange);
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
		result.append(" (MonitoringRange: ");
		result.append(monitoringRange);
		result.append(')');
		return result.toString();
	}

} //CIM_AssociatedSupplyVoltageSensorImpl

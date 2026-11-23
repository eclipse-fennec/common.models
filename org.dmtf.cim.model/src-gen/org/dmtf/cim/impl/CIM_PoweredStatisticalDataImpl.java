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

import org.dmtf.cim.CIM_PoweredStatisticalData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Powered Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PoweredStatisticalDataImpl#getPowerOnHours <em>Power On Hours</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PoweredStatisticalDataImpl#getTotalPowerOnHours <em>Total Power On Hours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PoweredStatisticalDataImpl extends CIM_StatisticalDataImpl implements CIM_PoweredStatisticalData {
	/**
	 * The default value of the '{@link #getPowerOnHours() <em>Power On Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerOnHours()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_ON_HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerOnHours() <em>Power On Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerOnHours()
	 * @generated
	 * @ordered
	 */
	protected String powerOnHours = POWER_ON_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalPowerOnHours() <em>Total Power On Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPowerOnHours()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_POWER_ON_HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalPowerOnHours() <em>Total Power On Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPowerOnHours()
	 * @generated
	 * @ordered
	 */
	protected String totalPowerOnHours = TOTAL_POWER_ON_HOURS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PoweredStatisticalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PoweredStatisticalData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPowerOnHours() {
		return powerOnHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerOnHours(String newPowerOnHours) {
		String oldPowerOnHours = powerOnHours;
		powerOnHours = newPowerOnHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWERED_STATISTICAL_DATA__POWER_ON_HOURS, oldPowerOnHours, powerOnHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTotalPowerOnHours() {
		return totalPowerOnHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalPowerOnHours(String newTotalPowerOnHours) {
		String oldTotalPowerOnHours = totalPowerOnHours;
		totalPowerOnHours = newTotalPowerOnHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWERED_STATISTICAL_DATA__TOTAL_POWER_ON_HOURS, oldTotalPowerOnHours, totalPowerOnHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POWERED_STATISTICAL_DATA__POWER_ON_HOURS:
				return getPowerOnHours();
			case CimPackage.CIM_POWERED_STATISTICAL_DATA__TOTAL_POWER_ON_HOURS:
				return getTotalPowerOnHours();
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
			case CimPackage.CIM_POWERED_STATISTICAL_DATA__POWER_ON_HOURS:
				setPowerOnHours((String)newValue);
				return;
			case CimPackage.CIM_POWERED_STATISTICAL_DATA__TOTAL_POWER_ON_HOURS:
				setTotalPowerOnHours((String)newValue);
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
			case CimPackage.CIM_POWERED_STATISTICAL_DATA__POWER_ON_HOURS:
				setPowerOnHours(POWER_ON_HOURS_EDEFAULT);
				return;
			case CimPackage.CIM_POWERED_STATISTICAL_DATA__TOTAL_POWER_ON_HOURS:
				setTotalPowerOnHours(TOTAL_POWER_ON_HOURS_EDEFAULT);
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
			case CimPackage.CIM_POWERED_STATISTICAL_DATA__POWER_ON_HOURS:
				return POWER_ON_HOURS_EDEFAULT == null ? powerOnHours != null : !POWER_ON_HOURS_EDEFAULT.equals(powerOnHours);
			case CimPackage.CIM_POWERED_STATISTICAL_DATA__TOTAL_POWER_ON_HOURS:
				return TOTAL_POWER_ON_HOURS_EDEFAULT == null ? totalPowerOnHours != null : !TOTAL_POWER_ON_HOURS_EDEFAULT.equals(totalPowerOnHours);
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
		result.append(" (PowerOnHours: ");
		result.append(powerOnHours);
		result.append(", TotalPowerOnHours: ");
		result.append(totalPowerOnHours);
		result.append(')');
		return result.toString();
	}

} //CIM_PoweredStatisticalDataImpl

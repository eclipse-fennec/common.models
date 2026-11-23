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

import org.dmtf.cim.CIM_PowerAllocationSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Power Allocation Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerAllocationSettingDataImpl#getPowerAllocationSettingPurpose <em>Power Allocation Setting Purpose</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerAllocationSettingDataImpl#getOtherSettingPurpose <em>Other Setting Purpose</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PowerAllocationSettingDataImpl extends CIM_ResourceAllocationSettingDataImpl implements CIM_PowerAllocationSettingData {
	/**
	 * The default value of the '{@link #getPowerAllocationSettingPurpose() <em>Power Allocation Setting Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerAllocationSettingPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POWER_ALLOCATION_SETTING_PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerAllocationSettingPurpose() <em>Power Allocation Setting Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerAllocationSettingPurpose()
	 * @generated
	 * @ordered
	 */
	protected Integer powerAllocationSettingPurpose = POWER_ALLOCATION_SETTING_PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherSettingPurpose() <em>Other Setting Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSettingPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SETTING_PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSettingPurpose() <em>Other Setting Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSettingPurpose()
	 * @generated
	 * @ordered
	 */
	protected String otherSettingPurpose = OTHER_SETTING_PURPOSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PowerAllocationSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PowerAllocationSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPowerAllocationSettingPurpose() {
		return powerAllocationSettingPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerAllocationSettingPurpose(Integer newPowerAllocationSettingPurpose) {
		Integer oldPowerAllocationSettingPurpose = powerAllocationSettingPurpose;
		powerAllocationSettingPurpose = newPowerAllocationSettingPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_ALLOCATION_SETTING_DATA__POWER_ALLOCATION_SETTING_PURPOSE, oldPowerAllocationSettingPurpose, powerAllocationSettingPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSettingPurpose() {
		return otherSettingPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSettingPurpose(String newOtherSettingPurpose) {
		String oldOtherSettingPurpose = otherSettingPurpose;
		otherSettingPurpose = newOtherSettingPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_ALLOCATION_SETTING_DATA__OTHER_SETTING_PURPOSE, oldOtherSettingPurpose, otherSettingPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POWER_ALLOCATION_SETTING_DATA__POWER_ALLOCATION_SETTING_PURPOSE:
				return getPowerAllocationSettingPurpose();
			case CimPackage.CIM_POWER_ALLOCATION_SETTING_DATA__OTHER_SETTING_PURPOSE:
				return getOtherSettingPurpose();
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
			case CimPackage.CIM_POWER_ALLOCATION_SETTING_DATA__POWER_ALLOCATION_SETTING_PURPOSE:
				setPowerAllocationSettingPurpose((Integer)newValue);
				return;
			case CimPackage.CIM_POWER_ALLOCATION_SETTING_DATA__OTHER_SETTING_PURPOSE:
				setOtherSettingPurpose((String)newValue);
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
			case CimPackage.CIM_POWER_ALLOCATION_SETTING_DATA__POWER_ALLOCATION_SETTING_PURPOSE:
				setPowerAllocationSettingPurpose(POWER_ALLOCATION_SETTING_PURPOSE_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_ALLOCATION_SETTING_DATA__OTHER_SETTING_PURPOSE:
				setOtherSettingPurpose(OTHER_SETTING_PURPOSE_EDEFAULT);
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
			case CimPackage.CIM_POWER_ALLOCATION_SETTING_DATA__POWER_ALLOCATION_SETTING_PURPOSE:
				return POWER_ALLOCATION_SETTING_PURPOSE_EDEFAULT == null ? powerAllocationSettingPurpose != null : !POWER_ALLOCATION_SETTING_PURPOSE_EDEFAULT.equals(powerAllocationSettingPurpose);
			case CimPackage.CIM_POWER_ALLOCATION_SETTING_DATA__OTHER_SETTING_PURPOSE:
				return OTHER_SETTING_PURPOSE_EDEFAULT == null ? otherSettingPurpose != null : !OTHER_SETTING_PURPOSE_EDEFAULT.equals(otherSettingPurpose);
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
		result.append(" (PowerAllocationSettingPurpose: ");
		result.append(powerAllocationSettingPurpose);
		result.append(", OtherSettingPurpose: ");
		result.append(otherSettingPurpose);
		result.append(')');
		return result.toString();
	}

} //CIM_PowerAllocationSettingDataImpl

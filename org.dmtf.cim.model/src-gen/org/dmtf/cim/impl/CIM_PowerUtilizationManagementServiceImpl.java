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

import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_PowerUtilizationManagementService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Power Utilization Management Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerUtilizationManagementServiceImpl#getPowerUtilizationMode <em>Power Utilization Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PowerUtilizationManagementServiceImpl extends CIM_ServiceImpl implements CIM_PowerUtilizationManagementService {
	/**
	 * The default value of the '{@link #getPowerUtilizationMode() <em>Power Utilization Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerUtilizationMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POWER_UTILIZATION_MODE_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getPowerUtilizationMode() <em>Power Utilization Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerUtilizationMode()
	 * @generated
	 * @ordered
	 */
	protected Integer powerUtilizationMode = POWER_UTILIZATION_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PowerUtilizationManagementServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PowerUtilizationManagementService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPowerUtilizationMode() {
		return powerUtilizationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerUtilizationMode(Integer newPowerUtilizationMode) {
		Integer oldPowerUtilizationMode = powerUtilizationMode;
		powerUtilizationMode = newPowerUtilizationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_SERVICE__POWER_UTILIZATION_MODE, oldPowerUtilizationMode, powerUtilizationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ApplyPowerAllocationSettings(String PowerAllocationSettings, CIM_ConcreteJob Job) {
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
			case CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_SERVICE__POWER_UTILIZATION_MODE:
				return getPowerUtilizationMode();
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
			case CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_SERVICE__POWER_UTILIZATION_MODE:
				setPowerUtilizationMode((Integer)newValue);
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
			case CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_SERVICE__POWER_UTILIZATION_MODE:
				setPowerUtilizationMode(POWER_UTILIZATION_MODE_EDEFAULT);
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
			case CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_SERVICE__POWER_UTILIZATION_MODE:
				return POWER_UTILIZATION_MODE_EDEFAULT == null ? powerUtilizationMode != null : !POWER_UTILIZATION_MODE_EDEFAULT.equals(powerUtilizationMode);
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
			case CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_SERVICE___APPLY_POWER_ALLOCATION_SETTINGS__STRING_CIM_CONCRETEJOB:
				return ApplyPowerAllocationSettings((String)arguments.get(0), (CIM_ConcreteJob)arguments.get(1));
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
		result.append(" (PowerUtilizationMode: ");
		result.append(powerUtilizationMode);
		result.append(')');
		return result.toString();
	}

} //CIM_PowerUtilizationManagementServiceImpl

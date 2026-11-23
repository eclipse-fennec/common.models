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

import org.dmtf.cim.CIM_CoolingDevice;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Cooling Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CoolingDeviceImpl#getActiveCooling <em>Active Cooling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CoolingDeviceImpl extends CIM_LogicalDeviceImpl implements CIM_CoolingDevice {
	/**
	 * The default value of the '{@link #getActiveCooling() <em>Active Cooling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveCooling()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ACTIVE_COOLING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiveCooling() <em>Active Cooling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveCooling()
	 * @generated
	 * @ordered
	 */
	protected Boolean activeCooling = ACTIVE_COOLING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CoolingDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CoolingDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getActiveCooling() {
		return activeCooling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveCooling(Boolean newActiveCooling) {
		Boolean oldActiveCooling = activeCooling;
		activeCooling = newActiveCooling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COOLING_DEVICE__ACTIVE_COOLING, oldActiveCooling, activeCooling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_COOLING_DEVICE__ACTIVE_COOLING:
				return getActiveCooling();
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
			case CimPackage.CIM_COOLING_DEVICE__ACTIVE_COOLING:
				setActiveCooling((Boolean)newValue);
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
			case CimPackage.CIM_COOLING_DEVICE__ACTIVE_COOLING:
				setActiveCooling(ACTIVE_COOLING_EDEFAULT);
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
			case CimPackage.CIM_COOLING_DEVICE__ACTIVE_COOLING:
				return ACTIVE_COOLING_EDEFAULT == null ? activeCooling != null : !ACTIVE_COOLING_EDEFAULT.equals(activeCooling);
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
		result.append(" (ActiveCooling: ");
		result.append(activeCooling);
		result.append(')');
		return result.toString();
	}

} //CIM_CoolingDeviceImpl

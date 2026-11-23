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

import org.dmtf.cim.CIM_ComputerSystemNodeCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Computer System Node Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ComputerSystemNodeCapabilitiesImpl#getBatterySupported <em>Battery Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ComputerSystemNodeCapabilitiesImpl#getECCSupported <em>ECC Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ComputerSystemNodeCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_ComputerSystemNodeCapabilities {
	/**
	 * The default value of the '{@link #getBatterySupported() <em>Battery Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatterySupported()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BATTERY_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBatterySupported() <em>Battery Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatterySupported()
	 * @generated
	 * @ordered
	 */
	protected Integer batterySupported = BATTERY_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getECCSupported() <em>ECC Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECCSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ECC_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getECCSupported() <em>ECC Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECCSupported()
	 * @generated
	 * @ordered
	 */
	protected Integer eccSupported = ECC_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ComputerSystemNodeCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ComputerSystemNodeCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBatterySupported() {
		return batterySupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBatterySupported(Integer newBatterySupported) {
		Integer oldBatterySupported = batterySupported;
		batterySupported = newBatterySupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPUTER_SYSTEM_NODE_CAPABILITIES__BATTERY_SUPPORTED, oldBatterySupported, batterySupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getECCSupported() {
		return eccSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setECCSupported(Integer newECCSupported) {
		Integer oldECCSupported = eccSupported;
		eccSupported = newECCSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPUTER_SYSTEM_NODE_CAPABILITIES__ECC_SUPPORTED, oldECCSupported, eccSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_COMPUTER_SYSTEM_NODE_CAPABILITIES__BATTERY_SUPPORTED:
				return getBatterySupported();
			case CimPackage.CIM_COMPUTER_SYSTEM_NODE_CAPABILITIES__ECC_SUPPORTED:
				return getECCSupported();
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
			case CimPackage.CIM_COMPUTER_SYSTEM_NODE_CAPABILITIES__BATTERY_SUPPORTED:
				setBatterySupported((Integer)newValue);
				return;
			case CimPackage.CIM_COMPUTER_SYSTEM_NODE_CAPABILITIES__ECC_SUPPORTED:
				setECCSupported((Integer)newValue);
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
			case CimPackage.CIM_COMPUTER_SYSTEM_NODE_CAPABILITIES__BATTERY_SUPPORTED:
				setBatterySupported(BATTERY_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_COMPUTER_SYSTEM_NODE_CAPABILITIES__ECC_SUPPORTED:
				setECCSupported(ECC_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_COMPUTER_SYSTEM_NODE_CAPABILITIES__BATTERY_SUPPORTED:
				return BATTERY_SUPPORTED_EDEFAULT == null ? batterySupported != null : !BATTERY_SUPPORTED_EDEFAULT.equals(batterySupported);
			case CimPackage.CIM_COMPUTER_SYSTEM_NODE_CAPABILITIES__ECC_SUPPORTED:
				return ECC_SUPPORTED_EDEFAULT == null ? eccSupported != null : !ECC_SUPPORTED_EDEFAULT.equals(eccSupported);
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
		result.append(" (BatterySupported: ");
		result.append(batterySupported);
		result.append(", ECCSupported: ");
		result.append(eccSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_ComputerSystemNodeCapabilitiesImpl

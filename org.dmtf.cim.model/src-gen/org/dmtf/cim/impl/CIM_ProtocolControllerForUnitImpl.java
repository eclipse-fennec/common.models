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

import org.dmtf.cim.CIM_ProtocolControllerForUnit;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Protocol Controller For Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerForUnitImpl#getDeviceAccess <em>Device Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ProtocolControllerForUnitImpl extends CIM_ProtocolControllerForDeviceImpl implements CIM_ProtocolControllerForUnit {
	/**
	 * The default value of the '{@link #getDeviceAccess() <em>Device Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEVICE_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceAccess() <em>Device Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceAccess()
	 * @generated
	 * @ordered
	 */
	protected Integer deviceAccess = DEVICE_ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ProtocolControllerForUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ProtocolControllerForUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeviceAccess() {
		return deviceAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceAccess(Integer newDeviceAccess) {
		Integer oldDeviceAccess = deviceAccess;
		deviceAccess = newDeviceAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_FOR_UNIT__DEVICE_ACCESS, oldDeviceAccess, deviceAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PROTOCOL_CONTROLLER_FOR_UNIT__DEVICE_ACCESS:
				return getDeviceAccess();
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
			case CimPackage.CIM_PROTOCOL_CONTROLLER_FOR_UNIT__DEVICE_ACCESS:
				setDeviceAccess((Integer)newValue);
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
			case CimPackage.CIM_PROTOCOL_CONTROLLER_FOR_UNIT__DEVICE_ACCESS:
				setDeviceAccess(DEVICE_ACCESS_EDEFAULT);
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
			case CimPackage.CIM_PROTOCOL_CONTROLLER_FOR_UNIT__DEVICE_ACCESS:
				return DEVICE_ACCESS_EDEFAULT == null ? deviceAccess != null : !DEVICE_ACCESS_EDEFAULT.equals(deviceAccess);
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
		result.append(" (DeviceAccess: ");
		result.append(deviceAccess);
		result.append(')');
		return result.toString();
	}

} //CIM_ProtocolControllerForUnitImpl

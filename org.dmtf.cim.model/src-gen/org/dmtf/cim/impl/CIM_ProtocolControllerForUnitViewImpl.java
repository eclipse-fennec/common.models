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

import org.dmtf.cim.CIM_ProtocolControllerForUnitView;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Protocol Controller For Unit View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolControllerForUnitViewImpl#getPCFUDeviceAccess <em>PCFU Device Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ProtocolControllerForUnitViewImpl extends CIM_AbstractProtocolControllerForDeviceImpl implements CIM_ProtocolControllerForUnitView {
	/**
	 * The default value of the '{@link #getPCFUDeviceAccess() <em>PCFU Device Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCFUDeviceAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PCFU_DEVICE_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPCFUDeviceAccess() <em>PCFU Device Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCFUDeviceAccess()
	 * @generated
	 * @ordered
	 */
	protected Integer pcfuDeviceAccess = PCFU_DEVICE_ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ProtocolControllerForUnitViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ProtocolControllerForUnitView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPCFUDeviceAccess() {
		return pcfuDeviceAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPCFUDeviceAccess(Integer newPCFUDeviceAccess) {
		Integer oldPCFUDeviceAccess = pcfuDeviceAccess;
		pcfuDeviceAccess = newPCFUDeviceAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_CONTROLLER_FOR_UNIT_VIEW__PCFU_DEVICE_ACCESS, oldPCFUDeviceAccess, pcfuDeviceAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PROTOCOL_CONTROLLER_FOR_UNIT_VIEW__PCFU_DEVICE_ACCESS:
				return getPCFUDeviceAccess();
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
			case CimPackage.CIM_PROTOCOL_CONTROLLER_FOR_UNIT_VIEW__PCFU_DEVICE_ACCESS:
				setPCFUDeviceAccess((Integer)newValue);
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
			case CimPackage.CIM_PROTOCOL_CONTROLLER_FOR_UNIT_VIEW__PCFU_DEVICE_ACCESS:
				setPCFUDeviceAccess(PCFU_DEVICE_ACCESS_EDEFAULT);
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
			case CimPackage.CIM_PROTOCOL_CONTROLLER_FOR_UNIT_VIEW__PCFU_DEVICE_ACCESS:
				return PCFU_DEVICE_ACCESS_EDEFAULT == null ? pcfuDeviceAccess != null : !PCFU_DEVICE_ACCESS_EDEFAULT.equals(pcfuDeviceAccess);
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
		result.append(" (PCFUDeviceAccess: ");
		result.append(pcfuDeviceAccess);
		result.append(')');
		return result.toString();
	}

} //CIM_ProtocolControllerForUnitViewImpl

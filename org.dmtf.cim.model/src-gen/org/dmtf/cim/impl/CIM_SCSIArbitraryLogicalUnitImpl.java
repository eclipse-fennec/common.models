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

import org.dmtf.cim.CIM_SCSIArbitraryLogicalUnit;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SCSI Arbitrary Logical Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIArbitraryLogicalUnitImpl#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIArbitraryLogicalUnitImpl#getOtherDeviceType <em>Other Device Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SCSIArbitraryLogicalUnitImpl extends CIM_LogicalDeviceImpl implements CIM_SCSIArbitraryLogicalUnit {
	/**
	 * The default value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEVICE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceType() <em>Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceType()
	 * @generated
	 * @ordered
	 */
	protected Integer deviceType = DEVICE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherDeviceType() <em>Other Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDeviceType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_DEVICE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherDeviceType() <em>Other Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDeviceType()
	 * @generated
	 * @ordered
	 */
	protected String otherDeviceType = OTHER_DEVICE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SCSIArbitraryLogicalUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SCSIArbitraryLogicalUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeviceType() {
		return deviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceType(Integer newDeviceType) {
		Integer oldDeviceType = deviceType;
		deviceType = newDeviceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_ARBITRARY_LOGICAL_UNIT__DEVICE_TYPE, oldDeviceType, deviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherDeviceType() {
		return otherDeviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherDeviceType(String newOtherDeviceType) {
		String oldOtherDeviceType = otherDeviceType;
		otherDeviceType = newOtherDeviceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_ARBITRARY_LOGICAL_UNIT__OTHER_DEVICE_TYPE, oldOtherDeviceType, otherDeviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SCSI_ARBITRARY_LOGICAL_UNIT__DEVICE_TYPE:
				return getDeviceType();
			case CimPackage.CIM_SCSI_ARBITRARY_LOGICAL_UNIT__OTHER_DEVICE_TYPE:
				return getOtherDeviceType();
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
			case CimPackage.CIM_SCSI_ARBITRARY_LOGICAL_UNIT__DEVICE_TYPE:
				setDeviceType((Integer)newValue);
				return;
			case CimPackage.CIM_SCSI_ARBITRARY_LOGICAL_UNIT__OTHER_DEVICE_TYPE:
				setOtherDeviceType((String)newValue);
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
			case CimPackage.CIM_SCSI_ARBITRARY_LOGICAL_UNIT__DEVICE_TYPE:
				setDeviceType(DEVICE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_ARBITRARY_LOGICAL_UNIT__OTHER_DEVICE_TYPE:
				setOtherDeviceType(OTHER_DEVICE_TYPE_EDEFAULT);
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
			case CimPackage.CIM_SCSI_ARBITRARY_LOGICAL_UNIT__DEVICE_TYPE:
				return DEVICE_TYPE_EDEFAULT == null ? deviceType != null : !DEVICE_TYPE_EDEFAULT.equals(deviceType);
			case CimPackage.CIM_SCSI_ARBITRARY_LOGICAL_UNIT__OTHER_DEVICE_TYPE:
				return OTHER_DEVICE_TYPE_EDEFAULT == null ? otherDeviceType != null : !OTHER_DEVICE_TYPE_EDEFAULT.equals(otherDeviceType);
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
		result.append(" (DeviceType: ");
		result.append(deviceType);
		result.append(", OtherDeviceType: ");
		result.append(otherDeviceType);
		result.append(')');
		return result.toString();
	}

} //CIM_SCSIArbitraryLogicalUnitImpl

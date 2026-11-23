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

import org.dmtf.cim.CIM_DiskSpaceCheck;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Disk Space Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskSpaceCheckImpl#getAvailableDiskSpace <em>Available Disk Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiskSpaceCheckImpl extends CIM_CheckImpl implements CIM_DiskSpaceCheck {
	/**
	 * The default value of the '{@link #getAvailableDiskSpace() <em>Available Disk Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableDiskSpace()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVAILABLE_DISK_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableDiskSpace() <em>Available Disk Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableDiskSpace()
	 * @generated
	 * @ordered
	 */
	protected Long availableDiskSpace = AVAILABLE_DISK_SPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiskSpaceCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiskSpaceCheck();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAvailableDiskSpace() {
		return availableDiskSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableDiskSpace(Long newAvailableDiskSpace) {
		Long oldAvailableDiskSpace = availableDiskSpace;
		availableDiskSpace = newAvailableDiskSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_SPACE_CHECK__AVAILABLE_DISK_SPACE, oldAvailableDiskSpace, availableDiskSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DISK_SPACE_CHECK__AVAILABLE_DISK_SPACE:
				return getAvailableDiskSpace();
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
			case CimPackage.CIM_DISK_SPACE_CHECK__AVAILABLE_DISK_SPACE:
				setAvailableDiskSpace((Long)newValue);
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
			case CimPackage.CIM_DISK_SPACE_CHECK__AVAILABLE_DISK_SPACE:
				setAvailableDiskSpace(AVAILABLE_DISK_SPACE_EDEFAULT);
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
			case CimPackage.CIM_DISK_SPACE_CHECK__AVAILABLE_DISK_SPACE:
				return AVAILABLE_DISK_SPACE_EDEFAULT == null ? availableDiskSpace != null : !AVAILABLE_DISK_SPACE_EDEFAULT.equals(availableDiskSpace);
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
		result.append(" (AvailableDiskSpace: ");
		result.append(availableDiskSpace);
		result.append(')');
		return result.toString();
	}

} //CIM_DiskSpaceCheckImpl

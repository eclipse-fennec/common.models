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

import org.dmtf.cim.CIM_DiskDriveDiagnosticTest;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Disk Drive Diagnostic Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveDiagnosticTestImpl#getDiskDriveTestType <em>Disk Drive Test Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiskDriveDiagnosticTestImpl#getOtherDiskDriveTestType <em>Other Disk Drive Test Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiskDriveDiagnosticTestImpl extends CIM_DiagnosticTestImpl implements CIM_DiskDriveDiagnosticTest {
	/**
	 * The default value of the '{@link #getDiskDriveTestType() <em>Disk Drive Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskDriveTestType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DISK_DRIVE_TEST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiskDriveTestType() <em>Disk Drive Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskDriveTestType()
	 * @generated
	 * @ordered
	 */
	protected Integer diskDriveTestType = DISK_DRIVE_TEST_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherDiskDriveTestType() <em>Other Disk Drive Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDiskDriveTestType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_DISK_DRIVE_TEST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherDiskDriveTestType() <em>Other Disk Drive Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDiskDriveTestType()
	 * @generated
	 * @ordered
	 */
	protected String otherDiskDriveTestType = OTHER_DISK_DRIVE_TEST_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiskDriveDiagnosticTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiskDriveDiagnosticTest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDiskDriveTestType() {
		return diskDriveTestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiskDriveTestType(Integer newDiskDriveTestType) {
		Integer oldDiskDriveTestType = diskDriveTestType;
		diskDriveTestType = newDiskDriveTestType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_TEST__DISK_DRIVE_TEST_TYPE, oldDiskDriveTestType, diskDriveTestType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherDiskDriveTestType() {
		return otherDiskDriveTestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherDiskDriveTestType(String newOtherDiskDriveTestType) {
		String oldOtherDiskDriveTestType = otherDiskDriveTestType;
		otherDiskDriveTestType = newOtherDiskDriveTestType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_TEST__OTHER_DISK_DRIVE_TEST_TYPE, oldOtherDiskDriveTestType, otherDiskDriveTestType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_TEST__DISK_DRIVE_TEST_TYPE:
				return getDiskDriveTestType();
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_TEST__OTHER_DISK_DRIVE_TEST_TYPE:
				return getOtherDiskDriveTestType();
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
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_TEST__DISK_DRIVE_TEST_TYPE:
				setDiskDriveTestType((Integer)newValue);
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_TEST__OTHER_DISK_DRIVE_TEST_TYPE:
				setOtherDiskDriveTestType((String)newValue);
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
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_TEST__DISK_DRIVE_TEST_TYPE:
				setDiskDriveTestType(DISK_DRIVE_TEST_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_TEST__OTHER_DISK_DRIVE_TEST_TYPE:
				setOtherDiskDriveTestType(OTHER_DISK_DRIVE_TEST_TYPE_EDEFAULT);
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
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_TEST__DISK_DRIVE_TEST_TYPE:
				return DISK_DRIVE_TEST_TYPE_EDEFAULT == null ? diskDriveTestType != null : !DISK_DRIVE_TEST_TYPE_EDEFAULT.equals(diskDriveTestType);
			case CimPackage.CIM_DISK_DRIVE_DIAGNOSTIC_TEST__OTHER_DISK_DRIVE_TEST_TYPE:
				return OTHER_DISK_DRIVE_TEST_TYPE_EDEFAULT == null ? otherDiskDriveTestType != null : !OTHER_DISK_DRIVE_TEST_TYPE_EDEFAULT.equals(otherDiskDriveTestType);
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
		result.append(" (DiskDriveTestType: ");
		result.append(diskDriveTestType);
		result.append(", OtherDiskDriveTestType: ");
		result.append(otherDiskDriveTestType);
		result.append(')');
		return result.toString();
	}

} //CIM_DiskDriveDiagnosticTestImpl

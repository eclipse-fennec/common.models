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

import org.dmtf.cim.CIM_StoragePoolDiagnosticTest;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Pool Diagnostic Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolDiagnosticTestImpl#getStoragePoolTestType <em>Storage Pool Test Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolDiagnosticTestImpl#getOtherStoragePoolTestType <em>Other Storage Pool Test Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StoragePoolDiagnosticTestImpl extends CIM_DiagnosticTestImpl implements CIM_StoragePoolDiagnosticTest {
	/**
	 * The default value of the '{@link #getStoragePoolTestType() <em>Storage Pool Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoragePoolTestType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STORAGE_POOL_TEST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoragePoolTestType() <em>Storage Pool Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoragePoolTestType()
	 * @generated
	 * @ordered
	 */
	protected Integer storagePoolTestType = STORAGE_POOL_TEST_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherStoragePoolTestType() <em>Other Storage Pool Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherStoragePoolTestType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_STORAGE_POOL_TEST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherStoragePoolTestType() <em>Other Storage Pool Test Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherStoragePoolTestType()
	 * @generated
	 * @ordered
	 */
	protected String otherStoragePoolTestType = OTHER_STORAGE_POOL_TEST_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StoragePoolDiagnosticTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StoragePoolDiagnosticTest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStoragePoolTestType() {
		return storagePoolTestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoragePoolTestType(Integer newStoragePoolTestType) {
		Integer oldStoragePoolTestType = storagePoolTestType;
		storagePoolTestType = newStoragePoolTestType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_TEST__STORAGE_POOL_TEST_TYPE, oldStoragePoolTestType, storagePoolTestType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherStoragePoolTestType() {
		return otherStoragePoolTestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherStoragePoolTestType(String newOtherStoragePoolTestType) {
		String oldOtherStoragePoolTestType = otherStoragePoolTestType;
		otherStoragePoolTestType = newOtherStoragePoolTestType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_TEST__OTHER_STORAGE_POOL_TEST_TYPE, oldOtherStoragePoolTestType, otherStoragePoolTestType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_TEST__STORAGE_POOL_TEST_TYPE:
				return getStoragePoolTestType();
			case CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_TEST__OTHER_STORAGE_POOL_TEST_TYPE:
				return getOtherStoragePoolTestType();
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
			case CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_TEST__STORAGE_POOL_TEST_TYPE:
				setStoragePoolTestType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_TEST__OTHER_STORAGE_POOL_TEST_TYPE:
				setOtherStoragePoolTestType((String)newValue);
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
			case CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_TEST__STORAGE_POOL_TEST_TYPE:
				setStoragePoolTestType(STORAGE_POOL_TEST_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_TEST__OTHER_STORAGE_POOL_TEST_TYPE:
				setOtherStoragePoolTestType(OTHER_STORAGE_POOL_TEST_TYPE_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_TEST__STORAGE_POOL_TEST_TYPE:
				return STORAGE_POOL_TEST_TYPE_EDEFAULT == null ? storagePoolTestType != null : !STORAGE_POOL_TEST_TYPE_EDEFAULT.equals(storagePoolTestType);
			case CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_TEST__OTHER_STORAGE_POOL_TEST_TYPE:
				return OTHER_STORAGE_POOL_TEST_TYPE_EDEFAULT == null ? otherStoragePoolTestType != null : !OTHER_STORAGE_POOL_TEST_TYPE_EDEFAULT.equals(otherStoragePoolTestType);
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
		result.append(" (StoragePoolTestType: ");
		result.append(storagePoolTestType);
		result.append(", OtherStoragePoolTestType: ");
		result.append(otherStoragePoolTestType);
		result.append(')');
		return result.toString();
	}

} //CIM_StoragePoolDiagnosticTestImpl

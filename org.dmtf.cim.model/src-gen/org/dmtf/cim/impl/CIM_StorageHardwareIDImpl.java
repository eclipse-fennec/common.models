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

import org.dmtf.cim.CIM_StorageHardwareID;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Hardware ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageHardwareIDImpl#getStorageID <em>Storage ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageHardwareIDImpl#getIDType <em>ID Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageHardwareIDImpl#getOtherIDType <em>Other ID Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageHardwareIDImpl extends CIM_IdentityImpl implements CIM_StorageHardwareID {
	/**
	 * The default value of the '{@link #getStorageID() <em>Storage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageID()
	 * @generated
	 * @ordered
	 */
	protected static final String STORAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageID() <em>Storage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageID()
	 * @generated
	 * @ordered
	 */
	protected String storageID = STORAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIDType() <em>ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIDType() <em>ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDType()
	 * @generated
	 * @ordered
	 */
	protected Integer idType = ID_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherIDType() <em>Other ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIDType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ID_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherIDType() <em>Other ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIDType()
	 * @generated
	 * @ordered
	 */
	protected String otherIDType = OTHER_ID_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageHardwareIDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageHardwareID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStorageID() {
		return storageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageID(String newStorageID) {
		String oldStorageID = storageID;
		storageID = newStorageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_HARDWARE_ID__STORAGE_ID, oldStorageID, storageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIDType() {
		return idType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDType(Integer newIDType) {
		Integer oldIDType = idType;
		idType = newIDType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_HARDWARE_ID__ID_TYPE, oldIDType, idType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherIDType() {
		return otherIDType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherIDType(String newOtherIDType) {
		String oldOtherIDType = otherIDType;
		otherIDType = newOtherIDType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_HARDWARE_ID__OTHER_ID_TYPE, oldOtherIDType, otherIDType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_HARDWARE_ID__STORAGE_ID:
				return getStorageID();
			case CimPackage.CIM_STORAGE_HARDWARE_ID__ID_TYPE:
				return getIDType();
			case CimPackage.CIM_STORAGE_HARDWARE_ID__OTHER_ID_TYPE:
				return getOtherIDType();
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
			case CimPackage.CIM_STORAGE_HARDWARE_ID__STORAGE_ID:
				setStorageID((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_HARDWARE_ID__ID_TYPE:
				setIDType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_HARDWARE_ID__OTHER_ID_TYPE:
				setOtherIDType((String)newValue);
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
			case CimPackage.CIM_STORAGE_HARDWARE_ID__STORAGE_ID:
				setStorageID(STORAGE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_HARDWARE_ID__ID_TYPE:
				setIDType(ID_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_HARDWARE_ID__OTHER_ID_TYPE:
				setOtherIDType(OTHER_ID_TYPE_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_HARDWARE_ID__STORAGE_ID:
				return STORAGE_ID_EDEFAULT == null ? storageID != null : !STORAGE_ID_EDEFAULT.equals(storageID);
			case CimPackage.CIM_STORAGE_HARDWARE_ID__ID_TYPE:
				return ID_TYPE_EDEFAULT == null ? idType != null : !ID_TYPE_EDEFAULT.equals(idType);
			case CimPackage.CIM_STORAGE_HARDWARE_ID__OTHER_ID_TYPE:
				return OTHER_ID_TYPE_EDEFAULT == null ? otherIDType != null : !OTHER_ID_TYPE_EDEFAULT.equals(otherIDType);
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
		result.append(" (StorageID: ");
		result.append(storageID);
		result.append(", IDType: ");
		result.append(idType);
		result.append(", OtherIDType: ");
		result.append(otherIDType);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageHardwareIDImpl

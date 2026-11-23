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

import org.dmtf.cim.CIM_FileSystemSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File System Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingDataImpl#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemSettingDataImpl#getOtherPersistenceType <em>Other Persistence Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FileSystemSettingDataImpl extends CIM_ScopedSettingDataImpl implements CIM_FileSystemSettingData {
	/**
	 * The default value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERSISTENCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistenceType() <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected Integer persistenceType = PERSISTENCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherPersistenceType() <em>Other Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PERSISTENCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherPersistenceType() <em>Other Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPersistenceType()
	 * @generated
	 * @ordered
	 */
	protected String otherPersistenceType = OTHER_PERSISTENCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileSystemSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileSystemSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPersistenceType() {
		return persistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistenceType(Integer newPersistenceType) {
		Integer oldPersistenceType = persistenceType;
		persistenceType = newPersistenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_SETTING_DATA__PERSISTENCE_TYPE, oldPersistenceType, persistenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherPersistenceType() {
		return otherPersistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherPersistenceType(String newOtherPersistenceType) {
		String oldOtherPersistenceType = otherPersistenceType;
		otherPersistenceType = newOtherPersistenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_SETTING_DATA__OTHER_PERSISTENCE_TYPE, oldOtherPersistenceType, otherPersistenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM_SETTING_DATA__PERSISTENCE_TYPE:
				return getPersistenceType();
			case CimPackage.CIM_FILE_SYSTEM_SETTING_DATA__OTHER_PERSISTENCE_TYPE:
				return getOtherPersistenceType();
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
			case CimPackage.CIM_FILE_SYSTEM_SETTING_DATA__PERSISTENCE_TYPE:
				setPersistenceType((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING_DATA__OTHER_PERSISTENCE_TYPE:
				setOtherPersistenceType((String)newValue);
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
			case CimPackage.CIM_FILE_SYSTEM_SETTING_DATA__PERSISTENCE_TYPE:
				setPersistenceType(PERSISTENCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_SETTING_DATA__OTHER_PERSISTENCE_TYPE:
				setOtherPersistenceType(OTHER_PERSISTENCE_TYPE_EDEFAULT);
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
			case CimPackage.CIM_FILE_SYSTEM_SETTING_DATA__PERSISTENCE_TYPE:
				return PERSISTENCE_TYPE_EDEFAULT == null ? persistenceType != null : !PERSISTENCE_TYPE_EDEFAULT.equals(persistenceType);
			case CimPackage.CIM_FILE_SYSTEM_SETTING_DATA__OTHER_PERSISTENCE_TYPE:
				return OTHER_PERSISTENCE_TYPE_EDEFAULT == null ? otherPersistenceType != null : !OTHER_PERSISTENCE_TYPE_EDEFAULT.equals(otherPersistenceType);
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
		result.append(" (PersistenceType: ");
		result.append(persistenceType);
		result.append(", OtherPersistenceType: ");
		result.append(otherPersistenceType);
		result.append(')');
		return result.toString();
	}

} //CIM_FileSystemSettingDataImpl

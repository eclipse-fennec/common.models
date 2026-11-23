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

import org.dmtf.cim.CIM_DatabaseStorageArea;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Database Storage Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseStorageAreaImpl#getIsSystemArea <em>Is System Area</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DatabaseStorageAreaImpl#getLastBackup <em>Last Backup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DatabaseStorageAreaImpl extends CIM_FileSystemImpl implements CIM_DatabaseStorageArea {
	/**
	 * The default value of the '{@link #getIsSystemArea() <em>Is System Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSystemArea()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SYSTEM_AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSystemArea() <em>Is System Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSystemArea()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSystemArea = IS_SYSTEM_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastBackup() <em>Last Backup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastBackup()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_BACKUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastBackup() <em>Last Backup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastBackup()
	 * @generated
	 * @ordered
	 */
	protected String lastBackup = LAST_BACKUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DatabaseStorageAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DatabaseStorageArea();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsSystemArea() {
		return isSystemArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSystemArea(Boolean newIsSystemArea) {
		Boolean oldIsSystemArea = isSystemArea;
		isSystemArea = newIsSystemArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_STORAGE_AREA__IS_SYSTEM_AREA, oldIsSystemArea, isSystemArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastBackup() {
		return lastBackup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastBackup(String newLastBackup) {
		String oldLastBackup = lastBackup;
		lastBackup = newLastBackup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DATABASE_STORAGE_AREA__LAST_BACKUP, oldLastBackup, lastBackup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DATABASE_STORAGE_AREA__IS_SYSTEM_AREA:
				return getIsSystemArea();
			case CimPackage.CIM_DATABASE_STORAGE_AREA__LAST_BACKUP:
				return getLastBackup();
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
			case CimPackage.CIM_DATABASE_STORAGE_AREA__IS_SYSTEM_AREA:
				setIsSystemArea((Boolean)newValue);
				return;
			case CimPackage.CIM_DATABASE_STORAGE_AREA__LAST_BACKUP:
				setLastBackup((String)newValue);
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
			case CimPackage.CIM_DATABASE_STORAGE_AREA__IS_SYSTEM_AREA:
				setIsSystemArea(IS_SYSTEM_AREA_EDEFAULT);
				return;
			case CimPackage.CIM_DATABASE_STORAGE_AREA__LAST_BACKUP:
				setLastBackup(LAST_BACKUP_EDEFAULT);
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
			case CimPackage.CIM_DATABASE_STORAGE_AREA__IS_SYSTEM_AREA:
				return IS_SYSTEM_AREA_EDEFAULT == null ? isSystemArea != null : !IS_SYSTEM_AREA_EDEFAULT.equals(isSystemArea);
			case CimPackage.CIM_DATABASE_STORAGE_AREA__LAST_BACKUP:
				return LAST_BACKUP_EDEFAULT == null ? lastBackup != null : !LAST_BACKUP_EDEFAULT.equals(lastBackup);
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
		result.append(" (IsSystemArea: ");
		result.append(isSystemArea);
		result.append(", LastBackup: ");
		result.append(lastBackup);
		result.append(')');
		return result.toString();
	}

} //CIM_DatabaseStorageAreaImpl

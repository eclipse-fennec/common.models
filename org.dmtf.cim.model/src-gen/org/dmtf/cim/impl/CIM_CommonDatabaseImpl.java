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

import org.dmtf.cim.CIM_CommonDatabase;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Common Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CommonDatabaseImpl#getDatabaseVersion <em>Database Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CommonDatabaseImpl#getLastBackup <em>Last Backup</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CommonDatabaseImpl#getSizeAllocated <em>Size Allocated</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CommonDatabaseImpl#getSizeUnits <em>Size Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CommonDatabaseImpl extends CIM_EnabledLogicalElementImpl implements CIM_CommonDatabase {
	/**
	 * The default value of the '{@link #getDatabaseVersion() <em>Database Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseVersion() <em>Database Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseVersion()
	 * @generated
	 * @ordered
	 */
	protected String databaseVersion = DATABASE_VERSION_EDEFAULT;

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
	 * The default value of the '{@link #getSizeAllocated() <em>Size Allocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeAllocated()
	 * @generated
	 * @ordered
	 */
	protected static final Long SIZE_ALLOCATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeAllocated() <em>Size Allocated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeAllocated()
	 * @generated
	 * @ordered
	 */
	protected Long sizeAllocated = SIZE_ALLOCATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeUnits() <em>Size Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeUnits() <em>Size Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer sizeUnits = SIZE_UNITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CommonDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CommonDatabase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatabaseVersion() {
		return databaseVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatabaseVersion(String newDatabaseVersion) {
		String oldDatabaseVersion = databaseVersion;
		databaseVersion = newDatabaseVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMMON_DATABASE__DATABASE_VERSION, oldDatabaseVersion, databaseVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMMON_DATABASE__LAST_BACKUP, oldLastBackup, lastBackup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSizeAllocated() {
		return sizeAllocated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeAllocated(Long newSizeAllocated) {
		Long oldSizeAllocated = sizeAllocated;
		sizeAllocated = newSizeAllocated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMMON_DATABASE__SIZE_ALLOCATED, oldSizeAllocated, sizeAllocated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSizeUnits() {
		return sizeUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeUnits(Integer newSizeUnits) {
		Integer oldSizeUnits = sizeUnits;
		sizeUnits = newSizeUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMMON_DATABASE__SIZE_UNITS, oldSizeUnits, sizeUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_COMMON_DATABASE__DATABASE_VERSION:
				return getDatabaseVersion();
			case CimPackage.CIM_COMMON_DATABASE__LAST_BACKUP:
				return getLastBackup();
			case CimPackage.CIM_COMMON_DATABASE__SIZE_ALLOCATED:
				return getSizeAllocated();
			case CimPackage.CIM_COMMON_DATABASE__SIZE_UNITS:
				return getSizeUnits();
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
			case CimPackage.CIM_COMMON_DATABASE__DATABASE_VERSION:
				setDatabaseVersion((String)newValue);
				return;
			case CimPackage.CIM_COMMON_DATABASE__LAST_BACKUP:
				setLastBackup((String)newValue);
				return;
			case CimPackage.CIM_COMMON_DATABASE__SIZE_ALLOCATED:
				setSizeAllocated((Long)newValue);
				return;
			case CimPackage.CIM_COMMON_DATABASE__SIZE_UNITS:
				setSizeUnits((Integer)newValue);
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
			case CimPackage.CIM_COMMON_DATABASE__DATABASE_VERSION:
				setDatabaseVersion(DATABASE_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_COMMON_DATABASE__LAST_BACKUP:
				setLastBackup(LAST_BACKUP_EDEFAULT);
				return;
			case CimPackage.CIM_COMMON_DATABASE__SIZE_ALLOCATED:
				setSizeAllocated(SIZE_ALLOCATED_EDEFAULT);
				return;
			case CimPackage.CIM_COMMON_DATABASE__SIZE_UNITS:
				setSizeUnits(SIZE_UNITS_EDEFAULT);
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
			case CimPackage.CIM_COMMON_DATABASE__DATABASE_VERSION:
				return DATABASE_VERSION_EDEFAULT == null ? databaseVersion != null : !DATABASE_VERSION_EDEFAULT.equals(databaseVersion);
			case CimPackage.CIM_COMMON_DATABASE__LAST_BACKUP:
				return LAST_BACKUP_EDEFAULT == null ? lastBackup != null : !LAST_BACKUP_EDEFAULT.equals(lastBackup);
			case CimPackage.CIM_COMMON_DATABASE__SIZE_ALLOCATED:
				return SIZE_ALLOCATED_EDEFAULT == null ? sizeAllocated != null : !SIZE_ALLOCATED_EDEFAULT.equals(sizeAllocated);
			case CimPackage.CIM_COMMON_DATABASE__SIZE_UNITS:
				return SIZE_UNITS_EDEFAULT == null ? sizeUnits != null : !SIZE_UNITS_EDEFAULT.equals(sizeUnits);
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
		result.append(" (DatabaseVersion: ");
		result.append(databaseVersion);
		result.append(", LastBackup: ");
		result.append(lastBackup);
		result.append(", SizeAllocated: ");
		result.append(sizeAllocated);
		result.append(", SizeUnits: ");
		result.append(sizeUnits);
		result.append(')');
		return result.toString();
	}

} //CIM_CommonDatabaseImpl

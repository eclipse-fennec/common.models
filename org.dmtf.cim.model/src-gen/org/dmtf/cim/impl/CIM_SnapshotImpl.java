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

import org.dmtf.cim.CIM_Snapshot;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Snapshot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SnapshotImpl#getIsSynced <em>Is Synced</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SnapshotImpl#getSyncTime <em>Sync Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SnapshotImpl extends CIM_StorageExtentImpl implements CIM_Snapshot {
	/**
	 * The default value of the '{@link #getIsSynced() <em>Is Synced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSynced()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SYNCED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSynced() <em>Is Synced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSynced()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSynced = IS_SYNCED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyncTime() <em>Sync Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncTime()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNC_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSyncTime() <em>Sync Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncTime()
	 * @generated
	 * @ordered
	 */
	protected String syncTime = SYNC_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SnapshotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Snapshot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsSynced() {
		return isSynced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSynced(Boolean newIsSynced) {
		Boolean oldIsSynced = isSynced;
		isSynced = newIsSynced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SNAPSHOT__IS_SYNCED, oldIsSynced, isSynced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSyncTime() {
		return syncTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSyncTime(String newSyncTime) {
		String oldSyncTime = syncTime;
		syncTime = newSyncTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SNAPSHOT__SYNC_TIME, oldSyncTime, syncTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SNAPSHOT__IS_SYNCED:
				return getIsSynced();
			case CimPackage.CIM_SNAPSHOT__SYNC_TIME:
				return getSyncTime();
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
			case CimPackage.CIM_SNAPSHOT__IS_SYNCED:
				setIsSynced((Boolean)newValue);
				return;
			case CimPackage.CIM_SNAPSHOT__SYNC_TIME:
				setSyncTime((String)newValue);
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
			case CimPackage.CIM_SNAPSHOT__IS_SYNCED:
				setIsSynced(IS_SYNCED_EDEFAULT);
				return;
			case CimPackage.CIM_SNAPSHOT__SYNC_TIME:
				setSyncTime(SYNC_TIME_EDEFAULT);
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
			case CimPackage.CIM_SNAPSHOT__IS_SYNCED:
				return IS_SYNCED_EDEFAULT == null ? isSynced != null : !IS_SYNCED_EDEFAULT.equals(isSynced);
			case CimPackage.CIM_SNAPSHOT__SYNC_TIME:
				return SYNC_TIME_EDEFAULT == null ? syncTime != null : !SYNC_TIME_EDEFAULT.equals(syncTime);
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
		result.append(" (IsSynced: ");
		result.append(isSynced);
		result.append(", SyncTime: ");
		result.append(syncTime);
		result.append(')');
		return result.toString();
	}

} //CIM_SnapshotImpl

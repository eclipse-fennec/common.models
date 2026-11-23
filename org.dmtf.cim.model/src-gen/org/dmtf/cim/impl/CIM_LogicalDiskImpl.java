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

import org.dmtf.cim.CIM_LogicalDisk;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Logical Disk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDiskImpl#getNumExtentsMigrating <em>Num Extents Migrating</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDiskImpl#getThinlyProvisioned <em>Thinly Provisioned</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LogicalDiskImpl extends CIM_StorageExtentImpl implements CIM_LogicalDisk {
	/**
	 * The default value of the '{@link #getNumExtentsMigrating() <em>Num Extents Migrating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumExtentsMigrating()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUM_EXTENTS_MIGRATING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumExtentsMigrating() <em>Num Extents Migrating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumExtentsMigrating()
	 * @generated
	 * @ordered
	 */
	protected Long numExtentsMigrating = NUM_EXTENTS_MIGRATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getThinlyProvisioned() <em>Thinly Provisioned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinlyProvisioned()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean THINLY_PROVISIONED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getThinlyProvisioned() <em>Thinly Provisioned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinlyProvisioned()
	 * @generated
	 * @ordered
	 */
	protected Boolean thinlyProvisioned = THINLY_PROVISIONED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LogicalDiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LogicalDisk();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumExtentsMigrating() {
		return numExtentsMigrating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumExtentsMigrating(Long newNumExtentsMigrating) {
		Long oldNumExtentsMigrating = numExtentsMigrating;
		numExtentsMigrating = newNumExtentsMigrating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DISK__NUM_EXTENTS_MIGRATING, oldNumExtentsMigrating, numExtentsMigrating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getThinlyProvisioned() {
		return thinlyProvisioned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThinlyProvisioned(Boolean newThinlyProvisioned) {
		Boolean oldThinlyProvisioned = thinlyProvisioned;
		thinlyProvisioned = newThinlyProvisioned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DISK__THINLY_PROVISIONED, oldThinlyProvisioned, thinlyProvisioned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOGICAL_DISK__NUM_EXTENTS_MIGRATING:
				return getNumExtentsMigrating();
			case CimPackage.CIM_LOGICAL_DISK__THINLY_PROVISIONED:
				return getThinlyProvisioned();
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
			case CimPackage.CIM_LOGICAL_DISK__NUM_EXTENTS_MIGRATING:
				setNumExtentsMigrating((Long)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DISK__THINLY_PROVISIONED:
				setThinlyProvisioned((Boolean)newValue);
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
			case CimPackage.CIM_LOGICAL_DISK__NUM_EXTENTS_MIGRATING:
				setNumExtentsMigrating(NUM_EXTENTS_MIGRATING_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_DISK__THINLY_PROVISIONED:
				setThinlyProvisioned(THINLY_PROVISIONED_EDEFAULT);
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
			case CimPackage.CIM_LOGICAL_DISK__NUM_EXTENTS_MIGRATING:
				return NUM_EXTENTS_MIGRATING_EDEFAULT == null ? numExtentsMigrating != null : !NUM_EXTENTS_MIGRATING_EDEFAULT.equals(numExtentsMigrating);
			case CimPackage.CIM_LOGICAL_DISK__THINLY_PROVISIONED:
				return THINLY_PROVISIONED_EDEFAULT == null ? thinlyProvisioned != null : !THINLY_PROVISIONED_EDEFAULT.equals(thinlyProvisioned);
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
		result.append(" (NumExtentsMigrating: ");
		result.append(numExtentsMigrating);
		result.append(", ThinlyProvisioned: ");
		result.append(thinlyProvisioned);
		result.append(')');
		return result.toString();
	}

} //CIM_LogicalDiskImpl

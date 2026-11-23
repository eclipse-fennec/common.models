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

import org.dmtf.cim.CIM_SnapshotOfExtent;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Snapshot Of Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SnapshotOfExtentImpl#getSnapshotType <em>Snapshot Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SnapshotOfExtentImpl extends CIM_DependencyImpl implements CIM_SnapshotOfExtent {
	/**
	 * The default value of the '{@link #getSnapshotType() <em>Snapshot Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapshotType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SNAPSHOT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSnapshotType() <em>Snapshot Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapshotType()
	 * @generated
	 * @ordered
	 */
	protected Integer snapshotType = SNAPSHOT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SnapshotOfExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SnapshotOfExtent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSnapshotType() {
		return snapshotType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSnapshotType(Integer newSnapshotType) {
		Integer oldSnapshotType = snapshotType;
		snapshotType = newSnapshotType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SNAPSHOT_OF_EXTENT__SNAPSHOT_TYPE, oldSnapshotType, snapshotType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SNAPSHOT_OF_EXTENT__SNAPSHOT_TYPE:
				return getSnapshotType();
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
			case CimPackage.CIM_SNAPSHOT_OF_EXTENT__SNAPSHOT_TYPE:
				setSnapshotType((Integer)newValue);
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
			case CimPackage.CIM_SNAPSHOT_OF_EXTENT__SNAPSHOT_TYPE:
				setSnapshotType(SNAPSHOT_TYPE_EDEFAULT);
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
			case CimPackage.CIM_SNAPSHOT_OF_EXTENT__SNAPSHOT_TYPE:
				return SNAPSHOT_TYPE_EDEFAULT == null ? snapshotType != null : !SNAPSHOT_TYPE_EDEFAULT.equals(snapshotType);
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
		result.append(" (SnapshotType: ");
		result.append(snapshotType);
		result.append(')');
		return result.toString();
	}

} //CIM_SnapshotOfExtentImpl

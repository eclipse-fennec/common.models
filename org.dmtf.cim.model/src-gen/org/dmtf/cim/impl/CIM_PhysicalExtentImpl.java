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

import org.dmtf.cim.CIM_PhysicalExtent;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Physical Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalExtentImpl#getUnitsBeforeCheckDataInterleave <em>Units Before Check Data Interleave</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalExtentImpl#getUnitsOfCheckData <em>Units Of Check Data</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalExtentImpl#getUnitsOfUserData <em>Units Of User Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PhysicalExtentImpl extends CIM_StorageExtentImpl implements CIM_PhysicalExtent {
	/**
	 * The default value of the '{@link #getUnitsBeforeCheckDataInterleave() <em>Units Before Check Data Interleave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsBeforeCheckDataInterleave()
	 * @generated
	 * @ordered
	 */
	protected static final Long UNITS_BEFORE_CHECK_DATA_INTERLEAVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitsBeforeCheckDataInterleave() <em>Units Before Check Data Interleave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsBeforeCheckDataInterleave()
	 * @generated
	 * @ordered
	 */
	protected Long unitsBeforeCheckDataInterleave = UNITS_BEFORE_CHECK_DATA_INTERLEAVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitsOfCheckData() <em>Units Of Check Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsOfCheckData()
	 * @generated
	 * @ordered
	 */
	protected static final Long UNITS_OF_CHECK_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitsOfCheckData() <em>Units Of Check Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsOfCheckData()
	 * @generated
	 * @ordered
	 */
	protected Long unitsOfCheckData = UNITS_OF_CHECK_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitsOfUserData() <em>Units Of User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsOfUserData()
	 * @generated
	 * @ordered
	 */
	protected static final Long UNITS_OF_USER_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitsOfUserData() <em>Units Of User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsOfUserData()
	 * @generated
	 * @ordered
	 */
	protected Long unitsOfUserData = UNITS_OF_USER_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PhysicalExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PhysicalExtent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUnitsBeforeCheckDataInterleave() {
		return unitsBeforeCheckDataInterleave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitsBeforeCheckDataInterleave(Long newUnitsBeforeCheckDataInterleave) {
		Long oldUnitsBeforeCheckDataInterleave = unitsBeforeCheckDataInterleave;
		unitsBeforeCheckDataInterleave = newUnitsBeforeCheckDataInterleave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_EXTENT__UNITS_BEFORE_CHECK_DATA_INTERLEAVE, oldUnitsBeforeCheckDataInterleave, unitsBeforeCheckDataInterleave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUnitsOfCheckData() {
		return unitsOfCheckData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitsOfCheckData(Long newUnitsOfCheckData) {
		Long oldUnitsOfCheckData = unitsOfCheckData;
		unitsOfCheckData = newUnitsOfCheckData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_EXTENT__UNITS_OF_CHECK_DATA, oldUnitsOfCheckData, unitsOfCheckData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUnitsOfUserData() {
		return unitsOfUserData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitsOfUserData(Long newUnitsOfUserData) {
		Long oldUnitsOfUserData = unitsOfUserData;
		unitsOfUserData = newUnitsOfUserData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_EXTENT__UNITS_OF_USER_DATA, oldUnitsOfUserData, unitsOfUserData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_EXTENT__UNITS_BEFORE_CHECK_DATA_INTERLEAVE:
				return getUnitsBeforeCheckDataInterleave();
			case CimPackage.CIM_PHYSICAL_EXTENT__UNITS_OF_CHECK_DATA:
				return getUnitsOfCheckData();
			case CimPackage.CIM_PHYSICAL_EXTENT__UNITS_OF_USER_DATA:
				return getUnitsOfUserData();
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
			case CimPackage.CIM_PHYSICAL_EXTENT__UNITS_BEFORE_CHECK_DATA_INTERLEAVE:
				setUnitsBeforeCheckDataInterleave((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_EXTENT__UNITS_OF_CHECK_DATA:
				setUnitsOfCheckData((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_EXTENT__UNITS_OF_USER_DATA:
				setUnitsOfUserData((Long)newValue);
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
			case CimPackage.CIM_PHYSICAL_EXTENT__UNITS_BEFORE_CHECK_DATA_INTERLEAVE:
				setUnitsBeforeCheckDataInterleave(UNITS_BEFORE_CHECK_DATA_INTERLEAVE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_EXTENT__UNITS_OF_CHECK_DATA:
				setUnitsOfCheckData(UNITS_OF_CHECK_DATA_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_EXTENT__UNITS_OF_USER_DATA:
				setUnitsOfUserData(UNITS_OF_USER_DATA_EDEFAULT);
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
			case CimPackage.CIM_PHYSICAL_EXTENT__UNITS_BEFORE_CHECK_DATA_INTERLEAVE:
				return UNITS_BEFORE_CHECK_DATA_INTERLEAVE_EDEFAULT == null ? unitsBeforeCheckDataInterleave != null : !UNITS_BEFORE_CHECK_DATA_INTERLEAVE_EDEFAULT.equals(unitsBeforeCheckDataInterleave);
			case CimPackage.CIM_PHYSICAL_EXTENT__UNITS_OF_CHECK_DATA:
				return UNITS_OF_CHECK_DATA_EDEFAULT == null ? unitsOfCheckData != null : !UNITS_OF_CHECK_DATA_EDEFAULT.equals(unitsOfCheckData);
			case CimPackage.CIM_PHYSICAL_EXTENT__UNITS_OF_USER_DATA:
				return UNITS_OF_USER_DATA_EDEFAULT == null ? unitsOfUserData != null : !UNITS_OF_USER_DATA_EDEFAULT.equals(unitsOfUserData);
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
		result.append(" (UnitsBeforeCheckDataInterleave: ");
		result.append(unitsBeforeCheckDataInterleave);
		result.append(", UnitsOfCheckData: ");
		result.append(unitsOfCheckData);
		result.append(", UnitsOfUserData: ");
		result.append(unitsOfUserData);
		result.append(')');
		return result.toString();
	}

} //CIM_PhysicalExtentImpl

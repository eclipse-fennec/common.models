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

import org.dmtf.cim.CIM_StorageRedundancySet;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Redundancy Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageRedundancySetImpl#getTypeOfAlgorithm <em>Type Of Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageRedundancySetImpl#getOtherAlgorithm <em>Other Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageRedundancySetImpl extends CIM_RedundancySetImpl implements CIM_StorageRedundancySet {
	/**
	 * The default value of the '{@link #getTypeOfAlgorithm() <em>Type Of Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYPE_OF_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeOfAlgorithm() <em>Type Of Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected Integer typeOfAlgorithm = TYPE_OF_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAlgorithm() <em>Other Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAlgorithm() <em>Other Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String otherAlgorithm = OTHER_ALGORITHM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageRedundancySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageRedundancySet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTypeOfAlgorithm() {
		return typeOfAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeOfAlgorithm(Integer newTypeOfAlgorithm) {
		Integer oldTypeOfAlgorithm = typeOfAlgorithm;
		typeOfAlgorithm = newTypeOfAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REDUNDANCY_SET__TYPE_OF_ALGORITHM, oldTypeOfAlgorithm, typeOfAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherAlgorithm() {
		return otherAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherAlgorithm(String newOtherAlgorithm) {
		String oldOtherAlgorithm = otherAlgorithm;
		otherAlgorithm = newOtherAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REDUNDANCY_SET__OTHER_ALGORITHM, oldOtherAlgorithm, otherAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_REDUNDANCY_SET__TYPE_OF_ALGORITHM:
				return getTypeOfAlgorithm();
			case CimPackage.CIM_STORAGE_REDUNDANCY_SET__OTHER_ALGORITHM:
				return getOtherAlgorithm();
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
			case CimPackage.CIM_STORAGE_REDUNDANCY_SET__TYPE_OF_ALGORITHM:
				setTypeOfAlgorithm((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REDUNDANCY_SET__OTHER_ALGORITHM:
				setOtherAlgorithm((String)newValue);
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
			case CimPackage.CIM_STORAGE_REDUNDANCY_SET__TYPE_OF_ALGORITHM:
				setTypeOfAlgorithm(TYPE_OF_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REDUNDANCY_SET__OTHER_ALGORITHM:
				setOtherAlgorithm(OTHER_ALGORITHM_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_REDUNDANCY_SET__TYPE_OF_ALGORITHM:
				return TYPE_OF_ALGORITHM_EDEFAULT == null ? typeOfAlgorithm != null : !TYPE_OF_ALGORITHM_EDEFAULT.equals(typeOfAlgorithm);
			case CimPackage.CIM_STORAGE_REDUNDANCY_SET__OTHER_ALGORITHM:
				return OTHER_ALGORITHM_EDEFAULT == null ? otherAlgorithm != null : !OTHER_ALGORITHM_EDEFAULT.equals(otherAlgorithm);
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
		result.append(" (TypeOfAlgorithm: ");
		result.append(typeOfAlgorithm);
		result.append(", OtherAlgorithm: ");
		result.append(otherAlgorithm);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageRedundancySetImpl

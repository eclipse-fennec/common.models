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

import org.dmtf.cim.CIM_StorageRedundancyGroup;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Redundancy Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageRedundancyGroupImpl#getTypeOfAlgorithm <em>Type Of Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageRedundancyGroupImpl#getStorageRedundancy <em>Storage Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageRedundancyGroupImpl#getIsStriped <em>Is Striped</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageRedundancyGroupImpl#getIsConcatenated <em>Is Concatenated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageRedundancyGroupImpl extends CIM_RedundancyGroupImpl implements CIM_StorageRedundancyGroup {
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
	 * The default value of the '{@link #getStorageRedundancy() <em>Storage Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageRedundancy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STORAGE_REDUNDANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageRedundancy() <em>Storage Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageRedundancy()
	 * @generated
	 * @ordered
	 */
	protected Integer storageRedundancy = STORAGE_REDUNDANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsStriped() <em>Is Striped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStriped()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_STRIPED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsStriped() <em>Is Striped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsStriped()
	 * @generated
	 * @ordered
	 */
	protected Boolean isStriped = IS_STRIPED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsConcatenated() <em>Is Concatenated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConcatenated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONCATENATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsConcatenated() <em>Is Concatenated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConcatenated()
	 * @generated
	 * @ordered
	 */
	protected Boolean isConcatenated = IS_CONCATENATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageRedundancyGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageRedundancyGroup();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__TYPE_OF_ALGORITHM, oldTypeOfAlgorithm, typeOfAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStorageRedundancy() {
		return storageRedundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageRedundancy(Integer newStorageRedundancy) {
		Integer oldStorageRedundancy = storageRedundancy;
		storageRedundancy = newStorageRedundancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__STORAGE_REDUNDANCY, oldStorageRedundancy, storageRedundancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsStriped() {
		return isStriped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsStriped(Boolean newIsStriped) {
		Boolean oldIsStriped = isStriped;
		isStriped = newIsStriped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__IS_STRIPED, oldIsStriped, isStriped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsConcatenated() {
		return isConcatenated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConcatenated(Boolean newIsConcatenated) {
		Boolean oldIsConcatenated = isConcatenated;
		isConcatenated = newIsConcatenated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__IS_CONCATENATED, oldIsConcatenated, isConcatenated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__TYPE_OF_ALGORITHM:
				return getTypeOfAlgorithm();
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__STORAGE_REDUNDANCY:
				return getStorageRedundancy();
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__IS_STRIPED:
				return getIsStriped();
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__IS_CONCATENATED:
				return getIsConcatenated();
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
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__TYPE_OF_ALGORITHM:
				setTypeOfAlgorithm((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__STORAGE_REDUNDANCY:
				setStorageRedundancy((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__IS_STRIPED:
				setIsStriped((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__IS_CONCATENATED:
				setIsConcatenated((Boolean)newValue);
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
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__TYPE_OF_ALGORITHM:
				setTypeOfAlgorithm(TYPE_OF_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__STORAGE_REDUNDANCY:
				setStorageRedundancy(STORAGE_REDUNDANCY_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__IS_STRIPED:
				setIsStriped(IS_STRIPED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__IS_CONCATENATED:
				setIsConcatenated(IS_CONCATENATED_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__TYPE_OF_ALGORITHM:
				return TYPE_OF_ALGORITHM_EDEFAULT == null ? typeOfAlgorithm != null : !TYPE_OF_ALGORITHM_EDEFAULT.equals(typeOfAlgorithm);
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__STORAGE_REDUNDANCY:
				return STORAGE_REDUNDANCY_EDEFAULT == null ? storageRedundancy != null : !STORAGE_REDUNDANCY_EDEFAULT.equals(storageRedundancy);
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__IS_STRIPED:
				return IS_STRIPED_EDEFAULT == null ? isStriped != null : !IS_STRIPED_EDEFAULT.equals(isStriped);
			case CimPackage.CIM_STORAGE_REDUNDANCY_GROUP__IS_CONCATENATED:
				return IS_CONCATENATED_EDEFAULT == null ? isConcatenated != null : !IS_CONCATENATED_EDEFAULT.equals(isConcatenated);
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
		result.append(", StorageRedundancy: ");
		result.append(storageRedundancy);
		result.append(", IsStriped: ");
		result.append(isStriped);
		result.append(", IsConcatenated: ");
		result.append(isConcatenated);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageRedundancyGroupImpl

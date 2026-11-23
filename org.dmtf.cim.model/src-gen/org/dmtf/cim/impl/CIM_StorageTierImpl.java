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

import org.dmtf.cim.CIM_StorageTier;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Tier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageTierImpl#getRelativePerformanceOrder <em>Relative Performance Order</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageTierImpl#getStorageObjectType <em>Storage Object Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageTierImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageTierImpl#getState <em>State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageTierImpl#getDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageTierImpl#getDeleteOnEmptyStorageTier <em>Delete On Empty Storage Tier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageTierImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageTierImpl#getTotalCapacity <em>Total Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageTierImpl extends CIM_SystemSpecificCollectionImpl implements CIM_StorageTier {
	/**
	 * The default value of the '{@link #getRelativePerformanceOrder() <em>Relative Performance Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RELATIVE_PERFORMANCE_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePerformanceOrder() <em>Relative Performance Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrder()
	 * @generated
	 * @ordered
	 */
	protected Integer relativePerformanceOrder = RELATIVE_PERFORMANCE_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageObjectType() <em>Storage Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageObjectType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STORAGE_OBJECT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageObjectType() <em>Storage Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageObjectType()
	 * @generated
	 * @ordered
	 */
	protected Integer storageObjectType = STORAGE_OBJECT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected Integer technology = TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected Integer state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDynamic() <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DYNAMIC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getDynamic() <em>Dynamic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamic()
	 * @generated
	 * @ordered
	 */
	protected Boolean dynamic = DYNAMIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeleteOnEmptyStorageTier() <em>Delete On Empty Storage Tier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnEmptyStorageTier()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELETE_ON_EMPTY_STORAGE_TIER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getDeleteOnEmptyStorageTier() <em>Delete On Empty Storage Tier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnEmptyStorageTier()
	 * @generated
	 * @ordered
	 */
	protected Boolean deleteOnEmptyStorageTier = DELETE_ON_EMPTY_STORAGE_TIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected Integer percentage = PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalCapacity() <em>Total Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalCapacity() <em>Total Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long totalCapacity = TOTAL_CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageTierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageTier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRelativePerformanceOrder() {
		return relativePerformanceOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePerformanceOrder(Integer newRelativePerformanceOrder) {
		Integer oldRelativePerformanceOrder = relativePerformanceOrder;
		relativePerformanceOrder = newRelativePerformanceOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_TIER__RELATIVE_PERFORMANCE_ORDER, oldRelativePerformanceOrder, relativePerformanceOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStorageObjectType() {
		return storageObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageObjectType(Integer newStorageObjectType) {
		Integer oldStorageObjectType = storageObjectType;
		storageObjectType = newStorageObjectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_TIER__STORAGE_OBJECT_TYPE, oldStorageObjectType, storageObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechnology(Integer newTechnology) {
		Integer oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_TIER__TECHNOLOGY, oldTechnology, technology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(Integer newState) {
		Integer oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_TIER__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDynamic() {
		return dynamic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDynamic(Boolean newDynamic) {
		Boolean oldDynamic = dynamic;
		dynamic = newDynamic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_TIER__DYNAMIC, oldDynamic, dynamic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeleteOnEmptyStorageTier() {
		return deleteOnEmptyStorageTier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteOnEmptyStorageTier(Boolean newDeleteOnEmptyStorageTier) {
		Boolean oldDeleteOnEmptyStorageTier = deleteOnEmptyStorageTier;
		deleteOnEmptyStorageTier = newDeleteOnEmptyStorageTier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_TIER__DELETE_ON_EMPTY_STORAGE_TIER, oldDeleteOnEmptyStorageTier, deleteOnEmptyStorageTier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentage(Integer newPercentage) {
		Integer oldPercentage = percentage;
		percentage = newPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_TIER__PERCENTAGE, oldPercentage, percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalCapacity() {
		return totalCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalCapacity(Long newTotalCapacity) {
		Long oldTotalCapacity = totalCapacity;
		totalCapacity = newTotalCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_TIER__TOTAL_CAPACITY, oldTotalCapacity, totalCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_TIER__RELATIVE_PERFORMANCE_ORDER:
				return getRelativePerformanceOrder();
			case CimPackage.CIM_STORAGE_TIER__STORAGE_OBJECT_TYPE:
				return getStorageObjectType();
			case CimPackage.CIM_STORAGE_TIER__TECHNOLOGY:
				return getTechnology();
			case CimPackage.CIM_STORAGE_TIER__STATE:
				return getState();
			case CimPackage.CIM_STORAGE_TIER__DYNAMIC:
				return getDynamic();
			case CimPackage.CIM_STORAGE_TIER__DELETE_ON_EMPTY_STORAGE_TIER:
				return getDeleteOnEmptyStorageTier();
			case CimPackage.CIM_STORAGE_TIER__PERCENTAGE:
				return getPercentage();
			case CimPackage.CIM_STORAGE_TIER__TOTAL_CAPACITY:
				return getTotalCapacity();
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
			case CimPackage.CIM_STORAGE_TIER__RELATIVE_PERFORMANCE_ORDER:
				setRelativePerformanceOrder((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_TIER__STORAGE_OBJECT_TYPE:
				setStorageObjectType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_TIER__TECHNOLOGY:
				setTechnology((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_TIER__STATE:
				setState((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_TIER__DYNAMIC:
				setDynamic((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_TIER__DELETE_ON_EMPTY_STORAGE_TIER:
				setDeleteOnEmptyStorageTier((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_TIER__PERCENTAGE:
				setPercentage((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_TIER__TOTAL_CAPACITY:
				setTotalCapacity((Long)newValue);
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
			case CimPackage.CIM_STORAGE_TIER__RELATIVE_PERFORMANCE_ORDER:
				setRelativePerformanceOrder(RELATIVE_PERFORMANCE_ORDER_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_TIER__STORAGE_OBJECT_TYPE:
				setStorageObjectType(STORAGE_OBJECT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_TIER__TECHNOLOGY:
				setTechnology(TECHNOLOGY_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_TIER__STATE:
				setState(STATE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_TIER__DYNAMIC:
				setDynamic(DYNAMIC_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_TIER__DELETE_ON_EMPTY_STORAGE_TIER:
				setDeleteOnEmptyStorageTier(DELETE_ON_EMPTY_STORAGE_TIER_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_TIER__PERCENTAGE:
				setPercentage(PERCENTAGE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_TIER__TOTAL_CAPACITY:
				setTotalCapacity(TOTAL_CAPACITY_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_TIER__RELATIVE_PERFORMANCE_ORDER:
				return RELATIVE_PERFORMANCE_ORDER_EDEFAULT == null ? relativePerformanceOrder != null : !RELATIVE_PERFORMANCE_ORDER_EDEFAULT.equals(relativePerformanceOrder);
			case CimPackage.CIM_STORAGE_TIER__STORAGE_OBJECT_TYPE:
				return STORAGE_OBJECT_TYPE_EDEFAULT == null ? storageObjectType != null : !STORAGE_OBJECT_TYPE_EDEFAULT.equals(storageObjectType);
			case CimPackage.CIM_STORAGE_TIER__TECHNOLOGY:
				return TECHNOLOGY_EDEFAULT == null ? technology != null : !TECHNOLOGY_EDEFAULT.equals(technology);
			case CimPackage.CIM_STORAGE_TIER__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case CimPackage.CIM_STORAGE_TIER__DYNAMIC:
				return DYNAMIC_EDEFAULT == null ? dynamic != null : !DYNAMIC_EDEFAULT.equals(dynamic);
			case CimPackage.CIM_STORAGE_TIER__DELETE_ON_EMPTY_STORAGE_TIER:
				return DELETE_ON_EMPTY_STORAGE_TIER_EDEFAULT == null ? deleteOnEmptyStorageTier != null : !DELETE_ON_EMPTY_STORAGE_TIER_EDEFAULT.equals(deleteOnEmptyStorageTier);
			case CimPackage.CIM_STORAGE_TIER__PERCENTAGE:
				return PERCENTAGE_EDEFAULT == null ? percentage != null : !PERCENTAGE_EDEFAULT.equals(percentage);
			case CimPackage.CIM_STORAGE_TIER__TOTAL_CAPACITY:
				return TOTAL_CAPACITY_EDEFAULT == null ? totalCapacity != null : !TOTAL_CAPACITY_EDEFAULT.equals(totalCapacity);
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
		result.append(" (RelativePerformanceOrder: ");
		result.append(relativePerformanceOrder);
		result.append(", StorageObjectType: ");
		result.append(storageObjectType);
		result.append(", Technology: ");
		result.append(technology);
		result.append(", State: ");
		result.append(state);
		result.append(", Dynamic: ");
		result.append(dynamic);
		result.append(", DeleteOnEmptyStorageTier: ");
		result.append(deleteOnEmptyStorageTier);
		result.append(", Percentage: ");
		result.append(percentage);
		result.append(", TotalCapacity: ");
		result.append(totalCapacity);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageTierImpl

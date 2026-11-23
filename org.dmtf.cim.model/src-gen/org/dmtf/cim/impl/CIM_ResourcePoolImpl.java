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

import org.dmtf.cim.CIM_ResourcePool;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Resource Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourcePoolImpl#getPoolID <em>Pool ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourcePoolImpl#getPrimordial <em>Primordial</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourcePoolImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourcePoolImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourcePoolImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourcePoolImpl#getOtherResourceType <em>Other Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourcePoolImpl#getResourceSubType <em>Resource Sub Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourcePoolImpl#getAllocationUnits <em>Allocation Units</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourcePoolImpl#getConsumedResourceUnits <em>Consumed Resource Units</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourcePoolImpl#getCurrentlyConsumedResource <em>Currently Consumed Resource</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourcePoolImpl#getMaxConsumableResource <em>Max Consumable Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ResourcePoolImpl extends CIM_LogicalElementImpl implements CIM_ResourcePool {
	/**
	 * The default value of the '{@link #getPoolID() <em>Pool ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolID()
	 * @generated
	 * @ordered
	 */
	protected static final String POOL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoolID() <em>Pool ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolID()
	 * @generated
	 * @ordered
	 */
	protected String poolID = POOL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimordial() <em>Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimordial()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRIMORDIAL_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getPrimordial() <em>Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimordial()
	 * @generated
	 * @ordered
	 */
	protected Boolean primordial = PRIMORDIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final Long RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected Long reserved = RESERVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESOURCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceType() <em>Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceType()
	 * @generated
	 * @ordered
	 */
	protected Integer resourceType = RESOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherResourceType() <em>Other Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherResourceType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_RESOURCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherResourceType() <em>Other Resource Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherResourceType()
	 * @generated
	 * @ordered
	 */
	protected String otherResourceType = OTHER_RESOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceSubType() <em>Resource Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSubType()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_SUB_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceSubType() <em>Resource Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSubType()
	 * @generated
	 * @ordered
	 */
	protected String resourceSubType = RESOURCE_SUB_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllocationUnits() <em>Allocation Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOCATION_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllocationUnits() <em>Allocation Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationUnits()
	 * @generated
	 * @ordered
	 */
	protected String allocationUnits = ALLOCATION_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsumedResourceUnits() <em>Consumed Resource Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedResourceUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSUMED_RESOURCE_UNITS_EDEFAULT = "count";

	/**
	 * The cached value of the '{@link #getConsumedResourceUnits() <em>Consumed Resource Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedResourceUnits()
	 * @generated
	 * @ordered
	 */
	protected String consumedResourceUnits = CONSUMED_RESOURCE_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentlyConsumedResource() <em>Currently Consumed Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlyConsumedResource()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENTLY_CONSUMED_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentlyConsumedResource() <em>Currently Consumed Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlyConsumedResource()
	 * @generated
	 * @ordered
	 */
	protected Long currentlyConsumedResource = CURRENTLY_CONSUMED_RESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxConsumableResource() <em>Max Consumable Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConsumableResource()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_CONSUMABLE_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxConsumableResource() <em>Max Consumable Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConsumableResource()
	 * @generated
	 * @ordered
	 */
	protected Long maxConsumableResource = MAX_CONSUMABLE_RESOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ResourcePoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ResourcePool();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPoolID() {
		return poolID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoolID(String newPoolID) {
		String oldPoolID = poolID;
		poolID = newPoolID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_POOL__POOL_ID, oldPoolID, poolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPrimordial() {
		return primordial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimordial(Boolean newPrimordial) {
		Boolean oldPrimordial = primordial;
		primordial = newPrimordial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_POOL__PRIMORDIAL, oldPrimordial, primordial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(Long newCapacity) {
		Long oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_POOL__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReserved(Long newReserved) {
		Long oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_POOL__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getResourceType() {
		return resourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceType(Integer newResourceType) {
		Integer oldResourceType = resourceType;
		resourceType = newResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_POOL__RESOURCE_TYPE, oldResourceType, resourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherResourceType() {
		return otherResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherResourceType(String newOtherResourceType) {
		String oldOtherResourceType = otherResourceType;
		otherResourceType = newOtherResourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_POOL__OTHER_RESOURCE_TYPE, oldOtherResourceType, otherResourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceSubType() {
		return resourceSubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceSubType(String newResourceSubType) {
		String oldResourceSubType = resourceSubType;
		resourceSubType = newResourceSubType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_POOL__RESOURCE_SUB_TYPE, oldResourceSubType, resourceSubType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllocationUnits() {
		return allocationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocationUnits(String newAllocationUnits) {
		String oldAllocationUnits = allocationUnits;
		allocationUnits = newAllocationUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_POOL__ALLOCATION_UNITS, oldAllocationUnits, allocationUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConsumedResourceUnits() {
		return consumedResourceUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsumedResourceUnits(String newConsumedResourceUnits) {
		String oldConsumedResourceUnits = consumedResourceUnits;
		consumedResourceUnits = newConsumedResourceUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_POOL__CONSUMED_RESOURCE_UNITS, oldConsumedResourceUnits, consumedResourceUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentlyConsumedResource() {
		return currentlyConsumedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentlyConsumedResource(Long newCurrentlyConsumedResource) {
		Long oldCurrentlyConsumedResource = currentlyConsumedResource;
		currentlyConsumedResource = newCurrentlyConsumedResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_POOL__CURRENTLY_CONSUMED_RESOURCE, oldCurrentlyConsumedResource, currentlyConsumedResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxConsumableResource() {
		return maxConsumableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxConsumableResource(Long newMaxConsumableResource) {
		Long oldMaxConsumableResource = maxConsumableResource;
		maxConsumableResource = newMaxConsumableResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_POOL__MAX_CONSUMABLE_RESOURCE, oldMaxConsumableResource, maxConsumableResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_RESOURCE_POOL__POOL_ID:
				return getPoolID();
			case CimPackage.CIM_RESOURCE_POOL__PRIMORDIAL:
				return getPrimordial();
			case CimPackage.CIM_RESOURCE_POOL__CAPACITY:
				return getCapacity();
			case CimPackage.CIM_RESOURCE_POOL__RESERVED:
				return getReserved();
			case CimPackage.CIM_RESOURCE_POOL__RESOURCE_TYPE:
				return getResourceType();
			case CimPackage.CIM_RESOURCE_POOL__OTHER_RESOURCE_TYPE:
				return getOtherResourceType();
			case CimPackage.CIM_RESOURCE_POOL__RESOURCE_SUB_TYPE:
				return getResourceSubType();
			case CimPackage.CIM_RESOURCE_POOL__ALLOCATION_UNITS:
				return getAllocationUnits();
			case CimPackage.CIM_RESOURCE_POOL__CONSUMED_RESOURCE_UNITS:
				return getConsumedResourceUnits();
			case CimPackage.CIM_RESOURCE_POOL__CURRENTLY_CONSUMED_RESOURCE:
				return getCurrentlyConsumedResource();
			case CimPackage.CIM_RESOURCE_POOL__MAX_CONSUMABLE_RESOURCE:
				return getMaxConsumableResource();
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
			case CimPackage.CIM_RESOURCE_POOL__POOL_ID:
				setPoolID((String)newValue);
				return;
			case CimPackage.CIM_RESOURCE_POOL__PRIMORDIAL:
				setPrimordial((Boolean)newValue);
				return;
			case CimPackage.CIM_RESOURCE_POOL__CAPACITY:
				setCapacity((Long)newValue);
				return;
			case CimPackage.CIM_RESOURCE_POOL__RESERVED:
				setReserved((Long)newValue);
				return;
			case CimPackage.CIM_RESOURCE_POOL__RESOURCE_TYPE:
				setResourceType((Integer)newValue);
				return;
			case CimPackage.CIM_RESOURCE_POOL__OTHER_RESOURCE_TYPE:
				setOtherResourceType((String)newValue);
				return;
			case CimPackage.CIM_RESOURCE_POOL__RESOURCE_SUB_TYPE:
				setResourceSubType((String)newValue);
				return;
			case CimPackage.CIM_RESOURCE_POOL__ALLOCATION_UNITS:
				setAllocationUnits((String)newValue);
				return;
			case CimPackage.CIM_RESOURCE_POOL__CONSUMED_RESOURCE_UNITS:
				setConsumedResourceUnits((String)newValue);
				return;
			case CimPackage.CIM_RESOURCE_POOL__CURRENTLY_CONSUMED_RESOURCE:
				setCurrentlyConsumedResource((Long)newValue);
				return;
			case CimPackage.CIM_RESOURCE_POOL__MAX_CONSUMABLE_RESOURCE:
				setMaxConsumableResource((Long)newValue);
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
			case CimPackage.CIM_RESOURCE_POOL__POOL_ID:
				setPoolID(POOL_ID_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_POOL__PRIMORDIAL:
				setPrimordial(PRIMORDIAL_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_POOL__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_POOL__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_POOL__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_POOL__OTHER_RESOURCE_TYPE:
				setOtherResourceType(OTHER_RESOURCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_POOL__RESOURCE_SUB_TYPE:
				setResourceSubType(RESOURCE_SUB_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_POOL__ALLOCATION_UNITS:
				setAllocationUnits(ALLOCATION_UNITS_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_POOL__CONSUMED_RESOURCE_UNITS:
				setConsumedResourceUnits(CONSUMED_RESOURCE_UNITS_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_POOL__CURRENTLY_CONSUMED_RESOURCE:
				setCurrentlyConsumedResource(CURRENTLY_CONSUMED_RESOURCE_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_POOL__MAX_CONSUMABLE_RESOURCE:
				setMaxConsumableResource(MAX_CONSUMABLE_RESOURCE_EDEFAULT);
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
			case CimPackage.CIM_RESOURCE_POOL__POOL_ID:
				return POOL_ID_EDEFAULT == null ? poolID != null : !POOL_ID_EDEFAULT.equals(poolID);
			case CimPackage.CIM_RESOURCE_POOL__PRIMORDIAL:
				return PRIMORDIAL_EDEFAULT == null ? primordial != null : !PRIMORDIAL_EDEFAULT.equals(primordial);
			case CimPackage.CIM_RESOURCE_POOL__CAPACITY:
				return CAPACITY_EDEFAULT == null ? capacity != null : !CAPACITY_EDEFAULT.equals(capacity);
			case CimPackage.CIM_RESOURCE_POOL__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case CimPackage.CIM_RESOURCE_POOL__RESOURCE_TYPE:
				return RESOURCE_TYPE_EDEFAULT == null ? resourceType != null : !RESOURCE_TYPE_EDEFAULT.equals(resourceType);
			case CimPackage.CIM_RESOURCE_POOL__OTHER_RESOURCE_TYPE:
				return OTHER_RESOURCE_TYPE_EDEFAULT == null ? otherResourceType != null : !OTHER_RESOURCE_TYPE_EDEFAULT.equals(otherResourceType);
			case CimPackage.CIM_RESOURCE_POOL__RESOURCE_SUB_TYPE:
				return RESOURCE_SUB_TYPE_EDEFAULT == null ? resourceSubType != null : !RESOURCE_SUB_TYPE_EDEFAULT.equals(resourceSubType);
			case CimPackage.CIM_RESOURCE_POOL__ALLOCATION_UNITS:
				return ALLOCATION_UNITS_EDEFAULT == null ? allocationUnits != null : !ALLOCATION_UNITS_EDEFAULT.equals(allocationUnits);
			case CimPackage.CIM_RESOURCE_POOL__CONSUMED_RESOURCE_UNITS:
				return CONSUMED_RESOURCE_UNITS_EDEFAULT == null ? consumedResourceUnits != null : !CONSUMED_RESOURCE_UNITS_EDEFAULT.equals(consumedResourceUnits);
			case CimPackage.CIM_RESOURCE_POOL__CURRENTLY_CONSUMED_RESOURCE:
				return CURRENTLY_CONSUMED_RESOURCE_EDEFAULT == null ? currentlyConsumedResource != null : !CURRENTLY_CONSUMED_RESOURCE_EDEFAULT.equals(currentlyConsumedResource);
			case CimPackage.CIM_RESOURCE_POOL__MAX_CONSUMABLE_RESOURCE:
				return MAX_CONSUMABLE_RESOURCE_EDEFAULT == null ? maxConsumableResource != null : !MAX_CONSUMABLE_RESOURCE_EDEFAULT.equals(maxConsumableResource);
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
		result.append(" (PoolID: ");
		result.append(poolID);
		result.append(", Primordial: ");
		result.append(primordial);
		result.append(", Capacity: ");
		result.append(capacity);
		result.append(", Reserved: ");
		result.append(reserved);
		result.append(", ResourceType: ");
		result.append(resourceType);
		result.append(", OtherResourceType: ");
		result.append(otherResourceType);
		result.append(", ResourceSubType: ");
		result.append(resourceSubType);
		result.append(", AllocationUnits: ");
		result.append(allocationUnits);
		result.append(", ConsumedResourceUnits: ");
		result.append(consumedResourceUnits);
		result.append(", CurrentlyConsumedResource: ");
		result.append(currentlyConsumedResource);
		result.append(", MaxConsumableResource: ");
		result.append(maxConsumableResource);
		result.append(')');
		return result.toString();
	}

} //CIM_ResourcePoolImpl

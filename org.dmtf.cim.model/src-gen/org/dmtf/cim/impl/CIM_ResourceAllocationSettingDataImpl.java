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

import java.util.Collection;

import org.dmtf.cim.CIM_ResourceAllocationSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Resource Allocation Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getResourceType <em>Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getOtherResourceType <em>Other Resource Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getResourceSubType <em>Resource Sub Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getPoolID <em>Pool ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getConsumerVisibility <em>Consumer Visibility</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getHostResource <em>Host Resource</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getAllocationUnits <em>Allocation Units</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getVirtualQuantity <em>Virtual Quantity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getReservation <em>Reservation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getAutomaticAllocation <em>Automatic Allocation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getAutomaticDeallocation <em>Automatic Deallocation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getMappingBehavior <em>Mapping Behavior</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getAddressOnParent <em>Address On Parent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourceAllocationSettingDataImpl#getVirtualQuantityUnits <em>Virtual Quantity Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ResourceAllocationSettingDataImpl extends CIM_SettingDataImpl implements CIM_ResourceAllocationSettingData {
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
	 * The default value of the '{@link #getConsumerVisibility() <em>Consumer Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONSUMER_VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumerVisibility() <em>Consumer Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumerVisibility()
	 * @generated
	 * @ordered
	 */
	protected Integer consumerVisibility = CONSUMER_VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHostResource() <em>Host Resource</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostResource()
	 * @generated
	 * @ordered
	 */
	protected EList<String> hostResource;

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
	 * The default value of the '{@link #getVirtualQuantity() <em>Virtual Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final Long VIRTUAL_QUANTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualQuantity() <em>Virtual Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualQuantity()
	 * @generated
	 * @ordered
	 */
	protected Long virtualQuantity = VIRTUAL_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservation() <em>Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected static final Long RESERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservation() <em>Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservation()
	 * @generated
	 * @ordered
	 */
	protected Long reservation = RESERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Long LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected Long limit = LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Long WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected Long weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutomaticAllocation() <em>Automatic Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticAllocation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTOMATIC_ALLOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutomaticAllocation() <em>Automatic Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticAllocation()
	 * @generated
	 * @ordered
	 */
	protected Boolean automaticAllocation = AUTOMATIC_ALLOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutomaticDeallocation() <em>Automatic Deallocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticDeallocation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTOMATIC_DEALLOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutomaticDeallocation() <em>Automatic Deallocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticDeallocation()
	 * @generated
	 * @ordered
	 */
	protected Boolean automaticDeallocation = AUTOMATIC_DEALLOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected String parent = PARENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<String> connection;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMappingBehavior() <em>Mapping Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAPPING_BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMappingBehavior() <em>Mapping Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingBehavior()
	 * @generated
	 * @ordered
	 */
	protected Integer mappingBehavior = MAPPING_BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressOnParent() <em>Address On Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressOnParent()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_ON_PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressOnParent() <em>Address On Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressOnParent()
	 * @generated
	 * @ordered
	 */
	protected String addressOnParent = ADDRESS_ON_PARENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualQuantityUnits() <em>Virtual Quantity Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualQuantityUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String VIRTUAL_QUANTITY_UNITS_EDEFAULT = "count";

	/**
	 * The cached value of the '{@link #getVirtualQuantityUnits() <em>Virtual Quantity Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualQuantityUnits()
	 * @generated
	 * @ordered
	 */
	protected String virtualQuantityUnits = VIRTUAL_QUANTITY_UNITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ResourceAllocationSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ResourceAllocationSettingData();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__RESOURCE_TYPE, oldResourceType, resourceType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__OTHER_RESOURCE_TYPE, oldOtherResourceType, otherResourceType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__RESOURCE_SUB_TYPE, oldResourceSubType, resourceSubType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__POOL_ID, oldPoolID, poolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConsumerVisibility() {
		return consumerVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsumerVisibility(Integer newConsumerVisibility) {
		Integer oldConsumerVisibility = consumerVisibility;
		consumerVisibility = newConsumerVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__CONSUMER_VISIBILITY, oldConsumerVisibility, consumerVisibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getHostResource() {
		if (hostResource == null) {
			hostResource = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__HOST_RESOURCE);
		}
		return hostResource;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__ALLOCATION_UNITS, oldAllocationUnits, allocationUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getVirtualQuantity() {
		return virtualQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualQuantity(Long newVirtualQuantity) {
		Long oldVirtualQuantity = virtualQuantity;
		virtualQuantity = newVirtualQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__VIRTUAL_QUANTITY, oldVirtualQuantity, virtualQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReservation() {
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservation(Long newReservation) {
		Long oldReservation = reservation;
		reservation = newReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__RESERVATION, oldReservation, reservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLimit(Long newLimit) {
		Long oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(Long newWeight) {
		Long oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutomaticAllocation() {
		return automaticAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaticAllocation(Boolean newAutomaticAllocation) {
		Boolean oldAutomaticAllocation = automaticAllocation;
		automaticAllocation = newAutomaticAllocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__AUTOMATIC_ALLOCATION, oldAutomaticAllocation, automaticAllocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutomaticDeallocation() {
		return automaticDeallocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaticDeallocation(Boolean newAutomaticDeallocation) {
		Boolean oldAutomaticDeallocation = automaticDeallocation;
		automaticDeallocation = newAutomaticDeallocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__AUTOMATIC_DEALLOCATION, oldAutomaticDeallocation, automaticDeallocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(String newParent) {
		String oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getConnection() {
		if (connection == null) {
			connection = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMappingBehavior() {
		return mappingBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMappingBehavior(Integer newMappingBehavior) {
		Integer oldMappingBehavior = mappingBehavior;
		mappingBehavior = newMappingBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__MAPPING_BEHAVIOR, oldMappingBehavior, mappingBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddressOnParent() {
		return addressOnParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressOnParent(String newAddressOnParent) {
		String oldAddressOnParent = addressOnParent;
		addressOnParent = newAddressOnParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__ADDRESS_ON_PARENT, oldAddressOnParent, addressOnParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVirtualQuantityUnits() {
		return virtualQuantityUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualQuantityUnits(String newVirtualQuantityUnits) {
		String oldVirtualQuantityUnits = virtualQuantityUnits;
		virtualQuantityUnits = newVirtualQuantityUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__VIRTUAL_QUANTITY_UNITS, oldVirtualQuantityUnits, virtualQuantityUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__RESOURCE_TYPE:
				return getResourceType();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__OTHER_RESOURCE_TYPE:
				return getOtherResourceType();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__RESOURCE_SUB_TYPE:
				return getResourceSubType();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__POOL_ID:
				return getPoolID();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__CONSUMER_VISIBILITY:
				return getConsumerVisibility();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__HOST_RESOURCE:
				return getHostResource();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__ALLOCATION_UNITS:
				return getAllocationUnits();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__VIRTUAL_QUANTITY:
				return getVirtualQuantity();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__RESERVATION:
				return getReservation();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__LIMIT:
				return getLimit();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__WEIGHT:
				return getWeight();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__AUTOMATIC_ALLOCATION:
				return getAutomaticAllocation();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__AUTOMATIC_DEALLOCATION:
				return getAutomaticDeallocation();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__PARENT:
				return getParent();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__CONNECTION:
				return getConnection();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__ADDRESS:
				return getAddress();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__MAPPING_BEHAVIOR:
				return getMappingBehavior();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__ADDRESS_ON_PARENT:
				return getAddressOnParent();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__VIRTUAL_QUANTITY_UNITS:
				return getVirtualQuantityUnits();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__RESOURCE_TYPE:
				setResourceType((Integer)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__OTHER_RESOURCE_TYPE:
				setOtherResourceType((String)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__RESOURCE_SUB_TYPE:
				setResourceSubType((String)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__POOL_ID:
				setPoolID((String)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__CONSUMER_VISIBILITY:
				setConsumerVisibility((Integer)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__HOST_RESOURCE:
				getHostResource().clear();
				getHostResource().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__ALLOCATION_UNITS:
				setAllocationUnits((String)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__VIRTUAL_QUANTITY:
				setVirtualQuantity((Long)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__RESERVATION:
				setReservation((Long)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__LIMIT:
				setLimit((Long)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__WEIGHT:
				setWeight((Long)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__AUTOMATIC_ALLOCATION:
				setAutomaticAllocation((Boolean)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__AUTOMATIC_DEALLOCATION:
				setAutomaticDeallocation((Boolean)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__PARENT:
				setParent((String)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__ADDRESS:
				setAddress((String)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__MAPPING_BEHAVIOR:
				setMappingBehavior((Integer)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__ADDRESS_ON_PARENT:
				setAddressOnParent((String)newValue);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__VIRTUAL_QUANTITY_UNITS:
				setVirtualQuantityUnits((String)newValue);
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
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__RESOURCE_TYPE:
				setResourceType(RESOURCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__OTHER_RESOURCE_TYPE:
				setOtherResourceType(OTHER_RESOURCE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__RESOURCE_SUB_TYPE:
				setResourceSubType(RESOURCE_SUB_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__POOL_ID:
				setPoolID(POOL_ID_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__CONSUMER_VISIBILITY:
				setConsumerVisibility(CONSUMER_VISIBILITY_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__HOST_RESOURCE:
				getHostResource().clear();
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__ALLOCATION_UNITS:
				setAllocationUnits(ALLOCATION_UNITS_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__VIRTUAL_QUANTITY:
				setVirtualQuantity(VIRTUAL_QUANTITY_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__RESERVATION:
				setReservation(RESERVATION_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__LIMIT:
				setLimit(LIMIT_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__AUTOMATIC_ALLOCATION:
				setAutomaticAllocation(AUTOMATIC_ALLOCATION_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__AUTOMATIC_DEALLOCATION:
				setAutomaticDeallocation(AUTOMATIC_DEALLOCATION_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__PARENT:
				setParent(PARENT_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__CONNECTION:
				getConnection().clear();
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__MAPPING_BEHAVIOR:
				setMappingBehavior(MAPPING_BEHAVIOR_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__ADDRESS_ON_PARENT:
				setAddressOnParent(ADDRESS_ON_PARENT_EDEFAULT);
				return;
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__VIRTUAL_QUANTITY_UNITS:
				setVirtualQuantityUnits(VIRTUAL_QUANTITY_UNITS_EDEFAULT);
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
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__RESOURCE_TYPE:
				return RESOURCE_TYPE_EDEFAULT == null ? resourceType != null : !RESOURCE_TYPE_EDEFAULT.equals(resourceType);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__OTHER_RESOURCE_TYPE:
				return OTHER_RESOURCE_TYPE_EDEFAULT == null ? otherResourceType != null : !OTHER_RESOURCE_TYPE_EDEFAULT.equals(otherResourceType);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__RESOURCE_SUB_TYPE:
				return RESOURCE_SUB_TYPE_EDEFAULT == null ? resourceSubType != null : !RESOURCE_SUB_TYPE_EDEFAULT.equals(resourceSubType);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__POOL_ID:
				return POOL_ID_EDEFAULT == null ? poolID != null : !POOL_ID_EDEFAULT.equals(poolID);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__CONSUMER_VISIBILITY:
				return CONSUMER_VISIBILITY_EDEFAULT == null ? consumerVisibility != null : !CONSUMER_VISIBILITY_EDEFAULT.equals(consumerVisibility);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__HOST_RESOURCE:
				return hostResource != null && !hostResource.isEmpty();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__ALLOCATION_UNITS:
				return ALLOCATION_UNITS_EDEFAULT == null ? allocationUnits != null : !ALLOCATION_UNITS_EDEFAULT.equals(allocationUnits);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__VIRTUAL_QUANTITY:
				return VIRTUAL_QUANTITY_EDEFAULT == null ? virtualQuantity != null : !VIRTUAL_QUANTITY_EDEFAULT.equals(virtualQuantity);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__RESERVATION:
				return RESERVATION_EDEFAULT == null ? reservation != null : !RESERVATION_EDEFAULT.equals(reservation);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__LIMIT:
				return LIMIT_EDEFAULT == null ? limit != null : !LIMIT_EDEFAULT.equals(limit);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__AUTOMATIC_ALLOCATION:
				return AUTOMATIC_ALLOCATION_EDEFAULT == null ? automaticAllocation != null : !AUTOMATIC_ALLOCATION_EDEFAULT.equals(automaticAllocation);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__AUTOMATIC_DEALLOCATION:
				return AUTOMATIC_DEALLOCATION_EDEFAULT == null ? automaticDeallocation != null : !AUTOMATIC_DEALLOCATION_EDEFAULT.equals(automaticDeallocation);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__PARENT:
				return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT.equals(parent);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__CONNECTION:
				return connection != null && !connection.isEmpty();
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__MAPPING_BEHAVIOR:
				return MAPPING_BEHAVIOR_EDEFAULT == null ? mappingBehavior != null : !MAPPING_BEHAVIOR_EDEFAULT.equals(mappingBehavior);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__ADDRESS_ON_PARENT:
				return ADDRESS_ON_PARENT_EDEFAULT == null ? addressOnParent != null : !ADDRESS_ON_PARENT_EDEFAULT.equals(addressOnParent);
			case CimPackage.CIM_RESOURCE_ALLOCATION_SETTING_DATA__VIRTUAL_QUANTITY_UNITS:
				return VIRTUAL_QUANTITY_UNITS_EDEFAULT == null ? virtualQuantityUnits != null : !VIRTUAL_QUANTITY_UNITS_EDEFAULT.equals(virtualQuantityUnits);
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
		result.append(" (ResourceType: ");
		result.append(resourceType);
		result.append(", OtherResourceType: ");
		result.append(otherResourceType);
		result.append(", ResourceSubType: ");
		result.append(resourceSubType);
		result.append(", PoolID: ");
		result.append(poolID);
		result.append(", ConsumerVisibility: ");
		result.append(consumerVisibility);
		result.append(", HostResource: ");
		result.append(hostResource);
		result.append(", AllocationUnits: ");
		result.append(allocationUnits);
		result.append(", VirtualQuantity: ");
		result.append(virtualQuantity);
		result.append(", Reservation: ");
		result.append(reservation);
		result.append(", Limit: ");
		result.append(limit);
		result.append(", Weight: ");
		result.append(weight);
		result.append(", AutomaticAllocation: ");
		result.append(automaticAllocation);
		result.append(", AutomaticDeallocation: ");
		result.append(automaticDeallocation);
		result.append(", Parent: ");
		result.append(parent);
		result.append(", Connection: ");
		result.append(connection);
		result.append(", Address: ");
		result.append(address);
		result.append(", MappingBehavior: ");
		result.append(mappingBehavior);
		result.append(", AddressOnParent: ");
		result.append(addressOnParent);
		result.append(", VirtualQuantityUnits: ");
		result.append(virtualQuantityUnits);
		result.append(')');
		return result.toString();
	}

} //CIM_ResourceAllocationSettingDataImpl

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

import org.dmtf.cim.CIM_TierSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Tier Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierSettingDataImpl#getRelativePerformanceOrderGoal <em>Relative Performance Order Goal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierSettingDataImpl#getRelativePerformanceOrderMin <em>Relative Performance Order Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierSettingDataImpl#getRelativePerformanceOrderMax <em>Relative Performance Order Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierSettingDataImpl#getStorageObjectType <em>Storage Object Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierSettingDataImpl#getStorageTierCharacteristics <em>Storage Tier Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierSettingDataImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierSettingDataImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierSettingDataImpl#getDynamic <em>Dynamic</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierSettingDataImpl#getDeleteOnEmptyStorageTier <em>Delete On Empty Storage Tier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierSettingDataImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierSettingDataImpl#getCompressionIdleInterval <em>Compression Idle Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TierSettingDataImpl#getCompressionRate <em>Compression Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TierSettingDataImpl extends CIM_SettingDataImpl implements CIM_TierSettingData {
	/**
	 * The default value of the '{@link #getRelativePerformanceOrderGoal() <em>Relative Performance Order Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrderGoal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RELATIVE_PERFORMANCE_ORDER_GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePerformanceOrderGoal() <em>Relative Performance Order Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrderGoal()
	 * @generated
	 * @ordered
	 */
	protected Integer relativePerformanceOrderGoal = RELATIVE_PERFORMANCE_ORDER_GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativePerformanceOrderMin() <em>Relative Performance Order Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrderMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RELATIVE_PERFORMANCE_ORDER_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePerformanceOrderMin() <em>Relative Performance Order Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrderMin()
	 * @generated
	 * @ordered
	 */
	protected Integer relativePerformanceOrderMin = RELATIVE_PERFORMANCE_ORDER_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativePerformanceOrderMax() <em>Relative Performance Order Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrderMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RELATIVE_PERFORMANCE_ORDER_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePerformanceOrderMax() <em>Relative Performance Order Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePerformanceOrderMax()
	 * @generated
	 * @ordered
	 */
	protected Integer relativePerformanceOrderMax = RELATIVE_PERFORMANCE_ORDER_MAX_EDEFAULT;

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
	 * The cached value of the '{@link #getStorageTierCharacteristics() <em>Storage Tier Characteristics</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageTierCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> storageTierCharacteristics;

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
	 * The default value of the '{@link #getInitialState() <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INITIAL_STATE_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected Integer initialState = INITIAL_STATE_EDEFAULT;

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
	 * The default value of the '{@link #getCompressionIdleInterval() <em>Compression Idle Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionIdleInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPRESSION_IDLE_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressionIdleInterval() <em>Compression Idle Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionIdleInterval()
	 * @generated
	 * @ordered
	 */
	protected String compressionIdleInterval = COMPRESSION_IDLE_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompressionRate() <em>Compression Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionRate()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COMPRESSION_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressionRate() <em>Compression Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionRate()
	 * @generated
	 * @ordered
	 */
	protected Integer compressionRate = COMPRESSION_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TierSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TierSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRelativePerformanceOrderGoal() {
		return relativePerformanceOrderGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePerformanceOrderGoal(Integer newRelativePerformanceOrderGoal) {
		Integer oldRelativePerformanceOrderGoal = relativePerformanceOrderGoal;
		relativePerformanceOrderGoal = newRelativePerformanceOrderGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIER_SETTING_DATA__RELATIVE_PERFORMANCE_ORDER_GOAL, oldRelativePerformanceOrderGoal, relativePerformanceOrderGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRelativePerformanceOrderMin() {
		return relativePerformanceOrderMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePerformanceOrderMin(Integer newRelativePerformanceOrderMin) {
		Integer oldRelativePerformanceOrderMin = relativePerformanceOrderMin;
		relativePerformanceOrderMin = newRelativePerformanceOrderMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIER_SETTING_DATA__RELATIVE_PERFORMANCE_ORDER_MIN, oldRelativePerformanceOrderMin, relativePerformanceOrderMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRelativePerformanceOrderMax() {
		return relativePerformanceOrderMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePerformanceOrderMax(Integer newRelativePerformanceOrderMax) {
		Integer oldRelativePerformanceOrderMax = relativePerformanceOrderMax;
		relativePerformanceOrderMax = newRelativePerformanceOrderMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIER_SETTING_DATA__RELATIVE_PERFORMANCE_ORDER_MAX, oldRelativePerformanceOrderMax, relativePerformanceOrderMax));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIER_SETTING_DATA__STORAGE_OBJECT_TYPE, oldStorageObjectType, storageObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getStorageTierCharacteristics() {
		if (storageTierCharacteristics == null) {
			storageTierCharacteristics = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_TIER_SETTING_DATA__STORAGE_TIER_CHARACTERISTICS);
		}
		return storageTierCharacteristics;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIER_SETTING_DATA__TECHNOLOGY, oldTechnology, technology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialState(Integer newInitialState) {
		Integer oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIER_SETTING_DATA__INITIAL_STATE, oldInitialState, initialState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIER_SETTING_DATA__DYNAMIC, oldDynamic, dynamic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIER_SETTING_DATA__DELETE_ON_EMPTY_STORAGE_TIER, oldDeleteOnEmptyStorageTier, deleteOnEmptyStorageTier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIER_SETTING_DATA__PERCENTAGE, oldPercentage, percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompressionIdleInterval() {
		return compressionIdleInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompressionIdleInterval(String newCompressionIdleInterval) {
		String oldCompressionIdleInterval = compressionIdleInterval;
		compressionIdleInterval = newCompressionIdleInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIER_SETTING_DATA__COMPRESSION_IDLE_INTERVAL, oldCompressionIdleInterval, compressionIdleInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCompressionRate() {
		return compressionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompressionRate(Integer newCompressionRate) {
		Integer oldCompressionRate = compressionRate;
		compressionRate = newCompressionRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TIER_SETTING_DATA__COMPRESSION_RATE, oldCompressionRate, compressionRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TIER_SETTING_DATA__RELATIVE_PERFORMANCE_ORDER_GOAL:
				return getRelativePerformanceOrderGoal();
			case CimPackage.CIM_TIER_SETTING_DATA__RELATIVE_PERFORMANCE_ORDER_MIN:
				return getRelativePerformanceOrderMin();
			case CimPackage.CIM_TIER_SETTING_DATA__RELATIVE_PERFORMANCE_ORDER_MAX:
				return getRelativePerformanceOrderMax();
			case CimPackage.CIM_TIER_SETTING_DATA__STORAGE_OBJECT_TYPE:
				return getStorageObjectType();
			case CimPackage.CIM_TIER_SETTING_DATA__STORAGE_TIER_CHARACTERISTICS:
				return getStorageTierCharacteristics();
			case CimPackage.CIM_TIER_SETTING_DATA__TECHNOLOGY:
				return getTechnology();
			case CimPackage.CIM_TIER_SETTING_DATA__INITIAL_STATE:
				return getInitialState();
			case CimPackage.CIM_TIER_SETTING_DATA__DYNAMIC:
				return getDynamic();
			case CimPackage.CIM_TIER_SETTING_DATA__DELETE_ON_EMPTY_STORAGE_TIER:
				return getDeleteOnEmptyStorageTier();
			case CimPackage.CIM_TIER_SETTING_DATA__PERCENTAGE:
				return getPercentage();
			case CimPackage.CIM_TIER_SETTING_DATA__COMPRESSION_IDLE_INTERVAL:
				return getCompressionIdleInterval();
			case CimPackage.CIM_TIER_SETTING_DATA__COMPRESSION_RATE:
				return getCompressionRate();
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
			case CimPackage.CIM_TIER_SETTING_DATA__RELATIVE_PERFORMANCE_ORDER_GOAL:
				setRelativePerformanceOrderGoal((Integer)newValue);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__RELATIVE_PERFORMANCE_ORDER_MIN:
				setRelativePerformanceOrderMin((Integer)newValue);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__RELATIVE_PERFORMANCE_ORDER_MAX:
				setRelativePerformanceOrderMax((Integer)newValue);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__STORAGE_OBJECT_TYPE:
				setStorageObjectType((Integer)newValue);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__STORAGE_TIER_CHARACTERISTICS:
				getStorageTierCharacteristics().clear();
				getStorageTierCharacteristics().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__TECHNOLOGY:
				setTechnology((Integer)newValue);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__INITIAL_STATE:
				setInitialState((Integer)newValue);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__DYNAMIC:
				setDynamic((Boolean)newValue);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__DELETE_ON_EMPTY_STORAGE_TIER:
				setDeleteOnEmptyStorageTier((Boolean)newValue);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__PERCENTAGE:
				setPercentage((Integer)newValue);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__COMPRESSION_IDLE_INTERVAL:
				setCompressionIdleInterval((String)newValue);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__COMPRESSION_RATE:
				setCompressionRate((Integer)newValue);
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
			case CimPackage.CIM_TIER_SETTING_DATA__RELATIVE_PERFORMANCE_ORDER_GOAL:
				setRelativePerformanceOrderGoal(RELATIVE_PERFORMANCE_ORDER_GOAL_EDEFAULT);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__RELATIVE_PERFORMANCE_ORDER_MIN:
				setRelativePerformanceOrderMin(RELATIVE_PERFORMANCE_ORDER_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__RELATIVE_PERFORMANCE_ORDER_MAX:
				setRelativePerformanceOrderMax(RELATIVE_PERFORMANCE_ORDER_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__STORAGE_OBJECT_TYPE:
				setStorageObjectType(STORAGE_OBJECT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__STORAGE_TIER_CHARACTERISTICS:
				getStorageTierCharacteristics().clear();
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__TECHNOLOGY:
				setTechnology(TECHNOLOGY_EDEFAULT);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__INITIAL_STATE:
				setInitialState(INITIAL_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__DYNAMIC:
				setDynamic(DYNAMIC_EDEFAULT);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__DELETE_ON_EMPTY_STORAGE_TIER:
				setDeleteOnEmptyStorageTier(DELETE_ON_EMPTY_STORAGE_TIER_EDEFAULT);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__PERCENTAGE:
				setPercentage(PERCENTAGE_EDEFAULT);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__COMPRESSION_IDLE_INTERVAL:
				setCompressionIdleInterval(COMPRESSION_IDLE_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_TIER_SETTING_DATA__COMPRESSION_RATE:
				setCompressionRate(COMPRESSION_RATE_EDEFAULT);
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
			case CimPackage.CIM_TIER_SETTING_DATA__RELATIVE_PERFORMANCE_ORDER_GOAL:
				return RELATIVE_PERFORMANCE_ORDER_GOAL_EDEFAULT == null ? relativePerformanceOrderGoal != null : !RELATIVE_PERFORMANCE_ORDER_GOAL_EDEFAULT.equals(relativePerformanceOrderGoal);
			case CimPackage.CIM_TIER_SETTING_DATA__RELATIVE_PERFORMANCE_ORDER_MIN:
				return RELATIVE_PERFORMANCE_ORDER_MIN_EDEFAULT == null ? relativePerformanceOrderMin != null : !RELATIVE_PERFORMANCE_ORDER_MIN_EDEFAULT.equals(relativePerformanceOrderMin);
			case CimPackage.CIM_TIER_SETTING_DATA__RELATIVE_PERFORMANCE_ORDER_MAX:
				return RELATIVE_PERFORMANCE_ORDER_MAX_EDEFAULT == null ? relativePerformanceOrderMax != null : !RELATIVE_PERFORMANCE_ORDER_MAX_EDEFAULT.equals(relativePerformanceOrderMax);
			case CimPackage.CIM_TIER_SETTING_DATA__STORAGE_OBJECT_TYPE:
				return STORAGE_OBJECT_TYPE_EDEFAULT == null ? storageObjectType != null : !STORAGE_OBJECT_TYPE_EDEFAULT.equals(storageObjectType);
			case CimPackage.CIM_TIER_SETTING_DATA__STORAGE_TIER_CHARACTERISTICS:
				return storageTierCharacteristics != null && !storageTierCharacteristics.isEmpty();
			case CimPackage.CIM_TIER_SETTING_DATA__TECHNOLOGY:
				return TECHNOLOGY_EDEFAULT == null ? technology != null : !TECHNOLOGY_EDEFAULT.equals(technology);
			case CimPackage.CIM_TIER_SETTING_DATA__INITIAL_STATE:
				return INITIAL_STATE_EDEFAULT == null ? initialState != null : !INITIAL_STATE_EDEFAULT.equals(initialState);
			case CimPackage.CIM_TIER_SETTING_DATA__DYNAMIC:
				return DYNAMIC_EDEFAULT == null ? dynamic != null : !DYNAMIC_EDEFAULT.equals(dynamic);
			case CimPackage.CIM_TIER_SETTING_DATA__DELETE_ON_EMPTY_STORAGE_TIER:
				return DELETE_ON_EMPTY_STORAGE_TIER_EDEFAULT == null ? deleteOnEmptyStorageTier != null : !DELETE_ON_EMPTY_STORAGE_TIER_EDEFAULT.equals(deleteOnEmptyStorageTier);
			case CimPackage.CIM_TIER_SETTING_DATA__PERCENTAGE:
				return PERCENTAGE_EDEFAULT == null ? percentage != null : !PERCENTAGE_EDEFAULT.equals(percentage);
			case CimPackage.CIM_TIER_SETTING_DATA__COMPRESSION_IDLE_INTERVAL:
				return COMPRESSION_IDLE_INTERVAL_EDEFAULT == null ? compressionIdleInterval != null : !COMPRESSION_IDLE_INTERVAL_EDEFAULT.equals(compressionIdleInterval);
			case CimPackage.CIM_TIER_SETTING_DATA__COMPRESSION_RATE:
				return COMPRESSION_RATE_EDEFAULT == null ? compressionRate != null : !COMPRESSION_RATE_EDEFAULT.equals(compressionRate);
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
		result.append(" (RelativePerformanceOrderGoal: ");
		result.append(relativePerformanceOrderGoal);
		result.append(", RelativePerformanceOrderMin: ");
		result.append(relativePerformanceOrderMin);
		result.append(", RelativePerformanceOrderMax: ");
		result.append(relativePerformanceOrderMax);
		result.append(", StorageObjectType: ");
		result.append(storageObjectType);
		result.append(", StorageTierCharacteristics: ");
		result.append(storageTierCharacteristics);
		result.append(", Technology: ");
		result.append(technology);
		result.append(", InitialState: ");
		result.append(initialState);
		result.append(", Dynamic: ");
		result.append(dynamic);
		result.append(", DeleteOnEmptyStorageTier: ");
		result.append(deleteOnEmptyStorageTier);
		result.append(", Percentage: ");
		result.append(percentage);
		result.append(", CompressionIdleInterval: ");
		result.append(compressionIdleInterval);
		result.append(", CompressionRate: ");
		result.append(compressionRate);
		result.append(')');
		return result.toString();
	}

} //CIM_TierSettingDataImpl

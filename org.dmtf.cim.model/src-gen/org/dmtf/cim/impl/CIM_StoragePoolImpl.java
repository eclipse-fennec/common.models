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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.dmtf.cim.CIM_StorageExtent;
import org.dmtf.cim.CIM_StoragePool;
import org.dmtf.cim.CIM_StorageSetting;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolImpl#getTotalManagedSpace <em>Total Managed Space</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolImpl#getRemainingManagedSpace <em>Remaining Managed Space</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolImpl#getCapacityInMigratingSource <em>Capacity In Migrating Source</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolImpl#getCapacityInMigratingTarget <em>Capacity In Migrating Target</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolImpl#getClientSettableUsage <em>Client Settable Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolImpl#getElementsShareSpace <em>Elements Share Space</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolImpl#getLowSpaceWarningThreshold <em>Low Space Warning Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolImpl#getOtherUsageDescription <em>Other Usage Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolImpl#getReservedSpace <em>Reserved Space</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolImpl#getSpaceLimit <em>Space Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolImpl#getSpaceLimitDetermination <em>Space Limit Determination</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolImpl#getThinProvisionMetaDataSpace <em>Thin Provision Meta Data Space</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StoragePoolImpl extends CIM_ResourcePoolImpl implements CIM_StoragePool {
	/**
	 * The default value of the '{@link #getTotalManagedSpace() <em>Total Managed Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalManagedSpace()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_MANAGED_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalManagedSpace() <em>Total Managed Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalManagedSpace()
	 * @generated
	 * @ordered
	 */
	protected Long totalManagedSpace = TOTAL_MANAGED_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingManagedSpace() <em>Remaining Managed Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingManagedSpace()
	 * @generated
	 * @ordered
	 */
	protected static final Long REMAINING_MANAGED_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingManagedSpace() <em>Remaining Managed Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingManagedSpace()
	 * @generated
	 * @ordered
	 */
	protected Long remainingManagedSpace = REMAINING_MANAGED_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacityInMigratingSource() <em>Capacity In Migrating Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityInMigratingSource()
	 * @generated
	 * @ordered
	 */
	protected static final Long CAPACITY_IN_MIGRATING_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacityInMigratingSource() <em>Capacity In Migrating Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityInMigratingSource()
	 * @generated
	 * @ordered
	 */
	protected Long capacityInMigratingSource = CAPACITY_IN_MIGRATING_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacityInMigratingTarget() <em>Capacity In Migrating Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityInMigratingTarget()
	 * @generated
	 * @ordered
	 */
	protected static final Long CAPACITY_IN_MIGRATING_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacityInMigratingTarget() <em>Capacity In Migrating Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityInMigratingTarget()
	 * @generated
	 * @ordered
	 */
	protected Long capacityInMigratingTarget = CAPACITY_IN_MIGRATING_TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClientSettableUsage() <em>Client Settable Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientSettableUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> clientSettableUsage;

	/**
	 * The default value of the '{@link #getElementsShareSpace() <em>Elements Share Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsShareSpace()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ELEMENTS_SHARE_SPACE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getElementsShareSpace() <em>Elements Share Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsShareSpace()
	 * @generated
	 * @ordered
	 */
	protected Boolean elementsShareSpace = ELEMENTS_SHARE_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowSpaceWarningThreshold() <em>Low Space Warning Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowSpaceWarningThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOW_SPACE_WARNING_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowSpaceWarningThreshold() <em>Low Space Warning Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowSpaceWarningThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer lowSpaceWarningThreshold = LOW_SPACE_WARNING_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherUsageDescription() <em>Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherUsageDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_USAGE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherUsageDescription() <em>Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherUsageDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherUsageDescription = OTHER_USAGE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReservedSpace() <em>Reserved Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedSpace()
	 * @generated
	 * @ordered
	 */
	protected static final Long RESERVED_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReservedSpace() <em>Reserved Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedSpace()
	 * @generated
	 * @ordered
	 */
	protected Long reservedSpace = RESERVED_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceLimit() <em>Space Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Long SPACE_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpaceLimit() <em>Space Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimit()
	 * @generated
	 * @ordered
	 */
	protected Long spaceLimit = SPACE_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceLimitDetermination() <em>Space Limit Determination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimitDetermination()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SPACE_LIMIT_DETERMINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpaceLimitDetermination() <em>Space Limit Determination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimitDetermination()
	 * @generated
	 * @ordered
	 */
	protected Integer spaceLimitDetermination = SPACE_LIMIT_DETERMINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getThinProvisionMetaDataSpace() <em>Thin Provision Meta Data Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinProvisionMetaDataSpace()
	 * @generated
	 * @ordered
	 */
	protected static final Long THIN_PROVISION_META_DATA_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThinProvisionMetaDataSpace() <em>Thin Provision Meta Data Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinProvisionMetaDataSpace()
	 * @generated
	 * @ordered
	 */
	protected Long thinProvisionMetaDataSpace = THIN_PROVISION_META_DATA_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected Integer usage = USAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StoragePoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StoragePool();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalManagedSpace() {
		return totalManagedSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalManagedSpace(Long newTotalManagedSpace) {
		Long oldTotalManagedSpace = totalManagedSpace;
		totalManagedSpace = newTotalManagedSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL__TOTAL_MANAGED_SPACE, oldTotalManagedSpace, totalManagedSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRemainingManagedSpace() {
		return remainingManagedSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemainingManagedSpace(Long newRemainingManagedSpace) {
		Long oldRemainingManagedSpace = remainingManagedSpace;
		remainingManagedSpace = newRemainingManagedSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL__REMAINING_MANAGED_SPACE, oldRemainingManagedSpace, remainingManagedSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCapacityInMigratingSource() {
		return capacityInMigratingSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacityInMigratingSource(Long newCapacityInMigratingSource) {
		Long oldCapacityInMigratingSource = capacityInMigratingSource;
		capacityInMigratingSource = newCapacityInMigratingSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL__CAPACITY_IN_MIGRATING_SOURCE, oldCapacityInMigratingSource, capacityInMigratingSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCapacityInMigratingTarget() {
		return capacityInMigratingTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacityInMigratingTarget(Long newCapacityInMigratingTarget) {
		Long oldCapacityInMigratingTarget = capacityInMigratingTarget;
		capacityInMigratingTarget = newCapacityInMigratingTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL__CAPACITY_IN_MIGRATING_TARGET, oldCapacityInMigratingTarget, capacityInMigratingTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getClientSettableUsage() {
		if (clientSettableUsage == null) {
			clientSettableUsage = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_POOL__CLIENT_SETTABLE_USAGE);
		}
		return clientSettableUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getElementsShareSpace() {
		return elementsShareSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementsShareSpace(Boolean newElementsShareSpace) {
		Boolean oldElementsShareSpace = elementsShareSpace;
		elementsShareSpace = newElementsShareSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL__ELEMENTS_SHARE_SPACE, oldElementsShareSpace, elementsShareSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLowSpaceWarningThreshold() {
		return lowSpaceWarningThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowSpaceWarningThreshold(Integer newLowSpaceWarningThreshold) {
		Integer oldLowSpaceWarningThreshold = lowSpaceWarningThreshold;
		lowSpaceWarningThreshold = newLowSpaceWarningThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL__LOW_SPACE_WARNING_THRESHOLD, oldLowSpaceWarningThreshold, lowSpaceWarningThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherUsageDescription() {
		return otherUsageDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherUsageDescription(String newOtherUsageDescription) {
		String oldOtherUsageDescription = otherUsageDescription;
		otherUsageDescription = newOtherUsageDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL__OTHER_USAGE_DESCRIPTION, oldOtherUsageDescription, otherUsageDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReservedSpace() {
		return reservedSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservedSpace(Long newReservedSpace) {
		Long oldReservedSpace = reservedSpace;
		reservedSpace = newReservedSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL__RESERVED_SPACE, oldReservedSpace, reservedSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSpaceLimit() {
		return spaceLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaceLimit(Long newSpaceLimit) {
		Long oldSpaceLimit = spaceLimit;
		spaceLimit = newSpaceLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL__SPACE_LIMIT, oldSpaceLimit, spaceLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSpaceLimitDetermination() {
		return spaceLimitDetermination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaceLimitDetermination(Integer newSpaceLimitDetermination) {
		Integer oldSpaceLimitDetermination = spaceLimitDetermination;
		spaceLimitDetermination = newSpaceLimitDetermination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL__SPACE_LIMIT_DETERMINATION, oldSpaceLimitDetermination, spaceLimitDetermination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getThinProvisionMetaDataSpace() {
		return thinProvisionMetaDataSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThinProvisionMetaDataSpace(Long newThinProvisionMetaDataSpace) {
		Long oldThinProvisionMetaDataSpace = thinProvisionMetaDataSpace;
		thinProvisionMetaDataSpace = newThinProvisionMetaDataSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL__THIN_PROVISION_META_DATA_SPACE, oldThinProvisionMetaDataSpace, thinProvisionMetaDataSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsage(Integer newUsage) {
		Integer oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetSupportedSizes(Integer ElementType, CIM_StorageSetting Goal, EList<Long> Sizes) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetSupportedSizeRange(Integer ElementType, CIM_StorageSetting Goal, Long MinimumVolumeSize, Long MaximumVolumeSize, Long VolumeSizeDivisor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetAvailableExtents(CIM_StorageSetting Goal, EList<CIM_StorageExtent> AvailableExtents) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_POOL__TOTAL_MANAGED_SPACE:
				return getTotalManagedSpace();
			case CimPackage.CIM_STORAGE_POOL__REMAINING_MANAGED_SPACE:
				return getRemainingManagedSpace();
			case CimPackage.CIM_STORAGE_POOL__CAPACITY_IN_MIGRATING_SOURCE:
				return getCapacityInMigratingSource();
			case CimPackage.CIM_STORAGE_POOL__CAPACITY_IN_MIGRATING_TARGET:
				return getCapacityInMigratingTarget();
			case CimPackage.CIM_STORAGE_POOL__CLIENT_SETTABLE_USAGE:
				return getClientSettableUsage();
			case CimPackage.CIM_STORAGE_POOL__ELEMENTS_SHARE_SPACE:
				return getElementsShareSpace();
			case CimPackage.CIM_STORAGE_POOL__LOW_SPACE_WARNING_THRESHOLD:
				return getLowSpaceWarningThreshold();
			case CimPackage.CIM_STORAGE_POOL__OTHER_USAGE_DESCRIPTION:
				return getOtherUsageDescription();
			case CimPackage.CIM_STORAGE_POOL__RESERVED_SPACE:
				return getReservedSpace();
			case CimPackage.CIM_STORAGE_POOL__SPACE_LIMIT:
				return getSpaceLimit();
			case CimPackage.CIM_STORAGE_POOL__SPACE_LIMIT_DETERMINATION:
				return getSpaceLimitDetermination();
			case CimPackage.CIM_STORAGE_POOL__THIN_PROVISION_META_DATA_SPACE:
				return getThinProvisionMetaDataSpace();
			case CimPackage.CIM_STORAGE_POOL__USAGE:
				return getUsage();
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
			case CimPackage.CIM_STORAGE_POOL__TOTAL_MANAGED_SPACE:
				setTotalManagedSpace((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL__REMAINING_MANAGED_SPACE:
				setRemainingManagedSpace((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL__CAPACITY_IN_MIGRATING_SOURCE:
				setCapacityInMigratingSource((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL__CAPACITY_IN_MIGRATING_TARGET:
				setCapacityInMigratingTarget((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL__CLIENT_SETTABLE_USAGE:
				getClientSettableUsage().clear();
				getClientSettableUsage().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL__ELEMENTS_SHARE_SPACE:
				setElementsShareSpace((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL__LOW_SPACE_WARNING_THRESHOLD:
				setLowSpaceWarningThreshold((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL__OTHER_USAGE_DESCRIPTION:
				setOtherUsageDescription((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL__RESERVED_SPACE:
				setReservedSpace((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL__SPACE_LIMIT:
				setSpaceLimit((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL__SPACE_LIMIT_DETERMINATION:
				setSpaceLimitDetermination((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL__THIN_PROVISION_META_DATA_SPACE:
				setThinProvisionMetaDataSpace((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL__USAGE:
				setUsage((Integer)newValue);
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
			case CimPackage.CIM_STORAGE_POOL__TOTAL_MANAGED_SPACE:
				setTotalManagedSpace(TOTAL_MANAGED_SPACE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL__REMAINING_MANAGED_SPACE:
				setRemainingManagedSpace(REMAINING_MANAGED_SPACE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL__CAPACITY_IN_MIGRATING_SOURCE:
				setCapacityInMigratingSource(CAPACITY_IN_MIGRATING_SOURCE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL__CAPACITY_IN_MIGRATING_TARGET:
				setCapacityInMigratingTarget(CAPACITY_IN_MIGRATING_TARGET_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL__CLIENT_SETTABLE_USAGE:
				getClientSettableUsage().clear();
				return;
			case CimPackage.CIM_STORAGE_POOL__ELEMENTS_SHARE_SPACE:
				setElementsShareSpace(ELEMENTS_SHARE_SPACE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL__LOW_SPACE_WARNING_THRESHOLD:
				setLowSpaceWarningThreshold(LOW_SPACE_WARNING_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL__OTHER_USAGE_DESCRIPTION:
				setOtherUsageDescription(OTHER_USAGE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL__RESERVED_SPACE:
				setReservedSpace(RESERVED_SPACE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL__SPACE_LIMIT:
				setSpaceLimit(SPACE_LIMIT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL__SPACE_LIMIT_DETERMINATION:
				setSpaceLimitDetermination(SPACE_LIMIT_DETERMINATION_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL__THIN_PROVISION_META_DATA_SPACE:
				setThinProvisionMetaDataSpace(THIN_PROVISION_META_DATA_SPACE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL__USAGE:
				setUsage(USAGE_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_POOL__TOTAL_MANAGED_SPACE:
				return TOTAL_MANAGED_SPACE_EDEFAULT == null ? totalManagedSpace != null : !TOTAL_MANAGED_SPACE_EDEFAULT.equals(totalManagedSpace);
			case CimPackage.CIM_STORAGE_POOL__REMAINING_MANAGED_SPACE:
				return REMAINING_MANAGED_SPACE_EDEFAULT == null ? remainingManagedSpace != null : !REMAINING_MANAGED_SPACE_EDEFAULT.equals(remainingManagedSpace);
			case CimPackage.CIM_STORAGE_POOL__CAPACITY_IN_MIGRATING_SOURCE:
				return CAPACITY_IN_MIGRATING_SOURCE_EDEFAULT == null ? capacityInMigratingSource != null : !CAPACITY_IN_MIGRATING_SOURCE_EDEFAULT.equals(capacityInMigratingSource);
			case CimPackage.CIM_STORAGE_POOL__CAPACITY_IN_MIGRATING_TARGET:
				return CAPACITY_IN_MIGRATING_TARGET_EDEFAULT == null ? capacityInMigratingTarget != null : !CAPACITY_IN_MIGRATING_TARGET_EDEFAULT.equals(capacityInMigratingTarget);
			case CimPackage.CIM_STORAGE_POOL__CLIENT_SETTABLE_USAGE:
				return clientSettableUsage != null && !clientSettableUsage.isEmpty();
			case CimPackage.CIM_STORAGE_POOL__ELEMENTS_SHARE_SPACE:
				return ELEMENTS_SHARE_SPACE_EDEFAULT == null ? elementsShareSpace != null : !ELEMENTS_SHARE_SPACE_EDEFAULT.equals(elementsShareSpace);
			case CimPackage.CIM_STORAGE_POOL__LOW_SPACE_WARNING_THRESHOLD:
				return LOW_SPACE_WARNING_THRESHOLD_EDEFAULT == null ? lowSpaceWarningThreshold != null : !LOW_SPACE_WARNING_THRESHOLD_EDEFAULT.equals(lowSpaceWarningThreshold);
			case CimPackage.CIM_STORAGE_POOL__OTHER_USAGE_DESCRIPTION:
				return OTHER_USAGE_DESCRIPTION_EDEFAULT == null ? otherUsageDescription != null : !OTHER_USAGE_DESCRIPTION_EDEFAULT.equals(otherUsageDescription);
			case CimPackage.CIM_STORAGE_POOL__RESERVED_SPACE:
				return RESERVED_SPACE_EDEFAULT == null ? reservedSpace != null : !RESERVED_SPACE_EDEFAULT.equals(reservedSpace);
			case CimPackage.CIM_STORAGE_POOL__SPACE_LIMIT:
				return SPACE_LIMIT_EDEFAULT == null ? spaceLimit != null : !SPACE_LIMIT_EDEFAULT.equals(spaceLimit);
			case CimPackage.CIM_STORAGE_POOL__SPACE_LIMIT_DETERMINATION:
				return SPACE_LIMIT_DETERMINATION_EDEFAULT == null ? spaceLimitDetermination != null : !SPACE_LIMIT_DETERMINATION_EDEFAULT.equals(spaceLimitDetermination);
			case CimPackage.CIM_STORAGE_POOL__THIN_PROVISION_META_DATA_SPACE:
				return THIN_PROVISION_META_DATA_SPACE_EDEFAULT == null ? thinProvisionMetaDataSpace != null : !THIN_PROVISION_META_DATA_SPACE_EDEFAULT.equals(thinProvisionMetaDataSpace);
			case CimPackage.CIM_STORAGE_POOL__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_STORAGE_POOL___GET_SUPPORTED_SIZES__INTEGER_CIM_STORAGESETTING_ELIST:
				return GetSupportedSizes((Integer)arguments.get(0), (CIM_StorageSetting)arguments.get(1), (EList<Long>)arguments.get(2));
			case CimPackage.CIM_STORAGE_POOL___GET_SUPPORTED_SIZE_RANGE__INTEGER_CIM_STORAGESETTING_LONG_LONG_LONG:
				return GetSupportedSizeRange((Integer)arguments.get(0), (CIM_StorageSetting)arguments.get(1), (Long)arguments.get(2), (Long)arguments.get(3), (Long)arguments.get(4));
			case CimPackage.CIM_STORAGE_POOL___GET_AVAILABLE_EXTENTS__CIM_STORAGESETTING_ELIST:
				return GetAvailableExtents((CIM_StorageSetting)arguments.get(0), (EList<CIM_StorageExtent>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (TotalManagedSpace: ");
		result.append(totalManagedSpace);
		result.append(", RemainingManagedSpace: ");
		result.append(remainingManagedSpace);
		result.append(", CapacityInMigratingSource: ");
		result.append(capacityInMigratingSource);
		result.append(", CapacityInMigratingTarget: ");
		result.append(capacityInMigratingTarget);
		result.append(", ClientSettableUsage: ");
		result.append(clientSettableUsage);
		result.append(", ElementsShareSpace: ");
		result.append(elementsShareSpace);
		result.append(", LowSpaceWarningThreshold: ");
		result.append(lowSpaceWarningThreshold);
		result.append(", OtherUsageDescription: ");
		result.append(otherUsageDescription);
		result.append(", ReservedSpace: ");
		result.append(reservedSpace);
		result.append(", SpaceLimit: ");
		result.append(spaceLimit);
		result.append(", SpaceLimitDetermination: ");
		result.append(spaceLimitDetermination);
		result.append(", ThinProvisionMetaDataSpace: ");
		result.append(thinProvisionMetaDataSpace);
		result.append(", Usage: ");
		result.append(usage);
		result.append(')');
		return result.toString();
	}

} //CIM_StoragePoolImpl

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

import org.dmtf.cim.CIM_PrintInputTray;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Print Input Tray</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getLocalizedDescription <em>Localized Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getCapacityUnit <em>Capacity Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getOtherCapacityUnit <em>Other Capacity Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getMaxCapacityBasis <em>Max Capacity Basis</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getMaxCapacity <em>Max Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getCurrentLevelBasis <em>Current Level Basis</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getCurrentLevel <em>Current Level</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getAvailabilityStatus <em>Availability Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getOtherAvailabilityStatus <em>Other Availability Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getNonCriticalAlertsPresent <em>Non Critical Alerts Present</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getCriticalAlertsPresent <em>Critical Alerts Present</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getMediaSizeName <em>Media Size Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getMediaName <em>Media Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getMediaWeightBasis <em>Media Weight Basis</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getMediaWeight <em>Media Weight</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getMediaType <em>Media Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintInputTrayImpl#getMediaColor <em>Media Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PrintInputTrayImpl extends CIM_PrinterElementImpl implements CIM_PrintInputTray {
	/**
	 * The default value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDefault = IS_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalizedDescription() <em>Localized Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALIZED_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalizedDescription() <em>Localized Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalizedDescription()
	 * @generated
	 * @ordered
	 */
	protected String localizedDescription = LOCALIZED_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Long TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Long type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherTypeDescription = OTHER_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacityUnit() <em>Capacity Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Long CAPACITY_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacityUnit() <em>Capacity Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityUnit()
	 * @generated
	 * @ordered
	 */
	protected Long capacityUnit = CAPACITY_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherCapacityUnit() <em>Other Capacity Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCapacityUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CAPACITY_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCapacityUnit() <em>Other Capacity Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCapacityUnit()
	 * @generated
	 * @ordered
	 */
	protected String otherCapacityUnit = OTHER_CAPACITY_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCapacityBasis() <em>Max Capacity Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacityBasis()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_CAPACITY_BASIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCapacityBasis() <em>Max Capacity Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacityBasis()
	 * @generated
	 * @ordered
	 */
	protected Integer maxCapacityBasis = MAX_CAPACITY_BASIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCapacity() <em>Max Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCapacity() <em>Max Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long maxCapacity = MAX_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentLevelBasis() <em>Current Level Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLevelBasis()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_LEVEL_BASIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentLevelBasis() <em>Current Level Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLevelBasis()
	 * @generated
	 * @ordered
	 */
	protected Integer currentLevelBasis = CURRENT_LEVEL_BASIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentLevel() <em>Current Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentLevel() <em>Current Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLevel()
	 * @generated
	 * @ordered
	 */
	protected Long currentLevel = CURRENT_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailabilityStatus() <em>Availability Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVAILABILITY_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityStatus() <em>Availability Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityStatus()
	 * @generated
	 * @ordered
	 */
	protected Long availabilityStatus = AVAILABILITY_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAvailabilityStatus() <em>Other Availability Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAvailabilityStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_AVAILABILITY_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAvailabilityStatus() <em>Other Availability Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAvailabilityStatus()
	 * @generated
	 * @ordered
	 */
	protected String otherAvailabilityStatus = OTHER_AVAILABILITY_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNonCriticalAlertsPresent() <em>Non Critical Alerts Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonCriticalAlertsPresent()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NON_CRITICAL_ALERTS_PRESENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNonCriticalAlertsPresent() <em>Non Critical Alerts Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonCriticalAlertsPresent()
	 * @generated
	 * @ordered
	 */
	protected Boolean nonCriticalAlertsPresent = NON_CRITICAL_ALERTS_PRESENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriticalAlertsPresent() <em>Critical Alerts Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalAlertsPresent()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CRITICAL_ALERTS_PRESENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCriticalAlertsPresent() <em>Critical Alerts Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalAlertsPresent()
	 * @generated
	 * @ordered
	 */
	protected Boolean criticalAlertsPresent = CRITICAL_ALERTS_PRESENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaSizeName() <em>Media Size Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaSizeName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIA_SIZE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaSizeName() <em>Media Size Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaSizeName()
	 * @generated
	 * @ordered
	 */
	protected String mediaSizeName = MEDIA_SIZE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaName() <em>Media Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaName() <em>Media Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaName()
	 * @generated
	 * @ordered
	 */
	protected String mediaName = MEDIA_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaWeightBasis() <em>Media Weight Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaWeightBasis()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MEDIA_WEIGHT_BASIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaWeightBasis() <em>Media Weight Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaWeightBasis()
	 * @generated
	 * @ordered
	 */
	protected Integer mediaWeightBasis = MEDIA_WEIGHT_BASIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaWeight() <em>Media Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Long MEDIA_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaWeight() <em>Media Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaWeight()
	 * @generated
	 * @ordered
	 */
	protected Long mediaWeight = MEDIA_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaType() <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaType()
	 * @generated
	 * @ordered
	 */
	protected String mediaType = MEDIA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediaColor() <em>Media Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaColor()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIA_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediaColor() <em>Media Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediaColor()
	 * @generated
	 * @ordered
	 */
	protected String mediaColor = MEDIA_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PrintInputTrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PrintInputTray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDefault(Boolean newIsDefault) {
		Boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__IS_DEFAULT, oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalizedDescription() {
		return localizedDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalizedDescription(String newLocalizedDescription) {
		String oldLocalizedDescription = localizedDescription;
		localizedDescription = newLocalizedDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__LOCALIZED_DESCRIPTION, oldLocalizedDescription, localizedDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Long newType) {
		Long oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTypeDescription() {
		return otherTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTypeDescription(String newOtherTypeDescription) {
		String oldOtherTypeDescription = otherTypeDescription;
		otherTypeDescription = newOtherTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__OTHER_TYPE_DESCRIPTION, oldOtherTypeDescription, otherTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCapacityUnit() {
		return capacityUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacityUnit(Long newCapacityUnit) {
		Long oldCapacityUnit = capacityUnit;
		capacityUnit = newCapacityUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__CAPACITY_UNIT, oldCapacityUnit, capacityUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCapacityUnit() {
		return otherCapacityUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCapacityUnit(String newOtherCapacityUnit) {
		String oldOtherCapacityUnit = otherCapacityUnit;
		otherCapacityUnit = newOtherCapacityUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__OTHER_CAPACITY_UNIT, oldOtherCapacityUnit, otherCapacityUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxCapacityBasis() {
		return maxCapacityBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCapacityBasis(Integer newMaxCapacityBasis) {
		Integer oldMaxCapacityBasis = maxCapacityBasis;
		maxCapacityBasis = newMaxCapacityBasis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__MAX_CAPACITY_BASIS, oldMaxCapacityBasis, maxCapacityBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxCapacity() {
		return maxCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCapacity(Long newMaxCapacity) {
		Long oldMaxCapacity = maxCapacity;
		maxCapacity = newMaxCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__MAX_CAPACITY, oldMaxCapacity, maxCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentLevelBasis() {
		return currentLevelBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentLevelBasis(Integer newCurrentLevelBasis) {
		Integer oldCurrentLevelBasis = currentLevelBasis;
		currentLevelBasis = newCurrentLevelBasis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__CURRENT_LEVEL_BASIS, oldCurrentLevelBasis, currentLevelBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentLevel() {
		return currentLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentLevel(Long newCurrentLevel) {
		Long oldCurrentLevel = currentLevel;
		currentLevel = newCurrentLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__CURRENT_LEVEL, oldCurrentLevel, currentLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAvailabilityStatus() {
		return availabilityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailabilityStatus(Long newAvailabilityStatus) {
		Long oldAvailabilityStatus = availabilityStatus;
		availabilityStatus = newAvailabilityStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__AVAILABILITY_STATUS, oldAvailabilityStatus, availabilityStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherAvailabilityStatus() {
		return otherAvailabilityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherAvailabilityStatus(String newOtherAvailabilityStatus) {
		String oldOtherAvailabilityStatus = otherAvailabilityStatus;
		otherAvailabilityStatus = newOtherAvailabilityStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__OTHER_AVAILABILITY_STATUS, oldOtherAvailabilityStatus, otherAvailabilityStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNonCriticalAlertsPresent() {
		return nonCriticalAlertsPresent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNonCriticalAlertsPresent(Boolean newNonCriticalAlertsPresent) {
		Boolean oldNonCriticalAlertsPresent = nonCriticalAlertsPresent;
		nonCriticalAlertsPresent = newNonCriticalAlertsPresent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__NON_CRITICAL_ALERTS_PRESENT, oldNonCriticalAlertsPresent, nonCriticalAlertsPresent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCriticalAlertsPresent() {
		return criticalAlertsPresent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCriticalAlertsPresent(Boolean newCriticalAlertsPresent) {
		Boolean oldCriticalAlertsPresent = criticalAlertsPresent;
		criticalAlertsPresent = newCriticalAlertsPresent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__CRITICAL_ALERTS_PRESENT, oldCriticalAlertsPresent, criticalAlertsPresent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMediaSizeName() {
		return mediaSizeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaSizeName(String newMediaSizeName) {
		String oldMediaSizeName = mediaSizeName;
		mediaSizeName = newMediaSizeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_SIZE_NAME, oldMediaSizeName, mediaSizeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMediaName() {
		return mediaName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaName(String newMediaName) {
		String oldMediaName = mediaName;
		mediaName = newMediaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_NAME, oldMediaName, mediaName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMediaWeightBasis() {
		return mediaWeightBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaWeightBasis(Integer newMediaWeightBasis) {
		Integer oldMediaWeightBasis = mediaWeightBasis;
		mediaWeightBasis = newMediaWeightBasis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_WEIGHT_BASIS, oldMediaWeightBasis, mediaWeightBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMediaWeight() {
		return mediaWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaWeight(Long newMediaWeight) {
		Long oldMediaWeight = mediaWeight;
		mediaWeight = newMediaWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_WEIGHT, oldMediaWeight, mediaWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMediaType() {
		return mediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaType(String newMediaType) {
		String oldMediaType = mediaType;
		mediaType = newMediaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_TYPE, oldMediaType, mediaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMediaColor() {
		return mediaColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMediaColor(String newMediaColor) {
		String oldMediaColor = mediaColor;
		mediaColor = newMediaColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_COLOR, oldMediaColor, mediaColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRINT_INPUT_TRAY__IS_DEFAULT:
				return getIsDefault();
			case CimPackage.CIM_PRINT_INPUT_TRAY__LOCALIZED_DESCRIPTION:
				return getLocalizedDescription();
			case CimPackage.CIM_PRINT_INPUT_TRAY__TYPE:
				return getType();
			case CimPackage.CIM_PRINT_INPUT_TRAY__OTHER_TYPE_DESCRIPTION:
				return getOtherTypeDescription();
			case CimPackage.CIM_PRINT_INPUT_TRAY__CAPACITY_UNIT:
				return getCapacityUnit();
			case CimPackage.CIM_PRINT_INPUT_TRAY__OTHER_CAPACITY_UNIT:
				return getOtherCapacityUnit();
			case CimPackage.CIM_PRINT_INPUT_TRAY__MAX_CAPACITY_BASIS:
				return getMaxCapacityBasis();
			case CimPackage.CIM_PRINT_INPUT_TRAY__MAX_CAPACITY:
				return getMaxCapacity();
			case CimPackage.CIM_PRINT_INPUT_TRAY__CURRENT_LEVEL_BASIS:
				return getCurrentLevelBasis();
			case CimPackage.CIM_PRINT_INPUT_TRAY__CURRENT_LEVEL:
				return getCurrentLevel();
			case CimPackage.CIM_PRINT_INPUT_TRAY__AVAILABILITY_STATUS:
				return getAvailabilityStatus();
			case CimPackage.CIM_PRINT_INPUT_TRAY__OTHER_AVAILABILITY_STATUS:
				return getOtherAvailabilityStatus();
			case CimPackage.CIM_PRINT_INPUT_TRAY__NON_CRITICAL_ALERTS_PRESENT:
				return getNonCriticalAlertsPresent();
			case CimPackage.CIM_PRINT_INPUT_TRAY__CRITICAL_ALERTS_PRESENT:
				return getCriticalAlertsPresent();
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_SIZE_NAME:
				return getMediaSizeName();
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_NAME:
				return getMediaName();
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_WEIGHT_BASIS:
				return getMediaWeightBasis();
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_WEIGHT:
				return getMediaWeight();
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_TYPE:
				return getMediaType();
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_COLOR:
				return getMediaColor();
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
			case CimPackage.CIM_PRINT_INPUT_TRAY__IS_DEFAULT:
				setIsDefault((Boolean)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__LOCALIZED_DESCRIPTION:
				setLocalizedDescription((String)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__TYPE:
				setType((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__CAPACITY_UNIT:
				setCapacityUnit((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__OTHER_CAPACITY_UNIT:
				setOtherCapacityUnit((String)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MAX_CAPACITY_BASIS:
				setMaxCapacityBasis((Integer)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MAX_CAPACITY:
				setMaxCapacity((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__CURRENT_LEVEL_BASIS:
				setCurrentLevelBasis((Integer)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__CURRENT_LEVEL:
				setCurrentLevel((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__AVAILABILITY_STATUS:
				setAvailabilityStatus((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__OTHER_AVAILABILITY_STATUS:
				setOtherAvailabilityStatus((String)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__NON_CRITICAL_ALERTS_PRESENT:
				setNonCriticalAlertsPresent((Boolean)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__CRITICAL_ALERTS_PRESENT:
				setCriticalAlertsPresent((Boolean)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_SIZE_NAME:
				setMediaSizeName((String)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_NAME:
				setMediaName((String)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_WEIGHT_BASIS:
				setMediaWeightBasis((Integer)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_WEIGHT:
				setMediaWeight((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_TYPE:
				setMediaType((String)newValue);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_COLOR:
				setMediaColor((String)newValue);
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
			case CimPackage.CIM_PRINT_INPUT_TRAY__IS_DEFAULT:
				setIsDefault(IS_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__LOCALIZED_DESCRIPTION:
				setLocalizedDescription(LOCALIZED_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription(OTHER_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__CAPACITY_UNIT:
				setCapacityUnit(CAPACITY_UNIT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__OTHER_CAPACITY_UNIT:
				setOtherCapacityUnit(OTHER_CAPACITY_UNIT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MAX_CAPACITY_BASIS:
				setMaxCapacityBasis(MAX_CAPACITY_BASIS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MAX_CAPACITY:
				setMaxCapacity(MAX_CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__CURRENT_LEVEL_BASIS:
				setCurrentLevelBasis(CURRENT_LEVEL_BASIS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__CURRENT_LEVEL:
				setCurrentLevel(CURRENT_LEVEL_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__AVAILABILITY_STATUS:
				setAvailabilityStatus(AVAILABILITY_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__OTHER_AVAILABILITY_STATUS:
				setOtherAvailabilityStatus(OTHER_AVAILABILITY_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__NON_CRITICAL_ALERTS_PRESENT:
				setNonCriticalAlertsPresent(NON_CRITICAL_ALERTS_PRESENT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__CRITICAL_ALERTS_PRESENT:
				setCriticalAlertsPresent(CRITICAL_ALERTS_PRESENT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_SIZE_NAME:
				setMediaSizeName(MEDIA_SIZE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_NAME:
				setMediaName(MEDIA_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_WEIGHT_BASIS:
				setMediaWeightBasis(MEDIA_WEIGHT_BASIS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_WEIGHT:
				setMediaWeight(MEDIA_WEIGHT_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_TYPE:
				setMediaType(MEDIA_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_COLOR:
				setMediaColor(MEDIA_COLOR_EDEFAULT);
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
			case CimPackage.CIM_PRINT_INPUT_TRAY__IS_DEFAULT:
				return IS_DEFAULT_EDEFAULT == null ? isDefault != null : !IS_DEFAULT_EDEFAULT.equals(isDefault);
			case CimPackage.CIM_PRINT_INPUT_TRAY__LOCALIZED_DESCRIPTION:
				return LOCALIZED_DESCRIPTION_EDEFAULT == null ? localizedDescription != null : !LOCALIZED_DESCRIPTION_EDEFAULT.equals(localizedDescription);
			case CimPackage.CIM_PRINT_INPUT_TRAY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CimPackage.CIM_PRINT_INPUT_TRAY__OTHER_TYPE_DESCRIPTION:
				return OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? otherTypeDescription != null : !OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(otherTypeDescription);
			case CimPackage.CIM_PRINT_INPUT_TRAY__CAPACITY_UNIT:
				return CAPACITY_UNIT_EDEFAULT == null ? capacityUnit != null : !CAPACITY_UNIT_EDEFAULT.equals(capacityUnit);
			case CimPackage.CIM_PRINT_INPUT_TRAY__OTHER_CAPACITY_UNIT:
				return OTHER_CAPACITY_UNIT_EDEFAULT == null ? otherCapacityUnit != null : !OTHER_CAPACITY_UNIT_EDEFAULT.equals(otherCapacityUnit);
			case CimPackage.CIM_PRINT_INPUT_TRAY__MAX_CAPACITY_BASIS:
				return MAX_CAPACITY_BASIS_EDEFAULT == null ? maxCapacityBasis != null : !MAX_CAPACITY_BASIS_EDEFAULT.equals(maxCapacityBasis);
			case CimPackage.CIM_PRINT_INPUT_TRAY__MAX_CAPACITY:
				return MAX_CAPACITY_EDEFAULT == null ? maxCapacity != null : !MAX_CAPACITY_EDEFAULT.equals(maxCapacity);
			case CimPackage.CIM_PRINT_INPUT_TRAY__CURRENT_LEVEL_BASIS:
				return CURRENT_LEVEL_BASIS_EDEFAULT == null ? currentLevelBasis != null : !CURRENT_LEVEL_BASIS_EDEFAULT.equals(currentLevelBasis);
			case CimPackage.CIM_PRINT_INPUT_TRAY__CURRENT_LEVEL:
				return CURRENT_LEVEL_EDEFAULT == null ? currentLevel != null : !CURRENT_LEVEL_EDEFAULT.equals(currentLevel);
			case CimPackage.CIM_PRINT_INPUT_TRAY__AVAILABILITY_STATUS:
				return AVAILABILITY_STATUS_EDEFAULT == null ? availabilityStatus != null : !AVAILABILITY_STATUS_EDEFAULT.equals(availabilityStatus);
			case CimPackage.CIM_PRINT_INPUT_TRAY__OTHER_AVAILABILITY_STATUS:
				return OTHER_AVAILABILITY_STATUS_EDEFAULT == null ? otherAvailabilityStatus != null : !OTHER_AVAILABILITY_STATUS_EDEFAULT.equals(otherAvailabilityStatus);
			case CimPackage.CIM_PRINT_INPUT_TRAY__NON_CRITICAL_ALERTS_PRESENT:
				return NON_CRITICAL_ALERTS_PRESENT_EDEFAULT == null ? nonCriticalAlertsPresent != null : !NON_CRITICAL_ALERTS_PRESENT_EDEFAULT.equals(nonCriticalAlertsPresent);
			case CimPackage.CIM_PRINT_INPUT_TRAY__CRITICAL_ALERTS_PRESENT:
				return CRITICAL_ALERTS_PRESENT_EDEFAULT == null ? criticalAlertsPresent != null : !CRITICAL_ALERTS_PRESENT_EDEFAULT.equals(criticalAlertsPresent);
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_SIZE_NAME:
				return MEDIA_SIZE_NAME_EDEFAULT == null ? mediaSizeName != null : !MEDIA_SIZE_NAME_EDEFAULT.equals(mediaSizeName);
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_NAME:
				return MEDIA_NAME_EDEFAULT == null ? mediaName != null : !MEDIA_NAME_EDEFAULT.equals(mediaName);
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_WEIGHT_BASIS:
				return MEDIA_WEIGHT_BASIS_EDEFAULT == null ? mediaWeightBasis != null : !MEDIA_WEIGHT_BASIS_EDEFAULT.equals(mediaWeightBasis);
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_WEIGHT:
				return MEDIA_WEIGHT_EDEFAULT == null ? mediaWeight != null : !MEDIA_WEIGHT_EDEFAULT.equals(mediaWeight);
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_TYPE:
				return MEDIA_TYPE_EDEFAULT == null ? mediaType != null : !MEDIA_TYPE_EDEFAULT.equals(mediaType);
			case CimPackage.CIM_PRINT_INPUT_TRAY__MEDIA_COLOR:
				return MEDIA_COLOR_EDEFAULT == null ? mediaColor != null : !MEDIA_COLOR_EDEFAULT.equals(mediaColor);
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
		result.append(" (IsDefault: ");
		result.append(isDefault);
		result.append(", LocalizedDescription: ");
		result.append(localizedDescription);
		result.append(", Type: ");
		result.append(type);
		result.append(", OtherTypeDescription: ");
		result.append(otherTypeDescription);
		result.append(", CapacityUnit: ");
		result.append(capacityUnit);
		result.append(", OtherCapacityUnit: ");
		result.append(otherCapacityUnit);
		result.append(", MaxCapacityBasis: ");
		result.append(maxCapacityBasis);
		result.append(", MaxCapacity: ");
		result.append(maxCapacity);
		result.append(", CurrentLevelBasis: ");
		result.append(currentLevelBasis);
		result.append(", CurrentLevel: ");
		result.append(currentLevel);
		result.append(", AvailabilityStatus: ");
		result.append(availabilityStatus);
		result.append(", OtherAvailabilityStatus: ");
		result.append(otherAvailabilityStatus);
		result.append(", NonCriticalAlertsPresent: ");
		result.append(nonCriticalAlertsPresent);
		result.append(", CriticalAlertsPresent: ");
		result.append(criticalAlertsPresent);
		result.append(", MediaSizeName: ");
		result.append(mediaSizeName);
		result.append(", MediaName: ");
		result.append(mediaName);
		result.append(", MediaWeightBasis: ");
		result.append(mediaWeightBasis);
		result.append(", MediaWeight: ");
		result.append(mediaWeight);
		result.append(", MediaType: ");
		result.append(mediaType);
		result.append(", MediaColor: ");
		result.append(mediaColor);
		result.append(')');
		return result.toString();
	}

} //CIM_PrintInputTrayImpl

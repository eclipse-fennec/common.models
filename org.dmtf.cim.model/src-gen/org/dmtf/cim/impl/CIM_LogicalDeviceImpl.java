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

import org.dmtf.cim.CIM_LogicalDevice;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Logical Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getPowerManagementSupported <em>Power Management Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getPowerManagementCapabilities <em>Power Management Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getStatusInfo <em>Status Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getLastErrorCode <em>Last Error Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getErrorDescription <em>Error Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getErrorCleared <em>Error Cleared</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getOtherIdentifyingInfo <em>Other Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getPowerOnHours <em>Power On Hours</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getTotalPowerOnHours <em>Total Power On Hours</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getIdentifyingDescriptions <em>Identifying Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getAdditionalAvailability <em>Additional Availability</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getMaxQuiesceTime <em>Max Quiesce Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalDeviceImpl#getLocationIndicator <em>Location Indicator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_LogicalDeviceImpl extends CIM_AllocatedLogicalElementImpl implements CIM_LogicalDevice {
	/**
	 * The default value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String systemCreationClassName = SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceID() <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceID() <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceID()
	 * @generated
	 * @ordered
	 */
	protected String deviceID = DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerManagementSupported() <em>Power Management Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerManagementSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean POWER_MANAGEMENT_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerManagementSupported() <em>Power Management Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerManagementSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean powerManagementSupported = POWER_MANAGEMENT_SUPPORTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPowerManagementCapabilities() <em>Power Management Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerManagementCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> powerManagementCapabilities;

	/**
	 * The default value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AVAILABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected Integer availability = AVAILABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusInfo() <em>Status Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusInfo()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STATUS_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusInfo() <em>Status Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusInfo()
	 * @generated
	 * @ordered
	 */
	protected Integer statusInfo = STATUS_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastErrorCode() <em>Last Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final Long LAST_ERROR_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastErrorCode() <em>Last Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastErrorCode()
	 * @generated
	 * @ordered
	 */
	protected Long lastErrorCode = LAST_ERROR_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorDescription() <em>Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorDescription() <em>Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDescription()
	 * @generated
	 * @ordered
	 */
	protected String errorDescription = ERROR_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorCleared() <em>Error Cleared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCleared()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ERROR_CLEARED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorCleared() <em>Error Cleared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCleared()
	 * @generated
	 * @ordered
	 */
	protected Boolean errorCleared = ERROR_CLEARED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOtherIdentifyingInfo() <em>Other Identifying Info</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIdentifyingInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherIdentifyingInfo;

	/**
	 * The default value of the '{@link #getPowerOnHours() <em>Power On Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerOnHours()
	 * @generated
	 * @ordered
	 */
	protected static final Long POWER_ON_HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerOnHours() <em>Power On Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerOnHours()
	 * @generated
	 * @ordered
	 */
	protected Long powerOnHours = POWER_ON_HOURS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalPowerOnHours() <em>Total Power On Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPowerOnHours()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_POWER_ON_HOURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalPowerOnHours() <em>Total Power On Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPowerOnHours()
	 * @generated
	 * @ordered
	 */
	protected Long totalPowerOnHours = TOTAL_POWER_ON_HOURS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIdentifyingDescriptions() <em>Identifying Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> identifyingDescriptions;

	/**
	 * The cached value of the '{@link #getAdditionalAvailability() <em>Additional Availability</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalAvailability()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> additionalAvailability;

	/**
	 * The default value of the '{@link #getMaxQuiesceTime() <em>Max Quiesce Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQuiesceTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_QUIESCE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxQuiesceTime() <em>Max Quiesce Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxQuiesceTime()
	 * @generated
	 * @ordered
	 */
	protected Long maxQuiesceTime = MAX_QUIESCE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocationIndicator() <em>Location Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationIndicator()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOCATION_INDICATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationIndicator() <em>Location Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationIndicator()
	 * @generated
	 * @ordered
	 */
	protected Integer locationIndicator = LOCATION_INDICATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LogicalDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LogicalDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemCreationClassName() {
		return systemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemCreationClassName(String newSystemCreationClassName) {
		String oldSystemCreationClassName = systemCreationClassName;
		systemCreationClassName = newSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DEVICE__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DEVICE__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DEVICE__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceID() {
		return deviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceID(String newDeviceID) {
		String oldDeviceID = deviceID;
		deviceID = newDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DEVICE__DEVICE_ID, oldDeviceID, deviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPowerManagementSupported() {
		return powerManagementSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerManagementSupported(Boolean newPowerManagementSupported) {
		Boolean oldPowerManagementSupported = powerManagementSupported;
		powerManagementSupported = newPowerManagementSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DEVICE__POWER_MANAGEMENT_SUPPORTED, oldPowerManagementSupported, powerManagementSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPowerManagementCapabilities() {
		if (powerManagementCapabilities == null) {
			powerManagementCapabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LOGICAL_DEVICE__POWER_MANAGEMENT_CAPABILITIES);
		}
		return powerManagementCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailability(Integer newAvailability) {
		Integer oldAvailability = availability;
		availability = newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DEVICE__AVAILABILITY, oldAvailability, availability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStatusInfo() {
		return statusInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatusInfo(Integer newStatusInfo) {
		Integer oldStatusInfo = statusInfo;
		statusInfo = newStatusInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DEVICE__STATUS_INFO, oldStatusInfo, statusInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLastErrorCode() {
		return lastErrorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastErrorCode(Long newLastErrorCode) {
		Long oldLastErrorCode = lastErrorCode;
		lastErrorCode = newLastErrorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DEVICE__LAST_ERROR_CODE, oldLastErrorCode, lastErrorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErrorDescription() {
		return errorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorDescription(String newErrorDescription) {
		String oldErrorDescription = errorDescription;
		errorDescription = newErrorDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DEVICE__ERROR_DESCRIPTION, oldErrorDescription, errorDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getErrorCleared() {
		return errorCleared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorCleared(Boolean newErrorCleared) {
		Boolean oldErrorCleared = errorCleared;
		errorCleared = newErrorCleared;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DEVICE__ERROR_CLEARED, oldErrorCleared, errorCleared));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherIdentifyingInfo() {
		if (otherIdentifyingInfo == null) {
			otherIdentifyingInfo = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LOGICAL_DEVICE__OTHER_IDENTIFYING_INFO);
		}
		return otherIdentifyingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPowerOnHours() {
		return powerOnHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerOnHours(Long newPowerOnHours) {
		Long oldPowerOnHours = powerOnHours;
		powerOnHours = newPowerOnHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DEVICE__POWER_ON_HOURS, oldPowerOnHours, powerOnHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalPowerOnHours() {
		return totalPowerOnHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalPowerOnHours(Long newTotalPowerOnHours) {
		Long oldTotalPowerOnHours = totalPowerOnHours;
		totalPowerOnHours = newTotalPowerOnHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DEVICE__TOTAL_POWER_ON_HOURS, oldTotalPowerOnHours, totalPowerOnHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getIdentifyingDescriptions() {
		if (identifyingDescriptions == null) {
			identifyingDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LOGICAL_DEVICE__IDENTIFYING_DESCRIPTIONS);
		}
		return identifyingDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAdditionalAvailability() {
		if (additionalAvailability == null) {
			additionalAvailability = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LOGICAL_DEVICE__ADDITIONAL_AVAILABILITY);
		}
		return additionalAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxQuiesceTime() {
		return maxQuiesceTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxQuiesceTime(Long newMaxQuiesceTime) {
		Long oldMaxQuiesceTime = maxQuiesceTime;
		maxQuiesceTime = newMaxQuiesceTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DEVICE__MAX_QUIESCE_TIME, oldMaxQuiesceTime, maxQuiesceTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocationIndicator() {
		return locationIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationIndicator(Integer newLocationIndicator) {
		Integer oldLocationIndicator = locationIndicator;
		locationIndicator = newLocationIndicator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_DEVICE__LOCATION_INDICATOR, oldLocationIndicator, locationIndicator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long SetPowerState(Integer PowerState, String Time) {
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
	public Long Reset() {
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
	public Long EnableDevice(Boolean Enabled) {
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
	public Long OnlineDevice(Boolean Online) {
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
	public Long QuiesceDevice(Boolean Quiesce) {
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
	public Long SaveProperties() {
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
	public Long RestoreProperties() {
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
			case CimPackage.CIM_LOGICAL_DEVICE__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_LOGICAL_DEVICE__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_LOGICAL_DEVICE__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_LOGICAL_DEVICE__DEVICE_ID:
				return getDeviceID();
			case CimPackage.CIM_LOGICAL_DEVICE__POWER_MANAGEMENT_SUPPORTED:
				return getPowerManagementSupported();
			case CimPackage.CIM_LOGICAL_DEVICE__POWER_MANAGEMENT_CAPABILITIES:
				return getPowerManagementCapabilities();
			case CimPackage.CIM_LOGICAL_DEVICE__AVAILABILITY:
				return getAvailability();
			case CimPackage.CIM_LOGICAL_DEVICE__STATUS_INFO:
				return getStatusInfo();
			case CimPackage.CIM_LOGICAL_DEVICE__LAST_ERROR_CODE:
				return getLastErrorCode();
			case CimPackage.CIM_LOGICAL_DEVICE__ERROR_DESCRIPTION:
				return getErrorDescription();
			case CimPackage.CIM_LOGICAL_DEVICE__ERROR_CLEARED:
				return getErrorCleared();
			case CimPackage.CIM_LOGICAL_DEVICE__OTHER_IDENTIFYING_INFO:
				return getOtherIdentifyingInfo();
			case CimPackage.CIM_LOGICAL_DEVICE__POWER_ON_HOURS:
				return getPowerOnHours();
			case CimPackage.CIM_LOGICAL_DEVICE__TOTAL_POWER_ON_HOURS:
				return getTotalPowerOnHours();
			case CimPackage.CIM_LOGICAL_DEVICE__IDENTIFYING_DESCRIPTIONS:
				return getIdentifyingDescriptions();
			case CimPackage.CIM_LOGICAL_DEVICE__ADDITIONAL_AVAILABILITY:
				return getAdditionalAvailability();
			case CimPackage.CIM_LOGICAL_DEVICE__MAX_QUIESCE_TIME:
				return getMaxQuiesceTime();
			case CimPackage.CIM_LOGICAL_DEVICE__LOCATION_INDICATOR:
				return getLocationIndicator();
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
			case CimPackage.CIM_LOGICAL_DEVICE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__DEVICE_ID:
				setDeviceID((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__POWER_MANAGEMENT_SUPPORTED:
				setPowerManagementSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__POWER_MANAGEMENT_CAPABILITIES:
				getPowerManagementCapabilities().clear();
				getPowerManagementCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__AVAILABILITY:
				setAvailability((Integer)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__STATUS_INFO:
				setStatusInfo((Integer)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__LAST_ERROR_CODE:
				setLastErrorCode((Long)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__ERROR_DESCRIPTION:
				setErrorDescription((String)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__ERROR_CLEARED:
				setErrorCleared((Boolean)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__OTHER_IDENTIFYING_INFO:
				getOtherIdentifyingInfo().clear();
				getOtherIdentifyingInfo().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__POWER_ON_HOURS:
				setPowerOnHours((Long)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__TOTAL_POWER_ON_HOURS:
				setTotalPowerOnHours((Long)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__IDENTIFYING_DESCRIPTIONS:
				getIdentifyingDescriptions().clear();
				getIdentifyingDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__ADDITIONAL_AVAILABILITY:
				getAdditionalAvailability().clear();
				getAdditionalAvailability().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__MAX_QUIESCE_TIME:
				setMaxQuiesceTime((Long)newValue);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__LOCATION_INDICATOR:
				setLocationIndicator((Integer)newValue);
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
			case CimPackage.CIM_LOGICAL_DEVICE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__DEVICE_ID:
				setDeviceID(DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__POWER_MANAGEMENT_SUPPORTED:
				setPowerManagementSupported(POWER_MANAGEMENT_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__POWER_MANAGEMENT_CAPABILITIES:
				getPowerManagementCapabilities().clear();
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__AVAILABILITY:
				setAvailability(AVAILABILITY_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__STATUS_INFO:
				setStatusInfo(STATUS_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__LAST_ERROR_CODE:
				setLastErrorCode(LAST_ERROR_CODE_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__ERROR_DESCRIPTION:
				setErrorDescription(ERROR_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__ERROR_CLEARED:
				setErrorCleared(ERROR_CLEARED_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__OTHER_IDENTIFYING_INFO:
				getOtherIdentifyingInfo().clear();
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__POWER_ON_HOURS:
				setPowerOnHours(POWER_ON_HOURS_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__TOTAL_POWER_ON_HOURS:
				setTotalPowerOnHours(TOTAL_POWER_ON_HOURS_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__IDENTIFYING_DESCRIPTIONS:
				getIdentifyingDescriptions().clear();
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__ADDITIONAL_AVAILABILITY:
				getAdditionalAvailability().clear();
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__MAX_QUIESCE_TIME:
				setMaxQuiesceTime(MAX_QUIESCE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_DEVICE__LOCATION_INDICATOR:
				setLocationIndicator(LOCATION_INDICATOR_EDEFAULT);
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
			case CimPackage.CIM_LOGICAL_DEVICE__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_LOGICAL_DEVICE__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_LOGICAL_DEVICE__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_LOGICAL_DEVICE__DEVICE_ID:
				return DEVICE_ID_EDEFAULT == null ? deviceID != null : !DEVICE_ID_EDEFAULT.equals(deviceID);
			case CimPackage.CIM_LOGICAL_DEVICE__POWER_MANAGEMENT_SUPPORTED:
				return POWER_MANAGEMENT_SUPPORTED_EDEFAULT == null ? powerManagementSupported != null : !POWER_MANAGEMENT_SUPPORTED_EDEFAULT.equals(powerManagementSupported);
			case CimPackage.CIM_LOGICAL_DEVICE__POWER_MANAGEMENT_CAPABILITIES:
				return powerManagementCapabilities != null && !powerManagementCapabilities.isEmpty();
			case CimPackage.CIM_LOGICAL_DEVICE__AVAILABILITY:
				return AVAILABILITY_EDEFAULT == null ? availability != null : !AVAILABILITY_EDEFAULT.equals(availability);
			case CimPackage.CIM_LOGICAL_DEVICE__STATUS_INFO:
				return STATUS_INFO_EDEFAULT == null ? statusInfo != null : !STATUS_INFO_EDEFAULT.equals(statusInfo);
			case CimPackage.CIM_LOGICAL_DEVICE__LAST_ERROR_CODE:
				return LAST_ERROR_CODE_EDEFAULT == null ? lastErrorCode != null : !LAST_ERROR_CODE_EDEFAULT.equals(lastErrorCode);
			case CimPackage.CIM_LOGICAL_DEVICE__ERROR_DESCRIPTION:
				return ERROR_DESCRIPTION_EDEFAULT == null ? errorDescription != null : !ERROR_DESCRIPTION_EDEFAULT.equals(errorDescription);
			case CimPackage.CIM_LOGICAL_DEVICE__ERROR_CLEARED:
				return ERROR_CLEARED_EDEFAULT == null ? errorCleared != null : !ERROR_CLEARED_EDEFAULT.equals(errorCleared);
			case CimPackage.CIM_LOGICAL_DEVICE__OTHER_IDENTIFYING_INFO:
				return otherIdentifyingInfo != null && !otherIdentifyingInfo.isEmpty();
			case CimPackage.CIM_LOGICAL_DEVICE__POWER_ON_HOURS:
				return POWER_ON_HOURS_EDEFAULT == null ? powerOnHours != null : !POWER_ON_HOURS_EDEFAULT.equals(powerOnHours);
			case CimPackage.CIM_LOGICAL_DEVICE__TOTAL_POWER_ON_HOURS:
				return TOTAL_POWER_ON_HOURS_EDEFAULT == null ? totalPowerOnHours != null : !TOTAL_POWER_ON_HOURS_EDEFAULT.equals(totalPowerOnHours);
			case CimPackage.CIM_LOGICAL_DEVICE__IDENTIFYING_DESCRIPTIONS:
				return identifyingDescriptions != null && !identifyingDescriptions.isEmpty();
			case CimPackage.CIM_LOGICAL_DEVICE__ADDITIONAL_AVAILABILITY:
				return additionalAvailability != null && !additionalAvailability.isEmpty();
			case CimPackage.CIM_LOGICAL_DEVICE__MAX_QUIESCE_TIME:
				return MAX_QUIESCE_TIME_EDEFAULT == null ? maxQuiesceTime != null : !MAX_QUIESCE_TIME_EDEFAULT.equals(maxQuiesceTime);
			case CimPackage.CIM_LOGICAL_DEVICE__LOCATION_INDICATOR:
				return LOCATION_INDICATOR_EDEFAULT == null ? locationIndicator != null : !LOCATION_INDICATOR_EDEFAULT.equals(locationIndicator);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_LOGICAL_DEVICE___SET_POWER_STATE__INTEGER_STRING:
				return SetPowerState((Integer)arguments.get(0), (String)arguments.get(1));
			case CimPackage.CIM_LOGICAL_DEVICE___RESET:
				return Reset();
			case CimPackage.CIM_LOGICAL_DEVICE___ENABLE_DEVICE__BOOLEAN:
				return EnableDevice((Boolean)arguments.get(0));
			case CimPackage.CIM_LOGICAL_DEVICE___ONLINE_DEVICE__BOOLEAN:
				return OnlineDevice((Boolean)arguments.get(0));
			case CimPackage.CIM_LOGICAL_DEVICE___QUIESCE_DEVICE__BOOLEAN:
				return QuiesceDevice((Boolean)arguments.get(0));
			case CimPackage.CIM_LOGICAL_DEVICE___SAVE_PROPERTIES:
				return SaveProperties();
			case CimPackage.CIM_LOGICAL_DEVICE___RESTORE_PROPERTIES:
				return RestoreProperties();
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
		result.append(" (SystemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", SystemName: ");
		result.append(systemName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", DeviceID: ");
		result.append(deviceID);
		result.append(", PowerManagementSupported: ");
		result.append(powerManagementSupported);
		result.append(", PowerManagementCapabilities: ");
		result.append(powerManagementCapabilities);
		result.append(", Availability: ");
		result.append(availability);
		result.append(", StatusInfo: ");
		result.append(statusInfo);
		result.append(", LastErrorCode: ");
		result.append(lastErrorCode);
		result.append(", ErrorDescription: ");
		result.append(errorDescription);
		result.append(", ErrorCleared: ");
		result.append(errorCleared);
		result.append(", OtherIdentifyingInfo: ");
		result.append(otherIdentifyingInfo);
		result.append(", PowerOnHours: ");
		result.append(powerOnHours);
		result.append(", TotalPowerOnHours: ");
		result.append(totalPowerOnHours);
		result.append(", IdentifyingDescriptions: ");
		result.append(identifyingDescriptions);
		result.append(", AdditionalAvailability: ");
		result.append(additionalAvailability);
		result.append(", MaxQuiesceTime: ");
		result.append(maxQuiesceTime);
		result.append(", LocationIndicator: ");
		result.append(locationIndicator);
		result.append(')');
		return result.toString();
	}

} //CIM_LogicalDeviceImpl

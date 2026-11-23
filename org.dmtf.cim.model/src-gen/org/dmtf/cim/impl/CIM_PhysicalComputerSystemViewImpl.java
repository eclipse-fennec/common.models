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

import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_PhysicalComputerSystemView;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Physical Computer System View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getEnabledState <em>Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getRequestedState <em>Requested State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getHealthState <em>Health State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getFRUInfoSupported <em>FRU Info Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getSKU <em>SKU</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getPowerUtilizationModesSupported <em>Power Utilization Modes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getPowerUtilizationMode <em>Power Utilization Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getPowerAllocationLimit <em>Power Allocation Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorElementName <em>Numeric Sensor Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorEnabledState <em>Numeric Sensor Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorHealthState <em>Numeric Sensor Health State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorCurrentState <em>Numeric Sensor Current State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorPrimaryStatus <em>Numeric Sensor Primary Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorBaseUnits <em>Numeric Sensor Base Units</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorUnitModifier <em>Numeric Sensor Unit Modifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorRateUnits <em>Numeric Sensor Rate Units</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorCurrentReading <em>Numeric Sensor Current Reading</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorSensorType <em>Numeric Sensor Sensor Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorOtherSensorTypeDescription <em>Numeric Sensor Other Sensor Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorUpperThresholdNonCritical <em>Numeric Sensor Upper Threshold Non Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorUpperThresholdCritical <em>Numeric Sensor Upper Threshold Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorUpperThresholdFatal <em>Numeric Sensor Upper Threshold Fatal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getLogInstanceID <em>Log Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getLogMaxNumberOfRecords <em>Log Max Number Of Records</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getLogCurrentNumberOfRecords <em>Log Current Number Of Records</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getLogOverWritePolicy <em>Log Over Write Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getLogState <em>Log State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getStructuredBootString <em>Structured Boot String</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getPersistentBootConfigOrder <em>Persistent Boot Config Order</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getOneTimeBootSource <em>One Time Boot Source</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumberOfProcessors <em>Number Of Processors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumberOfProcessorCores <em>Number Of Processor Cores</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumberOfProcessorThreads <em>Number Of Processor Threads</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getProcessorFamily <em>Processor Family</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getProcessorMaxClockSpeed <em>Processor Max Clock Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getMemoryBlockSize <em>Memory Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getMemoryNumberOfBlocks <em>Memory Number Of Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getMemoryConsumableBlocks <em>Memory Consumable Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getCurrentBIOSMajorVersion <em>Current BIOS Major Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getCurrentBIOSMinorVersion <em>Current BIOS Minor Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getCurrentBIOSRevisionNumber <em>Current BIOS Revision Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getCurrentBIOSBuildNumber <em>Current BIOS Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getCurrentManagementFirmwareMajorVersion <em>Current Management Firmware Major Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getCurrentManagementFirmwareMinorVersion <em>Current Management Firmware Minor Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getCurrentManagementFirmwareRevisionNumber <em>Current Management Firmware Revision Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getCurrentManagementFirmwareBuildNumber <em>Current Management Firmware Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getCurrentManagementFirmwareElementName <em>Current Management Firmware Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getCurrentManagementFirmwareVersionString <em>Current Management Firmware Version String</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getOSType <em>OS Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getOSVersion <em>OS Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getOSEnabledState <em>OS Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getCurrentBIOSVersionString <em>Current BIOS Version String</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getDedicated <em>Dedicated</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getIdentifyingDescriptions <em>Identifying Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getOtherDedicatedDescriptions <em>Other Dedicated Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getOtherIdentifyingInfo <em>Other Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getProcessorCurrentClockSpeed <em>Processor Current Clock Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorContext <em>Numeric Sensor Context</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorLowerThresholdCritical <em>Numeric Sensor Lower Threshold Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorLowerThresholdFatal <em>Numeric Sensor Lower Threshold Fatal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalComputerSystemViewImpl#getNumericSensorLowerThresholdNonCritical <em>Numeric Sensor Lower Threshold Non Critical</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PhysicalComputerSystemViewImpl extends CIM_ViewImpl implements CIM_PhysicalComputerSystemView {
	/**
	 * The default value of the '{@link #getEnabledState() <em>Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENABLED_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabledState() <em>Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledState()
	 * @generated
	 * @ordered
	 */
	protected Integer enabledState = ENABLED_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestedState() <em>Requested State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REQUESTED_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestedState() <em>Requested State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedState()
	 * @generated
	 * @ordered
	 */
	protected Integer requestedState = REQUESTED_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperationalStatus() <em>Operational Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> operationalStatus;

	/**
	 * The default value of the '{@link #getHealthState() <em>Health State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HEALTH_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHealthState() <em>Health State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthState()
	 * @generated
	 * @ordered
	 */
	protected Integer healthState = HEALTH_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFRUInfoSupported() <em>FRU Info Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFRUInfoSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FRU_INFO_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFRUInfoSupported() <em>FRU Info Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFRUInfoSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean fruInfoSupported = FRU_INFO_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String manufacturer = MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSKU() <em>SKU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSKU()
	 * @generated
	 * @ordered
	 */
	protected static final String SKU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSKU() <em>SKU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSKU()
	 * @generated
	 * @ordered
	 */
	protected String sku = SKU_EDEFAULT;

	/**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartNumber() <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartNumber() <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected String partNumber = PART_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPowerUtilizationModesSupported() <em>Power Utilization Modes Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerUtilizationModesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> powerUtilizationModesSupported;

	/**
	 * The default value of the '{@link #getPowerUtilizationMode() <em>Power Utilization Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerUtilizationMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POWER_UTILIZATION_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerUtilizationMode() <em>Power Utilization Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerUtilizationMode()
	 * @generated
	 * @ordered
	 */
	protected Integer powerUtilizationMode = POWER_UTILIZATION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerAllocationLimit() <em>Power Allocation Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerAllocationLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Long POWER_ALLOCATION_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerAllocationLimit() <em>Power Allocation Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerAllocationLimit()
	 * @generated
	 * @ordered
	 */
	protected Long powerAllocationLimit = POWER_ALLOCATION_LIMIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNumericSensorElementName() <em>Numeric Sensor Element Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorElementName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> numericSensorElementName;

	/**
	 * The cached value of the '{@link #getNumericSensorEnabledState() <em>Numeric Sensor Enabled State</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorEnabledState()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numericSensorEnabledState;

	/**
	 * The cached value of the '{@link #getNumericSensorHealthState() <em>Numeric Sensor Health State</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorHealthState()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numericSensorHealthState;

	/**
	 * The cached value of the '{@link #getNumericSensorCurrentState() <em>Numeric Sensor Current State</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorCurrentState()
	 * @generated
	 * @ordered
	 */
	protected EList<String> numericSensorCurrentState;

	/**
	 * The cached value of the '{@link #getNumericSensorPrimaryStatus() <em>Numeric Sensor Primary Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorPrimaryStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numericSensorPrimaryStatus;

	/**
	 * The cached value of the '{@link #getNumericSensorBaseUnits() <em>Numeric Sensor Base Units</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorBaseUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numericSensorBaseUnits;

	/**
	 * The cached value of the '{@link #getNumericSensorUnitModifier() <em>Numeric Sensor Unit Modifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorUnitModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numericSensorUnitModifier;

	/**
	 * The cached value of the '{@link #getNumericSensorRateUnits() <em>Numeric Sensor Rate Units</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorRateUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numericSensorRateUnits;

	/**
	 * The cached value of the '{@link #getNumericSensorCurrentReading() <em>Numeric Sensor Current Reading</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorCurrentReading()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numericSensorCurrentReading;

	/**
	 * The cached value of the '{@link #getNumericSensorSensorType() <em>Numeric Sensor Sensor Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorSensorType()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numericSensorSensorType;

	/**
	 * The cached value of the '{@link #getNumericSensorOtherSensorTypeDescription() <em>Numeric Sensor Other Sensor Type Description</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorOtherSensorTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<String> numericSensorOtherSensorTypeDescription;

	/**
	 * The cached value of the '{@link #getNumericSensorUpperThresholdNonCritical() <em>Numeric Sensor Upper Threshold Non Critical</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorUpperThresholdNonCritical()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numericSensorUpperThresholdNonCritical;

	/**
	 * The cached value of the '{@link #getNumericSensorUpperThresholdCritical() <em>Numeric Sensor Upper Threshold Critical</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorUpperThresholdCritical()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numericSensorUpperThresholdCritical;

	/**
	 * The cached value of the '{@link #getNumericSensorUpperThresholdFatal() <em>Numeric Sensor Upper Threshold Fatal</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorUpperThresholdFatal()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numericSensorUpperThresholdFatal;

	/**
	 * The cached value of the '{@link #getLogInstanceID() <em>Log Instance ID</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogInstanceID()
	 * @generated
	 * @ordered
	 */
	protected EList<String> logInstanceID;

	/**
	 * The cached value of the '{@link #getLogMaxNumberOfRecords() <em>Log Max Number Of Records</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogMaxNumberOfRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> logMaxNumberOfRecords;

	/**
	 * The cached value of the '{@link #getLogCurrentNumberOfRecords() <em>Log Current Number Of Records</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogCurrentNumberOfRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> logCurrentNumberOfRecords;

	/**
	 * The cached value of the '{@link #getLogOverWritePolicy() <em>Log Over Write Policy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogOverWritePolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> logOverWritePolicy;

	/**
	 * The cached value of the '{@link #getLogState() <em>Log State</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogState()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> logState;

	/**
	 * The cached value of the '{@link #getStructuredBootString() <em>Structured Boot String</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredBootString()
	 * @generated
	 * @ordered
	 */
	protected EList<String> structuredBootString;

	/**
	 * The cached value of the '{@link #getPersistentBootConfigOrder() <em>Persistent Boot Config Order</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentBootConfigOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> persistentBootConfigOrder;

	/**
	 * The default value of the '{@link #getOneTimeBootSource() <em>One Time Boot Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneTimeBootSource()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ONE_TIME_BOOT_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOneTimeBootSource() <em>One Time Boot Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneTimeBootSource()
	 * @generated
	 * @ordered
	 */
	protected Integer oneTimeBootSource = ONE_TIME_BOOT_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfProcessors() <em>Number Of Processors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfProcessors()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_PROCESSORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfProcessors() <em>Number Of Processors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfProcessors()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfProcessors = NUMBER_OF_PROCESSORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfProcessorCores() <em>Number Of Processor Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfProcessorCores()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_PROCESSOR_CORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfProcessorCores() <em>Number Of Processor Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfProcessorCores()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfProcessorCores = NUMBER_OF_PROCESSOR_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfProcessorThreads() <em>Number Of Processor Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfProcessorThreads()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_PROCESSOR_THREADS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfProcessorThreads() <em>Number Of Processor Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfProcessorThreads()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfProcessorThreads = NUMBER_OF_PROCESSOR_THREADS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessorFamily() <em>Processor Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorFamily()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROCESSOR_FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessorFamily() <em>Processor Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorFamily()
	 * @generated
	 * @ordered
	 */
	protected Integer processorFamily = PROCESSOR_FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessorMaxClockSpeed() <em>Processor Max Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorMaxClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROCESSOR_MAX_CLOCK_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessorMaxClockSpeed() <em>Processor Max Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorMaxClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long processorMaxClockSpeed = PROCESSOR_MAX_CLOCK_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryBlockSize() <em>Memory Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MEMORY_BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryBlockSize() <em>Memory Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Long memoryBlockSize = MEMORY_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryNumberOfBlocks() <em>Memory Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryNumberOfBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final Long MEMORY_NUMBER_OF_BLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryNumberOfBlocks() <em>Memory Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryNumberOfBlocks()
	 * @generated
	 * @ordered
	 */
	protected Long memoryNumberOfBlocks = MEMORY_NUMBER_OF_BLOCKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryConsumableBlocks() <em>Memory Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryConsumableBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final Long MEMORY_CONSUMABLE_BLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryConsumableBlocks() <em>Memory Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryConsumableBlocks()
	 * @generated
	 * @ordered
	 */
	protected Long memoryConsumableBlocks = MEMORY_CONSUMABLE_BLOCKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentBIOSMajorVersion() <em>Current BIOS Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBIOSMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_BIOS_MAJOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentBIOSMajorVersion() <em>Current BIOS Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBIOSMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer currentBIOSMajorVersion = CURRENT_BIOS_MAJOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentBIOSMinorVersion() <em>Current BIOS Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBIOSMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_BIOS_MINOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentBIOSMinorVersion() <em>Current BIOS Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBIOSMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer currentBIOSMinorVersion = CURRENT_BIOS_MINOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentBIOSRevisionNumber() <em>Current BIOS Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBIOSRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_BIOS_REVISION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentBIOSRevisionNumber() <em>Current BIOS Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBIOSRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer currentBIOSRevisionNumber = CURRENT_BIOS_REVISION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentBIOSBuildNumber() <em>Current BIOS Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBIOSBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_BIOS_BUILD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentBIOSBuildNumber() <em>Current BIOS Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBIOSBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer currentBIOSBuildNumber = CURRENT_BIOS_BUILD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentManagementFirmwareMajorVersion() <em>Current Management Firmware Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentManagementFirmwareMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_MANAGEMENT_FIRMWARE_MAJOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentManagementFirmwareMajorVersion() <em>Current Management Firmware Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentManagementFirmwareMajorVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer currentManagementFirmwareMajorVersion = CURRENT_MANAGEMENT_FIRMWARE_MAJOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentManagementFirmwareMinorVersion() <em>Current Management Firmware Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentManagementFirmwareMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_MANAGEMENT_FIRMWARE_MINOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentManagementFirmwareMinorVersion() <em>Current Management Firmware Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentManagementFirmwareMinorVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer currentManagementFirmwareMinorVersion = CURRENT_MANAGEMENT_FIRMWARE_MINOR_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentManagementFirmwareRevisionNumber() <em>Current Management Firmware Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentManagementFirmwareRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_MANAGEMENT_FIRMWARE_REVISION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentManagementFirmwareRevisionNumber() <em>Current Management Firmware Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentManagementFirmwareRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer currentManagementFirmwareRevisionNumber = CURRENT_MANAGEMENT_FIRMWARE_REVISION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentManagementFirmwareBuildNumber() <em>Current Management Firmware Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentManagementFirmwareBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_MANAGEMENT_FIRMWARE_BUILD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentManagementFirmwareBuildNumber() <em>Current Management Firmware Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentManagementFirmwareBuildNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer currentManagementFirmwareBuildNumber = CURRENT_MANAGEMENT_FIRMWARE_BUILD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentManagementFirmwareElementName() <em>Current Management Firmware Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentManagementFirmwareElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_MANAGEMENT_FIRMWARE_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentManagementFirmwareElementName() <em>Current Management Firmware Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentManagementFirmwareElementName()
	 * @generated
	 * @ordered
	 */
	protected String currentManagementFirmwareElementName = CURRENT_MANAGEMENT_FIRMWARE_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentManagementFirmwareVersionString() <em>Current Management Firmware Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentManagementFirmwareVersionString()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_MANAGEMENT_FIRMWARE_VERSION_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentManagementFirmwareVersionString() <em>Current Management Firmware Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentManagementFirmwareVersionString()
	 * @generated
	 * @ordered
	 */
	protected String currentManagementFirmwareVersionString = CURRENT_MANAGEMENT_FIRMWARE_VERSION_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getOSType() <em>OS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOSType() <em>OS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSType()
	 * @generated
	 * @ordered
	 */
	protected Integer osType = OS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOSVersion() <em>OS Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOSVersion() <em>OS Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSVersion()
	 * @generated
	 * @ordered
	 */
	protected String osVersion = OS_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOSEnabledState() <em>OS Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSEnabledState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OS_ENABLED_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOSEnabledState() <em>OS Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSEnabledState()
	 * @generated
	 * @ordered
	 */
	protected Integer osEnabledState = OS_ENABLED_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentBIOSVersionString() <em>Current BIOS Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBIOSVersionString()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_BIOS_VERSION_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentBIOSVersionString() <em>Current BIOS Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentBIOSVersionString()
	 * @generated
	 * @ordered
	 */
	protected String currentBIOSVersionString = CURRENT_BIOS_VERSION_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDedicated() <em>Dedicated</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDedicated()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> dedicated;

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
	 * The cached value of the '{@link #getOtherDedicatedDescriptions() <em>Other Dedicated Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherDedicatedDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherDedicatedDescriptions;

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
	 * The default value of the '{@link #getProcessorCurrentClockSpeed() <em>Processor Current Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorCurrentClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROCESSOR_CURRENT_CLOCK_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessorCurrentClockSpeed() <em>Processor Current Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorCurrentClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long processorCurrentClockSpeed = PROCESSOR_CURRENT_CLOCK_SPEED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNumericSensorContext() <em>Numeric Sensor Context</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorContext()
	 * @generated
	 * @ordered
	 */
	protected EList<String> numericSensorContext;

	/**
	 * The cached value of the '{@link #getNumericSensorLowerThresholdCritical() <em>Numeric Sensor Lower Threshold Critical</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorLowerThresholdCritical()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numericSensorLowerThresholdCritical;

	/**
	 * The cached value of the '{@link #getNumericSensorLowerThresholdFatal() <em>Numeric Sensor Lower Threshold Fatal</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorLowerThresholdFatal()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numericSensorLowerThresholdFatal;

	/**
	 * The cached value of the '{@link #getNumericSensorLowerThresholdNonCritical() <em>Numeric Sensor Lower Threshold Non Critical</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericSensorLowerThresholdNonCritical()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> numericSensorLowerThresholdNonCritical;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PhysicalComputerSystemViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PhysicalComputerSystemView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEnabledState() {
		return enabledState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabledState(Integer newEnabledState) {
		Integer oldEnabledState = enabledState;
		enabledState = newEnabledState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__ENABLED_STATE, oldEnabledState, enabledState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRequestedState() {
		return requestedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestedState(Integer newRequestedState) {
		Integer oldRequestedState = requestedState;
		requestedState = newRequestedState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__REQUESTED_STATE, oldRequestedState, requestedState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getOperationalStatus() {
		if (operationalStatus == null) {
			operationalStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OPERATIONAL_STATUS);
		}
		return operationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHealthState() {
		return healthState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHealthState(Integer newHealthState) {
		Integer oldHealthState = healthState;
		healthState = newHealthState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__HEALTH_STATE, oldHealthState, healthState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFRUInfoSupported() {
		return fruInfoSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFRUInfoSupported(Boolean newFRUInfoSupported) {
		Boolean oldFRUInfoSupported = fruInfoSupported;
		fruInfoSupported = newFRUInfoSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__FRU_INFO_SUPPORTED, oldFRUInfoSupported, fruInfoSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManufacturer(String newManufacturer) {
		String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSKU() {
		return sku;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSKU(String newSKU) {
		String oldSKU = sku;
		sku = newSKU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__SKU, oldSKU, sku));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerialNumber(String newSerialNumber) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPartNumber(String newPartNumber) {
		String oldPartNumber = partNumber;
		partNumber = newPartNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PART_NUMBER, oldPartNumber, partNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPowerUtilizationModesSupported() {
		if (powerUtilizationModesSupported == null) {
			powerUtilizationModesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__POWER_UTILIZATION_MODES_SUPPORTED);
		}
		return powerUtilizationModesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPowerUtilizationMode() {
		return powerUtilizationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerUtilizationMode(Integer newPowerUtilizationMode) {
		Integer oldPowerUtilizationMode = powerUtilizationMode;
		powerUtilizationMode = newPowerUtilizationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__POWER_UTILIZATION_MODE, oldPowerUtilizationMode, powerUtilizationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPowerAllocationLimit() {
		return powerAllocationLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerAllocationLimit(Long newPowerAllocationLimit) {
		Long oldPowerAllocationLimit = powerAllocationLimit;
		powerAllocationLimit = newPowerAllocationLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__POWER_ALLOCATION_LIMIT, oldPowerAllocationLimit, powerAllocationLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNumericSensorElementName() {
		if (numericSensorElementName == null) {
			numericSensorElementName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_ELEMENT_NAME);
		}
		return numericSensorElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumericSensorEnabledState() {
		if (numericSensorEnabledState == null) {
			numericSensorEnabledState = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_ENABLED_STATE);
		}
		return numericSensorEnabledState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumericSensorHealthState() {
		if (numericSensorHealthState == null) {
			numericSensorHealthState = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_HEALTH_STATE);
		}
		return numericSensorHealthState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNumericSensorCurrentState() {
		if (numericSensorCurrentState == null) {
			numericSensorCurrentState = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_CURRENT_STATE);
		}
		return numericSensorCurrentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumericSensorPrimaryStatus() {
		if (numericSensorPrimaryStatus == null) {
			numericSensorPrimaryStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_PRIMARY_STATUS);
		}
		return numericSensorPrimaryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumericSensorBaseUnits() {
		if (numericSensorBaseUnits == null) {
			numericSensorBaseUnits = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_BASE_UNITS);
		}
		return numericSensorBaseUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumericSensorUnitModifier() {
		if (numericSensorUnitModifier == null) {
			numericSensorUnitModifier = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UNIT_MODIFIER);
		}
		return numericSensorUnitModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumericSensorRateUnits() {
		if (numericSensorRateUnits == null) {
			numericSensorRateUnits = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_RATE_UNITS);
		}
		return numericSensorRateUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumericSensorCurrentReading() {
		if (numericSensorCurrentReading == null) {
			numericSensorCurrentReading = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_CURRENT_READING);
		}
		return numericSensorCurrentReading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumericSensorSensorType() {
		if (numericSensorSensorType == null) {
			numericSensorSensorType = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_SENSOR_TYPE);
		}
		return numericSensorSensorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNumericSensorOtherSensorTypeDescription() {
		if (numericSensorOtherSensorTypeDescription == null) {
			numericSensorOtherSensorTypeDescription = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_OTHER_SENSOR_TYPE_DESCRIPTION);
		}
		return numericSensorOtherSensorTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumericSensorUpperThresholdNonCritical() {
		if (numericSensorUpperThresholdNonCritical == null) {
			numericSensorUpperThresholdNonCritical = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UPPER_THRESHOLD_NON_CRITICAL);
		}
		return numericSensorUpperThresholdNonCritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumericSensorUpperThresholdCritical() {
		if (numericSensorUpperThresholdCritical == null) {
			numericSensorUpperThresholdCritical = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UPPER_THRESHOLD_CRITICAL);
		}
		return numericSensorUpperThresholdCritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumericSensorUpperThresholdFatal() {
		if (numericSensorUpperThresholdFatal == null) {
			numericSensorUpperThresholdFatal = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UPPER_THRESHOLD_FATAL);
		}
		return numericSensorUpperThresholdFatal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLogInstanceID() {
		if (logInstanceID == null) {
			logInstanceID = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_INSTANCE_ID);
		}
		return logInstanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getLogMaxNumberOfRecords() {
		if (logMaxNumberOfRecords == null) {
			logMaxNumberOfRecords = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_MAX_NUMBER_OF_RECORDS);
		}
		return logMaxNumberOfRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getLogCurrentNumberOfRecords() {
		if (logCurrentNumberOfRecords == null) {
			logCurrentNumberOfRecords = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_CURRENT_NUMBER_OF_RECORDS);
		}
		return logCurrentNumberOfRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLogOverWritePolicy() {
		if (logOverWritePolicy == null) {
			logOverWritePolicy = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_OVER_WRITE_POLICY);
		}
		return logOverWritePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLogState() {
		if (logState == null) {
			logState = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_STATE);
		}
		return logState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStructuredBootString() {
		if (structuredBootString == null) {
			structuredBootString = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__STRUCTURED_BOOT_STRING);
		}
		return structuredBootString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPersistentBootConfigOrder() {
		if (persistentBootConfigOrder == null) {
			persistentBootConfigOrder = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PERSISTENT_BOOT_CONFIG_ORDER);
		}
		return persistentBootConfigOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOneTimeBootSource() {
		return oneTimeBootSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOneTimeBootSource(Integer newOneTimeBootSource) {
		Integer oldOneTimeBootSource = oneTimeBootSource;
		oneTimeBootSource = newOneTimeBootSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__ONE_TIME_BOOT_SOURCE, oldOneTimeBootSource, oneTimeBootSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfProcessors() {
		return numberOfProcessors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfProcessors(Integer newNumberOfProcessors) {
		Integer oldNumberOfProcessors = numberOfProcessors;
		numberOfProcessors = newNumberOfProcessors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMBER_OF_PROCESSORS, oldNumberOfProcessors, numberOfProcessors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfProcessorCores() {
		return numberOfProcessorCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfProcessorCores(Integer newNumberOfProcessorCores) {
		Integer oldNumberOfProcessorCores = numberOfProcessorCores;
		numberOfProcessorCores = newNumberOfProcessorCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMBER_OF_PROCESSOR_CORES, oldNumberOfProcessorCores, numberOfProcessorCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfProcessorThreads() {
		return numberOfProcessorThreads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfProcessorThreads(Integer newNumberOfProcessorThreads) {
		Integer oldNumberOfProcessorThreads = numberOfProcessorThreads;
		numberOfProcessorThreads = newNumberOfProcessorThreads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMBER_OF_PROCESSOR_THREADS, oldNumberOfProcessorThreads, numberOfProcessorThreads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProcessorFamily() {
		return processorFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessorFamily(Integer newProcessorFamily) {
		Integer oldProcessorFamily = processorFamily;
		processorFamily = newProcessorFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PROCESSOR_FAMILY, oldProcessorFamily, processorFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getProcessorMaxClockSpeed() {
		return processorMaxClockSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessorMaxClockSpeed(Long newProcessorMaxClockSpeed) {
		Long oldProcessorMaxClockSpeed = processorMaxClockSpeed;
		processorMaxClockSpeed = newProcessorMaxClockSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PROCESSOR_MAX_CLOCK_SPEED, oldProcessorMaxClockSpeed, processorMaxClockSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMemoryBlockSize() {
		return memoryBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemoryBlockSize(Long newMemoryBlockSize) {
		Long oldMemoryBlockSize = memoryBlockSize;
		memoryBlockSize = newMemoryBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MEMORY_BLOCK_SIZE, oldMemoryBlockSize, memoryBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMemoryNumberOfBlocks() {
		return memoryNumberOfBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemoryNumberOfBlocks(Long newMemoryNumberOfBlocks) {
		Long oldMemoryNumberOfBlocks = memoryNumberOfBlocks;
		memoryNumberOfBlocks = newMemoryNumberOfBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MEMORY_NUMBER_OF_BLOCKS, oldMemoryNumberOfBlocks, memoryNumberOfBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMemoryConsumableBlocks() {
		return memoryConsumableBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemoryConsumableBlocks(Long newMemoryConsumableBlocks) {
		Long oldMemoryConsumableBlocks = memoryConsumableBlocks;
		memoryConsumableBlocks = newMemoryConsumableBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MEMORY_CONSUMABLE_BLOCKS, oldMemoryConsumableBlocks, memoryConsumableBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentBIOSMajorVersion() {
		return currentBIOSMajorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentBIOSMajorVersion(Integer newCurrentBIOSMajorVersion) {
		Integer oldCurrentBIOSMajorVersion = currentBIOSMajorVersion;
		currentBIOSMajorVersion = newCurrentBIOSMajorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_MAJOR_VERSION, oldCurrentBIOSMajorVersion, currentBIOSMajorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentBIOSMinorVersion() {
		return currentBIOSMinorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentBIOSMinorVersion(Integer newCurrentBIOSMinorVersion) {
		Integer oldCurrentBIOSMinorVersion = currentBIOSMinorVersion;
		currentBIOSMinorVersion = newCurrentBIOSMinorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_MINOR_VERSION, oldCurrentBIOSMinorVersion, currentBIOSMinorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentBIOSRevisionNumber() {
		return currentBIOSRevisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentBIOSRevisionNumber(Integer newCurrentBIOSRevisionNumber) {
		Integer oldCurrentBIOSRevisionNumber = currentBIOSRevisionNumber;
		currentBIOSRevisionNumber = newCurrentBIOSRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_REVISION_NUMBER, oldCurrentBIOSRevisionNumber, currentBIOSRevisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentBIOSBuildNumber() {
		return currentBIOSBuildNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentBIOSBuildNumber(Integer newCurrentBIOSBuildNumber) {
		Integer oldCurrentBIOSBuildNumber = currentBIOSBuildNumber;
		currentBIOSBuildNumber = newCurrentBIOSBuildNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_BUILD_NUMBER, oldCurrentBIOSBuildNumber, currentBIOSBuildNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentManagementFirmwareMajorVersion() {
		return currentManagementFirmwareMajorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentManagementFirmwareMajorVersion(Integer newCurrentManagementFirmwareMajorVersion) {
		Integer oldCurrentManagementFirmwareMajorVersion = currentManagementFirmwareMajorVersion;
		currentManagementFirmwareMajorVersion = newCurrentManagementFirmwareMajorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_MAJOR_VERSION, oldCurrentManagementFirmwareMajorVersion, currentManagementFirmwareMajorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentManagementFirmwareMinorVersion() {
		return currentManagementFirmwareMinorVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentManagementFirmwareMinorVersion(Integer newCurrentManagementFirmwareMinorVersion) {
		Integer oldCurrentManagementFirmwareMinorVersion = currentManagementFirmwareMinorVersion;
		currentManagementFirmwareMinorVersion = newCurrentManagementFirmwareMinorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_MINOR_VERSION, oldCurrentManagementFirmwareMinorVersion, currentManagementFirmwareMinorVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentManagementFirmwareRevisionNumber() {
		return currentManagementFirmwareRevisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentManagementFirmwareRevisionNumber(Integer newCurrentManagementFirmwareRevisionNumber) {
		Integer oldCurrentManagementFirmwareRevisionNumber = currentManagementFirmwareRevisionNumber;
		currentManagementFirmwareRevisionNumber = newCurrentManagementFirmwareRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_REVISION_NUMBER, oldCurrentManagementFirmwareRevisionNumber, currentManagementFirmwareRevisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentManagementFirmwareBuildNumber() {
		return currentManagementFirmwareBuildNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentManagementFirmwareBuildNumber(Integer newCurrentManagementFirmwareBuildNumber) {
		Integer oldCurrentManagementFirmwareBuildNumber = currentManagementFirmwareBuildNumber;
		currentManagementFirmwareBuildNumber = newCurrentManagementFirmwareBuildNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_BUILD_NUMBER, oldCurrentManagementFirmwareBuildNumber, currentManagementFirmwareBuildNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentManagementFirmwareElementName() {
		return currentManagementFirmwareElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentManagementFirmwareElementName(String newCurrentManagementFirmwareElementName) {
		String oldCurrentManagementFirmwareElementName = currentManagementFirmwareElementName;
		currentManagementFirmwareElementName = newCurrentManagementFirmwareElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_ELEMENT_NAME, oldCurrentManagementFirmwareElementName, currentManagementFirmwareElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentManagementFirmwareVersionString() {
		return currentManagementFirmwareVersionString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentManagementFirmwareVersionString(String newCurrentManagementFirmwareVersionString) {
		String oldCurrentManagementFirmwareVersionString = currentManagementFirmwareVersionString;
		currentManagementFirmwareVersionString = newCurrentManagementFirmwareVersionString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_VERSION_STRING, oldCurrentManagementFirmwareVersionString, currentManagementFirmwareVersionString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOSType() {
		return osType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOSType(Integer newOSType) {
		Integer oldOSType = osType;
		osType = newOSType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OS_TYPE, oldOSType, osType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOSVersion() {
		return osVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOSVersion(String newOSVersion) {
		String oldOSVersion = osVersion;
		osVersion = newOSVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OS_VERSION, oldOSVersion, osVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOSEnabledState() {
		return osEnabledState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOSEnabledState(Integer newOSEnabledState) {
		Integer oldOSEnabledState = osEnabledState;
		osEnabledState = newOSEnabledState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OS_ENABLED_STATE, oldOSEnabledState, osEnabledState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentBIOSVersionString() {
		return currentBIOSVersionString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentBIOSVersionString(String newCurrentBIOSVersionString) {
		String oldCurrentBIOSVersionString = currentBIOSVersionString;
		currentBIOSVersionString = newCurrentBIOSVersionString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_VERSION_STRING, oldCurrentBIOSVersionString, currentBIOSVersionString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getDedicated() {
		if (dedicated == null) {
			dedicated = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__DEDICATED);
		}
		return dedicated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getIdentifyingDescriptions() {
		if (identifyingDescriptions == null) {
			identifyingDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__IDENTIFYING_DESCRIPTIONS);
		}
		return identifyingDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherDedicatedDescriptions() {
		if (otherDedicatedDescriptions == null) {
			otherDedicatedDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OTHER_DEDICATED_DESCRIPTIONS);
		}
		return otherDedicatedDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherIdentifyingInfo() {
		if (otherIdentifyingInfo == null) {
			otherIdentifyingInfo = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OTHER_IDENTIFYING_INFO);
		}
		return otherIdentifyingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getProcessorCurrentClockSpeed() {
		return processorCurrentClockSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessorCurrentClockSpeed(Long newProcessorCurrentClockSpeed) {
		Long oldProcessorCurrentClockSpeed = processorCurrentClockSpeed;
		processorCurrentClockSpeed = newProcessorCurrentClockSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PROCESSOR_CURRENT_CLOCK_SPEED, oldProcessorCurrentClockSpeed, processorCurrentClockSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNumericSensorContext() {
		if (numericSensorContext == null) {
			numericSensorContext = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_CONTEXT);
		}
		return numericSensorContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumericSensorLowerThresholdCritical() {
		if (numericSensorLowerThresholdCritical == null) {
			numericSensorLowerThresholdCritical = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_LOWER_THRESHOLD_CRITICAL);
		}
		return numericSensorLowerThresholdCritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumericSensorLowerThresholdFatal() {
		if (numericSensorLowerThresholdFatal == null) {
			numericSensorLowerThresholdFatal = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_LOWER_THRESHOLD_FATAL);
		}
		return numericSensorLowerThresholdFatal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getNumericSensorLowerThresholdNonCritical() {
		if (numericSensorLowerThresholdNonCritical == null) {
			numericSensorLowerThresholdNonCritical = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_LOWER_THRESHOLD_NON_CRITICAL);
		}
		return numericSensorLowerThresholdNonCritical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long RequestStateChange(Integer RequestedState, CIM_ConcreteJob Job, String TimeoutPeriod) {
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
	public Long ClearLog(String LogInstanceID) {
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
	public Long InstallSoftwareFromURI(CIM_ConcreteJob Job, EList<Integer> Classifications, String URI, EList<Integer> InstallOptions, EList<String> InstallOptionsValues) {
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
	public Long ModifyPersistentBootConfigOrder(EList<String> StructuredBootString, CIM_ConcreteJob Job) {
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
	public Long SetOneTimeBootSource(String StructuredBootString, CIM_ConcreteJob Job) {
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
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__ENABLED_STATE:
				return getEnabledState();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__REQUESTED_STATE:
				return getRequestedState();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OPERATIONAL_STATUS:
				return getOperationalStatus();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__HEALTH_STATE:
				return getHealthState();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__FRU_INFO_SUPPORTED:
				return getFRUInfoSupported();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__TAG:
				return getTag();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MANUFACTURER:
				return getManufacturer();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MODEL:
				return getModel();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__SKU:
				return getSKU();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__SERIAL_NUMBER:
				return getSerialNumber();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__VERSION:
				return getVersion();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PART_NUMBER:
				return getPartNumber();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__POWER_UTILIZATION_MODES_SUPPORTED:
				return getPowerUtilizationModesSupported();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__POWER_UTILIZATION_MODE:
				return getPowerUtilizationMode();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__POWER_ALLOCATION_LIMIT:
				return getPowerAllocationLimit();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_ELEMENT_NAME:
				return getNumericSensorElementName();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_ENABLED_STATE:
				return getNumericSensorEnabledState();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_HEALTH_STATE:
				return getNumericSensorHealthState();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_CURRENT_STATE:
				return getNumericSensorCurrentState();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_PRIMARY_STATUS:
				return getNumericSensorPrimaryStatus();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_BASE_UNITS:
				return getNumericSensorBaseUnits();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UNIT_MODIFIER:
				return getNumericSensorUnitModifier();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_RATE_UNITS:
				return getNumericSensorRateUnits();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_CURRENT_READING:
				return getNumericSensorCurrentReading();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_SENSOR_TYPE:
				return getNumericSensorSensorType();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_OTHER_SENSOR_TYPE_DESCRIPTION:
				return getNumericSensorOtherSensorTypeDescription();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UPPER_THRESHOLD_NON_CRITICAL:
				return getNumericSensorUpperThresholdNonCritical();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UPPER_THRESHOLD_CRITICAL:
				return getNumericSensorUpperThresholdCritical();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UPPER_THRESHOLD_FATAL:
				return getNumericSensorUpperThresholdFatal();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_INSTANCE_ID:
				return getLogInstanceID();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_MAX_NUMBER_OF_RECORDS:
				return getLogMaxNumberOfRecords();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_CURRENT_NUMBER_OF_RECORDS:
				return getLogCurrentNumberOfRecords();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_OVER_WRITE_POLICY:
				return getLogOverWritePolicy();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_STATE:
				return getLogState();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__STRUCTURED_BOOT_STRING:
				return getStructuredBootString();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PERSISTENT_BOOT_CONFIG_ORDER:
				return getPersistentBootConfigOrder();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__ONE_TIME_BOOT_SOURCE:
				return getOneTimeBootSource();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMBER_OF_PROCESSORS:
				return getNumberOfProcessors();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMBER_OF_PROCESSOR_CORES:
				return getNumberOfProcessorCores();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMBER_OF_PROCESSOR_THREADS:
				return getNumberOfProcessorThreads();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PROCESSOR_FAMILY:
				return getProcessorFamily();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PROCESSOR_MAX_CLOCK_SPEED:
				return getProcessorMaxClockSpeed();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MEMORY_BLOCK_SIZE:
				return getMemoryBlockSize();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MEMORY_NUMBER_OF_BLOCKS:
				return getMemoryNumberOfBlocks();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MEMORY_CONSUMABLE_BLOCKS:
				return getMemoryConsumableBlocks();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_MAJOR_VERSION:
				return getCurrentBIOSMajorVersion();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_MINOR_VERSION:
				return getCurrentBIOSMinorVersion();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_REVISION_NUMBER:
				return getCurrentBIOSRevisionNumber();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_BUILD_NUMBER:
				return getCurrentBIOSBuildNumber();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_MAJOR_VERSION:
				return getCurrentManagementFirmwareMajorVersion();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_MINOR_VERSION:
				return getCurrentManagementFirmwareMinorVersion();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_REVISION_NUMBER:
				return getCurrentManagementFirmwareRevisionNumber();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_BUILD_NUMBER:
				return getCurrentManagementFirmwareBuildNumber();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_ELEMENT_NAME:
				return getCurrentManagementFirmwareElementName();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_VERSION_STRING:
				return getCurrentManagementFirmwareVersionString();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OS_TYPE:
				return getOSType();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OS_VERSION:
				return getOSVersion();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OS_ENABLED_STATE:
				return getOSEnabledState();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_VERSION_STRING:
				return getCurrentBIOSVersionString();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__DEDICATED:
				return getDedicated();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__IDENTIFYING_DESCRIPTIONS:
				return getIdentifyingDescriptions();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OTHER_DEDICATED_DESCRIPTIONS:
				return getOtherDedicatedDescriptions();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OTHER_IDENTIFYING_INFO:
				return getOtherIdentifyingInfo();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PROCESSOR_CURRENT_CLOCK_SPEED:
				return getProcessorCurrentClockSpeed();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_CONTEXT:
				return getNumericSensorContext();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_LOWER_THRESHOLD_CRITICAL:
				return getNumericSensorLowerThresholdCritical();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_LOWER_THRESHOLD_FATAL:
				return getNumericSensorLowerThresholdFatal();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_LOWER_THRESHOLD_NON_CRITICAL:
				return getNumericSensorLowerThresholdNonCritical();
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
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__ENABLED_STATE:
				setEnabledState((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__REQUESTED_STATE:
				setRequestedState((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OPERATIONAL_STATUS:
				getOperationalStatus().clear();
				getOperationalStatus().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__HEALTH_STATE:
				setHealthState((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__FRU_INFO_SUPPORTED:
				setFRUInfoSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__TAG:
				setTag((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MODEL:
				setModel((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__SKU:
				setSKU((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__VERSION:
				setVersion((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PART_NUMBER:
				setPartNumber((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__POWER_UTILIZATION_MODES_SUPPORTED:
				getPowerUtilizationModesSupported().clear();
				getPowerUtilizationModesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__POWER_UTILIZATION_MODE:
				setPowerUtilizationMode((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__POWER_ALLOCATION_LIMIT:
				setPowerAllocationLimit((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_ELEMENT_NAME:
				getNumericSensorElementName().clear();
				getNumericSensorElementName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_ENABLED_STATE:
				getNumericSensorEnabledState().clear();
				getNumericSensorEnabledState().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_HEALTH_STATE:
				getNumericSensorHealthState().clear();
				getNumericSensorHealthState().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_CURRENT_STATE:
				getNumericSensorCurrentState().clear();
				getNumericSensorCurrentState().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_PRIMARY_STATUS:
				getNumericSensorPrimaryStatus().clear();
				getNumericSensorPrimaryStatus().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_BASE_UNITS:
				getNumericSensorBaseUnits().clear();
				getNumericSensorBaseUnits().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UNIT_MODIFIER:
				getNumericSensorUnitModifier().clear();
				getNumericSensorUnitModifier().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_RATE_UNITS:
				getNumericSensorRateUnits().clear();
				getNumericSensorRateUnits().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_CURRENT_READING:
				getNumericSensorCurrentReading().clear();
				getNumericSensorCurrentReading().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_SENSOR_TYPE:
				getNumericSensorSensorType().clear();
				getNumericSensorSensorType().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_OTHER_SENSOR_TYPE_DESCRIPTION:
				getNumericSensorOtherSensorTypeDescription().clear();
				getNumericSensorOtherSensorTypeDescription().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UPPER_THRESHOLD_NON_CRITICAL:
				getNumericSensorUpperThresholdNonCritical().clear();
				getNumericSensorUpperThresholdNonCritical().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UPPER_THRESHOLD_CRITICAL:
				getNumericSensorUpperThresholdCritical().clear();
				getNumericSensorUpperThresholdCritical().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UPPER_THRESHOLD_FATAL:
				getNumericSensorUpperThresholdFatal().clear();
				getNumericSensorUpperThresholdFatal().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_INSTANCE_ID:
				getLogInstanceID().clear();
				getLogInstanceID().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_MAX_NUMBER_OF_RECORDS:
				getLogMaxNumberOfRecords().clear();
				getLogMaxNumberOfRecords().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_CURRENT_NUMBER_OF_RECORDS:
				getLogCurrentNumberOfRecords().clear();
				getLogCurrentNumberOfRecords().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_OVER_WRITE_POLICY:
				getLogOverWritePolicy().clear();
				getLogOverWritePolicy().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_STATE:
				getLogState().clear();
				getLogState().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__STRUCTURED_BOOT_STRING:
				getStructuredBootString().clear();
				getStructuredBootString().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PERSISTENT_BOOT_CONFIG_ORDER:
				getPersistentBootConfigOrder().clear();
				getPersistentBootConfigOrder().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__ONE_TIME_BOOT_SOURCE:
				setOneTimeBootSource((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMBER_OF_PROCESSORS:
				setNumberOfProcessors((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMBER_OF_PROCESSOR_CORES:
				setNumberOfProcessorCores((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMBER_OF_PROCESSOR_THREADS:
				setNumberOfProcessorThreads((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PROCESSOR_FAMILY:
				setProcessorFamily((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PROCESSOR_MAX_CLOCK_SPEED:
				setProcessorMaxClockSpeed((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MEMORY_BLOCK_SIZE:
				setMemoryBlockSize((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MEMORY_NUMBER_OF_BLOCKS:
				setMemoryNumberOfBlocks((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MEMORY_CONSUMABLE_BLOCKS:
				setMemoryConsumableBlocks((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_MAJOR_VERSION:
				setCurrentBIOSMajorVersion((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_MINOR_VERSION:
				setCurrentBIOSMinorVersion((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_REVISION_NUMBER:
				setCurrentBIOSRevisionNumber((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_BUILD_NUMBER:
				setCurrentBIOSBuildNumber((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_MAJOR_VERSION:
				setCurrentManagementFirmwareMajorVersion((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_MINOR_VERSION:
				setCurrentManagementFirmwareMinorVersion((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_REVISION_NUMBER:
				setCurrentManagementFirmwareRevisionNumber((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_BUILD_NUMBER:
				setCurrentManagementFirmwareBuildNumber((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_ELEMENT_NAME:
				setCurrentManagementFirmwareElementName((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_VERSION_STRING:
				setCurrentManagementFirmwareVersionString((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OS_TYPE:
				setOSType((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OS_VERSION:
				setOSVersion((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OS_ENABLED_STATE:
				setOSEnabledState((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_VERSION_STRING:
				setCurrentBIOSVersionString((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__DEDICATED:
				getDedicated().clear();
				getDedicated().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__IDENTIFYING_DESCRIPTIONS:
				getIdentifyingDescriptions().clear();
				getIdentifyingDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OTHER_DEDICATED_DESCRIPTIONS:
				getOtherDedicatedDescriptions().clear();
				getOtherDedicatedDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OTHER_IDENTIFYING_INFO:
				getOtherIdentifyingInfo().clear();
				getOtherIdentifyingInfo().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PROCESSOR_CURRENT_CLOCK_SPEED:
				setProcessorCurrentClockSpeed((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_CONTEXT:
				getNumericSensorContext().clear();
				getNumericSensorContext().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_LOWER_THRESHOLD_CRITICAL:
				getNumericSensorLowerThresholdCritical().clear();
				getNumericSensorLowerThresholdCritical().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_LOWER_THRESHOLD_FATAL:
				getNumericSensorLowerThresholdFatal().clear();
				getNumericSensorLowerThresholdFatal().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_LOWER_THRESHOLD_NON_CRITICAL:
				getNumericSensorLowerThresholdNonCritical().clear();
				getNumericSensorLowerThresholdNonCritical().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__ENABLED_STATE:
				setEnabledState(ENABLED_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__REQUESTED_STATE:
				setRequestedState(REQUESTED_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OPERATIONAL_STATUS:
				getOperationalStatus().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__HEALTH_STATE:
				setHealthState(HEALTH_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__FRU_INFO_SUPPORTED:
				setFRUInfoSupported(FRU_INFO_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__SKU:
				setSKU(SKU_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PART_NUMBER:
				setPartNumber(PART_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__POWER_UTILIZATION_MODES_SUPPORTED:
				getPowerUtilizationModesSupported().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__POWER_UTILIZATION_MODE:
				setPowerUtilizationMode(POWER_UTILIZATION_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__POWER_ALLOCATION_LIMIT:
				setPowerAllocationLimit(POWER_ALLOCATION_LIMIT_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_ELEMENT_NAME:
				getNumericSensorElementName().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_ENABLED_STATE:
				getNumericSensorEnabledState().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_HEALTH_STATE:
				getNumericSensorHealthState().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_CURRENT_STATE:
				getNumericSensorCurrentState().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_PRIMARY_STATUS:
				getNumericSensorPrimaryStatus().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_BASE_UNITS:
				getNumericSensorBaseUnits().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UNIT_MODIFIER:
				getNumericSensorUnitModifier().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_RATE_UNITS:
				getNumericSensorRateUnits().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_CURRENT_READING:
				getNumericSensorCurrentReading().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_SENSOR_TYPE:
				getNumericSensorSensorType().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_OTHER_SENSOR_TYPE_DESCRIPTION:
				getNumericSensorOtherSensorTypeDescription().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UPPER_THRESHOLD_NON_CRITICAL:
				getNumericSensorUpperThresholdNonCritical().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UPPER_THRESHOLD_CRITICAL:
				getNumericSensorUpperThresholdCritical().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UPPER_THRESHOLD_FATAL:
				getNumericSensorUpperThresholdFatal().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_INSTANCE_ID:
				getLogInstanceID().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_MAX_NUMBER_OF_RECORDS:
				getLogMaxNumberOfRecords().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_CURRENT_NUMBER_OF_RECORDS:
				getLogCurrentNumberOfRecords().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_OVER_WRITE_POLICY:
				getLogOverWritePolicy().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_STATE:
				getLogState().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__STRUCTURED_BOOT_STRING:
				getStructuredBootString().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PERSISTENT_BOOT_CONFIG_ORDER:
				getPersistentBootConfigOrder().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__ONE_TIME_BOOT_SOURCE:
				setOneTimeBootSource(ONE_TIME_BOOT_SOURCE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMBER_OF_PROCESSORS:
				setNumberOfProcessors(NUMBER_OF_PROCESSORS_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMBER_OF_PROCESSOR_CORES:
				setNumberOfProcessorCores(NUMBER_OF_PROCESSOR_CORES_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMBER_OF_PROCESSOR_THREADS:
				setNumberOfProcessorThreads(NUMBER_OF_PROCESSOR_THREADS_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PROCESSOR_FAMILY:
				setProcessorFamily(PROCESSOR_FAMILY_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PROCESSOR_MAX_CLOCK_SPEED:
				setProcessorMaxClockSpeed(PROCESSOR_MAX_CLOCK_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MEMORY_BLOCK_SIZE:
				setMemoryBlockSize(MEMORY_BLOCK_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MEMORY_NUMBER_OF_BLOCKS:
				setMemoryNumberOfBlocks(MEMORY_NUMBER_OF_BLOCKS_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MEMORY_CONSUMABLE_BLOCKS:
				setMemoryConsumableBlocks(MEMORY_CONSUMABLE_BLOCKS_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_MAJOR_VERSION:
				setCurrentBIOSMajorVersion(CURRENT_BIOS_MAJOR_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_MINOR_VERSION:
				setCurrentBIOSMinorVersion(CURRENT_BIOS_MINOR_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_REVISION_NUMBER:
				setCurrentBIOSRevisionNumber(CURRENT_BIOS_REVISION_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_BUILD_NUMBER:
				setCurrentBIOSBuildNumber(CURRENT_BIOS_BUILD_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_MAJOR_VERSION:
				setCurrentManagementFirmwareMajorVersion(CURRENT_MANAGEMENT_FIRMWARE_MAJOR_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_MINOR_VERSION:
				setCurrentManagementFirmwareMinorVersion(CURRENT_MANAGEMENT_FIRMWARE_MINOR_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_REVISION_NUMBER:
				setCurrentManagementFirmwareRevisionNumber(CURRENT_MANAGEMENT_FIRMWARE_REVISION_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_BUILD_NUMBER:
				setCurrentManagementFirmwareBuildNumber(CURRENT_MANAGEMENT_FIRMWARE_BUILD_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_ELEMENT_NAME:
				setCurrentManagementFirmwareElementName(CURRENT_MANAGEMENT_FIRMWARE_ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_VERSION_STRING:
				setCurrentManagementFirmwareVersionString(CURRENT_MANAGEMENT_FIRMWARE_VERSION_STRING_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OS_TYPE:
				setOSType(OS_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OS_VERSION:
				setOSVersion(OS_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OS_ENABLED_STATE:
				setOSEnabledState(OS_ENABLED_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_VERSION_STRING:
				setCurrentBIOSVersionString(CURRENT_BIOS_VERSION_STRING_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__DEDICATED:
				getDedicated().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__IDENTIFYING_DESCRIPTIONS:
				getIdentifyingDescriptions().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OTHER_DEDICATED_DESCRIPTIONS:
				getOtherDedicatedDescriptions().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OTHER_IDENTIFYING_INFO:
				getOtherIdentifyingInfo().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PROCESSOR_CURRENT_CLOCK_SPEED:
				setProcessorCurrentClockSpeed(PROCESSOR_CURRENT_CLOCK_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_CONTEXT:
				getNumericSensorContext().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_LOWER_THRESHOLD_CRITICAL:
				getNumericSensorLowerThresholdCritical().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_LOWER_THRESHOLD_FATAL:
				getNumericSensorLowerThresholdFatal().clear();
				return;
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_LOWER_THRESHOLD_NON_CRITICAL:
				getNumericSensorLowerThresholdNonCritical().clear();
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
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__ENABLED_STATE:
				return ENABLED_STATE_EDEFAULT == null ? enabledState != null : !ENABLED_STATE_EDEFAULT.equals(enabledState);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__REQUESTED_STATE:
				return REQUESTED_STATE_EDEFAULT == null ? requestedState != null : !REQUESTED_STATE_EDEFAULT.equals(requestedState);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OPERATIONAL_STATUS:
				return operationalStatus != null && !operationalStatus.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__HEALTH_STATE:
				return HEALTH_STATE_EDEFAULT == null ? healthState != null : !HEALTH_STATE_EDEFAULT.equals(healthState);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__FRU_INFO_SUPPORTED:
				return FRU_INFO_SUPPORTED_EDEFAULT == null ? fruInfoSupported != null : !FRU_INFO_SUPPORTED_EDEFAULT.equals(fruInfoSupported);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__SKU:
				return SKU_EDEFAULT == null ? sku != null : !SKU_EDEFAULT.equals(sku);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PART_NUMBER:
				return PART_NUMBER_EDEFAULT == null ? partNumber != null : !PART_NUMBER_EDEFAULT.equals(partNumber);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__POWER_UTILIZATION_MODES_SUPPORTED:
				return powerUtilizationModesSupported != null && !powerUtilizationModesSupported.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__POWER_UTILIZATION_MODE:
				return POWER_UTILIZATION_MODE_EDEFAULT == null ? powerUtilizationMode != null : !POWER_UTILIZATION_MODE_EDEFAULT.equals(powerUtilizationMode);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__POWER_ALLOCATION_LIMIT:
				return POWER_ALLOCATION_LIMIT_EDEFAULT == null ? powerAllocationLimit != null : !POWER_ALLOCATION_LIMIT_EDEFAULT.equals(powerAllocationLimit);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_ELEMENT_NAME:
				return numericSensorElementName != null && !numericSensorElementName.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_ENABLED_STATE:
				return numericSensorEnabledState != null && !numericSensorEnabledState.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_HEALTH_STATE:
				return numericSensorHealthState != null && !numericSensorHealthState.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_CURRENT_STATE:
				return numericSensorCurrentState != null && !numericSensorCurrentState.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_PRIMARY_STATUS:
				return numericSensorPrimaryStatus != null && !numericSensorPrimaryStatus.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_BASE_UNITS:
				return numericSensorBaseUnits != null && !numericSensorBaseUnits.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UNIT_MODIFIER:
				return numericSensorUnitModifier != null && !numericSensorUnitModifier.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_RATE_UNITS:
				return numericSensorRateUnits != null && !numericSensorRateUnits.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_CURRENT_READING:
				return numericSensorCurrentReading != null && !numericSensorCurrentReading.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_SENSOR_TYPE:
				return numericSensorSensorType != null && !numericSensorSensorType.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_OTHER_SENSOR_TYPE_DESCRIPTION:
				return numericSensorOtherSensorTypeDescription != null && !numericSensorOtherSensorTypeDescription.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UPPER_THRESHOLD_NON_CRITICAL:
				return numericSensorUpperThresholdNonCritical != null && !numericSensorUpperThresholdNonCritical.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UPPER_THRESHOLD_CRITICAL:
				return numericSensorUpperThresholdCritical != null && !numericSensorUpperThresholdCritical.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_UPPER_THRESHOLD_FATAL:
				return numericSensorUpperThresholdFatal != null && !numericSensorUpperThresholdFatal.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_INSTANCE_ID:
				return logInstanceID != null && !logInstanceID.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_MAX_NUMBER_OF_RECORDS:
				return logMaxNumberOfRecords != null && !logMaxNumberOfRecords.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_CURRENT_NUMBER_OF_RECORDS:
				return logCurrentNumberOfRecords != null && !logCurrentNumberOfRecords.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_OVER_WRITE_POLICY:
				return logOverWritePolicy != null && !logOverWritePolicy.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__LOG_STATE:
				return logState != null && !logState.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__STRUCTURED_BOOT_STRING:
				return structuredBootString != null && !structuredBootString.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PERSISTENT_BOOT_CONFIG_ORDER:
				return persistentBootConfigOrder != null && !persistentBootConfigOrder.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__ONE_TIME_BOOT_SOURCE:
				return ONE_TIME_BOOT_SOURCE_EDEFAULT == null ? oneTimeBootSource != null : !ONE_TIME_BOOT_SOURCE_EDEFAULT.equals(oneTimeBootSource);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMBER_OF_PROCESSORS:
				return NUMBER_OF_PROCESSORS_EDEFAULT == null ? numberOfProcessors != null : !NUMBER_OF_PROCESSORS_EDEFAULT.equals(numberOfProcessors);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMBER_OF_PROCESSOR_CORES:
				return NUMBER_OF_PROCESSOR_CORES_EDEFAULT == null ? numberOfProcessorCores != null : !NUMBER_OF_PROCESSOR_CORES_EDEFAULT.equals(numberOfProcessorCores);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMBER_OF_PROCESSOR_THREADS:
				return NUMBER_OF_PROCESSOR_THREADS_EDEFAULT == null ? numberOfProcessorThreads != null : !NUMBER_OF_PROCESSOR_THREADS_EDEFAULT.equals(numberOfProcessorThreads);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PROCESSOR_FAMILY:
				return PROCESSOR_FAMILY_EDEFAULT == null ? processorFamily != null : !PROCESSOR_FAMILY_EDEFAULT.equals(processorFamily);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PROCESSOR_MAX_CLOCK_SPEED:
				return PROCESSOR_MAX_CLOCK_SPEED_EDEFAULT == null ? processorMaxClockSpeed != null : !PROCESSOR_MAX_CLOCK_SPEED_EDEFAULT.equals(processorMaxClockSpeed);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MEMORY_BLOCK_SIZE:
				return MEMORY_BLOCK_SIZE_EDEFAULT == null ? memoryBlockSize != null : !MEMORY_BLOCK_SIZE_EDEFAULT.equals(memoryBlockSize);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MEMORY_NUMBER_OF_BLOCKS:
				return MEMORY_NUMBER_OF_BLOCKS_EDEFAULT == null ? memoryNumberOfBlocks != null : !MEMORY_NUMBER_OF_BLOCKS_EDEFAULT.equals(memoryNumberOfBlocks);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__MEMORY_CONSUMABLE_BLOCKS:
				return MEMORY_CONSUMABLE_BLOCKS_EDEFAULT == null ? memoryConsumableBlocks != null : !MEMORY_CONSUMABLE_BLOCKS_EDEFAULT.equals(memoryConsumableBlocks);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_MAJOR_VERSION:
				return CURRENT_BIOS_MAJOR_VERSION_EDEFAULT == null ? currentBIOSMajorVersion != null : !CURRENT_BIOS_MAJOR_VERSION_EDEFAULT.equals(currentBIOSMajorVersion);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_MINOR_VERSION:
				return CURRENT_BIOS_MINOR_VERSION_EDEFAULT == null ? currentBIOSMinorVersion != null : !CURRENT_BIOS_MINOR_VERSION_EDEFAULT.equals(currentBIOSMinorVersion);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_REVISION_NUMBER:
				return CURRENT_BIOS_REVISION_NUMBER_EDEFAULT == null ? currentBIOSRevisionNumber != null : !CURRENT_BIOS_REVISION_NUMBER_EDEFAULT.equals(currentBIOSRevisionNumber);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_BUILD_NUMBER:
				return CURRENT_BIOS_BUILD_NUMBER_EDEFAULT == null ? currentBIOSBuildNumber != null : !CURRENT_BIOS_BUILD_NUMBER_EDEFAULT.equals(currentBIOSBuildNumber);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_MAJOR_VERSION:
				return CURRENT_MANAGEMENT_FIRMWARE_MAJOR_VERSION_EDEFAULT == null ? currentManagementFirmwareMajorVersion != null : !CURRENT_MANAGEMENT_FIRMWARE_MAJOR_VERSION_EDEFAULT.equals(currentManagementFirmwareMajorVersion);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_MINOR_VERSION:
				return CURRENT_MANAGEMENT_FIRMWARE_MINOR_VERSION_EDEFAULT == null ? currentManagementFirmwareMinorVersion != null : !CURRENT_MANAGEMENT_FIRMWARE_MINOR_VERSION_EDEFAULT.equals(currentManagementFirmwareMinorVersion);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_REVISION_NUMBER:
				return CURRENT_MANAGEMENT_FIRMWARE_REVISION_NUMBER_EDEFAULT == null ? currentManagementFirmwareRevisionNumber != null : !CURRENT_MANAGEMENT_FIRMWARE_REVISION_NUMBER_EDEFAULT.equals(currentManagementFirmwareRevisionNumber);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_BUILD_NUMBER:
				return CURRENT_MANAGEMENT_FIRMWARE_BUILD_NUMBER_EDEFAULT == null ? currentManagementFirmwareBuildNumber != null : !CURRENT_MANAGEMENT_FIRMWARE_BUILD_NUMBER_EDEFAULT.equals(currentManagementFirmwareBuildNumber);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_ELEMENT_NAME:
				return CURRENT_MANAGEMENT_FIRMWARE_ELEMENT_NAME_EDEFAULT == null ? currentManagementFirmwareElementName != null : !CURRENT_MANAGEMENT_FIRMWARE_ELEMENT_NAME_EDEFAULT.equals(currentManagementFirmwareElementName);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_MANAGEMENT_FIRMWARE_VERSION_STRING:
				return CURRENT_MANAGEMENT_FIRMWARE_VERSION_STRING_EDEFAULT == null ? currentManagementFirmwareVersionString != null : !CURRENT_MANAGEMENT_FIRMWARE_VERSION_STRING_EDEFAULT.equals(currentManagementFirmwareVersionString);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OS_TYPE:
				return OS_TYPE_EDEFAULT == null ? osType != null : !OS_TYPE_EDEFAULT.equals(osType);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OS_VERSION:
				return OS_VERSION_EDEFAULT == null ? osVersion != null : !OS_VERSION_EDEFAULT.equals(osVersion);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OS_ENABLED_STATE:
				return OS_ENABLED_STATE_EDEFAULT == null ? osEnabledState != null : !OS_ENABLED_STATE_EDEFAULT.equals(osEnabledState);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__CURRENT_BIOS_VERSION_STRING:
				return CURRENT_BIOS_VERSION_STRING_EDEFAULT == null ? currentBIOSVersionString != null : !CURRENT_BIOS_VERSION_STRING_EDEFAULT.equals(currentBIOSVersionString);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__DEDICATED:
				return dedicated != null && !dedicated.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__IDENTIFYING_DESCRIPTIONS:
				return identifyingDescriptions != null && !identifyingDescriptions.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OTHER_DEDICATED_DESCRIPTIONS:
				return otherDedicatedDescriptions != null && !otherDedicatedDescriptions.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__OTHER_IDENTIFYING_INFO:
				return otherIdentifyingInfo != null && !otherIdentifyingInfo.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__PROCESSOR_CURRENT_CLOCK_SPEED:
				return PROCESSOR_CURRENT_CLOCK_SPEED_EDEFAULT == null ? processorCurrentClockSpeed != null : !PROCESSOR_CURRENT_CLOCK_SPEED_EDEFAULT.equals(processorCurrentClockSpeed);
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_CONTEXT:
				return numericSensorContext != null && !numericSensorContext.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_LOWER_THRESHOLD_CRITICAL:
				return numericSensorLowerThresholdCritical != null && !numericSensorLowerThresholdCritical.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_LOWER_THRESHOLD_FATAL:
				return numericSensorLowerThresholdFatal != null && !numericSensorLowerThresholdFatal.isEmpty();
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW__NUMERIC_SENSOR_LOWER_THRESHOLD_NON_CRITICAL:
				return numericSensorLowerThresholdNonCritical != null && !numericSensorLowerThresholdNonCritical.isEmpty();
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
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW___REQUEST_STATE_CHANGE__INTEGER_CIM_CONCRETEJOB_STRING:
				return RequestStateChange((Integer)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (String)arguments.get(2));
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW___CLEAR_LOG__STRING:
				return ClearLog((String)arguments.get(0));
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW___INSTALL_SOFTWARE_FROM_URI__CIM_CONCRETEJOB_ELIST_STRING_ELIST_ELIST:
				return InstallSoftwareFromURI((CIM_ConcreteJob)arguments.get(0), (EList<Integer>)arguments.get(1), (String)arguments.get(2), (EList<Integer>)arguments.get(3), (EList<String>)arguments.get(4));
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW___MODIFY_PERSISTENT_BOOT_CONFIG_ORDER__ELIST_CIM_CONCRETEJOB:
				return ModifyPersistentBootConfigOrder((EList<String>)arguments.get(0), (CIM_ConcreteJob)arguments.get(1));
			case CimPackage.CIM_PHYSICAL_COMPUTER_SYSTEM_VIEW___SET_ONE_TIME_BOOT_SOURCE__STRING_CIM_CONCRETEJOB:
				return SetOneTimeBootSource((String)arguments.get(0), (CIM_ConcreteJob)arguments.get(1));
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
		result.append(" (EnabledState: ");
		result.append(enabledState);
		result.append(", RequestedState: ");
		result.append(requestedState);
		result.append(", OperationalStatus: ");
		result.append(operationalStatus);
		result.append(", HealthState: ");
		result.append(healthState);
		result.append(", FRUInfoSupported: ");
		result.append(fruInfoSupported);
		result.append(", Tag: ");
		result.append(tag);
		result.append(", Manufacturer: ");
		result.append(manufacturer);
		result.append(", Model: ");
		result.append(model);
		result.append(", SKU: ");
		result.append(sku);
		result.append(", SerialNumber: ");
		result.append(serialNumber);
		result.append(", Version: ");
		result.append(version);
		result.append(", PartNumber: ");
		result.append(partNumber);
		result.append(", PowerUtilizationModesSupported: ");
		result.append(powerUtilizationModesSupported);
		result.append(", PowerUtilizationMode: ");
		result.append(powerUtilizationMode);
		result.append(", PowerAllocationLimit: ");
		result.append(powerAllocationLimit);
		result.append(", NumericSensorElementName: ");
		result.append(numericSensorElementName);
		result.append(", NumericSensorEnabledState: ");
		result.append(numericSensorEnabledState);
		result.append(", NumericSensorHealthState: ");
		result.append(numericSensorHealthState);
		result.append(", NumericSensorCurrentState: ");
		result.append(numericSensorCurrentState);
		result.append(", NumericSensorPrimaryStatus: ");
		result.append(numericSensorPrimaryStatus);
		result.append(", NumericSensorBaseUnits: ");
		result.append(numericSensorBaseUnits);
		result.append(", NumericSensorUnitModifier: ");
		result.append(numericSensorUnitModifier);
		result.append(", NumericSensorRateUnits: ");
		result.append(numericSensorRateUnits);
		result.append(", NumericSensorCurrentReading: ");
		result.append(numericSensorCurrentReading);
		result.append(", NumericSensorSensorType: ");
		result.append(numericSensorSensorType);
		result.append(", NumericSensorOtherSensorTypeDescription: ");
		result.append(numericSensorOtherSensorTypeDescription);
		result.append(", NumericSensorUpperThresholdNonCritical: ");
		result.append(numericSensorUpperThresholdNonCritical);
		result.append(", NumericSensorUpperThresholdCritical: ");
		result.append(numericSensorUpperThresholdCritical);
		result.append(", NumericSensorUpperThresholdFatal: ");
		result.append(numericSensorUpperThresholdFatal);
		result.append(", LogInstanceID: ");
		result.append(logInstanceID);
		result.append(", LogMaxNumberOfRecords: ");
		result.append(logMaxNumberOfRecords);
		result.append(", LogCurrentNumberOfRecords: ");
		result.append(logCurrentNumberOfRecords);
		result.append(", LogOverWritePolicy: ");
		result.append(logOverWritePolicy);
		result.append(", LogState: ");
		result.append(logState);
		result.append(", StructuredBootString: ");
		result.append(structuredBootString);
		result.append(", PersistentBootConfigOrder: ");
		result.append(persistentBootConfigOrder);
		result.append(", OneTimeBootSource: ");
		result.append(oneTimeBootSource);
		result.append(", NumberOfProcessors: ");
		result.append(numberOfProcessors);
		result.append(", NumberOfProcessorCores: ");
		result.append(numberOfProcessorCores);
		result.append(", NumberOfProcessorThreads: ");
		result.append(numberOfProcessorThreads);
		result.append(", ProcessorFamily: ");
		result.append(processorFamily);
		result.append(", ProcessorMaxClockSpeed: ");
		result.append(processorMaxClockSpeed);
		result.append(", MemoryBlockSize: ");
		result.append(memoryBlockSize);
		result.append(", MemoryNumberOfBlocks: ");
		result.append(memoryNumberOfBlocks);
		result.append(", MemoryConsumableBlocks: ");
		result.append(memoryConsumableBlocks);
		result.append(", CurrentBIOSMajorVersion: ");
		result.append(currentBIOSMajorVersion);
		result.append(", CurrentBIOSMinorVersion: ");
		result.append(currentBIOSMinorVersion);
		result.append(", CurrentBIOSRevisionNumber: ");
		result.append(currentBIOSRevisionNumber);
		result.append(", CurrentBIOSBuildNumber: ");
		result.append(currentBIOSBuildNumber);
		result.append(", CurrentManagementFirmwareMajorVersion: ");
		result.append(currentManagementFirmwareMajorVersion);
		result.append(", CurrentManagementFirmwareMinorVersion: ");
		result.append(currentManagementFirmwareMinorVersion);
		result.append(", CurrentManagementFirmwareRevisionNumber: ");
		result.append(currentManagementFirmwareRevisionNumber);
		result.append(", CurrentManagementFirmwareBuildNumber: ");
		result.append(currentManagementFirmwareBuildNumber);
		result.append(", CurrentManagementFirmwareElementName: ");
		result.append(currentManagementFirmwareElementName);
		result.append(", CurrentManagementFirmwareVersionString: ");
		result.append(currentManagementFirmwareVersionString);
		result.append(", OSType: ");
		result.append(osType);
		result.append(", OSVersion: ");
		result.append(osVersion);
		result.append(", OSEnabledState: ");
		result.append(osEnabledState);
		result.append(", CurrentBIOSVersionString: ");
		result.append(currentBIOSVersionString);
		result.append(", Dedicated: ");
		result.append(dedicated);
		result.append(", IdentifyingDescriptions: ");
		result.append(identifyingDescriptions);
		result.append(", OtherDedicatedDescriptions: ");
		result.append(otherDedicatedDescriptions);
		result.append(", OtherIdentifyingInfo: ");
		result.append(otherIdentifyingInfo);
		result.append(", ProcessorCurrentClockSpeed: ");
		result.append(processorCurrentClockSpeed);
		result.append(", NumericSensorContext: ");
		result.append(numericSensorContext);
		result.append(", NumericSensorLowerThresholdCritical: ");
		result.append(numericSensorLowerThresholdCritical);
		result.append(", NumericSensorLowerThresholdFatal: ");
		result.append(numericSensorLowerThresholdFatal);
		result.append(", NumericSensorLowerThresholdNonCritical: ");
		result.append(numericSensorLowerThresholdNonCritical);
		result.append(')');
		return result.toString();
	}

} //CIM_PhysicalComputerSystemViewImpl

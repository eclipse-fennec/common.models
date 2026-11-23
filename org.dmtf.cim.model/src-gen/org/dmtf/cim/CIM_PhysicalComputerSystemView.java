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
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Physical Computer System View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class defines a view class for a physical computer system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getEnabledState <em>Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getRequestedState <em>Requested State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getOperationalStatus <em>Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getHealthState <em>Health State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getFRUInfoSupported <em>FRU Info Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getTag <em>Tag</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getModel <em>Model</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getSKU <em>SKU</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getPowerUtilizationModesSupported <em>Power Utilization Modes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getPowerUtilizationMode <em>Power Utilization Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getPowerAllocationLimit <em>Power Allocation Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorElementName <em>Numeric Sensor Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorEnabledState <em>Numeric Sensor Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorHealthState <em>Numeric Sensor Health State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorCurrentState <em>Numeric Sensor Current State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorPrimaryStatus <em>Numeric Sensor Primary Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorBaseUnits <em>Numeric Sensor Base Units</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorUnitModifier <em>Numeric Sensor Unit Modifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorRateUnits <em>Numeric Sensor Rate Units</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorCurrentReading <em>Numeric Sensor Current Reading</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorSensorType <em>Numeric Sensor Sensor Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorOtherSensorTypeDescription <em>Numeric Sensor Other Sensor Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorUpperThresholdNonCritical <em>Numeric Sensor Upper Threshold Non Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorUpperThresholdCritical <em>Numeric Sensor Upper Threshold Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorUpperThresholdFatal <em>Numeric Sensor Upper Threshold Fatal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getLogInstanceID <em>Log Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getLogMaxNumberOfRecords <em>Log Max Number Of Records</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getLogCurrentNumberOfRecords <em>Log Current Number Of Records</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getLogOverWritePolicy <em>Log Over Write Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getLogState <em>Log State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getStructuredBootString <em>Structured Boot String</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getPersistentBootConfigOrder <em>Persistent Boot Config Order</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getOneTimeBootSource <em>One Time Boot Source</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumberOfProcessors <em>Number Of Processors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumberOfProcessorCores <em>Number Of Processor Cores</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumberOfProcessorThreads <em>Number Of Processor Threads</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getProcessorFamily <em>Processor Family</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getProcessorMaxClockSpeed <em>Processor Max Clock Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getMemoryBlockSize <em>Memory Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getMemoryNumberOfBlocks <em>Memory Number Of Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getMemoryConsumableBlocks <em>Memory Consumable Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentBIOSMajorVersion <em>Current BIOS Major Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentBIOSMinorVersion <em>Current BIOS Minor Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentBIOSRevisionNumber <em>Current BIOS Revision Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentBIOSBuildNumber <em>Current BIOS Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentManagementFirmwareMajorVersion <em>Current Management Firmware Major Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentManagementFirmwareMinorVersion <em>Current Management Firmware Minor Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentManagementFirmwareRevisionNumber <em>Current Management Firmware Revision Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentManagementFirmwareBuildNumber <em>Current Management Firmware Build Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentManagementFirmwareElementName <em>Current Management Firmware Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentManagementFirmwareVersionString <em>Current Management Firmware Version String</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getOSType <em>OS Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getOSVersion <em>OS Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getOSEnabledState <em>OS Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentBIOSVersionString <em>Current BIOS Version String</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getDedicated <em>Dedicated</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getIdentifyingDescriptions <em>Identifying Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getOtherDedicatedDescriptions <em>Other Dedicated Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getOtherIdentifyingInfo <em>Other Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getProcessorCurrentClockSpeed <em>Processor Current Clock Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorContext <em>Numeric Sensor Context</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorLowerThresholdCritical <em>Numeric Sensor Lower Threshold Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorLowerThresholdFatal <em>Numeric Sensor Lower Threshold Fatal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumericSensorLowerThresholdNonCritical <em>Numeric Sensor Lower Threshold Non Critical</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::Core::CoreElements' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='InstanceID is the property that may be used to opaquely and uniquely identify an instance of this class within the scope of the instantiating Namespace.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalComputerSystemView extends CIM_View {
	/**
	 * Returns the value of the '<em><b>Enabled State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property corresponds to the EnabledState property of the logical computer system represented by CIM_ComputerSystem. See CIM_EnabledLogicalElement.EnabledState for details on EnabledState.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled State</em>' attribute.
	 * @see #setEnabledState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_EnabledState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Enabled\",\"Disabled\",\"Shutting Down\",\"Not Applicable\",\"Enabled but Offline\",\"In Test\",\"Deferred\",\"Quiesce\",\"Starting\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_ComputerSystem.EnabledState\"]'"
	 * @generated
	 */
	Integer getEnabledState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getEnabledState <em>Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled State</em>' attribute.
	 * @see #getEnabledState()
	 * @generated
	 */
	void setEnabledState(Integer value);

	/**
	 * Returns the value of the '<em><b>Requested State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property corresponds to the RequestedState property of the logical computer system represented by CIM_ComputerSystem. See CIM_EnabledLogicalElement.RequestedState for details on RequestedState.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested State</em>' attribute.
	 * @see #setRequestedState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_RequestedState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Enabled\",\"Disabled\",\"Shut Down\",\"No Change\",\"Offline\",\"Test\",\"Deferred\",\"Quiesce\",\"Reboot\",\"Reset\",\"Not Applicable\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_ComputerSystem.RequestedState\"]'"
	 * @generated
	 */
	Integer getRequestedState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getRequestedState <em>Requested State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested State</em>' attribute.
	 * @see #getRequestedState()
	 * @generated
	 */
	void setRequestedState(Integer value);

	/**
	 * Returns the value of the '<em><b>Operational Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property corresponds to the OperationalStatus property of the logical computer system represented by CIM_ComputerSystem. See CIM_ManagedSystemElement.OperationalStatus Description for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operational Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_OperationalStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"OK\",\"Degraded\",\"Stressed\",\"Predictive Failure\",\"Error\",\"Non-Recoverable Error\",\"Starting\",\"Stopping\",\"Stopped\",\"In Service\",\"No Contact\",\"Lost Communication\",\"Aborted\",\"Dormant\",\"Supporting Entity in Error\",\"Completed\",\"Power Mode\",\"Relocating\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_ComputerSystem.OperationalStatus\"]'"
	 * @generated
	 */
	EList<Integer> getOperationalStatus();

	/**
	 * Returns the value of the '<em><b>Health State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property corresponds to the HealthState property of the logical computer system represented by CIM_ComputerSystem. See CIM_ManagedSystemElement.HealthState for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Health State</em>' attribute.
	 * @see #setHealthState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_HealthState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"5\",\"10\",\"15\",\"20\",\"25\",\"30\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"OK\",\"Degraded/Warning\",\"Minor failure\",\"Major failure\",\"Critical failure\",\"Non-recoverable error\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ComputerSystem.HealthState\"]'"
	 * @generated
	 */
	Integer getHealthState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getHealthState <em>Health State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health State</em>' attribute.
	 * @see #getHealthState()
	 * @generated
	 */
	void setHealthState(Integer value);

	/**
	 * Returns the value of the '<em><b>FRU Info Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the availability of the FRU Information on this physical computer system. See CIM_PhysicalAssetCapabilities.FRUInfoSupported for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FRU Info Supported</em>' attribute.
	 * @see #setFRUInfoSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_FRUInfoSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_PhysicalAssetCapabilities.FRUInfoSupported\"]'"
	 * @generated
	 */
	Boolean getFRUInfoSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getFRUInfoSupported <em>FRU Info Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FRU Info Supported</em>' attribute.
	 * @see #getFRUInfoSupported()
	 * @generated
	 */
	void setFRUInfoSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property corresponds to CIM_PhysicalFrame.Tag. See CIM_PhysicalFrame.Tag for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_Tag()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalFrame.Tag\"]'"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property corresponds to CIM_PhysicalFrame.Manufacturer. See CIM_PhysicalFrame.Manufacturer for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_Manufacturer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalFrame.Manufacturer\"]'"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property corresponds to CIM_PhysicalFrame.Model. See CIM_PhysicalFrame.Model for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_Model()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalFrame.Model\"]'"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>SKU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property corresponds to CIM_PhysicalFrame.SKU. See CIM_PhysicalFrame.SKU for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SKU</em>' attribute.
	 * @see #setSKU(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_SKU()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalFrame.SKU\"]'"
	 * @generated
	 */
	String getSKU();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getSKU <em>SKU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SKU</em>' attribute.
	 * @see #getSKU()
	 * @generated
	 */
	void setSKU(String value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property corresponds to CIM_PhysicalFrame.SerialNumber. See CIM_PhysicalFrame.SerialNumber for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_SerialNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalFrame.SerialNumber\"]'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property corresponds to CIM_PhysicalFrame.Version. See CIM_PhysicalFrame.Version for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_Version()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalFrame.Version\"]'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property corresponds to CIM_PhysicalFrame.PartNumber. See CIM_PhysicalFrame.PartNumber for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Number</em>' attribute.
	 * @see #setPartNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_PartNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalFrame.PartNumber\"]'"
	 * @generated
	 */
	String getPartNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getPartNumber <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Number</em>' attribute.
	 * @see #getPartNumber()
	 * @generated
	 */
	void setPartNumber(String value);

	/**
	 * Returns the value of the '<em><b>Power Utilization Modes Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property corresponds to PowerUtilizationModesSupported property of CIM_PowerUtilizationManagementCapabilities. See CIM_PowerUtilizationManagementCapabilities.PowerUtilizationModesSupported for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Utilization Modes Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_PowerUtilizationModesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Dynamic\",\"Static\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_PowerUtilizationManagementCapabilities.PowerUtilizationModesSupported\"]'"
	 * @generated
	 */
	EList<Integer> getPowerUtilizationModesSupported();

	/**
	 * Returns the value of the '<em><b>Power Utilization Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property corresponds to the PowerUtilizationMode of the CIM_PowerUtilizationManagementService. See CIM_PowerUtilizationManagementService.PowerUtilizationMode for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Utilization Mode</em>' attribute.
	 * @see #setPowerUtilizationMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_PowerUtilizationMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"None\",\"Dynamic\",\"Static\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_PowerUtilizationManagementService.PowerUtilizationMode\"]'"
	 * @generated
	 */
	Integer getPowerUtilizationMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getPowerUtilizationMode <em>Power Utilization Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Utilization Mode</em>' attribute.
	 * @see #getPowerUtilizationMode()
	 * @generated
	 */
	void setPowerUtilizationMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Power Allocation Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property corresponds to CIM_PowerAllocationSettingData.Limit. See CIM_PowerAllocationSettingData.Limit for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Allocation Limit</em>' attribute.
	 * @see #setPowerAllocationLimit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_PowerAllocationLimit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_PowerAllocationSettingData.Limit\"]' PUnit='watt * 10^-3'"
	 * @generated
	 */
	Long getPowerAllocationLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getPowerAllocationLimit <em>Power Allocation Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Allocation Limit</em>' attribute.
	 * @see #getPowerAllocationLimit()
	 * @generated
	 */
	void setPowerAllocationLimit(Long value);

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Element Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-friendly names of the numeric sensors on the computer system. See CIM_NumericSensor.ElementName for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Element Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorElementName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.ElementName\"]'"
	 * @generated
	 */
	EList<String> getNumericSensorElementName();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Enabled State</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * States of numeric sensors. See CIM_NumericSensor.EnabledState for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Enabled State</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorEnabledState()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Enabled\",\"Disabled\",\"Shutting Down\",\"Not Applicable\",\"Enabled but Offline\",\"In Test\",\"Deferred\",\"Quiesce\",\"Starting\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.EnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\"]'"
	 * @generated
	 */
	EList<Integer> getNumericSensorEnabledState();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Health State</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Health states of numeric sensors. See CIM_NumericSensor.HealthState for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Health State</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorHealthState()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"5\",\"10\",\"15\",\"20\",\"25\",\"30\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"OK\",\"Degraded/Warning\",\"Minor failure\",\"Major failure\",\"Critical failure\",\"Non-recoverable error\",\"DMTF Reserved\",\"Vendor Specific\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.HealthState\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\"]'"
	 * @generated
	 */
	EList<Integer> getNumericSensorHealthState();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Current State</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current states of numeric sensors. See CIM_NumericSensor.CurrentState for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Current State</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorCurrentState()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.CurrentState\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorHealthState\"]'"
	 * @generated
	 */
	EList<String> getNumericSensorCurrentState();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Primary Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Primary statuses of numeric sensors. See CIM_NumericSensor.PrimaryStatus for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Primary Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorPrimaryStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"OK\",\"Degraded\",\"Error\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.PrimaryStatus\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorHealthState\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentState\"]'"
	 * @generated
	 */
	EList<Integer> getNumericSensorPrimaryStatus();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Base Units</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base units of the values returned by the numeric sensors. See CIM_NumericSensor.BaseUnits for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Base Units</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorBaseUnits()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\"]' Values='[\"Unknown\",\"Other\",\"Degrees C\",\"Degrees F\",\"Degrees K\",\"Volts\",\"Amps\",\"Watts\",\"Joules\",\"Coulombs\",\"VA\",\"Nits\",\"Lumens\",\"Lux\",\"Candelas\",\"kPa\",\"PSI\",\"Newtons\",\"CFM\",\"RPM\",\"Hertz\",\"Seconds\",\"Minutes\",\"Hours\",\"Days\",\"Weeks\",\"Mils\",\"Inches\",\"Feet\",\"Cubic Inches\",\"Cubic Feet\",\"Meters\",\"Cubic Centimeters\",\"Cubic Meters\",\"Liters\",\"Fluid Ounces\",\"Radians\",\"Steradians\",\"Revolutions\",\"Cycles\",\"Gravities\",\"Ounces\",\"Pounds\",\"Foot-Pounds\",\"Ounce-Inches\",\"Gauss\",\"Gilberts\",\"Henries\",\"Farads\",\"Ohms\",\"Siemens\",\"Moles\",\"Becquerels\",\"PPM (parts/million)\",\"Decibels\",\"DbA\",\"DbC\",\"Grays\",\"Sieverts\",\"Color Temperature Degrees K\",\"Bits\",\"Bytes\",\"Words (data)\",\"DoubleWords\",\"QuadWords\",\"Percentage\",\"Pascals\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.BaseUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorHealthState\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentState\",\"CIM_PhysicalComputerSystemView.NumericSensorPrimaryStatus\"]'"
	 * @generated
	 */
	EList<Integer> getNumericSensorBaseUnits();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Unit Modifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit modifiers for the values returned by the numeric sensors. See CIM_NumericSensor.UnitModifier description for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Unit Modifier</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorUnitModifier()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.UnitModifier\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorHealthState\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentState\",\"CIM_PhysicalComputerSystemView.NumericSensorPrimaryStatus\",\"CIM_PhysicalComputerSystemView.NumericSensorBaseUnits\"]'"
	 * @generated
	 */
	EList<Integer> getNumericSensorUnitModifier();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Rate Units</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_NumericSensor.RateUnits for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Rate Units</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorRateUnits()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\"]' Values='[\"None\",\"Per MicroSecond\",\"Per MilliSecond\",\"Per Second\",\"Per Minute\",\"Per Hour\",\"Per Day\",\"Per Week\",\"Per Month\",\"Per Year\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.RateUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorHealthState\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentState\",\"CIM_PhysicalComputerSystemView.NumericSensorPrimaryStatus\",\"CIM_PhysicalComputerSystemView.NumericSensorBaseUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorUnitModifier\"]'"
	 * @generated
	 */
	EList<Integer> getNumericSensorRateUnits();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Current Reading</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_NumericSensor.CurrentReading for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Current Reading</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorCurrentReading()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.CurrentReading\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorHealthState\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentState\",\"CIM_PhysicalComputerSystemView.NumericSensorPrimaryStatus\",\"CIM_PhysicalComputerSystemView.NumericSensorBaseUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorUnitModifier\",\"CIM_PhysicalComputerSystemView.NumericSensorRateUnits\"]'"
	 * @generated
	 */
	EList<Integer> getNumericSensorCurrentReading();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Sensor Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_NumericSensor.SensorType for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Sensor Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorSensorType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Temperature\",\"Voltage\",\"Current\",\"Tachometer\",\"Counter\",\"Switch\",\"Lock\",\"Humidity\",\"Smoke Detection\",\"Presence\",\"Air Flow\",\"Power Consumption\",\"Power Production\",\"Pressure\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.SensorType\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorHealthState\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentState\",\"CIM_PhysicalComputerSystemView.NumericSensorPrimaryStatus\",\"CIM_PhysicalComputerSystemView.NumericSensorBaseUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorUnitModifier\",\"CIM_PhysicalComputerSystemView.NumericSensorRateUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentReading\"]'"
	 * @generated
	 */
	EList<Integer> getNumericSensorSensorType();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Other Sensor Type Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_NumericSensor.OtherSensorTypeDescription for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Other Sensor Type Description</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorOtherSensorTypeDescription()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.OtherSensorTypeDescription\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorHealthState\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentState\",\"CIM_PhysicalComputerSystemView.NumericSensorPrimaryStatus\",\"CIM_PhysicalComputerSystemView.NumericSensorBaseUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorUnitModifier\",\"CIM_PhysicalComputerSystemView.NumericSensorRateUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentReading\",\"CIM_PhysicalComputerSystemView.NumericSensorSensorType\"]'"
	 * @generated
	 */
	EList<String> getNumericSensorOtherSensorTypeDescription();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Upper Threshold Non Critical</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_NumericSensor.UpperThresholdNonCritical for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Upper Threshold Non Critical</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorUpperThresholdNonCritical()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.UpperThresholdNonCritical\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorHealthState\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentState\",\"CIM_PhysicalComputerSystemView.NumericSensorPrimaryStatus\",\"CIM_PhysicalComputerSystemView.NumericSensorBaseUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorUnitModifier\",\"CIM_PhysicalComputerSystemView.NumericSensorRateUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentReading\",\"CIM_PhysicalComputerSystemView.NumericSensorSensorType\",\"CIM_PhysicalComputerSystemView.NumericSensorOtherSensorTypeDescription\"]'"
	 * @generated
	 */
	EList<Integer> getNumericSensorUpperThresholdNonCritical();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Upper Threshold Critical</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_NumericSensor.UpperThresholdCritical description for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Upper Threshold Critical</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorUpperThresholdCritical()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.UpperThresholdCritical\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorHealthState\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentState\",\"CIM_PhysicalComputerSystemView.NumericSensorPrimaryStatus\",\"CIM_PhysicalComputerSystemView.NumericSensorBaseUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorUnitModifier\",\"CIM_PhysicalComputerSystemView.NumericSensorRateUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentReading\",\"CIM_PhysicalComputerSystemView.NumericSensorSensorType\",\"CIM_PhysicalComputerSystemView.NumericSensorOtherSensorTypeDescription\",\"CIM_PhysicalComputerSystemView.NumericSensorUpperThresholdNonCritical\"]'"
	 * @generated
	 */
	EList<Integer> getNumericSensorUpperThresholdCritical();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Upper Threshold Fatal</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_NumericSensor.UpperThresholdFatal for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Upper Threshold Fatal</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorUpperThresholdFatal()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.UpperThresholdFatal\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorHealthState\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentState\",\"CIM_PhysicalComputerSystemView.NumericSensorPrimaryStatus\",\"CIM_PhysicalComputerSystemView.NumericSensorBaseUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorUnitModifier\",\"CIM_PhysicalComputerSystemView.NumericSensorRateUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentReading\",\"CIM_PhysicalComputerSystemView.NumericSensorSensorType\",\"CIM_PhysicalComputerSystemView.NumericSensorOtherSensorTypeDescription\",\"CIM_PhysicalComputerSystemView.NumericSensorUpperThresholdNonCritical\",\"CIM_PhysicalComputerSystemView.NumericSensorUpperThresholdCritical\"]'"
	 * @generated
	 */
	EList<Integer> getNumericSensorUpperThresholdFatal();

	/**
	 * Returns the value of the '<em><b>Log Instance ID</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the identifiers for the underlying logs on this physical computer system. See CIM_RecordLog.InstanceID for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Instance ID</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_LogInstanceID()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_RecordLog.InstanceID\"]'"
	 * @generated
	 */
	EList<String> getLogInstanceID();

	/**
	 * Returns the value of the '<em><b>Log Max Number Of Records</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_RecordLog.MaxNumberOfRecords for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Max Number Of Records</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_LogMaxNumberOfRecords()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_RecordLog.MaxNumberOfRecords\",\"CIM_PhysicalComputerSystemView.LogInstanceID\"]'"
	 * @generated
	 */
	EList<Long> getLogMaxNumberOfRecords();

	/**
	 * Returns the value of the '<em><b>Log Current Number Of Records</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_RecordLog.CurrentNumberOfRecords for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Current Number Of Records</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_LogCurrentNumberOfRecords()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_RecordLog.CurrentNumberOfRecords\",\"CIM_PhysicalComputerSystemView.LogInstanceID\",\"CIM_PhysicalComputerSystemView.LogMaxNumberOfRecords\"]'"
	 * @generated
	 */
	EList<Long> getLogCurrentNumberOfRecords();

	/**
	 * Returns the value of the '<em><b>Log Over Write Policy</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_RecordLog.OverWritePolicy for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Over Write Policy</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_LogOverWritePolicy()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"7\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Wraps When Full\",\"Never Overwrites\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_RecordLog.OverwritePolicy\",\"CIM_PhysicalComputerSystemView.LogInstanceID\",\"CIM_PhysicalComputerSystemView.LogMaxNumberOfRecords\",\"CIM_PhysicalComputerSystemView.LogCurrentNumberOfRecords\"]'"
	 * @generated
	 */
	EList<Integer> getLogOverWritePolicy();

	/**
	 * Returns the value of the '<em><b>Log State</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_RecordLog.LogState for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log State</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_LogState()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Normal\",\"Erasing\",\"Not Applicable\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_RecordLog.LogState\",\"CIM_PhysicalComputerSystemView.LogInstanceID\",\"CIM_PhysicalComputerSystemView.LogMaxNumberOfRecords\",\"CIM_PhysicalComputerSystemView.LogCurrentNumberOfRecords\",\"CIM_PhysicalComputerSystemView.LogOverwritePolicy\"]'"
	 * @generated
	 */
	EList<Integer> getLogState();

	/**
	 * Returns the value of the '<em><b>Structured Boot String</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Strings identifying the boot sources on this physical computer system. See CIM_BootSourceSetting.StructuredBootString description for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structured Boot String</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_StructuredBootString()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_BootSourceSetting.StructuredBootString\"]'"
	 * @generated
	 */
	EList<String> getStructuredBootString();

	/**
	 * Returns the value of the '<em><b>Persistent Boot Config Order</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of elements identifying the boot order of the persistent boot configuration that shall be used during the next boot of the computer system, unless the OneTimeBootSource for the next boot is specified. The value of each element in this array is an index referencing an element in the array of StructuredBootString.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistent Boot Config Order</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_PersistentBootConfigOrder()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' ArrayType='Ordered'"
	 * @generated
	 */
	EList<Integer> getPersistentBootConfigOrder();

	/**
	 * Returns the value of the '<em><b>One Time Boot Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies the boot source that is used for the next one-time boot. The value of this property is an index referencing an element in the array of StructuredBootString.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>One Time Boot Source</em>' attribute.
	 * @see #setOneTimeBootSource(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_OneTimeBootSource()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getOneTimeBootSource();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getOneTimeBootSource <em>One Time Boot Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>One Time Boot Source</em>' attribute.
	 * @see #getOneTimeBootSource()
	 * @generated
	 */
	void setOneTimeBootSource(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Processors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies the number of processors on this physical computer system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Processors</em>' attribute.
	 * @see #setNumberOfProcessors(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumberOfProcessors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getNumberOfProcessors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumberOfProcessors <em>Number Of Processors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Processors</em>' attribute.
	 * @see #getNumberOfProcessors()
	 * @generated
	 */
	void setNumberOfProcessors(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Processor Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_ProcessorCapabilities.NumberOfProcessorCores for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Processor Cores</em>' attribute.
	 * @see #setNumberOfProcessorCores(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumberOfProcessorCores()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ProcessorCapabilities.NumberOfProcessorCores\"]'"
	 * @generated
	 */
	Integer getNumberOfProcessorCores();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumberOfProcessorCores <em>Number Of Processor Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Processor Cores</em>' attribute.
	 * @see #getNumberOfProcessorCores()
	 * @generated
	 */
	void setNumberOfProcessorCores(Integer value);

	/**
	 * Returns the value of the '<em><b>Number Of Processor Threads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_ProcessorCapabilities.NumberOfProcessorThreads for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Processor Threads</em>' attribute.
	 * @see #setNumberOfProcessorThreads(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumberOfProcessorThreads()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ProcessorCapabilities.NumberOfHardwareThreads\"]'"
	 * @generated
	 */
	Integer getNumberOfProcessorThreads();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getNumberOfProcessorThreads <em>Number Of Processor Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Processor Threads</em>' attribute.
	 * @see #getNumberOfProcessorThreads()
	 * @generated
	 */
	void setNumberOfProcessorThreads(Integer value);

	/**
	 * Returns the value of the '<em><b>Processor Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_Processor.Family for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processor Family</em>' attribute.
	 * @see #setProcessorFamily(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_ProcessorFamily()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82\",\"83\",\"84\",\"85\",\"86\",\"87\",\"88\",\"96\",\"97\",\"98\",\"99\",\"100\",\"101\",\"102\",\"103\",\"104\",\"105\",\"106\",\"107\",\"112\",\"120\",\"121\",\"122\",\"128\",\"130\",\"131\",\"132\",\"133\",\"134\",\"135\",\"136\",\"137\",\"138\",\"139\",\"140\",\"141\",\"142\",\"143\",\"144\",\"145\",\"146\",\"147\",\"148\",\"149\",\"150\",\"160\",\"161\",\"162\",\"163\",\"164\",\"165\",\"166\",\"167\",\"168\",\"169\",\"170\",\"171\",\"172\",\"173\",\"174\",\"175\",\"176\",\"177\",\"178\",\"179\",\"180\",\"181\",\"182\",\"183\",\"184\",\"185\",\"186\",\"187\",\"188\",\"189\",\"190\",\"191\",\"192\",\"193\",\"194\",\"195\",\"196\",\"197\",\"198\",\"199\",\"200\",\"201\",\"202\",\"203\",\"204\",\"205\",\"206\",\"207\",\"210\",\"211\",\"212\",\"213\",\"214\",\"215\",\"216\",\"217\",\"218\",\"219\",\"221\",\"222\",\"223\",\"224\",\"228\",\"229\",\"230\",\"231\",\"232\",\"233\",\"234\",\"235\",\"236\",\"237\",\"238\",\"239\",\"250\",\"251\",\"254\",\"255\",\"256\",\"257\",\"258\",\"259\",\"260\",\"261\",\"280\",\"281\",\"300\",\"301\",\"302\",\"320\",\"350\",\"500\",\"512\",\"513\",\"514\",\"600\",\"601\",\"602\",\"603\",\"604\",\"605\",\"606\",\"607\",\"608\",\"609\",\"610\",\"620\",\"621\",\"622\",\"623\",\"624\",\"625\",\"65534\",\"65535\"]' Values='[\"Other\",\"Unknown\",\"8086\",\"80286\",\"80386\",\"80486\",\"8087\",\"80287\",\"80387\",\"80487\",\"Pentium(R) brand\",\"Pentium(R) Pro\",\"Pentium(R) II\",\"Pentium(R) processor with MMX(TM) technology\",\"Celeron(TM)\",\"Pentium(R) II Xeon(TM)\",\"Pentium(R) III\",\"M1 Family\",\"M2 Family\",\"Intel(R) Celeron(R) M processor\",\"Intel(R) Pentium(R) 4 HT processor\",\"K5 Family\",\"K6 Family\",\"K6-2\",\"K6-3\",\"AMD Athlon(TM) Processor Family\",\"AMD(R) Duron(TM) Processor\",\"AMD29000 Family\",\"K6-2+\",\"Power PC Family\",\"Power PC 601\",\"Power PC 603\",\"Power PC 603+\",\"Power PC 604\",\"Power PC 620\",\"Power PC X704\",\"Power PC 750\",\"Intel(R) Core(TM) Duo processor\",\"Intel(R) Core(TM) Duo mobile processor\",\"Intel(R) Core(TM) Solo mobile processor\",\"Intel(R) Atom(TM) processor\",\"Intel(R) Core(TM) M processor\",\"Intel(R) Core(TM) m3 processor\",\"Intel(R) Core(TM) m5 processor\",\"Intel(R) Core(TM) m7 processor\",\"Alpha Family\",\"Alpha 21064\",\"Alpha 21066\",\"Alpha 21164\",\"Alpha 21164PC\",\"Alpha 21164a\",\"Alpha 21264\",\"Alpha 21364\",\"AMD Turion(TM) II Ultra Dual-Core Mobile M Processor Family\",\"AMD Turion(TM) II Dual-Core Mobile M Processor Family\",\"AMD Athlon(TM) II Dual-Core Mobile M Processor Family\",\"AMD Opteron(TM) 6100 Series Processor\",\"AMD Opteron(TM) 4100 Series Processor\",\"AMD Opteron(TM) 6200 Series Processor\",\"AMD Opteron(TM) 4200 Series Processor\",\"AMD FX(TM) Series Processor\",\"MIPS Family\",\"MIPS R4000\",\"MIPS R4200\",\"MIPS R4400\",\"MIPS R4600\",\"MIPS R10000\",\"AMD C-Series Processor\",\"AMD E-Series Processor\",\"AMD A-Series Processor\",\"AMD G-Series Processor\",\"AMD Z-Series Processor\",\"AMD R-Series Processor\",\"AMD Opteron(TM) 4300 Series Processor\",\"AMD Opteron(TM) 6300 Series Processor\",\"AMD Opteron(TM) 3300 Series Processor\",\"AMD FirePro(TM) Series Processor\",\"SPARC Family\",\"SuperSPARC\",\"microSPARC II\",\"microSPARC IIep\",\"UltraSPARC\",\"UltraSPARC II\",\"UltraSPARC IIi\",\"UltraSPARC III\",\"UltraSPARC IIIi\",\"68040\",\"68xxx Family\",\"68000\",\"68010\",\"68020\",\"68030\",\"AMD Athlon(TM) X4 Quad-Core Processor Family\",\"AMD Opteron(TM) X1000 Series Processor\",\"AMD Opteron(TM) X2000 Series APU\",\"AMD Opteron(TM) A-Series Processor\",\"AMD Opteron(TM) X3000 Series APU\",\"AMD Zen Processor Family\",\"Hobbit Family\",\"Crusoe(TM) TM5000 Family\",\"Crusoe(TM) TM3000 Family\",\"Efficeon(TM) TM8000 Family\",\"Weitek\",\"Itanium(TM) Processor\",\"AMD Athlon(TM) 64 Processor Family\",\"AMD Opteron(TM) Processor Family\",\"AMD Sempron(TM) Processor Family\",\"AMD Turion(TM) 64 Mobile Technology\",\"Dual-Core AMD Opteron(TM) Processor Family\",\"AMD Athlon(TM) 64 X2 Dual-Core Processor Family\",\"AMD Turion(TM) 64 X2 Mobile Technology\",\"Quad-Core AMD Opteron(TM) Processor Family\",\"Third-Generation AMD Opteron(TM) Processor Family\",\"AMD Phenom(TM) FX Quad-Core Processor Family\",\"AMD Phenom(TM) X4 Quad-Core Processor Family\",\"AMD Phenom(TM) X2 Dual-Core Processor Family\",\"AMD Athlon(TM) X2 Dual-Core Processor Family\",\"PA-RISC Family\",\"PA-RISC 8500\",\"PA-RISC 8000\",\"PA-RISC 7300LC\",\"PA-RISC 7200\",\"PA-RISC 7100LC\",\"PA-RISC 7100\",\"V30 Family\",\"Quad-Core Intel(R) Xeon(R) processor 3200 Series\",\"Dual-Core Intel(R) Xeon(R) processor 3000 Series\",\"Quad-Core Intel(R) Xeon(R) processor 5300 Series\",\"Dual-Core Intel(R) Xeon(R) processor 5100 Series\",\"Dual-Core Intel(R) Xeon(R) processor 5000 Series\",\"Dual-Core Intel(R) Xeon(R) processor LV\",\"Dual-Core Intel(R) Xeon(R) processor ULV\",\"Dual-Core Intel(R) Xeon(R) processor 7100 Series\",\"Quad-Core Intel(R) Xeon(R) processor 5400 Series\",\"Quad-Core Intel(R) Xeon(R) processor\",\"Dual-Core Intel(R) Xeon(R) processor 5200 Series\",\"Dual-Core Intel(R) Xeon(R) processor 7200 Series\",\"Quad-Core Intel(R) Xeon(R) processor 7300 Series\",\"Quad-Core Intel(R) Xeon(R) processor 7400 Series\",\"Multi-Core Intel(R) Xeon(R) processor 7400 Series\",\"Pentium(R) III Xeon(TM)\",\"Pentium(R) III Processor with Intel(R) SpeedStep(TM) Technology\",\"Pentium(R) 4\",\"Intel(R) Xeon(TM)\",\"AS400 Family\",\"Intel(R) Xeon(TM) processor MP\",\"AMD Athlon(TM) XP Family\",\"AMD Athlon(TM) MP Family\",\"Intel(R) Itanium(R) 2\",\"Intel(R) Pentium(R) M processor\",\"Intel(R) Celeron(R) D processor\",\"Intel(R) Pentium(R) D processor\",\"Intel(R) Pentium(R) Processor Extreme Edition\",\"Intel(R) Core(TM) Solo Processor\",\"K7\",\"Intel(R) Core(TM)2 Duo Processor\",\"Intel(R) Core(TM)2 Solo processor\",\"Intel(R) Core(TM)2 Extreme processor\",\"Intel(R) Core(TM)2 Quad processor\",\"Intel(R) Core(TM)2 Extreme mobile processor\",\"Intel(R) Core(TM)2 Duo mobile processor\",\"Intel(R) Core(TM)2 Solo mobile processor\",\"Intel(R) Core(TM) i7 processor\",\"Dual-Core Intel(R) Celeron(R) Processor\",\"S/390 and zSeries Family\",\"ESA/390 G4\",\"ESA/390 G5\",\"ESA/390 G6\",\"z/Architectur base\",\"Intel(R) Core(TM) i5 processor\",\"Intel(R) Core(TM) i3 processor\",\"Intel(R) Core(TM) i9 processor\",\"VIA C7(TM)-M Processor Family\",\"VIA C7(TM)-D Processor Family\",\"VIA C7(TM) Processor Family\",\"VIA Eden(TM) Processor Family\",\"Multi-Core Intel(R) Xeon(R) processor\",\"Dual-Core Intel(R) Xeon(R) processor 3xxx Series\",\"Quad-Core Intel(R) Xeon(R) processor 3xxx Series\",\"VIA Nano(TM) Processor Family\",\"Dual-Core Intel(R) Xeon(R) processor 5xxx Series\",\"Quad-Core Intel(R) Xeon(R) processor 5xxx Series\",\"Dual-Core Intel(R) Xeon(R) processor 7xxx Series\",\"Quad-Core Intel(R) Xeon(R) processor 7xxx Series\",\"Multi-Core Intel(R) Xeon(R) processor 7xxx Series\",\"Multi-Core Intel(R) Xeon(R) processor 3400 Series\",\"AMD Opteron(TM) 3000 Series Processor\",\"AMD Sempron(TM) II Processor Family\",\"Embedded AMD Opteron(TM) Quad-Core Processor Family\",\"AMD Phenom(TM) Triple-Core Processor Family\",\"AMD Turion(TM) Ultra Dual-Core Mobile Processor Family\",\"AMD Turion(TM) Dual-Core Mobile Processor Family\",\"AMD Athlon(TM) Dual-Core Processor Family\",\"AMD Sempron(TM) SI Processor Family\",\"AMD Phenom(TM) II Processor Family\",\"AMD Athlon(TM) II Processor Family\",\"Six-Core AMD Opteron(TM) Processor Family\",\"AMD Sempron(TM) M Processor Family\",\"i860\",\"i960\",\"Reserved (SMBIOS Extension)\",\"Reserved (Un-initialized Flash Content - Lo)\",\"ARMv7\",\"ARMv8\",\"ARMv9\",\"Reserved for future use by ARM\",\"SH-3\",\"SH-4\",\"ARM\",\"StrongARM\",\"6x86\",\"MediaGX\",\"MII\",\"WinChip\",\"DSP\",\"Video Processor\",\"RISC-V RV32\",\"RISC-V RV64\",\"RISC-V RV128\",\"LoongArch\",\"Loongson(TM) 1 Processor Family\",\"Loongson(TM) 2 Processor Family\",\"Loongson(TM) 3 Processor Family\",\"Loongson(TM) 2K Processor Family\",\"Loongson(TM) 3A Processor Family\",\"Loongson(TM) 3B Processor Family\",\"Loongson(TM) 3C Processor Family\",\"Loongson(TM) 3D Processor Family\",\"Loongson(TM) 3E Processor Family\",\"Dual-Core Loongson(TM) 2K Processor 2xxx Series\",\"Quad-Core Loongson(TM) 3A Processor 5xxx Series\",\"Multi-Core Loongson(TM) 3A Processor 5xxx Series\",\"Quad-Core Loongson(TM) 3B Processor 5xxx Series\",\"Multi-Core Loongson(TM) 3B Processor 5xxx Series\",\"Multi-Core Loongson(TM) 3C Processor 5xxx Series\",\"Multi-Core Loongson(TM) 3D Processor 5xxx Series\",\"Reserved (For Future Special Purpose Assignment)\",\"Reserved (Un-initialized Flash Content - Hi)\"]' ModelCorrespondence='[\"CIM_Processor.Family\"]'"
	 * @generated
	 */
	Integer getProcessorFamily();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getProcessorFamily <em>Processor Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Family</em>' attribute.
	 * @see #getProcessorFamily()
	 * @generated
	 */
	void setProcessorFamily(Integer value);

	/**
	 * Returns the value of the '<em><b>Processor Max Clock Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_Processor.MaxClockSpeed for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processor Max Clock Speed</em>' attribute.
	 * @see #setProcessorMaxClockSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_ProcessorMaxClockSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_Processor.MaxClockSpeed\"]' PUnit='hertz * 10^6'"
	 * @generated
	 */
	Long getProcessorMaxClockSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getProcessorMaxClockSpeed <em>Processor Max Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Max Clock Speed</em>' attribute.
	 * @see #getProcessorMaxClockSpeed()
	 * @generated
	 */
	void setProcessorMaxClockSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Memory Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_Memory.BlockSize for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Block Size</em>' attribute.
	 * @see #setMemoryBlockSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_MemoryBlockSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_Memory.BlockSize\"]'"
	 * @generated
	 */
	Long getMemoryBlockSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getMemoryBlockSize <em>Memory Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Block Size</em>' attribute.
	 * @see #getMemoryBlockSize()
	 * @generated
	 */
	void setMemoryBlockSize(Long value);

	/**
	 * Returns the value of the '<em><b>Memory Number Of Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_Memory.NumberOfBlocks for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Number Of Blocks</em>' attribute.
	 * @see #setMemoryNumberOfBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_MemoryNumberOfBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_Memory.NumberOfBlocks\"]'"
	 * @generated
	 */
	Long getMemoryNumberOfBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getMemoryNumberOfBlocks <em>Memory Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Number Of Blocks</em>' attribute.
	 * @see #getMemoryNumberOfBlocks()
	 * @generated
	 */
	void setMemoryNumberOfBlocks(Long value);

	/**
	 * Returns the value of the '<em><b>Memory Consumable Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_Memory.ConsumableBlocks for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Consumable Blocks</em>' attribute.
	 * @see #setMemoryConsumableBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_MemoryConsumableBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_Memory.ConsumableBlocks\"]'"
	 * @generated
	 */
	Long getMemoryConsumableBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getMemoryConsumableBlocks <em>Memory Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Consumable Blocks</em>' attribute.
	 * @see #getMemoryConsumableBlocks()
	 * @generated
	 */
	void setMemoryConsumableBlocks(Long value);

	/**
	 * Returns the value of the '<em><b>Current BIOS Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The major number component of the current BIOS version information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current BIOS Major Version</em>' attribute.
	 * @see #setCurrentBIOSMajorVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_CurrentBIOSMajorVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.MajorVersion\"]'"
	 * @generated
	 */
	Integer getCurrentBIOSMajorVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentBIOSMajorVersion <em>Current BIOS Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current BIOS Major Version</em>' attribute.
	 * @see #getCurrentBIOSMajorVersion()
	 * @generated
	 */
	void setCurrentBIOSMajorVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Current BIOS Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minor number component of the current BIOS version information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current BIOS Minor Version</em>' attribute.
	 * @see #setCurrentBIOSMinorVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_CurrentBIOSMinorVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.MinorVersion\"]'"
	 * @generated
	 */
	Integer getCurrentBIOSMinorVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentBIOSMinorVersion <em>Current BIOS Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current BIOS Minor Version</em>' attribute.
	 * @see #getCurrentBIOSMinorVersion()
	 * @generated
	 */
	void setCurrentBIOSMinorVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Current BIOS Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The revision number component of the current BIOS version information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current BIOS Revision Number</em>' attribute.
	 * @see #setCurrentBIOSRevisionNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_CurrentBIOSRevisionNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.RevisionNumber\"]'"
	 * @generated
	 */
	Integer getCurrentBIOSRevisionNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentBIOSRevisionNumber <em>Current BIOS Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current BIOS Revision Number</em>' attribute.
	 * @see #getCurrentBIOSRevisionNumber()
	 * @generated
	 */
	void setCurrentBIOSRevisionNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Current BIOS Build Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The build number component of the current BIOS version information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current BIOS Build Number</em>' attribute.
	 * @see #setCurrentBIOSBuildNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_CurrentBIOSBuildNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.BuildNumber\"]'"
	 * @generated
	 */
	Integer getCurrentBIOSBuildNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentBIOSBuildNumber <em>Current BIOS Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current BIOS Build Number</em>' attribute.
	 * @see #getCurrentBIOSBuildNumber()
	 * @generated
	 */
	void setCurrentBIOSBuildNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Current Management Firmware Major Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The major number component of the version information for the current management firmware on this physical computer system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Management Firmware Major Version</em>' attribute.
	 * @see #setCurrentManagementFirmwareMajorVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_CurrentManagementFirmwareMajorVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.MajorVersion\"]'"
	 * @generated
	 */
	Integer getCurrentManagementFirmwareMajorVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentManagementFirmwareMajorVersion <em>Current Management Firmware Major Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Management Firmware Major Version</em>' attribute.
	 * @see #getCurrentManagementFirmwareMajorVersion()
	 * @generated
	 */
	void setCurrentManagementFirmwareMajorVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Current Management Firmware Minor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minor number component of the version information for the current management firmware on this physical computer system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Management Firmware Minor Version</em>' attribute.
	 * @see #setCurrentManagementFirmwareMinorVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_CurrentManagementFirmwareMinorVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.MinorVersion\"]'"
	 * @generated
	 */
	Integer getCurrentManagementFirmwareMinorVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentManagementFirmwareMinorVersion <em>Current Management Firmware Minor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Management Firmware Minor Version</em>' attribute.
	 * @see #getCurrentManagementFirmwareMinorVersion()
	 * @generated
	 */
	void setCurrentManagementFirmwareMinorVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Current Management Firmware Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The revision number component of the version information for the current management firmware on this physical computer system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Management Firmware Revision Number</em>' attribute.
	 * @see #setCurrentManagementFirmwareRevisionNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_CurrentManagementFirmwareRevisionNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.RevisionNumber\"]'"
	 * @generated
	 */
	Integer getCurrentManagementFirmwareRevisionNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentManagementFirmwareRevisionNumber <em>Current Management Firmware Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Management Firmware Revision Number</em>' attribute.
	 * @see #getCurrentManagementFirmwareRevisionNumber()
	 * @generated
	 */
	void setCurrentManagementFirmwareRevisionNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Current Management Firmware Build Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The build number component of the version information for the current management firmware on this physical computer system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Management Firmware Build Number</em>' attribute.
	 * @see #setCurrentManagementFirmwareBuildNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_CurrentManagementFirmwareBuildNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SoftwareIdentity.BuildNumber\"]'"
	 * @generated
	 */
	Integer getCurrentManagementFirmwareBuildNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentManagementFirmwareBuildNumber <em>Current Management Firmware Build Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Management Firmware Build Number</em>' attribute.
	 * @see #getCurrentManagementFirmwareBuildNumber()
	 * @generated
	 */
	void setCurrentManagementFirmwareBuildNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Current Management Firmware Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The user-friendly name for the current management firmware on this physical computer system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Management Firmware Element Name</em>' attribute.
	 * @see #setCurrentManagementFirmwareElementName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_CurrentManagementFirmwareElementName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SoftwareIdentity.ElementName\"]'"
	 * @generated
	 */
	String getCurrentManagementFirmwareElementName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentManagementFirmwareElementName <em>Current Management Firmware Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Management Firmware Element Name</em>' attribute.
	 * @see #getCurrentManagementFirmwareElementName()
	 * @generated
	 */
	void setCurrentManagementFirmwareElementName(String value);

	/**
	 * Returns the value of the '<em><b>Current Management Firmware Version String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version string for the current management firmware on this physical computer system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Management Firmware Version String</em>' attribute.
	 * @see #setCurrentManagementFirmwareVersionString(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_CurrentManagementFirmwareVersionString()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SoftwareIdentity.VersionString\"]'"
	 * @generated
	 */
	String getCurrentManagementFirmwareVersionString();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentManagementFirmwareVersionString <em>Current Management Firmware Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Management Firmware Version String</em>' attribute.
	 * @see #getCurrentManagementFirmwareVersionString()
	 * @generated
	 */
	void setCurrentManagementFirmwareVersionString(String value);

	/**
	 * Returns the value of the '<em><b>OS Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type information of the current or last running operating system on this physical computer system. See CIM_OperatingSystem.OSType for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OS Type</em>' attribute.
	 * @see #setOSType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_OSType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82\",\"83\",\"84\",\"85\",\"86\",\"87\",\"88\",\"89\",\"90\",\"91\",\"92\",\"93\",\"94\",\"95\",\"96\",\"97\",\"98\",\"99\",\"100\",\"101\",\"102\",\"103\",\"104\",\"105\",\"106\",\"107\",\"108\",\"109\",\"110\",\"111\",\"113\",\"114\",\"115\",\"116\",\"117\",\"118\",\"119\",\"120\",\"121\",\"122\",\"123\",\"124\"]' Values='[\"Unknown\",\"Other\",\"MACOS\",\"ATTUNIX\",\"DGUX\",\"DECNT\",\"Tru64 UNIX\",\"OpenVMS\",\"HPUX\",\"AIX\",\"MVS\",\"OS400\",\"OS/2\",\"JavaVM\",\"MSDOS\",\"WIN3x\",\"WIN95\",\"WIN98\",\"WINNT\",\"WINCE\",\"NCR3000\",\"NetWare\",\"OSF\",\"DC/OS\",\"Reliant UNIX\",\"SCO UnixWare\",\"SCO OpenServer\",\"Sequent\",\"IRIX\",\"Solaris\",\"SunOS\",\"U6000\",\"ASERIES\",\"HP NonStop OS\",\"HP NonStop OSS\",\"BS2000\",\"LINUX\",\"Lynx\",\"XENIX\",\"VM\",\"Interactive UNIX\",\"BSDUNIX\",\"FreeBSD\",\"NetBSD\",\"GNU Hurd\",\"OS9\",\"MACH Kernel\",\"Inferno\",\"QNX\",\"EPOC\",\"IxWorks\",\"VxWorks\",\"MiNT\",\"BeOS\",\"HP MPE\",\"NextStep\",\"PalmPilot\",\"Rhapsody\",\"Windows 2000\",\"Dedicated\",\"OS/390\",\"VSE\",\"TPF\",\"Windows (R) Me\",\"Caldera Open UNIX\",\"OpenBSD\",\"Not Applicable\",\"Windows XP\",\"z/OS\",\"Microsoft Windows Server 2003\",\"Microsoft Windows Server 2003 64-Bit\",\"Windows XP 64-Bit\",\"Windows XP Embedded\",\"Windows Vista\",\"Windows Vista 64-Bit\",\"Windows Embedded for Point of Service\",\"Microsoft Windows Server 2008\",\"Microsoft Windows Server 2008 64-Bit\",\"FreeBSD 64-Bit\",\"RedHat Enterprise Linux\",\"RedHat Enterprise Linux 64-Bit\",\"Solaris 64-Bit\",\"SUSE\",\"SUSE 64-Bit\",\"SLES\",\"SLES 64-Bit\",\"Novell OES\",\"Novell Linux Desktop\",\"Sun Java Desktop System\",\"Mandriva\",\"Mandriva 64-Bit\",\"TurboLinux\",\"TurboLinux 64-Bit\",\"Ubuntu\",\"Ubuntu 64-Bit\",\"Debian\",\"Debian 64-Bit\",\"Linux 2.4.x\",\"Linux 2.4.x 64-Bit\",\"Linux 2.6.x\",\"Linux 2.6.x 64-Bit\",\"Linux 64-Bit\",\"Other 64-Bit\",\"Microsoft Windows Server 2008 R2\",\"VMware ESXi\",\"Microsoft Windows 7\",\"CentOS 32-bit\",\"CentOS 64-bit\",\"Oracle Linux 32-bit\",\"Oracle Linux 64-bit\",\"eComStation 32-bitx\",\"Microsoft Windows Server 2011\",\"Microsoft Windows Server 2012\",\"Microsoft Windows 8\",\"Microsoft Windows 8 64-bit\",\"Microsoft Windows Server 2012 R2\",\"Microsoft Windows Server 2016\",\"Microsoft Windows 8.1\",\"Microsoft Windows 8.1 64-bit\",\"Microsoft Windows 10\",\"Microsoft Windows 10 64-bit\",\"Microsoft Windows Server 2019\",\"Microsoft Windows 11 64-bit\",\"Microsoft Windows Server 2022\"]' ModelCorrespondence='[\"CIM_OperatingSystem.OSType\"]'"
	 * @generated
	 */
	Integer getOSType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getOSType <em>OS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS Type</em>' attribute.
	 * @see #getOSType()
	 * @generated
	 */
	void setOSType(Integer value);

	/**
	 * Returns the value of the '<em><b>OS Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version information of the current or last running operating system on this physical computer system. See CIM_OperatingSystem.Version for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OS Version</em>' attribute.
	 * @see #setOSVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_OSVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_OperatingSystem.Version\"]'"
	 * @generated
	 */
	String getOSVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getOSVersion <em>OS Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS Version</em>' attribute.
	 * @see #getOSVersion()
	 * @generated
	 */
	void setOSVersion(String value);

	/**
	 * Returns the value of the '<em><b>OS Enabled State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnabledState of the current or last running operating system on this physcial computer system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OS Enabled State</em>' attribute.
	 * @see #setOSEnabledState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_OSEnabledState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Enabled\",\"Disabled\",\"Shutting Down\",\"Not Applicable\",\"Enabled but Offline\",\"In Test\",\"Deferred\",\"Quiesce\",\"Starting\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_OperatingSystem.EnabledState\"]'"
	 * @generated
	 */
	Integer getOSEnabledState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getOSEnabledState <em>OS Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OS Enabled State</em>' attribute.
	 * @see #getOSEnabledState()
	 * @generated
	 */
	void setOSEnabledState(Integer value);

	/**
	 * Returns the value of the '<em><b>Current BIOS Version String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BIOS version information in string format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current BIOS Version String</em>' attribute.
	 * @see #setCurrentBIOSVersionString(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_CurrentBIOSVersionString()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SoftwareIdentity.VersionString\"]'"
	 * @generated
	 */
	String getCurrentBIOSVersionString();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getCurrentBIOSVersionString <em>Current BIOS Version String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current BIOS Version String</em>' attribute.
	 * @see #getCurrentBIOSVersionString()
	 * @generated
	 */
	void setCurrentBIOSVersionString(String value);

	/**
	 * Returns the value of the '<em><b>Dedicated</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_ComputerSystem.Dedicated for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dedicated</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_Dedicated()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"..\",\"32568..65535\"]' Values='[\"Not Dedicated\",\"Unknown\",\"Other\",\"Storage\",\"Router\",\"Switch\",\"Layer 3 Switch\",\"Central Office Switch\",\"Hub\",\"Access Server\",\"Firewall\",\"Print\",\"I/O\",\"Web Caching\",\"Management\",\"Block Server\",\"File Server\",\"Mobile User Device\",\"Repeater\",\"Bridge/Extender\",\"Gateway\",\"Storage Virtualizer\",\"Media Library\",\"ExtenderNode\",\"NAS Head\",\"Self-contained NAS\",\"UPS\",\"IP Phone\",\"Management Controller\",\"Chassis Manager\",\"Host-based RAID controller\",\"Storage Device Enclosure\",\"Desktop\",\"Laptop\",\"Virtual Tape Library\",\"Virtual Library System\",\"Network PC/Thin Client\",\"FC Switch\",\"Ethernet Switch\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ComputerSystem.Dedicated\",\"CIM_PhysicalComputerSystemView.OtherDedicatedDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getDedicated();

	/**
	 * Returns the value of the '<em><b>Identifying Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_System.IdentifyingDescriptions for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifying Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_IdentifyingDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ComputerSystem.IdentifyingDescriptions\",\"CIM_PhysicalComputerSystemView.OtherIdentifyingInfo\"]'"
	 * @generated
	 */
	EList<String> getIdentifyingDescriptions();

	/**
	 * Returns the value of the '<em><b>Other Dedicated Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_ComputerSystem.OtherDedicatedDescriptions for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Dedicated Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_OtherDedicatedDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ComputerSystem.OtherDedicatedDescriptions\",\"CIM_PhysicalComputerSystemView.Dedicated\"]'"
	 * @generated
	 */
	EList<String> getOtherDedicatedDescriptions();

	/**
	 * Returns the value of the '<em><b>Other Identifying Info</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_System.OtherIdentifyingInfo for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Identifying Info</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_OtherIdentifyingInfo()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MaxLen='256' ModelCorrespondence='[\"CIM_ComputerSystem.OtherIdentifyingInfo\",\"CIM_PhysicalComputerSystemView.IdentifyingDescriptions\"]'"
	 * @generated
	 */
	EList<String> getOtherIdentifyingInfo();

	/**
	 * Returns the value of the '<em><b>Processor Current Clock Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_Processor.CurrentClockSpeed for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Processor Current Clock Speed</em>' attribute.
	 * @see #setProcessorCurrentClockSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_ProcessorCurrentClockSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_Processor.CurrentClockSpeed\"]' PUnit='hertz * 10^6'"
	 * @generated
	 */
	Long getProcessorCurrentClockSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalComputerSystemView#getProcessorCurrentClockSpeed <em>Processor Current Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Current Clock Speed</em>' attribute.
	 * @see #getProcessorCurrentClockSpeed()
	 * @generated
	 */
	void setProcessorCurrentClockSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Context</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_Sensor.SensorContext for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Context</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorContext()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.SensorContext\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorHealthState\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentState\",\"CIM_PhysicalComputerSystemView.NumericSensorPrimaryStatus\",\"CIM_PhysicalComputerSystemView.NumericSensorBaseUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorUnitModifier\",\"CIM_PhysicalComputerSystemView.NumericSensorRateUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentReading\",\"CIM_PhysicalComputerSystemView.NumericSensorSensorType\",\"CIM_PhysicalComputerSystemView.NumericSensorOtherSensorTypeDescription\",\"CIM_PhysicalComputerSystemView.NumericSensorUpperThresholdNonCritical\",\"CIM_PhysicalComputerSystemView.NumericSensorUpperThresholdCritical\",\"CIM_PhysicalComputerSystemView.NumericSensorUpperThresholdFatal\"]'"
	 * @generated
	 */
	EList<String> getNumericSensorContext();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Lower Threshold Critical</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_NumericSensor.LowerThresholdCritical description for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Lower Threshold Critical</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorLowerThresholdCritical()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.LowerThresholdCritical\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorHealthState\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentState\",\"CIM_PhysicalComputerSystemView.NumericSensorPrimaryStatus\",\"CIM_PhysicalComputerSystemView.NumericSensorBaseUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorUnitModifier\",\"CIM_PhysicalComputerSystemView.NumericSensorRateUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentReading\",\"CIM_PhysicalComputerSystemView.NumericSensorSensorType\",\"CIM_PhysicalComputerSystemView.NumericSensorOtherSensorTypeDescription\",\"CIM_PhysicalComputerSystemView.NumericSensorUpperThresholdNonCritical\",\"CIM_PhysicalComputerSystemView.NumericSensorUpperThresholdCritical\",\"CIM_PhysicalComputerSystemView.NumericSensorUpperThresholdFatal\"]'"
	 * @generated
	 */
	EList<Integer> getNumericSensorLowerThresholdCritical();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Lower Threshold Fatal</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_NumericSensor.LowerThresholdFatal description for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Lower Threshold Fatal</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorLowerThresholdFatal()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.LowerThresholdFatal\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorHealthState\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentState\",\"CIM_PhysicalComputerSystemView.NumericSensorPrimaryStatus\",\"CIM_PhysicalComputerSystemView.NumericSensorBaseUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorUnitModifier\",\"CIM_PhysicalComputerSystemView.NumericSensorRateUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentReading\",\"CIM_PhysicalComputerSystemView.NumericSensorSensorType\",\"CIM_PhysicalComputerSystemView.NumericSensorOtherSensorTypeDescription\",\"CIM_PhysicalComputerSystemView.NumericSensorUpperThresholdNonCritical\",\"CIM_PhysicalComputerSystemView.NumericSensorUpperThresholdCritical\",\"CIM_PhysicalComputerSystemView.NumericSensorUpperThresholdFatal\"]'"
	 * @generated
	 */
	EList<Integer> getNumericSensorLowerThresholdFatal();

	/**
	 * Returns the value of the '<em><b>Numeric Sensor Lower Threshold Non Critical</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * See CIM_NumericSensor.LowerThresholdNonCritical for details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Numeric Sensor Lower Threshold Non Critical</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalComputerSystemView_NumericSensorLowerThresholdNonCritical()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_NumericSensor.LowerThresholdNonCritical\",\"CIM_PhysicalComputerSystemView.NumericSensorElementName\",\"CIM_PhysicalComputerSystemView.NumericSensorEnabledState\",\"CIM_PhysicalComputerSystemView.NumericSensorHealthState\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentState\",\"CIM_PhysicalComputerSystemView.NumericSensorPrimaryStatus\",\"CIM_PhysicalComputerSystemView.NumericSensorBaseUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorUnitModifier\",\"CIM_PhysicalComputerSystemView.NumericSensorRateUnits\",\"CIM_PhysicalComputerSystemView.NumericSensorCurrentReading\",\"CIM_PhysicalComputerSystemView.NumericSensorSensorType\",\"CIM_PhysicalComputerSystemView.NumericSensorOtherSensorTypeDescription\",\"CIM_PhysicalComputerSystemView.NumericSensorUpperThresholdNonCritical\",\"CIM_PhysicalComputerSystemView.NumericSensorUpperThresholdCritical\",\"CIM_PhysicalComputerSystemView.NumericSensorUpperThresholdFatal\"]'"
	 * @generated
	 */
	EList<Integer> getNumericSensorLowerThresholdNonCritical();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An extrinsic method for changing the state of this physical computer system. Requests that the state of the element be changed to the value specified in the RequestedState parameter. When the requested state change takes place, the EnabledState and RequestedState will be the same. Invoking the RequestStateChange method multiple times could result in earlier requests being overwritten or lost.
	 * A return code of 0 shall indicate the state change was successfully initiated.
	 * A return code of 1 shall indicate that the method is not supported. A return code of 2 shall indicate that the method failed.
	 * A return code of 4096 shall indicate the state change was successfully initiated, a ConcreteJob has been created, and its reference returned in the output parameter Job.
	 * @param RequestedState See CIM_ComputerSystem.RequestedStateChange.RequestedState for details.
	 * @param Job May contain a reference to the ConcreteJob created to track the state transition initiated by the method invocation.
	 * @param TimeoutPeriod See CIM_ComputerSystem.TimeoutPeriod for details.
	 * <!-- end-model-doc -->
	 * @model RequestedStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"32768..65535\"]' Values='[\"Enabled\",\"Disabled\",\"Shut Down\",\"Offline\",\"Test\",\"Defer\",\"Quiesce\",\"Reboot\",\"Reset\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_ComputerSystem.RequestStateChange(RequestedState)\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TimeoutPeriodAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_ComputerSystem.RequestStateChange(TimeoutPeriod)\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"4096\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Job Started\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_ComputerSystem.RequestStateChange\"]'"
	 * @generated
	 */
	Long RequestStateChange(Integer RequestedState, CIM_ConcreteJob Job, String TimeoutPeriod);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An extrinsic method for clearing a log on this physical computer system.
	 * Requests that the Log be cleared of all entries.
	 * The return value shall be 0 if the request was successfully executed, 1 if the request is not supported, and 2 if an error occurred. A return code of 4096 shall indicate the request to clear log was successfully initiated, a ConcreteJob has been created, and its reference returned in the output parameter Job.
	 * @param LogInstanceID Idenfier for the log that is requested to be cleared.
	 * <!-- end-model-doc -->
	 * @model LogInstanceIDAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_RecordLog.InstanceID\",\"CIM_PhysicalComputerSystemView.LogInstanceID\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long ClearLog(String LogInstanceID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An extrinsic method for installing software on this physical computer system. If 0 is returned, the function completed successfully and no ConcreteJob instance was required. The return value shall be 1 if the request is not supported, and 2 if an error occurred. If 4096 is returned, a ConcreteJob will be started to to perform the install. The Job's reference will be returned in the output parameter Job.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param Classifications See CIM_SoftwareIdentity.Classifications for details.
	 * @param URI See CIM_SoftwareInstallationService.InstallFromURI.URI for details.
	 * @param InstallOptions See CIM_SoftwareInstallationService.InstallFromURI.InstallOptions for details.
	 * @param InstallOptionsValues See CIM_SoftwareInstallationService.InstallFromURI.InstallOptionsValues for details.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" ClassificationsUnique="false" ClassificationsMany="true"
	 *        ClassificationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"10\",\"11\",\"13\",\"14\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Firmware\",\"BIOS/FCode\",\"Software Bundle\",\"Management Firmware\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SoftwareIdentity.Classifications\"]'" URIAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_SoftwareInstallationService.InstallFromURI\"]'" InstallOptionsUnique="false" InstallOptionsMany="true"
	 *        InstallOptionsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"..\",\"32768..65535\"]' Values='[\"Defer target/system reset\",\"Force installation\",\"Install\",\"Update\",\"Repair\",\"Reboot\",\"Password\",\"Uninstall\",\"Log\",\"SilentMode\",\"AdministrativeMode\",\"ScheduleInstallAt\",\"DMTF Reserved\",\"Vendor Specific\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SoftwareInstallationService.InstallFromURI(InstallOptions)\",\"CIM_PhysicalComputerSystemView.InstallSoftwareFromURI(InstallOptionsValues)\"]'" InstallOptionsValuesUnique="false" InstallOptionsValuesMany="true"
	 *        InstallOptionsValuesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_SoftwareInstallationService.InstallFromURI(InstallOptionsValues)\",\"CIM_PhysicalComputerSystemView.InstallSoftwareFromURI(InstallOptions)\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"4096\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Job Started\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_SoftwareInstallationService.InstallFromURI\"]'"
	 * @generated
	 */
	Long InstallSoftwareFromURI(CIM_ConcreteJob Job, EList<Integer> Classifications, String URI, EList<Integer> InstallOptions, EList<String> InstallOptionsValues);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is used to change the order of boot sources for the persistent boot configuration specified by the property CIM_PhysicalComputerSystemView.PersistentBootConfigOrder.
	 * @param StructuredBootString An ordered array of strings representing the order of boot sources.
	 * @param Job Reference to the job spawned if the operation continues after the method returns. (May be null if the task is completed).
	 * <!-- end-model-doc -->
	 * @model StructuredBootStringUnique="false" StructuredBootStringMany="true"
	 *        StructuredBootStringAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_PhysicalComputerSystemView.StructuredBootString\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"4096\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Job Started\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long ModifyPersistentBootConfigOrder(EList<String> StructuredBootString, CIM_ConcreteJob Job);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is used to set the one time boot source for the next boot on this computer system.
	 * @param StructuredBootString A string representing the boot source for next boot.
	 * @param Job Reference to the job spawned if the operation continues after the method returns. (May be null if the task is completed).
	 * <!-- end-model-doc -->
	 * @model StructuredBootStringAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_PhysicalComputerSystemView.StructuredBootString\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"4096\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Job Started\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long SetOneTimeBootSource(String StructuredBootString, CIM_ConcreteJob Job);

} // CIM_PhysicalComputerSystemView

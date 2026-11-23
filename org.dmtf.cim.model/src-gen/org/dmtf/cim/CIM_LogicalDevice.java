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
 * A representation of the model object '<em><b>CIM Logical Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An abstraction or emulation of a hardware entity, that might or might not be Realized in physical hardware. Any characteristics of a LogicalDevice that are used to manage its operation or configuration are contained in, or associated with, the LogicalDevice object. Examples of the operational properties of a Printer would be paper sizes supported or detected errors. Examples of the configuration properties of a Sensor Device would be threshold settings. Various configurations could exist for a LogicalDevice. These configurations could be contained in Setting objects and associated with the LogicalDevice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getPowerManagementSupported <em>Power Management Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getPowerManagementCapabilities <em>Power Management Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getStatusInfo <em>Status Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getLastErrorCode <em>Last Error Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getErrorDescription <em>Error Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getErrorCleared <em>Error Cleared</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getOtherIdentifyingInfo <em>Other Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getPowerOnHours <em>Power On Hours</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getTotalPowerOnHours <em>Total Power On Hours</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getIdentifyingDescriptions <em>Identifying Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getAdditionalAvailability <em>Additional Availability</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getMaxQuiesceTime <em>Max Quiesce Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDevice#getLocationIndicator <em>Location Indicator</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.45.0' UMLPackagePath='CIM::Core::Device' override.AllocationState='string' override.AllocationState.Description='Allocation state of the logical device.' override.AllocationState.EmbeddedInstance='CIM_ResourceAllocationSettingData' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalDevice extends CIM_AllocatedLogicalElement {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CreationClassName of the scoping system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_System.CreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDevice#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #getSystemCreationClassName()
	 * @generated
	 */
	void setSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The System Name of the scoping system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_System.Name'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDevice#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDevice#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An address or other identifying information used to uniquely name the LogicalDevice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device ID</em>' attribute.
	 * @see #setDeviceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_DeviceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='64'"
	 * @generated
	 */
	String getDeviceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDevice#getDeviceID <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device ID</em>' attribute.
	 * @see #getDeviceID()
	 * @generated
	 */
	void setDeviceID(String value);

	/**
	 * Returns the value of the '<em><b>Power Management Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated. Instead, the existence of an associated PowerManagementCapabilities class (associated using the ElementCapabilities relationship) indicates that power management is supported. Deprecated description: Boolean that indicates that the Device can use power management.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Management Supported</em>' attribute.
	 * @see #setPowerManagementSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_PowerManagementSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_PowerManagementCapabilities.PowerStatesSupported\"]'"
	 * @generated
	 */
	Boolean getPowerManagementSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDevice#getPowerManagementSupported <em>Power Management Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Management Supported</em>' attribute.
	 * @see #getPowerManagementSupported()
	 * @generated
	 */
	void setPowerManagementSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Power Management Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated. Instead, use the PowerCapabilites property in an associated PowerManagementCapabilities class. Deprecated description: An enumerated array describing the power management capabilities of the Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Management Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_PowerManagementCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_PowerManagementCapabilities.PowerCapabilities\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"Not Supported\",\"Disabled\",\"Enabled\",\"Power Saving Modes Entered Automatically\",\"Power State Settable\",\"Power Cycling Supported\",\"Timed Power On Supported\"]'"
	 * @generated
	 */
	EList<Integer> getPowerManagementCapabilities();

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated. 
	 * Deprecated description: The primary availability and status of the Device. (Additional status information can be specified using the Additional Availability array property.) For example, the Availability property indicates that the Device is running and has full power (value=3), or is in a warning (4), test (5), degraded (10) or power save state (values 13-15 and 17). The Power Save states are defined as follows: Value 13 ("Power Save - Unknown") indicates that the Device is known to be in a power save mode, but its exact status in this mode is unknown; value 14 ("Power Save - Low Power Mode") indicates that the Device is in a power save state but still functioning, and might exhibit degraded performance; value 15 ("Power Save - Standby") indicates that the Device is not functioning but could be brought to full power 'quickly'; and value 17 ("Power Save - Warning") indicates that the Device is in a warning state, but is also in a power save mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability</em>' attribute.
	 * @see #setAvailability(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_Availability()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_AssociatedPowerManagementService.PowerState\",\"CIM_ManagedSystemElement.OperationalStatus\",\"CIM_EnabledLogicalElement.EnabledState\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\"]' Values='[\"Other\",\"Unknown\",\"Running/Full Power\",\"Warning\",\"In Test\",\"Not Applicable\",\"Power Off\",\"Off Line\",\"Off Duty\",\"Degraded\",\"Not Installed\",\"Install Error\",\"Power Save - Unknown\",\"Power Save - Low Power Mode\",\"Power Save - Standby\",\"Power Cycle\",\"Power Save - Warning\",\"Paused\",\"Not Ready\",\"Not Configured\",\"Quiesced\"]' MappingStrings='[\"MIF.DMTF|Operational State|006.5\",\"MIB.IETF|HOST-RESOURCES-MIB.hrDeviceStatus\",\"MIF.DMTF|Host Device|001.5\"]' ModelCorrespondence='[\"CIM_LogicalDevice.AdditionalAvailability\"]'"
	 * @generated
	 */
	Integer getAvailability();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDevice#getAvailability <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' attribute.
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(Integer value);

	/**
	 * Returns the value of the '<em><b>Status Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated in lieu of a more clearly named property (EnabledState) that is inherited from ManagedSystemElement and that has additional enumerated values. 
	 * Deprecated description: The StatusInfo property indicates whether the Logical Device is in an enabled state (value=3), disabled state (value=4), some other state (value=1), or an unknown state (value=2). If this property does not apply to the LogicalDevice, the value 5 ("Not Applicable") should be used. If a Device is ("Enabled")(value=3), it has been powered up and is configured and operational. The Device might or might not be functionally active, depending on whether its Availability (or AdditionalAvailability) indicates that it is ("Running/Full Power")(value=3) or ("Off line") (value=8). In an enabled but offline mode, a Device might be performing out-of-band requests, such as running Diagnostics. If StatusInfo is ("Disabled") (value=4), a Device can only be "enabled" or powered off. In a personal computer environment, ("Disabled") means that the driver of the device is not available in the stack. In other environments, a Device can be disabled by removing its configuration file. A disabled device is physically present in a System and consuming resources, but it cannot be communicated with until a driver is loaded, a configuration file is loaded, or some other "enabling" activity has occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Info</em>' attribute.
	 * @see #setStatusInfo(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_StatusInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_EnabledLogicalElement.EnabledState\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"Unknown\",\"Enabled\",\"Disabled\",\"Not Applicable\"]' MappingStrings='[\"MIF.DMTF|Operational State|006.4\"]'"
	 * @generated
	 */
	Integer getStatusInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDevice#getStatusInfo <em>Status Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Info</em>' attribute.
	 * @see #getStatusInfo()
	 * @generated
	 */
	void setStatusInfo(Integer value);

	/**
	 * Returns the value of the '<em><b>Last Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: LastErrorCode captures the last error code reported by the LogicalDevice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Error Code</em>' attribute.
	 * @see #setLastErrorCode(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_LastErrorCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_DeviceErrorData.LastErrorCode\"]'"
	 * @generated
	 */
	Long getLastErrorCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDevice#getLastErrorCode <em>Last Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Error Code</em>' attribute.
	 * @see #getLastErrorCode()
	 * @generated
	 */
	void setLastErrorCode(Long value);

	/**
	 * Returns the value of the '<em><b>Error Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: ErrorDescription is a free-form string that supplies more information about the error recorded in LastErrorCode and information on any corrective actions that can be taken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Description</em>' attribute.
	 * @see #setErrorDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_ErrorDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_DeviceErrorData.ErrorDescription\"]'"
	 * @generated
	 */
	String getErrorDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDevice#getErrorDescription <em>Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Description</em>' attribute.
	 * @see #getErrorDescription()
	 * @generated
	 */
	void setErrorDescription(String value);

	/**
	 * Returns the value of the '<em><b>Error Cleared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: ErrorCleared is a Boolean property that indicates that the error reported in LastErrorCode is now cleared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Cleared</em>' attribute.
	 * @see #setErrorCleared(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_ErrorCleared()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_ManagedSystemElement.OperationalStatus\"]'"
	 * @generated
	 */
	Boolean getErrorCleared();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDevice#getErrorCleared <em>Error Cleared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Cleared</em>' attribute.
	 * @see #getErrorCleared()
	 * @generated
	 */
	void setErrorCleared(Boolean value);

	/**
	 * Returns the value of the '<em><b>Other Identifying Info</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OtherIdentifyingInfo captures data, in addition to DeviceID information, that could be used to identify a LogicalDevice. For example, you could use this property to hold the operating system's user-friendly name for the Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Identifying Info</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_OtherIdentifyingInfo()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MaxLen='256' ModelCorrespondence='[\"CIM_LogicalDevice.IdentifyingDescriptions\"]'"
	 * @generated
	 */
	EList<String> getOtherIdentifyingInfo();

	/**
	 * Returns the value of the '<em><b>Power On Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: The number of consecutive hours that this Device has been powered on since its last power cycle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power On Hours</em>' attribute.
	 * @see #setPowerOnHours(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_PowerOnHours()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_PoweredStatisticalData.PowerOnHours\"]' Units='Hours' Counter='true' PUnit='hour'"
	 * @generated
	 */
	Long getPowerOnHours();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDevice#getPowerOnHours <em>Power On Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power On Hours</em>' attribute.
	 * @see #getPowerOnHours()
	 * @generated
	 */
	void setPowerOnHours(Long value);

	/**
	 * Returns the value of the '<em><b>Total Power On Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. 
	 * Deprecated description: The total number of hours that this Device has been powered on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Power On Hours</em>' attribute.
	 * @see #setTotalPowerOnHours(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_TotalPowerOnHours()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_PoweredStatisticalData.TotalPowerOnHours\"]' Units='Hours' Counter='true' PUnit='hour'"
	 * @generated
	 */
	Long getTotalPowerOnHours();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDevice#getTotalPowerOnHours <em>Total Power On Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Power On Hours</em>' attribute.
	 * @see #getTotalPowerOnHours()
	 * @generated
	 */
	void setTotalPowerOnHours(Long value);

	/**
	 * Returns the value of the '<em><b>Identifying Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings providing explanations and details behind the entries in the OtherIdentifyingInfo array. Note that each entry of this array is related to the entry in OtherIdentifyingInfo that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifying Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_IdentifyingDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_LogicalDevice.OtherIdentifyingInfo\"]'"
	 * @generated
	 */
	EList<String> getIdentifyingDescriptions();

	/**
	 * Returns the value of the '<em><b>Additional Availability</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional availability and status of the Device in addition to that specified in the Availability property. The Availability property denotes the primary status and availability of the Device. In some cases, this property will not be sufficient to denote the complete status of the Device. In those cases, the AdditionalAvailability property can be used to provide further information. For example, the primary Availability of a device might be "Off line" (value=8) or in a low-power state (AdditionalAvailability value=14), or the Device could be running Diagnostics (AdditionalAvailability value=5, "In Test").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Availability</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_AdditionalAvailability()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\"]' Values='[\"Other\",\"Unknown\",\"Running/Full Power\",\"Warning\",\"In Test\",\"Not Applicable\",\"Power Off\",\"Off Line\",\"Off Duty\",\"Degraded\",\"Not Installed\",\"Install Error\",\"Power Save - Unknown\",\"Power Save - Low Power Mode\",\"Power Save - Standby\",\"Power Cycle\",\"Power Save - Warning\",\"Paused\",\"Not Ready\",\"Not Configured\",\"Quiesced\"]' ModelCorrespondence='[\"CIM_LogicalDevice.Availability\"]'"
	 * @generated
	 */
	EList<Integer> getAdditionalAvailability();

	/**
	 * Returns the value of the '<em><b>Max Quiesce Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated. When evaluating the use of Quiesce, it was determined that this single property is not adequate for describing when a device will automatically exit a quiescent state. In fact, the most likely scenario for a device to exit a quiescent state was determined to be based on the number of outstanding requests queued rather than on a maximum time. This decision will be re-evaluated and repositioned later. 
	 * Deprecated description: Maximum time, in milliseconds, that a Device can run in a "Quiesced" state. The state is defined in its Availability and AdditionalAvailability properties, where "Quiesced" is conveyed by the value 21. What occurs at the end of the time limit is device-specific. The Device can unquiesce, can be offline, or can take other actions. A value of 0 indicates that a Device can remain quiesced indefinitely.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Quiesce Time</em>' attribute.
	 * @see #setMaxQuiesceTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_MaxQuiesceTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Units='MilliSeconds' PUnit='second * 10^-3'"
	 * @generated
	 */
	Long getMaxQuiesceTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDevice#getMaxQuiesceTime <em>Max Quiesce Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Quiesce Time</em>' attribute.
	 * @see #getMaxQuiesceTime()
	 * @generated
	 */
	void setMaxQuiesceTime(Long value);

	/**
	 * Returns the value of the '<em><b>Location Indicator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer that reflects the state of an indicator (e.g., LED) that is part of a device. Reading the value gives the current state. Writing the value with 'On'/'Off' turns the indicator on/off, other values may not be written.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Indicator</em>' attribute.
	 * @see #setLocationIndicator(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDevice_LocationIndicator()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"On\",\"Off\",\"Not Supported\"]' ModelCorrespondence='[\"CIM_AlarmDevice.AlarmState\",\"CIM_AlarmDevice.AudioIndicatorIsDisabled\",\"CIM_AlarmDevice.VisualIndicatorIsDisabled\",\"CIM_AlarmDevice.MotionIndicatorIsDisabled\"]'"
	 * @generated
	 */
	Integer getLocationIndicator();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDevice#getLocationIndicator <em>Location Indicator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Indicator</em>' attribute.
	 * @see #getLocationIndicator()
	 * @generated
	 */
	void setLocationIndicator(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. Instead, use the SetPowerState method in the associated PowerManagementService class. Deprecated description: Sets the power state of the Device.
	 * @param PowerState The power state to set.
	 * @param Time Time indicates when the power state should be set, either as a regular date-time value or as an interval value (where the interval begins when the method invocation is received).
	 * <!-- end-model-doc -->
	 * @model PowerStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Full Power\",\"Power Save - Low Power Mode\",\"Power Save - Standby\",\"Power Save - Other\",\"Power Cycle\",\"Power Off\"]'" TimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_PowerManagementService.SetPowerState\"]'"
	 * @generated
	 */
	Long SetPowerState(Integer PowerState, String Time);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests a reset of the LogicalDevice. The return value should be 0 if the request was successfully executed, 1 if the request is not supported, and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can also be specified in the subclass as a Values array qualifier.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long Reset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated in lieu of the more general RequestStateChange method that directly overlaps with the functionality provided by this method. 
	 * Deprecated description: Requests that the LogicalDevice be enabled ("Enabled" input parameter=TRUE) or disabled (=FALSE). If successful, the StatusInfo or EnabledState properties of the Device should reflect the desired state (enabled or disabled). Note that this function overlaps with the RequestedState property. RequestedState was added to the model to maintain a record (for example, a persisted value) of the last state request. Invoking the EnableDevice method should set the RequestedState property appropriately. 
	 * The return code should be 0 if the request was successfully executed, 1 if the request is not supported, and some other value if an error occurred. In a subclass, the set of possible return codes could be specified by using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can also be specified in the subclass as a Values array qualifier.
	 * @param Enabled If TRUE, enable the device. If FALSE, disable the device.
	 * <!-- end-model-doc -->
	 * @model EnabledAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EnabledLogicalElement.RequestStateChange\"]'"
	 * @generated
	 */
	Long EnableDevice(Boolean Enabled);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated in lieu of the more general RequestStateChange method that directly overlaps with the functionality provided by this method. 
	 * Deprecated description: Requests that the LogicalDevice be brought online ("Online" input parameter=TRUE) or taken offline (=FALSE). "Online" indicates that the Device is ready to accept requests, and is operational and fully functioning. In this case, the Availability property of the Device would be set to a value of 3 ("Running/Full Power"). "Offline" indicates that a Device is powered on and operational, but is not processing functional requests. In an offline state, a Device might be capable of running diagnostics or generating operational alerts. For example, when the "Offline" button is pushed on a Printer, the Device is no longer available to process print jobs, but it could be available for diagnostics or maintenance. 
	 * If this method is successful, the Availability and AdditionalAvailability properties of the Device should reflect the updated status. If a failure occurs when you try to bring the Device online or offline, it should remain in its current state. The request, if unsuccessful, should not leave the Device in an indeterminate state. When bringing a Device back "Online" from an "Offline" mode, the Device should be restored to its last "Online" state, if at all possible. Only a Device that has an EnabledState or StatusInfo of "Enabled" and has been configured can be brought online or taken offline. 
	 * OnlineDevice should return 0 if successful, 1 if the request is not supported at all, 2 if the request is not supported due to the current state of the Device, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can also be specified in the subclass as a Values array qualifier. 
	 * Note that the function of this method overlaps with the RequestedState property. RequestedState was added to the model to maintain a record (for example, a persisted value) of the last state request. Invoking the OnlineDevice method should set the RequestedState property appropriately.
	 * @param Online If TRUE, take the device online. If FALSE, take the device offline.
	 * <!-- end-model-doc -->
	 * @model OnlineAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EnabledLogicalElement.RequestStateChange\"]'"
	 * @generated
	 */
	Long OnlineDevice(Boolean Online);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated in lieu of the more general RequestStateChange method that directly overlaps with the functionality provided by this method. 
	 * Deprecated description: Requests that the LogicalDevice cleanly cease all activity ("Quiesce" input parameter=TRUE) or resume activity (=FALSE). For this method to quiesce a Device, that Device should have an Availability (or Additional Availability) of "Running/Full Power" (value=3) and an EnabledStatus/StatusInfo of "Enabled". For example, if quiesced, a Device can then be taken offline for diagnostics, or disabled for power off and hot swap. For the method to "unquiesce" a Device, that Device should have an Availability (or AdditionalAvailability) of "Quiesced" (value=21) and an EnabledStatus or StatusInfo of "Enabled". In this case, the Device would be returned to an "Enabled" and "Running/Full Power" status. 
	 * The return code of the method should indicate the success or failure of the quiesce. It should return 0 if successful, 1 if the request is not supported at all, 2 if the request is not supported due to the current state of the Device, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can also be specified in the subclass as a Values array qualifier.
	 * @param Quiesce If set to TRUE, then cleanly cease all activity. If FALSE, resume activity.
	 * <!-- end-model-doc -->
	 * @model QuiesceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EnabledLogicalElement.RequestStateChange\"]'"
	 * @generated
	 */
	Long QuiesceDevice(Boolean Quiesce);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. Its function is handled more generally by the ConfigurationData subclass of SettingData. 
	 * Deprecated description: Requests that the Device capture its current configuration, setup or state information, or both in a backing store. 
	 * The information returned by this method could be used at a later time (using the RestoreProperties method) to return a Device to its present "condition". This method might not be supported by all Devices. The method should return 0 if successful, 1 if the request is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can also be specified in the subclass as a Values array qualifier.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_ConfigurationData.ConfigurationInformation\"]'"
	 * @generated
	 */
	Long SaveProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method is deprecated. Its function is handled more generally by the ConfigurationData subclass of SettingData. 
	 * Requests that the Device re-establish its configuration, setup or state information, or both from a backing store. The information would have been captured at an earlier time (using the SaveProperties method). This method might not be supported by all Devices. The method should return 0 if successful, 1 if the request is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can also be specified in the subclass as a Values array qualifier.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_ConfigurationData.ApplyConfiguration\"]'"
	 * @generated
	 */
	Long RestoreProperties();

} // CIM_LogicalDevice

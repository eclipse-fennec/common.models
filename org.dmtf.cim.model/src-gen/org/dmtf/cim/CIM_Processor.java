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
 * A representation of the model object '<em><b>CIM Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of the Processor LogicalDevice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getRole <em>Role</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getFamily <em>Family</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getOtherFamilyDescription <em>Other Family Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getUpgradeMethod <em>Upgrade Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getMaxClockSpeed <em>Max Clock Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getCurrentClockSpeed <em>Current Clock Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getDataWidth <em>Data Width</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getAddressWidth <em>Address Width</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getLoadPercentage <em>Load Percentage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getStepping <em>Stepping</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getUniqueID <em>Unique ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getCPUStatus <em>CPU Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getExternalBusClockSpeed <em>External Bus Clock Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getEnabledProcessorCharacteristics <em>Enabled Processor Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Processor#getNumberOfEnabledCores <em>Number Of Enabled Cores</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Processor()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.56.0' UMLPackagePath='CIM::Device::Processor' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_Processor extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that describes the role of the Processor, for example, "Central Processor" or "Math Processor".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_Role()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Processor#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Processor family type. For example, values include "Pentium(R) processor with MMX(TM) technology" (value=14) and "68040" (value=96).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_Family()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIF.DMTF|Processor|017.3\"]' ModelCorrespondence='[\"CIM_Processor.OtherFamilyDescription\"]'"
	 * @generated
	 */
	Integer getFamily();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Processor#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Family Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the Processor Family type. It is used when the Family property is set to 1 ("Other"). This string should be set to NULL when the Family property is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Family Description</em>' attribute.
	 * @see #setOtherFamilyDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_OtherFamilyDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' ModelCorrespondence='[\"CIM_Processor.Family\"]'"
	 * @generated
	 */
	String getOtherFamilyDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Processor#getOtherFamilyDescription <em>Other Family Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Family Description</em>' attribute.
	 * @see #getOtherFamilyDescription()
	 * @generated
	 */
	void setOtherFamilyDescription(String value);

	/**
	 * Returns the value of the '<em><b>Upgrade Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CPU socket information that includes data on how this Processor can be upgraded (if upgrades are supported). This property is an integer enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upgrade Method</em>' attribute.
	 * @see #setUpgradeMethod(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_UpgradeMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"76\",\"77\",\"78\",\"79\",\"80\",\"81\",\"82\",\"83\",\"84\",\"85\",\"86\",\"87\"]' Values='[\"Other\",\"Unknown\",\"Daughter Board\",\"ZIF Socket\",\"Replacement/Piggy Back\",\"None\",\"LIF Socket\",\"Slot 1\",\"Slot 2\",\"370 Pin Socket\",\"Slot A\",\"Slot M\",\"Socket 423\",\"Socket A (Socket 462)\",\"Socket 478\",\"Socket 754\",\"Socket 940\",\"Socket 939\",\"Socket mPGA604\",\"Socket LGA771\",\"Socket LGA775\",\"Socket S1\",\"Socket AM2\",\"Socket F (1207)\",\"Socket LGA1366\",\"Socket G34\",\"Socket AM3\",\"Socket C32\",\"Socket LGA1156\",\"Socket LGA1567\",\"Socket PGA988A\",\"Socket BGA1288\",\"rPGA988B\",\"BGA1023\",\"BGA1224\",\"LGA1155\",\"LGA1356\",\"LGA2011\",\"Socket FS1\",\"Socket FS2\",\"Socket FM1\",\"Socket FM2\",\"Socket LGA2011-3\",\"Socket LGA1356-3\",\"Socket LGA1150\",\"Socket BGA1168\",\"Socket BGA1234\",\"Socket BGA1364\",\"Socket AM4\",\"Socket LGA1151\",\"Socket BGA1356\",\"Socket BGA1440\",\"Socket BGA1515\",\"Socket LGA3647-1\",\"Socket SP3\",\"Socket SP3r2\",\"Socket LGA2066\",\"Socket BGA1392\",\"Socket BGA1510\",\"Socket BGA1528\",\"Socket LGA4189\",\"Socket LGA1200\",\"Socket LGA4677\",\"Socket LGA1700\",\"Socket BGA1744\",\"Socket BGA1781\",\"Socket BGA1211\",\"Socket BGA2422\",\"Socket LGA1211\",\"Socket LGA2422\",\"Socket LGA5773\",\"Socket BGA5773\",\"Socket AM5\",\"Socket SP5\",\"Socket SP6\",\"Socket BGA883\",\"Socket BGA1190\",\"Socket LGA4129\",\"Socket LGA4710\",\"Socket LGA7529\",\"Socket BGA1964\",\"Socket BGA1792\",\"Socket BGA2049\",\"Socket BGA2551\",\"Socket LGA1851\",\"Socket BGA2114\",\"Socket BGA2833\"]' MappingStrings='[\"MIF.DMTF|Processor|017.7\"]'"
	 * @generated
	 */
	Integer getUpgradeMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Processor#getUpgradeMethod <em>Upgrade Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upgrade Method</em>' attribute.
	 * @see #getUpgradeMethod()
	 * @generated
	 */
	void setUpgradeMethod(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Clock Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum speed (in MHz) of this Processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Clock Speed</em>' attribute.
	 * @see #setMaxClockSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_MaxClockSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MegaHertz' MappingStrings='[\"MIF.DMTF|Processor|017.5\"]' PUnit='hertz * 10^6'"
	 * @generated
	 */
	Long getMaxClockSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Processor#getMaxClockSpeed <em>Max Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Clock Speed</em>' attribute.
	 * @see #getMaxClockSpeed()
	 * @generated
	 */
	void setMaxClockSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Current Clock Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current speed (in MHz) of this Processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Clock Speed</em>' attribute.
	 * @see #setCurrentClockSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_CurrentClockSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MegaHertz' MappingStrings='[\"MIF.DMTF|Processor|017.6\"]' PUnit='hertz * 10^6'"
	 * @generated
	 */
	Long getCurrentClockSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Processor#getCurrentClockSpeed <em>Current Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Clock Speed</em>' attribute.
	 * @see #getCurrentClockSpeed()
	 * @generated
	 */
	void setCurrentClockSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Data Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Processor data width in bits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Width</em>' attribute.
	 * @see #setDataWidth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_DataWidth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Bits' PUnit='bit'"
	 * @generated
	 */
	Integer getDataWidth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Processor#getDataWidth <em>Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Width</em>' attribute.
	 * @see #getDataWidth()
	 * @generated
	 */
	void setDataWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Address Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Processor address width in bits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Width</em>' attribute.
	 * @see #setAddressWidth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_AddressWidth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Bits' PUnit='bit'"
	 * @generated
	 */
	Integer getAddressWidth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Processor#getAddressWidth <em>Address Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Width</em>' attribute.
	 * @see #getAddressWidth()
	 * @generated
	 */
	void setAddressWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Load Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Loading of this Processor, averaged over the last minute, in Percent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Percentage</em>' attribute.
	 * @see #setLoadPercentage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_LoadPercentage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percent' Gauge='true' MappingStrings='[\"MIB.IETF|HOST-RESOURCES-MIB.hrProcessorLoad\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getLoadPercentage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Processor#getLoadPercentage <em>Load Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Percentage</em>' attribute.
	 * @see #getLoadPercentage()
	 * @generated
	 */
	void setLoadPercentage(Integer value);

	/**
	 * Returns the value of the '<em><b>Stepping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stepping is a free-form string that indicates the revision level of the Processor within the Processor.Family.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stepping</em>' attribute.
	 * @see #setStepping(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_Stepping()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Processor.Family\"]'"
	 * @generated
	 */
	String getStepping();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Processor#getStepping <em>Stepping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stepping</em>' attribute.
	 * @see #getStepping()
	 * @generated
	 */
	void setStepping(String value);

	/**
	 * Returns the value of the '<em><b>Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A globally unique identifier for the Processor. This identifier can be unique only within a Processor Family.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unique ID</em>' attribute.
	 * @see #setUniqueID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_UniqueID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getUniqueID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Processor#getUniqueID <em>Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique ID</em>' attribute.
	 * @see #getUniqueID()
	 * @generated
	 */
	void setUniqueID(String value);

	/**
	 * Returns the value of the '<em><b>CPU Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CPUStatus property that indicates the current status of the Processor. For example, the Processor might be disabled by the user (value=2), or disabled due to a POST error (value=3). Information in this property can be obtained from SMBIOS, the Type 4 structure, and the Status attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CPU Status</em>' attribute.
	 * @see #setCPUStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_CPUStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"7\"]' Values='[\"Unknown\",\"CPU Enabled\",\"CPU Disabled by User\",\"CPU Disabled By BIOS (POST Error)\",\"CPU Is Idle\",\"Other\"]'"
	 * @generated
	 */
	Integer getCPUStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Processor#getCPUStatus <em>CPU Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPU Status</em>' attribute.
	 * @see #getCPUStatus()
	 * @generated
	 */
	void setCPUStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>External Bus Clock Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The speed (in MHz) of the external bus interface (also known as the front side bus).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Bus Clock Speed</em>' attribute.
	 * @see #setExternalBusClockSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_ExternalBusClockSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MegaHertz' PUnit='hertz * 10^6'"
	 * @generated
	 */
	Long getExternalBusClockSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Processor#getExternalBusClockSpeed <em>External Bus Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Bus Clock Speed</em>' attribute.
	 * @see #getExternalBusClockSpeed()
	 * @generated
	 */
	void setExternalBusClockSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Array of enumerated values that describes the characteristics of the processor. The characteristics include certain features of the processor such as 64 bit support for data width of the processor. Note that if this property does not contain the value corresponding to a feature of the processor, than the feature either is not that some of the features of the processor may exist but may not be enabled. To find the the currently enabled features the processor, reffer to the EnabledProcessorCharacteristics property. Values specified in the enumeration may be obtained from SMBIOS v2.5 Type 4 offset 26h (Processor Characteristics Word). 32-bit Capable - describes whether the processor has the capability for 32 bits data width. 64-bit Capable - describes whether the processor has the capability for 64 bits data width. Enhanced Virtualization - describes whether the processor has the capability for executing enhanced virtualization instructions. Hardware Thread - indicates that the processor is capable of the hardware threading. NX-bit - describes whether the processor has capability to utilize non-execute bit and can differentiate the memory marked strictly for storage. Power/Performance Control - describes whether the processor has capability for load based power savings. Core Frequency Boosting - describes whether the processor has a capability for one processor core to increase its frequency whenever the other core has gone into an idle state. Arm64 Soc ID indicates whether the processor supports returning a SoC ID value using the SMCCC_ARCH_SOC_ID architectural call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_Characteristics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10..32567\",\"32568..65535\"]' Values='[\"Unknown\",\"DMTF Reserved\",\"64-bit Capable\",\"32-bit Capable\",\"Enhanced Virtualization\",\"Hardware Thread\",\"NX-bit\",\"Power/Performance Control\",\"Core Frequency Boosting\",\"Arm64 SoC ID\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_Processor.EnabledProcessorCharacteristics\"]'"
	 * @generated
	 */
	EList<Integer> getCharacteristics();

	/**
	 * Returns the value of the '<em><b>Enabled Processor Characteristics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the enabled states of the corresponding processor characteristics. The property array is indexed with ProcessorCharacteristics property array of the associated CIM_ProcessorCapabilities instance through the CIM_ElementCapabilities association. Each of the values in the ProcessorCharacteristics array property shall have its enabled state indicated in the corresponding element of this property array. For example; if the ProcessorCharacteristics array has value - NX-bit - for the first element of the array, then the first element of this property will contain the value for the enabled state of the NX-bit feature of the processor: whether the processor currently differentiates the dedicated storage memory based on the non-execute bit. Unknown - the processor feature is in unknown state. Enabled - the processor feature is enabled and could be used. Disabled - the processor feature is disabled and cannot be used. Not Applicable - the processor feature does not have state context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Processor Characteristics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_EnabledProcessorCharacteristics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Enabled\",\"Disabled\",\"Not Applicable\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_Processor.Characteristics\"]'"
	 * @generated
	 */
	EList<Integer> getEnabledProcessorCharacteristics();

	/**
	 * Returns the value of the '<em><b>Number Of Enabled Cores</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of processor cores enabled for processor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Enabled Cores</em>' attribute.
	 * @see #setNumberOfEnabledCores(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Processor_NumberOfEnabledCores()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getNumberOfEnabledCores();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Processor#getNumberOfEnabledCores <em>Number Of Enabled Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Enabled Cores</em>' attribute.
	 * @see #getNumberOfEnabledCores()
	 * @generated
	 */
	void setNumberOfEnabledCores(Integer value);

} // CIM_Processor

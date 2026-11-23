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
 * A representation of the model object '<em><b>CIM Computer System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from System that is a special collection of ManagedSystemElements. This collection is related to the providing of compute capabilities and MAY serve as an aggregation point to associate one or more of the following elements: FileSystem, OperatingSystem, Processor and Memory (Volatile and/or NonVolatile Storage).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ComputerSystem#getDedicated <em>Dedicated</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ComputerSystem#getOtherDedicatedDescriptions <em>Other Dedicated Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ComputerSystem#getResetCapability <em>Reset Capability</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ComputerSystem#getPowerManagementCapabilities <em>Power Management Capabilities</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ComputerSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.42.0' UMLPackagePath='CIM::System::SystemElements' override.NameFormat='string' override.NameFormat.Description='The ComputerSystem object and its derivatives are Top Level Objects of CIM. They provide the scope for numerous components. Having unique System keys is required. The NameFormat property identifies how the ComputerSystem Name is generated. The NameFormat ValueMap qualifier defines the various mechanisms for assigning the name. Note that another name can be assigned and used for the ComputerSystem that better suit a business, using the inherited ElementName property.\nIf the NameFormat is set to \"UUID\", then the Name property shall be a UUID in its canonical form consisting of 32 hexadecimal digits in 5 groups separated by hyphens, in the form 8-4-4-4-12 for a total of 36 characters (32 digits and 4 hyphens). For the first three fields, the most significant digit is on the left. The last two fields are treated as eight separate bytes, each having their most significant digit on the left, and they follow each other from left to right.' override.NameFormat.ValueMap='[\"Other\",\"IP\",\"Dial\",\"HID\",\"NWA\",\"HWA\",\"X25\",\"ISDN\",\"IPX\",\"DCC\",\"ICD\",\"E.164\",\"SNA\",\"OID/OSI\",\"WWN\",\"NAA\",\"UUID\"]' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ComputerSystem extends CIM_System {
	/**
	 * Returns the value of the '<em><b>Dedicated</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the purpose(s) to which the ComputerSystem is dedicated, if any, and what functionality is provided. For example, one could specify that the System is dedicated to "Print" (value=11) or acts as a "Hub" (value=8). 
	 * Also, one could indicate that this is a general purpose system by indicating 'Not Dedicated' (value=0) but that it also hosts 'Print' (value=11) or mobile phone 'Mobile User Device' (value=17) services. 
	 * A clarification is needed with respect to the value 17 ("Mobile User Device"). An example of a dedicated user device is a mobile phone or a barcode scanner in a store that communicates via radio frequency. These systems are quite limited in functionality and programmability, and are not considered 'general purpose' computing platforms. Alternately, an example of a mobile system that is 'general purpose' (i.e., is NOT dedicated) is a hand-held computer. Although limited in its programmability, new software can be downloaded and its functionality expanded by the user. 
	 * A value of "Management" indicates this instance is dedicated to hosting system management software.
	 * A value of "Management Controller" indicates this instance represents specialized hardware dedicated to systems management (i.e., a Baseboard Management Controller (BMC) or service processor).
	 * The management scope of a "Management Controller" is typically a single managed system in which it is contained.
	 * A value of "Chassis Manager" indicates this instance represents a system dedicated to management of a blade chassis and its contained devices. This value would be used to represent a Shelf Controller. A "Chassis Manager" is an aggregation point for management and may rely on subordinate management controllers for the management of constituent parts. A value of "Host-based RAID Controller" indicates this instance represents a RAID storage controller contained within a host computer. A value of "Storage Device Enclosure" indicates this instance represents an enclosure that contains storage devices. A "Virtual Tape Library" is the emulation of a tape library by a Virtual Library System. A "Virtual Library System" uses disk storage to emulate tape libraries.A "FC Switch" indicates this instance is dedicated to switching layer 2 fibre channel frames. An "Ethernet Switch" indicates this instance is dedicated to switching layer 2 ethernet frames.
	 * "Server" indicates that the system is an independent computer system whose primary purpose is to host services for other systems and devices to access; typically as in a stand-alone floor or rack-mounted system.
	 * "Blade" indicates this instance is a computer system that fits into another chassis and depends on it for services, such as power, cooling, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dedicated</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ComputerSystem_Dedicated()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"136\",\"137\",\"138\",\"..\",\"32568..65535\"]' Values='[\"Not Dedicated\",\"Unknown\",\"Other\",\"Storage\",\"Router\",\"Switch\",\"Layer 3 Switch\",\"Central Office Switch\",\"Hub\",\"Access Server\",\"Firewall\",\"Print\",\"I/O\",\"Web Caching\",\"Management\",\"Block Server\",\"File Server\",\"Mobile User Device\",\"Repeater\",\"Bridge/Extender\",\"Gateway\",\"Storage Virtualizer\",\"Media Library\",\"ExtenderNode\",\"NAS Head\",\"Self-contained NAS\",\"UPS\",\"IP Phone\",\"Management Controller\",\"Chassis Manager\",\"Host-based RAID controller\",\"Storage Device Enclosure\",\"Desktop\",\"Laptop\",\"Virtual Tape Library\",\"Virtual Library System\",\"Network PC/Thin Client\",\"FC Switch\",\"Ethernet Switch\",\"Server\",\"Blade\",\"Partitioned Library System\",\"Unallocated Partition\",\"Partition\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' MappingStrings='[\"MIB.IETF|MIB-II.sysServices\",\"FC-GS.INCITS-T11 | Platform | PlatformType\"]' ModelCorrespondence='[\"CIM_ComputerSystem.OtherDedicatedDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getDedicated();

	/**
	 * Returns the value of the '<em><b>Other Dedicated Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing how or why the system is dedicated when the Dedicated array includes the value 2, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Dedicated Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ComputerSystem_OtherDedicatedDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ComputerSystem.Dedicated\"]'"
	 * @generated
	 */
	EList<String> getOtherDedicatedDescriptions();

	/**
	 * Returns the value of the '<em><b>Reset Capability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If enabled (value = 4), the ComputerSystem can be reset via hardware (e.g. the power and reset buttons). If disabled (value = 3), hardware reset is not allowed. In addition to Enabled and Disabled, other Values for the property are also defined - "Not Implemented" (5), "Other" (1) and "Unknown" (2).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reset Capability</em>' attribute.
	 * @see #setResetCapability(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ComputerSystem_ResetCapability()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"Unknown\",\"Disabled\",\"Enabled\",\"Not Implemented\"]' MappingStrings='[\"MIF.DMTF|System Hardware Security|001.4\"]'"
	 * @generated
	 */
	Integer getResetCapability();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ComputerSystem#getResetCapability <em>Reset Capability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Capability</em>' attribute.
	 * @see #getResetCapability()
	 * @generated
	 */
	void setResetCapability(Integer value);

	/**
	 * Returns the value of the '<em><b>Power Management Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated array describing the power management capabilities of the ComputerSystem. The use of this property has been deprecated. Instead, the Power Capabilites property in an associated PowerManagement Capabilities class should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Management Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ComputerSystem_PowerManagementCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_PowerManagementCapabilities.PowerCapabilities\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"Not Supported\",\"Disabled\",\"Enabled\",\"Power Saving Modes Entered Automatically\",\"Power State Settable\",\"Power Cycling Supported\",\"Timed Power On Supported\"]' MappingStrings='[\"MIF.DMTF|System Power Controls|001.2\"]'"
	 * @generated
	 */
	EList<Integer> getPowerManagementCapabilities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the power state of the computer. The use of this method has been deprecated. Instead, use the SetPowerState method in the associated PowerManagementService class.
	 * @param PowerState The Desired state for the COmputerSystem.
	 * @param Time Time indicates when the power state should be set, either as a regular date-time value or as an interval value (where the interval begins when the method invocation is received.
	 * <!-- end-model-doc -->
	 * @model PowerStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Full Power\",\"Power Save - Low Power Mode\",\"Power Save - Standby\",\"Power Save - Other\",\"Power Cycle\",\"Power Off\",\"Hibernate\",\"Soft Off\"]'" TimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_PowerManagementService.SetPowerState\"]'"
	 * @generated
	 */
	Long SetPowerState(Long PowerState, String Time);

} // CIM_ComputerSystem

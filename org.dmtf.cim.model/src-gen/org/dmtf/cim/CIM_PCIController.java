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
 * A representation of the model object '<em><b>CIM PCI Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PCIController is a superclass for the PCIBridge and PCIDevice classes. These classes model adapters and bridges on a PCI bus. The properties in PCIController and its subclasses are defined in the various PCI Specifications that are published by the PCI SIG.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PCIController#getCommandRegister <em>Command Register</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIController#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIController#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIController#getDeviceSelectTiming <em>Device Select Timing</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIController#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIController#getCacheLineSize <em>Cache Line Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIController#getLatencyTimer <em>Latency Timer</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIController#getInterruptPin <em>Interrupt Pin</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIController#getExpansionROMBaseAddress <em>Expansion ROM Base Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIController#getSelfTestEnabled <em>Self Test Enabled</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PCIController()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.53.0' UMLPackagePath='CIM::Device::Controller' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_PCIController extends CIM_Controller {
	/**
	 * Returns the value of the '<em><b>Command Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current contents of the register that provides basic control over the ability of the device to respond to or perform PCI accesses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command Register</em>' attribute.
	 * @see #setCommandRegister(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIController_CommandRegister()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getCommandRegister();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIController#getCommandRegister <em>Command Register</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Register</em>' attribute.
	 * @see #getCommandRegister()
	 * @generated
	 */
	void setCommandRegister(Integer value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers that indicates controller capabilities. Information such as "Supports 66MHz" (value=2) is specified in this property. The data in the Capabilities array is gathered from the PCI Status Register and the PCI Capabilities List as defined in the PCI Specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIController_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Supports 66MHz\",\"Supports User Definable Features\",\"Supports Fast Back-to-Back Transactions\",\"PCI-X Capable\",\"PCI Power Management Supported\",\"Message Signaled Interrupts Supported\",\"Parity Error Recovery Capable\",\"AGP Supported\",\"Vital Product Data Supported\",\"Provides Slot Identification\",\"Hot Swap Supported\",\"Supports PCIe\",\"Supports PCIe Gen 2\",\"Supports PCIe Gen 3\",\"Supports PCIe Gen 4\",\"Supports PCIe Gen 5\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PCIController.CapabilityDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Capability Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings that provides more detailed explanations for any of the PCIController features that are indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIController_CapabilityDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_PCIController.Capabilities\"]'"
	 * @generated
	 */
	EList<String> getCapabilityDescriptions();

	/**
	 * Returns the value of the '<em><b>Device Select Timing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The slowest device-select timing for a target device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Select Timing</em>' attribute.
	 * @see #setDeviceSelectTiming(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIController_DeviceSelectTiming()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Fast\",\"Medium\",\"Slow\",\"Reserved\"]'"
	 * @generated
	 */
	Integer getDeviceSelectTiming();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIController#getDeviceSelectTiming <em>Device Select Timing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Select Timing</em>' attribute.
	 * @see #getDeviceSelectTiming()
	 * @generated
	 */
	void setDeviceSelectTiming(Integer value);

	/**
	 * Returns the value of the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Register of 8 bits that identifies the basic function of the PCI device. This property is only the upper byte (offset 0Bh) of the 3-byte ClassCode field. Note that the ValueMap array of the property specifies the decimal representation of this information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Code</em>' attribute.
	 * @see #setClassCode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIController_ClassCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18..254\",\"255\"]' Values='[\"Pre 2.0\",\"Mass Storage\",\"Network\",\"Display\",\"Multimedia\",\"Memory\",\"Bridge\",\"Simple Communications\",\"Base Peripheral\",\"Input\",\"Docking Station\",\"Processor\",\"Serial Bus\",\"Wireless\",\"Intelligent I/O\",\"Satellite Communication\",\"Encryption/Decryption\",\"Data Acquisition and Signal Processing\",\"PCI Reserved\",\"Other\"]'"
	 * @generated
	 */
	Integer getClassCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIController#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Code</em>' attribute.
	 * @see #getClassCode()
	 * @generated
	 */
	void setClassCode(Integer value);

	/**
	 * Returns the value of the '<em><b>Cache Line Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the system cache line size in doubleword increments (for example, a 486-based system would store the value 04h, indicating a cache line size of four doublewords.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cache Line Size</em>' attribute.
	 * @see #setCacheLineSize(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIController_CacheLineSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Units='DoubleWords' PUnit='dataword * 2'"
	 * @generated
	 */
	Integer getCacheLineSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIController#getCacheLineSize <em>Cache Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Line Size</em>' attribute.
	 * @see #getCacheLineSize()
	 * @generated
	 */
	void setCacheLineSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Latency Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the minimum amount of time, in PCI clock cycles, that the bus master can retain ownership of the bus.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latency Timer</em>' attribute.
	 * @see #setLatencyTimer(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIController_LatencyTimer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Units='PCI clock cycles' PUnit='cycle'"
	 * @generated
	 */
	Integer getLatencyTimer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIController#getLatencyTimer <em>Latency Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency Timer</em>' attribute.
	 * @see #getLatencyTimer()
	 * @generated
	 */
	void setLatencyTimer(Integer value);

	/**
	 * Returns the value of the '<em><b>Interrupt Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the PCI interrupt request pin (INTA# to INTD#) to which a PCI functional device is connected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interrupt Pin</em>' attribute.
	 * @see #setInterruptPin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIController_InterruptPin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"None\",\"INTA#\",\"INTB#\",\"INTC#\",\"INTD#\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getInterruptPin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIController#getInterruptPin <em>Interrupt Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupt Pin</em>' attribute.
	 * @see #getInterruptPin()
	 * @generated
	 */
	void setInterruptPin(Integer value);

	/**
	 * Returns the value of the '<em><b>Expansion ROM Base Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Doubleword Expansion ROM-base memory address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expansion ROM Base Address</em>' attribute.
	 * @see #setExpansionROMBaseAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIController_ExpansionROMBaseAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='DoubleWords' PUnit='dataword * 2'"
	 * @generated
	 */
	Long getExpansionROMBaseAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIController#getExpansionROMBaseAddress <em>Expansion ROM Base Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expansion ROM Base Address</em>' attribute.
	 * @see #getExpansionROMBaseAddress()
	 * @generated
	 */
	void setExpansionROMBaseAddress(Long value);

	/**
	 * Returns the value of the '<em><b>Self Test Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reports if the PCI device can perform the self-test function. Returns bit 7 of the BIST register as a Boolean.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Self Test Enabled</em>' attribute.
	 * @see #setSelfTestEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIController_SelfTestEnabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSelfTestEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIController#getSelfTestEnabled <em>Self Test Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Test Enabled</em>' attribute.
	 * @see #getSelfTestEnabled()
	 * @generated
	 */
	void setSelfTestEnabled(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method to invoke PCI device self-test. This method sets bit 6 of the BIST register. The return result is the lower 4 bits of the BIST register where 0 indicates success and non-zero is a device-dependent failure. Support for this method is optional in the PCI Specification.
	 * <!-- end-model-doc -->
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer BISTExecution();

} // CIM_PCIController

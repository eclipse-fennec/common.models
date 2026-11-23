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
 * A representation of the model object '<em><b>CIM PCI Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of a PCI device controller on an adapter card.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PCIDevice#getBaseAddress <em>Base Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIDevice#getSubsystemID <em>Subsystem ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIDevice#getSubsystemVendorID <em>Subsystem Vendor ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIDevice#getMinGrantTime <em>Min Grant Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIDevice#getMaxLatency <em>Max Latency</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIDevice#getBusNumber <em>Bus Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIDevice#getDeviceNumber <em>Device Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIDevice#getFunctionNumber <em>Function Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIDevice#getPCIDeviceID <em>PCI Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIDevice#getVendorID <em>Vendor ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIDevice#getRevisionID <em>Revision ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PCIDevice()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Device::Controller' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_PCIDevice extends CIM_PCIController {
	/**
	 * Returns the value of the '<em><b>Base Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Array of doubleword base-memory addresses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIDevice_BaseAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]'"
	 * @generated
	 */
	EList<Long> getBaseAddress();

	/**
	 * Returns the value of the '<em><b>Subsystem ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subsystem identifier code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subsystem ID</em>' attribute.
	 * @see #setSubsystemID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIDevice_SubsystemID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getSubsystemID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIDevice#getSubsystemID <em>Subsystem ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsystem ID</em>' attribute.
	 * @see #getSubsystemID()
	 * @generated
	 */
	void setSubsystemID(Integer value);

	/**
	 * Returns the value of the '<em><b>Subsystem Vendor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subsystem vendor ID. ID information is reported from a PCIDevice through protocol-specific requests. The correct place in the CIM Schema for this information is in CIM_Physical Element (the Manufacturer property) for hardware, and CIM_Product (the Vendor property) if the information is related to Product acquisition. This data is also reported here, because it is part of the standard output from the Device and is an optimization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subsystem Vendor ID</em>' attribute.
	 * @see #setSubsystemVendorID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIDevice_SubsystemVendorID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getSubsystemVendorID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIDevice#getSubsystemVendorID <em>Subsystem Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsystem Vendor ID</em>' attribute.
	 * @see #getSubsystemVendorID()
	 * @generated
	 */
	void setSubsystemVendorID(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Grant Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Register that indicates how long the master would like to retain PCI bus ownership whenever it initiates a transaction. A 0 value indicates no requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Grant Time</em>' attribute.
	 * @see #setMinGrantTime(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIDevice_MinGrantTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Units='250 nanoseconds' PUnit='second * 250 * 10^-9'"
	 * @generated
	 */
	Integer getMinGrantTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIDevice#getMinGrantTime <em>Min Grant Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Grant Time</em>' attribute.
	 * @see #getMinGrantTime()
	 * @generated
	 */
	void setMinGrantTime(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Register that specifies how often the device needs access to the PCI bus in 250ns. A 0 value indicates no requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Latency</em>' attribute.
	 * @see #setMaxLatency(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIDevice_MaxLatency()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Units='250 nanoseconds' PUnit='second * 250 * 10^-9'"
	 * @generated
	 */
	Integer getMaxLatency();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIDevice#getMaxLatency <em>Max Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Latency</em>' attribute.
	 * @see #getMaxLatency()
	 * @generated
	 */
	void setMaxLatency(Integer value);

	/**
	 * Returns the value of the '<em><b>Bus Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bus number where this PCI device resides.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Number</em>' attribute.
	 * @see #setBusNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIDevice_BusNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getBusNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIDevice#getBusNumber <em>Bus Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Number</em>' attribute.
	 * @see #getBusNumber()
	 * @generated
	 */
	void setBusNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Device Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device number assigned to this PCI device for this bus.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Number</em>' attribute.
	 * @see #setDeviceNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIDevice_DeviceNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getDeviceNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIDevice#getDeviceNumber <em>Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Number</em>' attribute.
	 * @see #getDeviceNumber()
	 * @generated
	 */
	void setDeviceNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Function Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The function number for this PCI device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function Number</em>' attribute.
	 * @see #setFunctionNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIDevice_FunctionNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getFunctionNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIDevice#getFunctionNumber <em>Function Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Number</em>' attribute.
	 * @see #getFunctionNumber()
	 * @generated
	 */
	void setFunctionNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>PCI Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Register that contains a value assigned by the device manufacturer used to identify the type of device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PCI Device ID</em>' attribute.
	 * @see #setPCIDeviceID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIDevice_PCIDeviceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getPCIDeviceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIDevice#getPCIDeviceID <em>PCI Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PCI Device ID</em>' attribute.
	 * @see #getPCIDeviceID()
	 * @generated
	 */
	void setPCIDeviceID(Integer value);

	/**
	 * Returns the value of the '<em><b>Vendor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Register that contains a value assigned by the PCI SIG used to identify the manufacturer of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor ID</em>' attribute.
	 * @see #setVendorID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIDevice_VendorID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getVendorID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIDevice#getVendorID <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor ID</em>' attribute.
	 * @see #getVendorID()
	 * @generated
	 */
	void setVendorID(Integer value);

	/**
	 * Returns the value of the '<em><b>Revision ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Register that contains a value assigned by the device manufacturer used to identify the revision number of the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revision ID</em>' attribute.
	 * @see #setRevisionID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIDevice_RevisionID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getRevisionID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIDevice#getRevisionID <em>Revision ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision ID</em>' attribute.
	 * @see #getRevisionID()
	 * @generated
	 */
	void setRevisionID(Integer value);

} // CIM_PCIDevice

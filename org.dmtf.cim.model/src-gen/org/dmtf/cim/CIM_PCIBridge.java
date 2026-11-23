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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM PCI Bridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of a PCI controller that provide bridge-to-bridge capability.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getBridgeType <em>Bridge Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getSecondaryLatencyTimer <em>Secondary Latency Timer</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getSubordinateBusNumber <em>Subordinate Bus Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getSecondayBusNumber <em>Seconday Bus Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getPrimaryBusNumber <em>Primary Bus Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getSecondaryStatusRegister <em>Secondary Status Register</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getSecondaryBusDeviceSelectTiming <em>Secondary Bus Device Select Timing</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getIOLimit <em>IO Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getIOBase <em>IO Base</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getMemoryLimit <em>Memory Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getMemoryBase <em>Memory Base</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getPrefetchMemoryLimit <em>Prefetch Memory Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getPrefetchMemoryBase <em>Prefetch Memory Base</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getPrefetchLimitUpper32 <em>Prefetch Limit Upper32</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getPrefetchBaseUpper32 <em>Prefetch Base Upper32</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getIOLimitUpper16 <em>IO Limit Upper16</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PCIBridge#getIOBaseUpper16 <em>IO Base Upper16</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Device::Controller' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_PCIBridge extends CIM_PCIDevice {
	/**
	 * Returns the value of the '<em><b>Bridge Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of bridge. Except for "Host" (value=0) and "PCIe-to-PCI" (value=10), the type of bridge is PCI-to-<value>. For type "Host", the device is a Host-to-PCI bridge. For type "PCIe-to-PCI", the device is a PCI Express-to-PCI bridge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bridge Type</em>' attribute.
	 * @see #setBridgeType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_BridgeType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"128\",\"..\"]' Values='[\"Host\",\"ISA\",\"EISA\",\"Micro Channel\",\"PCI\",\"PCMCIA\",\"NuBus\",\"CardBus\",\"RACEway\",\"AGP\",\"PCIe\",\"PCIe-to-PCI\",\"Other\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Integer getBridgeType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getBridgeType <em>Bridge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridge Type</em>' attribute.
	 * @see #getBridgeType()
	 * @generated
	 */
	void setBridgeType(Integer value);

	/**
	 * Returns the value of the '<em><b>Secondary Latency Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timeslice for the secondary interface when the bridge is acting as an initiator. A 0 value indicates no requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secondary Latency Timer</em>' attribute.
	 * @see #setSecondaryLatencyTimer(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_SecondaryLatencyTimer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Units='PCI clock cycles' PUnit='cycle'"
	 * @generated
	 */
	Integer getSecondaryLatencyTimer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getSecondaryLatencyTimer <em>Secondary Latency Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Latency Timer</em>' attribute.
	 * @see #getSecondaryLatencyTimer()
	 * @generated
	 */
	void setSecondaryLatencyTimer(Integer value);

	/**
	 * Returns the value of the '<em><b>Subordinate Bus Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of the highest numbered bus that exists behind the bridge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subordinate Bus Number</em>' attribute.
	 * @see #setSubordinateBusNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_SubordinateBusNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getSubordinateBusNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getSubordinateBusNumber <em>Subordinate Bus Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subordinate Bus Number</em>' attribute.
	 * @see #getSubordinateBusNumber()
	 * @generated
	 */
	void setSubordinateBusNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Seconday Bus Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of the PCI bus segment to which the secondary interface of the bridge is connected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seconday Bus Number</em>' attribute.
	 * @see #setSecondayBusNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_SecondayBusNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getSecondayBusNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getSecondayBusNumber <em>Seconday Bus Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconday Bus Number</em>' attribute.
	 * @see #getSecondayBusNumber()
	 * @generated
	 */
	void setSecondayBusNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Primary Bus Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of the PCI bus segment to which the primary interface of the bridge is connected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Bus Number</em>' attribute.
	 * @see #setPrimaryBusNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_PrimaryBusNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getPrimaryBusNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getPrimaryBusNumber <em>Primary Bus Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Bus Number</em>' attribute.
	 * @see #getPrimaryBusNumber()
	 * @generated
	 */
	void setPrimaryBusNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Secondary Status Register</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contents of the SecondaryStatusRegister of the Bridge. For more information on the contents of this register, refer to the PCI-to-PCI Bridge Architecture Specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secondary Status Register</em>' attribute.
	 * @see #setSecondaryStatusRegister(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_SecondaryStatusRegister()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getSecondaryStatusRegister();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getSecondaryStatusRegister <em>Secondary Status Register</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Status Register</em>' attribute.
	 * @see #getSecondaryStatusRegister()
	 * @generated
	 */
	void setSecondaryStatusRegister(Integer value);

	/**
	 * Returns the value of the '<em><b>Secondary Bus Device Select Timing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The slowest device-select timing for a target device on the secondary bus.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secondary Bus Device Select Timing</em>' attribute.
	 * @see #setSecondaryBusDeviceSelectTiming(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_SecondaryBusDeviceSelectTiming()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Fast\",\"Medium\",\"Slow\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Integer getSecondaryBusDeviceSelectTiming();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getSecondaryBusDeviceSelectTiming <em>Secondary Bus Device Select Timing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Bus Device Select Timing</em>' attribute.
	 * @see #getSecondaryBusDeviceSelectTiming()
	 * @generated
	 */
	void setSecondaryBusDeviceSelectTiming(Integer value);

	/**
	 * Returns the value of the '<em><b>IO Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End address of the I/O addresses supported by the bus. The upper 4 bits of this property specify the address bits, AD[15::12], of the I/O address. Each of the remaining 12 bits of the I/O address are assumed to be 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IO Limit</em>' attribute.
	 * @see #setIOLimit(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_IOLimit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getIOLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getIOLimit <em>IO Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IO Limit</em>' attribute.
	 * @see #getIOLimit()
	 * @generated
	 */
	void setIOLimit(Integer value);

	/**
	 * Returns the value of the '<em><b>IO Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base address of I/O addresses supported by the bus. The upper 4 bits of this property specify the address bits, AD[15::12], of the I/O address. Each of the remaining 12 bits of the I/O address are assumed to be 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IO Base</em>' attribute.
	 * @see #setIOBase(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_IOBase()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getIOBase();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getIOBase <em>IO Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IO Base</em>' attribute.
	 * @see #getIOBase()
	 * @generated
	 */
	void setIOBase(Integer value);

	/**
	 * Returns the value of the '<em><b>Memory Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End address of the memory supported by the bus. The upper 12 bits of this property specify the address bits, AD[31::20], of a 32-bit memory address. Each of the remaining 20 bits of the address are assumed to be 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Limit</em>' attribute.
	 * @see #setMemoryLimit(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_MemoryLimit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMemoryLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getMemoryLimit <em>Memory Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Limit</em>' attribute.
	 * @see #getMemoryLimit()
	 * @generated
	 */
	void setMemoryLimit(Integer value);

	/**
	 * Returns the value of the '<em><b>Memory Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base address of the memory supported by the bus. The upper 12 bits of this property specify the address bits, AD[31::20], of a 32-bit memory address. Each of the remaining 20 bits of the address are assumed to be 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Base</em>' attribute.
	 * @see #setMemoryBase(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_MemoryBase()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMemoryBase();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getMemoryBase <em>Memory Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Base</em>' attribute.
	 * @see #getMemoryBase()
	 * @generated
	 */
	void setMemoryBase(Integer value);

	/**
	 * Returns the value of the '<em><b>Prefetch Memory Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End address of the memory that can be prefetched by the bus. The upper 12 bits of this property specify the address bits, AD[31::20], of a 32-bit memory address. Each of the remaining 20 bits of the address are assumed to be 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefetch Memory Limit</em>' attribute.
	 * @see #setPrefetchMemoryLimit(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_PrefetchMemoryLimit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getPrefetchMemoryLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getPrefetchMemoryLimit <em>Prefetch Memory Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefetch Memory Limit</em>' attribute.
	 * @see #getPrefetchMemoryLimit()
	 * @generated
	 */
	void setPrefetchMemoryLimit(Integer value);

	/**
	 * Returns the value of the '<em><b>Prefetch Memory Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base address of the memory that can be prefetched by the bus. The upper 12 bits of this property specify the address bits, AD[31::20], of a 32-bit memory address. Each of the remaining 20 bits of the address are assumed to be 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefetch Memory Base</em>' attribute.
	 * @see #setPrefetchMemoryBase(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_PrefetchMemoryBase()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getPrefetchMemoryBase();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getPrefetchMemoryBase <em>Prefetch Memory Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefetch Memory Base</em>' attribute.
	 * @see #getPrefetchMemoryBase()
	 * @generated
	 */
	void setPrefetchMemoryBase(Integer value);

	/**
	 * Returns the value of the '<em><b>Prefetch Limit Upper32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper 32 bits of the supported prefetch end address when 64-bit addressing is used. The lower 32 bits are each assumed to be 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefetch Limit Upper32</em>' attribute.
	 * @see #setPrefetchLimitUpper32(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_PrefetchLimitUpper32()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getPrefetchLimitUpper32();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getPrefetchLimitUpper32 <em>Prefetch Limit Upper32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefetch Limit Upper32</em>' attribute.
	 * @see #getPrefetchLimitUpper32()
	 * @generated
	 */
	void setPrefetchLimitUpper32(Long value);

	/**
	 * Returns the value of the '<em><b>Prefetch Base Upper32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper 32 bits of the supported prefetch base address when 64-bit addressing is used. The lower 32 bits are assumed to be 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prefetch Base Upper32</em>' attribute.
	 * @see #setPrefetchBaseUpper32(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_PrefetchBaseUpper32()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getPrefetchBaseUpper32();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getPrefetchBaseUpper32 <em>Prefetch Base Upper32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefetch Base Upper32</em>' attribute.
	 * @see #getPrefetchBaseUpper32()
	 * @generated
	 */
	void setPrefetchBaseUpper32(Long value);

	/**
	 * Returns the value of the '<em><b>IO Limit Upper16</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper 16 bits of the supported I/O end address when 32-bit I/O addressing is used. The lower 16 bits are each assumed to be 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IO Limit Upper16</em>' attribute.
	 * @see #setIOLimitUpper16(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_IOLimitUpper16()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getIOLimitUpper16();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getIOLimitUpper16 <em>IO Limit Upper16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IO Limit Upper16</em>' attribute.
	 * @see #getIOLimitUpper16()
	 * @generated
	 */
	void setIOLimitUpper16(Integer value);

	/**
	 * Returns the value of the '<em><b>IO Base Upper16</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper 16 bits of the supported I/O base address when 32-bit I/O addressing is used. The lower 16 bits are assumed to be 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IO Base Upper16</em>' attribute.
	 * @see #setIOBaseUpper16(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PCIBridge_IOBaseUpper16()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getIOBaseUpper16();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PCIBridge#getIOBaseUpper16 <em>IO Base Upper16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IO Base Upper16</em>' attribute.
	 * @see #getIOBaseUpper16()
	 * @generated
	 */
	void setIOBaseUpper16(Integer value);

} // CIM_PCIBridge

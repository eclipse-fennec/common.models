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
 * A representation of the model object '<em><b>CIM Physical Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PhysicalMemory is a subclass of CIM_Chip, representing low level memory devices - SIMMS, DIMMs, raw memory chips, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getMemoryFormFactor <em>Memory Form Factor</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getMemoryType <em>Memory Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getTotalWidth <em>Total Width</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getDataWidth <em>Data Width</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getBankLabel <em>Bank Label</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getPositionInRow <em>Position In Row</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getInterleavePosition <em>Interleave Position</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getConfiguredMemoryClockSpeed <em>Configured Memory Clock Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getIsSpeedInMhz <em>Is Speed In Mhz</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getMaxMemorySpeed <em>Max Memory Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getCapability_BlockAccessiblePersistentMemory <em>Capability Block Accessible Persistent Memory</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getCapability_ByteAccessiblePersistentMemory <em>Capability Byte Accessible Persistent Memory</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getCapability_VolatileMemory <em>Capability Volatile Memory</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getFirmwareVersion <em>Firmware Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getMemorySubsystemControllerManufacturerID <em>Memory Subsystem Controller Manufacturer ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getMemorySubsystemControllerProductID <em>Memory Subsystem Controller Product ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getMemoryTechnology <em>Memory Technology</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getModuleManufacturerID <em>Module Manufacturer ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalMemory#getModuleProductID <em>Module Product ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.56.0' ClassConstraint='[\"inv:self.IsSpeedInMhz=true implies self.Speed = 0 and self.MaxMemorySpeed &gt; 0\",\"inv:self.IsSpeedInMhz=false implies self.MaxMemorySpeed=null\"]' UMLPackagePath='CIM::Physical::Component' override.FormFactor='uint16' override.FormFactor.Deprecated='[\"CIM_PhysicalMemory.MemoryFormFactor\"]' override.FormFactor.MappingStrings='[\"MIF.DMTF|Memory Device|005.6\"]' keys='Tag,CreationClassName'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalMemory extends CIM_Chip {
	/**
	 * Returns the value of the '<em><b>Memory Form Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The form factor for the physical memory being described
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Form Factor</em>' attribute.
	 * @see #setMemoryFormFactor(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_MemoryFormFactor()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20..255\"]' Values='[\"Other\",\"Unknown\",\"SIMM\",\"SIP\",\"Chip\",\"DIP\",\"ZIP\",\"Propriatary Card\",\"DIMM\",\"TSOP\",\"Row of Chips\",\"RIMM\",\"SODIMM\",\"SRIMM\",\"FB-DIMM\",\"Die\",\"CAMM\",\"CUDIMM\",\"CSODIMM\",\"DMTF Reserved\"]' MappingStrings='[\"MIF.DMTF|Memory Device|005.8\"]'"
	 * @generated
	 */
	Integer getMemoryFormFactor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getMemoryFormFactor <em>Memory Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Form Factor</em>' attribute.
	 * @see #getMemoryFormFactor()
	 * @generated
	 */
	void setMemoryFormFactor(Integer value);

	/**
	 * Returns the value of the '<em><b>Memory Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of PhysicalMemory. Synchronous DRAM is also known as SDRAM Cache DRAM is also known as CDRAM CDRAM is also known as Cache DRAM SDRAM is also known as Synchronous DRAM BRAM is also known as Block RAM
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Type</em>' attribute.
	 * @see #setMemoryType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_MemoryType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38..32567\",\"32568..65535\"]' Values='[\"Unknown\",\"Other\",\"DRAM\",\"Synchronous DRAM\",\"Cache DRAM\",\"EDO\",\"EDRAM\",\"VRAM\",\"SRAM\",\"RAM\",\"ROM\",\"Flash\",\"EEPROM\",\"FEPROM\",\"EPROM\",\"CDRAM\",\"3DRAM\",\"SDRAM\",\"SGRAM\",\"RDRAM\",\"DDR\",\"DDR-2\",\"BRAM\",\"FB-DIMM\",\"DDR3\",\"FBD2\",\"DDR4\",\"LPDDR\",\"LPDDR2\",\"LPDDR3\",\"LPDDR4\",\"Logical non-volatile device\",\"HBM\",\"HBM2\",\"DDR5\",\"LPDDR5\",\"HBM3\",\"MRDIMM\",\"DMTF Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"MIF.DMTF|Memory Device|005.9\"]'"
	 * @generated
	 */
	Integer getMemoryType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getMemoryType <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Type</em>' attribute.
	 * @see #getMemoryType()
	 * @generated
	 */
	void setMemoryType(Integer value);

	/**
	 * Returns the value of the '<em><b>Total Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total width, in bits, of the PhysicalMemory, including check or error correction bits. If there are no error correction bits, the value in this property should match that specified for DataWidth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Width</em>' attribute.
	 * @see #setTotalWidth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_TotalWidth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Bits' MappingStrings='[\"MIF.DMTF|Memory Device|005.7\"]'"
	 * @generated
	 */
	Integer getTotalWidth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getTotalWidth <em>Total Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Width</em>' attribute.
	 * @see #getTotalWidth()
	 * @generated
	 */
	void setTotalWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Data Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data width of the PhysicalMemory, in bits. A data width of 0 and a TotalWidth of 8 would indicate that the Memory is solely used to provide error correction bits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Width</em>' attribute.
	 * @see #setDataWidth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_DataWidth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Bits' MappingStrings='[\"MIF.DMTF|Memory Device|005.8\"]'"
	 * @generated
	 */
	Integer getDataWidth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getDataWidth <em>Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Width</em>' attribute.
	 * @see #getDataWidth()
	 * @generated
	 */
	void setDataWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The speed of the PhysicalMemory, in nanoseconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_Speed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='NanoSeconds' MappingStrings='[\"MIF.DMTF|Memory Device|005.24\"]' ModelCorrespondence='[\"CIM_PhysicalMemory.MaxMemorySpeed\",\"CIM_PhysicalMemory.IsSpeedInMHz\"]'"
	 * @generated
	 */
	Long getSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total capacity of this PhysicalMemory, in bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_Capacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"MIF.DMTF|Memory Device|005.5\"]'"
	 * @generated
	 */
	Long getCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(Long value);

	/**
	 * Returns the value of the '<em><b>Bank Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string identifying the physically labeled bank where the Memory is located - for example, 'Bank 0' or 'Bank A'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bank Label</em>' attribute.
	 * @see #setBankLabel(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_BankLabel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' MappingStrings='[\"MIF.DMTF|Memory Device|005.4\"]'"
	 * @generated
	 */
	String getBankLabel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getBankLabel <em>Bank Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank Label</em>' attribute.
	 * @see #getBankLabel()
	 * @generated
	 */
	void setBankLabel(String value);

	/**
	 * Returns the value of the '<em><b>Position In Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the position of the PhysicalMemory in a 'row'. For example, if it takes two 8-bit memory devices to form a 16- bit row, then a value of '2'means that this Memory is the second device. 0 is an invalid value for this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position In Row</em>' attribute.
	 * @see #setPositionInRow(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_PositionInRow()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIF.DMTF|Memory Device Mapped Addresses|001.6\"]'"
	 * @generated
	 */
	Long getPositionInRow();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getPositionInRow <em>Position In Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position In Row</em>' attribute.
	 * @see #getPositionInRow()
	 * @generated
	 */
	void setPositionInRow(Long value);

	/**
	 * Returns the value of the '<em><b>Interleave Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The position of this PhysicalMemory in an interleave. 0 indicates non-interleaved. 1 indicates the first position, 2 the second position and so on. For example, in a 2:1 interleave, a value of '1' would indicate that the Memory is in the 'even' position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interleave Position</em>' attribute.
	 * @see #setInterleavePosition(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_InterleavePosition()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIF.DMTF|Memory Device Mapped Addresses|001.7\"]'"
	 * @generated
	 */
	Long getInterleavePosition();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getInterleavePosition <em>Interleave Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interleave Position</em>' attribute.
	 * @see #getInterleavePosition()
	 * @generated
	 */
	void setInterleavePosition(Long value);

	/**
	 * Returns the value of the '<em><b>Configured Memory Clock Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The configured clock speed (in MHz) of PhysicalMemory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configured Memory Clock Speed</em>' attribute.
	 * @see #setConfiguredMemoryClockSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_ConfiguredMemoryClockSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MegaHertz'"
	 * @generated
	 */
	Long getConfiguredMemoryClockSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getConfiguredMemoryClockSpeed <em>Configured Memory Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configured Memory Clock Speed</em>' attribute.
	 * @see #getConfiguredMemoryClockSpeed()
	 * @generated
	 */
	void setConfiguredMemoryClockSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Is Speed In Mhz</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IsSpeedInMHz property is used to indicate if the Speed property or the MaxMemorySpeed contains the value of the memory speed. A value of TRUE shall indicate that the speed is represented by the MaxMemorySpeed property. A value of FALSE shall indicate that the speed is represented by the Speed property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Speed In Mhz</em>' attribute.
	 * @see #setIsSpeedInMhz(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_IsSpeedInMhz()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_PhysicalMemory.Speed\",\"CIM_PhysicalMemory.MaxMemorySpeed\"]'"
	 * @generated
	 */
	Boolean getIsSpeedInMhz();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getIsSpeedInMhz <em>Is Speed In Mhz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Speed In Mhz</em>' attribute.
	 * @see #getIsSpeedInMhz()
	 * @generated
	 */
	void setIsSpeedInMhz(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Memory Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum speed (in MHz) of PhysicalMemory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Memory Speed</em>' attribute.
	 * @see #setMaxMemorySpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_MaxMemorySpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='MegaHertz' ModelCorrespondence='[\"CIM_PhysicalMemory.Speed\",\"CIM_PhysicalMemory.IsSpeedInMHz\"]'"
	 * @generated
	 */
	Long getMaxMemorySpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getMaxMemorySpeed <em>Max Memory Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Memory Speed</em>' attribute.
	 * @see #getMaxMemorySpeed()
	 * @generated
	 */
	void setMaxMemorySpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Capability Block Accessible Persistent Memory</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is this memory device capabale of supporting "Block Accessible Persistent Memory" memory operating mode?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Block Accessible Persistent Memory</em>' attribute.
	 * @see #setCapability_BlockAccessiblePersistentMemory(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_Capability_BlockAccessiblePersistentMemory()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCapability_BlockAccessiblePersistentMemory();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getCapability_BlockAccessiblePersistentMemory <em>Capability Block Accessible Persistent Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Block Accessible Persistent Memory</em>' attribute.
	 * @see #getCapability_BlockAccessiblePersistentMemory()
	 * @generated
	 */
	void setCapability_BlockAccessiblePersistentMemory(Boolean value);

	/**
	 * Returns the value of the '<em><b>Capability Byte Accessible Persistent Memory</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is this memory device capabale of supporting "Byte Accessible Persistent Memory" memory operating mode?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Byte Accessible Persistent Memory</em>' attribute.
	 * @see #setCapability_ByteAccessiblePersistentMemory(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_Capability_ByteAccessiblePersistentMemory()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCapability_ByteAccessiblePersistentMemory();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getCapability_ByteAccessiblePersistentMemory <em>Capability Byte Accessible Persistent Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Byte Accessible Persistent Memory</em>' attribute.
	 * @see #getCapability_ByteAccessiblePersistentMemory()
	 * @generated
	 */
	void setCapability_ByteAccessiblePersistentMemory(Boolean value);

	/**
	 * Returns the value of the '<em><b>Capability Volatile Memory</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is this memory device capabale of supporting "Volatile Memory" memory operating mode?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Volatile Memory</em>' attribute.
	 * @see #setCapability_VolatileMemory(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_Capability_VolatileMemory()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCapability_VolatileMemory();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getCapability_VolatileMemory <em>Capability Volatile Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability Volatile Memory</em>' attribute.
	 * @see #getCapability_VolatileMemory()
	 * @generated
	 */
	void setCapability_VolatileMemory(Boolean value);

	/**
	 * Returns the value of the '<em><b>Firmware Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Firmware version for this memory device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Firmware Version</em>' attribute.
	 * @see #setFirmwareVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_FirmwareVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getFirmwareVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getFirmwareVersion <em>Firmware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmware Version</em>' attribute.
	 * @see #getFirmwareVersion()
	 * @generated
	 */
	void setFirmwareVersion(String value);

	/**
	 * Returns the value of the '<em><b>Memory Subsystem Controller Manufacturer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Memory Subsystem Controller Manufacturer ID indicates the vendor of the memory subsystem controller. This field shall be set to the value of the SPD Memory Subsystem Controller Manufacturer ID Code. Refer to JEDEC Standard JEP106AU for the list of manufacturer IDs. A value of 0000h indicates the Memory Subsystem Controller Manufacturer ID is unknown.
	 * Note that the location (byte addresses) of the SPD Memory Subsystem Controller Manufacturer ID Code may vary and is defined by the memory type/technology SPD Standard. For example, for NVDIMM-N DDR4, this field will have the first byte corresponds to the value in byte 194 and the second byte corresponds to the value in byte 195.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Subsystem Controller Manufacturer ID</em>' attribute.
	 * @see #setMemorySubsystemControllerManufacturerID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_MemorySubsystemControllerManufacturerID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMemorySubsystemControllerManufacturerID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getMemorySubsystemControllerManufacturerID <em>Memory Subsystem Controller Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Subsystem Controller Manufacturer ID</em>' attribute.
	 * @see #getMemorySubsystemControllerManufacturerID()
	 * @generated
	 */
	void setMemorySubsystemControllerManufacturerID(Integer value);

	/**
	 * Returns the value of the '<em><b>Memory Subsystem Controller Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Memory Subsystem Controller Product ID is the identifier of the memory subsystem controller, which is assigned by the vendor of the memory subsystem controller. This field shall be set to the value of the SPD Memory Subsystem Controller Product Identifier. A value of 0000h indicates the Memory Subsystem Controller Product ID is unknown.
	 * Note that the location (byte addresses) of the SPD Memory Subsystem Controller Product Identifier may vary and is defined by the memory type/technology SPD Standard. For example, for NVDIMM-N DDR4, this field will have the first byte corresponds to the value in byte 196 and the second byte corresponds to the value in byte 197.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Subsystem Controller Product ID</em>' attribute.
	 * @see #setMemorySubsystemControllerProductID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_MemorySubsystemControllerProductID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMemorySubsystemControllerProductID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getMemorySubsystemControllerProductID <em>Memory Subsystem Controller Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Subsystem Controller Product ID</em>' attribute.
	 * @see #getMemorySubsystemControllerProductID()
	 * @generated
	 */
	void setMemorySubsystemControllerProductID(Integer value);

	/**
	 * Returns the value of the '<em><b>Memory Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The memory technology type for this memory device. For example, NVDIMM-N on DDR4.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Technology</em>' attribute.
	 * @see #setMemoryTechnology(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_MemoryTechnology()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Reserved\",\"Other\",\"Unknown\",\"DRAM\",\"NVDIMM-N\",\"NVDIMM-F\",\"NVDIMM-P\",\"Intel(R) Optane(TM) persistent memory\",\"MRDIMM\"]'"
	 * @generated
	 */
	Integer getMemoryTechnology();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getMemoryTechnology <em>Memory Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Technology</em>' attribute.
	 * @see #getMemoryTechnology()
	 * @generated
	 */
	void setMemoryTechnology(Integer value);

	/**
	 * Returns the value of the '<em><b>Module Manufacturer ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Module Manufacturer ID indicates the manufacturer of the memory device. This field shall be set to the value of the SPD Module Manufacturer ID Code. Refer to JEDEC Standard JEP106AU for the list of manufacturer IDs. A value of 0000h indicates the Module Manufacture ID is unknown.
	 * Note that the location (byte addresses) of the SPD Module Manufacturer ID Code may vary and is defined by the memory type/technology SPD Standard. For example, for NVDIMM-N DDR4, this field will have the first byte corresponds to the value in byte 320 and the second byte corresponds to the value in byte 321.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Manufacturer ID</em>' attribute.
	 * @see #setModuleManufacturerID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_ModuleManufacturerID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getModuleManufacturerID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getModuleManufacturerID <em>Module Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Manufacturer ID</em>' attribute.
	 * @see #getModuleManufacturerID()
	 * @generated
	 */
	void setModuleManufacturerID(Integer value);

	/**
	 * Returns the value of the '<em><b>Module Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Module Product ID is the identifier of the memory device, which is assigned by the manufacturer of the memory device. This field shall be set to the value of the SPD Module Product Identifier. A value of 0000h indicates the Module Product ID is unknown.
	 * Note that the location (byte addresses) of the SPD Module Product Identifier may vary and is defined by the memory type/technology SPD Standard. For example, for NVDIMM-N DDR4, this field will have the first byte corresponds to the value in byte 192 and the second byte corresponds to the value in byte 193.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Module Product ID</em>' attribute.
	 * @see #setModuleProductID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalMemory_ModuleProductID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getModuleProductID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalMemory#getModuleProductID <em>Module Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Product ID</em>' attribute.
	 * @see #getModuleProductID()
	 * @generated
	 */
	void setModuleProductID(Integer value);

} // CIM_PhysicalMemory

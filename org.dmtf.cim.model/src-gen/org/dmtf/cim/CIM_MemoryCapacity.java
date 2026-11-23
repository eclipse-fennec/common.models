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
 * A representation of the model object '<em><b>CIM Memory Capacity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MemoryCapacity describes the type of Memory that can be installed on a PhysicalElement and its minimum/maximum configurations. Information on what memory is currently 'installed', versus an Element's min/max requirements, is located in instances of the PhysicalMemory class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MemoryCapacity#getMemoryType <em>Memory Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryCapacity#getMinimumMemoryCapacity <em>Minimum Memory Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemoryCapacity#getMaximumMemoryCapacity <em>Maximum Memory Capacity</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MemoryCapacity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::Physical::Misc' override.Name='string' override.Name.Key='true' override.Name.Description='The inherited Name serves as a part of the MemoryCapacity object key.' keys='Name,MemoryType'"
 * @generated
 */
@ProviderType
public interface CIM_MemoryCapacity extends CIM_PhysicalCapacity {
	/**
	 * Returns the value of the '<em><b>Memory Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of memory. This is a part of the object key. Values correspond to the list of possible memory types in the PhysicalMemory class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Type</em>' attribute.
	 * @see #setMemoryType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryCapacity_MemoryType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Key='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37..32567\",\"32568..65535\"]' Values='[\"Unknown\",\"Other\",\"DRAM\",\"Synchronous DRAM\",\"Cache DRAM\",\"EDO\",\"EDRAM\",\"VRAM\",\"SRAM\",\"RAM\",\"ROM\",\"Flash\",\"EEPROM\",\"FEPROM\",\"EPROM\",\"CDRAM\",\"3DRAM\",\"SDRAM\",\"SGRAM\",\"RDRAM\",\"DDR\",\"DDR-2\",\"BRAM\",\"FB-DIMM\",\"DDR3\",\"FBD2\",\"DDR4\",\"LPDDR\",\"LPDDR2\",\"LPDDR3\",\"LPDDR4\",\"Logical non-volatile device\",\"HBM\",\"HBM2\",\"DDR5\",\"LPDDR5\",\"HBM3\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_PhysicalMemory.MemoryType\"]'"
	 * @generated
	 */
	Integer getMemoryType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryCapacity#getMemoryType <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Type</em>' attribute.
	 * @see #getMemoryType()
	 * @generated
	 */
	void setMemoryType(Integer value);

	/**
	 * Returns the value of the '<em><b>Minimum Memory Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum amount of memory, in Kbytes, that is needed for the associated PhysicalElement to operate correctly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Memory Capacity</em>' attribute.
	 * @see #setMinimumMemoryCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryCapacity_MinimumMemoryCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getMinimumMemoryCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryCapacity#getMinimumMemoryCapacity <em>Minimum Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Memory Capacity</em>' attribute.
	 * @see #getMinimumMemoryCapacity()
	 * @generated
	 */
	void setMinimumMemoryCapacity(Long value);

	/**
	 * Returns the value of the '<em><b>Maximum Memory Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum amount of memory, in Kbytes, that can be supported by the associated PhysicalElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Memory Capacity</em>' attribute.
	 * @see #setMaximumMemoryCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemoryCapacity_MaximumMemoryCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' PUnit='byte * 2^10'"
	 * @generated
	 */
	Long getMaximumMemoryCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemoryCapacity#getMaximumMemoryCapacity <em>Maximum Memory Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Memory Capacity</em>' attribute.
	 * @see #getMaximumMemoryCapacity()
	 * @generated
	 */
	void setMaximumMemoryCapacity(Long value);

} // CIM_MemoryCapacity

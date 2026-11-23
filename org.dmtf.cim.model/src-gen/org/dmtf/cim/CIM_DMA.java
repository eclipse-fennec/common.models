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
 * A representation of the model object '<em><b>CIM DMA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Personal computer architecture DMA.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DMA#getCSCreationClassName <em>CS Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DMA#getCSName <em>CS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DMA#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DMA#getDMAChannel <em>DMA Channel</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DMA#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DMA#getBurstMode <em>Burst Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DMA#getTransferWidths <em>Transfer Widths</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DMA#getAddressSize <em>Address Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DMA#getMaxTransferSize <em>Max Transfer Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DMA#getByteMode <em>Byte Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DMA#getWordMode <em>Word Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DMA#getChannelTiming <em>Channel Timing</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DMA#getTypeCTiming <em>Type CTiming</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DMA()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::System::SystemResources' keys='CSCreationClassName,CSName,CreationClassName,DMAChannel'"
 * @generated
 */
@ProviderType
public interface CIM_DMA extends CIM_SystemResource {
	/**
	 * Returns the value of the '<em><b>CS Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ComputerSystem's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #setCSCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DMA_CSCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_ComputerSystem.CreationClassName'"
	 * @generated
	 */
	String getCSCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DMA#getCSCreationClassName <em>CS Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS Creation Class Name</em>' attribute.
	 * @see #getCSCreationClassName()
	 * @generated
	 */
	void setCSCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>CS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ComputerSystem's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CS Name</em>' attribute.
	 * @see #setCSName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DMA_CSName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_ComputerSystem.Name'"
	 * @generated
	 */
	String getCSName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DMA#getCSName <em>CS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CS Name</em>' attribute.
	 * @see #getCSName()
	 * @generated
	 */
	void setCSName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DMA_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DMA#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>DMA Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A part of the object's key value, the DMA Channel number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DMA Channel</em>' attribute.
	 * @see #setDMAChannel(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DMA_DMAChannel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Key='true' MappingStrings='[\"MIF.DMTF|DMA|001.1\"]'"
	 * @generated
	 */
	Long getDMAChannel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DMA#getDMAChannel <em>DMA Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMA Channel</em>' attribute.
	 * @see #getDMAChannel()
	 * @generated
	 */
	void setDMAChannel(Long value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Availability of the DMA.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability</em>' attribute.
	 * @see #setAvailability(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DMA_Availability()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"Unknown\",\"Available\",\"In Use/Not Available\",\"In Use and Available/Shareable\"]' MappingStrings='[\"MIF.DMTF|DMA|001.2\"]'"
	 * @generated
	 */
	Integer getAvailability();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DMA#getAvailability <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' attribute.
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(Integer value);

	/**
	 * Returns the value of the '<em><b>Burst Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication that the DMA Channel supports burst mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Burst Mode</em>' attribute.
	 * @see #setBurstMode(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DMA_BurstMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIF.DMTF|DMA|001.3\"]'"
	 * @generated
	 */
	Boolean getBurstMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DMA#getBurstMode <em>Burst Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Burst Mode</em>' attribute.
	 * @see #getBurstMode()
	 * @generated
	 */
	void setBurstMode(Boolean value);

	/**
	 * Returns the value of the '<em><b>Transfer Widths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array indicating all the transfer widths (in bits) supported by this DMA Channel. Permissible values are 8, 16, 32, 64 or 128 bits. If unknown, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transfer Widths</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DMA_TransferWidths()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Units='Bits' ValueMap='[\"0\",\"8\",\"16\",\"32\",\"64\",\"128\"]' MappingStrings='[\"MIF.DMTF|System Resource DMA Info|001.2\"]' PUnit='bit'"
	 * @generated
	 */
	EList<Integer> getTransferWidths();

	/**
	 * Returns the value of the '<em><b>Address Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer indicating the DMA Channel address size in bits. Permissible values are 8, 16, 32 or 64 bits. If unknown, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Size</em>' attribute.
	 * @see #setAddressSize(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DMA_AddressSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Bits' ValueMap='[\"0\",\"8\",\"16\",\"32\",\"64\"]' MappingStrings='[\"MIF.DMTF|System Resource DMA Info|001.3\"]' PUnit='bit'"
	 * @generated
	 */
	Integer getAddressSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DMA#getAddressSize <em>Address Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Size</em>' attribute.
	 * @see #getAddressSize()
	 * @generated
	 */
	void setAddressSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Transfer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of bytes that can be transferred by this DMA Channel. If unknown, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Transfer Size</em>' attribute.
	 * @see #setMaxTransferSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DMA_MaxTransferSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bytes' MappingStrings='[\"MIF.DMTF|System Resource DMA Info|001.4\"]' PUnit='byte'"
	 * @generated
	 */
	Long getMaxTransferSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DMA#getMaxTransferSize <em>Max Transfer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Transfer Size</em>' attribute.
	 * @see #getMaxTransferSize()
	 * @generated
	 */
	void setMaxTransferSize(Long value);

	/**
	 * Returns the value of the '<em><b>Byte Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether DMA may execute in 'count by byte' mode (value=4) or not (value=3). Also, "Other" (1) and "Unknown" (2) may be defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Byte Mode</em>' attribute.
	 * @see #setByteMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DMA_ByteMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Unknown\",\"Not execute in \'count by byte\' mode\",\"Execute in \'count by byte\' mode\"]' MappingStrings='[\"MIF.DMTF|System Resource DMA Info|001.7\"]'"
	 * @generated
	 */
	Integer getByteMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DMA#getByteMode <em>Byte Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Mode</em>' attribute.
	 * @see #getByteMode()
	 * @generated
	 */
	void setByteMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Word Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether DMA may execute in 'count by word' mode (value=4) or not (value=3). Also, "Other" (1) and "Unknown" (2) may be defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Word Mode</em>' attribute.
	 * @see #setWordMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DMA_WordMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Unknown\",\"Not execute in \'count by word\' mode\",\"Execute in \'count by word\' mode\"]' MappingStrings='[\"MIF.DMTF|System Resource DMA Info|001.8\"]'"
	 * @generated
	 */
	Integer getWordMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DMA#getWordMode <em>Word Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word Mode</em>' attribute.
	 * @see #getWordMode()
	 * @generated
	 */
	void setWordMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Channel Timing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DMA channel timing. For example, "Type A" (value =4) or "Type F" (6) could be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel Timing</em>' attribute.
	 * @see #setChannelTiming(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DMA_ChannelTiming()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"Unknown\",\"ISA Compatible\",\"Type A\",\"Type B\",\"Type F\"]' MappingStrings='[\"MIF.DMTF|System Resource DMA Info|001.9\"]'"
	 * @generated
	 */
	Integer getChannelTiming();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DMA#getChannelTiming <em>Channel Timing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Timing</em>' attribute.
	 * @see #getChannelTiming()
	 * @generated
	 */
	void setChannelTiming(Integer value);

	/**
	 * Returns the value of the '<em><b>Type CTiming</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether C type (burst) timing is supported (value=5) or not (value=4). Also, "Other" (1), "Unknown" (2) and "ISA Compatible" (3) are defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type CTiming</em>' attribute.
	 * @see #setTypeCTiming(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DMA_TypeCTiming()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"Unknown\",\"ISA Compatible\",\"Not Supported\",\"Supported\"]' MappingStrings='[\"MIF.DMTF|System Resource DMA Info|001.10\"]'"
	 * @generated
	 */
	Integer getTypeCTiming();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DMA#getTypeCTiming <em>Type CTiming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type CTiming</em>' attribute.
	 * @see #getTypeCTiming()
	 * @generated
	 */
	void setTypeCTiming(Integer value);

} // CIM_DMA

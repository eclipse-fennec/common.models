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
 * A representation of the model object '<em><b>CIM Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of Memory-related LogicalDevices.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Memory#getVolatile <em>Volatile</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Memory#getStartingAddress <em>Starting Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Memory#getEndingAddress <em>Ending Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Memory#getErrorInfo <em>Error Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Memory#getOtherErrorDescription <em>Other Error Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Memory#getCorrectableError <em>Correctable Error</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Memory#getErrorTime <em>Error Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Memory#getErrorAccess <em>Error Access</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Memory#getErrorTransferSize <em>Error Transfer Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Memory#getErrorData <em>Error Data</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Memory#getErrorDataOrder <em>Error Data Order</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Memory#getErrorAddress <em>Error Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Memory#getSystemLevelAddress <em>System Level Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Memory#getErrorResolution <em>Error Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Memory#getAdditionalErrorData <em>Additional Error Data</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Memory()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Device::Memory' override.ErrorMethodology='string' override.ErrorMethodology.Description='ErrorMethodology for Memory is a string property that indicates whether parity or CRC algorithms, ECC or other mechanisms are used. Details on the algorithm can also be supplied.' override.ErrorMethodology.MappingStrings='[\"MIF.DMTF|Physical Memory Array|001.7\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_Memory extends CIM_StorageExtent {
	/**
	 * Returns the value of the '<em><b>Volatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Volatile is a property that indicates whether this memory is volatile or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volatile</em>' attribute.
	 * @see #setVolatile(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Memory_Volatile()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getVolatile();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Memory#getVolatile <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatile</em>' attribute.
	 * @see #getVolatile()
	 * @generated
	 */
	void setVolatile(Boolean value);

	/**
	 * Returns the value of the '<em><b>Starting Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The beginning address, referenced by an application or operating system and mapped by a memory controller, for this Memory object. The starting address is specified in KBytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starting Address</em>' attribute.
	 * @see #setStartingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Memory_StartingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"MIF.DMTF|Memory Array Mapped Addresses|001.3\",\"MIF.DMTF|Memory Device Mapped Addresses|001.4\"]' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getStartingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Memory#getStartingAddress <em>Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Address</em>' attribute.
	 * @see #getStartingAddress()
	 * @generated
	 */
	void setStartingAddress(Long value);

	/**
	 * Returns the value of the '<em><b>Ending Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ending address, referenced by an application or operating system and mapped by a memory controller, for this Memory object. The ending address is specified in KBytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ending Address</em>' attribute.
	 * @see #setEndingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Memory_EndingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='KiloBytes' MappingStrings='[\"MIF.DMTF|Memory Array Mapped Addresses|001.4\",\"MIF.DMTF|Memory Device Mapped Addresses|001.5\"]' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getEndingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Memory#getEndingAddress <em>Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending Address</em>' attribute.
	 * @see #getEndingAddress()
	 * @generated
	 */
	void setEndingAddress(Long value);

	/**
	 * Returns the value of the '<em><b>Error Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer enumeration describing the type of error that occurred most recently. For example, single (value=6) or double bit errors (7) can be specified using this property. The values, 12-14, are undefined in the CIM Schema since in DMI, they mix the semantics of the type of error and whether it was correctable or not. The latter is indicated in the property, CorrectableError.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Info</em>' attribute.
	 * @see #setErrorInfo(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Memory_ErrorInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_MemoryError.ErrorInfo\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\"]' Values='[\"Other\",\"Unknown\",\"OK\",\"Bad Read\",\"Parity Error\",\"Single-Bit Error\",\"Double-Bit Error\",\"Multi-Bit Error\",\"Nibble Error\",\"Checksum Error\",\"CRC Error\",\"Undefined\",\"Undefined\",\"Undefined\"]' MappingStrings='[\"MIF.DMTF|Memory Device|005.12\",\"MIF.DMTF|Physical Memory Array|001.8\"]' ModelCorrespondence='[\"CIM_Memory.OtherErrorDescription\"]'"
	 * @generated
	 */
	Integer getErrorInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Memory#getErrorInfo <em>Error Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Info</em>' attribute.
	 * @see #getErrorInfo()
	 * @generated
	 */
	void setErrorInfo(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Error Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free form string providing more information if the Error Type property is set to 1, "Other". If not set to 1, this string has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Error Description</em>' attribute.
	 * @see #setOtherErrorDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Memory_OtherErrorDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_MemoryError.OtherErrorDescription\"]' ModelCorrespondence='[\"CIM_Memory.ErrorInfo\"]'"
	 * @generated
	 */
	String getOtherErrorDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Memory#getOtherErrorDescription <em>Other Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Error Description</em>' attribute.
	 * @see #getOtherErrorDescription()
	 * @generated
	 */
	void setOtherErrorDescription(String value);

	/**
	 * Returns the value of the '<em><b>Correctable Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the most recent error was correctable. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Correctable Error</em>' attribute.
	 * @see #setCorrectableError(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Memory_CorrectableError()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_MemoryError.CorrectableError\"]' MappingStrings='[\"MIF.DMTF|Physical Memory Array|001.8\"]'"
	 * @generated
	 */
	Boolean getCorrectableError();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Memory#getCorrectableError <em>Correctable Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correctable Error</em>' attribute.
	 * @see #getCorrectableError()
	 * @generated
	 */
	void setCorrectableError(Boolean value);

	/**
	 * Returns the value of the '<em><b>Error Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that the last memory error occurred. The type of error is described by the ErrorInfo property. If the Error Info property is equal to 3, "OK", then this property has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Time</em>' attribute.
	 * @see #setErrorTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Memory_ErrorTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Deprecated='[\"CIM_MemoryError.ErrorTime\"]'"
	 * @generated
	 */
	String getErrorTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Memory#getErrorTime <em>Error Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Time</em>' attribute.
	 * @see #getErrorTime()
	 * @generated
	 */
	void setErrorTime(String value);

	/**
	 * Returns the value of the '<em><b>Error Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer enumeration indicating the memory access operation that caused the last error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Access</em>' attribute.
	 * @see #setErrorAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Memory_ErrorAccess()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_MemoryError.ErrorAccess\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"Unknown\",\"Read\",\"Write\",\"Partial Write\"]' MappingStrings='[\"MIF.DMTF|Physical Memory Array|001.10\"]'"
	 * @generated
	 */
	Integer getErrorAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Memory#getErrorAccess <em>Error Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Access</em>' attribute.
	 * @see #getErrorAccess()
	 * @generated
	 */
	void setErrorAccess(Integer value);

	/**
	 * Returns the value of the '<em><b>Error Transfer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the data transfer in bits that caused the last error. 0 indicates no error. If the ErrorInfo property is equal to 3, "OK", then this property should be set to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Transfer Size</em>' attribute.
	 * @see #setErrorTransferSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Memory_ErrorTransferSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_MemoryError.ErrorTransferSize\"]' Units='Bits' MappingStrings='[\"MIF.DMTF|Physical Memory Array|001.11\"]' PUnit='bit'"
	 * @generated
	 */
	Long getErrorTransferSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Memory#getErrorTransferSize <em>Error Transfer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Transfer Size</em>' attribute.
	 * @see #getErrorTransferSize()
	 * @generated
	 */
	void setErrorTransferSize(Long value);

	/**
	 * Returns the value of the '<em><b>Error Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data captured during the last erroneous mebmory access. The data occupies the first n octets of the array necessary to hold the number of bits specified by the ErrorTransferSize property. If ErrorTransferSize is 0, then this property has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Data</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Memory_ErrorData()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Deprecated='[\"CIM_MemoryError.ErrorData\"]' Octetstring='true' ArrayType='Indexed' MappingStrings='[\"MIF.DMTF|Physical Memory Array|001.12\"]'"
	 * @generated
	 */
	EList<Integer> getErrorData();

	/**
	 * Returns the value of the '<em><b>Error Data Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordering for data stored in the ErrorData property. "Least Significant Byte First" (value=1) or "Most Significant Byte First" (2) can be specified. If ErrorTransferSize is 0, then this property has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Data Order</em>' attribute.
	 * @see #setErrorDataOrder(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Memory_ErrorDataOrder()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_MemoryError.ErrorDataOrder\"]' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Least Significant Byte First\",\"Most Significant Byte First\"]'"
	 * @generated
	 */
	Integer getErrorDataOrder();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Memory#getErrorDataOrder <em>Error Data Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Data Order</em>' attribute.
	 * @see #getErrorDataOrder()
	 * @generated
	 */
	void setErrorDataOrder(Integer value);

	/**
	 * Returns the value of the '<em><b>Error Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the address of the last memory error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Address</em>' attribute.
	 * @see #setErrorAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Memory_ErrorAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_MemoryError.StartingAddress\"]' MappingStrings='[\"MIF.DMTF|Memory Device|005.19\",\"MIF.DMTF|Physical Memory Array|001.14\"]'"
	 * @generated
	 */
	Long getErrorAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Memory#getErrorAddress <em>Error Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Address</em>' attribute.
	 * @see #getErrorAddress()
	 * @generated
	 */
	void setErrorAddress(Long value);

	/**
	 * Returns the value of the '<em><b>System Level Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the address information in the property, ErrorAddress, is a system-level address (TRUE) or a physical address (FALSE). If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Level Address</em>' attribute.
	 * @see #setSystemLevelAddress(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Memory_SystemLevelAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_MemoryError.SystemLevelAddress\"]'"
	 * @generated
	 */
	Boolean getSystemLevelAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Memory#getSystemLevelAddress <em>System Level Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Level Address</em>' attribute.
	 * @see #getSystemLevelAddress()
	 * @generated
	 */
	void setSystemLevelAddress(Boolean value);

	/**
	 * Returns the value of the '<em><b>Error Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the range, in bytes, to which the last error can be resolved. For example, if error addresses are resolved to bit 11 (ie, on a typical page basis), then errors can be resolved to 4K boundaries and this property is set to 4000. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Resolution</em>' attribute.
	 * @see #setErrorResolution(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Memory_ErrorResolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_MemoryError.ErrorResolution\"]' Units='Bytes' MappingStrings='[\"MIF.DMTF|Memory Device|005.21\",\"MIF.DMTF|Physical Memory Array|001.15\"]' PUnit='byte'"
	 * @generated
	 */
	Long getErrorResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Memory#getErrorResolution <em>Error Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Resolution</em>' attribute.
	 * @see #getErrorResolution()
	 * @generated
	 */
	void setErrorResolution(Long value);

	/**
	 * Returns the value of the '<em><b>Additional Error Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of octets holding additional error information. An example is ECC Syndrome or the return of the check bits if a CRC-based ErrorMethodology is used. In the latter case, if a single bit error is recognized and the CRC algorithm is known, it is possible to determine the exact bit that failed. This type of data (ECC Syndrome, Check Bit or Parity Bit data, or other vendor supplied information) is included in this field. If the ErrorInfo property is equal to 3, "OK", then AdditionalErrorData has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Error Data</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Memory_AdditionalErrorData()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Deprecated='[\"CIM_MemoryError.AdditionalErrorData\"]' Octetstring='true' MappingStrings='[\"MIF.DMTF|Memory Device|005.18\",\"MIF.DMTF|Physical Memory Array|001.13\"]'"
	 * @generated
	 */
	EList<Integer> getAdditionalErrorData();

} // CIM_Memory

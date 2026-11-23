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
 * A representation of the model object '<em><b>CIM Cache Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of Cache Memory. Cache memory is dedicated or allocated RAM that a Processor searches first for data, before going to 'regular' memory. CacheMemory is used to speed up the delivery of data to a Processor. It is usually described by its closeness to the Processor (for example, Primary or Secondary Cache). 
 * If a DiskDrive includes RAM allocated for holding the disk's most recently read and/or adjacent data (in order to speed up retrieval), this also would be modeled as CacheMemory. Note that CacheMemory is NOT operating system or application level buffers but actual RAM allocated for caching data for a Processor, from a hard disk, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CacheMemory#getLevel <em>Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CacheMemory#getWritePolicy <em>Write Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CacheMemory#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CacheMemory#getLineSize <em>Line Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CacheMemory#getReplacementPolicy <em>Replacement Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CacheMemory#getReadPolicy <em>Read Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CacheMemory#getFlushTimer <em>Flush Timer</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CacheMemory#getAssociativity <em>Associativity</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CacheMemory()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_AssociatedCacheMemory\"]' Version='2.8.0' UMLPackagePath='CIM::Device::Memory' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_CacheMemory extends CIM_Memory {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether this is the Primary (value=3), Secondary (value=4) or Tertiary (value=5) Cache. Also, "Other" (1), "Unknown" (2) and "Not Applicable" (6) can be defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CacheMemory_Level()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_AssociatedCacheMemory.Level\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"Unknown\",\"Primary\",\"Secondary\",\"Tertiary\",\"Not Applicable\"]' MappingStrings='[\"MIF.DMTF|System Cache|006.2\"]'"
	 * @generated
	 */
	Integer getLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CacheMemory#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Integer value);

	/**
	 * Returns the value of the '<em><b>Write Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether this is write-back (value=3) or write-through (value=4) Cache, or whether this information "Varies with Address" (5) or is defined individually for each I/O (6). Also, "Other" (1) and "Unknown" (2) can be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Policy</em>' attribute.
	 * @see #setWritePolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CacheMemory_WritePolicy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_AssociatedCacheMemory.WritePolicy\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"Unknown\",\"Write Back\",\"Write Through\",\"Varies with Address\",\"Determination Per I/O\"]' MappingStrings='[\"MIF.DMTF|System Cache|006.5\"]'"
	 * @generated
	 */
	Integer getWritePolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CacheMemory#getWritePolicy <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Policy</em>' attribute.
	 * @see #getWritePolicy()
	 * @generated
	 */
	void setWritePolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Cache Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether this is for instruction caching (value=3), data caching (value=4) or both (value=5, "Unified"). Also, "Other" (1) and "Unknown" (2) can be defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cache Type</em>' attribute.
	 * @see #setCacheType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CacheMemory_CacheType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_AssociatedCacheMemory.CacheType\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"Unknown\",\"Instruction\",\"Data\",\"Unified\"]' MappingStrings='[\"MIF.DMTF|System Cache|006.9\"]'"
	 * @generated
	 */
	Integer getCacheType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CacheMemory#getCacheType <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Type</em>' attribute.
	 * @see #getCacheType()
	 * @generated
	 */
	void setCacheType(Integer value);

	/**
	 * Returns the value of the '<em><b>Line Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size, in bytes, of a single cache bucket or line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Size</em>' attribute.
	 * @see #setLineSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CacheMemory_LineSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_AssociatedCacheMemory.LineSize\"]' Units='Bytes' MappingStrings='[\"MIF.DMTF|System Cache|006.10\"]' PUnit='byte'"
	 * @generated
	 */
	Long getLineSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CacheMemory#getLineSize <em>Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Size</em>' attribute.
	 * @see #getLineSize()
	 * @generated
	 */
	void setLineSize(Long value);

	/**
	 * Returns the value of the '<em><b>Replacement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer enumeration describing the algorithm to determine which cache lines or buckets should be re-used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replacement Policy</em>' attribute.
	 * @see #setReplacementPolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CacheMemory_ReplacementPolicy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_AssociatedCacheMemory.ReplacementPolicy\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Other\",\"Unknown\",\"Least Recently Used (LRU)\",\"First In First Out (FIFO)\",\"Last In First Out (LIFO)\",\"Least Frequently Used (LFU)\",\"Most Frequently Used (MFU)\",\"Data Dependent Multiple Algorithms\"]' MappingStrings='[\"MIF.DMTF|System Cache|006.12\"]'"
	 * @generated
	 */
	Integer getReplacementPolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CacheMemory#getReplacementPolicy <em>Replacement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Policy</em>' attribute.
	 * @see #getReplacementPolicy()
	 * @generated
	 */
	void setReplacementPolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Read Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Policy that shall be employed by the Cache for handling read requests. For example, "Read", "Read-Ahead" or both can be specified using the values, 3, 4 or 5, respectively. If the read policy is determined individually (ie, for each request), then the value 6 ("Determination per I/O") should be specified. "Other" (1) and "Unknown" (2) are also valid values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Policy</em>' attribute.
	 * @see #setReadPolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CacheMemory_ReadPolicy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_AssociatedCacheMemory.ReadPolicy\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"Unknown\",\"Read\",\"Read-Ahead\",\"Read and Read-Ahead\",\"Determination Per I/O\"]' MappingStrings='[\"MIF.DMTF|System Cache|006.13\"]'"
	 * @generated
	 */
	Integer getReadPolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CacheMemory#getReadPolicy <em>Read Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Policy</em>' attribute.
	 * @see #getReadPolicy()
	 * @generated
	 */
	void setReadPolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Flush Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum amount of time, in seconds, dirty lines or buckets may remain in the Cache before they are flushed. A value of zero indicated that a cache flush is not controlled by a flushing timer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flush Timer</em>' attribute.
	 * @see #setFlushTimer(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CacheMemory_FlushTimer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_AssociatedCacheMemory.FlushTimer\"]' Units='Seconds' MappingStrings='[\"MIF.DMTF|System Cache|006.14\"]' PUnit='second'"
	 * @generated
	 */
	Long getFlushTimer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CacheMemory#getFlushTimer <em>Flush Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flush Timer</em>' attribute.
	 * @see #getFlushTimer()
	 * @generated
	 */
	void setFlushTimer(Long value);

	/**
	 * Returns the value of the '<em><b>Associativity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An integer enumeration defining the system cache associativity. For example, 6 indicates a fully associative cache.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Associativity</em>' attribute.
	 * @see #setAssociativity(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CacheMemory_Associativity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_AssociatedCacheMemory.Associativity\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Other\",\"Unknown\",\"Direct Mapped\",\"2-way Set-Associative\",\"4-way Set-Associative\",\"Fully Associative\",\"8-way Set-Associative\",\"16-way Set-Associative\"]' MappingStrings='[\"MIF.DMTF|System Cache|006.15\"]'"
	 * @generated
	 */
	Integer getAssociativity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CacheMemory#getAssociativity <em>Associativity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associativity</em>' attribute.
	 * @see #getAssociativity()
	 * @generated
	 */
	void setAssociativity(Integer value);

} // CIM_CacheMemory

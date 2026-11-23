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
 * A representation of the model object '<em><b>CIM Associated Cache Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates that the Memory provides Cache to the Dependent Logical Element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getLevel <em>Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getOtherLevelDescription <em>Other Level Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getWritePolicy <em>Write Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getOtherWritePolicyDescription <em>Other Write Policy Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getOtherCacheTypeDescription <em>Other Cache Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getLineSize <em>Line Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getReplacementPolicy <em>Replacement Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getOtherReplacementPolicyDescription <em>Other Replacement Policy Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getReadPolicy <em>Read Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getOtherReadPolicyDescription <em>Other Read Policy Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getFlushTimer <em>Flush Timer</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getAssociativity <em>Associativity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getOtherAssociativityDescription <em>Other Associativity Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCacheMemory()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.28.0' UMLPackagePath='CIM::Device::Memory' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedCacheMemory extends CIM_AssociatedMemory {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether this is the Primary (value=3), Secondary (value=4) or Tertiary (value=5) Cache. Also, "Other" (1), "Unknown" (0) and "Not Applicable" (2) can be defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCacheMemory_Level()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"Primary\",\"Secondary\",\"Tertiary\"]' MappingStrings='[\"MIF.DMTF|System Cache|006.2\"]' ModelCorrespondence='[\"CIM_AssociatedCacheMemory.OtherLevelDescription\"]'"
	 * @generated
	 */
	Integer getLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Level Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the cache level when the Level value is 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Level Description</em>' attribute.
	 * @see #setOtherLevelDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCacheMemory_OtherLevelDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AssociatedCacheMemory.Level\"]'"
	 * @generated
	 */
	String getOtherLevelDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getOtherLevelDescription <em>Other Level Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Level Description</em>' attribute.
	 * @see #getOtherLevelDescription()
	 * @generated
	 */
	void setOtherLevelDescription(String value);

	/**
	 * Returns the value of the '<em><b>Write Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether this is write-back (value=2) or write-through (value=3) Cache, or whether this information "Varies with Address" (4) or is defined individually for each I/O (5). Also, "Other" (1) and "Unknown" (0) can be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Policy</em>' attribute.
	 * @see #setWritePolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCacheMemory_WritePolicy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Write Back\",\"Write Through\",\"Varies with Address\",\"Determination Per I/O\"]' MappingStrings='[\"MIF.DMTF|System Cache|006.5\"]' ModelCorrespondence='[\"CIM_AssociatedCacheMemory.OtherWritePolicyDescription\"]'"
	 * @generated
	 */
	Integer getWritePolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getWritePolicy <em>Write Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Policy</em>' attribute.
	 * @see #getWritePolicy()
	 * @generated
	 */
	void setWritePolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Write Policy Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the Write Policy when the WritePolicy value is 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Write Policy Description</em>' attribute.
	 * @see #setOtherWritePolicyDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCacheMemory_OtherWritePolicyDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AssociatedCacheMemory.WritePolicy\"]'"
	 * @generated
	 */
	String getOtherWritePolicyDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getOtherWritePolicyDescription <em>Other Write Policy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Write Policy Description</em>' attribute.
	 * @see #getOtherWritePolicyDescription()
	 * @generated
	 */
	void setOtherWritePolicyDescription(String value);

	/**
	 * Returns the value of the '<em><b>Cache Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether this is for instruction caching (value=2), data caching (value=3) or both (value=4, "Unified"). Also, "Other" (1) and "Unknown" (0) can be defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cache Type</em>' attribute.
	 * @see #setCacheType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCacheMemory_CacheType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Instruction\",\"Data\",\"Unified\"]' MappingStrings='[\"MIF.DMTF|System Cache|006.9\"]' ModelCorrespondence='[\"CIM_AssociatedCacheMemory.OtherCacheTypeDescription\"]'"
	 * @generated
	 */
	Integer getCacheType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getCacheType <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Type</em>' attribute.
	 * @see #getCacheType()
	 * @generated
	 */
	void setCacheType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Cache Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the Cache Type when the CacheType value is 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Cache Type Description</em>' attribute.
	 * @see #setOtherCacheTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCacheMemory_OtherCacheTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AssociatedCacheMemory.CacheType\"]'"
	 * @generated
	 */
	String getOtherCacheTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getOtherCacheTypeDescription <em>Other Cache Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Cache Type Description</em>' attribute.
	 * @see #getOtherCacheTypeDescription()
	 * @generated
	 */
	void setOtherCacheTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Line Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size, in bytes, of a single cache bucket or line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Size</em>' attribute.
	 * @see #setLineSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCacheMemory_LineSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bytes' MappingStrings='[\"MIF.DMTF|System Cache|006.10\"]' PUnit='byte'"
	 * @generated
	 */
	Long getLineSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getLineSize <em>Line Size</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCacheMemory_ReplacementPolicy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Other\",\"Unknown\",\"Least Recently Used (LRU)\",\"First In First Out (FIFO)\",\"Last In First Out (LIFO)\",\"Least Frequently Used (LFU)\",\"Most Frequently Used (MFU)\",\"Data Dependent Multiple Algorithms\"]' MappingStrings='[\"MIF.DMTF|System Cache|006.12\"]' ModelCorrespondence='[\"CIM_AssociatedCacheMemory.OtherReplacementPolicyDescription\"]'"
	 * @generated
	 */
	Integer getReplacementPolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getReplacementPolicy <em>Replacement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement Policy</em>' attribute.
	 * @see #getReplacementPolicy()
	 * @generated
	 */
	void setReplacementPolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Replacement Policy Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the Cache replacement policy when the ReplacementPolicy value is 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Replacement Policy Description</em>' attribute.
	 * @see #setOtherReplacementPolicyDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCacheMemory_OtherReplacementPolicyDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AssociatedCacheMemory.ReplacementPolicy\"]'"
	 * @generated
	 */
	String getOtherReplacementPolicyDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getOtherReplacementPolicyDescription <em>Other Replacement Policy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Replacement Policy Description</em>' attribute.
	 * @see #getOtherReplacementPolicyDescription()
	 * @generated
	 */
	void setOtherReplacementPolicyDescription(String value);

	/**
	 * Returns the value of the '<em><b>Read Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Policy that shall be employed by the Cache for handling read requests. For example, "Read", "Read-Ahead" or both can be specified using the values, 2, 3 or 4, respectively. If the read policy is determined individually (ie, for each request), then the value 5 ("Determination per I/O") should be specified. "Other" (1) and "Unknown" (0) are also valid values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Policy</em>' attribute.
	 * @see #setReadPolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCacheMemory_ReadPolicy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Read\",\"Read-Ahead\",\"Read and Read-Ahead\",\"Determination Per I/O\"]' MappingStrings='[\"MIF.DMTF|System Cache|006.13\"]' ModelCorrespondence='[\"CIM_AssociatedCacheMemory.OtherReadPolicyDescription\"]'"
	 * @generated
	 */
	Integer getReadPolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getReadPolicy <em>Read Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Policy</em>' attribute.
	 * @see #getReadPolicy()
	 * @generated
	 */
	void setReadPolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Read Policy Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the read policy when the ReadPolicy value is 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Read Policy Description</em>' attribute.
	 * @see #setOtherReadPolicyDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCacheMemory_OtherReadPolicyDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AssociatedCacheMemory.ReadPolicy\"]'"
	 * @generated
	 */
	String getOtherReadPolicyDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getOtherReadPolicyDescription <em>Other Read Policy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Read Policy Description</em>' attribute.
	 * @see #getOtherReadPolicyDescription()
	 * @generated
	 */
	void setOtherReadPolicyDescription(String value);

	/**
	 * Returns the value of the '<em><b>Flush Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum amount of time, in seconds, dirty lines or buckets may remain in the Cache before they are flushed. A value of zero indicated that a cache flush is not controlled by a flushing timer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flush Timer</em>' attribute.
	 * @see #setFlushTimer(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCacheMemory_FlushTimer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' MappingStrings='[\"MIF.DMTF|System Cache|006.14\"]' PUnit='second'"
	 * @generated
	 */
	Long getFlushTimer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getFlushTimer <em>Flush Timer</em>}' attribute.
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
	 * An integer enumeration defining the system cache associativity. For example, 5 indicates a fully associative cache.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Associativity</em>' attribute.
	 * @see #setAssociativity(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCacheMemory_Associativity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\"]' Values='[\"Unknown\",\"Other\",\"Direct Mapped\",\"2-way Set-Associative\",\"4-way Set-Associative\",\"Fully Associative\",\"8-way Set-Associative\",\"16-way Set-Associative\",\"12-way Set Associative\",\"24-way Set Associative\",\"32-way Set Associative\",\"48-way Set Associative\",\"64-way Set Associative\",\"20-way Set Associative\"]' MappingStrings='[\"MIF.DMTF|System Cache|006.15\"]' ModelCorrespondence='[\"CIM_AssociatedCacheMemory.OtherAssociativityDescription\"]'"
	 * @generated
	 */
	Integer getAssociativity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getAssociativity <em>Associativity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associativity</em>' attribute.
	 * @see #getAssociativity()
	 * @generated
	 */
	void setAssociativity(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Associativity Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the cache associativity when the Associativity value is 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Associativity Description</em>' attribute.
	 * @see #setOtherAssociativityDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedCacheMemory_OtherAssociativityDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_AssociatedCacheMemory.Associativity\"]'"
	 * @generated
	 */
	String getOtherAssociativityDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedCacheMemory#getOtherAssociativityDescription <em>Other Associativity Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Associativity Description</em>' attribute.
	 * @see #getOtherAssociativityDescription()
	 * @generated
	 */
	void setOtherAssociativityDescription(String value);

} // CIM_AssociatedCacheMemory

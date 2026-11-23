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
 * A representation of the model object '<em><b>CIM Volatile Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of Volatile Storage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VolatileStorage#getCacheable <em>Cacheable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolatileStorage#getCacheType <em>Cache Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VolatileStorage()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_Memory\"]' Version='2.8.0' UMLPackagePath='CIM::Device::Memory' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_VolatileStorage extends CIM_Memory {
	/**
	 * Returns the value of the '<em><b>Cacheable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this Memory can be cached or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cacheable</em>' attribute.
	 * @see #setCacheable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolatileStorage_Cacheable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_AssociatedCacheMemory\"]' MappingStrings='[\"MIF.DMTF|System Resource Memory Info|002.5\"]'"
	 * @generated
	 */
	Boolean getCacheable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolatileStorage#getCacheable <em>Cacheable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cacheable</em>' attribute.
	 * @see #getCacheable()
	 * @generated
	 */
	void setCacheable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Cache Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the cache type that is compatible with this Memory. For example, 4 indicates write-through cache. If the Cacheable property is set to false, then this property does not have meaning and should be set to 5, "Not Applicable".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cache Type</em>' attribute.
	 * @see #setCacheType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolatileStorage_CacheType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_AssociatedCacheMemory.WritePolicy\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"Unknown\",\"Write-Back\",\"Write-Through\",\"Not Applicable\"]' MappingStrings='[\"MIF.DMTF|System Resource Memory Info|002.6\"]'"
	 * @generated
	 */
	Integer getCacheType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolatileStorage#getCacheType <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Type</em>' attribute.
	 * @see #getCacheType()
	 * @generated
	 */
	void setCacheType(Integer value);

} // CIM_VolatileStorage

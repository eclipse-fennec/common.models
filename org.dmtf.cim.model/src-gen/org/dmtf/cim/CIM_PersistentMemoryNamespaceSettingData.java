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
 * A representation of the model object '<em><b>CIM Persistent Memory Namespace Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PersistentMemoryNamespaceSettingData reflects the parameters specified during persistent memory namespace creation or modification that define the quality of service offered by the associated PersistentMemoryNamespace.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PersistentMemoryNamespaceSettingData#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PersistentMemoryNamespaceSettingData#getOptimize <em>Optimize</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PersistentMemoryNamespaceSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.47.0' UMLPackagePath='CIM::Device::ConfigurableMemory' override.ResourceType='uint16' override.ResourceType.Description='The type of resource this allocation setting represents. \n\"Storage Volume\" a logical block device. \n\"Byte Addressable Persistent Memory\" persistent memory accessible by load/store operations. \"Block Addressable Persistent Memory\" synthetic block device.' override.ResourceType.ValueMap='[\"0\",\"1\",\"32\",\"35\",\"36\",\"..\",\"0x8000..0xFFFF\"]' override.ResourceType.Values='[\"Unknown\",\"Other\",\"Storage Volume\",\"Byte Addressable Persistent Memory\",\"Block Addressable Persistent Memory\",\"DMTF reserved\",\"Vendor Reserved\"]' override.ResourceType.ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.OtherResourceType\",\"CIM_ResourceAllocationSettingData.ResourceSubType\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PersistentMemoryNamespaceSettingData extends CIM_ResourceAllocationSettingData {
	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of access supported for the namespace."Read" read access is supported. "Write" write access is supported. "Read/Write" read and write access is supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Type</em>' attribute.
	 * @see #setAccessType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PersistentMemoryNamespaceSettingData_AccessType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Unknown\",\"Read\",\"Write\",\"Read/Write\",\"DMTF reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getAccessType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PersistentMemoryNamespaceSettingData#getAccessType <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' attribute.
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(Integer value);

	/**
	 * Returns the value of the '<em><b>Optimize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes preferences relating to the allocation that can be described by flags
	 * "None" no specific optimizations requested. "Best Performance" Namespace optimized for best performance. "Smallest Size" Namespace optimized for smallest size. "Copy On Write" Namespace optimized for copy on write.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optimize</em>' attribute.
	 * @see #setOptimize(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PersistentMemoryNamespaceSettingData_Optimize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Unknown\",\"None\",\"Best Performance\",\"Smallest Size\",\"Copy On Write\",\"DMTF reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getOptimize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PersistentMemoryNamespaceSettingData#getOptimize <em>Optimize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimize</em>' attribute.
	 * @see #getOptimize()
	 * @generated
	 */
	void setOptimize(Integer value);

} // CIM_PersistentMemoryNamespaceSettingData

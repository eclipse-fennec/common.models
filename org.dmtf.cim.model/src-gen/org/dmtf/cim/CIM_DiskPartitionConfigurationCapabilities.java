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
 * A representation of the model object '<em><b>CIM Disk Partition Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DiskPartitionConfigurationCapabilities instances describe a partition style supported by the platform. An instance of this class is associated with a volume (or partition) when a partition table is installed (see DiskPartitionConfigurationService.SetPartitionStyle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities#getPartitionStyle <em>Partition Style</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities#getValidSubPartitionStyles <em>Valid Sub Partition Styles</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities#getOtherValidSubPartitionStyles <em>Other Valid Sub Partition Styles</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities#getMaxNumberOfPartitions <em>Max Number Of Partitions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities#getMaxCapacity <em>Max Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities#getOverlapAllowed <em>Overlap Allowed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities#getPartitionTableSize <em>Partition Table Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartitionConfigurationCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageExtents' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DiskPartitionConfigurationCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Partition Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The partition style (i.e partition table type) associated with this capabilities instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Partition Style</em>' attribute.
	 * @see #setPartitionStyle(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartitionConfigurationCapabilities_PartitionStyle()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"MBR\",\"GPT\",\"VTOC\"]'"
	 * @generated
	 */
	Integer getPartitionStyle();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities#getPartitionStyle <em>Partition Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Style</em>' attribute.
	 * @see #getPartitionStyle()
	 * @generated
	 */
	void setPartitionStyle(Integer value);

	/**
	 * Returns the value of the '<em><b>Valid Sub Partition Styles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some partitions can act as a container for other partitions. If sub partitions are not supported, this should be set to NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Valid Sub Partition Styles</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartitionConfigurationCapabilities_ValidSubPartitionStyles()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"MBR\",\"VTOC\",\"GPT\"]' ArrayType='Indexed'"
	 * @generated
	 */
	EList<Integer> getValidSubPartitionStyles();

	/**
	 * Returns the value of the '<em><b>Other Valid Sub Partition Styles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the partition style if the corresponding entry in ValidSubPartitionStyles is 'Other'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Valid Sub Partition Styles</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartitionConfigurationCapabilities_OtherValidSubPartitionStyles()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed'"
	 * @generated
	 */
	EList<String> getOtherValidSubPartitionStyles();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version number associated with this partition style.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartitionConfigurationCapabilities_Version()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Number Of Partitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of partitions that can be BasedOn the Underlying extent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Number Of Partitions</em>' attribute.
	 * @see #setMaxNumberOfPartitions(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartitionConfigurationCapabilities_MaxNumberOfPartitions()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true'"
	 * @generated
	 */
	Integer getMaxNumberOfPartitions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities#getMaxNumberOfPartitions <em>Max Number Of Partitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Partitions</em>' attribute.
	 * @see #getMaxNumberOfPartitions()
	 * @generated
	 */
	void setMaxNumberOfPartitions(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The largest partition size (in blocks) of this style supported on this platform.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Capacity</em>' attribute.
	 * @see #setMaxCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartitionConfigurationCapabilities_MaxCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Required='true' Units='Blocks' PUnit='count'"
	 * @generated
	 */
	Long getMaxCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities#getMaxCapacity <em>Max Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Capacity</em>' attribute.
	 * @see #getMaxCapacity()
	 * @generated
	 */
	void setMaxCapacity(Long value);

	/**
	 * Returns the value of the '<em><b>Overlap Allowed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The platform supports partitions with overlapping address ranges.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overlap Allowed</em>' attribute.
	 * @see #setOverlapAllowed(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartitionConfigurationCapabilities_OverlapAllowed()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Required='true'"
	 * @generated
	 */
	Boolean getOverlapAllowed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities#getOverlapAllowed <em>Overlap Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlap Allowed</em>' attribute.
	 * @see #getOverlapAllowed()
	 * @generated
	 */
	void setOverlapAllowed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Partition Table Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of block occupied by the partition table and other metadata. The effective block size for partitions is the StorageExtent's ConsumableBlocks minus this size.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Partition Table Size</em>' attribute.
	 * @see #setPartitionTableSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartitionConfigurationCapabilities_PartitionTableSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Required='true' Units='Blocks' ModelCorrespondence='[\"CIM_StorageExtent.ConsumableBlocks\"]' PUnit='count'"
	 * @generated
	 */
	Long getPartitionTableSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskPartitionConfigurationCapabilities#getPartitionTableSize <em>Partition Table Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Table Size</em>' attribute.
	 * @see #getPartitionTableSize()
	 * @generated
	 */
	void setPartitionTableSize(Long value);

	/**
	 * Returns the value of the '<em><b>Supported Synchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed synchronously. If an operation is included in this property then the underlying implementation is indicating that it supports the operation without the creation of a job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartitionConfigurationCapabilities_SupportedSynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"SetPartitionStyle\",\"CreateOrModifyPartition\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSynchronousActions();

} // CIM_DiskPartitionConfigurationCapabilities

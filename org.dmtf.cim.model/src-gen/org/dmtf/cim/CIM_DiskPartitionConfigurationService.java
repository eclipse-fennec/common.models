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
 * A representation of the model object '<em><b>CIM Disk Partition Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DiskPartitionConfigurationService provides methods for clients 
 * to configure DiskPartitions. 
 * 
 * The instrumentation MUST NOT instantiate instances of partitions (such as hidden, maintenance, or zero-length partitions) that are not intended for use by applications (filesystems, databases, ...). There are two reasons for this constraint. There are different system-specific ways to indicate whether or not a partition is hidden, in some cases, the starting/ending block information is invalid, but ignored. If these properties are exposed, clients will not have a way to determine which blocks are in use. The other reason is that typically the number of partitions is fixed in the underlying data structures (or grows by large, fixed-size chunks). Common practice is to have a one (or a few) partition per disk with many hidden partitions. Instantiating a lot of hidden partitions clutters up the model without value add. The methods of this service and the properties of DiskPartitionConfigurationCapabilities provide a view of partitions actually in use without requiring clients to understand system-specific details.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiskPartitionConfigurationService#getPartitioningSchemes <em>Partitioning Schemes</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartitionConfigurationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageExtents' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_DiskPartitionConfigurationService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Partitioning Schemes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the partitioning schemes supported by the platform. AIX and HP_UX do not allow partitions. Linux allows volumes with and without partitions, Solaris requires Partitions. No more than a single instance of this class MAY be instantiated on a system. If set to 'No partitions allowed' then the methods of this service are not available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Partitioning Schemes</em>' attribute.
	 * @see #setPartitioningSchemes(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartitionConfigurationService_PartitioningSchemes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"No partitions allowed\",\"Volumes may be partitioned or treated as whole\",\"Volumes must be partitioned\"]'"
	 * @generated
	 */
	Integer getPartitioningSchemes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskPartitionConfigurationService#getPartitioningSchemes <em>Partitioning Schemes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partitioning Schemes</em>' attribute.
	 * @see #getPartitioningSchemes()
	 * @generated
	 */
	void setPartitioningSchemes(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method installs a partition table on an extent of the specified partition style; creating an association between the extent and that capabilities instances referenced as method parameters. As a side effect, the consumable block size of the underlying extent is reduced by the block size of the metadata reserved by the partition table and associated metadata. This size is in the PartitionTableSize property of the associated DiskPartitionConfigurationCapabilities instance.
	 * @param Extent A reference to the extent (volume or partition) where this style (partition table) will be installed.
	 * @param PartitionStyle A reference to the DiskPartitionConfigurationCapabilities instance describing the desired partition style.
	 * <!-- end-model-doc -->
	 * @model ExtentAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF'" PartitionStyleAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DiskPartitionConfigurationCapabilities REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x1000\",\"0x1001\",\"0x1002\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Extent already has partition table\",\"Requested Extent too large\",\"Style not supported by Service\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long SetPartitionStyle(CIM_StorageExtent Extent, CIM_DiskPartitionConfigurationCapabilities PartitionStyle);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method creates a new partition if the Partition parameter is null or modifies the partition specified. If the starting and ending address parameters are null, the resulting partition will occupy the entire underlying extent. If the starting address is non-null and the ending address is null, the resulting partition will extend to the end of the underlying extent. 
	 * 
	 * If a partition is being created, a LogicalDisk instance is also created BasedOn the partition. The NumberOfBlocks and ComsumableBlocks properties MUST be the same value and MUST be common to the partition and LogicalDisk (since partition metadata is part of the partition table, not part of partitions). The StartingAddress of the LogicalDisk MUST be 0, the ConsumableBlocks of the LogicalDisk and partition MUST be the same, and the difference between the StartingAddress and EndingAddress of the partition and LogicalDisk must be the same - one less than ConsumableBlocks/NumberOfBlocks. 
	 * 
	 * The underlying extent MUST be associated to a capabilities class describing the installed partition style (partition table); this association is established using SetPartitionStyle().
	 * @param extent A reference to the underlying extent the partition is base on.
	 * @param StartingAddress The starting block number.
	 * @param EndingAddress The ending block number.
	 * @param DeviceFileName The platform-specific special file name to be assigned to the LogicalDisk instance BasedOn the new DiskPartition instance.
	 * @param Partition A reference an existing partition instance to modify or null to request a new partition.
	 * <!-- end-model-doc -->
	 * @model extentAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF'" StartingAddressAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'" EndingAddressAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'" DeviceFileNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" PartitionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_GenericDiskPartition REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x1000\",\"0x1001\",\"0x1002\",\"0x1003\",\"0x1004\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Overlap Not Supported\",\"No Available Partitions\",\"Specified partition not on specified extent\",\"Device File Name not valid\",\"LogicalDisk with different DeviceFileName exists\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateOrModifyPartition(CIM_StorageExtent extent, Long StartingAddress, Long EndingAddress, String DeviceFileName, CIM_GenericDiskPartition Partition);

} // CIM_DiskPartitionConfigurationService

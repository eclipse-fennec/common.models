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
 * A representation of the model object '<em><b>CIM Realizes Disk Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DiskPartitions can be directly realized on a PhysicalMedia. This is used to model the creation of Partitions on a raw SCSI or IDE drive, using the fdisk (DOS and Unix) or pdisk (Unix) command. The StartingAddress of the DiskPartition on the PhysicalMedia is also specified as a property of this relationship. An alternative is that Partitions can be BasedOn StorageVolumes, such as a VolumeSet or a Volume exposed by a hardware RAID cabinet. The latter relationship is modeled using the DiskPartitionBasedOnVolume association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RealizesDiskPartition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::StorageExtents' override.Antecedent='CIM_PhysicalMedia REF' override.Antecedent.Max='1' override.Antecedent.Description='The PhysicalMedia on which the Extent is realized.' override.Dependent='CIM_DiskPartition REF' override.Dependent.Description='The DiskPartition that is located on the Media.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RealizesDiskPartition extends CIM_RealizesExtent {
} // CIM_RealizesDiskPartition

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
 * A representation of the model object '<em><b>CIM Generic Disk Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DiskPartition is a presentation of a contiguous range of logical blocks that is identifiable by the Operating System by the associated DiskPartitionConfigurationCapabilities and by the properties of the subclasses of this class. 
 * 
 * Each concrete partition style (the subclasses of GenericDiskPartition) has some way of tracking a starting block number and either the ending block or number of blocks. CIM models this with the StartingAddress and EndingAddress properties of the BasedOn association between the partition and its underlying volume/extent. The NumberOfBlocks and ConsumableBlocks properties inherited from StorageExtent also need to be consistent or omitted by the instrumentation. Partition numbers are modeled as BasedOn.OrderIndex. 
 * 
 * Note that all the concrete DiskPartition instances BasedOn the same underlying extent) MUST share the same partition style (i.e. all must have the same subclass type). 
 * 
 * The abstract qualifier can not be used on this class because its superclass is not abstract. But instances of subclasses this class should be instantiated, not instances of GenericDiskPartition itself.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_GenericDiskPartition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageExtents' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_GenericDiskPartition extends CIM_MediaPartition {
} // CIM_GenericDiskPartition

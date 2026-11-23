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
 * A representation of the model object '<em><b>CIM Logical Disk Based On Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LogicalDisks can be BasedOn a DiskPartition. For example, a personal computer's C: drive may be located on a Partition on local PhysicalMedia. In this association of LogicalDisks to Partitions, note that the cardinality of the Antecedent, Disk Partition, is Max (1). This dictates that a LogicalDisk can not span more than one Partition. However, there are cases where this is true. When it occurs, the LogicalDisk is really based on some kind of RAID configuration (for example, a mirror or stripe set). In these scenarios, the LogicalDisk is more correctly BasedOn a StorageVolume. To prevent incorrectly using the LogicalDiskBasedOnPartition association, the Max (1) qualifier was put on the Antecedent reference to the DiskPartition.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDiskBasedOnPartition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::StorageExtents' override.Antecedent='CIM_GenericDiskPartition REF' override.Antecedent.Max='1' override.Antecedent.Description='The DiskPartition.' override.Dependent='CIM_LogicalDisk REF' override.Dependent.Description='The LogicalDisk which is built on the StorageExtent.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalDiskBasedOnPartition extends CIM_LogicalDiskBasedOnExtent {
} // CIM_LogicalDiskBasedOnPartition

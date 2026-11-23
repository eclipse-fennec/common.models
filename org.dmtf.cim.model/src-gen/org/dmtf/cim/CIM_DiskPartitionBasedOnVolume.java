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
 * A representation of the model object '<em><b>CIM Disk Partition Based On Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DiskPartitions should be BasedOn a single StorageVolume (for example, exposed by a hardware RAID cabinet), an SCC VolumeSet, or realized directly in PhysicalMedia. The first two relationships are made explicit in this association. The latter is conveyed by the RealizesDiskPartition association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartitionBasedOnVolume()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::StorageExtents' override.Antecedent='CIM_StorageVolume REF' override.Antecedent.Max='1' override.Antecedent.Description='The StorageVolume.' override.Dependent='CIM_DiskPartition REF' override.Dependent.Description='The DiskPartition which is built on the Volume.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_DiskPartitionBasedOnVolume extends CIM_BasedOn {
} // CIM_DiskPartitionBasedOnVolume

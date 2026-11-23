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
 * A representation of the model object '<em><b>CIM Logical Disk Based On Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LogicalDisks can be BasedOn a single StorageVolume, Memory (in the case of a RAM Disk), a DiskPartition or other StorageExtent. These relationships are made explicit in this association. Subclasses of the association, LogicalDiskBasedOn Partition and LogicalDiskBasedOnVolume, detail the 'typical' semantics.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDiskBasedOnExtent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::StorageExtents' override.Antecedent='CIM_StorageExtent REF' override.Antecedent.Max='1' override.Antecedent.Description='The StorageExtent.' override.Dependent='CIM_LogicalDisk REF' override.Dependent.Description='The LogicalDisk which is built on the StorageExtent.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalDiskBasedOnExtent extends CIM_BasedOn {
} // CIM_LogicalDiskBasedOnExtent

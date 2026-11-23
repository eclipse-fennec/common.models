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
 * A representation of the model object '<em><b>CIM Extent In Disk Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ExtentInDiskGroup defines the StorageExtents that are located within and restricted by the Group.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ExtentInDiskGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.10.0' UMLPackagePath='CIM::Device::DiskGroup' override.Collection='CIM_DiskGroup REF' override.Collection.Aggregate='true' override.Collection.Max='1' override.Collection.Description='The DiskGroup. An Extent is defined within at most one DiskGroup.' override.Member='CIM_StorageExtent REF' override.Member.Description='The StorageExtent that is restricted by and participating in the Group.' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_ExtentInDiskGroup extends CIM_CollectedMSEs {
} // CIM_ExtentInDiskGroup

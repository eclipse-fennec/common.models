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
 * A representation of the model object '<em><b>CIM Drive In Disk Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_DriveInDiskGroup defines the DiskDrives that participate in the Group.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DriveInDiskGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.10.0' UMLPackagePath='CIM::Device::DiskGroup' override.Collection='CIM_DiskGroup REF' override.Collection.Aggregate='true' override.Collection.Max='1' override.Collection.Description='The DiskGroup. A Drive is a member of at most one DiskGroup.' override.Member='CIM_DiskDrive REF' override.Member.Description='The DiskDrive in the Group.' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_DriveInDiskGroup extends CIM_CollectedMSEs {
} // CIM_DriveInDiskGroup

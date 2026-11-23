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
 * A representation of the model object '<em><b>CIM Installed Partition Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association describes the attributes of a partition table installed in an extent. The attributes are in the capabilities class.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_InstalledPartitionTable()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::StorageExtents' override.Antecedent='CIM_DiskPartitionConfigurationCapabilities REF' override.Antecedent.Key='true' override.Antecedent.Max='1' override.Antecedent.Description='The DiskPartitionConfigurationCapabilities describing the capabilities of partitions based on this extent.' override.Dependent='CIM_StorageExtent REF' override.Dependent.Key='true' override.Dependent.Description='The extent \'hosting\' the partitions \n.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_InstalledPartitionTable extends CIM_Dependency {
} // CIM_InstalledPartitionTable

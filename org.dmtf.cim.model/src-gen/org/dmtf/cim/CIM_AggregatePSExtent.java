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
 * A representation of the model object '<em><b>CIM Aggregate PS Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Similar to AggregatePExtent, this class is deprecated in lieu of the generic StorageExtent object and the ProtectedExtentBasedOn association. An AggregatePSExtent is used to model an SCC RAID implementation. AggregatePSExtents define the number of addressable logical blocks on a single storage device, excluding any logical blocks mapped as check data. This is an alternative grouping for ProtectedSpace Extents, when only summary information is needed or when automatic configuration is used.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AggregatePSExtent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_StorageExtent\",\"CIM_CompositeExtentBasedOn\"]' Version='2.7.0' UMLPackagePath='CIM::Device::SccExtents' override.NumberOfBlocks='uint64' override.NumberOfBlocks.Deprecated='[\"CIM_CompositeExtentBasedOn.NumberOfBlocks\",\"CIM_StorageExtent.NumberOfBlocks\"]' override.NumberOfBlocks.Description='Total number of user data blocks that are contained in this Extent.' override.NumberOfBlocks.MappingStrings='[\"MIF.DMTF|Aggregate Protected Space Extent|001.2\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_AggregatePSExtent extends CIM_StorageExtent {
} // CIM_AggregatePSExtent

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
 * A representation of the model object '<em><b>CIM Aggregate PExtent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is deprecated in lieu of the generic StorageExtent object and the ProtectedExtentBasedOn association. An AggregatePExtent is used to model an SCC RAID implementation. AggregatePExtents provide summary information about the addressable logical blocks which are in the same StorageRedundancyGroup and reside on the same storage device. This is an alternative grouping for PhysicalExtents, when only summary information is needed or when automatic configuration is used.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AggregatePExtent#getBlocksOfCheckData <em>Blocks Of Check Data</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AggregatePExtent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_StorageExtent\",\"CIM_CompositeExtentBasedOn\"]' Version='2.7.0' UMLPackagePath='CIM::Device::SccExtents' override.NumberOfBlocks='uint64' override.NumberOfBlocks.Deprecated='[\"CIM_CompositeExtentBasedOn.NumberOfBlocks\",\"CIM_StorageExtent.NumberOfBlocks\"]' override.NumberOfBlocks.Description='Total number of blocks (including the check data blocks) contained in this AggregatePExtent. The block size (an inherited property) should be set to the same value as for the MediaAccessDevice associated with this Extent.' override.NumberOfBlocks.MappingStrings='[\"MIF.DMTF|Aggregate Physical Extent|001.2\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_AggregatePExtent extends CIM_StorageExtent {
	/**
	 * Returns the value of the '<em><b>Blocks Of Check Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of blocks contained in this AggregatePExtent to be used as check data. If this AggregatePExtent is available, then this value shall be zero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blocks Of Check Data</em>' attribute.
	 * @see #setBlocksOfCheckData(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AggregatePExtent_BlocksOfCheckData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_CompositeExtentBasedOn.UnitsOfCheckData\"]' MappingStrings='[\"MIF.DMTF|Aggregate Physical Extent|001.3\"]'"
	 * @generated
	 */
	Long getBlocksOfCheckData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AggregatePExtent#getBlocksOfCheckData <em>Blocks Of Check Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocks Of Check Data</em>' attribute.
	 * @see #getBlocksOfCheckData()
	 * @generated
	 */
	void setBlocksOfCheckData(Long value);

} // CIM_AggregatePExtent

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
 * A representation of the model object '<em><b>CIM Protected Space Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Deprecated - use CIM_ProtectedExtentBasedOn or CIM_CompositeExtentBasedOn instead. The information on check and user data is better expressed in the association that layers the storage, than in the extent itself. A ProtectedSpaceExtent is used to model an SCC RAID implementation. ProtectedSpaceExtent defines addressable logical block addresses, treated as a single Extent, located on one or more PhysicalExtents. ProtectedSpaceExtents exclude any logical blocks mapped as check data and contain user data stripe depth mapping information. An alternate possibility, if automatic configuration is used, is to instantiate or extend the AggregatePSExtent class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProtectedSpaceExtent#getUserDataStripeDepth <em>User Data Stripe Depth</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProtectedSpaceExtent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_ProtectedExtentBasedOn\",\"CIM_CompositeExtentBasedOn\"]' Version='2.7.0' UMLPackagePath='CIM::Device::SccExtents' override.BlockSize='uint64' override.BlockSize.Deprecated='[\"CIM_CompositeExtentBasedOn.BlockSize\",\"CIM_ProtectedExtentBasedOn.BlockSize\"]' override.BlockSize.MappingStrings='[\"MIF.DMTF|Protected Space Extent|001.4\"]' override.NumberOfBlocks='uint64' override.NumberOfBlocks.Deprecated='[\"CIM_CompositeExtentBasedOn.NumberOfBlocks\",\"CIM_ProtectedExtentBasedOn.NumberOfBlocks\"]' override.NumberOfBlocks.Description='The number of user data blocks contained in this Extent.' override.NumberOfBlocks.MappingStrings='[\"MIF.DMTF|Protected Space Extent|001.3\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_ProtectedSpaceExtent extends CIM_StorageExtent {
	/**
	 * Returns the value of the '<em><b>User Data Stripe Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a ProtectedSpaceExtent that is allocated to a Volume Set (i.e. is named in a CIM_VolumeSetBasedOnPSExtent association), this property is the number of user data bytes placed on this ProtectedSpaceExtent before moving on to the next ProtectedSpaceExtent in the VolumeSet. Otherwise, this ProtectedSpaceExtent is considered to be unallocated, and this property shall be set to zero (0h.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Data Stripe Depth</em>' attribute.
	 * @see #setUserDataStripeDepth(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtectedSpaceExtent_UserDataStripeDepth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_CompositeExtentBasedOn.UserDataStripeDepth\"]' Units='Bytes' MappingStrings='[\"MIF.DMTF|Protected Space Extent|001.6\"]' PUnit='byte'"
	 * @generated
	 */
	Long getUserDataStripeDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtectedSpaceExtent#getUserDataStripeDepth <em>User Data Stripe Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data Stripe Depth</em>' attribute.
	 * @see #getUserDataStripeDepth()
	 * @generated
	 */
	void setUserDataStripeDepth(Long value);

} // CIM_ProtectedSpaceExtent

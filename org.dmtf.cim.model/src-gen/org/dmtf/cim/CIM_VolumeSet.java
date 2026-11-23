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
 * A representation of the model object '<em><b>CIM Volume Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * VolumeSet is deprecated in lieu of CompositeExtent, which removes the restriction that the Set must be exported. A VolumeSet can be used to model an SCC RAID implementation. VolumeSets represent a contiguous range of logical blocks presented to the operating environment. VolumeSets may overlap. However, the underlying PhysicalExtents within the overlap shall not contain any check data. They are BasedOn one or more ProtectedSpaceExtents. These BasedOn associations should be instantiated or subclassed as needed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VolumeSet#getPSExtentStripeLength <em>PS Extent Stripe Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeSet#getPSExtentInterleaveDepth <em>PS Extent Interleave Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VolumeSet#getVolumeStatus <em>Volume Status</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VolumeSet()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_CompositeExtent\"]' Version='2.7.0' UMLPackagePath='CIM::Device::SccExtents' override.NumberOfBlocks='uint64' override.NumberOfBlocks.Deprecated='[\"CIM_CompositeExtent.NumberOfBlocks\"]' override.NumberOfBlocks.MappingStrings='[\"MIF.DMTF|Volume Set|001.3\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_VolumeSet extends CIM_StorageVolume {
	/**
	 * Returns the value of the '<em><b>PS Extent Stripe Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of contiguous ProtectedSpaceExtents counted before looping back to the first ProtectedSpaceExtent of the current stripe. It is the number of Extents forming the user data stripe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PS Extent Stripe Length</em>' attribute.
	 * @see #setPSExtentStripeLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeSet_PSExtentStripeLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_CompositeExtent.ExtentStripeLength\"]' MappingStrings='[\"MIF.DMTF|Volume Set|001.4\"]'"
	 * @generated
	 */
	Long getPSExtentStripeLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeSet#getPSExtentStripeLength <em>PS Extent Stripe Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PS Extent Stripe Length</em>' attribute.
	 * @see #getPSExtentStripeLength()
	 * @generated
	 */
	void setPSExtentStripeLength(Long value);

	/**
	 * Returns the value of the '<em><b>PS Extent Interleave Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of ProtectedSpaceExtents to stripe as a collective set. In SCC, this value is defined as the number of stripes to count before continuing to map into the next contiguous set of Extents, beyond the current stripe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PS Extent Interleave Depth</em>' attribute.
	 * @see #setPSExtentInterleaveDepth(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeSet_PSExtentInterleaveDepth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_CompositeExtent.ExtentInterleaveDepth\"]' MappingStrings='[\"MIF.DMTF|Volume Set|001.5\"]'"
	 * @generated
	 */
	Long getPSExtentInterleaveDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeSet#getPSExtentInterleaveDepth <em>PS Extent Interleave Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PS Extent Interleave Depth</em>' attribute.
	 * @see #getPSExtentInterleaveDepth()
	 * @generated
	 */
	void setPSExtentInterleaveDepth(Long value);

	/**
	 * Returns the value of the '<em><b>Volume Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VolumeSets in SCC have additional status information beyond that captured in the Availability and other properties, inherited from ManagedSystemElement. This additional information (for example, "Protection Disabled", value=9) is captured in the VolumeStatus property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Status</em>' attribute.
	 * @see #setVolumeStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VolumeSet_VolumeStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\"]' Values='[\"Other\",\"Unknown\",\"None/Not Applicable\",\"Broken\",\"Data Lost\",\"Dynamic Reconfig\",\"Exposed\",\"Fractionally Exposed\",\"Partially Exposed\",\"Protection Disabled\",\"Readying\",\"Rebuild\",\"Recalculate\",\"Spare in Use\",\"Verify In Progress\"]'"
	 * @generated
	 */
	Integer getVolumeStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VolumeSet#getVolumeStatus <em>Volume Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Status</em>' attribute.
	 * @see #getVolumeStatus()
	 * @generated
	 */
	void setVolumeStatus(Integer value);

} // CIM_VolumeSet

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
 * A representation of the model object '<em><b>CIM Physical Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Deprecated - use CIM_ProtectedExtentBasedOn or CIM_CompositeExtentBasedOn instead. The information on check and user data is better expressed in the association that layers the storage, than in the extent itself. A PhysicalExtent is used to model an SCC RAID implementation. It defines the consecutive addressable block addresses on a single storage device, that are treated as a single StorageExtent and that are in the same StorageRedundancyGroup. An alternate possibility, if automatic configuration is used, is to instantiate or extend the AggregatePExtent class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalExtent#getUnitsBeforeCheckDataInterleave <em>Units Before Check Data Interleave</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalExtent#getUnitsOfCheckData <em>Units Of Check Data</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PhysicalExtent#getUnitsOfUserData <em>Units Of User Data</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalExtent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_ProtectedExtentBasedOn\",\"CIM_CompositeExtentBasedOn\"]' Version='2.7.0' UMLPackagePath='CIM::Device::SccExtents' override.BlockSize='uint64' override.BlockSize.Deprecated='[\"CIM_CompositeExtentBasedOn.BlockSize\",\"CIM_ProtectedExtentBasedOn.BlockSize\"]' override.BlockSize.MappingStrings='[\"MIF.DMTF|Physical Extent|001.4\"]' override.NumberOfBlocks='uint64' override.NumberOfBlocks.Deprecated='[\"CIM_CompositeExtentBasedOn.NumberOfBlocks\",\"CIM_ProtectedExtentBasedOn.NumberOfBlocks\"]' override.NumberOfBlocks.MappingStrings='[\"MIF.DMTF|Physical Extent|001.3\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_PhysicalExtent extends CIM_StorageExtent {
	/**
	 * Returns the value of the '<em><b>Units Before Check Data Interleave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of bytes of user data to skip before starting the check data interleave.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units Before Check Data Interleave</em>' attribute.
	 * @see #setUnitsBeforeCheckDataInterleave(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalExtent_UnitsBeforeCheckDataInterleave()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_CompositeExtentBasedOn.UnitsBeforeCheckDataInterleave\",\"CIM_ProtectedExtentBasedOn.UnitsBeforeCheckDataInterleave\"]' Units='Bytes' MappingStrings='[\"MIF.DMTF|Physical Extent|001.6\"]' PUnit='byte'"
	 * @generated
	 */
	Long getUnitsBeforeCheckDataInterleave();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalExtent#getUnitsBeforeCheckDataInterleave <em>Units Before Check Data Interleave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units Before Check Data Interleave</em>' attribute.
	 * @see #getUnitsBeforeCheckDataInterleave()
	 * @generated
	 */
	void setUnitsBeforeCheckDataInterleave(Long value);

	/**
	 * Returns the value of the '<em><b>Units Of Check Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of bytes to be reserved for check data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units Of Check Data</em>' attribute.
	 * @see #setUnitsOfCheckData(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalExtent_UnitsOfCheckData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_CompositeExtentBasedOn.UnitsOfCheckData\",\"CIM_ProtectedExtentBasedOn.UnitsOfCheckData\"]' Units='Bytes' MappingStrings='[\"MIF.DMTF|Physical Extent|001.7\"]' PUnit='byte'"
	 * @generated
	 */
	Long getUnitsOfCheckData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalExtent#getUnitsOfCheckData <em>Units Of Check Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units Of Check Data</em>' attribute.
	 * @see #getUnitsOfCheckData()
	 * @generated
	 */
	void setUnitsOfCheckData(Long value);

	/**
	 * Returns the value of the '<em><b>Units Of User Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of bytes to be reserved for user data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units Of User Data</em>' attribute.
	 * @see #setUnitsOfUserData(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PhysicalExtent_UnitsOfUserData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_CompositeExtentBasedOn.UnitsOfUserData\",\"CIM_ProtectedExtentBasedOn.UnitsOfUserData\"]' Units='Bytes' MappingStrings='[\"MIF.DMTF|Physical Extent|001.8\"]' PUnit='byte'"
	 * @generated
	 */
	Long getUnitsOfUserData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PhysicalExtent#getUnitsOfUserData <em>Units Of User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units Of User Data</em>' attribute.
	 * @see #getUnitsOfUserData()
	 * @generated
	 */
	void setUnitsOfUserData(Long value);

} // CIM_PhysicalExtent

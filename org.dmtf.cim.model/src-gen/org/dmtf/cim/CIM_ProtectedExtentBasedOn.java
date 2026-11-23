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
 * A representation of the model object '<em><b>CIM Protected Extent Based On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Protected StorageExtents map to an underlying StorageExtent. This mapping includes information about the placement of check data on the underlying extent. The mapping is made explicit in this association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProtectedExtentBasedOn#getNumberOfBlocks <em>Number Of Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtectedExtentBasedOn#getBlockSize <em>Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtectedExtentBasedOn#getUnitsBeforeCheckDataInterleave <em>Units Before Check Data Interleave</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtectedExtentBasedOn#getUnitsOfCheckData <em>Units Of Check Data</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProtectedExtentBasedOn#getUnitsOfUserData <em>Units Of User Data</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProtectedExtentBasedOn()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Device::StorageExtents' override.Antecedent='CIM_StorageExtent REF' override.Antecedent.Description='The underlying StorageExtent.' override.Dependent='CIM_StorageExtent REF' override.Dependent.Description='The Protected Space is built on this StorageExtent.' override.StartingAddress='uint64' override.StartingAddress.Description='The starting logical block address of the underlying StorageExtent from which this protected StorageExtent is derived. In SCC, this is equivalent to the START LBA_P field in the Redundancy Group P_Extent Descriptor.' override.StartingAddress.MappingStrings='[\"MIF.DMTF|Physical Extent|001.2\"]' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ProtectedExtentBasedOn extends CIM_BasedOn {
	/**
	 * Returns the value of the '<em><b>Number Of Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the protected space. Note that this is limited by the Antecedent->NumberOfBlocks, but is included explicitly to provide for the DMTF MIF mapping. In SCC, this is equivalent to the NUMBER OF LBA_P(s) field in the Redundancy Group P_Extent Descriptor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Blocks</em>' attribute.
	 * @see #setNumberOfBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtectedExtentBasedOn_NumberOfBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"MIF.DMTF|Physical Extent|001.3\"]' ModelCorrespondence='[\"CIM_StorageExtent.NumberOfBlocks\"]'"
	 * @generated
	 */
	Long getNumberOfBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtectedExtentBasedOn#getNumberOfBlocks <em>Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Blocks</em>' attribute.
	 * @see #getNumberOfBlocks()
	 * @generated
	 */
	void setNumberOfBlocks(Long value);

	/**
	 * Returns the value of the '<em><b>Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The block size of the protected space. Note that this is limited by the Antecedent->BlockSize. In SCC, this is equivalent to the NUMBER OF BYTES PER LBA_P field in the Redundancy Group P_Extent Descriptor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Block Size</em>' attribute.
	 * @see #setBlockSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtectedExtentBasedOn_BlockSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"MIF.DMTF|Physical Extent|001.4\"]' ModelCorrespondence='[\"CIM_StorageExtent.BlockSize\"]' PUnit='byte'"
	 * @generated
	 */
	Long getBlockSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtectedExtentBasedOn#getBlockSize <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Size</em>' attribute.
	 * @see #getBlockSize()
	 * @generated
	 */
	void setBlockSize(Long value);

	/**
	 * Returns the value of the '<em><b>Units Before Check Data Interleave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of bytes of user data to skip before starting the check data interleave.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units Before Check Data Interleave</em>' attribute.
	 * @see #setUnitsBeforeCheckDataInterleave(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtectedExtentBasedOn_UnitsBeforeCheckDataInterleave()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"MIF.DMTF|Physical Extent|001.6\"]' PUnit='byte'"
	 * @generated
	 */
	Long getUnitsBeforeCheckDataInterleave();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtectedExtentBasedOn#getUnitsBeforeCheckDataInterleave <em>Units Before Check Data Interleave</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtectedExtentBasedOn_UnitsOfCheckData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"MIF.DMTF|Physical Extent|001.7\"]' PUnit='byte'"
	 * @generated
	 */
	Long getUnitsOfCheckData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtectedExtentBasedOn#getUnitsOfCheckData <em>Units Of Check Data</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_ProtectedExtentBasedOn_UnitsOfUserData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"MIF.DMTF|Physical Extent|001.8\"]' PUnit='byte'"
	 * @generated
	 */
	Long getUnitsOfUserData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProtectedExtentBasedOn#getUnitsOfUserData <em>Units Of User Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units Of User Data</em>' attribute.
	 * @see #getUnitsOfUserData()
	 * @generated
	 */
	void setUnitsOfUserData(Long value);

} // CIM_ProtectedExtentBasedOn

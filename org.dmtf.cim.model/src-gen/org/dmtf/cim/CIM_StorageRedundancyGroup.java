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
 * A representation of the model object '<em><b>CIM Storage Redundancy Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from RedundancyGroup containing mass storage-related redundancy information. StorageRedundancy Groups are used to protect user data. They act on one or more underlying StorageExtents, associated via ExtentRedundancyComponent and produce one or more protected StorageExtents that are associated to the underlying StorageExtents via ProtectedExtentBasedOn or CompositeExtentBasedOn. StorageRedundancyGroups may overlap. However, the underlying StorageExtents within the overlap should not contain any check data. 
 * The use of this class is being deprecated in lieu of using the StorageRedundancySet class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageRedundancyGroup#getTypeOfAlgorithm <em>Type Of Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageRedundancyGroup#getStorageRedundancy <em>Storage Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageRedundancyGroup#getIsStriped <em>Is Striped</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageRedundancyGroup#getIsConcatenated <em>Is Concatenated</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageRedundancyGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_StorageRedundancySet\"]' Version='2.13.0' UMLPackagePath='CIM::Core::Redundancy' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_StorageRedundancyGroup extends CIM_RedundancyGroup {
	/**
	 * Returns the value of the '<em><b>Type Of Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TypeOfAlgorithm specifies the algorithm used for data redundancy and reconstruction. For example, "P+Q" (value =5) or "P+S" (7) may be specified. The value of 0, is defined as "None" to indicate that data redundancy is not active. An inactive redundancy should only be instantiated if data striping or concatenation are active. These are indicated by the IsStriped or IsConcatentated boolean properties of this RedundancyGroup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Algorithm</em>' attribute.
	 * @see #setTypeOfAlgorithm(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageRedundancyGroup_TypeOfAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_StorageRedundancySet.TypeOfAlgorithm\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"None\",\"Other\",\"Unknown\",\"Copy\",\"XOR\",\"P+Q\",\"S\",\"P+S\"]' MappingStrings='[\"MIF.DMTF|Redundancy Group|001.2\"]'"
	 * @generated
	 */
	Integer getTypeOfAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageRedundancyGroup#getTypeOfAlgorithm <em>Type Of Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Algorithm</em>' attribute.
	 * @see #getTypeOfAlgorithm()
	 * @generated
	 */
	void setTypeOfAlgorithm(Integer value);

	/**
	 * Returns the value of the '<em><b>Storage Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StorageRedundancy provides additional information on the state of the RedundancyGroup, beyond the RedundancyStatus property. Information like "Reconfig In Progress" (value =1) or "Redundancy Disabled" can be specified using this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Redundancy</em>' attribute.
	 * @see #setStorageRedundancy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageRedundancyGroup_StorageRedundancy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"No Additional Status\",\"Reconfig In Progress\",\"Data Lost\",\"Not Currently Configured\",\"Protected Rebuild\",\"Redundancy Disabled\",\"Unprotected Rebuild\",\"Recalculating\",\"Verifying\"]'"
	 * @generated
	 */
	Integer getStorageRedundancy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageRedundancyGroup#getStorageRedundancy <em>Storage Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Redundancy</em>' attribute.
	 * @see #getStorageRedundancy()
	 * @generated
	 */
	void setStorageRedundancy(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Striped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the data is striped across the various StorageExtents in the Group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Striped</em>' attribute.
	 * @see #setIsStriped(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageRedundancyGroup_IsStriped()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_CompositeExtent.ExtentStripeLength\"]'"
	 * @generated
	 */
	Boolean getIsStriped();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageRedundancyGroup#getIsStriped <em>Is Striped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Striped</em>' attribute.
	 * @see #getIsStriped()
	 * @generated
	 */
	void setIsStriped(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Concatenated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the data is concatenated across the various StorageExtents in the Group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Concatenated</em>' attribute.
	 * @see #setIsConcatenated(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageRedundancyGroup_IsConcatenated()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_CompositeExtent.IsConcatenated\"]'"
	 * @generated
	 */
	Boolean getIsConcatenated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageRedundancyGroup#getIsConcatenated <em>Is Concatenated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Concatenated</em>' attribute.
	 * @see #getIsConcatenated()
	 * @generated
	 */
	void setIsConcatenated(Boolean value);

} // CIM_StorageRedundancyGroup

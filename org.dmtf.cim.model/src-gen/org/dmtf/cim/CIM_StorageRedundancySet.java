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
 * A representation of the model object '<em><b>CIM Storage Redundancy Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from RedundancySet describing storage-related redundancy information. StorageRedundancySets are used to protect user data. They aggregate one or more underlying StorageExtents, associated via MemberOfCollection, and produce one or more higher-level Extents. The Extents are related to each other via a BasedOn association. And, the higher level Extent is related to the StorageRedundancy Set via the LogicalIdentity association. 
 * Note that StorageRedundancySets may overlap in their aggregation of members. If this occurs, the overlapping Extents SHOULD NOT contain any check data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageRedundancySet#getTypeOfAlgorithm <em>Type Of Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageRedundancySet#getOtherAlgorithm <em>Other Algorithm</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageRedundancySet()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.1000' UMLPackagePath='CIM::Core::Redundancy' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageRedundancySet extends CIM_RedundancySet {
	/**
	 * Returns the value of the '<em><b>Type Of Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TypeOfAlgorithm specifies the algorithm used for storage data redundancy and reconstruction. For example, 'P+Q' (=5) or 'P+S' (=7) may be specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Algorithm</em>' attribute.
	 * @see #setTypeOfAlgorithm(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageRedundancySet_TypeOfAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"Other\",\"Copy\",\"XOR\",\"P+Q\",\"S\",\"P+S\"]' MappingStrings='[\"MIF.DMTF|Redundancy Group|001.2\"]' ModelCorrespondence='[\"CIM_StorageRedundancySet.OtherAlgorithm\"]'"
	 * @generated
	 */
	Integer getTypeOfAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageRedundancySet#getTypeOfAlgorithm <em>Type Of Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Algorithm</em>' attribute.
	 * @see #getTypeOfAlgorithm()
	 * @generated
	 */
	void setTypeOfAlgorithm(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the redundancy algorithm when the TypeOfAlgorithm is set to 1 'Other'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Algorithm</em>' attribute.
	 * @see #setOtherAlgorithm(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageRedundancySet_OtherAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StorageRedundancySet.TypeOfAlgorithm\"]'"
	 * @generated
	 */
	String getOtherAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageRedundancySet#getOtherAlgorithm <em>Other Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Algorithm</em>' attribute.
	 * @see #getOtherAlgorithm()
	 * @generated
	 */
	void setOtherAlgorithm(String value);

} // CIM_StorageRedundancySet

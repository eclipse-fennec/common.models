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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Associated Block Statistics Manifest Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Instances of this class associate a BlockStatisticsManifestCollection to the StatisticsCollection to which is is applied. The ManifestCollection contains the Manifests that are used to filter requests for the retrieval of statistics.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedBlockStatisticsManifestCollection#getStatistics <em>Statistics</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssociatedBlockStatisticsManifestCollection#getManifestCollection <em>Manifest Collection</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedBlockStatisticsManifestCollection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Device::StorageStatistics' keys='Statistics,ManifestCollection'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedBlockStatisticsManifestCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Statistics</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection of statistics filtered by the BlockStatisticsManifestCollection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statistics</em>' reference.
	 * @see #setStatistics(CIM_StatisticsCollection)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedBlockStatisticsManifestCollection_Statistics()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StatisticsCollection REF' Key='true' Min='1' Max='1'"
	 * @generated
	 */
	CIM_StatisticsCollection getStatistics();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedBlockStatisticsManifestCollection#getStatistics <em>Statistics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistics</em>' reference.
	 * @see #getStatistics()
	 * @generated
	 */
	void setStatistics(CIM_StatisticsCollection value);

	/**
	 * Returns the value of the '<em><b>Manifest Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection of Manifests applied to the StatisticsCollection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manifest Collection</em>' reference.
	 * @see #setManifestCollection(CIM_BlockStatisticsManifestCollection)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedBlockStatisticsManifestCollection_ManifestCollection()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_BlockStatisticsManifestCollection REF' Key='true'"
	 * @generated
	 */
	CIM_BlockStatisticsManifestCollection getManifestCollection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssociatedBlockStatisticsManifestCollection#getManifestCollection <em>Manifest Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manifest Collection</em>' reference.
	 * @see #getManifestCollection()
	 * @generated
	 */
	void setManifestCollection(CIM_BlockStatisticsManifestCollection value);

} // CIM_AssociatedBlockStatisticsManifestCollection

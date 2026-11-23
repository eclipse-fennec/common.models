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
 * A representation of the model object '<em><b>CIM Classifier Filter Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In order for a ClassifierService to correctly identify and process network traffic, that traffic must be described by FilterEntries, which are aggregated into FilterLists. This association defines the Dependency of the ClassifierService on FilterLists (and therefore, their FilterEntries). The cardinality of the association requires that the Classifier Service operate against at least one FilterList. 
 * 
 * The association is deprecated in lieu of associating Filter Lists to ClassifierElements, and ClassifierElements into ClassifierServices. The latter approach is very flexible regarding the implementations that can be modeled, and removes the need to track individual traffic streams using an artificial model property, TrafficClass. Using ClassifierElements, each stream is processed beginning with a single FilterList and progressing through various ConditioningServices, associated via instances of NextService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ClassifierFilterSet#getFilterListPosition <em>Filter List Position</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ClassifierFilterSet()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ClassifierElementUsesFilterList\",\"CIM_ClassifierElementInClassifierService\"]' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' override.Antecedent='CIM_FilterList REF' override.Antecedent.Deprecated='[\"CIM_ClassifierElementUsesFilterList.Antecedent\"]' override.Antecedent.Description='The FilterList aggregating FilterEntries, these in turn describe how traffic is identified and processed by the ClassifierService.' override.Dependent='CIM_ClassifierService REF' override.Dependent.Deprecated='[\"CIM_ClassifierElementUsesFilterList.Dependent\"]' override.Dependent.Description='The ClassifierService which uses the FilterList and its aggregated FilterEntries.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ClassifierFilterSet extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Filter List Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordering of the FilterLists used in the classification and forwarding functions of the ClassifierService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter List Position</em>' attribute.
	 * @see #setFilterListPosition(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ClassifierFilterSet_FilterListPosition()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_ClassifierElementInClassifierService.ClassifierOrder\"]'"
	 * @generated
	 */
	Integer getFilterListPosition();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ClassifierFilterSet#getFilterListPosition <em>Filter List Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter List Position</em>' attribute.
	 * @see #getFilterListPosition()
	 * @generated
	 */
	void setFilterListPosition(Integer value);

} // CIM_ClassifierFilterSet

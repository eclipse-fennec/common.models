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
 * A representation of the model object '<em><b>CIM Related Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_RelatedStatisticalData is an association that defines hierarchies and/or dependencies of related CIM_Statistical Data classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RelatedStatisticalData#getStats <em>Stats</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RelatedStatisticalData#getRelatedStats <em>Related Stats</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RelatedStatisticalData#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RelatedStatisticalData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Core::Statistics' keys='Stats,RelatedStats'"
 * @generated
 */
@ProviderType
public interface CIM_RelatedStatisticalData extends EObject {
	/**
	 * Returns the value of the '<em><b>Stats</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The statistic information/object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stats</em>' reference.
	 * @see #setStats(CIM_StatisticalData)
	 * @see org.dmtf.cim.CimPackage#getCIM_RelatedStatisticalData_Stats()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StatisticalData REF' Key='true'"
	 * @generated
	 */
	CIM_StatisticalData getStats();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RelatedStatisticalData#getStats <em>Stats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stats</em>' reference.
	 * @see #getStats()
	 * @generated
	 */
	void setStats(CIM_StatisticalData value);

	/**
	 * Returns the value of the '<em><b>Related Stats</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The related statistics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Stats</em>' reference.
	 * @see #setRelatedStats(CIM_StatisticalData)
	 * @see org.dmtf.cim.CimPackage#getCIM_RelatedStatisticalData_RelatedStats()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StatisticalData REF' Key='true'"
	 * @generated
	 */
	CIM_StatisticalData getRelatedStats();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RelatedStatisticalData#getRelatedStats <em>Related Stats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Stats</em>' reference.
	 * @see #getRelatedStats()
	 * @generated
	 */
	void setRelatedStats(CIM_StatisticalData value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string describing how the statistics are related.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RelatedStatisticalData_Description()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RelatedStatisticalData#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // CIM_RelatedStatisticalData

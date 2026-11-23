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
 * A representation of the model object '<em><b>CIM Related Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_RelatedStatistics is an association that defines hierarchies and/or dependencies of related CIM_Statistical Information classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RelatedStatistics#getStats <em>Stats</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RelatedStatistics#getRelatedStats <em>Related Stats</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RelatedStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Core::Statistics' keys='Stats,RelatedStats'"
 * @generated
 */
@ProviderType
public interface CIM_RelatedStatistics extends EObject {
	/**
	 * Returns the value of the '<em><b>Stats</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The statistic information/object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stats</em>' reference.
	 * @see #setStats(CIM_StatisticalInformation)
	 * @see org.dmtf.cim.CimPackage#getCIM_RelatedStatistics_Stats()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StatisticalInformation REF' Key='true'"
	 * @generated
	 */
	CIM_StatisticalInformation getStats();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RelatedStatistics#getStats <em>Stats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stats</em>' reference.
	 * @see #getStats()
	 * @generated
	 */
	void setStats(CIM_StatisticalInformation value);

	/**
	 * Returns the value of the '<em><b>Related Stats</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The related statistics or metrics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Stats</em>' reference.
	 * @see #setRelatedStats(CIM_StatisticalInformation)
	 * @see org.dmtf.cim.CimPackage#getCIM_RelatedStatistics_RelatedStats()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StatisticalInformation REF' Key='true'"
	 * @generated
	 */
	CIM_StatisticalInformation getRelatedStats();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RelatedStatistics#getRelatedStats <em>Related Stats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Stats</em>' reference.
	 * @see #getRelatedStats()
	 * @generated
	 */
	void setRelatedStats(CIM_StatisticalInformation value);

} // CIM_RelatedStatistics

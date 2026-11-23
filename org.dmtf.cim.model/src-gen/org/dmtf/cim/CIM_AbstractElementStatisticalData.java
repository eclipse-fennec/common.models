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
 * A representation of the model object '<em><b>CIM Abstract Element Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AbstractElementStatisticalData is an association that relates a ManagedElement (or a view of a ManagedElement) to its StatisticalData.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AbstractElementStatisticalData#getManagedElement <em>Managed Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AbstractElementStatisticalData#getStats <em>Stats</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AbstractElementStatisticalData()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Association='true' Abstract='true' Version='2.45.0' UMLPackagePath='CIM::Core::Statistics' keys='ManagedElement,Stats'"
 * @generated
 */
@ProviderType
public interface CIM_AbstractElementStatisticalData extends EObject {
	/**
	 * Returns the value of the '<em><b>Managed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedElement (or view of the ManagedElement) for which statistical or metric data is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Element</em>' reference.
	 * @see #setManagedElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractElementStatisticalData_ManagedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getManagedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractElementStatisticalData#getManagedElement <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Element</em>' reference.
	 * @see #getManagedElement()
	 * @generated
	 */
	void setManagedElement(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Stats</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The statistic information/object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stats</em>' reference.
	 * @see #setStats(CIM_StatisticalData)
	 * @see org.dmtf.cim.CimPackage#getCIM_AbstractElementStatisticalData_Stats()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StatisticalData REF' Key='true'"
	 * @generated
	 */
	CIM_StatisticalData getStats();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AbstractElementStatisticalData#getStats <em>Stats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stats</em>' reference.
	 * @see #getStats()
	 * @generated
	 */
	void setStats(CIM_StatisticalData value);

} // CIM_AbstractElementStatisticalData

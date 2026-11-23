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
 * A representation of the model object '<em><b>CIM Uo WMetric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association ties a MetricDefinition to an instance of a UnitOfWork. Its primary purpose is to specify the value of the Metric for the instance of UnitOfWork. It is defined as a Dependency since the Metric value relies on the specific UnitOfWork for context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UoWMetric#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UoWMetric()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Metrics::UnitOfWork' override.Antecedent='CIM_UnitOfWork REF' override.Antecedent.Description='The UnitOfWork whose Metric value is specified.' override.Dependent='CIM_MetricDefinition REF' override.Dependent.Description='The MetricDefinition for this particular UnitOfWork and value. Note that the MetricDefinition must be associated (via UoWMetricDefinition) to the same UnitOfWorkDefinition to which the UnitOfWork is weakly associated.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_UoWMetric extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the Metric for the referenced UnitOfWork. Note that the type of the data and other information are defined by the properties of MetricDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UoWMetric_Value()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UoWMetric#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // CIM_UoWMetric

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
 * A representation of the model object '<em><b>CIM Metric Def For ME</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association ties a CIM_BaseMetricDefinition to a CIM_ManagedElement to define metrics for the latter. The metrics definition is given context by the ManagedElement, which is why the definition is dependent on the element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MetricDefForME#getMetricCollectionEnabled <em>Metric Collection Enabled</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MetricDefForME()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.22.0' UMLPackagePath='CIM::Metrics::BaseMetric' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Description='The CIM_ManagedElement that can have metrics of this type associated with it.' override.Dependent='CIM_BaseMetricDefinition REF' override.Dependent.Description='A CIM_BaseMetricDefinition for a CIM_ManagedElement.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_MetricDefForME extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Metric Collection Enabled</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MetricCollectionEnabled indicates whether the metric defined by the referenced CIM_BaseMetricDefinition is being collected for the referenced CIM_ManagedElement. A value of 2 "Enabled" shall indicate the metric is being collected. A value of 3 "Disabled" shall indicate the metric is not being collected. When collection of a metric is re-enabled, the metric is re-initialized such that any values for a current access metric reflect data collected after the time at which collection was re-enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metric Collection Enabled</em>' attribute.
	 * @see #setMetricCollectionEnabled(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MetricDefForME_MetricCollectionEnabled()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Enabled\",\"Disabled\",\"Reserved\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getMetricCollectionEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MetricDefForME#getMetricCollectionEnabled <em>Metric Collection Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Collection Enabled</em>' attribute.
	 * @see #getMetricCollectionEnabled()
	 * @generated
	 */
	void setMetricCollectionEnabled(Integer value);

} // CIM_MetricDefForME

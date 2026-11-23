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
 * A representation of the model object '<em><b>CIM Aggregation Metric Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each CIM_AggregationMetricValue object represents the instance value of a metric defined by an instance of CIM_AggregationMetricDefinition. The properties inherited from CIM_BaseMetricValue provide the actual metric value. The properties introduced in CIM_AggregationMetricValue provide information about the interval over which the aggregation function was applied.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AggregationMetricValue#getAggregationTimeStamp <em>Aggregation Time Stamp</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AggregationMetricValue#getAggregationDuration <em>Aggregation Duration</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AggregationMetricValue()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Metrics::BaseMetric' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_AggregationMetricValue extends CIM_BaseMetricValue {
	/**
	 * Returns the value of the '<em><b>Aggregation Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the time when the aggregation function was applied to determine the value of the metric instance. Note that this is different from the time when the instance is created. For a given CIM_AggregationMetricValue instance, the AggregationTimeStamp changes whenever the aggregation function is applied to calculate the value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Time Stamp</em>' attribute.
	 * @see #setAggregationTimeStamp(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AggregationMetricValue_AggregationTimeStamp()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_AggregationMetricValue.Duration\"]'"
	 * @generated
	 */
	String getAggregationTimeStamp();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AggregationMetricValue#getAggregationTimeStamp <em>Aggregation Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Time Stamp</em>' attribute.
	 * @see #getAggregationTimeStamp()
	 * @generated
	 */
	void setAggregationTimeStamp(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Property that represents the time duration over which the aggregation was computed. The start of a monitoring interval over which the aggregation function is applied is determined by subtracting the AggregationDuration from the AggregationTimestamp.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Duration</em>' attribute.
	 * @see #setAggregationDuration(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AggregationMetricValue_AggregationDuration()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_AggregationMetricValue.AggregationTimeStamp\"]'"
	 * @generated
	 */
	String getAggregationDuration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AggregationMetricValue#getAggregationDuration <em>Aggregation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Duration</em>' attribute.
	 * @see #getAggregationDuration()
	 * @generated
	 */
	void setAggregationDuration(String value);

} // CIM_AggregationMetricValue

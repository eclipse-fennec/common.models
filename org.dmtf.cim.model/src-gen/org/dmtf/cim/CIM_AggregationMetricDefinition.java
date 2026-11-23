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
 * A representation of the model object '<em><b>CIM Aggregation Metric Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AggregationMetricDefinition represents the definitional aspects of a metric that is derived from another metric value. The CIM_AggregationMetricDefinition should be associated with the CIM_ManagedElement(s) to which it applies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AggregationMetricDefinition#getSimpleFunction <em>Simple Function</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AggregationMetricDefinition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Metrics::BaseMetric' override.ChangeType='uint16' override.ChangeType.Description='ChangeType indicates how the metric value changes, in the form of typical combinations of finer grain attributes such as direction change, minimum and maximum values, and wrapping semantics. \n5=\"Simple Function\": indicates that the derived metric value is calculated by applying the basic mathematical function identified by the SimpleFunction property to the underlying metric values.' override.ChangeType.ValueMap='[\"5\",\"..\",\"32768..65535\"]' override.ChangeType.Values='[\"Simple Function\",\"DMTF Reserved\",\"Vendor Reserved\"]' override.ChangeType.ModelCorrespondence='[\"CIM_AggregationMetricDefinition.IsContinuous\"]' keys='Id'"
 * @generated
 */
@ProviderType
public interface CIM_AggregationMetricDefinition extends CIM_BaseMetricDefinition {
	/**
	 * Returns the value of the '<em><b>Simple Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SimpleFunction property identifies the basic computation performed on an underlying metric to arrive at the value of this derived metric. This property shall be NULL when the ChangeType property has a value other than 5 "Simple Function". 
	 * 2="Minimum" indicates that the metric reports the lowest value detected for the associated monitored entity. This is also known as a low watermark.
	 * .3="Maximum" indicates that the metric reports the maximum value detected for the associated monitored entity. This is also known as a high watermark.
	 * 4="Average" indicates the metric reports the average value of the underlying metric values.
	 * 5="Median" indicates the metric reports the median value of the underlying metric values.
	 * 6="Mode" indicates the metric reports the modal value of the underlying metric values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple Function</em>' attribute.
	 * @see #setSimpleFunction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AggregationMetricDefinition_SimpleFunction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"..\",\"2\",\"3\",\"4\",\"5\",\"6\",\"32768..65535\"]' Values='[\"DMTF Reserved\",\"Minimum\",\"Maximum\",\"Average\",\"Median\",\"Mode\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getSimpleFunction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AggregationMetricDefinition#getSimpleFunction <em>Simple Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Function</em>' attribute.
	 * @see #getSimpleFunction()
	 * @generated
	 */
	void setSimpleFunction(Integer value);

} // CIM_AggregationMetricDefinition

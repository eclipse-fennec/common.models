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
 * A representation of the model object '<em><b>CIM Drop Threshold Calculation Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class calculates an average depth for a queue, based on a smoothing weight and a sampling time interval. The latter are properties of this Service, describing how it operates and its necessary parameters. The Service does the calculation on behalf of a RED dropper (as indicated by the association, CalculationServiceForDroppper). A DropThresholdCalculationService is always associated to the single queue that it examines via the Calculation BasedOnQueue relationship.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DropThresholdCalculationService#getSmoothingWeight <em>Smoothing Weight</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DropThresholdCalculationService#getTimeInterval <em>Time Interval</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DropThresholdCalculationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_DropThresholdCalculationService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Smoothing Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a 32-bit unsigned integer, ranging between 0 and 100,000 - specified in thousandths. It defines the weighting of past history in affecting the calculation of the current average queue depth. The current queue depth calculation uses the inverse of this value as its factor, and one minus that inverse as the factor for the historical average. The calculation takes the form: 
	 * average = (old_average*(1-inverse of SmoothingWeight)) 
	 * + (current_queue_depth*inverse of SmoothingWeight) 
	 * Implementations may choose to limit the acceptable set of values to a specified set, such as powers of 2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Smoothing Weight</em>' attribute.
	 * @see #setSmoothingWeight(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DropThresholdCalculationService_SmoothingWeight()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Thousandths' MinValue='0' MaxValue='100000' PUnit='permille'"
	 * @generated
	 */
	Long getSmoothingWeight();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DropThresholdCalculationService#getSmoothingWeight <em>Smoothing Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smoothing Weight</em>' attribute.
	 * @see #getSmoothingWeight()
	 * @generated
	 */
	void setSmoothingWeight(Long value);

	/**
	 * Returns the value of the '<em><b>Time Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a 32-bit unsigned integer, and defines the number of nanoseconds between each calculation of average/smoothed queue depth. When this property is not specified, the CalculationService may determine an appropriate interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Interval</em>' attribute.
	 * @see #setTimeInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DropThresholdCalculationService_TimeInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='NanoSeconds' PUnit='second * 10^-9'"
	 * @generated
	 */
	Long getTimeInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DropThresholdCalculationService#getTimeInterval <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval</em>' attribute.
	 * @see #getTimeInterval()
	 * @generated
	 */
	void setTimeInterval(Long value);

} // CIM_DropThresholdCalculationService

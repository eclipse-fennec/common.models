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
 * A representation of the model object '<em><b>CIM EWMA Meter Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a concrete subclass of the MeterService class that represents an exponentially weighted moving average meter. This meter is a simple low-pass filter that measures the rate of incoming packets over a small, fixed sampling interval. Any admitted packet that pushes the average rate over a pre-defined limit is defined to be non-conforming.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_EWMAMeterService#getAverageRate <em>Average Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EWMAMeterService#getDeltaInterval <em>Delta Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EWMAMeterService#getGain <em>Gain</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EWMAMeterService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_EWMAMeterService extends CIM_MeterService {
	/**
	 * Returns the value of the '<em><b>Average Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a 32-bit unsigned integer that defines the average rate against which the sampled arrival rate of packets should be measured. Any packet that causes the sampled rate to exceed this rate is deemed non-conforming. The value is specified in kilobits per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Rate</em>' attribute.
	 * @see #setAverageRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EWMAMeterService_AverageRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='KiloBits Per Second' PUnit='bit / second * 10^3'"
	 * @generated
	 */
	Long getAverageRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EWMAMeterService#getAverageRate <em>Average Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Rate</em>' attribute.
	 * @see #getAverageRate()
	 * @generated
	 */
	void setAverageRate(Long value);

	/**
	 * Returns the value of the '<em><b>Delta Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a 64-bit unsigned integer that defines the sampling interval used to measure the arrival rate. The calculated rate is averaged over this interval and checked against the AverageRate property. All packets whose computed average arrival rate is less than the AverageRate are deemed conforming. The value is specified in microseconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Interval</em>' attribute.
	 * @see #setDeltaInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EWMAMeterService_DeltaInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='MicroSeconds' PUnit='second * 10^-6'"
	 * @generated
	 */
	Long getDeltaInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EWMAMeterService#getDeltaInterval <em>Delta Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Interval</em>' attribute.
	 * @see #getDeltaInterval()
	 * @generated
	 */
	void setDeltaInterval(Long value);

	/**
	 * Returns the value of the '<em><b>Gain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a 32-bit unsigned integer representing the reciprocal of the time constant (e.g., frequency response) of what is essentially a simple low-pass filter. For example, the value 64 for this property represents a time constant value of 1/64.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gain</em>' attribute.
	 * @see #setGain(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EWMAMeterService_Gain()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getGain();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EWMAMeterService#getGain <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gain</em>' attribute.
	 * @see #getGain()
	 * @generated
	 */
	void setGain(Long value);

} // CIM_EWMAMeterService

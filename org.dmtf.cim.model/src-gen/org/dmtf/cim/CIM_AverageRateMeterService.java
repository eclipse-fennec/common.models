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
 * A representation of the model object '<em><b>CIM Average Rate Meter Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a concrete subclass of MeterService that represents a simple meter, called an Average Rate Meter. This type of meter measures the average rate at which packets are submitted to it over a specified time. Packets are defined as conformant if their average arrival rate does not exceed the specified measuring rate of the meter. Any packet that causes the specified measuring rate to be exceeded is defined to be non-conforming.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AverageRateMeterService#getAverageRate <em>Average Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AverageRateMeterService#getDeltaInterval <em>Delta Interval</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AverageRateMeterService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_AverageRateMeterService extends CIM_MeterService {
	/**
	 * Returns the value of the '<em><b>Average Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a 32-bit unsigned integer that defines the rate used to determine whether admitted packets are in conformance or not. The value is specified in kilobits per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Rate</em>' attribute.
	 * @see #setAverageRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AverageRateMeterService_AverageRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='KiloBits per Second' PUnit='bit / second * 10^3'"
	 * @generated
	 */
	Long getAverageRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AverageRateMeterService#getAverageRate <em>Average Rate</em>}' attribute.
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
	 * This property is a 64-bit unsigned integer that defines the time period over which the average measurement should be taken. The value is specified in microseconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Interval</em>' attribute.
	 * @see #setDeltaInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AverageRateMeterService_DeltaInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='MicroSeconds' PUnit='second * 10^-6'"
	 * @generated
	 */
	Long getDeltaInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AverageRateMeterService#getDeltaInterval <em>Delta Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Interval</em>' attribute.
	 * @see #getDeltaInterval()
	 * @generated
	 */
	void setDeltaInterval(Long value);

} // CIM_AverageRateMeterService

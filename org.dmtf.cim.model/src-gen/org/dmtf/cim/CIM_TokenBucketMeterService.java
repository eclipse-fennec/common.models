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
 * A representation of the model object '<em><b>CIM Token Bucket Meter Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a concrete subclass of the MeterService class that represents the metering of network traffic using a token bucket meter. Two types of token bucket meters are defined using this class - a simple, two-parameter bucket meter, and a multi-stage meter. 
 * 
 * A simple token bucket usually has two parameters, an average token rate and a burst size, and has two conformance levels: 'conforming' and 'non-conforming'. This class also defines an excess burst size, which enables the meter to have three conformance levels ('conforming', 'partially conforming', and 'non-conforming'). In this case, packets that exceed the excess burst size are deemed non-conforming, while packets that exceed the smaller burst size but are less than the excess burst size are deemed partially conforming.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TokenBucketMeterService#getAverageRate <em>Average Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenBucketMeterService#getPeakRate <em>Peak Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenBucketMeterService#getBurstSize <em>Burst Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenBucketMeterService#getExcessBurstSize <em>Excess Burst Size</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TokenBucketMeterService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_TokenBucketMeterService extends CIM_MeterService {
	/**
	 * Returns the value of the '<em><b>Average Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a 32-bit unsigned integer that is used to define the committed rate of the meter. The value is expressed in kilobits per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Rate</em>' attribute.
	 * @see #setAverageRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenBucketMeterService_AverageRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='KiloBits per Second' PUnit='bit / second * 10^3'"
	 * @generated
	 */
	Long getAverageRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenBucketMeterService#getAverageRate <em>Average Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Rate</em>' attribute.
	 * @see #getAverageRate()
	 * @generated
	 */
	void setAverageRate(Long value);

	/**
	 * Returns the value of the '<em><b>Peak Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is a 32-bit unsigned integer that is used to define the peak rate of the meter. The value is expressed in kilobits per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peak Rate</em>' attribute.
	 * @see #setPeakRate(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenBucketMeterService_PeakRate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='KiloBits per Second' PUnit='bit / second * 10^3'"
	 * @generated
	 */
	Long getPeakRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenBucketMeterService#getPeakRate <em>Peak Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peak Rate</em>' attribute.
	 * @see #getPeakRate()
	 * @generated
	 */
	void setPeakRate(Long value);

	/**
	 * Returns the value of the '<em><b>Burst Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a 32-bit unsigned integer that is used to define the maximum number of tokens available for the committed rate (specified by the AverageRate property). The value is specified in kilobytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Burst Size</em>' attribute.
	 * @see #setBurstSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenBucketMeterService_BurstSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='KiloBytes' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getBurstSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenBucketMeterService#getBurstSize <em>Burst Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Burst Size</em>' attribute.
	 * @see #getBurstSize()
	 * @generated
	 */
	void setBurstSize(Long value);

	/**
	 * Returns the value of the '<em><b>Excess Burst Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a 32-bit unsigned integer that is used to define the maximum number of tokens available for the peak rate (specified by the PeakRate property). The value is specified in kilobytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excess Burst Size</em>' attribute.
	 * @see #setExcessBurstSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenBucketMeterService_ExcessBurstSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='KiloBytes' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getExcessBurstSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenBucketMeterService#getExcessBurstSize <em>Excess Burst Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excess Burst Size</em>' attribute.
	 * @see #getExcessBurstSize()
	 * @generated
	 */
	void setExcessBurstSize(Long value);

} // CIM_TokenBucketMeterService

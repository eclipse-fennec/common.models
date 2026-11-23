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
 * A representation of the model object '<em><b>CIM Meter Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the metering of network traffic. Metering is the function of monitoring the arrival times of packets of a traffic stream and determining the level of conformance of each packet with respect to a pre- established traffic profile. A meter has the ability to invoke different ConditioningServices for conforming and non-conforming traffic. Traffic leaving a meter may be further conditioned (e.g., dropped or queued) by routing the packet to another conditioning element. 
 * 
 * This class is modeled as a ConditioningService so that it can be aggregated into a QoSService (using the QoSConditioningSubService association), to indicate that its functionality underlies that QoS service. MeterService also participates in a subclass of the NextService association, to identify the subsequent ConditioningServices for conforming and non-conforming traffic.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MeterService#getMeterType <em>Meter Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MeterService#getOtherMeterType <em>Other Meter Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MeterService#getConformanceLevels <em>Conformance Levels</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MeterService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_MeterService extends CIM_ConditioningService {
	/**
	 * Returns the value of the '<em><b>Meter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an enumerated 16-bit unsigned integer that is used to specify the particular type of meter. Defined values of the enumeration are: 
	 * 
	 * 1: Other 
	 * 2: Average Rate Meter 
	 * 3: Exponentially Weighted Moving Average Meter 
	 * 4: Token Bucket Meter 
	 * 
	 * Note: The MeterType property and the MeterService subclasses provide similar information. This property is defined for query purposes and for future expansion. It is assumed that not all MeterServices will require a subclass to define them. Therefore, MeterService will be instantiated directly and the Type property is needed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meter Type</em>' attribute.
	 * @see #setMeterType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MeterService_MeterType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Average Rate Meter\",\"Exponentially Weighted Moving Average Meter\",\"Token Bucket Meter\"]' ModelCorrespondence='[\"CIM_MeterService.OtherMeterType\"]'"
	 * @generated
	 */
	Integer getMeterType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MeterService#getMeterType <em>Meter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Type</em>' attribute.
	 * @see #getMeterType()
	 * @generated
	 */
	void setMeterType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Meter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is a string used in conjunction with the MeterType property. When the value of MeterType is 1 (i.e., "Other"), then the name of the conformance level for this meter is defined in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Meter Type</em>' attribute.
	 * @see #setOtherMeterType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MeterService_OtherMeterType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_MeterService.MeterType\"]'"
	 * @generated
	 */
	String getOtherMeterType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MeterService#getOtherMeterType <em>Other Meter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Meter Type</em>' attribute.
	 * @see #getOtherMeterType()
	 * @generated
	 */
	void setOtherMeterType(String value);

	/**
	 * Returns the value of the '<em><b>Conformance Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An unsigned integer indicating the number of conformance levels supported by the Meter. For example, when only 'in-profile' or 'out of profile' metering is supported. ConformanceLevels is set to 2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance Levels</em>' attribute.
	 * @see #setConformanceLevels(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MeterService_ConformanceLevels()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getConformanceLevels();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MeterService#getConformanceLevels <em>Conformance Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance Levels</em>' attribute.
	 * @see #getConformanceLevels()
	 * @generated
	 */
	void setConformanceLevels(Integer value);

} // CIM_MeterService

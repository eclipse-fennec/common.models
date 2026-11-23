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
 * A representation of the model object '<em><b>CIM Next Service After Meter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association describes a predecessor-successor relationship between a MeterService and one or more ConditioningService objects that process traffic from the meter. For example, for devices that implement preamble marking, the FollowingService reference (after the meter) is a PreambleMarkerService - to record the results of the metering in the preamble. 
 * 
 * It might be expected that the NextServiceAfterMeter association would subclass from NextService. However, meters are 1:n fan-out elements, and require a mechanism to distinguish between the different results/outputs of the meter. Therefore, this association defines a new key property, MeterResult, which is used to record the result and identify the output through which this traffic left the meter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_NextServiceAfterMeter#getPrecedingService <em>Preceding Service</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NextServiceAfterMeter#getFollowingService <em>Following Service</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_NextServiceAfterMeter#getMeterResult <em>Meter Result</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NextServiceAfterMeter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='PrecedingService,FollowingService,MeterResult'"
 * @generated
 */
@ProviderType
public interface CIM_NextServiceAfterMeter extends EObject {
	/**
	 * Returns the value of the '<em><b>Preceding Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The preceding MeterService, 'earlier' in the processing sequence for a packet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preceding Service</em>' reference.
	 * @see #setPrecedingService(CIM_MeterService)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextServiceAfterMeter_PrecedingService()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_MeterService REF' Key='true'"
	 * @generated
	 */
	CIM_MeterService getPrecedingService();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextServiceAfterMeter#getPrecedingService <em>Preceding Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preceding Service</em>' reference.
	 * @see #getPrecedingService()
	 * @generated
	 */
	void setPrecedingService(CIM_MeterService value);

	/**
	 * Returns the value of the '<em><b>Following Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The 'next' or following ConditioningService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Following Service</em>' reference.
	 * @see #setFollowingService(CIM_ConditioningService)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextServiceAfterMeter_FollowingService()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConditioningService REF' Key='true'"
	 * @generated
	 */
	CIM_ConditioningService getFollowingService();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextServiceAfterMeter#getFollowingService <em>Following Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Following Service</em>' reference.
	 * @see #getFollowingService()
	 * @generated
	 */
	void setFollowingService(CIM_ConditioningService value);

	/**
	 * Returns the value of the '<em><b>Meter Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on the result of the metering. Traffic is distinguished as being conforming, non-conforming, or partially conforming. More complicated metering can be built either by extending the enumeration or by cascading meters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meter Result</em>' attribute.
	 * @see #setMeterResult(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_NextServiceAfterMeter_MeterResult()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Key='true' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Conforming\",\"Partially Conforming\",\"Non-Conforming\"]'"
	 * @generated
	 */
	Integer getMeterResult();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_NextServiceAfterMeter#getMeterResult <em>Meter Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meter Result</em>' attribute.
	 * @see #getMeterResult()
	 * @generated
	 */
	void setMeterResult(Integer value);

} // CIM_NextServiceAfterMeter

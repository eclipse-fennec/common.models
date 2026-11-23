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
 * A representation of the model object '<em><b>CIM Threshold Indication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of CIM_AlertIndications carrying additional threshold information related to the notification. This subclass is used when one of the ProbableCauses is set to 53, "Threshold Crossed".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ThresholdIndication#getThresholdIdentifier <em>Threshold Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ThresholdIndication#getThresholdValue <em>Threshold Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ThresholdIndication#getObservedValue <em>Observed Value</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ThresholdIndication()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Version='2.6.0' UMLPackagePath='CIM::Event'"
 * @generated
 */
@ProviderType
public interface CIM_ThresholdIndication extends CIM_AlertIndication {
	/**
	 * Returns the value of the '<em><b>Threshold Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the threshold or naming the property that represents the threshold, if modeled in the CIM hierarchy. In the latter case, the value should be written as <schema name>_ <class name>.<property name>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Threshold Identifier</em>' attribute.
	 * @see #setThresholdIdentifier(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ThresholdIndication_ThresholdIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"Recommendation.ITU|X733.Threshold information\"]'"
	 * @generated
	 */
	String getThresholdIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ThresholdIndication#getThresholdIdentifier <em>Threshold Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Identifier</em>' attribute.
	 * @see #getThresholdIdentifier()
	 * @generated
	 */
	void setThresholdIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Threshold Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string holding the current value of the threshold. This is modeled as a string for universal mapping, similar to the CIM_Sensor properties in the Device Model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Threshold Value</em>' attribute.
	 * @see #setThresholdValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ThresholdIndication_ThresholdValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"Recommendation.ITU|X733.Threshold information\"]'"
	 * @generated
	 */
	String getThresholdValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ThresholdIndication#getThresholdValue <em>Threshold Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Value</em>' attribute.
	 * @see #getThresholdValue()
	 * @generated
	 */
	void setThresholdValue(String value);

	/**
	 * Returns the value of the '<em><b>Observed Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string holding the current reading value that exceeds the threshold. This is modeled as a string for universal mapping, similar to the CIM_Sensor properties in the Device Model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observed Value</em>' attribute.
	 * @see #setObservedValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ThresholdIndication_ObservedValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"Recommendation.ITU|X733.Threshold information\"]'"
	 * @generated
	 */
	String getObservedValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ThresholdIndication#getObservedValue <em>Observed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed Value</em>' attribute.
	 * @see #getObservedValue()
	 * @generated
	 */
	void setObservedValue(String value);

} // CIM_ThresholdIndication

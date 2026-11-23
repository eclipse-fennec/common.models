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
 * A representation of the model object '<em><b>CIM Binary Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A BinarySensor provides a boolean output. The use of this class is being deprecated in lieu of creating a Sensor with two PossibleStates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BinarySensor#getCurrentReading <em>Current Reading</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BinarySensor#getExpectedReading <em>Expected Reading</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BinarySensor#getInterpretationOfTrue <em>Interpretation Of True</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BinarySensor#getInterpretationOfFalse <em>Interpretation Of False</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BinarySensor()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_Sensor\"]' Version='2.8.0' UMLPackagePath='CIM::Device::Sensors' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_BinarySensor extends CIM_Sensor {
	/**
	 * Returns the value of the '<em><b>Current Reading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current value indicated by the Sensor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Reading</em>' attribute.
	 * @see #setCurrentReading(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BinarySensor_CurrentReading()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_Sensor.SensorType\"]'"
	 * @generated
	 */
	Boolean getCurrentReading();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BinarySensor#getCurrentReading <em>Current Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Reading</em>' attribute.
	 * @see #getCurrentReading()
	 * @generated
	 */
	void setCurrentReading(Boolean value);

	/**
	 * Returns the value of the '<em><b>Expected Reading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExpectedReading indicates the 'normal' value for the Sensor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Reading</em>' attribute.
	 * @see #setExpectedReading(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BinarySensor_ExpectedReading()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_Sensor.SensorType\"]'"
	 * @generated
	 */
	Boolean getExpectedReading();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BinarySensor#getExpectedReading <em>Expected Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Reading</em>' attribute.
	 * @see #getExpectedReading()
	 * @generated
	 */
	void setExpectedReading(Boolean value);

	/**
	 * Returns the value of the '<em><b>Interpretation Of True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InterpretationOfTrue is a string indicating what a 'True' value from the BinarySensor means. This information could be displayed to a user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpretation Of True</em>' attribute.
	 * @see #setInterpretationOfTrue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BinarySensor_InterpretationOfTrue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_Sensor.PossibleStates\"]' MaxLen='64'"
	 * @generated
	 */
	String getInterpretationOfTrue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BinarySensor#getInterpretationOfTrue <em>Interpretation Of True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation Of True</em>' attribute.
	 * @see #getInterpretationOfTrue()
	 * @generated
	 */
	void setInterpretationOfTrue(String value);

	/**
	 * Returns the value of the '<em><b>Interpretation Of False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InterpretationOfFalse is a string indicating what a 'False' value from the BinarySensor means. This information could be displayed to a user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interpretation Of False</em>' attribute.
	 * @see #setInterpretationOfFalse(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BinarySensor_InterpretationOfFalse()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_Sensor.PossibleStates\"]' MaxLen='64'"
	 * @generated
	 */
	String getInterpretationOfFalse();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BinarySensor#getInterpretationOfFalse <em>Interpretation Of False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation Of False</em>' attribute.
	 * @see #getInterpretationOfFalse()
	 * @generated
	 */
	void setInterpretationOfFalse(String value);

} // CIM_BinarySensor

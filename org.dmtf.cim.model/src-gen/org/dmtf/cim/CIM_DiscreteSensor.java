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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Discrete Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DiscreteSensor has a set of legal string values, that it can report. These values are enumerated in the Sensor's PossibleValues property. A DiscreteSensor will always have a 'current reading' that corresponds to one of the enumerated values. 
 * The use of this class is being deprecated in lieu of CIM_Sensor. Information in the CurrentReading and PossibleValues properties will typically have the same values and semantics as for the CurrentState and PossibleStates properties, inherited from Sensor.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiscreteSensor#getCurrentReading <em>Current Reading</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiscreteSensor#getPossibleValues <em>Possible Values</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiscreteSensor#getAcceptableValues <em>Acceptable Values</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiscreteSensor()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_Sensor\"]' Version='2.8.0' UMLPackagePath='CIM::Device::Sensors' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_DiscreteSensor extends CIM_Sensor {
	/**
	 * Returns the value of the '<em><b>Current Reading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current value indicated by the Sensor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Reading</em>' attribute.
	 * @see #setCurrentReading(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiscreteSensor_CurrentReading()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_Sensor.CurrentState\"]' MaxLen='64'"
	 * @generated
	 */
	String getCurrentReading();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiscreteSensor#getCurrentReading <em>Current Reading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Reading</em>' attribute.
	 * @see #getCurrentReading()
	 * @generated
	 */
	void setCurrentReading(String value);

	/**
	 * Returns the value of the '<em><b>Possible Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PossibleValues enumerates the string outputs that can be reported by the DiscreteSensor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Possible Values</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiscreteSensor_PossibleValues()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_Sensor.PossibleStates\"]' MaxLen='64'"
	 * @generated
	 */
	EList<String> getPossibleValues();

	/**
	 * Returns the value of the '<em><b>Acceptable Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AcceptableValues details which of the PossibleValues strings are considered 'acceptable' (ie, 'not an error').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acceptable Values</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiscreteSensor_AcceptableValues()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]' MaxLen='64'"
	 * @generated
	 */
	EList<String> getAcceptableValues();

} // CIM_DiscreteSensor

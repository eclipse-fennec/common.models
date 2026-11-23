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
 * A representation of the model object '<em><b>CIM Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Sensor is an entity capable of measuring or reporting the characteristics of some physical property - for example, the temperature or voltage characteristics of a Computer System.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Sensor#getSensorType <em>Sensor Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Sensor#getOtherSensorTypeDescription <em>Other Sensor Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Sensor#getPossibleStates <em>Possible States</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Sensor#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Sensor#getPollingInterval <em>Polling Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Sensor#getSensorContext <em>Sensor Context</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Sensor()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.55.0' UMLPackagePath='CIM::Device::Sensors' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_Sensor extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Sensor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Type of the Sensor, e.g. Voltage or Temperature Sensor. If the type is set to "Other", then the OtherSensorType Description can be used to further identify the type, or if the Sensor has numeric readings, then the type of the Sensor can be implicitly determined by the Units. A description of the different Sensor types is as follows: A Temperature Sensor measures the environmental temperature. Voltage and Current Sensors measure electrical voltage and current readings. A Tachometer measures speed/revolutions of a Device. For example, a Fan Device can have an associated Tachometer which measures its speed. A Counter is a general purpose Sensor that measures some numerical property of a Device. A Counter value can be cleared, but it never decreases. A Switch Sensor has states like Open/Close, On/Off, or Up/Down. A Lock has states of Locked/Unlocked. Humidity, Smoke Detection and Air Flow Sensors measure the equivalent environmental characteristics. A Presence Sensor detects the presence of a PhysicalElement. A Power Consumption Sensor measures the instantaneous power consumed by a managed element. A Power Production Sensor measures the instantaneous power produced by a managed element such as a power supply or a voltage regulator. A pressure sensor is used to report pressure. Intrusion sensor reports an intrusion of an enclosure regardless whether it was authorized or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sensor Type</em>' attribute.
	 * @see #setSensorType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Sensor_SensorType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Temperature\",\"Voltage\",\"Current\",\"Tachometer\",\"Counter\",\"Switch\",\"Lock\",\"Humidity\",\"Smoke Detection\",\"Presence\",\"Air Flow\",\"Power Consumption\",\"Power Production\",\"Pressure\",\"Intrusion\",\"Location\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_Sensor.OtherSensorTypeDescription\"]'"
	 * @generated
	 */
	Integer getSensorType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Sensor#getSensorType <em>Sensor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Type</em>' attribute.
	 * @see #getSensorType()
	 * @generated
	 */
	void setSensorType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Sensor Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the Sensor type - used when the SensorType property is set to "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Sensor Type Description</em>' attribute.
	 * @see #setOtherSensorTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Sensor_OtherSensorTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='128' ModelCorrespondence='[\"CIM_Sensor.SensorType\"]'"
	 * @generated
	 */
	String getOtherSensorTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Sensor#getOtherSensorTypeDescription <em>Other Sensor Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Sensor Type Description</em>' attribute.
	 * @see #getOtherSensorTypeDescription()
	 * @generated
	 */
	void setOtherSensorTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Possible States</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PossibleStates enumerates the string outputs of the Sensor. For example, a "Switch" Sensor may output the states "On", or "Off". Another implementation of the Switch may output the states "Open", and "Close". Another example is a NumericSensor supporting thresholds. This Sensor can report the states like "Normal", "Upper Fatal", "Lower Non-Critical", etc. A NumericSensor that does not publish readings and thresholds, but stores this data internally, can still report its states.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Possible States</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Sensor_PossibleStates()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='128'"
	 * @generated
	 */
	EList<String> getPossibleStates();

	/**
	 * Returns the value of the '<em><b>Current State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state indicated by the Sensor. This is always one of the "PossibleStates".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current State</em>' attribute.
	 * @see #setCurrentState(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Sensor_CurrentState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='128'"
	 * @generated
	 */
	String getCurrentState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Sensor#getCurrentState <em>Current State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State</em>' attribute.
	 * @see #getCurrentState()
	 * @generated
	 */
	void setCurrentState(String value);

	/**
	 * Returns the value of the '<em><b>Polling Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The polling interval that the Sensor hardware or the instrumentation uses to determine the current state of the Sensor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polling Interval</em>' attribute.
	 * @see #setPollingInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Sensor_PollingInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='NanoSeconds' PUnit='second * 10^-9'"
	 * @generated
	 */
	Long getPollingInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Sensor#getPollingInterval <em>Polling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polling Interval</em>' attribute.
	 * @see #getPollingInterval()
	 * @generated
	 */
	void setPollingInterval(Long value);

	/**
	 * Returns the value of the '<em><b>Sensor Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SensorContext indicates the purpose and context of the sensor. For example, the property may indicate what entity is being monitored or where the sensor is installed. Contextual and location information should be provided using associations to existing model elements. This property may be used if additional differentiation is necessary beyond that which is possible to convey using associations or values of SensorType. The value shall be formatted using the following algorithm: 
	 * <OrgID>:<LocalID> 
	 * Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> shall include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the SensorContext or that is a registered ID assigned to the business entity by a recognized global authority. In addition, to ensure uniqueness, <OrgID> shall not contain a colon (:). 
	 * <LocalID> is chosen by the business entity and should not be reused to identify different underlying (real-world) elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sensor Context</em>' attribute.
	 * @see #setSensorContext(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Sensor_SensorContext()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSensorContext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Sensor#getSensorContext <em>Sensor Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor Context</em>' attribute.
	 * @see #getSensorContext()
	 * @generated
	 */
	void setSensorContext(String value);

} // CIM_Sensor

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
 * A representation of the model object '<em><b>CIM Fan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of a Fan CoolingDevice.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Fan#getVariableSpeed <em>Variable Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Fan#getDesiredSpeed <em>Desired Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Fan#getControlMode <em>Control Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Fan#getControlModesSupported <em>Control Modes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Fan#getDesiredControlMode <em>Desired Control Mode</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Fan()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::CoolingAndPower' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_Fan extends CIM_CoolingDevice {
	/**
	 * Returns the value of the '<em><b>Variable Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication of whether the fan supports variable speeds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Speed</em>' attribute.
	 * @see #setVariableSpeed(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Fan_VariableSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getVariableSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Fan#getVariableSpeed <em>Variable Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Speed</em>' attribute.
	 * @see #getVariableSpeed()
	 * @generated
	 */
	void setVariableSpeed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Desired Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DesiredSpeed is the currently requested fan speed, defined in revolutions per minute, when a variable speed fan is supported (VariableSpeed Boolean = TRUE). The current speed is determined using a sensor (CIM_Tachometer) that is associated with the Fan using the CIM_AssociatedSensor relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Desired Speed</em>' attribute.
	 * @see #setDesiredSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Fan_DesiredSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Revolutions per Minute' PUnit='revolution / minute'"
	 * @generated
	 */
	Long getDesiredSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Fan#getDesiredSpeed <em>Desired Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Speed</em>' attribute.
	 * @see #getDesiredSpeed()
	 * @generated
	 */
	void setDesiredSpeed(Long value);

	/**
	 * Returns the value of the '<em><b>Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ControlMode indicates the mode in which management of the Fan is operating. When in Manual mode, the SetSpeed method can be used to control the fan speed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Mode</em>' attribute.
	 * @see #setControlMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Fan_ControlMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Automatic\",\"Manual\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_Fan.ControlModesSupported\",\"CIM_Fan.DesiredControlMode\"]'"
	 * @generated
	 */
	Integer getControlMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Fan#getControlMode <em>Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Mode</em>' attribute.
	 * @see #getControlMode()
	 * @generated
	 */
	void setControlMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Control Modes Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ControlModesSupported indicates the supported control modes of the Fan: automatic or manual. In Automatic mode the Fan is controlled automatically in management function below the CIM. In Manual mode, the fan speed may be controlled by the CIM user by the SetSpeed method. Changing from Automatic to Manual, would not generally cause the speed to change. Changing from Manual to Automatic may cause the fan speed to change depending on the Thermal conditions of the system and the thermal management function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Modes Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Fan_ControlModesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Automatic\",\"Manual\",\"DMTF Reserved\",\"Vendor Specified\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_Fan.ControlMode\",\"CIM_Fan.DesiredControlMode\"]'"
	 * @generated
	 */
	EList<Integer> getControlModesSupported();

	/**
	 * Returns the value of the '<em><b>Desired Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DesiredControlMode is an integer enumeration indicating the last requested or desired control mode for the fan. The actual control mode is represented by ControlMode. The property is provided to compare the last requested and the current control mode. Refer to the ControlMode property Description for explanations of the values in the DesiredControlMode enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Desired Control Mode</em>' attribute.
	 * @see #setDesiredControlMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Fan_DesiredControlMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"2\",\"3\",\"4..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Automatic\",\"Manual\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_Fan.ControlModesSupported\"]'"
	 * @generated
	 */
	Integer getDesiredControlMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Fan#getDesiredControlMode <em>Desired Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Control Mode</em>' attribute.
	 * @see #getDesiredControlMode()
	 * @generated
	 */
	void setDesiredControlMode(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that requests that the Fan speed be set to the value specified in the input parameter of the method. The return value should be: 
	 * 0 if the request was successfully executed 
	 * 1 if the request is not supported 
	 * 2 if the request is not valid for the current mode 
	 * 3 if the requested speed is not currently valid 
	 * Some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can also be specified in the subclass as a Values array qualifier.
	 * @param DesiredSpeed The desired speed for the fan.
	 * <!-- end-model-doc -->
	 * @model DesiredSpeedAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_Fan.DesiredSpeed\"]'"
	 * @generated
	 */
	Long SetSpeed(Long DesiredSpeed);

} // CIM_Fan

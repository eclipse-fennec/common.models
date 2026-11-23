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
 * A representation of the model object '<em><b>CIM Indicator LED Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LEDCapabilities describes the capabilities supported for managing the associated LED.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IndicatorLEDCapabilities#getSupportedIndicatedConditions <em>Supported Indicated Conditions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicatorLEDCapabilities#getOtherSupportedIndicatedConditionDescriptions <em>Other Supported Indicated Condition Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicatorLEDCapabilities#getSupportedControlModes <em>Supported Control Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicatorLEDCapabilities#getSupportedColors <em>Supported Colors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicatorLEDCapabilities#getOtherSupportedColorDescriptions <em>Other Supported Color Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicatorLEDCapabilities#getSupportedControlPatterns <em>Supported Control Patterns</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicatorLEDCapabilities#getSupportedActivationStates <em>Supported Activation States</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLEDCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.35.1' UMLPackagePath='CIM::Device::LED' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_IndicatorLEDCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Supported Indicated Conditions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The conditions that may be indicated by the LED.See CIM_IndicatorLED.IndicatedConditions for a description of the values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Indicated Conditions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLEDCapabilities_SupportedIndicatedConditions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Location\",\"Attention\",\"Activity\",\"Powered On\",\"Fault\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedIndicatedConditions();

	/**
	 * Returns the value of the '<em><b>Other Supported Indicated Condition Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array index of this property shall have a value if the corresponding array index of SupportedIndicatedConditions contains the value 1 "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Indicated Condition Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLEDCapabilities_OtherSupportedIndicatedConditionDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_IndicatorLEDCapabilities.SupportedIndicatedConditions\",\"CIM_IndicatorLED.OtherIndicatedConditionDescription\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedIndicatedConditionDescriptions();

	/**
	 * Returns the value of the '<em><b>Supported Control Modes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupportedControlModes indicates the control modes supported for the LED.See CIM_IndicatorLED.ControlMode for more information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Control Modes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLEDCapabilities_SupportedControlModes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Automatic\",\"Manual\",\"Test\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_IndicatorLED.ControlMode\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedControlModes();

	/**
	 * Returns the value of the '<em><b>Supported Colors</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the colors supported by the associated instance of CIM_IndicatorLED.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Colors</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLEDCapabilities_SupportedColors()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"White\",\"Red\",\"Green\",\"Blue\",\"Orange\",\"Yellow\",\"Black\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_IndicatorLED.Color\",\"CIM_IndicatorLEDCapabilities.OtherSupportedColorDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedColors();

	/**
	 * Returns the value of the '<em><b>Other Supported Color Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array index of this property shall have a value if the corresponding array index of SupportedColors contains the value 1 "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Color Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLEDCapabilities_OtherSupportedColorDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_IndicatorLEDCapabilities.SupportedColors\",\"CIM_IndicatorLED.OtherColorDescription\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedColorDescriptions();

	/**
	 * Returns the value of the '<em><b>Supported Control Patterns</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupportedControlPatterns describes the control patterns supported by the associated LED. The values of SupportedControlPatterns may be an exact match for values allowed for CIM_IndicatorLED.ControlPattern or may indicate general categories of behavior. The interpretation of value is specific to the business entity identified by <OrgID>. 
	 * Each value of SupportedControlPatterns shall be constructed using the following "preferred" algorithm: <OrgID>::<Pattern> 
	 * Where <OrgID> and < Pattern> are separated by two colons (::), and where <OrgID> shall include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the ControlPattern or that is a registered ID assigned to the business entity by a recognized global authority. <Pattern> is chosen by the business entity and shall not be reused to identify different underlying (real-world) behaviors. If the behavior specified for the LED adheres to a standard or proprietary specification, <Pattern> shall be a uniquely assigned value identifying the behavior. If the behavior for the LED is described using a standard or proprietary grammar, <Pattern> shall be prefixed with a uniquely assigned identifier for the grammar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Control Patterns</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLEDCapabilities_SupportedControlPatterns()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_IndicatorLED.ControlPattern\"]'"
	 * @generated
	 */
	EList<String> getSupportedControlPatterns();

	/**
	 * Returns the value of the '<em><b>Supported Activation States</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupportedActivationStates indicates the supported activation states for the associated IndicatorLED. See CIM_IndicatorLED.ActivationState for descriptions of the values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Activation States</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLEDCapabilities_SupportedActivationStates()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Lit\",\"Blinking\",\"Off\",\"Control Pattern\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_IndicatorLED.ActivationState\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedActivationStates();

} // CIM_IndicatorLEDCapabilities

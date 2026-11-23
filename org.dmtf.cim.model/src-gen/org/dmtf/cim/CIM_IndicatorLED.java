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
 * A representation of the model object '<em><b>CIM Indicator LED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_IndicatorLED represents an LED of a managed element used to indicate one or more conditions for the managed element. A single discrete package may be represented by one or more instances of CIM_IndicatorLED. There may be an instance of CIM_IndicatorLED for each IndicatedCondition that may be indicated simultaneously by the discrete package. For example, if a single LED is capable of flashing yellow for one condition and blue for a different one, but the conditions are not indicated simultaneously, it is modeled using a single instance of CIM_IndicatorLED that supports both colors. If the LED indicated both conditions simultaneously, i.e. the package was lit yellow and blue simultaneously, there would be two instances of CIM_IndicatorLED.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IndicatorLED#getIndicatedConditions <em>Indicated Conditions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicatorLED#getOtherIndicatedConditionDescription <em>Other Indicated Condition Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicatorLED#getColor <em>Color</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicatorLED#getOtherColorDescription <em>Other Color Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicatorLED#getControlMode <em>Control Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicatorLED#getDefaultActivationState <em>Default Activation State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicatorLED#getActivationState <em>Activation State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IndicatorLED#getControlPattern <em>Control Pattern</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLED()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.39.0' UMLPackagePath='CIM::Device::Sensors' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_IndicatorLED extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Indicated Conditions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The condition indicated by the LED. 2 "Not Applicable" shall indicate the LED is currently not assigned an interpretation. 
	 * 3 "Location" shall indicate the location of associated managed elements.
	 * 4 "Attention" shall indicate that the associated managed elements requires the attention of service personnel.
	 * 5 "Activity" shall indicate that activity is occurring for the associated managed elements. The type of activity indicated is specific to the associated managed elements.
	 * 6 "Powered On" shall indicate that the associated managed elements are receiving power. 
	 * 7 "Fault" shall indicate that the associated managed elements are in a fault, error, or otherwise degraded state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indicated Conditions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLED_IndicatedConditions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"Location\",\"Attention\",\"Activity\",\"Powered On\",\"Fault\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_IndicatorLED.OtherIndicatedConditionDescription\"]'"
	 * @generated
	 */
	EList<Integer> getIndicatedConditions();

	/**
	 * Returns the value of the '<em><b>Other Indicated Condition Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property shall have a value if IndicatedConditions contains the value 1 "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Indicated Condition Description</em>' attribute.
	 * @see #setOtherIndicatedConditionDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLED_OtherIndicatedConditionDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_IndicatorLED.IndicatedConditions\"]'"
	 * @generated
	 */
	String getOtherIndicatedConditionDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicatorLED#getOtherIndicatedConditionDescription <em>Other Indicated Condition Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Indicated Condition Description</em>' attribute.
	 * @see #getOtherIndicatedConditionDescription()
	 * @generated
	 */
	void setOtherIndicatedConditionDescription(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property shall indicate the current color of the LED. If the value of the ActivationState property is 4 "Off" this property shall indicate the color of the LED the last time it was lit, or shall have the value 2 "Not Applicable".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLED_Color()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"White\",\"Red\",\"Green\",\"Blue\",\"Orange\",\"Yellow\",\"Black\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_IndicatorLED.OtherColorDescription\",\"CIM_IndicatorLEDCapabilities.SupportedColors\"]'"
	 * @generated
	 */
	Integer getColor();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicatorLED#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Color Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property shall have a value if Color contains the value 1 "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Color Description</em>' attribute.
	 * @see #setOtherColorDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLED_OtherColorDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_IndicatorLED.Color\",\"CIM_IndicatorLEDCapabilities.OtherSupportedColorDescriptions\"]'"
	 * @generated
	 */
	String getOtherColorDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicatorLED#getOtherColorDescription <em>Other Color Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Color Description</em>' attribute.
	 * @see #getOtherColorDescription()
	 * @generated
	 */
	void setOtherColorDescription(String value);

	/**
	 * Returns the value of the '<em><b>Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ControlMode indicates the current control mode for the LED.2 "Automatic" shall indicate the state of the LED is being controlled by the management infrastructure. 3 "Manual" shall indicate the state of the LED is being controlled by a management client. 4 "Test" shall indicate the LED is in a test mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Mode</em>' attribute.
	 * @see #setControlMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLED_ControlMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Automatic\",\"Manual\",\"Test\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_IndicatorLEDCapabilities.SupportedControlModes\"]'"
	 * @generated
	 */
	Integer getControlMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicatorLED#getControlMode <em>Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Mode</em>' attribute.
	 * @see #getControlMode()
	 * @generated
	 */
	void setControlMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Default Activation State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DefaultActivationState indicates the default state of an LED. See ActivationState for a description of the values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Activation State</em>' attribute.
	 * @see #setDefaultActivationState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLED_DefaultActivationState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Lit\",\"Blinking\",\"Off\",\"Control Pattern\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getDefaultActivationState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicatorLED#getDefaultActivationState <em>Default Activation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Activation State</em>' attribute.
	 * @see #getDefaultActivationState()
	 * @generated
	 */
	void setDefaultActivationState(Integer value);

	/**
	 * Returns the value of the '<em><b>Activation State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivationState indicates the current activity of an LED. An LED may exhibit behaviors that vary greatly in complexity. If the behavior of the LED is simple or a detailed depiction of the behavior is unnecessary to convey to client applications, values of than 5 "ControlPattern" may be used to indicate the behavior. If the behavior is complex and detailed information about the behavior is meaningful to a client, the value 5 "ControlPattern" shall be used to indicate the ControlPattern property describes the behavior. 
	 * 2 "Lit" shall indicate the LED is continuously illuminated without variation in color or intensity. 3 "Blinking" shall indicate the LED is alternating between illuminated and not illuminated in a regular pattern without variation in color or intensity. The pattern is not indicated. 
	 * 4 "Off" shall indicate the LED is not illuminated. 5 "ControlPattern" shall indicate the LED is exhibiting behavior that is described using the ControlPattern property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activation State</em>' attribute.
	 * @see #setActivationState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLED_ActivationState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Lit\",\"Blinking\",\"Off\",\"Control Pattern\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_IndicatorLED.ControlPattern\",\"CIM_IndicatorLEDCapabilities.SupportedActivationStates\"]'"
	 * @generated
	 */
	Integer getActivationState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicatorLED#getActivationState <em>Activation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation State</em>' attribute.
	 * @see #getActivationState()
	 * @generated
	 */
	void setActivationState(Integer value);

	/**
	 * Returns the value of the '<em><b>Control Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An LED may exhibit a range of behavior from very simple (ex. solid on) to very complicated (ex. a series of blinks of alternating color and duration). ControlPattern specifies the vendor or standard behavior exhibited by the LED if it cannot be described using one of the standard behaviors listed for the ActivationState property. 
	 * If ActivationState has the value 5 "ControlPattern", the ControlPattern property shall not be NULL. 
	 * The value of ControlPattern shall be constructed using the following "preferred" algorithm: <OrgID>::<Pattern> 
	 * Where <OrgID> and < Pattern> are separated by two colons (::), and where <OrgID> shall include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the ControlPattern or that is a registered ID assigned to the business entity by a recognized global authority. If the definition of the value is specified by the DMTF, the value of <OrgID> shall be "DMTF". <Pattern> is chosen by the business entity and shall not be reused to identify different underlying (real-world) behaviors. If the behavior specified for the LED adheres to a standard or proprietary specification, <Pattern> shall be a uniquely assigned value identifying the behavior. If the behavior for the LED is described using a standard or proprietary grammar, <Pattern> shall be prefixed with a uniquely assigned identifier for the grammar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Pattern</em>' attribute.
	 * @see #setControlPattern(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IndicatorLED_ControlPattern()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_IndicatorLED.ActivationState\",\"CIM_IndicatorLEDCapabilities.SupportedControlPatterns\"]'"
	 * @generated
	 */
	String getControlPattern();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IndicatorLED#getControlPattern <em>Control Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Pattern</em>' attribute.
	 * @see #getControlPattern()
	 * @generated
	 */
	void setControlPattern(String value);

} // CIM_IndicatorLED

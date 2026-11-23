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
 * A representation of the model object '<em><b>CIM Alarm Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An AlarmDevice is a type of Device that emits audible or visible indications related to a problem situation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AlarmDevice#getAudibleAlarm <em>Audible Alarm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlarmDevice#getVisibleAlarm <em>Visible Alarm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlarmDevice#getMotionAlarm <em>Motion Alarm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlarmDevice#getUrgency <em>Urgency</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlarmDevice#getAlarmState <em>Alarm State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlarmDevice#getAudioIndicatorIsDisabled <em>Audio Indicator Is Disabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlarmDevice#getVisualIndicatorIsDisabled <em>Visual Indicator Is Disabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AlarmDevice#getMotionIndicatorIsDisabled <em>Motion Indicator Is Disabled</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AlarmDevice()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Device::Sensors' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_AlarmDevice extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Audible Alarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the Alarm is audible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audible Alarm</em>' attribute.
	 * @see #setAudibleAlarm(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlarmDevice_AudibleAlarm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAudibleAlarm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlarmDevice#getAudibleAlarm <em>Audible Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audible Alarm</em>' attribute.
	 * @see #getAudibleAlarm()
	 * @generated
	 */
	void setAudibleAlarm(Boolean value);

	/**
	 * Returns the value of the '<em><b>Visible Alarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the Alarm is visible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visible Alarm</em>' attribute.
	 * @see #setVisibleAlarm(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlarmDevice_VisibleAlarm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getVisibleAlarm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlarmDevice#getVisibleAlarm <em>Visible Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Alarm</em>' attribute.
	 * @see #getVisibleAlarm()
	 * @generated
	 */
	void setVisibleAlarm(Boolean value);

	/**
	 * Returns the value of the '<em><b>Motion Alarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the Alarm causes motion of the Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Motion Alarm</em>' attribute.
	 * @see #setMotionAlarm(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlarmDevice_MotionAlarm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getMotionAlarm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlarmDevice#getMotionAlarm <em>Motion Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motion Alarm</em>' attribute.
	 * @see #getMotionAlarm()
	 * @generated
	 */
	void setMotionAlarm(Boolean value);

	/**
	 * Returns the value of the '<em><b>Urgency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Urgency is an enumerated value that indicates the relative frequency at which the Alarm flashes, vibrates and/or emits audible tones.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Urgency</em>' attribute.
	 * @see #setUrgency(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlarmDevice_Urgency()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"Other\",\"Not Supported\",\"Informational\",\"Non-Critical\",\"Critical\",\"Unrecoverable\"]'"
	 * @generated
	 */
	Integer getUrgency();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlarmDevice#getUrgency <em>Urgency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urgency</em>' attribute.
	 * @see #getUrgency()
	 * @generated
	 */
	void setUrgency(Integer value);

	/**
	 * Returns the value of the '<em><b>Alarm State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of the alarm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alarm State</em>' attribute.
	 * @see #setAlarmState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlarmDevice_AlarmState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Off\",\"Steady\",\"Alternating\"]'"
	 * @generated
	 */
	Integer getAlarmState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlarmDevice#getAlarmState <em>Alarm State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alarm State</em>' attribute.
	 * @see #getAlarmState()
	 * @generated
	 */
	void setAlarmState(Integer value);

	/**
	 * Returns the value of the '<em><b>Audio Indicator Is Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the audio of an AlarmState indicator has been disabled (i.e. muted). A disabled state here does not imply that the AlarmState is off.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audio Indicator Is Disabled</em>' attribute.
	 * @see #setAudioIndicatorIsDisabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlarmDevice_AudioIndicatorIsDisabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAudioIndicatorIsDisabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlarmDevice#getAudioIndicatorIsDisabled <em>Audio Indicator Is Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audio Indicator Is Disabled</em>' attribute.
	 * @see #getAudioIndicatorIsDisabled()
	 * @generated
	 */
	void setAudioIndicatorIsDisabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Visual Indicator Is Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the visual of an AlarmState indicator has been disabled (i.e. dimmed). A disabled state here does not imply that the AlarmState is off.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visual Indicator Is Disabled</em>' attribute.
	 * @see #setVisualIndicatorIsDisabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlarmDevice_VisualIndicatorIsDisabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getVisualIndicatorIsDisabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlarmDevice#getVisualIndicatorIsDisabled <em>Visual Indicator Is Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Indicator Is Disabled</em>' attribute.
	 * @see #getVisualIndicatorIsDisabled()
	 * @generated
	 */
	void setVisualIndicatorIsDisabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Motion Indicator Is Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the motion of an AlarmState indicator has been disabled (i.e. stopped). A disabled state here does not imply that the AlarmState is off.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Motion Indicator Is Disabled</em>' attribute.
	 * @see #setMotionIndicatorIsDisabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_AlarmDevice_MotionIndicatorIsDisabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getMotionIndicatorIsDisabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AlarmDevice#getMotionIndicatorIsDisabled <em>Motion Indicator Is Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motion Indicator Is Disabled</em>' attribute.
	 * @see #getMotionIndicatorIsDisabled()
	 * @generated
	 */
	void setMotionIndicatorIsDisabled(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SetAlarmState is a method for defining the current state of the Alarm. Its input parameter, RequestedAlarmState, is specified using the Values list of AlarmDevice's AlarmState property. SetAlarmState returns 0 if the request is successfully implemented, 1 if the specified RequestedAlarm State is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes should be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' should be specified as a Values array qualifier.
	 * @param RequestedAlarmState The desired state for the alarm.
	 * <!-- end-model-doc -->
	 * @model RequestedAlarmStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Off\",\"Steady\",\"Alternating\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long SetAlarmState(Integer RequestedAlarmState);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SetAlarmIndicator is a method for enabling or disabling the indicator of the AlarmState function, without changing the current AlarmState. It has 3 input parameters, Audio Indicator, VisualIndicator and MotionIndicator. For all of the input parameters, a value of 0 indicates no change to the AlarmState indicator, 1 indicates Disable, and 2 indicates Enable. The method returns 0 if the request is successfully implemented, 1 if the specified request is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes should be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' should be specified as a Values array qualifier.
	 * @param AudioIndicator The state for the audio indicator.
	 * @param VisualIndicator The state for the visual indicator.
	 * @param MotionIndicator The state for the motion indicator.
	 * <!-- end-model-doc -->
	 * @model AudioIndicatorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"No Change\",\"Disable\",\"Enable\"]'" VisualIndicatorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"No Change\",\"Disable\",\"Enable\"]'" MotionIndicatorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"No Change\",\"Disable\",\"Enable\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long SetAlarmIndicator(Integer AudioIndicator, Integer VisualIndicator, Integer MotionIndicator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SetUrgency is a method for defining the desired urgency level for the Alarm. Its input parameter, RequestedUrgency, is specified using the Values list of AlarmDevice's Urgency property. SetUrgency returns 0 if the request is successfully implemented, 1 if the specified Urgency level is not supported, and some other value if any other error occurred. In a subclass, the set of possible return codes should be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' should be specified as a Values array qualifier.
	 * @param RequestedUrgency Desired urgency for the alarm.
	 * <!-- end-model-doc -->
	 * @model RequestedUrgencyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"1\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Other\",\"Informational\",\"Non-Critical\",\"Critical\",\"Unrecoverable\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long SetUrgency(Integer RequestedUrgency);

} // CIM_AlarmDevice

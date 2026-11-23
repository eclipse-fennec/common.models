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
 * A representation of the model object '<em><b>CIM Enabled Logical Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class extends LogicalElement to abstract the concept of an element that is enabled and disabled, such as a LogicalDevice or a ServiceAccessPoint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_EnabledLogicalElement#getEnabledState <em>Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EnabledLogicalElement#getOtherEnabledState <em>Other Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EnabledLogicalElement#getRequestedState <em>Requested State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EnabledLogicalElement#getEnabledDefault <em>Enabled Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EnabledLogicalElement#getTimeOfLastStateChange <em>Time Of Last State Change</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EnabledLogicalElement#getAvailableRequestedStates <em>Available Requested States</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EnabledLogicalElement#getTransitioningToState <em>Transitioning To State</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EnabledLogicalElement()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.22.0' UMLPackagePath='CIM::Core::CoreElements'"
 * @generated
 */
@ProviderType
public interface CIM_EnabledLogicalElement extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>Enabled State</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnabledState is an integer enumeration that indicates the enabled and disabled states of an element. It can also indicate the transitions between these requested states. For example, shutting down (value=4) and starting (value=10) are transient states between enabled and disabled. The following text briefly summarizes the various enabled and disabled states: 
	 * Enabled (2) indicates that the element is or could be executing commands, will process any queued commands, and queues new requests. 
	 * Disabled (3) indicates that the element will not execute commands and will drop any new requests. 
	 * Shutting Down (4) indicates that the element is in the process of going to a Disabled state. 
	 * Not Applicable (5) indicates the element does not support being enabled or disabled. 
	 * Enabled but Offline (6) indicates that the element might be completing commands, and will drop any new requests. 
	 * Test (7) indicates that the element is in a test state. 
	 * Deferred (8) indicates that the element might be completing commands, but will queue any new requests. 
	 * Quiesce (9) indicates that the element is enabled but in a restricted mode.
	 * Starting (10) indicates that the element is in the process of going to an Enabled state. New requests are queued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled State</em>' attribute.
	 * @see #setEnabledState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EnabledLogicalElement_EnabledState()
	 * @model default="5"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Enabled\",\"Disabled\",\"Shutting Down\",\"Not Applicable\",\"Enabled but Offline\",\"In Test\",\"Deferred\",\"Quiesce\",\"Starting\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_EnabledLogicalElement.OtherEnabledState\"]'"
	 * @generated
	 */
	Integer getEnabledState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EnabledLogicalElement#getEnabledState <em>Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled State</em>' attribute.
	 * @see #getEnabledState()
	 * @generated
	 */
	void setEnabledState(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Enabled State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the enabled or disabled state of the element when the EnabledState property is set to 1 ("Other"). This property must be set to null when EnabledState is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Enabled State</em>' attribute.
	 * @see #setOtherEnabledState(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EnabledLogicalElement_OtherEnabledState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_EnabledLogicalElement.EnabledState\"]'"
	 * @generated
	 */
	String getOtherEnabledState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EnabledLogicalElement#getOtherEnabledState <em>Other Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Enabled State</em>' attribute.
	 * @see #getOtherEnabledState()
	 * @generated
	 */
	void setOtherEnabledState(String value);

	/**
	 * Returns the value of the '<em><b>Requested State</b></em>' attribute.
	 * The default value is <code>"12"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RequestedState is an integer enumeration that indicates the last requested or desired state for the element, irrespective of the mechanism through which it was requested. The actual state of the element is represented by EnabledState. This property is provided to compare the last requested and current enabled or disabled states. Note that when EnabledState is set to 5 ("Not Applicable"), then this property has no meaning. Refer to the EnabledState property description for explanations of the values in the RequestedState enumeration. 
	 * "Unknown" (0) indicates the last requested state for the element is unknown.
	 * Note that the value "No Change" (5) has been deprecated in lieu of indicating the last requested state is "Unknown" (0). If the last requested or desired state is unknown, RequestedState should have the value "Unknown" (0), but may have the value "No Change" (5).Offline (6) indicates that the element has been requested to transition to the Enabled but Offline EnabledState. 
	 * It should be noted that there are two new values in RequestedState that build on the statuses of EnabledState. These are "Reboot" (10) and "Reset" (11). Reboot refers to doing a "Shut Down" and then moving to an "Enabled" state. Reset indicates that the element is first "Disabled" and then "Enabled". The distinction between requesting "Shut Down" and "Disabled" should also be noted. Shut Down requests an orderly transition to the Disabled state, and might involve removing power, to completely erase any existing state. The Disabled state requests an immediate disabling of the element, such that it will not execute or accept any commands or processing requests. 
	 * 
	 * This property is set as the result of a method invocation (such as Start or StopService on CIM_Service), or can be overridden and defined as WRITEable in a subclass. The method approach is considered superior to a WRITEable property, because it allows an explicit invocation of the operation and the return of a result code. 
	 * 
	 * If knowledge of the last RequestedState is not supported for the EnabledLogicalElement, the property shall be NULL or have the value 12 "Not Applicable".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested State</em>' attribute.
	 * @see #setRequestedState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EnabledLogicalElement_RequestedState()
	 * @model default="12"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Enabled\",\"Disabled\",\"Shut Down\",\"No Change\",\"Offline\",\"Test\",\"Deferred\",\"Quiesce\",\"Reboot\",\"Reset\",\"Not Applicable\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_EnabledLogicalElement.EnabledState\"]'"
	 * @generated
	 */
	Integer getRequestedState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EnabledLogicalElement#getRequestedState <em>Requested State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested State</em>' attribute.
	 * @see #getRequestedState()
	 * @generated
	 */
	void setRequestedState(Integer value);

	/**
	 * Returns the value of the '<em><b>Enabled Default</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value indicating an administrator's default or startup configuration for the Enabled State of an element. By default, the element is "Enabled" (value=2).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Default</em>' attribute.
	 * @see #setEnabledDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EnabledLogicalElement_EnabledDefault()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"5\",\"6\",\"7\",\"9\",\"..\",\"32768..65535\"]' Values='[\"Enabled\",\"Disabled\",\"Not Applicable\",\"Enabled but Offline\",\"No Default\",\"Quiesce\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getEnabledDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EnabledLogicalElement#getEnabledDefault <em>Enabled Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled Default</em>' attribute.
	 * @see #getEnabledDefault()
	 * @generated
	 */
	void setEnabledDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>Time Of Last State Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date or time when the EnabledState of the element last changed. If the state of the element has not changed and this property is populated, then it must be set to a 0 interval value. If a state change was requested, but rejected or not yet processed, the property must not be updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Of Last State Change</em>' attribute.
	 * @see #setTimeOfLastStateChange(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EnabledLogicalElement_TimeOfLastStateChange()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeOfLastStateChange();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EnabledLogicalElement#getTimeOfLastStateChange <em>Time Of Last State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Last State Change</em>' attribute.
	 * @see #getTimeOfLastStateChange()
	 * @generated
	 */
	void setTimeOfLastStateChange(String value);

	/**
	 * Returns the value of the '<em><b>Available Requested States</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AvailableRequestedStates indicates the possible values for the RequestedState parameter of the method RequestStateChange, used to initiate a state change. The values listed shall be a subset of the values contained in the RequestedStatesSupported property of the associated instance of CIM_EnabledLogicalElementCapabilities where the values selected are a function of the current state of the CIM_EnabledLogicalElement. This property may be non-null if an implementation is able to advertise the set of possible values as a function of the current state. This property shall be null if an implementation is unable to determine the set of possible values as a function of the current state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Requested States</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EnabledLogicalElement_AvailableRequestedStates()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\"]' Values='[\"Enabled\",\"Disabled\",\"Shut Down\",\"Offline\",\"Test\",\"Defer\",\"Quiesce\",\"Reboot\",\"Reset\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_EnabledLogicalElement.RequestStateChange\",\"CIM_EnabledLogicalElementCapabilities.RequestedStatesSupported\"]'"
	 * @generated
	 */
	EList<Integer> getAvailableRequestedStates();

	/**
	 * Returns the value of the '<em><b>Transitioning To State</b></em>' attribute.
	 * The default value is <code>"12"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TransitioningToState indicates the target state to which the instance is transitioning. 
	 * A value of 5 "No Change" shall indicate that no transition is in progress.A value of 12 "Not Applicable" shall indicate the implementation does not support representing ongoing transitions. 
	 * A value other than 5 or 12 shall identify the state to which the element is in the process of transitioning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transitioning To State</em>' attribute.
	 * @see #setTransitioningToState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EnabledLogicalElement_TransitioningToState()
	 * @model default="12"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\"]' Values='[\"Unknown\",\"Enabled\",\"Disabled\",\"Shut Down\",\"No Change\",\"Offline\",\"Test\",\"Defer\",\"Quiesce\",\"Reboot\",\"Reset\",\"Not Applicable\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_EnabledLogicalElement.RequestStateChange\",\"CIM_EnabledLogicalElement.RequestedState\",\"CIM_EnabledLogicalElement.EnabledState\"]'"
	 * @generated
	 */
	Integer getTransitioningToState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EnabledLogicalElement#getTransitioningToState <em>Transitioning To State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitioning To State</em>' attribute.
	 * @see #getTransitioningToState()
	 * @generated
	 */
	void setTransitioningToState(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests that the state of the element be changed to the value specified in the RequestedState parameter. When the requested state change takes place, the EnabledState and RequestedState of the element will be the same. Invoking the RequestStateChange method multiple times could result in earlier requests being overwritten or lost. 
	 * A return code of 0 shall indicate the state change was successfully initiated. 
	 * A return code of 3 shall indicate that the state transition cannot complete within the interval specified by the TimeoutPeriod parameter. 
	 * A return code of 4096 (0x1000) shall indicate the state change was successfully initiated, a ConcreteJob has been created, and its reference returned in the output parameter Job. Any other return code indicates an error condition.
	 * @param RequestedState The state requested for the element. This information will be placed into the RequestedState property of the instance if the return code of the RequestStateChange method is 0 ('Completed with No Error'), or 4096 (0x1000) ('Job Started'). Refer to the description of the EnabledState and RequestedState properties for the detailed explanations of the RequestedState values.
	 * @param Job May contain a reference to the ConcreteJob created to track the state transition initiated by the method invocation.
	 * @param TimeoutPeriod
	 *   A timeout period that specifies the maximum amount of time that the client expects the transition to the new state to take. The interval format must be used to specify the TimeoutPeriod. A value of 0 or a null parameter indicates that the client has no time requirements for the transition. 
	 *   If this property does not contain 0 or null and the implementation does not support this parameter, a return code of 'Use Of Timeout Parameter Not Supported' shall be returned.
	 * <!-- end-model-doc -->
	 * @model RequestedStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' ValueMap='[\"2\",\"3\",\"4\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"32768..65535\"]' Values='[\"Enabled\",\"Disabled\",\"Shut Down\",\"Offline\",\"Test\",\"Defer\",\"Quiesce\",\"Reboot\",\"Reset\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_EnabledLogicalElement.RequestedState\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TimeoutPeriodAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown or Unspecified Error\",\"Cannot complete within Timeout Period\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Invalid State Transition\",\"Use of Timeout Parameter Not Supported\",\"Busy\",\"Method Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_EnabledLogicalElement.RequestedState\"]'"
	 * @generated
	 */
	Long RequestStateChange(Integer RequestedState, CIM_ConcreteJob Job, String TimeoutPeriod);

} // CIM_EnabledLogicalElement

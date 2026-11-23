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
 * A representation of the model object '<em><b>CIM POTS Modem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The POTSModem class represents a Device that translates binary data into wave modulations for sound-based transmission. It connects to the POTS (Plain Old Telephone System) network.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getEnabledCapabilities <em>Enabled Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getMaxBaudRateToSerialPort <em>Max Baud Rate To Serial Port</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getMaxBaudRateToPhone <em>Max Baud Rate To Phone</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getSupportsSynchronousConnect <em>Supports Synchronous Connect</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getDialType <em>Dial Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getInactivityTimeout <em>Inactivity Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getSpeakerVolumeInfo <em>Speaker Volume Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getCountriesSupported <em>Countries Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getCountrySelected <em>Country Selected</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getRingsBeforeAnswer <em>Rings Before Answer</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getMaxNumberOfPasswords <em>Max Number Of Passwords</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getCurrentPasswords <em>Current Passwords</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getSupportsCallback <em>Supports Callback</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getAnswerMode <em>Answer Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getEqualization <em>Equalization</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_POTSModem#getBlackListedNumbers <em>Black Listed Numbers</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::Modems' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_POTSModem extends CIM_CallBasedModem {
	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities of the POTSModem. For example, the Device might support distinctive ring, caller ID, fax, voice, and so on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\"]' Values='[\"Unknown\",\"Other\",\"Distinctive Ring\",\"Caller ID\",\"Voice\",\"Fax Class 1\",\"Fax Class 2\",\"WakeOnRing\",\"Fax Group 3\",\"GSM Support\",\"AMPS Support\",\"OOB Alerting\",\"Worldwide Country Support\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_POTSModem.CapabilityDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Capability Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings that provides more detailed explanations for any of the POTSModem features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_CapabilityDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_POTSModem.Capabilities\"]'"
	 * @generated
	 */
	EList<String> getCapabilityDescriptions();

	/**
	 * Returns the value of the '<em><b>Enabled Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies which capabilities from the list of those supported are enabled and defined in the Capabilities array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_EnabledCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\"]' Values='[\"Unknown\",\"Other\",\"Distinctive Ring\",\"Caller ID\",\"Voice\",\"Fax Class 1\",\"Fax Class 2\",\"WakeOnRing\",\"Fax Group 3\",\"GSM Support\",\"AMPS Support\",\"OOB Alerting\",\"Worldwide Country Support\"]' ModelCorrespondence='[\"CIM_POTSModem.Capabilities\"]'"
	 * @generated
	 */
	EList<Integer> getEnabledCapabilities();

	/**
	 * Returns the value of the '<em><b>Max Baud Rate To Serial Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the maximum communication speed to the COM Port for an external modem that can be set. Enter 0 if not applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Baud Rate To Serial Port</em>' attribute.
	 * @see #setMaxBaudRateToSerialPort(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_MaxBaudRateToSerialPort()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bits per Second' PUnit='bit / second'"
	 * @generated
	 */
	Long getMaxBaudRateToSerialPort();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_POTSModem#getMaxBaudRateToSerialPort <em>Max Baud Rate To Serial Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Baud Rate To Serial Port</em>' attribute.
	 * @see #getMaxBaudRateToSerialPort()
	 * @generated
	 */
	void setMaxBaudRateToSerialPort(Long value);

	/**
	 * Returns the value of the '<em><b>Max Baud Rate To Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the maximum communication speed for accessing the phone system that can be set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Baud Rate To Phone</em>' attribute.
	 * @see #setMaxBaudRateToPhone(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_MaxBaudRateToPhone()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Bits per Second' PUnit='bit / second'"
	 * @generated
	 */
	Long getMaxBaudRateToPhone();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_POTSModem#getMaxBaudRateToPhone <em>Max Baud Rate To Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Baud Rate To Phone</em>' attribute.
	 * @see #getMaxBaudRateToPhone()
	 * @generated
	 */
	void setMaxBaudRateToPhone(Long value);

	/**
	 * Returns the value of the '<em><b>Supports Synchronous Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean that indicates that synchronous, as well as asynchronous, communication is supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supports Synchronous Connect</em>' attribute.
	 * @see #setSupportsSynchronousConnect(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_SupportsSynchronousConnect()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSupportsSynchronousConnect();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_POTSModem#getSupportsSynchronousConnect <em>Supports Synchronous Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Synchronous Connect</em>' attribute.
	 * @see #getSupportsSynchronousConnect()
	 * @generated
	 */
	void setSupportsSynchronousConnect(Boolean value);

	/**
	 * Returns the value of the '<em><b>Dial Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DialType is an integer that indicates whether tone (value=1) or pulse dialing (value=2) is used. "Unknown" (0) can also be defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dial Type</em>' attribute.
	 * @see #setDialType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_DialType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"Tone\",\"Pulse\"]'"
	 * @generated
	 */
	Integer getDialType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_POTSModem#getDialType <em>Dial Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dial Type</em>' attribute.
	 * @see #getDialType()
	 * @generated
	 */
	void setDialType(Integer value);

	/**
	 * Returns the value of the '<em><b>Inactivity Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InactivityTimeout defines the time limit (in seconds) for automatic disconnection of the phone line, if no data is exchanged. A value of 0 indicates that this feature is present but not enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inactivity Timeout</em>' attribute.
	 * @see #setInactivityTimeout(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_InactivityTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getInactivityTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_POTSModem#getInactivityTimeout <em>Inactivity Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactivity Timeout</em>' attribute.
	 * @see #getInactivityTimeout()
	 * @generated
	 */
	void setInactivityTimeout(Long value);

	/**
	 * Returns the value of the '<em><b>Speaker Volume Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the volume level of the audible tones from the Modem. For example, high, medium, or low volume can be reported (values 3, 4, or 5, respectively).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speaker Volume Info</em>' attribute.
	 * @see #setSpeakerVolumeInfo(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_SpeakerVolumeInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"Other\",\"Not Supported\",\"High\",\"Medium\",\"Low\",\"Off\",\"Auto\"]'"
	 * @generated
	 */
	Integer getSpeakerVolumeInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_POTSModem#getSpeakerVolumeInfo <em>Speaker Volume Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speaker Volume Info</em>' attribute.
	 * @see #getSpeakerVolumeInfo()
	 * @generated
	 */
	void setSpeakerVolumeInfo(Integer value);

	/**
	 * Returns the value of the '<em><b>Countries Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CountriesSupported is an array of strings that defines the countries in which the POTSModem operates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Countries Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_CountriesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='64'"
	 * @generated
	 */
	EList<String> getCountriesSupported();

	/**
	 * Returns the value of the '<em><b>Country Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CountrySelected is a string value that defines the country for which the Modem is currently programmed. When multiple countries are supported, this property defines which one is currently selected for use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country Selected</em>' attribute.
	 * @see #setCountrySelected(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_CountrySelected()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64'"
	 * @generated
	 */
	String getCountrySelected();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_POTSModem#getCountrySelected <em>Country Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Selected</em>' attribute.
	 * @see #getCountrySelected()
	 * @generated
	 */
	void setCountrySelected(String value);

	/**
	 * Returns the value of the '<em><b>Rings Before Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of rings before the Modem answers an incoming call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rings Before Answer</em>' attribute.
	 * @see #setRingsBeforeAnswer(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_RingsBeforeAnswer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getRingsBeforeAnswer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_POTSModem#getRingsBeforeAnswer <em>Rings Before Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rings Before Answer</em>' attribute.
	 * @see #getRingsBeforeAnswer()
	 * @generated
	 */
	void setRingsBeforeAnswer(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Number Of Passwords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxNumberOfPasswords specifies the number of passwords that can be defined in the Modem itself. If this feature is not supported, enter 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Number Of Passwords</em>' attribute.
	 * @see #setMaxNumberOfPasswords(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_MaxNumberOfPasswords()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaxNumberOfPasswords();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_POTSModem#getMaxNumberOfPasswords <em>Max Number Of Passwords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Passwords</em>' attribute.
	 * @see #getMaxNumberOfPasswords()
	 * @generated
	 */
	void setMaxNumberOfPasswords(Integer value);

	/**
	 * Returns the value of the '<em><b>Current Passwords</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CurrentPasswords is an array that contains the currently defined passwords for the Modem. This array might be left blank for security reasons.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Passwords</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_CurrentPasswords()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='24'"
	 * @generated
	 */
	EList<String> getCurrentPasswords();

	/**
	 * Returns the value of the '<em><b>Supports Callback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication of whether the Modem supports call-back.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supports Callback</em>' attribute.
	 * @see #setSupportsCallback(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_SupportsCallback()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSupportsCallback();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_POTSModem#getSupportsCallback <em>Supports Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports Callback</em>' attribute.
	 * @see #getSupportsCallback()
	 * @generated
	 */
	void setSupportsCallback(Boolean value);

	/**
	 * Returns the value of the '<em><b>Answer Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AnswerMode defines the current auto-answer or call-back setting for the Modem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Answer Mode</em>' attribute.
	 * @see #setAnswerMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_AnswerMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Disabled\",\"Manual Answer\",\"Auto Answer\",\"Auto Answer with Call-Back\"]'"
	 * @generated
	 */
	Integer getAnswerMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_POTSModem#getAnswerMode <em>Answer Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer Mode</em>' attribute.
	 * @see #getAnswerMode()
	 * @generated
	 */
	void setAnswerMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Equalization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current equalization setting for the Modem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Equalization</em>' attribute.
	 * @see #setEqualization(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_Equalization()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Other\",\"Long\",\"Short\"]'"
	 * @generated
	 */
	Integer getEqualization();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_POTSModem#getEqualization <em>Equalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equalization</em>' attribute.
	 * @see #getEqualization()
	 * @generated
	 */
	void setEqualization(Integer value);

	/**
	 * Returns the value of the '<em><b>Black Listed Numbers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of black-listed numbers for the Modem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Black Listed Numbers</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_POTSModem_BlackListedNumbers()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getBlackListedNumbers();

} // CIM_POTSModem

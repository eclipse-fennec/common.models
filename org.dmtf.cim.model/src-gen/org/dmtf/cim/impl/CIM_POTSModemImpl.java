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
package org.dmtf.cim.impl;

import java.util.Collection;

import org.dmtf.cim.CIM_POTSModem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM POTS Modem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getEnabledCapabilities <em>Enabled Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getMaxBaudRateToSerialPort <em>Max Baud Rate To Serial Port</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getMaxBaudRateToPhone <em>Max Baud Rate To Phone</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getSupportsSynchronousConnect <em>Supports Synchronous Connect</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getDialType <em>Dial Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getInactivityTimeout <em>Inactivity Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getSpeakerVolumeInfo <em>Speaker Volume Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getCountriesSupported <em>Countries Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getCountrySelected <em>Country Selected</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getRingsBeforeAnswer <em>Rings Before Answer</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getMaxNumberOfPasswords <em>Max Number Of Passwords</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getCurrentPasswords <em>Current Passwords</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getSupportsCallback <em>Supports Callback</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getAnswerMode <em>Answer Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getEqualization <em>Equalization</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_POTSModemImpl#getBlackListedNumbers <em>Black Listed Numbers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_POTSModemImpl extends CIM_CallBasedModemImpl implements CIM_POTSModem {
	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> capabilities;

	/**
	 * The cached value of the '{@link #getCapabilityDescriptions() <em>Capability Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> capabilityDescriptions;

	/**
	 * The cached value of the '{@link #getEnabledCapabilities() <em>Enabled Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> enabledCapabilities;

	/**
	 * The default value of the '{@link #getMaxBaudRateToSerialPort() <em>Max Baud Rate To Serial Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBaudRateToSerialPort()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_BAUD_RATE_TO_SERIAL_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxBaudRateToSerialPort() <em>Max Baud Rate To Serial Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBaudRateToSerialPort()
	 * @generated
	 * @ordered
	 */
	protected Long maxBaudRateToSerialPort = MAX_BAUD_RATE_TO_SERIAL_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxBaudRateToPhone() <em>Max Baud Rate To Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBaudRateToPhone()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_BAUD_RATE_TO_PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxBaudRateToPhone() <em>Max Baud Rate To Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBaudRateToPhone()
	 * @generated
	 * @ordered
	 */
	protected Long maxBaudRateToPhone = MAX_BAUD_RATE_TO_PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupportsSynchronousConnect() <em>Supports Synchronous Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsSynchronousConnect()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPORTS_SYNCHRONOUS_CONNECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportsSynchronousConnect() <em>Supports Synchronous Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsSynchronousConnect()
	 * @generated
	 * @ordered
	 */
	protected Boolean supportsSynchronousConnect = SUPPORTS_SYNCHRONOUS_CONNECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDialType() <em>Dial Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIAL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDialType() <em>Dial Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialType()
	 * @generated
	 * @ordered
	 */
	protected Integer dialType = DIAL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInactivityTimeout() <em>Inactivity Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactivityTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final Long INACTIVITY_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInactivityTimeout() <em>Inactivity Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactivityTimeout()
	 * @generated
	 * @ordered
	 */
	protected Long inactivityTimeout = INACTIVITY_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeakerVolumeInfo() <em>Speaker Volume Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeakerVolumeInfo()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SPEAKER_VOLUME_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpeakerVolumeInfo() <em>Speaker Volume Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeakerVolumeInfo()
	 * @generated
	 * @ordered
	 */
	protected Integer speakerVolumeInfo = SPEAKER_VOLUME_INFO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCountriesSupported() <em>Countries Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountriesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<String> countriesSupported;

	/**
	 * The default value of the '{@link #getCountrySelected() <em>Country Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountrySelected()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_SELECTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountrySelected() <em>Country Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountrySelected()
	 * @generated
	 * @ordered
	 */
	protected String countrySelected = COUNTRY_SELECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRingsBeforeAnswer() <em>Rings Before Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingsBeforeAnswer()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RINGS_BEFORE_ANSWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRingsBeforeAnswer() <em>Rings Before Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingsBeforeAnswer()
	 * @generated
	 * @ordered
	 */
	protected Integer ringsBeforeAnswer = RINGS_BEFORE_ANSWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumberOfPasswords() <em>Max Number Of Passwords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfPasswords()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_NUMBER_OF_PASSWORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumberOfPasswords() <em>Max Number Of Passwords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberOfPasswords()
	 * @generated
	 * @ordered
	 */
	protected Integer maxNumberOfPasswords = MAX_NUMBER_OF_PASSWORDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrentPasswords() <em>Current Passwords</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPasswords()
	 * @generated
	 * @ordered
	 */
	protected EList<String> currentPasswords;

	/**
	 * The default value of the '{@link #getSupportsCallback() <em>Supports Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsCallback()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUPPORTS_CALLBACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportsCallback() <em>Supports Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportsCallback()
	 * @generated
	 * @ordered
	 */
	protected Boolean supportsCallback = SUPPORTS_CALLBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnswerMode() <em>Answer Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ANSWER_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnswerMode() <em>Answer Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerMode()
	 * @generated
	 * @ordered
	 */
	protected Integer answerMode = ANSWER_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEqualization() <em>Equalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualization()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EQUALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEqualization() <em>Equalization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualization()
	 * @generated
	 * @ordered
	 */
	protected Integer equalization = EQUALIZATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBlackListedNumbers() <em>Black Listed Numbers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlackListedNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> blackListedNumbers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_POTSModemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_POTSModem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_POTS_MODEM__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCapabilityDescriptions() {
		if (capabilityDescriptions == null) {
			capabilityDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_POTS_MODEM__CAPABILITY_DESCRIPTIONS);
		}
		return capabilityDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getEnabledCapabilities() {
		if (enabledCapabilities == null) {
			enabledCapabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_POTS_MODEM__ENABLED_CAPABILITIES);
		}
		return enabledCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxBaudRateToSerialPort() {
		return maxBaudRateToSerialPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxBaudRateToSerialPort(Long newMaxBaudRateToSerialPort) {
		Long oldMaxBaudRateToSerialPort = maxBaudRateToSerialPort;
		maxBaudRateToSerialPort = newMaxBaudRateToSerialPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POTS_MODEM__MAX_BAUD_RATE_TO_SERIAL_PORT, oldMaxBaudRateToSerialPort, maxBaudRateToSerialPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxBaudRateToPhone() {
		return maxBaudRateToPhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxBaudRateToPhone(Long newMaxBaudRateToPhone) {
		Long oldMaxBaudRateToPhone = maxBaudRateToPhone;
		maxBaudRateToPhone = newMaxBaudRateToPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POTS_MODEM__MAX_BAUD_RATE_TO_PHONE, oldMaxBaudRateToPhone, maxBaudRateToPhone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSupportsSynchronousConnect() {
		return supportsSynchronousConnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportsSynchronousConnect(Boolean newSupportsSynchronousConnect) {
		Boolean oldSupportsSynchronousConnect = supportsSynchronousConnect;
		supportsSynchronousConnect = newSupportsSynchronousConnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POTS_MODEM__SUPPORTS_SYNCHRONOUS_CONNECT, oldSupportsSynchronousConnect, supportsSynchronousConnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDialType() {
		return dialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDialType(Integer newDialType) {
		Integer oldDialType = dialType;
		dialType = newDialType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POTS_MODEM__DIAL_TYPE, oldDialType, dialType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInactivityTimeout() {
		return inactivityTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInactivityTimeout(Long newInactivityTimeout) {
		Long oldInactivityTimeout = inactivityTimeout;
		inactivityTimeout = newInactivityTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POTS_MODEM__INACTIVITY_TIMEOUT, oldInactivityTimeout, inactivityTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSpeakerVolumeInfo() {
		return speakerVolumeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeakerVolumeInfo(Integer newSpeakerVolumeInfo) {
		Integer oldSpeakerVolumeInfo = speakerVolumeInfo;
		speakerVolumeInfo = newSpeakerVolumeInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POTS_MODEM__SPEAKER_VOLUME_INFO, oldSpeakerVolumeInfo, speakerVolumeInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCountriesSupported() {
		if (countriesSupported == null) {
			countriesSupported = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_POTS_MODEM__COUNTRIES_SUPPORTED);
		}
		return countriesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountrySelected() {
		return countrySelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountrySelected(String newCountrySelected) {
		String oldCountrySelected = countrySelected;
		countrySelected = newCountrySelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POTS_MODEM__COUNTRY_SELECTED, oldCountrySelected, countrySelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRingsBeforeAnswer() {
		return ringsBeforeAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRingsBeforeAnswer(Integer newRingsBeforeAnswer) {
		Integer oldRingsBeforeAnswer = ringsBeforeAnswer;
		ringsBeforeAnswer = newRingsBeforeAnswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POTS_MODEM__RINGS_BEFORE_ANSWER, oldRingsBeforeAnswer, ringsBeforeAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxNumberOfPasswords() {
		return maxNumberOfPasswords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNumberOfPasswords(Integer newMaxNumberOfPasswords) {
		Integer oldMaxNumberOfPasswords = maxNumberOfPasswords;
		maxNumberOfPasswords = newMaxNumberOfPasswords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POTS_MODEM__MAX_NUMBER_OF_PASSWORDS, oldMaxNumberOfPasswords, maxNumberOfPasswords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCurrentPasswords() {
		if (currentPasswords == null) {
			currentPasswords = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_POTS_MODEM__CURRENT_PASSWORDS);
		}
		return currentPasswords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSupportsCallback() {
		return supportsCallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportsCallback(Boolean newSupportsCallback) {
		Boolean oldSupportsCallback = supportsCallback;
		supportsCallback = newSupportsCallback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POTS_MODEM__SUPPORTS_CALLBACK, oldSupportsCallback, supportsCallback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAnswerMode() {
		return answerMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnswerMode(Integer newAnswerMode) {
		Integer oldAnswerMode = answerMode;
		answerMode = newAnswerMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POTS_MODEM__ANSWER_MODE, oldAnswerMode, answerMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEqualization() {
		return equalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEqualization(Integer newEqualization) {
		Integer oldEqualization = equalization;
		equalization = newEqualization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POTS_MODEM__EQUALIZATION, oldEqualization, equalization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getBlackListedNumbers() {
		if (blackListedNumbers == null) {
			blackListedNumbers = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_POTS_MODEM__BLACK_LISTED_NUMBERS);
		}
		return blackListedNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POTS_MODEM__CAPABILITIES:
				return getCapabilities();
			case CimPackage.CIM_POTS_MODEM__CAPABILITY_DESCRIPTIONS:
				return getCapabilityDescriptions();
			case CimPackage.CIM_POTS_MODEM__ENABLED_CAPABILITIES:
				return getEnabledCapabilities();
			case CimPackage.CIM_POTS_MODEM__MAX_BAUD_RATE_TO_SERIAL_PORT:
				return getMaxBaudRateToSerialPort();
			case CimPackage.CIM_POTS_MODEM__MAX_BAUD_RATE_TO_PHONE:
				return getMaxBaudRateToPhone();
			case CimPackage.CIM_POTS_MODEM__SUPPORTS_SYNCHRONOUS_CONNECT:
				return getSupportsSynchronousConnect();
			case CimPackage.CIM_POTS_MODEM__DIAL_TYPE:
				return getDialType();
			case CimPackage.CIM_POTS_MODEM__INACTIVITY_TIMEOUT:
				return getInactivityTimeout();
			case CimPackage.CIM_POTS_MODEM__SPEAKER_VOLUME_INFO:
				return getSpeakerVolumeInfo();
			case CimPackage.CIM_POTS_MODEM__COUNTRIES_SUPPORTED:
				return getCountriesSupported();
			case CimPackage.CIM_POTS_MODEM__COUNTRY_SELECTED:
				return getCountrySelected();
			case CimPackage.CIM_POTS_MODEM__RINGS_BEFORE_ANSWER:
				return getRingsBeforeAnswer();
			case CimPackage.CIM_POTS_MODEM__MAX_NUMBER_OF_PASSWORDS:
				return getMaxNumberOfPasswords();
			case CimPackage.CIM_POTS_MODEM__CURRENT_PASSWORDS:
				return getCurrentPasswords();
			case CimPackage.CIM_POTS_MODEM__SUPPORTS_CALLBACK:
				return getSupportsCallback();
			case CimPackage.CIM_POTS_MODEM__ANSWER_MODE:
				return getAnswerMode();
			case CimPackage.CIM_POTS_MODEM__EQUALIZATION:
				return getEqualization();
			case CimPackage.CIM_POTS_MODEM__BLACK_LISTED_NUMBERS:
				return getBlackListedNumbers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_POTS_MODEM__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				getCapabilityDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__ENABLED_CAPABILITIES:
				getEnabledCapabilities().clear();
				getEnabledCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__MAX_BAUD_RATE_TO_SERIAL_PORT:
				setMaxBaudRateToSerialPort((Long)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__MAX_BAUD_RATE_TO_PHONE:
				setMaxBaudRateToPhone((Long)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__SUPPORTS_SYNCHRONOUS_CONNECT:
				setSupportsSynchronousConnect((Boolean)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__DIAL_TYPE:
				setDialType((Integer)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__INACTIVITY_TIMEOUT:
				setInactivityTimeout((Long)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__SPEAKER_VOLUME_INFO:
				setSpeakerVolumeInfo((Integer)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__COUNTRIES_SUPPORTED:
				getCountriesSupported().clear();
				getCountriesSupported().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__COUNTRY_SELECTED:
				setCountrySelected((String)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__RINGS_BEFORE_ANSWER:
				setRingsBeforeAnswer((Integer)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__MAX_NUMBER_OF_PASSWORDS:
				setMaxNumberOfPasswords((Integer)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__CURRENT_PASSWORDS:
				getCurrentPasswords().clear();
				getCurrentPasswords().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__SUPPORTS_CALLBACK:
				setSupportsCallback((Boolean)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__ANSWER_MODE:
				setAnswerMode((Integer)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__EQUALIZATION:
				setEqualization((Integer)newValue);
				return;
			case CimPackage.CIM_POTS_MODEM__BLACK_LISTED_NUMBERS:
				getBlackListedNumbers().clear();
				getBlackListedNumbers().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_POTS_MODEM__CAPABILITIES:
				getCapabilities().clear();
				return;
			case CimPackage.CIM_POTS_MODEM__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				return;
			case CimPackage.CIM_POTS_MODEM__ENABLED_CAPABILITIES:
				getEnabledCapabilities().clear();
				return;
			case CimPackage.CIM_POTS_MODEM__MAX_BAUD_RATE_TO_SERIAL_PORT:
				setMaxBaudRateToSerialPort(MAX_BAUD_RATE_TO_SERIAL_PORT_EDEFAULT);
				return;
			case CimPackage.CIM_POTS_MODEM__MAX_BAUD_RATE_TO_PHONE:
				setMaxBaudRateToPhone(MAX_BAUD_RATE_TO_PHONE_EDEFAULT);
				return;
			case CimPackage.CIM_POTS_MODEM__SUPPORTS_SYNCHRONOUS_CONNECT:
				setSupportsSynchronousConnect(SUPPORTS_SYNCHRONOUS_CONNECT_EDEFAULT);
				return;
			case CimPackage.CIM_POTS_MODEM__DIAL_TYPE:
				setDialType(DIAL_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_POTS_MODEM__INACTIVITY_TIMEOUT:
				setInactivityTimeout(INACTIVITY_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_POTS_MODEM__SPEAKER_VOLUME_INFO:
				setSpeakerVolumeInfo(SPEAKER_VOLUME_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_POTS_MODEM__COUNTRIES_SUPPORTED:
				getCountriesSupported().clear();
				return;
			case CimPackage.CIM_POTS_MODEM__COUNTRY_SELECTED:
				setCountrySelected(COUNTRY_SELECTED_EDEFAULT);
				return;
			case CimPackage.CIM_POTS_MODEM__RINGS_BEFORE_ANSWER:
				setRingsBeforeAnswer(RINGS_BEFORE_ANSWER_EDEFAULT);
				return;
			case CimPackage.CIM_POTS_MODEM__MAX_NUMBER_OF_PASSWORDS:
				setMaxNumberOfPasswords(MAX_NUMBER_OF_PASSWORDS_EDEFAULT);
				return;
			case CimPackage.CIM_POTS_MODEM__CURRENT_PASSWORDS:
				getCurrentPasswords().clear();
				return;
			case CimPackage.CIM_POTS_MODEM__SUPPORTS_CALLBACK:
				setSupportsCallback(SUPPORTS_CALLBACK_EDEFAULT);
				return;
			case CimPackage.CIM_POTS_MODEM__ANSWER_MODE:
				setAnswerMode(ANSWER_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_POTS_MODEM__EQUALIZATION:
				setEqualization(EQUALIZATION_EDEFAULT);
				return;
			case CimPackage.CIM_POTS_MODEM__BLACK_LISTED_NUMBERS:
				getBlackListedNumbers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_POTS_MODEM__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case CimPackage.CIM_POTS_MODEM__CAPABILITY_DESCRIPTIONS:
				return capabilityDescriptions != null && !capabilityDescriptions.isEmpty();
			case CimPackage.CIM_POTS_MODEM__ENABLED_CAPABILITIES:
				return enabledCapabilities != null && !enabledCapabilities.isEmpty();
			case CimPackage.CIM_POTS_MODEM__MAX_BAUD_RATE_TO_SERIAL_PORT:
				return MAX_BAUD_RATE_TO_SERIAL_PORT_EDEFAULT == null ? maxBaudRateToSerialPort != null : !MAX_BAUD_RATE_TO_SERIAL_PORT_EDEFAULT.equals(maxBaudRateToSerialPort);
			case CimPackage.CIM_POTS_MODEM__MAX_BAUD_RATE_TO_PHONE:
				return MAX_BAUD_RATE_TO_PHONE_EDEFAULT == null ? maxBaudRateToPhone != null : !MAX_BAUD_RATE_TO_PHONE_EDEFAULT.equals(maxBaudRateToPhone);
			case CimPackage.CIM_POTS_MODEM__SUPPORTS_SYNCHRONOUS_CONNECT:
				return SUPPORTS_SYNCHRONOUS_CONNECT_EDEFAULT == null ? supportsSynchronousConnect != null : !SUPPORTS_SYNCHRONOUS_CONNECT_EDEFAULT.equals(supportsSynchronousConnect);
			case CimPackage.CIM_POTS_MODEM__DIAL_TYPE:
				return DIAL_TYPE_EDEFAULT == null ? dialType != null : !DIAL_TYPE_EDEFAULT.equals(dialType);
			case CimPackage.CIM_POTS_MODEM__INACTIVITY_TIMEOUT:
				return INACTIVITY_TIMEOUT_EDEFAULT == null ? inactivityTimeout != null : !INACTIVITY_TIMEOUT_EDEFAULT.equals(inactivityTimeout);
			case CimPackage.CIM_POTS_MODEM__SPEAKER_VOLUME_INFO:
				return SPEAKER_VOLUME_INFO_EDEFAULT == null ? speakerVolumeInfo != null : !SPEAKER_VOLUME_INFO_EDEFAULT.equals(speakerVolumeInfo);
			case CimPackage.CIM_POTS_MODEM__COUNTRIES_SUPPORTED:
				return countriesSupported != null && !countriesSupported.isEmpty();
			case CimPackage.CIM_POTS_MODEM__COUNTRY_SELECTED:
				return COUNTRY_SELECTED_EDEFAULT == null ? countrySelected != null : !COUNTRY_SELECTED_EDEFAULT.equals(countrySelected);
			case CimPackage.CIM_POTS_MODEM__RINGS_BEFORE_ANSWER:
				return RINGS_BEFORE_ANSWER_EDEFAULT == null ? ringsBeforeAnswer != null : !RINGS_BEFORE_ANSWER_EDEFAULT.equals(ringsBeforeAnswer);
			case CimPackage.CIM_POTS_MODEM__MAX_NUMBER_OF_PASSWORDS:
				return MAX_NUMBER_OF_PASSWORDS_EDEFAULT == null ? maxNumberOfPasswords != null : !MAX_NUMBER_OF_PASSWORDS_EDEFAULT.equals(maxNumberOfPasswords);
			case CimPackage.CIM_POTS_MODEM__CURRENT_PASSWORDS:
				return currentPasswords != null && !currentPasswords.isEmpty();
			case CimPackage.CIM_POTS_MODEM__SUPPORTS_CALLBACK:
				return SUPPORTS_CALLBACK_EDEFAULT == null ? supportsCallback != null : !SUPPORTS_CALLBACK_EDEFAULT.equals(supportsCallback);
			case CimPackage.CIM_POTS_MODEM__ANSWER_MODE:
				return ANSWER_MODE_EDEFAULT == null ? answerMode != null : !ANSWER_MODE_EDEFAULT.equals(answerMode);
			case CimPackage.CIM_POTS_MODEM__EQUALIZATION:
				return EQUALIZATION_EDEFAULT == null ? equalization != null : !EQUALIZATION_EDEFAULT.equals(equalization);
			case CimPackage.CIM_POTS_MODEM__BLACK_LISTED_NUMBERS:
				return blackListedNumbers != null && !blackListedNumbers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Capabilities: ");
		result.append(capabilities);
		result.append(", CapabilityDescriptions: ");
		result.append(capabilityDescriptions);
		result.append(", EnabledCapabilities: ");
		result.append(enabledCapabilities);
		result.append(", MaxBaudRateToSerialPort: ");
		result.append(maxBaudRateToSerialPort);
		result.append(", MaxBaudRateToPhone: ");
		result.append(maxBaudRateToPhone);
		result.append(", SupportsSynchronousConnect: ");
		result.append(supportsSynchronousConnect);
		result.append(", DialType: ");
		result.append(dialType);
		result.append(", InactivityTimeout: ");
		result.append(inactivityTimeout);
		result.append(", SpeakerVolumeInfo: ");
		result.append(speakerVolumeInfo);
		result.append(", CountriesSupported: ");
		result.append(countriesSupported);
		result.append(", CountrySelected: ");
		result.append(countrySelected);
		result.append(", RingsBeforeAnswer: ");
		result.append(ringsBeforeAnswer);
		result.append(", MaxNumberOfPasswords: ");
		result.append(maxNumberOfPasswords);
		result.append(", CurrentPasswords: ");
		result.append(currentPasswords);
		result.append(", SupportsCallback: ");
		result.append(supportsCallback);
		result.append(", AnswerMode: ");
		result.append(answerMode);
		result.append(", Equalization: ");
		result.append(equalization);
		result.append(", BlackListedNumbers: ");
		result.append(blackListedNumbers);
		result.append(')');
		return result.toString();
	}

} //CIM_POTSModemImpl

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

import org.dmtf.cim.CIM_FibrePort;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Fibre Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getAddressIdentifier <em>Address Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getSupportedPortTypes <em>Supported Port Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getPortTypeVersions <em>Port Type Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getEnabledPortTypes <em>Enabled Port Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getEnabledVersions <em>Enabled Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getCurrentPortType <em>Current Port Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getCurrentVersion <em>Current Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getAliasAddresses <em>Alias Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getLossOfSignalCounter <em>Loss Of Signal Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getLossOfSyncCounter <em>Loss Of Sync Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getCRCErrors <em>CRC Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getInvalidTransmissionWords <em>Invalid Transmission Words</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getFramesTooShort <em>Frames Too Short</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getFramesTooLong <em>Frames Too Long</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getElasticityBufferUnderruns <em>Elasticity Buffer Underruns</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getElasticityBufferOverruns <em>Elasticity Buffer Overruns</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getReceiverTransmitterTimeout <em>Receiver Transmitter Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getBypassedState <em>Bypassed State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibrePortImpl#getConnectedMedia <em>Connected Media</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FibrePortImpl extends CIM_LogicalPortImpl implements CIM_FibrePort {
	/**
	 * The default value of the '{@link #getAddressIdentifier() <em>Address Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final Long ADDRESS_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressIdentifier() <em>Address Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Long addressIdentifier = ADDRESS_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedPortTypes() <em>Supported Port Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedPortTypes;

	/**
	 * The cached value of the '{@link #getPortTypeVersions() <em>Port Type Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortTypeVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> portTypeVersions;

	/**
	 * The cached value of the '{@link #getEnabledPortTypes() <em>Enabled Port Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> enabledPortTypes;

	/**
	 * The cached value of the '{@link #getEnabledVersions() <em>Enabled Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> enabledVersions;

	/**
	 * The default value of the '{@link #getCurrentPortType() <em>Current Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPortType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_PORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentPortType() <em>Current Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPortType()
	 * @generated
	 * @ordered
	 */
	protected Integer currentPortType = CURRENT_PORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentVersion() <em>Current Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentVersion() <em>Current Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentVersion()
	 * @generated
	 * @ordered
	 */
	protected String currentVersion = CURRENT_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAliasAddresses() <em>Alias Addresses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> aliasAddresses;

	/**
	 * The default value of the '{@link #getLossOfSignalCounter() <em>Loss Of Signal Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossOfSignalCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOSS_OF_SIGNAL_COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLossOfSignalCounter() <em>Loss Of Signal Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossOfSignalCounter()
	 * @generated
	 * @ordered
	 */
	protected Long lossOfSignalCounter = LOSS_OF_SIGNAL_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLossOfSyncCounter() <em>Loss Of Sync Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossOfSyncCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOSS_OF_SYNC_COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLossOfSyncCounter() <em>Loss Of Sync Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLossOfSyncCounter()
	 * @generated
	 * @ordered
	 */
	protected Long lossOfSyncCounter = LOSS_OF_SYNC_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCRCErrors() <em>CRC Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRCErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long CRC_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCRCErrors() <em>CRC Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRCErrors()
	 * @generated
	 * @ordered
	 */
	protected Long crcErrors = CRC_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvalidTransmissionWords() <em>Invalid Transmission Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidTransmissionWords()
	 * @generated
	 * @ordered
	 */
	protected static final Long INVALID_TRANSMISSION_WORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvalidTransmissionWords() <em>Invalid Transmission Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidTransmissionWords()
	 * @generated
	 * @ordered
	 */
	protected Long invalidTransmissionWords = INVALID_TRANSMISSION_WORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFramesTooShort() <em>Frames Too Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramesTooShort()
	 * @generated
	 * @ordered
	 */
	protected static final Long FRAMES_TOO_SHORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFramesTooShort() <em>Frames Too Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramesTooShort()
	 * @generated
	 * @ordered
	 */
	protected Long framesTooShort = FRAMES_TOO_SHORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFramesTooLong() <em>Frames Too Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramesTooLong()
	 * @generated
	 * @ordered
	 */
	protected static final Long FRAMES_TOO_LONG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFramesTooLong() <em>Frames Too Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramesTooLong()
	 * @generated
	 * @ordered
	 */
	protected Long framesTooLong = FRAMES_TOO_LONG_EDEFAULT;

	/**
	 * The default value of the '{@link #getElasticityBufferUnderruns() <em>Elasticity Buffer Underruns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticityBufferUnderruns()
	 * @generated
	 * @ordered
	 */
	protected static final Long ELASTICITY_BUFFER_UNDERRUNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElasticityBufferUnderruns() <em>Elasticity Buffer Underruns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticityBufferUnderruns()
	 * @generated
	 * @ordered
	 */
	protected Long elasticityBufferUnderruns = ELASTICITY_BUFFER_UNDERRUNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getElasticityBufferOverruns() <em>Elasticity Buffer Overruns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticityBufferOverruns()
	 * @generated
	 * @ordered
	 */
	protected static final Long ELASTICITY_BUFFER_OVERRUNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElasticityBufferOverruns() <em>Elasticity Buffer Overruns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticityBufferOverruns()
	 * @generated
	 * @ordered
	 */
	protected Long elasticityBufferOverruns = ELASTICITY_BUFFER_OVERRUNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiverTransmitterTimeout() <em>Receiver Transmitter Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverTransmitterTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECEIVER_TRANSMITTER_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiverTransmitterTimeout() <em>Receiver Transmitter Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverTransmitterTimeout()
	 * @generated
	 * @ordered
	 */
	protected Long receiverTransmitterTimeout = RECEIVER_TRANSMITTER_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBypassedState() <em>Bypassed State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBypassedState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BYPASSED_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBypassedState() <em>Bypassed State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBypassedState()
	 * @generated
	 * @ordered
	 */
	protected Integer bypassedState = BYPASSED_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectedMedia() <em>Connected Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedMedia()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONNECTED_MEDIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectedMedia() <em>Connected Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedMedia()
	 * @generated
	 * @ordered
	 */
	protected Integer connectedMedia = CONNECTED_MEDIA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FibrePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FibrePort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAddressIdentifier() {
		return addressIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressIdentifier(Long newAddressIdentifier) {
		Long oldAddressIdentifier = addressIdentifier;
		addressIdentifier = newAddressIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT__ADDRESS_IDENTIFIER, oldAddressIdentifier, addressIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedPortTypes() {
		if (supportedPortTypes == null) {
			supportedPortTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FIBRE_PORT__SUPPORTED_PORT_TYPES);
		}
		return supportedPortTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPortTypeVersions() {
		if (portTypeVersions == null) {
			portTypeVersions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_FIBRE_PORT__PORT_TYPE_VERSIONS);
		}
		return portTypeVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getEnabledPortTypes() {
		if (enabledPortTypes == null) {
			enabledPortTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FIBRE_PORT__ENABLED_PORT_TYPES);
		}
		return enabledPortTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEnabledVersions() {
		if (enabledVersions == null) {
			enabledVersions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_FIBRE_PORT__ENABLED_VERSIONS);
		}
		return enabledVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentPortType() {
		return currentPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentPortType(Integer newCurrentPortType) {
		Integer oldCurrentPortType = currentPortType;
		currentPortType = newCurrentPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT__CURRENT_PORT_TYPE, oldCurrentPortType, currentPortType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentVersion() {
		return currentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentVersion(String newCurrentVersion) {
		String oldCurrentVersion = currentVersion;
		currentVersion = newCurrentVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT__CURRENT_VERSION, oldCurrentVersion, currentVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getAliasAddresses() {
		if (aliasAddresses == null) {
			aliasAddresses = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_FIBRE_PORT__ALIAS_ADDRESSES);
		}
		return aliasAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLossOfSignalCounter() {
		return lossOfSignalCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLossOfSignalCounter(Long newLossOfSignalCounter) {
		Long oldLossOfSignalCounter = lossOfSignalCounter;
		lossOfSignalCounter = newLossOfSignalCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT__LOSS_OF_SIGNAL_COUNTER, oldLossOfSignalCounter, lossOfSignalCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLossOfSyncCounter() {
		return lossOfSyncCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLossOfSyncCounter(Long newLossOfSyncCounter) {
		Long oldLossOfSyncCounter = lossOfSyncCounter;
		lossOfSyncCounter = newLossOfSyncCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT__LOSS_OF_SYNC_COUNTER, oldLossOfSyncCounter, lossOfSyncCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCRCErrors() {
		return crcErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCRCErrors(Long newCRCErrors) {
		Long oldCRCErrors = crcErrors;
		crcErrors = newCRCErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT__CRC_ERRORS, oldCRCErrors, crcErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInvalidTransmissionWords() {
		return invalidTransmissionWords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvalidTransmissionWords(Long newInvalidTransmissionWords) {
		Long oldInvalidTransmissionWords = invalidTransmissionWords;
		invalidTransmissionWords = newInvalidTransmissionWords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT__INVALID_TRANSMISSION_WORDS, oldInvalidTransmissionWords, invalidTransmissionWords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFramesTooShort() {
		return framesTooShort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFramesTooShort(Long newFramesTooShort) {
		Long oldFramesTooShort = framesTooShort;
		framesTooShort = newFramesTooShort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT__FRAMES_TOO_SHORT, oldFramesTooShort, framesTooShort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFramesTooLong() {
		return framesTooLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFramesTooLong(Long newFramesTooLong) {
		Long oldFramesTooLong = framesTooLong;
		framesTooLong = newFramesTooLong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT__FRAMES_TOO_LONG, oldFramesTooLong, framesTooLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getElasticityBufferUnderruns() {
		return elasticityBufferUnderruns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElasticityBufferUnderruns(Long newElasticityBufferUnderruns) {
		Long oldElasticityBufferUnderruns = elasticityBufferUnderruns;
		elasticityBufferUnderruns = newElasticityBufferUnderruns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT__ELASTICITY_BUFFER_UNDERRUNS, oldElasticityBufferUnderruns, elasticityBufferUnderruns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getElasticityBufferOverruns() {
		return elasticityBufferOverruns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElasticityBufferOverruns(Long newElasticityBufferOverruns) {
		Long oldElasticityBufferOverruns = elasticityBufferOverruns;
		elasticityBufferOverruns = newElasticityBufferOverruns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT__ELASTICITY_BUFFER_OVERRUNS, oldElasticityBufferOverruns, elasticityBufferOverruns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReceiverTransmitterTimeout() {
		return receiverTransmitterTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiverTransmitterTimeout(Long newReceiverTransmitterTimeout) {
		Long oldReceiverTransmitterTimeout = receiverTransmitterTimeout;
		receiverTransmitterTimeout = newReceiverTransmitterTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT__RECEIVER_TRANSMITTER_TIMEOUT, oldReceiverTransmitterTimeout, receiverTransmitterTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBypassedState() {
		return bypassedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBypassedState(Integer newBypassedState) {
		Integer oldBypassedState = bypassedState;
		bypassedState = newBypassedState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT__BYPASSED_STATE, oldBypassedState, bypassedState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConnectedMedia() {
		return connectedMedia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectedMedia(Integer newConnectedMedia) {
		Integer oldConnectedMedia = connectedMedia;
		connectedMedia = newConnectedMedia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_PORT__CONNECTED_MEDIA, oldConnectedMedia, connectedMedia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FIBRE_PORT__ADDRESS_IDENTIFIER:
				return getAddressIdentifier();
			case CimPackage.CIM_FIBRE_PORT__SUPPORTED_PORT_TYPES:
				return getSupportedPortTypes();
			case CimPackage.CIM_FIBRE_PORT__PORT_TYPE_VERSIONS:
				return getPortTypeVersions();
			case CimPackage.CIM_FIBRE_PORT__ENABLED_PORT_TYPES:
				return getEnabledPortTypes();
			case CimPackage.CIM_FIBRE_PORT__ENABLED_VERSIONS:
				return getEnabledVersions();
			case CimPackage.CIM_FIBRE_PORT__CURRENT_PORT_TYPE:
				return getCurrentPortType();
			case CimPackage.CIM_FIBRE_PORT__CURRENT_VERSION:
				return getCurrentVersion();
			case CimPackage.CIM_FIBRE_PORT__ALIAS_ADDRESSES:
				return getAliasAddresses();
			case CimPackage.CIM_FIBRE_PORT__LOSS_OF_SIGNAL_COUNTER:
				return getLossOfSignalCounter();
			case CimPackage.CIM_FIBRE_PORT__LOSS_OF_SYNC_COUNTER:
				return getLossOfSyncCounter();
			case CimPackage.CIM_FIBRE_PORT__CRC_ERRORS:
				return getCRCErrors();
			case CimPackage.CIM_FIBRE_PORT__INVALID_TRANSMISSION_WORDS:
				return getInvalidTransmissionWords();
			case CimPackage.CIM_FIBRE_PORT__FRAMES_TOO_SHORT:
				return getFramesTooShort();
			case CimPackage.CIM_FIBRE_PORT__FRAMES_TOO_LONG:
				return getFramesTooLong();
			case CimPackage.CIM_FIBRE_PORT__ELASTICITY_BUFFER_UNDERRUNS:
				return getElasticityBufferUnderruns();
			case CimPackage.CIM_FIBRE_PORT__ELASTICITY_BUFFER_OVERRUNS:
				return getElasticityBufferOverruns();
			case CimPackage.CIM_FIBRE_PORT__RECEIVER_TRANSMITTER_TIMEOUT:
				return getReceiverTransmitterTimeout();
			case CimPackage.CIM_FIBRE_PORT__BYPASSED_STATE:
				return getBypassedState();
			case CimPackage.CIM_FIBRE_PORT__CONNECTED_MEDIA:
				return getConnectedMedia();
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
			case CimPackage.CIM_FIBRE_PORT__ADDRESS_IDENTIFIER:
				setAddressIdentifier((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__SUPPORTED_PORT_TYPES:
				getSupportedPortTypes().clear();
				getSupportedPortTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__PORT_TYPE_VERSIONS:
				getPortTypeVersions().clear();
				getPortTypeVersions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__ENABLED_PORT_TYPES:
				getEnabledPortTypes().clear();
				getEnabledPortTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__ENABLED_VERSIONS:
				getEnabledVersions().clear();
				getEnabledVersions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__CURRENT_PORT_TYPE:
				setCurrentPortType((Integer)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__CURRENT_VERSION:
				setCurrentVersion((String)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__ALIAS_ADDRESSES:
				getAliasAddresses().clear();
				getAliasAddresses().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__LOSS_OF_SIGNAL_COUNTER:
				setLossOfSignalCounter((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__LOSS_OF_SYNC_COUNTER:
				setLossOfSyncCounter((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__CRC_ERRORS:
				setCRCErrors((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__INVALID_TRANSMISSION_WORDS:
				setInvalidTransmissionWords((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__FRAMES_TOO_SHORT:
				setFramesTooShort((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__FRAMES_TOO_LONG:
				setFramesTooLong((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__ELASTICITY_BUFFER_UNDERRUNS:
				setElasticityBufferUnderruns((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__ELASTICITY_BUFFER_OVERRUNS:
				setElasticityBufferOverruns((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__RECEIVER_TRANSMITTER_TIMEOUT:
				setReceiverTransmitterTimeout((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__BYPASSED_STATE:
				setBypassedState((Integer)newValue);
				return;
			case CimPackage.CIM_FIBRE_PORT__CONNECTED_MEDIA:
				setConnectedMedia((Integer)newValue);
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
			case CimPackage.CIM_FIBRE_PORT__ADDRESS_IDENTIFIER:
				setAddressIdentifier(ADDRESS_IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT__SUPPORTED_PORT_TYPES:
				getSupportedPortTypes().clear();
				return;
			case CimPackage.CIM_FIBRE_PORT__PORT_TYPE_VERSIONS:
				getPortTypeVersions().clear();
				return;
			case CimPackage.CIM_FIBRE_PORT__ENABLED_PORT_TYPES:
				getEnabledPortTypes().clear();
				return;
			case CimPackage.CIM_FIBRE_PORT__ENABLED_VERSIONS:
				getEnabledVersions().clear();
				return;
			case CimPackage.CIM_FIBRE_PORT__CURRENT_PORT_TYPE:
				setCurrentPortType(CURRENT_PORT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT__CURRENT_VERSION:
				setCurrentVersion(CURRENT_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT__ALIAS_ADDRESSES:
				getAliasAddresses().clear();
				return;
			case CimPackage.CIM_FIBRE_PORT__LOSS_OF_SIGNAL_COUNTER:
				setLossOfSignalCounter(LOSS_OF_SIGNAL_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT__LOSS_OF_SYNC_COUNTER:
				setLossOfSyncCounter(LOSS_OF_SYNC_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT__CRC_ERRORS:
				setCRCErrors(CRC_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT__INVALID_TRANSMISSION_WORDS:
				setInvalidTransmissionWords(INVALID_TRANSMISSION_WORDS_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT__FRAMES_TOO_SHORT:
				setFramesTooShort(FRAMES_TOO_SHORT_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT__FRAMES_TOO_LONG:
				setFramesTooLong(FRAMES_TOO_LONG_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT__ELASTICITY_BUFFER_UNDERRUNS:
				setElasticityBufferUnderruns(ELASTICITY_BUFFER_UNDERRUNS_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT__ELASTICITY_BUFFER_OVERRUNS:
				setElasticityBufferOverruns(ELASTICITY_BUFFER_OVERRUNS_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT__RECEIVER_TRANSMITTER_TIMEOUT:
				setReceiverTransmitterTimeout(RECEIVER_TRANSMITTER_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT__BYPASSED_STATE:
				setBypassedState(BYPASSED_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_PORT__CONNECTED_MEDIA:
				setConnectedMedia(CONNECTED_MEDIA_EDEFAULT);
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
			case CimPackage.CIM_FIBRE_PORT__ADDRESS_IDENTIFIER:
				return ADDRESS_IDENTIFIER_EDEFAULT == null ? addressIdentifier != null : !ADDRESS_IDENTIFIER_EDEFAULT.equals(addressIdentifier);
			case CimPackage.CIM_FIBRE_PORT__SUPPORTED_PORT_TYPES:
				return supportedPortTypes != null && !supportedPortTypes.isEmpty();
			case CimPackage.CIM_FIBRE_PORT__PORT_TYPE_VERSIONS:
				return portTypeVersions != null && !portTypeVersions.isEmpty();
			case CimPackage.CIM_FIBRE_PORT__ENABLED_PORT_TYPES:
				return enabledPortTypes != null && !enabledPortTypes.isEmpty();
			case CimPackage.CIM_FIBRE_PORT__ENABLED_VERSIONS:
				return enabledVersions != null && !enabledVersions.isEmpty();
			case CimPackage.CIM_FIBRE_PORT__CURRENT_PORT_TYPE:
				return CURRENT_PORT_TYPE_EDEFAULT == null ? currentPortType != null : !CURRENT_PORT_TYPE_EDEFAULT.equals(currentPortType);
			case CimPackage.CIM_FIBRE_PORT__CURRENT_VERSION:
				return CURRENT_VERSION_EDEFAULT == null ? currentVersion != null : !CURRENT_VERSION_EDEFAULT.equals(currentVersion);
			case CimPackage.CIM_FIBRE_PORT__ALIAS_ADDRESSES:
				return aliasAddresses != null && !aliasAddresses.isEmpty();
			case CimPackage.CIM_FIBRE_PORT__LOSS_OF_SIGNAL_COUNTER:
				return LOSS_OF_SIGNAL_COUNTER_EDEFAULT == null ? lossOfSignalCounter != null : !LOSS_OF_SIGNAL_COUNTER_EDEFAULT.equals(lossOfSignalCounter);
			case CimPackage.CIM_FIBRE_PORT__LOSS_OF_SYNC_COUNTER:
				return LOSS_OF_SYNC_COUNTER_EDEFAULT == null ? lossOfSyncCounter != null : !LOSS_OF_SYNC_COUNTER_EDEFAULT.equals(lossOfSyncCounter);
			case CimPackage.CIM_FIBRE_PORT__CRC_ERRORS:
				return CRC_ERRORS_EDEFAULT == null ? crcErrors != null : !CRC_ERRORS_EDEFAULT.equals(crcErrors);
			case CimPackage.CIM_FIBRE_PORT__INVALID_TRANSMISSION_WORDS:
				return INVALID_TRANSMISSION_WORDS_EDEFAULT == null ? invalidTransmissionWords != null : !INVALID_TRANSMISSION_WORDS_EDEFAULT.equals(invalidTransmissionWords);
			case CimPackage.CIM_FIBRE_PORT__FRAMES_TOO_SHORT:
				return FRAMES_TOO_SHORT_EDEFAULT == null ? framesTooShort != null : !FRAMES_TOO_SHORT_EDEFAULT.equals(framesTooShort);
			case CimPackage.CIM_FIBRE_PORT__FRAMES_TOO_LONG:
				return FRAMES_TOO_LONG_EDEFAULT == null ? framesTooLong != null : !FRAMES_TOO_LONG_EDEFAULT.equals(framesTooLong);
			case CimPackage.CIM_FIBRE_PORT__ELASTICITY_BUFFER_UNDERRUNS:
				return ELASTICITY_BUFFER_UNDERRUNS_EDEFAULT == null ? elasticityBufferUnderruns != null : !ELASTICITY_BUFFER_UNDERRUNS_EDEFAULT.equals(elasticityBufferUnderruns);
			case CimPackage.CIM_FIBRE_PORT__ELASTICITY_BUFFER_OVERRUNS:
				return ELASTICITY_BUFFER_OVERRUNS_EDEFAULT == null ? elasticityBufferOverruns != null : !ELASTICITY_BUFFER_OVERRUNS_EDEFAULT.equals(elasticityBufferOverruns);
			case CimPackage.CIM_FIBRE_PORT__RECEIVER_TRANSMITTER_TIMEOUT:
				return RECEIVER_TRANSMITTER_TIMEOUT_EDEFAULT == null ? receiverTransmitterTimeout != null : !RECEIVER_TRANSMITTER_TIMEOUT_EDEFAULT.equals(receiverTransmitterTimeout);
			case CimPackage.CIM_FIBRE_PORT__BYPASSED_STATE:
				return BYPASSED_STATE_EDEFAULT == null ? bypassedState != null : !BYPASSED_STATE_EDEFAULT.equals(bypassedState);
			case CimPackage.CIM_FIBRE_PORT__CONNECTED_MEDIA:
				return CONNECTED_MEDIA_EDEFAULT == null ? connectedMedia != null : !CONNECTED_MEDIA_EDEFAULT.equals(connectedMedia);
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
		result.append(" (AddressIdentifier: ");
		result.append(addressIdentifier);
		result.append(", SupportedPortTypes: ");
		result.append(supportedPortTypes);
		result.append(", PortTypeVersions: ");
		result.append(portTypeVersions);
		result.append(", EnabledPortTypes: ");
		result.append(enabledPortTypes);
		result.append(", EnabledVersions: ");
		result.append(enabledVersions);
		result.append(", CurrentPortType: ");
		result.append(currentPortType);
		result.append(", CurrentVersion: ");
		result.append(currentVersion);
		result.append(", AliasAddresses: ");
		result.append(aliasAddresses);
		result.append(", LossOfSignalCounter: ");
		result.append(lossOfSignalCounter);
		result.append(", LossOfSyncCounter: ");
		result.append(lossOfSyncCounter);
		result.append(", CRCErrors: ");
		result.append(crcErrors);
		result.append(", InvalidTransmissionWords: ");
		result.append(invalidTransmissionWords);
		result.append(", FramesTooShort: ");
		result.append(framesTooShort);
		result.append(", FramesTooLong: ");
		result.append(framesTooLong);
		result.append(", ElasticityBufferUnderruns: ");
		result.append(elasticityBufferUnderruns);
		result.append(", ElasticityBufferOverruns: ");
		result.append(elasticityBufferOverruns);
		result.append(", ReceiverTransmitterTimeout: ");
		result.append(receiverTransmitterTimeout);
		result.append(", BypassedState: ");
		result.append(bypassedState);
		result.append(", ConnectedMedia: ");
		result.append(connectedMedia);
		result.append(')');
		return result.toString();
	}

} //CIM_FibrePortImpl

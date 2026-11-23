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

import org.dmtf.cim.CIM_CallBasedModem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Call Based Modem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getFallbackEnabled <em>Fallback Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getCompressionSupported <em>Compression Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getOtherCompressionDescription <em>Other Compression Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getCompressionInfo <em>Compression Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getOtherCompressionInfoDescription <em>Other Compression Info Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getModulationSupported <em>Modulation Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getOtherModulationDescription <em>Other Modulation Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getModulationScheme <em>Modulation Scheme</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getOtherSchemeDescription <em>Other Scheme Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getErrorControlSupported <em>Error Control Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getOtherErrorControlDescription <em>Other Error Control Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getErrorControlInfo <em>Error Control Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getOtherErrorControlInfoDescription <em>Other Error Control Info Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getTimeOfLastReset <em>Time Of Last Reset</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getCallSpeed <em>Call Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getCallStatus <em>Call Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getCharsSent <em>Chars Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getCharsReceived <em>Chars Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getCharsLost <em>Chars Lost</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getBlocksSent <em>Blocks Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getBlocksResent <em>Blocks Resent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getBlocksReceived <em>Blocks Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getBlockErrors <em>Block Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getCallLength <em>Call Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CallBasedModemImpl#getNumberDialed <em>Number Dialed</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_CallBasedModemImpl extends CIM_ModemImpl implements CIM_CallBasedModem {
	/**
	 * The default value of the '{@link #getFallbackEnabled() <em>Fallback Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallbackEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FALLBACK_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFallbackEnabled() <em>Fallback Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallbackEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean fallbackEnabled = FALLBACK_ENABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompressionSupported() <em>Compression Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> compressionSupported;

	/**
	 * The default value of the '{@link #getOtherCompressionDescription() <em>Other Compression Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCompressionDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_COMPRESSION_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCompressionDescription() <em>Other Compression Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCompressionDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherCompressionDescription = OTHER_COMPRESSION_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompressionInfo() <em>Compression Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionInfo()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COMPRESSION_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressionInfo() <em>Compression Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionInfo()
	 * @generated
	 * @ordered
	 */
	protected Integer compressionInfo = COMPRESSION_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherCompressionInfoDescription() <em>Other Compression Info Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCompressionInfoDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_COMPRESSION_INFO_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherCompressionInfoDescription() <em>Other Compression Info Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCompressionInfoDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherCompressionInfoDescription = OTHER_COMPRESSION_INFO_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModulationSupported() <em>Modulation Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> modulationSupported;

	/**
	 * The default value of the '{@link #getOtherModulationDescription() <em>Other Modulation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherModulationDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_MODULATION_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherModulationDescription() <em>Other Modulation Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherModulationDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherModulationDescription = OTHER_MODULATION_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModulationScheme() <em>Modulation Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationScheme()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MODULATION_SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModulationScheme() <em>Modulation Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulationScheme()
	 * @generated
	 * @ordered
	 */
	protected Integer modulationScheme = MODULATION_SCHEME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherSchemeDescription() <em>Other Scheme Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSchemeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SCHEME_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSchemeDescription() <em>Other Scheme Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSchemeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherSchemeDescription = OTHER_SCHEME_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrorControlSupported() <em>Error Control Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorControlSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> errorControlSupported;

	/**
	 * The default value of the '{@link #getOtherErrorControlDescription() <em>Other Error Control Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherErrorControlDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ERROR_CONTROL_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherErrorControlDescription() <em>Other Error Control Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherErrorControlDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherErrorControlDescription = OTHER_ERROR_CONTROL_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorControlInfo() <em>Error Control Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorControlInfo()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ERROR_CONTROL_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorControlInfo() <em>Error Control Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorControlInfo()
	 * @generated
	 * @ordered
	 */
	protected Integer errorControlInfo = ERROR_CONTROL_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherErrorControlInfoDescription() <em>Other Error Control Info Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherErrorControlInfoDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ERROR_CONTROL_INFO_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherErrorControlInfoDescription() <em>Other Error Control Info Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherErrorControlInfoDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherErrorControlInfoDescription = OTHER_ERROR_CONTROL_INFO_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOfLastReset() <em>Time Of Last Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastReset()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_OF_LAST_RESET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOfLastReset() <em>Time Of Last Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastReset()
	 * @generated
	 * @ordered
	 */
	protected String timeOfLastReset = TIME_OF_LAST_RESET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCallSpeed() <em>Call Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long CALL_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCallSpeed() <em>Call Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long callSpeed = CALL_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCallStatus() <em>Call Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CALL_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCallStatus() <em>Call Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer callStatus = CALL_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharsSent() <em>Chars Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharsSent()
	 * @generated
	 * @ordered
	 */
	protected static final Long CHARS_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharsSent() <em>Chars Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharsSent()
	 * @generated
	 * @ordered
	 */
	protected Long charsSent = CHARS_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharsReceived() <em>Chars Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long CHARS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharsReceived() <em>Chars Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long charsReceived = CHARS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharsLost() <em>Chars Lost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharsLost()
	 * @generated
	 * @ordered
	 */
	protected static final Long CHARS_LOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharsLost() <em>Chars Lost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharsLost()
	 * @generated
	 * @ordered
	 */
	protected Long charsLost = CHARS_LOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlocksSent() <em>Blocks Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocksSent()
	 * @generated
	 * @ordered
	 */
	protected static final Long BLOCKS_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlocksSent() <em>Blocks Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocksSent()
	 * @generated
	 * @ordered
	 */
	protected Long blocksSent = BLOCKS_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlocksResent() <em>Blocks Resent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocksResent()
	 * @generated
	 * @ordered
	 */
	protected static final Long BLOCKS_RESENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlocksResent() <em>Blocks Resent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocksResent()
	 * @generated
	 * @ordered
	 */
	protected Long blocksResent = BLOCKS_RESENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlocksReceived() <em>Blocks Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocksReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long BLOCKS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlocksReceived() <em>Blocks Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocksReceived()
	 * @generated
	 * @ordered
	 */
	protected Long blocksReceived = BLOCKS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockErrors() <em>Block Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long BLOCK_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockErrors() <em>Block Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockErrors()
	 * @generated
	 * @ordered
	 */
	protected Long blockErrors = BLOCK_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCallLength() <em>Call Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallLength()
	 * @generated
	 * @ordered
	 */
	protected static final String CALL_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCallLength() <em>Call Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallLength()
	 * @generated
	 * @ordered
	 */
	protected String callLength = CALL_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberDialed() <em>Number Dialed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberDialed()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_DIALED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberDialed() <em>Number Dialed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberDialed()
	 * @generated
	 * @ordered
	 */
	protected String numberDialed = NUMBER_DIALED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CallBasedModemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CallBasedModem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFallbackEnabled() {
		return fallbackEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFallbackEnabled(Boolean newFallbackEnabled) {
		Boolean oldFallbackEnabled = fallbackEnabled;
		fallbackEnabled = newFallbackEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__FALLBACK_ENABLED, oldFallbackEnabled, fallbackEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCompressionSupported() {
		if (compressionSupported == null) {
			compressionSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_CALL_BASED_MODEM__COMPRESSION_SUPPORTED);
		}
		return compressionSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCompressionDescription() {
		return otherCompressionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCompressionDescription(String newOtherCompressionDescription) {
		String oldOtherCompressionDescription = otherCompressionDescription;
		otherCompressionDescription = newOtherCompressionDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__OTHER_COMPRESSION_DESCRIPTION, oldOtherCompressionDescription, otherCompressionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCompressionInfo() {
		return compressionInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompressionInfo(Integer newCompressionInfo) {
		Integer oldCompressionInfo = compressionInfo;
		compressionInfo = newCompressionInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__COMPRESSION_INFO, oldCompressionInfo, compressionInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherCompressionInfoDescription() {
		return otherCompressionInfoDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherCompressionInfoDescription(String newOtherCompressionInfoDescription) {
		String oldOtherCompressionInfoDescription = otherCompressionInfoDescription;
		otherCompressionInfoDescription = newOtherCompressionInfoDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__OTHER_COMPRESSION_INFO_DESCRIPTION, oldOtherCompressionInfoDescription, otherCompressionInfoDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getModulationSupported() {
		if (modulationSupported == null) {
			modulationSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_CALL_BASED_MODEM__MODULATION_SUPPORTED);
		}
		return modulationSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherModulationDescription() {
		return otherModulationDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherModulationDescription(String newOtherModulationDescription) {
		String oldOtherModulationDescription = otherModulationDescription;
		otherModulationDescription = newOtherModulationDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__OTHER_MODULATION_DESCRIPTION, oldOtherModulationDescription, otherModulationDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getModulationScheme() {
		return modulationScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModulationScheme(Integer newModulationScheme) {
		Integer oldModulationScheme = modulationScheme;
		modulationScheme = newModulationScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__MODULATION_SCHEME, oldModulationScheme, modulationScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSchemeDescription() {
		return otherSchemeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSchemeDescription(String newOtherSchemeDescription) {
		String oldOtherSchemeDescription = otherSchemeDescription;
		otherSchemeDescription = newOtherSchemeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__OTHER_SCHEME_DESCRIPTION, oldOtherSchemeDescription, otherSchemeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getErrorControlSupported() {
		if (errorControlSupported == null) {
			errorControlSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_CALL_BASED_MODEM__ERROR_CONTROL_SUPPORTED);
		}
		return errorControlSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherErrorControlDescription() {
		return otherErrorControlDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherErrorControlDescription(String newOtherErrorControlDescription) {
		String oldOtherErrorControlDescription = otherErrorControlDescription;
		otherErrorControlDescription = newOtherErrorControlDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__OTHER_ERROR_CONTROL_DESCRIPTION, oldOtherErrorControlDescription, otherErrorControlDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getErrorControlInfo() {
		return errorControlInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorControlInfo(Integer newErrorControlInfo) {
		Integer oldErrorControlInfo = errorControlInfo;
		errorControlInfo = newErrorControlInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__ERROR_CONTROL_INFO, oldErrorControlInfo, errorControlInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherErrorControlInfoDescription() {
		return otherErrorControlInfoDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherErrorControlInfoDescription(String newOtherErrorControlInfoDescription) {
		String oldOtherErrorControlInfoDescription = otherErrorControlInfoDescription;
		otherErrorControlInfoDescription = newOtherErrorControlInfoDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__OTHER_ERROR_CONTROL_INFO_DESCRIPTION, oldOtherErrorControlInfoDescription, otherErrorControlInfoDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeOfLastReset() {
		return timeOfLastReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOfLastReset(String newTimeOfLastReset) {
		String oldTimeOfLastReset = timeOfLastReset;
		timeOfLastReset = newTimeOfLastReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__TIME_OF_LAST_RESET, oldTimeOfLastReset, timeOfLastReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCallSpeed() {
		return callSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallSpeed(Long newCallSpeed) {
		Long oldCallSpeed = callSpeed;
		callSpeed = newCallSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__CALL_SPEED, oldCallSpeed, callSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCallStatus() {
		return callStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallStatus(Integer newCallStatus) {
		Integer oldCallStatus = callStatus;
		callStatus = newCallStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__CALL_STATUS, oldCallStatus, callStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCharsSent() {
		return charsSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharsSent(Long newCharsSent) {
		Long oldCharsSent = charsSent;
		charsSent = newCharsSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__CHARS_SENT, oldCharsSent, charsSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCharsReceived() {
		return charsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharsReceived(Long newCharsReceived) {
		Long oldCharsReceived = charsReceived;
		charsReceived = newCharsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__CHARS_RECEIVED, oldCharsReceived, charsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCharsLost() {
		return charsLost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharsLost(Long newCharsLost) {
		Long oldCharsLost = charsLost;
		charsLost = newCharsLost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__CHARS_LOST, oldCharsLost, charsLost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBlocksSent() {
		return blocksSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlocksSent(Long newBlocksSent) {
		Long oldBlocksSent = blocksSent;
		blocksSent = newBlocksSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__BLOCKS_SENT, oldBlocksSent, blocksSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBlocksResent() {
		return blocksResent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlocksResent(Long newBlocksResent) {
		Long oldBlocksResent = blocksResent;
		blocksResent = newBlocksResent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__BLOCKS_RESENT, oldBlocksResent, blocksResent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBlocksReceived() {
		return blocksReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlocksReceived(Long newBlocksReceived) {
		Long oldBlocksReceived = blocksReceived;
		blocksReceived = newBlocksReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__BLOCKS_RECEIVED, oldBlocksReceived, blocksReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBlockErrors() {
		return blockErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockErrors(Long newBlockErrors) {
		Long oldBlockErrors = blockErrors;
		blockErrors = newBlockErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__BLOCK_ERRORS, oldBlockErrors, blockErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCallLength() {
		return callLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCallLength(String newCallLength) {
		String oldCallLength = callLength;
		callLength = newCallLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__CALL_LENGTH, oldCallLength, callLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNumberDialed() {
		return numberDialed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberDialed(String newNumberDialed) {
		String oldNumberDialed = numberDialed;
		numberDialed = newNumberDialed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CALL_BASED_MODEM__NUMBER_DIALED, oldNumberDialed, numberDialed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CALL_BASED_MODEM__FALLBACK_ENABLED:
				return getFallbackEnabled();
			case CimPackage.CIM_CALL_BASED_MODEM__COMPRESSION_SUPPORTED:
				return getCompressionSupported();
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_COMPRESSION_DESCRIPTION:
				return getOtherCompressionDescription();
			case CimPackage.CIM_CALL_BASED_MODEM__COMPRESSION_INFO:
				return getCompressionInfo();
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_COMPRESSION_INFO_DESCRIPTION:
				return getOtherCompressionInfoDescription();
			case CimPackage.CIM_CALL_BASED_MODEM__MODULATION_SUPPORTED:
				return getModulationSupported();
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_MODULATION_DESCRIPTION:
				return getOtherModulationDescription();
			case CimPackage.CIM_CALL_BASED_MODEM__MODULATION_SCHEME:
				return getModulationScheme();
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_SCHEME_DESCRIPTION:
				return getOtherSchemeDescription();
			case CimPackage.CIM_CALL_BASED_MODEM__ERROR_CONTROL_SUPPORTED:
				return getErrorControlSupported();
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_ERROR_CONTROL_DESCRIPTION:
				return getOtherErrorControlDescription();
			case CimPackage.CIM_CALL_BASED_MODEM__ERROR_CONTROL_INFO:
				return getErrorControlInfo();
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_ERROR_CONTROL_INFO_DESCRIPTION:
				return getOtherErrorControlInfoDescription();
			case CimPackage.CIM_CALL_BASED_MODEM__TIME_OF_LAST_RESET:
				return getTimeOfLastReset();
			case CimPackage.CIM_CALL_BASED_MODEM__CALL_SPEED:
				return getCallSpeed();
			case CimPackage.CIM_CALL_BASED_MODEM__CALL_STATUS:
				return getCallStatus();
			case CimPackage.CIM_CALL_BASED_MODEM__CHARS_SENT:
				return getCharsSent();
			case CimPackage.CIM_CALL_BASED_MODEM__CHARS_RECEIVED:
				return getCharsReceived();
			case CimPackage.CIM_CALL_BASED_MODEM__CHARS_LOST:
				return getCharsLost();
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCKS_SENT:
				return getBlocksSent();
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCKS_RESENT:
				return getBlocksResent();
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCKS_RECEIVED:
				return getBlocksReceived();
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCK_ERRORS:
				return getBlockErrors();
			case CimPackage.CIM_CALL_BASED_MODEM__CALL_LENGTH:
				return getCallLength();
			case CimPackage.CIM_CALL_BASED_MODEM__NUMBER_DIALED:
				return getNumberDialed();
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
			case CimPackage.CIM_CALL_BASED_MODEM__FALLBACK_ENABLED:
				setFallbackEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__COMPRESSION_SUPPORTED:
				getCompressionSupported().clear();
				getCompressionSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_COMPRESSION_DESCRIPTION:
				setOtherCompressionDescription((String)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__COMPRESSION_INFO:
				setCompressionInfo((Integer)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_COMPRESSION_INFO_DESCRIPTION:
				setOtherCompressionInfoDescription((String)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__MODULATION_SUPPORTED:
				getModulationSupported().clear();
				getModulationSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_MODULATION_DESCRIPTION:
				setOtherModulationDescription((String)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__MODULATION_SCHEME:
				setModulationScheme((Integer)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_SCHEME_DESCRIPTION:
				setOtherSchemeDescription((String)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__ERROR_CONTROL_SUPPORTED:
				getErrorControlSupported().clear();
				getErrorControlSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_ERROR_CONTROL_DESCRIPTION:
				setOtherErrorControlDescription((String)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__ERROR_CONTROL_INFO:
				setErrorControlInfo((Integer)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_ERROR_CONTROL_INFO_DESCRIPTION:
				setOtherErrorControlInfoDescription((String)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__TIME_OF_LAST_RESET:
				setTimeOfLastReset((String)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__CALL_SPEED:
				setCallSpeed((Long)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__CALL_STATUS:
				setCallStatus((Integer)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__CHARS_SENT:
				setCharsSent((Long)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__CHARS_RECEIVED:
				setCharsReceived((Long)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__CHARS_LOST:
				setCharsLost((Long)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCKS_SENT:
				setBlocksSent((Long)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCKS_RESENT:
				setBlocksResent((Long)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCKS_RECEIVED:
				setBlocksReceived((Long)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCK_ERRORS:
				setBlockErrors((Long)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__CALL_LENGTH:
				setCallLength((String)newValue);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__NUMBER_DIALED:
				setNumberDialed((String)newValue);
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
			case CimPackage.CIM_CALL_BASED_MODEM__FALLBACK_ENABLED:
				setFallbackEnabled(FALLBACK_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__COMPRESSION_SUPPORTED:
				getCompressionSupported().clear();
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_COMPRESSION_DESCRIPTION:
				setOtherCompressionDescription(OTHER_COMPRESSION_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__COMPRESSION_INFO:
				setCompressionInfo(COMPRESSION_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_COMPRESSION_INFO_DESCRIPTION:
				setOtherCompressionInfoDescription(OTHER_COMPRESSION_INFO_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__MODULATION_SUPPORTED:
				getModulationSupported().clear();
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_MODULATION_DESCRIPTION:
				setOtherModulationDescription(OTHER_MODULATION_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__MODULATION_SCHEME:
				setModulationScheme(MODULATION_SCHEME_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_SCHEME_DESCRIPTION:
				setOtherSchemeDescription(OTHER_SCHEME_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__ERROR_CONTROL_SUPPORTED:
				getErrorControlSupported().clear();
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_ERROR_CONTROL_DESCRIPTION:
				setOtherErrorControlDescription(OTHER_ERROR_CONTROL_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__ERROR_CONTROL_INFO:
				setErrorControlInfo(ERROR_CONTROL_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_ERROR_CONTROL_INFO_DESCRIPTION:
				setOtherErrorControlInfoDescription(OTHER_ERROR_CONTROL_INFO_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__TIME_OF_LAST_RESET:
				setTimeOfLastReset(TIME_OF_LAST_RESET_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__CALL_SPEED:
				setCallSpeed(CALL_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__CALL_STATUS:
				setCallStatus(CALL_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__CHARS_SENT:
				setCharsSent(CHARS_SENT_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__CHARS_RECEIVED:
				setCharsReceived(CHARS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__CHARS_LOST:
				setCharsLost(CHARS_LOST_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCKS_SENT:
				setBlocksSent(BLOCKS_SENT_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCKS_RESENT:
				setBlocksResent(BLOCKS_RESENT_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCKS_RECEIVED:
				setBlocksReceived(BLOCKS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCK_ERRORS:
				setBlockErrors(BLOCK_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__CALL_LENGTH:
				setCallLength(CALL_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_CALL_BASED_MODEM__NUMBER_DIALED:
				setNumberDialed(NUMBER_DIALED_EDEFAULT);
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
			case CimPackage.CIM_CALL_BASED_MODEM__FALLBACK_ENABLED:
				return FALLBACK_ENABLED_EDEFAULT == null ? fallbackEnabled != null : !FALLBACK_ENABLED_EDEFAULT.equals(fallbackEnabled);
			case CimPackage.CIM_CALL_BASED_MODEM__COMPRESSION_SUPPORTED:
				return compressionSupported != null && !compressionSupported.isEmpty();
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_COMPRESSION_DESCRIPTION:
				return OTHER_COMPRESSION_DESCRIPTION_EDEFAULT == null ? otherCompressionDescription != null : !OTHER_COMPRESSION_DESCRIPTION_EDEFAULT.equals(otherCompressionDescription);
			case CimPackage.CIM_CALL_BASED_MODEM__COMPRESSION_INFO:
				return COMPRESSION_INFO_EDEFAULT == null ? compressionInfo != null : !COMPRESSION_INFO_EDEFAULT.equals(compressionInfo);
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_COMPRESSION_INFO_DESCRIPTION:
				return OTHER_COMPRESSION_INFO_DESCRIPTION_EDEFAULT == null ? otherCompressionInfoDescription != null : !OTHER_COMPRESSION_INFO_DESCRIPTION_EDEFAULT.equals(otherCompressionInfoDescription);
			case CimPackage.CIM_CALL_BASED_MODEM__MODULATION_SUPPORTED:
				return modulationSupported != null && !modulationSupported.isEmpty();
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_MODULATION_DESCRIPTION:
				return OTHER_MODULATION_DESCRIPTION_EDEFAULT == null ? otherModulationDescription != null : !OTHER_MODULATION_DESCRIPTION_EDEFAULT.equals(otherModulationDescription);
			case CimPackage.CIM_CALL_BASED_MODEM__MODULATION_SCHEME:
				return MODULATION_SCHEME_EDEFAULT == null ? modulationScheme != null : !MODULATION_SCHEME_EDEFAULT.equals(modulationScheme);
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_SCHEME_DESCRIPTION:
				return OTHER_SCHEME_DESCRIPTION_EDEFAULT == null ? otherSchemeDescription != null : !OTHER_SCHEME_DESCRIPTION_EDEFAULT.equals(otherSchemeDescription);
			case CimPackage.CIM_CALL_BASED_MODEM__ERROR_CONTROL_SUPPORTED:
				return errorControlSupported != null && !errorControlSupported.isEmpty();
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_ERROR_CONTROL_DESCRIPTION:
				return OTHER_ERROR_CONTROL_DESCRIPTION_EDEFAULT == null ? otherErrorControlDescription != null : !OTHER_ERROR_CONTROL_DESCRIPTION_EDEFAULT.equals(otherErrorControlDescription);
			case CimPackage.CIM_CALL_BASED_MODEM__ERROR_CONTROL_INFO:
				return ERROR_CONTROL_INFO_EDEFAULT == null ? errorControlInfo != null : !ERROR_CONTROL_INFO_EDEFAULT.equals(errorControlInfo);
			case CimPackage.CIM_CALL_BASED_MODEM__OTHER_ERROR_CONTROL_INFO_DESCRIPTION:
				return OTHER_ERROR_CONTROL_INFO_DESCRIPTION_EDEFAULT == null ? otherErrorControlInfoDescription != null : !OTHER_ERROR_CONTROL_INFO_DESCRIPTION_EDEFAULT.equals(otherErrorControlInfoDescription);
			case CimPackage.CIM_CALL_BASED_MODEM__TIME_OF_LAST_RESET:
				return TIME_OF_LAST_RESET_EDEFAULT == null ? timeOfLastReset != null : !TIME_OF_LAST_RESET_EDEFAULT.equals(timeOfLastReset);
			case CimPackage.CIM_CALL_BASED_MODEM__CALL_SPEED:
				return CALL_SPEED_EDEFAULT == null ? callSpeed != null : !CALL_SPEED_EDEFAULT.equals(callSpeed);
			case CimPackage.CIM_CALL_BASED_MODEM__CALL_STATUS:
				return CALL_STATUS_EDEFAULT == null ? callStatus != null : !CALL_STATUS_EDEFAULT.equals(callStatus);
			case CimPackage.CIM_CALL_BASED_MODEM__CHARS_SENT:
				return CHARS_SENT_EDEFAULT == null ? charsSent != null : !CHARS_SENT_EDEFAULT.equals(charsSent);
			case CimPackage.CIM_CALL_BASED_MODEM__CHARS_RECEIVED:
				return CHARS_RECEIVED_EDEFAULT == null ? charsReceived != null : !CHARS_RECEIVED_EDEFAULT.equals(charsReceived);
			case CimPackage.CIM_CALL_BASED_MODEM__CHARS_LOST:
				return CHARS_LOST_EDEFAULT == null ? charsLost != null : !CHARS_LOST_EDEFAULT.equals(charsLost);
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCKS_SENT:
				return BLOCKS_SENT_EDEFAULT == null ? blocksSent != null : !BLOCKS_SENT_EDEFAULT.equals(blocksSent);
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCKS_RESENT:
				return BLOCKS_RESENT_EDEFAULT == null ? blocksResent != null : !BLOCKS_RESENT_EDEFAULT.equals(blocksResent);
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCKS_RECEIVED:
				return BLOCKS_RECEIVED_EDEFAULT == null ? blocksReceived != null : !BLOCKS_RECEIVED_EDEFAULT.equals(blocksReceived);
			case CimPackage.CIM_CALL_BASED_MODEM__BLOCK_ERRORS:
				return BLOCK_ERRORS_EDEFAULT == null ? blockErrors != null : !BLOCK_ERRORS_EDEFAULT.equals(blockErrors);
			case CimPackage.CIM_CALL_BASED_MODEM__CALL_LENGTH:
				return CALL_LENGTH_EDEFAULT == null ? callLength != null : !CALL_LENGTH_EDEFAULT.equals(callLength);
			case CimPackage.CIM_CALL_BASED_MODEM__NUMBER_DIALED:
				return NUMBER_DIALED_EDEFAULT == null ? numberDialed != null : !NUMBER_DIALED_EDEFAULT.equals(numberDialed);
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
		result.append(" (FallbackEnabled: ");
		result.append(fallbackEnabled);
		result.append(", CompressionSupported: ");
		result.append(compressionSupported);
		result.append(", OtherCompressionDescription: ");
		result.append(otherCompressionDescription);
		result.append(", CompressionInfo: ");
		result.append(compressionInfo);
		result.append(", OtherCompressionInfoDescription: ");
		result.append(otherCompressionInfoDescription);
		result.append(", ModulationSupported: ");
		result.append(modulationSupported);
		result.append(", OtherModulationDescription: ");
		result.append(otherModulationDescription);
		result.append(", ModulationScheme: ");
		result.append(modulationScheme);
		result.append(", OtherSchemeDescription: ");
		result.append(otherSchemeDescription);
		result.append(", ErrorControlSupported: ");
		result.append(errorControlSupported);
		result.append(", OtherErrorControlDescription: ");
		result.append(otherErrorControlDescription);
		result.append(", ErrorControlInfo: ");
		result.append(errorControlInfo);
		result.append(", OtherErrorControlInfoDescription: ");
		result.append(otherErrorControlInfoDescription);
		result.append(", TimeOfLastReset: ");
		result.append(timeOfLastReset);
		result.append(", CallSpeed: ");
		result.append(callSpeed);
		result.append(", CallStatus: ");
		result.append(callStatus);
		result.append(", CharsSent: ");
		result.append(charsSent);
		result.append(", CharsReceived: ");
		result.append(charsReceived);
		result.append(", CharsLost: ");
		result.append(charsLost);
		result.append(", BlocksSent: ");
		result.append(blocksSent);
		result.append(", BlocksResent: ");
		result.append(blocksResent);
		result.append(", BlocksReceived: ");
		result.append(blocksReceived);
		result.append(", BlockErrors: ");
		result.append(blockErrors);
		result.append(", CallLength: ");
		result.append(callLength);
		result.append(", NumberDialed: ");
		result.append(numberDialed);
		result.append(')');
		return result.toString();
	}

} //CIM_CallBasedModemImpl

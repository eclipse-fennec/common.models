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

import org.dmtf.cim.CIM_Printer;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Printer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getPrinterStatus <em>Printer Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getDetectedErrorState <em>Detected Error State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getErrorInformation <em>Error Information</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getPaperSizesSupported <em>Paper Sizes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getPaperTypesAvailable <em>Paper Types Available</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getDefaultPaperType <em>Default Paper Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getCurrentPaperType <em>Current Paper Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getLanguagesSupported <em>Languages Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getMimeTypesSupported <em>Mime Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getCurrentLanguage <em>Current Language</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getCurrentMimeType <em>Current Mime Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getDefaultLanguage <em>Default Language</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getDefaultMimeType <em>Default Mime Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getJobCountSinceLastReset <em>Job Count Since Last Reset</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getTimeOfLastReset <em>Time Of Last Reset</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getDefaultCapabilities <em>Default Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getCurrentCapabilities <em>Current Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getMaxCopies <em>Max Copies</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getDefaultCopies <em>Default Copies</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getMaxNumberUp <em>Max Number Up</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getDefaultNumberUp <em>Default Number Up</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getHorizontalResolution <em>Horizontal Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getVerticalResolution <em>Vertical Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getCharSetsSupported <em>Char Sets Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getCurrentCharSet <em>Current Char Set</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getNaturalLanguagesSupported <em>Natural Languages Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getCurrentNaturalLanguage <em>Current Natural Language</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getMaxSizeSupported <em>Max Size Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getAvailableJobSheets <em>Available Job Sheets</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getMarkingTechnology <em>Marking Technology</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getConsoleNaturalLanguage <em>Console Natural Language</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrinterImpl#getConsoleDisplayBufferText <em>Console Display Buffer Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PrinterImpl extends CIM_LogicalDeviceImpl implements CIM_Printer {
	/**
	 * The default value of the '{@link #getPrinterStatus() <em>Printer Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrinterStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRINTER_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrinterStatus() <em>Printer Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrinterStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer printerStatus = PRINTER_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetectedErrorState() <em>Detected Error State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectedErrorState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DETECTED_ERROR_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetectedErrorState() <em>Detected Error State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectedErrorState()
	 * @generated
	 * @ordered
	 */
	protected Integer detectedErrorState = DETECTED_ERROR_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrorInformation() <em>Error Information</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<String> errorInformation;

	/**
	 * The cached value of the '{@link #getPaperSizesSupported() <em>Paper Sizes Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaperSizesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> paperSizesSupported;

	/**
	 * The cached value of the '{@link #getPaperTypesAvailable() <em>Paper Types Available</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaperTypesAvailable()
	 * @generated
	 * @ordered
	 */
	protected EList<String> paperTypesAvailable;

	/**
	 * The default value of the '{@link #getDefaultPaperType() <em>Default Paper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPaperType()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_PAPER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultPaperType() <em>Default Paper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPaperType()
	 * @generated
	 * @ordered
	 */
	protected String defaultPaperType = DEFAULT_PAPER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentPaperType() <em>Current Paper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPaperType()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_PAPER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentPaperType() <em>Current Paper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPaperType()
	 * @generated
	 * @ordered
	 */
	protected String currentPaperType = CURRENT_PAPER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLanguagesSupported() <em>Languages Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguagesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> languagesSupported;

	/**
	 * The cached value of the '{@link #getMimeTypesSupported() <em>Mime Types Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeTypesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mimeTypesSupported;

	/**
	 * The default value of the '{@link #getCurrentLanguage() <em>Current Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentLanguage() <em>Current Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLanguage()
	 * @generated
	 * @ordered
	 */
	protected Integer currentLanguage = CURRENT_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentMimeType() <em>Current Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentMimeType() <em>Current Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMimeType()
	 * @generated
	 * @ordered
	 */
	protected String currentMimeType = CURRENT_MIME_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultLanguage() <em>Default Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultLanguage() <em>Default Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLanguage()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultLanguage = DEFAULT_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultMimeType() <em>Default Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultMimeType() <em>Default Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMimeType()
	 * @generated
	 * @ordered
	 */
	protected String defaultMimeType = DEFAULT_MIME_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobCountSinceLastReset() <em>Job Count Since Last Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobCountSinceLastReset()
	 * @generated
	 * @ordered
	 */
	protected static final Long JOB_COUNT_SINCE_LAST_RESET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobCountSinceLastReset() <em>Job Count Since Last Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobCountSinceLastReset()
	 * @generated
	 * @ordered
	 */
	protected Long jobCountSinceLastReset = JOB_COUNT_SINCE_LAST_RESET_EDEFAULT;

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
	 * The cached value of the '{@link #getDefaultCapabilities() <em>Default Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> defaultCapabilities;

	/**
	 * The cached value of the '{@link #getCurrentCapabilities() <em>Current Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> currentCapabilities;

	/**
	 * The default value of the '{@link #getMaxCopies() <em>Max Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCopies()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_COPIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCopies() <em>Max Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCopies()
	 * @generated
	 * @ordered
	 */
	protected Long maxCopies = MAX_COPIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCopies() <em>Default Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCopies()
	 * @generated
	 * @ordered
	 */
	protected static final Long DEFAULT_COPIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultCopies() <em>Default Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCopies()
	 * @generated
	 * @ordered
	 */
	protected Long defaultCopies = DEFAULT_COPIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxNumberUp() <em>Max Number Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberUp()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_NUMBER_UP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumberUp() <em>Max Number Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumberUp()
	 * @generated
	 * @ordered
	 */
	protected Long maxNumberUp = MAX_NUMBER_UP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultNumberUp() <em>Default Number Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultNumberUp()
	 * @generated
	 * @ordered
	 */
	protected static final Long DEFAULT_NUMBER_UP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultNumberUp() <em>Default Number Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultNumberUp()
	 * @generated
	 * @ordered
	 */
	protected Long defaultNumberUp = DEFAULT_NUMBER_UP_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalResolution() <em>Horizontal Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Long HORIZONTAL_RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalResolution() <em>Horizontal Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalResolution()
	 * @generated
	 * @ordered
	 */
	protected Long horizontalResolution = HORIZONTAL_RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalResolution() <em>Vertical Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Long VERTICAL_RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalResolution() <em>Vertical Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalResolution()
	 * @generated
	 * @ordered
	 */
	protected Long verticalResolution = VERTICAL_RESOLUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCharSetsSupported() <em>Char Sets Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharSetsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<String> charSetsSupported;

	/**
	 * The default value of the '{@link #getCurrentCharSet() <em>Current Char Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCharSet()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_CHAR_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentCharSet() <em>Current Char Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCharSet()
	 * @generated
	 * @ordered
	 */
	protected String currentCharSet = CURRENT_CHAR_SET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNaturalLanguagesSupported() <em>Natural Languages Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaturalLanguagesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<String> naturalLanguagesSupported;

	/**
	 * The default value of the '{@link #getCurrentNaturalLanguage() <em>Current Natural Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentNaturalLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_NATURAL_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentNaturalLanguage() <em>Current Natural Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentNaturalLanguage()
	 * @generated
	 * @ordered
	 */
	protected String currentNaturalLanguage = CURRENT_NATURAL_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSizeSupported() <em>Max Size Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSizeSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_SIZE_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxSizeSupported() <em>Max Size Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSizeSupported()
	 * @generated
	 * @ordered
	 */
	protected Long maxSizeSupported = MAX_SIZE_SUPPORTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAvailableJobSheets() <em>Available Job Sheets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableJobSheets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> availableJobSheets;

	/**
	 * The default value of the '{@link #getMarkingTechnology() <em>Marking Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkingTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MARKING_TECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarkingTechnology() <em>Marking Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkingTechnology()
	 * @generated
	 * @ordered
	 */
	protected Integer markingTechnology = MARKING_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsoleNaturalLanguage() <em>Console Natural Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsoleNaturalLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSOLE_NATURAL_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsoleNaturalLanguage() <em>Console Natural Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsoleNaturalLanguage()
	 * @generated
	 * @ordered
	 */
	protected String consoleNaturalLanguage = CONSOLE_NATURAL_LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsoleDisplayBufferText() <em>Console Display Buffer Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsoleDisplayBufferText()
	 * @generated
	 * @ordered
	 */
	protected EList<String> consoleDisplayBufferText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PrinterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Printer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrinterStatus() {
		return printerStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrinterStatus(Integer newPrinterStatus) {
		Integer oldPrinterStatus = printerStatus;
		printerStatus = newPrinterStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__PRINTER_STATUS, oldPrinterStatus, printerStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDetectedErrorState() {
		return detectedErrorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetectedErrorState(Integer newDetectedErrorState) {
		Integer oldDetectedErrorState = detectedErrorState;
		detectedErrorState = newDetectedErrorState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__DETECTED_ERROR_STATE, oldDetectedErrorState, detectedErrorState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getErrorInformation() {
		if (errorInformation == null) {
			errorInformation = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINTER__ERROR_INFORMATION);
		}
		return errorInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPaperSizesSupported() {
		if (paperSizesSupported == null) {
			paperSizesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PRINTER__PAPER_SIZES_SUPPORTED);
		}
		return paperSizesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPaperTypesAvailable() {
		if (paperTypesAvailable == null) {
			paperTypesAvailable = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINTER__PAPER_TYPES_AVAILABLE);
		}
		return paperTypesAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultPaperType() {
		return defaultPaperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultPaperType(String newDefaultPaperType) {
		String oldDefaultPaperType = defaultPaperType;
		defaultPaperType = newDefaultPaperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__DEFAULT_PAPER_TYPE, oldDefaultPaperType, defaultPaperType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentPaperType() {
		return currentPaperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentPaperType(String newCurrentPaperType) {
		String oldCurrentPaperType = currentPaperType;
		currentPaperType = newCurrentPaperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__CURRENT_PAPER_TYPE, oldCurrentPaperType, currentPaperType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLanguagesSupported() {
		if (languagesSupported == null) {
			languagesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PRINTER__LANGUAGES_SUPPORTED);
		}
		return languagesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMimeTypesSupported() {
		if (mimeTypesSupported == null) {
			mimeTypesSupported = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINTER__MIME_TYPES_SUPPORTED);
		}
		return mimeTypesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentLanguage() {
		return currentLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentLanguage(Integer newCurrentLanguage) {
		Integer oldCurrentLanguage = currentLanguage;
		currentLanguage = newCurrentLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__CURRENT_LANGUAGE, oldCurrentLanguage, currentLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentMimeType() {
		return currentMimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentMimeType(String newCurrentMimeType) {
		String oldCurrentMimeType = currentMimeType;
		currentMimeType = newCurrentMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__CURRENT_MIME_TYPE, oldCurrentMimeType, currentMimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDefaultLanguage() {
		return defaultLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultLanguage(Integer newDefaultLanguage) {
		Integer oldDefaultLanguage = defaultLanguage;
		defaultLanguage = newDefaultLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__DEFAULT_LANGUAGE, oldDefaultLanguage, defaultLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultMimeType() {
		return defaultMimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultMimeType(String newDefaultMimeType) {
		String oldDefaultMimeType = defaultMimeType;
		defaultMimeType = newDefaultMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__DEFAULT_MIME_TYPE, oldDefaultMimeType, defaultMimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getJobCountSinceLastReset() {
		return jobCountSinceLastReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobCountSinceLastReset(Long newJobCountSinceLastReset) {
		Long oldJobCountSinceLastReset = jobCountSinceLastReset;
		jobCountSinceLastReset = newJobCountSinceLastReset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__JOB_COUNT_SINCE_LAST_RESET, oldJobCountSinceLastReset, jobCountSinceLastReset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__TIME_OF_LAST_RESET, oldTimeOfLastReset, timeOfLastReset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PRINTER__CAPABILITIES);
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
			capabilityDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINTER__CAPABILITY_DESCRIPTIONS);
		}
		return capabilityDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getDefaultCapabilities() {
		if (defaultCapabilities == null) {
			defaultCapabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PRINTER__DEFAULT_CAPABILITIES);
		}
		return defaultCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCurrentCapabilities() {
		if (currentCapabilities == null) {
			currentCapabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PRINTER__CURRENT_CAPABILITIES);
		}
		return currentCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxCopies() {
		return maxCopies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxCopies(Long newMaxCopies) {
		Long oldMaxCopies = maxCopies;
		maxCopies = newMaxCopies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__MAX_COPIES, oldMaxCopies, maxCopies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDefaultCopies() {
		return defaultCopies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCopies(Long newDefaultCopies) {
		Long oldDefaultCopies = defaultCopies;
		defaultCopies = newDefaultCopies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__DEFAULT_COPIES, oldDefaultCopies, defaultCopies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxNumberUp() {
		return maxNumberUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNumberUp(Long newMaxNumberUp) {
		Long oldMaxNumberUp = maxNumberUp;
		maxNumberUp = newMaxNumberUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__MAX_NUMBER_UP, oldMaxNumberUp, maxNumberUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDefaultNumberUp() {
		return defaultNumberUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultNumberUp(Long newDefaultNumberUp) {
		Long oldDefaultNumberUp = defaultNumberUp;
		defaultNumberUp = newDefaultNumberUp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__DEFAULT_NUMBER_UP, oldDefaultNumberUp, defaultNumberUp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHorizontalResolution() {
		return horizontalResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHorizontalResolution(Long newHorizontalResolution) {
		Long oldHorizontalResolution = horizontalResolution;
		horizontalResolution = newHorizontalResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__HORIZONTAL_RESOLUTION, oldHorizontalResolution, horizontalResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getVerticalResolution() {
		return verticalResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalResolution(Long newVerticalResolution) {
		Long oldVerticalResolution = verticalResolution;
		verticalResolution = newVerticalResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__VERTICAL_RESOLUTION, oldVerticalResolution, verticalResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCharSetsSupported() {
		if (charSetsSupported == null) {
			charSetsSupported = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINTER__CHAR_SETS_SUPPORTED);
		}
		return charSetsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentCharSet() {
		return currentCharSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentCharSet(String newCurrentCharSet) {
		String oldCurrentCharSet = currentCharSet;
		currentCharSet = newCurrentCharSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__CURRENT_CHAR_SET, oldCurrentCharSet, currentCharSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNaturalLanguagesSupported() {
		if (naturalLanguagesSupported == null) {
			naturalLanguagesSupported = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINTER__NATURAL_LANGUAGES_SUPPORTED);
		}
		return naturalLanguagesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentNaturalLanguage() {
		return currentNaturalLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentNaturalLanguage(String newCurrentNaturalLanguage) {
		String oldCurrentNaturalLanguage = currentNaturalLanguage;
		currentNaturalLanguage = newCurrentNaturalLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__CURRENT_NATURAL_LANGUAGE, oldCurrentNaturalLanguage, currentNaturalLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxSizeSupported() {
		return maxSizeSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSizeSupported(Long newMaxSizeSupported) {
		Long oldMaxSizeSupported = maxSizeSupported;
		maxSizeSupported = newMaxSizeSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__MAX_SIZE_SUPPORTED, oldMaxSizeSupported, maxSizeSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAvailableJobSheets() {
		if (availableJobSheets == null) {
			availableJobSheets = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINTER__AVAILABLE_JOB_SHEETS);
		}
		return availableJobSheets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMarkingTechnology() {
		return markingTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarkingTechnology(Integer newMarkingTechnology) {
		Integer oldMarkingTechnology = markingTechnology;
		markingTechnology = newMarkingTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__MARKING_TECHNOLOGY, oldMarkingTechnology, markingTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConsoleNaturalLanguage() {
		return consoleNaturalLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsoleNaturalLanguage(String newConsoleNaturalLanguage) {
		String oldConsoleNaturalLanguage = consoleNaturalLanguage;
		consoleNaturalLanguage = newConsoleNaturalLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINTER__CONSOLE_NATURAL_LANGUAGE, oldConsoleNaturalLanguage, consoleNaturalLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getConsoleDisplayBufferText() {
		if (consoleDisplayBufferText == null) {
			consoleDisplayBufferText = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINTER__CONSOLE_DISPLAY_BUFFER_TEXT);
		}
		return consoleDisplayBufferText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRINTER__PRINTER_STATUS:
				return getPrinterStatus();
			case CimPackage.CIM_PRINTER__DETECTED_ERROR_STATE:
				return getDetectedErrorState();
			case CimPackage.CIM_PRINTER__ERROR_INFORMATION:
				return getErrorInformation();
			case CimPackage.CIM_PRINTER__PAPER_SIZES_SUPPORTED:
				return getPaperSizesSupported();
			case CimPackage.CIM_PRINTER__PAPER_TYPES_AVAILABLE:
				return getPaperTypesAvailable();
			case CimPackage.CIM_PRINTER__DEFAULT_PAPER_TYPE:
				return getDefaultPaperType();
			case CimPackage.CIM_PRINTER__CURRENT_PAPER_TYPE:
				return getCurrentPaperType();
			case CimPackage.CIM_PRINTER__LANGUAGES_SUPPORTED:
				return getLanguagesSupported();
			case CimPackage.CIM_PRINTER__MIME_TYPES_SUPPORTED:
				return getMimeTypesSupported();
			case CimPackage.CIM_PRINTER__CURRENT_LANGUAGE:
				return getCurrentLanguage();
			case CimPackage.CIM_PRINTER__CURRENT_MIME_TYPE:
				return getCurrentMimeType();
			case CimPackage.CIM_PRINTER__DEFAULT_LANGUAGE:
				return getDefaultLanguage();
			case CimPackage.CIM_PRINTER__DEFAULT_MIME_TYPE:
				return getDefaultMimeType();
			case CimPackage.CIM_PRINTER__JOB_COUNT_SINCE_LAST_RESET:
				return getJobCountSinceLastReset();
			case CimPackage.CIM_PRINTER__TIME_OF_LAST_RESET:
				return getTimeOfLastReset();
			case CimPackage.CIM_PRINTER__CAPABILITIES:
				return getCapabilities();
			case CimPackage.CIM_PRINTER__CAPABILITY_DESCRIPTIONS:
				return getCapabilityDescriptions();
			case CimPackage.CIM_PRINTER__DEFAULT_CAPABILITIES:
				return getDefaultCapabilities();
			case CimPackage.CIM_PRINTER__CURRENT_CAPABILITIES:
				return getCurrentCapabilities();
			case CimPackage.CIM_PRINTER__MAX_COPIES:
				return getMaxCopies();
			case CimPackage.CIM_PRINTER__DEFAULT_COPIES:
				return getDefaultCopies();
			case CimPackage.CIM_PRINTER__MAX_NUMBER_UP:
				return getMaxNumberUp();
			case CimPackage.CIM_PRINTER__DEFAULT_NUMBER_UP:
				return getDefaultNumberUp();
			case CimPackage.CIM_PRINTER__HORIZONTAL_RESOLUTION:
				return getHorizontalResolution();
			case CimPackage.CIM_PRINTER__VERTICAL_RESOLUTION:
				return getVerticalResolution();
			case CimPackage.CIM_PRINTER__CHAR_SETS_SUPPORTED:
				return getCharSetsSupported();
			case CimPackage.CIM_PRINTER__CURRENT_CHAR_SET:
				return getCurrentCharSet();
			case CimPackage.CIM_PRINTER__NATURAL_LANGUAGES_SUPPORTED:
				return getNaturalLanguagesSupported();
			case CimPackage.CIM_PRINTER__CURRENT_NATURAL_LANGUAGE:
				return getCurrentNaturalLanguage();
			case CimPackage.CIM_PRINTER__MAX_SIZE_SUPPORTED:
				return getMaxSizeSupported();
			case CimPackage.CIM_PRINTER__AVAILABLE_JOB_SHEETS:
				return getAvailableJobSheets();
			case CimPackage.CIM_PRINTER__MARKING_TECHNOLOGY:
				return getMarkingTechnology();
			case CimPackage.CIM_PRINTER__CONSOLE_NATURAL_LANGUAGE:
				return getConsoleNaturalLanguage();
			case CimPackage.CIM_PRINTER__CONSOLE_DISPLAY_BUFFER_TEXT:
				return getConsoleDisplayBufferText();
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
			case CimPackage.CIM_PRINTER__PRINTER_STATUS:
				setPrinterStatus((Integer)newValue);
				return;
			case CimPackage.CIM_PRINTER__DETECTED_ERROR_STATE:
				setDetectedErrorState((Integer)newValue);
				return;
			case CimPackage.CIM_PRINTER__ERROR_INFORMATION:
				getErrorInformation().clear();
				getErrorInformation().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PRINTER__PAPER_SIZES_SUPPORTED:
				getPaperSizesSupported().clear();
				getPaperSizesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PRINTER__PAPER_TYPES_AVAILABLE:
				getPaperTypesAvailable().clear();
				getPaperTypesAvailable().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PRINTER__DEFAULT_PAPER_TYPE:
				setDefaultPaperType((String)newValue);
				return;
			case CimPackage.CIM_PRINTER__CURRENT_PAPER_TYPE:
				setCurrentPaperType((String)newValue);
				return;
			case CimPackage.CIM_PRINTER__LANGUAGES_SUPPORTED:
				getLanguagesSupported().clear();
				getLanguagesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PRINTER__MIME_TYPES_SUPPORTED:
				getMimeTypesSupported().clear();
				getMimeTypesSupported().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PRINTER__CURRENT_LANGUAGE:
				setCurrentLanguage((Integer)newValue);
				return;
			case CimPackage.CIM_PRINTER__CURRENT_MIME_TYPE:
				setCurrentMimeType((String)newValue);
				return;
			case CimPackage.CIM_PRINTER__DEFAULT_LANGUAGE:
				setDefaultLanguage((Integer)newValue);
				return;
			case CimPackage.CIM_PRINTER__DEFAULT_MIME_TYPE:
				setDefaultMimeType((String)newValue);
				return;
			case CimPackage.CIM_PRINTER__JOB_COUNT_SINCE_LAST_RESET:
				setJobCountSinceLastReset((Long)newValue);
				return;
			case CimPackage.CIM_PRINTER__TIME_OF_LAST_RESET:
				setTimeOfLastReset((String)newValue);
				return;
			case CimPackage.CIM_PRINTER__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PRINTER__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				getCapabilityDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PRINTER__DEFAULT_CAPABILITIES:
				getDefaultCapabilities().clear();
				getDefaultCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PRINTER__CURRENT_CAPABILITIES:
				getCurrentCapabilities().clear();
				getCurrentCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PRINTER__MAX_COPIES:
				setMaxCopies((Long)newValue);
				return;
			case CimPackage.CIM_PRINTER__DEFAULT_COPIES:
				setDefaultCopies((Long)newValue);
				return;
			case CimPackage.CIM_PRINTER__MAX_NUMBER_UP:
				setMaxNumberUp((Long)newValue);
				return;
			case CimPackage.CIM_PRINTER__DEFAULT_NUMBER_UP:
				setDefaultNumberUp((Long)newValue);
				return;
			case CimPackage.CIM_PRINTER__HORIZONTAL_RESOLUTION:
				setHorizontalResolution((Long)newValue);
				return;
			case CimPackage.CIM_PRINTER__VERTICAL_RESOLUTION:
				setVerticalResolution((Long)newValue);
				return;
			case CimPackage.CIM_PRINTER__CHAR_SETS_SUPPORTED:
				getCharSetsSupported().clear();
				getCharSetsSupported().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PRINTER__CURRENT_CHAR_SET:
				setCurrentCharSet((String)newValue);
				return;
			case CimPackage.CIM_PRINTER__NATURAL_LANGUAGES_SUPPORTED:
				getNaturalLanguagesSupported().clear();
				getNaturalLanguagesSupported().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PRINTER__CURRENT_NATURAL_LANGUAGE:
				setCurrentNaturalLanguage((String)newValue);
				return;
			case CimPackage.CIM_PRINTER__MAX_SIZE_SUPPORTED:
				setMaxSizeSupported((Long)newValue);
				return;
			case CimPackage.CIM_PRINTER__AVAILABLE_JOB_SHEETS:
				getAvailableJobSheets().clear();
				getAvailableJobSheets().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PRINTER__MARKING_TECHNOLOGY:
				setMarkingTechnology((Integer)newValue);
				return;
			case CimPackage.CIM_PRINTER__CONSOLE_NATURAL_LANGUAGE:
				setConsoleNaturalLanguage((String)newValue);
				return;
			case CimPackage.CIM_PRINTER__CONSOLE_DISPLAY_BUFFER_TEXT:
				getConsoleDisplayBufferText().clear();
				getConsoleDisplayBufferText().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_PRINTER__PRINTER_STATUS:
				setPrinterStatus(PRINTER_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__DETECTED_ERROR_STATE:
				setDetectedErrorState(DETECTED_ERROR_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__ERROR_INFORMATION:
				getErrorInformation().clear();
				return;
			case CimPackage.CIM_PRINTER__PAPER_SIZES_SUPPORTED:
				getPaperSizesSupported().clear();
				return;
			case CimPackage.CIM_PRINTER__PAPER_TYPES_AVAILABLE:
				getPaperTypesAvailable().clear();
				return;
			case CimPackage.CIM_PRINTER__DEFAULT_PAPER_TYPE:
				setDefaultPaperType(DEFAULT_PAPER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__CURRENT_PAPER_TYPE:
				setCurrentPaperType(CURRENT_PAPER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__LANGUAGES_SUPPORTED:
				getLanguagesSupported().clear();
				return;
			case CimPackage.CIM_PRINTER__MIME_TYPES_SUPPORTED:
				getMimeTypesSupported().clear();
				return;
			case CimPackage.CIM_PRINTER__CURRENT_LANGUAGE:
				setCurrentLanguage(CURRENT_LANGUAGE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__CURRENT_MIME_TYPE:
				setCurrentMimeType(CURRENT_MIME_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__DEFAULT_LANGUAGE:
				setDefaultLanguage(DEFAULT_LANGUAGE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__DEFAULT_MIME_TYPE:
				setDefaultMimeType(DEFAULT_MIME_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__JOB_COUNT_SINCE_LAST_RESET:
				setJobCountSinceLastReset(JOB_COUNT_SINCE_LAST_RESET_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__TIME_OF_LAST_RESET:
				setTimeOfLastReset(TIME_OF_LAST_RESET_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__CAPABILITIES:
				getCapabilities().clear();
				return;
			case CimPackage.CIM_PRINTER__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				return;
			case CimPackage.CIM_PRINTER__DEFAULT_CAPABILITIES:
				getDefaultCapabilities().clear();
				return;
			case CimPackage.CIM_PRINTER__CURRENT_CAPABILITIES:
				getCurrentCapabilities().clear();
				return;
			case CimPackage.CIM_PRINTER__MAX_COPIES:
				setMaxCopies(MAX_COPIES_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__DEFAULT_COPIES:
				setDefaultCopies(DEFAULT_COPIES_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__MAX_NUMBER_UP:
				setMaxNumberUp(MAX_NUMBER_UP_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__DEFAULT_NUMBER_UP:
				setDefaultNumberUp(DEFAULT_NUMBER_UP_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__HORIZONTAL_RESOLUTION:
				setHorizontalResolution(HORIZONTAL_RESOLUTION_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__VERTICAL_RESOLUTION:
				setVerticalResolution(VERTICAL_RESOLUTION_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__CHAR_SETS_SUPPORTED:
				getCharSetsSupported().clear();
				return;
			case CimPackage.CIM_PRINTER__CURRENT_CHAR_SET:
				setCurrentCharSet(CURRENT_CHAR_SET_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__NATURAL_LANGUAGES_SUPPORTED:
				getNaturalLanguagesSupported().clear();
				return;
			case CimPackage.CIM_PRINTER__CURRENT_NATURAL_LANGUAGE:
				setCurrentNaturalLanguage(CURRENT_NATURAL_LANGUAGE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__MAX_SIZE_SUPPORTED:
				setMaxSizeSupported(MAX_SIZE_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__AVAILABLE_JOB_SHEETS:
				getAvailableJobSheets().clear();
				return;
			case CimPackage.CIM_PRINTER__MARKING_TECHNOLOGY:
				setMarkingTechnology(MARKING_TECHNOLOGY_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__CONSOLE_NATURAL_LANGUAGE:
				setConsoleNaturalLanguage(CONSOLE_NATURAL_LANGUAGE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINTER__CONSOLE_DISPLAY_BUFFER_TEXT:
				getConsoleDisplayBufferText().clear();
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
			case CimPackage.CIM_PRINTER__PRINTER_STATUS:
				return PRINTER_STATUS_EDEFAULT == null ? printerStatus != null : !PRINTER_STATUS_EDEFAULT.equals(printerStatus);
			case CimPackage.CIM_PRINTER__DETECTED_ERROR_STATE:
				return DETECTED_ERROR_STATE_EDEFAULT == null ? detectedErrorState != null : !DETECTED_ERROR_STATE_EDEFAULT.equals(detectedErrorState);
			case CimPackage.CIM_PRINTER__ERROR_INFORMATION:
				return errorInformation != null && !errorInformation.isEmpty();
			case CimPackage.CIM_PRINTER__PAPER_SIZES_SUPPORTED:
				return paperSizesSupported != null && !paperSizesSupported.isEmpty();
			case CimPackage.CIM_PRINTER__PAPER_TYPES_AVAILABLE:
				return paperTypesAvailable != null && !paperTypesAvailable.isEmpty();
			case CimPackage.CIM_PRINTER__DEFAULT_PAPER_TYPE:
				return DEFAULT_PAPER_TYPE_EDEFAULT == null ? defaultPaperType != null : !DEFAULT_PAPER_TYPE_EDEFAULT.equals(defaultPaperType);
			case CimPackage.CIM_PRINTER__CURRENT_PAPER_TYPE:
				return CURRENT_PAPER_TYPE_EDEFAULT == null ? currentPaperType != null : !CURRENT_PAPER_TYPE_EDEFAULT.equals(currentPaperType);
			case CimPackage.CIM_PRINTER__LANGUAGES_SUPPORTED:
				return languagesSupported != null && !languagesSupported.isEmpty();
			case CimPackage.CIM_PRINTER__MIME_TYPES_SUPPORTED:
				return mimeTypesSupported != null && !mimeTypesSupported.isEmpty();
			case CimPackage.CIM_PRINTER__CURRENT_LANGUAGE:
				return CURRENT_LANGUAGE_EDEFAULT == null ? currentLanguage != null : !CURRENT_LANGUAGE_EDEFAULT.equals(currentLanguage);
			case CimPackage.CIM_PRINTER__CURRENT_MIME_TYPE:
				return CURRENT_MIME_TYPE_EDEFAULT == null ? currentMimeType != null : !CURRENT_MIME_TYPE_EDEFAULT.equals(currentMimeType);
			case CimPackage.CIM_PRINTER__DEFAULT_LANGUAGE:
				return DEFAULT_LANGUAGE_EDEFAULT == null ? defaultLanguage != null : !DEFAULT_LANGUAGE_EDEFAULT.equals(defaultLanguage);
			case CimPackage.CIM_PRINTER__DEFAULT_MIME_TYPE:
				return DEFAULT_MIME_TYPE_EDEFAULT == null ? defaultMimeType != null : !DEFAULT_MIME_TYPE_EDEFAULT.equals(defaultMimeType);
			case CimPackage.CIM_PRINTER__JOB_COUNT_SINCE_LAST_RESET:
				return JOB_COUNT_SINCE_LAST_RESET_EDEFAULT == null ? jobCountSinceLastReset != null : !JOB_COUNT_SINCE_LAST_RESET_EDEFAULT.equals(jobCountSinceLastReset);
			case CimPackage.CIM_PRINTER__TIME_OF_LAST_RESET:
				return TIME_OF_LAST_RESET_EDEFAULT == null ? timeOfLastReset != null : !TIME_OF_LAST_RESET_EDEFAULT.equals(timeOfLastReset);
			case CimPackage.CIM_PRINTER__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case CimPackage.CIM_PRINTER__CAPABILITY_DESCRIPTIONS:
				return capabilityDescriptions != null && !capabilityDescriptions.isEmpty();
			case CimPackage.CIM_PRINTER__DEFAULT_CAPABILITIES:
				return defaultCapabilities != null && !defaultCapabilities.isEmpty();
			case CimPackage.CIM_PRINTER__CURRENT_CAPABILITIES:
				return currentCapabilities != null && !currentCapabilities.isEmpty();
			case CimPackage.CIM_PRINTER__MAX_COPIES:
				return MAX_COPIES_EDEFAULT == null ? maxCopies != null : !MAX_COPIES_EDEFAULT.equals(maxCopies);
			case CimPackage.CIM_PRINTER__DEFAULT_COPIES:
				return DEFAULT_COPIES_EDEFAULT == null ? defaultCopies != null : !DEFAULT_COPIES_EDEFAULT.equals(defaultCopies);
			case CimPackage.CIM_PRINTER__MAX_NUMBER_UP:
				return MAX_NUMBER_UP_EDEFAULT == null ? maxNumberUp != null : !MAX_NUMBER_UP_EDEFAULT.equals(maxNumberUp);
			case CimPackage.CIM_PRINTER__DEFAULT_NUMBER_UP:
				return DEFAULT_NUMBER_UP_EDEFAULT == null ? defaultNumberUp != null : !DEFAULT_NUMBER_UP_EDEFAULT.equals(defaultNumberUp);
			case CimPackage.CIM_PRINTER__HORIZONTAL_RESOLUTION:
				return HORIZONTAL_RESOLUTION_EDEFAULT == null ? horizontalResolution != null : !HORIZONTAL_RESOLUTION_EDEFAULT.equals(horizontalResolution);
			case CimPackage.CIM_PRINTER__VERTICAL_RESOLUTION:
				return VERTICAL_RESOLUTION_EDEFAULT == null ? verticalResolution != null : !VERTICAL_RESOLUTION_EDEFAULT.equals(verticalResolution);
			case CimPackage.CIM_PRINTER__CHAR_SETS_SUPPORTED:
				return charSetsSupported != null && !charSetsSupported.isEmpty();
			case CimPackage.CIM_PRINTER__CURRENT_CHAR_SET:
				return CURRENT_CHAR_SET_EDEFAULT == null ? currentCharSet != null : !CURRENT_CHAR_SET_EDEFAULT.equals(currentCharSet);
			case CimPackage.CIM_PRINTER__NATURAL_LANGUAGES_SUPPORTED:
				return naturalLanguagesSupported != null && !naturalLanguagesSupported.isEmpty();
			case CimPackage.CIM_PRINTER__CURRENT_NATURAL_LANGUAGE:
				return CURRENT_NATURAL_LANGUAGE_EDEFAULT == null ? currentNaturalLanguage != null : !CURRENT_NATURAL_LANGUAGE_EDEFAULT.equals(currentNaturalLanguage);
			case CimPackage.CIM_PRINTER__MAX_SIZE_SUPPORTED:
				return MAX_SIZE_SUPPORTED_EDEFAULT == null ? maxSizeSupported != null : !MAX_SIZE_SUPPORTED_EDEFAULT.equals(maxSizeSupported);
			case CimPackage.CIM_PRINTER__AVAILABLE_JOB_SHEETS:
				return availableJobSheets != null && !availableJobSheets.isEmpty();
			case CimPackage.CIM_PRINTER__MARKING_TECHNOLOGY:
				return MARKING_TECHNOLOGY_EDEFAULT == null ? markingTechnology != null : !MARKING_TECHNOLOGY_EDEFAULT.equals(markingTechnology);
			case CimPackage.CIM_PRINTER__CONSOLE_NATURAL_LANGUAGE:
				return CONSOLE_NATURAL_LANGUAGE_EDEFAULT == null ? consoleNaturalLanguage != null : !CONSOLE_NATURAL_LANGUAGE_EDEFAULT.equals(consoleNaturalLanguage);
			case CimPackage.CIM_PRINTER__CONSOLE_DISPLAY_BUFFER_TEXT:
				return consoleDisplayBufferText != null && !consoleDisplayBufferText.isEmpty();
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
		result.append(" (PrinterStatus: ");
		result.append(printerStatus);
		result.append(", DetectedErrorState: ");
		result.append(detectedErrorState);
		result.append(", ErrorInformation: ");
		result.append(errorInformation);
		result.append(", PaperSizesSupported: ");
		result.append(paperSizesSupported);
		result.append(", PaperTypesAvailable: ");
		result.append(paperTypesAvailable);
		result.append(", DefaultPaperType: ");
		result.append(defaultPaperType);
		result.append(", CurrentPaperType: ");
		result.append(currentPaperType);
		result.append(", LanguagesSupported: ");
		result.append(languagesSupported);
		result.append(", MimeTypesSupported: ");
		result.append(mimeTypesSupported);
		result.append(", CurrentLanguage: ");
		result.append(currentLanguage);
		result.append(", CurrentMimeType: ");
		result.append(currentMimeType);
		result.append(", DefaultLanguage: ");
		result.append(defaultLanguage);
		result.append(", DefaultMimeType: ");
		result.append(defaultMimeType);
		result.append(", JobCountSinceLastReset: ");
		result.append(jobCountSinceLastReset);
		result.append(", TimeOfLastReset: ");
		result.append(timeOfLastReset);
		result.append(", Capabilities: ");
		result.append(capabilities);
		result.append(", CapabilityDescriptions: ");
		result.append(capabilityDescriptions);
		result.append(", DefaultCapabilities: ");
		result.append(defaultCapabilities);
		result.append(", CurrentCapabilities: ");
		result.append(currentCapabilities);
		result.append(", MaxCopies: ");
		result.append(maxCopies);
		result.append(", DefaultCopies: ");
		result.append(defaultCopies);
		result.append(", MaxNumberUp: ");
		result.append(maxNumberUp);
		result.append(", DefaultNumberUp: ");
		result.append(defaultNumberUp);
		result.append(", HorizontalResolution: ");
		result.append(horizontalResolution);
		result.append(", VerticalResolution: ");
		result.append(verticalResolution);
		result.append(", CharSetsSupported: ");
		result.append(charSetsSupported);
		result.append(", CurrentCharSet: ");
		result.append(currentCharSet);
		result.append(", NaturalLanguagesSupported: ");
		result.append(naturalLanguagesSupported);
		result.append(", CurrentNaturalLanguage: ");
		result.append(currentNaturalLanguage);
		result.append(", MaxSizeSupported: ");
		result.append(maxSizeSupported);
		result.append(", AvailableJobSheets: ");
		result.append(availableJobSheets);
		result.append(", MarkingTechnology: ");
		result.append(markingTechnology);
		result.append(", ConsoleNaturalLanguage: ");
		result.append(consoleNaturalLanguage);
		result.append(", ConsoleDisplayBufferText: ");
		result.append(consoleDisplayBufferText);
		result.append(')');
		return result.toString();
	}

} //CIM_PrinterImpl

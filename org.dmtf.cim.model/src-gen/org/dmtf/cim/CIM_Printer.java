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
 * A representation of the model object '<em><b>CIM Printer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of the Printer LogicalDevice. The ABNF for CIM references to PWG Standards and MIBs is in the directory 'ftp://ftp.pwg.org/pub/pwg/general/process' in the file 'pwg-cim-references-format-20060309.txt'. Examples 
 * include: (a) a MappingStrings reference to a PWG Standard is 'PWG5101-1.PWG|Section 4 Media Color Names'; 
 * (b) a MappingStrings reference to a PWG MIB is 'MIB.PWG|PWG-IMAGING-COUNTER-MIB.icMonitorCompletedJobs'. 
 * Note: A Printer shall be associated with at least one of every required component (e.g., PrintMarker) via an instance of the PrinterComponent class. A Printer may be associated with zero or more optional components (e.g., PrintSupply) via an instance of the ConcreteComponent class. See: Model in section 2 of Printer MIB (RFC 3805).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getPrinterStatus <em>Printer Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getDetectedErrorState <em>Detected Error State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getErrorInformation <em>Error Information</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getPaperSizesSupported <em>Paper Sizes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getPaperTypesAvailable <em>Paper Types Available</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getDefaultPaperType <em>Default Paper Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getCurrentPaperType <em>Current Paper Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getLanguagesSupported <em>Languages Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getMimeTypesSupported <em>Mime Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getCurrentLanguage <em>Current Language</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getCurrentMimeType <em>Current Mime Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getDefaultLanguage <em>Default Language</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getDefaultMimeType <em>Default Mime Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getJobCountSinceLastReset <em>Job Count Since Last Reset</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getTimeOfLastReset <em>Time Of Last Reset</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getDefaultCapabilities <em>Default Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getCurrentCapabilities <em>Current Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getMaxCopies <em>Max Copies</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getDefaultCopies <em>Default Copies</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getMaxNumberUp <em>Max Number Up</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getDefaultNumberUp <em>Default Number Up</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getHorizontalResolution <em>Horizontal Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getVerticalResolution <em>Vertical Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getCharSetsSupported <em>Char Sets Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getCurrentCharSet <em>Current Char Set</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getNaturalLanguagesSupported <em>Natural Languages Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getCurrentNaturalLanguage <em>Current Natural Language</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getMaxSizeSupported <em>Max Size Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getAvailableJobSheets <em>Available Job Sheets</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getMarkingTechnology <em>Marking Technology</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getConsoleNaturalLanguage <em>Console Natural Language</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Printer#getConsoleDisplayBufferText <em>Console Display Buffer Text</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Printer()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.25.0' UMLPackagePath='CIM::Device::Printing' MappingStrings='[\"MIB.IETF|Printer-MIB.prtGeneralEntry\"]' override.ElementName='string' override.ElementName.Required='true' override.ElementName.Description='The user-friendly name for this instance of Printer. In addition, the user-friendly name can be used as an index property for a search or query. (Note: The name does not have to be unique within a namespace.) This name shall be generated as a factory default by the manufacturer and may be changed out-of-band to a site-specific name by the system administrator.' override.ElementName.MappingStrings='[\"MIB.IETF|Printer-MIB.prtGeneralPrinterName\"]' override.ElementName.ModelCorrespondence='[\"CIM_ManagedElement.ElementName\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_Printer extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>Printer Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status information for a Printer, beyond that specified in the LogicalDevice.Availability property. 
	 * Values mapped directly from hrPrinterStatus in Host Resources MIB (RFC 2790) are: 
	 * 1 (Other) means the printer is in some non-standard state 
	 * - see Printer.ErrorInformation for more information 
	 * 2 (Unknown) means the printer state is unknown 
	 * 3 (Idle) means the printer is ready but idle 
	 * 4 (Printing) means the printer is processing job(s) 
	 * 5 (Warmup) means the printer is warming up - not ready 
	 * Note: The values 6 (Stopped Printing) and 7 (Offline) are redundant with DetectedErrorState (below) and not mapped from hrPrinterStatus in Host Resources MIB (RFC 2790).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Printer Status</em>' attribute.
	 * @see #setPrinterStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_PrinterStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\"]' Values='[\"Other\",\"Unknown\",\"Idle\",\"Printing\",\"Warmup\",\"Stopped Printing\",\"Offline\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|HOST-RESOURCES-MIB.hrPrinterStatus\",\"MIB.IETF|HOST-RESOURCES-MIB.hrPrinterDetectedErrorState\"]' ModelCorrespondence='[\"CIM_LogicalDevice.Availability\",\"CIM_Printer.DetectedErrorState\",\"CIM_Printer.ErrorInformation\"]'"
	 * @generated
	 */
	Integer getPrinterStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getPrinterStatus <em>Printer Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Printer Status</em>' attribute.
	 * @see #getPrinterStatus()
	 * @generated
	 */
	void setPrinterStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Detected Error State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Printer error info mapped from hrPrinterDetectedErrorState in Host Resources MIB (RFC 2790), as follows: 
	 * 0 (Unknown) means no error information is available 
	 * 1 (Other) means some non-standard error has occurred 
	 * - see Printer.ErrorInformation for more information 
	 * 2 (No Error) means there are no error conditions 
	 * 3 (Low Paper) means PrintInputTray is low on paper 
	 * 4 (No Paper) means all PrintInputTray(s) are empty 
	 * 5 (Low Toner) means PrintMarker is low on toner 
	 * 6 (No Toner) means PrintMarker is out of toner 
	 * 7 (Door Open) means PrintInterlock is open 
	 * 8 (Jammed) means PrintMarker or PrintMediaPath is jammed 
	 * 9 (Offline) means Printer is offline (see PrinterStatus) 
	 * 10 (Service Requested) means intervention is required 
	 * 11 (Output Bin Full) means PrintOutputTray is full 
	 * 12 (Input Tray Missing) means PrintInputTray is missing 
	 * 13 (Output Tray Missing) means PrintOutputTray is missing 
	 * 14 (Marker Supply Missing) means PrintSupply is missing 
	 * 15 (Output Near Full) means PrintOutputTray is nearly full 
	 * 16 (Input Tray Empty) means PrintInputTray is empty 
	 * 17 (Overdue Prevent Maint) means Printer needs service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detected Error State</em>' attribute.
	 * @see #setDetectedErrorState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_DetectedErrorState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"..\"]' Values='[\"Unknown\",\"Other\",\"No Error\",\"Low Paper\",\"No Paper\",\"Low Toner\",\"No Toner\",\"Door Open\",\"Jammed\",\"Offline\",\"Service Requested\",\"Output Bin Full\",\"Input Tray Missing\",\"Output Tray Missing\",\"Marker Supply Missing\",\"Output Near Full\",\"Input Tray Empty\",\"Overdue Prevent Maint\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|HOST-RESOURCES-MIB.hrPrinterDetectedErrorState\"]' ModelCorrespondence='[\"CIM_Printer.ErrorInformation\"]'"
	 * @generated
	 */
	Integer getDetectedErrorState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getDetectedErrorState <em>Detected Error State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detected Error State</em>' attribute.
	 * @see #getDetectedErrorState()
	 * @generated
	 */
	void setDetectedErrorState(Integer value);

	/**
	 * Returns the value of the '<em><b>Error Information</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array that provides supplemental information for the current error state, that is indicated in DetectedErrorState.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Information</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_ErrorInformation()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MappingStrings='[\"RFC2911.IETF|Section 4.4.13 printer-state-message\"]' ModelCorrespondence='[\"CIM_Printer.DetectedErrorState\"]'"
	 * @generated
	 */
	EList<String> getErrorInformation();

	/**
	 * Returns the value of the '<em><b>Paper Sizes Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use PrintInputTray.MediaSizeName. 
	 * Deprecated description: 
	 * An integer array that indicates the sizes of paper supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paper Sizes Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_PaperSizesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_PrintInputTray.MediaSizeName\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"72\",\"73\",\"74\",\"75\",\"..\"]' Values='[\"Unknown\",\"Other\",\"A\",\"B\",\"C\",\"D\",\"E\",\"Letter\",\"Legal\",\"NA-10x13-Envelope\",\"NA-9x12-Envelope\",\"NA-Number-10-Envelope\",\"NA-7x9-Envelope\",\"NA-9x11-Envelope\",\"NA-10x14-Envelope\",\"NA-Number-9-Envelope\",\"NA-6x9-Envelope\",\"NA-10x15-Envelope\",\"A0\",\"A1\",\"A2\",\"A3\",\"A4\",\"A5\",\"A6\",\"A7\",\"A8\",\"A9\",\"A10\",\"B0\",\"B1\",\"B2\",\"B3\",\"B4\",\"B5\",\"B6\",\"B7\",\"B8\",\"B9\",\"B10\",\"C0\",\"C1\",\"C2\",\"C3\",\"C4\",\"C5\",\"C6\",\"C7\",\"C8\",\"ISO-Designated\",\"JIS B0\",\"JIS B1\",\"JIS B2\",\"JIS B3\",\"JIS B4\",\"JIS B5\",\"JIS B6\",\"JIS B7\",\"JIS B8\",\"JIS B9\",\"JIS B10\",\"NA-Letter\",\"NA-Legal\",\"B4-Envelope\",\"B5-Envelope\",\"C3-Envelope\",\"C4-Envelope\",\"C5-Envelope\",\"C6-Envelope\",\"Designated-Long-Envelope\",\"Monarch-Envelope\",\"Executive\",\"Folio\",\"Invoice\",\"Ledger\",\"Quarto\",\"DMTF Reserved\"]' MappingStrings='[\"PWG5101-1.PWG|Media Standardized Names\",\"MIB.IETF|Printer-MIB.prtInputMediaName\",\"MIB.IETF|Printer-MIB.prtInputMediaDimFeedDirChosen\",\"MIB.IETF|Printer-MIB.prtInputMediaDimXFeedDirChosen\",\"RFC2911.IETF|Printer.media-supported\",\"RFC2911.IETF|Section 4.2 Job Template Attributes\",\"RFC2911.IETF|Section 4.2.11 media\",\"RFC2911.IETF|APPENDIX C \'media\' keyword values\"]'"
	 * @generated
	 */
	EList<Integer> getPaperSizesSupported();

	/**
	 * Returns the value of the '<em><b>Paper Types Available</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use the MediaType, MediaName, and MediaSizeName and IsDefault properties in PrintInputTray. 
	 * Deprecated description: 
	 * An array of free-form strings specifying the types and sizes of paper that are currently available on the Printer. The values of the property SHOULD conform to the requirements of the PWG Media Standardized Names specification [PWG5101.1], which defines the normative values for this property. See older Appendix B 'Media Size Names' and Appendix C 'Media Names' of IETF Printer MIB v2 [RFC3805] which list the values of standardized media names defined in ISO DPA [ISO10175].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paper Types Available</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_PaperTypesAvailable()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]' ArrayType='Indexed' MappingStrings='[\"PWG5101-1.PWG|Media Standardized Names\",\"MIB.IETF|Printer-MIB.prtInputMediaName\",\"RFC2911.IETF|Printer.media-ready\",\"RFC2911.IETF|Section 4.2 Job Template Attributes\",\"RFC2911.IETF|Section 4.2.11 media\",\"RFC2911.IETF|APPENDIX C \'media\' keyword values\"]' ModelCorrespondence='[\"CIM_PrintJob.RequiredPaperType\",\"CIM_PrintService.PaperTypesAvailable\"]'"
	 * @generated
	 */
	EList<String> getPaperTypesAvailable();

	/**
	 * Returns the value of the '<em><b>Default Paper Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use the MediaType, MediaName, and MediaSizeName and IsDefault properties in PrintInputTray. 
	 * Deprecated description: 
	 * Specifies the paper type that the Printer will use if a PrintJob does not specify a particular type. The string should be a value of PaperTypesAvailable. The values of the property SHOULD conform to the requirements of the PWG Media Standardized Names specification [PWG5101.1], which defines the normative values for this property. See older Appendix B 'Media Size Names' and Appendix C 'Media Names' of IETF Printer MIB v2 [RFC3805] which list the values of standardized media names defined in ISO DPA [ISO10175].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Paper Type</em>' attribute.
	 * @see #setDefaultPaperType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_DefaultPaperType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' MappingStrings='[\"PWG5101-1.PWG|Media Standardized Names\",\"MIB.IETF|Printer-MIB.prtInputDefaultIndex\",\"MIB.IETF|Printer-MIB.prtInputMediaName\",\"RFC2911.IETF|Printer.media-default\",\"RFC2911.IETF|Section 4.2 Job Template Attributes\",\"RFC2911.IETF|Section 4.2.11 media\",\"RFC2911.IETF|APPENDIX C \'media\' keyword values\"]' ModelCorrespondence='[\"CIM_Printer.PaperTypesAvailable\"]'"
	 * @generated
	 */
	String getDefaultPaperType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getDefaultPaperType <em>Default Paper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Paper Type</em>' attribute.
	 * @see #getDefaultPaperType()
	 * @generated
	 */
	void setDefaultPaperType(String value);

	/**
	 * Returns the value of the '<em><b>Current Paper Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use the MediaType, MediaName, and MediaSizeName and IsDefault properties in PrintInputTray. 
	 * Deprecated description: 
	 * Specifies the paper type that the Printer is currently using. The string should be a value of PaperTypesAvailable. The values of the property SHOULD conform to the requirements of the PWG Media Standardized Names specification [PWG5101.1], which defines the normative values for this property. See older Appendix B 'Media Size Names' and Appendix C 'Media Names' of IETF Printer MIB v2 [RFC3805] which list the values of standardized media names defined in ISO DPA [ISO10175].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Paper Type</em>' attribute.
	 * @see #setCurrentPaperType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_CurrentPaperType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' MappingStrings='[\"PWG5101-1.PWG|Media Standardized Names\",\"MIB.IETF|Printer-MIB.prtInputDefaultIndex\",\"MIB.IETF|Printer-MIB.prtInputMediaName\",\"RFC2911.IETF|Printer.media-default\",\"RFC2911.IETF|Section 4.2 Job Template Attributes\",\"RFC2911.IETF|Section 4.2.11 media\",\"RFC2911.IETF|APPENDIX C \'media\' keyword values\"]' ModelCorrespondence='[\"CIM_Printer.PaperTypesAvailable\"]'"
	 * @generated
	 */
	String getCurrentPaperType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getCurrentPaperType <em>Current Paper Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Paper Type</em>' attribute.
	 * @see #getCurrentPaperType()
	 * @generated
	 */
	void setCurrentPaperType(String value);

	/**
	 * Returns the value of the '<em><b>Languages Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use PrintInterpreter.LangType. 
	 * Deprecated description: 
	 * An array that indicates the print languages that are natively supported 
	 * Note: For legacy compatiblity reasons, this property is NOT exactly aligned (in order of values) with the authoritative PrtInterpreterLangFamilyTC in the IANA Printer MIB, unlike the newer property PrintInterpreter.LangType (which is exactly aligned with the IANA Printer MIB).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Languages Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_LanguagesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_PrintInterpreter.LangType\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"..\"]' Values='[\"Other\",\"Unknown\",\"PCL\",\"HPGL\",\"PJL\",\"PS\",\"PSPrinter\",\"IPDS\",\"PPDS\",\"EscapeP\",\"Epson\",\"DDIF\",\"Interpress\",\"ISO6429\",\"Line Data\",\"MODCA\",\"REGIS\",\"SCS\",\"SPDL\",\"TEK4014\",\"PDS\",\"IGP\",\"CodeV\",\"DSCDSE\",\"WPS\",\"LN03\",\"CCITT\",\"QUIC\",\"CPAP\",\"DecPPL\",\"Simple Text\",\"NPAP\",\"DOC\",\"imPress\",\"Pinwriter\",\"NPDL\",\"NEC201PL\",\"Automatic\",\"Pages\",\"LIPS\",\"TIFF\",\"Diagnostic\",\"CaPSL\",\"EXCL\",\"LCDS\",\"XES\",\"MIME\",\"TIPSI\",\"Prescribe\",\"LinePrinter\",\"IDP\",\"XJCL\",\"PDF\",\"RPDL\",\"IntermecIPL\",\"UBIFingerprint\",\"UBIDirectProtocol\",\"Fujitsu\",\"PCLXL\",\"ART\",\"CGM\",\"JPEG\",\"CALS1\",\"CALS2\",\"NIRS\",\"C4\",\"XPS\",\"OpenXPS\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInterpreterLangFamily\",\"MIB.IETF|IANA-PRINTER-MIB.PrtInterpreterLangFamilyTC\",\"RFC2911.IETF|Section 4.4.22 document-format-supported\"]' ModelCorrespondence='[\"CIM_Printer.MimeTypesSupported\",\"CIM_PrintJob.Language\",\"CIM_PrintService.LanguagesSupported\",\"CIM_PrintInterpreter.LangType\"]'"
	 * @generated
	 */
	EList<Integer> getLanguagesSupported();

	/**
	 * Returns the value of the '<em><b>Mime Types Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use PrintInterpreter.LangType. 
	 * Deprecated description: 
	 * An array of free-form strings that provides more detailed explanations of any MIME types that are supported by the Printer. If data is provided for this property, then the (value=47), "Mime", should be included in the Languages Supported property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mime Types Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_MimeTypesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_PrintInterpreter.LangType\"]' MappingStrings='[\"RFC2911.IETF|Section 4.4.22 document-format-supported\"]' ModelCorrespondence='[\"CIM_Printer.LanguagesSupported\",\"CIM_PrintJob.MimeTypes\",\"CIM_PrintService.MimeTypesSupported\",\"CIM_PrintInterpreter.LangType\"]'"
	 * @generated
	 */
	EList<String> getMimeTypesSupported();

	/**
	 * Returns the value of the '<em><b>Current Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use the Printer component classes PrintInterpreter and PrintChannel and the association class AssociatedPrintInterpreter value of DefaultType (JCL or PDL) to the PrintInterpreter.LangType property for default language(s) for each PrintChannel instance. 
	 * Deprecated description: 
	 * Indicates the current printer language being used. A language that is being used by the Printer should also be listed in LanguagesSupported. 
	 * Note: For legacy compatiblity reasons, this property is NOT exactly aligned (in order of values) with the authoritative PrtInterpreterLangFamilyTC in the IANA Printer MIB, unlike the newer property PrintInterpreter.LangType (which is exactly aligned with the IANA Printer MIB).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Language</em>' attribute.
	 * @see #setCurrentLanguage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_CurrentLanguage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_PrintInterpreter.LangType\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"..\"]' Values='[\"Other\",\"Unknown\",\"PCL\",\"HPGL\",\"PJL\",\"PS\",\"PSPrinter\",\"IPDS\",\"PPDS\",\"EscapeP\",\"Epson\",\"DDIF\",\"Interpress\",\"ISO6429\",\"Line Data\",\"MODCA\",\"REGIS\",\"SCS\",\"SPDL\",\"TEK4014\",\"PDS\",\"IGP\",\"CodeV\",\"DSCDSE\",\"WPS\",\"LN03\",\"CCITT\",\"QUIC\",\"CPAP\",\"DecPPL\",\"Simple Text\",\"NPAP\",\"DOC\",\"imPress\",\"Pinwriter\",\"NPDL\",\"NEC201PL\",\"Automatic\",\"Pages\",\"LIPS\",\"TIFF\",\"Diagnostic\",\"CaPSL\",\"EXCL\",\"LCDS\",\"XES\",\"MIME\",\"TIPSI\",\"Prescribe\",\"LinePrinter\",\"IDP\",\"XJCL\",\"PDF\",\"RPDL\",\"IntermecIPL\",\"UBIFingerprint\",\"UBIDirectProtocol\",\"Fujitsu\",\"PCLXL\",\"ART\",\"CGM\",\"JPEG\",\"CALS1\",\"CALS2\",\"NIRS\",\"C4\",\"XPS\",\"OpenXPS\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtChannelDefaultPageDescLangIndex\",\"MIB.IETF|Printer-MIB.prtInterpreterLangFamily\",\"MIB.IETF|IANA-PRINTER-MIB.PrtInterpreterLangFamilyTC\",\"RFC2911.IETF|Section 4.4.21 document-format-default\"]' ModelCorrespondence='[\"CIM_Printer.LanguagesSupported\",\"CIM_Printer.CurrentMimeType\"]'"
	 * @generated
	 */
	Integer getCurrentLanguage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getCurrentLanguage <em>Current Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Language</em>' attribute.
	 * @see #getCurrentLanguage()
	 * @generated
	 */
	void setCurrentLanguage(Integer value);

	/**
	 * Returns the value of the '<em><b>Current Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use the Printer component classes PrintInterpreter and PrintChannel and the association class AssociatedPrintInterpreter value of DefaultType (JCL or PDL) to the PrintInterpreter.LangType property for default language(s) for each PrintChannel instance. 
	 * Deprecated description: 
	 * Specifies the MIME type that is currently in use by the Printer if the CurrentLanguage is set to indicate that a MIME type is in use (value=47).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Mime Type</em>' attribute.
	 * @see #setCurrentMimeType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_CurrentMimeType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_PrintInterpreter.LangType\"]' MappingStrings='[\"RFC2911.IETF|Section 4.4.21 document-format-default\"]' ModelCorrespondence='[\"CIM_Printer.CurrentLanguage\"]'"
	 * @generated
	 */
	String getCurrentMimeType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getCurrentMimeType <em>Current Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Mime Type</em>' attribute.
	 * @see #getCurrentMimeType()
	 * @generated
	 */
	void setCurrentMimeType(String value);

	/**
	 * Returns the value of the '<em><b>Default Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use the Printer component classes PrintInterpreter and PrintChannel and the association class AssociatedPrintInterpreter value of DefaultType (JCL or PDL) to the PrintInterpreter.LangType property for default language(s) for each PrintChannel instance. 
	 * Deprecated description: 
	 * Indicates the default printer language. A language that is used as a default by the Printer should also be listed in LanguagesSupported. 
	 * Note: For legacy compatiblity reasons, this property is NOT exactly aligned (in order of values) with the authoritative PrtInterpreterLangFamilyTC in the IANA Printer MIB, unlike the newer property PrintInterpreter.LangType (which is exactly aligned with the IANA Printer MIB).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Language</em>' attribute.
	 * @see #setDefaultLanguage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_DefaultLanguage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_PrintInterpreter.LangType\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"..\"]' Values='[\"Other\",\"Unknown\",\"PCL\",\"HPGL\",\"PJL\",\"PS\",\"PSPrinter\",\"IPDS\",\"PPDS\",\"EscapeP\",\"Epson\",\"DDIF\",\"Interpress\",\"ISO6429\",\"Line Data\",\"MODCA\",\"REGIS\",\"SCS\",\"SPDL\",\"TEK4014\",\"PDS\",\"IGP\",\"CodeV\",\"DSCDSE\",\"WPS\",\"LN03\",\"CCITT\",\"QUIC\",\"CPAP\",\"DecPPL\",\"Simple Text\",\"NPAP\",\"DOC\",\"imPress\",\"Pinwriter\",\"NPDL\",\"NEC201PL\",\"Automatic\",\"Pages\",\"LIPS\",\"TIFF\",\"Diagnostic\",\"CaPSL\",\"EXCL\",\"LCDS\",\"XES\",\"MIME\",\"TIPSI\",\"Prescribe\",\"LinePrinter\",\"IDP\",\"XJCL\",\"PDF\",\"RPDL\",\"IntermecIPL\",\"UBIFingerprint\",\"UBIDirectProtocol\",\"Fujitsu\",\"PCLXL\",\"ART\",\"CGM\",\"JPEG\",\"CALS1\",\"CALS2\",\"NIRS\",\"C4\",\"XPS\",\"OpenXPS\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtChannelDefaultPageDescLangIndex\",\"MIB.IETF|Printer-MIB.prtInterpreterLangFamily\",\"MIB.IETF|IANA-PRINTER-MIB.PrtInterpreterLangFamilyTC\",\"RFC2911.IETF|Section 4.4.21 document-format-default\"]' ModelCorrespondence='[\"CIM_Printer.LanguagesSupported\",\"CIM_Printer.DefaultMimeType\"]'"
	 * @generated
	 */
	Integer getDefaultLanguage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getDefaultLanguage <em>Default Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Language</em>' attribute.
	 * @see #getDefaultLanguage()
	 * @generated
	 */
	void setDefaultLanguage(Integer value);

	/**
	 * Returns the value of the '<em><b>Default Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use the Printer component classes PrintInterpreter and PrintChannel and the association class AssociatedPrintInterpreter value of DefaultType (JCL or PDL) to the PrintInterpreter.LangType property for default language(s) for each PrintChannel instance. 
	 * Deprecated description: 
	 * Specifies the default MIME type that is used by the Printer if the DefaultLanguage is set to indicate that a MIME type is in use (value=47).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Mime Type</em>' attribute.
	 * @see #setDefaultMimeType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_DefaultMimeType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_PrintInterpreter.LangType\"]' MappingStrings='[\"RFC2911.IETF|Section 4.4.21 document-format-default\"]' ModelCorrespondence='[\"CIM_Printer.DefaultLanguage\"]'"
	 * @generated
	 */
	String getDefaultMimeType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getDefaultMimeType <em>Default Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Mime Type</em>' attribute.
	 * @see #getDefaultMimeType()
	 * @generated
	 */
	void setDefaultMimeType(String value);

	/**
	 * Returns the value of the '<em><b>Job Count Since Last Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Printer jobs that are processed since last reset. These jobs can be processed from one or more PrintQueues.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Job Count Since Last Reset</em>' attribute.
	 * @see #setJobCountSinceLastReset(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_JobCountSinceLastReset()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.PWG|PWG-IMAGING-COUNTER-MIB.icMonitorCompletedJobs\"]'"
	 * @generated
	 */
	Long getJobCountSinceLastReset();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getJobCountSinceLastReset <em>Job Count Since Last Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Count Since Last Reset</em>' attribute.
	 * @see #getJobCountSinceLastReset()
	 * @generated
	 */
	void setJobCountSinceLastReset(Long value);

	/**
	 * Returns the value of the '<em><b>Time Of Last Reset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time of the last reset of the Printer Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Of Last Reset</em>' attribute.
	 * @see #setTimeOfLastReset(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_TimeOfLastReset()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"MIB.IETF|SNMPv2-MIB.sysUpTime\",\"MIB.IETF|HOST-RESOURCES-MIB.hrSystemUptime\",\"MIB.IETF|HOST-RESOURCES-MIB.hrSystemDate\",\"RFC2911.IETF|Section 4.4.29 printer-up-time\",\"RFC2911.IETF|Section 4.4.30 printer-current-time\"]'"
	 * @generated
	 */
	String getTimeOfLastReset();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getTimeOfLastReset <em>Time Of Last Reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Last Reset</em>' attribute.
	 * @see #getTimeOfLastReset()
	 * @generated
	 */
	void setTimeOfLastReset(String value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use the Printer component classes, e.g., PrintInputTray, PrintMarker, PrintFinisher, etc. For example, 3 (Duplex Printing) support can be found in the PrintMediaPath.Type property. 
	 * Deprecated description: 
	 * An array of integers that indicates Printer capabilities. Information such as "Duplex Printing" (value=3) or "Transparency Printing" (value=7) is specified in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"..\"]' Values='[\"Unknown\",\"Other\",\"Color Printing\",\"Duplex Printing\",\"Copies\",\"Collation\",\"Stapling\",\"Transparency Printing\",\"Punch\",\"Cover\",\"Bind\",\"Black and White Printing\",\"One Sided\",\"Two Sided Long Edge\",\"Two Sided Short Edge\",\"Portrait\",\"Landscape\",\"Reverse Portrait\",\"Reverse Landscape\",\"Quality High\",\"Quality Normal\",\"Quality Low\",\"DMTF Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_Printer.CapabilityDescriptions\",\"CIM_PrintJob.Finishing\",\"CIM_PrintService.Capabilities\"]'"
	 * @generated
	 */
	EList<Integer> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Capability Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use the Printer component classes, e.g., PrintInputTray, PrintMarker, PrintFinisher, etc. 
	 * Deprecated description: 
	 * An array of free-form strings that provides more detailed explanations for any of the Printer features that are indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_CapabilityDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_Printer.Capabilities\"]'"
	 * @generated
	 */
	EList<String> getCapabilityDescriptions();

	/**
	 * Returns the value of the '<em><b>Default Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use the Printer component classes, e.g., PrintInputTray, PrintMarker, PrintFinisher, etc. 
	 * Deprecated description: 
	 * Specifies which finishings and other capabilities of the Printer will be used by default. An entry in Default Capabilities should also be listed in the Capabilities array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_DefaultCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"..\"]' Values='[\"Unknown\",\"Other\",\"Color Printing\",\"Duplex Printing\",\"Copies\",\"Collation\",\"Stapling\",\"Transparency Printing\",\"Punch\",\"Cover\",\"Bind\",\"Black and White Printing\",\"One Sided\",\"Two Sided Long Edge\",\"Two Sided Short Edge\",\"Portrait\",\"Landscape\",\"Reverse Portrait\",\"Reverse Landscape\",\"Quality High\",\"Quality Normal\",\"Quality Low\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_Printer.Capabilities\"]'"
	 * @generated
	 */
	EList<Integer> getDefaultCapabilities();

	/**
	 * Returns the value of the '<em><b>Current Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use the Printer component classes, e.g., PrintInputTray, PrintMarker, PrintFinisher, etc. 
	 * Deprecated description: 
	 * Specifies which finishings and other capabilities of the Printer are currently being used. An entry in this property should also be listed in the Capabilities array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_CurrentCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"..\"]' Values='[\"Unknown\",\"Other\",\"Color Printing\",\"Duplex Printing\",\"Copies\",\"Collation\",\"Stapling\",\"Transparency Printing\",\"Punch\",\"Cover\",\"Bind\",\"Black and White Printing\",\"One Sided\",\"Two Sided Long Edge\",\"Two Sided Short Edge\",\"Portrait\",\"Landscape\",\"Reverse Portrait\",\"Reverse Landscape\",\"Quality High\",\"Quality Normal\",\"Quality Low\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_Printer.Capabilities\"]'"
	 * @generated
	 */
	EList<Integer> getCurrentCapabilities();

	/**
	 * Returns the value of the '<em><b>Max Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property will be deprecated in favor of new PrintServiceCapabilities.Copies in the future. 
	 * The maximum number of copies that can be produced by the Printer from a single Job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Copies</em>' attribute.
	 * @see #setMaxCopies(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_MaxCopies()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"RFC2911.IETF|Printer.copies-supported\",\"RFC2911.IETF|Section 4.2 Job Template Attributes\",\"RFC2911.IETF|Section 4.2.5 copies\"]' ModelCorrespondence='[\"CIM_PrintJob.Copies\"]'"
	 * @generated
	 */
	Long getMaxCopies();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getMaxCopies <em>Max Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Copies</em>' attribute.
	 * @see #getMaxCopies()
	 * @generated
	 */
	void setMaxCopies(Long value);

	/**
	 * Returns the value of the '<em><b>Default Copies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property will be deprecated in favor of new PrintServiceSettings.Copies in the future. 
	 * The number of copies that will be produced for a single Job unless otherwise specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Copies</em>' attribute.
	 * @see #setDefaultCopies(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_DefaultCopies()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"RFC2911.IETF|Printer.copies-default\",\"RFC2911.IETF|Section 4.2 Job Template Attributes\",\"RFC2911.IETF|Section 4.2.5 copies\"]'"
	 * @generated
	 */
	Long getDefaultCopies();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getDefaultCopies <em>Default Copies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Copies</em>' attribute.
	 * @see #getDefaultCopies()
	 * @generated
	 */
	void setDefaultCopies(Long value);

	/**
	 * Returns the value of the '<em><b>Max Number Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property will be deprecated in favor of new PrintServiceCapabilities.NumberUp in the future. 
	 * The maximum number of print-stream pages that the Printer can render onto a single media sheet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Number Up</em>' attribute.
	 * @see #setMaxNumberUp(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_MaxNumberUp()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"RFC2911.IETF|Printer.number-up-supported\",\"RFC2911.IETF|Section 4.2 Job Template Attributes\",\"RFC2911.IETF|Section 4.2.9 number-up\"]' ModelCorrespondence='[\"CIM_PrintJob.NumberUp\"]'"
	 * @generated
	 */
	Long getMaxNumberUp();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getMaxNumberUp <em>Max Number Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Up</em>' attribute.
	 * @see #getMaxNumberUp()
	 * @generated
	 */
	void setMaxNumberUp(Long value);

	/**
	 * Returns the value of the '<em><b>Default Number Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property will be deprecated in favor of new PrintServiceSettings.NumberUp in the future. 
	 * The number of print-stream pages that the Printer will render onto a single media sheet unless a Job specifies otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Number Up</em>' attribute.
	 * @see #setDefaultNumberUp(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_DefaultNumberUp()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"RFC2911.IETF|Printer.number-up-default\",\"RFC2911.IETF|Section 4.2 Job Template Attributes\",\"RFC2911.IETF|Section 4.2.9 number-up\"]'"
	 * @generated
	 */
	Long getDefaultNumberUp();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getDefaultNumberUp <em>Default Number Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Number Up</em>' attribute.
	 * @see #getDefaultNumberUp()
	 * @generated
	 */
	void setDefaultNumberUp(Long value);

	/**
	 * Returns the value of the '<em><b>Horizontal Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use the XFeedAddressability property in the Printer component classes PrintMarker and PrintInterpreter. 
	 * Deprecated description: 
	 * The resolution of the Printer in Pixels per Inch in the cross-feed direction, i.e., short-edge in portrait feed mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizontal Resolution</em>' attribute.
	 * @see #setHorizontalResolution(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_HorizontalResolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_PrintMarker.XFeedAddressability\"]' Units='Pixels per Inch' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerAddressabilityXFeedDir\",\"RFC2911.IETF|Section 4.2.12 printer-resolution\"]' ModelCorrespondence='[\"CIM_PrintJob.HorizontalResolution\"]' PUnit='pixel / inch'"
	 * @generated
	 */
	Long getHorizontalResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getHorizontalResolution <em>Horizontal Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Resolution</em>' attribute.
	 * @see #getHorizontalResolution()
	 * @generated
	 */
	void setHorizontalResolution(Long value);

	/**
	 * Returns the value of the '<em><b>Vertical Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use the FeedAddressability property in the Printer component classes PrintMarker and PrintInterpreter. 
	 * Deprecated description: 
	 * The resolution of the Printer in Pixels per Inch in the feed direction, i.e., long-edge in portrait feed mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Resolution</em>' attribute.
	 * @see #setVerticalResolution(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_VerticalResolution()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_PrintMarker.FeedAddressability\"]' Units='Pixels per Inch' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerAddressabilityFeedDir\",\"RFC2911.IETF|Section 4.2.12 printer-resolution\"]' ModelCorrespondence='[\"CIM_PrintJob.VerticalResolution\"]' PUnit='pixel / inch'"
	 * @generated
	 */
	Long getVerticalResolution();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getVerticalResolution <em>Vertical Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Resolution</em>' attribute.
	 * @see #getVerticalResolution()
	 * @generated
	 */
	void setVerticalResolution(Long value);

	/**
	 * Returns the value of the '<em><b>Char Sets Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the available character sets for the output of text that is related to managing the Printer. Strings provided in this property should conform to the semantics and syntax specified by section 4.1.2 ("Charset parameter") in RFC 2046 (MIME Part 2) and contained in the IANA character-set registry. Examples include "utf-8", "us-ascii" and "iso-8859-1". 
	 * Note: For compatiblity with the IETF Printer MIB (RFC 3805) and IETF IPP/1.1 (RFC 2911), values in this array property shall be parallel to values in NaturalLanguagesSupported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Char Sets Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_CharSetsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IETF|Printer-MIB.prtLocalizationCharacterSet\",\"MIB.IETF|IANA-CHARSET-MIB.IANACharset\",\"RFC2911.IETF|Section 4.4.18 charset-supported\"]' ModelCorrespondence='[\"CIM_PrintJob.CharSet\"]'"
	 * @generated
	 */
	EList<String> getCharSetsSupported();

	/**
	 * Returns the value of the '<em><b>Current Char Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the current character set that is being used for the output of text that relates to the management of the Printer. The character set that is described by this property should also be listed in CharsetsSupported. The string that is specified by this property should conform to the semantics and syntax that are specified by section 4.1.2 ("Charset parameter") in RFC 2046 (MIME Part 2) and contained in the IANA character-set registry. Examples include "utf-8", "us-ascii" and "iso-8859-1". 
	 * Note: For compatiblity with the IETF Printer MIB (RFC 3805) and IETF IPP/1.1 (RFC 2911), values in this array property shall be parallel to values in CharSetsSupported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Char Set</em>' attribute.
	 * @see #setCurrentCharSet(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_CurrentCharSet()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|Printer-MIB.prtGeneralCurrentLocalization\",\"MIB.IETF|Printer-MIB.prtLocalizationCharacterSet\",\"MIB.IETF|IANA-CHARSET-MIB.IANACharset\",\"RFC2911.IETF|Section 4.4.19 charset-configured\"]' ModelCorrespondence='[\"CIM_Printer.CharSetsSupported\"]'"
	 * @generated
	 */
	String getCurrentCharSet();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getCurrentCharSet <em>Current Char Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Char Set</em>' attribute.
	 * @see #getCurrentCharSet()
	 * @generated
	 */
	void setCurrentCharSet(String value);

	/**
	 * Returns the value of the '<em><b>Natural Languages Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the available languages for strings that are used by the Printer for the output of management information. The strings should conform to RFC 1766, for example, "en" is used for English.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Natural Languages Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_NaturalLanguagesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IETF|Printer-MIB.prtLocalizationLanguage\",\"MIB.IETF|Printer-MIB.prtLocalizationCountry\",\"RFC2911.IETF|Printer.generated-natural-language-supported\",\"RFC2911.IETF|Section 4.4.20\"]' ModelCorrespondence='[\"CIM_Printer.CurrentNaturalLanguage\",\"CIM_Printer.ConsoleNaturalLanguage\",\"CIM_PrintJob.NaturalLanguage\"]'"
	 * @generated
	 */
	EList<String> getNaturalLanguagesSupported();

	/**
	 * Returns the value of the '<em><b>Current Natural Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the current language that is being used by the Printer for management. The language listed in the CurrentNaturalLanguage property should also be listed in NaturalLanguagesSupported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Natural Language</em>' attribute.
	 * @see #setCurrentNaturalLanguage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_CurrentNaturalLanguage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|Printer-MIB.prtGeneralCurrentLocalization\",\"MIB.IETF|Printer-MIB.prtLocalizationLanguage\",\"MIB.IETF|Printer-MIB.prtLocalizationCountry\",\"RFC2911.IETF|Section 4.4.19 natural-language-configured\"]' ModelCorrespondence='[\"CIM_Printer.NaturalLanguagesSupported\"]'"
	 * @generated
	 */
	String getCurrentNaturalLanguage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getCurrentNaturalLanguage <em>Current Natural Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Natural Language</em>' attribute.
	 * @see #getCurrentNaturalLanguage()
	 * @generated
	 */
	void setCurrentNaturalLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Max Size Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property will be deprecated in favor of new PrintServiceCapabilities.MaxJobSize in the future. 
	 * Specifies the largest Job (as a byte stream) that the Printer will accept in units of Kbytes. A value of 0 indicates that no limit has been set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Size Supported</em>' attribute.
	 * @see #setMaxSizeSupported(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_MaxSizeSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='KiloBytes' MappingStrings='[\"RFC2911.IETF|Section 4.4.33 job-k-octets-supported\"]' ModelCorrespondence='[\"CIM_PrintJob.JobSize\"]' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getMaxSizeSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getMaxSizeSupported <em>Max Size Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size Supported</em>' attribute.
	 * @see #getMaxSizeSupported()
	 * @generated
	 */
	void setMaxSizeSupported(Long value);

	/**
	 * Returns the value of the '<em><b>Available Job Sheets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes all of the job sheets that are available on the Printer. This method can also be used to describe the banner that a Printer might provide at the beginning of each Job or that can describe other user specified options.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Job Sheets</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_AvailableJobSheets()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtAuxiliarySheetStartupPage\",\"MIB.IETF|Printer-MIB.prtAuxiliarySheetBannerPage\",\"RFC2911.IETF|Printer.job-sheets-supported\",\"RFC2911.IETF|Section 4.2 Job Template Attributes\",\"RFC2911.IETF|Section 4.2.3 job-sheets\"]' ModelCorrespondence='[\"CIM_PrintJob.RequiredJobSheets\"]'"
	 * @generated
	 */
	EList<String> getAvailableJobSheets();

	/**
	 * Returns the value of the '<em><b>Marking Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated, due to ambiguity. Instead use PrintMarker.MarkTech. 
	 * Deprecated description: 
	 * Specifies the marking technology that is used by the Printer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Marking Technology</em>' attribute.
	 * @see #setMarkingTechnology(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_MarkingTechnology()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_PrintMarker.MarkTech\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\"]' Values='[\"Other\",\"Unknown\",\"Electrophotographic LED\",\"Electrophotographic Laser\",\"Electrophotographic Other\",\"Impact Moving Head Dot Matrix 9pin\",\"Impact Moving Head Dot Matrix 24pin\",\"Impact Moving Head Dot Matrix Other\",\"Impact Moving Head Fully Formed\",\"Impact Band\",\"Impact Other\",\"Inkjet Aqueous\",\"Inkjet Solid\",\"Inkjet Other\",\"Pen\",\"Thermal Transfer\",\"Thermal Sensitive\",\"Thermal Diffusion\",\"Thermal Other\",\"Electroerosion\",\"Electrostatic\",\"Photographic Microfiche\",\"Photographic Imagesetter\",\"Photographic Other\",\"Ion Deposition\",\"eBeam\",\"Typesetter\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtMarkerMarkTech\",\"MIB.IETF|IANA-PRINTER-MIB.PrtMarkerMarkTechTC\"]'"
	 * @generated
	 */
	Integer getMarkingTechnology();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getMarkingTechnology <em>Marking Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marking Technology</em>' attribute.
	 * @see #getMarkingTechnology()
	 * @generated
	 */
	void setMarkingTechnology(Integer value);

	/**
	 * Returns the value of the '<em><b>Console Natural Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the current language that is being used by the Printer for the local console. The language listed in the ConsoleNaturalLanguage property should also be listed in NaturalLanguagesSupported. ConsoleDisplayBufferText values shall be in this natural language.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Console Natural Language</em>' attribute.
	 * @see #setConsoleNaturalLanguage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_ConsoleNaturalLanguage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|Printer-MIB.prtConsoleLocalization\",\"MIB.IETF|Printer-MIB.prtLocalizationLanguage\",\"MIB.IETF|Printer-MIB.prtLocalizationCountry\"]' ModelCorrespondence='[\"CIM_Printer.NaturalLanguagesSupported\",\"CIM_Printer.ConsoleDisplayBufferText\"]'"
	 * @generated
	 */
	String getConsoleNaturalLanguage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Printer#getConsoleNaturalLanguage <em>Console Natural Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Console Natural Language</em>' attribute.
	 * @see #getConsoleNaturalLanguage()
	 * @generated
	 */
	void setConsoleNaturalLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Console Display Buffer Text</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A sequence of strings, each a line of human-readable text from the local console of the Printer, in the language specified by ConsoleNaturalLanguage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Console Display Buffer Text</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Printer_ConsoleDisplayBufferText()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IETF|Printer-MIB.prtConsoleDisplayBufferText\"]' ModelCorrespondence='[\"CIM_Printer.NaturalLanguagesSupported\",\"CIM_Printer.ConsoleNaturalLanguage\"]'"
	 * @generated
	 */
	EList<String> getConsoleDisplayBufferText();

} // CIM_Printer

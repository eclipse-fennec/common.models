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
 * A representation of the model object '<em><b>CIM Print Interpreter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the PrintInterpreter component of a Printer (print device). It contains properties that describe the PrintInterpreter, including language type, language level, maximum resolution, default input character set, and status. Note: A PrintInterpreter shall be associated with exactly one Printer via an instance of the PrinterComponent class. A PrintInterpreter may be associated with a PrintChannel (for Job Control Language or Page Description Language defaults) via an instance of AssociatedPrintInterpreter. See: Model in section 2 of Printer MIB (RFC 3805).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PrintInterpreter#getLocalizedDescription <em>Localized Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInterpreter#getLangType <em>Lang Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInterpreter#getOtherLangTypeDescription <em>Other Lang Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInterpreter#getLangLevel <em>Lang Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInterpreter#getAddressabilityBasis <em>Addressability Basis</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInterpreter#getFeedAddressability <em>Feed Addressability</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInterpreter#getXFeedAddressability <em>XFeed Addressability</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInterpreter#getDefaultCharSetIn <em>Default Char Set In</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInterpreter#getAvailabilityStatus <em>Availability Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInterpreter#getOtherAvailabilityStatus <em>Other Availability Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInterpreter#getNonCriticalAlertsPresent <em>Non Critical Alerts Present</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintInterpreter#getCriticalAlertsPresent <em>Critical Alerts Present</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PrintInterpreter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.31.1' UMLPackagePath='CIM::Device::Printing' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInterpreterEntry\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PrintInterpreter extends CIM_PrinterElement {
	/**
	 * Returns the value of the '<em><b>Localized Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form text description of this PrintInterpreter in the localization specified by CIM_Printer.CurrentNaturalLanguage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Localized Description</em>' attribute.
	 * @see #setLocalizedDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInterpreter_LocalizedDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInterpreterDescription\",\"MIB.IETF|Printer-MIB.PrtLocalizedDescriptionStringTC\"]'"
	 * @generated
	 */
	String getLocalizedDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInterpreter#getLocalizedDescription <em>Localized Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localized Description</em>' attribute.
	 * @see #getLocalizedDescription()
	 * @generated
	 */
	void setLocalizedDescription(String value);

	/**
	 * Returns the value of the '<em><b>Lang Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The language type of a Page Description Language (PDL) or Job Control Language (JCL) which this PrintInterpreter can interpret or emulate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Type</em>' attribute.
	 * @see #setLangType(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInterpreter_LangType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Unknown\",\"LangPCL\",\"LangHPGL\",\"LangPJL\",\"LangPS\",\"LangIPDS\",\"LangPPDS\",\"LangEscapeP\",\"LangEpson\",\"LangDDIF\",\"LangInterpress\",\"LangISO6429\",\"LangLineData\",\"LangMODCA\",\"LangREGIS\",\"LangSCS\",\"LangSPDL\",\"LangTEK4014\",\"LangPDS\",\"LangIGP\",\"LangCodeV\",\"LangDSCDSE\",\"LangWPS\",\"LangLN03\",\"LangCCITT\",\"LangQUIC\",\"LangCPAP\",\"LangDecPPL\",\"LangSimpleText\",\"LangNPAP\",\"LangDOC\",\"LangimPress\",\"LangPinwriter\",\"LangNPDL\",\"LangNEC201PL\",\"LangAutomatic\",\"LangPages\",\"LangLIPS\",\"LangTIFF\",\"LangDiagnostic\",\"LangPSPrinter\",\"LangCaPSL\",\"LangEXCL\",\"LangLCDS\",\"LangXES\",\"LangPCLXL\",\"LangART\",\"LangTIPSI\",\"LangPrescribe\",\"LangLinePrinter\",\"LangIDP\",\"LangXJCL\",\"LangPDF\",\"LangRPDL\",\"LangIntermecIPL\",\"LangUBIFingerprint\",\"LangUBIDirectProtocol\",\"LangFujitsu\",\"LangCGM\",\"LangJPEG\",\"LangCALS1\",\"LangCALS2\",\"LangNIRS\",\"LangC4\",\"LangXPS\",\"LangOpenXPS\",\"DMTF Reserved\",\"Vendor Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInterpreterLangFamily\",\"MIB.IETF|IANA-PRINTER-MIB.PrtInterpreterLangFamilyTC\"]' ModelCorrespondence='[\"CIM_PrintInterpreter.OtherLangTypeDescription\",\"CIM_PrintInterpreter.LangLevel\"]'"
	 * @generated
	 */
	Long getLangType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInterpreter#getLangType <em>Lang Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Type</em>' attribute.
	 * @see #getLangType()
	 * @generated
	 */
	void setLangType(Long value);

	/**
	 * Returns the value of the '<em><b>Other Lang Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that describes the type of language when the value of the LangType property is equal to 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Lang Type Description</em>' attribute.
	 * @see #setOtherLangTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInterpreter_OtherLangTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' ModelCorrespondence='[\"CIM_PrintInterpreter.LangType\",\"CIM_PrintInterpreter.LangLevel\"]'"
	 * @generated
	 */
	String getOtherLangTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInterpreter#getOtherLangTypeDescription <em>Other Lang Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Lang Type Description</em>' attribute.
	 * @see #getOtherLangTypeDescription()
	 * @generated
	 */
	void setOtherLangTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Lang Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The level of the language which this PrintInterpreter is interpreting or emulating. For example, this property might contain: (a) a value of '5e' for a PrinterInterpreter which is emulating level 5e of the PCL; (b) a value of '2' for a PrinterInterpreter which is emulating level 2 of the PostScript language; or (c) a value of '2' for a PrinterInterpreter which is emulating level 2 of the HPGL language.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Level</em>' attribute.
	 * @see #setLangLevel(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInterpreter_LangLevel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='31' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInterpreterLangLevel\"]' ModelCorrespondence='[\"CIM_PrintInterpreter.LangType\",\"CIM_PrintInterpreter.OtherLangTypeDescription\"]'"
	 * @generated
	 */
	String getLangLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInterpreter#getLangLevel <em>Lang Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Level</em>' attribute.
	 * @see #getLangLevel()
	 * @generated
	 */
	void setLangLevel(String value);

	/**
	 * Returns the value of the '<em><b>Addressability Basis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The basis for the limit properties FeedAddressability and XFeedAddressability, that specifies whether meaningful values are available. 1 (Other) means the PrintInterpreter places no restrictions on addressability and FeedAddressability and XFeedAddressability shall be null. 2 (Unknown) means the PrintInterpreter does not have meaningful values and FeedAddressability and XFeedAddressability shall be null. 3 (Actual) means the PrintInterpreter does have meaningful values and FeedAddressability and XFeedAddressability shall be present.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addressability Basis</em>' attribute.
	 * @see #setAddressabilityBasis(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInterpreter_AddressabilityBasis()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"..\"]' Values='[\"Other\",\"Unknown\",\"Actual\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInterpreterFeedAddressability\",\"MIB.IETF|Printer-MIB.prtInterpreterXFeedAddressability\"]' ModelCorrespondence='[\"CIM_PrintInterpreter.FeedAddressability\",\"CIM_PrintInterpreter.XFeedAddressability\"]'"
	 * @generated
	 */
	Integer getAddressabilityBasis();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInterpreter#getAddressabilityBasis <em>Addressability Basis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addressability Basis</em>' attribute.
	 * @see #getAddressabilityBasis()
	 * @generated
	 */
	void setAddressabilityBasis(Integer value);

	/**
	 * Returns the value of the '<em><b>Feed Addressability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum addressability (often called resolution) of this PrintInterpreter in dots per inch in the feed direction, i.e., long-edge in portrait feed mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feed Addressability</em>' attribute.
	 * @see #setFeedAddressability(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInterpreter_FeedAddressability()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='0' MaxValue='2147483647' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInterpreterFeedAddressability\"]' ModelCorrespondence='[\"CIM_PrintInterpreter.AddressabilityBasis\",\"CIM_PrintInterpreter.XFeedAddressability\"]' PUnit='dot / inch'"
	 * @generated
	 */
	Long getFeedAddressability();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInterpreter#getFeedAddressability <em>Feed Addressability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Addressability</em>' attribute.
	 * @see #getFeedAddressability()
	 * @generated
	 */
	void setFeedAddressability(Long value);

	/**
	 * Returns the value of the '<em><b>XFeed Addressability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum addressability (often called resolution) of this PrintInterpreter in dots per inch in the cross-feed direction, i.e., short-edge in portrait feed mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XFeed Addressability</em>' attribute.
	 * @see #setXFeedAddressability(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInterpreter_XFeedAddressability()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='0' MaxValue='2147483647' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInterpreterXFeedAddressability\"]' ModelCorrespondence='[\"CIM_PrintInterpreter.AddressabilityBasis\",\"CIM_PrintInterpreter.FeedAddressability\"]' PUnit='dot / inch'"
	 * @generated
	 */
	Long getXFeedAddressability();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInterpreter#getXFeedAddressability <em>XFeed Addressability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XFeed Addressability</em>' attribute.
	 * @see #getXFeedAddressability()
	 * @generated
	 */
	void setXFeedAddressability(Long value);

	/**
	 * Returns the value of the '<em><b>Default Char Set In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The default character set for input octets encountered by the PrintInterpreter outside of a context in which a Page Description Language (PDL) has established the interpretation of the octets, e.g., when the value of the LangType property is equal to 30 (LangSimpleText).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Char Set In</em>' attribute.
	 * @see #setDefaultCharSetIn(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInterpreter_DefaultCharSetIn()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='63' MappingStrings='[\"MIB.IETF|Printer-MIB.prtInterpreterDefaultCharSetIn\",\"MIB.IETF|Printer-MIB.prtLocalizationCharacterSet\",\"MIB.IETF|IANA-CHARSET-MIB.IANACharset\"]' ModelCorrespondence='[\"CIM_PrintInterpreter.LangType\"]'"
	 * @generated
	 */
	String getDefaultCharSetIn();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInterpreter#getDefaultCharSetIn <em>Default Char Set In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Char Set In</em>' attribute.
	 * @see #getDefaultCharSetIn()
	 * @generated
	 */
	void setDefaultCharSetIn(String value);

	/**
	 * Returns the value of the '<em><b>Availability Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains detailed availability information for this PrintInterpreter, as follows: 1 (Other) means other detailed availability information is present in the OtherAvailabilityStatus property. 2 (Unknown) means detailed availability information for this PrintInterpreter is unknown. 3 (AvailableIdle) means this PrintInterpreter is available and idle, i.e., not currently in use. 4 (AvailableStandy) means this PrintInterpreter is available but on standby, e.g., in a power saving mode. 5 (AvailableActive) means this PrintInterpreter is available and active, i.e., currently in use. 6 (AvailableBusy) means this PrintInterpreter is available but busy, i.e., not immediately available for its primary function. 7 (UnavailableOnRequest) means this PrintInterpreter is not available and is on request, i.e., needs human intervention. 8 (UnavailableBroken) means this PrintInterpreter is not available and is broken, e.g., needs repair/replacement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability Status</em>' attribute.
	 * @see #setAvailabilityStatus(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInterpreter_AvailabilityStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\"]' Values='[\"Other\",\"Unknown\",\"AvailableIdle\",\"AvailableStandby\",\"AvailableActive\",\"AvailableBusy\",\"UnavailableOnRequest\",\"UnavailableBroken\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IETF|Printer-MIB.PrtSubUnitStatusTC\"]' ModelCorrespondence='[\"CIM_ManagedSystemElement.OperatingStatus\",\"CIM_PrintInterpreter.OtherAvailabilityStatus\"]'"
	 * @generated
	 */
	Long getAvailabilityStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInterpreter#getAvailabilityStatus <em>Availability Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Status</em>' attribute.
	 * @see #getAvailabilityStatus()
	 * @generated
	 */
	void setAvailabilityStatus(Long value);

	/**
	 * Returns the value of the '<em><b>Other Availability Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that describes the detailed availability of this PrintInterpreter when the value of the AvailabilityStatus property is equal to 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Availability Status</em>' attribute.
	 * @see #setOtherAvailabilityStatus(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInterpreter_OtherAvailabilityStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='255' ModelCorrespondence='[\"CIM_PrintInterpreter.AvailabilityStatus\"]'"
	 * @generated
	 */
	String getOtherAvailabilityStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInterpreter#getOtherAvailabilityStatus <em>Other Availability Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Availability Status</em>' attribute.
	 * @see #getOtherAvailabilityStatus()
	 * @generated
	 */
	void setOtherAvailabilityStatus(String value);

	/**
	 * Returns the value of the '<em><b>Non Critical Alerts Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, there are currently non-critical alerts on this PrintInterpreter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Non Critical Alerts Present</em>' attribute.
	 * @see #setNonCriticalAlertsPresent(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInterpreter_NonCriticalAlertsPresent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|Printer-MIB.PrtSubUnitStatusTC\"]' ModelCorrespondence='[\"CIM_ManagedSystemElement.DetailedStatus\"]'"
	 * @generated
	 */
	Boolean getNonCriticalAlertsPresent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInterpreter#getNonCriticalAlertsPresent <em>Non Critical Alerts Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Critical Alerts Present</em>' attribute.
	 * @see #getNonCriticalAlertsPresent()
	 * @generated
	 */
	void setNonCriticalAlertsPresent(Boolean value);

	/**
	 * Returns the value of the '<em><b>Critical Alerts Present</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, there are currently critical alerts on this PrintInterpreter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Critical Alerts Present</em>' attribute.
	 * @see #setCriticalAlertsPresent(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintInterpreter_CriticalAlertsPresent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|Printer-MIB.PrtSubUnitStatusTC\"]' ModelCorrespondence='[\"CIM_ManagedSystemElement.DetailedStatus\"]'"
	 * @generated
	 */
	Boolean getCriticalAlertsPresent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintInterpreter#getCriticalAlertsPresent <em>Critical Alerts Present</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical Alerts Present</em>' attribute.
	 * @see #getCriticalAlertsPresent()
	 * @generated
	 */
	void setCriticalAlertsPresent(Boolean value);

} // CIM_PrintInterpreter

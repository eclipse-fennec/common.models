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
 * A representation of the model object '<em><b>CIM Record For Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The RecordForLog class is used to instantiate records to be aggregated to a Log.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RecordForLog#getRecordFormat <em>Record Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RecordForLog#getRecordData <em>Record Data</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RecordForLog#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RecordForLog#getPerceivedSeverity <em>Perceived Severity</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RecordForLog()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.25.0' UMLPackagePath='CIM::System::Logs'"
 * @generated
 */
@ProviderType
public interface CIM_RecordForLog extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Record Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the data structure of the information in the property, RecordData. If the RecordFormat string is <empty>, RecordData should be interpreted as a free-form string. 
	 * 
	 * To describe the data structure of RecordData, the RecordFormat string should be constructed as follows: 
	 * - The first character is a delimiter character and is used to parse the remainder of the string into sub-strings. 
	 * - Each sub-string is separated by the delimiter character and should be in the form of a CIM property declaration (i.e., datatype and property name). This set of declarations may be used to interpret the similarly delimited RecordData property. 
	 * For example, using a '*' delimiter, RecordFormat = "*string ThisDay*uint32 ThisYear*datetime SomeTime" 
	 * may be used to interpret: RecordData = "*This is Friday*2002*20020807141000.000000-300".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record Format</em>' attribute.
	 * @see #setRecordFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RecordForLog_RecordFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_RecordForLog.RecordData\"]'"
	 * @generated
	 */
	String getRecordFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RecordForLog#getRecordFormat <em>Record Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Format</em>' attribute.
	 * @see #getRecordFormat()
	 * @generated
	 */
	void setRecordFormat(String value);

	/**
	 * Returns the value of the '<em><b>Record Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string containing LogRecord data. 
	 * If the corresponding RecordFormat property is <empty>, or cannot be parsed according to the recommended format, RecordData should be interpreted as a free-form string. If the RecordFormat property contains parseable format information (as recommended in the RecordFormat Description qualifier), the RecordData string SHOULD be parsed in accordance with this format. In this case, RecordData SHOULD begin with the delimiter character and this character SHOULD be used to separate substrings in the manner described. The RecordData string can then be parsed by the data consumer and appropriately typed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record Data</em>' attribute.
	 * @see #setRecordData(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RecordForLog_RecordData()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_RecordForLog.RecordFormat\"]'"
	 * @generated
	 */
	String getRecordData();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RecordForLog#getRecordData <em>Record Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Data</em>' attribute.
	 * @see #getRecordData()
	 * @generated
	 */
	void setRecordData(String value);

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is being deprecated to avoid conflicts with localization implementations using CIM/XML over HTTP protocol, the preferred mechanism. 
	 * A locale indicates a particular geographical, political, or cultural region. The Locale specifies the language used in creating the RecordForLog data. If the Locale property is empty, it is assumed that the default locale is en_US (English). 
	 * The locale string consists of three sub-strings, separated by underscores: 
	 * - The first sub-string is the language code, as specified in ISO639. 
	 * - The second sub-string is the country code, as specified in ISO3166. 
	 * - The third sub-string is a variant, which is vendor specific. 
	 * For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and generally is limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. The language and country codes are required; the variant may be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locale</em>' attribute.
	 * @see #setLocale(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RecordForLog_Locale()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	String getLocale();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RecordForLog#getLocale <em>Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale</em>' attribute.
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(String value);

	/**
	 * Returns the value of the '<em><b>Perceived Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that describes the severity of the Indication from the notifier's point of view: 
	 * 1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
	 * 3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
	 * 4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
	 * 5 - Major should be used to indicate action is needed NOW. 
	 * 6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
	 * 7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
	 * 2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the Indication is purely informational or its severity is simply unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Perceived Severity</em>' attribute.
	 * @see #setPerceivedSeverity(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RecordForLog_PerceivedSeverity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"Other\",\"Information\",\"Degraded/Warning\",\"Minor\",\"Major\",\"Critical\",\"Fatal/NonRecoverable\"]' MappingStrings='[\"Recommendation.ITU|X733.Perceived severity\"]'"
	 * @generated
	 */
	Integer getPerceivedSeverity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RecordForLog#getPerceivedSeverity <em>Perceived Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perceived Severity</em>' attribute.
	 * @see #getPerceivedSeverity()
	 * @generated
	 */
	void setPerceivedSeverity(Integer value);

} // CIM_RecordForLog

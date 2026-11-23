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
 * A representation of the model object '<em><b>CIM Message Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MessageLog represents any type of event, error or informational register or chronicle. The object describes the existence of the log and its characteristics. Several methods are defined for retrieving, writing and deleting log entries, and maintaining the log. This type of log uses iterators to access the log records, whereas its peer class, RecordLog, uses more abstracted access mechanisms.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getCapabilitiesDescriptions <em>Capabilities Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getMaxLogSize <em>Max Log Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getSizeOfHeader <em>Size Of Header</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getHeaderFormat <em>Header Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getMaxRecordSize <em>Max Record Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getSizeOfRecordHeader <em>Size Of Record Header</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getRecordHeaderFormat <em>Record Header Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getOtherPolicyDescription <em>Other Policy Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getTimeWhenOutdated <em>Time When Outdated</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getPercentageNearFull <em>Percentage Near Full</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getLastChange <em>Last Change</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getTimeOfLastChange <em>Time Of Last Change</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getRecordLastChanged <em>Record Last Changed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getIsFrozen <em>Is Frozen</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MessageLog#getCharacterSet <em>Character Set</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.14.0' UMLPackagePath='CIM::System::Logs' override.Name='string' override.Name.Key='true' override.Name.Description='The inherited Name serves as part of the key (a unique identifier) for the MessageLog instance.' override.Name.MaxLen='256' override.OverwritePolicy='uint16' override.OverwritePolicy.Description='An enumeration describing the behavior of the Log, when it becomes full or near full. For example, the Log may wrap (value=2) or may simply stop recording entries (value =7). \n\nSome of the property\'s possible values need further explanation: \n3=\"Clear When Near Full\" indicates that all of the Log\'s entries will be deleted when a specified record capacity is reached. The capacity is specified in percentage, using the property, PercentageNearFull. \'Near Full\' may be less than 100% if the Log takes time to clear, and a position should always be available for new records. \n4=\"Overwrite Outdated When Needed\" describes that Log entries (timestamped later than the date/time specified in the property, TimeWhenOutdated) can be overwritten. \n5=\"Remove Outdated Records\" specifies that records (timestamped later than the date/time specified in the property, TimeWhenOutdated) are logically and/or physically removed from the Log. \n6=\"Overwrite Specific Records\" indicates that specially flagged records may be overwritten. This property only makes sense when the Capabilities array includes a value of 10, \"Can Flag Records for Overwrite\".' override.OverwritePolicy.ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' override.OverwritePolicy.Values='[\"Unknown\",\"Other\",\"Wraps When Full\",\"Clear When Near Full\",\"Overwrite Outdated When Needed\",\"Remove Outdated Records\",\"Overwrite Specific Records\",\"Never Overwrite\"]' override.OverwritePolicy.ModelCorrespondence='[\"CIM_MessageLog.OtherPolicyDescription\",\"CIM_MessageLog.TimeWhenOutdated\",\"CIM_MessageLog.PercentageNearFull\"]' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_MessageLog extends CIM_Log {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MessageLog#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of integers indicating the Log capabilities. Information such as "Write Record Supported" (value= 2) or "Variable Length Records Supported" (8) is specified in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\"]' Values='[\"Unknown\",\"Other\",\"Write Record Supported\",\"Delete Record Supported\",\"Can Move Backward in Log\",\"Freeze Log Supported\",\"Clear Log Supported\",\"Supports Addressing by Ordinal Record Number\",\"Variable Length Records Supported\",\"Variable Formats for Records\",\"Can Flag Records for Overwrite\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_MessageLog.CapabilitiesDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Capabilities Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings providing more detailed explanations for any of the Log features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_CapabilitiesDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_MessageLog.Capabilities\"]'"
	 * @generated
	 */
	EList<String> getCapabilitiesDescriptions();

	/**
	 * Returns the value of the '<em><b>Max Log Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum size, in bytes, to which the Log can grow. If there is no maximum, then MaxLogSize should be set to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Log Size</em>' attribute.
	 * @see #setMaxLogSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_MaxLogSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getMaxLogSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MessageLog#getMaxLogSize <em>Max Log Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Log Size</em>' attribute.
	 * @see #getMaxLogSize()
	 * @generated
	 */
	void setMaxLogSize(Long value);

	/**
	 * Returns the value of the '<em><b>Size Of Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the Log header, in bytes, if one is present. If there is no Log header, then this property should be set to 0. Headers may include general information about the Log such as the current number of records, time of last update, or a pointer to the location of the first Log entry. Note that this property is NOT the size of the header for an individual Log entry. The latter is described by the property, SizeOfRecordHeader.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Of Header</em>' attribute.
	 * @see #setSizeOfHeader(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_SizeOfHeader()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getSizeOfHeader();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MessageLog#getSizeOfHeader <em>Size Of Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Of Header</em>' attribute.
	 * @see #getSizeOfHeader()
	 * @generated
	 */
	void setSizeOfHeader(Long value);

	/**
	 * Returns the value of the '<em><b>Header Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the SizeOfHeader property is non-zero, this property describes the structure and format of the Log header. It is a free-form string. If the SizeOfHeader property is 0, then the information in this property is undefined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Header Format</em>' attribute.
	 * @see #setHeaderFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_HeaderFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getHeaderFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MessageLog#getHeaderFormat <em>Header Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Format</em>' attribute.
	 * @see #getHeaderFormat()
	 * @generated
	 */
	void setHeaderFormat(String value);

	/**
	 * Returns the value of the '<em><b>Max Record Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum size, in bytes, to which an individual Log entry (record) can grow - if the Capabilities array includes a value of 7 ("Variable Length Records Supported"). If the Capabilities array does not include a 7, then the Log only supports fixed length entries. The size of these entries is described by this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Record Size</em>' attribute.
	 * @see #setMaxRecordSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_MaxRecordSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getMaxRecordSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MessageLog#getMaxRecordSize <em>Max Record Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Record Size</em>' attribute.
	 * @see #getMaxRecordSize()
	 * @generated
	 */
	void setMaxRecordSize(Long value);

	/**
	 * Returns the value of the '<em><b>Size Of Record Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of the header for the Log's individual entries, in bytes, if record headers are defined. If there are no record headers, then this property should be set to 0. Record headers may include information such as the type of the Log entry, the date/time that the entry was last updated, or a pointer to the start of optional data. Note that this property defines the header size for individual records in the Log, while the SizeOfHeader property describes the Log's overall header, typically located at the start of the MessageLog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Of Record Header</em>' attribute.
	 * @see #setSizeOfRecordHeader(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_SizeOfRecordHeader()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getSizeOfRecordHeader();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MessageLog#getSizeOfRecordHeader <em>Size Of Record Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Of Record Header</em>' attribute.
	 * @see #getSizeOfRecordHeader()
	 * @generated
	 */
	void setSizeOfRecordHeader(Long value);

	/**
	 * Returns the value of the '<em><b>Record Header Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the SizeOfRecordHeader property is non-zero, this property describes the structure and format of the record headers. It is a free-form string. If the SizeOfRecordHeader property is 0, then the information in this property is undefined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record Header Format</em>' attribute.
	 * @see #setRecordHeaderFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_RecordHeaderFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getRecordHeaderFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MessageLog#getRecordHeaderFormat <em>Record Header Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Header Format</em>' attribute.
	 * @see #getRecordHeaderFormat()
	 * @generated
	 */
	void setRecordHeaderFormat(String value);

	/**
	 * Returns the value of the '<em><b>Other Policy Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the OverwritePolicy specifies a value of 1 ("Other"), the Log's behavior can be explained using this property. If OverwritePolicy is not 1, then this property's contents are undefined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Policy Description</em>' attribute.
	 * @see #setOtherPolicyDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_OtherPolicyDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_MessageLog.OverwritePolicy\"]'"
	 * @generated
	 */
	String getOtherPolicyDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MessageLog#getOtherPolicyDescription <em>Other Policy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Policy Description</em>' attribute.
	 * @see #getOtherPolicyDescription()
	 * @generated
	 */
	void setOtherPolicyDescription(String value);

	/**
	 * Returns the value of the '<em><b>Time When Outdated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the OverwritePolicy is based on 'outdated' records (values 4 or 5), this property defines when a Log entry is considered to be outdated - either by time interval or at a specific date and time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time When Outdated</em>' attribute.
	 * @see #setTimeWhenOutdated(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_TimeWhenOutdated()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_MessageLog.OverwritePolicy\"]'"
	 * @generated
	 */
	String getTimeWhenOutdated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MessageLog#getTimeWhenOutdated <em>Time When Outdated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time When Outdated</em>' attribute.
	 * @see #getTimeWhenOutdated()
	 * @generated
	 */
	void setTimeWhenOutdated(String value);

	/**
	 * Returns the value of the '<em><b>Percentage Near Full</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the OverwritePolicy is based on clearing records when the Log is near full (value=3), this property defines the record capacity (in percentage) that is considered to be 'near full'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percentage Near Full</em>' attribute.
	 * @see #setPercentageNearFull(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_PercentageNearFull()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Units='Percent' ModelCorrespondence='[\"CIM_MessageLog.OverwritePolicy\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getPercentageNearFull();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MessageLog#getPercentageNearFull <em>Percentage Near Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Near Full</em>' attribute.
	 * @see #getPercentageNearFull()
	 * @generated
	 */
	void setPercentageNearFull(Integer value);

	/**
	 * Returns the value of the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration describing the last change to the MessageLog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Change</em>' attribute.
	 * @see #setLastChange(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_LastChange()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Add\",\"Delete\",\"Modify\",\"Log Cleared\"]'"
	 * @generated
	 */
	Integer getLastChange();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MessageLog#getLastChange <em>Last Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Change</em>' attribute.
	 * @see #getLastChange()
	 * @generated
	 */
	void setLastChange(Integer value);

	/**
	 * Returns the value of the '<em><b>Time Of Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When a change is made to the Log, the date/time of that modification is captured. This property could be used to event against any update to the MessageLog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Of Last Change</em>' attribute.
	 * @see #setTimeOfLastChange(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_TimeOfLastChange()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeOfLastChange();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MessageLog#getTimeOfLastChange <em>Time Of Last Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Last Change</em>' attribute.
	 * @see #getTimeOfLastChange()
	 * @generated
	 */
	void setTimeOfLastChange(String value);

	/**
	 * Returns the value of the '<em><b>Record Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When a change is made to the Log, the record number that was modified is captured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record Last Changed</em>' attribute.
	 * @see #setRecordLastChanged(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_RecordLastChanged()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getRecordLastChanged();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MessageLog#getRecordLastChanged <em>Record Last Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Last Changed</em>' attribute.
	 * @see #getRecordLastChanged()
	 * @generated
	 */
	void setRecordLastChanged(Long value);

	/**
	 * Returns the value of the '<em><b>Is Frozen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the Log is currently frozen and modifications are not allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Frozen</em>' attribute.
	 * @see #setIsFrozen(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_IsFrozen()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsFrozen();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MessageLog#getIsFrozen <em>Is Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Frozen</em>' attribute.
	 * @see #getIsFrozen()
	 * @generated
	 */
	void setIsFrozen(Boolean value);

	/**
	 * Returns the value of the '<em><b>Character Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration describing the character set used to record data in the individual Log entries. For example, the Log records may contain ASCII data (value=2), or be raw octet strings (value=10).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Character Set</em>' attribute.
	 * @see #setCharacterSet(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MessageLog_CharacterSet()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"Unknown\",\"Other\",\"ASCII\",\"Unicode\",\"ISO2022\",\"ISO8859\",\"Extended UNIX Code\",\"UTF-8\",\"UCS-2\",\"Bitmapped Data\",\"OctetString\",\"Defined by Individual Records\"]'"
	 * @generated
	 */
	Integer getCharacterSet();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MessageLog#getCharacterSet <em>Character Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Set</em>' attribute.
	 * @see #getCharacterSet()
	 * @generated
	 */
	void setCharacterSet(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests that an iteration of the MessageLog be established and that the iterator be set to the first entry in the Log. An identifier for the iterator is returned as an output parameter of the method. 
	 * 
	 * Regarding iteration, you have 2 choices: 1) Embed iteration data in the method call, and allow implementations to track/ store this data manually; or, 2) Iterate using a separate object (for example, class ActiveIterator) as an iteration agent. The first approach is used here for interoperability. The second requires an instance of the Iterator object for EACH iteration in progress. 2's functionality could be implemented underneath 1. 
	 * 
	 * The return value from PositionToFirstRecord should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param IterationIdentifier An identifier for the iterator.
	 * <!-- end-model-doc -->
	 * @model IterationIdentifierAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long PositionToFirstRecord(String IterationIdentifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests that the Log's iteration identifier be advanced or retreated a specific number of records, or set to the entry at a specified numeric location. These two different behaviors are accomplished using the input parameters of the method. Advancing or retreating is achieved by setting the MoveAbsolute boolean to FALSE, and then specifying the number of entries to advance or retreat as positive or negative values in the RecordNumber parameter. Moving to a specific record number is accomplished by setting the MoveAbsolute input parameter to TRUE, and then placing the record number into the RecordNumber parameter. This can only be done if the Capabilities array includes a value of 7, "Supports Addressing by Ordinal Record Number". 
	 * 
	 * After the method completes and if ordinal record numbers are supported (the Capabilities array includes a 7), the current record number is returned in the RecordNumber output parameter. Otherwise, the value of the parameter is undefined. 
	 * 
	 * IterationIdentifier is defined as an Input/Output method parameter to allow the Log to embed state information in the Identifier and potentially let the identifier be maintained by the using application. 
	 * 
	 * The return value from PositionAtRecord should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. If the request is not supported, check the Capabilities array regarding support for ordinal record number addressing and backward movement in the Log (values 7 and 4, respectively). 
	 * 
	 * Note: In a subclass, the set of possible return codes could be described using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param IterationIdentifier An identifier for the iterator.
	 * @param MoveAbsolute Advancing or retreating the IterationIdentifier is achieved by setting the MoveAbsolute boolean to FALSE, and specifying the number of entries to advance or retreat as positive or negative values in the RecordNumber parameter. Moving to a specific record number is accomplished by setting the MoveAbsolute parameter to TRUE, and placing the record number into the RecordNumber parameter.
	 * @param RecordNumber The relative or absolute record number.
	 * <!-- end-model-doc -->
	 * @model IterationIdentifierAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' Out='true'" MoveAbsoluteAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'" RecordNumberAnnotation="http://schemas.dmtf.org/wbem/cim cimType='sint64' In='true' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long PositionAtRecord(String IterationIdentifier, Boolean MoveAbsolute, Long RecordNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests that the record indicated by the IterationIdentifier be retrieved from the MessageLog. After retrieval, the IterationIdentifier may be advanced to the next record by setting the PositionToNext input parameter to TRUE. Two output parameters are defined for the method - RecordData which holds the contents of the Log entry (as an array of bytes that can be recast to an appropriate format), and RecordNumber which returns the current record number addressed via the Iteration Identifier. The RecordNumber parameter is only defined/valid when the Capabilities array indicates that ordinal record number addressing is supported (a value of 7). 
	 * 
	 * IterationIdentifier is defined as an Input/Output method parameter to allow the Log to embed state information in the Identifier and potentially let the identifier be maintained by the using application. 
	 * 
	 * The return value from GetRecord should be 0 if the request was successfully executed, 1 if the request is not supported, and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param IterationIdentifier An identifier for the iterator.
	 * @param PositionToNext Boolean indicating that the Iteration Identifier should be advanced to the next record, after retrieving the current Log entry.
	 * @param RecordNumber The record number.
	 * @param RecordData The record data.
	 * <!-- end-model-doc -->
	 * @model IterationIdentifierAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' Out='true'" PositionToNextAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'" RecordNumberAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' In='false' Out='true'" RecordDataUnique="false" RecordDataMany="true"
	 *        RecordDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long GetRecord(String IterationIdentifier, Boolean PositionToNext, Long RecordNumber, EList<Integer> RecordData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests that the record indicated by the IterationIdentifier be deleted from the MessageLog. After deletion, the Iteration Identifier may be advanced to the next record by setting the PositionToNext input parameter to TRUE. If set to FALSE, then the IterationIdentifier will be positioned at the previous record. Two output parameters are defined for the method - RecordData which holds the contents of the deleted Log entry (as an array of bytes that can be recast to an appropriate format or discarded), and RecordNumber which returns the current record number addressed via the IterationIdentifier. The RecordNumber parameter is only defined/valid when the Capabilities array indicates that ordinal record number addressing is supported (a value of 7). 
	 * 
	 * IterationIdentifier is defined as an Input/Output method parameter to allow the Log to embed state information in the Identifier and potentially let the identifier be maintained by the using application. 
	 * 
	 * The return value from DeleteRecord should be 0 if the request was successfully executed, 1 if the request is not supported, and some other value if an error occurred. If the request is not supported, check the Capabilities array that a value of 3 ("Delete Record Supported") is specified. 
	 * 
	 * Note: In a subclass, the set of possible return codes could be described using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param IterationIdentifier An identifier for the iterator.
	 * @param PositionToNext Boolean that when set to TRUE requests the IterationIdentifier to be advanced to the next record, after the current entry is deleted. If set to FALSE, IterationIdentifier is set to the previous record.
	 * @param RecordNumber The record number.
	 * @param RecordData The record data.
	 * <!-- end-model-doc -->
	 * @model IterationIdentifierAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' Out='true'" PositionToNextAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'" RecordNumberAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' In='false' Out='true'" RecordDataUnique="false" RecordDataMany="true"
	 *        RecordDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long DeleteRecord(String IterationIdentifier, Boolean PositionToNext, Long RecordNumber, EList<Integer> RecordData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests that a record be inserted at the Log position indicated by the IterationIdentifier. The entry's data is provided in the RecordData input parameter. After insertion, the IterationIdentifier may be advanced to the next record by setting the PositionToNext input parameter to TRUE. The output parameter, RecordNumber, returns the current record number addressed via the IterationIdentifier. This parameter is only defined/valid when the Capabilities array indicates that ordinal record number addressing is supported (a value of 7). 
	 * 
	 * IterationIdentifier is defined as an Input/Output method parameter to allow the Log to embed state information in the Identifier and potentially let the identifier be maintained by the using application. 
	 * 
	 * The return value from WriteRecord should be 0 if the request was successfully executed, 1 if the request is not supported, and some other value if an error occurred. If the request is not supported, check the Capabilities array that a value of 2 ("Write Record Supported") is specified. 
	 * 
	 * Note: In a subclass, the set of possible return codes could be described using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param IterationIdentifier An identifier for the iterator.
	 * @param PositionToNext Boolean indicating that the Iteration Identifier should be advanced to the next record, after writing the Log entry.
	 * @param RecordData The record data.
	 * @param RecordNumber The record number.
	 * <!-- end-model-doc -->
	 * @model IterationIdentifierAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' Out='true'" PositionToNextAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'" RecordDataUnique="false" RecordDataMany="true"
	 *        RecordDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' In='true'" RecordNumberAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long WriteRecord(String IterationIdentifier, Boolean PositionToNext, EList<Integer> RecordData, Long RecordNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests that an iteration of the Log, identified by the IterationIdentifier input parameter, be stopped. The return value from CancelIteration should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param IterationIdentifier An identifier for the iterator.
	 * <!-- end-model-doc -->
	 * @model IterationIdentifierAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long CancelIteration(String IterationIdentifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests that the MessageLog be placed in a frozen state ("Freeze" input parameter = TRUE) or 'unfrozen' (= FALSE). If frozen, modifications to the Log will not be allowed. If successful, the Log's IsFrozen boolean property will be updated to reflect the desired state. 
	 * 
	 * The method's return code should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. If the request is not supported, check the Capabilities array that a value of 5 ("Freeze Log Supported") is specified. 
	 * 
	 * Note: In a subclass, the set of possible return codes could be described using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param Freeze If TRUE then freeze the log, if FALSE 'unfreeze' the log.
	 * <!-- end-model-doc -->
	 * @model FreezeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long FreezeLog(Boolean Freeze);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests that the record indicated by the IterationIdentifier be flagged as overwriteable. This method is only supported when the Capabilities array includes a value of 10, "Can Flag Records for Overwrite". After updating the entry, the IterationIdentifier may be advanced to the next record by setting the PositionToNext input parameter to TRUE. One output parameter is defined for the method RecordNumber. It returns the current record number addressed via the Iteration Identifier. This parameter is only defined/valid when the Capabilities array indicates that ordinal record number addressing is supported (a value of 7). 
	 * 
	 * IterationIdentifier is defined as an Input/Output method parameter to allow the Log to embed state information in the Identifier and potentially let the identifier be maintained by the using application. 
	 * 
	 * The return value from FlagRecordForOverwrite should be 0 if the request was successfully executed, 1 if the request is not supported, and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param IterationIdentifier An identifier for the iterator.
	 * @param PositionToNext Boolean indicating that the Iteration Identifier should be advanced to the next record, after updating the current Log entry.
	 * @param RecordNumber The record number.
	 * <!-- end-model-doc -->
	 * @model IterationIdentifierAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' In='true' Out='true'" PositionToNextAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'" RecordNumberAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long FlagRecordForOverwrite(String IterationIdentifier, Boolean PositionToNext, Long RecordNumber);

} // CIM_MessageLog

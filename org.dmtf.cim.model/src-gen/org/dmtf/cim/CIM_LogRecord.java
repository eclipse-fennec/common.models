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
 * A representation of the model object '<em><b>CIM Log Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The LogRecord object can describe the definitional format for entries in a MessageLog, or can be used to instantiate the actual records in the Log. The latter approach provides a great deal more semantic definition and management control over the individual entries in a MessageLog, than do the record manipulation methods of the Log class. It is recommended that the data in individual Log entries be modeled using subclasses of LogRecord, to avoid the creation of LogRecords with one property (such as RecordData) without semantics. 
 * Definitional formats for LogRecords could be specified by establishing a naming convention for the RecordID and Message Timestamp key properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LogRecord#getLogCreationClassName <em>Log Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogRecord#getLogName <em>Log Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogRecord#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogRecord#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogRecord#getMessageTimestamp <em>Message Timestamp</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogRecord#getDataFormat <em>Data Format</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogRecord()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.11.0' UMLPackagePath='CIM::System::Logs' keys='LogCreationClassName,LogName,CreationClassName,RecordID,MessageTimestamp'"
 * @generated
 */
@ProviderType
public interface CIM_LogRecord extends CIM_RecordForLog {
	/**
	 * Returns the value of the '<em><b>Log Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Log's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Creation Class Name</em>' attribute.
	 * @see #setLogCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogRecord_LogCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_MessageLog.CreationClassName'"
	 * @generated
	 */
	String getLogCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogRecord#getLogCreationClassName <em>Log Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Creation Class Name</em>' attribute.
	 * @see #getLogCreationClassName()
	 * @generated
	 */
	void setLogCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Log Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Log's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Name</em>' attribute.
	 * @see #setLogName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogRecord_LogName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_MessageLog.Name'"
	 * @generated
	 */
	String getLogName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogRecord#getLogName <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Name</em>' attribute.
	 * @see #getLogName()
	 * @generated
	 */
	void setLogName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogRecord_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogRecord#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Record ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RecordID, with the MessageTimestamp property, serve to uniquely identify the LogRecord within a MessageLog. Note that this property is different than the RecordNumber parameters of the MessageLog methods. The latter are ordinal values only, useful to track position when iterating through a Log. On the other hand, RecordID is truly an identifier for an instance of LogRecord. It may be set to the record's ordinal position, but this is not required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record ID</em>' attribute.
	 * @see #setRecordID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogRecord_RecordID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getRecordID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogRecord#getRecordID <em>Record ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record ID</em>' attribute.
	 * @see #getRecordID()
	 * @generated
	 */
	void setRecordID(String value);

	/**
	 * Returns the value of the '<em><b>Message Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A LogRecord's key structure includes a timestamp for the entry. If the timestamp for the entry is unknown, the value 99990101000000.000000+000 SHOULD be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Timestamp</em>' attribute.
	 * @see #setMessageTimestamp(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogRecord_MessageTimestamp()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Key='true'"
	 * @generated
	 */
	String getMessageTimestamp();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogRecord#getMessageTimestamp <em>Message Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Timestamp</em>' attribute.
	 * @see #getMessageTimestamp()
	 * @generated
	 */
	void setMessageTimestamp(String value);

	/**
	 * Returns the value of the '<em><b>Data Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string describing the LogRecord's data structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Format</em>' attribute.
	 * @see #setDataFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogRecord_DataFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_LogRecord.RecordFormat\"]'"
	 * @generated
	 */
	String getDataFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogRecord#getDataFormat <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Format</em>' attribute.
	 * @see #getDataFormat()
	 * @generated
	 */
	void setDataFormat(String value);

} // CIM_LogRecord

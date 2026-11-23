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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Record In Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RecordInLog describes the aggregation or location of Log entries within a MessageLog.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RecordInLog#getMessageLog <em>Message Log</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RecordInLog#getLogRecord <em>Log Record</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RecordInLog()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::System::Logs' keys='MessageLog,LogRecord'"
 * @generated
 */
@ProviderType
public interface CIM_RecordInLog extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Log</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Message Log.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Log</em>' reference.
	 * @see #setMessageLog(CIM_MessageLog)
	 * @see org.dmtf.cim.CimPackage#getCIM_RecordInLog_MessageLog()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_MessageLog REF' Key='true' Aggregate='true' Min='1' Max='1'"
	 * @generated
	 */
	CIM_MessageLog getMessageLog();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RecordInLog#getMessageLog <em>Message Log</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Log</em>' reference.
	 * @see #getMessageLog()
	 * @generated
	 */
	void setMessageLog(CIM_MessageLog value);

	/**
	 * Returns the value of the '<em><b>Log Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Log entry contained within the MessageLog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Record</em>' reference.
	 * @see #setLogRecord(CIM_LogRecord)
	 * @see org.dmtf.cim.CimPackage#getCIM_RecordInLog_LogRecord()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogRecord REF' Key='true' Weak='true'"
	 * @generated
	 */
	CIM_LogRecord getLogRecord();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RecordInLog#getLogRecord <em>Log Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Record</em>' reference.
	 * @see #getLogRecord()
	 * @generated
	 */
	void setLogRecord(CIM_LogRecord value);

} // CIM_RecordInLog

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
 * A representation of the model object '<em><b>CIM Log Manages Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LogManagesRecord describes the aggregation or location of Records managed by a Log.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LogManagesRecord#getLog <em>Log</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogManagesRecord#getRecord <em>Record</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogManagesRecord()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.9.0' UMLPackagePath='CIM::System::Logs' keys='Log,Record'"
 * @generated
 */
@ProviderType
public interface CIM_LogManagesRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Log</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Log.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log</em>' reference.
	 * @see #setLog(CIM_Log)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogManagesRecord_Log()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Log REF' Key='true' Aggregate='true' Min='1' Max='1'"
	 * @generated
	 */
	CIM_Log getLog();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogManagesRecord#getLog <em>Log</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log</em>' reference.
	 * @see #getLog()
	 * @generated
	 */
	void setLog(CIM_Log value);

	/**
	 * Returns the value of the '<em><b>Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The record managed by the Log.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Record</em>' reference.
	 * @see #setRecord(CIM_RecordForLog)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogManagesRecord_Record()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_RecordForLog REF' Key='true'"
	 * @generated
	 */
	CIM_RecordForLog getRecord();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogManagesRecord#getRecord <em>Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record</em>' reference.
	 * @see #getRecord()
	 * @generated
	 */
	void setRecord(CIM_RecordForLog value);

} // CIM_LogManagesRecord

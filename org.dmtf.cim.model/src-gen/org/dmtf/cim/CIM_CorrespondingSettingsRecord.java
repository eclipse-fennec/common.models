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
 * A representation of the model object '<em><b>CIM Corresponding Settings Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is being deprecated as part of the change to have Diagnostic Settings derive from CIM_SettingData instead of CIM_Setting. 
 * CorrespondingSettingsRecord is used to tie a log record to its corresponding setting data record.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CorrespondingSettingsRecord#getDataRecord <em>Data Record</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CorrespondingSettingsRecord#getSettingsRecord <em>Settings Record</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CorrespondingSettingsRecord()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_CorrespondingSettingDataRecord\"]' Version='2.54.1' UMLPackagePath='CIM::System::Diagnostics' keys='DataRecord,SettingsRecord'"
 * @generated
 */
@ProviderType
public interface CIM_CorrespondingSettingsRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The record containing the result data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Record</em>' reference.
	 * @see #setDataRecord(CIM_DiagnosticRecord)
	 * @see org.dmtf.cim.CimPackage#getCIM_CorrespondingSettingsRecord_DataRecord()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DiagnosticRecord REF' Deprecated='[\"CIM_CorrespondingSettingDataRecord.DataRecord\"]' Key='true'"
	 * @generated
	 */
	CIM_DiagnosticRecord getDataRecord();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CorrespondingSettingsRecord#getDataRecord <em>Data Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Record</em>' reference.
	 * @see #getDataRecord()
	 * @generated
	 */
	void setDataRecord(CIM_DiagnosticRecord value);

	/**
	 * Returns the value of the '<em><b>Settings Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The record containing the DiagnosticSetting data that were used when the result was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Settings Record</em>' reference.
	 * @see #setSettingsRecord(CIM_DiagnosticSettingRecord)
	 * @see org.dmtf.cim.CimPackage#getCIM_CorrespondingSettingsRecord_SettingsRecord()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DiagnosticSettingRecord REF' Deprecated='[\"CIM_CorrespondingSettingDataRecord.SettingsRecord\"]' Key='true'"
	 * @generated
	 */
	CIM_DiagnosticSettingRecord getSettingsRecord();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CorrespondingSettingsRecord#getSettingsRecord <em>Settings Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings Record</em>' reference.
	 * @see #getSettingsRecord()
	 * @generated
	 */
	void setSettingsRecord(CIM_DiagnosticSettingRecord value);

} // CIM_CorrespondingSettingsRecord

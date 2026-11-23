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
 * A representation of the model object '<em><b>CIM Corresponding Setting Data Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CorrespondingSettingDataRecord is used to tie a log record to its corresponding setting data record.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CorrespondingSettingDataRecord#getDataRecord <em>Data Record</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CorrespondingSettingDataRecord#getSettingsRecord <em>Settings Record</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CorrespondingSettingDataRecord()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.22.0' UMLPackagePath='CIM::System::Diagnostics' keys='DataRecord,SettingsRecord'"
 * @generated
 */
@ProviderType
public interface CIM_CorrespondingSettingDataRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Record</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The record containing the result data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Record</em>' reference.
	 * @see #setDataRecord(CIM_DiagnosticRecord)
	 * @see org.dmtf.cim.CimPackage#getCIM_CorrespondingSettingDataRecord_DataRecord()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DiagnosticRecord REF' Key='true'"
	 * @generated
	 */
	CIM_DiagnosticRecord getDataRecord();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CorrespondingSettingDataRecord#getDataRecord <em>Data Record</em>}' reference.
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
	 * The record containing the DiagnosticSettingData that were used when the result was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Settings Record</em>' reference.
	 * @see #setSettingsRecord(CIM_DiagnosticSettingDataRecord)
	 * @see org.dmtf.cim.CimPackage#getCIM_CorrespondingSettingDataRecord_SettingsRecord()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_DiagnosticSettingDataRecord REF' Key='true'"
	 * @generated
	 */
	CIM_DiagnosticSettingDataRecord getSettingsRecord();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CorrespondingSettingDataRecord#getSettingsRecord <em>Settings Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings Record</em>' reference.
	 * @see #getSettingsRecord()
	 * @generated
	 */
	void setSettingsRecord(CIM_DiagnosticSettingDataRecord value);

} // CIM_CorrespondingSettingDataRecord

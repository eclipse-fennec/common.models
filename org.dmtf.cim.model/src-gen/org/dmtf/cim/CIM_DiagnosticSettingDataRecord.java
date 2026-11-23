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
 * A representation of the model object '<em><b>CIM Diagnostic Setting Data Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class contains a snapshot of the settings that were used when the associated Diagnostic service was run.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingDataRecord#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingDataRecord()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::System::Diagnostics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticSettingDataRecord extends CIM_DiagnosticRecord {
	/**
	 * Returns the value of the '<em><b>Settings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string containing an encoding of the DiagnosticSettingData instance that was used when the diagnostic service was run.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Settings</em>' attribute.
	 * @see #setSettings(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingDataRecord_Settings()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_DiagnosticSettingData'"
	 * @generated
	 */
	String getSettings();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSettingDataRecord#getSettings <em>Settings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' attribute.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(String value);

} // CIM_DiagnosticSettingDataRecord

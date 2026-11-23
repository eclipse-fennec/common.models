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
 * A representation of the model object '<em><b>CIM Setting Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class specifies information needed to verify a particular 'setting' file, for a specific entry in the file. The file entry is checked whether it contains or matches the value defined in EntryValue. All compares are assumed to be case insensitive.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SettingCheck#getSectionKey <em>Section Key</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SettingCheck#getEntryName <em>Entry Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SettingCheck#getEntryValue <em>Entry Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SettingCheck#getCheckType <em>Check Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SettingCheck#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SettingCheck()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,CheckID'"
 * @generated
 */
@ProviderType
public interface CIM_SettingCheck extends CIM_Check {
	/**
	 * Returns the value of the '<em><b>Section Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Key or label for the section of the file containing the settings to be checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Section Key</em>' attribute.
	 * @see #setSectionKey(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SettingCheck_SectionKey()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getSectionKey();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SettingCheck#getSectionKey <em>Section Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Key</em>' attribute.
	 * @see #getSectionKey()
	 * @generated
	 */
	void setSectionKey(String value);

	/**
	 * Returns the value of the '<em><b>Entry Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the setting entry to be checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Name</em>' attribute.
	 * @see #setEntryName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SettingCheck_EntryName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getEntryName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SettingCheck#getEntryName <em>Entry Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Name</em>' attribute.
	 * @see #getEntryName()
	 * @generated
	 */
	void setEntryName(String value);

	/**
	 * Returns the value of the '<em><b>Entry Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value to be compared for the named entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Value</em>' attribute.
	 * @see #setEntryValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SettingCheck_EntryValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getEntryValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SettingCheck#getEntryValue <em>Entry Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Value</em>' attribute.
	 * @see #getEntryValue()
	 * @generated
	 */
	void setEntryValue(String value);

	/**
	 * Returns the value of the '<em><b>Check Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CheckType specifies how the setting value should be compared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Check Type</em>' attribute.
	 * @see #setCheckType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SettingCheck_CheckType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\"]' Values='[\"Matches\",\"Contains\"]'"
	 * @generated
	 */
	Integer getCheckType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SettingCheck#getCheckType <em>Check Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Type</em>' attribute.
	 * @see #getCheckType()
	 * @generated
	 */
	void setCheckType(Integer value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * File name of the 'setting' file to be checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SettingCheck_FileName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='1024'"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SettingCheck#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

} // CIM_SettingCheck

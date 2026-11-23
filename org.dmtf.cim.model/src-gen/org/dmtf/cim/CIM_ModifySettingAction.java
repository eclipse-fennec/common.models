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
 * A representation of the model object '<em><b>CIM Modify Setting Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class specifies the information used to modify a 'setting' file, for a specific entry in the file. The new 'setting' value is created as a new entry or appends to, replaces, removes from, or deletes the specified entry. All additions are assumed to be case sensitive. Removes are assumed to be case insensitive.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ModifySettingAction#getSectionKey <em>Section Key</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ModifySettingAction#getEntryName <em>Entry Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ModifySettingAction#getEntryValue <em>Entry Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ModifySettingAction#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ModifySettingAction#getActionType <em>Action Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ModifySettingAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Name,Version,SoftwareElementState,SoftwareElementID,TargetOperatingSystem,ActionID'"
 * @generated
 */
@ProviderType
public interface CIM_ModifySettingAction extends CIM_Action {
	/**
	 * Returns the value of the '<em><b>Section Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the key or label of the section of the file to be modified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Section Key</em>' attribute.
	 * @see #setSectionKey(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ModifySettingAction_SectionKey()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getSectionKey();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ModifySettingAction#getSectionKey <em>Section Key</em>}' attribute.
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
	 * Name of setting entry to be modified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Name</em>' attribute.
	 * @see #setEntryName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ModifySettingAction_EntryName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getEntryName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ModifySettingAction#getEntryName <em>Entry Name</em>}' attribute.
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
	 * This is the value to add, append, or replace the specified setting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Value</em>' attribute.
	 * @see #setEntryValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ModifySettingAction_EntryValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getEntryValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ModifySettingAction#getEntryValue <em>Entry Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Value</em>' attribute.
	 * @see #getEntryValue()
	 * @generated
	 */
	void setEntryValue(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * File name of the 'setting' file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ModifySettingAction_FileName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='1024'"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ModifySettingAction#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of Action to be performed on the specified setting entry. 
	 * 0=Create - Creates the specified entry. 
	 * 1=Delete - Deletes the specified entry. 
	 * 2=Append - Appends to the end of the specified entry. 
	 * 3=Remove - Removes the value from the specified entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute.
	 * @see #setActionType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ModifySettingAction_ActionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Create\",\"Delete\",\"Append\",\"Remove\"]'"
	 * @generated
	 */
	Integer getActionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ModifySettingAction#getActionType <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Type</em>' attribute.
	 * @see #getActionType()
	 * @generated
	 */
	void setActionType(Integer value);

} // CIM_ModifySettingAction

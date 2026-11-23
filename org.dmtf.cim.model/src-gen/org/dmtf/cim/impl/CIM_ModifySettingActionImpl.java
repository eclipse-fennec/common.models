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
package org.dmtf.cim.impl;

import org.dmtf.cim.CIM_ModifySettingAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Modify Setting Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ModifySettingActionImpl#getSectionKey <em>Section Key</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ModifySettingActionImpl#getEntryName <em>Entry Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ModifySettingActionImpl#getEntryValue <em>Entry Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ModifySettingActionImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ModifySettingActionImpl#getActionType <em>Action Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ModifySettingActionImpl extends CIM_ActionImpl implements CIM_ModifySettingAction {
	/**
	 * The default value of the '{@link #getSectionKey() <em>Section Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionKey()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSectionKey() <em>Section Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionKey()
	 * @generated
	 * @ordered
	 */
	protected String sectionKey = SECTION_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntryName() <em>Entry Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryName() <em>Entry Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryName()
	 * @generated
	 * @ordered
	 */
	protected String entryName = ENTRY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntryValue() <em>Entry Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTRY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntryValue() <em>Entry Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryValue()
	 * @generated
	 * @ordered
	 */
	protected String entryValue = ENTRY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionType() <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected Integer actionType = ACTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ModifySettingActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ModifySettingAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSectionKey() {
		return sectionKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSectionKey(String newSectionKey) {
		String oldSectionKey = sectionKey;
		sectionKey = newSectionKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MODIFY_SETTING_ACTION__SECTION_KEY, oldSectionKey, sectionKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntryName() {
		return entryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryName(String newEntryName) {
		String oldEntryName = entryName;
		entryName = newEntryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MODIFY_SETTING_ACTION__ENTRY_NAME, oldEntryName, entryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntryValue() {
		return entryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryValue(String newEntryValue) {
		String oldEntryValue = entryValue;
		entryValue = newEntryValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MODIFY_SETTING_ACTION__ENTRY_VALUE, oldEntryValue, entryValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MODIFY_SETTING_ACTION__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getActionType() {
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionType(Integer newActionType) {
		Integer oldActionType = actionType;
		actionType = newActionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MODIFY_SETTING_ACTION__ACTION_TYPE, oldActionType, actionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MODIFY_SETTING_ACTION__SECTION_KEY:
				return getSectionKey();
			case CimPackage.CIM_MODIFY_SETTING_ACTION__ENTRY_NAME:
				return getEntryName();
			case CimPackage.CIM_MODIFY_SETTING_ACTION__ENTRY_VALUE:
				return getEntryValue();
			case CimPackage.CIM_MODIFY_SETTING_ACTION__FILE_NAME:
				return getFileName();
			case CimPackage.CIM_MODIFY_SETTING_ACTION__ACTION_TYPE:
				return getActionType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_MODIFY_SETTING_ACTION__SECTION_KEY:
				setSectionKey((String)newValue);
				return;
			case CimPackage.CIM_MODIFY_SETTING_ACTION__ENTRY_NAME:
				setEntryName((String)newValue);
				return;
			case CimPackage.CIM_MODIFY_SETTING_ACTION__ENTRY_VALUE:
				setEntryValue((String)newValue);
				return;
			case CimPackage.CIM_MODIFY_SETTING_ACTION__FILE_NAME:
				setFileName((String)newValue);
				return;
			case CimPackage.CIM_MODIFY_SETTING_ACTION__ACTION_TYPE:
				setActionType((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_MODIFY_SETTING_ACTION__SECTION_KEY:
				setSectionKey(SECTION_KEY_EDEFAULT);
				return;
			case CimPackage.CIM_MODIFY_SETTING_ACTION__ENTRY_NAME:
				setEntryName(ENTRY_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MODIFY_SETTING_ACTION__ENTRY_VALUE:
				setEntryValue(ENTRY_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_MODIFY_SETTING_ACTION__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_MODIFY_SETTING_ACTION__ACTION_TYPE:
				setActionType(ACTION_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_MODIFY_SETTING_ACTION__SECTION_KEY:
				return SECTION_KEY_EDEFAULT == null ? sectionKey != null : !SECTION_KEY_EDEFAULT.equals(sectionKey);
			case CimPackage.CIM_MODIFY_SETTING_ACTION__ENTRY_NAME:
				return ENTRY_NAME_EDEFAULT == null ? entryName != null : !ENTRY_NAME_EDEFAULT.equals(entryName);
			case CimPackage.CIM_MODIFY_SETTING_ACTION__ENTRY_VALUE:
				return ENTRY_VALUE_EDEFAULT == null ? entryValue != null : !ENTRY_VALUE_EDEFAULT.equals(entryValue);
			case CimPackage.CIM_MODIFY_SETTING_ACTION__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case CimPackage.CIM_MODIFY_SETTING_ACTION__ACTION_TYPE:
				return ACTION_TYPE_EDEFAULT == null ? actionType != null : !ACTION_TYPE_EDEFAULT.equals(actionType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (SectionKey: ");
		result.append(sectionKey);
		result.append(", EntryName: ");
		result.append(entryName);
		result.append(", EntryValue: ");
		result.append(entryValue);
		result.append(", FileName: ");
		result.append(fileName);
		result.append(", ActionType: ");
		result.append(actionType);
		result.append(')');
		return result.toString();
	}

} //CIM_ModifySettingActionImpl

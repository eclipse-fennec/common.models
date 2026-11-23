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

import org.dmtf.cim.CIM_SettingCheck;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Setting Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingCheckImpl#getSectionKey <em>Section Key</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingCheckImpl#getEntryName <em>Entry Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingCheckImpl#getEntryValue <em>Entry Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingCheckImpl#getCheckType <em>Check Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingCheckImpl#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SettingCheckImpl extends CIM_CheckImpl implements CIM_SettingCheck {
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
	 * The default value of the '{@link #getCheckType() <em>Check Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHECK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckType() <em>Check Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckType()
	 * @generated
	 * @ordered
	 */
	protected Integer checkType = CHECK_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SettingCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SettingCheck();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTING_CHECK__SECTION_KEY, oldSectionKey, sectionKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTING_CHECK__ENTRY_NAME, oldEntryName, entryName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTING_CHECK__ENTRY_VALUE, oldEntryValue, entryValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCheckType() {
		return checkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckType(Integer newCheckType) {
		Integer oldCheckType = checkType;
		checkType = newCheckType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTING_CHECK__CHECK_TYPE, oldCheckType, checkType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTING_CHECK__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SETTING_CHECK__SECTION_KEY:
				return getSectionKey();
			case CimPackage.CIM_SETTING_CHECK__ENTRY_NAME:
				return getEntryName();
			case CimPackage.CIM_SETTING_CHECK__ENTRY_VALUE:
				return getEntryValue();
			case CimPackage.CIM_SETTING_CHECK__CHECK_TYPE:
				return getCheckType();
			case CimPackage.CIM_SETTING_CHECK__FILE_NAME:
				return getFileName();
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
			case CimPackage.CIM_SETTING_CHECK__SECTION_KEY:
				setSectionKey((String)newValue);
				return;
			case CimPackage.CIM_SETTING_CHECK__ENTRY_NAME:
				setEntryName((String)newValue);
				return;
			case CimPackage.CIM_SETTING_CHECK__ENTRY_VALUE:
				setEntryValue((String)newValue);
				return;
			case CimPackage.CIM_SETTING_CHECK__CHECK_TYPE:
				setCheckType((Integer)newValue);
				return;
			case CimPackage.CIM_SETTING_CHECK__FILE_NAME:
				setFileName((String)newValue);
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
			case CimPackage.CIM_SETTING_CHECK__SECTION_KEY:
				setSectionKey(SECTION_KEY_EDEFAULT);
				return;
			case CimPackage.CIM_SETTING_CHECK__ENTRY_NAME:
				setEntryName(ENTRY_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SETTING_CHECK__ENTRY_VALUE:
				setEntryValue(ENTRY_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_SETTING_CHECK__CHECK_TYPE:
				setCheckType(CHECK_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_SETTING_CHECK__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
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
			case CimPackage.CIM_SETTING_CHECK__SECTION_KEY:
				return SECTION_KEY_EDEFAULT == null ? sectionKey != null : !SECTION_KEY_EDEFAULT.equals(sectionKey);
			case CimPackage.CIM_SETTING_CHECK__ENTRY_NAME:
				return ENTRY_NAME_EDEFAULT == null ? entryName != null : !ENTRY_NAME_EDEFAULT.equals(entryName);
			case CimPackage.CIM_SETTING_CHECK__ENTRY_VALUE:
				return ENTRY_VALUE_EDEFAULT == null ? entryValue != null : !ENTRY_VALUE_EDEFAULT.equals(entryValue);
			case CimPackage.CIM_SETTING_CHECK__CHECK_TYPE:
				return CHECK_TYPE_EDEFAULT == null ? checkType != null : !CHECK_TYPE_EDEFAULT.equals(checkType);
			case CimPackage.CIM_SETTING_CHECK__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
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
		result.append(", CheckType: ");
		result.append(checkType);
		result.append(", FileName: ");
		result.append(fileName);
		result.append(')');
		return result.toString();
	}

} //CIM_SettingCheckImpl

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

import org.dmtf.cim.CIM_CorrespondingSettingDataRecord;
import org.dmtf.cim.CIM_DiagnosticRecord;
import org.dmtf.cim.CIM_DiagnosticSettingDataRecord;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Corresponding Setting Data Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CorrespondingSettingDataRecordImpl#getDataRecord <em>Data Record</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CorrespondingSettingDataRecordImpl#getSettingsRecord <em>Settings Record</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CorrespondingSettingDataRecordImpl extends MinimalEObjectImpl.Container implements CIM_CorrespondingSettingDataRecord {
	/**
	 * The cached value of the '{@link #getDataRecord() <em>Data Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRecord()
	 * @generated
	 * @ordered
	 */
	protected CIM_DiagnosticRecord dataRecord;

	/**
	 * The cached value of the '{@link #getSettingsRecord() <em>Settings Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingsRecord()
	 * @generated
	 * @ordered
	 */
	protected CIM_DiagnosticSettingDataRecord settingsRecord;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CorrespondingSettingDataRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CorrespondingSettingDataRecord();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticRecord getDataRecord() {
		if (dataRecord != null && dataRecord.eIsProxy()) {
			InternalEObject oldDataRecord = (InternalEObject)dataRecord;
			dataRecord = (CIM_DiagnosticRecord)eResolveProxy(oldDataRecord);
			if (dataRecord != oldDataRecord) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_CORRESPONDING_SETTING_DATA_RECORD__DATA_RECORD, oldDataRecord, dataRecord));
			}
		}
		return dataRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_DiagnosticRecord basicGetDataRecord() {
		return dataRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataRecord(CIM_DiagnosticRecord newDataRecord) {
		CIM_DiagnosticRecord oldDataRecord = dataRecord;
		dataRecord = newDataRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CORRESPONDING_SETTING_DATA_RECORD__DATA_RECORD, oldDataRecord, dataRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticSettingDataRecord getSettingsRecord() {
		if (settingsRecord != null && settingsRecord.eIsProxy()) {
			InternalEObject oldSettingsRecord = (InternalEObject)settingsRecord;
			settingsRecord = (CIM_DiagnosticSettingDataRecord)eResolveProxy(oldSettingsRecord);
			if (settingsRecord != oldSettingsRecord) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_CORRESPONDING_SETTING_DATA_RECORD__SETTINGS_RECORD, oldSettingsRecord, settingsRecord));
			}
		}
		return settingsRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_DiagnosticSettingDataRecord basicGetSettingsRecord() {
		return settingsRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSettingsRecord(CIM_DiagnosticSettingDataRecord newSettingsRecord) {
		CIM_DiagnosticSettingDataRecord oldSettingsRecord = settingsRecord;
		settingsRecord = newSettingsRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CORRESPONDING_SETTING_DATA_RECORD__SETTINGS_RECORD, oldSettingsRecord, settingsRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CORRESPONDING_SETTING_DATA_RECORD__DATA_RECORD:
				if (resolve) return getDataRecord();
				return basicGetDataRecord();
			case CimPackage.CIM_CORRESPONDING_SETTING_DATA_RECORD__SETTINGS_RECORD:
				if (resolve) return getSettingsRecord();
				return basicGetSettingsRecord();
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
			case CimPackage.CIM_CORRESPONDING_SETTING_DATA_RECORD__DATA_RECORD:
				setDataRecord((CIM_DiagnosticRecord)newValue);
				return;
			case CimPackage.CIM_CORRESPONDING_SETTING_DATA_RECORD__SETTINGS_RECORD:
				setSettingsRecord((CIM_DiagnosticSettingDataRecord)newValue);
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
			case CimPackage.CIM_CORRESPONDING_SETTING_DATA_RECORD__DATA_RECORD:
				setDataRecord((CIM_DiagnosticRecord)null);
				return;
			case CimPackage.CIM_CORRESPONDING_SETTING_DATA_RECORD__SETTINGS_RECORD:
				setSettingsRecord((CIM_DiagnosticSettingDataRecord)null);
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
			case CimPackage.CIM_CORRESPONDING_SETTING_DATA_RECORD__DATA_RECORD:
				return dataRecord != null;
			case CimPackage.CIM_CORRESPONDING_SETTING_DATA_RECORD__SETTINGS_RECORD:
				return settingsRecord != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_CorrespondingSettingDataRecordImpl

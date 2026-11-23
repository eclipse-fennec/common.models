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

import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_SettingData;
import org.dmtf.cim.CIM_SettingsDefineState;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Settings Define State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingsDefineStateImpl#getManagedElement <em>Managed Element</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingsDefineStateImpl#getSettingData <em>Setting Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SettingsDefineStateImpl extends MinimalEObjectImpl.Container implements CIM_SettingsDefineState {
	/**
	 * The cached value of the '{@link #getManagedElement() <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedElement()
	 * @generated
	 * @ordered
	 */
	protected CIM_ManagedElement managedElement;

	/**
	 * The cached value of the '{@link #getSettingData() <em>Setting Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingData()
	 * @generated
	 * @ordered
	 */
	protected CIM_SettingData settingData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SettingsDefineStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SettingsDefineState();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_ManagedElement getManagedElement() {
		if (managedElement != null && managedElement.eIsProxy()) {
			InternalEObject oldManagedElement = (InternalEObject)managedElement;
			managedElement = (CIM_ManagedElement)eResolveProxy(oldManagedElement);
			if (managedElement != oldManagedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SETTINGS_DEFINE_STATE__MANAGED_ELEMENT, oldManagedElement, managedElement));
			}
		}
		return managedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_ManagedElement basicGetManagedElement() {
		return managedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagedElement(CIM_ManagedElement newManagedElement) {
		CIM_ManagedElement oldManagedElement = managedElement;
		managedElement = newManagedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTINGS_DEFINE_STATE__MANAGED_ELEMENT, oldManagedElement, managedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_SettingData getSettingData() {
		if (settingData != null && settingData.eIsProxy()) {
			InternalEObject oldSettingData = (InternalEObject)settingData;
			settingData = (CIM_SettingData)eResolveProxy(oldSettingData);
			if (settingData != oldSettingData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SETTINGS_DEFINE_STATE__SETTING_DATA, oldSettingData, settingData));
			}
		}
		return settingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_SettingData basicGetSettingData() {
		return settingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSettingData(CIM_SettingData newSettingData) {
		CIM_SettingData oldSettingData = settingData;
		settingData = newSettingData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTINGS_DEFINE_STATE__SETTING_DATA, oldSettingData, settingData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SETTINGS_DEFINE_STATE__MANAGED_ELEMENT:
				if (resolve) return getManagedElement();
				return basicGetManagedElement();
			case CimPackage.CIM_SETTINGS_DEFINE_STATE__SETTING_DATA:
				if (resolve) return getSettingData();
				return basicGetSettingData();
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
			case CimPackage.CIM_SETTINGS_DEFINE_STATE__MANAGED_ELEMENT:
				setManagedElement((CIM_ManagedElement)newValue);
				return;
			case CimPackage.CIM_SETTINGS_DEFINE_STATE__SETTING_DATA:
				setSettingData((CIM_SettingData)newValue);
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
			case CimPackage.CIM_SETTINGS_DEFINE_STATE__MANAGED_ELEMENT:
				setManagedElement((CIM_ManagedElement)null);
				return;
			case CimPackage.CIM_SETTINGS_DEFINE_STATE__SETTING_DATA:
				setSettingData((CIM_SettingData)null);
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
			case CimPackage.CIM_SETTINGS_DEFINE_STATE__MANAGED_ELEMENT:
				return managedElement != null;
			case CimPackage.CIM_SETTINGS_DEFINE_STATE__SETTING_DATA:
				return settingData != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_SettingsDefineStateImpl

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

import org.dmtf.cim.CIM_SettingAssociatedToCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Setting Associated To Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingAssociatedToCapabilitiesImpl#getDefaultSetting <em>Default Setting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SettingAssociatedToCapabilitiesImpl extends CIM_DependencyImpl implements CIM_SettingAssociatedToCapabilities {
	/**
	 * The default value of the '{@link #getDefaultSetting() <em>Default Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSetting()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEFAULT_SETTING_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getDefaultSetting() <em>Default Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultSetting()
	 * @generated
	 * @ordered
	 */
	protected Boolean defaultSetting = DEFAULT_SETTING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SettingAssociatedToCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SettingAssociatedToCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDefaultSetting() {
		return defaultSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultSetting(Boolean newDefaultSetting) {
		Boolean oldDefaultSetting = defaultSetting;
		defaultSetting = newDefaultSetting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTING_ASSOCIATED_TO_CAPABILITIES__DEFAULT_SETTING, oldDefaultSetting, defaultSetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SETTING_ASSOCIATED_TO_CAPABILITIES__DEFAULT_SETTING:
				return getDefaultSetting();
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
			case CimPackage.CIM_SETTING_ASSOCIATED_TO_CAPABILITIES__DEFAULT_SETTING:
				setDefaultSetting((Boolean)newValue);
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
			case CimPackage.CIM_SETTING_ASSOCIATED_TO_CAPABILITIES__DEFAULT_SETTING:
				setDefaultSetting(DEFAULT_SETTING_EDEFAULT);
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
			case CimPackage.CIM_SETTING_ASSOCIATED_TO_CAPABILITIES__DEFAULT_SETTING:
				return DEFAULT_SETTING_EDEFAULT == null ? defaultSetting != null : !DEFAULT_SETTING_EDEFAULT.equals(defaultSetting);
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
		result.append(" (DefaultSetting: ");
		result.append(defaultSetting);
		result.append(')');
		return result.toString();
	}

} //CIM_SettingAssociatedToCapabilitiesImpl

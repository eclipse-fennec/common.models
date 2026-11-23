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

import org.dmtf.cim.CIM_Configuration;
import org.dmtf.cim.CIM_Setting;
import org.dmtf.cim.CIM_SettingContext;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Setting Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingContextImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SettingContextImpl#getSetting <em>Setting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SettingContextImpl extends MinimalEObjectImpl.Container implements CIM_SettingContext {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected CIM_Configuration context;

	/**
	 * The cached value of the '{@link #getSetting() <em>Setting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetting()
	 * @generated
	 * @ordered
	 */
	protected CIM_Setting setting;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SettingContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SettingContext();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Configuration getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (CIM_Configuration)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SETTING_CONTEXT__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Configuration basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(CIM_Configuration newContext) {
		CIM_Configuration oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTING_CONTEXT__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_Setting getSetting() {
		if (setting != null && setting.eIsProxy()) {
			InternalEObject oldSetting = (InternalEObject)setting;
			setting = (CIM_Setting)eResolveProxy(oldSetting);
			if (setting != oldSetting) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_SETTING_CONTEXT__SETTING, oldSetting, setting));
			}
		}
		return setting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_Setting basicGetSetting() {
		return setting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSetting(CIM_Setting newSetting) {
		CIM_Setting oldSetting = setting;
		setting = newSetting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SETTING_CONTEXT__SETTING, oldSetting, setting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SETTING_CONTEXT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case CimPackage.CIM_SETTING_CONTEXT__SETTING:
				if (resolve) return getSetting();
				return basicGetSetting();
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
			case CimPackage.CIM_SETTING_CONTEXT__CONTEXT:
				setContext((CIM_Configuration)newValue);
				return;
			case CimPackage.CIM_SETTING_CONTEXT__SETTING:
				setSetting((CIM_Setting)newValue);
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
			case CimPackage.CIM_SETTING_CONTEXT__CONTEXT:
				setContext((CIM_Configuration)null);
				return;
			case CimPackage.CIM_SETTING_CONTEXT__SETTING:
				setSetting((CIM_Setting)null);
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
			case CimPackage.CIM_SETTING_CONTEXT__CONTEXT:
				return context != null;
			case CimPackage.CIM_SETTING_CONTEXT__SETTING:
				return setting != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_SettingContextImpl

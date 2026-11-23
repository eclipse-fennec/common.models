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

import org.dmtf.cim.CIM_BootSourceSetting;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Boot Source Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BootSourceSettingImpl#getBootString <em>Boot String</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BootSourceSettingImpl#getBIOSBootString <em>BIOS Boot String</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BootSourceSettingImpl#getStructuredBootString <em>Structured Boot String</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BootSourceSettingImpl#getFailThroughSupported <em>Fail Through Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BootSourceSettingImpl extends CIM_SettingDataImpl implements CIM_BootSourceSetting {
	/**
	 * The default value of the '{@link #getBootString() <em>Boot String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootString()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBootString() <em>Boot String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBootString()
	 * @generated
	 * @ordered
	 */
	protected String bootString = BOOT_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getBIOSBootString() <em>BIOS Boot String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBIOSBootString()
	 * @generated
	 * @ordered
	 */
	protected static final String BIOS_BOOT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBIOSBootString() <em>BIOS Boot String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBIOSBootString()
	 * @generated
	 * @ordered
	 */
	protected String biosBootString = BIOS_BOOT_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getStructuredBootString() <em>Structured Boot String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredBootString()
	 * @generated
	 * @ordered
	 */
	protected static final String STRUCTURED_BOOT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStructuredBootString() <em>Structured Boot String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredBootString()
	 * @generated
	 * @ordered
	 */
	protected String structuredBootString = STRUCTURED_BOOT_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailThroughSupported() <em>Fail Through Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailThroughSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FAIL_THROUGH_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailThroughSupported() <em>Fail Through Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailThroughSupported()
	 * @generated
	 * @ordered
	 */
	protected Integer failThroughSupported = FAIL_THROUGH_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BootSourceSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BootSourceSetting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBootString() {
		return bootString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBootString(String newBootString) {
		String oldBootString = bootString;
		bootString = newBootString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BOOT_SOURCE_SETTING__BOOT_STRING, oldBootString, bootString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBIOSBootString() {
		return biosBootString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBIOSBootString(String newBIOSBootString) {
		String oldBIOSBootString = biosBootString;
		biosBootString = newBIOSBootString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BOOT_SOURCE_SETTING__BIOS_BOOT_STRING, oldBIOSBootString, biosBootString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStructuredBootString() {
		return structuredBootString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStructuredBootString(String newStructuredBootString) {
		String oldStructuredBootString = structuredBootString;
		structuredBootString = newStructuredBootString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BOOT_SOURCE_SETTING__STRUCTURED_BOOT_STRING, oldStructuredBootString, structuredBootString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFailThroughSupported() {
		return failThroughSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailThroughSupported(Integer newFailThroughSupported) {
		Integer oldFailThroughSupported = failThroughSupported;
		failThroughSupported = newFailThroughSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BOOT_SOURCE_SETTING__FAIL_THROUGH_SUPPORTED, oldFailThroughSupported, failThroughSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BOOT_SOURCE_SETTING__BOOT_STRING:
				return getBootString();
			case CimPackage.CIM_BOOT_SOURCE_SETTING__BIOS_BOOT_STRING:
				return getBIOSBootString();
			case CimPackage.CIM_BOOT_SOURCE_SETTING__STRUCTURED_BOOT_STRING:
				return getStructuredBootString();
			case CimPackage.CIM_BOOT_SOURCE_SETTING__FAIL_THROUGH_SUPPORTED:
				return getFailThroughSupported();
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
			case CimPackage.CIM_BOOT_SOURCE_SETTING__BOOT_STRING:
				setBootString((String)newValue);
				return;
			case CimPackage.CIM_BOOT_SOURCE_SETTING__BIOS_BOOT_STRING:
				setBIOSBootString((String)newValue);
				return;
			case CimPackage.CIM_BOOT_SOURCE_SETTING__STRUCTURED_BOOT_STRING:
				setStructuredBootString((String)newValue);
				return;
			case CimPackage.CIM_BOOT_SOURCE_SETTING__FAIL_THROUGH_SUPPORTED:
				setFailThroughSupported((Integer)newValue);
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
			case CimPackage.CIM_BOOT_SOURCE_SETTING__BOOT_STRING:
				setBootString(BOOT_STRING_EDEFAULT);
				return;
			case CimPackage.CIM_BOOT_SOURCE_SETTING__BIOS_BOOT_STRING:
				setBIOSBootString(BIOS_BOOT_STRING_EDEFAULT);
				return;
			case CimPackage.CIM_BOOT_SOURCE_SETTING__STRUCTURED_BOOT_STRING:
				setStructuredBootString(STRUCTURED_BOOT_STRING_EDEFAULT);
				return;
			case CimPackage.CIM_BOOT_SOURCE_SETTING__FAIL_THROUGH_SUPPORTED:
				setFailThroughSupported(FAIL_THROUGH_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_BOOT_SOURCE_SETTING__BOOT_STRING:
				return BOOT_STRING_EDEFAULT == null ? bootString != null : !BOOT_STRING_EDEFAULT.equals(bootString);
			case CimPackage.CIM_BOOT_SOURCE_SETTING__BIOS_BOOT_STRING:
				return BIOS_BOOT_STRING_EDEFAULT == null ? biosBootString != null : !BIOS_BOOT_STRING_EDEFAULT.equals(biosBootString);
			case CimPackage.CIM_BOOT_SOURCE_SETTING__STRUCTURED_BOOT_STRING:
				return STRUCTURED_BOOT_STRING_EDEFAULT == null ? structuredBootString != null : !STRUCTURED_BOOT_STRING_EDEFAULT.equals(structuredBootString);
			case CimPackage.CIM_BOOT_SOURCE_SETTING__FAIL_THROUGH_SUPPORTED:
				return FAIL_THROUGH_SUPPORTED_EDEFAULT == null ? failThroughSupported != null : !FAIL_THROUGH_SUPPORTED_EDEFAULT.equals(failThroughSupported);
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
		result.append(" (BootString: ");
		result.append(bootString);
		result.append(", BIOSBootString: ");
		result.append(biosBootString);
		result.append(", StructuredBootString: ");
		result.append(structuredBootString);
		result.append(", FailThroughSupported: ");
		result.append(failThroughSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_BootSourceSettingImpl

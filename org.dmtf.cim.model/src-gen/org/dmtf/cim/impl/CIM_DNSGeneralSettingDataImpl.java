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

import java.util.Collection;

import org.dmtf.cim.CIM_DNSGeneralSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM DNS General Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSGeneralSettingDataImpl#getAppendPrimarySuffixes <em>Append Primary Suffixes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSGeneralSettingDataImpl#getAppendParentSuffixes <em>Append Parent Suffixes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSGeneralSettingDataImpl#getDNSSuffixesToAppend <em>DNS Suffixes To Append</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DNSGeneralSettingDataImpl extends CIM_IPAssignmentSettingDataImpl implements CIM_DNSGeneralSettingData {
	/**
	 * The default value of the '{@link #getAppendPrimarySuffixes() <em>Append Primary Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppendPrimarySuffixes()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean APPEND_PRIMARY_SUFFIXES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppendPrimarySuffixes() <em>Append Primary Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppendPrimarySuffixes()
	 * @generated
	 * @ordered
	 */
	protected Boolean appendPrimarySuffixes = APPEND_PRIMARY_SUFFIXES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppendParentSuffixes() <em>Append Parent Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppendParentSuffixes()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean APPEND_PARENT_SUFFIXES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppendParentSuffixes() <em>Append Parent Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppendParentSuffixes()
	 * @generated
	 * @ordered
	 */
	protected Boolean appendParentSuffixes = APPEND_PARENT_SUFFIXES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDNSSuffixesToAppend() <em>DNS Suffixes To Append</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDNSSuffixesToAppend()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dnsSuffixesToAppend;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DNSGeneralSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DNSGeneralSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAppendPrimarySuffixes() {
		return appendPrimarySuffixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppendPrimarySuffixes(Boolean newAppendPrimarySuffixes) {
		Boolean oldAppendPrimarySuffixes = appendPrimarySuffixes;
		appendPrimarySuffixes = newAppendPrimarySuffixes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DNS_GENERAL_SETTING_DATA__APPEND_PRIMARY_SUFFIXES, oldAppendPrimarySuffixes, appendPrimarySuffixes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAppendParentSuffixes() {
		return appendParentSuffixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppendParentSuffixes(Boolean newAppendParentSuffixes) {
		Boolean oldAppendParentSuffixes = appendParentSuffixes;
		appendParentSuffixes = newAppendParentSuffixes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DNS_GENERAL_SETTING_DATA__APPEND_PARENT_SUFFIXES, oldAppendParentSuffixes, appendParentSuffixes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDNSSuffixesToAppend() {
		if (dnsSuffixesToAppend == null) {
			dnsSuffixesToAppend = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DNS_GENERAL_SETTING_DATA__DNS_SUFFIXES_TO_APPEND);
		}
		return dnsSuffixesToAppend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DNS_GENERAL_SETTING_DATA__APPEND_PRIMARY_SUFFIXES:
				return getAppendPrimarySuffixes();
			case CimPackage.CIM_DNS_GENERAL_SETTING_DATA__APPEND_PARENT_SUFFIXES:
				return getAppendParentSuffixes();
			case CimPackage.CIM_DNS_GENERAL_SETTING_DATA__DNS_SUFFIXES_TO_APPEND:
				return getDNSSuffixesToAppend();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_DNS_GENERAL_SETTING_DATA__APPEND_PRIMARY_SUFFIXES:
				setAppendPrimarySuffixes((Boolean)newValue);
				return;
			case CimPackage.CIM_DNS_GENERAL_SETTING_DATA__APPEND_PARENT_SUFFIXES:
				setAppendParentSuffixes((Boolean)newValue);
				return;
			case CimPackage.CIM_DNS_GENERAL_SETTING_DATA__DNS_SUFFIXES_TO_APPEND:
				getDNSSuffixesToAppend().clear();
				getDNSSuffixesToAppend().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_DNS_GENERAL_SETTING_DATA__APPEND_PRIMARY_SUFFIXES:
				setAppendPrimarySuffixes(APPEND_PRIMARY_SUFFIXES_EDEFAULT);
				return;
			case CimPackage.CIM_DNS_GENERAL_SETTING_DATA__APPEND_PARENT_SUFFIXES:
				setAppendParentSuffixes(APPEND_PARENT_SUFFIXES_EDEFAULT);
				return;
			case CimPackage.CIM_DNS_GENERAL_SETTING_DATA__DNS_SUFFIXES_TO_APPEND:
				getDNSSuffixesToAppend().clear();
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
			case CimPackage.CIM_DNS_GENERAL_SETTING_DATA__APPEND_PRIMARY_SUFFIXES:
				return APPEND_PRIMARY_SUFFIXES_EDEFAULT == null ? appendPrimarySuffixes != null : !APPEND_PRIMARY_SUFFIXES_EDEFAULT.equals(appendPrimarySuffixes);
			case CimPackage.CIM_DNS_GENERAL_SETTING_DATA__APPEND_PARENT_SUFFIXES:
				return APPEND_PARENT_SUFFIXES_EDEFAULT == null ? appendParentSuffixes != null : !APPEND_PARENT_SUFFIXES_EDEFAULT.equals(appendParentSuffixes);
			case CimPackage.CIM_DNS_GENERAL_SETTING_DATA__DNS_SUFFIXES_TO_APPEND:
				return dnsSuffixesToAppend != null && !dnsSuffixesToAppend.isEmpty();
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
		result.append(" (AppendPrimarySuffixes: ");
		result.append(appendPrimarySuffixes);
		result.append(", AppendParentSuffixes: ");
		result.append(appendParentSuffixes);
		result.append(", DNSSuffixesToAppend: ");
		result.append(dnsSuffixesToAppend);
		result.append(')');
		return result.toString();
	}

} //CIM_DNSGeneralSettingDataImpl

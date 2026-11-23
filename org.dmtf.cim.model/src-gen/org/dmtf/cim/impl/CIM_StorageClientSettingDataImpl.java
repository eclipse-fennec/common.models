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

import org.dmtf.cim.CIM_StorageClientSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Client Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageClientSettingDataImpl#getClientTypes <em>Client Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageClientSettingDataImpl#getOtherClientTypeDescriptions <em>Other Client Type Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageClientSettingDataImpl extends CIM_SettingDataImpl implements CIM_StorageClientSettingData {
	/**
	 * The cached value of the '{@link #getClientTypes() <em>Client Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> clientTypes;

	/**
	 * The cached value of the '{@link #getOtherClientTypeDescriptions() <em>Other Client Type Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherClientTypeDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherClientTypeDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageClientSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageClientSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getClientTypes() {
		if (clientTypes == null) {
			clientTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CLIENT_SETTING_DATA__CLIENT_TYPES);
		}
		return clientTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherClientTypeDescriptions() {
		if (otherClientTypeDescriptions == null) {
			otherClientTypeDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_STORAGE_CLIENT_SETTING_DATA__OTHER_CLIENT_TYPE_DESCRIPTIONS);
		}
		return otherClientTypeDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_CLIENT_SETTING_DATA__CLIENT_TYPES:
				return getClientTypes();
			case CimPackage.CIM_STORAGE_CLIENT_SETTING_DATA__OTHER_CLIENT_TYPE_DESCRIPTIONS:
				return getOtherClientTypeDescriptions();
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
			case CimPackage.CIM_STORAGE_CLIENT_SETTING_DATA__CLIENT_TYPES:
				getClientTypes().clear();
				getClientTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CLIENT_SETTING_DATA__OTHER_CLIENT_TYPE_DESCRIPTIONS:
				getOtherClientTypeDescriptions().clear();
				getOtherClientTypeDescriptions().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_STORAGE_CLIENT_SETTING_DATA__CLIENT_TYPES:
				getClientTypes().clear();
				return;
			case CimPackage.CIM_STORAGE_CLIENT_SETTING_DATA__OTHER_CLIENT_TYPE_DESCRIPTIONS:
				getOtherClientTypeDescriptions().clear();
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
			case CimPackage.CIM_STORAGE_CLIENT_SETTING_DATA__CLIENT_TYPES:
				return clientTypes != null && !clientTypes.isEmpty();
			case CimPackage.CIM_STORAGE_CLIENT_SETTING_DATA__OTHER_CLIENT_TYPE_DESCRIPTIONS:
				return otherClientTypeDescriptions != null && !otherClientTypeDescriptions.isEmpty();
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
		result.append(" (ClientTypes: ");
		result.append(clientTypes);
		result.append(", OtherClientTypeDescriptions: ");
		result.append(otherClientTypeDescriptions);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageClientSettingDataImpl

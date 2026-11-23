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

import org.dmtf.cim.CIM_RecordLogCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Record Log Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RecordLogCapabilitiesImpl#getSupportedRecordTypes <em>Supported Record Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RecordLogCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_RecordLogCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedRecordTypes() <em>Supported Record Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedRecordTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedRecordTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RecordLogCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RecordLogCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedRecordTypes() {
		if (supportedRecordTypes == null) {
			supportedRecordTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_RECORD_LOG_CAPABILITIES__SUPPORTED_RECORD_TYPES);
		}
		return supportedRecordTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_RECORD_LOG_CAPABILITIES__SUPPORTED_RECORD_TYPES:
				return getSupportedRecordTypes();
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
			case CimPackage.CIM_RECORD_LOG_CAPABILITIES__SUPPORTED_RECORD_TYPES:
				getSupportedRecordTypes().clear();
				getSupportedRecordTypes().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_RECORD_LOG_CAPABILITIES__SUPPORTED_RECORD_TYPES:
				getSupportedRecordTypes().clear();
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
			case CimPackage.CIM_RECORD_LOG_CAPABILITIES__SUPPORTED_RECORD_TYPES:
				return supportedRecordTypes != null && !supportedRecordTypes.isEmpty();
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
		result.append(" (SupportedRecordTypes: ");
		result.append(supportedRecordTypes);
		result.append(')');
		return result.toString();
	}

} //CIM_RecordLogCapabilitiesImpl

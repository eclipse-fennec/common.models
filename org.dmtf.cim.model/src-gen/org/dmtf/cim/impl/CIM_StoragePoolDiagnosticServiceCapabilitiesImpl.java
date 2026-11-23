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

import org.dmtf.cim.CIM_StoragePoolDiagnosticServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Pool Diagnostic Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolDiagnosticServiceCapabilitiesImpl#getSupportedDepths <em>Supported Depths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StoragePoolDiagnosticServiceCapabilitiesImpl extends CIM_DiagnosticServiceCapabilitiesImpl implements CIM_StoragePoolDiagnosticServiceCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedDepths() <em>Supported Depths</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedDepths()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedDepths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StoragePoolDiagnosticServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StoragePoolDiagnosticServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedDepths() {
		if (supportedDepths == null) {
			supportedDepths = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_DEPTHS);
		}
		return supportedDepths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_DEPTHS:
				return getSupportedDepths();
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
			case CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_DEPTHS:
				getSupportedDepths().clear();
				getSupportedDepths().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_DEPTHS:
				getSupportedDepths().clear();
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
			case CimPackage.CIM_STORAGE_POOL_DIAGNOSTIC_SERVICE_CAPABILITIES__SUPPORTED_DEPTHS:
				return supportedDepths != null && !supportedDepths.isEmpty();
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
		result.append(" (SupportedDepths: ");
		result.append(supportedDepths);
		result.append(')');
		return result.toString();
	}

} //CIM_StoragePoolDiagnosticServiceCapabilitiesImpl

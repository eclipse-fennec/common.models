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

import org.dmtf.cim.CIM_RedirectionServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Redirection Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RedirectionServiceCapabilitiesImpl#getSharingModeSupported <em>Sharing Mode Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RedirectionServiceCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_RedirectionServiceCapabilities {
	/**
	 * The cached value of the '{@link #getSharingModeSupported() <em>Sharing Mode Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharingModeSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> sharingModeSupported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RedirectionServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RedirectionServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSharingModeSupported() {
		if (sharingModeSupported == null) {
			sharingModeSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_REDIRECTION_SERVICE_CAPABILITIES__SHARING_MODE_SUPPORTED);
		}
		return sharingModeSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_REDIRECTION_SERVICE_CAPABILITIES__SHARING_MODE_SUPPORTED:
				return getSharingModeSupported();
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
			case CimPackage.CIM_REDIRECTION_SERVICE_CAPABILITIES__SHARING_MODE_SUPPORTED:
				getSharingModeSupported().clear();
				getSharingModeSupported().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_REDIRECTION_SERVICE_CAPABILITIES__SHARING_MODE_SUPPORTED:
				getSharingModeSupported().clear();
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
			case CimPackage.CIM_REDIRECTION_SERVICE_CAPABILITIES__SHARING_MODE_SUPPORTED:
				return sharingModeSupported != null && !sharingModeSupported.isEmpty();
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
		result.append(" (SharingModeSupported: ");
		result.append(sharingModeSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_RedirectionServiceCapabilitiesImpl

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

import org.dmtf.cim.CIM_DeviceSharingCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Device Sharing Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceSharingCapabilitiesImpl#getSupportedAccessModes <em>Supported Access Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceSharingCapabilitiesImpl#getOtherSupportedAccessModes <em>Other Supported Access Modes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DeviceSharingCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_DeviceSharingCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedAccessModes() <em>Supported Access Modes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAccessModes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAccessModes;

	/**
	 * The cached value of the '{@link #getOtherSupportedAccessModes() <em>Other Supported Access Modes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedAccessModes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedAccessModes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DeviceSharingCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DeviceSharingCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAccessModes() {
		if (supportedAccessModes == null) {
			supportedAccessModes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DEVICE_SHARING_CAPABILITIES__SUPPORTED_ACCESS_MODES);
		}
		return supportedAccessModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedAccessModes() {
		if (otherSupportedAccessModes == null) {
			otherSupportedAccessModes = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DEVICE_SHARING_CAPABILITIES__OTHER_SUPPORTED_ACCESS_MODES);
		}
		return otherSupportedAccessModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DEVICE_SHARING_CAPABILITIES__SUPPORTED_ACCESS_MODES:
				return getSupportedAccessModes();
			case CimPackage.CIM_DEVICE_SHARING_CAPABILITIES__OTHER_SUPPORTED_ACCESS_MODES:
				return getOtherSupportedAccessModes();
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
			case CimPackage.CIM_DEVICE_SHARING_CAPABILITIES__SUPPORTED_ACCESS_MODES:
				getSupportedAccessModes().clear();
				getSupportedAccessModes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DEVICE_SHARING_CAPABILITIES__OTHER_SUPPORTED_ACCESS_MODES:
				getOtherSupportedAccessModes().clear();
				getOtherSupportedAccessModes().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_DEVICE_SHARING_CAPABILITIES__SUPPORTED_ACCESS_MODES:
				getSupportedAccessModes().clear();
				return;
			case CimPackage.CIM_DEVICE_SHARING_CAPABILITIES__OTHER_SUPPORTED_ACCESS_MODES:
				getOtherSupportedAccessModes().clear();
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
			case CimPackage.CIM_DEVICE_SHARING_CAPABILITIES__SUPPORTED_ACCESS_MODES:
				return supportedAccessModes != null && !supportedAccessModes.isEmpty();
			case CimPackage.CIM_DEVICE_SHARING_CAPABILITIES__OTHER_SUPPORTED_ACCESS_MODES:
				return otherSupportedAccessModes != null && !otherSupportedAccessModes.isEmpty();
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
		result.append(" (SupportedAccessModes: ");
		result.append(supportedAccessModes);
		result.append(", OtherSupportedAccessModes: ");
		result.append(otherSupportedAccessModes);
		result.append(')');
		return result.toString();
	}

} //CIM_DeviceSharingCapabilitiesImpl

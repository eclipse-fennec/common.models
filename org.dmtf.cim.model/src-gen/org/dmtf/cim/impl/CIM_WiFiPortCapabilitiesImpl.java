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

import org.dmtf.cim.CIM_WiFiPortCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Wi Fi Port Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiPortCapabilitiesImpl#getSupportedPortTypes <em>Supported Port Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiPortCapabilitiesImpl#getOtherSupportedPortTypes <em>Other Supported Port Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_WiFiPortCapabilitiesImpl extends CIM_NetworkPortCapabilitiesImpl implements CIM_WiFiPortCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedPortTypes() <em>Supported Port Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedPortTypes;

	/**
	 * The cached value of the '{@link #getOtherSupportedPortTypes() <em>Other Supported Port Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedPortTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedPortTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_WiFiPortCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_WiFiPortCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedPortTypes() {
		if (supportedPortTypes == null) {
			supportedPortTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_WI_FI_PORT_CAPABILITIES__SUPPORTED_PORT_TYPES);
		}
		return supportedPortTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedPortTypes() {
		if (otherSupportedPortTypes == null) {
			otherSupportedPortTypes = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_WI_FI_PORT_CAPABILITIES__OTHER_SUPPORTED_PORT_TYPES);
		}
		return otherSupportedPortTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_WI_FI_PORT_CAPABILITIES__SUPPORTED_PORT_TYPES:
				return getSupportedPortTypes();
			case CimPackage.CIM_WI_FI_PORT_CAPABILITIES__OTHER_SUPPORTED_PORT_TYPES:
				return getOtherSupportedPortTypes();
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
			case CimPackage.CIM_WI_FI_PORT_CAPABILITIES__SUPPORTED_PORT_TYPES:
				getSupportedPortTypes().clear();
				getSupportedPortTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_WI_FI_PORT_CAPABILITIES__OTHER_SUPPORTED_PORT_TYPES:
				getOtherSupportedPortTypes().clear();
				getOtherSupportedPortTypes().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_WI_FI_PORT_CAPABILITIES__SUPPORTED_PORT_TYPES:
				getSupportedPortTypes().clear();
				return;
			case CimPackage.CIM_WI_FI_PORT_CAPABILITIES__OTHER_SUPPORTED_PORT_TYPES:
				getOtherSupportedPortTypes().clear();
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
			case CimPackage.CIM_WI_FI_PORT_CAPABILITIES__SUPPORTED_PORT_TYPES:
				return supportedPortTypes != null && !supportedPortTypes.isEmpty();
			case CimPackage.CIM_WI_FI_PORT_CAPABILITIES__OTHER_SUPPORTED_PORT_TYPES:
				return otherSupportedPortTypes != null && !otherSupportedPortTypes.isEmpty();
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
		result.append(" (SupportedPortTypes: ");
		result.append(supportedPortTypes);
		result.append(", OtherSupportedPortTypes: ");
		result.append(otherSupportedPortTypes);
		result.append(')');
		return result.toString();
	}

} //CIM_WiFiPortCapabilitiesImpl

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

import org.dmtf.cim.CIM_WiFiEndpointCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Wi Fi Endpoint Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointCapabilitiesImpl#getSupportedEncryptionMethods <em>Supported Encryption Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointCapabilitiesImpl#getOtherSupportedEncryptionMethods <em>Other Supported Encryption Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointCapabilitiesImpl#getSupportedAuthenticationMethods <em>Supported Authentication Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiEndpointCapabilitiesImpl#getOtherSupportedAuthenticationMethods <em>Other Supported Authentication Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_WiFiEndpointCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_WiFiEndpointCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedEncryptionMethods() <em>Supported Encryption Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedEncryptionMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedEncryptionMethods;

	/**
	 * The cached value of the '{@link #getOtherSupportedEncryptionMethods() <em>Other Supported Encryption Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedEncryptionMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedEncryptionMethods;

	/**
	 * The cached value of the '{@link #getSupportedAuthenticationMethods() <em>Supported Authentication Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAuthenticationMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAuthenticationMethods;

	/**
	 * The cached value of the '{@link #getOtherSupportedAuthenticationMethods() <em>Other Supported Authentication Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedAuthenticationMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedAuthenticationMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_WiFiEndpointCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_WiFiEndpointCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedEncryptionMethods() {
		if (supportedEncryptionMethods == null) {
			supportedEncryptionMethods = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__SUPPORTED_ENCRYPTION_METHODS);
		}
		return supportedEncryptionMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedEncryptionMethods() {
		if (otherSupportedEncryptionMethods == null) {
			otherSupportedEncryptionMethods = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__OTHER_SUPPORTED_ENCRYPTION_METHODS);
		}
		return otherSupportedEncryptionMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAuthenticationMethods() {
		if (supportedAuthenticationMethods == null) {
			supportedAuthenticationMethods = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__SUPPORTED_AUTHENTICATION_METHODS);
		}
		return supportedAuthenticationMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedAuthenticationMethods() {
		if (otherSupportedAuthenticationMethods == null) {
			otherSupportedAuthenticationMethods = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__OTHER_SUPPORTED_AUTHENTICATION_METHODS);
		}
		return otherSupportedAuthenticationMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__SUPPORTED_ENCRYPTION_METHODS:
				return getSupportedEncryptionMethods();
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__OTHER_SUPPORTED_ENCRYPTION_METHODS:
				return getOtherSupportedEncryptionMethods();
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__SUPPORTED_AUTHENTICATION_METHODS:
				return getSupportedAuthenticationMethods();
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__OTHER_SUPPORTED_AUTHENTICATION_METHODS:
				return getOtherSupportedAuthenticationMethods();
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
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__SUPPORTED_ENCRYPTION_METHODS:
				getSupportedEncryptionMethods().clear();
				getSupportedEncryptionMethods().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__OTHER_SUPPORTED_ENCRYPTION_METHODS:
				getOtherSupportedEncryptionMethods().clear();
				getOtherSupportedEncryptionMethods().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__SUPPORTED_AUTHENTICATION_METHODS:
				getSupportedAuthenticationMethods().clear();
				getSupportedAuthenticationMethods().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__OTHER_SUPPORTED_AUTHENTICATION_METHODS:
				getOtherSupportedAuthenticationMethods().clear();
				getOtherSupportedAuthenticationMethods().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__SUPPORTED_ENCRYPTION_METHODS:
				getSupportedEncryptionMethods().clear();
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__OTHER_SUPPORTED_ENCRYPTION_METHODS:
				getOtherSupportedEncryptionMethods().clear();
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__SUPPORTED_AUTHENTICATION_METHODS:
				getSupportedAuthenticationMethods().clear();
				return;
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__OTHER_SUPPORTED_AUTHENTICATION_METHODS:
				getOtherSupportedAuthenticationMethods().clear();
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
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__SUPPORTED_ENCRYPTION_METHODS:
				return supportedEncryptionMethods != null && !supportedEncryptionMethods.isEmpty();
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__OTHER_SUPPORTED_ENCRYPTION_METHODS:
				return otherSupportedEncryptionMethods != null && !otherSupportedEncryptionMethods.isEmpty();
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__SUPPORTED_AUTHENTICATION_METHODS:
				return supportedAuthenticationMethods != null && !supportedAuthenticationMethods.isEmpty();
			case CimPackage.CIM_WI_FI_ENDPOINT_CAPABILITIES__OTHER_SUPPORTED_AUTHENTICATION_METHODS:
				return otherSupportedAuthenticationMethods != null && !otherSupportedAuthenticationMethods.isEmpty();
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
		result.append(" (SupportedEncryptionMethods: ");
		result.append(supportedEncryptionMethods);
		result.append(", OtherSupportedEncryptionMethods: ");
		result.append(otherSupportedEncryptionMethods);
		result.append(", SupportedAuthenticationMethods: ");
		result.append(supportedAuthenticationMethods);
		result.append(", OtherSupportedAuthenticationMethods: ");
		result.append(otherSupportedAuthenticationMethods);
		result.append(')');
		return result.toString();
	}

} //CIM_WiFiEndpointCapabilitiesImpl

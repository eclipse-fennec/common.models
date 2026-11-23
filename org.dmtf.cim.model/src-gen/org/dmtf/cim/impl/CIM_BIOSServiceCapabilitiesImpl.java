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

import org.dmtf.cim.CIM_BIOSServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM BIOS Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSServiceCapabilitiesImpl#getMethodsSupported <em>Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSServiceCapabilitiesImpl#getSupportedPasswordAlgorithms <em>Supported Password Algorithms</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BIOSServiceCapabilitiesImpl#getSupportedPasswordEncodings <em>Supported Password Encodings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BIOSServiceCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_BIOSServiceCapabilities {
	/**
	 * The cached value of the '{@link #getMethodsSupported() <em>Methods Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> methodsSupported;

	/**
	 * The cached value of the '{@link #getSupportedPasswordAlgorithms() <em>Supported Password Algorithms</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedPasswordAlgorithms()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedPasswordAlgorithms;

	/**
	 * The cached value of the '{@link #getSupportedPasswordEncodings() <em>Supported Password Encodings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedPasswordEncodings()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> supportedPasswordEncodings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BIOSServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BIOSServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getMethodsSupported() {
		if (methodsSupported == null) {
			methodsSupported = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_BIOS_SERVICE_CAPABILITIES__METHODS_SUPPORTED);
		}
		return methodsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSupportedPasswordAlgorithms() {
		if (supportedPasswordAlgorithms == null) {
			supportedPasswordAlgorithms = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_BIOS_SERVICE_CAPABILITIES__SUPPORTED_PASSWORD_ALGORITHMS);
		}
		return supportedPasswordAlgorithms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getSupportedPasswordEncodings() {
		if (supportedPasswordEncodings == null) {
			supportedPasswordEncodings = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_BIOS_SERVICE_CAPABILITIES__SUPPORTED_PASSWORD_ENCODINGS);
		}
		return supportedPasswordEncodings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BIOS_SERVICE_CAPABILITIES__METHODS_SUPPORTED:
				return getMethodsSupported();
			case CimPackage.CIM_BIOS_SERVICE_CAPABILITIES__SUPPORTED_PASSWORD_ALGORITHMS:
				return getSupportedPasswordAlgorithms();
			case CimPackage.CIM_BIOS_SERVICE_CAPABILITIES__SUPPORTED_PASSWORD_ENCODINGS:
				return getSupportedPasswordEncodings();
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
			case CimPackage.CIM_BIOS_SERVICE_CAPABILITIES__METHODS_SUPPORTED:
				getMethodsSupported().clear();
				getMethodsSupported().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_BIOS_SERVICE_CAPABILITIES__SUPPORTED_PASSWORD_ALGORITHMS:
				getSupportedPasswordAlgorithms().clear();
				getSupportedPasswordAlgorithms().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_BIOS_SERVICE_CAPABILITIES__SUPPORTED_PASSWORD_ENCODINGS:
				getSupportedPasswordEncodings().clear();
				getSupportedPasswordEncodings().addAll((Collection<? extends Long>)newValue);
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
			case CimPackage.CIM_BIOS_SERVICE_CAPABILITIES__METHODS_SUPPORTED:
				getMethodsSupported().clear();
				return;
			case CimPackage.CIM_BIOS_SERVICE_CAPABILITIES__SUPPORTED_PASSWORD_ALGORITHMS:
				getSupportedPasswordAlgorithms().clear();
				return;
			case CimPackage.CIM_BIOS_SERVICE_CAPABILITIES__SUPPORTED_PASSWORD_ENCODINGS:
				getSupportedPasswordEncodings().clear();
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
			case CimPackage.CIM_BIOS_SERVICE_CAPABILITIES__METHODS_SUPPORTED:
				return methodsSupported != null && !methodsSupported.isEmpty();
			case CimPackage.CIM_BIOS_SERVICE_CAPABILITIES__SUPPORTED_PASSWORD_ALGORITHMS:
				return supportedPasswordAlgorithms != null && !supportedPasswordAlgorithms.isEmpty();
			case CimPackage.CIM_BIOS_SERVICE_CAPABILITIES__SUPPORTED_PASSWORD_ENCODINGS:
				return supportedPasswordEncodings != null && !supportedPasswordEncodings.isEmpty();
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
		result.append(" (MethodsSupported: ");
		result.append(methodsSupported);
		result.append(", SupportedPasswordAlgorithms: ");
		result.append(supportedPasswordAlgorithms);
		result.append(", SupportedPasswordEncodings: ");
		result.append(supportedPasswordEncodings);
		result.append(')');
		return result.toString();
	}

} //CIM_BIOSServiceCapabilitiesImpl

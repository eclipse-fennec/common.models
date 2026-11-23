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

import org.dmtf.cim.CIM_CertificateManagementCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Certificate Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CertificateManagementCapabilitiesImpl#getKeyAlgorithmSupported <em>Key Algorithm Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CertificateManagementCapabilitiesImpl#getInputFormatsSupported <em>Input Formats Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CertificateManagementCapabilitiesImpl#getOutputFormatsSupported <em>Output Formats Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CertificateManagementCapabilitiesImpl#getAsymmetricKeyGeneration <em>Asymmetric Key Generation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CertificateManagementCapabilitiesImpl#getSupportedSignatureAlgorithms <em>Supported Signature Algorithms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CertificateManagementCapabilitiesImpl extends CIM_CredentialManagementCapabilitiesImpl implements CIM_CertificateManagementCapabilities {
	/**
	 * The cached value of the '{@link #getKeyAlgorithmSupported() <em>Key Algorithm Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyAlgorithmSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> keyAlgorithmSupported;

	/**
	 * The cached value of the '{@link #getInputFormatsSupported() <em>Input Formats Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFormatsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> inputFormatsSupported;

	/**
	 * The cached value of the '{@link #getOutputFormatsSupported() <em>Output Formats Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormatsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> outputFormatsSupported;

	/**
	 * The default value of the '{@link #getAsymmetricKeyGeneration() <em>Asymmetric Key Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsymmetricKeyGeneration()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ASYMMETRIC_KEY_GENERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAsymmetricKeyGeneration() <em>Asymmetric Key Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsymmetricKeyGeneration()
	 * @generated
	 * @ordered
	 */
	protected Boolean asymmetricKeyGeneration = ASYMMETRIC_KEY_GENERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedSignatureAlgorithms() <em>Supported Signature Algorithms</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSignatureAlgorithms()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSignatureAlgorithms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CertificateManagementCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CertificateManagementCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getKeyAlgorithmSupported() {
		if (keyAlgorithmSupported == null) {
			keyAlgorithmSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__KEY_ALGORITHM_SUPPORTED);
		}
		return keyAlgorithmSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getInputFormatsSupported() {
		if (inputFormatsSupported == null) {
			inputFormatsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__INPUT_FORMATS_SUPPORTED);
		}
		return inputFormatsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getOutputFormatsSupported() {
		if (outputFormatsSupported == null) {
			outputFormatsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__OUTPUT_FORMATS_SUPPORTED);
		}
		return outputFormatsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAsymmetricKeyGeneration() {
		return asymmetricKeyGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsymmetricKeyGeneration(Boolean newAsymmetricKeyGeneration) {
		Boolean oldAsymmetricKeyGeneration = asymmetricKeyGeneration;
		asymmetricKeyGeneration = newAsymmetricKeyGeneration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__ASYMMETRIC_KEY_GENERATION, oldAsymmetricKeyGeneration, asymmetricKeyGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSignatureAlgorithms() {
		if (supportedSignatureAlgorithms == null) {
			supportedSignatureAlgorithms = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__SUPPORTED_SIGNATURE_ALGORITHMS);
		}
		return supportedSignatureAlgorithms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__KEY_ALGORITHM_SUPPORTED:
				return getKeyAlgorithmSupported();
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__INPUT_FORMATS_SUPPORTED:
				return getInputFormatsSupported();
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__OUTPUT_FORMATS_SUPPORTED:
				return getOutputFormatsSupported();
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__ASYMMETRIC_KEY_GENERATION:
				return getAsymmetricKeyGeneration();
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__SUPPORTED_SIGNATURE_ALGORITHMS:
				return getSupportedSignatureAlgorithms();
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
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__KEY_ALGORITHM_SUPPORTED:
				getKeyAlgorithmSupported().clear();
				getKeyAlgorithmSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__INPUT_FORMATS_SUPPORTED:
				getInputFormatsSupported().clear();
				getInputFormatsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__OUTPUT_FORMATS_SUPPORTED:
				getOutputFormatsSupported().clear();
				getOutputFormatsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__ASYMMETRIC_KEY_GENERATION:
				setAsymmetricKeyGeneration((Boolean)newValue);
				return;
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__SUPPORTED_SIGNATURE_ALGORITHMS:
				getSupportedSignatureAlgorithms().clear();
				getSupportedSignatureAlgorithms().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__KEY_ALGORITHM_SUPPORTED:
				getKeyAlgorithmSupported().clear();
				return;
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__INPUT_FORMATS_SUPPORTED:
				getInputFormatsSupported().clear();
				return;
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__OUTPUT_FORMATS_SUPPORTED:
				getOutputFormatsSupported().clear();
				return;
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__ASYMMETRIC_KEY_GENERATION:
				setAsymmetricKeyGeneration(ASYMMETRIC_KEY_GENERATION_EDEFAULT);
				return;
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__SUPPORTED_SIGNATURE_ALGORITHMS:
				getSupportedSignatureAlgorithms().clear();
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
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__KEY_ALGORITHM_SUPPORTED:
				return keyAlgorithmSupported != null && !keyAlgorithmSupported.isEmpty();
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__INPUT_FORMATS_SUPPORTED:
				return inputFormatsSupported != null && !inputFormatsSupported.isEmpty();
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__OUTPUT_FORMATS_SUPPORTED:
				return outputFormatsSupported != null && !outputFormatsSupported.isEmpty();
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__ASYMMETRIC_KEY_GENERATION:
				return ASYMMETRIC_KEY_GENERATION_EDEFAULT == null ? asymmetricKeyGeneration != null : !ASYMMETRIC_KEY_GENERATION_EDEFAULT.equals(asymmetricKeyGeneration);
			case CimPackage.CIM_CERTIFICATE_MANAGEMENT_CAPABILITIES__SUPPORTED_SIGNATURE_ALGORITHMS:
				return supportedSignatureAlgorithms != null && !supportedSignatureAlgorithms.isEmpty();
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
		result.append(" (KeyAlgorithmSupported: ");
		result.append(keyAlgorithmSupported);
		result.append(", InputFormatsSupported: ");
		result.append(inputFormatsSupported);
		result.append(", OutputFormatsSupported: ");
		result.append(outputFormatsSupported);
		result.append(", AsymmetricKeyGeneration: ");
		result.append(asymmetricKeyGeneration);
		result.append(", SupportedSignatureAlgorithms: ");
		result.append(supportedSignatureAlgorithms);
		result.append(')');
		return result.toString();
	}

} //CIM_CertificateManagementCapabilitiesImpl

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
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Certificate Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_CertificateManagementCapabilities describes the capabilities of the associated CIM_CertificateManagementService instance(s).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CertificateManagementCapabilities#getKeyAlgorithmSupported <em>Key Algorithm Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CertificateManagementCapabilities#getInputFormatsSupported <em>Input Formats Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CertificateManagementCapabilities#getOutputFormatsSupported <em>Output Formats Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CertificateManagementCapabilities#getAsymmetricKeyGeneration <em>Asymmetric Key Generation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CertificateManagementCapabilities#getSupportedSignatureAlgorithms <em>Supported Signature Algorithms</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CertificateManagementCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' UMLPackagePath='CIM::User::SecurityServices' override.SupportedMethods='uint16[]' override.SupportedMethods.Description='Each enumeration corresponds to support for the like-named method of the associated CIM_CertificateManagementService instance(s) for the exception of \"DeleteCredentialInstance\" that refers to the capability of executing delete operation on the instances of the CIM_Credential subclasses.' override.SupportedMethods.ValueMap='[\"2\",\"3\",\"4\",\"101\",\"102\",\"103\",\"104\",\"105\",\"106\",\"107\",\"..\",\"0x8000..\"]' override.SupportedMethods.Values='[\"ImportPublicPrivateKeyPair\",\"CreateKeystore\",\"DeleteCredentialInstance\",\"CreatCertificateSigningRequest\",\"CreateSelfSignedCertificate\",\"ImportEncodedCertificates\",\"ImportCertificates\",\"ExportEncodedCertificate\",\"ApplyCRL\",\"ApplyDecodedCRL\",\"DMTF Reserved\",\"Vendor Specific\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_CertificateManagementCapabilities extends CIM_CredentialManagementCapabilities {
	/**
	 * Returns the value of the '<em><b>Key Algorithm Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the AsymmetricKeyGeneration is TRUE, this property specifies the possible key algorithms that are supported by the methods that generate public/private key pairs in the associated CIM_CertificateManagementService instance(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Algorithm Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CertificateManagementCapabilities_KeyAlgorithmSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"RSA\",\"DSA\",\"ECDSA\",\"DMTF Rserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getKeyAlgorithmSupported();

	/**
	 * Returns the value of the '<em><b>Input Formats Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputFormatsSupported represents the supported input formats for the certificate(s) and Certificate Revocation List by the methods in the associated CIM_CertificateManagementService instance(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Formats Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CertificateManagementCapabilities_InputFormatsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"DER\",\"PEM\",\"PKCS7\",\"PKCS12\",\"DMTF Rserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getInputFormatsSupported();

	/**
	 * Returns the value of the '<em><b>Output Formats Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OutputFormatsSupported represents the supported output formats for the certificate(s) and Certificate Revocation List by the methods in the associated CIM_CertificateManagementService instance(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Formats Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CertificateManagementCapabilities_OutputFormatsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"DER\",\"PEM\",\"PKCS7\",\"PKCS12\",\"DMTF Rserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getOutputFormatsSupported();

	/**
	 * Returns the value of the '<em><b>Asymmetric Key Generation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AsymmetricKeyGeneration property represents the capability of the instrumentation to generate asymmetric public/private key pair.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asymmetric Key Generation</em>' attribute.
	 * @see #setAsymmetricKeyGeneration(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CertificateManagementCapabilities_AsymmetricKeyGeneration()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAsymmetricKeyGeneration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CertificateManagementCapabilities#getAsymmetricKeyGeneration <em>Asymmetric Key Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asymmetric Key Generation</em>' attribute.
	 * @see #getAsymmetricKeyGeneration()
	 * @generated
	 */
	void setAsymmetricKeyGeneration(Boolean value);

	/**
	 * Returns the value of the '<em><b>Supported Signature Algorithms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SupportedSignatureAlgorithms represents the supported signature algorithms for the certificate(s) and Certificate Revocation List by the methods in the associated CIM_CertificateManagementService instance(s). This property covers the algorithms specified in the RFC3279.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Signature Algorithms</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CertificateManagementCapabilities_SupportedSignatureAlgorithms()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"1920..32767\",\"32768..65535\"]' Values='[\"Other\",\"SHA1withDSA\",\"SHA1withECDSA\",\"SHA224withECDSA\",\"SHA256withECDSA\",\"SHA384withECDSA\",\"SHA512withECDSA\",\"GOST3411withGOST3410\",\"GOST3411withECGOST3410\",\"MD2withRSA\",\"MD5withRSA\",\"SHA1withRSA\",\"SHA224withRSA\",\"SHA256withRSA\",\"SHA384withRSA\",\"SHA512withRSA\",\"RIPEMD160withRSA\",\"RIPEMD128withRSA\",\"RIPEMD256withRSA\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSignatureAlgorithms();

} // CIM_CertificateManagementCapabilities

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
 * A representation of the model object '<em><b>CIM X509 Infrastructure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_X509Infrastructure describes Internet X509 Public Key Infrastructure (PKI) standard based properties used by certificates and certificate revocation lists. For more information on the Internet X509 PKI refer to the RFC 3280.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_X509Infrastructure#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Infrastructure#getTBSCertificate <em>TBS Certificate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Infrastructure#getMD5Fingerprint <em>MD5 Fingerprint</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Infrastructure#getSHA1Fingerprint <em>SHA1 Fingerprint</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Infrastructure#getFingerprintDigestAlgorithms <em>Fingerprint Digest Algorithms</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Infrastructure#getFingerprints <em>Fingerprints</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_X509Infrastructure()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' ClassConstraint='[\"/* The constraints below aim to efficiently \052/  /* represent a singular OctetString. Each of the properties\052/  /* is a single encoded string, thus only the first element \052/  /* needs to be populated. \052/ inv:self.TBSCertificate-&gt;size()&lt;=1\"]' UMLPackagePath='CIM::User::PublicKey' override.IssuerName='string' override.IssuerName.Description='Issuer represents the information about the issuer of the CRL. The Issuer property shall contain information as required by section 4.1.2.4 of RFC 3280 and shall be formatted based on RFC 4514. An example of the value of the Subject parameter could be \"CN=Marshall T. Rose, O=Dover Beach Consulting, OU=Sales, L=Santa Clara, ST=California, C=US\".' override.IssuerName.DN='true' override.IssuerName.MappingStrings='[\"RFC3280.IETF|Section 4.1.2.4\",\"RFC3280.IETF|Section 5.1.2.3\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_X509Infrastructure extends CIM_SignedCredential {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of X.509.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Infrastructure_Version()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"v1\",\"v2\",\"v3\",\"DMTF Reserved\",\"Vendor Specified\"]' MappingStrings='[\"RFC3280.IETF|Section 4.1.2.1\",\"RFC3280.IETF|Section 5.1.2.1\"]'"
	 * @generated
	 */
	Integer getVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_X509Infrastructure#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>TBS Certificate</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The To Be Signed (TBS) certificate is used as an input data to the signature algorithm when the certificate is signed or verified. Only the first element of the array property shall be populated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TBS Certificate</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Infrastructure_TBSCertificate()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true' MappingStrings='[\"RFC3280.IETF|Section 4.1.2\",\"RFC3280.IETF|Section 5.1.2\"]'"
	 * @generated
	 */
	EList<String> getTBSCertificate();

	/**
	 * Returns the value of the '<em><b>MD5 Fingerprint</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Digital signature algorithm that verifies data integrity by creating a 128-bit message digest or fingerprint. The fingerprint is unique to the input data and contains the binary hash of the encoded X509 object such as encoded certificate or CRL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MD5 Fingerprint</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Infrastructure_MD5Fingerprint()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getMD5Fingerprint();

	/**
	 * Returns the value of the '<em><b>SHA1 Fingerprint</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secure hashing algorithm, a cryptographic message digest algorithm used to verify data integrity by making replication of the fingerprint. The fingerprint is unique to the input data and contains the binary hash of the encoded X509 object such as encoded certificate or CRL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SHA1 Fingerprint</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Infrastructure_SHA1Fingerprint()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getSHA1Fingerprint();

	/**
	 * Returns the value of the '<em><b>Fingerprint Digest Algorithms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The algorithm used for hashing the encoded X509 certificate's or CRL's message digest represented in the corresponding element of the FingerPrint array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fingerprint Digest Algorithms</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Infrastructure_FingerprintDigestAlgorithms()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"MD5\",\"SHA1\",\"DMTF Reserved\",\"Vendor Specified\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_X509Infrastructure.Fingerprints\"]'"
	 * @generated
	 */
	EList<Integer> getFingerprintDigestAlgorithms();

	/**
	 * Returns the value of the '<em><b>Fingerprints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fingerprints property represents the message digests of the encoded X509 certificate or CRL that uniquely identify it and can be used for the integrity verification of the X509 certificate or CRL. Fingerprint is the hash of the encoded X509 certificate or CRL that is based on the algorithm described in the corresponding element of the FingerprintDigestAlgorithms array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fingerprints</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Infrastructure_Fingerprints()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_X509Infrastructure.FingerprintDigestAlgorithms\"]'"
	 * @generated
	 */
	EList<String> getFingerprints();

} // CIM_X509Infrastructure

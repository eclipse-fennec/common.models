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
 * A representation of the model object '<em><b>CIM X509 Certificate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_X509Certificate describes Internet X509 Public Key Infrastructure (PKI) standard based certificates. The certificates are signed by a trusted Certificate Authority (CA) or by the owner of the certificate and issued to an authenticated entity (e.g., human user, service, etc.) called the Subject in the certificate. The public key in the certificate is cryptographically related to a private key that is held and kept private by the authenticated Subject. The certificate and its related private key can then be used for establishing trust relationships and securing communications with the Subject. Refer to the Internet X.509 PKI standard (RFC 3280) for more information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getAltSubject <em>Alt Subject</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getPublicKeySize <em>Public Key Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getIsValid <em>Is Valid</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getPublicKeyAlgorithm <em>Public Key Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getKeyUsage <em>Key Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getExtendedKeyUsage <em>Extended Key Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getPathLengthConstraint <em>Path Length Constraint</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getEncodedCertificate <em>Encoded Certificate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getExtensionID <em>Extension ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getExtensionValue <em>Extension Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getIsCritical <em>Is Critical</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getIssuerUniqueID <em>Issuer Unique ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getSubjectUniqueID <em>Subject Unique ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_X509Certificate#getTrustedRootCertificate <em>Trusted Root Certificate</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' ClassConstraint='[\"/* The constraints below aim to efficiently \052/ /* represent a singular OctetString. Each of the properties\052/  /* is a single encoded stringthus only the first element \052/  /* needs to be populated. \052/ inv:self.PublicKey-&gt;size()&lt;=1 and self.SerialNumber-&gt;size()&lt;=1 and self.EncodedCertificate-&gt;size()&lt;=1\"]' UMLPackagePath='CIM::User::PublicKey' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_X509Certificate extends CIM_X509Infrastructure {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distinguished name identifying the subject of the certificate.Subject shall contain information as required by section 4.1.2.6 of RFC 3280 and shall be formatted based on RFC 4514.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_Subject()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' DN='true' MappingStrings='[\"RFC3280.IETF|Section 4.1.2.6\"]'"
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_X509Certificate#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Alt Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Alternate subject identifier for the Certificate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alt Subject</em>' attribute.
	 * @see #setAltSubject(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_AltSubject()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"RFC3280.IETF|Section 4.2.1.7\"]'"
	 * @generated
	 */
	String getAltSubject();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_X509Certificate#getAltSubject <em>Alt Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt Subject</em>' attribute.
	 * @see #getAltSubject()
	 * @generated
	 */
	void setAltSubject(String value);

	/**
	 * Returns the value of the '<em><b>Public Key</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DER-encoded raw public key that belongs to the subject the certificate vouches for.Only the first element of PublicKey array property shall be populated with DER encoded raw public key octet string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Key</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_PublicKey()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true' MappingStrings='[\"RFC3280.IETF|Section 4.1.2.7\"]'"
	 * @generated
	 */
	EList<String> getPublicKey();

	/**
	 * Returns the value of the '<em><b>Public Key Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The length of the public key represented in the PublicKey property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Key Size</em>' attribute.
	 * @see #setPublicKeySize(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_PublicKeySize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"RFC3280.IETF|Section 4.1.2.7\"]'"
	 * @generated
	 */
	Integer getPublicKeySize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_X509Certificate#getPublicKeySize <em>Public Key Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Key Size</em>' attribute.
	 * @see #getPublicKeySize()
	 * @generated
	 */
	void setPublicKeySize(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IsValid represents whether the certificate is currently valid. When the certificate is revoked or expired or put on hold or invalidated for any reason IsValid shall be set to FALSE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Valid</em>' attribute.
	 * @see #setIsValid(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_IsValid()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsValid();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_X509Certificate#getIsValid <em>Is Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Valid</em>' attribute.
	 * @see #getIsValid()
	 * @generated
	 */
	void setIsValid(Boolean value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique number that identifies this certificate.Only the first element of the array property shall be populated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_SerialNumber()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true' MappingStrings='[\"RFC3280.IETF|Section 4.1.2.2\"]'"
	 * @generated
	 */
	EList<String> getSerialNumber();

	/**
	 * Returns the value of the '<em><b>Public Key Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Public key algorithm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Key Algorithm</em>' attribute.
	 * @see #setPublicKeyAlgorithm(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_PublicKeyAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"RSA\",\"DSA\",\"ECDSA\",\"DMTF Reserved\",\"Vendor Specified\"]' MappingStrings='[\"RFC3280.IETF|Section 4.1.2.7\"]'"
	 * @generated
	 */
	Integer getPublicKeyAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_X509Certificate#getPublicKeyAlgorithm <em>Public Key Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Key Algorithm</em>' attribute.
	 * @see #getPublicKeyAlgorithm()
	 * @generated
	 */
	void setPublicKeyAlgorithm(Integer value);

	/**
	 * Returns the value of the '<em><b>Key Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Key usage defines the purpose of the key. Key usage could include digital signing, key agreement, certificate signing, and more. The key usage is an extension to the X.509 specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_KeyUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Digital Signature\",\"Non Repudiation\",\"Key Encipherment\",\"Data Encipherment\",\"Key Agreement\",\"Key Certificate Signature\",\"DMTF Reserved\",\"Vendor Specified\"]' MappingStrings='[\"RFC3280.IETF|Section 4.2.1.3\"]'"
	 * @generated
	 */
	EList<Integer> getKeyUsage();

	/**
	 * Returns the value of the '<em><b>Extended Key Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This extension indicates one or more purposes for which the certified public key may be used, in addition to or in place of the basic purposes indicated in the key usage extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Key Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_ExtendedKeyUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MappingStrings='[\"RFC3280.IETF|Section 4.2.1.13\"]'"
	 * @generated
	 */
	EList<String> getExtendedKeyUsage();

	/**
	 * Returns the value of the '<em><b>Path Length Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An X.509 certificate may contain an optional extension that identifies whether the subject of the certificate is a certificate authority (CA). If the subject is a CA, this property defines the number of certificates that may follow this certificate in a certification chain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Length Constraint</em>' attribute.
	 * @see #setPathLengthConstraint(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_PathLengthConstraint()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"RFC3280.IETF|Section 4.2.1.10\"]'"
	 * @generated
	 */
	Integer getPathLengthConstraint();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_X509Certificate#getPathLengthConstraint <em>Path Length Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Length Constraint</em>' attribute.
	 * @see #getPathLengthConstraint()
	 * @generated
	 */
	void setPathLengthConstraint(Integer value);

	/**
	 * Returns the value of the '<em><b>Encoded Certificate</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full content of the certificate in binary form.Only the first element of the array property shall be populated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoded Certificate</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_EncodedCertificate()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true' MappingStrings='[\"RFC3280.IETF|Section 4\"]'"
	 * @generated
	 */
	EList<String> getEncodedCertificate();

	/**
	 * Returns the value of the '<em><b>Extension ID</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extension identifier array for additional attributes associated with the certificate. The corresponding array element in the IsCritical property denotes whether the extension is critical. The corresponding array element in the ExtensionValue property contains the value of the extension attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension ID</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_ExtensionID()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"RFC3280.IETF|Section 4.1.2.9\",\"RFC3280.IETF|Section 4.2\"]' ModelCorrespondence='[\"CIM_X509Certificate.IsCritical\",\"CIM_X509Certificate.ExtensionValue\"]'"
	 * @generated
	 */
	EList<String> getExtensionID();

	/**
	 * Returns the value of the '<em><b>Extension Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Certificate extension attribute value array. The corresponding array element in the ExtensionID property contains the identifier of the certificate extension attribute. The corresponding array element in the IsCritical property denotes whether the extension is critical.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension Value</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_ExtensionValue()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"RFC3280.IETF|Section 4.1.2.9\",\"RFC3280.IETF|Section 4.2\"]' ModelCorrespondence='[\"CIM_X509Certificate.IsCritical\",\"CIM_X509Certificate.ExtensionID\"]'"
	 * @generated
	 */
	EList<String> getExtensionValue();

	/**
	 * Returns the value of the '<em><b>Is Critical</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TRUE value represents that the extension attribute is critical. The corresponding array element in the ExtensionID property contains the identifier of the extension attribute. The corresponding array element in the ExtensionValue property contains the value of the extension attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Critical</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_IsCritical()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' ArrayType='Indexed' MappingStrings='[\"RFC3280.IETF|Section 4.1.2.9\",\"RFC3280.IETF|Section 4.2\"]' ModelCorrespondence='[\"CIM_X509Certificate.ExtensionID\",\"CIM_X509Certificate.ExtensionValue\"]'"
	 * @generated
	 */
	EList<Boolean> getIsCritical();

	/**
	 * Returns the value of the '<em><b>Issuer Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String that identifies the issuer of the certificate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer Unique ID</em>' attribute.
	 * @see #setIssuerUniqueID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_IssuerUniqueID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"RFC3280.IETF|Section 4.1.2.8\"]'"
	 * @generated
	 */
	String getIssuerUniqueID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_X509Certificate#getIssuerUniqueID <em>Issuer Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Unique ID</em>' attribute.
	 * @see #getIssuerUniqueID()
	 * @generated
	 */
	void setIssuerUniqueID(String value);

	/**
	 * Returns the value of the '<em><b>Subject Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Certificate's unique subject identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Unique ID</em>' attribute.
	 * @see #setSubjectUniqueID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_SubjectUniqueID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"RFC3280.IETF|Section 4.1.2.8\"]'"
	 * @generated
	 */
	String getSubjectUniqueID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_X509Certificate#getSubjectUniqueID <em>Subject Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Unique ID</em>' attribute.
	 * @see #getSubjectUniqueID()
	 * @generated
	 */
	void setSubjectUniqueID(String value);

	/**
	 * Returns the value of the '<em><b>Trusted Root Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TRUE value represents that the certificate is a trusted root certificate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trusted Root Certificate</em>' attribute.
	 * @see #setTrustedRootCertificate(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_X509Certificate_TrustedRootCertificate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getTrustedRootCertificate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_X509Certificate#getTrustedRootCertificate <em>Trusted Root Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trusted Root Certificate</em>' attribute.
	 * @see #getTrustedRootCertificate()
	 * @generated
	 */
	void setTrustedRootCertificate(Boolean value);

} // CIM_X509Certificate

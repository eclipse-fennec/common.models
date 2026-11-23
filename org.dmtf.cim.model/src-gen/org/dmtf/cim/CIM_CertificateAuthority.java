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
 * A representation of the model object '<em><b>CIM Certificate Authority</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Certificate Authority (CA) is a credential management service that issues and cryptographically signs certificates. It acts as an trusted third-party intermediary in establishing trust relationships. The CA authenticates the identity of the holder of the 'private' key, related to the certificate's 'public' key.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CertificateAuthority#getCAPolicyStatement <em>CA Policy Statement</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CertificateAuthority#getCRL <em>CRL</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CertificateAuthority#getCRLDistributionPoint <em>CRL Distribution Point</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CertificateAuthority#getCADistinguishedName <em>CA Distinguished Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CertificateAuthority#getCRLRefreshFrequency <em>CRL Refresh Frequency</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CertificateAuthority#getMaxChainLength <em>Max Chain Length</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CertificateAuthority()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::User::PublicKey' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_CertificateAuthority extends CIM_CredentialManagementService {
	/**
	 * Returns the value of the '<em><b>CA Policy Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CAPolicyStatement describes what care is taken by the CertificateAuthority when signing a new certificate. The CAPolicyStatment may be a dot-delimited ASN.1 OID string which identifies to the formal policy statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CA Policy Statement</em>' attribute.
	 * @see #setCAPolicyStatement(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CertificateAuthority_CAPolicyStatement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCAPolicyStatement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CertificateAuthority#getCAPolicyStatement <em>CA Policy Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CA Policy Statement</em>' attribute.
	 * @see #getCAPolicyStatement()
	 * @generated
	 */
	void setCAPolicyStatement(String value);

	/**
	 * Returns the value of the '<em><b>CRL</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A CRL, or CertificateRevocationList, is a list of certificates which the CertificateAuthority has revoked and which are not yet expired. Revocation is necessary when the private key associated with the public key of a certificate is lost or compromised, or when the person for whom the certificate is signed no longer is entitled to use the certificate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CRL</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CertificateAuthority_CRL()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getCRL();

	/**
	 * Returns the value of the '<em><b>CRL Distribution Point</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Certificate revocation lists may be available from a number of distribution points. CRLDistributionPoint array values provide URIs for those distribution points.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CRL Distribution Point</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CertificateAuthority_CRLDistributionPoint()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getCRLDistributionPoint();

	/**
	 * Returns the value of the '<em><b>CA Distinguished Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Certificates refer to their issuing CA by its Distinguished Name (as defined in X.501).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CA Distinguished Name</em>' attribute.
	 * @see #setCADistinguishedName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CertificateAuthority_CADistinguishedName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' DN='true'"
	 * @generated
	 */
	String getCADistinguishedName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CertificateAuthority#getCADistinguishedName <em>CA Distinguished Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CA Distinguished Name</em>' attribute.
	 * @see #getCADistinguishedName()
	 * @generated
	 */
	void setCADistinguishedName(String value);

	/**
	 * Returns the value of the '<em><b>CRL Refresh Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frequency, expressed in hours, at which the CA will update its Certificate Revocation List. Zero implies that the refresh frequency is unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CRL Refresh Frequency</em>' attribute.
	 * @see #setCRLRefreshFrequency(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CertificateAuthority_CRLRefreshFrequency()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Units='Hours' PUnit='hour'"
	 * @generated
	 */
	Integer getCRLRefreshFrequency();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CertificateAuthority#getCRLRefreshFrequency <em>CRL Refresh Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CRL Refresh Frequency</em>' attribute.
	 * @see #getCRLRefreshFrequency()
	 * @generated
	 */
	void setCRLRefreshFrequency(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Chain Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of certificates in a certificate chain permitted for credentials issued by this certificate authority or it's subordinate CAs. 
	 * The MaxChainLength of a superior CA in the trust hierarchy should be greater than this value and the MaxChainLength of a subordinate CA in the trust hierarchy should be less than this value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Chain Length</em>' attribute.
	 * @see #setMaxChainLength(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CertificateAuthority_MaxChainLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getMaxChainLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CertificateAuthority#getMaxChainLength <em>Max Chain Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Chain Length</em>' attribute.
	 * @see #getMaxChainLength()
	 * @generated
	 */
	void setMaxChainLength(Integer value);

} // CIM_CertificateAuthority

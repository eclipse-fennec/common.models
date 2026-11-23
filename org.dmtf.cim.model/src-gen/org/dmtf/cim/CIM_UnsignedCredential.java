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
 * A representation of the model object '<em><b>CIM Unsigned Credential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A UnsignedCredential represents an unsigned public key credential. Services accept the public key as authentic because of a direct trust relationship, rather than via a third-party Certificate Authority.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UnsignedCredential#getPeerIdentity <em>Peer Identity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnsignedCredential#getPeerIdentityType <em>Peer Identity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnsignedCredential#getPublicKey <em>Public Key</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnsignedCredential#getPublicKeyEncoding <em>Public Key Encoding</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnsignedCredential#getOtherPublicKeyEncoding <em>Other Public Key Encoding</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UnsignedCredential()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' UMLPackagePath='CIM::User::PublicKey' override.InstanceID='string' override.InstanceID.Key='true' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_UnsignedCredential extends CIM_Credential {
	/**
	 * Returns the value of the '<em><b>Peer Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Identity of the Peer with whom a direct trust relationship exists. The public key may be used for security functions with the Peer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peer Identity</em>' attribute.
	 * @see #setPeerIdentity(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnsignedCredential_PeerIdentity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' ModelCorrespondence='[\"CIM_UnsignedCredential.PeerIdentityType\"]'"
	 * @generated
	 */
	String getPeerIdentity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnsignedCredential#getPeerIdentity <em>Peer Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peer Identity</em>' attribute.
	 * @see #getPeerIdentity()
	 * @generated
	 */
	void setPeerIdentity(String value);

	/**
	 * Returns the value of the '<em><b>Peer Identity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PeerIdentityType is used to describe the type of the PeerIdentity. The currently defined values are used for IKE identities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peer Identity Type</em>' attribute.
	 * @see #setPeerIdentityType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnsignedCredential_PeerIdentityType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"Other\",\"IPV4_ADDR\",\"FQDN\",\"USER_FQDN\",\"IPV4_ADDR_SUBNET\",\"IPV6_ADDR\",\"IPV6_ADDR_SUBNET\",\"IPV4_ADDR_RANGE\",\"IPV6_ADDR_RANGE\",\"DER_ASN1_DN\",\"DER_ASN1_GN\",\"KEY_ID\"]' ModelCorrespondence='[\"CIM_UnsignedCredential.PeerIdentity\"]'"
	 * @generated
	 */
	Integer getPeerIdentityType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnsignedCredential#getPeerIdentityType <em>Peer Identity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peer Identity Type</em>' attribute.
	 * @see #getPeerIdentityType()
	 * @generated
	 */
	void setPeerIdentityType(Integer value);

	/**
	 * Returns the value of the '<em><b>Public Key</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The public key, encoded as indicated by PublicKeyEncoding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Key</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_UnsignedCredential_PublicKey()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true' ModelCorrespondence='[\"CIM_UnsignedCredential.OtherPublicKeyEncoding\",\"CIM_UnsignedCredential.PublicKeyEncoding\"]'"
	 * @generated
	 */
	EList<String> getPublicKey();

	/**
	 * Returns the value of the '<em><b>Public Key Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration defining the encoding in PublicKey.
	 * ASN.1 DER: encoded according to the Abstract Syntax Notation One (ASN.1) Distinguished Encoding Rules (DER), defined in the ITU-T X.680 series of standards.
	 * SSH mpint: encoded according to the mpint format defined in IETF RFC4251 for representation of multiple-precision integers in SSH and other network protocols.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Key Encoding</em>' attribute.
	 * @see #setPublicKeyEncoding(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnsignedCredential_PublicKeyEncoding()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\"]' Values='[\"Unknown\",\"Other\",\"ASN.1 DER\",\"SSH mpint\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_UnsignedCredential.PublicKey\",\"CIM_UnsignedCredential.OtherPublicKeyEncoding\"]'"
	 * @generated
	 */
	Integer getPublicKeyEncoding();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnsignedCredential#getPublicKeyEncoding <em>Public Key Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Key Encoding</em>' attribute.
	 * @see #getPublicKeyEncoding()
	 * @generated
	 */
	void setPublicKeyEncoding(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Public Key Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the encoding of PublicKey when PublicKeyEncoding is set to 1 ("Other"). This property shall be set to null when PublicKeyEncoding is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Public Key Encoding</em>' attribute.
	 * @see #setOtherPublicKeyEncoding(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnsignedCredential_OtherPublicKeyEncoding()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_UnsignedCredential.PublicKeyEncoding\",\"CIM_UnsignedCredential.PublicKey\"]'"
	 * @generated
	 */
	String getOtherPublicKeyEncoding();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnsignedCredential#getOtherPublicKeyEncoding <em>Other Public Key Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Public Key Encoding</em>' attribute.
	 * @see #getOtherPublicKeyEncoding()
	 * @generated
	 */
	void setOtherPublicKeyEncoding(String value);

} // CIM_UnsignedCredential

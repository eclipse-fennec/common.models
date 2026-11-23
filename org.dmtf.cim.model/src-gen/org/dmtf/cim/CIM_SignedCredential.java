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
 * A representation of the model object '<em><b>CIM Signed Credential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SignedCredential is a credential that is cryptographically signed by a trusted Certificate Authority (CA) or the owner of the credential itself.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SignedCredential#getIssuerName <em>Issuer Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SignedCredential#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SignedCredential#getSignatureAlgorithm <em>Signature Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SignedCredential#getOtherSignatureAlgorithm <em>Other Signature Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SignedCredential#getSignatureAlgorithmOID <em>Signature Algorithm OID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SignedCredential()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' UMLPackagePath='CIM::User::PublicKey' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the organizational entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SignedCredential extends CIM_Credential {
	/**
	 * Returns the value of the '<em><b>Issuer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issuer name who signed the credential.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issuer Name</em>' attribute.
	 * @see #setIssuerName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SignedCredential_IssuerName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getIssuerName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SignedCredential#getIssuerName <em>Issuer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer Name</em>' attribute.
	 * @see #getIssuerName()
	 * @generated
	 */
	void setIssuerName(String value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Certificate authority's or credential owner's identifying digest that confers validity on a signed credential.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SignedCredential_Signature()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' Octetstring='true'"
	 * @generated
	 */
	EList<Integer> getSignature();

	/**
	 * Returns the value of the '<em><b>Signature Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Algorithm used to generate the signature. The algorithms specified are described in RFC3279. If the value of this property is 1, "Other", then the OtherSignatureAlgorithm shall be non NULL, non blank string
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature Algorithm</em>' attribute.
	 * @see #setSignatureAlgorithm(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SignedCredential_SignatureAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20..32767\",\"32768..65535\"]' Values='[\"Other\",\"SHA1withDSA\",\"SHA1withECDSA\",\"SHA224withECDSA\",\"SHA256withECDSA\",\"SHA384withECDSA\",\"SHA512withECDSA\",\"GOST3411withGOST3410\",\"GOST3411withECGOST3410\",\"MD2withRSA\",\"MD5withRSA\",\"SHA1withRSA\",\"SHA224withRSA\",\"SHA256withRSA\",\"SHA384withRSA\",\"SHA512withRSA\",\"RIPEMD160withRSA\",\"RIPEMD128withRSA\",\"RIPEMD256withRSA\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getSignatureAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SignedCredential#getSignatureAlgorithm <em>Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Algorithm</em>' attribute.
	 * @see #getSignatureAlgorithm()
	 * @generated
	 */
	void setSignatureAlgorithm(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Signature Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the signature algorithm when the SignatureAlgorithm property has the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Signature Algorithm</em>' attribute.
	 * @see #setOtherSignatureAlgorithm(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SignedCredential_OtherSignatureAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOtherSignatureAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SignedCredential#getOtherSignatureAlgorithm <em>Other Signature Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Signature Algorithm</em>' attribute.
	 * @see #getOtherSignatureAlgorithm()
	 * @generated
	 */
	void setOtherSignatureAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Signature Algorithm OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Object ID of the signature algorithm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature Algorithm OID</em>' attribute.
	 * @see #setSignatureAlgorithmOID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SignedCredential_SignatureAlgorithmOID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSignatureAlgorithmOID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SignedCredential#getSignatureAlgorithmOID <em>Signature Algorithm OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature Algorithm OID</em>' attribute.
	 * @see #getSignatureAlgorithmOID()
	 * @generated
	 */
	void setSignatureAlgorithmOID(String value);

} // CIM_SignedCredential

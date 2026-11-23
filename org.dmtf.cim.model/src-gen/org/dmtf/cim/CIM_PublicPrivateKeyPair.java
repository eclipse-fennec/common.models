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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Public Private Key Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relationship associates a PublicKeyCertificate with the Principal who has the PrivateKey used with the PublicKey. The PrivateKey is not modeled, since it is not a data element that ever SHOULD be accessible via management applications, other than key recovery services, which are outside our scope. 
 * 
 * Since the UsersAccess class and this association's superclass are deprecated, this association is also deprecated. There is no need to have a special subclass for public-private credentials. This is especially true since the properties of the association describe aspects of the certificate and its handling. The latter is currently out of scope for the model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PublicPrivateKeyPair#getUse <em>Use</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PublicPrivateKeyPair#getNonRepudiation <em>Non Repudiation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PublicPrivateKeyPair#getBackedUp <em>Backed Up</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PublicPrivateKeyPair#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PublicPrivateKeyPair()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_AuthenticationCondition\"]' Version='2.8.0' UMLPackagePath='CIM::User::UsersAccess' override.Antecedent='CIM_PublicKeyCertificate REF' override.Antecedent.Deprecated='[\"CIM_AuthenticationCondition\"]' override.Antecedent.Description='The public key certificate.' override.Dependent='CIM_UsersAccess REF' override.Dependent.Deprecated='[\"CIM_Identity\"]' override.Dependent.Description='The Principal holding the private key (that corresponds to the public key.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PublicPrivateKeyPair extends CIM_UsersCredential {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Certificate may be used for signature only or for confidentiality as well as signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use</em>' attribute.
	 * @see #setUse(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PublicPrivateKeyPair_Use()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\"]' Values='[\"SignOnly\",\"ConfidentialityOrSignature\"]'"
	 * @generated
	 */
	Integer getUse();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PublicPrivateKeyPair#getUse <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' attribute.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Integer value);

	/**
	 * Returns the value of the '<em><b>Non Repudiation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the certificate canNOT be repudiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Non Repudiation</em>' attribute.
	 * @see #setNonRepudiation(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PublicPrivateKeyPair_NonRepudiation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Boolean getNonRepudiation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PublicPrivateKeyPair#getNonRepudiation <em>Non Repudiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Repudiation</em>' attribute.
	 * @see #getNonRepudiation()
	 * @generated
	 */
	void setNonRepudiation(Boolean value);

	/**
	 * Returns the value of the '<em><b>Backed Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the certificate can be backed up.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Backed Up</em>' attribute.
	 * @see #setBackedUp(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PublicPrivateKeyPair_BackedUp()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Boolean getBackedUp();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PublicPrivateKeyPair#getBackedUp <em>Backed Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backed Up</em>' attribute.
	 * @see #getBackedUp()
	 * @generated
	 */
	void setBackedUp(Boolean value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The repository in which the certificate is backed up.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repository</em>' attribute.
	 * @see #setRepository(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PublicPrivateKeyPair_Repository()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	String getRepository();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PublicPrivateKeyPair#getRepository <em>Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' attribute.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(String value);

} // CIM_PublicPrivateKeyPair

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
 * A representation of the model object '<em><b>CIM Public Private Key Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class describing a company's and/or administrator's credential requirements that should be authenticated in order to establish/trust a CIM_Identity. This class defines the specific public/private key pair that should be authenticated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PublicPrivateKeyAuthentication#getSelfIssuedKey <em>Self Issued Key</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PublicPrivateKeyAuthentication#getDistinguishedName <em>Distinguished Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PublicPrivateKeyAuthentication#getPublicKey <em>Public Key</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PublicPrivateKeyAuthentication()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyConditionName'"
 * @generated
 */
@ProviderType
public interface CIM_PublicPrivateKeyAuthentication extends CIM_AuthenticationCondition {
	/**
	 * Returns the value of the '<em><b>Self Issued Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the key pair is self-issued (TRUE) or issued by a Certificate Authority (FALSE).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Self Issued Key</em>' attribute.
	 * @see #setSelfIssuedKey(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PublicPrivateKeyAuthentication_SelfIssuedKey()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSelfIssuedKey();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PublicPrivateKeyAuthentication#getSelfIssuedKey <em>Self Issued Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Issued Key</em>' attribute.
	 * @see #getSelfIssuedKey()
	 * @generated
	 */
	void setSelfIssuedKey(Boolean value);

	/**
	 * Returns the value of the '<em><b>Distinguished Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String holding the user's (distinguished) name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distinguished Name</em>' attribute.
	 * @see #setDistinguishedName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PublicPrivateKeyAuthentication_DistinguishedName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getDistinguishedName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PublicPrivateKeyAuthentication#getDistinguishedName <em>Distinguished Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinguished Name</em>' attribute.
	 * @see #getDistinguishedName()
	 * @generated
	 */
	void setDistinguishedName(String value);

	/**
	 * Returns the value of the '<em><b>Public Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String holding the public key data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Key</em>' attribute.
	 * @see #setPublicKey(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PublicPrivateKeyAuthentication_PublicKey()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPublicKey();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PublicPrivateKeyAuthentication#getPublicKey <em>Public Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Key</em>' attribute.
	 * @see #getPublicKey()
	 * @generated
	 */
	void setPublicKey(String value);

} // CIM_PublicPrivateKeyAuthentication

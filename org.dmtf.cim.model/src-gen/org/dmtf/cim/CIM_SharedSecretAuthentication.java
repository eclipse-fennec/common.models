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
 * A representation of the model object '<em><b>CIM Shared Secret Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class describing a company's and/or administrator's credential requirements that should be authenticated in order to establish/trust a CIM_Identity. This class defines a specific identity whose shared secret should be authenticated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SharedSecretAuthentication#getIDOfPrincipal <em>ID Of Principal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SharedSecretAuthentication#getContextOfSecret <em>Context Of Secret</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SharedSecretAuthentication()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyConditionName'"
 * @generated
 */
@ProviderType
public interface CIM_SharedSecretAuthentication extends CIM_AuthenticationCondition {
	/**
	 * Returns the value of the '<em><b>ID Of Principal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String defining the principal's ID whose secret is authenticated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Of Principal</em>' attribute.
	 * @see #setIDOfPrincipal(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SharedSecretAuthentication_IDOfPrincipal()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getIDOfPrincipal();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SharedSecretAuthentication#getIDOfPrincipal <em>ID Of Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Of Principal</em>' attribute.
	 * @see #getIDOfPrincipal()
	 * @generated
	 */
	void setIDOfPrincipal(String value);

	/**
	 * Returns the value of the '<em><b>Context Of Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String defining a hostname, URI or service/application name. It defines the specific system or service which provides the context for the shared secret.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Of Secret</em>' attribute.
	 * @see #setContextOfSecret(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SharedSecretAuthentication_ContextOfSecret()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getContextOfSecret();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SharedSecretAuthentication#getContextOfSecret <em>Context Of Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Of Secret</em>' attribute.
	 * @see #getContextOfSecret()
	 * @generated
	 */
	void setContextOfSecret(String value);

} // CIM_SharedSecretAuthentication

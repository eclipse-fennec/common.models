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
 * A representation of the model object '<em><b>CIM Account Authentication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class describing a company's and/or administrator's credential requirements that should be authenticated in order to establish/trust a CIM_Identity. This class defines a specific identity whose account credentials should be authenticated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AccountAuthentication#getAccountID <em>Account ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccountAuthentication#getAccountContext <em>Account Context</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AccountAuthentication()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyConditionName'"
 * @generated
 */
@ProviderType
public interface CIM_AccountAuthentication extends CIM_AuthenticationCondition {
	/**
	 * Returns the value of the '<em><b>Account ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String defining the account's ID which is authenticated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account ID</em>' attribute.
	 * @see #setAccountID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AccountAuthentication_AccountID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAccountID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AccountAuthentication#getAccountID <em>Account ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account ID</em>' attribute.
	 * @see #getAccountID()
	 * @generated
	 */
	void setAccountID(String value);

	/**
	 * Returns the value of the '<em><b>Account Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * String defining a hostname, URI or other information identifying the system where the Account resides.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account Context</em>' attribute.
	 * @see #setAccountContext(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AccountAuthentication_AccountContext()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAccountContext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AccountAuthentication#getAccountContext <em>Account Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Context</em>' attribute.
	 * @see #getAccountContext()
	 * @generated
	 */
	void setAccountContext(String value);

} // CIM_AccountAuthentication

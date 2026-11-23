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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Credential Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relationship defines a context (e.g., a System or Service) of a Credential. One example is a shared secret/ password which is defined within the context of an application (or Service). Generally, there is one scoping element for a Credential, however the multiplicities of the association allow a Credential to be scoped by more than one element. If this association is not instantiated for a Credential, that Credential is assumed to be scoped to the Namespace.
 * This association may also be used to indicate that a Credential is valid in some other environment. For instance associating the Credential to a RemoteServiceAccessPoint would indicate that the Credential is used to access the remote service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CredentialContext#getElementInContext <em>Element In Context</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CredentialContext#getElementProvidingContext <em>Element Providing Context</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CredentialContext#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CredentialContext()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.27.0' UMLPackagePath='CIM::User::Credential' keys='ElementInContext,ElementProvidingContext'"
 * @generated
 */
@ProviderType
public interface CIM_CredentialContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Element In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Credential whose context is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element In Context</em>' reference.
	 * @see #setElementInContext(CIM_Credential)
	 * @see org.dmtf.cim.CimPackage#getCIM_CredentialContext_ElementInContext()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Credential REF' Key='true'"
	 * @generated
	 */
	CIM_Credential getElementInContext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CredentialContext#getElementInContext <em>Element In Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element In Context</em>' reference.
	 * @see #getElementInContext()
	 * @generated
	 */
	void setElementInContext(CIM_Credential value);

	/**
	 * Returns the value of the '<em><b>Element Providing Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedElement that provides context or scope for the Credential.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Providing Context</em>' reference.
	 * @see #setElementProvidingContext(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_CredentialContext_ElementProvidingContext()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getElementProvidingContext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CredentialContext#getElementProvidingContext <em>Element Providing Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Providing Context</em>' reference.
	 * @see #getElementProvidingContext()
	 * @generated
	 */
	void setElementProvidingContext(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The usage of the certificate by the managed element that the certificate is for or is scoped to. Owned - Credential represents the CredentialContexts identity. This means that the managed element will present this credential to another party for authentication, authorization, or both. Trusted - The ManagedElement trusts the credential. This means that the credential is trusted for one or more of the security operations such as authentication, third-party authentication, and authorization. Trusted for Authentication - The ManagedElement trusts the identity represented by the credential only for authentication purposes. Trusted for Authorization - The ManagedElement trusts the identity represented by the credential only for authorization purposes. Trusted for Authentication/Authorization - The ManagedElement trusts the identity represented by the credential both for authentication and authorization purposes. Trusted for Third-Party Authentication/Authorization - The credential is being trusted for approving a third-party credential to the ManagedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CredentialContext_Usage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"6\",\"7\",\"8\",\"..\",\"32768..65535\"]' Values='[\"Owned\",\"Trusted\",\"Trusted for Authentication\",\"Trusted for Authorization\",\"Trusted for Authentication/Authorization\",\"Trusted for Third-Party Authentication/Authorization\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CredentialContext#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(Integer value);

} // CIM_CredentialContext

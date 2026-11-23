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
 * A representation of the model object '<em><b>CIM Authorized Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AuthorizedSubject is an association used to tie specific AuthorizedPrivileges to specific subjects (i.e., Identities, Roles or Collections of these). At this time, only Identities and Roles (or Collections of Identities and Roles) should be associated to AuthorizedPrivileges using this relationship. Note that any Privileges not explicitly granted to a subject, SHOULD be denied.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AuthorizedSubject#getPrivilege <em>Privilege</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AuthorizedSubject#getPrivilegedElement <em>Privileged Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AuthorizedSubject()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::User::Privilege' keys='Privilege,PrivilegedElement'"
 * @generated
 */
@ProviderType
public interface CIM_AuthorizedSubject extends EObject {
	/**
	 * Returns the value of the '<em><b>Privilege</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AuthorizedPrivilege either granted or denied to an Identity, Role or Collection. Whether the privilege is granted or denied is defined by the inherited property, CIM_Privilege.PrivilegeGranted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Privilege</em>' reference.
	 * @see #setPrivilege(CIM_AuthorizedPrivilege)
	 * @see org.dmtf.cim.CimPackage#getCIM_AuthorizedSubject_Privilege()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_AuthorizedPrivilege REF' Key='true'"
	 * @generated
	 */
	CIM_AuthorizedPrivilege getPrivilege();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AuthorizedSubject#getPrivilege <em>Privilege</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privilege</em>' reference.
	 * @see #getPrivilege()
	 * @generated
	 */
	void setPrivilege(CIM_AuthorizedPrivilege value);

	/**
	 * Returns the value of the '<em><b>Privileged Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Subject for which AuthorizedPrivileges are granted or denied. Whether the privilege is granted or denied is defined by the property, CIM_Privilege.PrivilegeGranted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Privileged Element</em>' reference.
	 * @see #setPrivilegedElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_AuthorizedSubject_PrivilegedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getPrivilegedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AuthorizedSubject#getPrivilegedElement <em>Privileged Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privileged Element</em>' reference.
	 * @see #getPrivilegedElement()
	 * @generated
	 */
	void setPrivilegedElement(CIM_ManagedElement value);

} // CIM_AuthorizedSubject

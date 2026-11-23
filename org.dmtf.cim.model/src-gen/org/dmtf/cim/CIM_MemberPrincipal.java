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
 * A representation of the model object '<em><b>CIM Member Principal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_MemberPrincipal is an aggregation used to establish membership of principals (i.e., users) in a Collection. That membership can be established either directly or indirectly as indicated in the UsersAccessBy property. For example, a user may be identified directly by their userid (i.e., Account object instance) or the user may be identified indirectly by realm from which a ticket was issued (i.e., CredentialManagementService object instance). 
 * 
 * This association is deprecated in lieu of its superclass. Usage feedback on the class has indicated confusion regarding defining the members of the collection. Also, the UsersAccess aspects of this association have been deprecated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MemberPrincipal#getUserAccessBy <em>User Access By</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MemberPrincipal()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_MemberOfCollection\"]' Aggregation='true' Version='2.8.0' UMLPackagePath='CIM::User::Org' override.Collection='CIM_Collection REF' override.Collection.Deprecated='[\"CIM_MemberOfCollection.Collection\"]' override.Collection.Aggregate='true' override.Member='CIM_ManagedElement REF' override.Member.Deprecated='[\"CIM_MemberOfCollection.Member\"]' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_MemberPrincipal extends CIM_MemberOfCollection {
	/**
	 * Returns the value of the '<em><b>User Access By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A MemberPrincipal may be identifed in several ways that may be either direct or indirect membership in the collection. 
	 * -A 'UsersAccess' membership directly identifies the user by the UsersAccess object instance. 
	 * - An 'Account' membership directly identifies the user by the Account object class instance. 
	 * - A 'UsingElement' membership indirectly identifies the user by the ManagedElement object instance that has ElementAsUser associations to UsersAccess object instances. Hence, all UsersAccess instances are indirectly included in the collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Access By</em>' attribute.
	 * @see #setUserAccessBy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemberPrincipal_UserAccessBy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"UsersAccess\",\"Account\",\"UsingElement\",\"CredentialManagementService\"]'"
	 * @generated
	 */
	Integer getUserAccessBy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemberPrincipal#getUserAccessBy <em>User Access By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Access By</em>' attribute.
	 * @see #getUserAccessBy()
	 * @generated
	 */
	void setUserAccessBy(Integer value);

} // CIM_MemberPrincipal

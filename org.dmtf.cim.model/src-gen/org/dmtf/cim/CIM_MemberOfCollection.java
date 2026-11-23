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
 * A representation of the model object '<em><b>CIM Member Of Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_MemberOfCollection is an aggregation used to establish membership of ManagedElements in a Collection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MemberOfCollection#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MemberOfCollection#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MemberOfCollection()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Core::Collection' keys='Collection,Member'"
 * @generated
 */
@ProviderType
public interface CIM_MemberOfCollection extends EObject {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Collection that aggregates members.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(CIM_Collection)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemberOfCollection_Collection()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Collection REF' Key='true' Aggregate='true'"
	 * @generated
	 */
	CIM_Collection getCollection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemberOfCollection#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(CIM_Collection value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The aggregated member of the Collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_MemberOfCollection_Member()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getMember();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MemberOfCollection#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(CIM_ManagedElement value);

} // CIM_MemberOfCollection

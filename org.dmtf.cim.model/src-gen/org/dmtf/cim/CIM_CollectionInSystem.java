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
 * A representation of the model object '<em><b>CIM Collection In System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_CollectionInSystem is deprecated in lieu of CIM_OwningCollectionElement, which is semantically equivalent. 
 * CIM_CollectionInSystem is an association used to establish a parent-child relationship between a collection and an 'owning' System such as an AdminDomain or ComputerSystem. A single collection should not have both a CollectionInOrganization and a CollectionInSystem association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CollectionInSystem#getParent <em>Parent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CollectionInSystem#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CollectionInSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_OwningCollectionElement.OwningElement\"]' Aggregation='true' Version='2.37.0' UMLPackagePath='CIM::User::Org' keys='Parent,Child'"
 * @generated
 */
@ProviderType
public interface CIM_CollectionInSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent system responsible for the collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(CIM_System)
	 * @see org.dmtf.cim.CimPackage#getCIM_CollectionInSystem_Parent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_System REF' Deprecated='[\"CIM_OwningCollectionElement.OwningElement\"]' Key='true' Aggregate='true' Max='1'"
	 * @generated
	 */
	CIM_System getParent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CollectionInSystem#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CIM_System value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(CIM_Collection)
	 * @see org.dmtf.cim.CimPackage#getCIM_CollectionInSystem_Child()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Collection REF' Deprecated='[\"CIM_OwningCollectionElement.OwnedElement\"]' Key='true'"
	 * @generated
	 */
	CIM_Collection getChild();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CollectionInSystem#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(CIM_Collection value);

} // CIM_CollectionInSystem

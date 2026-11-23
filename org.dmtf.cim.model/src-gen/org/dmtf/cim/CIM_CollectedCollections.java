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
 * A representation of the model object '<em><b>CIM Collected Collections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_CollectedCollections is an aggregation association representing that a CollectionOfMSEs can itself be contained in a CollectionOfMSEs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CollectedCollections#getCollection <em>Collection</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CollectedCollections#getCollectionInCollection <em>Collection In Collection</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CollectedCollections()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.10.0' UMLPackagePath='CIM::Core::Collection' keys='Collection,CollectionInCollection'"
 * @generated
 */
@ProviderType
public interface CIM_CollectedCollections extends EObject {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The 'higher level' or parent element in the aggregation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(CIM_CollectionOfMSEs)
	 * @see org.dmtf.cim.CimPackage#getCIM_CollectedCollections_Collection()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_CollectionOfMSEs REF' Key='true' Aggregate='true'"
	 * @generated
	 */
	CIM_CollectionOfMSEs getCollection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CollectedCollections#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(CIM_CollectionOfMSEs value);

	/**
	 * Returns the value of the '<em><b>Collection In Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The 'collected' Collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection In Collection</em>' reference.
	 * @see #setCollectionInCollection(CIM_CollectionOfMSEs)
	 * @see org.dmtf.cim.CimPackage#getCIM_CollectedCollections_CollectionInCollection()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_CollectionOfMSEs REF' Key='true'"
	 * @generated
	 */
	CIM_CollectionOfMSEs getCollectionInCollection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CollectedCollections#getCollectionInCollection <em>Collection In Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection In Collection</em>' reference.
	 * @see #getCollectionInCollection()
	 * @generated
	 */
	void setCollectionInCollection(CIM_CollectionOfMSEs value);

} // CIM_CollectedCollections

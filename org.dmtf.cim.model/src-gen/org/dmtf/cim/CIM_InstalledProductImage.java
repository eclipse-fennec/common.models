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
 * A representation of the model object '<em><b>CIM Installed Product Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * InstalledProductImage identifies the collection of Software Features and SoftwareElements that are the result of the installation of the referenced Product.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_InstalledProductImage#getProduct <em>Product</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InstalledProductImage#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_InstalledProductImage()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Application::InstalledProduct' keys='Product,Collection'"
 * @generated
 */
@ProviderType
public interface CIM_InstalledProductImage extends EObject {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product that has been installed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(CIM_Product)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstalledProductImage_Product()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Product REF' Key='true' Aggregate='true' Min='1' Max='1'"
	 * @generated
	 */
	CIM_Product getProduct();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstalledProductImage#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(CIM_Product value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The collection containing the set of SoftwareFeatures and SoftwareElements that are the result of installing the Product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(CIM_InstalledProduct)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstalledProductImage_Collection()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_InstalledProduct REF' Key='true' Weak='true'"
	 * @generated
	 */
	CIM_InstalledProduct getCollection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstalledProductImage#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(CIM_InstalledProduct value);

} // CIM_InstalledProductImage

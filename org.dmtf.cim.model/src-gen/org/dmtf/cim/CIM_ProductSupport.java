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
 * A representation of the model object '<em><b>CIM Product Support</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ProductSupport is an association between Product and SupportAccess that conveys how support is obtained for the Product. This is a many-to-many relationship, implying that various types of Support are available for a Product, and that the same Support object can provide assistance for multiple Products.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProductSupport#getProduct <em>Product</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProductSupport#getSupport <em>Support</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProductSupport()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Core::ProductFRU' keys='Product,Support'"
 * @generated
 */
@ProviderType
public interface CIM_ProductSupport extends EObject {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(CIM_Product)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProductSupport_Product()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Product REF' Key='true'"
	 * @generated
	 */
	CIM_Product getProduct();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProductSupport#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(CIM_Product value);

	/**
	 * Returns the value of the '<em><b>Support</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Support for the Product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Support</em>' reference.
	 * @see #setSupport(CIM_SupportAccess)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProductSupport_Support()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SupportAccess REF' Key='true'"
	 * @generated
	 */
	CIM_SupportAccess getSupport();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProductSupport#getSupport <em>Support</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support</em>' reference.
	 * @see #getSupport()
	 * @generated
	 */
	void setSupport(CIM_SupportAccess value);

} // CIM_ProductSupport

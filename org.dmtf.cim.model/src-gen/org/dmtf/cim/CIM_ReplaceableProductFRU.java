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
 * A representation of the model object '<em><b>CIM Replaceable Product FRU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ReplaceableProductFRU is an association between Product and FRU that shows what Product components may be replaced. The association is one to many, conveying that a Product can have many FRUs, and that a particular instance of a FRU is only applied to one (instance of a) Product.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ReplaceableProductFRU#getProduct <em>Product</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplaceableProductFRU#getFRU <em>FRU</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ReplaceableProductFRU()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Core::ProductFRU' keys='Product,FRU'"
 * @generated
 */
@ProviderType
public interface CIM_ReplaceableProductFRU extends EObject {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Product to which the FRU is applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(CIM_Product)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplaceableProductFRU_Product()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Product REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_Product getProduct();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplaceableProductFRU#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(CIM_Product value);

	/**
	 * Returns the value of the '<em><b>FRU</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FRU.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FRU</em>' reference.
	 * @see #setFRU(CIM_FRU)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplaceableProductFRU_FRU()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FRU REF' Key='true'"
	 * @generated
	 */
	CIM_FRU getFRU();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplaceableProductFRU#getFRU <em>FRU</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FRU</em>' reference.
	 * @see #getFRU()
	 * @generated
	 */
	void setFRU(CIM_FRU value);

} // CIM_ReplaceableProductFRU

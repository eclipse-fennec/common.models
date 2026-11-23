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
 * A representation of the model object '<em><b>CIM Compatible Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_CompatibleProduct is an association between Products that can indicate a wide variety of information. For example, it can indicate that the two referenced Products interoperate, that they can be installed together, that one can be the physical container for the other, etc. The string property, CompatibilityDescription, defines how the Products interoperate or are compatible, any limitations regarding interoperability or installation, ...
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CompatibleProduct#getProduct <em>Product</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CompatibleProduct#getCompatibleProduct <em>Compatible Product</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CompatibleProduct#getCompatibilityDescription <em>Compatibility Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CompatibleProduct()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Core::ProductFRU' keys='Product,CompatibleProduct'"
 * @generated
 */
@ProviderType
public interface CIM_CompatibleProduct extends EObject {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Product for which compatible offerings are defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(CIM_Product)
	 * @see org.dmtf.cim.CimPackage#getCIM_CompatibleProduct_Product()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Product REF' Key='true'"
	 * @generated
	 */
	CIM_Product getProduct();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CompatibleProduct#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(CIM_Product value);

	/**
	 * Returns the value of the '<em><b>Compatible Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The compatible Product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compatible Product</em>' reference.
	 * @see #setCompatibleProduct(CIM_Product)
	 * @see org.dmtf.cim.CimPackage#getCIM_CompatibleProduct_CompatibleProduct()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Product REF' Key='true'"
	 * @generated
	 */
	CIM_Product getCompatibleProduct();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CompatibleProduct#getCompatibleProduct <em>Compatible Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compatible Product</em>' reference.
	 * @see #getCompatibleProduct()
	 * @generated
	 */
	void setCompatibleProduct(CIM_Product value);

	/**
	 * Returns the value of the '<em><b>Compatibility Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CompatibilityDescription is a free-form string defining how the two referenced Products interoperate or are compatible, any limitations to compatibility, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Compatibility Description</em>' attribute.
	 * @see #setCompatibilityDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_CompatibleProduct_CompatibilityDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCompatibilityDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CompatibleProduct#getCompatibilityDescription <em>Compatibility Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compatibility Description</em>' attribute.
	 * @see #getCompatibilityDescription()
	 * @generated
	 */
	void setCompatibilityDescription(String value);

} // CIM_CompatibleProduct

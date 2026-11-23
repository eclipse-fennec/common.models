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
 * A representation of the model object '<em><b>CIM Product Software Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ProductSoftwareFeatures association identifies the SoftwareFeatures for a particular Product.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProductSoftwareFeatures#getProduct <em>Product</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProductSoftwareFeatures#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProductSoftwareFeatures()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Application::DeploymentModel' keys='Product,Component'"
 * @generated
 */
@ProviderType
public interface CIM_ProductSoftwareFeatures extends EObject {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Product that scopes the SoftwareFeatures.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(CIM_Product)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProductSoftwareFeatures_Product()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Product REF' Key='true' Aggregate='true' Min='1' Max='1'"
	 * @generated
	 */
	CIM_Product getProduct();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProductSoftwareFeatures#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(CIM_Product value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SoftwareFeature in a Product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(CIM_SoftwareFeature)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProductSoftwareFeatures_Component()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SoftwareFeature REF' Key='true' Weak='true'"
	 * @generated
	 */
	CIM_SoftwareFeature getComponent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProductSoftwareFeatures#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(CIM_SoftwareFeature value);

} // CIM_ProductSoftwareFeatures

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
 * A representation of the model object '<em><b>CIM Product Physical Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates the PhysicalElement(s) that make up a Product. This association is deprecated in order to correctly place it in the inheritance hierarchy and align the definition with other new classes that are being added to the model, such as CIM_ProductServiceComponent. ProductPhysicalElements was defined in the original CIM V2.0 release, when a Managed Element and a Component relationship between ManagedElements did not exist.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProductPhysicalElements#getProduct <em>Product</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProductPhysicalElements#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProductPhysicalElements()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ProductPhysicalComponent\"]' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::Core::ProductFRU' keys='Product,Component'"
 * @generated
 */
@ProviderType
public interface CIM_ProductPhysicalElements extends EObject {
	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(CIM_Product)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProductPhysicalElements_Product()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Product REF' Deprecated='[\"CIM_ProductPhysicalComponent.GroupComponent\"]' Key='true' Aggregate='true' Max='1'"
	 * @generated
	 */
	CIM_Product getProduct();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProductPhysicalElements#getProduct <em>Product</em>}' reference.
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
	 * The PhysicalElement which is a part of the Product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(CIM_PhysicalElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProductPhysicalElements_Component()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_PhysicalElement REF' Deprecated='[\"CIM_ProductPhysicalComponent.PartComponent\"]' Key='true'"
	 * @generated
	 */
	CIM_PhysicalElement getComponent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProductPhysicalElements#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(CIM_PhysicalElement value);

} // CIM_ProductPhysicalElements

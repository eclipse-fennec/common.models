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
 * A representation of the model object '<em><b>CIM FRU Includes Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates that a FRU may be composed of other Product(s). Indicates that a FRU may be composed of other Product(s). The use of this association has been deprecated since the FRU class itself has been deprecated. The composition of ReplacementFRUs is described by the ConcreteComponent association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FRUIncludesProduct#getFRU <em>FRU</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FRUIncludesProduct#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FRUIncludesProduct()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ConcreteComponent\"]' Aggregation='true' Composition='true' Version='2.8.1000' UMLPackagePath='CIM::Core::ProductFRU' keys='FRU,Component'"
 * @generated
 */
@ProviderType
public interface CIM_FRUIncludesProduct extends EObject {
	/**
	 * Returns the value of the '<em><b>FRU</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FRU.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FRU</em>' reference.
	 * @see #setFRU(CIM_FRU)
	 * @see org.dmtf.cim.CimPackage#getCIM_FRUIncludesProduct_FRU()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FRU REF' Deprecated='[\"CIM_ConcreteComponent.GroupComponent\"]' Key='true' Aggregate='true' Max='1'"
	 * @generated
	 */
	CIM_FRU getFRU();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FRUIncludesProduct#getFRU <em>FRU</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FRU</em>' reference.
	 * @see #getFRU()
	 * @generated
	 */
	void setFRU(CIM_FRU value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Product which is a part of the FRU.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(CIM_Product)
	 * @see org.dmtf.cim.CimPackage#getCIM_FRUIncludesProduct_Component()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Product REF' Deprecated='[\"CIM_ConcreteComponent.PartComponent\"]' Key='true'"
	 * @generated
	 */
	CIM_Product getComponent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FRUIncludesProduct#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(CIM_Product value);

} // CIM_FRUIncludesProduct

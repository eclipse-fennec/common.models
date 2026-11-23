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
 * A representation of the model object '<em><b>CIM Product Parent Child</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_ProductParentChild association defines a parent child hierarchy among Products. For example, a Product may come bundled with other Products.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ProductParentChild#getParent <em>Parent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ProductParentChild#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ProductParentChild()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::Core::ProductFRU' keys='Parent,Child'"
 * @generated
 */
@ProviderType
public interface CIM_ProductParentChild extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent Product in the association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(CIM_Product)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProductParentChild_Parent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Product REF' Key='true' Aggregate='true'"
	 * @generated
	 */
	CIM_Product getParent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProductParentChild#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CIM_Product value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The child Product in the association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(CIM_Product)
	 * @see org.dmtf.cim.CimPackage#getCIM_ProductParentChild_Child()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Product REF' Key='true'"
	 * @generated
	 */
	CIM_Product getChild();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ProductParentChild#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(CIM_Product value);

} // CIM_ProductParentChild

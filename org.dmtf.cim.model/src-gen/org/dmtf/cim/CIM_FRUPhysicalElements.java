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
 * A representation of the model object '<em><b>CIM FRU Physical Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates the PhysicalElements that make up a FRU.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FRUPhysicalElements#getFRU <em>FRU</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FRUPhysicalElements#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FRUPhysicalElements()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::Core::ProductFRU' keys='FRU,Component'"
 * @generated
 */
@ProviderType
public interface CIM_FRUPhysicalElements extends EObject {
	/**
	 * Returns the value of the '<em><b>FRU</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FRU.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FRU</em>' reference.
	 * @see #setFRU(CIM_FRU)
	 * @see org.dmtf.cim.CimPackage#getCIM_FRUPhysicalElements_FRU()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_FRU REF' Key='true' Aggregate='true' Max='1'"
	 * @generated
	 */
	CIM_FRU getFRU();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FRUPhysicalElements#getFRU <em>FRU</em>}' reference.
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
	 * The PhysicalElement which is a part of the FRU.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(CIM_PhysicalElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_FRUPhysicalElements_Component()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_PhysicalElement REF' Key='true'"
	 * @generated
	 */
	CIM_PhysicalElement getComponent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FRUPhysicalElements#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(CIM_PhysicalElement value);

} // CIM_FRUPhysicalElements

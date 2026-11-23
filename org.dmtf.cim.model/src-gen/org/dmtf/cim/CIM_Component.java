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
 * A representation of the model object '<em><b>CIM Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_Component is a generic association used to establish 'part of' relationships between Managed Elements. For example, it could be used to define the components or parts of a System.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Component#getGroupComponent <em>Group Component</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Component#getPartComponent <em>Part Component</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Component()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Association='true' Abstract='true' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Core::CoreElements' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent element in the association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Component</em>' reference.
	 * @see #setGroupComponent(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_Component_GroupComponent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true' Aggregate='true'"
	 * @generated
	 */
	CIM_ManagedElement getGroupComponent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Component#getGroupComponent <em>Group Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Component</em>' reference.
	 * @see #getGroupComponent()
	 * @generated
	 */
	void setGroupComponent(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Part Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The child element in the association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Component</em>' reference.
	 * @see #setPartComponent(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_Component_PartComponent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getPartComponent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Component#getPartComponent <em>Part Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Component</em>' reference.
	 * @see #getPartComponent()
	 * @generated
	 */
	void setPartComponent(CIM_ManagedElement value);

} // CIM_Component

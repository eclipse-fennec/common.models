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
 * A representation of the model object '<em><b>CIM Software Element Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association identifies the Actions for a Software Element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElementActions#getElement <em>Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElementActions#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElementActions()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Element,Action'"
 * @generated
 */
@ProviderType
public interface CIM_SoftwareElementActions extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element that scopes the Action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(CIM_SoftwareElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElementActions_Element()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SoftwareElement REF' Key='true' Aggregate='true' Min='1' Max='1'"
	 * @generated
	 */
	CIM_SoftwareElement getElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElementActions#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(CIM_SoftwareElement value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The software Action to move or uninstall a SoftwareElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(CIM_Action)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElementActions_Action()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Action REF' Key='true' Weak='true'"
	 * @generated
	 */
	CIM_Action getAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElementActions#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CIM_Action value);

} // CIM_SoftwareElementActions

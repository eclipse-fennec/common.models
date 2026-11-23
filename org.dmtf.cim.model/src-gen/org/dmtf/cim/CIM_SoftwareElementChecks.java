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
 * A representation of the model object '<em><b>CIM Software Element Checks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association ties a SoftwareElement to a specific Check to validate its state or its movement to the next state. Note that SoftwareElements in a running state cannot transition to another state. Therefore, the value of the Phase property is restricted to 0 ("In-State") for SoftwareElements in the running state.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElementChecks#getElement <em>Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElementChecks#getCheck <em>Check</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SoftwareElementChecks#getPhase <em>Phase</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElementChecks()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Element,Check'"
 * @generated
 */
@ProviderType
public interface CIM_SoftwareElementChecks extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SoftwareElement being checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(CIM_SoftwareElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElementChecks_Element()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SoftwareElement REF' Key='true' Aggregate='true' Min='1' Max='1'"
	 * @generated
	 */
	CIM_SoftwareElement getElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElementChecks#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(CIM_SoftwareElement value);

	/**
	 * Returns the value of the '<em><b>Check</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Check for the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Check</em>' reference.
	 * @see #setCheck(CIM_Check)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElementChecks_Check()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Check REF' Key='true' Weak='true'"
	 * @generated
	 */
	CIM_Check getCheck();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElementChecks#getCheck <em>Check</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check</em>' reference.
	 * @see #getCheck()
	 * @generated
	 */
	void setCheck(CIM_Check value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Phase property indicates whether the referenced Check is an in-state or a next-state Check.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #setPhase(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SoftwareElementChecks_Phase()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\"]' Values='[\"In-State\",\"Next-State\"]'"
	 * @generated
	 */
	Integer getPhase();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SoftwareElementChecks#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(Integer value);

} // CIM_SoftwareElementChecks

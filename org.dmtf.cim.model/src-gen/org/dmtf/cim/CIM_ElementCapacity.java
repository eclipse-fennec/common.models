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
 * A representation of the model object '<em><b>CIM Element Capacity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ElementCapacity associates a PhysicalCapacity object with one or more PhysicalElements. It serves to associate a description of min/max hardware requirements or capabilities (stored as a kind of PhysicalCapacity), with the PhysicalElements being described.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ElementCapacity#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ElementCapacity#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementCapacity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Physical::Misc' keys='Capacity,Element'"
 * @generated
 */
@ProviderType
public interface CIM_ElementCapacity extends EObject {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PhysicalCapacity describes the minimum and maximum requirements, and ability to support different types of hardware for a PhysicalElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capacity</em>' reference.
	 * @see #setCapacity(CIM_PhysicalCapacity)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementCapacity_Capacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_PhysicalCapacity REF' Key='true'"
	 * @generated
	 */
	CIM_PhysicalCapacity getCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementCapacity#getCapacity <em>Capacity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' reference.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(CIM_PhysicalCapacity value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PhysicalElement being described.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(CIM_PhysicalElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementCapacity_Element()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_PhysicalElement REF' Key='true' Min='1'"
	 * @generated
	 */
	CIM_PhysicalElement getElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementCapacity#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(CIM_PhysicalElement value);

} // CIM_ElementCapacity

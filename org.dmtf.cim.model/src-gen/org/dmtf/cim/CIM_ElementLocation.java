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
 * A representation of the model object '<em><b>CIM Element Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ElementLocation associates a ManagedElement with a location for positioning, inventory, maintenance and similar purposes. PhysicalElements can certainly have locations. They are explicitly defined in a subclass, PhysicalElement Location. However, other ManagedElements can also be associated with locations. For example, Organizations can be 'in' one or more locations, or Services can be restricted to a location.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ElementLocation#getElement <em>Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ElementLocation#getPhysicalLocation <em>Physical Location</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementLocation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Physical' keys='Element,PhysicalLocation'"
 * @generated
 */
@ProviderType
public interface CIM_ElementLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedElement whose location is specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementLocation_Element()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementLocation#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Physical Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location of the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Location</em>' reference.
	 * @see #setPhysicalLocation(CIM_Location)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementLocation_PhysicalLocation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Location REF' Key='true'"
	 * @generated
	 */
	CIM_Location getPhysicalLocation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementLocation#getPhysicalLocation <em>Physical Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Location</em>' reference.
	 * @see #getPhysicalLocation()
	 * @generated
	 */
	void setPhysicalLocation(CIM_Location value);

} // CIM_ElementLocation

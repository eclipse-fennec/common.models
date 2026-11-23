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
 * A representation of the model object '<em><b>CIM Owning Collection Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OwningCollectionElement represents an association between a Collection and the ManagedElement responsible for the control or ownership of the Collection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OwningCollectionElement#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OwningCollectionElement#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OwningCollectionElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.18.0' UMLPackagePath='CIM::Core::Collection' keys='OwningElement,OwnedElement'"
 * @generated
 */
@ProviderType
public interface CIM_OwningCollectionElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedElement acting as the 'owner' or object that isresponsible for the control of the Collection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Element</em>' reference.
	 * @see #setOwningElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_OwningCollectionElement_OwningElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_ManagedElement getOwningElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OwningCollectionElement#getOwningElement <em>Owning Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Element</em>' reference.
	 * @see #getOwningElement()
	 * @generated
	 */
	void setOwningElement(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Collection owned or controlled by the ManagedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference.
	 * @see #setOwnedElement(CIM_Collection)
	 * @see org.dmtf.cim.CimPackage#getCIM_OwningCollectionElement_OwnedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Collection REF' Key='true'"
	 * @generated
	 */
	CIM_Collection getOwnedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OwningCollectionElement#getOwnedElement <em>Owned Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Element</em>' reference.
	 * @see #getOwnedElement()
	 * @generated
	 */
	void setOwnedElement(CIM_Collection value);

} // CIM_OwningCollectionElement

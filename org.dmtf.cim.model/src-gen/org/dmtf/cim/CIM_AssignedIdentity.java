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
 * A representation of the model object '<em><b>CIM Assigned Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relationship associates an Identity to a specific ManagedElement, whose trust and account information is represented.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AssignedIdentity#getIdentityInfo <em>Identity Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AssignedIdentity#getManagedElement <em>Managed Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssignedIdentity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.14.0' UMLPackagePath='CIM::User::Identity' keys='IdentityInfo,ManagedElement'"
 * @generated
 */
@ProviderType
public interface CIM_AssignedIdentity extends EObject {
	/**
	 * Returns the value of the '<em><b>Identity Info</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Identity of the referenced ManagedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identity Info</em>' reference.
	 * @see #setIdentityInfo(CIM_Identity)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssignedIdentity_IdentityInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Identity REF' Key='true'"
	 * @generated
	 */
	CIM_Identity getIdentityInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssignedIdentity#getIdentityInfo <em>Identity Info</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity Info</em>' reference.
	 * @see #getIdentityInfo()
	 * @generated
	 */
	void setIdentityInfo(CIM_Identity value);

	/**
	 * Returns the value of the '<em><b>Managed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedElement assigned to or representing a specific Identity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Element</em>' reference.
	 * @see #setManagedElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_AssignedIdentity_ManagedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getManagedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AssignedIdentity#getManagedElement <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Element</em>' reference.
	 * @see #getManagedElement()
	 * @generated
	 */
	void setManagedElement(CIM_ManagedElement value);

} // CIM_AssignedIdentity

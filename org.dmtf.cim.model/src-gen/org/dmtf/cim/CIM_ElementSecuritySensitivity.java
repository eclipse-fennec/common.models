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
 * A representation of the model object '<em><b>CIM Element Security Sensitivity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association labels an element with a security sensitivity.
 * This association is not used to indicate clearance of a security principal, see IdentitySecurityClearance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ElementSecuritySensitivity#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ElementSecuritySensitivity#getManagedElement <em>Managed Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementSecuritySensitivity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.14.0' UMLPackagePath='CIM::User::SecurityLevel' keys='SecurityLevel,ManagedElement'"
 * @generated
 */
@ProviderType
public interface CIM_ElementSecuritySensitivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The security sensitivity level of the element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Level</em>' reference.
	 * @see #setSecurityLevel(CIM_SecuritySensitivity)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementSecuritySensitivity_SecurityLevel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SecuritySensitivity REF' Key='true'"
	 * @generated
	 */
	CIM_SecuritySensitivity getSecurityLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementSecuritySensitivity#getSecurityLevel <em>Security Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level</em>' reference.
	 * @see #getSecurityLevel()
	 * @generated
	 */
	void setSecurityLevel(CIM_SecuritySensitivity value);

	/**
	 * Returns the value of the '<em><b>Managed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element which is assigned a sensitivity level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Element</em>' reference.
	 * @see #setManagedElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_ElementSecuritySensitivity_ManagedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getManagedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ElementSecuritySensitivity#getManagedElement <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Element</em>' reference.
	 * @see #getManagedElement()
	 * @generated
	 */
	void setManagedElement(CIM_ManagedElement value);

} // CIM_ElementSecuritySensitivity

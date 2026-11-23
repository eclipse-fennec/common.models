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
 * A representation of the model object '<em><b>CIM Role Limited To Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Role object class is used to represent a position or set of responsibilities within an organization, organizational unit or other scope. When explicitly restricting the target elements that may be accessed from this Role, this association MUST be used.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RoleLimitedToTarget#getDefiningRole <em>Defining Role</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RoleLimitedToTarget#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RoleLimitedToTarget()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.20.0' UMLPackagePath='CIM::User::Role' keys='DefiningRole,TargetElement'"
 * @generated
 */
@ProviderType
public interface CIM_RoleLimitedToTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Defining Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Role whose target set is explicitly defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Defining Role</em>' reference.
	 * @see #setDefiningRole(CIM_Role)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoleLimitedToTarget_DefiningRole()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Role REF' Key='true'"
	 * @generated
	 */
	CIM_Role getDefiningRole();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoleLimitedToTarget#getDefiningRole <em>Defining Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defining Role</em>' reference.
	 * @see #getDefiningRole()
	 * @generated
	 */
	void setDefiningRole(CIM_Role value);

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the target set that can be accessed from the Role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Element</em>' reference.
	 * @see #setTargetElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoleLimitedToTarget_TargetElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getTargetElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoleLimitedToTarget#getTargetElement <em>Target Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' reference.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(CIM_ManagedElement value);

} // CIM_RoleLimitedToTarget

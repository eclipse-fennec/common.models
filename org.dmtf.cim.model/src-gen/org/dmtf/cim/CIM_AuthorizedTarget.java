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
 * A representation of the model object '<em><b>CIM Authorized Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AuthorizedTarget is an association used to tie an Identity's or Role's AuthorizedPrivileges to specific target resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AuthorizedTarget#getPrivilege <em>Privilege</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AuthorizedTarget#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AuthorizedTarget()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::User::Privilege' keys='Privilege,TargetElement'"
 * @generated
 */
@ProviderType
public interface CIM_AuthorizedTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Privilege</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AuthorizedPrivilege affecting the target resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Privilege</em>' reference.
	 * @see #setPrivilege(CIM_AuthorizedPrivilege)
	 * @see org.dmtf.cim.CimPackage#getCIM_AuthorizedTarget_Privilege()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_AuthorizedPrivilege REF' Key='true'"
	 * @generated
	 */
	CIM_AuthorizedPrivilege getPrivilege();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AuthorizedTarget#getPrivilege <em>Privilege</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privilege</em>' reference.
	 * @see #getPrivilege()
	 * @generated
	 */
	void setPrivilege(CIM_AuthorizedPrivilege value);

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target set of resources to which the AuthorizedPrivilege applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Element</em>' reference.
	 * @see #setTargetElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_AuthorizedTarget_TargetElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getTargetElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AuthorizedTarget#getTargetElement <em>Target Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' reference.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(CIM_ManagedElement value);

} // CIM_AuthorizedTarget

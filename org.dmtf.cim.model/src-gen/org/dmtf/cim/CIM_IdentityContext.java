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
 * A representation of the model object '<em><b>CIM Identity Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relationship defines a context (e.g., a System or Service) of an Identity. Note that the cardinalities of this association are many to many, indicating that the Identity MAY be scoped by several elements. However, it is likely that there will only be a single scope, if one exists at all.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IdentityContext#getElementInContext <em>Element In Context</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IdentityContext#getElementProvidingContext <em>Element Providing Context</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IdentityContext()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::User::Identity' keys='ElementInContext,ElementProvidingContext'"
 * @generated
 */
@ProviderType
public interface CIM_IdentityContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Element In Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Identity whose context is defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element In Context</em>' reference.
	 * @see #setElementInContext(CIM_Identity)
	 * @see org.dmtf.cim.CimPackage#getCIM_IdentityContext_ElementInContext()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Identity REF' Key='true'"
	 * @generated
	 */
	CIM_Identity getElementInContext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IdentityContext#getElementInContext <em>Element In Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element In Context</em>' reference.
	 * @see #getElementInContext()
	 * @generated
	 */
	void setElementInContext(CIM_Identity value);

	/**
	 * Returns the value of the '<em><b>Element Providing Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedElement that provides context or scope for the Identity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Providing Context</em>' reference.
	 * @see #setElementProvidingContext(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_IdentityContext_ElementProvidingContext()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getElementProvidingContext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IdentityContext#getElementProvidingContext <em>Element Providing Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Providing Context</em>' reference.
	 * @see #getElementProvidingContext()
	 * @generated
	 */
	void setElementProvidingContext(CIM_ManagedElement value);

} // CIM_IdentityContext

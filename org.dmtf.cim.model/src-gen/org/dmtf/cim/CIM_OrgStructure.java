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
 * A representation of the model object '<em><b>CIM Org Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_OrgStructure is an association used to establish parent-child relationships between OrganizationalEntity instances. This is used to capture organizational relationships between object instances such as those that are imported from an LDAP-accessible directory.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OrgStructure#getParent <em>Parent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OrgStructure#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OrgStructure()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::User::Org' keys='Parent,Child'"
 * @generated
 */
@ProviderType
public interface CIM_OrgStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organizational parent in this association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(CIM_OrganizationalEntity)
	 * @see org.dmtf.cim.CimPackage#getCIM_OrgStructure_Parent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OrganizationalEntity REF' Key='true' Aggregate='true' Max='1'"
	 * @generated
	 */
	CIM_OrganizationalEntity getParent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OrgStructure#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CIM_OrganizationalEntity value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organizational child in this association, i.e., the sub-unit or other owned object instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(CIM_OrganizationalEntity)
	 * @see org.dmtf.cim.CimPackage#getCIM_OrgStructure_Child()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_OrganizationalEntity REF' Key='true'"
	 * @generated
	 */
	CIM_OrganizationalEntity getChild();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OrgStructure#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(CIM_OrganizationalEntity value);

} // CIM_OrgStructure

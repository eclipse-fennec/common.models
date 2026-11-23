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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Credential Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_CredentialManagementCapabilities describes the capabilities for managing credentials.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CredentialManagementCapabilities#getSupportedMethods <em>Supported Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CredentialManagementCapabilities#getCumulativePrivilegeMethodology <em>Cumulative Privilege Methodology</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CredentialManagementCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' UMLPackagePath='CIM::User::SecurityServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_CredentialManagementCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Supported Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each enumeration corresponds to support for the like-named method of the associated CIM_CredentialManagementService instance(s) for the exception of "Delete Credential Instance" that refers to the capability of executing delete operation on the instances of the CIM_Credential subclasses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Methods</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_CredentialManagementCapabilities_SupportedMethods()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"4\",\"..\",\"0x8000..\"]' Values='[\"DeleteCredentialInstance\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedMethods();

	/**
	 * Returns the value of the '<em><b>Cumulative Privilege Methodology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the methodology used by the implementation to accumulate the user's privileges for credentials or credential stores that are directly or indirectly associated with the CIM_CredentialManagementService that this instace represents the capability of. 
	 * This methodology is applicable to the credentials and credential stores that are members of another credential store.
	 * The methodology describes how the same user's privilges for a credential gets reconciled with that user's privileges for the credential store that the credential belongs to. The methodology is also applicable for multi-level credential stores where one credential store is a member of another credential store.
	 * 2 - Collection Privileges Override - the user's privileges on the instance of CIM_CredentialStore that is referenced by the Collection property of CIM_MemberOfCollection association, overrides the same user's privileges on the CIM_Credential and/or CIM_CredentialStore referenced by the Member property of the same CIM_MemberOfCollection asscociation.
	 * 3 - Member Privileges Override - the user's privileges on the instance of CIM_Credential and/or CIM_CredentialStore that is referenced by the Member property of CIM_MemberOfCollection association, overrides the same user's privileges on the CIM_CredentialStore referenced by the Collection property of the same CIM_MemberOfCollection asscociation.
	 * 4 - Collection-Member Privileges Union - the user's privileges on the instance of CIM_Credential and/or CIM_CredentialStore that is referenced by the Member property of CIM_MemberOfCollection association, are added to the same user's privileges on the CIM_CredentialStore referenced by the Collection property of the same CIM_MemberOfCollection asscociation.
	 * 5 - Collection-Member Privileges Intersection - the user's privileges on the instance of CIM_Credential and/or CIM_CredentialStore that is referenced by the Member property of CIM_MemberOfCollection association, are valid only if the privileges are mirrored with the same user's privileges on the CIM_CredentialStore referenced by the Collection property of the same CIM_MemberOfCollection asscociation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cumulative Privilege Methodology</em>' attribute.
	 * @see #setCumulativePrivilegeMethodology(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CredentialManagementCapabilities_CumulativePrivilegeMethodology()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\"]' Values='[\"Collection Privileges Override\",\"Member Privileges Override\",\"Collection-Member Privileges Union\",\"Collection-Member Privileges Intersection\"]'"
	 * @generated
	 */
	Integer getCumulativePrivilegeMethodology();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CredentialManagementCapabilities#getCumulativePrivilegeMethodology <em>Cumulative Privilege Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cumulative Privilege Methodology</em>' attribute.
	 * @see #getCumulativePrivilegeMethodology()
	 * @generated
	 */
	void setCumulativePrivilegeMethodology(Integer value);

} // CIM_CredentialManagementCapabilities

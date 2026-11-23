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
 * A representation of the model object '<em><b>CIM Account Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AccountManagementService creates, manages, and if necessary destroys Accounts on behalf of other SecuritySerices.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AccountManagementService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.35.0' UMLPackagePath='CIM::User::Account' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_AccountManagementService extends CIM_SecurityService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreateAccount creates an Account on the specified ComputerSystem. Upon successful completion of the method, there shall be a newly created instance of CIM_Account associated through the CIM_AccountOnSystem association with the instance of ComputerSystem identified by the System parameter such that each property of the CIM_Account instance has the value of the corresponding property of the template instance specified by the AccountTemplate parameter and the CIM_Account instance is associated with this instance of CIM_AccountManagementService through the CIM_ServiceAffectsElement association.
	 * Instances of CIM_Identity may be created by the method and associated with the instance of CIM_Account through CIM_AssignedIdentity. If one or more instances of CIM_Identity are created, a reference to each shall be returned in the Identities parameter, otherwise the Identities parameter shall be NULL upon method completion.
	 * @param System The scoping ComputerSystem in which to create the Account.
	 * @param AccountTemplate AccountTemplate is a template for the desired Account to be created.
	 * @param Account Reference to the instance of CIM_Account created when the method returns a value of 0.
	 * @param Identities Reference to the instances of CIM_Identity created when the method returns a value of 0. NULL if no such instances are created.
	 * <!-- end-model-doc -->
	 * @model SystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' Required='true'" AccountTemplateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' EmbeddedInstance='CIM_Account'" AccountAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Account REF' In='false' Out='true'" IdentitiesUnique="false" IdentitiesMany="true"
	 *        IdentitiesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Identity REF[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateAccount(CIM_ComputerSystem System, String AccountTemplate, CIM_Account Account, EList<CIM_Identity> Identities);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreateUserContact creates a UserContact for the specified system. Upon successful completion of the method, there shall be a newly created instance of CIM_UserContact associated to an instance of CIM_Identity through CIM_AssignedIdentity. A CIM_Identity instance may be created by the method or may be one that already existed that represented this user.
	 * @param System The scoping ComputerSystem in which to create the Account.
	 * @param UserContactTemplate UserContactTemplate is a template for the desired UserContact to be created
	 * @param UserContact Reference to the instance of CIM_UserContact created when the method returns a value of 0
	 * @param Identities Reference to the instances of CIM_Identity when the method returns a value of 0. These instances may not be created as a part of the execution of this method. These instances may already exist prior to the invocation of this method.
	 * <!-- end-model-doc -->
	 * @model SystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' Required='true'" UserContactTemplateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' EmbeddedInstance='CIM_UserContact'" UserContactAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_UserContact REF' In='false' Out='true'" IdentitiesUnique="false" IdentitiesMany="true"
	 *        IdentitiesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Identity REF[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Method Reserved\"]'"
	 * @generated
	 */
	Long CreateUserContact(CIM_ComputerSystem System, String UserContactTemplate, CIM_UserContact UserContact, EList<CIM_Identity> Identities);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreateUserContactByIdentity creates a UserContact for the specificed system using the specified Identity. Upon successful completion of the method, there shall be a newly created instance of CIM_UserContact associated to the instance of CIM_Identity specified through CIM_AssignedIdentity.
	 * @param System The scoping ComputerSystem in which to create the Account.
	 * @param UserContactTemplate UserContactTemplate is a template for the desired UserContact to be created.
	 * @param Identity A Reference to a existing CIM_Identity instance to be associated to the newly created CIM_UserContact instance.
	 * @param UserContact Reference to the instance of CIM_UserContact created when the method returns a value of 0. This value shall be NULL if the method returns a value other than 0.
	 * <!-- end-model-doc -->
	 * @model SystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' Required='true'" UserContactTemplateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' EmbeddedInstance='CIM_UserContact'" IdentityAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Identity REF' Required='true'" UserContactAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_UserContact REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Method Reserved\"]'"
	 * @generated
	 */
	Long CreateUserContactByIdentity(CIM_ComputerSystem System, String UserContactTemplate, CIM_Identity Identity, CIM_UserContact UserContact);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GetAccounts will retrieve the CIM_Account reference that match the supplied UserID.
	 * @param UserID The UserID for the CIM_Account instances to be retrieved.
	 * @param Accounts An array of references to the instances of CIM_Account that have the supplied UserID.
	 * <!-- end-model-doc -->
	 * @model UserIDAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" AccountsUnique="false" AccountsMany="true"
	 *        AccountsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Account REF[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Method Reserved\"]'"
	 * @generated
	 */
	Long GetAccounts(String UserID, EList<CIM_Account> Accounts);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GetUserContacts will retrieve the CIM_UserContact references that match the supplied UserID.
	 * @param UserID The UserID for the CIM_UserContact instances to be retrieved.
	 * @param UserContacts An array of references to the UserContact instances that have the supplied UserID.
	 * <!-- end-model-doc -->
	 * @model UserIDAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" UserContactsUnique="false" UserContactsMany="true"
	 *        UserContactsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_UserContact REF[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Failed\",\"Method Reserved\"]'"
	 * @generated
	 */
	Long GetUserContacts(String UserID, EList<CIM_UserContact> UserContacts);

} // CIM_AccountManagementService

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
package org.dmtf.cim.impl;

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_Account;
import org.dmtf.cim.CIM_AccountManagementService;
import org.dmtf.cim.CIM_ComputerSystem;
import org.dmtf.cim.CIM_Identity;
import org.dmtf.cim.CIM_UserContact;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Account Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_AccountManagementServiceImpl extends CIM_SecurityServiceImpl implements CIM_AccountManagementService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AccountManagementServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AccountManagementService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateAccount(CIM_ComputerSystem System, String AccountTemplate, CIM_Account Account, EList<CIM_Identity> Identities) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateUserContact(CIM_ComputerSystem System, String UserContactTemplate, CIM_UserContact UserContact, EList<CIM_Identity> Identities) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateUserContactByIdentity(CIM_ComputerSystem System, String UserContactTemplate, CIM_Identity Identity, CIM_UserContact UserContact) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetAccounts(String UserID, EList<CIM_Account> Accounts) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetUserContacts(String UserID, EList<CIM_UserContact> UserContacts) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_SERVICE___CREATE_ACCOUNT__CIM_COMPUTERSYSTEM_STRING_CIM_ACCOUNT_ELIST:
				return CreateAccount((CIM_ComputerSystem)arguments.get(0), (String)arguments.get(1), (CIM_Account)arguments.get(2), (EList<CIM_Identity>)arguments.get(3));
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_SERVICE___CREATE_USER_CONTACT__CIM_COMPUTERSYSTEM_STRING_CIM_USERCONTACT_ELIST:
				return CreateUserContact((CIM_ComputerSystem)arguments.get(0), (String)arguments.get(1), (CIM_UserContact)arguments.get(2), (EList<CIM_Identity>)arguments.get(3));
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_SERVICE___CREATE_USER_CONTACT_BY_IDENTITY__CIM_COMPUTERSYSTEM_STRING_CIM_IDENTITY_CIM_USERCONTACT:
				return CreateUserContactByIdentity((CIM_ComputerSystem)arguments.get(0), (String)arguments.get(1), (CIM_Identity)arguments.get(2), (CIM_UserContact)arguments.get(3));
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_SERVICE___GET_ACCOUNTS__STRING_ELIST:
				return GetAccounts((String)arguments.get(0), (EList<CIM_Account>)arguments.get(1));
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_SERVICE___GET_USER_CONTACTS__STRING_ELIST:
				return GetUserContacts((String)arguments.get(0), (EList<CIM_UserContact>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_AccountManagementServiceImpl

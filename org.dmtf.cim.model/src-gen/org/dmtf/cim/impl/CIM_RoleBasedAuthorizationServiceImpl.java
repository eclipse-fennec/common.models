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

import org.dmtf.cim.CIM_Identity;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_Role;
import org.dmtf.cim.CIM_RoleBasedAuthorizationService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Role Based Authorization Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_RoleBasedAuthorizationServiceImpl extends CIM_PrivilegeManagementServiceImpl implements CIM_RoleBasedAuthorizationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RoleBasedAuthorizationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RoleBasedAuthorizationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AssignRoles(CIM_Identity Identity, EList<CIM_Role> Roles) {
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
	public Long ModifyRole(EList<String> Privileges, EList<CIM_ManagedElement> RoleLimitedToTargets, CIM_Role Role) {
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
	public Long ShowRoles(CIM_Identity Subject, CIM_ManagedElement Target, EList<String> Roles, EList<String> Privileges) {
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
			case CimPackage.CIM_ROLE_BASED_AUTHORIZATION_SERVICE___ASSIGN_ROLES__CIM_IDENTITY_ELIST:
				return AssignRoles((CIM_Identity)arguments.get(0), (EList<CIM_Role>)arguments.get(1));
			case CimPackage.CIM_ROLE_BASED_AUTHORIZATION_SERVICE___MODIFY_ROLE__ELIST_ELIST_CIM_ROLE:
				return ModifyRole((EList<String>)arguments.get(0), (EList<CIM_ManagedElement>)arguments.get(1), (CIM_Role)arguments.get(2));
			case CimPackage.CIM_ROLE_BASED_AUTHORIZATION_SERVICE___SHOW_ROLES__CIM_IDENTITY_CIM_MANAGEDELEMENT_ELIST_ELIST:
				return ShowRoles((CIM_Identity)arguments.get(0), (CIM_ManagedElement)arguments.get(1), (EList<String>)arguments.get(2), (EList<String>)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_RoleBasedAuthorizationServiceImpl

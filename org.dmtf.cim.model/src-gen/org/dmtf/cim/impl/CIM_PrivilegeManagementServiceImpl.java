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

import org.dmtf.cim.CIM_AuthorizedPrivilege;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_PrivilegeManagementService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Privilege Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_PrivilegeManagementServiceImpl extends CIM_AuthorizationServiceImpl implements CIM_PrivilegeManagementService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PrivilegeManagementServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PrivilegeManagementService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AssignAccess(CIM_ManagedElement Subject, Boolean PrivilegeGranted, EList<Integer> Activities, EList<String> ActivityQualifiers, EList<Integer> QualifierFormats, CIM_ManagedElement Target, CIM_AuthorizedPrivilege Privilege) {
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
	public Long RemoveAccess(CIM_ManagedElement Subject, CIM_AuthorizedPrivilege Privilege, CIM_ManagedElement Target) {
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
	public Long ShowAccess(CIM_ManagedElement Subject, CIM_ManagedElement Target, EList<CIM_ManagedElement> OutSubjects, EList<CIM_ManagedElement> OutTargets, EList<String> Privileges) {
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
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_SERVICE___ASSIGN_ACCESS__CIM_MANAGEDELEMENT_BOOLEAN_ELIST_ELIST_ELIST_CIM_MANAGEDELEMENT_CIM_AUTHORIZEDPRIVILEGE:
				return AssignAccess((CIM_ManagedElement)arguments.get(0), (Boolean)arguments.get(1), (EList<Integer>)arguments.get(2), (EList<String>)arguments.get(3), (EList<Integer>)arguments.get(4), (CIM_ManagedElement)arguments.get(5), (CIM_AuthorizedPrivilege)arguments.get(6));
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_SERVICE___REMOVE_ACCESS__CIM_MANAGEDELEMENT_CIM_AUTHORIZEDPRIVILEGE_CIM_MANAGEDELEMENT:
				return RemoveAccess((CIM_ManagedElement)arguments.get(0), (CIM_AuthorizedPrivilege)arguments.get(1), (CIM_ManagedElement)arguments.get(2));
			case CimPackage.CIM_PRIVILEGE_MANAGEMENT_SERVICE___SHOW_ACCESS__CIM_MANAGEDELEMENT_CIM_MANAGEDELEMENT_ELIST_ELIST_ELIST:
				return ShowAccess((CIM_ManagedElement)arguments.get(0), (CIM_ManagedElement)arguments.get(1), (EList<CIM_ManagedElement>)arguments.get(2), (EList<CIM_ManagedElement>)arguments.get(3), (EList<String>)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_PrivilegeManagementServiceImpl

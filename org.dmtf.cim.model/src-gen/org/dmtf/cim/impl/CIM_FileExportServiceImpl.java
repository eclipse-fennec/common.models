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

import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_FileExportService;
import org.dmtf.cim.CIM_FileShare;
import org.dmtf.cim.CIM_Identity;
import org.dmtf.cim.CIM_LogicalElement;
import org.dmtf.cim.CIM_Share;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File Export Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_FileExportServiceImpl extends CIM_ServiceImpl implements CIM_FileExportService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileExportServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileExportService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateExportedShare(CIM_ConcreteJob Job, CIM_LogicalElement Root, String SharedElementPath, String Goal, CIM_FileShare TheShare, CIM_Identity DefaultUserId, EList<String> RootAccessHosts, EList<String> AccessPointPorts) {
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
	public Long ModifyExportedShare(CIM_ConcreteJob Job, CIM_LogicalElement Root, String SharedElementPath, String Goal, CIM_FileShare TheShare, Integer InUseOptions, Long WaitTime, CIM_Identity DefaultUserId, EList<String> RootAccessHosts, EList<String> AccessPointPorts) {
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
	public Long ReleaseExportedShare(CIM_ConcreteJob Job, CIM_Share TheShare, Integer InUseOptions, Long WaitTime) {
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
	public Long AssignPrivilegeToExportedShare(EList<CIM_Identity> Identities, EList<Integer> Activities, CIM_FileShare FileShare) {
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
			case CimPackage.CIM_FILE_EXPORT_SERVICE___CREATE_EXPORTED_SHARE__CIM_CONCRETEJOB_CIM_LOGICALELEMENT_STRING_STRING_CIM_FILESHARE_CIM_IDENTITY_ELIST_ELIST:
				return CreateExportedShare((CIM_ConcreteJob)arguments.get(0), (CIM_LogicalElement)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (CIM_FileShare)arguments.get(4), (CIM_Identity)arguments.get(5), (EList<String>)arguments.get(6), (EList<String>)arguments.get(7));
			case CimPackage.CIM_FILE_EXPORT_SERVICE___MODIFY_EXPORTED_SHARE__CIM_CONCRETEJOB_CIM_LOGICALELEMENT_STRING_STRING_CIM_FILESHARE_INTEGER_LONG_CIM_IDENTITY_ELIST_ELIST:
				return ModifyExportedShare((CIM_ConcreteJob)arguments.get(0), (CIM_LogicalElement)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (CIM_FileShare)arguments.get(4), (Integer)arguments.get(5), (Long)arguments.get(6), (CIM_Identity)arguments.get(7), (EList<String>)arguments.get(8), (EList<String>)arguments.get(9));
			case CimPackage.CIM_FILE_EXPORT_SERVICE___RELEASE_EXPORTED_SHARE__CIM_CONCRETEJOB_CIM_SHARE_INTEGER_LONG:
				return ReleaseExportedShare((CIM_ConcreteJob)arguments.get(0), (CIM_Share)arguments.get(1), (Integer)arguments.get(2), (Long)arguments.get(3));
			case CimPackage.CIM_FILE_EXPORT_SERVICE___ASSIGN_PRIVILEGE_TO_EXPORTED_SHARE__ELIST_ELIST_CIM_FILESHARE:
				return AssignPrivilegeToExportedShare((EList<CIM_Identity>)arguments.get(0), (EList<Integer>)arguments.get(1), (CIM_FileShare)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_FileExportServiceImpl

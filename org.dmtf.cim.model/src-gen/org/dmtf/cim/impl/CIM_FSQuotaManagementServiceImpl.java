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

import org.dmtf.cim.CIM_ComputerSystem;
import org.dmtf.cim.CIM_FSQuotaManagementService;
import org.dmtf.cim.CIM_Job;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FS Quota Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_FSQuotaManagementServiceImpl extends CIM_ServiceImpl implements CIM_FSQuotaManagementService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FSQuotaManagementServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FSQuotaManagementService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long FindQuotaEntries(String IdentityId, CIM_ComputerSystem ElementId, String Tree, Integer QuotaType, EList<String> QuotaEntries) {
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
	public Long DeleteQuotaEntry(String EntryID) {
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
	public Long ModifyQuotaEntry(String EntryId, String QuotaEntry, CIM_Job Job) {
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
	public Long AddQuotaEntry(String QuotaEntry, CIM_Job Job) {
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
	public Long GetQuotaReport(CIM_ManagedElement Element, String Tree, String User, String Group, String Cursor, Long NRecords, CIM_Job Job, EList<String> ReportRecs) {
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
	public Long EnableQuotas(Boolean OnOff, CIM_ManagedElement Element, CIM_Job Job) {
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
	public Long InitializeQuotas(CIM_Job Job) {
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
			case CimPackage.CIM_FS_QUOTA_MANAGEMENT_SERVICE___FIND_QUOTA_ENTRIES__STRING_CIM_COMPUTERSYSTEM_STRING_INTEGER_ELIST:
				return FindQuotaEntries((String)arguments.get(0), (CIM_ComputerSystem)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (EList<String>)arguments.get(4));
			case CimPackage.CIM_FS_QUOTA_MANAGEMENT_SERVICE___DELETE_QUOTA_ENTRY__STRING:
				return DeleteQuotaEntry((String)arguments.get(0));
			case CimPackage.CIM_FS_QUOTA_MANAGEMENT_SERVICE___MODIFY_QUOTA_ENTRY__STRING_STRING_CIM_JOB:
				return ModifyQuotaEntry((String)arguments.get(0), (String)arguments.get(1), (CIM_Job)arguments.get(2));
			case CimPackage.CIM_FS_QUOTA_MANAGEMENT_SERVICE___ADD_QUOTA_ENTRY__STRING_CIM_JOB:
				return AddQuotaEntry((String)arguments.get(0), (CIM_Job)arguments.get(1));
			case CimPackage.CIM_FS_QUOTA_MANAGEMENT_SERVICE___GET_QUOTA_REPORT__CIM_MANAGEDELEMENT_STRING_STRING_STRING_STRING_LONG_CIM_JOB_ELIST:
				return GetQuotaReport((CIM_ManagedElement)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Long)arguments.get(5), (CIM_Job)arguments.get(6), (EList<String>)arguments.get(7));
			case CimPackage.CIM_FS_QUOTA_MANAGEMENT_SERVICE___ENABLE_QUOTAS__BOOLEAN_CIM_MANAGEDELEMENT_CIM_JOB:
				return EnableQuotas((Boolean)arguments.get(0), (CIM_ManagedElement)arguments.get(1), (CIM_Job)arguments.get(2));
			case CimPackage.CIM_FS_QUOTA_MANAGEMENT_SERVICE___INITIALIZE_QUOTAS__CIM_JOB:
				return InitializeQuotas((CIM_Job)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_FSQuotaManagementServiceImpl

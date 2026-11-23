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

import org.dmtf.cim.CIM_Job;
import org.dmtf.cim.CIM_StorageExtent;
import org.dmtf.cim.CIM_StorageProtectionService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Protection Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_StorageProtectionServiceImpl extends CIM_ServiceImpl implements CIM_StorageProtectionService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageProtectionServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageProtectionService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long Protect(CIM_Job Job, CIM_StorageExtent Element, Integer ElementType, Integer Access, EList<Integer> InquiryProtection, Boolean DenyAsCopyTarget, Boolean LUNMappingConfigure, Integer ProtectExpirationType, String TimePeriod) {
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
			case CimPackage.CIM_STORAGE_PROTECTION_SERVICE___PROTECT__CIM_JOB_CIM_STORAGEEXTENT_INTEGER_INTEGER_ELIST_BOOLEAN_BOOLEAN_INTEGER_STRING:
				return Protect((CIM_Job)arguments.get(0), (CIM_StorageExtent)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (EList<Integer>)arguments.get(4), (Boolean)arguments.get(5), (Boolean)arguments.get(6), (Integer)arguments.get(7), (String)arguments.get(8));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_StorageProtectionServiceImpl

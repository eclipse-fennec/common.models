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
import org.dmtf.cim.CIM_SharedSecret;
import org.dmtf.cim.CIM_System;
import org.dmtf.cim.CIM_WBEMServerDeviceRegistrationService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM WBEM Server Device Registration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_WBEMServerDeviceRegistrationServiceImpl extends CIM_ServiceImpl implements CIM_WBEMServerDeviceRegistrationService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_WBEMServerDeviceRegistrationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_WBEMServerDeviceRegistrationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long AddSystem(CIM_Job Job, String UseNamespace, EList<String> Addresses, EList<Long> PortNumbers, EList<Integer> AddressTypes, String ElementName, String Description, CIM_SharedSecret secret, CIM_System addedSystem) {
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
	public Long DiscoverSystem(CIM_Job Job, String UseNamespace, CIM_SharedSecret secret, CIM_System discoveredSystems) {
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
	public Long RemoveSystem(CIM_Job Job, CIM_System system) {
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
			case CimPackage.CIM_WBEM_SERVER_DEVICE_REGISTRATION_SERVICE___ADD_SYSTEM__CIM_JOB_STRING_ELIST_ELIST_ELIST_STRING_STRING_CIM_SHAREDSECRET_CIM_SYSTEM:
				return AddSystem((CIM_Job)arguments.get(0), (String)arguments.get(1), (EList<String>)arguments.get(2), (EList<Long>)arguments.get(3), (EList<Integer>)arguments.get(4), (String)arguments.get(5), (String)arguments.get(6), (CIM_SharedSecret)arguments.get(7), (CIM_System)arguments.get(8));
			case CimPackage.CIM_WBEM_SERVER_DEVICE_REGISTRATION_SERVICE___DISCOVER_SYSTEM__CIM_JOB_STRING_CIM_SHAREDSECRET_CIM_SYSTEM:
				return DiscoverSystem((CIM_Job)arguments.get(0), (String)arguments.get(1), (CIM_SharedSecret)arguments.get(2), (CIM_System)arguments.get(3));
			case CimPackage.CIM_WBEM_SERVER_DEVICE_REGISTRATION_SERVICE___REMOVE_SYSTEM__CIM_JOB_CIM_SYSTEM:
				return RemoveSystem((CIM_Job)arguments.get(0), (CIM_System)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_WBEMServerDeviceRegistrationServiceImpl

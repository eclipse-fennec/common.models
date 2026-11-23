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
import org.dmtf.cim.CIM_LogicalDevice;
import org.dmtf.cim.CIM_SharedDeviceManagementService;
import org.dmtf.cim.CIM_System;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Shared Device Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_SharedDeviceManagementServiceImpl extends CIM_ServiceImpl implements CIM_SharedDeviceManagementService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SharedDeviceManagementServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SharedDeviceManagementService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ShareDevice(Integer RequestedAccess, CIM_LogicalDevice Device, CIM_System System, String TimeoutPeriod, Boolean Force, CIM_ConcreteJob Job) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_SHARED_DEVICE_MANAGEMENT_SERVICE___SHARE_DEVICE__INTEGER_CIM_LOGICALDEVICE_CIM_SYSTEM_STRING_BOOLEAN_CIM_CONCRETEJOB:
				return ShareDevice((Integer)arguments.get(0), (CIM_LogicalDevice)arguments.get(1), (CIM_System)arguments.get(2), (String)arguments.get(3), (Boolean)arguments.get(4), (CIM_ConcreteJob)arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_SharedDeviceManagementServiceImpl

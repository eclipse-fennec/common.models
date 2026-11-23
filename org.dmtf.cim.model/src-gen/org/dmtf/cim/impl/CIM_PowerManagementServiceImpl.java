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
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_PowerManagementService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Power Management Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_PowerManagementServiceImpl extends CIM_ServiceImpl implements CIM_PowerManagementService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PowerManagementServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PowerManagementService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long SetPowerState(Integer PowerState, CIM_ManagedElement ManagedElement, String Time) {
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
	public Long RequestPowerStateChange(Integer PowerState, CIM_ManagedElement ManagedElement, String Time, CIM_ConcreteJob Job, String TimeoutPeriod) {
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
			case CimPackage.CIM_POWER_MANAGEMENT_SERVICE___SET_POWER_STATE__INTEGER_CIM_MANAGEDELEMENT_STRING:
				return SetPowerState((Integer)arguments.get(0), (CIM_ManagedElement)arguments.get(1), (String)arguments.get(2));
			case CimPackage.CIM_POWER_MANAGEMENT_SERVICE___REQUEST_POWER_STATE_CHANGE__INTEGER_CIM_MANAGEDELEMENT_STRING_CIM_CONCRETEJOB_STRING:
				return RequestPowerStateChange((Integer)arguments.get(0), (CIM_ManagedElement)arguments.get(1), (String)arguments.get(2), (CIM_ConcreteJob)arguments.get(3), (String)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_PowerManagementServiceImpl

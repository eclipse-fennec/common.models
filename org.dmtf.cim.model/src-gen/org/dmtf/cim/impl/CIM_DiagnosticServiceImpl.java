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
import org.dmtf.cim.CIM_DiagnosticService;
import org.dmtf.cim.CIM_DiagnosticSetting;
import org.dmtf.cim.CIM_JobSettingData;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Diagnostic Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CIM_DiagnosticServiceImpl extends CIM_ServiceImpl implements CIM_DiagnosticService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiagnosticServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiagnosticService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long RunDiagnostic(CIM_ManagedElement ManagedElement, CIM_DiagnosticSetting DiagSetting, CIM_JobSettingData JobSetting, CIM_ConcreteJob Job) {
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
	public Long RunDiagnosticService(CIM_ManagedElement ManagedElement, String DiagnosticSettings, String JobSettings, CIM_ConcreteJob Job) {
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
			case CimPackage.CIM_DIAGNOSTIC_SERVICE___RUN_DIAGNOSTIC__CIM_MANAGEDELEMENT_CIM_DIAGNOSTICSETTING_CIM_JOBSETTINGDATA_CIM_CONCRETEJOB:
				return RunDiagnostic((CIM_ManagedElement)arguments.get(0), (CIM_DiagnosticSetting)arguments.get(1), (CIM_JobSettingData)arguments.get(2), (CIM_ConcreteJob)arguments.get(3));
			case CimPackage.CIM_DIAGNOSTIC_SERVICE___RUN_DIAGNOSTIC_SERVICE__CIM_MANAGEDELEMENT_STRING_STRING_CIM_CONCRETEJOB:
				return RunDiagnosticService((CIM_ManagedElement)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (CIM_ConcreteJob)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_DiagnosticServiceImpl

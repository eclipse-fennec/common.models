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

import org.dmtf.cim.CIM_ConfigurationReportingService;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Configuration Reporting Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_ConfigurationReportingServiceImpl extends CIM_ServiceImpl implements CIM_ConfigurationReportingService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ConfigurationReportingServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ConfigurationReportingService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetClassTypes(Integer InquiryType, Boolean Recursive, CIM_ManagedElement Target, EList<String> ClassTypes) {
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
	public Long GetUnitTypes(Integer InquiryType, Boolean Recursive, CIM_ManagedElement Target, String ClassType, EList<Integer> UnitTypes) {
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
	public Long ReportCapacity(Integer InquiryType, Boolean Recursive, CIM_ManagedElement Target, String ClassType, Integer UnitType, Long NumberOfUnits) {
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
			case CimPackage.CIM_CONFIGURATION_REPORTING_SERVICE___GET_CLASS_TYPES__INTEGER_BOOLEAN_CIM_MANAGEDELEMENT_ELIST:
				return GetClassTypes((Integer)arguments.get(0), (Boolean)arguments.get(1), (CIM_ManagedElement)arguments.get(2), (EList<String>)arguments.get(3));
			case CimPackage.CIM_CONFIGURATION_REPORTING_SERVICE___GET_UNIT_TYPES__INTEGER_BOOLEAN_CIM_MANAGEDELEMENT_STRING_ELIST:
				return GetUnitTypes((Integer)arguments.get(0), (Boolean)arguments.get(1), (CIM_ManagedElement)arguments.get(2), (String)arguments.get(3), (EList<Integer>)arguments.get(4));
			case CimPackage.CIM_CONFIGURATION_REPORTING_SERVICE___REPORT_CAPACITY__INTEGER_BOOLEAN_CIM_MANAGEDELEMENT_STRING_INTEGER_LONG:
				return ReportCapacity((Integer)arguments.get(0), (Boolean)arguments.get(1), (CIM_ManagedElement)arguments.get(2), (String)arguments.get(3), (Integer)arguments.get(4), (Long)arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_ConfigurationReportingServiceImpl

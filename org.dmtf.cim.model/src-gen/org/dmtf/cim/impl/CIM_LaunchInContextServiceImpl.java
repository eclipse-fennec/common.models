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

import org.dmtf.cim.CIM_LaunchInContextSAP;
import org.dmtf.cim.CIM_LaunchInContextService;
import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Launch In Context Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CIM_LaunchInContextServiceImpl extends CIM_ServiceImpl implements CIM_LaunchInContextService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LaunchInContextServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LaunchInContextService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateLaunchPoint(String LaunchPointSpecification, EList<CIM_ManagedElement> RestrictedToElement, CIM_LaunchInContextSAP LaunchPoint) {
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
	public Long RemoveLaunchPoint(CIM_LaunchInContextSAP LaunchPoint, EList<CIM_ManagedElement> RestrictedToElement) {
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
	public Long ApplyLaunchPoint(CIM_LaunchInContextSAP LaunchPoint, EList<CIM_ManagedElement> RestrictedToElement) {
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
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SERVICE___CREATE_LAUNCH_POINT__STRING_ELIST_CIM_LAUNCHINCONTEXTSAP:
				return CreateLaunchPoint((String)arguments.get(0), (EList<CIM_ManagedElement>)arguments.get(1), (CIM_LaunchInContextSAP)arguments.get(2));
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SERVICE___REMOVE_LAUNCH_POINT__CIM_LAUNCHINCONTEXTSAP_ELIST:
				return RemoveLaunchPoint((CIM_LaunchInContextSAP)arguments.get(0), (EList<CIM_ManagedElement>)arguments.get(1));
			case CimPackage.CIM_LAUNCH_IN_CONTEXT_SERVICE___APPLY_LAUNCH_POINT__CIM_LAUNCHINCONTEXTSAP_ELIST:
				return ApplyLaunchPoint((CIM_LaunchInContextSAP)arguments.get(0), (EList<CIM_ManagedElement>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CIM_LaunchInContextServiceImpl

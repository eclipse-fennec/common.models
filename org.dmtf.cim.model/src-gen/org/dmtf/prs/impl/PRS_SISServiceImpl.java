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
package org.dmtf.prs.impl;

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.impl.CIM_ServiceImpl;

import org.dmtf.prs.PRS_Activity;
import org.dmtf.prs.PRS_SISService;
import org.dmtf.prs.PRS_Transaction;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS SIS Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PRS_SISServiceImpl extends CIM_ServiceImpl implements PRS_SISService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_SISServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_SIS_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long StartSISTransaction(Integer TransactionType, PRS_Activity ActivityRef, PRS_Transaction TransactionRef) {
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
	public Long EndSISTransaction(Long Status, PRS_Transaction TransactionRef) {
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
	public Long SetSISCompletionStatus(Long CompletionStatus, PRS_Transaction TransactionRef) {
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
			case PrsPackage.PRS_SIS_SERVICE___START_SIS_TRANSACTION__INTEGER_PRS_ACTIVITY_PRS_TRANSACTION:
				return StartSISTransaction((Integer)arguments.get(0), (PRS_Activity)arguments.get(1), (PRS_Transaction)arguments.get(2));
			case PrsPackage.PRS_SIS_SERVICE___END_SIS_TRANSACTION__LONG_PRS_TRANSACTION:
				return EndSISTransaction((Long)arguments.get(0), (PRS_Transaction)arguments.get(1));
			case PrsPackage.PRS_SIS_SERVICE___SET_SIS_COMPLETION_STATUS__LONG_PRS_TRANSACTION:
				return SetSISCompletionStatus((Long)arguments.get(0), (PRS_Transaction)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PRS_SISServiceImpl

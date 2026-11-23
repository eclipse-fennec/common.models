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

import org.dmtf.cim.CIM_DiagnosticResult;
import org.dmtf.cim.CIM_DiagnosticResultForTest;
import org.dmtf.cim.CIM_DiagnosticTest;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Diagnostic Result For Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultForTestImpl#getDiagnosticResult <em>Diagnostic Result</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultForTestImpl#getDiagnosticTest <em>Diagnostic Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiagnosticResultForTestImpl extends MinimalEObjectImpl.Container implements CIM_DiagnosticResultForTest {
	/**
	 * The cached value of the '{@link #getDiagnosticResult() <em>Diagnostic Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticResult()
	 * @generated
	 * @ordered
	 */
	protected CIM_DiagnosticResult diagnosticResult;

	/**
	 * The cached value of the '{@link #getDiagnosticTest() <em>Diagnostic Test</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticTest()
	 * @generated
	 * @ordered
	 */
	protected CIM_DiagnosticTest diagnosticTest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiagnosticResultForTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiagnosticResultForTest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticResult getDiagnosticResult() {
		if (diagnosticResult != null && diagnosticResult.eIsProxy()) {
			InternalEObject oldDiagnosticResult = (InternalEObject)diagnosticResult;
			diagnosticResult = (CIM_DiagnosticResult)eResolveProxy(oldDiagnosticResult);
			if (diagnosticResult != oldDiagnosticResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_DIAGNOSTIC_RESULT_FOR_TEST__DIAGNOSTIC_RESULT, oldDiagnosticResult, diagnosticResult));
			}
		}
		return diagnosticResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_DiagnosticResult basicGetDiagnosticResult() {
		return diagnosticResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagnosticResult(CIM_DiagnosticResult newDiagnosticResult) {
		CIM_DiagnosticResult oldDiagnosticResult = diagnosticResult;
		diagnosticResult = newDiagnosticResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT_FOR_TEST__DIAGNOSTIC_RESULT, oldDiagnosticResult, diagnosticResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticTest getDiagnosticTest() {
		if (diagnosticTest != null && diagnosticTest.eIsProxy()) {
			InternalEObject oldDiagnosticTest = (InternalEObject)diagnosticTest;
			diagnosticTest = (CIM_DiagnosticTest)eResolveProxy(oldDiagnosticTest);
			if (diagnosticTest != oldDiagnosticTest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_DIAGNOSTIC_RESULT_FOR_TEST__DIAGNOSTIC_TEST, oldDiagnosticTest, diagnosticTest));
			}
		}
		return diagnosticTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_DiagnosticTest basicGetDiagnosticTest() {
		return diagnosticTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagnosticTest(CIM_DiagnosticTest newDiagnosticTest) {
		CIM_DiagnosticTest oldDiagnosticTest = diagnosticTest;
		diagnosticTest = newDiagnosticTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT_FOR_TEST__DIAGNOSTIC_TEST, oldDiagnosticTest, diagnosticTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DIAGNOSTIC_RESULT_FOR_TEST__DIAGNOSTIC_RESULT:
				if (resolve) return getDiagnosticResult();
				return basicGetDiagnosticResult();
			case CimPackage.CIM_DIAGNOSTIC_RESULT_FOR_TEST__DIAGNOSTIC_TEST:
				if (resolve) return getDiagnosticTest();
				return basicGetDiagnosticTest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_DIAGNOSTIC_RESULT_FOR_TEST__DIAGNOSTIC_RESULT:
				setDiagnosticResult((CIM_DiagnosticResult)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT_FOR_TEST__DIAGNOSTIC_TEST:
				setDiagnosticTest((CIM_DiagnosticTest)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_DIAGNOSTIC_RESULT_FOR_TEST__DIAGNOSTIC_RESULT:
				setDiagnosticResult((CIM_DiagnosticResult)null);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT_FOR_TEST__DIAGNOSTIC_TEST:
				setDiagnosticTest((CIM_DiagnosticTest)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_DIAGNOSTIC_RESULT_FOR_TEST__DIAGNOSTIC_RESULT:
				return diagnosticResult != null;
			case CimPackage.CIM_DIAGNOSTIC_RESULT_FOR_TEST__DIAGNOSTIC_TEST:
				return diagnosticTest != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_DiagnosticResultForTestImpl

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
import org.dmtf.cim.CIM_DiagnosticResultInPackage;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Diagnostic Result In Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultInPackageImpl#getPackageResult <em>Package Result</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultInPackageImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiagnosticResultInPackageImpl extends MinimalEObjectImpl.Container implements CIM_DiagnosticResultInPackage {
	/**
	 * The cached value of the '{@link #getPackageResult() <em>Package Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageResult()
	 * @generated
	 * @ordered
	 */
	protected CIM_DiagnosticResult packageResult;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected CIM_DiagnosticResult result;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiagnosticResultInPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiagnosticResultInPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticResult getPackageResult() {
		if (packageResult != null && packageResult.eIsProxy()) {
			InternalEObject oldPackageResult = (InternalEObject)packageResult;
			packageResult = (CIM_DiagnosticResult)eResolveProxy(oldPackageResult);
			if (packageResult != oldPackageResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_DIAGNOSTIC_RESULT_IN_PACKAGE__PACKAGE_RESULT, oldPackageResult, packageResult));
			}
		}
		return packageResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_DiagnosticResult basicGetPackageResult() {
		return packageResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageResult(CIM_DiagnosticResult newPackageResult) {
		CIM_DiagnosticResult oldPackageResult = packageResult;
		packageResult = newPackageResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT_IN_PACKAGE__PACKAGE_RESULT, oldPackageResult, packageResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_DiagnosticResult getResult() {
		if (result != null && result.eIsProxy()) {
			InternalEObject oldResult = (InternalEObject)result;
			result = (CIM_DiagnosticResult)eResolveProxy(oldResult);
			if (result != oldResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_DIAGNOSTIC_RESULT_IN_PACKAGE__RESULT, oldResult, result));
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_DiagnosticResult basicGetResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResult(CIM_DiagnosticResult newResult) {
		CIM_DiagnosticResult oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT_IN_PACKAGE__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DIAGNOSTIC_RESULT_IN_PACKAGE__PACKAGE_RESULT:
				if (resolve) return getPackageResult();
				return basicGetPackageResult();
			case CimPackage.CIM_DIAGNOSTIC_RESULT_IN_PACKAGE__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
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
			case CimPackage.CIM_DIAGNOSTIC_RESULT_IN_PACKAGE__PACKAGE_RESULT:
				setPackageResult((CIM_DiagnosticResult)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT_IN_PACKAGE__RESULT:
				setResult((CIM_DiagnosticResult)newValue);
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
			case CimPackage.CIM_DIAGNOSTIC_RESULT_IN_PACKAGE__PACKAGE_RESULT:
				setPackageResult((CIM_DiagnosticResult)null);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT_IN_PACKAGE__RESULT:
				setResult((CIM_DiagnosticResult)null);
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
			case CimPackage.CIM_DIAGNOSTIC_RESULT_IN_PACKAGE__PACKAGE_RESULT:
				return packageResult != null;
			case CimPackage.CIM_DIAGNOSTIC_RESULT_IN_PACKAGE__RESULT:
				return result != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_DiagnosticResultInPackageImpl

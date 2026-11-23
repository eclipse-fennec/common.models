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

import org.dmtf.cim.CIM_DiagnosticSubTestRecord;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Diagnostic Sub Test Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticSubTestRecordImpl#getTestCompletionStatus <em>Test Completion Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiagnosticSubTestRecordImpl extends CIM_DiagnosticRecordImpl implements CIM_DiagnosticSubTestRecord {
	/**
	 * The default value of the '{@link #getTestCompletionStatus() <em>Test Completion Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCompletionStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_COMPLETION_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestCompletionStatus() <em>Test Completion Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCompletionStatus()
	 * @generated
	 * @ordered
	 */
	protected String testCompletionStatus = TEST_COMPLETION_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiagnosticSubTestRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiagnosticSubTestRecord();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestCompletionStatus() {
		return testCompletionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestCompletionStatus(String newTestCompletionStatus) {
		String oldTestCompletionStatus = testCompletionStatus;
		testCompletionStatus = newTestCompletionStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_SUB_TEST_RECORD__TEST_COMPLETION_STATUS, oldTestCompletionStatus, testCompletionStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DIAGNOSTIC_SUB_TEST_RECORD__TEST_COMPLETION_STATUS:
				return getTestCompletionStatus();
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
			case CimPackage.CIM_DIAGNOSTIC_SUB_TEST_RECORD__TEST_COMPLETION_STATUS:
				setTestCompletionStatus((String)newValue);
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
			case CimPackage.CIM_DIAGNOSTIC_SUB_TEST_RECORD__TEST_COMPLETION_STATUS:
				setTestCompletionStatus(TEST_COMPLETION_STATUS_EDEFAULT);
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
			case CimPackage.CIM_DIAGNOSTIC_SUB_TEST_RECORD__TEST_COMPLETION_STATUS:
				return TEST_COMPLETION_STATUS_EDEFAULT == null ? testCompletionStatus != null : !TEST_COMPLETION_STATUS_EDEFAULT.equals(testCompletionStatus);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (TestCompletionStatus: ");
		result.append(testCompletionStatus);
		result.append(')');
		return result.toString();
	}

} //CIM_DiagnosticSubTestRecordImpl

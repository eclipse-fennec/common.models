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

import java.util.Collection;

import org.dmtf.cim.CIM_DiagnosticServiceRecord;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Diagnostic Service Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticServiceRecordImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticServiceRecordImpl#getErrorCount <em>Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticServiceRecordImpl#getLoopsFailed <em>Loops Failed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticServiceRecordImpl#getLoopsPassed <em>Loops Passed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiagnosticServiceRecordImpl extends CIM_DiagnosticRecordImpl implements CIM_DiagnosticServiceRecord {
	/**
	 * The cached value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected EList<String> errorCode;

	/**
	 * The cached value of the '{@link #getErrorCount() <em>Error Count</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> errorCount;

	/**
	 * The default value of the '{@link #getLoopsFailed() <em>Loops Failed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopsFailed()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOOPS_FAILED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoopsFailed() <em>Loops Failed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopsFailed()
	 * @generated
	 * @ordered
	 */
	protected Long loopsFailed = LOOPS_FAILED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoopsPassed() <em>Loops Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopsPassed()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOOPS_PASSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoopsPassed() <em>Loops Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopsPassed()
	 * @generated
	 * @ordered
	 */
	protected Long loopsPassed = LOOPS_PASSED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiagnosticServiceRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiagnosticServiceRecord();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getErrorCode() {
		if (errorCode == null) {
			errorCode = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__ERROR_CODE);
		}
		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getErrorCount() {
		if (errorCount == null) {
			errorCount = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__ERROR_COUNT);
		}
		return errorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLoopsFailed() {
		return loopsFailed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoopsFailed(Long newLoopsFailed) {
		Long oldLoopsFailed = loopsFailed;
		loopsFailed = newLoopsFailed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__LOOPS_FAILED, oldLoopsFailed, loopsFailed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLoopsPassed() {
		return loopsPassed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoopsPassed(Long newLoopsPassed) {
		Long oldLoopsPassed = loopsPassed;
		loopsPassed = newLoopsPassed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__LOOPS_PASSED, oldLoopsPassed, loopsPassed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__ERROR_CODE:
				return getErrorCode();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__ERROR_COUNT:
				return getErrorCount();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__LOOPS_FAILED:
				return getLoopsFailed();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__LOOPS_PASSED:
				return getLoopsPassed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__ERROR_CODE:
				getErrorCode().clear();
				getErrorCode().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__ERROR_COUNT:
				getErrorCount().clear();
				getErrorCount().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__LOOPS_FAILED:
				setLoopsFailed((Long)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__LOOPS_PASSED:
				setLoopsPassed((Long)newValue);
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
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__ERROR_CODE:
				getErrorCode().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__ERROR_COUNT:
				getErrorCount().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__LOOPS_FAILED:
				setLoopsFailed(LOOPS_FAILED_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__LOOPS_PASSED:
				setLoopsPassed(LOOPS_PASSED_EDEFAULT);
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
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__ERROR_CODE:
				return errorCode != null && !errorCode.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__ERROR_COUNT:
				return errorCount != null && !errorCount.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__LOOPS_FAILED:
				return LOOPS_FAILED_EDEFAULT == null ? loopsFailed != null : !LOOPS_FAILED_EDEFAULT.equals(loopsFailed);
			case CimPackage.CIM_DIAGNOSTIC_SERVICE_RECORD__LOOPS_PASSED:
				return LOOPS_PASSED_EDEFAULT == null ? loopsPassed != null : !LOOPS_PASSED_EDEFAULT.equals(loopsPassed);
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
		result.append(" (ErrorCode: ");
		result.append(errorCode);
		result.append(", ErrorCount: ");
		result.append(errorCount);
		result.append(", LoopsFailed: ");
		result.append(loopsFailed);
		result.append(", LoopsPassed: ");
		result.append(loopsPassed);
		result.append(')');
		return result.toString();
	}

} //CIM_DiagnosticServiceRecordImpl

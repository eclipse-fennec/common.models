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

import org.dmtf.cim.CIM_SummaryDiagnostics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Summary Diagnostics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SummaryDiagnosticsImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SummaryDiagnosticsImpl#getTestTimeStamp <em>Test Time Stamp</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SummaryDiagnosticsImpl#getErrorAlerts <em>Error Alerts</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SummaryDiagnosticsImpl#getWarningAlerts <em>Warning Alerts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SummaryDiagnosticsImpl extends CIM_ManagedElementImpl implements CIM_SummaryDiagnostics {
	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestTimeStamp() <em>Test Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestTimeStamp() <em>Test Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected String testTimeStamp = TEST_TIME_STAMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrorAlerts() <em>Error Alerts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorAlerts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> errorAlerts;

	/**
	 * The cached value of the '{@link #getWarningAlerts() <em>Warning Alerts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningAlerts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> warningAlerts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SummaryDiagnosticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SummaryDiagnostics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SUMMARY_DIAGNOSTICS__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestTimeStamp() {
		return testTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestTimeStamp(String newTestTimeStamp) {
		String oldTestTimeStamp = testTimeStamp;
		testTimeStamp = newTestTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SUMMARY_DIAGNOSTICS__TEST_TIME_STAMP, oldTestTimeStamp, testTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getErrorAlerts() {
		if (errorAlerts == null) {
			errorAlerts = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SUMMARY_DIAGNOSTICS__ERROR_ALERTS);
		}
		return errorAlerts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getWarningAlerts() {
		if (warningAlerts == null) {
			warningAlerts = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SUMMARY_DIAGNOSTICS__WARNING_ALERTS);
		}
		return warningAlerts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__SERVICE_NAME:
				return getServiceName();
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__TEST_TIME_STAMP:
				return getTestTimeStamp();
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__ERROR_ALERTS:
				return getErrorAlerts();
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__WARNING_ALERTS:
				return getWarningAlerts();
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
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__TEST_TIME_STAMP:
				setTestTimeStamp((String)newValue);
				return;
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__ERROR_ALERTS:
				getErrorAlerts().clear();
				getErrorAlerts().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__WARNING_ALERTS:
				getWarningAlerts().clear();
				getWarningAlerts().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__TEST_TIME_STAMP:
				setTestTimeStamp(TEST_TIME_STAMP_EDEFAULT);
				return;
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__ERROR_ALERTS:
				getErrorAlerts().clear();
				return;
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__WARNING_ALERTS:
				getWarningAlerts().clear();
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
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__TEST_TIME_STAMP:
				return TEST_TIME_STAMP_EDEFAULT == null ? testTimeStamp != null : !TEST_TIME_STAMP_EDEFAULT.equals(testTimeStamp);
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__ERROR_ALERTS:
				return errorAlerts != null && !errorAlerts.isEmpty();
			case CimPackage.CIM_SUMMARY_DIAGNOSTICS__WARNING_ALERTS:
				return warningAlerts != null && !warningAlerts.isEmpty();
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
		result.append(" (ServiceName: ");
		result.append(serviceName);
		result.append(", TestTimeStamp: ");
		result.append(testTimeStamp);
		result.append(", ErrorAlerts: ");
		result.append(errorAlerts);
		result.append(", WarningAlerts: ");
		result.append(warningAlerts);
		result.append(')');
		return result.toString();
	}

} //CIM_SummaryDiagnosticsImpl

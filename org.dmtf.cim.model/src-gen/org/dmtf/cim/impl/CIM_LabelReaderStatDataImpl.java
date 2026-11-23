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

import org.dmtf.cim.CIM_LabelReaderStatData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Label Reader Stat Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LabelReaderStatDataImpl#getScanSuccesses <em>Scan Successes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LabelReaderStatDataImpl#getScanFailures <em>Scan Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LabelReaderStatDataImpl#getScanRetries <em>Scan Retries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LabelReaderStatDataImpl extends CIM_StatisticalDataImpl implements CIM_LabelReaderStatData {
	/**
	 * The default value of the '{@link #getScanSuccesses() <em>Scan Successes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanSuccesses()
	 * @generated
	 * @ordered
	 */
	protected static final Long SCAN_SUCCESSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScanSuccesses() <em>Scan Successes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanSuccesses()
	 * @generated
	 * @ordered
	 */
	protected Long scanSuccesses = SCAN_SUCCESSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getScanFailures() <em>Scan Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanFailures()
	 * @generated
	 * @ordered
	 */
	protected static final Long SCAN_FAILURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScanFailures() <em>Scan Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanFailures()
	 * @generated
	 * @ordered
	 */
	protected Long scanFailures = SCAN_FAILURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getScanRetries() <em>Scan Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanRetries()
	 * @generated
	 * @ordered
	 */
	protected static final Long SCAN_RETRIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScanRetries() <em>Scan Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScanRetries()
	 * @generated
	 * @ordered
	 */
	protected Long scanRetries = SCAN_RETRIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LabelReaderStatDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LabelReaderStatData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getScanSuccesses() {
		return scanSuccesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScanSuccesses(Long newScanSuccesses) {
		Long oldScanSuccesses = scanSuccesses;
		scanSuccesses = newScanSuccesses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LABEL_READER_STAT_DATA__SCAN_SUCCESSES, oldScanSuccesses, scanSuccesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getScanFailures() {
		return scanFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScanFailures(Long newScanFailures) {
		Long oldScanFailures = scanFailures;
		scanFailures = newScanFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LABEL_READER_STAT_DATA__SCAN_FAILURES, oldScanFailures, scanFailures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getScanRetries() {
		return scanRetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScanRetries(Long newScanRetries) {
		Long oldScanRetries = scanRetries;
		scanRetries = newScanRetries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LABEL_READER_STAT_DATA__SCAN_RETRIES, oldScanRetries, scanRetries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LABEL_READER_STAT_DATA__SCAN_SUCCESSES:
				return getScanSuccesses();
			case CimPackage.CIM_LABEL_READER_STAT_DATA__SCAN_FAILURES:
				return getScanFailures();
			case CimPackage.CIM_LABEL_READER_STAT_DATA__SCAN_RETRIES:
				return getScanRetries();
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
			case CimPackage.CIM_LABEL_READER_STAT_DATA__SCAN_SUCCESSES:
				setScanSuccesses((Long)newValue);
				return;
			case CimPackage.CIM_LABEL_READER_STAT_DATA__SCAN_FAILURES:
				setScanFailures((Long)newValue);
				return;
			case CimPackage.CIM_LABEL_READER_STAT_DATA__SCAN_RETRIES:
				setScanRetries((Long)newValue);
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
			case CimPackage.CIM_LABEL_READER_STAT_DATA__SCAN_SUCCESSES:
				setScanSuccesses(SCAN_SUCCESSES_EDEFAULT);
				return;
			case CimPackage.CIM_LABEL_READER_STAT_DATA__SCAN_FAILURES:
				setScanFailures(SCAN_FAILURES_EDEFAULT);
				return;
			case CimPackage.CIM_LABEL_READER_STAT_DATA__SCAN_RETRIES:
				setScanRetries(SCAN_RETRIES_EDEFAULT);
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
			case CimPackage.CIM_LABEL_READER_STAT_DATA__SCAN_SUCCESSES:
				return SCAN_SUCCESSES_EDEFAULT == null ? scanSuccesses != null : !SCAN_SUCCESSES_EDEFAULT.equals(scanSuccesses);
			case CimPackage.CIM_LABEL_READER_STAT_DATA__SCAN_FAILURES:
				return SCAN_FAILURES_EDEFAULT == null ? scanFailures != null : !SCAN_FAILURES_EDEFAULT.equals(scanFailures);
			case CimPackage.CIM_LABEL_READER_STAT_DATA__SCAN_RETRIES:
				return SCAN_RETRIES_EDEFAULT == null ? scanRetries != null : !SCAN_RETRIES_EDEFAULT.equals(scanRetries);
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
		result.append(" (ScanSuccesses: ");
		result.append(scanSuccesses);
		result.append(", ScanFailures: ");
		result.append(scanFailures);
		result.append(", ScanRetries: ");
		result.append(scanRetries);
		result.append(')');
		return result.toString();
	}

} //CIM_LabelReaderStatDataImpl

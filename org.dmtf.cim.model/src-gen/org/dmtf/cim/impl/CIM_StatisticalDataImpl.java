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

import org.dmtf.cim.CIM_StatisticalData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StatisticalDataImpl#getStartStatisticTime <em>Start Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StatisticalDataImpl#getStatisticTime <em>Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StatisticalDataImpl#getSampleInterval <em>Sample Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StatisticalDataImpl#getRateIntervalEndTime <em>Rate Interval End Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StatisticalDataImpl#getRateIntervalStartTime <em>Rate Interval Start Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_StatisticalDataImpl extends CIM_ManagedElementImpl implements CIM_StatisticalData {
	/**
	 * The default value of the '{@link #getStartStatisticTime() <em>Start Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartStatisticTime()
	 * @generated
	 * @ordered
	 */
	protected static final String START_STATISTIC_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartStatisticTime() <em>Start Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartStatisticTime()
	 * @generated
	 * @ordered
	 */
	protected String startStatisticTime = START_STATISTIC_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatisticTime() <em>Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticTime()
	 * @generated
	 * @ordered
	 */
	protected static final String STATISTIC_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatisticTime() <em>Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticTime()
	 * @generated
	 * @ordered
	 */
	protected String statisticTime = STATISTIC_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSampleInterval() <em>Sample Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String SAMPLE_INTERVAL_EDEFAULT = "00000000000000.000000:000";

	/**
	 * The cached value of the '{@link #getSampleInterval() <em>Sample Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleInterval()
	 * @generated
	 * @ordered
	 */
	protected String sampleInterval = SAMPLE_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateIntervalEndTime() <em>Rate Interval End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateIntervalEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final String RATE_INTERVAL_END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRateIntervalEndTime() <em>Rate Interval End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateIntervalEndTime()
	 * @generated
	 * @ordered
	 */
	protected String rateIntervalEndTime = RATE_INTERVAL_END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateIntervalStartTime() <em>Rate Interval Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateIntervalStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String RATE_INTERVAL_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRateIntervalStartTime() <em>Rate Interval Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateIntervalStartTime()
	 * @generated
	 * @ordered
	 */
	protected String rateIntervalStartTime = RATE_INTERVAL_START_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StatisticalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StatisticalData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartStatisticTime() {
		return startStatisticTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartStatisticTime(String newStartStatisticTime) {
		String oldStartStatisticTime = startStatisticTime;
		startStatisticTime = newStartStatisticTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATISTICAL_DATA__START_STATISTIC_TIME, oldStartStatisticTime, startStatisticTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatisticTime() {
		return statisticTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatisticTime(String newStatisticTime) {
		String oldStatisticTime = statisticTime;
		statisticTime = newStatisticTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATISTICAL_DATA__STATISTIC_TIME, oldStatisticTime, statisticTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSampleInterval() {
		return sampleInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSampleInterval(String newSampleInterval) {
		String oldSampleInterval = sampleInterval;
		sampleInterval = newSampleInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATISTICAL_DATA__SAMPLE_INTERVAL, oldSampleInterval, sampleInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRateIntervalEndTime() {
		return rateIntervalEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateIntervalEndTime(String newRateIntervalEndTime) {
		String oldRateIntervalEndTime = rateIntervalEndTime;
		rateIntervalEndTime = newRateIntervalEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATISTICAL_DATA__RATE_INTERVAL_END_TIME, oldRateIntervalEndTime, rateIntervalEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRateIntervalStartTime() {
		return rateIntervalStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateIntervalStartTime(String newRateIntervalStartTime) {
		String oldRateIntervalStartTime = rateIntervalStartTime;
		rateIntervalStartTime = newRateIntervalStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATISTICAL_DATA__RATE_INTERVAL_START_TIME, oldRateIntervalStartTime, rateIntervalStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ResetSelectedStats(EList<String> SelectedStatistics) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STATISTICAL_DATA__START_STATISTIC_TIME:
				return getStartStatisticTime();
			case CimPackage.CIM_STATISTICAL_DATA__STATISTIC_TIME:
				return getStatisticTime();
			case CimPackage.CIM_STATISTICAL_DATA__SAMPLE_INTERVAL:
				return getSampleInterval();
			case CimPackage.CIM_STATISTICAL_DATA__RATE_INTERVAL_END_TIME:
				return getRateIntervalEndTime();
			case CimPackage.CIM_STATISTICAL_DATA__RATE_INTERVAL_START_TIME:
				return getRateIntervalStartTime();
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
			case CimPackage.CIM_STATISTICAL_DATA__START_STATISTIC_TIME:
				setStartStatisticTime((String)newValue);
				return;
			case CimPackage.CIM_STATISTICAL_DATA__STATISTIC_TIME:
				setStatisticTime((String)newValue);
				return;
			case CimPackage.CIM_STATISTICAL_DATA__SAMPLE_INTERVAL:
				setSampleInterval((String)newValue);
				return;
			case CimPackage.CIM_STATISTICAL_DATA__RATE_INTERVAL_END_TIME:
				setRateIntervalEndTime((String)newValue);
				return;
			case CimPackage.CIM_STATISTICAL_DATA__RATE_INTERVAL_START_TIME:
				setRateIntervalStartTime((String)newValue);
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
			case CimPackage.CIM_STATISTICAL_DATA__START_STATISTIC_TIME:
				setStartStatisticTime(START_STATISTIC_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_STATISTICAL_DATA__STATISTIC_TIME:
				setStatisticTime(STATISTIC_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_STATISTICAL_DATA__SAMPLE_INTERVAL:
				setSampleInterval(SAMPLE_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_STATISTICAL_DATA__RATE_INTERVAL_END_TIME:
				setRateIntervalEndTime(RATE_INTERVAL_END_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_STATISTICAL_DATA__RATE_INTERVAL_START_TIME:
				setRateIntervalStartTime(RATE_INTERVAL_START_TIME_EDEFAULT);
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
			case CimPackage.CIM_STATISTICAL_DATA__START_STATISTIC_TIME:
				return START_STATISTIC_TIME_EDEFAULT == null ? startStatisticTime != null : !START_STATISTIC_TIME_EDEFAULT.equals(startStatisticTime);
			case CimPackage.CIM_STATISTICAL_DATA__STATISTIC_TIME:
				return STATISTIC_TIME_EDEFAULT == null ? statisticTime != null : !STATISTIC_TIME_EDEFAULT.equals(statisticTime);
			case CimPackage.CIM_STATISTICAL_DATA__SAMPLE_INTERVAL:
				return SAMPLE_INTERVAL_EDEFAULT == null ? sampleInterval != null : !SAMPLE_INTERVAL_EDEFAULT.equals(sampleInterval);
			case CimPackage.CIM_STATISTICAL_DATA__RATE_INTERVAL_END_TIME:
				return RATE_INTERVAL_END_TIME_EDEFAULT == null ? rateIntervalEndTime != null : !RATE_INTERVAL_END_TIME_EDEFAULT.equals(rateIntervalEndTime);
			case CimPackage.CIM_STATISTICAL_DATA__RATE_INTERVAL_START_TIME:
				return RATE_INTERVAL_START_TIME_EDEFAULT == null ? rateIntervalStartTime != null : !RATE_INTERVAL_START_TIME_EDEFAULT.equals(rateIntervalStartTime);
		}
		return super.eIsSet(featureID);
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
			case CimPackage.CIM_STATISTICAL_DATA___RESET_SELECTED_STATS__ELIST:
				return ResetSelectedStats((EList<String>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (StartStatisticTime: ");
		result.append(startStatisticTime);
		result.append(", StatisticTime: ");
		result.append(statisticTime);
		result.append(", SampleInterval: ");
		result.append(sampleInterval);
		result.append(", RateIntervalEndTime: ");
		result.append(rateIntervalEndTime);
		result.append(", RateIntervalStartTime: ");
		result.append(rateIntervalStartTime);
		result.append(')');
		return result.toString();
	}

} //CIM_StatisticalDataImpl

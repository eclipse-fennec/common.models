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

import org.dmtf.cim.CIM_StatisticalSetting;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Statistical Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StatisticalSettingImpl#getStartStatisticTime <em>Start Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StatisticalSettingImpl#getEndStatisticTime <em>End Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StatisticalSettingImpl#getSampleInterval <em>Sample Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StatisticalSettingImpl extends CIM_SettingDataImpl implements CIM_StatisticalSetting {
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
	 * The default value of the '{@link #getEndStatisticTime() <em>End Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndStatisticTime()
	 * @generated
	 * @ordered
	 */
	protected static final String END_STATISTIC_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndStatisticTime() <em>End Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndStatisticTime()
	 * @generated
	 * @ordered
	 */
	protected String endStatisticTime = END_STATISTIC_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSampleInterval() <em>Sample Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String SAMPLE_INTERVAL_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StatisticalSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StatisticalSetting();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATISTICAL_SETTING__START_STATISTIC_TIME, oldStartStatisticTime, startStatisticTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndStatisticTime() {
		return endStatisticTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndStatisticTime(String newEndStatisticTime) {
		String oldEndStatisticTime = endStatisticTime;
		endStatisticTime = newEndStatisticTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATISTICAL_SETTING__END_STATISTIC_TIME, oldEndStatisticTime, endStatisticTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATISTICAL_SETTING__SAMPLE_INTERVAL, oldSampleInterval, sampleInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STATISTICAL_SETTING__START_STATISTIC_TIME:
				return getStartStatisticTime();
			case CimPackage.CIM_STATISTICAL_SETTING__END_STATISTIC_TIME:
				return getEndStatisticTime();
			case CimPackage.CIM_STATISTICAL_SETTING__SAMPLE_INTERVAL:
				return getSampleInterval();
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
			case CimPackage.CIM_STATISTICAL_SETTING__START_STATISTIC_TIME:
				setStartStatisticTime((String)newValue);
				return;
			case CimPackage.CIM_STATISTICAL_SETTING__END_STATISTIC_TIME:
				setEndStatisticTime((String)newValue);
				return;
			case CimPackage.CIM_STATISTICAL_SETTING__SAMPLE_INTERVAL:
				setSampleInterval((String)newValue);
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
			case CimPackage.CIM_STATISTICAL_SETTING__START_STATISTIC_TIME:
				setStartStatisticTime(START_STATISTIC_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_STATISTICAL_SETTING__END_STATISTIC_TIME:
				setEndStatisticTime(END_STATISTIC_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_STATISTICAL_SETTING__SAMPLE_INTERVAL:
				setSampleInterval(SAMPLE_INTERVAL_EDEFAULT);
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
			case CimPackage.CIM_STATISTICAL_SETTING__START_STATISTIC_TIME:
				return START_STATISTIC_TIME_EDEFAULT == null ? startStatisticTime != null : !START_STATISTIC_TIME_EDEFAULT.equals(startStatisticTime);
			case CimPackage.CIM_STATISTICAL_SETTING__END_STATISTIC_TIME:
				return END_STATISTIC_TIME_EDEFAULT == null ? endStatisticTime != null : !END_STATISTIC_TIME_EDEFAULT.equals(endStatisticTime);
			case CimPackage.CIM_STATISTICAL_SETTING__SAMPLE_INTERVAL:
				return SAMPLE_INTERVAL_EDEFAULT == null ? sampleInterval != null : !SAMPLE_INTERVAL_EDEFAULT.equals(sampleInterval);
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
		result.append(" (StartStatisticTime: ");
		result.append(startStatisticTime);
		result.append(", EndStatisticTime: ");
		result.append(endStatisticTime);
		result.append(", SampleInterval: ");
		result.append(sampleInterval);
		result.append(')');
		return result.toString();
	}

} //CIM_StatisticalSettingImpl

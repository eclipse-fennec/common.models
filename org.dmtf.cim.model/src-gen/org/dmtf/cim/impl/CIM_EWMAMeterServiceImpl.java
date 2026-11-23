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

import org.dmtf.cim.CIM_EWMAMeterService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM EWMA Meter Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_EWMAMeterServiceImpl#getAverageRate <em>Average Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EWMAMeterServiceImpl#getDeltaInterval <em>Delta Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EWMAMeterServiceImpl#getGain <em>Gain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_EWMAMeterServiceImpl extends CIM_MeterServiceImpl implements CIM_EWMAMeterService {
	/**
	 * The default value of the '{@link #getAverageRate() <em>Average Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVERAGE_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageRate() <em>Average Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageRate()
	 * @generated
	 * @ordered
	 */
	protected Long averageRate = AVERAGE_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeltaInterval() <em>Delta Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long DELTA_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaInterval() <em>Delta Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaInterval()
	 * @generated
	 * @ordered
	 */
	protected Long deltaInterval = DELTA_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected static final Long GAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGain() <em>Gain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected Long gain = GAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_EWMAMeterServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_EWMAMeterService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAverageRate() {
		return averageRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageRate(Long newAverageRate) {
		Long oldAverageRate = averageRate;
		averageRate = newAverageRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EWMA_METER_SERVICE__AVERAGE_RATE, oldAverageRate, averageRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDeltaInterval() {
		return deltaInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltaInterval(Long newDeltaInterval) {
		Long oldDeltaInterval = deltaInterval;
		deltaInterval = newDeltaInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EWMA_METER_SERVICE__DELTA_INTERVAL, oldDeltaInterval, deltaInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getGain() {
		return gain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGain(Long newGain) {
		Long oldGain = gain;
		gain = newGain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EWMA_METER_SERVICE__GAIN, oldGain, gain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_EWMA_METER_SERVICE__AVERAGE_RATE:
				return getAverageRate();
			case CimPackage.CIM_EWMA_METER_SERVICE__DELTA_INTERVAL:
				return getDeltaInterval();
			case CimPackage.CIM_EWMA_METER_SERVICE__GAIN:
				return getGain();
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
			case CimPackage.CIM_EWMA_METER_SERVICE__AVERAGE_RATE:
				setAverageRate((Long)newValue);
				return;
			case CimPackage.CIM_EWMA_METER_SERVICE__DELTA_INTERVAL:
				setDeltaInterval((Long)newValue);
				return;
			case CimPackage.CIM_EWMA_METER_SERVICE__GAIN:
				setGain((Long)newValue);
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
			case CimPackage.CIM_EWMA_METER_SERVICE__AVERAGE_RATE:
				setAverageRate(AVERAGE_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_EWMA_METER_SERVICE__DELTA_INTERVAL:
				setDeltaInterval(DELTA_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_EWMA_METER_SERVICE__GAIN:
				setGain(GAIN_EDEFAULT);
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
			case CimPackage.CIM_EWMA_METER_SERVICE__AVERAGE_RATE:
				return AVERAGE_RATE_EDEFAULT == null ? averageRate != null : !AVERAGE_RATE_EDEFAULT.equals(averageRate);
			case CimPackage.CIM_EWMA_METER_SERVICE__DELTA_INTERVAL:
				return DELTA_INTERVAL_EDEFAULT == null ? deltaInterval != null : !DELTA_INTERVAL_EDEFAULT.equals(deltaInterval);
			case CimPackage.CIM_EWMA_METER_SERVICE__GAIN:
				return GAIN_EDEFAULT == null ? gain != null : !GAIN_EDEFAULT.equals(gain);
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
		result.append(" (AverageRate: ");
		result.append(averageRate);
		result.append(", DeltaInterval: ");
		result.append(deltaInterval);
		result.append(", Gain: ");
		result.append(gain);
		result.append(')');
		return result.toString();
	}

} //CIM_EWMAMeterServiceImpl

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

import org.dmtf.cim.CIM_DropThresholdCalculationService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Drop Threshold Calculation Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DropThresholdCalculationServiceImpl#getSmoothingWeight <em>Smoothing Weight</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DropThresholdCalculationServiceImpl#getTimeInterval <em>Time Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DropThresholdCalculationServiceImpl extends CIM_ServiceImpl implements CIM_DropThresholdCalculationService {
	/**
	 * The default value of the '{@link #getSmoothingWeight() <em>Smoothing Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmoothingWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Long SMOOTHING_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmoothingWeight() <em>Smoothing Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmoothingWeight()
	 * @generated
	 * @ordered
	 */
	protected Long smoothingWeight = SMOOTHING_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long TIME_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeInterval() <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected Long timeInterval = TIME_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DropThresholdCalculationServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DropThresholdCalculationService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSmoothingWeight() {
		return smoothingWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmoothingWeight(Long newSmoothingWeight) {
		Long oldSmoothingWeight = smoothingWeight;
		smoothingWeight = newSmoothingWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DROP_THRESHOLD_CALCULATION_SERVICE__SMOOTHING_WEIGHT, oldSmoothingWeight, smoothingWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTimeInterval() {
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeInterval(Long newTimeInterval) {
		Long oldTimeInterval = timeInterval;
		timeInterval = newTimeInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DROP_THRESHOLD_CALCULATION_SERVICE__TIME_INTERVAL, oldTimeInterval, timeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DROP_THRESHOLD_CALCULATION_SERVICE__SMOOTHING_WEIGHT:
				return getSmoothingWeight();
			case CimPackage.CIM_DROP_THRESHOLD_CALCULATION_SERVICE__TIME_INTERVAL:
				return getTimeInterval();
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
			case CimPackage.CIM_DROP_THRESHOLD_CALCULATION_SERVICE__SMOOTHING_WEIGHT:
				setSmoothingWeight((Long)newValue);
				return;
			case CimPackage.CIM_DROP_THRESHOLD_CALCULATION_SERVICE__TIME_INTERVAL:
				setTimeInterval((Long)newValue);
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
			case CimPackage.CIM_DROP_THRESHOLD_CALCULATION_SERVICE__SMOOTHING_WEIGHT:
				setSmoothingWeight(SMOOTHING_WEIGHT_EDEFAULT);
				return;
			case CimPackage.CIM_DROP_THRESHOLD_CALCULATION_SERVICE__TIME_INTERVAL:
				setTimeInterval(TIME_INTERVAL_EDEFAULT);
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
			case CimPackage.CIM_DROP_THRESHOLD_CALCULATION_SERVICE__SMOOTHING_WEIGHT:
				return SMOOTHING_WEIGHT_EDEFAULT == null ? smoothingWeight != null : !SMOOTHING_WEIGHT_EDEFAULT.equals(smoothingWeight);
			case CimPackage.CIM_DROP_THRESHOLD_CALCULATION_SERVICE__TIME_INTERVAL:
				return TIME_INTERVAL_EDEFAULT == null ? timeInterval != null : !TIME_INTERVAL_EDEFAULT.equals(timeInterval);
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
		result.append(" (SmoothingWeight: ");
		result.append(smoothingWeight);
		result.append(", TimeInterval: ");
		result.append(timeInterval);
		result.append(')');
		return result.toString();
	}

} //CIM_DropThresholdCalculationServiceImpl

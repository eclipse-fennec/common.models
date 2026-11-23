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

import org.dmtf.cim.CIM_TokenBucketMeterService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Token Bucket Meter Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenBucketMeterServiceImpl#getAverageRate <em>Average Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenBucketMeterServiceImpl#getPeakRate <em>Peak Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenBucketMeterServiceImpl#getBurstSize <em>Burst Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TokenBucketMeterServiceImpl#getExcessBurstSize <em>Excess Burst Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TokenBucketMeterServiceImpl extends CIM_MeterServiceImpl implements CIM_TokenBucketMeterService {
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
	 * The default value of the '{@link #getPeakRate() <em>Peak Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long PEAK_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeakRate() <em>Peak Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakRate()
	 * @generated
	 * @ordered
	 */
	protected Long peakRate = PEAK_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBurstSize() <em>Burst Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long BURST_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBurstSize() <em>Burst Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBurstSize()
	 * @generated
	 * @ordered
	 */
	protected Long burstSize = BURST_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcessBurstSize() <em>Excess Burst Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcessBurstSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long EXCESS_BURST_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcessBurstSize() <em>Excess Burst Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcessBurstSize()
	 * @generated
	 * @ordered
	 */
	protected Long excessBurstSize = EXCESS_BURST_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TokenBucketMeterServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TokenBucketMeterService();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__AVERAGE_RATE, oldAverageRate, averageRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPeakRate() {
		return peakRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeakRate(Long newPeakRate) {
		Long oldPeakRate = peakRate;
		peakRate = newPeakRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__PEAK_RATE, oldPeakRate, peakRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBurstSize() {
		return burstSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBurstSize(Long newBurstSize) {
		Long oldBurstSize = burstSize;
		burstSize = newBurstSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__BURST_SIZE, oldBurstSize, burstSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getExcessBurstSize() {
		return excessBurstSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExcessBurstSize(Long newExcessBurstSize) {
		Long oldExcessBurstSize = excessBurstSize;
		excessBurstSize = newExcessBurstSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__EXCESS_BURST_SIZE, oldExcessBurstSize, excessBurstSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__AVERAGE_RATE:
				return getAverageRate();
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__PEAK_RATE:
				return getPeakRate();
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__BURST_SIZE:
				return getBurstSize();
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__EXCESS_BURST_SIZE:
				return getExcessBurstSize();
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
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__AVERAGE_RATE:
				setAverageRate((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__PEAK_RATE:
				setPeakRate((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__BURST_SIZE:
				setBurstSize((Long)newValue);
				return;
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__EXCESS_BURST_SIZE:
				setExcessBurstSize((Long)newValue);
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
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__AVERAGE_RATE:
				setAverageRate(AVERAGE_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__PEAK_RATE:
				setPeakRate(PEAK_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__BURST_SIZE:
				setBurstSize(BURST_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__EXCESS_BURST_SIZE:
				setExcessBurstSize(EXCESS_BURST_SIZE_EDEFAULT);
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
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__AVERAGE_RATE:
				return AVERAGE_RATE_EDEFAULT == null ? averageRate != null : !AVERAGE_RATE_EDEFAULT.equals(averageRate);
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__PEAK_RATE:
				return PEAK_RATE_EDEFAULT == null ? peakRate != null : !PEAK_RATE_EDEFAULT.equals(peakRate);
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__BURST_SIZE:
				return BURST_SIZE_EDEFAULT == null ? burstSize != null : !BURST_SIZE_EDEFAULT.equals(burstSize);
			case CimPackage.CIM_TOKEN_BUCKET_METER_SERVICE__EXCESS_BURST_SIZE:
				return EXCESS_BURST_SIZE_EDEFAULT == null ? excessBurstSize != null : !EXCESS_BURST_SIZE_EDEFAULT.equals(excessBurstSize);
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
		result.append(", PeakRate: ");
		result.append(peakRate);
		result.append(", BurstSize: ");
		result.append(burstSize);
		result.append(", ExcessBurstSize: ");
		result.append(excessBurstSize);
		result.append(')');
		return result.toString();
	}

} //CIM_TokenBucketMeterServiceImpl

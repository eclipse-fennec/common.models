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

import org.dmtf.cim.CIM_FCPortRateStatistics;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM FC Port Rate Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortRateStatisticsImpl#getTxFrameRate <em>Tx Frame Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortRateStatisticsImpl#getRxFrameRate <em>Rx Frame Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortRateStatisticsImpl#getMaxTxFrameRate <em>Max Tx Frame Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortRateStatisticsImpl#getMaxRxFrameRate <em>Max Rx Frame Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortRateStatisticsImpl#getTxRate <em>Tx Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortRateStatisticsImpl#getRxRate <em>Rx Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortRateStatisticsImpl#getPeakTxRate <em>Peak Tx Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FCPortRateStatisticsImpl#getPeakRxRate <em>Peak Rx Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FCPortRateStatisticsImpl extends CIM_StatisticalDataImpl implements CIM_FCPortRateStatistics {
	/**
	 * The default value of the '{@link #getTxFrameRate() <em>Tx Frame Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxFrameRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long TX_FRAME_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxFrameRate() <em>Tx Frame Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxFrameRate()
	 * @generated
	 * @ordered
	 */
	protected Long txFrameRate = TX_FRAME_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRxFrameRate() <em>Rx Frame Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxFrameRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long RX_FRAME_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRxFrameRate() <em>Rx Frame Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxFrameRate()
	 * @generated
	 * @ordered
	 */
	protected Long rxFrameRate = RX_FRAME_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTxFrameRate() <em>Max Tx Frame Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTxFrameRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_TX_FRAME_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxTxFrameRate() <em>Max Tx Frame Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTxFrameRate()
	 * @generated
	 * @ordered
	 */
	protected Long maxTxFrameRate = MAX_TX_FRAME_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRxFrameRate() <em>Max Rx Frame Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRxFrameRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_RX_FRAME_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxRxFrameRate() <em>Max Rx Frame Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRxFrameRate()
	 * @generated
	 * @ordered
	 */
	protected Long maxRxFrameRate = MAX_RX_FRAME_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxRate() <em>Tx Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long TX_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxRate() <em>Tx Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxRate()
	 * @generated
	 * @ordered
	 */
	protected Long txRate = TX_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRxRate() <em>Rx Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long RX_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRxRate() <em>Rx Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRxRate()
	 * @generated
	 * @ordered
	 */
	protected Long rxRate = RX_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeakTxRate() <em>Peak Tx Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakTxRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long PEAK_TX_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeakTxRate() <em>Peak Tx Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakTxRate()
	 * @generated
	 * @ordered
	 */
	protected Long peakTxRate = PEAK_TX_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeakRxRate() <em>Peak Rx Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakRxRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long PEAK_RX_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeakRxRate() <em>Peak Rx Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeakRxRate()
	 * @generated
	 * @ordered
	 */
	protected Long peakRxRate = PEAK_RX_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FCPortRateStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FCPortRateStatistics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTxFrameRate() {
		return txFrameRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTxFrameRate(Long newTxFrameRate) {
		Long oldTxFrameRate = txFrameRate;
		txFrameRate = newTxFrameRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_RATE_STATISTICS__TX_FRAME_RATE, oldTxFrameRate, txFrameRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRxFrameRate() {
		return rxFrameRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRxFrameRate(Long newRxFrameRate) {
		Long oldRxFrameRate = rxFrameRate;
		rxFrameRate = newRxFrameRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_RATE_STATISTICS__RX_FRAME_RATE, oldRxFrameRate, rxFrameRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxTxFrameRate() {
		return maxTxFrameRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTxFrameRate(Long newMaxTxFrameRate) {
		Long oldMaxTxFrameRate = maxTxFrameRate;
		maxTxFrameRate = newMaxTxFrameRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_RATE_STATISTICS__MAX_TX_FRAME_RATE, oldMaxTxFrameRate, maxTxFrameRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxRxFrameRate() {
		return maxRxFrameRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRxFrameRate(Long newMaxRxFrameRate) {
		Long oldMaxRxFrameRate = maxRxFrameRate;
		maxRxFrameRate = newMaxRxFrameRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_RATE_STATISTICS__MAX_RX_FRAME_RATE, oldMaxRxFrameRate, maxRxFrameRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTxRate() {
		return txRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTxRate(Long newTxRate) {
		Long oldTxRate = txRate;
		txRate = newTxRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_RATE_STATISTICS__TX_RATE, oldTxRate, txRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRxRate() {
		return rxRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRxRate(Long newRxRate) {
		Long oldRxRate = rxRate;
		rxRate = newRxRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_RATE_STATISTICS__RX_RATE, oldRxRate, rxRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPeakTxRate() {
		return peakTxRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeakTxRate(Long newPeakTxRate) {
		Long oldPeakTxRate = peakTxRate;
		peakTxRate = newPeakTxRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_RATE_STATISTICS__PEAK_TX_RATE, oldPeakTxRate, peakTxRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPeakRxRate() {
		return peakRxRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeakRxRate(Long newPeakRxRate) {
		Long oldPeakRxRate = peakRxRate;
		peakRxRate = newPeakRxRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FC_PORT_RATE_STATISTICS__PEAK_RX_RATE, oldPeakRxRate, peakRxRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__TX_FRAME_RATE:
				return getTxFrameRate();
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__RX_FRAME_RATE:
				return getRxFrameRate();
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__MAX_TX_FRAME_RATE:
				return getMaxTxFrameRate();
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__MAX_RX_FRAME_RATE:
				return getMaxRxFrameRate();
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__TX_RATE:
				return getTxRate();
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__RX_RATE:
				return getRxRate();
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__PEAK_TX_RATE:
				return getPeakTxRate();
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__PEAK_RX_RATE:
				return getPeakRxRate();
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
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__TX_FRAME_RATE:
				setTxFrameRate((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__RX_FRAME_RATE:
				setRxFrameRate((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__MAX_TX_FRAME_RATE:
				setMaxTxFrameRate((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__MAX_RX_FRAME_RATE:
				setMaxRxFrameRate((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__TX_RATE:
				setTxRate((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__RX_RATE:
				setRxRate((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__PEAK_TX_RATE:
				setPeakTxRate((Long)newValue);
				return;
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__PEAK_RX_RATE:
				setPeakRxRate((Long)newValue);
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
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__TX_FRAME_RATE:
				setTxFrameRate(TX_FRAME_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__RX_FRAME_RATE:
				setRxFrameRate(RX_FRAME_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__MAX_TX_FRAME_RATE:
				setMaxTxFrameRate(MAX_TX_FRAME_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__MAX_RX_FRAME_RATE:
				setMaxRxFrameRate(MAX_RX_FRAME_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__TX_RATE:
				setTxRate(TX_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__RX_RATE:
				setRxRate(RX_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__PEAK_TX_RATE:
				setPeakTxRate(PEAK_TX_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__PEAK_RX_RATE:
				setPeakRxRate(PEAK_RX_RATE_EDEFAULT);
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
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__TX_FRAME_RATE:
				return TX_FRAME_RATE_EDEFAULT == null ? txFrameRate != null : !TX_FRAME_RATE_EDEFAULT.equals(txFrameRate);
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__RX_FRAME_RATE:
				return RX_FRAME_RATE_EDEFAULT == null ? rxFrameRate != null : !RX_FRAME_RATE_EDEFAULT.equals(rxFrameRate);
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__MAX_TX_FRAME_RATE:
				return MAX_TX_FRAME_RATE_EDEFAULT == null ? maxTxFrameRate != null : !MAX_TX_FRAME_RATE_EDEFAULT.equals(maxTxFrameRate);
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__MAX_RX_FRAME_RATE:
				return MAX_RX_FRAME_RATE_EDEFAULT == null ? maxRxFrameRate != null : !MAX_RX_FRAME_RATE_EDEFAULT.equals(maxRxFrameRate);
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__TX_RATE:
				return TX_RATE_EDEFAULT == null ? txRate != null : !TX_RATE_EDEFAULT.equals(txRate);
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__RX_RATE:
				return RX_RATE_EDEFAULT == null ? rxRate != null : !RX_RATE_EDEFAULT.equals(rxRate);
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__PEAK_TX_RATE:
				return PEAK_TX_RATE_EDEFAULT == null ? peakTxRate != null : !PEAK_TX_RATE_EDEFAULT.equals(peakTxRate);
			case CimPackage.CIM_FC_PORT_RATE_STATISTICS__PEAK_RX_RATE:
				return PEAK_RX_RATE_EDEFAULT == null ? peakRxRate != null : !PEAK_RX_RATE_EDEFAULT.equals(peakRxRate);
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
		result.append(" (TxFrameRate: ");
		result.append(txFrameRate);
		result.append(", RxFrameRate: ");
		result.append(rxFrameRate);
		result.append(", MaxTxFrameRate: ");
		result.append(maxTxFrameRate);
		result.append(", MaxRxFrameRate: ");
		result.append(maxRxFrameRate);
		result.append(", TxRate: ");
		result.append(txRate);
		result.append(", RxRate: ");
		result.append(rxRate);
		result.append(", PeakTxRate: ");
		result.append(peakTxRate);
		result.append(", PeakRxRate: ");
		result.append(peakRxRate);
		result.append(')');
		return result.toString();
	}

} //CIM_FCPortRateStatisticsImpl

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

import org.dmtf.cim.CIM_ADSLModem;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM ADSL Modem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ADSLModemImpl#getNoiseMargin <em>Noise Margin</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ADSLModemImpl#getLineAttenuation <em>Line Attenuation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ADSLModemImpl#getLineState <em>Line State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ADSLModemImpl#getTotalOutputPower <em>Total Output Power</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ADSLModemImpl#getMaxDataRate <em>Max Data Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ADSLModemImpl extends CIM_DSLModemImpl implements CIM_ADSLModem {
	/**
	 * The default value of the '{@link #getNoiseMargin() <em>Noise Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoiseMargin()
	 * @generated
	 * @ordered
	 */
	protected static final Long NOISE_MARGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNoiseMargin() <em>Noise Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoiseMargin()
	 * @generated
	 * @ordered
	 */
	protected Long noiseMargin = NOISE_MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineAttenuation() <em>Line Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineAttenuation()
	 * @generated
	 * @ordered
	 */
	protected static final Long LINE_ATTENUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineAttenuation() <em>Line Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineAttenuation()
	 * @generated
	 * @ordered
	 */
	protected Long lineAttenuation = LINE_ATTENUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineState() <em>Line State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineState()
	 * @generated
	 * @ordered
	 */
	protected static final Long LINE_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineState() <em>Line State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineState()
	 * @generated
	 * @ordered
	 */
	protected Long lineState = LINE_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalOutputPower() <em>Total Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalOutputPower()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_OUTPUT_POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalOutputPower() <em>Total Output Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalOutputPower()
	 * @generated
	 * @ordered
	 */
	protected Long totalOutputPower = TOTAL_OUTPUT_POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDataRate() <em>Max Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_DATA_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxDataRate() <em>Max Data Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataRate()
	 * @generated
	 * @ordered
	 */
	protected Long maxDataRate = MAX_DATA_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ADSLModemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ADSLModem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNoiseMargin() {
		return noiseMargin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoiseMargin(Long newNoiseMargin) {
		Long oldNoiseMargin = noiseMargin;
		noiseMargin = newNoiseMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADSL_MODEM__NOISE_MARGIN, oldNoiseMargin, noiseMargin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLineAttenuation() {
		return lineAttenuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineAttenuation(Long newLineAttenuation) {
		Long oldLineAttenuation = lineAttenuation;
		lineAttenuation = newLineAttenuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADSL_MODEM__LINE_ATTENUATION, oldLineAttenuation, lineAttenuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLineState() {
		return lineState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineState(Long newLineState) {
		Long oldLineState = lineState;
		lineState = newLineState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADSL_MODEM__LINE_STATE, oldLineState, lineState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalOutputPower() {
		return totalOutputPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalOutputPower(Long newTotalOutputPower) {
		Long oldTotalOutputPower = totalOutputPower;
		totalOutputPower = newTotalOutputPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADSL_MODEM__TOTAL_OUTPUT_POWER, oldTotalOutputPower, totalOutputPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxDataRate() {
		return maxDataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxDataRate(Long newMaxDataRate) {
		Long oldMaxDataRate = maxDataRate;
		maxDataRate = newMaxDataRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ADSL_MODEM__MAX_DATA_RATE, oldMaxDataRate, maxDataRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ADSL_MODEM__NOISE_MARGIN:
				return getNoiseMargin();
			case CimPackage.CIM_ADSL_MODEM__LINE_ATTENUATION:
				return getLineAttenuation();
			case CimPackage.CIM_ADSL_MODEM__LINE_STATE:
				return getLineState();
			case CimPackage.CIM_ADSL_MODEM__TOTAL_OUTPUT_POWER:
				return getTotalOutputPower();
			case CimPackage.CIM_ADSL_MODEM__MAX_DATA_RATE:
				return getMaxDataRate();
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
			case CimPackage.CIM_ADSL_MODEM__NOISE_MARGIN:
				setNoiseMargin((Long)newValue);
				return;
			case CimPackage.CIM_ADSL_MODEM__LINE_ATTENUATION:
				setLineAttenuation((Long)newValue);
				return;
			case CimPackage.CIM_ADSL_MODEM__LINE_STATE:
				setLineState((Long)newValue);
				return;
			case CimPackage.CIM_ADSL_MODEM__TOTAL_OUTPUT_POWER:
				setTotalOutputPower((Long)newValue);
				return;
			case CimPackage.CIM_ADSL_MODEM__MAX_DATA_RATE:
				setMaxDataRate((Long)newValue);
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
			case CimPackage.CIM_ADSL_MODEM__NOISE_MARGIN:
				setNoiseMargin(NOISE_MARGIN_EDEFAULT);
				return;
			case CimPackage.CIM_ADSL_MODEM__LINE_ATTENUATION:
				setLineAttenuation(LINE_ATTENUATION_EDEFAULT);
				return;
			case CimPackage.CIM_ADSL_MODEM__LINE_STATE:
				setLineState(LINE_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ADSL_MODEM__TOTAL_OUTPUT_POWER:
				setTotalOutputPower(TOTAL_OUTPUT_POWER_EDEFAULT);
				return;
			case CimPackage.CIM_ADSL_MODEM__MAX_DATA_RATE:
				setMaxDataRate(MAX_DATA_RATE_EDEFAULT);
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
			case CimPackage.CIM_ADSL_MODEM__NOISE_MARGIN:
				return NOISE_MARGIN_EDEFAULT == null ? noiseMargin != null : !NOISE_MARGIN_EDEFAULT.equals(noiseMargin);
			case CimPackage.CIM_ADSL_MODEM__LINE_ATTENUATION:
				return LINE_ATTENUATION_EDEFAULT == null ? lineAttenuation != null : !LINE_ATTENUATION_EDEFAULT.equals(lineAttenuation);
			case CimPackage.CIM_ADSL_MODEM__LINE_STATE:
				return LINE_STATE_EDEFAULT == null ? lineState != null : !LINE_STATE_EDEFAULT.equals(lineState);
			case CimPackage.CIM_ADSL_MODEM__TOTAL_OUTPUT_POWER:
				return TOTAL_OUTPUT_POWER_EDEFAULT == null ? totalOutputPower != null : !TOTAL_OUTPUT_POWER_EDEFAULT.equals(totalOutputPower);
			case CimPackage.CIM_ADSL_MODEM__MAX_DATA_RATE:
				return MAX_DATA_RATE_EDEFAULT == null ? maxDataRate != null : !MAX_DATA_RATE_EDEFAULT.equals(maxDataRate);
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
		result.append(" (NoiseMargin: ");
		result.append(noiseMargin);
		result.append(", LineAttenuation: ");
		result.append(lineAttenuation);
		result.append(", LineState: ");
		result.append(lineState);
		result.append(", TotalOutputPower: ");
		result.append(totalOutputPower);
		result.append(", MaxDataRate: ");
		result.append(maxDataRate);
		result.append(')');
		return result.toString();
	}

} //CIM_ADSLModemImpl

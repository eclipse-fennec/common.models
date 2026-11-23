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

import org.dmtf.cim.CIM_WiFiRadio;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Wi Fi Radio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiRadioImpl#getSignalStrength <em>Signal Strength</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiRadioImpl#getSignalNoise <em>Signal Noise</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiRadioImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WiFiRadioImpl#getFrequency <em>Frequency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_WiFiRadioImpl extends CIM_LogicalDeviceImpl implements CIM_WiFiRadio {
	/**
	 * The default value of the '{@link #getSignalStrength() <em>Signal Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalStrength()
	 * @generated
	 * @ordered
	 */
	protected static final Long SIGNAL_STRENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignalStrength() <em>Signal Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalStrength()
	 * @generated
	 * @ordered
	 */
	protected Long signalStrength = SIGNAL_STRENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignalNoise() <em>Signal Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalNoise()
	 * @generated
	 * @ordered
	 */
	protected static final Long SIGNAL_NOISE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignalNoise() <em>Signal Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalNoise()
	 * @generated
	 * @ordered
	 */
	protected Long signalNoise = SIGNAL_NOISE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHANNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected Integer channel = CHANNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final Long FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected Long frequency = FREQUENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_WiFiRadioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_WiFiRadio();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSignalStrength() {
		return signalStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalStrength(Long newSignalStrength) {
		Long oldSignalStrength = signalStrength;
		signalStrength = newSignalStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_RADIO__SIGNAL_STRENGTH, oldSignalStrength, signalStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSignalNoise() {
		return signalNoise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalNoise(Long newSignalNoise) {
		Long oldSignalNoise = signalNoise;
		signalNoise = newSignalNoise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_RADIO__SIGNAL_NOISE, oldSignalNoise, signalNoise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannel(Integer newChannel) {
		Integer oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_RADIO__CHANNEL, oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrequency(Long newFrequency) {
		Long oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WI_FI_RADIO__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_WI_FI_RADIO__SIGNAL_STRENGTH:
				return getSignalStrength();
			case CimPackage.CIM_WI_FI_RADIO__SIGNAL_NOISE:
				return getSignalNoise();
			case CimPackage.CIM_WI_FI_RADIO__CHANNEL:
				return getChannel();
			case CimPackage.CIM_WI_FI_RADIO__FREQUENCY:
				return getFrequency();
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
			case CimPackage.CIM_WI_FI_RADIO__SIGNAL_STRENGTH:
				setSignalStrength((Long)newValue);
				return;
			case CimPackage.CIM_WI_FI_RADIO__SIGNAL_NOISE:
				setSignalNoise((Long)newValue);
				return;
			case CimPackage.CIM_WI_FI_RADIO__CHANNEL:
				setChannel((Integer)newValue);
				return;
			case CimPackage.CIM_WI_FI_RADIO__FREQUENCY:
				setFrequency((Long)newValue);
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
			case CimPackage.CIM_WI_FI_RADIO__SIGNAL_STRENGTH:
				setSignalStrength(SIGNAL_STRENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_RADIO__SIGNAL_NOISE:
				setSignalNoise(SIGNAL_NOISE_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_RADIO__CHANNEL:
				setChannel(CHANNEL_EDEFAULT);
				return;
			case CimPackage.CIM_WI_FI_RADIO__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
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
			case CimPackage.CIM_WI_FI_RADIO__SIGNAL_STRENGTH:
				return SIGNAL_STRENGTH_EDEFAULT == null ? signalStrength != null : !SIGNAL_STRENGTH_EDEFAULT.equals(signalStrength);
			case CimPackage.CIM_WI_FI_RADIO__SIGNAL_NOISE:
				return SIGNAL_NOISE_EDEFAULT == null ? signalNoise != null : !SIGNAL_NOISE_EDEFAULT.equals(signalNoise);
			case CimPackage.CIM_WI_FI_RADIO__CHANNEL:
				return CHANNEL_EDEFAULT == null ? channel != null : !CHANNEL_EDEFAULT.equals(channel);
			case CimPackage.CIM_WI_FI_RADIO__FREQUENCY:
				return FREQUENCY_EDEFAULT == null ? frequency != null : !FREQUENCY_EDEFAULT.equals(frequency);
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
		result.append(" (SignalStrength: ");
		result.append(signalStrength);
		result.append(", SignalNoise: ");
		result.append(signalNoise);
		result.append(", Channel: ");
		result.append(channel);
		result.append(", Frequency: ");
		result.append(frequency);
		result.append(')');
		return result.toString();
	}

} //CIM_WiFiRadioImpl

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

import org.dmtf.cim.CIM_AlarmDevice;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Alarm Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlarmDeviceImpl#getAudibleAlarm <em>Audible Alarm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlarmDeviceImpl#getVisibleAlarm <em>Visible Alarm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlarmDeviceImpl#getMotionAlarm <em>Motion Alarm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlarmDeviceImpl#getUrgency <em>Urgency</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlarmDeviceImpl#getAlarmState <em>Alarm State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlarmDeviceImpl#getAudioIndicatorIsDisabled <em>Audio Indicator Is Disabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlarmDeviceImpl#getVisualIndicatorIsDisabled <em>Visual Indicator Is Disabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlarmDeviceImpl#getMotionIndicatorIsDisabled <em>Motion Indicator Is Disabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AlarmDeviceImpl extends CIM_LogicalDeviceImpl implements CIM_AlarmDevice {
	/**
	 * The default value of the '{@link #getAudibleAlarm() <em>Audible Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudibleAlarm()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUDIBLE_ALARM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAudibleAlarm() <em>Audible Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudibleAlarm()
	 * @generated
	 * @ordered
	 */
	protected Boolean audibleAlarm = AUDIBLE_ALARM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibleAlarm() <em>Visible Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleAlarm()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VISIBLE_ALARM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleAlarm() <em>Visible Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleAlarm()
	 * @generated
	 * @ordered
	 */
	protected Boolean visibleAlarm = VISIBLE_ALARM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotionAlarm() <em>Motion Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotionAlarm()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MOTION_ALARM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotionAlarm() <em>Motion Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotionAlarm()
	 * @generated
	 * @ordered
	 */
	protected Boolean motionAlarm = MOTION_ALARM_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrgency() <em>Urgency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrgency()
	 * @generated
	 * @ordered
	 */
	protected static final Integer URGENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrgency() <em>Urgency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrgency()
	 * @generated
	 * @ordered
	 */
	protected Integer urgency = URGENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlarmState() <em>Alarm State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALARM_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlarmState() <em>Alarm State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmState()
	 * @generated
	 * @ordered
	 */
	protected Integer alarmState = ALARM_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAudioIndicatorIsDisabled() <em>Audio Indicator Is Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioIndicatorIsDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUDIO_INDICATOR_IS_DISABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAudioIndicatorIsDisabled() <em>Audio Indicator Is Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioIndicatorIsDisabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean audioIndicatorIsDisabled = AUDIO_INDICATOR_IS_DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisualIndicatorIsDisabled() <em>Visual Indicator Is Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualIndicatorIsDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VISUAL_INDICATOR_IS_DISABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisualIndicatorIsDisabled() <em>Visual Indicator Is Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualIndicatorIsDisabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean visualIndicatorIsDisabled = VISUAL_INDICATOR_IS_DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotionIndicatorIsDisabled() <em>Motion Indicator Is Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotionIndicatorIsDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MOTION_INDICATOR_IS_DISABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotionIndicatorIsDisabled() <em>Motion Indicator Is Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotionIndicatorIsDisabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean motionIndicatorIsDisabled = MOTION_INDICATOR_IS_DISABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AlarmDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AlarmDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAudibleAlarm() {
		return audibleAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAudibleAlarm(Boolean newAudibleAlarm) {
		Boolean oldAudibleAlarm = audibleAlarm;
		audibleAlarm = newAudibleAlarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALARM_DEVICE__AUDIBLE_ALARM, oldAudibleAlarm, audibleAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getVisibleAlarm() {
		return visibleAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibleAlarm(Boolean newVisibleAlarm) {
		Boolean oldVisibleAlarm = visibleAlarm;
		visibleAlarm = newVisibleAlarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALARM_DEVICE__VISIBLE_ALARM, oldVisibleAlarm, visibleAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMotionAlarm() {
		return motionAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMotionAlarm(Boolean newMotionAlarm) {
		Boolean oldMotionAlarm = motionAlarm;
		motionAlarm = newMotionAlarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALARM_DEVICE__MOTION_ALARM, oldMotionAlarm, motionAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUrgency() {
		return urgency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrgency(Integer newUrgency) {
		Integer oldUrgency = urgency;
		urgency = newUrgency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALARM_DEVICE__URGENCY, oldUrgency, urgency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAlarmState() {
		return alarmState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlarmState(Integer newAlarmState) {
		Integer oldAlarmState = alarmState;
		alarmState = newAlarmState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALARM_DEVICE__ALARM_STATE, oldAlarmState, alarmState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAudioIndicatorIsDisabled() {
		return audioIndicatorIsDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAudioIndicatorIsDisabled(Boolean newAudioIndicatorIsDisabled) {
		Boolean oldAudioIndicatorIsDisabled = audioIndicatorIsDisabled;
		audioIndicatorIsDisabled = newAudioIndicatorIsDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALARM_DEVICE__AUDIO_INDICATOR_IS_DISABLED, oldAudioIndicatorIsDisabled, audioIndicatorIsDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getVisualIndicatorIsDisabled() {
		return visualIndicatorIsDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisualIndicatorIsDisabled(Boolean newVisualIndicatorIsDisabled) {
		Boolean oldVisualIndicatorIsDisabled = visualIndicatorIsDisabled;
		visualIndicatorIsDisabled = newVisualIndicatorIsDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALARM_DEVICE__VISUAL_INDICATOR_IS_DISABLED, oldVisualIndicatorIsDisabled, visualIndicatorIsDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMotionIndicatorIsDisabled() {
		return motionIndicatorIsDisabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMotionIndicatorIsDisabled(Boolean newMotionIndicatorIsDisabled) {
		Boolean oldMotionIndicatorIsDisabled = motionIndicatorIsDisabled;
		motionIndicatorIsDisabled = newMotionIndicatorIsDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALARM_DEVICE__MOTION_INDICATOR_IS_DISABLED, oldMotionIndicatorIsDisabled, motionIndicatorIsDisabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long SetAlarmState(Integer RequestedAlarmState) {
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
	public Long SetAlarmIndicator(Integer AudioIndicator, Integer VisualIndicator, Integer MotionIndicator) {
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
	public Long SetUrgency(Integer RequestedUrgency) {
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
			case CimPackage.CIM_ALARM_DEVICE__AUDIBLE_ALARM:
				return getAudibleAlarm();
			case CimPackage.CIM_ALARM_DEVICE__VISIBLE_ALARM:
				return getVisibleAlarm();
			case CimPackage.CIM_ALARM_DEVICE__MOTION_ALARM:
				return getMotionAlarm();
			case CimPackage.CIM_ALARM_DEVICE__URGENCY:
				return getUrgency();
			case CimPackage.CIM_ALARM_DEVICE__ALARM_STATE:
				return getAlarmState();
			case CimPackage.CIM_ALARM_DEVICE__AUDIO_INDICATOR_IS_DISABLED:
				return getAudioIndicatorIsDisabled();
			case CimPackage.CIM_ALARM_DEVICE__VISUAL_INDICATOR_IS_DISABLED:
				return getVisualIndicatorIsDisabled();
			case CimPackage.CIM_ALARM_DEVICE__MOTION_INDICATOR_IS_DISABLED:
				return getMotionIndicatorIsDisabled();
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
			case CimPackage.CIM_ALARM_DEVICE__AUDIBLE_ALARM:
				setAudibleAlarm((Boolean)newValue);
				return;
			case CimPackage.CIM_ALARM_DEVICE__VISIBLE_ALARM:
				setVisibleAlarm((Boolean)newValue);
				return;
			case CimPackage.CIM_ALARM_DEVICE__MOTION_ALARM:
				setMotionAlarm((Boolean)newValue);
				return;
			case CimPackage.CIM_ALARM_DEVICE__URGENCY:
				setUrgency((Integer)newValue);
				return;
			case CimPackage.CIM_ALARM_DEVICE__ALARM_STATE:
				setAlarmState((Integer)newValue);
				return;
			case CimPackage.CIM_ALARM_DEVICE__AUDIO_INDICATOR_IS_DISABLED:
				setAudioIndicatorIsDisabled((Boolean)newValue);
				return;
			case CimPackage.CIM_ALARM_DEVICE__VISUAL_INDICATOR_IS_DISABLED:
				setVisualIndicatorIsDisabled((Boolean)newValue);
				return;
			case CimPackage.CIM_ALARM_DEVICE__MOTION_INDICATOR_IS_DISABLED:
				setMotionIndicatorIsDisabled((Boolean)newValue);
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
			case CimPackage.CIM_ALARM_DEVICE__AUDIBLE_ALARM:
				setAudibleAlarm(AUDIBLE_ALARM_EDEFAULT);
				return;
			case CimPackage.CIM_ALARM_DEVICE__VISIBLE_ALARM:
				setVisibleAlarm(VISIBLE_ALARM_EDEFAULT);
				return;
			case CimPackage.CIM_ALARM_DEVICE__MOTION_ALARM:
				setMotionAlarm(MOTION_ALARM_EDEFAULT);
				return;
			case CimPackage.CIM_ALARM_DEVICE__URGENCY:
				setUrgency(URGENCY_EDEFAULT);
				return;
			case CimPackage.CIM_ALARM_DEVICE__ALARM_STATE:
				setAlarmState(ALARM_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ALARM_DEVICE__AUDIO_INDICATOR_IS_DISABLED:
				setAudioIndicatorIsDisabled(AUDIO_INDICATOR_IS_DISABLED_EDEFAULT);
				return;
			case CimPackage.CIM_ALARM_DEVICE__VISUAL_INDICATOR_IS_DISABLED:
				setVisualIndicatorIsDisabled(VISUAL_INDICATOR_IS_DISABLED_EDEFAULT);
				return;
			case CimPackage.CIM_ALARM_DEVICE__MOTION_INDICATOR_IS_DISABLED:
				setMotionIndicatorIsDisabled(MOTION_INDICATOR_IS_DISABLED_EDEFAULT);
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
			case CimPackage.CIM_ALARM_DEVICE__AUDIBLE_ALARM:
				return AUDIBLE_ALARM_EDEFAULT == null ? audibleAlarm != null : !AUDIBLE_ALARM_EDEFAULT.equals(audibleAlarm);
			case CimPackage.CIM_ALARM_DEVICE__VISIBLE_ALARM:
				return VISIBLE_ALARM_EDEFAULT == null ? visibleAlarm != null : !VISIBLE_ALARM_EDEFAULT.equals(visibleAlarm);
			case CimPackage.CIM_ALARM_DEVICE__MOTION_ALARM:
				return MOTION_ALARM_EDEFAULT == null ? motionAlarm != null : !MOTION_ALARM_EDEFAULT.equals(motionAlarm);
			case CimPackage.CIM_ALARM_DEVICE__URGENCY:
				return URGENCY_EDEFAULT == null ? urgency != null : !URGENCY_EDEFAULT.equals(urgency);
			case CimPackage.CIM_ALARM_DEVICE__ALARM_STATE:
				return ALARM_STATE_EDEFAULT == null ? alarmState != null : !ALARM_STATE_EDEFAULT.equals(alarmState);
			case CimPackage.CIM_ALARM_DEVICE__AUDIO_INDICATOR_IS_DISABLED:
				return AUDIO_INDICATOR_IS_DISABLED_EDEFAULT == null ? audioIndicatorIsDisabled != null : !AUDIO_INDICATOR_IS_DISABLED_EDEFAULT.equals(audioIndicatorIsDisabled);
			case CimPackage.CIM_ALARM_DEVICE__VISUAL_INDICATOR_IS_DISABLED:
				return VISUAL_INDICATOR_IS_DISABLED_EDEFAULT == null ? visualIndicatorIsDisabled != null : !VISUAL_INDICATOR_IS_DISABLED_EDEFAULT.equals(visualIndicatorIsDisabled);
			case CimPackage.CIM_ALARM_DEVICE__MOTION_INDICATOR_IS_DISABLED:
				return MOTION_INDICATOR_IS_DISABLED_EDEFAULT == null ? motionIndicatorIsDisabled != null : !MOTION_INDICATOR_IS_DISABLED_EDEFAULT.equals(motionIndicatorIsDisabled);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_ALARM_DEVICE___SET_ALARM_STATE__INTEGER:
				return SetAlarmState((Integer)arguments.get(0));
			case CimPackage.CIM_ALARM_DEVICE___SET_ALARM_INDICATOR__INTEGER_INTEGER_INTEGER:
				return SetAlarmIndicator((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case CimPackage.CIM_ALARM_DEVICE___SET_URGENCY__INTEGER:
				return SetUrgency((Integer)arguments.get(0));
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
		result.append(" (AudibleAlarm: ");
		result.append(audibleAlarm);
		result.append(", VisibleAlarm: ");
		result.append(visibleAlarm);
		result.append(", MotionAlarm: ");
		result.append(motionAlarm);
		result.append(", Urgency: ");
		result.append(urgency);
		result.append(", AlarmState: ");
		result.append(alarmState);
		result.append(", AudioIndicatorIsDisabled: ");
		result.append(audioIndicatorIsDisabled);
		result.append(", VisualIndicatorIsDisabled: ");
		result.append(visualIndicatorIsDisabled);
		result.append(", MotionIndicatorIsDisabled: ");
		result.append(motionIndicatorIsDisabled);
		result.append(')');
		return result.toString();
	}

} //CIM_AlarmDeviceImpl

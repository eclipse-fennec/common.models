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

import org.dmtf.cim.CIM_PlatformWatchdogService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Platform Watchdog Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PlatformWatchdogServiceImpl#getMonitoredEntityType <em>Monitored Entity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PlatformWatchdogServiceImpl#getOtherMonitoredEntityTypeDescription <em>Other Monitored Entity Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PlatformWatchdogServiceImpl#getTimeoutInterval <em>Timeout Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PlatformWatchdogServiceImpl#getTimerExpired <em>Timer Expired</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PlatformWatchdogServiceImpl#getTimerResolution <em>Timer Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PlatformWatchdogServiceImpl#getCurrentTimerValue <em>Current Timer Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PlatformWatchdogServiceImpl#getTimeOfLastExpiration <em>Time Of Last Expiration</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PlatformWatchdogServiceImpl#getActionOnExpiration <em>Action On Expiration</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PlatformWatchdogServiceImpl#getOtherActionOnExpiration <em>Other Action On Expiration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PlatformWatchdogServiceImpl extends CIM_ServiceImpl implements CIM_PlatformWatchdogService {
	/**
	 * The default value of the '{@link #getMonitoredEntityType() <em>Monitored Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredEntityType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MONITORED_ENTITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonitoredEntityType() <em>Monitored Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredEntityType()
	 * @generated
	 * @ordered
	 */
	protected Integer monitoredEntityType = MONITORED_ENTITY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherMonitoredEntityTypeDescription() <em>Other Monitored Entity Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMonitoredEntityTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_MONITORED_ENTITY_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherMonitoredEntityTypeDescription() <em>Other Monitored Entity Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMonitoredEntityTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherMonitoredEntityTypeDescription = OTHER_MONITORED_ENTITY_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeoutInterval() <em>Timeout Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutInterval() <em>Timeout Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutInterval()
	 * @generated
	 * @ordered
	 */
	protected String timeoutInterval = TIMEOUT_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimerExpired() <em>Timer Expired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerExpired()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TIMER_EXPIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimerExpired() <em>Timer Expired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerExpired()
	 * @generated
	 * @ordered
	 */
	protected Boolean timerExpired = TIMER_EXPIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimerResolution() <em>Timer Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerResolution()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMER_RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimerResolution() <em>Timer Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerResolution()
	 * @generated
	 * @ordered
	 */
	protected String timerResolution = TIMER_RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentTimerValue() <em>Current Timer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTimerValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_TIMER_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentTimerValue() <em>Current Timer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTimerValue()
	 * @generated
	 * @ordered
	 */
	protected String currentTimerValue = CURRENT_TIMER_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOfLastExpiration() <em>Time Of Last Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastExpiration()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_OF_LAST_EXPIRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOfLastExpiration() <em>Time Of Last Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastExpiration()
	 * @generated
	 * @ordered
	 */
	protected String timeOfLastExpiration = TIME_OF_LAST_EXPIRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionOnExpiration() <em>Action On Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionOnExpiration()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACTION_ON_EXPIRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionOnExpiration() <em>Action On Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionOnExpiration()
	 * @generated
	 * @ordered
	 */
	protected Integer actionOnExpiration = ACTION_ON_EXPIRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherActionOnExpiration() <em>Other Action On Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherActionOnExpiration()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ACTION_ON_EXPIRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherActionOnExpiration() <em>Other Action On Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherActionOnExpiration()
	 * @generated
	 * @ordered
	 */
	protected String otherActionOnExpiration = OTHER_ACTION_ON_EXPIRATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PlatformWatchdogServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PlatformWatchdogService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMonitoredEntityType() {
		return monitoredEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoredEntityType(Integer newMonitoredEntityType) {
		Integer oldMonitoredEntityType = monitoredEntityType;
		monitoredEntityType = newMonitoredEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__MONITORED_ENTITY_TYPE, oldMonitoredEntityType, monitoredEntityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherMonitoredEntityTypeDescription() {
		return otherMonitoredEntityTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherMonitoredEntityTypeDescription(String newOtherMonitoredEntityTypeDescription) {
		String oldOtherMonitoredEntityTypeDescription = otherMonitoredEntityTypeDescription;
		otherMonitoredEntityTypeDescription = newOtherMonitoredEntityTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__OTHER_MONITORED_ENTITY_TYPE_DESCRIPTION, oldOtherMonitoredEntityTypeDescription, otherMonitoredEntityTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeoutInterval() {
		return timeoutInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeoutInterval(String newTimeoutInterval) {
		String oldTimeoutInterval = timeoutInterval;
		timeoutInterval = newTimeoutInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIMEOUT_INTERVAL, oldTimeoutInterval, timeoutInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTimerExpired() {
		return timerExpired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimerExpired(Boolean newTimerExpired) {
		Boolean oldTimerExpired = timerExpired;
		timerExpired = newTimerExpired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIMER_EXPIRED, oldTimerExpired, timerExpired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimerResolution() {
		return timerResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimerResolution(String newTimerResolution) {
		String oldTimerResolution = timerResolution;
		timerResolution = newTimerResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIMER_RESOLUTION, oldTimerResolution, timerResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentTimerValue() {
		return currentTimerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentTimerValue(String newCurrentTimerValue) {
		String oldCurrentTimerValue = currentTimerValue;
		currentTimerValue = newCurrentTimerValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__CURRENT_TIMER_VALUE, oldCurrentTimerValue, currentTimerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeOfLastExpiration() {
		return timeOfLastExpiration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOfLastExpiration(String newTimeOfLastExpiration) {
		String oldTimeOfLastExpiration = timeOfLastExpiration;
		timeOfLastExpiration = newTimeOfLastExpiration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIME_OF_LAST_EXPIRATION, oldTimeOfLastExpiration, timeOfLastExpiration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getActionOnExpiration() {
		return actionOnExpiration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionOnExpiration(Integer newActionOnExpiration) {
		Integer oldActionOnExpiration = actionOnExpiration;
		actionOnExpiration = newActionOnExpiration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__ACTION_ON_EXPIRATION, oldActionOnExpiration, actionOnExpiration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherActionOnExpiration() {
		return otherActionOnExpiration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherActionOnExpiration(String newOtherActionOnExpiration) {
		String oldOtherActionOnExpiration = otherActionOnExpiration;
		otherActionOnExpiration = newOtherActionOnExpiration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__OTHER_ACTION_ON_EXPIRATION, oldOtherActionOnExpiration, otherActionOnExpiration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__MONITORED_ENTITY_TYPE:
				return getMonitoredEntityType();
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__OTHER_MONITORED_ENTITY_TYPE_DESCRIPTION:
				return getOtherMonitoredEntityTypeDescription();
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIMEOUT_INTERVAL:
				return getTimeoutInterval();
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIMER_EXPIRED:
				return getTimerExpired();
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIMER_RESOLUTION:
				return getTimerResolution();
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__CURRENT_TIMER_VALUE:
				return getCurrentTimerValue();
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIME_OF_LAST_EXPIRATION:
				return getTimeOfLastExpiration();
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__ACTION_ON_EXPIRATION:
				return getActionOnExpiration();
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__OTHER_ACTION_ON_EXPIRATION:
				return getOtherActionOnExpiration();
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
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__MONITORED_ENTITY_TYPE:
				setMonitoredEntityType((Integer)newValue);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__OTHER_MONITORED_ENTITY_TYPE_DESCRIPTION:
				setOtherMonitoredEntityTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIMEOUT_INTERVAL:
				setTimeoutInterval((String)newValue);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIMER_EXPIRED:
				setTimerExpired((Boolean)newValue);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIMER_RESOLUTION:
				setTimerResolution((String)newValue);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__CURRENT_TIMER_VALUE:
				setCurrentTimerValue((String)newValue);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIME_OF_LAST_EXPIRATION:
				setTimeOfLastExpiration((String)newValue);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__ACTION_ON_EXPIRATION:
				setActionOnExpiration((Integer)newValue);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__OTHER_ACTION_ON_EXPIRATION:
				setOtherActionOnExpiration((String)newValue);
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
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__MONITORED_ENTITY_TYPE:
				setMonitoredEntityType(MONITORED_ENTITY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__OTHER_MONITORED_ENTITY_TYPE_DESCRIPTION:
				setOtherMonitoredEntityTypeDescription(OTHER_MONITORED_ENTITY_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIMEOUT_INTERVAL:
				setTimeoutInterval(TIMEOUT_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIMER_EXPIRED:
				setTimerExpired(TIMER_EXPIRED_EDEFAULT);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIMER_RESOLUTION:
				setTimerResolution(TIMER_RESOLUTION_EDEFAULT);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__CURRENT_TIMER_VALUE:
				setCurrentTimerValue(CURRENT_TIMER_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIME_OF_LAST_EXPIRATION:
				setTimeOfLastExpiration(TIME_OF_LAST_EXPIRATION_EDEFAULT);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__ACTION_ON_EXPIRATION:
				setActionOnExpiration(ACTION_ON_EXPIRATION_EDEFAULT);
				return;
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__OTHER_ACTION_ON_EXPIRATION:
				setOtherActionOnExpiration(OTHER_ACTION_ON_EXPIRATION_EDEFAULT);
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
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__MONITORED_ENTITY_TYPE:
				return MONITORED_ENTITY_TYPE_EDEFAULT == null ? monitoredEntityType != null : !MONITORED_ENTITY_TYPE_EDEFAULT.equals(monitoredEntityType);
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__OTHER_MONITORED_ENTITY_TYPE_DESCRIPTION:
				return OTHER_MONITORED_ENTITY_TYPE_DESCRIPTION_EDEFAULT == null ? otherMonitoredEntityTypeDescription != null : !OTHER_MONITORED_ENTITY_TYPE_DESCRIPTION_EDEFAULT.equals(otherMonitoredEntityTypeDescription);
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIMEOUT_INTERVAL:
				return TIMEOUT_INTERVAL_EDEFAULT == null ? timeoutInterval != null : !TIMEOUT_INTERVAL_EDEFAULT.equals(timeoutInterval);
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIMER_EXPIRED:
				return TIMER_EXPIRED_EDEFAULT == null ? timerExpired != null : !TIMER_EXPIRED_EDEFAULT.equals(timerExpired);
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIMER_RESOLUTION:
				return TIMER_RESOLUTION_EDEFAULT == null ? timerResolution != null : !TIMER_RESOLUTION_EDEFAULT.equals(timerResolution);
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__CURRENT_TIMER_VALUE:
				return CURRENT_TIMER_VALUE_EDEFAULT == null ? currentTimerValue != null : !CURRENT_TIMER_VALUE_EDEFAULT.equals(currentTimerValue);
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__TIME_OF_LAST_EXPIRATION:
				return TIME_OF_LAST_EXPIRATION_EDEFAULT == null ? timeOfLastExpiration != null : !TIME_OF_LAST_EXPIRATION_EDEFAULT.equals(timeOfLastExpiration);
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__ACTION_ON_EXPIRATION:
				return ACTION_ON_EXPIRATION_EDEFAULT == null ? actionOnExpiration != null : !ACTION_ON_EXPIRATION_EDEFAULT.equals(actionOnExpiration);
			case CimPackage.CIM_PLATFORM_WATCHDOG_SERVICE__OTHER_ACTION_ON_EXPIRATION:
				return OTHER_ACTION_ON_EXPIRATION_EDEFAULT == null ? otherActionOnExpiration != null : !OTHER_ACTION_ON_EXPIRATION_EDEFAULT.equals(otherActionOnExpiration);
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
		result.append(" (MonitoredEntityType: ");
		result.append(monitoredEntityType);
		result.append(", OtherMonitoredEntityTypeDescription: ");
		result.append(otherMonitoredEntityTypeDescription);
		result.append(", TimeoutInterval: ");
		result.append(timeoutInterval);
		result.append(", TimerExpired: ");
		result.append(timerExpired);
		result.append(", TimerResolution: ");
		result.append(timerResolution);
		result.append(", CurrentTimerValue: ");
		result.append(currentTimerValue);
		result.append(", TimeOfLastExpiration: ");
		result.append(timeOfLastExpiration);
		result.append(", ActionOnExpiration: ");
		result.append(actionOnExpiration);
		result.append(", OtherActionOnExpiration: ");
		result.append(otherActionOnExpiration);
		result.append(')');
		return result.toString();
	}

} //CIM_PlatformWatchdogServiceImpl

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

import org.dmtf.cim.CIM_Watchdog;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Watchdog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_WatchdogImpl#getMonitoredEntity <em>Monitored Entity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WatchdogImpl#getMonitoredEntityDescription <em>Monitored Entity Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WatchdogImpl#getTimeoutInterval <em>Timeout Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WatchdogImpl#getTimerResolution <em>Timer Resolution</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WatchdogImpl#getTimeOfLastExpiration <em>Time Of Last Expiration</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WatchdogImpl#getMonitoredEntityOnLastExpiration <em>Monitored Entity On Last Expiration</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_WatchdogImpl#getActionOnExpiration <em>Action On Expiration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_WatchdogImpl extends CIM_LogicalDeviceImpl implements CIM_Watchdog {
	/**
	 * The default value of the '{@link #getMonitoredEntity() <em>Monitored Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredEntity()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MONITORED_ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonitoredEntity() <em>Monitored Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredEntity()
	 * @generated
	 * @ordered
	 */
	protected Integer monitoredEntity = MONITORED_ENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonitoredEntityDescription() <em>Monitored Entity Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredEntityDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String MONITORED_ENTITY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonitoredEntityDescription() <em>Monitored Entity Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredEntityDescription()
	 * @generated
	 * @ordered
	 */
	protected String monitoredEntityDescription = MONITORED_ENTITY_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeoutInterval() <em>Timeout Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long TIMEOUT_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutInterval() <em>Timeout Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutInterval()
	 * @generated
	 * @ordered
	 */
	protected Long timeoutInterval = TIMEOUT_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimerResolution() <em>Timer Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Long TIMER_RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimerResolution() <em>Timer Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerResolution()
	 * @generated
	 * @ordered
	 */
	protected Long timerResolution = TIMER_RESOLUTION_EDEFAULT;

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
	 * The default value of the '{@link #getMonitoredEntityOnLastExpiration() <em>Monitored Entity On Last Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredEntityOnLastExpiration()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MONITORED_ENTITY_ON_LAST_EXPIRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonitoredEntityOnLastExpiration() <em>Monitored Entity On Last Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoredEntityOnLastExpiration()
	 * @generated
	 * @ordered
	 */
	protected Integer monitoredEntityOnLastExpiration = MONITORED_ENTITY_ON_LAST_EXPIRATION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_WatchdogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Watchdog();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMonitoredEntity() {
		return monitoredEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoredEntity(Integer newMonitoredEntity) {
		Integer oldMonitoredEntity = monitoredEntity;
		monitoredEntity = newMonitoredEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WATCHDOG__MONITORED_ENTITY, oldMonitoredEntity, monitoredEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMonitoredEntityDescription() {
		return monitoredEntityDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoredEntityDescription(String newMonitoredEntityDescription) {
		String oldMonitoredEntityDescription = monitoredEntityDescription;
		monitoredEntityDescription = newMonitoredEntityDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WATCHDOG__MONITORED_ENTITY_DESCRIPTION, oldMonitoredEntityDescription, monitoredEntityDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTimeoutInterval() {
		return timeoutInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeoutInterval(Long newTimeoutInterval) {
		Long oldTimeoutInterval = timeoutInterval;
		timeoutInterval = newTimeoutInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WATCHDOG__TIMEOUT_INTERVAL, oldTimeoutInterval, timeoutInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTimerResolution() {
		return timerResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimerResolution(Long newTimerResolution) {
		Long oldTimerResolution = timerResolution;
		timerResolution = newTimerResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WATCHDOG__TIMER_RESOLUTION, oldTimerResolution, timerResolution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WATCHDOG__TIME_OF_LAST_EXPIRATION, oldTimeOfLastExpiration, timeOfLastExpiration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMonitoredEntityOnLastExpiration() {
		return monitoredEntityOnLastExpiration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoredEntityOnLastExpiration(Integer newMonitoredEntityOnLastExpiration) {
		Integer oldMonitoredEntityOnLastExpiration = monitoredEntityOnLastExpiration;
		monitoredEntityOnLastExpiration = newMonitoredEntityOnLastExpiration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WATCHDOG__MONITORED_ENTITY_ON_LAST_EXPIRATION, oldMonitoredEntityOnLastExpiration, monitoredEntityOnLastExpiration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_WATCHDOG__ACTION_ON_EXPIRATION, oldActionOnExpiration, actionOnExpiration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long KeepAlive() {
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
			case CimPackage.CIM_WATCHDOG__MONITORED_ENTITY:
				return getMonitoredEntity();
			case CimPackage.CIM_WATCHDOG__MONITORED_ENTITY_DESCRIPTION:
				return getMonitoredEntityDescription();
			case CimPackage.CIM_WATCHDOG__TIMEOUT_INTERVAL:
				return getTimeoutInterval();
			case CimPackage.CIM_WATCHDOG__TIMER_RESOLUTION:
				return getTimerResolution();
			case CimPackage.CIM_WATCHDOG__TIME_OF_LAST_EXPIRATION:
				return getTimeOfLastExpiration();
			case CimPackage.CIM_WATCHDOG__MONITORED_ENTITY_ON_LAST_EXPIRATION:
				return getMonitoredEntityOnLastExpiration();
			case CimPackage.CIM_WATCHDOG__ACTION_ON_EXPIRATION:
				return getActionOnExpiration();
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
			case CimPackage.CIM_WATCHDOG__MONITORED_ENTITY:
				setMonitoredEntity((Integer)newValue);
				return;
			case CimPackage.CIM_WATCHDOG__MONITORED_ENTITY_DESCRIPTION:
				setMonitoredEntityDescription((String)newValue);
				return;
			case CimPackage.CIM_WATCHDOG__TIMEOUT_INTERVAL:
				setTimeoutInterval((Long)newValue);
				return;
			case CimPackage.CIM_WATCHDOG__TIMER_RESOLUTION:
				setTimerResolution((Long)newValue);
				return;
			case CimPackage.CIM_WATCHDOG__TIME_OF_LAST_EXPIRATION:
				setTimeOfLastExpiration((String)newValue);
				return;
			case CimPackage.CIM_WATCHDOG__MONITORED_ENTITY_ON_LAST_EXPIRATION:
				setMonitoredEntityOnLastExpiration((Integer)newValue);
				return;
			case CimPackage.CIM_WATCHDOG__ACTION_ON_EXPIRATION:
				setActionOnExpiration((Integer)newValue);
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
			case CimPackage.CIM_WATCHDOG__MONITORED_ENTITY:
				setMonitoredEntity(MONITORED_ENTITY_EDEFAULT);
				return;
			case CimPackage.CIM_WATCHDOG__MONITORED_ENTITY_DESCRIPTION:
				setMonitoredEntityDescription(MONITORED_ENTITY_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_WATCHDOG__TIMEOUT_INTERVAL:
				setTimeoutInterval(TIMEOUT_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_WATCHDOG__TIMER_RESOLUTION:
				setTimerResolution(TIMER_RESOLUTION_EDEFAULT);
				return;
			case CimPackage.CIM_WATCHDOG__TIME_OF_LAST_EXPIRATION:
				setTimeOfLastExpiration(TIME_OF_LAST_EXPIRATION_EDEFAULT);
				return;
			case CimPackage.CIM_WATCHDOG__MONITORED_ENTITY_ON_LAST_EXPIRATION:
				setMonitoredEntityOnLastExpiration(MONITORED_ENTITY_ON_LAST_EXPIRATION_EDEFAULT);
				return;
			case CimPackage.CIM_WATCHDOG__ACTION_ON_EXPIRATION:
				setActionOnExpiration(ACTION_ON_EXPIRATION_EDEFAULT);
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
			case CimPackage.CIM_WATCHDOG__MONITORED_ENTITY:
				return MONITORED_ENTITY_EDEFAULT == null ? monitoredEntity != null : !MONITORED_ENTITY_EDEFAULT.equals(monitoredEntity);
			case CimPackage.CIM_WATCHDOG__MONITORED_ENTITY_DESCRIPTION:
				return MONITORED_ENTITY_DESCRIPTION_EDEFAULT == null ? monitoredEntityDescription != null : !MONITORED_ENTITY_DESCRIPTION_EDEFAULT.equals(monitoredEntityDescription);
			case CimPackage.CIM_WATCHDOG__TIMEOUT_INTERVAL:
				return TIMEOUT_INTERVAL_EDEFAULT == null ? timeoutInterval != null : !TIMEOUT_INTERVAL_EDEFAULT.equals(timeoutInterval);
			case CimPackage.CIM_WATCHDOG__TIMER_RESOLUTION:
				return TIMER_RESOLUTION_EDEFAULT == null ? timerResolution != null : !TIMER_RESOLUTION_EDEFAULT.equals(timerResolution);
			case CimPackage.CIM_WATCHDOG__TIME_OF_LAST_EXPIRATION:
				return TIME_OF_LAST_EXPIRATION_EDEFAULT == null ? timeOfLastExpiration != null : !TIME_OF_LAST_EXPIRATION_EDEFAULT.equals(timeOfLastExpiration);
			case CimPackage.CIM_WATCHDOG__MONITORED_ENTITY_ON_LAST_EXPIRATION:
				return MONITORED_ENTITY_ON_LAST_EXPIRATION_EDEFAULT == null ? monitoredEntityOnLastExpiration != null : !MONITORED_ENTITY_ON_LAST_EXPIRATION_EDEFAULT.equals(monitoredEntityOnLastExpiration);
			case CimPackage.CIM_WATCHDOG__ACTION_ON_EXPIRATION:
				return ACTION_ON_EXPIRATION_EDEFAULT == null ? actionOnExpiration != null : !ACTION_ON_EXPIRATION_EDEFAULT.equals(actionOnExpiration);
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
			case CimPackage.CIM_WATCHDOG___KEEP_ALIVE:
				return KeepAlive();
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
		result.append(" (MonitoredEntity: ");
		result.append(monitoredEntity);
		result.append(", MonitoredEntityDescription: ");
		result.append(monitoredEntityDescription);
		result.append(", TimeoutInterval: ");
		result.append(timeoutInterval);
		result.append(", TimerResolution: ");
		result.append(timerResolution);
		result.append(", TimeOfLastExpiration: ");
		result.append(timeOfLastExpiration);
		result.append(", MonitoredEntityOnLastExpiration: ");
		result.append(monitoredEntityOnLastExpiration);
		result.append(", ActionOnExpiration: ");
		result.append(actionOnExpiration);
		result.append(')');
		return result.toString();
	}

} //CIM_WatchdogImpl

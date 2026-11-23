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

import org.dmtf.cim.CIM_J2eeJMSEndpointStats;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM J2ee JMS Endpoint Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJMSEndpointStatsImpl#getExpiredMessageCount <em>Expired Message Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJMSEndpointStatsImpl#getMessageCount <em>Message Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJMSEndpointStatsImpl#getMessageWaitTime <em>Message Wait Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJMSEndpointStatsImpl#getMessageWaitTimeMaxTime <em>Message Wait Time Max Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJMSEndpointStatsImpl#getMessageWaitTimeMinTime <em>Message Wait Time Min Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJMSEndpointStatsImpl#getMessageWaitTimeTotalTime <em>Message Wait Time Total Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJMSEndpointStatsImpl#getPendingMessageCount <em>Pending Message Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_J2eeJMSEndpointStatsImpl extends CIM_J2eeStatisticImpl implements CIM_J2eeJMSEndpointStats {
	/**
	 * The default value of the '{@link #getExpiredMessageCount() <em>Expired Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiredMessageCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long EXPIRED_MESSAGE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiredMessageCount() <em>Expired Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiredMessageCount()
	 * @generated
	 * @ordered
	 */
	protected Long expiredMessageCount = EXPIRED_MESSAGE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageCount() <em>Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long MESSAGE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageCount() <em>Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageCount()
	 * @generated
	 * @ordered
	 */
	protected Long messageCount = MESSAGE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageWaitTime() <em>Message Wait Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageWaitTime()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_WAIT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageWaitTime() <em>Message Wait Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageWaitTime()
	 * @generated
	 * @ordered
	 */
	protected String messageWaitTime = MESSAGE_WAIT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageWaitTimeMaxTime() <em>Message Wait Time Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageWaitTimeMaxTime()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_WAIT_TIME_MAX_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageWaitTimeMaxTime() <em>Message Wait Time Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageWaitTimeMaxTime()
	 * @generated
	 * @ordered
	 */
	protected String messageWaitTimeMaxTime = MESSAGE_WAIT_TIME_MAX_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageWaitTimeMinTime() <em>Message Wait Time Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageWaitTimeMinTime()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_WAIT_TIME_MIN_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageWaitTimeMinTime() <em>Message Wait Time Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageWaitTimeMinTime()
	 * @generated
	 * @ordered
	 */
	protected String messageWaitTimeMinTime = MESSAGE_WAIT_TIME_MIN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageWaitTimeTotalTime() <em>Message Wait Time Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageWaitTimeTotalTime()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_WAIT_TIME_TOTAL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageWaitTimeTotalTime() <em>Message Wait Time Total Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageWaitTimeTotalTime()
	 * @generated
	 * @ordered
	 */
	protected String messageWaitTimeTotalTime = MESSAGE_WAIT_TIME_TOTAL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPendingMessageCount() <em>Pending Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPendingMessageCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long PENDING_MESSAGE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPendingMessageCount() <em>Pending Message Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPendingMessageCount()
	 * @generated
	 * @ordered
	 */
	protected Long pendingMessageCount = PENDING_MESSAGE_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_J2eeJMSEndpointStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_J2eeJMSEndpointStats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getExpiredMessageCount() {
		return expiredMessageCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpiredMessageCount(Long newExpiredMessageCount) {
		Long oldExpiredMessageCount = expiredMessageCount;
		expiredMessageCount = newExpiredMessageCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__EXPIRED_MESSAGE_COUNT, oldExpiredMessageCount, expiredMessageCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMessageCount() {
		return messageCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageCount(Long newMessageCount) {
		Long oldMessageCount = messageCount;
		messageCount = newMessageCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_COUNT, oldMessageCount, messageCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageWaitTime() {
		return messageWaitTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageWaitTime(String newMessageWaitTime) {
		String oldMessageWaitTime = messageWaitTime;
		messageWaitTime = newMessageWaitTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME, oldMessageWaitTime, messageWaitTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageWaitTimeMaxTime() {
		return messageWaitTimeMaxTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageWaitTimeMaxTime(String newMessageWaitTimeMaxTime) {
		String oldMessageWaitTimeMaxTime = messageWaitTimeMaxTime;
		messageWaitTimeMaxTime = newMessageWaitTimeMaxTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME_MAX_TIME, oldMessageWaitTimeMaxTime, messageWaitTimeMaxTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageWaitTimeMinTime() {
		return messageWaitTimeMinTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageWaitTimeMinTime(String newMessageWaitTimeMinTime) {
		String oldMessageWaitTimeMinTime = messageWaitTimeMinTime;
		messageWaitTimeMinTime = newMessageWaitTimeMinTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME_MIN_TIME, oldMessageWaitTimeMinTime, messageWaitTimeMinTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageWaitTimeTotalTime() {
		return messageWaitTimeTotalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageWaitTimeTotalTime(String newMessageWaitTimeTotalTime) {
		String oldMessageWaitTimeTotalTime = messageWaitTimeTotalTime;
		messageWaitTimeTotalTime = newMessageWaitTimeTotalTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME_TOTAL_TIME, oldMessageWaitTimeTotalTime, messageWaitTimeTotalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPendingMessageCount() {
		return pendingMessageCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPendingMessageCount(Long newPendingMessageCount) {
		Long oldPendingMessageCount = pendingMessageCount;
		pendingMessageCount = newPendingMessageCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__PENDING_MESSAGE_COUNT, oldPendingMessageCount, pendingMessageCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__EXPIRED_MESSAGE_COUNT:
				return getExpiredMessageCount();
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_COUNT:
				return getMessageCount();
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME:
				return getMessageWaitTime();
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME_MAX_TIME:
				return getMessageWaitTimeMaxTime();
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME_MIN_TIME:
				return getMessageWaitTimeMinTime();
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME_TOTAL_TIME:
				return getMessageWaitTimeTotalTime();
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__PENDING_MESSAGE_COUNT:
				return getPendingMessageCount();
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
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__EXPIRED_MESSAGE_COUNT:
				setExpiredMessageCount((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_COUNT:
				setMessageCount((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME:
				setMessageWaitTime((String)newValue);
				return;
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME_MAX_TIME:
				setMessageWaitTimeMaxTime((String)newValue);
				return;
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME_MIN_TIME:
				setMessageWaitTimeMinTime((String)newValue);
				return;
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME_TOTAL_TIME:
				setMessageWaitTimeTotalTime((String)newValue);
				return;
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__PENDING_MESSAGE_COUNT:
				setPendingMessageCount((Long)newValue);
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
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__EXPIRED_MESSAGE_COUNT:
				setExpiredMessageCount(EXPIRED_MESSAGE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_COUNT:
				setMessageCount(MESSAGE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME:
				setMessageWaitTime(MESSAGE_WAIT_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME_MAX_TIME:
				setMessageWaitTimeMaxTime(MESSAGE_WAIT_TIME_MAX_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME_MIN_TIME:
				setMessageWaitTimeMinTime(MESSAGE_WAIT_TIME_MIN_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME_TOTAL_TIME:
				setMessageWaitTimeTotalTime(MESSAGE_WAIT_TIME_TOTAL_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__PENDING_MESSAGE_COUNT:
				setPendingMessageCount(PENDING_MESSAGE_COUNT_EDEFAULT);
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
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__EXPIRED_MESSAGE_COUNT:
				return EXPIRED_MESSAGE_COUNT_EDEFAULT == null ? expiredMessageCount != null : !EXPIRED_MESSAGE_COUNT_EDEFAULT.equals(expiredMessageCount);
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_COUNT:
				return MESSAGE_COUNT_EDEFAULT == null ? messageCount != null : !MESSAGE_COUNT_EDEFAULT.equals(messageCount);
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME:
				return MESSAGE_WAIT_TIME_EDEFAULT == null ? messageWaitTime != null : !MESSAGE_WAIT_TIME_EDEFAULT.equals(messageWaitTime);
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME_MAX_TIME:
				return MESSAGE_WAIT_TIME_MAX_TIME_EDEFAULT == null ? messageWaitTimeMaxTime != null : !MESSAGE_WAIT_TIME_MAX_TIME_EDEFAULT.equals(messageWaitTimeMaxTime);
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME_MIN_TIME:
				return MESSAGE_WAIT_TIME_MIN_TIME_EDEFAULT == null ? messageWaitTimeMinTime != null : !MESSAGE_WAIT_TIME_MIN_TIME_EDEFAULT.equals(messageWaitTimeMinTime);
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__MESSAGE_WAIT_TIME_TOTAL_TIME:
				return MESSAGE_WAIT_TIME_TOTAL_TIME_EDEFAULT == null ? messageWaitTimeTotalTime != null : !MESSAGE_WAIT_TIME_TOTAL_TIME_EDEFAULT.equals(messageWaitTimeTotalTime);
			case CimPackage.CIM_J2EE_JMS_ENDPOINT_STATS__PENDING_MESSAGE_COUNT:
				return PENDING_MESSAGE_COUNT_EDEFAULT == null ? pendingMessageCount != null : !PENDING_MESSAGE_COUNT_EDEFAULT.equals(pendingMessageCount);
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
		result.append(" (ExpiredMessageCount: ");
		result.append(expiredMessageCount);
		result.append(", MessageCount: ");
		result.append(messageCount);
		result.append(", MessageWaitTime: ");
		result.append(messageWaitTime);
		result.append(", MessageWaitTimeMaxTime: ");
		result.append(messageWaitTimeMaxTime);
		result.append(", MessageWaitTimeMinTime: ");
		result.append(messageWaitTimeMinTime);
		result.append(", MessageWaitTimeTotalTime: ");
		result.append(messageWaitTimeTotalTime);
		result.append(", PendingMessageCount: ");
		result.append(pendingMessageCount);
		result.append(')');
		return result.toString();
	}

} //CIM_J2eeJMSEndpointStatsImpl

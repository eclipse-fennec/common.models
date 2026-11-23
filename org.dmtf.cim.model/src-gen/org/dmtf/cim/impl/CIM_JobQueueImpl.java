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

import org.dmtf.cim.CIM_JobQueue;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Job Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobQueueImpl#getQueueStatus <em>Queue Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobQueueImpl#getQueueStatusInfo <em>Queue Status Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobQueueImpl#getDefaultJobPriority <em>Default Job Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobQueueImpl#getMaxTimeOnQueue <em>Max Time On Queue</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobQueueImpl#getMaxJobsOnQueue <em>Max Jobs On Queue</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobQueueImpl#getMaxJobCPUTime <em>Max Job CPU Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_JobQueueImpl extends CIM_JobDestinationImpl implements CIM_JobQueue {
	/**
	 * The default value of the '{@link #getQueueStatus() <em>Queue Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer QUEUE_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueStatus() <em>Queue Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer queueStatus = QUEUE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueueStatusInfo() <em>Queue Status Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueStatusInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String QUEUE_STATUS_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueStatusInfo() <em>Queue Status Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueStatusInfo()
	 * @generated
	 * @ordered
	 */
	protected String queueStatusInfo = QUEUE_STATUS_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultJobPriority() <em>Default Job Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultJobPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Long DEFAULT_JOB_PRIORITY_EDEFAULT = Long.valueOf(65535L);

	/**
	 * The cached value of the '{@link #getDefaultJobPriority() <em>Default Job Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultJobPriority()
	 * @generated
	 * @ordered
	 */
	protected Long defaultJobPriority = DEFAULT_JOB_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTimeOnQueue() <em>Max Time On Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTimeOnQueue()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_TIME_ON_QUEUE_EDEFAULT = "00000000000000.000000:000";

	/**
	 * The cached value of the '{@link #getMaxTimeOnQueue() <em>Max Time On Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTimeOnQueue()
	 * @generated
	 * @ordered
	 */
	protected String maxTimeOnQueue = MAX_TIME_ON_QUEUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxJobsOnQueue() <em>Max Jobs On Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxJobsOnQueue()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_JOBS_ON_QUEUE_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getMaxJobsOnQueue() <em>Max Jobs On Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxJobsOnQueue()
	 * @generated
	 * @ordered
	 */
	protected Long maxJobsOnQueue = MAX_JOBS_ON_QUEUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxJobCPUTime() <em>Max Job CPU Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxJobCPUTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_JOB_CPU_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxJobCPUTime() <em>Max Job CPU Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxJobCPUTime()
	 * @generated
	 * @ordered
	 */
	protected Long maxJobCPUTime = MAX_JOB_CPU_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_JobQueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_JobQueue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getQueueStatus() {
		return queueStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueStatus(Integer newQueueStatus) {
		Integer oldQueueStatus = queueStatus;
		queueStatus = newQueueStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_QUEUE__QUEUE_STATUS, oldQueueStatus, queueStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQueueStatusInfo() {
		return queueStatusInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueStatusInfo(String newQueueStatusInfo) {
		String oldQueueStatusInfo = queueStatusInfo;
		queueStatusInfo = newQueueStatusInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_QUEUE__QUEUE_STATUS_INFO, oldQueueStatusInfo, queueStatusInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDefaultJobPriority() {
		return defaultJobPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultJobPriority(Long newDefaultJobPriority) {
		Long oldDefaultJobPriority = defaultJobPriority;
		defaultJobPriority = newDefaultJobPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_QUEUE__DEFAULT_JOB_PRIORITY, oldDefaultJobPriority, defaultJobPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaxTimeOnQueue() {
		return maxTimeOnQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTimeOnQueue(String newMaxTimeOnQueue) {
		String oldMaxTimeOnQueue = maxTimeOnQueue;
		maxTimeOnQueue = newMaxTimeOnQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_QUEUE__MAX_TIME_ON_QUEUE, oldMaxTimeOnQueue, maxTimeOnQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxJobsOnQueue() {
		return maxJobsOnQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxJobsOnQueue(Long newMaxJobsOnQueue) {
		Long oldMaxJobsOnQueue = maxJobsOnQueue;
		maxJobsOnQueue = newMaxJobsOnQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_QUEUE__MAX_JOBS_ON_QUEUE, oldMaxJobsOnQueue, maxJobsOnQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxJobCPUTime() {
		return maxJobCPUTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxJobCPUTime(Long newMaxJobCPUTime) {
		Long oldMaxJobCPUTime = maxJobCPUTime;
		maxJobCPUTime = newMaxJobCPUTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB_QUEUE__MAX_JOB_CPU_TIME, oldMaxJobCPUTime, maxJobCPUTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_JOB_QUEUE__QUEUE_STATUS:
				return getQueueStatus();
			case CimPackage.CIM_JOB_QUEUE__QUEUE_STATUS_INFO:
				return getQueueStatusInfo();
			case CimPackage.CIM_JOB_QUEUE__DEFAULT_JOB_PRIORITY:
				return getDefaultJobPriority();
			case CimPackage.CIM_JOB_QUEUE__MAX_TIME_ON_QUEUE:
				return getMaxTimeOnQueue();
			case CimPackage.CIM_JOB_QUEUE__MAX_JOBS_ON_QUEUE:
				return getMaxJobsOnQueue();
			case CimPackage.CIM_JOB_QUEUE__MAX_JOB_CPU_TIME:
				return getMaxJobCPUTime();
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
			case CimPackage.CIM_JOB_QUEUE__QUEUE_STATUS:
				setQueueStatus((Integer)newValue);
				return;
			case CimPackage.CIM_JOB_QUEUE__QUEUE_STATUS_INFO:
				setQueueStatusInfo((String)newValue);
				return;
			case CimPackage.CIM_JOB_QUEUE__DEFAULT_JOB_PRIORITY:
				setDefaultJobPriority((Long)newValue);
				return;
			case CimPackage.CIM_JOB_QUEUE__MAX_TIME_ON_QUEUE:
				setMaxTimeOnQueue((String)newValue);
				return;
			case CimPackage.CIM_JOB_QUEUE__MAX_JOBS_ON_QUEUE:
				setMaxJobsOnQueue((Long)newValue);
				return;
			case CimPackage.CIM_JOB_QUEUE__MAX_JOB_CPU_TIME:
				setMaxJobCPUTime((Long)newValue);
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
			case CimPackage.CIM_JOB_QUEUE__QUEUE_STATUS:
				setQueueStatus(QUEUE_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_QUEUE__QUEUE_STATUS_INFO:
				setQueueStatusInfo(QUEUE_STATUS_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_QUEUE__DEFAULT_JOB_PRIORITY:
				setDefaultJobPriority(DEFAULT_JOB_PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_QUEUE__MAX_TIME_ON_QUEUE:
				setMaxTimeOnQueue(MAX_TIME_ON_QUEUE_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_QUEUE__MAX_JOBS_ON_QUEUE:
				setMaxJobsOnQueue(MAX_JOBS_ON_QUEUE_EDEFAULT);
				return;
			case CimPackage.CIM_JOB_QUEUE__MAX_JOB_CPU_TIME:
				setMaxJobCPUTime(MAX_JOB_CPU_TIME_EDEFAULT);
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
			case CimPackage.CIM_JOB_QUEUE__QUEUE_STATUS:
				return QUEUE_STATUS_EDEFAULT == null ? queueStatus != null : !QUEUE_STATUS_EDEFAULT.equals(queueStatus);
			case CimPackage.CIM_JOB_QUEUE__QUEUE_STATUS_INFO:
				return QUEUE_STATUS_INFO_EDEFAULT == null ? queueStatusInfo != null : !QUEUE_STATUS_INFO_EDEFAULT.equals(queueStatusInfo);
			case CimPackage.CIM_JOB_QUEUE__DEFAULT_JOB_PRIORITY:
				return DEFAULT_JOB_PRIORITY_EDEFAULT == null ? defaultJobPriority != null : !DEFAULT_JOB_PRIORITY_EDEFAULT.equals(defaultJobPriority);
			case CimPackage.CIM_JOB_QUEUE__MAX_TIME_ON_QUEUE:
				return MAX_TIME_ON_QUEUE_EDEFAULT == null ? maxTimeOnQueue != null : !MAX_TIME_ON_QUEUE_EDEFAULT.equals(maxTimeOnQueue);
			case CimPackage.CIM_JOB_QUEUE__MAX_JOBS_ON_QUEUE:
				return MAX_JOBS_ON_QUEUE_EDEFAULT == null ? maxJobsOnQueue != null : !MAX_JOBS_ON_QUEUE_EDEFAULT.equals(maxJobsOnQueue);
			case CimPackage.CIM_JOB_QUEUE__MAX_JOB_CPU_TIME:
				return MAX_JOB_CPU_TIME_EDEFAULT == null ? maxJobCPUTime != null : !MAX_JOB_CPU_TIME_EDEFAULT.equals(maxJobCPUTime);
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
		result.append(" (QueueStatus: ");
		result.append(queueStatus);
		result.append(", QueueStatusInfo: ");
		result.append(queueStatusInfo);
		result.append(", DefaultJobPriority: ");
		result.append(defaultJobPriority);
		result.append(", MaxTimeOnQueue: ");
		result.append(maxTimeOnQueue);
		result.append(", MaxJobsOnQueue: ");
		result.append(maxJobsOnQueue);
		result.append(", MaxJobCPUTime: ");
		result.append(maxJobCPUTime);
		result.append(')');
		return result.toString();
	}

} //CIM_JobQueueImpl

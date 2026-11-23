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

import java.util.Collection;

import org.dmtf.cim.CIM_PrintQueue;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Print Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintQueueImpl#getQueueEnabled <em>Queue Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintQueueImpl#getQueueAccepting <em>Queue Accepting</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintQueueImpl#getNumberOnQueue <em>Number On Queue</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintQueueImpl#getQueueStatus <em>Queue Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintQueueImpl#getQueueStatusInfo <em>Queue Status Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintQueueImpl#getMaxJobSize <em>Max Job Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintQueueImpl#getDefaultJobPriority <em>Default Job Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintQueueImpl#getJobPriorityHigh <em>Job Priority High</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintQueueImpl#getJobPriorityLow <em>Job Priority Low</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PrintQueueImpl#getAvailableJobSheets <em>Available Job Sheets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PrintQueueImpl extends CIM_JobDestinationImpl implements CIM_PrintQueue {
	/**
	 * The default value of the '{@link #getQueueEnabled() <em>Queue Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean QUEUE_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueEnabled() <em>Queue Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean queueEnabled = QUEUE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getQueueAccepting() <em>Queue Accepting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueAccepting()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean QUEUE_ACCEPTING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueueAccepting() <em>Queue Accepting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueAccepting()
	 * @generated
	 * @ordered
	 */
	protected Boolean queueAccepting = QUEUE_ACCEPTING_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOnQueue() <em>Number On Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOnQueue()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_ON_QUEUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOnQueue() <em>Number On Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOnQueue()
	 * @generated
	 * @ordered
	 */
	protected Long numberOnQueue = NUMBER_ON_QUEUE_EDEFAULT;

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
	 * The default value of the '{@link #getMaxJobSize() <em>Max Job Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxJobSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_JOB_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxJobSize() <em>Max Job Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxJobSize()
	 * @generated
	 * @ordered
	 */
	protected Long maxJobSize = MAX_JOB_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultJobPriority() <em>Default Job Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultJobPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Long DEFAULT_JOB_PRIORITY_EDEFAULT = null;

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
	 * The default value of the '{@link #getJobPriorityHigh() <em>Job Priority High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobPriorityHigh()
	 * @generated
	 * @ordered
	 */
	protected static final Long JOB_PRIORITY_HIGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobPriorityHigh() <em>Job Priority High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobPriorityHigh()
	 * @generated
	 * @ordered
	 */
	protected Long jobPriorityHigh = JOB_PRIORITY_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobPriorityLow() <em>Job Priority Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobPriorityLow()
	 * @generated
	 * @ordered
	 */
	protected static final Long JOB_PRIORITY_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobPriorityLow() <em>Job Priority Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobPriorityLow()
	 * @generated
	 * @ordered
	 */
	protected Long jobPriorityLow = JOB_PRIORITY_LOW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAvailableJobSheets() <em>Available Job Sheets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableJobSheets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> availableJobSheets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PrintQueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PrintQueue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getQueueEnabled() {
		return queueEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueEnabled(Boolean newQueueEnabled) {
		Boolean oldQueueEnabled = queueEnabled;
		queueEnabled = newQueueEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_QUEUE__QUEUE_ENABLED, oldQueueEnabled, queueEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getQueueAccepting() {
		return queueAccepting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueAccepting(Boolean newQueueAccepting) {
		Boolean oldQueueAccepting = queueAccepting;
		queueAccepting = newQueueAccepting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_QUEUE__QUEUE_ACCEPTING, oldQueueAccepting, queueAccepting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOnQueue() {
		return numberOnQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOnQueue(Long newNumberOnQueue) {
		Long oldNumberOnQueue = numberOnQueue;
		numberOnQueue = newNumberOnQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_QUEUE__NUMBER_ON_QUEUE, oldNumberOnQueue, numberOnQueue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_QUEUE__QUEUE_STATUS, oldQueueStatus, queueStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_QUEUE__QUEUE_STATUS_INFO, oldQueueStatusInfo, queueStatusInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxJobSize() {
		return maxJobSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxJobSize(Long newMaxJobSize) {
		Long oldMaxJobSize = maxJobSize;
		maxJobSize = newMaxJobSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_QUEUE__MAX_JOB_SIZE, oldMaxJobSize, maxJobSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_QUEUE__DEFAULT_JOB_PRIORITY, oldDefaultJobPriority, defaultJobPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getJobPriorityHigh() {
		return jobPriorityHigh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobPriorityHigh(Long newJobPriorityHigh) {
		Long oldJobPriorityHigh = jobPriorityHigh;
		jobPriorityHigh = newJobPriorityHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_QUEUE__JOB_PRIORITY_HIGH, oldJobPriorityHigh, jobPriorityHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getJobPriorityLow() {
		return jobPriorityLow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobPriorityLow(Long newJobPriorityLow) {
		Long oldJobPriorityLow = jobPriorityLow;
		jobPriorityLow = newJobPriorityLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRINT_QUEUE__JOB_PRIORITY_LOW, oldJobPriorityLow, jobPriorityLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAvailableJobSheets() {
		if (availableJobSheets == null) {
			availableJobSheets = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PRINT_QUEUE__AVAILABLE_JOB_SHEETS);
		}
		return availableJobSheets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_ENABLED:
				return getQueueEnabled();
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_ACCEPTING:
				return getQueueAccepting();
			case CimPackage.CIM_PRINT_QUEUE__NUMBER_ON_QUEUE:
				return getNumberOnQueue();
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_STATUS:
				return getQueueStatus();
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_STATUS_INFO:
				return getQueueStatusInfo();
			case CimPackage.CIM_PRINT_QUEUE__MAX_JOB_SIZE:
				return getMaxJobSize();
			case CimPackage.CIM_PRINT_QUEUE__DEFAULT_JOB_PRIORITY:
				return getDefaultJobPriority();
			case CimPackage.CIM_PRINT_QUEUE__JOB_PRIORITY_HIGH:
				return getJobPriorityHigh();
			case CimPackage.CIM_PRINT_QUEUE__JOB_PRIORITY_LOW:
				return getJobPriorityLow();
			case CimPackage.CIM_PRINT_QUEUE__AVAILABLE_JOB_SHEETS:
				return getAvailableJobSheets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_ENABLED:
				setQueueEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_ACCEPTING:
				setQueueAccepting((Boolean)newValue);
				return;
			case CimPackage.CIM_PRINT_QUEUE__NUMBER_ON_QUEUE:
				setNumberOnQueue((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_STATUS:
				setQueueStatus((Integer)newValue);
				return;
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_STATUS_INFO:
				setQueueStatusInfo((String)newValue);
				return;
			case CimPackage.CIM_PRINT_QUEUE__MAX_JOB_SIZE:
				setMaxJobSize((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_QUEUE__DEFAULT_JOB_PRIORITY:
				setDefaultJobPriority((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_QUEUE__JOB_PRIORITY_HIGH:
				setJobPriorityHigh((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_QUEUE__JOB_PRIORITY_LOW:
				setJobPriorityLow((Long)newValue);
				return;
			case CimPackage.CIM_PRINT_QUEUE__AVAILABLE_JOB_SHEETS:
				getAvailableJobSheets().clear();
				getAvailableJobSheets().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_ENABLED:
				setQueueEnabled(QUEUE_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_ACCEPTING:
				setQueueAccepting(QUEUE_ACCEPTING_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_QUEUE__NUMBER_ON_QUEUE:
				setNumberOnQueue(NUMBER_ON_QUEUE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_STATUS:
				setQueueStatus(QUEUE_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_STATUS_INFO:
				setQueueStatusInfo(QUEUE_STATUS_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_QUEUE__MAX_JOB_SIZE:
				setMaxJobSize(MAX_JOB_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_QUEUE__DEFAULT_JOB_PRIORITY:
				setDefaultJobPriority(DEFAULT_JOB_PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_QUEUE__JOB_PRIORITY_HIGH:
				setJobPriorityHigh(JOB_PRIORITY_HIGH_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_QUEUE__JOB_PRIORITY_LOW:
				setJobPriorityLow(JOB_PRIORITY_LOW_EDEFAULT);
				return;
			case CimPackage.CIM_PRINT_QUEUE__AVAILABLE_JOB_SHEETS:
				getAvailableJobSheets().clear();
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
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_ENABLED:
				return QUEUE_ENABLED_EDEFAULT == null ? queueEnabled != null : !QUEUE_ENABLED_EDEFAULT.equals(queueEnabled);
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_ACCEPTING:
				return QUEUE_ACCEPTING_EDEFAULT == null ? queueAccepting != null : !QUEUE_ACCEPTING_EDEFAULT.equals(queueAccepting);
			case CimPackage.CIM_PRINT_QUEUE__NUMBER_ON_QUEUE:
				return NUMBER_ON_QUEUE_EDEFAULT == null ? numberOnQueue != null : !NUMBER_ON_QUEUE_EDEFAULT.equals(numberOnQueue);
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_STATUS:
				return QUEUE_STATUS_EDEFAULT == null ? queueStatus != null : !QUEUE_STATUS_EDEFAULT.equals(queueStatus);
			case CimPackage.CIM_PRINT_QUEUE__QUEUE_STATUS_INFO:
				return QUEUE_STATUS_INFO_EDEFAULT == null ? queueStatusInfo != null : !QUEUE_STATUS_INFO_EDEFAULT.equals(queueStatusInfo);
			case CimPackage.CIM_PRINT_QUEUE__MAX_JOB_SIZE:
				return MAX_JOB_SIZE_EDEFAULT == null ? maxJobSize != null : !MAX_JOB_SIZE_EDEFAULT.equals(maxJobSize);
			case CimPackage.CIM_PRINT_QUEUE__DEFAULT_JOB_PRIORITY:
				return DEFAULT_JOB_PRIORITY_EDEFAULT == null ? defaultJobPriority != null : !DEFAULT_JOB_PRIORITY_EDEFAULT.equals(defaultJobPriority);
			case CimPackage.CIM_PRINT_QUEUE__JOB_PRIORITY_HIGH:
				return JOB_PRIORITY_HIGH_EDEFAULT == null ? jobPriorityHigh != null : !JOB_PRIORITY_HIGH_EDEFAULT.equals(jobPriorityHigh);
			case CimPackage.CIM_PRINT_QUEUE__JOB_PRIORITY_LOW:
				return JOB_PRIORITY_LOW_EDEFAULT == null ? jobPriorityLow != null : !JOB_PRIORITY_LOW_EDEFAULT.equals(jobPriorityLow);
			case CimPackage.CIM_PRINT_QUEUE__AVAILABLE_JOB_SHEETS:
				return availableJobSheets != null && !availableJobSheets.isEmpty();
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
		result.append(" (QueueEnabled: ");
		result.append(queueEnabled);
		result.append(", QueueAccepting: ");
		result.append(queueAccepting);
		result.append(", NumberOnQueue: ");
		result.append(numberOnQueue);
		result.append(", QueueStatus: ");
		result.append(queueStatus);
		result.append(", QueueStatusInfo: ");
		result.append(queueStatusInfo);
		result.append(", MaxJobSize: ");
		result.append(maxJobSize);
		result.append(", DefaultJobPriority: ");
		result.append(defaultJobPriority);
		result.append(", JobPriorityHigh: ");
		result.append(jobPriorityHigh);
		result.append(", JobPriorityLow: ");
		result.append(jobPriorityLow);
		result.append(", AvailableJobSheets: ");
		result.append(availableJobSheets);
		result.append(')');
		return result.toString();
	}

} //CIM_PrintQueueImpl

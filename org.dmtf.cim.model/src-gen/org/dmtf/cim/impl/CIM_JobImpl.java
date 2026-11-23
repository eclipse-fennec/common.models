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

import org.dmtf.cim.CIM_Job;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getJobStatus <em>Job Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getTimeSubmitted <em>Time Submitted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getScheduledStartTime <em>Scheduled Start Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getElapsedTime <em>Elapsed Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getJobRunTimes <em>Job Run Times</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getRunMonth <em>Run Month</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getRunDay <em>Run Day</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getRunDayOfWeek <em>Run Day Of Week</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getRunStartInterval <em>Run Start Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getLocalOrUtcTime <em>Local Or Utc Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getUntilTime <em>Until Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getNotify <em>Notify</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getDeleteOnCompletion <em>Delete On Completion</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getErrorDescription <em>Error Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getRecoveryAction <em>Recovery Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_JobImpl#getOtherRecoveryAction <em>Other Recovery Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_JobImpl extends CIM_LogicalElementImpl implements CIM_Job {
	/**
	 * The default value of the '{@link #getJobStatus() <em>Job Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String JOB_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobStatus() <em>Job Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobStatus()
	 * @generated
	 * @ordered
	 */
	protected String jobStatus = JOB_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeSubmitted() <em>Time Submitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSubmitted()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_SUBMITTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeSubmitted() <em>Time Submitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSubmitted()
	 * @generated
	 * @ordered
	 */
	protected String timeSubmitted = TIME_SUBMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduledStartTime() <em>Scheduled Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULED_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduledStartTime() <em>Scheduled Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledStartTime()
	 * @generated
	 * @ordered
	 */
	protected String scheduledStartTime = SCHEDULED_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected String startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected static final String ELAPSED_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElapsedTime() <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElapsedTime()
	 * @generated
	 * @ordered
	 */
	protected String elapsedTime = ELAPSED_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobRunTimes() <em>Job Run Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobRunTimes()
	 * @generated
	 * @ordered
	 */
	protected static final Long JOB_RUN_TIMES_EDEFAULT = Long.valueOf(1L);

	/**
	 * The cached value of the '{@link #getJobRunTimes() <em>Job Run Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobRunTimes()
	 * @generated
	 * @ordered
	 */
	protected Long jobRunTimes = JOB_RUN_TIMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunMonth() <em>Run Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunMonth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RUN_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunMonth() <em>Run Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunMonth()
	 * @generated
	 * @ordered
	 */
	protected Integer runMonth = RUN_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunDay() <em>Run Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunDay()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RUN_DAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunDay() <em>Run Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunDay()
	 * @generated
	 * @ordered
	 */
	protected Integer runDay = RUN_DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunDayOfWeek() <em>Run Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RUN_DAY_OF_WEEK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunDayOfWeek() <em>Run Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected Integer runDayOfWeek = RUN_DAY_OF_WEEK_EDEFAULT;

	/**
	 * The default value of the '{@link #getRunStartInterval() <em>Run Start Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunStartInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String RUN_START_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunStartInterval() <em>Run Start Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunStartInterval()
	 * @generated
	 * @ordered
	 */
	protected String runStartInterval = RUN_START_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalOrUtcTime() <em>Local Or Utc Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOrUtcTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOCAL_OR_UTC_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalOrUtcTime() <em>Local Or Utc Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOrUtcTime()
	 * @generated
	 * @ordered
	 */
	protected Integer localOrUtcTime = LOCAL_OR_UTC_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUntilTime() <em>Until Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilTime()
	 * @generated
	 * @ordered
	 */
	protected static final String UNTIL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUntilTime() <em>Until Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUntilTime()
	 * @generated
	 * @ordered
	 */
	protected String untilTime = UNTIL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotify() <em>Notify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotify()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotify() <em>Notify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotify()
	 * @generated
	 * @ordered
	 */
	protected String notify = NOTIFY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Long PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Long priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentComplete() <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERCENT_COMPLETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentComplete() <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentComplete()
	 * @generated
	 * @ordered
	 */
	protected Integer percentComplete = PERCENT_COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeleteOnCompletion() <em>Delete On Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnCompletion()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELETE_ON_COMPLETION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeleteOnCompletion() <em>Delete On Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnCompletion()
	 * @generated
	 * @ordered
	 */
	protected Boolean deleteOnCompletion = DELETE_ON_COMPLETION_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ERROR_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected Integer errorCode = ERROR_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorDescription() <em>Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorDescription() <em>Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDescription()
	 * @generated
	 * @ordered
	 */
	protected String errorDescription = ERROR_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecoveryAction() <em>Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RECOVERY_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecoveryAction() <em>Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected Integer recoveryAction = RECOVERY_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherRecoveryAction() <em>Other Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_RECOVERY_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherRecoveryAction() <em>Other Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected String otherRecoveryAction = OTHER_RECOVERY_ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Job();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobStatus() {
		return jobStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobStatus(String newJobStatus) {
		String oldJobStatus = jobStatus;
		jobStatus = newJobStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__JOB_STATUS, oldJobStatus, jobStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeSubmitted() {
		return timeSubmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeSubmitted(String newTimeSubmitted) {
		String oldTimeSubmitted = timeSubmitted;
		timeSubmitted = newTimeSubmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__TIME_SUBMITTED, oldTimeSubmitted, timeSubmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScheduledStartTime() {
		return scheduledStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheduledStartTime(String newScheduledStartTime) {
		String oldScheduledStartTime = scheduledStartTime;
		scheduledStartTime = newScheduledStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__SCHEDULED_START_TIME, oldScheduledStartTime, scheduledStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(String newStartTime) {
		String oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElapsedTime() {
		return elapsedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElapsedTime(String newElapsedTime) {
		String oldElapsedTime = elapsedTime;
		elapsedTime = newElapsedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__ELAPSED_TIME, oldElapsedTime, elapsedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getJobRunTimes() {
		return jobRunTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobRunTimes(Long newJobRunTimes) {
		Long oldJobRunTimes = jobRunTimes;
		jobRunTimes = newJobRunTimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__JOB_RUN_TIMES, oldJobRunTimes, jobRunTimes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRunMonth() {
		return runMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunMonth(Integer newRunMonth) {
		Integer oldRunMonth = runMonth;
		runMonth = newRunMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__RUN_MONTH, oldRunMonth, runMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRunDay() {
		return runDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunDay(Integer newRunDay) {
		Integer oldRunDay = runDay;
		runDay = newRunDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__RUN_DAY, oldRunDay, runDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRunDayOfWeek() {
		return runDayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunDayOfWeek(Integer newRunDayOfWeek) {
		Integer oldRunDayOfWeek = runDayOfWeek;
		runDayOfWeek = newRunDayOfWeek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__RUN_DAY_OF_WEEK, oldRunDayOfWeek, runDayOfWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRunStartInterval() {
		return runStartInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunStartInterval(String newRunStartInterval) {
		String oldRunStartInterval = runStartInterval;
		runStartInterval = newRunStartInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__RUN_START_INTERVAL, oldRunStartInterval, runStartInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocalOrUtcTime() {
		return localOrUtcTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalOrUtcTime(Integer newLocalOrUtcTime) {
		Integer oldLocalOrUtcTime = localOrUtcTime;
		localOrUtcTime = newLocalOrUtcTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__LOCAL_OR_UTC_TIME, oldLocalOrUtcTime, localOrUtcTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUntilTime() {
		return untilTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUntilTime(String newUntilTime) {
		String oldUntilTime = untilTime;
		untilTime = newUntilTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__UNTIL_TIME, oldUntilTime, untilTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotify() {
		return notify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotify(String newNotify) {
		String oldNotify = notify;
		notify = newNotify;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__NOTIFY, oldNotify, notify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(Long newPriority) {
		Long oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPercentComplete() {
		return percentComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentComplete(Integer newPercentComplete) {
		Integer oldPercentComplete = percentComplete;
		percentComplete = newPercentComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__PERCENT_COMPLETE, oldPercentComplete, percentComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeleteOnCompletion() {
		return deleteOnCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteOnCompletion(Boolean newDeleteOnCompletion) {
		Boolean oldDeleteOnCompletion = deleteOnCompletion;
		deleteOnCompletion = newDeleteOnCompletion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__DELETE_ON_COMPLETION, oldDeleteOnCompletion, deleteOnCompletion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getErrorCode() {
		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorCode(Integer newErrorCode) {
		Integer oldErrorCode = errorCode;
		errorCode = newErrorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__ERROR_CODE, oldErrorCode, errorCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErrorDescription() {
		return errorDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorDescription(String newErrorDescription) {
		String oldErrorDescription = errorDescription;
		errorDescription = newErrorDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__ERROR_DESCRIPTION, oldErrorDescription, errorDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRecoveryAction() {
		return recoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecoveryAction(Integer newRecoveryAction) {
		Integer oldRecoveryAction = recoveryAction;
		recoveryAction = newRecoveryAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__RECOVERY_ACTION, oldRecoveryAction, recoveryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherRecoveryAction() {
		return otherRecoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherRecoveryAction(String newOtherRecoveryAction) {
		String oldOtherRecoveryAction = otherRecoveryAction;
		otherRecoveryAction = newOtherRecoveryAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_JOB__OTHER_RECOVERY_ACTION, oldOtherRecoveryAction, otherRecoveryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long KillJob(Boolean DeleteOnKill) {
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
			case CimPackage.CIM_JOB__JOB_STATUS:
				return getJobStatus();
			case CimPackage.CIM_JOB__TIME_SUBMITTED:
				return getTimeSubmitted();
			case CimPackage.CIM_JOB__SCHEDULED_START_TIME:
				return getScheduledStartTime();
			case CimPackage.CIM_JOB__START_TIME:
				return getStartTime();
			case CimPackage.CIM_JOB__ELAPSED_TIME:
				return getElapsedTime();
			case CimPackage.CIM_JOB__JOB_RUN_TIMES:
				return getJobRunTimes();
			case CimPackage.CIM_JOB__RUN_MONTH:
				return getRunMonth();
			case CimPackage.CIM_JOB__RUN_DAY:
				return getRunDay();
			case CimPackage.CIM_JOB__RUN_DAY_OF_WEEK:
				return getRunDayOfWeek();
			case CimPackage.CIM_JOB__RUN_START_INTERVAL:
				return getRunStartInterval();
			case CimPackage.CIM_JOB__LOCAL_OR_UTC_TIME:
				return getLocalOrUtcTime();
			case CimPackage.CIM_JOB__UNTIL_TIME:
				return getUntilTime();
			case CimPackage.CIM_JOB__NOTIFY:
				return getNotify();
			case CimPackage.CIM_JOB__OWNER:
				return getOwner();
			case CimPackage.CIM_JOB__PRIORITY:
				return getPriority();
			case CimPackage.CIM_JOB__PERCENT_COMPLETE:
				return getPercentComplete();
			case CimPackage.CIM_JOB__DELETE_ON_COMPLETION:
				return getDeleteOnCompletion();
			case CimPackage.CIM_JOB__ERROR_CODE:
				return getErrorCode();
			case CimPackage.CIM_JOB__ERROR_DESCRIPTION:
				return getErrorDescription();
			case CimPackage.CIM_JOB__RECOVERY_ACTION:
				return getRecoveryAction();
			case CimPackage.CIM_JOB__OTHER_RECOVERY_ACTION:
				return getOtherRecoveryAction();
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
			case CimPackage.CIM_JOB__JOB_STATUS:
				setJobStatus((String)newValue);
				return;
			case CimPackage.CIM_JOB__TIME_SUBMITTED:
				setTimeSubmitted((String)newValue);
				return;
			case CimPackage.CIM_JOB__SCHEDULED_START_TIME:
				setScheduledStartTime((String)newValue);
				return;
			case CimPackage.CIM_JOB__START_TIME:
				setStartTime((String)newValue);
				return;
			case CimPackage.CIM_JOB__ELAPSED_TIME:
				setElapsedTime((String)newValue);
				return;
			case CimPackage.CIM_JOB__JOB_RUN_TIMES:
				setJobRunTimes((Long)newValue);
				return;
			case CimPackage.CIM_JOB__RUN_MONTH:
				setRunMonth((Integer)newValue);
				return;
			case CimPackage.CIM_JOB__RUN_DAY:
				setRunDay((Integer)newValue);
				return;
			case CimPackage.CIM_JOB__RUN_DAY_OF_WEEK:
				setRunDayOfWeek((Integer)newValue);
				return;
			case CimPackage.CIM_JOB__RUN_START_INTERVAL:
				setRunStartInterval((String)newValue);
				return;
			case CimPackage.CIM_JOB__LOCAL_OR_UTC_TIME:
				setLocalOrUtcTime((Integer)newValue);
				return;
			case CimPackage.CIM_JOB__UNTIL_TIME:
				setUntilTime((String)newValue);
				return;
			case CimPackage.CIM_JOB__NOTIFY:
				setNotify((String)newValue);
				return;
			case CimPackage.CIM_JOB__OWNER:
				setOwner((String)newValue);
				return;
			case CimPackage.CIM_JOB__PRIORITY:
				setPriority((Long)newValue);
				return;
			case CimPackage.CIM_JOB__PERCENT_COMPLETE:
				setPercentComplete((Integer)newValue);
				return;
			case CimPackage.CIM_JOB__DELETE_ON_COMPLETION:
				setDeleteOnCompletion((Boolean)newValue);
				return;
			case CimPackage.CIM_JOB__ERROR_CODE:
				setErrorCode((Integer)newValue);
				return;
			case CimPackage.CIM_JOB__ERROR_DESCRIPTION:
				setErrorDescription((String)newValue);
				return;
			case CimPackage.CIM_JOB__RECOVERY_ACTION:
				setRecoveryAction((Integer)newValue);
				return;
			case CimPackage.CIM_JOB__OTHER_RECOVERY_ACTION:
				setOtherRecoveryAction((String)newValue);
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
			case CimPackage.CIM_JOB__JOB_STATUS:
				setJobStatus(JOB_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__TIME_SUBMITTED:
				setTimeSubmitted(TIME_SUBMITTED_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__SCHEDULED_START_TIME:
				setScheduledStartTime(SCHEDULED_START_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__ELAPSED_TIME:
				setElapsedTime(ELAPSED_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__JOB_RUN_TIMES:
				setJobRunTimes(JOB_RUN_TIMES_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__RUN_MONTH:
				setRunMonth(RUN_MONTH_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__RUN_DAY:
				setRunDay(RUN_DAY_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__RUN_DAY_OF_WEEK:
				setRunDayOfWeek(RUN_DAY_OF_WEEK_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__RUN_START_INTERVAL:
				setRunStartInterval(RUN_START_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__LOCAL_OR_UTC_TIME:
				setLocalOrUtcTime(LOCAL_OR_UTC_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__UNTIL_TIME:
				setUntilTime(UNTIL_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__NOTIFY:
				setNotify(NOTIFY_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__PERCENT_COMPLETE:
				setPercentComplete(PERCENT_COMPLETE_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__DELETE_ON_COMPLETION:
				setDeleteOnCompletion(DELETE_ON_COMPLETION_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__ERROR_CODE:
				setErrorCode(ERROR_CODE_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__ERROR_DESCRIPTION:
				setErrorDescription(ERROR_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__RECOVERY_ACTION:
				setRecoveryAction(RECOVERY_ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_JOB__OTHER_RECOVERY_ACTION:
				setOtherRecoveryAction(OTHER_RECOVERY_ACTION_EDEFAULT);
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
			case CimPackage.CIM_JOB__JOB_STATUS:
				return JOB_STATUS_EDEFAULT == null ? jobStatus != null : !JOB_STATUS_EDEFAULT.equals(jobStatus);
			case CimPackage.CIM_JOB__TIME_SUBMITTED:
				return TIME_SUBMITTED_EDEFAULT == null ? timeSubmitted != null : !TIME_SUBMITTED_EDEFAULT.equals(timeSubmitted);
			case CimPackage.CIM_JOB__SCHEDULED_START_TIME:
				return SCHEDULED_START_TIME_EDEFAULT == null ? scheduledStartTime != null : !SCHEDULED_START_TIME_EDEFAULT.equals(scheduledStartTime);
			case CimPackage.CIM_JOB__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case CimPackage.CIM_JOB__ELAPSED_TIME:
				return ELAPSED_TIME_EDEFAULT == null ? elapsedTime != null : !ELAPSED_TIME_EDEFAULT.equals(elapsedTime);
			case CimPackage.CIM_JOB__JOB_RUN_TIMES:
				return JOB_RUN_TIMES_EDEFAULT == null ? jobRunTimes != null : !JOB_RUN_TIMES_EDEFAULT.equals(jobRunTimes);
			case CimPackage.CIM_JOB__RUN_MONTH:
				return RUN_MONTH_EDEFAULT == null ? runMonth != null : !RUN_MONTH_EDEFAULT.equals(runMonth);
			case CimPackage.CIM_JOB__RUN_DAY:
				return RUN_DAY_EDEFAULT == null ? runDay != null : !RUN_DAY_EDEFAULT.equals(runDay);
			case CimPackage.CIM_JOB__RUN_DAY_OF_WEEK:
				return RUN_DAY_OF_WEEK_EDEFAULT == null ? runDayOfWeek != null : !RUN_DAY_OF_WEEK_EDEFAULT.equals(runDayOfWeek);
			case CimPackage.CIM_JOB__RUN_START_INTERVAL:
				return RUN_START_INTERVAL_EDEFAULT == null ? runStartInterval != null : !RUN_START_INTERVAL_EDEFAULT.equals(runStartInterval);
			case CimPackage.CIM_JOB__LOCAL_OR_UTC_TIME:
				return LOCAL_OR_UTC_TIME_EDEFAULT == null ? localOrUtcTime != null : !LOCAL_OR_UTC_TIME_EDEFAULT.equals(localOrUtcTime);
			case CimPackage.CIM_JOB__UNTIL_TIME:
				return UNTIL_TIME_EDEFAULT == null ? untilTime != null : !UNTIL_TIME_EDEFAULT.equals(untilTime);
			case CimPackage.CIM_JOB__NOTIFY:
				return NOTIFY_EDEFAULT == null ? notify != null : !NOTIFY_EDEFAULT.equals(notify);
			case CimPackage.CIM_JOB__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case CimPackage.CIM_JOB__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case CimPackage.CIM_JOB__PERCENT_COMPLETE:
				return PERCENT_COMPLETE_EDEFAULT == null ? percentComplete != null : !PERCENT_COMPLETE_EDEFAULT.equals(percentComplete);
			case CimPackage.CIM_JOB__DELETE_ON_COMPLETION:
				return DELETE_ON_COMPLETION_EDEFAULT == null ? deleteOnCompletion != null : !DELETE_ON_COMPLETION_EDEFAULT.equals(deleteOnCompletion);
			case CimPackage.CIM_JOB__ERROR_CODE:
				return ERROR_CODE_EDEFAULT == null ? errorCode != null : !ERROR_CODE_EDEFAULT.equals(errorCode);
			case CimPackage.CIM_JOB__ERROR_DESCRIPTION:
				return ERROR_DESCRIPTION_EDEFAULT == null ? errorDescription != null : !ERROR_DESCRIPTION_EDEFAULT.equals(errorDescription);
			case CimPackage.CIM_JOB__RECOVERY_ACTION:
				return RECOVERY_ACTION_EDEFAULT == null ? recoveryAction != null : !RECOVERY_ACTION_EDEFAULT.equals(recoveryAction);
			case CimPackage.CIM_JOB__OTHER_RECOVERY_ACTION:
				return OTHER_RECOVERY_ACTION_EDEFAULT == null ? otherRecoveryAction != null : !OTHER_RECOVERY_ACTION_EDEFAULT.equals(otherRecoveryAction);
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
			case CimPackage.CIM_JOB___KILL_JOB__BOOLEAN:
				return KillJob((Boolean)arguments.get(0));
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
		result.append(" (JobStatus: ");
		result.append(jobStatus);
		result.append(", TimeSubmitted: ");
		result.append(timeSubmitted);
		result.append(", ScheduledStartTime: ");
		result.append(scheduledStartTime);
		result.append(", StartTime: ");
		result.append(startTime);
		result.append(", ElapsedTime: ");
		result.append(elapsedTime);
		result.append(", JobRunTimes: ");
		result.append(jobRunTimes);
		result.append(", RunMonth: ");
		result.append(runMonth);
		result.append(", RunDay: ");
		result.append(runDay);
		result.append(", RunDayOfWeek: ");
		result.append(runDayOfWeek);
		result.append(", RunStartInterval: ");
		result.append(runStartInterval);
		result.append(", LocalOrUtcTime: ");
		result.append(localOrUtcTime);
		result.append(", UntilTime: ");
		result.append(untilTime);
		result.append(", Notify: ");
		result.append(notify);
		result.append(", Owner: ");
		result.append(owner);
		result.append(", Priority: ");
		result.append(priority);
		result.append(", PercentComplete: ");
		result.append(percentComplete);
		result.append(", DeleteOnCompletion: ");
		result.append(deleteOnCompletion);
		result.append(", ErrorCode: ");
		result.append(errorCode);
		result.append(", ErrorDescription: ");
		result.append(errorDescription);
		result.append(", RecoveryAction: ");
		result.append(recoveryAction);
		result.append(", OtherRecoveryAction: ");
		result.append(otherRecoveryAction);
		result.append(')');
		return result.toString();
	}

} //CIM_JobImpl

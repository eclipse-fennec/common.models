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
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Job is a LogicalElement that represents an executing unit of work, such as a script or a print job. A Job is distinct from a Process in that a Job can be scheduled or queued, and its execution is not limited to a single system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Job#getJobStatus <em>Job Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getTimeSubmitted <em>Time Submitted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getScheduledStartTime <em>Scheduled Start Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getElapsedTime <em>Elapsed Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getJobRunTimes <em>Job Run Times</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getRunMonth <em>Run Month</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getRunDay <em>Run Day</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getRunDayOfWeek <em>Run Day Of Week</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getRunStartInterval <em>Run Start Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getLocalOrUtcTime <em>Local Or Utc Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getUntilTime <em>Until Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getNotify <em>Notify</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getDeleteOnCompletion <em>Delete On Completion</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getErrorDescription <em>Error Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getRecoveryAction <em>Recovery Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Job#getOtherRecoveryAction <em>Other Recovery Action</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Job()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.45.0' UMLPackagePath='CIM::Core::CoreElements'"
 * @generated
 */
@ProviderType
public interface CIM_Job extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>Job Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that represents the status of the job. The primary status is reflected in the inherited OperationalStatus property. JobStatus provides additional, implementation-specific details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Job Status</em>' attribute.
	 * @see #setJobStatus(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_JobStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ManagedSystemElement.OperationalStatus\"]'"
	 * @generated
	 */
	String getJobStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getJobStatus <em>Job Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Status</em>' attribute.
	 * @see #getJobStatus()
	 * @generated
	 */
	void setJobStatus(String value);

	/**
	 * Returns the value of the '<em><b>Time Submitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that the Job was submitted to execute. A value of all zeroes indicates that the owning element is not capable of reporting a date and time. Therefore, the ScheduledStartTime and StartTime are reported as intervals relative to the time their values are requested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Submitted</em>' attribute.
	 * @see #setTimeSubmitted(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_TimeSubmitted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeSubmitted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getTimeSubmitted <em>Time Submitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Submitted</em>' attribute.
	 * @see #getTimeSubmitted()
	 * @generated
	 */
	void setTimeSubmitted(String value);

	/**
	 * Returns the value of the '<em><b>Scheduled Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that the current Job is scheduled to start. This time can be represented by the actual date and time, or an interval relative to the time that this property is requested. A value of all zeroes indicates that the Job is already executing. The property is deprecated in lieu of the more expressive scheduling properties, RunMonth, RunDay, RunDayOfWeek, and RunStartInterval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheduled Start Time</em>' attribute.
	 * @see #setScheduledStartTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_ScheduledStartTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Deprecated='[\"CIM_Job.RunMonth\",\"CIM_Job.RunDay\",\"CIM_Job.RunDayOfWeek\",\"CIM_Job.RunStartInterval\"]' Write='true'"
	 * @generated
	 */
	String getScheduledStartTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getScheduledStartTime <em>Scheduled Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Start Time</em>' attribute.
	 * @see #getScheduledStartTime()
	 * @generated
	 */
	void setScheduledStartTime(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that the Job was actually started. This time can be represented by an actual date and time, or by an interval relative to the time that this property is requested. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run time can be stored in this single-valued property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_StartTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getStartTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(String value);

	/**
	 * Returns the value of the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time interval that the Job has been executing or the total execution time if the Job is complete. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run time can be stored in this single-valued property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elapsed Time</em>' attribute.
	 * @see #setElapsedTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_ElapsedTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getElapsedTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getElapsedTime <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elapsed Time</em>' attribute.
	 * @see #getElapsedTime()
	 * @generated
	 */
	void setElapsedTime(String value);

	/**
	 * Returns the value of the '<em><b>Job Run Times</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times that the Job should be run. A value of 1 indicates that the Job is not recurring, while any non-zero value indicates a limit to the number of times that the Job will recur. Zero indicates that there is no limit to the number of times that the Job can be processed, but that it is terminated either after the UntilTime or by manual intervention. By default, a Job is processed once.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Job Run Times</em>' attribute.
	 * @see #setJobRunTimes(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_JobRunTimes()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true'"
	 * @generated
	 */
	Long getJobRunTimes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getJobRunTimes <em>Job Run Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Run Times</em>' attribute.
	 * @see #getJobRunTimes()
	 * @generated
	 */
	void setJobRunTimes(Long value);

	/**
	 * Returns the value of the '<em><b>Run Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The month during which the Job should be processed. Specify 0 for January, 1 for February, and so on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Run Month</em>' attribute.
	 * @see #setRunMonth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_RunMonth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\",\"December\"]' ModelCorrespondence='[\"CIM_Job.RunDay\",\"CIM_Job.RunDayOfWeek\",\"CIM_Job.RunStartInterval\"]'"
	 * @generated
	 */
	Integer getRunMonth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getRunMonth <em>Run Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Month</em>' attribute.
	 * @see #getRunMonth()
	 * @generated
	 */
	void setRunMonth(Integer value);

	/**
	 * Returns the value of the '<em><b>Run Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The day in the month on which the Job should be processed. There are two different interpretations for this property, depending on the value of DayOfWeek. In one case, RunDay defines the day-in-month on which the Job is processed. This interpretation is used when the DayOfWeek is 0. A positive or negative integer indicates whether the RunDay should be calculated from the beginning or end of the month. For example, 5 indicates the fifth day in the RunMonth and -1 indicates the last day in the RunMonth. 
	 * 
	 * When RunDayOfWeek is not 0, RunDay is the day-in-month on which the Job is processed, defined in conjunction with RunDayOfWeek. For example, if RunDay is 15 and RunDayOfWeek is Saturday, then the Job is processed on the first Saturday on or after the 15th day in the RunMonth (for example, the third Saturday in the month). If RunDay is 20 and RunDayOfWeek is -Saturday, then this indicates the first Saturday on or before the 20th day in the RunMonth. If RunDay is -1 and RunDayOfWeek is -Sunday, then this indicates the last Sunday in the RunMonth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Run Day</em>' attribute.
	 * @see #setRunDay(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_RunDay()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint8' Write='true' MinValue='-31' MaxValue='31' ModelCorrespondence='[\"CIM_Job.RunMonth\",\"CIM_Job.RunDayOfWeek\",\"CIM_Job.RunStartInterval\"]'"
	 * @generated
	 */
	Integer getRunDay();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getRunDay <em>Run Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Day</em>' attribute.
	 * @see #getRunDay()
	 * @generated
	 */
	void setRunDay(Integer value);

	/**
	 * Returns the value of the '<em><b>Run Day Of Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A positive or negative integer used in conjunction with RunDay to indicate the day of the week on which the Job is processed. RunDayOfWeek is set to 0 to indicate an exact day of the month, such as March 1. A positive integer (representing Sunday, Monday, ..., Saturday) means that the day of week is found on or after the specified RunDay. A negative integer (representing -Sunday, -Monday, ..., -Saturday) means that the day of week is found on or BEFORE the RunDay.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Run Day Of Week</em>' attribute.
	 * @see #setRunDayOfWeek(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_RunDayOfWeek()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint8' Write='true' ValueMap='[\"-7\",\"-6\",\"-5\",\"-4\",\"-3\",\"-2\",\"-1\",\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"-Saturday\",\"-Friday\",\"-Thursday\",\"-Wednesday\",\"-Tuesday\",\"-Monday\",\"-Sunday\",\"ExactDayOfMonth\",\"Sunday\",\"Monday\",\"Tuesday\",\"Wednesday\",\"Thursday\",\"Friday\",\"Saturday\"]' ModelCorrespondence='[\"CIM_Job.RunMonth\",\"CIM_Job.RunDay\",\"CIM_Job.RunStartInterval\"]'"
	 * @generated
	 */
	Integer getRunDayOfWeek();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getRunDayOfWeek <em>Run Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Day Of Week</em>' attribute.
	 * @see #getRunDayOfWeek()
	 * @generated
	 */
	void setRunDayOfWeek(Integer value);

	/**
	 * Returns the value of the '<em><b>Run Start Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time interval after midnight when the Job should be processed. For example, 
	 * 00000000020000.000000:000 
	 * indicates that the Job should be run on or after two o'clock, local time or UTC time (distinguished using the LocalOrUtcTime property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Run Start Interval</em>' attribute.
	 * @see #setRunStartInterval(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_RunStartInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Write='true' ModelCorrespondence='[\"CIM_Job.RunMonth\",\"CIM_Job.RunDay\",\"CIM_Job.RunDayOfWeek\",\"CIM_Job.RunStartInterval\"]'"
	 * @generated
	 */
	String getRunStartInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getRunStartInterval <em>Run Start Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Start Interval</em>' attribute.
	 * @see #getRunStartInterval()
	 * @generated
	 */
	void setRunStartInterval(String value);

	/**
	 * Returns the value of the '<em><b>Local Or Utc Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates whether the times represented in the RunStartInterval and UntilTime properties represent local times or UTC times. Time values are synchronized worldwide by using the enumeration value 2, "UTC Time".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Or Utc Time</em>' attribute.
	 * @see #setLocalOrUtcTime(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_LocalOrUtcTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"1\",\"2\"]' Values='[\"Local Time\",\"UTC Time\"]'"
	 * @generated
	 */
	Integer getLocalOrUtcTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getLocalOrUtcTime <em>Local Or Utc Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Or Utc Time</em>' attribute.
	 * @see #getLocalOrUtcTime()
	 * @generated
	 */
	void setLocalOrUtcTime(Integer value);

	/**
	 * Returns the value of the '<em><b>Until Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time after which the Job is invalid or should be stopped. This time can be represented by an actual date and time, or by an interval relative to the time that this property is requested. To indicate that the job can run indefinitely, the value can be "99999999235959.000000:000" (Infinite duration); or, "99991231115959.999999-720" (Infinite future).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Until Time</em>' attribute.
	 * @see #setUntilTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_UntilTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Write='true' ModelCorrespondence='[\"CIM_Job.LocalOrUtcTime\"]'"
	 * @generated
	 */
	String getUntilTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getUntilTime <em>Until Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until Time</em>' attribute.
	 * @see #getUntilTime()
	 * @generated
	 */
	void setUntilTime(String value);

	/**
	 * Returns the value of the '<em><b>Notify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The User who is to be notified upon the Job completion or failure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notify</em>' attribute.
	 * @see #setNotify(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_Notify()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true'"
	 * @generated
	 */
	String getNotify();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getNotify <em>Notify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notify</em>' attribute.
	 * @see #getNotify()
	 * @generated
	 */
	void setNotify(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The User that submitted the Job, or the Service or method name that caused the job to be created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_Owner()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_OwningJobElement\"]'"
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the urgency or importance of execution of the Job. The lower the number, the higher the priority. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the setting information that would influence the results of a job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_Priority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true'"
	 * @generated
	 */
	Long getPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Long value);

	/**
	 * Returns the value of the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The percentage of the job that has completed at the time that this value is requested. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run data can be stored in this single-valued property. 
	 * Note that the value 101 is undefined and will be not be allowed in the next major revision of the specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent Complete</em>' attribute.
	 * @see #setPercentComplete(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_PercentComplete()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percent' MinValue='0' MaxValue='101' PUnit='percent'"
	 * @generated
	 */
	Integer getPercentComplete();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getPercentComplete <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Complete</em>' attribute.
	 * @see #getPercentComplete()
	 * @generated
	 */
	void setPercentComplete(Integer value);

	/**
	 * Returns the value of the '<em><b>Delete On Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not the job should be automatically deleted upon completion. Note that the 'completion' of a recurring job is defined by its JobRunTimes or UntilTime properties, or when the Job is terminated by manual intervention. If this property is set to false and the job completes, then the extrinsic method DeleteInstance must be used to delete the job instead of updating this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delete On Completion</em>' attribute.
	 * @see #setDeleteOnCompletion(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_DeleteOnCompletion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getDeleteOnCompletion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getDeleteOnCompletion <em>Delete On Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete On Completion</em>' attribute.
	 * @see #getDeleteOnCompletion()
	 * @generated
	 */
	void setDeleteOnCompletion(Boolean value);

	/**
	 * Returns the value of the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A vendor-specific error code. The value must be set to zero if the Job completed without error. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run error can be stored in this single-valued property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Code</em>' attribute.
	 * @see #setErrorCode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_ErrorCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Job.ErrorDescription\"]'"
	 * @generated
	 */
	Integer getErrorCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getErrorCode <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Code</em>' attribute.
	 * @see #getErrorCode()
	 * @generated
	 */
	void setErrorCode(Integer value);

	/**
	 * Returns the value of the '<em><b>Error Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that contains the vendor error description. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run error can be stored in this single-valued property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Description</em>' attribute.
	 * @see #setErrorDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_ErrorDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Job.ErrorCode\"]'"
	 * @generated
	 */
	String getErrorDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getErrorDescription <em>Error Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Description</em>' attribute.
	 * @see #getErrorDescription()
	 * @generated
	 */
	void setErrorDescription(String value);

	/**
	 * Returns the value of the '<em><b>Recovery Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the recovery action to be taken for an unsuccessfully run Job. The possible values are: 
	 * 0 = "Unknown", meaning it is unknown as to what recovery action to take 
	 * 1 = "Other", indicating that the recovery action will be specified in the OtherRecoveryAction property 
	 * 2 = "Do Not Continue", meaning stop the execution of the job and appropriately update its status 
	 * 3 = "Continue With Next Job", meaning continue with the next job in the queue 
	 * 4 = "Re-run Job", indicating that the job should be re-run 
	 * 5 = "Run Recovery Job", meaning run the Job associated using the RecoveryJob relationship. Note that the recovery Job must already be in the queue from which it will run.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recovery Action</em>' attribute.
	 * @see #setRecoveryAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_RecoveryAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Do Not Continue\",\"Continue With Next Job\",\"Re-run Job\",\"Run Recovery Job\"]' ModelCorrespondence='[\"CIM_Job.OtherRecoveryAction\"]'"
	 * @generated
	 */
	Integer getRecoveryAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getRecoveryAction <em>Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery Action</em>' attribute.
	 * @see #getRecoveryAction()
	 * @generated
	 */
	void setRecoveryAction(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Recovery Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the recovery action when the RecoveryAction property of the instance is 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Recovery Action</em>' attribute.
	 * @see #setOtherRecoveryAction(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Job_OtherRecoveryAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Job.RecoveryAction\"]'"
	 * @generated
	 */
	String getOtherRecoveryAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Job#getOtherRecoveryAction <em>Other Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Recovery Action</em>' attribute.
	 * @see #getOtherRecoveryAction()
	 * @generated
	 */
	void setOtherRecoveryAction(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * KillJob is being deprecated because there is no distinction made between an orderly shutdown and an immediate kill. CIM_ConcreteJob.RequestStateChange() provides 'Terminate' and 'Kill' options to allow this distinction. 
	 * A method to kill this job and any underlying processes, and to remove any 'dangling' associations.
	 * @param DeleteOnKill Indicates whether or not the Job should be automatically deleted upon termination. This parameter takes precedence over the property, DeleteOnCompletion.
	 * <!-- end-model-doc -->
	 * @model DeleteOnKillAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_ConcreteJob.RequestStateChange()\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"6\",\"7\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Access Denied\",\"Not Found\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long KillJob(Boolean DeleteOnKill);

} // CIM_Job

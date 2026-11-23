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

import org.dmtf.cim.CIM_DiagnosticResult;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Diagnostic Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getDiagnosticCreationClassName <em>Diagnostic Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getDiagnosticName <em>Diagnostic Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getDiagSystemCreationClassName <em>Diag System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getDiagSystemName <em>Diag System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getExecutionID <em>Execution ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getIsPackage <em>Is Package</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getTestStartTime <em>Test Start Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getTestCompletionTime <em>Test Completion Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getTestState <em>Test State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getOtherStateDescription <em>Other State Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getEstimatedTimeOfPerforming <em>Estimated Time Of Performing</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getTestResults <em>Test Results</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getErrorCount <em>Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getLoopsFailed <em>Loops Failed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getLoopsPassed <em>Loops Passed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getTestWarningLevel <em>Test Warning Level</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getReportSoftErrors <em>Report Soft Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getReportStatusMessages <em>Report Status Messages</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getHaltOnError <em>Halt On Error</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getQuickMode <em>Quick Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DiagnosticResultImpl#getPercentOfTestCoverage <em>Percent Of Test Coverage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DiagnosticResultImpl extends MinimalEObjectImpl.Container implements CIM_DiagnosticResult {
	/**
	 * The default value of the '{@link #getDiagnosticCreationClassName() <em>Diagnostic Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGNOSTIC_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagnosticCreationClassName() <em>Diagnostic Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String diagnosticCreationClassName = DIAGNOSTIC_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagnosticName() <em>Diagnostic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticName()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGNOSTIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagnosticName() <em>Diagnostic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticName()
	 * @generated
	 * @ordered
	 */
	protected String diagnosticName = DIAGNOSTIC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagSystemCreationClassName() <em>Diag System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAG_SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagSystemCreationClassName() <em>Diag System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String diagSystemCreationClassName = DIAG_SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagSystemName() <em>Diag System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAG_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagSystemName() <em>Diag System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagSystemName()
	 * @generated
	 * @ordered
	 */
	protected String diagSystemName = DIAG_SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionID() <em>Execution ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionID()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionID() <em>Execution ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionID()
	 * @generated
	 * @ordered
	 */
	protected String executionID = EXECUTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected String timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsPackage() <em>Is Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPackage()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsPackage() <em>Is Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPackage()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPackage = IS_PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStartTime() <em>Test Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestStartTime() <em>Test Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStartTime()
	 * @generated
	 * @ordered
	 */
	protected String testStartTime = TEST_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestCompletionTime() <em>Test Completion Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCompletionTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_COMPLETION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestCompletionTime() <em>Test Completion Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCompletionTime()
	 * @generated
	 * @ordered
	 */
	protected String testCompletionTime = TEST_COMPLETION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestState() <em>Test State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TEST_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestState() <em>Test State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestState()
	 * @generated
	 * @ordered
	 */
	protected Integer testState = TEST_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherStateDescription() <em>Other State Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherStateDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_STATE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherStateDescription() <em>Other State Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherStateDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherStateDescription = OTHER_STATE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedTimeOfPerforming() <em>Estimated Time Of Performing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedTimeOfPerforming()
	 * @generated
	 * @ordered
	 */
	protected static final Long ESTIMATED_TIME_OF_PERFORMING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedTimeOfPerforming() <em>Estimated Time Of Performing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedTimeOfPerforming()
	 * @generated
	 * @ordered
	 */
	protected Long estimatedTimeOfPerforming = ESTIMATED_TIME_OF_PERFORMING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestResults() <em>Test Results</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestResults()
	 * @generated
	 * @ordered
	 */
	protected EList<String> testResults;

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
	 * The cached value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected EList<String> errorCode;

	/**
	 * The cached value of the '{@link #getErrorCount() <em>Error Count</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> errorCount;

	/**
	 * The default value of the '{@link #getLoopsFailed() <em>Loops Failed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopsFailed()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOOPS_FAILED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoopsFailed() <em>Loops Failed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopsFailed()
	 * @generated
	 * @ordered
	 */
	protected Long loopsFailed = LOOPS_FAILED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoopsPassed() <em>Loops Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopsPassed()
	 * @generated
	 * @ordered
	 */
	protected static final Long LOOPS_PASSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoopsPassed() <em>Loops Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopsPassed()
	 * @generated
	 * @ordered
	 */
	protected Long loopsPassed = LOOPS_PASSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestWarningLevel() <em>Test Warning Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestWarningLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TEST_WARNING_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestWarningLevel() <em>Test Warning Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestWarningLevel()
	 * @generated
	 * @ordered
	 */
	protected Integer testWarningLevel = TEST_WARNING_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReportSoftErrors() <em>Report Soft Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportSoftErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REPORT_SOFT_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReportSoftErrors() <em>Report Soft Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportSoftErrors()
	 * @generated
	 * @ordered
	 */
	protected Boolean reportSoftErrors = REPORT_SOFT_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReportStatusMessages() <em>Report Status Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportStatusMessages()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REPORT_STATUS_MESSAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReportStatusMessages() <em>Report Status Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportStatusMessages()
	 * @generated
	 * @ordered
	 */
	protected Boolean reportStatusMessages = REPORT_STATUS_MESSAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHaltOnError() <em>Halt On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaltOnError()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HALT_ON_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHaltOnError() <em>Halt On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaltOnError()
	 * @generated
	 * @ordered
	 */
	protected Boolean haltOnError = HALT_ON_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuickMode() <em>Quick Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuickMode()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean QUICK_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuickMode() <em>Quick Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuickMode()
	 * @generated
	 * @ordered
	 */
	protected Boolean quickMode = QUICK_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentOfTestCoverage() <em>Percent Of Test Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentOfTestCoverage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERCENT_OF_TEST_COVERAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentOfTestCoverage() <em>Percent Of Test Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentOfTestCoverage()
	 * @generated
	 * @ordered
	 */
	protected Integer percentOfTestCoverage = PERCENT_OF_TEST_COVERAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DiagnosticResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DiagnosticResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiagnosticCreationClassName() {
		return diagnosticCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagnosticCreationClassName(String newDiagnosticCreationClassName) {
		String oldDiagnosticCreationClassName = diagnosticCreationClassName;
		diagnosticCreationClassName = newDiagnosticCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__DIAGNOSTIC_CREATION_CLASS_NAME, oldDiagnosticCreationClassName, diagnosticCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiagnosticName() {
		return diagnosticName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagnosticName(String newDiagnosticName) {
		String oldDiagnosticName = diagnosticName;
		diagnosticName = newDiagnosticName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__DIAGNOSTIC_NAME, oldDiagnosticName, diagnosticName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiagSystemCreationClassName() {
		return diagSystemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagSystemCreationClassName(String newDiagSystemCreationClassName) {
		String oldDiagSystemCreationClassName = diagSystemCreationClassName;
		diagSystemCreationClassName = newDiagSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__DIAG_SYSTEM_CREATION_CLASS_NAME, oldDiagSystemCreationClassName, diagSystemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiagSystemName() {
		return diagSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagSystemName(String newDiagSystemName) {
		String oldDiagSystemName = diagSystemName;
		diagSystemName = newDiagSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__DIAG_SYSTEM_NAME, oldDiagSystemName, diagSystemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExecutionID() {
		return executionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionID(String newExecutionID) {
		String oldExecutionID = executionID;
		executionID = newExecutionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__EXECUTION_ID, oldExecutionID, executionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeStamp(String newTimeStamp) {
		String oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsPackage() {
		return isPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPackage(Boolean newIsPackage) {
		Boolean oldIsPackage = isPackage;
		isPackage = newIsPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__IS_PACKAGE, oldIsPackage, isPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestStartTime() {
		return testStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestStartTime(String newTestStartTime) {
		String oldTestStartTime = testStartTime;
		testStartTime = newTestStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_START_TIME, oldTestStartTime, testStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestCompletionTime() {
		return testCompletionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestCompletionTime(String newTestCompletionTime) {
		String oldTestCompletionTime = testCompletionTime;
		testCompletionTime = newTestCompletionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_COMPLETION_TIME, oldTestCompletionTime, testCompletionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTestState() {
		return testState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestState(Integer newTestState) {
		Integer oldTestState = testState;
		testState = newTestState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_STATE, oldTestState, testState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherStateDescription() {
		return otherStateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherStateDescription(String newOtherStateDescription) {
		String oldOtherStateDescription = otherStateDescription;
		otherStateDescription = newOtherStateDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__OTHER_STATE_DESCRIPTION, oldOtherStateDescription, otherStateDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getEstimatedTimeOfPerforming() {
		return estimatedTimeOfPerforming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedTimeOfPerforming(Long newEstimatedTimeOfPerforming) {
		Long oldEstimatedTimeOfPerforming = estimatedTimeOfPerforming;
		estimatedTimeOfPerforming = newEstimatedTimeOfPerforming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__ESTIMATED_TIME_OF_PERFORMING, oldEstimatedTimeOfPerforming, estimatedTimeOfPerforming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTestResults() {
		if (testResults == null) {
			testResults = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_RESULTS);
		}
		return testResults;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__PERCENT_COMPLETE, oldPercentComplete, percentComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getErrorCode() {
		if (errorCode == null) {
			errorCode = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DIAGNOSTIC_RESULT__ERROR_CODE);
		}
		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getErrorCount() {
		if (errorCount == null) {
			errorCount = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_DIAGNOSTIC_RESULT__ERROR_COUNT);
		}
		return errorCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLoopsFailed() {
		return loopsFailed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoopsFailed(Long newLoopsFailed) {
		Long oldLoopsFailed = loopsFailed;
		loopsFailed = newLoopsFailed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__LOOPS_FAILED, oldLoopsFailed, loopsFailed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLoopsPassed() {
		return loopsPassed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoopsPassed(Long newLoopsPassed) {
		Long oldLoopsPassed = loopsPassed;
		loopsPassed = newLoopsPassed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__LOOPS_PASSED, oldLoopsPassed, loopsPassed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTestWarningLevel() {
		return testWarningLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestWarningLevel(Integer newTestWarningLevel) {
		Integer oldTestWarningLevel = testWarningLevel;
		testWarningLevel = newTestWarningLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_WARNING_LEVEL, oldTestWarningLevel, testWarningLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getReportSoftErrors() {
		return reportSoftErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReportSoftErrors(Boolean newReportSoftErrors) {
		Boolean oldReportSoftErrors = reportSoftErrors;
		reportSoftErrors = newReportSoftErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__REPORT_SOFT_ERRORS, oldReportSoftErrors, reportSoftErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getReportStatusMessages() {
		return reportStatusMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReportStatusMessages(Boolean newReportStatusMessages) {
		Boolean oldReportStatusMessages = reportStatusMessages;
		reportStatusMessages = newReportStatusMessages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__REPORT_STATUS_MESSAGES, oldReportStatusMessages, reportStatusMessages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHaltOnError() {
		return haltOnError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHaltOnError(Boolean newHaltOnError) {
		Boolean oldHaltOnError = haltOnError;
		haltOnError = newHaltOnError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__HALT_ON_ERROR, oldHaltOnError, haltOnError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getQuickMode() {
		return quickMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuickMode(Boolean newQuickMode) {
		Boolean oldQuickMode = quickMode;
		quickMode = newQuickMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__QUICK_MODE, oldQuickMode, quickMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPercentOfTestCoverage() {
		return percentOfTestCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentOfTestCoverage(Integer newPercentOfTestCoverage) {
		Integer oldPercentOfTestCoverage = percentOfTestCoverage;
		percentOfTestCoverage = newPercentOfTestCoverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DIAGNOSTIC_RESULT__PERCENT_OF_TEST_COVERAGE, oldPercentOfTestCoverage, percentOfTestCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAGNOSTIC_CREATION_CLASS_NAME:
				return getDiagnosticCreationClassName();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAGNOSTIC_NAME:
				return getDiagnosticName();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAG_SYSTEM_CREATION_CLASS_NAME:
				return getDiagSystemCreationClassName();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAG_SYSTEM_NAME:
				return getDiagSystemName();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__EXECUTION_ID:
				return getExecutionID();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TIME_STAMP:
				return getTimeStamp();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__IS_PACKAGE:
				return getIsPackage();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_START_TIME:
				return getTestStartTime();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_COMPLETION_TIME:
				return getTestCompletionTime();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_STATE:
				return getTestState();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__OTHER_STATE_DESCRIPTION:
				return getOtherStateDescription();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__ESTIMATED_TIME_OF_PERFORMING:
				return getEstimatedTimeOfPerforming();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_RESULTS:
				return getTestResults();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__PERCENT_COMPLETE:
				return getPercentComplete();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__ERROR_CODE:
				return getErrorCode();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__ERROR_COUNT:
				return getErrorCount();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__LOOPS_FAILED:
				return getLoopsFailed();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__LOOPS_PASSED:
				return getLoopsPassed();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_WARNING_LEVEL:
				return getTestWarningLevel();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__REPORT_SOFT_ERRORS:
				return getReportSoftErrors();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__REPORT_STATUS_MESSAGES:
				return getReportStatusMessages();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__HALT_ON_ERROR:
				return getHaltOnError();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__QUICK_MODE:
				return getQuickMode();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__PERCENT_OF_TEST_COVERAGE:
				return getPercentOfTestCoverage();
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
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAGNOSTIC_CREATION_CLASS_NAME:
				setDiagnosticCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAGNOSTIC_NAME:
				setDiagnosticName((String)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAG_SYSTEM_CREATION_CLASS_NAME:
				setDiagSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAG_SYSTEM_NAME:
				setDiagSystemName((String)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__EXECUTION_ID:
				setExecutionID((String)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TIME_STAMP:
				setTimeStamp((String)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__IS_PACKAGE:
				setIsPackage((Boolean)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_START_TIME:
				setTestStartTime((String)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_COMPLETION_TIME:
				setTestCompletionTime((String)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_STATE:
				setTestState((Integer)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__OTHER_STATE_DESCRIPTION:
				setOtherStateDescription((String)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__ESTIMATED_TIME_OF_PERFORMING:
				setEstimatedTimeOfPerforming((Long)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_RESULTS:
				getTestResults().clear();
				getTestResults().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__PERCENT_COMPLETE:
				setPercentComplete((Integer)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__ERROR_CODE:
				getErrorCode().clear();
				getErrorCode().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__ERROR_COUNT:
				getErrorCount().clear();
				getErrorCount().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__LOOPS_FAILED:
				setLoopsFailed((Long)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__LOOPS_PASSED:
				setLoopsPassed((Long)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_WARNING_LEVEL:
				setTestWarningLevel((Integer)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__REPORT_SOFT_ERRORS:
				setReportSoftErrors((Boolean)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__REPORT_STATUS_MESSAGES:
				setReportStatusMessages((Boolean)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__HALT_ON_ERROR:
				setHaltOnError((Boolean)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__QUICK_MODE:
				setQuickMode((Boolean)newValue);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__PERCENT_OF_TEST_COVERAGE:
				setPercentOfTestCoverage((Integer)newValue);
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
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAGNOSTIC_CREATION_CLASS_NAME:
				setDiagnosticCreationClassName(DIAGNOSTIC_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAGNOSTIC_NAME:
				setDiagnosticName(DIAGNOSTIC_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAG_SYSTEM_CREATION_CLASS_NAME:
				setDiagSystemCreationClassName(DIAG_SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAG_SYSTEM_NAME:
				setDiagSystemName(DIAG_SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__EXECUTION_ID:
				setExecutionID(EXECUTION_ID_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__IS_PACKAGE:
				setIsPackage(IS_PACKAGE_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_START_TIME:
				setTestStartTime(TEST_START_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_COMPLETION_TIME:
				setTestCompletionTime(TEST_COMPLETION_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_STATE:
				setTestState(TEST_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__OTHER_STATE_DESCRIPTION:
				setOtherStateDescription(OTHER_STATE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__ESTIMATED_TIME_OF_PERFORMING:
				setEstimatedTimeOfPerforming(ESTIMATED_TIME_OF_PERFORMING_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_RESULTS:
				getTestResults().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__PERCENT_COMPLETE:
				setPercentComplete(PERCENT_COMPLETE_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__ERROR_CODE:
				getErrorCode().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__ERROR_COUNT:
				getErrorCount().clear();
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__LOOPS_FAILED:
				setLoopsFailed(LOOPS_FAILED_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__LOOPS_PASSED:
				setLoopsPassed(LOOPS_PASSED_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_WARNING_LEVEL:
				setTestWarningLevel(TEST_WARNING_LEVEL_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__REPORT_SOFT_ERRORS:
				setReportSoftErrors(REPORT_SOFT_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__REPORT_STATUS_MESSAGES:
				setReportStatusMessages(REPORT_STATUS_MESSAGES_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__HALT_ON_ERROR:
				setHaltOnError(HALT_ON_ERROR_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__QUICK_MODE:
				setQuickMode(QUICK_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_DIAGNOSTIC_RESULT__PERCENT_OF_TEST_COVERAGE:
				setPercentOfTestCoverage(PERCENT_OF_TEST_COVERAGE_EDEFAULT);
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
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAGNOSTIC_CREATION_CLASS_NAME:
				return DIAGNOSTIC_CREATION_CLASS_NAME_EDEFAULT == null ? diagnosticCreationClassName != null : !DIAGNOSTIC_CREATION_CLASS_NAME_EDEFAULT.equals(diagnosticCreationClassName);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAGNOSTIC_NAME:
				return DIAGNOSTIC_NAME_EDEFAULT == null ? diagnosticName != null : !DIAGNOSTIC_NAME_EDEFAULT.equals(diagnosticName);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAG_SYSTEM_CREATION_CLASS_NAME:
				return DIAG_SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? diagSystemCreationClassName != null : !DIAG_SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(diagSystemCreationClassName);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__DIAG_SYSTEM_NAME:
				return DIAG_SYSTEM_NAME_EDEFAULT == null ? diagSystemName != null : !DIAG_SYSTEM_NAME_EDEFAULT.equals(diagSystemName);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__EXECUTION_ID:
				return EXECUTION_ID_EDEFAULT == null ? executionID != null : !EXECUTION_ID_EDEFAULT.equals(executionID);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__IS_PACKAGE:
				return IS_PACKAGE_EDEFAULT == null ? isPackage != null : !IS_PACKAGE_EDEFAULT.equals(isPackage);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_START_TIME:
				return TEST_START_TIME_EDEFAULT == null ? testStartTime != null : !TEST_START_TIME_EDEFAULT.equals(testStartTime);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_COMPLETION_TIME:
				return TEST_COMPLETION_TIME_EDEFAULT == null ? testCompletionTime != null : !TEST_COMPLETION_TIME_EDEFAULT.equals(testCompletionTime);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_STATE:
				return TEST_STATE_EDEFAULT == null ? testState != null : !TEST_STATE_EDEFAULT.equals(testState);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__OTHER_STATE_DESCRIPTION:
				return OTHER_STATE_DESCRIPTION_EDEFAULT == null ? otherStateDescription != null : !OTHER_STATE_DESCRIPTION_EDEFAULT.equals(otherStateDescription);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__ESTIMATED_TIME_OF_PERFORMING:
				return ESTIMATED_TIME_OF_PERFORMING_EDEFAULT == null ? estimatedTimeOfPerforming != null : !ESTIMATED_TIME_OF_PERFORMING_EDEFAULT.equals(estimatedTimeOfPerforming);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_RESULTS:
				return testResults != null && !testResults.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__PERCENT_COMPLETE:
				return PERCENT_COMPLETE_EDEFAULT == null ? percentComplete != null : !PERCENT_COMPLETE_EDEFAULT.equals(percentComplete);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__ERROR_CODE:
				return errorCode != null && !errorCode.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__ERROR_COUNT:
				return errorCount != null && !errorCount.isEmpty();
			case CimPackage.CIM_DIAGNOSTIC_RESULT__LOOPS_FAILED:
				return LOOPS_FAILED_EDEFAULT == null ? loopsFailed != null : !LOOPS_FAILED_EDEFAULT.equals(loopsFailed);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__LOOPS_PASSED:
				return LOOPS_PASSED_EDEFAULT == null ? loopsPassed != null : !LOOPS_PASSED_EDEFAULT.equals(loopsPassed);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__TEST_WARNING_LEVEL:
				return TEST_WARNING_LEVEL_EDEFAULT == null ? testWarningLevel != null : !TEST_WARNING_LEVEL_EDEFAULT.equals(testWarningLevel);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__REPORT_SOFT_ERRORS:
				return REPORT_SOFT_ERRORS_EDEFAULT == null ? reportSoftErrors != null : !REPORT_SOFT_ERRORS_EDEFAULT.equals(reportSoftErrors);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__REPORT_STATUS_MESSAGES:
				return REPORT_STATUS_MESSAGES_EDEFAULT == null ? reportStatusMessages != null : !REPORT_STATUS_MESSAGES_EDEFAULT.equals(reportStatusMessages);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__HALT_ON_ERROR:
				return HALT_ON_ERROR_EDEFAULT == null ? haltOnError != null : !HALT_ON_ERROR_EDEFAULT.equals(haltOnError);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__QUICK_MODE:
				return QUICK_MODE_EDEFAULT == null ? quickMode != null : !QUICK_MODE_EDEFAULT.equals(quickMode);
			case CimPackage.CIM_DIAGNOSTIC_RESULT__PERCENT_OF_TEST_COVERAGE:
				return PERCENT_OF_TEST_COVERAGE_EDEFAULT == null ? percentOfTestCoverage != null : !PERCENT_OF_TEST_COVERAGE_EDEFAULT.equals(percentOfTestCoverage);
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
		result.append(" (DiagnosticCreationClassName: ");
		result.append(diagnosticCreationClassName);
		result.append(", DiagnosticName: ");
		result.append(diagnosticName);
		result.append(", DiagSystemCreationClassName: ");
		result.append(diagSystemCreationClassName);
		result.append(", DiagSystemName: ");
		result.append(diagSystemName);
		result.append(", ExecutionID: ");
		result.append(executionID);
		result.append(", TimeStamp: ");
		result.append(timeStamp);
		result.append(", IsPackage: ");
		result.append(isPackage);
		result.append(", TestStartTime: ");
		result.append(testStartTime);
		result.append(", TestCompletionTime: ");
		result.append(testCompletionTime);
		result.append(", TestState: ");
		result.append(testState);
		result.append(", OtherStateDescription: ");
		result.append(otherStateDescription);
		result.append(", EstimatedTimeOfPerforming: ");
		result.append(estimatedTimeOfPerforming);
		result.append(", TestResults: ");
		result.append(testResults);
		result.append(", PercentComplete: ");
		result.append(percentComplete);
		result.append(", ErrorCode: ");
		result.append(errorCode);
		result.append(", ErrorCount: ");
		result.append(errorCount);
		result.append(", LoopsFailed: ");
		result.append(loopsFailed);
		result.append(", LoopsPassed: ");
		result.append(loopsPassed);
		result.append(", TestWarningLevel: ");
		result.append(testWarningLevel);
		result.append(", ReportSoftErrors: ");
		result.append(reportSoftErrors);
		result.append(", ReportStatusMessages: ");
		result.append(reportStatusMessages);
		result.append(", HaltOnError: ");
		result.append(haltOnError);
		result.append(", QuickMode: ");
		result.append(quickMode);
		result.append(", PercentOfTestCoverage: ");
		result.append(percentOfTestCoverage);
		result.append(')');
		return result.toString();
	}

} //CIM_DiagnosticResultImpl

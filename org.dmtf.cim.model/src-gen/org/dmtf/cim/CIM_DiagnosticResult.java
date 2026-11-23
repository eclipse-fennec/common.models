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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Diagnostic Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * When a DiagnosticTest Service is running, test results are reported using a DiagnosticResult object, or one of its subclasses. A DiagnosticTest may be running because its Service is Started or due to an invocation of the RunTest method. Diagnostic Results are related to their Test via an instance of the DiagnosticResultsForMSE association. 
 * For every running of DiagnosticTest, a new instance of DiagnosticResult, or one of it's subclasses should be created.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getDiagnosticCreationClassName <em>Diagnostic Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getDiagnosticName <em>Diagnostic Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getDiagSystemCreationClassName <em>Diag System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getDiagSystemName <em>Diag System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getExecutionID <em>Execution ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getIsPackage <em>Is Package</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getTestStartTime <em>Test Start Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getTestCompletionTime <em>Test Completion Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getTestState <em>Test State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getOtherStateDescription <em>Other State Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getEstimatedTimeOfPerforming <em>Estimated Time Of Performing</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getTestResults <em>Test Results</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getPercentComplete <em>Percent Complete</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getErrorCount <em>Error Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getLoopsFailed <em>Loops Failed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getLoopsPassed <em>Loops Passed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getTestWarningLevel <em>Test Warning Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getReportSoftErrors <em>Report Soft Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getReportStatusMessages <em>Report Status Messages</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getHaltOnError <em>Halt On Error</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getQuickMode <em>Quick Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticResult#getPercentOfTestCoverage <em>Percent Of Test Coverage</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_DiagnosticServiceRecord\"]' Version='2.54.1' UMLPackagePath='CIM::System::Diagnostics' keys='DiagnosticCreationClassName,DiagnosticName,DiagSystemCreationClassName,DiagSystemName,ExecutionID'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagnostic Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Test's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnostic Creation Class Name</em>' attribute.
	 * @see #setDiagnosticCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_DiagnosticCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' Key='true' MaxLen='256' Propagated='CIM_DiagnosticTest.CreationClassName'"
	 * @generated
	 */
	String getDiagnosticCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getDiagnosticCreationClassName <em>Diagnostic Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Creation Class Name</em>' attribute.
	 * @see #getDiagnosticCreationClassName()
	 * @generated
	 */
	void setDiagnosticCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Diagnostic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Test's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnostic Name</em>' attribute.
	 * @see #setDiagnosticName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_DiagnosticName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' Key='true' MaxLen='256' Propagated='CIM_DiagnosticTest.Name'"
	 * @generated
	 */
	String getDiagnosticName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getDiagnosticName <em>Diagnostic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Name</em>' attribute.
	 * @see #getDiagnosticName()
	 * @generated
	 */
	void setDiagnosticName(String value);

	/**
	 * Returns the value of the '<em><b>Diag System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Test's SystemCreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diag System Creation Class Name</em>' attribute.
	 * @see #setDiagSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_DiagSystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' Key='true' MaxLen='256' Propagated='CIM_DiagnosticTest.SystemCreationClassName'"
	 * @generated
	 */
	String getDiagSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getDiagSystemCreationClassName <em>Diag System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diag System Creation Class Name</em>' attribute.
	 * @see #getDiagSystemCreationClassName()
	 * @generated
	 */
	void setDiagSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Diag System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping Test's SystemName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diag System Name</em>' attribute.
	 * @see #setDiagSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_DiagSystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' Key='true' MaxLen='256' Propagated='CIM_DiagnosticTest.SystemName'"
	 * @generated
	 */
	String getDiagSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getDiagSystemName <em>Diag System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diag System Name</em>' attribute.
	 * @see #getDiagSystemName()
	 * @generated
	 */
	void setDiagSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Execution ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Unique identifier for an instance of Diagnostic Results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution ID</em>' attribute.
	 * @see #setExecutionID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_ExecutionID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_DiagnosticRecord.InstanceID\"]' Key='true' MaxLen='1024'"
	 * @generated
	 */
	String getExecutionID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getExecutionID <em>Execution ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution ID</em>' attribute.
	 * @see #getExecutionID()
	 * @generated
	 */
	void setExecutionID(String value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time the result was last updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_TimeStamp()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Deprecated='[\"CIM_DiagnosticRecord.CreationTimeStamp\"]'"
	 * @generated
	 */
	String getTimeStamp();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(String value);

	/**
	 * Returns the value of the '<em><b>Is Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is being deprecated. Tests should be grouped at the test level, not by the model. /n If this property is TRUE, then this DiagnosticResult summarizes the results from the execution of a packaged set of DiagnosticTests. The Tests in the package can be identified by following the DiagnosticResultForTest association to the test and then using the DiagnosticTest InPackage aggregation. The individual Results can be broken out by instantiating DiagnosticResults for the individual lower level tests and aggregating into the 'summary' Result using the DiagnosticResultInPackage association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Package</em>' attribute.
	 * @see #setIsPackage(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_IsPackage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Boolean getIsPackage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getIsPackage <em>Is Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Package</em>' attribute.
	 * @see #getIsPackage()
	 * @generated
	 */
	void setIsPackage(Boolean value);

	/**
	 * Returns the value of the '<em><b>Test Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time when this test started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Start Time</em>' attribute.
	 * @see #setTestStartTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_TestStartTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Deprecated='[\"CIM_Job.StartTime\"]'"
	 * @generated
	 */
	String getTestStartTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getTestStartTime <em>Test Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Start Time</em>' attribute.
	 * @see #getTestStartTime()
	 * @generated
	 */
	void setTestStartTime(String value);

	/**
	 * Returns the value of the '<em><b>Test Completion Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time when this test completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Completion Time</em>' attribute.
	 * @see #setTestCompletionTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_TestCompletionTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	String getTestCompletionTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getTestCompletionTime <em>Test Completion Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Completion Time</em>' attribute.
	 * @see #getTestCompletionTime()
	 * @generated
	 */
	void setTestCompletionTime(String value);

	/**
	 * Returns the value of the '<em><b>Test State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes how the test is progressing. For example, if the test was discontinued, the TestState will be "Stopped" (value=5), or if testing is currently executing, TestState will be "In Progress" (4).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test State</em>' attribute.
	 * @see #setTestState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_TestState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Passed\",\"Failed\",\"In Progress\",\"Stopped\"]' ModelCorrespondence='[\"CIM_DiagnosticResult.OtherStateDescription\"]'"
	 * @generated
	 */
	Integer getTestState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getTestState <em>Test State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test State</em>' attribute.
	 * @see #getTestState()
	 * @generated
	 */
	void setTestState(Integer value);

	/**
	 * Returns the value of the '<em><b>Other State Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When "Other" (value=1) is entered in the TestState property, OtherStateDescription can be used to describe the test's state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other State Description</em>' attribute.
	 * @see #setOtherStateDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_OtherStateDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' ModelCorrespondence='[\"CIM_DiagnosticResult.TestState\"]'"
	 * @generated
	 */
	String getOtherStateDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getOtherStateDescription <em>Other State Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other State Description</em>' attribute.
	 * @see #getOtherStateDescription()
	 * @generated
	 */
	void setOtherStateDescription(String value);

	/**
	 * Returns the value of the '<em><b>Estimated Time Of Performing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated number of seconds to perform the Diagnostic Test indicated by the DiagnosticCreationClassName and DiagnosticName properties. After the test has completed, the actual elapsed time can be determined by subtracting the TestStartTime from the TestCompletionTime. A similar property is defined in the association, DiagnosticTest ForMSE. The difference between the two properties is that the value stored in the association is a generic test execution time for the Element and the Test. But, the value here (in DiagnosticResult) is the estimated time that this instance with the given settings would take to run the test. A CIM Consumer can compare this value with the value in the association DiagnosticTestForMSE to get an idea what impact their settings have on test execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated Time Of Performing</em>' attribute.
	 * @see #setEstimatedTimeOfPerforming(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_EstimatedTimeOfPerforming()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"No value\"]' Units='Seconds' ModelCorrespondence='[\"CIM_DiagnosticTestForMSE.EstimatedTimeOfPerforming\"]' PUnit='second'"
	 * @generated
	 */
	Long getEstimatedTimeOfPerforming();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getEstimatedTimeOfPerforming <em>Estimated Time Of Performing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Time Of Performing</em>' attribute.
	 * @see #getEstimatedTimeOfPerforming()
	 * @generated
	 */
	void setEstimatedTimeOfPerforming(Long value);

	/**
	 * Returns the value of the '<em><b>Test Results</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TestResults stores one or more textual results from the execution of the DiagnosticTest(s) referenced by the DiagnosticCreationClassName and DiagnosticName properties. One entry is considered a cell location in the array. Each entry is time stamped and contains the following information, in the following format: 
	 * LogOption|yyymmddhhttssoutc|TestName|message_text 
	 * Where: 
	 * LogOption = string identical to the LogOption value in DiagnosticSetting that was used to enable logging this message. 
	 * yyyy = year, e.g. 2000 
	 * mm = month (01 - 12) 
	 * dd = day (01 - 31) 
	 * hh = hour (00 - 24) 
	 * tt = minute (00-59) 
	 * ss = second (00-59) 
	 * o = "+" or "-" indicating the sign of the UTC correction field 
	 * utc = offset from UTC (Universal Coordinated Time) in minutes 
	 * TestName = Internal test name or current internal subtest name that sent the message. 
	 * Textual message = free form string that is the 'test result'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Results</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_TestResults()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_LogRecord.RecordData\"]' ArrayType='Ordered'"
	 * @generated
	 */
	EList<String> getTestResults();

	/**
	 * Returns the value of the '<em><b>Percent Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The percentage of the test that has executed thus far, if the TestState property is set to "In Progress" or the percentage of the complete test that was executed if the TestState property is set to any of the completed states ("Passed", "Failed" or "Stopped"). Final results may be based on less than 100% coverage due to the parameters defined in DiagnosticSetting (such as QuickMode, PercentOfTestCoverage or HaltOnError).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent Complete</em>' attribute.
	 * @see #setPercentComplete(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_PercentComplete()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Deprecated='[\"CIM_Job.PercentComplete\"]' Units='Percent' MinValue='0' MaxValue='100' PUnit='percent'"
	 * @generated
	 */
	Integer getPercentComplete();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getPercentComplete <em>Percent Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Complete</em>' attribute.
	 * @see #getPercentComplete()
	 * @generated
	 */
	void setPercentComplete(Integer value);

	/**
	 * Returns the value of the '<em><b>Error Code</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If applicable, this string should contain one or more vendor specific error codes that the diagnostic service detected. These error codes may be used by the vendor for variety of purposes such as: fault data base indexing, field service trouble ticketing, product quality tracking, part failure history, etc. Since these codes are for vendor purposes they may assume any form. Details on suggested use cases will be left to white papers. The array of error codes has model correspondence with an ErrorCount array so the number of errors reported can be analyzed by individual error code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Code</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_ErrorCode()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_DiagnosticServiceRecord.ErrorCode\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticResult.ErrorCount\"]'"
	 * @generated
	 */
	EList<String> getErrorCode();

	/**
	 * Returns the value of the '<em><b>Error Count</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Since some tests may detect transient and correctable errors such as a network diagnostic or memory test, an error count is useful to indicate the severity of the failure. This field contains an integer value of the number of errors detected by the test. The ErrorCount is an array with model correspondence to ErrorCode so that the test can report an ErrorCount on each type of error encountered. It is recommended that hard errors and correctable or recoverable errors be given different codes so that clients with knowledge of the error codes can evaluate correctable, recoverable, and hard errors independently.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Count</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_ErrorCount()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' Deprecated='[\"CIM_DiagnosticServiceRecord.ErrorCount\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticResult.ErrorCode\"]'"
	 * @generated
	 */
	EList<Long> getErrorCount();

	/**
	 * Returns the value of the '<em><b>Loops Failed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Since some tests may be looped, it is useful to report how many iterations passed and failed. This is relevant in analyzing transitory failures. For example, if all the errors occurred in just one of 100 iterations, the device may be viewed as OK or marginal, to be monitored further rather then failed. Note: LoopsPassed & LoopsFailed should add up to the loops completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loops Failed</em>' attribute.
	 * @see #setLoopsFailed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_LoopsFailed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_DiagnosticServiceRecord.LoopsFailed\"]'"
	 * @generated
	 */
	Long getLoopsFailed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getLoopsFailed <em>Loops Failed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loops Failed</em>' attribute.
	 * @see #getLoopsFailed()
	 * @generated
	 */
	void setLoopsFailed(Long value);

	/**
	 * Returns the value of the '<em><b>Loops Passed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Since some tests may be looped, it is useful to report how many iterations passed and failed. This is relevant in analyzing transitory failures. For example if all the errors occurred in just one of 100 iterations, the device may be viewed as OK or marginal, to be monitored further rather then failed. Note: LoopsPassed & LoopsFailed should add up to the loops completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loops Passed</em>' attribute.
	 * @see #setLoopsPassed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_LoopsPassed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_DiagnosticServiceRecord.LoopsPassed\"]'"
	 * @generated
	 */
	Long getLoopsPassed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getLoopsPassed <em>Loops Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loops Passed</em>' attribute.
	 * @see #getLoopsPassed()
	 * @generated
	 */
	void setLoopsPassed(Long value);

	/**
	 * Returns the value of the '<em><b>Test Warning Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the level of warning messages to be logged. If for example no warning information is required, the level would be set to "No Warnings" (value=0). Using "Missing Resources" (value=1) will cause warnings to be generated when required resources or hardware are not found. Setting the value to 2, "Testing Impacts", results in both missing resources and 'test impact' warnings (for example, multiple retries required) to be reported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Warning Level</em>' attribute.
	 * @see #setTestWarningLevel(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_TestWarningLevel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_DiagnosticSetting.LogOptions\"]' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"No Warnings\",\"Missing Resources\",\"Testing Impacts\",\"All Warnings\"]'"
	 * @generated
	 */
	Integer getTestWarningLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getTestWarningLevel <em>Test Warning Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Warning Level</em>' attribute.
	 * @see #getTestWarningLevel()
	 * @generated
	 */
	void setTestWarningLevel(Integer value);

	/**
	 * Returns the value of the '<em><b>Report Soft Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this flag is true, the diagnostic test will report 'soft errors'. In this context, a soft error is a message from the diagnostic reporting a known defect in the hardware or driver configuration, or execution environment. Examples are: 'Not enough memory', 'Driver IOCTL not implemented', 'Video RAM compare failed during polygon fill test (A known defect in the video chipset)', etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Soft Errors</em>' attribute.
	 * @see #setReportSoftErrors(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_ReportSoftErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_DiagnosticSetting.LogOptions\"]' Write='true'"
	 * @generated
	 */
	Boolean getReportSoftErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getReportSoftErrors <em>Report Soft Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Soft Errors</em>' attribute.
	 * @see #getReportSoftErrors()
	 * @generated
	 */
	void setReportSoftErrors(Boolean value);

	/**
	 * Returns the value of the '<em><b>Report Status Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this flag is true, the diagnostic test will report 'status messages'. In this context, a status message indicates that the diagnostic code is at a checkpoint. Examples are: "Completion of phase 1", "Complex pattern", etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Status Messages</em>' attribute.
	 * @see #setReportStatusMessages(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_ReportStatusMessages()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_DiagnosticSetting.LogOptions\"]' Write='true'"
	 * @generated
	 */
	Boolean getReportStatusMessages();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getReportStatusMessages <em>Report Status Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Status Messages</em>' attribute.
	 * @see #getReportStatusMessages()
	 * @generated
	 */
	void setReportStatusMessages(Boolean value);

	/**
	 * Returns the value of the '<em><b>Halt On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this flag is true, the test will halt after finding the first error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Halt On Error</em>' attribute.
	 * @see #setHaltOnError(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_HaltOnError()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_DiagnosticSettingRecord.HaltOnError\"]' Write='true'"
	 * @generated
	 */
	Boolean getHaltOnError();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getHaltOnError <em>Halt On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Halt On Error</em>' attribute.
	 * @see #getHaltOnError()
	 * @generated
	 */
	void setHaltOnError(Boolean value);

	/**
	 * Returns the value of the '<em><b>Quick Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this flag is true, the test software should attempt to run in an accelerated fashion either by reducing the coverage or number of tests performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quick Mode</em>' attribute.
	 * @see #setQuickMode(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_QuickMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_DiagnosticSettingRecord.QuickMode\"]' Write='true'"
	 * @generated
	 */
	Boolean getQuickMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getQuickMode <em>Quick Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quick Mode</em>' attribute.
	 * @see #getQuickMode()
	 * @generated
	 */
	void setQuickMode(Boolean value);

	/**
	 * Returns the value of the '<em><b>Percent Of Test Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests the diagnostic software to reduce test coverage to the specified percentage. For example, a hard drive scan test could be asked to run at 50%. The most effective way to accomplish this is for the test software to scan every other track, as opposed to only scanning the first half of a drive. It is assumed that the effectiveness of the test is impacted proportional to the percentage of testing requested. Permissible values for this property range from 0 to 100. 
	 * This property may not be applicable to all tests. If it can be set for a test, the value 7 ("Supports PercentOf TestCoverage") should be entered into the DiagnosticTest's Characteristics array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent Of Test Coverage</em>' attribute.
	 * @see #setPercentOfTestCoverage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticResult_PercentOfTestCoverage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Deprecated='[\"CIM_DiagnosticSettingRecord.PercentOfTestCoverage\"]' Write='true' Units='Percent' MinValue='0' MaxValue='100' ModelCorrespondence='[\"CIM_DiagnosticTest.Characteristics\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getPercentOfTestCoverage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticResult#getPercentOfTestCoverage <em>Percent Of Test Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Of Test Coverage</em>' attribute.
	 * @see #getPercentOfTestCoverage()
	 * @generated
	 */
	void setPercentOfTestCoverage(Integer value);

} // CIM_DiagnosticResult

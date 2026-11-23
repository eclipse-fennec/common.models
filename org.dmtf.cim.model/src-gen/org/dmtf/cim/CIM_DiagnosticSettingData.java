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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Diagnostic Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specific diagnostic test parameters and execution instructions are defined by this class. To provide more detailed Settings for a type of test (i.e., additional properties), subclassing is appropriate.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingData#getHaltOnError <em>Halt On Error</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingData#getQuickMode <em>Quick Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingData#getPercentOfTestCoverage <em>Percent Of Test Coverage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingData#getLoopControlParameter <em>Loop Control Parameter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingData#getLoopControl <em>Loop Control</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingData#getOtherLoopControlDescriptions <em>Other Loop Control Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingData#getResultPersistence <em>Result Persistence</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingData#getLogOptions <em>Log Options</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingData#getOtherLogOptionsDescriptions <em>Other Log Options Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingData#getLogStorage <em>Log Storage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingData#getOtherLogStorageDescriptions <em>Other Log Storage Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingData#getVerbosityLevel <em>Verbosity Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingData#getQueryTimeout <em>Query Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingData#getNonDestructive <em>Non Destructive</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::System::Diagnostics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Halt On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this flag is true, the test will halt after finding the first error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Halt On Error</em>' attribute.
	 * @see #setHaltOnError(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingData_HaltOnError()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getHaltOnError();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSettingData#getHaltOnError <em>Halt On Error</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingData_QuickMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getQuickMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSettingData#getQuickMode <em>Quick Mode</em>}' attribute.
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent Of Test Coverage</em>' attribute.
	 * @see #setPercentOfTestCoverage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingData_PercentOfTestCoverage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Units='Percent' MinValue='0' MaxValue='100' ModelCorrespondence='[\"CIM_DiagnosticServiceCapabilities.SupportedServiceModes\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getPercentOfTestCoverage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSettingData#getPercentOfTestCoverage <em>Percent Of Test Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Of Test Coverage</em>' attribute.
	 * @see #getPercentOfTestCoverage()
	 * @generated
	 */
	void setPercentOfTestCoverage(Integer value);

	/**
	 * Returns the value of the '<em><b>Loop Control Parameter</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Array entries contain parameters corresponding to entries in the LoopControl array, limiting the number of times a test should be repeated with a single invocation of a test method by a CIM client.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Control Parameter</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingData_LoopControlParameter()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSettingData.LoopControl\"]'"
	 * @generated
	 */
	EList<String> getLoopControlParameter();

	/**
	 * Returns the value of the '<em><b>Loop Control</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LoopControl, used in conjunction with LoopControlParameter, sets one or more loop control mechanisms that limits the number of times a test should be repeated with a single invocation of a test method by a CIM client. There is an array-positional correspondence between LoopControl entries & LoopControlParameter entries. The entries in these coupled arrays of loop controls can be used in a logical OR fashion to achieve the desired loop control. For example, if a client wants to loop a test 1000 times, but quit if a timer runs out, it could set both controls into the LoopControl array as two separate entries in each array. The looping test will terminate when the first of the two Ored conditions are met. 
	 * The descriptions for each loop control are given below: 
	 * Unknown (0) 
	 * Other (1) : Additional detail may be found in OtherLoopControlDescriptions. 
	 * Continuous (2) : The corresponding LoopControl Parameter is ignored and the test will execute continuously. Tests that use this control should also support DiscontinueTest. 
	 * Count(3) : The corresponding LoopControlParameter is interpreted as a loop count (uint32), indicating the number of times the test should be repeated with a single invocation of a test method by a CIM client. 
	 * Timer (= 4) : The corresponding LoopControlParameter is interpreted as an initial value (uint32) for a test loop timer, given in seconds. The looping is terminated when this timer has lapsed. 
	 * ErrorCount (= 5) : The corresponding LoopControl Parameter is interpreted as an error count (uint32). The loop will continue until the number of errors that have occurred exceeds the ErrorCount. Note: the ErrorCount only refers to hard test errors; it does not include soft errors or warnings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Control</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingData_LoopControl()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Continuous\",\"Count\",\"Timer\",\"ErrorCount\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSettingData.LoopControlParameter\",\"CIM_DiagnosticSettingData.OtherLoopControlDescriptions\",\"CIM_DiagnosticServiceCapabilities.SupportedLoopControl\"]'"
	 * @generated
	 */
	EList<Integer> getLoopControl();

	/**
	 * Returns the value of the '<em><b>Other Loop Control Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property provides additional information for LoopControl when the corresponding value is set to 1 ('Other').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Loop Control Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingData_OtherLoopControlDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSettingData.LoopControlParameter\",\"CIM_DiagnosticSettingData.LoopControl\"]'"
	 * @generated
	 */
	EList<String> getOtherLoopControlDescriptions();

	/**
	 * Returns the value of the '<em><b>Result Persistence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResultPersistence property is a directive from a diagnostic client to a diagnostic provider. It allows the client to specify to the diagnostic service provider how long to persist the messages that result from execution of a diagnostic service. This applies to instances of DiagnosticResult as well as the preferred use of DiagnosticServiceRecord. The timeout period starts upon completion of the diagnostic action described by the DiagnosticService. 
	 * 
	 * Here is a summary of the choices and behaviors for different ResultPersistence values: 
	 * 0 = "No Persistence": 
	 * Setting the timer to zero tells the provider not to persist the diagnostic result. The diagnostic information is only available while the diagnostic is executing or at its conclusion. 
	 * Value > 0 and < 0xFFFFFFFF = "Persist With TimeOut": 
	 * Setting the ResultPersistenceOption to a integer will cause the DiagnosticResult to be persisted for that number of seconds. At the end of that time, the DiagnosticResult may be deleted by the diagnostic service provider. 
	 * 0xFFFFFFFF = "Persist Forever": 
	 * By setting the timeout value to the very large value, 0xFFFFFFFF, the provider shall persist results forever. In this case, the client MUST bear the responsibility for deleting them.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Persistence</em>' attribute.
	 * @see #setResultPersistence(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingData_ResultPersistence()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getResultPersistence();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSettingData#getResultPersistence <em>Result Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Persistence</em>' attribute.
	 * @see #getResultPersistence()
	 * @generated
	 */
	void setResultPersistence(Long value);

	/**
	 * Returns the value of the '<em><b>Log Options</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The LogOptions property is used to specify the types of data that SHOULD be logged by the diagnostic service. Any number of values may be specified in the array. Note that the default behavior is for nothing to be logged. 
	 * The AMOUNT of data to be logged can be controlled for each value selected by specifying a VerbosityLevel value. Verbosity may not apply to all LogOptions values, in which case the default VerbosityLevel of "Standard" SHOULD be used. 
	 * The RecordForLog produced by running a service MUST be tagged with a RecordType that corresponds to one of these log option values. 
	 * Following is a brief description of the available log options: 
	 * * "Other" (value = 1): Details are given in the corresponding OtherLogOptionsDescriptions entry. 
	 * * "Results" (value = 2): Log the results obtained by running the service. This is the most common value for reporting the service results. 
	 * * "Subtests" (value= 3): Log a test summary report upon completion of each subtest and each loop iteration. The summary reports SHOULD state whether the individual subtest or iteration passed or failed and list relevant error codes and respective error counts. 
	 * * "Actions" (value = 4): Log corrective action and instructional messages to guide service personnel; for example, a prioritized list of actions to perform in order to isolate a failure or correct a problem. When ordering steps or prioritizing actions, a number should proceed the text; for example, 1) Do this first, 2) Do this next, etc. 
	 * * "Warnings" (value = 5): Log warning messages; for example, 'device will be taken off line', 'test is long-running' or 'available memory is low'. The VerbosityLevel value specified for the Warnings option is related to the severity of the warnings logged; for instance, one would specify a high level of verbosity to get all warnings logged, regardless of severity, and a low level of verbosity to have only the most severe warnings logged. 
	 * * "Status" (value = 6): Log status messages; for example, state information for the driver, device, or system. 
	 * * "Device Errors" (value = 7): Log errors related to the managed element being serviced. 
	 * * "Service Errors" (value = 8): Log errors related to the service itself rather than the element being serviced, such as 'Resource Allocaton Failure'. 
	 * * "Setting Data" (value=9): Log the property values of the DiagnosticSettingData object used to configure the service. 
	 * *"Statistics" (value = 10): Log statistical messages; for example, packets sent per second. 
	 * * "Hardware Configuration" (value = 11): Log messages that contain information about the hardware configuration as viewed by the service; for example, vendor, version, FRU identification, and location information. The format and contents of this property is element dependent. Examples are: SCSI ID, LPTx, PCI Slot Number, and Dimm#. 
	 * * "Software Configuration" (value = 12): Log messages that contain information about the software environment as viewed by the service; for example, the name and version of all the critical software elements controlling the device under test. Each configuration message SHOULD have the following common format: Element name; element type; manufacturer name; version; for example, 'Miniport driver; SCSI; Intel; Version 1.2'. 
	 * * "Reference" (value = 13): Log the keys of an CIM object of of interest; for example, the element under test, or a data file. 
	 * * "Debug" (value = 14): Log debug messages. These messages are vendor specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Options</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingData_LogOptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"0x8000\"]' Values='[\"Unknown\",\"Other\",\"Results\",\"Subtests\",\"Actions\",\"Warnings\",\"Status\",\"Device Errors\",\"Service Errors\",\"Setting Data\",\"Statistics\",\"Hardware Configuration\",\"Software Configuration\",\"References\",\"Debug\",\"No Log Options\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSettingData.OtherLogOptionsDescriptions\",\"CIM_DiagnosticServiceCapabilities.SupportedLogOptions\",\"CIM_DiagnosticServiceRecord.RecordType\",\"CIM_DiagnosticSettingData.VerbosityLevel\"]'"
	 * @generated
	 */
	EList<Integer> getLogOptions();

	/**
	 * Returns the value of the '<em><b>Other Log Options Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional information regarding the types of test messages that are logged when the property LogOptions includes the value 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Log Options Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingData_OtherLogOptionsDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_DiagnosticSettingData.LogOptions\"]'"
	 * @generated
	 */
	EList<String> getOtherLogOptionsDescriptions();

	/**
	 * Returns the value of the '<em><b>Log Storage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The LogStorage setting property indicates which types of supported storage should be used by the Diagnostic Service for logging of the data specified in LogOptions. 
	 * The values are: 
	 * "DiagnosticLog" (Value = 2): Use the DiagnosticLog and DiagnosticRecord classes. 
	 * "MessageLog" (Value = 3): Use the MessageLog class and its methods. 
	 * "File" (Value = 4): Write data to a file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Storage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingData_LogStorage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"DiagnosticLog\",\"MessageLog\",\"File\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSettingData.OtherLogStorageDescriptions\",\"CIM_DiagnosticServiceCapabilities.SupportedLogStorage\"]'"
	 * @generated
	 */
	EList<Integer> getLogStorage();

	/**
	 * Returns the value of the '<em><b>Other Log Storage Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property provides additional information for LogStorage when the corresponding value is set to 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Log Storage Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingData_OtherLogStorageDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSettingData.LogStorage\"]'"
	 * @generated
	 */
	EList<String> getOtherLogStorageDescriptions();

	/**
	 * Returns the value of the '<em><b>Verbosity Level</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A client may want to specify the desired volume or detail logged by a diagnostic service. This property is applied to a corresponding logging option, acting as a qualifier on its description. Three levels of verbosity are defined as follows: 
	 * * "Minimum" (value=2): Specified if the least amount of information is desired; for example, Pass or Fail. 
	 * * "Standard" (value=3): This is the standard level of messaging provided by the service. It is the form most likely to be used if no verbosity value is specified (default). 
	 * * "Full" (value=4): Specified when all information, regardless of size, is desired. 
	 * Note that VerbosityLevel is a subjective property and relates to the degree of detail, not an absolute metric. A client simply specifies its desired level of detail and the provider publishes its data in accordance with this desired level of detail. 
	 * Verbosity may not apply to all LogOptions values, in which case the default VerbosityLevel of "Standard" SHOULD be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verbosity Level</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingData_VerbosityLevel()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Minimum\",\"Standard\",\"Full\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSettingData.LogOptions\"]'"
	 * @generated
	 */
	EList<Integer> getVerbosityLevel();

	/**
	 * Returns the value of the '<em><b>Query Timeout</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time the Job should wait for a query response. before using a default response and continuing execution. A default response could result in a cancellation of the Job. The timeout value starts at the time the Job goes into the QueryPending state. 
	 * 0 = "Do not query": 
	 * Setting the timer to zero tells the provider not to query but use the default response. 
	 * Value > 0 and < 0xFFFFFFFF = "Query With TimeOut": 
	 * Setting the QueryTimeout to a integer will cause the Job to wait for that number of seconds. At the end of that time, the Job will use the default response and continue execution. 
	 * 0xFFFFFFFF = "Wait Forever": 
	 * By setting the timeout value to the very large value, 0xFFFFFFFF, the job shall wait forever for a response. In this case, the client MUST bear the responsibility for responding to the query.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Query Timeout</em>' attribute.
	 * @see #setQueryTimeout(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingData_QueryTimeout()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getQueryTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSettingData#getQueryTimeout <em>Query Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Timeout</em>' attribute.
	 * @see #getQueryTimeout()
	 * @generated
	 */
	void setQueryTimeout(Long value);

	/**
	 * Returns the value of the '<em><b>Non Destructive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The test should only run non-destructive tests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Non Destructive</em>' attribute.
	 * @see #setNonDestructive(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingData_NonDestructive()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getNonDestructive();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSettingData#getNonDestructive <em>Non Destructive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Destructive</em>' attribute.
	 * @see #getNonDestructive()
	 * @generated
	 */
	void setNonDestructive(Boolean value);

} // CIM_DiagnosticSettingData

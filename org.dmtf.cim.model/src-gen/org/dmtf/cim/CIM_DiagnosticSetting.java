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
 * A representation of the model object '<em><b>CIM Diagnostic Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DiagnosticSetting is being deprecated and replaced by an identical class that derives from CIM_SettingData. CIM_Setting is to be replaced by CIM_SettingData in future versions of CIM. 
 * Specific diagnostic test parameters and execution instructions are defined by this class. To provide more detailed Settings for a type of test (i.e., additional properties), subclassing is appropriate.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getTestWarningLevel <em>Test Warning Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getReportSoftErrors <em>Report Soft Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getReportStatusMessages <em>Report Status Messages</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getHaltOnError <em>Halt On Error</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getQuickMode <em>Quick Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getPercentOfTestCoverage <em>Percent Of Test Coverage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getLoopControlParameter <em>Loop Control Parameter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getLoopControl <em>Loop Control</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getOtherLoopControlDescription <em>Other Loop Control Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getOtherLoopControlDescriptions <em>Other Loop Control Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getResultPersistence <em>Result Persistence</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getLogOptions <em>Log Options</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getOtherLogOptionsDescriptions <em>Other Log Options Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getLogStorage <em>Log Storage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getOtherLogStorageDescriptions <em>Other Log Storage Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getVerbosityLevel <em>Verbosity Level</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSetting#getLocales <em>Locales</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_DiagnosticSettingData\"]' Version='2.11.0' UMLPackagePath='CIM::System::Diagnostics' override.SettingID='string' override.SettingID.Deprecated='[\"CIM_SettingData.InstanceID\"]' override.SettingID.Key='true' override.SettingID.Description='In order to ensure uniqueness within the NameSpace, the value of SettingID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the SettingID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in SettingID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant SettingID is not re-used across any SettingIDs produced by this or other providers for this instance\'s NameSpace. \nA preferred value for &lt;LocalID&gt; is a timestamp (CIM DateTime). For example, ACME:19980525133015.0000000-300.' override.SettingID.MaxLen='256' keys='SettingID'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticSetting extends CIM_Setting {
	/**
	 * Returns the value of the '<em><b>Test Warning Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is being deprecated because the TestWarningLevel and LogOptions properties serve the same purpose. It is deprecated in lieu of using the LogOptions ('Warnings') property in conjunction with VerbosityLevel to specify this information. The 'Missing Resources' and 'Testing Impacts' values are not included directly in LogOptions, but they are expected to be recorded in the resulting DiagnosticServiceRecord object. 
	 * 
	 * Sets the level of warning messages to be logged. 
	 * If for example no warning information is required, the level would be set to "No Warnings" (value=0). Using "Missing Resources" (value=1) will cause warnings to be generated when required resources or hardware are not found. Setting the value to 2, "Testing Impacts", results in both missing resources and 'test impact' warnings (for example, multiple retries required) to be reported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Test Warning Level</em>' attribute.
	 * @see #setTestWarningLevel(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_TestWarningLevel()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_DiagnosticSetting.LogOptions\",\"CIM_DiagnosticSetting.VerbosityLevel\"]' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"No Warnings\",\"Missing Resources\",\"Testing Impacts\",\"All Warnings\"]'"
	 * @generated
	 */
	Integer getTestWarningLevel();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSetting#getTestWarningLevel <em>Test Warning Level</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_ReportSoftErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_DiagnosticSetting.LogOptions\"]' Write='true'"
	 * @generated
	 */
	Boolean getReportSoftErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSetting#getReportSoftErrors <em>Report Soft Errors</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_ReportStatusMessages()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_DiagnosticSetting.LogOptions\"]' Write='true'"
	 * @generated
	 */
	Boolean getReportStatusMessages();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSetting#getReportStatusMessages <em>Report Status Messages</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_HaltOnError()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_DiagnosticSettingData.HaltOnError\"]' Write='true'"
	 * @generated
	 */
	Boolean getHaltOnError();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSetting#getHaltOnError <em>Halt On Error</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_QuickMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_DiagnosticSettingData.QuickMode\"]' Write='true'"
	 * @generated
	 */
	Boolean getQuickMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSetting#getQuickMode <em>Quick Mode</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_PercentOfTestCoverage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Deprecated='[\"CIM_DiagnosticSettingData.PercentOfTestCoverage\"]' Write='true' Units='Percent' MinValue='0' MaxValue='100' ModelCorrespondence='[\"CIM_DiagnosticServiceCapabilities.SupportedServiceModes\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getPercentOfTestCoverage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSetting#getPercentOfTestCoverage <em>Percent Of Test Coverage</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_LoopControlParameter()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_DiagnosticSettingData.LoopControlParameter\"]' Write='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSetting.LoopControl\"]'"
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
	 * Unknown (= 0) 
	 * Other (= 1) : Additional detail may be found in OtherLoopControlDescriptions. 
	 * Continuous (= 2) : The corresponding LoopControl Parameter is ignored and the test will execute continuously. Tests that use this control should also support DiscontinueTest. 
	 * Count(=3) : The corresponding LoopControlParameter is interpreted as a loop count (uint32), indicating the number of times the test should be repeated with a single invocation of a test method by a CIM client. 
	 * Timer (= 4) : The corresponding LoopControlParameter is interpreted as an initial value (uint32) for a test loop timer, given in seconds. The looping is terminated when this timer has lapsed. 
	 * ErrorCount (= 5) : The corresponding LoopControl Parameter is interpreted as an error count (uint32). The loop will continue until the number of errors that have occurred exceeds the ErrorCount. Note: the ErrorCount only refers to hard test errors; it does not include soft errors or warnings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Control</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_LoopControl()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_DiagnosticSettingData.LoopControl\"]' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Continuous\",\"Count\",\"Timer\",\"ErrorCount\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSetting.LoopControlParameter\",\"CIM_DiagnosticSetting.OtherLoopControlDescriptions\",\"CIM_DiagnosticServiceCapabilities.SupportedLoopControl\"]'"
	 * @generated
	 */
	EList<Integer> getLoopControl();

	/**
	 * Returns the value of the '<em><b>Other Loop Control Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is deprecated and replaced with an array. 
	 * It provides additional information for LoopControl when its value is set to 1 ('Other').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Loop Control Description</em>' attribute.
	 * @see #setOtherLoopControlDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_OtherLoopControlDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_DiagnosticSetting.OtherLoopControlDescriptions\"]' Write='true' ModelCorrespondence='[\"CIM_DiagnosticSetting.LoopControlParameter\"]'"
	 * @generated
	 */
	String getOtherLoopControlDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSetting#getOtherLoopControlDescription <em>Other Loop Control Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Loop Control Description</em>' attribute.
	 * @see #getOtherLoopControlDescription()
	 * @generated
	 */
	void setOtherLoopControlDescription(String value);

	/**
	 * Returns the value of the '<em><b>Other Loop Control Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property provides additional information for LoopControl when the corresponding value is set to 1 ('Other').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Loop Control Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_OtherLoopControlDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_DiagnosticSettingData.OtherLoopControlDescriptions\"]' Write='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSetting.LoopControlParameter\",\"CIM_DiagnosticSetting.LoopControl\"]'"
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_ResultPersistence()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_DiagnosticSettingData.ResultPersistence\"]' Write='true' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getResultPersistence();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSetting#getResultPersistence <em>Result Persistence</em>}' attribute.
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
	 * * "Subtests" (value = 3): Log a test summary report upon completion of each subtest and each loop iteration. The summary reports SHOULD state whether the individual subtest or iteration passed or failed and list relevant error codes and respective error counts. 
	 * * "Actions" (value = 4): Log corrective action and instructional messages to guide service personnel; for example, a prioritized list of actions to perform in order to isolate a failure or correct a problem. When ordering steps or prioritizing actions, a number should proceed the text; for example, 1) Do this first, 2) Do this next, etc. 
	 * * "Warnings" (value = 5): Log warning messages; for example, 'device will be taken off line', 'test is long-running' or 'available memory is low'. The VerbosityLevel value specified for the Warnings option is related to the severity of the warnings logged; for instance, one would specify a high level of verbosity to get all warnings logged, regardless of severity, and a low level of verbosity to have only the most severe warnings logged. 
	 * * "Status" (value = 6): Log status messages; for example, state information for the driver, device, or system. 
	 * * "Device Errors" (value = 7): Log errors related to the managed element being serviced. 
	 * * "Service Errors" (value = 8): Log errors related to the service itself rather than the element being serviced, such as 'Resource Allocaton Failure'. 
	 * * "Setting Data" (value=9): Log the property values of the DiagnosticSetting object used to configure the service. 
	 * * "Statistics" (value = 10): Log statistical messages; for example, packets sent per second. 
	 * * "Hardware Configuration" (value = 11): Log messages that contain information about the hardware configuration as viewed by the service; for example, vendor, version, FRU identification, and location information. The format and contents of this property is element dependent. Examples are: SCSI ID, LPTx, PCI Slot Number, and Dimm#. 
	 * * "Software Configuration" (value = 12): Log messages that contain information about the software environment as viewed by the service; for example, the name and version of all the critical software elements controlling the device under test. Each configuration message SHOULD have the following common format: Element name; element type; manufacturer name; version; for example, 'Miniport driver; SCSI; Intel; Version 1.2'. 
	 * * "Reference" (value = 13): Log the keys of an CIM object of of interest; for example, the element under test, or a data file. 
	 * * "Debug" (value = 14): Log debug messages. These messages are vendor specific.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Options</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_LogOptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_DiagnosticSettingData.LogOptions\"]' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"0x8000\"]' Values='[\"Unknown\",\"Other\",\"Results\",\"Subtests\",\"Actions\",\"Warnings\",\"Status\",\"Device Errors\",\"Service Errors\",\"Setting Data\",\"Statistics\",\"Hardware Configuration\",\"Software Configuration\",\"References\",\"Debug\",\"No Log Options\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSetting.OtherLogOptionsDescriptions\",\"CIM_DiagnosticServiceCapabilities.SupportedLogOptions\",\"CIM_DiagnosticServiceRecord.RecordType\",\"CIM_DiagnosticSetting.VerbosityLevel\"]'"
	 * @generated
	 */
	EList<Integer> getLogOptions();

	/**
	 * Returns the value of the '<em><b>Other Log Options Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional information regarding the types of test messages that are logged when the property LogOptions includes the value 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Log Options Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_OtherLogOptionsDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_DiagnosticSettingData.OtherLogOptionsDescriptions\"]' Write='true' ModelCorrespondence='[\"CIM_DiagnosticSetting.LogOptions\"]'"
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_LogStorage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_DiagnosticSettingData.LogStorage\"]' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"DiagnosticLog\",\"MessageLog\",\"File\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSetting.OtherLogStorageDescriptions\",\"CIM_DiagnosticServiceCapabilities.SupportedLogStorage\"]'"
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_OtherLogStorageDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_DiagnosticSettingData.OtherLogStorageDescriptions\"]' Write='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSetting.LogStorage\"]'"
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_VerbosityLevel()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_DiagnosticSettingData.VerbosityLevel\"]' Write='true' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Minimum\",\"Standard\",\"Full\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSetting.LogOptions\"]'"
	 * @generated
	 */
	EList<Integer> getVerbosityLevel();

	/**
	 * Returns the value of the '<em><b>Locales</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property, along with the locale information in LocalizationCapabilities and DiagnosticServiceRecord, meets the requirement to specify locale for results produced by a diagnostic service. A locale indicates a particular geographical, political, or cultural region. The Locales property of the DiagnosticSetting class is an array of strings whose entries specify a language to be used in the formulation of information requested by or delivered to a client as a result of running a diagnostic service. It is specified by the client as an input parameter to the RunDiagnostic method, by virtue of its inclusion in this Setting class which is a parameter of the method. A single Setting object may specify more than one Locale. In this case, information MUST be returned in each language specified. 
	 * 
	 * Each array entry consists of three sub-strings, separated by underscores: 
	 * - The first sub-string is the language code, as specified in ISO639. 
	 * - The second sub-string is the country code, as specified in ISO3166. 
	 * - The third sub-string is a variant, which is vendor specific. 
	 * For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and generally is limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. The language and country codes are required; the variant may be empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locales</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSetting_Locales()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]' Write='true' ModelCorrespondence='[\"CIM_LocalizationCapabilities.SupportedOutputLocales\"]'"
	 * @generated
	 */
	EList<String> getLocales();

} // CIM_DiagnosticSetting

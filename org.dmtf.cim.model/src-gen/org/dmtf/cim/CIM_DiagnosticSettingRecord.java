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
 * A representation of the model object '<em><b>CIM Diagnostic Setting Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is being deprecated as part of the change to have Diagnostic Settings derive from CIM_SettingData instead of CIM_Setting. The replacement class will have the settings as an embedded instance. 
 * A snapshot of the properties in the DiagnosticSetting instance that was used when the Diagnostic was run.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingRecord#getHaltOnError <em>Halt On Error</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingRecord#getQuickMode <em>Quick Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingRecord#getPercentOfTestCoverage <em>Percent Of Test Coverage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingRecord#getLoopControlParameter <em>Loop Control Parameter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingRecord#getLoopControl <em>Loop Control</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingRecord#getOtherLoopControlDescriptions <em>Other Loop Control Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingRecord#getResultPersistence <em>Result Persistence</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingRecord#getLogOptions <em>Log Options</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingRecord#getOtherLogOptionsDescriptions <em>Other Log Options Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticSettingRecord#getVerbosityLevel <em>Verbosity Level</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingRecord()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_DiagnosticSettingDataRecord\"]' Version='2.11.0' UMLPackagePath='CIM::System::Diagnostics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticSettingRecord extends CIM_DiagnosticRecord {
	/**
	 * Returns the value of the '<em><b>Halt On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this flag is true, the test will halt after finding the first error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Halt On Error</em>' attribute.
	 * @see #setHaltOnError(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingRecord_HaltOnError()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_DiagnosticSettingDataRecord.Settings\"]'"
	 * @generated
	 */
	Boolean getHaltOnError();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSettingRecord#getHaltOnError <em>Halt On Error</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingRecord_QuickMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_DiagnosticSettingDataRecord.Settings\"]'"
	 * @generated
	 */
	Boolean getQuickMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSettingRecord#getQuickMode <em>Quick Mode</em>}' attribute.
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
	 * The requested percentage of coverage for the diagnostic service. For example, a hard drive scan test could be asked to run at 50%. Permissible values for this property range from 0 to 100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent Of Test Coverage</em>' attribute.
	 * @see #setPercentOfTestCoverage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingRecord_PercentOfTestCoverage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Deprecated='[\"CIM_DiagnosticSettingDataRecord.Settings\"]' Units='Percent' MinValue='0' MaxValue='100' PUnit='percent'"
	 * @generated
	 */
	Integer getPercentOfTestCoverage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSettingRecord#getPercentOfTestCoverage <em>Percent Of Test Coverage</em>}' attribute.
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
	 * Array entries contain parameters corresponding to entries in the LoopControl array, limiting the number of times a test should be repeated with a single invocation of RunTest by a CIM client.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Control Parameter</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingRecord_LoopControlParameter()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_DiagnosticSettingDataRecord.Settings\"]' ArrayType='Indexed'"
	 * @generated
	 */
	EList<String> getLoopControlParameter();

	/**
	 * Returns the value of the '<em><b>Loop Control</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LoopControl, used in conjunction with LoopControlParameter, sets one or more loop control mechanisms that limits the number of times a test should be repeated with a single invocation of RunTest by a CIM client. There is an array-positional correspondence between LoopControl entries & LoopControlParameter entries. The entries in these coupled arrays of loop controls can be used in a logical OR fashion to achieve the desired loop control. For example, if a client wants to loop a test 1000 times, but quit if a timer runs out, it could set both controls into the LoopControl array as two separate entries in each array. The looping test will terminate when the first of the two Ored conditions are met. 
	 * A brief description for each loop control can be found in the description of DiagnosticSetting.LoopControl.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop Control</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingRecord_LoopControl()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_DiagnosticSettingDataRecord.Settings\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Continuous\",\"Count\",\"Timer\",\"Error Count\"]' ArrayType='Indexed'"
	 * @generated
	 */
	EList<Integer> getLoopControl();

	/**
	 * Returns the value of the '<em><b>Other Loop Control Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional information for LoopControl when its value is set to 1 ('Other').
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Loop Control Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingRecord_OtherLoopControlDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_DiagnosticSettingDataRecord.Settings\"]' ArrayType='Indexed'"
	 * @generated
	 */
	EList<String> getOtherLoopControlDescriptions();

	/**
	 * Returns the value of the '<em><b>Result Persistence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The desired length of time to persist the messages that result from execution of a diagnostic service. Here is a summary of the choices and behaviors for different ResultPersistence values: 
	 * 0 = "No Persistence": 
	 * Setting the timer to zero tells the provider not to persist the diagnostic result. The diagnostic information is only available while the diagnostic is executing or at its conclusion. 
	 * Value > 0 and < 0xFFFFFFFF = "Persist With TimeOut": 
	 * Setting the ResultPersistenceOption to a integer will cause the DiagnosticResult to be persisted for that number of seconds. At the end of that time, the DiagnosticResult may be deleted by the diagnostic service provider. 
	 * 0xFFFFFFFF = "Persist Forever": 
	 * By setting the timeout value to the very large value, 0xFFFFFFFF, the provider shall persist results forever. In this case, the client MUST bear the responsibility for deleting them.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Persistence</em>' attribute.
	 * @see #setResultPersistence(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingRecord_ResultPersistence()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_DiagnosticSettingDataRecord.Settings\"]' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getResultPersistence();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticSettingRecord#getResultPersistence <em>Result Persistence</em>}' attribute.
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
	 * The LogOptions property lists the log options that were requested for the Diagnostic Service. A brief summary of the various log options can be found in CIM_DiagnosticSetting.LogOptions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Options</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingRecord_LogOptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_DiagnosticSettingDataRecord.Settings\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"0x8000\"]' Values='[\"Unknown\",\"Other\",\"Results\",\"Subtests\",\"Actions\",\"Warnings\",\"Status\",\"Device Errors\",\"Service Errors\",\"Setting Data\",\"Statistics\",\"Hardware Configuration\",\"Software Configuration\",\"References\",\"Debug\",\"No Log Options\"]' ArrayType='Indexed'"
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
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingRecord_OtherLogOptionsDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_DiagnosticSettingDataRecord.Settings\"]'"
	 * @generated
	 */
	EList<String> getOtherLogOptionsDescriptions();

	/**
	 * Returns the value of the '<em><b>Verbosity Level</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A client may want to specify the volume or detail of information logged by a diagnostic service. This metric is applied to a corresponding logging option, acting as a qualifier on its description. Three levels of verbosity are defined as follows: 
	 * * "Minimum" (value=2): Specified if the least amount of information is desired; for example, Pass or Fail. 
	 * * "Standard" (value=3): This is the standard level of messaging provided by the service. It is the form most likely to be used if no verbosity value is specified (default). 
	 * * "Full" (value=4): Specified when all information, regardless of size, is desired. 
	 * Verbosity may not apply to all LogOptions values, in which case the default VerbosityLevel of "Standard" SHOULD be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verbosity Level</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticSettingRecord_VerbosityLevel()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_DiagnosticSettingDataRecord.Settings\"]' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Minimum\",\"Standard\",\"Full\"]' ArrayType='Indexed'"
	 * @generated
	 */
	EList<Integer> getVerbosityLevel();

} // CIM_DiagnosticSettingRecord

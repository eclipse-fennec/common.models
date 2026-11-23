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
 * A representation of the model object '<em><b>CIM Diagnostic Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DiagnosticServiceCapabilities is a class that describes the capabilities of the diagnostic service. This provides the means for the diagnostic service to describe its abilities, limitations, and/or potential for use of various diagnostic service parameters. For example, what types of settings the diagnostic service supports.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticServiceCapabilities#getSupportedServiceModes <em>Supported Service Modes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticServiceCapabilities#getOtherSupportedServiceModesDescriptions <em>Other Supported Service Modes Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticServiceCapabilities#getSupportedLoopControl <em>Supported Loop Control</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticServiceCapabilities#getOtherSupportedLoopControlDescriptions <em>Other Supported Loop Control Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticServiceCapabilities#getSupportedLogOptions <em>Supported Log Options</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticServiceCapabilities#getOtherSupportedLogOptionsDescriptions <em>Other Supported Log Options Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticServiceCapabilities#getSupportedLogStorage <em>Supported Log Storage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticServiceCapabilities#getOtherSupportedLogStorageDescriptions <em>Other Supported Log Storage Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticServiceCapabilities#getSupportedExecutionControls <em>Supported Execution Controls</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticServiceCapabilities#getOtherSupportedExecutionControlsDescriptions <em>Other Supported Execution Controls Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiagnosticServiceCapabilities#getSupportedTestWarnings <em>Supported Test Warnings</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.13.0' UMLPackagePath='CIM::System::Diagnostics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DiagnosticServiceCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Service Modes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SupportedServiceModes property lists the operational modes that are supported by the Diagnostic Service. These modes may correspond to, but are not limited to, settings that may be applied to a Diagnostic Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Service Modes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticServiceCapabilities_SupportedServiceModes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"0x8000\"]' Values='[\"Unknown\",\"Other\",\"PercentOfTestCoverage\",\"QuickMode\",\"HaltOnError\",\"ResultPersistence\",\"QueryTimeout\",\"NonDestructive\",\"No Service Modes\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticServiceCapabilities.OtherSupportedServiceModesDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedServiceModes();

	/**
	 * Returns the value of the '<em><b>Other Supported Service Modes Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional information for SupportedServiceModes when the corresponding value is set to 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Service Modes Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticServiceCapabilities_OtherSupportedServiceModesDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticServiceCapabilities.SupportedServiceModes\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedServiceModesDescriptions();

	/**
	 * Returns the value of the '<em><b>Supported Loop Control</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SupportedLoopControl property lists the loop controls that are supported by the Diagnostic Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Loop Control</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticServiceCapabilities_SupportedLoopControl()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"0x8000\"]' Values='[\"Unknown\",\"Other\",\"Continuous\",\"Count\",\"Timer\",\"ErrorCount\",\"No Loop Control\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSettingData.LoopControl\",\"CIM_DiagnosticServiceCapabilities.OtherSupportedLoopControlDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedLoopControl();

	/**
	 * Returns the value of the '<em><b>Other Supported Loop Control Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional information for SupportedLoopControl when the corresponding value is set to 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Loop Control Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticServiceCapabilities_OtherSupportedLoopControlDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticServiceCapabilities.SupportedLoopControl\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedLoopControlDescriptions();

	/**
	 * Returns the value of the '<em><b>Supported Log Options</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SupportedLogOptions property lists the log options that are supported by the Diagnostic Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Log Options</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticServiceCapabilities_SupportedLogOptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"0x8000\"]' Values='[\"Unknown\",\"Other\",\"Results\",\"Subtests\",\"Actions\",\"Warnings\",\"Status\",\"Device Errors\",\"Service Errors\",\"Setting Data\",\"Statistics\",\"Hardware Configuration\",\"Software Configuration\",\"References\",\"Debug\",\"No Log Options\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticSettingData.LogOptions\",\"CIM_DiagnosticServiceCapabilities.OtherSupportedLogOptionsDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedLogOptions();

	/**
	 * Returns the value of the '<em><b>Other Supported Log Options Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional information for SupportedLogOptions when the corresponding value is set to 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Log Options Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticServiceCapabilities_OtherSupportedLogOptionsDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticServiceCapabilities.SupportedLogOptions\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedLogOptionsDescriptions();

	/**
	 * Returns the value of the '<em><b>Supported Log Storage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SupportedLogStorage property lists the storage options for logging that are supported by the Diagnostic Service. 
	 * The values are: 
	 * "DiagnosticLog" (Value = 2): Supports use of the DiagnosticLog class for aggregating DiagnosticRecords. 
	 * "MessageLog" (Value = 3): Supports writing log information using the methods in the MessageLog class. 
	 * "File" (Value = 4): Supports writing log information to a file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Log Storage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticServiceCapabilities_SupportedLogStorage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"0x8000\"]' Values='[\"Unknown\",\"Other\",\"DiagnosticLog\",\"MessageLog\",\"File\",\"No Log Storage\"]' ModelCorrespondence='[\"CIM_DiagnosticServiceCapabilities.OtherSupportedLogStorageDescriptions\",\"CIM_DiagnosticSettingData.LogStorage\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedLogStorage();

	/**
	 * Returns the value of the '<em><b>Other Supported Log Storage Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional information for SupportedLogStorage when the corresponding value is set to 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Log Storage Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticServiceCapabilities_OtherSupportedLogStorageDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticServiceCapabilities.SupportedLogStorage\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedLogStorageDescriptions();

	/**
	 * Returns the value of the '<em><b>Supported Execution Controls</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SupportedExecutionControls property lists the job controls that are supported by the Diagnostic Service. The values are: 
	 * (Value = 2) is deprecated. Previous versions defined this as "Job Creation" and was intended to indicate that a ConcreteJob instance will be created to control the diagnostic job launched by the diagnostic service. Since Job creation is REQUIRED, this attribute value is unnecessary and confusing. 
	 * "Kill Job" (Value = 3): publishes that the diagnostic service implements the ConcreteJob.RequestStateChange(Kill) method. 
	 * "Suspend Job" (Value = 4): publishes that the diagnostic service implements the ConcreteJob.RequestStateChange(Suspend) method. 
	 * "Terminate Job" (Value = 5): publishes that the diagnostic service implements the ConcreteJob.RequestStateChange(Terminate) method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Execution Controls</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticServiceCapabilities_SupportedExecutionControls()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"0x8000\"]' Values='[\"Unknown\",\"Other\",\"Reserved\",\"Kill Job\",\"Suspend Job\",\"Terminate Job\",\"No Execution Controls\"]' ModelCorrespondence='[\"CIM_DiagnosticServiceCapabilities.OtherSupportedExecutionControlsDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedExecutionControls();

	/**
	 * Returns the value of the '<em><b>Other Supported Execution Controls Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides additional information for SupportedExecutionControls when the corresponding value is set ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported Execution Controls Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticServiceCapabilities_OtherSupportedExecutionControlsDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticServiceCapabilities.SupportedExecutionControls\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedExecutionControlsDescriptions();

	/**
	 * Returns the value of the '<em><b>Supported Test Warnings</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is being deprecated because the TestWarningLevel and LogOptions properties serve the same purpose. 
	 * Lists the level of warning messages that MAY be logged. If for example no warning information is required, the level would be set to "No Warnings" (value=0). Using "Missing Resources" (value=1) will cause warnings to be generated when required resources or hardware are not found. Setting the value to 2, "Testing Impacts", results in both missing resources and 'test impact' warnings (for example, multiple retries required) to be reported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Test Warnings</em>' attribute.
	 * @see #setSupportedTestWarnings(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiagnosticServiceCapabilities_SupportedTestWarnings()
	 * @model default="3"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_DiagnosticServiceCapabilities.SupportedLogOptions\"]' ValueMap='[\"2\",\"3\",\"4\",\"5\"]' Values='[\"No Warnings\",\"Missing Resources\",\"Testing Impacts\",\"All Warnings\"]'"
	 * @generated
	 */
	Integer getSupportedTestWarnings();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiagnosticServiceCapabilities#getSupportedTestWarnings <em>Supported Test Warnings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Test Warnings</em>' attribute.
	 * @see #getSupportedTestWarnings()
	 * @generated
	 */
	void setSupportedTestWarnings(Integer value);

} // CIM_DiagnosticServiceCapabilities

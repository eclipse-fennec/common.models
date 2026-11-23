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
 * A representation of the model object '<em><b>CIM Job Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * JobSettingData represents job characteristics and scheduling information for a CIM_Job. The settings may be applied to a job handling Service, a JobQueue or other destination to which jobs are submitted, and/or to individual CIM_Jobs. The applicability of the settings are defined using the ElementSettingData relationship. Since the Settings may be defined in several contexts and applied to many types of elements, this class is defined as a subclass of SettingData, versus ScopedSettingData.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_JobSettingData#getDeleteOnCompletion <em>Delete On Completion</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobSettingData#getRecoveryAction <em>Recovery Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobSettingData#getOtherRecoveryAction <em>Other Recovery Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobSettingData#getApplicableMethod <em>Applicable Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobSettingData#getClientRetries <em>Client Retries</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobSettingData#getDefaultInputNames <em>Default Input Names</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobSettingData#getDefaultInputValues <em>Default Input Values</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobSettingData#getInteractiveTimeout <em>Interactive Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobSettingData#getRunInSilentMode <em>Run In Silent Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobSettingData#getTerminateOnTimeout <em>Terminate On Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobSettingData#getTimeBeforeRemoval <em>Time Before Removal</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_JobSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::Processing' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_JobSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Delete On Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not the Job should be automatically deleted upon completion. Note that the 'completion' of a recurring job is defined by its JobRunTimes or UntilTime properties, OR when the Job is terminated by manual intervention.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delete On Completion</em>' attribute.
	 * @see #setDeleteOnCompletion(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobSettingData_DeleteOnCompletion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' ModelCorrespondence='[\"CIM_Job.DeleteOnCompletion\"]'"
	 * @generated
	 */
	Boolean getDeleteOnCompletion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobSettingData#getDeleteOnCompletion <em>Delete On Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete On Completion</em>' attribute.
	 * @see #getDeleteOnCompletion()
	 * @generated
	 */
	void setDeleteOnCompletion(Boolean value);

	/**
	 * Returns the value of the '<em><b>Recovery Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the recovery setting if the Job does not successfully complete. The possible values are: 
	 * 0 = "Unknown", meaning it is unknown as to what recovery action to take 
	 * 1 = "Other", indicating that the recovery action will be specified in the property, OtherRecoveryAction 
	 * 2 = "Do Not Continue", meaning stop the execution of the job and appropriately update its status 
	 * 3 = "Continue With Next Job", meaning continue with the next job in the queue 
	 * 4 = "Re-run Job", indicating that the job should be re-run 
	 * 5 = "Run Recovery Job", meaning run the Job associated using the RecoveryJob relationship. Note that the recovery Job MUST already be on the queue from which it will run.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recovery Action</em>' attribute.
	 * @see #setRecoveryAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobSettingData_RecoveryAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Do Not Continue\",\"Continue With Next Job\",\"Re-run Job\",\"Run Recovery Job\"]' ModelCorrespondence='[\"CIM_JobSettingData.OtherRecoveryAction\",\"CIM_Job.RecoveryAction\"]'"
	 * @generated
	 */
	Integer getRecoveryAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobSettingData#getRecoveryAction <em>Recovery Action</em>}' attribute.
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
	 * A string describing the recovery action when the instance's RecoveryAction property is 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Recovery Action</em>' attribute.
	 * @see #setOtherRecoveryAction(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobSettingData_OtherRecoveryAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_JobSettingData.RecoveryAction\",\"CIM_Job.OtherRecoveryAction\"]'"
	 * @generated
	 */
	String getOtherRecoveryAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobSettingData#getOtherRecoveryAction <em>Other Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Recovery Action</em>' attribute.
	 * @see #getOtherRecoveryAction()
	 * @generated
	 */
	void setOtherRecoveryAction(String value);

	/**
	 * Returns the value of the '<em><b>Applicable Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies the method in CIM_Service associated to this SettingData to which the SettingData applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Method</em>' attribute.
	 * @see #setApplicableMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobSettingData_ApplicableMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getApplicableMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobSettingData#getApplicableMethod <em>Applicable Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable Method</em>' attribute.
	 * @see #getApplicableMethod()
	 * @generated
	 */
	void setApplicableMethod(String value);

	/**
	 * Returns the value of the '<em><b>Client Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A numeric value indicating the number of retries a client may make on ResumeWithInput (or ResumeWithAction) after a failed attempt at ResumeWithInput (or ResumeWithAction). Zero means that the client has no retries. For example, this would be set this to zero if the test will use default inputs if an initial attempt at ResumeWithInput fails.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Retries</em>' attribute.
	 * @see #setClientRetries(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobSettingData_ClientRetries()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_DiagnosticServiceJobCapabilities.ClientRetriesMax\"]'"
	 * @generated
	 */
	Long getClientRetries();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobSettingData#getClientRetries <em>Client Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Retries</em>' attribute.
	 * @see #getClientRetries()
	 * @generated
	 */
	void setClientRetries(Long value);

	/**
	 * Returns the value of the '<em><b>Default Input Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DefaultInputNames is an array of strings that define the names for the default inputs that will be requested from clients. The values in this array are the names of the values in the corresponding entry in the DefaultInputValues array.
	 * When a job requests input (such as with the DIAG34 standard message), the inputs being requested should be named using the names in the DefaultInputNames property.
	 * If this property is non-NULL then CIM_JobSettingData.InteractiveTimeout, CIM_JobSettingData.ClientRetries, CIM_DiagnosticServiceJobCapabilities.ClientRetriesMax should have a values and CIM_DiagnosticServiceJobCapabilities.DefaultValuesSupported should be TRUE. 
	 * Since the property would only apply to interactive jobs, CIM_DiagnosticTest.Characteristics should contain 3 (Is Interactive). If this property has values, then CIM_JobSettingData.RunInSilentMode and CIM_DiagnosticServiceJobCapabilities.SilentModeSupported may be TRUE.
	 * This property may be used when there is an interactive timeout on a CIM_ConcreteJob.ResumeWithInput method call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Input Names</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_JobSettingData_DefaultInputNames()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticServiceJobCapabilities.DefaultValuesSupported\",\"CIM_JobSettingData.DefaultInputValues\",\"CIM_JobSettingData.InteractiveTimeout\",\"CIM_JobSettingData.ClientRetries\",\"CIM_DiagnosticServiceJobCapabilities.ClientRetriesMax\",\"CIM_DiagnosticTest.Characteristics\",\"CIM_JobSettingData.RunInSilentMode\",\"CIM_DiagnosticServiceJobCapabilities.SilentModeSupported\"]'"
	 * @generated
	 */
	EList<String> getDefaultInputNames();

	/**
	 * Returns the value of the '<em><b>Default Input Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DefaultInputValues is an array of strings that define default values for inputs that will be requested from clients. Each array has a name as defined in the corresponding entry in the DefaultInputNames array.
	 * If this property is non-NULL then CIM_JobSettingData.InteractiveTimeout, CIM_JobSettingData.ClientRetries, CIM_DiagnosticServiceJobCapabilities.ClientRetriesMax should have a values and CIM_DiagnosticServiceJobCapabilities.DefaultValuesSupported should be TRUE. 
	 * Since the property would only apply to interactive jobs, CIM_DiagnosticTest.Characteristics should contain 3 (Is Interactive). If this property has values, then CIM_JobSettingData.RunInSilentMode and CIM_DiagnosticServiceJobCapabilities.SilentModeSupported may be TRUE.
	 * This property may be used when there is an interactive timeout on a CIM_ConcreteJob.ResumeWithInput method call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Input Values</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_JobSettingData_DefaultInputValues()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_DiagnosticServiceJobCapabilities.DefaultValuesSupported\",\"CIM_JobSettingData.DefaultInputNames\",\"CIM_JobSettingData.InteractiveTimeout\",\"CIM_JobSettingData.ClientRetries\",\"CIM_DiagnosticServiceJobCapabilities.ClientRetriesMax\",\"CIM_DiagnosticTest.Characteristics\",\"CIM_JobSettingData.RunInSilentMode\",\"CIM_DiagnosticServiceJobCapabilities.SilentModeSupported\"]'"
	 * @generated
	 */
	EList<String> getDefaultInputValues();

	/**
	 * Returns the value of the '<em><b>Interactive Timeout</b></em>' attribute.
	 * The default value is <code>"00000000001500.000000:000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A datetime specification of a time interval to wait for input from a client before it leaves the QueryPending CIM_ConcreteJob.JobState (in favor or either terminating or continuing with defaults). The default is 15 minutes (00000000001500.000000:000).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interactive Timeout</em>' attribute.
	 * @see #setInteractiveTimeout(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobSettingData_InteractiveTimeout()
	 * @model default="00000000001500.000000:000"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_DiagnosticServiceJobCapabilities.InteractiveTimeoutMax\"]'"
	 * @generated
	 */
	String getInteractiveTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobSettingData#getInteractiveTimeout <em>Interactive Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interactive Timeout</em>' attribute.
	 * @see #getInteractiveTimeout()
	 * @generated
	 */
	void setInteractiveTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Run In Silent Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If CIM_DiagnosticServiceJobCapabilities.SilentModeSupported is TRUE, then this property identifies whether the DiagnosticService runs without interaction with the client. It does if the value is set to TRUE. It does not if the value is set to FALSE.
	 * This shall be set to FALSE if CIM_DiagnosticServiceJobCapabilities.SilentModeSupported is FALSE.
	 * If this is set to TRUE, then CIM_JobSettingData.DefaultInputValues and CIM_JobSettingData.DefaultInputNames shall be non-empty arrays.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Run In Silent Mode</em>' attribute.
	 * @see #setRunInSilentMode(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobSettingData_RunInSilentMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_DiagnosticServiceJobCapabilities.SilentModeSupported\",\"CIM_JobSettingData.DefaultInputValues\",\"CIM_JobSettingData.DefaultInputNames\"]'"
	 * @generated
	 */
	Boolean getRunInSilentMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobSettingData#getRunInSilentMode <em>Run In Silent Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run In Silent Mode</em>' attribute.
	 * @see #getRunInSilentMode()
	 * @generated
	 */
	void setRunInSilentMode(Boolean value);

	/**
	 * Returns the value of the '<em><b>Terminate On Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TerminateOnTimeout is a boolean that defines the behavior when the InteractiveTimeout is exceeded. If this value is TRUE the job will terminate when the InteractiveTimeout is exceeded. If FALSE the job will use DefaultInputs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Terminate On Timeout</em>' attribute.
	 * @see #setTerminateOnTimeout(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobSettingData_TerminateOnTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_DiagnosticServiceJobCapabilities.DefaultValuesSupported\",\"CIM_JobSettingData.DefaultInputValues\",\"CIM_JobSettingData.DefaultInputNames\"]'"
	 * @generated
	 */
	Boolean getTerminateOnTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobSettingData#getTerminateOnTimeout <em>Terminate On Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminate On Timeout</em>' attribute.
	 * @see #getTerminateOnTimeout()
	 * @generated
	 */
	void setTerminateOnTimeout(Boolean value);

	/**
	 * Returns the value of the '<em><b>Time Before Removal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the TimeBeforeRemoval value to be applied to a ConcreteJob generated from the method identified in the ApplicableMethod property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Before Removal</em>' attribute.
	 * @see #setTimeBeforeRemoval(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobSettingData_TimeBeforeRemoval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_ConcreteJob.TimeBeforeRemoval\"]'"
	 * @generated
	 */
	String getTimeBeforeRemoval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobSettingData#getTimeBeforeRemoval <em>Time Before Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Before Removal</em>' attribute.
	 * @see #getTimeBeforeRemoval()
	 * @generated
	 */
	void setTimeBeforeRemoval(String value);

} // CIM_JobSettingData

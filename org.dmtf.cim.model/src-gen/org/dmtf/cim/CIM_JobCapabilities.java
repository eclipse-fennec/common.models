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
 * A representation of the model object '<em><b>CIM Job Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_JobCapabilities identifies the capabilities of a job created as a result of a Service method.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_JobCapabilities#getDeleteJobSupported <em>Delete Job Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobCapabilities#getRequestedStatesSupported <em>Requested States Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobCapabilities#getInteractiveTimeoutMax <em>Interactive Timeout Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobCapabilities#getDefaultValuesSupported <em>Default Values Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobCapabilities#getClientRetriesMax <em>Client Retries Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobCapabilities#getCleanupInterval <em>Cleanup Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobCapabilities#getSilentModeSupported <em>Silent Mode Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobCapabilities#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobCapabilities#getOtherCharacteristicsDescriptions <em>Other Characteristics Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobCapabilities#getApplicableMethods <em>Applicable Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobCapabilities#getTimeBeforeRemovalMin <em>Time Before Removal Min</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobCapabilities#getTimeBeforeRemovalMax <em>Time Before Removal Max</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_JobCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Core::Capabilities' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_JobCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Delete Job Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates whether the implementation supports a delete operation on CIM_Job. If the value is TRUE, CIM_Job.DeleteOnCompletion may be set to TRUE or FALSE. If the value is FALSE, CIM_Job.DeleteOnCompletion shall be TRUE. 
	 * 
	 * If DeleteJobSupported is FALSE and CIM_Job.DeleteOnCompletion is TRUE, the job should remain available for the ConcreteJob.TimeBeforeRemoval time interval.
	 * If DeleteJobSupported is TRUE and a DeleteInstance is never issued, the job may be deleted after the CleanupInterval time delay.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delete Job Supported</em>' attribute.
	 * @see #setDeleteJobSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobCapabilities_DeleteJobSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_Job.DeleteOnCompletion\",\"CIM_JobCapabilities.CleanupInterval\",\"CIM_ConcreteJob.TimeBeforeRemoval\"]'"
	 * @generated
	 */
	Boolean getDeleteJobSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobCapabilities#getDeleteJobSupported <em>Delete Job Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Job Supported</em>' attribute.
	 * @see #getDeleteJobSupported()
	 * @generated
	 */
	void setDeleteJobSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Requested States Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RequestedStatesSupported property indicates the possible states that can be requested when using the method RequestStateChange on the ConcreteJob.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested States Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_JobCapabilities_RequestedStatesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"32768..65535\"]' Values='[\"Start\",\"Suspend\",\"Terminate\",\"Kill\",\"Service\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_ConcreteJob.RequestStateChange\"]'"
	 * @generated
	 */
	EList<Integer> getRequestedStatesSupported();

	/**
	 * Returns the value of the '<em><b>Interactive Timeout Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the maximum value for CIM_JobSettingData.InteractiveTimeout.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interactive Timeout Max</em>' attribute.
	 * @see #setInteractiveTimeoutMax(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobCapabilities_InteractiveTimeoutMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_JobSettingData.InteractiveTimeout\"]'"
	 * @generated
	 */
	String getInteractiveTimeoutMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobCapabilities#getInteractiveTimeoutMax <em>Interactive Timeout Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interactive Timeout Max</em>' attribute.
	 * @see #getInteractiveTimeoutMax()
	 * @generated
	 */
	void setInteractiveTimeoutMax(String value);

	/**
	 * Returns the value of the '<em><b>Default Values Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates whether the implementation will supply default input values for an interactive job when a client fails to respond. If the value is TRUE, CIM_JobSettingData.DefaultInputValues and CIM_JobSettingData.DefaultInputNames shall have values.
	 * This property should be FALSE if CIM_JobCapabilities.Characteristics does not contain 3 (Is Interactive).
	 * If this property is TRUE, then CIM_JobSettingData.InteractiveTimeout and CIM_JobSettingData.ClientRetries should have values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Values Supported</em>' attribute.
	 * @see #setDefaultValuesSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobCapabilities_DefaultValuesSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_JobSettingData.DefaultInputValues\",\"CIM_JobSettingData.DefaultInputNames\",\"CIM_JobSettingData.InteractiveTimeout\",\"CIM_JobSettingData.ClientRetries\",\"CIM_JobCapabilities.Characteristics\"]'"
	 * @generated
	 */
	Boolean getDefaultValuesSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobCapabilities#getDefaultValuesSupported <em>Default Values Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Values Supported</em>' attribute.
	 * @see #getDefaultValuesSupported()
	 * @generated
	 */
	void setDefaultValuesSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Client Retries Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the maximum value of CIM_JobSettingData.ClientRetries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Retries Max</em>' attribute.
	 * @see #setClientRetriesMax(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobCapabilities_ClientRetriesMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ModelCorrespondence='[\"CIM_JobSettingData.ClientRetries\"]'"
	 * @generated
	 */
	Long getClientRetriesMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobCapabilities#getClientRetriesMax <em>Client Retries Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Retries Max</em>' attribute.
	 * @see #getClientRetriesMax()
	 * @generated
	 */
	void setClientRetriesMax(Long value);

	/**
	 * Returns the value of the '<em><b>Cleanup Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the time interval an implementation shall wait before removing a job when the value of CIM_Job.DeleteOnCompletion is FALSE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cleanup Interval</em>' attribute.
	 * @see #setCleanupInterval(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobCapabilities_CleanupInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' ModelCorrespondence='[\"CIM_Job.DeleteOnCompletion\"]'"
	 * @generated
	 */
	String getCleanupInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobCapabilities#getCleanupInterval <em>Cleanup Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleanup Interval</em>' attribute.
	 * @see #getCleanupInterval()
	 * @generated
	 */
	void setCleanupInterval(String value);

	/**
	 * Returns the value of the '<em><b>Silent Mode Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If an interactive job will support running in "silent mode", then this shall be set to TRUE. If the job
	 * cannot support "silent mode", then this shall be set to FALSE. If the job is not interactive, then this should be NULL or set to TRUE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Silent Mode Supported</em>' attribute.
	 * @see #setSilentModeSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobCapabilities_SilentModeSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_JobSettingData.RunInSilentMode\"]'"
	 * @generated
	 */
	Boolean getSilentModeSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobCapabilities#getSilentModeSupported <em>Silent Mode Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Silent Mode Supported</em>' attribute.
	 * @see #getSilentModeSupported()
	 * @generated
	 */
	void setSilentModeSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Characteristics</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This specifies the characteristics that are supported by the job. The possible values are 0 (none), 1 (Other), 2 (Is Exclusive) or 3 (Is Interactive).
	 * * "none" (value=0) is specified if no special characteristics apply. No other value should be specified if 0 is specified.
	 * * "Other" (value=1) is specified if the job supports vendor specific characteristics. If this is specified, then OtherCharacteristicsDescriptions shall also be specified.
	 * * "Is Exclusive" (value=2) is specified for the job only if the method cannot run more than one at a time on the affected job element. Typically, this occurs when hardware or software constrains prevent the method from running as multiple, concurrent instances.
	 * * If "Is Interactive" (value=3) is set, then the method issues a message during the method execution requesting input or actions from the client application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Characteristics</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_JobCapabilities_Characteristics()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"none\",\"other\",\"Is Exclusive\",\"Is Interactive\"]'"
	 * @generated
	 */
	EList<String> getCharacteristics();

	/**
	 * Returns the value of the '<em><b>Other Characteristics Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This array of strings is for identifying vendor specific characteristics. This shall be identified if the Characteristics property contains 1 (Other).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Characteristics Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_JobCapabilities_OtherCharacteristicsDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_JobCapabilities.Characteristics\"]'"
	 * @generated
	 */
	EList<String> getOtherCharacteristicsDescriptions();

	/**
	 * Returns the value of the '<em><b>Applicable Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This string array contains the method names of the methods to which these capabilities apply. The methods must be contained in a CIM_Service associated with this CIM_JobCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable Methods</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_JobCapabilities_ApplicableMethods()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getApplicableMethods();

	/**
	 * Returns the value of the '<em><b>Time Before Removal Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the minimum value supported for the CIM_ConcreteJob.TimeBeforeRemoval for the job instances that are subject to these capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Before Removal Min</em>' attribute.
	 * @see #setTimeBeforeRemovalMin(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobCapabilities_TimeBeforeRemovalMin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeBeforeRemovalMin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobCapabilities#getTimeBeforeRemovalMin <em>Time Before Removal Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Before Removal Min</em>' attribute.
	 * @see #getTimeBeforeRemovalMin()
	 * @generated
	 */
	void setTimeBeforeRemovalMin(String value);

	/**
	 * Returns the value of the '<em><b>Time Before Removal Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the maximum value supported for the CIM_ConcreteJob.TimeBeforeRemoval for the job instances that are subject to these capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Before Removal Max</em>' attribute.
	 * @see #setTimeBeforeRemovalMax(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobCapabilities_TimeBeforeRemovalMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeBeforeRemovalMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobCapabilities#getTimeBeforeRemovalMax <em>Time Before Removal Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Before Removal Max</em>' attribute.
	 * @see #getTimeBeforeRemovalMax()
	 * @generated
	 */
	void setTimeBeforeRemovalMax(String value);

} // CIM_JobCapabilities

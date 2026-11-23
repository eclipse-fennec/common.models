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
 * A representation of the model object '<em><b>CIM Concrete Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A concrete version of Job. This class represents a generic and instantiable unit of work, such as a batch or a print job.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ConcreteJob#getJobState <em>Job State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ConcreteJob#getTimeOfLastStateChange <em>Time Of Last State Change</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ConcreteJob#getTimeBeforeRemoval <em>Time Before Removal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ConcreteJob#getJobInParameters <em>Job In Parameters</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ConcreteJob#getJobOutParameters <em>Job Out Parameters</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConcreteJob()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.38.0' UMLPackagePath='CIM::Core::CoreElements' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; must include a copyrighted, trademarked or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID, or that is a registered ID that is assigned to the business entity by a recognized global authority. (This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; must not contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity must assure that the resulting InstanceID is not re-used across any InstanceIDs produced by this or other providers for the NameSpace of this instance. \nFor DMTF defined instances, the \'preferred\' algorithm must be used with the &lt;OrgID&gt; set to \'CIM\'.' override.Name='string' override.Name.Required='true' override.Name.Description='The user-friendly name for this instance of a Job. In addition, the user-friendly name can be used as a property for a search or query. (Note: Name does not have to be unique within a namespace.)' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ConcreteJob extends CIM_Job {
	/**
	 * Returns the value of the '<em><b>Job State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * JobState is an integer enumeration that indicates the operational state of a Job. It can also indicate transitions between these states, for example, 'Shutting Down' and 'Starting'. Following is a brief description of the states: 
	 * New (2) indicates that the job has never been started. 
	 * Starting (3) indicates that the job is moving from the 'New', 'Suspended', or 'Service' states into the 'Running' state. 
	 * Running (4) indicates that the Job is running. 
	 * Suspended (5) indicates that the Job is stopped, but can be restarted in a seamless manner. 
	 * Shutting Down (6) indicates that the job is moving to a 'Completed', 'Terminated', or 'Killed' state. 
	 * Completed (7) indicates that the job has completed normally. 
	 * Terminated (8) indicates that the job has been stopped by a 'Terminate' state change request. The job and all its underlying processes are ended and can be restarted (this is job-specific) only as a new job. 
	 * Killed (9) indicates that the job has been stopped by a 'Kill' state change request. Underlying processes might have been left running, and cleanup might be required to free up resources. 
	 * Exception (10) indicates that the Job is in an abnormal state that might be indicative of an error condition. Actual status might be displayed though job-specific objects. 
	 * Service (11) indicates that the Job is in a vendor-specific state that supports problem discovery, or resolution, or both.
	 * Query pending (12) waiting for a client to resolve a query
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Job State</em>' attribute.
	 * @see #setJobState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConcreteJob_JobState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13..32767\",\"32768..65535\"]' Values='[\"New\",\"Starting\",\"Running\",\"Suspended\",\"Shutting Down\",\"Completed\",\"Terminated\",\"Killed\",\"Exception\",\"Service\",\"Query Pending\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getJobState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConcreteJob#getJobState <em>Job State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job State</em>' attribute.
	 * @see #getJobState()
	 * @generated
	 */
	void setJobState(Integer value);

	/**
	 * Returns the value of the '<em><b>Time Of Last State Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date or time when the state of the Job last changed. If the state of the Job has not changed and this property is populated, then it must be set to a 0 interval value. If a state change was requested, but rejected or not yet processed, the property must not be updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Of Last State Change</em>' attribute.
	 * @see #setTimeOfLastStateChange(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConcreteJob_TimeOfLastStateChange()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getTimeOfLastStateChange();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConcreteJob#getTimeOfLastStateChange <em>Time Of Last State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Of Last State Change</em>' attribute.
	 * @see #getTimeOfLastStateChange()
	 * @generated
	 */
	void setTimeOfLastStateChange(String value);

	/**
	 * Returns the value of the '<em><b>Time Before Removal</b></em>' attribute.
	 * The default value is <code>"00000000000500.000000:000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of time that the Job is retained after it has finished executing, either succeeding or failing in that execution. The job must remain in existence for some period of time regardless of the value of the DeleteOnCompletion property. 
	 * The default is five minutes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Before Removal</em>' attribute.
	 * @see #setTimeBeforeRemoval(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConcreteJob_TimeBeforeRemoval()
	 * @model default="00000000000500.000000:000"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Required='true' Write='true'"
	 * @generated
	 */
	String getTimeBeforeRemoval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConcreteJob#getTimeBeforeRemoval <em>Time Before Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Before Removal</em>' attribute.
	 * @see #getTimeBeforeRemoval()
	 * @generated
	 */
	void setTimeBeforeRemoval(String value);

	/**
	 * Returns the value of the '<em><b>Job In Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input (including inout), parameters of the job, formatted as an embedded instance with a class name of "__JobInParameters".
	 * In the case where a job represents an intrinsic operation or an extrinsic method call, that embedded instance contains properties representing the input parameters of that call. Each input parameter is mapped to a corresponding property of the same name and type. REF-typed parameters are represented as Reference-qualified properties of type string whose value is the instance path in WBEM URI format.
	 * The value of each property shall be the value of the corresponding input parameter at the time the job was started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Job In Parameters</em>' attribute.
	 * @see #setJobInParameters(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConcreteJob_JobInParameters()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedObject='true'"
	 * @generated
	 */
	String getJobInParameters();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConcreteJob#getJobInParameters <em>Job In Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job In Parameters</em>' attribute.
	 * @see #getJobInParameters()
	 * @generated
	 */
	void setJobInParameters(String value);

	/**
	 * Returns the value of the '<em><b>Job Out Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The output (including inout), parameters of the job, formatted as an embedded instance with a class name of "__JobOutParameters".
	 * 
	 * This property shall be NULL unless JobStatus has the value Completed (7).
	 * 
	 * In the case where a job represents an intrinsic operation or an extrinsic method call, that embedded instance contains properties representing the output parameters and return value of that call. Each output parameter is mapped to a corresponding property of the same name and type, and the return value is mapped to a property with the name __ReturnValue of the same type. REF-typed parameters and return values are mapped to Reference-qualified properties of type string whose value is the instance path in WBEM URI format.
	 * 
	 * The value of each such property shall be the value of the corresponding output parameter or return value at the time the job completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Job Out Parameters</em>' attribute.
	 * @see #setJobOutParameters(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ConcreteJob_JobOutParameters()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedObject='true'"
	 * @generated
	 */
	String getJobOutParameters();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ConcreteJob#getJobOutParameters <em>Job Out Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Out Parameters</em>' attribute.
	 * @see #getJobOutParameters()
	 * @generated
	 */
	void setJobOutParameters(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests that the state of the job be changed to the value specified in the RequestedState parameter. Invoking the RequestStateChange method multiple times could result in earlier requests being overwritten or lost. 
	 * If 0 is returned, then the task completed successfully. Any other return code indicates an error condition.
	 * @param RequestedState
	 *   RequestStateChange changes the state of a job. The possible values are as follows: 
	 *   Start (2) changes the state to 'Running'. 
	 *   Suspend (3) stops the job temporarily. The intention is to subsequently restart the job with 'Start'. It might be possible to enter the 'Service' state while suspended. (This is job-specific.) 
	 *   Terminate (4) stops the job cleanly, saving data, preserving the state, and shutting down all underlying processes in an orderly manner. 
	 *   Kill (5) terminates the job immediately with no requirement to save data or preserve the state. 
	 *   Service (6) puts the job into a vendor-specific service state. It might be possible to restart the job.
	 * @param TimeoutPeriod
	 *   A timeout period that specifies the maximum amount of time that the client expects the transition to the new state to take. The interval format must be used to specify the TimeoutPeriod. A value of 0 or a null parameter indicates that the client has no time requirements for the transition. 
	 *   If this property does not contain 0 or null and the implementation does not support this parameter, a return code of 'Use Of Timeout Parameter Not Supported' must be returned.
	 * <!-- end-model-doc -->
	 * @model RequestedStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7..32767\",\"32768..65535\"]' Values='[\"Start\",\"Suspend\",\"Terminate\",\"Kill\",\"Service\",\"DMTF Reserved\",\"Vendor Reserved\"]'" TimeoutPeriodAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Can NOT complete within Timeout Period\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Transition Started\",\"Invalid State Transition\",\"Use of Timeout Parameter Not Supported\",\"Busy\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RequestStateChange(Integer RequestedState, String TimeoutPeriod);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GetError is deprecated because Error should be an array,not a scalar.
	 * When the job is executing or has terminated without error, then this method returns no CIM_Error instance. However, if the job has failed because of some internal problem or because the job has been terminated by a client, then a CIM_Error instance is returned.
	 * @param Error If the OperationalStatus on the Job is not "OK", then this method will return a CIM Error instance. Otherwise, when the Job is "OK", null is returned.
	 * <!-- end-model-doc -->
	 * @model ErrorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' EmbeddedInstance='CIM_Error'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_ConcreteJob.GetErrors\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetError(String Error);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If JobState is "Completed" and Operational Status is "Completed" then no instance of CIM_Error is returned. 
	 * If JobState is "Exception" then GetErrors may return intances of CIM_Error related to the execution of the procedure or method invoked by the job.
	 * If Operatational Status is not "OK" or "Completed"then GetErrors may return CIM_Error instances related to the running of the job.
	 * @param Errors If the OperationalStatus on the Job is not "OK", then this method will return one or more CIM Error instance(s). Otherwise, when the Job is "OK", null is returned.
	 * <!-- end-model-doc -->
	 * @model ErrorsUnique="false" ErrorsMany="true"
	 *        ErrorsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Out='true' EmbeddedInstance='CIM_Error'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Access Denied\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetErrors(EList<String> Errors);

} // CIM_ConcreteJob

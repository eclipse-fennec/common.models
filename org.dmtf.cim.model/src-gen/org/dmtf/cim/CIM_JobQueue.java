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
 * A representation of the model object '<em><b>CIM Job Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Status and configuration of a JobQueue. Jobs are held on a queue, and can move from queue to queue until being processed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_JobQueue#getQueueStatus <em>Queue Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobQueue#getQueueStatusInfo <em>Queue Status Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobQueue#getDefaultJobPriority <em>Default Job Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobQueue#getMaxTimeOnQueue <em>Max Time On Queue</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobQueue#getMaxJobsOnQueue <em>Max Jobs On Queue</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_JobQueue#getMaxJobCPUTime <em>Max Job CPU Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_JobQueue()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::System::Processing' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_JobQueue extends CIM_JobDestination {
	/**
	 * Returns the value of the '<em><b>Queue Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides queue-specific status information, beyond the ManagedSystemElement.OperationalStatus property. This property further qualifies the status of the queue, or indicates a secondary condition (e.g. queue full).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue Status</em>' attribute.
	 * @see #setQueueStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobQueue_QueueStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Other\",\"No Additional Status\",\"Queue Full\"]' ModelCorrespondence='[\"CIM_JobQueue.QueueStatusInfo\"]'"
	 * @generated
	 */
	Integer getQueueStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobQueue#getQueueStatus <em>Queue Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Status</em>' attribute.
	 * @see #getQueueStatus()
	 * @generated
	 */
	void setQueueStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Queue Status Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides a textual explanation for the status of the queue. Information about both QueueStatus and the OperationalStatus property (inherited from ManagedSystemElement) may be described in QueueStatusInfo. Note, however, that OperationalStatus' Descriptions (if available) MUST be provided in the StatusDescriptions array, inherited from ManagedSystemElement. This is where management clients will expect to locate this information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue Status Info</em>' attribute.
	 * @see #setQueueStatusInfo(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobQueue_QueueStatusInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_JobQueue.QueueStatus\"]'"
	 * @generated
	 */
	String getQueueStatusInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobQueue#getQueueStatusInfo <em>Queue Status Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Status Info</em>' attribute.
	 * @see #getQueueStatusInfo()
	 * @generated
	 */
	void setQueueStatusInfo(String value);

	/**
	 * Returns the value of the '<em><b>Default Job Priority</b></em>' attribute.
	 * The default value is <code>"65535"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the priority that will be assigned to a new Job being submitted to this queue, if the Job does not explicitly specify a priority. Note that lower numbers indicate higher priorities. The default value of 0xFFFFFFFF is the lowest priority.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Job Priority</em>' attribute.
	 * @see #setDefaultJobPriority(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobQueue_DefaultJobPriority()
	 * @model default="65535"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true'"
	 * @generated
	 */
	Long getDefaultJobPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobQueue#getDefaultJobPriority <em>Default Job Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Job Priority</em>' attribute.
	 * @see #getDefaultJobPriority()
	 * @generated
	 */
	void setDefaultJobPriority(Long value);

	/**
	 * Returns the value of the '<em><b>Max Time On Queue</b></em>' attribute.
	 * The default value is <code>"00000000000000.000000:000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the maximum time (using a datetime interval format) that a Job can remain on this Queue before completing. If the MaxTimeOnQueue property is exceeded, then the Job SHOULD be removed from the Queue. A value of 0 (the default) indicates that there is no time limit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Time On Queue</em>' attribute.
	 * @see #setMaxTimeOnQueue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobQueue_MaxTimeOnQueue()
	 * @model default="00000000000000.000000:000"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Write='true'"
	 * @generated
	 */
	String getMaxTimeOnQueue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobQueue#getMaxTimeOnQueue <em>Max Time On Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time On Queue</em>' attribute.
	 * @see #getMaxTimeOnQueue()
	 * @generated
	 */
	void setMaxTimeOnQueue(String value);

	/**
	 * Returns the value of the '<em><b>Max Jobs On Queue</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the maximum number of Jobs that can reside on this Queue. A value of 0 (the default) indicates that there is no maximum queue depth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Jobs On Queue</em>' attribute.
	 * @see #setMaxJobsOnQueue(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobQueue_MaxJobsOnQueue()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true'"
	 * @generated
	 */
	Long getMaxJobsOnQueue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobQueue#getMaxJobsOnQueue <em>Max Jobs On Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Jobs On Queue</em>' attribute.
	 * @see #getMaxJobsOnQueue()
	 * @generated
	 */
	void setMaxJobsOnQueue(Long value);

	/**
	 * Returns the value of the '<em><b>Max Job CPU Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the maximum number of milliseconds of CPU time that a Job queued to this destination can consume to complete its execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Job CPU Time</em>' attribute.
	 * @see #setMaxJobCPUTime(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_JobQueue_MaxJobCPUTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Write='true' Units='MilliSeconds' PUnit='second * 10^-3'"
	 * @generated
	 */
	Long getMaxJobCPUTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_JobQueue#getMaxJobCPUTime <em>Max Job CPU Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Job CPU Time</em>' attribute.
	 * @see #getMaxJobCPUTime()
	 * @generated
	 */
	void setMaxJobCPUTime(Long value);

} // CIM_JobQueue

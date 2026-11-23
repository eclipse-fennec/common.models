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
 * A representation of the model object '<em><b>CIM Print Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of a Printer Queue. A PrintQueue holds PrintJobs that are placed on the Queue by a Print Service. Jobs can move from Queue to Queue. The ABNF for CIM references to PWG Standards and MIBs is in the directory 'ftp://ftp.pwg.org/pub/pwg/general/process' in the file 'pwg-cim-references-format-20060309.txt'. An example for a MappingStrings reference to a PWG Standard is 'PWG5101-1.PWG|Section 4 Media Color Names'. An example for a MappingStrings reference to a PWG MIB is 'MIB.PWG|PWG-IMAGING-COUNTER-MIB.icMonitorCompletedJobs'.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PrintQueue#getQueueEnabled <em>Queue Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintQueue#getQueueAccepting <em>Queue Accepting</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintQueue#getNumberOnQueue <em>Number On Queue</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintQueue#getQueueStatus <em>Queue Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintQueue#getQueueStatusInfo <em>Queue Status Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintQueue#getMaxJobSize <em>Max Job Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintQueue#getDefaultJobPriority <em>Default Job Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintQueue#getJobPriorityHigh <em>Job Priority High</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintQueue#getJobPriorityLow <em>Job Priority Low</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintQueue#getAvailableJobSheets <em>Available Job Sheets</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PrintQueue()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.14.0' UMLPackagePath='CIM::Device::Printing' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_PrintQueue extends CIM_JobDestination {
	/**
	 * Returns the value of the '<em><b>Queue Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: Both this property and QueueAccepting are deprecated in lieu of EnabledState. 
	 * Deprecated description: Indicates that Jobs on the Queue will be passed to a Printer. When false, a Job will remain on the Queue and will not be passed to a Printer for output. This property, coupled with the information in QueueAccepting, aligns with various values of the inherited EnabledState property: 
	 * - When both QueueEnabled and QueueAccepting are true, then EnabledState is set to 2 ("Enabled") 
	 * - When both QueueEnabled and QueueAccepting are false, then EnabledState is set to 3 ("Disabled") 
	 * - When QueueEnabled is true and QueueAccepting is false (for instance, when the Queue outputs jobs to the printer, but does not accept new jobs), then EnabledState is set to 6 ("Enabled but Offline") 
	 * - When QueueEnabled is false and QueueAccepting is true (for instance, when the Queue accepts print jobs but does not send them to a printer), then EnabledState is set to 8 ("Deferred").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue Enabled</em>' attribute.
	 * @see #setQueueEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintQueue_QueueEnabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_EnabledLogicalElement.EnabledState\"]'"
	 * @generated
	 */
	Boolean getQueueEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintQueue#getQueueEnabled <em>Queue Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Enabled</em>' attribute.
	 * @see #getQueueEnabled()
	 * @generated
	 */
	void setQueueEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Queue Accepting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: Both this property and QueueEnabled are deprecated in lieu of EnabledState. 
	 * Deprecated description: When false, no PrintService can place PrintJobs on the PrintQueue. The ability of an individual PrintService to place a Job on the Queue can be specified using the QueueAcceptingFromService property in the QueueForPrint Service association. This property, coupled with the information in QueueEnabled, aligns with various values of the inherited EnabledState property: 
	 * - When both QueueEnabled and QueueAccepting are true, then EnabledState is set to 2 ("Enabled") 
	 * - When both QueueEnabled and QueueAccepting are false, then EnabledState is set to 3 ("Disabled") 
	 * - When QueueEnabled is true and QueueAccepting is false (for instance, when the Queue outputs jobs to the printer, but does not accept new jobs), then EnabledState is set to 6 ("Enabled but Offline") 
	 * - When QueueEnabled is false and QueueAccepting is true (for instance, when the Queue accepts print jobs but does not send them to a printer), then EnabledState is set to 8 ("Deferred").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue Accepting</em>' attribute.
	 * @see #setQueueAccepting(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintQueue_QueueAccepting()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_EnabledLogicalElement.EnabledState\"]'"
	 * @generated
	 */
	Boolean getQueueAccepting();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintQueue#getQueueAccepting <em>Queue Accepting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Accepting</em>' attribute.
	 * @see #getQueueAccepting()
	 * @generated
	 */
	void setQueueAccepting(Boolean value);

	/**
	 * Returns the value of the '<em><b>Number On Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current number of Jobs on the Queue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number On Queue</em>' attribute.
	 * @see #setNumberOnQueue(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintQueue_NumberOnQueue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Gauge='true' MappingStrings='[\"MIB.IETF|Job-Monitoring-MIB.jmGeneralNumberOfActiveJobs\",\"RFC2911.IETF|Printer.queued-job-count\"]'"
	 * @generated
	 */
	Long getNumberOnQueue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintQueue#getNumberOnQueue <em>Number On Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number On Queue</em>' attribute.
	 * @see #getNumberOnQueue()
	 * @generated
	 */
	void setNumberOnQueue(Long value);

	/**
	 * Returns the value of the '<em><b>Queue Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gives Queue-specific status information, beyond the ManagedSystemElement.Status property. This method can be used to provide further qualification as to the status of the Queue or to indicate a secondary condition (for example, spool area is full).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue Status</em>' attribute.
	 * @see #setQueueStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintQueue_QueueStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Other\",\"Unknown\",\"No Additional Status\",\"QueueSpoolAreaFull\"]' MappingStrings='[\"RFC2911.IETF|Printer.printer-state-reasons\"]'"
	 * @generated
	 */
	Integer getQueueStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintQueue#getQueueStatus <em>Queue Status</em>}' attribute.
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
	 * Provides a textual explanation for the status of the Queue. The settings of both QueueStatus and the Status property that are inherited from ManagedSystemElement can be described by QueueStatusInfo. For example, if "Stopping" is the value that is assigned to Status, then this property might contain an explanation as to why the Queue is being stopped.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue Status Info</em>' attribute.
	 * @see #setQueueStatusInfo(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintQueue_QueueStatusInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"RFC2911.IETF|Printer.printer-state-message\"]'"
	 * @generated
	 */
	String getQueueStatusInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintQueue#getQueueStatusInfo <em>Queue Status Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Status Info</em>' attribute.
	 * @see #getQueueStatusInfo()
	 * @generated
	 */
	void setQueueStatusInfo(String value);

	/**
	 * Returns the value of the '<em><b>Max Job Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the largest possible Job (in terms of a single byte stream) that can be submitted to this Queue. A value of 0 indicates that no limit has been set. Units are Kbytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Job Size</em>' attribute.
	 * @see #setMaxJobSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintQueue_MaxJobSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='KiloBytes' MappingStrings='[\"RFC2911.IETF|Section 4.4.33 job-k-octets-supported\"]' ModelCorrespondence='[\"CIM_PrintJob.JobSize\"]' PUnit='byte * 10^3'"
	 * @generated
	 */
	Long getMaxJobSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintQueue#getMaxJobSize <em>Max Job Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Job Size</em>' attribute.
	 * @see #getMaxJobSize()
	 * @generated
	 */
	void setMaxJobSize(Long value);

	/**
	 * Returns the value of the '<em><b>Default Job Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the priority that will be assigned to a new Job that is submitted to this Queue, if the Job does not explicitly specify a priority. The range of valid priorities and the interpretation of priorities can be determined from the JobPriorityHigh and JobPriorityLow properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Job Priority</em>' attribute.
	 * @see #setDefaultJobPriority(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintQueue_DefaultJobPriority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"RFC2911.IETF|Printer.job-priority-default\"]' ModelCorrespondence='[\"CIM_PrintQueue.JobPriorityHigh\",\"CIM_PrintQueue.JobPriorityLow\"]'"
	 * @generated
	 */
	Long getDefaultJobPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintQueue#getDefaultJobPriority <em>Default Job Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Job Priority</em>' attribute.
	 * @see #getDefaultJobPriority()
	 * @generated
	 */
	void setDefaultJobPriority(Long value);

	/**
	 * Returns the value of the '<em><b>Job Priority High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the numeric value that is used to represent the highest priority Jobs that are submitted to this Queue. The range of numeric values for priority can be inverted, for example, a high priority job is represented by a low integer value. This value is indicated by JobPriorityLow being greater than JobPriorityHigh. If both values (PriorityLow and PriorityHigh) are assigned to 0, then the Queue does not support Job priorities. The values and usage of the property SHOULD conform to the semantics of the 'job-priority-supported' attribute of the Printer object defined in IPP/1.1 [RFC2911].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Job Priority High</em>' attribute.
	 * @see #setJobPriorityHigh(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintQueue_JobPriorityHigh()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"RFC2911.IETF|Printer.job-priority-supported\"]' ModelCorrespondence='[\"CIM_PrintQueue.JobPriorityLow\",\"CIM_Job.Priority\"]'"
	 * @generated
	 */
	Long getJobPriorityHigh();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintQueue#getJobPriorityHigh <em>Job Priority High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Priority High</em>' attribute.
	 * @see #getJobPriorityHigh()
	 * @generated
	 */
	void setJobPriorityHigh(Long value);

	/**
	 * Returns the value of the '<em><b>Job Priority Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the numeric value that is used to represent the lowest priority Jobs that are submitted to this Queue. The range of numeric values for priority can be inverted, for example, a low priority job is represented by a high integer value. This value is indicated by JobPriorityLow being greater than JobPriorityHigh. If both values (PriorityLow and PriorityHigh) are assigned to 0, then the Queue does not support Job priorities. The values and usage of the property SHOULD conform to the semantics of the 'job-priority-supported' attribute of the Printer object defined in IPP/1.1 [RFC2911].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Job Priority Low</em>' attribute.
	 * @see #setJobPriorityLow(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintQueue_JobPriorityLow()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"RFC2911.IETF|Printer.job-priority-supported\"]' ModelCorrespondence='[\"CIM_PrintQueue.JobPriorityHigh\",\"CIM_Job.Priority\"]'"
	 * @generated
	 */
	Long getJobPriorityLow();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PrintQueue#getJobPriorityLow <em>Job Priority Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Priority Low</em>' attribute.
	 * @see #getJobPriorityLow()
	 * @generated
	 */
	void setJobPriorityLow(Long value);

	/**
	 * Returns the value of the '<em><b>Available Job Sheets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the job sheets that are supported by this Queue. Typically the job sheets that are provided by a Queue will be the union or aggregation of those provided by all the Printers that it supports. However, a system administrator can choose to restrict access to some job sheets on a particular Queue. A Queue can also support additional job sheets through the use of a filter that adds a banner or some other page when a Job is taken from the Queue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Job Sheets</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintQueue_AvailableJobSheets()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MappingStrings='[\"MIB.IETF|Printer-MIB.prtAuxiliarySheetStartupPage\",\"MIB.IETF|Printer-MIB.prtAuxiliarySheetBannerPage\",\"RFC2911.IETF|Printer.job-sheets-supported\"]' ModelCorrespondence='[\"CIM_PrintJob.RequiredJobSheets\"]'"
	 * @generated
	 */
	EList<String> getAvailableJobSheets();

} // CIM_PrintQueue

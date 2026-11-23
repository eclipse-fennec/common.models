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
 * A representation of the model object '<em><b>CIM File System Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of StatisticalData which identifies individual statistics for an element of a system that provides filesystem support. This class defines the metrics that MAY be kept for managed elements of the system.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getOtherElementTypeDescription <em>Other Element Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalIOs <em>Total IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalBytesTransferred <em>Total Bytes Transferred</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getReadIOs <em>Read IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getWriteIOs <em>Write IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getOtherIOs <em>Other IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getMetadataReadIOs <em>Metadata Read IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getMetadataWriteIOs <em>Metadata Write IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalIOTimeCounter <em>Total IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalIdleTimeCounter <em>Total Idle Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getReadIOTimeCounter <em>Read IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getBytesRead <em>Bytes Read</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getWriteIOTimeCounter <em>Write IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getBytesWritten <em>Bytes Written</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getMetadataBytesRead <em>Metadata Bytes Read</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getMetadataBytesWritten <em>Metadata Bytes Written</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getPercentDurableOpens <em>Percent Durable Opens</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getPercentResilientOpens <em>Percent Resilient Opens</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getPercentPersistentOpens <em>Percent Persistent Opens</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageReadResponseTime <em>Average Read Response Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageWriteResponseTime <em>Average Write Response Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageRequestResponseTime <em>Average Request Response Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getBytesReadPerSec <em>Bytes Read Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalBytesReceived <em>Total Bytes Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getBytesReceivedPerSec <em>Bytes Received Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalBytesSent <em>Total Bytes Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getBytesSentPerSec <em>Bytes Sent Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getBytesTranferredPerSec <em>Bytes Tranferred Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getBytesWrittenPerSec <em>Bytes Written Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getFilesOpenedPerSec <em>Files Opened Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalOpenFileCount <em>Total Open File Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getCurrentPendingRequests <em>Current Pending Requests</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getReadRequestsProcessedPerSec <em>Read Requests Processed Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalRequestsReceived <em>Total Requests Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getRequestsReceivedPerSec <em>Requests Received Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalDurableHandleReopenCount <em>Total Durable Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalFailedDurableHandleReopenCount <em>Total Failed Durable Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalFailedResilientHandleReopenCount <em>Total Failed Resilient Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getCurrentOpenFileCount <em>Current Open File Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalResilientHandleReopenCount <em>Total Resilient Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalPersistentHandleReopenCount <em>Total Persistent Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalFailedPersistentHandleReopenCount <em>Total Failed Persistent Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTreeConnectCount <em>Tree Connect Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getWriteRequestsProcessedPerSec <em>Write Requests Processed Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalMetadataRequestsReceived <em>Total Metadata Requests Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getMetadataRequestsReceivedPerSec <em>Metadata Requests Received Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageTimePerDataRequest <em>Average Time Per Data Request</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageBytesPerDataRequest <em>Average Bytes Per Data Request</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageBytesPerReadRequest <em>Average Bytes Per Read Request</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageBytesPerWriteRequest <em>Average Bytes Per Write Request</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageReadQueueLength <em>Average Read Queue Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageWriteQueueLength <em>Average Write Queue Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageDataQueueLength <em>Average Data Queue Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getDataBytesPerSec <em>Data Bytes Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getDataRequestsPerSec <em>Data Requests Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getCurrentDataQueueLength <em>Current Data Queue Length</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileStatistics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FileSystemStatisticalData extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the role that the element played for which this statistics record was collected. If the metered element is a system or a component of a system associated to a RegisteredProfile, then that profile may provide a more specialized definition and additional usage information for this property. 
	 * Generally, the ElementTypes defined here have the following meaning in the context of this class: 1, "Other": An element type other than one explicitly declared herein. In this case, information describing this element should be provided in the OtherElementTypeDescription string property. 102, "Local Filesystem": Statistics for a local filesystem and collectively all of its files and directories. 103, "Exported File Share": Statistics for a file share that is exported to a network. 104, "Exporting Port": Statistics for a port through which a file share being exported can be accessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see #setElementType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_ElementType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"1\",\"102\",\"103\",\"104\",\"105\",\"..\",\"0x8000..\"]' Values='[\"Other\",\"Local Filesystem\",\"Exported File Share\",\"Exporting Port\",\"Session\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getElementType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Element Type Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the type of element when the ElementType property of this class (or any of its subclasses) is set to 1 (i.e., "Other"). This property should be set to NULL when the ElementType property is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Element Type Description</em>' attribute.
	 * @see #setOtherElementTypeDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_OtherElementTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64'"
	 * @generated
	 */
	String getOtherElementTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getOtherElementTypeDescription <em>Other Element Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Element Type Description</em>' attribute.
	 * @see #getOtherElementTypeDescription()
	 * @generated
	 */
	void setOtherElementTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Total IOs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of file I/O operations for the object, including metadata I/O operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total IOs</em>' attribute.
	 * @see #setTotalIOs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TotalIOs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTotalIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalIOs <em>Total IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total IOs</em>' attribute.
	 * @see #getTotalIOs()
	 * @generated
	 */
	void setTotalIOs(Long value);

	/**
	 * Returns the value of the '<em><b>Total Bytes Transferred</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of bytes transferred for all of the file I/O operations as defined in the "TotalIOs" property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Bytes Transferred</em>' attribute.
	 * @see #setTotalBytesTransferred(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TotalBytesTransferred()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true'"
	 * @generated
	 */
	Long getTotalBytesTransferred();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalBytesTransferred <em>Total Bytes Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Bytes Transferred</em>' attribute.
	 * @see #getTotalBytesTransferred()
	 * @generated
	 */
	void setTotalBytesTransferred(Long value);

	/**
	 * Returns the value of the '<em><b>Read IOs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of file I/O operations that were directed to the object and that performed a transfer of data from the file contents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read IOs</em>' attribute.
	 * @see #setReadIOs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_ReadIOs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getReadIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getReadIOs <em>Read IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read IOs</em>' attribute.
	 * @see #getReadIOs()
	 * @generated
	 */
	void setReadIOs(Long value);

	/**
	 * Returns the value of the '<em><b>Write IOs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of file I/O operations that were directed to the object and that performed a transfer of data to the file contents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write IOs</em>' attribute.
	 * @see #setWriteIOs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_WriteIOs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getWriteIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getWriteIOs <em>Write IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write IOs</em>' attribute.
	 * @see #getWriteIOs()
	 * @generated
	 */
	void setWriteIOs(Long value);

	/**
	 * Returns the value of the '<em><b>Other IOs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of file I/O operations that were directed to the object and that did not perform a transfer of data either to or from the file contents. This count excludes metadata I/O operations (both read and write).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other IOs</em>' attribute.
	 * @see #setOtherIOs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_OtherIOs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getOtherIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getOtherIOs <em>Other IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other IOs</em>' attribute.
	 * @see #getOtherIOs()
	 * @generated
	 */
	void setOtherIOs(Long value);

	/**
	 * Returns the value of the '<em><b>Metadata Read IOs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of file I/O operations that were directed to the object and that performed a read transfer of metadata.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata Read IOs</em>' attribute.
	 * @see #setMetadataReadIOs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_MetadataReadIOs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getMetadataReadIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getMetadataReadIOs <em>Metadata Read IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Read IOs</em>' attribute.
	 * @see #getMetadataReadIOs()
	 * @generated
	 */
	void setMetadataReadIOs(Long value);

	/**
	 * Returns the value of the '<em><b>Metadata Write IOs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of file I/O operations that were directed to the object and that performed a write transfer of metadata.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata Write IOs</em>' attribute.
	 * @see #setMetadataWriteIOs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_MetadataWriteIOs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getMetadataWriteIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getMetadataWriteIOs <em>Metadata Write IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Write IOs</em>' attribute.
	 * @see #getMetadataWriteIOs()
	 * @generated
	 */
	void setMetadataWriteIOs(Long value);

	/**
	 * Returns the value of the '<em><b>Total IO Time Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative elapsed I/O operation time (number of ClockTickIntervals) for all I/O operations as defined in "Total I/Os". The I/O operation response time is added to this counter at the completion of each measured I/O operation using ClockTickInterval units. The TotalIOTimeCounter value can be divided by the total number of I/O operations (TotalIOs) to obtain an I/O operation average response time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total IO Time Counter</em>' attribute.
	 * @see #setTotalIOTimeCounter(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TotalIOTimeCounter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTotalIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalIOTimeCounter <em>Total IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total IO Time Counter</em>' attribute.
	 * @see #getTotalIOTimeCounter()
	 * @generated
	 */
	void setTotalIOTimeCounter(Long value);

	/**
	 * Returns the value of the '<em><b>Total Idle Time Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative elapsed idle time using ClockTickInterval units. That is, the cumulative number of ClockTimeIntervals for all idle time within the object, with "idle time" being that time during which no I/O operations were being processed by the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Idle Time Counter</em>' attribute.
	 * @see #setTotalIdleTimeCounter(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TotalIdleTimeCounter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTotalIdleTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalIdleTimeCounter <em>Total Idle Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Idle Time Counter</em>' attribute.
	 * @see #getTotalIdleTimeCounter()
	 * @generated
	 */
	void setTotalIdleTimeCounter(Long value);

	/**
	 * Returns the value of the '<em><b>Read IO Time Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative elapsed I/O operation time for all Read I/O operations (that is, the cumulative elapsed time for all Read I/O operations as defined by the "ReadIOs" property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read IO Time Counter</em>' attribute.
	 * @see #setReadIOTimeCounter(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_ReadIOTimeCounter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getReadIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getReadIOTimeCounter <em>Read IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read IO Time Counter</em>' attribute.
	 * @see #getReadIOTimeCounter()
	 * @generated
	 */
	void setReadIOTimeCounter(Long value);

	/**
	 * Returns the value of the '<em><b>Bytes Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of bytes read (that is, the cumulative count of bytes transferred by all Read I/O operations as defined by the "ReadIOs" property).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bytes Read</em>' attribute.
	 * @see #setBytesRead(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_BytesRead()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true'"
	 * @generated
	 */
	Long getBytesRead();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getBytesRead <em>Bytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes Read</em>' attribute.
	 * @see #getBytesRead()
	 * @generated
	 */
	void setBytesRead(Long value);

	/**
	 * Returns the value of the '<em><b>Write IO Time Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative elapsed I/O operation time for all Write I/O operations (that is, the cumulative elapsed time for all Write I/O operations as defined by the "WriteIOs" property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write IO Time Counter</em>' attribute.
	 * @see #setWriteIOTimeCounter(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_WriteIOTimeCounter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getWriteIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getWriteIOTimeCounter <em>Write IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write IO Time Counter</em>' attribute.
	 * @see #getWriteIOTimeCounter()
	 * @generated
	 */
	void setWriteIOTimeCounter(Long value);

	/**
	 * Returns the value of the '<em><b>Bytes Written</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of bytes written (that is, the cumulative count of bytes transferred by all Write I/O operations as defined by the "WriteIOs" property).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bytes Written</em>' attribute.
	 * @see #setBytesWritten(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_BytesWritten()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true'"
	 * @generated
	 */
	Long getBytesWritten();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getBytesWritten <em>Bytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes Written</em>' attribute.
	 * @see #getBytesWritten()
	 * @generated
	 */
	void setBytesWritten(Long value);

	/**
	 * Returns the value of the '<em><b>Metadata Bytes Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of metabytes read (that is, the cumulative count of bytes transferred by all Metadata read I/O operations as defined by the "MetadataReadIOs" property).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata Bytes Read</em>' attribute.
	 * @see #setMetadataBytesRead(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_MetadataBytesRead()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true'"
	 * @generated
	 */
	Long getMetadataBytesRead();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getMetadataBytesRead <em>Metadata Bytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Bytes Read</em>' attribute.
	 * @see #getMetadataBytesRead()
	 * @generated
	 */
	void setMetadataBytesRead(Long value);

	/**
	 * Returns the value of the '<em><b>Metadata Bytes Written</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cumulative count of metabytes written (that is, the cumulative count of bytes transferred by all Metadata write I/O operations as defined by the "MetadataWriteIOs" property).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata Bytes Written</em>' attribute.
	 * @see #setMetadataBytesWritten(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_MetadataBytesWritten()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true'"
	 * @generated
	 */
	Long getMetadataBytesWritten();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getMetadataBytesWritten <em>Metadata Bytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Bytes Written</em>' attribute.
	 * @see #getMetadataBytesWritten()
	 * @generated
	 */
	void setMetadataBytesWritten(Long value);

	/**
	 * Returns the value of the '<em><b>Percent Durable Opens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The percentage of total opens for which clients requested durability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent Durable Opens</em>' attribute.
	 * @see #setPercentDurableOpens(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_PercentDurableOpens()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Counter='true'"
	 * @generated
	 */
	Integer getPercentDurableOpens();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getPercentDurableOpens <em>Percent Durable Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Durable Opens</em>' attribute.
	 * @see #getPercentDurableOpens()
	 * @generated
	 */
	void setPercentDurableOpens(Integer value);

	/**
	 * Returns the value of the '<em><b>Percent Resilient Opens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The percentage of total opens for which clients requested resiliency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent Resilient Opens</em>' attribute.
	 * @see #setPercentResilientOpens(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_PercentResilientOpens()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Counter='true'"
	 * @generated
	 */
	Integer getPercentResilientOpens();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getPercentResilientOpens <em>Percent Resilient Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Resilient Opens</em>' attribute.
	 * @see #getPercentResilientOpens()
	 * @generated
	 */
	void setPercentResilientOpens(Integer value);

	/**
	 * Returns the value of the '<em><b>Percent Persistent Opens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The percentage of total handles for which clients requested persistency.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent Persistent Opens</em>' attribute.
	 * @see #setPercentPersistentOpens(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_PercentPersistentOpens()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Counter='true'"
	 * @generated
	 */
	Integer getPercentPersistentOpens();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getPercentPersistentOpens <em>Percent Persistent Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Persistent Opens</em>' attribute.
	 * @see #getPercentPersistentOpens()
	 * @generated
	 */
	void setPercentPersistentOpens(Integer value);

	/**
	 * Returns the value of the '<em><b>Average Read Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average number of seconds that elapse between the time at which a read request to this share is received and the time at which the SMB2 File Server sends the corresponding response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Read Response Time</em>' attribute.
	 * @see #setAverageReadResponseTime(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_AverageReadResponseTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Counter='true'"
	 * @generated
	 */
	Integer getAverageReadResponseTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageReadResponseTime <em>Average Read Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Read Response Time</em>' attribute.
	 * @see #getAverageReadResponseTime()
	 * @generated
	 */
	void setAverageReadResponseTime(Integer value);

	/**
	 * Returns the value of the '<em><b>Average Write Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average number of seconds that elapse between the time at which a write request to this share is received and the time at which the SMB2 File Server sends the corresponding response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Write Response Time</em>' attribute.
	 * @see #setAverageWriteResponseTime(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_AverageWriteResponseTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Counter='true'"
	 * @generated
	 */
	Integer getAverageWriteResponseTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageWriteResponseTime <em>Average Write Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Write Response Time</em>' attribute.
	 * @see #getAverageWriteResponseTime()
	 * @generated
	 */
	void setAverageWriteResponseTime(Integer value);

	/**
	 * Returns the value of the '<em><b>Average Request Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average number of seconds that elapse between the time at which the SMB2 File Server receives a request for this share and the time at which the SMB2 File Server sends the corresponding response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Request Response Time</em>' attribute.
	 * @see #setAverageRequestResponseTime(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_AverageRequestResponseTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Counter='true'"
	 * @generated
	 */
	Integer getAverageRequestResponseTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageRequestResponseTime <em>Average Request Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Request Response Time</em>' attribute.
	 * @see #getAverageRequestResponseTime()
	 * @generated
	 */
	void setAverageRequestResponseTime(Integer value);

	/**
	 * Returns the value of the '<em><b>Bytes Read Per Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rate, in seconds, at which data is being read from this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bytes Read Per Sec</em>' attribute.
	 * @see #setBytesReadPerSec(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_BytesReadPerSec()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true'"
	 * @generated
	 */
	Long getBytesReadPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getBytesReadPerSec <em>Bytes Read Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes Read Per Sec</em>' attribute.
	 * @see #getBytesReadPerSec()
	 * @generated
	 */
	void setBytesReadPerSec(Long value);

	/**
	 * Returns the value of the '<em><b>Total Bytes Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bytes that have been received for requests related to this share. This value includes application data as well as SMB2 protocol data (such as packet headers).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Bytes Received</em>' attribute.
	 * @see #setTotalBytesReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TotalBytesReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true'"
	 * @generated
	 */
	Long getTotalBytesReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalBytesReceived <em>Total Bytes Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Bytes Received</em>' attribute.
	 * @see #getTotalBytesReceived()
	 * @generated
	 */
	void setTotalBytesReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Bytes Received Per Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rate at which bytes are being received for requests related to this share. This value includes application data as well as SMB2 protocol data (such as packet headers).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bytes Received Per Sec</em>' attribute.
	 * @see #setBytesReceivedPerSec(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_BytesReceivedPerSec()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true'"
	 * @generated
	 */
	Long getBytesReceivedPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getBytesReceivedPerSec <em>Bytes Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes Received Per Sec</em>' attribute.
	 * @see #getBytesReceivedPerSec()
	 * @generated
	 */
	void setBytesReceivedPerSec(Long value);

	/**
	 * Returns the value of the '<em><b>Total Bytes Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of bytes that have been sent by the SMB2 File Server related to this share to its clients since the server started. This value includes both data bytes and protocol bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Bytes Sent</em>' attribute.
	 * @see #setTotalBytesSent(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TotalBytesSent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true'"
	 * @generated
	 */
	Long getTotalBytesSent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalBytesSent <em>Total Bytes Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Bytes Sent</em>' attribute.
	 * @see #getTotalBytesSent()
	 * @generated
	 */
	void setTotalBytesSent(Long value);

	/**
	 * Returns the value of the '<em><b>Bytes Sent Per Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rate, in seconds, at which bytes are being sent from the SMB2 File Server related to this share to its clients. This value includes both data bytes and protocol bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bytes Sent Per Sec</em>' attribute.
	 * @see #setBytesSentPerSec(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_BytesSentPerSec()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true'"
	 * @generated
	 */
	Long getBytesSentPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getBytesSentPerSec <em>Bytes Sent Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes Sent Per Sec</em>' attribute.
	 * @see #getBytesSentPerSec()
	 * @generated
	 */
	void setBytesSentPerSec(Long value);

	/**
	 * Returns the value of the '<em><b>Bytes Tranferred Per Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sum of bytes transferred/sec related to this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bytes Tranferred Per Sec</em>' attribute.
	 * @see #setBytesTranferredPerSec(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_BytesTranferredPerSec()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true'"
	 * @generated
	 */
	Long getBytesTranferredPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getBytesTranferredPerSec <em>Bytes Tranferred Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes Tranferred Per Sec</em>' attribute.
	 * @see #getBytesTranferredPerSec()
	 * @generated
	 */
	void setBytesTranferredPerSec(Long value);

	/**
	 * Returns the value of the '<em><b>Bytes Written Per Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rate, in seconds, at which data is being written to this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bytes Written Per Sec</em>' attribute.
	 * @see #setBytesWrittenPerSec(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_BytesWrittenPerSec()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' Counter='true'"
	 * @generated
	 */
	Long getBytesWrittenPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getBytesWrittenPerSec <em>Bytes Written Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes Written Per Sec</em>' attribute.
	 * @see #getBytesWrittenPerSec()
	 * @generated
	 */
	void setBytesWrittenPerSec(Long value);

	/**
	 * Returns the value of the '<em><b>Files Opened Per Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rate, in seconds, at which files are being opened for the SMB2 File Server's clients on this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Files Opened Per Sec</em>' attribute.
	 * @see #setFilesOpenedPerSec(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_FilesOpenedPerSec()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getFilesOpenedPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getFilesOpenedPerSec <em>Files Opened Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Files Opened Per Sec</em>' attribute.
	 * @see #getFilesOpenedPerSec()
	 * @generated
	 */
	void setFilesOpenedPerSec(Long value);

	/**
	 * Returns the value of the '<em><b>Total Open File Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of files that have been opened by the SMB2 File Server on behalf of its clients on this share since the server started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Open File Count</em>' attribute.
	 * @see #setTotalOpenFileCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TotalOpenFileCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTotalOpenFileCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalOpenFileCount <em>Total Open File Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Open File Count</em>' attribute.
	 * @see #getTotalOpenFileCount()
	 * @generated
	 */
	void setTotalOpenFileCount(Long value);

	/**
	 * Returns the value of the '<em><b>Current Pending Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of requests related to this share that are waiting to be processed by the SMB2 File Server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Pending Requests</em>' attribute.
	 * @see #setCurrentPendingRequests(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_CurrentPendingRequests()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getCurrentPendingRequests();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getCurrentPendingRequests <em>Current Pending Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Pending Requests</em>' attribute.
	 * @see #getCurrentPendingRequests()
	 * @generated
	 */
	void setCurrentPendingRequests(Long value);

	/**
	 * Returns the value of the '<em><b>Read Requests Processed Per Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Read requests processed/sec related to this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Requests Processed Per Sec</em>' attribute.
	 * @see #setReadRequestsProcessedPerSec(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_ReadRequestsProcessedPerSec()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getReadRequestsProcessedPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getReadRequestsProcessedPerSec <em>Read Requests Processed Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Requests Processed Per Sec</em>' attribute.
	 * @see #getReadRequestsProcessedPerSec()
	 * @generated
	 */
	void setReadRequestsProcessedPerSec(Long value);

	/**
	 * Returns the value of the '<em><b>Total Requests Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of requests that have been received for this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Requests Received</em>' attribute.
	 * @see #setTotalRequestsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TotalRequestsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTotalRequestsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalRequestsReceived <em>Total Requests Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Requests Received</em>' attribute.
	 * @see #getTotalRequestsReceived()
	 * @generated
	 */
	void setTotalRequestsReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Requests Received Per Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rate at which requests are being received for this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requests Received Per Sec</em>' attribute.
	 * @see #setRequestsReceivedPerSec(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_RequestsReceivedPerSec()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getRequestsReceivedPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getRequestsReceivedPerSec <em>Requests Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requests Received Per Sec</em>' attribute.
	 * @see #getRequestsReceivedPerSec()
	 * @generated
	 */
	void setRequestsReceivedPerSec(Long value);

	/**
	 * Returns the value of the '<em><b>Total Durable Handle Reopen Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of durable opens on this share that have been recovered after a temporary network disconnect since the SMB2 File Server started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Durable Handle Reopen Count</em>' attribute.
	 * @see #setTotalDurableHandleReopenCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TotalDurableHandleReopenCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTotalDurableHandleReopenCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalDurableHandleReopenCount <em>Total Durable Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Durable Handle Reopen Count</em>' attribute.
	 * @see #getTotalDurableHandleReopenCount()
	 * @generated
	 */
	void setTotalDurableHandleReopenCount(Long value);

	/**
	 * Returns the value of the '<em><b>Total Failed Durable Handle Reopen Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of durable opens on this share that could not be recovered after a temporary network disconnect since the SMB2 File Server Started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Failed Durable Handle Reopen Count</em>' attribute.
	 * @see #setTotalFailedDurableHandleReopenCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TotalFailedDurableHandleReopenCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTotalFailedDurableHandleReopenCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalFailedDurableHandleReopenCount <em>Total Failed Durable Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Failed Durable Handle Reopen Count</em>' attribute.
	 * @see #getTotalFailedDurableHandleReopenCount()
	 * @generated
	 */
	void setTotalFailedDurableHandleReopenCount(Long value);

	/**
	 * Returns the value of the '<em><b>Total Failed Resilient Handle Reopen Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of resilient opens on this share that could not be recovered after a temporary network disconnect since the SMB2 File Server Started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Failed Resilient Handle Reopen Count</em>' attribute.
	 * @see #setTotalFailedResilientHandleReopenCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TotalFailedResilientHandleReopenCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTotalFailedResilientHandleReopenCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalFailedResilientHandleReopenCount <em>Total Failed Resilient Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Failed Resilient Handle Reopen Count</em>' attribute.
	 * @see #getTotalFailedResilientHandleReopenCount()
	 * @generated
	 */
	void setTotalFailedResilientHandleReopenCount(Long value);

	/**
	 * Returns the value of the '<em><b>Current Open File Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of file handles that are currently open in this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Open File Count</em>' attribute.
	 * @see #setCurrentOpenFileCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_CurrentOpenFileCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getCurrentOpenFileCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getCurrentOpenFileCount <em>Current Open File Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Open File Count</em>' attribute.
	 * @see #getCurrentOpenFileCount()
	 * @generated
	 */
	void setCurrentOpenFileCount(Long value);

	/**
	 * Returns the value of the '<em><b>Total Resilient Handle Reopen Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of resilient opens on this share that have been recovered after a temporary network disconnect since the SMB2 File Server started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Resilient Handle Reopen Count</em>' attribute.
	 * @see #setTotalResilientHandleReopenCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TotalResilientHandleReopenCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTotalResilientHandleReopenCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalResilientHandleReopenCount <em>Total Resilient Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Resilient Handle Reopen Count</em>' attribute.
	 * @see #getTotalResilientHandleReopenCount()
	 * @generated
	 */
	void setTotalResilientHandleReopenCount(Long value);

	/**
	 * Returns the value of the '<em><b>Total Persistent Handle Reopen Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of persistent opens on this share that have been recovered after a temporary network disconnect since the SMB2 File Server started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Persistent Handle Reopen Count</em>' attribute.
	 * @see #setTotalPersistentHandleReopenCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TotalPersistentHandleReopenCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTotalPersistentHandleReopenCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalPersistentHandleReopenCount <em>Total Persistent Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Persistent Handle Reopen Count</em>' attribute.
	 * @see #getTotalPersistentHandleReopenCount()
	 * @generated
	 */
	void setTotalPersistentHandleReopenCount(Long value);

	/**
	 * Returns the value of the '<em><b>Total Failed Persistent Handle Reopen Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of persistent opens on this share that could not be recovered after a temporary network disconnect since the SMB2 File Server Started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Failed Persistent Handle Reopen Count</em>' attribute.
	 * @see #setTotalFailedPersistentHandleReopenCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TotalFailedPersistentHandleReopenCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTotalFailedPersistentHandleReopenCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalFailedPersistentHandleReopenCount <em>Total Failed Persistent Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Failed Persistent Handle Reopen Count</em>' attribute.
	 * @see #getTotalFailedPersistentHandleReopenCount()
	 * @generated
	 */
	void setTotalFailedPersistentHandleReopenCount(Long value);

	/**
	 * Returns the value of the '<em><b>Tree Connect Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of tree connects to this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tree Connect Count</em>' attribute.
	 * @see #setTreeConnectCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TreeConnectCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTreeConnectCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTreeConnectCount <em>Tree Connect Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree Connect Count</em>' attribute.
	 * @see #getTreeConnectCount()
	 * @generated
	 */
	void setTreeConnectCount(Long value);

	/**
	 * Returns the value of the '<em><b>Write Requests Processed Per Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Write requests processed/sec related to this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Requests Processed Per Sec</em>' attribute.
	 * @see #setWriteRequestsProcessedPerSec(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_WriteRequestsProcessedPerSec()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getWriteRequestsProcessedPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getWriteRequestsProcessedPerSec <em>Write Requests Processed Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Requests Processed Per Sec</em>' attribute.
	 * @see #getWriteRequestsProcessedPerSec()
	 * @generated
	 */
	void setWriteRequestsProcessedPerSec(Long value);

	/**
	 * Returns the value of the '<em><b>Total Metadata Requests Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of metadata requests received related to this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Metadata Requests Received</em>' attribute.
	 * @see #setTotalMetadataRequestsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_TotalMetadataRequestsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getTotalMetadataRequestsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getTotalMetadataRequestsReceived <em>Total Metadata Requests Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Metadata Requests Received</em>' attribute.
	 * @see #getTotalMetadataRequestsReceived()
	 * @generated
	 */
	void setTotalMetadataRequestsReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Metadata Requests Received Per Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rate, in seconds, at which metadata requests are being sent to this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata Requests Received Per Sec</em>' attribute.
	 * @see #setMetadataRequestsReceivedPerSec(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_MetadataRequestsReceivedPerSec()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getMetadataRequestsReceivedPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getMetadataRequestsReceivedPerSec <em>Metadata Requests Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Requests Received Per Sec</em>' attribute.
	 * @see #getMetadataRequestsReceivedPerSec()
	 * @generated
	 */
	void setMetadataRequestsReceivedPerSec(Long value);

	/**
	 * Returns the value of the '<em><b>Average Time Per Data Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average number of seconds that elapse between the time at which a read or write request to this share is received and the time at which the SMB2 File Server processes the request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Time Per Data Request</em>' attribute.
	 * @see #setAverageTimePerDataRequest(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_AverageTimePerDataRequest()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getAverageTimePerDataRequest();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageTimePerDataRequest <em>Average Time Per Data Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Time Per Data Request</em>' attribute.
	 * @see #getAverageTimePerDataRequest()
	 * @generated
	 */
	void setAverageTimePerDataRequest(Long value);

	/**
	 * Returns the value of the '<em><b>Average Bytes Per Data Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average number of bytes per read or write request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Bytes Per Data Request</em>' attribute.
	 * @see #setAverageBytesPerDataRequest(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_AverageBytesPerDataRequest()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getAverageBytesPerDataRequest();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageBytesPerDataRequest <em>Average Bytes Per Data Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Bytes Per Data Request</em>' attribute.
	 * @see #getAverageBytesPerDataRequest()
	 * @generated
	 */
	void setAverageBytesPerDataRequest(Long value);

	/**
	 * Returns the value of the '<em><b>Average Bytes Per Read Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average number of bytes per read request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Bytes Per Read Request</em>' attribute.
	 * @see #setAverageBytesPerReadRequest(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_AverageBytesPerReadRequest()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getAverageBytesPerReadRequest();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageBytesPerReadRequest <em>Average Bytes Per Read Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Bytes Per Read Request</em>' attribute.
	 * @see #getAverageBytesPerReadRequest()
	 * @generated
	 */
	void setAverageBytesPerReadRequest(Long value);

	/**
	 * Returns the value of the '<em><b>Average Bytes Per Write Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average number of bytes per write request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Bytes Per Write Request</em>' attribute.
	 * @see #setAverageBytesPerWriteRequest(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_AverageBytesPerWriteRequest()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getAverageBytesPerWriteRequest();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageBytesPerWriteRequest <em>Average Bytes Per Write Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Bytes Per Write Request</em>' attribute.
	 * @see #getAverageBytesPerWriteRequest()
	 * @generated
	 */
	void setAverageBytesPerWriteRequest(Long value);

	/**
	 * Returns the value of the '<em><b>Average Read Queue Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average number of read requests that were queued for this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Read Queue Length</em>' attribute.
	 * @see #setAverageReadQueueLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_AverageReadQueueLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getAverageReadQueueLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageReadQueueLength <em>Average Read Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Read Queue Length</em>' attribute.
	 * @see #getAverageReadQueueLength()
	 * @generated
	 */
	void setAverageReadQueueLength(Long value);

	/**
	 * Returns the value of the '<em><b>Average Write Queue Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average number of write requests that were queued for this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Write Queue Length</em>' attribute.
	 * @see #setAverageWriteQueueLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_AverageWriteQueueLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getAverageWriteQueueLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageWriteQueueLength <em>Average Write Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Write Queue Length</em>' attribute.
	 * @see #getAverageWriteQueueLength()
	 * @generated
	 */
	void setAverageWriteQueueLength(Long value);

	/**
	 * Returns the value of the '<em><b>Average Data Queue Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average number of read and write requests that were queued for this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Data Queue Length</em>' attribute.
	 * @see #setAverageDataQueueLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_AverageDataQueueLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getAverageDataQueueLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getAverageDataQueueLength <em>Average Data Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Data Queue Length</em>' attribute.
	 * @see #getAverageDataQueueLength()
	 * @generated
	 */
	void setAverageDataQueueLength(Long value);

	/**
	 * Returns the value of the '<em><b>Data Bytes Per Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rate, in seconds, at which data is being written to or read from this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Bytes Per Sec</em>' attribute.
	 * @see #setDataBytesPerSec(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_DataBytesPerSec()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getDataBytesPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getDataBytesPerSec <em>Data Bytes Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Bytes Per Sec</em>' attribute.
	 * @see #getDataBytesPerSec()
	 * @generated
	 */
	void setDataBytesPerSec(Long value);

	/**
	 * Returns the value of the '<em><b>Data Requests Per Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The rate, in seconds, at which read or write requests are received for this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Requests Per Sec</em>' attribute.
	 * @see #setDataRequestsPerSec(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_DataRequestsPerSec()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getDataRequestsPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getDataRequestsPerSec <em>Data Requests Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Requests Per Sec</em>' attribute.
	 * @see #getDataRequestsPerSec()
	 * @generated
	 */
	void setDataRequestsPerSec(Long value);

	/**
	 * Returns the value of the '<em><b>Current Data Queue Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current number of read or write requests outstanding on this share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Data Queue Length</em>' attribute.
	 * @see #setCurrentDataQueueLength(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticalData_CurrentDataQueueLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true'"
	 * @generated
	 */
	Long getCurrentDataQueueLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticalData#getCurrentDataQueueLength <em>Current Data Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Data Queue Length</em>' attribute.
	 * @see #getCurrentDataQueueLength()
	 * @generated
	 */
	void setCurrentDataQueueLength(Long value);

} // CIM_FileSystemStatisticalData

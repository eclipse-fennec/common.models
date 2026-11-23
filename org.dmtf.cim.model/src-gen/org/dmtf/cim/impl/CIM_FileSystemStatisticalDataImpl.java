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
package org.dmtf.cim.impl;

import org.dmtf.cim.CIM_FileSystemStatisticalData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File System Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getOtherElementTypeDescription <em>Other Element Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTotalIOs <em>Total IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTotalBytesTransferred <em>Total Bytes Transferred</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getReadIOs <em>Read IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getWriteIOs <em>Write IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getOtherIOs <em>Other IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getMetadataReadIOs <em>Metadata Read IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getMetadataWriteIOs <em>Metadata Write IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTotalIOTimeCounter <em>Total IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTotalIdleTimeCounter <em>Total Idle Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getReadIOTimeCounter <em>Read IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getBytesRead <em>Bytes Read</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getWriteIOTimeCounter <em>Write IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getBytesWritten <em>Bytes Written</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getMetadataBytesRead <em>Metadata Bytes Read</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getMetadataBytesWritten <em>Metadata Bytes Written</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getPercentDurableOpens <em>Percent Durable Opens</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getPercentResilientOpens <em>Percent Resilient Opens</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getPercentPersistentOpens <em>Percent Persistent Opens</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getAverageReadResponseTime <em>Average Read Response Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getAverageWriteResponseTime <em>Average Write Response Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getAverageRequestResponseTime <em>Average Request Response Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getBytesReadPerSec <em>Bytes Read Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTotalBytesReceived <em>Total Bytes Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getBytesReceivedPerSec <em>Bytes Received Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTotalBytesSent <em>Total Bytes Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getBytesSentPerSec <em>Bytes Sent Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getBytesTranferredPerSec <em>Bytes Tranferred Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getBytesWrittenPerSec <em>Bytes Written Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getFilesOpenedPerSec <em>Files Opened Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTotalOpenFileCount <em>Total Open File Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getCurrentPendingRequests <em>Current Pending Requests</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getReadRequestsProcessedPerSec <em>Read Requests Processed Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTotalRequestsReceived <em>Total Requests Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getRequestsReceivedPerSec <em>Requests Received Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTotalDurableHandleReopenCount <em>Total Durable Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTotalFailedDurableHandleReopenCount <em>Total Failed Durable Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTotalFailedResilientHandleReopenCount <em>Total Failed Resilient Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getCurrentOpenFileCount <em>Current Open File Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTotalResilientHandleReopenCount <em>Total Resilient Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTotalPersistentHandleReopenCount <em>Total Persistent Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTotalFailedPersistentHandleReopenCount <em>Total Failed Persistent Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTreeConnectCount <em>Tree Connect Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getWriteRequestsProcessedPerSec <em>Write Requests Processed Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getTotalMetadataRequestsReceived <em>Total Metadata Requests Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getMetadataRequestsReceivedPerSec <em>Metadata Requests Received Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getAverageTimePerDataRequest <em>Average Time Per Data Request</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getAverageBytesPerDataRequest <em>Average Bytes Per Data Request</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getAverageBytesPerReadRequest <em>Average Bytes Per Read Request</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getAverageBytesPerWriteRequest <em>Average Bytes Per Write Request</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getAverageReadQueueLength <em>Average Read Queue Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getAverageWriteQueueLength <em>Average Write Queue Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getAverageDataQueueLength <em>Average Data Queue Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getDataBytesPerSec <em>Data Bytes Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getDataRequestsPerSec <em>Data Requests Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticalDataImpl#getCurrentDataQueueLength <em>Current Data Queue Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FileSystemStatisticalDataImpl extends CIM_StatisticalDataImpl implements CIM_FileSystemStatisticalData {
	/**
	 * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ELEMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected Integer elementType = ELEMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherElementTypeDescription() <em>Other Element Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherElementTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ELEMENT_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherElementTypeDescription() <em>Other Element Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherElementTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherElementTypeDescription = OTHER_ELEMENT_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalIOs() <em>Total IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_IOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalIOs() <em>Total IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalIOs()
	 * @generated
	 * @ordered
	 */
	protected Long totalIOs = TOTAL_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalBytesTransferred() <em>Total Bytes Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBytesTransferred()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_BYTES_TRANSFERRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalBytesTransferred() <em>Total Bytes Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBytesTransferred()
	 * @generated
	 * @ordered
	 */
	protected Long totalBytesTransferred = TOTAL_BYTES_TRANSFERRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadIOs() <em>Read IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Long READ_IOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadIOs() <em>Read IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadIOs()
	 * @generated
	 * @ordered
	 */
	protected Long readIOs = READ_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteIOs() <em>Write IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Long WRITE_IOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteIOs() <em>Write IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteIOs()
	 * @generated
	 * @ordered
	 */
	protected Long writeIOs = WRITE_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherIOs() <em>Other IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Long OTHER_IOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherIOs() <em>Other IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIOs()
	 * @generated
	 * @ordered
	 */
	protected Long otherIOs = OTHER_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadataReadIOs() <em>Metadata Read IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataReadIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Long METADATA_READ_IOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadataReadIOs() <em>Metadata Read IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataReadIOs()
	 * @generated
	 * @ordered
	 */
	protected Long metadataReadIOs = METADATA_READ_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadataWriteIOs() <em>Metadata Write IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataWriteIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Long METADATA_WRITE_IOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadataWriteIOs() <em>Metadata Write IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataWriteIOs()
	 * @generated
	 * @ordered
	 */
	protected Long metadataWriteIOs = METADATA_WRITE_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalIOTimeCounter() <em>Total IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_IO_TIME_COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalIOTimeCounter() <em>Total IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Long totalIOTimeCounter = TOTAL_IO_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalIdleTimeCounter() <em>Total Idle Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalIdleTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_IDLE_TIME_COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalIdleTimeCounter() <em>Total Idle Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalIdleTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Long totalIdleTimeCounter = TOTAL_IDLE_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadIOTimeCounter() <em>Read IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Long READ_IO_TIME_COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadIOTimeCounter() <em>Read IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Long readIOTimeCounter = READ_IO_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBytesRead() <em>Bytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesRead()
	 * @generated
	 * @ordered
	 */
	protected static final Long BYTES_READ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBytesRead() <em>Bytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesRead()
	 * @generated
	 * @ordered
	 */
	protected Long bytesRead = BYTES_READ_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteIOTimeCounter() <em>Write IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Long WRITE_IO_TIME_COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteIOTimeCounter() <em>Write IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Long writeIOTimeCounter = WRITE_IO_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBytesWritten() <em>Bytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesWritten()
	 * @generated
	 * @ordered
	 */
	protected static final Long BYTES_WRITTEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBytesWritten() <em>Bytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesWritten()
	 * @generated
	 * @ordered
	 */
	protected Long bytesWritten = BYTES_WRITTEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadataBytesRead() <em>Metadata Bytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataBytesRead()
	 * @generated
	 * @ordered
	 */
	protected static final Long METADATA_BYTES_READ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadataBytesRead() <em>Metadata Bytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataBytesRead()
	 * @generated
	 * @ordered
	 */
	protected Long metadataBytesRead = METADATA_BYTES_READ_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadataBytesWritten() <em>Metadata Bytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataBytesWritten()
	 * @generated
	 * @ordered
	 */
	protected static final Long METADATA_BYTES_WRITTEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadataBytesWritten() <em>Metadata Bytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataBytesWritten()
	 * @generated
	 * @ordered
	 */
	protected Long metadataBytesWritten = METADATA_BYTES_WRITTEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentDurableOpens() <em>Percent Durable Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentDurableOpens()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERCENT_DURABLE_OPENS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentDurableOpens() <em>Percent Durable Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentDurableOpens()
	 * @generated
	 * @ordered
	 */
	protected Integer percentDurableOpens = PERCENT_DURABLE_OPENS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentResilientOpens() <em>Percent Resilient Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentResilientOpens()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERCENT_RESILIENT_OPENS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentResilientOpens() <em>Percent Resilient Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentResilientOpens()
	 * @generated
	 * @ordered
	 */
	protected Integer percentResilientOpens = PERCENT_RESILIENT_OPENS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentPersistentOpens() <em>Percent Persistent Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentPersistentOpens()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PERCENT_PERSISTENT_OPENS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPercentPersistentOpens() <em>Percent Persistent Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentPersistentOpens()
	 * @generated
	 * @ordered
	 */
	protected Integer percentPersistentOpens = PERCENT_PERSISTENT_OPENS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageReadResponseTime() <em>Average Read Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageReadResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AVERAGE_READ_RESPONSE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageReadResponseTime() <em>Average Read Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageReadResponseTime()
	 * @generated
	 * @ordered
	 */
	protected Integer averageReadResponseTime = AVERAGE_READ_RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageWriteResponseTime() <em>Average Write Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageWriteResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AVERAGE_WRITE_RESPONSE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageWriteResponseTime() <em>Average Write Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageWriteResponseTime()
	 * @generated
	 * @ordered
	 */
	protected Integer averageWriteResponseTime = AVERAGE_WRITE_RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageRequestResponseTime() <em>Average Request Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageRequestResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AVERAGE_REQUEST_RESPONSE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageRequestResponseTime() <em>Average Request Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageRequestResponseTime()
	 * @generated
	 * @ordered
	 */
	protected Integer averageRequestResponseTime = AVERAGE_REQUEST_RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBytesReadPerSec() <em>Bytes Read Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesReadPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Long BYTES_READ_PER_SEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBytesReadPerSec() <em>Bytes Read Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesReadPerSec()
	 * @generated
	 * @ordered
	 */
	protected Long bytesReadPerSec = BYTES_READ_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalBytesReceived() <em>Total Bytes Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBytesReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_BYTES_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalBytesReceived() <em>Total Bytes Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBytesReceived()
	 * @generated
	 * @ordered
	 */
	protected Long totalBytesReceived = TOTAL_BYTES_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBytesReceivedPerSec() <em>Bytes Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesReceivedPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Long BYTES_RECEIVED_PER_SEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBytesReceivedPerSec() <em>Bytes Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesReceivedPerSec()
	 * @generated
	 * @ordered
	 */
	protected Long bytesReceivedPerSec = BYTES_RECEIVED_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalBytesSent() <em>Total Bytes Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBytesSent()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_BYTES_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalBytesSent() <em>Total Bytes Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalBytesSent()
	 * @generated
	 * @ordered
	 */
	protected Long totalBytesSent = TOTAL_BYTES_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBytesSentPerSec() <em>Bytes Sent Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesSentPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Long BYTES_SENT_PER_SEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBytesSentPerSec() <em>Bytes Sent Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesSentPerSec()
	 * @generated
	 * @ordered
	 */
	protected Long bytesSentPerSec = BYTES_SENT_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getBytesTranferredPerSec() <em>Bytes Tranferred Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesTranferredPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Long BYTES_TRANFERRED_PER_SEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBytesTranferredPerSec() <em>Bytes Tranferred Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesTranferredPerSec()
	 * @generated
	 * @ordered
	 */
	protected Long bytesTranferredPerSec = BYTES_TRANFERRED_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getBytesWrittenPerSec() <em>Bytes Written Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesWrittenPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Long BYTES_WRITTEN_PER_SEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBytesWrittenPerSec() <em>Bytes Written Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytesWrittenPerSec()
	 * @generated
	 * @ordered
	 */
	protected Long bytesWrittenPerSec = BYTES_WRITTEN_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilesOpenedPerSec() <em>Files Opened Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesOpenedPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Long FILES_OPENED_PER_SEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilesOpenedPerSec() <em>Files Opened Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesOpenedPerSec()
	 * @generated
	 * @ordered
	 */
	protected Long filesOpenedPerSec = FILES_OPENED_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalOpenFileCount() <em>Total Open File Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalOpenFileCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_OPEN_FILE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalOpenFileCount() <em>Total Open File Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalOpenFileCount()
	 * @generated
	 * @ordered
	 */
	protected Long totalOpenFileCount = TOTAL_OPEN_FILE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentPendingRequests() <em>Current Pending Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPendingRequests()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_PENDING_REQUESTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentPendingRequests() <em>Current Pending Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPendingRequests()
	 * @generated
	 * @ordered
	 */
	protected Long currentPendingRequests = CURRENT_PENDING_REQUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadRequestsProcessedPerSec() <em>Read Requests Processed Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadRequestsProcessedPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Long READ_REQUESTS_PROCESSED_PER_SEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadRequestsProcessedPerSec() <em>Read Requests Processed Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadRequestsProcessedPerSec()
	 * @generated
	 * @ordered
	 */
	protected Long readRequestsProcessedPerSec = READ_REQUESTS_PROCESSED_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalRequestsReceived() <em>Total Requests Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRequestsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_REQUESTS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalRequestsReceived() <em>Total Requests Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalRequestsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long totalRequestsReceived = TOTAL_REQUESTS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestsReceivedPerSec() <em>Requests Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestsReceivedPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Long REQUESTS_RECEIVED_PER_SEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestsReceivedPerSec() <em>Requests Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestsReceivedPerSec()
	 * @generated
	 * @ordered
	 */
	protected Long requestsReceivedPerSec = REQUESTS_RECEIVED_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalDurableHandleReopenCount() <em>Total Durable Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDurableHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalDurableHandleReopenCount() <em>Total Durable Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDurableHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected Long totalDurableHandleReopenCount = TOTAL_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalFailedDurableHandleReopenCount() <em>Total Failed Durable Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFailedDurableHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalFailedDurableHandleReopenCount() <em>Total Failed Durable Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFailedDurableHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected Long totalFailedDurableHandleReopenCount = TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalFailedResilientHandleReopenCount() <em>Total Failed Resilient Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFailedResilientHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalFailedResilientHandleReopenCount() <em>Total Failed Resilient Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFailedResilientHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected Long totalFailedResilientHandleReopenCount = TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentOpenFileCount() <em>Current Open File Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentOpenFileCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_OPEN_FILE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentOpenFileCount() <em>Current Open File Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentOpenFileCount()
	 * @generated
	 * @ordered
	 */
	protected Long currentOpenFileCount = CURRENT_OPEN_FILE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalResilientHandleReopenCount() <em>Total Resilient Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalResilientHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalResilientHandleReopenCount() <em>Total Resilient Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalResilientHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected Long totalResilientHandleReopenCount = TOTAL_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalPersistentHandleReopenCount() <em>Total Persistent Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPersistentHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalPersistentHandleReopenCount() <em>Total Persistent Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalPersistentHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected Long totalPersistentHandleReopenCount = TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalFailedPersistentHandleReopenCount() <em>Total Failed Persistent Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFailedPersistentHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalFailedPersistentHandleReopenCount() <em>Total Failed Persistent Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalFailedPersistentHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected Long totalFailedPersistentHandleReopenCount = TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTreeConnectCount() <em>Tree Connect Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeConnectCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long TREE_CONNECT_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreeConnectCount() <em>Tree Connect Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeConnectCount()
	 * @generated
	 * @ordered
	 */
	protected Long treeConnectCount = TREE_CONNECT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteRequestsProcessedPerSec() <em>Write Requests Processed Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteRequestsProcessedPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Long WRITE_REQUESTS_PROCESSED_PER_SEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteRequestsProcessedPerSec() <em>Write Requests Processed Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteRequestsProcessedPerSec()
	 * @generated
	 * @ordered
	 */
	protected Long writeRequestsProcessedPerSec = WRITE_REQUESTS_PROCESSED_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalMetadataRequestsReceived() <em>Total Metadata Requests Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMetadataRequestsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_METADATA_REQUESTS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalMetadataRequestsReceived() <em>Total Metadata Requests Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalMetadataRequestsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long totalMetadataRequestsReceived = TOTAL_METADATA_REQUESTS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMetadataRequestsReceivedPerSec() <em>Metadata Requests Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataRequestsReceivedPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Long METADATA_REQUESTS_RECEIVED_PER_SEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetadataRequestsReceivedPerSec() <em>Metadata Requests Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataRequestsReceivedPerSec()
	 * @generated
	 * @ordered
	 */
	protected Long metadataRequestsReceivedPerSec = METADATA_REQUESTS_RECEIVED_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageTimePerDataRequest() <em>Average Time Per Data Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageTimePerDataRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVERAGE_TIME_PER_DATA_REQUEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageTimePerDataRequest() <em>Average Time Per Data Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageTimePerDataRequest()
	 * @generated
	 * @ordered
	 */
	protected Long averageTimePerDataRequest = AVERAGE_TIME_PER_DATA_REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageBytesPerDataRequest() <em>Average Bytes Per Data Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageBytesPerDataRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVERAGE_BYTES_PER_DATA_REQUEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageBytesPerDataRequest() <em>Average Bytes Per Data Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageBytesPerDataRequest()
	 * @generated
	 * @ordered
	 */
	protected Long averageBytesPerDataRequest = AVERAGE_BYTES_PER_DATA_REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageBytesPerReadRequest() <em>Average Bytes Per Read Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageBytesPerReadRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVERAGE_BYTES_PER_READ_REQUEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageBytesPerReadRequest() <em>Average Bytes Per Read Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageBytesPerReadRequest()
	 * @generated
	 * @ordered
	 */
	protected Long averageBytesPerReadRequest = AVERAGE_BYTES_PER_READ_REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageBytesPerWriteRequest() <em>Average Bytes Per Write Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageBytesPerWriteRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVERAGE_BYTES_PER_WRITE_REQUEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageBytesPerWriteRequest() <em>Average Bytes Per Write Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageBytesPerWriteRequest()
	 * @generated
	 * @ordered
	 */
	protected Long averageBytesPerWriteRequest = AVERAGE_BYTES_PER_WRITE_REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageReadQueueLength() <em>Average Read Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageReadQueueLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVERAGE_READ_QUEUE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageReadQueueLength() <em>Average Read Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageReadQueueLength()
	 * @generated
	 * @ordered
	 */
	protected Long averageReadQueueLength = AVERAGE_READ_QUEUE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageWriteQueueLength() <em>Average Write Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageWriteQueueLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVERAGE_WRITE_QUEUE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageWriteQueueLength() <em>Average Write Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageWriteQueueLength()
	 * @generated
	 * @ordered
	 */
	protected Long averageWriteQueueLength = AVERAGE_WRITE_QUEUE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageDataQueueLength() <em>Average Data Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageDataQueueLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long AVERAGE_DATA_QUEUE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageDataQueueLength() <em>Average Data Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageDataQueueLength()
	 * @generated
	 * @ordered
	 */
	protected Long averageDataQueueLength = AVERAGE_DATA_QUEUE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataBytesPerSec() <em>Data Bytes Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBytesPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Long DATA_BYTES_PER_SEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataBytesPerSec() <em>Data Bytes Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBytesPerSec()
	 * @generated
	 * @ordered
	 */
	protected Long dataBytesPerSec = DATA_BYTES_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataRequestsPerSec() <em>Data Requests Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRequestsPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Long DATA_REQUESTS_PER_SEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataRequestsPerSec() <em>Data Requests Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRequestsPerSec()
	 * @generated
	 * @ordered
	 */
	protected Long dataRequestsPerSec = DATA_REQUESTS_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentDataQueueLength() <em>Current Data Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDataQueueLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_DATA_QUEUE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentDataQueueLength() <em>Current Data Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentDataQueueLength()
	 * @generated
	 * @ordered
	 */
	protected Long currentDataQueueLength = CURRENT_DATA_QUEUE_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileSystemStatisticalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileSystemStatisticalData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementType(Integer newElementType) {
		Integer oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherElementTypeDescription() {
		return otherElementTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherElementTypeDescription(String newOtherElementTypeDescription) {
		String oldOtherElementTypeDescription = otherElementTypeDescription;
		otherElementTypeDescription = newOtherElementTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__OTHER_ELEMENT_TYPE_DESCRIPTION, oldOtherElementTypeDescription, otherElementTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalIOs() {
		return totalIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalIOs(Long newTotalIOs) {
		Long oldTotalIOs = totalIOs;
		totalIOs = newTotalIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_IOS, oldTotalIOs, totalIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalBytesTransferred() {
		return totalBytesTransferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalBytesTransferred(Long newTotalBytesTransferred) {
		Long oldTotalBytesTransferred = totalBytesTransferred;
		totalBytesTransferred = newTotalBytesTransferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_BYTES_TRANSFERRED, oldTotalBytesTransferred, totalBytesTransferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReadIOs() {
		return readIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadIOs(Long newReadIOs) {
		Long oldReadIOs = readIOs;
		readIOs = newReadIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__READ_IOS, oldReadIOs, readIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWriteIOs() {
		return writeIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteIOs(Long newWriteIOs) {
		Long oldWriteIOs = writeIOs;
		writeIOs = newWriteIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__WRITE_IOS, oldWriteIOs, writeIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getOtherIOs() {
		return otherIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherIOs(Long newOtherIOs) {
		Long oldOtherIOs = otherIOs;
		otherIOs = newOtherIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__OTHER_IOS, oldOtherIOs, otherIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMetadataReadIOs() {
		return metadataReadIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadataReadIOs(Long newMetadataReadIOs) {
		Long oldMetadataReadIOs = metadataReadIOs;
		metadataReadIOs = newMetadataReadIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_READ_IOS, oldMetadataReadIOs, metadataReadIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMetadataWriteIOs() {
		return metadataWriteIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadataWriteIOs(Long newMetadataWriteIOs) {
		Long oldMetadataWriteIOs = metadataWriteIOs;
		metadataWriteIOs = newMetadataWriteIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_WRITE_IOS, oldMetadataWriteIOs, metadataWriteIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalIOTimeCounter() {
		return totalIOTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalIOTimeCounter(Long newTotalIOTimeCounter) {
		Long oldTotalIOTimeCounter = totalIOTimeCounter;
		totalIOTimeCounter = newTotalIOTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_IO_TIME_COUNTER, oldTotalIOTimeCounter, totalIOTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalIdleTimeCounter() {
		return totalIdleTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalIdleTimeCounter(Long newTotalIdleTimeCounter) {
		Long oldTotalIdleTimeCounter = totalIdleTimeCounter;
		totalIdleTimeCounter = newTotalIdleTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_IDLE_TIME_COUNTER, oldTotalIdleTimeCounter, totalIdleTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReadIOTimeCounter() {
		return readIOTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadIOTimeCounter(Long newReadIOTimeCounter) {
		Long oldReadIOTimeCounter = readIOTimeCounter;
		readIOTimeCounter = newReadIOTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__READ_IO_TIME_COUNTER, oldReadIOTimeCounter, readIOTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBytesRead() {
		return bytesRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBytesRead(Long newBytesRead) {
		Long oldBytesRead = bytesRead;
		bytesRead = newBytesRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_READ, oldBytesRead, bytesRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWriteIOTimeCounter() {
		return writeIOTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteIOTimeCounter(Long newWriteIOTimeCounter) {
		Long oldWriteIOTimeCounter = writeIOTimeCounter;
		writeIOTimeCounter = newWriteIOTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__WRITE_IO_TIME_COUNTER, oldWriteIOTimeCounter, writeIOTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBytesWritten() {
		return bytesWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBytesWritten(Long newBytesWritten) {
		Long oldBytesWritten = bytesWritten;
		bytesWritten = newBytesWritten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_WRITTEN, oldBytesWritten, bytesWritten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMetadataBytesRead() {
		return metadataBytesRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadataBytesRead(Long newMetadataBytesRead) {
		Long oldMetadataBytesRead = metadataBytesRead;
		metadataBytesRead = newMetadataBytesRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_BYTES_READ, oldMetadataBytesRead, metadataBytesRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMetadataBytesWritten() {
		return metadataBytesWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadataBytesWritten(Long newMetadataBytesWritten) {
		Long oldMetadataBytesWritten = metadataBytesWritten;
		metadataBytesWritten = newMetadataBytesWritten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_BYTES_WRITTEN, oldMetadataBytesWritten, metadataBytesWritten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPercentDurableOpens() {
		return percentDurableOpens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentDurableOpens(Integer newPercentDurableOpens) {
		Integer oldPercentDurableOpens = percentDurableOpens;
		percentDurableOpens = newPercentDurableOpens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__PERCENT_DURABLE_OPENS, oldPercentDurableOpens, percentDurableOpens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPercentResilientOpens() {
		return percentResilientOpens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentResilientOpens(Integer newPercentResilientOpens) {
		Integer oldPercentResilientOpens = percentResilientOpens;
		percentResilientOpens = newPercentResilientOpens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__PERCENT_RESILIENT_OPENS, oldPercentResilientOpens, percentResilientOpens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPercentPersistentOpens() {
		return percentPersistentOpens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentPersistentOpens(Integer newPercentPersistentOpens) {
		Integer oldPercentPersistentOpens = percentPersistentOpens;
		percentPersistentOpens = newPercentPersistentOpens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__PERCENT_PERSISTENT_OPENS, oldPercentPersistentOpens, percentPersistentOpens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAverageReadResponseTime() {
		return averageReadResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageReadResponseTime(Integer newAverageReadResponseTime) {
		Integer oldAverageReadResponseTime = averageReadResponseTime;
		averageReadResponseTime = newAverageReadResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_READ_RESPONSE_TIME, oldAverageReadResponseTime, averageReadResponseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAverageWriteResponseTime() {
		return averageWriteResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageWriteResponseTime(Integer newAverageWriteResponseTime) {
		Integer oldAverageWriteResponseTime = averageWriteResponseTime;
		averageWriteResponseTime = newAverageWriteResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_WRITE_RESPONSE_TIME, oldAverageWriteResponseTime, averageWriteResponseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAverageRequestResponseTime() {
		return averageRequestResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageRequestResponseTime(Integer newAverageRequestResponseTime) {
		Integer oldAverageRequestResponseTime = averageRequestResponseTime;
		averageRequestResponseTime = newAverageRequestResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_REQUEST_RESPONSE_TIME, oldAverageRequestResponseTime, averageRequestResponseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBytesReadPerSec() {
		return bytesReadPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBytesReadPerSec(Long newBytesReadPerSec) {
		Long oldBytesReadPerSec = bytesReadPerSec;
		bytesReadPerSec = newBytesReadPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_READ_PER_SEC, oldBytesReadPerSec, bytesReadPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalBytesReceived() {
		return totalBytesReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalBytesReceived(Long newTotalBytesReceived) {
		Long oldTotalBytesReceived = totalBytesReceived;
		totalBytesReceived = newTotalBytesReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_BYTES_RECEIVED, oldTotalBytesReceived, totalBytesReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBytesReceivedPerSec() {
		return bytesReceivedPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBytesReceivedPerSec(Long newBytesReceivedPerSec) {
		Long oldBytesReceivedPerSec = bytesReceivedPerSec;
		bytesReceivedPerSec = newBytesReceivedPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_RECEIVED_PER_SEC, oldBytesReceivedPerSec, bytesReceivedPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalBytesSent() {
		return totalBytesSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalBytesSent(Long newTotalBytesSent) {
		Long oldTotalBytesSent = totalBytesSent;
		totalBytesSent = newTotalBytesSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_BYTES_SENT, oldTotalBytesSent, totalBytesSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBytesSentPerSec() {
		return bytesSentPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBytesSentPerSec(Long newBytesSentPerSec) {
		Long oldBytesSentPerSec = bytesSentPerSec;
		bytesSentPerSec = newBytesSentPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_SENT_PER_SEC, oldBytesSentPerSec, bytesSentPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBytesTranferredPerSec() {
		return bytesTranferredPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBytesTranferredPerSec(Long newBytesTranferredPerSec) {
		Long oldBytesTranferredPerSec = bytesTranferredPerSec;
		bytesTranferredPerSec = newBytesTranferredPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_TRANFERRED_PER_SEC, oldBytesTranferredPerSec, bytesTranferredPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBytesWrittenPerSec() {
		return bytesWrittenPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBytesWrittenPerSec(Long newBytesWrittenPerSec) {
		Long oldBytesWrittenPerSec = bytesWrittenPerSec;
		bytesWrittenPerSec = newBytesWrittenPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_WRITTEN_PER_SEC, oldBytesWrittenPerSec, bytesWrittenPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFilesOpenedPerSec() {
		return filesOpenedPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilesOpenedPerSec(Long newFilesOpenedPerSec) {
		Long oldFilesOpenedPerSec = filesOpenedPerSec;
		filesOpenedPerSec = newFilesOpenedPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__FILES_OPENED_PER_SEC, oldFilesOpenedPerSec, filesOpenedPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalOpenFileCount() {
		return totalOpenFileCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalOpenFileCount(Long newTotalOpenFileCount) {
		Long oldTotalOpenFileCount = totalOpenFileCount;
		totalOpenFileCount = newTotalOpenFileCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_OPEN_FILE_COUNT, oldTotalOpenFileCount, totalOpenFileCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentPendingRequests() {
		return currentPendingRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentPendingRequests(Long newCurrentPendingRequests) {
		Long oldCurrentPendingRequests = currentPendingRequests;
		currentPendingRequests = newCurrentPendingRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__CURRENT_PENDING_REQUESTS, oldCurrentPendingRequests, currentPendingRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReadRequestsProcessedPerSec() {
		return readRequestsProcessedPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadRequestsProcessedPerSec(Long newReadRequestsProcessedPerSec) {
		Long oldReadRequestsProcessedPerSec = readRequestsProcessedPerSec;
		readRequestsProcessedPerSec = newReadRequestsProcessedPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__READ_REQUESTS_PROCESSED_PER_SEC, oldReadRequestsProcessedPerSec, readRequestsProcessedPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalRequestsReceived() {
		return totalRequestsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalRequestsReceived(Long newTotalRequestsReceived) {
		Long oldTotalRequestsReceived = totalRequestsReceived;
		totalRequestsReceived = newTotalRequestsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_REQUESTS_RECEIVED, oldTotalRequestsReceived, totalRequestsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRequestsReceivedPerSec() {
		return requestsReceivedPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestsReceivedPerSec(Long newRequestsReceivedPerSec) {
		Long oldRequestsReceivedPerSec = requestsReceivedPerSec;
		requestsReceivedPerSec = newRequestsReceivedPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__REQUESTS_RECEIVED_PER_SEC, oldRequestsReceivedPerSec, requestsReceivedPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalDurableHandleReopenCount() {
		return totalDurableHandleReopenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalDurableHandleReopenCount(Long newTotalDurableHandleReopenCount) {
		Long oldTotalDurableHandleReopenCount = totalDurableHandleReopenCount;
		totalDurableHandleReopenCount = newTotalDurableHandleReopenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_DURABLE_HANDLE_REOPEN_COUNT, oldTotalDurableHandleReopenCount, totalDurableHandleReopenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalFailedDurableHandleReopenCount() {
		return totalFailedDurableHandleReopenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalFailedDurableHandleReopenCount(Long newTotalFailedDurableHandleReopenCount) {
		Long oldTotalFailedDurableHandleReopenCount = totalFailedDurableHandleReopenCount;
		totalFailedDurableHandleReopenCount = newTotalFailedDurableHandleReopenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT, oldTotalFailedDurableHandleReopenCount, totalFailedDurableHandleReopenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalFailedResilientHandleReopenCount() {
		return totalFailedResilientHandleReopenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalFailedResilientHandleReopenCount(Long newTotalFailedResilientHandleReopenCount) {
		Long oldTotalFailedResilientHandleReopenCount = totalFailedResilientHandleReopenCount;
		totalFailedResilientHandleReopenCount = newTotalFailedResilientHandleReopenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT, oldTotalFailedResilientHandleReopenCount, totalFailedResilientHandleReopenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentOpenFileCount() {
		return currentOpenFileCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentOpenFileCount(Long newCurrentOpenFileCount) {
		Long oldCurrentOpenFileCount = currentOpenFileCount;
		currentOpenFileCount = newCurrentOpenFileCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__CURRENT_OPEN_FILE_COUNT, oldCurrentOpenFileCount, currentOpenFileCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalResilientHandleReopenCount() {
		return totalResilientHandleReopenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalResilientHandleReopenCount(Long newTotalResilientHandleReopenCount) {
		Long oldTotalResilientHandleReopenCount = totalResilientHandleReopenCount;
		totalResilientHandleReopenCount = newTotalResilientHandleReopenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_RESILIENT_HANDLE_REOPEN_COUNT, oldTotalResilientHandleReopenCount, totalResilientHandleReopenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalPersistentHandleReopenCount() {
		return totalPersistentHandleReopenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalPersistentHandleReopenCount(Long newTotalPersistentHandleReopenCount) {
		Long oldTotalPersistentHandleReopenCount = totalPersistentHandleReopenCount;
		totalPersistentHandleReopenCount = newTotalPersistentHandleReopenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT, oldTotalPersistentHandleReopenCount, totalPersistentHandleReopenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalFailedPersistentHandleReopenCount() {
		return totalFailedPersistentHandleReopenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalFailedPersistentHandleReopenCount(Long newTotalFailedPersistentHandleReopenCount) {
		Long oldTotalFailedPersistentHandleReopenCount = totalFailedPersistentHandleReopenCount;
		totalFailedPersistentHandleReopenCount = newTotalFailedPersistentHandleReopenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT, oldTotalFailedPersistentHandleReopenCount, totalFailedPersistentHandleReopenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTreeConnectCount() {
		return treeConnectCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTreeConnectCount(Long newTreeConnectCount) {
		Long oldTreeConnectCount = treeConnectCount;
		treeConnectCount = newTreeConnectCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TREE_CONNECT_COUNT, oldTreeConnectCount, treeConnectCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWriteRequestsProcessedPerSec() {
		return writeRequestsProcessedPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteRequestsProcessedPerSec(Long newWriteRequestsProcessedPerSec) {
		Long oldWriteRequestsProcessedPerSec = writeRequestsProcessedPerSec;
		writeRequestsProcessedPerSec = newWriteRequestsProcessedPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__WRITE_REQUESTS_PROCESSED_PER_SEC, oldWriteRequestsProcessedPerSec, writeRequestsProcessedPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalMetadataRequestsReceived() {
		return totalMetadataRequestsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalMetadataRequestsReceived(Long newTotalMetadataRequestsReceived) {
		Long oldTotalMetadataRequestsReceived = totalMetadataRequestsReceived;
		totalMetadataRequestsReceived = newTotalMetadataRequestsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_METADATA_REQUESTS_RECEIVED, oldTotalMetadataRequestsReceived, totalMetadataRequestsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMetadataRequestsReceivedPerSec() {
		return metadataRequestsReceivedPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadataRequestsReceivedPerSec(Long newMetadataRequestsReceivedPerSec) {
		Long oldMetadataRequestsReceivedPerSec = metadataRequestsReceivedPerSec;
		metadataRequestsReceivedPerSec = newMetadataRequestsReceivedPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_REQUESTS_RECEIVED_PER_SEC, oldMetadataRequestsReceivedPerSec, metadataRequestsReceivedPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAverageTimePerDataRequest() {
		return averageTimePerDataRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageTimePerDataRequest(Long newAverageTimePerDataRequest) {
		Long oldAverageTimePerDataRequest = averageTimePerDataRequest;
		averageTimePerDataRequest = newAverageTimePerDataRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_TIME_PER_DATA_REQUEST, oldAverageTimePerDataRequest, averageTimePerDataRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAverageBytesPerDataRequest() {
		return averageBytesPerDataRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageBytesPerDataRequest(Long newAverageBytesPerDataRequest) {
		Long oldAverageBytesPerDataRequest = averageBytesPerDataRequest;
		averageBytesPerDataRequest = newAverageBytesPerDataRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_BYTES_PER_DATA_REQUEST, oldAverageBytesPerDataRequest, averageBytesPerDataRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAverageBytesPerReadRequest() {
		return averageBytesPerReadRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageBytesPerReadRequest(Long newAverageBytesPerReadRequest) {
		Long oldAverageBytesPerReadRequest = averageBytesPerReadRequest;
		averageBytesPerReadRequest = newAverageBytesPerReadRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_BYTES_PER_READ_REQUEST, oldAverageBytesPerReadRequest, averageBytesPerReadRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAverageBytesPerWriteRequest() {
		return averageBytesPerWriteRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageBytesPerWriteRequest(Long newAverageBytesPerWriteRequest) {
		Long oldAverageBytesPerWriteRequest = averageBytesPerWriteRequest;
		averageBytesPerWriteRequest = newAverageBytesPerWriteRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_BYTES_PER_WRITE_REQUEST, oldAverageBytesPerWriteRequest, averageBytesPerWriteRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAverageReadQueueLength() {
		return averageReadQueueLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageReadQueueLength(Long newAverageReadQueueLength) {
		Long oldAverageReadQueueLength = averageReadQueueLength;
		averageReadQueueLength = newAverageReadQueueLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_READ_QUEUE_LENGTH, oldAverageReadQueueLength, averageReadQueueLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAverageWriteQueueLength() {
		return averageWriteQueueLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageWriteQueueLength(Long newAverageWriteQueueLength) {
		Long oldAverageWriteQueueLength = averageWriteQueueLength;
		averageWriteQueueLength = newAverageWriteQueueLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_WRITE_QUEUE_LENGTH, oldAverageWriteQueueLength, averageWriteQueueLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAverageDataQueueLength() {
		return averageDataQueueLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAverageDataQueueLength(Long newAverageDataQueueLength) {
		Long oldAverageDataQueueLength = averageDataQueueLength;
		averageDataQueueLength = newAverageDataQueueLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_DATA_QUEUE_LENGTH, oldAverageDataQueueLength, averageDataQueueLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDataBytesPerSec() {
		return dataBytesPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataBytesPerSec(Long newDataBytesPerSec) {
		Long oldDataBytesPerSec = dataBytesPerSec;
		dataBytesPerSec = newDataBytesPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__DATA_BYTES_PER_SEC, oldDataBytesPerSec, dataBytesPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDataRequestsPerSec() {
		return dataRequestsPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataRequestsPerSec(Long newDataRequestsPerSec) {
		Long oldDataRequestsPerSec = dataRequestsPerSec;
		dataRequestsPerSec = newDataRequestsPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__DATA_REQUESTS_PER_SEC, oldDataRequestsPerSec, dataRequestsPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentDataQueueLength() {
		return currentDataQueueLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentDataQueueLength(Long newCurrentDataQueueLength) {
		Long oldCurrentDataQueueLength = currentDataQueueLength;
		currentDataQueueLength = newCurrentDataQueueLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__CURRENT_DATA_QUEUE_LENGTH, oldCurrentDataQueueLength, currentDataQueueLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__ELEMENT_TYPE:
				return getElementType();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__OTHER_ELEMENT_TYPE_DESCRIPTION:
				return getOtherElementTypeDescription();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_IOS:
				return getTotalIOs();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_BYTES_TRANSFERRED:
				return getTotalBytesTransferred();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__READ_IOS:
				return getReadIOs();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__WRITE_IOS:
				return getWriteIOs();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__OTHER_IOS:
				return getOtherIOs();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_READ_IOS:
				return getMetadataReadIOs();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_WRITE_IOS:
				return getMetadataWriteIOs();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_IO_TIME_COUNTER:
				return getTotalIOTimeCounter();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_IDLE_TIME_COUNTER:
				return getTotalIdleTimeCounter();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__READ_IO_TIME_COUNTER:
				return getReadIOTimeCounter();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_READ:
				return getBytesRead();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__WRITE_IO_TIME_COUNTER:
				return getWriteIOTimeCounter();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_WRITTEN:
				return getBytesWritten();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_BYTES_READ:
				return getMetadataBytesRead();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_BYTES_WRITTEN:
				return getMetadataBytesWritten();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__PERCENT_DURABLE_OPENS:
				return getPercentDurableOpens();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__PERCENT_RESILIENT_OPENS:
				return getPercentResilientOpens();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__PERCENT_PERSISTENT_OPENS:
				return getPercentPersistentOpens();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_READ_RESPONSE_TIME:
				return getAverageReadResponseTime();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_WRITE_RESPONSE_TIME:
				return getAverageWriteResponseTime();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_REQUEST_RESPONSE_TIME:
				return getAverageRequestResponseTime();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_READ_PER_SEC:
				return getBytesReadPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_BYTES_RECEIVED:
				return getTotalBytesReceived();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_RECEIVED_PER_SEC:
				return getBytesReceivedPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_BYTES_SENT:
				return getTotalBytesSent();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_SENT_PER_SEC:
				return getBytesSentPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_TRANFERRED_PER_SEC:
				return getBytesTranferredPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_WRITTEN_PER_SEC:
				return getBytesWrittenPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__FILES_OPENED_PER_SEC:
				return getFilesOpenedPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_OPEN_FILE_COUNT:
				return getTotalOpenFileCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__CURRENT_PENDING_REQUESTS:
				return getCurrentPendingRequests();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__READ_REQUESTS_PROCESSED_PER_SEC:
				return getReadRequestsProcessedPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_REQUESTS_RECEIVED:
				return getTotalRequestsReceived();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__REQUESTS_RECEIVED_PER_SEC:
				return getRequestsReceivedPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_DURABLE_HANDLE_REOPEN_COUNT:
				return getTotalDurableHandleReopenCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT:
				return getTotalFailedDurableHandleReopenCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT:
				return getTotalFailedResilientHandleReopenCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__CURRENT_OPEN_FILE_COUNT:
				return getCurrentOpenFileCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_RESILIENT_HANDLE_REOPEN_COUNT:
				return getTotalResilientHandleReopenCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT:
				return getTotalPersistentHandleReopenCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT:
				return getTotalFailedPersistentHandleReopenCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TREE_CONNECT_COUNT:
				return getTreeConnectCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__WRITE_REQUESTS_PROCESSED_PER_SEC:
				return getWriteRequestsProcessedPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_METADATA_REQUESTS_RECEIVED:
				return getTotalMetadataRequestsReceived();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_REQUESTS_RECEIVED_PER_SEC:
				return getMetadataRequestsReceivedPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_TIME_PER_DATA_REQUEST:
				return getAverageTimePerDataRequest();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_BYTES_PER_DATA_REQUEST:
				return getAverageBytesPerDataRequest();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_BYTES_PER_READ_REQUEST:
				return getAverageBytesPerReadRequest();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_BYTES_PER_WRITE_REQUEST:
				return getAverageBytesPerWriteRequest();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_READ_QUEUE_LENGTH:
				return getAverageReadQueueLength();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_WRITE_QUEUE_LENGTH:
				return getAverageWriteQueueLength();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_DATA_QUEUE_LENGTH:
				return getAverageDataQueueLength();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__DATA_BYTES_PER_SEC:
				return getDataBytesPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__DATA_REQUESTS_PER_SEC:
				return getDataRequestsPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__CURRENT_DATA_QUEUE_LENGTH:
				return getCurrentDataQueueLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__ELEMENT_TYPE:
				setElementType((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__OTHER_ELEMENT_TYPE_DESCRIPTION:
				setOtherElementTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_IOS:
				setTotalIOs((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_BYTES_TRANSFERRED:
				setTotalBytesTransferred((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__READ_IOS:
				setReadIOs((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__WRITE_IOS:
				setWriteIOs((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__OTHER_IOS:
				setOtherIOs((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_READ_IOS:
				setMetadataReadIOs((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_WRITE_IOS:
				setMetadataWriteIOs((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_IO_TIME_COUNTER:
				setTotalIOTimeCounter((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_IDLE_TIME_COUNTER:
				setTotalIdleTimeCounter((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__READ_IO_TIME_COUNTER:
				setReadIOTimeCounter((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_READ:
				setBytesRead((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__WRITE_IO_TIME_COUNTER:
				setWriteIOTimeCounter((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_WRITTEN:
				setBytesWritten((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_BYTES_READ:
				setMetadataBytesRead((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_BYTES_WRITTEN:
				setMetadataBytesWritten((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__PERCENT_DURABLE_OPENS:
				setPercentDurableOpens((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__PERCENT_RESILIENT_OPENS:
				setPercentResilientOpens((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__PERCENT_PERSISTENT_OPENS:
				setPercentPersistentOpens((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_READ_RESPONSE_TIME:
				setAverageReadResponseTime((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_WRITE_RESPONSE_TIME:
				setAverageWriteResponseTime((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_REQUEST_RESPONSE_TIME:
				setAverageRequestResponseTime((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_READ_PER_SEC:
				setBytesReadPerSec((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_BYTES_RECEIVED:
				setTotalBytesReceived((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_RECEIVED_PER_SEC:
				setBytesReceivedPerSec((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_BYTES_SENT:
				setTotalBytesSent((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_SENT_PER_SEC:
				setBytesSentPerSec((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_TRANFERRED_PER_SEC:
				setBytesTranferredPerSec((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_WRITTEN_PER_SEC:
				setBytesWrittenPerSec((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__FILES_OPENED_PER_SEC:
				setFilesOpenedPerSec((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_OPEN_FILE_COUNT:
				setTotalOpenFileCount((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__CURRENT_PENDING_REQUESTS:
				setCurrentPendingRequests((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__READ_REQUESTS_PROCESSED_PER_SEC:
				setReadRequestsProcessedPerSec((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_REQUESTS_RECEIVED:
				setTotalRequestsReceived((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__REQUESTS_RECEIVED_PER_SEC:
				setRequestsReceivedPerSec((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_DURABLE_HANDLE_REOPEN_COUNT:
				setTotalDurableHandleReopenCount((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT:
				setTotalFailedDurableHandleReopenCount((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT:
				setTotalFailedResilientHandleReopenCount((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__CURRENT_OPEN_FILE_COUNT:
				setCurrentOpenFileCount((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_RESILIENT_HANDLE_REOPEN_COUNT:
				setTotalResilientHandleReopenCount((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT:
				setTotalPersistentHandleReopenCount((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT:
				setTotalFailedPersistentHandleReopenCount((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TREE_CONNECT_COUNT:
				setTreeConnectCount((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__WRITE_REQUESTS_PROCESSED_PER_SEC:
				setWriteRequestsProcessedPerSec((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_METADATA_REQUESTS_RECEIVED:
				setTotalMetadataRequestsReceived((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_REQUESTS_RECEIVED_PER_SEC:
				setMetadataRequestsReceivedPerSec((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_TIME_PER_DATA_REQUEST:
				setAverageTimePerDataRequest((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_BYTES_PER_DATA_REQUEST:
				setAverageBytesPerDataRequest((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_BYTES_PER_READ_REQUEST:
				setAverageBytesPerReadRequest((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_BYTES_PER_WRITE_REQUEST:
				setAverageBytesPerWriteRequest((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_READ_QUEUE_LENGTH:
				setAverageReadQueueLength((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_WRITE_QUEUE_LENGTH:
				setAverageWriteQueueLength((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_DATA_QUEUE_LENGTH:
				setAverageDataQueueLength((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__DATA_BYTES_PER_SEC:
				setDataBytesPerSec((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__DATA_REQUESTS_PER_SEC:
				setDataRequestsPerSec((Long)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__CURRENT_DATA_QUEUE_LENGTH:
				setCurrentDataQueueLength((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__ELEMENT_TYPE:
				setElementType(ELEMENT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__OTHER_ELEMENT_TYPE_DESCRIPTION:
				setOtherElementTypeDescription(OTHER_ELEMENT_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_IOS:
				setTotalIOs(TOTAL_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_BYTES_TRANSFERRED:
				setTotalBytesTransferred(TOTAL_BYTES_TRANSFERRED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__READ_IOS:
				setReadIOs(READ_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__WRITE_IOS:
				setWriteIOs(WRITE_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__OTHER_IOS:
				setOtherIOs(OTHER_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_READ_IOS:
				setMetadataReadIOs(METADATA_READ_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_WRITE_IOS:
				setMetadataWriteIOs(METADATA_WRITE_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_IO_TIME_COUNTER:
				setTotalIOTimeCounter(TOTAL_IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_IDLE_TIME_COUNTER:
				setTotalIdleTimeCounter(TOTAL_IDLE_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__READ_IO_TIME_COUNTER:
				setReadIOTimeCounter(READ_IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_READ:
				setBytesRead(BYTES_READ_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__WRITE_IO_TIME_COUNTER:
				setWriteIOTimeCounter(WRITE_IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_WRITTEN:
				setBytesWritten(BYTES_WRITTEN_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_BYTES_READ:
				setMetadataBytesRead(METADATA_BYTES_READ_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_BYTES_WRITTEN:
				setMetadataBytesWritten(METADATA_BYTES_WRITTEN_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__PERCENT_DURABLE_OPENS:
				setPercentDurableOpens(PERCENT_DURABLE_OPENS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__PERCENT_RESILIENT_OPENS:
				setPercentResilientOpens(PERCENT_RESILIENT_OPENS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__PERCENT_PERSISTENT_OPENS:
				setPercentPersistentOpens(PERCENT_PERSISTENT_OPENS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_READ_RESPONSE_TIME:
				setAverageReadResponseTime(AVERAGE_READ_RESPONSE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_WRITE_RESPONSE_TIME:
				setAverageWriteResponseTime(AVERAGE_WRITE_RESPONSE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_REQUEST_RESPONSE_TIME:
				setAverageRequestResponseTime(AVERAGE_REQUEST_RESPONSE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_READ_PER_SEC:
				setBytesReadPerSec(BYTES_READ_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_BYTES_RECEIVED:
				setTotalBytesReceived(TOTAL_BYTES_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_RECEIVED_PER_SEC:
				setBytesReceivedPerSec(BYTES_RECEIVED_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_BYTES_SENT:
				setTotalBytesSent(TOTAL_BYTES_SENT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_SENT_PER_SEC:
				setBytesSentPerSec(BYTES_SENT_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_TRANFERRED_PER_SEC:
				setBytesTranferredPerSec(BYTES_TRANFERRED_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_WRITTEN_PER_SEC:
				setBytesWrittenPerSec(BYTES_WRITTEN_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__FILES_OPENED_PER_SEC:
				setFilesOpenedPerSec(FILES_OPENED_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_OPEN_FILE_COUNT:
				setTotalOpenFileCount(TOTAL_OPEN_FILE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__CURRENT_PENDING_REQUESTS:
				setCurrentPendingRequests(CURRENT_PENDING_REQUESTS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__READ_REQUESTS_PROCESSED_PER_SEC:
				setReadRequestsProcessedPerSec(READ_REQUESTS_PROCESSED_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_REQUESTS_RECEIVED:
				setTotalRequestsReceived(TOTAL_REQUESTS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__REQUESTS_RECEIVED_PER_SEC:
				setRequestsReceivedPerSec(REQUESTS_RECEIVED_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_DURABLE_HANDLE_REOPEN_COUNT:
				setTotalDurableHandleReopenCount(TOTAL_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT:
				setTotalFailedDurableHandleReopenCount(TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT:
				setTotalFailedResilientHandleReopenCount(TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__CURRENT_OPEN_FILE_COUNT:
				setCurrentOpenFileCount(CURRENT_OPEN_FILE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_RESILIENT_HANDLE_REOPEN_COUNT:
				setTotalResilientHandleReopenCount(TOTAL_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT:
				setTotalPersistentHandleReopenCount(TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT:
				setTotalFailedPersistentHandleReopenCount(TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TREE_CONNECT_COUNT:
				setTreeConnectCount(TREE_CONNECT_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__WRITE_REQUESTS_PROCESSED_PER_SEC:
				setWriteRequestsProcessedPerSec(WRITE_REQUESTS_PROCESSED_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_METADATA_REQUESTS_RECEIVED:
				setTotalMetadataRequestsReceived(TOTAL_METADATA_REQUESTS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_REQUESTS_RECEIVED_PER_SEC:
				setMetadataRequestsReceivedPerSec(METADATA_REQUESTS_RECEIVED_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_TIME_PER_DATA_REQUEST:
				setAverageTimePerDataRequest(AVERAGE_TIME_PER_DATA_REQUEST_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_BYTES_PER_DATA_REQUEST:
				setAverageBytesPerDataRequest(AVERAGE_BYTES_PER_DATA_REQUEST_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_BYTES_PER_READ_REQUEST:
				setAverageBytesPerReadRequest(AVERAGE_BYTES_PER_READ_REQUEST_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_BYTES_PER_WRITE_REQUEST:
				setAverageBytesPerWriteRequest(AVERAGE_BYTES_PER_WRITE_REQUEST_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_READ_QUEUE_LENGTH:
				setAverageReadQueueLength(AVERAGE_READ_QUEUE_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_WRITE_QUEUE_LENGTH:
				setAverageWriteQueueLength(AVERAGE_WRITE_QUEUE_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_DATA_QUEUE_LENGTH:
				setAverageDataQueueLength(AVERAGE_DATA_QUEUE_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__DATA_BYTES_PER_SEC:
				setDataBytesPerSec(DATA_BYTES_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__DATA_REQUESTS_PER_SEC:
				setDataRequestsPerSec(DATA_REQUESTS_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__CURRENT_DATA_QUEUE_LENGTH:
				setCurrentDataQueueLength(CURRENT_DATA_QUEUE_LENGTH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__ELEMENT_TYPE:
				return ELEMENT_TYPE_EDEFAULT == null ? elementType != null : !ELEMENT_TYPE_EDEFAULT.equals(elementType);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__OTHER_ELEMENT_TYPE_DESCRIPTION:
				return OTHER_ELEMENT_TYPE_DESCRIPTION_EDEFAULT == null ? otherElementTypeDescription != null : !OTHER_ELEMENT_TYPE_DESCRIPTION_EDEFAULT.equals(otherElementTypeDescription);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_IOS:
				return TOTAL_IOS_EDEFAULT == null ? totalIOs != null : !TOTAL_IOS_EDEFAULT.equals(totalIOs);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_BYTES_TRANSFERRED:
				return TOTAL_BYTES_TRANSFERRED_EDEFAULT == null ? totalBytesTransferred != null : !TOTAL_BYTES_TRANSFERRED_EDEFAULT.equals(totalBytesTransferred);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__READ_IOS:
				return READ_IOS_EDEFAULT == null ? readIOs != null : !READ_IOS_EDEFAULT.equals(readIOs);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__WRITE_IOS:
				return WRITE_IOS_EDEFAULT == null ? writeIOs != null : !WRITE_IOS_EDEFAULT.equals(writeIOs);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__OTHER_IOS:
				return OTHER_IOS_EDEFAULT == null ? otherIOs != null : !OTHER_IOS_EDEFAULT.equals(otherIOs);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_READ_IOS:
				return METADATA_READ_IOS_EDEFAULT == null ? metadataReadIOs != null : !METADATA_READ_IOS_EDEFAULT.equals(metadataReadIOs);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_WRITE_IOS:
				return METADATA_WRITE_IOS_EDEFAULT == null ? metadataWriteIOs != null : !METADATA_WRITE_IOS_EDEFAULT.equals(metadataWriteIOs);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_IO_TIME_COUNTER:
				return TOTAL_IO_TIME_COUNTER_EDEFAULT == null ? totalIOTimeCounter != null : !TOTAL_IO_TIME_COUNTER_EDEFAULT.equals(totalIOTimeCounter);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_IDLE_TIME_COUNTER:
				return TOTAL_IDLE_TIME_COUNTER_EDEFAULT == null ? totalIdleTimeCounter != null : !TOTAL_IDLE_TIME_COUNTER_EDEFAULT.equals(totalIdleTimeCounter);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__READ_IO_TIME_COUNTER:
				return READ_IO_TIME_COUNTER_EDEFAULT == null ? readIOTimeCounter != null : !READ_IO_TIME_COUNTER_EDEFAULT.equals(readIOTimeCounter);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_READ:
				return BYTES_READ_EDEFAULT == null ? bytesRead != null : !BYTES_READ_EDEFAULT.equals(bytesRead);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__WRITE_IO_TIME_COUNTER:
				return WRITE_IO_TIME_COUNTER_EDEFAULT == null ? writeIOTimeCounter != null : !WRITE_IO_TIME_COUNTER_EDEFAULT.equals(writeIOTimeCounter);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_WRITTEN:
				return BYTES_WRITTEN_EDEFAULT == null ? bytesWritten != null : !BYTES_WRITTEN_EDEFAULT.equals(bytesWritten);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_BYTES_READ:
				return METADATA_BYTES_READ_EDEFAULT == null ? metadataBytesRead != null : !METADATA_BYTES_READ_EDEFAULT.equals(metadataBytesRead);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_BYTES_WRITTEN:
				return METADATA_BYTES_WRITTEN_EDEFAULT == null ? metadataBytesWritten != null : !METADATA_BYTES_WRITTEN_EDEFAULT.equals(metadataBytesWritten);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__PERCENT_DURABLE_OPENS:
				return PERCENT_DURABLE_OPENS_EDEFAULT == null ? percentDurableOpens != null : !PERCENT_DURABLE_OPENS_EDEFAULT.equals(percentDurableOpens);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__PERCENT_RESILIENT_OPENS:
				return PERCENT_RESILIENT_OPENS_EDEFAULT == null ? percentResilientOpens != null : !PERCENT_RESILIENT_OPENS_EDEFAULT.equals(percentResilientOpens);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__PERCENT_PERSISTENT_OPENS:
				return PERCENT_PERSISTENT_OPENS_EDEFAULT == null ? percentPersistentOpens != null : !PERCENT_PERSISTENT_OPENS_EDEFAULT.equals(percentPersistentOpens);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_READ_RESPONSE_TIME:
				return AVERAGE_READ_RESPONSE_TIME_EDEFAULT == null ? averageReadResponseTime != null : !AVERAGE_READ_RESPONSE_TIME_EDEFAULT.equals(averageReadResponseTime);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_WRITE_RESPONSE_TIME:
				return AVERAGE_WRITE_RESPONSE_TIME_EDEFAULT == null ? averageWriteResponseTime != null : !AVERAGE_WRITE_RESPONSE_TIME_EDEFAULT.equals(averageWriteResponseTime);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_REQUEST_RESPONSE_TIME:
				return AVERAGE_REQUEST_RESPONSE_TIME_EDEFAULT == null ? averageRequestResponseTime != null : !AVERAGE_REQUEST_RESPONSE_TIME_EDEFAULT.equals(averageRequestResponseTime);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_READ_PER_SEC:
				return BYTES_READ_PER_SEC_EDEFAULT == null ? bytesReadPerSec != null : !BYTES_READ_PER_SEC_EDEFAULT.equals(bytesReadPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_BYTES_RECEIVED:
				return TOTAL_BYTES_RECEIVED_EDEFAULT == null ? totalBytesReceived != null : !TOTAL_BYTES_RECEIVED_EDEFAULT.equals(totalBytesReceived);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_RECEIVED_PER_SEC:
				return BYTES_RECEIVED_PER_SEC_EDEFAULT == null ? bytesReceivedPerSec != null : !BYTES_RECEIVED_PER_SEC_EDEFAULT.equals(bytesReceivedPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_BYTES_SENT:
				return TOTAL_BYTES_SENT_EDEFAULT == null ? totalBytesSent != null : !TOTAL_BYTES_SENT_EDEFAULT.equals(totalBytesSent);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_SENT_PER_SEC:
				return BYTES_SENT_PER_SEC_EDEFAULT == null ? bytesSentPerSec != null : !BYTES_SENT_PER_SEC_EDEFAULT.equals(bytesSentPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_TRANFERRED_PER_SEC:
				return BYTES_TRANFERRED_PER_SEC_EDEFAULT == null ? bytesTranferredPerSec != null : !BYTES_TRANFERRED_PER_SEC_EDEFAULT.equals(bytesTranferredPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__BYTES_WRITTEN_PER_SEC:
				return BYTES_WRITTEN_PER_SEC_EDEFAULT == null ? bytesWrittenPerSec != null : !BYTES_WRITTEN_PER_SEC_EDEFAULT.equals(bytesWrittenPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__FILES_OPENED_PER_SEC:
				return FILES_OPENED_PER_SEC_EDEFAULT == null ? filesOpenedPerSec != null : !FILES_OPENED_PER_SEC_EDEFAULT.equals(filesOpenedPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_OPEN_FILE_COUNT:
				return TOTAL_OPEN_FILE_COUNT_EDEFAULT == null ? totalOpenFileCount != null : !TOTAL_OPEN_FILE_COUNT_EDEFAULT.equals(totalOpenFileCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__CURRENT_PENDING_REQUESTS:
				return CURRENT_PENDING_REQUESTS_EDEFAULT == null ? currentPendingRequests != null : !CURRENT_PENDING_REQUESTS_EDEFAULT.equals(currentPendingRequests);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__READ_REQUESTS_PROCESSED_PER_SEC:
				return READ_REQUESTS_PROCESSED_PER_SEC_EDEFAULT == null ? readRequestsProcessedPerSec != null : !READ_REQUESTS_PROCESSED_PER_SEC_EDEFAULT.equals(readRequestsProcessedPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_REQUESTS_RECEIVED:
				return TOTAL_REQUESTS_RECEIVED_EDEFAULT == null ? totalRequestsReceived != null : !TOTAL_REQUESTS_RECEIVED_EDEFAULT.equals(totalRequestsReceived);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__REQUESTS_RECEIVED_PER_SEC:
				return REQUESTS_RECEIVED_PER_SEC_EDEFAULT == null ? requestsReceivedPerSec != null : !REQUESTS_RECEIVED_PER_SEC_EDEFAULT.equals(requestsReceivedPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_DURABLE_HANDLE_REOPEN_COUNT:
				return TOTAL_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT == null ? totalDurableHandleReopenCount != null : !TOTAL_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT.equals(totalDurableHandleReopenCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT:
				return TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT == null ? totalFailedDurableHandleReopenCount != null : !TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT.equals(totalFailedDurableHandleReopenCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT:
				return TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT == null ? totalFailedResilientHandleReopenCount != null : !TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT.equals(totalFailedResilientHandleReopenCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__CURRENT_OPEN_FILE_COUNT:
				return CURRENT_OPEN_FILE_COUNT_EDEFAULT == null ? currentOpenFileCount != null : !CURRENT_OPEN_FILE_COUNT_EDEFAULT.equals(currentOpenFileCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_RESILIENT_HANDLE_REOPEN_COUNT:
				return TOTAL_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT == null ? totalResilientHandleReopenCount != null : !TOTAL_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT.equals(totalResilientHandleReopenCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT:
				return TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT == null ? totalPersistentHandleReopenCount != null : !TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT.equals(totalPersistentHandleReopenCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT:
				return TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT == null ? totalFailedPersistentHandleReopenCount != null : !TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT.equals(totalFailedPersistentHandleReopenCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TREE_CONNECT_COUNT:
				return TREE_CONNECT_COUNT_EDEFAULT == null ? treeConnectCount != null : !TREE_CONNECT_COUNT_EDEFAULT.equals(treeConnectCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__WRITE_REQUESTS_PROCESSED_PER_SEC:
				return WRITE_REQUESTS_PROCESSED_PER_SEC_EDEFAULT == null ? writeRequestsProcessedPerSec != null : !WRITE_REQUESTS_PROCESSED_PER_SEC_EDEFAULT.equals(writeRequestsProcessedPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__TOTAL_METADATA_REQUESTS_RECEIVED:
				return TOTAL_METADATA_REQUESTS_RECEIVED_EDEFAULT == null ? totalMetadataRequestsReceived != null : !TOTAL_METADATA_REQUESTS_RECEIVED_EDEFAULT.equals(totalMetadataRequestsReceived);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__METADATA_REQUESTS_RECEIVED_PER_SEC:
				return METADATA_REQUESTS_RECEIVED_PER_SEC_EDEFAULT == null ? metadataRequestsReceivedPerSec != null : !METADATA_REQUESTS_RECEIVED_PER_SEC_EDEFAULT.equals(metadataRequestsReceivedPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_TIME_PER_DATA_REQUEST:
				return AVERAGE_TIME_PER_DATA_REQUEST_EDEFAULT == null ? averageTimePerDataRequest != null : !AVERAGE_TIME_PER_DATA_REQUEST_EDEFAULT.equals(averageTimePerDataRequest);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_BYTES_PER_DATA_REQUEST:
				return AVERAGE_BYTES_PER_DATA_REQUEST_EDEFAULT == null ? averageBytesPerDataRequest != null : !AVERAGE_BYTES_PER_DATA_REQUEST_EDEFAULT.equals(averageBytesPerDataRequest);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_BYTES_PER_READ_REQUEST:
				return AVERAGE_BYTES_PER_READ_REQUEST_EDEFAULT == null ? averageBytesPerReadRequest != null : !AVERAGE_BYTES_PER_READ_REQUEST_EDEFAULT.equals(averageBytesPerReadRequest);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_BYTES_PER_WRITE_REQUEST:
				return AVERAGE_BYTES_PER_WRITE_REQUEST_EDEFAULT == null ? averageBytesPerWriteRequest != null : !AVERAGE_BYTES_PER_WRITE_REQUEST_EDEFAULT.equals(averageBytesPerWriteRequest);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_READ_QUEUE_LENGTH:
				return AVERAGE_READ_QUEUE_LENGTH_EDEFAULT == null ? averageReadQueueLength != null : !AVERAGE_READ_QUEUE_LENGTH_EDEFAULT.equals(averageReadQueueLength);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_WRITE_QUEUE_LENGTH:
				return AVERAGE_WRITE_QUEUE_LENGTH_EDEFAULT == null ? averageWriteQueueLength != null : !AVERAGE_WRITE_QUEUE_LENGTH_EDEFAULT.equals(averageWriteQueueLength);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__AVERAGE_DATA_QUEUE_LENGTH:
				return AVERAGE_DATA_QUEUE_LENGTH_EDEFAULT == null ? averageDataQueueLength != null : !AVERAGE_DATA_QUEUE_LENGTH_EDEFAULT.equals(averageDataQueueLength);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__DATA_BYTES_PER_SEC:
				return DATA_BYTES_PER_SEC_EDEFAULT == null ? dataBytesPerSec != null : !DATA_BYTES_PER_SEC_EDEFAULT.equals(dataBytesPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__DATA_REQUESTS_PER_SEC:
				return DATA_REQUESTS_PER_SEC_EDEFAULT == null ? dataRequestsPerSec != null : !DATA_REQUESTS_PER_SEC_EDEFAULT.equals(dataRequestsPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICAL_DATA__CURRENT_DATA_QUEUE_LENGTH:
				return CURRENT_DATA_QUEUE_LENGTH_EDEFAULT == null ? currentDataQueueLength != null : !CURRENT_DATA_QUEUE_LENGTH_EDEFAULT.equals(currentDataQueueLength);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ElementType: ");
		result.append(elementType);
		result.append(", OtherElementTypeDescription: ");
		result.append(otherElementTypeDescription);
		result.append(", TotalIOs: ");
		result.append(totalIOs);
		result.append(", TotalBytesTransferred: ");
		result.append(totalBytesTransferred);
		result.append(", ReadIOs: ");
		result.append(readIOs);
		result.append(", WriteIOs: ");
		result.append(writeIOs);
		result.append(", OtherIOs: ");
		result.append(otherIOs);
		result.append(", MetadataReadIOs: ");
		result.append(metadataReadIOs);
		result.append(", MetadataWriteIOs: ");
		result.append(metadataWriteIOs);
		result.append(", TotalIOTimeCounter: ");
		result.append(totalIOTimeCounter);
		result.append(", TotalIdleTimeCounter: ");
		result.append(totalIdleTimeCounter);
		result.append(", ReadIOTimeCounter: ");
		result.append(readIOTimeCounter);
		result.append(", BytesRead: ");
		result.append(bytesRead);
		result.append(", WriteIOTimeCounter: ");
		result.append(writeIOTimeCounter);
		result.append(", BytesWritten: ");
		result.append(bytesWritten);
		result.append(", MetadataBytesRead: ");
		result.append(metadataBytesRead);
		result.append(", MetadataBytesWritten: ");
		result.append(metadataBytesWritten);
		result.append(", PercentDurableOpens: ");
		result.append(percentDurableOpens);
		result.append(", PercentResilientOpens: ");
		result.append(percentResilientOpens);
		result.append(", PercentPersistentOpens: ");
		result.append(percentPersistentOpens);
		result.append(", AverageReadResponseTime: ");
		result.append(averageReadResponseTime);
		result.append(", AverageWriteResponseTime: ");
		result.append(averageWriteResponseTime);
		result.append(", AverageRequestResponseTime: ");
		result.append(averageRequestResponseTime);
		result.append(", BytesReadPerSec: ");
		result.append(bytesReadPerSec);
		result.append(", TotalBytesReceived: ");
		result.append(totalBytesReceived);
		result.append(", BytesReceivedPerSec: ");
		result.append(bytesReceivedPerSec);
		result.append(", TotalBytesSent: ");
		result.append(totalBytesSent);
		result.append(", BytesSentPerSec: ");
		result.append(bytesSentPerSec);
		result.append(", BytesTranferredPerSec: ");
		result.append(bytesTranferredPerSec);
		result.append(", BytesWrittenPerSec: ");
		result.append(bytesWrittenPerSec);
		result.append(", FilesOpenedPerSec: ");
		result.append(filesOpenedPerSec);
		result.append(", TotalOpenFileCount: ");
		result.append(totalOpenFileCount);
		result.append(", CurrentPendingRequests: ");
		result.append(currentPendingRequests);
		result.append(", ReadRequestsProcessedPerSec: ");
		result.append(readRequestsProcessedPerSec);
		result.append(", TotalRequestsReceived: ");
		result.append(totalRequestsReceived);
		result.append(", RequestsReceivedPerSec: ");
		result.append(requestsReceivedPerSec);
		result.append(", TotalDurableHandleReopenCount: ");
		result.append(totalDurableHandleReopenCount);
		result.append(", TotalFailedDurableHandleReopenCount: ");
		result.append(totalFailedDurableHandleReopenCount);
		result.append(", TotalFailedResilientHandleReopenCount: ");
		result.append(totalFailedResilientHandleReopenCount);
		result.append(", CurrentOpenFileCount: ");
		result.append(currentOpenFileCount);
		result.append(", TotalResilientHandleReopenCount: ");
		result.append(totalResilientHandleReopenCount);
		result.append(", TotalPersistentHandleReopenCount: ");
		result.append(totalPersistentHandleReopenCount);
		result.append(", TotalFailedPersistentHandleReopenCount: ");
		result.append(totalFailedPersistentHandleReopenCount);
		result.append(", TreeConnectCount: ");
		result.append(treeConnectCount);
		result.append(", WriteRequestsProcessedPerSec: ");
		result.append(writeRequestsProcessedPerSec);
		result.append(", TotalMetadataRequestsReceived: ");
		result.append(totalMetadataRequestsReceived);
		result.append(", MetadataRequestsReceivedPerSec: ");
		result.append(metadataRequestsReceivedPerSec);
		result.append(", AverageTimePerDataRequest: ");
		result.append(averageTimePerDataRequest);
		result.append(", AverageBytesPerDataRequest: ");
		result.append(averageBytesPerDataRequest);
		result.append(", AverageBytesPerReadRequest: ");
		result.append(averageBytesPerReadRequest);
		result.append(", AverageBytesPerWriteRequest: ");
		result.append(averageBytesPerWriteRequest);
		result.append(", AverageReadQueueLength: ");
		result.append(averageReadQueueLength);
		result.append(", AverageWriteQueueLength: ");
		result.append(averageWriteQueueLength);
		result.append(", AverageDataQueueLength: ");
		result.append(averageDataQueueLength);
		result.append(", DataBytesPerSec: ");
		result.append(dataBytesPerSec);
		result.append(", DataRequestsPerSec: ");
		result.append(dataRequestsPerSec);
		result.append(", CurrentDataQueueLength: ");
		result.append(currentDataQueueLength);
		result.append(')');
		return result.toString();
	}

} //CIM_FileSystemStatisticalDataImpl

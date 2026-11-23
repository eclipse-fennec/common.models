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

import org.dmtf.cim.CIM_FileSystemStatisticsManifest;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File System Statistics Manifest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getOtherElementTypeDescription <em>Other Element Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeStartStatisticTime <em>Include Start Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeStatisticTime <em>Include Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTotalIOs <em>Include Total IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTotalBytesTransferred <em>Include Total Bytes Transferred</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeReadIOs <em>Include Read IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeWriteIOs <em>Include Write IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeOtherIOs <em>Include Other IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeMetadataReadIOs <em>Include Metadata Read IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeMetadataWriteIOs <em>Include Metadata Write IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTotalIOTimeCounter <em>Include Total IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTotalIdleTimeCounter <em>Include Total Idle Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeReadIOTimeCounter <em>Include Read IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeBytesRead <em>Include Bytes Read</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeWriteIOTimeCounter <em>Include Write IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeBytesWritten <em>Include Bytes Written</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeMetadataBytesRead <em>Include Metadata Bytes Read</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeMetadataBytesWritten <em>Include Metadata Bytes Written</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludePercentDurableOpens <em>Include Percent Durable Opens</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludePercentResilientOpens <em>Include Percent Resilient Opens</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludePercentPersistentOpens <em>Include Percent Persistent Opens</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeAverageReadResponseTime <em>Include Average Read Response Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeAverageWriteResponseTime <em>Include Average Write Response Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeAverageRequestResponseTime <em>Include Average Request Response Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeBytesReadPerSec <em>Include Bytes Read Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTotalBytesReceived <em>Include Total Bytes Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeBytesReceivedPerSec <em>Include Bytes Received Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTotalBytesSent <em>Include Total Bytes Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeBytesSentPerSec <em>Include Bytes Sent Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeBytesTranferredPerSec <em>Include Bytes Tranferred Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeBytesWrittenPerSec <em>Include Bytes Written Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeFilesOpenedPerSec <em>Include Files Opened Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTotalOpenFileCount <em>Include Total Open File Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeCurrentPendingRequests <em>Include Current Pending Requests</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeReadRequestsProcessedPerSec <em>Include Read Requests Processed Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTotalRequestsReceived <em>Include Total Requests Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeRequestsReceivedPerSec <em>Include Requests Received Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTotalDurableHandleReopenCount <em>Include Total Durable Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTotalFailedDurableHandleReopenCount <em>Include Total Failed Durable Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTotalFailedResilientHandleReopenCount <em>Include Total Failed Resilient Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeCurrentOpenFileCount <em>Include Current Open File Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTotalResilientHandleReopenCount <em>Include Total Resilient Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTotalPersistentHandleReopenCount <em>Include Total Persistent Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTotalFailedPersistentHandleReopenCount <em>Include Total Failed Persistent Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTreeConnectCount <em>Include Tree Connect Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeWriteRequestsProcessedPerSec <em>Include Write Requests Processed Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeTotalMetadataRequestsReceived <em>Include Total Metadata Requests Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeMetadataRequestsReceivedPerSec <em>Include Metadata Requests Received Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeAverageTimePerDataRequest <em>Include Average Time Per Data Request</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeAverageBytesPerDataRequest <em>Include Average Bytes Per Data Request</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeAverageBytesPerReadRequest <em>Include Average Bytes Per Read Request</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeAverageBytesPerWriteRequest <em>Include Average Bytes Per Write Request</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeAverageReadQueueLength <em>Include Average Read Queue Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeAverageWriteQueueLength <em>Include Average Write Queue Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeAverageDataQueueLength <em>Include Average Data Queue Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeDataBytesPerSec <em>Include Data Bytes Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeDataRequestsPerSec <em>Include Data Requests Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemStatisticsManifestImpl#getIncludeCurrentDataQueueLength <em>Include Current Data Queue Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FileSystemStatisticsManifestImpl extends CIM_ManagedElementImpl implements CIM_FileSystemStatisticsManifest {
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
	 * The default value of the '{@link #getIncludeStartStatisticTime() <em>Include Start Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeStartStatisticTime()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_START_STATISTIC_TIME_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeStartStatisticTime() <em>Include Start Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeStartStatisticTime()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeStartStatisticTime = INCLUDE_START_STATISTIC_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeStatisticTime() <em>Include Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeStatisticTime()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_STATISTIC_TIME_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeStatisticTime() <em>Include Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeStatisticTime()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeStatisticTime = INCLUDE_STATISTIC_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalIOs() <em>Include Total IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_IOS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalIOs() <em>Include Total IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalIOs()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalIOs = INCLUDE_TOTAL_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalBytesTransferred() <em>Include Total Bytes Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalBytesTransferred()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_BYTES_TRANSFERRED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalBytesTransferred() <em>Include Total Bytes Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalBytesTransferred()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalBytesTransferred = INCLUDE_TOTAL_BYTES_TRANSFERRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeReadIOs() <em>Include Read IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_READ_IOS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeReadIOs() <em>Include Read IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadIOs()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeReadIOs = INCLUDE_READ_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeWriteIOs() <em>Include Write IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_WRITE_IOS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeWriteIOs() <em>Include Write IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteIOs()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeWriteIOs = INCLUDE_WRITE_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeOtherIOs() <em>Include Other IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeOtherIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_OTHER_IOS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeOtherIOs() <em>Include Other IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeOtherIOs()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeOtherIOs = INCLUDE_OTHER_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeMetadataReadIOs() <em>Include Metadata Read IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMetadataReadIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_METADATA_READ_IOS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeMetadataReadIOs() <em>Include Metadata Read IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMetadataReadIOs()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeMetadataReadIOs = INCLUDE_METADATA_READ_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeMetadataWriteIOs() <em>Include Metadata Write IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMetadataWriteIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_METADATA_WRITE_IOS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeMetadataWriteIOs() <em>Include Metadata Write IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMetadataWriteIOs()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeMetadataWriteIOs = INCLUDE_METADATA_WRITE_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalIOTimeCounter() <em>Include Total IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_IO_TIME_COUNTER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalIOTimeCounter() <em>Include Total IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalIOTimeCounter = INCLUDE_TOTAL_IO_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalIdleTimeCounter() <em>Include Total Idle Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalIdleTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_IDLE_TIME_COUNTER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalIdleTimeCounter() <em>Include Total Idle Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalIdleTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalIdleTimeCounter = INCLUDE_TOTAL_IDLE_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeReadIOTimeCounter() <em>Include Read IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_READ_IO_TIME_COUNTER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeReadIOTimeCounter() <em>Include Read IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeReadIOTimeCounter = INCLUDE_READ_IO_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeBytesRead() <em>Include Bytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeBytesRead()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_BYTES_READ_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeBytesRead() <em>Include Bytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeBytesRead()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeBytesRead = INCLUDE_BYTES_READ_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeWriteIOTimeCounter() <em>Include Write IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_WRITE_IO_TIME_COUNTER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeWriteIOTimeCounter() <em>Include Write IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeWriteIOTimeCounter = INCLUDE_WRITE_IO_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeBytesWritten() <em>Include Bytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeBytesWritten()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_BYTES_WRITTEN_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeBytesWritten() <em>Include Bytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeBytesWritten()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeBytesWritten = INCLUDE_BYTES_WRITTEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeMetadataBytesRead() <em>Include Metadata Bytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMetadataBytesRead()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_METADATA_BYTES_READ_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeMetadataBytesRead() <em>Include Metadata Bytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMetadataBytesRead()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeMetadataBytesRead = INCLUDE_METADATA_BYTES_READ_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeMetadataBytesWritten() <em>Include Metadata Bytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMetadataBytesWritten()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_METADATA_BYTES_WRITTEN_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeMetadataBytesWritten() <em>Include Metadata Bytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMetadataBytesWritten()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeMetadataBytesWritten = INCLUDE_METADATA_BYTES_WRITTEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludePercentDurableOpens() <em>Include Percent Durable Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludePercentDurableOpens()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_PERCENT_DURABLE_OPENS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludePercentDurableOpens() <em>Include Percent Durable Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludePercentDurableOpens()
	 * @generated
	 * @ordered
	 */
	protected Boolean includePercentDurableOpens = INCLUDE_PERCENT_DURABLE_OPENS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludePercentResilientOpens() <em>Include Percent Resilient Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludePercentResilientOpens()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_PERCENT_RESILIENT_OPENS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludePercentResilientOpens() <em>Include Percent Resilient Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludePercentResilientOpens()
	 * @generated
	 * @ordered
	 */
	protected Boolean includePercentResilientOpens = INCLUDE_PERCENT_RESILIENT_OPENS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludePercentPersistentOpens() <em>Include Percent Persistent Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludePercentPersistentOpens()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_PERCENT_PERSISTENT_OPENS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludePercentPersistentOpens() <em>Include Percent Persistent Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludePercentPersistentOpens()
	 * @generated
	 * @ordered
	 */
	protected Boolean includePercentPersistentOpens = INCLUDE_PERCENT_PERSISTENT_OPENS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeAverageReadResponseTime() <em>Include Average Read Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageReadResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_AVERAGE_READ_RESPONSE_TIME_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeAverageReadResponseTime() <em>Include Average Read Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageReadResponseTime()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeAverageReadResponseTime = INCLUDE_AVERAGE_READ_RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeAverageWriteResponseTime() <em>Include Average Write Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageWriteResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_AVERAGE_WRITE_RESPONSE_TIME_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeAverageWriteResponseTime() <em>Include Average Write Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageWriteResponseTime()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeAverageWriteResponseTime = INCLUDE_AVERAGE_WRITE_RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeAverageRequestResponseTime() <em>Include Average Request Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageRequestResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_AVERAGE_REQUEST_RESPONSE_TIME_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeAverageRequestResponseTime() <em>Include Average Request Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageRequestResponseTime()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeAverageRequestResponseTime = INCLUDE_AVERAGE_REQUEST_RESPONSE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeBytesReadPerSec() <em>Include Bytes Read Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeBytesReadPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_BYTES_READ_PER_SEC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeBytesReadPerSec() <em>Include Bytes Read Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeBytesReadPerSec()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeBytesReadPerSec = INCLUDE_BYTES_READ_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalBytesReceived() <em>Include Total Bytes Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalBytesReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_BYTES_RECEIVED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalBytesReceived() <em>Include Total Bytes Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalBytesReceived()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalBytesReceived = INCLUDE_TOTAL_BYTES_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeBytesReceivedPerSec() <em>Include Bytes Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeBytesReceivedPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_BYTES_RECEIVED_PER_SEC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeBytesReceivedPerSec() <em>Include Bytes Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeBytesReceivedPerSec()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeBytesReceivedPerSec = INCLUDE_BYTES_RECEIVED_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalBytesSent() <em>Include Total Bytes Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalBytesSent()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_BYTES_SENT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalBytesSent() <em>Include Total Bytes Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalBytesSent()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalBytesSent = INCLUDE_TOTAL_BYTES_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeBytesSentPerSec() <em>Include Bytes Sent Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeBytesSentPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_BYTES_SENT_PER_SEC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeBytesSentPerSec() <em>Include Bytes Sent Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeBytesSentPerSec()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeBytesSentPerSec = INCLUDE_BYTES_SENT_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeBytesTranferredPerSec() <em>Include Bytes Tranferred Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeBytesTranferredPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_BYTES_TRANFERRED_PER_SEC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeBytesTranferredPerSec() <em>Include Bytes Tranferred Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeBytesTranferredPerSec()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeBytesTranferredPerSec = INCLUDE_BYTES_TRANFERRED_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeBytesWrittenPerSec() <em>Include Bytes Written Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeBytesWrittenPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_BYTES_WRITTEN_PER_SEC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeBytesWrittenPerSec() <em>Include Bytes Written Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeBytesWrittenPerSec()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeBytesWrittenPerSec = INCLUDE_BYTES_WRITTEN_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeFilesOpenedPerSec() <em>Include Files Opened Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeFilesOpenedPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_FILES_OPENED_PER_SEC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeFilesOpenedPerSec() <em>Include Files Opened Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeFilesOpenedPerSec()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeFilesOpenedPerSec = INCLUDE_FILES_OPENED_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalOpenFileCount() <em>Include Total Open File Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalOpenFileCount()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_OPEN_FILE_COUNT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalOpenFileCount() <em>Include Total Open File Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalOpenFileCount()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalOpenFileCount = INCLUDE_TOTAL_OPEN_FILE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeCurrentPendingRequests() <em>Include Current Pending Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeCurrentPendingRequests()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_CURRENT_PENDING_REQUESTS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeCurrentPendingRequests() <em>Include Current Pending Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeCurrentPendingRequests()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeCurrentPendingRequests = INCLUDE_CURRENT_PENDING_REQUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeReadRequestsProcessedPerSec() <em>Include Read Requests Processed Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadRequestsProcessedPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_READ_REQUESTS_PROCESSED_PER_SEC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeReadRequestsProcessedPerSec() <em>Include Read Requests Processed Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadRequestsProcessedPerSec()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeReadRequestsProcessedPerSec = INCLUDE_READ_REQUESTS_PROCESSED_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalRequestsReceived() <em>Include Total Requests Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalRequestsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_REQUESTS_RECEIVED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalRequestsReceived() <em>Include Total Requests Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalRequestsReceived()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalRequestsReceived = INCLUDE_TOTAL_REQUESTS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeRequestsReceivedPerSec() <em>Include Requests Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeRequestsReceivedPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_REQUESTS_RECEIVED_PER_SEC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeRequestsReceivedPerSec() <em>Include Requests Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeRequestsReceivedPerSec()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeRequestsReceivedPerSec = INCLUDE_REQUESTS_RECEIVED_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalDurableHandleReopenCount() <em>Include Total Durable Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalDurableHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalDurableHandleReopenCount() <em>Include Total Durable Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalDurableHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalDurableHandleReopenCount = INCLUDE_TOTAL_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalFailedDurableHandleReopenCount() <em>Include Total Failed Durable Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalFailedDurableHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalFailedDurableHandleReopenCount() <em>Include Total Failed Durable Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalFailedDurableHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalFailedDurableHandleReopenCount = INCLUDE_TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalFailedResilientHandleReopenCount() <em>Include Total Failed Resilient Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalFailedResilientHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalFailedResilientHandleReopenCount() <em>Include Total Failed Resilient Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalFailedResilientHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalFailedResilientHandleReopenCount = INCLUDE_TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeCurrentOpenFileCount() <em>Include Current Open File Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeCurrentOpenFileCount()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_CURRENT_OPEN_FILE_COUNT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeCurrentOpenFileCount() <em>Include Current Open File Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeCurrentOpenFileCount()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeCurrentOpenFileCount = INCLUDE_CURRENT_OPEN_FILE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalResilientHandleReopenCount() <em>Include Total Resilient Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalResilientHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalResilientHandleReopenCount() <em>Include Total Resilient Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalResilientHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalResilientHandleReopenCount = INCLUDE_TOTAL_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalPersistentHandleReopenCount() <em>Include Total Persistent Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalPersistentHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalPersistentHandleReopenCount() <em>Include Total Persistent Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalPersistentHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalPersistentHandleReopenCount = INCLUDE_TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalFailedPersistentHandleReopenCount() <em>Include Total Failed Persistent Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalFailedPersistentHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalFailedPersistentHandleReopenCount() <em>Include Total Failed Persistent Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalFailedPersistentHandleReopenCount()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalFailedPersistentHandleReopenCount = INCLUDE_TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTreeConnectCount() <em>Include Tree Connect Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTreeConnectCount()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TREE_CONNECT_COUNT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTreeConnectCount() <em>Include Tree Connect Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTreeConnectCount()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTreeConnectCount = INCLUDE_TREE_CONNECT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeWriteRequestsProcessedPerSec() <em>Include Write Requests Processed Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteRequestsProcessedPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_WRITE_REQUESTS_PROCESSED_PER_SEC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeWriteRequestsProcessedPerSec() <em>Include Write Requests Processed Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteRequestsProcessedPerSec()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeWriteRequestsProcessedPerSec = INCLUDE_WRITE_REQUESTS_PROCESSED_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalMetadataRequestsReceived() <em>Include Total Metadata Requests Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalMetadataRequestsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_METADATA_REQUESTS_RECEIVED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalMetadataRequestsReceived() <em>Include Total Metadata Requests Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalMetadataRequestsReceived()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalMetadataRequestsReceived = INCLUDE_TOTAL_METADATA_REQUESTS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeMetadataRequestsReceivedPerSec() <em>Include Metadata Requests Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMetadataRequestsReceivedPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_METADATA_REQUESTS_RECEIVED_PER_SEC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeMetadataRequestsReceivedPerSec() <em>Include Metadata Requests Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMetadataRequestsReceivedPerSec()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeMetadataRequestsReceivedPerSec = INCLUDE_METADATA_REQUESTS_RECEIVED_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeAverageTimePerDataRequest() <em>Include Average Time Per Data Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageTimePerDataRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_AVERAGE_TIME_PER_DATA_REQUEST_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeAverageTimePerDataRequest() <em>Include Average Time Per Data Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageTimePerDataRequest()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeAverageTimePerDataRequest = INCLUDE_AVERAGE_TIME_PER_DATA_REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeAverageBytesPerDataRequest() <em>Include Average Bytes Per Data Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageBytesPerDataRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_AVERAGE_BYTES_PER_DATA_REQUEST_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeAverageBytesPerDataRequest() <em>Include Average Bytes Per Data Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageBytesPerDataRequest()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeAverageBytesPerDataRequest = INCLUDE_AVERAGE_BYTES_PER_DATA_REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeAverageBytesPerReadRequest() <em>Include Average Bytes Per Read Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageBytesPerReadRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_AVERAGE_BYTES_PER_READ_REQUEST_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeAverageBytesPerReadRequest() <em>Include Average Bytes Per Read Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageBytesPerReadRequest()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeAverageBytesPerReadRequest = INCLUDE_AVERAGE_BYTES_PER_READ_REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeAverageBytesPerWriteRequest() <em>Include Average Bytes Per Write Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageBytesPerWriteRequest()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_AVERAGE_BYTES_PER_WRITE_REQUEST_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeAverageBytesPerWriteRequest() <em>Include Average Bytes Per Write Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageBytesPerWriteRequest()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeAverageBytesPerWriteRequest = INCLUDE_AVERAGE_BYTES_PER_WRITE_REQUEST_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeAverageReadQueueLength() <em>Include Average Read Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageReadQueueLength()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_AVERAGE_READ_QUEUE_LENGTH_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeAverageReadQueueLength() <em>Include Average Read Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageReadQueueLength()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeAverageReadQueueLength = INCLUDE_AVERAGE_READ_QUEUE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeAverageWriteQueueLength() <em>Include Average Write Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageWriteQueueLength()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_AVERAGE_WRITE_QUEUE_LENGTH_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeAverageWriteQueueLength() <em>Include Average Write Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageWriteQueueLength()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeAverageWriteQueueLength = INCLUDE_AVERAGE_WRITE_QUEUE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeAverageDataQueueLength() <em>Include Average Data Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageDataQueueLength()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_AVERAGE_DATA_QUEUE_LENGTH_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeAverageDataQueueLength() <em>Include Average Data Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAverageDataQueueLength()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeAverageDataQueueLength = INCLUDE_AVERAGE_DATA_QUEUE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeDataBytesPerSec() <em>Include Data Bytes Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeDataBytesPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_DATA_BYTES_PER_SEC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeDataBytesPerSec() <em>Include Data Bytes Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeDataBytesPerSec()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeDataBytesPerSec = INCLUDE_DATA_BYTES_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeDataRequestsPerSec() <em>Include Data Requests Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeDataRequestsPerSec()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_DATA_REQUESTS_PER_SEC_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeDataRequestsPerSec() <em>Include Data Requests Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeDataRequestsPerSec()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeDataRequestsPerSec = INCLUDE_DATA_REQUESTS_PER_SEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeCurrentDataQueueLength() <em>Include Current Data Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeCurrentDataQueueLength()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_CURRENT_DATA_QUEUE_LENGTH_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeCurrentDataQueueLength() <em>Include Current Data Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeCurrentDataQueueLength()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeCurrentDataQueueLength = INCLUDE_CURRENT_DATA_QUEUE_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileSystemStatisticsManifestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileSystemStatisticsManifest();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__ELEMENT_TYPE, oldElementType, elementType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__OTHER_ELEMENT_TYPE_DESCRIPTION, oldOtherElementTypeDescription, otherElementTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeStartStatisticTime() {
		return includeStartStatisticTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeStartStatisticTime(Boolean newIncludeStartStatisticTime) {
		Boolean oldIncludeStartStatisticTime = includeStartStatisticTime;
		includeStartStatisticTime = newIncludeStartStatisticTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_START_STATISTIC_TIME, oldIncludeStartStatisticTime, includeStartStatisticTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeStatisticTime() {
		return includeStatisticTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeStatisticTime(Boolean newIncludeStatisticTime) {
		Boolean oldIncludeStatisticTime = includeStatisticTime;
		includeStatisticTime = newIncludeStatisticTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_STATISTIC_TIME, oldIncludeStatisticTime, includeStatisticTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalIOs() {
		return includeTotalIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalIOs(Boolean newIncludeTotalIOs) {
		Boolean oldIncludeTotalIOs = includeTotalIOs;
		includeTotalIOs = newIncludeTotalIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_IOS, oldIncludeTotalIOs, includeTotalIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalBytesTransferred() {
		return includeTotalBytesTransferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalBytesTransferred(Boolean newIncludeTotalBytesTransferred) {
		Boolean oldIncludeTotalBytesTransferred = includeTotalBytesTransferred;
		includeTotalBytesTransferred = newIncludeTotalBytesTransferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_BYTES_TRANSFERRED, oldIncludeTotalBytesTransferred, includeTotalBytesTransferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeReadIOs() {
		return includeReadIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeReadIOs(Boolean newIncludeReadIOs) {
		Boolean oldIncludeReadIOs = includeReadIOs;
		includeReadIOs = newIncludeReadIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_READ_IOS, oldIncludeReadIOs, includeReadIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeWriteIOs() {
		return includeWriteIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeWriteIOs(Boolean newIncludeWriteIOs) {
		Boolean oldIncludeWriteIOs = includeWriteIOs;
		includeWriteIOs = newIncludeWriteIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_WRITE_IOS, oldIncludeWriteIOs, includeWriteIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeOtherIOs() {
		return includeOtherIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeOtherIOs(Boolean newIncludeOtherIOs) {
		Boolean oldIncludeOtherIOs = includeOtherIOs;
		includeOtherIOs = newIncludeOtherIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_OTHER_IOS, oldIncludeOtherIOs, includeOtherIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeMetadataReadIOs() {
		return includeMetadataReadIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeMetadataReadIOs(Boolean newIncludeMetadataReadIOs) {
		Boolean oldIncludeMetadataReadIOs = includeMetadataReadIOs;
		includeMetadataReadIOs = newIncludeMetadataReadIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_READ_IOS, oldIncludeMetadataReadIOs, includeMetadataReadIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeMetadataWriteIOs() {
		return includeMetadataWriteIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeMetadataWriteIOs(Boolean newIncludeMetadataWriteIOs) {
		Boolean oldIncludeMetadataWriteIOs = includeMetadataWriteIOs;
		includeMetadataWriteIOs = newIncludeMetadataWriteIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_WRITE_IOS, oldIncludeMetadataWriteIOs, includeMetadataWriteIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalIOTimeCounter() {
		return includeTotalIOTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalIOTimeCounter(Boolean newIncludeTotalIOTimeCounter) {
		Boolean oldIncludeTotalIOTimeCounter = includeTotalIOTimeCounter;
		includeTotalIOTimeCounter = newIncludeTotalIOTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_IO_TIME_COUNTER, oldIncludeTotalIOTimeCounter, includeTotalIOTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalIdleTimeCounter() {
		return includeTotalIdleTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalIdleTimeCounter(Boolean newIncludeTotalIdleTimeCounter) {
		Boolean oldIncludeTotalIdleTimeCounter = includeTotalIdleTimeCounter;
		includeTotalIdleTimeCounter = newIncludeTotalIdleTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_IDLE_TIME_COUNTER, oldIncludeTotalIdleTimeCounter, includeTotalIdleTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeReadIOTimeCounter() {
		return includeReadIOTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeReadIOTimeCounter(Boolean newIncludeReadIOTimeCounter) {
		Boolean oldIncludeReadIOTimeCounter = includeReadIOTimeCounter;
		includeReadIOTimeCounter = newIncludeReadIOTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_READ_IO_TIME_COUNTER, oldIncludeReadIOTimeCounter, includeReadIOTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeBytesRead() {
		return includeBytesRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeBytesRead(Boolean newIncludeBytesRead) {
		Boolean oldIncludeBytesRead = includeBytesRead;
		includeBytesRead = newIncludeBytesRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_READ, oldIncludeBytesRead, includeBytesRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeWriteIOTimeCounter() {
		return includeWriteIOTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeWriteIOTimeCounter(Boolean newIncludeWriteIOTimeCounter) {
		Boolean oldIncludeWriteIOTimeCounter = includeWriteIOTimeCounter;
		includeWriteIOTimeCounter = newIncludeWriteIOTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_WRITE_IO_TIME_COUNTER, oldIncludeWriteIOTimeCounter, includeWriteIOTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeBytesWritten() {
		return includeBytesWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeBytesWritten(Boolean newIncludeBytesWritten) {
		Boolean oldIncludeBytesWritten = includeBytesWritten;
		includeBytesWritten = newIncludeBytesWritten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_WRITTEN, oldIncludeBytesWritten, includeBytesWritten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeMetadataBytesRead() {
		return includeMetadataBytesRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeMetadataBytesRead(Boolean newIncludeMetadataBytesRead) {
		Boolean oldIncludeMetadataBytesRead = includeMetadataBytesRead;
		includeMetadataBytesRead = newIncludeMetadataBytesRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_BYTES_READ, oldIncludeMetadataBytesRead, includeMetadataBytesRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeMetadataBytesWritten() {
		return includeMetadataBytesWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeMetadataBytesWritten(Boolean newIncludeMetadataBytesWritten) {
		Boolean oldIncludeMetadataBytesWritten = includeMetadataBytesWritten;
		includeMetadataBytesWritten = newIncludeMetadataBytesWritten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_BYTES_WRITTEN, oldIncludeMetadataBytesWritten, includeMetadataBytesWritten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludePercentDurableOpens() {
		return includePercentDurableOpens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludePercentDurableOpens(Boolean newIncludePercentDurableOpens) {
		Boolean oldIncludePercentDurableOpens = includePercentDurableOpens;
		includePercentDurableOpens = newIncludePercentDurableOpens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_PERCENT_DURABLE_OPENS, oldIncludePercentDurableOpens, includePercentDurableOpens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludePercentResilientOpens() {
		return includePercentResilientOpens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludePercentResilientOpens(Boolean newIncludePercentResilientOpens) {
		Boolean oldIncludePercentResilientOpens = includePercentResilientOpens;
		includePercentResilientOpens = newIncludePercentResilientOpens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_PERCENT_RESILIENT_OPENS, oldIncludePercentResilientOpens, includePercentResilientOpens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludePercentPersistentOpens() {
		return includePercentPersistentOpens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludePercentPersistentOpens(Boolean newIncludePercentPersistentOpens) {
		Boolean oldIncludePercentPersistentOpens = includePercentPersistentOpens;
		includePercentPersistentOpens = newIncludePercentPersistentOpens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_PERCENT_PERSISTENT_OPENS, oldIncludePercentPersistentOpens, includePercentPersistentOpens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeAverageReadResponseTime() {
		return includeAverageReadResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeAverageReadResponseTime(Boolean newIncludeAverageReadResponseTime) {
		Boolean oldIncludeAverageReadResponseTime = includeAverageReadResponseTime;
		includeAverageReadResponseTime = newIncludeAverageReadResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_READ_RESPONSE_TIME, oldIncludeAverageReadResponseTime, includeAverageReadResponseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeAverageWriteResponseTime() {
		return includeAverageWriteResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeAverageWriteResponseTime(Boolean newIncludeAverageWriteResponseTime) {
		Boolean oldIncludeAverageWriteResponseTime = includeAverageWriteResponseTime;
		includeAverageWriteResponseTime = newIncludeAverageWriteResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_WRITE_RESPONSE_TIME, oldIncludeAverageWriteResponseTime, includeAverageWriteResponseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeAverageRequestResponseTime() {
		return includeAverageRequestResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeAverageRequestResponseTime(Boolean newIncludeAverageRequestResponseTime) {
		Boolean oldIncludeAverageRequestResponseTime = includeAverageRequestResponseTime;
		includeAverageRequestResponseTime = newIncludeAverageRequestResponseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_REQUEST_RESPONSE_TIME, oldIncludeAverageRequestResponseTime, includeAverageRequestResponseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeBytesReadPerSec() {
		return includeBytesReadPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeBytesReadPerSec(Boolean newIncludeBytesReadPerSec) {
		Boolean oldIncludeBytesReadPerSec = includeBytesReadPerSec;
		includeBytesReadPerSec = newIncludeBytesReadPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_READ_PER_SEC, oldIncludeBytesReadPerSec, includeBytesReadPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalBytesReceived() {
		return includeTotalBytesReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalBytesReceived(Boolean newIncludeTotalBytesReceived) {
		Boolean oldIncludeTotalBytesReceived = includeTotalBytesReceived;
		includeTotalBytesReceived = newIncludeTotalBytesReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_BYTES_RECEIVED, oldIncludeTotalBytesReceived, includeTotalBytesReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeBytesReceivedPerSec() {
		return includeBytesReceivedPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeBytesReceivedPerSec(Boolean newIncludeBytesReceivedPerSec) {
		Boolean oldIncludeBytesReceivedPerSec = includeBytesReceivedPerSec;
		includeBytesReceivedPerSec = newIncludeBytesReceivedPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_RECEIVED_PER_SEC, oldIncludeBytesReceivedPerSec, includeBytesReceivedPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalBytesSent() {
		return includeTotalBytesSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalBytesSent(Boolean newIncludeTotalBytesSent) {
		Boolean oldIncludeTotalBytesSent = includeTotalBytesSent;
		includeTotalBytesSent = newIncludeTotalBytesSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_BYTES_SENT, oldIncludeTotalBytesSent, includeTotalBytesSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeBytesSentPerSec() {
		return includeBytesSentPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeBytesSentPerSec(Boolean newIncludeBytesSentPerSec) {
		Boolean oldIncludeBytesSentPerSec = includeBytesSentPerSec;
		includeBytesSentPerSec = newIncludeBytesSentPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_SENT_PER_SEC, oldIncludeBytesSentPerSec, includeBytesSentPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeBytesTranferredPerSec() {
		return includeBytesTranferredPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeBytesTranferredPerSec(Boolean newIncludeBytesTranferredPerSec) {
		Boolean oldIncludeBytesTranferredPerSec = includeBytesTranferredPerSec;
		includeBytesTranferredPerSec = newIncludeBytesTranferredPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_TRANFERRED_PER_SEC, oldIncludeBytesTranferredPerSec, includeBytesTranferredPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeBytesWrittenPerSec() {
		return includeBytesWrittenPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeBytesWrittenPerSec(Boolean newIncludeBytesWrittenPerSec) {
		Boolean oldIncludeBytesWrittenPerSec = includeBytesWrittenPerSec;
		includeBytesWrittenPerSec = newIncludeBytesWrittenPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_WRITTEN_PER_SEC, oldIncludeBytesWrittenPerSec, includeBytesWrittenPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeFilesOpenedPerSec() {
		return includeFilesOpenedPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeFilesOpenedPerSec(Boolean newIncludeFilesOpenedPerSec) {
		Boolean oldIncludeFilesOpenedPerSec = includeFilesOpenedPerSec;
		includeFilesOpenedPerSec = newIncludeFilesOpenedPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_FILES_OPENED_PER_SEC, oldIncludeFilesOpenedPerSec, includeFilesOpenedPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalOpenFileCount() {
		return includeTotalOpenFileCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalOpenFileCount(Boolean newIncludeTotalOpenFileCount) {
		Boolean oldIncludeTotalOpenFileCount = includeTotalOpenFileCount;
		includeTotalOpenFileCount = newIncludeTotalOpenFileCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_OPEN_FILE_COUNT, oldIncludeTotalOpenFileCount, includeTotalOpenFileCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeCurrentPendingRequests() {
		return includeCurrentPendingRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeCurrentPendingRequests(Boolean newIncludeCurrentPendingRequests) {
		Boolean oldIncludeCurrentPendingRequests = includeCurrentPendingRequests;
		includeCurrentPendingRequests = newIncludeCurrentPendingRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_CURRENT_PENDING_REQUESTS, oldIncludeCurrentPendingRequests, includeCurrentPendingRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeReadRequestsProcessedPerSec() {
		return includeReadRequestsProcessedPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeReadRequestsProcessedPerSec(Boolean newIncludeReadRequestsProcessedPerSec) {
		Boolean oldIncludeReadRequestsProcessedPerSec = includeReadRequestsProcessedPerSec;
		includeReadRequestsProcessedPerSec = newIncludeReadRequestsProcessedPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_READ_REQUESTS_PROCESSED_PER_SEC, oldIncludeReadRequestsProcessedPerSec, includeReadRequestsProcessedPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalRequestsReceived() {
		return includeTotalRequestsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalRequestsReceived(Boolean newIncludeTotalRequestsReceived) {
		Boolean oldIncludeTotalRequestsReceived = includeTotalRequestsReceived;
		includeTotalRequestsReceived = newIncludeTotalRequestsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_REQUESTS_RECEIVED, oldIncludeTotalRequestsReceived, includeTotalRequestsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeRequestsReceivedPerSec() {
		return includeRequestsReceivedPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeRequestsReceivedPerSec(Boolean newIncludeRequestsReceivedPerSec) {
		Boolean oldIncludeRequestsReceivedPerSec = includeRequestsReceivedPerSec;
		includeRequestsReceivedPerSec = newIncludeRequestsReceivedPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_REQUESTS_RECEIVED_PER_SEC, oldIncludeRequestsReceivedPerSec, includeRequestsReceivedPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalDurableHandleReopenCount() {
		return includeTotalDurableHandleReopenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalDurableHandleReopenCount(Boolean newIncludeTotalDurableHandleReopenCount) {
		Boolean oldIncludeTotalDurableHandleReopenCount = includeTotalDurableHandleReopenCount;
		includeTotalDurableHandleReopenCount = newIncludeTotalDurableHandleReopenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_DURABLE_HANDLE_REOPEN_COUNT, oldIncludeTotalDurableHandleReopenCount, includeTotalDurableHandleReopenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalFailedDurableHandleReopenCount() {
		return includeTotalFailedDurableHandleReopenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalFailedDurableHandleReopenCount(Boolean newIncludeTotalFailedDurableHandleReopenCount) {
		Boolean oldIncludeTotalFailedDurableHandleReopenCount = includeTotalFailedDurableHandleReopenCount;
		includeTotalFailedDurableHandleReopenCount = newIncludeTotalFailedDurableHandleReopenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT, oldIncludeTotalFailedDurableHandleReopenCount, includeTotalFailedDurableHandleReopenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalFailedResilientHandleReopenCount() {
		return includeTotalFailedResilientHandleReopenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalFailedResilientHandleReopenCount(Boolean newIncludeTotalFailedResilientHandleReopenCount) {
		Boolean oldIncludeTotalFailedResilientHandleReopenCount = includeTotalFailedResilientHandleReopenCount;
		includeTotalFailedResilientHandleReopenCount = newIncludeTotalFailedResilientHandleReopenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT, oldIncludeTotalFailedResilientHandleReopenCount, includeTotalFailedResilientHandleReopenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeCurrentOpenFileCount() {
		return includeCurrentOpenFileCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeCurrentOpenFileCount(Boolean newIncludeCurrentOpenFileCount) {
		Boolean oldIncludeCurrentOpenFileCount = includeCurrentOpenFileCount;
		includeCurrentOpenFileCount = newIncludeCurrentOpenFileCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_CURRENT_OPEN_FILE_COUNT, oldIncludeCurrentOpenFileCount, includeCurrentOpenFileCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalResilientHandleReopenCount() {
		return includeTotalResilientHandleReopenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalResilientHandleReopenCount(Boolean newIncludeTotalResilientHandleReopenCount) {
		Boolean oldIncludeTotalResilientHandleReopenCount = includeTotalResilientHandleReopenCount;
		includeTotalResilientHandleReopenCount = newIncludeTotalResilientHandleReopenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_RESILIENT_HANDLE_REOPEN_COUNT, oldIncludeTotalResilientHandleReopenCount, includeTotalResilientHandleReopenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalPersistentHandleReopenCount() {
		return includeTotalPersistentHandleReopenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalPersistentHandleReopenCount(Boolean newIncludeTotalPersistentHandleReopenCount) {
		Boolean oldIncludeTotalPersistentHandleReopenCount = includeTotalPersistentHandleReopenCount;
		includeTotalPersistentHandleReopenCount = newIncludeTotalPersistentHandleReopenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT, oldIncludeTotalPersistentHandleReopenCount, includeTotalPersistentHandleReopenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalFailedPersistentHandleReopenCount() {
		return includeTotalFailedPersistentHandleReopenCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalFailedPersistentHandleReopenCount(Boolean newIncludeTotalFailedPersistentHandleReopenCount) {
		Boolean oldIncludeTotalFailedPersistentHandleReopenCount = includeTotalFailedPersistentHandleReopenCount;
		includeTotalFailedPersistentHandleReopenCount = newIncludeTotalFailedPersistentHandleReopenCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT, oldIncludeTotalFailedPersistentHandleReopenCount, includeTotalFailedPersistentHandleReopenCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTreeConnectCount() {
		return includeTreeConnectCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTreeConnectCount(Boolean newIncludeTreeConnectCount) {
		Boolean oldIncludeTreeConnectCount = includeTreeConnectCount;
		includeTreeConnectCount = newIncludeTreeConnectCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TREE_CONNECT_COUNT, oldIncludeTreeConnectCount, includeTreeConnectCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeWriteRequestsProcessedPerSec() {
		return includeWriteRequestsProcessedPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeWriteRequestsProcessedPerSec(Boolean newIncludeWriteRequestsProcessedPerSec) {
		Boolean oldIncludeWriteRequestsProcessedPerSec = includeWriteRequestsProcessedPerSec;
		includeWriteRequestsProcessedPerSec = newIncludeWriteRequestsProcessedPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_WRITE_REQUESTS_PROCESSED_PER_SEC, oldIncludeWriteRequestsProcessedPerSec, includeWriteRequestsProcessedPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalMetadataRequestsReceived() {
		return includeTotalMetadataRequestsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalMetadataRequestsReceived(Boolean newIncludeTotalMetadataRequestsReceived) {
		Boolean oldIncludeTotalMetadataRequestsReceived = includeTotalMetadataRequestsReceived;
		includeTotalMetadataRequestsReceived = newIncludeTotalMetadataRequestsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_METADATA_REQUESTS_RECEIVED, oldIncludeTotalMetadataRequestsReceived, includeTotalMetadataRequestsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeMetadataRequestsReceivedPerSec() {
		return includeMetadataRequestsReceivedPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeMetadataRequestsReceivedPerSec(Boolean newIncludeMetadataRequestsReceivedPerSec) {
		Boolean oldIncludeMetadataRequestsReceivedPerSec = includeMetadataRequestsReceivedPerSec;
		includeMetadataRequestsReceivedPerSec = newIncludeMetadataRequestsReceivedPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_REQUESTS_RECEIVED_PER_SEC, oldIncludeMetadataRequestsReceivedPerSec, includeMetadataRequestsReceivedPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeAverageTimePerDataRequest() {
		return includeAverageTimePerDataRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeAverageTimePerDataRequest(Boolean newIncludeAverageTimePerDataRequest) {
		Boolean oldIncludeAverageTimePerDataRequest = includeAverageTimePerDataRequest;
		includeAverageTimePerDataRequest = newIncludeAverageTimePerDataRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_TIME_PER_DATA_REQUEST, oldIncludeAverageTimePerDataRequest, includeAverageTimePerDataRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeAverageBytesPerDataRequest() {
		return includeAverageBytesPerDataRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeAverageBytesPerDataRequest(Boolean newIncludeAverageBytesPerDataRequest) {
		Boolean oldIncludeAverageBytesPerDataRequest = includeAverageBytesPerDataRequest;
		includeAverageBytesPerDataRequest = newIncludeAverageBytesPerDataRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_BYTES_PER_DATA_REQUEST, oldIncludeAverageBytesPerDataRequest, includeAverageBytesPerDataRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeAverageBytesPerReadRequest() {
		return includeAverageBytesPerReadRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeAverageBytesPerReadRequest(Boolean newIncludeAverageBytesPerReadRequest) {
		Boolean oldIncludeAverageBytesPerReadRequest = includeAverageBytesPerReadRequest;
		includeAverageBytesPerReadRequest = newIncludeAverageBytesPerReadRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_BYTES_PER_READ_REQUEST, oldIncludeAverageBytesPerReadRequest, includeAverageBytesPerReadRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeAverageBytesPerWriteRequest() {
		return includeAverageBytesPerWriteRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeAverageBytesPerWriteRequest(Boolean newIncludeAverageBytesPerWriteRequest) {
		Boolean oldIncludeAverageBytesPerWriteRequest = includeAverageBytesPerWriteRequest;
		includeAverageBytesPerWriteRequest = newIncludeAverageBytesPerWriteRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_BYTES_PER_WRITE_REQUEST, oldIncludeAverageBytesPerWriteRequest, includeAverageBytesPerWriteRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeAverageReadQueueLength() {
		return includeAverageReadQueueLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeAverageReadQueueLength(Boolean newIncludeAverageReadQueueLength) {
		Boolean oldIncludeAverageReadQueueLength = includeAverageReadQueueLength;
		includeAverageReadQueueLength = newIncludeAverageReadQueueLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_READ_QUEUE_LENGTH, oldIncludeAverageReadQueueLength, includeAverageReadQueueLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeAverageWriteQueueLength() {
		return includeAverageWriteQueueLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeAverageWriteQueueLength(Boolean newIncludeAverageWriteQueueLength) {
		Boolean oldIncludeAverageWriteQueueLength = includeAverageWriteQueueLength;
		includeAverageWriteQueueLength = newIncludeAverageWriteQueueLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_WRITE_QUEUE_LENGTH, oldIncludeAverageWriteQueueLength, includeAverageWriteQueueLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeAverageDataQueueLength() {
		return includeAverageDataQueueLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeAverageDataQueueLength(Boolean newIncludeAverageDataQueueLength) {
		Boolean oldIncludeAverageDataQueueLength = includeAverageDataQueueLength;
		includeAverageDataQueueLength = newIncludeAverageDataQueueLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_DATA_QUEUE_LENGTH, oldIncludeAverageDataQueueLength, includeAverageDataQueueLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeDataBytesPerSec() {
		return includeDataBytesPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeDataBytesPerSec(Boolean newIncludeDataBytesPerSec) {
		Boolean oldIncludeDataBytesPerSec = includeDataBytesPerSec;
		includeDataBytesPerSec = newIncludeDataBytesPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_DATA_BYTES_PER_SEC, oldIncludeDataBytesPerSec, includeDataBytesPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeDataRequestsPerSec() {
		return includeDataRequestsPerSec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeDataRequestsPerSec(Boolean newIncludeDataRequestsPerSec) {
		Boolean oldIncludeDataRequestsPerSec = includeDataRequestsPerSec;
		includeDataRequestsPerSec = newIncludeDataRequestsPerSec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_DATA_REQUESTS_PER_SEC, oldIncludeDataRequestsPerSec, includeDataRequestsPerSec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeCurrentDataQueueLength() {
		return includeCurrentDataQueueLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeCurrentDataQueueLength(Boolean newIncludeCurrentDataQueueLength) {
		Boolean oldIncludeCurrentDataQueueLength = includeCurrentDataQueueLength;
		includeCurrentDataQueueLength = newIncludeCurrentDataQueueLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_CURRENT_DATA_QUEUE_LENGTH, oldIncludeCurrentDataQueueLength, includeCurrentDataQueueLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__ELEMENT_TYPE:
				return getElementType();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__OTHER_ELEMENT_TYPE_DESCRIPTION:
				return getOtherElementTypeDescription();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_START_STATISTIC_TIME:
				return getIncludeStartStatisticTime();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_STATISTIC_TIME:
				return getIncludeStatisticTime();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_IOS:
				return getIncludeTotalIOs();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_BYTES_TRANSFERRED:
				return getIncludeTotalBytesTransferred();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_READ_IOS:
				return getIncludeReadIOs();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_WRITE_IOS:
				return getIncludeWriteIOs();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_OTHER_IOS:
				return getIncludeOtherIOs();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_READ_IOS:
				return getIncludeMetadataReadIOs();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_WRITE_IOS:
				return getIncludeMetadataWriteIOs();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_IO_TIME_COUNTER:
				return getIncludeTotalIOTimeCounter();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_IDLE_TIME_COUNTER:
				return getIncludeTotalIdleTimeCounter();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_READ_IO_TIME_COUNTER:
				return getIncludeReadIOTimeCounter();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_READ:
				return getIncludeBytesRead();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_WRITE_IO_TIME_COUNTER:
				return getIncludeWriteIOTimeCounter();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_WRITTEN:
				return getIncludeBytesWritten();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_BYTES_READ:
				return getIncludeMetadataBytesRead();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_BYTES_WRITTEN:
				return getIncludeMetadataBytesWritten();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_PERCENT_DURABLE_OPENS:
				return getIncludePercentDurableOpens();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_PERCENT_RESILIENT_OPENS:
				return getIncludePercentResilientOpens();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_PERCENT_PERSISTENT_OPENS:
				return getIncludePercentPersistentOpens();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_READ_RESPONSE_TIME:
				return getIncludeAverageReadResponseTime();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_WRITE_RESPONSE_TIME:
				return getIncludeAverageWriteResponseTime();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_REQUEST_RESPONSE_TIME:
				return getIncludeAverageRequestResponseTime();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_READ_PER_SEC:
				return getIncludeBytesReadPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_BYTES_RECEIVED:
				return getIncludeTotalBytesReceived();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_RECEIVED_PER_SEC:
				return getIncludeBytesReceivedPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_BYTES_SENT:
				return getIncludeTotalBytesSent();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_SENT_PER_SEC:
				return getIncludeBytesSentPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_TRANFERRED_PER_SEC:
				return getIncludeBytesTranferredPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_WRITTEN_PER_SEC:
				return getIncludeBytesWrittenPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_FILES_OPENED_PER_SEC:
				return getIncludeFilesOpenedPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_OPEN_FILE_COUNT:
				return getIncludeTotalOpenFileCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_CURRENT_PENDING_REQUESTS:
				return getIncludeCurrentPendingRequests();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_READ_REQUESTS_PROCESSED_PER_SEC:
				return getIncludeReadRequestsProcessedPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_REQUESTS_RECEIVED:
				return getIncludeTotalRequestsReceived();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_REQUESTS_RECEIVED_PER_SEC:
				return getIncludeRequestsReceivedPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_DURABLE_HANDLE_REOPEN_COUNT:
				return getIncludeTotalDurableHandleReopenCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT:
				return getIncludeTotalFailedDurableHandleReopenCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT:
				return getIncludeTotalFailedResilientHandleReopenCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_CURRENT_OPEN_FILE_COUNT:
				return getIncludeCurrentOpenFileCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_RESILIENT_HANDLE_REOPEN_COUNT:
				return getIncludeTotalResilientHandleReopenCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT:
				return getIncludeTotalPersistentHandleReopenCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT:
				return getIncludeTotalFailedPersistentHandleReopenCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TREE_CONNECT_COUNT:
				return getIncludeTreeConnectCount();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_WRITE_REQUESTS_PROCESSED_PER_SEC:
				return getIncludeWriteRequestsProcessedPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_METADATA_REQUESTS_RECEIVED:
				return getIncludeTotalMetadataRequestsReceived();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_REQUESTS_RECEIVED_PER_SEC:
				return getIncludeMetadataRequestsReceivedPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_TIME_PER_DATA_REQUEST:
				return getIncludeAverageTimePerDataRequest();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_BYTES_PER_DATA_REQUEST:
				return getIncludeAverageBytesPerDataRequest();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_BYTES_PER_READ_REQUEST:
				return getIncludeAverageBytesPerReadRequest();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_BYTES_PER_WRITE_REQUEST:
				return getIncludeAverageBytesPerWriteRequest();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_READ_QUEUE_LENGTH:
				return getIncludeAverageReadQueueLength();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_WRITE_QUEUE_LENGTH:
				return getIncludeAverageWriteQueueLength();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_DATA_QUEUE_LENGTH:
				return getIncludeAverageDataQueueLength();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_DATA_BYTES_PER_SEC:
				return getIncludeDataBytesPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_DATA_REQUESTS_PER_SEC:
				return getIncludeDataRequestsPerSec();
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_CURRENT_DATA_QUEUE_LENGTH:
				return getIncludeCurrentDataQueueLength();
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
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__ELEMENT_TYPE:
				setElementType((Integer)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__OTHER_ELEMENT_TYPE_DESCRIPTION:
				setOtherElementTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_START_STATISTIC_TIME:
				setIncludeStartStatisticTime((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_STATISTIC_TIME:
				setIncludeStatisticTime((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_IOS:
				setIncludeTotalIOs((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_BYTES_TRANSFERRED:
				setIncludeTotalBytesTransferred((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_READ_IOS:
				setIncludeReadIOs((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_WRITE_IOS:
				setIncludeWriteIOs((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_OTHER_IOS:
				setIncludeOtherIOs((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_READ_IOS:
				setIncludeMetadataReadIOs((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_WRITE_IOS:
				setIncludeMetadataWriteIOs((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_IO_TIME_COUNTER:
				setIncludeTotalIOTimeCounter((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_IDLE_TIME_COUNTER:
				setIncludeTotalIdleTimeCounter((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_READ_IO_TIME_COUNTER:
				setIncludeReadIOTimeCounter((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_READ:
				setIncludeBytesRead((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_WRITE_IO_TIME_COUNTER:
				setIncludeWriteIOTimeCounter((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_WRITTEN:
				setIncludeBytesWritten((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_BYTES_READ:
				setIncludeMetadataBytesRead((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_BYTES_WRITTEN:
				setIncludeMetadataBytesWritten((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_PERCENT_DURABLE_OPENS:
				setIncludePercentDurableOpens((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_PERCENT_RESILIENT_OPENS:
				setIncludePercentResilientOpens((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_PERCENT_PERSISTENT_OPENS:
				setIncludePercentPersistentOpens((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_READ_RESPONSE_TIME:
				setIncludeAverageReadResponseTime((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_WRITE_RESPONSE_TIME:
				setIncludeAverageWriteResponseTime((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_REQUEST_RESPONSE_TIME:
				setIncludeAverageRequestResponseTime((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_READ_PER_SEC:
				setIncludeBytesReadPerSec((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_BYTES_RECEIVED:
				setIncludeTotalBytesReceived((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_RECEIVED_PER_SEC:
				setIncludeBytesReceivedPerSec((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_BYTES_SENT:
				setIncludeTotalBytesSent((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_SENT_PER_SEC:
				setIncludeBytesSentPerSec((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_TRANFERRED_PER_SEC:
				setIncludeBytesTranferredPerSec((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_WRITTEN_PER_SEC:
				setIncludeBytesWrittenPerSec((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_FILES_OPENED_PER_SEC:
				setIncludeFilesOpenedPerSec((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_OPEN_FILE_COUNT:
				setIncludeTotalOpenFileCount((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_CURRENT_PENDING_REQUESTS:
				setIncludeCurrentPendingRequests((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_READ_REQUESTS_PROCESSED_PER_SEC:
				setIncludeReadRequestsProcessedPerSec((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_REQUESTS_RECEIVED:
				setIncludeTotalRequestsReceived((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_REQUESTS_RECEIVED_PER_SEC:
				setIncludeRequestsReceivedPerSec((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_DURABLE_HANDLE_REOPEN_COUNT:
				setIncludeTotalDurableHandleReopenCount((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT:
				setIncludeTotalFailedDurableHandleReopenCount((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT:
				setIncludeTotalFailedResilientHandleReopenCount((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_CURRENT_OPEN_FILE_COUNT:
				setIncludeCurrentOpenFileCount((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_RESILIENT_HANDLE_REOPEN_COUNT:
				setIncludeTotalResilientHandleReopenCount((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT:
				setIncludeTotalPersistentHandleReopenCount((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT:
				setIncludeTotalFailedPersistentHandleReopenCount((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TREE_CONNECT_COUNT:
				setIncludeTreeConnectCount((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_WRITE_REQUESTS_PROCESSED_PER_SEC:
				setIncludeWriteRequestsProcessedPerSec((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_METADATA_REQUESTS_RECEIVED:
				setIncludeTotalMetadataRequestsReceived((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_REQUESTS_RECEIVED_PER_SEC:
				setIncludeMetadataRequestsReceivedPerSec((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_TIME_PER_DATA_REQUEST:
				setIncludeAverageTimePerDataRequest((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_BYTES_PER_DATA_REQUEST:
				setIncludeAverageBytesPerDataRequest((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_BYTES_PER_READ_REQUEST:
				setIncludeAverageBytesPerReadRequest((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_BYTES_PER_WRITE_REQUEST:
				setIncludeAverageBytesPerWriteRequest((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_READ_QUEUE_LENGTH:
				setIncludeAverageReadQueueLength((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_WRITE_QUEUE_LENGTH:
				setIncludeAverageWriteQueueLength((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_DATA_QUEUE_LENGTH:
				setIncludeAverageDataQueueLength((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_DATA_BYTES_PER_SEC:
				setIncludeDataBytesPerSec((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_DATA_REQUESTS_PER_SEC:
				setIncludeDataRequestsPerSec((Boolean)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_CURRENT_DATA_QUEUE_LENGTH:
				setIncludeCurrentDataQueueLength((Boolean)newValue);
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
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__ELEMENT_TYPE:
				setElementType(ELEMENT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__OTHER_ELEMENT_TYPE_DESCRIPTION:
				setOtherElementTypeDescription(OTHER_ELEMENT_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_START_STATISTIC_TIME:
				setIncludeStartStatisticTime(INCLUDE_START_STATISTIC_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_STATISTIC_TIME:
				setIncludeStatisticTime(INCLUDE_STATISTIC_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_IOS:
				setIncludeTotalIOs(INCLUDE_TOTAL_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_BYTES_TRANSFERRED:
				setIncludeTotalBytesTransferred(INCLUDE_TOTAL_BYTES_TRANSFERRED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_READ_IOS:
				setIncludeReadIOs(INCLUDE_READ_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_WRITE_IOS:
				setIncludeWriteIOs(INCLUDE_WRITE_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_OTHER_IOS:
				setIncludeOtherIOs(INCLUDE_OTHER_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_READ_IOS:
				setIncludeMetadataReadIOs(INCLUDE_METADATA_READ_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_WRITE_IOS:
				setIncludeMetadataWriteIOs(INCLUDE_METADATA_WRITE_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_IO_TIME_COUNTER:
				setIncludeTotalIOTimeCounter(INCLUDE_TOTAL_IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_IDLE_TIME_COUNTER:
				setIncludeTotalIdleTimeCounter(INCLUDE_TOTAL_IDLE_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_READ_IO_TIME_COUNTER:
				setIncludeReadIOTimeCounter(INCLUDE_READ_IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_READ:
				setIncludeBytesRead(INCLUDE_BYTES_READ_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_WRITE_IO_TIME_COUNTER:
				setIncludeWriteIOTimeCounter(INCLUDE_WRITE_IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_WRITTEN:
				setIncludeBytesWritten(INCLUDE_BYTES_WRITTEN_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_BYTES_READ:
				setIncludeMetadataBytesRead(INCLUDE_METADATA_BYTES_READ_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_BYTES_WRITTEN:
				setIncludeMetadataBytesWritten(INCLUDE_METADATA_BYTES_WRITTEN_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_PERCENT_DURABLE_OPENS:
				setIncludePercentDurableOpens(INCLUDE_PERCENT_DURABLE_OPENS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_PERCENT_RESILIENT_OPENS:
				setIncludePercentResilientOpens(INCLUDE_PERCENT_RESILIENT_OPENS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_PERCENT_PERSISTENT_OPENS:
				setIncludePercentPersistentOpens(INCLUDE_PERCENT_PERSISTENT_OPENS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_READ_RESPONSE_TIME:
				setIncludeAverageReadResponseTime(INCLUDE_AVERAGE_READ_RESPONSE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_WRITE_RESPONSE_TIME:
				setIncludeAverageWriteResponseTime(INCLUDE_AVERAGE_WRITE_RESPONSE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_REQUEST_RESPONSE_TIME:
				setIncludeAverageRequestResponseTime(INCLUDE_AVERAGE_REQUEST_RESPONSE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_READ_PER_SEC:
				setIncludeBytesReadPerSec(INCLUDE_BYTES_READ_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_BYTES_RECEIVED:
				setIncludeTotalBytesReceived(INCLUDE_TOTAL_BYTES_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_RECEIVED_PER_SEC:
				setIncludeBytesReceivedPerSec(INCLUDE_BYTES_RECEIVED_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_BYTES_SENT:
				setIncludeTotalBytesSent(INCLUDE_TOTAL_BYTES_SENT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_SENT_PER_SEC:
				setIncludeBytesSentPerSec(INCLUDE_BYTES_SENT_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_TRANFERRED_PER_SEC:
				setIncludeBytesTranferredPerSec(INCLUDE_BYTES_TRANFERRED_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_WRITTEN_PER_SEC:
				setIncludeBytesWrittenPerSec(INCLUDE_BYTES_WRITTEN_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_FILES_OPENED_PER_SEC:
				setIncludeFilesOpenedPerSec(INCLUDE_FILES_OPENED_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_OPEN_FILE_COUNT:
				setIncludeTotalOpenFileCount(INCLUDE_TOTAL_OPEN_FILE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_CURRENT_PENDING_REQUESTS:
				setIncludeCurrentPendingRequests(INCLUDE_CURRENT_PENDING_REQUESTS_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_READ_REQUESTS_PROCESSED_PER_SEC:
				setIncludeReadRequestsProcessedPerSec(INCLUDE_READ_REQUESTS_PROCESSED_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_REQUESTS_RECEIVED:
				setIncludeTotalRequestsReceived(INCLUDE_TOTAL_REQUESTS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_REQUESTS_RECEIVED_PER_SEC:
				setIncludeRequestsReceivedPerSec(INCLUDE_REQUESTS_RECEIVED_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_DURABLE_HANDLE_REOPEN_COUNT:
				setIncludeTotalDurableHandleReopenCount(INCLUDE_TOTAL_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT:
				setIncludeTotalFailedDurableHandleReopenCount(INCLUDE_TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT:
				setIncludeTotalFailedResilientHandleReopenCount(INCLUDE_TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_CURRENT_OPEN_FILE_COUNT:
				setIncludeCurrentOpenFileCount(INCLUDE_CURRENT_OPEN_FILE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_RESILIENT_HANDLE_REOPEN_COUNT:
				setIncludeTotalResilientHandleReopenCount(INCLUDE_TOTAL_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT:
				setIncludeTotalPersistentHandleReopenCount(INCLUDE_TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT:
				setIncludeTotalFailedPersistentHandleReopenCount(INCLUDE_TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TREE_CONNECT_COUNT:
				setIncludeTreeConnectCount(INCLUDE_TREE_CONNECT_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_WRITE_REQUESTS_PROCESSED_PER_SEC:
				setIncludeWriteRequestsProcessedPerSec(INCLUDE_WRITE_REQUESTS_PROCESSED_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_METADATA_REQUESTS_RECEIVED:
				setIncludeTotalMetadataRequestsReceived(INCLUDE_TOTAL_METADATA_REQUESTS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_REQUESTS_RECEIVED_PER_SEC:
				setIncludeMetadataRequestsReceivedPerSec(INCLUDE_METADATA_REQUESTS_RECEIVED_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_TIME_PER_DATA_REQUEST:
				setIncludeAverageTimePerDataRequest(INCLUDE_AVERAGE_TIME_PER_DATA_REQUEST_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_BYTES_PER_DATA_REQUEST:
				setIncludeAverageBytesPerDataRequest(INCLUDE_AVERAGE_BYTES_PER_DATA_REQUEST_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_BYTES_PER_READ_REQUEST:
				setIncludeAverageBytesPerReadRequest(INCLUDE_AVERAGE_BYTES_PER_READ_REQUEST_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_BYTES_PER_WRITE_REQUEST:
				setIncludeAverageBytesPerWriteRequest(INCLUDE_AVERAGE_BYTES_PER_WRITE_REQUEST_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_READ_QUEUE_LENGTH:
				setIncludeAverageReadQueueLength(INCLUDE_AVERAGE_READ_QUEUE_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_WRITE_QUEUE_LENGTH:
				setIncludeAverageWriteQueueLength(INCLUDE_AVERAGE_WRITE_QUEUE_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_DATA_QUEUE_LENGTH:
				setIncludeAverageDataQueueLength(INCLUDE_AVERAGE_DATA_QUEUE_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_DATA_BYTES_PER_SEC:
				setIncludeDataBytesPerSec(INCLUDE_DATA_BYTES_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_DATA_REQUESTS_PER_SEC:
				setIncludeDataRequestsPerSec(INCLUDE_DATA_REQUESTS_PER_SEC_EDEFAULT);
				return;
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_CURRENT_DATA_QUEUE_LENGTH:
				setIncludeCurrentDataQueueLength(INCLUDE_CURRENT_DATA_QUEUE_LENGTH_EDEFAULT);
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
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__ELEMENT_TYPE:
				return ELEMENT_TYPE_EDEFAULT == null ? elementType != null : !ELEMENT_TYPE_EDEFAULT.equals(elementType);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__OTHER_ELEMENT_TYPE_DESCRIPTION:
				return OTHER_ELEMENT_TYPE_DESCRIPTION_EDEFAULT == null ? otherElementTypeDescription != null : !OTHER_ELEMENT_TYPE_DESCRIPTION_EDEFAULT.equals(otherElementTypeDescription);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_START_STATISTIC_TIME:
				return INCLUDE_START_STATISTIC_TIME_EDEFAULT == null ? includeStartStatisticTime != null : !INCLUDE_START_STATISTIC_TIME_EDEFAULT.equals(includeStartStatisticTime);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_STATISTIC_TIME:
				return INCLUDE_STATISTIC_TIME_EDEFAULT == null ? includeStatisticTime != null : !INCLUDE_STATISTIC_TIME_EDEFAULT.equals(includeStatisticTime);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_IOS:
				return INCLUDE_TOTAL_IOS_EDEFAULT == null ? includeTotalIOs != null : !INCLUDE_TOTAL_IOS_EDEFAULT.equals(includeTotalIOs);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_BYTES_TRANSFERRED:
				return INCLUDE_TOTAL_BYTES_TRANSFERRED_EDEFAULT == null ? includeTotalBytesTransferred != null : !INCLUDE_TOTAL_BYTES_TRANSFERRED_EDEFAULT.equals(includeTotalBytesTransferred);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_READ_IOS:
				return INCLUDE_READ_IOS_EDEFAULT == null ? includeReadIOs != null : !INCLUDE_READ_IOS_EDEFAULT.equals(includeReadIOs);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_WRITE_IOS:
				return INCLUDE_WRITE_IOS_EDEFAULT == null ? includeWriteIOs != null : !INCLUDE_WRITE_IOS_EDEFAULT.equals(includeWriteIOs);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_OTHER_IOS:
				return INCLUDE_OTHER_IOS_EDEFAULT == null ? includeOtherIOs != null : !INCLUDE_OTHER_IOS_EDEFAULT.equals(includeOtherIOs);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_READ_IOS:
				return INCLUDE_METADATA_READ_IOS_EDEFAULT == null ? includeMetadataReadIOs != null : !INCLUDE_METADATA_READ_IOS_EDEFAULT.equals(includeMetadataReadIOs);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_WRITE_IOS:
				return INCLUDE_METADATA_WRITE_IOS_EDEFAULT == null ? includeMetadataWriteIOs != null : !INCLUDE_METADATA_WRITE_IOS_EDEFAULT.equals(includeMetadataWriteIOs);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_IO_TIME_COUNTER:
				return INCLUDE_TOTAL_IO_TIME_COUNTER_EDEFAULT == null ? includeTotalIOTimeCounter != null : !INCLUDE_TOTAL_IO_TIME_COUNTER_EDEFAULT.equals(includeTotalIOTimeCounter);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_IDLE_TIME_COUNTER:
				return INCLUDE_TOTAL_IDLE_TIME_COUNTER_EDEFAULT == null ? includeTotalIdleTimeCounter != null : !INCLUDE_TOTAL_IDLE_TIME_COUNTER_EDEFAULT.equals(includeTotalIdleTimeCounter);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_READ_IO_TIME_COUNTER:
				return INCLUDE_READ_IO_TIME_COUNTER_EDEFAULT == null ? includeReadIOTimeCounter != null : !INCLUDE_READ_IO_TIME_COUNTER_EDEFAULT.equals(includeReadIOTimeCounter);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_READ:
				return INCLUDE_BYTES_READ_EDEFAULT == null ? includeBytesRead != null : !INCLUDE_BYTES_READ_EDEFAULT.equals(includeBytesRead);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_WRITE_IO_TIME_COUNTER:
				return INCLUDE_WRITE_IO_TIME_COUNTER_EDEFAULT == null ? includeWriteIOTimeCounter != null : !INCLUDE_WRITE_IO_TIME_COUNTER_EDEFAULT.equals(includeWriteIOTimeCounter);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_WRITTEN:
				return INCLUDE_BYTES_WRITTEN_EDEFAULT == null ? includeBytesWritten != null : !INCLUDE_BYTES_WRITTEN_EDEFAULT.equals(includeBytesWritten);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_BYTES_READ:
				return INCLUDE_METADATA_BYTES_READ_EDEFAULT == null ? includeMetadataBytesRead != null : !INCLUDE_METADATA_BYTES_READ_EDEFAULT.equals(includeMetadataBytesRead);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_BYTES_WRITTEN:
				return INCLUDE_METADATA_BYTES_WRITTEN_EDEFAULT == null ? includeMetadataBytesWritten != null : !INCLUDE_METADATA_BYTES_WRITTEN_EDEFAULT.equals(includeMetadataBytesWritten);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_PERCENT_DURABLE_OPENS:
				return INCLUDE_PERCENT_DURABLE_OPENS_EDEFAULT == null ? includePercentDurableOpens != null : !INCLUDE_PERCENT_DURABLE_OPENS_EDEFAULT.equals(includePercentDurableOpens);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_PERCENT_RESILIENT_OPENS:
				return INCLUDE_PERCENT_RESILIENT_OPENS_EDEFAULT == null ? includePercentResilientOpens != null : !INCLUDE_PERCENT_RESILIENT_OPENS_EDEFAULT.equals(includePercentResilientOpens);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_PERCENT_PERSISTENT_OPENS:
				return INCLUDE_PERCENT_PERSISTENT_OPENS_EDEFAULT == null ? includePercentPersistentOpens != null : !INCLUDE_PERCENT_PERSISTENT_OPENS_EDEFAULT.equals(includePercentPersistentOpens);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_READ_RESPONSE_TIME:
				return INCLUDE_AVERAGE_READ_RESPONSE_TIME_EDEFAULT == null ? includeAverageReadResponseTime != null : !INCLUDE_AVERAGE_READ_RESPONSE_TIME_EDEFAULT.equals(includeAverageReadResponseTime);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_WRITE_RESPONSE_TIME:
				return INCLUDE_AVERAGE_WRITE_RESPONSE_TIME_EDEFAULT == null ? includeAverageWriteResponseTime != null : !INCLUDE_AVERAGE_WRITE_RESPONSE_TIME_EDEFAULT.equals(includeAverageWriteResponseTime);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_REQUEST_RESPONSE_TIME:
				return INCLUDE_AVERAGE_REQUEST_RESPONSE_TIME_EDEFAULT == null ? includeAverageRequestResponseTime != null : !INCLUDE_AVERAGE_REQUEST_RESPONSE_TIME_EDEFAULT.equals(includeAverageRequestResponseTime);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_READ_PER_SEC:
				return INCLUDE_BYTES_READ_PER_SEC_EDEFAULT == null ? includeBytesReadPerSec != null : !INCLUDE_BYTES_READ_PER_SEC_EDEFAULT.equals(includeBytesReadPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_BYTES_RECEIVED:
				return INCLUDE_TOTAL_BYTES_RECEIVED_EDEFAULT == null ? includeTotalBytesReceived != null : !INCLUDE_TOTAL_BYTES_RECEIVED_EDEFAULT.equals(includeTotalBytesReceived);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_RECEIVED_PER_SEC:
				return INCLUDE_BYTES_RECEIVED_PER_SEC_EDEFAULT == null ? includeBytesReceivedPerSec != null : !INCLUDE_BYTES_RECEIVED_PER_SEC_EDEFAULT.equals(includeBytesReceivedPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_BYTES_SENT:
				return INCLUDE_TOTAL_BYTES_SENT_EDEFAULT == null ? includeTotalBytesSent != null : !INCLUDE_TOTAL_BYTES_SENT_EDEFAULT.equals(includeTotalBytesSent);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_SENT_PER_SEC:
				return INCLUDE_BYTES_SENT_PER_SEC_EDEFAULT == null ? includeBytesSentPerSec != null : !INCLUDE_BYTES_SENT_PER_SEC_EDEFAULT.equals(includeBytesSentPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_TRANFERRED_PER_SEC:
				return INCLUDE_BYTES_TRANFERRED_PER_SEC_EDEFAULT == null ? includeBytesTranferredPerSec != null : !INCLUDE_BYTES_TRANFERRED_PER_SEC_EDEFAULT.equals(includeBytesTranferredPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_BYTES_WRITTEN_PER_SEC:
				return INCLUDE_BYTES_WRITTEN_PER_SEC_EDEFAULT == null ? includeBytesWrittenPerSec != null : !INCLUDE_BYTES_WRITTEN_PER_SEC_EDEFAULT.equals(includeBytesWrittenPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_FILES_OPENED_PER_SEC:
				return INCLUDE_FILES_OPENED_PER_SEC_EDEFAULT == null ? includeFilesOpenedPerSec != null : !INCLUDE_FILES_OPENED_PER_SEC_EDEFAULT.equals(includeFilesOpenedPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_OPEN_FILE_COUNT:
				return INCLUDE_TOTAL_OPEN_FILE_COUNT_EDEFAULT == null ? includeTotalOpenFileCount != null : !INCLUDE_TOTAL_OPEN_FILE_COUNT_EDEFAULT.equals(includeTotalOpenFileCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_CURRENT_PENDING_REQUESTS:
				return INCLUDE_CURRENT_PENDING_REQUESTS_EDEFAULT == null ? includeCurrentPendingRequests != null : !INCLUDE_CURRENT_PENDING_REQUESTS_EDEFAULT.equals(includeCurrentPendingRequests);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_READ_REQUESTS_PROCESSED_PER_SEC:
				return INCLUDE_READ_REQUESTS_PROCESSED_PER_SEC_EDEFAULT == null ? includeReadRequestsProcessedPerSec != null : !INCLUDE_READ_REQUESTS_PROCESSED_PER_SEC_EDEFAULT.equals(includeReadRequestsProcessedPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_REQUESTS_RECEIVED:
				return INCLUDE_TOTAL_REQUESTS_RECEIVED_EDEFAULT == null ? includeTotalRequestsReceived != null : !INCLUDE_TOTAL_REQUESTS_RECEIVED_EDEFAULT.equals(includeTotalRequestsReceived);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_REQUESTS_RECEIVED_PER_SEC:
				return INCLUDE_REQUESTS_RECEIVED_PER_SEC_EDEFAULT == null ? includeRequestsReceivedPerSec != null : !INCLUDE_REQUESTS_RECEIVED_PER_SEC_EDEFAULT.equals(includeRequestsReceivedPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_DURABLE_HANDLE_REOPEN_COUNT:
				return INCLUDE_TOTAL_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT == null ? includeTotalDurableHandleReopenCount != null : !INCLUDE_TOTAL_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT.equals(includeTotalDurableHandleReopenCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT:
				return INCLUDE_TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT == null ? includeTotalFailedDurableHandleReopenCount != null : !INCLUDE_TOTAL_FAILED_DURABLE_HANDLE_REOPEN_COUNT_EDEFAULT.equals(includeTotalFailedDurableHandleReopenCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT:
				return INCLUDE_TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT == null ? includeTotalFailedResilientHandleReopenCount != null : !INCLUDE_TOTAL_FAILED_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT.equals(includeTotalFailedResilientHandleReopenCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_CURRENT_OPEN_FILE_COUNT:
				return INCLUDE_CURRENT_OPEN_FILE_COUNT_EDEFAULT == null ? includeCurrentOpenFileCount != null : !INCLUDE_CURRENT_OPEN_FILE_COUNT_EDEFAULT.equals(includeCurrentOpenFileCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_RESILIENT_HANDLE_REOPEN_COUNT:
				return INCLUDE_TOTAL_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT == null ? includeTotalResilientHandleReopenCount != null : !INCLUDE_TOTAL_RESILIENT_HANDLE_REOPEN_COUNT_EDEFAULT.equals(includeTotalResilientHandleReopenCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT:
				return INCLUDE_TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT == null ? includeTotalPersistentHandleReopenCount != null : !INCLUDE_TOTAL_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT.equals(includeTotalPersistentHandleReopenCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT:
				return INCLUDE_TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT == null ? includeTotalFailedPersistentHandleReopenCount != null : !INCLUDE_TOTAL_FAILED_PERSISTENT_HANDLE_REOPEN_COUNT_EDEFAULT.equals(includeTotalFailedPersistentHandleReopenCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TREE_CONNECT_COUNT:
				return INCLUDE_TREE_CONNECT_COUNT_EDEFAULT == null ? includeTreeConnectCount != null : !INCLUDE_TREE_CONNECT_COUNT_EDEFAULT.equals(includeTreeConnectCount);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_WRITE_REQUESTS_PROCESSED_PER_SEC:
				return INCLUDE_WRITE_REQUESTS_PROCESSED_PER_SEC_EDEFAULT == null ? includeWriteRequestsProcessedPerSec != null : !INCLUDE_WRITE_REQUESTS_PROCESSED_PER_SEC_EDEFAULT.equals(includeWriteRequestsProcessedPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_TOTAL_METADATA_REQUESTS_RECEIVED:
				return INCLUDE_TOTAL_METADATA_REQUESTS_RECEIVED_EDEFAULT == null ? includeTotalMetadataRequestsReceived != null : !INCLUDE_TOTAL_METADATA_REQUESTS_RECEIVED_EDEFAULT.equals(includeTotalMetadataRequestsReceived);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_METADATA_REQUESTS_RECEIVED_PER_SEC:
				return INCLUDE_METADATA_REQUESTS_RECEIVED_PER_SEC_EDEFAULT == null ? includeMetadataRequestsReceivedPerSec != null : !INCLUDE_METADATA_REQUESTS_RECEIVED_PER_SEC_EDEFAULT.equals(includeMetadataRequestsReceivedPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_TIME_PER_DATA_REQUEST:
				return INCLUDE_AVERAGE_TIME_PER_DATA_REQUEST_EDEFAULT == null ? includeAverageTimePerDataRequest != null : !INCLUDE_AVERAGE_TIME_PER_DATA_REQUEST_EDEFAULT.equals(includeAverageTimePerDataRequest);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_BYTES_PER_DATA_REQUEST:
				return INCLUDE_AVERAGE_BYTES_PER_DATA_REQUEST_EDEFAULT == null ? includeAverageBytesPerDataRequest != null : !INCLUDE_AVERAGE_BYTES_PER_DATA_REQUEST_EDEFAULT.equals(includeAverageBytesPerDataRequest);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_BYTES_PER_READ_REQUEST:
				return INCLUDE_AVERAGE_BYTES_PER_READ_REQUEST_EDEFAULT == null ? includeAverageBytesPerReadRequest != null : !INCLUDE_AVERAGE_BYTES_PER_READ_REQUEST_EDEFAULT.equals(includeAverageBytesPerReadRequest);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_BYTES_PER_WRITE_REQUEST:
				return INCLUDE_AVERAGE_BYTES_PER_WRITE_REQUEST_EDEFAULT == null ? includeAverageBytesPerWriteRequest != null : !INCLUDE_AVERAGE_BYTES_PER_WRITE_REQUEST_EDEFAULT.equals(includeAverageBytesPerWriteRequest);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_READ_QUEUE_LENGTH:
				return INCLUDE_AVERAGE_READ_QUEUE_LENGTH_EDEFAULT == null ? includeAverageReadQueueLength != null : !INCLUDE_AVERAGE_READ_QUEUE_LENGTH_EDEFAULT.equals(includeAverageReadQueueLength);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_WRITE_QUEUE_LENGTH:
				return INCLUDE_AVERAGE_WRITE_QUEUE_LENGTH_EDEFAULT == null ? includeAverageWriteQueueLength != null : !INCLUDE_AVERAGE_WRITE_QUEUE_LENGTH_EDEFAULT.equals(includeAverageWriteQueueLength);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_AVERAGE_DATA_QUEUE_LENGTH:
				return INCLUDE_AVERAGE_DATA_QUEUE_LENGTH_EDEFAULT == null ? includeAverageDataQueueLength != null : !INCLUDE_AVERAGE_DATA_QUEUE_LENGTH_EDEFAULT.equals(includeAverageDataQueueLength);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_DATA_BYTES_PER_SEC:
				return INCLUDE_DATA_BYTES_PER_SEC_EDEFAULT == null ? includeDataBytesPerSec != null : !INCLUDE_DATA_BYTES_PER_SEC_EDEFAULT.equals(includeDataBytesPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_DATA_REQUESTS_PER_SEC:
				return INCLUDE_DATA_REQUESTS_PER_SEC_EDEFAULT == null ? includeDataRequestsPerSec != null : !INCLUDE_DATA_REQUESTS_PER_SEC_EDEFAULT.equals(includeDataRequestsPerSec);
			case CimPackage.CIM_FILE_SYSTEM_STATISTICS_MANIFEST__INCLUDE_CURRENT_DATA_QUEUE_LENGTH:
				return INCLUDE_CURRENT_DATA_QUEUE_LENGTH_EDEFAULT == null ? includeCurrentDataQueueLength != null : !INCLUDE_CURRENT_DATA_QUEUE_LENGTH_EDEFAULT.equals(includeCurrentDataQueueLength);
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
		result.append(", IncludeStartStatisticTime: ");
		result.append(includeStartStatisticTime);
		result.append(", IncludeStatisticTime: ");
		result.append(includeStatisticTime);
		result.append(", IncludeTotalIOs: ");
		result.append(includeTotalIOs);
		result.append(", IncludeTotalBytesTransferred: ");
		result.append(includeTotalBytesTransferred);
		result.append(", IncludeReadIOs: ");
		result.append(includeReadIOs);
		result.append(", IncludeWriteIOs: ");
		result.append(includeWriteIOs);
		result.append(", IncludeOtherIOs: ");
		result.append(includeOtherIOs);
		result.append(", IncludeMetadataReadIOs: ");
		result.append(includeMetadataReadIOs);
		result.append(", IncludeMetadataWriteIOs: ");
		result.append(includeMetadataWriteIOs);
		result.append(", IncludeTotalIOTimeCounter: ");
		result.append(includeTotalIOTimeCounter);
		result.append(", IncludeTotalIdleTimeCounter: ");
		result.append(includeTotalIdleTimeCounter);
		result.append(", IncludeReadIOTimeCounter: ");
		result.append(includeReadIOTimeCounter);
		result.append(", IncludeBytesRead: ");
		result.append(includeBytesRead);
		result.append(", IncludeWriteIOTimeCounter: ");
		result.append(includeWriteIOTimeCounter);
		result.append(", IncludeBytesWritten: ");
		result.append(includeBytesWritten);
		result.append(", IncludeMetadataBytesRead: ");
		result.append(includeMetadataBytesRead);
		result.append(", IncludeMetadataBytesWritten: ");
		result.append(includeMetadataBytesWritten);
		result.append(", IncludePercentDurableOpens: ");
		result.append(includePercentDurableOpens);
		result.append(", IncludePercentResilientOpens: ");
		result.append(includePercentResilientOpens);
		result.append(", IncludePercentPersistentOpens: ");
		result.append(includePercentPersistentOpens);
		result.append(", IncludeAverageReadResponseTime: ");
		result.append(includeAverageReadResponseTime);
		result.append(", IncludeAverageWriteResponseTime: ");
		result.append(includeAverageWriteResponseTime);
		result.append(", IncludeAverageRequestResponseTime: ");
		result.append(includeAverageRequestResponseTime);
		result.append(", IncludeBytesReadPerSec: ");
		result.append(includeBytesReadPerSec);
		result.append(", IncludeTotalBytesReceived: ");
		result.append(includeTotalBytesReceived);
		result.append(", IncludeBytesReceivedPerSec: ");
		result.append(includeBytesReceivedPerSec);
		result.append(", IncludeTotalBytesSent: ");
		result.append(includeTotalBytesSent);
		result.append(", IncludeBytesSentPerSec: ");
		result.append(includeBytesSentPerSec);
		result.append(", IncludeBytesTranferredPerSec: ");
		result.append(includeBytesTranferredPerSec);
		result.append(", IncludeBytesWrittenPerSec: ");
		result.append(includeBytesWrittenPerSec);
		result.append(", IncludeFilesOpenedPerSec: ");
		result.append(includeFilesOpenedPerSec);
		result.append(", IncludeTotalOpenFileCount: ");
		result.append(includeTotalOpenFileCount);
		result.append(", IncludeCurrentPendingRequests: ");
		result.append(includeCurrentPendingRequests);
		result.append(", IncludeReadRequestsProcessedPerSec: ");
		result.append(includeReadRequestsProcessedPerSec);
		result.append(", IncludeTotalRequestsReceived: ");
		result.append(includeTotalRequestsReceived);
		result.append(", IncludeRequestsReceivedPerSec: ");
		result.append(includeRequestsReceivedPerSec);
		result.append(", IncludeTotalDurableHandleReopenCount: ");
		result.append(includeTotalDurableHandleReopenCount);
		result.append(", IncludeTotalFailedDurableHandleReopenCount: ");
		result.append(includeTotalFailedDurableHandleReopenCount);
		result.append(", IncludeTotalFailedResilientHandleReopenCount: ");
		result.append(includeTotalFailedResilientHandleReopenCount);
		result.append(", IncludeCurrentOpenFileCount: ");
		result.append(includeCurrentOpenFileCount);
		result.append(", IncludeTotalResilientHandleReopenCount: ");
		result.append(includeTotalResilientHandleReopenCount);
		result.append(", IncludeTotalPersistentHandleReopenCount: ");
		result.append(includeTotalPersistentHandleReopenCount);
		result.append(", IncludeTotalFailedPersistentHandleReopenCount: ");
		result.append(includeTotalFailedPersistentHandleReopenCount);
		result.append(", IncludeTreeConnectCount: ");
		result.append(includeTreeConnectCount);
		result.append(", IncludeWriteRequestsProcessedPerSec: ");
		result.append(includeWriteRequestsProcessedPerSec);
		result.append(", IncludeTotalMetadataRequestsReceived: ");
		result.append(includeTotalMetadataRequestsReceived);
		result.append(", IncludeMetadataRequestsReceivedPerSec: ");
		result.append(includeMetadataRequestsReceivedPerSec);
		result.append(", IncludeAverageTimePerDataRequest: ");
		result.append(includeAverageTimePerDataRequest);
		result.append(", IncludeAverageBytesPerDataRequest: ");
		result.append(includeAverageBytesPerDataRequest);
		result.append(", IncludeAverageBytesPerReadRequest: ");
		result.append(includeAverageBytesPerReadRequest);
		result.append(", IncludeAverageBytesPerWriteRequest: ");
		result.append(includeAverageBytesPerWriteRequest);
		result.append(", IncludeAverageReadQueueLength: ");
		result.append(includeAverageReadQueueLength);
		result.append(", IncludeAverageWriteQueueLength: ");
		result.append(includeAverageWriteQueueLength);
		result.append(", IncludeAverageDataQueueLength: ");
		result.append(includeAverageDataQueueLength);
		result.append(", IncludeDataBytesPerSec: ");
		result.append(includeDataBytesPerSec);
		result.append(", IncludeDataRequestsPerSec: ");
		result.append(includeDataRequestsPerSec);
		result.append(", IncludeCurrentDataQueueLength: ");
		result.append(includeCurrentDataQueueLength);
		result.append(')');
		return result.toString();
	}

} //CIM_FileSystemStatisticsManifestImpl

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
 * A representation of the model object '<em><b>CIM File System Statistics Manifest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Instances of this class define a list of supported or desired properties of FileSystemStatisticalData instances. In the case where a FileSystemStatisticsManifest instance is a member of a FileSystemStatisticsManifestCollection used in a FileSystemStatisticsService.GetStatisticsCollection request, for each of the boolean "include" properties set to true in that FileSystemStatisticsManifest, the corresponding FileSystemStatisticalData property will be included, if available, in the statistics returned for FileSystemStatisticalData instances whose ElementType matches the ElementType of the FileSystemStatisticsManifest.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getOtherElementTypeDescription <em>Other Element Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeStartStatisticTime <em>Include Start Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeStatisticTime <em>Include Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalIOs <em>Include Total IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalBytesTransferred <em>Include Total Bytes Transferred</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeReadIOs <em>Include Read IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeWriteIOs <em>Include Write IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeOtherIOs <em>Include Other IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeMetadataReadIOs <em>Include Metadata Read IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeMetadataWriteIOs <em>Include Metadata Write IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalIOTimeCounter <em>Include Total IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalIdleTimeCounter <em>Include Total Idle Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeReadIOTimeCounter <em>Include Read IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeBytesRead <em>Include Bytes Read</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeWriteIOTimeCounter <em>Include Write IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeBytesWritten <em>Include Bytes Written</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeMetadataBytesRead <em>Include Metadata Bytes Read</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeMetadataBytesWritten <em>Include Metadata Bytes Written</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludePercentDurableOpens <em>Include Percent Durable Opens</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludePercentResilientOpens <em>Include Percent Resilient Opens</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludePercentPersistentOpens <em>Include Percent Persistent Opens</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageReadResponseTime <em>Include Average Read Response Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageWriteResponseTime <em>Include Average Write Response Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageRequestResponseTime <em>Include Average Request Response Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeBytesReadPerSec <em>Include Bytes Read Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalBytesReceived <em>Include Total Bytes Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeBytesReceivedPerSec <em>Include Bytes Received Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalBytesSent <em>Include Total Bytes Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeBytesSentPerSec <em>Include Bytes Sent Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeBytesTranferredPerSec <em>Include Bytes Tranferred Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeBytesWrittenPerSec <em>Include Bytes Written Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeFilesOpenedPerSec <em>Include Files Opened Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalOpenFileCount <em>Include Total Open File Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeCurrentPendingRequests <em>Include Current Pending Requests</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeReadRequestsProcessedPerSec <em>Include Read Requests Processed Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalRequestsReceived <em>Include Total Requests Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeRequestsReceivedPerSec <em>Include Requests Received Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalDurableHandleReopenCount <em>Include Total Durable Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalFailedDurableHandleReopenCount <em>Include Total Failed Durable Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalFailedResilientHandleReopenCount <em>Include Total Failed Resilient Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeCurrentOpenFileCount <em>Include Current Open File Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalResilientHandleReopenCount <em>Include Total Resilient Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalPersistentHandleReopenCount <em>Include Total Persistent Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalFailedPersistentHandleReopenCount <em>Include Total Failed Persistent Handle Reopen Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTreeConnectCount <em>Include Tree Connect Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeWriteRequestsProcessedPerSec <em>Include Write Requests Processed Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalMetadataRequestsReceived <em>Include Total Metadata Requests Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeMetadataRequestsReceivedPerSec <em>Include Metadata Requests Received Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageTimePerDataRequest <em>Include Average Time Per Data Request</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageBytesPerDataRequest <em>Include Average Bytes Per Data Request</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageBytesPerReadRequest <em>Include Average Bytes Per Read Request</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageBytesPerWriteRequest <em>Include Average Bytes Per Write Request</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageReadQueueLength <em>Include Average Read Queue Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageWriteQueueLength <em>Include Average Write Queue Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageDataQueueLength <em>Include Average Data Queue Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeDataBytesPerSec <em>Include Data Bytes Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeDataRequestsPerSec <em>Include Data Requests Per Sec</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeCurrentDataQueueLength <em>Include Current Data Queue Length</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileStatistics' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \"preferred\" algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon (:), and where &lt;OrgID&gt; must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above \"preferred\" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. \nFor DMTF-defined instances, the \"preferred\" algorithm must be used with the &lt;OrgID&gt; set to CIM.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FileSystemStatisticsManifest extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the type of element that this FileSystemStatisticsManifest can be applied to (e.g., during a GetStatisticsCollection request). This is used when the same set of statistical metrics is calculated for several types of elements. In this way, a single FileSystemStatisticsManifest instance can be used to filter all the StatisticalData instances that contain metrics for the same type of element in a StatisticsCollection. If used, a subclass should override this property to specify the element types supported by that class, preferably through ValueMap and Values qualifiers to allow clients to programmatically retrieve those supported types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see #setElementType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_ElementType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"102\",\"103\",\"104\",\"..\",\"0x8000..\"]' Values='[\"Other\",\"Local Filesystem\",\"Exported File Share\",\"Exporting Port\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.ElementType\"]'"
	 * @generated
	 */
	Integer getElementType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getElementType <em>Element Type</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_OtherElementTypeDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.OtherElementTypeDescription\"]'"
	 * @generated
	 */
	String getOtherElementTypeDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getOtherElementTypeDescription <em>Other Element Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Element Type Description</em>' attribute.
	 * @see #getOtherElementTypeDescription()
	 * @generated
	 */
	void setOtherElementTypeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Include Start Statistic Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not the Statistics property of StatisticsService.GetStatisticsCollection method will include the time at time when statistics for this FileSystemStatisticsManifest were first captured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Start Statistic Time</em>' attribute.
	 * @see #setIncludeStartStatisticTime(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeStartStatisticTime()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.StartStatisticTime\"]'"
	 * @generated
	 */
	Boolean getIncludeStartStatisticTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeStartStatisticTime <em>Include Start Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Start Statistic Time</em>' attribute.
	 * @see #getIncludeStartStatisticTime()
	 * @generated
	 */
	void setIncludeStartStatisticTime(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Statistic Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not the Statistics property of StatisticsService.GetStatisticsCollection method will include the time when statistics for this FileSystemStatisticsManifest were last captured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Statistic Time</em>' attribute.
	 * @see #setIncludeStatisticTime(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeStatisticTime()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.StatisticTime\"]'"
	 * @generated
	 */
	Boolean getIncludeStatisticTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeStatisticTime <em>Include Statistic Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Statistic Time</em>' attribute.
	 * @see #getIncludeStatisticTime()
	 * @generated
	 */
	void setIncludeStatisticTime(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total IOs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of file I/O operations for that element, including metadata I/O operations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total IOs</em>' attribute.
	 * @see #setIncludeTotalIOs(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTotalIOs()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TotalIOs\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalIOs <em>Include Total IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total IOs</em>' attribute.
	 * @see #getIncludeTotalIOs()
	 * @generated
	 */
	void setIncludeTotalIOs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total Bytes Transferred</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of bytes transferred for all of the file I/O operations for the element, as defined in the "TotalIOs" property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total Bytes Transferred</em>' attribute.
	 * @see #setIncludeTotalBytesTransferred(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTotalBytesTransferred()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TotalBytesTransferred\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalBytesTransferred();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalBytesTransferred <em>Include Total Bytes Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total Bytes Transferred</em>' attribute.
	 * @see #getIncludeTotalBytesTransferred()
	 * @generated
	 */
	void setIncludeTotalBytesTransferred(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Read IOs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of all file I/O operations that were directed to that element and that performed a transfer of data from the contents of a file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Read IOs</em>' attribute.
	 * @see #setIncludeReadIOs(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeReadIOs()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.ReadIOs\"]'"
	 * @generated
	 */
	Boolean getIncludeReadIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeReadIOs <em>Include Read IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Read IOs</em>' attribute.
	 * @see #getIncludeReadIOs()
	 * @generated
	 */
	void setIncludeReadIOs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Write IOs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of all file I/O operations that were directed to that element and that performed a transfer of data to the contents of a file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Write IOs</em>' attribute.
	 * @see #setIncludeWriteIOs(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeWriteIOs()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.WriteIOs\"]'"
	 * @generated
	 */
	Boolean getIncludeWriteIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeWriteIOs <em>Include Write IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Write IOs</em>' attribute.
	 * @see #getIncludeWriteIOs()
	 * @generated
	 */
	void setIncludeWriteIOs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Other IOs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of all file I/O operations that were directed to that element and that did not perform a transfer of data either to or from the contents of a file. This count excludes metadata I/O operations (both read and write).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Other IOs</em>' attribute.
	 * @see #setIncludeOtherIOs(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeOtherIOs()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.OtherIOs\"]'"
	 * @generated
	 */
	Boolean getIncludeOtherIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeOtherIOs <em>Include Other IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Other IOs</em>' attribute.
	 * @see #getIncludeOtherIOs()
	 * @generated
	 */
	void setIncludeOtherIOs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Metadata Read IOs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of all file I/O operations that were directed to that element and that performed a read transfer of metadata.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Metadata Read IOs</em>' attribute.
	 * @see #setIncludeMetadataReadIOs(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeMetadataReadIOs()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.MetadataReadIOs\"]'"
	 * @generated
	 */
	Boolean getIncludeMetadataReadIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeMetadataReadIOs <em>Include Metadata Read IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Metadata Read IOs</em>' attribute.
	 * @see #getIncludeMetadataReadIOs()
	 * @generated
	 */
	void setIncludeMetadataReadIOs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Metadata Write IOs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of all file I/O operations that were directed to that element and that performed a write transfer of metadata.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Metadata Write IOs</em>' attribute.
	 * @see #setIncludeMetadataWriteIOs(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeMetadataWriteIOs()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.MetadataWriteIOs\"]'"
	 * @generated
	 */
	Boolean getIncludeMetadataWriteIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeMetadataWriteIOs <em>Include Metadata Write IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Metadata Write IOs</em>' attribute.
	 * @see #getIncludeMetadataWriteIOs()
	 * @generated
	 */
	void setIncludeMetadataWriteIOs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total IO Time Counter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative elapsed I/O operation time (number of ClockTickIntervals) for all file I/O operations for that element as defined in "Total I/Os".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total IO Time Counter</em>' attribute.
	 * @see #setIncludeTotalIOTimeCounter(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTotalIOTimeCounter()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TotalIOTimeCounter\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalIOTimeCounter <em>Include Total IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total IO Time Counter</em>' attribute.
	 * @see #getIncludeTotalIOTimeCounter()
	 * @generated
	 */
	void setIncludeTotalIOTimeCounter(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total Idle Time Counter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative elapsed idle time for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total Idle Time Counter</em>' attribute.
	 * @see #setIncludeTotalIdleTimeCounter(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTotalIdleTimeCounter()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TotalIdleTimeCounter\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalIdleTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalIdleTimeCounter <em>Include Total Idle Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total Idle Time Counter</em>' attribute.
	 * @see #getIncludeTotalIdleTimeCounter()
	 * @generated
	 */
	void setIncludeTotalIdleTimeCounter(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Read IO Time Counter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative elapsed I/O operation time for all Read I/O operations (as defined by the "ReadIOs" property) for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Read IO Time Counter</em>' attribute.
	 * @see #setIncludeReadIOTimeCounter(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeReadIOTimeCounter()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.ReadIOTimeCounter\"]'"
	 * @generated
	 */
	Boolean getIncludeReadIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeReadIOTimeCounter <em>Include Read IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Read IO Time Counter</em>' attribute.
	 * @see #getIncludeReadIOTimeCounter()
	 * @generated
	 */
	void setIncludeReadIOTimeCounter(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Bytes Read</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of bytes transferred by all Read I/O operations (as defined by the "ReadIOs" property) for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Bytes Read</em>' attribute.
	 * @see #setIncludeBytesRead(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeBytesRead()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.BytesRead\"]'"
	 * @generated
	 */
	Boolean getIncludeBytesRead();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeBytesRead <em>Include Bytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Bytes Read</em>' attribute.
	 * @see #getIncludeBytesRead()
	 * @generated
	 */
	void setIncludeBytesRead(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Write IO Time Counter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative elapsed I/O operation time for all Write I/O operations (as defined by the "WriteIOs" property) for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Write IO Time Counter</em>' attribute.
	 * @see #setIncludeWriteIOTimeCounter(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeWriteIOTimeCounter()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.WriteIOTimeCounter\"]'"
	 * @generated
	 */
	Boolean getIncludeWriteIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeWriteIOTimeCounter <em>Include Write IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Write IO Time Counter</em>' attribute.
	 * @see #getIncludeWriteIOTimeCounter()
	 * @generated
	 */
	void setIncludeWriteIOTimeCounter(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Bytes Written</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of bytes transferred by all Write I/O operations (as defined by the "WriteIOs" property) for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Bytes Written</em>' attribute.
	 * @see #setIncludeBytesWritten(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeBytesWritten()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.BytesWritten\"]'"
	 * @generated
	 */
	Boolean getIncludeBytesWritten();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeBytesWritten <em>Include Bytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Bytes Written</em>' attribute.
	 * @see #getIncludeBytesWritten()
	 * @generated
	 */
	void setIncludeBytesWritten(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Metadata Bytes Read</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of metadata bytes read by all Metadata read I/O operations (as defined by the "MetadataReadIOs" property) for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Metadata Bytes Read</em>' attribute.
	 * @see #setIncludeMetadataBytesRead(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeMetadataBytesRead()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.MetadataBytesRead\"]'"
	 * @generated
	 */
	Boolean getIncludeMetadataBytesRead();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeMetadataBytesRead <em>Include Metadata Bytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Metadata Bytes Read</em>' attribute.
	 * @see #getIncludeMetadataBytesRead()
	 * @generated
	 */
	void setIncludeMetadataBytesRead(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Metadata Bytes Written</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of metadata bytes read by all Metadata write I/O operations (as defined by the "MetadataWriteIOs" property) for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Metadata Bytes Written</em>' attribute.
	 * @see #setIncludeMetadataBytesWritten(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeMetadataBytesWritten()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.MetadataBytesWritten\"]'"
	 * @generated
	 */
	Boolean getIncludeMetadataBytesWritten();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeMetadataBytesWritten <em>Include Metadata Bytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Metadata Bytes Written</em>' attribute.
	 * @see #getIncludeMetadataBytesWritten()
	 * @generated
	 */
	void setIncludeMetadataBytesWritten(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Percent Durable Opens</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the percentage of total opens for which clients requested durability for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Percent Durable Opens</em>' attribute.
	 * @see #setIncludePercentDurableOpens(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludePercentDurableOpens()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.PercentDurableOpens\"]'"
	 * @generated
	 */
	Boolean getIncludePercentDurableOpens();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludePercentDurableOpens <em>Include Percent Durable Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Percent Durable Opens</em>' attribute.
	 * @see #getIncludePercentDurableOpens()
	 * @generated
	 */
	void setIncludePercentDurableOpens(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Percent Resilient Opens</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the percentage of total opens for which clients requested resiliency for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Percent Resilient Opens</em>' attribute.
	 * @see #setIncludePercentResilientOpens(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludePercentResilientOpens()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.PercentResilientOpens\"]'"
	 * @generated
	 */
	Boolean getIncludePercentResilientOpens();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludePercentResilientOpens <em>Include Percent Resilient Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Percent Resilient Opens</em>' attribute.
	 * @see #getIncludePercentResilientOpens()
	 * @generated
	 */
	void setIncludePercentResilientOpens(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Percent Persistent Opens</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the percentage of total handles for which clients requested persistency for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Percent Persistent Opens</em>' attribute.
	 * @see #setIncludePercentPersistentOpens(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludePercentPersistentOpens()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.PercentPersistentOpens\"]'"
	 * @generated
	 */
	Boolean getIncludePercentPersistentOpens();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludePercentPersistentOpens <em>Include Percent Persistent Opens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Percent Persistent Opens</em>' attribute.
	 * @see #getIncludePercentPersistentOpens()
	 * @generated
	 */
	void setIncludePercentPersistentOpens(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Average Read Response Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the average number of seconds that elapse between the time at which a read request to that share is received and the time at which the SMB2 File Server sends the corresponding response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Average Read Response Time</em>' attribute.
	 * @see #setIncludeAverageReadResponseTime(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeAverageReadResponseTime()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.AverageReadResponseTime\"]'"
	 * @generated
	 */
	Boolean getIncludeAverageReadResponseTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageReadResponseTime <em>Include Average Read Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Average Read Response Time</em>' attribute.
	 * @see #getIncludeAverageReadResponseTime()
	 * @generated
	 */
	void setIncludeAverageReadResponseTime(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Average Write Response Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the average number of seconds that elapse between the time at which a write request to that share is received and the time at which the SMB2 File Server sends the corresponding response
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Average Write Response Time</em>' attribute.
	 * @see #setIncludeAverageWriteResponseTime(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeAverageWriteResponseTime()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.AverageWriteResponseTime\"]'"
	 * @generated
	 */
	Boolean getIncludeAverageWriteResponseTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageWriteResponseTime <em>Include Average Write Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Average Write Response Time</em>' attribute.
	 * @see #getIncludeAverageWriteResponseTime()
	 * @generated
	 */
	void setIncludeAverageWriteResponseTime(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Average Request Response Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the average number of seconds that elapse between the time at which the SMB2 File Server receives a request for that share and the time at which the SMB2 File Server sends the corresponding response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Average Request Response Time</em>' attribute.
	 * @see #setIncludeAverageRequestResponseTime(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeAverageRequestResponseTime()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.AverageRequestResponseTime\"]'"
	 * @generated
	 */
	Boolean getIncludeAverageRequestResponseTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageRequestResponseTime <em>Include Average Request Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Average Request Response Time</em>' attribute.
	 * @see #getIncludeAverageRequestResponseTime()
	 * @generated
	 */
	void setIncludeAverageRequestResponseTime(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Bytes Read Per Sec</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the rate, in seconds, at which data is being written to that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Bytes Read Per Sec</em>' attribute.
	 * @see #setIncludeBytesReadPerSec(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeBytesReadPerSec()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.BytesReadPerSec\"]'"
	 * @generated
	 */
	Boolean getIncludeBytesReadPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeBytesReadPerSec <em>Include Bytes Read Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Bytes Read Per Sec</em>' attribute.
	 * @see #getIncludeBytesReadPerSec()
	 * @generated
	 */
	void setIncludeBytesReadPerSec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total Bytes Received</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the number of bytes that have been received for requests related to that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total Bytes Received</em>' attribute.
	 * @see #setIncludeTotalBytesReceived(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTotalBytesReceived()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TotalBytesReceived\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalBytesReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalBytesReceived <em>Include Total Bytes Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total Bytes Received</em>' attribute.
	 * @see #getIncludeTotalBytesReceived()
	 * @generated
	 */
	void setIncludeTotalBytesReceived(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Bytes Received Per Sec</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the rate at which bytes are being received for requests related to that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Bytes Received Per Sec</em>' attribute.
	 * @see #setIncludeBytesReceivedPerSec(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeBytesReceivedPerSec()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.BytesReceivedPerSec\"]'"
	 * @generated
	 */
	Boolean getIncludeBytesReceivedPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeBytesReceivedPerSec <em>Include Bytes Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Bytes Received Per Sec</em>' attribute.
	 * @see #getIncludeBytesReceivedPerSec()
	 * @generated
	 */
	void setIncludeBytesReceivedPerSec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total Bytes Sent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the number of bytes that have been sent by the SMB2 File Server related to that share to its clients since the server started. This value includes both data bytes and protocol bytes for that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total Bytes Sent</em>' attribute.
	 * @see #setIncludeTotalBytesSent(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTotalBytesSent()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TotalBytesSent\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalBytesSent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalBytesSent <em>Include Total Bytes Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total Bytes Sent</em>' attribute.
	 * @see #getIncludeTotalBytesSent()
	 * @generated
	 */
	void setIncludeTotalBytesSent(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Bytes Sent Per Sec</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the rate, in seconds, at which bytes are being sent from the SMB2 File Server related to that share to its clients. This value includes both data bytes and protocol bytes for that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Bytes Sent Per Sec</em>' attribute.
	 * @see #setIncludeBytesSentPerSec(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeBytesSentPerSec()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.BytesSentPerSec\"]'"
	 * @generated
	 */
	Boolean getIncludeBytesSentPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeBytesSentPerSec <em>Include Bytes Sent Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Bytes Sent Per Sec</em>' attribute.
	 * @see #getIncludeBytesSentPerSec()
	 * @generated
	 */
	void setIncludeBytesSentPerSec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Bytes Tranferred Per Sec</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the sum of bytes transferred/sec related to that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Bytes Tranferred Per Sec</em>' attribute.
	 * @see #setIncludeBytesTranferredPerSec(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeBytesTranferredPerSec()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.BytesTranferredPerSec\"]'"
	 * @generated
	 */
	Boolean getIncludeBytesTranferredPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeBytesTranferredPerSec <em>Include Bytes Tranferred Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Bytes Tranferred Per Sec</em>' attribute.
	 * @see #getIncludeBytesTranferredPerSec()
	 * @generated
	 */
	void setIncludeBytesTranferredPerSec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Bytes Written Per Sec</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the rate, in seconds, at which data is being written to that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Bytes Written Per Sec</em>' attribute.
	 * @see #setIncludeBytesWrittenPerSec(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeBytesWrittenPerSec()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.BytesWrittenPerSec\"]'"
	 * @generated
	 */
	Boolean getIncludeBytesWrittenPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeBytesWrittenPerSec <em>Include Bytes Written Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Bytes Written Per Sec</em>' attribute.
	 * @see #getIncludeBytesWrittenPerSec()
	 * @generated
	 */
	void setIncludeBytesWrittenPerSec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Files Opened Per Sec</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the rate, in seconds, at which files are being opened for the SMB2 File Server/'s clients on that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Files Opened Per Sec</em>' attribute.
	 * @see #setIncludeFilesOpenedPerSec(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeFilesOpenedPerSec()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.FilesOpenedPerSec\"]'"
	 * @generated
	 */
	Boolean getIncludeFilesOpenedPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeFilesOpenedPerSec <em>Include Files Opened Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Files Opened Per Sec</em>' attribute.
	 * @see #getIncludeFilesOpenedPerSec()
	 * @generated
	 */
	void setIncludeFilesOpenedPerSec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total Open File Count</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the number of files that have been opened by the SMB2 File Server on behalf of its clients on that share since the server started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total Open File Count</em>' attribute.
	 * @see #setIncludeTotalOpenFileCount(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTotalOpenFileCount()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TotalOpenFileCount\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalOpenFileCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalOpenFileCount <em>Include Total Open File Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total Open File Count</em>' attribute.
	 * @see #getIncludeTotalOpenFileCount()
	 * @generated
	 */
	void setIncludeTotalOpenFileCount(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Current Pending Requests</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the number of requests related to that share that are waiting to be processed by the SMB2 File Server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Current Pending Requests</em>' attribute.
	 * @see #setIncludeCurrentPendingRequests(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeCurrentPendingRequests()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.CurrentPendingRequests\"]'"
	 * @generated
	 */
	Boolean getIncludeCurrentPendingRequests();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeCurrentPendingRequests <em>Include Current Pending Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Current Pending Requests</em>' attribute.
	 * @see #getIncludeCurrentPendingRequests()
	 * @generated
	 */
	void setIncludeCurrentPendingRequests(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Read Requests Processed Per Sec</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the Read requests processed/sec related to that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Read Requests Processed Per Sec</em>' attribute.
	 * @see #setIncludeReadRequestsProcessedPerSec(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeReadRequestsProcessedPerSec()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.ReadRequestsProcessedPerSec\"]'"
	 * @generated
	 */
	Boolean getIncludeReadRequestsProcessedPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeReadRequestsProcessedPerSec <em>Include Read Requests Processed Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Read Requests Processed Per Sec</em>' attribute.
	 * @see #getIncludeReadRequestsProcessedPerSec()
	 * @generated
	 */
	void setIncludeReadRequestsProcessedPerSec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total Requests Received</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the number of requests that have been received for that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total Requests Received</em>' attribute.
	 * @see #setIncludeTotalRequestsReceived(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTotalRequestsReceived()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TotalRequestsReceived\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalRequestsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalRequestsReceived <em>Include Total Requests Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total Requests Received</em>' attribute.
	 * @see #getIncludeTotalRequestsReceived()
	 * @generated
	 */
	void setIncludeTotalRequestsReceived(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Requests Received Per Sec</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the rate at which requests are being received for that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Requests Received Per Sec</em>' attribute.
	 * @see #setIncludeRequestsReceivedPerSec(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeRequestsReceivedPerSec()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.RequestsReceivedPerSec\"]'"
	 * @generated
	 */
	Boolean getIncludeRequestsReceivedPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeRequestsReceivedPerSec <em>Include Requests Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Requests Received Per Sec</em>' attribute.
	 * @see #getIncludeRequestsReceivedPerSec()
	 * @generated
	 */
	void setIncludeRequestsReceivedPerSec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total Durable Handle Reopen Count</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the number of durable opens on that share that have been recovered after a temporary network disconnect since the SMB2 File Server started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total Durable Handle Reopen Count</em>' attribute.
	 * @see #setIncludeTotalDurableHandleReopenCount(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTotalDurableHandleReopenCount()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TotalDurableHandleReopenCount\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalDurableHandleReopenCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalDurableHandleReopenCount <em>Include Total Durable Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total Durable Handle Reopen Count</em>' attribute.
	 * @see #getIncludeTotalDurableHandleReopenCount()
	 * @generated
	 */
	void setIncludeTotalDurableHandleReopenCount(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total Failed Durable Handle Reopen Count</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the number of durable opens on that share that could not be recovered after a temporary network disconnect since the SMB2 File Server Started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total Failed Durable Handle Reopen Count</em>' attribute.
	 * @see #setIncludeTotalFailedDurableHandleReopenCount(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTotalFailedDurableHandleReopenCount()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TotalFailedDurableHandleReopenCount\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalFailedDurableHandleReopenCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalFailedDurableHandleReopenCount <em>Include Total Failed Durable Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total Failed Durable Handle Reopen Count</em>' attribute.
	 * @see #getIncludeTotalFailedDurableHandleReopenCount()
	 * @generated
	 */
	void setIncludeTotalFailedDurableHandleReopenCount(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total Failed Resilient Handle Reopen Count</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the number of resilient opens on that share that could not be recovered after a temporary network disconnect since the SMB2 File Server Started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total Failed Resilient Handle Reopen Count</em>' attribute.
	 * @see #setIncludeTotalFailedResilientHandleReopenCount(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTotalFailedResilientHandleReopenCount()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TotalFailedResilientHandleReopenCount\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalFailedResilientHandleReopenCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalFailedResilientHandleReopenCount <em>Include Total Failed Resilient Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total Failed Resilient Handle Reopen Count</em>' attribute.
	 * @see #getIncludeTotalFailedResilientHandleReopenCount()
	 * @generated
	 */
	void setIncludeTotalFailedResilientHandleReopenCount(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Current Open File Count</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the number of file handles that are currently open in that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Current Open File Count</em>' attribute.
	 * @see #setIncludeCurrentOpenFileCount(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeCurrentOpenFileCount()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.CurrentOpenFileCount\"]'"
	 * @generated
	 */
	Boolean getIncludeCurrentOpenFileCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeCurrentOpenFileCount <em>Include Current Open File Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Current Open File Count</em>' attribute.
	 * @see #getIncludeCurrentOpenFileCount()
	 * @generated
	 */
	void setIncludeCurrentOpenFileCount(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total Resilient Handle Reopen Count</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the number of resilient opens on that share that have been recovered after a temporary network disconnect since the SMB2 File Server started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total Resilient Handle Reopen Count</em>' attribute.
	 * @see #setIncludeTotalResilientHandleReopenCount(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTotalResilientHandleReopenCount()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TotalResilientHandleReopenCount\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalResilientHandleReopenCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalResilientHandleReopenCount <em>Include Total Resilient Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total Resilient Handle Reopen Count</em>' attribute.
	 * @see #getIncludeTotalResilientHandleReopenCount()
	 * @generated
	 */
	void setIncludeTotalResilientHandleReopenCount(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total Persistent Handle Reopen Count</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the number of persistent opens on that share that have been recovered after a temporary network disconnect since the SMB2 File Server started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total Persistent Handle Reopen Count</em>' attribute.
	 * @see #setIncludeTotalPersistentHandleReopenCount(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTotalPersistentHandleReopenCount()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TotalPersistentHandleReopenCount\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalPersistentHandleReopenCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalPersistentHandleReopenCount <em>Include Total Persistent Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total Persistent Handle Reopen Count</em>' attribute.
	 * @see #getIncludeTotalPersistentHandleReopenCount()
	 * @generated
	 */
	void setIncludeTotalPersistentHandleReopenCount(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total Failed Persistent Handle Reopen Count</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the number of persistent opens on that share that could not be recovered after a temporary network disconnect since the SMB2 File Server Started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total Failed Persistent Handle Reopen Count</em>' attribute.
	 * @see #setIncludeTotalFailedPersistentHandleReopenCount(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTotalFailedPersistentHandleReopenCount()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TotalFailedPersistentHandleReopenCount\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalFailedPersistentHandleReopenCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalFailedPersistentHandleReopenCount <em>Include Total Failed Persistent Handle Reopen Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total Failed Persistent Handle Reopen Count</em>' attribute.
	 * @see #getIncludeTotalFailedPersistentHandleReopenCount()
	 * @generated
	 */
	void setIncludeTotalFailedPersistentHandleReopenCount(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Tree Connect Count</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the number of tree connects to that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Tree Connect Count</em>' attribute.
	 * @see #setIncludeTreeConnectCount(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTreeConnectCount()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TreeConnectCount\"]'"
	 * @generated
	 */
	Boolean getIncludeTreeConnectCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTreeConnectCount <em>Include Tree Connect Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Tree Connect Count</em>' attribute.
	 * @see #getIncludeTreeConnectCount()
	 * @generated
	 */
	void setIncludeTreeConnectCount(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Write Requests Processed Per Sec</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the write requests processed/sec related to that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Write Requests Processed Per Sec</em>' attribute.
	 * @see #setIncludeWriteRequestsProcessedPerSec(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeWriteRequestsProcessedPerSec()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.WriteRequestsProcessedPerSec\"]'"
	 * @generated
	 */
	Boolean getIncludeWriteRequestsProcessedPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeWriteRequestsProcessedPerSec <em>Include Write Requests Processed Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Write Requests Processed Per Sec</em>' attribute.
	 * @see #getIncludeWriteRequestsProcessedPerSec()
	 * @generated
	 */
	void setIncludeWriteRequestsProcessedPerSec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total Metadata Requests Received</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the total number of metadata requests received related to that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total Metadata Requests Received</em>' attribute.
	 * @see #setIncludeTotalMetadataRequestsReceived(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeTotalMetadataRequestsReceived()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.TotalMetadataRequestsReceived\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalMetadataRequestsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeTotalMetadataRequestsReceived <em>Include Total Metadata Requests Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total Metadata Requests Received</em>' attribute.
	 * @see #getIncludeTotalMetadataRequestsReceived()
	 * @generated
	 */
	void setIncludeTotalMetadataRequestsReceived(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Metadata Requests Received Per Sec</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the rate, in seconds, at which metadata requests are being sent to that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Metadata Requests Received Per Sec</em>' attribute.
	 * @see #setIncludeMetadataRequestsReceivedPerSec(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeMetadataRequestsReceivedPerSec()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.MetadataRequestsReceivedPerSec\"]'"
	 * @generated
	 */
	Boolean getIncludeMetadataRequestsReceivedPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeMetadataRequestsReceivedPerSec <em>Include Metadata Requests Received Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Metadata Requests Received Per Sec</em>' attribute.
	 * @see #getIncludeMetadataRequestsReceivedPerSec()
	 * @generated
	 */
	void setIncludeMetadataRequestsReceivedPerSec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Average Time Per Data Request</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the average number of seconds that elapse between the time at which a read or write request to that share is received and the time at which the SMB2 File Server processes the request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Average Time Per Data Request</em>' attribute.
	 * @see #setIncludeAverageTimePerDataRequest(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeAverageTimePerDataRequest()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.AverageTimePerDataRequest\"]'"
	 * @generated
	 */
	Boolean getIncludeAverageTimePerDataRequest();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageTimePerDataRequest <em>Include Average Time Per Data Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Average Time Per Data Request</em>' attribute.
	 * @see #getIncludeAverageTimePerDataRequest()
	 * @generated
	 */
	void setIncludeAverageTimePerDataRequest(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Average Bytes Per Data Request</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the average number of bytes per read or write request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Average Bytes Per Data Request</em>' attribute.
	 * @see #setIncludeAverageBytesPerDataRequest(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeAverageBytesPerDataRequest()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.AverageBytesPerDataRequest\"]'"
	 * @generated
	 */
	Boolean getIncludeAverageBytesPerDataRequest();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageBytesPerDataRequest <em>Include Average Bytes Per Data Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Average Bytes Per Data Request</em>' attribute.
	 * @see #getIncludeAverageBytesPerDataRequest()
	 * @generated
	 */
	void setIncludeAverageBytesPerDataRequest(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Average Bytes Per Read Request</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the average number of bytes per read request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Average Bytes Per Read Request</em>' attribute.
	 * @see #setIncludeAverageBytesPerReadRequest(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeAverageBytesPerReadRequest()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.AverageBytesPerReadRequest\"]'"
	 * @generated
	 */
	Boolean getIncludeAverageBytesPerReadRequest();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageBytesPerReadRequest <em>Include Average Bytes Per Read Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Average Bytes Per Read Request</em>' attribute.
	 * @see #getIncludeAverageBytesPerReadRequest()
	 * @generated
	 */
	void setIncludeAverageBytesPerReadRequest(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Average Bytes Per Write Request</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the average number of bytes per write request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Average Bytes Per Write Request</em>' attribute.
	 * @see #setIncludeAverageBytesPerWriteRequest(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeAverageBytesPerWriteRequest()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.AverageBytesPerWriteRequest\"]'"
	 * @generated
	 */
	Boolean getIncludeAverageBytesPerWriteRequest();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageBytesPerWriteRequest <em>Include Average Bytes Per Write Request</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Average Bytes Per Write Request</em>' attribute.
	 * @see #getIncludeAverageBytesPerWriteRequest()
	 * @generated
	 */
	void setIncludeAverageBytesPerWriteRequest(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Average Read Queue Length</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the average number of read requests that were queued for that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Average Read Queue Length</em>' attribute.
	 * @see #setIncludeAverageReadQueueLength(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeAverageReadQueueLength()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.AverageReadQueueLength\"]'"
	 * @generated
	 */
	Boolean getIncludeAverageReadQueueLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageReadQueueLength <em>Include Average Read Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Average Read Queue Length</em>' attribute.
	 * @see #getIncludeAverageReadQueueLength()
	 * @generated
	 */
	void setIncludeAverageReadQueueLength(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Average Write Queue Length</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the average number of write requests that were queued for that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Average Write Queue Length</em>' attribute.
	 * @see #setIncludeAverageWriteQueueLength(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeAverageWriteQueueLength()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.AverageWriteQueueLength\"]'"
	 * @generated
	 */
	Boolean getIncludeAverageWriteQueueLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageWriteQueueLength <em>Include Average Write Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Average Write Queue Length</em>' attribute.
	 * @see #getIncludeAverageWriteQueueLength()
	 * @generated
	 */
	void setIncludeAverageWriteQueueLength(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Average Data Queue Length</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the average number of read and write requests that were queued for that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Average Data Queue Length</em>' attribute.
	 * @see #setIncludeAverageDataQueueLength(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeAverageDataQueueLength()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.AverageDataQueueLength\"]'"
	 * @generated
	 */
	Boolean getIncludeAverageDataQueueLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeAverageDataQueueLength <em>Include Average Data Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Average Data Queue Length</em>' attribute.
	 * @see #getIncludeAverageDataQueueLength()
	 * @generated
	 */
	void setIncludeAverageDataQueueLength(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Data Bytes Per Sec</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the rate, in seconds, at which data is being written to or read from that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Data Bytes Per Sec</em>' attribute.
	 * @see #setIncludeDataBytesPerSec(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeDataBytesPerSec()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.DataBytesPerSec\"]'"
	 * @generated
	 */
	Boolean getIncludeDataBytesPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeDataBytesPerSec <em>Include Data Bytes Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Data Bytes Per Sec</em>' attribute.
	 * @see #getIncludeDataBytesPerSec()
	 * @generated
	 */
	void setIncludeDataBytesPerSec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Data Requests Per Sec</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the rate, in seconds, at which read or write requests are received for that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Data Requests Per Sec</em>' attribute.
	 * @see #setIncludeDataRequestsPerSec(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeDataRequestsPerSec()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.DataRequestsPerSec\"]'"
	 * @generated
	 */
	Boolean getIncludeDataRequestsPerSec();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeDataRequestsPerSec <em>Include Data Requests Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Data Requests Per Sec</em>' attribute.
	 * @see #getIncludeDataRequestsPerSec()
	 * @generated
	 */
	void setIncludeDataRequestsPerSec(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Current Data Queue Length</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a share the current number of read or write requests outstanding on that share.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Current Data Queue Length</em>' attribute.
	 * @see #setIncludeCurrentDataQueueLength(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemStatisticsManifest_IncludeCurrentDataQueueLength()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_FileSystemStatisticalData.CurrentDataQueueLength\"]'"
	 * @generated
	 */
	Boolean getIncludeCurrentDataQueueLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemStatisticsManifest#getIncludeCurrentDataQueueLength <em>Include Current Data Queue Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Current Data Queue Length</em>' attribute.
	 * @see #getIncludeCurrentDataQueueLength()
	 * @generated
	 */
	void setIncludeCurrentDataQueueLength(Boolean value);

} // CIM_FileSystemStatisticsManifest

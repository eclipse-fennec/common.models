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
 * A representation of the model object '<em><b>CIM Block Statistics Manifest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Instances of this class define a list of supported or desired properties of BlockStatisticalData instances. In the case where a BlockStatisticsManifest instance is a member of a BlockStatisticsManifestCollection used in a BlockStatisticsService.GetStatisticsCollection request, for each of the boolean "include" properties set to true in that BlockStatisticsManifest, the corresponding BlockStatisticalData property will be included, if available, in the statistics returned for BlockStatisticalData instances whose ElementType matches the ElementType of the BlockStatisticsManifest.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeStartStatisticTime <em>Include Start Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeStatisticTime <em>Include Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeTotalIOs <em>Include Total IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeKBytesTransferred <em>Include KBytes Transferred</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeIOTimeCounter <em>Include IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadIOs <em>Include Read IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadHitIOs <em>Include Read Hit IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadIOTimeCounter <em>Include Read IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadHitIOTimeCounter <em>Include Read Hit IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeKBytesRead <em>Include KBytes Read</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteIOs <em>Include Write IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteHitIOs <em>Include Write Hit IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteIOTimeCounter <em>Include Write IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteHitIOTimeCounter <em>Include Write Hit IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeKBytesWritten <em>Include KBytes Written</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeIdleTimeCounter <em>Include Idle Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeMaintOp <em>Include Maint Op</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeMaintTimeCounter <em>Include Maint Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getCSVRateSequence <em>CSV Rate Sequence</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getCSVSequence <em>CSV Sequence</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeKBytesReadRate <em>Include KBytes Read Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeKBytesTransferredRate <em>Include KBytes Transferred Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeKBytesWrittenRate <em>Include KBytes Written Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeMaintOpRate <em>Include Maint Op Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeRateIntervalEndTime <em>Include Rate Interval End Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeRateIntervalStartTime <em>Include Rate Interval Start Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadHitIOsRate <em>Include Read Hit IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadIOsRate <em>Include Read IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadSequentialHits <em>Include Read Sequential Hits</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadSequentialIOs <em>Include Read Sequential IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeTotalHitIOs <em>Include Total Hit IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeTotalIOsRate <em>Include Total IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteHitIOsRate <em>Include Write Hit IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteIOsRate <em>Include Write IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteSequentialHits <em>Include Write Sequential Hits</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteSequentialIOs <em>Include Write Sequential IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getRateElementType <em>Rate Element Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageStatistics' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following \"preferred\" algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon (:), and where &lt;OrgID&gt; must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness, &lt;OrgID&gt; must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above \"preferred\" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs produced by this or other providers for the NameSpace of this instance. \nFor DMTF-defined instances, the \"preferred\" algorithm must be used with the &lt;OrgID&gt; set to CIM.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_BlockStatisticsManifest extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the type of elements that this BlockStatisticsManifest can be applied to (e.g. during a GetStatisticsCollection request). This is used when the same set of statistical metrics is calculated for several types of devices. In this way, a single BlockStatisticsManifest instance can be used to filter all the StatsiticalData instances that contain metrics for the same type of element in a StatisticsCollection. If used, a subclass should override this property to specify the element types supported by that class, preferably through ValueMap and Values qualifiers to allow clients to programmatically retrieve those supported types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see #setElementType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_ElementType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"..\",\"0x8000..\"]' Values='[\"Computer System\",\"Front-end Computer System\",\"Peer Computer System\",\"Back-end Computer System\",\"Front-end Port\",\"Back-end Port\",\"Volume\",\"Extent\",\"Disk Drive\",\"Arbitrary LUs\",\"Remote Replica Group\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.ElementType\"]'"
	 * @generated
	 */
	Integer getElementType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(Integer value);

	/**
	 * Returns the value of the '<em><b>Include Start Statistic Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not the Statistics property of StatisticsService.GetStatisticsCollection method will include the time at time when statistics for this BlockStatisticsManifest were first captured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Start Statistic Time</em>' attribute.
	 * @see #setIncludeStartStatisticTime(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeStartStatisticTime()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIncludeStartStatisticTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeStartStatisticTime <em>Include Start Statistic Time</em>}' attribute.
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
	 * Indicates whether or not the Statistics property of StatisticsService.GetStatisticsCollection method will include the time when statistics for this BlockStatisticsManifest were last captured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Statistic Time</em>' attribute.
	 * @see #setIncludeStatisticTime(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeStatisticTime()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIncludeStatisticTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeStatisticTime <em>Include Statistic Time</em>}' attribute.
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
	 * Whether to include in a filter for a metered element the cumulative count of I/Os for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total IOs</em>' attribute.
	 * @see #setIncludeTotalIOs(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeTotalIOs()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIncludeTotalIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeTotalIOs <em>Include Total IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total IOs</em>' attribute.
	 * @see #getIncludeTotalIOs()
	 * @generated
	 */
	void setIncludeTotalIOs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include KBytes Transferred</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of data transferred in Kbytes for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include KBytes Transferred</em>' attribute.
	 * @see #setIncludeKBytesTransferred(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeKBytesTransferred()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.KBytesTransferred\"]'"
	 * @generated
	 */
	Boolean getIncludeKBytesTransferred();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeKBytesTransferred <em>Include KBytes Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include KBytes Transferred</em>' attribute.
	 * @see #getIncludeKBytesTransferred()
	 * @generated
	 */
	void setIncludeKBytesTransferred(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include IO Time Counter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative elapsed I/O time (number of Clock Tick Intervals) for all I/Os for that element as defined in 'Total I/Os'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include IO Time Counter</em>' attribute.
	 * @see #setIncludeIOTimeCounter(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeIOTimeCounter()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.IOTimeCounter\"]'"
	 * @generated
	 */
	Boolean getIncludeIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeIOTimeCounter <em>Include IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include IO Time Counter</em>' attribute.
	 * @see #getIncludeIOTimeCounter()
	 * @generated
	 */
	void setIncludeIOTimeCounter(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Read IOs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of all reads for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Read IOs</em>' attribute.
	 * @see #setIncludeReadIOs(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeReadIOs()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.ReadIOs\"]'"
	 * @generated
	 */
	Boolean getIncludeReadIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadIOs <em>Include Read IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Read IOs</em>' attribute.
	 * @see #getIncludeReadIOs()
	 * @generated
	 */
	void setIncludeReadIOs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Read Hit IOs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of all read cache hits (Reads from Cache) for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Read Hit IOs</em>' attribute.
	 * @see #setIncludeReadHitIOs(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeReadHitIOs()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.ReadHitIOs\"]'"
	 * @generated
	 */
	Boolean getIncludeReadHitIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadHitIOs <em>Include Read Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Read Hit IOs</em>' attribute.
	 * @see #getIncludeReadHitIOs()
	 * @generated
	 */
	void setIncludeReadHitIOs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Read IO Time Counter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative elapsed time for all cumulative Read I/Os for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Read IO Time Counter</em>' attribute.
	 * @see #setIncludeReadIOTimeCounter(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeReadIOTimeCounter()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.ReadIOTimeCounter\"]'"
	 * @generated
	 */
	Boolean getIncludeReadIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadIOTimeCounter <em>Include Read IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Read IO Time Counter</em>' attribute.
	 * @see #getIncludeReadIOTimeCounter()
	 * @generated
	 */
	void setIncludeReadIOTimeCounter(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Read Hit IO Time Counter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative elapsed time for all Read I/Os read from cache for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Read Hit IO Time Counter</em>' attribute.
	 * @see #setIncludeReadHitIOTimeCounter(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeReadHitIOTimeCounter()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.ReadHitIOTimeCounter\"]'"
	 * @generated
	 */
	Boolean getIncludeReadHitIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadHitIOTimeCounter <em>Include Read Hit IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Read Hit IO Time Counter</em>' attribute.
	 * @see #getIncludeReadHitIOTimeCounter()
	 * @generated
	 */
	void setIncludeReadHitIOTimeCounter(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include KBytes Read</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of data read in Kbytes for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include KBytes Read</em>' attribute.
	 * @see #setIncludeKBytesRead(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeKBytesRead()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.KBytesRead\"]'"
	 * @generated
	 */
	Boolean getIncludeKBytesRead();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeKBytesRead <em>Include KBytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include KBytes Read</em>' attribute.
	 * @see #getIncludeKBytesRead()
	 * @generated
	 */
	void setIncludeKBytesRead(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Write IOs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of all writes for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Write IOs</em>' attribute.
	 * @see #setIncludeWriteIOs(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeWriteIOs()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.WriteIOs\"]'"
	 * @generated
	 */
	Boolean getIncludeWriteIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteIOs <em>Include Write IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Write IOs</em>' attribute.
	 * @see #getIncludeWriteIOs()
	 * @generated
	 */
	void setIncludeWriteIOs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Write Hit IOs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of Write Cache Hits (Writes that went directly to Cache) for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Write Hit IOs</em>' attribute.
	 * @see #setIncludeWriteHitIOs(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeWriteHitIOs()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.WriteHitIOs\"]'"
	 * @generated
	 */
	Boolean getIncludeWriteHitIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteHitIOs <em>Include Write Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Write Hit IOs</em>' attribute.
	 * @see #getIncludeWriteHitIOs()
	 * @generated
	 */
	void setIncludeWriteHitIOs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Write IO Time Counter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative elapsed time for all Write I/Os for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Write IO Time Counter</em>' attribute.
	 * @see #setIncludeWriteIOTimeCounter(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeWriteIOTimeCounter()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.WriteIOTimeCounter\"]'"
	 * @generated
	 */
	Boolean getIncludeWriteIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteIOTimeCounter <em>Include Write IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Write IO Time Counter</em>' attribute.
	 * @see #getIncludeWriteIOTimeCounter()
	 * @generated
	 */
	void setIncludeWriteIOTimeCounter(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Write Hit IO Time Counter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative elapsed time for all Write I/Os written to cache for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Write Hit IO Time Counter</em>' attribute.
	 * @see #setIncludeWriteHitIOTimeCounter(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeWriteHitIOTimeCounter()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.WriteHitIOTimeCounter\"]'"
	 * @generated
	 */
	Boolean getIncludeWriteHitIOTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteHitIOTimeCounter <em>Include Write Hit IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Write Hit IO Time Counter</em>' attribute.
	 * @see #getIncludeWriteHitIOTimeCounter()
	 * @generated
	 */
	void setIncludeWriteHitIOTimeCounter(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include KBytes Written</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of data written in Kbytes for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include KBytes Written</em>' attribute.
	 * @see #setIncludeKBytesWritten(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeKBytesWritten()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.KBytesWritten\"]'"
	 * @generated
	 */
	Boolean getIncludeKBytesWritten();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeKBytesWritten <em>Include KBytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include KBytes Written</em>' attribute.
	 * @see #getIncludeKBytesWritten()
	 * @generated
	 */
	void setIncludeKBytesWritten(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Idle Time Counter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative elapsed idle time for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Idle Time Counter</em>' attribute.
	 * @see #setIncludeIdleTimeCounter(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeIdleTimeCounter()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.IdleTimeCounter\"]'"
	 * @generated
	 */
	Boolean getIncludeIdleTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeIdleTimeCounter <em>Include Idle Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Idle Time Counter</em>' attribute.
	 * @see #getIncludeIdleTimeCounter()
	 * @generated
	 */
	void setIncludeIdleTimeCounter(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Maint Op</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of all maintenance operations for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Maint Op</em>' attribute.
	 * @see #setIncludeMaintOp(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeMaintOp()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.MaintOp\"]'"
	 * @generated
	 */
	Boolean getIncludeMaintOp();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeMaintOp <em>Include Maint Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Maint Op</em>' attribute.
	 * @see #getIncludeMaintOp()
	 * @generated
	 */
	void setIncludeMaintOp(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Maint Time Counter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative elapsed maintenance time for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Maint Time Counter</em>' attribute.
	 * @see #setIncludeMaintTimeCounter(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeMaintTimeCounter()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.MaintTimeCounter\"]'"
	 * @generated
	 */
	Boolean getIncludeMaintTimeCounter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeMaintTimeCounter <em>Include Maint Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Maint Time Counter</em>' attribute.
	 * @see #getIncludeMaintTimeCounter()
	 * @generated
	 */
	void setIncludeMaintTimeCounter(Boolean value);

	/**
	 * Returns the value of the '<em><b>CSV Rate Sequence</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequence of BlockStorageStatisticalData property names for properties that will be returned are encoded in the CSVRateSequence array. Properties that are not included will not be returned with GetRateStatisticsCollection. Properties that are included in CSVRateSequence will be returned in the order they appear in CSVRateSequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CSV Rate Sequence</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_CSVRateSequence()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getCSVRateSequence();

	/**
	 * Returns the value of the '<em><b>CSV Sequence</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sequence of BlockStorageStatisticalData property names for properties that will be returned are encoded in the CSVSequence array. Properties that are not included will not be returned with GetStatisticsCollection. Properties that are included in CSVSequence will be returned in the order they appear in CSVSequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CSV Sequence</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_CSVSequence()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getCSVSequence();

	/**
	 * Returns the value of the '<em><b>Include KBytes Read Rate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the count of data read in Kbytes per second for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include KBytes Read Rate</em>' attribute.
	 * @see #setIncludeKBytesReadRate(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeKBytesReadRate()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.KBytesReadRate\"]'"
	 * @generated
	 */
	Boolean getIncludeKBytesReadRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeKBytesReadRate <em>Include KBytes Read Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include KBytes Read Rate</em>' attribute.
	 * @see #getIncludeKBytesReadRate()
	 * @generated
	 */
	void setIncludeKBytesReadRate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include KBytes Transferred Rate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the data transferred in Kbytes per second for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include KBytes Transferred Rate</em>' attribute.
	 * @see #setIncludeKBytesTransferredRate(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeKBytesTransferredRate()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.KBytesTransferredRate\"]'"
	 * @generated
	 */
	Boolean getIncludeKBytesTransferredRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeKBytesTransferredRate <em>Include KBytes Transferred Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include KBytes Transferred Rate</em>' attribute.
	 * @see #getIncludeKBytesTransferredRate()
	 * @generated
	 */
	void setIncludeKBytesTransferredRate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include KBytes Written Rate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the count of data written in Kbytes per second for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include KBytes Written Rate</em>' attribute.
	 * @see #setIncludeKBytesWrittenRate(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeKBytesWrittenRate()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.KBytesWrittenRate\"]'"
	 * @generated
	 */
	Boolean getIncludeKBytesWrittenRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeKBytesWrittenRate <em>Include KBytes Written Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include KBytes Written Rate</em>' attribute.
	 * @see #getIncludeKBytesWrittenRate()
	 * @generated
	 */
	void setIncludeKBytesWrittenRate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Maint Op Rate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the count of all maintenance operations per second for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Maint Op Rate</em>' attribute.
	 * @see #setIncludeMaintOpRate(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeMaintOpRate()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.MaintOpRate\"]'"
	 * @generated
	 */
	Boolean getIncludeMaintOpRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeMaintOpRate <em>Include Maint Op Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Maint Op Rate</em>' attribute.
	 * @see #getIncludeMaintOpRate()
	 * @generated
	 */
	void setIncludeMaintOpRate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Rate Interval End Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not the Statistics property of StatisticsService.GetTimePeriodStatisticsCollection method will include the time when statistics for this BlockStatisticsManifest were last captured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Rate Interval End Time</em>' attribute.
	 * @see #setIncludeRateIntervalEndTime(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeRateIntervalEndTime()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.RateIntervalEndTime\"]'"
	 * @generated
	 */
	Boolean getIncludeRateIntervalEndTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeRateIntervalEndTime <em>Include Rate Interval End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Rate Interval End Time</em>' attribute.
	 * @see #getIncludeRateIntervalEndTime()
	 * @generated
	 */
	void setIncludeRateIntervalEndTime(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Rate Interval Start Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether or not the Statistics property of StatisticsService.GetTimePeriodStatisticsCollection method will include the time when statistics for this BlockStatisticsManifest were last captured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Rate Interval Start Time</em>' attribute.
	 * @see #setIncludeRateIntervalStartTime(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeRateIntervalStartTime()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.RateIntervalStartTime\"]'"
	 * @generated
	 */
	Boolean getIncludeRateIntervalStartTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeRateIntervalStartTime <em>Include Rate Interval Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Rate Interval Start Time</em>' attribute.
	 * @see #getIncludeRateIntervalStartTime()
	 * @generated
	 */
	void setIncludeRateIntervalStartTime(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Read Hit IOs Rate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the count of all read cache hits (Reads from Cache) per second for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Read Hit IOs Rate</em>' attribute.
	 * @see #setIncludeReadHitIOsRate(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeReadHitIOsRate()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.ReadHitIOsRate\"]'"
	 * @generated
	 */
	Boolean getIncludeReadHitIOsRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadHitIOsRate <em>Include Read Hit IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Read Hit IOs Rate</em>' attribute.
	 * @see #getIncludeReadHitIOsRate()
	 * @generated
	 */
	void setIncludeReadHitIOsRate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Read IOs Rate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the count of all reads per second for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Read IOs Rate</em>' attribute.
	 * @see #setIncludeReadIOsRate(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeReadIOsRate()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.ReadIOsRate\"]'"
	 * @generated
	 */
	Boolean getIncludeReadIOsRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadIOsRate <em>Include Read IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Read IOs Rate</em>' attribute.
	 * @see #getIncludeReadIOsRate()
	 * @generated
	 */
	void setIncludeReadIOsRate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Read Sequential Hits</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of sequential read cache hits (sequential reads from Cache) for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Read Sequential Hits</em>' attribute.
	 * @see #setIncludeReadSequentialHits(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeReadSequentialHits()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIncludeReadSequentialHits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadSequentialHits <em>Include Read Sequential Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Read Sequential Hits</em>' attribute.
	 * @see #getIncludeReadSequentialHits()
	 * @generated
	 */
	void setIncludeReadSequentialHits(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Read Sequential IOs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of sequential reads for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Read Sequential IOs</em>' attribute.
	 * @see #setIncludeReadSequentialIOs(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeReadSequentialIOs()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIncludeReadSequentialIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeReadSequentialIOs <em>Include Read Sequential IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Read Sequential IOs</em>' attribute.
	 * @see #getIncludeReadSequentialIOs()
	 * @generated
	 */
	void setIncludeReadSequentialIOs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total Hit IOs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of total cache hit IOs for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total Hit IOs</em>' attribute.
	 * @see #setIncludeTotalHitIOs(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeTotalHitIOs()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIncludeTotalHitIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeTotalHitIOs <em>Include Total Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total Hit IOs</em>' attribute.
	 * @see #getIncludeTotalHitIOs()
	 * @generated
	 */
	void setIncludeTotalHitIOs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Total IOs Rate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the count of I/Os per second for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Total IOs Rate</em>' attribute.
	 * @see #setIncludeTotalIOsRate(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeTotalIOsRate()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.TotalIOsRate\"]'"
	 * @generated
	 */
	Boolean getIncludeTotalIOsRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeTotalIOsRate <em>Include Total IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Total IOs Rate</em>' attribute.
	 * @see #getIncludeTotalIOsRate()
	 * @generated
	 */
	void setIncludeTotalIOsRate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Write Hit IOs Rate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the count of Write Cache Hits (Writes that went directly to Cache) per second for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Write Hit IOs Rate</em>' attribute.
	 * @see #setIncludeWriteHitIOsRate(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeWriteHitIOsRate()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.WriteHitIOsRate\"]'"
	 * @generated
	 */
	Boolean getIncludeWriteHitIOsRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteHitIOsRate <em>Include Write Hit IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Write Hit IOs Rate</em>' attribute.
	 * @see #getIncludeWriteHitIOsRate()
	 * @generated
	 */
	void setIncludeWriteHitIOsRate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Write IOs Rate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the count of all writes per second for tat element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Write IOs Rate</em>' attribute.
	 * @see #setIncludeWriteIOsRate(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeWriteIOsRate()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.WriteIOsRate\"]'"
	 * @generated
	 */
	Boolean getIncludeWriteIOsRate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteIOsRate <em>Include Write IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Write IOs Rate</em>' attribute.
	 * @see #getIncludeWriteIOsRate()
	 * @generated
	 */
	void setIncludeWriteIOsRate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Write Sequential Hits</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of sequential write Cache Hits (sequential writes that went directly to Cache) for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Write Sequential Hits</em>' attribute.
	 * @see #setIncludeWriteSequentialHits(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeWriteSequentialHits()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIncludeWriteSequentialHits();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteSequentialHits <em>Include Write Sequential Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Write Sequential Hits</em>' attribute.
	 * @see #getIncludeWriteSequentialHits()
	 * @generated
	 */
	void setIncludeWriteSequentialHits(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Write Sequential IOs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to include in a filter for a metered element the cumulative count of sequential writes for that element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Write Sequential IOs</em>' attribute.
	 * @see #setIncludeWriteSequentialIOs(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_IncludeWriteSequentialIOs()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIncludeWriteSequentialIOs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getIncludeWriteSequentialIOs <em>Include Write Sequential IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Write Sequential IOs</em>' attribute.
	 * @see #getIncludeWriteSequentialIOs()
	 * @generated
	 */
	void setIncludeWriteSequentialIOs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Rate Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Similar description as the ElementType, except for rated data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Element Type</em>' attribute.
	 * @see #setRateElementType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BlockStatisticsManifest_RateElementType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"..\",\"0x8000..\"]' Values='[\"Computer System Rate\",\"Front-end Computer System Rate\",\"Peer Computer System Rate\",\"Back-end Computer System Rate\",\"Front-end Port Rate\",\"Back-end Port Rate\",\"Volume Rate\",\"Extent Rate\",\"Disk Drive Rate\",\"Arbitrary LUs Rate\",\"Remote Replica Group Rate\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_BlockStorageStatisticalData.RateElementType\"]'"
	 * @generated
	 */
	Integer getRateElementType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BlockStatisticsManifest#getRateElementType <em>Rate Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Element Type</em>' attribute.
	 * @see #getRateElementType()
	 * @generated
	 */
	void setRateElementType(Integer value);

} // CIM_BlockStatisticsManifest

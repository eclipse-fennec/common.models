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
 * A representation of the model object '<em><b>CIM VTL Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_VTLResourceUsage class provides the ability to track the current resource usage of the device in order to detect when the device resources are approaching their limits (and thus further device hardware is needed or some backups needs to be moved to another device). All these device resources need to be tracked at both the whole-device level but also at the virtual library level. Tracking resource usage at the library level is critical because the VLS can be partitioned into multiple logical libraries that use physically separate resources (e.g. different front-end FC ports, different storage pools) so if the device shows 50% full this could mean one library is 100% full and another library is 0% full. It contains data representing used capacity, compression ratios and deduplication ratios at VTL or VLS level.also support the ability to set resource thresholds so that alerts are generated when the device approaches a warning or critical resource threshold (to alert the user they may need to add hardware or reduce workload)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getRelativeThroughput <em>Relative Throughput</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getUsedPhysicalCapacity <em>Used Physical Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getUsedLogicalCapacity <em>Used Logical Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getUsedPhysicalCapacityOfMax <em>Used Physical Capacity Of Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getUsedLogicalCapacityOfMax <em>Used Logical Capacity Of Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getSystemRatio <em>System Ratio</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getDeduplicationRatio <em>Deduplication Ratio</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getInReplicationThroughput <em>In Replication Throughput</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getOutReplicationThroughput <em>Out Replication Throughput</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getThresholdCheckInterval <em>Threshold Check Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getThresholdEnabled <em>Threshold Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getThroughputAlertsEnabled <em>Throughput Alerts Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getThroughputWarningAlertThreshold <em>Throughput Warning Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getThroughputCriticalAlertThreshold <em>Throughput Critical Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getPhysicalCapacityAlertsEnabled <em>Physical Capacity Alerts Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getPhysicalCapacityWarningAlertThreshold <em>Physical Capacity Warning Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getPhysicalCapacityCriticalAlertThreshold <em>Physical Capacity Critical Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getLogicalCapacityAlertsEnabled <em>Logical Capacity Alerts Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getLogicalCapacityWarningAlertThreshold <em>Logical Capacity Warning Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getLogicalCapacityCriticalAlertThreshold <em>Logical Capacity Critical Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getSystemRatioAlertsEnabled <em>System Ratio Alerts Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getSystemRatioWarningAlertThreshold <em>System Ratio Warning Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getSystemRatioCriticalAlertThreshold <em>System Ratio Critical Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getDeduplicationRatioAlertsEnabled <em>Deduplication Ratio Alerts Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getDeduplicationRatioWarningAlertThreshold <em>Deduplication Ratio Warning Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getDeduplicationRatioCriticalAlertThreshold <em>Deduplication Ratio Critical Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getReplicationTrafficAlertsEnabled <em>Replication Traffic Alerts Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getReplicationTrafficWarningAlertThreshold <em>Replication Traffic Warning Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VTLResourceUsage#getReplicationTrafficCriticalAlertThreshold <em>Replication Traffic Critical Alert Threshold</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageStatistics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_VTLResourceUsage extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Performance in Kbytes per second (byte * 10^3 / second)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Throughput</em>' attribute.
	 * @see #setThroughput(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_Throughput()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' PUnit='byte * 10^3 / second'"
	 * @generated
	 */
	Long getThroughput();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' attribute.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(Long value);

	/**
	 * Returns the value of the '<em><b>Relative Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Performance in percentage of the maximum performance allowed for this VTL or VLS. Must be an integer value between 0 and 100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Throughput</em>' attribute.
	 * @see #setRelativeThroughput(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_RelativeThroughput()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percentage' MinValue='0' MaxValue='100' PUnit='percent'"
	 * @generated
	 */
	Integer getRelativeThroughput();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getRelativeThroughput <em>Relative Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Throughput</em>' attribute.
	 * @see #getRelativeThroughput()
	 * @generated
	 */
	void setRelativeThroughput(Integer value);

	/**
	 * Returns the value of the '<em><b>Used Physical Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used physical capacity in Mbytes. Physical capacity is the amount of data actually stored on the disk, whether or not deduplicated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Physical Capacity</em>' attribute.
	 * @see #setUsedPhysicalCapacity(Double)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_UsedPhysicalCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real64' Units='MegaBytes' PUnit='byte * 10^6'"
	 * @generated
	 */
	Double getUsedPhysicalCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getUsedPhysicalCapacity <em>Used Physical Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Physical Capacity</em>' attribute.
	 * @see #getUsedPhysicalCapacity()
	 * @generated
	 */
	void setUsedPhysicalCapacity(Double value);

	/**
	 * Returns the value of the '<em><b>Used Logical Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used logical capacity in Mbytes. Logical capacity is the amount of data the backup application wrote (before deduplication and compression), while the physical capacity is the amount of data actually stored on the disk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Logical Capacity</em>' attribute.
	 * @see #setUsedLogicalCapacity(Double)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_UsedLogicalCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real64' Units='MegaBytes' PUnit='byte * 10^6'"
	 * @generated
	 */
	Double getUsedLogicalCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getUsedLogicalCapacity <em>Used Logical Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Logical Capacity</em>' attribute.
	 * @see #getUsedLogicalCapacity()
	 * @generated
	 */
	void setUsedLogicalCapacity(Double value);

	/**
	 * Returns the value of the '<em><b>Used Physical Capacity Of Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used physical disk capacity as a proportion of the maximum physical disk capacity available for this VTL or VLS. Must be a floating point value between 0 and 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Physical Capacity Of Max</em>' attribute.
	 * @see #setUsedPhysicalCapacityOfMax(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_UsedPhysicalCapacityOfMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32' Units='Proportion' MinValue='0' MaxValue='1' PUnit='byte / byte'"
	 * @generated
	 */
	Float getUsedPhysicalCapacityOfMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getUsedPhysicalCapacityOfMax <em>Used Physical Capacity Of Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Physical Capacity Of Max</em>' attribute.
	 * @see #getUsedPhysicalCapacityOfMax()
	 * @generated
	 */
	void setUsedPhysicalCapacityOfMax(Float value);

	/**
	 * Returns the value of the '<em><b>Used Logical Capacity Of Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used logical disk capacity as a proportion of the maximum physical disk capacity available for this VTL or VLS. Must be a floating point value between 0 and 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Used Logical Capacity Of Max</em>' attribute.
	 * @see #setUsedLogicalCapacityOfMax(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_UsedLogicalCapacityOfMax()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32' Units='Proportion' MinValue='0' MaxValue='1' PUnit='byte / byte'"
	 * @generated
	 */
	Float getUsedLogicalCapacityOfMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getUsedLogicalCapacityOfMax <em>Used Logical Capacity Of Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Logical Capacity Of Max</em>' attribute.
	 * @see #getUsedLogicalCapacityOfMax()
	 * @generated
	 */
	void setUsedLogicalCapacityOfMax(Float value);

	/**
	 * Returns the value of the '<em><b>System Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compression ratio for this VTL or VLS.The ratio of the Logical Data divided by the Used Capacity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Ratio</em>' attribute.
	 * @see #setSystemRatio(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_SystemRatio()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32'"
	 * @generated
	 */
	Float getSystemRatio();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getSystemRatio <em>System Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Ratio</em>' attribute.
	 * @see #getSystemRatio()
	 * @generated
	 */
	void setSystemRatio(Float value);

	/**
	 * Returns the value of the '<em><b>Deduplication Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deduplication ratio for this VTL or VLS. The storage capacity saved by deduplication , where the sum of all pre-deduplicated backup data is compared with the actual amount of storage the deduplicated data requires. For example, a value 10 means that ten times more data is being stored than the actual physical space it would require.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deduplication Ratio</em>' attribute.
	 * @see #setDeduplicationRatio(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_DeduplicationRatio()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32'"
	 * @generated
	 */
	Float getDeduplicationRatio();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getDeduplicationRatio <em>Deduplication Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduplication Ratio</em>' attribute.
	 * @see #getDeduplicationRatio()
	 * @generated
	 */
	void setDeduplicationRatio(Float value);

	/**
	 * Returns the value of the '<em><b>In Replication Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Incoming replication traffic in Kbytes/second (byte * 10^3 / second).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Replication Throughput</em>' attribute.
	 * @see #setInReplicationThroughput(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_InReplicationThroughput()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' PUnit='byte * 10^3 / second'"
	 * @generated
	 */
	Long getInReplicationThroughput();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getInReplicationThroughput <em>In Replication Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Replication Throughput</em>' attribute.
	 * @see #getInReplicationThroughput()
	 * @generated
	 */
	void setInReplicationThroughput(Long value);

	/**
	 * Returns the value of the '<em><b>Out Replication Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outgoing replication traffic in Kbytes/second (byte * 10^3 / second).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out Replication Throughput</em>' attribute.
	 * @see #setOutReplicationThroughput(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_OutReplicationThroughput()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' PUnit='byte * 10^3 / second'"
	 * @generated
	 */
	Long getOutReplicationThroughput();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getOutReplicationThroughput <em>Out Replication Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Replication Throughput</em>' attribute.
	 * @see #getOutReplicationThroughput()
	 * @generated
	 */
	void setOutReplicationThroughput(Long value);

	/**
	 * Returns the value of the '<em><b>Threshold Check Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the frequency in seconds used to compare threshold to actual values
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Threshold Check Interval</em>' attribute.
	 * @see #setThresholdCheckInterval(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_ThresholdCheckInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Units='Seconds' PUnit='second'"
	 * @generated
	 */
	Long getThresholdCheckInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getThresholdCheckInterval <em>Threshold Check Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Check Interval</em>' attribute.
	 * @see #getThresholdCheckInterval()
	 * @generated
	 */
	void setThresholdCheckInterval(Long value);

	/**
	 * Returns the value of the '<em><b>Threshold Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This field indicates if Threshold enabled or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Threshold Enabled</em>' attribute.
	 * @see #setThresholdEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_ThresholdEnabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getThresholdEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getThresholdEnabled <em>Threshold Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Enabled</em>' attribute.
	 * @see #getThresholdEnabled()
	 * @generated
	 */
	void setThresholdEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Throughput Alerts Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A true value indicates that throughput alerts governed by ThroughputWarningAlertThreshold and ThroughputCriticalAlertThreshold will be issued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Throughput Alerts Enabled</em>' attribute.
	 * @see #setThroughputAlertsEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_ThroughputAlertsEnabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getThroughputAlertsEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getThroughputAlertsEnabled <em>Throughput Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput Alerts Enabled</em>' attribute.
	 * @see #getThroughputAlertsEnabled()
	 * @generated
	 */
	void setThroughputAlertsEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Throughput Warning Alert Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Throughput threshold after which a warning alert will be triggered. Readable and writable. Must be an integer value between 0 and 100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Throughput Warning Alert Threshold</em>' attribute.
	 * @see #setThroughputWarningAlertThreshold(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_ThroughputWarningAlertThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percentage' MinValue='0' MaxValue='100' PUnit='percent'"
	 * @generated
	 */
	Integer getThroughputWarningAlertThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getThroughputWarningAlertThreshold <em>Throughput Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput Warning Alert Threshold</em>' attribute.
	 * @see #getThroughputWarningAlertThreshold()
	 * @generated
	 */
	void setThroughputWarningAlertThreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>Throughput Critical Alert Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Throughput threshold after which a critical alert will be triggered.Readable and writable. Must be an integer value between 0 and 100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Throughput Critical Alert Threshold</em>' attribute.
	 * @see #setThroughputCriticalAlertThreshold(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_ThroughputCriticalAlertThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percentage' MinValue='0' MaxValue='100' PUnit='percent'"
	 * @generated
	 */
	Integer getThroughputCriticalAlertThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getThroughputCriticalAlertThreshold <em>Throughput Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput Critical Alert Threshold</em>' attribute.
	 * @see #getThroughputCriticalAlertThreshold()
	 * @generated
	 */
	void setThroughputCriticalAlertThreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>Physical Capacity Alerts Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A true value indicates that physical capacity alerts governed by PhysicalCapacityWarningAlertThreshold and PhysicalCapacityCriticalAlertThreshold will be issued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Capacity Alerts Enabled</em>' attribute.
	 * @see #setPhysicalCapacityAlertsEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_PhysicalCapacityAlertsEnabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getPhysicalCapacityAlertsEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getPhysicalCapacityAlertsEnabled <em>Physical Capacity Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Capacity Alerts Enabled</em>' attribute.
	 * @see #getPhysicalCapacityAlertsEnabled()
	 * @generated
	 */
	void setPhysicalCapacityAlertsEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Physical Capacity Warning Alert Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical capacity threshold after which a warning alert will be triggered. Readable and writable. Must be an integer value between 0 and 100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Capacity Warning Alert Threshold</em>' attribute.
	 * @see #setPhysicalCapacityWarningAlertThreshold(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_PhysicalCapacityWarningAlertThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percentage' MinValue='0' MaxValue='100' PUnit='percent'"
	 * @generated
	 */
	Integer getPhysicalCapacityWarningAlertThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getPhysicalCapacityWarningAlertThreshold <em>Physical Capacity Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Capacity Warning Alert Threshold</em>' attribute.
	 * @see #getPhysicalCapacityWarningAlertThreshold()
	 * @generated
	 */
	void setPhysicalCapacityWarningAlertThreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>Physical Capacity Critical Alert Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical capacity threshold after which a critical alert will be triggered. Readable and writable. Must be an integer value between 0 and 100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Capacity Critical Alert Threshold</em>' attribute.
	 * @see #setPhysicalCapacityCriticalAlertThreshold(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_PhysicalCapacityCriticalAlertThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percentage' MinValue='0' MaxValue='100' PUnit='percent'"
	 * @generated
	 */
	Integer getPhysicalCapacityCriticalAlertThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getPhysicalCapacityCriticalAlertThreshold <em>Physical Capacity Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Capacity Critical Alert Threshold</em>' attribute.
	 * @see #getPhysicalCapacityCriticalAlertThreshold()
	 * @generated
	 */
	void setPhysicalCapacityCriticalAlertThreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>Logical Capacity Alerts Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A true value indicates that logical capacity alerts governed by LogicalCapacityWarningAlertThreshold and LogicalCapacityCriticalAlertThreshold will be issued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Capacity Alerts Enabled</em>' attribute.
	 * @see #setLogicalCapacityAlertsEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_LogicalCapacityAlertsEnabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getLogicalCapacityAlertsEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getLogicalCapacityAlertsEnabled <em>Logical Capacity Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Capacity Alerts Enabled</em>' attribute.
	 * @see #getLogicalCapacityAlertsEnabled()
	 * @generated
	 */
	void setLogicalCapacityAlertsEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Logical Capacity Warning Alert Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical capacity threshold after which a warning alert will betriggered. Readable and writable. Must be an integer value between 0 and 100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Capacity Warning Alert Threshold</em>' attribute.
	 * @see #setLogicalCapacityWarningAlertThreshold(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_LogicalCapacityWarningAlertThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percentage' MinValue='0' MaxValue='100' PUnit='percent'"
	 * @generated
	 */
	Integer getLogicalCapacityWarningAlertThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getLogicalCapacityWarningAlertThreshold <em>Logical Capacity Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Capacity Warning Alert Threshold</em>' attribute.
	 * @see #getLogicalCapacityWarningAlertThreshold()
	 * @generated
	 */
	void setLogicalCapacityWarningAlertThreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>Logical Capacity Critical Alert Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical capacity threshold after which a critical alert will betriggered. Readable and writable. Must be an integer value between 0 and 100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Logical Capacity Critical Alert Threshold</em>' attribute.
	 * @see #setLogicalCapacityCriticalAlertThreshold(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_LogicalCapacityCriticalAlertThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getLogicalCapacityCriticalAlertThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getLogicalCapacityCriticalAlertThreshold <em>Logical Capacity Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Capacity Critical Alert Threshold</em>' attribute.
	 * @see #getLogicalCapacityCriticalAlertThreshold()
	 * @generated
	 */
	void setLogicalCapacityCriticalAlertThreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>System Ratio Alerts Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A true value indicates that system ratio alerts governed by SystemRatioWarningAlertThreshold and SystemRatioCriticalAlertThreshold will be issued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Ratio Alerts Enabled</em>' attribute.
	 * @see #setSystemRatioAlertsEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_SystemRatioAlertsEnabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSystemRatioAlertsEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getSystemRatioAlertsEnabled <em>System Ratio Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Ratio Alerts Enabled</em>' attribute.
	 * @see #getSystemRatioAlertsEnabled()
	 * @generated
	 */
	void setSystemRatioAlertsEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>System Ratio Warning Alert Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A warning-level alert will be issued if the system ratio falls below the specified threshold. This must be an integer value between 0 and 100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Ratio Warning Alert Threshold</em>' attribute.
	 * @see #setSystemRatioWarningAlertThreshold(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_SystemRatioWarningAlertThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32'"
	 * @generated
	 */
	Float getSystemRatioWarningAlertThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getSystemRatioWarningAlertThreshold <em>System Ratio Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Ratio Warning Alert Threshold</em>' attribute.
	 * @see #getSystemRatioWarningAlertThreshold()
	 * @generated
	 */
	void setSystemRatioWarningAlertThreshold(Float value);

	/**
	 * Returns the value of the '<em><b>System Ratio Critical Alert Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A critical-level alert will be issued if the system ratio falls below the specified threshold. This must be an integer value between 0 and 100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Ratio Critical Alert Threshold</em>' attribute.
	 * @see #setSystemRatioCriticalAlertThreshold(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_SystemRatioCriticalAlertThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32'"
	 * @generated
	 */
	Float getSystemRatioCriticalAlertThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getSystemRatioCriticalAlertThreshold <em>System Ratio Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Ratio Critical Alert Threshold</em>' attribute.
	 * @see #getSystemRatioCriticalAlertThreshold()
	 * @generated
	 */
	void setSystemRatioCriticalAlertThreshold(Float value);

	/**
	 * Returns the value of the '<em><b>Deduplication Ratio Alerts Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A true value indicates that deduplication ratio alerts governed by DeduplicationRatioWarningAlertThreshold and DeduplicationRatioPhysicalCapacityCriticalAlertThreshold will be issued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deduplication Ratio Alerts Enabled</em>' attribute.
	 * @see #setDeduplicationRatioAlertsEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_DeduplicationRatioAlertsEnabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getDeduplicationRatioAlertsEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getDeduplicationRatioAlertsEnabled <em>Deduplication Ratio Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduplication Ratio Alerts Enabled</em>' attribute.
	 * @see #getDeduplicationRatioAlertsEnabled()
	 * @generated
	 */
	void setDeduplicationRatioAlertsEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Deduplication Ratio Warning Alert Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A warning-level alert will be issued if the deduplication ratio falls below the specified threshold
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deduplication Ratio Warning Alert Threshold</em>' attribute.
	 * @see #setDeduplicationRatioWarningAlertThreshold(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_DeduplicationRatioWarningAlertThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32'"
	 * @generated
	 */
	Float getDeduplicationRatioWarningAlertThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getDeduplicationRatioWarningAlertThreshold <em>Deduplication Ratio Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduplication Ratio Warning Alert Threshold</em>' attribute.
	 * @see #getDeduplicationRatioWarningAlertThreshold()
	 * @generated
	 */
	void setDeduplicationRatioWarningAlertThreshold(Float value);

	/**
	 * Returns the value of the '<em><b>Deduplication Ratio Critical Alert Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A critical-level alert will be issued if the deduplication ratio falls below the specified threshold
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deduplication Ratio Critical Alert Threshold</em>' attribute.
	 * @see #setDeduplicationRatioCriticalAlertThreshold(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_DeduplicationRatioCriticalAlertThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32'"
	 * @generated
	 */
	Float getDeduplicationRatioCriticalAlertThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getDeduplicationRatioCriticalAlertThreshold <em>Deduplication Ratio Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deduplication Ratio Critical Alert Threshold</em>' attribute.
	 * @see #getDeduplicationRatioCriticalAlertThreshold()
	 * @generated
	 */
	void setDeduplicationRatioCriticalAlertThreshold(Float value);

	/**
	 * Returns the value of the '<em><b>Replication Traffic Alerts Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A true value indicates that replication traffic alerts governed by ReplicationTrafficWarningAlertThresholdand ReplicationTrafficCriticalAlertThreshold will be issued
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replication Traffic Alerts Enabled</em>' attribute.
	 * @see #setReplicationTrafficAlertsEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_ReplicationTrafficAlertsEnabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getReplicationTrafficAlertsEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getReplicationTrafficAlertsEnabled <em>Replication Traffic Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication Traffic Alerts Enabled</em>' attribute.
	 * @see #getReplicationTrafficAlertsEnabled()
	 * @generated
	 */
	void setReplicationTrafficAlertsEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Replication Traffic Warning Alert Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A warning-level alert will be issued if the replication traffic is beyond the specified threshold. This is expressed in terms of kilo bytes per second (byte * 10^3 / second).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replication Traffic Warning Alert Threshold</em>' attribute.
	 * @see #setReplicationTrafficWarningAlertThreshold(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_ReplicationTrafficWarningAlertThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' PUnit='byte * 10^3 / second'"
	 * @generated
	 */
	Long getReplicationTrafficWarningAlertThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getReplicationTrafficWarningAlertThreshold <em>Replication Traffic Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication Traffic Warning Alert Threshold</em>' attribute.
	 * @see #getReplicationTrafficWarningAlertThreshold()
	 * @generated
	 */
	void setReplicationTrafficWarningAlertThreshold(Long value);

	/**
	 * Returns the value of the '<em><b>Replication Traffic Critical Alert Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A critical-level alert will be issued if the replication traffic is beyond the specified threshold. This is in terms of kilo bytes per second (byte * 10^3 / second).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replication Traffic Critical Alert Threshold</em>' attribute.
	 * @see #setReplicationTrafficCriticalAlertThreshold(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_VTLResourceUsage_ReplicationTrafficCriticalAlertThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' PUnit='byte * 10^3 / second'"
	 * @generated
	 */
	Long getReplicationTrafficCriticalAlertThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VTLResourceUsage#getReplicationTrafficCriticalAlertThreshold <em>Replication Traffic Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication Traffic Critical Alert Threshold</em>' attribute.
	 * @see #getReplicationTrafficCriticalAlertThreshold()
	 * @generated
	 */
	void setReplicationTrafficCriticalAlertThreshold(Long value);

} // CIM_VTLResourceUsage

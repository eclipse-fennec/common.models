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

import org.dmtf.cim.CIM_VTLResourceUsage;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM VTL Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getRelativeThroughput <em>Relative Throughput</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getUsedPhysicalCapacity <em>Used Physical Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getUsedLogicalCapacity <em>Used Logical Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getUsedPhysicalCapacityOfMax <em>Used Physical Capacity Of Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getUsedLogicalCapacityOfMax <em>Used Logical Capacity Of Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getSystemRatio <em>System Ratio</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getDeduplicationRatio <em>Deduplication Ratio</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getInReplicationThroughput <em>In Replication Throughput</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getOutReplicationThroughput <em>Out Replication Throughput</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getThresholdCheckInterval <em>Threshold Check Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getThresholdEnabled <em>Threshold Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getThroughputAlertsEnabled <em>Throughput Alerts Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getThroughputWarningAlertThreshold <em>Throughput Warning Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getThroughputCriticalAlertThreshold <em>Throughput Critical Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getPhysicalCapacityAlertsEnabled <em>Physical Capacity Alerts Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getPhysicalCapacityWarningAlertThreshold <em>Physical Capacity Warning Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getPhysicalCapacityCriticalAlertThreshold <em>Physical Capacity Critical Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getLogicalCapacityAlertsEnabled <em>Logical Capacity Alerts Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getLogicalCapacityWarningAlertThreshold <em>Logical Capacity Warning Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getLogicalCapacityCriticalAlertThreshold <em>Logical Capacity Critical Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getSystemRatioAlertsEnabled <em>System Ratio Alerts Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getSystemRatioWarningAlertThreshold <em>System Ratio Warning Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getSystemRatioCriticalAlertThreshold <em>System Ratio Critical Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getDeduplicationRatioAlertsEnabled <em>Deduplication Ratio Alerts Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getDeduplicationRatioWarningAlertThreshold <em>Deduplication Ratio Warning Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getDeduplicationRatioCriticalAlertThreshold <em>Deduplication Ratio Critical Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getReplicationTrafficAlertsEnabled <em>Replication Traffic Alerts Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getReplicationTrafficWarningAlertThreshold <em>Replication Traffic Warning Alert Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VTLResourceUsageImpl#getReplicationTrafficCriticalAlertThreshold <em>Replication Traffic Critical Alert Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VTLResourceUsageImpl extends CIM_StatisticalDataImpl implements CIM_VTLResourceUsage {
	/**
	 * The default value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final Long THROUGHPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected Long throughput = THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelativeThroughput() <em>Relative Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RELATIVE_THROUGHPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativeThroughput() <em>Relative Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeThroughput()
	 * @generated
	 * @ordered
	 */
	protected Integer relativeThroughput = RELATIVE_THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsedPhysicalCapacity() <em>Used Physical Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedPhysicalCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Double USED_PHYSICAL_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsedPhysicalCapacity() <em>Used Physical Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedPhysicalCapacity()
	 * @generated
	 * @ordered
	 */
	protected Double usedPhysicalCapacity = USED_PHYSICAL_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsedLogicalCapacity() <em>Used Logical Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedLogicalCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Double USED_LOGICAL_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsedLogicalCapacity() <em>Used Logical Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedLogicalCapacity()
	 * @generated
	 * @ordered
	 */
	protected Double usedLogicalCapacity = USED_LOGICAL_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsedPhysicalCapacityOfMax() <em>Used Physical Capacity Of Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedPhysicalCapacityOfMax()
	 * @generated
	 * @ordered
	 */
	protected static final Float USED_PHYSICAL_CAPACITY_OF_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsedPhysicalCapacityOfMax() <em>Used Physical Capacity Of Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedPhysicalCapacityOfMax()
	 * @generated
	 * @ordered
	 */
	protected Float usedPhysicalCapacityOfMax = USED_PHYSICAL_CAPACITY_OF_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsedLogicalCapacityOfMax() <em>Used Logical Capacity Of Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedLogicalCapacityOfMax()
	 * @generated
	 * @ordered
	 */
	protected static final Float USED_LOGICAL_CAPACITY_OF_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsedLogicalCapacityOfMax() <em>Used Logical Capacity Of Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedLogicalCapacityOfMax()
	 * @generated
	 * @ordered
	 */
	protected Float usedLogicalCapacityOfMax = USED_LOGICAL_CAPACITY_OF_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemRatio() <em>System Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemRatio()
	 * @generated
	 * @ordered
	 */
	protected static final Float SYSTEM_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemRatio() <em>System Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemRatio()
	 * @generated
	 * @ordered
	 */
	protected Float systemRatio = SYSTEM_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduplicationRatio() <em>Deduplication Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduplicationRatio()
	 * @generated
	 * @ordered
	 */
	protected static final Float DEDUPLICATION_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeduplicationRatio() <em>Deduplication Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduplicationRatio()
	 * @generated
	 * @ordered
	 */
	protected Float deduplicationRatio = DEDUPLICATION_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getInReplicationThroughput() <em>In Replication Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInReplicationThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final Long IN_REPLICATION_THROUGHPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInReplicationThroughput() <em>In Replication Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInReplicationThroughput()
	 * @generated
	 * @ordered
	 */
	protected Long inReplicationThroughput = IN_REPLICATION_THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutReplicationThroughput() <em>Out Replication Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutReplicationThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final Long OUT_REPLICATION_THROUGHPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutReplicationThroughput() <em>Out Replication Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutReplicationThroughput()
	 * @generated
	 * @ordered
	 */
	protected Long outReplicationThroughput = OUT_REPLICATION_THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThresholdCheckInterval() <em>Threshold Check Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdCheckInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long THRESHOLD_CHECK_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThresholdCheckInterval() <em>Threshold Check Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdCheckInterval()
	 * @generated
	 * @ordered
	 */
	protected Long thresholdCheckInterval = THRESHOLD_CHECK_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getThresholdEnabled() <em>Threshold Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean THRESHOLD_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThresholdEnabled() <em>Threshold Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean thresholdEnabled = THRESHOLD_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getThroughputAlertsEnabled() <em>Throughput Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputAlertsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean THROUGHPUT_ALERTS_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThroughputAlertsEnabled() <em>Throughput Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputAlertsEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean throughputAlertsEnabled = THROUGHPUT_ALERTS_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getThroughputWarningAlertThreshold() <em>Throughput Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputWarningAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer THROUGHPUT_WARNING_ALERT_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThroughputWarningAlertThreshold() <em>Throughput Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputWarningAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer throughputWarningAlertThreshold = THROUGHPUT_WARNING_ALERT_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getThroughputCriticalAlertThreshold() <em>Throughput Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputCriticalAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer THROUGHPUT_CRITICAL_ALERT_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThroughputCriticalAlertThreshold() <em>Throughput Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughputCriticalAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer throughputCriticalAlertThreshold = THROUGHPUT_CRITICAL_ALERT_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicalCapacityAlertsEnabled() <em>Physical Capacity Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalCapacityAlertsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PHYSICAL_CAPACITY_ALERTS_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalCapacityAlertsEnabled() <em>Physical Capacity Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalCapacityAlertsEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean physicalCapacityAlertsEnabled = PHYSICAL_CAPACITY_ALERTS_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicalCapacityWarningAlertThreshold() <em>Physical Capacity Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalCapacityWarningAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PHYSICAL_CAPACITY_WARNING_ALERT_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalCapacityWarningAlertThreshold() <em>Physical Capacity Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalCapacityWarningAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer physicalCapacityWarningAlertThreshold = PHYSICAL_CAPACITY_WARNING_ALERT_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicalCapacityCriticalAlertThreshold() <em>Physical Capacity Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalCapacityCriticalAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PHYSICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalCapacityCriticalAlertThreshold() <em>Physical Capacity Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalCapacityCriticalAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer physicalCapacityCriticalAlertThreshold = PHYSICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalCapacityAlertsEnabled() <em>Logical Capacity Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalCapacityAlertsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LOGICAL_CAPACITY_ALERTS_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogicalCapacityAlertsEnabled() <em>Logical Capacity Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalCapacityAlertsEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean logicalCapacityAlertsEnabled = LOGICAL_CAPACITY_ALERTS_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalCapacityWarningAlertThreshold() <em>Logical Capacity Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalCapacityWarningAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOGICAL_CAPACITY_WARNING_ALERT_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogicalCapacityWarningAlertThreshold() <em>Logical Capacity Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalCapacityWarningAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer logicalCapacityWarningAlertThreshold = LOGICAL_CAPACITY_WARNING_ALERT_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogicalCapacityCriticalAlertThreshold() <em>Logical Capacity Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalCapacityCriticalAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOGICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogicalCapacityCriticalAlertThreshold() <em>Logical Capacity Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalCapacityCriticalAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer logicalCapacityCriticalAlertThreshold = LOGICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemRatioAlertsEnabled() <em>System Ratio Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemRatioAlertsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SYSTEM_RATIO_ALERTS_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemRatioAlertsEnabled() <em>System Ratio Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemRatioAlertsEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean systemRatioAlertsEnabled = SYSTEM_RATIO_ALERTS_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemRatioWarningAlertThreshold() <em>System Ratio Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemRatioWarningAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Float SYSTEM_RATIO_WARNING_ALERT_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemRatioWarningAlertThreshold() <em>System Ratio Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemRatioWarningAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected Float systemRatioWarningAlertThreshold = SYSTEM_RATIO_WARNING_ALERT_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemRatioCriticalAlertThreshold() <em>System Ratio Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemRatioCriticalAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Float SYSTEM_RATIO_CRITICAL_ALERT_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemRatioCriticalAlertThreshold() <em>System Ratio Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemRatioCriticalAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected Float systemRatioCriticalAlertThreshold = SYSTEM_RATIO_CRITICAL_ALERT_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduplicationRatioAlertsEnabled() <em>Deduplication Ratio Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduplicationRatioAlertsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEDUPLICATION_RATIO_ALERTS_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeduplicationRatioAlertsEnabled() <em>Deduplication Ratio Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduplicationRatioAlertsEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean deduplicationRatioAlertsEnabled = DEDUPLICATION_RATIO_ALERTS_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduplicationRatioWarningAlertThreshold() <em>Deduplication Ratio Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduplicationRatioWarningAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Float DEDUPLICATION_RATIO_WARNING_ALERT_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeduplicationRatioWarningAlertThreshold() <em>Deduplication Ratio Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduplicationRatioWarningAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected Float deduplicationRatioWarningAlertThreshold = DEDUPLICATION_RATIO_WARNING_ALERT_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduplicationRatioCriticalAlertThreshold() <em>Deduplication Ratio Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduplicationRatioCriticalAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Float DEDUPLICATION_RATIO_CRITICAL_ALERT_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeduplicationRatioCriticalAlertThreshold() <em>Deduplication Ratio Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduplicationRatioCriticalAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected Float deduplicationRatioCriticalAlertThreshold = DEDUPLICATION_RATIO_CRITICAL_ALERT_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplicationTrafficAlertsEnabled() <em>Replication Traffic Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationTrafficAlertsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REPLICATION_TRAFFIC_ALERTS_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplicationTrafficAlertsEnabled() <em>Replication Traffic Alerts Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationTrafficAlertsEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean replicationTrafficAlertsEnabled = REPLICATION_TRAFFIC_ALERTS_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplicationTrafficWarningAlertThreshold() <em>Replication Traffic Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationTrafficWarningAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Long REPLICATION_TRAFFIC_WARNING_ALERT_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplicationTrafficWarningAlertThreshold() <em>Replication Traffic Warning Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationTrafficWarningAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected Long replicationTrafficWarningAlertThreshold = REPLICATION_TRAFFIC_WARNING_ALERT_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplicationTrafficCriticalAlertThreshold() <em>Replication Traffic Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationTrafficCriticalAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Long REPLICATION_TRAFFIC_CRITICAL_ALERT_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplicationTrafficCriticalAlertThreshold() <em>Replication Traffic Critical Alert Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationTrafficCriticalAlertThreshold()
	 * @generated
	 * @ordered
	 */
	protected Long replicationTrafficCriticalAlertThreshold = REPLICATION_TRAFFIC_CRITICAL_ALERT_THRESHOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VTLResourceUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VTLResourceUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThroughput(Long newThroughput) {
		Long oldThroughput = throughput;
		throughput = newThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT, oldThroughput, throughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRelativeThroughput() {
		return relativeThroughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativeThroughput(Integer newRelativeThroughput) {
		Integer oldRelativeThroughput = relativeThroughput;
		relativeThroughput = newRelativeThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__RELATIVE_THROUGHPUT, oldRelativeThroughput, relativeThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getUsedPhysicalCapacity() {
		return usedPhysicalCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedPhysicalCapacity(Double newUsedPhysicalCapacity) {
		Double oldUsedPhysicalCapacity = usedPhysicalCapacity;
		usedPhysicalCapacity = newUsedPhysicalCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__USED_PHYSICAL_CAPACITY, oldUsedPhysicalCapacity, usedPhysicalCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getUsedLogicalCapacity() {
		return usedLogicalCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedLogicalCapacity(Double newUsedLogicalCapacity) {
		Double oldUsedLogicalCapacity = usedLogicalCapacity;
		usedLogicalCapacity = newUsedLogicalCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__USED_LOGICAL_CAPACITY, oldUsedLogicalCapacity, usedLogicalCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getUsedPhysicalCapacityOfMax() {
		return usedPhysicalCapacityOfMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedPhysicalCapacityOfMax(Float newUsedPhysicalCapacityOfMax) {
		Float oldUsedPhysicalCapacityOfMax = usedPhysicalCapacityOfMax;
		usedPhysicalCapacityOfMax = newUsedPhysicalCapacityOfMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__USED_PHYSICAL_CAPACITY_OF_MAX, oldUsedPhysicalCapacityOfMax, usedPhysicalCapacityOfMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getUsedLogicalCapacityOfMax() {
		return usedLogicalCapacityOfMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsedLogicalCapacityOfMax(Float newUsedLogicalCapacityOfMax) {
		Float oldUsedLogicalCapacityOfMax = usedLogicalCapacityOfMax;
		usedLogicalCapacityOfMax = newUsedLogicalCapacityOfMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__USED_LOGICAL_CAPACITY_OF_MAX, oldUsedLogicalCapacityOfMax, usedLogicalCapacityOfMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getSystemRatio() {
		return systemRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemRatio(Float newSystemRatio) {
		Float oldSystemRatio = systemRatio;
		systemRatio = newSystemRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO, oldSystemRatio, systemRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getDeduplicationRatio() {
		return deduplicationRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduplicationRatio(Float newDeduplicationRatio) {
		Float oldDeduplicationRatio = deduplicationRatio;
		deduplicationRatio = newDeduplicationRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO, oldDeduplicationRatio, deduplicationRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInReplicationThroughput() {
		return inReplicationThroughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInReplicationThroughput(Long newInReplicationThroughput) {
		Long oldInReplicationThroughput = inReplicationThroughput;
		inReplicationThroughput = newInReplicationThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__IN_REPLICATION_THROUGHPUT, oldInReplicationThroughput, inReplicationThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getOutReplicationThroughput() {
		return outReplicationThroughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutReplicationThroughput(Long newOutReplicationThroughput) {
		Long oldOutReplicationThroughput = outReplicationThroughput;
		outReplicationThroughput = newOutReplicationThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__OUT_REPLICATION_THROUGHPUT, oldOutReplicationThroughput, outReplicationThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getThresholdCheckInterval() {
		return thresholdCheckInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThresholdCheckInterval(Long newThresholdCheckInterval) {
		Long oldThresholdCheckInterval = thresholdCheckInterval;
		thresholdCheckInterval = newThresholdCheckInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__THRESHOLD_CHECK_INTERVAL, oldThresholdCheckInterval, thresholdCheckInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getThresholdEnabled() {
		return thresholdEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThresholdEnabled(Boolean newThresholdEnabled) {
		Boolean oldThresholdEnabled = thresholdEnabled;
		thresholdEnabled = newThresholdEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__THRESHOLD_ENABLED, oldThresholdEnabled, thresholdEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getThroughputAlertsEnabled() {
		return throughputAlertsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThroughputAlertsEnabled(Boolean newThroughputAlertsEnabled) {
		Boolean oldThroughputAlertsEnabled = throughputAlertsEnabled;
		throughputAlertsEnabled = newThroughputAlertsEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT_ALERTS_ENABLED, oldThroughputAlertsEnabled, throughputAlertsEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getThroughputWarningAlertThreshold() {
		return throughputWarningAlertThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThroughputWarningAlertThreshold(Integer newThroughputWarningAlertThreshold) {
		Integer oldThroughputWarningAlertThreshold = throughputWarningAlertThreshold;
		throughputWarningAlertThreshold = newThroughputWarningAlertThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT_WARNING_ALERT_THRESHOLD, oldThroughputWarningAlertThreshold, throughputWarningAlertThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getThroughputCriticalAlertThreshold() {
		return throughputCriticalAlertThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThroughputCriticalAlertThreshold(Integer newThroughputCriticalAlertThreshold) {
		Integer oldThroughputCriticalAlertThreshold = throughputCriticalAlertThreshold;
		throughputCriticalAlertThreshold = newThroughputCriticalAlertThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT_CRITICAL_ALERT_THRESHOLD, oldThroughputCriticalAlertThreshold, throughputCriticalAlertThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPhysicalCapacityAlertsEnabled() {
		return physicalCapacityAlertsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalCapacityAlertsEnabled(Boolean newPhysicalCapacityAlertsEnabled) {
		Boolean oldPhysicalCapacityAlertsEnabled = physicalCapacityAlertsEnabled;
		physicalCapacityAlertsEnabled = newPhysicalCapacityAlertsEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__PHYSICAL_CAPACITY_ALERTS_ENABLED, oldPhysicalCapacityAlertsEnabled, physicalCapacityAlertsEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPhysicalCapacityWarningAlertThreshold() {
		return physicalCapacityWarningAlertThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalCapacityWarningAlertThreshold(Integer newPhysicalCapacityWarningAlertThreshold) {
		Integer oldPhysicalCapacityWarningAlertThreshold = physicalCapacityWarningAlertThreshold;
		physicalCapacityWarningAlertThreshold = newPhysicalCapacityWarningAlertThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__PHYSICAL_CAPACITY_WARNING_ALERT_THRESHOLD, oldPhysicalCapacityWarningAlertThreshold, physicalCapacityWarningAlertThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPhysicalCapacityCriticalAlertThreshold() {
		return physicalCapacityCriticalAlertThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalCapacityCriticalAlertThreshold(Integer newPhysicalCapacityCriticalAlertThreshold) {
		Integer oldPhysicalCapacityCriticalAlertThreshold = physicalCapacityCriticalAlertThreshold;
		physicalCapacityCriticalAlertThreshold = newPhysicalCapacityCriticalAlertThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__PHYSICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD, oldPhysicalCapacityCriticalAlertThreshold, physicalCapacityCriticalAlertThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLogicalCapacityAlertsEnabled() {
		return logicalCapacityAlertsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalCapacityAlertsEnabled(Boolean newLogicalCapacityAlertsEnabled) {
		Boolean oldLogicalCapacityAlertsEnabled = logicalCapacityAlertsEnabled;
		logicalCapacityAlertsEnabled = newLogicalCapacityAlertsEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__LOGICAL_CAPACITY_ALERTS_ENABLED, oldLogicalCapacityAlertsEnabled, logicalCapacityAlertsEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLogicalCapacityWarningAlertThreshold() {
		return logicalCapacityWarningAlertThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalCapacityWarningAlertThreshold(Integer newLogicalCapacityWarningAlertThreshold) {
		Integer oldLogicalCapacityWarningAlertThreshold = logicalCapacityWarningAlertThreshold;
		logicalCapacityWarningAlertThreshold = newLogicalCapacityWarningAlertThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__LOGICAL_CAPACITY_WARNING_ALERT_THRESHOLD, oldLogicalCapacityWarningAlertThreshold, logicalCapacityWarningAlertThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLogicalCapacityCriticalAlertThreshold() {
		return logicalCapacityCriticalAlertThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogicalCapacityCriticalAlertThreshold(Integer newLogicalCapacityCriticalAlertThreshold) {
		Integer oldLogicalCapacityCriticalAlertThreshold = logicalCapacityCriticalAlertThreshold;
		logicalCapacityCriticalAlertThreshold = newLogicalCapacityCriticalAlertThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__LOGICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD, oldLogicalCapacityCriticalAlertThreshold, logicalCapacityCriticalAlertThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSystemRatioAlertsEnabled() {
		return systemRatioAlertsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemRatioAlertsEnabled(Boolean newSystemRatioAlertsEnabled) {
		Boolean oldSystemRatioAlertsEnabled = systemRatioAlertsEnabled;
		systemRatioAlertsEnabled = newSystemRatioAlertsEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO_ALERTS_ENABLED, oldSystemRatioAlertsEnabled, systemRatioAlertsEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getSystemRatioWarningAlertThreshold() {
		return systemRatioWarningAlertThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemRatioWarningAlertThreshold(Float newSystemRatioWarningAlertThreshold) {
		Float oldSystemRatioWarningAlertThreshold = systemRatioWarningAlertThreshold;
		systemRatioWarningAlertThreshold = newSystemRatioWarningAlertThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO_WARNING_ALERT_THRESHOLD, oldSystemRatioWarningAlertThreshold, systemRatioWarningAlertThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getSystemRatioCriticalAlertThreshold() {
		return systemRatioCriticalAlertThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemRatioCriticalAlertThreshold(Float newSystemRatioCriticalAlertThreshold) {
		Float oldSystemRatioCriticalAlertThreshold = systemRatioCriticalAlertThreshold;
		systemRatioCriticalAlertThreshold = newSystemRatioCriticalAlertThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO_CRITICAL_ALERT_THRESHOLD, oldSystemRatioCriticalAlertThreshold, systemRatioCriticalAlertThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeduplicationRatioAlertsEnabled() {
		return deduplicationRatioAlertsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduplicationRatioAlertsEnabled(Boolean newDeduplicationRatioAlertsEnabled) {
		Boolean oldDeduplicationRatioAlertsEnabled = deduplicationRatioAlertsEnabled;
		deduplicationRatioAlertsEnabled = newDeduplicationRatioAlertsEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO_ALERTS_ENABLED, oldDeduplicationRatioAlertsEnabled, deduplicationRatioAlertsEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getDeduplicationRatioWarningAlertThreshold() {
		return deduplicationRatioWarningAlertThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduplicationRatioWarningAlertThreshold(Float newDeduplicationRatioWarningAlertThreshold) {
		Float oldDeduplicationRatioWarningAlertThreshold = deduplicationRatioWarningAlertThreshold;
		deduplicationRatioWarningAlertThreshold = newDeduplicationRatioWarningAlertThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO_WARNING_ALERT_THRESHOLD, oldDeduplicationRatioWarningAlertThreshold, deduplicationRatioWarningAlertThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getDeduplicationRatioCriticalAlertThreshold() {
		return deduplicationRatioCriticalAlertThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduplicationRatioCriticalAlertThreshold(Float newDeduplicationRatioCriticalAlertThreshold) {
		Float oldDeduplicationRatioCriticalAlertThreshold = deduplicationRatioCriticalAlertThreshold;
		deduplicationRatioCriticalAlertThreshold = newDeduplicationRatioCriticalAlertThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO_CRITICAL_ALERT_THRESHOLD, oldDeduplicationRatioCriticalAlertThreshold, deduplicationRatioCriticalAlertThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getReplicationTrafficAlertsEnabled() {
		return replicationTrafficAlertsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplicationTrafficAlertsEnabled(Boolean newReplicationTrafficAlertsEnabled) {
		Boolean oldReplicationTrafficAlertsEnabled = replicationTrafficAlertsEnabled;
		replicationTrafficAlertsEnabled = newReplicationTrafficAlertsEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__REPLICATION_TRAFFIC_ALERTS_ENABLED, oldReplicationTrafficAlertsEnabled, replicationTrafficAlertsEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReplicationTrafficWarningAlertThreshold() {
		return replicationTrafficWarningAlertThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplicationTrafficWarningAlertThreshold(Long newReplicationTrafficWarningAlertThreshold) {
		Long oldReplicationTrafficWarningAlertThreshold = replicationTrafficWarningAlertThreshold;
		replicationTrafficWarningAlertThreshold = newReplicationTrafficWarningAlertThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__REPLICATION_TRAFFIC_WARNING_ALERT_THRESHOLD, oldReplicationTrafficWarningAlertThreshold, replicationTrafficWarningAlertThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReplicationTrafficCriticalAlertThreshold() {
		return replicationTrafficCriticalAlertThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplicationTrafficCriticalAlertThreshold(Long newReplicationTrafficCriticalAlertThreshold) {
		Long oldReplicationTrafficCriticalAlertThreshold = replicationTrafficCriticalAlertThreshold;
		replicationTrafficCriticalAlertThreshold = newReplicationTrafficCriticalAlertThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VTL_RESOURCE_USAGE__REPLICATION_TRAFFIC_CRITICAL_ALERT_THRESHOLD, oldReplicationTrafficCriticalAlertThreshold, replicationTrafficCriticalAlertThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT:
				return getThroughput();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__RELATIVE_THROUGHPUT:
				return getRelativeThroughput();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_PHYSICAL_CAPACITY:
				return getUsedPhysicalCapacity();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_LOGICAL_CAPACITY:
				return getUsedLogicalCapacity();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_PHYSICAL_CAPACITY_OF_MAX:
				return getUsedPhysicalCapacityOfMax();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_LOGICAL_CAPACITY_OF_MAX:
				return getUsedLogicalCapacityOfMax();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO:
				return getSystemRatio();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO:
				return getDeduplicationRatio();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__IN_REPLICATION_THROUGHPUT:
				return getInReplicationThroughput();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__OUT_REPLICATION_THROUGHPUT:
				return getOutReplicationThroughput();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THRESHOLD_CHECK_INTERVAL:
				return getThresholdCheckInterval();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THRESHOLD_ENABLED:
				return getThresholdEnabled();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT_ALERTS_ENABLED:
				return getThroughputAlertsEnabled();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT_WARNING_ALERT_THRESHOLD:
				return getThroughputWarningAlertThreshold();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT_CRITICAL_ALERT_THRESHOLD:
				return getThroughputCriticalAlertThreshold();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__PHYSICAL_CAPACITY_ALERTS_ENABLED:
				return getPhysicalCapacityAlertsEnabled();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__PHYSICAL_CAPACITY_WARNING_ALERT_THRESHOLD:
				return getPhysicalCapacityWarningAlertThreshold();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__PHYSICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD:
				return getPhysicalCapacityCriticalAlertThreshold();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__LOGICAL_CAPACITY_ALERTS_ENABLED:
				return getLogicalCapacityAlertsEnabled();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__LOGICAL_CAPACITY_WARNING_ALERT_THRESHOLD:
				return getLogicalCapacityWarningAlertThreshold();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__LOGICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD:
				return getLogicalCapacityCriticalAlertThreshold();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO_ALERTS_ENABLED:
				return getSystemRatioAlertsEnabled();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO_WARNING_ALERT_THRESHOLD:
				return getSystemRatioWarningAlertThreshold();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO_CRITICAL_ALERT_THRESHOLD:
				return getSystemRatioCriticalAlertThreshold();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO_ALERTS_ENABLED:
				return getDeduplicationRatioAlertsEnabled();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO_WARNING_ALERT_THRESHOLD:
				return getDeduplicationRatioWarningAlertThreshold();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO_CRITICAL_ALERT_THRESHOLD:
				return getDeduplicationRatioCriticalAlertThreshold();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__REPLICATION_TRAFFIC_ALERTS_ENABLED:
				return getReplicationTrafficAlertsEnabled();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__REPLICATION_TRAFFIC_WARNING_ALERT_THRESHOLD:
				return getReplicationTrafficWarningAlertThreshold();
			case CimPackage.CIM_VTL_RESOURCE_USAGE__REPLICATION_TRAFFIC_CRITICAL_ALERT_THRESHOLD:
				return getReplicationTrafficCriticalAlertThreshold();
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
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT:
				setThroughput((Long)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__RELATIVE_THROUGHPUT:
				setRelativeThroughput((Integer)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_PHYSICAL_CAPACITY:
				setUsedPhysicalCapacity((Double)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_LOGICAL_CAPACITY:
				setUsedLogicalCapacity((Double)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_PHYSICAL_CAPACITY_OF_MAX:
				setUsedPhysicalCapacityOfMax((Float)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_LOGICAL_CAPACITY_OF_MAX:
				setUsedLogicalCapacityOfMax((Float)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO:
				setSystemRatio((Float)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO:
				setDeduplicationRatio((Float)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__IN_REPLICATION_THROUGHPUT:
				setInReplicationThroughput((Long)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__OUT_REPLICATION_THROUGHPUT:
				setOutReplicationThroughput((Long)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THRESHOLD_CHECK_INTERVAL:
				setThresholdCheckInterval((Long)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THRESHOLD_ENABLED:
				setThresholdEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT_ALERTS_ENABLED:
				setThroughputAlertsEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT_WARNING_ALERT_THRESHOLD:
				setThroughputWarningAlertThreshold((Integer)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT_CRITICAL_ALERT_THRESHOLD:
				setThroughputCriticalAlertThreshold((Integer)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__PHYSICAL_CAPACITY_ALERTS_ENABLED:
				setPhysicalCapacityAlertsEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__PHYSICAL_CAPACITY_WARNING_ALERT_THRESHOLD:
				setPhysicalCapacityWarningAlertThreshold((Integer)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__PHYSICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD:
				setPhysicalCapacityCriticalAlertThreshold((Integer)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__LOGICAL_CAPACITY_ALERTS_ENABLED:
				setLogicalCapacityAlertsEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__LOGICAL_CAPACITY_WARNING_ALERT_THRESHOLD:
				setLogicalCapacityWarningAlertThreshold((Integer)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__LOGICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD:
				setLogicalCapacityCriticalAlertThreshold((Integer)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO_ALERTS_ENABLED:
				setSystemRatioAlertsEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO_WARNING_ALERT_THRESHOLD:
				setSystemRatioWarningAlertThreshold((Float)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO_CRITICAL_ALERT_THRESHOLD:
				setSystemRatioCriticalAlertThreshold((Float)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO_ALERTS_ENABLED:
				setDeduplicationRatioAlertsEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO_WARNING_ALERT_THRESHOLD:
				setDeduplicationRatioWarningAlertThreshold((Float)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO_CRITICAL_ALERT_THRESHOLD:
				setDeduplicationRatioCriticalAlertThreshold((Float)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__REPLICATION_TRAFFIC_ALERTS_ENABLED:
				setReplicationTrafficAlertsEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__REPLICATION_TRAFFIC_WARNING_ALERT_THRESHOLD:
				setReplicationTrafficWarningAlertThreshold((Long)newValue);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__REPLICATION_TRAFFIC_CRITICAL_ALERT_THRESHOLD:
				setReplicationTrafficCriticalAlertThreshold((Long)newValue);
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
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT:
				setThroughput(THROUGHPUT_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__RELATIVE_THROUGHPUT:
				setRelativeThroughput(RELATIVE_THROUGHPUT_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_PHYSICAL_CAPACITY:
				setUsedPhysicalCapacity(USED_PHYSICAL_CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_LOGICAL_CAPACITY:
				setUsedLogicalCapacity(USED_LOGICAL_CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_PHYSICAL_CAPACITY_OF_MAX:
				setUsedPhysicalCapacityOfMax(USED_PHYSICAL_CAPACITY_OF_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_LOGICAL_CAPACITY_OF_MAX:
				setUsedLogicalCapacityOfMax(USED_LOGICAL_CAPACITY_OF_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO:
				setSystemRatio(SYSTEM_RATIO_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO:
				setDeduplicationRatio(DEDUPLICATION_RATIO_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__IN_REPLICATION_THROUGHPUT:
				setInReplicationThroughput(IN_REPLICATION_THROUGHPUT_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__OUT_REPLICATION_THROUGHPUT:
				setOutReplicationThroughput(OUT_REPLICATION_THROUGHPUT_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THRESHOLD_CHECK_INTERVAL:
				setThresholdCheckInterval(THRESHOLD_CHECK_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THRESHOLD_ENABLED:
				setThresholdEnabled(THRESHOLD_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT_ALERTS_ENABLED:
				setThroughputAlertsEnabled(THROUGHPUT_ALERTS_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT_WARNING_ALERT_THRESHOLD:
				setThroughputWarningAlertThreshold(THROUGHPUT_WARNING_ALERT_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT_CRITICAL_ALERT_THRESHOLD:
				setThroughputCriticalAlertThreshold(THROUGHPUT_CRITICAL_ALERT_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__PHYSICAL_CAPACITY_ALERTS_ENABLED:
				setPhysicalCapacityAlertsEnabled(PHYSICAL_CAPACITY_ALERTS_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__PHYSICAL_CAPACITY_WARNING_ALERT_THRESHOLD:
				setPhysicalCapacityWarningAlertThreshold(PHYSICAL_CAPACITY_WARNING_ALERT_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__PHYSICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD:
				setPhysicalCapacityCriticalAlertThreshold(PHYSICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__LOGICAL_CAPACITY_ALERTS_ENABLED:
				setLogicalCapacityAlertsEnabled(LOGICAL_CAPACITY_ALERTS_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__LOGICAL_CAPACITY_WARNING_ALERT_THRESHOLD:
				setLogicalCapacityWarningAlertThreshold(LOGICAL_CAPACITY_WARNING_ALERT_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__LOGICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD:
				setLogicalCapacityCriticalAlertThreshold(LOGICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO_ALERTS_ENABLED:
				setSystemRatioAlertsEnabled(SYSTEM_RATIO_ALERTS_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO_WARNING_ALERT_THRESHOLD:
				setSystemRatioWarningAlertThreshold(SYSTEM_RATIO_WARNING_ALERT_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO_CRITICAL_ALERT_THRESHOLD:
				setSystemRatioCriticalAlertThreshold(SYSTEM_RATIO_CRITICAL_ALERT_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO_ALERTS_ENABLED:
				setDeduplicationRatioAlertsEnabled(DEDUPLICATION_RATIO_ALERTS_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO_WARNING_ALERT_THRESHOLD:
				setDeduplicationRatioWarningAlertThreshold(DEDUPLICATION_RATIO_WARNING_ALERT_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO_CRITICAL_ALERT_THRESHOLD:
				setDeduplicationRatioCriticalAlertThreshold(DEDUPLICATION_RATIO_CRITICAL_ALERT_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__REPLICATION_TRAFFIC_ALERTS_ENABLED:
				setReplicationTrafficAlertsEnabled(REPLICATION_TRAFFIC_ALERTS_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__REPLICATION_TRAFFIC_WARNING_ALERT_THRESHOLD:
				setReplicationTrafficWarningAlertThreshold(REPLICATION_TRAFFIC_WARNING_ALERT_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_VTL_RESOURCE_USAGE__REPLICATION_TRAFFIC_CRITICAL_ALERT_THRESHOLD:
				setReplicationTrafficCriticalAlertThreshold(REPLICATION_TRAFFIC_CRITICAL_ALERT_THRESHOLD_EDEFAULT);
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
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT:
				return THROUGHPUT_EDEFAULT == null ? throughput != null : !THROUGHPUT_EDEFAULT.equals(throughput);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__RELATIVE_THROUGHPUT:
				return RELATIVE_THROUGHPUT_EDEFAULT == null ? relativeThroughput != null : !RELATIVE_THROUGHPUT_EDEFAULT.equals(relativeThroughput);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_PHYSICAL_CAPACITY:
				return USED_PHYSICAL_CAPACITY_EDEFAULT == null ? usedPhysicalCapacity != null : !USED_PHYSICAL_CAPACITY_EDEFAULT.equals(usedPhysicalCapacity);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_LOGICAL_CAPACITY:
				return USED_LOGICAL_CAPACITY_EDEFAULT == null ? usedLogicalCapacity != null : !USED_LOGICAL_CAPACITY_EDEFAULT.equals(usedLogicalCapacity);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_PHYSICAL_CAPACITY_OF_MAX:
				return USED_PHYSICAL_CAPACITY_OF_MAX_EDEFAULT == null ? usedPhysicalCapacityOfMax != null : !USED_PHYSICAL_CAPACITY_OF_MAX_EDEFAULT.equals(usedPhysicalCapacityOfMax);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__USED_LOGICAL_CAPACITY_OF_MAX:
				return USED_LOGICAL_CAPACITY_OF_MAX_EDEFAULT == null ? usedLogicalCapacityOfMax != null : !USED_LOGICAL_CAPACITY_OF_MAX_EDEFAULT.equals(usedLogicalCapacityOfMax);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO:
				return SYSTEM_RATIO_EDEFAULT == null ? systemRatio != null : !SYSTEM_RATIO_EDEFAULT.equals(systemRatio);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO:
				return DEDUPLICATION_RATIO_EDEFAULT == null ? deduplicationRatio != null : !DEDUPLICATION_RATIO_EDEFAULT.equals(deduplicationRatio);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__IN_REPLICATION_THROUGHPUT:
				return IN_REPLICATION_THROUGHPUT_EDEFAULT == null ? inReplicationThroughput != null : !IN_REPLICATION_THROUGHPUT_EDEFAULT.equals(inReplicationThroughput);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__OUT_REPLICATION_THROUGHPUT:
				return OUT_REPLICATION_THROUGHPUT_EDEFAULT == null ? outReplicationThroughput != null : !OUT_REPLICATION_THROUGHPUT_EDEFAULT.equals(outReplicationThroughput);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THRESHOLD_CHECK_INTERVAL:
				return THRESHOLD_CHECK_INTERVAL_EDEFAULT == null ? thresholdCheckInterval != null : !THRESHOLD_CHECK_INTERVAL_EDEFAULT.equals(thresholdCheckInterval);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THRESHOLD_ENABLED:
				return THRESHOLD_ENABLED_EDEFAULT == null ? thresholdEnabled != null : !THRESHOLD_ENABLED_EDEFAULT.equals(thresholdEnabled);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT_ALERTS_ENABLED:
				return THROUGHPUT_ALERTS_ENABLED_EDEFAULT == null ? throughputAlertsEnabled != null : !THROUGHPUT_ALERTS_ENABLED_EDEFAULT.equals(throughputAlertsEnabled);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT_WARNING_ALERT_THRESHOLD:
				return THROUGHPUT_WARNING_ALERT_THRESHOLD_EDEFAULT == null ? throughputWarningAlertThreshold != null : !THROUGHPUT_WARNING_ALERT_THRESHOLD_EDEFAULT.equals(throughputWarningAlertThreshold);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__THROUGHPUT_CRITICAL_ALERT_THRESHOLD:
				return THROUGHPUT_CRITICAL_ALERT_THRESHOLD_EDEFAULT == null ? throughputCriticalAlertThreshold != null : !THROUGHPUT_CRITICAL_ALERT_THRESHOLD_EDEFAULT.equals(throughputCriticalAlertThreshold);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__PHYSICAL_CAPACITY_ALERTS_ENABLED:
				return PHYSICAL_CAPACITY_ALERTS_ENABLED_EDEFAULT == null ? physicalCapacityAlertsEnabled != null : !PHYSICAL_CAPACITY_ALERTS_ENABLED_EDEFAULT.equals(physicalCapacityAlertsEnabled);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__PHYSICAL_CAPACITY_WARNING_ALERT_THRESHOLD:
				return PHYSICAL_CAPACITY_WARNING_ALERT_THRESHOLD_EDEFAULT == null ? physicalCapacityWarningAlertThreshold != null : !PHYSICAL_CAPACITY_WARNING_ALERT_THRESHOLD_EDEFAULT.equals(physicalCapacityWarningAlertThreshold);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__PHYSICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD:
				return PHYSICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD_EDEFAULT == null ? physicalCapacityCriticalAlertThreshold != null : !PHYSICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD_EDEFAULT.equals(physicalCapacityCriticalAlertThreshold);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__LOGICAL_CAPACITY_ALERTS_ENABLED:
				return LOGICAL_CAPACITY_ALERTS_ENABLED_EDEFAULT == null ? logicalCapacityAlertsEnabled != null : !LOGICAL_CAPACITY_ALERTS_ENABLED_EDEFAULT.equals(logicalCapacityAlertsEnabled);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__LOGICAL_CAPACITY_WARNING_ALERT_THRESHOLD:
				return LOGICAL_CAPACITY_WARNING_ALERT_THRESHOLD_EDEFAULT == null ? logicalCapacityWarningAlertThreshold != null : !LOGICAL_CAPACITY_WARNING_ALERT_THRESHOLD_EDEFAULT.equals(logicalCapacityWarningAlertThreshold);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__LOGICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD:
				return LOGICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD_EDEFAULT == null ? logicalCapacityCriticalAlertThreshold != null : !LOGICAL_CAPACITY_CRITICAL_ALERT_THRESHOLD_EDEFAULT.equals(logicalCapacityCriticalAlertThreshold);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO_ALERTS_ENABLED:
				return SYSTEM_RATIO_ALERTS_ENABLED_EDEFAULT == null ? systemRatioAlertsEnabled != null : !SYSTEM_RATIO_ALERTS_ENABLED_EDEFAULT.equals(systemRatioAlertsEnabled);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO_WARNING_ALERT_THRESHOLD:
				return SYSTEM_RATIO_WARNING_ALERT_THRESHOLD_EDEFAULT == null ? systemRatioWarningAlertThreshold != null : !SYSTEM_RATIO_WARNING_ALERT_THRESHOLD_EDEFAULT.equals(systemRatioWarningAlertThreshold);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__SYSTEM_RATIO_CRITICAL_ALERT_THRESHOLD:
				return SYSTEM_RATIO_CRITICAL_ALERT_THRESHOLD_EDEFAULT == null ? systemRatioCriticalAlertThreshold != null : !SYSTEM_RATIO_CRITICAL_ALERT_THRESHOLD_EDEFAULT.equals(systemRatioCriticalAlertThreshold);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO_ALERTS_ENABLED:
				return DEDUPLICATION_RATIO_ALERTS_ENABLED_EDEFAULT == null ? deduplicationRatioAlertsEnabled != null : !DEDUPLICATION_RATIO_ALERTS_ENABLED_EDEFAULT.equals(deduplicationRatioAlertsEnabled);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO_WARNING_ALERT_THRESHOLD:
				return DEDUPLICATION_RATIO_WARNING_ALERT_THRESHOLD_EDEFAULT == null ? deduplicationRatioWarningAlertThreshold != null : !DEDUPLICATION_RATIO_WARNING_ALERT_THRESHOLD_EDEFAULT.equals(deduplicationRatioWarningAlertThreshold);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__DEDUPLICATION_RATIO_CRITICAL_ALERT_THRESHOLD:
				return DEDUPLICATION_RATIO_CRITICAL_ALERT_THRESHOLD_EDEFAULT == null ? deduplicationRatioCriticalAlertThreshold != null : !DEDUPLICATION_RATIO_CRITICAL_ALERT_THRESHOLD_EDEFAULT.equals(deduplicationRatioCriticalAlertThreshold);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__REPLICATION_TRAFFIC_ALERTS_ENABLED:
				return REPLICATION_TRAFFIC_ALERTS_ENABLED_EDEFAULT == null ? replicationTrafficAlertsEnabled != null : !REPLICATION_TRAFFIC_ALERTS_ENABLED_EDEFAULT.equals(replicationTrafficAlertsEnabled);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__REPLICATION_TRAFFIC_WARNING_ALERT_THRESHOLD:
				return REPLICATION_TRAFFIC_WARNING_ALERT_THRESHOLD_EDEFAULT == null ? replicationTrafficWarningAlertThreshold != null : !REPLICATION_TRAFFIC_WARNING_ALERT_THRESHOLD_EDEFAULT.equals(replicationTrafficWarningAlertThreshold);
			case CimPackage.CIM_VTL_RESOURCE_USAGE__REPLICATION_TRAFFIC_CRITICAL_ALERT_THRESHOLD:
				return REPLICATION_TRAFFIC_CRITICAL_ALERT_THRESHOLD_EDEFAULT == null ? replicationTrafficCriticalAlertThreshold != null : !REPLICATION_TRAFFIC_CRITICAL_ALERT_THRESHOLD_EDEFAULT.equals(replicationTrafficCriticalAlertThreshold);
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
		result.append(" (Throughput: ");
		result.append(throughput);
		result.append(", RelativeThroughput: ");
		result.append(relativeThroughput);
		result.append(", UsedPhysicalCapacity: ");
		result.append(usedPhysicalCapacity);
		result.append(", UsedLogicalCapacity: ");
		result.append(usedLogicalCapacity);
		result.append(", UsedPhysicalCapacityOfMax: ");
		result.append(usedPhysicalCapacityOfMax);
		result.append(", UsedLogicalCapacityOfMax: ");
		result.append(usedLogicalCapacityOfMax);
		result.append(", SystemRatio: ");
		result.append(systemRatio);
		result.append(", DeduplicationRatio: ");
		result.append(deduplicationRatio);
		result.append(", InReplicationThroughput: ");
		result.append(inReplicationThroughput);
		result.append(", OutReplicationThroughput: ");
		result.append(outReplicationThroughput);
		result.append(", ThresholdCheckInterval: ");
		result.append(thresholdCheckInterval);
		result.append(", ThresholdEnabled: ");
		result.append(thresholdEnabled);
		result.append(", ThroughputAlertsEnabled: ");
		result.append(throughputAlertsEnabled);
		result.append(", ThroughputWarningAlertThreshold: ");
		result.append(throughputWarningAlertThreshold);
		result.append(", ThroughputCriticalAlertThreshold: ");
		result.append(throughputCriticalAlertThreshold);
		result.append(", PhysicalCapacityAlertsEnabled: ");
		result.append(physicalCapacityAlertsEnabled);
		result.append(", PhysicalCapacityWarningAlertThreshold: ");
		result.append(physicalCapacityWarningAlertThreshold);
		result.append(", PhysicalCapacityCriticalAlertThreshold: ");
		result.append(physicalCapacityCriticalAlertThreshold);
		result.append(", LogicalCapacityAlertsEnabled: ");
		result.append(logicalCapacityAlertsEnabled);
		result.append(", LogicalCapacityWarningAlertThreshold: ");
		result.append(logicalCapacityWarningAlertThreshold);
		result.append(", LogicalCapacityCriticalAlertThreshold: ");
		result.append(logicalCapacityCriticalAlertThreshold);
		result.append(", SystemRatioAlertsEnabled: ");
		result.append(systemRatioAlertsEnabled);
		result.append(", SystemRatioWarningAlertThreshold: ");
		result.append(systemRatioWarningAlertThreshold);
		result.append(", SystemRatioCriticalAlertThreshold: ");
		result.append(systemRatioCriticalAlertThreshold);
		result.append(", DeduplicationRatioAlertsEnabled: ");
		result.append(deduplicationRatioAlertsEnabled);
		result.append(", DeduplicationRatioWarningAlertThreshold: ");
		result.append(deduplicationRatioWarningAlertThreshold);
		result.append(", DeduplicationRatioCriticalAlertThreshold: ");
		result.append(deduplicationRatioCriticalAlertThreshold);
		result.append(", ReplicationTrafficAlertsEnabled: ");
		result.append(replicationTrafficAlertsEnabled);
		result.append(", ReplicationTrafficWarningAlertThreshold: ");
		result.append(replicationTrafficWarningAlertThreshold);
		result.append(", ReplicationTrafficCriticalAlertThreshold: ");
		result.append(replicationTrafficCriticalAlertThreshold);
		result.append(')');
		return result.toString();
	}

} //CIM_VTLResourceUsageImpl

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

import java.util.Collection;

import org.dmtf.cim.CIM_BlockStatisticsManifest;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Block Statistics Manifest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeStartStatisticTime <em>Include Start Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeStatisticTime <em>Include Statistic Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeTotalIOs <em>Include Total IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeKBytesTransferred <em>Include KBytes Transferred</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeIOTimeCounter <em>Include IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeReadIOs <em>Include Read IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeReadHitIOs <em>Include Read Hit IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeReadIOTimeCounter <em>Include Read IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeReadHitIOTimeCounter <em>Include Read Hit IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeKBytesRead <em>Include KBytes Read</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeWriteIOs <em>Include Write IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeWriteHitIOs <em>Include Write Hit IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeWriteIOTimeCounter <em>Include Write IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeWriteHitIOTimeCounter <em>Include Write Hit IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeKBytesWritten <em>Include KBytes Written</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeIdleTimeCounter <em>Include Idle Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeMaintOp <em>Include Maint Op</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeMaintTimeCounter <em>Include Maint Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getCSVRateSequence <em>CSV Rate Sequence</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getCSVSequence <em>CSV Sequence</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeKBytesReadRate <em>Include KBytes Read Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeKBytesTransferredRate <em>Include KBytes Transferred Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeKBytesWrittenRate <em>Include KBytes Written Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeMaintOpRate <em>Include Maint Op Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeRateIntervalEndTime <em>Include Rate Interval End Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeRateIntervalStartTime <em>Include Rate Interval Start Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeReadHitIOsRate <em>Include Read Hit IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeReadIOsRate <em>Include Read IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeReadSequentialHits <em>Include Read Sequential Hits</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeReadSequentialIOs <em>Include Read Sequential IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeTotalHitIOs <em>Include Total Hit IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeTotalIOsRate <em>Include Total IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeWriteHitIOsRate <em>Include Write Hit IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeWriteIOsRate <em>Include Write IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeWriteSequentialHits <em>Include Write Sequential Hits</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getIncludeWriteSequentialIOs <em>Include Write Sequential IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStatisticsManifestImpl#getRateElementType <em>Rate Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BlockStatisticsManifestImpl extends CIM_ManagedElementImpl implements CIM_BlockStatisticsManifest {
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
	 * The default value of the '{@link #getIncludeKBytesTransferred() <em>Include KBytes Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeKBytesTransferred()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_KBYTES_TRANSFERRED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeKBytesTransferred() <em>Include KBytes Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeKBytesTransferred()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeKBytesTransferred = INCLUDE_KBYTES_TRANSFERRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeIOTimeCounter() <em>Include IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_IO_TIME_COUNTER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeIOTimeCounter() <em>Include IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeIOTimeCounter = INCLUDE_IO_TIME_COUNTER_EDEFAULT;

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
	 * The default value of the '{@link #getIncludeReadHitIOs() <em>Include Read Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadHitIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_READ_HIT_IOS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeReadHitIOs() <em>Include Read Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadHitIOs()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeReadHitIOs = INCLUDE_READ_HIT_IOS_EDEFAULT;

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
	 * The default value of the '{@link #getIncludeReadHitIOTimeCounter() <em>Include Read Hit IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadHitIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_READ_HIT_IO_TIME_COUNTER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeReadHitIOTimeCounter() <em>Include Read Hit IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadHitIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeReadHitIOTimeCounter = INCLUDE_READ_HIT_IO_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeKBytesRead() <em>Include KBytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeKBytesRead()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_KBYTES_READ_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeKBytesRead() <em>Include KBytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeKBytesRead()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeKBytesRead = INCLUDE_KBYTES_READ_EDEFAULT;

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
	 * The default value of the '{@link #getIncludeWriteHitIOs() <em>Include Write Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteHitIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_WRITE_HIT_IOS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeWriteHitIOs() <em>Include Write Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteHitIOs()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeWriteHitIOs = INCLUDE_WRITE_HIT_IOS_EDEFAULT;

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
	 * The default value of the '{@link #getIncludeWriteHitIOTimeCounter() <em>Include Write Hit IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteHitIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_WRITE_HIT_IO_TIME_COUNTER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeWriteHitIOTimeCounter() <em>Include Write Hit IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteHitIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeWriteHitIOTimeCounter = INCLUDE_WRITE_HIT_IO_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeKBytesWritten() <em>Include KBytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeKBytesWritten()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_KBYTES_WRITTEN_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeKBytesWritten() <em>Include KBytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeKBytesWritten()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeKBytesWritten = INCLUDE_KBYTES_WRITTEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeIdleTimeCounter() <em>Include Idle Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeIdleTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_IDLE_TIME_COUNTER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeIdleTimeCounter() <em>Include Idle Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeIdleTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeIdleTimeCounter = INCLUDE_IDLE_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeMaintOp() <em>Include Maint Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMaintOp()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_MAINT_OP_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeMaintOp() <em>Include Maint Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMaintOp()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeMaintOp = INCLUDE_MAINT_OP_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeMaintTimeCounter() <em>Include Maint Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMaintTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_MAINT_TIME_COUNTER_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeMaintTimeCounter() <em>Include Maint Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMaintTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeMaintTimeCounter = INCLUDE_MAINT_TIME_COUNTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCSVRateSequence() <em>CSV Rate Sequence</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSVRateSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<String> csvRateSequence;

	/**
	 * The cached value of the '{@link #getCSVSequence() <em>CSV Sequence</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSVSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<String> csvSequence;

	/**
	 * The default value of the '{@link #getIncludeKBytesReadRate() <em>Include KBytes Read Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeKBytesReadRate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_KBYTES_READ_RATE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeKBytesReadRate() <em>Include KBytes Read Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeKBytesReadRate()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeKBytesReadRate = INCLUDE_KBYTES_READ_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeKBytesTransferredRate() <em>Include KBytes Transferred Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeKBytesTransferredRate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_KBYTES_TRANSFERRED_RATE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeKBytesTransferredRate() <em>Include KBytes Transferred Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeKBytesTransferredRate()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeKBytesTransferredRate = INCLUDE_KBYTES_TRANSFERRED_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeKBytesWrittenRate() <em>Include KBytes Written Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeKBytesWrittenRate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_KBYTES_WRITTEN_RATE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeKBytesWrittenRate() <em>Include KBytes Written Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeKBytesWrittenRate()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeKBytesWrittenRate = INCLUDE_KBYTES_WRITTEN_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeMaintOpRate() <em>Include Maint Op Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMaintOpRate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_MAINT_OP_RATE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeMaintOpRate() <em>Include Maint Op Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeMaintOpRate()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeMaintOpRate = INCLUDE_MAINT_OP_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeRateIntervalEndTime() <em>Include Rate Interval End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeRateIntervalEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_RATE_INTERVAL_END_TIME_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeRateIntervalEndTime() <em>Include Rate Interval End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeRateIntervalEndTime()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeRateIntervalEndTime = INCLUDE_RATE_INTERVAL_END_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeRateIntervalStartTime() <em>Include Rate Interval Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeRateIntervalStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_RATE_INTERVAL_START_TIME_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeRateIntervalStartTime() <em>Include Rate Interval Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeRateIntervalStartTime()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeRateIntervalStartTime = INCLUDE_RATE_INTERVAL_START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeReadHitIOsRate() <em>Include Read Hit IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadHitIOsRate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_READ_HIT_IOS_RATE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeReadHitIOsRate() <em>Include Read Hit IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadHitIOsRate()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeReadHitIOsRate = INCLUDE_READ_HIT_IOS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeReadIOsRate() <em>Include Read IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadIOsRate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_READ_IOS_RATE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeReadIOsRate() <em>Include Read IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadIOsRate()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeReadIOsRate = INCLUDE_READ_IOS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeReadSequentialHits() <em>Include Read Sequential Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadSequentialHits()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_READ_SEQUENTIAL_HITS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeReadSequentialHits() <em>Include Read Sequential Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadSequentialHits()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeReadSequentialHits = INCLUDE_READ_SEQUENTIAL_HITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeReadSequentialIOs() <em>Include Read Sequential IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadSequentialIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_READ_SEQUENTIAL_IOS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeReadSequentialIOs() <em>Include Read Sequential IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeReadSequentialIOs()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeReadSequentialIOs = INCLUDE_READ_SEQUENTIAL_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalHitIOs() <em>Include Total Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalHitIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_HIT_IOS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalHitIOs() <em>Include Total Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalHitIOs()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalHitIOs = INCLUDE_TOTAL_HIT_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeTotalIOsRate() <em>Include Total IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalIOsRate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_TOTAL_IOS_RATE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeTotalIOsRate() <em>Include Total IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeTotalIOsRate()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeTotalIOsRate = INCLUDE_TOTAL_IOS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeWriteHitIOsRate() <em>Include Write Hit IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteHitIOsRate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_WRITE_HIT_IOS_RATE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeWriteHitIOsRate() <em>Include Write Hit IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteHitIOsRate()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeWriteHitIOsRate = INCLUDE_WRITE_HIT_IOS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeWriteIOsRate() <em>Include Write IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteIOsRate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_WRITE_IOS_RATE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeWriteIOsRate() <em>Include Write IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteIOsRate()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeWriteIOsRate = INCLUDE_WRITE_IOS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeWriteSequentialHits() <em>Include Write Sequential Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteSequentialHits()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_WRITE_SEQUENTIAL_HITS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeWriteSequentialHits() <em>Include Write Sequential Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteSequentialHits()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeWriteSequentialHits = INCLUDE_WRITE_SEQUENTIAL_HITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeWriteSequentialIOs() <em>Include Write Sequential IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteSequentialIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_WRITE_SEQUENTIAL_IOS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIncludeWriteSequentialIOs() <em>Include Write Sequential IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeWriteSequentialIOs()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeWriteSequentialIOs = INCLUDE_WRITE_SEQUENTIAL_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateElementType() <em>Rate Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateElementType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RATE_ELEMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRateElementType() <em>Rate Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateElementType()
	 * @generated
	 * @ordered
	 */
	protected Integer rateElementType = RATE_ELEMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BlockStatisticsManifestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BlockStatisticsManifest();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__ELEMENT_TYPE, oldElementType, elementType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_START_STATISTIC_TIME, oldIncludeStartStatisticTime, includeStartStatisticTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_STATISTIC_TIME, oldIncludeStatisticTime, includeStatisticTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_TOTAL_IOS, oldIncludeTotalIOs, includeTotalIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeKBytesTransferred() {
		return includeKBytesTransferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeKBytesTransferred(Boolean newIncludeKBytesTransferred) {
		Boolean oldIncludeKBytesTransferred = includeKBytesTransferred;
		includeKBytesTransferred = newIncludeKBytesTransferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_TRANSFERRED, oldIncludeKBytesTransferred, includeKBytesTransferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeIOTimeCounter() {
		return includeIOTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeIOTimeCounter(Boolean newIncludeIOTimeCounter) {
		Boolean oldIncludeIOTimeCounter = includeIOTimeCounter;
		includeIOTimeCounter = newIncludeIOTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_IO_TIME_COUNTER, oldIncludeIOTimeCounter, includeIOTimeCounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_IOS, oldIncludeReadIOs, includeReadIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeReadHitIOs() {
		return includeReadHitIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeReadHitIOs(Boolean newIncludeReadHitIOs) {
		Boolean oldIncludeReadHitIOs = includeReadHitIOs;
		includeReadHitIOs = newIncludeReadHitIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_HIT_IOS, oldIncludeReadHitIOs, includeReadHitIOs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_IO_TIME_COUNTER, oldIncludeReadIOTimeCounter, includeReadIOTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeReadHitIOTimeCounter() {
		return includeReadHitIOTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeReadHitIOTimeCounter(Boolean newIncludeReadHitIOTimeCounter) {
		Boolean oldIncludeReadHitIOTimeCounter = includeReadHitIOTimeCounter;
		includeReadHitIOTimeCounter = newIncludeReadHitIOTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_HIT_IO_TIME_COUNTER, oldIncludeReadHitIOTimeCounter, includeReadHitIOTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeKBytesRead() {
		return includeKBytesRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeKBytesRead(Boolean newIncludeKBytesRead) {
		Boolean oldIncludeKBytesRead = includeKBytesRead;
		includeKBytesRead = newIncludeKBytesRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_READ, oldIncludeKBytesRead, includeKBytesRead));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_IOS, oldIncludeWriteIOs, includeWriteIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeWriteHitIOs() {
		return includeWriteHitIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeWriteHitIOs(Boolean newIncludeWriteHitIOs) {
		Boolean oldIncludeWriteHitIOs = includeWriteHitIOs;
		includeWriteHitIOs = newIncludeWriteHitIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_HIT_IOS, oldIncludeWriteHitIOs, includeWriteHitIOs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_IO_TIME_COUNTER, oldIncludeWriteIOTimeCounter, includeWriteIOTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeWriteHitIOTimeCounter() {
		return includeWriteHitIOTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeWriteHitIOTimeCounter(Boolean newIncludeWriteHitIOTimeCounter) {
		Boolean oldIncludeWriteHitIOTimeCounter = includeWriteHitIOTimeCounter;
		includeWriteHitIOTimeCounter = newIncludeWriteHitIOTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_HIT_IO_TIME_COUNTER, oldIncludeWriteHitIOTimeCounter, includeWriteHitIOTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeKBytesWritten() {
		return includeKBytesWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeKBytesWritten(Boolean newIncludeKBytesWritten) {
		Boolean oldIncludeKBytesWritten = includeKBytesWritten;
		includeKBytesWritten = newIncludeKBytesWritten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_WRITTEN, oldIncludeKBytesWritten, includeKBytesWritten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeIdleTimeCounter() {
		return includeIdleTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeIdleTimeCounter(Boolean newIncludeIdleTimeCounter) {
		Boolean oldIncludeIdleTimeCounter = includeIdleTimeCounter;
		includeIdleTimeCounter = newIncludeIdleTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_IDLE_TIME_COUNTER, oldIncludeIdleTimeCounter, includeIdleTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeMaintOp() {
		return includeMaintOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeMaintOp(Boolean newIncludeMaintOp) {
		Boolean oldIncludeMaintOp = includeMaintOp;
		includeMaintOp = newIncludeMaintOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_MAINT_OP, oldIncludeMaintOp, includeMaintOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeMaintTimeCounter() {
		return includeMaintTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeMaintTimeCounter(Boolean newIncludeMaintTimeCounter) {
		Boolean oldIncludeMaintTimeCounter = includeMaintTimeCounter;
		includeMaintTimeCounter = newIncludeMaintTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_MAINT_TIME_COUNTER, oldIncludeMaintTimeCounter, includeMaintTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCSVRateSequence() {
		if (csvRateSequence == null) {
			csvRateSequence = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__CSV_RATE_SEQUENCE);
		}
		return csvRateSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCSVSequence() {
		if (csvSequence == null) {
			csvSequence = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__CSV_SEQUENCE);
		}
		return csvSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeKBytesReadRate() {
		return includeKBytesReadRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeKBytesReadRate(Boolean newIncludeKBytesReadRate) {
		Boolean oldIncludeKBytesReadRate = includeKBytesReadRate;
		includeKBytesReadRate = newIncludeKBytesReadRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_READ_RATE, oldIncludeKBytesReadRate, includeKBytesReadRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeKBytesTransferredRate() {
		return includeKBytesTransferredRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeKBytesTransferredRate(Boolean newIncludeKBytesTransferredRate) {
		Boolean oldIncludeKBytesTransferredRate = includeKBytesTransferredRate;
		includeKBytesTransferredRate = newIncludeKBytesTransferredRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_TRANSFERRED_RATE, oldIncludeKBytesTransferredRate, includeKBytesTransferredRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeKBytesWrittenRate() {
		return includeKBytesWrittenRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeKBytesWrittenRate(Boolean newIncludeKBytesWrittenRate) {
		Boolean oldIncludeKBytesWrittenRate = includeKBytesWrittenRate;
		includeKBytesWrittenRate = newIncludeKBytesWrittenRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_WRITTEN_RATE, oldIncludeKBytesWrittenRate, includeKBytesWrittenRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeMaintOpRate() {
		return includeMaintOpRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeMaintOpRate(Boolean newIncludeMaintOpRate) {
		Boolean oldIncludeMaintOpRate = includeMaintOpRate;
		includeMaintOpRate = newIncludeMaintOpRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_MAINT_OP_RATE, oldIncludeMaintOpRate, includeMaintOpRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeRateIntervalEndTime() {
		return includeRateIntervalEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeRateIntervalEndTime(Boolean newIncludeRateIntervalEndTime) {
		Boolean oldIncludeRateIntervalEndTime = includeRateIntervalEndTime;
		includeRateIntervalEndTime = newIncludeRateIntervalEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_RATE_INTERVAL_END_TIME, oldIncludeRateIntervalEndTime, includeRateIntervalEndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeRateIntervalStartTime() {
		return includeRateIntervalStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeRateIntervalStartTime(Boolean newIncludeRateIntervalStartTime) {
		Boolean oldIncludeRateIntervalStartTime = includeRateIntervalStartTime;
		includeRateIntervalStartTime = newIncludeRateIntervalStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_RATE_INTERVAL_START_TIME, oldIncludeRateIntervalStartTime, includeRateIntervalStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeReadHitIOsRate() {
		return includeReadHitIOsRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeReadHitIOsRate(Boolean newIncludeReadHitIOsRate) {
		Boolean oldIncludeReadHitIOsRate = includeReadHitIOsRate;
		includeReadHitIOsRate = newIncludeReadHitIOsRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_HIT_IOS_RATE, oldIncludeReadHitIOsRate, includeReadHitIOsRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeReadIOsRate() {
		return includeReadIOsRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeReadIOsRate(Boolean newIncludeReadIOsRate) {
		Boolean oldIncludeReadIOsRate = includeReadIOsRate;
		includeReadIOsRate = newIncludeReadIOsRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_IOS_RATE, oldIncludeReadIOsRate, includeReadIOsRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeReadSequentialHits() {
		return includeReadSequentialHits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeReadSequentialHits(Boolean newIncludeReadSequentialHits) {
		Boolean oldIncludeReadSequentialHits = includeReadSequentialHits;
		includeReadSequentialHits = newIncludeReadSequentialHits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_SEQUENTIAL_HITS, oldIncludeReadSequentialHits, includeReadSequentialHits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeReadSequentialIOs() {
		return includeReadSequentialIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeReadSequentialIOs(Boolean newIncludeReadSequentialIOs) {
		Boolean oldIncludeReadSequentialIOs = includeReadSequentialIOs;
		includeReadSequentialIOs = newIncludeReadSequentialIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_SEQUENTIAL_IOS, oldIncludeReadSequentialIOs, includeReadSequentialIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalHitIOs() {
		return includeTotalHitIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalHitIOs(Boolean newIncludeTotalHitIOs) {
		Boolean oldIncludeTotalHitIOs = includeTotalHitIOs;
		includeTotalHitIOs = newIncludeTotalHitIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_TOTAL_HIT_IOS, oldIncludeTotalHitIOs, includeTotalHitIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeTotalIOsRate() {
		return includeTotalIOsRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeTotalIOsRate(Boolean newIncludeTotalIOsRate) {
		Boolean oldIncludeTotalIOsRate = includeTotalIOsRate;
		includeTotalIOsRate = newIncludeTotalIOsRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_TOTAL_IOS_RATE, oldIncludeTotalIOsRate, includeTotalIOsRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeWriteHitIOsRate() {
		return includeWriteHitIOsRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeWriteHitIOsRate(Boolean newIncludeWriteHitIOsRate) {
		Boolean oldIncludeWriteHitIOsRate = includeWriteHitIOsRate;
		includeWriteHitIOsRate = newIncludeWriteHitIOsRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_HIT_IOS_RATE, oldIncludeWriteHitIOsRate, includeWriteHitIOsRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeWriteIOsRate() {
		return includeWriteIOsRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeWriteIOsRate(Boolean newIncludeWriteIOsRate) {
		Boolean oldIncludeWriteIOsRate = includeWriteIOsRate;
		includeWriteIOsRate = newIncludeWriteIOsRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_IOS_RATE, oldIncludeWriteIOsRate, includeWriteIOsRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeWriteSequentialHits() {
		return includeWriteSequentialHits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeWriteSequentialHits(Boolean newIncludeWriteSequentialHits) {
		Boolean oldIncludeWriteSequentialHits = includeWriteSequentialHits;
		includeWriteSequentialHits = newIncludeWriteSequentialHits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_SEQUENTIAL_HITS, oldIncludeWriteSequentialHits, includeWriteSequentialHits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncludeWriteSequentialIOs() {
		return includeWriteSequentialIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeWriteSequentialIOs(Boolean newIncludeWriteSequentialIOs) {
		Boolean oldIncludeWriteSequentialIOs = includeWriteSequentialIOs;
		includeWriteSequentialIOs = newIncludeWriteSequentialIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_SEQUENTIAL_IOS, oldIncludeWriteSequentialIOs, includeWriteSequentialIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRateElementType() {
		return rateElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRateElementType(Integer newRateElementType) {
		Integer oldRateElementType = rateElementType;
		rateElementType = newRateElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__RATE_ELEMENT_TYPE, oldRateElementType, rateElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__ELEMENT_TYPE:
				return getElementType();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_START_STATISTIC_TIME:
				return getIncludeStartStatisticTime();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_STATISTIC_TIME:
				return getIncludeStatisticTime();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_TOTAL_IOS:
				return getIncludeTotalIOs();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_TRANSFERRED:
				return getIncludeKBytesTransferred();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_IO_TIME_COUNTER:
				return getIncludeIOTimeCounter();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_IOS:
				return getIncludeReadIOs();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_HIT_IOS:
				return getIncludeReadHitIOs();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_IO_TIME_COUNTER:
				return getIncludeReadIOTimeCounter();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_HIT_IO_TIME_COUNTER:
				return getIncludeReadHitIOTimeCounter();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_READ:
				return getIncludeKBytesRead();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_IOS:
				return getIncludeWriteIOs();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_HIT_IOS:
				return getIncludeWriteHitIOs();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_IO_TIME_COUNTER:
				return getIncludeWriteIOTimeCounter();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_HIT_IO_TIME_COUNTER:
				return getIncludeWriteHitIOTimeCounter();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_WRITTEN:
				return getIncludeKBytesWritten();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_IDLE_TIME_COUNTER:
				return getIncludeIdleTimeCounter();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_MAINT_OP:
				return getIncludeMaintOp();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_MAINT_TIME_COUNTER:
				return getIncludeMaintTimeCounter();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__CSV_RATE_SEQUENCE:
				return getCSVRateSequence();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__CSV_SEQUENCE:
				return getCSVSequence();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_READ_RATE:
				return getIncludeKBytesReadRate();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_TRANSFERRED_RATE:
				return getIncludeKBytesTransferredRate();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_WRITTEN_RATE:
				return getIncludeKBytesWrittenRate();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_MAINT_OP_RATE:
				return getIncludeMaintOpRate();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_RATE_INTERVAL_END_TIME:
				return getIncludeRateIntervalEndTime();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_RATE_INTERVAL_START_TIME:
				return getIncludeRateIntervalStartTime();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_HIT_IOS_RATE:
				return getIncludeReadHitIOsRate();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_IOS_RATE:
				return getIncludeReadIOsRate();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_SEQUENTIAL_HITS:
				return getIncludeReadSequentialHits();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_SEQUENTIAL_IOS:
				return getIncludeReadSequentialIOs();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_TOTAL_HIT_IOS:
				return getIncludeTotalHitIOs();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_TOTAL_IOS_RATE:
				return getIncludeTotalIOsRate();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_HIT_IOS_RATE:
				return getIncludeWriteHitIOsRate();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_IOS_RATE:
				return getIncludeWriteIOsRate();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_SEQUENTIAL_HITS:
				return getIncludeWriteSequentialHits();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_SEQUENTIAL_IOS:
				return getIncludeWriteSequentialIOs();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__RATE_ELEMENT_TYPE:
				return getRateElementType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__ELEMENT_TYPE:
				setElementType((Integer)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_START_STATISTIC_TIME:
				setIncludeStartStatisticTime((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_STATISTIC_TIME:
				setIncludeStatisticTime((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_TOTAL_IOS:
				setIncludeTotalIOs((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_TRANSFERRED:
				setIncludeKBytesTransferred((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_IO_TIME_COUNTER:
				setIncludeIOTimeCounter((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_IOS:
				setIncludeReadIOs((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_HIT_IOS:
				setIncludeReadHitIOs((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_IO_TIME_COUNTER:
				setIncludeReadIOTimeCounter((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_HIT_IO_TIME_COUNTER:
				setIncludeReadHitIOTimeCounter((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_READ:
				setIncludeKBytesRead((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_IOS:
				setIncludeWriteIOs((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_HIT_IOS:
				setIncludeWriteHitIOs((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_IO_TIME_COUNTER:
				setIncludeWriteIOTimeCounter((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_HIT_IO_TIME_COUNTER:
				setIncludeWriteHitIOTimeCounter((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_WRITTEN:
				setIncludeKBytesWritten((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_IDLE_TIME_COUNTER:
				setIncludeIdleTimeCounter((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_MAINT_OP:
				setIncludeMaintOp((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_MAINT_TIME_COUNTER:
				setIncludeMaintTimeCounter((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__CSV_RATE_SEQUENCE:
				getCSVRateSequence().clear();
				getCSVRateSequence().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__CSV_SEQUENCE:
				getCSVSequence().clear();
				getCSVSequence().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_READ_RATE:
				setIncludeKBytesReadRate((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_TRANSFERRED_RATE:
				setIncludeKBytesTransferredRate((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_WRITTEN_RATE:
				setIncludeKBytesWrittenRate((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_MAINT_OP_RATE:
				setIncludeMaintOpRate((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_RATE_INTERVAL_END_TIME:
				setIncludeRateIntervalEndTime((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_RATE_INTERVAL_START_TIME:
				setIncludeRateIntervalStartTime((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_HIT_IOS_RATE:
				setIncludeReadHitIOsRate((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_IOS_RATE:
				setIncludeReadIOsRate((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_SEQUENTIAL_HITS:
				setIncludeReadSequentialHits((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_SEQUENTIAL_IOS:
				setIncludeReadSequentialIOs((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_TOTAL_HIT_IOS:
				setIncludeTotalHitIOs((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_TOTAL_IOS_RATE:
				setIncludeTotalIOsRate((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_HIT_IOS_RATE:
				setIncludeWriteHitIOsRate((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_IOS_RATE:
				setIncludeWriteIOsRate((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_SEQUENTIAL_HITS:
				setIncludeWriteSequentialHits((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_SEQUENTIAL_IOS:
				setIncludeWriteSequentialIOs((Boolean)newValue);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__RATE_ELEMENT_TYPE:
				setRateElementType((Integer)newValue);
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
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__ELEMENT_TYPE:
				setElementType(ELEMENT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_START_STATISTIC_TIME:
				setIncludeStartStatisticTime(INCLUDE_START_STATISTIC_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_STATISTIC_TIME:
				setIncludeStatisticTime(INCLUDE_STATISTIC_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_TOTAL_IOS:
				setIncludeTotalIOs(INCLUDE_TOTAL_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_TRANSFERRED:
				setIncludeKBytesTransferred(INCLUDE_KBYTES_TRANSFERRED_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_IO_TIME_COUNTER:
				setIncludeIOTimeCounter(INCLUDE_IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_IOS:
				setIncludeReadIOs(INCLUDE_READ_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_HIT_IOS:
				setIncludeReadHitIOs(INCLUDE_READ_HIT_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_IO_TIME_COUNTER:
				setIncludeReadIOTimeCounter(INCLUDE_READ_IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_HIT_IO_TIME_COUNTER:
				setIncludeReadHitIOTimeCounter(INCLUDE_READ_HIT_IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_READ:
				setIncludeKBytesRead(INCLUDE_KBYTES_READ_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_IOS:
				setIncludeWriteIOs(INCLUDE_WRITE_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_HIT_IOS:
				setIncludeWriteHitIOs(INCLUDE_WRITE_HIT_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_IO_TIME_COUNTER:
				setIncludeWriteIOTimeCounter(INCLUDE_WRITE_IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_HIT_IO_TIME_COUNTER:
				setIncludeWriteHitIOTimeCounter(INCLUDE_WRITE_HIT_IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_WRITTEN:
				setIncludeKBytesWritten(INCLUDE_KBYTES_WRITTEN_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_IDLE_TIME_COUNTER:
				setIncludeIdleTimeCounter(INCLUDE_IDLE_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_MAINT_OP:
				setIncludeMaintOp(INCLUDE_MAINT_OP_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_MAINT_TIME_COUNTER:
				setIncludeMaintTimeCounter(INCLUDE_MAINT_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__CSV_RATE_SEQUENCE:
				getCSVRateSequence().clear();
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__CSV_SEQUENCE:
				getCSVSequence().clear();
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_READ_RATE:
				setIncludeKBytesReadRate(INCLUDE_KBYTES_READ_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_TRANSFERRED_RATE:
				setIncludeKBytesTransferredRate(INCLUDE_KBYTES_TRANSFERRED_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_WRITTEN_RATE:
				setIncludeKBytesWrittenRate(INCLUDE_KBYTES_WRITTEN_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_MAINT_OP_RATE:
				setIncludeMaintOpRate(INCLUDE_MAINT_OP_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_RATE_INTERVAL_END_TIME:
				setIncludeRateIntervalEndTime(INCLUDE_RATE_INTERVAL_END_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_RATE_INTERVAL_START_TIME:
				setIncludeRateIntervalStartTime(INCLUDE_RATE_INTERVAL_START_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_HIT_IOS_RATE:
				setIncludeReadHitIOsRate(INCLUDE_READ_HIT_IOS_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_IOS_RATE:
				setIncludeReadIOsRate(INCLUDE_READ_IOS_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_SEQUENTIAL_HITS:
				setIncludeReadSequentialHits(INCLUDE_READ_SEQUENTIAL_HITS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_SEQUENTIAL_IOS:
				setIncludeReadSequentialIOs(INCLUDE_READ_SEQUENTIAL_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_TOTAL_HIT_IOS:
				setIncludeTotalHitIOs(INCLUDE_TOTAL_HIT_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_TOTAL_IOS_RATE:
				setIncludeTotalIOsRate(INCLUDE_TOTAL_IOS_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_HIT_IOS_RATE:
				setIncludeWriteHitIOsRate(INCLUDE_WRITE_HIT_IOS_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_IOS_RATE:
				setIncludeWriteIOsRate(INCLUDE_WRITE_IOS_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_SEQUENTIAL_HITS:
				setIncludeWriteSequentialHits(INCLUDE_WRITE_SEQUENTIAL_HITS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_SEQUENTIAL_IOS:
				setIncludeWriteSequentialIOs(INCLUDE_WRITE_SEQUENTIAL_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__RATE_ELEMENT_TYPE:
				setRateElementType(RATE_ELEMENT_TYPE_EDEFAULT);
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
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__ELEMENT_TYPE:
				return ELEMENT_TYPE_EDEFAULT == null ? elementType != null : !ELEMENT_TYPE_EDEFAULT.equals(elementType);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_START_STATISTIC_TIME:
				return INCLUDE_START_STATISTIC_TIME_EDEFAULT == null ? includeStartStatisticTime != null : !INCLUDE_START_STATISTIC_TIME_EDEFAULT.equals(includeStartStatisticTime);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_STATISTIC_TIME:
				return INCLUDE_STATISTIC_TIME_EDEFAULT == null ? includeStatisticTime != null : !INCLUDE_STATISTIC_TIME_EDEFAULT.equals(includeStatisticTime);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_TOTAL_IOS:
				return INCLUDE_TOTAL_IOS_EDEFAULT == null ? includeTotalIOs != null : !INCLUDE_TOTAL_IOS_EDEFAULT.equals(includeTotalIOs);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_TRANSFERRED:
				return INCLUDE_KBYTES_TRANSFERRED_EDEFAULT == null ? includeKBytesTransferred != null : !INCLUDE_KBYTES_TRANSFERRED_EDEFAULT.equals(includeKBytesTransferred);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_IO_TIME_COUNTER:
				return INCLUDE_IO_TIME_COUNTER_EDEFAULT == null ? includeIOTimeCounter != null : !INCLUDE_IO_TIME_COUNTER_EDEFAULT.equals(includeIOTimeCounter);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_IOS:
				return INCLUDE_READ_IOS_EDEFAULT == null ? includeReadIOs != null : !INCLUDE_READ_IOS_EDEFAULT.equals(includeReadIOs);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_HIT_IOS:
				return INCLUDE_READ_HIT_IOS_EDEFAULT == null ? includeReadHitIOs != null : !INCLUDE_READ_HIT_IOS_EDEFAULT.equals(includeReadHitIOs);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_IO_TIME_COUNTER:
				return INCLUDE_READ_IO_TIME_COUNTER_EDEFAULT == null ? includeReadIOTimeCounter != null : !INCLUDE_READ_IO_TIME_COUNTER_EDEFAULT.equals(includeReadIOTimeCounter);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_HIT_IO_TIME_COUNTER:
				return INCLUDE_READ_HIT_IO_TIME_COUNTER_EDEFAULT == null ? includeReadHitIOTimeCounter != null : !INCLUDE_READ_HIT_IO_TIME_COUNTER_EDEFAULT.equals(includeReadHitIOTimeCounter);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_READ:
				return INCLUDE_KBYTES_READ_EDEFAULT == null ? includeKBytesRead != null : !INCLUDE_KBYTES_READ_EDEFAULT.equals(includeKBytesRead);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_IOS:
				return INCLUDE_WRITE_IOS_EDEFAULT == null ? includeWriteIOs != null : !INCLUDE_WRITE_IOS_EDEFAULT.equals(includeWriteIOs);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_HIT_IOS:
				return INCLUDE_WRITE_HIT_IOS_EDEFAULT == null ? includeWriteHitIOs != null : !INCLUDE_WRITE_HIT_IOS_EDEFAULT.equals(includeWriteHitIOs);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_IO_TIME_COUNTER:
				return INCLUDE_WRITE_IO_TIME_COUNTER_EDEFAULT == null ? includeWriteIOTimeCounter != null : !INCLUDE_WRITE_IO_TIME_COUNTER_EDEFAULT.equals(includeWriteIOTimeCounter);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_HIT_IO_TIME_COUNTER:
				return INCLUDE_WRITE_HIT_IO_TIME_COUNTER_EDEFAULT == null ? includeWriteHitIOTimeCounter != null : !INCLUDE_WRITE_HIT_IO_TIME_COUNTER_EDEFAULT.equals(includeWriteHitIOTimeCounter);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_WRITTEN:
				return INCLUDE_KBYTES_WRITTEN_EDEFAULT == null ? includeKBytesWritten != null : !INCLUDE_KBYTES_WRITTEN_EDEFAULT.equals(includeKBytesWritten);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_IDLE_TIME_COUNTER:
				return INCLUDE_IDLE_TIME_COUNTER_EDEFAULT == null ? includeIdleTimeCounter != null : !INCLUDE_IDLE_TIME_COUNTER_EDEFAULT.equals(includeIdleTimeCounter);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_MAINT_OP:
				return INCLUDE_MAINT_OP_EDEFAULT == null ? includeMaintOp != null : !INCLUDE_MAINT_OP_EDEFAULT.equals(includeMaintOp);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_MAINT_TIME_COUNTER:
				return INCLUDE_MAINT_TIME_COUNTER_EDEFAULT == null ? includeMaintTimeCounter != null : !INCLUDE_MAINT_TIME_COUNTER_EDEFAULT.equals(includeMaintTimeCounter);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__CSV_RATE_SEQUENCE:
				return csvRateSequence != null && !csvRateSequence.isEmpty();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__CSV_SEQUENCE:
				return csvSequence != null && !csvSequence.isEmpty();
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_READ_RATE:
				return INCLUDE_KBYTES_READ_RATE_EDEFAULT == null ? includeKBytesReadRate != null : !INCLUDE_KBYTES_READ_RATE_EDEFAULT.equals(includeKBytesReadRate);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_TRANSFERRED_RATE:
				return INCLUDE_KBYTES_TRANSFERRED_RATE_EDEFAULT == null ? includeKBytesTransferredRate != null : !INCLUDE_KBYTES_TRANSFERRED_RATE_EDEFAULT.equals(includeKBytesTransferredRate);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_KBYTES_WRITTEN_RATE:
				return INCLUDE_KBYTES_WRITTEN_RATE_EDEFAULT == null ? includeKBytesWrittenRate != null : !INCLUDE_KBYTES_WRITTEN_RATE_EDEFAULT.equals(includeKBytesWrittenRate);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_MAINT_OP_RATE:
				return INCLUDE_MAINT_OP_RATE_EDEFAULT == null ? includeMaintOpRate != null : !INCLUDE_MAINT_OP_RATE_EDEFAULT.equals(includeMaintOpRate);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_RATE_INTERVAL_END_TIME:
				return INCLUDE_RATE_INTERVAL_END_TIME_EDEFAULT == null ? includeRateIntervalEndTime != null : !INCLUDE_RATE_INTERVAL_END_TIME_EDEFAULT.equals(includeRateIntervalEndTime);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_RATE_INTERVAL_START_TIME:
				return INCLUDE_RATE_INTERVAL_START_TIME_EDEFAULT == null ? includeRateIntervalStartTime != null : !INCLUDE_RATE_INTERVAL_START_TIME_EDEFAULT.equals(includeRateIntervalStartTime);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_HIT_IOS_RATE:
				return INCLUDE_READ_HIT_IOS_RATE_EDEFAULT == null ? includeReadHitIOsRate != null : !INCLUDE_READ_HIT_IOS_RATE_EDEFAULT.equals(includeReadHitIOsRate);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_IOS_RATE:
				return INCLUDE_READ_IOS_RATE_EDEFAULT == null ? includeReadIOsRate != null : !INCLUDE_READ_IOS_RATE_EDEFAULT.equals(includeReadIOsRate);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_SEQUENTIAL_HITS:
				return INCLUDE_READ_SEQUENTIAL_HITS_EDEFAULT == null ? includeReadSequentialHits != null : !INCLUDE_READ_SEQUENTIAL_HITS_EDEFAULT.equals(includeReadSequentialHits);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_READ_SEQUENTIAL_IOS:
				return INCLUDE_READ_SEQUENTIAL_IOS_EDEFAULT == null ? includeReadSequentialIOs != null : !INCLUDE_READ_SEQUENTIAL_IOS_EDEFAULT.equals(includeReadSequentialIOs);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_TOTAL_HIT_IOS:
				return INCLUDE_TOTAL_HIT_IOS_EDEFAULT == null ? includeTotalHitIOs != null : !INCLUDE_TOTAL_HIT_IOS_EDEFAULT.equals(includeTotalHitIOs);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_TOTAL_IOS_RATE:
				return INCLUDE_TOTAL_IOS_RATE_EDEFAULT == null ? includeTotalIOsRate != null : !INCLUDE_TOTAL_IOS_RATE_EDEFAULT.equals(includeTotalIOsRate);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_HIT_IOS_RATE:
				return INCLUDE_WRITE_HIT_IOS_RATE_EDEFAULT == null ? includeWriteHitIOsRate != null : !INCLUDE_WRITE_HIT_IOS_RATE_EDEFAULT.equals(includeWriteHitIOsRate);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_IOS_RATE:
				return INCLUDE_WRITE_IOS_RATE_EDEFAULT == null ? includeWriteIOsRate != null : !INCLUDE_WRITE_IOS_RATE_EDEFAULT.equals(includeWriteIOsRate);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_SEQUENTIAL_HITS:
				return INCLUDE_WRITE_SEQUENTIAL_HITS_EDEFAULT == null ? includeWriteSequentialHits != null : !INCLUDE_WRITE_SEQUENTIAL_HITS_EDEFAULT.equals(includeWriteSequentialHits);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__INCLUDE_WRITE_SEQUENTIAL_IOS:
				return INCLUDE_WRITE_SEQUENTIAL_IOS_EDEFAULT == null ? includeWriteSequentialIOs != null : !INCLUDE_WRITE_SEQUENTIAL_IOS_EDEFAULT.equals(includeWriteSequentialIOs);
			case CimPackage.CIM_BLOCK_STATISTICS_MANIFEST__RATE_ELEMENT_TYPE:
				return RATE_ELEMENT_TYPE_EDEFAULT == null ? rateElementType != null : !RATE_ELEMENT_TYPE_EDEFAULT.equals(rateElementType);
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
		result.append(", IncludeStartStatisticTime: ");
		result.append(includeStartStatisticTime);
		result.append(", IncludeStatisticTime: ");
		result.append(includeStatisticTime);
		result.append(", IncludeTotalIOs: ");
		result.append(includeTotalIOs);
		result.append(", IncludeKBytesTransferred: ");
		result.append(includeKBytesTransferred);
		result.append(", IncludeIOTimeCounter: ");
		result.append(includeIOTimeCounter);
		result.append(", IncludeReadIOs: ");
		result.append(includeReadIOs);
		result.append(", IncludeReadHitIOs: ");
		result.append(includeReadHitIOs);
		result.append(", IncludeReadIOTimeCounter: ");
		result.append(includeReadIOTimeCounter);
		result.append(", IncludeReadHitIOTimeCounter: ");
		result.append(includeReadHitIOTimeCounter);
		result.append(", IncludeKBytesRead: ");
		result.append(includeKBytesRead);
		result.append(", IncludeWriteIOs: ");
		result.append(includeWriteIOs);
		result.append(", IncludeWriteHitIOs: ");
		result.append(includeWriteHitIOs);
		result.append(", IncludeWriteIOTimeCounter: ");
		result.append(includeWriteIOTimeCounter);
		result.append(", IncludeWriteHitIOTimeCounter: ");
		result.append(includeWriteHitIOTimeCounter);
		result.append(", IncludeKBytesWritten: ");
		result.append(includeKBytesWritten);
		result.append(", IncludeIdleTimeCounter: ");
		result.append(includeIdleTimeCounter);
		result.append(", IncludeMaintOp: ");
		result.append(includeMaintOp);
		result.append(", IncludeMaintTimeCounter: ");
		result.append(includeMaintTimeCounter);
		result.append(", CSVRateSequence: ");
		result.append(csvRateSequence);
		result.append(", CSVSequence: ");
		result.append(csvSequence);
		result.append(", IncludeKBytesReadRate: ");
		result.append(includeKBytesReadRate);
		result.append(", IncludeKBytesTransferredRate: ");
		result.append(includeKBytesTransferredRate);
		result.append(", IncludeKBytesWrittenRate: ");
		result.append(includeKBytesWrittenRate);
		result.append(", IncludeMaintOpRate: ");
		result.append(includeMaintOpRate);
		result.append(", IncludeRateIntervalEndTime: ");
		result.append(includeRateIntervalEndTime);
		result.append(", IncludeRateIntervalStartTime: ");
		result.append(includeRateIntervalStartTime);
		result.append(", IncludeReadHitIOsRate: ");
		result.append(includeReadHitIOsRate);
		result.append(", IncludeReadIOsRate: ");
		result.append(includeReadIOsRate);
		result.append(", IncludeReadSequentialHits: ");
		result.append(includeReadSequentialHits);
		result.append(", IncludeReadSequentialIOs: ");
		result.append(includeReadSequentialIOs);
		result.append(", IncludeTotalHitIOs: ");
		result.append(includeTotalHitIOs);
		result.append(", IncludeTotalIOsRate: ");
		result.append(includeTotalIOsRate);
		result.append(", IncludeWriteHitIOsRate: ");
		result.append(includeWriteHitIOsRate);
		result.append(", IncludeWriteIOsRate: ");
		result.append(includeWriteIOsRate);
		result.append(", IncludeWriteSequentialHits: ");
		result.append(includeWriteSequentialHits);
		result.append(", IncludeWriteSequentialIOs: ");
		result.append(includeWriteSequentialIOs);
		result.append(", RateElementType: ");
		result.append(rateElementType);
		result.append(')');
		return result.toString();
	}

} //CIM_BlockStatisticsManifestImpl

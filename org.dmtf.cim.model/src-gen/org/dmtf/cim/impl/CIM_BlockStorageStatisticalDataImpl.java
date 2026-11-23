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

import org.dmtf.cim.CIM_BlockStorageStatisticalData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Block Storage Statistical Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getTotalIOs <em>Total IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getKBytesTransferred <em>KBytes Transferred</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getKBytesWritten <em>KBytes Written</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getIOTimeCounter <em>IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getReadIOs <em>Read IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getReadHitIOs <em>Read Hit IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getReadIOTimeCounter <em>Read IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getReadHitIOTimeCounter <em>Read Hit IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getKBytesRead <em>KBytes Read</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getWriteIOs <em>Write IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getWriteHitIOs <em>Write Hit IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getWriteIOTimeCounter <em>Write IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getWriteHitIOTimeCounter <em>Write Hit IO Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getIdleTimeCounter <em>Idle Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getMaintOp <em>Maint Op</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getMaintTimeCounter <em>Maint Time Counter</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getKBytesReadRate <em>KBytes Read Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getKBytesTransferredRate <em>KBytes Transferred Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getKBytesWrittenRate <em>KBytes Written Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getMaintOpRate <em>Maint Op Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getRateElementType <em>Rate Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getReadHitIOsRate <em>Read Hit IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getReadIOsRate <em>Read IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getReadSequentialHits <em>Read Sequential Hits</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getReadSequentialIOs <em>Read Sequential IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getTotalHitIOs <em>Total Hit IOs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getTotalIOsRate <em>Total IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getWriteHitIOsRate <em>Write Hit IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getWriteIOsRate <em>Write IOs Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getWriteSequentialHits <em>Write Sequential Hits</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BlockStorageStatisticalDataImpl#getWriteSequentialIOs <em>Write Sequential IOs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BlockStorageStatisticalDataImpl extends CIM_StatisticalDataImpl implements CIM_BlockStorageStatisticalData {
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
	 * The default value of the '{@link #getKBytesTransferred() <em>KBytes Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKBytesTransferred()
	 * @generated
	 * @ordered
	 */
	protected static final Long KBYTES_TRANSFERRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKBytesTransferred() <em>KBytes Transferred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKBytesTransferred()
	 * @generated
	 * @ordered
	 */
	protected Long kBytesTransferred = KBYTES_TRANSFERRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getKBytesWritten() <em>KBytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKBytesWritten()
	 * @generated
	 * @ordered
	 */
	protected static final Long KBYTES_WRITTEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKBytesWritten() <em>KBytes Written</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKBytesWritten()
	 * @generated
	 * @ordered
	 */
	protected Long kBytesWritten = KBYTES_WRITTEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getIOTimeCounter() <em>IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Long IO_TIME_COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIOTimeCounter() <em>IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Long ioTimeCounter = IO_TIME_COUNTER_EDEFAULT;

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
	 * The default value of the '{@link #getReadHitIOs() <em>Read Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadHitIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Long READ_HIT_IOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadHitIOs() <em>Read Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadHitIOs()
	 * @generated
	 * @ordered
	 */
	protected Long readHitIOs = READ_HIT_IOS_EDEFAULT;

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
	 * The default value of the '{@link #getReadHitIOTimeCounter() <em>Read Hit IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadHitIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Long READ_HIT_IO_TIME_COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadHitIOTimeCounter() <em>Read Hit IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadHitIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Long readHitIOTimeCounter = READ_HIT_IO_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKBytesRead() <em>KBytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKBytesRead()
	 * @generated
	 * @ordered
	 */
	protected static final Long KBYTES_READ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKBytesRead() <em>KBytes Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKBytesRead()
	 * @generated
	 * @ordered
	 */
	protected Long kBytesRead = KBYTES_READ_EDEFAULT;

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
	 * The default value of the '{@link #getWriteHitIOs() <em>Write Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteHitIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Long WRITE_HIT_IOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteHitIOs() <em>Write Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteHitIOs()
	 * @generated
	 * @ordered
	 */
	protected Long writeHitIOs = WRITE_HIT_IOS_EDEFAULT;

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
	 * The default value of the '{@link #getWriteHitIOTimeCounter() <em>Write Hit IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteHitIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Long WRITE_HIT_IO_TIME_COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteHitIOTimeCounter() <em>Write Hit IO Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteHitIOTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Long writeHitIOTimeCounter = WRITE_HIT_IO_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdleTimeCounter() <em>Idle Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Long IDLE_TIME_COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdleTimeCounter() <em>Idle Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Long idleTimeCounter = IDLE_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaintOp() <em>Maint Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintOp()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAINT_OP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaintOp() <em>Maint Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintOp()
	 * @generated
	 * @ordered
	 */
	protected Long maintOp = MAINT_OP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaintTimeCounter() <em>Maint Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAINT_TIME_COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaintTimeCounter() <em>Maint Time Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintTimeCounter()
	 * @generated
	 * @ordered
	 */
	protected Long maintTimeCounter = MAINT_TIME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKBytesReadRate() <em>KBytes Read Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKBytesReadRate()
	 * @generated
	 * @ordered
	 */
	protected static final Float KBYTES_READ_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKBytesReadRate() <em>KBytes Read Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKBytesReadRate()
	 * @generated
	 * @ordered
	 */
	protected Float kBytesReadRate = KBYTES_READ_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKBytesTransferredRate() <em>KBytes Transferred Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKBytesTransferredRate()
	 * @generated
	 * @ordered
	 */
	protected static final Float KBYTES_TRANSFERRED_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKBytesTransferredRate() <em>KBytes Transferred Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKBytesTransferredRate()
	 * @generated
	 * @ordered
	 */
	protected Float kBytesTransferredRate = KBYTES_TRANSFERRED_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKBytesWrittenRate() <em>KBytes Written Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKBytesWrittenRate()
	 * @generated
	 * @ordered
	 */
	protected static final Float KBYTES_WRITTEN_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKBytesWrittenRate() <em>KBytes Written Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKBytesWrittenRate()
	 * @generated
	 * @ordered
	 */
	protected Float kBytesWrittenRate = KBYTES_WRITTEN_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaintOpRate() <em>Maint Op Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintOpRate()
	 * @generated
	 * @ordered
	 */
	protected static final Float MAINT_OP_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaintOpRate() <em>Maint Op Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintOpRate()
	 * @generated
	 * @ordered
	 */
	protected Float maintOpRate = MAINT_OP_RATE_EDEFAULT;

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
	 * The default value of the '{@link #getReadHitIOsRate() <em>Read Hit IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadHitIOsRate()
	 * @generated
	 * @ordered
	 */
	protected static final Float READ_HIT_IOS_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadHitIOsRate() <em>Read Hit IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadHitIOsRate()
	 * @generated
	 * @ordered
	 */
	protected Float readHitIOsRate = READ_HIT_IOS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadIOsRate() <em>Read IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadIOsRate()
	 * @generated
	 * @ordered
	 */
	protected static final Float READ_IOS_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadIOsRate() <em>Read IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadIOsRate()
	 * @generated
	 * @ordered
	 */
	protected Float readIOsRate = READ_IOS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadSequentialHits() <em>Read Sequential Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadSequentialHits()
	 * @generated
	 * @ordered
	 */
	protected static final Long READ_SEQUENTIAL_HITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadSequentialHits() <em>Read Sequential Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadSequentialHits()
	 * @generated
	 * @ordered
	 */
	protected Long readSequentialHits = READ_SEQUENTIAL_HITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadSequentialIOs() <em>Read Sequential IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadSequentialIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Long READ_SEQUENTIAL_IOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadSequentialIOs() <em>Read Sequential IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadSequentialIOs()
	 * @generated
	 * @ordered
	 */
	protected Long readSequentialIOs = READ_SEQUENTIAL_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalHitIOs() <em>Total Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalHitIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Long TOTAL_HIT_IOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalHitIOs() <em>Total Hit IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalHitIOs()
	 * @generated
	 * @ordered
	 */
	protected Long totalHitIOs = TOTAL_HIT_IOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalIOsRate() <em>Total IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalIOsRate()
	 * @generated
	 * @ordered
	 */
	protected static final Float TOTAL_IOS_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalIOsRate() <em>Total IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalIOsRate()
	 * @generated
	 * @ordered
	 */
	protected Float totalIOsRate = TOTAL_IOS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteHitIOsRate() <em>Write Hit IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteHitIOsRate()
	 * @generated
	 * @ordered
	 */
	protected static final Float WRITE_HIT_IOS_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteHitIOsRate() <em>Write Hit IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteHitIOsRate()
	 * @generated
	 * @ordered
	 */
	protected Float writeHitIOsRate = WRITE_HIT_IOS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteIOsRate() <em>Write IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteIOsRate()
	 * @generated
	 * @ordered
	 */
	protected static final Float WRITE_IOS_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteIOsRate() <em>Write IOs Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteIOsRate()
	 * @generated
	 * @ordered
	 */
	protected Float writeIOsRate = WRITE_IOS_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteSequentialHits() <em>Write Sequential Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteSequentialHits()
	 * @generated
	 * @ordered
	 */
	protected static final Long WRITE_SEQUENTIAL_HITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteSequentialHits() <em>Write Sequential Hits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteSequentialHits()
	 * @generated
	 * @ordered
	 */
	protected Long writeSequentialHits = WRITE_SEQUENTIAL_HITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteSequentialIOs() <em>Write Sequential IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteSequentialIOs()
	 * @generated
	 * @ordered
	 */
	protected static final Long WRITE_SEQUENTIAL_IOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWriteSequentialIOs() <em>Write Sequential IOs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteSequentialIOs()
	 * @generated
	 * @ordered
	 */
	protected Long writeSequentialIOs = WRITE_SEQUENTIAL_IOS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BlockStorageStatisticalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_BlockStorageStatisticalData();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__ELEMENT_TYPE, oldElementType, elementType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__TOTAL_IOS, oldTotalIOs, totalIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getKBytesTransferred() {
		return kBytesTransferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKBytesTransferred(Long newKBytesTransferred) {
		Long oldKBytesTransferred = kBytesTransferred;
		kBytesTransferred = newKBytesTransferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_TRANSFERRED, oldKBytesTransferred, kBytesTransferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getKBytesWritten() {
		return kBytesWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKBytesWritten(Long newKBytesWritten) {
		Long oldKBytesWritten = kBytesWritten;
		kBytesWritten = newKBytesWritten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_WRITTEN, oldKBytesWritten, kBytesWritten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIOTimeCounter() {
		return ioTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIOTimeCounter(Long newIOTimeCounter) {
		Long oldIOTimeCounter = ioTimeCounter;
		ioTimeCounter = newIOTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__IO_TIME_COUNTER, oldIOTimeCounter, ioTimeCounter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_IOS, oldReadIOs, readIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReadHitIOs() {
		return readHitIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadHitIOs(Long newReadHitIOs) {
		Long oldReadHitIOs = readHitIOs;
		readHitIOs = newReadHitIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_HIT_IOS, oldReadHitIOs, readHitIOs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_IO_TIME_COUNTER, oldReadIOTimeCounter, readIOTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReadHitIOTimeCounter() {
		return readHitIOTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadHitIOTimeCounter(Long newReadHitIOTimeCounter) {
		Long oldReadHitIOTimeCounter = readHitIOTimeCounter;
		readHitIOTimeCounter = newReadHitIOTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_HIT_IO_TIME_COUNTER, oldReadHitIOTimeCounter, readHitIOTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getKBytesRead() {
		return kBytesRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKBytesRead(Long newKBytesRead) {
		Long oldKBytesRead = kBytesRead;
		kBytesRead = newKBytesRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_READ, oldKBytesRead, kBytesRead));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_IOS, oldWriteIOs, writeIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWriteHitIOs() {
		return writeHitIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteHitIOs(Long newWriteHitIOs) {
		Long oldWriteHitIOs = writeHitIOs;
		writeHitIOs = newWriteHitIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_HIT_IOS, oldWriteHitIOs, writeHitIOs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_IO_TIME_COUNTER, oldWriteIOTimeCounter, writeIOTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWriteHitIOTimeCounter() {
		return writeHitIOTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteHitIOTimeCounter(Long newWriteHitIOTimeCounter) {
		Long oldWriteHitIOTimeCounter = writeHitIOTimeCounter;
		writeHitIOTimeCounter = newWriteHitIOTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_HIT_IO_TIME_COUNTER, oldWriteHitIOTimeCounter, writeHitIOTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIdleTimeCounter() {
		return idleTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdleTimeCounter(Long newIdleTimeCounter) {
		Long oldIdleTimeCounter = idleTimeCounter;
		idleTimeCounter = newIdleTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__IDLE_TIME_COUNTER, oldIdleTimeCounter, idleTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaintOp() {
		return maintOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaintOp(Long newMaintOp) {
		Long oldMaintOp = maintOp;
		maintOp = newMaintOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__MAINT_OP, oldMaintOp, maintOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaintTimeCounter() {
		return maintTimeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaintTimeCounter(Long newMaintTimeCounter) {
		Long oldMaintTimeCounter = maintTimeCounter;
		maintTimeCounter = newMaintTimeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__MAINT_TIME_COUNTER, oldMaintTimeCounter, maintTimeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getKBytesReadRate() {
		return kBytesReadRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKBytesReadRate(Float newKBytesReadRate) {
		Float oldKBytesReadRate = kBytesReadRate;
		kBytesReadRate = newKBytesReadRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_READ_RATE, oldKBytesReadRate, kBytesReadRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getKBytesTransferredRate() {
		return kBytesTransferredRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKBytesTransferredRate(Float newKBytesTransferredRate) {
		Float oldKBytesTransferredRate = kBytesTransferredRate;
		kBytesTransferredRate = newKBytesTransferredRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_TRANSFERRED_RATE, oldKBytesTransferredRate, kBytesTransferredRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getKBytesWrittenRate() {
		return kBytesWrittenRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKBytesWrittenRate(Float newKBytesWrittenRate) {
		Float oldKBytesWrittenRate = kBytesWrittenRate;
		kBytesWrittenRate = newKBytesWrittenRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_WRITTEN_RATE, oldKBytesWrittenRate, kBytesWrittenRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getMaintOpRate() {
		return maintOpRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaintOpRate(Float newMaintOpRate) {
		Float oldMaintOpRate = maintOpRate;
		maintOpRate = newMaintOpRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__MAINT_OP_RATE, oldMaintOpRate, maintOpRate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__RATE_ELEMENT_TYPE, oldRateElementType, rateElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getReadHitIOsRate() {
		return readHitIOsRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadHitIOsRate(Float newReadHitIOsRate) {
		Float oldReadHitIOsRate = readHitIOsRate;
		readHitIOsRate = newReadHitIOsRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_HIT_IOS_RATE, oldReadHitIOsRate, readHitIOsRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getReadIOsRate() {
		return readIOsRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadIOsRate(Float newReadIOsRate) {
		Float oldReadIOsRate = readIOsRate;
		readIOsRate = newReadIOsRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_IOS_RATE, oldReadIOsRate, readIOsRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReadSequentialHits() {
		return readSequentialHits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadSequentialHits(Long newReadSequentialHits) {
		Long oldReadSequentialHits = readSequentialHits;
		readSequentialHits = newReadSequentialHits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_SEQUENTIAL_HITS, oldReadSequentialHits, readSequentialHits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReadSequentialIOs() {
		return readSequentialIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadSequentialIOs(Long newReadSequentialIOs) {
		Long oldReadSequentialIOs = readSequentialIOs;
		readSequentialIOs = newReadSequentialIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_SEQUENTIAL_IOS, oldReadSequentialIOs, readSequentialIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTotalHitIOs() {
		return totalHitIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalHitIOs(Long newTotalHitIOs) {
		Long oldTotalHitIOs = totalHitIOs;
		totalHitIOs = newTotalHitIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__TOTAL_HIT_IOS, oldTotalHitIOs, totalHitIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getTotalIOsRate() {
		return totalIOsRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalIOsRate(Float newTotalIOsRate) {
		Float oldTotalIOsRate = totalIOsRate;
		totalIOsRate = newTotalIOsRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__TOTAL_IOS_RATE, oldTotalIOsRate, totalIOsRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getWriteHitIOsRate() {
		return writeHitIOsRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteHitIOsRate(Float newWriteHitIOsRate) {
		Float oldWriteHitIOsRate = writeHitIOsRate;
		writeHitIOsRate = newWriteHitIOsRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_HIT_IOS_RATE, oldWriteHitIOsRate, writeHitIOsRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getWriteIOsRate() {
		return writeIOsRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteIOsRate(Float newWriteIOsRate) {
		Float oldWriteIOsRate = writeIOsRate;
		writeIOsRate = newWriteIOsRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_IOS_RATE, oldWriteIOsRate, writeIOsRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWriteSequentialHits() {
		return writeSequentialHits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteSequentialHits(Long newWriteSequentialHits) {
		Long oldWriteSequentialHits = writeSequentialHits;
		writeSequentialHits = newWriteSequentialHits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_SEQUENTIAL_HITS, oldWriteSequentialHits, writeSequentialHits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWriteSequentialIOs() {
		return writeSequentialIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteSequentialIOs(Long newWriteSequentialIOs) {
		Long oldWriteSequentialIOs = writeSequentialIOs;
		writeSequentialIOs = newWriteSequentialIOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_SEQUENTIAL_IOS, oldWriteSequentialIOs, writeSequentialIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__ELEMENT_TYPE:
				return getElementType();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__TOTAL_IOS:
				return getTotalIOs();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_TRANSFERRED:
				return getKBytesTransferred();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_WRITTEN:
				return getKBytesWritten();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__IO_TIME_COUNTER:
				return getIOTimeCounter();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_IOS:
				return getReadIOs();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_HIT_IOS:
				return getReadHitIOs();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_IO_TIME_COUNTER:
				return getReadIOTimeCounter();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_HIT_IO_TIME_COUNTER:
				return getReadHitIOTimeCounter();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_READ:
				return getKBytesRead();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_IOS:
				return getWriteIOs();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_HIT_IOS:
				return getWriteHitIOs();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_IO_TIME_COUNTER:
				return getWriteIOTimeCounter();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_HIT_IO_TIME_COUNTER:
				return getWriteHitIOTimeCounter();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__IDLE_TIME_COUNTER:
				return getIdleTimeCounter();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__MAINT_OP:
				return getMaintOp();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__MAINT_TIME_COUNTER:
				return getMaintTimeCounter();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_READ_RATE:
				return getKBytesReadRate();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_TRANSFERRED_RATE:
				return getKBytesTransferredRate();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_WRITTEN_RATE:
				return getKBytesWrittenRate();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__MAINT_OP_RATE:
				return getMaintOpRate();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__RATE_ELEMENT_TYPE:
				return getRateElementType();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_HIT_IOS_RATE:
				return getReadHitIOsRate();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_IOS_RATE:
				return getReadIOsRate();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_SEQUENTIAL_HITS:
				return getReadSequentialHits();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_SEQUENTIAL_IOS:
				return getReadSequentialIOs();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__TOTAL_HIT_IOS:
				return getTotalHitIOs();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__TOTAL_IOS_RATE:
				return getTotalIOsRate();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_HIT_IOS_RATE:
				return getWriteHitIOsRate();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_IOS_RATE:
				return getWriteIOsRate();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_SEQUENTIAL_HITS:
				return getWriteSequentialHits();
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_SEQUENTIAL_IOS:
				return getWriteSequentialIOs();
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
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__ELEMENT_TYPE:
				setElementType((Integer)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__TOTAL_IOS:
				setTotalIOs((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_TRANSFERRED:
				setKBytesTransferred((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_WRITTEN:
				setKBytesWritten((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__IO_TIME_COUNTER:
				setIOTimeCounter((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_IOS:
				setReadIOs((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_HIT_IOS:
				setReadHitIOs((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_IO_TIME_COUNTER:
				setReadIOTimeCounter((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_HIT_IO_TIME_COUNTER:
				setReadHitIOTimeCounter((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_READ:
				setKBytesRead((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_IOS:
				setWriteIOs((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_HIT_IOS:
				setWriteHitIOs((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_IO_TIME_COUNTER:
				setWriteIOTimeCounter((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_HIT_IO_TIME_COUNTER:
				setWriteHitIOTimeCounter((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__IDLE_TIME_COUNTER:
				setIdleTimeCounter((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__MAINT_OP:
				setMaintOp((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__MAINT_TIME_COUNTER:
				setMaintTimeCounter((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_READ_RATE:
				setKBytesReadRate((Float)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_TRANSFERRED_RATE:
				setKBytesTransferredRate((Float)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_WRITTEN_RATE:
				setKBytesWrittenRate((Float)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__MAINT_OP_RATE:
				setMaintOpRate((Float)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__RATE_ELEMENT_TYPE:
				setRateElementType((Integer)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_HIT_IOS_RATE:
				setReadHitIOsRate((Float)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_IOS_RATE:
				setReadIOsRate((Float)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_SEQUENTIAL_HITS:
				setReadSequentialHits((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_SEQUENTIAL_IOS:
				setReadSequentialIOs((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__TOTAL_HIT_IOS:
				setTotalHitIOs((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__TOTAL_IOS_RATE:
				setTotalIOsRate((Float)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_HIT_IOS_RATE:
				setWriteHitIOsRate((Float)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_IOS_RATE:
				setWriteIOsRate((Float)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_SEQUENTIAL_HITS:
				setWriteSequentialHits((Long)newValue);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_SEQUENTIAL_IOS:
				setWriteSequentialIOs((Long)newValue);
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
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__ELEMENT_TYPE:
				setElementType(ELEMENT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__TOTAL_IOS:
				setTotalIOs(TOTAL_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_TRANSFERRED:
				setKBytesTransferred(KBYTES_TRANSFERRED_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_WRITTEN:
				setKBytesWritten(KBYTES_WRITTEN_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__IO_TIME_COUNTER:
				setIOTimeCounter(IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_IOS:
				setReadIOs(READ_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_HIT_IOS:
				setReadHitIOs(READ_HIT_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_IO_TIME_COUNTER:
				setReadIOTimeCounter(READ_IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_HIT_IO_TIME_COUNTER:
				setReadHitIOTimeCounter(READ_HIT_IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_READ:
				setKBytesRead(KBYTES_READ_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_IOS:
				setWriteIOs(WRITE_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_HIT_IOS:
				setWriteHitIOs(WRITE_HIT_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_IO_TIME_COUNTER:
				setWriteIOTimeCounter(WRITE_IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_HIT_IO_TIME_COUNTER:
				setWriteHitIOTimeCounter(WRITE_HIT_IO_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__IDLE_TIME_COUNTER:
				setIdleTimeCounter(IDLE_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__MAINT_OP:
				setMaintOp(MAINT_OP_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__MAINT_TIME_COUNTER:
				setMaintTimeCounter(MAINT_TIME_COUNTER_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_READ_RATE:
				setKBytesReadRate(KBYTES_READ_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_TRANSFERRED_RATE:
				setKBytesTransferredRate(KBYTES_TRANSFERRED_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_WRITTEN_RATE:
				setKBytesWrittenRate(KBYTES_WRITTEN_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__MAINT_OP_RATE:
				setMaintOpRate(MAINT_OP_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__RATE_ELEMENT_TYPE:
				setRateElementType(RATE_ELEMENT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_HIT_IOS_RATE:
				setReadHitIOsRate(READ_HIT_IOS_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_IOS_RATE:
				setReadIOsRate(READ_IOS_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_SEQUENTIAL_HITS:
				setReadSequentialHits(READ_SEQUENTIAL_HITS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_SEQUENTIAL_IOS:
				setReadSequentialIOs(READ_SEQUENTIAL_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__TOTAL_HIT_IOS:
				setTotalHitIOs(TOTAL_HIT_IOS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__TOTAL_IOS_RATE:
				setTotalIOsRate(TOTAL_IOS_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_HIT_IOS_RATE:
				setWriteHitIOsRate(WRITE_HIT_IOS_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_IOS_RATE:
				setWriteIOsRate(WRITE_IOS_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_SEQUENTIAL_HITS:
				setWriteSequentialHits(WRITE_SEQUENTIAL_HITS_EDEFAULT);
				return;
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_SEQUENTIAL_IOS:
				setWriteSequentialIOs(WRITE_SEQUENTIAL_IOS_EDEFAULT);
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
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__ELEMENT_TYPE:
				return ELEMENT_TYPE_EDEFAULT == null ? elementType != null : !ELEMENT_TYPE_EDEFAULT.equals(elementType);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__TOTAL_IOS:
				return TOTAL_IOS_EDEFAULT == null ? totalIOs != null : !TOTAL_IOS_EDEFAULT.equals(totalIOs);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_TRANSFERRED:
				return KBYTES_TRANSFERRED_EDEFAULT == null ? kBytesTransferred != null : !KBYTES_TRANSFERRED_EDEFAULT.equals(kBytesTransferred);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_WRITTEN:
				return KBYTES_WRITTEN_EDEFAULT == null ? kBytesWritten != null : !KBYTES_WRITTEN_EDEFAULT.equals(kBytesWritten);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__IO_TIME_COUNTER:
				return IO_TIME_COUNTER_EDEFAULT == null ? ioTimeCounter != null : !IO_TIME_COUNTER_EDEFAULT.equals(ioTimeCounter);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_IOS:
				return READ_IOS_EDEFAULT == null ? readIOs != null : !READ_IOS_EDEFAULT.equals(readIOs);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_HIT_IOS:
				return READ_HIT_IOS_EDEFAULT == null ? readHitIOs != null : !READ_HIT_IOS_EDEFAULT.equals(readHitIOs);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_IO_TIME_COUNTER:
				return READ_IO_TIME_COUNTER_EDEFAULT == null ? readIOTimeCounter != null : !READ_IO_TIME_COUNTER_EDEFAULT.equals(readIOTimeCounter);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_HIT_IO_TIME_COUNTER:
				return READ_HIT_IO_TIME_COUNTER_EDEFAULT == null ? readHitIOTimeCounter != null : !READ_HIT_IO_TIME_COUNTER_EDEFAULT.equals(readHitIOTimeCounter);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_READ:
				return KBYTES_READ_EDEFAULT == null ? kBytesRead != null : !KBYTES_READ_EDEFAULT.equals(kBytesRead);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_IOS:
				return WRITE_IOS_EDEFAULT == null ? writeIOs != null : !WRITE_IOS_EDEFAULT.equals(writeIOs);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_HIT_IOS:
				return WRITE_HIT_IOS_EDEFAULT == null ? writeHitIOs != null : !WRITE_HIT_IOS_EDEFAULT.equals(writeHitIOs);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_IO_TIME_COUNTER:
				return WRITE_IO_TIME_COUNTER_EDEFAULT == null ? writeIOTimeCounter != null : !WRITE_IO_TIME_COUNTER_EDEFAULT.equals(writeIOTimeCounter);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_HIT_IO_TIME_COUNTER:
				return WRITE_HIT_IO_TIME_COUNTER_EDEFAULT == null ? writeHitIOTimeCounter != null : !WRITE_HIT_IO_TIME_COUNTER_EDEFAULT.equals(writeHitIOTimeCounter);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__IDLE_TIME_COUNTER:
				return IDLE_TIME_COUNTER_EDEFAULT == null ? idleTimeCounter != null : !IDLE_TIME_COUNTER_EDEFAULT.equals(idleTimeCounter);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__MAINT_OP:
				return MAINT_OP_EDEFAULT == null ? maintOp != null : !MAINT_OP_EDEFAULT.equals(maintOp);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__MAINT_TIME_COUNTER:
				return MAINT_TIME_COUNTER_EDEFAULT == null ? maintTimeCounter != null : !MAINT_TIME_COUNTER_EDEFAULT.equals(maintTimeCounter);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_READ_RATE:
				return KBYTES_READ_RATE_EDEFAULT == null ? kBytesReadRate != null : !KBYTES_READ_RATE_EDEFAULT.equals(kBytesReadRate);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_TRANSFERRED_RATE:
				return KBYTES_TRANSFERRED_RATE_EDEFAULT == null ? kBytesTransferredRate != null : !KBYTES_TRANSFERRED_RATE_EDEFAULT.equals(kBytesTransferredRate);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__KBYTES_WRITTEN_RATE:
				return KBYTES_WRITTEN_RATE_EDEFAULT == null ? kBytesWrittenRate != null : !KBYTES_WRITTEN_RATE_EDEFAULT.equals(kBytesWrittenRate);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__MAINT_OP_RATE:
				return MAINT_OP_RATE_EDEFAULT == null ? maintOpRate != null : !MAINT_OP_RATE_EDEFAULT.equals(maintOpRate);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__RATE_ELEMENT_TYPE:
				return RATE_ELEMENT_TYPE_EDEFAULT == null ? rateElementType != null : !RATE_ELEMENT_TYPE_EDEFAULT.equals(rateElementType);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_HIT_IOS_RATE:
				return READ_HIT_IOS_RATE_EDEFAULT == null ? readHitIOsRate != null : !READ_HIT_IOS_RATE_EDEFAULT.equals(readHitIOsRate);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_IOS_RATE:
				return READ_IOS_RATE_EDEFAULT == null ? readIOsRate != null : !READ_IOS_RATE_EDEFAULT.equals(readIOsRate);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_SEQUENTIAL_HITS:
				return READ_SEQUENTIAL_HITS_EDEFAULT == null ? readSequentialHits != null : !READ_SEQUENTIAL_HITS_EDEFAULT.equals(readSequentialHits);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__READ_SEQUENTIAL_IOS:
				return READ_SEQUENTIAL_IOS_EDEFAULT == null ? readSequentialIOs != null : !READ_SEQUENTIAL_IOS_EDEFAULT.equals(readSequentialIOs);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__TOTAL_HIT_IOS:
				return TOTAL_HIT_IOS_EDEFAULT == null ? totalHitIOs != null : !TOTAL_HIT_IOS_EDEFAULT.equals(totalHitIOs);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__TOTAL_IOS_RATE:
				return TOTAL_IOS_RATE_EDEFAULT == null ? totalIOsRate != null : !TOTAL_IOS_RATE_EDEFAULT.equals(totalIOsRate);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_HIT_IOS_RATE:
				return WRITE_HIT_IOS_RATE_EDEFAULT == null ? writeHitIOsRate != null : !WRITE_HIT_IOS_RATE_EDEFAULT.equals(writeHitIOsRate);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_IOS_RATE:
				return WRITE_IOS_RATE_EDEFAULT == null ? writeIOsRate != null : !WRITE_IOS_RATE_EDEFAULT.equals(writeIOsRate);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_SEQUENTIAL_HITS:
				return WRITE_SEQUENTIAL_HITS_EDEFAULT == null ? writeSequentialHits != null : !WRITE_SEQUENTIAL_HITS_EDEFAULT.equals(writeSequentialHits);
			case CimPackage.CIM_BLOCK_STORAGE_STATISTICAL_DATA__WRITE_SEQUENTIAL_IOS:
				return WRITE_SEQUENTIAL_IOS_EDEFAULT == null ? writeSequentialIOs != null : !WRITE_SEQUENTIAL_IOS_EDEFAULT.equals(writeSequentialIOs);
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
		result.append(", TotalIOs: ");
		result.append(totalIOs);
		result.append(", KBytesTransferred: ");
		result.append(kBytesTransferred);
		result.append(", KBytesWritten: ");
		result.append(kBytesWritten);
		result.append(", IOTimeCounter: ");
		result.append(ioTimeCounter);
		result.append(", ReadIOs: ");
		result.append(readIOs);
		result.append(", ReadHitIOs: ");
		result.append(readHitIOs);
		result.append(", ReadIOTimeCounter: ");
		result.append(readIOTimeCounter);
		result.append(", ReadHitIOTimeCounter: ");
		result.append(readHitIOTimeCounter);
		result.append(", KBytesRead: ");
		result.append(kBytesRead);
		result.append(", WriteIOs: ");
		result.append(writeIOs);
		result.append(", WriteHitIOs: ");
		result.append(writeHitIOs);
		result.append(", WriteIOTimeCounter: ");
		result.append(writeIOTimeCounter);
		result.append(", WriteHitIOTimeCounter: ");
		result.append(writeHitIOTimeCounter);
		result.append(", IdleTimeCounter: ");
		result.append(idleTimeCounter);
		result.append(", MaintOp: ");
		result.append(maintOp);
		result.append(", MaintTimeCounter: ");
		result.append(maintTimeCounter);
		result.append(", KBytesReadRate: ");
		result.append(kBytesReadRate);
		result.append(", KBytesTransferredRate: ");
		result.append(kBytesTransferredRate);
		result.append(", KBytesWrittenRate: ");
		result.append(kBytesWrittenRate);
		result.append(", MaintOpRate: ");
		result.append(maintOpRate);
		result.append(", RateElementType: ");
		result.append(rateElementType);
		result.append(", ReadHitIOsRate: ");
		result.append(readHitIOsRate);
		result.append(", ReadIOsRate: ");
		result.append(readIOsRate);
		result.append(", ReadSequentialHits: ");
		result.append(readSequentialHits);
		result.append(", ReadSequentialIOs: ");
		result.append(readSequentialIOs);
		result.append(", TotalHitIOs: ");
		result.append(totalHitIOs);
		result.append(", TotalIOsRate: ");
		result.append(totalIOsRate);
		result.append(", WriteHitIOsRate: ");
		result.append(writeHitIOsRate);
		result.append(", WriteIOsRate: ");
		result.append(writeIOsRate);
		result.append(", WriteSequentialHits: ");
		result.append(writeSequentialHits);
		result.append(", WriteSequentialIOs: ");
		result.append(writeSequentialIOs);
		result.append(')');
		return result.toString();
	}

} //CIM_BlockStorageStatisticalDataImpl

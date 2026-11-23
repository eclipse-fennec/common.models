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

import org.dmtf.cim.CIM_PCIBridge;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM PCI Bridge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getBridgeType <em>Bridge Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getSecondaryLatencyTimer <em>Secondary Latency Timer</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getSubordinateBusNumber <em>Subordinate Bus Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getSecondayBusNumber <em>Seconday Bus Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getPrimaryBusNumber <em>Primary Bus Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getSecondaryStatusRegister <em>Secondary Status Register</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getSecondaryBusDeviceSelectTiming <em>Secondary Bus Device Select Timing</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getIOLimit <em>IO Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getIOBase <em>IO Base</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getMemoryLimit <em>Memory Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getMemoryBase <em>Memory Base</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getPrefetchMemoryLimit <em>Prefetch Memory Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getPrefetchMemoryBase <em>Prefetch Memory Base</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getPrefetchLimitUpper32 <em>Prefetch Limit Upper32</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getPrefetchBaseUpper32 <em>Prefetch Base Upper32</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getIOLimitUpper16 <em>IO Limit Upper16</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PCIBridgeImpl#getIOBaseUpper16 <em>IO Base Upper16</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PCIBridgeImpl extends CIM_PCIDeviceImpl implements CIM_PCIBridge {
	/**
	 * The default value of the '{@link #getBridgeType() <em>Bridge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BRIDGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBridgeType() <em>Bridge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeType()
	 * @generated
	 * @ordered
	 */
	protected Integer bridgeType = BRIDGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondaryLatencyTimer() <em>Secondary Latency Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryLatencyTimer()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECONDARY_LATENCY_TIMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondaryLatencyTimer() <em>Secondary Latency Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryLatencyTimer()
	 * @generated
	 * @ordered
	 */
	protected Integer secondaryLatencyTimer = SECONDARY_LATENCY_TIMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubordinateBusNumber() <em>Subordinate Bus Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubordinateBusNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SUBORDINATE_BUS_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubordinateBusNumber() <em>Subordinate Bus Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubordinateBusNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer subordinateBusNumber = SUBORDINATE_BUS_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondayBusNumber() <em>Seconday Bus Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondayBusNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECONDAY_BUS_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondayBusNumber() <em>Seconday Bus Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondayBusNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer secondayBusNumber = SECONDAY_BUS_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryBusNumber() <em>Primary Bus Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryBusNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIMARY_BUS_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryBusNumber() <em>Primary Bus Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryBusNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer primaryBusNumber = PRIMARY_BUS_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondaryStatusRegister() <em>Secondary Status Register</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryStatusRegister()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECONDARY_STATUS_REGISTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondaryStatusRegister() <em>Secondary Status Register</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryStatusRegister()
	 * @generated
	 * @ordered
	 */
	protected Integer secondaryStatusRegister = SECONDARY_STATUS_REGISTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondaryBusDeviceSelectTiming() <em>Secondary Bus Device Select Timing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryBusDeviceSelectTiming()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECONDARY_BUS_DEVICE_SELECT_TIMING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondaryBusDeviceSelectTiming() <em>Secondary Bus Device Select Timing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryBusDeviceSelectTiming()
	 * @generated
	 * @ordered
	 */
	protected Integer secondaryBusDeviceSelectTiming = SECONDARY_BUS_DEVICE_SELECT_TIMING_EDEFAULT;

	/**
	 * The default value of the '{@link #getIOLimit() <em>IO Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IO_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIOLimit() <em>IO Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOLimit()
	 * @generated
	 * @ordered
	 */
	protected Integer ioLimit = IO_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIOBase() <em>IO Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IO_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIOBase() <em>IO Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOBase()
	 * @generated
	 * @ordered
	 */
	protected Integer ioBase = IO_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryLimit() <em>Memory Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MEMORY_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryLimit() <em>Memory Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryLimit()
	 * @generated
	 * @ordered
	 */
	protected Integer memoryLimit = MEMORY_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryBase() <em>Memory Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MEMORY_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryBase() <em>Memory Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryBase()
	 * @generated
	 * @ordered
	 */
	protected Integer memoryBase = MEMORY_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefetchMemoryLimit() <em>Prefetch Memory Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetchMemoryLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PREFETCH_MEMORY_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefetchMemoryLimit() <em>Prefetch Memory Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetchMemoryLimit()
	 * @generated
	 * @ordered
	 */
	protected Integer prefetchMemoryLimit = PREFETCH_MEMORY_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefetchMemoryBase() <em>Prefetch Memory Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetchMemoryBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PREFETCH_MEMORY_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefetchMemoryBase() <em>Prefetch Memory Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetchMemoryBase()
	 * @generated
	 * @ordered
	 */
	protected Integer prefetchMemoryBase = PREFETCH_MEMORY_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefetchLimitUpper32() <em>Prefetch Limit Upper32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetchLimitUpper32()
	 * @generated
	 * @ordered
	 */
	protected static final Long PREFETCH_LIMIT_UPPER32_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefetchLimitUpper32() <em>Prefetch Limit Upper32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetchLimitUpper32()
	 * @generated
	 * @ordered
	 */
	protected Long prefetchLimitUpper32 = PREFETCH_LIMIT_UPPER32_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefetchBaseUpper32() <em>Prefetch Base Upper32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetchBaseUpper32()
	 * @generated
	 * @ordered
	 */
	protected static final Long PREFETCH_BASE_UPPER32_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefetchBaseUpper32() <em>Prefetch Base Upper32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetchBaseUpper32()
	 * @generated
	 * @ordered
	 */
	protected Long prefetchBaseUpper32 = PREFETCH_BASE_UPPER32_EDEFAULT;

	/**
	 * The default value of the '{@link #getIOLimitUpper16() <em>IO Limit Upper16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOLimitUpper16()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IO_LIMIT_UPPER16_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIOLimitUpper16() <em>IO Limit Upper16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOLimitUpper16()
	 * @generated
	 * @ordered
	 */
	protected Integer ioLimitUpper16 = IO_LIMIT_UPPER16_EDEFAULT;

	/**
	 * The default value of the '{@link #getIOBaseUpper16() <em>IO Base Upper16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOBaseUpper16()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IO_BASE_UPPER16_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIOBaseUpper16() <em>IO Base Upper16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOBaseUpper16()
	 * @generated
	 * @ordered
	 */
	protected Integer ioBaseUpper16 = IO_BASE_UPPER16_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PCIBridgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PCIBridge();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBridgeType() {
		return bridgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBridgeType(Integer newBridgeType) {
		Integer oldBridgeType = bridgeType;
		bridgeType = newBridgeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__BRIDGE_TYPE, oldBridgeType, bridgeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSecondaryLatencyTimer() {
		return secondaryLatencyTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondaryLatencyTimer(Integer newSecondaryLatencyTimer) {
		Integer oldSecondaryLatencyTimer = secondaryLatencyTimer;
		secondaryLatencyTimer = newSecondaryLatencyTimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__SECONDARY_LATENCY_TIMER, oldSecondaryLatencyTimer, secondaryLatencyTimer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSubordinateBusNumber() {
		return subordinateBusNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubordinateBusNumber(Integer newSubordinateBusNumber) {
		Integer oldSubordinateBusNumber = subordinateBusNumber;
		subordinateBusNumber = newSubordinateBusNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__SUBORDINATE_BUS_NUMBER, oldSubordinateBusNumber, subordinateBusNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSecondayBusNumber() {
		return secondayBusNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondayBusNumber(Integer newSecondayBusNumber) {
		Integer oldSecondayBusNumber = secondayBusNumber;
		secondayBusNumber = newSecondayBusNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__SECONDAY_BUS_NUMBER, oldSecondayBusNumber, secondayBusNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrimaryBusNumber() {
		return primaryBusNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryBusNumber(Integer newPrimaryBusNumber) {
		Integer oldPrimaryBusNumber = primaryBusNumber;
		primaryBusNumber = newPrimaryBusNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__PRIMARY_BUS_NUMBER, oldPrimaryBusNumber, primaryBusNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSecondaryStatusRegister() {
		return secondaryStatusRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondaryStatusRegister(Integer newSecondaryStatusRegister) {
		Integer oldSecondaryStatusRegister = secondaryStatusRegister;
		secondaryStatusRegister = newSecondaryStatusRegister;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__SECONDARY_STATUS_REGISTER, oldSecondaryStatusRegister, secondaryStatusRegister));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSecondaryBusDeviceSelectTiming() {
		return secondaryBusDeviceSelectTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondaryBusDeviceSelectTiming(Integer newSecondaryBusDeviceSelectTiming) {
		Integer oldSecondaryBusDeviceSelectTiming = secondaryBusDeviceSelectTiming;
		secondaryBusDeviceSelectTiming = newSecondaryBusDeviceSelectTiming;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__SECONDARY_BUS_DEVICE_SELECT_TIMING, oldSecondaryBusDeviceSelectTiming, secondaryBusDeviceSelectTiming));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIOLimit() {
		return ioLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIOLimit(Integer newIOLimit) {
		Integer oldIOLimit = ioLimit;
		ioLimit = newIOLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__IO_LIMIT, oldIOLimit, ioLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIOBase() {
		return ioBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIOBase(Integer newIOBase) {
		Integer oldIOBase = ioBase;
		ioBase = newIOBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__IO_BASE, oldIOBase, ioBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMemoryLimit() {
		return memoryLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemoryLimit(Integer newMemoryLimit) {
		Integer oldMemoryLimit = memoryLimit;
		memoryLimit = newMemoryLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__MEMORY_LIMIT, oldMemoryLimit, memoryLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMemoryBase() {
		return memoryBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemoryBase(Integer newMemoryBase) {
		Integer oldMemoryBase = memoryBase;
		memoryBase = newMemoryBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__MEMORY_BASE, oldMemoryBase, memoryBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrefetchMemoryLimit() {
		return prefetchMemoryLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefetchMemoryLimit(Integer newPrefetchMemoryLimit) {
		Integer oldPrefetchMemoryLimit = prefetchMemoryLimit;
		prefetchMemoryLimit = newPrefetchMemoryLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__PREFETCH_MEMORY_LIMIT, oldPrefetchMemoryLimit, prefetchMemoryLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrefetchMemoryBase() {
		return prefetchMemoryBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefetchMemoryBase(Integer newPrefetchMemoryBase) {
		Integer oldPrefetchMemoryBase = prefetchMemoryBase;
		prefetchMemoryBase = newPrefetchMemoryBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__PREFETCH_MEMORY_BASE, oldPrefetchMemoryBase, prefetchMemoryBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPrefetchLimitUpper32() {
		return prefetchLimitUpper32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefetchLimitUpper32(Long newPrefetchLimitUpper32) {
		Long oldPrefetchLimitUpper32 = prefetchLimitUpper32;
		prefetchLimitUpper32 = newPrefetchLimitUpper32;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__PREFETCH_LIMIT_UPPER32, oldPrefetchLimitUpper32, prefetchLimitUpper32));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPrefetchBaseUpper32() {
		return prefetchBaseUpper32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefetchBaseUpper32(Long newPrefetchBaseUpper32) {
		Long oldPrefetchBaseUpper32 = prefetchBaseUpper32;
		prefetchBaseUpper32 = newPrefetchBaseUpper32;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__PREFETCH_BASE_UPPER32, oldPrefetchBaseUpper32, prefetchBaseUpper32));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIOLimitUpper16() {
		return ioLimitUpper16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIOLimitUpper16(Integer newIOLimitUpper16) {
		Integer oldIOLimitUpper16 = ioLimitUpper16;
		ioLimitUpper16 = newIOLimitUpper16;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__IO_LIMIT_UPPER16, oldIOLimitUpper16, ioLimitUpper16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIOBaseUpper16() {
		return ioBaseUpper16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIOBaseUpper16(Integer newIOBaseUpper16) {
		Integer oldIOBaseUpper16 = ioBaseUpper16;
		ioBaseUpper16 = newIOBaseUpper16;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PCI_BRIDGE__IO_BASE_UPPER16, oldIOBaseUpper16, ioBaseUpper16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PCI_BRIDGE__BRIDGE_TYPE:
				return getBridgeType();
			case CimPackage.CIM_PCI_BRIDGE__SECONDARY_LATENCY_TIMER:
				return getSecondaryLatencyTimer();
			case CimPackage.CIM_PCI_BRIDGE__SUBORDINATE_BUS_NUMBER:
				return getSubordinateBusNumber();
			case CimPackage.CIM_PCI_BRIDGE__SECONDAY_BUS_NUMBER:
				return getSecondayBusNumber();
			case CimPackage.CIM_PCI_BRIDGE__PRIMARY_BUS_NUMBER:
				return getPrimaryBusNumber();
			case CimPackage.CIM_PCI_BRIDGE__SECONDARY_STATUS_REGISTER:
				return getSecondaryStatusRegister();
			case CimPackage.CIM_PCI_BRIDGE__SECONDARY_BUS_DEVICE_SELECT_TIMING:
				return getSecondaryBusDeviceSelectTiming();
			case CimPackage.CIM_PCI_BRIDGE__IO_LIMIT:
				return getIOLimit();
			case CimPackage.CIM_PCI_BRIDGE__IO_BASE:
				return getIOBase();
			case CimPackage.CIM_PCI_BRIDGE__MEMORY_LIMIT:
				return getMemoryLimit();
			case CimPackage.CIM_PCI_BRIDGE__MEMORY_BASE:
				return getMemoryBase();
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_MEMORY_LIMIT:
				return getPrefetchMemoryLimit();
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_MEMORY_BASE:
				return getPrefetchMemoryBase();
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_LIMIT_UPPER32:
				return getPrefetchLimitUpper32();
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_BASE_UPPER32:
				return getPrefetchBaseUpper32();
			case CimPackage.CIM_PCI_BRIDGE__IO_LIMIT_UPPER16:
				return getIOLimitUpper16();
			case CimPackage.CIM_PCI_BRIDGE__IO_BASE_UPPER16:
				return getIOBaseUpper16();
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
			case CimPackage.CIM_PCI_BRIDGE__BRIDGE_TYPE:
				setBridgeType((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__SECONDARY_LATENCY_TIMER:
				setSecondaryLatencyTimer((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__SUBORDINATE_BUS_NUMBER:
				setSubordinateBusNumber((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__SECONDAY_BUS_NUMBER:
				setSecondayBusNumber((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__PRIMARY_BUS_NUMBER:
				setPrimaryBusNumber((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__SECONDARY_STATUS_REGISTER:
				setSecondaryStatusRegister((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__SECONDARY_BUS_DEVICE_SELECT_TIMING:
				setSecondaryBusDeviceSelectTiming((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__IO_LIMIT:
				setIOLimit((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__IO_BASE:
				setIOBase((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__MEMORY_LIMIT:
				setMemoryLimit((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__MEMORY_BASE:
				setMemoryBase((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_MEMORY_LIMIT:
				setPrefetchMemoryLimit((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_MEMORY_BASE:
				setPrefetchMemoryBase((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_LIMIT_UPPER32:
				setPrefetchLimitUpper32((Long)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_BASE_UPPER32:
				setPrefetchBaseUpper32((Long)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__IO_LIMIT_UPPER16:
				setIOLimitUpper16((Integer)newValue);
				return;
			case CimPackage.CIM_PCI_BRIDGE__IO_BASE_UPPER16:
				setIOBaseUpper16((Integer)newValue);
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
			case CimPackage.CIM_PCI_BRIDGE__BRIDGE_TYPE:
				setBridgeType(BRIDGE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__SECONDARY_LATENCY_TIMER:
				setSecondaryLatencyTimer(SECONDARY_LATENCY_TIMER_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__SUBORDINATE_BUS_NUMBER:
				setSubordinateBusNumber(SUBORDINATE_BUS_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__SECONDAY_BUS_NUMBER:
				setSecondayBusNumber(SECONDAY_BUS_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__PRIMARY_BUS_NUMBER:
				setPrimaryBusNumber(PRIMARY_BUS_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__SECONDARY_STATUS_REGISTER:
				setSecondaryStatusRegister(SECONDARY_STATUS_REGISTER_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__SECONDARY_BUS_DEVICE_SELECT_TIMING:
				setSecondaryBusDeviceSelectTiming(SECONDARY_BUS_DEVICE_SELECT_TIMING_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__IO_LIMIT:
				setIOLimit(IO_LIMIT_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__IO_BASE:
				setIOBase(IO_BASE_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__MEMORY_LIMIT:
				setMemoryLimit(MEMORY_LIMIT_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__MEMORY_BASE:
				setMemoryBase(MEMORY_BASE_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_MEMORY_LIMIT:
				setPrefetchMemoryLimit(PREFETCH_MEMORY_LIMIT_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_MEMORY_BASE:
				setPrefetchMemoryBase(PREFETCH_MEMORY_BASE_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_LIMIT_UPPER32:
				setPrefetchLimitUpper32(PREFETCH_LIMIT_UPPER32_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_BASE_UPPER32:
				setPrefetchBaseUpper32(PREFETCH_BASE_UPPER32_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__IO_LIMIT_UPPER16:
				setIOLimitUpper16(IO_LIMIT_UPPER16_EDEFAULT);
				return;
			case CimPackage.CIM_PCI_BRIDGE__IO_BASE_UPPER16:
				setIOBaseUpper16(IO_BASE_UPPER16_EDEFAULT);
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
			case CimPackage.CIM_PCI_BRIDGE__BRIDGE_TYPE:
				return BRIDGE_TYPE_EDEFAULT == null ? bridgeType != null : !BRIDGE_TYPE_EDEFAULT.equals(bridgeType);
			case CimPackage.CIM_PCI_BRIDGE__SECONDARY_LATENCY_TIMER:
				return SECONDARY_LATENCY_TIMER_EDEFAULT == null ? secondaryLatencyTimer != null : !SECONDARY_LATENCY_TIMER_EDEFAULT.equals(secondaryLatencyTimer);
			case CimPackage.CIM_PCI_BRIDGE__SUBORDINATE_BUS_NUMBER:
				return SUBORDINATE_BUS_NUMBER_EDEFAULT == null ? subordinateBusNumber != null : !SUBORDINATE_BUS_NUMBER_EDEFAULT.equals(subordinateBusNumber);
			case CimPackage.CIM_PCI_BRIDGE__SECONDAY_BUS_NUMBER:
				return SECONDAY_BUS_NUMBER_EDEFAULT == null ? secondayBusNumber != null : !SECONDAY_BUS_NUMBER_EDEFAULT.equals(secondayBusNumber);
			case CimPackage.CIM_PCI_BRIDGE__PRIMARY_BUS_NUMBER:
				return PRIMARY_BUS_NUMBER_EDEFAULT == null ? primaryBusNumber != null : !PRIMARY_BUS_NUMBER_EDEFAULT.equals(primaryBusNumber);
			case CimPackage.CIM_PCI_BRIDGE__SECONDARY_STATUS_REGISTER:
				return SECONDARY_STATUS_REGISTER_EDEFAULT == null ? secondaryStatusRegister != null : !SECONDARY_STATUS_REGISTER_EDEFAULT.equals(secondaryStatusRegister);
			case CimPackage.CIM_PCI_BRIDGE__SECONDARY_BUS_DEVICE_SELECT_TIMING:
				return SECONDARY_BUS_DEVICE_SELECT_TIMING_EDEFAULT == null ? secondaryBusDeviceSelectTiming != null : !SECONDARY_BUS_DEVICE_SELECT_TIMING_EDEFAULT.equals(secondaryBusDeviceSelectTiming);
			case CimPackage.CIM_PCI_BRIDGE__IO_LIMIT:
				return IO_LIMIT_EDEFAULT == null ? ioLimit != null : !IO_LIMIT_EDEFAULT.equals(ioLimit);
			case CimPackage.CIM_PCI_BRIDGE__IO_BASE:
				return IO_BASE_EDEFAULT == null ? ioBase != null : !IO_BASE_EDEFAULT.equals(ioBase);
			case CimPackage.CIM_PCI_BRIDGE__MEMORY_LIMIT:
				return MEMORY_LIMIT_EDEFAULT == null ? memoryLimit != null : !MEMORY_LIMIT_EDEFAULT.equals(memoryLimit);
			case CimPackage.CIM_PCI_BRIDGE__MEMORY_BASE:
				return MEMORY_BASE_EDEFAULT == null ? memoryBase != null : !MEMORY_BASE_EDEFAULT.equals(memoryBase);
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_MEMORY_LIMIT:
				return PREFETCH_MEMORY_LIMIT_EDEFAULT == null ? prefetchMemoryLimit != null : !PREFETCH_MEMORY_LIMIT_EDEFAULT.equals(prefetchMemoryLimit);
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_MEMORY_BASE:
				return PREFETCH_MEMORY_BASE_EDEFAULT == null ? prefetchMemoryBase != null : !PREFETCH_MEMORY_BASE_EDEFAULT.equals(prefetchMemoryBase);
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_LIMIT_UPPER32:
				return PREFETCH_LIMIT_UPPER32_EDEFAULT == null ? prefetchLimitUpper32 != null : !PREFETCH_LIMIT_UPPER32_EDEFAULT.equals(prefetchLimitUpper32);
			case CimPackage.CIM_PCI_BRIDGE__PREFETCH_BASE_UPPER32:
				return PREFETCH_BASE_UPPER32_EDEFAULT == null ? prefetchBaseUpper32 != null : !PREFETCH_BASE_UPPER32_EDEFAULT.equals(prefetchBaseUpper32);
			case CimPackage.CIM_PCI_BRIDGE__IO_LIMIT_UPPER16:
				return IO_LIMIT_UPPER16_EDEFAULT == null ? ioLimitUpper16 != null : !IO_LIMIT_UPPER16_EDEFAULT.equals(ioLimitUpper16);
			case CimPackage.CIM_PCI_BRIDGE__IO_BASE_UPPER16:
				return IO_BASE_UPPER16_EDEFAULT == null ? ioBaseUpper16 != null : !IO_BASE_UPPER16_EDEFAULT.equals(ioBaseUpper16);
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
		result.append(" (BridgeType: ");
		result.append(bridgeType);
		result.append(", SecondaryLatencyTimer: ");
		result.append(secondaryLatencyTimer);
		result.append(", SubordinateBusNumber: ");
		result.append(subordinateBusNumber);
		result.append(", SecondayBusNumber: ");
		result.append(secondayBusNumber);
		result.append(", PrimaryBusNumber: ");
		result.append(primaryBusNumber);
		result.append(", SecondaryStatusRegister: ");
		result.append(secondaryStatusRegister);
		result.append(", SecondaryBusDeviceSelectTiming: ");
		result.append(secondaryBusDeviceSelectTiming);
		result.append(", IOLimit: ");
		result.append(ioLimit);
		result.append(", IOBase: ");
		result.append(ioBase);
		result.append(", MemoryLimit: ");
		result.append(memoryLimit);
		result.append(", MemoryBase: ");
		result.append(memoryBase);
		result.append(", PrefetchMemoryLimit: ");
		result.append(prefetchMemoryLimit);
		result.append(", PrefetchMemoryBase: ");
		result.append(prefetchMemoryBase);
		result.append(", PrefetchLimitUpper32: ");
		result.append(prefetchLimitUpper32);
		result.append(", PrefetchBaseUpper32: ");
		result.append(prefetchBaseUpper32);
		result.append(", IOLimitUpper16: ");
		result.append(ioLimitUpper16);
		result.append(", IOBaseUpper16: ");
		result.append(ioBaseUpper16);
		result.append(')');
		return result.toString();
	}

} //CIM_PCIBridgeImpl

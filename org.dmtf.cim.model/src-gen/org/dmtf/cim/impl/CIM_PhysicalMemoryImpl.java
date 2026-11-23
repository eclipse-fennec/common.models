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

import org.dmtf.cim.CIM_PhysicalMemory;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Physical Memory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getMemoryFormFactor <em>Memory Form Factor</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getMemoryType <em>Memory Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getTotalWidth <em>Total Width</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getDataWidth <em>Data Width</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getBankLabel <em>Bank Label</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getPositionInRow <em>Position In Row</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getInterleavePosition <em>Interleave Position</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getConfiguredMemoryClockSpeed <em>Configured Memory Clock Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getIsSpeedInMhz <em>Is Speed In Mhz</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getMaxMemorySpeed <em>Max Memory Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getCapability_BlockAccessiblePersistentMemory <em>Capability Block Accessible Persistent Memory</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getCapability_ByteAccessiblePersistentMemory <em>Capability Byte Accessible Persistent Memory</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getCapability_VolatileMemory <em>Capability Volatile Memory</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getFirmwareVersion <em>Firmware Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getMemorySubsystemControllerManufacturerID <em>Memory Subsystem Controller Manufacturer ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getMemorySubsystemControllerProductID <em>Memory Subsystem Controller Product ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getMemoryTechnology <em>Memory Technology</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getModuleManufacturerID <em>Module Manufacturer ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMemoryImpl#getModuleProductID <em>Module Product ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PhysicalMemoryImpl extends CIM_ChipImpl implements CIM_PhysicalMemory {
	/**
	 * The default value of the '{@link #getMemoryFormFactor() <em>Memory Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryFormFactor()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MEMORY_FORM_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryFormFactor() <em>Memory Form Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryFormFactor()
	 * @generated
	 * @ordered
	 */
	protected Integer memoryFormFactor = MEMORY_FORM_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryType() <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MEMORY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryType() <em>Memory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryType()
	 * @generated
	 * @ordered
	 */
	protected Integer memoryType = MEMORY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalWidth() <em>Total Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOTAL_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalWidth() <em>Total Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer totalWidth = TOTAL_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataWidth() <em>Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataWidth() <em>Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer dataWidth = DATA_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBankLabel() <em>Bank Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String BANK_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBankLabel() <em>Bank Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankLabel()
	 * @generated
	 * @ordered
	 */
	protected String bankLabel = BANK_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositionInRow() <em>Position In Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionInRow()
	 * @generated
	 * @ordered
	 */
	protected static final Long POSITION_IN_ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositionInRow() <em>Position In Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionInRow()
	 * @generated
	 * @ordered
	 */
	protected Long positionInRow = POSITION_IN_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterleavePosition() <em>Interleave Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterleavePosition()
	 * @generated
	 * @ordered
	 */
	protected static final Long INTERLEAVE_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterleavePosition() <em>Interleave Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterleavePosition()
	 * @generated
	 * @ordered
	 */
	protected Long interleavePosition = INTERLEAVE_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfiguredMemoryClockSpeed() <em>Configured Memory Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguredMemoryClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long CONFIGURED_MEMORY_CLOCK_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfiguredMemoryClockSpeed() <em>Configured Memory Clock Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguredMemoryClockSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long configuredMemoryClockSpeed = CONFIGURED_MEMORY_CLOCK_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSpeedInMhz() <em>Is Speed In Mhz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSpeedInMhz()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SPEED_IN_MHZ_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsSpeedInMhz() <em>Is Speed In Mhz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSpeedInMhz()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSpeedInMhz = IS_SPEED_IN_MHZ_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxMemorySpeed() <em>Max Memory Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMemorySpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_MEMORY_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxMemorySpeed() <em>Max Memory Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMemorySpeed()
	 * @generated
	 * @ordered
	 */
	protected Long maxMemorySpeed = MAX_MEMORY_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapability_BlockAccessiblePersistentMemory() <em>Capability Block Accessible Persistent Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability_BlockAccessiblePersistentMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAPABILITY_BLOCK_ACCESSIBLE_PERSISTENT_MEMORY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getCapability_BlockAccessiblePersistentMemory() <em>Capability Block Accessible Persistent Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability_BlockAccessiblePersistentMemory()
	 * @generated
	 * @ordered
	 */
	protected Boolean capability_BlockAccessiblePersistentMemory = CAPABILITY_BLOCK_ACCESSIBLE_PERSISTENT_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapability_ByteAccessiblePersistentMemory() <em>Capability Byte Accessible Persistent Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability_ByteAccessiblePersistentMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAPABILITY_BYTE_ACCESSIBLE_PERSISTENT_MEMORY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getCapability_ByteAccessiblePersistentMemory() <em>Capability Byte Accessible Persistent Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability_ByteAccessiblePersistentMemory()
	 * @generated
	 * @ordered
	 */
	protected Boolean capability_ByteAccessiblePersistentMemory = CAPABILITY_BYTE_ACCESSIBLE_PERSISTENT_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapability_VolatileMemory() <em>Capability Volatile Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability_VolatileMemory()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAPABILITY_VOLATILE_MEMORY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getCapability_VolatileMemory() <em>Capability Volatile Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability_VolatileMemory()
	 * @generated
	 * @ordered
	 */
	protected Boolean capability_VolatileMemory = CAPABILITY_VOLATILE_MEMORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirmwareVersion() <em>Firmware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmwareVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRMWARE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirmwareVersion() <em>Firmware Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmwareVersion()
	 * @generated
	 * @ordered
	 */
	protected String firmwareVersion = FIRMWARE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemorySubsystemControllerManufacturerID() <em>Memory Subsystem Controller Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySubsystemControllerManufacturerID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MEMORY_SUBSYSTEM_CONTROLLER_MANUFACTURER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemorySubsystemControllerManufacturerID() <em>Memory Subsystem Controller Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySubsystemControllerManufacturerID()
	 * @generated
	 * @ordered
	 */
	protected Integer memorySubsystemControllerManufacturerID = MEMORY_SUBSYSTEM_CONTROLLER_MANUFACTURER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemorySubsystemControllerProductID() <em>Memory Subsystem Controller Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySubsystemControllerProductID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MEMORY_SUBSYSTEM_CONTROLLER_PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemorySubsystemControllerProductID() <em>Memory Subsystem Controller Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemorySubsystemControllerProductID()
	 * @generated
	 * @ordered
	 */
	protected Integer memorySubsystemControllerProductID = MEMORY_SUBSYSTEM_CONTROLLER_PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryTechnology() <em>Memory Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MEMORY_TECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryTechnology() <em>Memory Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryTechnology()
	 * @generated
	 * @ordered
	 */
	protected Integer memoryTechnology = MEMORY_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleManufacturerID() <em>Module Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleManufacturerID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MODULE_MANUFACTURER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleManufacturerID() <em>Module Manufacturer ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleManufacturerID()
	 * @generated
	 * @ordered
	 */
	protected Integer moduleManufacturerID = MODULE_MANUFACTURER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getModuleProductID() <em>Module Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleProductID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MODULE_PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleProductID() <em>Module Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleProductID()
	 * @generated
	 * @ordered
	 */
	protected Integer moduleProductID = MODULE_PRODUCT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PhysicalMemoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PhysicalMemory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMemoryFormFactor() {
		return memoryFormFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemoryFormFactor(Integer newMemoryFormFactor) {
		Integer oldMemoryFormFactor = memoryFormFactor;
		memoryFormFactor = newMemoryFormFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_FORM_FACTOR, oldMemoryFormFactor, memoryFormFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMemoryType() {
		return memoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemoryType(Integer newMemoryType) {
		Integer oldMemoryType = memoryType;
		memoryType = newMemoryType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_TYPE, oldMemoryType, memoryType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTotalWidth() {
		return totalWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalWidth(Integer newTotalWidth) {
		Integer oldTotalWidth = totalWidth;
		totalWidth = newTotalWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__TOTAL_WIDTH, oldTotalWidth, totalWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataWidth() {
		return dataWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataWidth(Integer newDataWidth) {
		Integer oldDataWidth = dataWidth;
		dataWidth = newDataWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__DATA_WIDTH, oldDataWidth, dataWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeed(Long newSpeed) {
		Long oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(Long newCapacity) {
		Long oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBankLabel() {
		return bankLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBankLabel(String newBankLabel) {
		String oldBankLabel = bankLabel;
		bankLabel = newBankLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__BANK_LABEL, oldBankLabel, bankLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPositionInRow() {
		return positionInRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionInRow(Long newPositionInRow) {
		Long oldPositionInRow = positionInRow;
		positionInRow = newPositionInRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__POSITION_IN_ROW, oldPositionInRow, positionInRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInterleavePosition() {
		return interleavePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterleavePosition(Long newInterleavePosition) {
		Long oldInterleavePosition = interleavePosition;
		interleavePosition = newInterleavePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__INTERLEAVE_POSITION, oldInterleavePosition, interleavePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getConfiguredMemoryClockSpeed() {
		return configuredMemoryClockSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfiguredMemoryClockSpeed(Long newConfiguredMemoryClockSpeed) {
		Long oldConfiguredMemoryClockSpeed = configuredMemoryClockSpeed;
		configuredMemoryClockSpeed = newConfiguredMemoryClockSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__CONFIGURED_MEMORY_CLOCK_SPEED, oldConfiguredMemoryClockSpeed, configuredMemoryClockSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsSpeedInMhz() {
		return isSpeedInMhz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSpeedInMhz(Boolean newIsSpeedInMhz) {
		Boolean oldIsSpeedInMhz = isSpeedInMhz;
		isSpeedInMhz = newIsSpeedInMhz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__IS_SPEED_IN_MHZ, oldIsSpeedInMhz, isSpeedInMhz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxMemorySpeed() {
		return maxMemorySpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxMemorySpeed(Long newMaxMemorySpeed) {
		Long oldMaxMemorySpeed = maxMemorySpeed;
		maxMemorySpeed = newMaxMemorySpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__MAX_MEMORY_SPEED, oldMaxMemorySpeed, maxMemorySpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCapability_BlockAccessiblePersistentMemory() {
		return capability_BlockAccessiblePersistentMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapability_BlockAccessiblePersistentMemory(Boolean newCapability_BlockAccessiblePersistentMemory) {
		Boolean oldCapability_BlockAccessiblePersistentMemory = capability_BlockAccessiblePersistentMemory;
		capability_BlockAccessiblePersistentMemory = newCapability_BlockAccessiblePersistentMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__CAPABILITY_BLOCK_ACCESSIBLE_PERSISTENT_MEMORY, oldCapability_BlockAccessiblePersistentMemory, capability_BlockAccessiblePersistentMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCapability_ByteAccessiblePersistentMemory() {
		return capability_ByteAccessiblePersistentMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapability_ByteAccessiblePersistentMemory(Boolean newCapability_ByteAccessiblePersistentMemory) {
		Boolean oldCapability_ByteAccessiblePersistentMemory = capability_ByteAccessiblePersistentMemory;
		capability_ByteAccessiblePersistentMemory = newCapability_ByteAccessiblePersistentMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__CAPABILITY_BYTE_ACCESSIBLE_PERSISTENT_MEMORY, oldCapability_ByteAccessiblePersistentMemory, capability_ByteAccessiblePersistentMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCapability_VolatileMemory() {
		return capability_VolatileMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapability_VolatileMemory(Boolean newCapability_VolatileMemory) {
		Boolean oldCapability_VolatileMemory = capability_VolatileMemory;
		capability_VolatileMemory = newCapability_VolatileMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__CAPABILITY_VOLATILE_MEMORY, oldCapability_VolatileMemory, capability_VolatileMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirmwareVersion() {
		return firmwareVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirmwareVersion(String newFirmwareVersion) {
		String oldFirmwareVersion = firmwareVersion;
		firmwareVersion = newFirmwareVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__FIRMWARE_VERSION, oldFirmwareVersion, firmwareVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMemorySubsystemControllerManufacturerID() {
		return memorySubsystemControllerManufacturerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemorySubsystemControllerManufacturerID(Integer newMemorySubsystemControllerManufacturerID) {
		Integer oldMemorySubsystemControllerManufacturerID = memorySubsystemControllerManufacturerID;
		memorySubsystemControllerManufacturerID = newMemorySubsystemControllerManufacturerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_SUBSYSTEM_CONTROLLER_MANUFACTURER_ID, oldMemorySubsystemControllerManufacturerID, memorySubsystemControllerManufacturerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMemorySubsystemControllerProductID() {
		return memorySubsystemControllerProductID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemorySubsystemControllerProductID(Integer newMemorySubsystemControllerProductID) {
		Integer oldMemorySubsystemControllerProductID = memorySubsystemControllerProductID;
		memorySubsystemControllerProductID = newMemorySubsystemControllerProductID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_SUBSYSTEM_CONTROLLER_PRODUCT_ID, oldMemorySubsystemControllerProductID, memorySubsystemControllerProductID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMemoryTechnology() {
		return memoryTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemoryTechnology(Integer newMemoryTechnology) {
		Integer oldMemoryTechnology = memoryTechnology;
		memoryTechnology = newMemoryTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_TECHNOLOGY, oldMemoryTechnology, memoryTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getModuleManufacturerID() {
		return moduleManufacturerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModuleManufacturerID(Integer newModuleManufacturerID) {
		Integer oldModuleManufacturerID = moduleManufacturerID;
		moduleManufacturerID = newModuleManufacturerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__MODULE_MANUFACTURER_ID, oldModuleManufacturerID, moduleManufacturerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getModuleProductID() {
		return moduleProductID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModuleProductID(Integer newModuleProductID) {
		Integer oldModuleProductID = moduleProductID;
		moduleProductID = newModuleProductID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEMORY__MODULE_PRODUCT_ID, oldModuleProductID, moduleProductID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_FORM_FACTOR:
				return getMemoryFormFactor();
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_TYPE:
				return getMemoryType();
			case CimPackage.CIM_PHYSICAL_MEMORY__TOTAL_WIDTH:
				return getTotalWidth();
			case CimPackage.CIM_PHYSICAL_MEMORY__DATA_WIDTH:
				return getDataWidth();
			case CimPackage.CIM_PHYSICAL_MEMORY__SPEED:
				return getSpeed();
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPACITY:
				return getCapacity();
			case CimPackage.CIM_PHYSICAL_MEMORY__BANK_LABEL:
				return getBankLabel();
			case CimPackage.CIM_PHYSICAL_MEMORY__POSITION_IN_ROW:
				return getPositionInRow();
			case CimPackage.CIM_PHYSICAL_MEMORY__INTERLEAVE_POSITION:
				return getInterleavePosition();
			case CimPackage.CIM_PHYSICAL_MEMORY__CONFIGURED_MEMORY_CLOCK_SPEED:
				return getConfiguredMemoryClockSpeed();
			case CimPackage.CIM_PHYSICAL_MEMORY__IS_SPEED_IN_MHZ:
				return getIsSpeedInMhz();
			case CimPackage.CIM_PHYSICAL_MEMORY__MAX_MEMORY_SPEED:
				return getMaxMemorySpeed();
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPABILITY_BLOCK_ACCESSIBLE_PERSISTENT_MEMORY:
				return getCapability_BlockAccessiblePersistentMemory();
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPABILITY_BYTE_ACCESSIBLE_PERSISTENT_MEMORY:
				return getCapability_ByteAccessiblePersistentMemory();
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPABILITY_VOLATILE_MEMORY:
				return getCapability_VolatileMemory();
			case CimPackage.CIM_PHYSICAL_MEMORY__FIRMWARE_VERSION:
				return getFirmwareVersion();
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_SUBSYSTEM_CONTROLLER_MANUFACTURER_ID:
				return getMemorySubsystemControllerManufacturerID();
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_SUBSYSTEM_CONTROLLER_PRODUCT_ID:
				return getMemorySubsystemControllerProductID();
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_TECHNOLOGY:
				return getMemoryTechnology();
			case CimPackage.CIM_PHYSICAL_MEMORY__MODULE_MANUFACTURER_ID:
				return getModuleManufacturerID();
			case CimPackage.CIM_PHYSICAL_MEMORY__MODULE_PRODUCT_ID:
				return getModuleProductID();
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
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_FORM_FACTOR:
				setMemoryFormFactor((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_TYPE:
				setMemoryType((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__TOTAL_WIDTH:
				setTotalWidth((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__DATA_WIDTH:
				setDataWidth((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__SPEED:
				setSpeed((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPACITY:
				setCapacity((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__BANK_LABEL:
				setBankLabel((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__POSITION_IN_ROW:
				setPositionInRow((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__INTERLEAVE_POSITION:
				setInterleavePosition((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__CONFIGURED_MEMORY_CLOCK_SPEED:
				setConfiguredMemoryClockSpeed((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__IS_SPEED_IN_MHZ:
				setIsSpeedInMhz((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__MAX_MEMORY_SPEED:
				setMaxMemorySpeed((Long)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPABILITY_BLOCK_ACCESSIBLE_PERSISTENT_MEMORY:
				setCapability_BlockAccessiblePersistentMemory((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPABILITY_BYTE_ACCESSIBLE_PERSISTENT_MEMORY:
				setCapability_ByteAccessiblePersistentMemory((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPABILITY_VOLATILE_MEMORY:
				setCapability_VolatileMemory((Boolean)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__FIRMWARE_VERSION:
				setFirmwareVersion((String)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_SUBSYSTEM_CONTROLLER_MANUFACTURER_ID:
				setMemorySubsystemControllerManufacturerID((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_SUBSYSTEM_CONTROLLER_PRODUCT_ID:
				setMemorySubsystemControllerProductID((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_TECHNOLOGY:
				setMemoryTechnology((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__MODULE_MANUFACTURER_ID:
				setModuleManufacturerID((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__MODULE_PRODUCT_ID:
				setModuleProductID((Integer)newValue);
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
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_FORM_FACTOR:
				setMemoryFormFactor(MEMORY_FORM_FACTOR_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_TYPE:
				setMemoryType(MEMORY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__TOTAL_WIDTH:
				setTotalWidth(TOTAL_WIDTH_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__DATA_WIDTH:
				setDataWidth(DATA_WIDTH_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__BANK_LABEL:
				setBankLabel(BANK_LABEL_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__POSITION_IN_ROW:
				setPositionInRow(POSITION_IN_ROW_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__INTERLEAVE_POSITION:
				setInterleavePosition(INTERLEAVE_POSITION_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__CONFIGURED_MEMORY_CLOCK_SPEED:
				setConfiguredMemoryClockSpeed(CONFIGURED_MEMORY_CLOCK_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__IS_SPEED_IN_MHZ:
				setIsSpeedInMhz(IS_SPEED_IN_MHZ_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__MAX_MEMORY_SPEED:
				setMaxMemorySpeed(MAX_MEMORY_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPABILITY_BLOCK_ACCESSIBLE_PERSISTENT_MEMORY:
				setCapability_BlockAccessiblePersistentMemory(CAPABILITY_BLOCK_ACCESSIBLE_PERSISTENT_MEMORY_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPABILITY_BYTE_ACCESSIBLE_PERSISTENT_MEMORY:
				setCapability_ByteAccessiblePersistentMemory(CAPABILITY_BYTE_ACCESSIBLE_PERSISTENT_MEMORY_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPABILITY_VOLATILE_MEMORY:
				setCapability_VolatileMemory(CAPABILITY_VOLATILE_MEMORY_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__FIRMWARE_VERSION:
				setFirmwareVersion(FIRMWARE_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_SUBSYSTEM_CONTROLLER_MANUFACTURER_ID:
				setMemorySubsystemControllerManufacturerID(MEMORY_SUBSYSTEM_CONTROLLER_MANUFACTURER_ID_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_SUBSYSTEM_CONTROLLER_PRODUCT_ID:
				setMemorySubsystemControllerProductID(MEMORY_SUBSYSTEM_CONTROLLER_PRODUCT_ID_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_TECHNOLOGY:
				setMemoryTechnology(MEMORY_TECHNOLOGY_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__MODULE_MANUFACTURER_ID:
				setModuleManufacturerID(MODULE_MANUFACTURER_ID_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEMORY__MODULE_PRODUCT_ID:
				setModuleProductID(MODULE_PRODUCT_ID_EDEFAULT);
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
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_FORM_FACTOR:
				return MEMORY_FORM_FACTOR_EDEFAULT == null ? memoryFormFactor != null : !MEMORY_FORM_FACTOR_EDEFAULT.equals(memoryFormFactor);
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_TYPE:
				return MEMORY_TYPE_EDEFAULT == null ? memoryType != null : !MEMORY_TYPE_EDEFAULT.equals(memoryType);
			case CimPackage.CIM_PHYSICAL_MEMORY__TOTAL_WIDTH:
				return TOTAL_WIDTH_EDEFAULT == null ? totalWidth != null : !TOTAL_WIDTH_EDEFAULT.equals(totalWidth);
			case CimPackage.CIM_PHYSICAL_MEMORY__DATA_WIDTH:
				return DATA_WIDTH_EDEFAULT == null ? dataWidth != null : !DATA_WIDTH_EDEFAULT.equals(dataWidth);
			case CimPackage.CIM_PHYSICAL_MEMORY__SPEED:
				return SPEED_EDEFAULT == null ? speed != null : !SPEED_EDEFAULT.equals(speed);
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPACITY:
				return CAPACITY_EDEFAULT == null ? capacity != null : !CAPACITY_EDEFAULT.equals(capacity);
			case CimPackage.CIM_PHYSICAL_MEMORY__BANK_LABEL:
				return BANK_LABEL_EDEFAULT == null ? bankLabel != null : !BANK_LABEL_EDEFAULT.equals(bankLabel);
			case CimPackage.CIM_PHYSICAL_MEMORY__POSITION_IN_ROW:
				return POSITION_IN_ROW_EDEFAULT == null ? positionInRow != null : !POSITION_IN_ROW_EDEFAULT.equals(positionInRow);
			case CimPackage.CIM_PHYSICAL_MEMORY__INTERLEAVE_POSITION:
				return INTERLEAVE_POSITION_EDEFAULT == null ? interleavePosition != null : !INTERLEAVE_POSITION_EDEFAULT.equals(interleavePosition);
			case CimPackage.CIM_PHYSICAL_MEMORY__CONFIGURED_MEMORY_CLOCK_SPEED:
				return CONFIGURED_MEMORY_CLOCK_SPEED_EDEFAULT == null ? configuredMemoryClockSpeed != null : !CONFIGURED_MEMORY_CLOCK_SPEED_EDEFAULT.equals(configuredMemoryClockSpeed);
			case CimPackage.CIM_PHYSICAL_MEMORY__IS_SPEED_IN_MHZ:
				return IS_SPEED_IN_MHZ_EDEFAULT == null ? isSpeedInMhz != null : !IS_SPEED_IN_MHZ_EDEFAULT.equals(isSpeedInMhz);
			case CimPackage.CIM_PHYSICAL_MEMORY__MAX_MEMORY_SPEED:
				return MAX_MEMORY_SPEED_EDEFAULT == null ? maxMemorySpeed != null : !MAX_MEMORY_SPEED_EDEFAULT.equals(maxMemorySpeed);
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPABILITY_BLOCK_ACCESSIBLE_PERSISTENT_MEMORY:
				return CAPABILITY_BLOCK_ACCESSIBLE_PERSISTENT_MEMORY_EDEFAULT == null ? capability_BlockAccessiblePersistentMemory != null : !CAPABILITY_BLOCK_ACCESSIBLE_PERSISTENT_MEMORY_EDEFAULT.equals(capability_BlockAccessiblePersistentMemory);
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPABILITY_BYTE_ACCESSIBLE_PERSISTENT_MEMORY:
				return CAPABILITY_BYTE_ACCESSIBLE_PERSISTENT_MEMORY_EDEFAULT == null ? capability_ByteAccessiblePersistentMemory != null : !CAPABILITY_BYTE_ACCESSIBLE_PERSISTENT_MEMORY_EDEFAULT.equals(capability_ByteAccessiblePersistentMemory);
			case CimPackage.CIM_PHYSICAL_MEMORY__CAPABILITY_VOLATILE_MEMORY:
				return CAPABILITY_VOLATILE_MEMORY_EDEFAULT == null ? capability_VolatileMemory != null : !CAPABILITY_VOLATILE_MEMORY_EDEFAULT.equals(capability_VolatileMemory);
			case CimPackage.CIM_PHYSICAL_MEMORY__FIRMWARE_VERSION:
				return FIRMWARE_VERSION_EDEFAULT == null ? firmwareVersion != null : !FIRMWARE_VERSION_EDEFAULT.equals(firmwareVersion);
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_SUBSYSTEM_CONTROLLER_MANUFACTURER_ID:
				return MEMORY_SUBSYSTEM_CONTROLLER_MANUFACTURER_ID_EDEFAULT == null ? memorySubsystemControllerManufacturerID != null : !MEMORY_SUBSYSTEM_CONTROLLER_MANUFACTURER_ID_EDEFAULT.equals(memorySubsystemControllerManufacturerID);
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_SUBSYSTEM_CONTROLLER_PRODUCT_ID:
				return MEMORY_SUBSYSTEM_CONTROLLER_PRODUCT_ID_EDEFAULT == null ? memorySubsystemControllerProductID != null : !MEMORY_SUBSYSTEM_CONTROLLER_PRODUCT_ID_EDEFAULT.equals(memorySubsystemControllerProductID);
			case CimPackage.CIM_PHYSICAL_MEMORY__MEMORY_TECHNOLOGY:
				return MEMORY_TECHNOLOGY_EDEFAULT == null ? memoryTechnology != null : !MEMORY_TECHNOLOGY_EDEFAULT.equals(memoryTechnology);
			case CimPackage.CIM_PHYSICAL_MEMORY__MODULE_MANUFACTURER_ID:
				return MODULE_MANUFACTURER_ID_EDEFAULT == null ? moduleManufacturerID != null : !MODULE_MANUFACTURER_ID_EDEFAULT.equals(moduleManufacturerID);
			case CimPackage.CIM_PHYSICAL_MEMORY__MODULE_PRODUCT_ID:
				return MODULE_PRODUCT_ID_EDEFAULT == null ? moduleProductID != null : !MODULE_PRODUCT_ID_EDEFAULT.equals(moduleProductID);
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
		result.append(" (MemoryFormFactor: ");
		result.append(memoryFormFactor);
		result.append(", MemoryType: ");
		result.append(memoryType);
		result.append(", TotalWidth: ");
		result.append(totalWidth);
		result.append(", DataWidth: ");
		result.append(dataWidth);
		result.append(", Speed: ");
		result.append(speed);
		result.append(", Capacity: ");
		result.append(capacity);
		result.append(", BankLabel: ");
		result.append(bankLabel);
		result.append(", PositionInRow: ");
		result.append(positionInRow);
		result.append(", InterleavePosition: ");
		result.append(interleavePosition);
		result.append(", ConfiguredMemoryClockSpeed: ");
		result.append(configuredMemoryClockSpeed);
		result.append(", IsSpeedInMhz: ");
		result.append(isSpeedInMhz);
		result.append(", MaxMemorySpeed: ");
		result.append(maxMemorySpeed);
		result.append(", Capability_BlockAccessiblePersistentMemory: ");
		result.append(capability_BlockAccessiblePersistentMemory);
		result.append(", Capability_ByteAccessiblePersistentMemory: ");
		result.append(capability_ByteAccessiblePersistentMemory);
		result.append(", Capability_VolatileMemory: ");
		result.append(capability_VolatileMemory);
		result.append(", FirmwareVersion: ");
		result.append(firmwareVersion);
		result.append(", MemorySubsystemControllerManufacturerID: ");
		result.append(memorySubsystemControllerManufacturerID);
		result.append(", MemorySubsystemControllerProductID: ");
		result.append(memorySubsystemControllerProductID);
		result.append(", MemoryTechnology: ");
		result.append(memoryTechnology);
		result.append(", ModuleManufacturerID: ");
		result.append(moduleManufacturerID);
		result.append(", ModuleProductID: ");
		result.append(moduleProductID);
		result.append(')');
		return result.toString();
	}

} //CIM_PhysicalMemoryImpl

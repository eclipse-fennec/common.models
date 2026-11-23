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

import org.dmtf.cim.CIM_Battery;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Battery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getBatteryStatus <em>Battery Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getTimeOnBattery <em>Time On Battery</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getEstimatedRunTime <em>Estimated Run Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getEstimatedChargeRemaining <em>Estimated Charge Remaining</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getChemistry <em>Chemistry</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getDesignCapacity <em>Design Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getFullChargeCapacity <em>Full Charge Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getDesignVoltage <em>Design Voltage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getSmartBatteryVersion <em>Smart Battery Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getTimeToFullCharge <em>Time To Full Charge</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getExpectedLife <em>Expected Life</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getMaxRechargeTime <em>Max Recharge Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getRechargeCount <em>Recharge Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getMaxRechargeCount <em>Max Recharge Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getRemainingCapacity <em>Remaining Capacity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getRemainingCapacityMaxError <em>Remaining Capacity Max Error</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getOtherChemistryDescription <em>Other Chemistry Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getChargingStatus <em>Charging Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_BatteryImpl#getHealthPercent <em>Health Percent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_BatteryImpl extends CIM_LogicalDeviceImpl implements CIM_Battery {
	/**
	 * The default value of the '{@link #getBatteryStatus() <em>Battery Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BATTERY_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBatteryStatus() <em>Battery Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer batteryStatus = BATTERY_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOnBattery() <em>Time On Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOnBattery()
	 * @generated
	 * @ordered
	 */
	protected static final Long TIME_ON_BATTERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOnBattery() <em>Time On Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOnBattery()
	 * @generated
	 * @ordered
	 */
	protected Long timeOnBattery = TIME_ON_BATTERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedRunTime() <em>Estimated Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedRunTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long ESTIMATED_RUN_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedRunTime() <em>Estimated Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedRunTime()
	 * @generated
	 * @ordered
	 */
	protected Long estimatedRunTime = ESTIMATED_RUN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEstimatedChargeRemaining() <em>Estimated Charge Remaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedChargeRemaining()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ESTIMATED_CHARGE_REMAINING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEstimatedChargeRemaining() <em>Estimated Charge Remaining</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedChargeRemaining()
	 * @generated
	 * @ordered
	 */
	protected Integer estimatedChargeRemaining = ESTIMATED_CHARGE_REMAINING_EDEFAULT;

	/**
	 * The default value of the '{@link #getChemistry() <em>Chemistry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemistry()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHEMISTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChemistry() <em>Chemistry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemistry()
	 * @generated
	 * @ordered
	 */
	protected Integer chemistry = CHEMISTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesignCapacity() <em>Design Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long DESIGN_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignCapacity() <em>Design Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long designCapacity = DESIGN_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullChargeCapacity() <em>Full Charge Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullChargeCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long FULL_CHARGE_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullChargeCapacity() <em>Full Charge Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullChargeCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long fullChargeCapacity = FULL_CHARGE_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesignVoltage() <em>Design Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final Long DESIGN_VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignVoltage() <em>Design Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignVoltage()
	 * @generated
	 * @ordered
	 */
	protected Long designVoltage = DESIGN_VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSmartBatteryVersion() <em>Smart Battery Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmartBatteryVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SMART_BATTERY_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSmartBatteryVersion() <em>Smart Battery Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmartBatteryVersion()
	 * @generated
	 * @ordered
	 */
	protected String smartBatteryVersion = SMART_BATTERY_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeToFullCharge() <em>Time To Full Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToFullCharge()
	 * @generated
	 * @ordered
	 */
	protected static final Long TIME_TO_FULL_CHARGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeToFullCharge() <em>Time To Full Charge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToFullCharge()
	 * @generated
	 * @ordered
	 */
	protected Long timeToFullCharge = TIME_TO_FULL_CHARGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpectedLife() <em>Expected Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedLife()
	 * @generated
	 * @ordered
	 */
	protected static final Long EXPECTED_LIFE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectedLife() <em>Expected Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedLife()
	 * @generated
	 * @ordered
	 */
	protected Long expectedLife = EXPECTED_LIFE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRechargeTime() <em>Max Recharge Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRechargeTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_RECHARGE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxRechargeTime() <em>Max Recharge Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRechargeTime()
	 * @generated
	 * @ordered
	 */
	protected Long maxRechargeTime = MAX_RECHARGE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRechargeCount() <em>Recharge Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRechargeCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECHARGE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRechargeCount() <em>Recharge Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRechargeCount()
	 * @generated
	 * @ordered
	 */
	protected Long rechargeCount = RECHARGE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRechargeCount() <em>Max Recharge Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRechargeCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_RECHARGE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxRechargeCount() <em>Max Recharge Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRechargeCount()
	 * @generated
	 * @ordered
	 */
	protected Long maxRechargeCount = MAX_RECHARGE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingCapacity() <em>Remaining Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Long REMAINING_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingCapacity() <em>Remaining Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCapacity()
	 * @generated
	 * @ordered
	 */
	protected Long remainingCapacity = REMAINING_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemainingCapacityMaxError() <em>Remaining Capacity Max Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCapacityMaxError()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REMAINING_CAPACITY_MAX_ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingCapacityMaxError() <em>Remaining Capacity Max Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCapacityMaxError()
	 * @generated
	 * @ordered
	 */
	protected Integer remainingCapacityMaxError = REMAINING_CAPACITY_MAX_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherChemistryDescription() <em>Other Chemistry Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherChemistryDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CHEMISTRY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherChemistryDescription() <em>Other Chemistry Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherChemistryDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherChemistryDescription = OTHER_CHEMISTRY_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getChargingStatus() <em>Charging Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHARGING_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChargingStatus() <em>Charging Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargingStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer chargingStatus = CHARGING_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHealthPercent() <em>Health Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthPercent()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HEALTH_PERCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHealthPercent() <em>Health Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthPercent()
	 * @generated
	 * @ordered
	 */
	protected Integer healthPercent = HEALTH_PERCENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_BatteryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Battery();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBatteryStatus() {
		return batteryStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBatteryStatus(Integer newBatteryStatus) {
		Integer oldBatteryStatus = batteryStatus;
		batteryStatus = newBatteryStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__BATTERY_STATUS, oldBatteryStatus, batteryStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTimeOnBattery() {
		return timeOnBattery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOnBattery(Long newTimeOnBattery) {
		Long oldTimeOnBattery = timeOnBattery;
		timeOnBattery = newTimeOnBattery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__TIME_ON_BATTERY, oldTimeOnBattery, timeOnBattery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getEstimatedRunTime() {
		return estimatedRunTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedRunTime(Long newEstimatedRunTime) {
		Long oldEstimatedRunTime = estimatedRunTime;
		estimatedRunTime = newEstimatedRunTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__ESTIMATED_RUN_TIME, oldEstimatedRunTime, estimatedRunTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEstimatedChargeRemaining() {
		return estimatedChargeRemaining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEstimatedChargeRemaining(Integer newEstimatedChargeRemaining) {
		Integer oldEstimatedChargeRemaining = estimatedChargeRemaining;
		estimatedChargeRemaining = newEstimatedChargeRemaining;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__ESTIMATED_CHARGE_REMAINING, oldEstimatedChargeRemaining, estimatedChargeRemaining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getChemistry() {
		return chemistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChemistry(Integer newChemistry) {
		Integer oldChemistry = chemistry;
		chemistry = newChemistry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__CHEMISTRY, oldChemistry, chemistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDesignCapacity() {
		return designCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesignCapacity(Long newDesignCapacity) {
		Long oldDesignCapacity = designCapacity;
		designCapacity = newDesignCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__DESIGN_CAPACITY, oldDesignCapacity, designCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFullChargeCapacity() {
		return fullChargeCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFullChargeCapacity(Long newFullChargeCapacity) {
		Long oldFullChargeCapacity = fullChargeCapacity;
		fullChargeCapacity = newFullChargeCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__FULL_CHARGE_CAPACITY, oldFullChargeCapacity, fullChargeCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDesignVoltage() {
		return designVoltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesignVoltage(Long newDesignVoltage) {
		Long oldDesignVoltage = designVoltage;
		designVoltage = newDesignVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__DESIGN_VOLTAGE, oldDesignVoltage, designVoltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSmartBatteryVersion() {
		return smartBatteryVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSmartBatteryVersion(String newSmartBatteryVersion) {
		String oldSmartBatteryVersion = smartBatteryVersion;
		smartBatteryVersion = newSmartBatteryVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__SMART_BATTERY_VERSION, oldSmartBatteryVersion, smartBatteryVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTimeToFullCharge() {
		return timeToFullCharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeToFullCharge(Long newTimeToFullCharge) {
		Long oldTimeToFullCharge = timeToFullCharge;
		timeToFullCharge = newTimeToFullCharge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__TIME_TO_FULL_CHARGE, oldTimeToFullCharge, timeToFullCharge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getExpectedLife() {
		return expectedLife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedLife(Long newExpectedLife) {
		Long oldExpectedLife = expectedLife;
		expectedLife = newExpectedLife;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__EXPECTED_LIFE, oldExpectedLife, expectedLife));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxRechargeTime() {
		return maxRechargeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRechargeTime(Long newMaxRechargeTime) {
		Long oldMaxRechargeTime = maxRechargeTime;
		maxRechargeTime = newMaxRechargeTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__MAX_RECHARGE_TIME, oldMaxRechargeTime, maxRechargeTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRechargeCount() {
		return rechargeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRechargeCount(Long newRechargeCount) {
		Long oldRechargeCount = rechargeCount;
		rechargeCount = newRechargeCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__RECHARGE_COUNT, oldRechargeCount, rechargeCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxRechargeCount() {
		return maxRechargeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRechargeCount(Long newMaxRechargeCount) {
		Long oldMaxRechargeCount = maxRechargeCount;
		maxRechargeCount = newMaxRechargeCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__MAX_RECHARGE_COUNT, oldMaxRechargeCount, maxRechargeCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRemainingCapacity() {
		return remainingCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemainingCapacity(Long newRemainingCapacity) {
		Long oldRemainingCapacity = remainingCapacity;
		remainingCapacity = newRemainingCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__REMAINING_CAPACITY, oldRemainingCapacity, remainingCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemainingCapacityMaxError() {
		return remainingCapacityMaxError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemainingCapacityMaxError(Integer newRemainingCapacityMaxError) {
		Integer oldRemainingCapacityMaxError = remainingCapacityMaxError;
		remainingCapacityMaxError = newRemainingCapacityMaxError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__REMAINING_CAPACITY_MAX_ERROR, oldRemainingCapacityMaxError, remainingCapacityMaxError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherChemistryDescription() {
		return otherChemistryDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherChemistryDescription(String newOtherChemistryDescription) {
		String oldOtherChemistryDescription = otherChemistryDescription;
		otherChemistryDescription = newOtherChemistryDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__OTHER_CHEMISTRY_DESCRIPTION, oldOtherChemistryDescription, otherChemistryDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getChargingStatus() {
		return chargingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChargingStatus(Integer newChargingStatus) {
		Integer oldChargingStatus = chargingStatus;
		chargingStatus = newChargingStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__CHARGING_STATUS, oldChargingStatus, chargingStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHealthPercent() {
		return healthPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHealthPercent(Integer newHealthPercent) {
		Integer oldHealthPercent = healthPercent;
		healthPercent = newHealthPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_BATTERY__HEALTH_PERCENT, oldHealthPercent, healthPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_BATTERY__BATTERY_STATUS:
				return getBatteryStatus();
			case CimPackage.CIM_BATTERY__TIME_ON_BATTERY:
				return getTimeOnBattery();
			case CimPackage.CIM_BATTERY__ESTIMATED_RUN_TIME:
				return getEstimatedRunTime();
			case CimPackage.CIM_BATTERY__ESTIMATED_CHARGE_REMAINING:
				return getEstimatedChargeRemaining();
			case CimPackage.CIM_BATTERY__CHEMISTRY:
				return getChemistry();
			case CimPackage.CIM_BATTERY__DESIGN_CAPACITY:
				return getDesignCapacity();
			case CimPackage.CIM_BATTERY__FULL_CHARGE_CAPACITY:
				return getFullChargeCapacity();
			case CimPackage.CIM_BATTERY__DESIGN_VOLTAGE:
				return getDesignVoltage();
			case CimPackage.CIM_BATTERY__SMART_BATTERY_VERSION:
				return getSmartBatteryVersion();
			case CimPackage.CIM_BATTERY__TIME_TO_FULL_CHARGE:
				return getTimeToFullCharge();
			case CimPackage.CIM_BATTERY__EXPECTED_LIFE:
				return getExpectedLife();
			case CimPackage.CIM_BATTERY__MAX_RECHARGE_TIME:
				return getMaxRechargeTime();
			case CimPackage.CIM_BATTERY__RECHARGE_COUNT:
				return getRechargeCount();
			case CimPackage.CIM_BATTERY__MAX_RECHARGE_COUNT:
				return getMaxRechargeCount();
			case CimPackage.CIM_BATTERY__REMAINING_CAPACITY:
				return getRemainingCapacity();
			case CimPackage.CIM_BATTERY__REMAINING_CAPACITY_MAX_ERROR:
				return getRemainingCapacityMaxError();
			case CimPackage.CIM_BATTERY__OTHER_CHEMISTRY_DESCRIPTION:
				return getOtherChemistryDescription();
			case CimPackage.CIM_BATTERY__CHARGING_STATUS:
				return getChargingStatus();
			case CimPackage.CIM_BATTERY__HEALTH_PERCENT:
				return getHealthPercent();
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
			case CimPackage.CIM_BATTERY__BATTERY_STATUS:
				setBatteryStatus((Integer)newValue);
				return;
			case CimPackage.CIM_BATTERY__TIME_ON_BATTERY:
				setTimeOnBattery((Long)newValue);
				return;
			case CimPackage.CIM_BATTERY__ESTIMATED_RUN_TIME:
				setEstimatedRunTime((Long)newValue);
				return;
			case CimPackage.CIM_BATTERY__ESTIMATED_CHARGE_REMAINING:
				setEstimatedChargeRemaining((Integer)newValue);
				return;
			case CimPackage.CIM_BATTERY__CHEMISTRY:
				setChemistry((Integer)newValue);
				return;
			case CimPackage.CIM_BATTERY__DESIGN_CAPACITY:
				setDesignCapacity((Long)newValue);
				return;
			case CimPackage.CIM_BATTERY__FULL_CHARGE_CAPACITY:
				setFullChargeCapacity((Long)newValue);
				return;
			case CimPackage.CIM_BATTERY__DESIGN_VOLTAGE:
				setDesignVoltage((Long)newValue);
				return;
			case CimPackage.CIM_BATTERY__SMART_BATTERY_VERSION:
				setSmartBatteryVersion((String)newValue);
				return;
			case CimPackage.CIM_BATTERY__TIME_TO_FULL_CHARGE:
				setTimeToFullCharge((Long)newValue);
				return;
			case CimPackage.CIM_BATTERY__EXPECTED_LIFE:
				setExpectedLife((Long)newValue);
				return;
			case CimPackage.CIM_BATTERY__MAX_RECHARGE_TIME:
				setMaxRechargeTime((Long)newValue);
				return;
			case CimPackage.CIM_BATTERY__RECHARGE_COUNT:
				setRechargeCount((Long)newValue);
				return;
			case CimPackage.CIM_BATTERY__MAX_RECHARGE_COUNT:
				setMaxRechargeCount((Long)newValue);
				return;
			case CimPackage.CIM_BATTERY__REMAINING_CAPACITY:
				setRemainingCapacity((Long)newValue);
				return;
			case CimPackage.CIM_BATTERY__REMAINING_CAPACITY_MAX_ERROR:
				setRemainingCapacityMaxError((Integer)newValue);
				return;
			case CimPackage.CIM_BATTERY__OTHER_CHEMISTRY_DESCRIPTION:
				setOtherChemistryDescription((String)newValue);
				return;
			case CimPackage.CIM_BATTERY__CHARGING_STATUS:
				setChargingStatus((Integer)newValue);
				return;
			case CimPackage.CIM_BATTERY__HEALTH_PERCENT:
				setHealthPercent((Integer)newValue);
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
			case CimPackage.CIM_BATTERY__BATTERY_STATUS:
				setBatteryStatus(BATTERY_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__TIME_ON_BATTERY:
				setTimeOnBattery(TIME_ON_BATTERY_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__ESTIMATED_RUN_TIME:
				setEstimatedRunTime(ESTIMATED_RUN_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__ESTIMATED_CHARGE_REMAINING:
				setEstimatedChargeRemaining(ESTIMATED_CHARGE_REMAINING_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__CHEMISTRY:
				setChemistry(CHEMISTRY_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__DESIGN_CAPACITY:
				setDesignCapacity(DESIGN_CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__FULL_CHARGE_CAPACITY:
				setFullChargeCapacity(FULL_CHARGE_CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__DESIGN_VOLTAGE:
				setDesignVoltage(DESIGN_VOLTAGE_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__SMART_BATTERY_VERSION:
				setSmartBatteryVersion(SMART_BATTERY_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__TIME_TO_FULL_CHARGE:
				setTimeToFullCharge(TIME_TO_FULL_CHARGE_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__EXPECTED_LIFE:
				setExpectedLife(EXPECTED_LIFE_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__MAX_RECHARGE_TIME:
				setMaxRechargeTime(MAX_RECHARGE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__RECHARGE_COUNT:
				setRechargeCount(RECHARGE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__MAX_RECHARGE_COUNT:
				setMaxRechargeCount(MAX_RECHARGE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__REMAINING_CAPACITY:
				setRemainingCapacity(REMAINING_CAPACITY_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__REMAINING_CAPACITY_MAX_ERROR:
				setRemainingCapacityMaxError(REMAINING_CAPACITY_MAX_ERROR_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__OTHER_CHEMISTRY_DESCRIPTION:
				setOtherChemistryDescription(OTHER_CHEMISTRY_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__CHARGING_STATUS:
				setChargingStatus(CHARGING_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_BATTERY__HEALTH_PERCENT:
				setHealthPercent(HEALTH_PERCENT_EDEFAULT);
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
			case CimPackage.CIM_BATTERY__BATTERY_STATUS:
				return BATTERY_STATUS_EDEFAULT == null ? batteryStatus != null : !BATTERY_STATUS_EDEFAULT.equals(batteryStatus);
			case CimPackage.CIM_BATTERY__TIME_ON_BATTERY:
				return TIME_ON_BATTERY_EDEFAULT == null ? timeOnBattery != null : !TIME_ON_BATTERY_EDEFAULT.equals(timeOnBattery);
			case CimPackage.CIM_BATTERY__ESTIMATED_RUN_TIME:
				return ESTIMATED_RUN_TIME_EDEFAULT == null ? estimatedRunTime != null : !ESTIMATED_RUN_TIME_EDEFAULT.equals(estimatedRunTime);
			case CimPackage.CIM_BATTERY__ESTIMATED_CHARGE_REMAINING:
				return ESTIMATED_CHARGE_REMAINING_EDEFAULT == null ? estimatedChargeRemaining != null : !ESTIMATED_CHARGE_REMAINING_EDEFAULT.equals(estimatedChargeRemaining);
			case CimPackage.CIM_BATTERY__CHEMISTRY:
				return CHEMISTRY_EDEFAULT == null ? chemistry != null : !CHEMISTRY_EDEFAULT.equals(chemistry);
			case CimPackage.CIM_BATTERY__DESIGN_CAPACITY:
				return DESIGN_CAPACITY_EDEFAULT == null ? designCapacity != null : !DESIGN_CAPACITY_EDEFAULT.equals(designCapacity);
			case CimPackage.CIM_BATTERY__FULL_CHARGE_CAPACITY:
				return FULL_CHARGE_CAPACITY_EDEFAULT == null ? fullChargeCapacity != null : !FULL_CHARGE_CAPACITY_EDEFAULT.equals(fullChargeCapacity);
			case CimPackage.CIM_BATTERY__DESIGN_VOLTAGE:
				return DESIGN_VOLTAGE_EDEFAULT == null ? designVoltage != null : !DESIGN_VOLTAGE_EDEFAULT.equals(designVoltage);
			case CimPackage.CIM_BATTERY__SMART_BATTERY_VERSION:
				return SMART_BATTERY_VERSION_EDEFAULT == null ? smartBatteryVersion != null : !SMART_BATTERY_VERSION_EDEFAULT.equals(smartBatteryVersion);
			case CimPackage.CIM_BATTERY__TIME_TO_FULL_CHARGE:
				return TIME_TO_FULL_CHARGE_EDEFAULT == null ? timeToFullCharge != null : !TIME_TO_FULL_CHARGE_EDEFAULT.equals(timeToFullCharge);
			case CimPackage.CIM_BATTERY__EXPECTED_LIFE:
				return EXPECTED_LIFE_EDEFAULT == null ? expectedLife != null : !EXPECTED_LIFE_EDEFAULT.equals(expectedLife);
			case CimPackage.CIM_BATTERY__MAX_RECHARGE_TIME:
				return MAX_RECHARGE_TIME_EDEFAULT == null ? maxRechargeTime != null : !MAX_RECHARGE_TIME_EDEFAULT.equals(maxRechargeTime);
			case CimPackage.CIM_BATTERY__RECHARGE_COUNT:
				return RECHARGE_COUNT_EDEFAULT == null ? rechargeCount != null : !RECHARGE_COUNT_EDEFAULT.equals(rechargeCount);
			case CimPackage.CIM_BATTERY__MAX_RECHARGE_COUNT:
				return MAX_RECHARGE_COUNT_EDEFAULT == null ? maxRechargeCount != null : !MAX_RECHARGE_COUNT_EDEFAULT.equals(maxRechargeCount);
			case CimPackage.CIM_BATTERY__REMAINING_CAPACITY:
				return REMAINING_CAPACITY_EDEFAULT == null ? remainingCapacity != null : !REMAINING_CAPACITY_EDEFAULT.equals(remainingCapacity);
			case CimPackage.CIM_BATTERY__REMAINING_CAPACITY_MAX_ERROR:
				return REMAINING_CAPACITY_MAX_ERROR_EDEFAULT == null ? remainingCapacityMaxError != null : !REMAINING_CAPACITY_MAX_ERROR_EDEFAULT.equals(remainingCapacityMaxError);
			case CimPackage.CIM_BATTERY__OTHER_CHEMISTRY_DESCRIPTION:
				return OTHER_CHEMISTRY_DESCRIPTION_EDEFAULT == null ? otherChemistryDescription != null : !OTHER_CHEMISTRY_DESCRIPTION_EDEFAULT.equals(otherChemistryDescription);
			case CimPackage.CIM_BATTERY__CHARGING_STATUS:
				return CHARGING_STATUS_EDEFAULT == null ? chargingStatus != null : !CHARGING_STATUS_EDEFAULT.equals(chargingStatus);
			case CimPackage.CIM_BATTERY__HEALTH_PERCENT:
				return HEALTH_PERCENT_EDEFAULT == null ? healthPercent != null : !HEALTH_PERCENT_EDEFAULT.equals(healthPercent);
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
		result.append(" (BatteryStatus: ");
		result.append(batteryStatus);
		result.append(", TimeOnBattery: ");
		result.append(timeOnBattery);
		result.append(", EstimatedRunTime: ");
		result.append(estimatedRunTime);
		result.append(", EstimatedChargeRemaining: ");
		result.append(estimatedChargeRemaining);
		result.append(", Chemistry: ");
		result.append(chemistry);
		result.append(", DesignCapacity: ");
		result.append(designCapacity);
		result.append(", FullChargeCapacity: ");
		result.append(fullChargeCapacity);
		result.append(", DesignVoltage: ");
		result.append(designVoltage);
		result.append(", SmartBatteryVersion: ");
		result.append(smartBatteryVersion);
		result.append(", TimeToFullCharge: ");
		result.append(timeToFullCharge);
		result.append(", ExpectedLife: ");
		result.append(expectedLife);
		result.append(", MaxRechargeTime: ");
		result.append(maxRechargeTime);
		result.append(", RechargeCount: ");
		result.append(rechargeCount);
		result.append(", MaxRechargeCount: ");
		result.append(maxRechargeCount);
		result.append(", RemainingCapacity: ");
		result.append(remainingCapacity);
		result.append(", RemainingCapacityMaxError: ");
		result.append(remainingCapacityMaxError);
		result.append(", OtherChemistryDescription: ");
		result.append(otherChemistryDescription);
		result.append(", ChargingStatus: ");
		result.append(chargingStatus);
		result.append(", HealthPercent: ");
		result.append(healthPercent);
		result.append(')');
		return result.toString();
	}

} //CIM_BatteryImpl

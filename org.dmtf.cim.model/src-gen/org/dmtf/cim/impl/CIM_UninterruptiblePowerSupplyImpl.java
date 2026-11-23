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

import org.dmtf.cim.CIM_UninterruptiblePowerSupply;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Uninterruptible Power Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UninterruptiblePowerSupplyImpl#getRemainingCapacityStatus <em>Remaining Capacity Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UninterruptiblePowerSupplyImpl#getTimeOnBackup <em>Time On Backup</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UninterruptiblePowerSupplyImpl#getEstimatedRunTime <em>Estimated Run Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UninterruptiblePowerSupplyImpl#getEstimatedChargeRemaining <em>Estimated Charge Remaining</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UninterruptiblePowerSupplyImpl extends CIM_PowerSupplyImpl implements CIM_UninterruptiblePowerSupply {
	/**
	 * The default value of the '{@link #getRemainingCapacityStatus() <em>Remaining Capacity Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCapacityStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REMAINING_CAPACITY_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemainingCapacityStatus() <em>Remaining Capacity Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingCapacityStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer remainingCapacityStatus = REMAINING_CAPACITY_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOnBackup() <em>Time On Backup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOnBackup()
	 * @generated
	 * @ordered
	 */
	protected static final Long TIME_ON_BACKUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOnBackup() <em>Time On Backup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOnBackup()
	 * @generated
	 * @ordered
	 */
	protected Long timeOnBackup = TIME_ON_BACKUP_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UninterruptiblePowerSupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UninterruptiblePowerSupply();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemainingCapacityStatus() {
		return remainingCapacityStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemainingCapacityStatus(Integer newRemainingCapacityStatus) {
		Integer oldRemainingCapacityStatus = remainingCapacityStatus;
		remainingCapacityStatus = newRemainingCapacityStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__REMAINING_CAPACITY_STATUS, oldRemainingCapacityStatus, remainingCapacityStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTimeOnBackup() {
		return timeOnBackup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOnBackup(Long newTimeOnBackup) {
		Long oldTimeOnBackup = timeOnBackup;
		timeOnBackup = newTimeOnBackup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__TIME_ON_BACKUP, oldTimeOnBackup, timeOnBackup));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__ESTIMATED_RUN_TIME, oldEstimatedRunTime, estimatedRunTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__ESTIMATED_CHARGE_REMAINING, oldEstimatedChargeRemaining, estimatedChargeRemaining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__REMAINING_CAPACITY_STATUS:
				return getRemainingCapacityStatus();
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__TIME_ON_BACKUP:
				return getTimeOnBackup();
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__ESTIMATED_RUN_TIME:
				return getEstimatedRunTime();
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__ESTIMATED_CHARGE_REMAINING:
				return getEstimatedChargeRemaining();
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
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__REMAINING_CAPACITY_STATUS:
				setRemainingCapacityStatus((Integer)newValue);
				return;
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__TIME_ON_BACKUP:
				setTimeOnBackup((Long)newValue);
				return;
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__ESTIMATED_RUN_TIME:
				setEstimatedRunTime((Long)newValue);
				return;
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__ESTIMATED_CHARGE_REMAINING:
				setEstimatedChargeRemaining((Integer)newValue);
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
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__REMAINING_CAPACITY_STATUS:
				setRemainingCapacityStatus(REMAINING_CAPACITY_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__TIME_ON_BACKUP:
				setTimeOnBackup(TIME_ON_BACKUP_EDEFAULT);
				return;
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__ESTIMATED_RUN_TIME:
				setEstimatedRunTime(ESTIMATED_RUN_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__ESTIMATED_CHARGE_REMAINING:
				setEstimatedChargeRemaining(ESTIMATED_CHARGE_REMAINING_EDEFAULT);
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
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__REMAINING_CAPACITY_STATUS:
				return REMAINING_CAPACITY_STATUS_EDEFAULT == null ? remainingCapacityStatus != null : !REMAINING_CAPACITY_STATUS_EDEFAULT.equals(remainingCapacityStatus);
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__TIME_ON_BACKUP:
				return TIME_ON_BACKUP_EDEFAULT == null ? timeOnBackup != null : !TIME_ON_BACKUP_EDEFAULT.equals(timeOnBackup);
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__ESTIMATED_RUN_TIME:
				return ESTIMATED_RUN_TIME_EDEFAULT == null ? estimatedRunTime != null : !ESTIMATED_RUN_TIME_EDEFAULT.equals(estimatedRunTime);
			case CimPackage.CIM_UNINTERRUPTIBLE_POWER_SUPPLY__ESTIMATED_CHARGE_REMAINING:
				return ESTIMATED_CHARGE_REMAINING_EDEFAULT == null ? estimatedChargeRemaining != null : !ESTIMATED_CHARGE_REMAINING_EDEFAULT.equals(estimatedChargeRemaining);
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
		result.append(" (RemainingCapacityStatus: ");
		result.append(remainingCapacityStatus);
		result.append(", TimeOnBackup: ");
		result.append(timeOnBackup);
		result.append(", EstimatedRunTime: ");
		result.append(estimatedRunTime);
		result.append(", EstimatedChargeRemaining: ");
		result.append(estimatedChargeRemaining);
		result.append(')');
		return result.toString();
	}

} //CIM_UninterruptiblePowerSupplyImpl

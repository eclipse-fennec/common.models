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

import org.dmtf.cim.CIM_TapeDrive;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Tape Drive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_TapeDriveImpl#getEOTWarningZoneSize <em>EOT Warning Zone Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TapeDriveImpl#getMaxPartitionCount <em>Max Partition Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TapeDriveImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_TapeDriveImpl#getMaxRewindTime <em>Max Rewind Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_TapeDriveImpl extends CIM_MediaAccessDeviceImpl implements CIM_TapeDrive {
	/**
	 * The default value of the '{@link #getEOTWarningZoneSize() <em>EOT Warning Zone Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOTWarningZoneSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long EOT_WARNING_ZONE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEOTWarningZoneSize() <em>EOT Warning Zone Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEOTWarningZoneSize()
	 * @generated
	 * @ordered
	 */
	protected Long eotWarningZoneSize = EOT_WARNING_ZONE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxPartitionCount() <em>Max Partition Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPartitionCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_PARTITION_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxPartitionCount() <em>Max Partition Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPartitionCount()
	 * @generated
	 * @ordered
	 */
	protected Long maxPartitionCount = MAX_PARTITION_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected static final Long PADDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected Long padding = PADDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRewindTime() <em>Max Rewind Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRewindTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_REWIND_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxRewindTime() <em>Max Rewind Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRewindTime()
	 * @generated
	 * @ordered
	 */
	protected Long maxRewindTime = MAX_REWIND_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_TapeDriveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_TapeDrive();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getEOTWarningZoneSize() {
		return eotWarningZoneSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEOTWarningZoneSize(Long newEOTWarningZoneSize) {
		Long oldEOTWarningZoneSize = eotWarningZoneSize;
		eotWarningZoneSize = newEOTWarningZoneSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TAPE_DRIVE__EOT_WARNING_ZONE_SIZE, oldEOTWarningZoneSize, eotWarningZoneSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxPartitionCount() {
		return maxPartitionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxPartitionCount(Long newMaxPartitionCount) {
		Long oldMaxPartitionCount = maxPartitionCount;
		maxPartitionCount = newMaxPartitionCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TAPE_DRIVE__MAX_PARTITION_COUNT, oldMaxPartitionCount, maxPartitionCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPadding() {
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPadding(Long newPadding) {
		Long oldPadding = padding;
		padding = newPadding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TAPE_DRIVE__PADDING, oldPadding, padding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxRewindTime() {
		return maxRewindTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRewindTime(Long newMaxRewindTime) {
		Long oldMaxRewindTime = maxRewindTime;
		maxRewindTime = newMaxRewindTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_TAPE_DRIVE__MAX_REWIND_TIME, oldMaxRewindTime, maxRewindTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_TAPE_DRIVE__EOT_WARNING_ZONE_SIZE:
				return getEOTWarningZoneSize();
			case CimPackage.CIM_TAPE_DRIVE__MAX_PARTITION_COUNT:
				return getMaxPartitionCount();
			case CimPackage.CIM_TAPE_DRIVE__PADDING:
				return getPadding();
			case CimPackage.CIM_TAPE_DRIVE__MAX_REWIND_TIME:
				return getMaxRewindTime();
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
			case CimPackage.CIM_TAPE_DRIVE__EOT_WARNING_ZONE_SIZE:
				setEOTWarningZoneSize((Long)newValue);
				return;
			case CimPackage.CIM_TAPE_DRIVE__MAX_PARTITION_COUNT:
				setMaxPartitionCount((Long)newValue);
				return;
			case CimPackage.CIM_TAPE_DRIVE__PADDING:
				setPadding((Long)newValue);
				return;
			case CimPackage.CIM_TAPE_DRIVE__MAX_REWIND_TIME:
				setMaxRewindTime((Long)newValue);
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
			case CimPackage.CIM_TAPE_DRIVE__EOT_WARNING_ZONE_SIZE:
				setEOTWarningZoneSize(EOT_WARNING_ZONE_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_TAPE_DRIVE__MAX_PARTITION_COUNT:
				setMaxPartitionCount(MAX_PARTITION_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_TAPE_DRIVE__PADDING:
				setPadding(PADDING_EDEFAULT);
				return;
			case CimPackage.CIM_TAPE_DRIVE__MAX_REWIND_TIME:
				setMaxRewindTime(MAX_REWIND_TIME_EDEFAULT);
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
			case CimPackage.CIM_TAPE_DRIVE__EOT_WARNING_ZONE_SIZE:
				return EOT_WARNING_ZONE_SIZE_EDEFAULT == null ? eotWarningZoneSize != null : !EOT_WARNING_ZONE_SIZE_EDEFAULT.equals(eotWarningZoneSize);
			case CimPackage.CIM_TAPE_DRIVE__MAX_PARTITION_COUNT:
				return MAX_PARTITION_COUNT_EDEFAULT == null ? maxPartitionCount != null : !MAX_PARTITION_COUNT_EDEFAULT.equals(maxPartitionCount);
			case CimPackage.CIM_TAPE_DRIVE__PADDING:
				return PADDING_EDEFAULT == null ? padding != null : !PADDING_EDEFAULT.equals(padding);
			case CimPackage.CIM_TAPE_DRIVE__MAX_REWIND_TIME:
				return MAX_REWIND_TIME_EDEFAULT == null ? maxRewindTime != null : !MAX_REWIND_TIME_EDEFAULT.equals(maxRewindTime);
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
		result.append(" (EOTWarningZoneSize: ");
		result.append(eotWarningZoneSize);
		result.append(", MaxPartitionCount: ");
		result.append(maxPartitionCount);
		result.append(", Padding: ");
		result.append(padding);
		result.append(", MaxRewindTime: ");
		result.append(maxRewindTime);
		result.append(')');
		return result.toString();
	}

} //CIM_TapeDriveImpl

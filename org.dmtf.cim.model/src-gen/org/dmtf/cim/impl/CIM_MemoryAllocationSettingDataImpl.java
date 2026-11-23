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

import org.dmtf.cim.CIM_MemoryAllocationSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Memory Allocation Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryAllocationSettingDataImpl#getChannelInterleaveSize <em>Channel Interleave Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryAllocationSettingDataImpl#getChannelCount <em>Channel Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryAllocationSettingDataImpl#getControllerInterleaveSize <em>Controller Interleave Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MemoryAllocationSettingDataImpl#getReplication <em>Replication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MemoryAllocationSettingDataImpl extends CIM_ResourceAllocationSettingDataImpl implements CIM_MemoryAllocationSettingData {
	/**
	 * The default value of the '{@link #getChannelInterleaveSize() <em>Channel Interleave Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelInterleaveSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHANNEL_INTERLEAVE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannelInterleaveSize() <em>Channel Interleave Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelInterleaveSize()
	 * @generated
	 * @ordered
	 */
	protected Integer channelInterleaveSize = CHANNEL_INTERLEAVE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannelCount() <em>Channel Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHANNEL_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannelCount() <em>Channel Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelCount()
	 * @generated
	 * @ordered
	 */
	protected Integer channelCount = CHANNEL_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getControllerInterleaveSize() <em>Controller Interleave Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerInterleaveSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONTROLLER_INTERLEAVE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControllerInterleaveSize() <em>Controller Interleave Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerInterleaveSize()
	 * @generated
	 * @ordered
	 */
	protected Integer controllerInterleaveSize = CONTROLLER_INTERLEAVE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplication() <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication()
	 * @generated
	 * @ordered
	 */
	protected Integer replication = REPLICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MemoryAllocationSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_MemoryAllocationSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getChannelInterleaveSize() {
		return channelInterleaveSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannelInterleaveSize(Integer newChannelInterleaveSize) {
		Integer oldChannelInterleaveSize = channelInterleaveSize;
		channelInterleaveSize = newChannelInterleaveSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__CHANNEL_INTERLEAVE_SIZE, oldChannelInterleaveSize, channelInterleaveSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getChannelCount() {
		return channelCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannelCount(Integer newChannelCount) {
		Integer oldChannelCount = channelCount;
		channelCount = newChannelCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__CHANNEL_COUNT, oldChannelCount, channelCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getControllerInterleaveSize() {
		return controllerInterleaveSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControllerInterleaveSize(Integer newControllerInterleaveSize) {
		Integer oldControllerInterleaveSize = controllerInterleaveSize;
		controllerInterleaveSize = newControllerInterleaveSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__CONTROLLER_INTERLEAVE_SIZE, oldControllerInterleaveSize, controllerInterleaveSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getReplication() {
		return replication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplication(Integer newReplication) {
		Integer oldReplication = replication;
		replication = newReplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__REPLICATION, oldReplication, replication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__CHANNEL_INTERLEAVE_SIZE:
				return getChannelInterleaveSize();
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__CHANNEL_COUNT:
				return getChannelCount();
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__CONTROLLER_INTERLEAVE_SIZE:
				return getControllerInterleaveSize();
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__REPLICATION:
				return getReplication();
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
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__CHANNEL_INTERLEAVE_SIZE:
				setChannelInterleaveSize((Integer)newValue);
				return;
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__CHANNEL_COUNT:
				setChannelCount((Integer)newValue);
				return;
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__CONTROLLER_INTERLEAVE_SIZE:
				setControllerInterleaveSize((Integer)newValue);
				return;
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__REPLICATION:
				setReplication((Integer)newValue);
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
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__CHANNEL_INTERLEAVE_SIZE:
				setChannelInterleaveSize(CHANNEL_INTERLEAVE_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__CHANNEL_COUNT:
				setChannelCount(CHANNEL_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__CONTROLLER_INTERLEAVE_SIZE:
				setControllerInterleaveSize(CONTROLLER_INTERLEAVE_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__REPLICATION:
				setReplication(REPLICATION_EDEFAULT);
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
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__CHANNEL_INTERLEAVE_SIZE:
				return CHANNEL_INTERLEAVE_SIZE_EDEFAULT == null ? channelInterleaveSize != null : !CHANNEL_INTERLEAVE_SIZE_EDEFAULT.equals(channelInterleaveSize);
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__CHANNEL_COUNT:
				return CHANNEL_COUNT_EDEFAULT == null ? channelCount != null : !CHANNEL_COUNT_EDEFAULT.equals(channelCount);
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__CONTROLLER_INTERLEAVE_SIZE:
				return CONTROLLER_INTERLEAVE_SIZE_EDEFAULT == null ? controllerInterleaveSize != null : !CONTROLLER_INTERLEAVE_SIZE_EDEFAULT.equals(controllerInterleaveSize);
			case CimPackage.CIM_MEMORY_ALLOCATION_SETTING_DATA__REPLICATION:
				return REPLICATION_EDEFAULT == null ? replication != null : !REPLICATION_EDEFAULT.equals(replication);
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
		result.append(" (ChannelInterleaveSize: ");
		result.append(channelInterleaveSize);
		result.append(", ChannelCount: ");
		result.append(channelCount);
		result.append(", ControllerInterleaveSize: ");
		result.append(controllerInterleaveSize);
		result.append(", Replication: ");
		result.append(replication);
		result.append(')');
		return result.toString();
	}

} //CIM_MemoryAllocationSettingDataImpl

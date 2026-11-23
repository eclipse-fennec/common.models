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

import org.dmtf.cim.CIM_J2eeJVMStats;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM J2ee JVM Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJVMStatsImpl#getHeapSize <em>Heap Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJVMStatsImpl#getHeapSizeUpperBound <em>Heap Size Upper Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJVMStatsImpl#getHeapSizeLowerBound <em>Heap Size Lower Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJVMStatsImpl#getHeapSizeLowWaterMark <em>Heap Size Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJVMStatsImpl#getHeapSizeHighWaterMark <em>Heap Size High Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJVMStatsImpl#getUpTime <em>Up Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_J2eeJVMStatsImpl extends CIM_J2eeStatisticImpl implements CIM_J2eeJVMStats {
	/**
	 * The default value of the '{@link #getHeapSize() <em>Heap Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long HEAP_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeapSize() <em>Heap Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapSize()
	 * @generated
	 * @ordered
	 */
	protected Long heapSize = HEAP_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeapSizeUpperBound() <em>Heap Size Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapSizeUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Long HEAP_SIZE_UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeapSizeUpperBound() <em>Heap Size Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapSizeUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Long heapSizeUpperBound = HEAP_SIZE_UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeapSizeLowerBound() <em>Heap Size Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapSizeLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Long HEAP_SIZE_LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeapSizeLowerBound() <em>Heap Size Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapSizeLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Long heapSizeLowerBound = HEAP_SIZE_LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeapSizeLowWaterMark() <em>Heap Size Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapSizeLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long HEAP_SIZE_LOW_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeapSizeLowWaterMark() <em>Heap Size Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapSizeLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long heapSizeLowWaterMark = HEAP_SIZE_LOW_WATER_MARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeapSizeHighWaterMark() <em>Heap Size High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapSizeHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long HEAP_SIZE_HIGH_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeapSizeHighWaterMark() <em>Heap Size High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeapSizeHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long heapSizeHighWaterMark = HEAP_SIZE_HIGH_WATER_MARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpTime() <em>Up Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpTime()
	 * @generated
	 * @ordered
	 */
	protected static final String UP_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpTime() <em>Up Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpTime()
	 * @generated
	 * @ordered
	 */
	protected String upTime = UP_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_J2eeJVMStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_J2eeJVMStats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHeapSize() {
		return heapSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeapSize(Long newHeapSize) {
		Long oldHeapSize = heapSize;
		heapSize = newHeapSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE, oldHeapSize, heapSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHeapSizeUpperBound() {
		return heapSizeUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeapSizeUpperBound(Long newHeapSizeUpperBound) {
		Long oldHeapSizeUpperBound = heapSizeUpperBound;
		heapSizeUpperBound = newHeapSizeUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_UPPER_BOUND, oldHeapSizeUpperBound, heapSizeUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHeapSizeLowerBound() {
		return heapSizeLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeapSizeLowerBound(Long newHeapSizeLowerBound) {
		Long oldHeapSizeLowerBound = heapSizeLowerBound;
		heapSizeLowerBound = newHeapSizeLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_LOWER_BOUND, oldHeapSizeLowerBound, heapSizeLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHeapSizeLowWaterMark() {
		return heapSizeLowWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeapSizeLowWaterMark(Long newHeapSizeLowWaterMark) {
		Long oldHeapSizeLowWaterMark = heapSizeLowWaterMark;
		heapSizeLowWaterMark = newHeapSizeLowWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_LOW_WATER_MARK, oldHeapSizeLowWaterMark, heapSizeLowWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHeapSizeHighWaterMark() {
		return heapSizeHighWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeapSizeHighWaterMark(Long newHeapSizeHighWaterMark) {
		Long oldHeapSizeHighWaterMark = heapSizeHighWaterMark;
		heapSizeHighWaterMark = newHeapSizeHighWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_HIGH_WATER_MARK, oldHeapSizeHighWaterMark, heapSizeHighWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUpTime() {
		return upTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpTime(String newUpTime) {
		String oldUpTime = upTime;
		upTime = newUpTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JVM_STATS__UP_TIME, oldUpTime, upTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE:
				return getHeapSize();
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_UPPER_BOUND:
				return getHeapSizeUpperBound();
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_LOWER_BOUND:
				return getHeapSizeLowerBound();
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_LOW_WATER_MARK:
				return getHeapSizeLowWaterMark();
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_HIGH_WATER_MARK:
				return getHeapSizeHighWaterMark();
			case CimPackage.CIM_J2EE_JVM_STATS__UP_TIME:
				return getUpTime();
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
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE:
				setHeapSize((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_UPPER_BOUND:
				setHeapSizeUpperBound((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_LOWER_BOUND:
				setHeapSizeLowerBound((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_LOW_WATER_MARK:
				setHeapSizeLowWaterMark((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_HIGH_WATER_MARK:
				setHeapSizeHighWaterMark((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_JVM_STATS__UP_TIME:
				setUpTime((String)newValue);
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
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE:
				setHeapSize(HEAP_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_UPPER_BOUND:
				setHeapSizeUpperBound(HEAP_SIZE_UPPER_BOUND_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_LOWER_BOUND:
				setHeapSizeLowerBound(HEAP_SIZE_LOWER_BOUND_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_LOW_WATER_MARK:
				setHeapSizeLowWaterMark(HEAP_SIZE_LOW_WATER_MARK_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_HIGH_WATER_MARK:
				setHeapSizeHighWaterMark(HEAP_SIZE_HIGH_WATER_MARK_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_JVM_STATS__UP_TIME:
				setUpTime(UP_TIME_EDEFAULT);
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
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE:
				return HEAP_SIZE_EDEFAULT == null ? heapSize != null : !HEAP_SIZE_EDEFAULT.equals(heapSize);
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_UPPER_BOUND:
				return HEAP_SIZE_UPPER_BOUND_EDEFAULT == null ? heapSizeUpperBound != null : !HEAP_SIZE_UPPER_BOUND_EDEFAULT.equals(heapSizeUpperBound);
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_LOWER_BOUND:
				return HEAP_SIZE_LOWER_BOUND_EDEFAULT == null ? heapSizeLowerBound != null : !HEAP_SIZE_LOWER_BOUND_EDEFAULT.equals(heapSizeLowerBound);
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_LOW_WATER_MARK:
				return HEAP_SIZE_LOW_WATER_MARK_EDEFAULT == null ? heapSizeLowWaterMark != null : !HEAP_SIZE_LOW_WATER_MARK_EDEFAULT.equals(heapSizeLowWaterMark);
			case CimPackage.CIM_J2EE_JVM_STATS__HEAP_SIZE_HIGH_WATER_MARK:
				return HEAP_SIZE_HIGH_WATER_MARK_EDEFAULT == null ? heapSizeHighWaterMark != null : !HEAP_SIZE_HIGH_WATER_MARK_EDEFAULT.equals(heapSizeHighWaterMark);
			case CimPackage.CIM_J2EE_JVM_STATS__UP_TIME:
				return UP_TIME_EDEFAULT == null ? upTime != null : !UP_TIME_EDEFAULT.equals(upTime);
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
		result.append(" (HeapSize: ");
		result.append(heapSize);
		result.append(", HeapSizeUpperBound: ");
		result.append(heapSizeUpperBound);
		result.append(", HeapSizeLowerBound: ");
		result.append(heapSizeLowerBound);
		result.append(", HeapSizeLowWaterMark: ");
		result.append(heapSizeLowWaterMark);
		result.append(", HeapSizeHighWaterMark: ");
		result.append(heapSizeHighWaterMark);
		result.append(", UpTime: ");
		result.append(upTime);
		result.append(')');
		return result.toString();
	}

} //CIM_J2eeJVMStatsImpl

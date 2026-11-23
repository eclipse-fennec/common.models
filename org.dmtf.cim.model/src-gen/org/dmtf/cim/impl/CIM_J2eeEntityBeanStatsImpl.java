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

import org.dmtf.cim.CIM_J2eeEntityBeanStats;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM J2ee Entity Bean Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeEntityBeanStatsImpl#getReadyCount <em>Ready Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeEntityBeanStatsImpl#getReadyLowWaterMark <em>Ready Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeEntityBeanStatsImpl#getReadyHighWaterMark <em>Ready High Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeEntityBeanStatsImpl#getPooledCount <em>Pooled Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeEntityBeanStatsImpl#getPooledLowWaterMark <em>Pooled Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeEntityBeanStatsImpl#getPooledHighWaterMark <em>Pooled High Water Mark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_J2eeEntityBeanStatsImpl extends CIM_J2eeEJBStatsImpl implements CIM_J2eeEntityBeanStats {
	/**
	 * The default value of the '{@link #getReadyCount() <em>Ready Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadyCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long READY_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadyCount() <em>Ready Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadyCount()
	 * @generated
	 * @ordered
	 */
	protected Long readyCount = READY_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadyLowWaterMark() <em>Ready Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadyLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long READY_LOW_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadyLowWaterMark() <em>Ready Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadyLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long readyLowWaterMark = READY_LOW_WATER_MARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadyHighWaterMark() <em>Ready High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadyHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long READY_HIGH_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadyHighWaterMark() <em>Ready High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadyHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long readyHighWaterMark = READY_HIGH_WATER_MARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPooledCount() <em>Pooled Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPooledCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long POOLED_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPooledCount() <em>Pooled Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPooledCount()
	 * @generated
	 * @ordered
	 */
	protected Long pooledCount = POOLED_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPooledLowWaterMark() <em>Pooled Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPooledLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long POOLED_LOW_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPooledLowWaterMark() <em>Pooled Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPooledLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long pooledLowWaterMark = POOLED_LOW_WATER_MARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPooledHighWaterMark() <em>Pooled High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPooledHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long POOLED_HIGH_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPooledHighWaterMark() <em>Pooled High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPooledHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long pooledHighWaterMark = POOLED_HIGH_WATER_MARK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_J2eeEntityBeanStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_J2eeEntityBeanStats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReadyCount() {
		return readyCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadyCount(Long newReadyCount) {
		Long oldReadyCount = readyCount;
		readyCount = newReadyCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__READY_COUNT, oldReadyCount, readyCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReadyLowWaterMark() {
		return readyLowWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadyLowWaterMark(Long newReadyLowWaterMark) {
		Long oldReadyLowWaterMark = readyLowWaterMark;
		readyLowWaterMark = newReadyLowWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__READY_LOW_WATER_MARK, oldReadyLowWaterMark, readyLowWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReadyHighWaterMark() {
		return readyHighWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadyHighWaterMark(Long newReadyHighWaterMark) {
		Long oldReadyHighWaterMark = readyHighWaterMark;
		readyHighWaterMark = newReadyHighWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__READY_HIGH_WATER_MARK, oldReadyHighWaterMark, readyHighWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPooledCount() {
		return pooledCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPooledCount(Long newPooledCount) {
		Long oldPooledCount = pooledCount;
		pooledCount = newPooledCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__POOLED_COUNT, oldPooledCount, pooledCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPooledLowWaterMark() {
		return pooledLowWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPooledLowWaterMark(Long newPooledLowWaterMark) {
		Long oldPooledLowWaterMark = pooledLowWaterMark;
		pooledLowWaterMark = newPooledLowWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__POOLED_LOW_WATER_MARK, oldPooledLowWaterMark, pooledLowWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPooledHighWaterMark() {
		return pooledHighWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPooledHighWaterMark(Long newPooledHighWaterMark) {
		Long oldPooledHighWaterMark = pooledHighWaterMark;
		pooledHighWaterMark = newPooledHighWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__POOLED_HIGH_WATER_MARK, oldPooledHighWaterMark, pooledHighWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__READY_COUNT:
				return getReadyCount();
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__READY_LOW_WATER_MARK:
				return getReadyLowWaterMark();
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__READY_HIGH_WATER_MARK:
				return getReadyHighWaterMark();
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__POOLED_COUNT:
				return getPooledCount();
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__POOLED_LOW_WATER_MARK:
				return getPooledLowWaterMark();
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__POOLED_HIGH_WATER_MARK:
				return getPooledHighWaterMark();
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
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__READY_COUNT:
				setReadyCount((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__READY_LOW_WATER_MARK:
				setReadyLowWaterMark((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__READY_HIGH_WATER_MARK:
				setReadyHighWaterMark((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__POOLED_COUNT:
				setPooledCount((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__POOLED_LOW_WATER_MARK:
				setPooledLowWaterMark((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__POOLED_HIGH_WATER_MARK:
				setPooledHighWaterMark((Long)newValue);
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
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__READY_COUNT:
				setReadyCount(READY_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__READY_LOW_WATER_MARK:
				setReadyLowWaterMark(READY_LOW_WATER_MARK_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__READY_HIGH_WATER_MARK:
				setReadyHighWaterMark(READY_HIGH_WATER_MARK_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__POOLED_COUNT:
				setPooledCount(POOLED_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__POOLED_LOW_WATER_MARK:
				setPooledLowWaterMark(POOLED_LOW_WATER_MARK_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__POOLED_HIGH_WATER_MARK:
				setPooledHighWaterMark(POOLED_HIGH_WATER_MARK_EDEFAULT);
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
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__READY_COUNT:
				return READY_COUNT_EDEFAULT == null ? readyCount != null : !READY_COUNT_EDEFAULT.equals(readyCount);
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__READY_LOW_WATER_MARK:
				return READY_LOW_WATER_MARK_EDEFAULT == null ? readyLowWaterMark != null : !READY_LOW_WATER_MARK_EDEFAULT.equals(readyLowWaterMark);
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__READY_HIGH_WATER_MARK:
				return READY_HIGH_WATER_MARK_EDEFAULT == null ? readyHighWaterMark != null : !READY_HIGH_WATER_MARK_EDEFAULT.equals(readyHighWaterMark);
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__POOLED_COUNT:
				return POOLED_COUNT_EDEFAULT == null ? pooledCount != null : !POOLED_COUNT_EDEFAULT.equals(pooledCount);
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__POOLED_LOW_WATER_MARK:
				return POOLED_LOW_WATER_MARK_EDEFAULT == null ? pooledLowWaterMark != null : !POOLED_LOW_WATER_MARK_EDEFAULT.equals(pooledLowWaterMark);
			case CimPackage.CIM_J2EE_ENTITY_BEAN_STATS__POOLED_HIGH_WATER_MARK:
				return POOLED_HIGH_WATER_MARK_EDEFAULT == null ? pooledHighWaterMark != null : !POOLED_HIGH_WATER_MARK_EDEFAULT.equals(pooledHighWaterMark);
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
		result.append(" (ReadyCount: ");
		result.append(readyCount);
		result.append(", ReadyLowWaterMark: ");
		result.append(readyLowWaterMark);
		result.append(", ReadyHighWaterMark: ");
		result.append(readyHighWaterMark);
		result.append(", PooledCount: ");
		result.append(pooledCount);
		result.append(", PooledLowWaterMark: ");
		result.append(pooledLowWaterMark);
		result.append(", PooledHighWaterMark: ");
		result.append(pooledHighWaterMark);
		result.append(')');
		return result.toString();
	}

} //CIM_J2eeEntityBeanStatsImpl

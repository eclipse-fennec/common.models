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

import org.dmtf.cim.CIM_J2eeConnectionPoolStats;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM J2ee Connection Pool Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getCloseCount <em>Close Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getCreateCount <em>Create Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getFreePoolSize <em>Free Pool Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getFreePoolSizeUpperBound <em>Free Pool Size Upper Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getFreePoolSizeLowerBound <em>Free Pool Size Lower Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getFreePoolSizeLowWaterMark <em>Free Pool Size Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getFreePoolSizeHighWaterMark <em>Free Pool Size High Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getPoolSizeUpperBound <em>Pool Size Upper Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getPoolSizeLowerBound <em>Pool Size Lower Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getPoolSizeLowWaterMark <em>Pool Size Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getPoolSizeHighWaterMark <em>Pool Size High Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getWaitingThreadCount <em>Waiting Thread Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getWaitingThreadCountUpperBound <em>Waiting Thread Count Upper Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getWaitingThreadCountLowerBound <em>Waiting Thread Count Lower Bound</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getWaitingThreadCountLowWaterMark <em>Waiting Thread Count Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeConnectionPoolStatsImpl#getWaitingThreadCountHighWaterMark <em>Waiting Thread Count High Water Mark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_J2eeConnectionPoolStatsImpl extends CIM_J2eeConnectionStatsImpl implements CIM_J2eeConnectionPoolStats {
	/**
	 * The default value of the '{@link #getCloseCount() <em>Close Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLOSE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloseCount() <em>Close Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloseCount()
	 * @generated
	 * @ordered
	 */
	protected Long closeCount = CLOSE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreateCount() <em>Create Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long CREATE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreateCount() <em>Create Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateCount()
	 * @generated
	 * @ordered
	 */
	protected Long createCount = CREATE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreePoolSize() <em>Free Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreePoolSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long FREE_POOL_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreePoolSize() <em>Free Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreePoolSize()
	 * @generated
	 * @ordered
	 */
	protected Long freePoolSize = FREE_POOL_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreePoolSizeUpperBound() <em>Free Pool Size Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreePoolSizeUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Long FREE_POOL_SIZE_UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreePoolSizeUpperBound() <em>Free Pool Size Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreePoolSizeUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Long freePoolSizeUpperBound = FREE_POOL_SIZE_UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreePoolSizeLowerBound() <em>Free Pool Size Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreePoolSizeLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Long FREE_POOL_SIZE_LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreePoolSizeLowerBound() <em>Free Pool Size Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreePoolSizeLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Long freePoolSizeLowerBound = FREE_POOL_SIZE_LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreePoolSizeLowWaterMark() <em>Free Pool Size Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreePoolSizeLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long FREE_POOL_SIZE_LOW_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreePoolSizeLowWaterMark() <em>Free Pool Size Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreePoolSizeLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long freePoolSizeLowWaterMark = FREE_POOL_SIZE_LOW_WATER_MARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getFreePoolSizeHighWaterMark() <em>Free Pool Size High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreePoolSizeHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long FREE_POOL_SIZE_HIGH_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreePoolSizeHighWaterMark() <em>Free Pool Size High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreePoolSizeHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long freePoolSizeHighWaterMark = FREE_POOL_SIZE_HIGH_WATER_MARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoolSize() <em>Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long POOL_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoolSize() <em>Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSize()
	 * @generated
	 * @ordered
	 */
	protected Long poolSize = POOL_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoolSizeUpperBound() <em>Pool Size Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSizeUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Long POOL_SIZE_UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoolSizeUpperBound() <em>Pool Size Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSizeUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Long poolSizeUpperBound = POOL_SIZE_UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoolSizeLowerBound() <em>Pool Size Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSizeLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Long POOL_SIZE_LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoolSizeLowerBound() <em>Pool Size Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSizeLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Long poolSizeLowerBound = POOL_SIZE_LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoolSizeLowWaterMark() <em>Pool Size Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSizeLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long POOL_SIZE_LOW_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoolSizeLowWaterMark() <em>Pool Size Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSizeLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long poolSizeLowWaterMark = POOL_SIZE_LOW_WATER_MARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoolSizeHighWaterMark() <em>Pool Size High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSizeHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long POOL_SIZE_HIGH_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoolSizeHighWaterMark() <em>Pool Size High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSizeHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long poolSizeHighWaterMark = POOL_SIZE_HIGH_WATER_MARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitingThreadCount() <em>Waiting Thread Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingThreadCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long WAITING_THREAD_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitingThreadCount() <em>Waiting Thread Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingThreadCount()
	 * @generated
	 * @ordered
	 */
	protected Long waitingThreadCount = WAITING_THREAD_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitingThreadCountUpperBound() <em>Waiting Thread Count Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingThreadCountUpperBound()
	 * @generated
	 * @ordered
	 */
	protected static final Long WAITING_THREAD_COUNT_UPPER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitingThreadCountUpperBound() <em>Waiting Thread Count Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingThreadCountUpperBound()
	 * @generated
	 * @ordered
	 */
	protected Long waitingThreadCountUpperBound = WAITING_THREAD_COUNT_UPPER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitingThreadCountLowerBound() <em>Waiting Thread Count Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingThreadCountLowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final Long WAITING_THREAD_COUNT_LOWER_BOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitingThreadCountLowerBound() <em>Waiting Thread Count Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingThreadCountLowerBound()
	 * @generated
	 * @ordered
	 */
	protected Long waitingThreadCountLowerBound = WAITING_THREAD_COUNT_LOWER_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitingThreadCountLowWaterMark() <em>Waiting Thread Count Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingThreadCountLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long WAITING_THREAD_COUNT_LOW_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitingThreadCountLowWaterMark() <em>Waiting Thread Count Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingThreadCountLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long waitingThreadCountLowWaterMark = WAITING_THREAD_COUNT_LOW_WATER_MARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaitingThreadCountHighWaterMark() <em>Waiting Thread Count High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingThreadCountHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long WAITING_THREAD_COUNT_HIGH_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaitingThreadCountHighWaterMark() <em>Waiting Thread Count High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaitingThreadCountHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long waitingThreadCountHighWaterMark = WAITING_THREAD_COUNT_HIGH_WATER_MARK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_J2eeConnectionPoolStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_J2eeConnectionPoolStats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCloseCount() {
		return closeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloseCount(Long newCloseCount) {
		Long oldCloseCount = closeCount;
		closeCount = newCloseCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__CLOSE_COUNT, oldCloseCount, closeCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCreateCount() {
		return createCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreateCount(Long newCreateCount) {
		Long oldCreateCount = createCount;
		createCount = newCreateCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__CREATE_COUNT, oldCreateCount, createCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFreePoolSize() {
		return freePoolSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreePoolSize(Long newFreePoolSize) {
		Long oldFreePoolSize = freePoolSize;
		freePoolSize = newFreePoolSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE, oldFreePoolSize, freePoolSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFreePoolSizeUpperBound() {
		return freePoolSizeUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreePoolSizeUpperBound(Long newFreePoolSizeUpperBound) {
		Long oldFreePoolSizeUpperBound = freePoolSizeUpperBound;
		freePoolSizeUpperBound = newFreePoolSizeUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_UPPER_BOUND, oldFreePoolSizeUpperBound, freePoolSizeUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFreePoolSizeLowerBound() {
		return freePoolSizeLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreePoolSizeLowerBound(Long newFreePoolSizeLowerBound) {
		Long oldFreePoolSizeLowerBound = freePoolSizeLowerBound;
		freePoolSizeLowerBound = newFreePoolSizeLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_LOWER_BOUND, oldFreePoolSizeLowerBound, freePoolSizeLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFreePoolSizeLowWaterMark() {
		return freePoolSizeLowWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreePoolSizeLowWaterMark(Long newFreePoolSizeLowWaterMark) {
		Long oldFreePoolSizeLowWaterMark = freePoolSizeLowWaterMark;
		freePoolSizeLowWaterMark = newFreePoolSizeLowWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_LOW_WATER_MARK, oldFreePoolSizeLowWaterMark, freePoolSizeLowWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFreePoolSizeHighWaterMark() {
		return freePoolSizeHighWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreePoolSizeHighWaterMark(Long newFreePoolSizeHighWaterMark) {
		Long oldFreePoolSizeHighWaterMark = freePoolSizeHighWaterMark;
		freePoolSizeHighWaterMark = newFreePoolSizeHighWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_HIGH_WATER_MARK, oldFreePoolSizeHighWaterMark, freePoolSizeHighWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPoolSize() {
		return poolSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoolSize(Long newPoolSize) {
		Long oldPoolSize = poolSize;
		poolSize = newPoolSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE, oldPoolSize, poolSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPoolSizeUpperBound() {
		return poolSizeUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoolSizeUpperBound(Long newPoolSizeUpperBound) {
		Long oldPoolSizeUpperBound = poolSizeUpperBound;
		poolSizeUpperBound = newPoolSizeUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_UPPER_BOUND, oldPoolSizeUpperBound, poolSizeUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPoolSizeLowerBound() {
		return poolSizeLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoolSizeLowerBound(Long newPoolSizeLowerBound) {
		Long oldPoolSizeLowerBound = poolSizeLowerBound;
		poolSizeLowerBound = newPoolSizeLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_LOWER_BOUND, oldPoolSizeLowerBound, poolSizeLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPoolSizeLowWaterMark() {
		return poolSizeLowWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoolSizeLowWaterMark(Long newPoolSizeLowWaterMark) {
		Long oldPoolSizeLowWaterMark = poolSizeLowWaterMark;
		poolSizeLowWaterMark = newPoolSizeLowWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_LOW_WATER_MARK, oldPoolSizeLowWaterMark, poolSizeLowWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPoolSizeHighWaterMark() {
		return poolSizeHighWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoolSizeHighWaterMark(Long newPoolSizeHighWaterMark) {
		Long oldPoolSizeHighWaterMark = poolSizeHighWaterMark;
		poolSizeHighWaterMark = newPoolSizeHighWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_HIGH_WATER_MARK, oldPoolSizeHighWaterMark, poolSizeHighWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWaitingThreadCount() {
		return waitingThreadCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaitingThreadCount(Long newWaitingThreadCount) {
		Long oldWaitingThreadCount = waitingThreadCount;
		waitingThreadCount = newWaitingThreadCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT, oldWaitingThreadCount, waitingThreadCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWaitingThreadCountUpperBound() {
		return waitingThreadCountUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaitingThreadCountUpperBound(Long newWaitingThreadCountUpperBound) {
		Long oldWaitingThreadCountUpperBound = waitingThreadCountUpperBound;
		waitingThreadCountUpperBound = newWaitingThreadCountUpperBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_UPPER_BOUND, oldWaitingThreadCountUpperBound, waitingThreadCountUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWaitingThreadCountLowerBound() {
		return waitingThreadCountLowerBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaitingThreadCountLowerBound(Long newWaitingThreadCountLowerBound) {
		Long oldWaitingThreadCountLowerBound = waitingThreadCountLowerBound;
		waitingThreadCountLowerBound = newWaitingThreadCountLowerBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_LOWER_BOUND, oldWaitingThreadCountLowerBound, waitingThreadCountLowerBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWaitingThreadCountLowWaterMark() {
		return waitingThreadCountLowWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaitingThreadCountLowWaterMark(Long newWaitingThreadCountLowWaterMark) {
		Long oldWaitingThreadCountLowWaterMark = waitingThreadCountLowWaterMark;
		waitingThreadCountLowWaterMark = newWaitingThreadCountLowWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_LOW_WATER_MARK, oldWaitingThreadCountLowWaterMark, waitingThreadCountLowWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getWaitingThreadCountHighWaterMark() {
		return waitingThreadCountHighWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaitingThreadCountHighWaterMark(Long newWaitingThreadCountHighWaterMark) {
		Long oldWaitingThreadCountHighWaterMark = waitingThreadCountHighWaterMark;
		waitingThreadCountHighWaterMark = newWaitingThreadCountHighWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_HIGH_WATER_MARK, oldWaitingThreadCountHighWaterMark, waitingThreadCountHighWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__CLOSE_COUNT:
				return getCloseCount();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__CREATE_COUNT:
				return getCreateCount();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE:
				return getFreePoolSize();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_UPPER_BOUND:
				return getFreePoolSizeUpperBound();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_LOWER_BOUND:
				return getFreePoolSizeLowerBound();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_LOW_WATER_MARK:
				return getFreePoolSizeLowWaterMark();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_HIGH_WATER_MARK:
				return getFreePoolSizeHighWaterMark();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE:
				return getPoolSize();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_UPPER_BOUND:
				return getPoolSizeUpperBound();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_LOWER_BOUND:
				return getPoolSizeLowerBound();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_LOW_WATER_MARK:
				return getPoolSizeLowWaterMark();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_HIGH_WATER_MARK:
				return getPoolSizeHighWaterMark();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT:
				return getWaitingThreadCount();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_UPPER_BOUND:
				return getWaitingThreadCountUpperBound();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_LOWER_BOUND:
				return getWaitingThreadCountLowerBound();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_LOW_WATER_MARK:
				return getWaitingThreadCountLowWaterMark();
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_HIGH_WATER_MARK:
				return getWaitingThreadCountHighWaterMark();
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
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__CLOSE_COUNT:
				setCloseCount((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__CREATE_COUNT:
				setCreateCount((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE:
				setFreePoolSize((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_UPPER_BOUND:
				setFreePoolSizeUpperBound((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_LOWER_BOUND:
				setFreePoolSizeLowerBound((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_LOW_WATER_MARK:
				setFreePoolSizeLowWaterMark((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_HIGH_WATER_MARK:
				setFreePoolSizeHighWaterMark((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE:
				setPoolSize((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_UPPER_BOUND:
				setPoolSizeUpperBound((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_LOWER_BOUND:
				setPoolSizeLowerBound((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_LOW_WATER_MARK:
				setPoolSizeLowWaterMark((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_HIGH_WATER_MARK:
				setPoolSizeHighWaterMark((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT:
				setWaitingThreadCount((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_UPPER_BOUND:
				setWaitingThreadCountUpperBound((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_LOWER_BOUND:
				setWaitingThreadCountLowerBound((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_LOW_WATER_MARK:
				setWaitingThreadCountLowWaterMark((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_HIGH_WATER_MARK:
				setWaitingThreadCountHighWaterMark((Long)newValue);
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
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__CLOSE_COUNT:
				setCloseCount(CLOSE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__CREATE_COUNT:
				setCreateCount(CREATE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE:
				setFreePoolSize(FREE_POOL_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_UPPER_BOUND:
				setFreePoolSizeUpperBound(FREE_POOL_SIZE_UPPER_BOUND_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_LOWER_BOUND:
				setFreePoolSizeLowerBound(FREE_POOL_SIZE_LOWER_BOUND_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_LOW_WATER_MARK:
				setFreePoolSizeLowWaterMark(FREE_POOL_SIZE_LOW_WATER_MARK_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_HIGH_WATER_MARK:
				setFreePoolSizeHighWaterMark(FREE_POOL_SIZE_HIGH_WATER_MARK_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE:
				setPoolSize(POOL_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_UPPER_BOUND:
				setPoolSizeUpperBound(POOL_SIZE_UPPER_BOUND_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_LOWER_BOUND:
				setPoolSizeLowerBound(POOL_SIZE_LOWER_BOUND_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_LOW_WATER_MARK:
				setPoolSizeLowWaterMark(POOL_SIZE_LOW_WATER_MARK_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_HIGH_WATER_MARK:
				setPoolSizeHighWaterMark(POOL_SIZE_HIGH_WATER_MARK_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT:
				setWaitingThreadCount(WAITING_THREAD_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_UPPER_BOUND:
				setWaitingThreadCountUpperBound(WAITING_THREAD_COUNT_UPPER_BOUND_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_LOWER_BOUND:
				setWaitingThreadCountLowerBound(WAITING_THREAD_COUNT_LOWER_BOUND_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_LOW_WATER_MARK:
				setWaitingThreadCountLowWaterMark(WAITING_THREAD_COUNT_LOW_WATER_MARK_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_HIGH_WATER_MARK:
				setWaitingThreadCountHighWaterMark(WAITING_THREAD_COUNT_HIGH_WATER_MARK_EDEFAULT);
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
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__CLOSE_COUNT:
				return CLOSE_COUNT_EDEFAULT == null ? closeCount != null : !CLOSE_COUNT_EDEFAULT.equals(closeCount);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__CREATE_COUNT:
				return CREATE_COUNT_EDEFAULT == null ? createCount != null : !CREATE_COUNT_EDEFAULT.equals(createCount);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE:
				return FREE_POOL_SIZE_EDEFAULT == null ? freePoolSize != null : !FREE_POOL_SIZE_EDEFAULT.equals(freePoolSize);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_UPPER_BOUND:
				return FREE_POOL_SIZE_UPPER_BOUND_EDEFAULT == null ? freePoolSizeUpperBound != null : !FREE_POOL_SIZE_UPPER_BOUND_EDEFAULT.equals(freePoolSizeUpperBound);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_LOWER_BOUND:
				return FREE_POOL_SIZE_LOWER_BOUND_EDEFAULT == null ? freePoolSizeLowerBound != null : !FREE_POOL_SIZE_LOWER_BOUND_EDEFAULT.equals(freePoolSizeLowerBound);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_LOW_WATER_MARK:
				return FREE_POOL_SIZE_LOW_WATER_MARK_EDEFAULT == null ? freePoolSizeLowWaterMark != null : !FREE_POOL_SIZE_LOW_WATER_MARK_EDEFAULT.equals(freePoolSizeLowWaterMark);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__FREE_POOL_SIZE_HIGH_WATER_MARK:
				return FREE_POOL_SIZE_HIGH_WATER_MARK_EDEFAULT == null ? freePoolSizeHighWaterMark != null : !FREE_POOL_SIZE_HIGH_WATER_MARK_EDEFAULT.equals(freePoolSizeHighWaterMark);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE:
				return POOL_SIZE_EDEFAULT == null ? poolSize != null : !POOL_SIZE_EDEFAULT.equals(poolSize);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_UPPER_BOUND:
				return POOL_SIZE_UPPER_BOUND_EDEFAULT == null ? poolSizeUpperBound != null : !POOL_SIZE_UPPER_BOUND_EDEFAULT.equals(poolSizeUpperBound);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_LOWER_BOUND:
				return POOL_SIZE_LOWER_BOUND_EDEFAULT == null ? poolSizeLowerBound != null : !POOL_SIZE_LOWER_BOUND_EDEFAULT.equals(poolSizeLowerBound);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_LOW_WATER_MARK:
				return POOL_SIZE_LOW_WATER_MARK_EDEFAULT == null ? poolSizeLowWaterMark != null : !POOL_SIZE_LOW_WATER_MARK_EDEFAULT.equals(poolSizeLowWaterMark);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__POOL_SIZE_HIGH_WATER_MARK:
				return POOL_SIZE_HIGH_WATER_MARK_EDEFAULT == null ? poolSizeHighWaterMark != null : !POOL_SIZE_HIGH_WATER_MARK_EDEFAULT.equals(poolSizeHighWaterMark);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT:
				return WAITING_THREAD_COUNT_EDEFAULT == null ? waitingThreadCount != null : !WAITING_THREAD_COUNT_EDEFAULT.equals(waitingThreadCount);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_UPPER_BOUND:
				return WAITING_THREAD_COUNT_UPPER_BOUND_EDEFAULT == null ? waitingThreadCountUpperBound != null : !WAITING_THREAD_COUNT_UPPER_BOUND_EDEFAULT.equals(waitingThreadCountUpperBound);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_LOWER_BOUND:
				return WAITING_THREAD_COUNT_LOWER_BOUND_EDEFAULT == null ? waitingThreadCountLowerBound != null : !WAITING_THREAD_COUNT_LOWER_BOUND_EDEFAULT.equals(waitingThreadCountLowerBound);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_LOW_WATER_MARK:
				return WAITING_THREAD_COUNT_LOW_WATER_MARK_EDEFAULT == null ? waitingThreadCountLowWaterMark != null : !WAITING_THREAD_COUNT_LOW_WATER_MARK_EDEFAULT.equals(waitingThreadCountLowWaterMark);
			case CimPackage.CIM_J2EE_CONNECTION_POOL_STATS__WAITING_THREAD_COUNT_HIGH_WATER_MARK:
				return WAITING_THREAD_COUNT_HIGH_WATER_MARK_EDEFAULT == null ? waitingThreadCountHighWaterMark != null : !WAITING_THREAD_COUNT_HIGH_WATER_MARK_EDEFAULT.equals(waitingThreadCountHighWaterMark);
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
		result.append(" (CloseCount: ");
		result.append(closeCount);
		result.append(", CreateCount: ");
		result.append(createCount);
		result.append(", FreePoolSize: ");
		result.append(freePoolSize);
		result.append(", FreePoolSizeUpperBound: ");
		result.append(freePoolSizeUpperBound);
		result.append(", FreePoolSizeLowerBound: ");
		result.append(freePoolSizeLowerBound);
		result.append(", FreePoolSizeLowWaterMark: ");
		result.append(freePoolSizeLowWaterMark);
		result.append(", FreePoolSizeHighWaterMark: ");
		result.append(freePoolSizeHighWaterMark);
		result.append(", PoolSize: ");
		result.append(poolSize);
		result.append(", PoolSizeUpperBound: ");
		result.append(poolSizeUpperBound);
		result.append(", PoolSizeLowerBound: ");
		result.append(poolSizeLowerBound);
		result.append(", PoolSizeLowWaterMark: ");
		result.append(poolSizeLowWaterMark);
		result.append(", PoolSizeHighWaterMark: ");
		result.append(poolSizeHighWaterMark);
		result.append(", WaitingThreadCount: ");
		result.append(waitingThreadCount);
		result.append(", WaitingThreadCountUpperBound: ");
		result.append(waitingThreadCountUpperBound);
		result.append(", WaitingThreadCountLowerBound: ");
		result.append(waitingThreadCountLowerBound);
		result.append(", WaitingThreadCountLowWaterMark: ");
		result.append(waitingThreadCountLowWaterMark);
		result.append(", WaitingThreadCountHighWaterMark: ");
		result.append(waitingThreadCountHighWaterMark);
		result.append(')');
		return result.toString();
	}

} //CIM_J2eeConnectionPoolStatsImpl

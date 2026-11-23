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

import org.dmtf.cim.CIM_J2eeJTAStats;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM J2ee JTA Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJTAStatsImpl#getActiveCount <em>Active Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJTAStatsImpl#getCommittedCount <em>Committed Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeJTAStatsImpl#getRolledbackCount <em>Rolledback Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_J2eeJTAStatsImpl extends CIM_J2eeStatisticImpl implements CIM_J2eeJTAStats {
	/**
	 * The default value of the '{@link #getActiveCount() <em>Active Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long ACTIVE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiveCount() <em>Active Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveCount()
	 * @generated
	 * @ordered
	 */
	protected Long activeCount = ACTIVE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommittedCount() <em>Committed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommittedCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long COMMITTED_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommittedCount() <em>Committed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommittedCount()
	 * @generated
	 * @ordered
	 */
	protected Long committedCount = COMMITTED_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRolledbackCount() <em>Rolledback Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolledbackCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long ROLLEDBACK_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRolledbackCount() <em>Rolledback Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolledbackCount()
	 * @generated
	 * @ordered
	 */
	protected Long rolledbackCount = ROLLEDBACK_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_J2eeJTAStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_J2eeJTAStats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getActiveCount() {
		return activeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveCount(Long newActiveCount) {
		Long oldActiveCount = activeCount;
		activeCount = newActiveCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JTA_STATS__ACTIVE_COUNT, oldActiveCount, activeCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCommittedCount() {
		return committedCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommittedCount(Long newCommittedCount) {
		Long oldCommittedCount = committedCount;
		committedCount = newCommittedCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JTA_STATS__COMMITTED_COUNT, oldCommittedCount, committedCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRolledbackCount() {
		return rolledbackCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRolledbackCount(Long newRolledbackCount) {
		Long oldRolledbackCount = rolledbackCount;
		rolledbackCount = newRolledbackCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_JTA_STATS__ROLLEDBACK_COUNT, oldRolledbackCount, rolledbackCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_J2EE_JTA_STATS__ACTIVE_COUNT:
				return getActiveCount();
			case CimPackage.CIM_J2EE_JTA_STATS__COMMITTED_COUNT:
				return getCommittedCount();
			case CimPackage.CIM_J2EE_JTA_STATS__ROLLEDBACK_COUNT:
				return getRolledbackCount();
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
			case CimPackage.CIM_J2EE_JTA_STATS__ACTIVE_COUNT:
				setActiveCount((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_JTA_STATS__COMMITTED_COUNT:
				setCommittedCount((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_JTA_STATS__ROLLEDBACK_COUNT:
				setRolledbackCount((Long)newValue);
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
			case CimPackage.CIM_J2EE_JTA_STATS__ACTIVE_COUNT:
				setActiveCount(ACTIVE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_JTA_STATS__COMMITTED_COUNT:
				setCommittedCount(COMMITTED_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_JTA_STATS__ROLLEDBACK_COUNT:
				setRolledbackCount(ROLLEDBACK_COUNT_EDEFAULT);
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
			case CimPackage.CIM_J2EE_JTA_STATS__ACTIVE_COUNT:
				return ACTIVE_COUNT_EDEFAULT == null ? activeCount != null : !ACTIVE_COUNT_EDEFAULT.equals(activeCount);
			case CimPackage.CIM_J2EE_JTA_STATS__COMMITTED_COUNT:
				return COMMITTED_COUNT_EDEFAULT == null ? committedCount != null : !COMMITTED_COUNT_EDEFAULT.equals(committedCount);
			case CimPackage.CIM_J2EE_JTA_STATS__ROLLEDBACK_COUNT:
				return ROLLEDBACK_COUNT_EDEFAULT == null ? rolledbackCount != null : !ROLLEDBACK_COUNT_EDEFAULT.equals(rolledbackCount);
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
		result.append(" (ActiveCount: ");
		result.append(activeCount);
		result.append(", CommittedCount: ");
		result.append(committedCount);
		result.append(", RolledbackCount: ");
		result.append(rolledbackCount);
		result.append(')');
		return result.toString();
	}

} //CIM_J2eeJTAStatsImpl

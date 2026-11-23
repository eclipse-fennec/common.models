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

import org.dmtf.cim.CIM_J2eeStatefulSessionBeanStats;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM J2ee Stateful Session Bean Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeStatefulSessionBeanStatsImpl#getPassiveCount <em>Passive Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeStatefulSessionBeanStatsImpl#getPassiveLowWaterMark <em>Passive Low Water Mark</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeStatefulSessionBeanStatsImpl#getPassiveHighWaterMark <em>Passive High Water Mark</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_J2eeStatefulSessionBeanStatsImpl extends CIM_J2eeSessionBeanStatsImpl implements CIM_J2eeStatefulSessionBeanStats {
	/**
	 * The default value of the '{@link #getPassiveCount() <em>Passive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long PASSIVE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassiveCount() <em>Passive Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveCount()
	 * @generated
	 * @ordered
	 */
	protected Long passiveCount = PASSIVE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassiveLowWaterMark() <em>Passive Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long PASSIVE_LOW_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassiveLowWaterMark() <em>Passive Low Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveLowWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long passiveLowWaterMark = PASSIVE_LOW_WATER_MARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassiveHighWaterMark() <em>Passive High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected static final Long PASSIVE_HIGH_WATER_MARK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassiveHighWaterMark() <em>Passive High Water Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassiveHighWaterMark()
	 * @generated
	 * @ordered
	 */
	protected Long passiveHighWaterMark = PASSIVE_HIGH_WATER_MARK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_J2eeStatefulSessionBeanStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_J2eeStatefulSessionBeanStats();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPassiveCount() {
		return passiveCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassiveCount(Long newPassiveCount) {
		Long oldPassiveCount = passiveCount;
		passiveCount = newPassiveCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS__PASSIVE_COUNT, oldPassiveCount, passiveCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPassiveLowWaterMark() {
		return passiveLowWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassiveLowWaterMark(Long newPassiveLowWaterMark) {
		Long oldPassiveLowWaterMark = passiveLowWaterMark;
		passiveLowWaterMark = newPassiveLowWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS__PASSIVE_LOW_WATER_MARK, oldPassiveLowWaterMark, passiveLowWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPassiveHighWaterMark() {
		return passiveHighWaterMark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassiveHighWaterMark(Long newPassiveHighWaterMark) {
		Long oldPassiveHighWaterMark = passiveHighWaterMark;
		passiveHighWaterMark = newPassiveHighWaterMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS__PASSIVE_HIGH_WATER_MARK, oldPassiveHighWaterMark, passiveHighWaterMark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS__PASSIVE_COUNT:
				return getPassiveCount();
			case CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS__PASSIVE_LOW_WATER_MARK:
				return getPassiveLowWaterMark();
			case CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS__PASSIVE_HIGH_WATER_MARK:
				return getPassiveHighWaterMark();
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
			case CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS__PASSIVE_COUNT:
				setPassiveCount((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS__PASSIVE_LOW_WATER_MARK:
				setPassiveLowWaterMark((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS__PASSIVE_HIGH_WATER_MARK:
				setPassiveHighWaterMark((Long)newValue);
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
			case CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS__PASSIVE_COUNT:
				setPassiveCount(PASSIVE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS__PASSIVE_LOW_WATER_MARK:
				setPassiveLowWaterMark(PASSIVE_LOW_WATER_MARK_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS__PASSIVE_HIGH_WATER_MARK:
				setPassiveHighWaterMark(PASSIVE_HIGH_WATER_MARK_EDEFAULT);
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
			case CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS__PASSIVE_COUNT:
				return PASSIVE_COUNT_EDEFAULT == null ? passiveCount != null : !PASSIVE_COUNT_EDEFAULT.equals(passiveCount);
			case CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS__PASSIVE_LOW_WATER_MARK:
				return PASSIVE_LOW_WATER_MARK_EDEFAULT == null ? passiveLowWaterMark != null : !PASSIVE_LOW_WATER_MARK_EDEFAULT.equals(passiveLowWaterMark);
			case CimPackage.CIM_J2EE_STATEFUL_SESSION_BEAN_STATS__PASSIVE_HIGH_WATER_MARK:
				return PASSIVE_HIGH_WATER_MARK_EDEFAULT == null ? passiveHighWaterMark != null : !PASSIVE_HIGH_WATER_MARK_EDEFAULT.equals(passiveHighWaterMark);
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
		result.append(" (PassiveCount: ");
		result.append(passiveCount);
		result.append(", PassiveLowWaterMark: ");
		result.append(passiveLowWaterMark);
		result.append(", PassiveHighWaterMark: ");
		result.append(passiveHighWaterMark);
		result.append(')');
		return result.toString();
	}

} //CIM_J2eeStatefulSessionBeanStatsImpl

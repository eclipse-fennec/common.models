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

import org.dmtf.cim.CIM_J2eeEJBStats;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM J2ee EJB Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeEJBStatsImpl#getCreateCount <em>Create Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_J2eeEJBStatsImpl#getRemoveCount <em>Remove Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_J2eeEJBStatsImpl extends CIM_J2eeStatisticImpl implements CIM_J2eeEJBStats {
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
	 * The default value of the '{@link #getRemoveCount() <em>Remove Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long REMOVE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoveCount() <em>Remove Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveCount()
	 * @generated
	 * @ordered
	 */
	protected Long removeCount = REMOVE_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_J2eeEJBStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_J2eeEJBStats();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_EJB_STATS__CREATE_COUNT, oldCreateCount, createCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRemoveCount() {
		return removeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveCount(Long newRemoveCount) {
		Long oldRemoveCount = removeCount;
		removeCount = newRemoveCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_J2EE_EJB_STATS__REMOVE_COUNT, oldRemoveCount, removeCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_J2EE_EJB_STATS__CREATE_COUNT:
				return getCreateCount();
			case CimPackage.CIM_J2EE_EJB_STATS__REMOVE_COUNT:
				return getRemoveCount();
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
			case CimPackage.CIM_J2EE_EJB_STATS__CREATE_COUNT:
				setCreateCount((Long)newValue);
				return;
			case CimPackage.CIM_J2EE_EJB_STATS__REMOVE_COUNT:
				setRemoveCount((Long)newValue);
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
			case CimPackage.CIM_J2EE_EJB_STATS__CREATE_COUNT:
				setCreateCount(CREATE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_J2EE_EJB_STATS__REMOVE_COUNT:
				setRemoveCount(REMOVE_COUNT_EDEFAULT);
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
			case CimPackage.CIM_J2EE_EJB_STATS__CREATE_COUNT:
				return CREATE_COUNT_EDEFAULT == null ? createCount != null : !CREATE_COUNT_EDEFAULT.equals(createCount);
			case CimPackage.CIM_J2EE_EJB_STATS__REMOVE_COUNT:
				return REMOVE_COUNT_EDEFAULT == null ? removeCount != null : !REMOVE_COUNT_EDEFAULT.equals(removeCount);
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
		result.append(" (CreateCount: ");
		result.append(createCount);
		result.append(", RemoveCount: ");
		result.append(removeCount);
		result.append(')');
		return result.toString();
	}

} //CIM_J2eeEJBStatsImpl

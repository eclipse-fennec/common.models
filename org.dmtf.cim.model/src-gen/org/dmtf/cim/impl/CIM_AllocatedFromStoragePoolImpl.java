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

import org.dmtf.cim.CIM_AllocatedFromStoragePool;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Allocated From Storage Pool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocatedFromStoragePoolImpl#getSpaceConsumed <em>Space Consumed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocatedFromStoragePoolImpl#getSpaceLimit <em>Space Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocatedFromStoragePoolImpl#getSpaceLimitWarningThreshold <em>Space Limit Warning Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AllocatedFromStoragePoolImpl extends CIM_ElementAllocatedFromPoolImpl implements CIM_AllocatedFromStoragePool {
	/**
	 * The default value of the '{@link #getSpaceConsumed() <em>Space Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceConsumed()
	 * @generated
	 * @ordered
	 */
	protected static final Long SPACE_CONSUMED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpaceConsumed() <em>Space Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceConsumed()
	 * @generated
	 * @ordered
	 */
	protected Long spaceConsumed = SPACE_CONSUMED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceLimit() <em>Space Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Long SPACE_LIMIT_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getSpaceLimit() <em>Space Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimit()
	 * @generated
	 * @ordered
	 */
	protected Long spaceLimit = SPACE_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceLimitWarningThreshold() <em>Space Limit Warning Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimitWarningThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SPACE_LIMIT_WARNING_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpaceLimitWarningThreshold() <em>Space Limit Warning Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimitWarningThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer spaceLimitWarningThreshold = SPACE_LIMIT_WARNING_THRESHOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AllocatedFromStoragePoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AllocatedFromStoragePool();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSpaceConsumed() {
		return spaceConsumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaceConsumed(Long newSpaceConsumed) {
		Long oldSpaceConsumed = spaceConsumed;
		spaceConsumed = newSpaceConsumed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL__SPACE_CONSUMED, oldSpaceConsumed, spaceConsumed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSpaceLimit() {
		return spaceLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaceLimit(Long newSpaceLimit) {
		Long oldSpaceLimit = spaceLimit;
		spaceLimit = newSpaceLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL__SPACE_LIMIT, oldSpaceLimit, spaceLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSpaceLimitWarningThreshold() {
		return spaceLimitWarningThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaceLimitWarningThreshold(Integer newSpaceLimitWarningThreshold) {
		Integer oldSpaceLimitWarningThreshold = spaceLimitWarningThreshold;
		spaceLimitWarningThreshold = newSpaceLimitWarningThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL__SPACE_LIMIT_WARNING_THRESHOLD, oldSpaceLimitWarningThreshold, spaceLimitWarningThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL__SPACE_CONSUMED:
				return getSpaceConsumed();
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL__SPACE_LIMIT:
				return getSpaceLimit();
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL__SPACE_LIMIT_WARNING_THRESHOLD:
				return getSpaceLimitWarningThreshold();
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
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL__SPACE_CONSUMED:
				setSpaceConsumed((Long)newValue);
				return;
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL__SPACE_LIMIT:
				setSpaceLimit((Long)newValue);
				return;
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL__SPACE_LIMIT_WARNING_THRESHOLD:
				setSpaceLimitWarningThreshold((Integer)newValue);
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
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL__SPACE_CONSUMED:
				setSpaceConsumed(SPACE_CONSUMED_EDEFAULT);
				return;
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL__SPACE_LIMIT:
				setSpaceLimit(SPACE_LIMIT_EDEFAULT);
				return;
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL__SPACE_LIMIT_WARNING_THRESHOLD:
				setSpaceLimitWarningThreshold(SPACE_LIMIT_WARNING_THRESHOLD_EDEFAULT);
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
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL__SPACE_CONSUMED:
				return SPACE_CONSUMED_EDEFAULT == null ? spaceConsumed != null : !SPACE_CONSUMED_EDEFAULT.equals(spaceConsumed);
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL__SPACE_LIMIT:
				return SPACE_LIMIT_EDEFAULT == null ? spaceLimit != null : !SPACE_LIMIT_EDEFAULT.equals(spaceLimit);
			case CimPackage.CIM_ALLOCATED_FROM_STORAGE_POOL__SPACE_LIMIT_WARNING_THRESHOLD:
				return SPACE_LIMIT_WARNING_THRESHOLD_EDEFAULT == null ? spaceLimitWarningThreshold != null : !SPACE_LIMIT_WARNING_THRESHOLD_EDEFAULT.equals(spaceLimitWarningThreshold);
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
		result.append(" (SpaceConsumed: ");
		result.append(spaceConsumed);
		result.append(", SpaceLimit: ");
		result.append(spaceLimit);
		result.append(", SpaceLimitWarningThreshold: ");
		result.append(spaceLimitWarningThreshold);
		result.append(')');
		return result.toString();
	}

} //CIM_AllocatedFromStoragePoolImpl

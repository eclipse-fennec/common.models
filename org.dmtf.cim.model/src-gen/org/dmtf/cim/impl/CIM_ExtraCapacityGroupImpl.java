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

import org.dmtf.cim.CIM_ExtraCapacityGroup;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Extra Capacity Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExtraCapacityGroupImpl#getMinNumberNeeded <em>Min Number Needed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExtraCapacityGroupImpl#getLoadBalancedGroup <em>Load Balanced Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ExtraCapacityGroupImpl extends CIM_RedundancyGroupImpl implements CIM_ExtraCapacityGroup {
	/**
	 * The default value of the '{@link #getMinNumberNeeded() <em>Min Number Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNumberNeeded()
	 * @generated
	 * @ordered
	 */
	protected static final Long MIN_NUMBER_NEEDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinNumberNeeded() <em>Min Number Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinNumberNeeded()
	 * @generated
	 * @ordered
	 */
	protected Long minNumberNeeded = MIN_NUMBER_NEEDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadBalancedGroup() <em>Load Balanced Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancedGroup()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LOAD_BALANCED_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadBalancedGroup() <em>Load Balanced Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancedGroup()
	 * @generated
	 * @ordered
	 */
	protected Boolean loadBalancedGroup = LOAD_BALANCED_GROUP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ExtraCapacityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ExtraCapacityGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMinNumberNeeded() {
		return minNumberNeeded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinNumberNeeded(Long newMinNumberNeeded) {
		Long oldMinNumberNeeded = minNumberNeeded;
		minNumberNeeded = newMinNumberNeeded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXTRA_CAPACITY_GROUP__MIN_NUMBER_NEEDED, oldMinNumberNeeded, minNumberNeeded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLoadBalancedGroup() {
		return loadBalancedGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoadBalancedGroup(Boolean newLoadBalancedGroup) {
		Boolean oldLoadBalancedGroup = loadBalancedGroup;
		loadBalancedGroup = newLoadBalancedGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_EXTRA_CAPACITY_GROUP__LOAD_BALANCED_GROUP, oldLoadBalancedGroup, loadBalancedGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_EXTRA_CAPACITY_GROUP__MIN_NUMBER_NEEDED:
				return getMinNumberNeeded();
			case CimPackage.CIM_EXTRA_CAPACITY_GROUP__LOAD_BALANCED_GROUP:
				return getLoadBalancedGroup();
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
			case CimPackage.CIM_EXTRA_CAPACITY_GROUP__MIN_NUMBER_NEEDED:
				setMinNumberNeeded((Long)newValue);
				return;
			case CimPackage.CIM_EXTRA_CAPACITY_GROUP__LOAD_BALANCED_GROUP:
				setLoadBalancedGroup((Boolean)newValue);
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
			case CimPackage.CIM_EXTRA_CAPACITY_GROUP__MIN_NUMBER_NEEDED:
				setMinNumberNeeded(MIN_NUMBER_NEEDED_EDEFAULT);
				return;
			case CimPackage.CIM_EXTRA_CAPACITY_GROUP__LOAD_BALANCED_GROUP:
				setLoadBalancedGroup(LOAD_BALANCED_GROUP_EDEFAULT);
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
			case CimPackage.CIM_EXTRA_CAPACITY_GROUP__MIN_NUMBER_NEEDED:
				return MIN_NUMBER_NEEDED_EDEFAULT == null ? minNumberNeeded != null : !MIN_NUMBER_NEEDED_EDEFAULT.equals(minNumberNeeded);
			case CimPackage.CIM_EXTRA_CAPACITY_GROUP__LOAD_BALANCED_GROUP:
				return LOAD_BALANCED_GROUP_EDEFAULT == null ? loadBalancedGroup != null : !LOAD_BALANCED_GROUP_EDEFAULT.equals(loadBalancedGroup);
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
		result.append(" (MinNumberNeeded: ");
		result.append(minNumberNeeded);
		result.append(", LoadBalancedGroup: ");
		result.append(loadBalancedGroup);
		result.append(')');
		return result.toString();
	}

} //CIM_ExtraCapacityGroupImpl

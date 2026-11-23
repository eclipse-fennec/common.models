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

import org.dmtf.cim.CIM_QueueAllocation;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Queue Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_QueueAllocationImpl#getAllocationPercentage <em>Allocation Percentage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_QueueAllocationImpl extends CIM_DependencyImpl implements CIM_QueueAllocation {
	/**
	 * The default value of the '{@link #getAllocationPercentage() <em>Allocation Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALLOCATION_PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllocationPercentage() <em>Allocation Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationPercentage()
	 * @generated
	 * @ordered
	 */
	protected Integer allocationPercentage = ALLOCATION_PERCENTAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_QueueAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_QueueAllocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAllocationPercentage() {
		return allocationPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocationPercentage(Integer newAllocationPercentage) {
		Integer oldAllocationPercentage = allocationPercentage;
		allocationPercentage = newAllocationPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_QUEUE_ALLOCATION__ALLOCATION_PERCENTAGE, oldAllocationPercentage, allocationPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_QUEUE_ALLOCATION__ALLOCATION_PERCENTAGE:
				return getAllocationPercentage();
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
			case CimPackage.CIM_QUEUE_ALLOCATION__ALLOCATION_PERCENTAGE:
				setAllocationPercentage((Integer)newValue);
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
			case CimPackage.CIM_QUEUE_ALLOCATION__ALLOCATION_PERCENTAGE:
				setAllocationPercentage(ALLOCATION_PERCENTAGE_EDEFAULT);
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
			case CimPackage.CIM_QUEUE_ALLOCATION__ALLOCATION_PERCENTAGE:
				return ALLOCATION_PERCENTAGE_EDEFAULT == null ? allocationPercentage != null : !ALLOCATION_PERCENTAGE_EDEFAULT.equals(allocationPercentage);
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
		result.append(" (AllocationPercentage: ");
		result.append(allocationPercentage);
		result.append(')');
		return result.toString();
	}

} //CIM_QueueAllocationImpl

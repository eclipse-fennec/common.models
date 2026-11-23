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

import org.dmtf.cim.CIM_AllocatedLogicalElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Allocated Logical Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AllocatedLogicalElementImpl#getAllocationState <em>Allocation State</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_AllocatedLogicalElementImpl extends CIM_EnabledLogicalElementImpl implements CIM_AllocatedLogicalElement {
	/**
	 * The default value of the '{@link #getAllocationState() <em>Allocation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationState()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOCATION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllocationState() <em>Allocation State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationState()
	 * @generated
	 * @ordered
	 */
	protected String allocationState = ALLOCATION_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AllocatedLogicalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AllocatedLogicalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllocationState() {
		return allocationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocationState(String newAllocationState) {
		String oldAllocationState = allocationState;
		allocationState = newAllocationState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ALLOCATED_LOGICAL_ELEMENT__ALLOCATION_STATE, oldAllocationState, allocationState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ALLOCATED_LOGICAL_ELEMENT__ALLOCATION_STATE:
				return getAllocationState();
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
			case CimPackage.CIM_ALLOCATED_LOGICAL_ELEMENT__ALLOCATION_STATE:
				setAllocationState((String)newValue);
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
			case CimPackage.CIM_ALLOCATED_LOGICAL_ELEMENT__ALLOCATION_STATE:
				setAllocationState(ALLOCATION_STATE_EDEFAULT);
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
			case CimPackage.CIM_ALLOCATED_LOGICAL_ELEMENT__ALLOCATION_STATE:
				return ALLOCATION_STATE_EDEFAULT == null ? allocationState != null : !ALLOCATION_STATE_EDEFAULT.equals(allocationState);
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
		result.append(" (AllocationState: ");
		result.append(allocationState);
		result.append(')');
		return result.toString();
	}

} //CIM_AllocatedLogicalElementImpl

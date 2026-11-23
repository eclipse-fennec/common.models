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

import org.dmtf.cim.CIM_InitiatorMaskingGroup;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Initiator Masking Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_InitiatorMaskingGroupImpl#getConsistentLogicalUnitNumber <em>Consistent Logical Unit Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_InitiatorMaskingGroupImpl extends CIM_MaskingGroupImpl implements CIM_InitiatorMaskingGroup {
	/**
	 * The default value of the '{@link #getConsistentLogicalUnitNumber() <em>Consistent Logical Unit Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistentLogicalUnitNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONSISTENT_LOGICAL_UNIT_NUMBER_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getConsistentLogicalUnitNumber() <em>Consistent Logical Unit Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistentLogicalUnitNumber()
	 * @generated
	 * @ordered
	 */
	protected Boolean consistentLogicalUnitNumber = CONSISTENT_LOGICAL_UNIT_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_InitiatorMaskingGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_InitiatorMaskingGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getConsistentLogicalUnitNumber() {
		return consistentLogicalUnitNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsistentLogicalUnitNumber(Boolean newConsistentLogicalUnitNumber) {
		Boolean oldConsistentLogicalUnitNumber = consistentLogicalUnitNumber;
		consistentLogicalUnitNumber = newConsistentLogicalUnitNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_INITIATOR_MASKING_GROUP__CONSISTENT_LOGICAL_UNIT_NUMBER, oldConsistentLogicalUnitNumber, consistentLogicalUnitNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_INITIATOR_MASKING_GROUP__CONSISTENT_LOGICAL_UNIT_NUMBER:
				return getConsistentLogicalUnitNumber();
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
			case CimPackage.CIM_INITIATOR_MASKING_GROUP__CONSISTENT_LOGICAL_UNIT_NUMBER:
				setConsistentLogicalUnitNumber((Boolean)newValue);
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
			case CimPackage.CIM_INITIATOR_MASKING_GROUP__CONSISTENT_LOGICAL_UNIT_NUMBER:
				setConsistentLogicalUnitNumber(CONSISTENT_LOGICAL_UNIT_NUMBER_EDEFAULT);
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
			case CimPackage.CIM_INITIATOR_MASKING_GROUP__CONSISTENT_LOGICAL_UNIT_NUMBER:
				return CONSISTENT_LOGICAL_UNIT_NUMBER_EDEFAULT == null ? consistentLogicalUnitNumber != null : !CONSISTENT_LOGICAL_UNIT_NUMBER_EDEFAULT.equals(consistentLogicalUnitNumber);
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
		result.append(" (ConsistentLogicalUnitNumber: ");
		result.append(consistentLogicalUnitNumber);
		result.append(')');
		return result.toString();
	}

} //CIM_InitiatorMaskingGroupImpl

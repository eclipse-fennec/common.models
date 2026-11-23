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

import org.dmtf.cim.CIM_PolicyConditionStructure;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Policy Condition Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyConditionStructureImpl#getGroupNumber <em>Group Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyConditionStructureImpl#getConditionNegated <em>Condition Negated</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_PolicyConditionStructureImpl extends CIM_PolicyComponentImpl implements CIM_PolicyConditionStructure {
	/**
	 * The default value of the '{@link #getGroupNumber() <em>Group Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer GROUP_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupNumber() <em>Group Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer groupNumber = GROUP_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditionNegated() <em>Condition Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionNegated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONDITION_NEGATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionNegated() <em>Condition Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionNegated()
	 * @generated
	 * @ordered
	 */
	protected Boolean conditionNegated = CONDITION_NEGATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PolicyConditionStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PolicyConditionStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getGroupNumber() {
		return groupNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupNumber(Integer newGroupNumber) {
		Integer oldGroupNumber = groupNumber;
		groupNumber = newGroupNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_CONDITION_STRUCTURE__GROUP_NUMBER, oldGroupNumber, groupNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getConditionNegated() {
		return conditionNegated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditionNegated(Boolean newConditionNegated) {
		Boolean oldConditionNegated = conditionNegated;
		conditionNegated = newConditionNegated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_CONDITION_STRUCTURE__CONDITION_NEGATED, oldConditionNegated, conditionNegated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POLICY_CONDITION_STRUCTURE__GROUP_NUMBER:
				return getGroupNumber();
			case CimPackage.CIM_POLICY_CONDITION_STRUCTURE__CONDITION_NEGATED:
				return getConditionNegated();
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
			case CimPackage.CIM_POLICY_CONDITION_STRUCTURE__GROUP_NUMBER:
				setGroupNumber((Integer)newValue);
				return;
			case CimPackage.CIM_POLICY_CONDITION_STRUCTURE__CONDITION_NEGATED:
				setConditionNegated((Boolean)newValue);
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
			case CimPackage.CIM_POLICY_CONDITION_STRUCTURE__GROUP_NUMBER:
				setGroupNumber(GROUP_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_CONDITION_STRUCTURE__CONDITION_NEGATED:
				setConditionNegated(CONDITION_NEGATED_EDEFAULT);
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
			case CimPackage.CIM_POLICY_CONDITION_STRUCTURE__GROUP_NUMBER:
				return GROUP_NUMBER_EDEFAULT == null ? groupNumber != null : !GROUP_NUMBER_EDEFAULT.equals(groupNumber);
			case CimPackage.CIM_POLICY_CONDITION_STRUCTURE__CONDITION_NEGATED:
				return CONDITION_NEGATED_EDEFAULT == null ? conditionNegated != null : !CONDITION_NEGATED_EDEFAULT.equals(conditionNegated);
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
		result.append(" (GroupNumber: ");
		result.append(groupNumber);
		result.append(", ConditionNegated: ");
		result.append(conditionNegated);
		result.append(')');
		return result.toString();
	}

} //CIM_PolicyConditionStructureImpl

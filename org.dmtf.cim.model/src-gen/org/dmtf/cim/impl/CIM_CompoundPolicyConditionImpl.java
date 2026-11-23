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

import org.dmtf.cim.CIM_CompoundPolicyCondition;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Compound Policy Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CompoundPolicyConditionImpl#getConditionListType <em>Condition List Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CompoundPolicyConditionImpl extends CIM_PolicyConditionImpl implements CIM_CompoundPolicyCondition {
	/**
	 * The default value of the '{@link #getConditionListType() <em>Condition List Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionListType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONDITION_LIST_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionListType() <em>Condition List Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionListType()
	 * @generated
	 * @ordered
	 */
	protected Integer conditionListType = CONDITION_LIST_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CompoundPolicyConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CompoundPolicyCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConditionListType() {
		return conditionListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditionListType(Integer newConditionListType) {
		Integer oldConditionListType = conditionListType;
		conditionListType = newConditionListType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPOUND_POLICY_CONDITION__CONDITION_LIST_TYPE, oldConditionListType, conditionListType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_COMPOUND_POLICY_CONDITION__CONDITION_LIST_TYPE:
				return getConditionListType();
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
			case CimPackage.CIM_COMPOUND_POLICY_CONDITION__CONDITION_LIST_TYPE:
				setConditionListType((Integer)newValue);
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
			case CimPackage.CIM_COMPOUND_POLICY_CONDITION__CONDITION_LIST_TYPE:
				setConditionListType(CONDITION_LIST_TYPE_EDEFAULT);
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
			case CimPackage.CIM_COMPOUND_POLICY_CONDITION__CONDITION_LIST_TYPE:
				return CONDITION_LIST_TYPE_EDEFAULT == null ? conditionListType != null : !CONDITION_LIST_TYPE_EDEFAULT.equals(conditionListType);
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
		result.append(" (ConditionListType: ");
		result.append(conditionListType);
		result.append(')');
		return result.toString();
	}

} //CIM_CompoundPolicyConditionImpl

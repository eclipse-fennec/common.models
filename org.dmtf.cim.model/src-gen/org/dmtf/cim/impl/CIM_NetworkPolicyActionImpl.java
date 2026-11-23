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

import java.util.Collection;

import org.dmtf.cim.CIM_NetworkPolicyAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Network Policy Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPolicyActionImpl#getActionType <em>Action Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPolicyActionImpl#getActionTypeValue <em>Action Type Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NetworkPolicyActionImpl extends CIM_PolicyImpl implements CIM_NetworkPolicyAction {
	/**
	 * The cached value of the '{@link #getActionType() <em>Action Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionType()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> actionType;

	/**
	 * The cached value of the '{@link #getActionTypeValue() <em>Action Type Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionTypeValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> actionTypeValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NetworkPolicyActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NetworkPolicyAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getActionType() {
		if (actionType == null) {
			actionType = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_NETWORK_POLICY_ACTION__ACTION_TYPE);
		}
		return actionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getActionTypeValue() {
		if (actionTypeValue == null) {
			actionTypeValue = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_NETWORK_POLICY_ACTION__ACTION_TYPE_VALUE);
		}
		return actionTypeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NETWORK_POLICY_ACTION__ACTION_TYPE:
				return getActionType();
			case CimPackage.CIM_NETWORK_POLICY_ACTION__ACTION_TYPE_VALUE:
				return getActionTypeValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_NETWORK_POLICY_ACTION__ACTION_TYPE:
				getActionType().clear();
				getActionType().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_NETWORK_POLICY_ACTION__ACTION_TYPE_VALUE:
				getActionTypeValue().clear();
				getActionTypeValue().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_NETWORK_POLICY_ACTION__ACTION_TYPE:
				getActionType().clear();
				return;
			case CimPackage.CIM_NETWORK_POLICY_ACTION__ACTION_TYPE_VALUE:
				getActionTypeValue().clear();
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
			case CimPackage.CIM_NETWORK_POLICY_ACTION__ACTION_TYPE:
				return actionType != null && !actionType.isEmpty();
			case CimPackage.CIM_NETWORK_POLICY_ACTION__ACTION_TYPE_VALUE:
				return actionTypeValue != null && !actionTypeValue.isEmpty();
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
		result.append(" (ActionType: ");
		result.append(actionType);
		result.append(", ActionTypeValue: ");
		result.append(actionTypeValue);
		result.append(')');
		return result.toString();
	}

} //CIM_NetworkPolicyActionImpl

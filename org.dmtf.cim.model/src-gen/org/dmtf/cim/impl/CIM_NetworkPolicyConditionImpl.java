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

import org.dmtf.cim.CIM_NetworkPolicyCondition;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Network Policy Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPolicyConditionImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPolicyConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPolicyConditionImpl#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NetworkPolicyConditionImpl extends CIM_PolicyImpl implements CIM_NetworkPolicyCondition {
	/**
	 * The default value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PARAMETER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected Integer parameterType = PARAMETER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Integer operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterValue() <em>Parameter Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValue()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterValue() <em>Parameter Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValue()
	 * @generated
	 * @ordered
	 */
	protected String parameterValue = PARAMETER_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NetworkPolicyConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NetworkPolicyCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterType(Integer newParameterType) {
		Integer oldParameterType = parameterType;
		parameterType = newParameterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_POLICY_CONDITION__PARAMETER_TYPE, oldParameterType, parameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(Integer newOperator) {
		Integer oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_POLICY_CONDITION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameterValue() {
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterValue(String newParameterValue) {
		String oldParameterValue = parameterValue;
		parameterValue = newParameterValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_POLICY_CONDITION__PARAMETER_VALUE, oldParameterValue, parameterValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NETWORK_POLICY_CONDITION__PARAMETER_TYPE:
				return getParameterType();
			case CimPackage.CIM_NETWORK_POLICY_CONDITION__OPERATOR:
				return getOperator();
			case CimPackage.CIM_NETWORK_POLICY_CONDITION__PARAMETER_VALUE:
				return getParameterValue();
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
			case CimPackage.CIM_NETWORK_POLICY_CONDITION__PARAMETER_TYPE:
				setParameterType((Integer)newValue);
				return;
			case CimPackage.CIM_NETWORK_POLICY_CONDITION__OPERATOR:
				setOperator((Integer)newValue);
				return;
			case CimPackage.CIM_NETWORK_POLICY_CONDITION__PARAMETER_VALUE:
				setParameterValue((String)newValue);
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
			case CimPackage.CIM_NETWORK_POLICY_CONDITION__PARAMETER_TYPE:
				setParameterType(PARAMETER_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_POLICY_CONDITION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_POLICY_CONDITION__PARAMETER_VALUE:
				setParameterValue(PARAMETER_VALUE_EDEFAULT);
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
			case CimPackage.CIM_NETWORK_POLICY_CONDITION__PARAMETER_TYPE:
				return PARAMETER_TYPE_EDEFAULT == null ? parameterType != null : !PARAMETER_TYPE_EDEFAULT.equals(parameterType);
			case CimPackage.CIM_NETWORK_POLICY_CONDITION__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case CimPackage.CIM_NETWORK_POLICY_CONDITION__PARAMETER_VALUE:
				return PARAMETER_VALUE_EDEFAULT == null ? parameterValue != null : !PARAMETER_VALUE_EDEFAULT.equals(parameterValue);
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
		result.append(" (ParameterType: ");
		result.append(parameterType);
		result.append(", Operator: ");
		result.append(operator);
		result.append(", ParameterValue: ");
		result.append(parameterValue);
		result.append(')');
		return result.toString();
	}

} //CIM_NetworkPolicyConditionImpl

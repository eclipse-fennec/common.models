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

import org.dmtf.cim.CIM_PolicySet;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Policy Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicySetImpl#getPolicyDecisionStrategy <em>Policy Decision Strategy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicySetImpl#getPolicyRoles <em>Policy Roles</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicySetImpl#getEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_PolicySetImpl extends CIM_PolicyImpl implements CIM_PolicySet {
	/**
	 * The default value of the '{@link #getPolicyDecisionStrategy() <em>Policy Decision Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyDecisionStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POLICY_DECISION_STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyDecisionStrategy() <em>Policy Decision Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyDecisionStrategy()
	 * @generated
	 * @ordered
	 */
	protected Integer policyDecisionStrategy = POLICY_DECISION_STRATEGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPolicyRoles() <em>Policy Roles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<String> policyRoles;

	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENABLED_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected Integer enabled = ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PolicySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PolicySet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPolicyDecisionStrategy() {
		return policyDecisionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyDecisionStrategy(Integer newPolicyDecisionStrategy) {
		Integer oldPolicyDecisionStrategy = policyDecisionStrategy;
		policyDecisionStrategy = newPolicyDecisionStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_SET__POLICY_DECISION_STRATEGY, oldPolicyDecisionStrategy, policyDecisionStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPolicyRoles() {
		if (policyRoles == null) {
			policyRoles = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_POLICY_SET__POLICY_ROLES);
		}
		return policyRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled(Integer newEnabled) {
		Integer oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_SET__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POLICY_SET__POLICY_DECISION_STRATEGY:
				return getPolicyDecisionStrategy();
			case CimPackage.CIM_POLICY_SET__POLICY_ROLES:
				return getPolicyRoles();
			case CimPackage.CIM_POLICY_SET__ENABLED:
				return getEnabled();
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
			case CimPackage.CIM_POLICY_SET__POLICY_DECISION_STRATEGY:
				setPolicyDecisionStrategy((Integer)newValue);
				return;
			case CimPackage.CIM_POLICY_SET__POLICY_ROLES:
				getPolicyRoles().clear();
				getPolicyRoles().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_POLICY_SET__ENABLED:
				setEnabled((Integer)newValue);
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
			case CimPackage.CIM_POLICY_SET__POLICY_DECISION_STRATEGY:
				setPolicyDecisionStrategy(POLICY_DECISION_STRATEGY_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_SET__POLICY_ROLES:
				getPolicyRoles().clear();
				return;
			case CimPackage.CIM_POLICY_SET__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
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
			case CimPackage.CIM_POLICY_SET__POLICY_DECISION_STRATEGY:
				return POLICY_DECISION_STRATEGY_EDEFAULT == null ? policyDecisionStrategy != null : !POLICY_DECISION_STRATEGY_EDEFAULT.equals(policyDecisionStrategy);
			case CimPackage.CIM_POLICY_SET__POLICY_ROLES:
				return policyRoles != null && !policyRoles.isEmpty();
			case CimPackage.CIM_POLICY_SET__ENABLED:
				return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
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
		result.append(" (PolicyDecisionStrategy: ");
		result.append(policyDecisionStrategy);
		result.append(", PolicyRoles: ");
		result.append(policyRoles);
		result.append(", Enabled: ");
		result.append(enabled);
		result.append(')');
		return result.toString();
	}

} //CIM_PolicySetImpl

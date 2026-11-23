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

import org.dmtf.cim.CIM_CompoundPolicyAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Compound Policy Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CompoundPolicyActionImpl#getSequencedActions <em>Sequenced Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CompoundPolicyActionImpl#getExecutionStrategy <em>Execution Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CompoundPolicyActionImpl extends CIM_PolicyActionImpl implements CIM_CompoundPolicyAction {
	/**
	 * The default value of the '{@link #getSequencedActions() <em>Sequenced Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequencedActions()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SEQUENCED_ACTIONS_EDEFAULT = Integer.valueOf(3);

	/**
	 * The cached value of the '{@link #getSequencedActions() <em>Sequenced Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequencedActions()
	 * @generated
	 * @ordered
	 */
	protected Integer sequencedActions = SEQUENCED_ACTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionStrategy() <em>Execution Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXECUTION_STRATEGY_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getExecutionStrategy() <em>Execution Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionStrategy()
	 * @generated
	 * @ordered
	 */
	protected Integer executionStrategy = EXECUTION_STRATEGY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CompoundPolicyActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CompoundPolicyAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSequencedActions() {
		return sequencedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequencedActions(Integer newSequencedActions) {
		Integer oldSequencedActions = sequencedActions;
		sequencedActions = newSequencedActions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPOUND_POLICY_ACTION__SEQUENCED_ACTIONS, oldSequencedActions, sequencedActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExecutionStrategy() {
		return executionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionStrategy(Integer newExecutionStrategy) {
		Integer oldExecutionStrategy = executionStrategy;
		executionStrategy = newExecutionStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPOUND_POLICY_ACTION__EXECUTION_STRATEGY, oldExecutionStrategy, executionStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_COMPOUND_POLICY_ACTION__SEQUENCED_ACTIONS:
				return getSequencedActions();
			case CimPackage.CIM_COMPOUND_POLICY_ACTION__EXECUTION_STRATEGY:
				return getExecutionStrategy();
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
			case CimPackage.CIM_COMPOUND_POLICY_ACTION__SEQUENCED_ACTIONS:
				setSequencedActions((Integer)newValue);
				return;
			case CimPackage.CIM_COMPOUND_POLICY_ACTION__EXECUTION_STRATEGY:
				setExecutionStrategy((Integer)newValue);
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
			case CimPackage.CIM_COMPOUND_POLICY_ACTION__SEQUENCED_ACTIONS:
				setSequencedActions(SEQUENCED_ACTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_COMPOUND_POLICY_ACTION__EXECUTION_STRATEGY:
				setExecutionStrategy(EXECUTION_STRATEGY_EDEFAULT);
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
			case CimPackage.CIM_COMPOUND_POLICY_ACTION__SEQUENCED_ACTIONS:
				return SEQUENCED_ACTIONS_EDEFAULT == null ? sequencedActions != null : !SEQUENCED_ACTIONS_EDEFAULT.equals(sequencedActions);
			case CimPackage.CIM_COMPOUND_POLICY_ACTION__EXECUTION_STRATEGY:
				return EXECUTION_STRATEGY_EDEFAULT == null ? executionStrategy != null : !EXECUTION_STRATEGY_EDEFAULT.equals(executionStrategy);
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
		result.append(" (SequencedActions: ");
		result.append(sequencedActions);
		result.append(", ExecutionStrategy: ");
		result.append(executionStrategy);
		result.append(')');
		return result.toString();
	}

} //CIM_CompoundPolicyActionImpl

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

import org.dmtf.cim.CIM_PolicyRule;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Policy Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyRuleImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyRuleImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyRuleImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyRuleImpl#getPolicyRuleName <em>Policy Rule Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyRuleImpl#getConditionListType <em>Condition List Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyRuleImpl#getRuleUsage <em>Rule Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyRuleImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyRuleImpl#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyRuleImpl#getSequencedActions <em>Sequenced Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PolicyRuleImpl#getExecutionStrategy <em>Execution Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PolicyRuleImpl extends CIM_PolicySetImpl implements CIM_PolicyRule {
	/**
	 * The default value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String systemCreationClassName = SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyRuleName() <em>Policy Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyRuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_RULE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyRuleName() <em>Policy Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyRuleName()
	 * @generated
	 * @ordered
	 */
	protected String policyRuleName = POLICY_RULE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditionListType() <em>Condition List Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionListType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONDITION_LIST_TYPE_EDEFAULT = Integer.valueOf(1);

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
	 * The default value of the '{@link #getRuleUsage() <em>Rule Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuleUsage() <em>Rule Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleUsage()
	 * @generated
	 * @ordered
	 */
	protected String ruleUsage = RULE_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIORITY_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MANDATORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatory()
	 * @generated
	 * @ordered
	 */
	protected Boolean mandatory = MANDATORY_EDEFAULT;

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
	protected static final Integer EXECUTION_STRATEGY_EDEFAULT = null;

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
	protected CIM_PolicyRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PolicyRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemCreationClassName() {
		return systemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemCreationClassName(String newSystemCreationClassName) {
		String oldSystemCreationClassName = systemCreationClassName;
		systemCreationClassName = newSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_RULE__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_RULE__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_RULE__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPolicyRuleName() {
		return policyRuleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicyRuleName(String newPolicyRuleName) {
		String oldPolicyRuleName = policyRuleName;
		policyRuleName = newPolicyRuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_RULE__POLICY_RULE_NAME, oldPolicyRuleName, policyRuleName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_RULE__CONDITION_LIST_TYPE, oldConditionListType, conditionListType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuleUsage() {
		return ruleUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleUsage(String newRuleUsage) {
		String oldRuleUsage = ruleUsage;
		ruleUsage = newRuleUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_RULE__RULE_USAGE, oldRuleUsage, ruleUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(Integer newPriority) {
		Integer oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_RULE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMandatory(Boolean newMandatory) {
		Boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_RULE__MANDATORY, oldMandatory, mandatory));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_RULE__SEQUENCED_ACTIONS, oldSequencedActions, sequencedActions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POLICY_RULE__EXECUTION_STRATEGY, oldExecutionStrategy, executionStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POLICY_RULE__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_POLICY_RULE__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_POLICY_RULE__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_POLICY_RULE__POLICY_RULE_NAME:
				return getPolicyRuleName();
			case CimPackage.CIM_POLICY_RULE__CONDITION_LIST_TYPE:
				return getConditionListType();
			case CimPackage.CIM_POLICY_RULE__RULE_USAGE:
				return getRuleUsage();
			case CimPackage.CIM_POLICY_RULE__PRIORITY:
				return getPriority();
			case CimPackage.CIM_POLICY_RULE__MANDATORY:
				return getMandatory();
			case CimPackage.CIM_POLICY_RULE__SEQUENCED_ACTIONS:
				return getSequencedActions();
			case CimPackage.CIM_POLICY_RULE__EXECUTION_STRATEGY:
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
			case CimPackage.CIM_POLICY_RULE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_POLICY_RULE__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_POLICY_RULE__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_POLICY_RULE__POLICY_RULE_NAME:
				setPolicyRuleName((String)newValue);
				return;
			case CimPackage.CIM_POLICY_RULE__CONDITION_LIST_TYPE:
				setConditionListType((Integer)newValue);
				return;
			case CimPackage.CIM_POLICY_RULE__RULE_USAGE:
				setRuleUsage((String)newValue);
				return;
			case CimPackage.CIM_POLICY_RULE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case CimPackage.CIM_POLICY_RULE__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case CimPackage.CIM_POLICY_RULE__SEQUENCED_ACTIONS:
				setSequencedActions((Integer)newValue);
				return;
			case CimPackage.CIM_POLICY_RULE__EXECUTION_STRATEGY:
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
			case CimPackage.CIM_POLICY_RULE__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_RULE__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_RULE__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_RULE__POLICY_RULE_NAME:
				setPolicyRuleName(POLICY_RULE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_RULE__CONDITION_LIST_TYPE:
				setConditionListType(CONDITION_LIST_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_RULE__RULE_USAGE:
				setRuleUsage(RULE_USAGE_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_RULE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_RULE__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_RULE__SEQUENCED_ACTIONS:
				setSequencedActions(SEQUENCED_ACTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_POLICY_RULE__EXECUTION_STRATEGY:
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
			case CimPackage.CIM_POLICY_RULE__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_POLICY_RULE__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_POLICY_RULE__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_POLICY_RULE__POLICY_RULE_NAME:
				return POLICY_RULE_NAME_EDEFAULT == null ? policyRuleName != null : !POLICY_RULE_NAME_EDEFAULT.equals(policyRuleName);
			case CimPackage.CIM_POLICY_RULE__CONDITION_LIST_TYPE:
				return CONDITION_LIST_TYPE_EDEFAULT == null ? conditionListType != null : !CONDITION_LIST_TYPE_EDEFAULT.equals(conditionListType);
			case CimPackage.CIM_POLICY_RULE__RULE_USAGE:
				return RULE_USAGE_EDEFAULT == null ? ruleUsage != null : !RULE_USAGE_EDEFAULT.equals(ruleUsage);
			case CimPackage.CIM_POLICY_RULE__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case CimPackage.CIM_POLICY_RULE__MANDATORY:
				return MANDATORY_EDEFAULT == null ? mandatory != null : !MANDATORY_EDEFAULT.equals(mandatory);
			case CimPackage.CIM_POLICY_RULE__SEQUENCED_ACTIONS:
				return SEQUENCED_ACTIONS_EDEFAULT == null ? sequencedActions != null : !SEQUENCED_ACTIONS_EDEFAULT.equals(sequencedActions);
			case CimPackage.CIM_POLICY_RULE__EXECUTION_STRATEGY:
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
		result.append(" (SystemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", SystemName: ");
		result.append(systemName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", PolicyRuleName: ");
		result.append(policyRuleName);
		result.append(", ConditionListType: ");
		result.append(conditionListType);
		result.append(", RuleUsage: ");
		result.append(ruleUsage);
		result.append(", Priority: ");
		result.append(priority);
		result.append(", Mandatory: ");
		result.append(mandatory);
		result.append(", SequencedActions: ");
		result.append(sequencedActions);
		result.append(", ExecutionStrategy: ");
		result.append(executionStrategy);
		result.append(')');
		return result.toString();
	}

} //CIM_PolicyRuleImpl

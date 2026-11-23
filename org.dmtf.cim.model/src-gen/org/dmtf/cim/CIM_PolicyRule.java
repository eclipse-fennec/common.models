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
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Policy Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The central class used for representing the 'If Condition then Action' semantics of a policy rule. A PolicyRule condition, in the most general sense, is represented as either an ORed set of ANDed conditions (Disjunctive Normal Form, or DNF) or an ANDed set of ORed conditions (Conjunctive Normal Form, or CNF). Individual conditions may either be negated (NOT C) or unnegated (C). The actions specified by a PolicyRule are to be performed if and only if the PolicyRule condition (whether it is represented in DNF or CNF) evaluates to TRUE. 
 * 
 * The conditions and actions associated with a PolicyRule are modeled, respectively, with subclasses of PolicyCondition and PolicyAction. These condition and action objects are tied to instances of PolicyRule by the PolicyConditionInPolicyRule and PolicyActionInPolicyRule aggregations. 
 * 
 * A PolicyRule may also be associated with one or more policy time periods, indicating the schedule according to which the policy rule is active and inactive. In this case it is the PolicySetValidityPeriod aggregation that provides this linkage. 
 * 
 * The PolicyRule class uses the property ConditionListType, to indicate whether the conditions for the rule are in DNF (disjunctive normal form), CNF (conjunctive normal form) or, in the case of a rule with no conditions, as an UnconditionalRule. The PolicyConditionInPolicyRule aggregation contains two additional properties to complete the representation of the Rule's conditional expression. The first of these properties is an integer to partition the referenced PolicyConditions into one or more groups, and the second is a Boolean to indicate whether a referenced Condition is negated. An example shows how ConditionListType and these two additional properties provide a unique representation of a set of PolicyConditions in either DNF or CNF. 
 * 
 * Suppose we have a PolicyRule that aggregates five PolicyConditions C1 through C5, with the following values in the properties of the five PolicyConditionInPolicyRule associations: 
 * C1: GroupNumber = 1, ConditionNegated = FALSE 
 * C2: GroupNumber = 1, ConditionNegated = TRUE 
 * C3: GroupNumber = 1, ConditionNegated = FALSE 
 * C4: GroupNumber = 2, ConditionNegated = FALSE 
 * C5: GroupNumber = 2, ConditionNegated = FALSE 
 * 
 * If ConditionListType = DNF, then the overall condition for the PolicyRule is: 
 * (C1 AND (NOT C2) AND C3) OR (C4 AND C5) 
 * 
 * On the other hand, if ConditionListType = CNF, then the overall condition for the PolicyRule is: 
 * (C1 OR (NOT C2) OR C3) AND (C4 OR C5) 
 * 
 * In both cases, there is an unambiguous specification of the overall condition that is tested to determine whether to perform the PolicyActions associated with the PolicyRule. 
 * 
 * PolicyRule instances may also be used to aggregate other PolicyRules and/or PolicyGroups. When used in this way to implement nested rules, the conditions of the aggregating rule apply to the subordinate rules as well. However, any side effects of condition evaluation or the execution of actions MUST NOT affect the result of the evaluation of other conditions evaluated by the rule engine in the same evaluation pass. That is, an implementation of a rule engine MAY evaluate all conditions in any order before applying the priority and determining which actions are to be executed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PolicyRule#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyRule#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyRule#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyRule#getPolicyRuleName <em>Policy Rule Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyRule#getConditionListType <em>Condition List Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyRule#getRuleUsage <em>Rule Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyRule#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyRule#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyRule#getSequencedActions <em>Sequenced Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyRule#getExecutionStrategy <em>Execution Strategy</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRule()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,CreationClassName,PolicyRuleName'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyRule extends CIM_PolicySet {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRule_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_System.CreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyRule#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #getSystemCreationClassName()
	 * @generated
	 */
	void setSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRule_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_System.Name'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyRule#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRule_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyRule#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Policy Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A user-friendly name of this PolicyRule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Rule Name</em>' attribute.
	 * @see #setPolicyRuleName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRule_PolicyRuleName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getPolicyRuleName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyRule#getPolicyRuleName <em>Policy Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Rule Name</em>' attribute.
	 * @see #getPolicyRuleName()
	 * @generated
	 */
	void setPolicyRuleName(String value);

	/**
	 * Returns the value of the '<em><b>Condition List Type</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the list of PolicyConditions associated with this PolicyRule is in disjunctive normal form (DNF), conjunctive normal form (CNF), or has no conditions (i.e., is an UnconditionalRule) and is automatically evaluated to "True." The default value is 1 ("DNF").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition List Type</em>' attribute.
	 * @see #setConditionListType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRule_ConditionListType()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unconditional Rule\",\"DNF\",\"CNF\"]'"
	 * @generated
	 */
	Integer getConditionListType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyRule#getConditionListType <em>Condition List Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition List Type</em>' attribute.
	 * @see #getConditionListType()
	 * @generated
	 */
	void setConditionListType(Integer value);

	/**
	 * Returns the value of the '<em><b>Rule Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A free-form string that can be used to provide guidelines on how this PolicyRule should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Usage</em>' attribute.
	 * @see #setRuleUsage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRule_RuleUsage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getRuleUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyRule#getRuleUsage <em>Rule Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Usage</em>' attribute.
	 * @see #getRuleUsage()
	 * @generated
	 */
	void setRuleUsage(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PolicyRule.Priority is deprecated and replaced by providing the priority for a rule (and a group) in the context of the aggregating PolicySet instead of the priority being used for all aggregating PolicySet instances. Thus, the assignment of priority values is much simpler. 
	 * 
	 * A non-negative integer for prioritizing this Policy Rule relative to other Rules. A larger value indicates a higher priority. The default value is 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRule_Priority()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_PolicySetComponent.Priority\"]'"
	 * @generated
	 */
	Integer getPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyRule#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A flag indicating that the evaluation of the Policy Conditions and execution of PolicyActions (if the Conditions evaluate to TRUE) is required. The evaluation of a PolicyRule MUST be attempted if the Mandatory property value is TRUE. If the Mandatory property is FALSE, then the evaluation of the Rule is 'best effort' and MAY be ignored.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRule_Mandatory()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"No value\"]'"
	 * @generated
	 */
	Boolean getMandatory();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyRule#getMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #getMandatory()
	 * @generated
	 */
	void setMandatory(Boolean value);

	/**
	 * Returns the value of the '<em><b>Sequenced Actions</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property gives a policy administrator a way of specifying how the ordering of the PolicyActions associated with this PolicyRule is to be interpreted. Three values are supported: 
	 * o mandatory(1): Do the actions in the indicated order, or don't do them at all. 
	 * o recommended(2): Do the actions in the indicated order if you can, but if you can't do them in this order, do them in another order if you can. 
	 * o dontCare(3): Do them -- I don't care about the order. 
	 * The default value is 3 ("DontCare").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequenced Actions</em>' attribute.
	 * @see #setSequencedActions(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRule_SequencedActions()
	 * @model default="3"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Mandatory\",\"Recommended\",\"Dont Care\"]'"
	 * @generated
	 */
	Integer getSequencedActions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyRule#getSequencedActions <em>Sequenced Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequenced Actions</em>' attribute.
	 * @see #getSequencedActions()
	 * @generated
	 */
	void setSequencedActions(Integer value);

	/**
	 * Returns the value of the '<em><b>Execution Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExecutionStrategy defines the strategy to be used in executing the sequenced actions aggregated by this PolicyRule. There are three execution strategies: 
	 * 
	 * Do Until Success - execute actions according to predefined order, until successful execution of a single action. 
	 * Do All - execute ALL actions which are part of the modeled set, according to their predefined order. Continue doing this, even if one or more of the actions fails. 
	 * Do Until Failure - execute actions according to predefined order, until the first failure in execution of an action instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Strategy</em>' attribute.
	 * @see #setExecutionStrategy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyRule_ExecutionStrategy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Do Until Success\",\"Do All\",\"Do Until Failure\"]'"
	 * @generated
	 */
	Integer getExecutionStrategy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyRule#getExecutionStrategy <em>Execution Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Strategy</em>' attribute.
	 * @see #getExecutionStrategy()
	 * @generated
	 */
	void setExecutionStrategy(Integer value);

} // CIM_PolicyRule

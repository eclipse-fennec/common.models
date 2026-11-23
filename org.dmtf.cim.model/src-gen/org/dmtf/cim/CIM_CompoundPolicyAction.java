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
 * A representation of the model object '<em><b>CIM Compound Policy Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CompoundPolicyAction is used to represent an expression consisting of an ordered sequence of action terms. Each action term is represented as a subclass of the PolicyAction class. Compound actions are constructed by associating dependent action terms together using the PolicyActionInPolicyAction aggregation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CompoundPolicyAction#getSequencedActions <em>Sequenced Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CompoundPolicyAction#getExecutionStrategy <em>Execution Strategy</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CompoundPolicyAction()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyActionName'"
 * @generated
 */
@ProviderType
public interface CIM_CompoundPolicyAction extends CIM_PolicyAction {
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
	 * @see org.dmtf.cim.CimPackage#getCIM_CompoundPolicyAction_SequencedActions()
	 * @model default="3"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Mandatory\",\"Recommended\",\"Dont Care\"]'"
	 * @generated
	 */
	Integer getSequencedActions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CompoundPolicyAction#getSequencedActions <em>Sequenced Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequenced Actions</em>' attribute.
	 * @see #getSequencedActions()
	 * @generated
	 */
	void setSequencedActions(Integer value);

	/**
	 * Returns the value of the '<em><b>Execution Strategy</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExecutionStrategy defines the strategy to be used in executing the sequenced actions aggregated by this CompoundPolicyAction. There are three execution strategies: 
	 * 
	 * Do Until Success - execute actions according to predefined order, until successful execution of a single action. 
	 * Do All - execute ALL actions which are part of the modeled set, according to their predefined order. Continue doing this, even if one or more of the actions fails. 
	 * Do Until Failure - execute actions according to predefined order, until the first failure in execution of an action instance. 
	 * The default value is 2 ("Do All").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Strategy</em>' attribute.
	 * @see #setExecutionStrategy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CompoundPolicyAction_ExecutionStrategy()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Do Until Success\",\"Do All\",\"Do Until Failure\"]'"
	 * @generated
	 */
	Integer getExecutionStrategy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CompoundPolicyAction#getExecutionStrategy <em>Execution Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Strategy</em>' attribute.
	 * @see #getExecutionStrategy()
	 * @generated
	 */
	void setExecutionStrategy(Integer value);

} // CIM_CompoundPolicyAction

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
 * A representation of the model object '<em><b>CIM Compound Policy Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CompoundPolicyCondition is used to represent compound conditions formed by aggregating simpler policy conditions. Compound conditions are constructed by associating subordinate condition terms together using the PolicyConditionInPolicyCondition aggregation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CompoundPolicyCondition#getConditionListType <em>Condition List Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CompoundPolicyCondition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyConditionName'"
 * @generated
 */
@ProviderType
public interface CIM_CompoundPolicyCondition extends CIM_PolicyCondition {
	/**
	 * Returns the value of the '<em><b>Condition List Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the list of CompoundPolicyConditions associated with this PolicyRule is in disjunctive normal form (DNF) or conjunctive normal form (CNF). The default value is 1 ("DNF").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition List Type</em>' attribute.
	 * @see #setConditionListType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_CompoundPolicyCondition_ConditionListType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\"]' Values='[\"DNF\",\"CNF\"]'"
	 * @generated
	 */
	Integer getConditionListType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CompoundPolicyCondition#getConditionListType <em>Condition List Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition List Type</em>' attribute.
	 * @see #getConditionListType()
	 * @generated
	 */
	void setConditionListType(Integer value);

} // CIM_CompoundPolicyCondition

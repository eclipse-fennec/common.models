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
 * A representation of the model object '<em><b>CIM Policy Condition Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PolicyConditions may be aggregated into rules and into compound conditions. PolicyConditionStructure is the abstract aggregation class for the structuring of policy conditions. 
 * 
 * The Conditions aggregated by a PolicyRule or CompoundPolicyCondition are grouped into two levels of lists: either an ORed set of ANDed sets of conditions (DNF, the default) or an ANDed set of ORed sets of conditions (CNF). Individual PolicyConditions in these lists may be negated. The property ConditionListType specifies which of these two grouping schemes applies to a particular PolicyRule or CompoundPolicyCondition instance. 
 * 
 * One or more PolicyTimePeriodConditions may be among the conditions associated with a PolicyRule or CompoundPolicyCondition via the PolicyConditionStructure subclass association. In this case, the time periods are simply additional Conditions to be evaluated along with any others that are specified.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PolicyConditionStructure#getGroupNumber <em>Group Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyConditionStructure#getConditionNegated <em>Condition Negated</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyConditionStructure()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Association='true' Abstract='true' Aggregation='true' Version='2.7.0' UMLPackagePath='CIM::Policy' override.GroupComponent='CIM_Policy REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Description='This property represents the Policy that contains one or more PolicyConditions.' override.PartComponent='CIM_PolicyCondition REF' override.PartComponent.Description='This property holds the name of a PolicyCondition contained by one or more PolicyRule or CompoundPolicyCondition instances.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyConditionStructure extends CIM_PolicyComponent {
	/**
	 * Returns the value of the '<em><b>Group Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unsigned integer indicating the group to which the contained PolicyCondition belongs. This integer segments the Conditions into the ANDed sets (when the ConditionListType is "DNF") or, similarly, into the ORed sets (when the ConditionListType is "CNF").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Number</em>' attribute.
	 * @see #setGroupNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyConditionStructure_GroupNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getGroupNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyConditionStructure#getGroupNumber <em>Group Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Number</em>' attribute.
	 * @see #getGroupNumber()
	 * @generated
	 */
	void setGroupNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Condition Negated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication of whether the contained PolicyCondition is negated. TRUE indicates that the PolicyCondition IS negated, FALSE indicates that it IS NOT negated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition Negated</em>' attribute.
	 * @see #setConditionNegated(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyConditionStructure_ConditionNegated()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getConditionNegated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyConditionStructure#getConditionNegated <em>Condition Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Negated</em>' attribute.
	 * @see #getConditionNegated()
	 * @generated
	 */
	void setConditionNegated(Boolean value);

} // CIM_PolicyConditionStructure

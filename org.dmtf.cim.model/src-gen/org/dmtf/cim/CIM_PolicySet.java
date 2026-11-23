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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Policy Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PolicySet is an abstract class that represents a set of policies that form a coherent set. The set of contained policies has a common decision strategy and a common set of policy roles (defined via the PolicySetInRole Collection association). Subclasses include PolicyGroup and PolicyRule.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PolicySet#getPolicyDecisionStrategy <em>Policy Decision Strategy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicySet#getPolicyRoles <em>Policy Roles</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicySet#getEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicySet()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.8.0' UMLPackagePath='CIM::Policy'"
 * @generated
 */
@ProviderType
public interface CIM_PolicySet extends CIM_Policy {
	/**
	 * Returns the value of the '<em><b>Policy Decision Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PolicyDecisionStrategy defines the evaluation method used for policies contained in the PolicySet. There are two values currently defined: 
	 * - 'First Matching' (1) executes the actions of the first rule whose conditions evaluate to TRUE. The concept of 'first' is determined by examining the priority of the rule within the policy set (i.e., by examining the property, PolicySetComponent.Priority). Note that this ordering property MUST be maintained when processing the PolicyDecisionStrategy. 
	 * - 'All' (2) executes the actions of ALL rules whose conditions evaluate to TRUE, in the set. As noted above, the order of processing of the rules is defined by the property, PolicySetComponent.Priority (and within a rule, the ordering of the actions is defined by the property, PolicyActionStructure.ActionOrder). Note that when this strategy is defined, processing MUST be completed of ALL rules whose conditions evaluate to TRUE, regardless of errors in the execution of the rule actions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Decision Strategy</em>' attribute.
	 * @see #setPolicyDecisionStrategy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicySet_PolicyDecisionStrategy()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\"]' Values='[\"First Matching\",\"All\"]'"
	 * @generated
	 */
	Integer getPolicyDecisionStrategy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicySet#getPolicyDecisionStrategy <em>Policy Decision Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Decision Strategy</em>' attribute.
	 * @see #getPolicyDecisionStrategy()
	 * @generated
	 */
	void setPolicyDecisionStrategy(Integer value);

	/**
	 * Returns the value of the '<em><b>Policy Roles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PolicyRoles property represents the roles associated with a PolicySet. All contained PolicySet instances inherit the values of the PolicyRoles of the aggregating PolicySet but the values are not copied. A contained PolicySet instance may, however, add additional PolicyRoles to those it inherits from its aggregating PolicySet(s). Each value in PolicyRoles multi-valued property represents a role for which the PolicySet applies, i.e., the PolicySet should be used by any enforcement point that assumes any of the listed PolicyRoles values. 
	 * 
	 * Although not officially designated as 'role combinations', multiple roles may be specified using the form: 
	 * <RoleName>[&&<RoleName>]* 
	 * where the individual role names appear in alphabetical order (according to the collating sequence for UCS-2). Implementations may treat PolicyRoles values that are specified as 'role combinations' as simple strings. 
	 * 
	 * This property is deprecated in lieu of the use of an association, CIM_PolicySetInRoleCollection. The latter is a more explicit and less error-prone approach to modeling that a PolicySet has one or more PolicyRoles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Roles</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicySet_PolicyRoles()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_PolicySetInRoleCollection\"]'"
	 * @generated
	 */
	EList<String> getPolicyRoles();

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether this PolicySet is administratively enabled, administratively disabled, or enabled for debug. The "EnabledForDebug" property value is deprecated and, when it or any value not understood by the receiver is specified, the receiving enforcement point treats the PolicySet as "Disabled". To determine if a PolicySet is "Enabled", the containment hierarchy specified by the PolicySetComponent aggregation is examined and the Enabled property values of the hierarchy are ANDed together. Thus, for example, everything aggregated by a PolicyGroup may be disabled by setting the Enabled property in the PolicyGroup instance to "Disabled" without changing the Enabled property values of any of the aggregated instances. The default value is 1 ("Enabled").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicySet_Enabled()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Enabled\",\"Disabled\",\"Enabled For Debug\"]'"
	 * @generated
	 */
	Integer getEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicySet#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(Integer value);

} // CIM_PolicySet

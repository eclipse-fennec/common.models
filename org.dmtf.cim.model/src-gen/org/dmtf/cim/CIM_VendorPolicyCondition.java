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
 * A representation of the model object '<em><b>CIM Vendor Policy Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class that provides a general extension mechanism for representing PolicyConditions that have not been modeled with specific properties. Instead, the two properties Constraint and ConstraintEncoding are used to define the content and format of the Condition, as explained below. 
 * 
 * As its name suggests, VendorPolicyCondition is intended for vendor-specific extensions to the Policy Core Information Model. Standardized extensions are not expected to use this class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VendorPolicyCondition#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VendorPolicyCondition#getConstraintEncoding <em>Constraint Encoding</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VendorPolicyCondition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyConditionName'"
 * @generated
 */
@ProviderType
public interface CIM_VendorPolicyCondition extends CIM_PolicyCondition {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property provides a general extension mechanism for representing PolicyConditions that have not been modeled with specific properties. The format of the octet strings in the array is left unspecified in this definition. It is determined by the OID value stored in the property ConstraintEncoding. Since ConstraintEncoding is single-valued, all the values of Constraint share the same format and semantics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VendorPolicyCondition_Constraint()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true' ModelCorrespondence='[\"CIM_VendorPolicyCondition.ConstraintEncoding\"]'"
	 * @generated
	 */
	EList<String> getConstraint();

	/**
	 * Returns the value of the '<em><b>Constraint Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An OID encoded as a string, identifying the format and semantics for this instance's Constraint property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Encoding</em>' attribute.
	 * @see #setConstraintEncoding(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_VendorPolicyCondition_ConstraintEncoding()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_VendorPolicyCondition.Constraint\"]'"
	 * @generated
	 */
	String getConstraintEncoding();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_VendorPolicyCondition#getConstraintEncoding <em>Constraint Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Encoding</em>' attribute.
	 * @see #getConstraintEncoding()
	 * @generated
	 */
	void setConstraintEncoding(String value);

} // CIM_VendorPolicyCondition

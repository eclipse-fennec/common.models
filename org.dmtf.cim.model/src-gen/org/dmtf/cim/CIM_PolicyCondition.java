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
 * A representation of the model object '<em><b>CIM Policy Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class representing a rule-specific or reusable policy condition to be evaluated in conjunction with a Policy Rule. Since all operational details of a PolicyCondition are provided in subclasses of this object, this class is abstract.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PolicyCondition#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyCondition#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyCondition#getPolicyRuleCreationClassName <em>Policy Rule Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyCondition#getPolicyRuleName <em>Policy Rule Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyCondition#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PolicyCondition#getPolicyConditionName <em>Policy Condition Name</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PolicyCondition()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.6.0' UMLPackagePath='CIM::Policy' keys='SystemCreationClassName,SystemName,PolicyRuleCreationClassName,PolicyRuleName,CreationClassName,PolicyConditionName'"
 * @generated
 */
@ProviderType
public interface CIM_PolicyCondition extends CIM_Policy {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the class or the subclass used in the creation of the System object in whose scope this PolicyCondition is defined. 
	 * 
	 * This property helps to identify the System object in whose scope this instance of PolicyCondition exists. For a rule-specific PolicyCondition, this is the System in whose context the PolicyRule is defined. For a reusable PolicyCondition, this is the instance of PolicyRepository (which is a subclass of System) that holds the Condition. 
	 * 
	 * Note that this property, and the analogous property SystemName, do not represent propagated keys from an instance of the class System. Instead, they are properties defined in the context of this class, which repeat the values from the instance of System to which this PolicyCondition is related, either directly via the PolicyConditionInPolicyRepository association or indirectly via the PolicyConditionInPolicyRule aggregation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyCondition_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyCondition#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
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
	 * The name of the System object in whose scope this PolicyCondition is defined. 
	 * 
	 * This property completes the identification of the System object in whose scope this instance of PolicyCondition exists. For a rule-specific PolicyCondition, this is the System in whose context the PolicyRule is defined. For a reusable PolicyCondition, this is the instance of PolicyRepository (which is a subclass of System) that holds the Condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyCondition_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyCondition#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Policy Rule Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a rule-specific PolicyCondition, the CreationClassName of the PolicyRule object with which this Condition is associated. For a reusable Policy Condition, a special value, 'NO RULE', should be used to indicate that this Condition is reusable and not associated with a single PolicyRule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Rule Creation Class Name</em>' attribute.
	 * @see #setPolicyRuleCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyCondition_PolicyRuleCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getPolicyRuleCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyCondition#getPolicyRuleCreationClassName <em>Policy Rule Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Rule Creation Class Name</em>' attribute.
	 * @see #getPolicyRuleCreationClassName()
	 * @generated
	 */
	void setPolicyRuleCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Policy Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For a rule-specific PolicyCondition, the name of the PolicyRule object with which this Condition is associated. For a reusable PolicyCondition, a special value, 'NO RULE', should be used to indicate that this Condition is reusable and not associated with a single PolicyRule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Rule Name</em>' attribute.
	 * @see #setPolicyRuleName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyCondition_PolicyRuleName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getPolicyRuleName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyCondition#getPolicyRuleName <em>Policy Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Rule Name</em>' attribute.
	 * @see #getPolicyRuleName()
	 * @generated
	 */
	void setPolicyRuleName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyCondition_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyCondition#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Policy Condition Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A user-friendly name of this PolicyCondition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Policy Condition Name</em>' attribute.
	 * @see #setPolicyConditionName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_PolicyCondition_PolicyConditionName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getPolicyConditionName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_PolicyCondition#getPolicyConditionName <em>Policy Condition Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Condition Name</em>' attribute.
	 * @see #getPolicyConditionName()
	 * @generated
	 */
	void setPolicyConditionName(String value);

} // CIM_PolicyCondition

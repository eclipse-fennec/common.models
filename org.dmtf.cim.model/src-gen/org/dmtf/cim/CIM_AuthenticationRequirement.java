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
 * A representation of the model object '<em><b>CIM Authentication Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AuthenticationRequirement provides, through its associations, the authentication requirements for access to system resources. For a particular set of target resources, the AuthenticationService may require that credentials be issued by a specific CredentialManagementService. The AuthenticationRequirement class is weak to the system (e.g., ComputerSystem or Administrative Domain) for which the requirements apply. 
 * 
 * Note that this class was defined before the Policy Model existed, and is deprecated in lieu of authentication policy - specifically, the AuthenticationCondition and AuthenticationRule classes. In the updated design, AuthenticationCondition describes the specific combinations of credentials (or alternative credentials) that are required in order to authenticate an Identity. This allows a more explicit and flexible description of authentication requirements. Also, the definition of 'security classification' as a property of this class was problematic - since it could not be assigned to an element in a straight forward fashion. To correct this issue, the SecuritySensitivity class (and its association, ElementSecuritySensitivity) are defined.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AuthenticationRequirement#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AuthenticationRequirement#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AuthenticationRequirement#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AuthenticationRequirement#getSecurityClassification <em>Security Classification</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AuthenticationRequirement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_AuthenticationCondition\",\"CIM_AuthenticationRule\",\"CIM_SecuritySensitivity\"]' Version='2.8.0' UMLPackagePath='CIM::User::AuthenticationReqmt' override.Name='string' override.Name.Deprecated='[\"CIM_AuthenticationRule.PolicyRuleName\"]' override.Name.Key='true' override.Name.Description='The Name property defines the unique label, in the context of the hosting system, by which the AuthenticationRequirement is known.' override.Name.MaxLen='256' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_AuthenticationRequirement extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hosting systemcreation class name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AuthenticationRequirement_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_AuthenticationRule.SystemCreationClassName\"]' Key='true' MaxLen='256' Propagated='CIM_System.CreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AuthenticationRequirement#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
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
	 * Hosting system name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AuthenticationRequirement_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_AuthenticationRule.SystemName\"]' Key='true' MaxLen='256' Propagated='CIM_System.Name'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AuthenticationRequirement#getSystemName <em>System Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_AuthenticationRequirement_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_AuthenticationRule.CreationClassName\"]' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AuthenticationRequirement#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Security Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SecurityClassification property specifies a named level of security associated with the AuthenticationRequirement, e.g., 'Confidential', 'Top Secret', etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Classification</em>' attribute.
	 * @see #setSecurityClassification(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AuthenticationRequirement_SecurityClassification()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_SecuritySensitivity.SecurityLevel\"]'"
	 * @generated
	 */
	String getSecurityClassification();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AuthenticationRequirement#getSecurityClassification <em>Security Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Classification</em>' attribute.
	 * @see #getSecurityClassification()
	 * @generated
	 */
	void setSecurityClassification(String value);

} // CIM_AuthenticationRequirement

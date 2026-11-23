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
 * A representation of the model object '<em><b>CIM Account Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AccountSettingData provides the ability to manage the desired configuration for an instance of CIM_Account. When associated with an instance of CIM_AccountManagementService, this class may be used to constrain the properties of instances of CIM_Accountcreated using the service. When associated with an instance of CIM_Account, this class may be used to manage the configuration of the CIM_Acount instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AccountSettingData#getComplexPasswordRulesEnforced <em>Complex Password Rules Enforced</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccountSettingData#getInactivityTimeout <em>Inactivity Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccountSettingData#getMaximumPasswordExpiration <em>Maximum Password Expiration</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccountSettingData#getMaximumSuccessiveLoginFailures <em>Maximum Successive Login Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccountSettingData#getPasswordHistoryDepth <em>Password History Depth</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AccountSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::User::Account' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_AccountSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Complex Password Rules Enforced</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ComplexPasswordRulesEnforced indicates the rules for constructing a complex password enforced by the Account.
	 * Minimum Length a minimum length is enforced for passwords for the account.
	 * Preclude User ID inclusion precluding the password from including the user ID is supported. 
	 * Maximum Repeating Characters a limit will be enforced on the number of times a character can occur consecutively. 
	 * Lower Case Alpha at least one lower case alpha character is required. 
	 * Upper Case Alpha at least one upper case alpha character is required. 
	 * Numeric Character at least one numeric character is required. 
	 * Special Character at least one special character is required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Complex Password Rules Enforced</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AccountSettingData_ComplexPasswordRulesEnforced()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Minimum Length\",\"Preclude User ID Inclusion\",\"Maximum Repeating Characters\",\"Lower Case Alpha\",\"Upper Case Alpha\",\"Numeric Character\",\"Special Character\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getComplexPasswordRulesEnforced();

	/**
	 * Returns the value of the '<em><b>Inactivity Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InactivityTimeout specifies the interval after which if an account has been inactive, it shall be Disabled. The value shall be expressed in interval format or shall be NULL. A value of NULL shall indicate that the Account will not be disabled due to inactivity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inactivity Timeout</em>' attribute.
	 * @see #setInactivityTimeout(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AccountSettingData_InactivityTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getInactivityTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AccountSettingData#getInactivityTimeout <em>Inactivity Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactivity Timeout</em>' attribute.
	 * @see #getInactivityTimeout()
	 * @generated
	 */
	void setInactivityTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Password Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaximumPasswordExpiration indicates the maximum password age enforced for the Account. The value shall be expressed in interval format or shall be NULL. A value of NULL shall indicate that the password aging is not enforced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Password Expiration</em>' attribute.
	 * @see #setMaximumPasswordExpiration(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AccountSettingData_MaximumPasswordExpiration()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getMaximumPasswordExpiration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AccountSettingData#getMaximumPasswordExpiration <em>Maximum Password Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Password Expiration</em>' attribute.
	 * @see #getMaximumPasswordExpiration()
	 * @generated
	 */
	void setMaximumPasswordExpiration(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Successive Login Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaximumSuccessiveLoginFailures indicates the number of successive failed login attempts that shall result in the Account being disabled. A value of zero shall indicate that the Account will not be disabled due to successive failed login attempts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Successive Login Failures</em>' attribute.
	 * @see #setMaximumSuccessiveLoginFailures(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AccountSettingData_MaximumSuccessiveLoginFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumSuccessiveLoginFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AccountSettingData#getMaximumSuccessiveLoginFailures <em>Maximum Successive Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Successive Login Failures</em>' attribute.
	 * @see #getMaximumSuccessiveLoginFailures()
	 * @generated
	 */
	void setMaximumSuccessiveLoginFailures(Integer value);

	/**
	 * Returns the value of the '<em><b>Password History Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PasswordHistoryDepth indicates the number of previous passwords that shall be maintained for the Account. The Account shall preclude the selection of a password if it occurs in the password history. A value of zero shall indicate that a password history is not maintained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password History Depth</em>' attribute.
	 * @see #setPasswordHistoryDepth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AccountSettingData_PasswordHistoryDepth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getPasswordHistoryDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AccountSettingData#getPasswordHistoryDepth <em>Password History Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password History Depth</em>' attribute.
	 * @see #getPasswordHistoryDepth()
	 * @generated
	 */
	void setPasswordHistoryDepth(Integer value);

} // CIM_AccountSettingData

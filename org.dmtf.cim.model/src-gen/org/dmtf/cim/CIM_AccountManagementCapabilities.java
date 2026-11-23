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
 * A representation of the model object '<em><b>CIM Account Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AccountManagementCapabilities describes the capabilities supported for managing Accounts associated with an instance of AccountManagementService. AccountManagementCapabilities is associated with an instance of AccountManagementService through the ElementCapabilities association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AccountManagementCapabilities#getOperationsSupported <em>Operations Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccountManagementCapabilities#getOtherSupportedUserPasswordEncryptionAlgorithms <em>Other Supported User Password Encryption Algorithms</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccountManagementCapabilities#getSupportedUserPasswordEncryptionAlgorithms <em>Supported User Password Encryption Algorithms</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccountManagementCapabilities#getUserPasswordEncryptionSalt <em>User Password Encryption Salt</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccountManagementCapabilities#getMaximumAccountsSupported <em>Maximum Accounts Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AccountManagementCapabilities#getSupportedUserPasswordEncodings <em>Supported User Password Encodings</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AccountManagementCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.35.0' UMLPackagePath='CIM::User::Account' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_AccountManagementCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Operations Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperationsSupported describes the type of operations that are supported for an Account associated with the AccountManagementService.
	 * "Create" indicates the AccountManagementService may be used to create new accounts.
	 * "Modify" indicates that the associated Accounts may be modified.
	 * "Delete" indicates that associated Accounts may be deleted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operations Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AccountManagementCapabilities_OperationsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Create\",\"Modify\",\"Delete\",\"CreateUserContact\",\"CreateUserContactByIdentity\",\"ModifyUserContact\",\"DeleteUserContact\",\"GetAccount\",\"GetUserContact\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getOperationsSupported();

	/**
	 * Returns the value of the '<em><b>Other Supported User Password Encryption Algorithms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional implementation-specific algorithms that a client may use to encrypt a value in the UserPassword property when creating or modifying an instance of CIM_Account. If this property is non-NULL, a client may select an algorithm in it by setting CIM_Account.UserPasswordEncryptionAlgorithm to 1 ("Other") and setting CIM_Account.OtherUserPasswordEncryptionAlgorithm to the value of the selected algorithm string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Supported User Password Encryption Algorithms</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AccountManagementCapabilities_OtherSupportedUserPasswordEncryptionAlgorithms()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_Account.OtherUserPasswordEncryptionAlgorithm\",\"CIM_AccountManagementCapabilities.SupportedUserPasswordEncryptionAlgorithms\"]'"
	 * @generated
	 */
	EList<String> getOtherSupportedUserPasswordEncryptionAlgorithms();

	/**
	 * Returns the value of the '<em><b>Supported User Password Encryption Algorithms</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property enumerates encryption algorithms that a client may use to encrypt a value in the UserPassword property when creating or modifying an instance of CIM_Account. This capability is aimed at ensuring some measure of confidentiality when the password is transferred over an unencrypted transport protocol. An implementation may elect to accept only encrypted passwords, without regard to whether the transport protocol is encrypted. Similarly, a a client may elect to always provide encrypted passwords to implementations that accept either unencrypted or encrypted passwords, even if the underlying transport protocol is encrypted.
	 * See CIM_Account property UserPasswordEncryptionAlgorithm for a description of each enum value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported User Password Encryption Algorithms</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AccountManagementCapabilities_SupportedUserPasswordEncryptionAlgorithms()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"..\"]' Values='[\"None\",\"Other\",\"HTTP Digest MD5(A1)\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_Account.UserPasswordEncryptionAlgorithm\",\"CIM_AccountManagementCapabilities.OtherSupportedUserPasswordEncryptionAlgorithms\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedUserPasswordEncryptionAlgorithms();

	/**
	 * Returns the value of the '<em><b>User Password Encryption Salt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value unique to the specific WBEM server that may be used in the selected UserPassword encryption algorithm to ensure a value that is unique among all WBEM servers even if a user uses the same password on multiple WBEM servers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Password Encryption Salt</em>' attribute.
	 * @see #setUserPasswordEncryptionSalt(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_AccountManagementCapabilities_UserPasswordEncryptionSalt()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Account.UserPasswordEncryptionAlgorithm\"]'"
	 * @generated
	 */
	String getUserPasswordEncryptionSalt();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AccountManagementCapabilities#getUserPasswordEncryptionSalt <em>User Password Encryption Salt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Password Encryption Salt</em>' attribute.
	 * @see #getUserPasswordEncryptionSalt()
	 * @generated
	 */
	void setUserPasswordEncryptionSalt(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Accounts Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaximumAccountsSupported shall indicate the maximum number of accounts that may be managed by the associated instance of CIM_AccountManagementService. Note that if multiple instances of CIM_AccountManagementService manage the accounts of a system, the total maximum number of accounts supported on the system is the sum of MaximumAccountsSupported for all of the instances of CIM_AccountManagementService. A value of zero shall indicate that the maximum number of accounts is unknown or that a maximum number of accounts is not enforced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Accounts Supported</em>' attribute.
	 * @see #setMaximumAccountsSupported(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_AccountManagementCapabilities_MaximumAccountsSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumAccountsSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AccountManagementCapabilities#getMaximumAccountsSupported <em>Maximum Accounts Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Accounts Supported</em>' attribute.
	 * @see #getMaximumAccountsSupported()
	 * @generated
	 */
	void setMaximumAccountsSupported(Integer value);

	/**
	 * Returns the value of the '<em><b>Supported User Password Encodings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property enumerates encoding algorithms that a client may use to encode the UserPassword property when creating or modifying an instance of CIM_Account. See CIM_Account property UserPasswordEncoding for a description of each enum value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported User Password Encodings</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AccountManagementCapabilities_SupportedUserPasswordEncodings()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"65536..4294967295\"]' Values='[\"ascii\",\"kbd\",\"pin\",\"UTF-8\",\"UTF-16\",\"UTF-16LE\",\"UTF-16BE\",\"UCS-2\",\"UCS-2LE\",\"UCS-2BE\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_Account.UserPasswordEncoding\"]'"
	 * @generated
	 */
	EList<Long> getSupportedUserPasswordEncodings();

} // CIM_AccountManagementCapabilities

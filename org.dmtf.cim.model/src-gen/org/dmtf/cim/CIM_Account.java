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
 * A representation of the model object '<em><b>CIM Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_Account is the information held by a SecurityService to track identity and privileges managed by that service. Common examples of an Account are the entries in a UNIX /etc/passwd file. Several kinds of security services use various information from those entries - the /bin/login program uses the account name ('root') and hashed password to authenticate users, and the file service, for instance, uses the UserID field ('0') and GroupID field ('0') to record ownership and determine access control privileges on files in the file system. This class is defined so as to incorporate commonly-used LDAP attributes to permit implementations to easily derive this information from LDAP-accessible directories. 
 * 
 * The semantics of Account overlap with that of the class, CIM_Identity. However, aspects of Account - such as its specific tie to a System - are valuable and have been widely implemented. For this reason, the Account and Identity classes are associated using a subclass of LogicalIdentity (AccountIdentity), instead of deprecating the Account class in the CIM Schema. When an Account has been authenticated, the corresponding Identity's TrustEstablished Boolean would be set to TRUE. Then, the Identity class can be used as defined for authorization purposes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Account#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getUserID <em>User ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getHost <em>Host</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getLocalityName <em>Locality Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getOU <em>OU</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getSeeAlso <em>See Also</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getUserCertificate <em>User Certificate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getUserPassword <em>User Password</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getUserPasswordEncryptionAlgorithm <em>User Password Encryption Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getOtherUserPasswordEncryptionAlgorithm <em>Other User Password Encryption Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getComplexPasswordRulesEnforced <em>Complex Password Rules Enforced</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getInactivityTimeout <em>Inactivity Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getLastLogin <em>Last Login</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getMaximumSuccessiveLoginFailures <em>Maximum Successive Login Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getPasswordExpiration <em>Password Expiration</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getPasswordHistoryDepth <em>Password History Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Account#getUserPasswordEncoding <em>User Password Encoding</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Account()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.35.0' UMLPackagePath='CIM::User::Account' override.Name='string' override.Name.Key='true' override.Name.Description='The Name property defines the label by which the object is known. The value of this property may be set to be the same as that of the UserID property or, in the case of an LDAP-derived instance, the Name property value may be set to the distinguishedName of the LDAP-accessed object instance.' override.Name.MaxLen='1024' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_Account extends CIM_EnabledLogicalElement {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's CCN.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_System.CreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Account#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_System.Name'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Account#getSystemName <em>System Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Account#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UserID is the value used by the SecurityService to represent identity. For an authentication service, the UserID may be the name of the user, or for an authorization service the value which serves as a handle to a mapping of the identity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_UserID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256'"
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Account#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

	/**
	 * Returns the value of the '<em><b>Object Class</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of an LDAP-derived instance, the ObjectClass property value(s) may be set to the objectClass attribute values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Class</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_ObjectClass()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getObjectClass();

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Descriptions property values may contain human-readable descriptions of the object. In the case of an LDAP-derived instance, the description attribute may have multiple values that, therefore, cannot be placed in the inherited Description property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_Descriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='1024'"
	 * @generated
	 */
	EList<String> getDescriptions();

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the host name of the system(s) for which the account applies. The host name may be a fully-qualified DNS name or it may be an unqualified host name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_Host()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getHost();

	/**
	 * Returns the value of the '<em><b>Locality Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains the name of a locality, such as a city, county or other geographic region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locality Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_LocalityName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getLocalityName();

	/**
	 * Returns the value of the '<em><b>Organization Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the organization related to the account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_OrganizationName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true'"
	 * @generated
	 */
	EList<String> getOrganizationName();

	/**
	 * Returns the value of the '<em><b>OU</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of an organizational unit related to the account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OU</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_OU()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getOU();

	/**
	 * Returns the value of the '<em><b>See Also</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of an LDAP-derived instance, the SeeAlso property specifies distinguished name of other Directory objects which may be other aspects (in some sense) of the same real world object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>See Also</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_SeeAlso()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getSeeAlso();

	/**
	 * Returns the value of the '<em><b>User Certificate</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on inetOrgPerson and for directory compatibility, the UserCertificate property may be used to specify a public key certificate for the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Certificate</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_UserCertificate()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getUserCertificate();

	/**
	 * Returns the value of the '<em><b>User Password</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of an LDAP-derived instance, the UserPassword property may contain an encrypted password used to access the person's resources in a directory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Password</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_UserPassword()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getUserPassword();

	/**
	 * Returns the value of the '<em><b>User Password Encryption Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encryption algorithm (if any) used by the client to produce the value in the UserPassword property when creating or modifying an instance of CIM_Account. The original password is encrypted using the algorithm specified in this property, and UserPassword contains the resulting encrypted value. In response to an operation request that would return the value of the UserPassword property to a client, an implementation shall instead return an array of length zero.
	 * The value of UserPasswordEncryptionAlgorithm in an instance of CIM_Account shall be 0 ("None") unless the SupportedUserPasswordEncryptionAlgorithms[] property in the CIM_AccountManagementCapabilities instance associated with the CIM_AccountManagementService instance associated with the CIM_Account instance contains a non-null entry other than 0 ("None").
	 * This property does not prevent the use of encryption at the transport, network, or data-link layer to protect communications between a management client and the server, nor is it meant to encourage communications without such encryption.
	 * The supported values for this property are:
	 * - 0 ("None"): Indicates that the contents of UserPassword are not encrypted.
	 * - 1 ("Other"): Indicates that the contents of UserPassword are encrypted using an algorithm not specifically identified in the value map for this property, and that this algorithm is described in OtherUserPasswordEncryptionAlgorithm.
	 * - 2 ("HTTP Digest MD5(A1)"): The MD5 hash algorithm, applied to the string A1 defined in RFC2617 as the concatenation username-value ":" realm-value ":" passwd, where username-value is provided by the client as the value of the UserID property. passwd is the underlying user password. realm-value is the HTTP digest realm value, and is provided by the server. The semantics of the HTTP digest realm are specified in RFC 2617. The server may surface the realm-value in the UserPasswordEncryptionSalt property of CIM_AccountManagementCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Password Encryption Algorithm</em>' attribute.
	 * @see #setUserPasswordEncryptionAlgorithm(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_UserPasswordEncryptionAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"..\"]' Values='[\"None\",\"Other\",\"HTTP Digest MD5(A1)\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_Account.UserPassword\",\"CIM_Account.OtherUserPasswordEncryptionAlgorithm\",\"CIM_AccountManagementCapabilities.SupportedUserPasswordEncryptionAlgorithms\",\"CIM_AccountManagementCapabilities.UserPasswordEncryptionSalt\"]'"
	 * @generated
	 */
	Integer getUserPasswordEncryptionAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Account#getUserPasswordEncryptionAlgorithm <em>User Password Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Password Encryption Algorithm</em>' attribute.
	 * @see #getUserPasswordEncryptionAlgorithm()
	 * @generated
	 */
	void setUserPasswordEncryptionAlgorithm(Integer value);

	/**
	 * Returns the value of the '<em><b>Other User Password Encryption Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the UserPasswordEncryptionAlgorithm property is set to 1 ("Other") this property contains a free form string that provides more information about the encryption algorithm. If UserPasswordEncryptionAlgorithm is not set to 1 ("Other") this property has no meaning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other User Password Encryption Algorithm</em>' attribute.
	 * @see #setOtherUserPasswordEncryptionAlgorithm(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_OtherUserPasswordEncryptionAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_Account.UserPasswordEncryptionAlgorithm\"]'"
	 * @generated
	 */
	String getOtherUserPasswordEncryptionAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Account#getOtherUserPasswordEncryptionAlgorithm <em>Other User Password Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other User Password Encryption Algorithm</em>' attribute.
	 * @see #getOtherUserPasswordEncryptionAlgorithm()
	 * @generated
	 */
	void setOtherUserPasswordEncryptionAlgorithm(String value);

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
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_ComplexPasswordRulesEnforced()
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
	 * InactivityTimeout specifies the interval after which if an account has been inactive, it shall be Disabled. The value may be expressed in interval format, as an absolute date-time, or be NULL.
	 * An absolute date-time shall indicate when the password will be disabled due to inactivity.
	 * An interval value shall indicate the time remaining before the password is disabled due to inactivity.
	 * A value of NULL shall indicate that the Account will not be disabled due to inactivity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inactivity Timeout</em>' attribute.
	 * @see #setInactivityTimeout(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_InactivityTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getInactivityTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Account#getInactivityTimeout <em>Inactivity Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactivity Timeout</em>' attribute.
	 * @see #getInactivityTimeout()
	 * @generated
	 */
	void setInactivityTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Last Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LastLogin shall be an absolute date-time that specifies the last successful authentication that occurred for this Account.A value of 99990101000000.000000+000 shall indicate the Account has never been used. A value of NULL shall indicate the last successful login is unknown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Login</em>' attribute.
	 * @see #setLastLogin(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_LastLogin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getLastLogin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Account#getLastLogin <em>Last Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Login</em>' attribute.
	 * @see #getLastLogin()
	 * @generated
	 */
	void setLastLogin(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Successive Login Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaximumSuccessiveLoginFailures indicates the number of successive failed login attempts that shall result in the Account being disabled. A value of zero shall indicate that the Account will not be disabled due to successive failed login attempts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Successive Login Failures</em>' attribute.
	 * @see #setMaximumSuccessiveLoginFailures(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_MaximumSuccessiveLoginFailures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumSuccessiveLoginFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Account#getMaximumSuccessiveLoginFailures <em>Maximum Successive Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Successive Login Failures</em>' attribute.
	 * @see #getMaximumSuccessiveLoginFailures()
	 * @generated
	 */
	void setMaximumSuccessiveLoginFailures(Integer value);

	/**
	 * Returns the value of the '<em><b>Password Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PasswordExpiration indicates the maximum password age enforced for the Account. The value may be expressed as an absolute date-time as an interval, or may be NULL.
	 * An absolute date-time shall indicate the date and time when the password will expire.
	 * An interval value shall indicate the time remaining until the password expires.
	 * A value of NULL shall indicate the password never expires.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password Expiration</em>' attribute.
	 * @see #setPasswordExpiration(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_PasswordExpiration()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getPasswordExpiration();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Account#getPasswordExpiration <em>Password Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Expiration</em>' attribute.
	 * @see #getPasswordExpiration()
	 * @generated
	 */
	void setPasswordExpiration(String value);

	/**
	 * Returns the value of the '<em><b>Password History Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PasswordHistoryDepth indicates the number of previous passwords that shall be maintained for the Account. The Account shall preclude the selection of a password if it occurs in the password history. A value of zero shall indicate that a password history is not maintained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password History Depth</em>' attribute.
	 * @see #setPasswordHistoryDepth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_PasswordHistoryDepth()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getPasswordHistoryDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Account#getPasswordHistoryDepth <em>Password History Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password History Depth</em>' attribute.
	 * @see #getPasswordHistoryDepth()
	 * @generated
	 */
	void setPasswordHistoryDepth(Integer value);

	/**
	 * Returns the value of the '<em><b>User Password Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UserPasswordEncoding specifies encoding used for the UserPassword property.
	 * "kbd" denotes a string in hexadecimal format containing keyboard scan code input. An example of a UserPassword structured in this format would be "321539191E1F1F11181320", which is the representation of "my password" in US English keyboard scan codes.
	 * "
	 * ascii" denotes clear text that complies with the ASCII character set. An example would be "my password".
	 * "pin" denotes that only numeric input in ASCII text is allowed for the UserPassword. An example would be "1234".
	 * "UTF-8" denotes that the UserPassword is a Unicode string that is encoded using UTF-8 character set.
	 * "UTF-16" denotes that the UserPassword is a Unicode string that is encoded using UTF-16 character set. The byte order mark (BOM) shall be the first character of the string.
	 * "UTF-16LE" denotes that the UserPassword is a Unicode string that is encoded using UTF-16 character set in little-endian byte order.
	 * "UTF-16BE" denotes that the UserPassword is a Unicode string that is encoded using UTF-16 character set in big-endian byte order.
	 * "UCS-2" denotes that the UserPassword is a Unicode string that is encoded using UCS-2 character set.
	 * "UCS-2LE" denotes that the UserPassword is a Unicode string that is encoded using UCS-2 character set in little endian byte order.
	 * "UCS-2BE" denotes that the UserPassword is a Unicode string that is encoded using UCS-2 character set in big endian byte order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Password Encoding</em>' attribute.
	 * @see #setUserPasswordEncoding(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Account_UserPasswordEncoding()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"65536..4294967295\"]' Values='[\"ascii\",\"kbd\",\"pin\",\"UTF-8\",\"UTF-16\",\"UTF-16LE\",\"UTF-16BE\",\"UCS-2\",\"USC-2LE\",\"UCS-2BE\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long getUserPasswordEncoding();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Account#getUserPasswordEncoding <em>User Password Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Password Encoding</em>' attribute.
	 * @see #getUserPasswordEncoding()
	 * @generated
	 */
	void setUserPasswordEncoding(Long value);

} // CIM_Account

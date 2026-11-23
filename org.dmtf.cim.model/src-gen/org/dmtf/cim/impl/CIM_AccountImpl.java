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
package org.dmtf.cim.impl;

import java.util.Collection;

import org.dmtf.cim.CIM_Account;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getHost <em>Host</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getLocalityName <em>Locality Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getOU <em>OU</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getSeeAlso <em>See Also</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getUserCertificate <em>User Certificate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getUserPassword <em>User Password</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getUserPasswordEncryptionAlgorithm <em>User Password Encryption Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getOtherUserPasswordEncryptionAlgorithm <em>Other User Password Encryption Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getComplexPasswordRulesEnforced <em>Complex Password Rules Enforced</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getInactivityTimeout <em>Inactivity Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getLastLogin <em>Last Login</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getMaximumSuccessiveLoginFailures <em>Maximum Successive Login Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getPasswordExpiration <em>Password Expiration</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getPasswordHistoryDepth <em>Password History Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountImpl#getUserPasswordEncoding <em>User Password Encoding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AccountImpl extends CIM_EnabledLogicalElementImpl implements CIM_Account {
	/**
	 * The default value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemCreationClassName() <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String systemCreationClassName = SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected String userID = USER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjectClass() <em>Object Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClass()
	 * @generated
	 * @ordered
	 */
	protected EList<String> objectClass;

	/**
	 * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> descriptions;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected EList<String> host;

	/**
	 * The cached value of the '{@link #getLocalityName() <em>Locality Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalityName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> localityName;

	/**
	 * The cached value of the '{@link #getOrganizationName() <em>Organization Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> organizationName;

	/**
	 * The cached value of the '{@link #getOU() <em>OU</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOU()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ou;

	/**
	 * The cached value of the '{@link #getSeeAlso() <em>See Also</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeeAlso()
	 * @generated
	 * @ordered
	 */
	protected EList<String> seeAlso;

	/**
	 * The cached value of the '{@link #getUserCertificate() <em>User Certificate</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserCertificate()
	 * @generated
	 * @ordered
	 */
	protected EList<String> userCertificate;

	/**
	 * The cached value of the '{@link #getUserPassword() <em>User Password</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPassword()
	 * @generated
	 * @ordered
	 */
	protected EList<String> userPassword;

	/**
	 * The default value of the '{@link #getUserPasswordEncryptionAlgorithm() <em>User Password Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPasswordEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USER_PASSWORD_ENCRYPTION_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserPasswordEncryptionAlgorithm() <em>User Password Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPasswordEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected Integer userPasswordEncryptionAlgorithm = USER_PASSWORD_ENCRYPTION_ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherUserPasswordEncryptionAlgorithm() <em>Other User Password Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherUserPasswordEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_USER_PASSWORD_ENCRYPTION_ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherUserPasswordEncryptionAlgorithm() <em>Other User Password Encryption Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherUserPasswordEncryptionAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String otherUserPasswordEncryptionAlgorithm = OTHER_USER_PASSWORD_ENCRYPTION_ALGORITHM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComplexPasswordRulesEnforced() <em>Complex Password Rules Enforced</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexPasswordRulesEnforced()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> complexPasswordRulesEnforced;

	/**
	 * The default value of the '{@link #getInactivityTimeout() <em>Inactivity Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactivityTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String INACTIVITY_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInactivityTimeout() <em>Inactivity Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactivityTimeout()
	 * @generated
	 * @ordered
	 */
	protected String inactivityTimeout = INACTIVITY_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastLogin() <em>Last Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastLogin() <em>Last Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastLogin()
	 * @generated
	 * @ordered
	 */
	protected String lastLogin = LAST_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumSuccessiveLoginFailures() <em>Maximum Successive Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSuccessiveLoginFailures()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_SUCCESSIVE_LOGIN_FAILURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumSuccessiveLoginFailures() <em>Maximum Successive Login Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSuccessiveLoginFailures()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumSuccessiveLoginFailures = MAXIMUM_SUCCESSIVE_LOGIN_FAILURES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordExpiration() <em>Password Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordExpiration()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EXPIRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPasswordExpiration() <em>Password Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordExpiration()
	 * @generated
	 * @ordered
	 */
	protected String passwordExpiration = PASSWORD_EXPIRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPasswordHistoryDepth() <em>Password History Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordHistoryDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PASSWORD_HISTORY_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPasswordHistoryDepth() <em>Password History Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordHistoryDepth()
	 * @generated
	 * @ordered
	 */
	protected Integer passwordHistoryDepth = PASSWORD_HISTORY_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserPasswordEncoding() <em>User Password Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPasswordEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final Long USER_PASSWORD_ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserPasswordEncoding() <em>User Password Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPasswordEncoding()
	 * @generated
	 * @ordered
	 */
	protected Long userPasswordEncoding = USER_PASSWORD_ENCODING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Account();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemCreationClassName() {
		return systemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemCreationClassName(String newSystemCreationClassName) {
		String oldSystemCreationClassName = systemCreationClassName;
		systemCreationClassName = newSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT__SYSTEM_CREATION_CLASS_NAME, oldSystemCreationClassName, systemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserID(String newUserID) {
		String oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT__USER_ID, oldUserID, userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getObjectClass() {
		if (objectClass == null) {
			objectClass = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ACCOUNT__OBJECT_CLASS);
		}
		return objectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDescriptions() {
		if (descriptions == null) {
			descriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ACCOUNT__DESCRIPTIONS);
		}
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getHost() {
		if (host == null) {
			host = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ACCOUNT__HOST);
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLocalityName() {
		if (localityName == null) {
			localityName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ACCOUNT__LOCALITY_NAME);
		}
		return localityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOrganizationName() {
		if (organizationName == null) {
			organizationName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ACCOUNT__ORGANIZATION_NAME);
		}
		return organizationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOU() {
		if (ou == null) {
			ou = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ACCOUNT__OU);
		}
		return ou;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSeeAlso() {
		if (seeAlso == null) {
			seeAlso = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ACCOUNT__SEE_ALSO);
		}
		return seeAlso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getUserCertificate() {
		if (userCertificate == null) {
			userCertificate = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ACCOUNT__USER_CERTIFICATE);
		}
		return userCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getUserPassword() {
		if (userPassword == null) {
			userPassword = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ACCOUNT__USER_PASSWORD);
		}
		return userPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUserPasswordEncryptionAlgorithm() {
		return userPasswordEncryptionAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPasswordEncryptionAlgorithm(Integer newUserPasswordEncryptionAlgorithm) {
		Integer oldUserPasswordEncryptionAlgorithm = userPasswordEncryptionAlgorithm;
		userPasswordEncryptionAlgorithm = newUserPasswordEncryptionAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT__USER_PASSWORD_ENCRYPTION_ALGORITHM, oldUserPasswordEncryptionAlgorithm, userPasswordEncryptionAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherUserPasswordEncryptionAlgorithm() {
		return otherUserPasswordEncryptionAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherUserPasswordEncryptionAlgorithm(String newOtherUserPasswordEncryptionAlgorithm) {
		String oldOtherUserPasswordEncryptionAlgorithm = otherUserPasswordEncryptionAlgorithm;
		otherUserPasswordEncryptionAlgorithm = newOtherUserPasswordEncryptionAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT__OTHER_USER_PASSWORD_ENCRYPTION_ALGORITHM, oldOtherUserPasswordEncryptionAlgorithm, otherUserPasswordEncryptionAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getComplexPasswordRulesEnforced() {
		if (complexPasswordRulesEnforced == null) {
			complexPasswordRulesEnforced = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ACCOUNT__COMPLEX_PASSWORD_RULES_ENFORCED);
		}
		return complexPasswordRulesEnforced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInactivityTimeout() {
		return inactivityTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInactivityTimeout(String newInactivityTimeout) {
		String oldInactivityTimeout = inactivityTimeout;
		inactivityTimeout = newInactivityTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT__INACTIVITY_TIMEOUT, oldInactivityTimeout, inactivityTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastLogin() {
		return lastLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastLogin(String newLastLogin) {
		String oldLastLogin = lastLogin;
		lastLogin = newLastLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT__LAST_LOGIN, oldLastLogin, lastLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaximumSuccessiveLoginFailures() {
		return maximumSuccessiveLoginFailures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumSuccessiveLoginFailures(Integer newMaximumSuccessiveLoginFailures) {
		Integer oldMaximumSuccessiveLoginFailures = maximumSuccessiveLoginFailures;
		maximumSuccessiveLoginFailures = newMaximumSuccessiveLoginFailures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT__MAXIMUM_SUCCESSIVE_LOGIN_FAILURES, oldMaximumSuccessiveLoginFailures, maximumSuccessiveLoginFailures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPasswordExpiration() {
		return passwordExpiration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPasswordExpiration(String newPasswordExpiration) {
		String oldPasswordExpiration = passwordExpiration;
		passwordExpiration = newPasswordExpiration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT__PASSWORD_EXPIRATION, oldPasswordExpiration, passwordExpiration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPasswordHistoryDepth() {
		return passwordHistoryDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPasswordHistoryDepth(Integer newPasswordHistoryDepth) {
		Integer oldPasswordHistoryDepth = passwordHistoryDepth;
		passwordHistoryDepth = newPasswordHistoryDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT__PASSWORD_HISTORY_DEPTH, oldPasswordHistoryDepth, passwordHistoryDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUserPasswordEncoding() {
		return userPasswordEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPasswordEncoding(Long newUserPasswordEncoding) {
		Long oldUserPasswordEncoding = userPasswordEncoding;
		userPasswordEncoding = newUserPasswordEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT__USER_PASSWORD_ENCODING, oldUserPasswordEncoding, userPasswordEncoding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ACCOUNT__SYSTEM_CREATION_CLASS_NAME:
				return getSystemCreationClassName();
			case CimPackage.CIM_ACCOUNT__SYSTEM_NAME:
				return getSystemName();
			case CimPackage.CIM_ACCOUNT__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_ACCOUNT__USER_ID:
				return getUserID();
			case CimPackage.CIM_ACCOUNT__OBJECT_CLASS:
				return getObjectClass();
			case CimPackage.CIM_ACCOUNT__DESCRIPTIONS:
				return getDescriptions();
			case CimPackage.CIM_ACCOUNT__HOST:
				return getHost();
			case CimPackage.CIM_ACCOUNT__LOCALITY_NAME:
				return getLocalityName();
			case CimPackage.CIM_ACCOUNT__ORGANIZATION_NAME:
				return getOrganizationName();
			case CimPackage.CIM_ACCOUNT__OU:
				return getOU();
			case CimPackage.CIM_ACCOUNT__SEE_ALSO:
				return getSeeAlso();
			case CimPackage.CIM_ACCOUNT__USER_CERTIFICATE:
				return getUserCertificate();
			case CimPackage.CIM_ACCOUNT__USER_PASSWORD:
				return getUserPassword();
			case CimPackage.CIM_ACCOUNT__USER_PASSWORD_ENCRYPTION_ALGORITHM:
				return getUserPasswordEncryptionAlgorithm();
			case CimPackage.CIM_ACCOUNT__OTHER_USER_PASSWORD_ENCRYPTION_ALGORITHM:
				return getOtherUserPasswordEncryptionAlgorithm();
			case CimPackage.CIM_ACCOUNT__COMPLEX_PASSWORD_RULES_ENFORCED:
				return getComplexPasswordRulesEnforced();
			case CimPackage.CIM_ACCOUNT__INACTIVITY_TIMEOUT:
				return getInactivityTimeout();
			case CimPackage.CIM_ACCOUNT__LAST_LOGIN:
				return getLastLogin();
			case CimPackage.CIM_ACCOUNT__MAXIMUM_SUCCESSIVE_LOGIN_FAILURES:
				return getMaximumSuccessiveLoginFailures();
			case CimPackage.CIM_ACCOUNT__PASSWORD_EXPIRATION:
				return getPasswordExpiration();
			case CimPackage.CIM_ACCOUNT__PASSWORD_HISTORY_DEPTH:
				return getPasswordHistoryDepth();
			case CimPackage.CIM_ACCOUNT__USER_PASSWORD_ENCODING:
				return getUserPasswordEncoding();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_ACCOUNT__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__SYSTEM_NAME:
				setSystemName((String)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__USER_ID:
				setUserID((String)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__OBJECT_CLASS:
				getObjectClass().clear();
				getObjectClass().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__DESCRIPTIONS:
				getDescriptions().clear();
				getDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__HOST:
				getHost().clear();
				getHost().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__LOCALITY_NAME:
				getLocalityName().clear();
				getLocalityName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__ORGANIZATION_NAME:
				getOrganizationName().clear();
				getOrganizationName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__OU:
				getOU().clear();
				getOU().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__SEE_ALSO:
				getSeeAlso().clear();
				getSeeAlso().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__USER_CERTIFICATE:
				getUserCertificate().clear();
				getUserCertificate().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__USER_PASSWORD:
				getUserPassword().clear();
				getUserPassword().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__USER_PASSWORD_ENCRYPTION_ALGORITHM:
				setUserPasswordEncryptionAlgorithm((Integer)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__OTHER_USER_PASSWORD_ENCRYPTION_ALGORITHM:
				setOtherUserPasswordEncryptionAlgorithm((String)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__COMPLEX_PASSWORD_RULES_ENFORCED:
				getComplexPasswordRulesEnforced().clear();
				getComplexPasswordRulesEnforced().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__INACTIVITY_TIMEOUT:
				setInactivityTimeout((String)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__LAST_LOGIN:
				setLastLogin((String)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__MAXIMUM_SUCCESSIVE_LOGIN_FAILURES:
				setMaximumSuccessiveLoginFailures((Integer)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__PASSWORD_EXPIRATION:
				setPasswordExpiration((String)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__PASSWORD_HISTORY_DEPTH:
				setPasswordHistoryDepth((Integer)newValue);
				return;
			case CimPackage.CIM_ACCOUNT__USER_PASSWORD_ENCODING:
				setUserPasswordEncoding((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_ACCOUNT__SYSTEM_CREATION_CLASS_NAME:
				setSystemCreationClassName(SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT__SYSTEM_NAME:
				setSystemName(SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT__OBJECT_CLASS:
				getObjectClass().clear();
				return;
			case CimPackage.CIM_ACCOUNT__DESCRIPTIONS:
				getDescriptions().clear();
				return;
			case CimPackage.CIM_ACCOUNT__HOST:
				getHost().clear();
				return;
			case CimPackage.CIM_ACCOUNT__LOCALITY_NAME:
				getLocalityName().clear();
				return;
			case CimPackage.CIM_ACCOUNT__ORGANIZATION_NAME:
				getOrganizationName().clear();
				return;
			case CimPackage.CIM_ACCOUNT__OU:
				getOU().clear();
				return;
			case CimPackage.CIM_ACCOUNT__SEE_ALSO:
				getSeeAlso().clear();
				return;
			case CimPackage.CIM_ACCOUNT__USER_CERTIFICATE:
				getUserCertificate().clear();
				return;
			case CimPackage.CIM_ACCOUNT__USER_PASSWORD:
				getUserPassword().clear();
				return;
			case CimPackage.CIM_ACCOUNT__USER_PASSWORD_ENCRYPTION_ALGORITHM:
				setUserPasswordEncryptionAlgorithm(USER_PASSWORD_ENCRYPTION_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT__OTHER_USER_PASSWORD_ENCRYPTION_ALGORITHM:
				setOtherUserPasswordEncryptionAlgorithm(OTHER_USER_PASSWORD_ENCRYPTION_ALGORITHM_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT__COMPLEX_PASSWORD_RULES_ENFORCED:
				getComplexPasswordRulesEnforced().clear();
				return;
			case CimPackage.CIM_ACCOUNT__INACTIVITY_TIMEOUT:
				setInactivityTimeout(INACTIVITY_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT__LAST_LOGIN:
				setLastLogin(LAST_LOGIN_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT__MAXIMUM_SUCCESSIVE_LOGIN_FAILURES:
				setMaximumSuccessiveLoginFailures(MAXIMUM_SUCCESSIVE_LOGIN_FAILURES_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT__PASSWORD_EXPIRATION:
				setPasswordExpiration(PASSWORD_EXPIRATION_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT__PASSWORD_HISTORY_DEPTH:
				setPasswordHistoryDepth(PASSWORD_HISTORY_DEPTH_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT__USER_PASSWORD_ENCODING:
				setUserPasswordEncoding(USER_PASSWORD_ENCODING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_ACCOUNT__SYSTEM_CREATION_CLASS_NAME:
				return SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? systemCreationClassName != null : !SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(systemCreationClassName);
			case CimPackage.CIM_ACCOUNT__SYSTEM_NAME:
				return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
			case CimPackage.CIM_ACCOUNT__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_ACCOUNT__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case CimPackage.CIM_ACCOUNT__OBJECT_CLASS:
				return objectClass != null && !objectClass.isEmpty();
			case CimPackage.CIM_ACCOUNT__DESCRIPTIONS:
				return descriptions != null && !descriptions.isEmpty();
			case CimPackage.CIM_ACCOUNT__HOST:
				return host != null && !host.isEmpty();
			case CimPackage.CIM_ACCOUNT__LOCALITY_NAME:
				return localityName != null && !localityName.isEmpty();
			case CimPackage.CIM_ACCOUNT__ORGANIZATION_NAME:
				return organizationName != null && !organizationName.isEmpty();
			case CimPackage.CIM_ACCOUNT__OU:
				return ou != null && !ou.isEmpty();
			case CimPackage.CIM_ACCOUNT__SEE_ALSO:
				return seeAlso != null && !seeAlso.isEmpty();
			case CimPackage.CIM_ACCOUNT__USER_CERTIFICATE:
				return userCertificate != null && !userCertificate.isEmpty();
			case CimPackage.CIM_ACCOUNT__USER_PASSWORD:
				return userPassword != null && !userPassword.isEmpty();
			case CimPackage.CIM_ACCOUNT__USER_PASSWORD_ENCRYPTION_ALGORITHM:
				return USER_PASSWORD_ENCRYPTION_ALGORITHM_EDEFAULT == null ? userPasswordEncryptionAlgorithm != null : !USER_PASSWORD_ENCRYPTION_ALGORITHM_EDEFAULT.equals(userPasswordEncryptionAlgorithm);
			case CimPackage.CIM_ACCOUNT__OTHER_USER_PASSWORD_ENCRYPTION_ALGORITHM:
				return OTHER_USER_PASSWORD_ENCRYPTION_ALGORITHM_EDEFAULT == null ? otherUserPasswordEncryptionAlgorithm != null : !OTHER_USER_PASSWORD_ENCRYPTION_ALGORITHM_EDEFAULT.equals(otherUserPasswordEncryptionAlgorithm);
			case CimPackage.CIM_ACCOUNT__COMPLEX_PASSWORD_RULES_ENFORCED:
				return complexPasswordRulesEnforced != null && !complexPasswordRulesEnforced.isEmpty();
			case CimPackage.CIM_ACCOUNT__INACTIVITY_TIMEOUT:
				return INACTIVITY_TIMEOUT_EDEFAULT == null ? inactivityTimeout != null : !INACTIVITY_TIMEOUT_EDEFAULT.equals(inactivityTimeout);
			case CimPackage.CIM_ACCOUNT__LAST_LOGIN:
				return LAST_LOGIN_EDEFAULT == null ? lastLogin != null : !LAST_LOGIN_EDEFAULT.equals(lastLogin);
			case CimPackage.CIM_ACCOUNT__MAXIMUM_SUCCESSIVE_LOGIN_FAILURES:
				return MAXIMUM_SUCCESSIVE_LOGIN_FAILURES_EDEFAULT == null ? maximumSuccessiveLoginFailures != null : !MAXIMUM_SUCCESSIVE_LOGIN_FAILURES_EDEFAULT.equals(maximumSuccessiveLoginFailures);
			case CimPackage.CIM_ACCOUNT__PASSWORD_EXPIRATION:
				return PASSWORD_EXPIRATION_EDEFAULT == null ? passwordExpiration != null : !PASSWORD_EXPIRATION_EDEFAULT.equals(passwordExpiration);
			case CimPackage.CIM_ACCOUNT__PASSWORD_HISTORY_DEPTH:
				return PASSWORD_HISTORY_DEPTH_EDEFAULT == null ? passwordHistoryDepth != null : !PASSWORD_HISTORY_DEPTH_EDEFAULT.equals(passwordHistoryDepth);
			case CimPackage.CIM_ACCOUNT__USER_PASSWORD_ENCODING:
				return USER_PASSWORD_ENCODING_EDEFAULT == null ? userPasswordEncoding != null : !USER_PASSWORD_ENCODING_EDEFAULT.equals(userPasswordEncoding);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (SystemCreationClassName: ");
		result.append(systemCreationClassName);
		result.append(", SystemName: ");
		result.append(systemName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", UserID: ");
		result.append(userID);
		result.append(", ObjectClass: ");
		result.append(objectClass);
		result.append(", Descriptions: ");
		result.append(descriptions);
		result.append(", Host: ");
		result.append(host);
		result.append(", LocalityName: ");
		result.append(localityName);
		result.append(", OrganizationName: ");
		result.append(organizationName);
		result.append(", OU: ");
		result.append(ou);
		result.append(", SeeAlso: ");
		result.append(seeAlso);
		result.append(", UserCertificate: ");
		result.append(userCertificate);
		result.append(", UserPassword: ");
		result.append(userPassword);
		result.append(", UserPasswordEncryptionAlgorithm: ");
		result.append(userPasswordEncryptionAlgorithm);
		result.append(", OtherUserPasswordEncryptionAlgorithm: ");
		result.append(otherUserPasswordEncryptionAlgorithm);
		result.append(", ComplexPasswordRulesEnforced: ");
		result.append(complexPasswordRulesEnforced);
		result.append(", InactivityTimeout: ");
		result.append(inactivityTimeout);
		result.append(", LastLogin: ");
		result.append(lastLogin);
		result.append(", MaximumSuccessiveLoginFailures: ");
		result.append(maximumSuccessiveLoginFailures);
		result.append(", PasswordExpiration: ");
		result.append(passwordExpiration);
		result.append(", PasswordHistoryDepth: ");
		result.append(passwordHistoryDepth);
		result.append(", UserPasswordEncoding: ");
		result.append(userPasswordEncoding);
		result.append(')');
		return result.toString();
	}

} //CIM_AccountImpl

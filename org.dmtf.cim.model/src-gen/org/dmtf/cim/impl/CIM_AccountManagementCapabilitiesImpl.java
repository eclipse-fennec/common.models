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

import org.dmtf.cim.CIM_AccountManagementCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Account Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountManagementCapabilitiesImpl#getOperationsSupported <em>Operations Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountManagementCapabilitiesImpl#getOtherSupportedUserPasswordEncryptionAlgorithms <em>Other Supported User Password Encryption Algorithms</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountManagementCapabilitiesImpl#getSupportedUserPasswordEncryptionAlgorithms <em>Supported User Password Encryption Algorithms</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountManagementCapabilitiesImpl#getUserPasswordEncryptionSalt <em>User Password Encryption Salt</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountManagementCapabilitiesImpl#getMaximumAccountsSupported <em>Maximum Accounts Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountManagementCapabilitiesImpl#getSupportedUserPasswordEncodings <em>Supported User Password Encodings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AccountManagementCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_AccountManagementCapabilities {
	/**
	 * The cached value of the '{@link #getOperationsSupported() <em>Operations Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> operationsSupported;

	/**
	 * The cached value of the '{@link #getOtherSupportedUserPasswordEncryptionAlgorithms() <em>Other Supported User Password Encryption Algorithms</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedUserPasswordEncryptionAlgorithms()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedUserPasswordEncryptionAlgorithms;

	/**
	 * The cached value of the '{@link #getSupportedUserPasswordEncryptionAlgorithms() <em>Supported User Password Encryption Algorithms</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedUserPasswordEncryptionAlgorithms()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedUserPasswordEncryptionAlgorithms;

	/**
	 * The default value of the '{@link #getUserPasswordEncryptionSalt() <em>User Password Encryption Salt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPasswordEncryptionSalt()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_PASSWORD_ENCRYPTION_SALT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserPasswordEncryptionSalt() <em>User Password Encryption Salt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPasswordEncryptionSalt()
	 * @generated
	 * @ordered
	 */
	protected String userPasswordEncryptionSalt = USER_PASSWORD_ENCRYPTION_SALT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumAccountsSupported() <em>Maximum Accounts Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAccountsSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_ACCOUNTS_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumAccountsSupported() <em>Maximum Accounts Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAccountsSupported()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumAccountsSupported = MAXIMUM_ACCOUNTS_SUPPORTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedUserPasswordEncodings() <em>Supported User Password Encodings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedUserPasswordEncodings()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> supportedUserPasswordEncodings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AccountManagementCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AccountManagementCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getOperationsSupported() {
		if (operationsSupported == null) {
			operationsSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__OPERATIONS_SUPPORTED);
		}
		return operationsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedUserPasswordEncryptionAlgorithms() {
		if (otherSupportedUserPasswordEncryptionAlgorithms == null) {
			otherSupportedUserPasswordEncryptionAlgorithms = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__OTHER_SUPPORTED_USER_PASSWORD_ENCRYPTION_ALGORITHMS);
		}
		return otherSupportedUserPasswordEncryptionAlgorithms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedUserPasswordEncryptionAlgorithms() {
		if (supportedUserPasswordEncryptionAlgorithms == null) {
			supportedUserPasswordEncryptionAlgorithms = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__SUPPORTED_USER_PASSWORD_ENCRYPTION_ALGORITHMS);
		}
		return supportedUserPasswordEncryptionAlgorithms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserPasswordEncryptionSalt() {
		return userPasswordEncryptionSalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserPasswordEncryptionSalt(String newUserPasswordEncryptionSalt) {
		String oldUserPasswordEncryptionSalt = userPasswordEncryptionSalt;
		userPasswordEncryptionSalt = newUserPasswordEncryptionSalt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__USER_PASSWORD_ENCRYPTION_SALT, oldUserPasswordEncryptionSalt, userPasswordEncryptionSalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaximumAccountsSupported() {
		return maximumAccountsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumAccountsSupported(Integer newMaximumAccountsSupported) {
		Integer oldMaximumAccountsSupported = maximumAccountsSupported;
		maximumAccountsSupported = newMaximumAccountsSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__MAXIMUM_ACCOUNTS_SUPPORTED, oldMaximumAccountsSupported, maximumAccountsSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getSupportedUserPasswordEncodings() {
		if (supportedUserPasswordEncodings == null) {
			supportedUserPasswordEncodings = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__SUPPORTED_USER_PASSWORD_ENCODINGS);
		}
		return supportedUserPasswordEncodings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__OPERATIONS_SUPPORTED:
				return getOperationsSupported();
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__OTHER_SUPPORTED_USER_PASSWORD_ENCRYPTION_ALGORITHMS:
				return getOtherSupportedUserPasswordEncryptionAlgorithms();
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__SUPPORTED_USER_PASSWORD_ENCRYPTION_ALGORITHMS:
				return getSupportedUserPasswordEncryptionAlgorithms();
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__USER_PASSWORD_ENCRYPTION_SALT:
				return getUserPasswordEncryptionSalt();
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__MAXIMUM_ACCOUNTS_SUPPORTED:
				return getMaximumAccountsSupported();
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__SUPPORTED_USER_PASSWORD_ENCODINGS:
				return getSupportedUserPasswordEncodings();
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
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__OPERATIONS_SUPPORTED:
				getOperationsSupported().clear();
				getOperationsSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__OTHER_SUPPORTED_USER_PASSWORD_ENCRYPTION_ALGORITHMS:
				getOtherSupportedUserPasswordEncryptionAlgorithms().clear();
				getOtherSupportedUserPasswordEncryptionAlgorithms().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__SUPPORTED_USER_PASSWORD_ENCRYPTION_ALGORITHMS:
				getSupportedUserPasswordEncryptionAlgorithms().clear();
				getSupportedUserPasswordEncryptionAlgorithms().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__USER_PASSWORD_ENCRYPTION_SALT:
				setUserPasswordEncryptionSalt((String)newValue);
				return;
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__MAXIMUM_ACCOUNTS_SUPPORTED:
				setMaximumAccountsSupported((Integer)newValue);
				return;
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__SUPPORTED_USER_PASSWORD_ENCODINGS:
				getSupportedUserPasswordEncodings().clear();
				getSupportedUserPasswordEncodings().addAll((Collection<? extends Long>)newValue);
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
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__OPERATIONS_SUPPORTED:
				getOperationsSupported().clear();
				return;
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__OTHER_SUPPORTED_USER_PASSWORD_ENCRYPTION_ALGORITHMS:
				getOtherSupportedUserPasswordEncryptionAlgorithms().clear();
				return;
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__SUPPORTED_USER_PASSWORD_ENCRYPTION_ALGORITHMS:
				getSupportedUserPasswordEncryptionAlgorithms().clear();
				return;
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__USER_PASSWORD_ENCRYPTION_SALT:
				setUserPasswordEncryptionSalt(USER_PASSWORD_ENCRYPTION_SALT_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__MAXIMUM_ACCOUNTS_SUPPORTED:
				setMaximumAccountsSupported(MAXIMUM_ACCOUNTS_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__SUPPORTED_USER_PASSWORD_ENCODINGS:
				getSupportedUserPasswordEncodings().clear();
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
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__OPERATIONS_SUPPORTED:
				return operationsSupported != null && !operationsSupported.isEmpty();
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__OTHER_SUPPORTED_USER_PASSWORD_ENCRYPTION_ALGORITHMS:
				return otherSupportedUserPasswordEncryptionAlgorithms != null && !otherSupportedUserPasswordEncryptionAlgorithms.isEmpty();
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__SUPPORTED_USER_PASSWORD_ENCRYPTION_ALGORITHMS:
				return supportedUserPasswordEncryptionAlgorithms != null && !supportedUserPasswordEncryptionAlgorithms.isEmpty();
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__USER_PASSWORD_ENCRYPTION_SALT:
				return USER_PASSWORD_ENCRYPTION_SALT_EDEFAULT == null ? userPasswordEncryptionSalt != null : !USER_PASSWORD_ENCRYPTION_SALT_EDEFAULT.equals(userPasswordEncryptionSalt);
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__MAXIMUM_ACCOUNTS_SUPPORTED:
				return MAXIMUM_ACCOUNTS_SUPPORTED_EDEFAULT == null ? maximumAccountsSupported != null : !MAXIMUM_ACCOUNTS_SUPPORTED_EDEFAULT.equals(maximumAccountsSupported);
			case CimPackage.CIM_ACCOUNT_MANAGEMENT_CAPABILITIES__SUPPORTED_USER_PASSWORD_ENCODINGS:
				return supportedUserPasswordEncodings != null && !supportedUserPasswordEncodings.isEmpty();
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
		result.append(" (OperationsSupported: ");
		result.append(operationsSupported);
		result.append(", OtherSupportedUserPasswordEncryptionAlgorithms: ");
		result.append(otherSupportedUserPasswordEncryptionAlgorithms);
		result.append(", SupportedUserPasswordEncryptionAlgorithms: ");
		result.append(supportedUserPasswordEncryptionAlgorithms);
		result.append(", UserPasswordEncryptionSalt: ");
		result.append(userPasswordEncryptionSalt);
		result.append(", MaximumAccountsSupported: ");
		result.append(maximumAccountsSupported);
		result.append(", SupportedUserPasswordEncodings: ");
		result.append(supportedUserPasswordEncodings);
		result.append(')');
		return result.toString();
	}

} //CIM_AccountManagementCapabilitiesImpl

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

import org.dmtf.cim.CIM_AccountSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Account Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountSettingDataImpl#getComplexPasswordRulesEnforced <em>Complex Password Rules Enforced</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountSettingDataImpl#getInactivityTimeout <em>Inactivity Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountSettingDataImpl#getMaximumPasswordExpiration <em>Maximum Password Expiration</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountSettingDataImpl#getMaximumSuccessiveLoginFailures <em>Maximum Successive Login Failures</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AccountSettingDataImpl#getPasswordHistoryDepth <em>Password History Depth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AccountSettingDataImpl extends CIM_SettingDataImpl implements CIM_AccountSettingData {
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
	 * The default value of the '{@link #getMaximumPasswordExpiration() <em>Maximum Password Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPasswordExpiration()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_PASSWORD_EXPIRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumPasswordExpiration() <em>Maximum Password Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPasswordExpiration()
	 * @generated
	 * @ordered
	 */
	protected String maximumPasswordExpiration = MAXIMUM_PASSWORD_EXPIRATION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AccountSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AccountSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getComplexPasswordRulesEnforced() {
		if (complexPasswordRulesEnforced == null) {
			complexPasswordRulesEnforced = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ACCOUNT_SETTING_DATA__COMPLEX_PASSWORD_RULES_ENFORCED);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT_SETTING_DATA__INACTIVITY_TIMEOUT, oldInactivityTimeout, inactivityTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaximumPasswordExpiration() {
		return maximumPasswordExpiration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumPasswordExpiration(String newMaximumPasswordExpiration) {
		String oldMaximumPasswordExpiration = maximumPasswordExpiration;
		maximumPasswordExpiration = newMaximumPasswordExpiration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT_SETTING_DATA__MAXIMUM_PASSWORD_EXPIRATION, oldMaximumPasswordExpiration, maximumPasswordExpiration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT_SETTING_DATA__MAXIMUM_SUCCESSIVE_LOGIN_FAILURES, oldMaximumSuccessiveLoginFailures, maximumSuccessiveLoginFailures));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ACCOUNT_SETTING_DATA__PASSWORD_HISTORY_DEPTH, oldPasswordHistoryDepth, passwordHistoryDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__COMPLEX_PASSWORD_RULES_ENFORCED:
				return getComplexPasswordRulesEnforced();
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__INACTIVITY_TIMEOUT:
				return getInactivityTimeout();
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__MAXIMUM_PASSWORD_EXPIRATION:
				return getMaximumPasswordExpiration();
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__MAXIMUM_SUCCESSIVE_LOGIN_FAILURES:
				return getMaximumSuccessiveLoginFailures();
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__PASSWORD_HISTORY_DEPTH:
				return getPasswordHistoryDepth();
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
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__COMPLEX_PASSWORD_RULES_ENFORCED:
				getComplexPasswordRulesEnforced().clear();
				getComplexPasswordRulesEnforced().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__INACTIVITY_TIMEOUT:
				setInactivityTimeout((String)newValue);
				return;
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__MAXIMUM_PASSWORD_EXPIRATION:
				setMaximumPasswordExpiration((String)newValue);
				return;
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__MAXIMUM_SUCCESSIVE_LOGIN_FAILURES:
				setMaximumSuccessiveLoginFailures((Integer)newValue);
				return;
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__PASSWORD_HISTORY_DEPTH:
				setPasswordHistoryDepth((Integer)newValue);
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
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__COMPLEX_PASSWORD_RULES_ENFORCED:
				getComplexPasswordRulesEnforced().clear();
				return;
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__INACTIVITY_TIMEOUT:
				setInactivityTimeout(INACTIVITY_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__MAXIMUM_PASSWORD_EXPIRATION:
				setMaximumPasswordExpiration(MAXIMUM_PASSWORD_EXPIRATION_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__MAXIMUM_SUCCESSIVE_LOGIN_FAILURES:
				setMaximumSuccessiveLoginFailures(MAXIMUM_SUCCESSIVE_LOGIN_FAILURES_EDEFAULT);
				return;
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__PASSWORD_HISTORY_DEPTH:
				setPasswordHistoryDepth(PASSWORD_HISTORY_DEPTH_EDEFAULT);
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
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__COMPLEX_PASSWORD_RULES_ENFORCED:
				return complexPasswordRulesEnforced != null && !complexPasswordRulesEnforced.isEmpty();
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__INACTIVITY_TIMEOUT:
				return INACTIVITY_TIMEOUT_EDEFAULT == null ? inactivityTimeout != null : !INACTIVITY_TIMEOUT_EDEFAULT.equals(inactivityTimeout);
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__MAXIMUM_PASSWORD_EXPIRATION:
				return MAXIMUM_PASSWORD_EXPIRATION_EDEFAULT == null ? maximumPasswordExpiration != null : !MAXIMUM_PASSWORD_EXPIRATION_EDEFAULT.equals(maximumPasswordExpiration);
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__MAXIMUM_SUCCESSIVE_LOGIN_FAILURES:
				return MAXIMUM_SUCCESSIVE_LOGIN_FAILURES_EDEFAULT == null ? maximumSuccessiveLoginFailures != null : !MAXIMUM_SUCCESSIVE_LOGIN_FAILURES_EDEFAULT.equals(maximumSuccessiveLoginFailures);
			case CimPackage.CIM_ACCOUNT_SETTING_DATA__PASSWORD_HISTORY_DEPTH:
				return PASSWORD_HISTORY_DEPTH_EDEFAULT == null ? passwordHistoryDepth != null : !PASSWORD_HISTORY_DEPTH_EDEFAULT.equals(passwordHistoryDepth);
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
		result.append(" (ComplexPasswordRulesEnforced: ");
		result.append(complexPasswordRulesEnforced);
		result.append(", InactivityTimeout: ");
		result.append(inactivityTimeout);
		result.append(", MaximumPasswordExpiration: ");
		result.append(maximumPasswordExpiration);
		result.append(", MaximumSuccessiveLoginFailures: ");
		result.append(maximumSuccessiveLoginFailures);
		result.append(", PasswordHistoryDepth: ");
		result.append(passwordHistoryDepth);
		result.append(')');
		return result.toString();
	}

} //CIM_AccountSettingDataImpl

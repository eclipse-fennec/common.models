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

import org.dmtf.cim.CIM_IEEE8021xSettings;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IEEE802 1x Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IEEE8021xSettingsImpl#getAuthenticationProtocol <em>Authentication Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IEEE8021xSettingsImpl#getRoamingIdentity <em>Roaming Identity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IEEE8021xSettingsImpl#getServerCertificateName <em>Server Certificate Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IEEE8021xSettingsImpl#getServerCertificateNameComparison <em>Server Certificate Name Comparison</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IEEE8021xSettingsImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IEEE8021xSettingsImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IEEE8021xSettingsImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IEEE8021xSettingsImpl#getProtectedAccessCredential <em>Protected Access Credential</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IEEE8021xSettingsImpl#getPACPassword <em>PAC Password</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IEEE8021xSettingsImpl#getPSK <em>PSK</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IEEE8021xSettingsImpl extends CIM_SettingDataImpl implements CIM_IEEE8021xSettings {
	/**
	 * The default value of the '{@link #getAuthenticationProtocol() <em>Authentication Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AUTHENTICATION_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthenticationProtocol() <em>Authentication Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationProtocol()
	 * @generated
	 * @ordered
	 */
	protected Integer authenticationProtocol = AUTHENTICATION_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoamingIdentity() <em>Roaming Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoamingIdentity()
	 * @generated
	 * @ordered
	 */
	protected static final String ROAMING_IDENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoamingIdentity() <em>Roaming Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoamingIdentity()
	 * @generated
	 * @ordered
	 */
	protected String roamingIdentity = ROAMING_IDENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerCertificateName() <em>Server Certificate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerCertificateName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_CERTIFICATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerCertificateName() <em>Server Certificate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerCertificateName()
	 * @generated
	 * @ordered
	 */
	protected String serverCertificateName = SERVER_CERTIFICATE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerCertificateNameComparison() <em>Server Certificate Name Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerCertificateNameComparison()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SERVER_CERTIFICATE_NAME_COMPARISON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServerCertificateNameComparison() <em>Server Certificate Name Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerCertificateNameComparison()
	 * @generated
	 * @ordered
	 */
	protected Integer serverCertificateNameComparison = SERVER_CERTIFICATE_NAME_COMPARISON_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtectedAccessCredential() <em>Protected Access Credential</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectedAccessCredential()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> protectedAccessCredential;

	/**
	 * The default value of the '{@link #getPACPassword() <em>PAC Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPACPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PAC_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPACPassword() <em>PAC Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPACPassword()
	 * @generated
	 * @ordered
	 */
	protected String pacPassword = PAC_PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPSK() <em>PSK</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSK()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> psk;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IEEE8021xSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IEEE8021xSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAuthenticationProtocol() {
		return authenticationProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationProtocol(Integer newAuthenticationProtocol) {
		Integer oldAuthenticationProtocol = authenticationProtocol;
		authenticationProtocol = newAuthenticationProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IEEE802_1X_SETTINGS__AUTHENTICATION_PROTOCOL, oldAuthenticationProtocol, authenticationProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoamingIdentity() {
		return roamingIdentity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoamingIdentity(String newRoamingIdentity) {
		String oldRoamingIdentity = roamingIdentity;
		roamingIdentity = newRoamingIdentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IEEE802_1X_SETTINGS__ROAMING_IDENTITY, oldRoamingIdentity, roamingIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServerCertificateName() {
		return serverCertificateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerCertificateName(String newServerCertificateName) {
		String oldServerCertificateName = serverCertificateName;
		serverCertificateName = newServerCertificateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IEEE802_1X_SETTINGS__SERVER_CERTIFICATE_NAME, oldServerCertificateName, serverCertificateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getServerCertificateNameComparison() {
		return serverCertificateNameComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerCertificateNameComparison(Integer newServerCertificateNameComparison) {
		Integer oldServerCertificateNameComparison = serverCertificateNameComparison;
		serverCertificateNameComparison = newServerCertificateNameComparison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IEEE802_1X_SETTINGS__SERVER_CERTIFICATE_NAME_COMPARISON, oldServerCertificateNameComparison, serverCertificateNameComparison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IEEE802_1X_SETTINGS__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IEEE802_1X_SETTINGS__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IEEE802_1X_SETTINGS__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getProtectedAccessCredential() {
		if (protectedAccessCredential == null) {
			protectedAccessCredential = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_IEEE802_1X_SETTINGS__PROTECTED_ACCESS_CREDENTIAL);
		}
		return protectedAccessCredential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPACPassword() {
		return pacPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPACPassword(String newPACPassword) {
		String oldPACPassword = pacPassword;
		pacPassword = newPACPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IEEE802_1X_SETTINGS__PAC_PASSWORD, oldPACPassword, pacPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPSK() {
		if (psk == null) {
			psk = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_IEEE802_1X_SETTINGS__PSK);
		}
		return psk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IEEE802_1X_SETTINGS__AUTHENTICATION_PROTOCOL:
				return getAuthenticationProtocol();
			case CimPackage.CIM_IEEE802_1X_SETTINGS__ROAMING_IDENTITY:
				return getRoamingIdentity();
			case CimPackage.CIM_IEEE802_1X_SETTINGS__SERVER_CERTIFICATE_NAME:
				return getServerCertificateName();
			case CimPackage.CIM_IEEE802_1X_SETTINGS__SERVER_CERTIFICATE_NAME_COMPARISON:
				return getServerCertificateNameComparison();
			case CimPackage.CIM_IEEE802_1X_SETTINGS__USERNAME:
				return getUsername();
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PASSWORD:
				return getPassword();
			case CimPackage.CIM_IEEE802_1X_SETTINGS__DOMAIN:
				return getDomain();
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PROTECTED_ACCESS_CREDENTIAL:
				return getProtectedAccessCredential();
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PAC_PASSWORD:
				return getPACPassword();
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PSK:
				return getPSK();
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
			case CimPackage.CIM_IEEE802_1X_SETTINGS__AUTHENTICATION_PROTOCOL:
				setAuthenticationProtocol((Integer)newValue);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__ROAMING_IDENTITY:
				setRoamingIdentity((String)newValue);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__SERVER_CERTIFICATE_NAME:
				setServerCertificateName((String)newValue);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__SERVER_CERTIFICATE_NAME_COMPARISON:
				setServerCertificateNameComparison((Integer)newValue);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__USERNAME:
				setUsername((String)newValue);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PASSWORD:
				setPassword((String)newValue);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__DOMAIN:
				setDomain((String)newValue);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PROTECTED_ACCESS_CREDENTIAL:
				getProtectedAccessCredential().clear();
				getProtectedAccessCredential().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PAC_PASSWORD:
				setPACPassword((String)newValue);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PSK:
				getPSK().clear();
				getPSK().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_IEEE802_1X_SETTINGS__AUTHENTICATION_PROTOCOL:
				setAuthenticationProtocol(AUTHENTICATION_PROTOCOL_EDEFAULT);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__ROAMING_IDENTITY:
				setRoamingIdentity(ROAMING_IDENTITY_EDEFAULT);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__SERVER_CERTIFICATE_NAME:
				setServerCertificateName(SERVER_CERTIFICATE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__SERVER_CERTIFICATE_NAME_COMPARISON:
				setServerCertificateNameComparison(SERVER_CERTIFICATE_NAME_COMPARISON_EDEFAULT);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PROTECTED_ACCESS_CREDENTIAL:
				getProtectedAccessCredential().clear();
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PAC_PASSWORD:
				setPACPassword(PAC_PASSWORD_EDEFAULT);
				return;
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PSK:
				getPSK().clear();
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
			case CimPackage.CIM_IEEE802_1X_SETTINGS__AUTHENTICATION_PROTOCOL:
				return AUTHENTICATION_PROTOCOL_EDEFAULT == null ? authenticationProtocol != null : !AUTHENTICATION_PROTOCOL_EDEFAULT.equals(authenticationProtocol);
			case CimPackage.CIM_IEEE802_1X_SETTINGS__ROAMING_IDENTITY:
				return ROAMING_IDENTITY_EDEFAULT == null ? roamingIdentity != null : !ROAMING_IDENTITY_EDEFAULT.equals(roamingIdentity);
			case CimPackage.CIM_IEEE802_1X_SETTINGS__SERVER_CERTIFICATE_NAME:
				return SERVER_CERTIFICATE_NAME_EDEFAULT == null ? serverCertificateName != null : !SERVER_CERTIFICATE_NAME_EDEFAULT.equals(serverCertificateName);
			case CimPackage.CIM_IEEE802_1X_SETTINGS__SERVER_CERTIFICATE_NAME_COMPARISON:
				return SERVER_CERTIFICATE_NAME_COMPARISON_EDEFAULT == null ? serverCertificateNameComparison != null : !SERVER_CERTIFICATE_NAME_COMPARISON_EDEFAULT.equals(serverCertificateNameComparison);
			case CimPackage.CIM_IEEE802_1X_SETTINGS__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case CimPackage.CIM_IEEE802_1X_SETTINGS__DOMAIN:
				return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PROTECTED_ACCESS_CREDENTIAL:
				return protectedAccessCredential != null && !protectedAccessCredential.isEmpty();
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PAC_PASSWORD:
				return PAC_PASSWORD_EDEFAULT == null ? pacPassword != null : !PAC_PASSWORD_EDEFAULT.equals(pacPassword);
			case CimPackage.CIM_IEEE802_1X_SETTINGS__PSK:
				return psk != null && !psk.isEmpty();
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
		result.append(" (AuthenticationProtocol: ");
		result.append(authenticationProtocol);
		result.append(", RoamingIdentity: ");
		result.append(roamingIdentity);
		result.append(", ServerCertificateName: ");
		result.append(serverCertificateName);
		result.append(", ServerCertificateNameComparison: ");
		result.append(serverCertificateNameComparison);
		result.append(", Username: ");
		result.append(username);
		result.append(", Password: ");
		result.append(password);
		result.append(", Domain: ");
		result.append(domain);
		result.append(", ProtectedAccessCredential: ");
		result.append(protectedAccessCredential);
		result.append(", PACPassword: ");
		result.append(pacPassword);
		result.append(", PSK: ");
		result.append(psk);
		result.append(')');
		return result.toString();
	}

} //CIM_IEEE8021xSettingsImpl

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

import org.dmtf.cim.CIM_CIFSSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM CIFS Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getUseTCPOnly <em>Use TCP Only</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getNETBIOSName <em>NETBIOS Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getWINSIP <em>WINSIP</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getAuthenticationDomain <em>Authentication Domain</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getAuthenticationMode <em>Authentication Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getUseKerberos <em>Use Kerberos</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getUseOpportunisticLocking <em>Use Opportunistic Locking</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getSMBSigningOnly <em>SMB Signing Only</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getClientsConnectAnonymously <em>Clients Connect Anonymously</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getJoinDomainAnonymously <em>Join Domain Anonymously</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getDomainControllerUser <em>Domain Controller User</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getDomainControllerPassword <em>Domain Controller Password</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getCIFSDomainController <em>CIFS Domain Controller</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getCASupported <em>CA Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getMultiChannelSupported <em>Multi Channel Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_CIFSSettingDataImpl#getProtocolVersions <em>Protocol Versions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_CIFSSettingDataImpl extends CIM_SettingDataImpl implements CIM_CIFSSettingData {
	/**
	 * The default value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHARSET_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected Integer charset = CHARSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseTCPOnly() <em>Use TCP Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTCPOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_TCP_ONLY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUseTCPOnly() <em>Use TCP Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTCPOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean useTCPOnly = USE_TCP_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNETBIOSName() <em>NETBIOS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNETBIOSName()
	 * @generated
	 * @ordered
	 */
	protected static final String NETBIOS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNETBIOSName() <em>NETBIOS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNETBIOSName()
	 * @generated
	 * @ordered
	 */
	protected String netbiosName = NETBIOS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWINSIP() <em>WINSIP</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWINSIP()
	 * @generated
	 * @ordered
	 */
	protected EList<String> winsip;

	/**
	 * The default value of the '{@link #getAuthenticationDomain() <em>Authentication Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHENTICATION_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthenticationDomain() <em>Authentication Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationDomain()
	 * @generated
	 * @ordered
	 */
	protected String authenticationDomain = AUTHENTICATION_DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthenticationMode() <em>Authentication Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AUTHENTICATION_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthenticationMode() <em>Authentication Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationMode()
	 * @generated
	 * @ordered
	 */
	protected Integer authenticationMode = AUTHENTICATION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseKerberos() <em>Use Kerberos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseKerberos()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_KERBEROS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseKerberos() <em>Use Kerberos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseKerberos()
	 * @generated
	 * @ordered
	 */
	protected Boolean useKerberos = USE_KERBEROS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseOpportunisticLocking() <em>Use Opportunistic Locking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOpportunisticLocking()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_OPPORTUNISTIC_LOCKING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseOpportunisticLocking() <em>Use Opportunistic Locking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseOpportunisticLocking()
	 * @generated
	 * @ordered
	 */
	protected Boolean useOpportunisticLocking = USE_OPPORTUNISTIC_LOCKING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSMBSigningOnly() <em>SMB Signing Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMBSigningOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SMB_SIGNING_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSMBSigningOnly() <em>SMB Signing Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSMBSigningOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean smbSigningOnly = SMB_SIGNING_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientsConnectAnonymously() <em>Clients Connect Anonymously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientsConnectAnonymously()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CLIENTS_CONNECT_ANONYMOUSLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientsConnectAnonymously() <em>Clients Connect Anonymously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientsConnectAnonymously()
	 * @generated
	 * @ordered
	 */
	protected Boolean clientsConnectAnonymously = CLIENTS_CONNECT_ANONYMOUSLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getJoinDomainAnonymously() <em>Join Domain Anonymously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinDomainAnonymously()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean JOIN_DOMAIN_ANONYMOUSLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJoinDomainAnonymously() <em>Join Domain Anonymously</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinDomainAnonymously()
	 * @generated
	 * @ordered
	 */
	protected Boolean joinDomainAnonymously = JOIN_DOMAIN_ANONYMOUSLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainControllerUser() <em>Domain Controller User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainControllerUser()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_CONTROLLER_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainControllerUser() <em>Domain Controller User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainControllerUser()
	 * @generated
	 * @ordered
	 */
	protected String domainControllerUser = DOMAIN_CONTROLLER_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainControllerPassword() <em>Domain Controller Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainControllerPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_CONTROLLER_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainControllerPassword() <em>Domain Controller Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainControllerPassword()
	 * @generated
	 * @ordered
	 */
	protected String domainControllerPassword = DOMAIN_CONTROLLER_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCIFSDomainController() <em>CIFS Domain Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCIFSDomainController()
	 * @generated
	 * @ordered
	 */
	protected static final String CIFS_DOMAIN_CONTROLLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCIFSDomainController() <em>CIFS Domain Controller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCIFSDomainController()
	 * @generated
	 * @ordered
	 */
	protected String cifsDomainController = CIFS_DOMAIN_CONTROLLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCASupported() <em>CA Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCASupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CA_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCASupported() <em>CA Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCASupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean caSupported = CA_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiChannelSupported() <em>Multi Channel Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiChannelSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MULTI_CHANNEL_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiChannelSupported() <em>Multi Channel Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiChannelSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean multiChannelSupported = MULTI_CHANNEL_SUPPORTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtocolVersions() <em>Protocol Versions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> protocolVersions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_CIFSSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_CIFSSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled(Boolean newEnabled) {
		Boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCharset() {
		return charset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharset(Integer newCharset) {
		Integer oldCharset = charset;
		charset = newCharset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__CHARSET, oldCharset, charset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUseTCPOnly() {
		return useTCPOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseTCPOnly(Boolean newUseTCPOnly) {
		Boolean oldUseTCPOnly = useTCPOnly;
		useTCPOnly = newUseTCPOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__USE_TCP_ONLY, oldUseTCPOnly, useTCPOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNETBIOSName() {
		return netbiosName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNETBIOSName(String newNETBIOSName) {
		String oldNETBIOSName = netbiosName;
		netbiosName = newNETBIOSName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__NETBIOS_NAME, oldNETBIOSName, netbiosName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getWINSIP() {
		if (winsip == null) {
			winsip = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_CIFS_SETTING_DATA__WINSIP);
		}
		return winsip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthenticationDomain() {
		return authenticationDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationDomain(String newAuthenticationDomain) {
		String oldAuthenticationDomain = authenticationDomain;
		authenticationDomain = newAuthenticationDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__AUTHENTICATION_DOMAIN, oldAuthenticationDomain, authenticationDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAuthenticationMode() {
		return authenticationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthenticationMode(Integer newAuthenticationMode) {
		Integer oldAuthenticationMode = authenticationMode;
		authenticationMode = newAuthenticationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__AUTHENTICATION_MODE, oldAuthenticationMode, authenticationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUseKerberos() {
		return useKerberos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseKerberos(Boolean newUseKerberos) {
		Boolean oldUseKerberos = useKerberos;
		useKerberos = newUseKerberos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__USE_KERBEROS, oldUseKerberos, useKerberos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUseOpportunisticLocking() {
		return useOpportunisticLocking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseOpportunisticLocking(Boolean newUseOpportunisticLocking) {
		Boolean oldUseOpportunisticLocking = useOpportunisticLocking;
		useOpportunisticLocking = newUseOpportunisticLocking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__USE_OPPORTUNISTIC_LOCKING, oldUseOpportunisticLocking, useOpportunisticLocking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSMBSigningOnly() {
		return smbSigningOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSMBSigningOnly(Boolean newSMBSigningOnly) {
		Boolean oldSMBSigningOnly = smbSigningOnly;
		smbSigningOnly = newSMBSigningOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__SMB_SIGNING_ONLY, oldSMBSigningOnly, smbSigningOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getClientsConnectAnonymously() {
		return clientsConnectAnonymously;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientsConnectAnonymously(Boolean newClientsConnectAnonymously) {
		Boolean oldClientsConnectAnonymously = clientsConnectAnonymously;
		clientsConnectAnonymously = newClientsConnectAnonymously;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__CLIENTS_CONNECT_ANONYMOUSLY, oldClientsConnectAnonymously, clientsConnectAnonymously));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getJoinDomainAnonymously() {
		return joinDomainAnonymously;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJoinDomainAnonymously(Boolean newJoinDomainAnonymously) {
		Boolean oldJoinDomainAnonymously = joinDomainAnonymously;
		joinDomainAnonymously = newJoinDomainAnonymously;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__JOIN_DOMAIN_ANONYMOUSLY, oldJoinDomainAnonymously, joinDomainAnonymously));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainControllerUser() {
		return domainControllerUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainControllerUser(String newDomainControllerUser) {
		String oldDomainControllerUser = domainControllerUser;
		domainControllerUser = newDomainControllerUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__DOMAIN_CONTROLLER_USER, oldDomainControllerUser, domainControllerUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainControllerPassword() {
		return domainControllerPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainControllerPassword(String newDomainControllerPassword) {
		String oldDomainControllerPassword = domainControllerPassword;
		domainControllerPassword = newDomainControllerPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__DOMAIN_CONTROLLER_PASSWORD, oldDomainControllerPassword, domainControllerPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCIFSDomainController() {
		return cifsDomainController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIFSDomainController(String newCIFSDomainController) {
		String oldCIFSDomainController = cifsDomainController;
		cifsDomainController = newCIFSDomainController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__CIFS_DOMAIN_CONTROLLER, oldCIFSDomainController, cifsDomainController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCASupported() {
		return caSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCASupported(Boolean newCASupported) {
		Boolean oldCASupported = caSupported;
		caSupported = newCASupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__CA_SUPPORTED, oldCASupported, caSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMultiChannelSupported() {
		return multiChannelSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiChannelSupported(Boolean newMultiChannelSupported) {
		Boolean oldMultiChannelSupported = multiChannelSupported;
		multiChannelSupported = newMultiChannelSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CIFS_SETTING_DATA__MULTI_CHANNEL_SUPPORTED, oldMultiChannelSupported, multiChannelSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getProtocolVersions() {
		if (protocolVersions == null) {
			protocolVersions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_CIFS_SETTING_DATA__PROTOCOL_VERSIONS);
		}
		return protocolVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CIFS_SETTING_DATA__ENABLED:
				return getEnabled();
			case CimPackage.CIM_CIFS_SETTING_DATA__CHARSET:
				return getCharset();
			case CimPackage.CIM_CIFS_SETTING_DATA__USE_TCP_ONLY:
				return getUseTCPOnly();
			case CimPackage.CIM_CIFS_SETTING_DATA__NETBIOS_NAME:
				return getNETBIOSName();
			case CimPackage.CIM_CIFS_SETTING_DATA__WINSIP:
				return getWINSIP();
			case CimPackage.CIM_CIFS_SETTING_DATA__AUTHENTICATION_DOMAIN:
				return getAuthenticationDomain();
			case CimPackage.CIM_CIFS_SETTING_DATA__AUTHENTICATION_MODE:
				return getAuthenticationMode();
			case CimPackage.CIM_CIFS_SETTING_DATA__USE_KERBEROS:
				return getUseKerberos();
			case CimPackage.CIM_CIFS_SETTING_DATA__USE_OPPORTUNISTIC_LOCKING:
				return getUseOpportunisticLocking();
			case CimPackage.CIM_CIFS_SETTING_DATA__SMB_SIGNING_ONLY:
				return getSMBSigningOnly();
			case CimPackage.CIM_CIFS_SETTING_DATA__CLIENTS_CONNECT_ANONYMOUSLY:
				return getClientsConnectAnonymously();
			case CimPackage.CIM_CIFS_SETTING_DATA__JOIN_DOMAIN_ANONYMOUSLY:
				return getJoinDomainAnonymously();
			case CimPackage.CIM_CIFS_SETTING_DATA__DOMAIN_CONTROLLER_USER:
				return getDomainControllerUser();
			case CimPackage.CIM_CIFS_SETTING_DATA__DOMAIN_CONTROLLER_PASSWORD:
				return getDomainControllerPassword();
			case CimPackage.CIM_CIFS_SETTING_DATA__CIFS_DOMAIN_CONTROLLER:
				return getCIFSDomainController();
			case CimPackage.CIM_CIFS_SETTING_DATA__CA_SUPPORTED:
				return getCASupported();
			case CimPackage.CIM_CIFS_SETTING_DATA__MULTI_CHANNEL_SUPPORTED:
				return getMultiChannelSupported();
			case CimPackage.CIM_CIFS_SETTING_DATA__PROTOCOL_VERSIONS:
				return getProtocolVersions();
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
			case CimPackage.CIM_CIFS_SETTING_DATA__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__CHARSET:
				setCharset((Integer)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__USE_TCP_ONLY:
				setUseTCPOnly((Boolean)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__NETBIOS_NAME:
				setNETBIOSName((String)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__WINSIP:
				getWINSIP().clear();
				getWINSIP().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__AUTHENTICATION_DOMAIN:
				setAuthenticationDomain((String)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__AUTHENTICATION_MODE:
				setAuthenticationMode((Integer)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__USE_KERBEROS:
				setUseKerberos((Boolean)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__USE_OPPORTUNISTIC_LOCKING:
				setUseOpportunisticLocking((Boolean)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__SMB_SIGNING_ONLY:
				setSMBSigningOnly((Boolean)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__CLIENTS_CONNECT_ANONYMOUSLY:
				setClientsConnectAnonymously((Boolean)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__JOIN_DOMAIN_ANONYMOUSLY:
				setJoinDomainAnonymously((Boolean)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__DOMAIN_CONTROLLER_USER:
				setDomainControllerUser((String)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__DOMAIN_CONTROLLER_PASSWORD:
				setDomainControllerPassword((String)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__CIFS_DOMAIN_CONTROLLER:
				setCIFSDomainController((String)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__CA_SUPPORTED:
				setCASupported((Boolean)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__MULTI_CHANNEL_SUPPORTED:
				setMultiChannelSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__PROTOCOL_VERSIONS:
				getProtocolVersions().clear();
				getProtocolVersions().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_CIFS_SETTING_DATA__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__CHARSET:
				setCharset(CHARSET_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__USE_TCP_ONLY:
				setUseTCPOnly(USE_TCP_ONLY_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__NETBIOS_NAME:
				setNETBIOSName(NETBIOS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__WINSIP:
				getWINSIP().clear();
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__AUTHENTICATION_DOMAIN:
				setAuthenticationDomain(AUTHENTICATION_DOMAIN_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__AUTHENTICATION_MODE:
				setAuthenticationMode(AUTHENTICATION_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__USE_KERBEROS:
				setUseKerberos(USE_KERBEROS_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__USE_OPPORTUNISTIC_LOCKING:
				setUseOpportunisticLocking(USE_OPPORTUNISTIC_LOCKING_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__SMB_SIGNING_ONLY:
				setSMBSigningOnly(SMB_SIGNING_ONLY_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__CLIENTS_CONNECT_ANONYMOUSLY:
				setClientsConnectAnonymously(CLIENTS_CONNECT_ANONYMOUSLY_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__JOIN_DOMAIN_ANONYMOUSLY:
				setJoinDomainAnonymously(JOIN_DOMAIN_ANONYMOUSLY_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__DOMAIN_CONTROLLER_USER:
				setDomainControllerUser(DOMAIN_CONTROLLER_USER_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__DOMAIN_CONTROLLER_PASSWORD:
				setDomainControllerPassword(DOMAIN_CONTROLLER_PASSWORD_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__CIFS_DOMAIN_CONTROLLER:
				setCIFSDomainController(CIFS_DOMAIN_CONTROLLER_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__CA_SUPPORTED:
				setCASupported(CA_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__MULTI_CHANNEL_SUPPORTED:
				setMultiChannelSupported(MULTI_CHANNEL_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_CIFS_SETTING_DATA__PROTOCOL_VERSIONS:
				getProtocolVersions().clear();
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
			case CimPackage.CIM_CIFS_SETTING_DATA__ENABLED:
				return ENABLED_EDEFAULT == null ? enabled != null : !ENABLED_EDEFAULT.equals(enabled);
			case CimPackage.CIM_CIFS_SETTING_DATA__CHARSET:
				return CHARSET_EDEFAULT == null ? charset != null : !CHARSET_EDEFAULT.equals(charset);
			case CimPackage.CIM_CIFS_SETTING_DATA__USE_TCP_ONLY:
				return USE_TCP_ONLY_EDEFAULT == null ? useTCPOnly != null : !USE_TCP_ONLY_EDEFAULT.equals(useTCPOnly);
			case CimPackage.CIM_CIFS_SETTING_DATA__NETBIOS_NAME:
				return NETBIOS_NAME_EDEFAULT == null ? netbiosName != null : !NETBIOS_NAME_EDEFAULT.equals(netbiosName);
			case CimPackage.CIM_CIFS_SETTING_DATA__WINSIP:
				return winsip != null && !winsip.isEmpty();
			case CimPackage.CIM_CIFS_SETTING_DATA__AUTHENTICATION_DOMAIN:
				return AUTHENTICATION_DOMAIN_EDEFAULT == null ? authenticationDomain != null : !AUTHENTICATION_DOMAIN_EDEFAULT.equals(authenticationDomain);
			case CimPackage.CIM_CIFS_SETTING_DATA__AUTHENTICATION_MODE:
				return AUTHENTICATION_MODE_EDEFAULT == null ? authenticationMode != null : !AUTHENTICATION_MODE_EDEFAULT.equals(authenticationMode);
			case CimPackage.CIM_CIFS_SETTING_DATA__USE_KERBEROS:
				return USE_KERBEROS_EDEFAULT == null ? useKerberos != null : !USE_KERBEROS_EDEFAULT.equals(useKerberos);
			case CimPackage.CIM_CIFS_SETTING_DATA__USE_OPPORTUNISTIC_LOCKING:
				return USE_OPPORTUNISTIC_LOCKING_EDEFAULT == null ? useOpportunisticLocking != null : !USE_OPPORTUNISTIC_LOCKING_EDEFAULT.equals(useOpportunisticLocking);
			case CimPackage.CIM_CIFS_SETTING_DATA__SMB_SIGNING_ONLY:
				return SMB_SIGNING_ONLY_EDEFAULT == null ? smbSigningOnly != null : !SMB_SIGNING_ONLY_EDEFAULT.equals(smbSigningOnly);
			case CimPackage.CIM_CIFS_SETTING_DATA__CLIENTS_CONNECT_ANONYMOUSLY:
				return CLIENTS_CONNECT_ANONYMOUSLY_EDEFAULT == null ? clientsConnectAnonymously != null : !CLIENTS_CONNECT_ANONYMOUSLY_EDEFAULT.equals(clientsConnectAnonymously);
			case CimPackage.CIM_CIFS_SETTING_DATA__JOIN_DOMAIN_ANONYMOUSLY:
				return JOIN_DOMAIN_ANONYMOUSLY_EDEFAULT == null ? joinDomainAnonymously != null : !JOIN_DOMAIN_ANONYMOUSLY_EDEFAULT.equals(joinDomainAnonymously);
			case CimPackage.CIM_CIFS_SETTING_DATA__DOMAIN_CONTROLLER_USER:
				return DOMAIN_CONTROLLER_USER_EDEFAULT == null ? domainControllerUser != null : !DOMAIN_CONTROLLER_USER_EDEFAULT.equals(domainControllerUser);
			case CimPackage.CIM_CIFS_SETTING_DATA__DOMAIN_CONTROLLER_PASSWORD:
				return DOMAIN_CONTROLLER_PASSWORD_EDEFAULT == null ? domainControllerPassword != null : !DOMAIN_CONTROLLER_PASSWORD_EDEFAULT.equals(domainControllerPassword);
			case CimPackage.CIM_CIFS_SETTING_DATA__CIFS_DOMAIN_CONTROLLER:
				return CIFS_DOMAIN_CONTROLLER_EDEFAULT == null ? cifsDomainController != null : !CIFS_DOMAIN_CONTROLLER_EDEFAULT.equals(cifsDomainController);
			case CimPackage.CIM_CIFS_SETTING_DATA__CA_SUPPORTED:
				return CA_SUPPORTED_EDEFAULT == null ? caSupported != null : !CA_SUPPORTED_EDEFAULT.equals(caSupported);
			case CimPackage.CIM_CIFS_SETTING_DATA__MULTI_CHANNEL_SUPPORTED:
				return MULTI_CHANNEL_SUPPORTED_EDEFAULT == null ? multiChannelSupported != null : !MULTI_CHANNEL_SUPPORTED_EDEFAULT.equals(multiChannelSupported);
			case CimPackage.CIM_CIFS_SETTING_DATA__PROTOCOL_VERSIONS:
				return protocolVersions != null && !protocolVersions.isEmpty();
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
		result.append(" (Enabled: ");
		result.append(enabled);
		result.append(", Charset: ");
		result.append(charset);
		result.append(", UseTCPOnly: ");
		result.append(useTCPOnly);
		result.append(", NETBIOSName: ");
		result.append(netbiosName);
		result.append(", WINSIP: ");
		result.append(winsip);
		result.append(", AuthenticationDomain: ");
		result.append(authenticationDomain);
		result.append(", AuthenticationMode: ");
		result.append(authenticationMode);
		result.append(", UseKerberos: ");
		result.append(useKerberos);
		result.append(", UseOpportunisticLocking: ");
		result.append(useOpportunisticLocking);
		result.append(", SMBSigningOnly: ");
		result.append(smbSigningOnly);
		result.append(", ClientsConnectAnonymously: ");
		result.append(clientsConnectAnonymously);
		result.append(", JoinDomainAnonymously: ");
		result.append(joinDomainAnonymously);
		result.append(", DomainControllerUser: ");
		result.append(domainControllerUser);
		result.append(", DomainControllerPassword: ");
		result.append(domainControllerPassword);
		result.append(", CIFSDomainController: ");
		result.append(cifsDomainController);
		result.append(", CASupported: ");
		result.append(caSupported);
		result.append(", MultiChannelSupported: ");
		result.append(multiChannelSupported);
		result.append(", ProtocolVersions: ");
		result.append(protocolVersions);
		result.append(')');
		return result.toString();
	}

} //CIM_CIFSSettingDataImpl

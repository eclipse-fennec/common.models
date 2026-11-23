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

import org.dmtf.cim.CIM_DNSSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM DNS Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSSettingDataImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSSettingDataImpl#getRequestedHostname <em>Requested Hostname</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSSettingDataImpl#getUseSuffixWhenRegistering <em>Use Suffix When Registering</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSSettingDataImpl#getRegisterThisConnectionsAddress <em>Register This Connections Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSSettingDataImpl#getDNSServerAddresses <em>DNS Server Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSSettingDataImpl#getDHCPOptionsToUse <em>DHCP Options To Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DNSSettingDataImpl extends CIM_IPAssignmentSettingDataImpl implements CIM_DNSSettingData {
	/**
	 * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected String domainName = DOMAIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestedHostname() <em>Requested Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUESTED_HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestedHostname() <em>Requested Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedHostname()
	 * @generated
	 * @ordered
	 */
	protected String requestedHostname = REQUESTED_HOSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseSuffixWhenRegistering() <em>Use Suffix When Registering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseSuffixWhenRegistering()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_SUFFIX_WHEN_REGISTERING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseSuffixWhenRegistering() <em>Use Suffix When Registering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseSuffixWhenRegistering()
	 * @generated
	 * @ordered
	 */
	protected Boolean useSuffixWhenRegistering = USE_SUFFIX_WHEN_REGISTERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegisterThisConnectionsAddress() <em>Register This Connections Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterThisConnectionsAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REGISTER_THIS_CONNECTIONS_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegisterThisConnectionsAddress() <em>Register This Connections Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterThisConnectionsAddress()
	 * @generated
	 * @ordered
	 */
	protected Boolean registerThisConnectionsAddress = REGISTER_THIS_CONNECTIONS_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDNSServerAddresses() <em>DNS Server Addresses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDNSServerAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dnsServerAddresses;

	/**
	 * The cached value of the '{@link #getDHCPOptionsToUse() <em>DHCP Options To Use</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDHCPOptionsToUse()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> dhcpOptionsToUse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DNSSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DNSSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainName() {
		return domainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainName(String newDomainName) {
		String oldDomainName = domainName;
		domainName = newDomainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DNS_SETTING_DATA__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestedHostname() {
		return requestedHostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestedHostname(String newRequestedHostname) {
		String oldRequestedHostname = requestedHostname;
		requestedHostname = newRequestedHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DNS_SETTING_DATA__REQUESTED_HOSTNAME, oldRequestedHostname, requestedHostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUseSuffixWhenRegistering() {
		return useSuffixWhenRegistering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseSuffixWhenRegistering(Boolean newUseSuffixWhenRegistering) {
		Boolean oldUseSuffixWhenRegistering = useSuffixWhenRegistering;
		useSuffixWhenRegistering = newUseSuffixWhenRegistering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DNS_SETTING_DATA__USE_SUFFIX_WHEN_REGISTERING, oldUseSuffixWhenRegistering, useSuffixWhenRegistering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRegisterThisConnectionsAddress() {
		return registerThisConnectionsAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegisterThisConnectionsAddress(Boolean newRegisterThisConnectionsAddress) {
		Boolean oldRegisterThisConnectionsAddress = registerThisConnectionsAddress;
		registerThisConnectionsAddress = newRegisterThisConnectionsAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DNS_SETTING_DATA__REGISTER_THIS_CONNECTIONS_ADDRESS, oldRegisterThisConnectionsAddress, registerThisConnectionsAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDNSServerAddresses() {
		if (dnsServerAddresses == null) {
			dnsServerAddresses = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DNS_SETTING_DATA__DNS_SERVER_ADDRESSES);
		}
		return dnsServerAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getDHCPOptionsToUse() {
		if (dhcpOptionsToUse == null) {
			dhcpOptionsToUse = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DNS_SETTING_DATA__DHCP_OPTIONS_TO_USE);
		}
		return dhcpOptionsToUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DNS_SETTING_DATA__DOMAIN_NAME:
				return getDomainName();
			case CimPackage.CIM_DNS_SETTING_DATA__REQUESTED_HOSTNAME:
				return getRequestedHostname();
			case CimPackage.CIM_DNS_SETTING_DATA__USE_SUFFIX_WHEN_REGISTERING:
				return getUseSuffixWhenRegistering();
			case CimPackage.CIM_DNS_SETTING_DATA__REGISTER_THIS_CONNECTIONS_ADDRESS:
				return getRegisterThisConnectionsAddress();
			case CimPackage.CIM_DNS_SETTING_DATA__DNS_SERVER_ADDRESSES:
				return getDNSServerAddresses();
			case CimPackage.CIM_DNS_SETTING_DATA__DHCP_OPTIONS_TO_USE:
				return getDHCPOptionsToUse();
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
			case CimPackage.CIM_DNS_SETTING_DATA__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case CimPackage.CIM_DNS_SETTING_DATA__REQUESTED_HOSTNAME:
				setRequestedHostname((String)newValue);
				return;
			case CimPackage.CIM_DNS_SETTING_DATA__USE_SUFFIX_WHEN_REGISTERING:
				setUseSuffixWhenRegistering((Boolean)newValue);
				return;
			case CimPackage.CIM_DNS_SETTING_DATA__REGISTER_THIS_CONNECTIONS_ADDRESS:
				setRegisterThisConnectionsAddress((Boolean)newValue);
				return;
			case CimPackage.CIM_DNS_SETTING_DATA__DNS_SERVER_ADDRESSES:
				getDNSServerAddresses().clear();
				getDNSServerAddresses().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DNS_SETTING_DATA__DHCP_OPTIONS_TO_USE:
				getDHCPOptionsToUse().clear();
				getDHCPOptionsToUse().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_DNS_SETTING_DATA__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DNS_SETTING_DATA__REQUESTED_HOSTNAME:
				setRequestedHostname(REQUESTED_HOSTNAME_EDEFAULT);
				return;
			case CimPackage.CIM_DNS_SETTING_DATA__USE_SUFFIX_WHEN_REGISTERING:
				setUseSuffixWhenRegistering(USE_SUFFIX_WHEN_REGISTERING_EDEFAULT);
				return;
			case CimPackage.CIM_DNS_SETTING_DATA__REGISTER_THIS_CONNECTIONS_ADDRESS:
				setRegisterThisConnectionsAddress(REGISTER_THIS_CONNECTIONS_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_DNS_SETTING_DATA__DNS_SERVER_ADDRESSES:
				getDNSServerAddresses().clear();
				return;
			case CimPackage.CIM_DNS_SETTING_DATA__DHCP_OPTIONS_TO_USE:
				getDHCPOptionsToUse().clear();
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
			case CimPackage.CIM_DNS_SETTING_DATA__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case CimPackage.CIM_DNS_SETTING_DATA__REQUESTED_HOSTNAME:
				return REQUESTED_HOSTNAME_EDEFAULT == null ? requestedHostname != null : !REQUESTED_HOSTNAME_EDEFAULT.equals(requestedHostname);
			case CimPackage.CIM_DNS_SETTING_DATA__USE_SUFFIX_WHEN_REGISTERING:
				return USE_SUFFIX_WHEN_REGISTERING_EDEFAULT == null ? useSuffixWhenRegistering != null : !USE_SUFFIX_WHEN_REGISTERING_EDEFAULT.equals(useSuffixWhenRegistering);
			case CimPackage.CIM_DNS_SETTING_DATA__REGISTER_THIS_CONNECTIONS_ADDRESS:
				return REGISTER_THIS_CONNECTIONS_ADDRESS_EDEFAULT == null ? registerThisConnectionsAddress != null : !REGISTER_THIS_CONNECTIONS_ADDRESS_EDEFAULT.equals(registerThisConnectionsAddress);
			case CimPackage.CIM_DNS_SETTING_DATA__DNS_SERVER_ADDRESSES:
				return dnsServerAddresses != null && !dnsServerAddresses.isEmpty();
			case CimPackage.CIM_DNS_SETTING_DATA__DHCP_OPTIONS_TO_USE:
				return dhcpOptionsToUse != null && !dhcpOptionsToUse.isEmpty();
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
		result.append(" (DomainName: ");
		result.append(domainName);
		result.append(", RequestedHostname: ");
		result.append(requestedHostname);
		result.append(", UseSuffixWhenRegistering: ");
		result.append(useSuffixWhenRegistering);
		result.append(", RegisterThisConnectionsAddress: ");
		result.append(registerThisConnectionsAddress);
		result.append(", DNSServerAddresses: ");
		result.append(dnsServerAddresses);
		result.append(", DHCPOptionsToUse: ");
		result.append(dhcpOptionsToUse);
		result.append(')');
		return result.toString();
	}

} //CIM_DNSSettingDataImpl

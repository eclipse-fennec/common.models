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

import org.dmtf.cim.CIM_DNSProtocolEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM DNS Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSProtocolEndpointImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSProtocolEndpointImpl#getDHCPOptionsToUse <em>DHCP Options To Use</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSProtocolEndpointImpl#getAppendParentSuffixes <em>Append Parent Suffixes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSProtocolEndpointImpl#getAppendPrimarySuffixes <em>Append Primary Suffixes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSProtocolEndpointImpl#getDNSSuffixesToAppend <em>DNS Suffixes To Append</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSProtocolEndpointImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSProtocolEndpointImpl#getRegisterThisConnectionsAddress <em>Register This Connections Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DNSProtocolEndpointImpl#getUseSuffixWhenRegistering <em>Use Suffix When Registering</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DNSProtocolEndpointImpl extends CIM_ProtocolEndpointImpl implements CIM_DNSProtocolEndpoint {
	/**
	 * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected String hostname = HOSTNAME_EDEFAULT;

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
	 * The default value of the '{@link #getAppendParentSuffixes() <em>Append Parent Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppendParentSuffixes()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean APPEND_PARENT_SUFFIXES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppendParentSuffixes() <em>Append Parent Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppendParentSuffixes()
	 * @generated
	 * @ordered
	 */
	protected Boolean appendParentSuffixes = APPEND_PARENT_SUFFIXES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppendPrimarySuffixes() <em>Append Primary Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppendPrimarySuffixes()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean APPEND_PRIMARY_SUFFIXES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppendPrimarySuffixes() <em>Append Primary Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppendPrimarySuffixes()
	 * @generated
	 * @ordered
	 */
	protected Boolean appendPrimarySuffixes = APPEND_PRIMARY_SUFFIXES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDNSSuffixesToAppend() <em>DNS Suffixes To Append</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDNSSuffixesToAppend()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dnsSuffixesToAppend;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DNSProtocolEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DNSProtocolEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostname(String newHostname) {
		String oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__HOSTNAME, oldHostname, hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getDHCPOptionsToUse() {
		if (dhcpOptionsToUse == null) {
			dhcpOptionsToUse = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__DHCP_OPTIONS_TO_USE);
		}
		return dhcpOptionsToUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAppendParentSuffixes() {
		return appendParentSuffixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppendParentSuffixes(Boolean newAppendParentSuffixes) {
		Boolean oldAppendParentSuffixes = appendParentSuffixes;
		appendParentSuffixes = newAppendParentSuffixes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__APPEND_PARENT_SUFFIXES, oldAppendParentSuffixes, appendParentSuffixes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAppendPrimarySuffixes() {
		return appendPrimarySuffixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppendPrimarySuffixes(Boolean newAppendPrimarySuffixes) {
		Boolean oldAppendPrimarySuffixes = appendPrimarySuffixes;
		appendPrimarySuffixes = newAppendPrimarySuffixes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__APPEND_PRIMARY_SUFFIXES, oldAppendPrimarySuffixes, appendPrimarySuffixes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDNSSuffixesToAppend() {
		if (dnsSuffixesToAppend == null) {
			dnsSuffixesToAppend = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__DNS_SUFFIXES_TO_APPEND);
		}
		return dnsSuffixesToAppend;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__DOMAIN_NAME, oldDomainName, domainName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__REGISTER_THIS_CONNECTIONS_ADDRESS, oldRegisterThisConnectionsAddress, registerThisConnectionsAddress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__USE_SUFFIX_WHEN_REGISTERING, oldUseSuffixWhenRegistering, useSuffixWhenRegistering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__HOSTNAME:
				return getHostname();
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__DHCP_OPTIONS_TO_USE:
				return getDHCPOptionsToUse();
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__APPEND_PARENT_SUFFIXES:
				return getAppendParentSuffixes();
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__APPEND_PRIMARY_SUFFIXES:
				return getAppendPrimarySuffixes();
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__DNS_SUFFIXES_TO_APPEND:
				return getDNSSuffixesToAppend();
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__DOMAIN_NAME:
				return getDomainName();
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__REGISTER_THIS_CONNECTIONS_ADDRESS:
				return getRegisterThisConnectionsAddress();
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__USE_SUFFIX_WHEN_REGISTERING:
				return getUseSuffixWhenRegistering();
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
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__HOSTNAME:
				setHostname((String)newValue);
				return;
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__DHCP_OPTIONS_TO_USE:
				getDHCPOptionsToUse().clear();
				getDHCPOptionsToUse().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__APPEND_PARENT_SUFFIXES:
				setAppendParentSuffixes((Boolean)newValue);
				return;
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__APPEND_PRIMARY_SUFFIXES:
				setAppendPrimarySuffixes((Boolean)newValue);
				return;
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__DNS_SUFFIXES_TO_APPEND:
				getDNSSuffixesToAppend().clear();
				getDNSSuffixesToAppend().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__REGISTER_THIS_CONNECTIONS_ADDRESS:
				setRegisterThisConnectionsAddress((Boolean)newValue);
				return;
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__USE_SUFFIX_WHEN_REGISTERING:
				setUseSuffixWhenRegistering((Boolean)newValue);
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
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__HOSTNAME:
				setHostname(HOSTNAME_EDEFAULT);
				return;
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__DHCP_OPTIONS_TO_USE:
				getDHCPOptionsToUse().clear();
				return;
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__APPEND_PARENT_SUFFIXES:
				setAppendParentSuffixes(APPEND_PARENT_SUFFIXES_EDEFAULT);
				return;
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__APPEND_PRIMARY_SUFFIXES:
				setAppendPrimarySuffixes(APPEND_PRIMARY_SUFFIXES_EDEFAULT);
				return;
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__DNS_SUFFIXES_TO_APPEND:
				getDNSSuffixesToAppend().clear();
				return;
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__REGISTER_THIS_CONNECTIONS_ADDRESS:
				setRegisterThisConnectionsAddress(REGISTER_THIS_CONNECTIONS_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__USE_SUFFIX_WHEN_REGISTERING:
				setUseSuffixWhenRegistering(USE_SUFFIX_WHEN_REGISTERING_EDEFAULT);
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
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__HOSTNAME:
				return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__DHCP_OPTIONS_TO_USE:
				return dhcpOptionsToUse != null && !dhcpOptionsToUse.isEmpty();
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__APPEND_PARENT_SUFFIXES:
				return APPEND_PARENT_SUFFIXES_EDEFAULT == null ? appendParentSuffixes != null : !APPEND_PARENT_SUFFIXES_EDEFAULT.equals(appendParentSuffixes);
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__APPEND_PRIMARY_SUFFIXES:
				return APPEND_PRIMARY_SUFFIXES_EDEFAULT == null ? appendPrimarySuffixes != null : !APPEND_PRIMARY_SUFFIXES_EDEFAULT.equals(appendPrimarySuffixes);
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__DNS_SUFFIXES_TO_APPEND:
				return dnsSuffixesToAppend != null && !dnsSuffixesToAppend.isEmpty();
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__REGISTER_THIS_CONNECTIONS_ADDRESS:
				return REGISTER_THIS_CONNECTIONS_ADDRESS_EDEFAULT == null ? registerThisConnectionsAddress != null : !REGISTER_THIS_CONNECTIONS_ADDRESS_EDEFAULT.equals(registerThisConnectionsAddress);
			case CimPackage.CIM_DNS_PROTOCOL_ENDPOINT__USE_SUFFIX_WHEN_REGISTERING:
				return USE_SUFFIX_WHEN_REGISTERING_EDEFAULT == null ? useSuffixWhenRegistering != null : !USE_SUFFIX_WHEN_REGISTERING_EDEFAULT.equals(useSuffixWhenRegistering);
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
		result.append(" (Hostname: ");
		result.append(hostname);
		result.append(", DHCPOptionsToUse: ");
		result.append(dhcpOptionsToUse);
		result.append(", AppendParentSuffixes: ");
		result.append(appendParentSuffixes);
		result.append(", AppendPrimarySuffixes: ");
		result.append(appendPrimarySuffixes);
		result.append(", DNSSuffixesToAppend: ");
		result.append(dnsSuffixesToAppend);
		result.append(", DomainName: ");
		result.append(domainName);
		result.append(", RegisterThisConnectionsAddress: ");
		result.append(registerThisConnectionsAddress);
		result.append(", UseSuffixWhenRegistering: ");
		result.append(useSuffixWhenRegistering);
		result.append(')');
		return result.toString();
	}

} //CIM_DNSProtocolEndpointImpl

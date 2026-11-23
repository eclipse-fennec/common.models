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
 * A representation of the model object '<em><b>CIM DNS Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from CIM_ProtocolEndpoint which represents the DNS client and DNS configuration for a single IP endpoint. The DNS server addresses can be determined by querying the AccessInfo property of associated CIM_RemoteServiceAccessPoint instances which have an AccessContext of "DNS Server". The order in which the DNS servers will be queried can be determined by the relative values of the OrderOfAccess property on each CIM_RemoteAccessAvailableToElement association which associated the CIM_RemoteServiceAccessPoint with the CIM_DNSProtocolEndpoint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DNSProtocolEndpoint#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DNSProtocolEndpoint#getDHCPOptionsToUse <em>DHCP Options To Use</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DNSProtocolEndpoint#getAppendParentSuffixes <em>Append Parent Suffixes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DNSProtocolEndpoint#getAppendPrimarySuffixes <em>Append Primary Suffixes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DNSProtocolEndpoint#getDNSSuffixesToAppend <em>DNS Suffixes To Append</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DNSProtocolEndpoint#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DNSProtocolEndpoint#getRegisterThisConnectionsAddress <em>Register This Connections Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DNSProtocolEndpoint#getUseSuffixWhenRegistering <em>Use Suffix When Registering</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DNSProtocolEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.27.0' UMLPackagePath='CIM::Network::ProtocolEndpoints' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_DNSProtocolEndpoint extends CIM_ProtocolEndpoint {
	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Hostname actually in use for this client connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSProtocolEndpoint_Hostname()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true'"
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DNSProtocolEndpoint#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * Returns the value of the '<em><b>DHCP Options To Use</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more DHCP options that the DNS client is utilizing if they were returned during a DHCP bind operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DHCP Options To Use</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSProtocolEndpoint_DHCPOptionsToUse()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"8\",\"14\",\"17\",\"18..32767\",\"32768..65535\"]' Values='[\"Domain Name Server\",\"Host Name\",\"Domain Name\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_DHCPProtocolEndpoint.OptionsReceived\",\"CIM_DNSSettingData.DHCPOptionsToUse\"]'"
	 * @generated
	 */
	EList<Integer> getDHCPOptionsToUse();

	/**
	 * Returns the value of the '<em><b>Append Parent Suffixes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the client appends the parent domain suffix to target names prior to attempting to resolve.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Append Parent Suffixes</em>' attribute.
	 * @see #setAppendParentSuffixes(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSProtocolEndpoint_AppendParentSuffixes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_DNSGeneralSettingData.AppendParentSuffixes\"]'"
	 * @generated
	 */
	Boolean getAppendParentSuffixes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DNSProtocolEndpoint#getAppendParentSuffixes <em>Append Parent Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Append Parent Suffixes</em>' attribute.
	 * @see #getAppendParentSuffixes()
	 * @generated
	 */
	void setAppendParentSuffixes(Boolean value);

	/**
	 * Returns the value of the '<em><b>Append Primary Suffixes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the client appends the primary domain suffix to target names prior to attempting to resolve.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Append Primary Suffixes</em>' attribute.
	 * @see #setAppendPrimarySuffixes(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSProtocolEndpoint_AppendPrimarySuffixes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_DNSGeneralSettingData.AppendPrimarySuffixes\"]'"
	 * @generated
	 */
	Boolean getAppendPrimarySuffixes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DNSProtocolEndpoint#getAppendPrimarySuffixes <em>Append Primary Suffixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Append Primary Suffixes</em>' attribute.
	 * @see #getAppendPrimarySuffixes()
	 * @generated
	 */
	void setAppendPrimarySuffixes(Boolean value);

	/**
	 * Returns the value of the '<em><b>DNS Suffixes To Append</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DNS suffixes to append when attempting to resolve a hostname.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DNS Suffixes To Append</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSProtocolEndpoint_DNSSuffixesToAppend()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_DNSGeneralSettingData.DNSSuffixesToAppend\"]'"
	 * @generated
	 */
	EList<String> getDNSSuffixesToAppend();

	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The domain to use for this client connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSProtocolEndpoint_DomainName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_DNSSettingData.DomainName\"]'"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DNSProtocolEndpoint#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Register This Connections Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the client attempted to register this connection's address in DNS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Register This Connections Address</em>' attribute.
	 * @see #setRegisterThisConnectionsAddress(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSProtocolEndpoint_RegisterThisConnectionsAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_DNSSettingData.RegisterThisConnectionsAddress\"]'"
	 * @generated
	 */
	Boolean getRegisterThisConnectionsAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DNSProtocolEndpoint#getRegisterThisConnectionsAddress <em>Register This Connections Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register This Connections Address</em>' attribute.
	 * @see #getRegisterThisConnectionsAddress()
	 * @generated
	 */
	void setRegisterThisConnectionsAddress(Boolean value);

	/**
	 * Returns the value of the '<em><b>Use Suffix When Registering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the suffix is appended before registering the client name with the DNS server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Suffix When Registering</em>' attribute.
	 * @see #setUseSuffixWhenRegistering(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSProtocolEndpoint_UseSuffixWhenRegistering()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_DNSSettingData.UseSuffixWhenRegistering\"]'"
	 * @generated
	 */
	Boolean getUseSuffixWhenRegistering();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DNSProtocolEndpoint#getUseSuffixWhenRegistering <em>Use Suffix When Registering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Suffix When Registering</em>' attribute.
	 * @see #getUseSuffixWhenRegistering()
	 * @generated
	 */
	void setUseSuffixWhenRegistering(Boolean value);

} // CIM_DNSProtocolEndpoint

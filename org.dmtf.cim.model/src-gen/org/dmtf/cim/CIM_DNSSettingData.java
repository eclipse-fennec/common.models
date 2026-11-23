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
 * A representation of the model object '<em><b>CIM DNS Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DNSSettingData defines the DNSconfiguration settings for a single IP network connection. With the exception of the the DNSServerAddresses and the hostname in use, the configuration of a DNSProtocolEndpoint is indicated by the properties of an associated instance of DNSSettingData.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DNSSettingData#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DNSSettingData#getRequestedHostname <em>Requested Hostname</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DNSSettingData#getUseSuffixWhenRegistering <em>Use Suffix When Registering</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DNSSettingData#getRegisterThisConnectionsAddress <em>Register This Connections Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DNSSettingData#getDNSServerAddresses <em>DNS Server Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DNSSettingData#getDHCPOptionsToUse <em>DHCP Options To Use</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DNSSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.18.1' UMLPackagePath='CIM::Network::DNS' override.AddressOrigin='uint16' override.AddressOrigin.Description='AddressOrigin identifies the method by which the IP Address, Subnet Mask, and Gateway were assigned to the IPProtocolEndpoint. This is independent of the DNS configuration, thus this property has the value of 2 (\"Not Applicable\")' override.AddressOrigin.ValueMap='[\"0..1\",\"2\",\"3..32767\",\"32768..\"]' override.AddressOrigin.Values='[\"DMTF Reserved\",\"Not Applicable\",\"DMTF Reserved\",\"Vendor Reserved\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DNSSettingData extends CIM_IPAssignmentSettingData {
	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The domain to use for this client connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSSettingData_DomainName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_DNSProtocolEndpoint.DomainName\"]'"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DNSSettingData#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Requested Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Hostname requested for this client connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Hostname</em>' attribute.
	 * @see #setRequestedHostname(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSSettingData_RequestedHostname()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_DNSProtocolEndpoint.Hostname\"]'"
	 * @generated
	 */
	String getRequestedHostname();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DNSSettingData#getRequestedHostname <em>Requested Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Hostname</em>' attribute.
	 * @see #getRequestedHostname()
	 * @generated
	 */
	void setRequestedHostname(String value);

	/**
	 * Returns the value of the '<em><b>Use Suffix When Registering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the suffix should be appended before registering the client name with the DNS server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Suffix When Registering</em>' attribute.
	 * @see #setUseSuffixWhenRegistering(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSSettingData_UseSuffixWhenRegistering()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_DNSProtocolEndpoint.UseSuffixWhenRegistering\"]'"
	 * @generated
	 */
	Boolean getUseSuffixWhenRegistering();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DNSSettingData#getUseSuffixWhenRegistering <em>Use Suffix When Registering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Suffix When Registering</em>' attribute.
	 * @see #getUseSuffixWhenRegistering()
	 * @generated
	 */
	void setUseSuffixWhenRegistering(Boolean value);

	/**
	 * Returns the value of the '<em><b>Register This Connections Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not this connection's address should be registered in DNS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Register This Connections Address</em>' attribute.
	 * @see #setRegisterThisConnectionsAddress(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSSettingData_RegisterThisConnectionsAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_DNSProtocolEndpoint.RegisterThisConnectionsAddress\"]'"
	 * @generated
	 */
	Boolean getRegisterThisConnectionsAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DNSSettingData#getRegisterThisConnectionsAddress <em>Register This Connections Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register This Connections Address</em>' attribute.
	 * @see #getRegisterThisConnectionsAddress()
	 * @generated
	 */
	void setRegisterThisConnectionsAddress(Boolean value);

	/**
	 * Returns the value of the '<em><b>DNS Server Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DNS servers to contact. The array ordering correlates to the order in which the DNS servers will be contacted. The RemoteServiceAccessPoints associated with the DNSProtocolEndpoint with the value of the AccessContext property being "DNS Server" represent the actual DNS Servers being utilized by the DNS client.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DNS Server Addresses</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSSettingData_DNSServerAddresses()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Write='true' ArrayType='Ordered'"
	 * @generated
	 */
	EList<String> getDNSServerAddresses();

	/**
	 * Returns the value of the '<em><b>DHCP Options To Use</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more DHCP options that the DNS client should utilise if they are returned during a DHCP bind operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DHCP Options To Use</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_DNSSettingData_DHCPOptionsToUse()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"8\",\"14\",\"17\",\"18..32767\",\"32768..65535\"]' Values='[\"Domain Name Server\",\"Host Name\",\"Domain Name\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_DHCPProtocolEndpoint.OptionsReceived\",\"CIM_DNSProtocolEndpoint.DHCPOptionsToUse\"]'"
	 * @generated
	 */
	EList<Integer> getDHCPOptionsToUse();

} // CIM_DNSSettingData

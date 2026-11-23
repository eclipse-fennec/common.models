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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM IP Assignment Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class and its sub-classes represents Internet Protocol (IP) related settings. When used as an accumulation of settings (AddressOrigin set to 11 "cumulative configuration"), this SettingData instance is the aggregation point identifying an IP configuration. Multiple IP configurations could exist for a target. Each configuration is represented with an instance of IPAssignmentSettingData. The details of the IP configuration are defined by instances of sub-classes of this class (i.e. StaticIPAssignmentSettingData, DHCPSettingData, DNSSettingData). These instances are associated with the IPAssignmentSettingData instance using the OrderedComponent or ConcreteComponent associations. For example, a static IP configuration would be represented by an instance of IPAssignmentSettingData and an instance of StaticIPAssignmentSettingData associated via an instance of ConcreteComponent. A static IP configuration including DNS would be modeled using an instance of IPAssignmentSettingData, DNSSettingData, and StaticIPAssignmentSettingData. The DNSSettingData and StaticIPAssignmentSettingData instance would be associated with the IPAssignmentSettingData using instances of ConcreteComponent.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPAssignmentSettingData#getAddressOrigin <em>Address Origin</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPAssignmentSettingData#getProtocolIFType <em>Protocol IF Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPAssignmentSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.35.0' UMLPackagePath='CIM::Network::IP' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_IPAssignmentSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Address Origin</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AddressOrigin identifies the method by which the IP Address, Subnet Mask for IPv4 or Prefix Length for IPv6, and Gateway shall be assigned to the IPProtocolEndpoint. 
	 * A value of 3 "Static" shall indicate the values will be assigned manually. 
	 * A value of 4 "DHCP" shall indicate the values will be assigned utilizing the Dynamic Host Configuration Protocol. See RFC 2131 and related. 
	 * A value of 5 "BOOTP" shall indicate the values will be assigned utilizing BOOTP. See RFC 951 and related. 
	 * A value of 6 "IPv4 Link Local" shall indicate the values will be assigned using the IPv4 Link Local protocol. See RFC 3927.
	 * A value of 7 "DHCPv6" shall indicate the values will be assigned using DHCPv6. See RFC 3315. 
	 * A value of 8 "IPv6 AutoConfig " shall indicate the values will be assigned using the IPv6 AutoConfig. See RFC 4862. 
	 * A value of 9 "Stateless" shall indicate Stateless will be assigned. 
	 * A value of 10 "Link Local" shall indicate Link Local values will be assigned.
	 * A value of 11 "cumulative configuration" shall indicate an accumulation of settings is used. This instance of CIM_IPAssignmentSettingData should be associated with other instances of CIM_IPAssignmentSettingData or its subclasses to represent the detailed IP settings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Origin</em>' attribute.
	 * @see #setAddressOrigin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPAssignmentSettingData_AddressOrigin()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"32768..\"]' Values='[\"Unknown\",\"Other\",\"Not Applicable\",\"Static\",\"DHCP\",\"BOOTP\",\"IPv4 Link Local\",\"DHCPv6\",\"IPv6AutoConfig\",\"Stateless\",\"Link Local\",\"cumulative configuration\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Integer getAddressOrigin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPAssignmentSettingData#getAddressOrigin <em>Address Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Origin</em>' attribute.
	 * @see #getAddressOrigin()
	 * @generated
	 */
	void setAddressOrigin(Integer value);

	/**
	 * Returns the value of the '<em><b>Protocol IF Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that describes the IP version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol IF Type</em>' attribute.
	 * @see #setProtocolIFType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPAssignmentSettingData_ProtocolIFType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"..\",\"4096\",\"4097\",\"32768..\"]' Values='[\"Unknown\",\"DMTF Reserved\",\"IPv4\",\"IPv6\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_ProtocolEndpoint.ProtocolIFType\"]'"
	 * @generated
	 */
	Integer getProtocolIFType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPAssignmentSettingData#getProtocolIFType <em>Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol IF Type</em>' attribute.
	 * @see #getProtocolIFType()
	 * @generated
	 */
	void setProtocolIFType(Integer value);

} // CIM_IPAssignmentSettingData

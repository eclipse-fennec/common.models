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
 * A representation of the model object '<em><b>CIM Extended Static IP Assignment Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_ExtendedStaticIPAssignmentSettingData defines a IP configuration which could be statically assigned to a Network Interface / LANEndpoint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ExtendedStaticIPAssignmentSettingData#getIPAddresses <em>IP Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExtendedStaticIPAssignmentSettingData#getIPv6SubnetPrefixLengths <em>IPv6 Subnet Prefix Lengths</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExtendedStaticIPAssignmentSettingData#getSubnetMasks <em>Subnet Masks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ExtendedStaticIPAssignmentSettingData#getGatewayAddresses <em>Gateway Addresses</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ExtendedStaticIPAssignmentSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.32.0' UMLPackagePath='CIM::Network::IP' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ExtendedStaticIPAssignmentSettingData extends CIM_IPAssignmentSettingData {
	/**
	 * Returns the value of the '<em><b>IP Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IP addresses to be statically assigned. Either IPv4 address array or IPv6 address array shall be represented by this property. If it is IPv6 array, then for each element, there will be a corresponding element in IPv6SubnetPrefixLengths array. If it is IPv4 array, then for each element, there will be a corresponding element in SubnetMasks array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Addresses</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ExtendedStaticIPAssignmentSettingData_IPAddresses()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Write='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_IPAssignmentSettingData.ProtocolIFType\"]'"
	 * @generated
	 */
	EList<String> getIPAddresses();

	/**
	 * Returns the value of the '<em><b>IPv6 Subnet Prefix Lengths</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IPv6SubnetPrefixLengths is used to identify the prefix length of the IPv6Addresses
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IPv6 Subnet Prefix Lengths</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ExtendedStaticIPAssignmentSettingData_IPv6SubnetPrefixLengths()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Write='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ExtendedStaticIPAssignmentSettingData.IPAddresses\"]'"
	 * @generated
	 */
	EList<Integer> getIPv6SubnetPrefixLengths();

	/**
	 * Returns the value of the '<em><b>Subnet Masks</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mask for the IPv4 address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subnet Masks</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ExtendedStaticIPAssignmentSettingData_SubnetMasks()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Write='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ExtendedStaticIPAssignmentSettingData.IPAddresses\"]'"
	 * @generated
	 */
	EList<String> getSubnetMasks();

	/**
	 * Returns the value of the '<em><b>Gateway Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IP Addresses for the Gateways
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gateway Addresses</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ExtendedStaticIPAssignmentSettingData_GatewayAddresses()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Write='true'"
	 * @generated
	 */
	EList<String> getGatewayAddresses();

} // CIM_ExtendedStaticIPAssignmentSettingData

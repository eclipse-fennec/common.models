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
 * A representation of the model object '<em><b>CIM Encapsulation Mapping Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic translation look up record for IP Encapsulation. For example NVGRE 
 * and VXLAN. This property contains all of the information required to make the headers for an IP overlay network.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getCustomerIPAddress <em>Customer IP Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getProviderIPAddress <em>Provider IP Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getCustomerMACAddress <em>Customer MAC Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getCustomerIdentifier <em>Customer Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getVirtualNetworkIdentifier <em>Virtual Network Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getVirtualMachineName <em>Virtual Machine Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getCustomerIPAddressType <em>Customer IP Address Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getProviderIPAddressType <em>Provider IP Address Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getEncapsulationMode <em>Encapsulation Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getOtherEncapsulationMode <em>Other Encapsulation Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getEncapsulationMetadata <em>Encapsulation Metadata</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getProviderMACAddress <em>Provider MAC Address</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EncapsulationMappingSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.52.0' UMLPackagePath='CIM::Network' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_EncapsulationMappingSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Customer IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional IP address of the Virtual machine or the customer system, the overlay network formatted according to the appropriate convention as defined in the AddressType property of this class e.g., 171.79.6.4). This property should be populated for an IP over IP overlay e.g., NVGRE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customer IP Address</em>' attribute.
	 * @see #setCustomerIPAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EncapsulationMappingSettingData_CustomerIPAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCustomerIPAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getCustomerIPAddress <em>Customer IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer IP Address</em>' attribute.
	 * @see #getCustomerIPAddress()
	 * @generated
	 */
	void setCustomerIPAddress(String value);

	/**
	 * Returns the value of the '<em><b>Provider IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IP address that will be used on the underlay or provider network for traffic encapsulated using this encapsulation mapping. The address is formatted according to the appropriate convention as defined in the AddressType property of this class (e.g., 171.79.6.40).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider IP Address</em>' attribute.
	 * @see #setProviderIPAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EncapsulationMappingSettingData_ProviderIPAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getProviderIPAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getProviderIPAddress <em>Provider IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider IP Address</em>' attribute.
	 * @see #getProviderIPAddress()
	 * @generated
	 */
	void setProviderIPAddress(String value);

	/**
	 * Returns the value of the '<em><b>Customer MAC Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MAC address associated with the CustomerAddress. The MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order according to RFC " "2469." ),
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customer MAC Address</em>' attribute.
	 * @see #setCustomerMACAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EncapsulationMappingSettingData_CustomerMACAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCustomerMACAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getCustomerMACAddress <em>Customer MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer MAC Address</em>' attribute.
	 * @see #getCustomerMACAddress()
	 * @generated
	 */
	void setCustomerMACAddress(String value);

	/**
	 * Returns the value of the '<em><b>Customer Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional property that may be populated with a customer or tenant identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customer Identifier</em>' attribute.
	 * @see #setCustomerIdentifier(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EncapsulationMappingSettingData_CustomerIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCustomerIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getCustomerIdentifier <em>Customer Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Identifier</em>' attribute.
	 * @see #getCustomerIdentifier()
	 * @generated
	 */
	void setCustomerIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Virtual Network Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is populated with the identifier of the virtual or overlay network for the traffic mapped through an instance of this class. For example this would contain a VNI for VXLAN and a VSID for NVGRE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Network Identifier</em>' attribute.
	 * @see #setVirtualNetworkIdentifier(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EncapsulationMappingSettingData_VirtualNetworkIdentifier()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getVirtualNetworkIdentifier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getVirtualNetworkIdentifier <em>Virtual Network Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Network Identifier</em>' attribute.
	 * @see #getVirtualNetworkIdentifier()
	 * @generated
	 */
	void setVirtualNetworkIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Virtual Machine Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional property that can set to identify the VM corresponding to the CustomerAddress.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual Machine Name</em>' attribute.
	 * @see #setVirtualMachineName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EncapsulationMappingSettingData_VirtualMachineName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getVirtualMachineName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getVirtualMachineName <em>Virtual Machine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Machine Name</em>' attribute.
	 * @see #getVirtualMachineName()
	 * @generated
	 */
	void setVirtualMachineName(String value);

	/**
	 * Returns the value of the '<em><b>Customer IP Address Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that describes the format of the Address property. It is deprecated since it is not needed, as the class contains both IPv4 and v6 addresses
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customer IP Address Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EncapsulationMappingSettingData_CustomerIPAddressType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"IPv4\",\"IPv6\"]' ModelCorrespondence='[\"CIM_IPProtocolEndpoint.AddressType\"]'"
	 * @generated
	 */
	EList<Integer> getCustomerIPAddressType();

	/**
	 * Returns the value of the '<em><b>Provider IP Address Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that describes the format of the Address property. It is deprecated since it is not needed, as the class contains both IPv4 and v6 addresses
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider IP Address Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EncapsulationMappingSettingData_ProviderIPAddressType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"IPv4\",\"IPv6\"]' ModelCorrespondence='[\"CIM_IPProtocolEndpoint.AddressType\"]'"
	 * @generated
	 */
	EList<Integer> getProviderIPAddressType();

	/**
	 * Returns the value of the '<em><b>Encapsulation Mode</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 1- sets the Encapsulation mode typeOther - should only be used if there is not an enumerated value 2- GRE 3- IP-in-IP 
	 * 4-NVGRE 5-VXLAN
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encapsulation Mode</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EncapsulationMappingSettingData_EncapsulationMode()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Other\",\"GRE\",\"IP-in-IP\",\"NVGRE\",\"VXLAN\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getEncapsulationMode();

	/**
	 * Returns the value of the '<em><b>Other Encapsulation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if the EncapsulationMode has a value 1 - OtherOtherEncapsulationMode should have a string describing the tunne mode
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Encapsulation Mode</em>' attribute.
	 * @see #setOtherEncapsulationMode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EncapsulationMappingSettingData_OtherEncapsulationMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOtherEncapsulationMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getOtherEncapsulationMode <em>Other Encapsulation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Encapsulation Mode</em>' attribute.
	 * @see #getOtherEncapsulationMode()
	 * @generated
	 */
	void setOtherEncapsulationMode(String value);

	/**
	 * Returns the value of the '<em><b>Encapsulation Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional encapsulation type specific metadata that may be included in the encapsulation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encapsulation Metadata</em>' attribute.
	 * @see #setEncapsulationMetadata(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EncapsulationMappingSettingData_EncapsulationMetadata()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getEncapsulationMetadata();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getEncapsulationMetadata <em>Encapsulation Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encapsulation Metadata</em>' attribute.
	 * @see #getEncapsulationMetadata()
	 * @generated
	 */
	void setEncapsulationMetadata(String value);

	/**
	 * Returns the value of the '<em><b>Provider MAC Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Read only property that contains the encapsulation MAC address on the provider network
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider MAC Address</em>' attribute.
	 * @see #setProviderMACAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EncapsulationMappingSettingData_ProviderMACAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getProviderMACAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EncapsulationMappingSettingData#getProviderMACAddress <em>Provider MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider MAC Address</em>' attribute.
	 * @see #getProviderMACAddress()
	 * @generated
	 */
	void setProviderMACAddress(String value);

} // CIM_EncapsulationMappingSettingData

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
 * A representation of the model object '<em><b>CIM IP Interface Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The IPInterfaceSettingData is a derived class of Settingdata that specifies the IP interface settings. It contains the properties needed to establish an IPProtocolEndpoint and a NetworkVLAN.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getIPAddress <em>IP Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getAddressType <em>Address Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getIPv6PrefixLength <em>IPv6 Prefix Length</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getVLANId <em>VLAN Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getMTU <em>MTU</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getRSSCapable <em>RSS Capable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getRDMACapable <em>RDMA Capable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getLinkSpeed <em>Link Speed</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPInterfaceSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.49.0' ClassConstraint='[\"inv: SoID  null implies SoOrgID  null\"]' UMLPackagePath='CIM::Network' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_IPInterfaceSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>IP Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IP address that this IP Interface represents, formatted according to the appropriate convention as defined in the AddressType property of this class (e.g., 171.79.6.40).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Address</em>' attribute.
	 * @see #setIPAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPInterfaceSettingData_IPAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getIPAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getIPAddress <em>IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Address</em>' attribute.
	 * @see #getIPAddress()
	 * @generated
	 */
	void setIPAddress(String value);

	/**
	 * Returns the value of the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that describes the format of the IPAddress property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Type</em>' attribute.
	 * @see #setAddressType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPInterfaceSettingData_AddressType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"IPv4\",\"IPv6\"]'"
	 * @generated
	 */
	Integer getAddressType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getAddressType <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Type</em>' attribute.
	 * @see #getAddressType()
	 * @generated
	 */
	void setAddressType(Integer value);

	/**
	 * Returns the value of the '<em><b>Subnet Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mask for the IPv4 address of this ProtocolEndpoint, if one is defined
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subnet Mask</em>' attribute.
	 * @see #setSubnetMask(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPInterfaceSettingData_SubnetMask()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSubnetMask();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getSubnetMask <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Mask</em>' attribute.
	 * @see #getSubnetMask()
	 * @generated
	 */
	void setSubnetMask(String value);

	/**
	 * Returns the value of the '<em><b>IPv6 Prefix Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The prefix length for the IPv6 address of this IPInterfaceSettingData, if one is defined
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IPv6 Prefix Length</em>' attribute.
	 * @see #setIPv6PrefixLength(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPInterfaceSettingData_IPv6PrefixLength()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getIPv6PrefixLength();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getIPv6PrefixLength <em>IPv6 Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPv6 Prefix Length</em>' attribute.
	 * @see #getIPv6PrefixLength()
	 * @generated
	 */
	void setIPv6PrefixLength(Integer value);

	/**
	 * Returns the value of the '<em><b>VLAN Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 12-bit VLAN ID used in the VLAN Tag header.This identifies the VLAN Tag that is to be used with the IPAddress.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VLAN Id</em>' attribute.
	 * @see #setVLANId(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPInterfaceSettingData_VLANId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='1' MaxValue='4094'"
	 * @generated
	 */
	Integer getVLANId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getVLANId <em>VLAN Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VLAN Id</em>' attribute.
	 * @see #getVLANId()
	 * @generated
	 */
	void setVLANId(Integer value);

	/**
	 * Returns the value of the '<em><b>MTU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the maximum transmission unit that is to be used when transmitting packets on this IPInterface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MTU</em>' attribute.
	 * @see #setMTU(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPInterfaceSettingData_MTU()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='sint32'"
	 * @generated
	 */
	Integer getMTU();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getMTU <em>MTU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTU</em>' attribute.
	 * @see #getMTU()
	 * @generated
	 */
	void setMTU(Integer value);

	/**
	 * Returns the value of the '<em><b>RSS Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used to indicate whether this IPInterface is Receive-side Scaling (RSS) capable or not. Receive-side Scaling (RSS)- Receive-Side Scaling resolves the single-processor bottleneck by allowing the receive side network load from a network adapter to be shared across multiple processors. RSS enables packet receive-processing to scale with the number of available processors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RSS Capable</em>' attribute.
	 * @see #setRSSCapable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPInterfaceSettingData_RSSCapable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getRSSCapable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getRSSCapable <em>RSS Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RSS Capable</em>' attribute.
	 * @see #getRSSCapable()
	 * @generated
	 */
	void setRSSCapable(Boolean value);

	/**
	 * Returns the value of the '<em><b>RDMA Capable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used to indicate whether this IPInterface is Remote Direct Memory Access (RDMA) capable or not. Remote Direct Memory Access Protocol (RDMA) - Accelerated I/O delivery model which works by allowing application software to bypass most layers of software and communicate directly with the hardware.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RDMA Capable</em>' attribute.
	 * @see #setRDMACapable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPInterfaceSettingData_RDMACapable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getRDMACapable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getRDMACapable <em>RDMA Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDMA Capable</em>' attribute.
	 * @see #getRDMACapable()
	 * @generated
	 */
	void setRDMACapable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Link Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speed of this IPInterface in bits per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Speed</em>' attribute.
	 * @see #setLinkSpeed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPInterfaceSettingData_LinkSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getLinkSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPInterfaceSettingData#getLinkSpeed <em>Link Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Speed</em>' attribute.
	 * @see #getLinkSpeed()
	 * @generated
	 */
	void setLinkSpeed(Long value);

} // CIM_IPInterfaceSettingData

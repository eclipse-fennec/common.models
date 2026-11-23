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
 * A representation of the model object '<em><b>CIM IP Address Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IPAddressRange represents a grouping of specific addresses, and provides additional semantics for this group if appropriate. The class is deprecated in lieu of the concrete class RangeOfIPAddresses since there is sufficient information for the class to be instantiated. In addition, an address range should be defined in the context of a System (for example, a network element or an admin domain). These semantics are incorporated in the RangeOfIPAddresses class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPAddressRange#getStartAddress <em>Start Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPAddressRange#getEndAddress <em>End Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPAddressRange#getTypeOfAddress <em>Type Of Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPAddressRange#getAllocationRegion <em>Allocation Region</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPAddressRange()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_RangeOfIPAddresses\"]' Abstract='true' Version='2.7.0' UMLPackagePath='CIM::Network::Collections'"
 * @generated
 */
@ProviderType
public interface CIM_IPAddressRange extends CIM_CollectionOfMSEs {
	/**
	 * Returns the value of the '<em><b>Start Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The starting IP address of the AddressRange, formatted according to the appropriate convention as defined in the AddressType property of this class (e.g., 171.79.6.40).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Address</em>' attribute.
	 * @see #setStartAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPAddressRange_StartAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_RangeOfIPAddresses.StartAddress\"]'"
	 * @generated
	 */
	String getStartAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPAddressRange#getStartAddress <em>Start Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Address</em>' attribute.
	 * @see #getStartAddress()
	 * @generated
	 */
	void setStartAddress(String value);

	/**
	 * Returns the value of the '<em><b>End Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ending IP address of the AddressRange, formatted according to the appropriate convention as defined in the AddressType property of this class (e.g., 171.79.6.40).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Address</em>' attribute.
	 * @see #setEndAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPAddressRange_EndAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_RangeOfIPAddresses.EndAddress\"]'"
	 * @generated
	 */
	String getEndAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPAddressRange#getEndAddress <em>End Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Address</em>' attribute.
	 * @see #getEndAddress()
	 * @generated
	 */
	void setEndAddress(String value);

	/**
	 * Returns the value of the '<em><b>Type Of Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that defines how to format the address and mask of the address range that defines this IPSubnet. 
	 * 
	 * Whenever possible, IPv4-compatible addresses should be used instead of IPv6 addresses (see RFC 2373, section 2.5.4). In order to have a consistent format for IPv4 addresses in a mixed IPv4/v6 environment, all IPv4 addresses and both IPv4-compatible IPv6 addresses and IPv4-mapped IPv6 addresses, per RFC 2373, section 2.5.4, should be formatted in standard IPv4 format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Address</em>' attribute.
	 * @see #setTypeOfAddress(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPAddressRange_TypeOfAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_RangeOfIPAddresses.AddressType\"]' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"IPv4\",\"IPv6\"]'"
	 * @generated
	 */
	Integer getTypeOfAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPAddressRange#getTypeOfAddress <em>Type Of Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Address</em>' attribute.
	 * @see #getTypeOfAddress()
	 * @generated
	 */
	void setTypeOfAddress(Integer value);

	/**
	 * Returns the value of the '<em><b>Allocation Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute defines the region that addresses can be allocated to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocation Region</em>' attribute.
	 * @see #setAllocationRegion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPAddressRange_AllocationRegion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\"]' Values='[\"Unknown\",\"Multiregional: 192.0.0.0 to 193.255.255.255\",\"Europe: 194.0.0.0 to 195.255.255.255\",\"Others: 196.0.0.0 to 197.255.255.255\",\"North America: 198.0.0.0 to 199.255.255.255\",\"Central &amp; South America: 200.0.0.0 to 201.255.255.255\",\"Pacific Rim: 202.0.0.0 to 203.255.255.255\",\"Others: 204.0.0.0 to 205.255.255.255\",\"Others: 206.0.0.0 to 207.255.255.255\"]'"
	 * @generated
	 */
	Integer getAllocationRegion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPAddressRange#getAllocationRegion <em>Allocation Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation Region</em>' attribute.
	 * @see #getAllocationRegion()
	 * @generated
	 */
	void setAllocationRegion(Integer value);

} // CIM_IPAddressRange

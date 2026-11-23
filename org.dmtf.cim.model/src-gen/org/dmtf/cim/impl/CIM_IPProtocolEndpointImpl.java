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

import org.dmtf.cim.CIM_IPProtocolEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IP Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPProtocolEndpointImpl#getIPv4Address <em>IPv4 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPProtocolEndpointImpl#getIPv6Address <em>IPv6 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPProtocolEndpointImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPProtocolEndpointImpl#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPProtocolEndpointImpl#getPrefixLength <em>Prefix Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPProtocolEndpointImpl#getAddressType <em>Address Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPProtocolEndpointImpl#getIPVersionSupport <em>IP Version Support</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPProtocolEndpointImpl#getAddressOrigin <em>Address Origin</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPProtocolEndpointImpl#getIPv6AddressType <em>IPv6 Address Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPProtocolEndpointImpl#getIPv6SubnetPrefixLength <em>IPv6 Subnet Prefix Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IPProtocolEndpointImpl extends CIM_ProtocolEndpointImpl implements CIM_IPProtocolEndpoint {
	/**
	 * The default value of the '{@link #getIPv4Address() <em>IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv4Address()
	 * @generated
	 * @ordered
	 */
	protected static final String IPV4_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPv4Address() <em>IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv4Address()
	 * @generated
	 * @ordered
	 */
	protected String iPv4Address = IPV4_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIPv6Address() <em>IPv6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv6Address()
	 * @generated
	 * @ordered
	 */
	protected static final String IPV6_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPv6Address() <em>IPv6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv6Address()
	 * @generated
	 * @ordered
	 */
	protected String iPv6Address = IPV6_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetMask() <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetMask()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetMask() <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetMask()
	 * @generated
	 * @ordered
	 */
	protected String subnetMask = SUBNET_MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefixLength() <em>Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PREFIX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefixLength() <em>Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixLength()
	 * @generated
	 * @ordered
	 */
	protected Integer prefixLength = PREFIX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADDRESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected Integer addressType = ADDRESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIPVersionSupport() <em>IP Version Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPVersionSupport()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IP_VERSION_SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPVersionSupport() <em>IP Version Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPVersionSupport()
	 * @generated
	 * @ordered
	 */
	protected Integer ipVersionSupport = IP_VERSION_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressOrigin() <em>Address Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADDRESS_ORIGIN_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getAddressOrigin() <em>Address Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressOrigin()
	 * @generated
	 * @ordered
	 */
	protected Integer addressOrigin = ADDRESS_ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getIPv6AddressType() <em>IPv6 Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv6AddressType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IPV6_ADDRESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPv6AddressType() <em>IPv6 Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv6AddressType()
	 * @generated
	 * @ordered
	 */
	protected Integer iPv6AddressType = IPV6_ADDRESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIPv6SubnetPrefixLength() <em>IPv6 Subnet Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv6SubnetPrefixLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IPV6_SUBNET_PREFIX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPv6SubnetPrefixLength() <em>IPv6 Subnet Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv6SubnetPrefixLength()
	 * @generated
	 * @ordered
	 */
	protected Integer iPv6SubnetPrefixLength = IPV6_SUBNET_PREFIX_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPProtocolEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPProtocolEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIPv4Address() {
		return iPv4Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIPv4Address(String newIPv4Address) {
		String oldIPv4Address = iPv4Address;
		iPv4Address = newIPv4Address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV4_ADDRESS, oldIPv4Address, iPv4Address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIPv6Address() {
		return iPv6Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIPv6Address(String newIPv6Address) {
		String oldIPv6Address = iPv6Address;
		iPv6Address = newIPv6Address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV6_ADDRESS, oldIPv6Address, iPv6Address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_PROTOCOL_ENDPOINT__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnetMask() {
		return subnetMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnetMask(String newSubnetMask) {
		String oldSubnetMask = subnetMask;
		subnetMask = newSubnetMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_PROTOCOL_ENDPOINT__SUBNET_MASK, oldSubnetMask, subnetMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPrefixLength() {
		return prefixLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefixLength(Integer newPrefixLength) {
		Integer oldPrefixLength = prefixLength;
		prefixLength = newPrefixLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_PROTOCOL_ENDPOINT__PREFIX_LENGTH, oldPrefixLength, prefixLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAddressType() {
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressType(Integer newAddressType) {
		Integer oldAddressType = addressType;
		addressType = newAddressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_PROTOCOL_ENDPOINT__ADDRESS_TYPE, oldAddressType, addressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIPVersionSupport() {
		return ipVersionSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIPVersionSupport(Integer newIPVersionSupport) {
		Integer oldIPVersionSupport = ipVersionSupport;
		ipVersionSupport = newIPVersionSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IP_VERSION_SUPPORT, oldIPVersionSupport, ipVersionSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAddressOrigin() {
		return addressOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressOrigin(Integer newAddressOrigin) {
		Integer oldAddressOrigin = addressOrigin;
		addressOrigin = newAddressOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_PROTOCOL_ENDPOINT__ADDRESS_ORIGIN, oldAddressOrigin, addressOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIPv6AddressType() {
		return iPv6AddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIPv6AddressType(Integer newIPv6AddressType) {
		Integer oldIPv6AddressType = iPv6AddressType;
		iPv6AddressType = newIPv6AddressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV6_ADDRESS_TYPE, oldIPv6AddressType, iPv6AddressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIPv6SubnetPrefixLength() {
		return iPv6SubnetPrefixLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIPv6SubnetPrefixLength(Integer newIPv6SubnetPrefixLength) {
		Integer oldIPv6SubnetPrefixLength = iPv6SubnetPrefixLength;
		iPv6SubnetPrefixLength = newIPv6SubnetPrefixLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV6_SUBNET_PREFIX_LENGTH, oldIPv6SubnetPrefixLength, iPv6SubnetPrefixLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV4_ADDRESS:
				return getIPv4Address();
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV6_ADDRESS:
				return getIPv6Address();
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__ADDRESS:
				return getAddress();
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__SUBNET_MASK:
				return getSubnetMask();
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__PREFIX_LENGTH:
				return getPrefixLength();
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__ADDRESS_TYPE:
				return getAddressType();
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IP_VERSION_SUPPORT:
				return getIPVersionSupport();
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__ADDRESS_ORIGIN:
				return getAddressOrigin();
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV6_ADDRESS_TYPE:
				return getIPv6AddressType();
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV6_SUBNET_PREFIX_LENGTH:
				return getIPv6SubnetPrefixLength();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV4_ADDRESS:
				setIPv4Address((String)newValue);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV6_ADDRESS:
				setIPv6Address((String)newValue);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__ADDRESS:
				setAddress((String)newValue);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__SUBNET_MASK:
				setSubnetMask((String)newValue);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__PREFIX_LENGTH:
				setPrefixLength((Integer)newValue);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__ADDRESS_TYPE:
				setAddressType((Integer)newValue);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IP_VERSION_SUPPORT:
				setIPVersionSupport((Integer)newValue);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__ADDRESS_ORIGIN:
				setAddressOrigin((Integer)newValue);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV6_ADDRESS_TYPE:
				setIPv6AddressType((Integer)newValue);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV6_SUBNET_PREFIX_LENGTH:
				setIPv6SubnetPrefixLength((Integer)newValue);
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
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV4_ADDRESS:
				setIPv4Address(IPV4_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV6_ADDRESS:
				setIPv6Address(IPV6_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__SUBNET_MASK:
				setSubnetMask(SUBNET_MASK_EDEFAULT);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__PREFIX_LENGTH:
				setPrefixLength(PREFIX_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__ADDRESS_TYPE:
				setAddressType(ADDRESS_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IP_VERSION_SUPPORT:
				setIPVersionSupport(IP_VERSION_SUPPORT_EDEFAULT);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__ADDRESS_ORIGIN:
				setAddressOrigin(ADDRESS_ORIGIN_EDEFAULT);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV6_ADDRESS_TYPE:
				setIPv6AddressType(IPV6_ADDRESS_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV6_SUBNET_PREFIX_LENGTH:
				setIPv6SubnetPrefixLength(IPV6_SUBNET_PREFIX_LENGTH_EDEFAULT);
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
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV4_ADDRESS:
				return IPV4_ADDRESS_EDEFAULT == null ? iPv4Address != null : !IPV4_ADDRESS_EDEFAULT.equals(iPv4Address);
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV6_ADDRESS:
				return IPV6_ADDRESS_EDEFAULT == null ? iPv6Address != null : !IPV6_ADDRESS_EDEFAULT.equals(iPv6Address);
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__SUBNET_MASK:
				return SUBNET_MASK_EDEFAULT == null ? subnetMask != null : !SUBNET_MASK_EDEFAULT.equals(subnetMask);
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__PREFIX_LENGTH:
				return PREFIX_LENGTH_EDEFAULT == null ? prefixLength != null : !PREFIX_LENGTH_EDEFAULT.equals(prefixLength);
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__ADDRESS_TYPE:
				return ADDRESS_TYPE_EDEFAULT == null ? addressType != null : !ADDRESS_TYPE_EDEFAULT.equals(addressType);
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IP_VERSION_SUPPORT:
				return IP_VERSION_SUPPORT_EDEFAULT == null ? ipVersionSupport != null : !IP_VERSION_SUPPORT_EDEFAULT.equals(ipVersionSupport);
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__ADDRESS_ORIGIN:
				return ADDRESS_ORIGIN_EDEFAULT == null ? addressOrigin != null : !ADDRESS_ORIGIN_EDEFAULT.equals(addressOrigin);
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV6_ADDRESS_TYPE:
				return IPV6_ADDRESS_TYPE_EDEFAULT == null ? iPv6AddressType != null : !IPV6_ADDRESS_TYPE_EDEFAULT.equals(iPv6AddressType);
			case CimPackage.CIM_IP_PROTOCOL_ENDPOINT__IPV6_SUBNET_PREFIX_LENGTH:
				return IPV6_SUBNET_PREFIX_LENGTH_EDEFAULT == null ? iPv6SubnetPrefixLength != null : !IPV6_SUBNET_PREFIX_LENGTH_EDEFAULT.equals(iPv6SubnetPrefixLength);
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
		result.append(" (IPv4Address: ");
		result.append(iPv4Address);
		result.append(", IPv6Address: ");
		result.append(iPv6Address);
		result.append(", Address: ");
		result.append(address);
		result.append(", SubnetMask: ");
		result.append(subnetMask);
		result.append(", PrefixLength: ");
		result.append(prefixLength);
		result.append(", AddressType: ");
		result.append(addressType);
		result.append(", IPVersionSupport: ");
		result.append(ipVersionSupport);
		result.append(", AddressOrigin: ");
		result.append(addressOrigin);
		result.append(", IPv6AddressType: ");
		result.append(iPv6AddressType);
		result.append(", IPv6SubnetPrefixLength: ");
		result.append(iPv6SubnetPrefixLength);
		result.append(')');
		return result.toString();
	}

} //CIM_IPProtocolEndpointImpl

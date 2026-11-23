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

import org.dmtf.cim.CIM_StaticIPAssignmentSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Static IP Assignment Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StaticIPAssignmentSettingDataImpl#getIPv4Address <em>IPv4 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StaticIPAssignmentSettingDataImpl#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StaticIPAssignmentSettingDataImpl#getGatewayIPv4Address <em>Gateway IPv4 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StaticIPAssignmentSettingDataImpl#getGatewayIPv6Address <em>Gateway IPv6 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StaticIPAssignmentSettingDataImpl#getIPv6Address <em>IPv6 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StaticIPAssignmentSettingDataImpl#getIPv6AddressType <em>IPv6 Address Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StaticIPAssignmentSettingDataImpl#getIPv6SubnetPrefixLength <em>IPv6 Subnet Prefix Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StaticIPAssignmentSettingDataImpl extends CIM_IPAssignmentSettingDataImpl implements CIM_StaticIPAssignmentSettingData {
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
	 * The default value of the '{@link #getGatewayIPv4Address() <em>Gateway IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayIPv4Address()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_IPV4_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGatewayIPv4Address() <em>Gateway IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayIPv4Address()
	 * @generated
	 * @ordered
	 */
	protected String gatewayIPv4Address = GATEWAY_IPV4_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGatewayIPv6Address() <em>Gateway IPv6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayIPv6Address()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_IPV6_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGatewayIPv6Address() <em>Gateway IPv6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayIPv6Address()
	 * @generated
	 * @ordered
	 */
	protected String gatewayIPv6Address = GATEWAY_IPV6_ADDRESS_EDEFAULT;

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
	protected CIM_StaticIPAssignmentSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StaticIPAssignmentSettingData();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV4_ADDRESS, oldIPv4Address, iPv4Address));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__SUBNET_MASK, oldSubnetMask, subnetMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayIPv4Address() {
		return gatewayIPv4Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayIPv4Address(String newGatewayIPv4Address) {
		String oldGatewayIPv4Address = gatewayIPv4Address;
		gatewayIPv4Address = newGatewayIPv4Address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__GATEWAY_IPV4_ADDRESS, oldGatewayIPv4Address, gatewayIPv4Address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayIPv6Address() {
		return gatewayIPv6Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayIPv6Address(String newGatewayIPv6Address) {
		String oldGatewayIPv6Address = gatewayIPv6Address;
		gatewayIPv6Address = newGatewayIPv6Address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__GATEWAY_IPV6_ADDRESS, oldGatewayIPv6Address, gatewayIPv6Address));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_ADDRESS, oldIPv6Address, iPv6Address));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_ADDRESS_TYPE, oldIPv6AddressType, iPv6AddressType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_SUBNET_PREFIX_LENGTH, oldIPv6SubnetPrefixLength, iPv6SubnetPrefixLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV4_ADDRESS:
				return getIPv4Address();
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__SUBNET_MASK:
				return getSubnetMask();
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__GATEWAY_IPV4_ADDRESS:
				return getGatewayIPv4Address();
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__GATEWAY_IPV6_ADDRESS:
				return getGatewayIPv6Address();
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_ADDRESS:
				return getIPv6Address();
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_ADDRESS_TYPE:
				return getIPv6AddressType();
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_SUBNET_PREFIX_LENGTH:
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
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV4_ADDRESS:
				setIPv4Address((String)newValue);
				return;
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__SUBNET_MASK:
				setSubnetMask((String)newValue);
				return;
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__GATEWAY_IPV4_ADDRESS:
				setGatewayIPv4Address((String)newValue);
				return;
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__GATEWAY_IPV6_ADDRESS:
				setGatewayIPv6Address((String)newValue);
				return;
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_ADDRESS:
				setIPv6Address((String)newValue);
				return;
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_ADDRESS_TYPE:
				setIPv6AddressType((Integer)newValue);
				return;
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_SUBNET_PREFIX_LENGTH:
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
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV4_ADDRESS:
				setIPv4Address(IPV4_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__SUBNET_MASK:
				setSubnetMask(SUBNET_MASK_EDEFAULT);
				return;
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__GATEWAY_IPV4_ADDRESS:
				setGatewayIPv4Address(GATEWAY_IPV4_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__GATEWAY_IPV6_ADDRESS:
				setGatewayIPv6Address(GATEWAY_IPV6_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_ADDRESS:
				setIPv6Address(IPV6_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_ADDRESS_TYPE:
				setIPv6AddressType(IPV6_ADDRESS_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_SUBNET_PREFIX_LENGTH:
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
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV4_ADDRESS:
				return IPV4_ADDRESS_EDEFAULT == null ? iPv4Address != null : !IPV4_ADDRESS_EDEFAULT.equals(iPv4Address);
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__SUBNET_MASK:
				return SUBNET_MASK_EDEFAULT == null ? subnetMask != null : !SUBNET_MASK_EDEFAULT.equals(subnetMask);
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__GATEWAY_IPV4_ADDRESS:
				return GATEWAY_IPV4_ADDRESS_EDEFAULT == null ? gatewayIPv4Address != null : !GATEWAY_IPV4_ADDRESS_EDEFAULT.equals(gatewayIPv4Address);
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__GATEWAY_IPV6_ADDRESS:
				return GATEWAY_IPV6_ADDRESS_EDEFAULT == null ? gatewayIPv6Address != null : !GATEWAY_IPV6_ADDRESS_EDEFAULT.equals(gatewayIPv6Address);
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_ADDRESS:
				return IPV6_ADDRESS_EDEFAULT == null ? iPv6Address != null : !IPV6_ADDRESS_EDEFAULT.equals(iPv6Address);
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_ADDRESS_TYPE:
				return IPV6_ADDRESS_TYPE_EDEFAULT == null ? iPv6AddressType != null : !IPV6_ADDRESS_TYPE_EDEFAULT.equals(iPv6AddressType);
			case CimPackage.CIM_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_SUBNET_PREFIX_LENGTH:
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
		result.append(", SubnetMask: ");
		result.append(subnetMask);
		result.append(", GatewayIPv4Address: ");
		result.append(gatewayIPv4Address);
		result.append(", GatewayIPv6Address: ");
		result.append(gatewayIPv6Address);
		result.append(", IPv6Address: ");
		result.append(iPv6Address);
		result.append(", IPv6AddressType: ");
		result.append(iPv6AddressType);
		result.append(", IPv6SubnetPrefixLength: ");
		result.append(iPv6SubnetPrefixLength);
		result.append(')');
		return result.toString();
	}

} //CIM_StaticIPAssignmentSettingDataImpl

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

import org.dmtf.cim.CIM_ExtendedStaticIPAssignmentSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Extended Static IP Assignment Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExtendedStaticIPAssignmentSettingDataImpl#getIPAddresses <em>IP Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExtendedStaticIPAssignmentSettingDataImpl#getIPv6SubnetPrefixLengths <em>IPv6 Subnet Prefix Lengths</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExtendedStaticIPAssignmentSettingDataImpl#getSubnetMasks <em>Subnet Masks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ExtendedStaticIPAssignmentSettingDataImpl#getGatewayAddresses <em>Gateway Addresses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ExtendedStaticIPAssignmentSettingDataImpl extends CIM_IPAssignmentSettingDataImpl implements CIM_ExtendedStaticIPAssignmentSettingData {
	/**
	 * The cached value of the '{@link #getIPAddresses() <em>IP Addresses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ipAddresses;

	/**
	 * The cached value of the '{@link #getIPv6SubnetPrefixLengths() <em>IPv6 Subnet Prefix Lengths</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv6SubnetPrefixLengths()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> iPv6SubnetPrefixLengths;

	/**
	 * The cached value of the '{@link #getSubnetMasks() <em>Subnet Masks</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetMasks()
	 * @generated
	 * @ordered
	 */
	protected EList<String> subnetMasks;

	/**
	 * The cached value of the '{@link #getGatewayAddresses() <em>Gateway Addresses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> gatewayAddresses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ExtendedStaticIPAssignmentSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ExtendedStaticIPAssignmentSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getIPAddresses() {
		if (ipAddresses == null) {
			ipAddresses = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__IP_ADDRESSES);
		}
		return ipAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getIPv6SubnetPrefixLengths() {
		if (iPv6SubnetPrefixLengths == null) {
			iPv6SubnetPrefixLengths = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_SUBNET_PREFIX_LENGTHS);
		}
		return iPv6SubnetPrefixLengths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSubnetMasks() {
		if (subnetMasks == null) {
			subnetMasks = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__SUBNET_MASKS);
		}
		return subnetMasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getGatewayAddresses() {
		if (gatewayAddresses == null) {
			gatewayAddresses = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__GATEWAY_ADDRESSES);
		}
		return gatewayAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__IP_ADDRESSES:
				return getIPAddresses();
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_SUBNET_PREFIX_LENGTHS:
				return getIPv6SubnetPrefixLengths();
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__SUBNET_MASKS:
				return getSubnetMasks();
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__GATEWAY_ADDRESSES:
				return getGatewayAddresses();
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
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__IP_ADDRESSES:
				getIPAddresses().clear();
				getIPAddresses().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_SUBNET_PREFIX_LENGTHS:
				getIPv6SubnetPrefixLengths().clear();
				getIPv6SubnetPrefixLengths().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__SUBNET_MASKS:
				getSubnetMasks().clear();
				getSubnetMasks().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__GATEWAY_ADDRESSES:
				getGatewayAddresses().clear();
				getGatewayAddresses().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__IP_ADDRESSES:
				getIPAddresses().clear();
				return;
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_SUBNET_PREFIX_LENGTHS:
				getIPv6SubnetPrefixLengths().clear();
				return;
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__SUBNET_MASKS:
				getSubnetMasks().clear();
				return;
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__GATEWAY_ADDRESSES:
				getGatewayAddresses().clear();
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
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__IP_ADDRESSES:
				return ipAddresses != null && !ipAddresses.isEmpty();
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__IPV6_SUBNET_PREFIX_LENGTHS:
				return iPv6SubnetPrefixLengths != null && !iPv6SubnetPrefixLengths.isEmpty();
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__SUBNET_MASKS:
				return subnetMasks != null && !subnetMasks.isEmpty();
			case CimPackage.CIM_EXTENDED_STATIC_IP_ASSIGNMENT_SETTING_DATA__GATEWAY_ADDRESSES:
				return gatewayAddresses != null && !gatewayAddresses.isEmpty();
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
		result.append(" (IPAddresses: ");
		result.append(ipAddresses);
		result.append(", IPv6SubnetPrefixLengths: ");
		result.append(iPv6SubnetPrefixLengths);
		result.append(", SubnetMasks: ");
		result.append(subnetMasks);
		result.append(", GatewayAddresses: ");
		result.append(gatewayAddresses);
		result.append(')');
		return result.toString();
	}

} //CIM_ExtendedStaticIPAssignmentSettingDataImpl

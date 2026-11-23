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

import org.dmtf.cim.CIM_DHCPSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM DHCP Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DHCPSettingDataImpl#getRequestedIPv4Address <em>Requested IPv4 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DHCPSettingDataImpl#getRequestedLeaseTime <em>Requested Lease Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DHCPSettingDataImpl#getClientIdentifier <em>Client Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DHCPSettingDataImpl#getVendorClassIdentifier <em>Vendor Class Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DHCPSettingDataImpl#getRequestedOptions <em>Requested Options</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DHCPSettingDataImpl#getRequiredOptions <em>Required Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DHCPSettingDataImpl extends CIM_IPAssignmentSettingDataImpl implements CIM_DHCPSettingData {
	/**
	 * The default value of the '{@link #getRequestedIPv4Address() <em>Requested IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedIPv4Address()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUESTED_IPV4_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestedIPv4Address() <em>Requested IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedIPv4Address()
	 * @generated
	 * @ordered
	 */
	protected String requestedIPv4Address = REQUESTED_IPV4_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestedLeaseTime() <em>Requested Lease Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedLeaseTime()
	 * @generated
	 * @ordered
	 */
	protected static final Long REQUESTED_LEASE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestedLeaseTime() <em>Requested Lease Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedLeaseTime()
	 * @generated
	 * @ordered
	 */
	protected Long requestedLeaseTime = REQUESTED_LEASE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientIdentifier() <em>Client Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientIdentifier() <em>Client Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String clientIdentifier = CLIENT_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendorClassIdentifier() <em>Vendor Class Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorClassIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_CLASS_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorClassIdentifier() <em>Vendor Class Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorClassIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String vendorClassIdentifier = VENDOR_CLASS_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequestedOptions() <em>Requested Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> requestedOptions;

	/**
	 * The cached value of the '{@link #getRequiredOptions() <em>Required Options</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> requiredOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DHCPSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DHCPSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequestedIPv4Address() {
		return requestedIPv4Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestedIPv4Address(String newRequestedIPv4Address) {
		String oldRequestedIPv4Address = requestedIPv4Address;
		requestedIPv4Address = newRequestedIPv4Address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DHCP_SETTING_DATA__REQUESTED_IPV4_ADDRESS, oldRequestedIPv4Address, requestedIPv4Address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRequestedLeaseTime() {
		return requestedLeaseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestedLeaseTime(Long newRequestedLeaseTime) {
		Long oldRequestedLeaseTime = requestedLeaseTime;
		requestedLeaseTime = newRequestedLeaseTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DHCP_SETTING_DATA__REQUESTED_LEASE_TIME, oldRequestedLeaseTime, requestedLeaseTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientIdentifier() {
		return clientIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientIdentifier(String newClientIdentifier) {
		String oldClientIdentifier = clientIdentifier;
		clientIdentifier = newClientIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DHCP_SETTING_DATA__CLIENT_IDENTIFIER, oldClientIdentifier, clientIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendorClassIdentifier() {
		return vendorClassIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorClassIdentifier(String newVendorClassIdentifier) {
		String oldVendorClassIdentifier = vendorClassIdentifier;
		vendorClassIdentifier = newVendorClassIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DHCP_SETTING_DATA__VENDOR_CLASS_IDENTIFIER, oldVendorClassIdentifier, vendorClassIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRequestedOptions() {
		if (requestedOptions == null) {
			requestedOptions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DHCP_SETTING_DATA__REQUESTED_OPTIONS);
		}
		return requestedOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRequiredOptions() {
		if (requiredOptions == null) {
			requiredOptions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_DHCP_SETTING_DATA__REQUIRED_OPTIONS);
		}
		return requiredOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUESTED_IPV4_ADDRESS:
				return getRequestedIPv4Address();
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUESTED_LEASE_TIME:
				return getRequestedLeaseTime();
			case CimPackage.CIM_DHCP_SETTING_DATA__CLIENT_IDENTIFIER:
				return getClientIdentifier();
			case CimPackage.CIM_DHCP_SETTING_DATA__VENDOR_CLASS_IDENTIFIER:
				return getVendorClassIdentifier();
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUESTED_OPTIONS:
				return getRequestedOptions();
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUIRED_OPTIONS:
				return getRequiredOptions();
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
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUESTED_IPV4_ADDRESS:
				setRequestedIPv4Address((String)newValue);
				return;
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUESTED_LEASE_TIME:
				setRequestedLeaseTime((Long)newValue);
				return;
			case CimPackage.CIM_DHCP_SETTING_DATA__CLIENT_IDENTIFIER:
				setClientIdentifier((String)newValue);
				return;
			case CimPackage.CIM_DHCP_SETTING_DATA__VENDOR_CLASS_IDENTIFIER:
				setVendorClassIdentifier((String)newValue);
				return;
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUESTED_OPTIONS:
				getRequestedOptions().clear();
				getRequestedOptions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUIRED_OPTIONS:
				getRequiredOptions().clear();
				getRequiredOptions().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUESTED_IPV4_ADDRESS:
				setRequestedIPv4Address(REQUESTED_IPV4_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUESTED_LEASE_TIME:
				setRequestedLeaseTime(REQUESTED_LEASE_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_DHCP_SETTING_DATA__CLIENT_IDENTIFIER:
				setClientIdentifier(CLIENT_IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.CIM_DHCP_SETTING_DATA__VENDOR_CLASS_IDENTIFIER:
				setVendorClassIdentifier(VENDOR_CLASS_IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUESTED_OPTIONS:
				getRequestedOptions().clear();
				return;
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUIRED_OPTIONS:
				getRequiredOptions().clear();
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
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUESTED_IPV4_ADDRESS:
				return REQUESTED_IPV4_ADDRESS_EDEFAULT == null ? requestedIPv4Address != null : !REQUESTED_IPV4_ADDRESS_EDEFAULT.equals(requestedIPv4Address);
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUESTED_LEASE_TIME:
				return REQUESTED_LEASE_TIME_EDEFAULT == null ? requestedLeaseTime != null : !REQUESTED_LEASE_TIME_EDEFAULT.equals(requestedLeaseTime);
			case CimPackage.CIM_DHCP_SETTING_DATA__CLIENT_IDENTIFIER:
				return CLIENT_IDENTIFIER_EDEFAULT == null ? clientIdentifier != null : !CLIENT_IDENTIFIER_EDEFAULT.equals(clientIdentifier);
			case CimPackage.CIM_DHCP_SETTING_DATA__VENDOR_CLASS_IDENTIFIER:
				return VENDOR_CLASS_IDENTIFIER_EDEFAULT == null ? vendorClassIdentifier != null : !VENDOR_CLASS_IDENTIFIER_EDEFAULT.equals(vendorClassIdentifier);
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUESTED_OPTIONS:
				return requestedOptions != null && !requestedOptions.isEmpty();
			case CimPackage.CIM_DHCP_SETTING_DATA__REQUIRED_OPTIONS:
				return requiredOptions != null && !requiredOptions.isEmpty();
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
		result.append(" (RequestedIPv4Address: ");
		result.append(requestedIPv4Address);
		result.append(", RequestedLeaseTime: ");
		result.append(requestedLeaseTime);
		result.append(", ClientIdentifier: ");
		result.append(clientIdentifier);
		result.append(", VendorClassIdentifier: ");
		result.append(vendorClassIdentifier);
		result.append(", RequestedOptions: ");
		result.append(requestedOptions);
		result.append(", RequiredOptions: ");
		result.append(requiredOptions);
		result.append(')');
		return result.toString();
	}

} //CIM_DHCPSettingDataImpl

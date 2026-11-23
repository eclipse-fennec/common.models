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

import org.dmtf.cim.CIM_EncapsulationMappingSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Encapsulation Mapping Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_EncapsulationMappingSettingDataImpl#getCustomerIPAddress <em>Customer IP Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EncapsulationMappingSettingDataImpl#getProviderIPAddress <em>Provider IP Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EncapsulationMappingSettingDataImpl#getCustomerMACAddress <em>Customer MAC Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EncapsulationMappingSettingDataImpl#getCustomerIdentifier <em>Customer Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EncapsulationMappingSettingDataImpl#getVirtualNetworkIdentifier <em>Virtual Network Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EncapsulationMappingSettingDataImpl#getVirtualMachineName <em>Virtual Machine Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EncapsulationMappingSettingDataImpl#getCustomerIPAddressType <em>Customer IP Address Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EncapsulationMappingSettingDataImpl#getProviderIPAddressType <em>Provider IP Address Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EncapsulationMappingSettingDataImpl#getEncapsulationMode <em>Encapsulation Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EncapsulationMappingSettingDataImpl#getOtherEncapsulationMode <em>Other Encapsulation Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EncapsulationMappingSettingDataImpl#getEncapsulationMetadata <em>Encapsulation Metadata</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EncapsulationMappingSettingDataImpl#getProviderMACAddress <em>Provider MAC Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_EncapsulationMappingSettingDataImpl extends CIM_SettingDataImpl implements CIM_EncapsulationMappingSettingData {
	/**
	 * The default value of the '{@link #getCustomerIPAddress() <em>Customer IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerIPAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerIPAddress() <em>Customer IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerIPAddress()
	 * @generated
	 * @ordered
	 */
	protected String customerIPAddress = CUSTOMER_IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderIPAddress() <em>Provider IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderIPAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderIPAddress() <em>Provider IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderIPAddress()
	 * @generated
	 * @ordered
	 */
	protected String providerIPAddress = PROVIDER_IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerMACAddress() <em>Customer MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerMACAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_MAC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerMACAddress() <em>Customer MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerMACAddress()
	 * @generated
	 * @ordered
	 */
	protected String customerMACAddress = CUSTOMER_MAC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomerIdentifier() <em>Customer Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomerIdentifier() <em>Customer Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String customerIdentifier = CUSTOMER_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualNetworkIdentifier() <em>Virtual Network Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualNetworkIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String VIRTUAL_NETWORK_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualNetworkIdentifier() <em>Virtual Network Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualNetworkIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String virtualNetworkIdentifier = VIRTUAL_NETWORK_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualMachineName() <em>Virtual Machine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualMachineName()
	 * @generated
	 * @ordered
	 */
	protected static final String VIRTUAL_MACHINE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualMachineName() <em>Virtual Machine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualMachineName()
	 * @generated
	 * @ordered
	 */
	protected String virtualMachineName = VIRTUAL_MACHINE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomerIPAddressType() <em>Customer IP Address Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerIPAddressType()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> customerIPAddressType;

	/**
	 * The cached value of the '{@link #getProviderIPAddressType() <em>Provider IP Address Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderIPAddressType()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> providerIPAddressType;

	/**
	 * The cached value of the '{@link #getEncapsulationMode() <em>Encapsulation Mode</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulationMode()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> encapsulationMode;

	/**
	 * The default value of the '{@link #getOtherEncapsulationMode() <em>Other Encapsulation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEncapsulationMode()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENCAPSULATION_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEncapsulationMode() <em>Other Encapsulation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEncapsulationMode()
	 * @generated
	 * @ordered
	 */
	protected String otherEncapsulationMode = OTHER_ENCAPSULATION_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncapsulationMetadata() <em>Encapsulation Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulationMetadata()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCAPSULATION_METADATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncapsulationMetadata() <em>Encapsulation Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncapsulationMetadata()
	 * @generated
	 * @ordered
	 */
	protected String encapsulationMetadata = ENCAPSULATION_METADATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getProviderMACAddress() <em>Provider MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderMACAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_MAC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProviderMACAddress() <em>Provider MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderMACAddress()
	 * @generated
	 * @ordered
	 */
	protected String providerMACAddress = PROVIDER_MAC_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_EncapsulationMappingSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_EncapsulationMappingSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomerIPAddress() {
		return customerIPAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerIPAddress(String newCustomerIPAddress) {
		String oldCustomerIPAddress = customerIPAddress;
		customerIPAddress = newCustomerIPAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_IP_ADDRESS, oldCustomerIPAddress, customerIPAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProviderIPAddress() {
		return providerIPAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProviderIPAddress(String newProviderIPAddress) {
		String oldProviderIPAddress = providerIPAddress;
		providerIPAddress = newProviderIPAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__PROVIDER_IP_ADDRESS, oldProviderIPAddress, providerIPAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomerMACAddress() {
		return customerMACAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerMACAddress(String newCustomerMACAddress) {
		String oldCustomerMACAddress = customerMACAddress;
		customerMACAddress = newCustomerMACAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_MAC_ADDRESS, oldCustomerMACAddress, customerMACAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomerIdentifier() {
		return customerIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomerIdentifier(String newCustomerIdentifier) {
		String oldCustomerIdentifier = customerIdentifier;
		customerIdentifier = newCustomerIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_IDENTIFIER, oldCustomerIdentifier, customerIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVirtualNetworkIdentifier() {
		return virtualNetworkIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualNetworkIdentifier(String newVirtualNetworkIdentifier) {
		String oldVirtualNetworkIdentifier = virtualNetworkIdentifier;
		virtualNetworkIdentifier = newVirtualNetworkIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__VIRTUAL_NETWORK_IDENTIFIER, oldVirtualNetworkIdentifier, virtualNetworkIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVirtualMachineName() {
		return virtualMachineName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualMachineName(String newVirtualMachineName) {
		String oldVirtualMachineName = virtualMachineName;
		virtualMachineName = newVirtualMachineName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__VIRTUAL_MACHINE_NAME, oldVirtualMachineName, virtualMachineName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCustomerIPAddressType() {
		if (customerIPAddressType == null) {
			customerIPAddressType = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_IP_ADDRESS_TYPE);
		}
		return customerIPAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getProviderIPAddressType() {
		if (providerIPAddressType == null) {
			providerIPAddressType = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__PROVIDER_IP_ADDRESS_TYPE);
		}
		return providerIPAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getEncapsulationMode() {
		if (encapsulationMode == null) {
			encapsulationMode = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__ENCAPSULATION_MODE);
		}
		return encapsulationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherEncapsulationMode() {
		return otherEncapsulationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherEncapsulationMode(String newOtherEncapsulationMode) {
		String oldOtherEncapsulationMode = otherEncapsulationMode;
		otherEncapsulationMode = newOtherEncapsulationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__OTHER_ENCAPSULATION_MODE, oldOtherEncapsulationMode, otherEncapsulationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncapsulationMetadata() {
		return encapsulationMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncapsulationMetadata(String newEncapsulationMetadata) {
		String oldEncapsulationMetadata = encapsulationMetadata;
		encapsulationMetadata = newEncapsulationMetadata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__ENCAPSULATION_METADATA, oldEncapsulationMetadata, encapsulationMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProviderMACAddress() {
		return providerMACAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProviderMACAddress(String newProviderMACAddress) {
		String oldProviderMACAddress = providerMACAddress;
		providerMACAddress = newProviderMACAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__PROVIDER_MAC_ADDRESS, oldProviderMACAddress, providerMACAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_IP_ADDRESS:
				return getCustomerIPAddress();
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__PROVIDER_IP_ADDRESS:
				return getProviderIPAddress();
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_MAC_ADDRESS:
				return getCustomerMACAddress();
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_IDENTIFIER:
				return getCustomerIdentifier();
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__VIRTUAL_NETWORK_IDENTIFIER:
				return getVirtualNetworkIdentifier();
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__VIRTUAL_MACHINE_NAME:
				return getVirtualMachineName();
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_IP_ADDRESS_TYPE:
				return getCustomerIPAddressType();
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__PROVIDER_IP_ADDRESS_TYPE:
				return getProviderIPAddressType();
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__ENCAPSULATION_MODE:
				return getEncapsulationMode();
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__OTHER_ENCAPSULATION_MODE:
				return getOtherEncapsulationMode();
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__ENCAPSULATION_METADATA:
				return getEncapsulationMetadata();
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__PROVIDER_MAC_ADDRESS:
				return getProviderMACAddress();
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
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_IP_ADDRESS:
				setCustomerIPAddress((String)newValue);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__PROVIDER_IP_ADDRESS:
				setProviderIPAddress((String)newValue);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_MAC_ADDRESS:
				setCustomerMACAddress((String)newValue);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_IDENTIFIER:
				setCustomerIdentifier((String)newValue);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__VIRTUAL_NETWORK_IDENTIFIER:
				setVirtualNetworkIdentifier((String)newValue);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__VIRTUAL_MACHINE_NAME:
				setVirtualMachineName((String)newValue);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_IP_ADDRESS_TYPE:
				getCustomerIPAddressType().clear();
				getCustomerIPAddressType().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__PROVIDER_IP_ADDRESS_TYPE:
				getProviderIPAddressType().clear();
				getProviderIPAddressType().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__ENCAPSULATION_MODE:
				getEncapsulationMode().clear();
				getEncapsulationMode().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__OTHER_ENCAPSULATION_MODE:
				setOtherEncapsulationMode((String)newValue);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__ENCAPSULATION_METADATA:
				setEncapsulationMetadata((String)newValue);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__PROVIDER_MAC_ADDRESS:
				setProviderMACAddress((String)newValue);
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
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_IP_ADDRESS:
				setCustomerIPAddress(CUSTOMER_IP_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__PROVIDER_IP_ADDRESS:
				setProviderIPAddress(PROVIDER_IP_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_MAC_ADDRESS:
				setCustomerMACAddress(CUSTOMER_MAC_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_IDENTIFIER:
				setCustomerIdentifier(CUSTOMER_IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__VIRTUAL_NETWORK_IDENTIFIER:
				setVirtualNetworkIdentifier(VIRTUAL_NETWORK_IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__VIRTUAL_MACHINE_NAME:
				setVirtualMachineName(VIRTUAL_MACHINE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_IP_ADDRESS_TYPE:
				getCustomerIPAddressType().clear();
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__PROVIDER_IP_ADDRESS_TYPE:
				getProviderIPAddressType().clear();
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__ENCAPSULATION_MODE:
				getEncapsulationMode().clear();
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__OTHER_ENCAPSULATION_MODE:
				setOtherEncapsulationMode(OTHER_ENCAPSULATION_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__ENCAPSULATION_METADATA:
				setEncapsulationMetadata(ENCAPSULATION_METADATA_EDEFAULT);
				return;
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__PROVIDER_MAC_ADDRESS:
				setProviderMACAddress(PROVIDER_MAC_ADDRESS_EDEFAULT);
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
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_IP_ADDRESS:
				return CUSTOMER_IP_ADDRESS_EDEFAULT == null ? customerIPAddress != null : !CUSTOMER_IP_ADDRESS_EDEFAULT.equals(customerIPAddress);
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__PROVIDER_IP_ADDRESS:
				return PROVIDER_IP_ADDRESS_EDEFAULT == null ? providerIPAddress != null : !PROVIDER_IP_ADDRESS_EDEFAULT.equals(providerIPAddress);
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_MAC_ADDRESS:
				return CUSTOMER_MAC_ADDRESS_EDEFAULT == null ? customerMACAddress != null : !CUSTOMER_MAC_ADDRESS_EDEFAULT.equals(customerMACAddress);
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_IDENTIFIER:
				return CUSTOMER_IDENTIFIER_EDEFAULT == null ? customerIdentifier != null : !CUSTOMER_IDENTIFIER_EDEFAULT.equals(customerIdentifier);
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__VIRTUAL_NETWORK_IDENTIFIER:
				return VIRTUAL_NETWORK_IDENTIFIER_EDEFAULT == null ? virtualNetworkIdentifier != null : !VIRTUAL_NETWORK_IDENTIFIER_EDEFAULT.equals(virtualNetworkIdentifier);
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__VIRTUAL_MACHINE_NAME:
				return VIRTUAL_MACHINE_NAME_EDEFAULT == null ? virtualMachineName != null : !VIRTUAL_MACHINE_NAME_EDEFAULT.equals(virtualMachineName);
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__CUSTOMER_IP_ADDRESS_TYPE:
				return customerIPAddressType != null && !customerIPAddressType.isEmpty();
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__PROVIDER_IP_ADDRESS_TYPE:
				return providerIPAddressType != null && !providerIPAddressType.isEmpty();
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__ENCAPSULATION_MODE:
				return encapsulationMode != null && !encapsulationMode.isEmpty();
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__OTHER_ENCAPSULATION_MODE:
				return OTHER_ENCAPSULATION_MODE_EDEFAULT == null ? otherEncapsulationMode != null : !OTHER_ENCAPSULATION_MODE_EDEFAULT.equals(otherEncapsulationMode);
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__ENCAPSULATION_METADATA:
				return ENCAPSULATION_METADATA_EDEFAULT == null ? encapsulationMetadata != null : !ENCAPSULATION_METADATA_EDEFAULT.equals(encapsulationMetadata);
			case CimPackage.CIM_ENCAPSULATION_MAPPING_SETTING_DATA__PROVIDER_MAC_ADDRESS:
				return PROVIDER_MAC_ADDRESS_EDEFAULT == null ? providerMACAddress != null : !PROVIDER_MAC_ADDRESS_EDEFAULT.equals(providerMACAddress);
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
		result.append(" (CustomerIPAddress: ");
		result.append(customerIPAddress);
		result.append(", ProviderIPAddress: ");
		result.append(providerIPAddress);
		result.append(", CustomerMACAddress: ");
		result.append(customerMACAddress);
		result.append(", CustomerIdentifier: ");
		result.append(customerIdentifier);
		result.append(", VirtualNetworkIdentifier: ");
		result.append(virtualNetworkIdentifier);
		result.append(", VirtualMachineName: ");
		result.append(virtualMachineName);
		result.append(", CustomerIPAddressType: ");
		result.append(customerIPAddressType);
		result.append(", ProviderIPAddressType: ");
		result.append(providerIPAddressType);
		result.append(", EncapsulationMode: ");
		result.append(encapsulationMode);
		result.append(", OtherEncapsulationMode: ");
		result.append(otherEncapsulationMode);
		result.append(", EncapsulationMetadata: ");
		result.append(encapsulationMetadata);
		result.append(", ProviderMACAddress: ");
		result.append(providerMACAddress);
		result.append(')');
		return result.toString();
	}

} //CIM_EncapsulationMappingSettingDataImpl

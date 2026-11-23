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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.dmtf.cim.CIM_USBDevice;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM USB Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getUSBVersion <em>USB Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getSubclassCode <em>Subclass Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getProtocolCode <em>Protocol Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getUSBVersionInBCD <em>USB Version In BCD</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getMaxPacketSize <em>Max Packet Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getVendorID <em>Vendor ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getProductID <em>Product ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getDeviceReleaseNumber <em>Device Release Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getNumberOfConfigs <em>Number Of Configs</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getCurrentConfigValue <em>Current Config Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getCurrentAlternateSettings <em>Current Alternate Settings</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_USBDeviceImpl#getCommandTimeout <em>Command Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_USBDeviceImpl extends CIM_LogicalDeviceImpl implements CIM_USBDevice {
	/**
	 * The default value of the '{@link #getUSBVersion() <em>USB Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSBVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USB_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUSBVersion() <em>USB Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSBVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer usbVersion = USB_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CLASS_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected Integer classCode = CLASS_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubclassCode() <em>Subclass Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclassCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SUBCLASS_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubclassCode() <em>Subclass Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclassCode()
	 * @generated
	 * @ordered
	 */
	protected Integer subclassCode = SUBCLASS_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolCode() <em>Protocol Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolCode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROTOCOL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolCode() <em>Protocol Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolCode()
	 * @generated
	 * @ordered
	 */
	protected Integer protocolCode = PROTOCOL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUSBVersionInBCD() <em>USB Version In BCD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSBVersionInBCD()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USB_VERSION_IN_BCD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUSBVersionInBCD() <em>USB Version In BCD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUSBVersionInBCD()
	 * @generated
	 * @ordered
	 */
	protected Integer usbVersionInBCD = USB_VERSION_IN_BCD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxPacketSize() <em>Max Packet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPacketSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_PACKET_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxPacketSize() <em>Max Packet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPacketSize()
	 * @generated
	 * @ordered
	 */
	protected Integer maxPacketSize = MAX_PACKET_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendorID() <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VENDOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorID() <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorID()
	 * @generated
	 * @ordered
	 */
	protected Integer vendorID = VENDOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductID() <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductID() <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected Integer productID = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceReleaseNumber() <em>Device Release Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceReleaseNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEVICE_RELEASE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceReleaseNumber() <em>Device Release Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceReleaseNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer deviceReleaseNumber = DEVICE_RELEASE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected static final String MANUFACTURER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected String manufacturer = MANUFACTURER_EDEFAULT;

	/**
	 * The default value of the '{@link #getProduct() <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected String product = PRODUCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String SERIAL_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected String serialNumber = SERIAL_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfConfigs() <em>Number Of Configs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfConfigs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_CONFIGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfConfigs() <em>Number Of Configs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfConfigs()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfConfigs = NUMBER_OF_CONFIGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentConfigValue() <em>Current Config Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentConfigValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_CONFIG_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentConfigValue() <em>Current Config Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentConfigValue()
	 * @generated
	 * @ordered
	 */
	protected Integer currentConfigValue = CURRENT_CONFIG_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCurrentAlternateSettings() <em>Current Alternate Settings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentAlternateSettings()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> currentAlternateSettings;

	/**
	 * The default value of the '{@link #getCommandTimeout() <em>Command Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandTimeout() <em>Command Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandTimeout()
	 * @generated
	 * @ordered
	 */
	protected String commandTimeout = COMMAND_TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_USBDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_USBDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUSBVersion() {
		return usbVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUSBVersion(Integer newUSBVersion) {
		Integer oldUSBVersion = usbVersion;
		usbVersion = newUSBVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_DEVICE__USB_VERSION, oldUSBVersion, usbVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassCode(Integer newClassCode) {
		Integer oldClassCode = classCode;
		classCode = newClassCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_DEVICE__CLASS_CODE, oldClassCode, classCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSubclassCode() {
		return subclassCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubclassCode(Integer newSubclassCode) {
		Integer oldSubclassCode = subclassCode;
		subclassCode = newSubclassCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_DEVICE__SUBCLASS_CODE, oldSubclassCode, subclassCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProtocolCode() {
		return protocolCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolCode(Integer newProtocolCode) {
		Integer oldProtocolCode = protocolCode;
		protocolCode = newProtocolCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_DEVICE__PROTOCOL_CODE, oldProtocolCode, protocolCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUSBVersionInBCD() {
		return usbVersionInBCD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUSBVersionInBCD(Integer newUSBVersionInBCD) {
		Integer oldUSBVersionInBCD = usbVersionInBCD;
		usbVersionInBCD = newUSBVersionInBCD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_DEVICE__USB_VERSION_IN_BCD, oldUSBVersionInBCD, usbVersionInBCD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxPacketSize() {
		return maxPacketSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxPacketSize(Integer newMaxPacketSize) {
		Integer oldMaxPacketSize = maxPacketSize;
		maxPacketSize = newMaxPacketSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_DEVICE__MAX_PACKET_SIZE, oldMaxPacketSize, maxPacketSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getVendorID() {
		return vendorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorID(Integer newVendorID) {
		Integer oldVendorID = vendorID;
		vendorID = newVendorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_DEVICE__VENDOR_ID, oldVendorID, vendorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProductID() {
		return productID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductID(Integer newProductID) {
		Integer oldProductID = productID;
		productID = newProductID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_DEVICE__PRODUCT_ID, oldProductID, productID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeviceReleaseNumber() {
		return deviceReleaseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceReleaseNumber(Integer newDeviceReleaseNumber) {
		Integer oldDeviceReleaseNumber = deviceReleaseNumber;
		deviceReleaseNumber = newDeviceReleaseNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_DEVICE__DEVICE_RELEASE_NUMBER, oldDeviceReleaseNumber, deviceReleaseNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManufacturer(String newManufacturer) {
		String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_DEVICE__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(String newProduct) {
		String oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_DEVICE__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSerialNumber(String newSerialNumber) {
		String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_DEVICE__SERIAL_NUMBER, oldSerialNumber, serialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumberOfConfigs() {
		return numberOfConfigs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfConfigs(Integer newNumberOfConfigs) {
		Integer oldNumberOfConfigs = numberOfConfigs;
		numberOfConfigs = newNumberOfConfigs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_DEVICE__NUMBER_OF_CONFIGS, oldNumberOfConfigs, numberOfConfigs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentConfigValue() {
		return currentConfigValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentConfigValue(Integer newCurrentConfigValue) {
		Integer oldCurrentConfigValue = currentConfigValue;
		currentConfigValue = newCurrentConfigValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_DEVICE__CURRENT_CONFIG_VALUE, oldCurrentConfigValue, currentConfigValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCurrentAlternateSettings() {
		if (currentAlternateSettings == null) {
			currentAlternateSettings = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_USB_DEVICE__CURRENT_ALTERNATE_SETTINGS);
		}
		return currentAlternateSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommandTimeout() {
		return commandTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommandTimeout(String newCommandTimeout) {
		String oldCommandTimeout = commandTimeout;
		commandTimeout = newCommandTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USB_DEVICE__COMMAND_TIMEOUT, oldCommandTimeout, commandTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetDescriptor(Integer RequestType, Integer RequestValue, Integer RequestIndex, Integer RequestLength, EList<Integer> Buffer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_USB_DEVICE__USB_VERSION:
				return getUSBVersion();
			case CimPackage.CIM_USB_DEVICE__CLASS_CODE:
				return getClassCode();
			case CimPackage.CIM_USB_DEVICE__SUBCLASS_CODE:
				return getSubclassCode();
			case CimPackage.CIM_USB_DEVICE__PROTOCOL_CODE:
				return getProtocolCode();
			case CimPackage.CIM_USB_DEVICE__USB_VERSION_IN_BCD:
				return getUSBVersionInBCD();
			case CimPackage.CIM_USB_DEVICE__MAX_PACKET_SIZE:
				return getMaxPacketSize();
			case CimPackage.CIM_USB_DEVICE__VENDOR_ID:
				return getVendorID();
			case CimPackage.CIM_USB_DEVICE__PRODUCT_ID:
				return getProductID();
			case CimPackage.CIM_USB_DEVICE__DEVICE_RELEASE_NUMBER:
				return getDeviceReleaseNumber();
			case CimPackage.CIM_USB_DEVICE__MANUFACTURER:
				return getManufacturer();
			case CimPackage.CIM_USB_DEVICE__PRODUCT:
				return getProduct();
			case CimPackage.CIM_USB_DEVICE__SERIAL_NUMBER:
				return getSerialNumber();
			case CimPackage.CIM_USB_DEVICE__NUMBER_OF_CONFIGS:
				return getNumberOfConfigs();
			case CimPackage.CIM_USB_DEVICE__CURRENT_CONFIG_VALUE:
				return getCurrentConfigValue();
			case CimPackage.CIM_USB_DEVICE__CURRENT_ALTERNATE_SETTINGS:
				return getCurrentAlternateSettings();
			case CimPackage.CIM_USB_DEVICE__COMMAND_TIMEOUT:
				return getCommandTimeout();
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
			case CimPackage.CIM_USB_DEVICE__USB_VERSION:
				setUSBVersion((Integer)newValue);
				return;
			case CimPackage.CIM_USB_DEVICE__CLASS_CODE:
				setClassCode((Integer)newValue);
				return;
			case CimPackage.CIM_USB_DEVICE__SUBCLASS_CODE:
				setSubclassCode((Integer)newValue);
				return;
			case CimPackage.CIM_USB_DEVICE__PROTOCOL_CODE:
				setProtocolCode((Integer)newValue);
				return;
			case CimPackage.CIM_USB_DEVICE__USB_VERSION_IN_BCD:
				setUSBVersionInBCD((Integer)newValue);
				return;
			case CimPackage.CIM_USB_DEVICE__MAX_PACKET_SIZE:
				setMaxPacketSize((Integer)newValue);
				return;
			case CimPackage.CIM_USB_DEVICE__VENDOR_ID:
				setVendorID((Integer)newValue);
				return;
			case CimPackage.CIM_USB_DEVICE__PRODUCT_ID:
				setProductID((Integer)newValue);
				return;
			case CimPackage.CIM_USB_DEVICE__DEVICE_RELEASE_NUMBER:
				setDeviceReleaseNumber((Integer)newValue);
				return;
			case CimPackage.CIM_USB_DEVICE__MANUFACTURER:
				setManufacturer((String)newValue);
				return;
			case CimPackage.CIM_USB_DEVICE__PRODUCT:
				setProduct((String)newValue);
				return;
			case CimPackage.CIM_USB_DEVICE__SERIAL_NUMBER:
				setSerialNumber((String)newValue);
				return;
			case CimPackage.CIM_USB_DEVICE__NUMBER_OF_CONFIGS:
				setNumberOfConfigs((Integer)newValue);
				return;
			case CimPackage.CIM_USB_DEVICE__CURRENT_CONFIG_VALUE:
				setCurrentConfigValue((Integer)newValue);
				return;
			case CimPackage.CIM_USB_DEVICE__CURRENT_ALTERNATE_SETTINGS:
				getCurrentAlternateSettings().clear();
				getCurrentAlternateSettings().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_USB_DEVICE__COMMAND_TIMEOUT:
				setCommandTimeout((String)newValue);
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
			case CimPackage.CIM_USB_DEVICE__USB_VERSION:
				setUSBVersion(USB_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_USB_DEVICE__CLASS_CODE:
				setClassCode(CLASS_CODE_EDEFAULT);
				return;
			case CimPackage.CIM_USB_DEVICE__SUBCLASS_CODE:
				setSubclassCode(SUBCLASS_CODE_EDEFAULT);
				return;
			case CimPackage.CIM_USB_DEVICE__PROTOCOL_CODE:
				setProtocolCode(PROTOCOL_CODE_EDEFAULT);
				return;
			case CimPackage.CIM_USB_DEVICE__USB_VERSION_IN_BCD:
				setUSBVersionInBCD(USB_VERSION_IN_BCD_EDEFAULT);
				return;
			case CimPackage.CIM_USB_DEVICE__MAX_PACKET_SIZE:
				setMaxPacketSize(MAX_PACKET_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_USB_DEVICE__VENDOR_ID:
				setVendorID(VENDOR_ID_EDEFAULT);
				return;
			case CimPackage.CIM_USB_DEVICE__PRODUCT_ID:
				setProductID(PRODUCT_ID_EDEFAULT);
				return;
			case CimPackage.CIM_USB_DEVICE__DEVICE_RELEASE_NUMBER:
				setDeviceReleaseNumber(DEVICE_RELEASE_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_USB_DEVICE__MANUFACTURER:
				setManufacturer(MANUFACTURER_EDEFAULT);
				return;
			case CimPackage.CIM_USB_DEVICE__PRODUCT:
				setProduct(PRODUCT_EDEFAULT);
				return;
			case CimPackage.CIM_USB_DEVICE__SERIAL_NUMBER:
				setSerialNumber(SERIAL_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_USB_DEVICE__NUMBER_OF_CONFIGS:
				setNumberOfConfigs(NUMBER_OF_CONFIGS_EDEFAULT);
				return;
			case CimPackage.CIM_USB_DEVICE__CURRENT_CONFIG_VALUE:
				setCurrentConfigValue(CURRENT_CONFIG_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_USB_DEVICE__CURRENT_ALTERNATE_SETTINGS:
				getCurrentAlternateSettings().clear();
				return;
			case CimPackage.CIM_USB_DEVICE__COMMAND_TIMEOUT:
				setCommandTimeout(COMMAND_TIMEOUT_EDEFAULT);
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
			case CimPackage.CIM_USB_DEVICE__USB_VERSION:
				return USB_VERSION_EDEFAULT == null ? usbVersion != null : !USB_VERSION_EDEFAULT.equals(usbVersion);
			case CimPackage.CIM_USB_DEVICE__CLASS_CODE:
				return CLASS_CODE_EDEFAULT == null ? classCode != null : !CLASS_CODE_EDEFAULT.equals(classCode);
			case CimPackage.CIM_USB_DEVICE__SUBCLASS_CODE:
				return SUBCLASS_CODE_EDEFAULT == null ? subclassCode != null : !SUBCLASS_CODE_EDEFAULT.equals(subclassCode);
			case CimPackage.CIM_USB_DEVICE__PROTOCOL_CODE:
				return PROTOCOL_CODE_EDEFAULT == null ? protocolCode != null : !PROTOCOL_CODE_EDEFAULT.equals(protocolCode);
			case CimPackage.CIM_USB_DEVICE__USB_VERSION_IN_BCD:
				return USB_VERSION_IN_BCD_EDEFAULT == null ? usbVersionInBCD != null : !USB_VERSION_IN_BCD_EDEFAULT.equals(usbVersionInBCD);
			case CimPackage.CIM_USB_DEVICE__MAX_PACKET_SIZE:
				return MAX_PACKET_SIZE_EDEFAULT == null ? maxPacketSize != null : !MAX_PACKET_SIZE_EDEFAULT.equals(maxPacketSize);
			case CimPackage.CIM_USB_DEVICE__VENDOR_ID:
				return VENDOR_ID_EDEFAULT == null ? vendorID != null : !VENDOR_ID_EDEFAULT.equals(vendorID);
			case CimPackage.CIM_USB_DEVICE__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productID != null : !PRODUCT_ID_EDEFAULT.equals(productID);
			case CimPackage.CIM_USB_DEVICE__DEVICE_RELEASE_NUMBER:
				return DEVICE_RELEASE_NUMBER_EDEFAULT == null ? deviceReleaseNumber != null : !DEVICE_RELEASE_NUMBER_EDEFAULT.equals(deviceReleaseNumber);
			case CimPackage.CIM_USB_DEVICE__MANUFACTURER:
				return MANUFACTURER_EDEFAULT == null ? manufacturer != null : !MANUFACTURER_EDEFAULT.equals(manufacturer);
			case CimPackage.CIM_USB_DEVICE__PRODUCT:
				return PRODUCT_EDEFAULT == null ? product != null : !PRODUCT_EDEFAULT.equals(product);
			case CimPackage.CIM_USB_DEVICE__SERIAL_NUMBER:
				return SERIAL_NUMBER_EDEFAULT == null ? serialNumber != null : !SERIAL_NUMBER_EDEFAULT.equals(serialNumber);
			case CimPackage.CIM_USB_DEVICE__NUMBER_OF_CONFIGS:
				return NUMBER_OF_CONFIGS_EDEFAULT == null ? numberOfConfigs != null : !NUMBER_OF_CONFIGS_EDEFAULT.equals(numberOfConfigs);
			case CimPackage.CIM_USB_DEVICE__CURRENT_CONFIG_VALUE:
				return CURRENT_CONFIG_VALUE_EDEFAULT == null ? currentConfigValue != null : !CURRENT_CONFIG_VALUE_EDEFAULT.equals(currentConfigValue);
			case CimPackage.CIM_USB_DEVICE__CURRENT_ALTERNATE_SETTINGS:
				return currentAlternateSettings != null && !currentAlternateSettings.isEmpty();
			case CimPackage.CIM_USB_DEVICE__COMMAND_TIMEOUT:
				return COMMAND_TIMEOUT_EDEFAULT == null ? commandTimeout != null : !COMMAND_TIMEOUT_EDEFAULT.equals(commandTimeout);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_USB_DEVICE___GET_DESCRIPTOR__INTEGER_INTEGER_INTEGER_INTEGER_ELIST:
				return GetDescriptor((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (EList<Integer>)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (USBVersion: ");
		result.append(usbVersion);
		result.append(", ClassCode: ");
		result.append(classCode);
		result.append(", SubclassCode: ");
		result.append(subclassCode);
		result.append(", ProtocolCode: ");
		result.append(protocolCode);
		result.append(", USBVersionInBCD: ");
		result.append(usbVersionInBCD);
		result.append(", MaxPacketSize: ");
		result.append(maxPacketSize);
		result.append(", VendorID: ");
		result.append(vendorID);
		result.append(", ProductID: ");
		result.append(productID);
		result.append(", DeviceReleaseNumber: ");
		result.append(deviceReleaseNumber);
		result.append(", Manufacturer: ");
		result.append(manufacturer);
		result.append(", Product: ");
		result.append(product);
		result.append(", SerialNumber: ");
		result.append(serialNumber);
		result.append(", NumberOfConfigs: ");
		result.append(numberOfConfigs);
		result.append(", CurrentConfigValue: ");
		result.append(currentConfigValue);
		result.append(", CurrentAlternateSettings: ");
		result.append(currentAlternateSettings);
		result.append(", CommandTimeout: ");
		result.append(commandTimeout);
		result.append(')');
		return result.toString();
	}

} //CIM_USBDeviceImpl

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
 * A representation of the model object '<em><b>CIM USB Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The management characterisitics of a USB Device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getUSBVersion <em>USB Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getClassCode <em>Class Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getSubclassCode <em>Subclass Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getProtocolCode <em>Protocol Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getUSBVersionInBCD <em>USB Version In BCD</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getMaxPacketSize <em>Max Packet Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getVendorID <em>Vendor ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getProductID <em>Product ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getDeviceReleaseNumber <em>Device Release Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getProduct <em>Product</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getNumberOfConfigs <em>Number Of Configs</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getCurrentConfigValue <em>Current Config Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getCurrentAlternateSettings <em>Current Alternate Settings</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBDevice#getCommandTimeout <em>Command Timeout</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Device::USB' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_USBDevice extends CIM_LogicalDevice {
	/**
	 * Returns the value of the '<em><b>USB Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the latest USB Version supported by the USB Device. The property is expressed as a Binary-Coded Decimal (BCD) where a decimal point is implied between the 2nd and 3rd digits. For example, a value of 0x201 indicates that version 2.01 is supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>USB Version</em>' attribute.
	 * @see #setUSBVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_USBVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getUSBVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBDevice#getUSBVersion <em>USB Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>USB Version</em>' attribute.
	 * @see #getUSBVersion()
	 * @generated
	 */
	void setUSBVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the USB class code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Code</em>' attribute.
	 * @see #setClassCode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_ClassCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MappingStrings='[\"Universal Serial Bus Specification.USB-IF|Standard Device Descriptor|bDeviceClass\"]'"
	 * @generated
	 */
	Integer getClassCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBDevice#getClassCode <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Code</em>' attribute.
	 * @see #getClassCode()
	 * @generated
	 */
	void setClassCode(Integer value);

	/**
	 * Returns the value of the '<em><b>Subclass Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the USB subclass code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subclass Code</em>' attribute.
	 * @see #setSubclassCode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_SubclassCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MappingStrings='[\"Universal Serial Bus Specification.USB-IF|Standard Device Descriptor|bDeviceSubClass\"]'"
	 * @generated
	 */
	Integer getSubclassCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBDevice#getSubclassCode <em>Subclass Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subclass Code</em>' attribute.
	 * @see #getSubclassCode()
	 * @generated
	 */
	void setSubclassCode(Integer value);

	/**
	 * Returns the value of the '<em><b>Protocol Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the USB protocol code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Code</em>' attribute.
	 * @see #setProtocolCode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_ProtocolCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MappingStrings='[\"Universal Serial Bus Specification.USB-IF|Standard Device Descriptor|bDeviceProtocol\"]'"
	 * @generated
	 */
	Integer getProtocolCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBDevice#getProtocolCode <em>Protocol Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Code</em>' attribute.
	 * @see #getProtocolCode()
	 * @generated
	 */
	void setProtocolCode(Integer value);

	/**
	 * Returns the value of the '<em><b>USB Version In BCD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * From the USB specification Device Descriptor, where 'bcdUSB' is the USB Specification Number, in Binary-Coded Decimal format, that the device complies with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>USB Version In BCD</em>' attribute.
	 * @see #setUSBVersionInBCD(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_USBVersionInBCD()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"Universal Serial Bus Specification.USB-IF|Standard Device Descriptor|bcdUSB\"]'"
	 * @generated
	 */
	Integer getUSBVersionInBCD();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBDevice#getUSBVersionInBCD <em>USB Version In BCD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>USB Version In BCD</em>' attribute.
	 * @see #getUSBVersionInBCD()
	 * @generated
	 */
	void setUSBVersionInBCD(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Packet Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * From the USB specification Device Descriptor, Maximum Packet size for the USB zero endpoint. Valid sizes are 8, 16, 32, 64.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Packet Size</em>' attribute.
	 * @see #setMaxPacketSize(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_MaxPacketSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MappingStrings='[\"Universal Serial Bus Specification.USB-IF|Standard Device Descriptor|bMaxPacketSize\"]'"
	 * @generated
	 */
	Integer getMaxPacketSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBDevice#getMaxPacketSize <em>Max Packet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Packet Size</em>' attribute.
	 * @see #getMaxPacketSize()
	 * @generated
	 */
	void setMaxPacketSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Vendor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * From the USB specification Device Descriptor, Vendor ID assigned by USB.org.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor ID</em>' attribute.
	 * @see #setVendorID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_VendorID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"Universal Serial Bus Specification.USB-IF|Standard Device Descriptor|idVendor\"]'"
	 * @generated
	 */
	Integer getVendorID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBDevice#getVendorID <em>Vendor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor ID</em>' attribute.
	 * @see #getVendorID()
	 * @generated
	 */
	void setVendorID(Integer value);

	/**
	 * Returns the value of the '<em><b>Product ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * From the USB specification Device Descriptor, Product ID assigned by manufacturer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product ID</em>' attribute.
	 * @see #setProductID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_ProductID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"Universal Serial Bus Specification.USB-IF|Standard Device Descriptor|idProduct\"]'"
	 * @generated
	 */
	Integer getProductID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBDevice#getProductID <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product ID</em>' attribute.
	 * @see #getProductID()
	 * @generated
	 */
	void setProductID(Integer value);

	/**
	 * Returns the value of the '<em><b>Device Release Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * From the USB specification Device Descriptor, Device Release Number in Binary-Coded Decimal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Release Number</em>' attribute.
	 * @see #setDeviceReleaseNumber(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_DeviceReleaseNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"Universal Serial Bus Specification.USB-IF|Standard Device Descriptor|bcdDevice\"]'"
	 * @generated
	 */
	Integer getDeviceReleaseNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBDevice#getDeviceReleaseNumber <em>Device Release Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Release Number</em>' attribute.
	 * @see #getDeviceReleaseNumber()
	 * @generated
	 */
	void setDeviceReleaseNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * From the USB specification Device Descriptior, Manufacturer string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_Manufacturer()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"Universal Serial Bus Specification.USB-IF|Standard Device Descriptor|iManufacturer\"]'"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBDevice#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * From the USB specification Device Descriptor, Product String.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' attribute.
	 * @see #setProduct(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_Product()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"Universal Serial Bus Specification.USB-IF|Standard Device Descriptor|iProduct\"]'"
	 * @generated
	 */
	String getProduct();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBDevice#getProduct <em>Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' attribute.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(String value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * From the USB specification Device Descriptor, Serial Number String.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Number</em>' attribute.
	 * @see #setSerialNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_SerialNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"Universal Serial Bus Specification.USB-IF|Standard Device Descriptor|iSerialNumber\"]'"
	 * @generated
	 */
	String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBDevice#getSerialNumber <em>Serial Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' attribute.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Configs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of device configurations that are defined for the Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Configs</em>' attribute.
	 * @see #setNumberOfConfigs(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_NumberOfConfigs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MappingStrings='[\"Universal Serial Bus Specification.USB-IF|Standard Device Descriptor|bNumConfigurations\"]'"
	 * @generated
	 */
	Integer getNumberOfConfigs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBDevice#getNumberOfConfigs <em>Number Of Configs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Configs</em>' attribute.
	 * @see #getNumberOfConfigs()
	 * @generated
	 */
	void setNumberOfConfigs(Integer value);

	/**
	 * Returns the value of the '<em><b>Current Config Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the configuration currently selected for the Device. If this value is zero, the Device is unconfigured.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Config Value</em>' attribute.
	 * @see #setCurrentConfigValue(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_CurrentConfigValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ModelCorrespondence='[\"CIM_USBDevice.CurrentAlternateSettings\"]'"
	 * @generated
	 */
	Integer getCurrentConfigValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBDevice#getCurrentConfigValue <em>Current Config Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Config Value</em>' attribute.
	 * @see #getCurrentConfigValue()
	 * @generated
	 */
	void setCurrentConfigValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Current Alternate Settings</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of USB 'alternate settings' for each interface in the currently selected configuration (indicated by the CurrentConfigValue property). This array has one entry for each interface in the configuration. If the property, CurrentConfigValue, is zero (indicating the Device is not configured), the array is undefined. To understand how to parse this octet string, refer to the USB Specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Alternate Settings</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_CurrentAlternateSettings()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' ModelCorrespondence='[\"CIM_USBDevice.CurrentConfigValue\"]'"
	 * @generated
	 */
	EList<Integer> getCurrentAlternateSettings();

	/**
	 * Returns the value of the '<em><b>Command Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CommandTimeout is configurable by management applications supporting USB Redirections. When the Redirection Service redirects a USBDevice command to a remote device, and the remote device does not respond before CommandTimout times out, the Redirection Service will emulate a media eject event and re-try the command and/or try to re-establish the connection to the remote device. The timeout is expressed using the interval format of the datetime type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command Timeout</em>' attribute.
	 * @see #setCommandTimeout(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBDevice_CommandTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getCommandTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBDevice#getCommandTimeout <em>Command Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Timeout</em>' attribute.
	 * @see #getCommandTimeout()
	 * @generated
	 */
	void setCommandTimeout(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the USBDevice Descriptor as specified by the input parameters. Each parameter is briefly described here with more detail in its Qualifier list. RequestType is an input parameter that defines whether the request is for standard, class or vendor-specific information, as well as specifying the recipient. RequestValue is also an input parameter and defines the USB Descriptor Type and Index. RequestIndex is an input parameter which describes the language used to return a string Descriptor. RequestLength is both an input and output parameter. It specifies the length of the Descriptor that should be returned (on input) and what is actually returned in the Buffer parameter (on output). Buffer is an output parameter, containing the Descriptor data. The GetDescriptor method returns an integer value of 0 if the USB Descriptor is successfully returned, 1 if the request is not supported and any other number to indicate an error. 
	 * In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	 * @param RequestType RequestType is bit-mapped and identifies the type of Descriptor request and the recipient. The type of request may be 'standard', 'class' or 'vendor-specific'. The recipient may be 'device', 'interface', 'endpoint' or 'other'. Refer to the USB Specification for the appropriate values for each bit.
	 * @param RequestValue RequestValue contains the Descriptor Type in the high byte and the Descriptor Index (for example, index or offset into the Descriptor array) in the low byte. Refer to the USB Specification for more information.
	 * @param RequestIndex RequestIndex defines the 2 byte Language ID code used by the USBDevice when returning string Descriptor data. The parameter is typically 0 for non-string Descriptors. Refer to the USB Specification for more information.
	 * @param RequestLength On input, RequestLength is the length (in octets) of the Descriptor that should be returned. If this value is less than the actual length of the Descriptor, only the requested length will be returned. If it is more than the actual length, the actual length is returned. On output, this parameter is the length, in octets, of the Buffer being returned. If the requested Descriptor does not exist, the contents of this parameter are undefined.
	 * @param Buffer Buffer returns the requested Descriptor information. If the Descriptor does not exist, the contents of the Buffer are undefined.
	 * <!-- end-model-doc -->
	 * @model RequestTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' In='true'" RequestValueAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true'" RequestIndexAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true'" RequestLengthAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='true' Out='true'" BufferUnique="false" BufferMany="true"
	 *        BufferAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long GetDescriptor(Integer RequestType, Integer RequestValue, Integer RequestIndex, Integer RequestLength, EList<Integer> Buffer);

} // CIM_USBDevice

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
 * A representation of the model object '<em><b>CIM USB Redirection Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * USBRedirectionCapabilities describes the capabilities of the USB Redirection Service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_USBRedirectionCapabilities#getConnectionModesSupported <em>Connection Modes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBRedirectionCapabilities#getUSBVersionsSupported <em>USB Versions Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBRedirectionCapabilities#getClassesSupported <em>Classes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBRedirectionCapabilities#getSubClassesSupported <em>Sub Classes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBRedirectionCapabilities#getMaxDevicesSupported <em>Max Devices Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBRedirectionCapabilities#getMaxDevicesPerSAP <em>Max Devices Per SAP</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBRedirectionCapabilities#getSAPCapabilitiesSupported <em>SAP Capabilities Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBRedirectionCapabilities#getRequestedStatesSupportedForCreatedSAP <em>Requested States Supported For Created SAP</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBRedirectionCapabilities#getInfoFormatsSupported <em>Info Formats Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_USBRedirectionCapabilities#getSingleClassPerSAP <em>Single Class Per SAP</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::USBRedirection' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_USBRedirectionCapabilities extends CIM_RedirectionServiceCapabilities {
	/**
	 * Returns the value of the '<em><b>Connection Modes Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection mode used to configure the session. A value set to 2 = "Listen" shall indicate that the SAP will listen for a connection request from the remote USB redirection server. A CIM_BindsTo association to a CIM_ProtocolEndoint may be used to represent where the SAP is listening for the connection request. A value set to 3 = "Connect" shall indicate that the the SAP shall initiate the connection to the remote USB redirection server. A CIM_RemoteAccessAvailableToElement association to a CIM_RemoteServiceAccessPoint may be used to represent where the SAP shall connect to the remote USB redirection server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Modes Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionCapabilities_ConnectionModesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Listen\",\"Connect\",\"DMTF Reserved\",\"Vendor Specified\"]' ModelCorrespondence='[\"CIM_USBRedirectionSAP.ConnectionMode\"]'"
	 * @generated
	 */
	EList<Integer> getConnectionModesSupported();

	/**
	 * Returns the value of the '<em><b>USB Versions Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the USB specification versions which are supported. The property is expressed as a Binary-Coded Decimal (BCD) where a decimal point is implied between the 2nd and 3rd digits. For example, a value of 0x0201 indicates that version 2.01 is supported. Note that each entry of this array is related to the entries of the ClassesSupported, SubClassesSupported, MaxDevicesSupported and MaxDevicesPerSAP arrays that are located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>USB Versions Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionCapabilities_USBVersionsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ArrayType='Indexed' MappingStrings='[\"Universal Serial Bus Specification.USB-IF|Standard Device Descriptor|bcdUSB\"]' ModelCorrespondence='[\"CIM_USBDevice.USBVersion\",\"CIM_USBRedirectionCapabilities.ClassesSupported\",\"CIM_USBRedirectionCapabilities.SubClassesSupported\",\"CIM_USBRedirectionCapabilities.MaxDevicesSupported\",\"CIM_USBRedirectionCapabilities.MaxDevicesPerSAP\"]'"
	 * @generated
	 */
	EList<Integer> getUSBVersionsSupported();

	/**
	 * Returns the value of the '<em><b>Classes Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the USB Device Classes which are supported. Note that each entry of this array is related to the entries of the USBVersionsSupported, SubClassesSupported, MaxDevicesSupported, and MaxDevicesPerSAP arrays that are located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classes Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionCapabilities_ClassesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' ArrayType='Indexed' MappingStrings='[\"Universal Serial Bus Specification.USB-IF|Standard Device Descriptor|bDeviceClass\"]' ModelCorrespondence='[\"CIM_USBDevice.ClassCode\",\"CIM_USBRedirectionCapabilities.USBVersionsSupported\",\"CIM_USBRedirectionCapabilities.SubClassesSupported\",\"CIM_USBRedirectionCapabilities.MaxDevicesSupported\",\"CIM_USBRedirectionCapabilities.MaxDevicesPerSAP\"]'"
	 * @generated
	 */
	EList<Integer> getClassesSupported();

	/**
	 * Returns the value of the '<em><b>Sub Classes Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the USB Device SubClasses which are supported. Note that each entry of this array is related to the entries of the USBVersionsSupported, ClassesSupproted, MaxDevicesSupported, and MaxDevicesPerSAP arrays that are located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Classes Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionCapabilities_SubClassesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' ArrayType='Indexed' MappingStrings='[\"Universal Serial Bus Specification.USB-IF|Standard Device Descriptor|bDeviceSubClass\"]' ModelCorrespondence='[\"CIM_USBDevice.SubclassCode\",\"CIM_USBRedirectionCapabilities.USBVersionsSupported\",\"CIM_USBRedirectionCapabilities.ClassesSupported\",\"CIM_USBRedirectionCapabilities.MaxDevicesSupported\",\"CIM_USBRedirectionCapabilities.MaxDevicesPerSAP\"]'"
	 * @generated
	 */
	EList<Integer> getSubClassesSupported();

	/**
	 * Returns the value of the '<em><b>Max Devices Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the number of USB devices which are supported for the devices specified in the USBVersionsSupported, ClassesSupported, and SubClassesSupported array properties. Note that each entry of this array is related to the entries in the USBVersionsSupported, ClassesSupported, and SubClassesSupported arrays that are located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Devices Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionCapabilities_MaxDevicesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_USBRedirectionCapabilities.ClassesSupported\",\"CIM_USBRedirectionCapabilities.USBVersionsSupported\",\"CIM_USBRedirectionCapabilities.SubClassesSupported\",\"CIM_USBRedirectionCapabilities.MaxDevicesPerSAP\"]'"
	 * @generated
	 */
	EList<Integer> getMaxDevicesSupported();

	/**
	 * Returns the value of the '<em><b>Max Devices Per SAP</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the number of USB devices per USB Redirection Session which are supported for the devices specified in the USBVersionsSupported, ClassesSupported, and SubClassesSupported array properties. Note that each entry of this array is related to the entries in the USBVersionsSupported, ClassesSupported, and SubClassesSupported arrays that are located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Devices Per SAP</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionCapabilities_MaxDevicesPerSAP()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_USBRedirectionCapabilities.MaxDevicesSupported\",\"CIM_USBRedirectionCapabilities.USBVersionsSupported\",\"CIM_USBRedirectionCapabilities.SubClassesSupported\",\"CIM_USBRedirectionCapabilities.ClassesSupported\"]'"
	 * @generated
	 */
	EList<Integer> getMaxDevicesPerSAP();

	/**
	 * Returns the value of the '<em><b>SAP Capabilities Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the whether instances of USBRedirectionSAPs already exist and whether whether SAPs can be created. A value set to 2 = "Pre-Configured SAPs" shall indicate that instances of CIM_USBRedirectionSAP exists which can be enabled. A value set to 3 = "Create SAPs" shall indicate that instances of CIM_USBRedirectionSAP can be created with the CreateDevice() and CreateSession() methods. A value set to 4 = "Modify Timeouts" shall indicate that the timeout parameters of instances of CIM_USBRedirectionSAP can be modified by applications using 'ModifyInstance'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SAP Capabilities Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionCapabilities_SAPCapabilitiesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Pre-Configured SAPs\",\"Create SAPs\",\"Modify SAP\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	EList<Integer> getSAPCapabilitiesSupported();

	/**
	 * Returns the value of the '<em><b>Requested States Supported For Created SAP</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the RequestedStatesSupported capabilities that may be used when creating a new SAP, if SAPCapabilitiesSupported has a value of 3, 'Create SAPs', otherwise ignored
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested States Supported For Created SAP</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionCapabilities_RequestedStatesSupportedForCreatedSAP()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_EnabledLogicalElementCapabilities.RequestedStatesSupported\",\"CIM_USBRedirectionCapabilities.SAPCapabilitiesSupported\"]'"
	 * @generated
	 */
	EList<Integer> getRequestedStatesSupportedForCreatedSAP();

	/**
	 * Returns the value of the '<em><b>Info Formats Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating which of the formats for CIM_RemoteServiceAcccessPoint.InfoFormat are supported by the USB Redirection Service. When a USB Redirection Session is configured with ConnectionMode = 3 'Connect' the USB Redirection SAP needs to know the remote service access point to connect to. The CIM_RemoteServiceAccessPoint class is used to model this information. InfoFormat describes the address format for CIM_RemoteServiceAccessPoint.AccessInfo. which tells the local SAP where to find the USB redirection remote access point modeled by CIM_RemoteServiceAccessPoint. InfoFormatsSupported describes the AccessInfo formats that are supported by the local USB Redirection Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Info Formats Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionCapabilities_InfoFormatsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"100\",\"101\",\"102\",\"103\",\"104\",\"200\",\"201\",\"202\",\"203\",\"204\",\"205\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Host Name\",\"IPv4 Address\",\"IPv6 Address\",\"IPX Address\",\"DECnet Address\",\"SNA Address\",\"Autonomous System Number\",\"MPLS Label\",\"IPv4 Subnet Address\",\"IPv6 Subnet Address\",\"IPv4 Address Range\",\"IPv6 Address Range\",\"Dial String\",\"Ethernet Address\",\"Token Ring Address\",\"ATM Address\",\"Frame Relay Address\",\"URL\",\"FQDN\",\"User FQDN\",\"DER ASN1 DN\",\"DER ASN1 GN\",\"Key ID\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_RemoteServiceAccessPoint.InfoFormat\"]'"
	 * @generated
	 */
	EList<Integer> getInfoFormatsSupported();

	/**
	 * Returns the value of the '<em><b>Single Class Per SAP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SingleClassPerSAP indicates that only instances of CIM_USBDevice whose ClassCode property have the same value as each other shall be associated with the instances of CIM_USBRedirectionSAP.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Single Class Per SAP</em>' attribute.
	 * @see #setSingleClassPerSAP(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_USBRedirectionCapabilities_SingleClassPerSAP()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_USBDevice.ClassCode\"]'"
	 * @generated
	 */
	Boolean getSingleClassPerSAP();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_USBRedirectionCapabilities#getSingleClassPerSAP <em>Single Class Per SAP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Class Per SAP</em>' attribute.
	 * @see #getSingleClassPerSAP()
	 * @generated
	 */
	void setSingleClassPerSAP(Boolean value);

} // CIM_USBRedirectionCapabilities

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
 * A representation of the model object '<em><b>CIM Media Redirection Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * MediaRedirectionCapabilities describes the capabilities of the Media Redirection Service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MediaRedirectionCapabilities#getConnectionModesSupported <em>Connection Modes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaRedirectionCapabilities#getDevicesSupported <em>Devices Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaRedirectionCapabilities#getMaxDevicesSupported <em>Max Devices Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaRedirectionCapabilities#getMaxDevicesPerSAP <em>Max Devices Per SAP</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaRedirectionCapabilities#getSAPCapabilitiesSupported <em>SAP Capabilities Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_MediaRedirectionCapabilities#getInfoFormatsSupported <em>Info Formats Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MediaRedirectionCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::MediaRedirection' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_MediaRedirectionCapabilities extends CIM_RedirectionServiceCapabilities {
	/**
	 * Returns the value of the '<em><b>Connection Modes Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connection mode used to configure the session. A value set to 2 = "Listen" shall indicate that the SAP will listen for a connection request from the remote Media redirection server. A CIM_BindsTo association to a CIM_ProtocolEndoint may be used to represent where the SAP is listening for the connection request. A value set to 3 = "Connect" shall indicate that the the SAP shall initiate the connection to the remote Media redirection server. A CIM_RemoteAccessAvailableToElement association to a CIM_RemoteServiceAccessPoint may be used to represent where the SAP shall connect to the remote Media redirection server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Modes Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaRedirectionCapabilities_ConnectionModesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Listen\",\"Connect\",\"DMTF Reserved\",\"Vendor Specified\"]' ModelCorrespondence='[\"CIM_MediaRedirectionSAP.ConnectionMode\"]'"
	 * @generated
	 */
	EList<Integer> getConnectionModesSupported();

	/**
	 * Returns the value of the '<em><b>Devices Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the types of Media Devices which are supported by the Media Redirection Service. Note that each entry of this array is related to the entry in the MaxDevicesSupported array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Devices Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaRedirectionCapabilities_DevicesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"CIM_CDROMDrive\",\"CIM_DiskDrive\",\"CIM_DisketteDrive\",\"CIM_DVDDrive\",\"CIM_MagnetoOpticalDrive\",\"CIM_TapDrive\",\"CIM_WORMDrive\",\"DMTF_ Reserved\",\"Vendor_ Specified\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_MediaRedirectionCapabilities.MaxDevicesSupported\"]'"
	 * @generated
	 */
	EList<Integer> getDevicesSupported();

	/**
	 * Returns the value of the '<em><b>Max Devices Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the number of Media devices which are supported for the devices specified in the DevicesSupported array property. Note that each entry of this array is related to the entry in the DevicesSupported that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Devices Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaRedirectionCapabilities_MaxDevicesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_MediaRedirectionCapabilities.DevicesSupported\"]'"
	 * @generated
	 */
	EList<Integer> getMaxDevicesSupported();

	/**
	 * Returns the value of the '<em><b>Max Devices Per SAP</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the number of Media devices per MediaRedirection Session which are supported for the devices specified in the DevicesSupported array property. Note that each entry of this array is related to the engry in the DevicesSupported array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Devices Per SAP</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaRedirectionCapabilities_MaxDevicesPerSAP()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_MediaRedirectionCapabilities.DevicesSupported\"]'"
	 * @generated
	 */
	EList<Integer> getMaxDevicesPerSAP();

	/**
	 * Returns the value of the '<em><b>SAP Capabilities Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating the whether instances of USBRedirectionSAPs already exist and whether whether SAPs can be created. A value set to 2 = "Modify Timeouts" shall indicate that the timeout parameters of instances of CIM_USBRedirectionSAP can be modified by applications using 'ModifyInstance'
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SAP Capabilities Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaRedirectionCapabilities_SAPCapabilitiesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Modify SAP\",\"DMTF Reserved\",\"Vendor Specified\"]'"
	 * @generated
	 */
	EList<Integer> getSAPCapabilitiesSupported();

	/**
	 * Returns the value of the '<em><b>Info Formats Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration indicating which of the formats for CIM_RemoteServiceAccessPoint.InfoFormat are supported by the Media Redirection Service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Info Formats Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaRedirectionCapabilities_InfoFormatsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"10\",\"11\",\"12\",\"13\",\"100\",\"101\",\"102\",\"200\",\"201\",\"202\",\"203\",\"204\",\"205\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Host Name\",\"IPv4 Address\",\"IPv6 Address\",\"IPX Address\",\"DECnet Address\",\"SNA Address\",\"IPv4 Subnet Address\",\"IPv6 Subnet Address\",\"IPv4 Address Range\",\"IPv6 Address Range\",\"Dial String\",\"Ethernet Address\",\"Token Ring Address\",\"URL\",\"FQDN\",\"User FQDN\",\"DER ASN1 DN\",\"DER ASN1 GN\",\"Key ID\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_RemoteServiceAccessPoint.InfoFormat\"]'"
	 * @generated
	 */
	EList<Integer> getInfoFormatsSupported();

} // CIM_MediaRedirectionCapabilities

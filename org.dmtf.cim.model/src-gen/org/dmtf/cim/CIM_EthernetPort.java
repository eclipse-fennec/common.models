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
 * A representation of the model object '<em><b>CIM Ethernet Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of an EthernetPort.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPort#getMaxDataSize <em>Max Data Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPort#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPort#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPort#getEnabledCapabilities <em>Enabled Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPort#getOtherEnabledCapabilities <em>Other Enabled Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPort#getPVID <em>PVID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPort#getPoEPowerEntityType <em>Po EPower Entity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPort#getPortDiscriminator <em>Port Discriminator</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPort()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.35.0' UMLPackagePath='CIM::Device::Ports' ModelCorrespondence='[\"CIM_NetworkPort.OtherNetworkPortType\"]' override.PortType='uint16' override.PortType.Description='The specific mode that is currently enabled for the Port. When set to 1 (\"Other\"), the related property OtherPortType contains a string description of the type of port.' override.PortType.ValueMap='[\"0\",\"1\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"100\",\"101\",\"102\",\"103\",\"104\",\"105\",\"106\",\"107\",\"108\",\"109\",\"110\",\"111\",\"112\",\"200\",\"201\",\"202\",\"203\",\"204\",\"300\",\"301\",\"302\",\"303\",\"304\",\"305\",\"306\",\"16000..65535\"]' override.PortType.Values='[\"Unknown\",\"Other\",\"10BaseT\",\"10-100BaseT\",\"100BaseT\",\"1000BaseT\",\"2500BaseT\",\"10GBaseT\",\"10GBase-CX4\",\"1000Base-KX\",\"10GBase-KX4\",\"10GBase-KR\",\"1000-10GBase-KX\",\"1000Base-KX10GBase-KX4KR\",\"10-100-1000BaseT\",\"100-1000-10GBaseT\",\"100Base-FX\",\"100Base-SX\",\"1000Base-SX\",\"1000Base-LX\",\"1000Base-CX\",\"10GBase-SR\",\"10GBase-SW\",\"10GBase-LX4\",\"10GBase-LR\",\"10GBase-LW\",\"10GBase-ER\",\"10GBase-EW\",\"10GBase-LRM\",\"40GBase-KR4\",\"40GBase-CR4\",\"40GBase-SR4\",\"40GBase-FR\",\"40GBase-LR4\",\"100GBase-CR10\",\"100GBase-SR10\",\"100GBase-LR4\",\"100GBase-ER4\",\"100GBase-KR4\",\"100GBase-CR4\",\"100GBase-KP4\",\"Vendor Reserved\"]' override.PortType.ModelCorrespondence='[\"CIM_NetworkPort.OtherNetworkPortType\"]' override.NetworkAddresses='string[]' override.NetworkAddresses.Description='Ethernet/802.3 MAC addresses formatted as twelve hexadecimal digits (for example, \"010203040506\"), with each pair representing one of the six octets of the MAC address in \"canonical\" bit order. (Therefore, the Group address bit is found in the low order bit of the first character of the string.)' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_EthernetPort extends CIM_NetworkPort {
	/**
	 * Returns the value of the '<em><b>Max Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum size of the INFO (non-MAC) field that will be received or transmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Data Size</em>' attribute.
	 * @see #setMaxDataSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPort_MaxDataSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dTpPortMaxInfo\"]'"
	 * @generated
	 */
	Long getMaxDataSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPort#getMaxDataSize <em>Max Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Data Size</em>' attribute.
	 * @see #getMaxDataSize()
	 * @generated
	 */
	void setMaxDataSize(Long value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Capabilities of the EthernetPort. For example, the Device might support AlertOnLan, WakeOnLan, Load Balancing, or FailOver. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability. LLDP indicates that this Ethernet Port is capable of supporting Link Layer Discovery Protocol (LLDP) communications. PoE indicates that this Ethernet Port is capable of supporting Power over Ethernet (PoE). EEE indicates that this Ethernet Port is capable of supporting Energy Efficient Ethernet (EEE). DCE indicates that this Ethernet Port is capable of supporting Data Center Ethernet. Data Center Ethernet requires support for Prioritiy-Based Flow Control (PFC), Enhanced Transmission Selection (ETS), and Data Center Bridging eXchange (DCBX) protocol. VDP indicates that this Ethernet Port is capable of supporting Virtual Station Interface (VSI) Discovery Protocol. S-Channel indicates that this Ethernet Port is capable of supporting S-Channel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPort_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\"]' Values='[\"Unknown\",\"Other\",\"AlertOnLan\",\"WakeOnLan\",\"FailOver\",\"LoadBalancing\",\"LLDP\",\"PoE\",\"EEE\",\"DCE\",\"VDP\",\"S-Channel\",\"DMTF Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_EthernetPort.CapabilityDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Capability Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings that provides more detailed explanations for any of the EthernetPort features that are indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPort_CapabilityDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_EthernetPort.Capabilities\"]'"
	 * @generated
	 */
	EList<String> getCapabilityDescriptions();

	/**
	 * Returns the value of the '<em><b>Enabled Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies which capabilities are enabled from the list of all supported ones, which are defined in the Capabilities array. For details on each capability, see the description of each capability in the description of property Capabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPort_EnabledCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\"]' Values='[\"Unknown\",\"Other\",\"AlertOnLan\",\"WakeOnLan\",\"FailOver\",\"LoadBalancing\",\"LLDP\",\"PoE\",\"EEE\",\"DCE\",\"VDP\",\"S-Channel\",\"DMTF Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_EthernetPort.Capabilities\",\"CIM_EthernetPort.OtherEnabledCapabilities\"]'"
	 * @generated
	 */
	EList<Integer> getEnabledCapabilities();

	/**
	 * Returns the value of the '<em><b>Other Enabled Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings that provides more detailed explanations for any of the enabled capabilities that are specified as 'Other'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Enabled Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPort_OtherEnabledCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_EthernetPort.EnabledCapabilities\"]'"
	 * @generated
	 */
	EList<String> getOtherEnabledCapabilities();

	/**
	 * Returns the value of the '<em><b>PVID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each ethernet port on an ethernet switch has a VLAN ID that is called Port VLAN ID (PVID). The PVID will be applied to the frames which are untagged or tagged with priority ( vid = 0 ). This property indicates the PVID of the Ethernet port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PVID</em>' attribute.
	 * @see #setPVID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPort_PVID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true'"
	 * @generated
	 */
	Integer getPVID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPort#getPVID <em>PVID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PVID</em>' attribute.
	 * @see #getPVID()
	 * @generated
	 */
	void setPVID(Integer value);

	/**
	 * Returns the value of the '<em><b>Po EPower Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property indicates the Power over Ethernet power entity type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Po EPower Entity Type</em>' attribute.
	 * @see #setPoEPowerEntityType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPort_PoEPowerEntityType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\"]' Values='[\"None\",\"Other\",\"Power Sourcing Equipment\",\"Powered Device\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Integer getPoEPowerEntityType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPort#getPoEPowerEntityType <em>Po EPower Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Po EPower Entity Type</em>' attribute.
	 * @see #getPoEPowerEntityType()
	 * @generated
	 */
	void setPoEPowerEntityType(Integer value);

	/**
	 * Returns the value of the '<em><b>Port Discriminator</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string array used to discriminate the supported context of this EthernetPort. The following strings are currently defined: 
	 * 'SNIA:None' - indicates this EthernetPort does not provide support for any specific function.
	 * 'SNIA:iSCSI' - indicates this EthernetPort provides support for iSCSI.
	 * 'SNIA:FCoE' - indicates that this EthernetPort provides support for FC over Ethernet - FCoE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Discriminator</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPort_PortDiscriminator()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getPortDiscriminator();

} // CIM_EthernetPort

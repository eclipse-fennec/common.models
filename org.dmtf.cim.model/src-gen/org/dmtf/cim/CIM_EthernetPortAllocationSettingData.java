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
 * A representation of the model object '<em><b>CIM Ethernet Port Allocation Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The EthernetPortAllocationSettingData class represents settings specifically related to the allocation of an EthernetPort that are outside the scope of the EthernetPort CIM class itself. These settings are used to provide information specific to the resource itself.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getDesiredVLANEndpointMode <em>Desired VLAN Endpoint Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getOtherEndpointMode <em>Other Endpoint Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getAllowedPriorities <em>Allowed Priorities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getAllowedToReceiveMACAddresses <em>Allowed To Receive MAC Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getAllowedToReceiveVLANs <em>Allowed To Receive VLA Ns</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getAllowedToTransmitMACAddresses <em>Allowed To Transmit MAC Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getAllowedToTransmitVLANs <em>Allowed To Transmit VLA Ns</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getDefaultPortVID <em>Default Port VID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getDefaultPriority <em>Default Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getManagerID <em>Manager ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getNetworkPortProfileID <em>Network Port Profile ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getNetworkPortProfileIDType <em>Network Port Profile ID Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getOtherNetworkPortProfileIDTypeInfo <em>Other Network Port Profile ID Type Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getPortCorrelationID <em>Port Correlation ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getPortVID <em>Port VID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getPromiscuous <em>Promiscuous</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getReceiveBandwidthLimit <em>Receive Bandwidth Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getReceiveBandwidthReservation <em>Receive Bandwidth Reservation</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getSourceMACFilteringEnabled <em>Source MAC Filtering Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getVSITypeID <em>VSI Type ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getVSITypeIDVersion <em>VSI Type ID Version</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.33.0' UMLPackagePath='CIM::Core::Resource' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_EthernetPortAllocationSettingData extends CIM_ResourceAllocationSettingData {
	/**
	 * Returns the value of the '<em><b>Desired VLAN Endpoint Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The desired VLAN mode that is requested for use. This property is used to set the initial OperationalEndpointMode property value in the instance of CIM_VLANEndpoint associated with the targeted Ethernet Port.Refer to the description for the property OperationalEndpointMode in CIM_VLANEndpoint for a description of the values
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Desired VLAN Endpoint Mode</em>' attribute.
	 * @see #setDesiredVLANEndpointMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_DesiredVLANEndpointMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"DMTF Reserved\",\"Other\",\"Access\",\"Dynamic Auto\",\"Dynamic Desirable\",\"Trunk\",\"Dot1Q Tunnel\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_VLANEndpoint.OperationalEndpointMode\",\"CIM_VLANEndpoint.DesiredEndpointMode\",\"CIM_EthernetPortAllocationSettingData.OtherEndpointMode\"]'"
	 * @generated
	 */
	Integer getDesiredVLANEndpointMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getDesiredVLANEndpointMode <em>Desired VLAN Endpoint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired VLAN Endpoint Mode</em>' attribute.
	 * @see #getDesiredVLANEndpointMode()
	 * @generated
	 */
	void setDesiredVLANEndpointMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Endpoint Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the type of VLAN endpoint model that is supported by this VLANEndpoint, when the value of the mode property is set to 1 (i.e., "Other"). This property should be set to NULL when the mode property is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Endpoint Mode</em>' attribute.
	 * @see #setOtherEndpointMode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_OtherEndpointMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_EthernetPortAllocationSettingData.DesiredVLANEndpointMode\"]'"
	 * @generated
	 */
	String getOtherEndpointMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getOtherEndpointMode <em>Other Endpoint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Endpoint Mode</em>' attribute.
	 * @see #getOtherEndpointMode()
	 * @generated
	 */
	void setOtherEndpointMode(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Priorities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of 802.1Q PCP values that this port is allowed to transmit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed Priorities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_AllowedPriorities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]'"
	 * @generated
	 */
	EList<Integer> getAllowedPriorities();

	/**
	 * Returns the value of the '<em><b>Allowed To Receive MAC Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indexed array of MAC address that this port is allowed to accept receive traffic. This array is index-correlated with the AllowedToReceiveVLANs array to support filtering on MAC,VID pairs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed To Receive MAC Addresses</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_AllowedToReceiveMACAddresses()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_EthernetPortAllocationSettingData.AllowedToReceiveVLANs\"]'"
	 * @generated
	 */
	EList<String> getAllowedToReceiveMACAddresses();

	/**
	 * Returns the value of the '<em><b>Allowed To Receive VLA Ns</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indexed array of VIDs that this port is allowed to accept traffic from. This array is index-correlated with the AllowedToReceiveMACAddresses array to support filtering on MAC,VID pairs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed To Receive VLA Ns</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_AllowedToReceiveVLANs()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_EthernetPortAllocationSettingData.AllowedToReceiveMACAddresses\"]'"
	 * @generated
	 */
	EList<Integer> getAllowedToReceiveVLANs();

	/**
	 * Returns the value of the '<em><b>Allowed To Transmit MAC Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indexed array of MAC addresses used for source MAC filtering. This array is index-correlated with the AllowedToTransmitVLANs array to support filtering on MAC,VID Pairs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed To Transmit MAC Addresses</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_AllowedToTransmitMACAddresses()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_EthernetPortAllocationSettingData.AllowedToTransmitVLANs\"]'"
	 * @generated
	 */
	EList<String> getAllowedToTransmitMACAddresses();

	/**
	 * Returns the value of the '<em><b>Allowed To Transmit VLA Ns</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An index array of VIDs that this port is allowed to transmit. This array is index-correlated with the AllowedToTransmitMACAddresses array to support filtering on MAC,VID pairs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allowed To Transmit VLA Ns</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_AllowedToTransmitVLANs()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_EthernetPortAllocationSettingData.AllowedToTransmitMACAddresses\"]'"
	 * @generated
	 */
	EList<Integer> getAllowedToTransmitVLANs();

	/**
	 * Returns the value of the '<em><b>Default Port VID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default VID value for the PortVID on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Port VID</em>' attribute.
	 * @see #setDefaultPortVID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_DefaultPortVID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_VLANEndpointSettingData.DefaultVLAN\"]'"
	 * @generated
	 */
	Integer getDefaultPortVID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getDefaultPortVID <em>Default Port VID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Port VID</em>' attribute.
	 * @see #getDefaultPortVID()
	 * @generated
	 */
	void setDefaultPortVID(Integer value);

	/**
	 * Returns the value of the '<em><b>Default Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The default 802.1Q PCP bits assigned to transmit packets.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Priority</em>' attribute.
	 * @see #setDefaultPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_DefaultPriority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getDefaultPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getDefaultPriority <em>Default Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Priority</em>' attribute.
	 * @see #getDefaultPriority()
	 * @generated
	 */
	void setDefaultPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GroupID is an identifier that refers to the VLAN associated with the VSI specified in the VDP TLV as definded in IEEE 802.1Qbg.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group ID</em>' attribute.
	 * @see #setGroupID(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_GroupID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getGroupID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getGroupID <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group ID</em>' attribute.
	 * @see #getGroupID()
	 * @generated
	 */
	void setGroupID(Long value);

	/**
	 * Returns the value of the '<em><b>Manager ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If not null has the value of the VDP TLV VSI Manager ID as specified in 802.1Qbg
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manager ID</em>' attribute.
	 * @see #setManagerID(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_ManagerID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getManagerID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getManagerID <em>Manager ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager ID</em>' attribute.
	 * @see #getManagerID()
	 * @generated
	 */
	void setManagerID(Long value);

	/**
	 * Returns the value of the '<em><b>Network Port Profile ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Network port profile ID is used to map the port with an existing network port profile conforming to the schema specified in DSP8049.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Port Profile ID</em>' attribute.
	 * @see #setNetworkPortProfileID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_NetworkPortProfileID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getNetworkPortProfileID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getNetworkPortProfileID <em>Network Port Profile ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Port Profile ID</em>' attribute.
	 * @see #getNetworkPortProfileID()
	 * @generated
	 */
	void setNetworkPortProfileID(String value);

	/**
	 * Returns the value of the '<em><b>Network Port Profile ID Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to indicate the type of the network profile ID, typically a UUID or URI
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Network Port Profile ID Type</em>' attribute.
	 * @see #setNetworkPortProfileIDType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_NetworkPortProfileIDType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Unknown\",\"Other\",\"URI\",\"UUID\",\"VSI Instance ID\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_EthernetPortAllocationSettingData.OtherNetworkPortProfileIDTypeInfo\"]'"
	 * @generated
	 */
	Integer getNetworkPortProfileIDType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getNetworkPortProfileIDType <em>Network Port Profile ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Port Profile ID Type</em>' attribute.
	 * @see #getNetworkPortProfileIDType()
	 * @generated
	 */
	void setNetworkPortProfileIDType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Network Port Profile ID Type Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that shall describe the NetworkPortProfileIDType when a well defined value is not available and NetworkPortProfileIDType matches 1(Other). This property should be set to null when the NetworkPortProfileIDType is set to any other value than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Network Port Profile ID Type Info</em>' attribute.
	 * @see #setOtherNetworkPortProfileIDTypeInfo(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_OtherNetworkPortProfileIDTypeInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_EthernetPortAllocationSettingData.NetworkPortProfileIDType\"]'"
	 * @generated
	 */
	String getOtherNetworkPortProfileIDTypeInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getOtherNetworkPortProfileIDTypeInfo <em>Other Network Port Profile ID Type Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Network Port Profile ID Type Info</em>' attribute.
	 * @see #getOtherNetworkPortProfileIDTypeInfo()
	 * @generated
	 */
	void setOtherNetworkPortProfileIDTypeInfo(String value);

	/**
	 * Returns the value of the '<em><b>Port Correlation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used to identify a port within a data center. The property is typically set to the port VSI Instance ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Correlation ID</em>' attribute.
	 * @see #setPortCorrelationID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_PortCorrelationID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPortCorrelationID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getPortCorrelationID <em>Port Correlation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Correlation ID</em>' attribute.
	 * @see #getPortCorrelationID()
	 * @generated
	 */
	void setPortCorrelationID(String value);

	/**
	 * Returns the value of the '<em><b>Port VID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VID that is used to tag untagged traffic received on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port VID</em>' attribute.
	 * @see #setPortVID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_PortVID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_VLANEndpointSettingData.NativeVLAN\"]'"
	 * @generated
	 */
	Integer getPortVID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getPortVID <em>Port VID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port VID</em>' attribute.
	 * @see #getPortVID()
	 * @generated
	 */
	void setPortVID(Integer value);

	/**
	 * Returns the value of the '<em><b>Promiscuous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to true receive traffic without destination MAC address filtering. If set to false MAC address filtering may be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Promiscuous</em>' attribute.
	 * @see #setPromiscuous(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_Promiscuous()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getPromiscuous();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getPromiscuous <em>Promiscuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promiscuous</em>' attribute.
	 * @see #getPromiscuous()
	 * @generated
	 */
	void setPromiscuous(Boolean value);

	/**
	 * Returns the value of the '<em><b>Receive Bandwidth Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifes the upper bounds or maximum amount of receive bandwidth allowed through this port. The value of the ReceiveBandwidthLimit property is expressed in the unit specified by the value of the AllocationUnits property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Bandwidth Limit</em>' attribute.
	 * @see #setReceiveBandwidthLimit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_ReceiveBandwidthLimit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.AllocationUnits\"]'"
	 * @generated
	 */
	Long getReceiveBandwidthLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getReceiveBandwidthLimit <em>Receive Bandwidth Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Bandwidth Limit</em>' attribute.
	 * @see #getReceiveBandwidthLimit()
	 * @generated
	 */
	void setReceiveBandwidthLimit(Long value);

	/**
	 * Returns the value of the '<em><b>Receive Bandwidth Reservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies the amount of receive bandwidth guaranteed to be available for this allocation. The value of the ReceiveBandwidthReservation property is expressed in the unit specified by the value of the AllocationUnits property. On systems which support over-commitment of resources, this value is typically used for admission control to prevent an an allocation from being accepted thus preventing starvation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Bandwidth Reservation</em>' attribute.
	 * @see #setReceiveBandwidthReservation(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_ReceiveBandwidthReservation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.AllocationUnits\"]'"
	 * @generated
	 */
	Long getReceiveBandwidthReservation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getReceiveBandwidthReservation <em>Receive Bandwidth Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Bandwidth Reservation</em>' attribute.
	 * @see #getReceiveBandwidthReservation()
	 * @generated
	 */
	void setReceiveBandwidthReservation(Long value);

	/**
	 * Returns the value of the '<em><b>Source MAC Filtering Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if source MAC filtering is enabled. If enabled only incoming traffic with a MAC Address that matches the CIM_LANEndpoint.MACAddress or traffic with a MAC Address and VID that matches one of the pairing of property values contained in AllowedToTransmitMACAddresses[] and AllowedToTransmitVLANS[] is allowed. If not enable all traffic with any MAC address or VID is allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source MAC Filtering Enabled</em>' attribute.
	 * @see #setSourceMACFilteringEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_SourceMACFilteringEnabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_LANEndpoint.MACAddress\"]'"
	 * @generated
	 */
	Boolean getSourceMACFilteringEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getSourceMACFilteringEnabled <em>Source MAC Filtering Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source MAC Filtering Enabled</em>' attribute.
	 * @see #getSourceMACFilteringEnabled()
	 * @generated
	 */
	void setSourceMACFilteringEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>VSI Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The VSI type identifier (VTID) is an integer value used to identify a pre-configured set of controls and attributes that are associated with a set of virtual station interfaces (VSIs) as specified in IEEE P802.1Qbg
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VSI Type ID</em>' attribute.
	 * @see #setVSITypeID(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_VSITypeID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MaxValue='16777215'"
	 * @generated
	 */
	Long getVSITypeID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getVSITypeID <em>VSI Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VSI Type ID</em>' attribute.
	 * @see #getVSITypeID()
	 * @generated
	 */
	void setVSITypeID(Long value);

	/**
	 * Returns the value of the '<em><b>VSI Type ID Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The VSI Type Identifier Version is an integer identifier designating the expected/
	 * desired VTID version. The VTID version allows a VSI Manager database to contain multiple versions of a given VSI Type, allowing smooth migration to newer VSI types; as definded in IEEE P802.1Qbg
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VSI Type ID Version</em>' attribute.
	 * @see #setVSITypeIDVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetPortAllocationSettingData_VSITypeIDVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8'"
	 * @generated
	 */
	Integer getVSITypeIDVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetPortAllocationSettingData#getVSITypeIDVersion <em>VSI Type ID Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VSI Type ID Version</em>' attribute.
	 * @see #getVSITypeIDVersion()
	 * @generated
	 */
	void setVSITypeIDVersion(Integer value);

} // CIM_EthernetPortAllocationSettingData

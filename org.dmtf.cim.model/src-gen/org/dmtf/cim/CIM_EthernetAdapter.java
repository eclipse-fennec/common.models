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
 * A representation of the model object '<em><b>CIM Ethernet Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the CIM_EthernetAdapter class has been deprecated, consistent with NetworkAdapter. Instead use the CIM_EthernetPort class. 
 * Deprecated description: This class describes the capabilities and management aspects of an EthernetAdapter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getMaxDataSize <em>Max Data Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getEnabledCapabilities <em>Enabled Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getSymbolErrors <em>Symbol Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getTotalPacketsTransmitted <em>Total Packets Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getTotalPacketsReceived <em>Total Packets Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getAlignmentErrors <em>Alignment Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getFCSErrors <em>FCS Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getSingleCollisionFrames <em>Single Collision Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getMultipleCollisionFrames <em>Multiple Collision Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getSQETestErrors <em>SQE Test Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getDeferredTransmissions <em>Deferred Transmissions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getLateCollisions <em>Late Collisions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getExcessiveCollisions <em>Excessive Collisions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getInternalMACTransmitErrors <em>Internal MAC Transmit Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getInternalMACReceiveErrors <em>Internal MAC Receive Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getCarrierSenseErrors <em>Carrier Sense Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_EthernetAdapter#getFrameTooLongs <em>Frame Too Longs</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_EthernetPort\"]' Version='2.10.0' UMLPackagePath='CIM::Device::NetworkAdapter' override.NetworkAddresses='string[]' override.NetworkAddresses.Deprecated='[\"CIM_EthernetPort.NetworkAddresses\"]' override.NetworkAddresses.Description='Note: The use of this method has been deprecated. \nDeprecated description: Ethernet/802.3 MAC addresses formatted as twelve hexadecimal digits (for example, \"010203040506\"), with each pair representing one of the six octets of the MAC address in \"canonical\" bit order. (Therefore, the Group address bit is found in the low order bit of the first character of the string.)' override.NetworkAddresses.ArrayType='Indexed' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_EthernetAdapter extends CIM_NetworkAdapter {
	/**
	 * Returns the value of the '<em><b>Max Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The maximum size of the INFO (non-MAC) field that will be received or transmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Data Size</em>' attribute.
	 * @see #setMaxDataSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_MaxDataSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EthernetPort.MaxDataSize\"]' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dTpPortMaxInfo\"]'"
	 * @generated
	 */
	Long getMaxDataSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getMaxDataSize <em>Max Data Size</em>}' attribute.
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
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Capabilities of the EthernetAdapter. For example, the Device might support AlertOnLan, WakeOnLan, Load Balancing, or FailOver. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_EthernetPort.Capabilities\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"AlertOnLan\",\"WakeOnLan\",\"FailOver\",\"LoadBalancing\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_EthernetAdapter.CapabilityDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Capability Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: An array of free-form strings that provides more detailed explanations for any of the EthernetAdapter features that are indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_CapabilityDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_EthernetPort.CapabilityDescriptions\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_EthernetAdapter.Capabilities\"]'"
	 * @generated
	 */
	EList<String> getCapabilityDescriptions();

	/**
	 * Returns the value of the '<em><b>Enabled Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Specifies which capabilities are enabled from the list of all supported ones, which are defined in the Capabilities array.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_EnabledCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_EthernetPort.EnabledCapabilities\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"AlertOnLan\",\"WakeOnLan\",\"FailOver\",\"LoadBalancing\"]' ModelCorrespondence='[\"CIM_EthernetAdapter.Capabilities\"]'"
	 * @generated
	 */
	EList<Integer> getEnabledCapabilities();

	/**
	 * Returns the value of the '<em><b>Symbol Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of times there was an invalid data symbol when a valid carrier was present. The count is incremented at most once per carrier event, even if multiple symbol errors occur during the carrier event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbol Errors</em>' attribute.
	 * @see #setSymbolErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_SymbolErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EthernetPortStatistics.SymbolErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsSymbolErrors\"]'"
	 * @generated
	 */
	Long getSymbolErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getSymbolErrors <em>Symbol Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Errors</em>' attribute.
	 * @see #getSymbolErrors()
	 * @generated
	 */
	void setSymbolErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Total Packets Transmitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The total number of packets that are transmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Packets Transmitted</em>' attribute.
	 * @see #setTotalPacketsTransmitted(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_TotalPacketsTransmitted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_NetworkPortStatistics.PacketsTransmitted\"]' Counter='true' MappingStrings='[\"MIF.DMTF|Network Adapter 802 Port|001.6\"]'"
	 * @generated
	 */
	Long getTotalPacketsTransmitted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getTotalPacketsTransmitted <em>Total Packets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Packets Transmitted</em>' attribute.
	 * @see #getTotalPacketsTransmitted()
	 * @generated
	 */
	void setTotalPacketsTransmitted(Long value);

	/**
	 * Returns the value of the '<em><b>Total Packets Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The total number of packets that are received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Packets Received</em>' attribute.
	 * @see #setTotalPacketsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_TotalPacketsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_NetworkPortStatistics.PacketsReceived\"]' Counter='true' MappingStrings='[\"MIF.DMTF|Network Adapter 802 Port|001.8\"]'"
	 * @generated
	 */
	Long getTotalPacketsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getTotalPacketsReceived <em>Total Packets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Packets Received</em>' attribute.
	 * @see #getTotalPacketsReceived()
	 * @generated
	 */
	void setTotalPacketsReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Alignment Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A count of frames that were received on a particular interface, are not an integral number of octets in length, and do not pass the FCS check. The count that is represented by an instance of this object is incremented when the alignment Error status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtained are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alignment Errors</em>' attribute.
	 * @see #setAlignmentErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_AlignmentErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EthernetPortStatistics.AlignmentErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsAlignmentErrors\"]'"
	 * @generated
	 */
	Long getAlignmentErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getAlignmentErrors <em>Alignment Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment Errors</em>' attribute.
	 * @see #getAlignmentErrors()
	 * @generated
	 */
	void setAlignmentErrors(Long value);

	/**
	 * Returns the value of the '<em><b>FCS Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A count of frames that were received on a particular interface and are an integral number of octets in length, but do not pass the FCS check. The count represented by an instance of this object is incremented when the frame CheckError status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtained are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FCS Errors</em>' attribute.
	 * @see #setFCSErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_FCSErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EthernetPortStatistics.FCSErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsFCSErrors\"]'"
	 * @generated
	 */
	Long getFCSErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getFCSErrors <em>FCS Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FCS Errors</em>' attribute.
	 * @see #getFCSErrors()
	 * @generated
	 */
	void setFCSErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Single Collision Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A count of successfully transmitted frames on a particular interface for which transmission is inhibited by exactly one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the MultipleCollisionFrames property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Single Collision Frames</em>' attribute.
	 * @see #setSingleCollisionFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_SingleCollisionFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EthernetPortStatistics.SingleCollisionFrames\"]' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsSingleCollisionFrames\"]'"
	 * @generated
	 */
	Long getSingleCollisionFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getSingleCollisionFrames <em>Single Collision Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Collision Frames</em>' attribute.
	 * @see #getSingleCollisionFrames()
	 * @generated
	 */
	void setSingleCollisionFrames(Long value);

	/**
	 * Returns the value of the '<em><b>Multiple Collision Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A count of successfully transmitted frames on a particular interface for which transmission is inhibited by more than one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the SingleCollisionFrames property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiple Collision Frames</em>' attribute.
	 * @see #setMultipleCollisionFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_MultipleCollisionFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EthernetPortStatistics.MultipleCollisionFrames\"]' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsMultipleCollisionFrames\"]'"
	 * @generated
	 */
	Long getMultipleCollisionFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getMultipleCollisionFrames <em>Multiple Collision Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Collision Frames</em>' attribute.
	 * @see #getMultipleCollisionFrames()
	 * @generated
	 */
	void setMultipleCollisionFrames(Long value);

	/**
	 * Returns the value of the '<em><b>SQE Test Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A count of times that the SQE TEST ERROR message is generated by the PLS sublayer for a particular interface. The SQE TEST ERROR message is defined in section 7.2.2.2.4 of ANSI/IEEE 802.3-1985 and its generation is described in section 7.2.4.6 of the same document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SQE Test Errors</em>' attribute.
	 * @see #setSQETestErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_SQETestErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EthernetPortStatistics.SQETestErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsSQETestErrors\"]'"
	 * @generated
	 */
	Long getSQETestErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getSQETestErrors <em>SQE Test Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SQE Test Errors</em>' attribute.
	 * @see #getSQETestErrors()
	 * @generated
	 */
	void setSQETestErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Deferred Transmissions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A count of frames for which the first transmission attempt on a particular interface is delayed because the medium is busy. The count represented by an instance of this object does not include the frames that are involved in collisions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deferred Transmissions</em>' attribute.
	 * @see #setDeferredTransmissions(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_DeferredTransmissions()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EthernetPortStatistics.DeferredTransmissions\"]' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsDeferredTransmissions\"]'"
	 * @generated
	 */
	Long getDeferredTransmissions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getDeferredTransmissions <em>Deferred Transmissions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deferred Transmissions</em>' attribute.
	 * @see #getDeferredTransmissions()
	 * @generated
	 */
	void setDeferredTransmissions(Long value);

	/**
	 * Returns the value of the '<em><b>Late Collisions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of times that a collision is detected on a particular interface later than 512 bit-times into the transmission of a packet. Five hundred and twelve bit-times corresponds to 51.2 microseconds on a 10 Mbit/s system. A late collision included in a count that is represented by an instance of this object is also considered to be a generic collision for purposes of other collision-related statistics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Late Collisions</em>' attribute.
	 * @see #setLateCollisions(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_LateCollisions()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EthernetPortStatistics.LateCollisions\"]' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsLateCollisions\"]'"
	 * @generated
	 */
	Long getLateCollisions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getLateCollisions <em>Late Collisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Late Collisions</em>' attribute.
	 * @see #getLateCollisions()
	 * @generated
	 */
	void setLateCollisions(Long value);

	/**
	 * Returns the value of the '<em><b>Excessive Collisions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A count of frames for which transmission on a particular interface fails due to excessive collisions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excessive Collisions</em>' attribute.
	 * @see #setExcessiveCollisions(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_ExcessiveCollisions()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EthernetPortStatistics.ExcessiveCollisions\"]' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsExcessiveCollisions\"]'"
	 * @generated
	 */
	Long getExcessiveCollisions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getExcessiveCollisions <em>Excessive Collisions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excessive Collisions</em>' attribute.
	 * @see #getExcessiveCollisions()
	 * @generated
	 */
	void setExcessiveCollisions(Long value);

	/**
	 * Returns the value of the '<em><b>Internal MAC Transmit Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A count of frames for which transmission on a particular interface fails due to an internal MAC sublayer transmit error. A frame is counted by an instance of this object only if it is not counted by the corresponding instance of the LateCollisions property, the Excessive Collisions property, or the CarrierSenseErrors property. The precise meaning of the count represented by an instance of this object is implementation-specific. In particular, an instance of this object might represent a count of transmission errors on a particular interface that are not otherwise counted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal MAC Transmit Errors</em>' attribute.
	 * @see #setInternalMACTransmitErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_InternalMACTransmitErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EthernetPortStatistics.InternalMACTransmitErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsInternalMacTransmitErrors\"]'"
	 * @generated
	 */
	Long getInternalMACTransmitErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getInternalMACTransmitErrors <em>Internal MAC Transmit Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal MAC Transmit Errors</em>' attribute.
	 * @see #getInternalMACTransmitErrors()
	 * @generated
	 */
	void setInternalMACTransmitErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Internal MAC Receive Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A count of frames for which reception on a particular interface fails due to an internal MAC sublayer receive error. A frame is counted by an instance of this object only if it is not counted by the corresponding instance of the FrameTooLongs property the AlignmentErrors property, or the FCSErrors property. The precise meaning of the count that is represented by an instance of this object is implementation-specific. In particular, an instance of this object might represent a count of receive errors on a particular interface that are not otherwise counted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal MAC Receive Errors</em>' attribute.
	 * @see #setInternalMACReceiveErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_InternalMACReceiveErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EthernetPortStatistics.InternalMACReceiveErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsInternalMacReceiveErrors\"]'"
	 * @generated
	 */
	Long getInternalMACReceiveErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getInternalMACReceiveErrors <em>Internal MAC Receive Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal MAC Receive Errors</em>' attribute.
	 * @see #getInternalMACReceiveErrors()
	 * @generated
	 */
	void setInternalMACReceiveErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Carrier Sense Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of times that the carrier sense condition was lost or never asserted when attempting to transmit a frame on a particular interface. The count represented by an instance of this object is incremented, at most, once per transmission attempt, even if the carrier sense condition fluctuates during a transmission attempt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier Sense Errors</em>' attribute.
	 * @see #setCarrierSenseErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_CarrierSenseErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EthernetPortStatistics.CarrierSenseErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsCarrierSenseErrors\"]'"
	 * @generated
	 */
	Long getCarrierSenseErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getCarrierSenseErrors <em>Carrier Sense Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier Sense Errors</em>' attribute.
	 * @see #getCarrierSenseErrors()
	 * @generated
	 */
	void setCarrierSenseErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Frame Too Longs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A count of frames that are received on a particular interface that exceeds the maximum permitted frame size. The count that is represented by an instance of this object is incremented when the FrameTooLong status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtained are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frame Too Longs</em>' attribute.
	 * @see #setFrameTooLongs(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_EthernetAdapter_FrameTooLongs()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_EthernetPortStatistics.FrameTooLongs\"]' Counter='true' MappingStrings='[\"MIB.IETF|EtherLike-MIB.dot3StatsFrameTooLongs\"]'"
	 * @generated
	 */
	Long getFrameTooLongs();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_EthernetAdapter#getFrameTooLongs <em>Frame Too Longs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Too Longs</em>' attribute.
	 * @see #getFrameTooLongs()
	 * @generated
	 */
	void setFrameTooLongs(Long value);

} // CIM_EthernetAdapter

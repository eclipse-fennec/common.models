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
 * A representation of the model object '<em><b>CIM Token Ring Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the CIM_TokenRingAdapter class has been deprecated, consistent with NetworkAdapter. Instead use the CIM_TokenRingPort class. 
 * Deprecated description: This class describes the capabilities and management aspects of a TokenRingAdapter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getMaxDataSize <em>Max Data Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getEnabledCapabilities <em>Enabled Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getRingStatus <em>Ring Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getRingState <em>Ring State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getRingOpenStatus <em>Ring Open Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getRingSpeed <em>Ring Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getBurstErrors <em>Burst Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getACErrors <em>AC Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getAbortTransErrors <em>Abort Trans Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getInternalErrors <em>Internal Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getLostFrameErrors <em>Lost Frame Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getReceiveCongestions <em>Receive Congestions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getFrameCopiedErrors <em>Frame Copied Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getTokenErrors <em>Token Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getSoftErrors <em>Soft Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getHardErrors <em>Hard Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getSignalLossCount <em>Signal Loss Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getTransmittedBeacons <em>Transmitted Beacons</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getRecoverys <em>Recoverys</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getLobeWires <em>Lobe Wires</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getRemoves <em>Removes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getSingles <em>Singles</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingAdapter#getFrequencyErrors <em>Frequency Errors</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_TokenRingAdapter\"]' Version='2.10.0' UMLPackagePath='CIM::Device::NetworkAdapter' override.NetworkAddresses='string[]' override.NetworkAddresses.Deprecated='[\"CIM_TokenRingAdapter.NetworkAddresses\"]' override.NetworkAddresses.Description='Note: The use of this method has been deprecated. \nDeprecated description: Token Ring/802.5 MAC addresses formatted as twelve hexadecimal digits (for example, \"010203040506\"), with each pair representing one of the six octets of the MAC address in \"canonical\" bit order. (Therefore, the Group address bit is found in the low order bit of the first character of the string.)' override.NetworkAddresses.ArrayType='Indexed' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_TokenRingAdapter extends CIM_NetworkAdapter {
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
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_MaxDataSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPort.MaxDataSize\"]' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dTpPortMaxInfo\"]'"
	 * @generated
	 */
	Long getMaxDataSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getMaxDataSize <em>Max Data Size</em>}' attribute.
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
	 * Deprecated description: Capabilities of the TokenRingAdapter. For example, the Device might support AlertOnLan, WakeOnLan, Load Balancing, or Failover. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_TokenRingPort.Capabilities\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"AlertOnLan\",\"WakeOnLan\",\"FailOver\",\"LoadBalancing\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_TokenRingPort.CapabilityDescriptions\"]'"
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
	 * Deprecated description: An array of free-form strings that provides more detailed explanations for any of the TokenRingAdapter features that are indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_CapabilityDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"CIM_TokenRingPort.CapabilityDescriptions\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_TokenRingAdapter.Capabilities\"]'"
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
	 * Deprecated description: Specifies which of the capabilities from the "Capabilities" property are currently enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_EnabledCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_TokenRingPort.EnabledCapabilities\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"AlertOnLan\",\"WakeOnLan\",\"FailOver\",\"LoadBalancing\"]' ModelCorrespondence='[\"CIM_TokenRingAdapter.Capabilities\"]'"
	 * @generated
	 */
	EList<Integer> getEnabledCapabilities();

	/**
	 * Returns the value of the '<em><b>Ring Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The current status that can be used to diagnose fluctuating problems that can occur on token rings, after a station has successfully been added to the ring. Before an open is completed, this object contains the value that indicates "no status" (131072). (The RingState and RingOpenStatus properties are also provided for debugging problems when the station cannot even enter the ring.) The value of the property is a sum of values, one for each currently applicable condition. The following values are defined for various conditions: 
	 * 0=No Problems Detected, 32=Ring Recovery, 64=Single Station, 256=Remove Received, 512=Reserved, 1024= Auto-Removal Error, 2048=Lobe Wire Fault, 4096=Transmit Beacon, 8192=Soft Error, 16384=Hard Error, 32768=Signal Loss, 131072=No Status, Open Not Completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ring Status</em>' attribute.
	 * @see #setRingStatus(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_RingStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPort.RingStatus\"]' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5RingStatus\"]'"
	 * @generated
	 */
	Long getRingStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getRingStatus <em>Ring Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ring Status</em>' attribute.
	 * @see #getRingStatus()
	 * @generated
	 */
	void setRingStatus(Long value);

	/**
	 * Returns the value of the '<em><b>Ring State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The current Device state with respect to entering or leaving the ring.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ring State</em>' attribute.
	 * @see #setRingState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_RingState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_TokenRingPort.RingState\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Opened\",\"Closed\",\"Opening\",\"Closing\",\"Open Failure\",\"Ring Failure\"]' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5RingState\"]'"
	 * @generated
	 */
	Integer getRingState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getRingState <em>Ring State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ring State</em>' attribute.
	 * @see #getRingState()
	 * @generated
	 */
	void setRingState(Integer value);

	/**
	 * Returns the value of the '<em><b>Ring Open Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this property has been deprecated. 
	 * Deprecated description: This property indicates the success, or the reason for failure, of the most recent attempt of the station to enter the ring.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ring Open Status</em>' attribute.
	 * @see #setRingOpenStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_RingOpenStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_TokenRingPort.RingOpenStatus\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\"]' Values='[\"No Open Attempted\",\"Bad Parameter\",\"Lobe Failed\",\"Signal Loss\",\"Insertion Timeout\",\"Ring Failed\",\"Beaconing\",\"Duplicate MAC\",\"Request Failed\",\"Remove Received\",\"Last Open Successful\"]' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5RingOpenStatus\"]'"
	 * @generated
	 */
	Integer getRingOpenStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getRingOpenStatus <em>Ring Open Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ring Open Status</em>' attribute.
	 * @see #getRingOpenStatus()
	 * @generated
	 */
	void setRingOpenStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Ring Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The bandwidth of the ring.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ring Speed</em>' attribute.
	 * @see #setRingSpeed(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_RingSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_TokenRingPort.RingSpeed\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"One Megabit\",\"Four Megabit\",\"Sixteen Megabit\"]' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5RingSpeed\"]'"
	 * @generated
	 */
	Integer getRingSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getRingSpeed <em>Ring Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ring Speed</em>' attribute.
	 * @see #getRingSpeed()
	 * @generated
	 */
	void setRingSpeed(Integer value);

	/**
	 * Returns the value of the '<em><b>Burst Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: This counter is incremented when a station detects the absence of transitions for five half-bit timers (burst-five errors).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Burst Errors</em>' attribute.
	 * @see #setBurstErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_BurstErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.BurstErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5StatsBurstErrors\"]'"
	 * @generated
	 */
	Long getBurstErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getBurstErrors <em>Burst Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Burst Errors</em>' attribute.
	 * @see #getBurstErrors()
	 * @generated
	 */
	void setBurstErrors(Long value);

	/**
	 * Returns the value of the '<em><b>AC Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: This counter is incremented when a station receives an AMP or SMP frame in which A is equal to C, and C is equal to 0, and then receives another SMP frame with A equal to C, and C equal to 0 without first receiving an AMP frame. This condition indicates a station that cannot set the AC bits properly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AC Errors</em>' attribute.
	 * @see #setACErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_ACErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.ACErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5StatsACErrors\"]'"
	 * @generated
	 */
	Long getACErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getACErrors <em>AC Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AC Errors</em>' attribute.
	 * @see #getACErrors()
	 * @generated
	 */
	void setACErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Abort Trans Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: This counter is incremented when a station transmits an abort delimiter while transmitting data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abort Trans Errors</em>' attribute.
	 * @see #setAbortTransErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_AbortTransErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.AbortTransErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsAbortTransErrors\"]'"
	 * @generated
	 */
	Long getAbortTransErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getAbortTransErrors <em>Abort Trans Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abort Trans Errors</em>' attribute.
	 * @see #getAbortTransErrors()
	 * @generated
	 */
	void setAbortTransErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Internal Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: This counter is incremented when a station recognizes an internal error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal Errors</em>' attribute.
	 * @see #setInternalErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_InternalErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.InternalErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsInternalErrors\"]'"
	 * @generated
	 */
	Long getInternalErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getInternalErrors <em>Internal Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Errors</em>' attribute.
	 * @see #getInternalErrors()
	 * @generated
	 */
	void setInternalErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Lost Frame Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: This counter is incremented when a station is transmitting and its TRR timer expires. This result indicates a condition where a transmitting station in strip mode does not receive the trailer of the frame before the TRR timer goes off.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lost Frame Errors</em>' attribute.
	 * @see #setLostFrameErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_LostFrameErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.LostFrameErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsLostFrameErrors\"]'"
	 * @generated
	 */
	Long getLostFrameErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getLostFrameErrors <em>Lost Frame Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lost Frame Errors</em>' attribute.
	 * @see #getLostFrameErrors()
	 * @generated
	 */
	void setLostFrameErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Receive Congestions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: This counter is incremented when a station recognizes a frame addressed to its specific address but has no available buffer space, which indicates that the station is congested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Congestions</em>' attribute.
	 * @see #setReceiveCongestions(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_ReceiveCongestions()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.ReceiveCongestions\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsReceiveCongestions\"]'"
	 * @generated
	 */
	Long getReceiveCongestions();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getReceiveCongestions <em>Receive Congestions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Congestions</em>' attribute.
	 * @see #getReceiveCongestions()
	 * @generated
	 */
	void setReceiveCongestions(Long value);

	/**
	 * Returns the value of the '<em><b>Frame Copied Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: This counter is incremented when a station recognizes a frame that is addressed to its specific address and detects that the FS field A bits are set to 1, which indicates a possible line hit or duplicate address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frame Copied Errors</em>' attribute.
	 * @see #setFrameCopiedErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_FrameCopiedErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.FrameCopiedErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5StatsFrameCopiedErrors\"]'"
	 * @generated
	 */
	Long getFrameCopiedErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getFrameCopiedErrors <em>Frame Copied Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Copied Errors</em>' attribute.
	 * @see #getFrameCopiedErrors()
	 * @generated
	 */
	void setFrameCopiedErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Token Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: This counter is incremented when a station that acts as the active monitor recognizes an error condition that needs a token transmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Token Errors</em>' attribute.
	 * @see #setTokenErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_TokenErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.TokenErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5StatsTokenErrors\"]'"
	 * @generated
	 */
	Long getTokenErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getTokenErrors <em>Token Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Errors</em>' attribute.
	 * @see #getTokenErrors()
	 * @generated
	 */
	void setTokenErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Soft Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of Soft Errors that the Device has detected. This method directly corresponds to the number of Report Error MAC frames that this Device has transmitted. Soft Errors are those that are recoverable by the MAC layer protocols.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Soft Errors</em>' attribute.
	 * @see #setSoftErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_SoftErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.SoftErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5StatsSoftErrors\"]'"
	 * @generated
	 */
	Long getSoftErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getSoftErrors <em>Soft Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft Errors</em>' attribute.
	 * @see #getSoftErrors()
	 * @generated
	 */
	void setSoftErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Hard Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of times that this Device has detected an immediately recoverable fatal error. This method indicates the number of times that this Device is either transmitting or receiving beacon MAC frames.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hard Errors</em>' attribute.
	 * @see #setHardErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_HardErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.HardErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5StatsHardErrors\"]'"
	 * @generated
	 */
	Long getHardErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getHardErrors <em>Hard Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hard Errors</em>' attribute.
	 * @see #getHardErrors()
	 * @generated
	 */
	void setHardErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Signal Loss Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of times that this Device has detected the loss of signal condition from the ring.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Loss Count</em>' attribute.
	 * @see #setSignalLossCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_SignalLossCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.SignalLossCount\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5StatsSignalLoss\"]'"
	 * @generated
	 */
	Long getSignalLossCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getSignalLossCount <em>Signal Loss Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Loss Count</em>' attribute.
	 * @see #getSignalLossCount()
	 * @generated
	 */
	void setSignalLossCount(Long value);

	/**
	 * Returns the value of the '<em><b>Transmitted Beacons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of times that this Device has transmitted a beacon frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmitted Beacons</em>' attribute.
	 * @see #setTransmittedBeacons(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_TransmittedBeacons()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.TransmittedBeacons\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5StatsTransmitBeacons\"]'"
	 * @generated
	 */
	Long getTransmittedBeacons();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getTransmittedBeacons <em>Transmitted Beacons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmitted Beacons</em>' attribute.
	 * @see #getTransmittedBeacons()
	 * @generated
	 */
	void setTransmittedBeacons(Long value);

	/**
	 * Returns the value of the '<em><b>Recoverys</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of Claim Token MAC frames that are received or transmitted after the Device has received a Ring Purge MAC frame. This counter signifies the number of times that the ring has been purged and is being recovered back into a normal operating state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recoverys</em>' attribute.
	 * @see #setRecoverys(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_Recoverys()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.Recoverys\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5StatsRecoverys\"]'"
	 * @generated
	 */
	Long getRecoverys();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getRecoverys <em>Recoverys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recoverys</em>' attribute.
	 * @see #getRecoverys()
	 * @generated
	 */
	void setRecoverys(Long value);

	/**
	 * Returns the value of the '<em><b>Lobe Wires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of times that the Device has detected an open or short circuit in the lobe data path. The adapter will be closed and RingState will signify this condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lobe Wires</em>' attribute.
	 * @see #setLobeWires(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_LobeWires()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.LobeWires\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5StatsLobeWires\"]'"
	 * @generated
	 */
	Long getLobeWires();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getLobeWires <em>Lobe Wires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lobe Wires</em>' attribute.
	 * @see #getLobeWires()
	 * @generated
	 */
	void setLobeWires(Long value);

	/**
	 * Returns the value of the '<em><b>Removes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of times that the Device has received a Remove Ring Station MAC frame request. When this frame is received, the Device will enter the close state and RingState will signify this condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Removes</em>' attribute.
	 * @see #setRemoves(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_Removes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.Removes\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5StatsRemoves\"]'"
	 * @generated
	 */
	Long getRemoves();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getRemoves <em>Removes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removes</em>' attribute.
	 * @see #getRemoves()
	 * @generated
	 */
	void setRemoves(Long value);

	/**
	 * Returns the value of the '<em><b>Singles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of times that the Device has sensed that it is the only station on the ring. This situation occurs if the Device is the first one up on a ring or if there is a hardware problem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Singles</em>' attribute.
	 * @see #setSingles(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_Singles()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.Singles\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5StatsSingles\"]'"
	 * @generated
	 */
	Long getSingles();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getSingles <em>Singles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singles</em>' attribute.
	 * @see #getSingles()
	 * @generated
	 */
	void setSingles(Long value);

	/**
	 * Returns the value of the '<em><b>Frequency Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of times that the Device has detected that the frequency of the incoming signal differs from the expected frequency by more than that specified by the IEEE 802.5 standard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frequency Errors</em>' attribute.
	 * @see #setFrequencyErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingAdapter_FrequencyErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Deprecated='[\"CIM_TokenRingPortStatistics.FrequencyErrors\"]' Counter='true' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token RingMIB.dot5StatsFreqErrors\"]'"
	 * @generated
	 */
	Long getFrequencyErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingAdapter#getFrequencyErrors <em>Frequency Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Errors</em>' attribute.
	 * @see #getFrequencyErrors()
	 * @generated
	 */
	void setFrequencyErrors(Long value);

} // CIM_TokenRingAdapter

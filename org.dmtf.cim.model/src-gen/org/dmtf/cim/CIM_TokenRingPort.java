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
 * A representation of the model object '<em><b>CIM Token Ring Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities and management of a TokenRingPort.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPort#getMaxDataSize <em>Max Data Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPort#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPort#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPort#getEnabledCapabilities <em>Enabled Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPort#getOtherEnabledCapabilities <em>Other Enabled Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPort#getRingStatus <em>Ring Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPort#getRingState <em>Ring State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPort#getRingOpenStatus <em>Ring Open Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TokenRingPort#getRingSpeed <em>Ring Speed</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPort()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::Ports' override.NetworkAddresses='string[]' override.NetworkAddresses.Description='Token Ring/802.5 MAC addresses formatted as twelve hexadecimal digits (for example,\"010203040506\"), with each pair representing one of the six octets of the MAC address in \"canonical\" bit order. (Therefore, the Group address bit is found in the low order bit of the first character of the string.)' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_TokenRingPort extends CIM_NetworkPort {
	/**
	 * Returns the value of the '<em><b>Max Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum size of the INFO (non-MAC) field that will be received or transmitted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Data Size</em>' attribute.
	 * @see #setMaxDataSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPort_MaxDataSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIB.IETF|BRIDGE-MIB.dot1dTpPortMaxInfo\"]'"
	 * @generated
	 */
	Long getMaxDataSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPort#getMaxDataSize <em>Max Data Size</em>}' attribute.
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
	 * Capabilities of the TokenRingPort. For example, the Device might support AlertOnLan, WakeOnLan, Load Balancing, or Failover. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPort_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"AlertOnLan\",\"WakeOnLan\",\"FailOver\",\"LoadBalancing\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_TokenRingPort.CapabilityDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Capability Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings that provides more detailed explanations for any of the TokenRingAPort features that are indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPort_CapabilityDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_TokenRingPort.Capabilities\"]'"
	 * @generated
	 */
	EList<String> getCapabilityDescriptions();

	/**
	 * Returns the value of the '<em><b>Enabled Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies which of the capabilities from the "Capabilities" property are currently enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPort_EnabledCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"AlertOnLan\",\"WakeOnLan\",\"FailOver\",\"LoadBalancing\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_TokenRingPort.Capabilities\",\"CIM_TokenRingPort.OtherEnabledCapabilities\"]'"
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
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPort_OtherEnabledCapabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_TokenRingPort.EnabledCapabilities\"]'"
	 * @generated
	 */
	EList<String> getOtherEnabledCapabilities();

	/**
	 * Returns the value of the '<em><b>Ring Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current status that can be used to diagnose fluctuating problems that can occur on token rings, after a station has successfully been added to the ring. Before an open is completed, this object contains the value that indicates "no status" (131072). (The RingState and RingOpenStatus properties are also provided for debugging problems when the station cannot even enter the ring.) The value of the property is a sum of values, one for each currently applicable condition. The following values are defined for various conditions: 
	 * 0 = No Problems Detected, 32 = Ring Recovery, 64 = Single Station, 256 = Remove Received, 512 = Reserved, 1024 = Auto-Removal Error, 2048 = Lobe Wire Fault, 4096 = Transmit Beacon, 8192 = Soft Error, 16384 = Hard Error, 32768 = Signal Loss, 131072 = No Status, Open Not Completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ring Status</em>' attribute.
	 * @see #setRingStatus(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPort_RingStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5RingStatus\"]'"
	 * @generated
	 */
	Long getRingStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPort#getRingStatus <em>Ring Status</em>}' attribute.
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
	 * The current Device state with respect to entering or leaving the ring.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ring State</em>' attribute.
	 * @see #setRingState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPort_RingState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Opened\",\"Closed\",\"Opening\",\"Closing\",\"Open Failure\",\"Ring Failure\"]' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5RingState\"]'"
	 * @generated
	 */
	Integer getRingState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPort#getRingState <em>Ring State</em>}' attribute.
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
	 * This property indicates the success, or the reason for failure, of the most recent attempt by the station to enter the ring.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ring Open Status</em>' attribute.
	 * @see #setRingOpenStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPort_RingOpenStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\"]' Values='[\"No Open Attempted\",\"Bad Parameter\",\"Lobe Failed\",\"Signal Loss\",\"Insertion Timeout\",\"Ring Failed\",\"Beaconing\",\"Duplicate MAC\",\"Request Failed\",\"Remove Received\",\"Last Open Successful\"]' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5RingOpenStatus\"]'"
	 * @generated
	 */
	Integer getRingOpenStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPort#getRingOpenStatus <em>Ring Open Status</em>}' attribute.
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
	 * The bandwidth of the ring.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ring Speed</em>' attribute.
	 * @see #setRingSpeed(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_TokenRingPort_RingSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"One Megabit\",\"Four Megabit\",\"Sixteen Megabit\"]' MappingStrings='[\"MIB.IETF|IEEE 802.5 Token Ring MIB.dot5RingSpeed\"]'"
	 * @generated
	 */
	Integer getRingSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TokenRingPort#getRingSpeed <em>Ring Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ring Speed</em>' attribute.
	 * @see #getRingSpeed()
	 * @generated
	 */
	void setRingSpeed(Integer value);

} // CIM_TokenRingPort

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
 * A representation of the model object '<em><b>CIM Fibre Channel Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the CIM_FibreChannelAdapter class is deprecated, consistent with the deprecation of NetworkAdapter. Instead use CIM_FCPort. 
 * Deprecated description: This class describes the capabilities and management aspects of a Fibre Channel Adapter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getMaxFrameSize <em>Max Frame Size</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getSupportedCOS <em>Supported COS</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getFC4TypesSupported <em>FC4 Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getFC4VendorUniqueTypes <em>FC4 Vendor Unique Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getCurrentFC4Types <em>Current FC4 Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getCurrentFC4VendorTypes <em>Current FC4 Vendor Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getReceiveBufferErrors <em>Receive Buffer Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getReceiveEndErrors <em>Receive End Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getResourceAllocationTimeout <em>Resource Allocation Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getErrorDetectTimeout <em>Error Detect Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass1SequencesSent <em>Class1 Sequences Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass2SequencesSent <em>Class2 Sequences Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass3SequencesSent <em>Class3 Sequences Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass4SequencesSent <em>Class4 Sequences Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass2OctetsReceived <em>Class2 Octets Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass2OctetsTransmitted <em>Class2 Octets Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass2FramesReceived <em>Class2 Frames Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass2FramesTransmitted <em>Class2 Frames Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass2DiscardFrames <em>Class2 Discard Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass3OctetsReceived <em>Class3 Octets Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass3OctetsTransmitted <em>Class3 Octets Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass3FramesReceived <em>Class3 Frames Received</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass3FramesTransmitted <em>Class3 Frames Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass3DiscardFrames <em>Class3 Discard Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getParityErrors <em>Parity Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getFrameTimeouts <em>Frame Timeouts</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getBufferCreditErrors <em>Buffer Credit Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getEndCreditErrors <em>End Credit Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FibreChannelAdapter#getOutOfOrderFramesReceived <em>Out Of Order Frames Received</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_FCPort\"]' Version='2.10.0' UMLPackagePath='CIM::Device::NetworkAdapter' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_FibreChannelAdapter extends CIM_NetworkAdapter {
	/**
	 * Returns the value of the '<em><b>Max Frame Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The maximum frame size, in bytes, supported by the Adapter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Frame Size</em>' attribute.
	 * @see #setMaxFrameSize(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_MaxFrameSize()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_NetworkPort.SupportedMaximumTransmissionUnit\"]' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getMaxFrameSize();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getMaxFrameSize <em>Max Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Frame Size</em>' attribute.
	 * @see #getMaxFrameSize()
	 * @generated
	 */
	void setMaxFrameSize(Long value);

	/**
	 * Returns the value of the '<em><b>Supported COS</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The Fibre Channel Classes of Service that are supported by the Adapter, on its Ports. The currently negotiated COS for a connection is a property (NegotiatedCOS) on the FibrePort ActiveLogin association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported COS</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_SupportedCOS()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_FCPort.SupportedCOS\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Unknown\",\"1\",\"2\",\"3\",\"4\",\"6\",\"F\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedCOS();

	/**
	 * Returns the value of the '<em><b>FC4 Types Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: An array of integers that indicates the Fibre Channel FC-4 protocols that are supported by the Adapter. The protocols that are active and running are indicated in the CurrentFC4Types property. The values that are used in this array are taken from the FC-GS2 (bit-mapped) field defined in Table 11 of the standard. Also, FC-SB-2 codes are included from the T11 document, 236V0. If the FC4 Type is "Vendor Unique" (value=255), then the specific vendor values (in the range, 0xE0 to 0xFF) should be listed in the FC4VendorUniqueTypes property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FC4 Types Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_FC4TypesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_FCPort.SupportedFC4Types\"]' ValueMap='[\"0\",\"1\",\"4\",\"5\",\"8\",\"9\",\"17\",\"18\",\"19\",\"21\",\"22\",\"23\",\"25\",\"26\",\"27\",\"28\",\"32\",\"34\",\"36\",\"64\",\"80\",\"81\",\"82\",\"88\",\"96\",\"255\"]' Values='[\"Unknown\",\"Other\",\"ISO/IEC 8802 - 2 LLC\",\"IP over FC\",\"SCSI - FCP\",\"SCSI - GPP\",\"IPI - 3 Master\",\"IPI - 3 Slave\",\"IPI - 3 Peer\",\"CP IPI - 3 Master\",\"CP IPI - 3 Slave\",\"CP IPI - 3 Peer\",\"SBCCS Channel\",\"SBCCS Control Unit\",\"FC-SB-2 Channel\",\"FC-SB-2 Control Unit\",\"Fibre Channel Services (FC-GS, FC-GS-2, FC-GS-3)\",\"FC-SW\",\"FC - SNMP\",\"HIPPI - FP\",\"BBL Control\",\"BBL FDDI Encapsulated LAN PDU\",\"BBL 802.3 Encapsulated LAN PDU\",\"FC - VI\",\"FC - AV\",\"Vendor Unique\"]' ModelCorrespondence='[\"CIM_FibreChannelAdapter.FC4VendorUniqueTypes\"]'"
	 * @generated
	 */
	EList<Integer> getFC4TypesSupported();

	/**
	 * Returns the value of the '<em><b>FC4 Vendor Unique Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: When the FC4TypesSupported array contains the value 255 ("Vendor Unique"), then the property, FC4Vendor UniqueTypes, lists of all the vendor-specific protocols that are supported by the Adapter. These values are in the range 0xE0 to 0xFF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FC4 Vendor Unique Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_FC4VendorUniqueTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_FCPort.SupportedFC4Types\"]' MinValue='240' MaxValue='255'"
	 * @generated
	 */
	EList<Integer> getFC4VendorUniqueTypes();

	/**
	 * Returns the value of the '<em><b>Current FC4 Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: An array of integers that indicate the Fibre Channel FC-4 protocols that are currently running on the Adapter. A list of all protocols that are supported by the Adapter is indicated in the FC4TypesSupported property. The values used in this array are taken from the FC-GS2 (bit-mapped) field that is defined in Table 11 of the standard. Also, FC-SB-2 codesare included from the T11 document, 236V0. If the FC4 Type is "Vendor Unique" (value=255), then the specific vendor values (in the range 0xE0 to 0xFF) that are currently running should be listed in the CurrentFC4VendorTypes property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current FC4 Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_CurrentFC4Types()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_FCPort.ActiveFC4Types\"]' ValueMap='[\"0\",\"1\",\"4\",\"5\",\"8\",\"9\",\"17\",\"18\",\"19\",\"21\",\"22\",\"23\",\"25\",\"26\",\"27\",\"28\",\"32\",\"34\",\"36\",\"64\",\"80\",\"81\",\"82\",\"88\",\"96\",\"255\"]' Values='[\"Unknown\",\"Other\",\"ISO/IEC 8802 - 2 LLC\",\"IP over FC\",\"SCSI - FCP\",\"SCSI - GPP\",\"IPI - 3 Master\",\"IPI - 3 Slave\",\"IPI - 3 Peer\",\"CP IPI - 3 Master\",\"CP IPI - 3 Slave\",\"CP IPI - 3 Peer\",\"SBCCS Channel\",\"SBCCS Control Unit\",\"FC-SB-2 Channel\",\"FC-SB-2 Control Unit\",\"Fibre Channel Services (FC-GS, FC-GS-2, FC-GS-3)\",\"FC-SW\",\"FC - SNMP\",\"HIPPI - FP\",\"BBL Control\",\"BBL FDDI Encapsulated LAN PDU\",\"BBL 802.3 Encapsulated LAN PDU\",\"FC - VI\",\"FC - AV\",\"Vendor Unique\"]' ModelCorrespondence='[\"CIM_FibreChannelAdapter.FC4TypesSupported\",\"CIM_FibreChannelAdapter.CurrentFC4VendorTypes\"]'"
	 * @generated
	 */
	EList<Integer> getCurrentFC4Types();

	/**
	 * Returns the value of the '<em><b>Current FC4 Vendor Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: When the CurrentFC4Types array contains the value 255 ("Vendor Unique"), then the property, CurrentFC4 VendorTypes, lists all the vendor-specific protocols running on the Adapter. These values are in the range 0xE0 to 0xFF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current FC4 Vendor Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_CurrentFC4VendorTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"CIM_FCPort.ActiveFC4Types\"]' MinValue='240' MaxValue='255' ModelCorrespondence='[\"CIM_FibreChannelAdapter.FC4VendorUniqueTypes\"]'"
	 * @generated
	 */
	EList<Integer> getCurrentFC4VendorTypes();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A list of the Capabilities of the Fibre Channel Adapter. For example, the capability that the Adapter utilizes the Directory Server, or that it generates State Change Notifications can be indicated using the values 2 and 12, respectively.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_Capabilities()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Deprecated='[\"No value\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\"]' Values='[\"Unknown\",\"Other\",\"Utilizes the Directory Server\",\"Utilizes the Time Server\",\"Utilizes the Management Server\",\"Utilizes the Alias Server\",\"Utilizes the Security Key Distribution Server\",\"Utilizes the Clock Synchronization Server\",\"Utilizes the Multicast Server\",\"Utilizes QoS Facilitator\",\"Utilizes Broadcast Services\",\"Supports Fabric Login Server\",\"Generates State Change Notifications\",\"Registers for State Change Notifications\",\"Responds to Read Connection Status\",\"Supports Third Party Process Logout\"]' ArrayType='Indexed'"
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
	 * Deprecated description: An array of free-form strings that provide more detailed explanations for any of the Adapter features that are indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_CapabilityDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Deprecated='[\"No value\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_FibreChannelAdapter.Capabilities\"]'"
	 * @generated
	 */
	EList<String> getCapabilityDescriptions();

	/**
	 * Returns the value of the '<em><b>Receive Buffer Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of times that a frame was received but no buffer was available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive Buffer Errors</em>' attribute.
	 * @see #setReceiveBufferErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_ReceiveBufferErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.ErrorFrames\"]' Counter='true'"
	 * @generated
	 */
	Long getReceiveBufferErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getReceiveBufferErrors <em>Receive Buffer Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Buffer Errors</em>' attribute.
	 * @see #getReceiveBufferErrors()
	 * @generated
	 */
	void setReceiveBufferErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Receive End Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: The number of times that a frame was received but no end-to-end credit was available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receive End Errors</em>' attribute.
	 * @see #setReceiveEndErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_ReceiveEndErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.ErrorFrames\"]' Counter='true'"
	 * @generated
	 */
	Long getReceiveEndErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getReceiveEndErrors <em>Receive End Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive End Errors</em>' attribute.
	 * @see #getReceiveEndErrors()
	 * @generated
	 */
	void setReceiveEndErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Resource Allocation Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A 'long' timeout value (in milliseconds) for determining when to reinstate a Recovery_Qualifier. The default value is 120 seconds (120000 milliseconds). The value is typically set to the ErrorDetectTimeout value + 2*(fabric delay time).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Allocation Timeout</em>' attribute.
	 * @see #setResourceAllocationTimeout(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_ResourceAllocationTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Units='MilliSeconds' PUnit='second * 10^-3'"
	 * @generated
	 */
	Long getResourceAllocationTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getResourceAllocationTimeout <em>Resource Allocation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Allocation Timeout</em>' attribute.
	 * @see #getResourceAllocationTimeout()
	 * @generated
	 */
	void setResourceAllocationTimeout(Long value);

	/**
	 * Returns the value of the '<em><b>Error Detect Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: A 'short' timeout value (in milliseconds) for determining that an error has occurred. The default value is 10 seconds (10000 milliseconds).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Detect Timeout</em>' attribute.
	 * @see #setErrorDetectTimeout(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_ErrorDetectTimeout()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Units='MilliSeconds' PUnit='second * 10^-3'"
	 * @generated
	 */
	Long getErrorDetectTimeout();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getErrorDetectTimeout <em>Error Detect Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Detect Timeout</em>' attribute.
	 * @see #getErrorDetectTimeout()
	 * @generated
	 */
	void setErrorDetectTimeout(Long value);

	/**
	 * Returns the value of the '<em><b>Class1 Sequences Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of Class 1 sequences sent since the last reset of the Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class1 Sequences Sent</em>' attribute.
	 * @see #setClass1SequencesSent(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_Class1SequencesSent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getClass1SequencesSent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass1SequencesSent <em>Class1 Sequences Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class1 Sequences Sent</em>' attribute.
	 * @see #getClass1SequencesSent()
	 * @generated
	 */
	void setClass1SequencesSent(Long value);

	/**
	 * Returns the value of the '<em><b>Class2 Sequences Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of Class 2 sequences sent since the last reset of the Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class2 Sequences Sent</em>' attribute.
	 * @see #setClass2SequencesSent(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_Class2SequencesSent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getClass2SequencesSent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass2SequencesSent <em>Class2 Sequences Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class2 Sequences Sent</em>' attribute.
	 * @see #getClass2SequencesSent()
	 * @generated
	 */
	void setClass2SequencesSent(Long value);

	/**
	 * Returns the value of the '<em><b>Class3 Sequences Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of Class 3 sequences sent since the last reset of the Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class3 Sequences Sent</em>' attribute.
	 * @see #setClass3SequencesSent(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_Class3SequencesSent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getClass3SequencesSent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass3SequencesSent <em>Class3 Sequences Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class3 Sequences Sent</em>' attribute.
	 * @see #getClass3SequencesSent()
	 * @generated
	 */
	void setClass3SequencesSent(Long value);

	/**
	 * Returns the value of the '<em><b>Class4 Sequences Sent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of Class 4 sequences sent since the last reset of the Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class4 Sequences Sent</em>' attribute.
	 * @see #setClass4SequencesSent(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_Class4SequencesSent()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getClass4SequencesSent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass4SequencesSent <em>Class4 Sequences Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class4 Sequences Sent</em>' attribute.
	 * @see #getClass4SequencesSent()
	 * @generated
	 */
	void setClass4SequencesSent(Long value);

	/**
	 * Returns the value of the '<em><b>Class2 Octets Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of octets received by the Adapter when running Class 2 service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class2 Octets Received</em>' attribute.
	 * @see #setClass2OctetsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_Class2OctetsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.BytesReceived\"]' Counter='true'"
	 * @generated
	 */
	Long getClass2OctetsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass2OctetsReceived <em>Class2 Octets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class2 Octets Received</em>' attribute.
	 * @see #getClass2OctetsReceived()
	 * @generated
	 */
	void setClass2OctetsReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Class2 Octets Transmitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of octets that are transmitted by the Adapter when running Class 2 service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class2 Octets Transmitted</em>' attribute.
	 * @see #setClass2OctetsTransmitted(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_Class2OctetsTransmitted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.BytesTransmitted\"]' Counter='true'"
	 * @generated
	 */
	Long getClass2OctetsTransmitted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass2OctetsTransmitted <em>Class2 Octets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class2 Octets Transmitted</em>' attribute.
	 * @see #getClass2OctetsTransmitted()
	 * @generated
	 */
	void setClass2OctetsTransmitted(Long value);

	/**
	 * Returns the value of the '<em><b>Class2 Frames Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of frames that were received by the Adapter when running Class 2 service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class2 Frames Received</em>' attribute.
	 * @see #setClass2FramesReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_Class2FramesReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.PacketsReceived\"]' Counter='true'"
	 * @generated
	 */
	Long getClass2FramesReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass2FramesReceived <em>Class2 Frames Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class2 Frames Received</em>' attribute.
	 * @see #getClass2FramesReceived()
	 * @generated
	 */
	void setClass2FramesReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Class2 Frames Transmitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of frames that were transmitted by the Adapter when running Class 2 service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class2 Frames Transmitted</em>' attribute.
	 * @see #setClass2FramesTransmitted(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_Class2FramesTransmitted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.PacketsTransmitted\"]' Counter='true'"
	 * @generated
	 */
	Long getClass2FramesTransmitted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass2FramesTransmitted <em>Class2 Frames Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class2 Frames Transmitted</em>' attribute.
	 * @see #getClass2FramesTransmitted()
	 * @generated
	 */
	void setClass2FramesTransmitted(Long value);

	/**
	 * Returns the value of the '<em><b>Class2 Discard Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of frames that were discarded by the Adapter when running Class 2 service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class2 Discard Frames</em>' attribute.
	 * @see #setClass2DiscardFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_Class2DiscardFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getClass2DiscardFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass2DiscardFrames <em>Class2 Discard Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class2 Discard Frames</em>' attribute.
	 * @see #getClass2DiscardFrames()
	 * @generated
	 */
	void setClass2DiscardFrames(Long value);

	/**
	 * Returns the value of the '<em><b>Class3 Octets Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of octets that were received by the Adapter when running Class 3 service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class3 Octets Received</em>' attribute.
	 * @see #setClass3OctetsReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_Class3OctetsReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.BytesReceived\"]' Counter='true'"
	 * @generated
	 */
	Long getClass3OctetsReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass3OctetsReceived <em>Class3 Octets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class3 Octets Received</em>' attribute.
	 * @see #getClass3OctetsReceived()
	 * @generated
	 */
	void setClass3OctetsReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Class3 Octets Transmitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of octets that were transmitted by the Adapter when running Class 3 service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class3 Octets Transmitted</em>' attribute.
	 * @see #setClass3OctetsTransmitted(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_Class3OctetsTransmitted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.BytesTransmitted\"]' Counter='true'"
	 * @generated
	 */
	Long getClass3OctetsTransmitted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass3OctetsTransmitted <em>Class3 Octets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class3 Octets Transmitted</em>' attribute.
	 * @see #getClass3OctetsTransmitted()
	 * @generated
	 */
	void setClass3OctetsTransmitted(Long value);

	/**
	 * Returns the value of the '<em><b>Class3 Frames Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of frames that were received by the Adapter when running Class 3 service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class3 Frames Received</em>' attribute.
	 * @see #setClass3FramesReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_Class3FramesReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.PacketsReceived\"]' Counter='true'"
	 * @generated
	 */
	Long getClass3FramesReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass3FramesReceived <em>Class3 Frames Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class3 Frames Received</em>' attribute.
	 * @see #getClass3FramesReceived()
	 * @generated
	 */
	void setClass3FramesReceived(Long value);

	/**
	 * Returns the value of the '<em><b>Class3 Frames Transmitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of frames that were transmitted by the Adapter when running Class 3 service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class3 Frames Transmitted</em>' attribute.
	 * @see #setClass3FramesTransmitted(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_Class3FramesTransmitted()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.PacketsTransmitted\"]' Counter='true'"
	 * @generated
	 */
	Long getClass3FramesTransmitted();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass3FramesTransmitted <em>Class3 Frames Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class3 Frames Transmitted</em>' attribute.
	 * @see #getClass3FramesTransmitted()
	 * @generated
	 */
	void setClass3FramesTransmitted(Long value);

	/**
	 * Returns the value of the '<em><b>Class3 Discard Frames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of frames that were discarded by the Adapter when running Class 3 service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class3 Discard Frames</em>' attribute.
	 * @see #setClass3DiscardFrames(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_Class3DiscardFrames()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"No value\"]' Counter='true'"
	 * @generated
	 */
	Long getClass3DiscardFrames();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getClass3DiscardFrames <em>Class3 Discard Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class3 Discard Frames</em>' attribute.
	 * @see #getClass3DiscardFrames()
	 * @generated
	 */
	void setClass3DiscardFrames(Long value);

	/**
	 * Returns the value of the '<em><b>Parity Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of parity errors that were detected somewhere in the data path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parity Errors</em>' attribute.
	 * @see #setParityErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_ParityErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.ErrorFrames\"]' Counter='true'"
	 * @generated
	 */
	Long getParityErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getParityErrors <em>Parity Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parity Errors</em>' attribute.
	 * @see #getParityErrors()
	 * @generated
	 */
	void setParityErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Frame Timeouts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of Class 1 or 2 frames that are not ACKed within the time indicated by ErrorDetectTimeout.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frame Timeouts</em>' attribute.
	 * @see #setFrameTimeouts(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_FrameTimeouts()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.ErrorFrames\"]' Counter='true'"
	 * @generated
	 */
	Long getFrameTimeouts();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getFrameTimeouts <em>Frame Timeouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Timeouts</em>' attribute.
	 * @see #getFrameTimeouts()
	 * @generated
	 */
	void setFrameTimeouts(Long value);

	/**
	 * Returns the value of the '<em><b>Buffer Credit Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of times that the Device has been without a buffer credit for a time longer than ErrorDetectTimeout.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffer Credit Errors</em>' attribute.
	 * @see #setBufferCreditErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_BufferCreditErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.BufferCreditNotProvided\"]' Counter='true'"
	 * @generated
	 */
	Long getBufferCreditErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getBufferCreditErrors <em>Buffer Credit Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer Credit Errors</em>' attribute.
	 * @see #getBufferCreditErrors()
	 * @generated
	 */
	void setBufferCreditErrors(Long value);

	/**
	 * Returns the value of the '<em><b>End Credit Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of times that the Device has been without an end credit for a time longer than ErrorDetectTimeout.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Credit Errors</em>' attribute.
	 * @see #setEndCreditErrors(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_EndCreditErrors()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.BufferCreditNotReceived\"]' Counter='true'"
	 * @generated
	 */
	Long getEndCreditErrors();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getEndCreditErrors <em>End Credit Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Credit Errors</em>' attribute.
	 * @see #getEndCreditErrors()
	 * @generated
	 */
	void setEndCreditErrors(Long value);

	/**
	 * Returns the value of the '<em><b>Out Of Order Frames Received</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The use of this method has been deprecated. 
	 * Deprecated description: Number of frames that were received out of order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out Of Order Frames Received</em>' attribute.
	 * @see #setOutOfOrderFramesReceived(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_FibreChannelAdapter_OutOfOrderFramesReceived()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Deprecated='[\"CIM_FCPortStatistics.DelimiterErrors\"]' Counter='true'"
	 * @generated
	 */
	Long getOutOfOrderFramesReceived();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FibreChannelAdapter#getOutOfOrderFramesReceived <em>Out Of Order Frames Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Of Order Frames Received</em>' attribute.
	 * @see #getOutOfOrderFramesReceived()
	 * @generated
	 */
	void setOutOfOrderFramesReceived(Long value);

} // CIM_FibreChannelAdapter

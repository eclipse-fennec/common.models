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

import java.util.Collection;

import org.dmtf.cim.CIM_FibreChannelAdapter;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Fibre Channel Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getMaxFrameSize <em>Max Frame Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getSupportedCOS <em>Supported COS</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getFC4TypesSupported <em>FC4 Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getFC4VendorUniqueTypes <em>FC4 Vendor Unique Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getCurrentFC4Types <em>Current FC4 Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getCurrentFC4VendorTypes <em>Current FC4 Vendor Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getReceiveBufferErrors <em>Receive Buffer Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getReceiveEndErrors <em>Receive End Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getResourceAllocationTimeout <em>Resource Allocation Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getErrorDetectTimeout <em>Error Detect Timeout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getClass1SequencesSent <em>Class1 Sequences Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getClass2SequencesSent <em>Class2 Sequences Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getClass3SequencesSent <em>Class3 Sequences Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getClass4SequencesSent <em>Class4 Sequences Sent</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getClass2OctetsReceived <em>Class2 Octets Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getClass2OctetsTransmitted <em>Class2 Octets Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getClass2FramesReceived <em>Class2 Frames Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getClass2FramesTransmitted <em>Class2 Frames Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getClass2DiscardFrames <em>Class2 Discard Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getClass3OctetsReceived <em>Class3 Octets Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getClass3OctetsTransmitted <em>Class3 Octets Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getClass3FramesReceived <em>Class3 Frames Received</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getClass3FramesTransmitted <em>Class3 Frames Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getClass3DiscardFrames <em>Class3 Discard Frames</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getParityErrors <em>Parity Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getFrameTimeouts <em>Frame Timeouts</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getBufferCreditErrors <em>Buffer Credit Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getEndCreditErrors <em>End Credit Errors</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FibreChannelAdapterImpl#getOutOfOrderFramesReceived <em>Out Of Order Frames Received</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FibreChannelAdapterImpl extends CIM_NetworkAdapterImpl implements CIM_FibreChannelAdapter {
	/**
	 * The default value of the '{@link #getMaxFrameSize() <em>Max Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFrameSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_FRAME_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxFrameSize() <em>Max Frame Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFrameSize()
	 * @generated
	 * @ordered
	 */
	protected Long maxFrameSize = MAX_FRAME_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedCOS() <em>Supported COS</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedCOS()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedCOS;

	/**
	 * The cached value of the '{@link #getFC4TypesSupported() <em>FC4 Types Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFC4TypesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> fc4TypesSupported;

	/**
	 * The cached value of the '{@link #getFC4VendorUniqueTypes() <em>FC4 Vendor Unique Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFC4VendorUniqueTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> fc4VendorUniqueTypes;

	/**
	 * The cached value of the '{@link #getCurrentFC4Types() <em>Current FC4 Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentFC4Types()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> currentFC4Types;

	/**
	 * The cached value of the '{@link #getCurrentFC4VendorTypes() <em>Current FC4 Vendor Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentFC4VendorTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> currentFC4VendorTypes;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> capabilities;

	/**
	 * The cached value of the '{@link #getCapabilityDescriptions() <em>Capability Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> capabilityDescriptions;

	/**
	 * The default value of the '{@link #getReceiveBufferErrors() <em>Receive Buffer Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveBufferErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECEIVE_BUFFER_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveBufferErrors() <em>Receive Buffer Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveBufferErrors()
	 * @generated
	 * @ordered
	 */
	protected Long receiveBufferErrors = RECEIVE_BUFFER_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiveEndErrors() <em>Receive End Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveEndErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECEIVE_END_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveEndErrors() <em>Receive End Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveEndErrors()
	 * @generated
	 * @ordered
	 */
	protected Long receiveEndErrors = RECEIVE_END_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceAllocationTimeout() <em>Resource Allocation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAllocationTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final Long RESOURCE_ALLOCATION_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceAllocationTimeout() <em>Resource Allocation Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAllocationTimeout()
	 * @generated
	 * @ordered
	 */
	protected Long resourceAllocationTimeout = RESOURCE_ALLOCATION_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorDetectTimeout() <em>Error Detect Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDetectTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final Long ERROR_DETECT_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorDetectTimeout() <em>Error Detect Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDetectTimeout()
	 * @generated
	 * @ordered
	 */
	protected Long errorDetectTimeout = ERROR_DETECT_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass1SequencesSent() <em>Class1 Sequences Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass1SequencesSent()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS1_SEQUENCES_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass1SequencesSent() <em>Class1 Sequences Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass1SequencesSent()
	 * @generated
	 * @ordered
	 */
	protected Long class1SequencesSent = CLASS1_SEQUENCES_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass2SequencesSent() <em>Class2 Sequences Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2SequencesSent()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS2_SEQUENCES_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass2SequencesSent() <em>Class2 Sequences Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2SequencesSent()
	 * @generated
	 * @ordered
	 */
	protected Long class2SequencesSent = CLASS2_SEQUENCES_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass3SequencesSent() <em>Class3 Sequences Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass3SequencesSent()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS3_SEQUENCES_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass3SequencesSent() <em>Class3 Sequences Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass3SequencesSent()
	 * @generated
	 * @ordered
	 */
	protected Long class3SequencesSent = CLASS3_SEQUENCES_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass4SequencesSent() <em>Class4 Sequences Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass4SequencesSent()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS4_SEQUENCES_SENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass4SequencesSent() <em>Class4 Sequences Sent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass4SequencesSent()
	 * @generated
	 * @ordered
	 */
	protected Long class4SequencesSent = CLASS4_SEQUENCES_SENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass2OctetsReceived() <em>Class2 Octets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2OctetsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS2_OCTETS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass2OctetsReceived() <em>Class2 Octets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2OctetsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long class2OctetsReceived = CLASS2_OCTETS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass2OctetsTransmitted() <em>Class2 Octets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2OctetsTransmitted()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS2_OCTETS_TRANSMITTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass2OctetsTransmitted() <em>Class2 Octets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2OctetsTransmitted()
	 * @generated
	 * @ordered
	 */
	protected Long class2OctetsTransmitted = CLASS2_OCTETS_TRANSMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass2FramesReceived() <em>Class2 Frames Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2FramesReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS2_FRAMES_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass2FramesReceived() <em>Class2 Frames Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2FramesReceived()
	 * @generated
	 * @ordered
	 */
	protected Long class2FramesReceived = CLASS2_FRAMES_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass2FramesTransmitted() <em>Class2 Frames Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2FramesTransmitted()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS2_FRAMES_TRANSMITTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass2FramesTransmitted() <em>Class2 Frames Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2FramesTransmitted()
	 * @generated
	 * @ordered
	 */
	protected Long class2FramesTransmitted = CLASS2_FRAMES_TRANSMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass2DiscardFrames() <em>Class2 Discard Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2DiscardFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS2_DISCARD_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass2DiscardFrames() <em>Class2 Discard Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2DiscardFrames()
	 * @generated
	 * @ordered
	 */
	protected Long class2DiscardFrames = CLASS2_DISCARD_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass3OctetsReceived() <em>Class3 Octets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass3OctetsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS3_OCTETS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass3OctetsReceived() <em>Class3 Octets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass3OctetsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long class3OctetsReceived = CLASS3_OCTETS_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass3OctetsTransmitted() <em>Class3 Octets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass3OctetsTransmitted()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS3_OCTETS_TRANSMITTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass3OctetsTransmitted() <em>Class3 Octets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass3OctetsTransmitted()
	 * @generated
	 * @ordered
	 */
	protected Long class3OctetsTransmitted = CLASS3_OCTETS_TRANSMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass3FramesReceived() <em>Class3 Frames Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass3FramesReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS3_FRAMES_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass3FramesReceived() <em>Class3 Frames Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass3FramesReceived()
	 * @generated
	 * @ordered
	 */
	protected Long class3FramesReceived = CLASS3_FRAMES_RECEIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass3FramesTransmitted() <em>Class3 Frames Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass3FramesTransmitted()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS3_FRAMES_TRANSMITTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass3FramesTransmitted() <em>Class3 Frames Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass3FramesTransmitted()
	 * @generated
	 * @ordered
	 */
	protected Long class3FramesTransmitted = CLASS3_FRAMES_TRANSMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass3DiscardFrames() <em>Class3 Discard Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass3DiscardFrames()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLASS3_DISCARD_FRAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass3DiscardFrames() <em>Class3 Discard Frames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass3DiscardFrames()
	 * @generated
	 * @ordered
	 */
	protected Long class3DiscardFrames = CLASS3_DISCARD_FRAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getParityErrors() <em>Parity Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParityErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long PARITY_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParityErrors() <em>Parity Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParityErrors()
	 * @generated
	 * @ordered
	 */
	protected Long parityErrors = PARITY_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrameTimeouts() <em>Frame Timeouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameTimeouts()
	 * @generated
	 * @ordered
	 */
	protected static final Long FRAME_TIMEOUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrameTimeouts() <em>Frame Timeouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameTimeouts()
	 * @generated
	 * @ordered
	 */
	protected Long frameTimeouts = FRAME_TIMEOUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBufferCreditErrors() <em>Buffer Credit Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferCreditErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long BUFFER_CREDIT_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBufferCreditErrors() <em>Buffer Credit Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferCreditErrors()
	 * @generated
	 * @ordered
	 */
	protected Long bufferCreditErrors = BUFFER_CREDIT_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndCreditErrors() <em>End Credit Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCreditErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Long END_CREDIT_ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndCreditErrors() <em>End Credit Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCreditErrors()
	 * @generated
	 * @ordered
	 */
	protected Long endCreditErrors = END_CREDIT_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutOfOrderFramesReceived() <em>Out Of Order Frames Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutOfOrderFramesReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long OUT_OF_ORDER_FRAMES_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutOfOrderFramesReceived() <em>Out Of Order Frames Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutOfOrderFramesReceived()
	 * @generated
	 * @ordered
	 */
	protected Long outOfOrderFramesReceived = OUT_OF_ORDER_FRAMES_RECEIVED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FibreChannelAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FibreChannelAdapter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxFrameSize() {
		return maxFrameSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxFrameSize(Long newMaxFrameSize) {
		Long oldMaxFrameSize = maxFrameSize;
		maxFrameSize = newMaxFrameSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__MAX_FRAME_SIZE, oldMaxFrameSize, maxFrameSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedCOS() {
		if (supportedCOS == null) {
			supportedCOS = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__SUPPORTED_COS);
		}
		return supportedCOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getFC4TypesSupported() {
		if (fc4TypesSupported == null) {
			fc4TypesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__FC4_TYPES_SUPPORTED);
		}
		return fc4TypesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getFC4VendorUniqueTypes() {
		if (fc4VendorUniqueTypes == null) {
			fc4VendorUniqueTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__FC4_VENDOR_UNIQUE_TYPES);
		}
		return fc4VendorUniqueTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCurrentFC4Types() {
		if (currentFC4Types == null) {
			currentFC4Types = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CURRENT_FC4_TYPES);
		}
		return currentFC4Types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCurrentFC4VendorTypes() {
		if (currentFC4VendorTypes == null) {
			currentFC4VendorTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CURRENT_FC4_VENDOR_TYPES);
		}
		return currentFC4VendorTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CAPABILITIES);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCapabilityDescriptions() {
		if (capabilityDescriptions == null) {
			capabilityDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CAPABILITY_DESCRIPTIONS);
		}
		return capabilityDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReceiveBufferErrors() {
		return receiveBufferErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiveBufferErrors(Long newReceiveBufferErrors) {
		Long oldReceiveBufferErrors = receiveBufferErrors;
		receiveBufferErrors = newReceiveBufferErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__RECEIVE_BUFFER_ERRORS, oldReceiveBufferErrors, receiveBufferErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReceiveEndErrors() {
		return receiveEndErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiveEndErrors(Long newReceiveEndErrors) {
		Long oldReceiveEndErrors = receiveEndErrors;
		receiveEndErrors = newReceiveEndErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__RECEIVE_END_ERRORS, oldReceiveEndErrors, receiveEndErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getResourceAllocationTimeout() {
		return resourceAllocationTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceAllocationTimeout(Long newResourceAllocationTimeout) {
		Long oldResourceAllocationTimeout = resourceAllocationTimeout;
		resourceAllocationTimeout = newResourceAllocationTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__RESOURCE_ALLOCATION_TIMEOUT, oldResourceAllocationTimeout, resourceAllocationTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getErrorDetectTimeout() {
		return errorDetectTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorDetectTimeout(Long newErrorDetectTimeout) {
		Long oldErrorDetectTimeout = errorDetectTimeout;
		errorDetectTimeout = newErrorDetectTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__ERROR_DETECT_TIMEOUT, oldErrorDetectTimeout, errorDetectTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass1SequencesSent() {
		return class1SequencesSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass1SequencesSent(Long newClass1SequencesSent) {
		Long oldClass1SequencesSent = class1SequencesSent;
		class1SequencesSent = newClass1SequencesSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS1_SEQUENCES_SENT, oldClass1SequencesSent, class1SequencesSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass2SequencesSent() {
		return class2SequencesSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass2SequencesSent(Long newClass2SequencesSent) {
		Long oldClass2SequencesSent = class2SequencesSent;
		class2SequencesSent = newClass2SequencesSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_SEQUENCES_SENT, oldClass2SequencesSent, class2SequencesSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass3SequencesSent() {
		return class3SequencesSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass3SequencesSent(Long newClass3SequencesSent) {
		Long oldClass3SequencesSent = class3SequencesSent;
		class3SequencesSent = newClass3SequencesSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_SEQUENCES_SENT, oldClass3SequencesSent, class3SequencesSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass4SequencesSent() {
		return class4SequencesSent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass4SequencesSent(Long newClass4SequencesSent) {
		Long oldClass4SequencesSent = class4SequencesSent;
		class4SequencesSent = newClass4SequencesSent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS4_SEQUENCES_SENT, oldClass4SequencesSent, class4SequencesSent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass2OctetsReceived() {
		return class2OctetsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass2OctetsReceived(Long newClass2OctetsReceived) {
		Long oldClass2OctetsReceived = class2OctetsReceived;
		class2OctetsReceived = newClass2OctetsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_OCTETS_RECEIVED, oldClass2OctetsReceived, class2OctetsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass2OctetsTransmitted() {
		return class2OctetsTransmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass2OctetsTransmitted(Long newClass2OctetsTransmitted) {
		Long oldClass2OctetsTransmitted = class2OctetsTransmitted;
		class2OctetsTransmitted = newClass2OctetsTransmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_OCTETS_TRANSMITTED, oldClass2OctetsTransmitted, class2OctetsTransmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass2FramesReceived() {
		return class2FramesReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass2FramesReceived(Long newClass2FramesReceived) {
		Long oldClass2FramesReceived = class2FramesReceived;
		class2FramesReceived = newClass2FramesReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_FRAMES_RECEIVED, oldClass2FramesReceived, class2FramesReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass2FramesTransmitted() {
		return class2FramesTransmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass2FramesTransmitted(Long newClass2FramesTransmitted) {
		Long oldClass2FramesTransmitted = class2FramesTransmitted;
		class2FramesTransmitted = newClass2FramesTransmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_FRAMES_TRANSMITTED, oldClass2FramesTransmitted, class2FramesTransmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass2DiscardFrames() {
		return class2DiscardFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass2DiscardFrames(Long newClass2DiscardFrames) {
		Long oldClass2DiscardFrames = class2DiscardFrames;
		class2DiscardFrames = newClass2DiscardFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_DISCARD_FRAMES, oldClass2DiscardFrames, class2DiscardFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass3OctetsReceived() {
		return class3OctetsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass3OctetsReceived(Long newClass3OctetsReceived) {
		Long oldClass3OctetsReceived = class3OctetsReceived;
		class3OctetsReceived = newClass3OctetsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_OCTETS_RECEIVED, oldClass3OctetsReceived, class3OctetsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass3OctetsTransmitted() {
		return class3OctetsTransmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass3OctetsTransmitted(Long newClass3OctetsTransmitted) {
		Long oldClass3OctetsTransmitted = class3OctetsTransmitted;
		class3OctetsTransmitted = newClass3OctetsTransmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_OCTETS_TRANSMITTED, oldClass3OctetsTransmitted, class3OctetsTransmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass3FramesReceived() {
		return class3FramesReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass3FramesReceived(Long newClass3FramesReceived) {
		Long oldClass3FramesReceived = class3FramesReceived;
		class3FramesReceived = newClass3FramesReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_FRAMES_RECEIVED, oldClass3FramesReceived, class3FramesReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass3FramesTransmitted() {
		return class3FramesTransmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass3FramesTransmitted(Long newClass3FramesTransmitted) {
		Long oldClass3FramesTransmitted = class3FramesTransmitted;
		class3FramesTransmitted = newClass3FramesTransmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_FRAMES_TRANSMITTED, oldClass3FramesTransmitted, class3FramesTransmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getClass3DiscardFrames() {
		return class3DiscardFrames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass3DiscardFrames(Long newClass3DiscardFrames) {
		Long oldClass3DiscardFrames = class3DiscardFrames;
		class3DiscardFrames = newClass3DiscardFrames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_DISCARD_FRAMES, oldClass3DiscardFrames, class3DiscardFrames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getParityErrors() {
		return parityErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParityErrors(Long newParityErrors) {
		Long oldParityErrors = parityErrors;
		parityErrors = newParityErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__PARITY_ERRORS, oldParityErrors, parityErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getFrameTimeouts() {
		return frameTimeouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrameTimeouts(Long newFrameTimeouts) {
		Long oldFrameTimeouts = frameTimeouts;
		frameTimeouts = newFrameTimeouts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__FRAME_TIMEOUTS, oldFrameTimeouts, frameTimeouts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBufferCreditErrors() {
		return bufferCreditErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBufferCreditErrors(Long newBufferCreditErrors) {
		Long oldBufferCreditErrors = bufferCreditErrors;
		bufferCreditErrors = newBufferCreditErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__BUFFER_CREDIT_ERRORS, oldBufferCreditErrors, bufferCreditErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getEndCreditErrors() {
		return endCreditErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndCreditErrors(Long newEndCreditErrors) {
		Long oldEndCreditErrors = endCreditErrors;
		endCreditErrors = newEndCreditErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__END_CREDIT_ERRORS, oldEndCreditErrors, endCreditErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getOutOfOrderFramesReceived() {
		return outOfOrderFramesReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutOfOrderFramesReceived(Long newOutOfOrderFramesReceived) {
		Long oldOutOfOrderFramesReceived = outOfOrderFramesReceived;
		outOfOrderFramesReceived = newOutOfOrderFramesReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__OUT_OF_ORDER_FRAMES_RECEIVED, oldOutOfOrderFramesReceived, outOfOrderFramesReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__MAX_FRAME_SIZE:
				return getMaxFrameSize();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__SUPPORTED_COS:
				return getSupportedCOS();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__FC4_TYPES_SUPPORTED:
				return getFC4TypesSupported();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__FC4_VENDOR_UNIQUE_TYPES:
				return getFC4VendorUniqueTypes();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CURRENT_FC4_TYPES:
				return getCurrentFC4Types();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CURRENT_FC4_VENDOR_TYPES:
				return getCurrentFC4VendorTypes();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CAPABILITIES:
				return getCapabilities();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CAPABILITY_DESCRIPTIONS:
				return getCapabilityDescriptions();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__RECEIVE_BUFFER_ERRORS:
				return getReceiveBufferErrors();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__RECEIVE_END_ERRORS:
				return getReceiveEndErrors();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__RESOURCE_ALLOCATION_TIMEOUT:
				return getResourceAllocationTimeout();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__ERROR_DETECT_TIMEOUT:
				return getErrorDetectTimeout();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS1_SEQUENCES_SENT:
				return getClass1SequencesSent();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_SEQUENCES_SENT:
				return getClass2SequencesSent();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_SEQUENCES_SENT:
				return getClass3SequencesSent();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS4_SEQUENCES_SENT:
				return getClass4SequencesSent();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_OCTETS_RECEIVED:
				return getClass2OctetsReceived();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_OCTETS_TRANSMITTED:
				return getClass2OctetsTransmitted();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_FRAMES_RECEIVED:
				return getClass2FramesReceived();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_FRAMES_TRANSMITTED:
				return getClass2FramesTransmitted();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_DISCARD_FRAMES:
				return getClass2DiscardFrames();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_OCTETS_RECEIVED:
				return getClass3OctetsReceived();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_OCTETS_TRANSMITTED:
				return getClass3OctetsTransmitted();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_FRAMES_RECEIVED:
				return getClass3FramesReceived();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_FRAMES_TRANSMITTED:
				return getClass3FramesTransmitted();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_DISCARD_FRAMES:
				return getClass3DiscardFrames();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__PARITY_ERRORS:
				return getParityErrors();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__FRAME_TIMEOUTS:
				return getFrameTimeouts();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__BUFFER_CREDIT_ERRORS:
				return getBufferCreditErrors();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__END_CREDIT_ERRORS:
				return getEndCreditErrors();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__OUT_OF_ORDER_FRAMES_RECEIVED:
				return getOutOfOrderFramesReceived();
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
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__MAX_FRAME_SIZE:
				setMaxFrameSize((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__SUPPORTED_COS:
				getSupportedCOS().clear();
				getSupportedCOS().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__FC4_TYPES_SUPPORTED:
				getFC4TypesSupported().clear();
				getFC4TypesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__FC4_VENDOR_UNIQUE_TYPES:
				getFC4VendorUniqueTypes().clear();
				getFC4VendorUniqueTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CURRENT_FC4_TYPES:
				getCurrentFC4Types().clear();
				getCurrentFC4Types().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CURRENT_FC4_VENDOR_TYPES:
				getCurrentFC4VendorTypes().clear();
				getCurrentFC4VendorTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				getCapabilityDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__RECEIVE_BUFFER_ERRORS:
				setReceiveBufferErrors((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__RECEIVE_END_ERRORS:
				setReceiveEndErrors((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__RESOURCE_ALLOCATION_TIMEOUT:
				setResourceAllocationTimeout((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__ERROR_DETECT_TIMEOUT:
				setErrorDetectTimeout((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS1_SEQUENCES_SENT:
				setClass1SequencesSent((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_SEQUENCES_SENT:
				setClass2SequencesSent((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_SEQUENCES_SENT:
				setClass3SequencesSent((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS4_SEQUENCES_SENT:
				setClass4SequencesSent((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_OCTETS_RECEIVED:
				setClass2OctetsReceived((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_OCTETS_TRANSMITTED:
				setClass2OctetsTransmitted((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_FRAMES_RECEIVED:
				setClass2FramesReceived((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_FRAMES_TRANSMITTED:
				setClass2FramesTransmitted((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_DISCARD_FRAMES:
				setClass2DiscardFrames((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_OCTETS_RECEIVED:
				setClass3OctetsReceived((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_OCTETS_TRANSMITTED:
				setClass3OctetsTransmitted((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_FRAMES_RECEIVED:
				setClass3FramesReceived((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_FRAMES_TRANSMITTED:
				setClass3FramesTransmitted((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_DISCARD_FRAMES:
				setClass3DiscardFrames((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__PARITY_ERRORS:
				setParityErrors((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__FRAME_TIMEOUTS:
				setFrameTimeouts((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__BUFFER_CREDIT_ERRORS:
				setBufferCreditErrors((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__END_CREDIT_ERRORS:
				setEndCreditErrors((Long)newValue);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__OUT_OF_ORDER_FRAMES_RECEIVED:
				setOutOfOrderFramesReceived((Long)newValue);
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
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__MAX_FRAME_SIZE:
				setMaxFrameSize(MAX_FRAME_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__SUPPORTED_COS:
				getSupportedCOS().clear();
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__FC4_TYPES_SUPPORTED:
				getFC4TypesSupported().clear();
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__FC4_VENDOR_UNIQUE_TYPES:
				getFC4VendorUniqueTypes().clear();
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CURRENT_FC4_TYPES:
				getCurrentFC4Types().clear();
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CURRENT_FC4_VENDOR_TYPES:
				getCurrentFC4VendorTypes().clear();
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CAPABILITIES:
				getCapabilities().clear();
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__RECEIVE_BUFFER_ERRORS:
				setReceiveBufferErrors(RECEIVE_BUFFER_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__RECEIVE_END_ERRORS:
				setReceiveEndErrors(RECEIVE_END_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__RESOURCE_ALLOCATION_TIMEOUT:
				setResourceAllocationTimeout(RESOURCE_ALLOCATION_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__ERROR_DETECT_TIMEOUT:
				setErrorDetectTimeout(ERROR_DETECT_TIMEOUT_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS1_SEQUENCES_SENT:
				setClass1SequencesSent(CLASS1_SEQUENCES_SENT_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_SEQUENCES_SENT:
				setClass2SequencesSent(CLASS2_SEQUENCES_SENT_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_SEQUENCES_SENT:
				setClass3SequencesSent(CLASS3_SEQUENCES_SENT_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS4_SEQUENCES_SENT:
				setClass4SequencesSent(CLASS4_SEQUENCES_SENT_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_OCTETS_RECEIVED:
				setClass2OctetsReceived(CLASS2_OCTETS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_OCTETS_TRANSMITTED:
				setClass2OctetsTransmitted(CLASS2_OCTETS_TRANSMITTED_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_FRAMES_RECEIVED:
				setClass2FramesReceived(CLASS2_FRAMES_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_FRAMES_TRANSMITTED:
				setClass2FramesTransmitted(CLASS2_FRAMES_TRANSMITTED_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_DISCARD_FRAMES:
				setClass2DiscardFrames(CLASS2_DISCARD_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_OCTETS_RECEIVED:
				setClass3OctetsReceived(CLASS3_OCTETS_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_OCTETS_TRANSMITTED:
				setClass3OctetsTransmitted(CLASS3_OCTETS_TRANSMITTED_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_FRAMES_RECEIVED:
				setClass3FramesReceived(CLASS3_FRAMES_RECEIVED_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_FRAMES_TRANSMITTED:
				setClass3FramesTransmitted(CLASS3_FRAMES_TRANSMITTED_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_DISCARD_FRAMES:
				setClass3DiscardFrames(CLASS3_DISCARD_FRAMES_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__PARITY_ERRORS:
				setParityErrors(PARITY_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__FRAME_TIMEOUTS:
				setFrameTimeouts(FRAME_TIMEOUTS_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__BUFFER_CREDIT_ERRORS:
				setBufferCreditErrors(BUFFER_CREDIT_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__END_CREDIT_ERRORS:
				setEndCreditErrors(END_CREDIT_ERRORS_EDEFAULT);
				return;
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__OUT_OF_ORDER_FRAMES_RECEIVED:
				setOutOfOrderFramesReceived(OUT_OF_ORDER_FRAMES_RECEIVED_EDEFAULT);
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
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__MAX_FRAME_SIZE:
				return MAX_FRAME_SIZE_EDEFAULT == null ? maxFrameSize != null : !MAX_FRAME_SIZE_EDEFAULT.equals(maxFrameSize);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__SUPPORTED_COS:
				return supportedCOS != null && !supportedCOS.isEmpty();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__FC4_TYPES_SUPPORTED:
				return fc4TypesSupported != null && !fc4TypesSupported.isEmpty();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__FC4_VENDOR_UNIQUE_TYPES:
				return fc4VendorUniqueTypes != null && !fc4VendorUniqueTypes.isEmpty();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CURRENT_FC4_TYPES:
				return currentFC4Types != null && !currentFC4Types.isEmpty();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CURRENT_FC4_VENDOR_TYPES:
				return currentFC4VendorTypes != null && !currentFC4VendorTypes.isEmpty();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CAPABILITY_DESCRIPTIONS:
				return capabilityDescriptions != null && !capabilityDescriptions.isEmpty();
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__RECEIVE_BUFFER_ERRORS:
				return RECEIVE_BUFFER_ERRORS_EDEFAULT == null ? receiveBufferErrors != null : !RECEIVE_BUFFER_ERRORS_EDEFAULT.equals(receiveBufferErrors);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__RECEIVE_END_ERRORS:
				return RECEIVE_END_ERRORS_EDEFAULT == null ? receiveEndErrors != null : !RECEIVE_END_ERRORS_EDEFAULT.equals(receiveEndErrors);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__RESOURCE_ALLOCATION_TIMEOUT:
				return RESOURCE_ALLOCATION_TIMEOUT_EDEFAULT == null ? resourceAllocationTimeout != null : !RESOURCE_ALLOCATION_TIMEOUT_EDEFAULT.equals(resourceAllocationTimeout);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__ERROR_DETECT_TIMEOUT:
				return ERROR_DETECT_TIMEOUT_EDEFAULT == null ? errorDetectTimeout != null : !ERROR_DETECT_TIMEOUT_EDEFAULT.equals(errorDetectTimeout);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS1_SEQUENCES_SENT:
				return CLASS1_SEQUENCES_SENT_EDEFAULT == null ? class1SequencesSent != null : !CLASS1_SEQUENCES_SENT_EDEFAULT.equals(class1SequencesSent);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_SEQUENCES_SENT:
				return CLASS2_SEQUENCES_SENT_EDEFAULT == null ? class2SequencesSent != null : !CLASS2_SEQUENCES_SENT_EDEFAULT.equals(class2SequencesSent);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_SEQUENCES_SENT:
				return CLASS3_SEQUENCES_SENT_EDEFAULT == null ? class3SequencesSent != null : !CLASS3_SEQUENCES_SENT_EDEFAULT.equals(class3SequencesSent);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS4_SEQUENCES_SENT:
				return CLASS4_SEQUENCES_SENT_EDEFAULT == null ? class4SequencesSent != null : !CLASS4_SEQUENCES_SENT_EDEFAULT.equals(class4SequencesSent);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_OCTETS_RECEIVED:
				return CLASS2_OCTETS_RECEIVED_EDEFAULT == null ? class2OctetsReceived != null : !CLASS2_OCTETS_RECEIVED_EDEFAULT.equals(class2OctetsReceived);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_OCTETS_TRANSMITTED:
				return CLASS2_OCTETS_TRANSMITTED_EDEFAULT == null ? class2OctetsTransmitted != null : !CLASS2_OCTETS_TRANSMITTED_EDEFAULT.equals(class2OctetsTransmitted);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_FRAMES_RECEIVED:
				return CLASS2_FRAMES_RECEIVED_EDEFAULT == null ? class2FramesReceived != null : !CLASS2_FRAMES_RECEIVED_EDEFAULT.equals(class2FramesReceived);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_FRAMES_TRANSMITTED:
				return CLASS2_FRAMES_TRANSMITTED_EDEFAULT == null ? class2FramesTransmitted != null : !CLASS2_FRAMES_TRANSMITTED_EDEFAULT.equals(class2FramesTransmitted);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS2_DISCARD_FRAMES:
				return CLASS2_DISCARD_FRAMES_EDEFAULT == null ? class2DiscardFrames != null : !CLASS2_DISCARD_FRAMES_EDEFAULT.equals(class2DiscardFrames);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_OCTETS_RECEIVED:
				return CLASS3_OCTETS_RECEIVED_EDEFAULT == null ? class3OctetsReceived != null : !CLASS3_OCTETS_RECEIVED_EDEFAULT.equals(class3OctetsReceived);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_OCTETS_TRANSMITTED:
				return CLASS3_OCTETS_TRANSMITTED_EDEFAULT == null ? class3OctetsTransmitted != null : !CLASS3_OCTETS_TRANSMITTED_EDEFAULT.equals(class3OctetsTransmitted);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_FRAMES_RECEIVED:
				return CLASS3_FRAMES_RECEIVED_EDEFAULT == null ? class3FramesReceived != null : !CLASS3_FRAMES_RECEIVED_EDEFAULT.equals(class3FramesReceived);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_FRAMES_TRANSMITTED:
				return CLASS3_FRAMES_TRANSMITTED_EDEFAULT == null ? class3FramesTransmitted != null : !CLASS3_FRAMES_TRANSMITTED_EDEFAULT.equals(class3FramesTransmitted);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__CLASS3_DISCARD_FRAMES:
				return CLASS3_DISCARD_FRAMES_EDEFAULT == null ? class3DiscardFrames != null : !CLASS3_DISCARD_FRAMES_EDEFAULT.equals(class3DiscardFrames);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__PARITY_ERRORS:
				return PARITY_ERRORS_EDEFAULT == null ? parityErrors != null : !PARITY_ERRORS_EDEFAULT.equals(parityErrors);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__FRAME_TIMEOUTS:
				return FRAME_TIMEOUTS_EDEFAULT == null ? frameTimeouts != null : !FRAME_TIMEOUTS_EDEFAULT.equals(frameTimeouts);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__BUFFER_CREDIT_ERRORS:
				return BUFFER_CREDIT_ERRORS_EDEFAULT == null ? bufferCreditErrors != null : !BUFFER_CREDIT_ERRORS_EDEFAULT.equals(bufferCreditErrors);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__END_CREDIT_ERRORS:
				return END_CREDIT_ERRORS_EDEFAULT == null ? endCreditErrors != null : !END_CREDIT_ERRORS_EDEFAULT.equals(endCreditErrors);
			case CimPackage.CIM_FIBRE_CHANNEL_ADAPTER__OUT_OF_ORDER_FRAMES_RECEIVED:
				return OUT_OF_ORDER_FRAMES_RECEIVED_EDEFAULT == null ? outOfOrderFramesReceived != null : !OUT_OF_ORDER_FRAMES_RECEIVED_EDEFAULT.equals(outOfOrderFramesReceived);
		}
		return super.eIsSet(featureID);
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
		result.append(" (MaxFrameSize: ");
		result.append(maxFrameSize);
		result.append(", SupportedCOS: ");
		result.append(supportedCOS);
		result.append(", FC4TypesSupported: ");
		result.append(fc4TypesSupported);
		result.append(", FC4VendorUniqueTypes: ");
		result.append(fc4VendorUniqueTypes);
		result.append(", CurrentFC4Types: ");
		result.append(currentFC4Types);
		result.append(", CurrentFC4VendorTypes: ");
		result.append(currentFC4VendorTypes);
		result.append(", Capabilities: ");
		result.append(capabilities);
		result.append(", CapabilityDescriptions: ");
		result.append(capabilityDescriptions);
		result.append(", ReceiveBufferErrors: ");
		result.append(receiveBufferErrors);
		result.append(", ReceiveEndErrors: ");
		result.append(receiveEndErrors);
		result.append(", ResourceAllocationTimeout: ");
		result.append(resourceAllocationTimeout);
		result.append(", ErrorDetectTimeout: ");
		result.append(errorDetectTimeout);
		result.append(", Class1SequencesSent: ");
		result.append(class1SequencesSent);
		result.append(", Class2SequencesSent: ");
		result.append(class2SequencesSent);
		result.append(", Class3SequencesSent: ");
		result.append(class3SequencesSent);
		result.append(", Class4SequencesSent: ");
		result.append(class4SequencesSent);
		result.append(", Class2OctetsReceived: ");
		result.append(class2OctetsReceived);
		result.append(", Class2OctetsTransmitted: ");
		result.append(class2OctetsTransmitted);
		result.append(", Class2FramesReceived: ");
		result.append(class2FramesReceived);
		result.append(", Class2FramesTransmitted: ");
		result.append(class2FramesTransmitted);
		result.append(", Class2DiscardFrames: ");
		result.append(class2DiscardFrames);
		result.append(", Class3OctetsReceived: ");
		result.append(class3OctetsReceived);
		result.append(", Class3OctetsTransmitted: ");
		result.append(class3OctetsTransmitted);
		result.append(", Class3FramesReceived: ");
		result.append(class3FramesReceived);
		result.append(", Class3FramesTransmitted: ");
		result.append(class3FramesTransmitted);
		result.append(", Class3DiscardFrames: ");
		result.append(class3DiscardFrames);
		result.append(", ParityErrors: ");
		result.append(parityErrors);
		result.append(", FrameTimeouts: ");
		result.append(frameTimeouts);
		result.append(", BufferCreditErrors: ");
		result.append(bufferCreditErrors);
		result.append(", EndCreditErrors: ");
		result.append(endCreditErrors);
		result.append(", OutOfOrderFramesReceived: ");
		result.append(outOfOrderFramesReceived);
		result.append(')');
		return result.toString();
	}

} //CIM_FibreChannelAdapterImpl

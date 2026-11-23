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

import org.dmtf.cim.CIM_EthernetPortAllocationSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Ethernet Port Allocation Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getDesiredVLANEndpointMode <em>Desired VLAN Endpoint Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getOtherEndpointMode <em>Other Endpoint Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getAllowedPriorities <em>Allowed Priorities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getAllowedToReceiveMACAddresses <em>Allowed To Receive MAC Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getAllowedToReceiveVLANs <em>Allowed To Receive VLA Ns</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getAllowedToTransmitMACAddresses <em>Allowed To Transmit MAC Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getAllowedToTransmitVLANs <em>Allowed To Transmit VLA Ns</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getDefaultPortVID <em>Default Port VID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getDefaultPriority <em>Default Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getManagerID <em>Manager ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getNetworkPortProfileID <em>Network Port Profile ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getNetworkPortProfileIDType <em>Network Port Profile ID Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getOtherNetworkPortProfileIDTypeInfo <em>Other Network Port Profile ID Type Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getPortCorrelationID <em>Port Correlation ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getPortVID <em>Port VID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getPromiscuous <em>Promiscuous</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getReceiveBandwidthLimit <em>Receive Bandwidth Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getReceiveBandwidthReservation <em>Receive Bandwidth Reservation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getSourceMACFilteringEnabled <em>Source MAC Filtering Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getVSITypeID <em>VSI Type ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortAllocationSettingDataImpl#getVSITypeIDVersion <em>VSI Type ID Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_EthernetPortAllocationSettingDataImpl extends CIM_ResourceAllocationSettingDataImpl implements CIM_EthernetPortAllocationSettingData {
	/**
	 * The default value of the '{@link #getDesiredVLANEndpointMode() <em>Desired VLAN Endpoint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredVLANEndpointMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DESIRED_VLAN_ENDPOINT_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesiredVLANEndpointMode() <em>Desired VLAN Endpoint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredVLANEndpointMode()
	 * @generated
	 * @ordered
	 */
	protected Integer desiredVLANEndpointMode = DESIRED_VLAN_ENDPOINT_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEndpointMode() <em>Other Endpoint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEndpointMode()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENDPOINT_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEndpointMode() <em>Other Endpoint Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEndpointMode()
	 * @generated
	 * @ordered
	 */
	protected String otherEndpointMode = OTHER_ENDPOINT_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllowedPriorities() <em>Allowed Priorities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedPriorities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> allowedPriorities;

	/**
	 * The cached value of the '{@link #getAllowedToReceiveMACAddresses() <em>Allowed To Receive MAC Addresses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedToReceiveMACAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> allowedToReceiveMACAddresses;

	/**
	 * The cached value of the '{@link #getAllowedToReceiveVLANs() <em>Allowed To Receive VLA Ns</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedToReceiveVLANs()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> allowedToReceiveVLANs;

	/**
	 * The cached value of the '{@link #getAllowedToTransmitMACAddresses() <em>Allowed To Transmit MAC Addresses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedToTransmitMACAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> allowedToTransmitMACAddresses;

	/**
	 * The cached value of the '{@link #getAllowedToTransmitVLANs() <em>Allowed To Transmit VLA Ns</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedToTransmitVLANs()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> allowedToTransmitVLANs;

	/**
	 * The default value of the '{@link #getDefaultPortVID() <em>Default Port VID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPortVID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_PORT_VID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultPortVID() <em>Default Port VID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPortVID()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultPortVID = DEFAULT_PORT_VID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultPriority() <em>Default Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultPriority() <em>Default Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultPriority = DEFAULT_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroupID() <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupID()
	 * @generated
	 * @ordered
	 */
	protected static final Long GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupID() <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupID()
	 * @generated
	 * @ordered
	 */
	protected Long groupID = GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getManagerID() <em>Manager ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerID()
	 * @generated
	 * @ordered
	 */
	protected static final Long MANAGER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManagerID() <em>Manager ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerID()
	 * @generated
	 * @ordered
	 */
	protected Long managerID = MANAGER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkPortProfileID() <em>Network Port Profile ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkPortProfileID()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_PORT_PROFILE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkPortProfileID() <em>Network Port Profile ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkPortProfileID()
	 * @generated
	 * @ordered
	 */
	protected String networkPortProfileID = NETWORK_PORT_PROFILE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkPortProfileIDType() <em>Network Port Profile ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkPortProfileIDType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NETWORK_PORT_PROFILE_ID_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkPortProfileIDType() <em>Network Port Profile ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkPortProfileIDType()
	 * @generated
	 * @ordered
	 */
	protected Integer networkPortProfileIDType = NETWORK_PORT_PROFILE_ID_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherNetworkPortProfileIDTypeInfo() <em>Other Network Port Profile ID Type Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherNetworkPortProfileIDTypeInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_NETWORK_PORT_PROFILE_ID_TYPE_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherNetworkPortProfileIDTypeInfo() <em>Other Network Port Profile ID Type Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherNetworkPortProfileIDTypeInfo()
	 * @generated
	 * @ordered
	 */
	protected String otherNetworkPortProfileIDTypeInfo = OTHER_NETWORK_PORT_PROFILE_ID_TYPE_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortCorrelationID() <em>Port Correlation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortCorrelationID()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_CORRELATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortCorrelationID() <em>Port Correlation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortCorrelationID()
	 * @generated
	 * @ordered
	 */
	protected String portCorrelationID = PORT_CORRELATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortVID() <em>Port VID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortVID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORT_VID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortVID() <em>Port VID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortVID()
	 * @generated
	 * @ordered
	 */
	protected Integer portVID = PORT_VID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPromiscuous() <em>Promiscuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromiscuous()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PROMISCUOUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPromiscuous() <em>Promiscuous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromiscuous()
	 * @generated
	 * @ordered
	 */
	protected Boolean promiscuous = PROMISCUOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiveBandwidthLimit() <em>Receive Bandwidth Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveBandwidthLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECEIVE_BANDWIDTH_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveBandwidthLimit() <em>Receive Bandwidth Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveBandwidthLimit()
	 * @generated
	 * @ordered
	 */
	protected Long receiveBandwidthLimit = RECEIVE_BANDWIDTH_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiveBandwidthReservation() <em>Receive Bandwidth Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveBandwidthReservation()
	 * @generated
	 * @ordered
	 */
	protected static final Long RECEIVE_BANDWIDTH_RESERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceiveBandwidthReservation() <em>Receive Bandwidth Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveBandwidthReservation()
	 * @generated
	 * @ordered
	 */
	protected Long receiveBandwidthReservation = RECEIVE_BANDWIDTH_RESERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceMACFilteringEnabled() <em>Source MAC Filtering Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMACFilteringEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SOURCE_MAC_FILTERING_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceMACFilteringEnabled() <em>Source MAC Filtering Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMACFilteringEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean sourceMACFilteringEnabled = SOURCE_MAC_FILTERING_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVSITypeID() <em>VSI Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSITypeID()
	 * @generated
	 * @ordered
	 */
	protected static final Long VSI_TYPE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVSITypeID() <em>VSI Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSITypeID()
	 * @generated
	 * @ordered
	 */
	protected Long vsiTypeID = VSI_TYPE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVSITypeIDVersion() <em>VSI Type ID Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSITypeIDVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VSI_TYPE_ID_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVSITypeIDVersion() <em>VSI Type ID Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSITypeIDVersion()
	 * @generated
	 * @ordered
	 */
	protected Integer vsiTypeIDVersion = VSI_TYPE_ID_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_EthernetPortAllocationSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_EthernetPortAllocationSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDesiredVLANEndpointMode() {
		return desiredVLANEndpointMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesiredVLANEndpointMode(Integer newDesiredVLANEndpointMode) {
		Integer oldDesiredVLANEndpointMode = desiredVLANEndpointMode;
		desiredVLANEndpointMode = newDesiredVLANEndpointMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__DESIRED_VLAN_ENDPOINT_MODE, oldDesiredVLANEndpointMode, desiredVLANEndpointMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherEndpointMode() {
		return otherEndpointMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherEndpointMode(String newOtherEndpointMode) {
		String oldOtherEndpointMode = otherEndpointMode;
		otherEndpointMode = newOtherEndpointMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__OTHER_ENDPOINT_MODE, oldOtherEndpointMode, otherEndpointMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAllowedPriorities() {
		if (allowedPriorities == null) {
			allowedPriorities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_PRIORITIES);
		}
		return allowedPriorities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAllowedToReceiveMACAddresses() {
		if (allowedToReceiveMACAddresses == null) {
			allowedToReceiveMACAddresses = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_RECEIVE_MAC_ADDRESSES);
		}
		return allowedToReceiveMACAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAllowedToReceiveVLANs() {
		if (allowedToReceiveVLANs == null) {
			allowedToReceiveVLANs = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_RECEIVE_VLA_NS);
		}
		return allowedToReceiveVLANs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAllowedToTransmitMACAddresses() {
		if (allowedToTransmitMACAddresses == null) {
			allowedToTransmitMACAddresses = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_TRANSMIT_MAC_ADDRESSES);
		}
		return allowedToTransmitMACAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAllowedToTransmitVLANs() {
		if (allowedToTransmitVLANs == null) {
			allowedToTransmitVLANs = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_TRANSMIT_VLA_NS);
		}
		return allowedToTransmitVLANs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDefaultPortVID() {
		return defaultPortVID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultPortVID(Integer newDefaultPortVID) {
		Integer oldDefaultPortVID = defaultPortVID;
		defaultPortVID = newDefaultPortVID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__DEFAULT_PORT_VID, oldDefaultPortVID, defaultPortVID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDefaultPriority() {
		return defaultPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultPriority(Integer newDefaultPriority) {
		Integer oldDefaultPriority = defaultPriority;
		defaultPriority = newDefaultPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__DEFAULT_PRIORITY, oldDefaultPriority, defaultPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getGroupID() {
		return groupID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupID(Long newGroupID) {
		Long oldGroupID = groupID;
		groupID = newGroupID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__GROUP_ID, oldGroupID, groupID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getManagerID() {
		return managerID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagerID(Long newManagerID) {
		Long oldManagerID = managerID;
		managerID = newManagerID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__MANAGER_ID, oldManagerID, managerID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetworkPortProfileID() {
		return networkPortProfileID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkPortProfileID(String newNetworkPortProfileID) {
		String oldNetworkPortProfileID = networkPortProfileID;
		networkPortProfileID = newNetworkPortProfileID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__NETWORK_PORT_PROFILE_ID, oldNetworkPortProfileID, networkPortProfileID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNetworkPortProfileIDType() {
		return networkPortProfileIDType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkPortProfileIDType(Integer newNetworkPortProfileIDType) {
		Integer oldNetworkPortProfileIDType = networkPortProfileIDType;
		networkPortProfileIDType = newNetworkPortProfileIDType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__NETWORK_PORT_PROFILE_ID_TYPE, oldNetworkPortProfileIDType, networkPortProfileIDType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherNetworkPortProfileIDTypeInfo() {
		return otherNetworkPortProfileIDTypeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherNetworkPortProfileIDTypeInfo(String newOtherNetworkPortProfileIDTypeInfo) {
		String oldOtherNetworkPortProfileIDTypeInfo = otherNetworkPortProfileIDTypeInfo;
		otherNetworkPortProfileIDTypeInfo = newOtherNetworkPortProfileIDTypeInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__OTHER_NETWORK_PORT_PROFILE_ID_TYPE_INFO, oldOtherNetworkPortProfileIDTypeInfo, otherNetworkPortProfileIDTypeInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortCorrelationID() {
		return portCorrelationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortCorrelationID(String newPortCorrelationID) {
		String oldPortCorrelationID = portCorrelationID;
		portCorrelationID = newPortCorrelationID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__PORT_CORRELATION_ID, oldPortCorrelationID, portCorrelationID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPortVID() {
		return portVID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortVID(Integer newPortVID) {
		Integer oldPortVID = portVID;
		portVID = newPortVID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__PORT_VID, oldPortVID, portVID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPromiscuous() {
		return promiscuous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPromiscuous(Boolean newPromiscuous) {
		Boolean oldPromiscuous = promiscuous;
		promiscuous = newPromiscuous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__PROMISCUOUS, oldPromiscuous, promiscuous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReceiveBandwidthLimit() {
		return receiveBandwidthLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiveBandwidthLimit(Long newReceiveBandwidthLimit) {
		Long oldReceiveBandwidthLimit = receiveBandwidthLimit;
		receiveBandwidthLimit = newReceiveBandwidthLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__RECEIVE_BANDWIDTH_LIMIT, oldReceiveBandwidthLimit, receiveBandwidthLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getReceiveBandwidthReservation() {
		return receiveBandwidthReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceiveBandwidthReservation(Long newReceiveBandwidthReservation) {
		Long oldReceiveBandwidthReservation = receiveBandwidthReservation;
		receiveBandwidthReservation = newReceiveBandwidthReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__RECEIVE_BANDWIDTH_RESERVATION, oldReceiveBandwidthReservation, receiveBandwidthReservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSourceMACFilteringEnabled() {
		return sourceMACFilteringEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceMACFilteringEnabled(Boolean newSourceMACFilteringEnabled) {
		Boolean oldSourceMACFilteringEnabled = sourceMACFilteringEnabled;
		sourceMACFilteringEnabled = newSourceMACFilteringEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__SOURCE_MAC_FILTERING_ENABLED, oldSourceMACFilteringEnabled, sourceMACFilteringEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getVSITypeID() {
		return vsiTypeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVSITypeID(Long newVSITypeID) {
		Long oldVSITypeID = vsiTypeID;
		vsiTypeID = newVSITypeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__VSI_TYPE_ID, oldVSITypeID, vsiTypeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getVSITypeIDVersion() {
		return vsiTypeIDVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVSITypeIDVersion(Integer newVSITypeIDVersion) {
		Integer oldVSITypeIDVersion = vsiTypeIDVersion;
		vsiTypeIDVersion = newVSITypeIDVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__VSI_TYPE_ID_VERSION, oldVSITypeIDVersion, vsiTypeIDVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__DESIRED_VLAN_ENDPOINT_MODE:
				return getDesiredVLANEndpointMode();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__OTHER_ENDPOINT_MODE:
				return getOtherEndpointMode();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_PRIORITIES:
				return getAllowedPriorities();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_RECEIVE_MAC_ADDRESSES:
				return getAllowedToReceiveMACAddresses();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_RECEIVE_VLA_NS:
				return getAllowedToReceiveVLANs();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_TRANSMIT_MAC_ADDRESSES:
				return getAllowedToTransmitMACAddresses();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_TRANSMIT_VLA_NS:
				return getAllowedToTransmitVLANs();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__DEFAULT_PORT_VID:
				return getDefaultPortVID();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__DEFAULT_PRIORITY:
				return getDefaultPriority();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__GROUP_ID:
				return getGroupID();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__MANAGER_ID:
				return getManagerID();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__NETWORK_PORT_PROFILE_ID:
				return getNetworkPortProfileID();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__NETWORK_PORT_PROFILE_ID_TYPE:
				return getNetworkPortProfileIDType();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__OTHER_NETWORK_PORT_PROFILE_ID_TYPE_INFO:
				return getOtherNetworkPortProfileIDTypeInfo();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__PORT_CORRELATION_ID:
				return getPortCorrelationID();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__PORT_VID:
				return getPortVID();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__PROMISCUOUS:
				return getPromiscuous();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__RECEIVE_BANDWIDTH_LIMIT:
				return getReceiveBandwidthLimit();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__RECEIVE_BANDWIDTH_RESERVATION:
				return getReceiveBandwidthReservation();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__SOURCE_MAC_FILTERING_ENABLED:
				return getSourceMACFilteringEnabled();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__VSI_TYPE_ID:
				return getVSITypeID();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__VSI_TYPE_ID_VERSION:
				return getVSITypeIDVersion();
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
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__DESIRED_VLAN_ENDPOINT_MODE:
				setDesiredVLANEndpointMode((Integer)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__OTHER_ENDPOINT_MODE:
				setOtherEndpointMode((String)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_PRIORITIES:
				getAllowedPriorities().clear();
				getAllowedPriorities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_RECEIVE_MAC_ADDRESSES:
				getAllowedToReceiveMACAddresses().clear();
				getAllowedToReceiveMACAddresses().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_RECEIVE_VLA_NS:
				getAllowedToReceiveVLANs().clear();
				getAllowedToReceiveVLANs().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_TRANSMIT_MAC_ADDRESSES:
				getAllowedToTransmitMACAddresses().clear();
				getAllowedToTransmitMACAddresses().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_TRANSMIT_VLA_NS:
				getAllowedToTransmitVLANs().clear();
				getAllowedToTransmitVLANs().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__DEFAULT_PORT_VID:
				setDefaultPortVID((Integer)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__DEFAULT_PRIORITY:
				setDefaultPriority((Integer)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__GROUP_ID:
				setGroupID((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__MANAGER_ID:
				setManagerID((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__NETWORK_PORT_PROFILE_ID:
				setNetworkPortProfileID((String)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__NETWORK_PORT_PROFILE_ID_TYPE:
				setNetworkPortProfileIDType((Integer)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__OTHER_NETWORK_PORT_PROFILE_ID_TYPE_INFO:
				setOtherNetworkPortProfileIDTypeInfo((String)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__PORT_CORRELATION_ID:
				setPortCorrelationID((String)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__PORT_VID:
				setPortVID((Integer)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__PROMISCUOUS:
				setPromiscuous((Boolean)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__RECEIVE_BANDWIDTH_LIMIT:
				setReceiveBandwidthLimit((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__RECEIVE_BANDWIDTH_RESERVATION:
				setReceiveBandwidthReservation((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__SOURCE_MAC_FILTERING_ENABLED:
				setSourceMACFilteringEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__VSI_TYPE_ID:
				setVSITypeID((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__VSI_TYPE_ID_VERSION:
				setVSITypeIDVersion((Integer)newValue);
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
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__DESIRED_VLAN_ENDPOINT_MODE:
				setDesiredVLANEndpointMode(DESIRED_VLAN_ENDPOINT_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__OTHER_ENDPOINT_MODE:
				setOtherEndpointMode(OTHER_ENDPOINT_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_PRIORITIES:
				getAllowedPriorities().clear();
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_RECEIVE_MAC_ADDRESSES:
				getAllowedToReceiveMACAddresses().clear();
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_RECEIVE_VLA_NS:
				getAllowedToReceiveVLANs().clear();
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_TRANSMIT_MAC_ADDRESSES:
				getAllowedToTransmitMACAddresses().clear();
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_TRANSMIT_VLA_NS:
				getAllowedToTransmitVLANs().clear();
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__DEFAULT_PORT_VID:
				setDefaultPortVID(DEFAULT_PORT_VID_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__DEFAULT_PRIORITY:
				setDefaultPriority(DEFAULT_PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__GROUP_ID:
				setGroupID(GROUP_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__MANAGER_ID:
				setManagerID(MANAGER_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__NETWORK_PORT_PROFILE_ID:
				setNetworkPortProfileID(NETWORK_PORT_PROFILE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__NETWORK_PORT_PROFILE_ID_TYPE:
				setNetworkPortProfileIDType(NETWORK_PORT_PROFILE_ID_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__OTHER_NETWORK_PORT_PROFILE_ID_TYPE_INFO:
				setOtherNetworkPortProfileIDTypeInfo(OTHER_NETWORK_PORT_PROFILE_ID_TYPE_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__PORT_CORRELATION_ID:
				setPortCorrelationID(PORT_CORRELATION_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__PORT_VID:
				setPortVID(PORT_VID_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__PROMISCUOUS:
				setPromiscuous(PROMISCUOUS_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__RECEIVE_BANDWIDTH_LIMIT:
				setReceiveBandwidthLimit(RECEIVE_BANDWIDTH_LIMIT_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__RECEIVE_BANDWIDTH_RESERVATION:
				setReceiveBandwidthReservation(RECEIVE_BANDWIDTH_RESERVATION_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__SOURCE_MAC_FILTERING_ENABLED:
				setSourceMACFilteringEnabled(SOURCE_MAC_FILTERING_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__VSI_TYPE_ID:
				setVSITypeID(VSI_TYPE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__VSI_TYPE_ID_VERSION:
				setVSITypeIDVersion(VSI_TYPE_ID_VERSION_EDEFAULT);
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
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__DESIRED_VLAN_ENDPOINT_MODE:
				return DESIRED_VLAN_ENDPOINT_MODE_EDEFAULT == null ? desiredVLANEndpointMode != null : !DESIRED_VLAN_ENDPOINT_MODE_EDEFAULT.equals(desiredVLANEndpointMode);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__OTHER_ENDPOINT_MODE:
				return OTHER_ENDPOINT_MODE_EDEFAULT == null ? otherEndpointMode != null : !OTHER_ENDPOINT_MODE_EDEFAULT.equals(otherEndpointMode);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_PRIORITIES:
				return allowedPriorities != null && !allowedPriorities.isEmpty();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_RECEIVE_MAC_ADDRESSES:
				return allowedToReceiveMACAddresses != null && !allowedToReceiveMACAddresses.isEmpty();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_RECEIVE_VLA_NS:
				return allowedToReceiveVLANs != null && !allowedToReceiveVLANs.isEmpty();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_TRANSMIT_MAC_ADDRESSES:
				return allowedToTransmitMACAddresses != null && !allowedToTransmitMACAddresses.isEmpty();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__ALLOWED_TO_TRANSMIT_VLA_NS:
				return allowedToTransmitVLANs != null && !allowedToTransmitVLANs.isEmpty();
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__DEFAULT_PORT_VID:
				return DEFAULT_PORT_VID_EDEFAULT == null ? defaultPortVID != null : !DEFAULT_PORT_VID_EDEFAULT.equals(defaultPortVID);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__DEFAULT_PRIORITY:
				return DEFAULT_PRIORITY_EDEFAULT == null ? defaultPriority != null : !DEFAULT_PRIORITY_EDEFAULT.equals(defaultPriority);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? groupID != null : !GROUP_ID_EDEFAULT.equals(groupID);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__MANAGER_ID:
				return MANAGER_ID_EDEFAULT == null ? managerID != null : !MANAGER_ID_EDEFAULT.equals(managerID);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__NETWORK_PORT_PROFILE_ID:
				return NETWORK_PORT_PROFILE_ID_EDEFAULT == null ? networkPortProfileID != null : !NETWORK_PORT_PROFILE_ID_EDEFAULT.equals(networkPortProfileID);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__NETWORK_PORT_PROFILE_ID_TYPE:
				return NETWORK_PORT_PROFILE_ID_TYPE_EDEFAULT == null ? networkPortProfileIDType != null : !NETWORK_PORT_PROFILE_ID_TYPE_EDEFAULT.equals(networkPortProfileIDType);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__OTHER_NETWORK_PORT_PROFILE_ID_TYPE_INFO:
				return OTHER_NETWORK_PORT_PROFILE_ID_TYPE_INFO_EDEFAULT == null ? otherNetworkPortProfileIDTypeInfo != null : !OTHER_NETWORK_PORT_PROFILE_ID_TYPE_INFO_EDEFAULT.equals(otherNetworkPortProfileIDTypeInfo);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__PORT_CORRELATION_ID:
				return PORT_CORRELATION_ID_EDEFAULT == null ? portCorrelationID != null : !PORT_CORRELATION_ID_EDEFAULT.equals(portCorrelationID);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__PORT_VID:
				return PORT_VID_EDEFAULT == null ? portVID != null : !PORT_VID_EDEFAULT.equals(portVID);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__PROMISCUOUS:
				return PROMISCUOUS_EDEFAULT == null ? promiscuous != null : !PROMISCUOUS_EDEFAULT.equals(promiscuous);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__RECEIVE_BANDWIDTH_LIMIT:
				return RECEIVE_BANDWIDTH_LIMIT_EDEFAULT == null ? receiveBandwidthLimit != null : !RECEIVE_BANDWIDTH_LIMIT_EDEFAULT.equals(receiveBandwidthLimit);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__RECEIVE_BANDWIDTH_RESERVATION:
				return RECEIVE_BANDWIDTH_RESERVATION_EDEFAULT == null ? receiveBandwidthReservation != null : !RECEIVE_BANDWIDTH_RESERVATION_EDEFAULT.equals(receiveBandwidthReservation);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__SOURCE_MAC_FILTERING_ENABLED:
				return SOURCE_MAC_FILTERING_ENABLED_EDEFAULT == null ? sourceMACFilteringEnabled != null : !SOURCE_MAC_FILTERING_ENABLED_EDEFAULT.equals(sourceMACFilteringEnabled);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__VSI_TYPE_ID:
				return VSI_TYPE_ID_EDEFAULT == null ? vsiTypeID != null : !VSI_TYPE_ID_EDEFAULT.equals(vsiTypeID);
			case CimPackage.CIM_ETHERNET_PORT_ALLOCATION_SETTING_DATA__VSI_TYPE_ID_VERSION:
				return VSI_TYPE_ID_VERSION_EDEFAULT == null ? vsiTypeIDVersion != null : !VSI_TYPE_ID_VERSION_EDEFAULT.equals(vsiTypeIDVersion);
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
		result.append(" (DesiredVLANEndpointMode: ");
		result.append(desiredVLANEndpointMode);
		result.append(", OtherEndpointMode: ");
		result.append(otherEndpointMode);
		result.append(", AllowedPriorities: ");
		result.append(allowedPriorities);
		result.append(", AllowedToReceiveMACAddresses: ");
		result.append(allowedToReceiveMACAddresses);
		result.append(", AllowedToReceiveVLANs: ");
		result.append(allowedToReceiveVLANs);
		result.append(", AllowedToTransmitMACAddresses: ");
		result.append(allowedToTransmitMACAddresses);
		result.append(", AllowedToTransmitVLANs: ");
		result.append(allowedToTransmitVLANs);
		result.append(", DefaultPortVID: ");
		result.append(defaultPortVID);
		result.append(", DefaultPriority: ");
		result.append(defaultPriority);
		result.append(", GroupID: ");
		result.append(groupID);
		result.append(", ManagerID: ");
		result.append(managerID);
		result.append(", NetworkPortProfileID: ");
		result.append(networkPortProfileID);
		result.append(", NetworkPortProfileIDType: ");
		result.append(networkPortProfileIDType);
		result.append(", OtherNetworkPortProfileIDTypeInfo: ");
		result.append(otherNetworkPortProfileIDTypeInfo);
		result.append(", PortCorrelationID: ");
		result.append(portCorrelationID);
		result.append(", PortVID: ");
		result.append(portVID);
		result.append(", Promiscuous: ");
		result.append(promiscuous);
		result.append(", ReceiveBandwidthLimit: ");
		result.append(receiveBandwidthLimit);
		result.append(", ReceiveBandwidthReservation: ");
		result.append(receiveBandwidthReservation);
		result.append(", SourceMACFilteringEnabled: ");
		result.append(sourceMACFilteringEnabled);
		result.append(", VSITypeID: ");
		result.append(vsiTypeID);
		result.append(", VSITypeIDVersion: ");
		result.append(vsiTypeIDVersion);
		result.append(')');
		return result.toString();
	}

} //CIM_EthernetPortAllocationSettingDataImpl

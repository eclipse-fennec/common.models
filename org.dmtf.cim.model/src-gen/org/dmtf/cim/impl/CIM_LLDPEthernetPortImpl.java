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

import org.dmtf.cim.CIM_LLDPEthernetPort;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM LLDP Ethernet Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getConfigPortVlanTxEnable <em>Config Port Vlan Tx Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getConfigManVidTxEnable <em>Config Man Vid Tx Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getMessageTxInterval <em>Message Tx Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getMessageTxHoldMultiplier <em>Message Tx Hold Multiplier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getReinitDelay <em>Reinit Delay</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getNotificationInterval <em>Notification Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getTxCreditMax <em>Tx Credit Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getMessageFastTx <em>Message Fast Tx</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getTxFastInit <em>Tx Fast Init</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getDestMacAddress <em>Dest Mac Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getPortConfigAdminStatus <em>Port Config Admin Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getPortConfigNotificationEnable <em>Port Config Notification Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getPortConfigPortDescriptionTLVTxEnable <em>Port Config Port Description TLV Tx Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getPortConfigSystemNameTLVTxEnable <em>Port Config System Name TLV Tx Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getPortConfigSystemDescriptionTLVTxEnable <em>Port Config System Description TLV Tx Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getPortConfigSystemCapabilitiesTLVTxEnable <em>Port Config System Capabilities TLV Tx Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getManAddrConfigDestAddress <em>Man Addr Config Dest Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getManAddrConfigLocManAddrSubtype <em>Man Addr Config Loc Man Addr Subtype</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getManAddrConfigLocManAddr <em>Man Addr Config Loc Man Addr</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getManAddrConfigTxEnable <em>Man Addr Config Tx Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocChassisIdSubtype <em>Loc Chassis Id Subtype</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocChassisId <em>Loc Chassis Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocSysName <em>Loc Sys Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocSysDesc <em>Loc Sys Desc</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocSysCapSupported <em>Loc Sys Cap Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocSysCapEnabled <em>Loc Sys Cap Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocPortIdSubtype <em>Loc Port Id Subtype</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocPortID <em>Loc Port ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocPortDesc <em>Loc Port Desc</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocTxSystemValue <em>Loc Tx System Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemTxSystemValueEcho <em>Rem Tx System Value Echo</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocRxSystemValue <em>Loc Rx System Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemRxSystemValueEcho <em>Rem Rx System Value Echo</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocFbSystemValue <em>Loc Fb System Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemTxSystemValue <em>Rem Tx System Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocTxSystemValueEcho <em>Loc Tx System Value Echo</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemRxSystemValue <em>Rem Rx System Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocRxSystemValueEcho <em>Loc Rx System Value Echo</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocResolvedTxSystemValue <em>Loc Resolved Tx System Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocResolvedRxSystemValue <em>Loc Resolved Rx System Value</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getMaximumFrameSizeTLVEnabled <em>Maximum Frame Size TLV Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocManAddrSubType <em>Loc Man Addr Sub Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocManAddr <em>Loc Man Addr</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocManAddrIfSubtype <em>Loc Man Addr If Subtype</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getLocManAddrIfId <em>Loc Man Addr If Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemLocalDestMacAddress <em>Rem Local Dest Mac Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemManAddrSubType <em>Rem Man Addr Sub Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemManAddr <em>Rem Man Addr</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemManAddrIfSubtype <em>Rem Man Addr If Subtype</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemManAddrIfId <em>Rem Man Addr If Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemChassisIdSubtype <em>Rem Chassis Id Subtype</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemChassisId <em>Rem Chassis Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemSysName <em>Rem Sys Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemSysDesc <em>Rem Sys Desc</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemSysCapSupported <em>Rem Sys Cap Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemSysCapEnabled <em>Rem Sys Cap Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemPortIdSubtype <em>Rem Port Id Subtype</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemPortID <em>Rem Port ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LLDPEthernetPortImpl#getRemPortDesc <em>Rem Port Desc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LLDPEthernetPortImpl extends CIM_EthernetPortImpl implements CIM_LLDPEthernetPort {
	/**
	 * The default value of the '{@link #getConfigPortVlanTxEnable() <em>Config Port Vlan Tx Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigPortVlanTxEnable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONFIG_PORT_VLAN_TX_ENABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigPortVlanTxEnable() <em>Config Port Vlan Tx Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigPortVlanTxEnable()
	 * @generated
	 * @ordered
	 */
	protected Boolean configPortVlanTxEnable = CONFIG_PORT_VLAN_TX_ENABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigManVidTxEnable() <em>Config Man Vid Tx Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigManVidTxEnable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONFIG_MAN_VID_TX_ENABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigManVidTxEnable() <em>Config Man Vid Tx Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigManVidTxEnable()
	 * @generated
	 * @ordered
	 */
	protected Boolean configManVidTxEnable = CONFIG_MAN_VID_TX_ENABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageTxInterval() <em>Message Tx Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTxInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MESSAGE_TX_INTERVAL_EDEFAULT = Integer.valueOf(30);

	/**
	 * The cached value of the '{@link #getMessageTxInterval() <em>Message Tx Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTxInterval()
	 * @generated
	 * @ordered
	 */
	protected Integer messageTxInterval = MESSAGE_TX_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageTxHoldMultiplier() <em>Message Tx Hold Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTxHoldMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MESSAGE_TX_HOLD_MULTIPLIER_EDEFAULT = Integer.valueOf(4);

	/**
	 * The cached value of the '{@link #getMessageTxHoldMultiplier() <em>Message Tx Hold Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTxHoldMultiplier()
	 * @generated
	 * @ordered
	 */
	protected Integer messageTxHoldMultiplier = MESSAGE_TX_HOLD_MULTIPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getReinitDelay() <em>Reinit Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReinitDelay()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REINIT_DELAY_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getReinitDelay() <em>Reinit Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReinitDelay()
	 * @generated
	 * @ordered
	 */
	protected Integer reinitDelay = REINIT_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotificationInterval() <em>Notification Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NOTIFICATION_INTERVAL_EDEFAULT = Integer.valueOf(30);

	/**
	 * The cached value of the '{@link #getNotificationInterval() <em>Notification Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationInterval()
	 * @generated
	 * @ordered
	 */
	protected Integer notificationInterval = NOTIFICATION_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxCreditMax() <em>Tx Credit Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxCreditMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TX_CREDIT_MAX_EDEFAULT = Integer.valueOf(5);

	/**
	 * The cached value of the '{@link #getTxCreditMax() <em>Tx Credit Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxCreditMax()
	 * @generated
	 * @ordered
	 */
	protected Integer txCreditMax = TX_CREDIT_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageFastTx() <em>Message Fast Tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFastTx()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MESSAGE_FAST_TX_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getMessageFastTx() <em>Message Fast Tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageFastTx()
	 * @generated
	 * @ordered
	 */
	protected Integer messageFastTx = MESSAGE_FAST_TX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxFastInit() <em>Tx Fast Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxFastInit()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TX_FAST_INIT_EDEFAULT = Integer.valueOf(4);

	/**
	 * The cached value of the '{@link #getTxFastInit() <em>Tx Fast Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxFastInit()
	 * @generated
	 * @ordered
	 */
	protected Integer txFastInit = TX_FAST_INIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDestMacAddress() <em>Dest Mac Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestMacAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<String> destMacAddress;

	/**
	 * The cached value of the '{@link #getPortConfigAdminStatus() <em>Port Config Admin Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortConfigAdminStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> portConfigAdminStatus;

	/**
	 * The cached value of the '{@link #getPortConfigNotificationEnable() <em>Port Config Notification Enable</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortConfigNotificationEnable()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> portConfigNotificationEnable;

	/**
	 * The cached value of the '{@link #getPortConfigPortDescriptionTLVTxEnable() <em>Port Config Port Description TLV Tx Enable</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortConfigPortDescriptionTLVTxEnable()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> portConfigPortDescriptionTLVTxEnable;

	/**
	 * The cached value of the '{@link #getPortConfigSystemNameTLVTxEnable() <em>Port Config System Name TLV Tx Enable</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortConfigSystemNameTLVTxEnable()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> portConfigSystemNameTLVTxEnable;

	/**
	 * The cached value of the '{@link #getPortConfigSystemDescriptionTLVTxEnable() <em>Port Config System Description TLV Tx Enable</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortConfigSystemDescriptionTLVTxEnable()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> portConfigSystemDescriptionTLVTxEnable;

	/**
	 * The cached value of the '{@link #getPortConfigSystemCapabilitiesTLVTxEnable() <em>Port Config System Capabilities TLV Tx Enable</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortConfigSystemCapabilitiesTLVTxEnable()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> portConfigSystemCapabilitiesTLVTxEnable;

	/**
	 * The cached value of the '{@link #getManAddrConfigDestAddress() <em>Man Addr Config Dest Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManAddrConfigDestAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<String> manAddrConfigDestAddress;

	/**
	 * The cached value of the '{@link #getManAddrConfigLocManAddrSubtype() <em>Man Addr Config Loc Man Addr Subtype</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManAddrConfigLocManAddrSubtype()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> manAddrConfigLocManAddrSubtype;

	/**
	 * The cached value of the '{@link #getManAddrConfigLocManAddr() <em>Man Addr Config Loc Man Addr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManAddrConfigLocManAddr()
	 * @generated
	 * @ordered
	 */
	protected EList<String> manAddrConfigLocManAddr;

	/**
	 * The cached value of the '{@link #getManAddrConfigTxEnable() <em>Man Addr Config Tx Enable</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManAddrConfigTxEnable()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> manAddrConfigTxEnable;

	/**
	 * The default value of the '{@link #getLocChassisIdSubtype() <em>Loc Chassis Id Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocChassisIdSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOC_CHASSIS_ID_SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocChassisIdSubtype() <em>Loc Chassis Id Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocChassisIdSubtype()
	 * @generated
	 * @ordered
	 */
	protected Integer locChassisIdSubtype = LOC_CHASSIS_ID_SUBTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocChassisId() <em>Loc Chassis Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocChassisId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_CHASSIS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocChassisId() <em>Loc Chassis Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocChassisId()
	 * @generated
	 * @ordered
	 */
	protected String locChassisId = LOC_CHASSIS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocSysName() <em>Loc Sys Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocSysName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_SYS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocSysName() <em>Loc Sys Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocSysName()
	 * @generated
	 * @ordered
	 */
	protected String locSysName = LOC_SYS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocSysDesc() <em>Loc Sys Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocSysDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_SYS_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocSysDesc() <em>Loc Sys Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocSysDesc()
	 * @generated
	 * @ordered
	 */
	protected String locSysDesc = LOC_SYS_DESC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocSysCapSupported() <em>Loc Sys Cap Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocSysCapSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> locSysCapSupported;

	/**
	 * The cached value of the '{@link #getLocSysCapEnabled() <em>Loc Sys Cap Enabled</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocSysCapEnabled()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> locSysCapEnabled;

	/**
	 * The default value of the '{@link #getLocPortIdSubtype() <em>Loc Port Id Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocPortIdSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOC_PORT_ID_SUBTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocPortIdSubtype() <em>Loc Port Id Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocPortIdSubtype()
	 * @generated
	 * @ordered
	 */
	protected Integer locPortIdSubtype = LOC_PORT_ID_SUBTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocPortID() <em>Loc Port ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocPortID()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_PORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocPortID() <em>Loc Port ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocPortID()
	 * @generated
	 * @ordered
	 */
	protected String locPortID = LOC_PORT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocPortDesc() <em>Loc Port Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocPortDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_PORT_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocPortDesc() <em>Loc Port Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocPortDesc()
	 * @generated
	 * @ordered
	 */
	protected String locPortDesc = LOC_PORT_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocTxSystemValue() <em>Loc Tx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocTxSystemValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOC_TX_SYSTEM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocTxSystemValue() <em>Loc Tx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocTxSystemValue()
	 * @generated
	 * @ordered
	 */
	protected Integer locTxSystemValue = LOC_TX_SYSTEM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemTxSystemValueEcho() <em>Rem Tx System Value Echo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemTxSystemValueEcho()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REM_TX_SYSTEM_VALUE_ECHO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemTxSystemValueEcho() <em>Rem Tx System Value Echo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemTxSystemValueEcho()
	 * @generated
	 * @ordered
	 */
	protected Integer remTxSystemValueEcho = REM_TX_SYSTEM_VALUE_ECHO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocRxSystemValue() <em>Loc Rx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocRxSystemValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOC_RX_SYSTEM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocRxSystemValue() <em>Loc Rx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocRxSystemValue()
	 * @generated
	 * @ordered
	 */
	protected Integer locRxSystemValue = LOC_RX_SYSTEM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemRxSystemValueEcho() <em>Rem Rx System Value Echo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemRxSystemValueEcho()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REM_RX_SYSTEM_VALUE_ECHO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemRxSystemValueEcho() <em>Rem Rx System Value Echo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemRxSystemValueEcho()
	 * @generated
	 * @ordered
	 */
	protected Integer remRxSystemValueEcho = REM_RX_SYSTEM_VALUE_ECHO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocFbSystemValue() <em>Loc Fb System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocFbSystemValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOC_FB_SYSTEM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocFbSystemValue() <em>Loc Fb System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocFbSystemValue()
	 * @generated
	 * @ordered
	 */
	protected Integer locFbSystemValue = LOC_FB_SYSTEM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemTxSystemValue() <em>Rem Tx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemTxSystemValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REM_TX_SYSTEM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemTxSystemValue() <em>Rem Tx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemTxSystemValue()
	 * @generated
	 * @ordered
	 */
	protected Integer remTxSystemValue = REM_TX_SYSTEM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocTxSystemValueEcho() <em>Loc Tx System Value Echo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocTxSystemValueEcho()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOC_TX_SYSTEM_VALUE_ECHO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocTxSystemValueEcho() <em>Loc Tx System Value Echo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocTxSystemValueEcho()
	 * @generated
	 * @ordered
	 */
	protected Integer locTxSystemValueEcho = LOC_TX_SYSTEM_VALUE_ECHO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemRxSystemValue() <em>Rem Rx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemRxSystemValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REM_RX_SYSTEM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemRxSystemValue() <em>Rem Rx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemRxSystemValue()
	 * @generated
	 * @ordered
	 */
	protected Integer remRxSystemValue = REM_RX_SYSTEM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocRxSystemValueEcho() <em>Loc Rx System Value Echo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocRxSystemValueEcho()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOC_RX_SYSTEM_VALUE_ECHO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocRxSystemValueEcho() <em>Loc Rx System Value Echo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocRxSystemValueEcho()
	 * @generated
	 * @ordered
	 */
	protected Integer locRxSystemValueEcho = LOC_RX_SYSTEM_VALUE_ECHO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocResolvedTxSystemValue() <em>Loc Resolved Tx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocResolvedTxSystemValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOC_RESOLVED_TX_SYSTEM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocResolvedTxSystemValue() <em>Loc Resolved Tx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocResolvedTxSystemValue()
	 * @generated
	 * @ordered
	 */
	protected Integer locResolvedTxSystemValue = LOC_RESOLVED_TX_SYSTEM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocResolvedRxSystemValue() <em>Loc Resolved Rx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocResolvedRxSystemValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOC_RESOLVED_RX_SYSTEM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocResolvedRxSystemValue() <em>Loc Resolved Rx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocResolvedRxSystemValue()
	 * @generated
	 * @ordered
	 */
	protected Integer locResolvedRxSystemValue = LOC_RESOLVED_RX_SYSTEM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumFrameSizeTLVEnabled() <em>Maximum Frame Size TLV Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumFrameSizeTLVEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MAXIMUM_FRAME_SIZE_TLV_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumFrameSizeTLVEnabled() <em>Maximum Frame Size TLV Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumFrameSizeTLVEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean maximumFrameSizeTLVEnabled = MAXIMUM_FRAME_SIZE_TLV_ENABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocManAddrSubType() <em>Loc Man Addr Sub Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocManAddrSubType()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> locManAddrSubType;

	/**
	 * The cached value of the '{@link #getLocManAddr() <em>Loc Man Addr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocManAddr()
	 * @generated
	 * @ordered
	 */
	protected EList<String> locManAddr;

	/**
	 * The cached value of the '{@link #getLocManAddrIfSubtype() <em>Loc Man Addr If Subtype</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocManAddrIfSubtype()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> locManAddrIfSubtype;

	/**
	 * The cached value of the '{@link #getLocManAddrIfId() <em>Loc Man Addr If Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocManAddrIfId()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> locManAddrIfId;

	/**
	 * The cached value of the '{@link #getRemLocalDestMacAddress() <em>Rem Local Dest Mac Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemLocalDestMacAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<String> remLocalDestMacAddress;

	/**
	 * The cached value of the '{@link #getRemManAddrSubType() <em>Rem Man Addr Sub Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemManAddrSubType()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> remManAddrSubType;

	/**
	 * The cached value of the '{@link #getRemManAddr() <em>Rem Man Addr</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemManAddr()
	 * @generated
	 * @ordered
	 */
	protected EList<String> remManAddr;

	/**
	 * The cached value of the '{@link #getRemManAddrIfSubtype() <em>Rem Man Addr If Subtype</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemManAddrIfSubtype()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> remManAddrIfSubtype;

	/**
	 * The cached value of the '{@link #getRemManAddrIfId() <em>Rem Man Addr If Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemManAddrIfId()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> remManAddrIfId;

	/**
	 * The cached value of the '{@link #getRemChassisIdSubtype() <em>Rem Chassis Id Subtype</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemChassisIdSubtype()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> remChassisIdSubtype;

	/**
	 * The cached value of the '{@link #getRemChassisId() <em>Rem Chassis Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemChassisId()
	 * @generated
	 * @ordered
	 */
	protected EList<String> remChassisId;

	/**
	 * The cached value of the '{@link #getRemSysName() <em>Rem Sys Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemSysName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> remSysName;

	/**
	 * The cached value of the '{@link #getRemSysDesc() <em>Rem Sys Desc</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemSysDesc()
	 * @generated
	 * @ordered
	 */
	protected EList<String> remSysDesc;

	/**
	 * The cached value of the '{@link #getRemSysCapSupported() <em>Rem Sys Cap Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemSysCapSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> remSysCapSupported;

	/**
	 * The cached value of the '{@link #getRemSysCapEnabled() <em>Rem Sys Cap Enabled</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemSysCapEnabled()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> remSysCapEnabled;

	/**
	 * The cached value of the '{@link #getRemPortIdSubtype() <em>Rem Port Id Subtype</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemPortIdSubtype()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> remPortIdSubtype;

	/**
	 * The cached value of the '{@link #getRemPortID() <em>Rem Port ID</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemPortID()
	 * @generated
	 * @ordered
	 */
	protected EList<String> remPortID;

	/**
	 * The cached value of the '{@link #getRemPortDesc() <em>Rem Port Desc</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemPortDesc()
	 * @generated
	 * @ordered
	 */
	protected EList<String> remPortDesc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LLDPEthernetPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LLDPEthernetPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getConfigPortVlanTxEnable() {
		return configPortVlanTxEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigPortVlanTxEnable(Boolean newConfigPortVlanTxEnable) {
		Boolean oldConfigPortVlanTxEnable = configPortVlanTxEnable;
		configPortVlanTxEnable = newConfigPortVlanTxEnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__CONFIG_PORT_VLAN_TX_ENABLE, oldConfigPortVlanTxEnable, configPortVlanTxEnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getConfigManVidTxEnable() {
		return configManVidTxEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigManVidTxEnable(Boolean newConfigManVidTxEnable) {
		Boolean oldConfigManVidTxEnable = configManVidTxEnable;
		configManVidTxEnable = newConfigManVidTxEnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__CONFIG_MAN_VID_TX_ENABLE, oldConfigManVidTxEnable, configManVidTxEnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMessageTxInterval() {
		return messageTxInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageTxInterval(Integer newMessageTxInterval) {
		Integer oldMessageTxInterval = messageTxInterval;
		messageTxInterval = newMessageTxInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__MESSAGE_TX_INTERVAL, oldMessageTxInterval, messageTxInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMessageTxHoldMultiplier() {
		return messageTxHoldMultiplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageTxHoldMultiplier(Integer newMessageTxHoldMultiplier) {
		Integer oldMessageTxHoldMultiplier = messageTxHoldMultiplier;
		messageTxHoldMultiplier = newMessageTxHoldMultiplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__MESSAGE_TX_HOLD_MULTIPLIER, oldMessageTxHoldMultiplier, messageTxHoldMultiplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getReinitDelay() {
		return reinitDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReinitDelay(Integer newReinitDelay) {
		Integer oldReinitDelay = reinitDelay;
		reinitDelay = newReinitDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__REINIT_DELAY, oldReinitDelay, reinitDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNotificationInterval() {
		return notificationInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotificationInterval(Integer newNotificationInterval) {
		Integer oldNotificationInterval = notificationInterval;
		notificationInterval = newNotificationInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__NOTIFICATION_INTERVAL, oldNotificationInterval, notificationInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTxCreditMax() {
		return txCreditMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTxCreditMax(Integer newTxCreditMax) {
		Integer oldTxCreditMax = txCreditMax;
		txCreditMax = newTxCreditMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__TX_CREDIT_MAX, oldTxCreditMax, txCreditMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMessageFastTx() {
		return messageFastTx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageFastTx(Integer newMessageFastTx) {
		Integer oldMessageFastTx = messageFastTx;
		messageFastTx = newMessageFastTx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__MESSAGE_FAST_TX, oldMessageFastTx, messageFastTx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTxFastInit() {
		return txFastInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTxFastInit(Integer newTxFastInit) {
		Integer oldTxFastInit = txFastInit;
		txFastInit = newTxFastInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__TX_FAST_INIT, oldTxFastInit, txFastInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDestMacAddress() {
		if (destMacAddress == null) {
			destMacAddress = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__DEST_MAC_ADDRESS);
		}
		return destMacAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPortConfigAdminStatus() {
		if (portConfigAdminStatus == null) {
			portConfigAdminStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_ADMIN_STATUS);
		}
		return portConfigAdminStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getPortConfigNotificationEnable() {
		if (portConfigNotificationEnable == null) {
			portConfigNotificationEnable = new EDataTypeEList<Boolean>(Boolean.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_NOTIFICATION_ENABLE);
		}
		return portConfigNotificationEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getPortConfigPortDescriptionTLVTxEnable() {
		if (portConfigPortDescriptionTLVTxEnable == null) {
			portConfigPortDescriptionTLVTxEnable = new EDataTypeEList<Boolean>(Boolean.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_PORT_DESCRIPTION_TLV_TX_ENABLE);
		}
		return portConfigPortDescriptionTLVTxEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getPortConfigSystemNameTLVTxEnable() {
		if (portConfigSystemNameTLVTxEnable == null) {
			portConfigSystemNameTLVTxEnable = new EDataTypeEList<Boolean>(Boolean.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_SYSTEM_NAME_TLV_TX_ENABLE);
		}
		return portConfigSystemNameTLVTxEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getPortConfigSystemDescriptionTLVTxEnable() {
		if (portConfigSystemDescriptionTLVTxEnable == null) {
			portConfigSystemDescriptionTLVTxEnable = new EDataTypeEList<Boolean>(Boolean.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_SYSTEM_DESCRIPTION_TLV_TX_ENABLE);
		}
		return portConfigSystemDescriptionTLVTxEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getPortConfigSystemCapabilitiesTLVTxEnable() {
		if (portConfigSystemCapabilitiesTLVTxEnable == null) {
			portConfigSystemCapabilitiesTLVTxEnable = new EDataTypeEList<Boolean>(Boolean.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_SYSTEM_CAPABILITIES_TLV_TX_ENABLE);
		}
		return portConfigSystemCapabilitiesTLVTxEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getManAddrConfigDestAddress() {
		if (manAddrConfigDestAddress == null) {
			manAddrConfigDestAddress = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_DEST_ADDRESS);
		}
		return manAddrConfigDestAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getManAddrConfigLocManAddrSubtype() {
		if (manAddrConfigLocManAddrSubtype == null) {
			manAddrConfigLocManAddrSubtype = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_LOC_MAN_ADDR_SUBTYPE);
		}
		return manAddrConfigLocManAddrSubtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getManAddrConfigLocManAddr() {
		if (manAddrConfigLocManAddr == null) {
			manAddrConfigLocManAddr = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_LOC_MAN_ADDR);
		}
		return manAddrConfigLocManAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getManAddrConfigTxEnable() {
		if (manAddrConfigTxEnable == null) {
			manAddrConfigTxEnable = new EDataTypeEList<Boolean>(Boolean.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_TX_ENABLE);
		}
		return manAddrConfigTxEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocChassisIdSubtype() {
		return locChassisIdSubtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocChassisIdSubtype(Integer newLocChassisIdSubtype) {
		Integer oldLocChassisIdSubtype = locChassisIdSubtype;
		locChassisIdSubtype = newLocChassisIdSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_CHASSIS_ID_SUBTYPE, oldLocChassisIdSubtype, locChassisIdSubtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocChassisId() {
		return locChassisId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocChassisId(String newLocChassisId) {
		String oldLocChassisId = locChassisId;
		locChassisId = newLocChassisId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_CHASSIS_ID, oldLocChassisId, locChassisId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocSysName() {
		return locSysName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocSysName(String newLocSysName) {
		String oldLocSysName = locSysName;
		locSysName = newLocSysName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_NAME, oldLocSysName, locSysName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocSysDesc() {
		return locSysDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocSysDesc(String newLocSysDesc) {
		String oldLocSysDesc = locSysDesc;
		locSysDesc = newLocSysDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_DESC, oldLocSysDesc, locSysDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLocSysCapSupported() {
		if (locSysCapSupported == null) {
			locSysCapSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_CAP_SUPPORTED);
		}
		return locSysCapSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getLocSysCapEnabled() {
		if (locSysCapEnabled == null) {
			locSysCapEnabled = new EDataTypeEList<Boolean>(Boolean.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_CAP_ENABLED);
		}
		return locSysCapEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocPortIdSubtype() {
		return locPortIdSubtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocPortIdSubtype(Integer newLocPortIdSubtype) {
		Integer oldLocPortIdSubtype = locPortIdSubtype;
		locPortIdSubtype = newLocPortIdSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_PORT_ID_SUBTYPE, oldLocPortIdSubtype, locPortIdSubtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocPortID() {
		return locPortID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocPortID(String newLocPortID) {
		String oldLocPortID = locPortID;
		locPortID = newLocPortID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_PORT_ID, oldLocPortID, locPortID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocPortDesc() {
		return locPortDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocPortDesc(String newLocPortDesc) {
		String oldLocPortDesc = locPortDesc;
		locPortDesc = newLocPortDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_PORT_DESC, oldLocPortDesc, locPortDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocTxSystemValue() {
		return locTxSystemValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocTxSystemValue(Integer newLocTxSystemValue) {
		Integer oldLocTxSystemValue = locTxSystemValue;
		locTxSystemValue = newLocTxSystemValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_TX_SYSTEM_VALUE, oldLocTxSystemValue, locTxSystemValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemTxSystemValueEcho() {
		return remTxSystemValueEcho;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemTxSystemValueEcho(Integer newRemTxSystemValueEcho) {
		Integer oldRemTxSystemValueEcho = remTxSystemValueEcho;
		remTxSystemValueEcho = newRemTxSystemValueEcho;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_TX_SYSTEM_VALUE_ECHO, oldRemTxSystemValueEcho, remTxSystemValueEcho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocRxSystemValue() {
		return locRxSystemValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocRxSystemValue(Integer newLocRxSystemValue) {
		Integer oldLocRxSystemValue = locRxSystemValue;
		locRxSystemValue = newLocRxSystemValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RX_SYSTEM_VALUE, oldLocRxSystemValue, locRxSystemValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemRxSystemValueEcho() {
		return remRxSystemValueEcho;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemRxSystemValueEcho(Integer newRemRxSystemValueEcho) {
		Integer oldRemRxSystemValueEcho = remRxSystemValueEcho;
		remRxSystemValueEcho = newRemRxSystemValueEcho;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_RX_SYSTEM_VALUE_ECHO, oldRemRxSystemValueEcho, remRxSystemValueEcho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocFbSystemValue() {
		return locFbSystemValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocFbSystemValue(Integer newLocFbSystemValue) {
		Integer oldLocFbSystemValue = locFbSystemValue;
		locFbSystemValue = newLocFbSystemValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_FB_SYSTEM_VALUE, oldLocFbSystemValue, locFbSystemValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemTxSystemValue() {
		return remTxSystemValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemTxSystemValue(Integer newRemTxSystemValue) {
		Integer oldRemTxSystemValue = remTxSystemValue;
		remTxSystemValue = newRemTxSystemValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_TX_SYSTEM_VALUE, oldRemTxSystemValue, remTxSystemValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocTxSystemValueEcho() {
		return locTxSystemValueEcho;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocTxSystemValueEcho(Integer newLocTxSystemValueEcho) {
		Integer oldLocTxSystemValueEcho = locTxSystemValueEcho;
		locTxSystemValueEcho = newLocTxSystemValueEcho;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_TX_SYSTEM_VALUE_ECHO, oldLocTxSystemValueEcho, locTxSystemValueEcho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemRxSystemValue() {
		return remRxSystemValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemRxSystemValue(Integer newRemRxSystemValue) {
		Integer oldRemRxSystemValue = remRxSystemValue;
		remRxSystemValue = newRemRxSystemValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_RX_SYSTEM_VALUE, oldRemRxSystemValue, remRxSystemValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocRxSystemValueEcho() {
		return locRxSystemValueEcho;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocRxSystemValueEcho(Integer newLocRxSystemValueEcho) {
		Integer oldLocRxSystemValueEcho = locRxSystemValueEcho;
		locRxSystemValueEcho = newLocRxSystemValueEcho;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RX_SYSTEM_VALUE_ECHO, oldLocRxSystemValueEcho, locRxSystemValueEcho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocResolvedTxSystemValue() {
		return locResolvedTxSystemValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocResolvedTxSystemValue(Integer newLocResolvedTxSystemValue) {
		Integer oldLocResolvedTxSystemValue = locResolvedTxSystemValue;
		locResolvedTxSystemValue = newLocResolvedTxSystemValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RESOLVED_TX_SYSTEM_VALUE, oldLocResolvedTxSystemValue, locResolvedTxSystemValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocResolvedRxSystemValue() {
		return locResolvedRxSystemValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocResolvedRxSystemValue(Integer newLocResolvedRxSystemValue) {
		Integer oldLocResolvedRxSystemValue = locResolvedRxSystemValue;
		locResolvedRxSystemValue = newLocResolvedRxSystemValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RESOLVED_RX_SYSTEM_VALUE, oldLocResolvedRxSystemValue, locResolvedRxSystemValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMaximumFrameSizeTLVEnabled() {
		return maximumFrameSizeTLVEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumFrameSizeTLVEnabled(Boolean newMaximumFrameSizeTLVEnabled) {
		Boolean oldMaximumFrameSizeTLVEnabled = maximumFrameSizeTLVEnabled;
		maximumFrameSizeTLVEnabled = newMaximumFrameSizeTLVEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LLDP_ETHERNET_PORT__MAXIMUM_FRAME_SIZE_TLV_ENABLED, oldMaximumFrameSizeTLVEnabled, maximumFrameSizeTLVEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLocManAddrSubType() {
		if (locManAddrSubType == null) {
			locManAddrSubType = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR_SUB_TYPE);
		}
		return locManAddrSubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLocManAddr() {
		if (locManAddr == null) {
			locManAddr = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR);
		}
		return locManAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLocManAddrIfSubtype() {
		if (locManAddrIfSubtype == null) {
			locManAddrIfSubtype = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR_IF_SUBTYPE);
		}
		return locManAddrIfSubtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getLocManAddrIfId() {
		if (locManAddrIfId == null) {
			locManAddrIfId = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR_IF_ID);
		}
		return locManAddrIfId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRemLocalDestMacAddress() {
		if (remLocalDestMacAddress == null) {
			remLocalDestMacAddress = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_LOCAL_DEST_MAC_ADDRESS);
		}
		return remLocalDestMacAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRemManAddrSubType() {
		if (remManAddrSubType == null) {
			remManAddrSubType = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR_SUB_TYPE);
		}
		return remManAddrSubType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRemManAddr() {
		if (remManAddr == null) {
			remManAddr = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR);
		}
		return remManAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRemManAddrIfSubtype() {
		if (remManAddrIfSubtype == null) {
			remManAddrIfSubtype = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR_IF_SUBTYPE);
		}
		return remManAddrIfSubtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getRemManAddrIfId() {
		if (remManAddrIfId == null) {
			remManAddrIfId = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR_IF_ID);
		}
		return remManAddrIfId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRemChassisIdSubtype() {
		if (remChassisIdSubtype == null) {
			remChassisIdSubtype = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_CHASSIS_ID_SUBTYPE);
		}
		return remChassisIdSubtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRemChassisId() {
		if (remChassisId == null) {
			remChassisId = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_CHASSIS_ID);
		}
		return remChassisId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRemSysName() {
		if (remSysName == null) {
			remSysName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_NAME);
		}
		return remSysName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRemSysDesc() {
		if (remSysDesc == null) {
			remSysDesc = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_DESC);
		}
		return remSysDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRemSysCapSupported() {
		if (remSysCapSupported == null) {
			remSysCapSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_CAP_SUPPORTED);
		}
		return remSysCapSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getRemSysCapEnabled() {
		if (remSysCapEnabled == null) {
			remSysCapEnabled = new EDataTypeEList<Boolean>(Boolean.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_CAP_ENABLED);
		}
		return remSysCapEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRemPortIdSubtype() {
		if (remPortIdSubtype == null) {
			remPortIdSubtype = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_PORT_ID_SUBTYPE);
		}
		return remPortIdSubtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRemPortID() {
		if (remPortID == null) {
			remPortID = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_PORT_ID);
		}
		return remPortID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRemPortDesc() {
		if (remPortDesc == null) {
			remPortDesc = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LLDP_ETHERNET_PORT__REM_PORT_DESC);
		}
		return remPortDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LLDP_ETHERNET_PORT__CONFIG_PORT_VLAN_TX_ENABLE:
				return getConfigPortVlanTxEnable();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__CONFIG_MAN_VID_TX_ENABLE:
				return getConfigManVidTxEnable();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MESSAGE_TX_INTERVAL:
				return getMessageTxInterval();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MESSAGE_TX_HOLD_MULTIPLIER:
				return getMessageTxHoldMultiplier();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REINIT_DELAY:
				return getReinitDelay();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__NOTIFICATION_INTERVAL:
				return getNotificationInterval();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__TX_CREDIT_MAX:
				return getTxCreditMax();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MESSAGE_FAST_TX:
				return getMessageFastTx();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__TX_FAST_INIT:
				return getTxFastInit();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__DEST_MAC_ADDRESS:
				return getDestMacAddress();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_ADMIN_STATUS:
				return getPortConfigAdminStatus();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_NOTIFICATION_ENABLE:
				return getPortConfigNotificationEnable();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_PORT_DESCRIPTION_TLV_TX_ENABLE:
				return getPortConfigPortDescriptionTLVTxEnable();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_SYSTEM_NAME_TLV_TX_ENABLE:
				return getPortConfigSystemNameTLVTxEnable();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_SYSTEM_DESCRIPTION_TLV_TX_ENABLE:
				return getPortConfigSystemDescriptionTLVTxEnable();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_SYSTEM_CAPABILITIES_TLV_TX_ENABLE:
				return getPortConfigSystemCapabilitiesTLVTxEnable();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_DEST_ADDRESS:
				return getManAddrConfigDestAddress();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_LOC_MAN_ADDR_SUBTYPE:
				return getManAddrConfigLocManAddrSubtype();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_LOC_MAN_ADDR:
				return getManAddrConfigLocManAddr();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_TX_ENABLE:
				return getManAddrConfigTxEnable();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_CHASSIS_ID_SUBTYPE:
				return getLocChassisIdSubtype();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_CHASSIS_ID:
				return getLocChassisId();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_NAME:
				return getLocSysName();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_DESC:
				return getLocSysDesc();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_CAP_SUPPORTED:
				return getLocSysCapSupported();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_CAP_ENABLED:
				return getLocSysCapEnabled();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_PORT_ID_SUBTYPE:
				return getLocPortIdSubtype();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_PORT_ID:
				return getLocPortID();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_PORT_DESC:
				return getLocPortDesc();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_TX_SYSTEM_VALUE:
				return getLocTxSystemValue();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_TX_SYSTEM_VALUE_ECHO:
				return getRemTxSystemValueEcho();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RX_SYSTEM_VALUE:
				return getLocRxSystemValue();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_RX_SYSTEM_VALUE_ECHO:
				return getRemRxSystemValueEcho();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_FB_SYSTEM_VALUE:
				return getLocFbSystemValue();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_TX_SYSTEM_VALUE:
				return getRemTxSystemValue();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_TX_SYSTEM_VALUE_ECHO:
				return getLocTxSystemValueEcho();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_RX_SYSTEM_VALUE:
				return getRemRxSystemValue();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RX_SYSTEM_VALUE_ECHO:
				return getLocRxSystemValueEcho();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RESOLVED_TX_SYSTEM_VALUE:
				return getLocResolvedTxSystemValue();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RESOLVED_RX_SYSTEM_VALUE:
				return getLocResolvedRxSystemValue();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAXIMUM_FRAME_SIZE_TLV_ENABLED:
				return getMaximumFrameSizeTLVEnabled();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR_SUB_TYPE:
				return getLocManAddrSubType();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR:
				return getLocManAddr();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR_IF_SUBTYPE:
				return getLocManAddrIfSubtype();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR_IF_ID:
				return getLocManAddrIfId();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_LOCAL_DEST_MAC_ADDRESS:
				return getRemLocalDestMacAddress();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR_SUB_TYPE:
				return getRemManAddrSubType();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR:
				return getRemManAddr();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR_IF_SUBTYPE:
				return getRemManAddrIfSubtype();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR_IF_ID:
				return getRemManAddrIfId();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_CHASSIS_ID_SUBTYPE:
				return getRemChassisIdSubtype();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_CHASSIS_ID:
				return getRemChassisId();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_NAME:
				return getRemSysName();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_DESC:
				return getRemSysDesc();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_CAP_SUPPORTED:
				return getRemSysCapSupported();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_CAP_ENABLED:
				return getRemSysCapEnabled();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_PORT_ID_SUBTYPE:
				return getRemPortIdSubtype();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_PORT_ID:
				return getRemPortID();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_PORT_DESC:
				return getRemPortDesc();
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
			case CimPackage.CIM_LLDP_ETHERNET_PORT__CONFIG_PORT_VLAN_TX_ENABLE:
				setConfigPortVlanTxEnable((Boolean)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__CONFIG_MAN_VID_TX_ENABLE:
				setConfigManVidTxEnable((Boolean)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MESSAGE_TX_INTERVAL:
				setMessageTxInterval((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MESSAGE_TX_HOLD_MULTIPLIER:
				setMessageTxHoldMultiplier((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REINIT_DELAY:
				setReinitDelay((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__NOTIFICATION_INTERVAL:
				setNotificationInterval((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__TX_CREDIT_MAX:
				setTxCreditMax((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MESSAGE_FAST_TX:
				setMessageFastTx((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__TX_FAST_INIT:
				setTxFastInit((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__DEST_MAC_ADDRESS:
				getDestMacAddress().clear();
				getDestMacAddress().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_ADMIN_STATUS:
				getPortConfigAdminStatus().clear();
				getPortConfigAdminStatus().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_NOTIFICATION_ENABLE:
				getPortConfigNotificationEnable().clear();
				getPortConfigNotificationEnable().addAll((Collection<? extends Boolean>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_PORT_DESCRIPTION_TLV_TX_ENABLE:
				getPortConfigPortDescriptionTLVTxEnable().clear();
				getPortConfigPortDescriptionTLVTxEnable().addAll((Collection<? extends Boolean>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_SYSTEM_NAME_TLV_TX_ENABLE:
				getPortConfigSystemNameTLVTxEnable().clear();
				getPortConfigSystemNameTLVTxEnable().addAll((Collection<? extends Boolean>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_SYSTEM_DESCRIPTION_TLV_TX_ENABLE:
				getPortConfigSystemDescriptionTLVTxEnable().clear();
				getPortConfigSystemDescriptionTLVTxEnable().addAll((Collection<? extends Boolean>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_SYSTEM_CAPABILITIES_TLV_TX_ENABLE:
				getPortConfigSystemCapabilitiesTLVTxEnable().clear();
				getPortConfigSystemCapabilitiesTLVTxEnable().addAll((Collection<? extends Boolean>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_DEST_ADDRESS:
				getManAddrConfigDestAddress().clear();
				getManAddrConfigDestAddress().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_LOC_MAN_ADDR_SUBTYPE:
				getManAddrConfigLocManAddrSubtype().clear();
				getManAddrConfigLocManAddrSubtype().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_LOC_MAN_ADDR:
				getManAddrConfigLocManAddr().clear();
				getManAddrConfigLocManAddr().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_TX_ENABLE:
				getManAddrConfigTxEnable().clear();
				getManAddrConfigTxEnable().addAll((Collection<? extends Boolean>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_CHASSIS_ID_SUBTYPE:
				setLocChassisIdSubtype((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_CHASSIS_ID:
				setLocChassisId((String)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_NAME:
				setLocSysName((String)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_DESC:
				setLocSysDesc((String)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_CAP_SUPPORTED:
				getLocSysCapSupported().clear();
				getLocSysCapSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_CAP_ENABLED:
				getLocSysCapEnabled().clear();
				getLocSysCapEnabled().addAll((Collection<? extends Boolean>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_PORT_ID_SUBTYPE:
				setLocPortIdSubtype((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_PORT_ID:
				setLocPortID((String)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_PORT_DESC:
				setLocPortDesc((String)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_TX_SYSTEM_VALUE:
				setLocTxSystemValue((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_TX_SYSTEM_VALUE_ECHO:
				setRemTxSystemValueEcho((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RX_SYSTEM_VALUE:
				setLocRxSystemValue((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_RX_SYSTEM_VALUE_ECHO:
				setRemRxSystemValueEcho((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_FB_SYSTEM_VALUE:
				setLocFbSystemValue((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_TX_SYSTEM_VALUE:
				setRemTxSystemValue((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_TX_SYSTEM_VALUE_ECHO:
				setLocTxSystemValueEcho((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_RX_SYSTEM_VALUE:
				setRemRxSystemValue((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RX_SYSTEM_VALUE_ECHO:
				setLocRxSystemValueEcho((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RESOLVED_TX_SYSTEM_VALUE:
				setLocResolvedTxSystemValue((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RESOLVED_RX_SYSTEM_VALUE:
				setLocResolvedRxSystemValue((Integer)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAXIMUM_FRAME_SIZE_TLV_ENABLED:
				setMaximumFrameSizeTLVEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR_SUB_TYPE:
				getLocManAddrSubType().clear();
				getLocManAddrSubType().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR:
				getLocManAddr().clear();
				getLocManAddr().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR_IF_SUBTYPE:
				getLocManAddrIfSubtype().clear();
				getLocManAddrIfSubtype().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR_IF_ID:
				getLocManAddrIfId().clear();
				getLocManAddrIfId().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_LOCAL_DEST_MAC_ADDRESS:
				getRemLocalDestMacAddress().clear();
				getRemLocalDestMacAddress().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR_SUB_TYPE:
				getRemManAddrSubType().clear();
				getRemManAddrSubType().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR:
				getRemManAddr().clear();
				getRemManAddr().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR_IF_SUBTYPE:
				getRemManAddrIfSubtype().clear();
				getRemManAddrIfSubtype().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR_IF_ID:
				getRemManAddrIfId().clear();
				getRemManAddrIfId().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_CHASSIS_ID_SUBTYPE:
				getRemChassisIdSubtype().clear();
				getRemChassisIdSubtype().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_CHASSIS_ID:
				getRemChassisId().clear();
				getRemChassisId().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_NAME:
				getRemSysName().clear();
				getRemSysName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_DESC:
				getRemSysDesc().clear();
				getRemSysDesc().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_CAP_SUPPORTED:
				getRemSysCapSupported().clear();
				getRemSysCapSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_CAP_ENABLED:
				getRemSysCapEnabled().clear();
				getRemSysCapEnabled().addAll((Collection<? extends Boolean>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_PORT_ID_SUBTYPE:
				getRemPortIdSubtype().clear();
				getRemPortIdSubtype().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_PORT_ID:
				getRemPortID().clear();
				getRemPortID().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_PORT_DESC:
				getRemPortDesc().clear();
				getRemPortDesc().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_LLDP_ETHERNET_PORT__CONFIG_PORT_VLAN_TX_ENABLE:
				setConfigPortVlanTxEnable(CONFIG_PORT_VLAN_TX_ENABLE_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__CONFIG_MAN_VID_TX_ENABLE:
				setConfigManVidTxEnable(CONFIG_MAN_VID_TX_ENABLE_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MESSAGE_TX_INTERVAL:
				setMessageTxInterval(MESSAGE_TX_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MESSAGE_TX_HOLD_MULTIPLIER:
				setMessageTxHoldMultiplier(MESSAGE_TX_HOLD_MULTIPLIER_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REINIT_DELAY:
				setReinitDelay(REINIT_DELAY_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__NOTIFICATION_INTERVAL:
				setNotificationInterval(NOTIFICATION_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__TX_CREDIT_MAX:
				setTxCreditMax(TX_CREDIT_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MESSAGE_FAST_TX:
				setMessageFastTx(MESSAGE_FAST_TX_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__TX_FAST_INIT:
				setTxFastInit(TX_FAST_INIT_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__DEST_MAC_ADDRESS:
				getDestMacAddress().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_ADMIN_STATUS:
				getPortConfigAdminStatus().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_NOTIFICATION_ENABLE:
				getPortConfigNotificationEnable().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_PORT_DESCRIPTION_TLV_TX_ENABLE:
				getPortConfigPortDescriptionTLVTxEnable().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_SYSTEM_NAME_TLV_TX_ENABLE:
				getPortConfigSystemNameTLVTxEnable().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_SYSTEM_DESCRIPTION_TLV_TX_ENABLE:
				getPortConfigSystemDescriptionTLVTxEnable().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_SYSTEM_CAPABILITIES_TLV_TX_ENABLE:
				getPortConfigSystemCapabilitiesTLVTxEnable().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_DEST_ADDRESS:
				getManAddrConfigDestAddress().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_LOC_MAN_ADDR_SUBTYPE:
				getManAddrConfigLocManAddrSubtype().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_LOC_MAN_ADDR:
				getManAddrConfigLocManAddr().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_TX_ENABLE:
				getManAddrConfigTxEnable().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_CHASSIS_ID_SUBTYPE:
				setLocChassisIdSubtype(LOC_CHASSIS_ID_SUBTYPE_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_CHASSIS_ID:
				setLocChassisId(LOC_CHASSIS_ID_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_NAME:
				setLocSysName(LOC_SYS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_DESC:
				setLocSysDesc(LOC_SYS_DESC_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_CAP_SUPPORTED:
				getLocSysCapSupported().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_CAP_ENABLED:
				getLocSysCapEnabled().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_PORT_ID_SUBTYPE:
				setLocPortIdSubtype(LOC_PORT_ID_SUBTYPE_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_PORT_ID:
				setLocPortID(LOC_PORT_ID_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_PORT_DESC:
				setLocPortDesc(LOC_PORT_DESC_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_TX_SYSTEM_VALUE:
				setLocTxSystemValue(LOC_TX_SYSTEM_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_TX_SYSTEM_VALUE_ECHO:
				setRemTxSystemValueEcho(REM_TX_SYSTEM_VALUE_ECHO_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RX_SYSTEM_VALUE:
				setLocRxSystemValue(LOC_RX_SYSTEM_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_RX_SYSTEM_VALUE_ECHO:
				setRemRxSystemValueEcho(REM_RX_SYSTEM_VALUE_ECHO_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_FB_SYSTEM_VALUE:
				setLocFbSystemValue(LOC_FB_SYSTEM_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_TX_SYSTEM_VALUE:
				setRemTxSystemValue(REM_TX_SYSTEM_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_TX_SYSTEM_VALUE_ECHO:
				setLocTxSystemValueEcho(LOC_TX_SYSTEM_VALUE_ECHO_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_RX_SYSTEM_VALUE:
				setRemRxSystemValue(REM_RX_SYSTEM_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RX_SYSTEM_VALUE_ECHO:
				setLocRxSystemValueEcho(LOC_RX_SYSTEM_VALUE_ECHO_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RESOLVED_TX_SYSTEM_VALUE:
				setLocResolvedTxSystemValue(LOC_RESOLVED_TX_SYSTEM_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RESOLVED_RX_SYSTEM_VALUE:
				setLocResolvedRxSystemValue(LOC_RESOLVED_RX_SYSTEM_VALUE_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAXIMUM_FRAME_SIZE_TLV_ENABLED:
				setMaximumFrameSizeTLVEnabled(MAXIMUM_FRAME_SIZE_TLV_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR_SUB_TYPE:
				getLocManAddrSubType().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR:
				getLocManAddr().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR_IF_SUBTYPE:
				getLocManAddrIfSubtype().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR_IF_ID:
				getLocManAddrIfId().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_LOCAL_DEST_MAC_ADDRESS:
				getRemLocalDestMacAddress().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR_SUB_TYPE:
				getRemManAddrSubType().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR:
				getRemManAddr().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR_IF_SUBTYPE:
				getRemManAddrIfSubtype().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR_IF_ID:
				getRemManAddrIfId().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_CHASSIS_ID_SUBTYPE:
				getRemChassisIdSubtype().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_CHASSIS_ID:
				getRemChassisId().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_NAME:
				getRemSysName().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_DESC:
				getRemSysDesc().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_CAP_SUPPORTED:
				getRemSysCapSupported().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_CAP_ENABLED:
				getRemSysCapEnabled().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_PORT_ID_SUBTYPE:
				getRemPortIdSubtype().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_PORT_ID:
				getRemPortID().clear();
				return;
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_PORT_DESC:
				getRemPortDesc().clear();
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
			case CimPackage.CIM_LLDP_ETHERNET_PORT__CONFIG_PORT_VLAN_TX_ENABLE:
				return CONFIG_PORT_VLAN_TX_ENABLE_EDEFAULT == null ? configPortVlanTxEnable != null : !CONFIG_PORT_VLAN_TX_ENABLE_EDEFAULT.equals(configPortVlanTxEnable);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__CONFIG_MAN_VID_TX_ENABLE:
				return CONFIG_MAN_VID_TX_ENABLE_EDEFAULT == null ? configManVidTxEnable != null : !CONFIG_MAN_VID_TX_ENABLE_EDEFAULT.equals(configManVidTxEnable);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MESSAGE_TX_INTERVAL:
				return MESSAGE_TX_INTERVAL_EDEFAULT == null ? messageTxInterval != null : !MESSAGE_TX_INTERVAL_EDEFAULT.equals(messageTxInterval);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MESSAGE_TX_HOLD_MULTIPLIER:
				return MESSAGE_TX_HOLD_MULTIPLIER_EDEFAULT == null ? messageTxHoldMultiplier != null : !MESSAGE_TX_HOLD_MULTIPLIER_EDEFAULT.equals(messageTxHoldMultiplier);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REINIT_DELAY:
				return REINIT_DELAY_EDEFAULT == null ? reinitDelay != null : !REINIT_DELAY_EDEFAULT.equals(reinitDelay);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__NOTIFICATION_INTERVAL:
				return NOTIFICATION_INTERVAL_EDEFAULT == null ? notificationInterval != null : !NOTIFICATION_INTERVAL_EDEFAULT.equals(notificationInterval);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__TX_CREDIT_MAX:
				return TX_CREDIT_MAX_EDEFAULT == null ? txCreditMax != null : !TX_CREDIT_MAX_EDEFAULT.equals(txCreditMax);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MESSAGE_FAST_TX:
				return MESSAGE_FAST_TX_EDEFAULT == null ? messageFastTx != null : !MESSAGE_FAST_TX_EDEFAULT.equals(messageFastTx);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__TX_FAST_INIT:
				return TX_FAST_INIT_EDEFAULT == null ? txFastInit != null : !TX_FAST_INIT_EDEFAULT.equals(txFastInit);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__DEST_MAC_ADDRESS:
				return destMacAddress != null && !destMacAddress.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_ADMIN_STATUS:
				return portConfigAdminStatus != null && !portConfigAdminStatus.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_NOTIFICATION_ENABLE:
				return portConfigNotificationEnable != null && !portConfigNotificationEnable.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_PORT_DESCRIPTION_TLV_TX_ENABLE:
				return portConfigPortDescriptionTLVTxEnable != null && !portConfigPortDescriptionTLVTxEnable.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_SYSTEM_NAME_TLV_TX_ENABLE:
				return portConfigSystemNameTLVTxEnable != null && !portConfigSystemNameTLVTxEnable.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_SYSTEM_DESCRIPTION_TLV_TX_ENABLE:
				return portConfigSystemDescriptionTLVTxEnable != null && !portConfigSystemDescriptionTLVTxEnable.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__PORT_CONFIG_SYSTEM_CAPABILITIES_TLV_TX_ENABLE:
				return portConfigSystemCapabilitiesTLVTxEnable != null && !portConfigSystemCapabilitiesTLVTxEnable.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_DEST_ADDRESS:
				return manAddrConfigDestAddress != null && !manAddrConfigDestAddress.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_LOC_MAN_ADDR_SUBTYPE:
				return manAddrConfigLocManAddrSubtype != null && !manAddrConfigLocManAddrSubtype.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_LOC_MAN_ADDR:
				return manAddrConfigLocManAddr != null && !manAddrConfigLocManAddr.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAN_ADDR_CONFIG_TX_ENABLE:
				return manAddrConfigTxEnable != null && !manAddrConfigTxEnable.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_CHASSIS_ID_SUBTYPE:
				return LOC_CHASSIS_ID_SUBTYPE_EDEFAULT == null ? locChassisIdSubtype != null : !LOC_CHASSIS_ID_SUBTYPE_EDEFAULT.equals(locChassisIdSubtype);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_CHASSIS_ID:
				return LOC_CHASSIS_ID_EDEFAULT == null ? locChassisId != null : !LOC_CHASSIS_ID_EDEFAULT.equals(locChassisId);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_NAME:
				return LOC_SYS_NAME_EDEFAULT == null ? locSysName != null : !LOC_SYS_NAME_EDEFAULT.equals(locSysName);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_DESC:
				return LOC_SYS_DESC_EDEFAULT == null ? locSysDesc != null : !LOC_SYS_DESC_EDEFAULT.equals(locSysDesc);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_CAP_SUPPORTED:
				return locSysCapSupported != null && !locSysCapSupported.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_SYS_CAP_ENABLED:
				return locSysCapEnabled != null && !locSysCapEnabled.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_PORT_ID_SUBTYPE:
				return LOC_PORT_ID_SUBTYPE_EDEFAULT == null ? locPortIdSubtype != null : !LOC_PORT_ID_SUBTYPE_EDEFAULT.equals(locPortIdSubtype);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_PORT_ID:
				return LOC_PORT_ID_EDEFAULT == null ? locPortID != null : !LOC_PORT_ID_EDEFAULT.equals(locPortID);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_PORT_DESC:
				return LOC_PORT_DESC_EDEFAULT == null ? locPortDesc != null : !LOC_PORT_DESC_EDEFAULT.equals(locPortDesc);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_TX_SYSTEM_VALUE:
				return LOC_TX_SYSTEM_VALUE_EDEFAULT == null ? locTxSystemValue != null : !LOC_TX_SYSTEM_VALUE_EDEFAULT.equals(locTxSystemValue);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_TX_SYSTEM_VALUE_ECHO:
				return REM_TX_SYSTEM_VALUE_ECHO_EDEFAULT == null ? remTxSystemValueEcho != null : !REM_TX_SYSTEM_VALUE_ECHO_EDEFAULT.equals(remTxSystemValueEcho);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RX_SYSTEM_VALUE:
				return LOC_RX_SYSTEM_VALUE_EDEFAULT == null ? locRxSystemValue != null : !LOC_RX_SYSTEM_VALUE_EDEFAULT.equals(locRxSystemValue);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_RX_SYSTEM_VALUE_ECHO:
				return REM_RX_SYSTEM_VALUE_ECHO_EDEFAULT == null ? remRxSystemValueEcho != null : !REM_RX_SYSTEM_VALUE_ECHO_EDEFAULT.equals(remRxSystemValueEcho);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_FB_SYSTEM_VALUE:
				return LOC_FB_SYSTEM_VALUE_EDEFAULT == null ? locFbSystemValue != null : !LOC_FB_SYSTEM_VALUE_EDEFAULT.equals(locFbSystemValue);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_TX_SYSTEM_VALUE:
				return REM_TX_SYSTEM_VALUE_EDEFAULT == null ? remTxSystemValue != null : !REM_TX_SYSTEM_VALUE_EDEFAULT.equals(remTxSystemValue);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_TX_SYSTEM_VALUE_ECHO:
				return LOC_TX_SYSTEM_VALUE_ECHO_EDEFAULT == null ? locTxSystemValueEcho != null : !LOC_TX_SYSTEM_VALUE_ECHO_EDEFAULT.equals(locTxSystemValueEcho);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_RX_SYSTEM_VALUE:
				return REM_RX_SYSTEM_VALUE_EDEFAULT == null ? remRxSystemValue != null : !REM_RX_SYSTEM_VALUE_EDEFAULT.equals(remRxSystemValue);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RX_SYSTEM_VALUE_ECHO:
				return LOC_RX_SYSTEM_VALUE_ECHO_EDEFAULT == null ? locRxSystemValueEcho != null : !LOC_RX_SYSTEM_VALUE_ECHO_EDEFAULT.equals(locRxSystemValueEcho);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RESOLVED_TX_SYSTEM_VALUE:
				return LOC_RESOLVED_TX_SYSTEM_VALUE_EDEFAULT == null ? locResolvedTxSystemValue != null : !LOC_RESOLVED_TX_SYSTEM_VALUE_EDEFAULT.equals(locResolvedTxSystemValue);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_RESOLVED_RX_SYSTEM_VALUE:
				return LOC_RESOLVED_RX_SYSTEM_VALUE_EDEFAULT == null ? locResolvedRxSystemValue != null : !LOC_RESOLVED_RX_SYSTEM_VALUE_EDEFAULT.equals(locResolvedRxSystemValue);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__MAXIMUM_FRAME_SIZE_TLV_ENABLED:
				return MAXIMUM_FRAME_SIZE_TLV_ENABLED_EDEFAULT == null ? maximumFrameSizeTLVEnabled != null : !MAXIMUM_FRAME_SIZE_TLV_ENABLED_EDEFAULT.equals(maximumFrameSizeTLVEnabled);
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR_SUB_TYPE:
				return locManAddrSubType != null && !locManAddrSubType.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR:
				return locManAddr != null && !locManAddr.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR_IF_SUBTYPE:
				return locManAddrIfSubtype != null && !locManAddrIfSubtype.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__LOC_MAN_ADDR_IF_ID:
				return locManAddrIfId != null && !locManAddrIfId.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_LOCAL_DEST_MAC_ADDRESS:
				return remLocalDestMacAddress != null && !remLocalDestMacAddress.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR_SUB_TYPE:
				return remManAddrSubType != null && !remManAddrSubType.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR:
				return remManAddr != null && !remManAddr.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR_IF_SUBTYPE:
				return remManAddrIfSubtype != null && !remManAddrIfSubtype.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_MAN_ADDR_IF_ID:
				return remManAddrIfId != null && !remManAddrIfId.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_CHASSIS_ID_SUBTYPE:
				return remChassisIdSubtype != null && !remChassisIdSubtype.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_CHASSIS_ID:
				return remChassisId != null && !remChassisId.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_NAME:
				return remSysName != null && !remSysName.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_DESC:
				return remSysDesc != null && !remSysDesc.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_CAP_SUPPORTED:
				return remSysCapSupported != null && !remSysCapSupported.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_SYS_CAP_ENABLED:
				return remSysCapEnabled != null && !remSysCapEnabled.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_PORT_ID_SUBTYPE:
				return remPortIdSubtype != null && !remPortIdSubtype.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_PORT_ID:
				return remPortID != null && !remPortID.isEmpty();
			case CimPackage.CIM_LLDP_ETHERNET_PORT__REM_PORT_DESC:
				return remPortDesc != null && !remPortDesc.isEmpty();
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
		result.append(" (ConfigPortVlanTxEnable: ");
		result.append(configPortVlanTxEnable);
		result.append(", ConfigManVidTxEnable: ");
		result.append(configManVidTxEnable);
		result.append(", MessageTxInterval: ");
		result.append(messageTxInterval);
		result.append(", MessageTxHoldMultiplier: ");
		result.append(messageTxHoldMultiplier);
		result.append(", ReinitDelay: ");
		result.append(reinitDelay);
		result.append(", NotificationInterval: ");
		result.append(notificationInterval);
		result.append(", TxCreditMax: ");
		result.append(txCreditMax);
		result.append(", MessageFastTx: ");
		result.append(messageFastTx);
		result.append(", TxFastInit: ");
		result.append(txFastInit);
		result.append(", DestMacAddress: ");
		result.append(destMacAddress);
		result.append(", PortConfigAdminStatus: ");
		result.append(portConfigAdminStatus);
		result.append(", PortConfigNotificationEnable: ");
		result.append(portConfigNotificationEnable);
		result.append(", PortConfigPortDescriptionTLVTxEnable: ");
		result.append(portConfigPortDescriptionTLVTxEnable);
		result.append(", PortConfigSystemNameTLVTxEnable: ");
		result.append(portConfigSystemNameTLVTxEnable);
		result.append(", PortConfigSystemDescriptionTLVTxEnable: ");
		result.append(portConfigSystemDescriptionTLVTxEnable);
		result.append(", PortConfigSystemCapabilitiesTLVTxEnable: ");
		result.append(portConfigSystemCapabilitiesTLVTxEnable);
		result.append(", ManAddrConfigDestAddress: ");
		result.append(manAddrConfigDestAddress);
		result.append(", ManAddrConfigLocManAddrSubtype: ");
		result.append(manAddrConfigLocManAddrSubtype);
		result.append(", ManAddrConfigLocManAddr: ");
		result.append(manAddrConfigLocManAddr);
		result.append(", ManAddrConfigTxEnable: ");
		result.append(manAddrConfigTxEnable);
		result.append(", LocChassisIdSubtype: ");
		result.append(locChassisIdSubtype);
		result.append(", LocChassisId: ");
		result.append(locChassisId);
		result.append(", LocSysName: ");
		result.append(locSysName);
		result.append(", LocSysDesc: ");
		result.append(locSysDesc);
		result.append(", LocSysCapSupported: ");
		result.append(locSysCapSupported);
		result.append(", LocSysCapEnabled: ");
		result.append(locSysCapEnabled);
		result.append(", LocPortIdSubtype: ");
		result.append(locPortIdSubtype);
		result.append(", LocPortID: ");
		result.append(locPortID);
		result.append(", LocPortDesc: ");
		result.append(locPortDesc);
		result.append(", LocTxSystemValue: ");
		result.append(locTxSystemValue);
		result.append(", RemTxSystemValueEcho: ");
		result.append(remTxSystemValueEcho);
		result.append(", LocRxSystemValue: ");
		result.append(locRxSystemValue);
		result.append(", RemRxSystemValueEcho: ");
		result.append(remRxSystemValueEcho);
		result.append(", LocFbSystemValue: ");
		result.append(locFbSystemValue);
		result.append(", RemTxSystemValue: ");
		result.append(remTxSystemValue);
		result.append(", LocTxSystemValueEcho: ");
		result.append(locTxSystemValueEcho);
		result.append(", RemRxSystemValue: ");
		result.append(remRxSystemValue);
		result.append(", LocRxSystemValueEcho: ");
		result.append(locRxSystemValueEcho);
		result.append(", LocResolvedTxSystemValue: ");
		result.append(locResolvedTxSystemValue);
		result.append(", LocResolvedRxSystemValue: ");
		result.append(locResolvedRxSystemValue);
		result.append(", MaximumFrameSizeTLVEnabled: ");
		result.append(maximumFrameSizeTLVEnabled);
		result.append(", LocManAddrSubType: ");
		result.append(locManAddrSubType);
		result.append(", LocManAddr: ");
		result.append(locManAddr);
		result.append(", LocManAddrIfSubtype: ");
		result.append(locManAddrIfSubtype);
		result.append(", LocManAddrIfId: ");
		result.append(locManAddrIfId);
		result.append(", RemLocalDestMacAddress: ");
		result.append(remLocalDestMacAddress);
		result.append(", RemManAddrSubType: ");
		result.append(remManAddrSubType);
		result.append(", RemManAddr: ");
		result.append(remManAddr);
		result.append(", RemManAddrIfSubtype: ");
		result.append(remManAddrIfSubtype);
		result.append(", RemManAddrIfId: ");
		result.append(remManAddrIfId);
		result.append(", RemChassisIdSubtype: ");
		result.append(remChassisIdSubtype);
		result.append(", RemChassisId: ");
		result.append(remChassisId);
		result.append(", RemSysName: ");
		result.append(remSysName);
		result.append(", RemSysDesc: ");
		result.append(remSysDesc);
		result.append(", RemSysCapSupported: ");
		result.append(remSysCapSupported);
		result.append(", RemSysCapEnabled: ");
		result.append(remSysCapEnabled);
		result.append(", RemPortIdSubtype: ");
		result.append(remPortIdSubtype);
		result.append(", RemPortID: ");
		result.append(remPortID);
		result.append(", RemPortDesc: ");
		result.append(remPortDesc);
		result.append(')');
		return result.toString();
	}

} //CIM_LLDPEthernetPortImpl

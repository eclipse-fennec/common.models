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
 * A representation of the model object '<em><b>CIM LLDP Ethernet Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class describes the current LLDP configuration of an LLDP capable ethernet port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getConfigPortVlanTxEnable <em>Config Port Vlan Tx Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getConfigManVidTxEnable <em>Config Man Vid Tx Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getMessageTxInterval <em>Message Tx Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getMessageTxHoldMultiplier <em>Message Tx Hold Multiplier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getReinitDelay <em>Reinit Delay</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getNotificationInterval <em>Notification Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getTxCreditMax <em>Tx Credit Max</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getMessageFastTx <em>Message Fast Tx</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getTxFastInit <em>Tx Fast Init</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getDestMacAddress <em>Dest Mac Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getPortConfigAdminStatus <em>Port Config Admin Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getPortConfigNotificationEnable <em>Port Config Notification Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getPortConfigPortDescriptionTLVTxEnable <em>Port Config Port Description TLV Tx Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getPortConfigSystemNameTLVTxEnable <em>Port Config System Name TLV Tx Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getPortConfigSystemDescriptionTLVTxEnable <em>Port Config System Description TLV Tx Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getPortConfigSystemCapabilitiesTLVTxEnable <em>Port Config System Capabilities TLV Tx Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getManAddrConfigDestAddress <em>Man Addr Config Dest Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getManAddrConfigLocManAddrSubtype <em>Man Addr Config Loc Man Addr Subtype</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getManAddrConfigLocManAddr <em>Man Addr Config Loc Man Addr</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getManAddrConfigTxEnable <em>Man Addr Config Tx Enable</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocChassisIdSubtype <em>Loc Chassis Id Subtype</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocChassisId <em>Loc Chassis Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocSysName <em>Loc Sys Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocSysDesc <em>Loc Sys Desc</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocSysCapSupported <em>Loc Sys Cap Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocSysCapEnabled <em>Loc Sys Cap Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocPortIdSubtype <em>Loc Port Id Subtype</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocPortID <em>Loc Port ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocPortDesc <em>Loc Port Desc</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocTxSystemValue <em>Loc Tx System Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemTxSystemValueEcho <em>Rem Tx System Value Echo</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocRxSystemValue <em>Loc Rx System Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemRxSystemValueEcho <em>Rem Rx System Value Echo</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocFbSystemValue <em>Loc Fb System Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemTxSystemValue <em>Rem Tx System Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocTxSystemValueEcho <em>Loc Tx System Value Echo</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemRxSystemValue <em>Rem Rx System Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocRxSystemValueEcho <em>Loc Rx System Value Echo</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocResolvedTxSystemValue <em>Loc Resolved Tx System Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocResolvedRxSystemValue <em>Loc Resolved Rx System Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getMaximumFrameSizeTLVEnabled <em>Maximum Frame Size TLV Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocManAddrSubType <em>Loc Man Addr Sub Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocManAddr <em>Loc Man Addr</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocManAddrIfSubtype <em>Loc Man Addr If Subtype</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocManAddrIfId <em>Loc Man Addr If Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemLocalDestMacAddress <em>Rem Local Dest Mac Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemManAddrSubType <em>Rem Man Addr Sub Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemManAddr <em>Rem Man Addr</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemManAddrIfSubtype <em>Rem Man Addr If Subtype</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemManAddrIfId <em>Rem Man Addr If Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemChassisIdSubtype <em>Rem Chassis Id Subtype</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemChassisId <em>Rem Chassis Id</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemSysName <em>Rem Sys Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemSysDesc <em>Rem Sys Desc</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemSysCapSupported <em>Rem Sys Cap Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemSysCapEnabled <em>Rem Sys Cap Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemPortIdSubtype <em>Rem Port Id Subtype</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemPortID <em>Rem Port ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemPortDesc <em>Rem Port Desc</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.34.0' UMLPackagePath='CIM::Device::Ports' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_LLDPEthernetPort extends CIM_EthernetPort {
	/**
	 * Returns the value of the '<em><b>Config Port Vlan Tx Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This flag determines whether the IEEE 802.1 organizationally defined port VLAN TLV transmission is allowed on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Config Port Vlan Tx Enable</em>' attribute.
	 * @see #setConfigPortVlanTxEnable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_ConfigPortVlanTxEnable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2Xdot1ConfigPortVlanTxEnable\"]'"
	 * @generated
	 */
	Boolean getConfigPortVlanTxEnable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getConfigPortVlanTxEnable <em>Config Port Vlan Tx Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Port Vlan Tx Enable</em>' attribute.
	 * @see #getConfigPortVlanTxEnable()
	 * @generated
	 */
	void setConfigPortVlanTxEnable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Config Man Vid Tx Enable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This flag determines determines whether the IEEE 802.1 organizationally defined Management VID TLV transmission is allowed on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Config Man Vid Tx Enable</em>' attribute.
	 * @see #setConfigManVidTxEnable(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_ConfigManVidTxEnable()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2Xdot1ConfigManVidTxEnable\"]'"
	 * @generated
	 */
	Boolean getConfigManVidTxEnable();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getConfigManVidTxEnable <em>Config Man Vid Tx Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Man Vid Tx Enable</em>' attribute.
	 * @see #getConfigManVidTxEnable()
	 * @generated
	 */
	void setConfigManVidTxEnable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Message Tx Interval</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interval at which LLDP frames are transmitted on behalf of this LLDP agent on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Tx Interval</em>' attribute.
	 * @see #setMessageTxInterval(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_MessageTxInterval()
	 * @model default="30"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='1' MaxValue='3600' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2MessageTxInterval\"]' PUnit='second'"
	 * @generated
	 */
	Integer getMessageTxInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getMessageTxInterval <em>Message Tx Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Tx Interval</em>' attribute.
	 * @see #getMessageTxInterval()
	 * @generated
	 */
	void setMessageTxInterval(Integer value);

	/**
	 * Returns the value of the '<em><b>Message Tx Hold Multiplier</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this property is used, as a multiplier of MessageTxInterval, to determine the value of txTTL that is carried in LLDP frames transmitted by the LLDP agent on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Tx Hold Multiplier</em>' attribute.
	 * @see #setMessageTxHoldMultiplier(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_MessageTxHoldMultiplier()
	 * @model default="4"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MinValue='2' MaxValue='100' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2MessageTxHoldMultiplier\"]' PUnit='second'"
	 * @generated
	 */
	Integer getMessageTxHoldMultiplier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getMessageTxHoldMultiplier <em>Message Tx Hold Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Tx Hold Multiplier</em>' attribute.
	 * @see #getMessageTxHoldMultiplier()
	 * @generated
	 */
	void setMessageTxHoldMultiplier(Integer value);

	/**
	 * Returns the value of the '<em><b>Reinit Delay</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this property indicates the amount of delay from when adminStatus becomes disabled until reinitialization is attempted on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reinit Delay</em>' attribute.
	 * @see #setReinitDelay(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_ReinitDelay()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MinValue='1' MaxValue='10' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2ReinitDelay\"]' PUnit='second'"
	 * @generated
	 */
	Integer getReinitDelay();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getReinitDelay <em>Reinit Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reinit Delay</em>' attribute.
	 * @see #getReinitDelay()
	 * @generated
	 */
	void setReinitDelay(Integer value);

	/**
	 * Returns the value of the '<em><b>Notification Interval</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of this property indicates the interval between transmission of LLDP notifications during normal transmission periods on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notification Interval</em>' attribute.
	 * @see #setNotificationInterval(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_NotificationInterval()
	 * @model default="30"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='5' MaxValue='3600' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2NotificationInterval\"]' PUnit='second'"
	 * @generated
	 */
	Integer getNotificationInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getNotificationInterval <em>Notification Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Interval</em>' attribute.
	 * @see #getNotificationInterval()
	 * @generated
	 */
	void setNotificationInterval(Integer value);

	/**
	 * Returns the value of the '<em><b>Tx Credit Max</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of consecutive LLDPDUs that can be transmitted at any time on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tx Credit Max</em>' attribute.
	 * @see #setTxCreditMax(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_TxCreditMax()
	 * @model default="5"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MinValue='1' MaxValue='100' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2TxCreditMax\"]'"
	 * @generated
	 */
	Integer getTxCreditMax();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getTxCreditMax <em>Tx Credit Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx Credit Max</em>' attribute.
	 * @see #getTxCreditMax()
	 * @generated
	 */
	void setTxCreditMax(Integer value);

	/**
	 * Returns the value of the '<em><b>Message Fast Tx</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The interval at which LLDP frames are transmitted on behalf of this LLDP agent during fast transmission period (e.g. when a new neighbor is detected) on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Fast Tx</em>' attribute.
	 * @see #setMessageFastTx(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_MessageFastTx()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MinValue='1' MaxValue='3600' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2MessageFastTx\"]' PUnit='second'"
	 * @generated
	 */
	Integer getMessageFastTx();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getMessageFastTx <em>Message Fast Tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Fast Tx</em>' attribute.
	 * @see #getMessageFastTx()
	 * @generated
	 */
	void setMessageFastTx(Integer value);

	/**
	 * Returns the value of the '<em><b>Tx Fast Init</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The initial value used to initialize the variable which determines the number of transmissions that are made in fast transmission mode on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tx Fast Init</em>' attribute.
	 * @see #setTxFastInit(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_TxFastInit()
	 * @model default="4"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MinValue='1' MaxValue='8' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2TxFastInit\"]'"
	 * @generated
	 */
	Integer getTxFastInit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getTxFastInit <em>Tx Fast Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx Fast Init</em>' attribute.
	 * @see #getTxFastInit()
	 * @generated
	 */
	void setTxFastInit(Integer value);

	/**
	 * Returns the value of the '<em><b>Dest Mac Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This array identifies individual or group MAC addresses that are in use by LLDP as destination MAC addresses on this port. Each MAC address is formatted as twelve hexadecimal digits (for example, "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Therefore, the Group address bit is found in the low order bit of the first character of the string.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dest Mac Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_DestMacAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2DestMacAddress\"]'"
	 * @generated
	 */
	EList<String> getDestMacAddress();

	/**
	 * Returns the value of the '<em><b>Port Config Admin Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The administratively desired status of the local LLDP agent on this port.
	 * "txOnly" indicates that the LLDP agent transmits LLDPframes on this port and it does not store any information about the remote systems connected.
	 * "rxOnly" indicates that the LLDP agent receives, but it does not transmit LLDP frames on this port.
	 * "txAndRx" indicates the LLDP agent transmits and receives LLDP frames on this port.
	 * "disabled" indciates the LLDP agent does not transmit or receive LLDP frames on this port. If there is remote systems information which is received on this port and stored in other tables, before the port's PortConfigAdminStatus becomes disabled, then that information is deleted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Config Admin Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_PortConfigAdminStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"..\"]' Values='[\"txOnly\",\"rxOnly\",\"txAndRx\",\"disabled\",\"DMTF Reserved\"]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2PortConfigAdminStatus\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.DestMacAddress\"]'"
	 * @generated
	 */
	EList<Integer> getPortConfigAdminStatus();

	/**
	 * Returns the value of the '<em><b>Port Config Notification Enable</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These flags control, on a per agent basis, whether or not notifications from the agent are enabled on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Config Notification Enable</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_PortConfigNotificationEnable()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2PortConfigNotificationEnable\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.DestMacAddress\",\"CIM_LLDPEthernetPort.PortConfigAdminStatus\"]'"
	 * @generated
	 */
	EList<Boolean> getPortConfigNotificationEnable();

	/**
	 * Returns the value of the '<em><b>Port Config Port Description TLV Tx Enable</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These flags indicate that LLDP agents should transmit "Port Description TLV" on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Config Port Description TLV Tx Enable</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_PortConfigPortDescriptionTLVTxEnable()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2PortConfigTLVsTxEnable\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.DestMacAddress\",\"CIM_LLDPEthernetPort.PortConfigAdminStatus\",\"CIM_LLDPEthernetPort.PortConfigNotificationEnable\"]'"
	 * @generated
	 */
	EList<Boolean> getPortConfigPortDescriptionTLVTxEnable();

	/**
	 * Returns the value of the '<em><b>Port Config System Name TLV Tx Enable</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These flags indicate that LLDP agents should transmit "System Name TLV" on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Config System Name TLV Tx Enable</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_PortConfigSystemNameTLVTxEnable()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2PortConfigTLVsTxEnable\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.DestMacAddress\",\"CIM_LLDPEthernetPort.PortConfigAdminStatus\",\"CIM_LLDPEthernetPort.PortConfigNotificationEnable\",\"CIM_LLDPEthernetPort.PortConfigPortDescriptionTLVTxEnable\"]'"
	 * @generated
	 */
	EList<Boolean> getPortConfigSystemNameTLVTxEnable();

	/**
	 * Returns the value of the '<em><b>Port Config System Description TLV Tx Enable</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These flags indicate that LLDP agents should transmit "System Description TLV" on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Config System Description TLV Tx Enable</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_PortConfigSystemDescriptionTLVTxEnable()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2PortConfigTLVsTxEnable\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.DestMacAddress\",\"CIM_LLDPEthernetPort.PortConfigAdminStatus\",\"CIM_LLDPEthernetPort.PortConfigNotificationEnable\",\"CIM_LLDPEthernetPort.PortConfigPortDescriptionTLVTxEnable\",\"CIM_LLDPEthernetPort.PortConfigSystemNameTLVTxEnable\"]'"
	 * @generated
	 */
	EList<Boolean> getPortConfigSystemDescriptionTLVTxEnable();

	/**
	 * Returns the value of the '<em><b>Port Config System Capabilities TLV Tx Enable</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These flags indicate that LLDP agents should transmit "System Capabilities TLV" on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Config System Capabilities TLV Tx Enable</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_PortConfigSystemCapabilitiesTLVTxEnable()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2PortConfigTLVsTxEnable\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.DestMacAddress\",\"CIM_LLDPEthernetPort.PortConfigAdminStatus\",\"CIM_LLDPEthernetPort.PortConfigNotificationEnable\",\"CIM_LLDPEthernetPort.PortConfigPortDescriptionTLVTxEnable\",\"CIM_LLDPEthernetPort.PortConfigSystemNameTLVTxEnable\",\"CIM_LLDPEthernetPort.PortConfigSystemDescriptionTLVTxEnable\"]'"
	 * @generated
	 */
	EList<Boolean> getPortConfigSystemCapabilitiesTLVTxEnable();

	/**
	 * Returns the value of the '<em><b>Man Addr Config Dest Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The destination MAC address associated with ManAddrConfigTxEnable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Man Addr Config Dest Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_ManAddrConfigDestAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2ManAddrConfigDestAddressIndex\"]'"
	 * @generated
	 */
	EList<String> getManAddrConfigDestAddress();

	/**
	 * Returns the value of the '<em><b>Man Addr Config Loc Man Addr Subtype</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property represents the type of managment address identifiers encoding used to represent management addresses. "3 (MAC address)" value indicates that this string identifies a particular unicast MAC address (encoded in network byte order and IEEE 802.3 canonical bit order). "4 (Network address)" value identifies a network address. The first octet contains the IANA AddressFamilyNumbers enumeration value for the specific address type, and octets 2 through N contain the networkAddress address value in network byte order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Man Addr Config Loc Man Addr Subtype</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_ManAddrConfigLocManAddrSubtype()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"3\",\"4\",\"..\"]' Values='[\"MAC address\",\"Network address\",\"DMTF Reserved\"]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2ManAddrConfigLocManAddrSubtype\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.ManAddrConfigDestAddress\"]'"
	 * @generated
	 */
	EList<Integer> getManAddrConfigLocManAddrSubtype();

	/**
	 * Returns the value of the '<em><b>Man Addr Config Loc Man Addr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string values used to identify the management addresses for which notifications from the agent are enabled on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Man Addr Config Loc Man Addr</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_ManAddrConfigLocManAddr()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2ManAddrConfigLocManAddr\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.ManAddrConfigDestAddress\",\"CIM_LLDPEthernetPort.ManAddrConfigLocManAddrSubtype\"]'"
	 * @generated
	 */
	EList<String> getManAddrConfigLocManAddr();

	/**
	 * Returns the value of the '<em><b>Man Addr Config Tx Enable</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flags for controlling the transmission of system management address instances for this port, destination, subtype and management address. If set to false, no transmission occurs. If set to true, the appropriate information is transmitted on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Man Addr Config Tx Enable</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_ManAddrConfigTxEnable()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2ManAddrConfigTxEnable\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.ManAddrConfigDestAddress\",\"CIM_LLDPEthernetPort.ManAddrConfigLocManAddrSubtype\",\"CIM_LLDPEthernetPort.ManAddrConfigLocManAddr\"]'"
	 * @generated
	 */
	EList<Boolean> getManAddrConfigTxEnable();

	/**
	 * Returns the value of the '<em><b>Loc Chassis Id Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of encoding used to identify the chassis associated with the local system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Chassis Id Subtype</em>' attribute.
	 * @see #setLocChassisIdSubtype(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocChassisIdSubtype()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\"]' Values='[\"Chassis component\",\"Interface alias\",\"Port component\",\"MAC address\",\"Network address\",\"Interface name\",\"Locally assigned\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2LocChassisIdSubtype\"]'"
	 * @generated
	 */
	Integer getLocChassisIdSubtype();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocChassisIdSubtype <em>Loc Chassis Id Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Chassis Id Subtype</em>' attribute.
	 * @see #getLocChassisIdSubtype()
	 * @generated
	 */
	void setLocChassisIdSubtype(Integer value);

	/**
	 * Returns the value of the '<em><b>Loc Chassis Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string value used to identify the chassis component associated with the local system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Chassis Id</em>' attribute.
	 * @see #setLocChassisId(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocChassisId()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2LocChassisId\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.LocChassisIdSubtype\"]'"
	 * @generated
	 */
	String getLocChassisId();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocChassisId <em>Loc Chassis Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Chassis Id</em>' attribute.
	 * @see #getLocChassisId()
	 * @generated
	 */
	void setLocChassisId(String value);

	/**
	 * Returns the value of the '<em><b>Loc Sys Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string value used to identify the system name of the local system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Sys Name</em>' attribute.
	 * @see #setLocSysName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocSysName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2LocSysName\"]'"
	 * @generated
	 */
	String getLocSysName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocSysName <em>Loc Sys Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Sys Name</em>' attribute.
	 * @see #getLocSysName()
	 * @generated
	 */
	void setLocSysName(String value);

	/**
	 * Returns the value of the '<em><b>Loc Sys Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string value used to identify the system description of the local system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Sys Desc</em>' attribute.
	 * @see #setLocSysDesc(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocSysDesc()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2LocSysDesc\"]'"
	 * @generated
	 */
	String getLocSysDesc();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocSysDesc <em>Loc Sys Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Sys Desc</em>' attribute.
	 * @see #getLocSysDesc()
	 * @generated
	 */
	void setLocSysDesc(String value);

	/**
	 * Returns the value of the '<em><b>Loc Sys Cap Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies which system capabilities are supported on the local system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Sys Cap Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocSysCapSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\"]' Values='[\"Repeater\",\"MAC Bridge\",\"WLAN Access Point\",\"Router\",\"Telephone\",\"DOCSIS cable device\",\"Station Only\",\"C-VLAN Component of a VLAN Bridge\",\"S-VLAN Component of a VLAN Bridge\",\"Two-port MAC Relay (TPMR)\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2LocSysCapSupported\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.LocSysCapEnabled\"]'"
	 * @generated
	 */
	EList<Integer> getLocSysCapSupported();

	/**
	 * Returns the value of the '<em><b>Loc Sys Cap Enabled</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These flags are used to identify which system capabilities are enabled on the local system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Sys Cap Enabled</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocSysCapEnabled()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2LocSysCapEnabled\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.LocSysCapSupported\"]'"
	 * @generated
	 */
	EList<Boolean> getLocSysCapEnabled();

	/**
	 * Returns the value of the '<em><b>Loc Port Id Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of port identifier encoding used in identifying the port component associated with the local system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Port Id Subtype</em>' attribute.
	 * @see #setLocPortIdSubtype(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocPortIdSubtype()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\"]' Values='[\"Interface alias\",\"Port component\",\"MAC address\",\"Network address\",\"Interface name\",\"Agent circuit ID\",\"Locally assigned\",\"DMTF Reserved\"]' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2LocPortIdSubtype\"]'"
	 * @generated
	 */
	Integer getLocPortIdSubtype();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocPortIdSubtype <em>Loc Port Id Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Port Id Subtype</em>' attribute.
	 * @see #getLocPortIdSubtype()
	 * @generated
	 */
	void setLocPortIdSubtype(Integer value);

	/**
	 * Returns the value of the '<em><b>Loc Port ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string value used to identify the port component associated with a given port in the local system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Port ID</em>' attribute.
	 * @see #setLocPortID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocPortID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2LocPortId\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.LocPortIdSubtype\"]'"
	 * @generated
	 */
	String getLocPortID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocPortID <em>Loc Port ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Port ID</em>' attribute.
	 * @see #getLocPortID()
	 * @generated
	 */
	void setLocPortID(String value);

	/**
	 * Returns the value of the '<em><b>Loc Port Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string value used to identify this port's description associated with the local system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Port Desc</em>' attribute.
	 * @see #setLocPortDesc(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocPortDesc()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2LocPortDesc\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.LocPortIdSubtype\",\"CIM_LLDPEthernetPort.LocPortId\"]'"
	 * @generated
	 */
	String getLocPortDesc();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocPortDesc <em>Loc Port Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Port Desc</em>' attribute.
	 * @see #getLocPortDesc()
	 * @generated
	 */
	void setLocPortDesc(String value);

	/**
	 * Returns the value of the '<em><b>Loc Tx System Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer that indicates the value of Tw_sys_tx that the local system can support on this port. This value is updated
	 * by the EEE DLL Transmitter state diagram. Tw_Sys_tx value is used in a timer that counts the time since the de-assertion of Low Poer Idle (LPI).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Tx System Value</em>' attribute.
	 * @see #setLocTxSystemValue(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocTxSystemValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getLocTxSystemValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocTxSystemValue <em>Loc Tx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Tx System Value</em>' attribute.
	 * @see #getLocTxSystemValue()
	 * @generated
	 */
	void setLocTxSystemValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Rem Tx System Value Echo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer that indicates the value Transmit Tw_sys_tx echoed back by the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Tx System Value Echo</em>' attribute.
	 * @see #setRemTxSystemValueEcho(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemTxSystemValueEcho()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getRemTxSystemValueEcho();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemTxSystemValueEcho <em>Rem Tx System Value Echo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rem Tx System Value Echo</em>' attribute.
	 * @see #getRemTxSystemValueEcho()
	 * @generated
	 */
	void setRemTxSystemValueEcho(Integer value);

	/**
	 * Returns the value of the '<em><b>Loc Rx System Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer that indicates the value of Tw_sys_tx that the local system requests from the remote system. This value is updated by the EEE Receiver L2 state diagram.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Rx System Value</em>' attribute.
	 * @see #setLocRxSystemValue(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocRxSystemValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getLocRxSystemValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocRxSystemValue <em>Loc Rx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Rx System Value</em>' attribute.
	 * @see #getLocRxSystemValue()
	 * @generated
	 */
	void setLocRxSystemValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Rem Rx System Value Echo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer that indicates the value of Receive Tw_sys_tx echoed back by the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Rx System Value Echo</em>' attribute.
	 * @see #setRemRxSystemValueEcho(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemRxSystemValueEcho()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getRemRxSystemValueEcho();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemRxSystemValueEcho <em>Rem Rx System Value Echo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rem Rx System Value Echo</em>' attribute.
	 * @see #getRemRxSystemValueEcho()
	 * @generated
	 */
	void setRemRxSystemValueEcho(Integer value);

	/**
	 * Returns the value of the '<em><b>Loc Fb System Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer that indicates the value of fallback Tw_sys_tx that the local system requests from the remote system. This value is updated by the local system software.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Fb System Value</em>' attribute.
	 * @see #setLocFbSystemValue(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocFbSystemValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getLocFbSystemValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocFbSystemValue <em>Loc Fb System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Fb System Value</em>' attribute.
	 * @see #getLocFbSystemValue()
	 * @generated
	 */
	void setLocFbSystemValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Rem Tx System Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer that indicates the value of Tw_sys_tx that the remote system can support.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Tx System Value</em>' attribute.
	 * @see #setRemTxSystemValue(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemTxSystemValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getRemTxSystemValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemTxSystemValue <em>Rem Tx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rem Tx System Value</em>' attribute.
	 * @see #getRemTxSystemValue()
	 * @generated
	 */
	void setRemTxSystemValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Loc Tx System Value Echo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer that indicates the remote system's Transmit Tw_sys_tx that was used by the local system to compute the Tw_sys_tx that it wants to request from the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Tx System Value Echo</em>' attribute.
	 * @see #setLocTxSystemValueEcho(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocTxSystemValueEcho()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getLocTxSystemValueEcho();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocTxSystemValueEcho <em>Loc Tx System Value Echo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Tx System Value Echo</em>' attribute.
	 * @see #getLocTxSystemValueEcho()
	 * @generated
	 */
	void setLocTxSystemValueEcho(Integer value);

	/**
	 * Returns the value of the '<em><b>Rem Rx System Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer that indicates the value of Tw_sys_tx that the remote system requests from the local system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Rx System Value</em>' attribute.
	 * @see #setRemRxSystemValue(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemRxSystemValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getRemRxSystemValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getRemRxSystemValue <em>Rem Rx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rem Rx System Value</em>' attribute.
	 * @see #getRemRxSystemValue()
	 * @generated
	 */
	void setRemRxSystemValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Loc Rx System Value Echo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer that indicates the remote systems Receive Tw_sys_tx that was used by the local system to compute the Tw_sys_tx that it can support.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Rx System Value Echo</em>' attribute.
	 * @see #setLocRxSystemValueEcho(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocRxSystemValueEcho()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getLocRxSystemValueEcho();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocRxSystemValueEcho <em>Loc Rx System Value Echo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Rx System Value Echo</em>' attribute.
	 * @see #getLocRxSystemValueEcho()
	 * @generated
	 */
	void setLocRxSystemValueEcho(Integer value);

	/**
	 * Returns the value of the '<em><b>Loc Resolved Tx System Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer that indicates the current Tw_sys_tx supported by the local system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Resolved Tx System Value</em>' attribute.
	 * @see #setLocResolvedTxSystemValue(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocResolvedTxSystemValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getLocResolvedTxSystemValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocResolvedTxSystemValue <em>Loc Resolved Tx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Resolved Tx System Value</em>' attribute.
	 * @see #getLocResolvedTxSystemValue()
	 * @generated
	 */
	void setLocResolvedTxSystemValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Loc Resolved Rx System Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Integer that indicates the current Tw_sys_tx supported by the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Resolved Rx System Value</em>' attribute.
	 * @see #setLocResolvedRxSystemValue(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocResolvedRxSystemValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getLocResolvedRxSystemValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getLocResolvedRxSystemValue <em>Loc Resolved Rx System Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Resolved Rx System Value</em>' attribute.
	 * @see #getLocResolvedRxSystemValue()
	 * @generated
	 */
	void setLocResolvedRxSystemValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Maximum Frame Size TLV Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This flag indicates whether or not the transmission of Maximum frame size TLV is enabled on this port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Frame Size TLV Enabled</em>' attribute.
	 * @see #setMaximumFrameSizeTLVEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_MaximumFrameSizeTLVEnabled()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getMaximumFrameSizeTLVEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LLDPEthernetPort#getMaximumFrameSizeTLVEnabled <em>Maximum Frame Size TLV Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Frame Size TLV Enabled</em>' attribute.
	 * @see #getMaximumFrameSizeTLVEnabled()
	 * @generated
	 */
	void setMaximumFrameSizeTLVEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Loc Man Addr Sub Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of management address identifier encodings used for the management addresses represented by LocManAddr.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Man Addr Sub Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocManAddrSubType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"3\",\"4\",\"..\"]' Values='[\"MAC address\",\"Network address\",\"DMTF Reserved\"]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2LocManAddrSubtype\"]'"
	 * @generated
	 */
	EList<Integer> getLocManAddrSubType();

	/**
	 * Returns the value of the '<em><b>Loc Man Addr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string values are used to identify the management addresses on the local system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Man Addr</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocManAddr()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2LocManAddr\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.LocManAddrSubtype\"]'"
	 * @generated
	 */
	EList<String> getLocManAddr();

	/**
	 * Returns the value of the '<em><b>Loc Man Addr If Subtype</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The enumeration value that identifies the interface numbering method used for defining the interface number
	 * (lldpV2LocManAddrIfId), associated with the local system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Man Addr If Subtype</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocManAddrIfSubtype()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"..\"]' Values='[\"ifIndex\",\"systemPortNumber\",\"DMTF Reserved\"]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2LocManAddrIfSubtype\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.LocManAddrSubtype\",\"CIM_LLDPEthernetPort.LocManAddr\"]'"
	 * @generated
	 */
	EList<Integer> getLocManAddrIfSubtype();

	/**
	 * Returns the value of the '<em><b>Loc Man Addr If Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The integer value used to identify the interface number
	 * regarding the management address on the local system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Man Addr If Id</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_LocManAddrIfId()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2LocManAddrIfId\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.LocManAddrSubtype\",\"CIM_LLDPEthernetPort.LocManAddr\",\"CIM_LLDPEthernetPort.LocManAddrIfSubtype\"]'"
	 * @generated
	 */
	EList<Long> getLocManAddrIfId();

	/**
	 * Returns the value of the '<em><b>Rem Local Dest Mac Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The destination MAC addresses used on the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Local Dest Mac Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemLocalDestMacAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2Xdot1RemLocalDestMacAddress\"]'"
	 * @generated
	 */
	EList<String> getRemLocalDestMacAddress();

	/**
	 * Returns the value of the '<em><b>Rem Man Addr Sub Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of management address identifier encodings used for the management addresses represented by RemManAddr.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Man Addr Sub Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemManAddrSubType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"3\",\"4\",\"..\"]' Values='[\"MAC address\",\"Network address\",\"DMTF Reserved\"]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2RemManAddrSubtype\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.RemLocalDestMacAddress\"]'"
	 * @generated
	 */
	EList<Integer> getRemManAddrSubType();

	/**
	 * Returns the value of the '<em><b>Rem Man Addr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string values are used to identify the management addresses on the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Man Addr</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemManAddr()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2RemManAddr\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.RemLocalDestMacAddress\",\"CIM_LLDPEthernetPort.RemManAddrSubtype\"]'"
	 * @generated
	 */
	EList<String> getRemManAddr();

	/**
	 * Returns the value of the '<em><b>Rem Man Addr If Subtype</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The enumeration value that identifies the interface numbering method used for defining the interface number
	 * (lldpV2LocManAddrIfId), associated with the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Man Addr If Subtype</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemManAddrIfSubtype()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"..\"]' Values='[\"ifIndex\",\"systemPortNumber\",\"DMTF Reserved\"]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2RemManAddrIfSubtype\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.RemLocalDestMacAddress\",\"CIM_LLDPEthernetPort.RemManAddrSubtype\",\"CIM_LLDPEthernetPort.RemManAddr\"]'"
	 * @generated
	 */
	EList<Integer> getRemManAddrIfSubtype();

	/**
	 * Returns the value of the '<em><b>Rem Man Addr If Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The integer value used to identify the interface number
	 * regarding the management address on the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Man Addr If Id</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemManAddrIfId()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2RemManAddrIfId\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.RemLocalDestMacAddress\",\"CIM_LLDPEthernetPort.RemManAddrSubtype\",\"CIM_LLDPEthernetPort.RemManAddr\",\"CIM_LLDPEthernetPort.RemManAddrIfSubtype\"]'"
	 * @generated
	 */
	EList<Long> getRemManAddrIfId();

	/**
	 * Returns the value of the '<em><b>Rem Chassis Id Subtype</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of encoding used to identify the chassis associated with the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Chassis Id Subtype</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemChassisIdSubtype()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\"]' Values='[\"Chassis component\",\"Interface alias\",\"Port component\",\"MAC address\",\"Network address\",\"Interface name\",\"Locally assigned\",\"DMTF Reserved\"]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2RemChassisIdSubtype\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.RemLocalDestMacAddress\"]'"
	 * @generated
	 */
	EList<Integer> getRemChassisIdSubtype();

	/**
	 * Returns the value of the '<em><b>Rem Chassis Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string value used to identify the chassis component associated with the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Chassis Id</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemChassisId()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2RemChassisId\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.RemLocalDestMacAddress\",\"CIM_LLDPEthernetPort.LocChassisIdSubtype\"]'"
	 * @generated
	 */
	EList<String> getRemChassisId();

	/**
	 * Returns the value of the '<em><b>Rem Sys Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string value used to identify the system name of the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Sys Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemSysName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2RemSysName\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.RemLocalDestMacAddress\"]'"
	 * @generated
	 */
	EList<String> getRemSysName();

	/**
	 * Returns the value of the '<em><b>Rem Sys Desc</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string value used to identify the system description of the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Sys Desc</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemSysDesc()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2RemSysDesc\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.RemLocalDestMacAddress\"]'"
	 * @generated
	 */
	EList<String> getRemSysDesc();

	/**
	 * Returns the value of the '<em><b>Rem Sys Cap Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies which system capabilities are supported on the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Sys Cap Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemSysCapSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\"]' Values='[\"Repeater\",\"MAC Bridge\",\"WLAN Access Point\",\"Router\",\"Telephone\",\"DOCSIS cable device\",\"Station Only\",\"C-VLAN Component of a VLAN Bridge\",\"S-VLAN Component of a VLAN Bridge\",\"Two-port MAC Relay (TPMR)\",\"DMTF Reserved\"]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2RemSysCapSupported\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.RemLocalDestMacAddress\",\"CIM_LLDPEthernetPort.RemSysCapEnabled\"]'"
	 * @generated
	 */
	EList<Integer> getRemSysCapSupported();

	/**
	 * Returns the value of the '<em><b>Rem Sys Cap Enabled</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * These flags are used to identify which system capabilities are enabled on the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Sys Cap Enabled</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemSysCapEnabled()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2RemSysCapEnabled\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.RemLocalDestMacAddress\",\"CIM_LLDPEthernetPort.RemSysCapSupported\"]'"
	 * @generated
	 */
	EList<Boolean> getRemSysCapEnabled();

	/**
	 * Returns the value of the '<em><b>Rem Port Id Subtype</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of port identifier encoding used in identifying the port component associated with the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Port Id Subtype</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemPortIdSubtype()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\"]' Values='[\"Interface alias\",\"Port component\",\"MAC address\",\"Network address\",\"Interface name\",\"Agent circuit ID\",\"Locally assigned\",\"DMTF Reserved\"]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2RemPortIdSubtype\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.RemLocalDestMacAddress\"]'"
	 * @generated
	 */
	EList<Integer> getRemPortIdSubtype();

	/**
	 * Returns the value of the '<em><b>Rem Port ID</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string value used to identify the port component associated with a given port in the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Port ID</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemPortID()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2RemPortId\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.RemLocalDestMacAddress\",\"CIM_LLDPEthernetPort.RemPortIdSubtype\"]'"
	 * @generated
	 */
	EList<String> getRemPortID();

	/**
	 * Returns the value of the '<em><b>Rem Port Desc</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string value used to identify this port's description associated with the remote system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rem Port Desc</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_LLDPEthernetPort_RemPortDesc()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IEEE|LLDP-EXT-DOT1-V2-MIB.lldpV2RemPortDesc\"]' ModelCorrespondence='[\"CIM_LLDPEthernetPort.RemLocalDestMacAddress\",\"CIM_LLDPEthernetPort.RemPortIdSubtype\",\"CIM_LLDPEthernetPort.RemPortId\"]'"
	 * @generated
	 */
	EList<String> getRemPortDesc();

} // CIM_LLDPEthernetPort

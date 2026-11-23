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

import org.dmtf.cim.CIM_VirtualEthernetSwitchSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Virtual Ethernet Switch Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualEthernetSwitchSettingDataImpl#getVLANConnection <em>VLAN Connection</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualEthernetSwitchSettingDataImpl#getAssociatedResourcePool <em>Associated Resource Pool</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualEthernetSwitchSettingDataImpl#getMaxNumMACAddress <em>Max Num MAC Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualEthernetSwitchSettingDataImpl#getEVBMode <em>EVB Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualEthernetSwitchSettingDataImpl#getOtherEVBMode <em>Other EVB Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VirtualEthernetSwitchSettingDataImpl extends CIM_VirtualSystemSettingDataImpl implements CIM_VirtualEthernetSwitchSettingData {
	/**
	 * The cached value of the '{@link #getVLANConnection() <em>VLAN Connection</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVLANConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vlanConnection;

	/**
	 * The cached value of the '{@link #getAssociatedResourcePool() <em>Associated Resource Pool</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedResourcePool()
	 * @generated
	 * @ordered
	 */
	protected EList<String> associatedResourcePool;

	/**
	 * The default value of the '{@link #getMaxNumMACAddress() <em>Max Num MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumMACAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_NUM_MAC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxNumMACAddress() <em>Max Num MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxNumMACAddress()
	 * @generated
	 * @ordered
	 */
	protected Long maxNumMACAddress = MAX_NUM_MAC_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEVBMode() <em>EVB Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVBMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EVB_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEVBMode() <em>EVB Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVBMode()
	 * @generated
	 * @ordered
	 */
	protected Integer evbMode = EVB_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEVBMode() <em>Other EVB Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEVBMode()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_EVB_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEVBMode() <em>Other EVB Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEVBMode()
	 * @generated
	 * @ordered
	 */
	protected String otherEVBMode = OTHER_EVB_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VirtualEthernetSwitchSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VirtualEthernetSwitchSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVLANConnection() {
		if (vlanConnection == null) {
			vlanConnection = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__VLAN_CONNECTION);
		}
		return vlanConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAssociatedResourcePool() {
		if (associatedResourcePool == null) {
			associatedResourcePool = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__ASSOCIATED_RESOURCE_POOL);
		}
		return associatedResourcePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxNumMACAddress() {
		return maxNumMACAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxNumMACAddress(Long newMaxNumMACAddress) {
		Long oldMaxNumMACAddress = maxNumMACAddress;
		maxNumMACAddress = newMaxNumMACAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__MAX_NUM_MAC_ADDRESS, oldMaxNumMACAddress, maxNumMACAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEVBMode() {
		return evbMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEVBMode(Integer newEVBMode) {
		Integer oldEVBMode = evbMode;
		evbMode = newEVBMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__EVB_MODE, oldEVBMode, evbMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherEVBMode() {
		return otherEVBMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherEVBMode(String newOtherEVBMode) {
		String oldOtherEVBMode = otherEVBMode;
		otherEVBMode = newOtherEVBMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__OTHER_EVB_MODE, oldOtherEVBMode, otherEVBMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__VLAN_CONNECTION:
				return getVLANConnection();
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__ASSOCIATED_RESOURCE_POOL:
				return getAssociatedResourcePool();
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__MAX_NUM_MAC_ADDRESS:
				return getMaxNumMACAddress();
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__EVB_MODE:
				return getEVBMode();
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__OTHER_EVB_MODE:
				return getOtherEVBMode();
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
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__VLAN_CONNECTION:
				getVLANConnection().clear();
				getVLANConnection().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__ASSOCIATED_RESOURCE_POOL:
				getAssociatedResourcePool().clear();
				getAssociatedResourcePool().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__MAX_NUM_MAC_ADDRESS:
				setMaxNumMACAddress((Long)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__EVB_MODE:
				setEVBMode((Integer)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__OTHER_EVB_MODE:
				setOtherEVBMode((String)newValue);
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
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__VLAN_CONNECTION:
				getVLANConnection().clear();
				return;
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__ASSOCIATED_RESOURCE_POOL:
				getAssociatedResourcePool().clear();
				return;
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__MAX_NUM_MAC_ADDRESS:
				setMaxNumMACAddress(MAX_NUM_MAC_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__EVB_MODE:
				setEVBMode(EVB_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__OTHER_EVB_MODE:
				setOtherEVBMode(OTHER_EVB_MODE_EDEFAULT);
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
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__VLAN_CONNECTION:
				return vlanConnection != null && !vlanConnection.isEmpty();
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__ASSOCIATED_RESOURCE_POOL:
				return associatedResourcePool != null && !associatedResourcePool.isEmpty();
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__MAX_NUM_MAC_ADDRESS:
				return MAX_NUM_MAC_ADDRESS_EDEFAULT == null ? maxNumMACAddress != null : !MAX_NUM_MAC_ADDRESS_EDEFAULT.equals(maxNumMACAddress);
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__EVB_MODE:
				return EVB_MODE_EDEFAULT == null ? evbMode != null : !EVB_MODE_EDEFAULT.equals(evbMode);
			case CimPackage.CIM_VIRTUAL_ETHERNET_SWITCH_SETTING_DATA__OTHER_EVB_MODE:
				return OTHER_EVB_MODE_EDEFAULT == null ? otherEVBMode != null : !OTHER_EVB_MODE_EDEFAULT.equals(otherEVBMode);
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
		result.append(" (VLANConnection: ");
		result.append(vlanConnection);
		result.append(", AssociatedResourcePool: ");
		result.append(associatedResourcePool);
		result.append(", MaxNumMACAddress: ");
		result.append(maxNumMACAddress);
		result.append(", EVBMode: ");
		result.append(evbMode);
		result.append(", OtherEVBMode: ");
		result.append(otherEVBMode);
		result.append(')');
		return result.toString();
	}

} //CIM_VirtualEthernetSwitchSettingDataImpl

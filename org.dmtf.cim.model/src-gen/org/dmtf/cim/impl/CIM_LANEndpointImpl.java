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

import org.dmtf.cim.CIM_LANEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM LAN Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LANEndpointImpl#getLANID <em>LANID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LANEndpointImpl#getLANType <em>LAN Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LANEndpointImpl#getOtherLANType <em>Other LAN Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LANEndpointImpl#getMACAddress <em>MAC Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LANEndpointImpl#getAliasAddresses <em>Alias Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LANEndpointImpl#getGroupAddresses <em>Group Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LANEndpointImpl#getMaxDataSize <em>Max Data Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LANEndpointImpl extends CIM_ProtocolEndpointImpl implements CIM_LANEndpoint {
	/**
	 * The default value of the '{@link #getLANID() <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANID()
	 * @generated
	 * @ordered
	 */
	protected static final String LANID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLANID() <em>LANID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANID()
	 * @generated
	 * @ordered
	 */
	protected String lanid = LANID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLANType() <em>LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LAN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLANType() <em>LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLANType()
	 * @generated
	 * @ordered
	 */
	protected Integer lanType = LAN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherLANType() <em>Other LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLANType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_LAN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLANType() <em>Other LAN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLANType()
	 * @generated
	 * @ordered
	 */
	protected String otherLANType = OTHER_LAN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMACAddress() <em>MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMACAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMACAddress() <em>MAC Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMACAddress()
	 * @generated
	 * @ordered
	 */
	protected String macAddress = MAC_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAliasAddresses() <em>Alias Addresses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> aliasAddresses;

	/**
	 * The cached value of the '{@link #getGroupAddresses() <em>Group Addresses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> groupAddresses;

	/**
	 * The default value of the '{@link #getMaxDataSize() <em>Max Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_DATA_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxDataSize() <em>Max Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataSize()
	 * @generated
	 * @ordered
	 */
	protected Long maxDataSize = MAX_DATA_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LANEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LANEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLANID() {
		return lanid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLANID(String newLANID) {
		String oldLANID = lanid;
		lanid = newLANID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAN_ENDPOINT__LANID, oldLANID, lanid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLANType() {
		return lanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLANType(Integer newLANType) {
		Integer oldLANType = lanType;
		lanType = newLANType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAN_ENDPOINT__LAN_TYPE, oldLANType, lanType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherLANType() {
		return otherLANType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherLANType(String newOtherLANType) {
		String oldOtherLANType = otherLANType;
		otherLANType = newOtherLANType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAN_ENDPOINT__OTHER_LAN_TYPE, oldOtherLANType, otherLANType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMACAddress() {
		return macAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMACAddress(String newMACAddress) {
		String oldMACAddress = macAddress;
		macAddress = newMACAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAN_ENDPOINT__MAC_ADDRESS, oldMACAddress, macAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAliasAddresses() {
		if (aliasAddresses == null) {
			aliasAddresses = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LAN_ENDPOINT__ALIAS_ADDRESSES);
		}
		return aliasAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getGroupAddresses() {
		if (groupAddresses == null) {
			groupAddresses = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LAN_ENDPOINT__GROUP_ADDRESSES);
		}
		return groupAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxDataSize() {
		return maxDataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxDataSize(Long newMaxDataSize) {
		Long oldMaxDataSize = maxDataSize;
		maxDataSize = newMaxDataSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LAN_ENDPOINT__MAX_DATA_SIZE, oldMaxDataSize, maxDataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LAN_ENDPOINT__LANID:
				return getLANID();
			case CimPackage.CIM_LAN_ENDPOINT__LAN_TYPE:
				return getLANType();
			case CimPackage.CIM_LAN_ENDPOINT__OTHER_LAN_TYPE:
				return getOtherLANType();
			case CimPackage.CIM_LAN_ENDPOINT__MAC_ADDRESS:
				return getMACAddress();
			case CimPackage.CIM_LAN_ENDPOINT__ALIAS_ADDRESSES:
				return getAliasAddresses();
			case CimPackage.CIM_LAN_ENDPOINT__GROUP_ADDRESSES:
				return getGroupAddresses();
			case CimPackage.CIM_LAN_ENDPOINT__MAX_DATA_SIZE:
				return getMaxDataSize();
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
			case CimPackage.CIM_LAN_ENDPOINT__LANID:
				setLANID((String)newValue);
				return;
			case CimPackage.CIM_LAN_ENDPOINT__LAN_TYPE:
				setLANType((Integer)newValue);
				return;
			case CimPackage.CIM_LAN_ENDPOINT__OTHER_LAN_TYPE:
				setOtherLANType((String)newValue);
				return;
			case CimPackage.CIM_LAN_ENDPOINT__MAC_ADDRESS:
				setMACAddress((String)newValue);
				return;
			case CimPackage.CIM_LAN_ENDPOINT__ALIAS_ADDRESSES:
				getAliasAddresses().clear();
				getAliasAddresses().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LAN_ENDPOINT__GROUP_ADDRESSES:
				getGroupAddresses().clear();
				getGroupAddresses().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LAN_ENDPOINT__MAX_DATA_SIZE:
				setMaxDataSize((Long)newValue);
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
			case CimPackage.CIM_LAN_ENDPOINT__LANID:
				setLANID(LANID_EDEFAULT);
				return;
			case CimPackage.CIM_LAN_ENDPOINT__LAN_TYPE:
				setLANType(LAN_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_LAN_ENDPOINT__OTHER_LAN_TYPE:
				setOtherLANType(OTHER_LAN_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_LAN_ENDPOINT__MAC_ADDRESS:
				setMACAddress(MAC_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_LAN_ENDPOINT__ALIAS_ADDRESSES:
				getAliasAddresses().clear();
				return;
			case CimPackage.CIM_LAN_ENDPOINT__GROUP_ADDRESSES:
				getGroupAddresses().clear();
				return;
			case CimPackage.CIM_LAN_ENDPOINT__MAX_DATA_SIZE:
				setMaxDataSize(MAX_DATA_SIZE_EDEFAULT);
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
			case CimPackage.CIM_LAN_ENDPOINT__LANID:
				return LANID_EDEFAULT == null ? lanid != null : !LANID_EDEFAULT.equals(lanid);
			case CimPackage.CIM_LAN_ENDPOINT__LAN_TYPE:
				return LAN_TYPE_EDEFAULT == null ? lanType != null : !LAN_TYPE_EDEFAULT.equals(lanType);
			case CimPackage.CIM_LAN_ENDPOINT__OTHER_LAN_TYPE:
				return OTHER_LAN_TYPE_EDEFAULT == null ? otherLANType != null : !OTHER_LAN_TYPE_EDEFAULT.equals(otherLANType);
			case CimPackage.CIM_LAN_ENDPOINT__MAC_ADDRESS:
				return MAC_ADDRESS_EDEFAULT == null ? macAddress != null : !MAC_ADDRESS_EDEFAULT.equals(macAddress);
			case CimPackage.CIM_LAN_ENDPOINT__ALIAS_ADDRESSES:
				return aliasAddresses != null && !aliasAddresses.isEmpty();
			case CimPackage.CIM_LAN_ENDPOINT__GROUP_ADDRESSES:
				return groupAddresses != null && !groupAddresses.isEmpty();
			case CimPackage.CIM_LAN_ENDPOINT__MAX_DATA_SIZE:
				return MAX_DATA_SIZE_EDEFAULT == null ? maxDataSize != null : !MAX_DATA_SIZE_EDEFAULT.equals(maxDataSize);
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
		result.append(" (LANID: ");
		result.append(lanid);
		result.append(", LANType: ");
		result.append(lanType);
		result.append(", OtherLANType: ");
		result.append(otherLANType);
		result.append(", MACAddress: ");
		result.append(macAddress);
		result.append(", AliasAddresses: ");
		result.append(aliasAddresses);
		result.append(", GroupAddresses: ");
		result.append(groupAddresses);
		result.append(", MaxDataSize: ");
		result.append(maxDataSize);
		result.append(')');
		return result.toString();
	}

} //CIM_LANEndpointImpl

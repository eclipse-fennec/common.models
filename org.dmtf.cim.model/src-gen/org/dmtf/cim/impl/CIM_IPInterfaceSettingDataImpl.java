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

import org.dmtf.cim.CIM_IPInterfaceSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM IP Interface Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPInterfaceSettingDataImpl#getIPAddress <em>IP Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPInterfaceSettingDataImpl#getAddressType <em>Address Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPInterfaceSettingDataImpl#getSubnetMask <em>Subnet Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPInterfaceSettingDataImpl#getIPv6PrefixLength <em>IPv6 Prefix Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPInterfaceSettingDataImpl#getVLANId <em>VLAN Id</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPInterfaceSettingDataImpl#getMTU <em>MTU</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPInterfaceSettingDataImpl#getRSSCapable <em>RSS Capable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPInterfaceSettingDataImpl#getRDMACapable <em>RDMA Capable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_IPInterfaceSettingDataImpl#getLinkSpeed <em>Link Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IPInterfaceSettingDataImpl extends CIM_SettingDataImpl implements CIM_IPInterfaceSettingData {
	/**
	 * The default value of the '{@link #getIPAddress() <em>IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPAddress() <em>IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAddress()
	 * @generated
	 * @ordered
	 */
	protected String ipAddress = IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADDRESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected Integer addressType = ADDRESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetMask() <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetMask()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetMask() <em>Subnet Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetMask()
	 * @generated
	 * @ordered
	 */
	protected String subnetMask = SUBNET_MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getIPv6PrefixLength() <em>IPv6 Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv6PrefixLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IPV6_PREFIX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPv6PrefixLength() <em>IPv6 Prefix Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv6PrefixLength()
	 * @generated
	 * @ordered
	 */
	protected Integer iPv6PrefixLength = IPV6_PREFIX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getVLANId() <em>VLAN Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVLANId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VLAN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVLANId() <em>VLAN Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVLANId()
	 * @generated
	 * @ordered
	 */
	protected Integer vlanId = VLAN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMTU() <em>MTU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTU()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MTU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMTU() <em>MTU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTU()
	 * @generated
	 * @ordered
	 */
	protected Integer mtu = MTU_EDEFAULT;

	/**
	 * The default value of the '{@link #getRSSCapable() <em>RSS Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSSCapable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RSS_CAPABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRSSCapable() <em>RSS Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSSCapable()
	 * @generated
	 * @ordered
	 */
	protected Boolean rssCapable = RSS_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRDMACapable() <em>RDMA Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDMACapable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RDMA_CAPABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRDMACapable() <em>RDMA Capable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRDMACapable()
	 * @generated
	 * @ordered
	 */
	protected Boolean rdmaCapable = RDMA_CAPABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkSpeed() <em>Link Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long LINK_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkSpeed() <em>Link Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long linkSpeed = LINK_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IPInterfaceSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_IPInterfaceSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIPAddress() {
		return ipAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIPAddress(String newIPAddress) {
		String oldIPAddress = ipAddress;
		ipAddress = newIPAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_INTERFACE_SETTING_DATA__IP_ADDRESS, oldIPAddress, ipAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAddressType() {
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressType(Integer newAddressType) {
		Integer oldAddressType = addressType;
		addressType = newAddressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_INTERFACE_SETTING_DATA__ADDRESS_TYPE, oldAddressType, addressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubnetMask() {
		return subnetMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubnetMask(String newSubnetMask) {
		String oldSubnetMask = subnetMask;
		subnetMask = newSubnetMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_INTERFACE_SETTING_DATA__SUBNET_MASK, oldSubnetMask, subnetMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getIPv6PrefixLength() {
		return iPv6PrefixLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIPv6PrefixLength(Integer newIPv6PrefixLength) {
		Integer oldIPv6PrefixLength = iPv6PrefixLength;
		iPv6PrefixLength = newIPv6PrefixLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_INTERFACE_SETTING_DATA__IPV6_PREFIX_LENGTH, oldIPv6PrefixLength, iPv6PrefixLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getVLANId() {
		return vlanId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVLANId(Integer newVLANId) {
		Integer oldVLANId = vlanId;
		vlanId = newVLANId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_INTERFACE_SETTING_DATA__VLAN_ID, oldVLANId, vlanId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMTU() {
		return mtu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMTU(Integer newMTU) {
		Integer oldMTU = mtu;
		mtu = newMTU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_INTERFACE_SETTING_DATA__MTU, oldMTU, mtu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRSSCapable() {
		return rssCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRSSCapable(Boolean newRSSCapable) {
		Boolean oldRSSCapable = rssCapable;
		rssCapable = newRSSCapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_INTERFACE_SETTING_DATA__RSS_CAPABLE, oldRSSCapable, rssCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRDMACapable() {
		return rdmaCapable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRDMACapable(Boolean newRDMACapable) {
		Boolean oldRDMACapable = rdmaCapable;
		rdmaCapable = newRDMACapable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_INTERFACE_SETTING_DATA__RDMA_CAPABLE, oldRDMACapable, rdmaCapable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLinkSpeed() {
		return linkSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkSpeed(Long newLinkSpeed) {
		Long oldLinkSpeed = linkSpeed;
		linkSpeed = newLinkSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IP_INTERFACE_SETTING_DATA__LINK_SPEED, oldLinkSpeed, linkSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__IP_ADDRESS:
				return getIPAddress();
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__ADDRESS_TYPE:
				return getAddressType();
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__SUBNET_MASK:
				return getSubnetMask();
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__IPV6_PREFIX_LENGTH:
				return getIPv6PrefixLength();
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__VLAN_ID:
				return getVLANId();
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__MTU:
				return getMTU();
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__RSS_CAPABLE:
				return getRSSCapable();
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__RDMA_CAPABLE:
				return getRDMACapable();
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__LINK_SPEED:
				return getLinkSpeed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__IP_ADDRESS:
				setIPAddress((String)newValue);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__ADDRESS_TYPE:
				setAddressType((Integer)newValue);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__SUBNET_MASK:
				setSubnetMask((String)newValue);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__IPV6_PREFIX_LENGTH:
				setIPv6PrefixLength((Integer)newValue);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__VLAN_ID:
				setVLANId((Integer)newValue);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__MTU:
				setMTU((Integer)newValue);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__RSS_CAPABLE:
				setRSSCapable((Boolean)newValue);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__RDMA_CAPABLE:
				setRDMACapable((Boolean)newValue);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__LINK_SPEED:
				setLinkSpeed((Long)newValue);
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
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__IP_ADDRESS:
				setIPAddress(IP_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__ADDRESS_TYPE:
				setAddressType(ADDRESS_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__SUBNET_MASK:
				setSubnetMask(SUBNET_MASK_EDEFAULT);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__IPV6_PREFIX_LENGTH:
				setIPv6PrefixLength(IPV6_PREFIX_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__VLAN_ID:
				setVLANId(VLAN_ID_EDEFAULT);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__MTU:
				setMTU(MTU_EDEFAULT);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__RSS_CAPABLE:
				setRSSCapable(RSS_CAPABLE_EDEFAULT);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__RDMA_CAPABLE:
				setRDMACapable(RDMA_CAPABLE_EDEFAULT);
				return;
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__LINK_SPEED:
				setLinkSpeed(LINK_SPEED_EDEFAULT);
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
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__IP_ADDRESS:
				return IP_ADDRESS_EDEFAULT == null ? ipAddress != null : !IP_ADDRESS_EDEFAULT.equals(ipAddress);
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__ADDRESS_TYPE:
				return ADDRESS_TYPE_EDEFAULT == null ? addressType != null : !ADDRESS_TYPE_EDEFAULT.equals(addressType);
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__SUBNET_MASK:
				return SUBNET_MASK_EDEFAULT == null ? subnetMask != null : !SUBNET_MASK_EDEFAULT.equals(subnetMask);
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__IPV6_PREFIX_LENGTH:
				return IPV6_PREFIX_LENGTH_EDEFAULT == null ? iPv6PrefixLength != null : !IPV6_PREFIX_LENGTH_EDEFAULT.equals(iPv6PrefixLength);
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__VLAN_ID:
				return VLAN_ID_EDEFAULT == null ? vlanId != null : !VLAN_ID_EDEFAULT.equals(vlanId);
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__MTU:
				return MTU_EDEFAULT == null ? mtu != null : !MTU_EDEFAULT.equals(mtu);
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__RSS_CAPABLE:
				return RSS_CAPABLE_EDEFAULT == null ? rssCapable != null : !RSS_CAPABLE_EDEFAULT.equals(rssCapable);
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__RDMA_CAPABLE:
				return RDMA_CAPABLE_EDEFAULT == null ? rdmaCapable != null : !RDMA_CAPABLE_EDEFAULT.equals(rdmaCapable);
			case CimPackage.CIM_IP_INTERFACE_SETTING_DATA__LINK_SPEED:
				return LINK_SPEED_EDEFAULT == null ? linkSpeed != null : !LINK_SPEED_EDEFAULT.equals(linkSpeed);
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
		result.append(" (IPAddress: ");
		result.append(ipAddress);
		result.append(", AddressType: ");
		result.append(addressType);
		result.append(", SubnetMask: ");
		result.append(subnetMask);
		result.append(", IPv6PrefixLength: ");
		result.append(iPv6PrefixLength);
		result.append(", VLANId: ");
		result.append(vlanId);
		result.append(", MTU: ");
		result.append(mtu);
		result.append(", RSSCapable: ");
		result.append(rssCapable);
		result.append(", RDMACapable: ");
		result.append(rdmaCapable);
		result.append(", LinkSpeed: ");
		result.append(linkSpeed);
		result.append(')');
		return result.toString();
	}

} //CIM_IPInterfaceSettingDataImpl

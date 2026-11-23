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

import org.dmtf.cim.CIM_StorageAllocationSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Allocation Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageAllocationSettingDataImpl#getVirtualResourceBlockSize <em>Virtual Resource Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageAllocationSettingDataImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageAllocationSettingDataImpl#getHostResourceBlockSize <em>Host Resource Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageAllocationSettingDataImpl#getHostExtentStartingAddress <em>Host Extent Starting Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageAllocationSettingDataImpl#getHostExtentName <em>Host Extent Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageAllocationSettingDataImpl#getHostExtentNameFormat <em>Host Extent Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageAllocationSettingDataImpl#getOtherHostExtentNameFormat <em>Other Host Extent Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageAllocationSettingDataImpl#getHostExtentNameNamespace <em>Host Extent Name Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageAllocationSettingDataImpl#getOtherHostExtentNameNamespace <em>Other Host Extent Name Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageAllocationSettingDataImpl extends CIM_ResourceAllocationSettingDataImpl implements CIM_StorageAllocationSettingData {
	/**
	 * The default value of the '{@link #getVirtualResourceBlockSize() <em>Virtual Resource Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualResourceBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long VIRTUAL_RESOURCE_BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualResourceBlockSize() <em>Virtual Resource Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualResourceBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Long virtualResourceBlockSize = VIRTUAL_RESOURCE_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected Integer access = ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostResourceBlockSize() <em>Host Resource Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostResourceBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long HOST_RESOURCE_BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostResourceBlockSize() <em>Host Resource Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostResourceBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Long hostResourceBlockSize = HOST_RESOURCE_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostExtentStartingAddress() <em>Host Extent Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostExtentStartingAddress()
	 * @generated
	 * @ordered
	 */
	protected static final Long HOST_EXTENT_STARTING_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostExtentStartingAddress() <em>Host Extent Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostExtentStartingAddress()
	 * @generated
	 * @ordered
	 */
	protected Long hostExtentStartingAddress = HOST_EXTENT_STARTING_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostExtentName() <em>Host Extent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostExtentName()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EXTENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostExtentName() <em>Host Extent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostExtentName()
	 * @generated
	 * @ordered
	 */
	protected String hostExtentName = HOST_EXTENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostExtentNameFormat() <em>Host Extent Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostExtentNameFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOST_EXTENT_NAME_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostExtentNameFormat() <em>Host Extent Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostExtentNameFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer hostExtentNameFormat = HOST_EXTENT_NAME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherHostExtentNameFormat() <em>Other Host Extent Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherHostExtentNameFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_HOST_EXTENT_NAME_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherHostExtentNameFormat() <em>Other Host Extent Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherHostExtentNameFormat()
	 * @generated
	 * @ordered
	 */
	protected String otherHostExtentNameFormat = OTHER_HOST_EXTENT_NAME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostExtentNameNamespace() <em>Host Extent Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostExtentNameNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOST_EXTENT_NAME_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostExtentNameNamespace() <em>Host Extent Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostExtentNameNamespace()
	 * @generated
	 * @ordered
	 */
	protected Integer hostExtentNameNamespace = HOST_EXTENT_NAME_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherHostExtentNameNamespace() <em>Other Host Extent Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherHostExtentNameNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_HOST_EXTENT_NAME_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherHostExtentNameNamespace() <em>Other Host Extent Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherHostExtentNameNamespace()
	 * @generated
	 * @ordered
	 */
	protected String otherHostExtentNameNamespace = OTHER_HOST_EXTENT_NAME_NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageAllocationSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageAllocationSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getVirtualResourceBlockSize() {
		return virtualResourceBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualResourceBlockSize(Long newVirtualResourceBlockSize) {
		Long oldVirtualResourceBlockSize = virtualResourceBlockSize;
		virtualResourceBlockSize = newVirtualResourceBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__VIRTUAL_RESOURCE_BLOCK_SIZE, oldVirtualResourceBlockSize, virtualResourceBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccess(Integer newAccess) {
		Integer oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHostResourceBlockSize() {
		return hostResourceBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostResourceBlockSize(Long newHostResourceBlockSize) {
		Long oldHostResourceBlockSize = hostResourceBlockSize;
		hostResourceBlockSize = newHostResourceBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_RESOURCE_BLOCK_SIZE, oldHostResourceBlockSize, hostResourceBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getHostExtentStartingAddress() {
		return hostExtentStartingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostExtentStartingAddress(Long newHostExtentStartingAddress) {
		Long oldHostExtentStartingAddress = hostExtentStartingAddress;
		hostExtentStartingAddress = newHostExtentStartingAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_STARTING_ADDRESS, oldHostExtentStartingAddress, hostExtentStartingAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostExtentName() {
		return hostExtentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostExtentName(String newHostExtentName) {
		String oldHostExtentName = hostExtentName;
		hostExtentName = newHostExtentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_NAME, oldHostExtentName, hostExtentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHostExtentNameFormat() {
		return hostExtentNameFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostExtentNameFormat(Integer newHostExtentNameFormat) {
		Integer oldHostExtentNameFormat = hostExtentNameFormat;
		hostExtentNameFormat = newHostExtentNameFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_NAME_FORMAT, oldHostExtentNameFormat, hostExtentNameFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherHostExtentNameFormat() {
		return otherHostExtentNameFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherHostExtentNameFormat(String newOtherHostExtentNameFormat) {
		String oldOtherHostExtentNameFormat = otherHostExtentNameFormat;
		otherHostExtentNameFormat = newOtherHostExtentNameFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__OTHER_HOST_EXTENT_NAME_FORMAT, oldOtherHostExtentNameFormat, otherHostExtentNameFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHostExtentNameNamespace() {
		return hostExtentNameNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostExtentNameNamespace(Integer newHostExtentNameNamespace) {
		Integer oldHostExtentNameNamespace = hostExtentNameNamespace;
		hostExtentNameNamespace = newHostExtentNameNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_NAME_NAMESPACE, oldHostExtentNameNamespace, hostExtentNameNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherHostExtentNameNamespace() {
		return otherHostExtentNameNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherHostExtentNameNamespace(String newOtherHostExtentNameNamespace) {
		String oldOtherHostExtentNameNamespace = otherHostExtentNameNamespace;
		otherHostExtentNameNamespace = newOtherHostExtentNameNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__OTHER_HOST_EXTENT_NAME_NAMESPACE, oldOtherHostExtentNameNamespace, otherHostExtentNameNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__VIRTUAL_RESOURCE_BLOCK_SIZE:
				return getVirtualResourceBlockSize();
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__ACCESS:
				return getAccess();
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_RESOURCE_BLOCK_SIZE:
				return getHostResourceBlockSize();
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_STARTING_ADDRESS:
				return getHostExtentStartingAddress();
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_NAME:
				return getHostExtentName();
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_NAME_FORMAT:
				return getHostExtentNameFormat();
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__OTHER_HOST_EXTENT_NAME_FORMAT:
				return getOtherHostExtentNameFormat();
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_NAME_NAMESPACE:
				return getHostExtentNameNamespace();
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__OTHER_HOST_EXTENT_NAME_NAMESPACE:
				return getOtherHostExtentNameNamespace();
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
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__VIRTUAL_RESOURCE_BLOCK_SIZE:
				setVirtualResourceBlockSize((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__ACCESS:
				setAccess((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_RESOURCE_BLOCK_SIZE:
				setHostResourceBlockSize((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_STARTING_ADDRESS:
				setHostExtentStartingAddress((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_NAME:
				setHostExtentName((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_NAME_FORMAT:
				setHostExtentNameFormat((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__OTHER_HOST_EXTENT_NAME_FORMAT:
				setOtherHostExtentNameFormat((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_NAME_NAMESPACE:
				setHostExtentNameNamespace((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__OTHER_HOST_EXTENT_NAME_NAMESPACE:
				setOtherHostExtentNameNamespace((String)newValue);
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
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__VIRTUAL_RESOURCE_BLOCK_SIZE:
				setVirtualResourceBlockSize(VIRTUAL_RESOURCE_BLOCK_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_RESOURCE_BLOCK_SIZE:
				setHostResourceBlockSize(HOST_RESOURCE_BLOCK_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_STARTING_ADDRESS:
				setHostExtentStartingAddress(HOST_EXTENT_STARTING_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_NAME:
				setHostExtentName(HOST_EXTENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_NAME_FORMAT:
				setHostExtentNameFormat(HOST_EXTENT_NAME_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__OTHER_HOST_EXTENT_NAME_FORMAT:
				setOtherHostExtentNameFormat(OTHER_HOST_EXTENT_NAME_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_NAME_NAMESPACE:
				setHostExtentNameNamespace(HOST_EXTENT_NAME_NAMESPACE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__OTHER_HOST_EXTENT_NAME_NAMESPACE:
				setOtherHostExtentNameNamespace(OTHER_HOST_EXTENT_NAME_NAMESPACE_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__VIRTUAL_RESOURCE_BLOCK_SIZE:
				return VIRTUAL_RESOURCE_BLOCK_SIZE_EDEFAULT == null ? virtualResourceBlockSize != null : !VIRTUAL_RESOURCE_BLOCK_SIZE_EDEFAULT.equals(virtualResourceBlockSize);
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_RESOURCE_BLOCK_SIZE:
				return HOST_RESOURCE_BLOCK_SIZE_EDEFAULT == null ? hostResourceBlockSize != null : !HOST_RESOURCE_BLOCK_SIZE_EDEFAULT.equals(hostResourceBlockSize);
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_STARTING_ADDRESS:
				return HOST_EXTENT_STARTING_ADDRESS_EDEFAULT == null ? hostExtentStartingAddress != null : !HOST_EXTENT_STARTING_ADDRESS_EDEFAULT.equals(hostExtentStartingAddress);
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_NAME:
				return HOST_EXTENT_NAME_EDEFAULT == null ? hostExtentName != null : !HOST_EXTENT_NAME_EDEFAULT.equals(hostExtentName);
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_NAME_FORMAT:
				return HOST_EXTENT_NAME_FORMAT_EDEFAULT == null ? hostExtentNameFormat != null : !HOST_EXTENT_NAME_FORMAT_EDEFAULT.equals(hostExtentNameFormat);
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__OTHER_HOST_EXTENT_NAME_FORMAT:
				return OTHER_HOST_EXTENT_NAME_FORMAT_EDEFAULT == null ? otherHostExtentNameFormat != null : !OTHER_HOST_EXTENT_NAME_FORMAT_EDEFAULT.equals(otherHostExtentNameFormat);
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__HOST_EXTENT_NAME_NAMESPACE:
				return HOST_EXTENT_NAME_NAMESPACE_EDEFAULT == null ? hostExtentNameNamespace != null : !HOST_EXTENT_NAME_NAMESPACE_EDEFAULT.equals(hostExtentNameNamespace);
			case CimPackage.CIM_STORAGE_ALLOCATION_SETTING_DATA__OTHER_HOST_EXTENT_NAME_NAMESPACE:
				return OTHER_HOST_EXTENT_NAME_NAMESPACE_EDEFAULT == null ? otherHostExtentNameNamespace != null : !OTHER_HOST_EXTENT_NAME_NAMESPACE_EDEFAULT.equals(otherHostExtentNameNamespace);
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
		result.append(" (VirtualResourceBlockSize: ");
		result.append(virtualResourceBlockSize);
		result.append(", Access: ");
		result.append(access);
		result.append(", HostResourceBlockSize: ");
		result.append(hostResourceBlockSize);
		result.append(", HostExtentStartingAddress: ");
		result.append(hostExtentStartingAddress);
		result.append(", HostExtentName: ");
		result.append(hostExtentName);
		result.append(", HostExtentNameFormat: ");
		result.append(hostExtentNameFormat);
		result.append(", OtherHostExtentNameFormat: ");
		result.append(otherHostExtentNameFormat);
		result.append(", HostExtentNameNamespace: ");
		result.append(hostExtentNameNamespace);
		result.append(", OtherHostExtentNameNamespace: ");
		result.append(otherHostExtentNameNamespace);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageAllocationSettingDataImpl

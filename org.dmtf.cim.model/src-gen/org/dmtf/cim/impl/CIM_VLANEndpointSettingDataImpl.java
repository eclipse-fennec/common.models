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

import org.dmtf.cim.CIM_VLANEndpointSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM VLAN Endpoint Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointSettingDataImpl#getPruneEligibleVLANList <em>Prune Eligible VLAN List</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointSettingDataImpl#getNativeVLAN <em>Native VLAN</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointSettingDataImpl#getDefaultVLAN <em>Default VLAN</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointSettingDataImpl#getTrunkedVLANList <em>Trunked VLAN List</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VLANEndpointSettingDataImpl#getAccessVLAN <em>Access VLAN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VLANEndpointSettingDataImpl extends CIM_SettingDataImpl implements CIM_VLANEndpointSettingData {
	/**
	 * The cached value of the '{@link #getPruneEligibleVLANList() <em>Prune Eligible VLAN List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruneEligibleVLANList()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> pruneEligibleVLANList;

	/**
	 * The default value of the '{@link #getNativeVLAN() <em>Native VLAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeVLAN()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NATIVE_VLAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNativeVLAN() <em>Native VLAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeVLAN()
	 * @generated
	 * @ordered
	 */
	protected Integer nativeVLAN = NATIVE_VLAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultVLAN() <em>Default VLAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultVLAN()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_VLAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultVLAN() <em>Default VLAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultVLAN()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultVLAN = DEFAULT_VLAN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrunkedVLANList() <em>Trunked VLAN List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrunkedVLANList()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> trunkedVLANList;

	/**
	 * The default value of the '{@link #getAccessVLAN() <em>Access VLAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessVLAN()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_VLAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessVLAN() <em>Access VLAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessVLAN()
	 * @generated
	 * @ordered
	 */
	protected Integer accessVLAN = ACCESS_VLAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VLANEndpointSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VLANEndpointSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPruneEligibleVLANList() {
		if (pruneEligibleVLANList == null) {
			pruneEligibleVLANList = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__PRUNE_ELIGIBLE_VLAN_LIST);
		}
		return pruneEligibleVLANList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNativeVLAN() {
		return nativeVLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNativeVLAN(Integer newNativeVLAN) {
		Integer oldNativeVLAN = nativeVLAN;
		nativeVLAN = newNativeVLAN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__NATIVE_VLAN, oldNativeVLAN, nativeVLAN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDefaultVLAN() {
		return defaultVLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultVLAN(Integer newDefaultVLAN) {
		Integer oldDefaultVLAN = defaultVLAN;
		defaultVLAN = newDefaultVLAN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__DEFAULT_VLAN, oldDefaultVLAN, defaultVLAN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getTrunkedVLANList() {
		if (trunkedVLANList == null) {
			trunkedVLANList = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__TRUNKED_VLAN_LIST);
		}
		return trunkedVLANList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccessVLAN() {
		return accessVLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessVLAN(Integer newAccessVLAN) {
		Integer oldAccessVLAN = accessVLAN;
		accessVLAN = newAccessVLAN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__ACCESS_VLAN, oldAccessVLAN, accessVLAN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__PRUNE_ELIGIBLE_VLAN_LIST:
				return getPruneEligibleVLANList();
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__NATIVE_VLAN:
				return getNativeVLAN();
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__DEFAULT_VLAN:
				return getDefaultVLAN();
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__TRUNKED_VLAN_LIST:
				return getTrunkedVLANList();
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__ACCESS_VLAN:
				return getAccessVLAN();
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
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__PRUNE_ELIGIBLE_VLAN_LIST:
				getPruneEligibleVLANList().clear();
				getPruneEligibleVLANList().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__NATIVE_VLAN:
				setNativeVLAN((Integer)newValue);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__DEFAULT_VLAN:
				setDefaultVLAN((Integer)newValue);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__TRUNKED_VLAN_LIST:
				getTrunkedVLANList().clear();
				getTrunkedVLANList().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__ACCESS_VLAN:
				setAccessVLAN((Integer)newValue);
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
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__PRUNE_ELIGIBLE_VLAN_LIST:
				getPruneEligibleVLANList().clear();
				return;
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__NATIVE_VLAN:
				setNativeVLAN(NATIVE_VLAN_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__DEFAULT_VLAN:
				setDefaultVLAN(DEFAULT_VLAN_EDEFAULT);
				return;
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__TRUNKED_VLAN_LIST:
				getTrunkedVLANList().clear();
				return;
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__ACCESS_VLAN:
				setAccessVLAN(ACCESS_VLAN_EDEFAULT);
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
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__PRUNE_ELIGIBLE_VLAN_LIST:
				return pruneEligibleVLANList != null && !pruneEligibleVLANList.isEmpty();
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__NATIVE_VLAN:
				return NATIVE_VLAN_EDEFAULT == null ? nativeVLAN != null : !NATIVE_VLAN_EDEFAULT.equals(nativeVLAN);
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__DEFAULT_VLAN:
				return DEFAULT_VLAN_EDEFAULT == null ? defaultVLAN != null : !DEFAULT_VLAN_EDEFAULT.equals(defaultVLAN);
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__TRUNKED_VLAN_LIST:
				return trunkedVLANList != null && !trunkedVLANList.isEmpty();
			case CimPackage.CIM_VLAN_ENDPOINT_SETTING_DATA__ACCESS_VLAN:
				return ACCESS_VLAN_EDEFAULT == null ? accessVLAN != null : !ACCESS_VLAN_EDEFAULT.equals(accessVLAN);
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
		result.append(" (PruneEligibleVLANList: ");
		result.append(pruneEligibleVLANList);
		result.append(", NativeVLAN: ");
		result.append(nativeVLAN);
		result.append(", DefaultVLAN: ");
		result.append(defaultVLAN);
		result.append(", TrunkedVLANList: ");
		result.append(trunkedVLANList);
		result.append(", AccessVLAN: ");
		result.append(accessVLAN);
		result.append(')');
		return result.toString();
	}

} //CIM_VLANEndpointSettingDataImpl

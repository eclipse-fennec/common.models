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

import org.dmtf.cim.CIM_NetworkPortCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Network Port Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortCapabilitiesImpl#getSpeedConfigurable <em>Speed Configurable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortCapabilitiesImpl#getPortSpeedsSupported <em>Port Speeds Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortCapabilitiesImpl#getNetworkIDsConfigurable <em>Network IDs Configurable</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortCapabilitiesImpl#getNetworkIDsFormat <em>Network IDs Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortCapabilitiesImpl#getLinkTechnologiesSupported <em>Link Technologies Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NetworkPortCapabilitiesImpl extends CIM_LogicalPortCapabilitiesImpl implements CIM_NetworkPortCapabilities {
	/**
	 * The default value of the '{@link #getSpeedConfigurable() <em>Speed Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedConfigurable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SPEED_CONFIGURABLE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSpeedConfigurable() <em>Speed Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedConfigurable()
	 * @generated
	 * @ordered
	 */
	protected Boolean speedConfigurable = SPEED_CONFIGURABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortSpeedsSupported() <em>Port Speeds Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortSpeedsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> portSpeedsSupported;

	/**
	 * The default value of the '{@link #getNetworkIDsConfigurable() <em>Network IDs Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkIDsConfigurable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NETWORK_IDS_CONFIGURABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkIDsConfigurable() <em>Network IDs Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkIDsConfigurable()
	 * @generated
	 * @ordered
	 */
	protected Boolean networkIDsConfigurable = NETWORK_IDS_CONFIGURABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetworkIDsFormat() <em>Network IDs Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkIDsFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NETWORK_IDS_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkIDsFormat() <em>Network IDs Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkIDsFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer networkIDsFormat = NETWORK_IDS_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkTechnologiesSupported() <em>Link Technologies Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTechnologiesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> linkTechnologiesSupported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NetworkPortCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NetworkPortCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSpeedConfigurable() {
		return speedConfigurable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeedConfigurable(Boolean newSpeedConfigurable) {
		Boolean oldSpeedConfigurable = speedConfigurable;
		speedConfigurable = newSpeedConfigurable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PORT_CAPABILITIES__SPEED_CONFIGURABLE, oldSpeedConfigurable, speedConfigurable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getPortSpeedsSupported() {
		if (portSpeedsSupported == null) {
			portSpeedsSupported = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_NETWORK_PORT_CAPABILITIES__PORT_SPEEDS_SUPPORTED);
		}
		return portSpeedsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNetworkIDsConfigurable() {
		return networkIDsConfigurable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkIDsConfigurable(Boolean newNetworkIDsConfigurable) {
		Boolean oldNetworkIDsConfigurable = networkIDsConfigurable;
		networkIDsConfigurable = newNetworkIDsConfigurable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PORT_CAPABILITIES__NETWORK_IDS_CONFIGURABLE, oldNetworkIDsConfigurable, networkIDsConfigurable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNetworkIDsFormat() {
		return networkIDsFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkIDsFormat(Integer newNetworkIDsFormat) {
		Integer oldNetworkIDsFormat = networkIDsFormat;
		networkIDsFormat = newNetworkIDsFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PORT_CAPABILITIES__NETWORK_IDS_FORMAT, oldNetworkIDsFormat, networkIDsFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLinkTechnologiesSupported() {
		if (linkTechnologiesSupported == null) {
			linkTechnologiesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_NETWORK_PORT_CAPABILITIES__LINK_TECHNOLOGIES_SUPPORTED);
		}
		return linkTechnologiesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__SPEED_CONFIGURABLE:
				return getSpeedConfigurable();
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__PORT_SPEEDS_SUPPORTED:
				return getPortSpeedsSupported();
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__NETWORK_IDS_CONFIGURABLE:
				return getNetworkIDsConfigurable();
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__NETWORK_IDS_FORMAT:
				return getNetworkIDsFormat();
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__LINK_TECHNOLOGIES_SUPPORTED:
				return getLinkTechnologiesSupported();
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
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__SPEED_CONFIGURABLE:
				setSpeedConfigurable((Boolean)newValue);
				return;
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__PORT_SPEEDS_SUPPORTED:
				getPortSpeedsSupported().clear();
				getPortSpeedsSupported().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__NETWORK_IDS_CONFIGURABLE:
				setNetworkIDsConfigurable((Boolean)newValue);
				return;
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__NETWORK_IDS_FORMAT:
				setNetworkIDsFormat((Integer)newValue);
				return;
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__LINK_TECHNOLOGIES_SUPPORTED:
				getLinkTechnologiesSupported().clear();
				getLinkTechnologiesSupported().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__SPEED_CONFIGURABLE:
				setSpeedConfigurable(SPEED_CONFIGURABLE_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__PORT_SPEEDS_SUPPORTED:
				getPortSpeedsSupported().clear();
				return;
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__NETWORK_IDS_CONFIGURABLE:
				setNetworkIDsConfigurable(NETWORK_IDS_CONFIGURABLE_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__NETWORK_IDS_FORMAT:
				setNetworkIDsFormat(NETWORK_IDS_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__LINK_TECHNOLOGIES_SUPPORTED:
				getLinkTechnologiesSupported().clear();
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
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__SPEED_CONFIGURABLE:
				return SPEED_CONFIGURABLE_EDEFAULT == null ? speedConfigurable != null : !SPEED_CONFIGURABLE_EDEFAULT.equals(speedConfigurable);
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__PORT_SPEEDS_SUPPORTED:
				return portSpeedsSupported != null && !portSpeedsSupported.isEmpty();
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__NETWORK_IDS_CONFIGURABLE:
				return NETWORK_IDS_CONFIGURABLE_EDEFAULT == null ? networkIDsConfigurable != null : !NETWORK_IDS_CONFIGURABLE_EDEFAULT.equals(networkIDsConfigurable);
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__NETWORK_IDS_FORMAT:
				return NETWORK_IDS_FORMAT_EDEFAULT == null ? networkIDsFormat != null : !NETWORK_IDS_FORMAT_EDEFAULT.equals(networkIDsFormat);
			case CimPackage.CIM_NETWORK_PORT_CAPABILITIES__LINK_TECHNOLOGIES_SUPPORTED:
				return linkTechnologiesSupported != null && !linkTechnologiesSupported.isEmpty();
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
		result.append(" (SpeedConfigurable: ");
		result.append(speedConfigurable);
		result.append(", PortSpeedsSupported: ");
		result.append(portSpeedsSupported);
		result.append(", NetworkIDsConfigurable: ");
		result.append(networkIDsConfigurable);
		result.append(", NetworkIDsFormat: ");
		result.append(networkIDsFormat);
		result.append(", LinkTechnologiesSupported: ");
		result.append(linkTechnologiesSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_NetworkPortCapabilitiesImpl

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

import org.dmtf.cim.CIM_EthernetPort;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Ethernet Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortImpl#getMaxDataSize <em>Max Data Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortImpl#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortImpl#getCapabilityDescriptions <em>Capability Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortImpl#getEnabledCapabilities <em>Enabled Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortImpl#getOtherEnabledCapabilities <em>Other Enabled Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortImpl#getPVID <em>PVID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortImpl#getPoEPowerEntityType <em>Po EPower Entity Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EthernetPortImpl#getPortDiscriminator <em>Port Discriminator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_EthernetPortImpl extends CIM_NetworkPortImpl implements CIM_EthernetPort {
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
	 * The cached value of the '{@link #getEnabledCapabilities() <em>Enabled Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> enabledCapabilities;

	/**
	 * The cached value of the '{@link #getOtherEnabledCapabilities() <em>Other Enabled Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherEnabledCapabilities;

	/**
	 * The default value of the '{@link #getPVID() <em>PVID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPVID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PVID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPVID() <em>PVID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPVID()
	 * @generated
	 * @ordered
	 */
	protected Integer pvid = PVID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoEPowerEntityType() <em>Po EPower Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoEPowerEntityType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PO_EPOWER_ENTITY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPoEPowerEntityType() <em>Po EPower Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoEPowerEntityType()
	 * @generated
	 * @ordered
	 */
	protected Integer poEPowerEntityType = PO_EPOWER_ENTITY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortDiscriminator() <em>Port Discriminator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected EList<String> portDiscriminator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_EthernetPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_EthernetPort();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT__MAX_DATA_SIZE, oldMaxDataSize, maxDataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ETHERNET_PORT__CAPABILITIES);
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
			capabilityDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ETHERNET_PORT__CAPABILITY_DESCRIPTIONS);
		}
		return capabilityDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getEnabledCapabilities() {
		if (enabledCapabilities == null) {
			enabledCapabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ETHERNET_PORT__ENABLED_CAPABILITIES);
		}
		return enabledCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherEnabledCapabilities() {
		if (otherEnabledCapabilities == null) {
			otherEnabledCapabilities = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ETHERNET_PORT__OTHER_ENABLED_CAPABILITIES);
		}
		return otherEnabledCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPVID() {
		return pvid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPVID(Integer newPVID) {
		Integer oldPVID = pvid;
		pvid = newPVID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT__PVID, oldPVID, pvid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPoEPowerEntityType() {
		return poEPowerEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoEPowerEntityType(Integer newPoEPowerEntityType) {
		Integer oldPoEPowerEntityType = poEPowerEntityType;
		poEPowerEntityType = newPoEPowerEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ETHERNET_PORT__PO_EPOWER_ENTITY_TYPE, oldPoEPowerEntityType, poEPowerEntityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPortDiscriminator() {
		if (portDiscriminator == null) {
			portDiscriminator = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_ETHERNET_PORT__PORT_DISCRIMINATOR);
		}
		return portDiscriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ETHERNET_PORT__MAX_DATA_SIZE:
				return getMaxDataSize();
			case CimPackage.CIM_ETHERNET_PORT__CAPABILITIES:
				return getCapabilities();
			case CimPackage.CIM_ETHERNET_PORT__CAPABILITY_DESCRIPTIONS:
				return getCapabilityDescriptions();
			case CimPackage.CIM_ETHERNET_PORT__ENABLED_CAPABILITIES:
				return getEnabledCapabilities();
			case CimPackage.CIM_ETHERNET_PORT__OTHER_ENABLED_CAPABILITIES:
				return getOtherEnabledCapabilities();
			case CimPackage.CIM_ETHERNET_PORT__PVID:
				return getPVID();
			case CimPackage.CIM_ETHERNET_PORT__PO_EPOWER_ENTITY_TYPE:
				return getPoEPowerEntityType();
			case CimPackage.CIM_ETHERNET_PORT__PORT_DISCRIMINATOR:
				return getPortDiscriminator();
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
			case CimPackage.CIM_ETHERNET_PORT__MAX_DATA_SIZE:
				setMaxDataSize((Long)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT__CAPABILITIES:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				getCapabilityDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT__ENABLED_CAPABILITIES:
				getEnabledCapabilities().clear();
				getEnabledCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT__OTHER_ENABLED_CAPABILITIES:
				getOtherEnabledCapabilities().clear();
				getOtherEnabledCapabilities().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT__PVID:
				setPVID((Integer)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT__PO_EPOWER_ENTITY_TYPE:
				setPoEPowerEntityType((Integer)newValue);
				return;
			case CimPackage.CIM_ETHERNET_PORT__PORT_DISCRIMINATOR:
				getPortDiscriminator().clear();
				getPortDiscriminator().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_ETHERNET_PORT__MAX_DATA_SIZE:
				setMaxDataSize(MAX_DATA_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT__CAPABILITIES:
				getCapabilities().clear();
				return;
			case CimPackage.CIM_ETHERNET_PORT__CAPABILITY_DESCRIPTIONS:
				getCapabilityDescriptions().clear();
				return;
			case CimPackage.CIM_ETHERNET_PORT__ENABLED_CAPABILITIES:
				getEnabledCapabilities().clear();
				return;
			case CimPackage.CIM_ETHERNET_PORT__OTHER_ENABLED_CAPABILITIES:
				getOtherEnabledCapabilities().clear();
				return;
			case CimPackage.CIM_ETHERNET_PORT__PVID:
				setPVID(PVID_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT__PO_EPOWER_ENTITY_TYPE:
				setPoEPowerEntityType(PO_EPOWER_ENTITY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ETHERNET_PORT__PORT_DISCRIMINATOR:
				getPortDiscriminator().clear();
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
			case CimPackage.CIM_ETHERNET_PORT__MAX_DATA_SIZE:
				return MAX_DATA_SIZE_EDEFAULT == null ? maxDataSize != null : !MAX_DATA_SIZE_EDEFAULT.equals(maxDataSize);
			case CimPackage.CIM_ETHERNET_PORT__CAPABILITIES:
				return capabilities != null && !capabilities.isEmpty();
			case CimPackage.CIM_ETHERNET_PORT__CAPABILITY_DESCRIPTIONS:
				return capabilityDescriptions != null && !capabilityDescriptions.isEmpty();
			case CimPackage.CIM_ETHERNET_PORT__ENABLED_CAPABILITIES:
				return enabledCapabilities != null && !enabledCapabilities.isEmpty();
			case CimPackage.CIM_ETHERNET_PORT__OTHER_ENABLED_CAPABILITIES:
				return otherEnabledCapabilities != null && !otherEnabledCapabilities.isEmpty();
			case CimPackage.CIM_ETHERNET_PORT__PVID:
				return PVID_EDEFAULT == null ? pvid != null : !PVID_EDEFAULT.equals(pvid);
			case CimPackage.CIM_ETHERNET_PORT__PO_EPOWER_ENTITY_TYPE:
				return PO_EPOWER_ENTITY_TYPE_EDEFAULT == null ? poEPowerEntityType != null : !PO_EPOWER_ENTITY_TYPE_EDEFAULT.equals(poEPowerEntityType);
			case CimPackage.CIM_ETHERNET_PORT__PORT_DISCRIMINATOR:
				return portDiscriminator != null && !portDiscriminator.isEmpty();
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
		result.append(" (MaxDataSize: ");
		result.append(maxDataSize);
		result.append(", Capabilities: ");
		result.append(capabilities);
		result.append(", CapabilityDescriptions: ");
		result.append(capabilityDescriptions);
		result.append(", EnabledCapabilities: ");
		result.append(enabledCapabilities);
		result.append(", OtherEnabledCapabilities: ");
		result.append(otherEnabledCapabilities);
		result.append(", PVID: ");
		result.append(pvid);
		result.append(", PoEPowerEntityType: ");
		result.append(poEPowerEntityType);
		result.append(", PortDiscriminator: ");
		result.append(portDiscriminator);
		result.append(')');
		return result.toString();
	}

} //CIM_EthernetPortImpl

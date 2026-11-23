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

import org.dmtf.cim.CIM_NetworkPort;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Network Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortImpl#getOtherNetworkPortType <em>Other Network Port Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortImpl#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortImpl#getLinkTechnology <em>Link Technology</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortImpl#getOtherLinkTechnology <em>Other Link Technology</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortImpl#getPermanentAddress <em>Permanent Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortImpl#getNetworkAddresses <em>Network Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortImpl#getFullDuplex <em>Full Duplex</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortImpl#getAutoSense <em>Auto Sense</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortImpl#getSupportedMaximumTransmissionUnit <em>Supported Maximum Transmission Unit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPortImpl#getActiveMaximumTransmissionUnit <em>Active Maximum Transmission Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NetworkPortImpl extends CIM_LogicalPortImpl implements CIM_NetworkPort {
	/**
	 * The default value of the '{@link #getOtherNetworkPortType() <em>Other Network Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherNetworkPortType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_NETWORK_PORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherNetworkPortType() <em>Other Network Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherNetworkPortType()
	 * @generated
	 * @ordered
	 */
	protected String otherNetworkPortType = OTHER_NETWORK_PORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer portNumber = PORT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkTechnology() <em>Link Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LINK_TECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkTechnology() <em>Link Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTechnology()
	 * @generated
	 * @ordered
	 */
	protected Integer linkTechnology = LINK_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherLinkTechnology() <em>Other Link Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLinkTechnology()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_LINK_TECHNOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherLinkTechnology() <em>Other Link Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherLinkTechnology()
	 * @generated
	 * @ordered
	 */
	protected String otherLinkTechnology = OTHER_LINK_TECHNOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPermanentAddress() <em>Permanent Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermanentAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMANENT_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermanentAddress() <em>Permanent Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermanentAddress()
	 * @generated
	 * @ordered
	 */
	protected String permanentAddress = PERMANENT_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNetworkAddresses() <em>Network Addresses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> networkAddresses;

	/**
	 * The default value of the '{@link #getFullDuplex() <em>Full Duplex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullDuplex()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FULL_DUPLEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullDuplex() <em>Full Duplex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullDuplex()
	 * @generated
	 * @ordered
	 */
	protected Boolean fullDuplex = FULL_DUPLEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoSense() <em>Auto Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoSense()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_SENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoSense() <em>Auto Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoSense()
	 * @generated
	 * @ordered
	 */
	protected Boolean autoSense = AUTO_SENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupportedMaximumTransmissionUnit() <em>Supported Maximum Transmission Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedMaximumTransmissionUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Long SUPPORTED_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportedMaximumTransmissionUnit() <em>Supported Maximum Transmission Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedMaximumTransmissionUnit()
	 * @generated
	 * @ordered
	 */
	protected Long supportedMaximumTransmissionUnit = SUPPORTED_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getActiveMaximumTransmissionUnit() <em>Active Maximum Transmission Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveMaximumTransmissionUnit()
	 * @generated
	 * @ordered
	 */
	protected static final Long ACTIVE_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiveMaximumTransmissionUnit() <em>Active Maximum Transmission Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveMaximumTransmissionUnit()
	 * @generated
	 * @ordered
	 */
	protected Long activeMaximumTransmissionUnit = ACTIVE_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NetworkPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NetworkPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherNetworkPortType() {
		return otherNetworkPortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherNetworkPortType(String newOtherNetworkPortType) {
		String oldOtherNetworkPortType = otherNetworkPortType;
		otherNetworkPortType = newOtherNetworkPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PORT__OTHER_NETWORK_PORT_TYPE, oldOtherNetworkPortType, otherNetworkPortType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPortNumber() {
		return portNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortNumber(Integer newPortNumber) {
		Integer oldPortNumber = portNumber;
		portNumber = newPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PORT__PORT_NUMBER, oldPortNumber, portNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLinkTechnology() {
		return linkTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkTechnology(Integer newLinkTechnology) {
		Integer oldLinkTechnology = linkTechnology;
		linkTechnology = newLinkTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PORT__LINK_TECHNOLOGY, oldLinkTechnology, linkTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherLinkTechnology() {
		return otherLinkTechnology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherLinkTechnology(String newOtherLinkTechnology) {
		String oldOtherLinkTechnology = otherLinkTechnology;
		otherLinkTechnology = newOtherLinkTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PORT__OTHER_LINK_TECHNOLOGY, oldOtherLinkTechnology, otherLinkTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPermanentAddress() {
		return permanentAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPermanentAddress(String newPermanentAddress) {
		String oldPermanentAddress = permanentAddress;
		permanentAddress = newPermanentAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PORT__PERMANENT_ADDRESS, oldPermanentAddress, permanentAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNetworkAddresses() {
		if (networkAddresses == null) {
			networkAddresses = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_NETWORK_PORT__NETWORK_ADDRESSES);
		}
		return networkAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFullDuplex() {
		return fullDuplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFullDuplex(Boolean newFullDuplex) {
		Boolean oldFullDuplex = fullDuplex;
		fullDuplex = newFullDuplex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PORT__FULL_DUPLEX, oldFullDuplex, fullDuplex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutoSense() {
		return autoSense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoSense(Boolean newAutoSense) {
		Boolean oldAutoSense = autoSense;
		autoSense = newAutoSense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PORT__AUTO_SENSE, oldAutoSense, autoSense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSupportedMaximumTransmissionUnit() {
		return supportedMaximumTransmissionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportedMaximumTransmissionUnit(Long newSupportedMaximumTransmissionUnit) {
		Long oldSupportedMaximumTransmissionUnit = supportedMaximumTransmissionUnit;
		supportedMaximumTransmissionUnit = newSupportedMaximumTransmissionUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PORT__SUPPORTED_MAXIMUM_TRANSMISSION_UNIT, oldSupportedMaximumTransmissionUnit, supportedMaximumTransmissionUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getActiveMaximumTransmissionUnit() {
		return activeMaximumTransmissionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveMaximumTransmissionUnit(Long newActiveMaximumTransmissionUnit) {
		Long oldActiveMaximumTransmissionUnit = activeMaximumTransmissionUnit;
		activeMaximumTransmissionUnit = newActiveMaximumTransmissionUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PORT__ACTIVE_MAXIMUM_TRANSMISSION_UNIT, oldActiveMaximumTransmissionUnit, activeMaximumTransmissionUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NETWORK_PORT__OTHER_NETWORK_PORT_TYPE:
				return getOtherNetworkPortType();
			case CimPackage.CIM_NETWORK_PORT__PORT_NUMBER:
				return getPortNumber();
			case CimPackage.CIM_NETWORK_PORT__LINK_TECHNOLOGY:
				return getLinkTechnology();
			case CimPackage.CIM_NETWORK_PORT__OTHER_LINK_TECHNOLOGY:
				return getOtherLinkTechnology();
			case CimPackage.CIM_NETWORK_PORT__PERMANENT_ADDRESS:
				return getPermanentAddress();
			case CimPackage.CIM_NETWORK_PORT__NETWORK_ADDRESSES:
				return getNetworkAddresses();
			case CimPackage.CIM_NETWORK_PORT__FULL_DUPLEX:
				return getFullDuplex();
			case CimPackage.CIM_NETWORK_PORT__AUTO_SENSE:
				return getAutoSense();
			case CimPackage.CIM_NETWORK_PORT__SUPPORTED_MAXIMUM_TRANSMISSION_UNIT:
				return getSupportedMaximumTransmissionUnit();
			case CimPackage.CIM_NETWORK_PORT__ACTIVE_MAXIMUM_TRANSMISSION_UNIT:
				return getActiveMaximumTransmissionUnit();
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
			case CimPackage.CIM_NETWORK_PORT__OTHER_NETWORK_PORT_TYPE:
				setOtherNetworkPortType((String)newValue);
				return;
			case CimPackage.CIM_NETWORK_PORT__PORT_NUMBER:
				setPortNumber((Integer)newValue);
				return;
			case CimPackage.CIM_NETWORK_PORT__LINK_TECHNOLOGY:
				setLinkTechnology((Integer)newValue);
				return;
			case CimPackage.CIM_NETWORK_PORT__OTHER_LINK_TECHNOLOGY:
				setOtherLinkTechnology((String)newValue);
				return;
			case CimPackage.CIM_NETWORK_PORT__PERMANENT_ADDRESS:
				setPermanentAddress((String)newValue);
				return;
			case CimPackage.CIM_NETWORK_PORT__NETWORK_ADDRESSES:
				getNetworkAddresses().clear();
				getNetworkAddresses().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_NETWORK_PORT__FULL_DUPLEX:
				setFullDuplex((Boolean)newValue);
				return;
			case CimPackage.CIM_NETWORK_PORT__AUTO_SENSE:
				setAutoSense((Boolean)newValue);
				return;
			case CimPackage.CIM_NETWORK_PORT__SUPPORTED_MAXIMUM_TRANSMISSION_UNIT:
				setSupportedMaximumTransmissionUnit((Long)newValue);
				return;
			case CimPackage.CIM_NETWORK_PORT__ACTIVE_MAXIMUM_TRANSMISSION_UNIT:
				setActiveMaximumTransmissionUnit((Long)newValue);
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
			case CimPackage.CIM_NETWORK_PORT__OTHER_NETWORK_PORT_TYPE:
				setOtherNetworkPortType(OTHER_NETWORK_PORT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_PORT__PORT_NUMBER:
				setPortNumber(PORT_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_PORT__LINK_TECHNOLOGY:
				setLinkTechnology(LINK_TECHNOLOGY_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_PORT__OTHER_LINK_TECHNOLOGY:
				setOtherLinkTechnology(OTHER_LINK_TECHNOLOGY_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_PORT__PERMANENT_ADDRESS:
				setPermanentAddress(PERMANENT_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_PORT__NETWORK_ADDRESSES:
				getNetworkAddresses().clear();
				return;
			case CimPackage.CIM_NETWORK_PORT__FULL_DUPLEX:
				setFullDuplex(FULL_DUPLEX_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_PORT__AUTO_SENSE:
				setAutoSense(AUTO_SENSE_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_PORT__SUPPORTED_MAXIMUM_TRANSMISSION_UNIT:
				setSupportedMaximumTransmissionUnit(SUPPORTED_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_PORT__ACTIVE_MAXIMUM_TRANSMISSION_UNIT:
				setActiveMaximumTransmissionUnit(ACTIVE_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT);
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
			case CimPackage.CIM_NETWORK_PORT__OTHER_NETWORK_PORT_TYPE:
				return OTHER_NETWORK_PORT_TYPE_EDEFAULT == null ? otherNetworkPortType != null : !OTHER_NETWORK_PORT_TYPE_EDEFAULT.equals(otherNetworkPortType);
			case CimPackage.CIM_NETWORK_PORT__PORT_NUMBER:
				return PORT_NUMBER_EDEFAULT == null ? portNumber != null : !PORT_NUMBER_EDEFAULT.equals(portNumber);
			case CimPackage.CIM_NETWORK_PORT__LINK_TECHNOLOGY:
				return LINK_TECHNOLOGY_EDEFAULT == null ? linkTechnology != null : !LINK_TECHNOLOGY_EDEFAULT.equals(linkTechnology);
			case CimPackage.CIM_NETWORK_PORT__OTHER_LINK_TECHNOLOGY:
				return OTHER_LINK_TECHNOLOGY_EDEFAULT == null ? otherLinkTechnology != null : !OTHER_LINK_TECHNOLOGY_EDEFAULT.equals(otherLinkTechnology);
			case CimPackage.CIM_NETWORK_PORT__PERMANENT_ADDRESS:
				return PERMANENT_ADDRESS_EDEFAULT == null ? permanentAddress != null : !PERMANENT_ADDRESS_EDEFAULT.equals(permanentAddress);
			case CimPackage.CIM_NETWORK_PORT__NETWORK_ADDRESSES:
				return networkAddresses != null && !networkAddresses.isEmpty();
			case CimPackage.CIM_NETWORK_PORT__FULL_DUPLEX:
				return FULL_DUPLEX_EDEFAULT == null ? fullDuplex != null : !FULL_DUPLEX_EDEFAULT.equals(fullDuplex);
			case CimPackage.CIM_NETWORK_PORT__AUTO_SENSE:
				return AUTO_SENSE_EDEFAULT == null ? autoSense != null : !AUTO_SENSE_EDEFAULT.equals(autoSense);
			case CimPackage.CIM_NETWORK_PORT__SUPPORTED_MAXIMUM_TRANSMISSION_UNIT:
				return SUPPORTED_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT == null ? supportedMaximumTransmissionUnit != null : !SUPPORTED_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT.equals(supportedMaximumTransmissionUnit);
			case CimPackage.CIM_NETWORK_PORT__ACTIVE_MAXIMUM_TRANSMISSION_UNIT:
				return ACTIVE_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT == null ? activeMaximumTransmissionUnit != null : !ACTIVE_MAXIMUM_TRANSMISSION_UNIT_EDEFAULT.equals(activeMaximumTransmissionUnit);
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
		result.append(" (OtherNetworkPortType: ");
		result.append(otherNetworkPortType);
		result.append(", PortNumber: ");
		result.append(portNumber);
		result.append(", LinkTechnology: ");
		result.append(linkTechnology);
		result.append(", OtherLinkTechnology: ");
		result.append(otherLinkTechnology);
		result.append(", PermanentAddress: ");
		result.append(permanentAddress);
		result.append(", NetworkAddresses: ");
		result.append(networkAddresses);
		result.append(", FullDuplex: ");
		result.append(fullDuplex);
		result.append(", AutoSense: ");
		result.append(autoSense);
		result.append(", SupportedMaximumTransmissionUnit: ");
		result.append(supportedMaximumTransmissionUnit);
		result.append(", ActiveMaximumTransmissionUnit: ");
		result.append(activeMaximumTransmissionUnit);
		result.append(')');
		return result.toString();
	}

} //CIM_NetworkPortImpl

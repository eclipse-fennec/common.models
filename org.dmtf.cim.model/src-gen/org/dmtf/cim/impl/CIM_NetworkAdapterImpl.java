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

import org.dmtf.cim.CIM_NetworkAdapter;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Network Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkAdapterImpl#getPermanentAddress <em>Permanent Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkAdapterImpl#getNetworkAddresses <em>Network Addresses</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkAdapterImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkAdapterImpl#getMaxSpeed <em>Max Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkAdapterImpl#getFullDuplex <em>Full Duplex</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkAdapterImpl#getAutoSense <em>Auto Sense</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkAdapterImpl#getOctetsTransmitted <em>Octets Transmitted</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkAdapterImpl#getOctetsReceived <em>Octets Received</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_NetworkAdapterImpl extends CIM_LogicalDeviceImpl implements CIM_NetworkAdapter {
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
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSpeed() <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxSpeed() <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long maxSpeed = MAX_SPEED_EDEFAULT;

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
	 * The default value of the '{@link #getOctetsTransmitted() <em>Octets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOctetsTransmitted()
	 * @generated
	 * @ordered
	 */
	protected static final Long OCTETS_TRANSMITTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOctetsTransmitted() <em>Octets Transmitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOctetsTransmitted()
	 * @generated
	 * @ordered
	 */
	protected Long octetsTransmitted = OCTETS_TRANSMITTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getOctetsReceived() <em>Octets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOctetsReceived()
	 * @generated
	 * @ordered
	 */
	protected static final Long OCTETS_RECEIVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOctetsReceived() <em>Octets Received</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOctetsReceived()
	 * @generated
	 * @ordered
	 */
	protected Long octetsReceived = OCTETS_RECEIVED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NetworkAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NetworkAdapter();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_ADAPTER__PERMANENT_ADDRESS, oldPermanentAddress, permanentAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNetworkAddresses() {
		if (networkAddresses == null) {
			networkAddresses = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_NETWORK_ADAPTER__NETWORK_ADDRESSES);
		}
		return networkAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpeed(Long newSpeed) {
		Long oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_ADAPTER__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSpeed(Long newMaxSpeed) {
		Long oldMaxSpeed = maxSpeed;
		maxSpeed = newMaxSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_ADAPTER__MAX_SPEED, oldMaxSpeed, maxSpeed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_ADAPTER__FULL_DUPLEX, oldFullDuplex, fullDuplex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_ADAPTER__AUTO_SENSE, oldAutoSense, autoSense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getOctetsTransmitted() {
		return octetsTransmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOctetsTransmitted(Long newOctetsTransmitted) {
		Long oldOctetsTransmitted = octetsTransmitted;
		octetsTransmitted = newOctetsTransmitted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_ADAPTER__OCTETS_TRANSMITTED, oldOctetsTransmitted, octetsTransmitted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getOctetsReceived() {
		return octetsReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOctetsReceived(Long newOctetsReceived) {
		Long oldOctetsReceived = octetsReceived;
		octetsReceived = newOctetsReceived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_ADAPTER__OCTETS_RECEIVED, oldOctetsReceived, octetsReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NETWORK_ADAPTER__PERMANENT_ADDRESS:
				return getPermanentAddress();
			case CimPackage.CIM_NETWORK_ADAPTER__NETWORK_ADDRESSES:
				return getNetworkAddresses();
			case CimPackage.CIM_NETWORK_ADAPTER__SPEED:
				return getSpeed();
			case CimPackage.CIM_NETWORK_ADAPTER__MAX_SPEED:
				return getMaxSpeed();
			case CimPackage.CIM_NETWORK_ADAPTER__FULL_DUPLEX:
				return getFullDuplex();
			case CimPackage.CIM_NETWORK_ADAPTER__AUTO_SENSE:
				return getAutoSense();
			case CimPackage.CIM_NETWORK_ADAPTER__OCTETS_TRANSMITTED:
				return getOctetsTransmitted();
			case CimPackage.CIM_NETWORK_ADAPTER__OCTETS_RECEIVED:
				return getOctetsReceived();
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
			case CimPackage.CIM_NETWORK_ADAPTER__PERMANENT_ADDRESS:
				setPermanentAddress((String)newValue);
				return;
			case CimPackage.CIM_NETWORK_ADAPTER__NETWORK_ADDRESSES:
				getNetworkAddresses().clear();
				getNetworkAddresses().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_NETWORK_ADAPTER__SPEED:
				setSpeed((Long)newValue);
				return;
			case CimPackage.CIM_NETWORK_ADAPTER__MAX_SPEED:
				setMaxSpeed((Long)newValue);
				return;
			case CimPackage.CIM_NETWORK_ADAPTER__FULL_DUPLEX:
				setFullDuplex((Boolean)newValue);
				return;
			case CimPackage.CIM_NETWORK_ADAPTER__AUTO_SENSE:
				setAutoSense((Boolean)newValue);
				return;
			case CimPackage.CIM_NETWORK_ADAPTER__OCTETS_TRANSMITTED:
				setOctetsTransmitted((Long)newValue);
				return;
			case CimPackage.CIM_NETWORK_ADAPTER__OCTETS_RECEIVED:
				setOctetsReceived((Long)newValue);
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
			case CimPackage.CIM_NETWORK_ADAPTER__PERMANENT_ADDRESS:
				setPermanentAddress(PERMANENT_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_ADAPTER__NETWORK_ADDRESSES:
				getNetworkAddresses().clear();
				return;
			case CimPackage.CIM_NETWORK_ADAPTER__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_ADAPTER__MAX_SPEED:
				setMaxSpeed(MAX_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_ADAPTER__FULL_DUPLEX:
				setFullDuplex(FULL_DUPLEX_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_ADAPTER__AUTO_SENSE:
				setAutoSense(AUTO_SENSE_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_ADAPTER__OCTETS_TRANSMITTED:
				setOctetsTransmitted(OCTETS_TRANSMITTED_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_ADAPTER__OCTETS_RECEIVED:
				setOctetsReceived(OCTETS_RECEIVED_EDEFAULT);
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
			case CimPackage.CIM_NETWORK_ADAPTER__PERMANENT_ADDRESS:
				return PERMANENT_ADDRESS_EDEFAULT == null ? permanentAddress != null : !PERMANENT_ADDRESS_EDEFAULT.equals(permanentAddress);
			case CimPackage.CIM_NETWORK_ADAPTER__NETWORK_ADDRESSES:
				return networkAddresses != null && !networkAddresses.isEmpty();
			case CimPackage.CIM_NETWORK_ADAPTER__SPEED:
				return SPEED_EDEFAULT == null ? speed != null : !SPEED_EDEFAULT.equals(speed);
			case CimPackage.CIM_NETWORK_ADAPTER__MAX_SPEED:
				return MAX_SPEED_EDEFAULT == null ? maxSpeed != null : !MAX_SPEED_EDEFAULT.equals(maxSpeed);
			case CimPackage.CIM_NETWORK_ADAPTER__FULL_DUPLEX:
				return FULL_DUPLEX_EDEFAULT == null ? fullDuplex != null : !FULL_DUPLEX_EDEFAULT.equals(fullDuplex);
			case CimPackage.CIM_NETWORK_ADAPTER__AUTO_SENSE:
				return AUTO_SENSE_EDEFAULT == null ? autoSense != null : !AUTO_SENSE_EDEFAULT.equals(autoSense);
			case CimPackage.CIM_NETWORK_ADAPTER__OCTETS_TRANSMITTED:
				return OCTETS_TRANSMITTED_EDEFAULT == null ? octetsTransmitted != null : !OCTETS_TRANSMITTED_EDEFAULT.equals(octetsTransmitted);
			case CimPackage.CIM_NETWORK_ADAPTER__OCTETS_RECEIVED:
				return OCTETS_RECEIVED_EDEFAULT == null ? octetsReceived != null : !OCTETS_RECEIVED_EDEFAULT.equals(octetsReceived);
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
		result.append(" (PermanentAddress: ");
		result.append(permanentAddress);
		result.append(", NetworkAddresses: ");
		result.append(networkAddresses);
		result.append(", Speed: ");
		result.append(speed);
		result.append(", MaxSpeed: ");
		result.append(maxSpeed);
		result.append(", FullDuplex: ");
		result.append(fullDuplex);
		result.append(", AutoSense: ");
		result.append(autoSense);
		result.append(", OctetsTransmitted: ");
		result.append(octetsTransmitted);
		result.append(", OctetsReceived: ");
		result.append(octetsReceived);
		result.append(')');
		return result.toString();
	}

} //CIM_NetworkAdapterImpl

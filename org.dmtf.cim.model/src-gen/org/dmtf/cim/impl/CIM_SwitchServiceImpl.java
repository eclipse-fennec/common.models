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

import org.dmtf.cim.CIM_SwitchService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Switch Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchServiceImpl#getBridgeAddress <em>Bridge Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchServiceImpl#getNumPorts <em>Num Ports</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchServiceImpl#getBridgeType <em>Bridge Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchServiceImpl#getBridgeAddressType <em>Bridge Address Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SwitchServiceImpl extends CIM_ForwardingServiceImpl implements CIM_SwitchService {
	/**
	 * The default value of the '{@link #getBridgeAddress() <em>Bridge Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String BRIDGE_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBridgeAddress() <em>Bridge Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeAddress()
	 * @generated
	 * @ordered
	 */
	protected String bridgeAddress = BRIDGE_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumPorts() <em>Num Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPorts()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUM_PORTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumPorts() <em>Num Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPorts()
	 * @generated
	 * @ordered
	 */
	protected Integer numPorts = NUM_PORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBridgeType() <em>Bridge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BRIDGE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBridgeType() <em>Bridge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeType()
	 * @generated
	 * @ordered
	 */
	protected Integer bridgeType = BRIDGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBridgeAddressType() <em>Bridge Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeAddressType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BRIDGE_ADDRESS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBridgeAddressType() <em>Bridge Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeAddressType()
	 * @generated
	 * @ordered
	 */
	protected Integer bridgeAddressType = BRIDGE_ADDRESS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SwitchServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SwitchService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBridgeAddress() {
		return bridgeAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBridgeAddress(String newBridgeAddress) {
		String oldBridgeAddress = bridgeAddress;
		bridgeAddress = newBridgeAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_SERVICE__BRIDGE_ADDRESS, oldBridgeAddress, bridgeAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNumPorts() {
		return numPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumPorts(Integer newNumPorts) {
		Integer oldNumPorts = numPorts;
		numPorts = newNumPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_SERVICE__NUM_PORTS, oldNumPorts, numPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBridgeType() {
		return bridgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBridgeType(Integer newBridgeType) {
		Integer oldBridgeType = bridgeType;
		bridgeType = newBridgeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_SERVICE__BRIDGE_TYPE, oldBridgeType, bridgeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBridgeAddressType() {
		return bridgeAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBridgeAddressType(Integer newBridgeAddressType) {
		Integer oldBridgeAddressType = bridgeAddressType;
		bridgeAddressType = newBridgeAddressType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_SERVICE__BRIDGE_ADDRESS_TYPE, oldBridgeAddressType, bridgeAddressType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SWITCH_SERVICE__BRIDGE_ADDRESS:
				return getBridgeAddress();
			case CimPackage.CIM_SWITCH_SERVICE__NUM_PORTS:
				return getNumPorts();
			case CimPackage.CIM_SWITCH_SERVICE__BRIDGE_TYPE:
				return getBridgeType();
			case CimPackage.CIM_SWITCH_SERVICE__BRIDGE_ADDRESS_TYPE:
				return getBridgeAddressType();
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
			case CimPackage.CIM_SWITCH_SERVICE__BRIDGE_ADDRESS:
				setBridgeAddress((String)newValue);
				return;
			case CimPackage.CIM_SWITCH_SERVICE__NUM_PORTS:
				setNumPorts((Integer)newValue);
				return;
			case CimPackage.CIM_SWITCH_SERVICE__BRIDGE_TYPE:
				setBridgeType((Integer)newValue);
				return;
			case CimPackage.CIM_SWITCH_SERVICE__BRIDGE_ADDRESS_TYPE:
				setBridgeAddressType((Integer)newValue);
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
			case CimPackage.CIM_SWITCH_SERVICE__BRIDGE_ADDRESS:
				setBridgeAddress(BRIDGE_ADDRESS_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_SERVICE__NUM_PORTS:
				setNumPorts(NUM_PORTS_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_SERVICE__BRIDGE_TYPE:
				setBridgeType(BRIDGE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_SERVICE__BRIDGE_ADDRESS_TYPE:
				setBridgeAddressType(BRIDGE_ADDRESS_TYPE_EDEFAULT);
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
			case CimPackage.CIM_SWITCH_SERVICE__BRIDGE_ADDRESS:
				return BRIDGE_ADDRESS_EDEFAULT == null ? bridgeAddress != null : !BRIDGE_ADDRESS_EDEFAULT.equals(bridgeAddress);
			case CimPackage.CIM_SWITCH_SERVICE__NUM_PORTS:
				return NUM_PORTS_EDEFAULT == null ? numPorts != null : !NUM_PORTS_EDEFAULT.equals(numPorts);
			case CimPackage.CIM_SWITCH_SERVICE__BRIDGE_TYPE:
				return BRIDGE_TYPE_EDEFAULT == null ? bridgeType != null : !BRIDGE_TYPE_EDEFAULT.equals(bridgeType);
			case CimPackage.CIM_SWITCH_SERVICE__BRIDGE_ADDRESS_TYPE:
				return BRIDGE_ADDRESS_TYPE_EDEFAULT == null ? bridgeAddressType != null : !BRIDGE_ADDRESS_TYPE_EDEFAULT.equals(bridgeAddressType);
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
		result.append(" (BridgeAddress: ");
		result.append(bridgeAddress);
		result.append(", NumPorts: ");
		result.append(numPorts);
		result.append(", BridgeType: ");
		result.append(bridgeType);
		result.append(", BridgeAddressType: ");
		result.append(bridgeAddressType);
		result.append(')');
		return result.toString();
	}

} //CIM_SwitchServiceImpl

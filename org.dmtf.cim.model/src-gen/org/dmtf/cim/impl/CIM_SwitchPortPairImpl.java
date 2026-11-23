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

import org.dmtf.cim.CIM_SwitchPortPair;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Switch Port Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortPairImpl#getBridgeNum <em>Bridge Num</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SwitchPortPairImpl#getBridgeState <em>Bridge State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SwitchPortPairImpl extends CIM_SAPSAPDependencyImpl implements CIM_SwitchPortPair {
	/**
	 * The default value of the '{@link #getBridgeNum() <em>Bridge Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeNum()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BRIDGE_NUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBridgeNum() <em>Bridge Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeNum()
	 * @generated
	 * @ordered
	 */
	protected Integer bridgeNum = BRIDGE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getBridgeState() <em>Bridge State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BRIDGE_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBridgeState() <em>Bridge State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridgeState()
	 * @generated
	 * @ordered
	 */
	protected Integer bridgeState = BRIDGE_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SwitchPortPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SwitchPortPair();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBridgeNum() {
		return bridgeNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBridgeNum(Integer newBridgeNum) {
		Integer oldBridgeNum = bridgeNum;
		bridgeNum = newBridgeNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_PAIR__BRIDGE_NUM, oldBridgeNum, bridgeNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBridgeState() {
		return bridgeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBridgeState(Integer newBridgeState) {
		Integer oldBridgeState = bridgeState;
		bridgeState = newBridgeState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SWITCH_PORT_PAIR__BRIDGE_STATE, oldBridgeState, bridgeState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SWITCH_PORT_PAIR__BRIDGE_NUM:
				return getBridgeNum();
			case CimPackage.CIM_SWITCH_PORT_PAIR__BRIDGE_STATE:
				return getBridgeState();
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
			case CimPackage.CIM_SWITCH_PORT_PAIR__BRIDGE_NUM:
				setBridgeNum((Integer)newValue);
				return;
			case CimPackage.CIM_SWITCH_PORT_PAIR__BRIDGE_STATE:
				setBridgeState((Integer)newValue);
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
			case CimPackage.CIM_SWITCH_PORT_PAIR__BRIDGE_NUM:
				setBridgeNum(BRIDGE_NUM_EDEFAULT);
				return;
			case CimPackage.CIM_SWITCH_PORT_PAIR__BRIDGE_STATE:
				setBridgeState(BRIDGE_STATE_EDEFAULT);
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
			case CimPackage.CIM_SWITCH_PORT_PAIR__BRIDGE_NUM:
				return BRIDGE_NUM_EDEFAULT == null ? bridgeNum != null : !BRIDGE_NUM_EDEFAULT.equals(bridgeNum);
			case CimPackage.CIM_SWITCH_PORT_PAIR__BRIDGE_STATE:
				return BRIDGE_STATE_EDEFAULT == null ? bridgeState != null : !BRIDGE_STATE_EDEFAULT.equals(bridgeState);
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
		result.append(" (BridgeNum: ");
		result.append(bridgeNum);
		result.append(", BridgeState: ");
		result.append(bridgeState);
		result.append(')');
		return result.toString();
	}

} //CIM_SwitchPortPairImpl

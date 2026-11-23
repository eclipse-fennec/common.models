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

import org.dmtf.cim.CIM_NetworkPacketAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Network Packet Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPacketActionImpl#getPacketAction <em>Packet Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkPacketActionImpl#getOtherAction <em>Other Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NetworkPacketActionImpl extends CIM_PolicyActionImpl implements CIM_NetworkPacketAction {
	/**
	 * The default value of the '{@link #getPacketAction() <em>Packet Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketAction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PACKET_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacketAction() <em>Packet Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketAction()
	 * @generated
	 * @ordered
	 */
	protected Integer packetAction = PACKET_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAction() <em>Other Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAction()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAction() <em>Other Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAction()
	 * @generated
	 * @ordered
	 */
	protected String otherAction = OTHER_ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NetworkPacketActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NetworkPacketAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPacketAction() {
		return packetAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPacketAction(Integer newPacketAction) {
		Integer oldPacketAction = packetAction;
		packetAction = newPacketAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PACKET_ACTION__PACKET_ACTION, oldPacketAction, packetAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherAction() {
		return otherAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherAction(String newOtherAction) {
		String oldOtherAction = otherAction;
		otherAction = newOtherAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORK_PACKET_ACTION__OTHER_ACTION, oldOtherAction, otherAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NETWORK_PACKET_ACTION__PACKET_ACTION:
				return getPacketAction();
			case CimPackage.CIM_NETWORK_PACKET_ACTION__OTHER_ACTION:
				return getOtherAction();
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
			case CimPackage.CIM_NETWORK_PACKET_ACTION__PACKET_ACTION:
				setPacketAction((Integer)newValue);
				return;
			case CimPackage.CIM_NETWORK_PACKET_ACTION__OTHER_ACTION:
				setOtherAction((String)newValue);
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
			case CimPackage.CIM_NETWORK_PACKET_ACTION__PACKET_ACTION:
				setPacketAction(PACKET_ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_NETWORK_PACKET_ACTION__OTHER_ACTION:
				setOtherAction(OTHER_ACTION_EDEFAULT);
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
			case CimPackage.CIM_NETWORK_PACKET_ACTION__PACKET_ACTION:
				return PACKET_ACTION_EDEFAULT == null ? packetAction != null : !PACKET_ACTION_EDEFAULT.equals(packetAction);
			case CimPackage.CIM_NETWORK_PACKET_ACTION__OTHER_ACTION:
				return OTHER_ACTION_EDEFAULT == null ? otherAction != null : !OTHER_ACTION_EDEFAULT.equals(otherAction);
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
		result.append(" (PacketAction: ");
		result.append(packetAction);
		result.append(", OtherAction: ");
		result.append(otherAction);
		result.append(')');
		return result.toString();
	}

} //CIM_NetworkPacketActionImpl

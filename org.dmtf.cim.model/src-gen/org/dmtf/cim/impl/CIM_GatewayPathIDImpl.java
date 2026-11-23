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

import org.dmtf.cim.CIM_GatewayPathID;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Gateway Path ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_GatewayPathIDImpl#getGatewayID <em>Gateway ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_GatewayPathIDImpl#getGatewayIDType <em>Gateway ID Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_GatewayPathIDImpl#getOtherGatewayIDType <em>Other Gateway ID Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_GatewayPathIDImpl extends CIM_StorageHardwareIDImpl implements CIM_GatewayPathID {
	/**
	 * The default value of the '{@link #getGatewayID() <em>Gateway ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayID()
	 * @generated
	 * @ordered
	 */
	protected static final String GATEWAY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGatewayID() <em>Gateway ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayID()
	 * @generated
	 * @ordered
	 */
	protected String gatewayID = GATEWAY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGatewayIDType() <em>Gateway ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayIDType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer GATEWAY_ID_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGatewayIDType() <em>Gateway ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayIDType()
	 * @generated
	 * @ordered
	 */
	protected Integer gatewayIDType = GATEWAY_ID_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherGatewayIDType() <em>Other Gateway ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherGatewayIDType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_GATEWAY_ID_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherGatewayIDType() <em>Other Gateway ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherGatewayIDType()
	 * @generated
	 * @ordered
	 */
	protected String otherGatewayIDType = OTHER_GATEWAY_ID_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_GatewayPathIDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_GatewayPathID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGatewayID() {
		return gatewayID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayID(String newGatewayID) {
		String oldGatewayID = gatewayID;
		gatewayID = newGatewayID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_GATEWAY_PATH_ID__GATEWAY_ID, oldGatewayID, gatewayID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getGatewayIDType() {
		return gatewayIDType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGatewayIDType(Integer newGatewayIDType) {
		Integer oldGatewayIDType = gatewayIDType;
		gatewayIDType = newGatewayIDType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_GATEWAY_PATH_ID__GATEWAY_ID_TYPE, oldGatewayIDType, gatewayIDType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherGatewayIDType() {
		return otherGatewayIDType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherGatewayIDType(String newOtherGatewayIDType) {
		String oldOtherGatewayIDType = otherGatewayIDType;
		otherGatewayIDType = newOtherGatewayIDType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_GATEWAY_PATH_ID__OTHER_GATEWAY_ID_TYPE, oldOtherGatewayIDType, otherGatewayIDType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_GATEWAY_PATH_ID__GATEWAY_ID:
				return getGatewayID();
			case CimPackage.CIM_GATEWAY_PATH_ID__GATEWAY_ID_TYPE:
				return getGatewayIDType();
			case CimPackage.CIM_GATEWAY_PATH_ID__OTHER_GATEWAY_ID_TYPE:
				return getOtherGatewayIDType();
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
			case CimPackage.CIM_GATEWAY_PATH_ID__GATEWAY_ID:
				setGatewayID((String)newValue);
				return;
			case CimPackage.CIM_GATEWAY_PATH_ID__GATEWAY_ID_TYPE:
				setGatewayIDType((Integer)newValue);
				return;
			case CimPackage.CIM_GATEWAY_PATH_ID__OTHER_GATEWAY_ID_TYPE:
				setOtherGatewayIDType((String)newValue);
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
			case CimPackage.CIM_GATEWAY_PATH_ID__GATEWAY_ID:
				setGatewayID(GATEWAY_ID_EDEFAULT);
				return;
			case CimPackage.CIM_GATEWAY_PATH_ID__GATEWAY_ID_TYPE:
				setGatewayIDType(GATEWAY_ID_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_GATEWAY_PATH_ID__OTHER_GATEWAY_ID_TYPE:
				setOtherGatewayIDType(OTHER_GATEWAY_ID_TYPE_EDEFAULT);
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
			case CimPackage.CIM_GATEWAY_PATH_ID__GATEWAY_ID:
				return GATEWAY_ID_EDEFAULT == null ? gatewayID != null : !GATEWAY_ID_EDEFAULT.equals(gatewayID);
			case CimPackage.CIM_GATEWAY_PATH_ID__GATEWAY_ID_TYPE:
				return GATEWAY_ID_TYPE_EDEFAULT == null ? gatewayIDType != null : !GATEWAY_ID_TYPE_EDEFAULT.equals(gatewayIDType);
			case CimPackage.CIM_GATEWAY_PATH_ID__OTHER_GATEWAY_ID_TYPE:
				return OTHER_GATEWAY_ID_TYPE_EDEFAULT == null ? otherGatewayIDType != null : !OTHER_GATEWAY_ID_TYPE_EDEFAULT.equals(otherGatewayIDType);
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
		result.append(" (GatewayID: ");
		result.append(gatewayID);
		result.append(", GatewayIDType: ");
		result.append(gatewayIDType);
		result.append(", OtherGatewayIDType: ");
		result.append(otherGatewayIDType);
		result.append(')');
		return result.toString();
	}

} //CIM_GatewayPathIDImpl

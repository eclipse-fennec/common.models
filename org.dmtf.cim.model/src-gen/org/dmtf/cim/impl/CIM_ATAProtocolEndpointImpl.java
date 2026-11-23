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

import org.dmtf.cim.CIM_ATAProtocolEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM ATA Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ATAProtocolEndpointImpl#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ATAProtocolEndpointImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ATAProtocolEndpointImpl#getOtherConnectionType <em>Other Connection Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ATAProtocolEndpointImpl extends CIM_ProtocolEndpointImpl implements CIM_ATAProtocolEndpoint {
	/**
	 * The default value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONNECTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected Integer connectionType = CONNECTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Integer role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherConnectionType() <em>Other Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherConnectionType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CONNECTION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherConnectionType() <em>Other Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherConnectionType()
	 * @generated
	 * @ordered
	 */
	protected String otherConnectionType = OTHER_CONNECTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ATAProtocolEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ATAProtocolEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getConnectionType() {
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionType(Integer newConnectionType) {
		Integer oldConnectionType = connectionType;
		connectionType = newConnectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ATA_PROTOCOL_ENDPOINT__CONNECTION_TYPE, oldConnectionType, connectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(Integer newRole) {
		Integer oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ATA_PROTOCOL_ENDPOINT__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherConnectionType() {
		return otherConnectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherConnectionType(String newOtherConnectionType) {
		String oldOtherConnectionType = otherConnectionType;
		otherConnectionType = newOtherConnectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ATA_PROTOCOL_ENDPOINT__OTHER_CONNECTION_TYPE, oldOtherConnectionType, otherConnectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ATA_PROTOCOL_ENDPOINT__CONNECTION_TYPE:
				return getConnectionType();
			case CimPackage.CIM_ATA_PROTOCOL_ENDPOINT__ROLE:
				return getRole();
			case CimPackage.CIM_ATA_PROTOCOL_ENDPOINT__OTHER_CONNECTION_TYPE:
				return getOtherConnectionType();
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
			case CimPackage.CIM_ATA_PROTOCOL_ENDPOINT__CONNECTION_TYPE:
				setConnectionType((Integer)newValue);
				return;
			case CimPackage.CIM_ATA_PROTOCOL_ENDPOINT__ROLE:
				setRole((Integer)newValue);
				return;
			case CimPackage.CIM_ATA_PROTOCOL_ENDPOINT__OTHER_CONNECTION_TYPE:
				setOtherConnectionType((String)newValue);
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
			case CimPackage.CIM_ATA_PROTOCOL_ENDPOINT__CONNECTION_TYPE:
				setConnectionType(CONNECTION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ATA_PROTOCOL_ENDPOINT__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case CimPackage.CIM_ATA_PROTOCOL_ENDPOINT__OTHER_CONNECTION_TYPE:
				setOtherConnectionType(OTHER_CONNECTION_TYPE_EDEFAULT);
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
			case CimPackage.CIM_ATA_PROTOCOL_ENDPOINT__CONNECTION_TYPE:
				return CONNECTION_TYPE_EDEFAULT == null ? connectionType != null : !CONNECTION_TYPE_EDEFAULT.equals(connectionType);
			case CimPackage.CIM_ATA_PROTOCOL_ENDPOINT__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case CimPackage.CIM_ATA_PROTOCOL_ENDPOINT__OTHER_CONNECTION_TYPE:
				return OTHER_CONNECTION_TYPE_EDEFAULT == null ? otherConnectionType != null : !OTHER_CONNECTION_TYPE_EDEFAULT.equals(otherConnectionType);
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
		result.append(" (ConnectionType: ");
		result.append(connectionType);
		result.append(", Role: ");
		result.append(role);
		result.append(", OtherConnectionType: ");
		result.append(otherConnectionType);
		result.append(')');
		return result.toString();
	}

} //CIM_ATAProtocolEndpointImpl

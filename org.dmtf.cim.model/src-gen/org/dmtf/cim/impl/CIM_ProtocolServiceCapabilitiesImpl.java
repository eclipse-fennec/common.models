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

import org.dmtf.cim.CIM_ProtocolServiceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Protocol Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolServiceCapabilitiesImpl#getMaxConnections <em>Max Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolServiceCapabilitiesImpl#getMaxListeningPorts <em>Max Listening Ports</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolServiceCapabilitiesImpl#getListeningPortManagementSupported <em>Listening Port Management Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ProtocolServiceCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_ProtocolServiceCapabilities {
	/**
	 * The default value of the '{@link #getMaxConnections() <em>Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConnections()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_CONNECTIONS_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getMaxConnections() <em>Max Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConnections()
	 * @generated
	 * @ordered
	 */
	protected Integer maxConnections = MAX_CONNECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxListeningPorts() <em>Max Listening Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxListeningPorts()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_LISTENING_PORTS_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getMaxListeningPorts() <em>Max Listening Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxListeningPorts()
	 * @generated
	 * @ordered
	 */
	protected Integer maxListeningPorts = MAX_LISTENING_PORTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getListeningPortManagementSupported() <em>Listening Port Management Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeningPortManagementSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LISTENING_PORT_MANAGEMENT_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListeningPortManagementSupported() <em>Listening Port Management Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeningPortManagementSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean listeningPortManagementSupported = LISTENING_PORT_MANAGEMENT_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ProtocolServiceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ProtocolServiceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxConnections() {
		return maxConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxConnections(Integer newMaxConnections) {
		Integer oldMaxConnections = maxConnections;
		maxConnections = newMaxConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES__MAX_CONNECTIONS, oldMaxConnections, maxConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxListeningPorts() {
		return maxListeningPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxListeningPorts(Integer newMaxListeningPorts) {
		Integer oldMaxListeningPorts = maxListeningPorts;
		maxListeningPorts = newMaxListeningPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES__MAX_LISTENING_PORTS, oldMaxListeningPorts, maxListeningPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getListeningPortManagementSupported() {
		return listeningPortManagementSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setListeningPortManagementSupported(Boolean newListeningPortManagementSupported) {
		Boolean oldListeningPortManagementSupported = listeningPortManagementSupported;
		listeningPortManagementSupported = newListeningPortManagementSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES__LISTENING_PORT_MANAGEMENT_SUPPORTED, oldListeningPortManagementSupported, listeningPortManagementSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES__MAX_CONNECTIONS:
				return getMaxConnections();
			case CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES__MAX_LISTENING_PORTS:
				return getMaxListeningPorts();
			case CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES__LISTENING_PORT_MANAGEMENT_SUPPORTED:
				return getListeningPortManagementSupported();
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
			case CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES__MAX_CONNECTIONS:
				setMaxConnections((Integer)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES__MAX_LISTENING_PORTS:
				setMaxListeningPorts((Integer)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES__LISTENING_PORT_MANAGEMENT_SUPPORTED:
				setListeningPortManagementSupported((Boolean)newValue);
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
			case CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES__MAX_CONNECTIONS:
				setMaxConnections(MAX_CONNECTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES__MAX_LISTENING_PORTS:
				setMaxListeningPorts(MAX_LISTENING_PORTS_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES__LISTENING_PORT_MANAGEMENT_SUPPORTED:
				setListeningPortManagementSupported(LISTENING_PORT_MANAGEMENT_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES__MAX_CONNECTIONS:
				return MAX_CONNECTIONS_EDEFAULT == null ? maxConnections != null : !MAX_CONNECTIONS_EDEFAULT.equals(maxConnections);
			case CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES__MAX_LISTENING_PORTS:
				return MAX_LISTENING_PORTS_EDEFAULT == null ? maxListeningPorts != null : !MAX_LISTENING_PORTS_EDEFAULT.equals(maxListeningPorts);
			case CimPackage.CIM_PROTOCOL_SERVICE_CAPABILITIES__LISTENING_PORT_MANAGEMENT_SUPPORTED:
				return LISTENING_PORT_MANAGEMENT_SUPPORTED_EDEFAULT == null ? listeningPortManagementSupported != null : !LISTENING_PORT_MANAGEMENT_SUPPORTED_EDEFAULT.equals(listeningPortManagementSupported);
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
		result.append(" (MaxConnections: ");
		result.append(maxConnections);
		result.append(", MaxListeningPorts: ");
		result.append(maxListeningPorts);
		result.append(", ListeningPortManagementSupported: ");
		result.append(listeningPortManagementSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_ProtocolServiceCapabilitiesImpl

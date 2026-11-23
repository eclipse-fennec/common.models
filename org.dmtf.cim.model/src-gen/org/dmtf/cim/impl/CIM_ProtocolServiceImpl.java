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

import java.lang.reflect.InvocationTargetException;

import org.dmtf.cim.CIM_IPProtocolEndpoint;
import org.dmtf.cim.CIM_ProtocolService;
import org.dmtf.cim.CIM_TCPProtocolEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Protocol Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolServiceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolServiceImpl#getOtherProtocol <em>Other Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolServiceImpl#getMaxConnections <em>Max Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolServiceImpl#getCurrentActiveConnections <em>Current Active Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ProtocolServiceImpl extends CIM_ServiceImpl implements CIM_ProtocolService {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected Integer protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherProtocol() <em>Other Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherProtocol() <em>Other Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocol()
	 * @generated
	 * @ordered
	 */
	protected String otherProtocol = OTHER_PROTOCOL_EDEFAULT;

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
	 * The default value of the '{@link #getCurrentActiveConnections() <em>Current Active Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentActiveConnections()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_ACTIVE_CONNECTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentActiveConnections() <em>Current Active Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentActiveConnections()
	 * @generated
	 * @ordered
	 */
	protected Integer currentActiveConnections = CURRENT_ACTIVE_CONNECTIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ProtocolServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ProtocolService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(Integer newProtocol) {
		Integer oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_SERVICE__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherProtocol() {
		return otherProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherProtocol(String newOtherProtocol) {
		String oldOtherProtocol = otherProtocol;
		otherProtocol = newOtherProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_SERVICE__OTHER_PROTOCOL, oldOtherProtocol, otherProtocol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_SERVICE__MAX_CONNECTIONS, oldMaxConnections, maxConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCurrentActiveConnections() {
		return currentActiveConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentActiveConnections(Integer newCurrentActiveConnections) {
		Integer oldCurrentActiveConnections = currentActiveConnections;
		currentActiveConnections = newCurrentActiveConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_SERVICE__CURRENT_ACTIVE_CONNECTIONS, oldCurrentActiveConnections, currentActiveConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ListenOnPort(Long PortNumber, CIM_IPProtocolEndpoint IPEndpoint, CIM_TCPProtocolEndpoint TCPEndpoint) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long ListenOnPortIF(Long PortNumber, CIM_IPProtocolEndpoint IPEndpoint, CIM_TCPProtocolEndpoint TCPEndpoint, Long ProtocolIFType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PROTOCOL_SERVICE__PROTOCOL:
				return getProtocol();
			case CimPackage.CIM_PROTOCOL_SERVICE__OTHER_PROTOCOL:
				return getOtherProtocol();
			case CimPackage.CIM_PROTOCOL_SERVICE__MAX_CONNECTIONS:
				return getMaxConnections();
			case CimPackage.CIM_PROTOCOL_SERVICE__CURRENT_ACTIVE_CONNECTIONS:
				return getCurrentActiveConnections();
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
			case CimPackage.CIM_PROTOCOL_SERVICE__PROTOCOL:
				setProtocol((Integer)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_SERVICE__OTHER_PROTOCOL:
				setOtherProtocol((String)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_SERVICE__MAX_CONNECTIONS:
				setMaxConnections((Integer)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_SERVICE__CURRENT_ACTIVE_CONNECTIONS:
				setCurrentActiveConnections((Integer)newValue);
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
			case CimPackage.CIM_PROTOCOL_SERVICE__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_SERVICE__OTHER_PROTOCOL:
				setOtherProtocol(OTHER_PROTOCOL_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_SERVICE__MAX_CONNECTIONS:
				setMaxConnections(MAX_CONNECTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_SERVICE__CURRENT_ACTIVE_CONNECTIONS:
				setCurrentActiveConnections(CURRENT_ACTIVE_CONNECTIONS_EDEFAULT);
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
			case CimPackage.CIM_PROTOCOL_SERVICE__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case CimPackage.CIM_PROTOCOL_SERVICE__OTHER_PROTOCOL:
				return OTHER_PROTOCOL_EDEFAULT == null ? otherProtocol != null : !OTHER_PROTOCOL_EDEFAULT.equals(otherProtocol);
			case CimPackage.CIM_PROTOCOL_SERVICE__MAX_CONNECTIONS:
				return MAX_CONNECTIONS_EDEFAULT == null ? maxConnections != null : !MAX_CONNECTIONS_EDEFAULT.equals(maxConnections);
			case CimPackage.CIM_PROTOCOL_SERVICE__CURRENT_ACTIVE_CONNECTIONS:
				return CURRENT_ACTIVE_CONNECTIONS_EDEFAULT == null ? currentActiveConnections != null : !CURRENT_ACTIVE_CONNECTIONS_EDEFAULT.equals(currentActiveConnections);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_PROTOCOL_SERVICE___LISTEN_ON_PORT__LONG_CIM_IPPROTOCOLENDPOINT_CIM_TCPPROTOCOLENDPOINT:
				return ListenOnPort((Long)arguments.get(0), (CIM_IPProtocolEndpoint)arguments.get(1), (CIM_TCPProtocolEndpoint)arguments.get(2));
			case CimPackage.CIM_PROTOCOL_SERVICE___LISTEN_ON_PORT_IF__LONG_CIM_IPPROTOCOLENDPOINT_CIM_TCPPROTOCOLENDPOINT_LONG:
				return ListenOnPortIF((Long)arguments.get(0), (CIM_IPProtocolEndpoint)arguments.get(1), (CIM_TCPProtocolEndpoint)arguments.get(2), (Long)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Protocol: ");
		result.append(protocol);
		result.append(", OtherProtocol: ");
		result.append(otherProtocol);
		result.append(", MaxConnections: ");
		result.append(maxConnections);
		result.append(", CurrentActiveConnections: ");
		result.append(currentActiveConnections);
		result.append(')');
		return result.toString();
	}

} //CIM_ProtocolServiceImpl

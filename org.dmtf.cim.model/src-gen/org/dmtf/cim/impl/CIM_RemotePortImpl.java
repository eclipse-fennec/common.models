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

import org.dmtf.cim.CIM_RemotePort;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Remote Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RemotePortImpl#getPortInfo <em>Port Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RemotePortImpl#getPortProtocol <em>Port Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RemotePortImpl#getOtherProtocolDescription <em>Other Protocol Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RemotePortImpl extends CIM_RemoteServiceAccessPointImpl implements CIM_RemotePort {
	/**
	 * The default value of the '{@link #getPortInfo() <em>Port Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInfo()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortInfo() <em>Port Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInfo()
	 * @generated
	 * @ordered
	 */
	protected String portInfo = PORT_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortProtocol() <em>Port Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORT_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortProtocol() <em>Port Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortProtocol()
	 * @generated
	 * @ordered
	 */
	protected Integer portProtocol = PORT_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherProtocolDescription() <em>Other Protocol Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocolDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PROTOCOL_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherProtocolDescription() <em>Other Protocol Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocolDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherProtocolDescription = OTHER_PROTOCOL_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RemotePortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RemotePort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPortInfo() {
		return portInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortInfo(String newPortInfo) {
		String oldPortInfo = portInfo;
		portInfo = newPortInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REMOTE_PORT__PORT_INFO, oldPortInfo, portInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPortProtocol() {
		return portProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortProtocol(Integer newPortProtocol) {
		Integer oldPortProtocol = portProtocol;
		portProtocol = newPortProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REMOTE_PORT__PORT_PROTOCOL, oldPortProtocol, portProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherProtocolDescription() {
		return otherProtocolDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherProtocolDescription(String newOtherProtocolDescription) {
		String oldOtherProtocolDescription = otherProtocolDescription;
		otherProtocolDescription = newOtherProtocolDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REMOTE_PORT__OTHER_PROTOCOL_DESCRIPTION, oldOtherProtocolDescription, otherProtocolDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_REMOTE_PORT__PORT_INFO:
				return getPortInfo();
			case CimPackage.CIM_REMOTE_PORT__PORT_PROTOCOL:
				return getPortProtocol();
			case CimPackage.CIM_REMOTE_PORT__OTHER_PROTOCOL_DESCRIPTION:
				return getOtherProtocolDescription();
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
			case CimPackage.CIM_REMOTE_PORT__PORT_INFO:
				setPortInfo((String)newValue);
				return;
			case CimPackage.CIM_REMOTE_PORT__PORT_PROTOCOL:
				setPortProtocol((Integer)newValue);
				return;
			case CimPackage.CIM_REMOTE_PORT__OTHER_PROTOCOL_DESCRIPTION:
				setOtherProtocolDescription((String)newValue);
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
			case CimPackage.CIM_REMOTE_PORT__PORT_INFO:
				setPortInfo(PORT_INFO_EDEFAULT);
				return;
			case CimPackage.CIM_REMOTE_PORT__PORT_PROTOCOL:
				setPortProtocol(PORT_PROTOCOL_EDEFAULT);
				return;
			case CimPackage.CIM_REMOTE_PORT__OTHER_PROTOCOL_DESCRIPTION:
				setOtherProtocolDescription(OTHER_PROTOCOL_DESCRIPTION_EDEFAULT);
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
			case CimPackage.CIM_REMOTE_PORT__PORT_INFO:
				return PORT_INFO_EDEFAULT == null ? portInfo != null : !PORT_INFO_EDEFAULT.equals(portInfo);
			case CimPackage.CIM_REMOTE_PORT__PORT_PROTOCOL:
				return PORT_PROTOCOL_EDEFAULT == null ? portProtocol != null : !PORT_PROTOCOL_EDEFAULT.equals(portProtocol);
			case CimPackage.CIM_REMOTE_PORT__OTHER_PROTOCOL_DESCRIPTION:
				return OTHER_PROTOCOL_DESCRIPTION_EDEFAULT == null ? otherProtocolDescription != null : !OTHER_PROTOCOL_DESCRIPTION_EDEFAULT.equals(otherProtocolDescription);
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
		result.append(" (PortInfo: ");
		result.append(portInfo);
		result.append(", PortProtocol: ");
		result.append(portProtocol);
		result.append(", OtherProtocolDescription: ");
		result.append(otherProtocolDescription);
		result.append(')');
		return result.toString();
	}

} //CIM_RemotePortImpl

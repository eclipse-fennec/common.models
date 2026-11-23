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

import org.dmtf.cim.CIM_ProtocolEndpoint;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Protocol Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolEndpointImpl#getNameFormat <em>Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolEndpointImpl#getProtocolType <em>Protocol Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolEndpointImpl#getProtocolIFType <em>Protocol IF Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolEndpointImpl#getOtherTypeDescription <em>Other Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ProtocolEndpointImpl#getBroadcastResetSupported <em>Broadcast Reset Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ProtocolEndpointImpl extends CIM_ServiceAccessPointImpl implements CIM_ProtocolEndpoint {
	/**
	 * The default value of the '{@link #getNameFormat() <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameFormat() <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFormat()
	 * @generated
	 * @ordered
	 */
	protected String nameFormat = NAME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolType() <em>Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROTOCOL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolType() <em>Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolType()
	 * @generated
	 * @ordered
	 */
	protected Integer protocolType = PROTOCOL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocolIFType() <em>Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolIFType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROTOCOL_IF_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocolIFType() <em>Protocol IF Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolIFType()
	 * @generated
	 * @ordered
	 */
	protected Integer protocolIFType = PROTOCOL_IF_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherTypeDescription() <em>Other Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherTypeDescription = OTHER_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBroadcastResetSupported() <em>Broadcast Reset Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBroadcastResetSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BROADCAST_RESET_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBroadcastResetSupported() <em>Broadcast Reset Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBroadcastResetSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean broadcastResetSupported = BROADCAST_RESET_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ProtocolEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ProtocolEndpoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameFormat() {
		return nameFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameFormat(String newNameFormat) {
		String oldNameFormat = nameFormat;
		nameFormat = newNameFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_ENDPOINT__NAME_FORMAT, oldNameFormat, nameFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProtocolType() {
		return protocolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolType(Integer newProtocolType) {
		Integer oldProtocolType = protocolType;
		protocolType = newProtocolType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_ENDPOINT__PROTOCOL_TYPE, oldProtocolType, protocolType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getProtocolIFType() {
		return protocolIFType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocolIFType(Integer newProtocolIFType) {
		Integer oldProtocolIFType = protocolIFType;
		protocolIFType = newProtocolIFType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_ENDPOINT__PROTOCOL_IF_TYPE, oldProtocolIFType, protocolIFType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherTypeDescription() {
		return otherTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherTypeDescription(String newOtherTypeDescription) {
		String oldOtherTypeDescription = otherTypeDescription;
		otherTypeDescription = newOtherTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_ENDPOINT__OTHER_TYPE_DESCRIPTION, oldOtherTypeDescription, otherTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getBroadcastResetSupported() {
		return broadcastResetSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBroadcastResetSupported(Boolean newBroadcastResetSupported) {
		Boolean oldBroadcastResetSupported = broadcastResetSupported;
		broadcastResetSupported = newBroadcastResetSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PROTOCOL_ENDPOINT__BROADCAST_RESET_SUPPORTED, oldBroadcastResetSupported, broadcastResetSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long BroadcastReset() {
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
			case CimPackage.CIM_PROTOCOL_ENDPOINT__NAME_FORMAT:
				return getNameFormat();
			case CimPackage.CIM_PROTOCOL_ENDPOINT__PROTOCOL_TYPE:
				return getProtocolType();
			case CimPackage.CIM_PROTOCOL_ENDPOINT__PROTOCOL_IF_TYPE:
				return getProtocolIFType();
			case CimPackage.CIM_PROTOCOL_ENDPOINT__OTHER_TYPE_DESCRIPTION:
				return getOtherTypeDescription();
			case CimPackage.CIM_PROTOCOL_ENDPOINT__BROADCAST_RESET_SUPPORTED:
				return getBroadcastResetSupported();
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
			case CimPackage.CIM_PROTOCOL_ENDPOINT__NAME_FORMAT:
				setNameFormat((String)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_ENDPOINT__PROTOCOL_TYPE:
				setProtocolType((Integer)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_ENDPOINT__PROTOCOL_IF_TYPE:
				setProtocolIFType((Integer)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_ENDPOINT__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_PROTOCOL_ENDPOINT__BROADCAST_RESET_SUPPORTED:
				setBroadcastResetSupported((Boolean)newValue);
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
			case CimPackage.CIM_PROTOCOL_ENDPOINT__NAME_FORMAT:
				setNameFormat(NAME_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_ENDPOINT__PROTOCOL_TYPE:
				setProtocolType(PROTOCOL_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_ENDPOINT__PROTOCOL_IF_TYPE:
				setProtocolIFType(PROTOCOL_IF_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_ENDPOINT__OTHER_TYPE_DESCRIPTION:
				setOtherTypeDescription(OTHER_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_PROTOCOL_ENDPOINT__BROADCAST_RESET_SUPPORTED:
				setBroadcastResetSupported(BROADCAST_RESET_SUPPORTED_EDEFAULT);
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
			case CimPackage.CIM_PROTOCOL_ENDPOINT__NAME_FORMAT:
				return NAME_FORMAT_EDEFAULT == null ? nameFormat != null : !NAME_FORMAT_EDEFAULT.equals(nameFormat);
			case CimPackage.CIM_PROTOCOL_ENDPOINT__PROTOCOL_TYPE:
				return PROTOCOL_TYPE_EDEFAULT == null ? protocolType != null : !PROTOCOL_TYPE_EDEFAULT.equals(protocolType);
			case CimPackage.CIM_PROTOCOL_ENDPOINT__PROTOCOL_IF_TYPE:
				return PROTOCOL_IF_TYPE_EDEFAULT == null ? protocolIFType != null : !PROTOCOL_IF_TYPE_EDEFAULT.equals(protocolIFType);
			case CimPackage.CIM_PROTOCOL_ENDPOINT__OTHER_TYPE_DESCRIPTION:
				return OTHER_TYPE_DESCRIPTION_EDEFAULT == null ? otherTypeDescription != null : !OTHER_TYPE_DESCRIPTION_EDEFAULT.equals(otherTypeDescription);
			case CimPackage.CIM_PROTOCOL_ENDPOINT__BROADCAST_RESET_SUPPORTED:
				return BROADCAST_RESET_SUPPORTED_EDEFAULT == null ? broadcastResetSupported != null : !BROADCAST_RESET_SUPPORTED_EDEFAULT.equals(broadcastResetSupported);
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
			case CimPackage.CIM_PROTOCOL_ENDPOINT___BROADCAST_RESET:
				return BroadcastReset();
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
		result.append(" (NameFormat: ");
		result.append(nameFormat);
		result.append(", ProtocolType: ");
		result.append(protocolType);
		result.append(", ProtocolIFType: ");
		result.append(protocolIFType);
		result.append(", OtherTypeDescription: ");
		result.append(otherTypeDescription);
		result.append(", BroadcastResetSupported: ");
		result.append(broadcastResetSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_ProtocolEndpointImpl

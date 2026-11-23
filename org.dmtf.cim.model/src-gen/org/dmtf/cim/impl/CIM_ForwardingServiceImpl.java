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

import org.dmtf.cim.CIM_ForwardingService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Forwarding Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ForwardingServiceImpl#getProtocolType <em>Protocol Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ForwardingServiceImpl#getOtherProtocolType <em>Other Protocol Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ForwardingServiceImpl extends CIM_NetworkServiceImpl implements CIM_ForwardingService {
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
	 * The default value of the '{@link #getOtherProtocolType() <em>Other Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocolType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_PROTOCOL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherProtocolType() <em>Other Protocol Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherProtocolType()
	 * @generated
	 * @ordered
	 */
	protected String otherProtocolType = OTHER_PROTOCOL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ForwardingServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ForwardingService();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FORWARDING_SERVICE__PROTOCOL_TYPE, oldProtocolType, protocolType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherProtocolType() {
		return otherProtocolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherProtocolType(String newOtherProtocolType) {
		String oldOtherProtocolType = otherProtocolType;
		otherProtocolType = newOtherProtocolType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FORWARDING_SERVICE__OTHER_PROTOCOL_TYPE, oldOtherProtocolType, otherProtocolType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FORWARDING_SERVICE__PROTOCOL_TYPE:
				return getProtocolType();
			case CimPackage.CIM_FORWARDING_SERVICE__OTHER_PROTOCOL_TYPE:
				return getOtherProtocolType();
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
			case CimPackage.CIM_FORWARDING_SERVICE__PROTOCOL_TYPE:
				setProtocolType((Integer)newValue);
				return;
			case CimPackage.CIM_FORWARDING_SERVICE__OTHER_PROTOCOL_TYPE:
				setOtherProtocolType((String)newValue);
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
			case CimPackage.CIM_FORWARDING_SERVICE__PROTOCOL_TYPE:
				setProtocolType(PROTOCOL_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_FORWARDING_SERVICE__OTHER_PROTOCOL_TYPE:
				setOtherProtocolType(OTHER_PROTOCOL_TYPE_EDEFAULT);
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
			case CimPackage.CIM_FORWARDING_SERVICE__PROTOCOL_TYPE:
				return PROTOCOL_TYPE_EDEFAULT == null ? protocolType != null : !PROTOCOL_TYPE_EDEFAULT.equals(protocolType);
			case CimPackage.CIM_FORWARDING_SERVICE__OTHER_PROTOCOL_TYPE:
				return OTHER_PROTOCOL_TYPE_EDEFAULT == null ? otherProtocolType != null : !OTHER_PROTOCOL_TYPE_EDEFAULT.equals(otherProtocolType);
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
		result.append(" (ProtocolType: ");
		result.append(protocolType);
		result.append(", OtherProtocolType: ");
		result.append(otherProtocolType);
		result.append(')');
		return result.toString();
	}

} //CIM_ForwardingServiceImpl

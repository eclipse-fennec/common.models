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

import org.dmtf.cim.CIM_SAAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SA Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SAActionImpl#getDoPacketLogging <em>Do Packet Logging</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_SAActionImpl extends CIM_PolicyActionImpl implements CIM_SAAction {
	/**
	 * The default value of the '{@link #getDoPacketLogging() <em>Do Packet Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoPacketLogging()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DO_PACKET_LOGGING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoPacketLogging() <em>Do Packet Logging</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoPacketLogging()
	 * @generated
	 * @ordered
	 */
	protected Boolean doPacketLogging = DO_PACKET_LOGGING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SAActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SAAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDoPacketLogging() {
		return doPacketLogging;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoPacketLogging(Boolean newDoPacketLogging) {
		Boolean oldDoPacketLogging = doPacketLogging;
		doPacketLogging = newDoPacketLogging;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SA_ACTION__DO_PACKET_LOGGING, oldDoPacketLogging, doPacketLogging));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SA_ACTION__DO_PACKET_LOGGING:
				return getDoPacketLogging();
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
			case CimPackage.CIM_SA_ACTION__DO_PACKET_LOGGING:
				setDoPacketLogging((Boolean)newValue);
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
			case CimPackage.CIM_SA_ACTION__DO_PACKET_LOGGING:
				setDoPacketLogging(DO_PACKET_LOGGING_EDEFAULT);
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
			case CimPackage.CIM_SA_ACTION__DO_PACKET_LOGGING:
				return DO_PACKET_LOGGING_EDEFAULT == null ? doPacketLogging != null : !DO_PACKET_LOGGING_EDEFAULT.equals(doPacketLogging);
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
		result.append(" (DoPacketLogging: ");
		result.append(doPacketLogging);
		result.append(')');
		return result.toString();
	}

} //CIM_SAActionImpl

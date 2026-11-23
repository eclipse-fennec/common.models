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

import org.dmtf.cim.CIM_DeviceConnection;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Device Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceConnectionImpl#getNegotiatedSpeed <em>Negotiated Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceConnectionImpl#getNegotiatedDataWidth <em>Negotiated Data Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DeviceConnectionImpl extends CIM_DependencyImpl implements CIM_DeviceConnection {
	/**
	 * The default value of the '{@link #getNegotiatedSpeed() <em>Negotiated Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long NEGOTIATED_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegotiatedSpeed() <em>Negotiated Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long negotiatedSpeed = NEGOTIATED_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNegotiatedDataWidth() <em>Negotiated Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedDataWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Long NEGOTIATED_DATA_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegotiatedDataWidth() <em>Negotiated Data Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedDataWidth()
	 * @generated
	 * @ordered
	 */
	protected Long negotiatedDataWidth = NEGOTIATED_DATA_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DeviceConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DeviceConnection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNegotiatedSpeed() {
		return negotiatedSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNegotiatedSpeed(Long newNegotiatedSpeed) {
		Long oldNegotiatedSpeed = negotiatedSpeed;
		negotiatedSpeed = newNegotiatedSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_CONNECTION__NEGOTIATED_SPEED, oldNegotiatedSpeed, negotiatedSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNegotiatedDataWidth() {
		return negotiatedDataWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNegotiatedDataWidth(Long newNegotiatedDataWidth) {
		Long oldNegotiatedDataWidth = negotiatedDataWidth;
		negotiatedDataWidth = newNegotiatedDataWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_CONNECTION__NEGOTIATED_DATA_WIDTH, oldNegotiatedDataWidth, negotiatedDataWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DEVICE_CONNECTION__NEGOTIATED_SPEED:
				return getNegotiatedSpeed();
			case CimPackage.CIM_DEVICE_CONNECTION__NEGOTIATED_DATA_WIDTH:
				return getNegotiatedDataWidth();
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
			case CimPackage.CIM_DEVICE_CONNECTION__NEGOTIATED_SPEED:
				setNegotiatedSpeed((Long)newValue);
				return;
			case CimPackage.CIM_DEVICE_CONNECTION__NEGOTIATED_DATA_WIDTH:
				setNegotiatedDataWidth((Long)newValue);
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
			case CimPackage.CIM_DEVICE_CONNECTION__NEGOTIATED_SPEED:
				setNegotiatedSpeed(NEGOTIATED_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_DEVICE_CONNECTION__NEGOTIATED_DATA_WIDTH:
				setNegotiatedDataWidth(NEGOTIATED_DATA_WIDTH_EDEFAULT);
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
			case CimPackage.CIM_DEVICE_CONNECTION__NEGOTIATED_SPEED:
				return NEGOTIATED_SPEED_EDEFAULT == null ? negotiatedSpeed != null : !NEGOTIATED_SPEED_EDEFAULT.equals(negotiatedSpeed);
			case CimPackage.CIM_DEVICE_CONNECTION__NEGOTIATED_DATA_WIDTH:
				return NEGOTIATED_DATA_WIDTH_EDEFAULT == null ? negotiatedDataWidth != null : !NEGOTIATED_DATA_WIDTH_EDEFAULT.equals(negotiatedDataWidth);
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
		result.append(" (NegotiatedSpeed: ");
		result.append(negotiatedSpeed);
		result.append(", NegotiatedDataWidth: ");
		result.append(negotiatedDataWidth);
		result.append(')');
		return result.toString();
	}

} //CIM_DeviceConnectionImpl

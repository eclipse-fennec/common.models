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

import org.dmtf.cim.CIM_AbstractProtocolControllerForDevice;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Abstract Protocol Controller For Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractProtocolControllerForDeviceImpl#getDeviceNumber <em>Device Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractProtocolControllerForDeviceImpl#getAccessPriority <em>Access Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AbstractProtocolControllerForDeviceImpl#getAccessState <em>Access State</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_AbstractProtocolControllerForDeviceImpl extends CIM_DependencyImpl implements CIM_AbstractProtocolControllerForDevice {
	/**
	 * The default value of the '{@link #getDeviceNumber() <em>Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceNumber() <em>Device Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceNumber()
	 * @generated
	 * @ordered
	 */
	protected String deviceNumber = DEVICE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessPriority() <em>Access Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessPriority() <em>Access Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer accessPriority = ACCESS_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessState() <em>Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessState() <em>Access State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessState()
	 * @generated
	 * @ordered
	 */
	protected Integer accessState = ACCESS_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AbstractProtocolControllerForDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AbstractProtocolControllerForDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceNumber() {
		return deviceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceNumber(String newDeviceNumber) {
		String oldDeviceNumber = deviceNumber;
		deviceNumber = newDeviceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_PROTOCOL_CONTROLLER_FOR_DEVICE__DEVICE_NUMBER, oldDeviceNumber, deviceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccessPriority() {
		return accessPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessPriority(Integer newAccessPriority) {
		Integer oldAccessPriority = accessPriority;
		accessPriority = newAccessPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_PROTOCOL_CONTROLLER_FOR_DEVICE__ACCESS_PRIORITY, oldAccessPriority, accessPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccessState() {
		return accessState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessState(Integer newAccessState) {
		Integer oldAccessState = accessState;
		accessState = newAccessState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ABSTRACT_PROTOCOL_CONTROLLER_FOR_DEVICE__ACCESS_STATE, oldAccessState, accessState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ABSTRACT_PROTOCOL_CONTROLLER_FOR_DEVICE__DEVICE_NUMBER:
				return getDeviceNumber();
			case CimPackage.CIM_ABSTRACT_PROTOCOL_CONTROLLER_FOR_DEVICE__ACCESS_PRIORITY:
				return getAccessPriority();
			case CimPackage.CIM_ABSTRACT_PROTOCOL_CONTROLLER_FOR_DEVICE__ACCESS_STATE:
				return getAccessState();
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
			case CimPackage.CIM_ABSTRACT_PROTOCOL_CONTROLLER_FOR_DEVICE__DEVICE_NUMBER:
				setDeviceNumber((String)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_PROTOCOL_CONTROLLER_FOR_DEVICE__ACCESS_PRIORITY:
				setAccessPriority((Integer)newValue);
				return;
			case CimPackage.CIM_ABSTRACT_PROTOCOL_CONTROLLER_FOR_DEVICE__ACCESS_STATE:
				setAccessState((Integer)newValue);
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
			case CimPackage.CIM_ABSTRACT_PROTOCOL_CONTROLLER_FOR_DEVICE__DEVICE_NUMBER:
				setDeviceNumber(DEVICE_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_PROTOCOL_CONTROLLER_FOR_DEVICE__ACCESS_PRIORITY:
				setAccessPriority(ACCESS_PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_ABSTRACT_PROTOCOL_CONTROLLER_FOR_DEVICE__ACCESS_STATE:
				setAccessState(ACCESS_STATE_EDEFAULT);
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
			case CimPackage.CIM_ABSTRACT_PROTOCOL_CONTROLLER_FOR_DEVICE__DEVICE_NUMBER:
				return DEVICE_NUMBER_EDEFAULT == null ? deviceNumber != null : !DEVICE_NUMBER_EDEFAULT.equals(deviceNumber);
			case CimPackage.CIM_ABSTRACT_PROTOCOL_CONTROLLER_FOR_DEVICE__ACCESS_PRIORITY:
				return ACCESS_PRIORITY_EDEFAULT == null ? accessPriority != null : !ACCESS_PRIORITY_EDEFAULT.equals(accessPriority);
			case CimPackage.CIM_ABSTRACT_PROTOCOL_CONTROLLER_FOR_DEVICE__ACCESS_STATE:
				return ACCESS_STATE_EDEFAULT == null ? accessState != null : !ACCESS_STATE_EDEFAULT.equals(accessState);
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
		result.append(" (DeviceNumber: ");
		result.append(deviceNumber);
		result.append(", AccessPriority: ");
		result.append(accessPriority);
		result.append(", AccessState: ");
		result.append(accessState);
		result.append(')');
		return result.toString();
	}

} //CIM_AbstractProtocolControllerForDeviceImpl

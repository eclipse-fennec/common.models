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

import org.dmtf.cim.CIM_LogicalPortSettings;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Logical Port Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortSettingsImpl#getRequestedSpeed <em>Requested Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortSettingsImpl#getAutoSenseSpeed <em>Auto Sense Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LogicalPortSettingsImpl extends CIM_SettingDataImpl implements CIM_LogicalPortSettings {
	/**
	 * The default value of the '{@link #getRequestedSpeed() <em>Requested Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long REQUESTED_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequestedSpeed() <em>Requested Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long requestedSpeed = REQUESTED_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoSenseSpeed() <em>Auto Sense Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoSenseSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_SENSE_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoSenseSpeed() <em>Auto Sense Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoSenseSpeed()
	 * @generated
	 * @ordered
	 */
	protected Boolean autoSenseSpeed = AUTO_SENSE_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LogicalPortSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LogicalPortSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRequestedSpeed() {
		return requestedSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestedSpeed(Long newRequestedSpeed) {
		Long oldRequestedSpeed = requestedSpeed;
		requestedSpeed = newRequestedSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT_SETTINGS__REQUESTED_SPEED, oldRequestedSpeed, requestedSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutoSenseSpeed() {
		return autoSenseSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoSenseSpeed(Boolean newAutoSenseSpeed) {
		Boolean oldAutoSenseSpeed = autoSenseSpeed;
		autoSenseSpeed = newAutoSenseSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT_SETTINGS__AUTO_SENSE_SPEED, oldAutoSenseSpeed, autoSenseSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOGICAL_PORT_SETTINGS__REQUESTED_SPEED:
				return getRequestedSpeed();
			case CimPackage.CIM_LOGICAL_PORT_SETTINGS__AUTO_SENSE_SPEED:
				return getAutoSenseSpeed();
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
			case CimPackage.CIM_LOGICAL_PORT_SETTINGS__REQUESTED_SPEED:
				setRequestedSpeed((Long)newValue);
				return;
			case CimPackage.CIM_LOGICAL_PORT_SETTINGS__AUTO_SENSE_SPEED:
				setAutoSenseSpeed((Boolean)newValue);
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
			case CimPackage.CIM_LOGICAL_PORT_SETTINGS__REQUESTED_SPEED:
				setRequestedSpeed(REQUESTED_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_LOGICAL_PORT_SETTINGS__AUTO_SENSE_SPEED:
				setAutoSenseSpeed(AUTO_SENSE_SPEED_EDEFAULT);
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
			case CimPackage.CIM_LOGICAL_PORT_SETTINGS__REQUESTED_SPEED:
				return REQUESTED_SPEED_EDEFAULT == null ? requestedSpeed != null : !REQUESTED_SPEED_EDEFAULT.equals(requestedSpeed);
			case CimPackage.CIM_LOGICAL_PORT_SETTINGS__AUTO_SENSE_SPEED:
				return AUTO_SENSE_SPEED_EDEFAULT == null ? autoSenseSpeed != null : !AUTO_SENSE_SPEED_EDEFAULT.equals(autoSenseSpeed);
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
		result.append(" (RequestedSpeed: ");
		result.append(requestedSpeed);
		result.append(", AutoSenseSpeed: ");
		result.append(autoSenseSpeed);
		result.append(')');
		return result.toString();
	}

} //CIM_LogicalPortSettingsImpl

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

import java.util.Collection;

import org.dmtf.cim.CIM_LogicalPortCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Logical Port Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortCapabilitiesImpl#getRequestedSpeedsSupported <em>Requested Speeds Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogicalPortCapabilitiesImpl#getAutoSenseSpeedConfigurable <em>Auto Sense Speed Configurable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LogicalPortCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_LogicalPortCapabilities {
	/**
	 * The cached value of the '{@link #getRequestedSpeedsSupported() <em>Requested Speeds Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedSpeedsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> requestedSpeedsSupported;

	/**
	 * The default value of the '{@link #getAutoSenseSpeedConfigurable() <em>Auto Sense Speed Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoSenseSpeedConfigurable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_SENSE_SPEED_CONFIGURABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoSenseSpeedConfigurable() <em>Auto Sense Speed Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoSenseSpeedConfigurable()
	 * @generated
	 * @ordered
	 */
	protected Boolean autoSenseSpeedConfigurable = AUTO_SENSE_SPEED_CONFIGURABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LogicalPortCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LogicalPortCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getRequestedSpeedsSupported() {
		if (requestedSpeedsSupported == null) {
			requestedSpeedsSupported = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_LOGICAL_PORT_CAPABILITIES__REQUESTED_SPEEDS_SUPPORTED);
		}
		return requestedSpeedsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutoSenseSpeedConfigurable() {
		return autoSenseSpeedConfigurable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoSenseSpeedConfigurable(Boolean newAutoSenseSpeedConfigurable) {
		Boolean oldAutoSenseSpeedConfigurable = autoSenseSpeedConfigurable;
		autoSenseSpeedConfigurable = newAutoSenseSpeedConfigurable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOGICAL_PORT_CAPABILITIES__AUTO_SENSE_SPEED_CONFIGURABLE, oldAutoSenseSpeedConfigurable, autoSenseSpeedConfigurable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOGICAL_PORT_CAPABILITIES__REQUESTED_SPEEDS_SUPPORTED:
				return getRequestedSpeedsSupported();
			case CimPackage.CIM_LOGICAL_PORT_CAPABILITIES__AUTO_SENSE_SPEED_CONFIGURABLE:
				return getAutoSenseSpeedConfigurable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_LOGICAL_PORT_CAPABILITIES__REQUESTED_SPEEDS_SUPPORTED:
				getRequestedSpeedsSupported().clear();
				getRequestedSpeedsSupported().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_LOGICAL_PORT_CAPABILITIES__AUTO_SENSE_SPEED_CONFIGURABLE:
				setAutoSenseSpeedConfigurable((Boolean)newValue);
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
			case CimPackage.CIM_LOGICAL_PORT_CAPABILITIES__REQUESTED_SPEEDS_SUPPORTED:
				getRequestedSpeedsSupported().clear();
				return;
			case CimPackage.CIM_LOGICAL_PORT_CAPABILITIES__AUTO_SENSE_SPEED_CONFIGURABLE:
				setAutoSenseSpeedConfigurable(AUTO_SENSE_SPEED_CONFIGURABLE_EDEFAULT);
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
			case CimPackage.CIM_LOGICAL_PORT_CAPABILITIES__REQUESTED_SPEEDS_SUPPORTED:
				return requestedSpeedsSupported != null && !requestedSpeedsSupported.isEmpty();
			case CimPackage.CIM_LOGICAL_PORT_CAPABILITIES__AUTO_SENSE_SPEED_CONFIGURABLE:
				return AUTO_SENSE_SPEED_CONFIGURABLE_EDEFAULT == null ? autoSenseSpeedConfigurable != null : !AUTO_SENSE_SPEED_CONFIGURABLE_EDEFAULT.equals(autoSenseSpeedConfigurable);
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
		result.append(" (RequestedSpeedsSupported: ");
		result.append(requestedSpeedsSupported);
		result.append(", AutoSenseSpeedConfigurable: ");
		result.append(autoSenseSpeedConfigurable);
		result.append(')');
		return result.toString();
	}

} //CIM_LogicalPortCapabilitiesImpl

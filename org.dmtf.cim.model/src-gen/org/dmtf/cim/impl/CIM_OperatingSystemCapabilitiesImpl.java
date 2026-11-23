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

import org.dmtf.cim.CIM_OperatingSystemCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Operating System Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OperatingSystemCapabilitiesImpl#getHostShutdownBehavior <em>Host Shutdown Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OperatingSystemCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_OperatingSystemCapabilities {
	/**
	 * The default value of the '{@link #getHostShutdownBehavior() <em>Host Shutdown Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostShutdownBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HOST_SHUTDOWN_BEHAVIOR_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getHostShutdownBehavior() <em>Host Shutdown Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostShutdownBehavior()
	 * @generated
	 * @ordered
	 */
	protected Integer hostShutdownBehavior = HOST_SHUTDOWN_BEHAVIOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OperatingSystemCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OperatingSystemCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHostShutdownBehavior() {
		return hostShutdownBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostShutdownBehavior(Integer newHostShutdownBehavior) {
		Integer oldHostShutdownBehavior = hostShutdownBehavior;
		hostShutdownBehavior = newHostShutdownBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OPERATING_SYSTEM_CAPABILITIES__HOST_SHUTDOWN_BEHAVIOR, oldHostShutdownBehavior, hostShutdownBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OPERATING_SYSTEM_CAPABILITIES__HOST_SHUTDOWN_BEHAVIOR:
				return getHostShutdownBehavior();
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
			case CimPackage.CIM_OPERATING_SYSTEM_CAPABILITIES__HOST_SHUTDOWN_BEHAVIOR:
				setHostShutdownBehavior((Integer)newValue);
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
			case CimPackage.CIM_OPERATING_SYSTEM_CAPABILITIES__HOST_SHUTDOWN_BEHAVIOR:
				setHostShutdownBehavior(HOST_SHUTDOWN_BEHAVIOR_EDEFAULT);
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
			case CimPackage.CIM_OPERATING_SYSTEM_CAPABILITIES__HOST_SHUTDOWN_BEHAVIOR:
				return HOST_SHUTDOWN_BEHAVIOR_EDEFAULT == null ? hostShutdownBehavior != null : !HOST_SHUTDOWN_BEHAVIOR_EDEFAULT.equals(hostShutdownBehavior);
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
		result.append(" (HostShutdownBehavior: ");
		result.append(hostShutdownBehavior);
		result.append(')');
		return result.toString();
	}

} //CIM_OperatingSystemCapabilitiesImpl

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

import org.dmtf.cim.CIM_VirtualSystemSnapshotCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Virtual System Snapshot Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSnapshotCapabilitiesImpl#getSnapshotTypesEnabled <em>Snapshot Types Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSnapshotCapabilitiesImpl#getGuestOSNotificationEnabled <em>Guest OS Notification Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VirtualSystemSnapshotCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_VirtualSystemSnapshotCapabilities {
	/**
	 * The cached value of the '{@link #getSnapshotTypesEnabled() <em>Snapshot Types Enabled</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapshotTypesEnabled()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> snapshotTypesEnabled;

	/**
	 * The default value of the '{@link #getGuestOSNotificationEnabled() <em>Guest OS Notification Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestOSNotificationEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean GUEST_OS_NOTIFICATION_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuestOSNotificationEnabled() <em>Guest OS Notification Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestOSNotificationEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean guestOSNotificationEnabled = GUEST_OS_NOTIFICATION_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VirtualSystemSnapshotCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VirtualSystemSnapshotCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSnapshotTypesEnabled() {
		if (snapshotTypesEnabled == null) {
			snapshotTypesEnabled = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_CAPABILITIES__SNAPSHOT_TYPES_ENABLED);
		}
		return snapshotTypesEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getGuestOSNotificationEnabled() {
		return guestOSNotificationEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuestOSNotificationEnabled(Boolean newGuestOSNotificationEnabled) {
		Boolean oldGuestOSNotificationEnabled = guestOSNotificationEnabled;
		guestOSNotificationEnabled = newGuestOSNotificationEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_CAPABILITIES__GUEST_OS_NOTIFICATION_ENABLED, oldGuestOSNotificationEnabled, guestOSNotificationEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_CAPABILITIES__SNAPSHOT_TYPES_ENABLED:
				return getSnapshotTypesEnabled();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_CAPABILITIES__GUEST_OS_NOTIFICATION_ENABLED:
				return getGuestOSNotificationEnabled();
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_CAPABILITIES__SNAPSHOT_TYPES_ENABLED:
				getSnapshotTypesEnabled().clear();
				getSnapshotTypesEnabled().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_CAPABILITIES__GUEST_OS_NOTIFICATION_ENABLED:
				setGuestOSNotificationEnabled((Boolean)newValue);
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_CAPABILITIES__SNAPSHOT_TYPES_ENABLED:
				getSnapshotTypesEnabled().clear();
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_CAPABILITIES__GUEST_OS_NOTIFICATION_ENABLED:
				setGuestOSNotificationEnabled(GUEST_OS_NOTIFICATION_ENABLED_EDEFAULT);
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_CAPABILITIES__SNAPSHOT_TYPES_ENABLED:
				return snapshotTypesEnabled != null && !snapshotTypesEnabled.isEmpty();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SNAPSHOT_CAPABILITIES__GUEST_OS_NOTIFICATION_ENABLED:
				return GUEST_OS_NOTIFICATION_ENABLED_EDEFAULT == null ? guestOSNotificationEnabled != null : !GUEST_OS_NOTIFICATION_ENABLED_EDEFAULT.equals(guestOSNotificationEnabled);
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
		result.append(" (SnapshotTypesEnabled: ");
		result.append(snapshotTypesEnabled);
		result.append(", GuestOSNotificationEnabled: ");
		result.append(guestOSNotificationEnabled);
		result.append(')');
		return result.toString();
	}

} //CIM_VirtualSystemSnapshotCapabilitiesImpl

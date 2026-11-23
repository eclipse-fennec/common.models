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

import org.dmtf.cim.CIM_RemoteReplicationCollection;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Remote Replication Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RemoteReplicationCollectionImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RemoteReplicationCollectionImpl#getDeleteOnUnassociated <em>Delete On Unassociated</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RemoteReplicationCollectionImpl#getHardwareCompressionEnabled <em>Hardware Compression Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RemoteReplicationCollectionImpl#getSoftwareCompressionEnabled <em>Software Compression Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RemoteReplicationCollectionImpl extends CIM_ConnectivityCollectionImpl implements CIM_RemoteReplicationCollection {
	/**
	 * The default value of the '{@link #getActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ACTIVE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected Boolean active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeleteOnUnassociated() <em>Delete On Unassociated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnUnassociated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELETE_ON_UNASSOCIATED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getDeleteOnUnassociated() <em>Delete On Unassociated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteOnUnassociated()
	 * @generated
	 * @ordered
	 */
	protected Boolean deleteOnUnassociated = DELETE_ON_UNASSOCIATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardwareCompressionEnabled() <em>Hardware Compression Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareCompressionEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HARDWARE_COMPRESSION_ENABLED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getHardwareCompressionEnabled() <em>Hardware Compression Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareCompressionEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean hardwareCompressionEnabled = HARDWARE_COMPRESSION_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoftwareCompressionEnabled() <em>Software Compression Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareCompressionEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SOFTWARE_COMPRESSION_ENABLED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getSoftwareCompressionEnabled() <em>Software Compression Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareCompressionEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean softwareCompressionEnabled = SOFTWARE_COMPRESSION_ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RemoteReplicationCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RemoteReplicationCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActive(Boolean newActive) {
		Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeleteOnUnassociated() {
		return deleteOnUnassociated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleteOnUnassociated(Boolean newDeleteOnUnassociated) {
		Boolean oldDeleteOnUnassociated = deleteOnUnassociated;
		deleteOnUnassociated = newDeleteOnUnassociated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__DELETE_ON_UNASSOCIATED, oldDeleteOnUnassociated, deleteOnUnassociated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHardwareCompressionEnabled() {
		return hardwareCompressionEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHardwareCompressionEnabled(Boolean newHardwareCompressionEnabled) {
		Boolean oldHardwareCompressionEnabled = hardwareCompressionEnabled;
		hardwareCompressionEnabled = newHardwareCompressionEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__HARDWARE_COMPRESSION_ENABLED, oldHardwareCompressionEnabled, hardwareCompressionEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSoftwareCompressionEnabled() {
		return softwareCompressionEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftwareCompressionEnabled(Boolean newSoftwareCompressionEnabled) {
		Boolean oldSoftwareCompressionEnabled = softwareCompressionEnabled;
		softwareCompressionEnabled = newSoftwareCompressionEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__SOFTWARE_COMPRESSION_ENABLED, oldSoftwareCompressionEnabled, softwareCompressionEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__ACTIVE:
				return getActive();
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__DELETE_ON_UNASSOCIATED:
				return getDeleteOnUnassociated();
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__HARDWARE_COMPRESSION_ENABLED:
				return getHardwareCompressionEnabled();
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__SOFTWARE_COMPRESSION_ENABLED:
				return getSoftwareCompressionEnabled();
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
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__DELETE_ON_UNASSOCIATED:
				setDeleteOnUnassociated((Boolean)newValue);
				return;
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__HARDWARE_COMPRESSION_ENABLED:
				setHardwareCompressionEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__SOFTWARE_COMPRESSION_ENABLED:
				setSoftwareCompressionEnabled((Boolean)newValue);
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
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__DELETE_ON_UNASSOCIATED:
				setDeleteOnUnassociated(DELETE_ON_UNASSOCIATED_EDEFAULT);
				return;
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__HARDWARE_COMPRESSION_ENABLED:
				setHardwareCompressionEnabled(HARDWARE_COMPRESSION_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__SOFTWARE_COMPRESSION_ENABLED:
				setSoftwareCompressionEnabled(SOFTWARE_COMPRESSION_ENABLED_EDEFAULT);
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
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__ACTIVE:
				return ACTIVE_EDEFAULT == null ? active != null : !ACTIVE_EDEFAULT.equals(active);
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__DELETE_ON_UNASSOCIATED:
				return DELETE_ON_UNASSOCIATED_EDEFAULT == null ? deleteOnUnassociated != null : !DELETE_ON_UNASSOCIATED_EDEFAULT.equals(deleteOnUnassociated);
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__HARDWARE_COMPRESSION_ENABLED:
				return HARDWARE_COMPRESSION_ENABLED_EDEFAULT == null ? hardwareCompressionEnabled != null : !HARDWARE_COMPRESSION_ENABLED_EDEFAULT.equals(hardwareCompressionEnabled);
			case CimPackage.CIM_REMOTE_REPLICATION_COLLECTION__SOFTWARE_COMPRESSION_ENABLED:
				return SOFTWARE_COMPRESSION_ENABLED_EDEFAULT == null ? softwareCompressionEnabled != null : !SOFTWARE_COMPRESSION_ENABLED_EDEFAULT.equals(softwareCompressionEnabled);
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
		result.append(" (Active: ");
		result.append(active);
		result.append(", DeleteOnUnassociated: ");
		result.append(deleteOnUnassociated);
		result.append(", HardwareCompressionEnabled: ");
		result.append(hardwareCompressionEnabled);
		result.append(", SoftwareCompressionEnabled: ");
		result.append(softwareCompressionEnabled);
		result.append(')');
		return result.toString();
	}

} //CIM_RemoteReplicationCollectionImpl

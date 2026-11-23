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

import org.dmtf.cim.CIM_VersionCompatibilityCheck;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Version Compatibility Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VersionCompatibilityCheckImpl#getAllowDownVersion <em>Allow Down Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VersionCompatibilityCheckImpl#getAllowMultipleVersions <em>Allow Multiple Versions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VersionCompatibilityCheckImpl#getReinstall <em>Reinstall</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VersionCompatibilityCheckImpl extends CIM_CheckImpl implements CIM_VersionCompatibilityCheck {
	/**
	 * The default value of the '{@link #getAllowDownVersion() <em>Allow Down Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDownVersion()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_DOWN_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowDownVersion() <em>Allow Down Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDownVersion()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowDownVersion = ALLOW_DOWN_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowMultipleVersions() <em>Allow Multiple Versions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMultipleVersions()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_MULTIPLE_VERSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowMultipleVersions() <em>Allow Multiple Versions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMultipleVersions()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowMultipleVersions = ALLOW_MULTIPLE_VERSIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReinstall() <em>Reinstall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReinstall()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REINSTALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReinstall() <em>Reinstall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReinstall()
	 * @generated
	 * @ordered
	 */
	protected Boolean reinstall = REINSTALL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VersionCompatibilityCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VersionCompatibilityCheck();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowDownVersion() {
		return allowDownVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowDownVersion(Boolean newAllowDownVersion) {
		Boolean oldAllowDownVersion = allowDownVersion;
		allowDownVersion = newAllowDownVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VERSION_COMPATIBILITY_CHECK__ALLOW_DOWN_VERSION, oldAllowDownVersion, allowDownVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowMultipleVersions() {
		return allowMultipleVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowMultipleVersions(Boolean newAllowMultipleVersions) {
		Boolean oldAllowMultipleVersions = allowMultipleVersions;
		allowMultipleVersions = newAllowMultipleVersions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VERSION_COMPATIBILITY_CHECK__ALLOW_MULTIPLE_VERSIONS, oldAllowMultipleVersions, allowMultipleVersions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getReinstall() {
		return reinstall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReinstall(Boolean newReinstall) {
		Boolean oldReinstall = reinstall;
		reinstall = newReinstall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VERSION_COMPATIBILITY_CHECK__REINSTALL, oldReinstall, reinstall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VERSION_COMPATIBILITY_CHECK__ALLOW_DOWN_VERSION:
				return getAllowDownVersion();
			case CimPackage.CIM_VERSION_COMPATIBILITY_CHECK__ALLOW_MULTIPLE_VERSIONS:
				return getAllowMultipleVersions();
			case CimPackage.CIM_VERSION_COMPATIBILITY_CHECK__REINSTALL:
				return getReinstall();
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
			case CimPackage.CIM_VERSION_COMPATIBILITY_CHECK__ALLOW_DOWN_VERSION:
				setAllowDownVersion((Boolean)newValue);
				return;
			case CimPackage.CIM_VERSION_COMPATIBILITY_CHECK__ALLOW_MULTIPLE_VERSIONS:
				setAllowMultipleVersions((Boolean)newValue);
				return;
			case CimPackage.CIM_VERSION_COMPATIBILITY_CHECK__REINSTALL:
				setReinstall((Boolean)newValue);
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
			case CimPackage.CIM_VERSION_COMPATIBILITY_CHECK__ALLOW_DOWN_VERSION:
				setAllowDownVersion(ALLOW_DOWN_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_VERSION_COMPATIBILITY_CHECK__ALLOW_MULTIPLE_VERSIONS:
				setAllowMultipleVersions(ALLOW_MULTIPLE_VERSIONS_EDEFAULT);
				return;
			case CimPackage.CIM_VERSION_COMPATIBILITY_CHECK__REINSTALL:
				setReinstall(REINSTALL_EDEFAULT);
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
			case CimPackage.CIM_VERSION_COMPATIBILITY_CHECK__ALLOW_DOWN_VERSION:
				return ALLOW_DOWN_VERSION_EDEFAULT == null ? allowDownVersion != null : !ALLOW_DOWN_VERSION_EDEFAULT.equals(allowDownVersion);
			case CimPackage.CIM_VERSION_COMPATIBILITY_CHECK__ALLOW_MULTIPLE_VERSIONS:
				return ALLOW_MULTIPLE_VERSIONS_EDEFAULT == null ? allowMultipleVersions != null : !ALLOW_MULTIPLE_VERSIONS_EDEFAULT.equals(allowMultipleVersions);
			case CimPackage.CIM_VERSION_COMPATIBILITY_CHECK__REINSTALL:
				return REINSTALL_EDEFAULT == null ? reinstall != null : !REINSTALL_EDEFAULT.equals(reinstall);
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
		result.append(" (AllowDownVersion: ");
		result.append(allowDownVersion);
		result.append(", AllowMultipleVersions: ");
		result.append(allowMultipleVersions);
		result.append(", Reinstall: ");
		result.append(reinstall);
		result.append(')');
		return result.toString();
	}

} //CIM_VersionCompatibilityCheckImpl

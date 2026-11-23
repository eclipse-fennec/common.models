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

import org.dmtf.cim.CIM_OSVersionCheck;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM OS Version Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSVersionCheckImpl#getMinimumVersion <em>Minimum Version</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OSVersionCheckImpl#getMaximumVersion <em>Maximum Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OSVersionCheckImpl extends CIM_CheckImpl implements CIM_OSVersionCheck {
	/**
	 * The default value of the '{@link #getMinimumVersion() <em>Minimum Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumVersion() <em>Minimum Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumVersion()
	 * @generated
	 * @ordered
	 */
	protected String minimumVersion = MINIMUM_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumVersion() <em>Maximum Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumVersion() <em>Maximum Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumVersion()
	 * @generated
	 * @ordered
	 */
	protected String maximumVersion = MAXIMUM_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OSVersionCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OSVersionCheck();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMinimumVersion() {
		return minimumVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumVersion(String newMinimumVersion) {
		String oldMinimumVersion = minimumVersion;
		minimumVersion = newMinimumVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OS_VERSION_CHECK__MINIMUM_VERSION, oldMinimumVersion, minimumVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaximumVersion() {
		return maximumVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumVersion(String newMaximumVersion) {
		String oldMaximumVersion = maximumVersion;
		maximumVersion = newMaximumVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OS_VERSION_CHECK__MAXIMUM_VERSION, oldMaximumVersion, maximumVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OS_VERSION_CHECK__MINIMUM_VERSION:
				return getMinimumVersion();
			case CimPackage.CIM_OS_VERSION_CHECK__MAXIMUM_VERSION:
				return getMaximumVersion();
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
			case CimPackage.CIM_OS_VERSION_CHECK__MINIMUM_VERSION:
				setMinimumVersion((String)newValue);
				return;
			case CimPackage.CIM_OS_VERSION_CHECK__MAXIMUM_VERSION:
				setMaximumVersion((String)newValue);
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
			case CimPackage.CIM_OS_VERSION_CHECK__MINIMUM_VERSION:
				setMinimumVersion(MINIMUM_VERSION_EDEFAULT);
				return;
			case CimPackage.CIM_OS_VERSION_CHECK__MAXIMUM_VERSION:
				setMaximumVersion(MAXIMUM_VERSION_EDEFAULT);
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
			case CimPackage.CIM_OS_VERSION_CHECK__MINIMUM_VERSION:
				return MINIMUM_VERSION_EDEFAULT == null ? minimumVersion != null : !MINIMUM_VERSION_EDEFAULT.equals(minimumVersion);
			case CimPackage.CIM_OS_VERSION_CHECK__MAXIMUM_VERSION:
				return MAXIMUM_VERSION_EDEFAULT == null ? maximumVersion != null : !MAXIMUM_VERSION_EDEFAULT.equals(maximumVersion);
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
		result.append(" (MinimumVersion: ");
		result.append(minimumVersion);
		result.append(", MaximumVersion: ");
		result.append(maximumVersion);
		result.append(')');
		return result.toString();
	}

} //CIM_OSVersionCheckImpl

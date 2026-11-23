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

import org.dmtf.cim.CIM_ComputerSystemPackage;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Computer System Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ComputerSystemPackageImpl#getPlatformGUID <em>Platform GUID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ComputerSystemPackageImpl extends CIM_SystemPackagingImpl implements CIM_ComputerSystemPackage {
	/**
	 * The default value of the '{@link #getPlatformGUID() <em>Platform GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatformGUID() <em>Platform GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformGUID()
	 * @generated
	 * @ordered
	 */
	protected String platformGUID = PLATFORM_GUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ComputerSystemPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ComputerSystemPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlatformGUID() {
		return platformGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatformGUID(String newPlatformGUID) {
		String oldPlatformGUID = platformGUID;
		platformGUID = newPlatformGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_COMPUTER_SYSTEM_PACKAGE__PLATFORM_GUID, oldPlatformGUID, platformGUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_COMPUTER_SYSTEM_PACKAGE__PLATFORM_GUID:
				return getPlatformGUID();
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
			case CimPackage.CIM_COMPUTER_SYSTEM_PACKAGE__PLATFORM_GUID:
				setPlatformGUID((String)newValue);
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
			case CimPackage.CIM_COMPUTER_SYSTEM_PACKAGE__PLATFORM_GUID:
				setPlatformGUID(PLATFORM_GUID_EDEFAULT);
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
			case CimPackage.CIM_COMPUTER_SYSTEM_PACKAGE__PLATFORM_GUID:
				return PLATFORM_GUID_EDEFAULT == null ? platformGUID != null : !PLATFORM_GUID_EDEFAULT.equals(platformGUID);
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
		result.append(" (PlatformGUID: ");
		result.append(platformGUID);
		result.append(')');
		return result.toString();
	}

} //CIM_ComputerSystemPackageImpl

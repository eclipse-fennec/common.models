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

import org.dmtf.cim.CIM_NetworkingIDAuthentication;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Networking ID Authentication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_NetworkingIDAuthenticationImpl#getNetworkingIdentityClassName <em>Networking Identity Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_NetworkingIDAuthenticationImpl extends CIM_AuthenticationConditionImpl implements CIM_NetworkingIDAuthentication {
	/**
	 * The default value of the '{@link #getNetworkingIdentityClassName() <em>Networking Identity Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkingIdentityClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORKING_IDENTITY_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkingIdentityClassName() <em>Networking Identity Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkingIdentityClassName()
	 * @generated
	 * @ordered
	 */
	protected String networkingIdentityClassName = NETWORKING_IDENTITY_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_NetworkingIDAuthenticationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_NetworkingIDAuthentication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetworkingIdentityClassName() {
		return networkingIdentityClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkingIdentityClassName(String newNetworkingIdentityClassName) {
		String oldNetworkingIdentityClassName = networkingIdentityClassName;
		networkingIdentityClassName = newNetworkingIdentityClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_NETWORKING_ID_AUTHENTICATION__NETWORKING_IDENTITY_CLASS_NAME, oldNetworkingIdentityClassName, networkingIdentityClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_NETWORKING_ID_AUTHENTICATION__NETWORKING_IDENTITY_CLASS_NAME:
				return getNetworkingIdentityClassName();
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
			case CimPackage.CIM_NETWORKING_ID_AUTHENTICATION__NETWORKING_IDENTITY_CLASS_NAME:
				setNetworkingIdentityClassName((String)newValue);
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
			case CimPackage.CIM_NETWORKING_ID_AUTHENTICATION__NETWORKING_IDENTITY_CLASS_NAME:
				setNetworkingIdentityClassName(NETWORKING_IDENTITY_CLASS_NAME_EDEFAULT);
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
			case CimPackage.CIM_NETWORKING_ID_AUTHENTICATION__NETWORKING_IDENTITY_CLASS_NAME:
				return NETWORKING_IDENTITY_CLASS_NAME_EDEFAULT == null ? networkingIdentityClassName != null : !NETWORKING_IDENTITY_CLASS_NAME_EDEFAULT.equals(networkingIdentityClassName);
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
		result.append(" (NetworkingIdentityClassName: ");
		result.append(networkingIdentityClassName);
		result.append(')');
		return result.toString();
	}

} //CIM_NetworkingIDAuthenticationImpl

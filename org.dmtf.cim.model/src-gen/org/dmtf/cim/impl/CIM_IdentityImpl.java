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

import org.dmtf.cim.CIM_Identity;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Identity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_IdentityImpl#getCurrentlyAuthenticated <em>Currently Authenticated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_IdentityImpl extends CIM_ManagedElementImpl implements CIM_Identity {
	/**
	 * The default value of the '{@link #getCurrentlyAuthenticated() <em>Currently Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlyAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CURRENTLY_AUTHENTICATED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getCurrentlyAuthenticated() <em>Currently Authenticated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentlyAuthenticated()
	 * @generated
	 * @ordered
	 */
	protected Boolean currentlyAuthenticated = CURRENTLY_AUTHENTICATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_IdentityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Identity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCurrentlyAuthenticated() {
		return currentlyAuthenticated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentlyAuthenticated(Boolean newCurrentlyAuthenticated) {
		Boolean oldCurrentlyAuthenticated = currentlyAuthenticated;
		currentlyAuthenticated = newCurrentlyAuthenticated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_IDENTITY__CURRENTLY_AUTHENTICATED, oldCurrentlyAuthenticated, currentlyAuthenticated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_IDENTITY__CURRENTLY_AUTHENTICATED:
				return getCurrentlyAuthenticated();
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
			case CimPackage.CIM_IDENTITY__CURRENTLY_AUTHENTICATED:
				setCurrentlyAuthenticated((Boolean)newValue);
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
			case CimPackage.CIM_IDENTITY__CURRENTLY_AUTHENTICATED:
				setCurrentlyAuthenticated(CURRENTLY_AUTHENTICATED_EDEFAULT);
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
			case CimPackage.CIM_IDENTITY__CURRENTLY_AUTHENTICATED:
				return CURRENTLY_AUTHENTICATED_EDEFAULT == null ? currentlyAuthenticated != null : !CURRENTLY_AUTHENTICATED_EDEFAULT.equals(currentlyAuthenticated);
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
		result.append(" (CurrentlyAuthenticated: ");
		result.append(currentlyAuthenticated);
		result.append(')');
		return result.toString();
	}

} //CIM_IdentityImpl

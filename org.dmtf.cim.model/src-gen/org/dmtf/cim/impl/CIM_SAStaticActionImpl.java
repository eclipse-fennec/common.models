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

import org.dmtf.cim.CIM_SAStaticAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SA Static Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SAStaticActionImpl#getLifetimeSeconds <em>Lifetime Seconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SAStaticActionImpl extends CIM_SAActionImpl implements CIM_SAStaticAction {
	/**
	 * The default value of the '{@link #getLifetimeSeconds() <em>Lifetime Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifetimeSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final Long LIFETIME_SECONDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLifetimeSeconds() <em>Lifetime Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifetimeSeconds()
	 * @generated
	 * @ordered
	 */
	protected Long lifetimeSeconds = LIFETIME_SECONDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SAStaticActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SAStaticAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLifetimeSeconds() {
		return lifetimeSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifetimeSeconds(Long newLifetimeSeconds) {
		Long oldLifetimeSeconds = lifetimeSeconds;
		lifetimeSeconds = newLifetimeSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SA_STATIC_ACTION__LIFETIME_SECONDS, oldLifetimeSeconds, lifetimeSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SA_STATIC_ACTION__LIFETIME_SECONDS:
				return getLifetimeSeconds();
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
			case CimPackage.CIM_SA_STATIC_ACTION__LIFETIME_SECONDS:
				setLifetimeSeconds((Long)newValue);
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
			case CimPackage.CIM_SA_STATIC_ACTION__LIFETIME_SECONDS:
				setLifetimeSeconds(LIFETIME_SECONDS_EDEFAULT);
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
			case CimPackage.CIM_SA_STATIC_ACTION__LIFETIME_SECONDS:
				return LIFETIME_SECONDS_EDEFAULT == null ? lifetimeSeconds != null : !LIFETIME_SECONDS_EDEFAULT.equals(lifetimeSeconds);
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
		result.append(" (LifetimeSeconds: ");
		result.append(lifetimeSeconds);
		result.append(')');
		return result.toString();
	}

} //CIM_SAStaticActionImpl

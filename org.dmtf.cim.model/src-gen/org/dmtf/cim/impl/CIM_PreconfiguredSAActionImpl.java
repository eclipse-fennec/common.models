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

import org.dmtf.cim.CIM_PreconfiguredSAAction;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Preconfigured SA Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PreconfiguredSAActionImpl#getLifetimeKilobytes <em>Lifetime Kilobytes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PreconfiguredSAActionImpl extends CIM_SAStaticActionImpl implements CIM_PreconfiguredSAAction {
	/**
	 * The default value of the '{@link #getLifetimeKilobytes() <em>Lifetime Kilobytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifetimeKilobytes()
	 * @generated
	 * @ordered
	 */
	protected static final Long LIFETIME_KILOBYTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLifetimeKilobytes() <em>Lifetime Kilobytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifetimeKilobytes()
	 * @generated
	 * @ordered
	 */
	protected Long lifetimeKilobytes = LIFETIME_KILOBYTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PreconfiguredSAActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PreconfiguredSAAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLifetimeKilobytes() {
		return lifetimeKilobytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLifetimeKilobytes(Long newLifetimeKilobytes) {
		Long oldLifetimeKilobytes = lifetimeKilobytes;
		lifetimeKilobytes = newLifetimeKilobytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PRECONFIGURED_SA_ACTION__LIFETIME_KILOBYTES, oldLifetimeKilobytes, lifetimeKilobytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PRECONFIGURED_SA_ACTION__LIFETIME_KILOBYTES:
				return getLifetimeKilobytes();
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
			case CimPackage.CIM_PRECONFIGURED_SA_ACTION__LIFETIME_KILOBYTES:
				setLifetimeKilobytes((Long)newValue);
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
			case CimPackage.CIM_PRECONFIGURED_SA_ACTION__LIFETIME_KILOBYTES:
				setLifetimeKilobytes(LIFETIME_KILOBYTES_EDEFAULT);
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
			case CimPackage.CIM_PRECONFIGURED_SA_ACTION__LIFETIME_KILOBYTES:
				return LIFETIME_KILOBYTES_EDEFAULT == null ? lifetimeKilobytes != null : !LIFETIME_KILOBYTES_EDEFAULT.equals(lifetimeKilobytes);
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
		result.append(" (LifetimeKilobytes: ");
		result.append(lifetimeKilobytes);
		result.append(')');
		return result.toString();
	}

} //CIM_PreconfiguredSAActionImpl

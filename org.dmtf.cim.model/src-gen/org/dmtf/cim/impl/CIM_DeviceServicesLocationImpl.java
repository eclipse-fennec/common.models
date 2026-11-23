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

import org.dmtf.cim.CIM_DeviceServicesLocation;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Device Services Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_DeviceServicesLocationImpl#getInaccessible <em>Inaccessible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_DeviceServicesLocationImpl extends CIM_DependencyImpl implements CIM_DeviceServicesLocation {
	/**
	 * The default value of the '{@link #getInaccessible() <em>Inaccessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInaccessible()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INACCESSIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInaccessible() <em>Inaccessible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInaccessible()
	 * @generated
	 * @ordered
	 */
	protected Boolean inaccessible = INACCESSIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_DeviceServicesLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_DeviceServicesLocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getInaccessible() {
		return inaccessible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInaccessible(Boolean newInaccessible) {
		Boolean oldInaccessible = inaccessible;
		inaccessible = newInaccessible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_DEVICE_SERVICES_LOCATION__INACCESSIBLE, oldInaccessible, inaccessible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_DEVICE_SERVICES_LOCATION__INACCESSIBLE:
				return getInaccessible();
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
			case CimPackage.CIM_DEVICE_SERVICES_LOCATION__INACCESSIBLE:
				setInaccessible((Boolean)newValue);
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
			case CimPackage.CIM_DEVICE_SERVICES_LOCATION__INACCESSIBLE:
				setInaccessible(INACCESSIBLE_EDEFAULT);
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
			case CimPackage.CIM_DEVICE_SERVICES_LOCATION__INACCESSIBLE:
				return INACCESSIBLE_EDEFAULT == null ? inaccessible != null : !INACCESSIBLE_EDEFAULT.equals(inaccessible);
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
		result.append(" (Inaccessible: ");
		result.append(inaccessible);
		result.append(')');
		return result.toString();
	}

} //CIM_DeviceServicesLocationImpl

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

import org.dmtf.cim.CIM_PackageLocation;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Package Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PackageLocationImpl#getLocationCoordinates <em>Location Coordinates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PackageLocationImpl extends CIM_PhysicalPackageImpl implements CIM_PackageLocation {
	/**
	 * The default value of the '{@link #getLocationCoordinates() <em>Location Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCoordinates()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_COORDINATES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationCoordinates() <em>Location Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationCoordinates()
	 * @generated
	 * @ordered
	 */
	protected String locationCoordinates = LOCATION_COORDINATES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PackageLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PackageLocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationCoordinates() {
		return locationCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationCoordinates(String newLocationCoordinates) {
		String oldLocationCoordinates = locationCoordinates;
		locationCoordinates = newLocationCoordinates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PACKAGE_LOCATION__LOCATION_COORDINATES, oldLocationCoordinates, locationCoordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PACKAGE_LOCATION__LOCATION_COORDINATES:
				return getLocationCoordinates();
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
			case CimPackage.CIM_PACKAGE_LOCATION__LOCATION_COORDINATES:
				setLocationCoordinates((String)newValue);
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
			case CimPackage.CIM_PACKAGE_LOCATION__LOCATION_COORDINATES:
				setLocationCoordinates(LOCATION_COORDINATES_EDEFAULT);
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
			case CimPackage.CIM_PACKAGE_LOCATION__LOCATION_COORDINATES:
				return LOCATION_COORDINATES_EDEFAULT == null ? locationCoordinates != null : !LOCATION_COORDINATES_EDEFAULT.equals(locationCoordinates);
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
		result.append(" (LocationCoordinates: ");
		result.append(locationCoordinates);
		result.append(')');
		return result.toString();
	}

} //CIM_PackageLocationImpl

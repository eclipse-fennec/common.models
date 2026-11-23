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

import org.dmtf.cim.CIM_Container;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ContainerImpl#getLocationWithinContainer <em>Location Within Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ContainerImpl extends CIM_ComponentImpl implements CIM_Container {
	/**
	 * The default value of the '{@link #getLocationWithinContainer() <em>Location Within Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationWithinContainer()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_WITHIN_CONTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationWithinContainer() <em>Location Within Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationWithinContainer()
	 * @generated
	 * @ordered
	 */
	protected String locationWithinContainer = LOCATION_WITHIN_CONTAINER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Container();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationWithinContainer() {
		return locationWithinContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationWithinContainer(String newLocationWithinContainer) {
		String oldLocationWithinContainer = locationWithinContainer;
		locationWithinContainer = newLocationWithinContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_CONTAINER__LOCATION_WITHIN_CONTAINER, oldLocationWithinContainer, locationWithinContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_CONTAINER__LOCATION_WITHIN_CONTAINER:
				return getLocationWithinContainer();
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
			case CimPackage.CIM_CONTAINER__LOCATION_WITHIN_CONTAINER:
				setLocationWithinContainer((String)newValue);
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
			case CimPackage.CIM_CONTAINER__LOCATION_WITHIN_CONTAINER:
				setLocationWithinContainer(LOCATION_WITHIN_CONTAINER_EDEFAULT);
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
			case CimPackage.CIM_CONTAINER__LOCATION_WITHIN_CONTAINER:
				return LOCATION_WITHIN_CONTAINER_EDEFAULT == null ? locationWithinContainer != null : !LOCATION_WITHIN_CONTAINER_EDEFAULT.equals(locationWithinContainer);
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
		result.append(" (LocationWithinContainer: ");
		result.append(locationWithinContainer);
		result.append(')');
		return result.toString();
	}

} //CIM_ContainerImpl

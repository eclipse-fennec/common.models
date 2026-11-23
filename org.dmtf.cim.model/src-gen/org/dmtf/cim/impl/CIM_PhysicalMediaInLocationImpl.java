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

import org.dmtf.cim.CIM_PhysicalMediaInLocation;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Physical Media In Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaInLocationImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PhysicalMediaInLocationImpl#getTimeOfLastPlacement <em>Time Of Last Placement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PhysicalMediaInLocationImpl extends CIM_DependencyImpl implements CIM_PhysicalMediaInLocation {
	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ORIENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected Integer orientation = ORIENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOfLastPlacement() <em>Time Of Last Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastPlacement()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_OF_LAST_PLACEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOfLastPlacement() <em>Time Of Last Placement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastPlacement()
	 * @generated
	 * @ordered
	 */
	protected String timeOfLastPlacement = TIME_OF_LAST_PLACEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PhysicalMediaInLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PhysicalMediaInLocation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrientation(Integer newOrientation) {
		Integer oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEDIA_IN_LOCATION__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeOfLastPlacement() {
		return timeOfLastPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOfLastPlacement(String newTimeOfLastPlacement) {
		String oldTimeOfLastPlacement = timeOfLastPlacement;
		timeOfLastPlacement = newTimeOfLastPlacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PHYSICAL_MEDIA_IN_LOCATION__TIME_OF_LAST_PLACEMENT, oldTimeOfLastPlacement, timeOfLastPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PHYSICAL_MEDIA_IN_LOCATION__ORIENTATION:
				return getOrientation();
			case CimPackage.CIM_PHYSICAL_MEDIA_IN_LOCATION__TIME_OF_LAST_PLACEMENT:
				return getTimeOfLastPlacement();
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
			case CimPackage.CIM_PHYSICAL_MEDIA_IN_LOCATION__ORIENTATION:
				setOrientation((Integer)newValue);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA_IN_LOCATION__TIME_OF_LAST_PLACEMENT:
				setTimeOfLastPlacement((String)newValue);
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
			case CimPackage.CIM_PHYSICAL_MEDIA_IN_LOCATION__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case CimPackage.CIM_PHYSICAL_MEDIA_IN_LOCATION__TIME_OF_LAST_PLACEMENT:
				setTimeOfLastPlacement(TIME_OF_LAST_PLACEMENT_EDEFAULT);
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
			case CimPackage.CIM_PHYSICAL_MEDIA_IN_LOCATION__ORIENTATION:
				return ORIENTATION_EDEFAULT == null ? orientation != null : !ORIENTATION_EDEFAULT.equals(orientation);
			case CimPackage.CIM_PHYSICAL_MEDIA_IN_LOCATION__TIME_OF_LAST_PLACEMENT:
				return TIME_OF_LAST_PLACEMENT_EDEFAULT == null ? timeOfLastPlacement != null : !TIME_OF_LAST_PLACEMENT_EDEFAULT.equals(timeOfLastPlacement);
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
		result.append(" (Orientation: ");
		result.append(orientation);
		result.append(", TimeOfLastPlacement: ");
		result.append(timeOfLastPlacement);
		result.append(')');
		return result.toString();
	}

} //CIM_PhysicalMediaInLocationImpl

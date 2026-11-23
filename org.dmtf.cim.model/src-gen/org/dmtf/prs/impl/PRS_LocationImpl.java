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
package org.dmtf.prs.impl;

import org.dmtf.prs.PRS_Location;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_LocationImpl#getLocationType <em>Location Type</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_LocationImpl#getLocationID <em>Location ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRS_LocationImpl extends PRS_ExchangeElementImpl implements PRS_Location {
	/**
	 * The default value of the '{@link #getLocationType() <em>Location Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOCATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationType() <em>Location Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationType()
	 * @generated
	 * @ordered
	 */
	protected Integer locationType = LOCATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocationID() <em>Location ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationID()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationID() <em>Location ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationID()
	 * @generated
	 * @ordered
	 */
	protected String locationID = LOCATION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLocationType() {
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationType(Integer newLocationType) {
		Integer oldLocationType = locationType;
		locationType = newLocationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_LOCATION__LOCATION_TYPE, oldLocationType, locationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocationID() {
		return locationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocationID(String newLocationID) {
		String oldLocationID = locationID;
		locationID = newLocationID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_LOCATION__LOCATION_ID, oldLocationID, locationID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_LOCATION__LOCATION_TYPE:
				return getLocationType();
			case PrsPackage.PRS_LOCATION__LOCATION_ID:
				return getLocationID();
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
			case PrsPackage.PRS_LOCATION__LOCATION_TYPE:
				setLocationType((Integer)newValue);
				return;
			case PrsPackage.PRS_LOCATION__LOCATION_ID:
				setLocationID((String)newValue);
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
			case PrsPackage.PRS_LOCATION__LOCATION_TYPE:
				setLocationType(LOCATION_TYPE_EDEFAULT);
				return;
			case PrsPackage.PRS_LOCATION__LOCATION_ID:
				setLocationID(LOCATION_ID_EDEFAULT);
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
			case PrsPackage.PRS_LOCATION__LOCATION_TYPE:
				return LOCATION_TYPE_EDEFAULT == null ? locationType != null : !LOCATION_TYPE_EDEFAULT.equals(locationType);
			case PrsPackage.PRS_LOCATION__LOCATION_ID:
				return LOCATION_ID_EDEFAULT == null ? locationID != null : !LOCATION_ID_EDEFAULT.equals(locationID);
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
		result.append(" (LocationType: ");
		result.append(locationType);
		result.append(", LocationID: ");
		result.append(locationID);
		result.append(')');
		return result.toString();
	}

} //PRS_LocationImpl

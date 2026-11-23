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

import org.dmtf.cim.CIM_ServiceAvailableToDatabase;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Service Available To Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceAvailableToDatabaseImpl#getAvailableState <em>Available State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceAvailableToDatabaseImpl#getOtherAvailableState <em>Other Available State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ServiceAvailableToDatabaseImpl#getActiveTime <em>Active Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ServiceAvailableToDatabaseImpl extends CIM_ServiceAvailableToElementImpl implements CIM_ServiceAvailableToDatabase {
	/**
	 * The default value of the '{@link #getAvailableState() <em>Available State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AVAILABLE_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableState() <em>Available State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableState()
	 * @generated
	 * @ordered
	 */
	protected Integer availableState = AVAILABLE_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherAvailableState() <em>Other Available State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAvailableState()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_AVAILABLE_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherAvailableState() <em>Other Available State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAvailableState()
	 * @generated
	 * @ordered
	 */
	protected String otherAvailableState = OTHER_AVAILABLE_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActiveTime() <em>Active Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveTime()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiveTime() <em>Active Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveTime()
	 * @generated
	 * @ordered
	 */
	protected String activeTime = ACTIVE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ServiceAvailableToDatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ServiceAvailableToDatabase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAvailableState() {
		return availableState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableState(Integer newAvailableState) {
		Integer oldAvailableState = availableState;
		availableState = newAvailableState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE__AVAILABLE_STATE, oldAvailableState, availableState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherAvailableState() {
		return otherAvailableState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherAvailableState(String newOtherAvailableState) {
		String oldOtherAvailableState = otherAvailableState;
		otherAvailableState = newOtherAvailableState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE__OTHER_AVAILABLE_STATE, oldOtherAvailableState, otherAvailableState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActiveTime() {
		return activeTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveTime(String newActiveTime) {
		String oldActiveTime = activeTime;
		activeTime = newActiveTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE__ACTIVE_TIME, oldActiveTime, activeTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE__AVAILABLE_STATE:
				return getAvailableState();
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE__OTHER_AVAILABLE_STATE:
				return getOtherAvailableState();
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE__ACTIVE_TIME:
				return getActiveTime();
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
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE__AVAILABLE_STATE:
				setAvailableState((Integer)newValue);
				return;
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE__OTHER_AVAILABLE_STATE:
				setOtherAvailableState((String)newValue);
				return;
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE__ACTIVE_TIME:
				setActiveTime((String)newValue);
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
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE__AVAILABLE_STATE:
				setAvailableState(AVAILABLE_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE__OTHER_AVAILABLE_STATE:
				setOtherAvailableState(OTHER_AVAILABLE_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE__ACTIVE_TIME:
				setActiveTime(ACTIVE_TIME_EDEFAULT);
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
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE__AVAILABLE_STATE:
				return AVAILABLE_STATE_EDEFAULT == null ? availableState != null : !AVAILABLE_STATE_EDEFAULT.equals(availableState);
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE__OTHER_AVAILABLE_STATE:
				return OTHER_AVAILABLE_STATE_EDEFAULT == null ? otherAvailableState != null : !OTHER_AVAILABLE_STATE_EDEFAULT.equals(otherAvailableState);
			case CimPackage.CIM_SERVICE_AVAILABLE_TO_DATABASE__ACTIVE_TIME:
				return ACTIVE_TIME_EDEFAULT == null ? activeTime != null : !ACTIVE_TIME_EDEFAULT.equals(activeTime);
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
		result.append(" (AvailableState: ");
		result.append(availableState);
		result.append(", OtherAvailableState: ");
		result.append(otherAvailableState);
		result.append(", ActiveTime: ");
		result.append(activeTime);
		result.append(')');
		return result.toString();
	}

} //CIM_ServiceAvailableToDatabaseImpl

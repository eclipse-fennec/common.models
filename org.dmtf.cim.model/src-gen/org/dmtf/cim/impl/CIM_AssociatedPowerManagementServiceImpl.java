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

import java.util.Collection;

import org.dmtf.cim.CIM_AssociatedPowerManagementService;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Associated Power Management Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedPowerManagementServiceImpl#getPowerState <em>Power State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedPowerManagementServiceImpl#getOtherPowerState <em>Other Power State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedPowerManagementServiceImpl#getRequestedPowerState <em>Requested Power State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedPowerManagementServiceImpl#getOtherRequestedPowerState <em>Other Requested Power State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedPowerManagementServiceImpl#getPowerOnTime <em>Power On Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedPowerManagementServiceImpl#getAvailableRequestedPowerStates <em>Available Requested Power States</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AssociatedPowerManagementServiceImpl#getTransitioningToPowerState <em>Transitioning To Power State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AssociatedPowerManagementServiceImpl extends CIM_ServiceAvailableToElementImpl implements CIM_AssociatedPowerManagementService {
	/**
	 * The default value of the '{@link #getPowerState() <em>Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POWER_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerState() <em>Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerState()
	 * @generated
	 * @ordered
	 */
	protected Integer powerState = POWER_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherPowerState() <em>Other Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPowerState()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_POWER_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherPowerState() <em>Other Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPowerState()
	 * @generated
	 * @ordered
	 */
	protected String otherPowerState = OTHER_POWER_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestedPowerState() <em>Requested Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedPowerState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REQUESTED_POWER_STATE_EDEFAULT = Integer.valueOf(12);

	/**
	 * The cached value of the '{@link #getRequestedPowerState() <em>Requested Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedPowerState()
	 * @generated
	 * @ordered
	 */
	protected Integer requestedPowerState = REQUESTED_POWER_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherRequestedPowerState() <em>Other Requested Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRequestedPowerState()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_REQUESTED_POWER_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherRequestedPowerState() <em>Other Requested Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherRequestedPowerState()
	 * @generated
	 * @ordered
	 */
	protected String otherRequestedPowerState = OTHER_REQUESTED_POWER_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerOnTime() <em>Power On Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerOnTime()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_ON_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerOnTime() <em>Power On Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerOnTime()
	 * @generated
	 * @ordered
	 */
	protected String powerOnTime = POWER_ON_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAvailableRequestedPowerStates() <em>Available Requested Power States</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableRequestedPowerStates()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> availableRequestedPowerStates;

	/**
	 * The default value of the '{@link #getTransitioningToPowerState() <em>Transitioning To Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitioningToPowerState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TRANSITIONING_TO_POWER_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitioningToPowerState() <em>Transitioning To Power State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitioningToPowerState()
	 * @generated
	 * @ordered
	 */
	protected Integer transitioningToPowerState = TRANSITIONING_TO_POWER_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AssociatedPowerManagementServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AssociatedPowerManagementService();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPowerState() {
		return powerState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerState(Integer newPowerState) {
		Integer oldPowerState = powerState;
		powerState = newPowerState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__POWER_STATE, oldPowerState, powerState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherPowerState() {
		return otherPowerState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherPowerState(String newOtherPowerState) {
		String oldOtherPowerState = otherPowerState;
		otherPowerState = newOtherPowerState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__OTHER_POWER_STATE, oldOtherPowerState, otherPowerState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRequestedPowerState() {
		return requestedPowerState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestedPowerState(Integer newRequestedPowerState) {
		Integer oldRequestedPowerState = requestedPowerState;
		requestedPowerState = newRequestedPowerState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__REQUESTED_POWER_STATE, oldRequestedPowerState, requestedPowerState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherRequestedPowerState() {
		return otherRequestedPowerState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherRequestedPowerState(String newOtherRequestedPowerState) {
		String oldOtherRequestedPowerState = otherRequestedPowerState;
		otherRequestedPowerState = newOtherRequestedPowerState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__OTHER_REQUESTED_POWER_STATE, oldOtherRequestedPowerState, otherRequestedPowerState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPowerOnTime() {
		return powerOnTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPowerOnTime(String newPowerOnTime) {
		String oldPowerOnTime = powerOnTime;
		powerOnTime = newPowerOnTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__POWER_ON_TIME, oldPowerOnTime, powerOnTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAvailableRequestedPowerStates() {
		if (availableRequestedPowerStates == null) {
			availableRequestedPowerStates = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__AVAILABLE_REQUESTED_POWER_STATES);
		}
		return availableRequestedPowerStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTransitioningToPowerState() {
		return transitioningToPowerState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitioningToPowerState(Integer newTransitioningToPowerState) {
		Integer oldTransitioningToPowerState = transitioningToPowerState;
		transitioningToPowerState = newTransitioningToPowerState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__TRANSITIONING_TO_POWER_STATE, oldTransitioningToPowerState, transitioningToPowerState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__POWER_STATE:
				return getPowerState();
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__OTHER_POWER_STATE:
				return getOtherPowerState();
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__REQUESTED_POWER_STATE:
				return getRequestedPowerState();
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__OTHER_REQUESTED_POWER_STATE:
				return getOtherRequestedPowerState();
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__POWER_ON_TIME:
				return getPowerOnTime();
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__AVAILABLE_REQUESTED_POWER_STATES:
				return getAvailableRequestedPowerStates();
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__TRANSITIONING_TO_POWER_STATE:
				return getTransitioningToPowerState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__POWER_STATE:
				setPowerState((Integer)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__OTHER_POWER_STATE:
				setOtherPowerState((String)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__REQUESTED_POWER_STATE:
				setRequestedPowerState((Integer)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__OTHER_REQUESTED_POWER_STATE:
				setOtherRequestedPowerState((String)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__POWER_ON_TIME:
				setPowerOnTime((String)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__AVAILABLE_REQUESTED_POWER_STATES:
				getAvailableRequestedPowerStates().clear();
				getAvailableRequestedPowerStates().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__TRANSITIONING_TO_POWER_STATE:
				setTransitioningToPowerState((Integer)newValue);
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
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__POWER_STATE:
				setPowerState(POWER_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__OTHER_POWER_STATE:
				setOtherPowerState(OTHER_POWER_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__REQUESTED_POWER_STATE:
				setRequestedPowerState(REQUESTED_POWER_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__OTHER_REQUESTED_POWER_STATE:
				setOtherRequestedPowerState(OTHER_REQUESTED_POWER_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__POWER_ON_TIME:
				setPowerOnTime(POWER_ON_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__AVAILABLE_REQUESTED_POWER_STATES:
				getAvailableRequestedPowerStates().clear();
				return;
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__TRANSITIONING_TO_POWER_STATE:
				setTransitioningToPowerState(TRANSITIONING_TO_POWER_STATE_EDEFAULT);
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
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__POWER_STATE:
				return POWER_STATE_EDEFAULT == null ? powerState != null : !POWER_STATE_EDEFAULT.equals(powerState);
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__OTHER_POWER_STATE:
				return OTHER_POWER_STATE_EDEFAULT == null ? otherPowerState != null : !OTHER_POWER_STATE_EDEFAULT.equals(otherPowerState);
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__REQUESTED_POWER_STATE:
				return REQUESTED_POWER_STATE_EDEFAULT == null ? requestedPowerState != null : !REQUESTED_POWER_STATE_EDEFAULT.equals(requestedPowerState);
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__OTHER_REQUESTED_POWER_STATE:
				return OTHER_REQUESTED_POWER_STATE_EDEFAULT == null ? otherRequestedPowerState != null : !OTHER_REQUESTED_POWER_STATE_EDEFAULT.equals(otherRequestedPowerState);
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__POWER_ON_TIME:
				return POWER_ON_TIME_EDEFAULT == null ? powerOnTime != null : !POWER_ON_TIME_EDEFAULT.equals(powerOnTime);
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__AVAILABLE_REQUESTED_POWER_STATES:
				return availableRequestedPowerStates != null && !availableRequestedPowerStates.isEmpty();
			case CimPackage.CIM_ASSOCIATED_POWER_MANAGEMENT_SERVICE__TRANSITIONING_TO_POWER_STATE:
				return TRANSITIONING_TO_POWER_STATE_EDEFAULT == null ? transitioningToPowerState != null : !TRANSITIONING_TO_POWER_STATE_EDEFAULT.equals(transitioningToPowerState);
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
		result.append(" (PowerState: ");
		result.append(powerState);
		result.append(", OtherPowerState: ");
		result.append(otherPowerState);
		result.append(", RequestedPowerState: ");
		result.append(requestedPowerState);
		result.append(", OtherRequestedPowerState: ");
		result.append(otherRequestedPowerState);
		result.append(", PowerOnTime: ");
		result.append(powerOnTime);
		result.append(", AvailableRequestedPowerStates: ");
		result.append(availableRequestedPowerStates);
		result.append(", TransitioningToPowerState: ");
		result.append(transitioningToPowerState);
		result.append(')');
		return result.toString();
	}

} //CIM_AssociatedPowerManagementServiceImpl

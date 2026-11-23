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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.dmtf.cim.CIM_ConcreteJob;
import org.dmtf.cim.CIM_EnabledLogicalElement;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Enabled Logical Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_EnabledLogicalElementImpl#getEnabledState <em>Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EnabledLogicalElementImpl#getOtherEnabledState <em>Other Enabled State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EnabledLogicalElementImpl#getRequestedState <em>Requested State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EnabledLogicalElementImpl#getEnabledDefault <em>Enabled Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EnabledLogicalElementImpl#getTimeOfLastStateChange <em>Time Of Last State Change</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EnabledLogicalElementImpl#getAvailableRequestedStates <em>Available Requested States</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_EnabledLogicalElementImpl#getTransitioningToState <em>Transitioning To State</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_EnabledLogicalElementImpl extends CIM_LogicalElementImpl implements CIM_EnabledLogicalElement {
	/**
	 * The default value of the '{@link #getEnabledState() <em>Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENABLED_STATE_EDEFAULT = Integer.valueOf(5);

	/**
	 * The cached value of the '{@link #getEnabledState() <em>Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledState()
	 * @generated
	 * @ordered
	 */
	protected Integer enabledState = ENABLED_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherEnabledState() <em>Other Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledState()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_ENABLED_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherEnabledState() <em>Other Enabled State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherEnabledState()
	 * @generated
	 * @ordered
	 */
	protected String otherEnabledState = OTHER_ENABLED_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestedState() <em>Requested State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REQUESTED_STATE_EDEFAULT = Integer.valueOf(12);

	/**
	 * The cached value of the '{@link #getRequestedState() <em>Requested State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedState()
	 * @generated
	 * @ordered
	 */
	protected Integer requestedState = REQUESTED_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabledDefault() <em>Enabled Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENABLED_DEFAULT_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getEnabledDefault() <em>Enabled Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabledDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer enabledDefault = ENABLED_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeOfLastStateChange() <em>Time Of Last State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastStateChange()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_OF_LAST_STATE_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeOfLastStateChange() <em>Time Of Last State Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeOfLastStateChange()
	 * @generated
	 * @ordered
	 */
	protected String timeOfLastStateChange = TIME_OF_LAST_STATE_CHANGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAvailableRequestedStates() <em>Available Requested States</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableRequestedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> availableRequestedStates;

	/**
	 * The default value of the '{@link #getTransitioningToState() <em>Transitioning To State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitioningToState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TRANSITIONING_TO_STATE_EDEFAULT = Integer.valueOf(12);

	/**
	 * The cached value of the '{@link #getTransitioningToState() <em>Transitioning To State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitioningToState()
	 * @generated
	 * @ordered
	 */
	protected Integer transitioningToState = TRANSITIONING_TO_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_EnabledLogicalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_EnabledLogicalElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEnabledState() {
		return enabledState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabledState(Integer newEnabledState) {
		Integer oldEnabledState = enabledState;
		enabledState = newEnabledState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__ENABLED_STATE, oldEnabledState, enabledState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherEnabledState() {
		return otherEnabledState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherEnabledState(String newOtherEnabledState) {
		String oldOtherEnabledState = otherEnabledState;
		otherEnabledState = newOtherEnabledState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__OTHER_ENABLED_STATE, oldOtherEnabledState, otherEnabledState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRequestedState() {
		return requestedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestedState(Integer newRequestedState) {
		Integer oldRequestedState = requestedState;
		requestedState = newRequestedState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__REQUESTED_STATE, oldRequestedState, requestedState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEnabledDefault() {
		return enabledDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabledDefault(Integer newEnabledDefault) {
		Integer oldEnabledDefault = enabledDefault;
		enabledDefault = newEnabledDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__ENABLED_DEFAULT, oldEnabledDefault, enabledDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeOfLastStateChange() {
		return timeOfLastStateChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeOfLastStateChange(String newTimeOfLastStateChange) {
		String oldTimeOfLastStateChange = timeOfLastStateChange;
		timeOfLastStateChange = newTimeOfLastStateChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__TIME_OF_LAST_STATE_CHANGE, oldTimeOfLastStateChange, timeOfLastStateChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAvailableRequestedStates() {
		if (availableRequestedStates == null) {
			availableRequestedStates = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__AVAILABLE_REQUESTED_STATES);
		}
		return availableRequestedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTransitioningToState() {
		return transitioningToState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitioningToState(Integer newTransitioningToState) {
		Integer oldTransitioningToState = transitioningToState;
		transitioningToState = newTransitioningToState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__TRANSITIONING_TO_STATE, oldTransitioningToState, transitioningToState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long RequestStateChange(Integer RequestedState, CIM_ConcreteJob Job, String TimeoutPeriod) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__ENABLED_STATE:
				return getEnabledState();
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__OTHER_ENABLED_STATE:
				return getOtherEnabledState();
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__REQUESTED_STATE:
				return getRequestedState();
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__ENABLED_DEFAULT:
				return getEnabledDefault();
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__TIME_OF_LAST_STATE_CHANGE:
				return getTimeOfLastStateChange();
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__AVAILABLE_REQUESTED_STATES:
				return getAvailableRequestedStates();
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__TRANSITIONING_TO_STATE:
				return getTransitioningToState();
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
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__ENABLED_STATE:
				setEnabledState((Integer)newValue);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__OTHER_ENABLED_STATE:
				setOtherEnabledState((String)newValue);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__REQUESTED_STATE:
				setRequestedState((Integer)newValue);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__ENABLED_DEFAULT:
				setEnabledDefault((Integer)newValue);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__TIME_OF_LAST_STATE_CHANGE:
				setTimeOfLastStateChange((String)newValue);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__AVAILABLE_REQUESTED_STATES:
				getAvailableRequestedStates().clear();
				getAvailableRequestedStates().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__TRANSITIONING_TO_STATE:
				setTransitioningToState((Integer)newValue);
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
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__ENABLED_STATE:
				setEnabledState(ENABLED_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__OTHER_ENABLED_STATE:
				setOtherEnabledState(OTHER_ENABLED_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__REQUESTED_STATE:
				setRequestedState(REQUESTED_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__ENABLED_DEFAULT:
				setEnabledDefault(ENABLED_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__TIME_OF_LAST_STATE_CHANGE:
				setTimeOfLastStateChange(TIME_OF_LAST_STATE_CHANGE_EDEFAULT);
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__AVAILABLE_REQUESTED_STATES:
				getAvailableRequestedStates().clear();
				return;
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__TRANSITIONING_TO_STATE:
				setTransitioningToState(TRANSITIONING_TO_STATE_EDEFAULT);
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
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__ENABLED_STATE:
				return ENABLED_STATE_EDEFAULT == null ? enabledState != null : !ENABLED_STATE_EDEFAULT.equals(enabledState);
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__OTHER_ENABLED_STATE:
				return OTHER_ENABLED_STATE_EDEFAULT == null ? otherEnabledState != null : !OTHER_ENABLED_STATE_EDEFAULT.equals(otherEnabledState);
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__REQUESTED_STATE:
				return REQUESTED_STATE_EDEFAULT == null ? requestedState != null : !REQUESTED_STATE_EDEFAULT.equals(requestedState);
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__ENABLED_DEFAULT:
				return ENABLED_DEFAULT_EDEFAULT == null ? enabledDefault != null : !ENABLED_DEFAULT_EDEFAULT.equals(enabledDefault);
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__TIME_OF_LAST_STATE_CHANGE:
				return TIME_OF_LAST_STATE_CHANGE_EDEFAULT == null ? timeOfLastStateChange != null : !TIME_OF_LAST_STATE_CHANGE_EDEFAULT.equals(timeOfLastStateChange);
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__AVAILABLE_REQUESTED_STATES:
				return availableRequestedStates != null && !availableRequestedStates.isEmpty();
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT__TRANSITIONING_TO_STATE:
				return TRANSITIONING_TO_STATE_EDEFAULT == null ? transitioningToState != null : !TRANSITIONING_TO_STATE_EDEFAULT.equals(transitioningToState);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_ENABLED_LOGICAL_ELEMENT___REQUEST_STATE_CHANGE__INTEGER_CIM_CONCRETEJOB_STRING:
				return RequestStateChange((Integer)arguments.get(0), (CIM_ConcreteJob)arguments.get(1), (String)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (EnabledState: ");
		result.append(enabledState);
		result.append(", OtherEnabledState: ");
		result.append(otherEnabledState);
		result.append(", RequestedState: ");
		result.append(requestedState);
		result.append(", EnabledDefault: ");
		result.append(enabledDefault);
		result.append(", TimeOfLastStateChange: ");
		result.append(timeOfLastStateChange);
		result.append(", AvailableRequestedStates: ");
		result.append(availableRequestedStates);
		result.append(", TransitioningToState: ");
		result.append(transitioningToState);
		result.append(')');
		return result.toString();
	}

} //CIM_EnabledLogicalElementImpl

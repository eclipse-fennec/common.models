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

import org.dmtf.cim.CIM_Sensor;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SensorImpl#getSensorType <em>Sensor Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SensorImpl#getOtherSensorTypeDescription <em>Other Sensor Type Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SensorImpl#getPossibleStates <em>Possible States</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SensorImpl#getCurrentState <em>Current State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SensorImpl#getPollingInterval <em>Polling Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SensorImpl#getSensorContext <em>Sensor Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SensorImpl extends CIM_LogicalDeviceImpl implements CIM_Sensor {
	/**
	 * The default value of the '{@link #getSensorType() <em>Sensor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SENSOR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensorType() <em>Sensor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorType()
	 * @generated
	 * @ordered
	 */
	protected Integer sensorType = SENSOR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherSensorTypeDescription() <em>Other Sensor Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSensorTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_SENSOR_TYPE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherSensorTypeDescription() <em>Other Sensor Type Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSensorTypeDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherSensorTypeDescription = OTHER_SENSOR_TYPE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPossibleStates() <em>Possible States</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleStates()
	 * @generated
	 * @ordered
	 */
	protected EList<String> possibleStates;

	/**
	 * The default value of the '{@link #getCurrentState() <em>Current State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentState() <em>Current State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentState()
	 * @generated
	 * @ordered
	 */
	protected String currentState = CURRENT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPollingInterval() <em>Polling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Long POLLING_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPollingInterval() <em>Polling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingInterval()
	 * @generated
	 * @ordered
	 */
	protected Long pollingInterval = POLLING_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSensorContext() <em>Sensor Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorContext()
	 * @generated
	 * @ordered
	 */
	protected static final String SENSOR_CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSensorContext() <em>Sensor Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensorContext()
	 * @generated
	 * @ordered
	 */
	protected String sensorContext = SENSOR_CONTEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Sensor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSensorType() {
		return sensorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensorType(Integer newSensorType) {
		Integer oldSensorType = sensorType;
		sensorType = newSensorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SENSOR__SENSOR_TYPE, oldSensorType, sensorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherSensorTypeDescription() {
		return otherSensorTypeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherSensorTypeDescription(String newOtherSensorTypeDescription) {
		String oldOtherSensorTypeDescription = otherSensorTypeDescription;
		otherSensorTypeDescription = newOtherSensorTypeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SENSOR__OTHER_SENSOR_TYPE_DESCRIPTION, oldOtherSensorTypeDescription, otherSensorTypeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPossibleStates() {
		if (possibleStates == null) {
			possibleStates = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SENSOR__POSSIBLE_STATES);
		}
		return possibleStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrentState() {
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentState(String newCurrentState) {
		String oldCurrentState = currentState;
		currentState = newCurrentState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SENSOR__CURRENT_STATE, oldCurrentState, currentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPollingInterval() {
		return pollingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPollingInterval(Long newPollingInterval) {
		Long oldPollingInterval = pollingInterval;
		pollingInterval = newPollingInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SENSOR__POLLING_INTERVAL, oldPollingInterval, pollingInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSensorContext() {
		return sensorContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSensorContext(String newSensorContext) {
		String oldSensorContext = sensorContext;
		sensorContext = newSensorContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SENSOR__SENSOR_CONTEXT, oldSensorContext, sensorContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SENSOR__SENSOR_TYPE:
				return getSensorType();
			case CimPackage.CIM_SENSOR__OTHER_SENSOR_TYPE_DESCRIPTION:
				return getOtherSensorTypeDescription();
			case CimPackage.CIM_SENSOR__POSSIBLE_STATES:
				return getPossibleStates();
			case CimPackage.CIM_SENSOR__CURRENT_STATE:
				return getCurrentState();
			case CimPackage.CIM_SENSOR__POLLING_INTERVAL:
				return getPollingInterval();
			case CimPackage.CIM_SENSOR__SENSOR_CONTEXT:
				return getSensorContext();
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
			case CimPackage.CIM_SENSOR__SENSOR_TYPE:
				setSensorType((Integer)newValue);
				return;
			case CimPackage.CIM_SENSOR__OTHER_SENSOR_TYPE_DESCRIPTION:
				setOtherSensorTypeDescription((String)newValue);
				return;
			case CimPackage.CIM_SENSOR__POSSIBLE_STATES:
				getPossibleStates().clear();
				getPossibleStates().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SENSOR__CURRENT_STATE:
				setCurrentState((String)newValue);
				return;
			case CimPackage.CIM_SENSOR__POLLING_INTERVAL:
				setPollingInterval((Long)newValue);
				return;
			case CimPackage.CIM_SENSOR__SENSOR_CONTEXT:
				setSensorContext((String)newValue);
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
			case CimPackage.CIM_SENSOR__SENSOR_TYPE:
				setSensorType(SENSOR_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_SENSOR__OTHER_SENSOR_TYPE_DESCRIPTION:
				setOtherSensorTypeDescription(OTHER_SENSOR_TYPE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_SENSOR__POSSIBLE_STATES:
				getPossibleStates().clear();
				return;
			case CimPackage.CIM_SENSOR__CURRENT_STATE:
				setCurrentState(CURRENT_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_SENSOR__POLLING_INTERVAL:
				setPollingInterval(POLLING_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_SENSOR__SENSOR_CONTEXT:
				setSensorContext(SENSOR_CONTEXT_EDEFAULT);
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
			case CimPackage.CIM_SENSOR__SENSOR_TYPE:
				return SENSOR_TYPE_EDEFAULT == null ? sensorType != null : !SENSOR_TYPE_EDEFAULT.equals(sensorType);
			case CimPackage.CIM_SENSOR__OTHER_SENSOR_TYPE_DESCRIPTION:
				return OTHER_SENSOR_TYPE_DESCRIPTION_EDEFAULT == null ? otherSensorTypeDescription != null : !OTHER_SENSOR_TYPE_DESCRIPTION_EDEFAULT.equals(otherSensorTypeDescription);
			case CimPackage.CIM_SENSOR__POSSIBLE_STATES:
				return possibleStates != null && !possibleStates.isEmpty();
			case CimPackage.CIM_SENSOR__CURRENT_STATE:
				return CURRENT_STATE_EDEFAULT == null ? currentState != null : !CURRENT_STATE_EDEFAULT.equals(currentState);
			case CimPackage.CIM_SENSOR__POLLING_INTERVAL:
				return POLLING_INTERVAL_EDEFAULT == null ? pollingInterval != null : !POLLING_INTERVAL_EDEFAULT.equals(pollingInterval);
			case CimPackage.CIM_SENSOR__SENSOR_CONTEXT:
				return SENSOR_CONTEXT_EDEFAULT == null ? sensorContext != null : !SENSOR_CONTEXT_EDEFAULT.equals(sensorContext);
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
		result.append(" (SensorType: ");
		result.append(sensorType);
		result.append(", OtherSensorTypeDescription: ");
		result.append(otherSensorTypeDescription);
		result.append(", PossibleStates: ");
		result.append(possibleStates);
		result.append(", CurrentState: ");
		result.append(currentState);
		result.append(", PollingInterval: ");
		result.append(pollingInterval);
		result.append(", SensorContext: ");
		result.append(sensorContext);
		result.append(')');
		return result.toString();
	}

} //CIM_SensorImpl

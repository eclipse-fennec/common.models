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

import org.dmtf.cim.CIM_AlarmDeviceCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Alarm Device Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlarmDeviceCapabilitiesImpl#getRequestedAlarmStatesSupported <em>Requested Alarm States Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_AlarmDeviceCapabilitiesImpl#getAlarmIndicatorTypesConfigurable <em>Alarm Indicator Types Configurable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_AlarmDeviceCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_AlarmDeviceCapabilities {
	/**
	 * The cached value of the '{@link #getRequestedAlarmStatesSupported() <em>Requested Alarm States Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedAlarmStatesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> requestedAlarmStatesSupported;

	/**
	 * The cached value of the '{@link #getAlarmIndicatorTypesConfigurable() <em>Alarm Indicator Types Configurable</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlarmIndicatorTypesConfigurable()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> alarmIndicatorTypesConfigurable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_AlarmDeviceCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_AlarmDeviceCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRequestedAlarmStatesSupported() {
		if (requestedAlarmStatesSupported == null) {
			requestedAlarmStatesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ALARM_DEVICE_CAPABILITIES__REQUESTED_ALARM_STATES_SUPPORTED);
		}
		return requestedAlarmStatesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAlarmIndicatorTypesConfigurable() {
		if (alarmIndicatorTypesConfigurable == null) {
			alarmIndicatorTypesConfigurable = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_ALARM_DEVICE_CAPABILITIES__ALARM_INDICATOR_TYPES_CONFIGURABLE);
		}
		return alarmIndicatorTypesConfigurable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ALARM_DEVICE_CAPABILITIES__REQUESTED_ALARM_STATES_SUPPORTED:
				return getRequestedAlarmStatesSupported();
			case CimPackage.CIM_ALARM_DEVICE_CAPABILITIES__ALARM_INDICATOR_TYPES_CONFIGURABLE:
				return getAlarmIndicatorTypesConfigurable();
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
			case CimPackage.CIM_ALARM_DEVICE_CAPABILITIES__REQUESTED_ALARM_STATES_SUPPORTED:
				getRequestedAlarmStatesSupported().clear();
				getRequestedAlarmStatesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_ALARM_DEVICE_CAPABILITIES__ALARM_INDICATOR_TYPES_CONFIGURABLE:
				getAlarmIndicatorTypesConfigurable().clear();
				getAlarmIndicatorTypesConfigurable().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_ALARM_DEVICE_CAPABILITIES__REQUESTED_ALARM_STATES_SUPPORTED:
				getRequestedAlarmStatesSupported().clear();
				return;
			case CimPackage.CIM_ALARM_DEVICE_CAPABILITIES__ALARM_INDICATOR_TYPES_CONFIGURABLE:
				getAlarmIndicatorTypesConfigurable().clear();
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
			case CimPackage.CIM_ALARM_DEVICE_CAPABILITIES__REQUESTED_ALARM_STATES_SUPPORTED:
				return requestedAlarmStatesSupported != null && !requestedAlarmStatesSupported.isEmpty();
			case CimPackage.CIM_ALARM_DEVICE_CAPABILITIES__ALARM_INDICATOR_TYPES_CONFIGURABLE:
				return alarmIndicatorTypesConfigurable != null && !alarmIndicatorTypesConfigurable.isEmpty();
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
		result.append(" (RequestedAlarmStatesSupported: ");
		result.append(requestedAlarmStatesSupported);
		result.append(", AlarmIndicatorTypesConfigurable: ");
		result.append(alarmIndicatorTypesConfigurable);
		result.append(')');
		return result.toString();
	}

} //CIM_AlarmDeviceCapabilitiesImpl

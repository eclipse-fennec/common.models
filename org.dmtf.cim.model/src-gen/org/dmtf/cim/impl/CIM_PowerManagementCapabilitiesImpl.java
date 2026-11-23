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

import org.dmtf.cim.CIM_PowerManagementCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Power Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerManagementCapabilitiesImpl#getPowerCapabilities <em>Power Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerManagementCapabilitiesImpl#getOtherPowerCapabilitiesDescriptions <em>Other Power Capabilities Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerManagementCapabilitiesImpl#getPowerStatesSupported <em>Power States Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerManagementCapabilitiesImpl#getPowerChangeCapabilities <em>Power Change Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerManagementCapabilitiesImpl#getOtherPowerChangeCapabilities <em>Other Power Change Capabilities</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerManagementCapabilitiesImpl#getRequestedPowerStatesSupported <em>Requested Power States Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PowerManagementCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_PowerManagementCapabilities {
	/**
	 * The cached value of the '{@link #getPowerCapabilities() <em>Power Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> powerCapabilities;

	/**
	 * The cached value of the '{@link #getOtherPowerCapabilitiesDescriptions() <em>Other Power Capabilities Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPowerCapabilitiesDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherPowerCapabilitiesDescriptions;

	/**
	 * The cached value of the '{@link #getPowerStatesSupported() <em>Power States Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerStatesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> powerStatesSupported;

	/**
	 * The cached value of the '{@link #getPowerChangeCapabilities() <em>Power Change Capabilities</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerChangeCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> powerChangeCapabilities;

	/**
	 * The default value of the '{@link #getOtherPowerChangeCapabilities() <em>Other Power Change Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPowerChangeCapabilities()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_POWER_CHANGE_CAPABILITIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherPowerChangeCapabilities() <em>Other Power Change Capabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPowerChangeCapabilities()
	 * @generated
	 * @ordered
	 */
	protected String otherPowerChangeCapabilities = OTHER_POWER_CHANGE_CAPABILITIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequestedPowerStatesSupported() <em>Requested Power States Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestedPowerStatesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> requestedPowerStatesSupported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PowerManagementCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PowerManagementCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPowerCapabilities() {
		if (powerCapabilities == null) {
			powerCapabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__POWER_CAPABILITIES);
		}
		return powerCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherPowerCapabilitiesDescriptions() {
		if (otherPowerCapabilitiesDescriptions == null) {
			otherPowerCapabilitiesDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__OTHER_POWER_CAPABILITIES_DESCRIPTIONS);
		}
		return otherPowerCapabilitiesDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPowerStatesSupported() {
		if (powerStatesSupported == null) {
			powerStatesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__POWER_STATES_SUPPORTED);
		}
		return powerStatesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPowerChangeCapabilities() {
		if (powerChangeCapabilities == null) {
			powerChangeCapabilities = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__POWER_CHANGE_CAPABILITIES);
		}
		return powerChangeCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherPowerChangeCapabilities() {
		return otherPowerChangeCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherPowerChangeCapabilities(String newOtherPowerChangeCapabilities) {
		String oldOtherPowerChangeCapabilities = otherPowerChangeCapabilities;
		otherPowerChangeCapabilities = newOtherPowerChangeCapabilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__OTHER_POWER_CHANGE_CAPABILITIES, oldOtherPowerChangeCapabilities, otherPowerChangeCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getRequestedPowerStatesSupported() {
		if (requestedPowerStatesSupported == null) {
			requestedPowerStatesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__REQUESTED_POWER_STATES_SUPPORTED);
		}
		return requestedPowerStatesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__POWER_CAPABILITIES:
				return getPowerCapabilities();
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__OTHER_POWER_CAPABILITIES_DESCRIPTIONS:
				return getOtherPowerCapabilitiesDescriptions();
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__POWER_STATES_SUPPORTED:
				return getPowerStatesSupported();
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__POWER_CHANGE_CAPABILITIES:
				return getPowerChangeCapabilities();
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__OTHER_POWER_CHANGE_CAPABILITIES:
				return getOtherPowerChangeCapabilities();
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__REQUESTED_POWER_STATES_SUPPORTED:
				return getRequestedPowerStatesSupported();
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
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__POWER_CAPABILITIES:
				getPowerCapabilities().clear();
				getPowerCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__OTHER_POWER_CAPABILITIES_DESCRIPTIONS:
				getOtherPowerCapabilitiesDescriptions().clear();
				getOtherPowerCapabilitiesDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__POWER_STATES_SUPPORTED:
				getPowerStatesSupported().clear();
				getPowerStatesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__POWER_CHANGE_CAPABILITIES:
				getPowerChangeCapabilities().clear();
				getPowerChangeCapabilities().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__OTHER_POWER_CHANGE_CAPABILITIES:
				setOtherPowerChangeCapabilities((String)newValue);
				return;
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__REQUESTED_POWER_STATES_SUPPORTED:
				getRequestedPowerStatesSupported().clear();
				getRequestedPowerStatesSupported().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__POWER_CAPABILITIES:
				getPowerCapabilities().clear();
				return;
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__OTHER_POWER_CAPABILITIES_DESCRIPTIONS:
				getOtherPowerCapabilitiesDescriptions().clear();
				return;
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__POWER_STATES_SUPPORTED:
				getPowerStatesSupported().clear();
				return;
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__POWER_CHANGE_CAPABILITIES:
				getPowerChangeCapabilities().clear();
				return;
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__OTHER_POWER_CHANGE_CAPABILITIES:
				setOtherPowerChangeCapabilities(OTHER_POWER_CHANGE_CAPABILITIES_EDEFAULT);
				return;
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__REQUESTED_POWER_STATES_SUPPORTED:
				getRequestedPowerStatesSupported().clear();
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
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__POWER_CAPABILITIES:
				return powerCapabilities != null && !powerCapabilities.isEmpty();
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__OTHER_POWER_CAPABILITIES_DESCRIPTIONS:
				return otherPowerCapabilitiesDescriptions != null && !otherPowerCapabilitiesDescriptions.isEmpty();
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__POWER_STATES_SUPPORTED:
				return powerStatesSupported != null && !powerStatesSupported.isEmpty();
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__POWER_CHANGE_CAPABILITIES:
				return powerChangeCapabilities != null && !powerChangeCapabilities.isEmpty();
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__OTHER_POWER_CHANGE_CAPABILITIES:
				return OTHER_POWER_CHANGE_CAPABILITIES_EDEFAULT == null ? otherPowerChangeCapabilities != null : !OTHER_POWER_CHANGE_CAPABILITIES_EDEFAULT.equals(otherPowerChangeCapabilities);
			case CimPackage.CIM_POWER_MANAGEMENT_CAPABILITIES__REQUESTED_POWER_STATES_SUPPORTED:
				return requestedPowerStatesSupported != null && !requestedPowerStatesSupported.isEmpty();
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
		result.append(" (PowerCapabilities: ");
		result.append(powerCapabilities);
		result.append(", OtherPowerCapabilitiesDescriptions: ");
		result.append(otherPowerCapabilitiesDescriptions);
		result.append(", PowerStatesSupported: ");
		result.append(powerStatesSupported);
		result.append(", PowerChangeCapabilities: ");
		result.append(powerChangeCapabilities);
		result.append(", OtherPowerChangeCapabilities: ");
		result.append(otherPowerChangeCapabilities);
		result.append(", RequestedPowerStatesSupported: ");
		result.append(requestedPowerStatesSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_PowerManagementCapabilitiesImpl

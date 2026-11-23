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

import org.dmtf.cim.CIM_PowerUtilizationManagementCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Power Utilization Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerUtilizationManagementCapabilitiesImpl#getPowerUtilizationModesSupported <em>Power Utilization Modes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PowerUtilizationManagementCapabilitiesImpl#getSupportedMethods <em>Supported Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PowerUtilizationManagementCapabilitiesImpl extends CIM_EnabledLogicalElementCapabilitiesImpl implements CIM_PowerUtilizationManagementCapabilities {
	/**
	 * The cached value of the '{@link #getPowerUtilizationModesSupported() <em>Power Utilization Modes Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerUtilizationModesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> powerUtilizationModesSupported;

	/**
	 * The cached value of the '{@link #getSupportedMethods() <em>Supported Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PowerUtilizationManagementCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PowerUtilizationManagementCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getPowerUtilizationModesSupported() {
		if (powerUtilizationModesSupported == null) {
			powerUtilizationModesSupported = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_CAPABILITIES__POWER_UTILIZATION_MODES_SUPPORTED);
		}
		return powerUtilizationModesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedMethods() {
		if (supportedMethods == null) {
			supportedMethods = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_CAPABILITIES__SUPPORTED_METHODS);
		}
		return supportedMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_CAPABILITIES__POWER_UTILIZATION_MODES_SUPPORTED:
				return getPowerUtilizationModesSupported();
			case CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_CAPABILITIES__SUPPORTED_METHODS:
				return getSupportedMethods();
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
			case CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_CAPABILITIES__POWER_UTILIZATION_MODES_SUPPORTED:
				getPowerUtilizationModesSupported().clear();
				getPowerUtilizationModesSupported().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_CAPABILITIES__SUPPORTED_METHODS:
				getSupportedMethods().clear();
				getSupportedMethods().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_CAPABILITIES__POWER_UTILIZATION_MODES_SUPPORTED:
				getPowerUtilizationModesSupported().clear();
				return;
			case CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_CAPABILITIES__SUPPORTED_METHODS:
				getSupportedMethods().clear();
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
			case CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_CAPABILITIES__POWER_UTILIZATION_MODES_SUPPORTED:
				return powerUtilizationModesSupported != null && !powerUtilizationModesSupported.isEmpty();
			case CimPackage.CIM_POWER_UTILIZATION_MANAGEMENT_CAPABILITIES__SUPPORTED_METHODS:
				return supportedMethods != null && !supportedMethods.isEmpty();
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
		result.append(" (PowerUtilizationModesSupported: ");
		result.append(powerUtilizationModesSupported);
		result.append(", SupportedMethods: ");
		result.append(supportedMethods);
		result.append(')');
		return result.toString();
	}

} //CIM_PowerUtilizationManagementCapabilitiesImpl

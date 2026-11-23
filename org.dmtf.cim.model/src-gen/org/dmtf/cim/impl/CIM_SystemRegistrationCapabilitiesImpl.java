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

import org.dmtf.cim.CIM_SystemRegistrationCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM System Registration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemRegistrationCapabilitiesImpl#getAutonomousProfilesSupported <em>Autonomous Profiles Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemRegistrationCapabilitiesImpl#getVendorsSupported <em>Vendors Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemRegistrationCapabilitiesImpl#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemRegistrationCapabilitiesImpl#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SystemRegistrationCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_SystemRegistrationCapabilities {
	/**
	 * The cached value of the '{@link #getAutonomousProfilesSupported() <em>Autonomous Profiles Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutonomousProfilesSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<String> autonomousProfilesSupported;

	/**
	 * The cached value of the '{@link #getVendorsSupported() <em>Vendors Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<String> vendorsSupported;

	/**
	 * The cached value of the '{@link #getSupportedAsynchronousActions() <em>Supported Asynchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAsynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAsynchronousActions;

	/**
	 * The cached value of the '{@link #getSupportedSynchronousActions() <em>Supported Synchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSynchronousActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SystemRegistrationCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SystemRegistrationCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAutonomousProfilesSupported() {
		if (autonomousProfilesSupported == null) {
			autonomousProfilesSupported = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__AUTONOMOUS_PROFILES_SUPPORTED);
		}
		return autonomousProfilesSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVendorsSupported() {
		if (vendorsSupported == null) {
			vendorsSupported = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__VENDORS_SUPPORTED);
		}
		return vendorsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAsynchronousActions() {
		if (supportedAsynchronousActions == null) {
			supportedAsynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS);
		}
		return supportedAsynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSynchronousActions() {
		if (supportedSynchronousActions == null) {
			supportedSynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS);
		}
		return supportedSynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__AUTONOMOUS_PROFILES_SUPPORTED:
				return getAutonomousProfilesSupported();
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__VENDORS_SUPPORTED:
				return getVendorsSupported();
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return getSupportedAsynchronousActions();
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return getSupportedSynchronousActions();
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
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__AUTONOMOUS_PROFILES_SUPPORTED:
				getAutonomousProfilesSupported().clear();
				getAutonomousProfilesSupported().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__VENDORS_SUPPORTED:
				getVendorsSupported().clear();
				getVendorsSupported().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				getSupportedAsynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				getSupportedSynchronousActions().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__AUTONOMOUS_PROFILES_SUPPORTED:
				getAutonomousProfilesSupported().clear();
				return;
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__VENDORS_SUPPORTED:
				getVendorsSupported().clear();
				return;
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				return;
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
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
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__AUTONOMOUS_PROFILES_SUPPORTED:
				return autonomousProfilesSupported != null && !autonomousProfilesSupported.isEmpty();
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__VENDORS_SUPPORTED:
				return vendorsSupported != null && !vendorsSupported.isEmpty();
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return supportedAsynchronousActions != null && !supportedAsynchronousActions.isEmpty();
			case CimPackage.CIM_SYSTEM_REGISTRATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return supportedSynchronousActions != null && !supportedSynchronousActions.isEmpty();
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
		result.append(" (AutonomousProfilesSupported: ");
		result.append(autonomousProfilesSupported);
		result.append(", VendorsSupported: ");
		result.append(vendorsSupported);
		result.append(", SupportedAsynchronousActions: ");
		result.append(supportedAsynchronousActions);
		result.append(", SupportedSynchronousActions: ");
		result.append(supportedSynchronousActions);
		result.append(')');
		return result.toString();
	}

} //CIM_SystemRegistrationCapabilitiesImpl

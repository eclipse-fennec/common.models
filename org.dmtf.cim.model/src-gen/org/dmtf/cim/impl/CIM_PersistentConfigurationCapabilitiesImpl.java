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

import org.dmtf.cim.CIM_PersistentConfigurationCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Persistent Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersistentConfigurationCapabilitiesImpl#getSupportedSynchronousOperations <em>Supported Synchronous Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersistentConfigurationCapabilitiesImpl#getSupportedAsynchronousOperations <em>Supported Asynchronous Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PersistentConfigurationCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_PersistentConfigurationCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedSynchronousOperations() <em>Supported Synchronous Operations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSynchronousOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSynchronousOperations;

	/**
	 * The cached value of the '{@link #getSupportedAsynchronousOperations() <em>Supported Asynchronous Operations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAsynchronousOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAsynchronousOperations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PersistentConfigurationCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_PersistentConfigurationCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSynchronousOperations() {
		if (supportedSynchronousOperations == null) {
			supportedSynchronousOperations = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PERSISTENT_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_OPERATIONS);
		}
		return supportedSynchronousOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAsynchronousOperations() {
		if (supportedAsynchronousOperations == null) {
			supportedAsynchronousOperations = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_PERSISTENT_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_OPERATIONS);
		}
		return supportedAsynchronousOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PERSISTENT_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_OPERATIONS:
				return getSupportedSynchronousOperations();
			case CimPackage.CIM_PERSISTENT_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_OPERATIONS:
				return getSupportedAsynchronousOperations();
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
			case CimPackage.CIM_PERSISTENT_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_OPERATIONS:
				getSupportedSynchronousOperations().clear();
				getSupportedSynchronousOperations().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_PERSISTENT_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_OPERATIONS:
				getSupportedAsynchronousOperations().clear();
				getSupportedAsynchronousOperations().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_PERSISTENT_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_OPERATIONS:
				getSupportedSynchronousOperations().clear();
				return;
			case CimPackage.CIM_PERSISTENT_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_OPERATIONS:
				getSupportedAsynchronousOperations().clear();
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
			case CimPackage.CIM_PERSISTENT_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_OPERATIONS:
				return supportedSynchronousOperations != null && !supportedSynchronousOperations.isEmpty();
			case CimPackage.CIM_PERSISTENT_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_OPERATIONS:
				return supportedAsynchronousOperations != null && !supportedAsynchronousOperations.isEmpty();
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
		result.append(" (SupportedSynchronousOperations: ");
		result.append(supportedSynchronousOperations);
		result.append(", SupportedAsynchronousOperations: ");
		result.append(supportedAsynchronousOperations);
		result.append(')');
		return result.toString();
	}

} //CIM_PersistentConfigurationCapabilitiesImpl

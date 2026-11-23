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

import org.dmtf.cim.CIM_ResourcePoolConfigurationCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Resource Pool Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourcePoolConfigurationCapabilitiesImpl#getAsynchronousMethodsSupported <em>Asynchronous Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ResourcePoolConfigurationCapabilitiesImpl#getSynchronousMethodsSupported <em>Synchronous Methods Supported</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ResourcePoolConfigurationCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_ResourcePoolConfigurationCapabilities {
	/**
	 * The cached value of the '{@link #getAsynchronousMethodsSupported() <em>Asynchronous Methods Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsynchronousMethodsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> asynchronousMethodsSupported;

	/**
	 * The cached value of the '{@link #getSynchronousMethodsSupported() <em>Synchronous Methods Supported</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronousMethodsSupported()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> synchronousMethodsSupported;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ResourcePoolConfigurationCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ResourcePoolConfigurationCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getAsynchronousMethodsSupported() {
		if (asynchronousMethodsSupported == null) {
			asynchronousMethodsSupported = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_CAPABILITIES__ASYNCHRONOUS_METHODS_SUPPORTED);
		}
		return asynchronousMethodsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getSynchronousMethodsSupported() {
		if (synchronousMethodsSupported == null) {
			synchronousMethodsSupported = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED);
		}
		return synchronousMethodsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_CAPABILITIES__ASYNCHRONOUS_METHODS_SUPPORTED:
				return getAsynchronousMethodsSupported();
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				return getSynchronousMethodsSupported();
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
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_CAPABILITIES__ASYNCHRONOUS_METHODS_SUPPORTED:
				getAsynchronousMethodsSupported().clear();
				getAsynchronousMethodsSupported().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				getSynchronousMethodsSupported().clear();
				getSynchronousMethodsSupported().addAll((Collection<? extends Long>)newValue);
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
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_CAPABILITIES__ASYNCHRONOUS_METHODS_SUPPORTED:
				getAsynchronousMethodsSupported().clear();
				return;
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				getSynchronousMethodsSupported().clear();
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
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_CAPABILITIES__ASYNCHRONOUS_METHODS_SUPPORTED:
				return asynchronousMethodsSupported != null && !asynchronousMethodsSupported.isEmpty();
			case CimPackage.CIM_RESOURCE_POOL_CONFIGURATION_CAPABILITIES__SYNCHRONOUS_METHODS_SUPPORTED:
				return synchronousMethodsSupported != null && !synchronousMethodsSupported.isEmpty();
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
		result.append(" (AsynchronousMethodsSupported: ");
		result.append(asynchronousMethodsSupported);
		result.append(", SynchronousMethodsSupported: ");
		result.append(synchronousMethodsSupported);
		result.append(')');
		return result.toString();
	}

} //CIM_ResourcePoolConfigurationCapabilitiesImpl

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

import org.dmtf.cim.CIM_FileSystemConfigurationCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM File System Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemConfigurationCapabilitiesImpl#getSupportedActualFileSystemTypes <em>Supported Actual File System Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemConfigurationCapabilitiesImpl#getSupportedSynchronousMethods <em>Supported Synchronous Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemConfigurationCapabilitiesImpl#getSupportedAsynchronousMethods <em>Supported Asynchronous Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_FileSystemConfigurationCapabilitiesImpl#getInitialAvailability <em>Initial Availability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_FileSystemConfigurationCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_FileSystemConfigurationCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedActualFileSystemTypes() <em>Supported Actual File System Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedActualFileSystemTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedActualFileSystemTypes;

	/**
	 * The cached value of the '{@link #getSupportedSynchronousMethods() <em>Supported Synchronous Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSynchronousMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSynchronousMethods;

	/**
	 * The cached value of the '{@link #getSupportedAsynchronousMethods() <em>Supported Asynchronous Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAsynchronousMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAsynchronousMethods;

	/**
	 * The default value of the '{@link #getInitialAvailability() <em>Initial Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INITIAL_AVAILABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialAvailability() <em>Initial Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialAvailability()
	 * @generated
	 * @ordered
	 */
	protected Integer initialAvailability = INITIAL_AVAILABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_FileSystemConfigurationCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_FileSystemConfigurationCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedActualFileSystemTypes() {
		if (supportedActualFileSystemTypes == null) {
			supportedActualFileSystemTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__SUPPORTED_ACTUAL_FILE_SYSTEM_TYPES);
		}
		return supportedActualFileSystemTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSynchronousMethods() {
		if (supportedSynchronousMethods == null) {
			supportedSynchronousMethods = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_METHODS);
		}
		return supportedSynchronousMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAsynchronousMethods() {
		if (supportedAsynchronousMethods == null) {
			supportedAsynchronousMethods = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_METHODS);
		}
		return supportedAsynchronousMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInitialAvailability() {
		return initialAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialAvailability(Integer newInitialAvailability) {
		Integer oldInitialAvailability = initialAvailability;
		initialAvailability = newInitialAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__INITIAL_AVAILABILITY, oldInitialAvailability, initialAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__SUPPORTED_ACTUAL_FILE_SYSTEM_TYPES:
				return getSupportedActualFileSystemTypes();
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_METHODS:
				return getSupportedSynchronousMethods();
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_METHODS:
				return getSupportedAsynchronousMethods();
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__INITIAL_AVAILABILITY:
				return getInitialAvailability();
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
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__SUPPORTED_ACTUAL_FILE_SYSTEM_TYPES:
				getSupportedActualFileSystemTypes().clear();
				getSupportedActualFileSystemTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_METHODS:
				getSupportedSynchronousMethods().clear();
				getSupportedSynchronousMethods().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_METHODS:
				getSupportedAsynchronousMethods().clear();
				getSupportedAsynchronousMethods().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__INITIAL_AVAILABILITY:
				setInitialAvailability((Integer)newValue);
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
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__SUPPORTED_ACTUAL_FILE_SYSTEM_TYPES:
				getSupportedActualFileSystemTypes().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_METHODS:
				getSupportedSynchronousMethods().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_METHODS:
				getSupportedAsynchronousMethods().clear();
				return;
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__INITIAL_AVAILABILITY:
				setInitialAvailability(INITIAL_AVAILABILITY_EDEFAULT);
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
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__SUPPORTED_ACTUAL_FILE_SYSTEM_TYPES:
				return supportedActualFileSystemTypes != null && !supportedActualFileSystemTypes.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_METHODS:
				return supportedSynchronousMethods != null && !supportedSynchronousMethods.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_METHODS:
				return supportedAsynchronousMethods != null && !supportedAsynchronousMethods.isEmpty();
			case CimPackage.CIM_FILE_SYSTEM_CONFIGURATION_CAPABILITIES__INITIAL_AVAILABILITY:
				return INITIAL_AVAILABILITY_EDEFAULT == null ? initialAvailability != null : !INITIAL_AVAILABILITY_EDEFAULT.equals(initialAvailability);
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
		result.append(" (SupportedActualFileSystemTypes: ");
		result.append(supportedActualFileSystemTypes);
		result.append(", SupportedSynchronousMethods: ");
		result.append(supportedSynchronousMethods);
		result.append(", SupportedAsynchronousMethods: ");
		result.append(supportedAsynchronousMethods);
		result.append(", InitialAvailability: ");
		result.append(initialAvailability);
		result.append(')');
		return result.toString();
	}

} //CIM_FileSystemConfigurationCapabilitiesImpl

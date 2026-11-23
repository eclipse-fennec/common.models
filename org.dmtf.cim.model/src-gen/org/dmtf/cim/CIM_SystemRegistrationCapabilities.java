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
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM System Registration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The capabilities of a WBEM server.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SystemRegistrationCapabilities#getAutonomousProfilesSupported <em>Autonomous Profiles Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemRegistrationCapabilities#getVendorsSupported <em>Vendors Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemRegistrationCapabilities#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SystemRegistrationCapabilities#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SystemRegistrationCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::Capabilities' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SystemRegistrationCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Autonomous Profiles Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies the profiles that this service is capable of discovering and managing. For example, a block device could potentially list "Array" and "Storage Virtualizer." An attempt to discover a different kind of device, like a Fibre Channel switch would fail.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Autonomous Profiles Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemRegistrationCapabilities_AutonomousProfilesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getAutonomousProfilesSupported();

	/**
	 * Returns the value of the '<em><b>Vendors Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property identifies the vendors whose devices this service can discover. For example, if the list contains "Vendor A" then only "Vendor A" devices with the supported autonomous profiles listed in AutonomousProfilesSupported[] can be discovered. Attempting to discover other vendors devices would result in an error. This should include at least the instrumentation vendor, and may include other vendors, for example, due to OEM relationships
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendors Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemRegistrationCapabilities_VendorsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getVendorsSupported();

	/**
	 * Returns the value of the '<em><b>Supported Asynchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which methods are executed asynchronously.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Asynchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemRegistrationCapabilities_SupportedAsynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Add System\",\"Discover Systems\",\"Remove System\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAsynchronousActions();

	/**
	 * Returns the value of the '<em><b>Supported Synchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which methods are executed synchronously.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_SystemRegistrationCapabilities_SupportedSynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Add System\",\"Discover Systems\",\"Remove System\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSynchronousActions();

} // CIM_SystemRegistrationCapabilities

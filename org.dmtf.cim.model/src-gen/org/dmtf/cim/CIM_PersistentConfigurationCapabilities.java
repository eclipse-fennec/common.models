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
 * A representation of the model object '<em><b>CIM Persistent Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of Capabilities that defines the capabilities of a PersistentMemoryService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PersistentConfigurationCapabilities#getSupportedSynchronousOperations <em>Supported Synchronous Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PersistentConfigurationCapabilities#getSupportedAsynchronousOperations <em>Supported Asynchronous Operations</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PersistentConfigurationCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.47.0' UMLPackagePath='CIM::Device::ConfigurableMemory' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_PersistentConfigurationCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Synchronous Operations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the available synchronous memory provisioning operations. Synchronous operations result in an immediate change to the platform memory configuration. 
	 * "Unknown" No synchronous operations supported 
	 * "AllocateFromPool" persistent namespace allocation is supported. 
	 * "ReturnToPool" persistent namespace deallocation is supported. 
	 * "ModifyNamespace" persistent namespace modification is supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronous Operations</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PersistentConfigurationCapabilities_SupportedSynchronousOperations()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"AllocateFromPool\",\"ReturnToPool\",\"ModifyNamespace\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSynchronousOperations();

	/**
	 * Returns the value of the '<em><b>Supported Asynchronous Operations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the available asynchronous memory provisioning operations. Asynchronous operations stage a memory provisioning request which takes effect after some triggering action such as a system reboot. 
	 * "Unknown" No synchronous operations supported 
	 * "AllocateFromPool" persistent namespace allocation is supported. 
	 * "ReturnToPool" persistent namespace deallocation is supported. 
	 * "ModifyNamespace" persistent namespace modification is supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Asynchronous Operations</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PersistentConfigurationCapabilities_SupportedAsynchronousOperations()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"AllocateFromPool\",\"ReturnToPool\",\"ModifyNamespace\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAsynchronousOperations();

} // CIM_PersistentConfigurationCapabilities

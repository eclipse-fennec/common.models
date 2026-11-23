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
 * A representation of the model object '<em><b>CIM Resource Pool Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class exposes the supported capabilities of a ResourcePoolConfigurationService. Not all implementations will support all methods on the service. Clients may use instances of this class to determine which methods are supported. The same method must not be listed in both lists. Implementations must either be non-blocking and use a Job for long running operations, or always block until the operation completes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ResourcePoolConfigurationCapabilities#getAsynchronousMethodsSupported <em>Asynchronous Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ResourcePoolConfigurationCapabilities#getSynchronousMethodsSupported <em>Synchronous Methods Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePoolConfigurationCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Core::Resource' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ResourcePoolConfigurationCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Asynchronous Methods Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property reflects the methods of the associated service class that are supported that may return a Job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asynchronous Methods Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePoolConfigurationCapabilities_AsynchronousMethodsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"32768..65535\"]' Values='[\"CreateResourcePool is supported\",\"CreateChild ResourcePool is supported\",\"DeleteResourcePool is supported\",\"AddResourcesToResourcePool is supported\",\"RemoveResourcesFromResourcePool is supported\",\"ChangeParentResourcePool is supported\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Long> getAsynchronousMethodsSupported();

	/**
	 * Returns the value of the '<em><b>Synchronous Methods Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property reflects the methods of the associated service class that are supported andblock until completed (no Job is returned.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synchronous Methods Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ResourcePoolConfigurationCapabilities_SynchronousMethodsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"32768..65535\"]' Values='[\"CreateResourcePool is supported\",\"CreateChild ResourcePool is supported\",\"DeleteResourcePool is supported\",\"AddResourcesToResourcePool is supported\",\"RemoveResourcesFromResourcePool is supported\",\"CIM_ChangeParentResourcePool is supported\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Long> getSynchronousMethodsSupported();

} // CIM_ResourcePoolConfigurationCapabilities

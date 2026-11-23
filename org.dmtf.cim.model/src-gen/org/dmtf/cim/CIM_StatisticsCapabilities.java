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
 * A representation of the model object '<em><b>CIM Statistics Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of this class defines the specific support for the metered elements and methods for retrieving that statistical data from a StatisticsService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StatisticsCapabilities#getElementTypesSupported <em>Element Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StatisticsCapabilities#getSynchronousMethodsSupported <em>Synchronous Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StatisticsCapabilities#getAsynchronousMethodsSupported <em>Asynchronous Methods Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StatisticsCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::StorageStatistics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StatisticsCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Element Types Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of element types for which statistical data is available. This property may not be meaningful if the StatisticsService these capabilities describe does not support StatisticalData instances for different types of elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Types Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticsCapabilities_ElementTypesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]'"
	 * @generated
	 */
	EList<Integer> getElementTypesSupported();

	/**
	 * Returns the value of the '<em><b>Synchronous Methods Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The synchronous mechanisms supported for retrieving statistics and defining and modifying filters for statistics retrieval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synchronous Methods Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticsCapabilities_SynchronousMethodsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"..\",\"0x8000..\"]' Values='[\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSynchronousMethodsSupported();

	/**
	 * Returns the value of the '<em><b>Asynchronous Methods Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The asychronous mechanisms supported for retrieving statistics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asynchronous Methods Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StatisticsCapabilities_AsynchronousMethodsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"..\",\"0x8000..\"]' Values='[\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getAsynchronousMethodsSupported();

} // CIM_StatisticsCapabilities

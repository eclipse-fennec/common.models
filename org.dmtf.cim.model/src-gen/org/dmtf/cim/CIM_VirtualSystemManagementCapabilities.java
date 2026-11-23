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
 * A representation of the model object '<em><b>CIM Virtual System Management Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capabilities of a CIM_VirtualSystemManagementService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemManagementCapabilities#getVirtualSystemTypesSupported <em>Virtual System Types Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemManagementCapabilities#getSynchronousMethodsSupported <em>Synchronous Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemManagementCapabilities#getAsynchronousMethodsSupported <em>Asynchronous Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemManagementCapabilities#getIndicationsSupported <em>Indications Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemManagementCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.23.0' UMLPackagePath='CIM::Core::Virtualization' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_VirtualSystemManagementCapabilities extends CIM_EnabledLogicalElementCapabilities {
	/**
	 * Returns the value of the '<em><b>Virtual System Types Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration of strings each designating a type of virtual system that the implementation supports.
	 * The value of each non-NULL array element shall conform to the format defined for the CIM_VirtualSystemSettingData.VirtualSystemType property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual System Types Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemManagementCapabilities_VirtualSystemTypesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_VirtualSystemSettingData.VirtualSystemType\"]'"
	 * @generated
	 */
	EList<String> getVirtualSystemTypesSupported();

	/**
	 * Returns the value of the '<em><b>Synchronous Methods Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemManagementService that is supported synchronously by the implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synchronous Methods Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemManagementCapabilities_SynchronousMethodsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"32767..65535\"]' Values='[\"DefineSystemSupported\",\"DestroySystemSupported\",\"DestroySystemConfigurationSupported\",\"ModifyResourceSettingsSupported\",\"ModifySystemSettingsSupported\",\"RemoveResourcesSupported\",\"SelectSystemConfigurationSupported\",\"SnapshotSystemSupported\",\"AddResourcesSupported\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getSynchronousMethodsSupported();

	/**
	 * Returns the value of the '<em><b>Asynchronous Methods Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemManagementService that is supported asynchronously by the implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Asynchronous Methods Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemManagementCapabilities_AsynchronousMethodsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"32767..65535\"]' Values='[\"DefineSystemSupported\",\"DestroySystemSupported\",\"DestroySystemConfigurationSupported\",\"ModifyResourceSettingsSupported\",\"ModifySystemSettingsSupported\",\"RemoveResourcesSupported\",\"SelectSystemConfigurationSupported\",\"SnapshotSystemSupported\",\"AddResourcesSupported\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getAsynchronousMethodsSupported();

	/**
	 * Returns the value of the '<em><b>Indications Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration of indication identifiers each identifying an indication that is supported by the implementation.
	 * VirtualSystemStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of CIM_ComputerSystem instances representing virtual systems.
	 * VirtualResourceStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of CIM_LogicalDevice instances representing resources of virtual systems.
	 * ConcreteJobStateChangeIndicationsSupported indicates whether or not the implementation supports notification on state changes of CIM_ConcreteJob instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indications Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemManagementCapabilities_IndicationsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32767..65535\"]' Values='[\"VirtualResourceStateChangeIndicationsSupported\",\"ConcreteJobStateChangeIndicationsSupported\",\"VirtualSystemStateChangeIndicationsSupported\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getIndicationsSupported();

} // CIM_VirtualSystemManagementCapabilities

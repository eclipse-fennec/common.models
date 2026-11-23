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
 * A representation of the model object '<em><b>CIM Virtual System Snapshot Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_VirtualSystemSnapshotServiceCapabilities class defines the properties that describe the capabilities of a virtual system snapshot service, like for example which snapshot operations are implemented.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSnapshotServiceCapabilities#getSynchronousMethodsSupported <em>Synchronous Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSnapshotServiceCapabilities#getAynchronousMethodsSupported <em>Aynchronous Methods Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_VirtualSystemSnapshotServiceCapabilities#getSnapshotTypesSupported <em>Snapshot Types Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSnapshotServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Core::Virtualization' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_VirtualSystemSnapshotServiceCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Synchronous Methods Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemSnapshotService that is supported synchronously by the implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synchronous Methods Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSnapshotServiceCapabilities_SynchronousMethodsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"..\"]' Values='[\"CreateSnapshotSupported\",\"DestroySnapshotSupported\",\"ApplySnapshotSupported\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getSynchronousMethodsSupported();

	/**
	 * Returns the value of the '<em><b>Aynchronous Methods Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration of method identifiers each identifying a method of class CIM_VirtualSystemSnapshotService that is supported synchronously and asynchronously by the implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aynchronous Methods Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSnapshotServiceCapabilities_AynchronousMethodsSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"..\"]' Values='[\"CreateSnapshotSupported\",\"DestroySnapshotSupported\",\"ApplySnapshotSupported\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	EList<Integer> getAynchronousMethodsSupported();

	/**
	 * Returns the value of the '<em><b>Snapshot Types Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supported snapshot types:
	 * Full Snapshot: Complete snapshot of the virtual system.
	 * Disk Snapshot: Snapshot of virtual system disks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Snapshot Types Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_VirtualSystemSnapshotServiceCapabilities_SnapshotTypesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Full Snapshot\",\"Disk Snapshot\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_VirtualSystemSnapshotService.CreateSnapshot(SnapshotType)\",\"CIM_VirtualSystemSnapshotCapabilities.SnapshotTypesEnabled\"]'"
	 * @generated
	 */
	EList<Integer> getSnapshotTypesSupported();

} // CIM_VirtualSystemSnapshotServiceCapabilities

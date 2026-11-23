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
 * A representation of the model object '<em><b>CIM File System Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FileSystemConfigurationCapabilities specifies the capability of a FileSystemConfigurationService to support the specified methods.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemConfigurationCapabilities#getSupportedActualFileSystemTypes <em>Supported Actual File System Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemConfigurationCapabilities#getSupportedSynchronousMethods <em>Supported Synchronous Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemConfigurationCapabilities#getSupportedAsynchronousMethods <em>Supported Asynchronous Methods</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemConfigurationCapabilities#getInitialAvailability <em>Initial Availability</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemConfigurationCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.51.0' UMLPackagePath='CIM::System::FilesystemServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FileSystemConfigurationCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Actual File System Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of enumerated values that indicates the set of actual file system implementation types that this FileSystemConfigurationService can support in its Capabilities. For each file system type listed here, there MUST be at least one FileSystemCapabilities element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Actual File System Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemConfigurationCapabilities_SupportedActualFileSystemTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"UFS\",\"HFS\",\"FAT\",\"FAT16\",\"FAT32\",\"NTFS4\",\"NTFS5\",\"XFS\",\"AFS\",\"EXT2\",\"EXT3\",\"REISERFS\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedActualFileSystemTypes();

	/**
	 * Returns the value of the '<em><b>Supported Synchronous Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of methods of this Service that are supported as synchronous methods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronous Methods</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemConfigurationCapabilities_SupportedSynchronousMethods()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"CreateFileSystem\",\"DeleteFileSystem\",\"ModifyFileSystem\",\"CreateGoal\",\"GetRequiredStorageSize\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSynchronousMethods();

	/**
	 * Returns the value of the '<em><b>Supported Asynchronous Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of methods of this Service that are supported as asynchronous methods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Asynchronous Methods</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemConfigurationCapabilities_SupportedAsynchronousMethods()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"CreateFileSystem\",\"DeleteFileSystem\",\"ModifyFileSystem\",\"CreateGoal\",\"GetRequiredStorageSize\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAsynchronousMethods();

	/**
	 * Returns the value of the '<em><b>Initial Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value that indicates the state of availability in which the Service can create the file system. The choices include 'Mounted' and 'Unmounted'. If 'Mounted', the mount-point will be at a vendor-specific default LogicalFile, and a MountedElement association will be surfaced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Availability</em>' attribute.
	 * @see #setInitialAvailability(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemConfigurationCapabilities_InitialAvailability()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Mounted\",\"Unmounted\",\"DMTF Reserved\",\"Vendor Defined\"]'"
	 * @generated
	 */
	Integer getInitialAvailability();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemConfigurationCapabilities#getInitialAvailability <em>Initial Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Availability</em>' attribute.
	 * @see #getInitialAvailability()
	 * @generated
	 */
	void setInitialAvailability(Integer value);

} // CIM_FileSystemConfigurationCapabilities

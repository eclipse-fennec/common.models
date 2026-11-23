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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Unix Local File System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from LocalFileSystem that represents the Unix environment view of a file store controlled by a ComputerSystem through local means (e.g., direct device driver access). In this case, the file store is managed directly by the ComputerSystem without the need for another computer to act as a file server. This definition does not breakdown in the case of a Clustered File System. In this scenario, the FileSystem is a LocalFileSystem, weak to the Cluster.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UnixLocalFileSystem#getFreeInodes <em>Free Inodes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixLocalFileSystem#getTotalInodes <em>Total Inodes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UnixLocalFileSystem#getFSReservedCapacity <em>FS Reserved Capacity</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UnixLocalFileSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::System::Unix' keys='CSCreationClassName,CSName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_UnixLocalFileSystem extends CIM_LocalFileSystem {
	/**
	 * Returns the value of the '<em><b>Free Inodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of free inodes present in the file system. This value is only valid if TotalSlots is non-zero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free Inodes</em>' attribute.
	 * @see #setFreeInodes(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixLocalFileSystem_FreeInodes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"MIF.DMTF|Host File System|001.12\"]' ModelCorrespondence='[\"CIM_UnixLocalFileSystem.TotalInodes\"]'"
	 * @generated
	 */
	Long getFreeInodes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixLocalFileSystem#getFreeInodes <em>Free Inodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Inodes</em>' attribute.
	 * @see #getFreeInodes()
	 * @generated
	 */
	void setFreeInodes(Long value);

	/**
	 * Returns the value of the '<em><b>Total Inodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total number of inodes available in the file system. A value of zero for TotalInodes indicates that this file system does not have a preset limit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Inodes</em>' attribute.
	 * @see #setTotalInodes(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixLocalFileSystem_TotalInodes()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"MIF.DMTF|Host File System|001.11\"]'"
	 * @generated
	 */
	Long getTotalInodes();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixLocalFileSystem#getTotalInodes <em>Total Inodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Inodes</em>' attribute.
	 * @see #getTotalInodes()
	 * @generated
	 */
	void setTotalInodes(Long value);

	/**
	 * Returns the value of the '<em><b>FS Reserved Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reserve data capacity of the file system in bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FS Reserved Capacity</em>' attribute.
	 * @see #setFSReservedCapacity(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_UnixLocalFileSystem_FSReservedCapacity()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' MappingStrings='[\"MIF.DMTF|Host File System|001.15\"]' PUnit='byte'"
	 * @generated
	 */
	Long getFSReservedCapacity();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UnixLocalFileSystem#getFSReservedCapacity <em>FS Reserved Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FS Reserved Capacity</em>' attribute.
	 * @see #getFSReservedCapacity()
	 * @generated
	 */
	void setFSReservedCapacity(Long value);

} // CIM_UnixLocalFileSystem

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
 * A representation of the model object '<em><b>CIM Logical Disk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A LogicalDisk is a presentation of a contiguous range of logical blocks that is identifiable by applications such as filesystems via the Name field. (DeviceID (key) may use the same name or some other unique text such as a UUID.) For example in a Windows environment, the Name field may contain a drive letter. In a Unix environment, it may contain the access path (for example, '/dev/...'); and in a NetWare environment, may contain the volume name. LogicalDisks are typically built on a DiskPartition or other LogicalDisks (for instance, those exposed by a software volume manager). However, it can be based on other StorageExtents, like CIM_Memory, in the case of a RAM disk. 
 * 
 * LogicalDisks SHOULD set the 'Exported' value in ExtentStatus[] if they are intended for application use.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDisk#getNumExtentsMigrating <em>Num Extents Migrating</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalDisk#getThinlyProvisioned <em>Thinly Provisioned</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDisk()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageExtents' override.NameFormat='uint16' override.NameFormat.Description='LogicalDisk names shall use OS Device Name format.' override.NameFormat.ValueMap='[\"1\",\"12\"]' override.NameFormat.Values='[\"Other\",\"OS Device Name\"]' override.NameNamespace='uint16' override.NameNamespace.Description='LogicalDisk names shall use OS Device Namespace.' override.NameNamespace.ValueMap='[\"1\",\"8\"]' override.NameNamespace.Values='[\"Other\",\"OS Device Namespace\"]' override.ClientSettableUsage='uint16[]' override.ClientSettableUsage.Description='Indicates which values from the \"Usage\" value map can be manipulated by a client using the method\"StorageConfigurationService.RequestUsageChange\".' override.ClientSettableUsage.ModelCorrespondence='[\"CIM_LogicalDisk.Usage\"]' override.OtherUsageDescription='string' override.OtherUsageDescription.Description='Populated when \"Usage\" has the value of \"Other\".' override.OtherUsageDescription.ModelCorrespondence='[\"CIM_LogicalDisk.Usage\"]' override.Usage='uint16' override.Usage.Description='Indicates the intended usage or any restrictions that may have been imposed on the usage of this component. All ValueMap/Values entries are defined in CIM_StorageExtent. To promote interoperability across subclasses, all new entries for this class shall be defined there.' override.Usage.ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"..\",\"32768..65535\"]' override.Usage.Values='[\"Other\",\"Unrestricted\",\"Reserved for ComputerSystem (the block server)\",\"Reserved by Replication Services\",\"Reserved by Migration Services\",\"Local Replica Source\",\"Remote Replica Source\",\"Local Replica Target\",\"Remote Replica Target\",\"Local Replica Source or Target\",\"Remote Replica Source or Target\",\"Delta Replica Target\",\"Element Component\",\"Reserved to be Unrestricted Pool Contributor\",\"Composite Volume Member\",\"Composite LogicalDisk Member\",\"Reserved for Sparing\",\"In use as Unrestricted Pool Contributor\",\"Reserved to be Delta Replica Pool Contributor\",\"Reserved to be Local Replication Pool Contributor\",\"Reserved to be Remote Replication Pool Contributor\",\"In use as Delta Replica Pool Contributor\",\"In use as Local Replication Pool Contributor\",\"In use as Remote Replication Pool Contributor\",\"DMTF Reserved\",\"Vendor Reserved\"]' override.Usage.ModelCorrespondence='[\"CIM_LogicalDisk.OtherUsageDescription\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalDisk extends CIM_StorageExtent {
	/**
	 * Returns the value of the '<em><b>Num Extents Migrating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of Extents in the process of migrating for this logical disk when the logical disk relocation is on going.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Extents Migrating</em>' attribute.
	 * @see #setNumExtentsMigrating(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDisk_NumExtentsMigrating()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getNumExtentsMigrating();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDisk#getNumExtentsMigrating <em>Num Extents Migrating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Extents Migrating</em>' attribute.
	 * @see #getNumExtentsMigrating()
	 * @generated
	 */
	void setNumExtentsMigrating(Long value);

	/**
	 * Returns the value of the '<em><b>Thinly Provisioned</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the logical disk is thinly provisioned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thinly Provisioned</em>' attribute.
	 * @see #setThinlyProvisioned(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalDisk_ThinlyProvisioned()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getThinlyProvisioned();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalDisk#getThinlyProvisioned <em>Thinly Provisioned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thinly Provisioned</em>' attribute.
	 * @see #getThinlyProvisioned()
	 * @generated
	 */
	void setThinlyProvisioned(Boolean value);

} // CIM_LogicalDisk

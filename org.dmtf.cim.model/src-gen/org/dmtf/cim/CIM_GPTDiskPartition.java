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
 * A representation of the model object '<em><b>CIM GPT Disk Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * GPT is a newer partitioning style that supports volumes larger than the 2 terabyte max of other partition styles. GPT in general is associated with PC X86 architectures, but GPT partitions are OS and platform independent. GPT uses 16 byte GUIDs (Globally Unique IDs) for certain properties. The DeviceId property inherited from LogicalDevice should be a GUID for GPTDiskPartitions; this string property should be formatted as a 32 character string with two text bytes representing each binary byte. GPT specifications call for a Protective MBR table (PMBR) in block 0 followed by an GPT (GUID Partition Table). The MBR must describe a single active partition - the GPT Partition that occupies the rest of the disk. The user only sees the GPT style partitions in this second MBR partition. This could be modelled as two tiers, but since the specification requires this precise behavior with no management at the MBR level, only the GPT style partitions are exposed through the CIM model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_GPTDiskPartition#getPartitionType <em>Partition Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_GPTDiskPartition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageExtents' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_GPTDiskPartition extends CIM_GenericDiskPartition {
	/**
	 * Returns the value of the '<em><b>Partition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PartitionType as defined in the GPT specs and platform specific documentation - GUID format. This string property SHALL be formatted with two text bytes representing each binary byte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Partition Type</em>' attribute.
	 * @see #setPartitionType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_GPTDiskPartition_PartitionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPartitionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_GPTDiskPartition#getPartitionType <em>Partition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Type</em>' attribute.
	 * @see #getPartitionType()
	 * @generated
	 */
	void setPartitionType(String value);

} // CIM_GPTDiskPartition

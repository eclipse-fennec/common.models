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
 * A representation of the model object '<em><b>CIM Disk Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DiskPartition is a subclass of GenericDiskPartition for MBR (Master Boot Record) style partitions used in X86 platforms such as Windows and Linux.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiskPartition#getPrimaryPartition <em>Primary Partition</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskPartition#getPartitionType <em>Partition Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiskPartition#getPartitionSubtype <em>Partition Subtype</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartition()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageExtents' override.NameFormat='uint16' override.NameFormat.Description='DiskPartition names MUST use OS Device Name format. In cases where the partition names can not be used by applications programmatically (for example, open()) the NameFormat SHOULD be \'Other\'.' override.NameFormat.ValueMap='[\"1\",\"12\"]' override.NameFormat.Values='[\"Other\",\"OS Device Name\"]' override.NameFormat.ModelCorrespondence='[\"CIM_StorageExtent.Name\",\"CIM_StorageExtent.NameNamespace\",\"CIM_StorageExtent.OtherNameFormat\"]' override.NameNamespace='uint16' override.NameNamespace.Description='DiskPartition names MUST use OS Device Namespace.' override.NameNamespace.ValueMap='[\"1\",\"8\"]' override.NameNamespace.Values='[\"Other\",\"OS Device Namespace\"]' override.NameNamespace.MappingStrings='[\"SPC.INCITS-T10| VPD 83, Association 0 | Identifier\"]' override.NameNamespace.ModelCorrespondence='[\"CIM_StorageExtent.Name\",\"CIM_StorageExtent.OtherNameNamespace\",\"CIM_StorageExtent.NameFormat\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_DiskPartition extends CIM_GenericDiskPartition {
	/**
	 * Returns the value of the '<em><b>Primary Partition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the DiskPartition is labelled as the primary partition for a ComputerSystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Partition</em>' attribute.
	 * @see #setPrimaryPartition(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartition_PrimaryPartition()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getPrimaryPartition();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskPartition#getPrimaryPartition <em>Primary Partition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Partition</em>' attribute.
	 * @see #getPrimaryPartition()
	 * @generated
	 */
	void setPrimaryPartition(Boolean value);

	/**
	 * Returns the value of the '<em><b>Partition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of Partition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Partition Type</em>' attribute.
	 * @see #setPartitionType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartition_PartitionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Unknown\",\"Primary\",\"Extended\",\"Logical\"]'"
	 * @generated
	 */
	Integer getPartitionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskPartition#getPartitionType <em>Partition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Type</em>' attribute.
	 * @see #getPartitionType()
	 * @generated
	 */
	void setPartitionType(Integer value);

	/**
	 * Returns the value of the '<em><b>Partition Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The 'sub' type of a primary, extended, or logical Partition. The list of possible values corresponds to the decimal representation of the typical values in the Partition record.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Partition Subtype</em>' attribute.
	 * @see #setPartitionSubtype(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiskPartition_PartitionSubtype()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"14\",\"15\",\"16\",\"17\",\"18\",\"20\",\"22\",\"23\",\"27\",\"28\",\"33\",\"35\",\"36\",\"38\",\"49\",\"51\",\"52\",\"53\",\"54\",\"55\",\"60\",\"64\",\"65\",\"66\",\"67\",\"80\",\"81\",\"82\",\"83\",\"84\",\"85\",\"86\",\"97\",\"99\",\"100\",\"101\",\"102\",\"103\",\"104\",\"105\",\"113\",\"115\",\"116\",\"117\",\"118\",\"119\",\"120\",\"121\",\"128\",\"129\",\"130\",\"131\",\"132\",\"134\",\"135\",\"147\",\"148\",\"161\",\"163\",\"164\",\"165\",\"166\",\"177\",\"179\",\"180\",\"182\",\"183\",\"184\",\"193\",\"196\",\"198\",\"199\",\"216\",\"219\",\"225\",\"227\",\"228\",\"229\",\"230\",\"239\",\"240\",\"241\",\"242\",\"243\",\"244\",\"246\",\"254\",\"255\",\"65535\"]' Values='[\"Empty | Microsoft\",\"DOS 12-bit FAT\",\"XENIX root\",\"XENIX usr\",\"DOS 16-bit FAT\",\"DOS Extended\",\"DOS 16-bit FAT (&gt; 32MB)\",\"OS/2 HPFS | Win NTFS | QNX Ver 2 | Adv UNIX\",\"AIX Boot | OS /2 | Dell (Array) | Commodore DOS\",\"AIX Data, Coherent\",\"OS/2 Boot Manager\",\"32-bit FAT\",\"32-bit FAT\",\"Microsoft 16-bit FAT\",\"Microsoft DOS Extended\",\"OPUS | OS/2 2.0\",\"OS/2 (MOSS) Inactive Type 1\",\"Compaq Diagnostics Partition | Microsoft\",\"OS/2 (MOSS) Inactive Type 4\",\"OS/2 (MOSS) Inactive Type 6\",\"OS/2 (MOSS) Inactive Type 7\",\"OS/2 (MOSS) Inactive Type B\",\"OS/2 (MOSS) Inactive Type C\",\"Microsoft\",\"Microsoft\",\"Microsoft\",\"Microsoft\",\"Microsoft\",\"Microsoft\",\"Microsoft\",\"OS/2 Logical Volume Manager\",\"Microsoft\",\"OS/2 JFS Log\",\"PowerQuest\",\"VENIX 80286 | Series/1 Disk\",\"Personal RISC Boot\",\"Veritas\",\"Veritas\",\"OnTrack Disk Manager Read Only DOS\",\"OnTrack Disk Manager Read/Write DOS\",\"CPM | Microport System V/386 | OnTrack Disk Mgr | Microsoft\",\"OnTrack Disk Manager\",\"OnTrack Disk Manager Non-DOS\",\"Micro House EZ-Drive Non-DOS\",\"Golden Bow Vfeature | Microsoft\",\"Storage Dimensions SpeedStor | Microsoft\",\"UNIX - AT&amp;T System V/386 | SCO UNIX\",\"Novell NetWare | Speedstore\",\"Novell NetWare\",\"Novell NetWare\",\"Novell\",\"Novell\",\"Novell\",\"Microsoft\",\"Microsoft\",\"Microsoft\",\"PC/IX IBM\",\"Microsoft\",\"QNX POSIX\",\"QNX POSIX (Secondary)\",\"QNX POSIX (Secondary)\",\"Minix (&lt;=1.4a) | Linux | Microsoft\",\"Minix (&gt;=1.4b) | Microsoft\",\"Linux Swap | Prime\",\"Linux Native | Apple\",\"System Hibernation for APM\",\"Microsoft\",\"HPFS FT mirror\",\"Amoeba | Microsoft\",\"Amoeba BBT | Microsoft\",\"Microsoft\",\"Microsoft\",\"Microsoft\",\"BSD/386\",\"Microsoft\",\"Microsoft\",\"Microsoft\",\"Microsoft\",\"Microsoft\",\"BSDI fs | Microsoft\",\"BSDI Swap | Microsoft\",\"Microsoft\",\"Microsoft\",\"Microsoft\",\"Syrinx | HPFS FT Disabled Mirror\",\"CP/M 86\",\"Digital Research CPM-86 | Concurrent DOS | OUTRIGGER\",\"SpeedStor 12-bit FAT Extended\",\"DOS Read-Only | Storage Dimensions\",\"SpeedStor 16-bit FAT Extended\",\"Microsoft\",\"Microsoft\",\"Intel\",\"OS/2 Raw Data\",\"Storage Dimensions\",\"DOS (Secondary)\",\"Microsoft\",\"SpeedStor Large | Storage Dimensions\",\"Microsoft\",\"Lan Step | SpeedStor | IBM PS/2 IML\",\"Bad Block Tables\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getPartitionSubtype();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiskPartition#getPartitionSubtype <em>Partition Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Subtype</em>' attribute.
	 * @see #getPartitionSubtype()
	 * @generated
	 */
	void setPartitionSubtype(Integer value);

} // CIM_DiskPartition

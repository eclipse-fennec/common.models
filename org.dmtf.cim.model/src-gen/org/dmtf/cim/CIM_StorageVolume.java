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
 * A representation of the model object '<em><b>CIM Storage Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StorageVolume is a StorageExtent that is published for use outside of the scoping System. For SCSI storage target devices, StorageVolumes are used to represent target Block devices, (peripheral device type codes 0h (i.e, direct-access), 4h (i.e., write-once), 5h (i.e., CD/DVD), 7h (i.e., optical memory), and Eh (i.e., simplified direct-access).); 
 * Stream devices, (peripheral device type codes 1h (i.e., 
 * sequential-access) and 3h (i.e., processor).). 
 * In these case, StorageVolume.Name will be derived from SCSI volume as documented in StorageExtent.Nameformat and NameNamespace Descriptions. 
 * 
 * The 'Exported' value from StorageExtent.ExtentStatus[] MUST be in all instances of StorageVolume to maintain the semantic of 'published' described above.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageVolume#getCUImage <em>CU Image</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageVolume#getCanDelete <em>Can Delete</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageVolume#getEmulatedDevice <em>Emulated Device</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageVolume#getExtentType <em>Extent Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageVolume#getNumExtentsMigrating <em>Num Extents Migrating</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageVolume#getRelativePerformanceOrder <em>Relative Performance Order</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageVolume#getRelativePerformanceOrderSet <em>Relative Performance Order Set</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageVolume#getStorageTieringSelection <em>Storage Tiering Selection</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageVolume#getSubsystemID <em>Subsystem ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageVolume#getThinlyProvisioned <em>Thinly Provisioned</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageVolume()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageExtents' override.Name='string' override.Name.Description='A unique identifier for the Volume.' override.Name.MappingStrings='[\"ANSI|T10|SCSI SPC-3|8.6\"]' override.Name.ModelCorrespondence='[\"CIM_StorageVolume.NameFormat\"]' override.NameFormat='uint16' override.NameFormat.Description='A subset of StorageExtent name formats apply to StorageVolumes.' override.NameFormat.ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' override.NameFormat.Values='[\"Unknown\",\"Other\",\"VPD83NAA6\",\"VPD83NAA5\",\"VPD83Type2\",\"VPD83Type1\",\"VPD83Type0\",\"SNVM\",\"NodeWWN\",\"NAA\",\"EUI64\",\"T10VID\"]' override.NameNamespace='uint16' override.NameNamespace.Description='A subset of StorageExtent name spaces apply to StorageVolume.' override.NameNamespace.ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' override.NameNamespace.Values='[\"Unknown\",\"Other\",\"VPD83Type3\",\"VPD83Type2\",\"VPD83Type1\",\"VPD80\",\"NodeWWN\",\"SNVM\"]' override.ClientSettableUsage='uint16[]' override.ClientSettableUsage.Description='Indicates which values from the \"Usage\" valuemapcan be manipulated by a client using the method\"StorageConfigurationService.RequestUsageChange\".' override.ClientSettableUsage.ModelCorrespondence='[\"CIM_StorageVolume.Usage\"]' override.OtherUsageDescription='string' override.OtherUsageDescription.Description='Populated when \"Usage\" has the value of \"Other\".' override.OtherUsageDescription.ModelCorrespondence='[\"CIM_StorageVolume.Usage\"]' override.Usage='uint16' override.Usage.Description='Indicates the intended usage or any restrictions that may have been imposed on the usage of this component. All ValueMap/Values entries are defined in CIM_StorageExtent. To promote interoperability across subclasses, all new entries for this class shall be defined there.' override.Usage.ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"..\",\"32768..65535\"]' override.Usage.Values='[\"Other\",\"Unrestricted\",\"Reserved for ComputerSystem (the block server)\",\"Reserved by Replication Services\",\"Reserved by Migration Services\",\"Local Replica Source\",\"Remote Replica Source\",\"Local Replica Target\",\"Remote Replica Target\",\"Local Replica Source or Target\",\"Remote Replica Source or Target\",\"Delta Replica Target\",\"Element Component\",\"Reserved to be Unrestricted Pool Contributor\",\"Composite Volume Member\",\"Composite LogicalDisk Member\",\"Reserved for Sparing\",\"In use as Unrestricted Pool Contributor\",\"Reserved to be Delta Replica Pool Contributor\",\"Reserved to be Local Replication Pool Contributor\",\"Reserved to be Remote Replication Pool Contributor\",\"In use as Delta Replica Pool Contributor\",\"In use as Local Replication Pool Contributor\",\"In use as Remote Replication Pool Contributor\",\"DMTF Reserved\",\"Vendor Reserved\"]' override.Usage.ModelCorrespondence='[\"CIM_StorageVolume.OtherUsageDescription\"]' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageVolume extends CIM_StorageExtent {
	/**
	 * Returns the value of the '<em><b>CU Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is the Node Element Descriptor of the Control Unit Image (this property is required for CKD StorageVolumes).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CU Image</em>' attribute.
	 * @see #setCUImage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageVolume_CUImage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCUImage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageVolume#getCUImage <em>CU Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CU Image</em>' attribute.
	 * @see #getCUImage()
	 * @generated
	 */
	void setCUImage(String value);

	/**
	 * Returns the value of the '<em><b>Can Delete</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the volume is able to be deleted by a client application. True means the volume may be deleted by a client application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Can Delete</em>' attribute.
	 * @see #setCanDelete(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageVolume_CanDelete()
	 * @model default="true"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getCanDelete();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageVolume#getCanDelete <em>Can Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Delete</em>' attribute.
	 * @see #getCanDelete()
	 * @generated
	 */
	void setCanDelete(Boolean value);

	/**
	 * Returns the value of the '<em><b>Emulated Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the specific device (e.g., 3380 or 3390) that is emulated by the volume.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Emulated Device</em>' attribute.
	 * @see #setEmulatedDevice(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageVolume_EmulatedDevice()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getEmulatedDevice();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageVolume#getEmulatedDevice <em>Emulated Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emulated Device</em>' attribute.
	 * @see #getEmulatedDevice()
	 * @generated
	 */
	void setEmulatedDevice(String value);

	/**
	 * Returns the value of the '<em><b>Extent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExtentType property specifies extent type for host access.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extent Type</em>' attribute.
	 * @see #setExtentType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageVolume_ExtentType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Open\",\"Intermediate\",\"Mainframe\"]'"
	 * @generated
	 */
	Integer getExtentType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageVolume#getExtentType <em>Extent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent Type</em>' attribute.
	 * @see #getExtentType()
	 * @generated
	 */
	void setExtentType(Integer value);

	/**
	 * Returns the value of the '<em><b>Num Extents Migrating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of extents in the process of migrating for this storage volume when the volume relocation is on going.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Extents Migrating</em>' attribute.
	 * @see #setNumExtentsMigrating(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageVolume_NumExtentsMigrating()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getNumExtentsMigrating();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageVolume#getNumExtentsMigrating <em>Num Extents Migrating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Extents Migrating</em>' attribute.
	 * @see #getNumExtentsMigrating()
	 * @generated
	 */
	void setNumExtentsMigrating(Long value);

	/**
	 * Returns the value of the '<em><b>Relative Performance Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A storage volume can be associated with one or more storage tiers with equal or smaller StorageTier.RelativePerformanceOrder. The smaller the RelativePerformanceOrder, the more "performant" the tier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Performance Order</em>' attribute.
	 * @see #setRelativePerformanceOrder(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageVolume_RelativePerformanceOrder()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StorageTier.RelativePerformanceOrder\"]'"
	 * @generated
	 */
	Integer getRelativePerformanceOrder();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageVolume#getRelativePerformanceOrder <em>Relative Performance Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Performance Order</em>' attribute.
	 * @see #getRelativePerformanceOrder()
	 * @generated
	 */
	void setRelativePerformanceOrder(Integer value);

	/**
	 * Returns the value of the '<em><b>Relative Performance Order Set</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of RelativePerformanceOrder values. The volume can only be associated with storage tiers that have a RelativePerformanceOrder value included in this set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Performance Order Set</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageVolume_RelativePerformanceOrderSet()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StorageTier.RelativePerformanceOrder\"]'"
	 * @generated
	 */
	EList<Integer> getRelativePerformanceOrderSet();

	/**
	 * Returns the value of the '<em><b>Storage Tiering Selection</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Storage tiering examines this property to determine whether to use RelativePerformanceOrder or RelativePerformanceOrderSet for selecting an appropriate storage tier. A value of 0 or null indicates the associated element is not subject to storage tiering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Tiering Selection</em>' attribute.
	 * @see #setStorageTieringSelection(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageVolume_StorageTieringSelection()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Use RelativePerformanceOrder\",\"Use RelativePerformanceOrderSet\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageVolume.RelativePerformanceOrder\",\"CIM_StorageVolume.RelativePerformanceOrderSet\"]'"
	 * @generated
	 */
	Integer getStorageTieringSelection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageVolume#getStorageTieringSelection <em>Storage Tiering Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Tiering Selection</em>' attribute.
	 * @see #getStorageTieringSelection()
	 * @generated
	 */
	void setStorageTieringSelection(Integer value);

	/**
	 * Returns the value of the '<em><b>Subsystem ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is the Subsystem ID if the array or virtualizer supports Subsystem IDs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subsystem ID</em>' attribute.
	 * @see #setSubsystemID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageVolume_SubsystemID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSubsystemID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageVolume#getSubsystemID <em>Subsystem ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsystem ID</em>' attribute.
	 * @see #getSubsystemID()
	 * @generated
	 */
	void setSubsystemID(String value);

	/**
	 * Returns the value of the '<em><b>Thinly Provisioned</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if the volume is thinly provisioned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thinly Provisioned</em>' attribute.
	 * @see #setThinlyProvisioned(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageVolume_ThinlyProvisioned()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getThinlyProvisioned();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageVolume#getThinlyProvisioned <em>Thinly Provisioned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thinly Provisioned</em>' attribute.
	 * @see #getThinlyProvisioned()
	 * @generated
	 */
	void setThinlyProvisioned(Boolean value);

} // CIM_StorageVolume

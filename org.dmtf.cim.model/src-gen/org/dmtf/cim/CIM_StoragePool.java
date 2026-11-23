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
 * A representation of the model object '<em><b>CIM Storage Pool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A StoragePool is a conglomeration of storage capacity for the purpose of assignment and allocation based on service characteristics, such as location, available space or other criteria (for example, cost per megabyte or hardware ownership). A StoragePool is managed within the scope of a particular System. StoragePools may consist of component StoragePools or StorageExtents. StorageExtents that belong to the StoragePool have a Component relationship to the StoragePool. StorageExtents/StoragePools that are elements of a pool have their available space aggregated into the pool. StoragePools, StorageVolumes and LogicalDisks may be created from StoragePools. This is indicated by the AllocatedFromStoragePool association. StoragePool is scoped to a system by the HostedStoragePool association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StoragePool#getTotalManagedSpace <em>Total Managed Space</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePool#getRemainingManagedSpace <em>Remaining Managed Space</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePool#getCapacityInMigratingSource <em>Capacity In Migrating Source</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePool#getCapacityInMigratingTarget <em>Capacity In Migrating Target</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePool#getClientSettableUsage <em>Client Settable Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePool#getElementsShareSpace <em>Elements Share Space</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePool#getLowSpaceWarningThreshold <em>Low Space Warning Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePool#getOtherUsageDescription <em>Other Usage Description</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePool#getReservedSpace <em>Reserved Space</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePool#getSpaceLimit <em>Space Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePool#getSpaceLimitDetermination <em>Space Limit Determination</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePool#getThinProvisionMetaDataSpace <em>Thin Provision Meta Data Space</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StoragePool#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StoragePool()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.49.0' UMLPackagePath='CIM::Device::StorageServices' override.InstanceID='string' override.InstanceID.Key='true' override.InstanceID.Description='Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following \'preferred\' algorithm: \n&lt;OrgID&gt;:&lt;LocalID&gt; \nWhere &lt;OrgID&gt; and &lt;LocalID&gt; are separated by a colon \':\', and where &lt;OrgID&gt; MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the &lt;Schema Name&gt;_&lt;Class Name&gt; structure of Schema class names.) In addition, to ensure uniqueness &lt;OrgID&gt; MUST NOT contain a colon (\':\'). When using this algorithm, the first colon to appear in InstanceID MUST appear between &lt;OrgID&gt; and &lt;LocalID&gt;. \n&lt;LocalID&gt; is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above \'preferred\' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance\'s NameSpace. \nFor DMTF defined instances, the \'preferred\' algorithm MUST be used with the &lt;OrgID&gt; set to \'CIM\'.' override.PoolID='string' override.PoolID.Required='true' override.PoolID.Description='A unique name in the context of the System that identifies this pool.' override.PoolID.MaxLen='256' override.PoolID.ModelCorrespondence='[\"CIM_ResourceAllocationSettingData.PoolId\"]' override.Primordial='boolean' override.Primordial.Description='If true, \"Primordial\" indicates that this StoragePool is the base from which storage capacity is drawn and returned in the activity of storage management. Being primordial means that this StoragePool shall not be created or deleted by consumers of this model. However, other actions, modeled or not, may affect the characteristics or size of primordial StoragePools. If false, \"Primordial\" indicated that the StoragePool, a concrete Storage Pool, is subject to storage services functions. This distinction is important because higher-level StoragePools may be assembled using the Component or AllocatedFromStoragePool associations. Although the higher-level abstractions can be created and deleted, the most basic, (i.e. primordial), hardware-based StoragePools cannot. They are physically realized as part of the System, or are actually managed by some other System and imported as if they were physically realized.' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StoragePool extends CIM_ResourcePool {
	/**
	 * Returns the value of the '<em><b>Total Managed Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total amount of capacity usable for the allocation of StorageVolumes, LogicalDisks, or child Storage Pools. 
	 * For primordial Storage Pools, this capacity reflects the usable capacity of Disk Drives or LUNs, for example, to the owning storage device or application. For example, in storage array, a primordial Storage Pool's TotalManagedSpace does not include metadata such as the disk label area and absolute disk drive capacity lost in disk formatting. 
	 * For concrete Storage Pools, the same applies, but the metadata not included in TotalManagedSpace is consumed in virtualization like RAID and concatenation. Concrete Storage Pool may also be simple reserve of capacity. In such a case, no capacity may be lost in formation of the Storage Pool. 
	 * Conceptually TotalManagedSpace is the sum of all storage known via AssociatedComponentExtent associations to underlying StorageExtents. However, note some of these underlying storage may not be modeled by the instrumentation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Managed Space</em>' attribute.
	 * @see #setTotalManagedSpace(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePool_TotalManagedSpace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' ModelCorrespondence='[\"CIM_StoragePool.RemainingManagedSpace\"]' PUnit='byte'"
	 * @generated
	 */
	Long getTotalManagedSpace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePool#getTotalManagedSpace <em>Total Managed Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Managed Space</em>' attribute.
	 * @see #getTotalManagedSpace()
	 * @generated
	 */
	void setTotalManagedSpace(Long value);

	/**
	 * Returns the value of the '<em><b>Remaining Managed Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The remaining usable capacity after the allocation of StorageVolumes, LogicalDisks, or child Storage Pools. This property is maintained here to provide efficient access to this information. However, note that it is possible to compute RemainingManagedSpace as (TotalManagedSpace minus the sum of SpaceConsumed from all of the AllocatedFromStoragePool references from this StoragePool). Note that SpaceConsumed remains useful to determine the amount of capacity consumed by a particular allocated element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Managed Space</em>' attribute.
	 * @see #setRemainingManagedSpace(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePool_RemainingManagedSpace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Required='true' Units='Bytes' ModelCorrespondence='[\"CIM_StoragePool.TotalManagedSpace\",\"CIM_AllocatedFromStoragePool.SpaceConsumed\"]' PUnit='byte'"
	 * @generated
	 */
	Long getRemainingManagedSpace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePool#getRemainingManagedSpace <em>Remaining Managed Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Managed Space</em>' attribute.
	 * @see #getRemainingManagedSpace()
	 * @generated
	 */
	void setRemainingManagedSpace(Long value);

	/**
	 * Returns the value of the '<em><b>Capacity In Migrating Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total capacity of extents in migrating out from this storage pool
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capacity In Migrating Source</em>' attribute.
	 * @see #setCapacityInMigratingSource(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePool_CapacityInMigratingSource()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes'"
	 * @generated
	 */
	Long getCapacityInMigratingSource();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePool#getCapacityInMigratingSource <em>Capacity In Migrating Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity In Migrating Source</em>' attribute.
	 * @see #getCapacityInMigratingSource()
	 * @generated
	 */
	void setCapacityInMigratingSource(Long value);

	/**
	 * Returns the value of the '<em><b>Capacity In Migrating Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total capacity of extents in migrating into this storage pool
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capacity In Migrating Target</em>' attribute.
	 * @see #setCapacityInMigratingTarget(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePool_CapacityInMigratingTarget()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes'"
	 * @generated
	 */
	Long getCapacityInMigratingTarget();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePool#getCapacityInMigratingTarget <em>Capacity In Migrating Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity In Migrating Target</em>' attribute.
	 * @see #getCapacityInMigratingTarget()
	 * @generated
	 */
	void setCapacityInMigratingTarget(Long value);

	/**
	 * Returns the value of the '<em><b>Client Settable Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates which values from the "Usage" valuemap can be manipulated by a client using the method "StorageConfigurationService.RequestUsageChange".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Settable Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePool_ClientSettableUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ModelCorrespondence='[\"CIM_StoragePool.Usage\"]'"
	 * @generated
	 */
	EList<Integer> getClientSettableUsage();

	/**
	 * Returns the value of the '<em><b>Elements Share Space</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, it indicates elements allocated from the storage pool are sharing space from the storage pool. For example, multiple snapshots "allocated" from a storage pool, point to the same blocks of the storage pool. As another example, elements utilizing de-duplication technology refer to a shared copy of the data stored in the storage pool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements Share Space</em>' attribute.
	 * @see #setElementsShareSpace(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePool_ElementsShareSpace()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getElementsShareSpace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePool#getElementsShareSpace <em>Elements Share Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements Share Space</em>' attribute.
	 * @see #getElementsShareSpace()
	 * @generated
	 */
	void setElementsShareSpace(Boolean value);

	/**
	 * Returns the value of the '<em><b>Low Space Warning Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LowSpaceWarningThreshold simplifies the creation of a pool specific Indication based on RemainingManagedSpace <= 
	 * (TotalManagedSpace*LowSpaceWarningThreshold)/100. One example client for an Indication based on this property is a delta copy implementation where the pool enables continuous, variable space consumption for the delta storage. Another example client for an Indication based on this property is a provisioning manager implementing a policy for adding storage to a pool when it becomes low.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Low Space Warning Threshold</em>' attribute.
	 * @see #setLowSpaceWarningThreshold(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePool_LowSpaceWarningThreshold()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Units='Percentage' MinValue='0' MaxValue='100' ModelCorrespondence='[\"CIM_StoragePool.RemainingManagedSpace\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getLowSpaceWarningThreshold();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePool#getLowSpaceWarningThreshold <em>Low Space Warning Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Space Warning Threshold</em>' attribute.
	 * @see #getLowSpaceWarningThreshold()
	 * @generated
	 */
	void setLowSpaceWarningThreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Usage Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Populated when "Usage" has the value of "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Usage Description</em>' attribute.
	 * @see #setOtherUsageDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePool_OtherUsageDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_StoragePool.Usage\"]'"
	 * @generated
	 */
	String getOtherUsageDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePool#getOtherUsageDescription <em>Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Usage Description</em>' attribute.
	 * @see #getOtherUsageDescription()
	 * @generated
	 */
	void setOtherUsageDescription(String value);

	/**
	 * Returns the value of the '<em><b>Reserved Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of capacity used by the storage pool to store information about the configuration of the storage pool. The space is not included in the TotalManagedSpace of the storage pool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved Space</em>' attribute.
	 * @see #setReservedSpace(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePool_ReservedSpace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' ModelCorrespondence='[\"CIM_StoragePool.TotalManagedSpace\"]' PUnit='byte'"
	 * @generated
	 */
	Long getReservedSpace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePool#getReservedSpace <em>Reserved Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Space</em>' attribute.
	 * @see #getReservedSpace()
	 * @generated
	 */
	void setReservedSpace(Long value);

	/**
	 * Returns the value of the '<em><b>Space Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The capacity of the storage allocated to the pool when SpaceLimitDetermination has the value 3 (Quota) or 4 (Limitless) or is set to the value of TotalManagedSpace if SpaceLimitDetermination has the value 2 (Allocated).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Space Limit</em>' attribute.
	 * @see #setSpaceLimit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePool_SpaceLimit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getSpaceLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePool#getSpaceLimit <em>Space Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Limit</em>' attribute.
	 * @see #getSpaceLimit()
	 * @generated
	 */
	void setSpaceLimit(Long value);

	/**
	 * Returns the value of the '<em><b>Space Limit Determination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is the Subsystem ID if the array or virtualizer supports Subsystem IDs. If they are supported they would be required on volume creation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Space Limit Determination</em>' attribute.
	 * @see #setSpaceLimitDetermination(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePool_SpaceLimitDetermination()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Allocated\",\"Quote\",\"Limitless\"]'"
	 * @generated
	 */
	Integer getSpaceLimitDetermination();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePool#getSpaceLimitDetermination <em>Space Limit Determination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Limit Determination</em>' attribute.
	 * @see #getSpaceLimitDetermination()
	 * @generated
	 */
	void setSpaceLimitDetermination(Integer value);

	/**
	 * Returns the value of the '<em><b>Thin Provision Meta Data Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size of metadata consumed by this storage pool. Only defined if the pool is thin provisioned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thin Provision Meta Data Space</em>' attribute.
	 * @see #setThinProvisionMetaDataSpace(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePool_ThinProvisionMetaDataSpace()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Units='Bytes' PUnit='byte'"
	 * @generated
	 */
	Long getThinProvisionMetaDataSpace();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePool#getThinProvisionMetaDataSpace <em>Thin Provision Meta Data Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thin Provision Meta Data Space</em>' attribute.
	 * @see #getThinProvisionMetaDataSpace()
	 * @generated
	 */
	void setThinProvisionMetaDataSpace(Long value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the intended usage or any restrictions that may have been imposed on the usage of this component. For example, a storage pool may be reserved for use by the block server. In that case the Usage of the storage pool is marked as "Reserved for the ComputerSystem". In the case of "Other", see OtherUsageDescription for more information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StoragePool_Usage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Unrestricted\",\"Reserved for ComputerSystem (the block server)\",\"Reserved as a Delta Replica Container\",\"Reserved for Migration Services\",\"Reserved for Local Replication Services\",\"Reserved for Remote Replication Services\",\"Reserved for Sparing\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_StoragePool.OtherUsageDescription\"]'"
	 * @generated
	 */
	Integer getUsage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StoragePool#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For pools that that support a range of sizes for volume or pool creation, this method can be used to retrieve the supported range. Note that different pool implementations may support either or both the GetSupportedSizes and GetSupportedSizeRanges methods at different times, depending on Pool configuration. Also note that the advertised sizes may change after the call due to requests from other clients. If the pool currently only supports discrete sizes, then the return value will be set to 1.
	 * @param ElementType The type of element for which supported sizes are reported. The Thin Provision values are only supported when the Thin Provisioning Profile is supported; the resulting StorageVolume/LogicalDisk shall have ThinlyProvisioned set to true.
	 * @param Goal The StorageSetting for which supported sizes should be reported for.
	 * @param Sizes List of supported sizes for a Volume/Pool creation or modification.
	 * <!-- end-model-doc -->
	 * @model ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Storage Pool\",\"Storage Volume\",\"Logical Disk\",\"Thin Provisioned Volume\",\"Thin Provisioned Logical Disk\"]'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageSetting REF'" SizesUnique="false" SizesMany="true"
	 *        SizesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' Out='true' Units='Bytes' PUnit='byte'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Method completed OK\",\"Method not supported\",\"Use GetSupportedSizeRange instead\",\"Invalid Element Type\"]'"
	 * @generated
	 */
	Long GetSupportedSizes(Integer ElementType, CIM_StorageSetting Goal, EList<Long> Sizes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For pools that that support a range of sizes for volume or pool creation, this method can be used to retrieve the supported range. Note that different pool implementations may support either or both the GetSupportedSizes and GetSupportedSizeRanges methods at different times, depending on Pool configuration. Also note that the advertised sizes may change after the call due to requests from other clients. If the pool currently only supports discrete sizes, then the return value will be set to 1.
	 * @param ElementType The type of element for which supported size ranges are reported. The Thin Provision values are only supported when the Thin Provisioning Profile is supported; the resulting StorageVolume/LogicalDisk shall have ThinlyProvisioned set to true.
	 * @param Goal The StorageSetting for which supported size ranges should be reported for.
	 * @param MinimumVolumeSize The minimum size for a volume/pool in bytes.
	 * @param MaximumVolumeSize The maximum size for a volume/pool in bytes.
	 * @param VolumeSizeDivisor A volume/pool size must be a multiple of this value which is specified in bytes.
	 * <!-- end-model-doc -->
	 * @model ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"Storage Pool\",\"Storage Volume\",\"Logical Disk\",\"Thin Provisioned Volume\",\"Thin Provisioned Logical Disk\"]'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageSetting REF'" MinimumVolumeSizeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Out='true' Units='Bytes' PUnit='byte'" MaximumVolumeSizeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Out='true' Units='Bytes' PUnit='byte'" VolumeSizeDivisorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Out='true' Units='Bytes' PUnit='byte'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"Method completed OK\",\"Method not supported\",\"Use GetSupportedSizes instead\",\"Invalid Element Type\"]'"
	 * @generated
	 */
	Long GetSupportedSizeRange(Integer ElementType, CIM_StorageSetting Goal, Long MinimumVolumeSize, Long MaximumVolumeSize, Long VolumeSizeDivisor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method can be used to retrieve a list of available Extents that may be used in the creation or modification of a StoragePool, StorageVolume, or LogicalDisk. The GetAvailableExtents method MUST return the Extents from the set of Component Extents of the Pool on which the method is being invoked. The returned Extents are available at the time the method returns. There is no guarantee that the same Extents will be available later. This method MUST return the Extents that are not being used as supporting capacity for any other Pools, Volumes, or LogicalDisks that have been allocated from this Pool. The Extent returned MUST be a component Extent of the Pool or subdivisions of a component Extent, the subdivisions themselves represented as Extents.
	 * @param Goal
	 *   The StorageSetting (Goal) for which supported extents should be retrieved as available. 
	 *   If a NULL is passed for the Goal, the method will return all available extents, regardless of the goal. There exists a possibility of error in creating a Pool, Volume, or LogicalDisk retrieved in this manner.
	 * @param AvailableExtents List of references to available StorageExtents, or subclass instances.
	 * <!-- end-model-doc -->
	 * @model GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageSetting REF'" AvailableExtentsUnique="false" AvailableExtentsMany="true"
	 *        AvailableExtentsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4098..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetAvailableExtents(CIM_StorageSetting Goal, EList<CIM_StorageExtent> AvailableExtents);

} // CIM_StoragePool

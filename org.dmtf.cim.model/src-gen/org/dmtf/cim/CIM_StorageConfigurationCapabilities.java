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
 * A representation of the model object '<em><b>CIM Storage Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of Capabilities that defines the Capabilities of a StorageConfigurationService. An instance of StorageConfigurationCapabilities is associated with a StorageConfigurationService using ElementCapabilities. The properties in this class specify the envelope of capabilites for storage configuration in the context of the Service or Pool with which the instance is associated. These properties correspond to the properties of the same base names in StorageSetting and StorageSettingWithHints when either is used as a goal parameter to the StorageConfigurationService methods (CreateOrModifyStoragePool, CreateOrModifyElementFromStoragePool, or CreateOrModifyElementFromElements).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getSupportedStorageElementTypes <em>Supported Storage Element Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getSupportedStoragePoolFeatures <em>Supported Storage Pool Features</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getSupportedStorageElementFeatures <em>Supported Storage Element Features</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getSupportedCopyTypes <em>Supported Copy Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getInitialReplicationState <em>Initial Replication State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getAutomaticPoolSelectionAllowed <em>Automatic Pool Selection Allowed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getClientSettableElementUsage <em>Client Settable Element Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getClientSettablePoolUsage <em>Client Settable Pool Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getMaximumElementCreateCount <em>Maximum Element Create Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getMaximumElementDeleteCount <em>Maximum Element Delete Count</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getMultipleElementCreateFeatures <em>Multiple Element Create Features</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getMultipleElementDeleteFeatures <em>Multiple Element Delete Features</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getSupportedStorageElementUsage <em>Supported Storage Element Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getSupportedStoragePoolUsage <em>Supported Storage Pool Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getThinProvisionedClientSettableReserve <em>Thin Provisioned Client Settable Reserve</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getThinProvisionedDefaultReserve <em>Thin Provisioned Default Reserve</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.49.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageConfigurationCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Asynchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed as asynchronous jobs. If an operation is included in both this and SupportedSynchronousActions then the underlying implementation is indicating that it may or may not create a job. 
	 * 
	 * The following values have been deprecated and replaced by values in StorageReplicationCapabilities. SupportedAsynchronousActions: 
	 * Replica Creation(8) to Local Replica Creation(2) and Remote Replica Creation(3) 
	 * Replica Modification(9) to Local Replica Modification(4), Remote Replica Modification(5) and 
	 * Replica Attachment(10) to Local Replica Attachment(6) and Remote Replica Attachment(7).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Asynchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_SupportedAsynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"..\"]' Values='[\"Storage Pool Creation\",\"Storage Pool Deletion\",\"Storage Pool Modification\",\"Storage Element Creation\",\"Storage Element Return\",\"Storage Element Modification\",\"Replica Creation\",\"Replica Modification\",\"Replica Attachment\",\"SCSI Scan\",\"Storage Element from Element Creation\",\"Storage Element from Element Modification\",\"Element Usage Modification\",\"StoragePool Usage Modification\",\"Storage Resource Affinity Assignment\",\"StorageVolume To StoragePool Relocation\",\"StoragePool To StoragePool Relocation\",\"StorageVolume To StorageExtent Relocation\",\"StoragePool To StorageExtent Relocation\",\"LogicalDisk To StorageExtent Relocation\",\"Multiple Storage Element Creation\",\"Multiple Storage Element Return\",\"Storage Element from Multiple Pools Creation\",\"CompositeVolume Creation\",\"CompositeVolume Return\",\"CompositeVolume Modification\",\"CompositeVolume Dissolve\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_StorageConfigurationCapabilities.SupportedSynchronousActions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAsynchronousActions();

	/**
	 * Returns the value of the '<em><b>Supported Synchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed without the creation of a job. If an operation is included in both this and SupportedAsynchronousActions then the underlying instrumentation is indicating that it may or may not create a job. 
	 * 
	 * The following values have been deprecated and replaced by values in StorageReplicationCapabilities.SupportedSynchronousActions: 
	 * Replica Creation(8) to Local Replica Creation(2) and Remote Replica Creation(3) 
	 * Replica Modification(9) to Local Replica Modification(4), Remote Replica Modification(5) and 
	 * Replica Attachment(10) to Local Replica Attachment(6) and Remote Replica Attachment(7).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_SupportedSynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"..\"]' Values='[\"Storage Pool Creation\",\"Storage Pool Deletion\",\"Storage Pool Modification\",\"Storage Element Creation\",\"Storage Element Return\",\"Storage Element Modification\",\"Replica Creation\",\"Replica Modification\",\"Replica Attachment\",\"SCSI Scan\",\"Storage Element from Element Creation\",\"Storage Element from Element Modification\",\"Element Usage Modification\",\"StoragePool Usage Modification\",\"Storage Resource Affinity Assignment\",\"StorageVolume To StoragePool Relocation\",\"StoragePool To StoragePool Relocation\",\"StorageVolume To StorageExtent Relocation\",\"StoragePool To StorageExtent Relocation\",\"LogicalDisk To StorageExtent Relocation\",\"Multiple Storage Element Creation\",\"Multiple Storage Element Return\",\"Storage Element from Multiple Pools Creation\",\"CompositeVolume Creation\",\"CompositeVolume Return\",\"CompositeVolume Modification\",\"CompositeVolume Dissolve\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_StorageConfigurationCapabilities.SupportedAsynchronousActions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSynchronousActions();

	/**
	 * Returns the value of the '<em><b>Supported Storage Element Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the type of storage elements that are supported by the associated StorageConfigurationService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Storage Element Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_SupportedStorageElementTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"StorageVolume\",\"StorageExtent\",\"LogicalDisk\",\"ThinlyProvisionedStorageVolume\",\"ThinlyProvisionedLogicalDisk\",\"ThinlyProvisionedAllocatedStoragePool\",\"ThinlyProvisionedQuotaStoragePool\",\"ThinlyProvisionedLimitlessStoragePool\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageConfigurationService.CreateOrModifyElementFromStoragePool(ElementType)\",\"CIM_StorageConfigurationService.CreateOrModifyElementFromElements(ElementType)\",\"CIM_StorageConfigurationService.CreateElementsFromStoragePools(ElementType)\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedStorageElementTypes();

	/**
	 * Returns the value of the '<em><b>Supported Storage Pool Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating features supported by the StoragePool methods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Storage Pool Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_SupportedStoragePoolFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"InExtents\",\"Single InPool\",\"Multiple InPools\",\"Storage Pool QoS Change\",\"Storage Pool Capacity Expansion\",\"Storage Pool Capacity Reduction\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageConfigurationService.CreateOrModifyStoragePool(InPools)\",\"CIM_StorageConfigurationService.CreateOrModifyStoragePool(InExtents)\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedStoragePoolFeatures();

	/**
	 * Returns the value of the '<em><b>Supported Storage Element Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating features supported by the Storage Element methods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Storage Element Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_SupportedStorageElementFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"StorageExtent Creation\",\"StorageVolume Creation\",\"StorageExtent Modification\",\"StorageVolume Modification\",\"Single InPool\",\"Multiple InPools\",\"LogicalDisk Creation\",\"LogicalDisk Modification\",\"InElements\",\"Storage Element QoS Change\",\"Storage Element Capacity Expansion\",\"Storage Element Capacity Reduction\",\"StorageVolume To StoragePool Relocation\",\"StoragePool To StoragePool Relocation\",\"StorageVolume To StorageExtent Relocation\",\"StoragePool To StorageExtent Relocation\",\"LogicalDisk To StorageExtent Relocation\",\"CompositeVolume Creation\",\"CompositeVolume Modification\",\"CompositeVolume Dissolve\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageConfigurationService.CreateOrModifyElementFromStoragePool(ElementType)\",\"CIM_StorageConfigurationService.CreateOrModifyElementFromStoragePool(InPool)\",\"CIM_StorageConfigurationService.CreateOrModifyElementFromElements(InElements)\",\"CIM_StorageConfigurationService.CreateElementsFromStoragePools(ElementType)\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedStorageElementFeatures();

	/**
	 * Returns the value of the '<em><b>Supported Copy Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupportedCopyTypes describes the replication capabilities supported by the associated StorageConfigurationServices. Values are: 
	 * Async: asynchronous copies may be created and maintained. 
	 * Sync: synchronous copies may be created and maintained. 
	 * UnSyncAssoc: unsynchronized copies may be created and maintained. 
	 * UnSyncUnAssoc: a 'straight copy' may be created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Copy Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_SupportedCopyTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Async\",\"Sync\",\"UnSyncAssoc\",\"UnSyncUnAssoc\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageConfigurationService.CreateReplica(CopyType)\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedCopyTypes();

	/**
	 * Returns the value of the '<em><b>Initial Replication State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InitialReplicationState specifies which initial ReplicationState is supported by a particular provider. Values are: 
	 * Initialized: The replication relationship is known and unsynchronized, but time required to synchronize may be long. 
	 * Prepared: The replication relationship is known and unsynchronized and the time required to synchronize will be short. 
	 * Synchronized: The replicas are synchronized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Replication State</em>' attribute.
	 * @see #setInitialReplicationState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_InitialReplicationState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Initialized\",\"Prepared\",\"Synchronized\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageConfigurationService.AttachReplica\",\"CIM_StorageConfigurationService.CreateReplica\"]'"
	 * @generated
	 */
	Integer getInitialReplicationState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getInitialReplicationState <em>Initial Replication State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Replication State</em>' attribute.
	 * @see #getInitialReplicationState()
	 * @generated
	 */
	void setInitialReplicationState(Integer value);

	/**
	 * Returns the value of the '<em><b>Automatic Pool Selection Allowed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, it indicates the implementation selects appropriate pools based on other supplied parameters to create elements. For example, based on supplied Goal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automatic Pool Selection Allowed</em>' attribute.
	 * @see #setAutomaticPoolSelectionAllowed(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_AutomaticPoolSelectionAllowed()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAutomaticPoolSelectionAllowed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getAutomaticPoolSelectionAllowed <em>Automatic Pool Selection Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Pool Selection Allowed</em>' attribute.
	 * @see #getAutomaticPoolSelectionAllowed()
	 * @generated
	 */
	void setAutomaticPoolSelectionAllowed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Client Settable Element Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the intended usage or any restrictions that may have been imposed on the usage of Client Settable Elements. For example, an element may be reserved for use by the block server. In that case the Usage of the element is marked as "Reserved for the ComputerSystem". In the case of "Other", see OtherUsageDescription for more information. For additional information on variousvalues, see the classes noted in ModelCorrespondence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Settable Element Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_ClientSettableElementUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Unrestricted\",\"Reserved for ComputerSystem (the block server)\",\"Reserved by Replication Services\",\"Reserved by Migration Services\",\"Local Replica Source\",\"Remote Replica Source\",\"Local Replica Target\",\"Remote Replica Target\",\"Local Replica Source or Target\",\"Remote Replica Source or Target\",\"Delta Replica Target\",\"Element Component\",\"Reserved as Pool Contributor\",\"Composite Volume Member\",\"Composite LogicalDisk Member\",\"Reserved for Sparing\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_StorageExtent.Usage\",\"CIM_StorageVolume.Usage\",\"CIM_LogicalDisk.Usage\",\"CIM_StorageExtent.OtherUsageDescription\",\"CIM_StorageVolume.OtherUsageDescription\",\"CIM_LogicalDisk.OtherUsageDescription\"]'"
	 * @generated
	 */
	EList<Integer> getClientSettableElementUsage();

	/**
	 * Returns the value of the '<em><b>Client Settable Pool Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the intended usage or any restrictions thatmay have been imposed on the usage a client settable storage pool. For example, a storage pool may be reserved for use by the block server.In that case the Usage of the storage pool is marked as "Reserved for the ComputerSystem". In the case of "Other", see OtherUsageDescription for more information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Settable Pool Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_ClientSettablePoolUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Unrestricted\",\"Reserved for ComputerSystem (the block server)\",\"Reserved as a Delta Replica Container\",\"Reserved for Migration Services\",\"Reserved for Local Replication Services\",\"Reserved for Remote Replication Services\",\"Reserved for Sparing\",\"Used as source for Relocation Service\",\"Used as target for Relocation Service\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_StoragePool.OtherUsageDescription\"]'"
	 * @generated
	 */
	EList<Integer> getClientSettablePoolUsage();

	/**
	 * Returns the value of the '<em><b>Maximum Element Create Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of elements that can be specified to be created in a single method call. If 0 or null, there is no limit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Element Create Count</em>' attribute.
	 * @see #setMaximumElementCreateCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_MaximumElementCreateCount()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageConfigurationService.CreateElementsFromStoragePools(ElementCount)\"]'"
	 * @generated
	 */
	Long getMaximumElementCreateCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getMaximumElementCreateCount <em>Maximum Element Create Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Element Create Count</em>' attribute.
	 * @see #getMaximumElementCreateCount()
	 * @generated
	 */
	void setMaximumElementCreateCount(Long value);

	/**
	 * Returns the value of the '<em><b>Maximum Element Delete Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of elements that can be deleted in a single method call. If 0 or null, there is no limit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Element Delete Count</em>' attribute.
	 * @see #setMaximumElementDeleteCount(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_MaximumElementDeleteCount()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageConfigurationService.ReturnElementsToStoragePool(TheElements)\"]'"
	 * @generated
	 */
	Long getMaximumElementDeleteCount();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getMaximumElementDeleteCount <em>Maximum Element Delete Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Element Delete Count</em>' attribute.
	 * @see #getMaximumElementDeleteCount()
	 * @generated
	 */
	void setMaximumElementDeleteCount(Long value);

	/**
	 * Returns the value of the '<em><b>Multiple Element Create Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating features offered by the multiple element create method. 
	 * Single instance creation indication: Generally there will be one instance creation indication per created element, however, some implementations treat the call as a single transaction and only generate one instance creation indication regardless of the ElementCount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiple Element Create Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_MultipleElementCreateFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Single instance creation indication\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageConfigurationService.CreateElementsFromStoragePools\",\"CIM_StorageConfigurationService.CreateElementsFromStoragePools(ElementCount)\"]'"
	 * @generated
	 */
	EList<Integer> getMultipleElementCreateFeatures();

	/**
	 * Returns the value of the '<em><b>Multiple Element Delete Features</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating features offered by the multiple element delete method. 
	 * Continue on nonexistent element: if the method encounters a non-existent element in the list of elements supplied, the method continues to delete the remaining elements. 
	 * Return error on nonexistent element: The method returns an error if it encounters an element that does not exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiple Element Delete Features</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_MultipleElementDeleteFeatures()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Continue on nonexistent element\",\"Return error on nonexistent element\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageConfigurationService.ReturnElementsToStoragePool\",\"CIM_StorageConfigurationService.ReturnElementsToStoragePool(Options)\"]'"
	 * @generated
	 */
	EList<Integer> getMultipleElementDeleteFeatures();

	/**
	 * Returns the value of the '<em><b>Supported Storage Element Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the intended usage or any restrictions that may have been imposed on the usage of Supported Storage Elements. For example, an element may be reserved for use by the block server. In that case the Usage of the element is marked as "Reserved for the ComputerSystem". In the case of "Other", see OtherUsageDescription for more information. For additional information on variousvalues, see the classes noted in ModelCorrespondence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Storage Element Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_SupportedStorageElementUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Unrestricted\",\"Reserved for ComputerSystem (the block server)\",\"Reserved by Replication Services\",\"Reserved by Migration Services\",\"Local Replica Source\",\"Remote Replica Source\",\"Local Replica Target\",\"Remote Replica Target\",\"Local Replica Source or Target\",\"Remote Replica Source or Target\",\"Delta Replica Target\",\"Element Component\",\"Reserved as Pool Contributor\",\"Composite Volume Member\",\"Composite LogicalDisk Member\",\"Reserved for Sparing\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_StorageExtent.Usage\",\"CIM_StorageVolume.Usage\",\"CIM_LogicalDisk.Usage\",\"CIM_StorageExtent.OtherUsageDescription\",\"CIM_StorageVolume.OtherUsageDescription\",\"CIM_LogicalDisk.OtherUsageDescription\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedStorageElementUsage();

	/**
	 * Returns the value of the '<em><b>Supported Storage Pool Usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the intended usage or any restrictions that may have been imposed on the usage a supported storage pool. For example, a storage pool may be reserved for use by the block server. In that case the Usage of the storage pool is marked as "Reserved for the ComputerSystem". In the case of "Other", see OtherUsageDescription for more information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Storage Pool Usage</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_SupportedStoragePoolUsage()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"..\",\"32768..65535\"]' Values='[\"Other\",\"Unrestricted\",\"Reserved for ComputerSystem (the block server)\",\"Reserved as a Delta Replica Container\",\"Reserved for Migration Services\",\"Reserved for Local Replication Services\",\"Reserved for Remote Replication Services\",\"Reserved for Sparing\",\"Used as source for Relocation Service\",\"Used as target for Relocation Service\",\"DMTF Reserved\",\"Vendor Reserved\"]' ModelCorrespondence='[\"CIM_StoragePool.OtherUsageDescription\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedStoragePoolUsage();

	/**
	 * Returns the value of the '<em><b>Thin Provisioned Client Settable Reserve</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether the associated block server or pool supports client modification of ThinProvisionedInitialReserve.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thin Provisioned Client Settable Reserve</em>' attribute.
	 * @see #setThinProvisionedClientSettableReserve(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_ThinProvisionedClientSettableReserve()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_StorageConfigurationCapabilities.ThinProvisionedDefaultReserve\",\"CIM_StorageSetting.ThinProvisionedInitialReserve\"]'"
	 * @generated
	 */
	Boolean getThinProvisionedClientSettableReserve();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getThinProvisionedClientSettableReserve <em>Thin Provisioned Client Settable Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thin Provisioned Client Settable Reserve</em>' attribute.
	 * @see #getThinProvisionedClientSettableReserve()
	 * @generated
	 */
	void setThinProvisionedClientSettableReserve(Boolean value);

	/**
	 * Returns the value of the '<em><b>Thin Provisioned Default Reserve</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The default initial reserve for new thinly provisioned volumes or logical disks if the system does not allow clients to set the initial reserve or the client does not request an initial reserve.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thin Provisioned Default Reserve</em>' attribute.
	 * @see #setThinProvisionedDefaultReserve(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationCapabilities_ThinProvisionedDefaultReserve()
	 * @model default="0"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_StorageConfigurationCapabilities.ThinProvisionedClientSettableReserve\",\"CIM_StorageSetting.ThinProvisionedInitialReserve\"]'"
	 * @generated
	 */
	Long getThinProvisionedDefaultReserve();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageConfigurationCapabilities#getThinProvisionedDefaultReserve <em>Thin Provisioned Default Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thin Provisioned Default Reserve</em>' attribute.
	 * @see #getThinProvisionedDefaultReserve()
	 * @generated
	 */
	void setThinProvisionedDefaultReserve(Long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method indicates if ElementName can be specified as a part of invoking an appropriate method of StorageConfigurationService to create a new element. 
	 * Additionally, the returned data includes the methods that can be used to modify the ElementName of existing storage elements. 
	 * This method also returns the restrictions on the ElementName in the related "OUT" parameters.
	 * @param ElementType A value indicating the element type. Additional information about the type (subtype) is supplied using the Goal and InPool parameters.
	 * @param Goal Properties of the Goal indicate variations of the ElementType. For example, ElementType may indicate StoragePool, and Goal may indicate thinly provisioned StoragePool.
	 * @param InPool The Pool from which the element in planned to be created from.
	 * @param SupportedFeatures
	 *   Enumeration indicating what methods can accept the element name for creation or modification of a storage element. 
	 *   CreateOrModifyElementFromStoragePool is an example of an InvokeMethod. ModifyInstance and SetProperty are examples of intrinsic methods. 
	 *   An empty array indicates ElementNaming for ElementType is not supported, in which case the other OUT parameters are null.
	 * @param MaxElementNameLen Maximum supported ElementName length.
	 * @param ElementNameMask
	 *   This string expresses the restrictions on ElementName. The mask is expressed as a regular expression. See DMTF standard ABNF with the Management Profile Specification Usage Guide, Annex C for the regular expression syntax permitted. 
	 *   Since the ElementNameMask can describe the maximum length of the ElementName, any length defined in the regexp is in addition to the restriction defined in MaxElementNameLen (causing the smaller value to be the maximum length). The ElementName value satisfies the restriction, if and only if it matches the regular expression. 
	 *   If NULL, it indicates no restrictions on the ElementName.
	 * <!-- end-model-doc -->
	 * @model ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"StorageVolume\",\"StorageExtent\",\"LogicalDisk\",\"ThinlyProvisionedStorageVolume\",\"ThinlyProvisionedLogicalDisk\",\"StoragePool\",\"DMTF Reserved\",\"Vendor Specific\"]'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' ModelCorrespondence='[\"CIM_StorageSetting.ThinProvisionedPoolType\",\"CIM_StorageSetting.StorageExtentInitialUsage\",\"CIM_StorageSetting.StoragePoolInitialUsage\"]'" InPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF'" SupportedFeaturesUnique="false" SupportedFeaturesMany="true"
	 *        SupportedFeaturesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"ElementName can be supplied during creation\",\"ElementName can be modified with InvokeMethod\",\"ElementName can be modified with intrinsic method\",\"DMTF Reserved\",\"Vendor Specific\"]'" MaxElementNameLenAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' ModelCorrespondence='[\"CIM_EnabledLogicalElementCapabilities.MaxElementNameLen\"]'" ElementNameMaskAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' ModelCorrespondence='[\"CIM_EnabledLogicalElementCapabilities.ElementNameMask\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageConfigurationService.CreateElementsFromStoragePools\",\"CIM_StorageConfigurationService.CreateOrModifyElementFromElements\",\"CIM_StorageConfigurationService.CreateOrModifyElementFromStoragePool\"]'"
	 * @generated
	 */
	Long GetElementNameCapabilities(Integer ElementType, CIM_ManagedElement Goal, CIM_StoragePool InPool, EList<Integer> SupportedFeatures, Integer MaxElementNameLen, String ElementNameMask);

} // CIM_StorageConfigurationCapabilities

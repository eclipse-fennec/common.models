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
 * A representation of the model object '<em><b>CIM Storage Configuration Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This service allows the active management of a Storage Server. It allows jobs to be started for the creation, modification and deletion of storage objects (StoragePools, StorageVolumes and LogicalDisks).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageConfigurationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.49.0' UMLPackagePath='CIM::Device::StorageServices' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_StorageConfigurationService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Starts a job to create (or modify) a StoragePool. The StoragePool will be (or must be) scoped to the same System as this Service. One of the parameters for this method is Size. As an input parameter, Size specifies the desired size of the pool. As an output parameter, it specifies the size achieved. Space is taken from either or both of the specified input StoragePools and StorageExtents (InPools and InExtents). The capability requirements that the Pool must support are defined using the Goal parameter. If the requested pool size cannot be created, no action will be taken, the Return Value will be 4097/0x1001, and the output value of Size will be set to the nearest possible size. If 0 is returned, then the task completed successfully and the use of ConcreteJob was not required. If the task will take some time to complete, a ConcreteJob will be created and its reference returned in the output parameter Job.
	 * @param ElementName A end user relevant name for the pool being created. If NULL, then a system supplied default name can be used. The value will be stored in the 'ElementName' property for the created pool. If not NULL, this parameter will supply a new name when modifying an existing pool.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param Goal Reference to an instance of StorageSetting that defines the desired capabilities of the StoragePool. If set to a null value, the default configuration from the source pool will be used. If not NULL, this parameter will supply a new Goal setting when modifying an existing pool.
	 * @param Size As an input parameter this specifies the desired pool size in bytes. As an output parameter this specifies the size achieved.
	 * @param InPools Array of strings containing representations of references to CIM_StoragePool instances, that are used to create the Pool or modify the source pools.
	 * @param InExtents Array of strings containing representations of references to CIM_StorageExtent instances, that are used to create the Pool or modify the source extents.
	 * @param Pool As an input parameter: if null, creates a new StoragePool. If not null, modifies the referenced Pool. When returned, it is a reference to the resulting StoragePool.
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageSetting REF'" SizeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Out='true' Units='Bytes' PUnit='byte'" InPoolsUnique="false" InPoolsMany="true"
	 *        InPoolsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" InExtentsUnique="false" InExtentsMany="true"
	 *        InExtentsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" PoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Size Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateOrModifyStoragePool(String ElementName, CIM_ConcreteJob Job, CIM_StorageSetting Goal, Long Size, EList<String> InPools, EList<String> InExtents, CIM_StoragePool Pool);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to create (or modify) a specified element (for example a StorageVolume or StorageExtent) from a StoragePool. One of the parameters for this method is Size. As an input parameter, Size specifies the desired size of the element. As an output parameter, it specifies the size achieved. Space is taken from the input StoragePool. The desired settings for the element are specified by the Goal parameter. If the requested size cannot be created, no action will be taken, and the Return Value will be 4097/0x1001. Also, the output value of Size is set to the nearest possible size. If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to create the element. The Job's reference will be returned in the output parameter Job.
	 * @param ElementName A end user relevant name for the element being created. If NULL, then a system supplied default name can be used. The value will be stored in the 'ElementName' property for the created element. If not NULL, this parameter will supply a new name when modifying an existing element.
	 * @param ElementType Enumeration indicating the type of element being created or modified. If the input parameter TheElement is specified when the operation is a 'modify', this type value must match the type of that instance. With ElementType of "2" and "3", the implementation decides the provisioning of the element.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param Goal The requirements for the element to maintain. If set to a null value, the default configuration from the source pool will be used. This parameter should be a reference to a Setting or Profile appropriate to the element being created. If not NULL, this parameter will supply a new Goal when modifying an existing element.
	 * @param Size As an input parameter Size specifies the desired size. If not NULL, this parameter will supply a new size when modifying an existing element. As an output parameter Size specifies the size achieved.
	 * @param InPool The Pool from which to create the element. This parameter must be set to null if the input parameter TheElement is specified (in the case of a 'modify' operation).
	 * @param TheElement As an input parameter: if null, creates a new element. If not null, then the method modifies the specified element. As an output parameter, it is a reference to the resulting element.
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Reserved\",\"StorageVolume\",\"StorageExtent\",\"LogicalDisk\",\"ThinlyProvisionedStorageVolume\",\"ThinlyProvisionedLogicalDisk\",\"FullyProvisionedStorageVolume\",\"FullyProvisionedLogicalDisk\",\"DMTF Reserved\",\"Vendor Specific\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" SizeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Out='true' Units='Bytes' PUnit='byte'" InPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF'" TheElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Size Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateOrModifyElementFromStoragePool(String ElementName, Integer ElementType, CIM_ConcreteJob Job, CIM_ManagedElement Goal, Long Size, CIM_StoragePool InPool, CIM_LogicalElement TheElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to delete a StoragePool. The freed space is returned source StoragePools (indicated by AllocatedFrom StoragePool) or back to underlying storage extents. If 0 is returned, the function completed successfully, and no ConcreteJob was required. If 4096/0x1000 is returned, a ConcreteJob will be started to delete the StoragePool. A reference to the Job is returned in the Job parameter.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param Pool Reference to the pool to delete.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" PoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DeleteStoragePool(CIM_ConcreteJob Job, CIM_StoragePool Pool);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to delete an element previously created from a StoragePool. The freed space is returned to the source StoragePool. If 0 is returned, the function completed successfully and no ConcreteJob was required. If 4096/0x1000 is returned, a ConcreteJob will be started to delete the element. A reference to the Job is returned in the Job parameter.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param TheElement Reference to the element to return to the StoragePool.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TheElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ReturnToStoragePool(CIM_ConcreteJob Job, CIM_LogicalElement TheElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to create a new storage object which is a replica of the specified source storage object. (SourceElement). Note that using the input paramter, CopyType, this function can be used to instantiate the replica, and to create an ongoing association between the source and replica. If 0 is returned, the function completed successfully and no ConcreteJob instance is created. If 4096/0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter.
	 * @param ElementName A end user relevant name for the element being created. If NULL, then a system supplied default name can be used. The value will be stored in the 'ElementName' property for the created element.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param SourceElement The source storage object which may be a StorageVolume or storage object.
	 * @param TargetElement Reference to the created target storage element (i.e., the replica).
	 * @param TargetSettingGoal The definition for the StorageSetting to be maintained by the target storage object (the replica).
	 * @param TargetPool The underlying storage for the target element (the replica) will be drawn from TargetPool if specified, otherwise the allocation is implementation specific.
	 * @param CopyType
	 *   CopyType describes the type of copy that will be made. Values are: 
	 *   Async: Create and maintain an asynchronous copy of the source. 
	 *   Sync: Create and maintain a synchronized copy of the source. 
	 *   UnSyncAssoc: Create an unsynchronized copy and maintain an association to the source. 
	 *   UnSyncUnAssoc: Create unassociated copy of the source element.
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SourceElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF' Required='true'" TargetElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF' In='false' Out='true'" TargetSettingGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageSetting REF'" TargetPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF'" CopyTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Async\",\"Sync\",\"UnSyncAssoc\",\"UnSyncUnAssoc\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateReplica(String ElementName, CIM_ConcreteJob Job, CIM_LogicalElement SourceElement, CIM_LogicalElement TargetElement, CIM_StorageSetting TargetSettingGoal, CIM_StoragePool TargetPool, Integer CopyType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modify (or start a job to modify) the synchronization association between two storage objects. If 0 is returned, the function completed successfully and no ConcreteJob instance was created. If 0x1000 is returned, a ConcreteJob was started and a reference to this Job is returned in the Job output parameter. A return value of 1 indicates the method is not supported. All other values indicate some type of error condition.
	 * @param Operation
	 *   Operation describes the type of modification to be made to the replica. Values are: 
	 *   Detach: 'Forget' the synchronization between two storage objects. Start to treat the objects as independent. 
	 *   Fracture: Suspend the synchronization between two storage objects using Sync or Async replication. 
	 *   The association and (typically) changes are remembered to allow a fast resynchronization. This may be used during a backup cycle to allow one of the objects to be copied while the other remains in production. 
	 *   Resync Replica: Re-establish the synchronization of a Sync or Async replication. This will negate the action of a previous Fracture operation. Recreate a Point In Time image for an UnSyncAssoc replication. 
	 *   Restore from Replica: Renew the contents of the original storage object from a replica. 
	 *   Prepare: Get the link ready for a Resync operation to take place. Some implementations will require this operation to be invoked to keep the Resync operation as fast as possible. May start the copy engine. 
	 *   Unprepare: Clear a prepared state if a Prepare is not to be followed by a Resync operation. 
	 *   Quiesce: Some applications require notification so that they can ready the link for an operation. For example flush any cached data or buffered changes. The copy engine is stopped for UnSyncAssoc replications. 
	 *   Unquiesce: Take the link from the quiesced state (without executing the intended operation. 
	 *   Start Copy: initiate a full background copy of the source to the UnSyncAssoc replica. Replica enters Frozen state when copy operation is completed. 
	 *   Stop Copy: stop the background copy previously started. Reset To Sync: Change the CopyType of the association to Sync (e.g., from the Async CopyType). 
	 *   Reset To Async: Change the CopyType of the association to Async (e.g., from the Sync CopyType).
	 * @param Job Reference to the job (may be null if the task completed).
	 * @param Synchronization The referenced to the StorageSynchronized association describing the storage source/replica relationship.
	 * <!-- end-model-doc -->
	 * @model OperationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"DMTF Reserved\",\"DMTF Reserved\",\"Detach\",\"Fracture\",\"Resync Replica\",\"Restore from Replica\",\"Prepare\",\"Unprepare\",\"Quiesce\",\"Unquiesce\",\"Reset To Sync\",\"Reset To Async\",\"Start Copy\",\"Stop Copy\",\"DMTF Reserved\",\"Vendor Specific\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SynchronizationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageSynchronized REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..0xFFFF\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ModifySynchronization(Integer Operation, CIM_ConcreteJob Job, CIM_StorageSynchronized Synchronization);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create (or start a job to create) a StorageSynchronized relationship between two existing storage objects. Note that using the input parameter, CopyType, this function can be used to to create an ongoing association between the source and replica. If 0 is returned, the function completed successfully and no ConcreteJob instance is created. If 0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter. A return value of 1 indicates the method is not supported. All other values indicate some type of error condition.
	 * @param Job Reference to the job (may be null if the task completed).
	 * @param SourceElement The source storage object which may be a StorageVolume or other storage object.
	 * @param TargetElement Reference to the target storage element (i.e., the replica).
	 * @param CopyType
	 *   CopyType describes the type of Synchronized relationship that will be created. Values are: 
	 *   Async: Create and maintain an asynchronous copy of the source. 
	 *   Sync: Create and maintain a synchronized copy of the source. 
	 *   UnSyncAssoc: Create an unsynchronized copy and maintain an association to the source. 
	 *   UnSyncUnAssoc: Create unassociated copy of the source element.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SourceElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Required='true'" TargetElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" CopyTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Async\",\"Sync\",\"UnSyncAssoc\",\"UnSyncUnAssoc\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..0xFFFF\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AttachReplica(CIM_ConcreteJob Job, CIM_ManagedElement SourceElement, CIM_ManagedElement TargetElement, Integer CopyType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to create (or modify) a specified storage element from specified input StorageExtents. The created or modified storage element can be a StorageExtent, StorageVolume, LogicalDisk, or StoragePool. An input list of InElements must be specified. The GetAvailableExtents method can be used to get a list of valid extents that can be used to achieve a desired goal. Validity of the extents is determined by the implementation. As an input parameter, Size specifies the desired size of the element. As an output parameter, it specifies the size achieved. Space is taken from the input InElements. The desired Settings for the element are specified by the Goal parameter. If the size of Extents passed is less than the size requested, then the capacity is drawn from the extents in the order, left to right, that the Extents were specified. The partial consumption of an Extent is represented by an Extent for the capacity used and an Extent for the capacity not used. If the Size is NULL, then a configuration using all Extents passed will be attempted. If the requested size cannot be created, no action will be taken, and the Return Value will be 4097/0x1001. Also, the output value of Size is set to the nearest possible size. If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to create the element. The Job's reference will be returned in the output parameter Job.
	 * @param ElementName A end user relevant name for the element being created. If NULL, then a system-supplied default name can be used. The value will be stored in the 'ElementName' property for the created element. If not NULL, this parameter will supply a new name when modifying an existing element.
	 * @param ElementType Enumeration indicating the type of element being created or modified. If the input parameter TheElement is specified when the operation is a 'modify', this type value must match the type of that instance. The actual CIM class of the created TheElement can be vendor-specific, but it must be a derived class of the appropriate CIM class -- i.e., CIM_StorageVolume, CIM_StorageExtent, CIM_LogicalDisk, or CIM_StoragePool.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param Goal The requirements for the element to maintain. If set to a null value, the default configuration associated with the Service will be used. This parameter should be a reference to a Setting, SettingData, or Profile appropriate to the element being created. If not NULL, this parameter will supply a new Goal when modifying an existing element.
	 * @param Size As an input parameter Size specifies the desired size. If not NULL, this parameter will supply a new size when modifying an existing element. As an output parameter Size specifies the size achieved.
	 * @param InElements Array of references to storage element instances that are used to create or modify TheElement.
	 * @param TheElement As an input parameter: if null, creates a new element. If not null, then the method modifies the specified element. As an output parameter, it is a reference to the resulting element.
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Reserved\",\"Storage Volume\",\"Storage Extent\",\"Storage Pool\",\"Logical Disk\",\"ThinlyProvisionedStorageVolume\",\"ThinlyProvisionedLogicalDisk\",\"DMTF Reserved\",\"Vendor Specific\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" SizeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Out='true' Units='Bytes' PUnit='byte'" InElementsUnique="false" InElementsMany="true"
	 *        InElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF[]' Required='true'" TheElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Size Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateOrModifyElementFromElements(String ElementName, Integer ElementType, CIM_ConcreteJob Job, CIM_ManagedElement Goal, Long Size, EList<CIM_StorageExtent> InElements, CIM_LogicalElement TheElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to assign affinity of a StoragePool(s) or StorageVolume(s) to a storage processor. At the conclusion of the operation, the resource will be a member of the StorageResourceLoadGroup with the primary affinity for the specified storage processor. Support for this method is indicated by the presence of an instance of StorageServerAsymmetryCapabilites in which the property StorageResourceAffinityAssignable is 'true'. If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a job will be started to assign the element. The Job's reference will be returned in the output parameter Job.
	 * @param ResourceType Enumeration indicating the type of resource being assigned or modified. .
	 * @param Job Reference to the job (may be null if job completed).
	 * @param StorageProcessor Reference to the storage processor to which to assign the resource.
	 * @param StorageResources Array of references to storage resource instances to be assigned.
	 * <!-- end-model-doc -->
	 * @model ResourceTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"3\"]' Values='[\"StorageVolume\",\"StoragePool\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" StorageProcessorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" StorageResourcesUnique="false" StorageResourcesMany="true"
	 *        StorageResourcesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]' Required='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MethodConstraint='[\"pre:(StorageResources.oclIsTypeOf(CIM_StoragePool)OR StorageResources.oclIsTypeOf(CIM_StorageVolume))\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Size Not Supported\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AssignStorageResourceAffinity(Integer ResourceType, CIM_ConcreteJob Job, CIM_ComputerSystem StorageProcessor, EList<CIM_LogicalElement> StorageResources);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create (or start a job to create) a StorageSynchronized mirror relationship between two storage elements. The target element may be a local or a remote storage element. A remote mirror pair may be scoped by a peer-to-peer connection modeled as a NetworkPipe between peers. 
	 * 
	 * If Job Completed with No Error (0) is returned, the function completed successfully and a ConcreteJob instance is not created. 
	 * 
	 * If Method Parameters Checked - Job Started (0x1000) is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter. 
	 * 
	 * A return value of Not Supported (1) indicates the method is not supported. 
	 * 
	 * All other values indicate some type of error condition.
	 * @param Job Reference to the job (may be null if the task completed).
	 * @param SourceElement The source storage element which may be a StorageVolume, StorageExtent, LogicalFile, FileSystem, CommonDatabase, or any other storage object. For this reason, the type is made very generic.
	 * @param TargetElement Reference to the target storage element (i.e., the replica). The target storage element which may be a StorageVolume, StorageExtent, LogicalFile, FileSystem, CommonDatabase, or any other storage object. For this reason, the type is made very generic.
	 * @param CopyType
	 *   CopyType describes the type of Synchronized relationship that will be created. Values are: Async: Create and maintain an asynchronous copy of the source. Sync: Create and maintain a synchronized copy of the source. UnSyncAssoc: Create an unsynchronized copy and maintain an association to the source element. 
	 *   UnSyncUnAssoc: Create an unassociated copy of the source element. 
	 *   UnSyncAssoc and UnSyncUnAssoc are not supported for remote mirror replicas.
	 * @param Goal The StorageSetting properties to be created or modified for the target element.
	 * @param ReplicationPipe The NetworkPipe element that scopes the remote mirror pair. If the value is null, remote mirrors do not require a pre-established connection.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SourceElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Required='true'" TargetElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Required='true'" CopyTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"0x1000..0xFFFF\"]' Values='[\"Async\",\"Sync\",\"UnSyncAssoc\",\"UnSyncUnAssoc\",\"DMTF Reserved\",\"Vendor Specific\"]'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_SettingData'" ReplicationPipeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_NetworkPipe REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..0xFFFF\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AttachOrModifyReplica(CIM_ConcreteJob Job, CIM_ManagedElement SourceElement, CIM_ManagedElement TargetElement, Integer CopyType, String Goal, CIM_NetworkPipe ReplicationPipe);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to create (or modify) a specified elements (for example StorageVolumes or StorageExtents) from StoragePools. One of the parameters for this method is Size. As an input parameter, Size specifies the desired size of the element. As an output parameter, it specifies the size achieved. Space is taken from the input StoragePool. The desired settings for the element are specified by the Goal parameter. If the requested size cannot be created, no action will be taken, and the Return Value will be 4097/0x1001. Also, the output value of Size is set to the nearest possible size. If 0 is returned, the function completed successfully and no ConcreteJob instance was required. If 4096/0x1000 is returned, a ConcreteJob will be started to create the element. The Job's reference will be returned in the output parameter Job. If the number of elements created is less than the number of elements requested, the return value will be 4098/0x1002.
	 * @param ElementNames One or more user relevant names for the element being created. If NULL, then system supplied default names may be used. The value will be stored in the "ElementName" property for the created element.
	 * @param ElementType Enumeration indicating the type of element being created. With ElementType of "2" and "3", the implementation decides the provisioning of the element.
	 * @param ElementCount Count of elements to create. If null, it defaults to one element.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param Goal The requirements for the element to maintain. If set to a null value, the default configuration from the source pool will be used. This parameter should be a reference to a Setting or Profile appropriate to the element being created.
	 * @param Size As an input parameter Size specifies the desired size for each element created. As an output parameter Size specifies the size achieved.
	 * @param InPools The Pools from which to create the elements. If not supplied, system locates the appropriate pools.
	 * @param TheElements Reference to the resulting elements.
	 * <!-- end-model-doc -->
	 * @model ElementNamesUnique="false" ElementNamesMany="true"
	 *        ElementNamesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Reserved\",\"StorageVolume\",\"StorageExtent\",\"LogicalDisk\",\"ThinlyProvisionedStorageVolume\",\"ThinlyProvisionedLogicalDisk\",\"FullyProvisionedStorageVolume\",\"FullyProvisionedLogicalDisk\",\"DMTF Reserved\",\"Vendor Specific\"]'" ElementCountAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingData REF'" SizeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Out='true' Units='Bytes' PUnit='byte'" InPoolsUnique="false" InPoolsMany="true"
	 *        InPoolsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF[]'" TheElementsUnique="false" TheElementsMany="true"
	 *        TheElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097\",\"4098\",\"4099..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Size Not Supported\",\"Partially Completed Operation\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateElementsFromStoragePools(EList<String> ElementNames, Integer ElementType, Long ElementCount, CIM_ConcreteJob Job, CIM_SettingData Goal, Long Size, EList<CIM_StoragePool> InPools, EList<CIM_LogicalElement> TheElements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method establishes a peer-to-peer connection identified by a NetworkPipe element and two ProtocolEndpoint elements created by the method provider. The NetworkPipe is associated to a special peer-to-peer Network element. The provider will verify that two systems are capable of a peer relationship. If endpoints are assigned to the pipe, the same number of source and target endpoints must be supplied by the client to form a set of endpoint pairs. If ReplicationPipe is not supplied as an input parameter, a new pipe is created. If a pipe is supplied, a new set of endpoints is assigned to the existing pipe. 
	 * 
	 * If Success (0) is returned, the function completed successfully. 
	 * 
	 * A return value of Not Supported (1) indicates the method is not supported. 
	 * 
	 * A return value of Busy (0x1000) indicates the method is not supported. 
	 * 
	 * All other values indicate some type of error condition.
	 * @param PipeElementName A user-friendly name for the element created.
	 * @param SourceSystem One of the two peer systems participating in the established peer-to-peer connection. If the provider supports uni-directional connections, this must identify the system hosting replica source elements.
	 * @param TargetSystem One of the two peer systems participating in the established peer-to-peer connection. If the provider supports uni-directional connections, this must identify the system hosting replica target elements.
	 * @param SourceEndpoint References to source system endpoints/ports assigned to the pipe. If a new pipe is created, this is the initial set of endpoints assigned. If an existing pipe is modified, this set replaces the previous set. The list must be null if a provider does not allow the client to manage port assignment.
	 * @param TargetEndpoint References to target system endpoints/ports assigned to the pipe. If a new pipe is created, this is the initial set of endpoints assigned. If an existing pipe is modified, this set replaces the previous set. The list must be null if a provider does not allow the client to manage port assignment.
	 * @param Goal The setting properties to be maintained for the peer-to-peer connection.
	 * @param ReplicationPipe Reference to the created or modified NetworkPipe.
	 * <!-- end-model-doc -->
	 * @model PipeElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" SourceSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' Required='true'" TargetSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' Required='true'" SourceEndpointUnique="false" SourceEndpointMany="true"
	 *        SourceEndpointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ProtocolEndpoint REF[]'" TargetEndpointUnique="false" TargetEndpointMany="true"
	 *        TargetEndpointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ProtocolEndpoint REF[]'" GoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_SettingData'" ReplicationPipeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_NetworkPipe REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..0xFFFF\"]' Values='[\"Success\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Busy\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateOrModifyReplicationPipe(String PipeElementName, CIM_ComputerSystem SourceSystem, CIM_ComputerSystem TargetSystem, EList<CIM_ProtocolEndpoint> SourceEndpoint, EList<CIM_ProtocolEndpoint> TargetEndpoint, String Goal, CIM_NetworkPipe ReplicationPipe);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create (or start a job to create) a replication buffer that buffers asynchronous write operations for remote mirror pairs. The buffer is an instance of CIM_Memory with an AssociatedMemory association to a hosting system or to a replication network pipe. The buffer element may be created based on a StorageExtent, in a pool or in a manner opaque to a client. If 0 is returned, the function completed successfully and no ConcreteJob instance is created. If 0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter. A return value of 1 indicates the method is not supported. All other values indicate some type of error condition. 
	 * 
	 * If Job Completed with No Error (0) is returned, the function completed successfully and a ConcreteJob instance is not created. 
	 * 
	 * If Method Parameters Checked - Job Started (0x1000) is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter. 
	 * 
	 * A return value of Not Supported (1) indicates the method is not supported. 
	 * 
	 * All other values indicate some type of error condition.
	 * @param Job Reference to the job (may be null if the task completed).
	 * @param Host The hosting system or replication pipe that will be antecedent to the created buffer.
	 * @param TargetElement Reference to a component extent for the buffer element.
	 * @param TargetPool Reference to a container pool for the buffer element.
	 * @param ReplicaBuffer Reference to the created replica buffer element.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" HostAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Required='true'" TargetElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StorageExtent REF'" TargetPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF'" ReplicaBufferAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Memory REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x1000\",\"0x1001..0x7FFF\",\"0x8000..0xFFFF\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateReplicationBuffer(CIM_ConcreteJob Job, CIM_ManagedElement Host, CIM_StorageExtent TargetElement, CIM_StoragePool TargetPool, CIM_Memory ReplicaBuffer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given a source volume and a set of storage pools, this method will return a list of candidate target volumes. Since the rules for determining potential target volumes for a copy operation are not always straightforward, due to certain conditions, such as RAID level, the number of extents which consist of the StorageVolume, the type of storage array, and so on, it can be difficult for the client to know which volumes can be used as copy targets for a given source volume. This makes it difficult for the user to create a copy pair with the AttachOrModifyReplica because he must know which volumes can be used for target volume for a particular source volume, otherwise the request may fail.
	 * @param SourceElement The original source volume for the pair.
	 * @param TargetPool
	 *   The arrays of the pools to search for target volumes. The method finds candidate target volumes from the available volumes in the specified TargetPools. This does include volumes with a Usage property value of reserved for copy target.
	 *   If null, the method finds volumes from all of the pools.
	 * @param CopyType
	 *   Copy type:
	 *   2: Async
	 *   3: Sync
	 *   4: UnSyncAssoc
	 *   5: UnSyncUnAssoc
	 *   6: Migrate
	 * @param Candidates The list of the target volumes as the candidates.
	 * <!-- end-model-doc -->
	 * @model SourceElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF' Required='true'" TargetPoolUnique="false" TargetPoolMany="true"
	 *        TargetPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF[]'" CopyTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true'" CandidatesUnique="false" CandidatesMany="true"
	 *        CandidatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetAvailableTargetElements(CIM_LogicalElement SourceElement, EList<CIM_StoragePool> TargetPool, Integer CopyType, EList<CIM_LogicalElement> Candidates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows retrieving elements that meet the specified Usage. The criteria can be "available only", "in use only", or both.
	 * @param ElementType Enumeration indicating the type of elements to get.
	 * @param Usage The specific Usage to be retrieved.
	 * @param Criteria Specifies whether to retrieve all elements, available elements only, or the elements that are in use.
	 * @param ThePool Limit the search for the elements that satisfy the criteria to this StoragePool only. If null, all appropriate StoragePools will be considered.
	 * @param TheElements Array of references to storage element instances retrieved.
	 * <!-- end-model-doc -->
	 * @model ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"StorageVolume\",\"StorageExtent\",\"StoragePool\",\"Logical Disk\",\"DMTF Reserved\",\"Vendor Specific\"]'" UsageAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StoragePool.Usage\",\"CIM_StorageExtent.Usage\"]'" CriteriaAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"All\",\"Available Only\",\"In Use Only\",\"DMTF Reserved\",\"Vendor Specific\"]'" ThePoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_StoragePool REF'" TheElementsUnique="false" TheElementsMany="true"
	 *        TheElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedSystemElement REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetElementsBasedOnUsage(Integer ElementType, Integer Usage, Integer Criteria, CIM_StoragePool ThePool, EList<CIM_ManagedSystemElement> TheElements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows a client to request the Usage to be set if the client has access to the element supplied and the request is valid.
	 * @param Operation The action to perform.
	 * @param UsageValue Applicable requested usage/restriction -- see the appropriate Usage ValueMap.
	 * @param OtherUsageDescription New description text. Applicable when the usage value includes "Other".
	 * @param Job Reference to the job (may be null if job completed).
	 * @param TheElement The storage element to modify.
	 * <!-- end-model-doc -->
	 * @model OperationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Set\",\"Modify \\\"Other\\\" description only\",\"DMTF Reserved\",\"Vendor Specific\"]'" UsageValueAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_StoragePool.Usage\",\"CIM_StorageExtent.Usage\"]'" OtherUsageDescriptionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' Out='true'" TheElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"Not Authorized\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RequestUsageChange(Integer Operation, Integer UsageValue, String OtherUsageDescription, CIM_ConcreteJob Job, CIM_LogicalElement TheElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start a job to delete elements previously created from StoragePools. The freed space is returned to the source StoragePool. If 0 is returned, the function completed successfully and no ConcreteJob was required. If 4096/0x1000 is returned, a ConcreteJob will be started to delete the element. A reference to the Job is returned in the Job parameter.
	 * @param Options
	 *   Additional options. 
	 *   Continue on nonexistent element: if the method encounters a non-existent element in the list of elements supplied, the method continues to delete the remaining elements. Return error on nonexistent element: if the method encounters a non-existent element in the list of elements supplied, the method returns an error.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param TheElements References to the elements to return to the StoragePool.
	 * <!-- end-model-doc -->
	 * @model OptionsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Continue on nonexistent element\",\"Return error on nonexistent element\",\"DMTF Reserved\",\"Vendor Specific\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TheElementsUnique="false" TheElementsMany="true"
	 *        TheElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]' Required='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"32768..65535\"]' Values='[\"Job Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ReturnElementsToStoragePool(Integer Options, CIM_ConcreteJob Job, EList<CIM_LogicalElement> TheElements);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method requests that the system rescan SCSI devices for changes in their configuration. If called on a general-purpose host, the changes are reflected in the list of devices available to applications (for example, the UNIX 'device tree'. This method may also be used on a storage appliance to force rescanning of attached SCSI devices. 
	 * 
	 * This operation can be disruptive; optional parameters allow the caller to limit the scan to a single or set of SCSI device elements. All parameters are optional; if parameters other Job are passed in as null, a full scan is invoked.
	 * @param Job Reference to the job (may be null if job completed).
	 * @param ConnectionType The type of connection, constrains the scan to initiator ports of this type. Only used if the Initiators parameter is null.
	 * @param OtherConnectionType The connection type, if the ConnectionType parameter is "Other".
	 * @param Initiators A list of references to initiators. Scanning will be limited to SCSI targets attached to these initiators. If this parameter is null and connection is specified, all initiators of that connection type are scanned. If this parameter and ConnectionType are null, all targets on all system initiators are probed.
	 * @param Targets A list of names or numbers for targets. These should be formatted to match the appropriate connection type, For example, PortWWNs would be specified for Fibre Channel targets.
	 * @param LogicalUnits A list of SCSI logical unit numbers representing logical units hosted on the targets specified in the Targets argument.
	 * <!-- end-model-doc -->
	 * @model JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' Out='true'" ConnectionTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\"]' Values='[\"Other\",\"Fibre Channel\",\"Parallel SCSI\",\"SSA\",\"IEEE 1394\",\"RDMA\",\"iSCSI\",\"SAS\",\"ADT\"]' ModelCorrespondence='[\"CIM_SCSIProtocolEndpoint.ConnectionType\"]'" OtherConnectionTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" InitiatorsUnique="false" InitiatorsMany="true"
	 *        InitiatorsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SCSIProtocolEndpoint REF[]'" TargetsUnique="false" TargetsMany="true"
	 *        TargetsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" LogicalUnitsUnique="false" LogicalUnitsMany="true"
	 *        LogicalUnitsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6..4095\",\"4096\",\"4097\",\"4098\",\"4099\",\"4100\",\"..\",\"32768..65535\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"DMTF Reserved\",\"Invalid connection type\",\"Invalid Initiator\",\"No matching target found\",\"No matching LUs found\",\"Prohibited by name binding configuration\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ScsiScan(CIM_ConcreteJob Job, Integer ConnectionType, String OtherConnectionType, EList<CIM_SCSIProtocolEndpoint> Initiators, EList<String> Targets, EList<String> LogicalUnits);

} // CIM_StorageConfigurationService

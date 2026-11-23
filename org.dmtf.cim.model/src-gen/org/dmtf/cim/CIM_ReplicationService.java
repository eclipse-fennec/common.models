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
 * A representation of the model object '<em><b>CIM Replication Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ReplicationService class provides methods to allow a client to manage copy operations on storage objects, including management of replication groups, manipulation of replication operations, and retrieval of replication relationships.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.49.0' UMLPackagePath='CIM::Device::StorageServices' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_ReplicationService extends CIM_Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a new replication group.
	 * @param GroupName If nameable, an end user relevant name for the group being created. If NULL or not nameable, then system assigns a name.
	 * @param Members List of elements to add to the group -- order is maintained. If NULL, the group will be empty -- if empty groups are supported.
	 * @param Persistent If false, the group, not the elements associated with the group, may be deleted at the completion of a copy operation. Use the intrinsic method ModifyInstance to change Persistency of a group.
	 * @param DeleteOnEmptyElement If true and empty groups are allowed, the group will be deleted when the last element is removed from the group. If empty groups are not allowed, the group will be deleted automatically when the group becomes empty. If this parameter is not NULL, its value will be used to set the group's DeleteOnEmptyElement property. Use the intrinsic method ModifyInstance to change this property after the group is created.
	 * @param DeleteOnUnassociated If true, the group will be deleted when the group is no longer associated with another group. This can happen if all synchronization associations to the individual elements of the group are dissolved. If this parameter is not NULL, its value will be used to set the group's DeleteOnUnassociated property. Use the intrinsic method ModifyInstance to change this property after the group is created.
	 * @param ServiceAccessPoint Reference to access point information to allow the service to create a group on a remote system. If NULL, the group is created on the local system.
	 * @param ReplicationGroup Reference to the created group.
	 * @param ReplicationSettingData If supplied, it provides additional replication settings for the method. For example, to supply the "Description" for the created group.
	 * @param ReservedAs
	 *   The created group is reserved to be the source or the target of a copy operation. 
	 *   If not supplied, the group can be either the source or the target (4).
	 * <!-- end-model-doc -->
	 * @model GroupNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" MembersUnique="false" MembersMany="true"
	 *        MembersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]'" PersistentAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" DeleteOnEmptyElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" DeleteOnUnassociatedAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" ServiceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" ReplicationGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ReplicationGroup REF' In='false' Out='true'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" ReservedAsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Source Only\",\"Target Only\",\"Source or Target\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Groups are not nameable\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateGroup(String GroupName, EList<CIM_LogicalElement> Members, Boolean Persistent, Boolean DeleteOnEmptyElement, Boolean DeleteOnUnassociated, CIM_ServiceAccessPoint ServiceAccessPoint, CIM_ReplicationGroup ReplicationGroup, String ReplicationSettingData, Integer ReservedAs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delete a replication group.
	 * @param ReplicationGroup Reference to a replication group.
	 * @param ServiceAccessPoint Reference to access point information to allow the service to delete the group on a remote system.
	 * @param RemoveElements Delete the group even if it is not empty. If one or more elements in the group are in a replication relationship, RemoveElements has no effect.
	 * @param ReplicationSettingData If supplied, it provides additional replication settings for the method. For example, what should happen OnGroupOrListError.
	 * <!-- end-model-doc -->
	 * @model ReplicationGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ReplicationGroup REF' Required='true'" ServiceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" RemoveElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"One or more elements in a replication relationship\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long DeleteGroup(CIM_ReplicationGroup ReplicationGroup, CIM_ServiceAccessPoint ServiceAccessPoint, Boolean RemoveElements, String ReplicationSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Add members to an existing replication group.
	 * @param Members List of elements to add to the group. New members are added, in the order supplied, to the end of the existing members of the group. It is not an error, if a new member is already in the group.
	 * @param ReplicationGroup Reference to an existing replication group.
	 * @param ServiceAccessPoint Reference to access point information to allow the service to access the group on a remote system.
	 * @param ReplicationSettingData If supplied, it provides additional replication settings for the method. For example, what should happen OnGroupOrListError.
	 * <!-- end-model-doc -->
	 * @model MembersUnique="false" MembersMany="true"
	 *        MembersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]'" ReplicationGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ReplicationGroup REF' Required='true'" ServiceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Group does not exist\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddMembers(EList<CIM_LogicalElement> Members, CIM_ReplicationGroup ReplicationGroup, CIM_ServiceAccessPoint ServiceAccessPoint, String ReplicationSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Remove members from a replication group.
	 * @param Members List of elements to remove from a group. A member can not be removed if it is in a replication relationship. Deleting all members of a group is equivalent to deleting the group if empty groups are not supported by the implementation.
	 * @param DeleteOnEmptyElement If true and removal of the members causes the group to become empty, the group will be deleted. Note, if empty groups are not allowed, the group will be deleted automatically when the group becomes empty. If this parameter is not NULL, it overrides the group's property DeleteOnEmptyElement.
	 * @param ReplicationGroup Reference to an existing replication group.
	 * @param ServiceAccessPoint Reference to access point information to allow the service to access the group on a remote system.
	 * @param ReplicationSettingData If supplied, it provides additional replication settings for the method. For example, what should happen OnGroupOrListError.
	 * <!-- end-model-doc -->
	 * @model MembersUnique="false" MembersMany="true"
	 *        MembersAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]'" DeleteOnEmptyElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" ReplicationGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ReplicationGroup REF' Required='true'" ServiceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Group does not exist\",\"Member not in group\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RemoveMembers(EList<CIM_LogicalElement> Members, Boolean DeleteOnEmptyElement, CIM_ReplicationGroup ReplicationGroup, CIM_ServiceAccessPoint ServiceAccessPoint, String ReplicationSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create (or start a job to create) a new storage object, which is a replica of the specified source storage object (SourceElement). Note that using the input parameter, SyncType, this function can be used to instantiate the replica, and to create an ongoing association between the source and replica. If 0 is returned, the function completed successfully and no ConcreteJob instance created. If 4096/0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter.
	 * @param ElementName A end user relevant name for the element being created. If NULL, then a system supplied default name can be used. The value will be stored in the 'ElementName' property for the created element.
	 * @param SyncType SyncType describes the type of copy that will be made.
	 * @param Mode
	 *   Mode describes whether the target elements will be updated synchronously or asynchronously. 
	 *   Adaptive: Allows implementation to dynamically switch between synchronous and asynchronous modes. 
	 *   If NULL, implementation decides the mode.
	 * @param SourceElement The source storage object which may be a StorageVolume or other storage objects.
	 * @param SourceAccessPoint Reference to source access point information. If NULL, service does not need access information to access the source element.
	 * @param TargetElement Optionally, as an input, refers to a target element to use. As an output, refers to the created target storage element (i.e., the replica). If a job is created, the target element may not be available immediately.
	 * @param TargetAccessPoint Reference to target access point information. If NULL, service does not need access information to access the target elements.
	 * @param ReplicationSettingData If provided, it overrides the default replication setting data for the given SyncType. If not provided, the management server uses the default replication setting data.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param Synchronization Reference to the created association between the source and the target element. If a job is created, this parameter may be NULL unless the association is actually formed.
	 * @param TargetSettingGoal The definition for the SettingData to be maintained by the target storage object (the replica). If a target element is supplied, this parameter shall be NULL.
	 * @param TargetPool The underlying storage for the target element (the replica) will be drawn from TargetPool if specified, otherwise the allocation is implementation specific. If a target element is supplied, this parameter shall be NULL.
	 * @param WaitForCopyState Method must wait until this CopyState is reached before returning. Only a subset of valid CopyStates apply. For example, Initialized: Associations have been established, but there is no data flow. Inactive: Initialization is complete, but the data flow remains idle until it is activated. Synchronized: Replicas are an exact copy of the source. UnSynchronized: Copy operation is in progress.
	 * @param ConnectivityCollection Reference to the ConnectivityCollection - for example, a RemoteReplicationCollection. Since a RemoteReplicationCollection aggregates the ProtocolEndpoints that provide the paths to a remote system, generally, it is not necessary to supply both the ConnectivityCollection and the ServiceAccessPoint.
	 * @param Collections The target elements are added to each referenced collection, for example, DeviceMaskingGroups.
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" SyncTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"..\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"DMTF Reserved\",\"Mirror\",\"Snapshot\",\"Clone\",\"TokenizedClone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"Adaptive\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" SourceElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF' Required='true'" SourceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" TargetElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF' Out='true'" TargetAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SynchronizationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF' In='false' Out='true'" TargetSettingGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingData REF'" TargetPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF'" WaitForCopyStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" ConnectivityCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConnectivityCollection REF'" CollectionsUnique="false" CollectionsMany="true"
	 *        CollectionsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Collection REF[]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateElementReplica(String ElementName, Integer SyncType, Integer Mode, CIM_LogicalElement SourceElement, CIM_ServiceAccessPoint SourceAccessPoint, CIM_LogicalElement TargetElement, CIM_ServiceAccessPoint TargetAccessPoint, String ReplicationSettingData, CIM_ConcreteJob Job, CIM_Synchronized Synchronization, CIM_SettingData TargetSettingGoal, CIM_ResourcePool TargetPool, Integer WaitForCopyState, CIM_ConnectivityCollection ConnectivityCollection, EList<CIM_Collection> Collections);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create (or start a job to create) a new group of storage objects which are replicas of the specified source storage or a group of source storage objects (SourceElements). Note that using the input parameter, SyncType, this function can be used to instantiate the replicas, and to create an ongoing association between the source(s) and replicas. If 0 is returned, the function completed successfully and no ConcreteJob instance is created. If 4096/0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter.
	 * @param RelationshipName A user relevant name for the relationship between the source and target groups or between a source element and a target group (i.e. one-to-many). If NULL, the implementation assigns a name. If the individual target elements require an ElementName, the implementation constructs an appropriate ElementName using the RelationshipName. For example, RelationshipName as a prefix followed by "_n" sequence number, where n is a number beginning with 1.
	 * @param SyncType SyncType describes the type of copy that will be made.
	 * @param Mode
	 *   Mode describes whether the target elements will be updated synchronously or asynchronously. 
	 *   Adaptive: Allows implementation to dynamically switch between synchronous and asynchronous modes. 
	 *   If NULL, implementation decides the mode.
	 * @param SourceGroup A group of source storage objects which may be one or more StorageVolumes or other storage objects. If this parameter is not supplied, SourceElement is required. Both SourceGroup and SourceElement shall not be supplied.
	 * @param SourceElement The source storage object which may be a StorageVolume or other storage objects. If this parameter is not supplied, SourceGroup is required. Both SourceGroup and SourceElement shall not be supplied.
	 * @param SourceAccessPoint Reference to source access point information. If NULL, service does not need access information to access the source element.
	 * @param TargetGroup Optionally, as an input, refers to a target group to use. As an output, refers to the created target group (i.e., the replica group). If a job is created, the target group may not be available immediately. If TargetGroup is supplied, TargetElementCount shall be NULL.
	 * @param TargetElementCount This parameter applies to one-source-to-many-target- elements. It is possible to create multiple copies of a source element. If TargetGroup is supplied, this parameter shall be NULL.
	 * @param TargetAccessPoint Reference to target access point information. If NULL, service does not need access information to access the target element/group.
	 * @param Consistency Overrides the default group consistency.
	 * @param ReplicationSettingData If provided, it overrides the default replication setting data for the given SyncType. If not provided, the management server uses the default replication setting data.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param Synchronization Reference to the created group association between the source and the target elements. If a job is created, this parameter may be NULL until the association is actually formed.
	 * @param TargetSettingGoal The definition for the SettingData to be maintained by the target storage objects (the replicas). If target elements are supplied, this parameter shall be NULL.
	 * @param TargetPool The underlying storage for the target elements (the replicas) will be drawn from TargetPool if specified, otherwise the allocation is implementation specific. If target elements are supplied, this parameter shall be NULL.
	 * @param WaitForCopyState Method must wait until this CopyState is reached before returning. Only a subset of valid CopyStates apply. For example, Initialized: Associations have been established, but there is no data flow. Inactive: Initialization is complete, but the data flow remains idle until it is activated. Synchronized: Replicas are an exact copy of the source. UnSynchronized: Copy operation is in progress.
	 * @param ConnectivityCollection Reference to the ConnectivityCollection - for example, a RemoteReplicationCollection. Since a RemoteReplicationCollection aggregates the ProtocolEndpoints that provide the paths to a remote system, generally, it is not necessary to supply both the ConnectivityCollection and the ServiceAccessPoint.
	 * @param Collections The target elements are added to each referenced collection, for example, DeviceMaskingGroups.
	 * <!-- end-model-doc -->
	 * @model RelationshipNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" SyncTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"..\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"DMTF Reserved\",\"Mirror\",\"Snapshot\",\"Clone\",\"TokenizedClone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"Adaptive\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" SourceGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ReplicationGroup REF'" SourceElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF'" SourceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" TargetGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ReplicationGroup REF' Out='true'" TargetElementCountAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'" TargetAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" ConsistencyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"No Consistency\",\"Sequential Consistency\",\"DMTF Reserved\",\"Vendor Specific\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SynchronizationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF' In='false' Out='true'" TargetSettingGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingData REF'" TargetPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF'" WaitForCopyStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" ConnectivityCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConnectivityCollection REF'" CollectionsUnique="false" CollectionsMany="true"
	 *        CollectionsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Collection REF[]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateGroupReplica(String RelationshipName, Integer SyncType, Integer Mode, CIM_ReplicationGroup SourceGroup, CIM_LogicalElement SourceElement, CIM_ServiceAccessPoint SourceAccessPoint, CIM_ReplicationGroup TargetGroup, Long TargetElementCount, CIM_ServiceAccessPoint TargetAccessPoint, Integer Consistency, String ReplicationSettingData, CIM_ConcreteJob Job, CIM_Synchronized Synchronization, CIM_SettingData TargetSettingGoal, CIM_ResourcePool TargetPool, Integer WaitForCopyState, CIM_ConnectivityCollection ConnectivityCollection, EList<CIM_Collection> Collections);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create (or start a job to create) a new point-in-time representation of a source element. This representation may be of a form of pointers that keep track of data at the time the point-in-time was created, or a series checkpoints that capture the view of data on the source elements at the time of point-in-time. This method does not include a target element, however, a target element can be added subsequently using the ModifySettingsDefineState method. If the method executes successfully, a SettingsDefineState association is created between the source element and the SynchronizationAspect, which will have the datetime of the point-in-time.
	 * @param Name A end user relevant name for the element or relationship being created. If NULL, then a system supplied default name can be used. The value will be stored in the ElementName or relationship name depending on whether an element is created or a group.
	 * @param SyncType SyncType describes the type of copy that will be made.
	 * @param Mode
	 *   Mode describes whether the target elements will be updated synchronously or asynchronously. 
	 *   Adaptive: Allows implementation to dynamically switch between synchronous and asynchronous modes. 
	 *   If NULL, implementation decides the mode.
	 * @param SourceGroup A group of source storage objects which may be one or more StorageVolumes or other storage objects. If this parameter is not supplied, SourceElement is required. Both SourceGroup and SourceElement shall not be supplied.
	 * @param SourceElement The source storage object which may be a StorageVolume or other storage objects. If this parameter is not supplied, SourceGroup is required. Both SourceGroup and SourceElement shall not be supplied.
	 * @param SourceAccessPoint Reference to source access point information. If NULL, service does not need access information to access the source element/group.
	 * @param Consistency Overrides the default group consistency.
	 * @param ReplicationSettingData If provided, it overrides the default replication setting data for the given SyncType. If not provided, the management server uses the default replication setting data.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param SettingsState Reference to the created association between the source element or group and an instance of SynchronizationAspect. If a job is created, this parameter may be NULL unless the association is actually formed.
	 * <!-- end-model-doc -->
	 * @model NameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" SyncTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"..\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"DMTF Reserved\",\"Mirror\",\"Snapshot\",\"Clone\",\"TokenizedClone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"Adaptive\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" SourceGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ReplicationGroup REF'" SourceElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" SourceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" ConsistencyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"No Consistency\",\"Sequential Consistency\",\"DMTF Reserved\",\"Vendor Specific\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SettingsStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingsDefineState REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateSynchronizationAspect(String Name, Integer SyncType, Integer Mode, CIM_ReplicationGroup SourceGroup, CIM_ManagedElement SourceElement, CIM_ServiceAccessPoint SourceAccessPoint, Integer Consistency, String ReplicationSettingData, CIM_ConcreteJob Job, CIM_SettingsDefineState SettingsState);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modify (or start a job to modify) the synchronization association between two storage objects or replication groups. If 0 is returned, the function completed successfully and no ConcreteJob instance was created. If 0x1000 is returned, a ConcreteJob was started and a reference to this Job is returned in the Job output parameter. A return value of 1 indicates the method is not supported. All other values indicate some type of error condition.
	 * @param Operation
	 *   Operation describes the type of modification to be made to the replica and/or to the related associations. 
	 *   Abort: Abort the copy operation if it is possible. Activate Consistency: if consistency was not requested when CreateGroupReplica was called. If Consistency is already active, no modification is made. 
	 *   Activate: Activate an inactive or prepared Synchronized association. 
	 *   AddSyncPair: Add pairs of elements already in a relationship to source and target groups -- see SyncPair parameter. 
	 *   Deactivate Consistency: Deactivate consistency. If consistency was not enabled, this operation has no effect. 
	 *   Deactivate: Stop the data flow. Writes to source element are not copied to target. For Snapshots, writes to target are lost as the pointers to changed data are deleted. 
	 *   Detach: 'Forget' the synchronization between two storage objects. Start to treat the objects as independent. 
	 *   Dissolve: Dissolve the synchronization between two storage objects, however, the target element continues to exist. 
	 *   Failover: Use the target element as the source elements. 
	 *   Failback: Reverse the effect of failback. 
	 *   Fracture: Suspend the synchronization between two storage objects. The association and (typically) changes are remembered to allow a fast resynchronization. This may be used during a backup cycle to allow one of the objects to be copied while the other remains in production. 
	 *   RemoveSyncPair: Remove the pair associated via StorageSynchronized from the source and target groups. The pair continue to remain associated but not in the groups. 
	 *   Resync Replica: Re-establish the synchronization. This will negate the action of a previous Fracture/Split operation. Recreate a Point In Time image for a Snapshot or a Clone replication. Restart a Broken or Aborted synchronization relationship. 
	 *   Restore from Replica: Renew the contents of the original storage object from a replica. 
	 *   Resume: Continue the copy operation of a suspended association. 
	 *   Reset To Sync: Change the Mode of the copy operation to Synchronous (e.g., from the Asynchronous Mode). 
	 *   Reset To Async: Change the Mode of the copy operation to Asynchronous (e.g., from the Synchronous Mode). 
	 *   Return to ResourcePool: Dissolve a snapshot and free up its space back to the storage pool. 
	 *   Reverse Roles: Source element becomes the target element and vise versa. 
	 *   Split: Same as Fracture, however steps are taken to ensure the target elements are consistent. For example, stop I/O to source elements, wait for in-transit copy operations between source and target elements to stop, then instantly split source/target groups/elements. Suspend: Stop the background copy previously started. 
	 *   Unprepare: note, this operation has been deprecated. Use "Prepare" instead. 
	 *   Prepare: Causes the synchronization to be reinitialized. 
	 *   Reset To Adaptive: Change the Mode of the copy operation to Adaptive. 
	 *   Reset to Active: Change the Mode of the copy operation to Active. 
	 *   Reset Replica: Causes replica to go back to its original point-in-time.
	 * @param Synchronization The reference to the replication association describing the elements/groups relationship.
	 * @param ReplicationSettingData If provided, it overrides the default replication setting data for the given SyncType. If not provided, the management server uses the default replication setting data.
	 * @param SyncPair This parameter applies to AddSyncPair/RemoveSyncPair Operations.
	 * @param Job Reference to the job (may be NULL if the task completed).
	 * @param SettingsState Reference to the association between the source element and an instance of SynchronizationAspect. This parameters applies to operations such as Dissolve, which dissolves the Synchronized relationship, but causes the SettingDefineState association to be created.
	 * @param Force Some operations may cause an inconsistency among the target elements. If true, the client is not warned and the operation is performed.
	 * @param WaitForCopyState Method must wait until this CopyState is reached before returning. Only a subset of valid CopyStates apply. For example, Initialized: Associations have been established, but there is no data flow. Inactive: Initialization is complete, but the data flow remains idle until it is activated. Synchronized: Replicas are an exact copy of the source. UnSynchronized: Copy operation is in progress. Fractured/Split: Target elements are separated from the source elements. Etc.
	 * @param UpdatedSynchronization If the operation updates the keys of the supplied Synchronization parameter, a reference to the updated Synchronization parameter is returned in this parameter.
	 * <!-- end-model-doc -->
	 * @model OperationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Abort\",\"Activate Consistency\",\"Activate\",\"AddSyncPair\",\"Deactivate Consistency\",\"Deactivate\",\"Detach\",\"Dissolve\",\"Failover\",\"Failback\",\"Fracture\",\"RemoveSyncPair\",\"Resync Replica\",\"Restore from Replica\",\"Resume\",\"Reset To Sync\",\"Reset To Async\",\"Return To ResourcePool\",\"Reverse Roles\",\"Split\",\"Suspend\",\"Unprepare\",\"Prepare\",\"Reset to Adaptive\",\"Reset to Active\",\"Reset Replica\",\"DMTF Reserved\",\"Vendor Specific\"]'" SynchronizationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF' Required='true'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" SyncPairUnique="false" SyncPairMany="true"
	 *        SyncPairAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF[]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SettingsStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingsDefineState REF' In='false' Out='true'" ForceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" WaitForCopyStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" UpdatedSynchronizationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ModifyReplicaSynchronization(Integer Operation, CIM_Synchronized Synchronization, String ReplicationSettingData, EList<CIM_Synchronized> SyncPair, CIM_ConcreteJob Job, CIM_SettingsDefineState SettingsState, Boolean Force, Integer WaitForCopyState, CIM_Synchronized UpdatedSynchronization);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modify (or start a job to modify) an array of synchronization associations between two storage objects or replication groups. If 0 is returned, the function completed successfully and no ConcreteJob instance was created. If 4096 is returned, a ConcreteJob was started and a reference to this Job is returned in the Job output parameter. A return value of 1 indicates the method is not supported. All other values indicate some type of error condition.
	 * @param Operation
	 *   Operation describes the type of modification to be made to the replica and/or to the related associations. 
	 *   Abort: Abort the copy operation if it is possible. Activate: Activate an inactive or prepared Synchronized association. 
	 *   Deactivate: Stop the data flow. Writes to source element are not copied to target. For Snapshots, writes to target are lost as the pointers to changed data are deleted. 
	 *   Detach: 'Forget' the synchronization between two storage objects. Start to treat the objects as independent. 
	 *   Dissolve: Dissolve the synchronization between two storage objects, however, the target element continues to exist. 
	 *   Failover: Use the target element as the source elements. 
	 *   Failback: Reverse the effect of failback. 
	 *   Fracture: Suspend the synchronization between two storage objects using Mirror or Snapshot replication. The association and (typically) changes are remembered to allow a fast resynchronization. This may be used during a backup cycle to allow one of the objects to be copied while the other remains in production. 
	 *   Resync Replica: Re-establish the synchronization. This will negate the action of a previous Fracture/Split operation. Recreate a Point In Time image for a Snapshot or a Clone replication. Restart a Broken or Aborted synchronization relationship. 
	 *   Restore from Replica: Renew the contents of the original storage object from a replica. 
	 *   Resume: Continue the copy operation of a suspended association. 
	 *   Reset To Sync: Change the Mode of the copy operations to Synchronous (e.g., from the Asynchronous Mode). 
	 *   Reset To Async: Change the Mode of the copy operations to Asynchronous (e.g., from the Synchronous Mode). 
	 *   Return to ResourcePool: Dissolve a snapshot and free up its space back to the storage pool. 
	 *   Reverse Roles: Source element becomes the target element and vise versa. 
	 *   Split: Same as Fracture, however steps are taken to ensure the target elements are consistent. For example, stop I/O to source elements, wait for in-transit copy operations between source and target elements to stop, then instantly split source/target groups/elements. 
	 *   Suspend: Stop the background copy previously started. 
	 *   Unprepare: note, this operation has been deprecated. Use "Prepare" instead. 
	 *   Prepare: Causes the synchronization to be reinitialized. 
	 *   Reset To Adaptive: Change the Mode of the copy operation to Adaptive. 
	 *   Reset to Active: Change the Mode of the copy operation to Active. 
	 *   Reset Replica: Causes replica to go back to its original point-in-time.
	 * @param Synchronization Array of replication associations describing the elements/groups relationship. All elements of this array shall be the same concrete class, i.e. StorageSynchronized or GroupSynchronized, and shall have the same SyncType, the same Mode, and the Operation must be valid for the ReplicationType -- SyncType, Mode, Local/Remote.
	 * @param ReplicationSettingData If provided, it overrides the default replication setting data for the given SyncType. If not provided, the management server uses the default replication setting data.
	 * @param Job Reference to the job (may be NULL if the task completed).
	 * @param SettingsState References to the associations between the source element and an instance of SynchronizationAspect. This parameters applies to operations such as Dissolve, which dissolves the Synchronized relationship, but causes the SettingDefineState association to be created..
	 * @param Force Some operations may cause an inconsistency among the target elements. If true, the client is not warned and the operation is performed.
	 * @param WaitForCopyState Method must wait until this CopyState is reached before returning. Only a subset of valid CopyStates apply. For example, Initialized: Associations have been established, but there is no data flow. Inactive: Initialization is complete, but the data flow remains idle until it is activated. Synchronized: Replicas are an exact copy of the source. UnSynchronized: Copy operation is in progress. Fractured/Split: Target elements are separated from the source elements. Etc.
	 * @param UpdatedSynchronizations If the operation updates the keys of the supplied synchronizations in the Synchronization parameter, references to the updated synchronizations are returned in this parameter.
	 * <!-- end-model-doc -->
	 * @model OperationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Abort\",\"DMTF Reserved\",\"Activate\",\"DMTF Reserved\",\"DMTF Reserved\",\"Deactivate\",\"Detach\",\"Dissolve\",\"Failover\",\"Failback\",\"Fracture\",\"DMTF Reserved\",\"Resync Replica\",\"Restore from Replica\",\"Resume\",\"Reset To Sync\",\"Reset To Async\",\"Return To ResourcePool\",\"Reverse Roles\",\"Split\",\"Suspend\",\"Unprepare\",\"Prepare\",\"Reset to Adaptive\",\"Reset to Active\",\"Reset Replica\",\"DMTF Reserved\",\"Vendor Specific\"]'" SynchronizationUnique="false" SynchronizationMany="true"
	 *        SynchronizationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF[]' Required='true'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SettingsStateUnique="false" SettingsStateMany="true"
	 *        SettingsStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingsDefineState REF[]' In='false' Out='true'" ForceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" WaitForCopyStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" UpdatedSynchronizationsUnique="false" UpdatedSynchronizationsMany="true"
	 *        UpdatedSynchronizationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ModifyListSynchronization(Integer Operation, EList<CIM_Synchronized> Synchronization, String ReplicationSettingData, CIM_ConcreteJob Job, EList<CIM_SettingsDefineState> SettingsState, Boolean Force, Integer WaitForCopyState, EList<CIM_Synchronized> UpdatedSynchronizations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modify (or start a job to modify) the SettingsDefineState association between the storage objects and SynchronizationAspect. The modification could range from introducing the target elements, which creates a new StorageSynchronized association to dissolving the SettingsDefineState association. If 0 is returned, the function completed successfully and no ConcreteJob instance was created. If 4096/0x1000 is returned, a ConcreteJob was started and a reference to this Job is returned in the Job output parameter. A return value of 1 indicates the method is not supported. All other values indicate some type of error condition.
	 * @param Operation
	 *   Operation describes the type of modification to be made to the related associations. 
	 *   Activate Consistency: if consistency was not requested when CreateSynchronizationAspect was called. If Consistency is already active, no modification is made. 
	 *   Deactivate Consistency: Deactivate consistency. If consistency was not enabled, this operation has no effect. 
	 *   Delete: Remove the SettingsDefineState association and the associated SynchronizationAspect. 
	 *   Copy To Target: Introduces the target elements and forms the necessary associations between the source and the target elements i.e. StorageSynchronized and GroupSynchronized. 
	 *   Detach: Removes the association between the SynchronizationAspect and the target element. 
	 *   Restore: Restore the source element from the associated SynchronizationAspect. 
	 *   Attach To Target: Same as Copy To Target except no data is copied.
	 * @param SettingsState Reference to the association between the source element and an instance of SynchronizationAspect.
	 * @param TargetElement Optionally, as an input, refers to a target element to use. If TargetElement is supplied, TargetGroup and TargetCount shall be NULL. As an output, refers to the created target storage element (i.e., the replica). If a job is created, the target element may not be available immediately.
	 * @param TargetGroup Optionally, as an input, refers to a target group to use. If TargetGroup is supplied, TargetElement and TargetCount shall be NULL. As an output, refers to the created target group (i.e., the replica group). If a job is created, the target group may not be available immediately. If TargetGroup is supplied, TargetElementCount shall be NULL.
	 * @param TargetElementCount This parameter applies to one-source-to-many-target- elements. It is possible to create multiple copies of a source element. If TargetCount is supplied, TargetElement and TargetGroup shall be NULL.
	 * @param TargetAccessPoint Reference to target access point information. If NULL, service does not need access information to access the target elements/group.
	 * @param Synchronization The reference to the created replication association describing the elements/groups relationship.
	 * @param ReplicationSettingData If provided, it overrides the default replication setting data for the given SyncType. If not provided, the management server uses the default replication setting data.
	 * @param Job Reference to the job (may be NULL if the task completed).
	 * @param TargetSettingGoal The definition for the SettingData to be maintained by the target storage object (the replica). If a target element is supplied, this parameter shall be NULL.
	 * @param TargetPool The underlying storage for the target element (the replica) will be drawn from TargetPool if specified, otherwise the allocation is implementation specific. If a target element is supplied, this parameter shall be NULL.
	 * @param WaitForCopyState Method must wait until this CopyState is reached before returning. Only a subset of valid CopyStates apply. For example, Initialized: Associations have been established, but there is no data flow. Inactive: Initialization is complete, but the data flow remains idle until it is activated. Synchronized: Replicas are an exact copy of the source. UnSynchronized: Copy operation is in progress. Fractured/Split: Target elements are separated from the source elements. Etc.
	 * @param ElementName A end user relevant name for the element being created. If NULL, then a system supplied default name can be used. The value will be stored in the 'ElementName' property for the created element.
	 * @param Collections The target elements are added to each referenced collection, for example, DeviceMaskingGroups.
	 * <!-- end-model-doc -->
	 * @model OperationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Activate Consistency\",\"Deactivate Consistency\",\"Delete\",\"Copy To Target\",\"Detach\",\"Restore\",\"Attach To Target\",\"DMTF Reserved\",\"Vendor Specific\"]'" SettingsStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingsDefineState REF' Required='true'" TargetElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF' Out='true'" TargetGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ReplicationGroup REF' Out='true'" TargetElementCountAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'" TargetAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" SynchronizationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF' In='false' Out='true'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TargetSettingGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingData REF'" TargetPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF'" WaitForCopyStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" CollectionsUnique="false" CollectionsMany="true"
	 *        CollectionsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Collection REF[]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ModifySettingsDefineState(Integer Operation, CIM_SettingsDefineState SettingsState, CIM_LogicalElement TargetElement, CIM_ReplicationGroup TargetGroup, Long TargetElementCount, CIM_ServiceAccessPoint TargetAccessPoint, CIM_Synchronized Synchronization, String ReplicationSettingData, CIM_ConcreteJob Job, CIM_SettingData TargetSettingGoal, CIM_ResourcePool TargetPool, Integer WaitForCopyState, String ElementName, EList<CIM_Collection> Collections);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get (or start a job to get) all of the candidate target elements for the supplied source element. If a job is started, once the job completes, examine the AffectedJobElement associations for candidate targets.
	 * @param SourceElement The source storage object which may be a StorageVolume or other storage objects.
	 * @param SyncType SyncType describes the type of copy.
	 * @param Mode
	 *   Mode describes whether the target elements will be updated synchronously or asynchronously. 
	 *   Adaptive: Allows implementation to dynamically switch between synchronous and asynchronous modes. 
	 *   If NULL, implementation decides the mode.
	 * @param ReplicationSettingData If provided, it overrides the default replication setting data for the given SyncType. If not provided, the management server uses the default replication setting data.
	 * @param TargetAccessPoint Reference to access point information. If NULL, only local system is examined.
	 * @param TargetSettingGoal Desired target SettingData. If NULL, settings of the source element will be used.
	 * @param TargetPools The storage pools for the target elements. If NULL, all storage pools (on the given system) will be examined.
	 * @param Job Reference to the job (may be NULL if the task completed).
	 * @param Candidates The list of the candidate target elements.
	 * @param MaxElementCount Specifies the maximum number of elements to be returned by the method.
	 * <!-- end-model-doc -->
	 * @model SourceElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF' Required='true'" SyncTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"..\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"DMTF Reserved\",\"Mirror\",\"Snapshot\",\"Clone\",\"TokenizedClone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"Adaptive\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" TargetAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" TargetSettingGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingData REF'" TargetPoolsUnique="false" TargetPoolsMany="true"
	 *        TargetPoolsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF[]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" CandidatesUnique="false" CandidatesMany="true"
	 *        CandidatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]' Out='true'" MaxElementCountAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetAvailableTargetElements(CIM_LogicalElement SourceElement, Integer SyncType, Integer Mode, String ReplicationSettingData, CIM_ServiceAccessPoint TargetAccessPoint, CIM_SettingData TargetSettingGoal, EList<CIM_ResourcePool> TargetPools, CIM_ConcreteJob Job, EList<CIM_LogicalElement> Candidates, Integer MaxElementCount);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get (or start a job to get) all of the peer systems. A peer system is a system that is known and visible to the Replication Service. Peer systems are discovered through discovery services and/or implementation specific services.If a job is started, once the job completes, examine the AffectedJobElement associations for the peer systems.
	 * @param Options This parameter specifies which peer systems to return. If NULL, all known systems are returned, whether those systems are currently reachable or not.
	 * @param Job Reference to the job (may be NULL if the task completed).
	 * @param Systems List of peer ComputerSystems.
	 * @param LocalAccessPoints An array of references to local ServiceAccessPoints (for example, ProtocolEndpoints) that allow communication to the remote system.
	 * @param RemoteAccessPoints An array of references to remote ServiceAccessPoints (for example, ProtocolEndpoints) that allow communication to the remote system.
	 * <!-- end-model-doc -->
	 * @model OptionsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Only systems currently reachable\",\"Include access points for systems currently reachable\",\"DMTF Reserved\",\"Vendor Specific\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SystemsUnique="false" SystemsMany="true"
	 *        SystemsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF[]' Out='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ReplicationService.GetPeerSystems(LocalAccessPoints)\",\"CIM_ReplicationService.GetPeerSystems(RemoteAccessPoints)\"]'" LocalAccessPointsUnique="false" LocalAccessPointsMany="true"
	 *        LocalAccessPointsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF[]' Out='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ReplicationService.GetPeerSystems(Systems)\"]'" RemoteAccessPointsUnique="false" RemoteAccessPointsMany="true"
	 *        RemoteAccessPointsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF[]' Out='true' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ReplicationService.GetPeerSystems(Systems)\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetPeerSystems(Integer Options, CIM_ConcreteJob Job, EList<CIM_ComputerSystem> Systems, EList<CIM_ServiceAccessPoint> LocalAccessPoints, EList<CIM_ServiceAccessPoint> RemoteAccessPoints);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get (or start a job to get) all of the synchronization relationships known to the processing replication service. If a job is started, once the job completes, examine the AffectedJobElement associations for the synchronization relationships.
	 * @param Type The type of synchronization relationships, for example, StorageSynchronized or GroupSynchronized. If this parameter is not supplied, all such relationships are retrieved.
	 * @param SyncType Describes the desired synchronization type. If this parameter is not specified, all SyncType are retrieved.
	 * @param Mode
	 *   Describes the desired mode. If this parameter is not supplied, both all modes are retrieved. 
	 *   Adaptive: Allows implementation to dynamically switch between synchronous and asynchronous modes.
	 * @param Locality
	 *   Describes the desired locality. If this parameter is not supplied, all replication relationships are retrieved, regardless of the locality of elements. 
	 *   Local only: Source and target elements are contained in the same system. 
	 *   Remote only: Source and target elements are contained in two different systems.
	 * @param CopyState Only retrieve synchronization relationships that are currently in this CopyState. If this parameter is not supplied, relationships are retrieved regardless of their current CopyState.
	 * @param Job Reference to the job (may be NULL if the task completed).
	 * @param Synchronizations An array of elements found.
	 * @param ReplicationSettingData If supplied, it provides additional replication settings to consider in locating the replication relationships, for example, the CopyMethodology -- which indicates how the copy operation is carried out -- for example, full or incremental mirroring.
	 * <!-- end-model-doc -->
	 * @model TypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"StorageSynchronized\",\"GroupSynchronized\",\"DMTF Reserved\",\"Vendor Specific\"]'" SyncTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"..\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"DMTF Reserved\",\"Mirror\",\"Snapshot\",\"Clone\",\"TokenizedClone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"Adaptive\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" LocalityAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Local only\",\"Remote only\",\"DMTF Reserved\",\"Vendor Specific\"]'" CopyStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SynchronizationsUnique="false" SynchronizationsMany="true"
	 *        SynchronizationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF[]' Out='true'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetReplicationRelationships(Integer Type, Integer SyncType, Integer Mode, Integer Locality, Integer CopyState, CIM_ConcreteJob Job, EList<CIM_Synchronized> Synchronizations, String ReplicationSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get (or start a job to get) ServiceAccessPoints associated with a peer system. If a job is started, once the job completes, examine the AffectedJobElement associations for the peer system's ServiceAccessPoints.
	 * @param System This parameter specifies the peer system.
	 * @param Job Reference to the job (may be NULL if the task completed).
	 * @param ServiceAccessPoints List of ServiceAccessPoints for the supplied System.
	 * <!-- end-model-doc -->
	 * @model SystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' Required='true'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" ServiceAccessPointsUnique="false" ServiceAccessPointsMany="true"
	 *        ServiceAccessPointsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetServiceAccessPoints(CIM_ComputerSystem System, CIM_ConcreteJob Job, EList<CIM_ServiceAccessPoint> ServiceAccessPoints);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Introduces a new instance of ReplicationEntity in the specified Namespace.
	 * @param Persistent If true, the instance must persist across Management Server reboot. If NULL, the value will be based on the default value of the class in the MOF. Use the intrinsic method ModifyInstance to change the Persistency value.
	 * @param InstanceNamespace Namespace of created instance. If null, created instance will be in the same namespace as the service.
	 * @param ReplicationEntityPath Reference to the created instance.
	 * <!-- end-model-doc -->
	 * @model ReplicationEntityAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' EmbeddedInstance='CIM_ReplicationEntity'" PersistentAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" InstanceNamespaceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" ReplicationEntityPathAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ReplicationEntity REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddReplicationEntity(String ReplicationEntity, Boolean Persistent, String InstanceNamespace, CIM_ReplicationEntity ReplicationEntityPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Introduces a new instance of a ServiceAccessPoint, or one of its subclasses, for example, a RemoteServiceAccessPoint in the specified namespace.
	 * @param InstanceNamespace Namespace of created instance. If null, created instance will be in the same namespace as the service.
	 * @param ServiceAccessPointPath Reference to the created instance.
	 * <!-- end-model-doc -->
	 * @model ServiceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' EmbeddedInstance='CIM_ServiceAccessPoint'" InstanceNamespaceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" ServiceAccessPointPathAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddServiceAccessPoint(String ServiceAccessPoint, String InstanceNamespace, CIM_ServiceAccessPoint ServiceAccessPointPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Introduces a new instance of SharedSecret in the specified namespace and optionally associates it to an instance of a ServiceAccessPoint.
	 * @param ServiceAccessPoint Associate created instance to this ServiceAccessPoint. If null, no such association is established.
	 * @param InstanceNamespace Namespace of created instance. If null, created instance will be in the same namespace as the the service.
	 * @param SharedSecretPath Reference to the created instance.
	 * <!-- end-model-doc -->
	 * @model SharedSecretAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' EmbeddedInstance='CIM_SharedSecret'" ServiceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" InstanceNamespaceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" SharedSecretPathAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SharedSecret REF' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddSharedSecret(String SharedSecret, CIM_ServiceAccessPoint ServiceAccessPoint, String InstanceNamespace, CIM_SharedSecret SharedSecretPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create (or start a job to create) new storage objects, which are replicas of the specified source storage objects (SourceElements). Note that using the input parameter, SyncType, this function can be used to instantiate the replicas, and to create an ongoing association between the source and replica elements. If 0 is returned, the function completed successfully and no ConcreteJob instance created. If 4096/0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter.
	 * @param ElementNames An array of end user relevant names for the elements being created. If NULL, then a system supplied name is used. The value will be stored in the 'ElementName' property for the created element. The first element of the array ElementNames is assigned to the first replica, the second element to the second replica and so on. If there are more SourceElements entries than ElementNames, the system supplied name is used.
	 * @param SyncType SyncType describes the type of copy that will be made. The same SyncType applies to all elements in the list.
	 * @param Mode
	 *   Mode describes whether the target elements will be updated synchronously or asynchronously. 
	 *   Adaptive: Allows implementation to dynamically switch between synchronous and asynchronous modes. 
	 *   If NULL, implementation decides the mode.
	 * @param SourceElements A list of source storage objects which may be StorageVolumes or other storage objects. All the source elements shall be of the same type -- for example, all StorageVolumes.
	 * @param SourceAccessPoint Reference to source access point information. If NULL, service does not need access information to access the source element. This parameter applies to all elements in the source list.
	 * @param TargetElements Optionally, as an input, refers to the target elements to use. If specified, the elements will match one to one with SourceElements[]. As an output, refers to the created target storage elements (i.e., the replicas). If a job is created, the target elements may not be available immediately.
	 * @param TargetAccessPoint Reference to target access point information. If NULL, service does not need access information to access the target elements. This parameter applies to all elements in the target list.
	 * @param ReplicationSettingData If provided, it overrides the default replication setting data for the given SyncType. If not provided, the provider uses the default replication setting data. The same ReplicationSettingData applies to all SourceElements entries.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param Synchronizations Reference to the created associations between the source and the target elements. If a job is created, this parameter may be NULL unless the associations are actually formed.
	 * @param TargetSettingGoal The definition for the SettingData to be maintained by the target storage objects (the replicas). If the target elements are supplied, this parameter shall be NULL. This parameter applies to all elements in the target list.
	 * @param TargetPool The underlying storage for the target elements (the replicas) will be drawn from TargetPool if specified, otherwise the allocation is implementation specific. If the target elements are supplied, this parameter shall be NULL. This parameter applies to all elements in the target list.
	 * @param WaitForCopyState Method must wait until this CopyState is reached before returning. Only a subset of valid CopyStates apply. For example, Initialized: Associations have been established, but there is no data flow. Inactive: Initialization is complete, but the copy operation remains idle until it is activated. Synchronized: Replicas are an exact copy of the sources. UnSynchronized: Copy operation is in progress. If this parameter is supplied, then all the created replication relationships shall have this supplied CopyState before the method returns.
	 * @param ConnectivityCollection Reference to the ConnectivityCollection - for example, a RemoteReplicationCollection. Since a RemoteReplicationCollection aggregates the ProtocolEndpoints that provide the paths to a remote system, generally, it is not necessary to supply both the ConnectivityCollection and the ServiceAccessPoint.
	 * @param Consistency Specifies whether consistency is to be maintained across the list of created replication relationships.
	 * @param Collections The target elements are added to each referenced collection, for example, DeviceMaskingGroups.
	 * <!-- end-model-doc -->
	 * @model ElementNamesUnique="false" ElementNamesMany="true"
	 *        ElementNamesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" SyncTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"..\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"DMTF Reserved\",\"Mirror\",\"Snapshot\",\"Clone\",\"TokenizedClone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"Adaptive\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" SourceElementsUnique="false" SourceElementsMany="true"
	 *        SourceElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]' Required='true'" SourceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" TargetElementsUnique="false" TargetElementsMany="true"
	 *        TargetElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]' Out='true'" TargetAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SynchronizationsUnique="false" SynchronizationsMany="true"
	 *        SynchronizationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF[]' In='false' Out='true'" TargetSettingGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingData REF'" TargetPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF'" WaitForCopyStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" ConnectivityCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConnectivityCollection REF'" ConsistencyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"No Consistency\",\"Sequential Consistency\",\"DMTF Reserved\",\"Vendor Specific\"]'" CollectionsUnique="false" CollectionsMany="true"
	 *        CollectionsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Collection REF[]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateListReplica(EList<String> ElementNames, Integer SyncType, Integer Mode, EList<CIM_LogicalElement> SourceElements, CIM_ServiceAccessPoint SourceAccessPoint, EList<CIM_LogicalElement> TargetElements, CIM_ServiceAccessPoint TargetAccessPoint, String ReplicationSettingData, CIM_ConcreteJob Job, EList<CIM_Synchronized> Synchronizations, CIM_SettingData TargetSettingGoal, CIM_ResourcePool TargetPool, Integer WaitForCopyState, CIM_ConnectivityCollection ConnectivityCollection, Integer Consistency, EList<CIM_Collection> Collections);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create (or start a job to create) new storage objects, which are replicas of the specified source storage objects (SourceElements). Note that using the input parameter, SyncType, this function can be used to instantiate the replicas, and to create an ongoing association between the source and replica elements. If 0 is returned, the function completed successfully and no ConcreteJob instance created. If 4096/0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter. This method combines the functionality of CreateGroup and CreateGroupReplica, in one call.
	 * @param RelationshipName A user relevant name for the relationship between the source and target groups or between a source element and a target group (i.e. one-to-many). If NULL, the implementation assigns a name. If the individual target elements require an ElementName, the implementation constructs an appropriate ElementName using the RelationshipName. For example, RelationshipName as a prefix followed by "_n" sequence number, where n is a number beginning with 1.
	 * @param SyncType SyncType describes the type of copy that will be made.
	 * @param Mode
	 *   Mode describes whether the target elements will be updated synchronously or asynchronously. 
	 *   Adaptive: Allows implementation to dynamically switch between synchronous and asynchronous modes. 
	 *   If NULL, implementation decides the mode.
	 * @param SourceGroup Optionally, as an input, refers to a source group to use. As an output, refers to the created source group (i.e., the replica group). If a job is created, the source group may not be available immediately.
	 * @param SourceElements A list of source storage objects which may be StorageVolumes or other storage objects. All the source elements shall be of the same type -- for example, all StorageVolumes.
	 * @param SourceGroupName As in parameter, the name of the group to be created. If the name is not supplied, the implementation may assign a group name and return it in this parameter.
	 * @param SourceAccessPoint Reference to source access point information. If NULL, service does not need access information to access the source elements.
	 * @param TargetGroup Optionally, as an input, refers to a target group to use. As an output, refers to the created target group (i.e., the replica group). If a job is created, the target group may not be available immediately.
	 * @param TargetGroupName As in parameter, the name of the group to be created. If the name is not supplied, the implementation may assign a group name and return it in this parameter.
	 * @param TargetElements A list of target storage objects which may be StorageVolumes or other storage objects. All the target elements shall be of the same type -- for example, all StorageVolumes.
	 * @param TargetElementNames An array of end user relevant names for the elements being created. If NULL, then a system supplied name is used. The value will be stored in the 'ElementName' property for the created elements.
	 * @param TargetAccessPoint Reference to target access point information. If NULL, service does not need access information to access the target element/group.
	 * @param Consistency Overrides the default group consistency.
	 * @param ReplicationSettingData If provided, it overrides the default replication setting data for the given SyncType. If not provided, the management server uses the default replication setting data.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param Synchronization Reference to the created group association between the source and the target elements. If a job is created, this parameter may be NULL until the association is actually formed.
	 * @param TargetSettingGoal The definition for the SettingData to be maintained by the target storage objects (the replicas). If target elements are supplied, this parameter shall be NULL.
	 * @param TargetPool
	 *   The underlying storage for the target elements (the replicas) will be drawn from TargetPool if specified, otherwise the allocation is implementation specific. If target elements are supplied, this parameter shall be NULL. 
	 *   If TargetPool supplied, TargetPools shall be NULL.
	 * @param TargetPools
	 *   The underlying storage for the target elements (the replicas) will be drawn from TargetPools if specified, otherwise the allocation is implementation specific. If target elements are supplied, this parameter shall be NULL.supplied, this parameter shall be NULL. 
	 *   If TargetPools supplied, TargetPool shall be NULL.
	 * @param WaitForCopyState Method must wait until this CopyState is reached before returning. Only a subset of valid CopyStates apply. For example, Initialized: Associations have been established, but there is no data flow. Inactive: Initialization is complete, but the data flow remains idle until it is activated. Synchronized: Replicas are an exact copy of the source. UnSynchronized: Copy operation is in progress.
	 * @param ConnectivityCollection Reference to the ConnectivityCollection - for example, a RemoteReplicationCollection. Since a RemoteReplicationCollection aggregates the ProtocolEndpoints that provide the paths to a remote system, generally, it is not necessary to supply both the ConnectivityCollection and the ServiceAccessPoint.
	 * @param Collections The target elements are added to each referenced collection, for example, DeviceMaskingGroups.
	 * <!-- end-model-doc -->
	 * @model RelationshipNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" SyncTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"..\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"DMTF Reserved\",\"Mirror\",\"Snapshot\",\"Clone\",\"TokenizedClone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"Adaptive\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" SourceGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ReplicationGroup REF' Out='true'" SourceElementsUnique="false" SourceElementsMany="true"
	 *        SourceElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]' Required='true'" SourceGroupNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true'" SourceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" TargetGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ReplicationGroup REF' Out='true'" TargetGroupNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true'" TargetElementsUnique="false" TargetElementsMany="true"
	 *        TargetElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]'" TargetElementNamesUnique="false" TargetElementNamesMany="true"
	 *        TargetElementNamesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" TargetAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" ConsistencyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"No Consistency\",\"Sequential Consistency\",\"DMTF Reserved\",\"Vendor Specific\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SynchronizationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF' In='false' Out='true'" TargetSettingGoalAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingData REF'" TargetPoolAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF'" TargetPoolsUnique="false" TargetPoolsMany="true"
	 *        TargetPoolsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF[]'" WaitForCopyStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" ConnectivityCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConnectivityCollection REF'" CollectionsUnique="false" CollectionsMany="true"
	 *        CollectionsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Collection REF[]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateGroupReplicaFromElements(String RelationshipName, Integer SyncType, Integer Mode, CIM_ReplicationGroup SourceGroup, EList<CIM_LogicalElement> SourceElements, String SourceGroupName, CIM_ServiceAccessPoint SourceAccessPoint, CIM_ReplicationGroup TargetGroup, String TargetGroupName, EList<CIM_LogicalElement> TargetElements, EList<String> TargetElementNames, CIM_ServiceAccessPoint TargetAccessPoint, Integer Consistency, String ReplicationSettingData, CIM_ConcreteJob Job, CIM_Synchronized Synchronization, CIM_SettingData TargetSettingGoal, CIM_ResourcePool TargetPool, EList<CIM_ResourcePool> TargetPools, Integer WaitForCopyState, CIM_ConnectivityCollection ConnectivityCollection, EList<CIM_Collection> Collections);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get (or start a job to get) all of the synchronization relationships known to the processing replication service. If a job is started, once the job completes, examine the AffectedJobElement associations for the synchronization relationships. This method is similar to GetReplicationRelationships, except that this method returns the instances as opposed to object paths.
	 * @param Type The type of synchronization relationships, for example, StorageSynchronized or GroupSynchronized. If this parameter is not supplied, all such relationships are retrieved.
	 * @param SyncType Describes the desired synchronization type. If this parameter is not specified, all SyncType are retrieved.
	 * @param Mode
	 *   Describes the desired mode. If this parameter is not supplied, all modes are retrieved. 
	 *   Adaptive: Allows implementation to dynamically switch between synchronous and asynchronous modes.
	 * @param Locality
	 *   Describes the desired locality. If this parameter is not supplied, all replication relationships are retrieved, regardless of the locality of elements. 
	 *   Local only: Source and target elements are contained in the same system. 
	 *   Remote only: Source and target elements are contained in two different systems.
	 * @param CopyState Only retrieve synchronization relationships that are currently in this CopyState. If this parameter is not supplied, relationships are retrieved regardless of their current CopyState.
	 * @param Job Reference to the job (may be NULL if the task completed).
	 * @param Synchronizations An array of instances found.
	 * @param ReplicationSettingData If supplied, it provides additional replication settings to consider in locating the replication relationships, for example, the CopyMethodology -- which indicates how the copy operation is carried out -- for example, full or incremental mirroring.
	 * <!-- end-model-doc -->
	 * @model TypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"StorageSynchronized\",\"GroupSynchronized\",\"DMTF Reserved\",\"Vendor Specific\"]'" SyncTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"..\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"DMTF Reserved\",\"Mirror\",\"Snapshot\",\"Clone\",\"TokenizedClone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"Adaptive\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" LocalityAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Local only\",\"Remote only\",\"DMTF Reserved\",\"Vendor Specific\"]'" CopyStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SynchronizationsUnique="false" SynchronizationsMany="true"
	 *        SynchronizationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Out='true' EmbeddedInstance='CIM_Synchronized'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetReplicationRelationshipInstances(Integer Type, Integer SyncType, Integer Mode, Integer Locality, Integer CopyState, CIM_ConcreteJob Job, EList<String> Synchronizations, String ReplicationSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modify (or start a job to modify) the SettingsDefineState associations between the storage objects and instances of SynchronizationAspect. The modification could range from introducing the target elements, which creates new StorageSynchronized associations to dissolving the SettingsDefineState associations. If 0 is returned, the function completed successfully and no ConcreteJob instance was created. If 4096/0x1000 is returned, a ConcreteJob was started and a reference to this Job is returned in the Job output parameter. A return value of 1 indicates the method is not supported. All other values indicate some type of error condition.
	 * @param Operation
	 *   Operation describes the type of modification to be made to the related associations. 
	 *   Activate Consistency: if consistency was not requested when CreateListSynchronizationAspect was called. If Consistency is already active, no modification is made. 
	 *   Deactivate Consistency: Deactivate consistency. If consistency was not enabled, this operation has no effect. 
	 *   Delete: Remove the SettingsDefineState association. 
	 *   Copy To Target: Introduces the target elements and forms the necessary associations between the source and the target elements i.e. StorageSynchronized and GroupSynchronized. 
	 *   Detach: Removes the association between the SynchronizationAspect and the target element. 
	 *   Restore: Restore the source element from the associated SynchronizationAspect. 
	 *   Attach To Target: Same as Copy To Target except no data is copied.
	 * @param SettingsStates References to the associations between the source elements and instances of SynchronizationAspect.
	 * @param TargetElements Optionally, as an input, refers to target elements to use. If TargetElements are supplied, TargetGroups and TargetCount shall be NULL. As an output, refers to the created target storage elements (i.e., the replicas). If a job is created, the target elements may not be available immediately.
	 * @param TargetGroups Optionally, as an input, refers to a target groups to use. If TargetGroups are supplied, TargetElements and TargetCount shall be NULL. As an output, refers to the created target groups (i.e., the replica groups). If a job is created, the target groups may not be available immediately. If TargetGroups are supplied, TargetElementCount shall be NULL.
	 * @param TargetElementCount This parameter applies to one-source-to-many-target- elements. It is possible to create multiple copies of the source elements. If TargetCount is supplied, TargetElements and TargetGroups shall be NULL.
	 * @param TargetAccessPoint Reference to target access point information. If NULL, service does not need access information to access the target elements/groups.
	 * @param Synchronizations References to the created replication associations describing the elements/groups relationships.
	 * @param ReplicationSettingData If provided, it overrides the default replication setting data for the given SyncType. If not provided, the management server uses the default replication setting data.
	 * @param Job Reference to the job (may be NULL if the task completed).
	 * @param TargetSettingGoals The definition for the SettingData to be maintained by the target storage objects (the replicas). If the target elementsare supplied, this parameter shall be NULL.
	 * @param TargetPools The underlying storage for the target elements (the replicas) will be drawn from TargetPools if specified, otherwise the allocation is implementation specific. If target elements are supplied, this parameter shall be NULL.
	 * @param WaitForCopyState Method must wait until this CopyState is reached before returning. Only a subset of valid CopyStates apply. For example, Initialized: Associations have been established, but there is no data flow. Inactive: Initialization is complete, but the data flow remains idle until it is activated. Synchronized: Replicas are an exact copy of the source. UnSynchronized: Copy operation is in progress. Fractured/Split: Target elements are separated from the source elements. Etc.
	 * @param ElementNames A end user relevant name for the elements being created. If NULL, then a system supplied default names can be used. The value will be stored in the 'ElementName' property for the created elements.
	 * @param Collections The target elements are added to each referenced collection, for example, DeviceMaskingGroups.
	 * <!-- end-model-doc -->
	 * @model OperationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Activate Consistency\",\"Deactivate Consistency\",\"Delete\",\"Copy To Target\",\"Detach\",\"Restore\",\"Attach To Target\",\"DMTF Reserved\",\"Vendor Specific\"]'" SettingsStatesUnique="false" SettingsStatesMany="true"
	 *        SettingsStatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingsDefineState REF[]' Required='true'" TargetElementsUnique="false" TargetElementsMany="true"
	 *        TargetElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]' Out='true'" TargetGroupsUnique="false" TargetGroupsMany="true"
	 *        TargetGroupsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ReplicationGroup REF[]' Out='true'" TargetElementCountAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'" TargetAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" SynchronizationsUnique="false" SynchronizationsMany="true"
	 *        SynchronizationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF[]' In='false' Out='true'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" TargetSettingGoalsUnique="false" TargetSettingGoalsMany="true"
	 *        TargetSettingGoalsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingData REF[]'" TargetPoolsUnique="false" TargetPoolsMany="true"
	 *        TargetPoolsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ResourcePool REF[]'" WaitForCopyStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" ElementNamesUnique="false" ElementNamesMany="true"
	 *        ElementNamesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" CollectionsUnique="false" CollectionsMany="true"
	 *        CollectionsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Collection REF[]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ModifyListSettingsDefineState(Integer Operation, EList<CIM_SettingsDefineState> SettingsStates, EList<CIM_LogicalElement> TargetElements, EList<CIM_ReplicationGroup> TargetGroups, Long TargetElementCount, CIM_ServiceAccessPoint TargetAccessPoint, EList<CIM_Synchronized> Synchronizations, String ReplicationSettingData, CIM_ConcreteJob Job, EList<CIM_SettingData> TargetSettingGoals, EList<CIM_ResourcePool> TargetPools, Integer WaitForCopyState, EList<String> ElementNames, EList<CIM_Collection> Collections);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Add (or start a job to add) additional service access points (i.e. ProtocolEndpoints) and/or remote systems associations to an existing instance of RemoteReplicationCollection.If 0 is returned, the function completed successfully and no ConcreteJob instance created. If 4096/0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter. If parameter AccessPoints is NULL, then only the RemoteComputerSystem is added for the existing AccessPoints associated to the RemoteReplicationCollection. If RemoteComputerSystem is NULL, then only AccessPoints are added for the existing remote ComputerSystems known to the RemoteReplicationCollection.
	 * @param LocalAccessPoints An array of references to local ServiceAccessPoints (for example, ProtocolEndpoints) that allow communication to the remote system.
	 * @param RemoteAccessPoints An array of references to remote ServiceAccessPoints (for example, ProtocolEndpoints) that allow communication to the remote system.
	 * @param RemoteComputerSystem A reference to the remote system.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param ConnectivityCollection The reference to the RemoteReplicationCollection to be expanded.
	 * <!-- end-model-doc -->
	 * @model LocalAccessPointsUnique="false" LocalAccessPointsMany="true"
	 *        LocalAccessPointsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF[]'" RemoteAccessPointsUnique="false" RemoteAccessPointsMany="true"
	 *        RemoteAccessPointsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF[]'" RemoteComputerSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" ConnectivityCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConnectivityCollection REF' Required='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddToRemoteReplicationCollection(EList<CIM_ServiceAccessPoint> LocalAccessPoints, EList<CIM_ServiceAccessPoint> RemoteAccessPoints, CIM_ComputerSystem RemoteComputerSystem, CIM_ConcreteJob Job, CIM_ConnectivityCollection ConnectivityCollection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create (or start a job to create) a new instance of RemoteReplicationCollection, and optionally supply the remote system and the paths (i.e. ProtocolEndpoints) that are used to perform replication operations to/from the remote system. If 0 is returned, the function completed successfully and no ConcreteJob instance created. If 4096/0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter. Once the job completes, examine the AffectedJobElement associations for the created instance of RemoteReplicationCollection.
	 * @param ElementName A end user relevant name for the element being created. If NULL, then a system supplied default name can be used. The value will be stored in the 'ElementName' property for the created element.
	 * @param LocalAccessPoints An array of references to local ServiceAccessPoints (for example, ProtocolEndpoints) that allow communication to the remote system.
	 * @param RemoteAccessPoints An array of references to remote ServiceAccessPoints (for example, ProtocolEndpoints) that allow communication to the remote system.
	 * @param RemoteComputerSystem A reference to the remote system.
	 * @param Active If true, the instance of RemoteReplicationCollection will be enabled and allows replication operations to to the remote system. Use the intrinsic method ModifyInstance to change this property after the RemoteReplicationCollection is created.
	 * @param DeleteOnUnassociated If true, the instance of RemoteReplicationCollection will be deleted when it is no longer associated to a ServiceAccessPoint. Use the intrinsic method ModifyInstance to change this property after the RemoteReplicationCollection is created.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param ConnectivityCollection Reference to the created instance of RemoteReplicationCollection.
	 * @param ReplicationSettingData If supplied, it provides additional replication settings for the method. For example, enable data compression.
	 * <!-- end-model-doc -->
	 * @model ElementNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" LocalAccessPointsUnique="false" LocalAccessPointsMany="true"
	 *        LocalAccessPointsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF[]'" RemoteAccessPointsUnique="false" RemoteAccessPointsMany="true"
	 *        RemoteAccessPointsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF[]'" RemoteComputerSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" ActiveAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" DeleteOnUnassociatedAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" ConnectivityCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConnectivityCollection REF' In='false' Out='true'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateRemoteReplicationCollection(String ElementName, EList<CIM_ServiceAccessPoint> LocalAccessPoints, EList<CIM_ServiceAccessPoint> RemoteAccessPoints, CIM_ComputerSystem RemoteComputerSystem, Boolean Active, Boolean DeleteOnUnassociated, CIM_ConcreteJob Job, CIM_ConnectivityCollection ConnectivityCollection, String ReplicationSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Remove (or start a job to remove) service access points (i.e. ProtocolEndpoints) and/or remote systems associations from an existing instance of RemoteReplicationCollection.If 0 is returned, the function completed successfully and no ConcreteJob instance created. If 4096/0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter. If parameter AccessPoints is NULL, then only the remote ComputerSystem is removed for the existing AccessPoints associated to the RemoteReplicationCollection. If ComputerSystem is NULL, then only AccessPoints are removed from the existing remote ComputerSystems known to the RemoteReplicationCollection.
	 * @param LocalAccessPoints An array of references to local ServiceAccessPoints (for example, ProtocolEndpoints) that allow communication to the remote system.
	 * @param RemoteAccessPoints An array of references to remote ServiceAccessPoints (for example, ProtocolEndpoints) that allow communication to the remote system.
	 * @param RemoteComputerSystem A reference to the remote system to remove.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param ConnectivityCollection The reference to the RemoteReplicationCollection to affect.
	 * <!-- end-model-doc -->
	 * @model LocalAccessPointsUnique="false" LocalAccessPointsMany="true"
	 *        LocalAccessPointsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF[]'" RemoteAccessPointsUnique="false" RemoteAccessPointsMany="true"
	 *        RemoteAccessPointsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF[]'" RemoteComputerSystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" ConnectivityCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConnectivityCollection REF' Required='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long RemoveFromRemoteReplicationCollection(EList<CIM_ServiceAccessPoint> LocalAccessPoints, EList<CIM_ServiceAccessPoint> RemoteAccessPoints, CIM_ComputerSystem RemoteComputerSystem, CIM_ConcreteJob Job, CIM_ConnectivityCollection ConnectivityCollection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Add elements (or start a job to add elements) to replication groups of a GroupSynchronized association. The implementation then creates StorageSynchronized associations between the matching added elements. 
	 * If 4096/0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter.
	 * @param Synchronized Reference to the Synchronized association.
	 * @param SourceElements Reference to the elements to add to the source group.
	 * @param TargetElements
	 *   Reference to the elements to add to the target group. 
	 *   Pairing of source and target elements is controlled by the Pairing property of ReplicationSettingData if supplied, otherwise, based on default ReplicationSettingData.
	 * @param SourceAccessPoint Reference to source access point information. If NULL, service does not need access information to access the source element/group.
	 * @param TargetAccessPoint Reference to target access point information. If NULL, service does not need access information to access the target element/group.
	 * @param Consistency Overrides the default group consistency.
	 * @param ReplicationSettingData If provided, it overrides the default replication setting data for the given SyncType. If not provided, the management server uses the default replication setting data.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param Synchronizations Reference to the created associations between the source and the target elements. If a job is created, this parameter may be NULL until the associations is actually formed.
	 * @param WaitForCopyState Method must wait until this CopyState is reached before returning. Only a subset of valid CopyStates apply. For example, Initialized: Associations have been established, but there is no data flow. Inactive: Initialization is complete, but the data flow remains idle until it is activated. Synchronized: Replicas are an exact copy of the source. UnSynchronized: Copy operation is in progress.
	 * <!-- end-model-doc -->
	 * @model SynchronizedAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF'" SourceElementsUnique="false" SourceElementsMany="true"
	 *        SourceElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ReplicationService.AddElementsToGroupSynchronized(TargetElements)\"]'" TargetElementsUnique="false" TargetElementsMany="true"
	 *        TargetElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_LogicalElement REF[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_ReplicationService.AddElementsToGroupSynchronized(SourceElements)\"]'" SourceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" TargetAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" ConsistencyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"No Consistency\",\"Sequential Consistency\",\"DMTF Reserved\",\"Vendor Specific\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SynchronizationsUnique="false" SynchronizationsMany="true"
	 *        SynchronizationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF[]' In='false' Out='true'" WaitForCopyStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long AddElementsToGroupSynchronized(CIM_Synchronized Synchronized, EList<CIM_LogicalElement> SourceElements, EList<CIM_LogicalElement> TargetElements, CIM_ServiceAccessPoint SourceAccessPoint, CIM_ServiceAccessPoint TargetAccessPoint, Integer Consistency, String ReplicationSettingData, CIM_ConcreteJob Job, EList<CIM_Synchronized> Synchronizations, Integer WaitForCopyState);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Confirm data written to the source elements has been replicated to the target elements. 
	 * This method is useful for asynchronous replication where data written to the source elements may not be replicated to the target elements right away. If 4096/0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter.
	 * @param Synchronized Reference to the Synchronized association. For example, a StorageSynchronized or a GroupSynchronized.
	 * @param SourceAccessPoint Reference to source access point information. If NULL, service does not need access information to access the source element/group.
	 * @param TargetAccessPoint Reference to target access point information. If NULL, service does not need access information to access the target element/group.
	 * @param ReplicationSettingData If provided, it overrides the default replication setting data for the given SyncType. If not provided, the management server uses the default replication setting data.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param ConnectivityCollection Reference to the ConnectivityCollection - for example, a RemoteReplicationCollection. Since a RemoteReplicationCollection aggregates the ProtocolEndpoints that provide the paths to a remote system, generally, it is not necessary to supply both the ConnectivityCollection and the ServiceAccessPoint.
	 * @param WaitTime
	 *   It specifies the interval of time to wait to confirm data is written to the target elements. 
	 *   For example, to wait 5 minutes, the value would be 00000000000500.000000:000, using the CIM interval format. If NULL or 0, the implementation decides the interval. 
	 *   If the WaitTime expires before the target data is confirmed, the method will return "3" (Timeout).
	 * <!-- end-model-doc -->
	 * @model SynchronizedAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF'" SourceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" TargetAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" ConnectivityCollectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConnectivityCollection REF'" WaitTimeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Unable to confirm target data\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ConfirmTargetData(CIM_Synchronized Synchronized, CIM_ServiceAccessPoint SourceAccessPoint, CIM_ServiceAccessPoint TargetAccessPoint, String ReplicationSettingData, CIM_ConcreteJob Job, CIM_ConnectivityCollection ConnectivityCollection, String WaitTime);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on existing storage element synchronizations, create (or start a job to create) the source and target groups, add the elements into the groups and create an ongoing association between the groups. If 0 is returned, the function completed successfully and no ConcreteJob instance created. If 4096/0x1000 is returned, a ConcreteJob is started, a reference to which is returned in the Job output parameter.
	 * @param RelationshipName A user relevant name for the relationship between the source and target group. If NULL, the implementation assigns a name. If the target group requires an ElementName, the implementation constructs an appropriate ElementName using the RelationshipName. For example, RelationshipName as a prefix followed by "_n" sequence number, where n is a number beginning with 1.
	 * @param ElementSynchronizations Reference to the associations between the source and the target elements.
	 * @param SourceGroupName As in parameter, the name of the source group to be created. If the name is not supplied, the implementation may assign a group name and return it in this parameter.
	 * @param SourceGroup Optionally, as an input, refers to a source group to use. As an output, refers to the created source group (i.e., the replica group). If a job is created, the source group may not be available immediately.
	 * @param SourceAccessPoint Reference to source access point information. If NULL, service does not need access information to access the source elements.
	 * @param TargetGroupName As in parameter, the name of the target group to be created. If the name is not supplied, the implementation may assign a group name and return it in this parameter.
	 * @param TargetGroup Optionally, as an input, refers to a target group to use. As an output, refers to the created target group (i.e., the replica group). If a job is created, the target group may not be available immediately.
	 * @param TargetAccessPoint Reference to target access point information. If NULL, service does not need access information to access the target element/group.
	 * @param Consistency Overrides the default group consistency.
	 * @param ReplicationSettingData If provided, it overrides the default replication setting data for the given SyncType. If not provided, the management server uses the default replication setting data.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param GroupSynchronization Reference to the created group association between the source and the target elements. If a job is created, this parameter may be NULL until the association is actually formed.
	 * @param WaitForCopyState Method must wait until this CopyState is reached before returning. Only a subset of valid CopyStates apply. For example, Initialized: Associations have been established, but there is no data flow. Inactive: Initialization is complete, but the data flow remains idle until it is activated. Synchronized: Replicas are an exact copy of the source. UnSynchronized: Copy operation is in progress.
	 * <!-- end-model-doc -->
	 * @model RelationshipNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string'" ElementSynchronizationsUnique="false" ElementSynchronizationsMany="true"
	 *        ElementSynchronizationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF[]'" SourceGroupNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true'" SourceGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ReplicationGroup REF' Out='true'" SourceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" TargetGroupNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true'" TargetGroupAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ReplicationGroup REF' Out='true'" TargetAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" ConsistencyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"No Consistency\",\"Sequential Consistency\",\"DMTF Reserved\",\"Vendor Specific\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" GroupSynchronizationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF' In='false' Out='true'" WaitForCopyStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateGroupReplicaFromElementSynchronizations(String RelationshipName, EList<CIM_Synchronized> ElementSynchronizations, String SourceGroupName, CIM_ReplicationGroup SourceGroup, CIM_ServiceAccessPoint SourceAccessPoint, String TargetGroupName, CIM_ReplicationGroup TargetGroup, CIM_ServiceAccessPoint TargetAccessPoint, Integer Consistency, String ReplicationSettingData, CIM_ConcreteJob Job, CIM_Synchronized GroupSynchronization, Integer WaitForCopyState);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get (or start a job to get) all of the instances of synchronization aspects known to the processing replication service. If a job is started, once the job completes, examine the AffectedJobElement associations for the synchronization aspects.
	 * @param SyncType Describes the desired synchronization type. If this parameter is not specified, all SyncType are retrieved.
	 * @param Mode
	 *   Describes the desired mode. If this parameter is not supplied, all modes are retrieved. 
	 *   Adaptive: Allows implementation to dynamically switch between synchronous and asynchronous modes.
	 * @param Locality
	 *   Describes the desired locality. If this parameter is not supplied, all synchronization aspects are retrieved, regardless of the locality of elements. 
	 *   Local only: Source and aspect are contained in the same system. 
	 *   Remote only: Source and aspect elements are contained in two different systems.
	 * @param SyncState Only retrieve synchronization aspects that are currently in this SyncState. If this parameter is not supplied, synchronization aspects are retrieved regardless of their current SyncState.
	 * @param Job Reference to the job (may be NULL if the task completed).
	 * @param CachedData If true, for faster response, retrieve the data from the local cache. If false retrieve the most up-to-date data by examining each relationship's updated state. If not specified, the implementation decides.
	 * @param ReplicationSettingData If supplied, it provides additional replication settings to consider in locating the replication relationships, for example, the CopyMethodology.
	 * @param SynchronizationAspects An array of instances found.
	 * <!-- end-model-doc -->
	 * @model SyncTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"..\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"DMTF Reserved\",\"Mirror\",\"Snapshot\",\"Clone\",\"TokenizedClone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"Adaptive\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" LocalityAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Local only\",\"Remote only\",\"DMTF Reserved\",\"Vendor Specific\"]'" SyncStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SynchronizationAspect.SyncState\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" CachedDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" SynchronizationAspectsUnique="false" SynchronizationAspectsMany="true"
	 *        SynchronizationAspectsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Out='true' EmbeddedInstance='CIM_SynchronizationAspect'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSynchronizationAspectInstances(Integer SyncType, Integer Mode, Integer Locality, Integer SyncState, CIM_ConcreteJob Job, Boolean CachedData, String ReplicationSettingData, EList<String> SynchronizationAspects);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get (or start a job to get) all of the synchronization aspects known to the processing replication service. If a job is started, once the job completes, examine the AffectedJobElement associations for the synchronization aspects.
	 * @param SyncType Describes the desired synchronization type. If this parameter is not specified, all SyncType are retrieved.
	 * @param Mode
	 *   Describes the desired mode. If this parameter is not supplied, all modes are retrieved. 
	 *   Adaptive: Allows implementation to dynamically switch between synchronous and asynchronous modes.
	 * @param Locality
	 *   Describes the desired locality. If this parameter is not supplied, all synchronization aspects are retrieved, regardless of the locality of elements. 
	 *   Local only: Source and aspect are contained in the same system. 
	 *   Remote only: Source and aspect elements are contained in two different systems.
	 * @param SyncState Only retrieve synchronization aspects that are currently in this SyncState. If this parameter is not supplied, synchronization aspects are retrieved regardless of their current SyncState.
	 * @param Job Reference to the job (may be NULL if the task completed).
	 * @param CachedData If true, for faster response, retrieve the data from the local cache. If false retrieve the most up-to-date data by examining each relationship's updated state. If not specified, the implementation decides.
	 * @param ReplicationSettingData If supplied, it provides additional replication settings to consider in locating the replication relationships, for example, the CopyMethodology.
	 * @param SynchronizationAspects An array of elements found.
	 * <!-- end-model-doc -->
	 * @model SyncTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"..\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"DMTF Reserved\",\"Mirror\",\"Snapshot\",\"Clone\",\"TokenizedClone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"Adaptive\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" LocalityAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Local only\",\"Remote only\",\"DMTF Reserved\",\"Vendor Specific\"]'" SyncStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_SynchronizationAspect.SyncState\"]'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" CachedDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" SynchronizationAspectsUnique="false" SynchronizationAspectsMany="true"
	 *        SynchronizationAspectsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SynchronizationAspect REF[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unspecified Error\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSynchronizationAspects(Integer SyncType, Integer Mode, Integer Locality, Integer SyncState, CIM_ConcreteJob Job, Boolean CachedData, String ReplicationSettingData, EList<CIM_SynchronizationAspect> SynchronizationAspects);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create (or start a job to create) new point-in-time representations of source elements. These representations may be of a form of pointers that keep track of data at the time the point-in-time was created, or a series of checkpoints that capture the view of data on the source elements at the time of point-in-time. This method does not include target elements, however, target elements can be added subsequently using the ModifyListSettingsDefineState method. If the method executes successfully, SettingsDefineState associations are created between the source elements and the SynchronizationAspect instances, which will have the datetime of the point-in-time.
	 * @param Names A end user relevant names for the elements created. If NULL, then system supplied default names can be used. The value will be stored in the elements' ElementName.
	 * @param SyncType SyncType describes the type of copy that will be made.
	 * @param Mode
	 *   Mode describes whether the target elements will be updated synchronously or asynchronously. 
	 *   Adaptive: Allows implementation to dynamically switch between synchronous and asynchronous modes. 
	 *   If NULL, implementation decides the mode.
	 * @param SourceElements The source storage objects which may be StorageVolumes or other storage objects.
	 * @param SourceAccessPoint Reference to source access point information. If NULL, service does not need access information to access the source elements.
	 * @param Consistency Specifies whether consistency is to be maintained across the list of created replication relationships.
	 * @param ReplicationSettingData If provided, it overrides the default replication setting data for the given SyncType. If not provided, the management server uses the default replication setting data.
	 * @param Job Reference to the job (may be NULL if job is completed).
	 * @param SettingsStates References to the created associations between the source elements and the instances of SynchronizationAspect. If a job is created, this parameter may be NULL unless the associations are actually formed.
	 * <!-- end-model-doc -->
	 * @model NamesUnique="false" NamesMany="true"
	 *        NamesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'" SyncTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"..\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"DMTF Reserved\",\"Mirror\",\"Snapshot\",\"Clone\",\"TokenizedClone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"Adaptive\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" SourceElementsUnique="false" SourceElementsMany="true"
	 *        SourceElementsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF[]' Required='true'" SourceAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" ConsistencyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"No Consistency\",\"Sequential Consistency\",\"DMTF Reserved\",\"Vendor Specific\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" JobAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ConcreteJob REF' In='false' Out='true'" SettingsStatesUnique="false" SettingsStatesMany="true"
	 *        SettingsStatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SettingsDefineState REF[]' In='false' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"4096\",\"4097..32767\",\"0x8000..\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Method Parameters Checked - Job Started\",\"Method Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long CreateListSynchronizationAspect(EList<String> Names, Integer SyncType, Integer Mode, EList<CIM_ManagedElement> SourceElements, CIM_ServiceAccessPoint SourceAccessPoint, Integer Consistency, String ReplicationSettingData, CIM_ConcreteJob Job, EList<CIM_SettingsDefineState> SettingsStates);

} // CIM_ReplicationService

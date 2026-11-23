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
 * A representation of the model object '<em><b>CIM File System Replication Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of Capabilities that defines the Capabilities of a ReplicationService. An instance of FileSystemReplicationServiceCapabilities is associated with a ReplicationService using ElementCapabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationServiceCapabilities#getSupportedReplicationTypes <em>Supported Replication Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationServiceCapabilities#getSupportedStorageObjects <em>Supported Storage Objects</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationServiceCapabilities#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationServiceCapabilities#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FileSystemReplicationServiceCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Replication Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the supported SyncType/Mode/Local-or-Remote combinations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Replication Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationServiceCapabilities_SupportedReplicationTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"..\",\"0x8000..\"]' Values='[\"Synchronous Mirror Local\",\"Asynchronous Mirror Local\",\"Synchronous Mirror Remote\",\"Asynchronous Mirror Remote\",\"Synchronous Snapshot Local\",\"Asynchronous Snapshot Local\",\"Synchronous Snapshot Remote\",\"Asynchronous Snapshot Remote\",\"Synchronous Clone Local\",\"Asynchronous Clone Local\",\"Synchronous Clone Remote\",\"Asynchronous Clone Remote\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedReplicationTypes();

	/**
	 * Returns the value of the '<em><b>Supported Storage Objects</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the supported storage objects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Storage Objects</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationServiceCapabilities_SupportedStorageObjects()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"FileSystem\",\"ReplicationEntity\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedStorageObjects();

	/**
	 * Returns the value of the '<em><b>Supported Asynchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed as asynchronous jobs. If an operation is included in both this and SupportedSynchronousActions properties then the underlying implementation is indicating that it may or may not create a job. 
	 * Note: the following methods are not supported asynchronously, hence the gap between 11 and 19: 
	 * 	 - CreateGroup 
	 * 	 - DeleteGroup 
	 * 	 - AddMembers 
	 * 	 - RemoveMembers 
	 * 	 - AddReplicationEntity 
	 * 	 - AddServiceAccessPoint 
	 * 	 - AddSharedSecret.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Asynchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationServiceCapabilities_SupportedAsynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"..\",\"0x8000..\"]' Values='[\"CreateElementReplica\",\"CreateGroupReplica\",\"CreateSynchronizationAspect\",\"ModifyReplicaSynchronization\",\"ModifyListSynchronization\",\"ModifySettingsDefineState\",\"GetAvailableTargetElements\",\"GetPeerSystems\",\"GetReplicationRelationships\",\"GetServiceAccessPoints\",\"CreateListReplica\",\"CreateGroupReplicaFromElements\",\"GetReplicationRelationshipInstances\",\"ModifyListSettingsDefineState\",\"CreateRemoteReplicationCollection\",\"AddToRemoteReplicationCollection\",\"RemoveFromRemoteReplicationCollection\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedSynchronousActions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedAsynchronousActions();

	/**
	 * Returns the value of the '<em><b>Supported Synchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed synchronously -- without the creation of a job. If an operation is included in both this property and SupportedAsynchronousActions then the underlying implementation is indicating that it may or may not create a job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationServiceCapabilities_SupportedSynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"..\",\"0x8000..\"]' Values='[\"CreateElementReplica\",\"CreateGroupReplica\",\"CreateSynchronizationAspect\",\"ModifyReplicaSynchronization\",\"ModifyListSynchronization\",\"ModifySettingsDefineState\",\"GetAvailableTargetElements\",\"GetPeerSystems\",\"GetReplicationRelationships\",\"GetServiceAccessPoints\",\"CreateGroup\",\"DeleteGroup\",\"AddMembers\",\"RemoveMembers\",\"AddReplicationEntity\",\"AddServiceAccessPoint\",\"AddSharedSecret\",\"CreateListReplica\",\"CreateGroupReplicaFromElements\",\"GetReplicationRelationshipInstances\",\"ModifyListSettingsDefineState\",\"CreateRemoteReplicationCollection\",\"AddToRemoteReplicationCollection\",\"RemoveFromRemoteReplicationCollection\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedAsynchronousActions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSynchronousActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The majority of the methods in this class accept ReplicationType which represents a combination of SyncType, Mode, Local/Remote. This method accepts the supplied information and returns the corresponding ReplicationType, which can be passed to other methods to get the additional capabilities.
	 * @param SyncType
	 *   SyncType describes the type of copy. 
	 *   Mirror: create and maintain a copy of the source. 
	 *   Snapshot: create a PIT, virtual copy of the source. 
	 *   Clone: create an unsynchronized copy of the source.
	 * @param Mode Mode describes whether the target elements will be updated synchronously or asynchronously.
	 * @param LocalOrRemote Copy to local or remote replica.
	 * @param SupportedReplicationTypes A value representing the ReplicationType.
	 * <!-- end-model-doc -->
	 * @model SyncTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"Mirror\",\"Snapshot\",\"Clone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" LocalOrRemoteAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Local\",\"Remote\",\"DMTF Reserved\",\"Vendor Specific\"]'" SupportedReplicationTypesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ConvertSyncTypeToReplicationType(Integer SyncType, Integer Mode, Integer LocalOrRemote, Integer SupportedReplicationTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method does the opposite of the method ConvertSyncTypeToReplicationType. This method translates ReplicationType to the corresponding SyncType, Mode, Local/Remote.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SyncType
	 *   SyncType describes the type of copy. 
	 *   Mirror: create and maintain a copy of the source. 
	 *   Snapshot: create a PIT, virtual copy of the 
	 *   source. 
	 *   Clone: create an unsynchronized copy of the 
	 *   source. 
	 * @param Mode Mode describes whether the target elements will be updated synchronously or asynchronously.
	 * @param LocalOrRemote Copy to local or remote replica.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SyncTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' ValueMap='[\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"Mirror\",\"Snapshot\",\"Clone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" LocalOrRemoteAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Local\",\"Remote\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ConvertReplicationTypeToSyncType(Integer ReplicationType, Integer SyncType, Integer Mode, Integer LocalOrRemote);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the supported CopyStates and a parallel array to indicate for a given CopyState the target element is host accessible or not.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SupportedCopyStates Supported Copy States.
	 * @param HostAccessible A parallel array to SupportedCopyStates[] to indicate whether in that CopyState the target element is host accessible or not (true or false)
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedCopyStatesUnique="false" SupportedCopyStatesMany="true"
	 *        SupportedCopyStatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" HostAccessibleUnique="false" HostAccessibleMany="true"
	 *        HostAccessibleAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedCopyStates(Integer ReplicationType, EList<Integer> SupportedCopyStates, EList<Boolean> HostAccessible);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method, for a given ReplicationType, returns the supported replication group CopyStates.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SupportedCopyStates Supported Copy States.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedCopyStatesUnique="false" SupportedCopyStatesMany="true"
	 *        SupportedCopyStatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedGroupCopyStates(Integer ReplicationType, EList<Integer> SupportedCopyStates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method, for a given ReplicationType and method, returns the supported CopyStates that can be specified in the method's WaitForCopyState parameter.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param MethodName A value representing the desired method name.
	 * @param SupportedCopyStates Supported Copy States.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" MethodNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"CreateElementReplica\",\"CreateGroupReplica\",\"ModifyFileSystemSynchronization\",\"ModifyListSynchronization\",\"ModifySettingsDefineState\",\"DMTF Reserved\",\"Vendor Specific\"]'" SupportedCopyStatesUnique="false" SupportedCopyStatesMany="true"
	 *        SupportedCopyStatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedWaitForCopyStates(Integer ReplicationType, Integer MethodName, EList<Integer> SupportedCopyStates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method, for a given ReplicationType, returns the supported features.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param Features
	 *   An array of Supported Features. 
	 *   Replication Groups: Element in a group are supported in a replication operation. 
	 *   Multi-hop element replication: Target of one copy operation can at the same time be the source of another copy operation. 
	 *   Multi-hop elements must have same SyncType: The SyncType of each hop must be the same as previous hop, e.g., mirror, snapshot, clone. 
	 *   Multi-hop requires advance notice: The service needs to know when multi-hoping is intended to allow the service to do the appropriate set up. The parameter ReplicationSettingData specified number of hops intended. 
	 *   Requires full discovery of target ComputerSystem: Target element's containing computer system must be known to the provider. 
	 *   Service suspends source I/O when necessary: Applies to a group of elements when a consistent point-in-time is created. 
	 *   Targets allocated from Any storage pool: No restriction as to what storage pool to use to allocate targets elements, as long as the pool is not reserved for special activities. 
	 *   Targets allocated from Shared storage pool: Targets areallocated from a shared pool for all targets of the same type. 
	 *   Targets allocated from Exclusive storage pool: Targets are allocated from a pool that is exclusive. 
	 *   Targets allocated from Multiple storage pools: Targets are allocated from multiple pools. Targets require reserved elements: Targets must have a specific Usage value. Target is associated to SynchronizationAspect: Target is associated via SettingsDefineState association to an instance of SynchronizationAspect. Source is associated to SynchronizationAspect: Source is associated via SettingsDefineState association to an instance of SynchronizationAspect. Error recovery from Broken state Automatic: Once the connection is repaired, the copy operation continues automatically. 
	 *   Target must remain associated to source: A dependent target element must remain associated to source element at all times. 
	 *   Remote resource requires remote CIMOM: Client is required to interact with two providers: the provider controlling the source element and the provider controlling the target element.
	 *   Synchronized clone target detaches automatically: The clone target element detaches automatically when the target element becomes synchronized; otherwise, the client needs to explicitly request a detach operation.
	 *   Reverse Roles operation requires Read Only source: The Reverse Roles operation requires the source element to be in the Read Only mode. 
	 *   Reverse Roles operation requires resync: After the Reverse Roles operation completed, it is required to resync the synchronization relationship between the source and the target elements. 
	 *   Restore operation requires fracture: The copy operation has completed; however, the synchronization relationship must be fractured. 
	 *   Resync operation requires activate: For the copy operation to continue, the synchronization relationship must be activated.
	 *   Copy operation requires offline source: Instrumentation requires the source element to be offline (not-ready) to ensure data does not change before starting the copy operation. Adjustable CopyPriority: Priority of copy operation versus the host I/O can be adjusted.
	 *   Source requires reserved element: Source element must have a Usage value that indicates the element may be a "Replica Source". 
	 *   Supports undiscovered resources: The service can perform copy operations to and from elements, e.g. a "ReplicationEntity", on a ComputerSystem not known to the service.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" FeaturesUnique="false" FeaturesMany="true"
	 *        FeaturesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\",\"32768..\"]' Values='[\"Replication groups\",\"Multi-hop element replication\",\"Multi-hop elements must have same SyncType\",\"Multi-hop requires advance notice\",\"Requires full discovery of target ComputerSystem\",\"Service suspends source I/O when necessary\",\"Targets allocated from Any storage pool\",\"Targets allocated from Shared storage pool\",\"Targets allocated from Exclusive storage pool\",\"Targets allocated from Multiple storage pools\",\"Targets require reserved elements\",\"Target is associated to SynchronizationAspect\",\"Source is associated to SynchronizationAspect\",\"Error recovery from Broken state Automatic\",\"Target must remain associated to source\",\"Remote resource requires remote CIMOM\",\"Synchronized clone target detaches automatically\",\"Reverse Roles operation requires Read Only source\",\"Reverse Roles operation requires resync\",\"Restore operation requires fracture\",\"Resync operation requires activate\",\"Copy operation requires offline source\",\"Adjustable CopyPriority\",\"Source requires reserved element\",\"Supports undiscovered resources\",\"Restore operation requires detach\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedFeatures(Integer ReplicationType, EList<Integer> Features);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method, for a given ReplicationType, returns the supported group features.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param GroupFeatures
	 *   An array of Supported Features. 
	 *   One-to-many replication: One source element and multiple targets elements in a group. 
	 *   Many-to-many: One or more elements in the source group and one or more elements in the target group. 
	 *   Consistency enabled for all groups: All groups are considered consistent by default. 
	 *   Empty replication groups allowed: A replication group can have zero elements. 
	 *   Source group must have more than one element: A group with only one element is not allowed. 
	 *   Composite Groups: Elements of a group may be from different arrays. 
	 *   Multi-hop group replication: A group that is the target of a copy operation can be the source of another copy operation at the same time. 
	 *   Multi-hop elements must have same SyncType: The SyncType of each hop must be the same as previous hop, e.g., mirror, snapshot, clone. 
	 *   Group can only have one single relationship active: Only one FileSystemSynchronized association within a group can be active at a given time. 
	 *   Source element can be removed from group: A source element can be removed even when the group is associated with another replication group. 
	 *   Target element can be removed from group: A target element can be removed even when the group is associated with another replication group. 
	 *   Group can be temporary: Group can have a persistence of false, which means the group -- not its elements, may be deleted if it no longer participates in a replication operation. 
	 *   Group is nameable: In creating a group, it is possible to name the group. 
	 *   Supports target element count: It is possible to supply one source element and request more than one target element copies.
	 *   Synchronized clone target detaches automatically: The clone target group detaches automatically when the target group becomes synchronized; otherwise, the client needs to explicitly request a detach operation.
	 *   Reverse Roles operation requires Read Only source: The Reverse Roles operation requires the source element to be in the Read Only mode. 
	 *   Reverse Roles operation requires resync: For the copy operation to continue, resync of source and target elements is required. 
	 *   Restore operation requires fracture: The copy operation has completed; however, the synchronization relationship must be fractured. 
	 *   Resync operation requires activate: For the copy operation to continue, the synchronization relationship must be activated. 
	 *   Copy operation requires offline source: Instrumentation requires the source element to be offline (not-ready) to ensure data does not change before starting the copy operation.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" GroupFeaturesUnique="false" GroupFeaturesMany="true"
	 *        GroupFeaturesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"..\",\"0x8000..\"]' Values='[\"One-to-many replication\",\"Many-to-many groups\",\"Consistency enabled for all groups\",\"Empty replication groups allowed\",\"Source group must have more than one element\",\"Composite Groups\",\"Multihop element replication\",\"Multi-hop elements must have same SyncType\",\"Group can only have one single relationship active\",\"Source element can be removed from group\",\"Target element can be removed from group\",\"Group can be temporary\",\"Group is nameable\",\"Supports target element count\",\"Synchronized clone target detaches automatically\",\"Reverse Roles operation requires Read Only source\",\"Reverse Roles operation requires resync\",\"Restore operation requires fracture\",\"Resync operation requires activate\",\"Copy operation requires offline source\",\"Restore operation requires detach\",\"Element can be member of multiple groups\",\"Elements of group can be mix of thin and thick\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedGroupFeatures(Integer ReplicationType, EList<Integer> GroupFeatures);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the supported Consistency.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SupportedConsistency
	 *   An array of Supported Features. 
	 *   Sequentially Consistent: Members of a target group are sequentially consistent - the order of the write operations is maintained.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedConsistencyUnique="false" SupportedConsistencyMany="true"
	 *        SupportedConsistencyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"..\",\"0x8000..\"]' Values='[\"Sequentially Consistent\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedConsistency(Integer ReplicationType, EList<Integer> SupportedConsistency);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the supported Operations on a FileSystemSynchronized association that can be supplied to the ModifyReplicaSynchronization method.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SupportedOperations
	 *   An array of Supported Operations. 
	 *   Abort: Abort the copy operation if it is possible. Activate Consistency: Ensure all target elements of a group are consistent. 
	 *   Activate: Activate an inactive or prepared source and target association. 
	 *   AddSyncPair: Add elements associated via FileSystemSynchronized to source and target groups. 
	 *   Deactivate Consistency: Disable consistency. 
	 *   Deactivate: Deactivate a source and target association. The writes to the target are deleted in the case of a snapshot. 
	 *   Detach: Remove the association between source and target. 
	 *   Dissolve: Dissolve the synchronization between two storage objects, however, the target element continues to exist. 
	 *   Failover: Switch to target element instead of source. 
	 *   Failback: Reverses the effects of failover. 
	 *   Fracture: Separate target element from source element. 
	 *   RemoveSyncPair: Remove pair of source and target elements from the source/target groups. 
	 *   Resync Replica: Synchronize a fractured/split source and target elements. 
	 *   Restore from Replica: Copy data from a fractured target back to source. 
	 *   Resume: Continue an association that was suspended. 
	 *   Reset To Sync: Change mode to synchronous. 
	 *   Reset To Async: Change mode to asynchronous. 
	 *   Reverse Roles: Make target the source and source the target. 
	 *   Return To ResourcePool: Applies to Snapshot -- delete the target element and its replication association. 
	 *   Split: Similar to Fracture, however, the provider needs to make sure whether there are pending I/O in transit before fracturing the connection. 
	 *   Suspend: Stop the copy operations to the target element. Continue when the operations is resumed. 
	 *   Unprepare: Causes the synchronization to be reinitialized and stop in Prepared state.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedOperationsUnique="false" SupportedOperationsMany="true"
	 *        SupportedOperationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Abort\",\"Activate Consistency\",\"Activate\",\"AddSyncPair\",\"Deactivate Consistency\",\"Deactivate\",\"Detach\",\"Dissolve\",\"Failover\",\"Failback\",\"Fracture\",\"RemoveSyncPair\",\"Resync Replica\",\"Restore from Replica\",\"Resume\",\"Reset To Sync\",\"Reset To Async\",\"Return To ResourcePool\",\"Reverse Roles\",\"Split\",\"Suspend\",\"Unprepare\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedOperations(Integer ReplicationType, EList<Integer> SupportedOperations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the supported Operations on a FileSystemGroupSynchronized association that can be supplied to the ModifyReplicaSynchronization method.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SupportedGroupOperations
	 *   An array of Supported group Operations. Abort: Abort the copy operation if it is possible. 
	 *   Activate Consistency: Ensure all target elements of a group are consistent. 
	 *   Activate: Activate an inactive or prepared source and target association. 
	 *   AddSyncPair: Add elements associated via FileSystemSynchronized to source and target groups. 
	 *   Deactivate Consistency: Disable consistency. 
	 *   Deactivate: Deactives a source and target association. The writes to the target are deleted in the case of a snapshot. 
	 *   Detach: Remove the association between source and target. 
	 *   Dissolve: Dissolve the synchronization between two storage objects, however, the target element continues to exist. 
	 *   Failover: Switch to target element instead of source. 
	 *   Failback: Reverses the effects of failover. 
	 *   Fracture: Separate target element from source element. 
	 *   RemoveSyncPair: Remove pair of source and target elements from the source/target groups. 
	 *   Resync Replica: Synchronize a fractured/split source and target elements. 
	 *   Restore from Replica: Copy data from a fractured target back to source. 
	 *   Resume: Continue an association that was suspended. 
	 *   Reset To Sync: Change mode to synchronous. 
	 *   Reset To Async: Change mode to asynchronous. 
	 *   Reverse Roles: Make target the source and source the target. 
	 *   Return To ResourcePool: Applies to Snapshot -- delete the target element and its replication association. 
	 *   Split: Similar to Fracture, however, the provider needs to make sure wether there are pending I/O in transit before fracturing the connection. 
	 *   Suspend: Stop the copy operations to the target element. Continue when the operations is resumed. 
	 *   Unprepare: Causes the synchronization to be reinitialized and stop in Prepared state.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedGroupOperationsUnique="false" SupportedGroupOperationsMany="true"
	 *        SupportedGroupOperationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Abort\",\"Activate Consistency\",\"Activate\",\"AddSyncPair\",\"Deactivate Consistency\",\"Deactivate\",\"Detach\",\"Dissolve\",\"Failover\",\"Failback\",\"Fracture\",\"RemoveSyncPair\",\"Resync Replica\",\"Restore from Replica\",\"Resume\",\"Reset To Sync\",\"Reset To Async\",\"Return To ResourcePool\",\"Reverse Roles\",\"Split\",\"Suspend\",\"Unprepare\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedGroupOperations(Integer ReplicationType, EList<Integer> SupportedGroupOperations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the supported Operations on a list of FileSystemSynchronized or FileSystemGroupSynchronized associations that can be supplied to the ModifyListSynchronization method.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SynchronizationType Specifies the supported operations as they apply to a list of FileSystemSynchronized or GroupSynchronized. If this parameter is not specified, FileSystemSynchronized is assumed.
	 * @param SupportedListOperations
	 *   An array of Supported group Operations. Abort: Abort the copy operation if it is possible. 
	 *   Activate: Activate an inactive or prepared source and target association. 
	 *   Deactivate: Deactivate a source and target association. The writes to the target are deleted in the case of a snapshot. 
	 *   Detach: Remove the association between source and target. 
	 *   Dissolve: Dissolve the synchronization between two storage objects, however, the target element continues to exist. 
	 *   Failover: Switch to target element instead of source. 
	 *   Failback: Reverses the effects of failover. 
	 *   Fracture: Separate target element from source element. 
	 *   Resync Replica: Synchronize a fractured/split source and target elements. 
	 *   Restore from Replica: Copy data from a fractured target back to source. 
	 *   Resume: Continue an association that was suspended. 
	 *   Reset To Sync: Change mode to synchronous. 
	 *   Reset To Async: Change mode to asynchronous. 
	 *   Reverse Roles: Make target the source and source the target. 
	 *   Return To ResourcePool: Applies to Snapshot -- delete the target element and its replication association. 
	 *   Split: Similar to Fracture, however, the provider needs to make sure wether there are pending I/O in transit before fracturing the connection. 
	 *   Suspend: Stop the copy operations to the target element. 
	 *   Continue when the operations is resumed. 
	 *   Unprepare: Causes the synchronization to be reinitialized and stop in Prepared state.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SynchronizationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"FileSystemSynchronized\",\"FileSystemGroupSynchronized\",\"ReplicationEntitySynchronized\",\"ReplicationEntityGroupSynchronized\",\"DMTF Reserved\",\"Vendor Specific\"]'" SupportedListOperationsUnique="false" SupportedListOperationsMany="true"
	 *        SupportedListOperationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Abort\",\"DMTF Reserved\",\"Activate\",\"DMTF Reserved\",\"DMTF Reserved\",\"Deactivate\",\"Detach\",\"Dissolve\",\"Failover\",\"Failback\",\"Fracture\",\"DMTF Reserved\",\"Resync Replica\",\"Restore from Replica\",\"Resume\",\"Reset To Sync\",\"Reset To Async\",\"Return To ResourcePool\",\"Reverse Roles\",\"Split\",\"Suspend\",\"Unprepare\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedListOperations(Integer ReplicationType, Integer SynchronizationType, EList<Integer> SupportedListOperations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the supported Operations on a SettingsDefineState association that can be supplied to the ModifySettingsDefineState method.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SupportedOperations An array of supported Operations. /nActivate Consistency: Enable consistency Deactivate Consistency: Disable consistency Delete: Remove the SettingsDefineState association. Instance of SynchronizationAspect may also be deleted if it is not shared with other elements. Copy To Target: Introduces the target elements and forms the necessary associations between the source and the target elements i.e. FileSystemSynchronized and GroupSynchronized.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedOperationsUnique="false" SupportedOperationsMany="true"
	 *        SupportedOperationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Activate Consistency\",\"Deactivate Consistency\",\"Delete\",\"Copy To Target\",\"Detach\",\"Restore\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedSettingsDefineStateOperations(Integer ReplicationType, EList<Integer> SupportedOperations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the supported features related to thin provisioning.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SupportedThinProvisioningFeatures
	 *   An array of Supported Thin Provisioning Features. 
	 *   Thin provisioning is not supported: Feature is unavailable. 
	 *   Zeros written in unused allocated blocks of target: In copying thin to full, the unused blocks of target will be written with zeros. 
	 *   Unused allocated blocks of target are not initialized: In copying thin to full, the unused blocks of target will remain uninitialized. 
	 *   See the property ReplicationSettingData.ThinProvisioningPolicy for a list of possible options for a copy operation.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedThinProvisioningFeaturesUnique="false" SupportedThinProvisioningFeaturesMany="true"
	 *        SupportedThinProvisioningFeaturesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Thin provisioning is not supported\",\"Zeros written in unused allocated blocks of target\",\"Unused allocated blocks of target are not initialized\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ReplicationSettingData.ThinProvisioningPolicy\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedThinProvisioningFeatures(Integer ReplicationType, EList<Integer> SupportedThinProvisioningFeatures);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method accepts a ReplicationType and a component, it then returns a static numeric value representing the maximum number of the specified component that the service supports. A value of 0 indicates unlimited components of the given type. In all cases the maximum value is bound by the availability of resources on the computer system. Effectively, the method informs clients of the edge conditions.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param Component For the given Mirror, Snapshot, Clone and their mode and locality variations as specified by ReplicationType, this parameter represents one of the following components: Number of groups: Maximum number of groups supported by the replication service.Number of elements per source group: Maximum number of elements in a group that can be used as a source group. Number of elements per target group: Maximum number of elements in a group that can be used as a target group. Number of target elements per source element: Maximum number of target elements per source element. Number of total source elements: Maximum number of total source elements supported by the service. Number of total target elements: Maximum number of total target elements supported by the source. Number of peer systems: Maximum number of peer systems that replication service can communicate with. Number of hops in multi-hop replication: Maximum number of hops in multi-hop replication the service can manage.
	 * @param MaxValue The maximum value, or 0 if the maximum is unlimited.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" ComponentAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"Number of groups\",\"Number of elements per source group\",\"Number of elements per target group\",\"Number of target elements per source element\",\"Number of total source elements\",\"Number of total target elements\",\"Number of peer systems\",\"Number of hops in multi-hop copy\",\"DMTF Reserved\",\"Vendor Specific\"]'" MaxValueAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Information is not available\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedMaximum(Integer ReplicationType, Integer Component, Integer MaxValue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * od for a given ReplicationType, returns the default consistency value.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param DefaultConsistency Default consistency value, or 0 if there is no default value.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" DefaultConsistencyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"0x8000..\"]' Values='[\"No default consistency\",\"DMTF Reserved\",\"Sequentially Consistent\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetDefaultConsistency(Integer ReplicationType, Integer DefaultConsistency);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method returns the default persistency for a newly created group.
	 * @param DefaultGroupPersistency Default group persistency value.
	 * <!-- end-model-doc -->
	 * @model DefaultGroupPersistencyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"No default persistency\",\"DMTF Reserved\",\"Persistent\",\"Not Persistent\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetDefaultGroupPersistency(Integer DefaultGroupPersistency);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method, for a given ReplicationType and a supplied property, returns an array of supported settings that can be utilized in an instance of the ReplicationSettingData class.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param PropertyName A value representing the property name.
	 * @param SupportedValues
	 *   An array containing the supported values that can be supplied in an instance of a ReplicationSettingData. Refer to the class ReplicationSettingData for the possible values for each property. For boolean data, use the following data mapping: 2="false", 3="true". 
	 *   For datetime data, use the following data mapping: 0="property is supported", 1="property is not supported".
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" PropertyNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"..\",\"0x8000..\"]' Values='[\"ConsistentPointInTime\",\"DesiredCopyMethodology\",\"Multihop\",\"OnGroupOrListError\",\"UnequalGroupsAction\",\"TargetElementSupplier\",\"ThinProvisioningPolicy\",\"Pairing\",\"FailedCopyStopsHostIO\",\"CopyRecoveryMode\",\"UnequalListsAction\",\"DeltaUpdateInterval\",\"DeltaUpdateBlocks\",\"ReadOnly\",\"StorageCompressionPolicy\",\"TargetElementResourcePool\",\"TargetElementGoal\",\"RRCSoftwareCompressionEnabled\",\"RRCHardwareCompressionEnabled\",\"DMTF Reserved\",\"Vendor Specific\"]'" SupportedValuesUnique="false" SupportedValuesMany="true"
	 *        SupportedValuesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' In='false' Out='true' ModelCorrespondence='[\"CIM_ReplicationSettingData.ConsistentPointInTime\",\"CIM_ReplicationSettingData.DesiredCopyMethodology\",\"CIM_ReplicationSettingData.Multihop\",\"CIM_ReplicationSettingData.OnGroupOrListError\",\"CIM_ReplicationSettingData.Pairing\",\"CIM_ReplicationSettingData.UnequalGroupsAction\",\"CIM_ReplicationSettingData.TargetElementSupplier\",\"CIM_ReplicationSettingData.ThinProvisioningPolicy\",\"CIM_ReplicationSettingData.FailedCopyStopsHostIO\",\"CIM_ReplicationSettingData.CopyRecoveryMode\",\"CIM_ReplicationSettingData.UnequalListsAction\",\"CIM_ReplicationSettingData.DeltaUpdateInterval\",\"CIM_ReplicationSettingData.DeltaUpdateBlocks\",\"CIM_ReplicationSettingData.ReadOnly\",\"CIM_ReplicationSettingData.StorageCompressionPolicy\",\"CIM_ReplicationSettingData.TargetElementResourcePool\",\"CIM_ReplicationSettingData.TargetElementGoal\",\"CIM_ReplicationSettingData.RRCSoftwareCompressionEnabled\",\"CIM_ReplicationSettingData.RRCHardwareCompressionEnabled\",\"CIM_ReplicationSettingData.AutoDelete\",\"CIM_ReplicationSettingData.TimeBeforeRemoval\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedReplicationSettingData(Integer ReplicationType, Integer PropertyName, EList<Long> SupportedValues);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the default ReplicationSettingData as an instance.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param DefaultInstance A copy of the instance this populated with default values for the given ReplicationType.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" DefaultInstanceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"No default ReplicationSettingData\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetDefaultReplicationSettingData(Integer ReplicationType, String DefaultInstance);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method accepts a connection reference and returns specific features of that connection.
	 * @param connection A value representing the connection.
	 * @param SupportedConnectionFeatures An array supported connection features. Unidirectional to ServiceAccessPoint: Data flow is unidirectional to ServiceAccessPoint such as a protocol end point. Unidirectional from ServiceAccessPoint: Data flow is unidirectional from ServiceAccessPoint such as a protocol end point.
	 * <!-- end-model-doc -->
	 * @model connectionAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" SupportedConnectionFeaturesUnique="false" SupportedConnectionFeaturesMany="true"
	 *        SupportedConnectionFeaturesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Unidirectional to ServiceAccessPoint\",\"Unidirectional from ServiceAccessPoint\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedConnectionFeatures(CIM_ServiceAccessPoint connection, EList<Integer> SupportedConnectionFeatures);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For the supplied element, this method returns the supported synchronization operations in a series of parallel output arrays.
	 * @param LocalElement A reference to the supplied element. For example, the source element.
	 * @param OtherElement A reference to the other end of the synchronization association. For example, the target element. OtherElement can be a local or a remote element.
	 * @param OtherElementAccessPoint erence to the access point instance to allow the service to access the OtherElement. If NULL, it is assumed the service does not need any access information or the element is local.
	 * @param MethodName A value representing the desired method name.
	 * @param ReplicationSettingData If provided, it overrides the default replication setting data for the given SyncType. For example, the intended CopyMethodology can be specified to determine if the copy operation is supported for the given source and target elements.
	 * @param SyncTypes An array of supported SyncTypes for the copy operations using the supplied element.
	 * @param Modes An array of supported Modes for the copy operations using the supplied element.
	 * @param LocalElementRole
	 *   An array that specifies whether the local element can be the source or the target element of the copy operations. Possible values are: 
	 *   SystemElement: the source element. 
	 *   SyncedElement: the target element. 
	 *   These designations correspond to the keys of the Synchronized association.
	 * <!-- end-model-doc -->
	 * @model LocalElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" OtherElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" OtherElementAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" MethodNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"CreateElementReplica\",\"CreateGroupReplica\",\"CreateSynchronizationAspect\",\"DMTF Reserved\",\"Vendor Specific\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" SyncTypesUnique="false" SyncTypesMany="true"
	 *        SyncTypesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"Mirror\",\"Snapshot\",\"Clone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModesUnique="false" ModesMany="true"
	 *        ModesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" LocalElementRoleUnique="false" LocalElementRoleMany="true"
	 *        LocalElementRoleAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"SystemElement\",\"SyncedElement\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSynchronizationSupported(CIM_ManagedElement LocalElement, CIM_ManagedElement OtherElement, CIM_ServiceAccessPoint OtherElementAccessPoint, Integer MethodName, String ReplicationSettingData, EList<Integer> SyncTypes, EList<Integer> Modes, EList<Integer> LocalElementRole);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the supported features related to storage compression.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SupportedStorageCompressionFeatures An array of supported Storage Compression Features.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FileSystemReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedStorageCompressionFeaturesUnique="false" SupportedStorageCompressionFeaturesMany="true"
	 *        SupportedStorageCompressionFeaturesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Storage compression is not supported\",\"Compressed source to compressed target\",\"Compressed source to uncompressed target\",\"Uncompressed source to compressed target\",\"Compression of target same as source\",\"Target pool decides compression of target element\",\"Implementation decides compression of target\",\"DMTF Reserved\",\"Vendor specific\"]' ModelCorrespondence='[\"CIM_ReplicationSettingData.StorageCompressionPolicy\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedStorageCompressionFeatures(Integer ReplicationType, EList<Integer> SupportedStorageCompressionFeatures);

} // CIM_FileSystemReplicationServiceCapabilities

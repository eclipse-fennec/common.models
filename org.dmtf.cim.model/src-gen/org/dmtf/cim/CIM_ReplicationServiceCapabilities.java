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
 * A representation of the model object '<em><b>CIM Replication Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subclass of Capabilities that defines the Capabilities of a ReplicationService. An instance of ReplicationServiceCapabilities is associated with a ReplicationService using ElementCapabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationServiceCapabilities#getSupportedReplicationTypes <em>Supported Replication Types</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationServiceCapabilities#getSupportedStorageObjects <em>Supported Storage Objects</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationServiceCapabilities#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationServiceCapabilities#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.49.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ReplicationServiceCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Replication Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the supported SyncType/Mode/Local-or-Remote combinations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Replication Types</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationServiceCapabilities_SupportedReplicationTypes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\",\"0x8000..\"]' Values='[\"Synchronous Mirror Local\",\"Asynchronous Mirror Local\",\"Synchronous Mirror Remote\",\"Asynchronous Mirror Remote\",\"Synchronous Snapshot Local\",\"Asynchronous Snapshot Local\",\"Synchronous Snapshot Remote\",\"Asynchronous Snapshot Remote\",\"Synchronous Clone Local\",\"Asynchronous Clone Local\",\"Synchronous Clone Remote\",\"Asynchronous Clone Remote\",\"Synchronous TokenizedClone Local\",\"Asynchronous TokenizedClone Local\",\"Synchronous TokenizedClone Remote\",\"Asynchronous TokenizedClone Remote\",\"Adaptive Mirror Local\",\"Adaptive Mirror Remote\",\"Adaptive Snapshot Local\",\"Adaptive Snapshot Remote\",\"Adaptive Clone Local\",\"Adaptive Clone Remote\",\"Adaptive TokenizedClone Local\",\"Adaptive TokenizedClone Remote\",\"Active Mirror Local\",\"Active Mirror Remote\",\"DMTF Reserved\",\"Vendor Specific\"]'"
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
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationServiceCapabilities_SupportedStorageObjects()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"StorageVolume\",\"LogicalDisk\",\"ReplicationEntity\",\"DMTF Reserved\",\"Vendor Specific\"]'"
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
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationServiceCapabilities_SupportedAsynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"..\",\"0x8000..\"]' Values='[\"CreateElementReplica\",\"CreateGroupReplica\",\"CreateSynchronizationAspect\",\"ModifyReplicaSynchronization\",\"ModifyListSynchronization\",\"ModifySettingsDefineState\",\"GetAvailableTargetElements\",\"GetPeerSystems\",\"GetReplicationRelationships\",\"GetServiceAccessPoints\",\"CreateListReplica\",\"CreateGroupReplicaFromElements\",\"GetReplicationRelationshipInstances\",\"ModifyListSettingsDefineState\",\"CreateRemoteReplicationCollection\",\"AddToRemoteReplicationCollection\",\"RemoveFromRemoteReplicationCollection\",\"GetSynchronizationAspects\",\"GetSynchronizationAspectInstances\",\"CreateGroupReplicaFromElementSynchronizations\",\"AddElementsToGroupSynchronized\",\"ConfirmTargetData\",\"CreateListSynchronizationAspect\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedSynchronousActions\"]'"
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
	 * Note: the following methods are not supported asynchronously: 
	 * 	 - CreateGroup 
	 * 	 - DeleteGroup 
	 * 	 - AddMembers 
	 * 	 - RemoveMembers 
	 * 	 - AddReplicationEntity 
	 * 	 - AddServiceAccessPoint 
	 * 	 - AddSharedSecret.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationServiceCapabilities_SupportedSynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"..\",\"0x8000..\"]' Values='[\"CreateElementReplica\",\"CreateGroupReplica\",\"CreateSynchronizationAspect\",\"ModifyReplicaSynchronization\",\"ModifyListSynchronization\",\"ModifySettingsDefineState\",\"GetAvailableTargetElements\",\"GetPeerSystems\",\"GetReplicationRelationships\",\"GetServiceAccessPoints\",\"CreateGroup\",\"DeleteGroup\",\"AddMembers\",\"RemoveMembers\",\"AddReplicationEntity\",\"AddServiceAccessPoint\",\"AddSharedSecret\",\"CreateListReplica\",\"CreateGroupReplicaFromElements\",\"GetReplicationRelationshipInstances\",\"ModifyListSettingsDefineState\",\"CreateRemoteReplicationCollection\",\"AddToRemoteReplicationCollection\",\"RemoveFromRemoteReplicationCollection\",\"GetSynchronizationAspects\",\"GetSynchronizationAspectInstances\",\"CreateGroupReplicaFromElementSynchronizations\",\"AddElementsToGroupSynchronized\",\"ConfirmTargetData\",\"CreateListSynchronizationAspect\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedAsynchronousActions\"]'"
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
	 *   TokenizedClone: create a token based clone.
	 * @param Mode
	 *   Mode describes whether the target elements will be updated synchronously or asynchronously. 
	 *   Adaptive: Allows implementation to dynamically switch between synchronous and asynchronous modes.
	 * @param LocalOrRemote Copy to local or remote replica.
	 * @param SupportedReplicationTypes A value representing the ReplicationType.
	 * <!-- end-model-doc -->
	 * @model SyncTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"Mirror\",\"Snapshot\",\"Clone\",\"TokenizedClone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"Adaptive\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" LocalOrRemoteAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Local\",\"Remote\",\"DMTF Reserved\",\"Vendor Specific\"]'" SupportedReplicationTypesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'"
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
	 *   Snapshot: create a PIT, virtual copy of the source. 
	 *   Clone: create an unsynchronized copy of the source. 
	 *   TokenizedClone: create a token based clone.
	 * @param Mode
	 *   Mode describes whether the target elements will be updated synchronously or asynchronously. 
	 *   Adaptive: Allows implementation dynamically to switch between synchronous and asynchronous modes. 
	 *   Active: Source and target elements are simultaneously accessible to clients.
	 * @param LocalOrRemote Copy to local or remote replica.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SyncTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' ValueMap='[\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"Mirror\",\"Snapshot\",\"Clone\",\"TokenizedClone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'" ModeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"Adaptive\",\"Active\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" LocalOrRemoteAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Local\",\"Remote\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long ConvertReplicationTypeToSyncType(Integer ReplicationType, Integer SyncType, Integer Mode, Integer LocalOrRemote);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the supported CopyStates and a parallel array to indicate for a given CopyState the target element is host accessible or not. 
	 * If the Operation parameter is supplied, the method returns only the CopyStates that the operation can be accepted.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SupportedCopyStates Supported Copy States.
	 * @param HostAccessible A parallel array to SupportedCopyStates[] to indicate whether in that CopyState the target element is host accessible or not (true or false)
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * @param Operation
	 *   Only return the CopyStates that the specified operation can be accepted. 
	 *   Methods such as ModifyReplicaSynchronization accept the operation to perform. If the Operation is not specified, all supported CopyStates for the ReplicationType are returned. 
	 *   Unprepare: Causes the synchronization to be reinitialized and stop in Prepared state -- deprecated. 
	 *   Prepare: Replaces the Unprepare operation.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedCopyStatesUnique="false" SupportedCopyStatesMany="true"
	 *        SupportedCopyStatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" HostAccessibleUnique="false" HostAccessibleMany="true"
	 *        HostAccessibleAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' Out='true'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" OperationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Abort\",\"Activate Consistency\",\"Activate\",\"AddSyncPair\",\"Deactivate Consistency\",\"Deactivate\",\"Detach\",\"Dissolve\",\"Failover\",\"Failback\",\"Fracture\",\"RemoveSyncPair\",\"Resync Replica\",\"Restore from Replica\",\"Resume\",\"Reset To Sync\",\"Reset To Async\",\"Return To ResourcePool\",\"Reverse Roles\",\"Split\",\"Suspend\",\"Unprepare\",\"Prepare\",\"Reset to Adaptive\",\"Reset to Active\",\"Reset Replica\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedCopyStates(Integer ReplicationType, EList<Integer> SupportedCopyStates, EList<Boolean> HostAccessible, String ReplicationSettingData, Integer Operation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method, for a given ReplicationType, returns the supported replication group CopyStates.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SupportedCopyStates Supported Copy States.
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * @param Operation
	 *   If the Operation parameter is supplied, the method returns only the CopyStates that the operation can be accepted. 
	 *   Methods such as ModifyReplicaSynchronization accept the operation to perform. If the Operation is not specified, all supported CopyStates for the ReplicationType are returned. 
	 *   Unprepare: Causes the synchronization to be reinitialized and stop in Prepared state -- deprecated. 
	 *   Prepare: Replaces the Unprepare operation.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedCopyStatesUnique="false" SupportedCopyStatesMany="true"
	 *        SupportedCopyStatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" OperationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Abort\",\"Activate Consistency\",\"Activate\",\"AddSyncPair\",\"Deactivate Consistency\",\"Deactivate\",\"Detach\",\"Dissolve\",\"Failover\",\"Failback\",\"Fracture\",\"RemoveSyncPair\",\"Resync Replica\",\"Restore from Replica\",\"Resume\",\"Reset To Sync\",\"Reset To Async\",\"Return To ResourcePool\",\"Reverse Roles\",\"Split\",\"Suspend\",\"Unprepare\",\"Prepare\",\"Reset to Adaptive\",\"Reset to Active\",\"Reset Replica\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedGroupCopyStates(Integer ReplicationType, EList<Integer> SupportedCopyStates, String ReplicationSettingData, Integer Operation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method, for a given ReplicationType and method, returns the supported CopyStates that can be specified in the method's WaitForCopyState parameter.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param MethodName A value representing the desired method name.
	 * @param SupportedCopyStates Supported Copy States.
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * @param Operation
	 *   Only return the WaitForCopyStates that can be specified for the given operation in methods such as ModifyReplicaSynchronization. 
	 *   If the Operation is not specified, all supported WaitForCopyStates for the ReplicationType are returned. 
	 *   Unprepare: Causes the synchronization to be reinitialized and stop in Prepared state -- deprecated. 
	 *   Prepare: Replaces the Unprepare operation.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" MethodNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"0x8000..\"]' Values='[\"CreateElementReplica\",\"CreateGroupReplica\",\"ModifyReplicaSynchronization\",\"ModifyListSynchronization\",\"ModifySettingsDefineState\",\"CreateListReplica\",\"CreateGroupReplicaFromElements\",\"ModifyListSettingsDefineState\",\"CreateGroupReplicaFromElementSynchronizations\",\"AddElementsToGroupSynchronized\",\"DMTF Reserved\",\"Vendor Specific\"]'" SupportedCopyStatesUnique="false" SupportedCopyStatesMany="true"
	 *        SupportedCopyStatesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" OperationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Abort\",\"Activate Consistency\",\"Activate\",\"AddSyncPair\",\"Deactivate Consistency\",\"Deactivate\",\"Detach\",\"Dissolve\",\"Failover\",\"Failback\",\"Fracture\",\"RemoveSyncPair\",\"Resync Replica\",\"Restore from Replica\",\"Resume\",\"Reset To Sync\",\"Reset To Async\",\"Return To ResourcePool\",\"Reverse Roles\",\"Split\",\"Suspend\",\"Unprepare\",\"Prepare\",\"Reset to Adaptive\",\"Reset to Active\",\"Reset Replica\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedWaitForCopyStates(Integer ReplicationType, Integer MethodName, EList<Integer> SupportedCopyStates, String ReplicationSettingData, Integer Operation);

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
	 *   Targets allocated from Shared storage pool: Targets are allocated from a shared pool for all targets of the same type. 
	 *   Targets allocated from Exclusive storage pool: Targets are allocated from a pool that is exclusive. 
	 *   Targets allocated from Multiple storage pools: Targets are allocated from multiple pools. Targets require reserved elements: Targets must have a specific Usage value. Target is associated to SynchronizationAspect: Target is associated via SettingsDefineState association to an instance of SynchronizationAspect. Source is associated to SynchronizationAspect: Source is associated via SettingsDefineState association to an instance of SynchronizationAspect. Error recovery from Broken state Automatic: Once the connection is repaired, the copy operation continues automatically. 
	 *   Target must remain associated to source: A dependent target element must remain associated to source element at all times. 
	 *   Remote resource requires remote CIMOM: Client is required to interact with two providers: the provider controlling the source element and the provider controlling the target element.
	 *   Synchronized clone target detaches automatically: The clone target element detaches automatically when the target element becomes synchronized; otherwise, the client needs to explicitly request a detach operation.
	 *   Reverse Roles operation requires Read Only source: The Reverse Roles operation requires the source element to be in the Read Only mode. 
	 *   Reverse Roles operation requires subsequent resync: After the Reverse Roles operation completed, it is required to resync the synchronization relationship between the source and the target elements. 
	 *   Restore operation requires subsequent fracture: The copy operation has completed; however, the synchronization relationship must be fractured. 
	 *   Resync operation requires subsequent activate: For the copy operation to continue, the synchronization relationship must be activated.
	 *   Copy operation requires offline source: Instrumentation requires the source element to be offline (not-ready) to ensure data does not change before starting the copy operation. Adjustable CopyPriority: Priority of copy operation versus the host I/O can be adjusted.
	 *   Source requires reserved element: Source element must have a Usage value that indicates the element may be a "Replica Source". 
	 *   Supports undiscovered resources: The service can perform copy operations to and from elements, e.g. a "ReplicationEntity", on a ComputerSystem not known to the service. 
	 *   Target element can be added to collections: After the replication relationship is established, the target element can be added to the supplied collections -- such as a DeviceMaskingGroup.Reverse Roles operation requires Synchronized state: For the Reverse Roles operation, CopyState must be in Synchronized state. 
	 *   Reverse Roles operation requires Fractured state: For the Reverse Roles operation, CopyState must be in Fractured state. 
	 *   Reverse Roles operation requires Split state:For the Reverse Roles operation, CopyState must be in Split state. 
	 *   Reverse Roles operation requires FailedOver state: For the Reverse Roles operation, CopyState must be in FailedOver state. 
	 *   Reverse Roles operation requires Suspended state: For the Reverse Roles operation, CopyState must be in Suspended state. 
	 *   Provider can manage remote source: Remote source can be managed by the Provider. 
	 *   Provider can manage remote target: Remote target can be managed by the Provider. 
	 *   Supports temporary ReplicationEntity: Implementation supports temporary instances of ReplicationEntity. 
	 *   Supports persistent ReplicationEntity: Implementation supports persistent instances of ReplicationEntity. 
	 *   ReplicationEntity supports embedded instance: ReplicationEntity can include an embedded instance. 
	 *   TargetElement shall not be supplied: Replication method does not accept TargetElement or TargetElements. Implementation creates the required target element. 
	 *   TargetPool shall not be supplied: Implementation locates the appropriate resource pool or resource pools. 
	 *   TargetGoal shall not be supplied: Implementation determines the appropriate setting for the target element. 
	 *   Provider can create remote elements: If not supplied the Provider creates remote elements. 
	 *   Creating remote elements requires TargetPool: For the Provider to create remote elements, TargetPool or TargetPools must be supplied. 
	 *   Local targets allocated from sources resource pool: Implementation allocates targets from source's pool. 
	 *   Supports SynchronizationAspect: Implementation supports managing instances of SynchronizationAspect. 
	 *   Accepts foreign object paths: Foreign object paths are well formed. However, they are not discovered by the provider. 
	 *   Failover operation requires subsequent split: Planned failover operation requires copy relationship to be split or fractured. 
	 *   Restore operation requires subsequent resume: After restore operation completes, copy operation needs to be resumed. 
	 *   GetPeerSystems can return access points: Method GetPeerSystemscan return access points such as ProtocolEndpoints which can be used to create RemoteReplicationCollections.
	 *   Client can supply target ElementName: Implementation accepts ElementName or ElementNames for target elements. 
	 *   Reverse Roles operation does not change CopyState: After Reverse Roles operation completes, CopyState does not change. 
	 *   Failover operation requires subsequent failback: The failover operation requires a subsequent failback before additional operations may be applied to replication relationship, except for the detach operation. The detach operation may be issued from the failedover state. 
	 *   Planned Failover operation requires fractured state: The copy relationship must be in the CopyState fractured before a planned failover operation -- in planned failover, source and target elements are reachable. 
	 *   Target element requires resource pool reserved for replication: Target elements can only be created in a resource pool that is reserved for replication service -- per the Usage value of the resource pool. 
	 *   Uses Reverse Roles for Failover and Failback: Implementation uses the Reverse Roles operation for Failover and Failback.Create Replication requests should be sent to target service: Requests such as CreateElementReplica, CreateListReplica, etc. should be sent to service controlling the target elements. 
	 *   All Modify operations should be sent to target service: Requests such as ModifyReplicaSynchronization should be sent to service controlling the target elements. 
	 *   Supports multiple target elements per SynchronizationAspect: More than one target element can be associated to an instance of SynchronizationAspect. 
	 *   Can delete source in a copy relationship: Targetbecomes an independent element not associated to source element. 
	 *   Target always in a system generated group: Target element must always be in a group. When necessary, system will generate the group.
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" FeaturesUnique="false" FeaturesMany="true"
	 *        FeaturesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"..\",\"32768..\"]' Values='[\"Replication groups\",\"Multi-hop element replication\",\"Multi-hop elements must have same SyncType\",\"Multi-hop requires advance notice\",\"Requires full discovery of target ComputerSystem\",\"Service suspends source I/O when necessary\",\"Targets allocated from Any storage pool\",\"Targets allocated from Shared storage pool\",\"Targets allocated from Exclusive storage pool\",\"Targets allocated from Multiple storage pools\",\"Targets require reserved elements\",\"Target is associated to SynchronizationAspect\",\"Source is associated to SynchronizationAspect\",\"Error recovery from Broken state Automatic\",\"Target must remain associated to source\",\"Remote resource requires remote CIMOM\",\"Synchronized clone target detaches automatically\",\"Reverse Roles operation requires Read Only source\",\"Reverse Roles operation requires subsequent resync\",\"Restore operation requires subsequent fracture\",\"Resync operation requires subsequent activate\",\"Copy operation requires offline source\",\"Adjustable CopyPriority\",\"Source requires reserved element\",\"Supports undiscovered resources\",\"Restore operation requires subsequent detach\",\"Target element can be added to collections\",\"Reverse Roles operation requires Synchronized state\",\"Reverse Roles operation requires Fractured state\",\"Reverse Roles operation requires Split state\",\"Reverse Roles operation requires FailedOver state\",\"Reverse Roles operation requires Suspended state\",\"Provider can manage remote source\",\"Provider can manage remote target\",\"Supports temporary ReplicationEntity\",\"Supports persistent ReplicationEntity\",\"ReplicationEntity supports embedded instance\",\"TargetElement shall not be supplied\",\"TargetPool shall not be supplied\",\"TargetGoal shall not be supplied\",\"Provider can create remote elements\",\"Creating remote elements requires TargetPool\",\"Local targets allocated from sources resource pool\",\"Supports SynchronizationAspect\",\"Accepts foreign object paths\",\"Failover operation requires subsequent fracture\",\"Failover operation requires subsequent split\",\"Restore operation requires subsequent resume\",\"GetPeerSystems can return access points\",\"Client can supply target ElementName\",\"Reverse Roles operation does not change CopyState\",\"Failover operation requires subsequent failback\",\"Planned Failover operation requires fractured state\",\"Target element requires resource pool reserved for replication\",\"Uses Reverse Roles for Failover and Failback\",\"Create Replication requests should be sent to target service\",\"Create Replication requests should be sent to source service\",\"All Modify operations should be sent to target service\",\"All Modify operations should be sent to source service\",\"Supports multiple target elements per SynchronizationAspect\",\"Can delete source in a copy relationship\",\"Detach a snapshot makes snapshot an independent volume\",\"Target always in a system generated group\",\"DMTF Reserved\",\"Vendor Specific\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedFeatures(Integer ReplicationType, EList<Integer> Features, String ReplicationSettingData);

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
	 *   Group can only have one single relationship active: Only one StorageSynchronized association within a group can be active at a given time. 
	 *   Source element can be removed from group: A source element can be removed even when the group is associated with another replication group. 
	 *   Target element can be removed from group: A target element can be removed even when the group is associated with another replication group. 
	 *   Group can be temporary: Group can have a persistence of false, which means the group -- not its elements, may be deleted if it no longer participates in a replication operation. 
	 *   Group is nameable: In creating a group, it is possible to name the group. 
	 *   Supports target element count: It is possible to supply one source element and request more than one target element copies.
	 *   Synchronized clone target detaches automatically: The clone target group detaches automatically when the target group becomes synchronized; otherwise, the client needs to explicitly request a detach operation.
	 *   Reverse Roles operation requires Read Only source: The Reverse Roles operation requires the source element to be in the Read Only mode. 
	 *   Reverse Roles operation requires subsequent resync: For the copy operation to continue, resync of source and target elements is required. 
	 *   Restore operation requires subsequent fracture: The copy operation has completed; however, the synchronization relationship must be fractured. 
	 *   Resync operation requires subsequent activate: For the copy operation to continue, the synchronization relationship must be activated. 
	 *   Copy operation requires offline source: Instrumentation requires the source element to be offline (not-ready) to ensure data does not change before starting the copy operation. 
	 *   TokenizedClone ConsistentPointInTime: The point-in-time to be created at an exact time with no I/O activities in such a way the data is consistent among all the elements or the group. 
	 *   Target element can be added to collections: After the replication relationship is established, the target element can be added to the supplied collections -- such as a DeviceMaskingGroup.Reverse Roles operation requires Synchronized state: For the Reverse Roles operation, CopyState must be in Synchronized state. 
	 *   Reverse Roles operation requires Fractured state: For the Reverse Roles operation, CopyState must be in Fractured state. 
	 *   Reverse Roles operation requires Split state:For the Reverse Roles operation, CopyState must be in Split state. 
	 *   Reverse Roles operation requires FailedOver state: For the Reverse Roles operation, CopyState must be in FailedOver state. 
	 *   Reverse Roles operation requires Suspended state: For the Reverse Roles operation, CopyState must be in Suspended state. 
	 *   Provider can manage remote source group: Remote source group can be managed by the Provider. 
	 *   Provider can manage remote target group: Remote target group can be managed by the Provider. 
	 *   Supports temporary ReplicationEntity: Implementation TargetGroup shall not be supplied: Replication method does not accept TargetGroup. Implementation creates the required target group. 
	 *   TargetPool shall not be supplied: Implementation locates the appropriate resource pool. 
	 *   TargetSettingGoal shall not be supplied: Implementation determines the appropriate setting for the target elements. 
	 *   Provider can create remote target group: If not supplied the Provider creates remote target group. 
	 *   Creating remote elements requires TargetPool: For the Provider to create remote elements, TargetPool must be supplied. 
	 *   Target group shall be supplied: Target group is required. 
	 *   CreateGroupReplica only accepts empty groups: Only empty replication groups can be supplied to form GroupSynchronized. 
	 *   One replication group per storage pool: Only one replication group per storage pool. 
	 *   Supports ConsistencyExempt when adding to group: Elements can be added to a replication group with ConsistencyExempt set to true. 
	 *   Add or Remove to group requires Fractured state: Adding or removing elements to a replication group, requires GroupSynchronized state to be Fractured. 
	 *   Add or Remove to group requires Split state: Adding or removing elements to a replication group, requires GroupSynchronized state to be Split. 
	 *   Add or Remove to group requires Suspended state: Adding or removing elements to a replication group, requires GroupSynchronized state to be Suspended. 
	 *   Add or Remove to group requires FailedOver state: Adding or removing elements to a replication group, requires GroupSynchronized state to be FailedOver. 
	 *   Supports SynchronizationAspect of replication group: Implementation supports managing instances of SynchronizationAspect of replication group. 
	 *   No element level StorageSynchronized: Implementation does not support StorageSynchronized associations between members of replication groups. If such associations appear, they cannot be manipulated individually. All control operations should be applied to the GroupSynchronized. 
	 *   Accepts foreign object paths: Foreign object paths are well formed. However, they are not discovered by the provider. 
	 *   Failover operation requires subsequent split: Planned failover operation requires group to be split or fractured. 
	 *   Restore operation requires subsequent resume: After restore operation completes, copy operation needs to be resumed. 
	 *   One consistent async per RemoteReplicationCollection: Only one asynchronous copy operation per RemoteReplicationCollection. 
	 *   Client can supply RelationshipName: Implementation acceptsRelationshipName to assign to group associations. 
	 *   Implementation decides group member order: The order of members in a replication group is decided by implementation. 
	 *   Reverse Roles operation does not change CopyState: After Reverse Roles operation completes, CopyState does not change. 
	 *   Failover operation requires subsequent failback: The failover operation requires a subsequent failback before additional operations may be applied to the group, except for the detach operation. The detach operation may be issued from the failedover state. 
	 *   Planned Failover operation requires split state: The group must be in the CopyState split before a planned failover operation -- in planned failover, source and target elements are reachable. 
	 *   Planned Failover operation requires fractured state: The group must be in the CopyState fractured before a planned failover operation. 
	 *   Target element requires resource pool reserved for replication: Target elements can only be created in a resource pool that is reserved for replication service -- per the Usage value of the resource pool. 
	 *   AddSyncPair requires Synchronized mirror pair: The mirror pair to be added must be in the Synchronized CopyState. 
	 *   Provider can create remote elements using TargetPools: If remote elements need to be created, the Provider can create them in the supplied resource pools. 
	 *   Uses Reverse Roles for Failover and Failback: Implementation uses the Reverse Roles operation for Failover and Failback. 
	 *   Create Replication requests should be sent to target service: Requests such as CreateGroupReplica, CreateListReplica, etc. should be sent to service controlling the target group. 
	 *   All Modify operations should be sent to target service: Requests such as ModifyReplicaSynchronization should be sent to service controlling the target group. 
	 *   Supports multiple target groups per SynchronizationAspect: More than one target group can be associated to an instance of SynchronizationAspect. 
	 *   Can delete source in a copy relationship: Target elements become independent elements not assocaited to source elements.
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" GroupFeaturesUnique="false" GroupFeaturesMany="true"
	 *        GroupFeaturesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"28\",\"29\",\"30\",\"31\",\"32\",\"33\",\"34\",\"35\",\"36\",\"37\",\"38\",\"39\",\"40\",\"41\",\"42\",\"43\",\"44\",\"45\",\"46\",\"47\",\"48\",\"49\",\"50\",\"51\",\"52\",\"53\",\"54\",\"55\",\"56\",\"57\",\"58\",\"59\",\"60\",\"61\",\"62\",\"63\",\"64\",\"65\",\"66\",\"67\",\"68\",\"69\",\"70\",\"71\",\"..\",\"0x8000..\"]' Values='[\"One-to-many replication\",\"Many-to-many groups\",\"Consistency enabled for all groups\",\"Empty replication groups allowed\",\"Source group must have more than one element\",\"Composite Groups\",\"Multihop element replication\",\"Multi-hop elements must have same SyncType\",\"Group can only have one single relationship active\",\"Source element can be removed from group\",\"Target element can be removed from group\",\"Group can be temporary\",\"Group is nameable\",\"Supports target element count\",\"Synchronized clone target detaches automatically\",\"Reverse Roles operation requires Read Only source\",\"Reverse Roles operation requires subsequent resync\",\"Restore operation requires subsequent fracture\",\"Resync operation requires subsequent activate\",\"Copy operation requires offline source\",\"Restore operation requires subsequent detach\",\"Element can be member of multiple groups\",\"Elements of group can be mix of thin and thick\",\"TokenizedClone ConsistentPointInTime\",\"Target elements can be added to collections\",\"Reverse Roles operation requires Synchronized state\",\"Reverse Roles operation requires Fractured state\",\"Reverse Roles operation requires Split state\",\"Reverse Roles operation requires FailedOver state\",\"Reverse Roles operation requires Suspended state\",\"Provider can manage remote source group\",\"Provider can manage remote target group\",\"TargetGroup shall not be supplied\",\"TargetPool shall not be supplied\",\"TargetSettingGoal shall not be supplied\",\"Provider can create remote target group\",\"Provider can create local target group\",\"Provider must create remote group\",\"Creating remote elements requires TargetPool\",\"Target group shall be supplied\",\"CreateGroupReplica only accepts empty groups\",\"One replication group per storage pool\",\"Supports ConsistencyExempt when adding to group\",\"Add or Remove to group requires Fractured state\",\"Add or Remove to group requires Split state\",\"Add or Remove to group requires Suspended state\",\"Add or Remove to group requires FailedOver state\",\"Supports SynchronizationAspect of replication group\",\"No element level StorageSynchronized\",\"Accepts foreign object paths\",\"Failover operation requires subsequent fracture\",\"Failover operation requires subsequent split\",\"Restore operation requires subsequent resume\",\"One consistent async per RemoteReplicationCollection\",\"Client can supply RelationshipName\",\"Implementation decides group member order\",\"Reverse Roles operation does not change CopyState\",\"Failover operation requires subsequent failback\",\"Planned Failover operation requires split state\",\"Planned Failover operation requires fractured state\",\"Target element requires resource pool reserved for replication\",\"AddSyncPair requires Synchronized mirror pair\",\"Provider can create remote elements using TargetPools\",\"Uses Reverse Roles for Failover and Failback\",\"Create Replication requests should be sent to target service\",\"Create Replication requests should be sent to source service\",\"All Modify operations should be sent to target service\",\"All Modify operations should be sent to source service\",\"Supports multiple target groups per SynchronizationAspect\",\"Can delete source in a copy relationship\",\"DMTF Reserved\",\"Vendor Specific\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedGroupFeatures(Integer ReplicationType, EList<Integer> GroupFeatures, String ReplicationSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the supported Consistency.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SupportedConsistency An array of Supported Features. Sequentially Consistent: Members of a target group are sequentially consistent - the order of the write operations is maintained.
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedConsistencyUnique="false" SupportedConsistencyMany="true"
	 *        SupportedConsistencyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"..\",\"0x8000..\"]' Values='[\"Sequentially Consistent\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_GroupSynchronized.ConsistencyType\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedConsistency(Integer ReplicationType, EList<Integer> SupportedConsistency, String ReplicationSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the supported Operations on a StorageSynchronized association that can be supplied to the ModifyReplicaSynchronization method.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SupportedOperations
	 *   An array of Supported Operations. 
	 *   Abort: Abort the copy operation if it is possible. Activate Consistency: Ensure all target elements of a group are consistent. 
	 *   Activate: Activate an inactive or prepared source and target association. 
	 *   AddSyncPair: Add elements associated via StorageSynchronized to source and target groups. 
	 *   Deactivate Consistency: Disable consistency. 
	 *   Deactivate: Deactivate a source and target association. The 
	 *   writes to the target are deleted in the case of a snapshot. Detach: Remove the association between source and target. 
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
	 *   Unprepare: Causes the synchronization to be reinitialized and stop in Prepared state -- deprecated. 
	 *   Prepare: Replaces the Unprepare operation. 
	 *   Reset To Adaptive: Change the Mode of the copy operation to Adaptive. 
	 *   Reset to Active: Change the Mode of the copy operation to Active. 
	 *   Reset Replica: Causes replica to go back to its original point-in-time.
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * @param CopyState Limit the returned operations for this CopyState. If not specified, all supported operations for the ReplicationType are returned.
	 * @param ServiceControlling
	 *   Indicates which service can perform the operation. Values in this array are parallel to values in SupportedOperations. 
	 *   Source Only: Service that controls the source. 
	 *   Target Only: Service that controls the target. 
	 *   Source or Target: Service that controls either the source or the target. 
	 *   Both Source and Target: Service that controls 
	 *   both the source and the target. 
	 *   If null, "Source or Target" is assumed.
	 * @param RequiresForce Indicates whether the operation has to be forced by overriding certain configuration consistency checks. Values in this array are parallel to values in SupportedOperations.
	 * @param UpdatesSynchronizedPath Indicates whether the operation updates the keys of the Synchronized association.Values in this array are parallel to values in SupportedOperations.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedOperationsUnique="false" SupportedOperationsMany="true"
	 *        SupportedOperationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Abort\",\"Activate Consistency\",\"Activate\",\"AddSyncPair\",\"Deactivate Consistency\",\"Deactivate\",\"Detach\",\"Dissolve\",\"Failover\",\"Failback\",\"Fracture\",\"RemoveSyncPair\",\"Resync Replica\",\"Restore from Replica\",\"Resume\",\"Reset To Sync\",\"Reset To Async\",\"Return To ResourcePool\",\"Reverse Roles\",\"Split\",\"Suspend\",\"Unprepare\",\"Prepare\",\"Reset To Adaptive\",\"Reset to Active\",\"Reset Replica\",\"DMTF Reserved\",\"Vendor Specific\"]' ArrayType='Indexed'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" CopyStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" ServiceControllingUnique="false" ServiceControllingMany="true"
	 *        ServiceControllingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Source Only\",\"Target Only\",\"Source or Target\",\"Both Source and Target\",\"DMTF Reserved\",\"Vendor Specific\"]' ArrayType='Indexed'" RequiresForceUnique="false" RequiresForceMany="true"
	 *        RequiresForceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' Out='true' ArrayType='Indexed'" UpdatesSynchronizedPathUnique="false" UpdatesSynchronizedPathMany="true"
	 *        UpdatesSynchronizedPathAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' Out='true' ArrayType='Indexed'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedOperations(Integer ReplicationType, EList<Integer> SupportedOperations, String ReplicationSettingData, Integer CopyState, EList<Integer> ServiceControlling, EList<Boolean> RequiresForce, EList<Boolean> UpdatesSynchronizedPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the supported Operations on a GroupSynchronized association that can be supplied to the ModifyReplicaSynchronization method.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SupportedGroupOperations
	 *   An array of Supported group Operations. Abort: Abort the copy operation if it is possible. 
	 *   Activate Consistency: Ensure all target elements of a group are consistent. 
	 *   Activate: Activate an inactive or prepared source and target association. 
	 *   AddSyncPair: Add elements associated via StorageSynchronized to source and target groups. 
	 *   Deactivate Consistency: Disable consistency. 
	 *   Deactivate: Deactivates a source and target association. The writes to the target are deleted in the case of a snapshot. 
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
	 *   Unprepare: Causes the synchronization to be reinitialized and stop in Prepared state -- deprecated. 
	 *   Prepare: Replaces the Unprepare operation. Reset to Adaptive: Change the Mode of the copy operation to Adaptive. 
	 *   Reset to Active: Change the Mode of the copy operation to Active. 
	 *   Reset Replica: Causes replica to go back to its original point-in-time.
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * @param CopyState Limit the returned operations for this CopyState. If not specified, all supported operations for the ReplicationType are returned.
	 * @param ServiceControlling
	 *   Indicates which service can perform the operation. Values in this array are parallel to values in SupportedGroupOperations. 
	 *   Source Only: Service that controls the source. 
	 *   Target Only: Service that controls the target. 
	 *   Source or Target: Service that controls either the source or the target. 
	 *   Both Source and Target: Service that controls 
	 *   both the source and the target. 
	 *   If null, "Source or Target" is assumed.
	 * @param RequiresForce Indicates whether the operation has to be forced by overriding certain configuration consistency checks. Values in this array are parallel to values in SupportedGroupOperations.
	 * @param UpdatesSynchronizedPath Indicates whether the operation updates the keys of the Synchronized association.Values in this array are parallel to values in SupportedGroupOperations.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedGroupOperationsUnique="false" SupportedGroupOperationsMany="true"
	 *        SupportedGroupOperationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Abort\",\"Activate Consistency\",\"Activate\",\"AddSyncPair\",\"Deactivate Consistency\",\"Deactivate\",\"Detach\",\"Dissolve\",\"Failover\",\"Failback\",\"Fracture\",\"RemoveSyncPair\",\"Resync Replica\",\"Restore from Replica\",\"Resume\",\"Reset To Sync\",\"Reset To Async\",\"Return To ResourcePool\",\"Reverse Roles\",\"Split\",\"Suspend\",\"Unprepare\",\"Prepare\",\"Reset To Adaptive\",\"Reset to Active\",\"Reset Replica\",\"DMTF Reserved\",\"Vendor Specific\"]' ArrayType='Indexed'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" CopyStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" ServiceControllingUnique="false" ServiceControllingMany="true"
	 *        ServiceControllingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Source Only\",\"Target Only\",\"Source or Target\",\"Both Source and Target\",\"DMTF Reserved\",\"Vendor Specific\"]' ArrayType='Indexed'" RequiresForceUnique="false" RequiresForceMany="true"
	 *        RequiresForceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' Out='true' ArrayType='Indexed'" UpdatesSynchronizedPathUnique="false" UpdatesSynchronizedPathMany="true"
	 *        UpdatesSynchronizedPathAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' Out='true' ArrayType='Indexed'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedGroupOperations(Integer ReplicationType, EList<Integer> SupportedGroupOperations, String ReplicationSettingData, Integer CopyState, EList<Integer> ServiceControlling, EList<Boolean> RequiresForce, EList<Boolean> UpdatesSynchronizedPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the supported Operations on a list of StorageSynchronized or GroupSynchronized associations that can be supplied to the ModifyListSynchronization method.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SynchronizationType Specifies the supported operations as they apply to a list of StorageSynchronized or GroupSynchronized. If this parameter is not specified, StorageSynchronized is assumed.
	 * @param SupportedListOperations
	 *   An array of Supported group Operations. Abort: Abort the copy operation if it is possible. 
	 *   Activate Consistency: Ensure all target elements of a group are consistent. 
	 *   Activate: Activate an inactive or prepared source and target association. 
	 *   Deactivate Consistency: Disable consistency. 
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
	 *   Split: Similar to Fracture, however, the provider needs to make sure whether there are pending I/O in transit before fracturing the connection. 
	 *   Suspend: Stop the copy operations to the target element. 
	 *   Continue when the operations is resumed. 
	 *   Unprepare: Causes the synchronization to be reinitialized and stop in Prepared state -- deprecated. Prepare: Replaces the Unprepare operation. 
	 *   Reset To Adaptive: Change the Mode of the copy operation to Adaptive. 
	 *   Reset to Active: Change the Mode of the copy operation to Active. 
	 *   Reset Replica: Causes replica to go back to its original point-in-time.
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * @param CopyState Limit the returned operations for this CopyState. If not specified, all supported operations for the ReplicationType are returned.
	 * @param ServiceControlling
	 *   Indicates which service can perform the operation. Values in this array are parallel to values in SupportedListOperations. 
	 *   Source Only: Service that controls the source. 
	 *   Target Only: Service that controls the target. 
	 *   Source or Target: Service that controls either the source or the target. 
	 *   Both Source and Target: Service that controls 
	 *   both the source and the target. 
	 *   If null, "Source or Target" is assumed.
	 * @param RequiresForce Indicates whether the operation has to be forced by overriding certain configuration consistency checks. Values in this array are parallel to values in SupportedListOperations.
	 * @param UpdatesSynchronizedPath Indicates whether the operation updates the keys of the Synchronized association.Values in this array are parallel to values in SupportedListOperations.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SynchronizationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"StorageSynchronized\",\"GroupSynchronized\",\"DMTF Reserved\",\"Vendor Specific\"]'" SupportedListOperationsUnique="false" SupportedListOperationsMany="true"
	 *        SupportedListOperationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Abort\",\"Activate Consistency\",\"Activate\",\"DMTF Reserved\",\"Deactivate Consistency\",\"Deactivate\",\"Detach\",\"Dissolve\",\"Failover\",\"Failback\",\"Fracture\",\"DMTF Reserved\",\"Resync Replica\",\"Restore from Replica\",\"Resume\",\"Reset To Sync\",\"Reset To Async\",\"Return To ResourcePool\",\"Reverse Roles\",\"Split\",\"Suspend\",\"Unprepare\",\"Prepare\",\"Reset To Adaptive\",\"Reset to Active\",\"Reset Replica\",\"DMTF Reserved\",\"Vendor Specific\"]' ArrayType='Indexed'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" CopyStateAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'" ServiceControllingUnique="false" ServiceControllingMany="true"
	 *        ServiceControllingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Source Only\",\"Target Only\",\"Source or Target\",\"Both Source and Target\",\"DMTF Reserved\",\"Vendor Specific\"]' ArrayType='Indexed'" RequiresForceUnique="false" RequiresForceMany="true"
	 *        RequiresForceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' Out='true' ArrayType='Indexed'" UpdatesSynchronizedPathUnique="false" UpdatesSynchronizedPathMany="true"
	 *        UpdatesSynchronizedPathAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' Out='true' ArrayType='Indexed'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedListOperations(Integer ReplicationType, Integer SynchronizationType, EList<Integer> SupportedListOperations, String ReplicationSettingData, Integer CopyState, EList<Integer> ServiceControlling, EList<Boolean> RequiresForce, EList<Boolean> UpdatesSynchronizedPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the supported Operations on a SettingsDefineState association that can be supplied to the ModifySettingsDefineState or ModifyListSettingsDefineState method.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param SupportedOperations
	 *   An array of supported Operations. 
	 *   Activate Consistency: Enable consistency. 
	 *   Deactivate Consistency: Disable consistency 
	 *   Delete: Remove the SettingsDefineState association. Instance of SynchronizationAspect may also be deleted if it is not shared with other elements. 
	 *   Copy To Target: Introduces the target elements and forms the necessary associations between the source and the target elements i.e. StorageSynchronized and GroupSynchronized.
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedOperationsUnique="false" SupportedOperationsMany="true"
	 *        SupportedOperationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Activate Consistency\",\"Deactivate Consistency\",\"Delete\",\"Copy To Target\",\"Detach\",\"Restore\",\"Attach To Target\",\"DMTF Reserved\",\"Vendor Specific\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedSettingsDefineStateOperations(Integer ReplicationType, EList<Integer> SupportedOperations, String ReplicationSettingData);

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
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedThinProvisioningFeaturesUnique="false" SupportedThinProvisioningFeaturesMany="true"
	 *        SupportedThinProvisioningFeaturesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Thin provisioning is not supported\",\"Zeros written in unused allocated blocks of target\",\"Unused allocated blocks of target are not initialized\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ReplicationSettingData.ThinProvisioningPolicy\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedThinProvisioningFeatures(Integer ReplicationType, EList<Integer> SupportedThinProvisioningFeatures, String ReplicationSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method accepts a ReplicationType and a component, it then returns a static numeric value representing the maximum number of the specified component that the service supports. A value of 0 indicates unlimited components of the given type. In all cases the maximum value is bound by the availability of resources on the computer system. Effectively, the method informs clients of the edge conditions.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param Component
	 *   For the given Mirror, Snapshot, Clone and their mode and locality variations as specified by ReplicationType, this parameter represents one of the following components: Number of groups: Maximum number of groups supported by the replication service.Number of elements per source group: Maximum number of elements in a group that can be used as a source group. Number of elements per target group: Maximum number of elements in a group that can be used as a target group. Number of target elements per source element: Maximum number of target elements per source element. Number of total source elements: Maximum number of total source elements supported by the service. Number of total target elements: Maximum number of total target elements supported by the source. Number of peer systems: Maximum number of peer systems that replication service can communicate with. Number of hops in multi-hop replication: Maximum number of hops in multi-hop replication the service can manage. 
	 *   Maximum number of tokens supported: Maximum number of tokens per sub-system. 
	 *   Current number of tokens in-use: Number of tokens in use for the sub-system. 
	 *   Optimal token size: Refers to OptimalDataChunk. 
	 *   Number of SynchronizationAspect instances: Maximum number of SynchronizationAspect instances per system.
	 * @param MaxValue The maximum value, or 0 if the maximum is unlimited.
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" ComponentAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"..\",\"0x8000..\"]' Values='[\"Number of groups\",\"Number of elements per source group\",\"Number of elements per target group\",\"Number of target elements per source element\",\"Number of total source elements\",\"Number of total target elements\",\"Number of peer systems\",\"Number of hops in multi-hop copy\",\"Maximum number of tokens supported\",\"Current number of tokens in-use\",\"Optimal token size\",\"Number of SynchronizationAspect instances\",\"Number of SynchronizationAspect instances per source element\",\"Number of SynchronizationAspect instances per source group\",\"DMTF Reserved\",\"Vendor Specific\"]'" MaxValueAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Out='true'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Information is not available\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedMaximum(Integer ReplicationType, Integer Component, Long MaxValue, String ReplicationSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType, returns the default consistency value.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param DefaultConsistency Default consistency value, or 0 if there is no default value.
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" DefaultConsistencyAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"0x8000..\"]' Values='[\"No default consistency\",\"DMTF Reserved\",\"Sequentially Consistent\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_GroupSynchronized.ConsistencyType\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetDefaultConsistency(Integer ReplicationType, Integer DefaultConsistency, String ReplicationSettingData);

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
	 * Property Is Not Supported: Implementation does not support the property. 
	 * Use the method GetSupportedReplicationSettingDataDateTime for properties that have datatime data type. Their use in this method is deprecated.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param PropertyName A value representing the property name.For properties DeltaUpdateInterval, TimeBeforeRemoval, and RPO, use GetSupportedReplicationSettingDataDateTime method which returns actual datatime values.
	 * @param SupportedValues An array containing the supported values that can be supplied in an instance of a ReplicationSettingData. Refer to the class ReplicationSettingData for the possible values for each property. For boolean data, use the following data mapping: 2="false", 3="true".
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\",\"CIM_ReplicationServiceCapabilities.GetSupportedReplicationSettingDataDateTime\"]'" PropertyNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\",\"0x8000..\"]' Values='[\"ConsistentPointInTime\",\"DesiredCopyMethodology\",\"Multihop\",\"OnGroupOrListError\",\"UnequalGroupsAction\",\"TargetElementSupplier\",\"ThinProvisioningPolicy\",\"Pairing\",\"FailedCopyStopsHostIO\",\"CopyRecoveryMode\",\"UnequalListsAction\",\"DeltaUpdateInterval\",\"DeltaUpdateBlocks\",\"ReadOnly\",\"StorageCompressionPolicy\",\"TargetElementResourcePool\",\"TargetElementGoal\",\"RRCSoftwareCompressionEnabled\",\"RRCHardwareCompressionEnabled\",\"AutoDelete\",\"TimeBeforeRemoval\",\"ConsistencyExempt\",\"ConsistentAsyncCopy\",\"RPO\",\"Skew\",\"DMTF Reserved\",\"Vendor Specific\"]'" SupportedValuesUnique="false" SupportedValuesMany="true"
	 *        SupportedValuesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint64[]' In='false' Out='true' ModelCorrespondence='[\"CIM_ReplicationSettingData.ConsistentPointInTime\",\"CIM_ReplicationSettingData.DesiredCopyMethodology\",\"CIM_ReplicationSettingData.Multihop\",\"CIM_ReplicationSettingData.OnGroupOrListError\",\"CIM_ReplicationSettingData.Pairing\",\"CIM_ReplicationSettingData.UnequalGroupsAction\",\"CIM_ReplicationSettingData.TargetElementSupplier\",\"CIM_ReplicationSettingData.ThinProvisioningPolicy\",\"CIM_ReplicationSettingData.FailedCopyStopsHostIO\",\"CIM_ReplicationSettingData.CopyRecoveryMode\",\"CIM_ReplicationSettingData.UnequalListsAction\",\"CIM_ReplicationSettingData.DeltaUpdateBlocks\",\"CIM_ReplicationSettingData.ReadOnly\",\"CIM_ReplicationSettingData.StorageCompressionPolicy\",\"CIM_ReplicationSettingData.TargetElementResourcePool\",\"CIM_ReplicationSettingData.TargetElementGoal\",\"CIM_ReplicationSettingData.RRCSoftwareCompressionEnabled\",\"CIM_ReplicationSettingData.RRCHardwareCompressionEnabled\",\"CIM_ReplicationSettingData.AutoDelete\",\"CIM_ReplicationSettingData.ConsistencyExempt\",\"CIM_ReplicationSettingData.ConsistentAsyncCopy\",\"CIM_ReplicationSettingData.MaximumSkew\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Property Is Not Supported\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedReplicationSettingData(Integer ReplicationType, Integer PropertyName, EList<Long> SupportedValues, String ReplicationSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method for a given ReplicationType returns the default ReplicationSettingData as an instance.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param DefaultInstance A copy of the ReplicationSettingData instance is populated with default values for the given ReplicationType.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" DefaultInstanceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' EmbeddedObject='true'"
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
	 * @param OtherElementAccessPoint A reference to the access point instance to allow the service to access the OtherElement. If NULL, it is assumed the service does not need any access information or the element is local.
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
	 *        ModesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Synchronous\",\"Asynchronous\",\"Adaptive\",\"Active\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.Mode\"]'" LocalElementRoleUnique="false" LocalElementRoleMany="true"
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
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" SupportedStorageCompressionFeaturesUnique="false" SupportedStorageCompressionFeaturesMany="true"
	 *        SupportedStorageCompressionFeaturesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Storage compression is not supported\",\"Compressed source to compressed target\",\"Compressed source to uncompressed target\",\"Uncompressed source to compressed target\",\"Compression of target same as source\",\"Target pool decides compression of target element\",\"Implementation decides compression of target\",\"DMTF Reserved\",\"Vendor specific\"]' ModelCorrespondence='[\"CIM_ReplicationSettingData.StorageCompressionPolicy\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedStorageCompressionFeatures(Integer ReplicationType, EList<Integer> SupportedStorageCompressionFeatures, String ReplicationSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For the supplied elements, this method returns the supported tokenized ReplicationTypes. At least one supplied element is expected to be local to the service. 
	 * Not Supported: Tokenized operation is not supported between the supplied elements. 
	 * Source Temporarily Not Available: Source element temporarily cannot be used for tokenized operations -- for example, the source element is currently being used for another copy operation. 
	 * Target Temporarily Not Available: Target element temporarily cannot be used for tokenized operations -- for example, the target element is currently being used for another copy operation.
	 * @param SourceElement A reference to the source element.
	 * @param TargetElement A reference to the target element.
	 * @param ElementAccessPoint A reference to the access point instance to allow the service to access the Element if the element is not local to the service. If NULL, it is assumed the service does not need any access information to the local element.
	 * @param ReplicationSettingData If supplied, it provides additional information about the copy operation. For example, the intended CopyMethodology.
	 * @param ReplicationTypes An array of supported tokenized ReplicationTypes.
	 * <!-- end-model-doc -->
	 * @model SourceElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" TargetElementAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF'" ElementAccessPointAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" ReplicationTypesUnique="false" ReplicationTypesMany="true"
	 *        ReplicationTypesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Source Temporarily Not Available\",\"Target Temporarily Not Available\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedTokenizedReplicationType(CIM_ManagedElement SourceElement, CIM_ManagedElement TargetElement, CIM_ServiceAccessPoint ElementAccessPoint, String ReplicationSettingData, EList<Integer> ReplicationTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method indicates if ElementName or RelationshipName can be specified as a part of invoking an appropriate method of ReplicationService to create a new element or association. 
	 * Additionally, the returned data includes the methods that can be used to modify the ElementName of existing components. 
	 * This method also returns the restrictions on the ElementName in the related "OUT" parameters.
	 * @param ElementType A value indicating the element type.
	 * @param SupportedFeatures
	 *   Enumeration indicating what methods can accept the element name for creation or modification of a component. 
	 *   CreateElementReplica is an example of an InvokeMethod. ModifyInstance and SetProperty are examples of intrinsic methods. 
	 *   An empty array indicates ElementNaming for ElementType is not supported, in which case the other OUT parameters are null.
	 * @param MaxElementNameLen Maximum supported ElementName length.
	 * @param ElementNameMask
	 *   This string expresses the restrictions on ElementName. The mask is expressed as a regular expression. See DMTF standard ABNF with the Management Profile Specification Usage Guide, Annex C for the regular expression syntax permitted. 
	 *   Since the ElementNameMask can describe the maximum length of the ElementName, any length defined in the regexp is in addition to the restriction defined in MaxElementNameLen (causing the smaller value to be the maximum length). The ElementName value satisfies the restriction, if and only if it matches the regular expression. 
	 *   If NULL, it indicates no restrictions on the ElementName.
	 * <!-- end-model-doc -->
	 * @model ElementTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"ReplicationGroup\",\"StorageSynchronized\",\"GroupSynchronized\",\"SynchronizationAspect\",\"ReplicationEntity\",\"DMTF Reserved\",\"Vendor Specific\"]'" SupportedFeaturesUnique="false" SupportedFeaturesMany="true"
	 *        SupportedFeaturesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"ElementName can be supplied during creation\",\"ElementName can be modified with InvokeMethod\",\"ElementName can be modified with intrinsic method\",\"DMTF Reserved\",\"Vendor Specific\"]'" MaxElementNameLenAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Out='true' ModelCorrespondence='[\"CIM_EnabledLogicalElementCapabilities.MaxElementNameLen\"]'" ElementNameMaskAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' Out='true' ModelCorrespondence='[\"CIM_EnabledLogicalElementCapabilities.ElementNameMask\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetElementNameCapabilities(Integer ElementType, EList<Integer> SupportedFeatures, Integer MaxElementNameLen, String ElementNameMask);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method, for a given ReplicationType, returns the supported list features -- such as a list used by CreateListReplica.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param GroupFeatures
	 *   An array of Supported List Features. 
	 *   Sequential consistency: Elements of the list are consistent. 
	 *   No consistency: Elements of the list are not consistent. 
	 *   Consistent list requires same ElementNames: If ElementNames are supplied, they need to be the same. 
	 *   Target element can be added to collections: After the replication relationship is established, the target element can be added to the supplied collections -- such as a DeviceMaskingGroup.
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" GroupFeaturesUnique="false" GroupFeaturesMany="true"
	 *        GroupFeaturesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"List is supported\",\"Sequential consistency\",\"No consistency\",\"Consistent list requires same ElementNames\",\"Target element can be added to collections\",\"DMTF Reserved\",\"Vendor Specific\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedListFeatures(Integer ReplicationType, EList<Integer> GroupFeatures, String ReplicationSettingData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For the supplied Synchronized association, this method returns the supported operations in a series of parallel output arrays.
	 * @param Synchronization The reference to the replication association describing the elements/groups relationship.
	 * @param ReplicationSettingData If provided, it provides additional data about the Synchronization.
	 * @param SupportedOperations
	 *   An array of Supported Operations. 
	 *   Abort: Abort the copy operation if it is possible. Activate Consistency: Ensure all target elements of a group are consistent. 
	 *   Activate: Activate an inactive or prepared source and target association. 
	 *   AddSyncPair: Add elements associated via StorageSynchronized to source and target groups. 
	 *   Deactivate Consistency: Disable consistency. 
	 *   Deactivate: Deactivate a source and target association. The 
	 *   writes to the target are deleted in the case of a snapshot. Detach: Remove the association between source and target. 
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
	 *   Unprepare: Causes the synchronization to be reinitialized and stop in Prepared state -- deprecated. 
	 *   Prepare: Replaces the Unprepare operation. 
	 *   Reset To Adaptive: Change the Mode of the copy operation to Adaptive. 
	 *   Reset to Active: Change the Mode of the copy operation to Active. 
	 *   Reset Replica: Causes replica to go back to its original point-in-time.
	 * @param ServiceControlling
	 *   Indicates which service can perform the operation. Values in this array are parallel to values in SupportedOperations. 
	 *   Source Only: Service that controls the source. 
	 *   Target Only: Service that controls the target. 
	 *   Source or Target: Service that controls either the source or the target. 
	 *   Both Source and Target: Service that controls 
	 *   both the source and the target. 
	 *   If null, "Source or Target" is assumed.
	 * @param RequiresForce Indicates whether the operation has to be forced by overriding certain configuration consistency checks. Values in this array are parallel to values in SupportedOperations.
	 * @param UpdatesSynchronizedPath Indicates whether the operation updates the keys of the Synchronized association.Values in this array are parallel to values in SupportedOperations.
	 * <!-- end-model-doc -->
	 * @model SynchronizationAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Synchronized REF' Required='true'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" SupportedOperationsUnique="false" SupportedOperationsMany="true"
	 *        SupportedOperationsAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"26\",\"27\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Abort\",\"Activate Consistency\",\"Activate\",\"AddSyncPair\",\"Deactivate Consistency\",\"Deactivate\",\"Detach\",\"Dissolve\",\"Failover\",\"Failback\",\"Fracture\",\"RemoveSyncPair\",\"Resync Replica\",\"Restore from Replica\",\"Resume\",\"Reset To Sync\",\"Reset To Async\",\"Return To ResourcePool\",\"Reverse Roles\",\"Split\",\"Suspend\",\"Unprepare\",\"Prepare\",\"Reset To Adaptive\",\"Reset to Active\",\"Reset Replica\",\"DMTF Reserved\",\"Vendor Specific\"]' ArrayType='Indexed'" ServiceControllingUnique="false" ServiceControllingMany="true"
	 *        ServiceControllingAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Source Only\",\"Target Only\",\"Source or Target\",\"Both Source and Target\",\"DMTF Reserved\",\"Vendor Specific\"]' ArrayType='Indexed'" RequiresForceUnique="false" RequiresForceMany="true"
	 *        RequiresForceAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' Out='true' ArrayType='Indexed'" UpdatesSynchronizedPathUnique="false" UpdatesSynchronizedPathMany="true"
	 *        UpdatesSynchronizedPathAnnotation="http://schemas.dmtf.org/wbem/cim cimType='boolean[]' Out='true' ArrayType='Indexed'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedOperationsForSynchronization(CIM_Synchronized Synchronization, String ReplicationSettingData, EList<Integer> SupportedOperations, EList<Integer> ServiceControlling, EList<Boolean> RequiresForce, EList<Boolean> UpdatesSynchronizedPath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For the supplied (remote) system, this method returns the supported ReplicationTypes that the service supports. For example, ReplicationType of 3 indicates the service supports "Synchronous Mirror Remote" to the supplied system.
	 * @param System The reference to a (remote) system.
	 * @param ReplicationSettingData If provided, it provides additional data about the Synchronization.
	 * @param SupportedReplicationTypes An array of supported ReplicationTypes.
	 * <!-- end-model-doc -->
	 * @model SystemAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' Required='true'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'" SupportedReplicationTypesUnique="false" SupportedReplicationTypesMany="true"
	 *        SupportedReplicationTypesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' Out='true' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedReplicationTypesForSystem(CIM_ComputerSystem System, String ReplicationSettingData, EList<Integer> SupportedReplicationTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method, for a given ReplicationType returns an array of supported "datetime" settings that can be utilized in an instance of the ReplicationSettingData class. 
	 * Property Is Not Supported: Implementation does not support the property. 
	 * This method is better suited for datatime properties that the GetSupportedReplicationSettingData returns.
	 * @param ReplicationType A value representing the ReplicationType.
	 * @param PropertyName A value representing the property name.
	 * @param SupportedValues An array containing the supported datetime values that can be supplied in an instance of a ReplicationSettingData. Refer to the class ReplicationSettingData for the possible values for each property.
	 * @param SupportedValuesIndicator
	 *   An OUT parameter to indicate the semantics of the supported values. 
	 *   Single: Only a single value is returned in the first element of the SupportedValues array. 
	 *   Range: Three values are returned, first: the default value, second: the minimum value, and third: the maximum value. 
	 *   Range with increment: Four values are returned. The first three are the same as "Range", and the fourth value is for the "increment". For example, if the values returned are 100, 50, 500, 10; the default is 100, min is 50, max is 500, and the increment is 10. Therefore, the possible values are 50, 60, 70, 80, etc. 
	 *   Discrete: The returned value are discrete values. However, the first value is the default value. For example, if the values returned are 30, 5, 15, 30, 60, 90; the default is 30, and the possible supported values are 5, 15, 30, 60, and 90.
	 * @param ReplicationSettingData If supplied, it provides additional refinements for the ReplicationType. For example, the CopyMethodology.
	 * <!-- end-model-doc -->
	 * @model ReplicationTypeAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_ReplicationServiceCapabilities.SupportedReplicationTypes\"]'" PropertyNameAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"13\",\"23\",\"26\",\"..\",\"0x8000..\"]' Values='[\"DeltaUpdateInterval\",\"TimeBeforeRemoval\",\"RPO\",\"DMTF Reserved\",\"Vendor Specific\"]'" SupportedValuesUnique="false" SupportedValuesMany="true"
	 *        SupportedValuesAnnotation="http://schemas.dmtf.org/wbem/cim cimType='datetime[]' In='false' Out='true' ModelCorrespondence='[\"CIM_ReplicationSettingData.DeltaUpdateInterval\",\"CIM_ReplicationSettingData.TimeBeforeRemoval\",\"CIM_ReplicationSettingData.DesiredRPO\"]'" SupportedValuesIndicatorAnnotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' In='false' Out='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Single\",\"Range\",\"Range with increment\",\"Discrete\",\"DMTF Reserved\",\"Vendor Specific\"]'" ReplicationSettingDataAnnotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedInstance='CIM_ReplicationSettingData'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Success\",\"Not Supported\",\"Unknown\",\"Timeout\",\"Failed\",\"Invalid Parameter\",\"In Use\",\"Property Is Not Supported\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Long GetSupportedReplicationSettingDataDateTime(Integer ReplicationType, Integer PropertyName, EList<String> SupportedValues, Integer SupportedValuesIndicator, String ReplicationSettingData);

} // CIM_ReplicationServiceCapabilities

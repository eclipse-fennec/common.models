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
 * A representation of the model object '<em><b>CIM File System Replication Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This subclass defines the replication capabilities of a ReplicationService. Multiple instances of FileSystemReplicationCapabilities may be associated with a ReplicationService using ElementCapabilities. A provider should create one instance for each supported SynchronizationType.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getSupportedReplicationType <em>Supported Replication Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getInitialReplicationState <em>Initial Replication State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getSupportedOperations <em>Supported Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getReplicaHostAccessibility <em>Replica Host Accessibility</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getHostAccessibleState <em>Host Accessible State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getSpaceLimitSupported <em>Space Limit Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getSpaceReservationSupported <em>Space Reservation Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getLocalMirrorSnapshotSupported <em>Local Mirror Snapshot Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getRemoteMirrorSnapshotSupported <em>Remote Mirror Snapshot Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getIncrementalDeltasSupported <em>Incremental Deltas Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getPersistentReplicasSupported <em>Persistent Replicas Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getBidirectionalConnectionsSupported <em>Bidirectional Connections Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getMaximumReplicasPerSource <em>Maximum Replicas Per Source</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getMaximumPortsPerConnection <em>Maximum Ports Per Connection</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getMaximumConnectionsPerPort <em>Maximum Connections Per Port</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getMaximumPeerConnections <em>Maximum Peer Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getMaximumLocalReplicationDepth <em>Maximum Local Replication Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getMaximumRemoteReplicationDepth <em>Maximum Remote Replication Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getReplicationPriorityDefault <em>Replication Priority Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getLowSpaceWarningThresholdDefault <em>Low Space Warning Threshold Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getSpaceLimitWarningThresholdDefault <em>Space Limit Warning Threshold Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getDeltaReplicaPoolAccess <em>Delta Replica Pool Access</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FileSystemReplicationCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Replication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the supported SyncType/Mode/Local-or-Remote combinations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Replication Type</em>' attribute.
	 * @see #setSupportedReplicationType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_SupportedReplicationType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"..\",\"0x8000..\"]' Values='[\"Synchronous Mirror Local\",\"Asynchronous Mirror Local\",\"Synchronous Mirror Remote\",\"Asynchronous Mirror Remote\",\"Synchronous Snapshot Local\",\"Asynchronous Snapshot Local\",\"Synchronous Snapshot Remote\",\"Asynchronous Snapshot Remote\",\"Synchronous Clone Local\",\"Asynchronous Clone Local\",\"Synchronous Clone Remote\",\"Asynchronous Clone Remote\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getSupportedReplicationType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getSupportedReplicationType <em>Supported Replication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Replication Type</em>' attribute.
	 * @see #getSupportedReplicationType()
	 * @generated
	 */
	void setSupportedReplicationType(Integer value);

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
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_SupportedAsynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"..\",\"0x8000..\"]' Values='[\"CreateElementReplica\",\"CreateGroupReplica\",\"CreateSynchronizationAspect\",\"ModifyReplicaSynchronization\",\"ModifyListSynchronization\",\"ModifySettingsDefineState\",\"GetAvailableTargetElements\",\"GetPeerSystems\",\"GetReplicationRelationships\",\"GetServiceAccessPoints\",\"CreateListReplica\",\"CreateGroupReplicaFromElements\",\"GetReplicationRelationshipInstances\",\"ModifyListSettingsDefineState\",\"CreateRemoteReplicationCollection\",\"AddToRemoteReplicationCollection\",\"RemoveFromRemoteReplicationCollection\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_FileSystemReplicationCapabilities.SupportedSynchronousActions\"]'"
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
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_SupportedSynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"..\",\"0x8000..\"]' Values='[\"CreateElementReplica\",\"CreateGroupReplica\",\"CreateSynchronizationAspect\",\"ModifyReplicaSynchronization\",\"ModifyListSynchronization\",\"ModifySettingsDefineState\",\"GetAvailableTargetElements\",\"GetPeerSystems\",\"GetReplicationRelationships\",\"GetServiceAccessPoints\",\"CreateGroup\",\"DeleteGroup\",\"AddMembers\",\"RemoveMembers\",\"AddReplicationEntity\",\"AddServiceAccessPoint\",\"AddSharedSecret\",\"CreateListReplica\",\"CreateGroupReplicaFromElements\",\"GetReplicationRelationshipInstances\",\"ModifyListSettingsDefineState\",\"CreateRemoteReplicationCollection\",\"AddToRemoteReplicationCollection\",\"RemoveFromRemoteReplicationCollection\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_FileSystemReplicationCapabilities.SupportedAsynchronousActions\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSynchronousActions();

	/**
	 * Returns the value of the '<em><b>Initial Replication State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InitialReplicationState specifies which initial ReplicationState is supported by a particular provider. Values are: 
	 * Initialized: The replication relationship is known and unsynchronized, but time required to synchronize may be long. 
	 * Prepared: The replication relationship is known and unsynchronized and the time required to synchronize will be short. 
	 * Synchronized: The replicas are synchronized.Idle: an UnSyncAssoc replica is ready to manage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Replication State</em>' attribute.
	 * @see #setInitialReplicationState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_InitialReplicationState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Initialized\",\"Prepared\",\"Synchronized\",\"Idle\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getInitialReplicationState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getInitialReplicationState <em>Initial Replication State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Replication State</em>' attribute.
	 * @see #getInitialReplicationState()
	 * @generated
	 */
	void setInitialReplicationState(Integer value);

	/**
	 * Returns the value of the '<em><b>Supported Operations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of Supported Operations. 
	 * Abort: Abort the copy operation if it is possible. Activate Consistency: Ensure all target elements of a group are consistent. 
	 * Activate: Activate an inactive or prepared source and target association. 
	 * AddSyncPair: Add elements associated via FileSystemSynchronized to source and target groups. 
	 * Deactivate Consistency: Disable consistency. 
	 * Deactivate: Deactivate a source and target association. The writes to the target are deleted in the case of a snapshot. 
	 * Detach: Remove the association between source and target. 
	 * Dissolve: Dissolve the synchronization between two storage objects, however, the target element continues to exist. 
	 * Failover: Switch to target element instead of source. 
	 * Failback: Reverses the effects of failover. 
	 * Fracture: Separate target element from source element. 
	 * RemoveSyncPair: Remove pair of source and target elements from the source/target groups. 
	 * Resync Replica: Synchronize a fractured/split source and target elements. 
	 * Restore from Replica: Copy data from a fractured target back to source. 
	 * Resume: Continue an association that was suspended. 
	 * Reset To Sync: Change mode to synchronous. 
	 * Reset To Async: Change mode to asynchronous. 
	 * Reverse Roles: Make target the source and source the target. 
	 * Return To ResourcePool: Applies to Snapshot -- delete the target element and its replication association. 
	 * Split: Similar to Fracture, however, the provider needs to make sure whether there are pending I/O in transit before fracturing the connection. 
	 * Suspend: Stop the copy operations to the target element. Continue when the operations is resumed. 
	 * Unprepare: Causes the synchronization to be reinitialized and stop in Prepared state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Operations</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_SupportedOperations()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Abort\",\"Activate Consistency\",\"Activate\",\"AddSyncPair\",\"Deactivate Consistency\",\"Deactivate\",\"Detach\",\"Dissolve\",\"Failover\",\"Failback\",\"Fracture\",\"RemoveSyncPair\",\"Resync Replica\",\"Restore from Replica\",\"Resume\",\"Reset To Sync\",\"Reset To Async\",\"Return To ResourcePool\",\"Reverse Roles\",\"Split\",\"Suspend\",\"Unprepare\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedOperations();

	/**
	 * Returns the value of the '<em><b>Replica Host Accessibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates host access restrictions for replicas with these capabilities. Values: 2 = not accessible. 
	 * 3 = no restrictions. Any host may access. 
	 * 4 = only accessible by associated source element hosts. 
	 * 5 = not accessible by source element hosts. Other hosts OK.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replica Host Accessibility</em>' attribute.
	 * @see #setReplicaHostAccessibility(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_ReplicaHostAccessibility()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\"]' Values='[\"Not Accessible\",\"No Restrictions\",\"Source Hosts Only\",\"Source Hosts Excluded\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Integer getReplicaHostAccessibility();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getReplicaHostAccessibility <em>Replica Host Accessibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replica Host Accessibility</em>' attribute.
	 * @see #getReplicaHostAccessibility()
	 * @generated
	 */
	void setReplicaHostAccessibility(Integer value);

	/**
	 * Returns the value of the '<em><b>Host Accessible State</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists the replica synchronization states in which the provider allows host access to replicas. Accessibility does not guarantee replica contents are valid or consistent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Accessible State</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_HostAccessibleState()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"..\",\"0x8000..\"]' Values='[\"Initialized\",\"Unsynchronized\",\"Synchronized\",\"Broken\",\"Fractured\",\"Split\",\"Inactive\",\"Suspended\",\"Failedover\",\"Prepared\",\"Aborted\",\"Skewed\",\"Mixed\",\"Not Applicable\",\"Partitioned\",\"Invalid\",\"Restored\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'"
	 * @generated
	 */
	EList<Integer> getHostAccessibleState();

	/**
	 * Returns the value of the '<em><b>Space Limit Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates space limits on allocation from StoragePools may be enforced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Space Limit Supported</em>' attribute.
	 * @see #setSpaceLimitSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_SpaceLimitSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_AllocatedFromStoragePool.SpaceLimit\"]'"
	 * @generated
	 */
	Boolean getSpaceLimitSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getSpaceLimitSupported <em>Space Limit Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Limit Supported</em>' attribute.
	 * @see #getSpaceLimitSupported()
	 * @generated
	 */
	void setSpaceLimitSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Space Reservation Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates space reserved for replicas can be from a specialized pool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Space Reservation Supported</em>' attribute.
	 * @see #setSpaceReservationSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_SpaceReservationSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSpaceReservationSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getSpaceReservationSupported <em>Space Reservation Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Reservation Supported</em>' attribute.
	 * @see #getSpaceReservationSupported()
	 * @generated
	 */
	void setSpaceReservationSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Local Mirror Snapshot Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates local mirror can be snapshot source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Mirror Snapshot Supported</em>' attribute.
	 * @see #setLocalMirrorSnapshotSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_LocalMirrorSnapshotSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getLocalMirrorSnapshotSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getLocalMirrorSnapshotSupported <em>Local Mirror Snapshot Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Mirror Snapshot Supported</em>' attribute.
	 * @see #getLocalMirrorSnapshotSupported()
	 * @generated
	 */
	void setLocalMirrorSnapshotSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Remote Mirror Snapshot Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates remote mirror can be snapshot source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Mirror Snapshot Supported</em>' attribute.
	 * @see #setRemoteMirrorSnapshotSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_RemoteMirrorSnapshotSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getRemoteMirrorSnapshotSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getRemoteMirrorSnapshotSupported <em>Remote Mirror Snapshot Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Mirror Snapshot Supported</em>' attribute.
	 * @see #getRemoteMirrorSnapshotSupported()
	 * @generated
	 */
	void setRemoteMirrorSnapshotSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Incremental Deltas Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates all delta replicas associated with the same source element can be incrementally dependent. Only the oldest replica in the set may be deleted or resynced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incremental Deltas Supported</em>' attribute.
	 * @see #setIncrementalDeltasSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_IncrementalDeltasSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIncrementalDeltasSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getIncrementalDeltasSupported <em>Incremental Deltas Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incremental Deltas Supported</em>' attribute.
	 * @see #getIncrementalDeltasSupported()
	 * @generated
	 */
	void setIncrementalDeltasSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Persistent Replicas Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates replicas can persist during power off or system reset. False indicates replicas lost during these events.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistent Replicas Supported</em>' attribute.
	 * @see #setPersistentReplicasSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_PersistentReplicasSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getPersistentReplicasSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getPersistentReplicasSupported <em>Persistent Replicas Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent Replicas Supported</em>' attribute.
	 * @see #getPersistentReplicasSupported()
	 * @generated
	 */
	void setPersistentReplicasSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Bidirectional Connections Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates peer-to-peer connections are bi-directional. False indicates connections are uni-directional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bidirectional Connections Supported</em>' attribute.
	 * @see #setBidirectionalConnectionsSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_BidirectionalConnectionsSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getBidirectionalConnectionsSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getBidirectionalConnectionsSupported <em>Bidirectional Connections Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bidirectional Connections Supported</em>' attribute.
	 * @see #getBidirectionalConnectionsSupported()
	 * @generated
	 */
	void setBidirectionalConnectionsSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Maximum Replicas Per Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of replicas that can be associated with one source element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Replicas Per Source</em>' attribute.
	 * @see #setMaximumReplicasPerSource(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_MaximumReplicasPerSource()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumReplicasPerSource();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getMaximumReplicasPerSource <em>Maximum Replicas Per Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Replicas Per Source</em>' attribute.
	 * @see #getMaximumReplicasPerSource()
	 * @generated
	 */
	void setMaximumReplicasPerSource(Integer value);

	/**
	 * Returns the value of the '<em><b>Maximum Ports Per Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of port pairs assigned to a peer-to-peer connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Ports Per Connection</em>' attribute.
	 * @see #setMaximumPortsPerConnection(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_MaximumPortsPerConnection()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumPortsPerConnection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getMaximumPortsPerConnection <em>Maximum Ports Per Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Ports Per Connection</em>' attribute.
	 * @see #getMaximumPortsPerConnection()
	 * @generated
	 */
	void setMaximumPortsPerConnection(Integer value);

	/**
	 * Returns the value of the '<em><b>Maximum Connections Per Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of peer-to-peer connections to which a port maybe assigned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Connections Per Port</em>' attribute.
	 * @see #setMaximumConnectionsPerPort(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_MaximumConnectionsPerPort()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumConnectionsPerPort();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getMaximumConnectionsPerPort <em>Maximum Connections Per Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Connections Per Port</em>' attribute.
	 * @see #getMaximumConnectionsPerPort()
	 * @generated
	 */
	void setMaximumConnectionsPerPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Maximum Peer Connections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of peer connections supported by this instance of StorageConfigurationService.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Peer Connections</em>' attribute.
	 * @see #setMaximumPeerConnections(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_MaximumPeerConnections()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumPeerConnections();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getMaximumPeerConnections <em>Maximum Peer Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Peer Connections</em>' attribute.
	 * @see #getMaximumPeerConnections()
	 * @generated
	 */
	void setMaximumPeerConnections(Integer value);

	/**
	 * Returns the value of the '<em><b>Maximum Local Replication Depth</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum local mirror replication depth allowed by this instance of ReplicationService. Value 1 indicates multi-level replication not supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Local Replication Depth</em>' attribute.
	 * @see #setMaximumLocalReplicationDepth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_MaximumLocalReplicationDepth()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumLocalReplicationDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getMaximumLocalReplicationDepth <em>Maximum Local Replication Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Local Replication Depth</em>' attribute.
	 * @see #getMaximumLocalReplicationDepth()
	 * @generated
	 */
	void setMaximumLocalReplicationDepth(Integer value);

	/**
	 * Returns the value of the '<em><b>Maximum Remote Replication Depth</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum remote mirror replication depth allowed by this instance of ReplicationService. Value N means that remote replicas can span N linked peer-to-peer connections. Value 1 indicates multi-level replication not supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Remote Replication Depth</em>' attribute.
	 * @see #setMaximumRemoteReplicationDepth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_MaximumRemoteReplicationDepth()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumRemoteReplicationDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getMaximumRemoteReplicationDepth <em>Maximum Remote Replication Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Remote Replication Depth</em>' attribute.
	 * @see #getMaximumRemoteReplicationDepth()
	 * @generated
	 */
	void setMaximumRemoteReplicationDepth(Integer value);

	/**
	 * Returns the value of the '<em><b>Replication Priority Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ReplicationPriority allows the priority of background Replication I/O to be managed relative to host I/O. Default applies to initial or deferred background Replication operations. Value can be modified while in Replication-in-progress state. Values Low Replication engine I/O lower priority than host I/O. Same Replication engine I/O has the same priority as host I/O. High Replication engine I/O has higher priority than host I/O.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replication Priority Default</em>' attribute.
	 * @see #setReplicationPriorityDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_ReplicationPriorityDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Not Managed\",\"Low\",\"Same\",\"High\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageSetting.ReplicationPriority\"]'"
	 * @generated
	 */
	Integer getReplicationPriorityDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getReplicationPriorityDefault <em>Replication Priority Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication Priority Default</em>' attribute.
	 * @see #getReplicationPriorityDefault()
	 * @generated
	 */
	void setReplicationPriorityDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>Low Space Warning Threshold Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Warning threshold for generating an indication for RemainingManagedSpace. Value of zero means no warning generated.Triggered when RemainingManagedSpace <= (TotalManagedSpace*LowSpaceWarningThreshold)/100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Low Space Warning Threshold Default</em>' attribute.
	 * @see #setLowSpaceWarningThresholdDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_LowSpaceWarningThresholdDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MinValue='0' MaxValue='100' ModelCorrespondence='[\"CIM_AllocatedFromStoragePool.SpaceLimitWarningThreshold\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getLowSpaceWarningThresholdDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getLowSpaceWarningThresholdDefault <em>Low Space Warning Threshold Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low Space Warning Threshold Default</em>' attribute.
	 * @see #getLowSpaceWarningThresholdDefault()
	 * @generated
	 */
	void setLowSpaceWarningThresholdDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>Space Limit Warning Threshold Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Warning threshold for instance modification indication for SpaceConsumed by a replica element. Value of zero means no warning generated. Triggered when SpaceConsumed >= (SpaceLimit*SpaceLimitWarningThreshold)/100.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Space Limit Warning Threshold Default</em>' attribute.
	 * @see #setSpaceLimitWarningThresholdDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_SpaceLimitWarningThresholdDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MinValue='0' MaxValue='100' ModelCorrespondence='[\"CIM_AllocatedFromStoragePool.SpaceLimitWarningThreshold\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getSpaceLimitWarningThresholdDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getSpaceLimitWarningThresholdDefault <em>Space Limit Warning Threshold Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Limit Warning Threshold Default</em>' attribute.
	 * @see #getSpaceLimitWarningThresholdDefault()
	 * @generated
	 */
	void setSpaceLimitWarningThresholdDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>Delta Replica Pool Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeltaReplicaPool indicates that a specialized pool is required as a container for delta replica elements. Values: Any: delta replicas can be created in any pool. Exclusive: one specialized, exclusive pool must be created for each source element that has associated delta replicas. Shared: one specialized, shared pool must be created to be shared by all source elements with associated delta replicas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Replica Pool Access</em>' attribute.
	 * @see #setDeltaReplicaPoolAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemReplicationCapabilities_DeltaReplicaPoolAccess()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Any\",\"Exclusive\",\"Shared\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getDeltaReplicaPoolAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemReplicationCapabilities#getDeltaReplicaPoolAccess <em>Delta Replica Pool Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Replica Pool Access</em>' attribute.
	 * @see #getDeltaReplicaPoolAccess()
	 * @generated
	 */
	void setDeltaReplicaPoolAccess(Integer value);

} // CIM_FileSystemReplicationCapabilities

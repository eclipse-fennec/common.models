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
 * A representation of the model object '<em><b>CIM Storage Replication Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This subclass defines the replication capabilities of a StorageConfigurationService. Multiple instances of StorageReplicationCapabilities may be associated with a StorageConfigurationService using ElementCapabilities. A provider should create one instance for each supported SynchronizationType.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getSupportedSynchronizationType <em>Supported Synchronization Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getInitialReplicationState <em>Initial Replication State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getSupportedSpecializedElements <em>Supported Specialized Elements</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getSupportedModifyOperations <em>Supported Modify Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getReplicaHostAccessibility <em>Replica Host Accessibility</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getHostAccessibleState <em>Host Accessible State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getSpaceLimitSupported <em>Space Limit Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getSpaceReservationSupported <em>Space Reservation Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getLocalMirrorSnapshotSupported <em>Local Mirror Snapshot Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getRemoteMirrorSnapshotSupported <em>Remote Mirror Snapshot Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getIncrementalDeltasSupported <em>Incremental Deltas Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getPersistentReplicasSupported <em>Persistent Replicas Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getBidirectionalConnectionsSupported <em>Bidirectional Connections Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getMaximumReplicasPerSource <em>Maximum Replicas Per Source</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getMaximumPortsPerConnection <em>Maximum Ports Per Connection</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getMaximumConnectionsPerPort <em>Maximum Connections Per Port</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getMaximumPeerConnections <em>Maximum Peer Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getMaximumLocalReplicationDepth <em>Maximum Local Replication Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getMaximumRemoteReplicationDepth <em>Maximum Remote Replication Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getInitialSynchronizationDefault <em>Initial Synchronization Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getReplicationPriorityDefault <em>Replication Priority Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getLowSpaceWarningThresholdDefault <em>Low Space Warning Threshold Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getSpaceLimitWarningThresholdDefault <em>Space Limit Warning Threshold Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getRemoteReplicationServicePointAccess <em>Remote Replication Service Point Access</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getAlternateReplicationServicePointAccess <em>Alternate Replication Service Point Access</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getDeltaReplicaPoolAccess <em>Delta Replica Pool Access</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getRemoteBufferElementType <em>Remote Buffer Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getRemoteBufferHost <em>Remote Buffer Host</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getRemoteBufferLocation <em>Remote Buffer Location</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getRemoteBufferSupported <em>Remote Buffer Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getUseReplicationBufferDefault <em>Use Replication Buffer Default</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getPeerConnectionProtocol <em>Peer Connection Protocol</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageReplicationCapabilities extends CIM_Capabilities {
	/**
	 * Returns the value of the '<em><b>Supported Synchronization Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupportedSynchronizationType describes the type of Synchronization that is characterized by this instance of StorageReplicationCapabilities. Values are:
	 * Async: create a mirror that is nearly always synchronized. Sync: create a mirror that is always synchronized.
	 * UnSyncAssocFull: create a full size snapshot (Point In Time image).
	 * UnSyncAssocDelta: create a delta snapshot (Point In Time image).
	 * UnSyncUnAssoc: create a full size, independent replica.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronization Type</em>' attribute.
	 * @see #setSupportedSynchronizationType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_SupportedSynchronizationType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"..\",\"32768..65535\"]' Values='[\"Async\",\"Sync\",\"UnSyncAssoc-Full\",\"UnSyncAssoc-Delta\",\"UnSyncUnAssoc\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getSupportedSynchronizationType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getSupportedSynchronizationType <em>Supported Synchronization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Synchronization Type</em>' attribute.
	 * @see #getSupportedSynchronizationType()
	 * @generated
	 */
	void setSupportedSynchronizationType(Integer value);

	/**
	 * Returns the value of the '<em><b>Supported Asynchronous Actions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating what operations will be executed as asynchronous jobs. If an operation is included in both this and SupportedSynchronousActions then the underlying implementation is indicating that it may or may not create a job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Asynchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_SupportedAsynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\"]' Values='[\"Local Replica Creation\",\"Remote Replica Creation\",\"Local Replica Modification\",\"Remote Replica Modification\",\"Local Replica Attachment\",\"Remote Replica Attachment\",\"Buffer Creation\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_StorageReplicationCapabilities.SupportedSynchronousActions\"]'"
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
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Synchronous Actions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_SupportedSynchronousActions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\"]' Values='[\"Local Replica Creation\",\"Remote Replica Creation\",\"Local Replica Modification\",\"Remote Replica Modification\",\"Local Replica Attachment\",\"Remote Replica Attachment\",\"Buffer Creation\",\"NetworkPipe Creation\",\"DMTF Reserved\"]' ModelCorrespondence='[\"CIM_StorageReplicationCapabilities.SupportedAsynchronousActions\"]'"
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_InitialReplicationState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Initialized\",\"Prepared\",\"Synchronized\",\"Idle\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageConfigurationService.AttachReplica\",\"CIM_StorageConfigurationService.AttachOrModifyReplica\",\"CIM_StorageConfigurationService.CreateReplica\"]'"
	 * @generated
	 */
	Integer getInitialReplicationState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getInitialReplicationState <em>Initial Replication State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Replication State</em>' attribute.
	 * @see #getInitialReplicationState()
	 * @generated
	 */
	void setInitialReplicationState(Integer value);

	/**
	 * Returns the value of the '<em><b>Supported Specialized Elements</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating which specialized storage element types are supported by this instance of StorageReplicationCapabilities. Specialized types are indicated by the value of the IntendedUsage in StorageSetting.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Specialized Elements</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_SupportedSpecializedElements()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Delta Pool\",\"Delta Pool Component\",\"Remote Mirror\",\"Local Mirror\",\"Full Snapshot\",\"Delta Snapshot\",\"Replication Buffer\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedSpecializedElements();

	/**
	 * Returns the value of the '<em><b>Supported Modify Operations</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating which ModifySynchronization operations are supported by this instance of StorageReplicationCapabilities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported Modify Operations</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_SupportedModifyOperations()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"..\",\"0x8000..0xFFFF\"]' Values='[\"Detach\",\"Fracture\",\"Resync\",\"Restore\",\"Prepare\",\"Unprepare\",\"Quiesce\",\"Unquiesce\",\"Reset To Sync\",\"Reset To Async\",\"Start Copy\",\"Stop Copy\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageConfigurationService.ModifySynchronization\"]'"
	 * @generated
	 */
	EList<Integer> getSupportedModifyOperations();

	/**
	 * Returns the value of the '<em><b>Replica Host Accessibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates host access restrictions for replicas with thesecapabilities. Values: 2 = not accessible. 
	 * 3 = no restrictions. Any host may access. 4 = only accessible by associated source element hosts. 5 = not accessible by source element hosts. Other hosts OK.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replica Host Accessibility</em>' attribute.
	 * @see #setReplicaHostAccessibility(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_ReplicaHostAccessibility()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\"]' Values='[\"Not Accessible\",\"No Restrictions\",\"Source Hosts Only\",\"Source Hosts Excluded\",\"DMTF Reserved\"]'"
	 * @generated
	 */
	Integer getReplicaHostAccessibility();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getReplicaHostAccessibility <em>Replica Host Accessibility</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_HostAccessibleState()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"..\",\"0x8000..\"]' Values='[\"Initialized\",\"Prepare In Progress\",\"Prepared\",\"Resync In Progress\",\"Synchronized\",\"Fracture In Progress\",\"Quiesce In Progress\",\"Quiesced\",\"Restore In Progress\",\"Idle\",\"Broken\",\"Fractured\",\"Frozen\",\"Copy In Progress\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageSynchronized.SyncState\"]'"
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_SpaceLimitSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' ModelCorrespondence='[\"CIM_AllocatedFromStoragePool.SpaceLimit\"]'"
	 * @generated
	 */
	Boolean getSpaceLimitSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getSpaceLimitSupported <em>Space Limit Supported</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_SpaceReservationSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSpaceReservationSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getSpaceReservationSupported <em>Space Reservation Supported</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_LocalMirrorSnapshotSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getLocalMirrorSnapshotSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getLocalMirrorSnapshotSupported <em>Local Mirror Snapshot Supported</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_RemoteMirrorSnapshotSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getRemoteMirrorSnapshotSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getRemoteMirrorSnapshotSupported <em>Remote Mirror Snapshot Supported</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_IncrementalDeltasSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIncrementalDeltasSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getIncrementalDeltasSupported <em>Incremental Deltas Supported</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_PersistentReplicasSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getPersistentReplicasSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getPersistentReplicasSupported <em>Persistent Replicas Supported</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_BidirectionalConnectionsSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getBidirectionalConnectionsSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getBidirectionalConnectionsSupported <em>Bidirectional Connections Supported</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_MaximumReplicasPerSource()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumReplicasPerSource();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getMaximumReplicasPerSource <em>Maximum Replicas Per Source</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_MaximumPortsPerConnection()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumPortsPerConnection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getMaximumPortsPerConnection <em>Maximum Ports Per Connection</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_MaximumConnectionsPerPort()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumConnectionsPerPort();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getMaximumConnectionsPerPort <em>Maximum Connections Per Port</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_MaximumPeerConnections()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumPeerConnections();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getMaximumPeerConnections <em>Maximum Peer Connections</em>}' attribute.
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
	 * Maximum local mirror replication depth allowed by this instance of StorageConfigurationService. Value 1 indicates multi-level replication not supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Local Replication Depth</em>' attribute.
	 * @see #setMaximumLocalReplicationDepth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_MaximumLocalReplicationDepth()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumLocalReplicationDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getMaximumLocalReplicationDepth <em>Maximum Local Replication Depth</em>}' attribute.
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
	 * Maximum remote mirror replication depth allowed by this instance of StorageConfigurationService. Value N means that remote replicas can span N linked peer-to-peer connections. Value 1 indicates multi-level replication not supported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Remote Replication Depth</em>' attribute.
	 * @see #setMaximumRemoteReplicationDepth(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_MaximumRemoteReplicationDepth()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getMaximumRemoteReplicationDepth();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getMaximumRemoteReplicationDepth <em>Maximum Remote Replication Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Remote Replication Depth</em>' attribute.
	 * @see #getMaximumRemoteReplicationDepth()
	 * @generated
	 */
	void setMaximumRemoteReplicationDepth(Integer value);

	/**
	 * Returns the value of the '<em><b>Initial Synchronization Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start or do not start background copy when replica is created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Synchronization Default</em>' attribute.
	 * @see #setInitialSynchronizationDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_InitialSynchronizationDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"0x8000..\"]' Values='[\"Not Managed\",\"Start\",\"Do Not Start\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageSetting.InitialSynchronization\"]'"
	 * @generated
	 */
	Integer getInitialSynchronizationDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getInitialSynchronizationDefault <em>Initial Synchronization Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Synchronization Default</em>' attribute.
	 * @see #getInitialSynchronizationDefault()
	 * @generated
	 */
	void setInitialSynchronizationDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>Replication Priority Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ReplicationPriority allows the priority of background Replication I/O to be managed relative to host I/O. Default applies to initial or deferred background Replication operations. Value can be modified while in Replication-in-progress state. Values: Low: Replication engine I/O lower priority than host I/O. 
	 * Same: Replication engine I/O has the same priority as host I/O. 
	 * High: Replication engine I/O has higher priority than host I/O.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replication Priority Default</em>' attribute.
	 * @see #setReplicationPriorityDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_ReplicationPriorityDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Not Managed\",\"Low\",\"Same\",\"High\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageSetting.ReplicationPriority\"]'"
	 * @generated
	 */
	Integer getReplicationPriorityDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getReplicationPriorityDefault <em>Replication Priority Default</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_LowSpaceWarningThresholdDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Units='Percentage' MinValue='0' MaxValue='100' ModelCorrespondence='[\"CIM_StoragePool.LowSpaceWarningThreshold\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getLowSpaceWarningThresholdDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getLowSpaceWarningThresholdDefault <em>Low Space Warning Threshold Default</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_SpaceLimitWarningThresholdDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Units='Percentage' MinValue='0' MaxValue='100' ModelCorrespondence='[\"CIM_AllocatedFromStoragePool.SpaceLimitWarningThreshold\"]' PUnit='percent'"
	 * @generated
	 */
	Integer getSpaceLimitWarningThresholdDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getSpaceLimitWarningThresholdDefault <em>Space Limit Warning Threshold Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space Limit Warning Threshold Default</em>' attribute.
	 * @see #getSpaceLimitWarningThresholdDefault()
	 * @generated
	 */
	void setSpaceLimitWarningThresholdDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>Remote Replication Service Point Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Remote replication provides StorageConfigurationService instances for source systems and target systems. A client determines that extrinsic methods of the service should be invoked to one instance or the other based on the value of this property. Values: Not Specified: invoke a method to either system instance. Source: invoke to source element service instance. Target: invoke to target element service instance. Proxy: find and invoke to proxy service instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Replication Service Point Access</em>' attribute.
	 * @see #setRemoteReplicationServicePointAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_RemoteReplicationServicePointAccess()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Not Specified\",\"Source\",\"Target\",\"Proxy\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getRemoteReplicationServicePointAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getRemoteReplicationServicePointAccess <em>Remote Replication Service Point Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Replication Service Point Access</em>' attribute.
	 * @see #getRemoteReplicationServicePointAccess()
	 * @generated
	 */
	void setRemoteReplicationServicePointAccess(Integer value);

	/**
	 * Returns the value of the '<em><b>Alternate Replication Service Point Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Remote replication provides StorageConfigurationService instances for source systems and target systems. A client determines that extrinsic methods of the service should be invoked to one instance or the other based on the value of this property. If the primary instance is unavailable, the provider may indicate an alternate instance. Values: None: no alternate exists. Source: invoke to source element service instance. Target: invoke to target element service instance. Proxy: find and invoke alternate proxy service instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternate Replication Service Point Access</em>' attribute.
	 * @see #setAlternateReplicationServicePointAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_AlternateReplicationServicePointAccess()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"None\",\"Source\",\"Target\",\"Proxy\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getAlternateReplicationServicePointAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getAlternateReplicationServicePointAccess <em>Alternate Replication Service Point Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternate Replication Service Point Access</em>' attribute.
	 * @see #getAlternateReplicationServicePointAccess()
	 * @generated
	 */
	void setAlternateReplicationServicePointAccess(Integer value);

	/**
	 * Returns the value of the '<em><b>Delta Replica Pool Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeltaReplicaPool indicates that a specialized pool is required as a container for delta replica elements. Values: Any: delta replicas can be created in any pool. Exclusive: one specialized, exclusive pool must be created for each source element that has associated delta replicas. Shared: one specialized, shared pool must be created to be shared by all source elements with associated delta replicas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Replica Pool Access</em>' attribute.
	 * @see #setDeltaReplicaPoolAccess(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_DeltaReplicaPoolAccess()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Any\",\"Exclusive\",\"Shared\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getDeltaReplicaPoolAccess();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getDeltaReplicaPoolAccess <em>Delta Replica Pool Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Replica Pool Access</em>' attribute.
	 * @see #getDeltaReplicaPoolAccess()
	 * @generated
	 */
	void setDeltaReplicaPoolAccess(Integer value);

	/**
	 * Returns the value of the '<em><b>Remote Buffer Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Remote replication buffer elements are instances of CIM_Memory. A buffer element may be created from a component extent with a BasedOn association or in a storage pool with an AllocatedFromStoragePool association. The provider can also make the size and element type opaque to a client. Values: 
	 * Not specified: client allows provider to determine size and container element type. 
	 * InExtent: buffer must be created from passed component extent. 
	 * InPool: buffer must be created in passed pool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Buffer Element Type</em>' attribute.
	 * @see #setRemoteBufferElementType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_RemoteBufferElementType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Not specified\",\"InExtent\",\"InPool\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getRemoteBufferElementType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getRemoteBufferElementType <em>Remote Buffer Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Buffer Element Type</em>' attribute.
	 * @see #getRemoteBufferElementType()
	 * @generated
	 */
	void setRemoteBufferElementType(Integer value);

	/**
	 * Returns the value of the '<em><b>Remote Buffer Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Array provider may require multiple buffer elements per array instance as indicated by this property. Values: 
	 * Array: one buffer element for the entire array. 
	 * ComponentCS: one buffer element per ComputerSystem element in a clustered array. 
	 * Pipe: one or two buffer elements per replication pipe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Buffer Host</em>' attribute.
	 * @see #setRemoteBufferHost(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_RemoteBufferHost()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Array\",\"ComponentCS\",\"Pipe\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getRemoteBufferHost();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getRemoteBufferHost <em>Remote Buffer Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Buffer Host</em>' attribute.
	 * @see #getRemoteBufferHost()
	 * @generated
	 */
	void setRemoteBufferHost(Integer value);

	/**
	 * Returns the value of the '<em><b>Remote Buffer Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property allows the provider to indicate the required location for remote buffer elements. Values: 
	 * Source: buffer needed only on platforms hosting source elements. 
	 * Target: buffer needed only on platforms hosting target elements. 
	 * Both: buffers needed for both source and target platforms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Buffer Location</em>' attribute.
	 * @see #setRemoteBufferLocation(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_RemoteBufferLocation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Source\",\"Target\",\"Both\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getRemoteBufferLocation();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getRemoteBufferLocation <em>Remote Buffer Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Buffer Location</em>' attribute.
	 * @see #getRemoteBufferLocation()
	 * @generated
	 */
	void setRemoteBufferLocation(Integer value);

	/**
	 * Returns the value of the '<em><b>Remote Buffer Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Peer may require a write buffer for remote replica elements with async I/O buffering. Typically used to increase remote mirror replication engine performance while maintaining high availability. Values: 
	 * Required: must have buffer if any Async remote replicas are created. 
	 * Optional: may have buffer if any Async remote replicas are created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Buffer Supported</em>' attribute.
	 * @see #setRemoteBufferSupported(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_RemoteBufferSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Not Supported\",\"Required\",\"Optional\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getRemoteBufferSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getRemoteBufferSupported <em>Remote Buffer Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Buffer Supported</em>' attribute.
	 * @see #getRemoteBufferSupported()
	 * @generated
	 */
	void setRemoteBufferSupported(Integer value);

	/**
	 * Returns the value of the '<em><b>Use Replication Buffer Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicate if an async remote replica pair is allowed to use a write buffer for asynchronous write buffering. - Not Managed: use or not of the buffer is up to the implementation. - Use Buffer: use of a buffer is required. - Do Not Use Buffer: a buffer shall not be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Replication Buffer Default</em>' attribute.
	 * @see #setUseReplicationBufferDefault(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_UseReplicationBufferDefault()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"..\",\"0x8000..\"]' Values='[\"Not Managed\",\"Use Buffer\",\"Do Not Use Buffer\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageSetting.UseReplicationBuffer\"]'"
	 * @generated
	 */
	Integer getUseReplicationBufferDefault();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getUseReplicationBufferDefault <em>Use Replication Buffer Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Replication Buffer Default</em>' attribute.
	 * @see #getUseReplicationBufferDefault()
	 * @generated
	 */
	void setUseReplicationBufferDefault(Integer value);

	/**
	 * Returns the value of the '<em><b>Peer Connection Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Peer connection protocol is a private, vendor-specific protocol for replication data transport. A client verifies that two peers support the same protocol before establishing a peer-to-peer connection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Peer Connection Protocol</em>' attribute.
	 * @see #setPeerConnectionProtocol(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageReplicationCapabilities_PeerConnectionProtocol()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPeerConnectionProtocol();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageReplicationCapabilities#getPeerConnectionProtocol <em>Peer Connection Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peer Connection Protocol</em>' attribute.
	 * @see #getPeerConnectionProtocol()
	 * @generated
	 */
	void setPeerConnectionProtocol(String value);

} // CIM_StorageReplicationCapabilities

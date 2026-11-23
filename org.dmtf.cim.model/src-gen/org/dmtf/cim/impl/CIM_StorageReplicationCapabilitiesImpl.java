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
package org.dmtf.cim.impl;

import java.util.Collection;

import org.dmtf.cim.CIM_StorageReplicationCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Replication Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getSupportedSynchronizationType <em>Supported Synchronization Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getInitialReplicationState <em>Initial Replication State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getSupportedSpecializedElements <em>Supported Specialized Elements</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getSupportedModifyOperations <em>Supported Modify Operations</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getReplicaHostAccessibility <em>Replica Host Accessibility</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getHostAccessibleState <em>Host Accessible State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getSpaceLimitSupported <em>Space Limit Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getSpaceReservationSupported <em>Space Reservation Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getLocalMirrorSnapshotSupported <em>Local Mirror Snapshot Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getRemoteMirrorSnapshotSupported <em>Remote Mirror Snapshot Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getIncrementalDeltasSupported <em>Incremental Deltas Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getPersistentReplicasSupported <em>Persistent Replicas Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getBidirectionalConnectionsSupported <em>Bidirectional Connections Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getMaximumReplicasPerSource <em>Maximum Replicas Per Source</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getMaximumPortsPerConnection <em>Maximum Ports Per Connection</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getMaximumConnectionsPerPort <em>Maximum Connections Per Port</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getMaximumPeerConnections <em>Maximum Peer Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getMaximumLocalReplicationDepth <em>Maximum Local Replication Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getMaximumRemoteReplicationDepth <em>Maximum Remote Replication Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getInitialSynchronizationDefault <em>Initial Synchronization Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getReplicationPriorityDefault <em>Replication Priority Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getLowSpaceWarningThresholdDefault <em>Low Space Warning Threshold Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getSpaceLimitWarningThresholdDefault <em>Space Limit Warning Threshold Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getRemoteReplicationServicePointAccess <em>Remote Replication Service Point Access</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getAlternateReplicationServicePointAccess <em>Alternate Replication Service Point Access</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getDeltaReplicaPoolAccess <em>Delta Replica Pool Access</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getRemoteBufferElementType <em>Remote Buffer Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getRemoteBufferHost <em>Remote Buffer Host</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getRemoteBufferLocation <em>Remote Buffer Location</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getRemoteBufferSupported <em>Remote Buffer Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getUseReplicationBufferDefault <em>Use Replication Buffer Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageReplicationCapabilitiesImpl#getPeerConnectionProtocol <em>Peer Connection Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageReplicationCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_StorageReplicationCapabilities {
	/**
	 * The default value of the '{@link #getSupportedSynchronizationType() <em>Supported Synchronization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSynchronizationType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SUPPORTED_SYNCHRONIZATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportedSynchronizationType() <em>Supported Synchronization Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSynchronizationType()
	 * @generated
	 * @ordered
	 */
	protected Integer supportedSynchronizationType = SUPPORTED_SYNCHRONIZATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedAsynchronousActions() <em>Supported Asynchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAsynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAsynchronousActions;

	/**
	 * The cached value of the '{@link #getSupportedSynchronousActions() <em>Supported Synchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSynchronousActions;

	/**
	 * The default value of the '{@link #getInitialReplicationState() <em>Initial Replication State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialReplicationState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INITIAL_REPLICATION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialReplicationState() <em>Initial Replication State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialReplicationState()
	 * @generated
	 * @ordered
	 */
	protected Integer initialReplicationState = INITIAL_REPLICATION_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSupportedSpecializedElements() <em>Supported Specialized Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSpecializedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSpecializedElements;

	/**
	 * The cached value of the '{@link #getSupportedModifyOperations() <em>Supported Modify Operations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedModifyOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedModifyOperations;

	/**
	 * The default value of the '{@link #getReplicaHostAccessibility() <em>Replica Host Accessibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicaHostAccessibility()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REPLICA_HOST_ACCESSIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplicaHostAccessibility() <em>Replica Host Accessibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicaHostAccessibility()
	 * @generated
	 * @ordered
	 */
	protected Integer replicaHostAccessibility = REPLICA_HOST_ACCESSIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHostAccessibleState() <em>Host Accessible State</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostAccessibleState()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> hostAccessibleState;

	/**
	 * The default value of the '{@link #getSpaceLimitSupported() <em>Space Limit Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimitSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SPACE_LIMIT_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpaceLimitSupported() <em>Space Limit Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimitSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean spaceLimitSupported = SPACE_LIMIT_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceReservationSupported() <em>Space Reservation Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceReservationSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SPACE_RESERVATION_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpaceReservationSupported() <em>Space Reservation Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceReservationSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean spaceReservationSupported = SPACE_RESERVATION_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalMirrorSnapshotSupported() <em>Local Mirror Snapshot Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalMirrorSnapshotSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LOCAL_MIRROR_SNAPSHOT_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalMirrorSnapshotSupported() <em>Local Mirror Snapshot Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalMirrorSnapshotSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean localMirrorSnapshotSupported = LOCAL_MIRROR_SNAPSHOT_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteMirrorSnapshotSupported() <em>Remote Mirror Snapshot Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteMirrorSnapshotSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REMOTE_MIRROR_SNAPSHOT_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteMirrorSnapshotSupported() <em>Remote Mirror Snapshot Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteMirrorSnapshotSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean remoteMirrorSnapshotSupported = REMOTE_MIRROR_SNAPSHOT_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrementalDeltasSupported() <em>Incremental Deltas Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalDeltasSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCREMENTAL_DELTAS_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncrementalDeltasSupported() <em>Incremental Deltas Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalDeltasSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean incrementalDeltasSupported = INCREMENTAL_DELTAS_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistentReplicasSupported() <em>Persistent Replicas Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentReplicasSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PERSISTENT_REPLICAS_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistentReplicasSupported() <em>Persistent Replicas Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentReplicasSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean persistentReplicasSupported = PERSISTENT_REPLICAS_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBidirectionalConnectionsSupported() <em>Bidirectional Connections Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidirectionalConnectionsSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BIDIRECTIONAL_CONNECTIONS_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBidirectionalConnectionsSupported() <em>Bidirectional Connections Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidirectionalConnectionsSupported()
	 * @generated
	 * @ordered
	 */
	protected Boolean bidirectionalConnectionsSupported = BIDIRECTIONAL_CONNECTIONS_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumReplicasPerSource() <em>Maximum Replicas Per Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumReplicasPerSource()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_REPLICAS_PER_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumReplicasPerSource() <em>Maximum Replicas Per Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumReplicasPerSource()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumReplicasPerSource = MAXIMUM_REPLICAS_PER_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumPortsPerConnection() <em>Maximum Ports Per Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPortsPerConnection()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_PORTS_PER_CONNECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumPortsPerConnection() <em>Maximum Ports Per Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPortsPerConnection()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumPortsPerConnection = MAXIMUM_PORTS_PER_CONNECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumConnectionsPerPort() <em>Maximum Connections Per Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumConnectionsPerPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_CONNECTIONS_PER_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumConnectionsPerPort() <em>Maximum Connections Per Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumConnectionsPerPort()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumConnectionsPerPort = MAXIMUM_CONNECTIONS_PER_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumPeerConnections() <em>Maximum Peer Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPeerConnections()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_PEER_CONNECTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumPeerConnections() <em>Maximum Peer Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPeerConnections()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumPeerConnections = MAXIMUM_PEER_CONNECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumLocalReplicationDepth() <em>Maximum Local Replication Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumLocalReplicationDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_LOCAL_REPLICATION_DEPTH_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getMaximumLocalReplicationDepth() <em>Maximum Local Replication Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumLocalReplicationDepth()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumLocalReplicationDepth = MAXIMUM_LOCAL_REPLICATION_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumRemoteReplicationDepth() <em>Maximum Remote Replication Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRemoteReplicationDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_REMOTE_REPLICATION_DEPTH_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getMaximumRemoteReplicationDepth() <em>Maximum Remote Replication Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRemoteReplicationDepth()
	 * @generated
	 * @ordered
	 */
	protected Integer maximumRemoteReplicationDepth = MAXIMUM_REMOTE_REPLICATION_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialSynchronizationDefault() <em>Initial Synchronization Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialSynchronizationDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INITIAL_SYNCHRONIZATION_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialSynchronizationDefault() <em>Initial Synchronization Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialSynchronizationDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer initialSynchronizationDefault = INITIAL_SYNCHRONIZATION_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplicationPriorityDefault() <em>Replication Priority Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationPriorityDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REPLICATION_PRIORITY_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplicationPriorityDefault() <em>Replication Priority Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationPriorityDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer replicationPriorityDefault = REPLICATION_PRIORITY_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowSpaceWarningThresholdDefault() <em>Low Space Warning Threshold Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowSpaceWarningThresholdDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOW_SPACE_WARNING_THRESHOLD_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowSpaceWarningThresholdDefault() <em>Low Space Warning Threshold Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowSpaceWarningThresholdDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer lowSpaceWarningThresholdDefault = LOW_SPACE_WARNING_THRESHOLD_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceLimitWarningThresholdDefault() <em>Space Limit Warning Threshold Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimitWarningThresholdDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SPACE_LIMIT_WARNING_THRESHOLD_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpaceLimitWarningThresholdDefault() <em>Space Limit Warning Threshold Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimitWarningThresholdDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer spaceLimitWarningThresholdDefault = SPACE_LIMIT_WARNING_THRESHOLD_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteReplicationServicePointAccess() <em>Remote Replication Service Point Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteReplicationServicePointAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REMOTE_REPLICATION_SERVICE_POINT_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteReplicationServicePointAccess() <em>Remote Replication Service Point Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteReplicationServicePointAccess()
	 * @generated
	 * @ordered
	 */
	protected Integer remoteReplicationServicePointAccess = REMOTE_REPLICATION_SERVICE_POINT_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlternateReplicationServicePointAccess() <em>Alternate Replication Service Point Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateReplicationServicePointAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALTERNATE_REPLICATION_SERVICE_POINT_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternateReplicationServicePointAccess() <em>Alternate Replication Service Point Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateReplicationServicePointAccess()
	 * @generated
	 * @ordered
	 */
	protected Integer alternateReplicationServicePointAccess = ALTERNATE_REPLICATION_SERVICE_POINT_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeltaReplicaPoolAccess() <em>Delta Replica Pool Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaReplicaPoolAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DELTA_REPLICA_POOL_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaReplicaPoolAccess() <em>Delta Replica Pool Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaReplicaPoolAccess()
	 * @generated
	 * @ordered
	 */
	protected Integer deltaReplicaPoolAccess = DELTA_REPLICA_POOL_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteBufferElementType() <em>Remote Buffer Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteBufferElementType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REMOTE_BUFFER_ELEMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteBufferElementType() <em>Remote Buffer Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteBufferElementType()
	 * @generated
	 * @ordered
	 */
	protected Integer remoteBufferElementType = REMOTE_BUFFER_ELEMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteBufferHost() <em>Remote Buffer Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteBufferHost()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REMOTE_BUFFER_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteBufferHost() <em>Remote Buffer Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteBufferHost()
	 * @generated
	 * @ordered
	 */
	protected Integer remoteBufferHost = REMOTE_BUFFER_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteBufferLocation() <em>Remote Buffer Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteBufferLocation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REMOTE_BUFFER_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteBufferLocation() <em>Remote Buffer Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteBufferLocation()
	 * @generated
	 * @ordered
	 */
	protected Integer remoteBufferLocation = REMOTE_BUFFER_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteBufferSupported() <em>Remote Buffer Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteBufferSupported()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REMOTE_BUFFER_SUPPORTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoteBufferSupported() <em>Remote Buffer Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteBufferSupported()
	 * @generated
	 * @ordered
	 */
	protected Integer remoteBufferSupported = REMOTE_BUFFER_SUPPORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseReplicationBufferDefault() <em>Use Replication Buffer Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseReplicationBufferDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USE_REPLICATION_BUFFER_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseReplicationBufferDefault() <em>Use Replication Buffer Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseReplicationBufferDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer useReplicationBufferDefault = USE_REPLICATION_BUFFER_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeerConnectionProtocol() <em>Peer Connection Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeerConnectionProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PEER_CONNECTION_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeerConnectionProtocol() <em>Peer Connection Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeerConnectionProtocol()
	 * @generated
	 * @ordered
	 */
	protected String peerConnectionProtocol = PEER_CONNECTION_PROTOCOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageReplicationCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageReplicationCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSupportedSynchronizationType() {
		return supportedSynchronizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportedSynchronizationType(Integer newSupportedSynchronizationType) {
		Integer oldSupportedSynchronizationType = supportedSynchronizationType;
		supportedSynchronizationType = newSupportedSynchronizationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_SYNCHRONIZATION_TYPE, oldSupportedSynchronizationType, supportedSynchronizationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAsynchronousActions() {
		if (supportedAsynchronousActions == null) {
			supportedAsynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS);
		}
		return supportedAsynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSynchronousActions() {
		if (supportedSynchronousActions == null) {
			supportedSynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS);
		}
		return supportedSynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInitialReplicationState() {
		return initialReplicationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialReplicationState(Integer newInitialReplicationState) {
		Integer oldInitialReplicationState = initialReplicationState;
		initialReplicationState = newInitialReplicationState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__INITIAL_REPLICATION_STATE, oldInitialReplicationState, initialReplicationState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSpecializedElements() {
		if (supportedSpecializedElements == null) {
			supportedSpecializedElements = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_SPECIALIZED_ELEMENTS);
		}
		return supportedSpecializedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedModifyOperations() {
		if (supportedModifyOperations == null) {
			supportedModifyOperations = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_MODIFY_OPERATIONS);
		}
		return supportedModifyOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getReplicaHostAccessibility() {
		return replicaHostAccessibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplicaHostAccessibility(Integer newReplicaHostAccessibility) {
		Integer oldReplicaHostAccessibility = replicaHostAccessibility;
		replicaHostAccessibility = newReplicaHostAccessibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REPLICA_HOST_ACCESSIBILITY, oldReplicaHostAccessibility, replicaHostAccessibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getHostAccessibleState() {
		if (hostAccessibleState == null) {
			hostAccessibleState = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__HOST_ACCESSIBLE_STATE);
		}
		return hostAccessibleState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSpaceLimitSupported() {
		return spaceLimitSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaceLimitSupported(Boolean newSpaceLimitSupported) {
		Boolean oldSpaceLimitSupported = spaceLimitSupported;
		spaceLimitSupported = newSpaceLimitSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SPACE_LIMIT_SUPPORTED, oldSpaceLimitSupported, spaceLimitSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSpaceReservationSupported() {
		return spaceReservationSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaceReservationSupported(Boolean newSpaceReservationSupported) {
		Boolean oldSpaceReservationSupported = spaceReservationSupported;
		spaceReservationSupported = newSpaceReservationSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SPACE_RESERVATION_SUPPORTED, oldSpaceReservationSupported, spaceReservationSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLocalMirrorSnapshotSupported() {
		return localMirrorSnapshotSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalMirrorSnapshotSupported(Boolean newLocalMirrorSnapshotSupported) {
		Boolean oldLocalMirrorSnapshotSupported = localMirrorSnapshotSupported;
		localMirrorSnapshotSupported = newLocalMirrorSnapshotSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__LOCAL_MIRROR_SNAPSHOT_SUPPORTED, oldLocalMirrorSnapshotSupported, localMirrorSnapshotSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRemoteMirrorSnapshotSupported() {
		return remoteMirrorSnapshotSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteMirrorSnapshotSupported(Boolean newRemoteMirrorSnapshotSupported) {
		Boolean oldRemoteMirrorSnapshotSupported = remoteMirrorSnapshotSupported;
		remoteMirrorSnapshotSupported = newRemoteMirrorSnapshotSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_MIRROR_SNAPSHOT_SUPPORTED, oldRemoteMirrorSnapshotSupported, remoteMirrorSnapshotSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncrementalDeltasSupported() {
		return incrementalDeltasSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncrementalDeltasSupported(Boolean newIncrementalDeltasSupported) {
		Boolean oldIncrementalDeltasSupported = incrementalDeltasSupported;
		incrementalDeltasSupported = newIncrementalDeltasSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__INCREMENTAL_DELTAS_SUPPORTED, oldIncrementalDeltasSupported, incrementalDeltasSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPersistentReplicasSupported() {
		return persistentReplicasSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistentReplicasSupported(Boolean newPersistentReplicasSupported) {
		Boolean oldPersistentReplicasSupported = persistentReplicasSupported;
		persistentReplicasSupported = newPersistentReplicasSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__PERSISTENT_REPLICAS_SUPPORTED, oldPersistentReplicasSupported, persistentReplicasSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getBidirectionalConnectionsSupported() {
		return bidirectionalConnectionsSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBidirectionalConnectionsSupported(Boolean newBidirectionalConnectionsSupported) {
		Boolean oldBidirectionalConnectionsSupported = bidirectionalConnectionsSupported;
		bidirectionalConnectionsSupported = newBidirectionalConnectionsSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__BIDIRECTIONAL_CONNECTIONS_SUPPORTED, oldBidirectionalConnectionsSupported, bidirectionalConnectionsSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaximumReplicasPerSource() {
		return maximumReplicasPerSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumReplicasPerSource(Integer newMaximumReplicasPerSource) {
		Integer oldMaximumReplicasPerSource = maximumReplicasPerSource;
		maximumReplicasPerSource = newMaximumReplicasPerSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_REPLICAS_PER_SOURCE, oldMaximumReplicasPerSource, maximumReplicasPerSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaximumPortsPerConnection() {
		return maximumPortsPerConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumPortsPerConnection(Integer newMaximumPortsPerConnection) {
		Integer oldMaximumPortsPerConnection = maximumPortsPerConnection;
		maximumPortsPerConnection = newMaximumPortsPerConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_PORTS_PER_CONNECTION, oldMaximumPortsPerConnection, maximumPortsPerConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaximumConnectionsPerPort() {
		return maximumConnectionsPerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumConnectionsPerPort(Integer newMaximumConnectionsPerPort) {
		Integer oldMaximumConnectionsPerPort = maximumConnectionsPerPort;
		maximumConnectionsPerPort = newMaximumConnectionsPerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_CONNECTIONS_PER_PORT, oldMaximumConnectionsPerPort, maximumConnectionsPerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaximumPeerConnections() {
		return maximumPeerConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumPeerConnections(Integer newMaximumPeerConnections) {
		Integer oldMaximumPeerConnections = maximumPeerConnections;
		maximumPeerConnections = newMaximumPeerConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_PEER_CONNECTIONS, oldMaximumPeerConnections, maximumPeerConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaximumLocalReplicationDepth() {
		return maximumLocalReplicationDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumLocalReplicationDepth(Integer newMaximumLocalReplicationDepth) {
		Integer oldMaximumLocalReplicationDepth = maximumLocalReplicationDepth;
		maximumLocalReplicationDepth = newMaximumLocalReplicationDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_LOCAL_REPLICATION_DEPTH, oldMaximumLocalReplicationDepth, maximumLocalReplicationDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaximumRemoteReplicationDepth() {
		return maximumRemoteReplicationDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumRemoteReplicationDepth(Integer newMaximumRemoteReplicationDepth) {
		Integer oldMaximumRemoteReplicationDepth = maximumRemoteReplicationDepth;
		maximumRemoteReplicationDepth = newMaximumRemoteReplicationDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_REMOTE_REPLICATION_DEPTH, oldMaximumRemoteReplicationDepth, maximumRemoteReplicationDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInitialSynchronizationDefault() {
		return initialSynchronizationDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialSynchronizationDefault(Integer newInitialSynchronizationDefault) {
		Integer oldInitialSynchronizationDefault = initialSynchronizationDefault;
		initialSynchronizationDefault = newInitialSynchronizationDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__INITIAL_SYNCHRONIZATION_DEFAULT, oldInitialSynchronizationDefault, initialSynchronizationDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getReplicationPriorityDefault() {
		return replicationPriorityDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplicationPriorityDefault(Integer newReplicationPriorityDefault) {
		Integer oldReplicationPriorityDefault = replicationPriorityDefault;
		replicationPriorityDefault = newReplicationPriorityDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REPLICATION_PRIORITY_DEFAULT, oldReplicationPriorityDefault, replicationPriorityDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLowSpaceWarningThresholdDefault() {
		return lowSpaceWarningThresholdDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowSpaceWarningThresholdDefault(Integer newLowSpaceWarningThresholdDefault) {
		Integer oldLowSpaceWarningThresholdDefault = lowSpaceWarningThresholdDefault;
		lowSpaceWarningThresholdDefault = newLowSpaceWarningThresholdDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__LOW_SPACE_WARNING_THRESHOLD_DEFAULT, oldLowSpaceWarningThresholdDefault, lowSpaceWarningThresholdDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSpaceLimitWarningThresholdDefault() {
		return spaceLimitWarningThresholdDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaceLimitWarningThresholdDefault(Integer newSpaceLimitWarningThresholdDefault) {
		Integer oldSpaceLimitWarningThresholdDefault = spaceLimitWarningThresholdDefault;
		spaceLimitWarningThresholdDefault = newSpaceLimitWarningThresholdDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SPACE_LIMIT_WARNING_THRESHOLD_DEFAULT, oldSpaceLimitWarningThresholdDefault, spaceLimitWarningThresholdDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemoteReplicationServicePointAccess() {
		return remoteReplicationServicePointAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteReplicationServicePointAccess(Integer newRemoteReplicationServicePointAccess) {
		Integer oldRemoteReplicationServicePointAccess = remoteReplicationServicePointAccess;
		remoteReplicationServicePointAccess = newRemoteReplicationServicePointAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_REPLICATION_SERVICE_POINT_ACCESS, oldRemoteReplicationServicePointAccess, remoteReplicationServicePointAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAlternateReplicationServicePointAccess() {
		return alternateReplicationServicePointAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlternateReplicationServicePointAccess(Integer newAlternateReplicationServicePointAccess) {
		Integer oldAlternateReplicationServicePointAccess = alternateReplicationServicePointAccess;
		alternateReplicationServicePointAccess = newAlternateReplicationServicePointAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__ALTERNATE_REPLICATION_SERVICE_POINT_ACCESS, oldAlternateReplicationServicePointAccess, alternateReplicationServicePointAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeltaReplicaPoolAccess() {
		return deltaReplicaPoolAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltaReplicaPoolAccess(Integer newDeltaReplicaPoolAccess) {
		Integer oldDeltaReplicaPoolAccess = deltaReplicaPoolAccess;
		deltaReplicaPoolAccess = newDeltaReplicaPoolAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__DELTA_REPLICA_POOL_ACCESS, oldDeltaReplicaPoolAccess, deltaReplicaPoolAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemoteBufferElementType() {
		return remoteBufferElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteBufferElementType(Integer newRemoteBufferElementType) {
		Integer oldRemoteBufferElementType = remoteBufferElementType;
		remoteBufferElementType = newRemoteBufferElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_ELEMENT_TYPE, oldRemoteBufferElementType, remoteBufferElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemoteBufferHost() {
		return remoteBufferHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteBufferHost(Integer newRemoteBufferHost) {
		Integer oldRemoteBufferHost = remoteBufferHost;
		remoteBufferHost = newRemoteBufferHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_HOST, oldRemoteBufferHost, remoteBufferHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemoteBufferLocation() {
		return remoteBufferLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteBufferLocation(Integer newRemoteBufferLocation) {
		Integer oldRemoteBufferLocation = remoteBufferLocation;
		remoteBufferLocation = newRemoteBufferLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_LOCATION, oldRemoteBufferLocation, remoteBufferLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getRemoteBufferSupported() {
		return remoteBufferSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoteBufferSupported(Integer newRemoteBufferSupported) {
		Integer oldRemoteBufferSupported = remoteBufferSupported;
		remoteBufferSupported = newRemoteBufferSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_SUPPORTED, oldRemoteBufferSupported, remoteBufferSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUseReplicationBufferDefault() {
		return useReplicationBufferDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseReplicationBufferDefault(Integer newUseReplicationBufferDefault) {
		Integer oldUseReplicationBufferDefault = useReplicationBufferDefault;
		useReplicationBufferDefault = newUseReplicationBufferDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__USE_REPLICATION_BUFFER_DEFAULT, oldUseReplicationBufferDefault, useReplicationBufferDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPeerConnectionProtocol() {
		return peerConnectionProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeerConnectionProtocol(String newPeerConnectionProtocol) {
		String oldPeerConnectionProtocol = peerConnectionProtocol;
		peerConnectionProtocol = newPeerConnectionProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__PEER_CONNECTION_PROTOCOL, oldPeerConnectionProtocol, peerConnectionProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_SYNCHRONIZATION_TYPE:
				return getSupportedSynchronizationType();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return getSupportedAsynchronousActions();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return getSupportedSynchronousActions();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__INITIAL_REPLICATION_STATE:
				return getInitialReplicationState();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_SPECIALIZED_ELEMENTS:
				return getSupportedSpecializedElements();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_MODIFY_OPERATIONS:
				return getSupportedModifyOperations();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REPLICA_HOST_ACCESSIBILITY:
				return getReplicaHostAccessibility();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__HOST_ACCESSIBLE_STATE:
				return getHostAccessibleState();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SPACE_LIMIT_SUPPORTED:
				return getSpaceLimitSupported();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SPACE_RESERVATION_SUPPORTED:
				return getSpaceReservationSupported();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__LOCAL_MIRROR_SNAPSHOT_SUPPORTED:
				return getLocalMirrorSnapshotSupported();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_MIRROR_SNAPSHOT_SUPPORTED:
				return getRemoteMirrorSnapshotSupported();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__INCREMENTAL_DELTAS_SUPPORTED:
				return getIncrementalDeltasSupported();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__PERSISTENT_REPLICAS_SUPPORTED:
				return getPersistentReplicasSupported();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__BIDIRECTIONAL_CONNECTIONS_SUPPORTED:
				return getBidirectionalConnectionsSupported();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_REPLICAS_PER_SOURCE:
				return getMaximumReplicasPerSource();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_PORTS_PER_CONNECTION:
				return getMaximumPortsPerConnection();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_CONNECTIONS_PER_PORT:
				return getMaximumConnectionsPerPort();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_PEER_CONNECTIONS:
				return getMaximumPeerConnections();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_LOCAL_REPLICATION_DEPTH:
				return getMaximumLocalReplicationDepth();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_REMOTE_REPLICATION_DEPTH:
				return getMaximumRemoteReplicationDepth();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__INITIAL_SYNCHRONIZATION_DEFAULT:
				return getInitialSynchronizationDefault();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REPLICATION_PRIORITY_DEFAULT:
				return getReplicationPriorityDefault();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__LOW_SPACE_WARNING_THRESHOLD_DEFAULT:
				return getLowSpaceWarningThresholdDefault();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SPACE_LIMIT_WARNING_THRESHOLD_DEFAULT:
				return getSpaceLimitWarningThresholdDefault();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_REPLICATION_SERVICE_POINT_ACCESS:
				return getRemoteReplicationServicePointAccess();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__ALTERNATE_REPLICATION_SERVICE_POINT_ACCESS:
				return getAlternateReplicationServicePointAccess();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__DELTA_REPLICA_POOL_ACCESS:
				return getDeltaReplicaPoolAccess();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_ELEMENT_TYPE:
				return getRemoteBufferElementType();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_HOST:
				return getRemoteBufferHost();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_LOCATION:
				return getRemoteBufferLocation();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_SUPPORTED:
				return getRemoteBufferSupported();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__USE_REPLICATION_BUFFER_DEFAULT:
				return getUseReplicationBufferDefault();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__PEER_CONNECTION_PROTOCOL:
				return getPeerConnectionProtocol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_SYNCHRONIZATION_TYPE:
				setSupportedSynchronizationType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				getSupportedAsynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				getSupportedSynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__INITIAL_REPLICATION_STATE:
				setInitialReplicationState((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_SPECIALIZED_ELEMENTS:
				getSupportedSpecializedElements().clear();
				getSupportedSpecializedElements().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_MODIFY_OPERATIONS:
				getSupportedModifyOperations().clear();
				getSupportedModifyOperations().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REPLICA_HOST_ACCESSIBILITY:
				setReplicaHostAccessibility((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__HOST_ACCESSIBLE_STATE:
				getHostAccessibleState().clear();
				getHostAccessibleState().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SPACE_LIMIT_SUPPORTED:
				setSpaceLimitSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SPACE_RESERVATION_SUPPORTED:
				setSpaceReservationSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__LOCAL_MIRROR_SNAPSHOT_SUPPORTED:
				setLocalMirrorSnapshotSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_MIRROR_SNAPSHOT_SUPPORTED:
				setRemoteMirrorSnapshotSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__INCREMENTAL_DELTAS_SUPPORTED:
				setIncrementalDeltasSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__PERSISTENT_REPLICAS_SUPPORTED:
				setPersistentReplicasSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__BIDIRECTIONAL_CONNECTIONS_SUPPORTED:
				setBidirectionalConnectionsSupported((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_REPLICAS_PER_SOURCE:
				setMaximumReplicasPerSource((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_PORTS_PER_CONNECTION:
				setMaximumPortsPerConnection((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_CONNECTIONS_PER_PORT:
				setMaximumConnectionsPerPort((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_PEER_CONNECTIONS:
				setMaximumPeerConnections((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_LOCAL_REPLICATION_DEPTH:
				setMaximumLocalReplicationDepth((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_REMOTE_REPLICATION_DEPTH:
				setMaximumRemoteReplicationDepth((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__INITIAL_SYNCHRONIZATION_DEFAULT:
				setInitialSynchronizationDefault((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REPLICATION_PRIORITY_DEFAULT:
				setReplicationPriorityDefault((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__LOW_SPACE_WARNING_THRESHOLD_DEFAULT:
				setLowSpaceWarningThresholdDefault((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SPACE_LIMIT_WARNING_THRESHOLD_DEFAULT:
				setSpaceLimitWarningThresholdDefault((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_REPLICATION_SERVICE_POINT_ACCESS:
				setRemoteReplicationServicePointAccess((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__ALTERNATE_REPLICATION_SERVICE_POINT_ACCESS:
				setAlternateReplicationServicePointAccess((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__DELTA_REPLICA_POOL_ACCESS:
				setDeltaReplicaPoolAccess((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_ELEMENT_TYPE:
				setRemoteBufferElementType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_HOST:
				setRemoteBufferHost((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_LOCATION:
				setRemoteBufferLocation((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_SUPPORTED:
				setRemoteBufferSupported((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__USE_REPLICATION_BUFFER_DEFAULT:
				setUseReplicationBufferDefault((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__PEER_CONNECTION_PROTOCOL:
				setPeerConnectionProtocol((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_SYNCHRONIZATION_TYPE:
				setSupportedSynchronizationType(SUPPORTED_SYNCHRONIZATION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__INITIAL_REPLICATION_STATE:
				setInitialReplicationState(INITIAL_REPLICATION_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_SPECIALIZED_ELEMENTS:
				getSupportedSpecializedElements().clear();
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_MODIFY_OPERATIONS:
				getSupportedModifyOperations().clear();
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REPLICA_HOST_ACCESSIBILITY:
				setReplicaHostAccessibility(REPLICA_HOST_ACCESSIBILITY_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__HOST_ACCESSIBLE_STATE:
				getHostAccessibleState().clear();
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SPACE_LIMIT_SUPPORTED:
				setSpaceLimitSupported(SPACE_LIMIT_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SPACE_RESERVATION_SUPPORTED:
				setSpaceReservationSupported(SPACE_RESERVATION_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__LOCAL_MIRROR_SNAPSHOT_SUPPORTED:
				setLocalMirrorSnapshotSupported(LOCAL_MIRROR_SNAPSHOT_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_MIRROR_SNAPSHOT_SUPPORTED:
				setRemoteMirrorSnapshotSupported(REMOTE_MIRROR_SNAPSHOT_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__INCREMENTAL_DELTAS_SUPPORTED:
				setIncrementalDeltasSupported(INCREMENTAL_DELTAS_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__PERSISTENT_REPLICAS_SUPPORTED:
				setPersistentReplicasSupported(PERSISTENT_REPLICAS_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__BIDIRECTIONAL_CONNECTIONS_SUPPORTED:
				setBidirectionalConnectionsSupported(BIDIRECTIONAL_CONNECTIONS_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_REPLICAS_PER_SOURCE:
				setMaximumReplicasPerSource(MAXIMUM_REPLICAS_PER_SOURCE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_PORTS_PER_CONNECTION:
				setMaximumPortsPerConnection(MAXIMUM_PORTS_PER_CONNECTION_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_CONNECTIONS_PER_PORT:
				setMaximumConnectionsPerPort(MAXIMUM_CONNECTIONS_PER_PORT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_PEER_CONNECTIONS:
				setMaximumPeerConnections(MAXIMUM_PEER_CONNECTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_LOCAL_REPLICATION_DEPTH:
				setMaximumLocalReplicationDepth(MAXIMUM_LOCAL_REPLICATION_DEPTH_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_REMOTE_REPLICATION_DEPTH:
				setMaximumRemoteReplicationDepth(MAXIMUM_REMOTE_REPLICATION_DEPTH_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__INITIAL_SYNCHRONIZATION_DEFAULT:
				setInitialSynchronizationDefault(INITIAL_SYNCHRONIZATION_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REPLICATION_PRIORITY_DEFAULT:
				setReplicationPriorityDefault(REPLICATION_PRIORITY_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__LOW_SPACE_WARNING_THRESHOLD_DEFAULT:
				setLowSpaceWarningThresholdDefault(LOW_SPACE_WARNING_THRESHOLD_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SPACE_LIMIT_WARNING_THRESHOLD_DEFAULT:
				setSpaceLimitWarningThresholdDefault(SPACE_LIMIT_WARNING_THRESHOLD_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_REPLICATION_SERVICE_POINT_ACCESS:
				setRemoteReplicationServicePointAccess(REMOTE_REPLICATION_SERVICE_POINT_ACCESS_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__ALTERNATE_REPLICATION_SERVICE_POINT_ACCESS:
				setAlternateReplicationServicePointAccess(ALTERNATE_REPLICATION_SERVICE_POINT_ACCESS_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__DELTA_REPLICA_POOL_ACCESS:
				setDeltaReplicaPoolAccess(DELTA_REPLICA_POOL_ACCESS_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_ELEMENT_TYPE:
				setRemoteBufferElementType(REMOTE_BUFFER_ELEMENT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_HOST:
				setRemoteBufferHost(REMOTE_BUFFER_HOST_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_LOCATION:
				setRemoteBufferLocation(REMOTE_BUFFER_LOCATION_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_SUPPORTED:
				setRemoteBufferSupported(REMOTE_BUFFER_SUPPORTED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__USE_REPLICATION_BUFFER_DEFAULT:
				setUseReplicationBufferDefault(USE_REPLICATION_BUFFER_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__PEER_CONNECTION_PROTOCOL:
				setPeerConnectionProtocol(PEER_CONNECTION_PROTOCOL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_SYNCHRONIZATION_TYPE:
				return SUPPORTED_SYNCHRONIZATION_TYPE_EDEFAULT == null ? supportedSynchronizationType != null : !SUPPORTED_SYNCHRONIZATION_TYPE_EDEFAULT.equals(supportedSynchronizationType);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return supportedAsynchronousActions != null && !supportedAsynchronousActions.isEmpty();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return supportedSynchronousActions != null && !supportedSynchronousActions.isEmpty();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__INITIAL_REPLICATION_STATE:
				return INITIAL_REPLICATION_STATE_EDEFAULT == null ? initialReplicationState != null : !INITIAL_REPLICATION_STATE_EDEFAULT.equals(initialReplicationState);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_SPECIALIZED_ELEMENTS:
				return supportedSpecializedElements != null && !supportedSpecializedElements.isEmpty();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SUPPORTED_MODIFY_OPERATIONS:
				return supportedModifyOperations != null && !supportedModifyOperations.isEmpty();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REPLICA_HOST_ACCESSIBILITY:
				return REPLICA_HOST_ACCESSIBILITY_EDEFAULT == null ? replicaHostAccessibility != null : !REPLICA_HOST_ACCESSIBILITY_EDEFAULT.equals(replicaHostAccessibility);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__HOST_ACCESSIBLE_STATE:
				return hostAccessibleState != null && !hostAccessibleState.isEmpty();
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SPACE_LIMIT_SUPPORTED:
				return SPACE_LIMIT_SUPPORTED_EDEFAULT == null ? spaceLimitSupported != null : !SPACE_LIMIT_SUPPORTED_EDEFAULT.equals(spaceLimitSupported);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SPACE_RESERVATION_SUPPORTED:
				return SPACE_RESERVATION_SUPPORTED_EDEFAULT == null ? spaceReservationSupported != null : !SPACE_RESERVATION_SUPPORTED_EDEFAULT.equals(spaceReservationSupported);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__LOCAL_MIRROR_SNAPSHOT_SUPPORTED:
				return LOCAL_MIRROR_SNAPSHOT_SUPPORTED_EDEFAULT == null ? localMirrorSnapshotSupported != null : !LOCAL_MIRROR_SNAPSHOT_SUPPORTED_EDEFAULT.equals(localMirrorSnapshotSupported);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_MIRROR_SNAPSHOT_SUPPORTED:
				return REMOTE_MIRROR_SNAPSHOT_SUPPORTED_EDEFAULT == null ? remoteMirrorSnapshotSupported != null : !REMOTE_MIRROR_SNAPSHOT_SUPPORTED_EDEFAULT.equals(remoteMirrorSnapshotSupported);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__INCREMENTAL_DELTAS_SUPPORTED:
				return INCREMENTAL_DELTAS_SUPPORTED_EDEFAULT == null ? incrementalDeltasSupported != null : !INCREMENTAL_DELTAS_SUPPORTED_EDEFAULT.equals(incrementalDeltasSupported);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__PERSISTENT_REPLICAS_SUPPORTED:
				return PERSISTENT_REPLICAS_SUPPORTED_EDEFAULT == null ? persistentReplicasSupported != null : !PERSISTENT_REPLICAS_SUPPORTED_EDEFAULT.equals(persistentReplicasSupported);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__BIDIRECTIONAL_CONNECTIONS_SUPPORTED:
				return BIDIRECTIONAL_CONNECTIONS_SUPPORTED_EDEFAULT == null ? bidirectionalConnectionsSupported != null : !BIDIRECTIONAL_CONNECTIONS_SUPPORTED_EDEFAULT.equals(bidirectionalConnectionsSupported);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_REPLICAS_PER_SOURCE:
				return MAXIMUM_REPLICAS_PER_SOURCE_EDEFAULT == null ? maximumReplicasPerSource != null : !MAXIMUM_REPLICAS_PER_SOURCE_EDEFAULT.equals(maximumReplicasPerSource);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_PORTS_PER_CONNECTION:
				return MAXIMUM_PORTS_PER_CONNECTION_EDEFAULT == null ? maximumPortsPerConnection != null : !MAXIMUM_PORTS_PER_CONNECTION_EDEFAULT.equals(maximumPortsPerConnection);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_CONNECTIONS_PER_PORT:
				return MAXIMUM_CONNECTIONS_PER_PORT_EDEFAULT == null ? maximumConnectionsPerPort != null : !MAXIMUM_CONNECTIONS_PER_PORT_EDEFAULT.equals(maximumConnectionsPerPort);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_PEER_CONNECTIONS:
				return MAXIMUM_PEER_CONNECTIONS_EDEFAULT == null ? maximumPeerConnections != null : !MAXIMUM_PEER_CONNECTIONS_EDEFAULT.equals(maximumPeerConnections);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_LOCAL_REPLICATION_DEPTH:
				return MAXIMUM_LOCAL_REPLICATION_DEPTH_EDEFAULT == null ? maximumLocalReplicationDepth != null : !MAXIMUM_LOCAL_REPLICATION_DEPTH_EDEFAULT.equals(maximumLocalReplicationDepth);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__MAXIMUM_REMOTE_REPLICATION_DEPTH:
				return MAXIMUM_REMOTE_REPLICATION_DEPTH_EDEFAULT == null ? maximumRemoteReplicationDepth != null : !MAXIMUM_REMOTE_REPLICATION_DEPTH_EDEFAULT.equals(maximumRemoteReplicationDepth);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__INITIAL_SYNCHRONIZATION_DEFAULT:
				return INITIAL_SYNCHRONIZATION_DEFAULT_EDEFAULT == null ? initialSynchronizationDefault != null : !INITIAL_SYNCHRONIZATION_DEFAULT_EDEFAULT.equals(initialSynchronizationDefault);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REPLICATION_PRIORITY_DEFAULT:
				return REPLICATION_PRIORITY_DEFAULT_EDEFAULT == null ? replicationPriorityDefault != null : !REPLICATION_PRIORITY_DEFAULT_EDEFAULT.equals(replicationPriorityDefault);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__LOW_SPACE_WARNING_THRESHOLD_DEFAULT:
				return LOW_SPACE_WARNING_THRESHOLD_DEFAULT_EDEFAULT == null ? lowSpaceWarningThresholdDefault != null : !LOW_SPACE_WARNING_THRESHOLD_DEFAULT_EDEFAULT.equals(lowSpaceWarningThresholdDefault);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__SPACE_LIMIT_WARNING_THRESHOLD_DEFAULT:
				return SPACE_LIMIT_WARNING_THRESHOLD_DEFAULT_EDEFAULT == null ? spaceLimitWarningThresholdDefault != null : !SPACE_LIMIT_WARNING_THRESHOLD_DEFAULT_EDEFAULT.equals(spaceLimitWarningThresholdDefault);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_REPLICATION_SERVICE_POINT_ACCESS:
				return REMOTE_REPLICATION_SERVICE_POINT_ACCESS_EDEFAULT == null ? remoteReplicationServicePointAccess != null : !REMOTE_REPLICATION_SERVICE_POINT_ACCESS_EDEFAULT.equals(remoteReplicationServicePointAccess);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__ALTERNATE_REPLICATION_SERVICE_POINT_ACCESS:
				return ALTERNATE_REPLICATION_SERVICE_POINT_ACCESS_EDEFAULT == null ? alternateReplicationServicePointAccess != null : !ALTERNATE_REPLICATION_SERVICE_POINT_ACCESS_EDEFAULT.equals(alternateReplicationServicePointAccess);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__DELTA_REPLICA_POOL_ACCESS:
				return DELTA_REPLICA_POOL_ACCESS_EDEFAULT == null ? deltaReplicaPoolAccess != null : !DELTA_REPLICA_POOL_ACCESS_EDEFAULT.equals(deltaReplicaPoolAccess);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_ELEMENT_TYPE:
				return REMOTE_BUFFER_ELEMENT_TYPE_EDEFAULT == null ? remoteBufferElementType != null : !REMOTE_BUFFER_ELEMENT_TYPE_EDEFAULT.equals(remoteBufferElementType);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_HOST:
				return REMOTE_BUFFER_HOST_EDEFAULT == null ? remoteBufferHost != null : !REMOTE_BUFFER_HOST_EDEFAULT.equals(remoteBufferHost);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_LOCATION:
				return REMOTE_BUFFER_LOCATION_EDEFAULT == null ? remoteBufferLocation != null : !REMOTE_BUFFER_LOCATION_EDEFAULT.equals(remoteBufferLocation);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__REMOTE_BUFFER_SUPPORTED:
				return REMOTE_BUFFER_SUPPORTED_EDEFAULT == null ? remoteBufferSupported != null : !REMOTE_BUFFER_SUPPORTED_EDEFAULT.equals(remoteBufferSupported);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__USE_REPLICATION_BUFFER_DEFAULT:
				return USE_REPLICATION_BUFFER_DEFAULT_EDEFAULT == null ? useReplicationBufferDefault != null : !USE_REPLICATION_BUFFER_DEFAULT_EDEFAULT.equals(useReplicationBufferDefault);
			case CimPackage.CIM_STORAGE_REPLICATION_CAPABILITIES__PEER_CONNECTION_PROTOCOL:
				return PEER_CONNECTION_PROTOCOL_EDEFAULT == null ? peerConnectionProtocol != null : !PEER_CONNECTION_PROTOCOL_EDEFAULT.equals(peerConnectionProtocol);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (SupportedSynchronizationType: ");
		result.append(supportedSynchronizationType);
		result.append(", SupportedAsynchronousActions: ");
		result.append(supportedAsynchronousActions);
		result.append(", SupportedSynchronousActions: ");
		result.append(supportedSynchronousActions);
		result.append(", InitialReplicationState: ");
		result.append(initialReplicationState);
		result.append(", SupportedSpecializedElements: ");
		result.append(supportedSpecializedElements);
		result.append(", SupportedModifyOperations: ");
		result.append(supportedModifyOperations);
		result.append(", ReplicaHostAccessibility: ");
		result.append(replicaHostAccessibility);
		result.append(", HostAccessibleState: ");
		result.append(hostAccessibleState);
		result.append(", SpaceLimitSupported: ");
		result.append(spaceLimitSupported);
		result.append(", SpaceReservationSupported: ");
		result.append(spaceReservationSupported);
		result.append(", LocalMirrorSnapshotSupported: ");
		result.append(localMirrorSnapshotSupported);
		result.append(", RemoteMirrorSnapshotSupported: ");
		result.append(remoteMirrorSnapshotSupported);
		result.append(", IncrementalDeltasSupported: ");
		result.append(incrementalDeltasSupported);
		result.append(", PersistentReplicasSupported: ");
		result.append(persistentReplicasSupported);
		result.append(", BidirectionalConnectionsSupported: ");
		result.append(bidirectionalConnectionsSupported);
		result.append(", MaximumReplicasPerSource: ");
		result.append(maximumReplicasPerSource);
		result.append(", MaximumPortsPerConnection: ");
		result.append(maximumPortsPerConnection);
		result.append(", MaximumConnectionsPerPort: ");
		result.append(maximumConnectionsPerPort);
		result.append(", MaximumPeerConnections: ");
		result.append(maximumPeerConnections);
		result.append(", MaximumLocalReplicationDepth: ");
		result.append(maximumLocalReplicationDepth);
		result.append(", MaximumRemoteReplicationDepth: ");
		result.append(maximumRemoteReplicationDepth);
		result.append(", InitialSynchronizationDefault: ");
		result.append(initialSynchronizationDefault);
		result.append(", ReplicationPriorityDefault: ");
		result.append(replicationPriorityDefault);
		result.append(", LowSpaceWarningThresholdDefault: ");
		result.append(lowSpaceWarningThresholdDefault);
		result.append(", SpaceLimitWarningThresholdDefault: ");
		result.append(spaceLimitWarningThresholdDefault);
		result.append(", RemoteReplicationServicePointAccess: ");
		result.append(remoteReplicationServicePointAccess);
		result.append(", AlternateReplicationServicePointAccess: ");
		result.append(alternateReplicationServicePointAccess);
		result.append(", DeltaReplicaPoolAccess: ");
		result.append(deltaReplicaPoolAccess);
		result.append(", RemoteBufferElementType: ");
		result.append(remoteBufferElementType);
		result.append(", RemoteBufferHost: ");
		result.append(remoteBufferHost);
		result.append(", RemoteBufferLocation: ");
		result.append(remoteBufferLocation);
		result.append(", RemoteBufferSupported: ");
		result.append(remoteBufferSupported);
		result.append(", UseReplicationBufferDefault: ");
		result.append(useReplicationBufferDefault);
		result.append(", PeerConnectionProtocol: ");
		result.append(peerConnectionProtocol);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageReplicationCapabilitiesImpl

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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM File System Synchronized</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates that two Storage objects were replicated at the specified point in time. If the CopyType property is set to 'Sync' (=3), then synchronization of the Storage objects is preserved.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSynchronized#getReplicationType <em>Replication Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSynchronized#getReplicaType <em>Replica Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSynchronized#getSyncState <em>Sync State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSynchronized#getCopyPriority <em>Copy Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSynchronized#getCopyMethodology <em>Copy Methodology</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSynchronized#getUndiscoveredElement <em>Undiscovered Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSynchronized#getReadOnly <em>Read Only</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSynchronized()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' override.SystemElement='CIM_ManagedElement REF' override.SystemElement.Key='true' override.SystemElement.Description='SystemElement represents the FileSystem that is the source of the replication.' override.SyncedElement='CIM_ManagedElement REF' override.SyncedElement.Key='true' override.SyncedElement.Description='SyncedElement represents the FileSystem that is the target of the replication.' keys='SystemElement,SyncedElement'"
 * @generated
 */
@ProviderType
public interface CIM_FileSystemSynchronized extends CIM_Synchronized {
	/**
	 * Returns the value of the '<em><b>Replication Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enumeration indicating the supported SyncType/Mode/Local-or-Remote combinations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replication Type</em>' attribute.
	 * @see #setReplicationType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSynchronized_ReplicationType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"..\",\"0x8000..\"]' Values='[\"Synchronous Mirror Local\",\"Asynchronous Mirror Local\",\"Synchronous Mirror Remote\",\"Asynchronous Mirror Remote\",\"Synchronous Snapshot Local\",\"Asynchronous Snapshot Local\",\"Synchronous Snapshot Remote\",\"Asynchronous Snapshot Remote\",\"Synchronous Clone Local\",\"Asynchronous Clone Local\",\"Synchronous Clone Remote\",\"Asynchronous Clone Remote\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getReplicationType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemSynchronized#getReplicationType <em>Replication Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication Type</em>' attribute.
	 * @see #getReplicationType()
	 * @generated
	 */
	void setReplicationType(Integer value);

	/**
	 * Returns the value of the '<em><b>Replica Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ReplicaType provides information on how the Replica is being maintained. Values are: 
	 * Full Copy: This indicates that a full copy of the source object is (or will be) generated . 
	 * Before Delta: This indicates that the source object will be maintained as a delta data from the replica. 
	 * After Delta: This indicates that the replica will be maintained as delta data from the source object. 
	 * Log: This indicates that the replica object is being maintained as a log of changes to the source. 
	 * Not Specified: The method of maintaining the copy is not specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replica Type</em>' attribute.
	 * @see #setReplicaType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSynchronized_ReplicaType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Not Specified\",\"Full Copy\",\"Before Delta\",\"After Delta\",\"Log\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getReplicaType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemSynchronized#getReplicaType <em>Replica Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replica Type</em>' attribute.
	 * @see #getReplicaType()
	 * @generated
	 */
	void setReplicaType(Integer value);

	/**
	 * Returns the value of the '<em><b>Sync State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SyncState describes the state of the association with respect to Replication activity. Values are: 
	 * Initialized: The link to enable replication is established. And source/replica elements are associated, but the Copy engine has not started. 
	 * PrepareInProgress: Preparation for Replication is in progress and the Copy engine has started. 
	 * Prepared: All necessary preparation has completed. 
	 * ResyncInProgress: Synchronization or Resynchronization is in progress. This may be the initial 'copy' or subsequent changes being copied. 
	 * Synchronized: An Async or Sync replication is currently synchronized. When this value is set, SyncMaintained will be true. 
	 * FractureInProgress: An operation to fracture an Async or Sync replication is in progress. 
	 * Fractured: An Async or Sync replication is fractured. 
	 * QuiesceInProgress: A quiesce operation is in progress. 
	 * Quiesced: The replication has been quiesced and is ready for a change. 
	 * RestoreInProgress: An operation is in progress to copy the Synced object to the System object. 
	 * Idle: The 'normal' state for an UnSyncAssoc replica. 
	 * Frozen: All blocks copied from source to an UnSyncAssoc replica and the copy engine is stopped. 
	 * CopyInProgress: A deferred background copy operation is in progress to copy the source to the replica target for an UnSyncAssoc association. 
	 * Broken: The relationship is non-functional due to errors in the source, the target, the path between the two or space constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sync State</em>' attribute.
	 * @see #setSyncState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSynchronized_SyncState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Initialized\",\"PrepareInProgress\",\"Prepared\",\"ResyncInProgress\",\"Synchronized\",\"Fracture In Progress\",\"QuiesceInProgress\",\"Quiesced\",\"Restore In Progresss\",\"Idle\",\"Broken\",\"Fractured\",\"Frozen\",\"Copy In Progress\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getSyncState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemSynchronized#getSyncState <em>Sync State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync State</em>' attribute.
	 * @see #getSyncState()
	 * @generated
	 */
	void setSyncState(Integer value);

	/**
	 * Returns the value of the '<em><b>Copy Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CopyPriority allows the priority of background copy engine I/O to be managed relative to host I/O operations during a sequential background copy operation. Values are: 
	 * Low: copy engine I/O lower priority than host I/O. 
	 * Same: copy engine I/O has the same priority as host I/O. 
	 * High: copy engine I/O has higher priority than host I/O. 
	 * Urgent: copy operation to be performed as soon as possible, regardless of the host I/O requests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy Priority</em>' attribute.
	 * @see #setCopyPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSynchronized_CopyPriority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Not Managed\",\"Low\",\"Same\",\"High\",\"Urgent\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getCopyPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemSynchronized#getCopyPriority <em>Copy Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Priority</em>' attribute.
	 * @see #getCopyPriority()
	 * @generated
	 */
	void setCopyPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>Copy Methodology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CopyMethodology specifies what copy methodology the service uses to create and/or maintain the target element. 
	 * Values are: 
	 * Not Specified: The method of maintaining the copy is not specified. 
	 * Full Copy: This indicates that a full copy of the source object is (or will be) generated . 
	 * Incremental-Copy: Only changed data from source element is copied to target element. 
	 * Differential-Copy: Only the new writes to source element are copied to the target element. 
	 * Copy-On-Write: Affected data is copied on the first write to the source or to the target elements. 
	 * Copy-On-Access: Affected data is copied on the first access to the source element. 
	 * Delta-Update: Difference based replication where after the initial copy, only updates to source are copied to target. 
	 * Snap-And-Clone: The service creates a snapshot of the source element first, then uses the the snapshot as the source of the copy operation to the target element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy Methodology</em>' attribute.
	 * @see #setCopyMethodology(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSynchronized_CopyMethodology()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"Not Specified\",\"Other\",\"Implementation decides\",\"Full Copy\",\"Incremental-Copy\",\"Differential-Copy\",\"Copy-On-Write\",\"Copy-On-Access\",\"Delta-Update\",\"Snap-And-Clone\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getCopyMethodology();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemSynchronized#getCopyMethodology <em>Copy Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Methodology</em>' attribute.
	 * @see #getCopyMethodology()
	 * @generated
	 */
	void setCopyMethodology(Integer value);

	/**
	 * Returns the value of the '<em><b>Undiscovered Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies whether the source, the target, or both elements involved in a copy operation are undiscovered. An element is considered undiscovered if its object model is not known to the service performing the copy operation. The values are: 
	 * SystemElement: The source element. 
	 * SyncedElement: The target element. 
	 * Both: Both the source and the target elements. If both the source and the target elements are discovered, the value of this property shall be NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Undiscovered Element</em>' attribute.
	 * @see #setUndiscoveredElement(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSynchronized_UndiscoveredElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"SystemElement\",\"SyncedElement\",\"Both\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getUndiscoveredElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemSynchronized#getUndiscoveredElement <em>Undiscovered Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Undiscovered Element</em>' attribute.
	 * @see #getUndiscoveredElement()
	 * @generated
	 */
	void setUndiscoveredElement(Integer value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies whether the source, the target, or both elements are ead only to the host.SystemElement: The source element. 
	 * SyncedElement: The target element. 
	 * Both: Both the source and the target elements.are read only to the host.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSynchronized_ReadOnly()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"SystemElement\",\"SyncedElement\",\"Both\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getReadOnly();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemSynchronized#getReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #getReadOnly()
	 * @generated
	 */
	void setReadOnly(Integer value);

} // CIM_FileSystemSynchronized

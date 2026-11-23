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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Synchronized</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates that two ManagedElements were aligned or made to be equivalent at the specified point in time. If the Boolean property SyncMaintained is true, then synchronization of the Elements is preserved. Both like and unlike objects can be synchronized. For example, two WatchDog timers can be aligned, or the contents of a LogicalFile can be synchronized with the contents of a StorageExtent.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getSystemElement <em>System Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getSyncedElement <em>Synced Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getWhenSynced <em>When Synced</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getSyncMaintained <em>Sync Maintained</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getCopyRecoveryMode <em>Copy Recovery Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getCopyState <em>Copy State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getFailedCopyStopsHostIO <em>Failed Copy Stops Host IO</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getMode <em>Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getPercentSynced <em>Percent Synced</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getProgressStatus <em>Progress Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getRPO <em>RPO</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getRequestedCopyState <em>Requested Copy State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getSkew <em>Skew</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getSyncType <em>Sync Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getWhenActivated <em>When Activated</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getWhenDeactivated <em>When Deactivated</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getWhenEstablished <em>When Established</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getWhenSuspended <em>When Suspended</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Synchronized#getWhenSynchronized <em>When Synchronized</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.49.0' UMLPackagePath='CIM::Core::CoreElements' keys='SystemElement,SyncedElement'"
 * @generated
 */
@ProviderType
public interface CIM_Synchronized extends EObject {
	/**
	 * Returns the value of the '<em><b>System Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SystemElement represents one ManagedElement that is synchronized with the entity referenced as SyncedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Element</em>' reference.
	 * @see #setSystemElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_SystemElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getSystemElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getSystemElement <em>System Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Element</em>' reference.
	 * @see #getSystemElement()
	 * @generated
	 */
	void setSystemElement(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Synced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SyncedElement represents another ManagedElement that is synchronized with the entity referenced as SystemElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synced Element</em>' reference.
	 * @see #setSyncedElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_SyncedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getSyncedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getSyncedElement <em>Synced Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synced Element</em>' reference.
	 * @see #getSyncedElement()
	 * @generated
	 */
	void setSyncedElement(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>When Synced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point in time that the Elements were synchronized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Synced</em>' attribute.
	 * @see #setWhenSynced(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_WhenSynced()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getWhenSynced();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getWhenSynced <em>When Synced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Synced</em>' attribute.
	 * @see #getWhenSynced()
	 * @generated
	 */
	void setWhenSynced(String value);

	/**
	 * Returns the value of the '<em><b>Sync Maintained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating whether synchronization is maintained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sync Maintained</em>' attribute.
	 * @see #setSyncMaintained(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_SyncMaintained()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getSyncMaintained();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getSyncMaintained <em>Sync Maintained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Maintained</em>' attribute.
	 * @see #getSyncMaintained()
	 * @generated
	 */
	void setSyncMaintained(Boolean value);

	/**
	 * Returns the value of the '<em><b>Copy Recovery Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes whether the copy operation continues after a broken link is restored.
	 * Automatic: copy operation resumes automatically.
	 * Manual: CopyState is set to Suspended after the link is restored. It is required to issue the Resume operation to continue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy Recovery Mode</em>' attribute.
	 * @see #setCopyRecoveryMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_CopyRecoveryMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Automatic\",\"Manual\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getCopyRecoveryMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getCopyRecoveryMode <em>Copy Recovery Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Recovery Mode</em>' attribute.
	 * @see #getCopyRecoveryMode()
	 * @generated
	 */
	void setCopyRecoveryMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Copy State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CopyState describes the state of the association with respect to Replication activity. Values are: 
	 * Initialized: The link to enable replication is established and source/replica elements are associated, but the data flow has not started. 
	 * Unsynchronized: Not all the source element data has been copied to the target element. 
	 * Synchronized: For the Mirror, Snapshot, or Clone replication, the target represents a copy of the source. 
	 * Broken: The relationship is non-functional due to errors in the source, the target, the path between the two or space constraints. 
	 * Fractured: Target is split from the source. 
	 * Split: The target element was gracefully (or systematically) split from its source element -- consistency is guaranteed. 
	 * Inactive: Data flow has stopped, writes to source element will not be sent to target element. 
	 * Suspended: Data flow between the source and target elements has stopped. Writes to source element are held until the association is Resumed. 
	 * Failedover: Reads and writes to/from the target element. Source element is not reachable. 
	 * Prepared: Initialization is completed, the data flow has started, however, the data flow has not started. 
	 * Aborted: The copy operation is aborted with the Abort operation. Use the Resync Replica operation to restart the copy operation. 
	 * Skewed: The target has been modified and is no longer synchronized with the source element or the point-in-time view. 
	 * Mixed: Applies to the CopyState of GroupSynchronized. It indicates the StorageSynchronized associations of the elements in the groups have different CopyState values.
	 * Partitioned: State of replication relationship can not be determined, for example, due to a connection problem.
	 * Invalid: The array is unable to determine the state of the replication relationship, for example, after the connection is restored; however, either source or target elements have an unknown status. 
	 * Restored: It indicates the source element was restored from the target element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy State</em>' attribute.
	 * @see #setCopyState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_CopyState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"..\",\"0x8000..\"]' Values='[\"Initialized\",\"Unsynchronized\",\"Synchronized\",\"Broken\",\"Fractured\",\"Split\",\"Inactive\",\"Suspended\",\"Failedover\",\"Prepared\",\"Aborted\",\"Skewed\",\"Mixed\",\"Not Applicable\",\"Partitioned\",\"Invalid\",\"Restored\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getCopyState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getCopyState <em>Copy State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy State</em>' attribute.
	 * @see #getCopyState()
	 * @generated
	 */
	void setCopyState(Integer value);

	/**
	 * Returns the value of the '<em><b>Failed Copy Stops Host IO</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the storage array tells host to stop sending data to source element if copying to a remote element fails.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failed Copy Stops Host IO</em>' attribute.
	 * @see #setFailedCopyStopsHostIO(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_FailedCopyStopsHostIO()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getFailedCopyStopsHostIO();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getFailedCopyStopsHostIO <em>Failed Copy Stops Host IO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed Copy Stops Host IO</em>' attribute.
	 * @see #getFailedCopyStopsHostIO()
	 * @generated
	 */
	void setFailedCopyStopsHostIO(Boolean value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mode describes whether the target elements will be updated synchronously or asynchronously. 
	 * Adaptive: Allows implementation to switch between synchronous and asynchronous modes. 
	 * Active: Source and target elements are simultaneously accessible to clients 
	 * If NULL, implementation decides the mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_Mode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Synchronous\",\"Asynchronous\",\"Adaptive\",\"Active\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Percent Synced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the percent of the work completed to reach synchronization. Must be set to NULL if implementation is not capable of providing this information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Percent Synced</em>' attribute.
	 * @see #setPercentSynced(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_PercentSynced()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getPercentSynced();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getPercentSynced <em>Percent Synced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent Synced</em>' attribute.
	 * @see #getPercentSynced()
	 * @generated
	 */
	void setPercentSynced(Integer value);

	/**
	 * Returns the value of the '<em><b>Progress Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProgressStatus describes the status of the association with respect to Replication activity. Values are: Completed: The request is completed. Data flow is idle. 
	 * Dormant: Indicates that the data flow is inactive suspended or quiesced. 
	 * Initializing: In the process of establishing source/replica association and the data flow has not started. 
	 * Preparing: preparation-in-progress. 
	 * Synchronizing: sync-in-progress. 
	 * Resyncing: resync-in-progess. 
	 * Restoring: restore-in-progress. 
	 * Fracturing: fracture-in-progress. 
	 * Splitting: split-in-progress. 
	 * Failing over: in the process of switching source and target. 
	 * Failing back: Undoing the result of failover. 
	 * Detaching: detach-in-progress. 
	 * Aborting: abort-in-progress. 
	 * Mixed: Applies to groups with element pairs with different statuses. Generally, the individual statuses need to be examined.Suspending: The copy operation is in the process of being suspended. 
	 * Requires fracture: The requested operation has completed, however, the synchronization relationship needs to be fractured before further copy operations can be issued. 
	 * Requires resync: The requested operation has completed, however, the synchronization relationship needs to be resynced before further copy operations can be issued. 
	 * Requires activate: The requested operation has completed, however, the synchronization relationship needs to be activated before further copy operations can be issued. 
	 * Pending: The flow of data has stopped momentarily due to limited bandwidth or busy system. 
	 * Requires detach: The requested operation has completed, however, the synchronization relationship needs to be detached before further copy operations can be issued. 
	 * Terminating: The association is in the process of terminating. 
	 * Requires split: The requested operation has completed, however, the synchronization relationship needs to be split before further copy operations can be issued. 
	 * Requires resume: The requested operation has completed, however, the synchronization relationship needs to be resumed before further copy operations can be issued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Progress Status</em>' attribute.
	 * @see #setProgressStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_ProgressStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\",\"14\",\"15\",\"16\",\"17\",\"18\",\"19\",\"20\",\"21\",\"22\",\"23\",\"24\",\"25\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Completed\",\"Dormant\",\"Initializing\",\"Preparing\",\"Synchronizing\",\"Resyncing\",\"Restoring\",\"Fracturing\",\"Splitting\",\"Failing over\",\"Failing back\",\"Aborting\",\"Mixed\",\"Not Applicable\",\"Suspending\",\"Requires fracture\",\"Requires resync\",\"Requires activate\",\"Pending\",\"Detaching\",\"Requires detach\",\"Terminating\",\"Requires split\",\"Requires resume\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getProgressStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getProgressStatus <em>Progress Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress Status</em>' attribute.
	 * @see #getProgressStatus()
	 * @generated
	 */
	void setProgressStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>RPO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Recovery Point Objective indicates the maximum interval in which data might be lost. For synchronous copy operations, RPO is 0. For asynchronous copy operations RPO represents the interval since the most recent transmission of data to the SyncedElement (target). 
	 * For example, to indicate 15 seconds, the value would be 00000000000015.000000:000, using the CIM interval format. If NULL, RPO is not applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RPO</em>' attribute.
	 * @see #setRPO(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_RPO()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getRPO();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getRPO <em>RPO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RPO</em>' attribute.
	 * @see #getRPO()
	 * @generated
	 */
	void setRPO(String value);

	/**
	 * Returns the value of the '<em><b>Requested Copy State</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RequestedCopyState is an integer enumeration that indicates the last requested or desired state for the association. The actual state of the association is represented by CopyState. Note that when CopyState reaches the requested state, this property will be set to 'Not Applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requested Copy State</em>' attribute.
	 * @see #setRequestedCopyState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_RequestedCopyState()
	 * @model default="15"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_Synchronized.CopyState\"]'"
	 * @generated
	 */
	Integer getRequestedCopyState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getRequestedCopyState <em>Requested Copy State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requested Copy State</em>' attribute.
	 * @see #getRequestedCopyState()
	 * @generated
	 */
	void setRequestedCopyState(Integer value);

	/**
	 * Returns the value of the '<em><b>Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies to Adaptive mode and it describes maximum number of bytes the SyncedElement (target) can be out of sync. If the number of out-of-sync bytes exceeds the skew value, mode is switched to synchronous.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Skew</em>' attribute.
	 * @see #setSkew(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_Skew()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getSkew();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getSkew <em>Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skew</em>' attribute.
	 * @see #getSkew()
	 * @generated
	 */
	void setSkew(Long value);

	/**
	 * Returns the value of the '<em><b>Sync Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SyncType describes the intended outcome of the replication.Values are: 
	 * Mirror: create and maintain a copy of the source. 
	 * Snapshot: create a PIT, virtual copy of the source. 
	 * Clone: create a PIT, full copy the source. 
	 * TokenizedClone: create a token based clone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sync Type</em>' attribute.
	 * @see #setSyncType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_SyncType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"..\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"DMTF Reserved\",\"Mirror\",\"Snapshot\",\"Clone\",\"TokenizedClone\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getSyncType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getSyncType <em>Sync Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Type</em>' attribute.
	 * @see #getSyncType()
	 * @generated
	 */
	void setSyncType(Integer value);

	/**
	 * Returns the value of the '<em><b>When Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies when point-in-time was taken or when the replication association is activated, reactivated, resumed or re-established. Must be set to NULL if implementation is not capable of providing this information. A value of 0 indicates the information is not known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Activated</em>' attribute.
	 * @see #setWhenActivated(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_WhenActivated()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getWhenActivated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getWhenActivated <em>When Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Activated</em>' attribute.
	 * @see #getWhenActivated()
	 * @generated
	 */
	void setWhenActivated(String value);

	/**
	 * Returns the value of the '<em><b>When Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies when the association was deactivated. A deactivated association is reactivated.Must be set to NULL if implementation is not capable of providing this information. A value of 0 indicates the information is not known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Deactivated</em>' attribute.
	 * @see #setWhenDeactivated(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_WhenDeactivated()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getWhenDeactivated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getWhenDeactivated <em>When Deactivated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Deactivated</em>' attribute.
	 * @see #getWhenDeactivated()
	 * @generated
	 */
	void setWhenDeactivated(String value);

	/**
	 * Returns the value of the '<em><b>When Established</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies when the association was established. Must be set to NULL if implementation is not capable of providing this information. A value of 0 indicates the information is not known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Established</em>' attribute.
	 * @see #setWhenEstablished(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_WhenEstablished()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getWhenEstablished();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getWhenEstablished <em>When Established</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Established</em>' attribute.
	 * @see #getWhenEstablished()
	 * @generated
	 */
	void setWhenEstablished(String value);

	/**
	 * Returns the value of the '<em><b>When Suspended</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies when the association was suspended. A suspended association is resumed.Must be set to NULL if implementation is not capable of providing this information. A value of 0 indicates the information is not known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Suspended</em>' attribute.
	 * @see #setWhenSuspended(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_WhenSuspended()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getWhenSuspended();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getWhenSuspended <em>When Suspended</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Suspended</em>' attribute.
	 * @see #getWhenSuspended()
	 * @generated
	 */
	void setWhenSuspended(String value);

	/**
	 * Returns the value of the '<em><b>When Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies when the CopyState has a value of Synchronized. Must be set to NULL if implementation is not capable of providing this information. A value of 0 indicates the information is not known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Synchronized</em>' attribute.
	 * @see #setWhenSynchronized(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Synchronized_WhenSynchronized()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getWhenSynchronized();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Synchronized#getWhenSynchronized <em>When Synchronized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Synchronized</em>' attribute.
	 * @see #getWhenSynchronized()
	 * @generated
	 */
	void setWhenSynchronized(String value);

} // CIM_Synchronized

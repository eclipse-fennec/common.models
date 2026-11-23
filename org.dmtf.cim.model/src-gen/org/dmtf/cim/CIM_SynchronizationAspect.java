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
 * A representation of the model object '<em><b>CIM Synchronization Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class to keep track of the source of a copy operation. Additionally, the class has a series of properties to indicate the SyncType that was used and the date and time of the point-in-time if it applies to the SyncType.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SynchronizationAspect#getSyncType <em>Sync Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SynchronizationAspect#getConsistencyEnabled <em>Consistency Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SynchronizationAspect#getConsistencyType <em>Consistency Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SynchronizationAspect#getCopyStatus <em>Copy Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SynchronizationAspect#getCopyMethodology <em>Copy Methodology</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SynchronizationAspect#getWhenPointInTime <em>When Point In Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SynchronizationAspect#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SynchronizationAspect#getAutoDelete <em>Auto Delete</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SynchronizationAspect#getTimeBeforeRemoval <em>Time Before Removal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SynchronizationAspect#getSyncState <em>Sync State</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SynchronizationAspect()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SynchronizationAspect extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Sync Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SyncType describes the type of copy. 
	 * Mirror: a synchronized, full copy of the source. 
	 * Snapshot: a point-in-time, virtual copy of the source. 
	 * Clone: a point-in-time, full copy of the source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sync Type</em>' attribute.
	 * @see #setSyncType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SynchronizationAspect_SyncType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"..\",\"6\",\"7\",\"8\",\"..\",\"0x8000..\"]' Values='[\"DMTF Reserved\",\"Mirror\",\"Snapshot\",\"Clone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_Synchronized.SyncType\"]'"
	 * @generated
	 */
	Integer getSyncType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SynchronizationAspect#getSyncType <em>Sync Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Type</em>' attribute.
	 * @see #getSyncType()
	 * @generated
	 */
	void setSyncType(Integer value);

	/**
	 * Returns the value of the '<em><b>Consistency Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if consistency is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consistency Enabled</em>' attribute.
	 * @see #setConsistencyEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SynchronizationAspect_ConsistencyEnabled()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getConsistencyEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SynchronizationAspect#getConsistencyEnabled <em>Consistency Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistency Enabled</em>' attribute.
	 * @see #getConsistencyEnabled()
	 * @generated
	 */
	void setConsistencyEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Consistency Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the consistency type used by the groups. Sequentially Consistent: Members of a target group are sequentially consistent - the order of the write operations is maintained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consistency Type</em>' attribute.
	 * @see #setConsistencyType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SynchronizationAspect_ConsistencyType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"..\",\"0x8000..\"]' Values='[\"Sequentially Consistent\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getConsistencyType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SynchronizationAspect#getConsistencyType <em>Consistency Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistency Type</em>' attribute.
	 * @see #getConsistencyType()
	 * @generated
	 */
	void setConsistencyType(Integer value);

	/**
	 * Returns the value of the '<em><b>Copy Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the status of copy operation. Operation In Progress: Copy operation is in progress. 
	 * Operation Completed: The copy operation completed with no errors. 
	 * Initializing: Initialization is in progress. 
	 * Synchronizing: Synchronization is in progress. 
	 * Resyncing: Target element is being resynchronized. 
	 * Restoring: Restore operation is in progress. 
	 * Aborting: The copy operation is being aborted. 
	 * Terminating: The relationship is being terminated. 
	 * Mixed: Applies to groups with elements with different statuses. Generally, the individual statuses need to be examined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy Status</em>' attribute.
	 * @see #setCopyStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SynchronizationAspect_CopyStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"0x8000..\"]' Values='[\"Not Applicable\",\"Operation In Progress\",\"Operation Completed\",\"Initializing\",\"Synchronizing\",\"Resyncing\",\"Restoring\",\"Aborting\",\"Terminating\",\"Mixed\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getCopyStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SynchronizationAspect#getCopyStatus <em>Copy Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Status</em>' attribute.
	 * @see #getCopyStatus()
	 * @generated
	 */
	void setCopyStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Copy Methodology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the copy methodology utilized for copying source element to target element. 
	 * Full-Copy: The entire source data is copied to target. 
	 * Incremental-Copy: Only changed data from source element is copied to target element. 
	 * Differential-Copy: Only the new writes to source element are copied to the target element. 
	 * Copy-On-Write: Affected data is copied on the first write to the source or to the target elements. 
	 * Copy-On-Access: Affected data is copied on the first access to the source element. 
	 * Delta-Update: Difference based replication where after the initial copy, only updates to source are copied to target.
	 * Snap-And-Clone: The service creates a snapshot of the source element first, then uses the snapshot as the source of the copy operation to the target element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy Methodology</em>' attribute.
	 * @see #setCopyMethodology(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SynchronizationAspect_CopyMethodology()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"..\",\"0x8000..\"]' Values='[\"Other\",\"Implementation decides\",\"Full-Copy\",\"Incremental-Copy\",\"Differential-Copy\",\"Copy-On-Write\",\"Copy-On-Access\",\"Delta-Update\",\"Snap-And-Clone\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_ReplicationSettingData.DesiredCopyMethodology\"]'"
	 * @generated
	 */
	Integer getCopyMethodology();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SynchronizationAspect#getCopyMethodology <em>Copy Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Methodology</em>' attribute.
	 * @see #getCopyMethodology()
	 * @generated
	 */
	void setCopyMethodology(Integer value);

	/**
	 * Returns the value of the '<em><b>When Point In Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies when point-in-time was created. Shall be set to NULL if implementation is not capable of providing this information. A value of 0 indicates the information is not known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>When Point In Time</em>' attribute.
	 * @see #setWhenPointInTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SynchronizationAspect_WhenPointInTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getWhenPointInTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SynchronizationAspect#getWhenPointInTime <em>When Point In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Point In Time</em>' attribute.
	 * @see #getWhenPointInTime()
	 * @generated
	 */
	void setWhenPointInTime(String value);

	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifying information of source element (i.e. an instance ) of a copy operation, or of a point-in-time source. The identifying information is in the form of an object path encoded as a string parameter. The format of a CIMObjectPath, is <NamespacePath>:<ClassName>.<Prop1>="<Value1>", <Prop2>="<Value2>", . . . specifying an instance in the CIM Schema.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Element</em>' attribute.
	 * @see #setSourceElement(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SynchronizationAspect_SourceElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSourceElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SynchronizationAspect#getSourceElement <em>Source Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' attribute.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(String value);

	/**
	 * Returns the value of the '<em><b>Auto Delete</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The created element can be deleted if system resources are running low. If TimeBeforeRemoval is specified, this property is ignored, even if it is set to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Delete</em>' attribute.
	 * @see #setAutoDelete(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_SynchronizationAspect_AutoDelete()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' ModelCorrespondence='[\"CIM_SynchronizationAspect.TimeBeforeRemoval\"]'"
	 * @generated
	 */
	Boolean getAutoDelete();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SynchronizationAspect#getAutoDelete <em>Auto Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Delete</em>' attribute.
	 * @see #getAutoDelete()
	 * @generated
	 */
	void setAutoDelete(Boolean value);

	/**
	 * Returns the value of the '<em><b>Time Before Removal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of time that the element is retained. If non-null, the property AutoDelete is ignored. If null, there is no time limit, however, the element may be removed if AutoDelete is set to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Before Removal</em>' attribute.
	 * @see #setTimeBeforeRemoval(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SynchronizationAspect_TimeBeforeRemoval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Write='true' ModelCorrespondence='[\"CIM_SynchronizationAspect.AutoDelete\"]'"
	 * @generated
	 */
	String getTimeBeforeRemoval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SynchronizationAspect#getTimeBeforeRemoval <em>Time Before Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Before Removal</em>' attribute.
	 * @see #getTimeBeforeRemoval()
	 * @generated
	 */
	void setTimeBeforeRemoval(String value);

	/**
	 * Returns the value of the '<em><b>Sync State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SyncState describes the state of the synchronization aspect with respect to replication activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sync State</em>' attribute.
	 * @see #setSyncState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SynchronizationAspect_SyncState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Initialized\",\"Unsynchronized\",\"Synchronized\",\"Error\",\"Invalid\",\"Restored\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getSyncState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SynchronizationAspect#getSyncState <em>Sync State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync State</em>' attribute.
	 * @see #getSyncState()
	 * @generated
	 */
	void setSyncState(Integer value);

} // CIM_SynchronizationAspect

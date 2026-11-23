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
 * A representation of the model object '<em><b>CIM Replication Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains various options for use by the Replication Services methods to offer clients additional control in copy operations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getPairing <em>Pairing</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getUnequalGroupsAction <em>Unequal Groups Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getDesiredCopyMethodology <em>Desired Copy Methodology</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getTargetElementSupplier <em>Target Element Supplier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getThinProvisioningPolicy <em>Thin Provisioning Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getConsistentPointInTime <em>Consistent Point In Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getDeltaUpdateInterval <em>Delta Update Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getMultihop <em>Multihop</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getOnGroupOrListError <em>On Group Or List Error</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getCopyPriority <em>Copy Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getCopyRecoveryMode <em>Copy Recovery Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getDeltaUpdateBlocks <em>Delta Update Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getFailedCopyStopsHostIO <em>Failed Copy Stops Host IO</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getUnequalListsAction <em>Unequal Lists Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getStorageCompressionPolicy <em>Storage Compression Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getAutoDelete <em>Auto Delete</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getRRCHardwareCompressionEnabled <em>RRC Hardware Compression Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getRRCSoftwareCompressionEnabled <em>RRC Software Compression Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getTargetElementGoal <em>Target Element Goal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getTargetElementResourcePool <em>Target Element Resource Pool</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getTimeBeforeRemoval <em>Time Before Removal</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getConsistencyExempt <em>Consistency Exempt</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getConsistentAsyncCopy <em>Consistent Async Copy</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getDesiredRPO <em>Desired RPO</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ReplicationSettingData#getMaximumSkew <em>Maximum Skew</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.49.0' UMLPackagePath='CIM::Device::StorageServices' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_ReplicationSettingData extends CIM_SettingData {
	/**
	 * Returns the value of the '<em><b>Pairing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controls how source and target elements are paired. 
	 * Exact order: Parallel elements of source and target 
	 * groups paired in the order as they appear in the group. Optimum: If possible source and target elements on different data path or adapters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pairing</em>' attribute.
	 * @see #setPairing(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_Pairing()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Instrumentation decides\",\"Exact order\",\"Optimum\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getPairing();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getPairing <em>Pairing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pairing</em>' attribute.
	 * @see #getPairing()
	 * @generated
	 */
	void setPairing(Integer value);

	/**
	 * Returns the value of the '<em><b>Unequal Groups Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what should happen if the number of elements in source and target groups are not the same. The default is to return an error, unless one-to-many replication is supported and there is only one source and more than one target.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unequal Groups Action</em>' attribute.
	 * @see #setUnequalGroupsAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_UnequalGroupsAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Return an error\",\"Allow source group to be larger\",\"Allow target group to be larger\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getUnequalGroupsAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getUnequalGroupsAction <em>Unequal Groups Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unequal Groups Action</em>' attribute.
	 * @see #getUnequalGroupsAction()
	 * @generated
	 */
	void setUnequalGroupsAction(Integer value);

	/**
	 * Returns the value of the '<em><b>Desired Copy Methodology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control what copy methodology the service should use. For the most part, the service decides the best methodology based on the SyncType. However, an implementation may allow the client to suggest a different methodology. 
	 * Full-Copy: The entire source data is copied to target. 
	 * Incremental-Copy: Only changed data from source element is copied to target element. 
	 * Differential-Copy: Only the new writes to source element are copied to the target element. 
	 * Copy-On-Write: Affected data is copied on the first write to the source or to the target elements. 
	 * Copy-On-Access: Affected data is copied on the first access to the source element. 
	 * Delta-Update: Difference based replication where after the initial copy, only updates to source are copied to target. 
	 * Snap-And-Clone: The service creates a snapshot of the source element first, then uses the snapshot as the source of the copy operation to the target element. 
	 * Copy-before-Activation: Start copying data in the background before activation. 
	 * Redirect-On-Write: New writes to source or target elements are redirected to new locations and only metadata is updated to point to new data location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Desired Copy Methodology</em>' attribute.
	 * @see #setDesiredCopyMethodology(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_DesiredCopyMethodology()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"..\",\"0x8000..\"]' Values='[\"Other\",\"Instrumentation decides\",\"Full-Copy\",\"Incremental-Copy\",\"Differential-Copy\",\"Copy-On-Write\",\"Copy-On-Access\",\"Delta-Update\",\"Snap-And-Clone\",\"Copy-before-Activation\",\"Redirect-On-Write\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getDesiredCopyMethodology();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getDesiredCopyMethodology <em>Desired Copy Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired Copy Methodology</em>' attribute.
	 * @see #getDesiredCopyMethodology()
	 * @generated
	 */
	void setDesiredCopyMethodology(Integer value);

	/**
	 * Returns the value of the '<em><b>Target Element Supplier</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If target elements are not supplied, this property indicates where the target elements should come from. Possible values are: 
	 * Use existing ones: Use existing elements only. If appropriate elements are not available, return an error. 
	 * Create new ones: Create new target elements only. Use existing and create new ones: If appropriate elements are not available, create new target elements. 
	 * Instrumentation decides: Vendor specific action.
	 * Client must supply: Client must supply target element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Element Supplier</em>' attribute.
	 * @see #setTargetElementSupplier(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_TargetElementSupplier()
	 * @model default="4"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Use existing\",\"Create new\",\"Use and create\",\"Instrumentation decides\",\"Client must supply\",\"DMTF Reserved\",\"Vendor specific\"]'"
	 * @generated
	 */
	Integer getTargetElementSupplier();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getTargetElementSupplier <em>Target Element Supplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element Supplier</em>' attribute.
	 * @see #getTargetElementSupplier()
	 * @generated
	 */
	void setTargetElementSupplier(Integer value);

	/**
	 * Returns the value of the '<em><b>Thin Provisioning Policy</b></em>' attribute.
	 * The default value is <code>"7"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the target element is not supplied, this property specifies the provisioning of the target element. 
	 * Copy thin source to thin target: Thin source gets copied to thin target. 
	 * Copy thin source to full target: Thin source gets copied to full target. 
	 * Copy full source to thin target: Full source gets copied to thin target. 
	 * Provisioning of target same as source: Provisioning of target will be the same as source. 
	 * Target pool decides provisioning of target element: The pool where the target is allocated from determines the provisioning of the target element. 
	 * Implementation decides provisioning of target: The implementation decides the provisioning of the created target elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thin Provisioning Policy</em>' attribute.
	 * @see #setThinProvisioningPolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_ThinProvisioningPolicy()
	 * @model default="7"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Copy thin source to thin target\",\"Copy thin source to full target\",\"Copy full source to thin target\",\"Provisioning of target same as source\",\"Target pool decides provisioning of target element\",\"Implementation decides provisioning of target\",\"DMTF Reserved\",\"Vendor specific\"]'"
	 * @generated
	 */
	Integer getThinProvisioningPolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getThinProvisioningPolicy <em>Thin Provisioning Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thin Provisioning Policy</em>' attribute.
	 * @see #getThinProvisioningPolicy()
	 * @generated
	 */
	void setThinProvisioningPolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Consistent Point In Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property applies to a group of elements. If it is true, it means the point-in-time to be created at an exact time with no I/O activities in such a way the data is consistent among all the elements of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consistent Point In Time</em>' attribute.
	 * @see #setConsistentPointInTime(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_ConsistentPointInTime()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getConsistentPointInTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getConsistentPointInTime <em>Consistent Point In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistent Point In Time</em>' attribute.
	 * @see #getConsistentPointInTime()
	 * @generated
	 */
	void setConsistentPointInTime(Boolean value);

	/**
	 * Returns the value of the '<em><b>Delta Update Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property applies to Delta-Update copy methodology. It specifies the interval between the snapshots of source element, for example, every 23 minutes will have the value of 00000000002300.000000:000, using the CIM interval format. If NULL or 0, the implementation decides the interval.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Update Interval</em>' attribute.
	 * @see #setDeltaUpdateInterval(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_DeltaUpdateInterval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Write='true'"
	 * @generated
	 */
	String getDeltaUpdateInterval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getDeltaUpdateInterval <em>Delta Update Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Update Interval</em>' attribute.
	 * @see #getDeltaUpdateInterval()
	 * @generated
	 */
	void setDeltaUpdateInterval(String value);

	/**
	 * Returns the value of the '<em><b>Multihop</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property applies to multihop copy operation. It specifies the number of hops the starting source (or group) element is expected to be copied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multihop</em>' attribute.
	 * @see #setMultihop(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_Multihop()
	 * @model default="1"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true'"
	 * @generated
	 */
	Integer getMultihop();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getMultihop <em>Multihop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multihop</em>' attribute.
	 * @see #getMultihop()
	 * @generated
	 */
	void setMultihop(Integer value);

	/**
	 * Returns the value of the '<em><b>On Group Or List Error</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property applies to group or list operations. It specifies what the implementation should do if an error is encountered before all entries in the group or list are processed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>On Group Or List Error</em>' attribute.
	 * @see #setOnGroupOrListError(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_OnGroupOrListError()
	 * @model default="3"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Continue\",\"Stop\",\"DMTF Reserved\",\"Vendor specific\"]'"
	 * @generated
	 */
	Integer getOnGroupOrListError();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getOnGroupOrListError <em>On Group Or List Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Group Or List Error</em>' attribute.
	 * @see #getOnGroupOrListError()
	 * @generated
	 */
	void setOnGroupOrListError(Integer value);

	/**
	 * Returns the value of the '<em><b>Copy Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property sets the StorageSynchronized.CopyPriority property. CopyPriority allows the priority of background copy operation to be managed relative to host I/O operations during a sequential background copy operation. 
	 * Values are: Low: copy operation lower priority than host I/O. Same: copy operation has the same priority as host I/O. High: copy operation has higher priority than host I/O. Urgent: copy operation to be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy Priority</em>' attribute.
	 * @see #setCopyPriority(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_CopyPriority()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Not Managed\",\"Low\",\"Same\",\"High\",\"Urgent\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getCopyPriority();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getCopyPriority <em>Copy Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Priority</em>' attribute.
	 * @see #getCopyPriority()
	 * @generated
	 */
	void setCopyPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>Copy Recovery Mode</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to Automatic, the copy operation to continue after a broken link is restored. Automatic: copy operation to resume automatically. 
	 * Manual: CopyState is to be set to Suspended after the link is restored. It is required to issue the Resume operation to continue. 
	 * If not specified, the implementation decides.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Copy Recovery Mode</em>' attribute.
	 * @see #setCopyRecoveryMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_CopyRecoveryMode()
	 * @model default="4"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Unknown\",\"Automatic\",\"Manual\",\"Implementation decides\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getCopyRecoveryMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getCopyRecoveryMode <em>Copy Recovery Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy Recovery Mode</em>' attribute.
	 * @see #getCopyRecoveryMode()
	 * @generated
	 */
	void setCopyRecoveryMode(Integer value);

	/**
	 * Returns the value of the '<em><b>Delta Update Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property applies to Delta-Update copy methodology. If non-zero, it specifies the snapshots of source element should be created after this number of blocks have been modified. If both DeltaUpdateBlocks and DeltaUpdateInterval are specified the snapshot is created based on which criterion occurs first. If NULL or 0, the implementation decides the number of blocks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Update Blocks</em>' attribute.
	 * @see #setDeltaUpdateBlocks(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_DeltaUpdateBlocks()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Write='true'"
	 * @generated
	 */
	Long getDeltaUpdateBlocks();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getDeltaUpdateBlocks <em>Delta Update Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Update Blocks</em>' attribute.
	 * @see #getDeltaUpdateBlocks()
	 * @generated
	 */
	void setDeltaUpdateBlocks(Long value);

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
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_FailedCopyStopsHostIO()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getFailedCopyStopsHostIO();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getFailedCopyStopsHostIO <em>Failed Copy Stops Host IO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failed Copy Stops Host IO</em>' attribute.
	 * @see #getFailedCopyStopsHostIO()
	 * @generated
	 */
	void setFailedCopyStopsHostIO(Boolean value);

	/**
	 * Returns the value of the '<em><b>Unequal Lists Action</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates what should happen if number of elements in source and target lists are not the same. The default is to return an error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unequal Lists Action</em>' attribute.
	 * @see #setUnequalListsAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_UnequalListsAction()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"Return an error\",\"Allow source list to be larger\",\"Allow target list to be larger\",\"DMTF Reserved\",\"Vendor Specific\"]'"
	 * @generated
	 */
	Integer getUnequalListsAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getUnequalListsAction <em>Unequal Lists Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unequal Lists Action</em>' attribute.
	 * @see #getUnequalListsAction()
	 * @generated
	 */
	void setUnequalListsAction(Integer value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies whether the source, the target, or both elements should be "read only" to the host.SystemElement: The source element. 
	 * SyncedElement: The target element. 
	 * Both: Both the source and the target elements.should be read only to the host.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_ReadOnly()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\",\"..\",\"0x8000..\"]' Values='[\"SystemElement\",\"SyncedElement\",\"Both\",\"DMTF Reserved\",\"Vendor Specific\"]' ModelCorrespondence='[\"CIM_StorageSynchronized.ReadOnly\"]'"
	 * @generated
	 */
	Integer getReadOnly();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #getReadOnly()
	 * @generated
	 */
	void setReadOnly(Integer value);

	/**
	 * Returns the value of the '<em><b>Storage Compression Policy</b></em>' attribute.
	 * The default value is <code>"7"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the target element is not supplied, this property specifies the compression of the target element. 
	 * Compressed source to compressed target: Compressed source gets copied to compressed target. 
	 * Compressed source to uncompressed target: Compressed source gets copied to uncompressed target. 
	 * Uncompressed source to compressed target: Uncompressed source gets copied to compressed target. 
	 * Compression of target same as source: Compression of target will be the same as source. 
	 * Target pool decides compression of target element: The pool where the target is allocated from determines the compression of the target element. 
	 * Implementation decides compression of target: The implementation decides the compression of the created target elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage Compression Policy</em>' attribute.
	 * @see #setStorageCompressionPolicy(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_StorageCompressionPolicy()
	 * @model default="7"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"..\",\"0x8000..\"]' Values='[\"Compressed source to compressed target\",\"Compressed source to uncompressed target\",\"Uncompressed source to compressed target\",\"Compression of target same as source\",\"Target pool decides compression of target element\",\"Implementation decides compression of target\",\"DMTF Reserved\",\"Vendor specific\"]'"
	 * @generated
	 */
	Integer getStorageCompressionPolicy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getStorageCompressionPolicy <em>Storage Compression Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Compression Policy</em>' attribute.
	 * @see #getStorageCompressionPolicy()
	 * @generated
	 */
	void setStorageCompressionPolicy(Integer value);

	/**
	 * Returns the value of the '<em><b>Auto Delete</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The created element can be deleted if system resources are running low.If TimeBeforeRemoval is specified, this property is ignored, even if it is set to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Delete</em>' attribute.
	 * @see #setAutoDelete(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_AutoDelete()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' ModelCorrespondence='[\"CIM_SynchronizationAspect.AutoDelete\"]'"
	 * @generated
	 */
	Boolean getAutoDelete();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getAutoDelete <em>Auto Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Delete</em>' attribute.
	 * @see #getAutoDelete()
	 * @generated
	 */
	void setAutoDelete(Boolean value);

	/**
	 * Returns the value of the '<em><b>RRC Hardware Compression Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property indicates if hardware compression is enabled -- the transmitted/received data is compressed by hardware.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RRC Hardware Compression Enabled</em>' attribute.
	 * @see #setRRCHardwareCompressionEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_RRCHardwareCompressionEnabled()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' ModelCorrespondence='[\"CIM_RemoteReplicationCollection.HardwareCompressionEnabled\"]'"
	 * @generated
	 */
	Boolean getRRCHardwareCompressionEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getRRCHardwareCompressionEnabled <em>RRC Hardware Compression Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RRC Hardware Compression Enabled</em>' attribute.
	 * @see #getRRCHardwareCompressionEnabled()
	 * @generated
	 */
	void setRRCHardwareCompressionEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>RRC Software Compression Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property indicates if software compression is enabled -- the transmitted/received data is compressed by software.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RRC Software Compression Enabled</em>' attribute.
	 * @see #setRRCSoftwareCompressionEnabled(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_RRCSoftwareCompressionEnabled()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true' ModelCorrespondence='[\"CIM_RemoteReplicationCollection.SoftwareCompressionEnabled\"]'"
	 * @generated
	 */
	Boolean getRRCSoftwareCompressionEnabled();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getRRCSoftwareCompressionEnabled <em>RRC Software Compression Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RRC Software Compression Enabled</em>' attribute.
	 * @see #getRRCSoftwareCompressionEnabled()
	 * @generated
	 */
	void setRRCSoftwareCompressionEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Target Element Goal</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the target element goal is not supplied and the implementation is expected to create the target element, the instrumentation selects the goal based on this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Element Goal</em>' attribute.
	 * @see #setTargetElementGoal(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_TargetElementGoal()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Implementation decides\",\"Same as source element\",\"DMTF Reserved\",\"Vendor specific\"]'"
	 * @generated
	 */
	Integer getTargetElementGoal();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getTargetElementGoal <em>Target Element Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element Goal</em>' attribute.
	 * @see #getTargetElementGoal()
	 * @generated
	 */
	void setTargetElementGoal(Integer value);

	/**
	 * Returns the value of the '<em><b>Target Element Resource Pool</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the target element resource pool is not supplied and the implementation is expected to create or locate the target element, the instrumentation selects the resource pool based on this property. 
	 * Same as source element: Can only apply to target elements that do not require specialized resource pools. For example, snapshots may require a specialized resource pool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Element Resource Pool</em>' attribute.
	 * @see #setTargetElementResourcePool(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_TargetElementResourcePool()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"2\",\"3\",\"..\",\"0x8000..\"]' Values='[\"Implementation decides\",\"Same as source element\",\"DMTF Reserved\",\"Vendor specific\"]'"
	 * @generated
	 */
	Integer getTargetElementResourcePool();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getTargetElementResourcePool <em>Target Element Resource Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element Resource Pool</em>' attribute.
	 * @see #getTargetElementResourcePool()
	 * @generated
	 */
	void setTargetElementResourcePool(Integer value);

	/**
	 * Returns the value of the '<em><b>Time Before Removal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount of time that the element is retained. If non-null, The AutoDelete property is ignored. If null, there is no time limit, however, the element may be removed if AutoDelete is set to true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Before Removal</em>' attribute.
	 * @see #setTimeBeforeRemoval(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_TimeBeforeRemoval()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Write='true' ModelCorrespondence='[\"CIM_SynchronizationAspect.TimeBeforeRemoval\"]'"
	 * @generated
	 */
	String getTimeBeforeRemoval();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getTimeBeforeRemoval <em>Time Before Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Before Removal</em>' attribute.
	 * @see #getTimeBeforeRemoval()
	 * @generated
	 */
	void setTimeBeforeRemoval(String value);

	/**
	 * Returns the value of the '<em><b>Consistency Exempt</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, it indicates the new elements being added to a group of replication relationships -- for example, by the AddSyncPair operation -- do not participate in the consistency collection. Useful for a group of volumes belonging to an application, however, not all volumes of the application need to be part of the consistency set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consistency Exempt</em>' attribute.
	 * @see #setConsistencyExempt(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_ConsistencyExempt()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getConsistencyExempt();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getConsistencyExempt <em>Consistency Exempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistency Exempt</em>' attribute.
	 * @see #getConsistencyExempt()
	 * @generated
	 */
	void setConsistencyExempt(Boolean value);

	/**
	 * Returns the value of the '<em><b>Consistent Async Copy</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, it indicates consistency to be requested for a single source and target volumes (not necessarily in replication groups). This is useful for implementations that use an intermediate snapshot of the source element, and then, asynchronously copy the data from the snapshot to the target element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Consistent Async Copy</em>' attribute.
	 * @see #setConsistentAsyncCopy(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_ConsistentAsyncCopy()
	 * @model default="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Write='true'"
	 * @generated
	 */
	Boolean getConsistentAsyncCopy();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getConsistentAsyncCopy <em>Consistent Async Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistent Async Copy</em>' attribute.
	 * @see #getConsistentAsyncCopy()
	 * @generated
	 */
	void setConsistentAsyncCopy(Boolean value);

	/**
	 * Returns the value of the '<em><b>Desired RPO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Recovery Point Objective indicates the maximum interval in which data might be lost. For synchronous copy operations, RPO is 0. For asynchronous copy operations RPO represents the interval since the most recent transmission of data to the target element. 
	 * For example, to indicate 15 seconds, the value would be 00000000000015.000000:000, using the CIM interval format. If NULL, the implementation decides the interval if RPO is applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Desired RPO</em>' attribute.
	 * @see #setDesiredRPO(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_DesiredRPO()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Write='true' ModelCorrespondence='[\"CIM_Synchronized.RPO\"]'"
	 * @generated
	 */
	String getDesiredRPO();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getDesiredRPO <em>Desired RPO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desired RPO</em>' attribute.
	 * @see #getDesiredRPO()
	 * @generated
	 */
	void setDesiredRPO(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Skew</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies to Adaptive mode and it describes maximum number of bytes the SyncedElement (target) can be out of sync. If the number of out-of-sync bytes exceeds the skew value, mode is switched to synchronous.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Skew</em>' attribute.
	 * @see #setMaximumSkew(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_ReplicationSettingData_MaximumSkew()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_Synchronized.Skew\"]'"
	 * @generated
	 */
	Long getMaximumSkew();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ReplicationSettingData#getMaximumSkew <em>Maximum Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Skew</em>' attribute.
	 * @see #getMaximumSkew()
	 * @generated
	 */
	void setMaximumSkew(Long value);

} // CIM_ReplicationSettingData

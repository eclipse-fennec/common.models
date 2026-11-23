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

import org.dmtf.cim.CIM_ReplicationSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Replication Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getPairing <em>Pairing</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getUnequalGroupsAction <em>Unequal Groups Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getDesiredCopyMethodology <em>Desired Copy Methodology</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getTargetElementSupplier <em>Target Element Supplier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getThinProvisioningPolicy <em>Thin Provisioning Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getConsistentPointInTime <em>Consistent Point In Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getDeltaUpdateInterval <em>Delta Update Interval</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getMultihop <em>Multihop</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getOnGroupOrListError <em>On Group Or List Error</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getCopyPriority <em>Copy Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getCopyRecoveryMode <em>Copy Recovery Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getDeltaUpdateBlocks <em>Delta Update Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getFailedCopyStopsHostIO <em>Failed Copy Stops Host IO</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getUnequalListsAction <em>Unequal Lists Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getStorageCompressionPolicy <em>Storage Compression Policy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getAutoDelete <em>Auto Delete</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getRRCHardwareCompressionEnabled <em>RRC Hardware Compression Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getRRCSoftwareCompressionEnabled <em>RRC Software Compression Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getTargetElementGoal <em>Target Element Goal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getTargetElementResourcePool <em>Target Element Resource Pool</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getTimeBeforeRemoval <em>Time Before Removal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getConsistencyExempt <em>Consistency Exempt</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getConsistentAsyncCopy <em>Consistent Async Copy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getDesiredRPO <em>Desired RPO</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicationSettingDataImpl#getMaximumSkew <em>Maximum Skew</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ReplicationSettingDataImpl extends CIM_SettingDataImpl implements CIM_ReplicationSettingData {
	/**
	 * The default value of the '{@link #getPairing() <em>Pairing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPairing()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PAIRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPairing() <em>Pairing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPairing()
	 * @generated
	 * @ordered
	 */
	protected Integer pairing = PAIRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnequalGroupsAction() <em>Unequal Groups Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnequalGroupsAction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UNEQUAL_GROUPS_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnequalGroupsAction() <em>Unequal Groups Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnequalGroupsAction()
	 * @generated
	 * @ordered
	 */
	protected Integer unequalGroupsAction = UNEQUAL_GROUPS_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesiredCopyMethodology() <em>Desired Copy Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredCopyMethodology()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DESIRED_COPY_METHODOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesiredCopyMethodology() <em>Desired Copy Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredCopyMethodology()
	 * @generated
	 * @ordered
	 */
	protected Integer desiredCopyMethodology = DESIRED_COPY_METHODOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetElementSupplier() <em>Target Element Supplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElementSupplier()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_ELEMENT_SUPPLIER_EDEFAULT = Integer.valueOf(4);

	/**
	 * The cached value of the '{@link #getTargetElementSupplier() <em>Target Element Supplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElementSupplier()
	 * @generated
	 * @ordered
	 */
	protected Integer targetElementSupplier = TARGET_ELEMENT_SUPPLIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getThinProvisioningPolicy() <em>Thin Provisioning Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinProvisioningPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer THIN_PROVISIONING_POLICY_EDEFAULT = Integer.valueOf(7);

	/**
	 * The cached value of the '{@link #getThinProvisioningPolicy() <em>Thin Provisioning Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinProvisioningPolicy()
	 * @generated
	 * @ordered
	 */
	protected Integer thinProvisioningPolicy = THIN_PROVISIONING_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsistentPointInTime() <em>Consistent Point In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistentPointInTime()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONSISTENT_POINT_IN_TIME_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getConsistentPointInTime() <em>Consistent Point In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistentPointInTime()
	 * @generated
	 * @ordered
	 */
	protected Boolean consistentPointInTime = CONSISTENT_POINT_IN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeltaUpdateInterval() <em>Delta Update Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaUpdateInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String DELTA_UPDATE_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaUpdateInterval() <em>Delta Update Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaUpdateInterval()
	 * @generated
	 * @ordered
	 */
	protected String deltaUpdateInterval = DELTA_UPDATE_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultihop() <em>Multihop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultihop()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MULTIHOP_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getMultihop() <em>Multihop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultihop()
	 * @generated
	 * @ordered
	 */
	protected Integer multihop = MULTIHOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnGroupOrListError() <em>On Group Or List Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnGroupOrListError()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ON_GROUP_OR_LIST_ERROR_EDEFAULT = Integer.valueOf(3);

	/**
	 * The cached value of the '{@link #getOnGroupOrListError() <em>On Group Or List Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnGroupOrListError()
	 * @generated
	 * @ordered
	 */
	protected Integer onGroupOrListError = ON_GROUP_OR_LIST_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyPriority() <em>Copy Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COPY_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyPriority() <em>Copy Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer copyPriority = COPY_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCopyRecoveryMode() <em>Copy Recovery Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRecoveryMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COPY_RECOVERY_MODE_EDEFAULT = Integer.valueOf(4);

	/**
	 * The cached value of the '{@link #getCopyRecoveryMode() <em>Copy Recovery Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyRecoveryMode()
	 * @generated
	 * @ordered
	 */
	protected Integer copyRecoveryMode = COPY_RECOVERY_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeltaUpdateBlocks() <em>Delta Update Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaUpdateBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final Long DELTA_UPDATE_BLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaUpdateBlocks() <em>Delta Update Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaUpdateBlocks()
	 * @generated
	 * @ordered
	 */
	protected Long deltaUpdateBlocks = DELTA_UPDATE_BLOCKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailedCopyStopsHostIO() <em>Failed Copy Stops Host IO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedCopyStopsHostIO()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FAILED_COPY_STOPS_HOST_IO_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getFailedCopyStopsHostIO() <em>Failed Copy Stops Host IO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedCopyStopsHostIO()
	 * @generated
	 * @ordered
	 */
	protected Boolean failedCopyStopsHostIO = FAILED_COPY_STOPS_HOST_IO_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnequalListsAction() <em>Unequal Lists Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnequalListsAction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UNEQUAL_LISTS_ACTION_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getUnequalListsAction() <em>Unequal Lists Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnequalListsAction()
	 * @generated
	 * @ordered
	 */
	protected Integer unequalListsAction = UNEQUAL_LISTS_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Integer READ_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Integer readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageCompressionPolicy() <em>Storage Compression Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageCompressionPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STORAGE_COMPRESSION_POLICY_EDEFAULT = Integer.valueOf(7);

	/**
	 * The cached value of the '{@link #getStorageCompressionPolicy() <em>Storage Compression Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageCompressionPolicy()
	 * @generated
	 * @ordered
	 */
	protected Integer storageCompressionPolicy = STORAGE_COMPRESSION_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoDelete() <em>Auto Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoDelete()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_DELETE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAutoDelete() <em>Auto Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoDelete()
	 * @generated
	 * @ordered
	 */
	protected Boolean autoDelete = AUTO_DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRRCHardwareCompressionEnabled() <em>RRC Hardware Compression Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRRCHardwareCompressionEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RRC_HARDWARE_COMPRESSION_ENABLED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getRRCHardwareCompressionEnabled() <em>RRC Hardware Compression Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRRCHardwareCompressionEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean rrcHardwareCompressionEnabled = RRC_HARDWARE_COMPRESSION_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRRCSoftwareCompressionEnabled() <em>RRC Software Compression Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRRCSoftwareCompressionEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RRC_SOFTWARE_COMPRESSION_ENABLED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getRRCSoftwareCompressionEnabled() <em>RRC Software Compression Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRRCSoftwareCompressionEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean rrcSoftwareCompressionEnabled = RRC_SOFTWARE_COMPRESSION_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetElementGoal() <em>Target Element Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElementGoal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_ELEMENT_GOAL_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getTargetElementGoal() <em>Target Element Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElementGoal()
	 * @generated
	 * @ordered
	 */
	protected Integer targetElementGoal = TARGET_ELEMENT_GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetElementResourcePool() <em>Target Element Resource Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElementResourcePool()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_ELEMENT_RESOURCE_POOL_EDEFAULT = Integer.valueOf(2);

	/**
	 * The cached value of the '{@link #getTargetElementResourcePool() <em>Target Element Resource Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElementResourcePool()
	 * @generated
	 * @ordered
	 */
	protected Integer targetElementResourcePool = TARGET_ELEMENT_RESOURCE_POOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeBeforeRemoval() <em>Time Before Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBeforeRemoval()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_BEFORE_REMOVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeBeforeRemoval() <em>Time Before Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeBeforeRemoval()
	 * @generated
	 * @ordered
	 */
	protected String timeBeforeRemoval = TIME_BEFORE_REMOVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsistencyExempt() <em>Consistency Exempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistencyExempt()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONSISTENCY_EXEMPT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getConsistencyExempt() <em>Consistency Exempt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistencyExempt()
	 * @generated
	 * @ordered
	 */
	protected Boolean consistencyExempt = CONSISTENCY_EXEMPT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsistentAsyncCopy() <em>Consistent Async Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistentAsyncCopy()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONSISTENT_ASYNC_COPY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getConsistentAsyncCopy() <em>Consistent Async Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistentAsyncCopy()
	 * @generated
	 * @ordered
	 */
	protected Boolean consistentAsyncCopy = CONSISTENT_ASYNC_COPY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesiredRPO() <em>Desired RPO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredRPO()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIRED_RPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesiredRPO() <em>Desired RPO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesiredRPO()
	 * @generated
	 * @ordered
	 */
	protected String desiredRPO = DESIRED_RPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumSkew() <em>Maximum Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSkew()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAXIMUM_SKEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumSkew() <em>Maximum Skew</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSkew()
	 * @generated
	 * @ordered
	 */
	protected Long maximumSkew = MAXIMUM_SKEW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ReplicationSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ReplicationSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPairing() {
		return pairing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPairing(Integer newPairing) {
		Integer oldPairing = pairing;
		pairing = newPairing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__PAIRING, oldPairing, pairing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUnequalGroupsAction() {
		return unequalGroupsAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnequalGroupsAction(Integer newUnequalGroupsAction) {
		Integer oldUnequalGroupsAction = unequalGroupsAction;
		unequalGroupsAction = newUnequalGroupsAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__UNEQUAL_GROUPS_ACTION, oldUnequalGroupsAction, unequalGroupsAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDesiredCopyMethodology() {
		return desiredCopyMethodology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesiredCopyMethodology(Integer newDesiredCopyMethodology) {
		Integer oldDesiredCopyMethodology = desiredCopyMethodology;
		desiredCopyMethodology = newDesiredCopyMethodology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__DESIRED_COPY_METHODOLOGY, oldDesiredCopyMethodology, desiredCopyMethodology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTargetElementSupplier() {
		return targetElementSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetElementSupplier(Integer newTargetElementSupplier) {
		Integer oldTargetElementSupplier = targetElementSupplier;
		targetElementSupplier = newTargetElementSupplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__TARGET_ELEMENT_SUPPLIER, oldTargetElementSupplier, targetElementSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getThinProvisioningPolicy() {
		return thinProvisioningPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThinProvisioningPolicy(Integer newThinProvisioningPolicy) {
		Integer oldThinProvisioningPolicy = thinProvisioningPolicy;
		thinProvisioningPolicy = newThinProvisioningPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__THIN_PROVISIONING_POLICY, oldThinProvisioningPolicy, thinProvisioningPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getConsistentPointInTime() {
		return consistentPointInTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsistentPointInTime(Boolean newConsistentPointInTime) {
		Boolean oldConsistentPointInTime = consistentPointInTime;
		consistentPointInTime = newConsistentPointInTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__CONSISTENT_POINT_IN_TIME, oldConsistentPointInTime, consistentPointInTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeltaUpdateInterval() {
		return deltaUpdateInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltaUpdateInterval(String newDeltaUpdateInterval) {
		String oldDeltaUpdateInterval = deltaUpdateInterval;
		deltaUpdateInterval = newDeltaUpdateInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__DELTA_UPDATE_INTERVAL, oldDeltaUpdateInterval, deltaUpdateInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMultihop() {
		return multihop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultihop(Integer newMultihop) {
		Integer oldMultihop = multihop;
		multihop = newMultihop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__MULTIHOP, oldMultihop, multihop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOnGroupOrListError() {
		return onGroupOrListError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnGroupOrListError(Integer newOnGroupOrListError) {
		Integer oldOnGroupOrListError = onGroupOrListError;
		onGroupOrListError = newOnGroupOrListError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__ON_GROUP_OR_LIST_ERROR, oldOnGroupOrListError, onGroupOrListError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCopyPriority() {
		return copyPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyPriority(Integer newCopyPriority) {
		Integer oldCopyPriority = copyPriority;
		copyPriority = newCopyPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__COPY_PRIORITY, oldCopyPriority, copyPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCopyRecoveryMode() {
		return copyRecoveryMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCopyRecoveryMode(Integer newCopyRecoveryMode) {
		Integer oldCopyRecoveryMode = copyRecoveryMode;
		copyRecoveryMode = newCopyRecoveryMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__COPY_RECOVERY_MODE, oldCopyRecoveryMode, copyRecoveryMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDeltaUpdateBlocks() {
		return deltaUpdateBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltaUpdateBlocks(Long newDeltaUpdateBlocks) {
		Long oldDeltaUpdateBlocks = deltaUpdateBlocks;
		deltaUpdateBlocks = newDeltaUpdateBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__DELTA_UPDATE_BLOCKS, oldDeltaUpdateBlocks, deltaUpdateBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFailedCopyStopsHostIO() {
		return failedCopyStopsHostIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailedCopyStopsHostIO(Boolean newFailedCopyStopsHostIO) {
		Boolean oldFailedCopyStopsHostIO = failedCopyStopsHostIO;
		failedCopyStopsHostIO = newFailedCopyStopsHostIO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__FAILED_COPY_STOPS_HOST_IO, oldFailedCopyStopsHostIO, failedCopyStopsHostIO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUnequalListsAction() {
		return unequalListsAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnequalListsAction(Integer newUnequalListsAction) {
		Integer oldUnequalListsAction = unequalListsAction;
		unequalListsAction = newUnequalListsAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__UNEQUAL_LISTS_ACTION, oldUnequalListsAction, unequalListsAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnly(Integer newReadOnly) {
		Integer oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStorageCompressionPolicy() {
		return storageCompressionPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageCompressionPolicy(Integer newStorageCompressionPolicy) {
		Integer oldStorageCompressionPolicy = storageCompressionPolicy;
		storageCompressionPolicy = newStorageCompressionPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__STORAGE_COMPRESSION_POLICY, oldStorageCompressionPolicy, storageCompressionPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutoDelete() {
		return autoDelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoDelete(Boolean newAutoDelete) {
		Boolean oldAutoDelete = autoDelete;
		autoDelete = newAutoDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__AUTO_DELETE, oldAutoDelete, autoDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRRCHardwareCompressionEnabled() {
		return rrcHardwareCompressionEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRRCHardwareCompressionEnabled(Boolean newRRCHardwareCompressionEnabled) {
		Boolean oldRRCHardwareCompressionEnabled = rrcHardwareCompressionEnabled;
		rrcHardwareCompressionEnabled = newRRCHardwareCompressionEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__RRC_HARDWARE_COMPRESSION_ENABLED, oldRRCHardwareCompressionEnabled, rrcHardwareCompressionEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRRCSoftwareCompressionEnabled() {
		return rrcSoftwareCompressionEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRRCSoftwareCompressionEnabled(Boolean newRRCSoftwareCompressionEnabled) {
		Boolean oldRRCSoftwareCompressionEnabled = rrcSoftwareCompressionEnabled;
		rrcSoftwareCompressionEnabled = newRRCSoftwareCompressionEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__RRC_SOFTWARE_COMPRESSION_ENABLED, oldRRCSoftwareCompressionEnabled, rrcSoftwareCompressionEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTargetElementGoal() {
		return targetElementGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetElementGoal(Integer newTargetElementGoal) {
		Integer oldTargetElementGoal = targetElementGoal;
		targetElementGoal = newTargetElementGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__TARGET_ELEMENT_GOAL, oldTargetElementGoal, targetElementGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTargetElementResourcePool() {
		return targetElementResourcePool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetElementResourcePool(Integer newTargetElementResourcePool) {
		Integer oldTargetElementResourcePool = targetElementResourcePool;
		targetElementResourcePool = newTargetElementResourcePool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__TARGET_ELEMENT_RESOURCE_POOL, oldTargetElementResourcePool, targetElementResourcePool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeBeforeRemoval() {
		return timeBeforeRemoval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeBeforeRemoval(String newTimeBeforeRemoval) {
		String oldTimeBeforeRemoval = timeBeforeRemoval;
		timeBeforeRemoval = newTimeBeforeRemoval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__TIME_BEFORE_REMOVAL, oldTimeBeforeRemoval, timeBeforeRemoval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getConsistencyExempt() {
		return consistencyExempt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsistencyExempt(Boolean newConsistencyExempt) {
		Boolean oldConsistencyExempt = consistencyExempt;
		consistencyExempt = newConsistencyExempt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__CONSISTENCY_EXEMPT, oldConsistencyExempt, consistencyExempt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getConsistentAsyncCopy() {
		return consistentAsyncCopy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsistentAsyncCopy(Boolean newConsistentAsyncCopy) {
		Boolean oldConsistentAsyncCopy = consistentAsyncCopy;
		consistentAsyncCopy = newConsistentAsyncCopy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__CONSISTENT_ASYNC_COPY, oldConsistentAsyncCopy, consistentAsyncCopy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDesiredRPO() {
		return desiredRPO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesiredRPO(String newDesiredRPO) {
		String oldDesiredRPO = desiredRPO;
		desiredRPO = newDesiredRPO;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__DESIRED_RPO, oldDesiredRPO, desiredRPO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaximumSkew() {
		return maximumSkew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumSkew(Long newMaximumSkew) {
		Long oldMaximumSkew = maximumSkew;
		maximumSkew = newMaximumSkew;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICATION_SETTING_DATA__MAXIMUM_SKEW, oldMaximumSkew, maximumSkew));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_REPLICATION_SETTING_DATA__PAIRING:
				return getPairing();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__UNEQUAL_GROUPS_ACTION:
				return getUnequalGroupsAction();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DESIRED_COPY_METHODOLOGY:
				return getDesiredCopyMethodology();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TARGET_ELEMENT_SUPPLIER:
				return getTargetElementSupplier();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__THIN_PROVISIONING_POLICY:
				return getThinProvisioningPolicy();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__CONSISTENT_POINT_IN_TIME:
				return getConsistentPointInTime();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DELTA_UPDATE_INTERVAL:
				return getDeltaUpdateInterval();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__MULTIHOP:
				return getMultihop();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__ON_GROUP_OR_LIST_ERROR:
				return getOnGroupOrListError();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__COPY_PRIORITY:
				return getCopyPriority();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__COPY_RECOVERY_MODE:
				return getCopyRecoveryMode();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DELTA_UPDATE_BLOCKS:
				return getDeltaUpdateBlocks();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__FAILED_COPY_STOPS_HOST_IO:
				return getFailedCopyStopsHostIO();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__UNEQUAL_LISTS_ACTION:
				return getUnequalListsAction();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__READ_ONLY:
				return getReadOnly();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__STORAGE_COMPRESSION_POLICY:
				return getStorageCompressionPolicy();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__AUTO_DELETE:
				return getAutoDelete();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__RRC_HARDWARE_COMPRESSION_ENABLED:
				return getRRCHardwareCompressionEnabled();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__RRC_SOFTWARE_COMPRESSION_ENABLED:
				return getRRCSoftwareCompressionEnabled();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TARGET_ELEMENT_GOAL:
				return getTargetElementGoal();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TARGET_ELEMENT_RESOURCE_POOL:
				return getTargetElementResourcePool();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TIME_BEFORE_REMOVAL:
				return getTimeBeforeRemoval();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__CONSISTENCY_EXEMPT:
				return getConsistencyExempt();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__CONSISTENT_ASYNC_COPY:
				return getConsistentAsyncCopy();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DESIRED_RPO:
				return getDesiredRPO();
			case CimPackage.CIM_REPLICATION_SETTING_DATA__MAXIMUM_SKEW:
				return getMaximumSkew();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CimPackage.CIM_REPLICATION_SETTING_DATA__PAIRING:
				setPairing((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__UNEQUAL_GROUPS_ACTION:
				setUnequalGroupsAction((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DESIRED_COPY_METHODOLOGY:
				setDesiredCopyMethodology((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TARGET_ELEMENT_SUPPLIER:
				setTargetElementSupplier((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__THIN_PROVISIONING_POLICY:
				setThinProvisioningPolicy((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__CONSISTENT_POINT_IN_TIME:
				setConsistentPointInTime((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DELTA_UPDATE_INTERVAL:
				setDeltaUpdateInterval((String)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__MULTIHOP:
				setMultihop((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__ON_GROUP_OR_LIST_ERROR:
				setOnGroupOrListError((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__COPY_PRIORITY:
				setCopyPriority((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__COPY_RECOVERY_MODE:
				setCopyRecoveryMode((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DELTA_UPDATE_BLOCKS:
				setDeltaUpdateBlocks((Long)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__FAILED_COPY_STOPS_HOST_IO:
				setFailedCopyStopsHostIO((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__UNEQUAL_LISTS_ACTION:
				setUnequalListsAction((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__READ_ONLY:
				setReadOnly((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__STORAGE_COMPRESSION_POLICY:
				setStorageCompressionPolicy((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__AUTO_DELETE:
				setAutoDelete((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__RRC_HARDWARE_COMPRESSION_ENABLED:
				setRRCHardwareCompressionEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__RRC_SOFTWARE_COMPRESSION_ENABLED:
				setRRCSoftwareCompressionEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TARGET_ELEMENT_GOAL:
				setTargetElementGoal((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TARGET_ELEMENT_RESOURCE_POOL:
				setTargetElementResourcePool((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TIME_BEFORE_REMOVAL:
				setTimeBeforeRemoval((String)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__CONSISTENCY_EXEMPT:
				setConsistencyExempt((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__CONSISTENT_ASYNC_COPY:
				setConsistentAsyncCopy((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DESIRED_RPO:
				setDesiredRPO((String)newValue);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__MAXIMUM_SKEW:
				setMaximumSkew((Long)newValue);
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
			case CimPackage.CIM_REPLICATION_SETTING_DATA__PAIRING:
				setPairing(PAIRING_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__UNEQUAL_GROUPS_ACTION:
				setUnequalGroupsAction(UNEQUAL_GROUPS_ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DESIRED_COPY_METHODOLOGY:
				setDesiredCopyMethodology(DESIRED_COPY_METHODOLOGY_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TARGET_ELEMENT_SUPPLIER:
				setTargetElementSupplier(TARGET_ELEMENT_SUPPLIER_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__THIN_PROVISIONING_POLICY:
				setThinProvisioningPolicy(THIN_PROVISIONING_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__CONSISTENT_POINT_IN_TIME:
				setConsistentPointInTime(CONSISTENT_POINT_IN_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DELTA_UPDATE_INTERVAL:
				setDeltaUpdateInterval(DELTA_UPDATE_INTERVAL_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__MULTIHOP:
				setMultihop(MULTIHOP_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__ON_GROUP_OR_LIST_ERROR:
				setOnGroupOrListError(ON_GROUP_OR_LIST_ERROR_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__COPY_PRIORITY:
				setCopyPriority(COPY_PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__COPY_RECOVERY_MODE:
				setCopyRecoveryMode(COPY_RECOVERY_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DELTA_UPDATE_BLOCKS:
				setDeltaUpdateBlocks(DELTA_UPDATE_BLOCKS_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__FAILED_COPY_STOPS_HOST_IO:
				setFailedCopyStopsHostIO(FAILED_COPY_STOPS_HOST_IO_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__UNEQUAL_LISTS_ACTION:
				setUnequalListsAction(UNEQUAL_LISTS_ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__STORAGE_COMPRESSION_POLICY:
				setStorageCompressionPolicy(STORAGE_COMPRESSION_POLICY_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__AUTO_DELETE:
				setAutoDelete(AUTO_DELETE_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__RRC_HARDWARE_COMPRESSION_ENABLED:
				setRRCHardwareCompressionEnabled(RRC_HARDWARE_COMPRESSION_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__RRC_SOFTWARE_COMPRESSION_ENABLED:
				setRRCSoftwareCompressionEnabled(RRC_SOFTWARE_COMPRESSION_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TARGET_ELEMENT_GOAL:
				setTargetElementGoal(TARGET_ELEMENT_GOAL_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TARGET_ELEMENT_RESOURCE_POOL:
				setTargetElementResourcePool(TARGET_ELEMENT_RESOURCE_POOL_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TIME_BEFORE_REMOVAL:
				setTimeBeforeRemoval(TIME_BEFORE_REMOVAL_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__CONSISTENCY_EXEMPT:
				setConsistencyExempt(CONSISTENCY_EXEMPT_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__CONSISTENT_ASYNC_COPY:
				setConsistentAsyncCopy(CONSISTENT_ASYNC_COPY_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DESIRED_RPO:
				setDesiredRPO(DESIRED_RPO_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICATION_SETTING_DATA__MAXIMUM_SKEW:
				setMaximumSkew(MAXIMUM_SKEW_EDEFAULT);
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
			case CimPackage.CIM_REPLICATION_SETTING_DATA__PAIRING:
				return PAIRING_EDEFAULT == null ? pairing != null : !PAIRING_EDEFAULT.equals(pairing);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__UNEQUAL_GROUPS_ACTION:
				return UNEQUAL_GROUPS_ACTION_EDEFAULT == null ? unequalGroupsAction != null : !UNEQUAL_GROUPS_ACTION_EDEFAULT.equals(unequalGroupsAction);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DESIRED_COPY_METHODOLOGY:
				return DESIRED_COPY_METHODOLOGY_EDEFAULT == null ? desiredCopyMethodology != null : !DESIRED_COPY_METHODOLOGY_EDEFAULT.equals(desiredCopyMethodology);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TARGET_ELEMENT_SUPPLIER:
				return TARGET_ELEMENT_SUPPLIER_EDEFAULT == null ? targetElementSupplier != null : !TARGET_ELEMENT_SUPPLIER_EDEFAULT.equals(targetElementSupplier);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__THIN_PROVISIONING_POLICY:
				return THIN_PROVISIONING_POLICY_EDEFAULT == null ? thinProvisioningPolicy != null : !THIN_PROVISIONING_POLICY_EDEFAULT.equals(thinProvisioningPolicy);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__CONSISTENT_POINT_IN_TIME:
				return CONSISTENT_POINT_IN_TIME_EDEFAULT == null ? consistentPointInTime != null : !CONSISTENT_POINT_IN_TIME_EDEFAULT.equals(consistentPointInTime);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DELTA_UPDATE_INTERVAL:
				return DELTA_UPDATE_INTERVAL_EDEFAULT == null ? deltaUpdateInterval != null : !DELTA_UPDATE_INTERVAL_EDEFAULT.equals(deltaUpdateInterval);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__MULTIHOP:
				return MULTIHOP_EDEFAULT == null ? multihop != null : !MULTIHOP_EDEFAULT.equals(multihop);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__ON_GROUP_OR_LIST_ERROR:
				return ON_GROUP_OR_LIST_ERROR_EDEFAULT == null ? onGroupOrListError != null : !ON_GROUP_OR_LIST_ERROR_EDEFAULT.equals(onGroupOrListError);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__COPY_PRIORITY:
				return COPY_PRIORITY_EDEFAULT == null ? copyPriority != null : !COPY_PRIORITY_EDEFAULT.equals(copyPriority);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__COPY_RECOVERY_MODE:
				return COPY_RECOVERY_MODE_EDEFAULT == null ? copyRecoveryMode != null : !COPY_RECOVERY_MODE_EDEFAULT.equals(copyRecoveryMode);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DELTA_UPDATE_BLOCKS:
				return DELTA_UPDATE_BLOCKS_EDEFAULT == null ? deltaUpdateBlocks != null : !DELTA_UPDATE_BLOCKS_EDEFAULT.equals(deltaUpdateBlocks);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__FAILED_COPY_STOPS_HOST_IO:
				return FAILED_COPY_STOPS_HOST_IO_EDEFAULT == null ? failedCopyStopsHostIO != null : !FAILED_COPY_STOPS_HOST_IO_EDEFAULT.equals(failedCopyStopsHostIO);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__UNEQUAL_LISTS_ACTION:
				return UNEQUAL_LISTS_ACTION_EDEFAULT == null ? unequalListsAction != null : !UNEQUAL_LISTS_ACTION_EDEFAULT.equals(unequalListsAction);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__READ_ONLY:
				return READ_ONLY_EDEFAULT == null ? readOnly != null : !READ_ONLY_EDEFAULT.equals(readOnly);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__STORAGE_COMPRESSION_POLICY:
				return STORAGE_COMPRESSION_POLICY_EDEFAULT == null ? storageCompressionPolicy != null : !STORAGE_COMPRESSION_POLICY_EDEFAULT.equals(storageCompressionPolicy);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__AUTO_DELETE:
				return AUTO_DELETE_EDEFAULT == null ? autoDelete != null : !AUTO_DELETE_EDEFAULT.equals(autoDelete);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__RRC_HARDWARE_COMPRESSION_ENABLED:
				return RRC_HARDWARE_COMPRESSION_ENABLED_EDEFAULT == null ? rrcHardwareCompressionEnabled != null : !RRC_HARDWARE_COMPRESSION_ENABLED_EDEFAULT.equals(rrcHardwareCompressionEnabled);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__RRC_SOFTWARE_COMPRESSION_ENABLED:
				return RRC_SOFTWARE_COMPRESSION_ENABLED_EDEFAULT == null ? rrcSoftwareCompressionEnabled != null : !RRC_SOFTWARE_COMPRESSION_ENABLED_EDEFAULT.equals(rrcSoftwareCompressionEnabled);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TARGET_ELEMENT_GOAL:
				return TARGET_ELEMENT_GOAL_EDEFAULT == null ? targetElementGoal != null : !TARGET_ELEMENT_GOAL_EDEFAULT.equals(targetElementGoal);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TARGET_ELEMENT_RESOURCE_POOL:
				return TARGET_ELEMENT_RESOURCE_POOL_EDEFAULT == null ? targetElementResourcePool != null : !TARGET_ELEMENT_RESOURCE_POOL_EDEFAULT.equals(targetElementResourcePool);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__TIME_BEFORE_REMOVAL:
				return TIME_BEFORE_REMOVAL_EDEFAULT == null ? timeBeforeRemoval != null : !TIME_BEFORE_REMOVAL_EDEFAULT.equals(timeBeforeRemoval);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__CONSISTENCY_EXEMPT:
				return CONSISTENCY_EXEMPT_EDEFAULT == null ? consistencyExempt != null : !CONSISTENCY_EXEMPT_EDEFAULT.equals(consistencyExempt);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__CONSISTENT_ASYNC_COPY:
				return CONSISTENT_ASYNC_COPY_EDEFAULT == null ? consistentAsyncCopy != null : !CONSISTENT_ASYNC_COPY_EDEFAULT.equals(consistentAsyncCopy);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__DESIRED_RPO:
				return DESIRED_RPO_EDEFAULT == null ? desiredRPO != null : !DESIRED_RPO_EDEFAULT.equals(desiredRPO);
			case CimPackage.CIM_REPLICATION_SETTING_DATA__MAXIMUM_SKEW:
				return MAXIMUM_SKEW_EDEFAULT == null ? maximumSkew != null : !MAXIMUM_SKEW_EDEFAULT.equals(maximumSkew);
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
		result.append(" (Pairing: ");
		result.append(pairing);
		result.append(", UnequalGroupsAction: ");
		result.append(unequalGroupsAction);
		result.append(", DesiredCopyMethodology: ");
		result.append(desiredCopyMethodology);
		result.append(", TargetElementSupplier: ");
		result.append(targetElementSupplier);
		result.append(", ThinProvisioningPolicy: ");
		result.append(thinProvisioningPolicy);
		result.append(", ConsistentPointInTime: ");
		result.append(consistentPointInTime);
		result.append(", DeltaUpdateInterval: ");
		result.append(deltaUpdateInterval);
		result.append(", Multihop: ");
		result.append(multihop);
		result.append(", OnGroupOrListError: ");
		result.append(onGroupOrListError);
		result.append(", CopyPriority: ");
		result.append(copyPriority);
		result.append(", CopyRecoveryMode: ");
		result.append(copyRecoveryMode);
		result.append(", DeltaUpdateBlocks: ");
		result.append(deltaUpdateBlocks);
		result.append(", FailedCopyStopsHostIO: ");
		result.append(failedCopyStopsHostIO);
		result.append(", UnequalListsAction: ");
		result.append(unequalListsAction);
		result.append(", ReadOnly: ");
		result.append(readOnly);
		result.append(", StorageCompressionPolicy: ");
		result.append(storageCompressionPolicy);
		result.append(", AutoDelete: ");
		result.append(autoDelete);
		result.append(", RRCHardwareCompressionEnabled: ");
		result.append(rrcHardwareCompressionEnabled);
		result.append(", RRCSoftwareCompressionEnabled: ");
		result.append(rrcSoftwareCompressionEnabled);
		result.append(", TargetElementGoal: ");
		result.append(targetElementGoal);
		result.append(", TargetElementResourcePool: ");
		result.append(targetElementResourcePool);
		result.append(", TimeBeforeRemoval: ");
		result.append(timeBeforeRemoval);
		result.append(", ConsistencyExempt: ");
		result.append(consistencyExempt);
		result.append(", ConsistentAsyncCopy: ");
		result.append(consistentAsyncCopy);
		result.append(", DesiredRPO: ");
		result.append(desiredRPO);
		result.append(", MaximumSkew: ");
		result.append(maximumSkew);
		result.append(')');
		return result.toString();
	}

} //CIM_ReplicationSettingDataImpl

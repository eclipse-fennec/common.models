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

import org.dmtf.cim.CIM_StorageSetting;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getNoSinglePointOfFailure <em>No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getDataRedundancyMax <em>Data Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getDataRedundancyMin <em>Data Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getDataRedundancyGoal <em>Data Redundancy Goal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getPackageRedundancyMax <em>Package Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getPackageRedundancyMin <em>Package Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getPackageRedundancyGoal <em>Package Redundancy Goal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getDeltaReservationMax <em>Delta Reservation Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getDeltaReservationMin <em>Delta Reservation Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getDeltaReservationGoal <em>Delta Reservation Goal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getExtentStripeLength <em>Extent Stripe Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getExtentStripeLengthMin <em>Extent Stripe Length Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getExtentStripeLengthMax <em>Extent Stripe Length Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getParityLayout <em>Parity Layout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getUserDataStripeDepth <em>User Data Stripe Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getUserDataStripeDepthMin <em>User Data Stripe Depth Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getUserDataStripeDepthMax <em>User Data Stripe Depth Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getCUImage <em>CU Image</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getCompressedElement <em>Compressed Element</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getCompressionRate <em>Compression Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getDataOrganization <em>Data Organization</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getDiskType <em>Disk Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getEmulatedDevice <em>Emulated Device</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getEncryption <em>Encryption</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getFormFactorType <em>Form Factor Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getIncrementalDeltas <em>Incremental Deltas</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getInitialSynchronization <em>Initial Synchronization</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getInterconnectSpeed <em>Interconnect Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getInterconnectType <em>Interconnect Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getLowSpaceWarningThreshold <em>Low Space Warning Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getPersistentReplica <em>Persistent Replica</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getRPM <em>RPM</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getReplicationPriority <em>Replication Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getSpaceLimit <em>Space Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getSpaceLimitWarningThreshold <em>Space Limit Warning Threshold</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getStorageExtentInitialUsage <em>Storage Extent Initial Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getStoragePoolInitialUsage <em>Storage Pool Initial Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getSubsystemID <em>Subsystem ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getThinProvisionedInitialReserve <em>Thin Provisioned Initial Reserve</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getThinProvisionedPoolType <em>Thin Provisioned Pool Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageSettingImpl#getUseReplicationBuffer <em>Use Replication Buffer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageSettingImpl extends CIM_SettingDataImpl implements CIM_StorageSetting {
	/**
	 * The default value of the '{@link #getNoSinglePointOfFailure() <em>No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoSinglePointOfFailure()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NO_SINGLE_POINT_OF_FAILURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNoSinglePointOfFailure() <em>No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoSinglePointOfFailure()
	 * @generated
	 * @ordered
	 */
	protected Boolean noSinglePointOfFailure = NO_SINGLE_POINT_OF_FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataRedundancyMax() <em>Data Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRedundancyMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_REDUNDANCY_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataRedundancyMax() <em>Data Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRedundancyMax()
	 * @generated
	 * @ordered
	 */
	protected Integer dataRedundancyMax = DATA_REDUNDANCY_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataRedundancyMin() <em>Data Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRedundancyMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_REDUNDANCY_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataRedundancyMin() <em>Data Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRedundancyMin()
	 * @generated
	 * @ordered
	 */
	protected Integer dataRedundancyMin = DATA_REDUNDANCY_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataRedundancyGoal() <em>Data Redundancy Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRedundancyGoal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_REDUNDANCY_GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataRedundancyGoal() <em>Data Redundancy Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRedundancyGoal()
	 * @generated
	 * @ordered
	 */
	protected Integer dataRedundancyGoal = DATA_REDUNDANCY_GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageRedundancyMax() <em>Package Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageRedundancyMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PACKAGE_REDUNDANCY_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageRedundancyMax() <em>Package Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageRedundancyMax()
	 * @generated
	 * @ordered
	 */
	protected Integer packageRedundancyMax = PACKAGE_REDUNDANCY_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageRedundancyMin() <em>Package Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageRedundancyMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PACKAGE_REDUNDANCY_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageRedundancyMin() <em>Package Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageRedundancyMin()
	 * @generated
	 * @ordered
	 */
	protected Integer packageRedundancyMin = PACKAGE_REDUNDANCY_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageRedundancyGoal() <em>Package Redundancy Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageRedundancyGoal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PACKAGE_REDUNDANCY_GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageRedundancyGoal() <em>Package Redundancy Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageRedundancyGoal()
	 * @generated
	 * @ordered
	 */
	protected Integer packageRedundancyGoal = PACKAGE_REDUNDANCY_GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeltaReservationMax() <em>Delta Reservation Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaReservationMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DELTA_RESERVATION_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaReservationMax() <em>Delta Reservation Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaReservationMax()
	 * @generated
	 * @ordered
	 */
	protected Integer deltaReservationMax = DELTA_RESERVATION_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeltaReservationMin() <em>Delta Reservation Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaReservationMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DELTA_RESERVATION_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaReservationMin() <em>Delta Reservation Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaReservationMin()
	 * @generated
	 * @ordered
	 */
	protected Integer deltaReservationMin = DELTA_RESERVATION_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeltaReservationGoal() <em>Delta Reservation Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaReservationGoal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DELTA_RESERVATION_GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaReservationGoal() <em>Delta Reservation Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaReservationGoal()
	 * @generated
	 * @ordered
	 */
	protected Integer deltaReservationGoal = DELTA_RESERVATION_GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtentStripeLength() <em>Extent Stripe Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentStripeLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXTENT_STRIPE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtentStripeLength() <em>Extent Stripe Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentStripeLength()
	 * @generated
	 * @ordered
	 */
	protected Integer extentStripeLength = EXTENT_STRIPE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtentStripeLengthMin() <em>Extent Stripe Length Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentStripeLengthMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXTENT_STRIPE_LENGTH_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtentStripeLengthMin() <em>Extent Stripe Length Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentStripeLengthMin()
	 * @generated
	 * @ordered
	 */
	protected Integer extentStripeLengthMin = EXTENT_STRIPE_LENGTH_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtentStripeLengthMax() <em>Extent Stripe Length Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentStripeLengthMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXTENT_STRIPE_LENGTH_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtentStripeLengthMax() <em>Extent Stripe Length Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentStripeLengthMax()
	 * @generated
	 * @ordered
	 */
	protected Integer extentStripeLengthMax = EXTENT_STRIPE_LENGTH_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getParityLayout() <em>Parity Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParityLayout()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PARITY_LAYOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParityLayout() <em>Parity Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParityLayout()
	 * @generated
	 * @ordered
	 */
	protected Integer parityLayout = PARITY_LAYOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDataStripeDepth() <em>User Data Stripe Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataStripeDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Long USER_DATA_STRIPE_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDataStripeDepth() <em>User Data Stripe Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataStripeDepth()
	 * @generated
	 * @ordered
	 */
	protected Long userDataStripeDepth = USER_DATA_STRIPE_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDataStripeDepthMin() <em>User Data Stripe Depth Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataStripeDepthMin()
	 * @generated
	 * @ordered
	 */
	protected static final Long USER_DATA_STRIPE_DEPTH_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDataStripeDepthMin() <em>User Data Stripe Depth Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataStripeDepthMin()
	 * @generated
	 * @ordered
	 */
	protected Long userDataStripeDepthMin = USER_DATA_STRIPE_DEPTH_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDataStripeDepthMax() <em>User Data Stripe Depth Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataStripeDepthMax()
	 * @generated
	 * @ordered
	 */
	protected static final Long USER_DATA_STRIPE_DEPTH_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDataStripeDepthMax() <em>User Data Stripe Depth Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataStripeDepthMax()
	 * @generated
	 * @ordered
	 */
	protected Long userDataStripeDepthMax = USER_DATA_STRIPE_DEPTH_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCUImage() <em>CU Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUImage()
	 * @generated
	 * @ordered
	 */
	protected static final String CU_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCUImage() <em>CU Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCUImage()
	 * @generated
	 * @ordered
	 */
	protected String cuImage = CU_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompressedElement() <em>Compressed Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressedElement()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean COMPRESSED_ELEMENT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getCompressedElement() <em>Compressed Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressedElement()
	 * @generated
	 * @ordered
	 */
	protected Boolean compressedElement = COMPRESSED_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompressionRate() <em>Compression Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionRate()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COMPRESSION_RATE_EDEFAULT = Integer.valueOf(1);

	/**
	 * The cached value of the '{@link #getCompressionRate() <em>Compression Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionRate()
	 * @generated
	 * @ordered
	 */
	protected Integer compressionRate = COMPRESSION_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataOrganization() <em>Data Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_ORGANIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataOrganization() <em>Data Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataOrganization()
	 * @generated
	 * @ordered
	 */
	protected Integer dataOrganization = DATA_ORGANIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiskType() <em>Disk Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DISK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiskType() <em>Disk Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskType()
	 * @generated
	 * @ordered
	 */
	protected Integer diskType = DISK_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmulatedDevice() <em>Emulated Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmulatedDevice()
	 * @generated
	 * @ordered
	 */
	protected static final String EMULATED_DEVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmulatedDevice() <em>Emulated Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmulatedDevice()
	 * @generated
	 * @ordered
	 */
	protected String emulatedDevice = EMULATED_DEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncryption() <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENCRYPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryption() <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption()
	 * @generated
	 * @ordered
	 */
	protected Integer encryption = ENCRYPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormFactorType() <em>Form Factor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormFactorType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FORM_FACTOR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormFactorType() <em>Form Factor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormFactorType()
	 * @generated
	 * @ordered
	 */
	protected Integer formFactorType = FORM_FACTOR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrementalDeltas() <em>Incremental Deltas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalDeltas()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCREMENTAL_DELTAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncrementalDeltas() <em>Incremental Deltas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementalDeltas()
	 * @generated
	 * @ordered
	 */
	protected Boolean incrementalDeltas = INCREMENTAL_DELTAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialSynchronization() <em>Initial Synchronization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialSynchronization()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INITIAL_SYNCHRONIZATION_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getInitialSynchronization() <em>Initial Synchronization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialSynchronization()
	 * @generated
	 * @ordered
	 */
	protected Integer initialSynchronization = INITIAL_SYNCHRONIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterconnectSpeed() <em>Interconnect Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final Long INTERCONNECT_SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterconnectSpeed() <em>Interconnect Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectSpeed()
	 * @generated
	 * @ordered
	 */
	protected Long interconnectSpeed = INTERCONNECT_SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterconnectType() <em>Interconnect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INTERCONNECT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterconnectType() <em>Interconnect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnectType()
	 * @generated
	 * @ordered
	 */
	protected Integer interconnectType = INTERCONNECT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLowSpaceWarningThreshold() <em>Low Space Warning Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowSpaceWarningThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOW_SPACE_WARNING_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowSpaceWarningThreshold() <em>Low Space Warning Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowSpaceWarningThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer lowSpaceWarningThreshold = LOW_SPACE_WARNING_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistentReplica() <em>Persistent Replica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentReplica()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PERSISTENT_REPLICA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistentReplica() <em>Persistent Replica</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentReplica()
	 * @generated
	 * @ordered
	 */
	protected Boolean persistentReplica = PERSISTENT_REPLICA_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortType() <em>Port Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortType()
	 * @generated
	 * @ordered
	 */
	protected Integer portType = PORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRPM() <em>RPM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPM()
	 * @generated
	 * @ordered
	 */
	protected static final Long RPM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRPM() <em>RPM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPM()
	 * @generated
	 * @ordered
	 */
	protected Long rpm = RPM_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplicationPriority() <em>Replication Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REPLICATION_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplicationPriority() <em>Replication Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer replicationPriority = REPLICATION_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceLimit() <em>Space Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Long SPACE_LIMIT_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getSpaceLimit() <em>Space Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimit()
	 * @generated
	 * @ordered
	 */
	protected Long spaceLimit = SPACE_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpaceLimitWarningThreshold() <em>Space Limit Warning Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimitWarningThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SPACE_LIMIT_WARNING_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpaceLimitWarningThreshold() <em>Space Limit Warning Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceLimitWarningThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer spaceLimitWarningThreshold = SPACE_LIMIT_WARNING_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageExtentInitialUsage() <em>Storage Extent Initial Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageExtentInitialUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STORAGE_EXTENT_INITIAL_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageExtentInitialUsage() <em>Storage Extent Initial Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageExtentInitialUsage()
	 * @generated
	 * @ordered
	 */
	protected Integer storageExtentInitialUsage = STORAGE_EXTENT_INITIAL_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoragePoolInitialUsage() <em>Storage Pool Initial Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoragePoolInitialUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STORAGE_POOL_INITIAL_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoragePoolInitialUsage() <em>Storage Pool Initial Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoragePoolInitialUsage()
	 * @generated
	 * @ordered
	 */
	protected Integer storagePoolInitialUsage = STORAGE_POOL_INITIAL_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubsystemID() <em>Subsystem ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemID()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSYSTEM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubsystemID() <em>Subsystem ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystemID()
	 * @generated
	 * @ordered
	 */
	protected String subsystemID = SUBSYSTEM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getThinProvisionedInitialReserve() <em>Thin Provisioned Initial Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinProvisionedInitialReserve()
	 * @generated
	 * @ordered
	 */
	protected static final Long THIN_PROVISIONED_INITIAL_RESERVE_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getThinProvisionedInitialReserve() <em>Thin Provisioned Initial Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinProvisionedInitialReserve()
	 * @generated
	 * @ordered
	 */
	protected Long thinProvisionedInitialReserve = THIN_PROVISIONED_INITIAL_RESERVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThinProvisionedPoolType() <em>Thin Provisioned Pool Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinProvisionedPoolType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer THIN_PROVISIONED_POOL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThinProvisionedPoolType() <em>Thin Provisioned Pool Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinProvisionedPoolType()
	 * @generated
	 * @ordered
	 */
	protected Integer thinProvisionedPoolType = THIN_PROVISIONED_POOL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseReplicationBuffer() <em>Use Replication Buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseReplicationBuffer()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USE_REPLICATION_BUFFER_EDEFAULT = Integer.valueOf(0);

	/**
	 * The cached value of the '{@link #getUseReplicationBuffer() <em>Use Replication Buffer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseReplicationBuffer()
	 * @generated
	 * @ordered
	 */
	protected Integer useReplicationBuffer = USE_REPLICATION_BUFFER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageSettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageSetting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNoSinglePointOfFailure() {
		return noSinglePointOfFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoSinglePointOfFailure(Boolean newNoSinglePointOfFailure) {
		Boolean oldNoSinglePointOfFailure = noSinglePointOfFailure;
		noSinglePointOfFailure = newNoSinglePointOfFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__NO_SINGLE_POINT_OF_FAILURE, oldNoSinglePointOfFailure, noSinglePointOfFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataRedundancyMax() {
		return dataRedundancyMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataRedundancyMax(Integer newDataRedundancyMax) {
		Integer oldDataRedundancyMax = dataRedundancyMax;
		dataRedundancyMax = newDataRedundancyMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__DATA_REDUNDANCY_MAX, oldDataRedundancyMax, dataRedundancyMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataRedundancyMin() {
		return dataRedundancyMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataRedundancyMin(Integer newDataRedundancyMin) {
		Integer oldDataRedundancyMin = dataRedundancyMin;
		dataRedundancyMin = newDataRedundancyMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__DATA_REDUNDANCY_MIN, oldDataRedundancyMin, dataRedundancyMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataRedundancyGoal() {
		return dataRedundancyGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataRedundancyGoal(Integer newDataRedundancyGoal) {
		Integer oldDataRedundancyGoal = dataRedundancyGoal;
		dataRedundancyGoal = newDataRedundancyGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__DATA_REDUNDANCY_GOAL, oldDataRedundancyGoal, dataRedundancyGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPackageRedundancyMax() {
		return packageRedundancyMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageRedundancyMax(Integer newPackageRedundancyMax) {
		Integer oldPackageRedundancyMax = packageRedundancyMax;
		packageRedundancyMax = newPackageRedundancyMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__PACKAGE_REDUNDANCY_MAX, oldPackageRedundancyMax, packageRedundancyMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPackageRedundancyMin() {
		return packageRedundancyMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageRedundancyMin(Integer newPackageRedundancyMin) {
		Integer oldPackageRedundancyMin = packageRedundancyMin;
		packageRedundancyMin = newPackageRedundancyMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__PACKAGE_REDUNDANCY_MIN, oldPackageRedundancyMin, packageRedundancyMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPackageRedundancyGoal() {
		return packageRedundancyGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageRedundancyGoal(Integer newPackageRedundancyGoal) {
		Integer oldPackageRedundancyGoal = packageRedundancyGoal;
		packageRedundancyGoal = newPackageRedundancyGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__PACKAGE_REDUNDANCY_GOAL, oldPackageRedundancyGoal, packageRedundancyGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeltaReservationMax() {
		return deltaReservationMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltaReservationMax(Integer newDeltaReservationMax) {
		Integer oldDeltaReservationMax = deltaReservationMax;
		deltaReservationMax = newDeltaReservationMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__DELTA_RESERVATION_MAX, oldDeltaReservationMax, deltaReservationMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeltaReservationMin() {
		return deltaReservationMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltaReservationMin(Integer newDeltaReservationMin) {
		Integer oldDeltaReservationMin = deltaReservationMin;
		deltaReservationMin = newDeltaReservationMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__DELTA_RESERVATION_MIN, oldDeltaReservationMin, deltaReservationMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeltaReservationGoal() {
		return deltaReservationGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltaReservationGoal(Integer newDeltaReservationGoal) {
		Integer oldDeltaReservationGoal = deltaReservationGoal;
		deltaReservationGoal = newDeltaReservationGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__DELTA_RESERVATION_GOAL, oldDeltaReservationGoal, deltaReservationGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExtentStripeLength() {
		return extentStripeLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtentStripeLength(Integer newExtentStripeLength) {
		Integer oldExtentStripeLength = extentStripeLength;
		extentStripeLength = newExtentStripeLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__EXTENT_STRIPE_LENGTH, oldExtentStripeLength, extentStripeLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExtentStripeLengthMin() {
		return extentStripeLengthMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtentStripeLengthMin(Integer newExtentStripeLengthMin) {
		Integer oldExtentStripeLengthMin = extentStripeLengthMin;
		extentStripeLengthMin = newExtentStripeLengthMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__EXTENT_STRIPE_LENGTH_MIN, oldExtentStripeLengthMin, extentStripeLengthMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExtentStripeLengthMax() {
		return extentStripeLengthMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtentStripeLengthMax(Integer newExtentStripeLengthMax) {
		Integer oldExtentStripeLengthMax = extentStripeLengthMax;
		extentStripeLengthMax = newExtentStripeLengthMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__EXTENT_STRIPE_LENGTH_MAX, oldExtentStripeLengthMax, extentStripeLengthMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getParityLayout() {
		return parityLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParityLayout(Integer newParityLayout) {
		Integer oldParityLayout = parityLayout;
		parityLayout = newParityLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__PARITY_LAYOUT, oldParityLayout, parityLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUserDataStripeDepth() {
		return userDataStripeDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserDataStripeDepth(Long newUserDataStripeDepth) {
		Long oldUserDataStripeDepth = userDataStripeDepth;
		userDataStripeDepth = newUserDataStripeDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__USER_DATA_STRIPE_DEPTH, oldUserDataStripeDepth, userDataStripeDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUserDataStripeDepthMin() {
		return userDataStripeDepthMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserDataStripeDepthMin(Long newUserDataStripeDepthMin) {
		Long oldUserDataStripeDepthMin = userDataStripeDepthMin;
		userDataStripeDepthMin = newUserDataStripeDepthMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__USER_DATA_STRIPE_DEPTH_MIN, oldUserDataStripeDepthMin, userDataStripeDepthMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUserDataStripeDepthMax() {
		return userDataStripeDepthMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserDataStripeDepthMax(Long newUserDataStripeDepthMax) {
		Long oldUserDataStripeDepthMax = userDataStripeDepthMax;
		userDataStripeDepthMax = newUserDataStripeDepthMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__USER_DATA_STRIPE_DEPTH_MAX, oldUserDataStripeDepthMax, userDataStripeDepthMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCUImage() {
		return cuImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCUImage(String newCUImage) {
		String oldCUImage = cuImage;
		cuImage = newCUImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__CU_IMAGE, oldCUImage, cuImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCompressedElement() {
		return compressedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompressedElement(Boolean newCompressedElement) {
		Boolean oldCompressedElement = compressedElement;
		compressedElement = newCompressedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__COMPRESSED_ELEMENT, oldCompressedElement, compressedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCompressionRate() {
		return compressionRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompressionRate(Integer newCompressionRate) {
		Integer oldCompressionRate = compressionRate;
		compressionRate = newCompressionRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__COMPRESSION_RATE, oldCompressionRate, compressionRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataOrganization() {
		return dataOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataOrganization(Integer newDataOrganization) {
		Integer oldDataOrganization = dataOrganization;
		dataOrganization = newDataOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__DATA_ORGANIZATION, oldDataOrganization, dataOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDiskType() {
		return diskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiskType(Integer newDiskType) {
		Integer oldDiskType = diskType;
		diskType = newDiskType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__DISK_TYPE, oldDiskType, diskType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmulatedDevice() {
		return emulatedDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmulatedDevice(String newEmulatedDevice) {
		String oldEmulatedDevice = emulatedDevice;
		emulatedDevice = newEmulatedDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__EMULATED_DEVICE, oldEmulatedDevice, emulatedDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getEncryption() {
		return encryption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryption(Integer newEncryption) {
		Integer oldEncryption = encryption;
		encryption = newEncryption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__ENCRYPTION, oldEncryption, encryption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFormFactorType() {
		return formFactorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormFactorType(Integer newFormFactorType) {
		Integer oldFormFactorType = formFactorType;
		formFactorType = newFormFactorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__FORM_FACTOR_TYPE, oldFormFactorType, formFactorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIncrementalDeltas() {
		return incrementalDeltas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncrementalDeltas(Boolean newIncrementalDeltas) {
		Boolean oldIncrementalDeltas = incrementalDeltas;
		incrementalDeltas = newIncrementalDeltas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__INCREMENTAL_DELTAS, oldIncrementalDeltas, incrementalDeltas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInitialSynchronization() {
		return initialSynchronization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialSynchronization(Integer newInitialSynchronization) {
		Integer oldInitialSynchronization = initialSynchronization;
		initialSynchronization = newInitialSynchronization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__INITIAL_SYNCHRONIZATION, oldInitialSynchronization, initialSynchronization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getInterconnectSpeed() {
		return interconnectSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterconnectSpeed(Long newInterconnectSpeed) {
		Long oldInterconnectSpeed = interconnectSpeed;
		interconnectSpeed = newInterconnectSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__INTERCONNECT_SPEED, oldInterconnectSpeed, interconnectSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInterconnectType() {
		return interconnectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterconnectType(Integer newInterconnectType) {
		Integer oldInterconnectType = interconnectType;
		interconnectType = newInterconnectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__INTERCONNECT_TYPE, oldInterconnectType, interconnectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLowSpaceWarningThreshold() {
		return lowSpaceWarningThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowSpaceWarningThreshold(Integer newLowSpaceWarningThreshold) {
		Integer oldLowSpaceWarningThreshold = lowSpaceWarningThreshold;
		lowSpaceWarningThreshold = newLowSpaceWarningThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__LOW_SPACE_WARNING_THRESHOLD, oldLowSpaceWarningThreshold, lowSpaceWarningThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPersistentReplica() {
		return persistentReplica;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersistentReplica(Boolean newPersistentReplica) {
		Boolean oldPersistentReplica = persistentReplica;
		persistentReplica = newPersistentReplica;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__PERSISTENT_REPLICA, oldPersistentReplica, persistentReplica));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPortType() {
		return portType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortType(Integer newPortType) {
		Integer oldPortType = portType;
		portType = newPortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__PORT_TYPE, oldPortType, portType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRPM() {
		return rpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRPM(Long newRPM) {
		Long oldRPM = rpm;
		rpm = newRPM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__RPM, oldRPM, rpm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getReplicationPriority() {
		return replicationPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplicationPriority(Integer newReplicationPriority) {
		Integer oldReplicationPriority = replicationPriority;
		replicationPriority = newReplicationPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__REPLICATION_PRIORITY, oldReplicationPriority, replicationPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSpaceLimit() {
		return spaceLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaceLimit(Long newSpaceLimit) {
		Long oldSpaceLimit = spaceLimit;
		spaceLimit = newSpaceLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__SPACE_LIMIT, oldSpaceLimit, spaceLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSpaceLimitWarningThreshold() {
		return spaceLimitWarningThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpaceLimitWarningThreshold(Integer newSpaceLimitWarningThreshold) {
		Integer oldSpaceLimitWarningThreshold = spaceLimitWarningThreshold;
		spaceLimitWarningThreshold = newSpaceLimitWarningThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__SPACE_LIMIT_WARNING_THRESHOLD, oldSpaceLimitWarningThreshold, spaceLimitWarningThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStorageExtentInitialUsage() {
		return storageExtentInitialUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageExtentInitialUsage(Integer newStorageExtentInitialUsage) {
		Integer oldStorageExtentInitialUsage = storageExtentInitialUsage;
		storageExtentInitialUsage = newStorageExtentInitialUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__STORAGE_EXTENT_INITIAL_USAGE, oldStorageExtentInitialUsage, storageExtentInitialUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStoragePoolInitialUsage() {
		return storagePoolInitialUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoragePoolInitialUsage(Integer newStoragePoolInitialUsage) {
		Integer oldStoragePoolInitialUsage = storagePoolInitialUsage;
		storagePoolInitialUsage = newStoragePoolInitialUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__STORAGE_POOL_INITIAL_USAGE, oldStoragePoolInitialUsage, storagePoolInitialUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubsystemID() {
		return subsystemID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubsystemID(String newSubsystemID) {
		String oldSubsystemID = subsystemID;
		subsystemID = newSubsystemID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__SUBSYSTEM_ID, oldSubsystemID, subsystemID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getThinProvisionedInitialReserve() {
		return thinProvisionedInitialReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThinProvisionedInitialReserve(Long newThinProvisionedInitialReserve) {
		Long oldThinProvisionedInitialReserve = thinProvisionedInitialReserve;
		thinProvisionedInitialReserve = newThinProvisionedInitialReserve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__THIN_PROVISIONED_INITIAL_RESERVE, oldThinProvisionedInitialReserve, thinProvisionedInitialReserve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getThinProvisionedPoolType() {
		return thinProvisionedPoolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThinProvisionedPoolType(Integer newThinProvisionedPoolType) {
		Integer oldThinProvisionedPoolType = thinProvisionedPoolType;
		thinProvisionedPoolType = newThinProvisionedPoolType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__THIN_PROVISIONED_POOL_TYPE, oldThinProvisionedPoolType, thinProvisionedPoolType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUseReplicationBuffer() {
		return useReplicationBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseReplicationBuffer(Integer newUseReplicationBuffer) {
		Integer oldUseReplicationBuffer = useReplicationBuffer;
		useReplicationBuffer = newUseReplicationBuffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_SETTING__USE_REPLICATION_BUFFER, oldUseReplicationBuffer, useReplicationBuffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_SETTING__NO_SINGLE_POINT_OF_FAILURE:
				return getNoSinglePointOfFailure();
			case CimPackage.CIM_STORAGE_SETTING__DATA_REDUNDANCY_MAX:
				return getDataRedundancyMax();
			case CimPackage.CIM_STORAGE_SETTING__DATA_REDUNDANCY_MIN:
				return getDataRedundancyMin();
			case CimPackage.CIM_STORAGE_SETTING__DATA_REDUNDANCY_GOAL:
				return getDataRedundancyGoal();
			case CimPackage.CIM_STORAGE_SETTING__PACKAGE_REDUNDANCY_MAX:
				return getPackageRedundancyMax();
			case CimPackage.CIM_STORAGE_SETTING__PACKAGE_REDUNDANCY_MIN:
				return getPackageRedundancyMin();
			case CimPackage.CIM_STORAGE_SETTING__PACKAGE_REDUNDANCY_GOAL:
				return getPackageRedundancyGoal();
			case CimPackage.CIM_STORAGE_SETTING__DELTA_RESERVATION_MAX:
				return getDeltaReservationMax();
			case CimPackage.CIM_STORAGE_SETTING__DELTA_RESERVATION_MIN:
				return getDeltaReservationMin();
			case CimPackage.CIM_STORAGE_SETTING__DELTA_RESERVATION_GOAL:
				return getDeltaReservationGoal();
			case CimPackage.CIM_STORAGE_SETTING__EXTENT_STRIPE_LENGTH:
				return getExtentStripeLength();
			case CimPackage.CIM_STORAGE_SETTING__EXTENT_STRIPE_LENGTH_MIN:
				return getExtentStripeLengthMin();
			case CimPackage.CIM_STORAGE_SETTING__EXTENT_STRIPE_LENGTH_MAX:
				return getExtentStripeLengthMax();
			case CimPackage.CIM_STORAGE_SETTING__PARITY_LAYOUT:
				return getParityLayout();
			case CimPackage.CIM_STORAGE_SETTING__USER_DATA_STRIPE_DEPTH:
				return getUserDataStripeDepth();
			case CimPackage.CIM_STORAGE_SETTING__USER_DATA_STRIPE_DEPTH_MIN:
				return getUserDataStripeDepthMin();
			case CimPackage.CIM_STORAGE_SETTING__USER_DATA_STRIPE_DEPTH_MAX:
				return getUserDataStripeDepthMax();
			case CimPackage.CIM_STORAGE_SETTING__CU_IMAGE:
				return getCUImage();
			case CimPackage.CIM_STORAGE_SETTING__COMPRESSED_ELEMENT:
				return getCompressedElement();
			case CimPackage.CIM_STORAGE_SETTING__COMPRESSION_RATE:
				return getCompressionRate();
			case CimPackage.CIM_STORAGE_SETTING__DATA_ORGANIZATION:
				return getDataOrganization();
			case CimPackage.CIM_STORAGE_SETTING__DISK_TYPE:
				return getDiskType();
			case CimPackage.CIM_STORAGE_SETTING__EMULATED_DEVICE:
				return getEmulatedDevice();
			case CimPackage.CIM_STORAGE_SETTING__ENCRYPTION:
				return getEncryption();
			case CimPackage.CIM_STORAGE_SETTING__FORM_FACTOR_TYPE:
				return getFormFactorType();
			case CimPackage.CIM_STORAGE_SETTING__INCREMENTAL_DELTAS:
				return getIncrementalDeltas();
			case CimPackage.CIM_STORAGE_SETTING__INITIAL_SYNCHRONIZATION:
				return getInitialSynchronization();
			case CimPackage.CIM_STORAGE_SETTING__INTERCONNECT_SPEED:
				return getInterconnectSpeed();
			case CimPackage.CIM_STORAGE_SETTING__INTERCONNECT_TYPE:
				return getInterconnectType();
			case CimPackage.CIM_STORAGE_SETTING__LOW_SPACE_WARNING_THRESHOLD:
				return getLowSpaceWarningThreshold();
			case CimPackage.CIM_STORAGE_SETTING__PERSISTENT_REPLICA:
				return getPersistentReplica();
			case CimPackage.CIM_STORAGE_SETTING__PORT_TYPE:
				return getPortType();
			case CimPackage.CIM_STORAGE_SETTING__RPM:
				return getRPM();
			case CimPackage.CIM_STORAGE_SETTING__REPLICATION_PRIORITY:
				return getReplicationPriority();
			case CimPackage.CIM_STORAGE_SETTING__SPACE_LIMIT:
				return getSpaceLimit();
			case CimPackage.CIM_STORAGE_SETTING__SPACE_LIMIT_WARNING_THRESHOLD:
				return getSpaceLimitWarningThreshold();
			case CimPackage.CIM_STORAGE_SETTING__STORAGE_EXTENT_INITIAL_USAGE:
				return getStorageExtentInitialUsage();
			case CimPackage.CIM_STORAGE_SETTING__STORAGE_POOL_INITIAL_USAGE:
				return getStoragePoolInitialUsage();
			case CimPackage.CIM_STORAGE_SETTING__SUBSYSTEM_ID:
				return getSubsystemID();
			case CimPackage.CIM_STORAGE_SETTING__THIN_PROVISIONED_INITIAL_RESERVE:
				return getThinProvisionedInitialReserve();
			case CimPackage.CIM_STORAGE_SETTING__THIN_PROVISIONED_POOL_TYPE:
				return getThinProvisionedPoolType();
			case CimPackage.CIM_STORAGE_SETTING__USE_REPLICATION_BUFFER:
				return getUseReplicationBuffer();
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
			case CimPackage.CIM_STORAGE_SETTING__NO_SINGLE_POINT_OF_FAILURE:
				setNoSinglePointOfFailure((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DATA_REDUNDANCY_MAX:
				setDataRedundancyMax((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DATA_REDUNDANCY_MIN:
				setDataRedundancyMin((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DATA_REDUNDANCY_GOAL:
				setDataRedundancyGoal((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__PACKAGE_REDUNDANCY_MAX:
				setPackageRedundancyMax((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__PACKAGE_REDUNDANCY_MIN:
				setPackageRedundancyMin((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__PACKAGE_REDUNDANCY_GOAL:
				setPackageRedundancyGoal((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DELTA_RESERVATION_MAX:
				setDeltaReservationMax((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DELTA_RESERVATION_MIN:
				setDeltaReservationMin((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DELTA_RESERVATION_GOAL:
				setDeltaReservationGoal((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__EXTENT_STRIPE_LENGTH:
				setExtentStripeLength((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__EXTENT_STRIPE_LENGTH_MIN:
				setExtentStripeLengthMin((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__EXTENT_STRIPE_LENGTH_MAX:
				setExtentStripeLengthMax((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__PARITY_LAYOUT:
				setParityLayout((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__USER_DATA_STRIPE_DEPTH:
				setUserDataStripeDepth((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__USER_DATA_STRIPE_DEPTH_MIN:
				setUserDataStripeDepthMin((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__USER_DATA_STRIPE_DEPTH_MAX:
				setUserDataStripeDepthMax((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__CU_IMAGE:
				setCUImage((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__COMPRESSED_ELEMENT:
				setCompressedElement((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__COMPRESSION_RATE:
				setCompressionRate((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DATA_ORGANIZATION:
				setDataOrganization((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DISK_TYPE:
				setDiskType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__EMULATED_DEVICE:
				setEmulatedDevice((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__ENCRYPTION:
				setEncryption((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__FORM_FACTOR_TYPE:
				setFormFactorType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__INCREMENTAL_DELTAS:
				setIncrementalDeltas((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__INITIAL_SYNCHRONIZATION:
				setInitialSynchronization((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__INTERCONNECT_SPEED:
				setInterconnectSpeed((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__INTERCONNECT_TYPE:
				setInterconnectType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__LOW_SPACE_WARNING_THRESHOLD:
				setLowSpaceWarningThreshold((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__PERSISTENT_REPLICA:
				setPersistentReplica((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__PORT_TYPE:
				setPortType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__RPM:
				setRPM((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__REPLICATION_PRIORITY:
				setReplicationPriority((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__SPACE_LIMIT:
				setSpaceLimit((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__SPACE_LIMIT_WARNING_THRESHOLD:
				setSpaceLimitWarningThreshold((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__STORAGE_EXTENT_INITIAL_USAGE:
				setStorageExtentInitialUsage((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__STORAGE_POOL_INITIAL_USAGE:
				setStoragePoolInitialUsage((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__SUBSYSTEM_ID:
				setSubsystemID((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__THIN_PROVISIONED_INITIAL_RESERVE:
				setThinProvisionedInitialReserve((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__THIN_PROVISIONED_POOL_TYPE:
				setThinProvisionedPoolType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_SETTING__USE_REPLICATION_BUFFER:
				setUseReplicationBuffer((Integer)newValue);
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
			case CimPackage.CIM_STORAGE_SETTING__NO_SINGLE_POINT_OF_FAILURE:
				setNoSinglePointOfFailure(NO_SINGLE_POINT_OF_FAILURE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DATA_REDUNDANCY_MAX:
				setDataRedundancyMax(DATA_REDUNDANCY_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DATA_REDUNDANCY_MIN:
				setDataRedundancyMin(DATA_REDUNDANCY_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DATA_REDUNDANCY_GOAL:
				setDataRedundancyGoal(DATA_REDUNDANCY_GOAL_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__PACKAGE_REDUNDANCY_MAX:
				setPackageRedundancyMax(PACKAGE_REDUNDANCY_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__PACKAGE_REDUNDANCY_MIN:
				setPackageRedundancyMin(PACKAGE_REDUNDANCY_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__PACKAGE_REDUNDANCY_GOAL:
				setPackageRedundancyGoal(PACKAGE_REDUNDANCY_GOAL_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DELTA_RESERVATION_MAX:
				setDeltaReservationMax(DELTA_RESERVATION_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DELTA_RESERVATION_MIN:
				setDeltaReservationMin(DELTA_RESERVATION_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DELTA_RESERVATION_GOAL:
				setDeltaReservationGoal(DELTA_RESERVATION_GOAL_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__EXTENT_STRIPE_LENGTH:
				setExtentStripeLength(EXTENT_STRIPE_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__EXTENT_STRIPE_LENGTH_MIN:
				setExtentStripeLengthMin(EXTENT_STRIPE_LENGTH_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__EXTENT_STRIPE_LENGTH_MAX:
				setExtentStripeLengthMax(EXTENT_STRIPE_LENGTH_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__PARITY_LAYOUT:
				setParityLayout(PARITY_LAYOUT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__USER_DATA_STRIPE_DEPTH:
				setUserDataStripeDepth(USER_DATA_STRIPE_DEPTH_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__USER_DATA_STRIPE_DEPTH_MIN:
				setUserDataStripeDepthMin(USER_DATA_STRIPE_DEPTH_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__USER_DATA_STRIPE_DEPTH_MAX:
				setUserDataStripeDepthMax(USER_DATA_STRIPE_DEPTH_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__CU_IMAGE:
				setCUImage(CU_IMAGE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__COMPRESSED_ELEMENT:
				setCompressedElement(COMPRESSED_ELEMENT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__COMPRESSION_RATE:
				setCompressionRate(COMPRESSION_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DATA_ORGANIZATION:
				setDataOrganization(DATA_ORGANIZATION_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__DISK_TYPE:
				setDiskType(DISK_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__EMULATED_DEVICE:
				setEmulatedDevice(EMULATED_DEVICE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__ENCRYPTION:
				setEncryption(ENCRYPTION_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__FORM_FACTOR_TYPE:
				setFormFactorType(FORM_FACTOR_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__INCREMENTAL_DELTAS:
				setIncrementalDeltas(INCREMENTAL_DELTAS_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__INITIAL_SYNCHRONIZATION:
				setInitialSynchronization(INITIAL_SYNCHRONIZATION_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__INTERCONNECT_SPEED:
				setInterconnectSpeed(INTERCONNECT_SPEED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__INTERCONNECT_TYPE:
				setInterconnectType(INTERCONNECT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__LOW_SPACE_WARNING_THRESHOLD:
				setLowSpaceWarningThreshold(LOW_SPACE_WARNING_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__PERSISTENT_REPLICA:
				setPersistentReplica(PERSISTENT_REPLICA_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__PORT_TYPE:
				setPortType(PORT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__RPM:
				setRPM(RPM_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__REPLICATION_PRIORITY:
				setReplicationPriority(REPLICATION_PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__SPACE_LIMIT:
				setSpaceLimit(SPACE_LIMIT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__SPACE_LIMIT_WARNING_THRESHOLD:
				setSpaceLimitWarningThreshold(SPACE_LIMIT_WARNING_THRESHOLD_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__STORAGE_EXTENT_INITIAL_USAGE:
				setStorageExtentInitialUsage(STORAGE_EXTENT_INITIAL_USAGE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__STORAGE_POOL_INITIAL_USAGE:
				setStoragePoolInitialUsage(STORAGE_POOL_INITIAL_USAGE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__SUBSYSTEM_ID:
				setSubsystemID(SUBSYSTEM_ID_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__THIN_PROVISIONED_INITIAL_RESERVE:
				setThinProvisionedInitialReserve(THIN_PROVISIONED_INITIAL_RESERVE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__THIN_PROVISIONED_POOL_TYPE:
				setThinProvisionedPoolType(THIN_PROVISIONED_POOL_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_SETTING__USE_REPLICATION_BUFFER:
				setUseReplicationBuffer(USE_REPLICATION_BUFFER_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_SETTING__NO_SINGLE_POINT_OF_FAILURE:
				return NO_SINGLE_POINT_OF_FAILURE_EDEFAULT == null ? noSinglePointOfFailure != null : !NO_SINGLE_POINT_OF_FAILURE_EDEFAULT.equals(noSinglePointOfFailure);
			case CimPackage.CIM_STORAGE_SETTING__DATA_REDUNDANCY_MAX:
				return DATA_REDUNDANCY_MAX_EDEFAULT == null ? dataRedundancyMax != null : !DATA_REDUNDANCY_MAX_EDEFAULT.equals(dataRedundancyMax);
			case CimPackage.CIM_STORAGE_SETTING__DATA_REDUNDANCY_MIN:
				return DATA_REDUNDANCY_MIN_EDEFAULT == null ? dataRedundancyMin != null : !DATA_REDUNDANCY_MIN_EDEFAULT.equals(dataRedundancyMin);
			case CimPackage.CIM_STORAGE_SETTING__DATA_REDUNDANCY_GOAL:
				return DATA_REDUNDANCY_GOAL_EDEFAULT == null ? dataRedundancyGoal != null : !DATA_REDUNDANCY_GOAL_EDEFAULT.equals(dataRedundancyGoal);
			case CimPackage.CIM_STORAGE_SETTING__PACKAGE_REDUNDANCY_MAX:
				return PACKAGE_REDUNDANCY_MAX_EDEFAULT == null ? packageRedundancyMax != null : !PACKAGE_REDUNDANCY_MAX_EDEFAULT.equals(packageRedundancyMax);
			case CimPackage.CIM_STORAGE_SETTING__PACKAGE_REDUNDANCY_MIN:
				return PACKAGE_REDUNDANCY_MIN_EDEFAULT == null ? packageRedundancyMin != null : !PACKAGE_REDUNDANCY_MIN_EDEFAULT.equals(packageRedundancyMin);
			case CimPackage.CIM_STORAGE_SETTING__PACKAGE_REDUNDANCY_GOAL:
				return PACKAGE_REDUNDANCY_GOAL_EDEFAULT == null ? packageRedundancyGoal != null : !PACKAGE_REDUNDANCY_GOAL_EDEFAULT.equals(packageRedundancyGoal);
			case CimPackage.CIM_STORAGE_SETTING__DELTA_RESERVATION_MAX:
				return DELTA_RESERVATION_MAX_EDEFAULT == null ? deltaReservationMax != null : !DELTA_RESERVATION_MAX_EDEFAULT.equals(deltaReservationMax);
			case CimPackage.CIM_STORAGE_SETTING__DELTA_RESERVATION_MIN:
				return DELTA_RESERVATION_MIN_EDEFAULT == null ? deltaReservationMin != null : !DELTA_RESERVATION_MIN_EDEFAULT.equals(deltaReservationMin);
			case CimPackage.CIM_STORAGE_SETTING__DELTA_RESERVATION_GOAL:
				return DELTA_RESERVATION_GOAL_EDEFAULT == null ? deltaReservationGoal != null : !DELTA_RESERVATION_GOAL_EDEFAULT.equals(deltaReservationGoal);
			case CimPackage.CIM_STORAGE_SETTING__EXTENT_STRIPE_LENGTH:
				return EXTENT_STRIPE_LENGTH_EDEFAULT == null ? extentStripeLength != null : !EXTENT_STRIPE_LENGTH_EDEFAULT.equals(extentStripeLength);
			case CimPackage.CIM_STORAGE_SETTING__EXTENT_STRIPE_LENGTH_MIN:
				return EXTENT_STRIPE_LENGTH_MIN_EDEFAULT == null ? extentStripeLengthMin != null : !EXTENT_STRIPE_LENGTH_MIN_EDEFAULT.equals(extentStripeLengthMin);
			case CimPackage.CIM_STORAGE_SETTING__EXTENT_STRIPE_LENGTH_MAX:
				return EXTENT_STRIPE_LENGTH_MAX_EDEFAULT == null ? extentStripeLengthMax != null : !EXTENT_STRIPE_LENGTH_MAX_EDEFAULT.equals(extentStripeLengthMax);
			case CimPackage.CIM_STORAGE_SETTING__PARITY_LAYOUT:
				return PARITY_LAYOUT_EDEFAULT == null ? parityLayout != null : !PARITY_LAYOUT_EDEFAULT.equals(parityLayout);
			case CimPackage.CIM_STORAGE_SETTING__USER_DATA_STRIPE_DEPTH:
				return USER_DATA_STRIPE_DEPTH_EDEFAULT == null ? userDataStripeDepth != null : !USER_DATA_STRIPE_DEPTH_EDEFAULT.equals(userDataStripeDepth);
			case CimPackage.CIM_STORAGE_SETTING__USER_DATA_STRIPE_DEPTH_MIN:
				return USER_DATA_STRIPE_DEPTH_MIN_EDEFAULT == null ? userDataStripeDepthMin != null : !USER_DATA_STRIPE_DEPTH_MIN_EDEFAULT.equals(userDataStripeDepthMin);
			case CimPackage.CIM_STORAGE_SETTING__USER_DATA_STRIPE_DEPTH_MAX:
				return USER_DATA_STRIPE_DEPTH_MAX_EDEFAULT == null ? userDataStripeDepthMax != null : !USER_DATA_STRIPE_DEPTH_MAX_EDEFAULT.equals(userDataStripeDepthMax);
			case CimPackage.CIM_STORAGE_SETTING__CU_IMAGE:
				return CU_IMAGE_EDEFAULT == null ? cuImage != null : !CU_IMAGE_EDEFAULT.equals(cuImage);
			case CimPackage.CIM_STORAGE_SETTING__COMPRESSED_ELEMENT:
				return COMPRESSED_ELEMENT_EDEFAULT == null ? compressedElement != null : !COMPRESSED_ELEMENT_EDEFAULT.equals(compressedElement);
			case CimPackage.CIM_STORAGE_SETTING__COMPRESSION_RATE:
				return COMPRESSION_RATE_EDEFAULT == null ? compressionRate != null : !COMPRESSION_RATE_EDEFAULT.equals(compressionRate);
			case CimPackage.CIM_STORAGE_SETTING__DATA_ORGANIZATION:
				return DATA_ORGANIZATION_EDEFAULT == null ? dataOrganization != null : !DATA_ORGANIZATION_EDEFAULT.equals(dataOrganization);
			case CimPackage.CIM_STORAGE_SETTING__DISK_TYPE:
				return DISK_TYPE_EDEFAULT == null ? diskType != null : !DISK_TYPE_EDEFAULT.equals(diskType);
			case CimPackage.CIM_STORAGE_SETTING__EMULATED_DEVICE:
				return EMULATED_DEVICE_EDEFAULT == null ? emulatedDevice != null : !EMULATED_DEVICE_EDEFAULT.equals(emulatedDevice);
			case CimPackage.CIM_STORAGE_SETTING__ENCRYPTION:
				return ENCRYPTION_EDEFAULT == null ? encryption != null : !ENCRYPTION_EDEFAULT.equals(encryption);
			case CimPackage.CIM_STORAGE_SETTING__FORM_FACTOR_TYPE:
				return FORM_FACTOR_TYPE_EDEFAULT == null ? formFactorType != null : !FORM_FACTOR_TYPE_EDEFAULT.equals(formFactorType);
			case CimPackage.CIM_STORAGE_SETTING__INCREMENTAL_DELTAS:
				return INCREMENTAL_DELTAS_EDEFAULT == null ? incrementalDeltas != null : !INCREMENTAL_DELTAS_EDEFAULT.equals(incrementalDeltas);
			case CimPackage.CIM_STORAGE_SETTING__INITIAL_SYNCHRONIZATION:
				return INITIAL_SYNCHRONIZATION_EDEFAULT == null ? initialSynchronization != null : !INITIAL_SYNCHRONIZATION_EDEFAULT.equals(initialSynchronization);
			case CimPackage.CIM_STORAGE_SETTING__INTERCONNECT_SPEED:
				return INTERCONNECT_SPEED_EDEFAULT == null ? interconnectSpeed != null : !INTERCONNECT_SPEED_EDEFAULT.equals(interconnectSpeed);
			case CimPackage.CIM_STORAGE_SETTING__INTERCONNECT_TYPE:
				return INTERCONNECT_TYPE_EDEFAULT == null ? interconnectType != null : !INTERCONNECT_TYPE_EDEFAULT.equals(interconnectType);
			case CimPackage.CIM_STORAGE_SETTING__LOW_SPACE_WARNING_THRESHOLD:
				return LOW_SPACE_WARNING_THRESHOLD_EDEFAULT == null ? lowSpaceWarningThreshold != null : !LOW_SPACE_WARNING_THRESHOLD_EDEFAULT.equals(lowSpaceWarningThreshold);
			case CimPackage.CIM_STORAGE_SETTING__PERSISTENT_REPLICA:
				return PERSISTENT_REPLICA_EDEFAULT == null ? persistentReplica != null : !PERSISTENT_REPLICA_EDEFAULT.equals(persistentReplica);
			case CimPackage.CIM_STORAGE_SETTING__PORT_TYPE:
				return PORT_TYPE_EDEFAULT == null ? portType != null : !PORT_TYPE_EDEFAULT.equals(portType);
			case CimPackage.CIM_STORAGE_SETTING__RPM:
				return RPM_EDEFAULT == null ? rpm != null : !RPM_EDEFAULT.equals(rpm);
			case CimPackage.CIM_STORAGE_SETTING__REPLICATION_PRIORITY:
				return REPLICATION_PRIORITY_EDEFAULT == null ? replicationPriority != null : !REPLICATION_PRIORITY_EDEFAULT.equals(replicationPriority);
			case CimPackage.CIM_STORAGE_SETTING__SPACE_LIMIT:
				return SPACE_LIMIT_EDEFAULT == null ? spaceLimit != null : !SPACE_LIMIT_EDEFAULT.equals(spaceLimit);
			case CimPackage.CIM_STORAGE_SETTING__SPACE_LIMIT_WARNING_THRESHOLD:
				return SPACE_LIMIT_WARNING_THRESHOLD_EDEFAULT == null ? spaceLimitWarningThreshold != null : !SPACE_LIMIT_WARNING_THRESHOLD_EDEFAULT.equals(spaceLimitWarningThreshold);
			case CimPackage.CIM_STORAGE_SETTING__STORAGE_EXTENT_INITIAL_USAGE:
				return STORAGE_EXTENT_INITIAL_USAGE_EDEFAULT == null ? storageExtentInitialUsage != null : !STORAGE_EXTENT_INITIAL_USAGE_EDEFAULT.equals(storageExtentInitialUsage);
			case CimPackage.CIM_STORAGE_SETTING__STORAGE_POOL_INITIAL_USAGE:
				return STORAGE_POOL_INITIAL_USAGE_EDEFAULT == null ? storagePoolInitialUsage != null : !STORAGE_POOL_INITIAL_USAGE_EDEFAULT.equals(storagePoolInitialUsage);
			case CimPackage.CIM_STORAGE_SETTING__SUBSYSTEM_ID:
				return SUBSYSTEM_ID_EDEFAULT == null ? subsystemID != null : !SUBSYSTEM_ID_EDEFAULT.equals(subsystemID);
			case CimPackage.CIM_STORAGE_SETTING__THIN_PROVISIONED_INITIAL_RESERVE:
				return THIN_PROVISIONED_INITIAL_RESERVE_EDEFAULT == null ? thinProvisionedInitialReserve != null : !THIN_PROVISIONED_INITIAL_RESERVE_EDEFAULT.equals(thinProvisionedInitialReserve);
			case CimPackage.CIM_STORAGE_SETTING__THIN_PROVISIONED_POOL_TYPE:
				return THIN_PROVISIONED_POOL_TYPE_EDEFAULT == null ? thinProvisionedPoolType != null : !THIN_PROVISIONED_POOL_TYPE_EDEFAULT.equals(thinProvisionedPoolType);
			case CimPackage.CIM_STORAGE_SETTING__USE_REPLICATION_BUFFER:
				return USE_REPLICATION_BUFFER_EDEFAULT == null ? useReplicationBuffer != null : !USE_REPLICATION_BUFFER_EDEFAULT.equals(useReplicationBuffer);
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
		result.append(" (NoSinglePointOfFailure: ");
		result.append(noSinglePointOfFailure);
		result.append(", DataRedundancyMax: ");
		result.append(dataRedundancyMax);
		result.append(", DataRedundancyMin: ");
		result.append(dataRedundancyMin);
		result.append(", DataRedundancyGoal: ");
		result.append(dataRedundancyGoal);
		result.append(", PackageRedundancyMax: ");
		result.append(packageRedundancyMax);
		result.append(", PackageRedundancyMin: ");
		result.append(packageRedundancyMin);
		result.append(", PackageRedundancyGoal: ");
		result.append(packageRedundancyGoal);
		result.append(", DeltaReservationMax: ");
		result.append(deltaReservationMax);
		result.append(", DeltaReservationMin: ");
		result.append(deltaReservationMin);
		result.append(", DeltaReservationGoal: ");
		result.append(deltaReservationGoal);
		result.append(", ExtentStripeLength: ");
		result.append(extentStripeLength);
		result.append(", ExtentStripeLengthMin: ");
		result.append(extentStripeLengthMin);
		result.append(", ExtentStripeLengthMax: ");
		result.append(extentStripeLengthMax);
		result.append(", ParityLayout: ");
		result.append(parityLayout);
		result.append(", UserDataStripeDepth: ");
		result.append(userDataStripeDepth);
		result.append(", UserDataStripeDepthMin: ");
		result.append(userDataStripeDepthMin);
		result.append(", UserDataStripeDepthMax: ");
		result.append(userDataStripeDepthMax);
		result.append(", CUImage: ");
		result.append(cuImage);
		result.append(", CompressedElement: ");
		result.append(compressedElement);
		result.append(", CompressionRate: ");
		result.append(compressionRate);
		result.append(", DataOrganization: ");
		result.append(dataOrganization);
		result.append(", DiskType: ");
		result.append(diskType);
		result.append(", EmulatedDevice: ");
		result.append(emulatedDevice);
		result.append(", Encryption: ");
		result.append(encryption);
		result.append(", FormFactorType: ");
		result.append(formFactorType);
		result.append(", IncrementalDeltas: ");
		result.append(incrementalDeltas);
		result.append(", InitialSynchronization: ");
		result.append(initialSynchronization);
		result.append(", InterconnectSpeed: ");
		result.append(interconnectSpeed);
		result.append(", InterconnectType: ");
		result.append(interconnectType);
		result.append(", LowSpaceWarningThreshold: ");
		result.append(lowSpaceWarningThreshold);
		result.append(", PersistentReplica: ");
		result.append(persistentReplica);
		result.append(", PortType: ");
		result.append(portType);
		result.append(", RPM: ");
		result.append(rpm);
		result.append(", ReplicationPriority: ");
		result.append(replicationPriority);
		result.append(", SpaceLimit: ");
		result.append(spaceLimit);
		result.append(", SpaceLimitWarningThreshold: ");
		result.append(spaceLimitWarningThreshold);
		result.append(", StorageExtentInitialUsage: ");
		result.append(storageExtentInitialUsage);
		result.append(", StoragePoolInitialUsage: ");
		result.append(storagePoolInitialUsage);
		result.append(", SubsystemID: ");
		result.append(subsystemID);
		result.append(", ThinProvisionedInitialReserve: ");
		result.append(thinProvisionedInitialReserve);
		result.append(", ThinProvisionedPoolType: ");
		result.append(thinProvisionedPoolType);
		result.append(", UseReplicationBuffer: ");
		result.append(useReplicationBuffer);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageSettingImpl

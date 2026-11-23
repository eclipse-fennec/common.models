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

import org.dmtf.cim.CIM_VolumeView;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Volume View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVSystemCreationClassName <em>SV System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVSystemName <em>SV System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVCreationClassName <em>SV Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVDeviceID <em>SV Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVName <em>SV Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVNameFormat <em>SV Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVNameNamespace <em>SV Name Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVExtentStatus <em>SV Extent Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVOperationalStatus <em>SV Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVBlockSize <em>SV Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVNumberOfBlocks <em>SV Number Of Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVConsumableBlocks <em>SV Consumable Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVIsBasedOnUnderlyingRedundancy <em>SV Is Based On Underlying Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVNoSinglePointOfFailure <em>SV No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVDataRedundancy <em>SV Data Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVPackageRedundancy <em>SV Package Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVDeltaReservation <em>SV Delta Reservation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVUsage <em>SV Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVOtherUsageDescription <em>SV Other Usage Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVClientSettableUsage <em>SV Client Settable Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSInstanceID <em>SS Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSElementName <em>SS Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSNoSinglePointOfFailure <em>SS No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSDataRedundancyMin <em>SS Data Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSDataRedundancyMax <em>SS Data Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSDataRedundancyGoal <em>SS Data Redundancy Goal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSPackageRedundancyMin <em>SS Package Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSPackageRedundancyMax <em>SS Package Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSPackageRedundancyGoal <em>SS Package Redundancy Goal</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSChangeableType <em>SS Changeable Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getAFSPSpaceConsumed <em>AFSP Space Consumed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSPInstanceID <em>SP Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSPPoolID <em>SP Pool ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVOtherIdentifyingInfo <em>SV Other Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVIdentifyingDescriptions <em>SV Identifying Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVElementName <em>SV Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVPrimordial <em>SV Primordial</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVExtentDiscriminator <em>SV Extent Discriminator</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSExtentStripeLength <em>SS Extent Stripe Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSExtentStripeLengthMin <em>SS Extent Stripe Length Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSExtentStripeLengthMax <em>SS Extent Stripe Length Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSParityLayout <em>SS Parity Layout</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSUserDataStripeDepth <em>SS User Data Stripe Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSUserDataStripeDepthMin <em>SS User Data Stripe Depth Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSUserDataStripeDepthMax <em>SS User Data Stripe Depth Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSStoragePoolInitialUsage <em>SS Storage Pool Initial Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSSStorageExtentInitialUsage <em>SS Storage Extent Initial Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VolumeViewImpl#getSVIsComposite <em>SV Is Composite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VolumeViewImpl extends CIM_LogicalDeviceViewImpl implements CIM_VolumeView {
	/**
	 * The default value of the '{@link #getSVSystemCreationClassName() <em>SV System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSystemCreationClassName() <em>SV System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String svSystemCreationClassName = SV_SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSystemName() <em>SV System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSystemName() <em>SV System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSystemName()
	 * @generated
	 * @ordered
	 */
	protected String svSystemName = SV_SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVCreationClassName() <em>SV Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVCreationClassName() <em>SV Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String svCreationClassName = SV_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVDeviceID() <em>SV Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVDeviceID() <em>SV Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVDeviceID()
	 * @generated
	 * @ordered
	 */
	protected String svDeviceID = SV_DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVName() <em>SV Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVName()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVName() <em>SV Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVName()
	 * @generated
	 * @ordered
	 */
	protected String svName = SV_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVNameFormat() <em>SV Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVNameFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_NAME_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVNameFormat() <em>SV Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVNameFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer svNameFormat = SV_NAME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVNameNamespace() <em>SV Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVNameNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_NAME_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVNameNamespace() <em>SV Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVNameNamespace()
	 * @generated
	 * @ordered
	 */
	protected Integer svNameNamespace = SV_NAME_NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSVExtentStatus() <em>SV Extent Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVExtentStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> svExtentStatus;

	/**
	 * The cached value of the '{@link #getSVOperationalStatus() <em>SV Operational Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> svOperationalStatus;

	/**
	 * The default value of the '{@link #getSVBlockSize() <em>SV Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long SV_BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVBlockSize() <em>SV Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Long svBlockSize = SV_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVNumberOfBlocks() <em>SV Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVNumberOfBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final Long SV_NUMBER_OF_BLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVNumberOfBlocks() <em>SV Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVNumberOfBlocks()
	 * @generated
	 * @ordered
	 */
	protected Long svNumberOfBlocks = SV_NUMBER_OF_BLOCKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVConsumableBlocks() <em>SV Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVConsumableBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final Long SV_CONSUMABLE_BLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVConsumableBlocks() <em>SV Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVConsumableBlocks()
	 * @generated
	 * @ordered
	 */
	protected Long svConsumableBlocks = SV_CONSUMABLE_BLOCKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVIsBasedOnUnderlyingRedundancy() <em>SV Is Based On Underlying Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVIsBasedOnUnderlyingRedundancy()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SV_IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVIsBasedOnUnderlyingRedundancy() <em>SV Is Based On Underlying Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVIsBasedOnUnderlyingRedundancy()
	 * @generated
	 * @ordered
	 */
	protected Boolean svIsBasedOnUnderlyingRedundancy = SV_IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVNoSinglePointOfFailure() <em>SV No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVNoSinglePointOfFailure()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SV_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVNoSinglePointOfFailure() <em>SV No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVNoSinglePointOfFailure()
	 * @generated
	 * @ordered
	 */
	protected Boolean svNoSinglePointOfFailure = SV_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVDataRedundancy() <em>SV Data Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVDataRedundancy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_DATA_REDUNDANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVDataRedundancy() <em>SV Data Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVDataRedundancy()
	 * @generated
	 * @ordered
	 */
	protected Integer svDataRedundancy = SV_DATA_REDUNDANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVPackageRedundancy() <em>SV Package Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVPackageRedundancy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_PACKAGE_REDUNDANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVPackageRedundancy() <em>SV Package Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVPackageRedundancy()
	 * @generated
	 * @ordered
	 */
	protected Integer svPackageRedundancy = SV_PACKAGE_REDUNDANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVDeltaReservation() <em>SV Delta Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVDeltaReservation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_DELTA_RESERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVDeltaReservation() <em>SV Delta Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVDeltaReservation()
	 * @generated
	 * @ordered
	 */
	protected Integer svDeltaReservation = SV_DELTA_RESERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVUsage() <em>SV Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVUsage() <em>SV Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVUsage()
	 * @generated
	 * @ordered
	 */
	protected Integer svUsage = SV_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVOtherUsageDescription() <em>SV Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVOtherUsageDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_OTHER_USAGE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVOtherUsageDescription() <em>SV Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVOtherUsageDescription()
	 * @generated
	 * @ordered
	 */
	protected String svOtherUsageDescription = SV_OTHER_USAGE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSVClientSettableUsage() <em>SV Client Settable Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVClientSettableUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> svClientSettableUsage;

	/**
	 * The default value of the '{@link #getSSInstanceID() <em>SS Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SS_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSInstanceID() <em>SS Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String ssInstanceID = SS_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSElementName() <em>SS Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String SS_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSElementName() <em>SS Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSElementName()
	 * @generated
	 * @ordered
	 */
	protected String ssElementName = SS_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSNoSinglePointOfFailure() <em>SS No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSNoSinglePointOfFailure()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SS_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSNoSinglePointOfFailure() <em>SS No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSNoSinglePointOfFailure()
	 * @generated
	 * @ordered
	 */
	protected Boolean ssNoSinglePointOfFailure = SS_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSDataRedundancyMin() <em>SS Data Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSDataRedundancyMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_DATA_REDUNDANCY_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSDataRedundancyMin() <em>SS Data Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSDataRedundancyMin()
	 * @generated
	 * @ordered
	 */
	protected Integer ssDataRedundancyMin = SS_DATA_REDUNDANCY_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSDataRedundancyMax() <em>SS Data Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSDataRedundancyMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_DATA_REDUNDANCY_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSDataRedundancyMax() <em>SS Data Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSDataRedundancyMax()
	 * @generated
	 * @ordered
	 */
	protected Integer ssDataRedundancyMax = SS_DATA_REDUNDANCY_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSDataRedundancyGoal() <em>SS Data Redundancy Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSDataRedundancyGoal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_DATA_REDUNDANCY_GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSDataRedundancyGoal() <em>SS Data Redundancy Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSDataRedundancyGoal()
	 * @generated
	 * @ordered
	 */
	protected Integer ssDataRedundancyGoal = SS_DATA_REDUNDANCY_GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSPackageRedundancyMin() <em>SS Package Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSPackageRedundancyMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_PACKAGE_REDUNDANCY_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSPackageRedundancyMin() <em>SS Package Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSPackageRedundancyMin()
	 * @generated
	 * @ordered
	 */
	protected Integer ssPackageRedundancyMin = SS_PACKAGE_REDUNDANCY_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSPackageRedundancyMax() <em>SS Package Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSPackageRedundancyMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_PACKAGE_REDUNDANCY_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSPackageRedundancyMax() <em>SS Package Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSPackageRedundancyMax()
	 * @generated
	 * @ordered
	 */
	protected Integer ssPackageRedundancyMax = SS_PACKAGE_REDUNDANCY_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSPackageRedundancyGoal() <em>SS Package Redundancy Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSPackageRedundancyGoal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_PACKAGE_REDUNDANCY_GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSPackageRedundancyGoal() <em>SS Package Redundancy Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSPackageRedundancyGoal()
	 * @generated
	 * @ordered
	 */
	protected Integer ssPackageRedundancyGoal = SS_PACKAGE_REDUNDANCY_GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSChangeableType() <em>SS Changeable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSChangeableType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_CHANGEABLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSChangeableType() <em>SS Changeable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSChangeableType()
	 * @generated
	 * @ordered
	 */
	protected Integer ssChangeableType = SS_CHANGEABLE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAFSPSpaceConsumed() <em>AFSP Space Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAFSPSpaceConsumed()
	 * @generated
	 * @ordered
	 */
	protected static final Long AFSP_SPACE_CONSUMED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAFSPSpaceConsumed() <em>AFSP Space Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAFSPSpaceConsumed()
	 * @generated
	 * @ordered
	 */
	protected Long afspSpaceConsumed = AFSP_SPACE_CONSUMED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPInstanceID() <em>SP Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SP_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPInstanceID() <em>SP Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String spInstanceID = SP_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPPoolID() <em>SP Pool ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPPoolID()
	 * @generated
	 * @ordered
	 */
	protected static final String SP_POOL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPPoolID() <em>SP Pool ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPPoolID()
	 * @generated
	 * @ordered
	 */
	protected String spPoolID = SP_POOL_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSVOtherIdentifyingInfo() <em>SV Other Identifying Info</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVOtherIdentifyingInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<String> svOtherIdentifyingInfo;

	/**
	 * The cached value of the '{@link #getSVIdentifyingDescriptions() <em>SV Identifying Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVIdentifyingDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> svIdentifyingDescriptions;

	/**
	 * The default value of the '{@link #getSVElementName() <em>SV Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVElementName() <em>SV Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVElementName()
	 * @generated
	 * @ordered
	 */
	protected String svElementName = SV_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVPrimordial() <em>SV Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVPrimordial()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SV_PRIMORDIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVPrimordial() <em>SV Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVPrimordial()
	 * @generated
	 * @ordered
	 */
	protected Boolean svPrimordial = SV_PRIMORDIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSVExtentDiscriminator() <em>SV Extent Discriminator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVExtentDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected EList<String> svExtentDiscriminator;

	/**
	 * The default value of the '{@link #getSSExtentStripeLength() <em>SS Extent Stripe Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSExtentStripeLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_EXTENT_STRIPE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSExtentStripeLength() <em>SS Extent Stripe Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSExtentStripeLength()
	 * @generated
	 * @ordered
	 */
	protected Integer ssExtentStripeLength = SS_EXTENT_STRIPE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSExtentStripeLengthMin() <em>SS Extent Stripe Length Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSExtentStripeLengthMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_EXTENT_STRIPE_LENGTH_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSExtentStripeLengthMin() <em>SS Extent Stripe Length Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSExtentStripeLengthMin()
	 * @generated
	 * @ordered
	 */
	protected Integer ssExtentStripeLengthMin = SS_EXTENT_STRIPE_LENGTH_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSExtentStripeLengthMax() <em>SS Extent Stripe Length Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSExtentStripeLengthMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_EXTENT_STRIPE_LENGTH_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSExtentStripeLengthMax() <em>SS Extent Stripe Length Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSExtentStripeLengthMax()
	 * @generated
	 * @ordered
	 */
	protected Integer ssExtentStripeLengthMax = SS_EXTENT_STRIPE_LENGTH_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSParityLayout() <em>SS Parity Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSParityLayout()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_PARITY_LAYOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSParityLayout() <em>SS Parity Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSParityLayout()
	 * @generated
	 * @ordered
	 */
	protected Integer ssParityLayout = SS_PARITY_LAYOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSUserDataStripeDepth() <em>SS User Data Stripe Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSUserDataStripeDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Long SS_USER_DATA_STRIPE_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSUserDataStripeDepth() <em>SS User Data Stripe Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSUserDataStripeDepth()
	 * @generated
	 * @ordered
	 */
	protected Long ssUserDataStripeDepth = SS_USER_DATA_STRIPE_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSUserDataStripeDepthMin() <em>SS User Data Stripe Depth Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSUserDataStripeDepthMin()
	 * @generated
	 * @ordered
	 */
	protected static final Long SS_USER_DATA_STRIPE_DEPTH_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSUserDataStripeDepthMin() <em>SS User Data Stripe Depth Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSUserDataStripeDepthMin()
	 * @generated
	 * @ordered
	 */
	protected Long ssUserDataStripeDepthMin = SS_USER_DATA_STRIPE_DEPTH_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSUserDataStripeDepthMax() <em>SS User Data Stripe Depth Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSUserDataStripeDepthMax()
	 * @generated
	 * @ordered
	 */
	protected static final Long SS_USER_DATA_STRIPE_DEPTH_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSUserDataStripeDepthMax() <em>SS User Data Stripe Depth Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSUserDataStripeDepthMax()
	 * @generated
	 * @ordered
	 */
	protected Long ssUserDataStripeDepthMax = SS_USER_DATA_STRIPE_DEPTH_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSStoragePoolInitialUsage() <em>SS Storage Pool Initial Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSStoragePoolInitialUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_STORAGE_POOL_INITIAL_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSStoragePoolInitialUsage() <em>SS Storage Pool Initial Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSStoragePoolInitialUsage()
	 * @generated
	 * @ordered
	 */
	protected Integer ssStoragePoolInitialUsage = SS_STORAGE_POOL_INITIAL_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSStorageExtentInitialUsage() <em>SS Storage Extent Initial Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSStorageExtentInitialUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_STORAGE_EXTENT_INITIAL_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSStorageExtentInitialUsage() <em>SS Storage Extent Initial Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSStorageExtentInitialUsage()
	 * @generated
	 * @ordered
	 */
	protected Integer ssStorageExtentInitialUsage = SS_STORAGE_EXTENT_INITIAL_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVIsComposite() <em>SV Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SV_IS_COMPOSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVIsComposite() <em>SV Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVIsComposite()
	 * @generated
	 * @ordered
	 */
	protected Boolean svIsComposite = SV_IS_COMPOSITE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VolumeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VolumeView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVSystemCreationClassName() {
		return svSystemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSystemCreationClassName(String newSVSystemCreationClassName) {
		String oldSVSystemCreationClassName = svSystemCreationClassName;
		svSystemCreationClassName = newSVSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_SYSTEM_CREATION_CLASS_NAME, oldSVSystemCreationClassName, svSystemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVSystemName() {
		return svSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSystemName(String newSVSystemName) {
		String oldSVSystemName = svSystemName;
		svSystemName = newSVSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_SYSTEM_NAME, oldSVSystemName, svSystemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVCreationClassName() {
		return svCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVCreationClassName(String newSVCreationClassName) {
		String oldSVCreationClassName = svCreationClassName;
		svCreationClassName = newSVCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_CREATION_CLASS_NAME, oldSVCreationClassName, svCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVDeviceID() {
		return svDeviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVDeviceID(String newSVDeviceID) {
		String oldSVDeviceID = svDeviceID;
		svDeviceID = newSVDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_DEVICE_ID, oldSVDeviceID, svDeviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVName() {
		return svName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVName(String newSVName) {
		String oldSVName = svName;
		svName = newSVName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_NAME, oldSVName, svName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVNameFormat() {
		return svNameFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVNameFormat(Integer newSVNameFormat) {
		Integer oldSVNameFormat = svNameFormat;
		svNameFormat = newSVNameFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_NAME_FORMAT, oldSVNameFormat, svNameFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVNameNamespace() {
		return svNameNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVNameNamespace(Integer newSVNameNamespace) {
		Integer oldSVNameNamespace = svNameNamespace;
		svNameNamespace = newSVNameNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_NAME_NAMESPACE, oldSVNameNamespace, svNameNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSVExtentStatus() {
		if (svExtentStatus == null) {
			svExtentStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VOLUME_VIEW__SV_EXTENT_STATUS);
		}
		return svExtentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSVOperationalStatus() {
		if (svOperationalStatus == null) {
			svOperationalStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VOLUME_VIEW__SV_OPERATIONAL_STATUS);
		}
		return svOperationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSVBlockSize() {
		return svBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVBlockSize(Long newSVBlockSize) {
		Long oldSVBlockSize = svBlockSize;
		svBlockSize = newSVBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_BLOCK_SIZE, oldSVBlockSize, svBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSVNumberOfBlocks() {
		return svNumberOfBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVNumberOfBlocks(Long newSVNumberOfBlocks) {
		Long oldSVNumberOfBlocks = svNumberOfBlocks;
		svNumberOfBlocks = newSVNumberOfBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_NUMBER_OF_BLOCKS, oldSVNumberOfBlocks, svNumberOfBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSVConsumableBlocks() {
		return svConsumableBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVConsumableBlocks(Long newSVConsumableBlocks) {
		Long oldSVConsumableBlocks = svConsumableBlocks;
		svConsumableBlocks = newSVConsumableBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_CONSUMABLE_BLOCKS, oldSVConsumableBlocks, svConsumableBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSVIsBasedOnUnderlyingRedundancy() {
		return svIsBasedOnUnderlyingRedundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVIsBasedOnUnderlyingRedundancy(Boolean newSVIsBasedOnUnderlyingRedundancy) {
		Boolean oldSVIsBasedOnUnderlyingRedundancy = svIsBasedOnUnderlyingRedundancy;
		svIsBasedOnUnderlyingRedundancy = newSVIsBasedOnUnderlyingRedundancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_IS_BASED_ON_UNDERLYING_REDUNDANCY, oldSVIsBasedOnUnderlyingRedundancy, svIsBasedOnUnderlyingRedundancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSVNoSinglePointOfFailure() {
		return svNoSinglePointOfFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVNoSinglePointOfFailure(Boolean newSVNoSinglePointOfFailure) {
		Boolean oldSVNoSinglePointOfFailure = svNoSinglePointOfFailure;
		svNoSinglePointOfFailure = newSVNoSinglePointOfFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_NO_SINGLE_POINT_OF_FAILURE, oldSVNoSinglePointOfFailure, svNoSinglePointOfFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVDataRedundancy() {
		return svDataRedundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVDataRedundancy(Integer newSVDataRedundancy) {
		Integer oldSVDataRedundancy = svDataRedundancy;
		svDataRedundancy = newSVDataRedundancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_DATA_REDUNDANCY, oldSVDataRedundancy, svDataRedundancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVPackageRedundancy() {
		return svPackageRedundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVPackageRedundancy(Integer newSVPackageRedundancy) {
		Integer oldSVPackageRedundancy = svPackageRedundancy;
		svPackageRedundancy = newSVPackageRedundancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_PACKAGE_REDUNDANCY, oldSVPackageRedundancy, svPackageRedundancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVDeltaReservation() {
		return svDeltaReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVDeltaReservation(Integer newSVDeltaReservation) {
		Integer oldSVDeltaReservation = svDeltaReservation;
		svDeltaReservation = newSVDeltaReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_DELTA_RESERVATION, oldSVDeltaReservation, svDeltaReservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVUsage() {
		return svUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVUsage(Integer newSVUsage) {
		Integer oldSVUsage = svUsage;
		svUsage = newSVUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_USAGE, oldSVUsage, svUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVOtherUsageDescription() {
		return svOtherUsageDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVOtherUsageDescription(String newSVOtherUsageDescription) {
		String oldSVOtherUsageDescription = svOtherUsageDescription;
		svOtherUsageDescription = newSVOtherUsageDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_OTHER_USAGE_DESCRIPTION, oldSVOtherUsageDescription, svOtherUsageDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSVClientSettableUsage() {
		if (svClientSettableUsage == null) {
			svClientSettableUsage = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_VOLUME_VIEW__SV_CLIENT_SETTABLE_USAGE);
		}
		return svClientSettableUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSSInstanceID() {
		return ssInstanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSInstanceID(String newSSInstanceID) {
		String oldSSInstanceID = ssInstanceID;
		ssInstanceID = newSSInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_INSTANCE_ID, oldSSInstanceID, ssInstanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSSElementName() {
		return ssElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSElementName(String newSSElementName) {
		String oldSSElementName = ssElementName;
		ssElementName = newSSElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_ELEMENT_NAME, oldSSElementName, ssElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSSNoSinglePointOfFailure() {
		return ssNoSinglePointOfFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSNoSinglePointOfFailure(Boolean newSSNoSinglePointOfFailure) {
		Boolean oldSSNoSinglePointOfFailure = ssNoSinglePointOfFailure;
		ssNoSinglePointOfFailure = newSSNoSinglePointOfFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_NO_SINGLE_POINT_OF_FAILURE, oldSSNoSinglePointOfFailure, ssNoSinglePointOfFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSDataRedundancyMin() {
		return ssDataRedundancyMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSDataRedundancyMin(Integer newSSDataRedundancyMin) {
		Integer oldSSDataRedundancyMin = ssDataRedundancyMin;
		ssDataRedundancyMin = newSSDataRedundancyMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_DATA_REDUNDANCY_MIN, oldSSDataRedundancyMin, ssDataRedundancyMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSDataRedundancyMax() {
		return ssDataRedundancyMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSDataRedundancyMax(Integer newSSDataRedundancyMax) {
		Integer oldSSDataRedundancyMax = ssDataRedundancyMax;
		ssDataRedundancyMax = newSSDataRedundancyMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_DATA_REDUNDANCY_MAX, oldSSDataRedundancyMax, ssDataRedundancyMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSDataRedundancyGoal() {
		return ssDataRedundancyGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSDataRedundancyGoal(Integer newSSDataRedundancyGoal) {
		Integer oldSSDataRedundancyGoal = ssDataRedundancyGoal;
		ssDataRedundancyGoal = newSSDataRedundancyGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_DATA_REDUNDANCY_GOAL, oldSSDataRedundancyGoal, ssDataRedundancyGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSPackageRedundancyMin() {
		return ssPackageRedundancyMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSPackageRedundancyMin(Integer newSSPackageRedundancyMin) {
		Integer oldSSPackageRedundancyMin = ssPackageRedundancyMin;
		ssPackageRedundancyMin = newSSPackageRedundancyMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_PACKAGE_REDUNDANCY_MIN, oldSSPackageRedundancyMin, ssPackageRedundancyMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSPackageRedundancyMax() {
		return ssPackageRedundancyMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSPackageRedundancyMax(Integer newSSPackageRedundancyMax) {
		Integer oldSSPackageRedundancyMax = ssPackageRedundancyMax;
		ssPackageRedundancyMax = newSSPackageRedundancyMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_PACKAGE_REDUNDANCY_MAX, oldSSPackageRedundancyMax, ssPackageRedundancyMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSPackageRedundancyGoal() {
		return ssPackageRedundancyGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSPackageRedundancyGoal(Integer newSSPackageRedundancyGoal) {
		Integer oldSSPackageRedundancyGoal = ssPackageRedundancyGoal;
		ssPackageRedundancyGoal = newSSPackageRedundancyGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_PACKAGE_REDUNDANCY_GOAL, oldSSPackageRedundancyGoal, ssPackageRedundancyGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSChangeableType() {
		return ssChangeableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSChangeableType(Integer newSSChangeableType) {
		Integer oldSSChangeableType = ssChangeableType;
		ssChangeableType = newSSChangeableType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_CHANGEABLE_TYPE, oldSSChangeableType, ssChangeableType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getAFSPSpaceConsumed() {
		return afspSpaceConsumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAFSPSpaceConsumed(Long newAFSPSpaceConsumed) {
		Long oldAFSPSpaceConsumed = afspSpaceConsumed;
		afspSpaceConsumed = newAFSPSpaceConsumed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__AFSP_SPACE_CONSUMED, oldAFSPSpaceConsumed, afspSpaceConsumed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSPInstanceID() {
		return spInstanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPInstanceID(String newSPInstanceID) {
		String oldSPInstanceID = spInstanceID;
		spInstanceID = newSPInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SP_INSTANCE_ID, oldSPInstanceID, spInstanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSPPoolID() {
		return spPoolID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPPoolID(String newSPPoolID) {
		String oldSPPoolID = spPoolID;
		spPoolID = newSPPoolID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SP_POOL_ID, oldSPPoolID, spPoolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSVOtherIdentifyingInfo() {
		if (svOtherIdentifyingInfo == null) {
			svOtherIdentifyingInfo = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_VOLUME_VIEW__SV_OTHER_IDENTIFYING_INFO);
		}
		return svOtherIdentifyingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSVIdentifyingDescriptions() {
		if (svIdentifyingDescriptions == null) {
			svIdentifyingDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_VOLUME_VIEW__SV_IDENTIFYING_DESCRIPTIONS);
		}
		return svIdentifyingDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVElementName() {
		return svElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVElementName(String newSVElementName) {
		String oldSVElementName = svElementName;
		svElementName = newSVElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_ELEMENT_NAME, oldSVElementName, svElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSVPrimordial() {
		return svPrimordial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVPrimordial(Boolean newSVPrimordial) {
		Boolean oldSVPrimordial = svPrimordial;
		svPrimordial = newSVPrimordial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_PRIMORDIAL, oldSVPrimordial, svPrimordial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSVExtentDiscriminator() {
		if (svExtentDiscriminator == null) {
			svExtentDiscriminator = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_VOLUME_VIEW__SV_EXTENT_DISCRIMINATOR);
		}
		return svExtentDiscriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSExtentStripeLength() {
		return ssExtentStripeLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSExtentStripeLength(Integer newSSExtentStripeLength) {
		Integer oldSSExtentStripeLength = ssExtentStripeLength;
		ssExtentStripeLength = newSSExtentStripeLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_EXTENT_STRIPE_LENGTH, oldSSExtentStripeLength, ssExtentStripeLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSExtentStripeLengthMin() {
		return ssExtentStripeLengthMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSExtentStripeLengthMin(Integer newSSExtentStripeLengthMin) {
		Integer oldSSExtentStripeLengthMin = ssExtentStripeLengthMin;
		ssExtentStripeLengthMin = newSSExtentStripeLengthMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_EXTENT_STRIPE_LENGTH_MIN, oldSSExtentStripeLengthMin, ssExtentStripeLengthMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSExtentStripeLengthMax() {
		return ssExtentStripeLengthMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSExtentStripeLengthMax(Integer newSSExtentStripeLengthMax) {
		Integer oldSSExtentStripeLengthMax = ssExtentStripeLengthMax;
		ssExtentStripeLengthMax = newSSExtentStripeLengthMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_EXTENT_STRIPE_LENGTH_MAX, oldSSExtentStripeLengthMax, ssExtentStripeLengthMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSParityLayout() {
		return ssParityLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSParityLayout(Integer newSSParityLayout) {
		Integer oldSSParityLayout = ssParityLayout;
		ssParityLayout = newSSParityLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_PARITY_LAYOUT, oldSSParityLayout, ssParityLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSSUserDataStripeDepth() {
		return ssUserDataStripeDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSUserDataStripeDepth(Long newSSUserDataStripeDepth) {
		Long oldSSUserDataStripeDepth = ssUserDataStripeDepth;
		ssUserDataStripeDepth = newSSUserDataStripeDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_USER_DATA_STRIPE_DEPTH, oldSSUserDataStripeDepth, ssUserDataStripeDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSSUserDataStripeDepthMin() {
		return ssUserDataStripeDepthMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSUserDataStripeDepthMin(Long newSSUserDataStripeDepthMin) {
		Long oldSSUserDataStripeDepthMin = ssUserDataStripeDepthMin;
		ssUserDataStripeDepthMin = newSSUserDataStripeDepthMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_USER_DATA_STRIPE_DEPTH_MIN, oldSSUserDataStripeDepthMin, ssUserDataStripeDepthMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSSUserDataStripeDepthMax() {
		return ssUserDataStripeDepthMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSUserDataStripeDepthMax(Long newSSUserDataStripeDepthMax) {
		Long oldSSUserDataStripeDepthMax = ssUserDataStripeDepthMax;
		ssUserDataStripeDepthMax = newSSUserDataStripeDepthMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_USER_DATA_STRIPE_DEPTH_MAX, oldSSUserDataStripeDepthMax, ssUserDataStripeDepthMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSStoragePoolInitialUsage() {
		return ssStoragePoolInitialUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSStoragePoolInitialUsage(Integer newSSStoragePoolInitialUsage) {
		Integer oldSSStoragePoolInitialUsage = ssStoragePoolInitialUsage;
		ssStoragePoolInitialUsage = newSSStoragePoolInitialUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_STORAGE_POOL_INITIAL_USAGE, oldSSStoragePoolInitialUsage, ssStoragePoolInitialUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSStorageExtentInitialUsage() {
		return ssStorageExtentInitialUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSStorageExtentInitialUsage(Integer newSSStorageExtentInitialUsage) {
		Integer oldSSStorageExtentInitialUsage = ssStorageExtentInitialUsage;
		ssStorageExtentInitialUsage = newSSStorageExtentInitialUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SS_STORAGE_EXTENT_INITIAL_USAGE, oldSSStorageExtentInitialUsage, ssStorageExtentInitialUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSVIsComposite() {
		return svIsComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVIsComposite(Boolean newSVIsComposite) {
		Boolean oldSVIsComposite = svIsComposite;
		svIsComposite = newSVIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VOLUME_VIEW__SV_IS_COMPOSITE, oldSVIsComposite, svIsComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VOLUME_VIEW__SV_SYSTEM_CREATION_CLASS_NAME:
				return getSVSystemCreationClassName();
			case CimPackage.CIM_VOLUME_VIEW__SV_SYSTEM_NAME:
				return getSVSystemName();
			case CimPackage.CIM_VOLUME_VIEW__SV_CREATION_CLASS_NAME:
				return getSVCreationClassName();
			case CimPackage.CIM_VOLUME_VIEW__SV_DEVICE_ID:
				return getSVDeviceID();
			case CimPackage.CIM_VOLUME_VIEW__SV_NAME:
				return getSVName();
			case CimPackage.CIM_VOLUME_VIEW__SV_NAME_FORMAT:
				return getSVNameFormat();
			case CimPackage.CIM_VOLUME_VIEW__SV_NAME_NAMESPACE:
				return getSVNameNamespace();
			case CimPackage.CIM_VOLUME_VIEW__SV_EXTENT_STATUS:
				return getSVExtentStatus();
			case CimPackage.CIM_VOLUME_VIEW__SV_OPERATIONAL_STATUS:
				return getSVOperationalStatus();
			case CimPackage.CIM_VOLUME_VIEW__SV_BLOCK_SIZE:
				return getSVBlockSize();
			case CimPackage.CIM_VOLUME_VIEW__SV_NUMBER_OF_BLOCKS:
				return getSVNumberOfBlocks();
			case CimPackage.CIM_VOLUME_VIEW__SV_CONSUMABLE_BLOCKS:
				return getSVConsumableBlocks();
			case CimPackage.CIM_VOLUME_VIEW__SV_IS_BASED_ON_UNDERLYING_REDUNDANCY:
				return getSVIsBasedOnUnderlyingRedundancy();
			case CimPackage.CIM_VOLUME_VIEW__SV_NO_SINGLE_POINT_OF_FAILURE:
				return getSVNoSinglePointOfFailure();
			case CimPackage.CIM_VOLUME_VIEW__SV_DATA_REDUNDANCY:
				return getSVDataRedundancy();
			case CimPackage.CIM_VOLUME_VIEW__SV_PACKAGE_REDUNDANCY:
				return getSVPackageRedundancy();
			case CimPackage.CIM_VOLUME_VIEW__SV_DELTA_RESERVATION:
				return getSVDeltaReservation();
			case CimPackage.CIM_VOLUME_VIEW__SV_USAGE:
				return getSVUsage();
			case CimPackage.CIM_VOLUME_VIEW__SV_OTHER_USAGE_DESCRIPTION:
				return getSVOtherUsageDescription();
			case CimPackage.CIM_VOLUME_VIEW__SV_CLIENT_SETTABLE_USAGE:
				return getSVClientSettableUsage();
			case CimPackage.CIM_VOLUME_VIEW__SS_INSTANCE_ID:
				return getSSInstanceID();
			case CimPackage.CIM_VOLUME_VIEW__SS_ELEMENT_NAME:
				return getSSElementName();
			case CimPackage.CIM_VOLUME_VIEW__SS_NO_SINGLE_POINT_OF_FAILURE:
				return getSSNoSinglePointOfFailure();
			case CimPackage.CIM_VOLUME_VIEW__SS_DATA_REDUNDANCY_MIN:
				return getSSDataRedundancyMin();
			case CimPackage.CIM_VOLUME_VIEW__SS_DATA_REDUNDANCY_MAX:
				return getSSDataRedundancyMax();
			case CimPackage.CIM_VOLUME_VIEW__SS_DATA_REDUNDANCY_GOAL:
				return getSSDataRedundancyGoal();
			case CimPackage.CIM_VOLUME_VIEW__SS_PACKAGE_REDUNDANCY_MIN:
				return getSSPackageRedundancyMin();
			case CimPackage.CIM_VOLUME_VIEW__SS_PACKAGE_REDUNDANCY_MAX:
				return getSSPackageRedundancyMax();
			case CimPackage.CIM_VOLUME_VIEW__SS_PACKAGE_REDUNDANCY_GOAL:
				return getSSPackageRedundancyGoal();
			case CimPackage.CIM_VOLUME_VIEW__SS_CHANGEABLE_TYPE:
				return getSSChangeableType();
			case CimPackage.CIM_VOLUME_VIEW__AFSP_SPACE_CONSUMED:
				return getAFSPSpaceConsumed();
			case CimPackage.CIM_VOLUME_VIEW__SP_INSTANCE_ID:
				return getSPInstanceID();
			case CimPackage.CIM_VOLUME_VIEW__SP_POOL_ID:
				return getSPPoolID();
			case CimPackage.CIM_VOLUME_VIEW__SV_OTHER_IDENTIFYING_INFO:
				return getSVOtherIdentifyingInfo();
			case CimPackage.CIM_VOLUME_VIEW__SV_IDENTIFYING_DESCRIPTIONS:
				return getSVIdentifyingDescriptions();
			case CimPackage.CIM_VOLUME_VIEW__SV_ELEMENT_NAME:
				return getSVElementName();
			case CimPackage.CIM_VOLUME_VIEW__SV_PRIMORDIAL:
				return getSVPrimordial();
			case CimPackage.CIM_VOLUME_VIEW__SV_EXTENT_DISCRIMINATOR:
				return getSVExtentDiscriminator();
			case CimPackage.CIM_VOLUME_VIEW__SS_EXTENT_STRIPE_LENGTH:
				return getSSExtentStripeLength();
			case CimPackage.CIM_VOLUME_VIEW__SS_EXTENT_STRIPE_LENGTH_MIN:
				return getSSExtentStripeLengthMin();
			case CimPackage.CIM_VOLUME_VIEW__SS_EXTENT_STRIPE_LENGTH_MAX:
				return getSSExtentStripeLengthMax();
			case CimPackage.CIM_VOLUME_VIEW__SS_PARITY_LAYOUT:
				return getSSParityLayout();
			case CimPackage.CIM_VOLUME_VIEW__SS_USER_DATA_STRIPE_DEPTH:
				return getSSUserDataStripeDepth();
			case CimPackage.CIM_VOLUME_VIEW__SS_USER_DATA_STRIPE_DEPTH_MIN:
				return getSSUserDataStripeDepthMin();
			case CimPackage.CIM_VOLUME_VIEW__SS_USER_DATA_STRIPE_DEPTH_MAX:
				return getSSUserDataStripeDepthMax();
			case CimPackage.CIM_VOLUME_VIEW__SS_STORAGE_POOL_INITIAL_USAGE:
				return getSSStoragePoolInitialUsage();
			case CimPackage.CIM_VOLUME_VIEW__SS_STORAGE_EXTENT_INITIAL_USAGE:
				return getSSStorageExtentInitialUsage();
			case CimPackage.CIM_VOLUME_VIEW__SV_IS_COMPOSITE:
				return getSVIsComposite();
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
			case CimPackage.CIM_VOLUME_VIEW__SV_SYSTEM_CREATION_CLASS_NAME:
				setSVSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_SYSTEM_NAME:
				setSVSystemName((String)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_CREATION_CLASS_NAME:
				setSVCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_DEVICE_ID:
				setSVDeviceID((String)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_NAME:
				setSVName((String)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_NAME_FORMAT:
				setSVNameFormat((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_NAME_NAMESPACE:
				setSVNameNamespace((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_EXTENT_STATUS:
				getSVExtentStatus().clear();
				getSVExtentStatus().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_OPERATIONAL_STATUS:
				getSVOperationalStatus().clear();
				getSVOperationalStatus().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_BLOCK_SIZE:
				setSVBlockSize((Long)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_NUMBER_OF_BLOCKS:
				setSVNumberOfBlocks((Long)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_CONSUMABLE_BLOCKS:
				setSVConsumableBlocks((Long)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_IS_BASED_ON_UNDERLYING_REDUNDANCY:
				setSVIsBasedOnUnderlyingRedundancy((Boolean)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_NO_SINGLE_POINT_OF_FAILURE:
				setSVNoSinglePointOfFailure((Boolean)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_DATA_REDUNDANCY:
				setSVDataRedundancy((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_PACKAGE_REDUNDANCY:
				setSVPackageRedundancy((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_DELTA_RESERVATION:
				setSVDeltaReservation((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_USAGE:
				setSVUsage((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_OTHER_USAGE_DESCRIPTION:
				setSVOtherUsageDescription((String)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_CLIENT_SETTABLE_USAGE:
				getSVClientSettableUsage().clear();
				getSVClientSettableUsage().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_INSTANCE_ID:
				setSSInstanceID((String)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_ELEMENT_NAME:
				setSSElementName((String)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_NO_SINGLE_POINT_OF_FAILURE:
				setSSNoSinglePointOfFailure((Boolean)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_DATA_REDUNDANCY_MIN:
				setSSDataRedundancyMin((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_DATA_REDUNDANCY_MAX:
				setSSDataRedundancyMax((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_DATA_REDUNDANCY_GOAL:
				setSSDataRedundancyGoal((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_PACKAGE_REDUNDANCY_MIN:
				setSSPackageRedundancyMin((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_PACKAGE_REDUNDANCY_MAX:
				setSSPackageRedundancyMax((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_PACKAGE_REDUNDANCY_GOAL:
				setSSPackageRedundancyGoal((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_CHANGEABLE_TYPE:
				setSSChangeableType((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__AFSP_SPACE_CONSUMED:
				setAFSPSpaceConsumed((Long)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SP_INSTANCE_ID:
				setSPInstanceID((String)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SP_POOL_ID:
				setSPPoolID((String)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_OTHER_IDENTIFYING_INFO:
				getSVOtherIdentifyingInfo().clear();
				getSVOtherIdentifyingInfo().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_IDENTIFYING_DESCRIPTIONS:
				getSVIdentifyingDescriptions().clear();
				getSVIdentifyingDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_ELEMENT_NAME:
				setSVElementName((String)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_PRIMORDIAL:
				setSVPrimordial((Boolean)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_EXTENT_DISCRIMINATOR:
				getSVExtentDiscriminator().clear();
				getSVExtentDiscriminator().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_EXTENT_STRIPE_LENGTH:
				setSSExtentStripeLength((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_EXTENT_STRIPE_LENGTH_MIN:
				setSSExtentStripeLengthMin((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_EXTENT_STRIPE_LENGTH_MAX:
				setSSExtentStripeLengthMax((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_PARITY_LAYOUT:
				setSSParityLayout((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_USER_DATA_STRIPE_DEPTH:
				setSSUserDataStripeDepth((Long)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_USER_DATA_STRIPE_DEPTH_MIN:
				setSSUserDataStripeDepthMin((Long)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_USER_DATA_STRIPE_DEPTH_MAX:
				setSSUserDataStripeDepthMax((Long)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_STORAGE_POOL_INITIAL_USAGE:
				setSSStoragePoolInitialUsage((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_STORAGE_EXTENT_INITIAL_USAGE:
				setSSStorageExtentInitialUsage((Integer)newValue);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_IS_COMPOSITE:
				setSVIsComposite((Boolean)newValue);
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
			case CimPackage.CIM_VOLUME_VIEW__SV_SYSTEM_CREATION_CLASS_NAME:
				setSVSystemCreationClassName(SV_SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_SYSTEM_NAME:
				setSVSystemName(SV_SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_CREATION_CLASS_NAME:
				setSVCreationClassName(SV_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_DEVICE_ID:
				setSVDeviceID(SV_DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_NAME:
				setSVName(SV_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_NAME_FORMAT:
				setSVNameFormat(SV_NAME_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_NAME_NAMESPACE:
				setSVNameNamespace(SV_NAME_NAMESPACE_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_EXTENT_STATUS:
				getSVExtentStatus().clear();
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_OPERATIONAL_STATUS:
				getSVOperationalStatus().clear();
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_BLOCK_SIZE:
				setSVBlockSize(SV_BLOCK_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_NUMBER_OF_BLOCKS:
				setSVNumberOfBlocks(SV_NUMBER_OF_BLOCKS_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_CONSUMABLE_BLOCKS:
				setSVConsumableBlocks(SV_CONSUMABLE_BLOCKS_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_IS_BASED_ON_UNDERLYING_REDUNDANCY:
				setSVIsBasedOnUnderlyingRedundancy(SV_IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_NO_SINGLE_POINT_OF_FAILURE:
				setSVNoSinglePointOfFailure(SV_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_DATA_REDUNDANCY:
				setSVDataRedundancy(SV_DATA_REDUNDANCY_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_PACKAGE_REDUNDANCY:
				setSVPackageRedundancy(SV_PACKAGE_REDUNDANCY_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_DELTA_RESERVATION:
				setSVDeltaReservation(SV_DELTA_RESERVATION_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_USAGE:
				setSVUsage(SV_USAGE_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_OTHER_USAGE_DESCRIPTION:
				setSVOtherUsageDescription(SV_OTHER_USAGE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_CLIENT_SETTABLE_USAGE:
				getSVClientSettableUsage().clear();
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_INSTANCE_ID:
				setSSInstanceID(SS_INSTANCE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_ELEMENT_NAME:
				setSSElementName(SS_ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_NO_SINGLE_POINT_OF_FAILURE:
				setSSNoSinglePointOfFailure(SS_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_DATA_REDUNDANCY_MIN:
				setSSDataRedundancyMin(SS_DATA_REDUNDANCY_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_DATA_REDUNDANCY_MAX:
				setSSDataRedundancyMax(SS_DATA_REDUNDANCY_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_DATA_REDUNDANCY_GOAL:
				setSSDataRedundancyGoal(SS_DATA_REDUNDANCY_GOAL_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_PACKAGE_REDUNDANCY_MIN:
				setSSPackageRedundancyMin(SS_PACKAGE_REDUNDANCY_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_PACKAGE_REDUNDANCY_MAX:
				setSSPackageRedundancyMax(SS_PACKAGE_REDUNDANCY_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_PACKAGE_REDUNDANCY_GOAL:
				setSSPackageRedundancyGoal(SS_PACKAGE_REDUNDANCY_GOAL_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_CHANGEABLE_TYPE:
				setSSChangeableType(SS_CHANGEABLE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__AFSP_SPACE_CONSUMED:
				setAFSPSpaceConsumed(AFSP_SPACE_CONSUMED_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SP_INSTANCE_ID:
				setSPInstanceID(SP_INSTANCE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SP_POOL_ID:
				setSPPoolID(SP_POOL_ID_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_OTHER_IDENTIFYING_INFO:
				getSVOtherIdentifyingInfo().clear();
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_IDENTIFYING_DESCRIPTIONS:
				getSVIdentifyingDescriptions().clear();
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_ELEMENT_NAME:
				setSVElementName(SV_ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_PRIMORDIAL:
				setSVPrimordial(SV_PRIMORDIAL_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_EXTENT_DISCRIMINATOR:
				getSVExtentDiscriminator().clear();
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_EXTENT_STRIPE_LENGTH:
				setSSExtentStripeLength(SS_EXTENT_STRIPE_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_EXTENT_STRIPE_LENGTH_MIN:
				setSSExtentStripeLengthMin(SS_EXTENT_STRIPE_LENGTH_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_EXTENT_STRIPE_LENGTH_MAX:
				setSSExtentStripeLengthMax(SS_EXTENT_STRIPE_LENGTH_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_PARITY_LAYOUT:
				setSSParityLayout(SS_PARITY_LAYOUT_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_USER_DATA_STRIPE_DEPTH:
				setSSUserDataStripeDepth(SS_USER_DATA_STRIPE_DEPTH_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_USER_DATA_STRIPE_DEPTH_MIN:
				setSSUserDataStripeDepthMin(SS_USER_DATA_STRIPE_DEPTH_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_USER_DATA_STRIPE_DEPTH_MAX:
				setSSUserDataStripeDepthMax(SS_USER_DATA_STRIPE_DEPTH_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_STORAGE_POOL_INITIAL_USAGE:
				setSSStoragePoolInitialUsage(SS_STORAGE_POOL_INITIAL_USAGE_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SS_STORAGE_EXTENT_INITIAL_USAGE:
				setSSStorageExtentInitialUsage(SS_STORAGE_EXTENT_INITIAL_USAGE_EDEFAULT);
				return;
			case CimPackage.CIM_VOLUME_VIEW__SV_IS_COMPOSITE:
				setSVIsComposite(SV_IS_COMPOSITE_EDEFAULT);
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
			case CimPackage.CIM_VOLUME_VIEW__SV_SYSTEM_CREATION_CLASS_NAME:
				return SV_SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? svSystemCreationClassName != null : !SV_SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(svSystemCreationClassName);
			case CimPackage.CIM_VOLUME_VIEW__SV_SYSTEM_NAME:
				return SV_SYSTEM_NAME_EDEFAULT == null ? svSystemName != null : !SV_SYSTEM_NAME_EDEFAULT.equals(svSystemName);
			case CimPackage.CIM_VOLUME_VIEW__SV_CREATION_CLASS_NAME:
				return SV_CREATION_CLASS_NAME_EDEFAULT == null ? svCreationClassName != null : !SV_CREATION_CLASS_NAME_EDEFAULT.equals(svCreationClassName);
			case CimPackage.CIM_VOLUME_VIEW__SV_DEVICE_ID:
				return SV_DEVICE_ID_EDEFAULT == null ? svDeviceID != null : !SV_DEVICE_ID_EDEFAULT.equals(svDeviceID);
			case CimPackage.CIM_VOLUME_VIEW__SV_NAME:
				return SV_NAME_EDEFAULT == null ? svName != null : !SV_NAME_EDEFAULT.equals(svName);
			case CimPackage.CIM_VOLUME_VIEW__SV_NAME_FORMAT:
				return SV_NAME_FORMAT_EDEFAULT == null ? svNameFormat != null : !SV_NAME_FORMAT_EDEFAULT.equals(svNameFormat);
			case CimPackage.CIM_VOLUME_VIEW__SV_NAME_NAMESPACE:
				return SV_NAME_NAMESPACE_EDEFAULT == null ? svNameNamespace != null : !SV_NAME_NAMESPACE_EDEFAULT.equals(svNameNamespace);
			case CimPackage.CIM_VOLUME_VIEW__SV_EXTENT_STATUS:
				return svExtentStatus != null && !svExtentStatus.isEmpty();
			case CimPackage.CIM_VOLUME_VIEW__SV_OPERATIONAL_STATUS:
				return svOperationalStatus != null && !svOperationalStatus.isEmpty();
			case CimPackage.CIM_VOLUME_VIEW__SV_BLOCK_SIZE:
				return SV_BLOCK_SIZE_EDEFAULT == null ? svBlockSize != null : !SV_BLOCK_SIZE_EDEFAULT.equals(svBlockSize);
			case CimPackage.CIM_VOLUME_VIEW__SV_NUMBER_OF_BLOCKS:
				return SV_NUMBER_OF_BLOCKS_EDEFAULT == null ? svNumberOfBlocks != null : !SV_NUMBER_OF_BLOCKS_EDEFAULT.equals(svNumberOfBlocks);
			case CimPackage.CIM_VOLUME_VIEW__SV_CONSUMABLE_BLOCKS:
				return SV_CONSUMABLE_BLOCKS_EDEFAULT == null ? svConsumableBlocks != null : !SV_CONSUMABLE_BLOCKS_EDEFAULT.equals(svConsumableBlocks);
			case CimPackage.CIM_VOLUME_VIEW__SV_IS_BASED_ON_UNDERLYING_REDUNDANCY:
				return SV_IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT == null ? svIsBasedOnUnderlyingRedundancy != null : !SV_IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT.equals(svIsBasedOnUnderlyingRedundancy);
			case CimPackage.CIM_VOLUME_VIEW__SV_NO_SINGLE_POINT_OF_FAILURE:
				return SV_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT == null ? svNoSinglePointOfFailure != null : !SV_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT.equals(svNoSinglePointOfFailure);
			case CimPackage.CIM_VOLUME_VIEW__SV_DATA_REDUNDANCY:
				return SV_DATA_REDUNDANCY_EDEFAULT == null ? svDataRedundancy != null : !SV_DATA_REDUNDANCY_EDEFAULT.equals(svDataRedundancy);
			case CimPackage.CIM_VOLUME_VIEW__SV_PACKAGE_REDUNDANCY:
				return SV_PACKAGE_REDUNDANCY_EDEFAULT == null ? svPackageRedundancy != null : !SV_PACKAGE_REDUNDANCY_EDEFAULT.equals(svPackageRedundancy);
			case CimPackage.CIM_VOLUME_VIEW__SV_DELTA_RESERVATION:
				return SV_DELTA_RESERVATION_EDEFAULT == null ? svDeltaReservation != null : !SV_DELTA_RESERVATION_EDEFAULT.equals(svDeltaReservation);
			case CimPackage.CIM_VOLUME_VIEW__SV_USAGE:
				return SV_USAGE_EDEFAULT == null ? svUsage != null : !SV_USAGE_EDEFAULT.equals(svUsage);
			case CimPackage.CIM_VOLUME_VIEW__SV_OTHER_USAGE_DESCRIPTION:
				return SV_OTHER_USAGE_DESCRIPTION_EDEFAULT == null ? svOtherUsageDescription != null : !SV_OTHER_USAGE_DESCRIPTION_EDEFAULT.equals(svOtherUsageDescription);
			case CimPackage.CIM_VOLUME_VIEW__SV_CLIENT_SETTABLE_USAGE:
				return svClientSettableUsage != null && !svClientSettableUsage.isEmpty();
			case CimPackage.CIM_VOLUME_VIEW__SS_INSTANCE_ID:
				return SS_INSTANCE_ID_EDEFAULT == null ? ssInstanceID != null : !SS_INSTANCE_ID_EDEFAULT.equals(ssInstanceID);
			case CimPackage.CIM_VOLUME_VIEW__SS_ELEMENT_NAME:
				return SS_ELEMENT_NAME_EDEFAULT == null ? ssElementName != null : !SS_ELEMENT_NAME_EDEFAULT.equals(ssElementName);
			case CimPackage.CIM_VOLUME_VIEW__SS_NO_SINGLE_POINT_OF_FAILURE:
				return SS_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT == null ? ssNoSinglePointOfFailure != null : !SS_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT.equals(ssNoSinglePointOfFailure);
			case CimPackage.CIM_VOLUME_VIEW__SS_DATA_REDUNDANCY_MIN:
				return SS_DATA_REDUNDANCY_MIN_EDEFAULT == null ? ssDataRedundancyMin != null : !SS_DATA_REDUNDANCY_MIN_EDEFAULT.equals(ssDataRedundancyMin);
			case CimPackage.CIM_VOLUME_VIEW__SS_DATA_REDUNDANCY_MAX:
				return SS_DATA_REDUNDANCY_MAX_EDEFAULT == null ? ssDataRedundancyMax != null : !SS_DATA_REDUNDANCY_MAX_EDEFAULT.equals(ssDataRedundancyMax);
			case CimPackage.CIM_VOLUME_VIEW__SS_DATA_REDUNDANCY_GOAL:
				return SS_DATA_REDUNDANCY_GOAL_EDEFAULT == null ? ssDataRedundancyGoal != null : !SS_DATA_REDUNDANCY_GOAL_EDEFAULT.equals(ssDataRedundancyGoal);
			case CimPackage.CIM_VOLUME_VIEW__SS_PACKAGE_REDUNDANCY_MIN:
				return SS_PACKAGE_REDUNDANCY_MIN_EDEFAULT == null ? ssPackageRedundancyMin != null : !SS_PACKAGE_REDUNDANCY_MIN_EDEFAULT.equals(ssPackageRedundancyMin);
			case CimPackage.CIM_VOLUME_VIEW__SS_PACKAGE_REDUNDANCY_MAX:
				return SS_PACKAGE_REDUNDANCY_MAX_EDEFAULT == null ? ssPackageRedundancyMax != null : !SS_PACKAGE_REDUNDANCY_MAX_EDEFAULT.equals(ssPackageRedundancyMax);
			case CimPackage.CIM_VOLUME_VIEW__SS_PACKAGE_REDUNDANCY_GOAL:
				return SS_PACKAGE_REDUNDANCY_GOAL_EDEFAULT == null ? ssPackageRedundancyGoal != null : !SS_PACKAGE_REDUNDANCY_GOAL_EDEFAULT.equals(ssPackageRedundancyGoal);
			case CimPackage.CIM_VOLUME_VIEW__SS_CHANGEABLE_TYPE:
				return SS_CHANGEABLE_TYPE_EDEFAULT == null ? ssChangeableType != null : !SS_CHANGEABLE_TYPE_EDEFAULT.equals(ssChangeableType);
			case CimPackage.CIM_VOLUME_VIEW__AFSP_SPACE_CONSUMED:
				return AFSP_SPACE_CONSUMED_EDEFAULT == null ? afspSpaceConsumed != null : !AFSP_SPACE_CONSUMED_EDEFAULT.equals(afspSpaceConsumed);
			case CimPackage.CIM_VOLUME_VIEW__SP_INSTANCE_ID:
				return SP_INSTANCE_ID_EDEFAULT == null ? spInstanceID != null : !SP_INSTANCE_ID_EDEFAULT.equals(spInstanceID);
			case CimPackage.CIM_VOLUME_VIEW__SP_POOL_ID:
				return SP_POOL_ID_EDEFAULT == null ? spPoolID != null : !SP_POOL_ID_EDEFAULT.equals(spPoolID);
			case CimPackage.CIM_VOLUME_VIEW__SV_OTHER_IDENTIFYING_INFO:
				return svOtherIdentifyingInfo != null && !svOtherIdentifyingInfo.isEmpty();
			case CimPackage.CIM_VOLUME_VIEW__SV_IDENTIFYING_DESCRIPTIONS:
				return svIdentifyingDescriptions != null && !svIdentifyingDescriptions.isEmpty();
			case CimPackage.CIM_VOLUME_VIEW__SV_ELEMENT_NAME:
				return SV_ELEMENT_NAME_EDEFAULT == null ? svElementName != null : !SV_ELEMENT_NAME_EDEFAULT.equals(svElementName);
			case CimPackage.CIM_VOLUME_VIEW__SV_PRIMORDIAL:
				return SV_PRIMORDIAL_EDEFAULT == null ? svPrimordial != null : !SV_PRIMORDIAL_EDEFAULT.equals(svPrimordial);
			case CimPackage.CIM_VOLUME_VIEW__SV_EXTENT_DISCRIMINATOR:
				return svExtentDiscriminator != null && !svExtentDiscriminator.isEmpty();
			case CimPackage.CIM_VOLUME_VIEW__SS_EXTENT_STRIPE_LENGTH:
				return SS_EXTENT_STRIPE_LENGTH_EDEFAULT == null ? ssExtentStripeLength != null : !SS_EXTENT_STRIPE_LENGTH_EDEFAULT.equals(ssExtentStripeLength);
			case CimPackage.CIM_VOLUME_VIEW__SS_EXTENT_STRIPE_LENGTH_MIN:
				return SS_EXTENT_STRIPE_LENGTH_MIN_EDEFAULT == null ? ssExtentStripeLengthMin != null : !SS_EXTENT_STRIPE_LENGTH_MIN_EDEFAULT.equals(ssExtentStripeLengthMin);
			case CimPackage.CIM_VOLUME_VIEW__SS_EXTENT_STRIPE_LENGTH_MAX:
				return SS_EXTENT_STRIPE_LENGTH_MAX_EDEFAULT == null ? ssExtentStripeLengthMax != null : !SS_EXTENT_STRIPE_LENGTH_MAX_EDEFAULT.equals(ssExtentStripeLengthMax);
			case CimPackage.CIM_VOLUME_VIEW__SS_PARITY_LAYOUT:
				return SS_PARITY_LAYOUT_EDEFAULT == null ? ssParityLayout != null : !SS_PARITY_LAYOUT_EDEFAULT.equals(ssParityLayout);
			case CimPackage.CIM_VOLUME_VIEW__SS_USER_DATA_STRIPE_DEPTH:
				return SS_USER_DATA_STRIPE_DEPTH_EDEFAULT == null ? ssUserDataStripeDepth != null : !SS_USER_DATA_STRIPE_DEPTH_EDEFAULT.equals(ssUserDataStripeDepth);
			case CimPackage.CIM_VOLUME_VIEW__SS_USER_DATA_STRIPE_DEPTH_MIN:
				return SS_USER_DATA_STRIPE_DEPTH_MIN_EDEFAULT == null ? ssUserDataStripeDepthMin != null : !SS_USER_DATA_STRIPE_DEPTH_MIN_EDEFAULT.equals(ssUserDataStripeDepthMin);
			case CimPackage.CIM_VOLUME_VIEW__SS_USER_DATA_STRIPE_DEPTH_MAX:
				return SS_USER_DATA_STRIPE_DEPTH_MAX_EDEFAULT == null ? ssUserDataStripeDepthMax != null : !SS_USER_DATA_STRIPE_DEPTH_MAX_EDEFAULT.equals(ssUserDataStripeDepthMax);
			case CimPackage.CIM_VOLUME_VIEW__SS_STORAGE_POOL_INITIAL_USAGE:
				return SS_STORAGE_POOL_INITIAL_USAGE_EDEFAULT == null ? ssStoragePoolInitialUsage != null : !SS_STORAGE_POOL_INITIAL_USAGE_EDEFAULT.equals(ssStoragePoolInitialUsage);
			case CimPackage.CIM_VOLUME_VIEW__SS_STORAGE_EXTENT_INITIAL_USAGE:
				return SS_STORAGE_EXTENT_INITIAL_USAGE_EDEFAULT == null ? ssStorageExtentInitialUsage != null : !SS_STORAGE_EXTENT_INITIAL_USAGE_EDEFAULT.equals(ssStorageExtentInitialUsage);
			case CimPackage.CIM_VOLUME_VIEW__SV_IS_COMPOSITE:
				return SV_IS_COMPOSITE_EDEFAULT == null ? svIsComposite != null : !SV_IS_COMPOSITE_EDEFAULT.equals(svIsComposite);
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
		result.append(" (SVSystemCreationClassName: ");
		result.append(svSystemCreationClassName);
		result.append(", SVSystemName: ");
		result.append(svSystemName);
		result.append(", SVCreationClassName: ");
		result.append(svCreationClassName);
		result.append(", SVDeviceID: ");
		result.append(svDeviceID);
		result.append(", SVName: ");
		result.append(svName);
		result.append(", SVNameFormat: ");
		result.append(svNameFormat);
		result.append(", SVNameNamespace: ");
		result.append(svNameNamespace);
		result.append(", SVExtentStatus: ");
		result.append(svExtentStatus);
		result.append(", SVOperationalStatus: ");
		result.append(svOperationalStatus);
		result.append(", SVBlockSize: ");
		result.append(svBlockSize);
		result.append(", SVNumberOfBlocks: ");
		result.append(svNumberOfBlocks);
		result.append(", SVConsumableBlocks: ");
		result.append(svConsumableBlocks);
		result.append(", SVIsBasedOnUnderlyingRedundancy: ");
		result.append(svIsBasedOnUnderlyingRedundancy);
		result.append(", SVNoSinglePointOfFailure: ");
		result.append(svNoSinglePointOfFailure);
		result.append(", SVDataRedundancy: ");
		result.append(svDataRedundancy);
		result.append(", SVPackageRedundancy: ");
		result.append(svPackageRedundancy);
		result.append(", SVDeltaReservation: ");
		result.append(svDeltaReservation);
		result.append(", SVUsage: ");
		result.append(svUsage);
		result.append(", SVOtherUsageDescription: ");
		result.append(svOtherUsageDescription);
		result.append(", SVClientSettableUsage: ");
		result.append(svClientSettableUsage);
		result.append(", SSInstanceID: ");
		result.append(ssInstanceID);
		result.append(", SSElementName: ");
		result.append(ssElementName);
		result.append(", SSNoSinglePointOfFailure: ");
		result.append(ssNoSinglePointOfFailure);
		result.append(", SSDataRedundancyMin: ");
		result.append(ssDataRedundancyMin);
		result.append(", SSDataRedundancyMax: ");
		result.append(ssDataRedundancyMax);
		result.append(", SSDataRedundancyGoal: ");
		result.append(ssDataRedundancyGoal);
		result.append(", SSPackageRedundancyMin: ");
		result.append(ssPackageRedundancyMin);
		result.append(", SSPackageRedundancyMax: ");
		result.append(ssPackageRedundancyMax);
		result.append(", SSPackageRedundancyGoal: ");
		result.append(ssPackageRedundancyGoal);
		result.append(", SSChangeableType: ");
		result.append(ssChangeableType);
		result.append(", AFSPSpaceConsumed: ");
		result.append(afspSpaceConsumed);
		result.append(", SPInstanceID: ");
		result.append(spInstanceID);
		result.append(", SPPoolID: ");
		result.append(spPoolID);
		result.append(", SVOtherIdentifyingInfo: ");
		result.append(svOtherIdentifyingInfo);
		result.append(", SVIdentifyingDescriptions: ");
		result.append(svIdentifyingDescriptions);
		result.append(", SVElementName: ");
		result.append(svElementName);
		result.append(", SVPrimordial: ");
		result.append(svPrimordial);
		result.append(", SVExtentDiscriminator: ");
		result.append(svExtentDiscriminator);
		result.append(", SSExtentStripeLength: ");
		result.append(ssExtentStripeLength);
		result.append(", SSExtentStripeLengthMin: ");
		result.append(ssExtentStripeLengthMin);
		result.append(", SSExtentStripeLengthMax: ");
		result.append(ssExtentStripeLengthMax);
		result.append(", SSParityLayout: ");
		result.append(ssParityLayout);
		result.append(", SSUserDataStripeDepth: ");
		result.append(ssUserDataStripeDepth);
		result.append(", SSUserDataStripeDepthMin: ");
		result.append(ssUserDataStripeDepthMin);
		result.append(", SSUserDataStripeDepthMax: ");
		result.append(ssUserDataStripeDepthMax);
		result.append(", SSStoragePoolInitialUsage: ");
		result.append(ssStoragePoolInitialUsage);
		result.append(", SSStorageExtentInitialUsage: ");
		result.append(ssStorageExtentInitialUsage);
		result.append(", SVIsComposite: ");
		result.append(svIsComposite);
		result.append(')');
		return result.toString();
	}

} //CIM_VolumeViewImpl

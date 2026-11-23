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

import org.dmtf.cim.CIM_ReplicaPairView;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Replica Pair View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceSystemCreationClassName <em>SV Source System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceSystemName <em>SV Source System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceCreationClassName <em>SV Source Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceDeviceID <em>SV Source Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceName <em>SV Source Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceNameFormat <em>SV Source Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceNameNamespace <em>SV Source Name Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceExtentStatus <em>SV Source Extent Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceOperationalStatus <em>SV Source Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceBlockSize <em>SV Source Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceNumberOfBlocks <em>SV Source Number Of Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceConsumableBlocks <em>SV Source Consumable Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourcePrimordial <em>SV Source Primordial</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceIsBasedOnUnderlyingRedundancy <em>SV Source Is Based On Underlying Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceNoSinglePointOfFailure <em>SV Source No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceDataRedundancy <em>SV Source Data Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourcePackageRedundancy <em>SV Source Package Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceDeltaReservation <em>SV Source Delta Reservation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceExtentDiscriminator <em>SV Source Extent Discriminator</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceOtherIdentifyingInfo <em>SV Source Other Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceIdentifyingDescriptions <em>SV Source Identifying Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceElementName <em>SV Source Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceUsage <em>SV Source Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceOtherUsageDescription <em>SV Source Other Usage Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVSourceClientSettableUsage <em>SV Source Client Settable Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSSWhenSynced <em>SS When Synced</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSSSyncMaintained <em>SS Sync Maintained</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSSCopyType <em>SS Copy Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSSSyncState <em>SS Sync State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSSCopyPriority <em>SS Copy Priority</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSSSyncType <em>SS Sync Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSSMode <em>SS Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSSProgressStatus <em>SS Progress Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetSystemCreationClassName <em>SV Target System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetSystemName <em>SV Target System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetCreationClassName <em>SV Target Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetDeviceID <em>SV Target Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetName <em>SV Target Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetNameFormat <em>SV Target Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetNameNamespace <em>SV Target Name Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetExtentStatus <em>SV Target Extent Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetOperationalStatus <em>SV Target Operational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetBlockSize <em>SV Target Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetNumberOfBlocks <em>SV Target Number Of Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetConsumableBlocks <em>SV Target Consumable Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetPrimordial <em>SV Target Primordial</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetIsBasedOnUnderlyingRedundancy <em>SV Target Is Based On Underlying Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetNoSinglePointOfFailure <em>SV Target No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetDataRedundancy <em>SV Target Data Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetPackageRedundancy <em>SV Target Package Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetDeltaReservation <em>SV Target Delta Reservation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetExtentDiscriminator <em>SV Target Extent Discriminator</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetOtherIdentifyingInfo <em>SV Target Other Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetIdentifyingDescriptions <em>SV Target Identifying Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetElementName <em>SV Target Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetUsage <em>SV Target Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetOtherUsageDescription <em>SV Target Other Usage Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_ReplicaPairViewImpl#getSVTargetClientSettableUsage <em>SV Target Client Settable Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_ReplicaPairViewImpl extends CIM_LogicalDeviceViewImpl implements CIM_ReplicaPairView {
	/**
	 * The default value of the '{@link #getSVSourceSystemCreationClassName() <em>SV Source System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_SOURCE_SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceSystemCreationClassName() <em>SV Source System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String svSourceSystemCreationClassName = SV_SOURCE_SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourceSystemName() <em>SV Source System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_SOURCE_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceSystemName() <em>SV Source System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceSystemName()
	 * @generated
	 * @ordered
	 */
	protected String svSourceSystemName = SV_SOURCE_SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourceCreationClassName() <em>SV Source Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_SOURCE_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceCreationClassName() <em>SV Source Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String svSourceCreationClassName = SV_SOURCE_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourceDeviceID() <em>SV Source Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_SOURCE_DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceDeviceID() <em>SV Source Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceDeviceID()
	 * @generated
	 * @ordered
	 */
	protected String svSourceDeviceID = SV_SOURCE_DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourceName() <em>SV Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_SOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceName() <em>SV Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceName()
	 * @generated
	 * @ordered
	 */
	protected String svSourceName = SV_SOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourceNameFormat() <em>SV Source Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceNameFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_SOURCE_NAME_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceNameFormat() <em>SV Source Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceNameFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer svSourceNameFormat = SV_SOURCE_NAME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourceNameNamespace() <em>SV Source Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceNameNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_SOURCE_NAME_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceNameNamespace() <em>SV Source Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceNameNamespace()
	 * @generated
	 * @ordered
	 */
	protected Integer svSourceNameNamespace = SV_SOURCE_NAME_NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSVSourceExtentStatus() <em>SV Source Extent Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceExtentStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> svSourceExtentStatus;

	/**
	 * The cached value of the '{@link #getSVSourceOperationalStatus() <em>SV Source Operational Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> svSourceOperationalStatus;

	/**
	 * The default value of the '{@link #getSVSourceBlockSize() <em>SV Source Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long SV_SOURCE_BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceBlockSize() <em>SV Source Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Long svSourceBlockSize = SV_SOURCE_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourceNumberOfBlocks() <em>SV Source Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceNumberOfBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final Long SV_SOURCE_NUMBER_OF_BLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceNumberOfBlocks() <em>SV Source Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceNumberOfBlocks()
	 * @generated
	 * @ordered
	 */
	protected Long svSourceNumberOfBlocks = SV_SOURCE_NUMBER_OF_BLOCKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourceConsumableBlocks() <em>SV Source Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceConsumableBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final Long SV_SOURCE_CONSUMABLE_BLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceConsumableBlocks() <em>SV Source Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceConsumableBlocks()
	 * @generated
	 * @ordered
	 */
	protected Long svSourceConsumableBlocks = SV_SOURCE_CONSUMABLE_BLOCKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourcePrimordial() <em>SV Source Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourcePrimordial()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SV_SOURCE_PRIMORDIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourcePrimordial() <em>SV Source Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourcePrimordial()
	 * @generated
	 * @ordered
	 */
	protected Boolean svSourcePrimordial = SV_SOURCE_PRIMORDIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourceIsBasedOnUnderlyingRedundancy() <em>SV Source Is Based On Underlying Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceIsBasedOnUnderlyingRedundancy()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SV_SOURCE_IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceIsBasedOnUnderlyingRedundancy() <em>SV Source Is Based On Underlying Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceIsBasedOnUnderlyingRedundancy()
	 * @generated
	 * @ordered
	 */
	protected Boolean svSourceIsBasedOnUnderlyingRedundancy = SV_SOURCE_IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourceNoSinglePointOfFailure() <em>SV Source No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceNoSinglePointOfFailure()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SV_SOURCE_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceNoSinglePointOfFailure() <em>SV Source No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceNoSinglePointOfFailure()
	 * @generated
	 * @ordered
	 */
	protected Boolean svSourceNoSinglePointOfFailure = SV_SOURCE_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourceDataRedundancy() <em>SV Source Data Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceDataRedundancy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_SOURCE_DATA_REDUNDANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceDataRedundancy() <em>SV Source Data Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceDataRedundancy()
	 * @generated
	 * @ordered
	 */
	protected Integer svSourceDataRedundancy = SV_SOURCE_DATA_REDUNDANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourcePackageRedundancy() <em>SV Source Package Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourcePackageRedundancy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_SOURCE_PACKAGE_REDUNDANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourcePackageRedundancy() <em>SV Source Package Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourcePackageRedundancy()
	 * @generated
	 * @ordered
	 */
	protected Integer svSourcePackageRedundancy = SV_SOURCE_PACKAGE_REDUNDANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourceDeltaReservation() <em>SV Source Delta Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceDeltaReservation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_SOURCE_DELTA_RESERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceDeltaReservation() <em>SV Source Delta Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceDeltaReservation()
	 * @generated
	 * @ordered
	 */
	protected Integer svSourceDeltaReservation = SV_SOURCE_DELTA_RESERVATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSVSourceExtentDiscriminator() <em>SV Source Extent Discriminator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceExtentDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected EList<String> svSourceExtentDiscriminator;

	/**
	 * The cached value of the '{@link #getSVSourceOtherIdentifyingInfo() <em>SV Source Other Identifying Info</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceOtherIdentifyingInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<String> svSourceOtherIdentifyingInfo;

	/**
	 * The cached value of the '{@link #getSVSourceIdentifyingDescriptions() <em>SV Source Identifying Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceIdentifyingDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> svSourceIdentifyingDescriptions;

	/**
	 * The default value of the '{@link #getSVSourceElementName() <em>SV Source Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_SOURCE_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceElementName() <em>SV Source Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceElementName()
	 * @generated
	 * @ordered
	 */
	protected String svSourceElementName = SV_SOURCE_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourceUsage() <em>SV Source Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_SOURCE_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceUsage() <em>SV Source Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceUsage()
	 * @generated
	 * @ordered
	 */
	protected Integer svSourceUsage = SV_SOURCE_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSourceOtherUsageDescription() <em>SV Source Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceOtherUsageDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_SOURCE_OTHER_USAGE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSourceOtherUsageDescription() <em>SV Source Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceOtherUsageDescription()
	 * @generated
	 * @ordered
	 */
	protected String svSourceOtherUsageDescription = SV_SOURCE_OTHER_USAGE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSVSourceClientSettableUsage() <em>SV Source Client Settable Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSourceClientSettableUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> svSourceClientSettableUsage;

	/**
	 * The default value of the '{@link #getSSWhenSynced() <em>SS When Synced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSWhenSynced()
	 * @generated
	 * @ordered
	 */
	protected static final String SS_WHEN_SYNCED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSWhenSynced() <em>SS When Synced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSWhenSynced()
	 * @generated
	 * @ordered
	 */
	protected String ssWhenSynced = SS_WHEN_SYNCED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSSyncMaintained() <em>SS Sync Maintained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSSyncMaintained()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SS_SYNC_MAINTAINED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSSyncMaintained() <em>SS Sync Maintained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSSyncMaintained()
	 * @generated
	 * @ordered
	 */
	protected Boolean ssSyncMaintained = SS_SYNC_MAINTAINED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSCopyType() <em>SS Copy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSCopyType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_COPY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSCopyType() <em>SS Copy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSCopyType()
	 * @generated
	 * @ordered
	 */
	protected Integer ssCopyType = SS_COPY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSSyncState() <em>SS Sync State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSSyncState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_SYNC_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSSyncState() <em>SS Sync State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSSyncState()
	 * @generated
	 * @ordered
	 */
	protected Integer ssSyncState = SS_SYNC_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSCopyPriority() <em>SS Copy Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSCopyPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_COPY_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSCopyPriority() <em>SS Copy Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSCopyPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer ssCopyPriority = SS_COPY_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSSyncType() <em>SS Sync Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSSyncType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_SYNC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSSyncType() <em>SS Sync Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSSyncType()
	 * @generated
	 * @ordered
	 */
	protected Integer ssSyncType = SS_SYNC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSMode() <em>SS Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSMode() <em>SS Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSMode()
	 * @generated
	 * @ordered
	 */
	protected Integer ssMode = SS_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSSProgressStatus() <em>SS Progress Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSProgressStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SS_PROGRESS_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSSProgressStatus() <em>SS Progress Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSSProgressStatus()
	 * @generated
	 * @ordered
	 */
	protected Integer ssProgressStatus = SS_PROGRESS_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetSystemCreationClassName() <em>SV Target System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_TARGET_SYSTEM_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetSystemCreationClassName() <em>SV Target System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetSystemCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String svTargetSystemCreationClassName = SV_TARGET_SYSTEM_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetSystemName() <em>SV Target System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_TARGET_SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetSystemName() <em>SV Target System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetSystemName()
	 * @generated
	 * @ordered
	 */
	protected String svTargetSystemName = SV_TARGET_SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetCreationClassName() <em>SV Target Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_TARGET_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetCreationClassName() <em>SV Target Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String svTargetCreationClassName = SV_TARGET_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetDeviceID() <em>SV Target Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetDeviceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_TARGET_DEVICE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetDeviceID() <em>SV Target Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetDeviceID()
	 * @generated
	 * @ordered
	 */
	protected String svTargetDeviceID = SV_TARGET_DEVICE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetName() <em>SV Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetName()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_TARGET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetName() <em>SV Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetName()
	 * @generated
	 * @ordered
	 */
	protected String svTargetName = SV_TARGET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetNameFormat() <em>SV Target Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetNameFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_TARGET_NAME_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetNameFormat() <em>SV Target Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetNameFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer svTargetNameFormat = SV_TARGET_NAME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetNameNamespace() <em>SV Target Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetNameNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_TARGET_NAME_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetNameNamespace() <em>SV Target Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetNameNamespace()
	 * @generated
	 * @ordered
	 */
	protected Integer svTargetNameNamespace = SV_TARGET_NAME_NAMESPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSVTargetExtentStatus() <em>SV Target Extent Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetExtentStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> svTargetExtentStatus;

	/**
	 * The cached value of the '{@link #getSVTargetOperationalStatus() <em>SV Target Operational Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetOperationalStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> svTargetOperationalStatus;

	/**
	 * The default value of the '{@link #getSVTargetBlockSize() <em>SV Target Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long SV_TARGET_BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetBlockSize() <em>SV Target Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Long svTargetBlockSize = SV_TARGET_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetNumberOfBlocks() <em>SV Target Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetNumberOfBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final Long SV_TARGET_NUMBER_OF_BLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetNumberOfBlocks() <em>SV Target Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetNumberOfBlocks()
	 * @generated
	 * @ordered
	 */
	protected Long svTargetNumberOfBlocks = SV_TARGET_NUMBER_OF_BLOCKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetConsumableBlocks() <em>SV Target Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetConsumableBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final Long SV_TARGET_CONSUMABLE_BLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetConsumableBlocks() <em>SV Target Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetConsumableBlocks()
	 * @generated
	 * @ordered
	 */
	protected Long svTargetConsumableBlocks = SV_TARGET_CONSUMABLE_BLOCKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetPrimordial() <em>SV Target Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetPrimordial()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SV_TARGET_PRIMORDIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetPrimordial() <em>SV Target Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetPrimordial()
	 * @generated
	 * @ordered
	 */
	protected Boolean svTargetPrimordial = SV_TARGET_PRIMORDIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetIsBasedOnUnderlyingRedundancy() <em>SV Target Is Based On Underlying Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetIsBasedOnUnderlyingRedundancy()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SV_TARGET_IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetIsBasedOnUnderlyingRedundancy() <em>SV Target Is Based On Underlying Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetIsBasedOnUnderlyingRedundancy()
	 * @generated
	 * @ordered
	 */
	protected Boolean svTargetIsBasedOnUnderlyingRedundancy = SV_TARGET_IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetNoSinglePointOfFailure() <em>SV Target No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetNoSinglePointOfFailure()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SV_TARGET_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetNoSinglePointOfFailure() <em>SV Target No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetNoSinglePointOfFailure()
	 * @generated
	 * @ordered
	 */
	protected Boolean svTargetNoSinglePointOfFailure = SV_TARGET_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetDataRedundancy() <em>SV Target Data Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetDataRedundancy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_TARGET_DATA_REDUNDANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetDataRedundancy() <em>SV Target Data Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetDataRedundancy()
	 * @generated
	 * @ordered
	 */
	protected Integer svTargetDataRedundancy = SV_TARGET_DATA_REDUNDANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetPackageRedundancy() <em>SV Target Package Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetPackageRedundancy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_TARGET_PACKAGE_REDUNDANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetPackageRedundancy() <em>SV Target Package Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetPackageRedundancy()
	 * @generated
	 * @ordered
	 */
	protected Integer svTargetPackageRedundancy = SV_TARGET_PACKAGE_REDUNDANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetDeltaReservation() <em>SV Target Delta Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetDeltaReservation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_TARGET_DELTA_RESERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetDeltaReservation() <em>SV Target Delta Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetDeltaReservation()
	 * @generated
	 * @ordered
	 */
	protected Integer svTargetDeltaReservation = SV_TARGET_DELTA_RESERVATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSVTargetExtentDiscriminator() <em>SV Target Extent Discriminator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetExtentDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected EList<String> svTargetExtentDiscriminator;

	/**
	 * The cached value of the '{@link #getSVTargetOtherIdentifyingInfo() <em>SV Target Other Identifying Info</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetOtherIdentifyingInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<String> svTargetOtherIdentifyingInfo;

	/**
	 * The cached value of the '{@link #getSVTargetIdentifyingDescriptions() <em>SV Target Identifying Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetIdentifyingDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> svTargetIdentifyingDescriptions;

	/**
	 * The default value of the '{@link #getSVTargetElementName() <em>SV Target Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_TARGET_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetElementName() <em>SV Target Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetElementName()
	 * @generated
	 * @ordered
	 */
	protected String svTargetElementName = SV_TARGET_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetUsage() <em>SV Target Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_TARGET_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetUsage() <em>SV Target Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetUsage()
	 * @generated
	 * @ordered
	 */
	protected Integer svTargetUsage = SV_TARGET_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVTargetOtherUsageDescription() <em>SV Target Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetOtherUsageDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SV_TARGET_OTHER_USAGE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVTargetOtherUsageDescription() <em>SV Target Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetOtherUsageDescription()
	 * @generated
	 * @ordered
	 */
	protected String svTargetOtherUsageDescription = SV_TARGET_OTHER_USAGE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSVTargetClientSettableUsage() <em>SV Target Client Settable Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVTargetClientSettableUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> svTargetClientSettableUsage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_ReplicaPairViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_ReplicaPairView();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVSourceSystemCreationClassName() {
		return svSourceSystemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceSystemCreationClassName(String newSVSourceSystemCreationClassName) {
		String oldSVSourceSystemCreationClassName = svSourceSystemCreationClassName;
		svSourceSystemCreationClassName = newSVSourceSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_SYSTEM_CREATION_CLASS_NAME, oldSVSourceSystemCreationClassName, svSourceSystemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVSourceSystemName() {
		return svSourceSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceSystemName(String newSVSourceSystemName) {
		String oldSVSourceSystemName = svSourceSystemName;
		svSourceSystemName = newSVSourceSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_SYSTEM_NAME, oldSVSourceSystemName, svSourceSystemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVSourceCreationClassName() {
		return svSourceCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceCreationClassName(String newSVSourceCreationClassName) {
		String oldSVSourceCreationClassName = svSourceCreationClassName;
		svSourceCreationClassName = newSVSourceCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_CREATION_CLASS_NAME, oldSVSourceCreationClassName, svSourceCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVSourceDeviceID() {
		return svSourceDeviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceDeviceID(String newSVSourceDeviceID) {
		String oldSVSourceDeviceID = svSourceDeviceID;
		svSourceDeviceID = newSVSourceDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_DEVICE_ID, oldSVSourceDeviceID, svSourceDeviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVSourceName() {
		return svSourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceName(String newSVSourceName) {
		String oldSVSourceName = svSourceName;
		svSourceName = newSVSourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NAME, oldSVSourceName, svSourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVSourceNameFormat() {
		return svSourceNameFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceNameFormat(Integer newSVSourceNameFormat) {
		Integer oldSVSourceNameFormat = svSourceNameFormat;
		svSourceNameFormat = newSVSourceNameFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NAME_FORMAT, oldSVSourceNameFormat, svSourceNameFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVSourceNameNamespace() {
		return svSourceNameNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceNameNamespace(Integer newSVSourceNameNamespace) {
		Integer oldSVSourceNameNamespace = svSourceNameNamespace;
		svSourceNameNamespace = newSVSourceNameNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NAME_NAMESPACE, oldSVSourceNameNamespace, svSourceNameNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSVSourceExtentStatus() {
		if (svSourceExtentStatus == null) {
			svSourceExtentStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_EXTENT_STATUS);
		}
		return svSourceExtentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSVSourceOperationalStatus() {
		if (svSourceOperationalStatus == null) {
			svSourceOperationalStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_OPERATIONAL_STATUS);
		}
		return svSourceOperationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSVSourceBlockSize() {
		return svSourceBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceBlockSize(Long newSVSourceBlockSize) {
		Long oldSVSourceBlockSize = svSourceBlockSize;
		svSourceBlockSize = newSVSourceBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_BLOCK_SIZE, oldSVSourceBlockSize, svSourceBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSVSourceNumberOfBlocks() {
		return svSourceNumberOfBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceNumberOfBlocks(Long newSVSourceNumberOfBlocks) {
		Long oldSVSourceNumberOfBlocks = svSourceNumberOfBlocks;
		svSourceNumberOfBlocks = newSVSourceNumberOfBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NUMBER_OF_BLOCKS, oldSVSourceNumberOfBlocks, svSourceNumberOfBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSVSourceConsumableBlocks() {
		return svSourceConsumableBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceConsumableBlocks(Long newSVSourceConsumableBlocks) {
		Long oldSVSourceConsumableBlocks = svSourceConsumableBlocks;
		svSourceConsumableBlocks = newSVSourceConsumableBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_CONSUMABLE_BLOCKS, oldSVSourceConsumableBlocks, svSourceConsumableBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSVSourcePrimordial() {
		return svSourcePrimordial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourcePrimordial(Boolean newSVSourcePrimordial) {
		Boolean oldSVSourcePrimordial = svSourcePrimordial;
		svSourcePrimordial = newSVSourcePrimordial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_PRIMORDIAL, oldSVSourcePrimordial, svSourcePrimordial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSVSourceIsBasedOnUnderlyingRedundancy() {
		return svSourceIsBasedOnUnderlyingRedundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceIsBasedOnUnderlyingRedundancy(Boolean newSVSourceIsBasedOnUnderlyingRedundancy) {
		Boolean oldSVSourceIsBasedOnUnderlyingRedundancy = svSourceIsBasedOnUnderlyingRedundancy;
		svSourceIsBasedOnUnderlyingRedundancy = newSVSourceIsBasedOnUnderlyingRedundancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_IS_BASED_ON_UNDERLYING_REDUNDANCY, oldSVSourceIsBasedOnUnderlyingRedundancy, svSourceIsBasedOnUnderlyingRedundancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSVSourceNoSinglePointOfFailure() {
		return svSourceNoSinglePointOfFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceNoSinglePointOfFailure(Boolean newSVSourceNoSinglePointOfFailure) {
		Boolean oldSVSourceNoSinglePointOfFailure = svSourceNoSinglePointOfFailure;
		svSourceNoSinglePointOfFailure = newSVSourceNoSinglePointOfFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NO_SINGLE_POINT_OF_FAILURE, oldSVSourceNoSinglePointOfFailure, svSourceNoSinglePointOfFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVSourceDataRedundancy() {
		return svSourceDataRedundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceDataRedundancy(Integer newSVSourceDataRedundancy) {
		Integer oldSVSourceDataRedundancy = svSourceDataRedundancy;
		svSourceDataRedundancy = newSVSourceDataRedundancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_DATA_REDUNDANCY, oldSVSourceDataRedundancy, svSourceDataRedundancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVSourcePackageRedundancy() {
		return svSourcePackageRedundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourcePackageRedundancy(Integer newSVSourcePackageRedundancy) {
		Integer oldSVSourcePackageRedundancy = svSourcePackageRedundancy;
		svSourcePackageRedundancy = newSVSourcePackageRedundancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_PACKAGE_REDUNDANCY, oldSVSourcePackageRedundancy, svSourcePackageRedundancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVSourceDeltaReservation() {
		return svSourceDeltaReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceDeltaReservation(Integer newSVSourceDeltaReservation) {
		Integer oldSVSourceDeltaReservation = svSourceDeltaReservation;
		svSourceDeltaReservation = newSVSourceDeltaReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_DELTA_RESERVATION, oldSVSourceDeltaReservation, svSourceDeltaReservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSVSourceExtentDiscriminator() {
		if (svSourceExtentDiscriminator == null) {
			svSourceExtentDiscriminator = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_EXTENT_DISCRIMINATOR);
		}
		return svSourceExtentDiscriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSVSourceOtherIdentifyingInfo() {
		if (svSourceOtherIdentifyingInfo == null) {
			svSourceOtherIdentifyingInfo = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_OTHER_IDENTIFYING_INFO);
		}
		return svSourceOtherIdentifyingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSVSourceIdentifyingDescriptions() {
		if (svSourceIdentifyingDescriptions == null) {
			svSourceIdentifyingDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_IDENTIFYING_DESCRIPTIONS);
		}
		return svSourceIdentifyingDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVSourceElementName() {
		return svSourceElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceElementName(String newSVSourceElementName) {
		String oldSVSourceElementName = svSourceElementName;
		svSourceElementName = newSVSourceElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_ELEMENT_NAME, oldSVSourceElementName, svSourceElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVSourceUsage() {
		return svSourceUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceUsage(Integer newSVSourceUsage) {
		Integer oldSVSourceUsage = svSourceUsage;
		svSourceUsage = newSVSourceUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_USAGE, oldSVSourceUsage, svSourceUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVSourceOtherUsageDescription() {
		return svSourceOtherUsageDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVSourceOtherUsageDescription(String newSVSourceOtherUsageDescription) {
		String oldSVSourceOtherUsageDescription = svSourceOtherUsageDescription;
		svSourceOtherUsageDescription = newSVSourceOtherUsageDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_OTHER_USAGE_DESCRIPTION, oldSVSourceOtherUsageDescription, svSourceOtherUsageDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSVSourceClientSettableUsage() {
		if (svSourceClientSettableUsage == null) {
			svSourceClientSettableUsage = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_CLIENT_SETTABLE_USAGE);
		}
		return svSourceClientSettableUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSSWhenSynced() {
		return ssWhenSynced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSWhenSynced(String newSSWhenSynced) {
		String oldSSWhenSynced = ssWhenSynced;
		ssWhenSynced = newSSWhenSynced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SS_WHEN_SYNCED, oldSSWhenSynced, ssWhenSynced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSSSyncMaintained() {
		return ssSyncMaintained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSSyncMaintained(Boolean newSSSyncMaintained) {
		Boolean oldSSSyncMaintained = ssSyncMaintained;
		ssSyncMaintained = newSSSyncMaintained;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SS_SYNC_MAINTAINED, oldSSSyncMaintained, ssSyncMaintained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSCopyType() {
		return ssCopyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSCopyType(Integer newSSCopyType) {
		Integer oldSSCopyType = ssCopyType;
		ssCopyType = newSSCopyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SS_COPY_TYPE, oldSSCopyType, ssCopyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSSyncState() {
		return ssSyncState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSSyncState(Integer newSSSyncState) {
		Integer oldSSSyncState = ssSyncState;
		ssSyncState = newSSSyncState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SS_SYNC_STATE, oldSSSyncState, ssSyncState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSCopyPriority() {
		return ssCopyPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSCopyPriority(Integer newSSCopyPriority) {
		Integer oldSSCopyPriority = ssCopyPriority;
		ssCopyPriority = newSSCopyPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SS_COPY_PRIORITY, oldSSCopyPriority, ssCopyPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSSyncType() {
		return ssSyncType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSSyncType(Integer newSSSyncType) {
		Integer oldSSSyncType = ssSyncType;
		ssSyncType = newSSSyncType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SS_SYNC_TYPE, oldSSSyncType, ssSyncType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSMode() {
		return ssMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSMode(Integer newSSMode) {
		Integer oldSSMode = ssMode;
		ssMode = newSSMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SS_MODE, oldSSMode, ssMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSSProgressStatus() {
		return ssProgressStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSSProgressStatus(Integer newSSProgressStatus) {
		Integer oldSSProgressStatus = ssProgressStatus;
		ssProgressStatus = newSSProgressStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SS_PROGRESS_STATUS, oldSSProgressStatus, ssProgressStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVTargetSystemCreationClassName() {
		return svTargetSystemCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetSystemCreationClassName(String newSVTargetSystemCreationClassName) {
		String oldSVTargetSystemCreationClassName = svTargetSystemCreationClassName;
		svTargetSystemCreationClassName = newSVTargetSystemCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_SYSTEM_CREATION_CLASS_NAME, oldSVTargetSystemCreationClassName, svTargetSystemCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVTargetSystemName() {
		return svTargetSystemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetSystemName(String newSVTargetSystemName) {
		String oldSVTargetSystemName = svTargetSystemName;
		svTargetSystemName = newSVTargetSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_SYSTEM_NAME, oldSVTargetSystemName, svTargetSystemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVTargetCreationClassName() {
		return svTargetCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetCreationClassName(String newSVTargetCreationClassName) {
		String oldSVTargetCreationClassName = svTargetCreationClassName;
		svTargetCreationClassName = newSVTargetCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_CREATION_CLASS_NAME, oldSVTargetCreationClassName, svTargetCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVTargetDeviceID() {
		return svTargetDeviceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetDeviceID(String newSVTargetDeviceID) {
		String oldSVTargetDeviceID = svTargetDeviceID;
		svTargetDeviceID = newSVTargetDeviceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_DEVICE_ID, oldSVTargetDeviceID, svTargetDeviceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVTargetName() {
		return svTargetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetName(String newSVTargetName) {
		String oldSVTargetName = svTargetName;
		svTargetName = newSVTargetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NAME, oldSVTargetName, svTargetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVTargetNameFormat() {
		return svTargetNameFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetNameFormat(Integer newSVTargetNameFormat) {
		Integer oldSVTargetNameFormat = svTargetNameFormat;
		svTargetNameFormat = newSVTargetNameFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NAME_FORMAT, oldSVTargetNameFormat, svTargetNameFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVTargetNameNamespace() {
		return svTargetNameNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetNameNamespace(Integer newSVTargetNameNamespace) {
		Integer oldSVTargetNameNamespace = svTargetNameNamespace;
		svTargetNameNamespace = newSVTargetNameNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NAME_NAMESPACE, oldSVTargetNameNamespace, svTargetNameNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSVTargetExtentStatus() {
		if (svTargetExtentStatus == null) {
			svTargetExtentStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_EXTENT_STATUS);
		}
		return svTargetExtentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSVTargetOperationalStatus() {
		if (svTargetOperationalStatus == null) {
			svTargetOperationalStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_OPERATIONAL_STATUS);
		}
		return svTargetOperationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSVTargetBlockSize() {
		return svTargetBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetBlockSize(Long newSVTargetBlockSize) {
		Long oldSVTargetBlockSize = svTargetBlockSize;
		svTargetBlockSize = newSVTargetBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_BLOCK_SIZE, oldSVTargetBlockSize, svTargetBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSVTargetNumberOfBlocks() {
		return svTargetNumberOfBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetNumberOfBlocks(Long newSVTargetNumberOfBlocks) {
		Long oldSVTargetNumberOfBlocks = svTargetNumberOfBlocks;
		svTargetNumberOfBlocks = newSVTargetNumberOfBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NUMBER_OF_BLOCKS, oldSVTargetNumberOfBlocks, svTargetNumberOfBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSVTargetConsumableBlocks() {
		return svTargetConsumableBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetConsumableBlocks(Long newSVTargetConsumableBlocks) {
		Long oldSVTargetConsumableBlocks = svTargetConsumableBlocks;
		svTargetConsumableBlocks = newSVTargetConsumableBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_CONSUMABLE_BLOCKS, oldSVTargetConsumableBlocks, svTargetConsumableBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSVTargetPrimordial() {
		return svTargetPrimordial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetPrimordial(Boolean newSVTargetPrimordial) {
		Boolean oldSVTargetPrimordial = svTargetPrimordial;
		svTargetPrimordial = newSVTargetPrimordial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_PRIMORDIAL, oldSVTargetPrimordial, svTargetPrimordial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSVTargetIsBasedOnUnderlyingRedundancy() {
		return svTargetIsBasedOnUnderlyingRedundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetIsBasedOnUnderlyingRedundancy(Boolean newSVTargetIsBasedOnUnderlyingRedundancy) {
		Boolean oldSVTargetIsBasedOnUnderlyingRedundancy = svTargetIsBasedOnUnderlyingRedundancy;
		svTargetIsBasedOnUnderlyingRedundancy = newSVTargetIsBasedOnUnderlyingRedundancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_IS_BASED_ON_UNDERLYING_REDUNDANCY, oldSVTargetIsBasedOnUnderlyingRedundancy, svTargetIsBasedOnUnderlyingRedundancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSVTargetNoSinglePointOfFailure() {
		return svTargetNoSinglePointOfFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetNoSinglePointOfFailure(Boolean newSVTargetNoSinglePointOfFailure) {
		Boolean oldSVTargetNoSinglePointOfFailure = svTargetNoSinglePointOfFailure;
		svTargetNoSinglePointOfFailure = newSVTargetNoSinglePointOfFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NO_SINGLE_POINT_OF_FAILURE, oldSVTargetNoSinglePointOfFailure, svTargetNoSinglePointOfFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVTargetDataRedundancy() {
		return svTargetDataRedundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetDataRedundancy(Integer newSVTargetDataRedundancy) {
		Integer oldSVTargetDataRedundancy = svTargetDataRedundancy;
		svTargetDataRedundancy = newSVTargetDataRedundancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_DATA_REDUNDANCY, oldSVTargetDataRedundancy, svTargetDataRedundancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVTargetPackageRedundancy() {
		return svTargetPackageRedundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetPackageRedundancy(Integer newSVTargetPackageRedundancy) {
		Integer oldSVTargetPackageRedundancy = svTargetPackageRedundancy;
		svTargetPackageRedundancy = newSVTargetPackageRedundancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_PACKAGE_REDUNDANCY, oldSVTargetPackageRedundancy, svTargetPackageRedundancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVTargetDeltaReservation() {
		return svTargetDeltaReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetDeltaReservation(Integer newSVTargetDeltaReservation) {
		Integer oldSVTargetDeltaReservation = svTargetDeltaReservation;
		svTargetDeltaReservation = newSVTargetDeltaReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_DELTA_RESERVATION, oldSVTargetDeltaReservation, svTargetDeltaReservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSVTargetExtentDiscriminator() {
		if (svTargetExtentDiscriminator == null) {
			svTargetExtentDiscriminator = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_EXTENT_DISCRIMINATOR);
		}
		return svTargetExtentDiscriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSVTargetOtherIdentifyingInfo() {
		if (svTargetOtherIdentifyingInfo == null) {
			svTargetOtherIdentifyingInfo = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_OTHER_IDENTIFYING_INFO);
		}
		return svTargetOtherIdentifyingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSVTargetIdentifyingDescriptions() {
		if (svTargetIdentifyingDescriptions == null) {
			svTargetIdentifyingDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_IDENTIFYING_DESCRIPTIONS);
		}
		return svTargetIdentifyingDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVTargetElementName() {
		return svTargetElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetElementName(String newSVTargetElementName) {
		String oldSVTargetElementName = svTargetElementName;
		svTargetElementName = newSVTargetElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_ELEMENT_NAME, oldSVTargetElementName, svTargetElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSVTargetUsage() {
		return svTargetUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetUsage(Integer newSVTargetUsage) {
		Integer oldSVTargetUsage = svTargetUsage;
		svTargetUsage = newSVTargetUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_USAGE, oldSVTargetUsage, svTargetUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSVTargetOtherUsageDescription() {
		return svTargetOtherUsageDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSVTargetOtherUsageDescription(String newSVTargetOtherUsageDescription) {
		String oldSVTargetOtherUsageDescription = svTargetOtherUsageDescription;
		svTargetOtherUsageDescription = newSVTargetOtherUsageDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_OTHER_USAGE_DESCRIPTION, oldSVTargetOtherUsageDescription, svTargetOtherUsageDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSVTargetClientSettableUsage() {
		if (svTargetClientSettableUsage == null) {
			svTargetClientSettableUsage = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_CLIENT_SETTABLE_USAGE);
		}
		return svTargetClientSettableUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_SYSTEM_CREATION_CLASS_NAME:
				return getSVSourceSystemCreationClassName();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_SYSTEM_NAME:
				return getSVSourceSystemName();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_CREATION_CLASS_NAME:
				return getSVSourceCreationClassName();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_DEVICE_ID:
				return getSVSourceDeviceID();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NAME:
				return getSVSourceName();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NAME_FORMAT:
				return getSVSourceNameFormat();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NAME_NAMESPACE:
				return getSVSourceNameNamespace();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_EXTENT_STATUS:
				return getSVSourceExtentStatus();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_OPERATIONAL_STATUS:
				return getSVSourceOperationalStatus();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_BLOCK_SIZE:
				return getSVSourceBlockSize();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NUMBER_OF_BLOCKS:
				return getSVSourceNumberOfBlocks();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_CONSUMABLE_BLOCKS:
				return getSVSourceConsumableBlocks();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_PRIMORDIAL:
				return getSVSourcePrimordial();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_IS_BASED_ON_UNDERLYING_REDUNDANCY:
				return getSVSourceIsBasedOnUnderlyingRedundancy();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NO_SINGLE_POINT_OF_FAILURE:
				return getSVSourceNoSinglePointOfFailure();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_DATA_REDUNDANCY:
				return getSVSourceDataRedundancy();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_PACKAGE_REDUNDANCY:
				return getSVSourcePackageRedundancy();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_DELTA_RESERVATION:
				return getSVSourceDeltaReservation();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_EXTENT_DISCRIMINATOR:
				return getSVSourceExtentDiscriminator();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_OTHER_IDENTIFYING_INFO:
				return getSVSourceOtherIdentifyingInfo();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_IDENTIFYING_DESCRIPTIONS:
				return getSVSourceIdentifyingDescriptions();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_ELEMENT_NAME:
				return getSVSourceElementName();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_USAGE:
				return getSVSourceUsage();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_OTHER_USAGE_DESCRIPTION:
				return getSVSourceOtherUsageDescription();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_CLIENT_SETTABLE_USAGE:
				return getSVSourceClientSettableUsage();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_WHEN_SYNCED:
				return getSSWhenSynced();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_SYNC_MAINTAINED:
				return getSSSyncMaintained();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_COPY_TYPE:
				return getSSCopyType();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_SYNC_STATE:
				return getSSSyncState();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_COPY_PRIORITY:
				return getSSCopyPriority();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_SYNC_TYPE:
				return getSSSyncType();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_MODE:
				return getSSMode();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_PROGRESS_STATUS:
				return getSSProgressStatus();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_SYSTEM_CREATION_CLASS_NAME:
				return getSVTargetSystemCreationClassName();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_SYSTEM_NAME:
				return getSVTargetSystemName();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_CREATION_CLASS_NAME:
				return getSVTargetCreationClassName();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_DEVICE_ID:
				return getSVTargetDeviceID();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NAME:
				return getSVTargetName();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NAME_FORMAT:
				return getSVTargetNameFormat();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NAME_NAMESPACE:
				return getSVTargetNameNamespace();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_EXTENT_STATUS:
				return getSVTargetExtentStatus();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_OPERATIONAL_STATUS:
				return getSVTargetOperationalStatus();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_BLOCK_SIZE:
				return getSVTargetBlockSize();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NUMBER_OF_BLOCKS:
				return getSVTargetNumberOfBlocks();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_CONSUMABLE_BLOCKS:
				return getSVTargetConsumableBlocks();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_PRIMORDIAL:
				return getSVTargetPrimordial();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_IS_BASED_ON_UNDERLYING_REDUNDANCY:
				return getSVTargetIsBasedOnUnderlyingRedundancy();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NO_SINGLE_POINT_OF_FAILURE:
				return getSVTargetNoSinglePointOfFailure();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_DATA_REDUNDANCY:
				return getSVTargetDataRedundancy();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_PACKAGE_REDUNDANCY:
				return getSVTargetPackageRedundancy();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_DELTA_RESERVATION:
				return getSVTargetDeltaReservation();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_EXTENT_DISCRIMINATOR:
				return getSVTargetExtentDiscriminator();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_OTHER_IDENTIFYING_INFO:
				return getSVTargetOtherIdentifyingInfo();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_IDENTIFYING_DESCRIPTIONS:
				return getSVTargetIdentifyingDescriptions();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_ELEMENT_NAME:
				return getSVTargetElementName();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_USAGE:
				return getSVTargetUsage();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_OTHER_USAGE_DESCRIPTION:
				return getSVTargetOtherUsageDescription();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_CLIENT_SETTABLE_USAGE:
				return getSVTargetClientSettableUsage();
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
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_SYSTEM_CREATION_CLASS_NAME:
				setSVSourceSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_SYSTEM_NAME:
				setSVSourceSystemName((String)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_CREATION_CLASS_NAME:
				setSVSourceCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_DEVICE_ID:
				setSVSourceDeviceID((String)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NAME:
				setSVSourceName((String)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NAME_FORMAT:
				setSVSourceNameFormat((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NAME_NAMESPACE:
				setSVSourceNameNamespace((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_EXTENT_STATUS:
				getSVSourceExtentStatus().clear();
				getSVSourceExtentStatus().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_OPERATIONAL_STATUS:
				getSVSourceOperationalStatus().clear();
				getSVSourceOperationalStatus().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_BLOCK_SIZE:
				setSVSourceBlockSize((Long)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NUMBER_OF_BLOCKS:
				setSVSourceNumberOfBlocks((Long)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_CONSUMABLE_BLOCKS:
				setSVSourceConsumableBlocks((Long)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_PRIMORDIAL:
				setSVSourcePrimordial((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_IS_BASED_ON_UNDERLYING_REDUNDANCY:
				setSVSourceIsBasedOnUnderlyingRedundancy((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NO_SINGLE_POINT_OF_FAILURE:
				setSVSourceNoSinglePointOfFailure((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_DATA_REDUNDANCY:
				setSVSourceDataRedundancy((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_PACKAGE_REDUNDANCY:
				setSVSourcePackageRedundancy((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_DELTA_RESERVATION:
				setSVSourceDeltaReservation((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_EXTENT_DISCRIMINATOR:
				getSVSourceExtentDiscriminator().clear();
				getSVSourceExtentDiscriminator().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_OTHER_IDENTIFYING_INFO:
				getSVSourceOtherIdentifyingInfo().clear();
				getSVSourceOtherIdentifyingInfo().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_IDENTIFYING_DESCRIPTIONS:
				getSVSourceIdentifyingDescriptions().clear();
				getSVSourceIdentifyingDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_ELEMENT_NAME:
				setSVSourceElementName((String)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_USAGE:
				setSVSourceUsage((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_OTHER_USAGE_DESCRIPTION:
				setSVSourceOtherUsageDescription((String)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_CLIENT_SETTABLE_USAGE:
				getSVSourceClientSettableUsage().clear();
				getSVSourceClientSettableUsage().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_WHEN_SYNCED:
				setSSWhenSynced((String)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_SYNC_MAINTAINED:
				setSSSyncMaintained((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_COPY_TYPE:
				setSSCopyType((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_SYNC_STATE:
				setSSSyncState((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_COPY_PRIORITY:
				setSSCopyPriority((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_SYNC_TYPE:
				setSSSyncType((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_MODE:
				setSSMode((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_PROGRESS_STATUS:
				setSSProgressStatus((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_SYSTEM_CREATION_CLASS_NAME:
				setSVTargetSystemCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_SYSTEM_NAME:
				setSVTargetSystemName((String)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_CREATION_CLASS_NAME:
				setSVTargetCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_DEVICE_ID:
				setSVTargetDeviceID((String)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NAME:
				setSVTargetName((String)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NAME_FORMAT:
				setSVTargetNameFormat((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NAME_NAMESPACE:
				setSVTargetNameNamespace((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_EXTENT_STATUS:
				getSVTargetExtentStatus().clear();
				getSVTargetExtentStatus().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_OPERATIONAL_STATUS:
				getSVTargetOperationalStatus().clear();
				getSVTargetOperationalStatus().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_BLOCK_SIZE:
				setSVTargetBlockSize((Long)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NUMBER_OF_BLOCKS:
				setSVTargetNumberOfBlocks((Long)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_CONSUMABLE_BLOCKS:
				setSVTargetConsumableBlocks((Long)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_PRIMORDIAL:
				setSVTargetPrimordial((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_IS_BASED_ON_UNDERLYING_REDUNDANCY:
				setSVTargetIsBasedOnUnderlyingRedundancy((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NO_SINGLE_POINT_OF_FAILURE:
				setSVTargetNoSinglePointOfFailure((Boolean)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_DATA_REDUNDANCY:
				setSVTargetDataRedundancy((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_PACKAGE_REDUNDANCY:
				setSVTargetPackageRedundancy((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_DELTA_RESERVATION:
				setSVTargetDeltaReservation((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_EXTENT_DISCRIMINATOR:
				getSVTargetExtentDiscriminator().clear();
				getSVTargetExtentDiscriminator().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_OTHER_IDENTIFYING_INFO:
				getSVTargetOtherIdentifyingInfo().clear();
				getSVTargetOtherIdentifyingInfo().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_IDENTIFYING_DESCRIPTIONS:
				getSVTargetIdentifyingDescriptions().clear();
				getSVTargetIdentifyingDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_ELEMENT_NAME:
				setSVTargetElementName((String)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_USAGE:
				setSVTargetUsage((Integer)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_OTHER_USAGE_DESCRIPTION:
				setSVTargetOtherUsageDescription((String)newValue);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_CLIENT_SETTABLE_USAGE:
				getSVTargetClientSettableUsage().clear();
				getSVTargetClientSettableUsage().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_SYSTEM_CREATION_CLASS_NAME:
				setSVSourceSystemCreationClassName(SV_SOURCE_SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_SYSTEM_NAME:
				setSVSourceSystemName(SV_SOURCE_SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_CREATION_CLASS_NAME:
				setSVSourceCreationClassName(SV_SOURCE_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_DEVICE_ID:
				setSVSourceDeviceID(SV_SOURCE_DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NAME:
				setSVSourceName(SV_SOURCE_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NAME_FORMAT:
				setSVSourceNameFormat(SV_SOURCE_NAME_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NAME_NAMESPACE:
				setSVSourceNameNamespace(SV_SOURCE_NAME_NAMESPACE_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_EXTENT_STATUS:
				getSVSourceExtentStatus().clear();
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_OPERATIONAL_STATUS:
				getSVSourceOperationalStatus().clear();
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_BLOCK_SIZE:
				setSVSourceBlockSize(SV_SOURCE_BLOCK_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NUMBER_OF_BLOCKS:
				setSVSourceNumberOfBlocks(SV_SOURCE_NUMBER_OF_BLOCKS_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_CONSUMABLE_BLOCKS:
				setSVSourceConsumableBlocks(SV_SOURCE_CONSUMABLE_BLOCKS_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_PRIMORDIAL:
				setSVSourcePrimordial(SV_SOURCE_PRIMORDIAL_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_IS_BASED_ON_UNDERLYING_REDUNDANCY:
				setSVSourceIsBasedOnUnderlyingRedundancy(SV_SOURCE_IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NO_SINGLE_POINT_OF_FAILURE:
				setSVSourceNoSinglePointOfFailure(SV_SOURCE_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_DATA_REDUNDANCY:
				setSVSourceDataRedundancy(SV_SOURCE_DATA_REDUNDANCY_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_PACKAGE_REDUNDANCY:
				setSVSourcePackageRedundancy(SV_SOURCE_PACKAGE_REDUNDANCY_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_DELTA_RESERVATION:
				setSVSourceDeltaReservation(SV_SOURCE_DELTA_RESERVATION_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_EXTENT_DISCRIMINATOR:
				getSVSourceExtentDiscriminator().clear();
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_OTHER_IDENTIFYING_INFO:
				getSVSourceOtherIdentifyingInfo().clear();
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_IDENTIFYING_DESCRIPTIONS:
				getSVSourceIdentifyingDescriptions().clear();
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_ELEMENT_NAME:
				setSVSourceElementName(SV_SOURCE_ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_USAGE:
				setSVSourceUsage(SV_SOURCE_USAGE_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_OTHER_USAGE_DESCRIPTION:
				setSVSourceOtherUsageDescription(SV_SOURCE_OTHER_USAGE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_CLIENT_SETTABLE_USAGE:
				getSVSourceClientSettableUsage().clear();
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_WHEN_SYNCED:
				setSSWhenSynced(SS_WHEN_SYNCED_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_SYNC_MAINTAINED:
				setSSSyncMaintained(SS_SYNC_MAINTAINED_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_COPY_TYPE:
				setSSCopyType(SS_COPY_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_SYNC_STATE:
				setSSSyncState(SS_SYNC_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_COPY_PRIORITY:
				setSSCopyPriority(SS_COPY_PRIORITY_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_SYNC_TYPE:
				setSSSyncType(SS_SYNC_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_MODE:
				setSSMode(SS_MODE_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_PROGRESS_STATUS:
				setSSProgressStatus(SS_PROGRESS_STATUS_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_SYSTEM_CREATION_CLASS_NAME:
				setSVTargetSystemCreationClassName(SV_TARGET_SYSTEM_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_SYSTEM_NAME:
				setSVTargetSystemName(SV_TARGET_SYSTEM_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_CREATION_CLASS_NAME:
				setSVTargetCreationClassName(SV_TARGET_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_DEVICE_ID:
				setSVTargetDeviceID(SV_TARGET_DEVICE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NAME:
				setSVTargetName(SV_TARGET_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NAME_FORMAT:
				setSVTargetNameFormat(SV_TARGET_NAME_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NAME_NAMESPACE:
				setSVTargetNameNamespace(SV_TARGET_NAME_NAMESPACE_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_EXTENT_STATUS:
				getSVTargetExtentStatus().clear();
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_OPERATIONAL_STATUS:
				getSVTargetOperationalStatus().clear();
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_BLOCK_SIZE:
				setSVTargetBlockSize(SV_TARGET_BLOCK_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NUMBER_OF_BLOCKS:
				setSVTargetNumberOfBlocks(SV_TARGET_NUMBER_OF_BLOCKS_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_CONSUMABLE_BLOCKS:
				setSVTargetConsumableBlocks(SV_TARGET_CONSUMABLE_BLOCKS_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_PRIMORDIAL:
				setSVTargetPrimordial(SV_TARGET_PRIMORDIAL_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_IS_BASED_ON_UNDERLYING_REDUNDANCY:
				setSVTargetIsBasedOnUnderlyingRedundancy(SV_TARGET_IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NO_SINGLE_POINT_OF_FAILURE:
				setSVTargetNoSinglePointOfFailure(SV_TARGET_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_DATA_REDUNDANCY:
				setSVTargetDataRedundancy(SV_TARGET_DATA_REDUNDANCY_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_PACKAGE_REDUNDANCY:
				setSVTargetPackageRedundancy(SV_TARGET_PACKAGE_REDUNDANCY_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_DELTA_RESERVATION:
				setSVTargetDeltaReservation(SV_TARGET_DELTA_RESERVATION_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_EXTENT_DISCRIMINATOR:
				getSVTargetExtentDiscriminator().clear();
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_OTHER_IDENTIFYING_INFO:
				getSVTargetOtherIdentifyingInfo().clear();
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_IDENTIFYING_DESCRIPTIONS:
				getSVTargetIdentifyingDescriptions().clear();
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_ELEMENT_NAME:
				setSVTargetElementName(SV_TARGET_ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_USAGE:
				setSVTargetUsage(SV_TARGET_USAGE_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_OTHER_USAGE_DESCRIPTION:
				setSVTargetOtherUsageDescription(SV_TARGET_OTHER_USAGE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_CLIENT_SETTABLE_USAGE:
				getSVTargetClientSettableUsage().clear();
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
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_SYSTEM_CREATION_CLASS_NAME:
				return SV_SOURCE_SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? svSourceSystemCreationClassName != null : !SV_SOURCE_SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(svSourceSystemCreationClassName);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_SYSTEM_NAME:
				return SV_SOURCE_SYSTEM_NAME_EDEFAULT == null ? svSourceSystemName != null : !SV_SOURCE_SYSTEM_NAME_EDEFAULT.equals(svSourceSystemName);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_CREATION_CLASS_NAME:
				return SV_SOURCE_CREATION_CLASS_NAME_EDEFAULT == null ? svSourceCreationClassName != null : !SV_SOURCE_CREATION_CLASS_NAME_EDEFAULT.equals(svSourceCreationClassName);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_DEVICE_ID:
				return SV_SOURCE_DEVICE_ID_EDEFAULT == null ? svSourceDeviceID != null : !SV_SOURCE_DEVICE_ID_EDEFAULT.equals(svSourceDeviceID);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NAME:
				return SV_SOURCE_NAME_EDEFAULT == null ? svSourceName != null : !SV_SOURCE_NAME_EDEFAULT.equals(svSourceName);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NAME_FORMAT:
				return SV_SOURCE_NAME_FORMAT_EDEFAULT == null ? svSourceNameFormat != null : !SV_SOURCE_NAME_FORMAT_EDEFAULT.equals(svSourceNameFormat);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NAME_NAMESPACE:
				return SV_SOURCE_NAME_NAMESPACE_EDEFAULT == null ? svSourceNameNamespace != null : !SV_SOURCE_NAME_NAMESPACE_EDEFAULT.equals(svSourceNameNamespace);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_EXTENT_STATUS:
				return svSourceExtentStatus != null && !svSourceExtentStatus.isEmpty();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_OPERATIONAL_STATUS:
				return svSourceOperationalStatus != null && !svSourceOperationalStatus.isEmpty();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_BLOCK_SIZE:
				return SV_SOURCE_BLOCK_SIZE_EDEFAULT == null ? svSourceBlockSize != null : !SV_SOURCE_BLOCK_SIZE_EDEFAULT.equals(svSourceBlockSize);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NUMBER_OF_BLOCKS:
				return SV_SOURCE_NUMBER_OF_BLOCKS_EDEFAULT == null ? svSourceNumberOfBlocks != null : !SV_SOURCE_NUMBER_OF_BLOCKS_EDEFAULT.equals(svSourceNumberOfBlocks);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_CONSUMABLE_BLOCKS:
				return SV_SOURCE_CONSUMABLE_BLOCKS_EDEFAULT == null ? svSourceConsumableBlocks != null : !SV_SOURCE_CONSUMABLE_BLOCKS_EDEFAULT.equals(svSourceConsumableBlocks);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_PRIMORDIAL:
				return SV_SOURCE_PRIMORDIAL_EDEFAULT == null ? svSourcePrimordial != null : !SV_SOURCE_PRIMORDIAL_EDEFAULT.equals(svSourcePrimordial);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_IS_BASED_ON_UNDERLYING_REDUNDANCY:
				return SV_SOURCE_IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT == null ? svSourceIsBasedOnUnderlyingRedundancy != null : !SV_SOURCE_IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT.equals(svSourceIsBasedOnUnderlyingRedundancy);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_NO_SINGLE_POINT_OF_FAILURE:
				return SV_SOURCE_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT == null ? svSourceNoSinglePointOfFailure != null : !SV_SOURCE_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT.equals(svSourceNoSinglePointOfFailure);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_DATA_REDUNDANCY:
				return SV_SOURCE_DATA_REDUNDANCY_EDEFAULT == null ? svSourceDataRedundancy != null : !SV_SOURCE_DATA_REDUNDANCY_EDEFAULT.equals(svSourceDataRedundancy);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_PACKAGE_REDUNDANCY:
				return SV_SOURCE_PACKAGE_REDUNDANCY_EDEFAULT == null ? svSourcePackageRedundancy != null : !SV_SOURCE_PACKAGE_REDUNDANCY_EDEFAULT.equals(svSourcePackageRedundancy);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_DELTA_RESERVATION:
				return SV_SOURCE_DELTA_RESERVATION_EDEFAULT == null ? svSourceDeltaReservation != null : !SV_SOURCE_DELTA_RESERVATION_EDEFAULT.equals(svSourceDeltaReservation);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_EXTENT_DISCRIMINATOR:
				return svSourceExtentDiscriminator != null && !svSourceExtentDiscriminator.isEmpty();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_OTHER_IDENTIFYING_INFO:
				return svSourceOtherIdentifyingInfo != null && !svSourceOtherIdentifyingInfo.isEmpty();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_IDENTIFYING_DESCRIPTIONS:
				return svSourceIdentifyingDescriptions != null && !svSourceIdentifyingDescriptions.isEmpty();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_ELEMENT_NAME:
				return SV_SOURCE_ELEMENT_NAME_EDEFAULT == null ? svSourceElementName != null : !SV_SOURCE_ELEMENT_NAME_EDEFAULT.equals(svSourceElementName);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_USAGE:
				return SV_SOURCE_USAGE_EDEFAULT == null ? svSourceUsage != null : !SV_SOURCE_USAGE_EDEFAULT.equals(svSourceUsage);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_OTHER_USAGE_DESCRIPTION:
				return SV_SOURCE_OTHER_USAGE_DESCRIPTION_EDEFAULT == null ? svSourceOtherUsageDescription != null : !SV_SOURCE_OTHER_USAGE_DESCRIPTION_EDEFAULT.equals(svSourceOtherUsageDescription);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_SOURCE_CLIENT_SETTABLE_USAGE:
				return svSourceClientSettableUsage != null && !svSourceClientSettableUsage.isEmpty();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_WHEN_SYNCED:
				return SS_WHEN_SYNCED_EDEFAULT == null ? ssWhenSynced != null : !SS_WHEN_SYNCED_EDEFAULT.equals(ssWhenSynced);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_SYNC_MAINTAINED:
				return SS_SYNC_MAINTAINED_EDEFAULT == null ? ssSyncMaintained != null : !SS_SYNC_MAINTAINED_EDEFAULT.equals(ssSyncMaintained);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_COPY_TYPE:
				return SS_COPY_TYPE_EDEFAULT == null ? ssCopyType != null : !SS_COPY_TYPE_EDEFAULT.equals(ssCopyType);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_SYNC_STATE:
				return SS_SYNC_STATE_EDEFAULT == null ? ssSyncState != null : !SS_SYNC_STATE_EDEFAULT.equals(ssSyncState);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_COPY_PRIORITY:
				return SS_COPY_PRIORITY_EDEFAULT == null ? ssCopyPriority != null : !SS_COPY_PRIORITY_EDEFAULT.equals(ssCopyPriority);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_SYNC_TYPE:
				return SS_SYNC_TYPE_EDEFAULT == null ? ssSyncType != null : !SS_SYNC_TYPE_EDEFAULT.equals(ssSyncType);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_MODE:
				return SS_MODE_EDEFAULT == null ? ssMode != null : !SS_MODE_EDEFAULT.equals(ssMode);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SS_PROGRESS_STATUS:
				return SS_PROGRESS_STATUS_EDEFAULT == null ? ssProgressStatus != null : !SS_PROGRESS_STATUS_EDEFAULT.equals(ssProgressStatus);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_SYSTEM_CREATION_CLASS_NAME:
				return SV_TARGET_SYSTEM_CREATION_CLASS_NAME_EDEFAULT == null ? svTargetSystemCreationClassName != null : !SV_TARGET_SYSTEM_CREATION_CLASS_NAME_EDEFAULT.equals(svTargetSystemCreationClassName);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_SYSTEM_NAME:
				return SV_TARGET_SYSTEM_NAME_EDEFAULT == null ? svTargetSystemName != null : !SV_TARGET_SYSTEM_NAME_EDEFAULT.equals(svTargetSystemName);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_CREATION_CLASS_NAME:
				return SV_TARGET_CREATION_CLASS_NAME_EDEFAULT == null ? svTargetCreationClassName != null : !SV_TARGET_CREATION_CLASS_NAME_EDEFAULT.equals(svTargetCreationClassName);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_DEVICE_ID:
				return SV_TARGET_DEVICE_ID_EDEFAULT == null ? svTargetDeviceID != null : !SV_TARGET_DEVICE_ID_EDEFAULT.equals(svTargetDeviceID);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NAME:
				return SV_TARGET_NAME_EDEFAULT == null ? svTargetName != null : !SV_TARGET_NAME_EDEFAULT.equals(svTargetName);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NAME_FORMAT:
				return SV_TARGET_NAME_FORMAT_EDEFAULT == null ? svTargetNameFormat != null : !SV_TARGET_NAME_FORMAT_EDEFAULT.equals(svTargetNameFormat);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NAME_NAMESPACE:
				return SV_TARGET_NAME_NAMESPACE_EDEFAULT == null ? svTargetNameNamespace != null : !SV_TARGET_NAME_NAMESPACE_EDEFAULT.equals(svTargetNameNamespace);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_EXTENT_STATUS:
				return svTargetExtentStatus != null && !svTargetExtentStatus.isEmpty();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_OPERATIONAL_STATUS:
				return svTargetOperationalStatus != null && !svTargetOperationalStatus.isEmpty();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_BLOCK_SIZE:
				return SV_TARGET_BLOCK_SIZE_EDEFAULT == null ? svTargetBlockSize != null : !SV_TARGET_BLOCK_SIZE_EDEFAULT.equals(svTargetBlockSize);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NUMBER_OF_BLOCKS:
				return SV_TARGET_NUMBER_OF_BLOCKS_EDEFAULT == null ? svTargetNumberOfBlocks != null : !SV_TARGET_NUMBER_OF_BLOCKS_EDEFAULT.equals(svTargetNumberOfBlocks);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_CONSUMABLE_BLOCKS:
				return SV_TARGET_CONSUMABLE_BLOCKS_EDEFAULT == null ? svTargetConsumableBlocks != null : !SV_TARGET_CONSUMABLE_BLOCKS_EDEFAULT.equals(svTargetConsumableBlocks);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_PRIMORDIAL:
				return SV_TARGET_PRIMORDIAL_EDEFAULT == null ? svTargetPrimordial != null : !SV_TARGET_PRIMORDIAL_EDEFAULT.equals(svTargetPrimordial);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_IS_BASED_ON_UNDERLYING_REDUNDANCY:
				return SV_TARGET_IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT == null ? svTargetIsBasedOnUnderlyingRedundancy != null : !SV_TARGET_IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT.equals(svTargetIsBasedOnUnderlyingRedundancy);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_NO_SINGLE_POINT_OF_FAILURE:
				return SV_TARGET_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT == null ? svTargetNoSinglePointOfFailure != null : !SV_TARGET_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT.equals(svTargetNoSinglePointOfFailure);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_DATA_REDUNDANCY:
				return SV_TARGET_DATA_REDUNDANCY_EDEFAULT == null ? svTargetDataRedundancy != null : !SV_TARGET_DATA_REDUNDANCY_EDEFAULT.equals(svTargetDataRedundancy);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_PACKAGE_REDUNDANCY:
				return SV_TARGET_PACKAGE_REDUNDANCY_EDEFAULT == null ? svTargetPackageRedundancy != null : !SV_TARGET_PACKAGE_REDUNDANCY_EDEFAULT.equals(svTargetPackageRedundancy);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_DELTA_RESERVATION:
				return SV_TARGET_DELTA_RESERVATION_EDEFAULT == null ? svTargetDeltaReservation != null : !SV_TARGET_DELTA_RESERVATION_EDEFAULT.equals(svTargetDeltaReservation);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_EXTENT_DISCRIMINATOR:
				return svTargetExtentDiscriminator != null && !svTargetExtentDiscriminator.isEmpty();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_OTHER_IDENTIFYING_INFO:
				return svTargetOtherIdentifyingInfo != null && !svTargetOtherIdentifyingInfo.isEmpty();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_IDENTIFYING_DESCRIPTIONS:
				return svTargetIdentifyingDescriptions != null && !svTargetIdentifyingDescriptions.isEmpty();
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_ELEMENT_NAME:
				return SV_TARGET_ELEMENT_NAME_EDEFAULT == null ? svTargetElementName != null : !SV_TARGET_ELEMENT_NAME_EDEFAULT.equals(svTargetElementName);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_USAGE:
				return SV_TARGET_USAGE_EDEFAULT == null ? svTargetUsage != null : !SV_TARGET_USAGE_EDEFAULT.equals(svTargetUsage);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_OTHER_USAGE_DESCRIPTION:
				return SV_TARGET_OTHER_USAGE_DESCRIPTION_EDEFAULT == null ? svTargetOtherUsageDescription != null : !SV_TARGET_OTHER_USAGE_DESCRIPTION_EDEFAULT.equals(svTargetOtherUsageDescription);
			case CimPackage.CIM_REPLICA_PAIR_VIEW__SV_TARGET_CLIENT_SETTABLE_USAGE:
				return svTargetClientSettableUsage != null && !svTargetClientSettableUsage.isEmpty();
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
		result.append(" (SVSourceSystemCreationClassName: ");
		result.append(svSourceSystemCreationClassName);
		result.append(", SVSourceSystemName: ");
		result.append(svSourceSystemName);
		result.append(", SVSourceCreationClassName: ");
		result.append(svSourceCreationClassName);
		result.append(", SVSourceDeviceID: ");
		result.append(svSourceDeviceID);
		result.append(", SVSourceName: ");
		result.append(svSourceName);
		result.append(", SVSourceNameFormat: ");
		result.append(svSourceNameFormat);
		result.append(", SVSourceNameNamespace: ");
		result.append(svSourceNameNamespace);
		result.append(", SVSourceExtentStatus: ");
		result.append(svSourceExtentStatus);
		result.append(", SVSourceOperationalStatus: ");
		result.append(svSourceOperationalStatus);
		result.append(", SVSourceBlockSize: ");
		result.append(svSourceBlockSize);
		result.append(", SVSourceNumberOfBlocks: ");
		result.append(svSourceNumberOfBlocks);
		result.append(", SVSourceConsumableBlocks: ");
		result.append(svSourceConsumableBlocks);
		result.append(", SVSourcePrimordial: ");
		result.append(svSourcePrimordial);
		result.append(", SVSourceIsBasedOnUnderlyingRedundancy: ");
		result.append(svSourceIsBasedOnUnderlyingRedundancy);
		result.append(", SVSourceNoSinglePointOfFailure: ");
		result.append(svSourceNoSinglePointOfFailure);
		result.append(", SVSourceDataRedundancy: ");
		result.append(svSourceDataRedundancy);
		result.append(", SVSourcePackageRedundancy: ");
		result.append(svSourcePackageRedundancy);
		result.append(", SVSourceDeltaReservation: ");
		result.append(svSourceDeltaReservation);
		result.append(", SVSourceExtentDiscriminator: ");
		result.append(svSourceExtentDiscriminator);
		result.append(", SVSourceOtherIdentifyingInfo: ");
		result.append(svSourceOtherIdentifyingInfo);
		result.append(", SVSourceIdentifyingDescriptions: ");
		result.append(svSourceIdentifyingDescriptions);
		result.append(", SVSourceElementName: ");
		result.append(svSourceElementName);
		result.append(", SVSourceUsage: ");
		result.append(svSourceUsage);
		result.append(", SVSourceOtherUsageDescription: ");
		result.append(svSourceOtherUsageDescription);
		result.append(", SVSourceClientSettableUsage: ");
		result.append(svSourceClientSettableUsage);
		result.append(", SSWhenSynced: ");
		result.append(ssWhenSynced);
		result.append(", SSSyncMaintained: ");
		result.append(ssSyncMaintained);
		result.append(", SSCopyType: ");
		result.append(ssCopyType);
		result.append(", SSSyncState: ");
		result.append(ssSyncState);
		result.append(", SSCopyPriority: ");
		result.append(ssCopyPriority);
		result.append(", SSSyncType: ");
		result.append(ssSyncType);
		result.append(", SSMode: ");
		result.append(ssMode);
		result.append(", SSProgressStatus: ");
		result.append(ssProgressStatus);
		result.append(", SVTargetSystemCreationClassName: ");
		result.append(svTargetSystemCreationClassName);
		result.append(", SVTargetSystemName: ");
		result.append(svTargetSystemName);
		result.append(", SVTargetCreationClassName: ");
		result.append(svTargetCreationClassName);
		result.append(", SVTargetDeviceID: ");
		result.append(svTargetDeviceID);
		result.append(", SVTargetName: ");
		result.append(svTargetName);
		result.append(", SVTargetNameFormat: ");
		result.append(svTargetNameFormat);
		result.append(", SVTargetNameNamespace: ");
		result.append(svTargetNameNamespace);
		result.append(", SVTargetExtentStatus: ");
		result.append(svTargetExtentStatus);
		result.append(", SVTargetOperationalStatus: ");
		result.append(svTargetOperationalStatus);
		result.append(", SVTargetBlockSize: ");
		result.append(svTargetBlockSize);
		result.append(", SVTargetNumberOfBlocks: ");
		result.append(svTargetNumberOfBlocks);
		result.append(", SVTargetConsumableBlocks: ");
		result.append(svTargetConsumableBlocks);
		result.append(", SVTargetPrimordial: ");
		result.append(svTargetPrimordial);
		result.append(", SVTargetIsBasedOnUnderlyingRedundancy: ");
		result.append(svTargetIsBasedOnUnderlyingRedundancy);
		result.append(", SVTargetNoSinglePointOfFailure: ");
		result.append(svTargetNoSinglePointOfFailure);
		result.append(", SVTargetDataRedundancy: ");
		result.append(svTargetDataRedundancy);
		result.append(", SVTargetPackageRedundancy: ");
		result.append(svTargetPackageRedundancy);
		result.append(", SVTargetDeltaReservation: ");
		result.append(svTargetDeltaReservation);
		result.append(", SVTargetExtentDiscriminator: ");
		result.append(svTargetExtentDiscriminator);
		result.append(", SVTargetOtherIdentifyingInfo: ");
		result.append(svTargetOtherIdentifyingInfo);
		result.append(", SVTargetIdentifyingDescriptions: ");
		result.append(svTargetIdentifyingDescriptions);
		result.append(", SVTargetElementName: ");
		result.append(svTargetElementName);
		result.append(", SVTargetUsage: ");
		result.append(svTargetUsage);
		result.append(", SVTargetOtherUsageDescription: ");
		result.append(svTargetOtherUsageDescription);
		result.append(", SVTargetClientSettableUsage: ");
		result.append(svTargetClientSettableUsage);
		result.append(')');
		return result.toString();
	}

} //CIM_ReplicaPairViewImpl

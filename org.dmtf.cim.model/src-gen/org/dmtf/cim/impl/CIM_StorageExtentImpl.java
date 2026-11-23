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

import org.dmtf.cim.CIM_StorageExtent;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getDataOrganization <em>Data Organization</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getErrorMethodology <em>Error Methodology</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getBlockSize <em>Block Size</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getNumberOfBlocks <em>Number Of Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getConsumableBlocks <em>Consumable Blocks</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getIsBasedOnUnderlyingRedundancy <em>Is Based On Underlying Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getSequentialAccess <em>Sequential Access</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getExtentStatus <em>Extent Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getNoSinglePointOfFailure <em>No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getDataRedundancy <em>Data Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getPackageRedundancy <em>Package Redundancy</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getDeltaReservation <em>Delta Reservation</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getPrimordial <em>Primordial</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getNameFormat <em>Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getNameNamespace <em>Name Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getOtherNameNamespace <em>Other Name Namespace</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getOtherNameFormat <em>Other Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getClientSettableUsage <em>Client Settable Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getCompressionRate <em>Compression Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getCompressionState <em>Compression State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getExtentDiscriminator <em>Extent Discriminator</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getExtentInterleaveDepth <em>Extent Interleave Depth</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getExtentStripeLength <em>Extent Stripe Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getIsCompressed <em>Is Compressed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getIsConcatenated <em>Is Concatenated</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getOtherUsageDescription <em>Other Usage Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageExtentImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageExtentImpl extends CIM_LogicalDeviceImpl implements CIM_StorageExtent {
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
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected Integer access = ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorMethodology() <em>Error Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMethodology()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_METHODOLOGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorMethodology() <em>Error Methodology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMethodology()
	 * @generated
	 * @ordered
	 */
	protected String errorMethodology = ERROR_METHODOLOGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockSize() <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockSize() <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Long blockSize = BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfBlocks() <em>Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final Long NUMBER_OF_BLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfBlocks() <em>Number Of Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfBlocks()
	 * @generated
	 * @ordered
	 */
	protected Long numberOfBlocks = NUMBER_OF_BLOCKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsumableBlocks() <em>Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumableBlocks()
	 * @generated
	 * @ordered
	 */
	protected static final Long CONSUMABLE_BLOCKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsumableBlocks() <em>Consumable Blocks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumableBlocks()
	 * @generated
	 * @ordered
	 */
	protected Long consumableBlocks = CONSUMABLE_BLOCKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsBasedOnUnderlyingRedundancy() <em>Is Based On Underlying Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBasedOnUnderlyingRedundancy()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsBasedOnUnderlyingRedundancy() <em>Is Based On Underlying Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsBasedOnUnderlyingRedundancy()
	 * @generated
	 * @ordered
	 */
	protected Boolean isBasedOnUnderlyingRedundancy = IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequentialAccess() <em>Sequential Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequentialAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SEQUENTIAL_ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSequentialAccess() <em>Sequential Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequentialAccess()
	 * @generated
	 * @ordered
	 */
	protected Boolean sequentialAccess = SEQUENTIAL_ACCESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtentStatus() <em>Extent Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> extentStatus;

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
	 * The default value of the '{@link #getDataRedundancy() <em>Data Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRedundancy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_REDUNDANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataRedundancy() <em>Data Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRedundancy()
	 * @generated
	 * @ordered
	 */
	protected Integer dataRedundancy = DATA_REDUNDANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackageRedundancy() <em>Package Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageRedundancy()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PACKAGE_REDUNDANCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageRedundancy() <em>Package Redundancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageRedundancy()
	 * @generated
	 * @ordered
	 */
	protected Integer packageRedundancy = PACKAGE_REDUNDANCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeltaReservation() <em>Delta Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaReservation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DELTA_RESERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaReservation() <em>Delta Reservation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaReservation()
	 * @generated
	 * @ordered
	 */
	protected Integer deltaReservation = DELTA_RESERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimordial() <em>Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimordial()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRIMORDIAL_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getPrimordial() <em>Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimordial()
	 * @generated
	 * @ordered
	 */
	protected Boolean primordial = PRIMORDIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameFormat() <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NAME_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameFormat() <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer nameFormat = NAME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameNamespace() <em>Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NAME_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameNamespace() <em>Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameNamespace()
	 * @generated
	 * @ordered
	 */
	protected Integer nameNamespace = NAME_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherNameNamespace() <em>Other Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherNameNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_NAME_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherNameNamespace() <em>Other Name Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherNameNamespace()
	 * @generated
	 * @ordered
	 */
	protected String otherNameNamespace = OTHER_NAME_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherNameFormat() <em>Other Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherNameFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_NAME_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherNameFormat() <em>Other Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherNameFormat()
	 * @generated
	 * @ordered
	 */
	protected String otherNameFormat = OTHER_NAME_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClientSettableUsage() <em>Client Settable Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientSettableUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> clientSettableUsage;

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
	 * The default value of the '{@link #getCompressionState() <em>Compression State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COMPRESSION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressionState() <em>Compression State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionState()
	 * @generated
	 * @ordered
	 */
	protected Integer compressionState = COMPRESSION_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtentDiscriminator() <em>Extent Discriminator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected EList<String> extentDiscriminator;

	/**
	 * The default value of the '{@link #getExtentInterleaveDepth() <em>Extent Interleave Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentInterleaveDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Long EXTENT_INTERLEAVE_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtentInterleaveDepth() <em>Extent Interleave Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentInterleaveDepth()
	 * @generated
	 * @ordered
	 */
	protected Long extentInterleaveDepth = EXTENT_INTERLEAVE_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtentStripeLength() <em>Extent Stripe Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentStripeLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long EXTENT_STRIPE_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtentStripeLength() <em>Extent Stripe Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentStripeLength()
	 * @generated
	 * @ordered
	 */
	protected Long extentStripeLength = EXTENT_STRIPE_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_COMPOSITE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsComposite()
	 * @generated
	 * @ordered
	 */
	protected Boolean isComposite = IS_COMPOSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsCompressed() <em>Is Compressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCompressed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_COMPRESSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsCompressed() <em>Is Compressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCompressed()
	 * @generated
	 * @ordered
	 */
	protected Boolean isCompressed = IS_COMPRESSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsConcatenated() <em>Is Concatenated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConcatenated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONCATENATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsConcatenated() <em>Is Concatenated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConcatenated()
	 * @generated
	 * @ordered
	 */
	protected Boolean isConcatenated = IS_CONCATENATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherUsageDescription() <em>Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherUsageDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_USAGE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherUsageDescription() <em>Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherUsageDescription()
	 * @generated
	 * @ordered
	 */
	protected String otherUsageDescription = OTHER_USAGE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected Integer usage = USAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageExtent();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__DATA_ORGANIZATION, oldDataOrganization, dataOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccess(Integer newAccess) {
		Integer oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErrorMethodology() {
		return errorMethodology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorMethodology(String newErrorMethodology) {
		String oldErrorMethodology = errorMethodology;
		errorMethodology = newErrorMethodology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__ERROR_METHODOLOGY, oldErrorMethodology, errorMethodology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getBlockSize() {
		return blockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockSize(Long newBlockSize) {
		Long oldBlockSize = blockSize;
		blockSize = newBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__BLOCK_SIZE, oldBlockSize, blockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNumberOfBlocks() {
		return numberOfBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfBlocks(Long newNumberOfBlocks) {
		Long oldNumberOfBlocks = numberOfBlocks;
		numberOfBlocks = newNumberOfBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__NUMBER_OF_BLOCKS, oldNumberOfBlocks, numberOfBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getConsumableBlocks() {
		return consumableBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsumableBlocks(Long newConsumableBlocks) {
		Long oldConsumableBlocks = consumableBlocks;
		consumableBlocks = newConsumableBlocks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__CONSUMABLE_BLOCKS, oldConsumableBlocks, consumableBlocks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsBasedOnUnderlyingRedundancy() {
		return isBasedOnUnderlyingRedundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsBasedOnUnderlyingRedundancy(Boolean newIsBasedOnUnderlyingRedundancy) {
		Boolean oldIsBasedOnUnderlyingRedundancy = isBasedOnUnderlyingRedundancy;
		isBasedOnUnderlyingRedundancy = newIsBasedOnUnderlyingRedundancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__IS_BASED_ON_UNDERLYING_REDUNDANCY, oldIsBasedOnUnderlyingRedundancy, isBasedOnUnderlyingRedundancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSequentialAccess() {
		return sequentialAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSequentialAccess(Boolean newSequentialAccess) {
		Boolean oldSequentialAccess = sequentialAccess;
		sequentialAccess = newSequentialAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__SEQUENTIAL_ACCESS, oldSequentialAccess, sequentialAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getExtentStatus() {
		if (extentStatus == null) {
			extentStatus = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_EXTENT__EXTENT_STATUS);
		}
		return extentStatus;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__NO_SINGLE_POINT_OF_FAILURE, oldNoSinglePointOfFailure, noSinglePointOfFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataRedundancy() {
		return dataRedundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataRedundancy(Integer newDataRedundancy) {
		Integer oldDataRedundancy = dataRedundancy;
		dataRedundancy = newDataRedundancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__DATA_REDUNDANCY, oldDataRedundancy, dataRedundancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPackageRedundancy() {
		return packageRedundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageRedundancy(Integer newPackageRedundancy) {
		Integer oldPackageRedundancy = packageRedundancy;
		packageRedundancy = newPackageRedundancy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__PACKAGE_REDUNDANCY, oldPackageRedundancy, packageRedundancy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeltaReservation() {
		return deltaReservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltaReservation(Integer newDeltaReservation) {
		Integer oldDeltaReservation = deltaReservation;
		deltaReservation = newDeltaReservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__DELTA_RESERVATION, oldDeltaReservation, deltaReservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPrimordial() {
		return primordial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimordial(Boolean newPrimordial) {
		Boolean oldPrimordial = primordial;
		primordial = newPrimordial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__PRIMORDIAL, oldPrimordial, primordial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNameFormat() {
		return nameFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameFormat(Integer newNameFormat) {
		Integer oldNameFormat = nameFormat;
		nameFormat = newNameFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__NAME_FORMAT, oldNameFormat, nameFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNameNamespace() {
		return nameNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameNamespace(Integer newNameNamespace) {
		Integer oldNameNamespace = nameNamespace;
		nameNamespace = newNameNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__NAME_NAMESPACE, oldNameNamespace, nameNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherNameNamespace() {
		return otherNameNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherNameNamespace(String newOtherNameNamespace) {
		String oldOtherNameNamespace = otherNameNamespace;
		otherNameNamespace = newOtherNameNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__OTHER_NAME_NAMESPACE, oldOtherNameNamespace, otherNameNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherNameFormat() {
		return otherNameFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherNameFormat(String newOtherNameFormat) {
		String oldOtherNameFormat = otherNameFormat;
		otherNameFormat = newOtherNameFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__OTHER_NAME_FORMAT, oldOtherNameFormat, otherNameFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getClientSettableUsage() {
		if (clientSettableUsage == null) {
			clientSettableUsage = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_EXTENT__CLIENT_SETTABLE_USAGE);
		}
		return clientSettableUsage;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__COMPRESSION_RATE, oldCompressionRate, compressionRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCompressionState() {
		return compressionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompressionState(Integer newCompressionState) {
		Integer oldCompressionState = compressionState;
		compressionState = newCompressionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__COMPRESSION_STATE, oldCompressionState, compressionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getExtentDiscriminator() {
		if (extentDiscriminator == null) {
			extentDiscriminator = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_STORAGE_EXTENT__EXTENT_DISCRIMINATOR);
		}
		return extentDiscriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getExtentInterleaveDepth() {
		return extentInterleaveDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtentInterleaveDepth(Long newExtentInterleaveDepth) {
		Long oldExtentInterleaveDepth = extentInterleaveDepth;
		extentInterleaveDepth = newExtentInterleaveDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__EXTENT_INTERLEAVE_DEPTH, oldExtentInterleaveDepth, extentInterleaveDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getExtentStripeLength() {
		return extentStripeLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtentStripeLength(Long newExtentStripeLength) {
		Long oldExtentStripeLength = extentStripeLength;
		extentStripeLength = newExtentStripeLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__EXTENT_STRIPE_LENGTH, oldExtentStripeLength, extentStripeLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsComposite(Boolean newIsComposite) {
		Boolean oldIsComposite = isComposite;
		isComposite = newIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__IS_COMPOSITE, oldIsComposite, isComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsCompressed() {
		return isCompressed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsCompressed(Boolean newIsCompressed) {
		Boolean oldIsCompressed = isCompressed;
		isCompressed = newIsCompressed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__IS_COMPRESSED, oldIsCompressed, isCompressed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsConcatenated() {
		return isConcatenated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConcatenated(Boolean newIsConcatenated) {
		Boolean oldIsConcatenated = isConcatenated;
		isConcatenated = newIsConcatenated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__IS_CONCATENATED, oldIsConcatenated, isConcatenated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherUsageDescription() {
		return otherUsageDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherUsageDescription(String newOtherUsageDescription) {
		String oldOtherUsageDescription = otherUsageDescription;
		otherUsageDescription = newOtherUsageDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__OTHER_USAGE_DESCRIPTION, oldOtherUsageDescription, otherUsageDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsage(Integer newUsage) {
		Integer oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_EXTENT__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_EXTENT__DATA_ORGANIZATION:
				return getDataOrganization();
			case CimPackage.CIM_STORAGE_EXTENT__PURPOSE:
				return getPurpose();
			case CimPackage.CIM_STORAGE_EXTENT__ACCESS:
				return getAccess();
			case CimPackage.CIM_STORAGE_EXTENT__ERROR_METHODOLOGY:
				return getErrorMethodology();
			case CimPackage.CIM_STORAGE_EXTENT__BLOCK_SIZE:
				return getBlockSize();
			case CimPackage.CIM_STORAGE_EXTENT__NUMBER_OF_BLOCKS:
				return getNumberOfBlocks();
			case CimPackage.CIM_STORAGE_EXTENT__CONSUMABLE_BLOCKS:
				return getConsumableBlocks();
			case CimPackage.CIM_STORAGE_EXTENT__IS_BASED_ON_UNDERLYING_REDUNDANCY:
				return getIsBasedOnUnderlyingRedundancy();
			case CimPackage.CIM_STORAGE_EXTENT__SEQUENTIAL_ACCESS:
				return getSequentialAccess();
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_STATUS:
				return getExtentStatus();
			case CimPackage.CIM_STORAGE_EXTENT__NO_SINGLE_POINT_OF_FAILURE:
				return getNoSinglePointOfFailure();
			case CimPackage.CIM_STORAGE_EXTENT__DATA_REDUNDANCY:
				return getDataRedundancy();
			case CimPackage.CIM_STORAGE_EXTENT__PACKAGE_REDUNDANCY:
				return getPackageRedundancy();
			case CimPackage.CIM_STORAGE_EXTENT__DELTA_RESERVATION:
				return getDeltaReservation();
			case CimPackage.CIM_STORAGE_EXTENT__PRIMORDIAL:
				return getPrimordial();
			case CimPackage.CIM_STORAGE_EXTENT__NAME_FORMAT:
				return getNameFormat();
			case CimPackage.CIM_STORAGE_EXTENT__NAME_NAMESPACE:
				return getNameNamespace();
			case CimPackage.CIM_STORAGE_EXTENT__OTHER_NAME_NAMESPACE:
				return getOtherNameNamespace();
			case CimPackage.CIM_STORAGE_EXTENT__OTHER_NAME_FORMAT:
				return getOtherNameFormat();
			case CimPackage.CIM_STORAGE_EXTENT__CLIENT_SETTABLE_USAGE:
				return getClientSettableUsage();
			case CimPackage.CIM_STORAGE_EXTENT__COMPRESSION_RATE:
				return getCompressionRate();
			case CimPackage.CIM_STORAGE_EXTENT__COMPRESSION_STATE:
				return getCompressionState();
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_DISCRIMINATOR:
				return getExtentDiscriminator();
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_INTERLEAVE_DEPTH:
				return getExtentInterleaveDepth();
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_STRIPE_LENGTH:
				return getExtentStripeLength();
			case CimPackage.CIM_STORAGE_EXTENT__IS_COMPOSITE:
				return getIsComposite();
			case CimPackage.CIM_STORAGE_EXTENT__IS_COMPRESSED:
				return getIsCompressed();
			case CimPackage.CIM_STORAGE_EXTENT__IS_CONCATENATED:
				return getIsConcatenated();
			case CimPackage.CIM_STORAGE_EXTENT__OTHER_USAGE_DESCRIPTION:
				return getOtherUsageDescription();
			case CimPackage.CIM_STORAGE_EXTENT__USAGE:
				return getUsage();
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
			case CimPackage.CIM_STORAGE_EXTENT__DATA_ORGANIZATION:
				setDataOrganization((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__PURPOSE:
				setPurpose((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__ACCESS:
				setAccess((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__ERROR_METHODOLOGY:
				setErrorMethodology((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__BLOCK_SIZE:
				setBlockSize((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__NUMBER_OF_BLOCKS:
				setNumberOfBlocks((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__CONSUMABLE_BLOCKS:
				setConsumableBlocks((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__IS_BASED_ON_UNDERLYING_REDUNDANCY:
				setIsBasedOnUnderlyingRedundancy((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__SEQUENTIAL_ACCESS:
				setSequentialAccess((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_STATUS:
				getExtentStatus().clear();
				getExtentStatus().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__NO_SINGLE_POINT_OF_FAILURE:
				setNoSinglePointOfFailure((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__DATA_REDUNDANCY:
				setDataRedundancy((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__PACKAGE_REDUNDANCY:
				setPackageRedundancy((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__DELTA_RESERVATION:
				setDeltaReservation((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__PRIMORDIAL:
				setPrimordial((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__NAME_FORMAT:
				setNameFormat((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__NAME_NAMESPACE:
				setNameNamespace((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__OTHER_NAME_NAMESPACE:
				setOtherNameNamespace((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__OTHER_NAME_FORMAT:
				setOtherNameFormat((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__CLIENT_SETTABLE_USAGE:
				getClientSettableUsage().clear();
				getClientSettableUsage().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__COMPRESSION_RATE:
				setCompressionRate((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__COMPRESSION_STATE:
				setCompressionState((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_DISCRIMINATOR:
				getExtentDiscriminator().clear();
				getExtentDiscriminator().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_INTERLEAVE_DEPTH:
				setExtentInterleaveDepth((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_STRIPE_LENGTH:
				setExtentStripeLength((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__IS_COMPOSITE:
				setIsComposite((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__IS_COMPRESSED:
				setIsCompressed((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__IS_CONCATENATED:
				setIsConcatenated((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__OTHER_USAGE_DESCRIPTION:
				setOtherUsageDescription((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__USAGE:
				setUsage((Integer)newValue);
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
			case CimPackage.CIM_STORAGE_EXTENT__DATA_ORGANIZATION:
				setDataOrganization(DATA_ORGANIZATION_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__ERROR_METHODOLOGY:
				setErrorMethodology(ERROR_METHODOLOGY_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__BLOCK_SIZE:
				setBlockSize(BLOCK_SIZE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__NUMBER_OF_BLOCKS:
				setNumberOfBlocks(NUMBER_OF_BLOCKS_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__CONSUMABLE_BLOCKS:
				setConsumableBlocks(CONSUMABLE_BLOCKS_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__IS_BASED_ON_UNDERLYING_REDUNDANCY:
				setIsBasedOnUnderlyingRedundancy(IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__SEQUENTIAL_ACCESS:
				setSequentialAccess(SEQUENTIAL_ACCESS_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_STATUS:
				getExtentStatus().clear();
				return;
			case CimPackage.CIM_STORAGE_EXTENT__NO_SINGLE_POINT_OF_FAILURE:
				setNoSinglePointOfFailure(NO_SINGLE_POINT_OF_FAILURE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__DATA_REDUNDANCY:
				setDataRedundancy(DATA_REDUNDANCY_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__PACKAGE_REDUNDANCY:
				setPackageRedundancy(PACKAGE_REDUNDANCY_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__DELTA_RESERVATION:
				setDeltaReservation(DELTA_RESERVATION_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__PRIMORDIAL:
				setPrimordial(PRIMORDIAL_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__NAME_FORMAT:
				setNameFormat(NAME_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__NAME_NAMESPACE:
				setNameNamespace(NAME_NAMESPACE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__OTHER_NAME_NAMESPACE:
				setOtherNameNamespace(OTHER_NAME_NAMESPACE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__OTHER_NAME_FORMAT:
				setOtherNameFormat(OTHER_NAME_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__CLIENT_SETTABLE_USAGE:
				getClientSettableUsage().clear();
				return;
			case CimPackage.CIM_STORAGE_EXTENT__COMPRESSION_RATE:
				setCompressionRate(COMPRESSION_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__COMPRESSION_STATE:
				setCompressionState(COMPRESSION_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_DISCRIMINATOR:
				getExtentDiscriminator().clear();
				return;
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_INTERLEAVE_DEPTH:
				setExtentInterleaveDepth(EXTENT_INTERLEAVE_DEPTH_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_STRIPE_LENGTH:
				setExtentStripeLength(EXTENT_STRIPE_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__IS_COMPRESSED:
				setIsCompressed(IS_COMPRESSED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__IS_CONCATENATED:
				setIsConcatenated(IS_CONCATENATED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__OTHER_USAGE_DESCRIPTION:
				setOtherUsageDescription(OTHER_USAGE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_EXTENT__USAGE:
				setUsage(USAGE_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_EXTENT__DATA_ORGANIZATION:
				return DATA_ORGANIZATION_EDEFAULT == null ? dataOrganization != null : !DATA_ORGANIZATION_EDEFAULT.equals(dataOrganization);
			case CimPackage.CIM_STORAGE_EXTENT__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case CimPackage.CIM_STORAGE_EXTENT__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case CimPackage.CIM_STORAGE_EXTENT__ERROR_METHODOLOGY:
				return ERROR_METHODOLOGY_EDEFAULT == null ? errorMethodology != null : !ERROR_METHODOLOGY_EDEFAULT.equals(errorMethodology);
			case CimPackage.CIM_STORAGE_EXTENT__BLOCK_SIZE:
				return BLOCK_SIZE_EDEFAULT == null ? blockSize != null : !BLOCK_SIZE_EDEFAULT.equals(blockSize);
			case CimPackage.CIM_STORAGE_EXTENT__NUMBER_OF_BLOCKS:
				return NUMBER_OF_BLOCKS_EDEFAULT == null ? numberOfBlocks != null : !NUMBER_OF_BLOCKS_EDEFAULT.equals(numberOfBlocks);
			case CimPackage.CIM_STORAGE_EXTENT__CONSUMABLE_BLOCKS:
				return CONSUMABLE_BLOCKS_EDEFAULT == null ? consumableBlocks != null : !CONSUMABLE_BLOCKS_EDEFAULT.equals(consumableBlocks);
			case CimPackage.CIM_STORAGE_EXTENT__IS_BASED_ON_UNDERLYING_REDUNDANCY:
				return IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT == null ? isBasedOnUnderlyingRedundancy != null : !IS_BASED_ON_UNDERLYING_REDUNDANCY_EDEFAULT.equals(isBasedOnUnderlyingRedundancy);
			case CimPackage.CIM_STORAGE_EXTENT__SEQUENTIAL_ACCESS:
				return SEQUENTIAL_ACCESS_EDEFAULT == null ? sequentialAccess != null : !SEQUENTIAL_ACCESS_EDEFAULT.equals(sequentialAccess);
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_STATUS:
				return extentStatus != null && !extentStatus.isEmpty();
			case CimPackage.CIM_STORAGE_EXTENT__NO_SINGLE_POINT_OF_FAILURE:
				return NO_SINGLE_POINT_OF_FAILURE_EDEFAULT == null ? noSinglePointOfFailure != null : !NO_SINGLE_POINT_OF_FAILURE_EDEFAULT.equals(noSinglePointOfFailure);
			case CimPackage.CIM_STORAGE_EXTENT__DATA_REDUNDANCY:
				return DATA_REDUNDANCY_EDEFAULT == null ? dataRedundancy != null : !DATA_REDUNDANCY_EDEFAULT.equals(dataRedundancy);
			case CimPackage.CIM_STORAGE_EXTENT__PACKAGE_REDUNDANCY:
				return PACKAGE_REDUNDANCY_EDEFAULT == null ? packageRedundancy != null : !PACKAGE_REDUNDANCY_EDEFAULT.equals(packageRedundancy);
			case CimPackage.CIM_STORAGE_EXTENT__DELTA_RESERVATION:
				return DELTA_RESERVATION_EDEFAULT == null ? deltaReservation != null : !DELTA_RESERVATION_EDEFAULT.equals(deltaReservation);
			case CimPackage.CIM_STORAGE_EXTENT__PRIMORDIAL:
				return PRIMORDIAL_EDEFAULT == null ? primordial != null : !PRIMORDIAL_EDEFAULT.equals(primordial);
			case CimPackage.CIM_STORAGE_EXTENT__NAME_FORMAT:
				return NAME_FORMAT_EDEFAULT == null ? nameFormat != null : !NAME_FORMAT_EDEFAULT.equals(nameFormat);
			case CimPackage.CIM_STORAGE_EXTENT__NAME_NAMESPACE:
				return NAME_NAMESPACE_EDEFAULT == null ? nameNamespace != null : !NAME_NAMESPACE_EDEFAULT.equals(nameNamespace);
			case CimPackage.CIM_STORAGE_EXTENT__OTHER_NAME_NAMESPACE:
				return OTHER_NAME_NAMESPACE_EDEFAULT == null ? otherNameNamespace != null : !OTHER_NAME_NAMESPACE_EDEFAULT.equals(otherNameNamespace);
			case CimPackage.CIM_STORAGE_EXTENT__OTHER_NAME_FORMAT:
				return OTHER_NAME_FORMAT_EDEFAULT == null ? otherNameFormat != null : !OTHER_NAME_FORMAT_EDEFAULT.equals(otherNameFormat);
			case CimPackage.CIM_STORAGE_EXTENT__CLIENT_SETTABLE_USAGE:
				return clientSettableUsage != null && !clientSettableUsage.isEmpty();
			case CimPackage.CIM_STORAGE_EXTENT__COMPRESSION_RATE:
				return COMPRESSION_RATE_EDEFAULT == null ? compressionRate != null : !COMPRESSION_RATE_EDEFAULT.equals(compressionRate);
			case CimPackage.CIM_STORAGE_EXTENT__COMPRESSION_STATE:
				return COMPRESSION_STATE_EDEFAULT == null ? compressionState != null : !COMPRESSION_STATE_EDEFAULT.equals(compressionState);
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_DISCRIMINATOR:
				return extentDiscriminator != null && !extentDiscriminator.isEmpty();
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_INTERLEAVE_DEPTH:
				return EXTENT_INTERLEAVE_DEPTH_EDEFAULT == null ? extentInterleaveDepth != null : !EXTENT_INTERLEAVE_DEPTH_EDEFAULT.equals(extentInterleaveDepth);
			case CimPackage.CIM_STORAGE_EXTENT__EXTENT_STRIPE_LENGTH:
				return EXTENT_STRIPE_LENGTH_EDEFAULT == null ? extentStripeLength != null : !EXTENT_STRIPE_LENGTH_EDEFAULT.equals(extentStripeLength);
			case CimPackage.CIM_STORAGE_EXTENT__IS_COMPOSITE:
				return IS_COMPOSITE_EDEFAULT == null ? isComposite != null : !IS_COMPOSITE_EDEFAULT.equals(isComposite);
			case CimPackage.CIM_STORAGE_EXTENT__IS_COMPRESSED:
				return IS_COMPRESSED_EDEFAULT == null ? isCompressed != null : !IS_COMPRESSED_EDEFAULT.equals(isCompressed);
			case CimPackage.CIM_STORAGE_EXTENT__IS_CONCATENATED:
				return IS_CONCATENATED_EDEFAULT == null ? isConcatenated != null : !IS_CONCATENATED_EDEFAULT.equals(isConcatenated);
			case CimPackage.CIM_STORAGE_EXTENT__OTHER_USAGE_DESCRIPTION:
				return OTHER_USAGE_DESCRIPTION_EDEFAULT == null ? otherUsageDescription != null : !OTHER_USAGE_DESCRIPTION_EDEFAULT.equals(otherUsageDescription);
			case CimPackage.CIM_STORAGE_EXTENT__USAGE:
				return USAGE_EDEFAULT == null ? usage != null : !USAGE_EDEFAULT.equals(usage);
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
		result.append(" (DataOrganization: ");
		result.append(dataOrganization);
		result.append(", Purpose: ");
		result.append(purpose);
		result.append(", Access: ");
		result.append(access);
		result.append(", ErrorMethodology: ");
		result.append(errorMethodology);
		result.append(", BlockSize: ");
		result.append(blockSize);
		result.append(", NumberOfBlocks: ");
		result.append(numberOfBlocks);
		result.append(", ConsumableBlocks: ");
		result.append(consumableBlocks);
		result.append(", IsBasedOnUnderlyingRedundancy: ");
		result.append(isBasedOnUnderlyingRedundancy);
		result.append(", SequentialAccess: ");
		result.append(sequentialAccess);
		result.append(", ExtentStatus: ");
		result.append(extentStatus);
		result.append(", NoSinglePointOfFailure: ");
		result.append(noSinglePointOfFailure);
		result.append(", DataRedundancy: ");
		result.append(dataRedundancy);
		result.append(", PackageRedundancy: ");
		result.append(packageRedundancy);
		result.append(", DeltaReservation: ");
		result.append(deltaReservation);
		result.append(", Primordial: ");
		result.append(primordial);
		result.append(", NameFormat: ");
		result.append(nameFormat);
		result.append(", NameNamespace: ");
		result.append(nameNamespace);
		result.append(", OtherNameNamespace: ");
		result.append(otherNameNamespace);
		result.append(", OtherNameFormat: ");
		result.append(otherNameFormat);
		result.append(", ClientSettableUsage: ");
		result.append(clientSettableUsage);
		result.append(", CompressionRate: ");
		result.append(compressionRate);
		result.append(", CompressionState: ");
		result.append(compressionState);
		result.append(", ExtentDiscriminator: ");
		result.append(extentDiscriminator);
		result.append(", ExtentInterleaveDepth: ");
		result.append(extentInterleaveDepth);
		result.append(", ExtentStripeLength: ");
		result.append(extentStripeLength);
		result.append(", IsComposite: ");
		result.append(isComposite);
		result.append(", IsCompressed: ");
		result.append(isCompressed);
		result.append(", IsConcatenated: ");
		result.append(isConcatenated);
		result.append(", OtherUsageDescription: ");
		result.append(otherUsageDescription);
		result.append(", Usage: ");
		result.append(usage);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageExtentImpl

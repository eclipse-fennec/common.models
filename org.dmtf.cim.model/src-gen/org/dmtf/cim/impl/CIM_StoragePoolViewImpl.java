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

import org.dmtf.cim.CIM_StoragePoolView;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Pool View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSPInstanceID <em>SP Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSPElementName <em>SP Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSPPoolID <em>SP Pool ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSPRemainingManagedSpace <em>SP Remaining Managed Space</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSPTotalManagedSpace <em>SP Total Managed Space</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSPPrimordial <em>SP Primordial</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSPUsage <em>SP Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSPOtherUsageDescription <em>SP Other Usage Description</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSPClientSettableUsage <em>SP Client Settable Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCInstanceID <em>SC Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCElementName <em>SC Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCElementType <em>SC Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCNoSinglePointOfFailure <em>SC No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCNoSinglePointOfFailureDefault <em>SC No Single Point Of Failure Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCPackageRedundancyDefault <em>SC Package Redundancy Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCPackageRedundancyMin <em>SC Package Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCPackageRedundancyMax <em>SC Package Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCDataRedundancyDefault <em>SC Data Redundancy Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCDataRedundancyMin <em>SC Data Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCDataRedundancyMax <em>SC Data Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCExtentStripeLengthDefault <em>SC Extent Stripe Length Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCParityLayoutDefault <em>SC Parity Layout Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCUserDataStripeDepthDefault <em>SC User Data Stripe Depth Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getAFSPSpaceConsumed <em>AFSP Space Consumed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCCInstanceID <em>SCC Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCCElementName <em>SCC Element Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCCSupportedStoragePoolFeatures <em>SCC Supported Storage Pool Features</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCCSupportedStorageElementTypes <em>SCC Supported Storage Element Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCCSupportedStorageElementFeatures <em>SCC Supported Storage Element Features</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCCSupportedSynchronousActions <em>SCC Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCCSupportedAsynchronousActions <em>SCC Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCCSupportedStorageElementUsage <em>SCC Supported Storage Element Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCCClientSettableElementUsage <em>SCC Client Settable Element Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCCSupportedStoragePoolUsage <em>SCC Supported Storage Pool Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StoragePoolViewImpl#getSCCClientSettablePoolUsage <em>SCC Client Settable Pool Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StoragePoolViewImpl extends CIM_ViewImpl implements CIM_StoragePoolView {
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
	 * The default value of the '{@link #getSPElementName() <em>SP Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String SP_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPElementName() <em>SP Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPElementName()
	 * @generated
	 * @ordered
	 */
	protected String spElementName = SP_ELEMENT_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getSPRemainingManagedSpace() <em>SP Remaining Managed Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPRemainingManagedSpace()
	 * @generated
	 * @ordered
	 */
	protected static final Long SP_REMAINING_MANAGED_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPRemainingManagedSpace() <em>SP Remaining Managed Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPRemainingManagedSpace()
	 * @generated
	 * @ordered
	 */
	protected Long spRemainingManagedSpace = SP_REMAINING_MANAGED_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPTotalManagedSpace() <em>SP Total Managed Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPTotalManagedSpace()
	 * @generated
	 * @ordered
	 */
	protected static final Long SP_TOTAL_MANAGED_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPTotalManagedSpace() <em>SP Total Managed Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPTotalManagedSpace()
	 * @generated
	 * @ordered
	 */
	protected Long spTotalManagedSpace = SP_TOTAL_MANAGED_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPPrimordial() <em>SP Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPPrimordial()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SP_PRIMORDIAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPPrimordial() <em>SP Primordial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPPrimordial()
	 * @generated
	 * @ordered
	 */
	protected Boolean spPrimordial = SP_PRIMORDIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPUsage() <em>SP Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SP_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPUsage() <em>SP Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPUsage()
	 * @generated
	 * @ordered
	 */
	protected Integer spUsage = SP_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSPOtherUsageDescription() <em>SP Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPOtherUsageDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SP_OTHER_USAGE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPOtherUsageDescription() <em>SP Other Usage Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPOtherUsageDescription()
	 * @generated
	 * @ordered
	 */
	protected String spOtherUsageDescription = SP_OTHER_USAGE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSPClientSettableUsage() <em>SP Client Settable Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPClientSettableUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> spClientSettableUsage;

	/**
	 * The default value of the '{@link #getSCInstanceID() <em>SC Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SC_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCInstanceID() <em>SC Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String scInstanceID = SC_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCElementName() <em>SC Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String SC_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCElementName() <em>SC Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCElementName()
	 * @generated
	 * @ordered
	 */
	protected String scElementName = SC_ELEMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCElementType() <em>SC Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCElementType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SC_ELEMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCElementType() <em>SC Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCElementType()
	 * @generated
	 * @ordered
	 */
	protected Integer scElementType = SC_ELEMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCNoSinglePointOfFailure() <em>SC No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCNoSinglePointOfFailure()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SC_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCNoSinglePointOfFailure() <em>SC No Single Point Of Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCNoSinglePointOfFailure()
	 * @generated
	 * @ordered
	 */
	protected Boolean scNoSinglePointOfFailure = SC_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCNoSinglePointOfFailureDefault() <em>SC No Single Point Of Failure Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCNoSinglePointOfFailureDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SC_NO_SINGLE_POINT_OF_FAILURE_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCNoSinglePointOfFailureDefault() <em>SC No Single Point Of Failure Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCNoSinglePointOfFailureDefault()
	 * @generated
	 * @ordered
	 */
	protected Boolean scNoSinglePointOfFailureDefault = SC_NO_SINGLE_POINT_OF_FAILURE_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCPackageRedundancyDefault() <em>SC Package Redundancy Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCPackageRedundancyDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SC_PACKAGE_REDUNDANCY_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCPackageRedundancyDefault() <em>SC Package Redundancy Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCPackageRedundancyDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer scPackageRedundancyDefault = SC_PACKAGE_REDUNDANCY_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCPackageRedundancyMin() <em>SC Package Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCPackageRedundancyMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SC_PACKAGE_REDUNDANCY_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCPackageRedundancyMin() <em>SC Package Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCPackageRedundancyMin()
	 * @generated
	 * @ordered
	 */
	protected Integer scPackageRedundancyMin = SC_PACKAGE_REDUNDANCY_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCPackageRedundancyMax() <em>SC Package Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCPackageRedundancyMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SC_PACKAGE_REDUNDANCY_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCPackageRedundancyMax() <em>SC Package Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCPackageRedundancyMax()
	 * @generated
	 * @ordered
	 */
	protected Integer scPackageRedundancyMax = SC_PACKAGE_REDUNDANCY_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCDataRedundancyDefault() <em>SC Data Redundancy Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCDataRedundancyDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SC_DATA_REDUNDANCY_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCDataRedundancyDefault() <em>SC Data Redundancy Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCDataRedundancyDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer scDataRedundancyDefault = SC_DATA_REDUNDANCY_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCDataRedundancyMin() <em>SC Data Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCDataRedundancyMin()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SC_DATA_REDUNDANCY_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCDataRedundancyMin() <em>SC Data Redundancy Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCDataRedundancyMin()
	 * @generated
	 * @ordered
	 */
	protected Integer scDataRedundancyMin = SC_DATA_REDUNDANCY_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCDataRedundancyMax() <em>SC Data Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCDataRedundancyMax()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SC_DATA_REDUNDANCY_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCDataRedundancyMax() <em>SC Data Redundancy Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCDataRedundancyMax()
	 * @generated
	 * @ordered
	 */
	protected Integer scDataRedundancyMax = SC_DATA_REDUNDANCY_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCExtentStripeLengthDefault() <em>SC Extent Stripe Length Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCExtentStripeLengthDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SC_EXTENT_STRIPE_LENGTH_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCExtentStripeLengthDefault() <em>SC Extent Stripe Length Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCExtentStripeLengthDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer scExtentStripeLengthDefault = SC_EXTENT_STRIPE_LENGTH_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCParityLayoutDefault() <em>SC Parity Layout Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCParityLayoutDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SC_PARITY_LAYOUT_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCParityLayoutDefault() <em>SC Parity Layout Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCParityLayoutDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer scParityLayoutDefault = SC_PARITY_LAYOUT_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCUserDataStripeDepthDefault() <em>SC User Data Stripe Depth Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCUserDataStripeDepthDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Long SC_USER_DATA_STRIPE_DEPTH_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCUserDataStripeDepthDefault() <em>SC User Data Stripe Depth Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCUserDataStripeDepthDefault()
	 * @generated
	 * @ordered
	 */
	protected Long scUserDataStripeDepthDefault = SC_USER_DATA_STRIPE_DEPTH_DEFAULT_EDEFAULT;

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
	 * The default value of the '{@link #getSCCInstanceID() <em>SCC Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCCInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SCC_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCCInstanceID() <em>SCC Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCCInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String sccInstanceID = SCC_INSTANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSCCElementName() <em>SCC Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCCElementName()
	 * @generated
	 * @ordered
	 */
	protected static final String SCC_ELEMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSCCElementName() <em>SCC Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCCElementName()
	 * @generated
	 * @ordered
	 */
	protected String sccElementName = SCC_ELEMENT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSCCSupportedStoragePoolFeatures() <em>SCC Supported Storage Pool Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCCSupportedStoragePoolFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> sccSupportedStoragePoolFeatures;

	/**
	 * The cached value of the '{@link #getSCCSupportedStorageElementTypes() <em>SCC Supported Storage Element Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCCSupportedStorageElementTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> sccSupportedStorageElementTypes;

	/**
	 * The cached value of the '{@link #getSCCSupportedStorageElementFeatures() <em>SCC Supported Storage Element Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCCSupportedStorageElementFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> sccSupportedStorageElementFeatures;

	/**
	 * The cached value of the '{@link #getSCCSupportedSynchronousActions() <em>SCC Supported Synchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCCSupportedSynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> sccSupportedSynchronousActions;

	/**
	 * The cached value of the '{@link #getSCCSupportedAsynchronousActions() <em>SCC Supported Asynchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCCSupportedAsynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> sccSupportedAsynchronousActions;

	/**
	 * The cached value of the '{@link #getSCCSupportedStorageElementUsage() <em>SCC Supported Storage Element Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCCSupportedStorageElementUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> sccSupportedStorageElementUsage;

	/**
	 * The cached value of the '{@link #getSCCClientSettableElementUsage() <em>SCC Client Settable Element Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCCClientSettableElementUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sccClientSettableElementUsage;

	/**
	 * The cached value of the '{@link #getSCCSupportedStoragePoolUsage() <em>SCC Supported Storage Pool Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCCSupportedStoragePoolUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sccSupportedStoragePoolUsage;

	/**
	 * The cached value of the '{@link #getSCCClientSettablePoolUsage() <em>SCC Client Settable Pool Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCCClientSettablePoolUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sccClientSettablePoolUsage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StoragePoolViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StoragePoolView();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SP_INSTANCE_ID, oldSPInstanceID, spInstanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSPElementName() {
		return spElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPElementName(String newSPElementName) {
		String oldSPElementName = spElementName;
		spElementName = newSPElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SP_ELEMENT_NAME, oldSPElementName, spElementName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SP_POOL_ID, oldSPPoolID, spPoolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSPRemainingManagedSpace() {
		return spRemainingManagedSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPRemainingManagedSpace(Long newSPRemainingManagedSpace) {
		Long oldSPRemainingManagedSpace = spRemainingManagedSpace;
		spRemainingManagedSpace = newSPRemainingManagedSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SP_REMAINING_MANAGED_SPACE, oldSPRemainingManagedSpace, spRemainingManagedSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSPTotalManagedSpace() {
		return spTotalManagedSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPTotalManagedSpace(Long newSPTotalManagedSpace) {
		Long oldSPTotalManagedSpace = spTotalManagedSpace;
		spTotalManagedSpace = newSPTotalManagedSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SP_TOTAL_MANAGED_SPACE, oldSPTotalManagedSpace, spTotalManagedSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSPPrimordial() {
		return spPrimordial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPPrimordial(Boolean newSPPrimordial) {
		Boolean oldSPPrimordial = spPrimordial;
		spPrimordial = newSPPrimordial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SP_PRIMORDIAL, oldSPPrimordial, spPrimordial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSPUsage() {
		return spUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPUsage(Integer newSPUsage) {
		Integer oldSPUsage = spUsage;
		spUsage = newSPUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SP_USAGE, oldSPUsage, spUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSPOtherUsageDescription() {
		return spOtherUsageDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSPOtherUsageDescription(String newSPOtherUsageDescription) {
		String oldSPOtherUsageDescription = spOtherUsageDescription;
		spOtherUsageDescription = newSPOtherUsageDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SP_OTHER_USAGE_DESCRIPTION, oldSPOtherUsageDescription, spOtherUsageDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSPClientSettableUsage() {
		if (spClientSettableUsage == null) {
			spClientSettableUsage = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_POOL_VIEW__SP_CLIENT_SETTABLE_USAGE);
		}
		return spClientSettableUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSCInstanceID() {
		return scInstanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCInstanceID(String newSCInstanceID) {
		String oldSCInstanceID = scInstanceID;
		scInstanceID = newSCInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SC_INSTANCE_ID, oldSCInstanceID, scInstanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSCElementName() {
		return scElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCElementName(String newSCElementName) {
		String oldSCElementName = scElementName;
		scElementName = newSCElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SC_ELEMENT_NAME, oldSCElementName, scElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSCElementType() {
		return scElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCElementType(Integer newSCElementType) {
		Integer oldSCElementType = scElementType;
		scElementType = newSCElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SC_ELEMENT_TYPE, oldSCElementType, scElementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSCNoSinglePointOfFailure() {
		return scNoSinglePointOfFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCNoSinglePointOfFailure(Boolean newSCNoSinglePointOfFailure) {
		Boolean oldSCNoSinglePointOfFailure = scNoSinglePointOfFailure;
		scNoSinglePointOfFailure = newSCNoSinglePointOfFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SC_NO_SINGLE_POINT_OF_FAILURE, oldSCNoSinglePointOfFailure, scNoSinglePointOfFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSCNoSinglePointOfFailureDefault() {
		return scNoSinglePointOfFailureDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCNoSinglePointOfFailureDefault(Boolean newSCNoSinglePointOfFailureDefault) {
		Boolean oldSCNoSinglePointOfFailureDefault = scNoSinglePointOfFailureDefault;
		scNoSinglePointOfFailureDefault = newSCNoSinglePointOfFailureDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SC_NO_SINGLE_POINT_OF_FAILURE_DEFAULT, oldSCNoSinglePointOfFailureDefault, scNoSinglePointOfFailureDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSCPackageRedundancyDefault() {
		return scPackageRedundancyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCPackageRedundancyDefault(Integer newSCPackageRedundancyDefault) {
		Integer oldSCPackageRedundancyDefault = scPackageRedundancyDefault;
		scPackageRedundancyDefault = newSCPackageRedundancyDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SC_PACKAGE_REDUNDANCY_DEFAULT, oldSCPackageRedundancyDefault, scPackageRedundancyDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSCPackageRedundancyMin() {
		return scPackageRedundancyMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCPackageRedundancyMin(Integer newSCPackageRedundancyMin) {
		Integer oldSCPackageRedundancyMin = scPackageRedundancyMin;
		scPackageRedundancyMin = newSCPackageRedundancyMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SC_PACKAGE_REDUNDANCY_MIN, oldSCPackageRedundancyMin, scPackageRedundancyMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSCPackageRedundancyMax() {
		return scPackageRedundancyMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCPackageRedundancyMax(Integer newSCPackageRedundancyMax) {
		Integer oldSCPackageRedundancyMax = scPackageRedundancyMax;
		scPackageRedundancyMax = newSCPackageRedundancyMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SC_PACKAGE_REDUNDANCY_MAX, oldSCPackageRedundancyMax, scPackageRedundancyMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSCDataRedundancyDefault() {
		return scDataRedundancyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCDataRedundancyDefault(Integer newSCDataRedundancyDefault) {
		Integer oldSCDataRedundancyDefault = scDataRedundancyDefault;
		scDataRedundancyDefault = newSCDataRedundancyDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SC_DATA_REDUNDANCY_DEFAULT, oldSCDataRedundancyDefault, scDataRedundancyDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSCDataRedundancyMin() {
		return scDataRedundancyMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCDataRedundancyMin(Integer newSCDataRedundancyMin) {
		Integer oldSCDataRedundancyMin = scDataRedundancyMin;
		scDataRedundancyMin = newSCDataRedundancyMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SC_DATA_REDUNDANCY_MIN, oldSCDataRedundancyMin, scDataRedundancyMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSCDataRedundancyMax() {
		return scDataRedundancyMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCDataRedundancyMax(Integer newSCDataRedundancyMax) {
		Integer oldSCDataRedundancyMax = scDataRedundancyMax;
		scDataRedundancyMax = newSCDataRedundancyMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SC_DATA_REDUNDANCY_MAX, oldSCDataRedundancyMax, scDataRedundancyMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSCExtentStripeLengthDefault() {
		return scExtentStripeLengthDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCExtentStripeLengthDefault(Integer newSCExtentStripeLengthDefault) {
		Integer oldSCExtentStripeLengthDefault = scExtentStripeLengthDefault;
		scExtentStripeLengthDefault = newSCExtentStripeLengthDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SC_EXTENT_STRIPE_LENGTH_DEFAULT, oldSCExtentStripeLengthDefault, scExtentStripeLengthDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSCParityLayoutDefault() {
		return scParityLayoutDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCParityLayoutDefault(Integer newSCParityLayoutDefault) {
		Integer oldSCParityLayoutDefault = scParityLayoutDefault;
		scParityLayoutDefault = newSCParityLayoutDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SC_PARITY_LAYOUT_DEFAULT, oldSCParityLayoutDefault, scParityLayoutDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getSCUserDataStripeDepthDefault() {
		return scUserDataStripeDepthDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCUserDataStripeDepthDefault(Long newSCUserDataStripeDepthDefault) {
		Long oldSCUserDataStripeDepthDefault = scUserDataStripeDepthDefault;
		scUserDataStripeDepthDefault = newSCUserDataStripeDepthDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SC_USER_DATA_STRIPE_DEPTH_DEFAULT, oldSCUserDataStripeDepthDefault, scUserDataStripeDepthDefault));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__AFSP_SPACE_CONSUMED, oldAFSPSpaceConsumed, afspSpaceConsumed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSCCInstanceID() {
		return sccInstanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCCInstanceID(String newSCCInstanceID) {
		String oldSCCInstanceID = sccInstanceID;
		sccInstanceID = newSCCInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SCC_INSTANCE_ID, oldSCCInstanceID, sccInstanceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSCCElementName() {
		return sccElementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSCCElementName(String newSCCElementName) {
		String oldSCCElementName = sccElementName;
		sccElementName = newSCCElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_POOL_VIEW__SCC_ELEMENT_NAME, oldSCCElementName, sccElementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSCCSupportedStoragePoolFeatures() {
		if (sccSupportedStoragePoolFeatures == null) {
			sccSupportedStoragePoolFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_POOL_FEATURES);
		}
		return sccSupportedStoragePoolFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSCCSupportedStorageElementTypes() {
		if (sccSupportedStorageElementTypes == null) {
			sccSupportedStorageElementTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_ELEMENT_TYPES);
		}
		return sccSupportedStorageElementTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSCCSupportedStorageElementFeatures() {
		if (sccSupportedStorageElementFeatures == null) {
			sccSupportedStorageElementFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_ELEMENT_FEATURES);
		}
		return sccSupportedStorageElementFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSCCSupportedSynchronousActions() {
		if (sccSupportedSynchronousActions == null) {
			sccSupportedSynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_SYNCHRONOUS_ACTIONS);
		}
		return sccSupportedSynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSCCSupportedAsynchronousActions() {
		if (sccSupportedAsynchronousActions == null) {
			sccSupportedAsynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_ASYNCHRONOUS_ACTIONS);
		}
		return sccSupportedAsynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSCCSupportedStorageElementUsage() {
		if (sccSupportedStorageElementUsage == null) {
			sccSupportedStorageElementUsage = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_ELEMENT_USAGE);
		}
		return sccSupportedStorageElementUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSCCClientSettableElementUsage() {
		if (sccClientSettableElementUsage == null) {
			sccClientSettableElementUsage = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_STORAGE_POOL_VIEW__SCC_CLIENT_SETTABLE_ELEMENT_USAGE);
		}
		return sccClientSettableElementUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSCCSupportedStoragePoolUsage() {
		if (sccSupportedStoragePoolUsage == null) {
			sccSupportedStoragePoolUsage = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_POOL_USAGE);
		}
		return sccSupportedStoragePoolUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSCCClientSettablePoolUsage() {
		if (sccClientSettablePoolUsage == null) {
			sccClientSettablePoolUsage = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_STORAGE_POOL_VIEW__SCC_CLIENT_SETTABLE_POOL_USAGE);
		}
		return sccClientSettablePoolUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_INSTANCE_ID:
				return getSPInstanceID();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_ELEMENT_NAME:
				return getSPElementName();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_POOL_ID:
				return getSPPoolID();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_REMAINING_MANAGED_SPACE:
				return getSPRemainingManagedSpace();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_TOTAL_MANAGED_SPACE:
				return getSPTotalManagedSpace();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_PRIMORDIAL:
				return getSPPrimordial();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_USAGE:
				return getSPUsage();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_OTHER_USAGE_DESCRIPTION:
				return getSPOtherUsageDescription();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_CLIENT_SETTABLE_USAGE:
				return getSPClientSettableUsage();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_INSTANCE_ID:
				return getSCInstanceID();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_ELEMENT_NAME:
				return getSCElementName();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_ELEMENT_TYPE:
				return getSCElementType();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_NO_SINGLE_POINT_OF_FAILURE:
				return getSCNoSinglePointOfFailure();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_NO_SINGLE_POINT_OF_FAILURE_DEFAULT:
				return getSCNoSinglePointOfFailureDefault();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PACKAGE_REDUNDANCY_DEFAULT:
				return getSCPackageRedundancyDefault();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PACKAGE_REDUNDANCY_MIN:
				return getSCPackageRedundancyMin();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PACKAGE_REDUNDANCY_MAX:
				return getSCPackageRedundancyMax();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_DATA_REDUNDANCY_DEFAULT:
				return getSCDataRedundancyDefault();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_DATA_REDUNDANCY_MIN:
				return getSCDataRedundancyMin();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_DATA_REDUNDANCY_MAX:
				return getSCDataRedundancyMax();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_EXTENT_STRIPE_LENGTH_DEFAULT:
				return getSCExtentStripeLengthDefault();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PARITY_LAYOUT_DEFAULT:
				return getSCParityLayoutDefault();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_USER_DATA_STRIPE_DEPTH_DEFAULT:
				return getSCUserDataStripeDepthDefault();
			case CimPackage.CIM_STORAGE_POOL_VIEW__AFSP_SPACE_CONSUMED:
				return getAFSPSpaceConsumed();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_INSTANCE_ID:
				return getSCCInstanceID();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_ELEMENT_NAME:
				return getSCCElementName();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_POOL_FEATURES:
				return getSCCSupportedStoragePoolFeatures();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_ELEMENT_TYPES:
				return getSCCSupportedStorageElementTypes();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_ELEMENT_FEATURES:
				return getSCCSupportedStorageElementFeatures();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_SYNCHRONOUS_ACTIONS:
				return getSCCSupportedSynchronousActions();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return getSCCSupportedAsynchronousActions();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_ELEMENT_USAGE:
				return getSCCSupportedStorageElementUsage();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_CLIENT_SETTABLE_ELEMENT_USAGE:
				return getSCCClientSettableElementUsage();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_POOL_USAGE:
				return getSCCSupportedStoragePoolUsage();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_CLIENT_SETTABLE_POOL_USAGE:
				return getSCCClientSettablePoolUsage();
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
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_INSTANCE_ID:
				setSPInstanceID((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_ELEMENT_NAME:
				setSPElementName((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_POOL_ID:
				setSPPoolID((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_REMAINING_MANAGED_SPACE:
				setSPRemainingManagedSpace((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_TOTAL_MANAGED_SPACE:
				setSPTotalManagedSpace((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_PRIMORDIAL:
				setSPPrimordial((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_USAGE:
				setSPUsage((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_OTHER_USAGE_DESCRIPTION:
				setSPOtherUsageDescription((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_CLIENT_SETTABLE_USAGE:
				getSPClientSettableUsage().clear();
				getSPClientSettableUsage().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_INSTANCE_ID:
				setSCInstanceID((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_ELEMENT_NAME:
				setSCElementName((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_ELEMENT_TYPE:
				setSCElementType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_NO_SINGLE_POINT_OF_FAILURE:
				setSCNoSinglePointOfFailure((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_NO_SINGLE_POINT_OF_FAILURE_DEFAULT:
				setSCNoSinglePointOfFailureDefault((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PACKAGE_REDUNDANCY_DEFAULT:
				setSCPackageRedundancyDefault((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PACKAGE_REDUNDANCY_MIN:
				setSCPackageRedundancyMin((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PACKAGE_REDUNDANCY_MAX:
				setSCPackageRedundancyMax((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_DATA_REDUNDANCY_DEFAULT:
				setSCDataRedundancyDefault((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_DATA_REDUNDANCY_MIN:
				setSCDataRedundancyMin((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_DATA_REDUNDANCY_MAX:
				setSCDataRedundancyMax((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_EXTENT_STRIPE_LENGTH_DEFAULT:
				setSCExtentStripeLengthDefault((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PARITY_LAYOUT_DEFAULT:
				setSCParityLayoutDefault((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_USER_DATA_STRIPE_DEPTH_DEFAULT:
				setSCUserDataStripeDepthDefault((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__AFSP_SPACE_CONSUMED:
				setAFSPSpaceConsumed((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_INSTANCE_ID:
				setSCCInstanceID((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_ELEMENT_NAME:
				setSCCElementName((String)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_POOL_FEATURES:
				getSCCSupportedStoragePoolFeatures().clear();
				getSCCSupportedStoragePoolFeatures().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_ELEMENT_TYPES:
				getSCCSupportedStorageElementTypes().clear();
				getSCCSupportedStorageElementTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_ELEMENT_FEATURES:
				getSCCSupportedStorageElementFeatures().clear();
				getSCCSupportedStorageElementFeatures().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSCCSupportedSynchronousActions().clear();
				getSCCSupportedSynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSCCSupportedAsynchronousActions().clear();
				getSCCSupportedAsynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_ELEMENT_USAGE:
				getSCCSupportedStorageElementUsage().clear();
				getSCCSupportedStorageElementUsage().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_CLIENT_SETTABLE_ELEMENT_USAGE:
				getSCCClientSettableElementUsage().clear();
				getSCCClientSettableElementUsage().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_POOL_USAGE:
				getSCCSupportedStoragePoolUsage().clear();
				getSCCSupportedStoragePoolUsage().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_CLIENT_SETTABLE_POOL_USAGE:
				getSCCClientSettablePoolUsage().clear();
				getSCCClientSettablePoolUsage().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_INSTANCE_ID:
				setSPInstanceID(SP_INSTANCE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_ELEMENT_NAME:
				setSPElementName(SP_ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_POOL_ID:
				setSPPoolID(SP_POOL_ID_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_REMAINING_MANAGED_SPACE:
				setSPRemainingManagedSpace(SP_REMAINING_MANAGED_SPACE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_TOTAL_MANAGED_SPACE:
				setSPTotalManagedSpace(SP_TOTAL_MANAGED_SPACE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_PRIMORDIAL:
				setSPPrimordial(SP_PRIMORDIAL_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_USAGE:
				setSPUsage(SP_USAGE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_OTHER_USAGE_DESCRIPTION:
				setSPOtherUsageDescription(SP_OTHER_USAGE_DESCRIPTION_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_CLIENT_SETTABLE_USAGE:
				getSPClientSettableUsage().clear();
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_INSTANCE_ID:
				setSCInstanceID(SC_INSTANCE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_ELEMENT_NAME:
				setSCElementName(SC_ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_ELEMENT_TYPE:
				setSCElementType(SC_ELEMENT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_NO_SINGLE_POINT_OF_FAILURE:
				setSCNoSinglePointOfFailure(SC_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_NO_SINGLE_POINT_OF_FAILURE_DEFAULT:
				setSCNoSinglePointOfFailureDefault(SC_NO_SINGLE_POINT_OF_FAILURE_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PACKAGE_REDUNDANCY_DEFAULT:
				setSCPackageRedundancyDefault(SC_PACKAGE_REDUNDANCY_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PACKAGE_REDUNDANCY_MIN:
				setSCPackageRedundancyMin(SC_PACKAGE_REDUNDANCY_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PACKAGE_REDUNDANCY_MAX:
				setSCPackageRedundancyMax(SC_PACKAGE_REDUNDANCY_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_DATA_REDUNDANCY_DEFAULT:
				setSCDataRedundancyDefault(SC_DATA_REDUNDANCY_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_DATA_REDUNDANCY_MIN:
				setSCDataRedundancyMin(SC_DATA_REDUNDANCY_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_DATA_REDUNDANCY_MAX:
				setSCDataRedundancyMax(SC_DATA_REDUNDANCY_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_EXTENT_STRIPE_LENGTH_DEFAULT:
				setSCExtentStripeLengthDefault(SC_EXTENT_STRIPE_LENGTH_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PARITY_LAYOUT_DEFAULT:
				setSCParityLayoutDefault(SC_PARITY_LAYOUT_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_USER_DATA_STRIPE_DEPTH_DEFAULT:
				setSCUserDataStripeDepthDefault(SC_USER_DATA_STRIPE_DEPTH_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__AFSP_SPACE_CONSUMED:
				setAFSPSpaceConsumed(AFSP_SPACE_CONSUMED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_INSTANCE_ID:
				setSCCInstanceID(SCC_INSTANCE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_ELEMENT_NAME:
				setSCCElementName(SCC_ELEMENT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_POOL_FEATURES:
				getSCCSupportedStoragePoolFeatures().clear();
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_ELEMENT_TYPES:
				getSCCSupportedStorageElementTypes().clear();
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_ELEMENT_FEATURES:
				getSCCSupportedStorageElementFeatures().clear();
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSCCSupportedSynchronousActions().clear();
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSCCSupportedAsynchronousActions().clear();
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_ELEMENT_USAGE:
				getSCCSupportedStorageElementUsage().clear();
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_CLIENT_SETTABLE_ELEMENT_USAGE:
				getSCCClientSettableElementUsage().clear();
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_POOL_USAGE:
				getSCCSupportedStoragePoolUsage().clear();
				return;
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_CLIENT_SETTABLE_POOL_USAGE:
				getSCCClientSettablePoolUsage().clear();
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
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_INSTANCE_ID:
				return SP_INSTANCE_ID_EDEFAULT == null ? spInstanceID != null : !SP_INSTANCE_ID_EDEFAULT.equals(spInstanceID);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_ELEMENT_NAME:
				return SP_ELEMENT_NAME_EDEFAULT == null ? spElementName != null : !SP_ELEMENT_NAME_EDEFAULT.equals(spElementName);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_POOL_ID:
				return SP_POOL_ID_EDEFAULT == null ? spPoolID != null : !SP_POOL_ID_EDEFAULT.equals(spPoolID);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_REMAINING_MANAGED_SPACE:
				return SP_REMAINING_MANAGED_SPACE_EDEFAULT == null ? spRemainingManagedSpace != null : !SP_REMAINING_MANAGED_SPACE_EDEFAULT.equals(spRemainingManagedSpace);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_TOTAL_MANAGED_SPACE:
				return SP_TOTAL_MANAGED_SPACE_EDEFAULT == null ? spTotalManagedSpace != null : !SP_TOTAL_MANAGED_SPACE_EDEFAULT.equals(spTotalManagedSpace);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_PRIMORDIAL:
				return SP_PRIMORDIAL_EDEFAULT == null ? spPrimordial != null : !SP_PRIMORDIAL_EDEFAULT.equals(spPrimordial);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_USAGE:
				return SP_USAGE_EDEFAULT == null ? spUsage != null : !SP_USAGE_EDEFAULT.equals(spUsage);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_OTHER_USAGE_DESCRIPTION:
				return SP_OTHER_USAGE_DESCRIPTION_EDEFAULT == null ? spOtherUsageDescription != null : !SP_OTHER_USAGE_DESCRIPTION_EDEFAULT.equals(spOtherUsageDescription);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SP_CLIENT_SETTABLE_USAGE:
				return spClientSettableUsage != null && !spClientSettableUsage.isEmpty();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_INSTANCE_ID:
				return SC_INSTANCE_ID_EDEFAULT == null ? scInstanceID != null : !SC_INSTANCE_ID_EDEFAULT.equals(scInstanceID);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_ELEMENT_NAME:
				return SC_ELEMENT_NAME_EDEFAULT == null ? scElementName != null : !SC_ELEMENT_NAME_EDEFAULT.equals(scElementName);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_ELEMENT_TYPE:
				return SC_ELEMENT_TYPE_EDEFAULT == null ? scElementType != null : !SC_ELEMENT_TYPE_EDEFAULT.equals(scElementType);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_NO_SINGLE_POINT_OF_FAILURE:
				return SC_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT == null ? scNoSinglePointOfFailure != null : !SC_NO_SINGLE_POINT_OF_FAILURE_EDEFAULT.equals(scNoSinglePointOfFailure);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_NO_SINGLE_POINT_OF_FAILURE_DEFAULT:
				return SC_NO_SINGLE_POINT_OF_FAILURE_DEFAULT_EDEFAULT == null ? scNoSinglePointOfFailureDefault != null : !SC_NO_SINGLE_POINT_OF_FAILURE_DEFAULT_EDEFAULT.equals(scNoSinglePointOfFailureDefault);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PACKAGE_REDUNDANCY_DEFAULT:
				return SC_PACKAGE_REDUNDANCY_DEFAULT_EDEFAULT == null ? scPackageRedundancyDefault != null : !SC_PACKAGE_REDUNDANCY_DEFAULT_EDEFAULT.equals(scPackageRedundancyDefault);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PACKAGE_REDUNDANCY_MIN:
				return SC_PACKAGE_REDUNDANCY_MIN_EDEFAULT == null ? scPackageRedundancyMin != null : !SC_PACKAGE_REDUNDANCY_MIN_EDEFAULT.equals(scPackageRedundancyMin);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PACKAGE_REDUNDANCY_MAX:
				return SC_PACKAGE_REDUNDANCY_MAX_EDEFAULT == null ? scPackageRedundancyMax != null : !SC_PACKAGE_REDUNDANCY_MAX_EDEFAULT.equals(scPackageRedundancyMax);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_DATA_REDUNDANCY_DEFAULT:
				return SC_DATA_REDUNDANCY_DEFAULT_EDEFAULT == null ? scDataRedundancyDefault != null : !SC_DATA_REDUNDANCY_DEFAULT_EDEFAULT.equals(scDataRedundancyDefault);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_DATA_REDUNDANCY_MIN:
				return SC_DATA_REDUNDANCY_MIN_EDEFAULT == null ? scDataRedundancyMin != null : !SC_DATA_REDUNDANCY_MIN_EDEFAULT.equals(scDataRedundancyMin);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_DATA_REDUNDANCY_MAX:
				return SC_DATA_REDUNDANCY_MAX_EDEFAULT == null ? scDataRedundancyMax != null : !SC_DATA_REDUNDANCY_MAX_EDEFAULT.equals(scDataRedundancyMax);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_EXTENT_STRIPE_LENGTH_DEFAULT:
				return SC_EXTENT_STRIPE_LENGTH_DEFAULT_EDEFAULT == null ? scExtentStripeLengthDefault != null : !SC_EXTENT_STRIPE_LENGTH_DEFAULT_EDEFAULT.equals(scExtentStripeLengthDefault);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_PARITY_LAYOUT_DEFAULT:
				return SC_PARITY_LAYOUT_DEFAULT_EDEFAULT == null ? scParityLayoutDefault != null : !SC_PARITY_LAYOUT_DEFAULT_EDEFAULT.equals(scParityLayoutDefault);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SC_USER_DATA_STRIPE_DEPTH_DEFAULT:
				return SC_USER_DATA_STRIPE_DEPTH_DEFAULT_EDEFAULT == null ? scUserDataStripeDepthDefault != null : !SC_USER_DATA_STRIPE_DEPTH_DEFAULT_EDEFAULT.equals(scUserDataStripeDepthDefault);
			case CimPackage.CIM_STORAGE_POOL_VIEW__AFSP_SPACE_CONSUMED:
				return AFSP_SPACE_CONSUMED_EDEFAULT == null ? afspSpaceConsumed != null : !AFSP_SPACE_CONSUMED_EDEFAULT.equals(afspSpaceConsumed);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_INSTANCE_ID:
				return SCC_INSTANCE_ID_EDEFAULT == null ? sccInstanceID != null : !SCC_INSTANCE_ID_EDEFAULT.equals(sccInstanceID);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_ELEMENT_NAME:
				return SCC_ELEMENT_NAME_EDEFAULT == null ? sccElementName != null : !SCC_ELEMENT_NAME_EDEFAULT.equals(sccElementName);
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_POOL_FEATURES:
				return sccSupportedStoragePoolFeatures != null && !sccSupportedStoragePoolFeatures.isEmpty();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_ELEMENT_TYPES:
				return sccSupportedStorageElementTypes != null && !sccSupportedStorageElementTypes.isEmpty();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_ELEMENT_FEATURES:
				return sccSupportedStorageElementFeatures != null && !sccSupportedStorageElementFeatures.isEmpty();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_SYNCHRONOUS_ACTIONS:
				return sccSupportedSynchronousActions != null && !sccSupportedSynchronousActions.isEmpty();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return sccSupportedAsynchronousActions != null && !sccSupportedAsynchronousActions.isEmpty();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_ELEMENT_USAGE:
				return sccSupportedStorageElementUsage != null && !sccSupportedStorageElementUsage.isEmpty();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_CLIENT_SETTABLE_ELEMENT_USAGE:
				return sccClientSettableElementUsage != null && !sccClientSettableElementUsage.isEmpty();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_SUPPORTED_STORAGE_POOL_USAGE:
				return sccSupportedStoragePoolUsage != null && !sccSupportedStoragePoolUsage.isEmpty();
			case CimPackage.CIM_STORAGE_POOL_VIEW__SCC_CLIENT_SETTABLE_POOL_USAGE:
				return sccClientSettablePoolUsage != null && !sccClientSettablePoolUsage.isEmpty();
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
		result.append(" (SPInstanceID: ");
		result.append(spInstanceID);
		result.append(", SPElementName: ");
		result.append(spElementName);
		result.append(", SPPoolID: ");
		result.append(spPoolID);
		result.append(", SPRemainingManagedSpace: ");
		result.append(spRemainingManagedSpace);
		result.append(", SPTotalManagedSpace: ");
		result.append(spTotalManagedSpace);
		result.append(", SPPrimordial: ");
		result.append(spPrimordial);
		result.append(", SPUsage: ");
		result.append(spUsage);
		result.append(", SPOtherUsageDescription: ");
		result.append(spOtherUsageDescription);
		result.append(", SPClientSettableUsage: ");
		result.append(spClientSettableUsage);
		result.append(", SCInstanceID: ");
		result.append(scInstanceID);
		result.append(", SCElementName: ");
		result.append(scElementName);
		result.append(", SCElementType: ");
		result.append(scElementType);
		result.append(", SCNoSinglePointOfFailure: ");
		result.append(scNoSinglePointOfFailure);
		result.append(", SCNoSinglePointOfFailureDefault: ");
		result.append(scNoSinglePointOfFailureDefault);
		result.append(", SCPackageRedundancyDefault: ");
		result.append(scPackageRedundancyDefault);
		result.append(", SCPackageRedundancyMin: ");
		result.append(scPackageRedundancyMin);
		result.append(", SCPackageRedundancyMax: ");
		result.append(scPackageRedundancyMax);
		result.append(", SCDataRedundancyDefault: ");
		result.append(scDataRedundancyDefault);
		result.append(", SCDataRedundancyMin: ");
		result.append(scDataRedundancyMin);
		result.append(", SCDataRedundancyMax: ");
		result.append(scDataRedundancyMax);
		result.append(", SCExtentStripeLengthDefault: ");
		result.append(scExtentStripeLengthDefault);
		result.append(", SCParityLayoutDefault: ");
		result.append(scParityLayoutDefault);
		result.append(", SCUserDataStripeDepthDefault: ");
		result.append(scUserDataStripeDepthDefault);
		result.append(", AFSPSpaceConsumed: ");
		result.append(afspSpaceConsumed);
		result.append(", SCCInstanceID: ");
		result.append(sccInstanceID);
		result.append(", SCCElementName: ");
		result.append(sccElementName);
		result.append(", SCCSupportedStoragePoolFeatures: ");
		result.append(sccSupportedStoragePoolFeatures);
		result.append(", SCCSupportedStorageElementTypes: ");
		result.append(sccSupportedStorageElementTypes);
		result.append(", SCCSupportedStorageElementFeatures: ");
		result.append(sccSupportedStorageElementFeatures);
		result.append(", SCCSupportedSynchronousActions: ");
		result.append(sccSupportedSynchronousActions);
		result.append(", SCCSupportedAsynchronousActions: ");
		result.append(sccSupportedAsynchronousActions);
		result.append(", SCCSupportedStorageElementUsage: ");
		result.append(sccSupportedStorageElementUsage);
		result.append(", SCCClientSettableElementUsage: ");
		result.append(sccClientSettableElementUsage);
		result.append(", SCCSupportedStoragePoolUsage: ");
		result.append(sccSupportedStoragePoolUsage);
		result.append(", SCCClientSettablePoolUsage: ");
		result.append(sccClientSettablePoolUsage);
		result.append(')');
		return result.toString();
	}

} //CIM_StoragePoolViewImpl

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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.dmtf.cim.CIM_StorageCapabilities;
import org.dmtf.cim.CIM_StorageSetting;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getNoSinglePointOfFailure <em>No Single Point Of Failure</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getNoSinglePointOfFailureDefault <em>No Single Point Of Failure Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getDataRedundancyMax <em>Data Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getDataRedundancyMin <em>Data Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getDataRedundancyDefault <em>Data Redundancy Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getPackageRedundancyMax <em>Package Redundancy Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getPackageRedundancyMin <em>Package Redundancy Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getPackageRedundancyDefault <em>Package Redundancy Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getDeltaReservationMax <em>Delta Reservation Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getDeltaReservationMin <em>Delta Reservation Min</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getDeltaReservationDefault <em>Delta Reservation Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getExtentStripeLengthDefault <em>Extent Stripe Length Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getParityLayoutDefault <em>Parity Layout Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getUserDataStripeDepthDefault <em>User Data Stripe Depth Default</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getAvailableDiskType <em>Available Disk Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getAvailableFormFactorType <em>Available Form Factor Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getAvailableInterconnectSpeed <em>Available Interconnect Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getAvailableInterconnectType <em>Available Interconnect Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getAvailableRPM <em>Available RPM</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getEncryption <em>Encryption</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getSupportedCompressionRates <em>Supported Compression Rates</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageCapabilitiesImpl#getSupportedDataOrganizations <em>Supported Data Organizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_StorageCapabilities {
	/**
	 * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ELEMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected Integer elementType = ELEMENT_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getNoSinglePointOfFailureDefault() <em>No Single Point Of Failure Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoSinglePointOfFailureDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NO_SINGLE_POINT_OF_FAILURE_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNoSinglePointOfFailureDefault() <em>No Single Point Of Failure Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoSinglePointOfFailureDefault()
	 * @generated
	 * @ordered
	 */
	protected Boolean noSinglePointOfFailureDefault = NO_SINGLE_POINT_OF_FAILURE_DEFAULT_EDEFAULT;

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
	 * The default value of the '{@link #getDataRedundancyDefault() <em>Data Redundancy Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRedundancyDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_REDUNDANCY_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataRedundancyDefault() <em>Data Redundancy Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRedundancyDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer dataRedundancyDefault = DATA_REDUNDANCY_DEFAULT_EDEFAULT;

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
	 * The default value of the '{@link #getPackageRedundancyDefault() <em>Package Redundancy Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageRedundancyDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PACKAGE_REDUNDANCY_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageRedundancyDefault() <em>Package Redundancy Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageRedundancyDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer packageRedundancyDefault = PACKAGE_REDUNDANCY_DEFAULT_EDEFAULT;

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
	 * The default value of the '{@link #getDeltaReservationDefault() <em>Delta Reservation Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaReservationDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DELTA_RESERVATION_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaReservationDefault() <em>Delta Reservation Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaReservationDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer deltaReservationDefault = DELTA_RESERVATION_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtentStripeLengthDefault() <em>Extent Stripe Length Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentStripeLengthDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EXTENT_STRIPE_LENGTH_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtentStripeLengthDefault() <em>Extent Stripe Length Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtentStripeLengthDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer extentStripeLengthDefault = EXTENT_STRIPE_LENGTH_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getParityLayoutDefault() <em>Parity Layout Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParityLayoutDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PARITY_LAYOUT_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParityLayoutDefault() <em>Parity Layout Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParityLayoutDefault()
	 * @generated
	 * @ordered
	 */
	protected Integer parityLayoutDefault = PARITY_LAYOUT_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDataStripeDepthDefault() <em>User Data Stripe Depth Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataStripeDepthDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Long USER_DATA_STRIPE_DEPTH_DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDataStripeDepthDefault() <em>User Data Stripe Depth Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataStripeDepthDefault()
	 * @generated
	 * @ordered
	 */
	protected Long userDataStripeDepthDefault = USER_DATA_STRIPE_DEPTH_DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAvailableDiskType() <em>Available Disk Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableDiskType()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> availableDiskType;

	/**
	 * The cached value of the '{@link #getAvailableFormFactorType() <em>Available Form Factor Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableFormFactorType()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> availableFormFactorType;

	/**
	 * The cached value of the '{@link #getAvailableInterconnectSpeed() <em>Available Interconnect Speed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableInterconnectSpeed()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> availableInterconnectSpeed;

	/**
	 * The cached value of the '{@link #getAvailableInterconnectType() <em>Available Interconnect Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableInterconnectType()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> availableInterconnectType;

	/**
	 * The cached value of the '{@link #getAvailableRPM() <em>Available RPM</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableRPM()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> availableRPM;

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
	 * The cached value of the '{@link #getSupportedCompressionRates() <em>Supported Compression Rates</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedCompressionRates()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedCompressionRates;

	/**
	 * The cached value of the '{@link #getSupportedDataOrganizations() <em>Supported Data Organizations</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedDataOrganizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedDataOrganizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementType(Integer newElementType) {
		Integer oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__ELEMENT_TYPE, oldElementType, elementType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__NO_SINGLE_POINT_OF_FAILURE, oldNoSinglePointOfFailure, noSinglePointOfFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNoSinglePointOfFailureDefault() {
		return noSinglePointOfFailureDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoSinglePointOfFailureDefault(Boolean newNoSinglePointOfFailureDefault) {
		Boolean oldNoSinglePointOfFailureDefault = noSinglePointOfFailureDefault;
		noSinglePointOfFailureDefault = newNoSinglePointOfFailureDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__NO_SINGLE_POINT_OF_FAILURE_DEFAULT, oldNoSinglePointOfFailureDefault, noSinglePointOfFailureDefault));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__DATA_REDUNDANCY_MAX, oldDataRedundancyMax, dataRedundancyMax));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__DATA_REDUNDANCY_MIN, oldDataRedundancyMin, dataRedundancyMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDataRedundancyDefault() {
		return dataRedundancyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataRedundancyDefault(Integer newDataRedundancyDefault) {
		Integer oldDataRedundancyDefault = dataRedundancyDefault;
		dataRedundancyDefault = newDataRedundancyDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__DATA_REDUNDANCY_DEFAULT, oldDataRedundancyDefault, dataRedundancyDefault));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__PACKAGE_REDUNDANCY_MAX, oldPackageRedundancyMax, packageRedundancyMax));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__PACKAGE_REDUNDANCY_MIN, oldPackageRedundancyMin, packageRedundancyMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPackageRedundancyDefault() {
		return packageRedundancyDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageRedundancyDefault(Integer newPackageRedundancyDefault) {
		Integer oldPackageRedundancyDefault = packageRedundancyDefault;
		packageRedundancyDefault = newPackageRedundancyDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__PACKAGE_REDUNDANCY_DEFAULT, oldPackageRedundancyDefault, packageRedundancyDefault));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__DELTA_RESERVATION_MAX, oldDeltaReservationMax, deltaReservationMax));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__DELTA_RESERVATION_MIN, oldDeltaReservationMin, deltaReservationMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeltaReservationDefault() {
		return deltaReservationDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeltaReservationDefault(Integer newDeltaReservationDefault) {
		Integer oldDeltaReservationDefault = deltaReservationDefault;
		deltaReservationDefault = newDeltaReservationDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__DELTA_RESERVATION_DEFAULT, oldDeltaReservationDefault, deltaReservationDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getExtentStripeLengthDefault() {
		return extentStripeLengthDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtentStripeLengthDefault(Integer newExtentStripeLengthDefault) {
		Integer oldExtentStripeLengthDefault = extentStripeLengthDefault;
		extentStripeLengthDefault = newExtentStripeLengthDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__EXTENT_STRIPE_LENGTH_DEFAULT, oldExtentStripeLengthDefault, extentStripeLengthDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getParityLayoutDefault() {
		return parityLayoutDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParityLayoutDefault(Integer newParityLayoutDefault) {
		Integer oldParityLayoutDefault = parityLayoutDefault;
		parityLayoutDefault = newParityLayoutDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__PARITY_LAYOUT_DEFAULT, oldParityLayoutDefault, parityLayoutDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getUserDataStripeDepthDefault() {
		return userDataStripeDepthDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserDataStripeDepthDefault(Long newUserDataStripeDepthDefault) {
		Long oldUserDataStripeDepthDefault = userDataStripeDepthDefault;
		userDataStripeDepthDefault = newUserDataStripeDepthDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__USER_DATA_STRIPE_DEPTH_DEFAULT, oldUserDataStripeDepthDefault, userDataStripeDepthDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAvailableDiskType() {
		if (availableDiskType == null) {
			availableDiskType = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_DISK_TYPE);
		}
		return availableDiskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAvailableFormFactorType() {
		if (availableFormFactorType == null) {
			availableFormFactorType = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_FORM_FACTOR_TYPE);
		}
		return availableFormFactorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getAvailableInterconnectSpeed() {
		if (availableInterconnectSpeed == null) {
			availableInterconnectSpeed = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_INTERCONNECT_SPEED);
		}
		return availableInterconnectSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getAvailableInterconnectType() {
		if (availableInterconnectType == null) {
			availableInterconnectType = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_INTERCONNECT_TYPE);
		}
		return availableInterconnectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getAvailableRPM() {
		if (availableRPM == null) {
			availableRPM = new EDataTypeEList<Long>(Long.class, this, CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_RPM);
		}
		return availableRPM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CAPABILITIES__ENCRYPTION, oldEncryption, encryption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedCompressionRates() {
		if (supportedCompressionRates == null) {
			supportedCompressionRates = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CAPABILITIES__SUPPORTED_COMPRESSION_RATES);
		}
		return supportedCompressionRates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedDataOrganizations() {
		if (supportedDataOrganizations == null) {
			supportedDataOrganizations = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CAPABILITIES__SUPPORTED_DATA_ORGANIZATIONS);
		}
		return supportedDataOrganizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long CreateSetting(Integer SettingType, CIM_StorageSetting NewSetting) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetSupportedParityLayouts(EList<Integer> ParityLayout) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetSupportedStripeDepthRange(Long MinimumStripeDepth, Long MaximumStripeDepth, Long StripeDepthDivisor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetSupportedStripeDepths(EList<Long> StripeDepths) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetSupportedStripeLengthRange(Integer MinimumStripeLength, Integer MaximumStripeLength, Long StripeLengthDivisor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetSupportedStripeLengths(EList<Integer> StripeLengths) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_STORAGE_CAPABILITIES__ELEMENT_TYPE:
				return getElementType();
			case CimPackage.CIM_STORAGE_CAPABILITIES__NO_SINGLE_POINT_OF_FAILURE:
				return getNoSinglePointOfFailure();
			case CimPackage.CIM_STORAGE_CAPABILITIES__NO_SINGLE_POINT_OF_FAILURE_DEFAULT:
				return getNoSinglePointOfFailureDefault();
			case CimPackage.CIM_STORAGE_CAPABILITIES__DATA_REDUNDANCY_MAX:
				return getDataRedundancyMax();
			case CimPackage.CIM_STORAGE_CAPABILITIES__DATA_REDUNDANCY_MIN:
				return getDataRedundancyMin();
			case CimPackage.CIM_STORAGE_CAPABILITIES__DATA_REDUNDANCY_DEFAULT:
				return getDataRedundancyDefault();
			case CimPackage.CIM_STORAGE_CAPABILITIES__PACKAGE_REDUNDANCY_MAX:
				return getPackageRedundancyMax();
			case CimPackage.CIM_STORAGE_CAPABILITIES__PACKAGE_REDUNDANCY_MIN:
				return getPackageRedundancyMin();
			case CimPackage.CIM_STORAGE_CAPABILITIES__PACKAGE_REDUNDANCY_DEFAULT:
				return getPackageRedundancyDefault();
			case CimPackage.CIM_STORAGE_CAPABILITIES__DELTA_RESERVATION_MAX:
				return getDeltaReservationMax();
			case CimPackage.CIM_STORAGE_CAPABILITIES__DELTA_RESERVATION_MIN:
				return getDeltaReservationMin();
			case CimPackage.CIM_STORAGE_CAPABILITIES__DELTA_RESERVATION_DEFAULT:
				return getDeltaReservationDefault();
			case CimPackage.CIM_STORAGE_CAPABILITIES__EXTENT_STRIPE_LENGTH_DEFAULT:
				return getExtentStripeLengthDefault();
			case CimPackage.CIM_STORAGE_CAPABILITIES__PARITY_LAYOUT_DEFAULT:
				return getParityLayoutDefault();
			case CimPackage.CIM_STORAGE_CAPABILITIES__USER_DATA_STRIPE_DEPTH_DEFAULT:
				return getUserDataStripeDepthDefault();
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_DISK_TYPE:
				return getAvailableDiskType();
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_FORM_FACTOR_TYPE:
				return getAvailableFormFactorType();
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_INTERCONNECT_SPEED:
				return getAvailableInterconnectSpeed();
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_INTERCONNECT_TYPE:
				return getAvailableInterconnectType();
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_RPM:
				return getAvailableRPM();
			case CimPackage.CIM_STORAGE_CAPABILITIES__ENCRYPTION:
				return getEncryption();
			case CimPackage.CIM_STORAGE_CAPABILITIES__SUPPORTED_COMPRESSION_RATES:
				return getSupportedCompressionRates();
			case CimPackage.CIM_STORAGE_CAPABILITIES__SUPPORTED_DATA_ORGANIZATIONS:
				return getSupportedDataOrganizations();
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
			case CimPackage.CIM_STORAGE_CAPABILITIES__ELEMENT_TYPE:
				setElementType((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__NO_SINGLE_POINT_OF_FAILURE:
				setNoSinglePointOfFailure((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__NO_SINGLE_POINT_OF_FAILURE_DEFAULT:
				setNoSinglePointOfFailureDefault((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__DATA_REDUNDANCY_MAX:
				setDataRedundancyMax((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__DATA_REDUNDANCY_MIN:
				setDataRedundancyMin((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__DATA_REDUNDANCY_DEFAULT:
				setDataRedundancyDefault((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__PACKAGE_REDUNDANCY_MAX:
				setPackageRedundancyMax((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__PACKAGE_REDUNDANCY_MIN:
				setPackageRedundancyMin((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__PACKAGE_REDUNDANCY_DEFAULT:
				setPackageRedundancyDefault((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__DELTA_RESERVATION_MAX:
				setDeltaReservationMax((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__DELTA_RESERVATION_MIN:
				setDeltaReservationMin((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__DELTA_RESERVATION_DEFAULT:
				setDeltaReservationDefault((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__EXTENT_STRIPE_LENGTH_DEFAULT:
				setExtentStripeLengthDefault((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__PARITY_LAYOUT_DEFAULT:
				setParityLayoutDefault((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__USER_DATA_STRIPE_DEPTH_DEFAULT:
				setUserDataStripeDepthDefault((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_DISK_TYPE:
				getAvailableDiskType().clear();
				getAvailableDiskType().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_FORM_FACTOR_TYPE:
				getAvailableFormFactorType().clear();
				getAvailableFormFactorType().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_INTERCONNECT_SPEED:
				getAvailableInterconnectSpeed().clear();
				getAvailableInterconnectSpeed().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_INTERCONNECT_TYPE:
				getAvailableInterconnectType().clear();
				getAvailableInterconnectType().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_RPM:
				getAvailableRPM().clear();
				getAvailableRPM().addAll((Collection<? extends Long>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__ENCRYPTION:
				setEncryption((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__SUPPORTED_COMPRESSION_RATES:
				getSupportedCompressionRates().clear();
				getSupportedCompressionRates().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__SUPPORTED_DATA_ORGANIZATIONS:
				getSupportedDataOrganizations().clear();
				getSupportedDataOrganizations().addAll((Collection<? extends Integer>)newValue);
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
			case CimPackage.CIM_STORAGE_CAPABILITIES__ELEMENT_TYPE:
				setElementType(ELEMENT_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__NO_SINGLE_POINT_OF_FAILURE:
				setNoSinglePointOfFailure(NO_SINGLE_POINT_OF_FAILURE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__NO_SINGLE_POINT_OF_FAILURE_DEFAULT:
				setNoSinglePointOfFailureDefault(NO_SINGLE_POINT_OF_FAILURE_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__DATA_REDUNDANCY_MAX:
				setDataRedundancyMax(DATA_REDUNDANCY_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__DATA_REDUNDANCY_MIN:
				setDataRedundancyMin(DATA_REDUNDANCY_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__DATA_REDUNDANCY_DEFAULT:
				setDataRedundancyDefault(DATA_REDUNDANCY_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__PACKAGE_REDUNDANCY_MAX:
				setPackageRedundancyMax(PACKAGE_REDUNDANCY_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__PACKAGE_REDUNDANCY_MIN:
				setPackageRedundancyMin(PACKAGE_REDUNDANCY_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__PACKAGE_REDUNDANCY_DEFAULT:
				setPackageRedundancyDefault(PACKAGE_REDUNDANCY_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__DELTA_RESERVATION_MAX:
				setDeltaReservationMax(DELTA_RESERVATION_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__DELTA_RESERVATION_MIN:
				setDeltaReservationMin(DELTA_RESERVATION_MIN_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__DELTA_RESERVATION_DEFAULT:
				setDeltaReservationDefault(DELTA_RESERVATION_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__EXTENT_STRIPE_LENGTH_DEFAULT:
				setExtentStripeLengthDefault(EXTENT_STRIPE_LENGTH_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__PARITY_LAYOUT_DEFAULT:
				setParityLayoutDefault(PARITY_LAYOUT_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__USER_DATA_STRIPE_DEPTH_DEFAULT:
				setUserDataStripeDepthDefault(USER_DATA_STRIPE_DEPTH_DEFAULT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_DISK_TYPE:
				getAvailableDiskType().clear();
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_FORM_FACTOR_TYPE:
				getAvailableFormFactorType().clear();
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_INTERCONNECT_SPEED:
				getAvailableInterconnectSpeed().clear();
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_INTERCONNECT_TYPE:
				getAvailableInterconnectType().clear();
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_RPM:
				getAvailableRPM().clear();
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__ENCRYPTION:
				setEncryption(ENCRYPTION_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__SUPPORTED_COMPRESSION_RATES:
				getSupportedCompressionRates().clear();
				return;
			case CimPackage.CIM_STORAGE_CAPABILITIES__SUPPORTED_DATA_ORGANIZATIONS:
				getSupportedDataOrganizations().clear();
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
			case CimPackage.CIM_STORAGE_CAPABILITIES__ELEMENT_TYPE:
				return ELEMENT_TYPE_EDEFAULT == null ? elementType != null : !ELEMENT_TYPE_EDEFAULT.equals(elementType);
			case CimPackage.CIM_STORAGE_CAPABILITIES__NO_SINGLE_POINT_OF_FAILURE:
				return NO_SINGLE_POINT_OF_FAILURE_EDEFAULT == null ? noSinglePointOfFailure != null : !NO_SINGLE_POINT_OF_FAILURE_EDEFAULT.equals(noSinglePointOfFailure);
			case CimPackage.CIM_STORAGE_CAPABILITIES__NO_SINGLE_POINT_OF_FAILURE_DEFAULT:
				return NO_SINGLE_POINT_OF_FAILURE_DEFAULT_EDEFAULT == null ? noSinglePointOfFailureDefault != null : !NO_SINGLE_POINT_OF_FAILURE_DEFAULT_EDEFAULT.equals(noSinglePointOfFailureDefault);
			case CimPackage.CIM_STORAGE_CAPABILITIES__DATA_REDUNDANCY_MAX:
				return DATA_REDUNDANCY_MAX_EDEFAULT == null ? dataRedundancyMax != null : !DATA_REDUNDANCY_MAX_EDEFAULT.equals(dataRedundancyMax);
			case CimPackage.CIM_STORAGE_CAPABILITIES__DATA_REDUNDANCY_MIN:
				return DATA_REDUNDANCY_MIN_EDEFAULT == null ? dataRedundancyMin != null : !DATA_REDUNDANCY_MIN_EDEFAULT.equals(dataRedundancyMin);
			case CimPackage.CIM_STORAGE_CAPABILITIES__DATA_REDUNDANCY_DEFAULT:
				return DATA_REDUNDANCY_DEFAULT_EDEFAULT == null ? dataRedundancyDefault != null : !DATA_REDUNDANCY_DEFAULT_EDEFAULT.equals(dataRedundancyDefault);
			case CimPackage.CIM_STORAGE_CAPABILITIES__PACKAGE_REDUNDANCY_MAX:
				return PACKAGE_REDUNDANCY_MAX_EDEFAULT == null ? packageRedundancyMax != null : !PACKAGE_REDUNDANCY_MAX_EDEFAULT.equals(packageRedundancyMax);
			case CimPackage.CIM_STORAGE_CAPABILITIES__PACKAGE_REDUNDANCY_MIN:
				return PACKAGE_REDUNDANCY_MIN_EDEFAULT == null ? packageRedundancyMin != null : !PACKAGE_REDUNDANCY_MIN_EDEFAULT.equals(packageRedundancyMin);
			case CimPackage.CIM_STORAGE_CAPABILITIES__PACKAGE_REDUNDANCY_DEFAULT:
				return PACKAGE_REDUNDANCY_DEFAULT_EDEFAULT == null ? packageRedundancyDefault != null : !PACKAGE_REDUNDANCY_DEFAULT_EDEFAULT.equals(packageRedundancyDefault);
			case CimPackage.CIM_STORAGE_CAPABILITIES__DELTA_RESERVATION_MAX:
				return DELTA_RESERVATION_MAX_EDEFAULT == null ? deltaReservationMax != null : !DELTA_RESERVATION_MAX_EDEFAULT.equals(deltaReservationMax);
			case CimPackage.CIM_STORAGE_CAPABILITIES__DELTA_RESERVATION_MIN:
				return DELTA_RESERVATION_MIN_EDEFAULT == null ? deltaReservationMin != null : !DELTA_RESERVATION_MIN_EDEFAULT.equals(deltaReservationMin);
			case CimPackage.CIM_STORAGE_CAPABILITIES__DELTA_RESERVATION_DEFAULT:
				return DELTA_RESERVATION_DEFAULT_EDEFAULT == null ? deltaReservationDefault != null : !DELTA_RESERVATION_DEFAULT_EDEFAULT.equals(deltaReservationDefault);
			case CimPackage.CIM_STORAGE_CAPABILITIES__EXTENT_STRIPE_LENGTH_DEFAULT:
				return EXTENT_STRIPE_LENGTH_DEFAULT_EDEFAULT == null ? extentStripeLengthDefault != null : !EXTENT_STRIPE_LENGTH_DEFAULT_EDEFAULT.equals(extentStripeLengthDefault);
			case CimPackage.CIM_STORAGE_CAPABILITIES__PARITY_LAYOUT_DEFAULT:
				return PARITY_LAYOUT_DEFAULT_EDEFAULT == null ? parityLayoutDefault != null : !PARITY_LAYOUT_DEFAULT_EDEFAULT.equals(parityLayoutDefault);
			case CimPackage.CIM_STORAGE_CAPABILITIES__USER_DATA_STRIPE_DEPTH_DEFAULT:
				return USER_DATA_STRIPE_DEPTH_DEFAULT_EDEFAULT == null ? userDataStripeDepthDefault != null : !USER_DATA_STRIPE_DEPTH_DEFAULT_EDEFAULT.equals(userDataStripeDepthDefault);
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_DISK_TYPE:
				return availableDiskType != null && !availableDiskType.isEmpty();
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_FORM_FACTOR_TYPE:
				return availableFormFactorType != null && !availableFormFactorType.isEmpty();
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_INTERCONNECT_SPEED:
				return availableInterconnectSpeed != null && !availableInterconnectSpeed.isEmpty();
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_INTERCONNECT_TYPE:
				return availableInterconnectType != null && !availableInterconnectType.isEmpty();
			case CimPackage.CIM_STORAGE_CAPABILITIES__AVAILABLE_RPM:
				return availableRPM != null && !availableRPM.isEmpty();
			case CimPackage.CIM_STORAGE_CAPABILITIES__ENCRYPTION:
				return ENCRYPTION_EDEFAULT == null ? encryption != null : !ENCRYPTION_EDEFAULT.equals(encryption);
			case CimPackage.CIM_STORAGE_CAPABILITIES__SUPPORTED_COMPRESSION_RATES:
				return supportedCompressionRates != null && !supportedCompressionRates.isEmpty();
			case CimPackage.CIM_STORAGE_CAPABILITIES__SUPPORTED_DATA_ORGANIZATIONS:
				return supportedDataOrganizations != null && !supportedDataOrganizations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CimPackage.CIM_STORAGE_CAPABILITIES___CREATE_SETTING__INTEGER_CIM_STORAGESETTING:
				return CreateSetting((Integer)arguments.get(0), (CIM_StorageSetting)arguments.get(1));
			case CimPackage.CIM_STORAGE_CAPABILITIES___GET_SUPPORTED_PARITY_LAYOUTS__ELIST:
				return GetSupportedParityLayouts((EList<Integer>)arguments.get(0));
			case CimPackage.CIM_STORAGE_CAPABILITIES___GET_SUPPORTED_STRIPE_DEPTH_RANGE__LONG_LONG_LONG:
				return GetSupportedStripeDepthRange((Long)arguments.get(0), (Long)arguments.get(1), (Long)arguments.get(2));
			case CimPackage.CIM_STORAGE_CAPABILITIES___GET_SUPPORTED_STRIPE_DEPTHS__ELIST:
				return GetSupportedStripeDepths((EList<Long>)arguments.get(0));
			case CimPackage.CIM_STORAGE_CAPABILITIES___GET_SUPPORTED_STRIPE_LENGTH_RANGE__INTEGER_INTEGER_LONG:
				return GetSupportedStripeLengthRange((Integer)arguments.get(0), (Integer)arguments.get(1), (Long)arguments.get(2));
			case CimPackage.CIM_STORAGE_CAPABILITIES___GET_SUPPORTED_STRIPE_LENGTHS__ELIST:
				return GetSupportedStripeLengths((EList<Integer>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (ElementType: ");
		result.append(elementType);
		result.append(", NoSinglePointOfFailure: ");
		result.append(noSinglePointOfFailure);
		result.append(", NoSinglePointOfFailureDefault: ");
		result.append(noSinglePointOfFailureDefault);
		result.append(", DataRedundancyMax: ");
		result.append(dataRedundancyMax);
		result.append(", DataRedundancyMin: ");
		result.append(dataRedundancyMin);
		result.append(", DataRedundancyDefault: ");
		result.append(dataRedundancyDefault);
		result.append(", PackageRedundancyMax: ");
		result.append(packageRedundancyMax);
		result.append(", PackageRedundancyMin: ");
		result.append(packageRedundancyMin);
		result.append(", PackageRedundancyDefault: ");
		result.append(packageRedundancyDefault);
		result.append(", DeltaReservationMax: ");
		result.append(deltaReservationMax);
		result.append(", DeltaReservationMin: ");
		result.append(deltaReservationMin);
		result.append(", DeltaReservationDefault: ");
		result.append(deltaReservationDefault);
		result.append(", ExtentStripeLengthDefault: ");
		result.append(extentStripeLengthDefault);
		result.append(", ParityLayoutDefault: ");
		result.append(parityLayoutDefault);
		result.append(", UserDataStripeDepthDefault: ");
		result.append(userDataStripeDepthDefault);
		result.append(", AvailableDiskType: ");
		result.append(availableDiskType);
		result.append(", AvailableFormFactorType: ");
		result.append(availableFormFactorType);
		result.append(", AvailableInterconnectSpeed: ");
		result.append(availableInterconnectSpeed);
		result.append(", AvailableInterconnectType: ");
		result.append(availableInterconnectType);
		result.append(", AvailableRPM: ");
		result.append(availableRPM);
		result.append(", Encryption: ");
		result.append(encryption);
		result.append(", SupportedCompressionRates: ");
		result.append(supportedCompressionRates);
		result.append(", SupportedDataOrganizations: ");
		result.append(supportedDataOrganizations);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageCapabilitiesImpl

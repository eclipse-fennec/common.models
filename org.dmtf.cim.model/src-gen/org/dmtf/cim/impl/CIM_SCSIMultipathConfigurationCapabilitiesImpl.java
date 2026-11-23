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

import org.dmtf.cim.CIM_SCSIMultipathConfigurationCapabilities;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM SCSI Multipath Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathConfigurationCapabilitiesImpl#getSupportedLoadBalanceTypes <em>Supported Load Balance Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathConfigurationCapabilitiesImpl#getOtherSupportedLoadBalanceAlgorithmNames <em>Other Supported Load Balance Algorithm Names</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathConfigurationCapabilitiesImpl#getOtherSupportedLoadBalanceVendorNames <em>Other Supported Load Balance Vendor Names</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathConfigurationCapabilitiesImpl#getCanSetTPGAccess <em>Can Set TPG Access</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathConfigurationCapabilitiesImpl#getCanOverridePaths <em>Can Override Paths</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathConfigurationCapabilitiesImpl#getExposesPathDeviceFiles <em>Exposes Path Device Files</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathConfigurationCapabilitiesImpl#getDeviceNameFilespace <em>Device Name Filespace</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathConfigurationCapabilitiesImpl#getOnlySupportsSpecifiedProducts <em>Only Supports Specified Products</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathConfigurationCapabilitiesImpl#getMaximumWeight <em>Maximum Weight</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathConfigurationCapabilitiesImpl#getAutofailbackSupport <em>Autofailback Support</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathConfigurationCapabilitiesImpl#getAutoFailbackEnabled <em>Auto Failback Enabled</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathConfigurationCapabilitiesImpl#getPollingRateMax <em>Polling Rate Max</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathConfigurationCapabilitiesImpl#getCurrentPollingRate <em>Current Polling Rate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SCSIMultipathConfigurationCapabilitiesImpl#getDefaultLoadBalanceType <em>Default Load Balance Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_SCSIMultipathConfigurationCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_SCSIMultipathConfigurationCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedLoadBalanceTypes() <em>Supported Load Balance Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedLoadBalanceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedLoadBalanceTypes;

	/**
	 * The cached value of the '{@link #getOtherSupportedLoadBalanceAlgorithmNames() <em>Other Supported Load Balance Algorithm Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedLoadBalanceAlgorithmNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedLoadBalanceAlgorithmNames;

	/**
	 * The cached value of the '{@link #getOtherSupportedLoadBalanceVendorNames() <em>Other Supported Load Balance Vendor Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherSupportedLoadBalanceVendorNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherSupportedLoadBalanceVendorNames;

	/**
	 * The default value of the '{@link #getCanSetTPGAccess() <em>Can Set TPG Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanSetTPGAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_SET_TPG_ACCESS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getCanSetTPGAccess() <em>Can Set TPG Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanSetTPGAccess()
	 * @generated
	 * @ordered
	 */
	protected Boolean canSetTPGAccess = CAN_SET_TPG_ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCanOverridePaths() <em>Can Override Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanOverridePaths()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_OVERRIDE_PATHS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getCanOverridePaths() <em>Can Override Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanOverridePaths()
	 * @generated
	 * @ordered
	 */
	protected Boolean canOverridePaths = CAN_OVERRIDE_PATHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExposesPathDeviceFiles() <em>Exposes Path Device Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposesPathDeviceFiles()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXPOSES_PATH_DEVICE_FILES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExposesPathDeviceFiles() <em>Exposes Path Device Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposesPathDeviceFiles()
	 * @generated
	 * @ordered
	 */
	protected Boolean exposesPathDeviceFiles = EXPOSES_PATH_DEVICE_FILES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceNameFilespace() <em>Device Name Filespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceNameFilespace()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_NAME_FILESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceNameFilespace() <em>Device Name Filespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceNameFilespace()
	 * @generated
	 * @ordered
	 */
	protected String deviceNameFilespace = DEVICE_NAME_FILESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnlySupportsSpecifiedProducts() <em>Only Supports Specified Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlySupportsSpecifiedProducts()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ONLY_SUPPORTS_SPECIFIED_PRODUCTS_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getOnlySupportsSpecifiedProducts() <em>Only Supports Specified Products</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlySupportsSpecifiedProducts()
	 * @generated
	 * @ordered
	 */
	protected Boolean onlySupportsSpecifiedProducts = ONLY_SUPPORTS_SPECIFIED_PRODUCTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumWeight() <em>Maximum Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAXIMUM_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumWeight() <em>Maximum Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumWeight()
	 * @generated
	 * @ordered
	 */
	protected Long maximumWeight = MAXIMUM_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutofailbackSupport() <em>Autofailback Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutofailbackSupport()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AUTOFAILBACK_SUPPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutofailbackSupport() <em>Autofailback Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutofailbackSupport()
	 * @generated
	 * @ordered
	 */
	protected Integer autofailbackSupport = AUTOFAILBACK_SUPPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoFailbackEnabled() <em>Auto Failback Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoFailbackEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_FAILBACK_ENABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoFailbackEnabled() <em>Auto Failback Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoFailbackEnabled()
	 * @generated
	 * @ordered
	 */
	protected Boolean autoFailbackEnabled = AUTO_FAILBACK_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPollingRateMax() <em>Polling Rate Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingRateMax()
	 * @generated
	 * @ordered
	 */
	protected static final Long POLLING_RATE_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPollingRateMax() <em>Polling Rate Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingRateMax()
	 * @generated
	 * @ordered
	 */
	protected Long pollingRateMax = POLLING_RATE_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentPollingRate() <em>Current Polling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPollingRate()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_POLLING_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentPollingRate() <em>Current Polling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPollingRate()
	 * @generated
	 * @ordered
	 */
	protected Long currentPollingRate = CURRENT_POLLING_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultLoadBalanceType() <em>Default Load Balance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLoadBalanceType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_LOAD_BALANCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultLoadBalanceType() <em>Default Load Balance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLoadBalanceType()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultLoadBalanceType = DEFAULT_LOAD_BALANCE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SCSIMultipathConfigurationCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_SCSIMultipathConfigurationCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedLoadBalanceTypes() {
		if (supportedLoadBalanceTypes == null) {
			supportedLoadBalanceTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__SUPPORTED_LOAD_BALANCE_TYPES);
		}
		return supportedLoadBalanceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedLoadBalanceAlgorithmNames() {
		if (otherSupportedLoadBalanceAlgorithmNames == null) {
			otherSupportedLoadBalanceAlgorithmNames = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__OTHER_SUPPORTED_LOAD_BALANCE_ALGORITHM_NAMES);
		}
		return otherSupportedLoadBalanceAlgorithmNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherSupportedLoadBalanceVendorNames() {
		if (otherSupportedLoadBalanceVendorNames == null) {
			otherSupportedLoadBalanceVendorNames = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__OTHER_SUPPORTED_LOAD_BALANCE_VENDOR_NAMES);
		}
		return otherSupportedLoadBalanceVendorNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanSetTPGAccess() {
		return canSetTPGAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanSetTPGAccess(Boolean newCanSetTPGAccess) {
		Boolean oldCanSetTPGAccess = canSetTPGAccess;
		canSetTPGAccess = newCanSetTPGAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__CAN_SET_TPG_ACCESS, oldCanSetTPGAccess, canSetTPGAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanOverridePaths() {
		return canOverridePaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanOverridePaths(Boolean newCanOverridePaths) {
		Boolean oldCanOverridePaths = canOverridePaths;
		canOverridePaths = newCanOverridePaths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__CAN_OVERRIDE_PATHS, oldCanOverridePaths, canOverridePaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExposesPathDeviceFiles() {
		return exposesPathDeviceFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExposesPathDeviceFiles(Boolean newExposesPathDeviceFiles) {
		Boolean oldExposesPathDeviceFiles = exposesPathDeviceFiles;
		exposesPathDeviceFiles = newExposesPathDeviceFiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__EXPOSES_PATH_DEVICE_FILES, oldExposesPathDeviceFiles, exposesPathDeviceFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviceNameFilespace() {
		return deviceNameFilespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviceNameFilespace(String newDeviceNameFilespace) {
		String oldDeviceNameFilespace = deviceNameFilespace;
		deviceNameFilespace = newDeviceNameFilespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__DEVICE_NAME_FILESPACE, oldDeviceNameFilespace, deviceNameFilespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnlySupportsSpecifiedProducts() {
		return onlySupportsSpecifiedProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnlySupportsSpecifiedProducts(Boolean newOnlySupportsSpecifiedProducts) {
		Boolean oldOnlySupportsSpecifiedProducts = onlySupportsSpecifiedProducts;
		onlySupportsSpecifiedProducts = newOnlySupportsSpecifiedProducts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__ONLY_SUPPORTS_SPECIFIED_PRODUCTS, oldOnlySupportsSpecifiedProducts, onlySupportsSpecifiedProducts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaximumWeight() {
		return maximumWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumWeight(Long newMaximumWeight) {
		Long oldMaximumWeight = maximumWeight;
		maximumWeight = newMaximumWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__MAXIMUM_WEIGHT, oldMaximumWeight, maximumWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAutofailbackSupport() {
		return autofailbackSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutofailbackSupport(Integer newAutofailbackSupport) {
		Integer oldAutofailbackSupport = autofailbackSupport;
		autofailbackSupport = newAutofailbackSupport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__AUTOFAILBACK_SUPPORT, oldAutofailbackSupport, autofailbackSupport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutoFailbackEnabled() {
		return autoFailbackEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoFailbackEnabled(Boolean newAutoFailbackEnabled) {
		Boolean oldAutoFailbackEnabled = autoFailbackEnabled;
		autoFailbackEnabled = newAutoFailbackEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__AUTO_FAILBACK_ENABLED, oldAutoFailbackEnabled, autoFailbackEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getPollingRateMax() {
		return pollingRateMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPollingRateMax(Long newPollingRateMax) {
		Long oldPollingRateMax = pollingRateMax;
		pollingRateMax = newPollingRateMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__POLLING_RATE_MAX, oldPollingRateMax, pollingRateMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentPollingRate() {
		return currentPollingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentPollingRate(Long newCurrentPollingRate) {
		Long oldCurrentPollingRate = currentPollingRate;
		currentPollingRate = newCurrentPollingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__CURRENT_POLLING_RATE, oldCurrentPollingRate, currentPollingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDefaultLoadBalanceType() {
		return defaultLoadBalanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultLoadBalanceType(Integer newDefaultLoadBalanceType) {
		Integer oldDefaultLoadBalanceType = defaultLoadBalanceType;
		defaultLoadBalanceType = newDefaultLoadBalanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__DEFAULT_LOAD_BALANCE_TYPE, oldDefaultLoadBalanceType, defaultLoadBalanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__SUPPORTED_LOAD_BALANCE_TYPES:
				return getSupportedLoadBalanceTypes();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__OTHER_SUPPORTED_LOAD_BALANCE_ALGORITHM_NAMES:
				return getOtherSupportedLoadBalanceAlgorithmNames();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__OTHER_SUPPORTED_LOAD_BALANCE_VENDOR_NAMES:
				return getOtherSupportedLoadBalanceVendorNames();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__CAN_SET_TPG_ACCESS:
				return getCanSetTPGAccess();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__CAN_OVERRIDE_PATHS:
				return getCanOverridePaths();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__EXPOSES_PATH_DEVICE_FILES:
				return getExposesPathDeviceFiles();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__DEVICE_NAME_FILESPACE:
				return getDeviceNameFilespace();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__ONLY_SUPPORTS_SPECIFIED_PRODUCTS:
				return getOnlySupportsSpecifiedProducts();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__MAXIMUM_WEIGHT:
				return getMaximumWeight();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__AUTOFAILBACK_SUPPORT:
				return getAutofailbackSupport();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__AUTO_FAILBACK_ENABLED:
				return getAutoFailbackEnabled();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__POLLING_RATE_MAX:
				return getPollingRateMax();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__CURRENT_POLLING_RATE:
				return getCurrentPollingRate();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__DEFAULT_LOAD_BALANCE_TYPE:
				return getDefaultLoadBalanceType();
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
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__SUPPORTED_LOAD_BALANCE_TYPES:
				getSupportedLoadBalanceTypes().clear();
				getSupportedLoadBalanceTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__OTHER_SUPPORTED_LOAD_BALANCE_ALGORITHM_NAMES:
				getOtherSupportedLoadBalanceAlgorithmNames().clear();
				getOtherSupportedLoadBalanceAlgorithmNames().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__OTHER_SUPPORTED_LOAD_BALANCE_VENDOR_NAMES:
				getOtherSupportedLoadBalanceVendorNames().clear();
				getOtherSupportedLoadBalanceVendorNames().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__CAN_SET_TPG_ACCESS:
				setCanSetTPGAccess((Boolean)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__CAN_OVERRIDE_PATHS:
				setCanOverridePaths((Boolean)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__EXPOSES_PATH_DEVICE_FILES:
				setExposesPathDeviceFiles((Boolean)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__DEVICE_NAME_FILESPACE:
				setDeviceNameFilespace((String)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__ONLY_SUPPORTS_SPECIFIED_PRODUCTS:
				setOnlySupportsSpecifiedProducts((Boolean)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__MAXIMUM_WEIGHT:
				setMaximumWeight((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__AUTOFAILBACK_SUPPORT:
				setAutofailbackSupport((Integer)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__AUTO_FAILBACK_ENABLED:
				setAutoFailbackEnabled((Boolean)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__POLLING_RATE_MAX:
				setPollingRateMax((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__CURRENT_POLLING_RATE:
				setCurrentPollingRate((Long)newValue);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__DEFAULT_LOAD_BALANCE_TYPE:
				setDefaultLoadBalanceType((Integer)newValue);
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
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__SUPPORTED_LOAD_BALANCE_TYPES:
				getSupportedLoadBalanceTypes().clear();
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__OTHER_SUPPORTED_LOAD_BALANCE_ALGORITHM_NAMES:
				getOtherSupportedLoadBalanceAlgorithmNames().clear();
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__OTHER_SUPPORTED_LOAD_BALANCE_VENDOR_NAMES:
				getOtherSupportedLoadBalanceVendorNames().clear();
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__CAN_SET_TPG_ACCESS:
				setCanSetTPGAccess(CAN_SET_TPG_ACCESS_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__CAN_OVERRIDE_PATHS:
				setCanOverridePaths(CAN_OVERRIDE_PATHS_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__EXPOSES_PATH_DEVICE_FILES:
				setExposesPathDeviceFiles(EXPOSES_PATH_DEVICE_FILES_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__DEVICE_NAME_FILESPACE:
				setDeviceNameFilespace(DEVICE_NAME_FILESPACE_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__ONLY_SUPPORTS_SPECIFIED_PRODUCTS:
				setOnlySupportsSpecifiedProducts(ONLY_SUPPORTS_SPECIFIED_PRODUCTS_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__MAXIMUM_WEIGHT:
				setMaximumWeight(MAXIMUM_WEIGHT_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__AUTOFAILBACK_SUPPORT:
				setAutofailbackSupport(AUTOFAILBACK_SUPPORT_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__AUTO_FAILBACK_ENABLED:
				setAutoFailbackEnabled(AUTO_FAILBACK_ENABLED_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__POLLING_RATE_MAX:
				setPollingRateMax(POLLING_RATE_MAX_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__CURRENT_POLLING_RATE:
				setCurrentPollingRate(CURRENT_POLLING_RATE_EDEFAULT);
				return;
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__DEFAULT_LOAD_BALANCE_TYPE:
				setDefaultLoadBalanceType(DEFAULT_LOAD_BALANCE_TYPE_EDEFAULT);
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
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__SUPPORTED_LOAD_BALANCE_TYPES:
				return supportedLoadBalanceTypes != null && !supportedLoadBalanceTypes.isEmpty();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__OTHER_SUPPORTED_LOAD_BALANCE_ALGORITHM_NAMES:
				return otherSupportedLoadBalanceAlgorithmNames != null && !otherSupportedLoadBalanceAlgorithmNames.isEmpty();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__OTHER_SUPPORTED_LOAD_BALANCE_VENDOR_NAMES:
				return otherSupportedLoadBalanceVendorNames != null && !otherSupportedLoadBalanceVendorNames.isEmpty();
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__CAN_SET_TPG_ACCESS:
				return CAN_SET_TPG_ACCESS_EDEFAULT == null ? canSetTPGAccess != null : !CAN_SET_TPG_ACCESS_EDEFAULT.equals(canSetTPGAccess);
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__CAN_OVERRIDE_PATHS:
				return CAN_OVERRIDE_PATHS_EDEFAULT == null ? canOverridePaths != null : !CAN_OVERRIDE_PATHS_EDEFAULT.equals(canOverridePaths);
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__EXPOSES_PATH_DEVICE_FILES:
				return EXPOSES_PATH_DEVICE_FILES_EDEFAULT == null ? exposesPathDeviceFiles != null : !EXPOSES_PATH_DEVICE_FILES_EDEFAULT.equals(exposesPathDeviceFiles);
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__DEVICE_NAME_FILESPACE:
				return DEVICE_NAME_FILESPACE_EDEFAULT == null ? deviceNameFilespace != null : !DEVICE_NAME_FILESPACE_EDEFAULT.equals(deviceNameFilespace);
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__ONLY_SUPPORTS_SPECIFIED_PRODUCTS:
				return ONLY_SUPPORTS_SPECIFIED_PRODUCTS_EDEFAULT == null ? onlySupportsSpecifiedProducts != null : !ONLY_SUPPORTS_SPECIFIED_PRODUCTS_EDEFAULT.equals(onlySupportsSpecifiedProducts);
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__MAXIMUM_WEIGHT:
				return MAXIMUM_WEIGHT_EDEFAULT == null ? maximumWeight != null : !MAXIMUM_WEIGHT_EDEFAULT.equals(maximumWeight);
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__AUTOFAILBACK_SUPPORT:
				return AUTOFAILBACK_SUPPORT_EDEFAULT == null ? autofailbackSupport != null : !AUTOFAILBACK_SUPPORT_EDEFAULT.equals(autofailbackSupport);
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__AUTO_FAILBACK_ENABLED:
				return AUTO_FAILBACK_ENABLED_EDEFAULT == null ? autoFailbackEnabled != null : !AUTO_FAILBACK_ENABLED_EDEFAULT.equals(autoFailbackEnabled);
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__POLLING_RATE_MAX:
				return POLLING_RATE_MAX_EDEFAULT == null ? pollingRateMax != null : !POLLING_RATE_MAX_EDEFAULT.equals(pollingRateMax);
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__CURRENT_POLLING_RATE:
				return CURRENT_POLLING_RATE_EDEFAULT == null ? currentPollingRate != null : !CURRENT_POLLING_RATE_EDEFAULT.equals(currentPollingRate);
			case CimPackage.CIM_SCSI_MULTIPATH_CONFIGURATION_CAPABILITIES__DEFAULT_LOAD_BALANCE_TYPE:
				return DEFAULT_LOAD_BALANCE_TYPE_EDEFAULT == null ? defaultLoadBalanceType != null : !DEFAULT_LOAD_BALANCE_TYPE_EDEFAULT.equals(defaultLoadBalanceType);
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
		result.append(" (SupportedLoadBalanceTypes: ");
		result.append(supportedLoadBalanceTypes);
		result.append(", OtherSupportedLoadBalanceAlgorithmNames: ");
		result.append(otherSupportedLoadBalanceAlgorithmNames);
		result.append(", OtherSupportedLoadBalanceVendorNames: ");
		result.append(otherSupportedLoadBalanceVendorNames);
		result.append(", CanSetTPGAccess: ");
		result.append(canSetTPGAccess);
		result.append(", CanOverridePaths: ");
		result.append(canOverridePaths);
		result.append(", ExposesPathDeviceFiles: ");
		result.append(exposesPathDeviceFiles);
		result.append(", DeviceNameFilespace: ");
		result.append(deviceNameFilespace);
		result.append(", OnlySupportsSpecifiedProducts: ");
		result.append(onlySupportsSpecifiedProducts);
		result.append(", MaximumWeight: ");
		result.append(maximumWeight);
		result.append(", AutofailbackSupport: ");
		result.append(autofailbackSupport);
		result.append(", AutoFailbackEnabled: ");
		result.append(autoFailbackEnabled);
		result.append(", PollingRateMax: ");
		result.append(pollingRateMax);
		result.append(", CurrentPollingRate: ");
		result.append(currentPollingRate);
		result.append(", DefaultLoadBalanceType: ");
		result.append(defaultLoadBalanceType);
		result.append(')');
		return result.toString();
	}

} //CIM_SCSIMultipathConfigurationCapabilitiesImpl

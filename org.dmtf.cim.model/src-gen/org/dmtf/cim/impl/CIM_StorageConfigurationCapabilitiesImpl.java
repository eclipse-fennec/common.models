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

import org.dmtf.cim.CIM_ManagedElement;
import org.dmtf.cim.CIM_StorageConfigurationCapabilities;
import org.dmtf.cim.CIM_StoragePool;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Storage Configuration Capabilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getSupportedAsynchronousActions <em>Supported Asynchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getSupportedSynchronousActions <em>Supported Synchronous Actions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getSupportedStorageElementTypes <em>Supported Storage Element Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getSupportedStoragePoolFeatures <em>Supported Storage Pool Features</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getSupportedStorageElementFeatures <em>Supported Storage Element Features</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getSupportedCopyTypes <em>Supported Copy Types</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getInitialReplicationState <em>Initial Replication State</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getAutomaticPoolSelectionAllowed <em>Automatic Pool Selection Allowed</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getClientSettableElementUsage <em>Client Settable Element Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getClientSettablePoolUsage <em>Client Settable Pool Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getMaximumElementCreateCount <em>Maximum Element Create Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getMaximumElementDeleteCount <em>Maximum Element Delete Count</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getMultipleElementCreateFeatures <em>Multiple Element Create Features</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getMultipleElementDeleteFeatures <em>Multiple Element Delete Features</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getSupportedStorageElementUsage <em>Supported Storage Element Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getSupportedStoragePoolUsage <em>Supported Storage Pool Usage</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getThinProvisionedClientSettableReserve <em>Thin Provisioned Client Settable Reserve</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_StorageConfigurationCapabilitiesImpl#getThinProvisionedDefaultReserve <em>Thin Provisioned Default Reserve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_StorageConfigurationCapabilitiesImpl extends CIM_CapabilitiesImpl implements CIM_StorageConfigurationCapabilities {
	/**
	 * The cached value of the '{@link #getSupportedAsynchronousActions() <em>Supported Asynchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedAsynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedAsynchronousActions;

	/**
	 * The cached value of the '{@link #getSupportedSynchronousActions() <em>Supported Synchronous Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSynchronousActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedSynchronousActions;

	/**
	 * The cached value of the '{@link #getSupportedStorageElementTypes() <em>Supported Storage Element Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedStorageElementTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedStorageElementTypes;

	/**
	 * The cached value of the '{@link #getSupportedStoragePoolFeatures() <em>Supported Storage Pool Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedStoragePoolFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedStoragePoolFeatures;

	/**
	 * The cached value of the '{@link #getSupportedStorageElementFeatures() <em>Supported Storage Element Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedStorageElementFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedStorageElementFeatures;

	/**
	 * The cached value of the '{@link #getSupportedCopyTypes() <em>Supported Copy Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedCopyTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedCopyTypes;

	/**
	 * The default value of the '{@link #getInitialReplicationState() <em>Initial Replication State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialReplicationState()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INITIAL_REPLICATION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialReplicationState() <em>Initial Replication State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialReplicationState()
	 * @generated
	 * @ordered
	 */
	protected Integer initialReplicationState = INITIAL_REPLICATION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutomaticPoolSelectionAllowed() <em>Automatic Pool Selection Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticPoolSelectionAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTOMATIC_POOL_SELECTION_ALLOWED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAutomaticPoolSelectionAllowed() <em>Automatic Pool Selection Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticPoolSelectionAllowed()
	 * @generated
	 * @ordered
	 */
	protected Boolean automaticPoolSelectionAllowed = AUTOMATIC_POOL_SELECTION_ALLOWED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClientSettableElementUsage() <em>Client Settable Element Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientSettableElementUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> clientSettableElementUsage;

	/**
	 * The cached value of the '{@link #getClientSettablePoolUsage() <em>Client Settable Pool Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientSettablePoolUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> clientSettablePoolUsage;

	/**
	 * The default value of the '{@link #getMaximumElementCreateCount() <em>Maximum Element Create Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumElementCreateCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAXIMUM_ELEMENT_CREATE_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumElementCreateCount() <em>Maximum Element Create Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumElementCreateCount()
	 * @generated
	 * @ordered
	 */
	protected Long maximumElementCreateCount = MAXIMUM_ELEMENT_CREATE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumElementDeleteCount() <em>Maximum Element Delete Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumElementDeleteCount()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAXIMUM_ELEMENT_DELETE_COUNT_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getMaximumElementDeleteCount() <em>Maximum Element Delete Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumElementDeleteCount()
	 * @generated
	 * @ordered
	 */
	protected Long maximumElementDeleteCount = MAXIMUM_ELEMENT_DELETE_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMultipleElementCreateFeatures() <em>Multiple Element Create Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleElementCreateFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> multipleElementCreateFeatures;

	/**
	 * The cached value of the '{@link #getMultipleElementDeleteFeatures() <em>Multiple Element Delete Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleElementDeleteFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> multipleElementDeleteFeatures;

	/**
	 * The cached value of the '{@link #getSupportedStorageElementUsage() <em>Supported Storage Element Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedStorageElementUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedStorageElementUsage;

	/**
	 * The cached value of the '{@link #getSupportedStoragePoolUsage() <em>Supported Storage Pool Usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedStoragePoolUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> supportedStoragePoolUsage;

	/**
	 * The default value of the '{@link #getThinProvisionedClientSettableReserve() <em>Thin Provisioned Client Settable Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinProvisionedClientSettableReserve()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean THIN_PROVISIONED_CLIENT_SETTABLE_RESERVE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getThinProvisionedClientSettableReserve() <em>Thin Provisioned Client Settable Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinProvisionedClientSettableReserve()
	 * @generated
	 * @ordered
	 */
	protected Boolean thinProvisionedClientSettableReserve = THIN_PROVISIONED_CLIENT_SETTABLE_RESERVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getThinProvisionedDefaultReserve() <em>Thin Provisioned Default Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinProvisionedDefaultReserve()
	 * @generated
	 * @ordered
	 */
	protected static final Long THIN_PROVISIONED_DEFAULT_RESERVE_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getThinProvisionedDefaultReserve() <em>Thin Provisioned Default Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThinProvisionedDefaultReserve()
	 * @generated
	 * @ordered
	 */
	protected Long thinProvisionedDefaultReserve = THIN_PROVISIONED_DEFAULT_RESERVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_StorageConfigurationCapabilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_StorageConfigurationCapabilities();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedAsynchronousActions() {
		if (supportedAsynchronousActions == null) {
			supportedAsynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS);
		}
		return supportedAsynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedSynchronousActions() {
		if (supportedSynchronousActions == null) {
			supportedSynchronousActions = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS);
		}
		return supportedSynchronousActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedStorageElementTypes() {
		if (supportedStorageElementTypes == null) {
			supportedStorageElementTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_TYPES);
		}
		return supportedStorageElementTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedStoragePoolFeatures() {
		if (supportedStoragePoolFeatures == null) {
			supportedStoragePoolFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_POOL_FEATURES);
		}
		return supportedStoragePoolFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedStorageElementFeatures() {
		if (supportedStorageElementFeatures == null) {
			supportedStorageElementFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_FEATURES);
		}
		return supportedStorageElementFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedCopyTypes() {
		if (supportedCopyTypes == null) {
			supportedCopyTypes = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_COPY_TYPES);
		}
		return supportedCopyTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getInitialReplicationState() {
		return initialReplicationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialReplicationState(Integer newInitialReplicationState) {
		Integer oldInitialReplicationState = initialReplicationState;
		initialReplicationState = newInitialReplicationState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__INITIAL_REPLICATION_STATE, oldInitialReplicationState, initialReplicationState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutomaticPoolSelectionAllowed() {
		return automaticPoolSelectionAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaticPoolSelectionAllowed(Boolean newAutomaticPoolSelectionAllowed) {
		Boolean oldAutomaticPoolSelectionAllowed = automaticPoolSelectionAllowed;
		automaticPoolSelectionAllowed = newAutomaticPoolSelectionAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__AUTOMATIC_POOL_SELECTION_ALLOWED, oldAutomaticPoolSelectionAllowed, automaticPoolSelectionAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getClientSettableElementUsage() {
		if (clientSettableElementUsage == null) {
			clientSettableElementUsage = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__CLIENT_SETTABLE_ELEMENT_USAGE);
		}
		return clientSettableElementUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getClientSettablePoolUsage() {
		if (clientSettablePoolUsage == null) {
			clientSettablePoolUsage = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__CLIENT_SETTABLE_POOL_USAGE);
		}
		return clientSettablePoolUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaximumElementCreateCount() {
		return maximumElementCreateCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumElementCreateCount(Long newMaximumElementCreateCount) {
		Long oldMaximumElementCreateCount = maximumElementCreateCount;
		maximumElementCreateCount = newMaximumElementCreateCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MAXIMUM_ELEMENT_CREATE_COUNT, oldMaximumElementCreateCount, maximumElementCreateCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaximumElementDeleteCount() {
		return maximumElementDeleteCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumElementDeleteCount(Long newMaximumElementDeleteCount) {
		Long oldMaximumElementDeleteCount = maximumElementDeleteCount;
		maximumElementDeleteCount = newMaximumElementDeleteCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MAXIMUM_ELEMENT_DELETE_COUNT, oldMaximumElementDeleteCount, maximumElementDeleteCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getMultipleElementCreateFeatures() {
		if (multipleElementCreateFeatures == null) {
			multipleElementCreateFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MULTIPLE_ELEMENT_CREATE_FEATURES);
		}
		return multipleElementCreateFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getMultipleElementDeleteFeatures() {
		if (multipleElementDeleteFeatures == null) {
			multipleElementDeleteFeatures = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MULTIPLE_ELEMENT_DELETE_FEATURES);
		}
		return multipleElementDeleteFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedStorageElementUsage() {
		if (supportedStorageElementUsage == null) {
			supportedStorageElementUsage = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_USAGE);
		}
		return supportedStorageElementUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getSupportedStoragePoolUsage() {
		if (supportedStoragePoolUsage == null) {
			supportedStoragePoolUsage = new EDataTypeEList<Integer>(Integer.class, this, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_POOL_USAGE);
		}
		return supportedStoragePoolUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getThinProvisionedClientSettableReserve() {
		return thinProvisionedClientSettableReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThinProvisionedClientSettableReserve(Boolean newThinProvisionedClientSettableReserve) {
		Boolean oldThinProvisionedClientSettableReserve = thinProvisionedClientSettableReserve;
		thinProvisionedClientSettableReserve = newThinProvisionedClientSettableReserve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__THIN_PROVISIONED_CLIENT_SETTABLE_RESERVE, oldThinProvisionedClientSettableReserve, thinProvisionedClientSettableReserve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getThinProvisionedDefaultReserve() {
		return thinProvisionedDefaultReserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThinProvisionedDefaultReserve(Long newThinProvisionedDefaultReserve) {
		Long oldThinProvisionedDefaultReserve = thinProvisionedDefaultReserve;
		thinProvisionedDefaultReserve = newThinProvisionedDefaultReserve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__THIN_PROVISIONED_DEFAULT_RESERVE, oldThinProvisionedDefaultReserve, thinProvisionedDefaultReserve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long GetElementNameCapabilities(Integer ElementType, CIM_ManagedElement Goal, CIM_StoragePool InPool, EList<Integer> SupportedFeatures, Integer MaxElementNameLen, String ElementNameMask) {
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
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return getSupportedAsynchronousActions();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return getSupportedSynchronousActions();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_TYPES:
				return getSupportedStorageElementTypes();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_POOL_FEATURES:
				return getSupportedStoragePoolFeatures();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_FEATURES:
				return getSupportedStorageElementFeatures();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_COPY_TYPES:
				return getSupportedCopyTypes();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__INITIAL_REPLICATION_STATE:
				return getInitialReplicationState();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__AUTOMATIC_POOL_SELECTION_ALLOWED:
				return getAutomaticPoolSelectionAllowed();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__CLIENT_SETTABLE_ELEMENT_USAGE:
				return getClientSettableElementUsage();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__CLIENT_SETTABLE_POOL_USAGE:
				return getClientSettablePoolUsage();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MAXIMUM_ELEMENT_CREATE_COUNT:
				return getMaximumElementCreateCount();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MAXIMUM_ELEMENT_DELETE_COUNT:
				return getMaximumElementDeleteCount();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MULTIPLE_ELEMENT_CREATE_FEATURES:
				return getMultipleElementCreateFeatures();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MULTIPLE_ELEMENT_DELETE_FEATURES:
				return getMultipleElementDeleteFeatures();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_USAGE:
				return getSupportedStorageElementUsage();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_POOL_USAGE:
				return getSupportedStoragePoolUsage();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__THIN_PROVISIONED_CLIENT_SETTABLE_RESERVE:
				return getThinProvisionedClientSettableReserve();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__THIN_PROVISIONED_DEFAULT_RESERVE:
				return getThinProvisionedDefaultReserve();
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
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				getSupportedAsynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				getSupportedSynchronousActions().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_TYPES:
				getSupportedStorageElementTypes().clear();
				getSupportedStorageElementTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_POOL_FEATURES:
				getSupportedStoragePoolFeatures().clear();
				getSupportedStoragePoolFeatures().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_FEATURES:
				getSupportedStorageElementFeatures().clear();
				getSupportedStorageElementFeatures().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_COPY_TYPES:
				getSupportedCopyTypes().clear();
				getSupportedCopyTypes().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__INITIAL_REPLICATION_STATE:
				setInitialReplicationState((Integer)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__AUTOMATIC_POOL_SELECTION_ALLOWED:
				setAutomaticPoolSelectionAllowed((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__CLIENT_SETTABLE_ELEMENT_USAGE:
				getClientSettableElementUsage().clear();
				getClientSettableElementUsage().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__CLIENT_SETTABLE_POOL_USAGE:
				getClientSettablePoolUsage().clear();
				getClientSettablePoolUsage().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MAXIMUM_ELEMENT_CREATE_COUNT:
				setMaximumElementCreateCount((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MAXIMUM_ELEMENT_DELETE_COUNT:
				setMaximumElementDeleteCount((Long)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MULTIPLE_ELEMENT_CREATE_FEATURES:
				getMultipleElementCreateFeatures().clear();
				getMultipleElementCreateFeatures().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MULTIPLE_ELEMENT_DELETE_FEATURES:
				getMultipleElementDeleteFeatures().clear();
				getMultipleElementDeleteFeatures().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_USAGE:
				getSupportedStorageElementUsage().clear();
				getSupportedStorageElementUsage().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_POOL_USAGE:
				getSupportedStoragePoolUsage().clear();
				getSupportedStoragePoolUsage().addAll((Collection<? extends Integer>)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__THIN_PROVISIONED_CLIENT_SETTABLE_RESERVE:
				setThinProvisionedClientSettableReserve((Boolean)newValue);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__THIN_PROVISIONED_DEFAULT_RESERVE:
				setThinProvisionedDefaultReserve((Long)newValue);
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
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				getSupportedAsynchronousActions().clear();
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				getSupportedSynchronousActions().clear();
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_TYPES:
				getSupportedStorageElementTypes().clear();
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_POOL_FEATURES:
				getSupportedStoragePoolFeatures().clear();
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_FEATURES:
				getSupportedStorageElementFeatures().clear();
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_COPY_TYPES:
				getSupportedCopyTypes().clear();
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__INITIAL_REPLICATION_STATE:
				setInitialReplicationState(INITIAL_REPLICATION_STATE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__AUTOMATIC_POOL_SELECTION_ALLOWED:
				setAutomaticPoolSelectionAllowed(AUTOMATIC_POOL_SELECTION_ALLOWED_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__CLIENT_SETTABLE_ELEMENT_USAGE:
				getClientSettableElementUsage().clear();
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__CLIENT_SETTABLE_POOL_USAGE:
				getClientSettablePoolUsage().clear();
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MAXIMUM_ELEMENT_CREATE_COUNT:
				setMaximumElementCreateCount(MAXIMUM_ELEMENT_CREATE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MAXIMUM_ELEMENT_DELETE_COUNT:
				setMaximumElementDeleteCount(MAXIMUM_ELEMENT_DELETE_COUNT_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MULTIPLE_ELEMENT_CREATE_FEATURES:
				getMultipleElementCreateFeatures().clear();
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MULTIPLE_ELEMENT_DELETE_FEATURES:
				getMultipleElementDeleteFeatures().clear();
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_USAGE:
				getSupportedStorageElementUsage().clear();
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_POOL_USAGE:
				getSupportedStoragePoolUsage().clear();
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__THIN_PROVISIONED_CLIENT_SETTABLE_RESERVE:
				setThinProvisionedClientSettableReserve(THIN_PROVISIONED_CLIENT_SETTABLE_RESERVE_EDEFAULT);
				return;
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__THIN_PROVISIONED_DEFAULT_RESERVE:
				setThinProvisionedDefaultReserve(THIN_PROVISIONED_DEFAULT_RESERVE_EDEFAULT);
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
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_ASYNCHRONOUS_ACTIONS:
				return supportedAsynchronousActions != null && !supportedAsynchronousActions.isEmpty();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_SYNCHRONOUS_ACTIONS:
				return supportedSynchronousActions != null && !supportedSynchronousActions.isEmpty();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_TYPES:
				return supportedStorageElementTypes != null && !supportedStorageElementTypes.isEmpty();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_POOL_FEATURES:
				return supportedStoragePoolFeatures != null && !supportedStoragePoolFeatures.isEmpty();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_FEATURES:
				return supportedStorageElementFeatures != null && !supportedStorageElementFeatures.isEmpty();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_COPY_TYPES:
				return supportedCopyTypes != null && !supportedCopyTypes.isEmpty();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__INITIAL_REPLICATION_STATE:
				return INITIAL_REPLICATION_STATE_EDEFAULT == null ? initialReplicationState != null : !INITIAL_REPLICATION_STATE_EDEFAULT.equals(initialReplicationState);
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__AUTOMATIC_POOL_SELECTION_ALLOWED:
				return AUTOMATIC_POOL_SELECTION_ALLOWED_EDEFAULT == null ? automaticPoolSelectionAllowed != null : !AUTOMATIC_POOL_SELECTION_ALLOWED_EDEFAULT.equals(automaticPoolSelectionAllowed);
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__CLIENT_SETTABLE_ELEMENT_USAGE:
				return clientSettableElementUsage != null && !clientSettableElementUsage.isEmpty();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__CLIENT_SETTABLE_POOL_USAGE:
				return clientSettablePoolUsage != null && !clientSettablePoolUsage.isEmpty();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MAXIMUM_ELEMENT_CREATE_COUNT:
				return MAXIMUM_ELEMENT_CREATE_COUNT_EDEFAULT == null ? maximumElementCreateCount != null : !MAXIMUM_ELEMENT_CREATE_COUNT_EDEFAULT.equals(maximumElementCreateCount);
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MAXIMUM_ELEMENT_DELETE_COUNT:
				return MAXIMUM_ELEMENT_DELETE_COUNT_EDEFAULT == null ? maximumElementDeleteCount != null : !MAXIMUM_ELEMENT_DELETE_COUNT_EDEFAULT.equals(maximumElementDeleteCount);
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MULTIPLE_ELEMENT_CREATE_FEATURES:
				return multipleElementCreateFeatures != null && !multipleElementCreateFeatures.isEmpty();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__MULTIPLE_ELEMENT_DELETE_FEATURES:
				return multipleElementDeleteFeatures != null && !multipleElementDeleteFeatures.isEmpty();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_ELEMENT_USAGE:
				return supportedStorageElementUsage != null && !supportedStorageElementUsage.isEmpty();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__SUPPORTED_STORAGE_POOL_USAGE:
				return supportedStoragePoolUsage != null && !supportedStoragePoolUsage.isEmpty();
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__THIN_PROVISIONED_CLIENT_SETTABLE_RESERVE:
				return THIN_PROVISIONED_CLIENT_SETTABLE_RESERVE_EDEFAULT == null ? thinProvisionedClientSettableReserve != null : !THIN_PROVISIONED_CLIENT_SETTABLE_RESERVE_EDEFAULT.equals(thinProvisionedClientSettableReserve);
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES__THIN_PROVISIONED_DEFAULT_RESERVE:
				return THIN_PROVISIONED_DEFAULT_RESERVE_EDEFAULT == null ? thinProvisionedDefaultReserve != null : !THIN_PROVISIONED_DEFAULT_RESERVE_EDEFAULT.equals(thinProvisionedDefaultReserve);
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
			case CimPackage.CIM_STORAGE_CONFIGURATION_CAPABILITIES___GET_ELEMENT_NAME_CAPABILITIES__INTEGER_CIM_MANAGEDELEMENT_CIM_STORAGEPOOL_ELIST_INTEGER_STRING:
				return GetElementNameCapabilities((Integer)arguments.get(0), (CIM_ManagedElement)arguments.get(1), (CIM_StoragePool)arguments.get(2), (EList<Integer>)arguments.get(3), (Integer)arguments.get(4), (String)arguments.get(5));
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
		result.append(" (SupportedAsynchronousActions: ");
		result.append(supportedAsynchronousActions);
		result.append(", SupportedSynchronousActions: ");
		result.append(supportedSynchronousActions);
		result.append(", SupportedStorageElementTypes: ");
		result.append(supportedStorageElementTypes);
		result.append(", SupportedStoragePoolFeatures: ");
		result.append(supportedStoragePoolFeatures);
		result.append(", SupportedStorageElementFeatures: ");
		result.append(supportedStorageElementFeatures);
		result.append(", SupportedCopyTypes: ");
		result.append(supportedCopyTypes);
		result.append(", InitialReplicationState: ");
		result.append(initialReplicationState);
		result.append(", AutomaticPoolSelectionAllowed: ");
		result.append(automaticPoolSelectionAllowed);
		result.append(", ClientSettableElementUsage: ");
		result.append(clientSettableElementUsage);
		result.append(", ClientSettablePoolUsage: ");
		result.append(clientSettablePoolUsage);
		result.append(", MaximumElementCreateCount: ");
		result.append(maximumElementCreateCount);
		result.append(", MaximumElementDeleteCount: ");
		result.append(maximumElementDeleteCount);
		result.append(", MultipleElementCreateFeatures: ");
		result.append(multipleElementCreateFeatures);
		result.append(", MultipleElementDeleteFeatures: ");
		result.append(multipleElementDeleteFeatures);
		result.append(", SupportedStorageElementUsage: ");
		result.append(supportedStorageElementUsage);
		result.append(", SupportedStoragePoolUsage: ");
		result.append(supportedStoragePoolUsage);
		result.append(", ThinProvisionedClientSettableReserve: ");
		result.append(thinProvisionedClientSettableReserve);
		result.append(", ThinProvisionedDefaultReserve: ");
		result.append(thinProvisionedDefaultReserve);
		result.append(')');
		return result.toString();
	}

} //CIM_StorageConfigurationCapabilitiesImpl

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

import org.dmtf.cim.CIM_VirtualSystemSettingData;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Virtual System Setting Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getVirtualSystemIdentifier <em>Virtual System Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getVirtualSystemType <em>Virtual System Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getConfigurationID <em>Configuration ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getConfigurationDataRoot <em>Configuration Data Root</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getConfigurationFile <em>Configuration File</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getSnapshotDataRoot <em>Snapshot Data Root</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getSuspendDataRoot <em>Suspend Data Root</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getSwapFileDataRoot <em>Swap File Data Root</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getLogDataRoot <em>Log Data Root</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getAutomaticStartupAction <em>Automatic Startup Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getAutomaticStartupActionDelay <em>Automatic Startup Action Delay</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getAutomaticStartupActionSequenceNumber <em>Automatic Startup Action Sequence Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getAutomaticShutdownAction <em>Automatic Shutdown Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getAutomaticRecoveryAction <em>Automatic Recovery Action</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_VirtualSystemSettingDataImpl#getRecoveryFile <em>Recovery File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_VirtualSystemSettingDataImpl extends CIM_SettingDataImpl implements CIM_VirtualSystemSettingData {
	/**
	 * The default value of the '{@link #getVirtualSystemIdentifier() <em>Virtual System Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSystemIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String VIRTUAL_SYSTEM_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualSystemIdentifier() <em>Virtual System Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSystemIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String virtualSystemIdentifier = VIRTUAL_SYSTEM_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualSystemType() <em>Virtual System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSystemType()
	 * @generated
	 * @ordered
	 */
	protected static final String VIRTUAL_SYSTEM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualSystemType() <em>Virtual System Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSystemType()
	 * @generated
	 * @ordered
	 */
	protected String virtualSystemType = VIRTUAL_SYSTEM_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> notes;

	/**
	 * The default value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected String creationTime = CREATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationID() <em>Configuration ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationID() <em>Configuration ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationID()
	 * @generated
	 * @ordered
	 */
	protected String configurationID = CONFIGURATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationDataRoot() <em>Configuration Data Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationDataRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_DATA_ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationDataRoot() <em>Configuration Data Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationDataRoot()
	 * @generated
	 * @ordered
	 */
	protected String configurationDataRoot = CONFIGURATION_DATA_ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigurationFile() <em>Configuration File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationFile()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationFile() <em>Configuration File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationFile()
	 * @generated
	 * @ordered
	 */
	protected String configurationFile = CONFIGURATION_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSnapshotDataRoot() <em>Snapshot Data Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapshotDataRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String SNAPSHOT_DATA_ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSnapshotDataRoot() <em>Snapshot Data Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapshotDataRoot()
	 * @generated
	 * @ordered
	 */
	protected String snapshotDataRoot = SNAPSHOT_DATA_ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuspendDataRoot() <em>Suspend Data Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspendDataRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String SUSPEND_DATA_ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuspendDataRoot() <em>Suspend Data Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuspendDataRoot()
	 * @generated
	 * @ordered
	 */
	protected String suspendDataRoot = SUSPEND_DATA_ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSwapFileDataRoot() <em>Swap File Data Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwapFileDataRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String SWAP_FILE_DATA_ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwapFileDataRoot() <em>Swap File Data Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwapFileDataRoot()
	 * @generated
	 * @ordered
	 */
	protected String swapFileDataRoot = SWAP_FILE_DATA_ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogDataRoot() <em>Log Data Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogDataRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_DATA_ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogDataRoot() <em>Log Data Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogDataRoot()
	 * @generated
	 * @ordered
	 */
	protected String logDataRoot = LOG_DATA_ROOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutomaticStartupAction() <em>Automatic Startup Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticStartupAction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AUTOMATIC_STARTUP_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutomaticStartupAction() <em>Automatic Startup Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticStartupAction()
	 * @generated
	 * @ordered
	 */
	protected Integer automaticStartupAction = AUTOMATIC_STARTUP_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutomaticStartupActionDelay() <em>Automatic Startup Action Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticStartupActionDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTOMATIC_STARTUP_ACTION_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutomaticStartupActionDelay() <em>Automatic Startup Action Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticStartupActionDelay()
	 * @generated
	 * @ordered
	 */
	protected String automaticStartupActionDelay = AUTOMATIC_STARTUP_ACTION_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutomaticStartupActionSequenceNumber() <em>Automatic Startup Action Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticStartupActionSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AUTOMATIC_STARTUP_ACTION_SEQUENCE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutomaticStartupActionSequenceNumber() <em>Automatic Startup Action Sequence Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticStartupActionSequenceNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer automaticStartupActionSequenceNumber = AUTOMATIC_STARTUP_ACTION_SEQUENCE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutomaticShutdownAction() <em>Automatic Shutdown Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticShutdownAction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AUTOMATIC_SHUTDOWN_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutomaticShutdownAction() <em>Automatic Shutdown Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticShutdownAction()
	 * @generated
	 * @ordered
	 */
	protected Integer automaticShutdownAction = AUTOMATIC_SHUTDOWN_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutomaticRecoveryAction() <em>Automatic Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AUTOMATIC_RECOVERY_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutomaticRecoveryAction() <em>Automatic Recovery Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticRecoveryAction()
	 * @generated
	 * @ordered
	 */
	protected Integer automaticRecoveryAction = AUTOMATIC_RECOVERY_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecoveryFile() <em>Recovery File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryFile()
	 * @generated
	 * @ordered
	 */
	protected static final String RECOVERY_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecoveryFile() <em>Recovery File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecoveryFile()
	 * @generated
	 * @ordered
	 */
	protected String recoveryFile = RECOVERY_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_VirtualSystemSettingDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_VirtualSystemSettingData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVirtualSystemIdentifier() {
		return virtualSystemIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualSystemIdentifier(String newVirtualSystemIdentifier) {
		String oldVirtualSystemIdentifier = virtualSystemIdentifier;
		virtualSystemIdentifier = newVirtualSystemIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__VIRTUAL_SYSTEM_IDENTIFIER, oldVirtualSystemIdentifier, virtualSystemIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVirtualSystemType() {
		return virtualSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualSystemType(String newVirtualSystemType) {
		String oldVirtualSystemType = virtualSystemType;
		virtualSystemType = newVirtualSystemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__VIRTUAL_SYSTEM_TYPE, oldVirtualSystemType, virtualSystemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNotes() {
		if (notes == null) {
			notes = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationTime() {
		return creationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationTime(String newCreationTime) {
		String oldCreationTime = creationTime;
		creationTime = newCreationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CREATION_TIME, oldCreationTime, creationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationID() {
		return configurationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationID(String newConfigurationID) {
		String oldConfigurationID = configurationID;
		configurationID = newConfigurationID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CONFIGURATION_ID, oldConfigurationID, configurationID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationDataRoot() {
		return configurationDataRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationDataRoot(String newConfigurationDataRoot) {
		String oldConfigurationDataRoot = configurationDataRoot;
		configurationDataRoot = newConfigurationDataRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CONFIGURATION_DATA_ROOT, oldConfigurationDataRoot, configurationDataRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfigurationFile() {
		return configurationFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfigurationFile(String newConfigurationFile) {
		String oldConfigurationFile = configurationFile;
		configurationFile = newConfigurationFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CONFIGURATION_FILE, oldConfigurationFile, configurationFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSnapshotDataRoot() {
		return snapshotDataRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSnapshotDataRoot(String newSnapshotDataRoot) {
		String oldSnapshotDataRoot = snapshotDataRoot;
		snapshotDataRoot = newSnapshotDataRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__SNAPSHOT_DATA_ROOT, oldSnapshotDataRoot, snapshotDataRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuspendDataRoot() {
		return suspendDataRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuspendDataRoot(String newSuspendDataRoot) {
		String oldSuspendDataRoot = suspendDataRoot;
		suspendDataRoot = newSuspendDataRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__SUSPEND_DATA_ROOT, oldSuspendDataRoot, suspendDataRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSwapFileDataRoot() {
		return swapFileDataRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSwapFileDataRoot(String newSwapFileDataRoot) {
		String oldSwapFileDataRoot = swapFileDataRoot;
		swapFileDataRoot = newSwapFileDataRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__SWAP_FILE_DATA_ROOT, oldSwapFileDataRoot, swapFileDataRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogDataRoot() {
		return logDataRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogDataRoot(String newLogDataRoot) {
		String oldLogDataRoot = logDataRoot;
		logDataRoot = newLogDataRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__LOG_DATA_ROOT, oldLogDataRoot, logDataRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAutomaticStartupAction() {
		return automaticStartupAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaticStartupAction(Integer newAutomaticStartupAction) {
		Integer oldAutomaticStartupAction = automaticStartupAction;
		automaticStartupAction = newAutomaticStartupAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_STARTUP_ACTION, oldAutomaticStartupAction, automaticStartupAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAutomaticStartupActionDelay() {
		return automaticStartupActionDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaticStartupActionDelay(String newAutomaticStartupActionDelay) {
		String oldAutomaticStartupActionDelay = automaticStartupActionDelay;
		automaticStartupActionDelay = newAutomaticStartupActionDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_STARTUP_ACTION_DELAY, oldAutomaticStartupActionDelay, automaticStartupActionDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAutomaticStartupActionSequenceNumber() {
		return automaticStartupActionSequenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaticStartupActionSequenceNumber(Integer newAutomaticStartupActionSequenceNumber) {
		Integer oldAutomaticStartupActionSequenceNumber = automaticStartupActionSequenceNumber;
		automaticStartupActionSequenceNumber = newAutomaticStartupActionSequenceNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_STARTUP_ACTION_SEQUENCE_NUMBER, oldAutomaticStartupActionSequenceNumber, automaticStartupActionSequenceNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAutomaticShutdownAction() {
		return automaticShutdownAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaticShutdownAction(Integer newAutomaticShutdownAction) {
		Integer oldAutomaticShutdownAction = automaticShutdownAction;
		automaticShutdownAction = newAutomaticShutdownAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_SHUTDOWN_ACTION, oldAutomaticShutdownAction, automaticShutdownAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAutomaticRecoveryAction() {
		return automaticRecoveryAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutomaticRecoveryAction(Integer newAutomaticRecoveryAction) {
		Integer oldAutomaticRecoveryAction = automaticRecoveryAction;
		automaticRecoveryAction = newAutomaticRecoveryAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_RECOVERY_ACTION, oldAutomaticRecoveryAction, automaticRecoveryAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecoveryFile() {
		return recoveryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecoveryFile(String newRecoveryFile) {
		String oldRecoveryFile = recoveryFile;
		recoveryFile = newRecoveryFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__RECOVERY_FILE, oldRecoveryFile, recoveryFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__VIRTUAL_SYSTEM_IDENTIFIER:
				return getVirtualSystemIdentifier();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__VIRTUAL_SYSTEM_TYPE:
				return getVirtualSystemType();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__NOTES:
				return getNotes();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CREATION_TIME:
				return getCreationTime();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CONFIGURATION_ID:
				return getConfigurationID();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CONFIGURATION_DATA_ROOT:
				return getConfigurationDataRoot();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CONFIGURATION_FILE:
				return getConfigurationFile();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__SNAPSHOT_DATA_ROOT:
				return getSnapshotDataRoot();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__SUSPEND_DATA_ROOT:
				return getSuspendDataRoot();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__SWAP_FILE_DATA_ROOT:
				return getSwapFileDataRoot();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__LOG_DATA_ROOT:
				return getLogDataRoot();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_STARTUP_ACTION:
				return getAutomaticStartupAction();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_STARTUP_ACTION_DELAY:
				return getAutomaticStartupActionDelay();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_STARTUP_ACTION_SEQUENCE_NUMBER:
				return getAutomaticStartupActionSequenceNumber();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_SHUTDOWN_ACTION:
				return getAutomaticShutdownAction();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_RECOVERY_ACTION:
				return getAutomaticRecoveryAction();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__RECOVERY_FILE:
				return getRecoveryFile();
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__VIRTUAL_SYSTEM_IDENTIFIER:
				setVirtualSystemIdentifier((String)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__VIRTUAL_SYSTEM_TYPE:
				setVirtualSystemType((String)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CREATION_TIME:
				setCreationTime((String)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CONFIGURATION_ID:
				setConfigurationID((String)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CONFIGURATION_DATA_ROOT:
				setConfigurationDataRoot((String)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CONFIGURATION_FILE:
				setConfigurationFile((String)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__SNAPSHOT_DATA_ROOT:
				setSnapshotDataRoot((String)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__SUSPEND_DATA_ROOT:
				setSuspendDataRoot((String)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__SWAP_FILE_DATA_ROOT:
				setSwapFileDataRoot((String)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__LOG_DATA_ROOT:
				setLogDataRoot((String)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_STARTUP_ACTION:
				setAutomaticStartupAction((Integer)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_STARTUP_ACTION_DELAY:
				setAutomaticStartupActionDelay((String)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_STARTUP_ACTION_SEQUENCE_NUMBER:
				setAutomaticStartupActionSequenceNumber((Integer)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_SHUTDOWN_ACTION:
				setAutomaticShutdownAction((Integer)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_RECOVERY_ACTION:
				setAutomaticRecoveryAction((Integer)newValue);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__RECOVERY_FILE:
				setRecoveryFile((String)newValue);
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__VIRTUAL_SYSTEM_IDENTIFIER:
				setVirtualSystemIdentifier(VIRTUAL_SYSTEM_IDENTIFIER_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__VIRTUAL_SYSTEM_TYPE:
				setVirtualSystemType(VIRTUAL_SYSTEM_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__NOTES:
				getNotes().clear();
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CREATION_TIME:
				setCreationTime(CREATION_TIME_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CONFIGURATION_ID:
				setConfigurationID(CONFIGURATION_ID_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CONFIGURATION_DATA_ROOT:
				setConfigurationDataRoot(CONFIGURATION_DATA_ROOT_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CONFIGURATION_FILE:
				setConfigurationFile(CONFIGURATION_FILE_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__SNAPSHOT_DATA_ROOT:
				setSnapshotDataRoot(SNAPSHOT_DATA_ROOT_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__SUSPEND_DATA_ROOT:
				setSuspendDataRoot(SUSPEND_DATA_ROOT_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__SWAP_FILE_DATA_ROOT:
				setSwapFileDataRoot(SWAP_FILE_DATA_ROOT_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__LOG_DATA_ROOT:
				setLogDataRoot(LOG_DATA_ROOT_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_STARTUP_ACTION:
				setAutomaticStartupAction(AUTOMATIC_STARTUP_ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_STARTUP_ACTION_DELAY:
				setAutomaticStartupActionDelay(AUTOMATIC_STARTUP_ACTION_DELAY_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_STARTUP_ACTION_SEQUENCE_NUMBER:
				setAutomaticStartupActionSequenceNumber(AUTOMATIC_STARTUP_ACTION_SEQUENCE_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_SHUTDOWN_ACTION:
				setAutomaticShutdownAction(AUTOMATIC_SHUTDOWN_ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_RECOVERY_ACTION:
				setAutomaticRecoveryAction(AUTOMATIC_RECOVERY_ACTION_EDEFAULT);
				return;
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__RECOVERY_FILE:
				setRecoveryFile(RECOVERY_FILE_EDEFAULT);
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
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__VIRTUAL_SYSTEM_IDENTIFIER:
				return VIRTUAL_SYSTEM_IDENTIFIER_EDEFAULT == null ? virtualSystemIdentifier != null : !VIRTUAL_SYSTEM_IDENTIFIER_EDEFAULT.equals(virtualSystemIdentifier);
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__VIRTUAL_SYSTEM_TYPE:
				return VIRTUAL_SYSTEM_TYPE_EDEFAULT == null ? virtualSystemType != null : !VIRTUAL_SYSTEM_TYPE_EDEFAULT.equals(virtualSystemType);
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__NOTES:
				return notes != null && !notes.isEmpty();
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CREATION_TIME:
				return CREATION_TIME_EDEFAULT == null ? creationTime != null : !CREATION_TIME_EDEFAULT.equals(creationTime);
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CONFIGURATION_ID:
				return CONFIGURATION_ID_EDEFAULT == null ? configurationID != null : !CONFIGURATION_ID_EDEFAULT.equals(configurationID);
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CONFIGURATION_DATA_ROOT:
				return CONFIGURATION_DATA_ROOT_EDEFAULT == null ? configurationDataRoot != null : !CONFIGURATION_DATA_ROOT_EDEFAULT.equals(configurationDataRoot);
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__CONFIGURATION_FILE:
				return CONFIGURATION_FILE_EDEFAULT == null ? configurationFile != null : !CONFIGURATION_FILE_EDEFAULT.equals(configurationFile);
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__SNAPSHOT_DATA_ROOT:
				return SNAPSHOT_DATA_ROOT_EDEFAULT == null ? snapshotDataRoot != null : !SNAPSHOT_DATA_ROOT_EDEFAULT.equals(snapshotDataRoot);
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__SUSPEND_DATA_ROOT:
				return SUSPEND_DATA_ROOT_EDEFAULT == null ? suspendDataRoot != null : !SUSPEND_DATA_ROOT_EDEFAULT.equals(suspendDataRoot);
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__SWAP_FILE_DATA_ROOT:
				return SWAP_FILE_DATA_ROOT_EDEFAULT == null ? swapFileDataRoot != null : !SWAP_FILE_DATA_ROOT_EDEFAULT.equals(swapFileDataRoot);
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__LOG_DATA_ROOT:
				return LOG_DATA_ROOT_EDEFAULT == null ? logDataRoot != null : !LOG_DATA_ROOT_EDEFAULT.equals(logDataRoot);
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_STARTUP_ACTION:
				return AUTOMATIC_STARTUP_ACTION_EDEFAULT == null ? automaticStartupAction != null : !AUTOMATIC_STARTUP_ACTION_EDEFAULT.equals(automaticStartupAction);
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_STARTUP_ACTION_DELAY:
				return AUTOMATIC_STARTUP_ACTION_DELAY_EDEFAULT == null ? automaticStartupActionDelay != null : !AUTOMATIC_STARTUP_ACTION_DELAY_EDEFAULT.equals(automaticStartupActionDelay);
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_STARTUP_ACTION_SEQUENCE_NUMBER:
				return AUTOMATIC_STARTUP_ACTION_SEQUENCE_NUMBER_EDEFAULT == null ? automaticStartupActionSequenceNumber != null : !AUTOMATIC_STARTUP_ACTION_SEQUENCE_NUMBER_EDEFAULT.equals(automaticStartupActionSequenceNumber);
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_SHUTDOWN_ACTION:
				return AUTOMATIC_SHUTDOWN_ACTION_EDEFAULT == null ? automaticShutdownAction != null : !AUTOMATIC_SHUTDOWN_ACTION_EDEFAULT.equals(automaticShutdownAction);
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__AUTOMATIC_RECOVERY_ACTION:
				return AUTOMATIC_RECOVERY_ACTION_EDEFAULT == null ? automaticRecoveryAction != null : !AUTOMATIC_RECOVERY_ACTION_EDEFAULT.equals(automaticRecoveryAction);
			case CimPackage.CIM_VIRTUAL_SYSTEM_SETTING_DATA__RECOVERY_FILE:
				return RECOVERY_FILE_EDEFAULT == null ? recoveryFile != null : !RECOVERY_FILE_EDEFAULT.equals(recoveryFile);
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
		result.append(" (VirtualSystemIdentifier: ");
		result.append(virtualSystemIdentifier);
		result.append(", VirtualSystemType: ");
		result.append(virtualSystemType);
		result.append(", Notes: ");
		result.append(notes);
		result.append(", CreationTime: ");
		result.append(creationTime);
		result.append(", ConfigurationID: ");
		result.append(configurationID);
		result.append(", ConfigurationDataRoot: ");
		result.append(configurationDataRoot);
		result.append(", ConfigurationFile: ");
		result.append(configurationFile);
		result.append(", SnapshotDataRoot: ");
		result.append(snapshotDataRoot);
		result.append(", SuspendDataRoot: ");
		result.append(suspendDataRoot);
		result.append(", SwapFileDataRoot: ");
		result.append(swapFileDataRoot);
		result.append(", LogDataRoot: ");
		result.append(logDataRoot);
		result.append(", AutomaticStartupAction: ");
		result.append(automaticStartupAction);
		result.append(", AutomaticStartupActionDelay: ");
		result.append(automaticStartupActionDelay);
		result.append(", AutomaticStartupActionSequenceNumber: ");
		result.append(automaticStartupActionSequenceNumber);
		result.append(", AutomaticShutdownAction: ");
		result.append(automaticShutdownAction);
		result.append(", AutomaticRecoveryAction: ");
		result.append(automaticRecoveryAction);
		result.append(", RecoveryFile: ");
		result.append(recoveryFile);
		result.append(')');
		return result.toString();
	}

} //CIM_VirtualSystemSettingDataImpl

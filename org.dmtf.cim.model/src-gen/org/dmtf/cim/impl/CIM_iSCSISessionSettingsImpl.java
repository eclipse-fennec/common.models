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

import org.dmtf.cim.CIM_iSCSISessionSettings;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM iSCSI Session Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionSettingsImpl#getMaxConnectionsPerSession <em>Max Connections Per Session</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionSettingsImpl#getInitialR2TPreference <em>Initial R2T Preference</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionSettingsImpl#getImmediateDataPreference <em>Immediate Data Preference</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionSettingsImpl#getMaxOutstandingR2T <em>Max Outstanding R2T</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionSettingsImpl#getMaxUnsolicitedFirstDataBurstLength <em>Max Unsolicited First Data Burst Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionSettingsImpl#getMaxDataBurstLength <em>Max Data Burst Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionSettingsImpl#getDataSequenceInOrderPreference <em>Data Sequence In Order Preference</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionSettingsImpl#getDataPDUInOrderPreference <em>Data PDU In Order Preference</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionSettingsImpl#getDefaultTimeToWaitPreference <em>Default Time To Wait Preference</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionSettingsImpl#getDefaultTimeToRetainPreference <em>Default Time To Retain Preference</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionSettingsImpl#getErrorRecoveryLevelPreference <em>Error Recovery Level Preference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_iSCSISessionSettingsImpl extends CIM_SettingDataImpl implements CIM_iSCSISessionSettings {
	/**
	 * The default value of the '{@link #getMaxConnectionsPerSession() <em>Max Connections Per Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConnectionsPerSession()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_CONNECTIONS_PER_SESSION_EDEFAULT = Long.valueOf(1L);

	/**
	 * The cached value of the '{@link #getMaxConnectionsPerSession() <em>Max Connections Per Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConnectionsPerSession()
	 * @generated
	 * @ordered
	 */
	protected Long maxConnectionsPerSession = MAX_CONNECTIONS_PER_SESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialR2TPreference() <em>Initial R2T Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialR2TPreference()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INITIAL_R2T_PREFERENCE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getInitialR2TPreference() <em>Initial R2T Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialR2TPreference()
	 * @generated
	 * @ordered
	 */
	protected Boolean initialR2TPreference = INITIAL_R2T_PREFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImmediateDataPreference() <em>Immediate Data Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmediateDataPreference()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IMMEDIATE_DATA_PREFERENCE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getImmediateDataPreference() <em>Immediate Data Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmediateDataPreference()
	 * @generated
	 * @ordered
	 */
	protected Boolean immediateDataPreference = IMMEDIATE_DATA_PREFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxOutstandingR2T() <em>Max Outstanding R2T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOutstandingR2T()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_OUTSTANDING_R2T_EDEFAULT = Long.valueOf(1L);

	/**
	 * The cached value of the '{@link #getMaxOutstandingR2T() <em>Max Outstanding R2T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOutstandingR2T()
	 * @generated
	 * @ordered
	 */
	protected Long maxOutstandingR2T = MAX_OUTSTANDING_R2T_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxUnsolicitedFirstDataBurstLength() <em>Max Unsolicited First Data Burst Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnsolicitedFirstDataBurstLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH_EDEFAULT = Long.valueOf(65536L);

	/**
	 * The cached value of the '{@link #getMaxUnsolicitedFirstDataBurstLength() <em>Max Unsolicited First Data Burst Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxUnsolicitedFirstDataBurstLength()
	 * @generated
	 * @ordered
	 */
	protected Long maxUnsolicitedFirstDataBurstLength = MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDataBurstLength() <em>Max Data Burst Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataBurstLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_DATA_BURST_LENGTH_EDEFAULT = Long.valueOf(262144L);

	/**
	 * The cached value of the '{@link #getMaxDataBurstLength() <em>Max Data Burst Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDataBurstLength()
	 * @generated
	 * @ordered
	 */
	protected Long maxDataBurstLength = MAX_DATA_BURST_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSequenceInOrderPreference() <em>Data Sequence In Order Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSequenceInOrderPreference()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DATA_SEQUENCE_IN_ORDER_PREFERENCE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDataSequenceInOrderPreference() <em>Data Sequence In Order Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSequenceInOrderPreference()
	 * @generated
	 * @ordered
	 */
	protected Boolean dataSequenceInOrderPreference = DATA_SEQUENCE_IN_ORDER_PREFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataPDUInOrderPreference() <em>Data PDU In Order Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPDUInOrderPreference()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DATA_PDU_IN_ORDER_PREFERENCE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getDataPDUInOrderPreference() <em>Data PDU In Order Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPDUInOrderPreference()
	 * @generated
	 * @ordered
	 */
	protected Boolean dataPDUInOrderPreference = DATA_PDU_IN_ORDER_PREFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultTimeToWaitPreference() <em>Default Time To Wait Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeToWaitPreference()
	 * @generated
	 * @ordered
	 */
	protected static final Long DEFAULT_TIME_TO_WAIT_PREFERENCE_EDEFAULT = Long.valueOf(2L);

	/**
	 * The cached value of the '{@link #getDefaultTimeToWaitPreference() <em>Default Time To Wait Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeToWaitPreference()
	 * @generated
	 * @ordered
	 */
	protected Long defaultTimeToWaitPreference = DEFAULT_TIME_TO_WAIT_PREFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultTimeToRetainPreference() <em>Default Time To Retain Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeToRetainPreference()
	 * @generated
	 * @ordered
	 */
	protected static final Long DEFAULT_TIME_TO_RETAIN_PREFERENCE_EDEFAULT = Long.valueOf(20L);

	/**
	 * The cached value of the '{@link #getDefaultTimeToRetainPreference() <em>Default Time To Retain Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeToRetainPreference()
	 * @generated
	 * @ordered
	 */
	protected Long defaultTimeToRetainPreference = DEFAULT_TIME_TO_RETAIN_PREFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorRecoveryLevelPreference() <em>Error Recovery Level Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorRecoveryLevelPreference()
	 * @generated
	 * @ordered
	 */
	protected static final Long ERROR_RECOVERY_LEVEL_PREFERENCE_EDEFAULT = Long.valueOf(0L);

	/**
	 * The cached value of the '{@link #getErrorRecoveryLevelPreference() <em>Error Recovery Level Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorRecoveryLevelPreference()
	 * @generated
	 * @ordered
	 */
	protected Long errorRecoveryLevelPreference = ERROR_RECOVERY_LEVEL_PREFERENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_iSCSISessionSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_iSCSISessionSettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxConnectionsPerSession() {
		return maxConnectionsPerSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxConnectionsPerSession(Long newMaxConnectionsPerSession) {
		Long oldMaxConnectionsPerSession = maxConnectionsPerSession;
		maxConnectionsPerSession = newMaxConnectionsPerSession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_CONNECTIONS_PER_SESSION, oldMaxConnectionsPerSession, maxConnectionsPerSession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getInitialR2TPreference() {
		return initialR2TPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialR2TPreference(Boolean newInitialR2TPreference) {
		Boolean oldInitialR2TPreference = initialR2TPreference;
		initialR2TPreference = newInitialR2TPreference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_SETTINGS__INITIAL_R2T_PREFERENCE, oldInitialR2TPreference, initialR2TPreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getImmediateDataPreference() {
		return immediateDataPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImmediateDataPreference(Boolean newImmediateDataPreference) {
		Boolean oldImmediateDataPreference = immediateDataPreference;
		immediateDataPreference = newImmediateDataPreference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_SETTINGS__IMMEDIATE_DATA_PREFERENCE, oldImmediateDataPreference, immediateDataPreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxOutstandingR2T() {
		return maxOutstandingR2T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxOutstandingR2T(Long newMaxOutstandingR2T) {
		Long oldMaxOutstandingR2T = maxOutstandingR2T;
		maxOutstandingR2T = newMaxOutstandingR2T;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_OUTSTANDING_R2T, oldMaxOutstandingR2T, maxOutstandingR2T));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxUnsolicitedFirstDataBurstLength() {
		return maxUnsolicitedFirstDataBurstLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxUnsolicitedFirstDataBurstLength(Long newMaxUnsolicitedFirstDataBurstLength) {
		Long oldMaxUnsolicitedFirstDataBurstLength = maxUnsolicitedFirstDataBurstLength;
		maxUnsolicitedFirstDataBurstLength = newMaxUnsolicitedFirstDataBurstLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH, oldMaxUnsolicitedFirstDataBurstLength, maxUnsolicitedFirstDataBurstLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMaxDataBurstLength() {
		return maxDataBurstLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxDataBurstLength(Long newMaxDataBurstLength) {
		Long oldMaxDataBurstLength = maxDataBurstLength;
		maxDataBurstLength = newMaxDataBurstLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_DATA_BURST_LENGTH, oldMaxDataBurstLength, maxDataBurstLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDataSequenceInOrderPreference() {
		return dataSequenceInOrderPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSequenceInOrderPreference(Boolean newDataSequenceInOrderPreference) {
		Boolean oldDataSequenceInOrderPreference = dataSequenceInOrderPreference;
		dataSequenceInOrderPreference = newDataSequenceInOrderPreference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_SETTINGS__DATA_SEQUENCE_IN_ORDER_PREFERENCE, oldDataSequenceInOrderPreference, dataSequenceInOrderPreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDataPDUInOrderPreference() {
		return dataPDUInOrderPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataPDUInOrderPreference(Boolean newDataPDUInOrderPreference) {
		Boolean oldDataPDUInOrderPreference = dataPDUInOrderPreference;
		dataPDUInOrderPreference = newDataPDUInOrderPreference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_SETTINGS__DATA_PDU_IN_ORDER_PREFERENCE, oldDataPDUInOrderPreference, dataPDUInOrderPreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDefaultTimeToWaitPreference() {
		return defaultTimeToWaitPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultTimeToWaitPreference(Long newDefaultTimeToWaitPreference) {
		Long oldDefaultTimeToWaitPreference = defaultTimeToWaitPreference;
		defaultTimeToWaitPreference = newDefaultTimeToWaitPreference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_SETTINGS__DEFAULT_TIME_TO_WAIT_PREFERENCE, oldDefaultTimeToWaitPreference, defaultTimeToWaitPreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDefaultTimeToRetainPreference() {
		return defaultTimeToRetainPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultTimeToRetainPreference(Long newDefaultTimeToRetainPreference) {
		Long oldDefaultTimeToRetainPreference = defaultTimeToRetainPreference;
		defaultTimeToRetainPreference = newDefaultTimeToRetainPreference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_SETTINGS__DEFAULT_TIME_TO_RETAIN_PREFERENCE, oldDefaultTimeToRetainPreference, defaultTimeToRetainPreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getErrorRecoveryLevelPreference() {
		return errorRecoveryLevelPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorRecoveryLevelPreference(Long newErrorRecoveryLevelPreference) {
		Long oldErrorRecoveryLevelPreference = errorRecoveryLevelPreference;
		errorRecoveryLevelPreference = newErrorRecoveryLevelPreference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION_SETTINGS__ERROR_RECOVERY_LEVEL_PREFERENCE, oldErrorRecoveryLevelPreference, errorRecoveryLevelPreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_CONNECTIONS_PER_SESSION:
				return getMaxConnectionsPerSession();
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__INITIAL_R2T_PREFERENCE:
				return getInitialR2TPreference();
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__IMMEDIATE_DATA_PREFERENCE:
				return getImmediateDataPreference();
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_OUTSTANDING_R2T:
				return getMaxOutstandingR2T();
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH:
				return getMaxUnsolicitedFirstDataBurstLength();
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_DATA_BURST_LENGTH:
				return getMaxDataBurstLength();
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DATA_SEQUENCE_IN_ORDER_PREFERENCE:
				return getDataSequenceInOrderPreference();
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DATA_PDU_IN_ORDER_PREFERENCE:
				return getDataPDUInOrderPreference();
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DEFAULT_TIME_TO_WAIT_PREFERENCE:
				return getDefaultTimeToWaitPreference();
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DEFAULT_TIME_TO_RETAIN_PREFERENCE:
				return getDefaultTimeToRetainPreference();
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__ERROR_RECOVERY_LEVEL_PREFERENCE:
				return getErrorRecoveryLevelPreference();
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
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_CONNECTIONS_PER_SESSION:
				setMaxConnectionsPerSession((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__INITIAL_R2T_PREFERENCE:
				setInitialR2TPreference((Boolean)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__IMMEDIATE_DATA_PREFERENCE:
				setImmediateDataPreference((Boolean)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_OUTSTANDING_R2T:
				setMaxOutstandingR2T((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH:
				setMaxUnsolicitedFirstDataBurstLength((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_DATA_BURST_LENGTH:
				setMaxDataBurstLength((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DATA_SEQUENCE_IN_ORDER_PREFERENCE:
				setDataSequenceInOrderPreference((Boolean)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DATA_PDU_IN_ORDER_PREFERENCE:
				setDataPDUInOrderPreference((Boolean)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DEFAULT_TIME_TO_WAIT_PREFERENCE:
				setDefaultTimeToWaitPreference((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DEFAULT_TIME_TO_RETAIN_PREFERENCE:
				setDefaultTimeToRetainPreference((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__ERROR_RECOVERY_LEVEL_PREFERENCE:
				setErrorRecoveryLevelPreference((Long)newValue);
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
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_CONNECTIONS_PER_SESSION:
				setMaxConnectionsPerSession(MAX_CONNECTIONS_PER_SESSION_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__INITIAL_R2T_PREFERENCE:
				setInitialR2TPreference(INITIAL_R2T_PREFERENCE_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__IMMEDIATE_DATA_PREFERENCE:
				setImmediateDataPreference(IMMEDIATE_DATA_PREFERENCE_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_OUTSTANDING_R2T:
				setMaxOutstandingR2T(MAX_OUTSTANDING_R2T_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH:
				setMaxUnsolicitedFirstDataBurstLength(MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_DATA_BURST_LENGTH:
				setMaxDataBurstLength(MAX_DATA_BURST_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DATA_SEQUENCE_IN_ORDER_PREFERENCE:
				setDataSequenceInOrderPreference(DATA_SEQUENCE_IN_ORDER_PREFERENCE_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DATA_PDU_IN_ORDER_PREFERENCE:
				setDataPDUInOrderPreference(DATA_PDU_IN_ORDER_PREFERENCE_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DEFAULT_TIME_TO_WAIT_PREFERENCE:
				setDefaultTimeToWaitPreference(DEFAULT_TIME_TO_WAIT_PREFERENCE_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DEFAULT_TIME_TO_RETAIN_PREFERENCE:
				setDefaultTimeToRetainPreference(DEFAULT_TIME_TO_RETAIN_PREFERENCE_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__ERROR_RECOVERY_LEVEL_PREFERENCE:
				setErrorRecoveryLevelPreference(ERROR_RECOVERY_LEVEL_PREFERENCE_EDEFAULT);
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
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_CONNECTIONS_PER_SESSION:
				return MAX_CONNECTIONS_PER_SESSION_EDEFAULT == null ? maxConnectionsPerSession != null : !MAX_CONNECTIONS_PER_SESSION_EDEFAULT.equals(maxConnectionsPerSession);
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__INITIAL_R2T_PREFERENCE:
				return INITIAL_R2T_PREFERENCE_EDEFAULT == null ? initialR2TPreference != null : !INITIAL_R2T_PREFERENCE_EDEFAULT.equals(initialR2TPreference);
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__IMMEDIATE_DATA_PREFERENCE:
				return IMMEDIATE_DATA_PREFERENCE_EDEFAULT == null ? immediateDataPreference != null : !IMMEDIATE_DATA_PREFERENCE_EDEFAULT.equals(immediateDataPreference);
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_OUTSTANDING_R2T:
				return MAX_OUTSTANDING_R2T_EDEFAULT == null ? maxOutstandingR2T != null : !MAX_OUTSTANDING_R2T_EDEFAULT.equals(maxOutstandingR2T);
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH:
				return MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH_EDEFAULT == null ? maxUnsolicitedFirstDataBurstLength != null : !MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH_EDEFAULT.equals(maxUnsolicitedFirstDataBurstLength);
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__MAX_DATA_BURST_LENGTH:
				return MAX_DATA_BURST_LENGTH_EDEFAULT == null ? maxDataBurstLength != null : !MAX_DATA_BURST_LENGTH_EDEFAULT.equals(maxDataBurstLength);
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DATA_SEQUENCE_IN_ORDER_PREFERENCE:
				return DATA_SEQUENCE_IN_ORDER_PREFERENCE_EDEFAULT == null ? dataSequenceInOrderPreference != null : !DATA_SEQUENCE_IN_ORDER_PREFERENCE_EDEFAULT.equals(dataSequenceInOrderPreference);
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DATA_PDU_IN_ORDER_PREFERENCE:
				return DATA_PDU_IN_ORDER_PREFERENCE_EDEFAULT == null ? dataPDUInOrderPreference != null : !DATA_PDU_IN_ORDER_PREFERENCE_EDEFAULT.equals(dataPDUInOrderPreference);
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DEFAULT_TIME_TO_WAIT_PREFERENCE:
				return DEFAULT_TIME_TO_WAIT_PREFERENCE_EDEFAULT == null ? defaultTimeToWaitPreference != null : !DEFAULT_TIME_TO_WAIT_PREFERENCE_EDEFAULT.equals(defaultTimeToWaitPreference);
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__DEFAULT_TIME_TO_RETAIN_PREFERENCE:
				return DEFAULT_TIME_TO_RETAIN_PREFERENCE_EDEFAULT == null ? defaultTimeToRetainPreference != null : !DEFAULT_TIME_TO_RETAIN_PREFERENCE_EDEFAULT.equals(defaultTimeToRetainPreference);
			case CimPackage.CIM_ISCSI_SESSION_SETTINGS__ERROR_RECOVERY_LEVEL_PREFERENCE:
				return ERROR_RECOVERY_LEVEL_PREFERENCE_EDEFAULT == null ? errorRecoveryLevelPreference != null : !ERROR_RECOVERY_LEVEL_PREFERENCE_EDEFAULT.equals(errorRecoveryLevelPreference);
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
		result.append(" (MaxConnectionsPerSession: ");
		result.append(maxConnectionsPerSession);
		result.append(", InitialR2TPreference: ");
		result.append(initialR2TPreference);
		result.append(", ImmediateDataPreference: ");
		result.append(immediateDataPreference);
		result.append(", MaxOutstandingR2T: ");
		result.append(maxOutstandingR2T);
		result.append(", MaxUnsolicitedFirstDataBurstLength: ");
		result.append(maxUnsolicitedFirstDataBurstLength);
		result.append(", MaxDataBurstLength: ");
		result.append(maxDataBurstLength);
		result.append(", DataSequenceInOrderPreference: ");
		result.append(dataSequenceInOrderPreference);
		result.append(", DataPDUInOrderPreference: ");
		result.append(dataPDUInOrderPreference);
		result.append(", DefaultTimeToWaitPreference: ");
		result.append(defaultTimeToWaitPreference);
		result.append(", DefaultTimeToRetainPreference: ");
		result.append(defaultTimeToRetainPreference);
		result.append(", ErrorRecoveryLevelPreference: ");
		result.append(errorRecoveryLevelPreference);
		result.append(')');
		return result.toString();
	}

} //CIM_iSCSISessionSettingsImpl

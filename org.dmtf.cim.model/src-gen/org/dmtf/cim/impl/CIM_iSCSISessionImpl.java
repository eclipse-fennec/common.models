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

import org.dmtf.cim.CIM_iSCSISession;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM iSCSI Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionImpl#getSessionType <em>Session Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionImpl#getTSIH <em>TSIH</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionImpl#getEndPointName <em>End Point Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionImpl#getCurrentConnections <em>Current Connections</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionImpl#getInitialR2T <em>Initial R2T</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionImpl#getImmediateData <em>Immediate Data</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionImpl#getMaxOutstandingR2T <em>Max Outstanding R2T</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionImpl#getMaxUnsolicitedFirstDataBurstLength <em>Max Unsolicited First Data Burst Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionImpl#getMaxDataBurstLength <em>Max Data Burst Length</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionImpl#getDataSequenceInOrder <em>Data Sequence In Order</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionImpl#getDataPDUInOrder <em>Data PDU In Order</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionImpl#getErrorRecoveryLevel <em>Error Recovery Level</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionImpl#getMaxConnectionsPerSession <em>Max Connections Per Session</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionImpl#getDefaultTimeToWait <em>Default Time To Wait</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_iSCSISessionImpl#getDefaultTimeToRetain <em>Default Time To Retain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_iSCSISessionImpl extends CIM_NetworkPipeImpl implements CIM_iSCSISession {
	/**
	 * The default value of the '{@link #getSessionType() <em>Session Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SESSION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSessionType() <em>Session Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSessionType()
	 * @generated
	 * @ordered
	 */
	protected Integer sessionType = SESSION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTSIH() <em>TSIH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSIH()
	 * @generated
	 * @ordered
	 */
	protected static final Long TSIH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTSIH() <em>TSIH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSIH()
	 * @generated
	 * @ordered
	 */
	protected Long tsih = TSIH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndPointName() <em>End Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointName()
	 * @generated
	 * @ordered
	 */
	protected static final String END_POINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndPointName() <em>End Point Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndPointName()
	 * @generated
	 * @ordered
	 */
	protected String endPointName = END_POINT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentConnections() <em>Current Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentConnections()
	 * @generated
	 * @ordered
	 */
	protected static final Long CURRENT_CONNECTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentConnections() <em>Current Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentConnections()
	 * @generated
	 * @ordered
	 */
	protected Long currentConnections = CURRENT_CONNECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialR2T() <em>Initial R2T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialR2T()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INITIAL_R2T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialR2T() <em>Initial R2T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialR2T()
	 * @generated
	 * @ordered
	 */
	protected Boolean initialR2T = INITIAL_R2T_EDEFAULT;

	/**
	 * The default value of the '{@link #getImmediateData() <em>Immediate Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmediateData()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IMMEDIATE_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImmediateData() <em>Immediate Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmediateData()
	 * @generated
	 * @ordered
	 */
	protected Boolean immediateData = IMMEDIATE_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxOutstandingR2T() <em>Max Outstanding R2T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxOutstandingR2T()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_OUTSTANDING_R2T_EDEFAULT = null;

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
	protected static final Long MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH_EDEFAULT = null;

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
	protected static final Long MAX_DATA_BURST_LENGTH_EDEFAULT = null;

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
	 * The default value of the '{@link #getDataSequenceInOrder() <em>Data Sequence In Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSequenceInOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DATA_SEQUENCE_IN_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSequenceInOrder() <em>Data Sequence In Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSequenceInOrder()
	 * @generated
	 * @ordered
	 */
	protected Boolean dataSequenceInOrder = DATA_SEQUENCE_IN_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataPDUInOrder() <em>Data PDU In Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPDUInOrder()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DATA_PDU_IN_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataPDUInOrder() <em>Data PDU In Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPDUInOrder()
	 * @generated
	 * @ordered
	 */
	protected Boolean dataPDUInOrder = DATA_PDU_IN_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorRecoveryLevel() <em>Error Recovery Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorRecoveryLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Long ERROR_RECOVERY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorRecoveryLevel() <em>Error Recovery Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorRecoveryLevel()
	 * @generated
	 * @ordered
	 */
	protected Long errorRecoveryLevel = ERROR_RECOVERY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxConnectionsPerSession() <em>Max Connections Per Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConnectionsPerSession()
	 * @generated
	 * @ordered
	 */
	protected static final Long MAX_CONNECTIONS_PER_SESSION_EDEFAULT = null;

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
	 * The default value of the '{@link #getDefaultTimeToWait() <em>Default Time To Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeToWait()
	 * @generated
	 * @ordered
	 */
	protected static final Long DEFAULT_TIME_TO_WAIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultTimeToWait() <em>Default Time To Wait</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeToWait()
	 * @generated
	 * @ordered
	 */
	protected Long defaultTimeToWait = DEFAULT_TIME_TO_WAIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultTimeToRetain() <em>Default Time To Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeToRetain()
	 * @generated
	 * @ordered
	 */
	protected static final Long DEFAULT_TIME_TO_RETAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultTimeToRetain() <em>Default Time To Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimeToRetain()
	 * @generated
	 * @ordered
	 */
	protected Long defaultTimeToRetain = DEFAULT_TIME_TO_RETAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_iSCSISessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_iSCSISession();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSessionType() {
		return sessionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSessionType(Integer newSessionType) {
		Integer oldSessionType = sessionType;
		sessionType = newSessionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION__SESSION_TYPE, oldSessionType, sessionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getTSIH() {
		return tsih;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTSIH(Long newTSIH) {
		Long oldTSIH = tsih;
		tsih = newTSIH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION__TSIH, oldTSIH, tsih));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndPointName() {
		return endPointName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndPointName(String newEndPointName) {
		String oldEndPointName = endPointName;
		endPointName = newEndPointName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION__END_POINT_NAME, oldEndPointName, endPointName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getCurrentConnections() {
		return currentConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentConnections(Long newCurrentConnections) {
		Long oldCurrentConnections = currentConnections;
		currentConnections = newCurrentConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION__CURRENT_CONNECTIONS, oldCurrentConnections, currentConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getInitialR2T() {
		return initialR2T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialR2T(Boolean newInitialR2T) {
		Boolean oldInitialR2T = initialR2T;
		initialR2T = newInitialR2T;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION__INITIAL_R2T, oldInitialR2T, initialR2T));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getImmediateData() {
		return immediateData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImmediateData(Boolean newImmediateData) {
		Boolean oldImmediateData = immediateData;
		immediateData = newImmediateData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION__IMMEDIATE_DATA, oldImmediateData, immediateData));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION__MAX_OUTSTANDING_R2T, oldMaxOutstandingR2T, maxOutstandingR2T));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION__MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH, oldMaxUnsolicitedFirstDataBurstLength, maxUnsolicitedFirstDataBurstLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION__MAX_DATA_BURST_LENGTH, oldMaxDataBurstLength, maxDataBurstLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDataSequenceInOrder() {
		return dataSequenceInOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataSequenceInOrder(Boolean newDataSequenceInOrder) {
		Boolean oldDataSequenceInOrder = dataSequenceInOrder;
		dataSequenceInOrder = newDataSequenceInOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION__DATA_SEQUENCE_IN_ORDER, oldDataSequenceInOrder, dataSequenceInOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDataPDUInOrder() {
		return dataPDUInOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataPDUInOrder(Boolean newDataPDUInOrder) {
		Boolean oldDataPDUInOrder = dataPDUInOrder;
		dataPDUInOrder = newDataPDUInOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION__DATA_PDU_IN_ORDER, oldDataPDUInOrder, dataPDUInOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getErrorRecoveryLevel() {
		return errorRecoveryLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorRecoveryLevel(Long newErrorRecoveryLevel) {
		Long oldErrorRecoveryLevel = errorRecoveryLevel;
		errorRecoveryLevel = newErrorRecoveryLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION__ERROR_RECOVERY_LEVEL, oldErrorRecoveryLevel, errorRecoveryLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION__MAX_CONNECTIONS_PER_SESSION, oldMaxConnectionsPerSession, maxConnectionsPerSession));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDefaultTimeToWait() {
		return defaultTimeToWait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultTimeToWait(Long newDefaultTimeToWait) {
		Long oldDefaultTimeToWait = defaultTimeToWait;
		defaultTimeToWait = newDefaultTimeToWait;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION__DEFAULT_TIME_TO_WAIT, oldDefaultTimeToWait, defaultTimeToWait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getDefaultTimeToRetain() {
		return defaultTimeToRetain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultTimeToRetain(Long newDefaultTimeToRetain) {
		Long oldDefaultTimeToRetain = defaultTimeToRetain;
		defaultTimeToRetain = newDefaultTimeToRetain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_ISCSI_SESSION__DEFAULT_TIME_TO_RETAIN, oldDefaultTimeToRetain, defaultTimeToRetain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_ISCSI_SESSION__SESSION_TYPE:
				return getSessionType();
			case CimPackage.CIM_ISCSI_SESSION__TSIH:
				return getTSIH();
			case CimPackage.CIM_ISCSI_SESSION__END_POINT_NAME:
				return getEndPointName();
			case CimPackage.CIM_ISCSI_SESSION__CURRENT_CONNECTIONS:
				return getCurrentConnections();
			case CimPackage.CIM_ISCSI_SESSION__INITIAL_R2T:
				return getInitialR2T();
			case CimPackage.CIM_ISCSI_SESSION__IMMEDIATE_DATA:
				return getImmediateData();
			case CimPackage.CIM_ISCSI_SESSION__MAX_OUTSTANDING_R2T:
				return getMaxOutstandingR2T();
			case CimPackage.CIM_ISCSI_SESSION__MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH:
				return getMaxUnsolicitedFirstDataBurstLength();
			case CimPackage.CIM_ISCSI_SESSION__MAX_DATA_BURST_LENGTH:
				return getMaxDataBurstLength();
			case CimPackage.CIM_ISCSI_SESSION__DATA_SEQUENCE_IN_ORDER:
				return getDataSequenceInOrder();
			case CimPackage.CIM_ISCSI_SESSION__DATA_PDU_IN_ORDER:
				return getDataPDUInOrder();
			case CimPackage.CIM_ISCSI_SESSION__ERROR_RECOVERY_LEVEL:
				return getErrorRecoveryLevel();
			case CimPackage.CIM_ISCSI_SESSION__MAX_CONNECTIONS_PER_SESSION:
				return getMaxConnectionsPerSession();
			case CimPackage.CIM_ISCSI_SESSION__DEFAULT_TIME_TO_WAIT:
				return getDefaultTimeToWait();
			case CimPackage.CIM_ISCSI_SESSION__DEFAULT_TIME_TO_RETAIN:
				return getDefaultTimeToRetain();
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
			case CimPackage.CIM_ISCSI_SESSION__SESSION_TYPE:
				setSessionType((Integer)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION__TSIH:
				setTSIH((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION__END_POINT_NAME:
				setEndPointName((String)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION__CURRENT_CONNECTIONS:
				setCurrentConnections((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION__INITIAL_R2T:
				setInitialR2T((Boolean)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION__IMMEDIATE_DATA:
				setImmediateData((Boolean)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION__MAX_OUTSTANDING_R2T:
				setMaxOutstandingR2T((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION__MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH:
				setMaxUnsolicitedFirstDataBurstLength((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION__MAX_DATA_BURST_LENGTH:
				setMaxDataBurstLength((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION__DATA_SEQUENCE_IN_ORDER:
				setDataSequenceInOrder((Boolean)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION__DATA_PDU_IN_ORDER:
				setDataPDUInOrder((Boolean)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION__ERROR_RECOVERY_LEVEL:
				setErrorRecoveryLevel((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION__MAX_CONNECTIONS_PER_SESSION:
				setMaxConnectionsPerSession((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION__DEFAULT_TIME_TO_WAIT:
				setDefaultTimeToWait((Long)newValue);
				return;
			case CimPackage.CIM_ISCSI_SESSION__DEFAULT_TIME_TO_RETAIN:
				setDefaultTimeToRetain((Long)newValue);
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
			case CimPackage.CIM_ISCSI_SESSION__SESSION_TYPE:
				setSessionType(SESSION_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION__TSIH:
				setTSIH(TSIH_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION__END_POINT_NAME:
				setEndPointName(END_POINT_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION__CURRENT_CONNECTIONS:
				setCurrentConnections(CURRENT_CONNECTIONS_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION__INITIAL_R2T:
				setInitialR2T(INITIAL_R2T_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION__IMMEDIATE_DATA:
				setImmediateData(IMMEDIATE_DATA_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION__MAX_OUTSTANDING_R2T:
				setMaxOutstandingR2T(MAX_OUTSTANDING_R2T_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION__MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH:
				setMaxUnsolicitedFirstDataBurstLength(MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION__MAX_DATA_BURST_LENGTH:
				setMaxDataBurstLength(MAX_DATA_BURST_LENGTH_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION__DATA_SEQUENCE_IN_ORDER:
				setDataSequenceInOrder(DATA_SEQUENCE_IN_ORDER_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION__DATA_PDU_IN_ORDER:
				setDataPDUInOrder(DATA_PDU_IN_ORDER_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION__ERROR_RECOVERY_LEVEL:
				setErrorRecoveryLevel(ERROR_RECOVERY_LEVEL_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION__MAX_CONNECTIONS_PER_SESSION:
				setMaxConnectionsPerSession(MAX_CONNECTIONS_PER_SESSION_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION__DEFAULT_TIME_TO_WAIT:
				setDefaultTimeToWait(DEFAULT_TIME_TO_WAIT_EDEFAULT);
				return;
			case CimPackage.CIM_ISCSI_SESSION__DEFAULT_TIME_TO_RETAIN:
				setDefaultTimeToRetain(DEFAULT_TIME_TO_RETAIN_EDEFAULT);
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
			case CimPackage.CIM_ISCSI_SESSION__SESSION_TYPE:
				return SESSION_TYPE_EDEFAULT == null ? sessionType != null : !SESSION_TYPE_EDEFAULT.equals(sessionType);
			case CimPackage.CIM_ISCSI_SESSION__TSIH:
				return TSIH_EDEFAULT == null ? tsih != null : !TSIH_EDEFAULT.equals(tsih);
			case CimPackage.CIM_ISCSI_SESSION__END_POINT_NAME:
				return END_POINT_NAME_EDEFAULT == null ? endPointName != null : !END_POINT_NAME_EDEFAULT.equals(endPointName);
			case CimPackage.CIM_ISCSI_SESSION__CURRENT_CONNECTIONS:
				return CURRENT_CONNECTIONS_EDEFAULT == null ? currentConnections != null : !CURRENT_CONNECTIONS_EDEFAULT.equals(currentConnections);
			case CimPackage.CIM_ISCSI_SESSION__INITIAL_R2T:
				return INITIAL_R2T_EDEFAULT == null ? initialR2T != null : !INITIAL_R2T_EDEFAULT.equals(initialR2T);
			case CimPackage.CIM_ISCSI_SESSION__IMMEDIATE_DATA:
				return IMMEDIATE_DATA_EDEFAULT == null ? immediateData != null : !IMMEDIATE_DATA_EDEFAULT.equals(immediateData);
			case CimPackage.CIM_ISCSI_SESSION__MAX_OUTSTANDING_R2T:
				return MAX_OUTSTANDING_R2T_EDEFAULT == null ? maxOutstandingR2T != null : !MAX_OUTSTANDING_R2T_EDEFAULT.equals(maxOutstandingR2T);
			case CimPackage.CIM_ISCSI_SESSION__MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH:
				return MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH_EDEFAULT == null ? maxUnsolicitedFirstDataBurstLength != null : !MAX_UNSOLICITED_FIRST_DATA_BURST_LENGTH_EDEFAULT.equals(maxUnsolicitedFirstDataBurstLength);
			case CimPackage.CIM_ISCSI_SESSION__MAX_DATA_BURST_LENGTH:
				return MAX_DATA_BURST_LENGTH_EDEFAULT == null ? maxDataBurstLength != null : !MAX_DATA_BURST_LENGTH_EDEFAULT.equals(maxDataBurstLength);
			case CimPackage.CIM_ISCSI_SESSION__DATA_SEQUENCE_IN_ORDER:
				return DATA_SEQUENCE_IN_ORDER_EDEFAULT == null ? dataSequenceInOrder != null : !DATA_SEQUENCE_IN_ORDER_EDEFAULT.equals(dataSequenceInOrder);
			case CimPackage.CIM_ISCSI_SESSION__DATA_PDU_IN_ORDER:
				return DATA_PDU_IN_ORDER_EDEFAULT == null ? dataPDUInOrder != null : !DATA_PDU_IN_ORDER_EDEFAULT.equals(dataPDUInOrder);
			case CimPackage.CIM_ISCSI_SESSION__ERROR_RECOVERY_LEVEL:
				return ERROR_RECOVERY_LEVEL_EDEFAULT == null ? errorRecoveryLevel != null : !ERROR_RECOVERY_LEVEL_EDEFAULT.equals(errorRecoveryLevel);
			case CimPackage.CIM_ISCSI_SESSION__MAX_CONNECTIONS_PER_SESSION:
				return MAX_CONNECTIONS_PER_SESSION_EDEFAULT == null ? maxConnectionsPerSession != null : !MAX_CONNECTIONS_PER_SESSION_EDEFAULT.equals(maxConnectionsPerSession);
			case CimPackage.CIM_ISCSI_SESSION__DEFAULT_TIME_TO_WAIT:
				return DEFAULT_TIME_TO_WAIT_EDEFAULT == null ? defaultTimeToWait != null : !DEFAULT_TIME_TO_WAIT_EDEFAULT.equals(defaultTimeToWait);
			case CimPackage.CIM_ISCSI_SESSION__DEFAULT_TIME_TO_RETAIN:
				return DEFAULT_TIME_TO_RETAIN_EDEFAULT == null ? defaultTimeToRetain != null : !DEFAULT_TIME_TO_RETAIN_EDEFAULT.equals(defaultTimeToRetain);
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
		result.append(" (SessionType: ");
		result.append(sessionType);
		result.append(", TSIH: ");
		result.append(tsih);
		result.append(", EndPointName: ");
		result.append(endPointName);
		result.append(", CurrentConnections: ");
		result.append(currentConnections);
		result.append(", InitialR2T: ");
		result.append(initialR2T);
		result.append(", ImmediateData: ");
		result.append(immediateData);
		result.append(", MaxOutstandingR2T: ");
		result.append(maxOutstandingR2T);
		result.append(", MaxUnsolicitedFirstDataBurstLength: ");
		result.append(maxUnsolicitedFirstDataBurstLength);
		result.append(", MaxDataBurstLength: ");
		result.append(maxDataBurstLength);
		result.append(", DataSequenceInOrder: ");
		result.append(dataSequenceInOrder);
		result.append(", DataPDUInOrder: ");
		result.append(dataPDUInOrder);
		result.append(", ErrorRecoveryLevel: ");
		result.append(errorRecoveryLevel);
		result.append(", MaxConnectionsPerSession: ");
		result.append(maxConnectionsPerSession);
		result.append(", DefaultTimeToWait: ");
		result.append(defaultTimeToWait);
		result.append(", DefaultTimeToRetain: ");
		result.append(defaultTimeToRetain);
		result.append(')');
		return result.toString();
	}

} //CIM_iSCSISessionImpl

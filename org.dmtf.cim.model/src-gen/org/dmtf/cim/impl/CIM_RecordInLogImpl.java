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

import org.dmtf.cim.CIM_LogRecord;
import org.dmtf.cim.CIM_MessageLog;
import org.dmtf.cim.CIM_RecordInLog;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Record In Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_RecordInLogImpl#getMessageLog <em>Message Log</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_RecordInLogImpl#getLogRecord <em>Log Record</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_RecordInLogImpl extends MinimalEObjectImpl.Container implements CIM_RecordInLog {
	/**
	 * The cached value of the '{@link #getMessageLog() <em>Message Log</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageLog()
	 * @generated
	 * @ordered
	 */
	protected CIM_MessageLog messageLog;

	/**
	 * The cached value of the '{@link #getLogRecord() <em>Log Record</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogRecord()
	 * @generated
	 * @ordered
	 */
	protected CIM_LogRecord logRecord;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_RecordInLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_RecordInLog();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_MessageLog getMessageLog() {
		if (messageLog != null && messageLog.eIsProxy()) {
			InternalEObject oldMessageLog = (InternalEObject)messageLog;
			messageLog = (CIM_MessageLog)eResolveProxy(oldMessageLog);
			if (messageLog != oldMessageLog) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_RECORD_IN_LOG__MESSAGE_LOG, oldMessageLog, messageLog));
			}
		}
		return messageLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_MessageLog basicGetMessageLog() {
		return messageLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageLog(CIM_MessageLog newMessageLog) {
		CIM_MessageLog oldMessageLog = messageLog;
		messageLog = newMessageLog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RECORD_IN_LOG__MESSAGE_LOG, oldMessageLog, messageLog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM_LogRecord getLogRecord() {
		if (logRecord != null && logRecord.eIsProxy()) {
			InternalEObject oldLogRecord = (InternalEObject)logRecord;
			logRecord = (CIM_LogRecord)eResolveProxy(oldLogRecord);
			if (logRecord != oldLogRecord) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CimPackage.CIM_RECORD_IN_LOG__LOG_RECORD, oldLogRecord, logRecord));
			}
		}
		return logRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CIM_LogRecord basicGetLogRecord() {
		return logRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogRecord(CIM_LogRecord newLogRecord) {
		CIM_LogRecord oldLogRecord = logRecord;
		logRecord = newLogRecord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_RECORD_IN_LOG__LOG_RECORD, oldLogRecord, logRecord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_RECORD_IN_LOG__MESSAGE_LOG:
				if (resolve) return getMessageLog();
				return basicGetMessageLog();
			case CimPackage.CIM_RECORD_IN_LOG__LOG_RECORD:
				if (resolve) return getLogRecord();
				return basicGetLogRecord();
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
			case CimPackage.CIM_RECORD_IN_LOG__MESSAGE_LOG:
				setMessageLog((CIM_MessageLog)newValue);
				return;
			case CimPackage.CIM_RECORD_IN_LOG__LOG_RECORD:
				setLogRecord((CIM_LogRecord)newValue);
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
			case CimPackage.CIM_RECORD_IN_LOG__MESSAGE_LOG:
				setMessageLog((CIM_MessageLog)null);
				return;
			case CimPackage.CIM_RECORD_IN_LOG__LOG_RECORD:
				setLogRecord((CIM_LogRecord)null);
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
			case CimPackage.CIM_RECORD_IN_LOG__MESSAGE_LOG:
				return messageLog != null;
			case CimPackage.CIM_RECORD_IN_LOG__LOG_RECORD:
				return logRecord != null;
		}
		return super.eIsSet(featureID);
	}

} //CIM_RecordInLogImpl

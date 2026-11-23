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
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Log Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogRecordImpl#getLogCreationClassName <em>Log Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogRecordImpl#getLogName <em>Log Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogRecordImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogRecordImpl#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogRecordImpl#getMessageTimestamp <em>Message Timestamp</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogRecordImpl#getDataFormat <em>Data Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LogRecordImpl extends CIM_RecordForLogImpl implements CIM_LogRecord {
	/**
	 * The default value of the '{@link #getLogCreationClassName() <em>Log Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogCreationClassName() <em>Log Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String logCreationClassName = LOG_CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogName() <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogName() <em>Log Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogName()
	 * @generated
	 * @ordered
	 */
	protected String logName = LOG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationClassName() <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationClassName()
	 * @generated
	 * @ordered
	 */
	protected String creationClassName = CREATION_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecordID() <em>Record ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordID()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordID() <em>Record ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordID()
	 * @generated
	 * @ordered
	 */
	protected String recordID = RECORD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageTimestamp() <em>Message Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageTimestamp() <em>Message Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTimestamp()
	 * @generated
	 * @ordered
	 */
	protected String messageTimestamp = MESSAGE_TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataFormat() <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataFormat() <em>Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataFormat()
	 * @generated
	 * @ordered
	 */
	protected String dataFormat = DATA_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LogRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LogRecord();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogCreationClassName() {
		return logCreationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogCreationClassName(String newLogCreationClassName) {
		String oldLogCreationClassName = logCreationClassName;
		logCreationClassName = newLogCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG_RECORD__LOG_CREATION_CLASS_NAME, oldLogCreationClassName, logCreationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogName() {
		return logName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogName(String newLogName) {
		String oldLogName = logName;
		logName = newLogName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG_RECORD__LOG_NAME, oldLogName, logName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationClassName() {
		return creationClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationClassName(String newCreationClassName) {
		String oldCreationClassName = creationClassName;
		creationClassName = newCreationClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG_RECORD__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecordID() {
		return recordID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordID(String newRecordID) {
		String oldRecordID = recordID;
		recordID = newRecordID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG_RECORD__RECORD_ID, oldRecordID, recordID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageTimestamp() {
		return messageTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageTimestamp(String newMessageTimestamp) {
		String oldMessageTimestamp = messageTimestamp;
		messageTimestamp = newMessageTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG_RECORD__MESSAGE_TIMESTAMP, oldMessageTimestamp, messageTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataFormat() {
		return dataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataFormat(String newDataFormat) {
		String oldDataFormat = dataFormat;
		dataFormat = newDataFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG_RECORD__DATA_FORMAT, oldDataFormat, dataFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOG_RECORD__LOG_CREATION_CLASS_NAME:
				return getLogCreationClassName();
			case CimPackage.CIM_LOG_RECORD__LOG_NAME:
				return getLogName();
			case CimPackage.CIM_LOG_RECORD__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_LOG_RECORD__RECORD_ID:
				return getRecordID();
			case CimPackage.CIM_LOG_RECORD__MESSAGE_TIMESTAMP:
				return getMessageTimestamp();
			case CimPackage.CIM_LOG_RECORD__DATA_FORMAT:
				return getDataFormat();
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
			case CimPackage.CIM_LOG_RECORD__LOG_CREATION_CLASS_NAME:
				setLogCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_LOG_RECORD__LOG_NAME:
				setLogName((String)newValue);
				return;
			case CimPackage.CIM_LOG_RECORD__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_LOG_RECORD__RECORD_ID:
				setRecordID((String)newValue);
				return;
			case CimPackage.CIM_LOG_RECORD__MESSAGE_TIMESTAMP:
				setMessageTimestamp((String)newValue);
				return;
			case CimPackage.CIM_LOG_RECORD__DATA_FORMAT:
				setDataFormat((String)newValue);
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
			case CimPackage.CIM_LOG_RECORD__LOG_CREATION_CLASS_NAME:
				setLogCreationClassName(LOG_CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LOG_RECORD__LOG_NAME:
				setLogName(LOG_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LOG_RECORD__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LOG_RECORD__RECORD_ID:
				setRecordID(RECORD_ID_EDEFAULT);
				return;
			case CimPackage.CIM_LOG_RECORD__MESSAGE_TIMESTAMP:
				setMessageTimestamp(MESSAGE_TIMESTAMP_EDEFAULT);
				return;
			case CimPackage.CIM_LOG_RECORD__DATA_FORMAT:
				setDataFormat(DATA_FORMAT_EDEFAULT);
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
			case CimPackage.CIM_LOG_RECORD__LOG_CREATION_CLASS_NAME:
				return LOG_CREATION_CLASS_NAME_EDEFAULT == null ? logCreationClassName != null : !LOG_CREATION_CLASS_NAME_EDEFAULT.equals(logCreationClassName);
			case CimPackage.CIM_LOG_RECORD__LOG_NAME:
				return LOG_NAME_EDEFAULT == null ? logName != null : !LOG_NAME_EDEFAULT.equals(logName);
			case CimPackage.CIM_LOG_RECORD__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_LOG_RECORD__RECORD_ID:
				return RECORD_ID_EDEFAULT == null ? recordID != null : !RECORD_ID_EDEFAULT.equals(recordID);
			case CimPackage.CIM_LOG_RECORD__MESSAGE_TIMESTAMP:
				return MESSAGE_TIMESTAMP_EDEFAULT == null ? messageTimestamp != null : !MESSAGE_TIMESTAMP_EDEFAULT.equals(messageTimestamp);
			case CimPackage.CIM_LOG_RECORD__DATA_FORMAT:
				return DATA_FORMAT_EDEFAULT == null ? dataFormat != null : !DATA_FORMAT_EDEFAULT.equals(dataFormat);
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
		result.append(" (LogCreationClassName: ");
		result.append(logCreationClassName);
		result.append(", LogName: ");
		result.append(logName);
		result.append(", CreationClassName: ");
		result.append(creationClassName);
		result.append(", RecordID: ");
		result.append(recordID);
		result.append(", MessageTimestamp: ");
		result.append(messageTimestamp);
		result.append(", DataFormat: ");
		result.append(dataFormat);
		result.append(')');
		return result.toString();
	}

} //CIM_LogRecordImpl

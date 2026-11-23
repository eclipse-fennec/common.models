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

import org.dmtf.cim.CIM_LogEntry;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Log Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogEntryImpl#getLogInstanceID <em>Log Instance ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogEntryImpl#getLogName <em>Log Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogEntryImpl#getRecordID <em>Record ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogEntryImpl#getCreationTimeStamp <em>Creation Time Stamp</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogEntryImpl#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogEntryImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogEntryImpl#getMessageArguments <em>Message Arguments</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_LogEntryImpl#getOwningEntity <em>Owning Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_LogEntryImpl extends CIM_RecordForLogImpl implements CIM_LogEntry {
	/**
	 * The default value of the '{@link #getLogInstanceID() <em>Log Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogInstanceID()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_INSTANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogInstanceID() <em>Log Instance ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogInstanceID()
	 * @generated
	 * @ordered
	 */
	protected String logInstanceID = LOG_INSTANCE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getCreationTimeStamp() <em>Creation Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATION_TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationTimeStamp() <em>Creation Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected String creationTimeStamp = CREATION_TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageID() <em>Message ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageID()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageID() <em>Message ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageID()
	 * @generated
	 * @ordered
	 */
	protected String messageID = MESSAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessageArguments() <em>Message Arguments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> messageArguments;

	/**
	 * The default value of the '{@link #getOwningEntity() <em>Owning Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningEntity()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNING_ENTITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwningEntity() <em>Owning Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningEntity()
	 * @generated
	 * @ordered
	 */
	protected String owningEntity = OWNING_ENTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_LogEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_LogEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogInstanceID() {
		return logInstanceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogInstanceID(String newLogInstanceID) {
		String oldLogInstanceID = logInstanceID;
		logInstanceID = newLogInstanceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG_ENTRY__LOG_INSTANCE_ID, oldLogInstanceID, logInstanceID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG_ENTRY__LOG_NAME, oldLogName, logName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG_ENTRY__RECORD_ID, oldRecordID, recordID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreationTimeStamp() {
		return creationTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreationTimeStamp(String newCreationTimeStamp) {
		String oldCreationTimeStamp = creationTimeStamp;
		creationTimeStamp = newCreationTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG_ENTRY__CREATION_TIME_STAMP, oldCreationTimeStamp, creationTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessageID() {
		return messageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageID(String newMessageID) {
		String oldMessageID = messageID;
		messageID = newMessageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG_ENTRY__MESSAGE_ID, oldMessageID, messageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG_ENTRY__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMessageArguments() {
		if (messageArguments == null) {
			messageArguments = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_LOG_ENTRY__MESSAGE_ARGUMENTS);
		}
		return messageArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwningEntity() {
		return owningEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningEntity(String newOwningEntity) {
		String oldOwningEntity = owningEntity;
		owningEntity = newOwningEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_LOG_ENTRY__OWNING_ENTITY, oldOwningEntity, owningEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_LOG_ENTRY__LOG_INSTANCE_ID:
				return getLogInstanceID();
			case CimPackage.CIM_LOG_ENTRY__LOG_NAME:
				return getLogName();
			case CimPackage.CIM_LOG_ENTRY__RECORD_ID:
				return getRecordID();
			case CimPackage.CIM_LOG_ENTRY__CREATION_TIME_STAMP:
				return getCreationTimeStamp();
			case CimPackage.CIM_LOG_ENTRY__MESSAGE_ID:
				return getMessageID();
			case CimPackage.CIM_LOG_ENTRY__MESSAGE:
				return getMessage();
			case CimPackage.CIM_LOG_ENTRY__MESSAGE_ARGUMENTS:
				return getMessageArguments();
			case CimPackage.CIM_LOG_ENTRY__OWNING_ENTITY:
				return getOwningEntity();
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
			case CimPackage.CIM_LOG_ENTRY__LOG_INSTANCE_ID:
				setLogInstanceID((String)newValue);
				return;
			case CimPackage.CIM_LOG_ENTRY__LOG_NAME:
				setLogName((String)newValue);
				return;
			case CimPackage.CIM_LOG_ENTRY__RECORD_ID:
				setRecordID((String)newValue);
				return;
			case CimPackage.CIM_LOG_ENTRY__CREATION_TIME_STAMP:
				setCreationTimeStamp((String)newValue);
				return;
			case CimPackage.CIM_LOG_ENTRY__MESSAGE_ID:
				setMessageID((String)newValue);
				return;
			case CimPackage.CIM_LOG_ENTRY__MESSAGE:
				setMessage((String)newValue);
				return;
			case CimPackage.CIM_LOG_ENTRY__MESSAGE_ARGUMENTS:
				getMessageArguments().clear();
				getMessageArguments().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_LOG_ENTRY__OWNING_ENTITY:
				setOwningEntity((String)newValue);
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
			case CimPackage.CIM_LOG_ENTRY__LOG_INSTANCE_ID:
				setLogInstanceID(LOG_INSTANCE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_LOG_ENTRY__LOG_NAME:
				setLogName(LOG_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_LOG_ENTRY__RECORD_ID:
				setRecordID(RECORD_ID_EDEFAULT);
				return;
			case CimPackage.CIM_LOG_ENTRY__CREATION_TIME_STAMP:
				setCreationTimeStamp(CREATION_TIME_STAMP_EDEFAULT);
				return;
			case CimPackage.CIM_LOG_ENTRY__MESSAGE_ID:
				setMessageID(MESSAGE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_LOG_ENTRY__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case CimPackage.CIM_LOG_ENTRY__MESSAGE_ARGUMENTS:
				getMessageArguments().clear();
				return;
			case CimPackage.CIM_LOG_ENTRY__OWNING_ENTITY:
				setOwningEntity(OWNING_ENTITY_EDEFAULT);
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
			case CimPackage.CIM_LOG_ENTRY__LOG_INSTANCE_ID:
				return LOG_INSTANCE_ID_EDEFAULT == null ? logInstanceID != null : !LOG_INSTANCE_ID_EDEFAULT.equals(logInstanceID);
			case CimPackage.CIM_LOG_ENTRY__LOG_NAME:
				return LOG_NAME_EDEFAULT == null ? logName != null : !LOG_NAME_EDEFAULT.equals(logName);
			case CimPackage.CIM_LOG_ENTRY__RECORD_ID:
				return RECORD_ID_EDEFAULT == null ? recordID != null : !RECORD_ID_EDEFAULT.equals(recordID);
			case CimPackage.CIM_LOG_ENTRY__CREATION_TIME_STAMP:
				return CREATION_TIME_STAMP_EDEFAULT == null ? creationTimeStamp != null : !CREATION_TIME_STAMP_EDEFAULT.equals(creationTimeStamp);
			case CimPackage.CIM_LOG_ENTRY__MESSAGE_ID:
				return MESSAGE_ID_EDEFAULT == null ? messageID != null : !MESSAGE_ID_EDEFAULT.equals(messageID);
			case CimPackage.CIM_LOG_ENTRY__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case CimPackage.CIM_LOG_ENTRY__MESSAGE_ARGUMENTS:
				return messageArguments != null && !messageArguments.isEmpty();
			case CimPackage.CIM_LOG_ENTRY__OWNING_ENTITY:
				return OWNING_ENTITY_EDEFAULT == null ? owningEntity != null : !OWNING_ENTITY_EDEFAULT.equals(owningEntity);
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
		result.append(" (LogInstanceID: ");
		result.append(logInstanceID);
		result.append(", LogName: ");
		result.append(logName);
		result.append(", RecordID: ");
		result.append(recordID);
		result.append(", CreationTimeStamp: ");
		result.append(creationTimeStamp);
		result.append(", MessageID: ");
		result.append(messageID);
		result.append(", Message: ");
		result.append(message);
		result.append(", MessageArguments: ");
		result.append(messageArguments);
		result.append(", OwningEntity: ");
		result.append(owningEntity);
		result.append(')');
		return result.toString();
	}

} //CIM_LogEntryImpl

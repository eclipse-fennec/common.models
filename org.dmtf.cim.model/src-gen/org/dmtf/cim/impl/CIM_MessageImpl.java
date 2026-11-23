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

import org.dmtf.cim.CIM_Message;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageImpl#getOwningEntity <em>Owning Entity</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageImpl#getMessageID <em>Message ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageImpl#getContinuedInNextMessage <em>Continued In Next Message</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_MessageImpl#getMessageArguments <em>Message Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_MessageImpl extends MinimalEObjectImpl.Container implements CIM_Message {
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
	 * The default value of the '{@link #getContinuedInNextMessage() <em>Continued In Next Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuedInNextMessage()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONTINUED_IN_NEXT_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContinuedInNextMessage() <em>Continued In Next Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuedInNextMessage()
	 * @generated
	 * @ordered
	 */
	protected Boolean continuedInNextMessage = CONTINUED_IN_NEXT_MESSAGE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Message();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE__OWNING_ENTITY, oldOwningEntity, owningEntity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE__MESSAGE_ID, oldMessageID, messageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getContinuedInNextMessage() {
		return continuedInNextMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContinuedInNextMessage(Boolean newContinuedInNextMessage) {
		Boolean oldContinuedInNextMessage = continuedInNextMessage;
		continuedInNextMessage = newContinuedInNextMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE__CONTINUED_IN_NEXT_MESSAGE, oldContinuedInNextMessage, continuedInNextMessage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_MESSAGE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMessageArguments() {
		if (messageArguments == null) {
			messageArguments = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_MESSAGE__MESSAGE_ARGUMENTS);
		}
		return messageArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_MESSAGE__OWNING_ENTITY:
				return getOwningEntity();
			case CimPackage.CIM_MESSAGE__MESSAGE_ID:
				return getMessageID();
			case CimPackage.CIM_MESSAGE__CONTINUED_IN_NEXT_MESSAGE:
				return getContinuedInNextMessage();
			case CimPackage.CIM_MESSAGE__MESSAGE:
				return getMessage();
			case CimPackage.CIM_MESSAGE__MESSAGE_ARGUMENTS:
				return getMessageArguments();
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
			case CimPackage.CIM_MESSAGE__OWNING_ENTITY:
				setOwningEntity((String)newValue);
				return;
			case CimPackage.CIM_MESSAGE__MESSAGE_ID:
				setMessageID((String)newValue);
				return;
			case CimPackage.CIM_MESSAGE__CONTINUED_IN_NEXT_MESSAGE:
				setContinuedInNextMessage((Boolean)newValue);
				return;
			case CimPackage.CIM_MESSAGE__MESSAGE:
				setMessage((String)newValue);
				return;
			case CimPackage.CIM_MESSAGE__MESSAGE_ARGUMENTS:
				getMessageArguments().clear();
				getMessageArguments().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_MESSAGE__OWNING_ENTITY:
				setOwningEntity(OWNING_ENTITY_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE__MESSAGE_ID:
				setMessageID(MESSAGE_ID_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE__CONTINUED_IN_NEXT_MESSAGE:
				setContinuedInNextMessage(CONTINUED_IN_NEXT_MESSAGE_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case CimPackage.CIM_MESSAGE__MESSAGE_ARGUMENTS:
				getMessageArguments().clear();
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
			case CimPackage.CIM_MESSAGE__OWNING_ENTITY:
				return OWNING_ENTITY_EDEFAULT == null ? owningEntity != null : !OWNING_ENTITY_EDEFAULT.equals(owningEntity);
			case CimPackage.CIM_MESSAGE__MESSAGE_ID:
				return MESSAGE_ID_EDEFAULT == null ? messageID != null : !MESSAGE_ID_EDEFAULT.equals(messageID);
			case CimPackage.CIM_MESSAGE__CONTINUED_IN_NEXT_MESSAGE:
				return CONTINUED_IN_NEXT_MESSAGE_EDEFAULT == null ? continuedInNextMessage != null : !CONTINUED_IN_NEXT_MESSAGE_EDEFAULT.equals(continuedInNextMessage);
			case CimPackage.CIM_MESSAGE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case CimPackage.CIM_MESSAGE__MESSAGE_ARGUMENTS:
				return messageArguments != null && !messageArguments.isEmpty();
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
		result.append(" (OwningEntity: ");
		result.append(owningEntity);
		result.append(", MessageID: ");
		result.append(messageID);
		result.append(", ContinuedInNextMessage: ");
		result.append(continuedInNextMessage);
		result.append(", Message: ");
		result.append(message);
		result.append(", MessageArguments: ");
		result.append(messageArguments);
		result.append(')');
		return result.toString();
	}

} //CIM_MessageImpl

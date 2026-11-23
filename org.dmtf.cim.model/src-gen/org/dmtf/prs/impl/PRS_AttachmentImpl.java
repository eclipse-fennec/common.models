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
package org.dmtf.prs.impl;

import org.dmtf.prs.PRS_Attachment;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_AttachmentImpl#getAttachmentReference <em>Attachment Reference</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AttachmentImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AttachmentImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AttachmentImpl#getAttachmentSize <em>Attachment Size</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AttachmentImpl#getAttachmentObject <em>Attachment Object</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AttachmentImpl#getAttachmentType <em>Attachment Type</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_AttachmentImpl#getAttachmentName <em>Attachment Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRS_AttachmentImpl extends PRS_ExchangeElementImpl implements PRS_Attachment {
	/**
	 * The default value of the '{@link #getAttachmentReference() <em>Attachment Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACHMENT_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttachmentReference() <em>Attachment Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentReference()
	 * @generated
	 * @ordered
	 */
	protected String attachmentReference = ATTACHMENT_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttachmentSize() <em>Attachment Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentSize()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACHMENT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttachmentSize() <em>Attachment Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentSize()
	 * @generated
	 * @ordered
	 */
	protected String attachmentSize = ATTACHMENT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttachmentObject() <em>Attachment Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentObject()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACHMENT_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttachmentObject() <em>Attachment Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentObject()
	 * @generated
	 * @ordered
	 */
	protected String attachmentObject = ATTACHMENT_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttachmentType() <em>Attachment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ATTACHMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttachmentType() <em>Attachment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentType()
	 * @generated
	 * @ordered
	 */
	protected Integer attachmentType = ATTACHMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttachmentName() <em>Attachment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACHMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttachmentName() <em>Attachment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentName()
	 * @generated
	 * @ordered
	 */
	protected String attachmentName = ATTACHMENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_AttachmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttachmentReference() {
		return attachmentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachmentReference(String newAttachmentReference) {
		String oldAttachmentReference = attachmentReference;
		attachmentReference = newAttachmentReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ATTACHMENT__ATTACHMENT_REFERENCE, oldAttachmentReference, attachmentReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ATTACHMENT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ATTACHMENT__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttachmentSize() {
		return attachmentSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachmentSize(String newAttachmentSize) {
		String oldAttachmentSize = attachmentSize;
		attachmentSize = newAttachmentSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ATTACHMENT__ATTACHMENT_SIZE, oldAttachmentSize, attachmentSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttachmentObject() {
		return attachmentObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachmentObject(String newAttachmentObject) {
		String oldAttachmentObject = attachmentObject;
		attachmentObject = newAttachmentObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ATTACHMENT__ATTACHMENT_OBJECT, oldAttachmentObject, attachmentObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAttachmentType() {
		return attachmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachmentType(Integer newAttachmentType) {
		Integer oldAttachmentType = attachmentType;
		attachmentType = newAttachmentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ATTACHMENT__ATTACHMENT_TYPE, oldAttachmentType, attachmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttachmentName() {
		return attachmentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachmentName(String newAttachmentName) {
		String oldAttachmentName = attachmentName;
		attachmentName = newAttachmentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_ATTACHMENT__ATTACHMENT_NAME, oldAttachmentName, attachmentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_REFERENCE:
				return getAttachmentReference();
			case PrsPackage.PRS_ATTACHMENT__PROTOCOL:
				return getProtocol();
			case PrsPackage.PRS_ATTACHMENT__FORMAT:
				return getFormat();
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_SIZE:
				return getAttachmentSize();
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_OBJECT:
				return getAttachmentObject();
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_TYPE:
				return getAttachmentType();
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_NAME:
				return getAttachmentName();
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
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_REFERENCE:
				setAttachmentReference((String)newValue);
				return;
			case PrsPackage.PRS_ATTACHMENT__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case PrsPackage.PRS_ATTACHMENT__FORMAT:
				setFormat((String)newValue);
				return;
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_SIZE:
				setAttachmentSize((String)newValue);
				return;
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_OBJECT:
				setAttachmentObject((String)newValue);
				return;
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_TYPE:
				setAttachmentType((Integer)newValue);
				return;
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_NAME:
				setAttachmentName((String)newValue);
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
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_REFERENCE:
				setAttachmentReference(ATTACHMENT_REFERENCE_EDEFAULT);
				return;
			case PrsPackage.PRS_ATTACHMENT__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case PrsPackage.PRS_ATTACHMENT__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_SIZE:
				setAttachmentSize(ATTACHMENT_SIZE_EDEFAULT);
				return;
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_OBJECT:
				setAttachmentObject(ATTACHMENT_OBJECT_EDEFAULT);
				return;
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_TYPE:
				setAttachmentType(ATTACHMENT_TYPE_EDEFAULT);
				return;
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_NAME:
				setAttachmentName(ATTACHMENT_NAME_EDEFAULT);
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
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_REFERENCE:
				return ATTACHMENT_REFERENCE_EDEFAULT == null ? attachmentReference != null : !ATTACHMENT_REFERENCE_EDEFAULT.equals(attachmentReference);
			case PrsPackage.PRS_ATTACHMENT__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case PrsPackage.PRS_ATTACHMENT__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_SIZE:
				return ATTACHMENT_SIZE_EDEFAULT == null ? attachmentSize != null : !ATTACHMENT_SIZE_EDEFAULT.equals(attachmentSize);
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_OBJECT:
				return ATTACHMENT_OBJECT_EDEFAULT == null ? attachmentObject != null : !ATTACHMENT_OBJECT_EDEFAULT.equals(attachmentObject);
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_TYPE:
				return ATTACHMENT_TYPE_EDEFAULT == null ? attachmentType != null : !ATTACHMENT_TYPE_EDEFAULT.equals(attachmentType);
			case PrsPackage.PRS_ATTACHMENT__ATTACHMENT_NAME:
				return ATTACHMENT_NAME_EDEFAULT == null ? attachmentName != null : !ATTACHMENT_NAME_EDEFAULT.equals(attachmentName);
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
		result.append(" (AttachmentReference: ");
		result.append(attachmentReference);
		result.append(", Protocol: ");
		result.append(protocol);
		result.append(", Format: ");
		result.append(format);
		result.append(", AttachmentSize: ");
		result.append(attachmentSize);
		result.append(", AttachmentObject: ");
		result.append(attachmentObject);
		result.append(", AttachmentType: ");
		result.append(attachmentType);
		result.append(", AttachmentName: ");
		result.append(attachmentName);
		result.append(')');
		return result.toString();
	}

} //PRS_AttachmentImpl

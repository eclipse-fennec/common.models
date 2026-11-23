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

import org.dmtf.cim.CIM_System;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemImpl#getNameFormat <em>Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemImpl#getPrimaryOwnerName <em>Primary Owner Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemImpl#getPrimaryOwnerContact <em>Primary Owner Contact</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemImpl#getOtherIdentifyingInfo <em>Other Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_SystemImpl#getIdentifyingDescriptions <em>Identifying Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CIM_SystemImpl extends CIM_AllocatedLogicalElementImpl implements CIM_System {
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
	 * The default value of the '{@link #getNameFormat() <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameFormat() <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameFormat()
	 * @generated
	 * @ordered
	 */
	protected String nameFormat = NAME_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryOwnerName() <em>Primary Owner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOwnerName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_OWNER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryOwnerName() <em>Primary Owner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOwnerName()
	 * @generated
	 * @ordered
	 */
	protected String primaryOwnerName = PRIMARY_OWNER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrimaryOwnerContact() <em>Primary Owner Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOwnerContact()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_OWNER_CONTACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimaryOwnerContact() <em>Primary Owner Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryOwnerContact()
	 * @generated
	 * @ordered
	 */
	protected String primaryOwnerContact = PRIMARY_OWNER_CONTACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<String> roles;

	/**
	 * The cached value of the '{@link #getOtherIdentifyingInfo() <em>Other Identifying Info</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherIdentifyingInfo()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherIdentifyingInfo;

	/**
	 * The cached value of the '{@link #getIdentifyingDescriptions() <em>Identifying Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifyingDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> identifyingDescriptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_System();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameFormat() {
		return nameFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameFormat(String newNameFormat) {
		String oldNameFormat = nameFormat;
		nameFormat = newNameFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM__NAME_FORMAT, oldNameFormat, nameFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryOwnerName() {
		return primaryOwnerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryOwnerName(String newPrimaryOwnerName) {
		String oldPrimaryOwnerName = primaryOwnerName;
		primaryOwnerName = newPrimaryOwnerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM__PRIMARY_OWNER_NAME, oldPrimaryOwnerName, primaryOwnerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryOwnerContact() {
		return primaryOwnerContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryOwnerContact(String newPrimaryOwnerContact) {
		String oldPrimaryOwnerContact = primaryOwnerContact;
		primaryOwnerContact = newPrimaryOwnerContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_SYSTEM__PRIMARY_OWNER_CONTACT, oldPrimaryOwnerContact, primaryOwnerContact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRoles() {
		if (roles == null) {
			roles = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SYSTEM__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherIdentifyingInfo() {
		if (otherIdentifyingInfo == null) {
			otherIdentifyingInfo = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SYSTEM__OTHER_IDENTIFYING_INFO);
		}
		return otherIdentifyingInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getIdentifyingDescriptions() {
		if (identifyingDescriptions == null) {
			identifyingDescriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_SYSTEM__IDENTIFYING_DESCRIPTIONS);
		}
		return identifyingDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_SYSTEM__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_SYSTEM__NAME_FORMAT:
				return getNameFormat();
			case CimPackage.CIM_SYSTEM__PRIMARY_OWNER_NAME:
				return getPrimaryOwnerName();
			case CimPackage.CIM_SYSTEM__PRIMARY_OWNER_CONTACT:
				return getPrimaryOwnerContact();
			case CimPackage.CIM_SYSTEM__ROLES:
				return getRoles();
			case CimPackage.CIM_SYSTEM__OTHER_IDENTIFYING_INFO:
				return getOtherIdentifyingInfo();
			case CimPackage.CIM_SYSTEM__IDENTIFYING_DESCRIPTIONS:
				return getIdentifyingDescriptions();
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
			case CimPackage.CIM_SYSTEM__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_SYSTEM__NAME_FORMAT:
				setNameFormat((String)newValue);
				return;
			case CimPackage.CIM_SYSTEM__PRIMARY_OWNER_NAME:
				setPrimaryOwnerName((String)newValue);
				return;
			case CimPackage.CIM_SYSTEM__PRIMARY_OWNER_CONTACT:
				setPrimaryOwnerContact((String)newValue);
				return;
			case CimPackage.CIM_SYSTEM__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SYSTEM__OTHER_IDENTIFYING_INFO:
				getOtherIdentifyingInfo().clear();
				getOtherIdentifyingInfo().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_SYSTEM__IDENTIFYING_DESCRIPTIONS:
				getIdentifyingDescriptions().clear();
				getIdentifyingDescriptions().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_SYSTEM__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SYSTEM__NAME_FORMAT:
				setNameFormat(NAME_FORMAT_EDEFAULT);
				return;
			case CimPackage.CIM_SYSTEM__PRIMARY_OWNER_NAME:
				setPrimaryOwnerName(PRIMARY_OWNER_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_SYSTEM__PRIMARY_OWNER_CONTACT:
				setPrimaryOwnerContact(PRIMARY_OWNER_CONTACT_EDEFAULT);
				return;
			case CimPackage.CIM_SYSTEM__ROLES:
				getRoles().clear();
				return;
			case CimPackage.CIM_SYSTEM__OTHER_IDENTIFYING_INFO:
				getOtherIdentifyingInfo().clear();
				return;
			case CimPackage.CIM_SYSTEM__IDENTIFYING_DESCRIPTIONS:
				getIdentifyingDescriptions().clear();
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
			case CimPackage.CIM_SYSTEM__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_SYSTEM__NAME_FORMAT:
				return NAME_FORMAT_EDEFAULT == null ? nameFormat != null : !NAME_FORMAT_EDEFAULT.equals(nameFormat);
			case CimPackage.CIM_SYSTEM__PRIMARY_OWNER_NAME:
				return PRIMARY_OWNER_NAME_EDEFAULT == null ? primaryOwnerName != null : !PRIMARY_OWNER_NAME_EDEFAULT.equals(primaryOwnerName);
			case CimPackage.CIM_SYSTEM__PRIMARY_OWNER_CONTACT:
				return PRIMARY_OWNER_CONTACT_EDEFAULT == null ? primaryOwnerContact != null : !PRIMARY_OWNER_CONTACT_EDEFAULT.equals(primaryOwnerContact);
			case CimPackage.CIM_SYSTEM__ROLES:
				return roles != null && !roles.isEmpty();
			case CimPackage.CIM_SYSTEM__OTHER_IDENTIFYING_INFO:
				return otherIdentifyingInfo != null && !otherIdentifyingInfo.isEmpty();
			case CimPackage.CIM_SYSTEM__IDENTIFYING_DESCRIPTIONS:
				return identifyingDescriptions != null && !identifyingDescriptions.isEmpty();
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
		result.append(" (CreationClassName: ");
		result.append(creationClassName);
		result.append(", NameFormat: ");
		result.append(nameFormat);
		result.append(", PrimaryOwnerName: ");
		result.append(primaryOwnerName);
		result.append(", PrimaryOwnerContact: ");
		result.append(primaryOwnerContact);
		result.append(", Roles: ");
		result.append(roles);
		result.append(", OtherIdentifyingInfo: ");
		result.append(otherIdentifyingInfo);
		result.append(", IdentifyingDescriptions: ");
		result.append(identifyingDescriptions);
		result.append(')');
		return result.toString();
	}

} //CIM_SystemImpl

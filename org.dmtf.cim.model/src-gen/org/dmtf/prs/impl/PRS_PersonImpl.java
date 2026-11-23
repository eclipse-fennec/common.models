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

import org.dmtf.prs.PRS_Person;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.impl.PRS_PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_PersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_PersonImpl#getSalutation <em>Salutation</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_PersonImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_PersonImpl#getContactType <em>Contact Type</em>}</li>
 *   <li>{@link org.dmtf.prs.impl.PRS_PersonImpl#getCommunicationMode <em>Communication Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRS_PersonImpl extends PRS_ContactItemImpl implements PRS_Person {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalutation() <em>Salutation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalutation()
	 * @generated
	 * @ordered
	 */
	protected static final String SALUTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalutation() <em>Salutation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalutation()
	 * @generated
	 * @ordered
	 */
	protected String salutation = SALUTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactType() <em>Contact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactType() <em>Contact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactType()
	 * @generated
	 * @ordered
	 */
	protected String contactType = CONTACT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommunicationMode() <em>Communication Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COMMUNICATION_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommunicationMode() <em>Communication Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMode()
	 * @generated
	 * @ordered
	 */
	protected Integer communicationMode = COMMUNICATION_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_PERSON__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_PERSON__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSalutation() {
		return salutation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalutation(String newSalutation) {
		String oldSalutation = salutation;
		salutation = newSalutation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_PERSON__SALUTATION, oldSalutation, salutation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_PERSON__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactType() {
		return contactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactType(String newContactType) {
		String oldContactType = contactType;
		contactType = newContactType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_PERSON__CONTACT_TYPE, oldContactType, contactType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCommunicationMode() {
		return communicationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationMode(Integer newCommunicationMode) {
		Integer oldCommunicationMode = communicationMode;
		communicationMode = newCommunicationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrsPackage.PRS_PERSON__COMMUNICATION_MODE, oldCommunicationMode, communicationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrsPackage.PRS_PERSON__FIRST_NAME:
				return getFirstName();
			case PrsPackage.PRS_PERSON__LAST_NAME:
				return getLastName();
			case PrsPackage.PRS_PERSON__SALUTATION:
				return getSalutation();
			case PrsPackage.PRS_PERSON__TITLE:
				return getTitle();
			case PrsPackage.PRS_PERSON__CONTACT_TYPE:
				return getContactType();
			case PrsPackage.PRS_PERSON__COMMUNICATION_MODE:
				return getCommunicationMode();
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
			case PrsPackage.PRS_PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case PrsPackage.PRS_PERSON__LAST_NAME:
				setLastName((String)newValue);
				return;
			case PrsPackage.PRS_PERSON__SALUTATION:
				setSalutation((String)newValue);
				return;
			case PrsPackage.PRS_PERSON__TITLE:
				setTitle((String)newValue);
				return;
			case PrsPackage.PRS_PERSON__CONTACT_TYPE:
				setContactType((String)newValue);
				return;
			case PrsPackage.PRS_PERSON__COMMUNICATION_MODE:
				setCommunicationMode((Integer)newValue);
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
			case PrsPackage.PRS_PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case PrsPackage.PRS_PERSON__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case PrsPackage.PRS_PERSON__SALUTATION:
				setSalutation(SALUTATION_EDEFAULT);
				return;
			case PrsPackage.PRS_PERSON__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PrsPackage.PRS_PERSON__CONTACT_TYPE:
				setContactType(CONTACT_TYPE_EDEFAULT);
				return;
			case PrsPackage.PRS_PERSON__COMMUNICATION_MODE:
				setCommunicationMode(COMMUNICATION_MODE_EDEFAULT);
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
			case PrsPackage.PRS_PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case PrsPackage.PRS_PERSON__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case PrsPackage.PRS_PERSON__SALUTATION:
				return SALUTATION_EDEFAULT == null ? salutation != null : !SALUTATION_EDEFAULT.equals(salutation);
			case PrsPackage.PRS_PERSON__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case PrsPackage.PRS_PERSON__CONTACT_TYPE:
				return CONTACT_TYPE_EDEFAULT == null ? contactType != null : !CONTACT_TYPE_EDEFAULT.equals(contactType);
			case PrsPackage.PRS_PERSON__COMMUNICATION_MODE:
				return COMMUNICATION_MODE_EDEFAULT == null ? communicationMode != null : !COMMUNICATION_MODE_EDEFAULT.equals(communicationMode);
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
		result.append(" (FirstName: ");
		result.append(firstName);
		result.append(", LastName: ");
		result.append(lastName);
		result.append(", Salutation: ");
		result.append(salutation);
		result.append(", Title: ");
		result.append(title);
		result.append(", ContactType: ");
		result.append(contactType);
		result.append(", CommunicationMode: ");
		result.append(communicationMode);
		result.append(')');
		return result.toString();
	}

} //PRS_PersonImpl

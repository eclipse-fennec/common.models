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

import org.dmtf.cim.CIM_UserContact;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM User Contact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_UserContactImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UserContactImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UserContactImpl#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UserContactImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UserContactImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UserContactImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UserContactImpl#getLocalityName <em>Locality Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UserContactImpl#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UserContactImpl#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UserContactImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_UserContactImpl#getTelephoneNumber <em>Telephone Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_UserContactImpl extends CIM_UserEntityImpl implements CIM_UserContact {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected static final String GIVEN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected String givenName = GIVEN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected String surname = SURNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected String mail = MAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected String userID = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalityName() <em>Locality Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalityName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCALITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalityName() <em>Locality Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalityName()
	 * @generated
	 * @ordered
	 */
	protected String localityName = LOCALITY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPostalAddress() <em>Postal Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<String> postalAddress;

	/**
	 * The default value of the '{@link #getStateOrProvince() <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateOrProvince()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_OR_PROVINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateOrProvince() <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateOrProvince()
	 * @generated
	 * @ordered
	 */
	protected String stateOrProvince = STATE_OR_PROVINCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelephoneNumber() <em>Telephone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEPHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelephoneNumber() <em>Telephone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String telephoneNumber = TELEPHONE_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_UserContactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_UserContact();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USER_CONTACT__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USER_CONTACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGivenName() {
		return givenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGivenName(String newGivenName) {
		String oldGivenName = givenName;
		givenName = newGivenName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USER_CONTACT__GIVEN_NAME, oldGivenName, givenName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSurname(String newSurname) {
		String oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USER_CONTACT__SURNAME, oldSurname, surname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMail() {
		return mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMail(String newMail) {
		String oldMail = mail;
		mail = newMail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USER_CONTACT__MAIL, oldMail, mail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserID(String newUserID) {
		String oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USER_CONTACT__USER_ID, oldUserID, userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalityName() {
		return localityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalityName(String newLocalityName) {
		String oldLocalityName = localityName;
		localityName = newLocalityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USER_CONTACT__LOCALITY_NAME, oldLocalityName, localityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPostalAddress() {
		if (postalAddress == null) {
			postalAddress = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_USER_CONTACT__POSTAL_ADDRESS);
		}
		return postalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStateOrProvince() {
		return stateOrProvince;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateOrProvince(String newStateOrProvince) {
		String oldStateOrProvince = stateOrProvince;
		stateOrProvince = newStateOrProvince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USER_CONTACT__STATE_OR_PROVINCE, oldStateOrProvince, stateOrProvince));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCode(String newPostalCode) {
		String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USER_CONTACT__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelephoneNumber(String newTelephoneNumber) {
		String oldTelephoneNumber = telephoneNumber;
		telephoneNumber = newTelephoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_USER_CONTACT__TELEPHONE_NUMBER, oldTelephoneNumber, telephoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_USER_CONTACT__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_USER_CONTACT__NAME:
				return getName();
			case CimPackage.CIM_USER_CONTACT__GIVEN_NAME:
				return getGivenName();
			case CimPackage.CIM_USER_CONTACT__SURNAME:
				return getSurname();
			case CimPackage.CIM_USER_CONTACT__MAIL:
				return getMail();
			case CimPackage.CIM_USER_CONTACT__USER_ID:
				return getUserID();
			case CimPackage.CIM_USER_CONTACT__LOCALITY_NAME:
				return getLocalityName();
			case CimPackage.CIM_USER_CONTACT__POSTAL_ADDRESS:
				return getPostalAddress();
			case CimPackage.CIM_USER_CONTACT__STATE_OR_PROVINCE:
				return getStateOrProvince();
			case CimPackage.CIM_USER_CONTACT__POSTAL_CODE:
				return getPostalCode();
			case CimPackage.CIM_USER_CONTACT__TELEPHONE_NUMBER:
				return getTelephoneNumber();
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
			case CimPackage.CIM_USER_CONTACT__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_USER_CONTACT__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_USER_CONTACT__GIVEN_NAME:
				setGivenName((String)newValue);
				return;
			case CimPackage.CIM_USER_CONTACT__SURNAME:
				setSurname((String)newValue);
				return;
			case CimPackage.CIM_USER_CONTACT__MAIL:
				setMail((String)newValue);
				return;
			case CimPackage.CIM_USER_CONTACT__USER_ID:
				setUserID((String)newValue);
				return;
			case CimPackage.CIM_USER_CONTACT__LOCALITY_NAME:
				setLocalityName((String)newValue);
				return;
			case CimPackage.CIM_USER_CONTACT__POSTAL_ADDRESS:
				getPostalAddress().clear();
				getPostalAddress().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_USER_CONTACT__STATE_OR_PROVINCE:
				setStateOrProvince((String)newValue);
				return;
			case CimPackage.CIM_USER_CONTACT__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case CimPackage.CIM_USER_CONTACT__TELEPHONE_NUMBER:
				setTelephoneNumber((String)newValue);
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
			case CimPackage.CIM_USER_CONTACT__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_USER_CONTACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_USER_CONTACT__GIVEN_NAME:
				setGivenName(GIVEN_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_USER_CONTACT__SURNAME:
				setSurname(SURNAME_EDEFAULT);
				return;
			case CimPackage.CIM_USER_CONTACT__MAIL:
				setMail(MAIL_EDEFAULT);
				return;
			case CimPackage.CIM_USER_CONTACT__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case CimPackage.CIM_USER_CONTACT__LOCALITY_NAME:
				setLocalityName(LOCALITY_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_USER_CONTACT__POSTAL_ADDRESS:
				getPostalAddress().clear();
				return;
			case CimPackage.CIM_USER_CONTACT__STATE_OR_PROVINCE:
				setStateOrProvince(STATE_OR_PROVINCE_EDEFAULT);
				return;
			case CimPackage.CIM_USER_CONTACT__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case CimPackage.CIM_USER_CONTACT__TELEPHONE_NUMBER:
				setTelephoneNumber(TELEPHONE_NUMBER_EDEFAULT);
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
			case CimPackage.CIM_USER_CONTACT__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_USER_CONTACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_USER_CONTACT__GIVEN_NAME:
				return GIVEN_NAME_EDEFAULT == null ? givenName != null : !GIVEN_NAME_EDEFAULT.equals(givenName);
			case CimPackage.CIM_USER_CONTACT__SURNAME:
				return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
			case CimPackage.CIM_USER_CONTACT__MAIL:
				return MAIL_EDEFAULT == null ? mail != null : !MAIL_EDEFAULT.equals(mail);
			case CimPackage.CIM_USER_CONTACT__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case CimPackage.CIM_USER_CONTACT__LOCALITY_NAME:
				return LOCALITY_NAME_EDEFAULT == null ? localityName != null : !LOCALITY_NAME_EDEFAULT.equals(localityName);
			case CimPackage.CIM_USER_CONTACT__POSTAL_ADDRESS:
				return postalAddress != null && !postalAddress.isEmpty();
			case CimPackage.CIM_USER_CONTACT__STATE_OR_PROVINCE:
				return STATE_OR_PROVINCE_EDEFAULT == null ? stateOrProvince != null : !STATE_OR_PROVINCE_EDEFAULT.equals(stateOrProvince);
			case CimPackage.CIM_USER_CONTACT__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
			case CimPackage.CIM_USER_CONTACT__TELEPHONE_NUMBER:
				return TELEPHONE_NUMBER_EDEFAULT == null ? telephoneNumber != null : !TELEPHONE_NUMBER_EDEFAULT.equals(telephoneNumber);
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
		result.append(", Name: ");
		result.append(name);
		result.append(", GivenName: ");
		result.append(givenName);
		result.append(", Surname: ");
		result.append(surname);
		result.append(", Mail: ");
		result.append(mail);
		result.append(", UserID: ");
		result.append(userID);
		result.append(", LocalityName: ");
		result.append(localityName);
		result.append(", PostalAddress: ");
		result.append(postalAddress);
		result.append(", StateOrProvince: ");
		result.append(stateOrProvince);
		result.append(", PostalCode: ");
		result.append(postalCode);
		result.append(", TelephoneNumber: ");
		result.append(telephoneNumber);
		result.append(')');
		return result.toString();
	}

} //CIM_UserContactImpl

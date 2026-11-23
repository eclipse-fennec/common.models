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

import org.dmtf.cim.CIM_Person;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersonImpl#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersonImpl#getCommonName <em>Common Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersonImpl#getEmployeeNumber <em>Employee Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersonImpl#getEmployeeType <em>Employee Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersonImpl#getFacsimileTelephoneNumber <em>Facsimile Telephone Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersonImpl#getHomePhone <em>Home Phone</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersonImpl#getHomePostalAddress <em>Home Postal Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersonImpl#getJPEGPhoto <em>JPEG Photo</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersonImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersonImpl#getMobile <em>Mobile</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersonImpl#getOU <em>OU</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersonImpl#getPager <em>Pager</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersonImpl#getPreferredLanguage <em>Preferred Language</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersonImpl#getSecretary <em>Secretary</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_PersonImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_PersonImpl extends CIM_UserContactImpl implements CIM_Person {
	/**
	 * The default value of the '{@link #getBusinessCategory() <em>Business Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String BUSINESS_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBusinessCategory() <em>Business Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessCategory()
	 * @generated
	 * @ordered
	 */
	protected String businessCategory = BUSINESS_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommonName() <em>Common Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommonName() <em>Common Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonName()
	 * @generated
	 * @ordered
	 */
	protected String commonName = COMMON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmployeeNumber() <em>Employee Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYEE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmployeeNumber() <em>Employee Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeNumber()
	 * @generated
	 * @ordered
	 */
	protected String employeeNumber = EMPLOYEE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmployeeType() <em>Employee Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeType()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYEE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmployeeType() <em>Employee Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeType()
	 * @generated
	 * @ordered
	 */
	protected String employeeType = EMPLOYEE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFacsimileTelephoneNumber() <em>Facsimile Telephone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacsimileTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String FACSIMILE_TELEPHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacsimileTelephoneNumber() <em>Facsimile Telephone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacsimileTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String facsimileTelephoneNumber = FACSIMILE_TELEPHONE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHomePhone() <em>Home Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomePhone()
	 * @generated
	 * @ordered
	 */
	protected static final String HOME_PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomePhone() <em>Home Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomePhone()
	 * @generated
	 * @ordered
	 */
	protected String homePhone = HOME_PHONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHomePostalAddress() <em>Home Postal Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomePostalAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<String> homePostalAddress;

	/**
	 * The default value of the '{@link #getJPEGPhoto() <em>JPEG Photo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJPEGPhoto()
	 * @generated
	 * @ordered
	 */
	protected static final String JPEG_PHOTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJPEGPhoto() <em>JPEG Photo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJPEGPhoto()
	 * @generated
	 * @ordered
	 */
	protected String jpegPhoto = JPEG_PHOTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getManager() <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected String manager = MANAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMobile() <em>Mobile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobile()
	 * @generated
	 * @ordered
	 */
	protected static final String MOBILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMobile() <em>Mobile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobile()
	 * @generated
	 * @ordered
	 */
	protected String mobile = MOBILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOU() <em>OU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOU()
	 * @generated
	 * @ordered
	 */
	protected static final String OU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOU() <em>OU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOU()
	 * @generated
	 * @ordered
	 */
	protected String ou = OU_EDEFAULT;

	/**
	 * The default value of the '{@link #getPager() <em>Pager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPager()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPager() <em>Pager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPager()
	 * @generated
	 * @ordered
	 */
	protected String pager = PAGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreferredLanguage() <em>Preferred Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFERRED_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferredLanguage() <em>Preferred Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredLanguage()
	 * @generated
	 * @ordered
	 */
	protected String preferredLanguage = PREFERRED_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecretary() <em>Secretary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretary()
	 * @generated
	 * @ordered
	 */
	protected static final String SECRETARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecretary() <em>Secretary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretary()
	 * @generated
	 * @ordered
	 */
	protected String secretary = SECRETARY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_Person();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBusinessCategory() {
		return businessCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusinessCategory(String newBusinessCategory) {
		String oldBusinessCategory = businessCategory;
		businessCategory = newBusinessCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSON__BUSINESS_CATEGORY, oldBusinessCategory, businessCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommonName() {
		return commonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommonName(String newCommonName) {
		String oldCommonName = commonName;
		commonName = newCommonName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSON__COMMON_NAME, oldCommonName, commonName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployeeNumber(String newEmployeeNumber) {
		String oldEmployeeNumber = employeeNumber;
		employeeNumber = newEmployeeNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSON__EMPLOYEE_NUMBER, oldEmployeeNumber, employeeNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmployeeType() {
		return employeeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmployeeType(String newEmployeeType) {
		String oldEmployeeType = employeeType;
		employeeType = newEmployeeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSON__EMPLOYEE_TYPE, oldEmployeeType, employeeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacsimileTelephoneNumber() {
		return facsimileTelephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacsimileTelephoneNumber(String newFacsimileTelephoneNumber) {
		String oldFacsimileTelephoneNumber = facsimileTelephoneNumber;
		facsimileTelephoneNumber = newFacsimileTelephoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSON__FACSIMILE_TELEPHONE_NUMBER, oldFacsimileTelephoneNumber, facsimileTelephoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHomePhone() {
		return homePhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHomePhone(String newHomePhone) {
		String oldHomePhone = homePhone;
		homePhone = newHomePhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSON__HOME_PHONE, oldHomePhone, homePhone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getHomePostalAddress() {
		if (homePostalAddress == null) {
			homePostalAddress = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_PERSON__HOME_POSTAL_ADDRESS);
		}
		return homePostalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJPEGPhoto() {
		return jpegPhoto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJPEGPhoto(String newJPEGPhoto) {
		String oldJPEGPhoto = jpegPhoto;
		jpegPhoto = newJPEGPhoto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSON__JPEG_PHOTO, oldJPEGPhoto, jpegPhoto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManager(String newManager) {
		String oldManager = manager;
		manager = newManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSON__MANAGER, oldManager, manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMobile() {
		return mobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMobile(String newMobile) {
		String oldMobile = mobile;
		mobile = newMobile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSON__MOBILE, oldMobile, mobile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOU() {
		return ou;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOU(String newOU) {
		String oldOU = ou;
		ou = newOU;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSON__OU, oldOU, ou));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPager() {
		return pager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPager(String newPager) {
		String oldPager = pager;
		pager = newPager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSON__PAGER, oldPager, pager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreferredLanguage(String newPreferredLanguage) {
		String oldPreferredLanguage = preferredLanguage;
		preferredLanguage = newPreferredLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSON__PREFERRED_LANGUAGE, oldPreferredLanguage, preferredLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecretary() {
		return secretary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecretary(String newSecretary) {
		String oldSecretary = secretary;
		secretary = newSecretary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSON__SECRETARY, oldSecretary, secretary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_PERSON__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_PERSON__BUSINESS_CATEGORY:
				return getBusinessCategory();
			case CimPackage.CIM_PERSON__COMMON_NAME:
				return getCommonName();
			case CimPackage.CIM_PERSON__EMPLOYEE_NUMBER:
				return getEmployeeNumber();
			case CimPackage.CIM_PERSON__EMPLOYEE_TYPE:
				return getEmployeeType();
			case CimPackage.CIM_PERSON__FACSIMILE_TELEPHONE_NUMBER:
				return getFacsimileTelephoneNumber();
			case CimPackage.CIM_PERSON__HOME_PHONE:
				return getHomePhone();
			case CimPackage.CIM_PERSON__HOME_POSTAL_ADDRESS:
				return getHomePostalAddress();
			case CimPackage.CIM_PERSON__JPEG_PHOTO:
				return getJPEGPhoto();
			case CimPackage.CIM_PERSON__MANAGER:
				return getManager();
			case CimPackage.CIM_PERSON__MOBILE:
				return getMobile();
			case CimPackage.CIM_PERSON__OU:
				return getOU();
			case CimPackage.CIM_PERSON__PAGER:
				return getPager();
			case CimPackage.CIM_PERSON__PREFERRED_LANGUAGE:
				return getPreferredLanguage();
			case CimPackage.CIM_PERSON__SECRETARY:
				return getSecretary();
			case CimPackage.CIM_PERSON__TITLE:
				return getTitle();
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
			case CimPackage.CIM_PERSON__BUSINESS_CATEGORY:
				setBusinessCategory((String)newValue);
				return;
			case CimPackage.CIM_PERSON__COMMON_NAME:
				setCommonName((String)newValue);
				return;
			case CimPackage.CIM_PERSON__EMPLOYEE_NUMBER:
				setEmployeeNumber((String)newValue);
				return;
			case CimPackage.CIM_PERSON__EMPLOYEE_TYPE:
				setEmployeeType((String)newValue);
				return;
			case CimPackage.CIM_PERSON__FACSIMILE_TELEPHONE_NUMBER:
				setFacsimileTelephoneNumber((String)newValue);
				return;
			case CimPackage.CIM_PERSON__HOME_PHONE:
				setHomePhone((String)newValue);
				return;
			case CimPackage.CIM_PERSON__HOME_POSTAL_ADDRESS:
				getHomePostalAddress().clear();
				getHomePostalAddress().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_PERSON__JPEG_PHOTO:
				setJPEGPhoto((String)newValue);
				return;
			case CimPackage.CIM_PERSON__MANAGER:
				setManager((String)newValue);
				return;
			case CimPackage.CIM_PERSON__MOBILE:
				setMobile((String)newValue);
				return;
			case CimPackage.CIM_PERSON__OU:
				setOU((String)newValue);
				return;
			case CimPackage.CIM_PERSON__PAGER:
				setPager((String)newValue);
				return;
			case CimPackage.CIM_PERSON__PREFERRED_LANGUAGE:
				setPreferredLanguage((String)newValue);
				return;
			case CimPackage.CIM_PERSON__SECRETARY:
				setSecretary((String)newValue);
				return;
			case CimPackage.CIM_PERSON__TITLE:
				setTitle((String)newValue);
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
			case CimPackage.CIM_PERSON__BUSINESS_CATEGORY:
				setBusinessCategory(BUSINESS_CATEGORY_EDEFAULT);
				return;
			case CimPackage.CIM_PERSON__COMMON_NAME:
				setCommonName(COMMON_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_PERSON__EMPLOYEE_NUMBER:
				setEmployeeNumber(EMPLOYEE_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PERSON__EMPLOYEE_TYPE:
				setEmployeeType(EMPLOYEE_TYPE_EDEFAULT);
				return;
			case CimPackage.CIM_PERSON__FACSIMILE_TELEPHONE_NUMBER:
				setFacsimileTelephoneNumber(FACSIMILE_TELEPHONE_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_PERSON__HOME_PHONE:
				setHomePhone(HOME_PHONE_EDEFAULT);
				return;
			case CimPackage.CIM_PERSON__HOME_POSTAL_ADDRESS:
				getHomePostalAddress().clear();
				return;
			case CimPackage.CIM_PERSON__JPEG_PHOTO:
				setJPEGPhoto(JPEG_PHOTO_EDEFAULT);
				return;
			case CimPackage.CIM_PERSON__MANAGER:
				setManager(MANAGER_EDEFAULT);
				return;
			case CimPackage.CIM_PERSON__MOBILE:
				setMobile(MOBILE_EDEFAULT);
				return;
			case CimPackage.CIM_PERSON__OU:
				setOU(OU_EDEFAULT);
				return;
			case CimPackage.CIM_PERSON__PAGER:
				setPager(PAGER_EDEFAULT);
				return;
			case CimPackage.CIM_PERSON__PREFERRED_LANGUAGE:
				setPreferredLanguage(PREFERRED_LANGUAGE_EDEFAULT);
				return;
			case CimPackage.CIM_PERSON__SECRETARY:
				setSecretary(SECRETARY_EDEFAULT);
				return;
			case CimPackage.CIM_PERSON__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case CimPackage.CIM_PERSON__BUSINESS_CATEGORY:
				return BUSINESS_CATEGORY_EDEFAULT == null ? businessCategory != null : !BUSINESS_CATEGORY_EDEFAULT.equals(businessCategory);
			case CimPackage.CIM_PERSON__COMMON_NAME:
				return COMMON_NAME_EDEFAULT == null ? commonName != null : !COMMON_NAME_EDEFAULT.equals(commonName);
			case CimPackage.CIM_PERSON__EMPLOYEE_NUMBER:
				return EMPLOYEE_NUMBER_EDEFAULT == null ? employeeNumber != null : !EMPLOYEE_NUMBER_EDEFAULT.equals(employeeNumber);
			case CimPackage.CIM_PERSON__EMPLOYEE_TYPE:
				return EMPLOYEE_TYPE_EDEFAULT == null ? employeeType != null : !EMPLOYEE_TYPE_EDEFAULT.equals(employeeType);
			case CimPackage.CIM_PERSON__FACSIMILE_TELEPHONE_NUMBER:
				return FACSIMILE_TELEPHONE_NUMBER_EDEFAULT == null ? facsimileTelephoneNumber != null : !FACSIMILE_TELEPHONE_NUMBER_EDEFAULT.equals(facsimileTelephoneNumber);
			case CimPackage.CIM_PERSON__HOME_PHONE:
				return HOME_PHONE_EDEFAULT == null ? homePhone != null : !HOME_PHONE_EDEFAULT.equals(homePhone);
			case CimPackage.CIM_PERSON__HOME_POSTAL_ADDRESS:
				return homePostalAddress != null && !homePostalAddress.isEmpty();
			case CimPackage.CIM_PERSON__JPEG_PHOTO:
				return JPEG_PHOTO_EDEFAULT == null ? jpegPhoto != null : !JPEG_PHOTO_EDEFAULT.equals(jpegPhoto);
			case CimPackage.CIM_PERSON__MANAGER:
				return MANAGER_EDEFAULT == null ? manager != null : !MANAGER_EDEFAULT.equals(manager);
			case CimPackage.CIM_PERSON__MOBILE:
				return MOBILE_EDEFAULT == null ? mobile != null : !MOBILE_EDEFAULT.equals(mobile);
			case CimPackage.CIM_PERSON__OU:
				return OU_EDEFAULT == null ? ou != null : !OU_EDEFAULT.equals(ou);
			case CimPackage.CIM_PERSON__PAGER:
				return PAGER_EDEFAULT == null ? pager != null : !PAGER_EDEFAULT.equals(pager);
			case CimPackage.CIM_PERSON__PREFERRED_LANGUAGE:
				return PREFERRED_LANGUAGE_EDEFAULT == null ? preferredLanguage != null : !PREFERRED_LANGUAGE_EDEFAULT.equals(preferredLanguage);
			case CimPackage.CIM_PERSON__SECRETARY:
				return SECRETARY_EDEFAULT == null ? secretary != null : !SECRETARY_EDEFAULT.equals(secretary);
			case CimPackage.CIM_PERSON__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (BusinessCategory: ");
		result.append(businessCategory);
		result.append(", CommonName: ");
		result.append(commonName);
		result.append(", EmployeeNumber: ");
		result.append(employeeNumber);
		result.append(", EmployeeType: ");
		result.append(employeeType);
		result.append(", FacsimileTelephoneNumber: ");
		result.append(facsimileTelephoneNumber);
		result.append(", HomePhone: ");
		result.append(homePhone);
		result.append(", HomePostalAddress: ");
		result.append(homePostalAddress);
		result.append(", JPEGPhoto: ");
		result.append(jpegPhoto);
		result.append(", Manager: ");
		result.append(manager);
		result.append(", Mobile: ");
		result.append(mobile);
		result.append(", OU: ");
		result.append(ou);
		result.append(", Pager: ");
		result.append(pager);
		result.append(", PreferredLanguage: ");
		result.append(preferredLanguage);
		result.append(", Secretary: ");
		result.append(secretary);
		result.append(", Title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //CIM_PersonImpl

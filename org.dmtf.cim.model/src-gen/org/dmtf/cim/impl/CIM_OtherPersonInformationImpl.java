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

import org.dmtf.cim.CIM_OtherPersonInformation;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Other Person Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getAudio <em>Audio</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getCarLicense <em>Car License</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getCommonName <em>Common Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getCountryName <em>Country Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getDepartmentNumber <em>Department Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getDestinationIndicator <em>Destination Indicator</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getEmployeeNumber <em>Employee Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getEmployeeType <em>Employee Type</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getFacsimileTelephoneNumber <em>Facsimile Telephone Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getGenerationQualifier <em>Generation Qualifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getHomeFax <em>Home Fax</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getHomePhone <em>Home Phone</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getHomePostalAddress <em>Home Postal Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getInitials <em>Initials</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getInternationaliSDNNumber <em>Internationali SDN Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getJPEGPhoto <em>JPEG Photo</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getLabeledURI <em>Labeled URI</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getLocalityName <em>Locality Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getMobile <em>Mobile</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getOrganizationalStatus <em>Organizational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getOtherMailbox <em>Other Mailbox</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getOU <em>OU</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getPager <em>Pager</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getPersonalTitle <em>Personal Title</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getPhysicalDeliveryOfficeName <em>Physical Delivery Office Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getPostOfficeBox <em>Post Office Box</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getPreferredDeliveryMethod <em>Preferred Delivery Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getPreferredLanguage <em>Preferred Language</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getRegisteredAddress <em>Registered Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getSecretary <em>Secretary</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getSeeAlso <em>See Also</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getTeletexTerminalIdentifier <em>Teletex Terminal Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getTelexNumber <em>Telex Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getThumbnailLogo <em>Thumbnail Logo</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getThumbnailPhoto <em>Thumbnail Photo</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getUniqueIdentifier <em>Unique Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getUserCertificate <em>User Certificate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getUserPassword <em>User Password</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getUserPKCS12 <em>User PKCS12</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getUserSMIMECertificate <em>User SMIME Certificate</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getX121Address <em>X121 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherPersonInformationImpl#getX500UniqueIdentifier <em>X500 Unique Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OtherPersonInformationImpl extends CIM_ManagedElementImpl implements CIM_OtherPersonInformation {
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
	 * The cached value of the '{@link #getObjectClass() <em>Object Class</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClass()
	 * @generated
	 * @ordered
	 */
	protected EList<String> objectClass;

	/**
	 * The cached value of the '{@link #getAudio() <em>Audio</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudio()
	 * @generated
	 * @ordered
	 */
	protected EList<String> audio;

	/**
	 * The cached value of the '{@link #getBusinessCategory() <em>Business Category</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<String> businessCategory;

	/**
	 * The cached value of the '{@link #getCarLicense() <em>Car License</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarLicense()
	 * @generated
	 * @ordered
	 */
	protected EList<String> carLicense;

	/**
	 * The cached value of the '{@link #getCommonName() <em>Common Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> commonName;

	/**
	 * The cached value of the '{@link #getCountryName() <em>Country Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> countryName;

	/**
	 * The cached value of the '{@link #getDepartmentNumber() <em>Department Number</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartmentNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<String> departmentNumber;

	/**
	 * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> descriptions;

	/**
	 * The cached value of the '{@link #getDestinationIndicator() <em>Destination Indicator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<String> destinationIndicator;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> displayName;

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
	 * The cached value of the '{@link #getEmployeeType() <em>Employee Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> employeeType;

	/**
	 * The cached value of the '{@link #getFacsimileTelephoneNumber() <em>Facsimile Telephone Number</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacsimileTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<String> facsimileTelephoneNumber;

	/**
	 * The cached value of the '{@link #getGenerationQualifier() <em>Generation Qualifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<String> generationQualifier;

	/**
	 * The cached value of the '{@link #getGivenName() <em>Given Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> givenName;

	/**
	 * The cached value of the '{@link #getHomeFax() <em>Home Fax</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomeFax()
	 * @generated
	 * @ordered
	 */
	protected EList<String> homeFax;

	/**
	 * The cached value of the '{@link #getHomePhone() <em>Home Phone</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomePhone()
	 * @generated
	 * @ordered
	 */
	protected EList<String> homePhone;

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
	 * The cached value of the '{@link #getInitials() <em>Initials</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitials()
	 * @generated
	 * @ordered
	 */
	protected EList<String> initials;

	/**
	 * The cached value of the '{@link #getInternationaliSDNNumber() <em>Internationali SDN Number</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternationaliSDNNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<String> internationaliSDNNumber;

	/**
	 * The cached value of the '{@link #getJPEGPhoto() <em>JPEG Photo</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJPEGPhoto()
	 * @generated
	 * @ordered
	 */
	protected EList<String> jpegPhoto;

	/**
	 * The cached value of the '{@link #getLabeledURI() <em>Labeled URI</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabeledURI()
	 * @generated
	 * @ordered
	 */
	protected EList<String> labeledURI;

	/**
	 * The cached value of the '{@link #getLocalityName() <em>Locality Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalityName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> localityName;

	/**
	 * The cached value of the '{@link #getMail() <em>Mail</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mail;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected EList<String> manager;

	/**
	 * The cached value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> middleName;

	/**
	 * The cached value of the '{@link #getMobile() <em>Mobile</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobile()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mobile;

	/**
	 * The cached value of the '{@link #getOrganizationName() <em>Organization Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> organizationName;

	/**
	 * The cached value of the '{@link #getOrganizationalStatus() <em>Organizational Status</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationalStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<String> organizationalStatus;

	/**
	 * The cached value of the '{@link #getOtherMailbox() <em>Other Mailbox</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMailbox()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otherMailbox;

	/**
	 * The cached value of the '{@link #getOU() <em>OU</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOU()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ou;

	/**
	 * The cached value of the '{@link #getPager() <em>Pager</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPager()
	 * @generated
	 * @ordered
	 */
	protected EList<String> pager;

	/**
	 * The cached value of the '{@link #getPersonalTitle() <em>Personal Title</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<String> personalTitle;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected EList<String> photo;

	/**
	 * The cached value of the '{@link #getPhysicalDeliveryOfficeName() <em>Physical Delivery Office Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalDeliveryOfficeName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> physicalDeliveryOfficeName;

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
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected EList<String> postalCode;

	/**
	 * The cached value of the '{@link #getPostOfficeBox() <em>Post Office Box</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostOfficeBox()
	 * @generated
	 * @ordered
	 */
	protected EList<String> postOfficeBox;

	/**
	 * The default value of the '{@link #getPreferredDeliveryMethod() <em>Preferred Delivery Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredDeliveryMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFERRED_DELIVERY_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreferredDeliveryMethod() <em>Preferred Delivery Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredDeliveryMethod()
	 * @generated
	 * @ordered
	 */
	protected String preferredDeliveryMethod = PREFERRED_DELIVERY_METHOD_EDEFAULT;

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
	 * The cached value of the '{@link #getRegisteredAddress() <em>Registered Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<String> registeredAddress;

	/**
	 * The cached value of the '{@link #getRoomNumber() <em>Room Number</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<String> roomNumber;

	/**
	 * The cached value of the '{@link #getSecretary() <em>Secretary</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretary()
	 * @generated
	 * @ordered
	 */
	protected EList<String> secretary;

	/**
	 * The cached value of the '{@link #getSeeAlso() <em>See Also</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeeAlso()
	 * @generated
	 * @ordered
	 */
	protected EList<String> seeAlso;

	/**
	 * The cached value of the '{@link #getStateOrProvince() <em>State Or Province</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateOrProvince()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stateOrProvince;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected EList<String> street;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected EList<String> surname;

	/**
	 * The cached value of the '{@link #getTelephoneNumber() <em>Telephone Number</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<String> telephoneNumber;

	/**
	 * The cached value of the '{@link #getTeletexTerminalIdentifier() <em>Teletex Terminal Identifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeletexTerminalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<String> teletexTerminalIdentifier;

	/**
	 * The cached value of the '{@link #getTelexNumber() <em>Telex Number</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelexNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<String> telexNumber;

	/**
	 * The cached value of the '{@link #getThumbnailLogo() <em>Thumbnail Logo</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnailLogo()
	 * @generated
	 * @ordered
	 */
	protected EList<String> thumbnailLogo;

	/**
	 * The cached value of the '{@link #getThumbnailPhoto() <em>Thumbnail Photo</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnailPhoto()
	 * @generated
	 * @ordered
	 */
	protected EList<String> thumbnailPhoto;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected EList<String> title;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected EList<String> userID;

	/**
	 * The cached value of the '{@link #getUniqueIdentifier() <em>Unique Identifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<String> uniqueIdentifier;

	/**
	 * The cached value of the '{@link #getUserCertificate() <em>User Certificate</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserCertificate()
	 * @generated
	 * @ordered
	 */
	protected EList<String> userCertificate;

	/**
	 * The cached value of the '{@link #getUserPassword() <em>User Password</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPassword()
	 * @generated
	 * @ordered
	 */
	protected EList<String> userPassword;

	/**
	 * The cached value of the '{@link #getUserPKCS12() <em>User PKCS12</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPKCS12()
	 * @generated
	 * @ordered
	 */
	protected EList<String> userPKCS12;

	/**
	 * The cached value of the '{@link #getUserSMIMECertificate() <em>User SMIME Certificate</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserSMIMECertificate()
	 * @generated
	 * @ordered
	 */
	protected EList<String> userSMIMECertificate;

	/**
	 * The cached value of the '{@link #getX121Address() <em>X121 Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX121Address()
	 * @generated
	 * @ordered
	 */
	protected EList<String> x121Address;

	/**
	 * The cached value of the '{@link #getX500UniqueIdentifier() <em>X500 Unique Identifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX500UniqueIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<String> x500UniqueIdentifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OtherPersonInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OtherPersonInformation();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OTHER_PERSON_INFORMATION__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OTHER_PERSON_INFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getObjectClass() {
		if (objectClass == null) {
			objectClass = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__OBJECT_CLASS);
		}
		return objectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAudio() {
		if (audio == null) {
			audio = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__AUDIO);
		}
		return audio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getBusinessCategory() {
		if (businessCategory == null) {
			businessCategory = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__BUSINESS_CATEGORY);
		}
		return businessCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCarLicense() {
		if (carLicense == null) {
			carLicense = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__CAR_LICENSE);
		}
		return carLicense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCommonName() {
		if (commonName == null) {
			commonName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__COMMON_NAME);
		}
		return commonName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCountryName() {
		if (countryName == null) {
			countryName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__COUNTRY_NAME);
		}
		return countryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDepartmentNumber() {
		if (departmentNumber == null) {
			departmentNumber = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__DEPARTMENT_NUMBER);
		}
		return departmentNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDescriptions() {
		if (descriptions == null) {
			descriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__DESCRIPTIONS);
		}
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDestinationIndicator() {
		if (destinationIndicator == null) {
			destinationIndicator = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__DESTINATION_INDICATOR);
		}
		return destinationIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDisplayName() {
		if (displayName == null) {
			displayName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__DISPLAY_NAME);
		}
		return displayName;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OTHER_PERSON_INFORMATION__EMPLOYEE_NUMBER, oldEmployeeNumber, employeeNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEmployeeType() {
		if (employeeType == null) {
			employeeType = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__EMPLOYEE_TYPE);
		}
		return employeeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFacsimileTelephoneNumber() {
		if (facsimileTelephoneNumber == null) {
			facsimileTelephoneNumber = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__FACSIMILE_TELEPHONE_NUMBER);
		}
		return facsimileTelephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getGenerationQualifier() {
		if (generationQualifier == null) {
			generationQualifier = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__GENERATION_QUALIFIER);
		}
		return generationQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getGivenName() {
		if (givenName == null) {
			givenName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__GIVEN_NAME);
		}
		return givenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getHomeFax() {
		if (homeFax == null) {
			homeFax = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__HOME_FAX);
		}
		return homeFax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getHomePhone() {
		if (homePhone == null) {
			homePhone = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__HOME_PHONE);
		}
		return homePhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getHomePostalAddress() {
		if (homePostalAddress == null) {
			homePostalAddress = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__HOME_POSTAL_ADDRESS);
		}
		return homePostalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInitials() {
		if (initials == null) {
			initials = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__INITIALS);
		}
		return initials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInternationaliSDNNumber() {
		if (internationaliSDNNumber == null) {
			internationaliSDNNumber = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__INTERNATIONALI_SDN_NUMBER);
		}
		return internationaliSDNNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getJPEGPhoto() {
		if (jpegPhoto == null) {
			jpegPhoto = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__JPEG_PHOTO);
		}
		return jpegPhoto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLabeledURI() {
		if (labeledURI == null) {
			labeledURI = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__LABELED_URI);
		}
		return labeledURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLocalityName() {
		if (localityName == null) {
			localityName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__LOCALITY_NAME);
		}
		return localityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMail() {
		if (mail == null) {
			mail = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__MAIL);
		}
		return mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getManager() {
		if (manager == null) {
			manager = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__MANAGER);
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMiddleName() {
		if (middleName == null) {
			middleName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__MIDDLE_NAME);
		}
		return middleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMobile() {
		if (mobile == null) {
			mobile = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__MOBILE);
		}
		return mobile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOrganizationName() {
		if (organizationName == null) {
			organizationName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__ORGANIZATION_NAME);
		}
		return organizationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOrganizationalStatus() {
		if (organizationalStatus == null) {
			organizationalStatus = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__ORGANIZATIONAL_STATUS);
		}
		return organizationalStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherMailbox() {
		if (otherMailbox == null) {
			otherMailbox = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__OTHER_MAILBOX);
		}
		return otherMailbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOU() {
		if (ou == null) {
			ou = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__OU);
		}
		return ou;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPager() {
		if (pager == null) {
			pager = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__PAGER);
		}
		return pager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPersonalTitle() {
		if (personalTitle == null) {
			personalTitle = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__PERSONAL_TITLE);
		}
		return personalTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPhoto() {
		if (photo == null) {
			photo = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__PHOTO);
		}
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPhysicalDeliveryOfficeName() {
		if (physicalDeliveryOfficeName == null) {
			physicalDeliveryOfficeName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__PHYSICAL_DELIVERY_OFFICE_NAME);
		}
		return physicalDeliveryOfficeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPostalAddress() {
		if (postalAddress == null) {
			postalAddress = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__POSTAL_ADDRESS);
		}
		return postalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPostalCode() {
		if (postalCode == null) {
			postalCode = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__POSTAL_CODE);
		}
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPostOfficeBox() {
		if (postOfficeBox == null) {
			postOfficeBox = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__POST_OFFICE_BOX);
		}
		return postOfficeBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPreferredDeliveryMethod() {
		return preferredDeliveryMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreferredDeliveryMethod(String newPreferredDeliveryMethod) {
		String oldPreferredDeliveryMethod = preferredDeliveryMethod;
		preferredDeliveryMethod = newPreferredDeliveryMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OTHER_PERSON_INFORMATION__PREFERRED_DELIVERY_METHOD, oldPreferredDeliveryMethod, preferredDeliveryMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OTHER_PERSON_INFORMATION__PREFERRED_LANGUAGE, oldPreferredLanguage, preferredLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRegisteredAddress() {
		if (registeredAddress == null) {
			registeredAddress = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__REGISTERED_ADDRESS);
		}
		return registeredAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRoomNumber() {
		if (roomNumber == null) {
			roomNumber = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__ROOM_NUMBER);
		}
		return roomNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSecretary() {
		if (secretary == null) {
			secretary = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__SECRETARY);
		}
		return secretary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSeeAlso() {
		if (seeAlso == null) {
			seeAlso = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__SEE_ALSO);
		}
		return seeAlso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStateOrProvince() {
		if (stateOrProvince == null) {
			stateOrProvince = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__STATE_OR_PROVINCE);
		}
		return stateOrProvince;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getStreet() {
		if (street == null) {
			street = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__STREET);
		}
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSurname() {
		if (surname == null) {
			surname = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__SURNAME);
		}
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTelephoneNumber() {
		if (telephoneNumber == null) {
			telephoneNumber = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__TELEPHONE_NUMBER);
		}
		return telephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTeletexTerminalIdentifier() {
		if (teletexTerminalIdentifier == null) {
			teletexTerminalIdentifier = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__TELETEX_TERMINAL_IDENTIFIER);
		}
		return teletexTerminalIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTelexNumber() {
		if (telexNumber == null) {
			telexNumber = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__TELEX_NUMBER);
		}
		return telexNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getThumbnailLogo() {
		if (thumbnailLogo == null) {
			thumbnailLogo = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__THUMBNAIL_LOGO);
		}
		return thumbnailLogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getThumbnailPhoto() {
		if (thumbnailPhoto == null) {
			thumbnailPhoto = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__THUMBNAIL_PHOTO);
		}
		return thumbnailPhoto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTitle() {
		if (title == null) {
			title = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__TITLE);
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getUserID() {
		if (userID == null) {
			userID = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_ID);
		}
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getUniqueIdentifier() {
		if (uniqueIdentifier == null) {
			uniqueIdentifier = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__UNIQUE_IDENTIFIER);
		}
		return uniqueIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getUserCertificate() {
		if (userCertificate == null) {
			userCertificate = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_CERTIFICATE);
		}
		return userCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getUserPassword() {
		if (userPassword == null) {
			userPassword = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_PASSWORD);
		}
		return userPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getUserPKCS12() {
		if (userPKCS12 == null) {
			userPKCS12 = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_PKCS12);
		}
		return userPKCS12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getUserSMIMECertificate() {
		if (userSMIMECertificate == null) {
			userSMIMECertificate = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_SMIME_CERTIFICATE);
		}
		return userSMIMECertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getX121Address() {
		if (x121Address == null) {
			x121Address = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__X121_ADDRESS);
		}
		return x121Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getX500UniqueIdentifier() {
		if (x500UniqueIdentifier == null) {
			x500UniqueIdentifier = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_PERSON_INFORMATION__X500_UNIQUE_IDENTIFIER);
		}
		return x500UniqueIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__NAME:
				return getName();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__OBJECT_CLASS:
				return getObjectClass();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__AUDIO:
				return getAudio();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__BUSINESS_CATEGORY:
				return getBusinessCategory();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__CAR_LICENSE:
				return getCarLicense();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__COMMON_NAME:
				return getCommonName();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__COUNTRY_NAME:
				return getCountryName();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DEPARTMENT_NUMBER:
				return getDepartmentNumber();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DESCRIPTIONS:
				return getDescriptions();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DESTINATION_INDICATOR:
				return getDestinationIndicator();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DISPLAY_NAME:
				return getDisplayName();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__EMPLOYEE_NUMBER:
				return getEmployeeNumber();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__EMPLOYEE_TYPE:
				return getEmployeeType();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__FACSIMILE_TELEPHONE_NUMBER:
				return getFacsimileTelephoneNumber();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__GENERATION_QUALIFIER:
				return getGenerationQualifier();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__GIVEN_NAME:
				return getGivenName();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__HOME_FAX:
				return getHomeFax();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__HOME_PHONE:
				return getHomePhone();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__HOME_POSTAL_ADDRESS:
				return getHomePostalAddress();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__INITIALS:
				return getInitials();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__INTERNATIONALI_SDN_NUMBER:
				return getInternationaliSDNNumber();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__JPEG_PHOTO:
				return getJPEGPhoto();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__LABELED_URI:
				return getLabeledURI();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__LOCALITY_NAME:
				return getLocalityName();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MAIL:
				return getMail();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MANAGER:
				return getManager();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MIDDLE_NAME:
				return getMiddleName();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MOBILE:
				return getMobile();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__ORGANIZATION_NAME:
				return getOrganizationName();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__ORGANIZATIONAL_STATUS:
				return getOrganizationalStatus();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__OTHER_MAILBOX:
				return getOtherMailbox();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__OU:
				return getOU();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PAGER:
				return getPager();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PERSONAL_TITLE:
				return getPersonalTitle();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PHOTO:
				return getPhoto();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PHYSICAL_DELIVERY_OFFICE_NAME:
				return getPhysicalDeliveryOfficeName();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__POSTAL_ADDRESS:
				return getPostalAddress();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__POSTAL_CODE:
				return getPostalCode();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__POST_OFFICE_BOX:
				return getPostOfficeBox();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PREFERRED_DELIVERY_METHOD:
				return getPreferredDeliveryMethod();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PREFERRED_LANGUAGE:
				return getPreferredLanguage();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__REGISTERED_ADDRESS:
				return getRegisteredAddress();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__ROOM_NUMBER:
				return getRoomNumber();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__SECRETARY:
				return getSecretary();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__SEE_ALSO:
				return getSeeAlso();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__STATE_OR_PROVINCE:
				return getStateOrProvince();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__STREET:
				return getStreet();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__SURNAME:
				return getSurname();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TELEPHONE_NUMBER:
				return getTelephoneNumber();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TELETEX_TERMINAL_IDENTIFIER:
				return getTeletexTerminalIdentifier();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TELEX_NUMBER:
				return getTelexNumber();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__THUMBNAIL_LOGO:
				return getThumbnailLogo();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__THUMBNAIL_PHOTO:
				return getThumbnailPhoto();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TITLE:
				return getTitle();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_ID:
				return getUserID();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__UNIQUE_IDENTIFIER:
				return getUniqueIdentifier();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_CERTIFICATE:
				return getUserCertificate();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_PASSWORD:
				return getUserPassword();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_PKCS12:
				return getUserPKCS12();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_SMIME_CERTIFICATE:
				return getUserSMIMECertificate();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__X121_ADDRESS:
				return getX121Address();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__X500_UNIQUE_IDENTIFIER:
				return getX500UniqueIdentifier();
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
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__OBJECT_CLASS:
				getObjectClass().clear();
				getObjectClass().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__AUDIO:
				getAudio().clear();
				getAudio().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__BUSINESS_CATEGORY:
				getBusinessCategory().clear();
				getBusinessCategory().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__CAR_LICENSE:
				getCarLicense().clear();
				getCarLicense().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__COMMON_NAME:
				getCommonName().clear();
				getCommonName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__COUNTRY_NAME:
				getCountryName().clear();
				getCountryName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DEPARTMENT_NUMBER:
				getDepartmentNumber().clear();
				getDepartmentNumber().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DESCRIPTIONS:
				getDescriptions().clear();
				getDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DESTINATION_INDICATOR:
				getDestinationIndicator().clear();
				getDestinationIndicator().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DISPLAY_NAME:
				getDisplayName().clear();
				getDisplayName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__EMPLOYEE_NUMBER:
				setEmployeeNumber((String)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__EMPLOYEE_TYPE:
				getEmployeeType().clear();
				getEmployeeType().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__FACSIMILE_TELEPHONE_NUMBER:
				getFacsimileTelephoneNumber().clear();
				getFacsimileTelephoneNumber().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__GENERATION_QUALIFIER:
				getGenerationQualifier().clear();
				getGenerationQualifier().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__GIVEN_NAME:
				getGivenName().clear();
				getGivenName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__HOME_FAX:
				getHomeFax().clear();
				getHomeFax().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__HOME_PHONE:
				getHomePhone().clear();
				getHomePhone().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__HOME_POSTAL_ADDRESS:
				getHomePostalAddress().clear();
				getHomePostalAddress().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__INITIALS:
				getInitials().clear();
				getInitials().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__INTERNATIONALI_SDN_NUMBER:
				getInternationaliSDNNumber().clear();
				getInternationaliSDNNumber().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__JPEG_PHOTO:
				getJPEGPhoto().clear();
				getJPEGPhoto().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__LABELED_URI:
				getLabeledURI().clear();
				getLabeledURI().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__LOCALITY_NAME:
				getLocalityName().clear();
				getLocalityName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MAIL:
				getMail().clear();
				getMail().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MANAGER:
				getManager().clear();
				getManager().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MIDDLE_NAME:
				getMiddleName().clear();
				getMiddleName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MOBILE:
				getMobile().clear();
				getMobile().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__ORGANIZATION_NAME:
				getOrganizationName().clear();
				getOrganizationName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__ORGANIZATIONAL_STATUS:
				getOrganizationalStatus().clear();
				getOrganizationalStatus().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__OTHER_MAILBOX:
				getOtherMailbox().clear();
				getOtherMailbox().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__OU:
				getOU().clear();
				getOU().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PAGER:
				getPager().clear();
				getPager().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PERSONAL_TITLE:
				getPersonalTitle().clear();
				getPersonalTitle().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PHOTO:
				getPhoto().clear();
				getPhoto().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PHYSICAL_DELIVERY_OFFICE_NAME:
				getPhysicalDeliveryOfficeName().clear();
				getPhysicalDeliveryOfficeName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__POSTAL_ADDRESS:
				getPostalAddress().clear();
				getPostalAddress().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__POSTAL_CODE:
				getPostalCode().clear();
				getPostalCode().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__POST_OFFICE_BOX:
				getPostOfficeBox().clear();
				getPostOfficeBox().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PREFERRED_DELIVERY_METHOD:
				setPreferredDeliveryMethod((String)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PREFERRED_LANGUAGE:
				setPreferredLanguage((String)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__REGISTERED_ADDRESS:
				getRegisteredAddress().clear();
				getRegisteredAddress().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__ROOM_NUMBER:
				getRoomNumber().clear();
				getRoomNumber().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__SECRETARY:
				getSecretary().clear();
				getSecretary().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__SEE_ALSO:
				getSeeAlso().clear();
				getSeeAlso().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__STATE_OR_PROVINCE:
				getStateOrProvince().clear();
				getStateOrProvince().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__STREET:
				getStreet().clear();
				getStreet().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__SURNAME:
				getSurname().clear();
				getSurname().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				getTelephoneNumber().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TELETEX_TERMINAL_IDENTIFIER:
				getTeletexTerminalIdentifier().clear();
				getTeletexTerminalIdentifier().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TELEX_NUMBER:
				getTelexNumber().clear();
				getTelexNumber().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__THUMBNAIL_LOGO:
				getThumbnailLogo().clear();
				getThumbnailLogo().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__THUMBNAIL_PHOTO:
				getThumbnailPhoto().clear();
				getThumbnailPhoto().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TITLE:
				getTitle().clear();
				getTitle().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_ID:
				getUserID().clear();
				getUserID().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__UNIQUE_IDENTIFIER:
				getUniqueIdentifier().clear();
				getUniqueIdentifier().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_CERTIFICATE:
				getUserCertificate().clear();
				getUserCertificate().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_PASSWORD:
				getUserPassword().clear();
				getUserPassword().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_PKCS12:
				getUserPKCS12().clear();
				getUserPKCS12().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_SMIME_CERTIFICATE:
				getUserSMIMECertificate().clear();
				getUserSMIMECertificate().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__X121_ADDRESS:
				getX121Address().clear();
				getX121Address().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__X500_UNIQUE_IDENTIFIER:
				getX500UniqueIdentifier().clear();
				getX500UniqueIdentifier().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__OBJECT_CLASS:
				getObjectClass().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__AUDIO:
				getAudio().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__BUSINESS_CATEGORY:
				getBusinessCategory().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__CAR_LICENSE:
				getCarLicense().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__COMMON_NAME:
				getCommonName().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__COUNTRY_NAME:
				getCountryName().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DEPARTMENT_NUMBER:
				getDepartmentNumber().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DESCRIPTIONS:
				getDescriptions().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DESTINATION_INDICATOR:
				getDestinationIndicator().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DISPLAY_NAME:
				getDisplayName().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__EMPLOYEE_NUMBER:
				setEmployeeNumber(EMPLOYEE_NUMBER_EDEFAULT);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__EMPLOYEE_TYPE:
				getEmployeeType().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__FACSIMILE_TELEPHONE_NUMBER:
				getFacsimileTelephoneNumber().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__GENERATION_QUALIFIER:
				getGenerationQualifier().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__GIVEN_NAME:
				getGivenName().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__HOME_FAX:
				getHomeFax().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__HOME_PHONE:
				getHomePhone().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__HOME_POSTAL_ADDRESS:
				getHomePostalAddress().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__INITIALS:
				getInitials().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__INTERNATIONALI_SDN_NUMBER:
				getInternationaliSDNNumber().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__JPEG_PHOTO:
				getJPEGPhoto().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__LABELED_URI:
				getLabeledURI().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__LOCALITY_NAME:
				getLocalityName().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MAIL:
				getMail().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MANAGER:
				getManager().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MIDDLE_NAME:
				getMiddleName().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MOBILE:
				getMobile().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__ORGANIZATION_NAME:
				getOrganizationName().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__ORGANIZATIONAL_STATUS:
				getOrganizationalStatus().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__OTHER_MAILBOX:
				getOtherMailbox().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__OU:
				getOU().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PAGER:
				getPager().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PERSONAL_TITLE:
				getPersonalTitle().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PHOTO:
				getPhoto().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PHYSICAL_DELIVERY_OFFICE_NAME:
				getPhysicalDeliveryOfficeName().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__POSTAL_ADDRESS:
				getPostalAddress().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__POSTAL_CODE:
				getPostalCode().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__POST_OFFICE_BOX:
				getPostOfficeBox().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PREFERRED_DELIVERY_METHOD:
				setPreferredDeliveryMethod(PREFERRED_DELIVERY_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PREFERRED_LANGUAGE:
				setPreferredLanguage(PREFERRED_LANGUAGE_EDEFAULT);
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__REGISTERED_ADDRESS:
				getRegisteredAddress().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__ROOM_NUMBER:
				getRoomNumber().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__SECRETARY:
				getSecretary().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__SEE_ALSO:
				getSeeAlso().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__STATE_OR_PROVINCE:
				getStateOrProvince().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__STREET:
				getStreet().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__SURNAME:
				getSurname().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TELETEX_TERMINAL_IDENTIFIER:
				getTeletexTerminalIdentifier().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TELEX_NUMBER:
				getTelexNumber().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__THUMBNAIL_LOGO:
				getThumbnailLogo().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__THUMBNAIL_PHOTO:
				getThumbnailPhoto().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TITLE:
				getTitle().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_ID:
				getUserID().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__UNIQUE_IDENTIFIER:
				getUniqueIdentifier().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_CERTIFICATE:
				getUserCertificate().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_PASSWORD:
				getUserPassword().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_PKCS12:
				getUserPKCS12().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_SMIME_CERTIFICATE:
				getUserSMIMECertificate().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__X121_ADDRESS:
				getX121Address().clear();
				return;
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__X500_UNIQUE_IDENTIFIER:
				getX500UniqueIdentifier().clear();
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
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__OBJECT_CLASS:
				return objectClass != null && !objectClass.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__AUDIO:
				return audio != null && !audio.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__BUSINESS_CATEGORY:
				return businessCategory != null && !businessCategory.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__CAR_LICENSE:
				return carLicense != null && !carLicense.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__COMMON_NAME:
				return commonName != null && !commonName.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__COUNTRY_NAME:
				return countryName != null && !countryName.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DEPARTMENT_NUMBER:
				return departmentNumber != null && !departmentNumber.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DESCRIPTIONS:
				return descriptions != null && !descriptions.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DESTINATION_INDICATOR:
				return destinationIndicator != null && !destinationIndicator.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__DISPLAY_NAME:
				return displayName != null && !displayName.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__EMPLOYEE_NUMBER:
				return EMPLOYEE_NUMBER_EDEFAULT == null ? employeeNumber != null : !EMPLOYEE_NUMBER_EDEFAULT.equals(employeeNumber);
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__EMPLOYEE_TYPE:
				return employeeType != null && !employeeType.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__FACSIMILE_TELEPHONE_NUMBER:
				return facsimileTelephoneNumber != null && !facsimileTelephoneNumber.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__GENERATION_QUALIFIER:
				return generationQualifier != null && !generationQualifier.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__GIVEN_NAME:
				return givenName != null && !givenName.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__HOME_FAX:
				return homeFax != null && !homeFax.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__HOME_PHONE:
				return homePhone != null && !homePhone.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__HOME_POSTAL_ADDRESS:
				return homePostalAddress != null && !homePostalAddress.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__INITIALS:
				return initials != null && !initials.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__INTERNATIONALI_SDN_NUMBER:
				return internationaliSDNNumber != null && !internationaliSDNNumber.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__JPEG_PHOTO:
				return jpegPhoto != null && !jpegPhoto.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__LABELED_URI:
				return labeledURI != null && !labeledURI.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__LOCALITY_NAME:
				return localityName != null && !localityName.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MAIL:
				return mail != null && !mail.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MANAGER:
				return manager != null && !manager.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MIDDLE_NAME:
				return middleName != null && !middleName.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__MOBILE:
				return mobile != null && !mobile.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__ORGANIZATION_NAME:
				return organizationName != null && !organizationName.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__ORGANIZATIONAL_STATUS:
				return organizationalStatus != null && !organizationalStatus.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__OTHER_MAILBOX:
				return otherMailbox != null && !otherMailbox.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__OU:
				return ou != null && !ou.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PAGER:
				return pager != null && !pager.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PERSONAL_TITLE:
				return personalTitle != null && !personalTitle.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PHOTO:
				return photo != null && !photo.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PHYSICAL_DELIVERY_OFFICE_NAME:
				return physicalDeliveryOfficeName != null && !physicalDeliveryOfficeName.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__POSTAL_ADDRESS:
				return postalAddress != null && !postalAddress.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__POSTAL_CODE:
				return postalCode != null && !postalCode.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__POST_OFFICE_BOX:
				return postOfficeBox != null && !postOfficeBox.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PREFERRED_DELIVERY_METHOD:
				return PREFERRED_DELIVERY_METHOD_EDEFAULT == null ? preferredDeliveryMethod != null : !PREFERRED_DELIVERY_METHOD_EDEFAULT.equals(preferredDeliveryMethod);
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__PREFERRED_LANGUAGE:
				return PREFERRED_LANGUAGE_EDEFAULT == null ? preferredLanguage != null : !PREFERRED_LANGUAGE_EDEFAULT.equals(preferredLanguage);
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__REGISTERED_ADDRESS:
				return registeredAddress != null && !registeredAddress.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__ROOM_NUMBER:
				return roomNumber != null && !roomNumber.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__SECRETARY:
				return secretary != null && !secretary.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__SEE_ALSO:
				return seeAlso != null && !seeAlso.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__STATE_OR_PROVINCE:
				return stateOrProvince != null && !stateOrProvince.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__STREET:
				return street != null && !street.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__SURNAME:
				return surname != null && !surname.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TELEPHONE_NUMBER:
				return telephoneNumber != null && !telephoneNumber.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TELETEX_TERMINAL_IDENTIFIER:
				return teletexTerminalIdentifier != null && !teletexTerminalIdentifier.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TELEX_NUMBER:
				return telexNumber != null && !telexNumber.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__THUMBNAIL_LOGO:
				return thumbnailLogo != null && !thumbnailLogo.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__THUMBNAIL_PHOTO:
				return thumbnailPhoto != null && !thumbnailPhoto.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__TITLE:
				return title != null && !title.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_ID:
				return userID != null && !userID.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__UNIQUE_IDENTIFIER:
				return uniqueIdentifier != null && !uniqueIdentifier.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_CERTIFICATE:
				return userCertificate != null && !userCertificate.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_PASSWORD:
				return userPassword != null && !userPassword.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_PKCS12:
				return userPKCS12 != null && !userPKCS12.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__USER_SMIME_CERTIFICATE:
				return userSMIMECertificate != null && !userSMIMECertificate.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__X121_ADDRESS:
				return x121Address != null && !x121Address.isEmpty();
			case CimPackage.CIM_OTHER_PERSON_INFORMATION__X500_UNIQUE_IDENTIFIER:
				return x500UniqueIdentifier != null && !x500UniqueIdentifier.isEmpty();
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
		result.append(", ObjectClass: ");
		result.append(objectClass);
		result.append(", Audio: ");
		result.append(audio);
		result.append(", BusinessCategory: ");
		result.append(businessCategory);
		result.append(", CarLicense: ");
		result.append(carLicense);
		result.append(", CommonName: ");
		result.append(commonName);
		result.append(", CountryName: ");
		result.append(countryName);
		result.append(", DepartmentNumber: ");
		result.append(departmentNumber);
		result.append(", Descriptions: ");
		result.append(descriptions);
		result.append(", DestinationIndicator: ");
		result.append(destinationIndicator);
		result.append(", DisplayName: ");
		result.append(displayName);
		result.append(", EmployeeNumber: ");
		result.append(employeeNumber);
		result.append(", EmployeeType: ");
		result.append(employeeType);
		result.append(", FacsimileTelephoneNumber: ");
		result.append(facsimileTelephoneNumber);
		result.append(", GenerationQualifier: ");
		result.append(generationQualifier);
		result.append(", GivenName: ");
		result.append(givenName);
		result.append(", HomeFax: ");
		result.append(homeFax);
		result.append(", HomePhone: ");
		result.append(homePhone);
		result.append(", HomePostalAddress: ");
		result.append(homePostalAddress);
		result.append(", Initials: ");
		result.append(initials);
		result.append(", InternationaliSDNNumber: ");
		result.append(internationaliSDNNumber);
		result.append(", JPEGPhoto: ");
		result.append(jpegPhoto);
		result.append(", LabeledURI: ");
		result.append(labeledURI);
		result.append(", LocalityName: ");
		result.append(localityName);
		result.append(", Mail: ");
		result.append(mail);
		result.append(", Manager: ");
		result.append(manager);
		result.append(", MiddleName: ");
		result.append(middleName);
		result.append(", Mobile: ");
		result.append(mobile);
		result.append(", OrganizationName: ");
		result.append(organizationName);
		result.append(", OrganizationalStatus: ");
		result.append(organizationalStatus);
		result.append(", OtherMailbox: ");
		result.append(otherMailbox);
		result.append(", OU: ");
		result.append(ou);
		result.append(", Pager: ");
		result.append(pager);
		result.append(", PersonalTitle: ");
		result.append(personalTitle);
		result.append(", Photo: ");
		result.append(photo);
		result.append(", PhysicalDeliveryOfficeName: ");
		result.append(physicalDeliveryOfficeName);
		result.append(", PostalAddress: ");
		result.append(postalAddress);
		result.append(", PostalCode: ");
		result.append(postalCode);
		result.append(", PostOfficeBox: ");
		result.append(postOfficeBox);
		result.append(", PreferredDeliveryMethod: ");
		result.append(preferredDeliveryMethod);
		result.append(", PreferredLanguage: ");
		result.append(preferredLanguage);
		result.append(", RegisteredAddress: ");
		result.append(registeredAddress);
		result.append(", RoomNumber: ");
		result.append(roomNumber);
		result.append(", Secretary: ");
		result.append(secretary);
		result.append(", SeeAlso: ");
		result.append(seeAlso);
		result.append(", StateOrProvince: ");
		result.append(stateOrProvince);
		result.append(", Street: ");
		result.append(street);
		result.append(", Surname: ");
		result.append(surname);
		result.append(", TelephoneNumber: ");
		result.append(telephoneNumber);
		result.append(", TeletexTerminalIdentifier: ");
		result.append(teletexTerminalIdentifier);
		result.append(", TelexNumber: ");
		result.append(telexNumber);
		result.append(", ThumbnailLogo: ");
		result.append(thumbnailLogo);
		result.append(", ThumbnailPhoto: ");
		result.append(thumbnailPhoto);
		result.append(", Title: ");
		result.append(title);
		result.append(", UserID: ");
		result.append(userID);
		result.append(", UniqueIdentifier: ");
		result.append(uniqueIdentifier);
		result.append(", UserCertificate: ");
		result.append(userCertificate);
		result.append(", UserPassword: ");
		result.append(userPassword);
		result.append(", UserPKCS12: ");
		result.append(userPKCS12);
		result.append(", UserSMIMECertificate: ");
		result.append(userSMIMECertificate);
		result.append(", X121Address: ");
		result.append(x121Address);
		result.append(", X500UniqueIdentifier: ");
		result.append(x500UniqueIdentifier);
		result.append(')');
		return result.toString();
	}

} //CIM_OtherPersonInformationImpl

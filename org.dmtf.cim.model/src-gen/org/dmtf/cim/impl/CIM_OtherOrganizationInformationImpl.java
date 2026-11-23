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

import org.dmtf.cim.CIM_OtherOrganizationInformation;
import org.dmtf.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIM Other Organization Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getDestinationIndicator <em>Destination Indicator</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getFacsimileTelephoneNumber <em>Facsimile Telephone Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getInternationaliSDNNumber <em>Internationali SDN Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getLabeledURI <em>Labeled URI</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getLocalityName <em>Locality Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getOtherMailbox <em>Other Mailbox</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getPhysicalDeliveryOfficeName <em>Physical Delivery Office Name</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getPostOfficeBox <em>Post Office Box</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getPreferredDeliveryMethod <em>Preferred Delivery Method</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getRegisteredAddress <em>Registered Address</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getSearchGuide <em>Search Guide</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getSeeAlso <em>See Also</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getTeletexTerminalIdentifier <em>Teletex Terminal Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getTelexNumber <em>Telex Number</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getThumbnailLogo <em>Thumbnail Logo</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getUniqueIdentifier <em>Unique Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getUserPassword <em>User Password</em>}</li>
 *   <li>{@link org.dmtf.cim.impl.CIM_OtherOrganizationInformationImpl#getX121Address <em>X121 Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CIM_OtherOrganizationInformationImpl extends CIM_ManagedElementImpl implements CIM_OtherOrganizationInformation {
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
	 * The cached value of the '{@link #getBusinessCategory() <em>Business Category</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<String> businessCategory;

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
	 * The cached value of the '{@link #getFacsimileTelephoneNumber() <em>Facsimile Telephone Number</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacsimileTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<String> facsimileTelephoneNumber;

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
	 * The cached value of the '{@link #getOrganizationName() <em>Organization Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> organizationName;

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
	 * The cached value of the '{@link #getRegisteredAddress() <em>Registered Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisteredAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<String> registeredAddress;

	/**
	 * The cached value of the '{@link #getSearchGuide() <em>Search Guide</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchGuide()
	 * @generated
	 * @ordered
	 */
	protected EList<String> searchGuide;

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
	 * The cached value of the '{@link #getUniqueIdentifier() <em>Unique Identifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<String> uniqueIdentifier;

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
	 * The cached value of the '{@link #getX121Address() <em>X121 Address</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX121Address()
	 * @generated
	 * @ordered
	 */
	protected EList<String> x121Address;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CIM_OtherOrganizationInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CimPackage.eINSTANCE.getCIM_OtherOrganizationInformation();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__CREATION_CLASS_NAME, oldCreationClassName, creationClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getObjectClass() {
		if (objectClass == null) {
			objectClass = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__OBJECT_CLASS);
		}
		return objectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getBusinessCategory() {
		if (businessCategory == null) {
			businessCategory = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__BUSINESS_CATEGORY);
		}
		return businessCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDescriptions() {
		if (descriptions == null) {
			descriptions = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__DESCRIPTIONS);
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
			destinationIndicator = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__DESTINATION_INDICATOR);
		}
		return destinationIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFacsimileTelephoneNumber() {
		if (facsimileTelephoneNumber == null) {
			facsimileTelephoneNumber = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__FACSIMILE_TELEPHONE_NUMBER);
		}
		return facsimileTelephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInternationaliSDNNumber() {
		if (internationaliSDNNumber == null) {
			internationaliSDNNumber = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__INTERNATIONALI_SDN_NUMBER);
		}
		return internationaliSDNNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLabeledURI() {
		if (labeledURI == null) {
			labeledURI = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__LABELED_URI);
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
			localityName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__LOCALITY_NAME);
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
			mail = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__MAIL);
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
			manager = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__MANAGER);
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOrganizationName() {
		if (organizationName == null) {
			organizationName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__ORGANIZATION_NAME);
		}
		return organizationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtherMailbox() {
		if (otherMailbox == null) {
			otherMailbox = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__OTHER_MAILBOX);
		}
		return otherMailbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPhysicalDeliveryOfficeName() {
		if (physicalDeliveryOfficeName == null) {
			physicalDeliveryOfficeName = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__PHYSICAL_DELIVERY_OFFICE_NAME);
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
			postalAddress = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__POSTAL_ADDRESS);
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
			postalCode = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__POSTAL_CODE);
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
			postOfficeBox = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__POST_OFFICE_BOX);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__PREFERRED_DELIVERY_METHOD, oldPreferredDeliveryMethod, preferredDeliveryMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRegisteredAddress() {
		if (registeredAddress == null) {
			registeredAddress = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__REGISTERED_ADDRESS);
		}
		return registeredAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSearchGuide() {
		if (searchGuide == null) {
			searchGuide = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__SEARCH_GUIDE);
		}
		return searchGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSeeAlso() {
		if (seeAlso == null) {
			seeAlso = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__SEE_ALSO);
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
			stateOrProvince = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__STATE_OR_PROVINCE);
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
			street = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__STREET);
		}
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTelephoneNumber() {
		if (telephoneNumber == null) {
			telephoneNumber = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__TELEPHONE_NUMBER);
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
			teletexTerminalIdentifier = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__TELETEX_TERMINAL_IDENTIFIER);
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
			telexNumber = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__TELEX_NUMBER);
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
			thumbnailLogo = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__THUMBNAIL_LOGO);
		}
		return thumbnailLogo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getUniqueIdentifier() {
		if (uniqueIdentifier == null) {
			uniqueIdentifier = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__UNIQUE_IDENTIFIER);
		}
		return uniqueIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getUserPassword() {
		if (userPassword == null) {
			userPassword = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__USER_PASSWORD);
		}
		return userPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getX121Address() {
		if (x121Address == null) {
			x121Address = new EDataTypeEList<String>(String.class, this, CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__X121_ADDRESS);
		}
		return x121Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__CREATION_CLASS_NAME:
				return getCreationClassName();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__NAME:
				return getName();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__OBJECT_CLASS:
				return getObjectClass();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__BUSINESS_CATEGORY:
				return getBusinessCategory();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__DESCRIPTIONS:
				return getDescriptions();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__DESTINATION_INDICATOR:
				return getDestinationIndicator();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__FACSIMILE_TELEPHONE_NUMBER:
				return getFacsimileTelephoneNumber();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__INTERNATIONALI_SDN_NUMBER:
				return getInternationaliSDNNumber();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__LABELED_URI:
				return getLabeledURI();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__LOCALITY_NAME:
				return getLocalityName();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__MAIL:
				return getMail();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__MANAGER:
				return getManager();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__ORGANIZATION_NAME:
				return getOrganizationName();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__OTHER_MAILBOX:
				return getOtherMailbox();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__PHYSICAL_DELIVERY_OFFICE_NAME:
				return getPhysicalDeliveryOfficeName();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__POSTAL_ADDRESS:
				return getPostalAddress();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__POSTAL_CODE:
				return getPostalCode();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__POST_OFFICE_BOX:
				return getPostOfficeBox();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__PREFERRED_DELIVERY_METHOD:
				return getPreferredDeliveryMethod();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__REGISTERED_ADDRESS:
				return getRegisteredAddress();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__SEARCH_GUIDE:
				return getSearchGuide();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__SEE_ALSO:
				return getSeeAlso();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__STATE_OR_PROVINCE:
				return getStateOrProvince();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__STREET:
				return getStreet();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__TELEPHONE_NUMBER:
				return getTelephoneNumber();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__TELETEX_TERMINAL_IDENTIFIER:
				return getTeletexTerminalIdentifier();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__TELEX_NUMBER:
				return getTelexNumber();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__THUMBNAIL_LOGO:
				return getThumbnailLogo();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__UNIQUE_IDENTIFIER:
				return getUniqueIdentifier();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__USER_PASSWORD:
				return getUserPassword();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__X121_ADDRESS:
				return getX121Address();
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
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__CREATION_CLASS_NAME:
				setCreationClassName((String)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__NAME:
				setName((String)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__OBJECT_CLASS:
				getObjectClass().clear();
				getObjectClass().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__BUSINESS_CATEGORY:
				getBusinessCategory().clear();
				getBusinessCategory().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__DESCRIPTIONS:
				getDescriptions().clear();
				getDescriptions().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__DESTINATION_INDICATOR:
				getDestinationIndicator().clear();
				getDestinationIndicator().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__FACSIMILE_TELEPHONE_NUMBER:
				getFacsimileTelephoneNumber().clear();
				getFacsimileTelephoneNumber().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__INTERNATIONALI_SDN_NUMBER:
				getInternationaliSDNNumber().clear();
				getInternationaliSDNNumber().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__LABELED_URI:
				getLabeledURI().clear();
				getLabeledURI().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__LOCALITY_NAME:
				getLocalityName().clear();
				getLocalityName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__MAIL:
				getMail().clear();
				getMail().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__MANAGER:
				getManager().clear();
				getManager().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__ORGANIZATION_NAME:
				getOrganizationName().clear();
				getOrganizationName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__OTHER_MAILBOX:
				getOtherMailbox().clear();
				getOtherMailbox().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__PHYSICAL_DELIVERY_OFFICE_NAME:
				getPhysicalDeliveryOfficeName().clear();
				getPhysicalDeliveryOfficeName().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__POSTAL_ADDRESS:
				getPostalAddress().clear();
				getPostalAddress().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__POSTAL_CODE:
				getPostalCode().clear();
				getPostalCode().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__POST_OFFICE_BOX:
				getPostOfficeBox().clear();
				getPostOfficeBox().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__PREFERRED_DELIVERY_METHOD:
				setPreferredDeliveryMethod((String)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__REGISTERED_ADDRESS:
				getRegisteredAddress().clear();
				getRegisteredAddress().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__SEARCH_GUIDE:
				getSearchGuide().clear();
				getSearchGuide().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__SEE_ALSO:
				getSeeAlso().clear();
				getSeeAlso().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__STATE_OR_PROVINCE:
				getStateOrProvince().clear();
				getStateOrProvince().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__STREET:
				getStreet().clear();
				getStreet().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				getTelephoneNumber().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__TELETEX_TERMINAL_IDENTIFIER:
				getTeletexTerminalIdentifier().clear();
				getTeletexTerminalIdentifier().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__TELEX_NUMBER:
				getTelexNumber().clear();
				getTelexNumber().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__THUMBNAIL_LOGO:
				getThumbnailLogo().clear();
				getThumbnailLogo().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__UNIQUE_IDENTIFIER:
				getUniqueIdentifier().clear();
				getUniqueIdentifier().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__USER_PASSWORD:
				getUserPassword().clear();
				getUserPassword().addAll((Collection<? extends String>)newValue);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__X121_ADDRESS:
				getX121Address().clear();
				getX121Address().addAll((Collection<? extends String>)newValue);
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
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__CREATION_CLASS_NAME:
				setCreationClassName(CREATION_CLASS_NAME_EDEFAULT);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__OBJECT_CLASS:
				getObjectClass().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__BUSINESS_CATEGORY:
				getBusinessCategory().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__DESCRIPTIONS:
				getDescriptions().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__DESTINATION_INDICATOR:
				getDestinationIndicator().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__FACSIMILE_TELEPHONE_NUMBER:
				getFacsimileTelephoneNumber().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__INTERNATIONALI_SDN_NUMBER:
				getInternationaliSDNNumber().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__LABELED_URI:
				getLabeledURI().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__LOCALITY_NAME:
				getLocalityName().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__MAIL:
				getMail().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__MANAGER:
				getManager().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__ORGANIZATION_NAME:
				getOrganizationName().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__OTHER_MAILBOX:
				getOtherMailbox().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__PHYSICAL_DELIVERY_OFFICE_NAME:
				getPhysicalDeliveryOfficeName().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__POSTAL_ADDRESS:
				getPostalAddress().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__POSTAL_CODE:
				getPostalCode().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__POST_OFFICE_BOX:
				getPostOfficeBox().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__PREFERRED_DELIVERY_METHOD:
				setPreferredDeliveryMethod(PREFERRED_DELIVERY_METHOD_EDEFAULT);
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__REGISTERED_ADDRESS:
				getRegisteredAddress().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__SEARCH_GUIDE:
				getSearchGuide().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__SEE_ALSO:
				getSeeAlso().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__STATE_OR_PROVINCE:
				getStateOrProvince().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__STREET:
				getStreet().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__TELETEX_TERMINAL_IDENTIFIER:
				getTeletexTerminalIdentifier().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__TELEX_NUMBER:
				getTelexNumber().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__THUMBNAIL_LOGO:
				getThumbnailLogo().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__UNIQUE_IDENTIFIER:
				getUniqueIdentifier().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__USER_PASSWORD:
				getUserPassword().clear();
				return;
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__X121_ADDRESS:
				getX121Address().clear();
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
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__CREATION_CLASS_NAME:
				return CREATION_CLASS_NAME_EDEFAULT == null ? creationClassName != null : !CREATION_CLASS_NAME_EDEFAULT.equals(creationClassName);
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__OBJECT_CLASS:
				return objectClass != null && !objectClass.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__BUSINESS_CATEGORY:
				return businessCategory != null && !businessCategory.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__DESCRIPTIONS:
				return descriptions != null && !descriptions.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__DESTINATION_INDICATOR:
				return destinationIndicator != null && !destinationIndicator.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__FACSIMILE_TELEPHONE_NUMBER:
				return facsimileTelephoneNumber != null && !facsimileTelephoneNumber.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__INTERNATIONALI_SDN_NUMBER:
				return internationaliSDNNumber != null && !internationaliSDNNumber.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__LABELED_URI:
				return labeledURI != null && !labeledURI.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__LOCALITY_NAME:
				return localityName != null && !localityName.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__MAIL:
				return mail != null && !mail.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__MANAGER:
				return manager != null && !manager.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__ORGANIZATION_NAME:
				return organizationName != null && !organizationName.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__OTHER_MAILBOX:
				return otherMailbox != null && !otherMailbox.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__PHYSICAL_DELIVERY_OFFICE_NAME:
				return physicalDeliveryOfficeName != null && !physicalDeliveryOfficeName.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__POSTAL_ADDRESS:
				return postalAddress != null && !postalAddress.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__POSTAL_CODE:
				return postalCode != null && !postalCode.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__POST_OFFICE_BOX:
				return postOfficeBox != null && !postOfficeBox.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__PREFERRED_DELIVERY_METHOD:
				return PREFERRED_DELIVERY_METHOD_EDEFAULT == null ? preferredDeliveryMethod != null : !PREFERRED_DELIVERY_METHOD_EDEFAULT.equals(preferredDeliveryMethod);
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__REGISTERED_ADDRESS:
				return registeredAddress != null && !registeredAddress.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__SEARCH_GUIDE:
				return searchGuide != null && !searchGuide.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__SEE_ALSO:
				return seeAlso != null && !seeAlso.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__STATE_OR_PROVINCE:
				return stateOrProvince != null && !stateOrProvince.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__STREET:
				return street != null && !street.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__TELEPHONE_NUMBER:
				return telephoneNumber != null && !telephoneNumber.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__TELETEX_TERMINAL_IDENTIFIER:
				return teletexTerminalIdentifier != null && !teletexTerminalIdentifier.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__TELEX_NUMBER:
				return telexNumber != null && !telexNumber.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__THUMBNAIL_LOGO:
				return thumbnailLogo != null && !thumbnailLogo.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__UNIQUE_IDENTIFIER:
				return uniqueIdentifier != null && !uniqueIdentifier.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__USER_PASSWORD:
				return userPassword != null && !userPassword.isEmpty();
			case CimPackage.CIM_OTHER_ORGANIZATION_INFORMATION__X121_ADDRESS:
				return x121Address != null && !x121Address.isEmpty();
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
		result.append(", BusinessCategory: ");
		result.append(businessCategory);
		result.append(", Descriptions: ");
		result.append(descriptions);
		result.append(", DestinationIndicator: ");
		result.append(destinationIndicator);
		result.append(", FacsimileTelephoneNumber: ");
		result.append(facsimileTelephoneNumber);
		result.append(", InternationaliSDNNumber: ");
		result.append(internationaliSDNNumber);
		result.append(", LabeledURI: ");
		result.append(labeledURI);
		result.append(", LocalityName: ");
		result.append(localityName);
		result.append(", Mail: ");
		result.append(mail);
		result.append(", Manager: ");
		result.append(manager);
		result.append(", OrganizationName: ");
		result.append(organizationName);
		result.append(", OtherMailbox: ");
		result.append(otherMailbox);
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
		result.append(", RegisteredAddress: ");
		result.append(registeredAddress);
		result.append(", SearchGuide: ");
		result.append(searchGuide);
		result.append(", SeeAlso: ");
		result.append(seeAlso);
		result.append(", StateOrProvince: ");
		result.append(stateOrProvince);
		result.append(", Street: ");
		result.append(street);
		result.append(", TelephoneNumber: ");
		result.append(telephoneNumber);
		result.append(", TeletexTerminalIdentifier: ");
		result.append(teletexTerminalIdentifier);
		result.append(", TelexNumber: ");
		result.append(telexNumber);
		result.append(", ThumbnailLogo: ");
		result.append(thumbnailLogo);
		result.append(", UniqueIdentifier: ");
		result.append(uniqueIdentifier);
		result.append(", UserPassword: ");
		result.append(userPassword);
		result.append(", X121Address: ");
		result.append(x121Address);
		result.append(')');
		return result.toString();
	}

} //CIM_OtherOrganizationInformationImpl

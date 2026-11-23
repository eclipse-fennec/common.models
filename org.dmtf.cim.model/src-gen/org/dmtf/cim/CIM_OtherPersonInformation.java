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
package org.dmtf.cim;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Other Person Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The OtherPersonInformation class is used to provide additional information about an associated Person instance. This class is defined so as to incorporate commonly-used LDAP attributes to permit implementations to easily derive this information from LDAP-accessible directories.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getAudio <em>Audio</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getCarLicense <em>Car License</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getCommonName <em>Common Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getCountryName <em>Country Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getDepartmentNumber <em>Department Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getDestinationIndicator <em>Destination Indicator</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getEmployeeNumber <em>Employee Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getEmployeeType <em>Employee Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getFacsimileTelephoneNumber <em>Facsimile Telephone Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getGenerationQualifier <em>Generation Qualifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getHomeFax <em>Home Fax</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getHomePhone <em>Home Phone</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getHomePostalAddress <em>Home Postal Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getInitials <em>Initials</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getInternationaliSDNNumber <em>Internationali SDN Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getJPEGPhoto <em>JPEG Photo</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getLabeledURI <em>Labeled URI</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getLocalityName <em>Locality Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getMail <em>Mail</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getManager <em>Manager</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getMobile <em>Mobile</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getOrganizationalStatus <em>Organizational Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getOtherMailbox <em>Other Mailbox</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getOU <em>OU</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getPager <em>Pager</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getPersonalTitle <em>Personal Title</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getPhoto <em>Photo</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getPhysicalDeliveryOfficeName <em>Physical Delivery Office Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getPostOfficeBox <em>Post Office Box</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getPreferredDeliveryMethod <em>Preferred Delivery Method</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getPreferredLanguage <em>Preferred Language</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getRegisteredAddress <em>Registered Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getRoomNumber <em>Room Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getSecretary <em>Secretary</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getSeeAlso <em>See Also</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getStreet <em>Street</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getTeletexTerminalIdentifier <em>Teletex Terminal Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getTelexNumber <em>Telex Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getThumbnailLogo <em>Thumbnail Logo</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getThumbnailPhoto <em>Thumbnail Photo</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getTitle <em>Title</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getUserID <em>User ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getUniqueIdentifier <em>Unique Identifier</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getUserCertificate <em>User Certificate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getUserPassword <em>User Password</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getUserPKCS12 <em>User PKCS12</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getUserSMIMECertificate <em>User SMIME Certificate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getX121Address <em>X121 Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OtherPersonInformation#getX500UniqueIdentifier <em>X500 Unique Identifier</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::User::Org' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_OtherPersonInformation extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OtherPersonInformation#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Name property defines the label by which the object is known. In the case of an LDAP-derived instance, the Name property value may be set to the distinguished name of the LDAP-accessed object instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='1024'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OtherPersonInformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Object Class</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of an LDAP-derived instance, the ObjectClass property value(s) may be set to the objectClass attribute values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Class</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_ObjectClass()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getObjectClass();

	/**
	 * Returns the value of the '<em><b>Audio</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Audio property may be used to store an audio clip of the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audio</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_Audio()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getAudio();

	/**
	 * Returns the value of the '<em><b>Business Category</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property describes the kind of business performed by an organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Category</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_BusinessCategory()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='128'"
	 * @generated
	 */
	EList<String> getBusinessCategory();

	/**
	 * Returns the value of the '<em><b>Car License</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CarLicense property is used to record the values of the vehicle license or registration plate associated with an individual.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Car License</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_CarLicense()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='128'"
	 * @generated
	 */
	EList<String> getCarLicense();

	/**
	 * Returns the value of the '<em><b>Common Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A CommonName is a (possibly ambiguous) name by which the role is commonly known in some limited scope (such as an organization) and conforms to the naming conventions of the country or culture with which it is associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Common Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_CommonName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getCommonName();

	/**
	 * Returns the value of the '<em><b>Country Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CountryName property specifies a country as defined in ISO 3166.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_CountryName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getCountryName();

	/**
	 * Returns the value of the '<em><b>Department Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on inetOrgPerson, the DepartmentNumber is a code for department to which a person belongs. This can be strictly numeric (e.g., 1234) or alphanumeric (e.g., ABC/123).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Department Number</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_DepartmentNumber()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getDepartmentNumber();

	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Descriptions property values may contain human-readable descriptions of the object. In the case of an LDAP-derived instance, the description attribute may have multiple values that, therefore, cannot be placed in the inherited Description property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_Descriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='1024'"
	 * @generated
	 */
	EList<String> getDescriptions();

	/**
	 * Returns the value of the '<em><b>Destination Indicator</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used for the organization's telegram service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Indicator</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_DestinationIndicator()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='128'"
	 * @generated
	 */
	EList<String> getDestinationIndicator();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on inetOrgPerson, the DisplayName property values are used when displaying an entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_DisplayName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getDisplayName();

	/**
	 * Returns the value of the '<em><b>Employee Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on inetOrgPerson, the EmployeeNumber property specifies a numeric or an alphanumeric identifier assigned to a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Number</em>' attribute.
	 * @see #setEmployeeNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_EmployeeNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getEmployeeNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OtherPersonInformation#getEmployeeNumber <em>Employee Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Number</em>' attribute.
	 * @see #getEmployeeNumber()
	 * @generated
	 */
	void setEmployeeNumber(String value);

	/**
	 * Returns the value of the '<em><b>Employee Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on inetOrgPerson, the EmployeeType property is used to identify the employer to employee relationship. Typical values used may include 'Contractor', 'Employee', 'Intern', 'Temp', 'External', and 'Unknown' but any value may be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Type</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_EmployeeType()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getEmployeeType();

	/**
	 * Returns the value of the '<em><b>Facsimile Telephone Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person's facsimile telephone number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facsimile Telephone Number</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_FacsimileTelephoneNumber()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getFacsimileTelephoneNumber();

	/**
	 * Returns the value of the '<em><b>Generation Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on liPerson, the GenerationQualifier property specifies a name qualifier that represents the person's generation (e.g., JR., III, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generation Qualifier</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_GenerationQualifier()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getGenerationQualifier();

	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GivenName property is used for the part of a person's name that is not their surname nor their middle name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Given Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_GivenName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getGivenName();

	/**
	 * Returns the value of the '<em><b>Home Fax</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on liPerson, the HomeFax property specifies the person's facsimile telephone number at home.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Home Fax</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_HomeFax()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getHomeFax();

	/**
	 * Returns the value of the '<em><b>Home Phone</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the HomePhone property specifies a home telephone number for the person, e.g. + 44 582 10101).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Home Phone</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_HomePhone()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='32'"
	 * @generated
	 */
	EList<String> getHomePhone();

	/**
	 * Returns the value of the '<em><b>Home Postal Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HomePostalAddress property values specify the home address information required for the physical delivery of postal messages by the postal authority.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Home Postal Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_HomePostalAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getHomePostalAddress();

	/**
	 * Returns the value of the '<em><b>Initials</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on inetOrgPerson, the Initials property specifies the first letters of the person's name, typically the property values will exclude the first letter of the surname.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initials</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_Initials()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getInitials();

	/**
	 * Returns the value of the '<em><b>Internationali SDN Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person's International ISDN number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internationali SDN Number</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_InternationaliSDNNumber()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='16'"
	 * @generated
	 */
	EList<String> getInternationaliSDNNumber();

	/**
	 * Returns the value of the '<em><b>JPEG Photo</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * From inetOrgPerson, the JPEG Photo property values may be used for one or more images of a person using the JPEG File Interchange Format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>JPEG Photo</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_JPEGPhoto()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getJPEGPhoto();

	/**
	 * Returns the value of the '<em><b>Labeled URI</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uniform Resource Identifier with optional label as defined in RFC2079.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Labeled URI</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_LabeledURI()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getLabeledURI();

	/**
	 * Returns the value of the '<em><b>Locality Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains the name of a locality, such as a city, county or other geographic region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locality Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_LocalityName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getLocalityName();

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the mail box addresses for the person as defined in RFC822.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mail</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_Mail()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getMail();

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person's manager within the organization. In the case of an LDAP-derived instance, the Manager property value may contain the distinguishedName of the Manager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manager</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_Manager()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getManager();

	/**
	 * Returns the value of the '<em><b>Middle Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on liPerson, the middle name of the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Middle Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_MiddleName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getMiddleName();

	/**
	 * Returns the value of the '<em><b>Mobile</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the Mobile phone property specifies a mobile telephone number for the person, e.g. + 44 582 10101).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mobile</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_Mobile()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='32'"
	 * @generated
	 */
	EList<String> getMobile();

	/**
	 * Returns the value of the '<em><b>Organization Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the person's organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_OrganizationName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Required='true'"
	 * @generated
	 */
	EList<String> getOrganizationName();

	/**
	 * Returns the value of the '<em><b>Organizational Status</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the OrganizationalStatus property specifies a category by which a person is often referred to within an organization. Examples of usage in academia might include undergraduate student, researcher, lecturer, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organizational Status</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_OrganizationalStatus()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getOrganizationalStatus();

	/**
	 * Returns the value of the '<em><b>Other Mailbox</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, this property may be used for electronic mail box addresses other than RFC822 and X.400.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Mailbox</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_OtherMailbox()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getOtherMailbox();

	/**
	 * Returns the value of the '<em><b>OU</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of an organizational unit related to the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OU</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_OU()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getOU();

	/**
	 * Returns the value of the '<em><b>Pager</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the Pager property specifies a pager telephone number for the person, e.g. + 44 582 10101).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pager</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_Pager()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='32'"
	 * @generated
	 */
	EList<String> getPager();

	/**
	 * Returns the value of the '<em><b>Personal Title</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on liPerson, the PersonalTitle property may be used to specify the person's personal title such as Mr., Ms., Dr., Prof. etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personal Title</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_PersonalTitle()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getPersonalTitle();

	/**
	 * Returns the value of the '<em><b>Photo</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the Photo property may be used to specify a photograph for the person encoded in G3 fax as explained in recommendation T.4, with an ASN.1 wrapper to make it compatible with an X.400 BodyPart as defined in X.420.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Photo</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_Photo()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getPhoto();

	/**
	 * Returns the value of the '<em><b>Physical Delivery Office Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PhysicalDeliveryOfficeName property specifies the name of the city, village, etc. where a physical delivery office is situated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Delivery Office Name</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_PhysicalDeliveryOfficeName()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='128'"
	 * @generated
	 */
	EList<String> getPhysicalDeliveryOfficeName();

	/**
	 * Returns the value of the '<em><b>Postal Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PostalAddress property values specify the address information required for the physical delivery of postal messages by the postal authority to the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_PostalAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getPostalAddress();

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PostalCode property specifies the postal code of the organization. If this value is present, it will be part of the object's postal address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_PostalCode()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='40'"
	 * @generated
	 */
	EList<String> getPostalCode();

	/**
	 * Returns the value of the '<em><b>Post Office Box</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PostOfficeBox property specifies the PO box by which the person will receive physical postal delivery. If present, the property value is part of the object's postal address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Office Box</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_PostOfficeBox()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='40'"
	 * @generated
	 */
	EList<String> getPostOfficeBox();

	/**
	 * Returns the value of the '<em><b>Preferred Delivery Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PreferredDeliveryMethod property specifies the preferred method to be used for contacting the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred Delivery Method</em>' attribute.
	 * @see #setPreferredDeliveryMethod(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_PreferredDeliveryMethod()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPreferredDeliveryMethod();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OtherPersonInformation#getPreferredDeliveryMethod <em>Preferred Delivery Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Delivery Method</em>' attribute.
	 * @see #getPreferredDeliveryMethod()
	 * @generated
	 */
	void setPreferredDeliveryMethod(String value);

	/**
	 * Returns the value of the '<em><b>Preferred Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on inetOrgPerson, the person's preferred written or spoken language.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred Language</em>' attribute.
	 * @see #setPreferredLanguage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_PreferredLanguage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPreferredLanguage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OtherPersonInformation#getPreferredLanguage <em>Preferred Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Language</em>' attribute.
	 * @see #getPreferredLanguage()
	 * @generated
	 */
	void setPreferredLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Registered Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property specifies a postal address suitable for receipt of telegrams or expedited documents, where it is necessary to have the recipient accept delivery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Registered Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_RegisteredAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getRegisteredAddress();

	/**
	 * Returns the value of the '<em><b>Room Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the RoomNumber property specifies the room number for the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Room Number</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_RoomNumber()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getRoomNumber();

	/**
	 * Returns the value of the '<em><b>Secretary</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the Secretary property may be used to specify a secretary for the person. In the case of an LDAP-derived object instance, the value may be a distinguishedName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secretary</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_Secretary()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getSecretary();

	/**
	 * Returns the value of the '<em><b>See Also</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of an LDAP-derived instance, the SeeAlso property specifies distinguished name of other Directory objects which may be other aspects (in some sense) of the same real world object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>See Also</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_SeeAlso()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getSeeAlso();

	/**
	 * Returns the value of the '<em><b>State Or Province</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State or Province name property specifies a state or province.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Or Province</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_StateOrProvince()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getStateOrProvince();

	/**
	 * Returns the value of the '<em><b>Street</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Street address property specifies a site for the local distribution and physical delivery in a postal address, i.e. the street name, place, avenue, and the number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Street</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_Street()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='128'"
	 * @generated
	 */
	EList<String> getStreet();

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Surname property specifies the linguistic construct that normally is inherited by an individual from the individual's parent or assumed by marriage, and by which the individual is commonly known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surname</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_Surname()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getSurname();

	/**
	 * Returns the value of the '<em><b>Telephone Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TelephoneNumber property specifies a telephone number of the organization, e.g. + 44 582 10101).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_TelephoneNumber()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='32'"
	 * @generated
	 */
	EList<String> getTelephoneNumber();

	/**
	 * Returns the value of the '<em><b>Teletex Terminal Identifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TeletexTerminalIdentifier property specifies the Teletex terminal identifier (and, optionally, parameters) for a teletex terminal associated with the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Teletex Terminal Identifier</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_TeletexTerminalIdentifier()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getTeletexTerminalIdentifier();

	/**
	 * Returns the value of the '<em><b>Telex Number</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TelexNumber property specifies the telex number, country code, and answerback code of a telex terminal for the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telex Number</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_TelexNumber()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getTelexNumber();

	/**
	 * Returns the value of the '<em><b>Thumbnail Logo</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A small image of the person's organization logo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thumbnail Logo</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_ThumbnailLogo()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getThumbnailLogo();

	/**
	 * Returns the value of the '<em><b>Thumbnail Photo</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A small image of the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thumbnail Photo</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_ThumbnailPhoto()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getThumbnailPhoto();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Title property may be used to specify the person's designated position or function of the object within an organization, e.g., Manager, Vice-President, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_Title()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getTitle();

	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the UserID property may be used to specify a computer system login name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User ID</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_UserID()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getUserID();

	/**
	 * Returns the value of the '<em><b>Unique Identifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier that may be assigned in an environment to differentiate between uses of a given named person instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unique Identifier</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_UniqueIdentifier()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getUniqueIdentifier();

	/**
	 * Returns the value of the '<em><b>User Certificate</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on inetOrgPerson and for directory compatibility, the UserCertificate property may be used to specify a public key certificate for the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Certificate</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_UserCertificate()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getUserCertificate();

	/**
	 * Returns the value of the '<em><b>User Password</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case of an LDAP-derived instance, the UserPassword property may contain an encrypted password used to access the person's resources in a directory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Password</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_UserPassword()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getUserPassword();

	/**
	 * Returns the value of the '<em><b>User PKCS12</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on inetOrgPerson and for directory compatibility, the UserPKCS12 property value may be used to provide a format for exchange of personal identity information. The property values are PFX PDUs stored as Octetstrings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User PKCS12</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_UserPKCS12()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getUserPKCS12();

	/**
	 * Returns the value of the '<em><b>User SMIME Certificate</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on inetOrgPerson, the User S/MIME Certificate property may be used to specify the person's an S/MIME (RFC1847) signed message with a zero-length body. It contains the entire certificate chain and the signed attribute that describes their algorithm capabilities. If available, this property is preferred over the UserCertificate property for S/MIME applications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User SMIME Certificate</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_UserSMIMECertificate()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getUserSMIMECertificate();

	/**
	 * Returns the value of the '<em><b>X121 Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An X.121 address for the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X121 Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_X121Address()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' MaxLen='15'"
	 * @generated
	 */
	EList<String> getX121Address();

	/**
	 * Returns the value of the '<em><b>X500 Unique Identifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An X.500 specified unique identifier that may be assigned in an environment to differentiate between uses of a given named person object instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X500 Unique Identifier</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_OtherPersonInformation_X500UniqueIdentifier()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Octetstring='true'"
	 * @generated
	 */
	EList<String> getX500UniqueIdentifier();

} // CIM_OtherPersonInformation

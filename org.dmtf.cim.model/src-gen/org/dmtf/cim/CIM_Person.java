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
 * A representation of the model object '<em><b>CIM Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Person class is used to represent people, and holds their white and yellow pages data. The class is defined so as to incorporate commonly-used LDAP attributes to permit implementations to easily derive this information from LDAP-accessible directories. This class's properties are a subset of a related class, OtherPersonInformation, which defines all the group properties and in array form for directory compatibility.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Person#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Person#getCommonName <em>Common Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Person#getEmployeeNumber <em>Employee Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Person#getEmployeeType <em>Employee Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Person#getFacsimileTelephoneNumber <em>Facsimile Telephone Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Person#getHomePhone <em>Home Phone</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Person#getHomePostalAddress <em>Home Postal Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Person#getJPEGPhoto <em>JPEG Photo</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Person#getManager <em>Manager</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Person#getMobile <em>Mobile</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Person#getOU <em>OU</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Person#getPager <em>Pager</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Person#getPreferredLanguage <em>Preferred Language</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Person#getSecretary <em>Secretary</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Person#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Person()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::User::Org' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_Person extends CIM_UserContact {
	/**
	 * Returns the value of the '<em><b>Business Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property describes the kind of business performed by an organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Category</em>' attribute.
	 * @see #setBusinessCategory(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Person_BusinessCategory()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='128'"
	 * @generated
	 */
	String getBusinessCategory();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Person#getBusinessCategory <em>Business Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Category</em>' attribute.
	 * @see #getBusinessCategory()
	 * @generated
	 */
	void setBusinessCategory(String value);

	/**
	 * Returns the value of the '<em><b>Common Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A CommonName is a (possibly ambiguous) name by which the Person is commonly known in some limited scope (such as an organization) and conforms to the naming conventions of the country or culture with which it is associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Common Name</em>' attribute.
	 * @see #setCommonName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Person_CommonName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getCommonName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Person#getCommonName <em>Common Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Name</em>' attribute.
	 * @see #getCommonName()
	 * @generated
	 */
	void setCommonName(String value);

	/**
	 * Returns the value of the '<em><b>Employee Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on inetOrgPerson, the EmployeeNumber property specifies a numeric or an alphanumeric identifier assigned to a person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Number</em>' attribute.
	 * @see #setEmployeeNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Person_EmployeeNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getEmployeeNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Person#getEmployeeNumber <em>Employee Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Number</em>' attribute.
	 * @see #getEmployeeNumber()
	 * @generated
	 */
	void setEmployeeNumber(String value);

	/**
	 * Returns the value of the '<em><b>Employee Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on inetOrgPerson, the EmployeeType property is used to identify the employer to employee relationship. Typical values used may include 'Contractor', 'Employee', 'Intern', 'Temp', 'External', and 'Unknown' but any value may be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Employee Type</em>' attribute.
	 * @see #setEmployeeType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Person_EmployeeType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getEmployeeType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Person#getEmployeeType <em>Employee Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Type</em>' attribute.
	 * @see #getEmployeeType()
	 * @generated
	 */
	void setEmployeeType(String value);

	/**
	 * Returns the value of the '<em><b>Facsimile Telephone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person's facsimile telephone number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facsimile Telephone Number</em>' attribute.
	 * @see #setFacsimileTelephoneNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Person_FacsimileTelephoneNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getFacsimileTelephoneNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Person#getFacsimileTelephoneNumber <em>Facsimile Telephone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facsimile Telephone Number</em>' attribute.
	 * @see #getFacsimileTelephoneNumber()
	 * @generated
	 */
	void setFacsimileTelephoneNumber(String value);

	/**
	 * Returns the value of the '<em><b>Home Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the HomePhone property specifies a home telephone number for the person, e.g. + 44 582 10101).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Home Phone</em>' attribute.
	 * @see #setHomePhone(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Person_HomePhone()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='32'"
	 * @generated
	 */
	String getHomePhone();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Person#getHomePhone <em>Home Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Phone</em>' attribute.
	 * @see #getHomePhone()
	 * @generated
	 */
	void setHomePhone(String value);

	/**
	 * Returns the value of the '<em><b>Home Postal Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The HomePostalAddress property values specify the home address information required for the physical delivery of postal messages by the postal authority.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Home Postal Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Person_HomePostalAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getHomePostalAddress();

	/**
	 * Returns the value of the '<em><b>JPEG Photo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * From inetOrgPerson, the JPEGPhoto property values may be used for one or more images of a person using the JPEG File Interchange Format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>JPEG Photo</em>' attribute.
	 * @see #setJPEGPhoto(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Person_JPEGPhoto()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getJPEGPhoto();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Person#getJPEGPhoto <em>JPEG Photo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JPEG Photo</em>' attribute.
	 * @see #getJPEGPhoto()
	 * @generated
	 */
	void setJPEGPhoto(String value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person's manager within the organization. In the case of an LDAP-derived instance, the Manager property value may contain the distinguished name of the Manager.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manager</em>' attribute.
	 * @see #setManager(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Person_Manager()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getManager();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Person#getManager <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' attribute.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(String value);

	/**
	 * Returns the value of the '<em><b>Mobile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the Mobile phone property specifies a mobile telephone number for the person, e.g. + 44 582 10101).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mobile</em>' attribute.
	 * @see #setMobile(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Person_Mobile()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='32'"
	 * @generated
	 */
	String getMobile();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Person#getMobile <em>Mobile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobile</em>' attribute.
	 * @see #getMobile()
	 * @generated
	 */
	void setMobile(String value);

	/**
	 * Returns the value of the '<em><b>OU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of an organizational unit related to the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OU</em>' attribute.
	 * @see #setOU(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Person_OU()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOU();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Person#getOU <em>OU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OU</em>' attribute.
	 * @see #getOU()
	 * @generated
	 */
	void setOU(String value);

	/**
	 * Returns the value of the '<em><b>Pager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the Pager property specifies a pager telephone number for the person, e.g. + 44 582 10101).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pager</em>' attribute.
	 * @see #setPager(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Person_Pager()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='32'"
	 * @generated
	 */
	String getPager();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Person#getPager <em>Pager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pager</em>' attribute.
	 * @see #getPager()
	 * @generated
	 */
	void setPager(String value);

	/**
	 * Returns the value of the '<em><b>Preferred Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on inetOrgPerson, the person's preferred written or spoken language.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred Language</em>' attribute.
	 * @see #setPreferredLanguage(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Person_PreferredLanguage()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPreferredLanguage();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Person#getPreferredLanguage <em>Preferred Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Language</em>' attribute.
	 * @see #getPreferredLanguage()
	 * @generated
	 */
	void setPreferredLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Secretary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the Secretary property may be used to specify a secretary for the person. In the case of an LDAP-derived object instance, the value may be a distinguished name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Secretary</em>' attribute.
	 * @see #setSecretary(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Person_Secretary()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSecretary();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Person#getSecretary <em>Secretary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secretary</em>' attribute.
	 * @see #getSecretary()
	 * @generated
	 */
	void setSecretary(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Title property may be used to specify the person's designated position or function of the object within an organization, e.g., Manager, Vice-President, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Person_Title()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Person#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // CIM_Person

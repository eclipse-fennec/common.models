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
 * A representation of the model object '<em><b>CIM User Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * UserContact contains the details related to contacting a user. This information will be promoted to UserEntity in a later major release of CIM, but cannot be promoted at this time since UserEntity is abstract today, with no keys. Key and required properties cannot be added to a class in a minor version release since this breaks backward compatibility.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_UserContact#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UserContact#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UserContact#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UserContact#getSurname <em>Surname</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UserContact#getMail <em>Mail</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UserContact#getUserID <em>User ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UserContact#getLocalityName <em>Locality Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UserContact#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UserContact#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UserContact#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_UserContact#getTelephoneNumber <em>Telephone Number</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_UserContact()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.33.0' UMLPackagePath='CIM::User::Org' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_UserContact extends CIM_UserEntity {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UserContact_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UserContact#getCreationClassName <em>Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_UserContact_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='1024'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UserContact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Given Name property is used for the part of a person's name that is not their surname nor their middle name (i.e., their first name).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Given Name</em>' attribute.
	 * @see #setGivenName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UserContact_GivenName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getGivenName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UserContact#getGivenName <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Name</em>' attribute.
	 * @see #getGivenName()
	 * @generated
	 */
	void setGivenName(String value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Surname property specifies the linguistic construct that normally is inherited by an individual from the individual's parent or assumed by marriage, and by which the individual is commonly known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UserContact_Surname()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UserContact#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the mail box addresses for the person as defined in RFC822.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mail</em>' attribute.
	 * @see #setMail(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UserContact_Mail()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getMail();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UserContact#getMail <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail</em>' attribute.
	 * @see #getMail()
	 * @generated
	 */
	void setMail(String value);

	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A User ID property. Based on RFC1274, the property may be used to specify a computer system login name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UserContact_UserID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UserContact#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

	/**
	 * Returns the value of the '<em><b>Locality Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains the name of a locality, such as a city, county or other geographic region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locality Name</em>' attribute.
	 * @see #setLocalityName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UserContact_LocalityName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getLocalityName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UserContact#getLocalityName <em>Locality Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locality Name</em>' attribute.
	 * @see #getLocalityName()
	 * @generated
	 */
	void setLocalityName(String value);

	/**
	 * Returns the value of the '<em><b>Postal Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PostalAddress property values specify the address information required for the physical delivery of postal messages by the postal authority to the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_UserContact_PostalAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getPostalAddress();

	/**
	 * Returns the value of the '<em><b>State Or Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State or Province name property specifies a state or province.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Or Province</em>' attribute.
	 * @see #setStateOrProvince(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UserContact_StateOrProvince()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getStateOrProvince();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UserContact#getStateOrProvince <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Or Province</em>' attribute.
	 * @see #getStateOrProvince()
	 * @generated
	 */
	void setStateOrProvince(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PostalCode property specifies the postal code of the organization. If this value is present it will be part of the object's postal address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UserContact_PostalCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='40'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UserContact#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Telephone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TelephoneNumber property specifies a telephone number of the organization, e.g. + 44 582 10101).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number</em>' attribute.
	 * @see #setTelephoneNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_UserContact_TelephoneNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='32'"
	 * @generated
	 */
	String getTelephoneNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_UserContact#getTelephoneNumber <em>Telephone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone Number</em>' attribute.
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	void setTelephoneNumber(String value);

} // CIM_UserContact

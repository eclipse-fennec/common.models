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
 * A representation of the model object '<em><b>CIM Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Organization class is used to represent an organization such as a corporation or other autonomous entity. The class is defined so as to incorporate commonly-used LDAP attributes to permit implementations to easily derive this information from LDAP-accessible directories. This class's properties are a subset of a related class, OtherOrganizationInformation, which defines all the group properties and in array form for directory compatibility.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Organization#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Organization#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Organization#getBusinessCategory <em>Business Category</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Organization#getFacsimileTelephoneNumber <em>Facsimile Telephone Number</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Organization#getLocalityName <em>Locality Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Organization#getMail <em>Mail</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Organization#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Organization#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Organization#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Organization#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Organization#getTelephoneNumber <em>Telephone Number</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Organization()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::User::Org' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_Organization extends CIM_OrganizationalEntity {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Organization_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Organization#getCreationClassName <em>Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_Organization_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='1024'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Organization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Business Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property describes the kind of business performed by an organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Business Category</em>' attribute.
	 * @see #setBusinessCategory(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Organization_BusinessCategory()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='128'"
	 * @generated
	 */
	String getBusinessCategory();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Organization#getBusinessCategory <em>Business Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Category</em>' attribute.
	 * @see #getBusinessCategory()
	 * @generated
	 */
	void setBusinessCategory(String value);

	/**
	 * Returns the value of the '<em><b>Facsimile Telephone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization's facsimile telephone number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facsimile Telephone Number</em>' attribute.
	 * @see #setFacsimileTelephoneNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Organization_FacsimileTelephoneNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getFacsimileTelephoneNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Organization#getFacsimileTelephoneNumber <em>Facsimile Telephone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facsimile Telephone Number</em>' attribute.
	 * @see #getFacsimileTelephoneNumber()
	 * @generated
	 */
	void setFacsimileTelephoneNumber(String value);

	/**
	 * Returns the value of the '<em><b>Locality Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property contains the name of a locality, such as a city, county or other geographic region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locality Name</em>' attribute.
	 * @see #setLocalityName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Organization_LocalityName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getLocalityName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Organization#getLocalityName <em>Locality Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locality Name</em>' attribute.
	 * @see #getLocalityName()
	 * @generated
	 */
	void setLocalityName(String value);

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Based on RFC1274, the mail box addresses for the organization as defined in RFC822.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mail</em>' attribute.
	 * @see #setMail(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Organization_Mail()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getMail();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Organization#getMail <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail</em>' attribute.
	 * @see #getMail()
	 * @generated
	 */
	void setMail(String value);

	/**
	 * Returns the value of the '<em><b>Organization Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Name</em>' attribute.
	 * @see #setOrganizationName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Organization_OrganizationName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true'"
	 * @generated
	 */
	String getOrganizationName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Organization#getOrganizationName <em>Organization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Name</em>' attribute.
	 * @see #getOrganizationName()
	 * @generated
	 */
	void setOrganizationName(String value);

	/**
	 * Returns the value of the '<em><b>Postal Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PostalAddress property values specify the address information required for the physical delivery of postal messages by the postal authority to the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Address</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_Organization_PostalAddress()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getPostalAddress();

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PostalCode property specifies the postal code of the organization. If this value is present it will be part of the object's postal address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Organization_PostalCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='40'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Organization#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>State Or Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State or Province name property specifies a state or province.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Or Province</em>' attribute.
	 * @see #setStateOrProvince(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Organization_StateOrProvince()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getStateOrProvince();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Organization#getStateOrProvince <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Or Province</em>' attribute.
	 * @see #getStateOrProvince()
	 * @generated
	 */
	void setStateOrProvince(String value);

	/**
	 * Returns the value of the '<em><b>Telephone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TelephoneNumber property specifies a telephone number of the organization, e.g. + 44 582 10101).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number</em>' attribute.
	 * @see #setTelephoneNumber(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Organization_TelephoneNumber()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='32'"
	 * @generated
	 */
	String getTelephoneNumber();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Organization#getTelephoneNumber <em>Telephone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone Number</em>' attribute.
	 * @see #getTelephoneNumber()
	 * @generated
	 */
	void setTelephoneNumber(String value);

} // CIM_Organization

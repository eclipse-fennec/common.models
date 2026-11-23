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
package org.dmtf.prs;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRS Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about a personal contact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Person#getSalutation <em>Salutation</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Person#getTitle <em>Title</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Person#getContactType <em>Contact Type</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Person#getCommunicationMode <em>Communication Mode</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Person()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_Person extends PRS_ContactItem {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact's first name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Person_FirstName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact's last name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Person_LastName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Person#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Salutation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the contact is addressed, i.e. Dr., Mr., Ms., Mrs., etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Salutation</em>' attribute.
	 * @see #setSalutation(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Person_Salutation()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSalutation();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Person#getSalutation <em>Salutation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salutation</em>' attribute.
	 * @see #getSalutation()
	 * @generated
	 */
	void setSalutation(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact's business title.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Person_Title()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Person#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Contact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the contact. For example, they may have responsibilities not apparent from their title.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Type</em>' attribute.
	 * @see #setContactType(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Person_ContactType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getContactType();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Person#getContactType <em>Contact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Type</em>' attribute.
	 * @see #getContactType()
	 * @generated
	 */
	void setContactType(String value);

	/**
	 * Returns the value of the '<em><b>Communication Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact's preferred communication method. See the PRS_Location.LocationType property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Mode</em>' attribute.
	 * @see #setCommunicationMode(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Person_CommunicationMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"254\",\"255\"]' Values='[\"Primary_Voice\",\"Alternate_Voice\",\"Fax\",\"Email\",\"URL\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getCommunicationMode();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Person#getCommunicationMode <em>Communication Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Mode</em>' attribute.
	 * @see #getCommunicationMode()
	 * @generated
	 */
	void setCommunicationMode(Integer value);

} // PRS_Person

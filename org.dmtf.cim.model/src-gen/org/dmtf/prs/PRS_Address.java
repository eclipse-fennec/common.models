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
 * A representation of the model object '<em><b>PRS Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provides address information for PRS_ContactItem.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.prs.PRS_Address#getAddressType <em>Address Type</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Address#getAddress1 <em>Address1</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Address#getAddress2 <em>Address2</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Address#getAddress3 <em>Address3</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Address#getAddress4 <em>Address4</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Address#getCity <em>City</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Address#getRegion <em>Region</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Address#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Address#getTimeZone <em>Time Zone</em>}</li>
 *   <li>{@link org.dmtf.prs.PRS_Address#getCountry <em>Country</em>}</li>
 * </ul>
 *
 * @see org.dmtf.prs.PrsPackage#getPRS_Address()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='PRS::Support' keys='PRSUniqueName'"
 * @generated
 */
@ProviderType
public interface PRS_Address extends PRS_ExchangeElement {
	/**
	 * Returns the value of the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Type</em>' attribute.
	 * @see #setAddressType(Integer)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Address_AddressType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"254\",\"255\"]' Values='[\"Primary\",\"Shipping\",\"Billing\",\"Service\",\"Other\",\"Unknown\"]'"
	 * @generated
	 */
	Integer getAddressType();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Address#getAddressType <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Type</em>' attribute.
	 * @see #getAddressType()
	 * @generated
	 */
	void setAddressType(Integer value);

	/**
	 * Returns the value of the '<em><b>Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First line of address information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address1</em>' attribute.
	 * @see #setAddress1(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Address_Address1()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAddress1();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Address#getAddress1 <em>Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address1</em>' attribute.
	 * @see #getAddress1()
	 * @generated
	 */
	void setAddress1(String value);

	/**
	 * Returns the value of the '<em><b>Address2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Second line of address information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address2</em>' attribute.
	 * @see #setAddress2(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Address_Address2()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAddress2();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Address#getAddress2 <em>Address2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address2</em>' attribute.
	 * @see #getAddress2()
	 * @generated
	 */
	void setAddress2(String value);

	/**
	 * Returns the value of the '<em><b>Address3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Third line of address information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address3</em>' attribute.
	 * @see #setAddress3(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Address_Address3()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAddress3();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Address#getAddress3 <em>Address3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address3</em>' attribute.
	 * @see #getAddress3()
	 * @generated
	 */
	void setAddress3(String value);

	/**
	 * Returns the value of the '<em><b>Address4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fourth line of address information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address4</em>' attribute.
	 * @see #setAddress4(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Address_Address4()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAddress4();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Address#getAddress4 <em>Address4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address4</em>' attribute.
	 * @see #getAddress4()
	 * @generated
	 */
	void setAddress4(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The city.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Address_City()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Address#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specific region, such as state or province.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Address_Region()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Address#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The country's postal code for the address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Address_PostalCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Address#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time zone of the address.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Zone</em>' attribute.
	 * @see #setTimeZone(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Address_TimeZone()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getTimeZone();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Address#getTimeZone <em>Time Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Zone</em>' attribute.
	 * @see #getTimeZone()
	 * @generated
	 */
	void setTimeZone(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The country code, based on ISO/IEC 3166.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see org.dmtf.prs.PrsPackage#getPRS_Address_Country()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link org.dmtf.prs.PRS_Address#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

} // PRS_Address

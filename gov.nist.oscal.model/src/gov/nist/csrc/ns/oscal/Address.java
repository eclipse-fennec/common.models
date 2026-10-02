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
package gov.nist.csrc.ns.oscal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Address</b>
 *   : A postal address for the location.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Address#getAddrLine <em>Addr Line</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Address#getCity <em>City</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Address#getState <em>State</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Address#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Address#getCountry <em>Country</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Address#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAddress()
 * @model extendedMetaData="name='oscal-metadata-address-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Address extends EObject {
	/**
	 * Returns the value of the '<em><b>Addr Line</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr Line</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAddress_AddrLine()
	 * @model unique="false" dataType="gov.nist.csrc.ns.oscal.OscalMetadataAddrLineFIELD"
	 *        extendedMetaData="kind='element' name='addr-line' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='addr-lines'"
	 * @generated
	 */
	EList<String> getAddrLine();

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAddress_City()
	 * @model dataType="gov.nist.csrc.ns.oscal.CityType"
	 *        extendedMetaData="kind='element' name='city' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Address#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAddress_State()
	 * @model dataType="gov.nist.csrc.ns.oscal.StateType"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Address#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAddress_PostalCode()
	 * @model dataType="gov.nist.csrc.ns.oscal.PostalCodeType"
	 *        extendedMetaData="kind='element' name='postal-code' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Address#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAddress_Country()
	 * @model dataType="gov.nist.csrc.ns.oscal.CountryType"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Address#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Address Type</b>
	 *   : Indicates the type of address.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAddress_Type()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Address#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Address

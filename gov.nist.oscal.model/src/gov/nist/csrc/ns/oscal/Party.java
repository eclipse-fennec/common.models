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
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                        
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Party</b>
 *   : An organization or person, which may be associated with roles or other concepts within the current or linked OSCAL document.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Party#getName <em>Name</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Party#getShortName <em>Short Name</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Party#getExternalId <em>External Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Party#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Party#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Party#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Party#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Party#getAddress <em>Address</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Party#getLocationUuid <em>Location Uuid</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Party#getMemberOfOrganization <em>Member Of Organization</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Party#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Party#getType <em>Type</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Party#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParty()
 * @model extendedMetaData="name='party_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Party extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParty_Name()
	 * @model dataType="gov.nist.csrc.ns.oscal.NameType"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Party#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParty_ShortName()
	 * @model dataType="gov.nist.csrc.ns.oscal.ShortNameType1"
	 *        extendedMetaData="kind='element' name='short-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Party#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>External Id</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ExternalId}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Id</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParty_ExternalId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='external-id' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='external-ids'"
	 * @generated
	 */
	EList<ExternalId> getExternalId();

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParty_Prop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prop' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='props'"
	 * @generated
	 */
	EList<Property> getProp();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParty_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Email Address</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email Address</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParty_EmailAddress()
	 * @model unique="false" dataType="gov.nist.csrc.ns.oscal.OscalMetadataEmailAddressFIELD"
	 *        extendedMetaData="kind='element' name='email-address' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='email-addresses'"
	 * @generated
	 */
	EList<String> getEmailAddress();

	/**
	 * Returns the value of the '<em><b>Telephone Number</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.TelephoneNumber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone Number</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParty_TelephoneNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='telephone-number' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='telephone-numbers'"
	 * @generated
	 */
	EList<TelephoneNumber> getTelephoneNumber();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Address}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParty_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='addresses'"
	 * @generated
	 */
	EList<Address> getAddress();

	/**
	 * Returns the value of the '<em><b>Location Uuid</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Uuid</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParty_LocationUuid()
	 * @model unique="false" dataType="gov.nist.csrc.ns.oscal.OscalMetadataLocationUuidFIELD"
	 *        extendedMetaData="kind='element' name='location-uuid' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='location-uuids'"
	 * @generated
	 */
	EList<String> getLocationUuid();

	/**
	 * Returns the value of the '<em><b>Member Of Organization</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Of Organization</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParty_MemberOfOrganization()
	 * @model unique="false" dataType="gov.nist.csrc.ns.oscal.MemberOfOrganizationType"
	 *        extendedMetaData="kind='element' name='member-of-organization' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='member-of-organizations'"
	 * @generated
	 */
	EList<String> getMemberOfOrganization();

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                              
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Remarks</b>
	 *   : Additional commentary about the containing object.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParty_Remarks()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Party#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                           
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Party Type</b>
	 *   : A category describing the kind of party the object describes.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParty_Type()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Party#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                           
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Party Universally Unique Identifier</b>
	 *   : A unique identifier for the party.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParty_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Party#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // Party

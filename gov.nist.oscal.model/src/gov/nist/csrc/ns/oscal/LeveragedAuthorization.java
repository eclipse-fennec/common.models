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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leveraged Authorization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                        
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Leveraged Authorization</b>
 *   : A description of another authorized system from which this system inherits capabilities that satisfy security requirements. Another term for this concept is a common control provider.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getPartyUuid <em>Party Uuid</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getDateAuthorized <em>Date Authorized</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getLeveragedAuthorization()
 * @model extendedMetaData="name='leveraged-authorization_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LeveragedAuthorization extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">title field</b>
	 *   : A human readable name for the leveraged authorization in the context of the system.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(MarkupLineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getLeveragedAuthorization_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupLineDatatype getTitle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupLineDatatype value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getLeveragedAuthorization_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getLeveragedAuthorization_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Party Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party Uuid</em>' attribute.
	 * @see #setPartyUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getLeveragedAuthorization_PartyUuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.PartyUuidType" required="true"
	 *        extendedMetaData="kind='element' name='party-uuid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPartyUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getPartyUuid <em>Party Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party Uuid</em>' attribute.
	 * @see #getPartyUuid()
	 * @generated
	 */
	void setPartyUuid(String value);

	/**
	 * Returns the value of the '<em><b>Date Authorized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Authorized</em>' attribute.
	 * @see #setDateAuthorized(XMLGregorianCalendar)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getLeveragedAuthorization_DateAuthorized()
	 * @model dataType="gov.nist.csrc.ns.oscal.OscalSspDateAuthorizedFIELD" required="true"
	 *        extendedMetaData="kind='element' name='date-authorized' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDateAuthorized();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getDateAuthorized <em>Date Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Authorized</em>' attribute.
	 * @see #getDateAuthorized()
	 * @generated
	 */
	void setDateAuthorized(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                              
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Remarks</b>
	 *   : Additional commentary about the containing object.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' containment reference.
	 * @see #setRemarks(MarkupMultilineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getLeveragedAuthorization_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultilineDatatype value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                           
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Leveraged Authorization Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier with cross-instance scope and can be used to reference this leveraged authorization elsewhere in this or other OSCAL instances. The locally defined UUID of the leveraged authorization can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance). This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getLeveragedAuthorization_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.LeveragedAuthorization#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // LeveragedAuthorization

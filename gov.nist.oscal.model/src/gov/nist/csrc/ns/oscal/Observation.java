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
 * A representation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Observation</b>
 *   : Describes an individual observation.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Observation#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Observation#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Observation#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Observation#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Observation#getMethod <em>Method</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Observation#getType <em>Type</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Observation#getOrigin <em>Origin</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Observation#getSubject <em>Subject</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Observation#getRelevantEvidence <em>Relevant Evidence</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Observation#getCollected <em>Collected</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Observation#getExpires <em>Expires</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Observation#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Observation#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getObservation()
 * @model extendedMetaData="name='oscal-assessment-common-observation-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Observation extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Observation Title</b>
	 *   : The title for this observation.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getObservation_Title()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupLineDatatype"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Observation#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Observation Description</b>
	 *   : A human-readable description of this assessment observation.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getObservation_Description()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Observation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getObservation_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getObservation_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getObservation_Method()
	 * @model unique="false" dataType="gov.nist.csrc.ns.oscal.MethodType" required="true"
	 *        extendedMetaData="kind='element' name='method' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='methods'"
	 * @generated
	 */
	EList<String> getMethod();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getObservation_Type()
	 * @model unique="false" dataType="gov.nist.csrc.ns.oscal.TypeType"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='types'"
	 * @generated
	 */
	EList<String> getType();

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Origin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getObservation_Origin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='origins'"
	 * @generated
	 */
	EList<Origin> getOrigin();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.SubjectReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getObservation_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='subjects'"
	 * @generated
	 */
	EList<SubjectReference> getSubject();

	/**
	 * Returns the value of the '<em><b>Relevant Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.RelevantEvidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevant Evidence</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getObservation_RelevantEvidence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relevant-evidence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelevantEvidence> getRelevantEvidence();

	/**
	 * Returns the value of the '<em><b>Collected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collected</em>' attribute.
	 * @see #setCollected(XMLGregorianCalendar)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getObservation_Collected()
	 * @model dataType="gov.nist.csrc.ns.oscal.CollectedType" required="true"
	 *        extendedMetaData="kind='element' name='collected' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCollected();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Observation#getCollected <em>Collected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collected</em>' attribute.
	 * @see #getCollected()
	 * @generated
	 */
	void setCollected(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expires</em>' attribute.
	 * @see #setExpires(XMLGregorianCalendar)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getObservation_Expires()
	 * @model dataType="gov.nist.csrc.ns.oscal.ExpiresType"
	 *        extendedMetaData="kind='element' name='expires' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpires();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Observation#getExpires <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires</em>' attribute.
	 * @see #getExpires()
	 * @generated
	 */
	void setExpires(XMLGregorianCalendar value);

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getObservation_Remarks()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Observation#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Observation Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier with cross-instance scope that can be used to reference this observation elsewhere in this or other OSCAL instances. The locally defined UUID of the observation can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance). This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getObservation_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Observation#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // Observation

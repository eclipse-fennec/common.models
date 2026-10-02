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
 * A representation of the model object '<em><b>Assessment Log Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                                 
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Assessment Log Entry</b>
 *   : Identifies the result of an action and/or task that occurred as part of executing an assessment plan or an assessment event that occurred in producing the assessment results.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getStart <em>Start</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getEnd <em>End</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getLoggedBy <em>Logged By</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getRelatedTask <em>Related Task</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentLogEntry()
 * @model extendedMetaData="name='entry_._1_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AssessmentLogEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                          
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Action Title</b>
	 *   : The title for this event.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentLogEntry_Title()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupLineDatatype"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getTitle <em>Title</em>}' attribute.
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
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Action Description</b>
	 *   : A human-readable description of this event.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentLogEntry_Description()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(XMLGregorianCalendar)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentLogEntry_Start()
	 * @model dataType="gov.nist.csrc.ns.oscal.StartType" required="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStart();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(XMLGregorianCalendar)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentLogEntry_End()
	 * @model dataType="gov.nist.csrc.ns.oscal.EndType"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEnd();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentLogEntry_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentLogEntry_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Logged By</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.LoggedBy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logged By</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentLogEntry_LoggedBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='logged-by' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LoggedBy> getLoggedBy();

	/**
	 * Returns the value of the '<em><b>Related Task</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.RelatedTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Task</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentLogEntry_RelatedTask()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='related-task' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='related-tasks'"
	 * @generated
	 */
	EList<RelatedTask> getRelatedTask();

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentLogEntry_Remarks()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getRemarks <em>Remarks</em>}' attribute.
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
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Assessment Log Entry Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier with cross-instance scope that can be used to reference an assessment event in this or other OSCAL instances. The locally defined UUID of the assessment log entry can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance). This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentLogEntry_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentLogEntry#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // AssessmentLogEntry

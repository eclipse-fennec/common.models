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
 * A representation of the model object '<em><b>Assessment Subject Placeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Assessment Subject Placeholder</b>
 *   : Used when the assessment subjects will be determined as part of one or more other assessment activities. These assessment subjects will be recorded in the assessment results in the assessment log.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getSource <em>Source</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentSubjectPlaceholder()
 * @model extendedMetaData="name='oscal-assessment-common-assessment-subject-placeholder-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AssessmentSubjectPlaceholder extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Assessment Subject Placeholder Description</b>
	 *   : A human-readable description of intent of this assessment subject placeholder.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(MarkupMultilineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentSubjectPlaceholder_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(MarkupMultilineDatatype value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.PlaceholderSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentSubjectPlaceholder_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlaceholderSource> getSource();

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentSubjectPlaceholder_Prop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prop' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Property> getProp();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentSubjectPlaceholder_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Link> getLink();

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentSubjectPlaceholder_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getRemarks <em>Remarks</em>}' containment reference.
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
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Assessment Subject Placeholder Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier for a set of assessment subjects that will be identified by a task or an activity that is part of a task. The locally defined UUID of the assessment subject placeholder can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance). This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentSubjectPlaceholder_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentSubjectPlaceholder#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // AssessmentSubjectPlaceholder

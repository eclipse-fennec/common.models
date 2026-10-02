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
 * A representation of the model object '<em><b>Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Assessment Result</b>
 *   : Used by the assessment results and POA&amp;M. In the assessment results, this identifies all of the assessment observations and findings, initial and residual risks, deviations, and disposition. In the POA&amp;M, this identifies initial and residual risks, deviations, and disposition.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Result#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Result#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Result#getStart <em>Start</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Result#getEnd <em>End</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Result#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Result#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Result#getLocalDefinitions <em>Local Definitions</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Result#getReviewedControls <em>Reviewed Controls</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Result#getAttestation <em>Attestation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Result#getAssessmentLog <em>Assessment Log</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Result#getObservation <em>Observation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Result#getRisk <em>Risk</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Result#getFinding <em>Finding</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Result#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Result#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult()
 * @model extendedMetaData="name='oscal-ar-result-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Result extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Results Title</b>
	 *   : The title for this set of results.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(MarkupLineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupLineDatatype getTitle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Result#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(MarkupLineDatatype value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Results Description</b>
	 *   : A human-readable description of this set of test results.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(MarkupMultilineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Result#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(MarkupMultilineDatatype value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(XMLGregorianCalendar)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult_Start()
	 * @model dataType="gov.nist.csrc.ns.oscal.StartType2" required="true"
	 *        extendedMetaData="kind='element' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getStart();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Result#getStart <em>Start</em>}' attribute.
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult_End()
	 * @model dataType="gov.nist.csrc.ns.oscal.EndType2"
	 *        extendedMetaData="kind='element' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEnd();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Result#getEnd <em>End</em>}' attribute.
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Local Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Definitions</em>' containment reference.
	 * @see #setLocalDefinitions(ResultLocalDefinitions)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult_LocalDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='local-definitions' namespace='##targetNamespace'"
	 * @generated
	 */
	ResultLocalDefinitions getLocalDefinitions();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Result#getLocalDefinitions <em>Local Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Definitions</em>' containment reference.
	 * @see #getLocalDefinitions()
	 * @generated
	 */
	void setLocalDefinitions(ResultLocalDefinitions value);

	/**
	 * Returns the value of the '<em><b>Reviewed Controls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviewed Controls</em>' containment reference.
	 * @see #setReviewedControls(ReviewedControls)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult_ReviewedControls()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reviewed-controls' namespace='##targetNamespace'"
	 * @generated
	 */
	ReviewedControls getReviewedControls();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Result#getReviewedControls <em>Reviewed Controls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reviewed Controls</em>' containment reference.
	 * @see #getReviewedControls()
	 * @generated
	 */
	void setReviewedControls(ReviewedControls value);

	/**
	 * Returns the value of the '<em><b>Attestation</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Attestation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attestation</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult_Attestation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attestation' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='attestations'"
	 * @generated
	 */
	EList<Attestation> getAttestation();

	/**
	 * Returns the value of the '<em><b>Assessment Log</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment Log</em>' containment reference.
	 * @see #setAssessmentLog(AssessmentLog)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult_AssessmentLog()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assessment-log' namespace='##targetNamespace'"
	 * @generated
	 */
	AssessmentLog getAssessmentLog();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Result#getAssessmentLog <em>Assessment Log</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment Log</em>' containment reference.
	 * @see #getAssessmentLog()
	 * @generated
	 */
	void setAssessmentLog(AssessmentLog value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Observation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observation</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult_Observation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='observation' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='observations'"
	 * @generated
	 */
	EList<Observation> getObservation();

	/**
	 * Returns the value of the '<em><b>Risk</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Risk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult_Risk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='risk' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='risks'"
	 * @generated
	 */
	EList<Risk> getRisk();

	/**
	 * Returns the value of the '<em><b>Finding</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Finding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finding</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult_Finding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='finding' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='findings'"
	 * @generated
	 */
	EList<Finding> getFinding();

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Result#getRemarks <em>Remarks</em>}' containment reference.
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
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Results Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier with cross-instance scope that can be used to reference this set of results in this or other OSCAL instances. The locally defined UUID of the assessment result can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance). This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResult_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Result#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // Result

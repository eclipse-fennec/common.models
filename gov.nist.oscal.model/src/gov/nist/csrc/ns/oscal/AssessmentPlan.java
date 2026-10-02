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
 * A representation of the model object '<em><b>Assessment Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Security Assessment Plan (SAP)</b>
 *   : An assessment plan, such as those provided by a FedRAMP assessor.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getImportSsp <em>Import Ssp</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getLocalDefinitions <em>Local Definitions</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getTermsAndConditions <em>Terms And Conditions</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getReviewedControls <em>Reviewed Controls</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getAssessmentSubject <em>Assessment Subject</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getAssessmentAssets <em>Assessment Assets</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getTask <em>Task</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getBackMatter <em>Back Matter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlan()
 * @model extendedMetaData="name='oscal-ap-assessment-plan-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AssessmentPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlan_Metadata()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

	/**
	 * Returns the value of the '<em><b>Import Ssp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Ssp</em>' containment reference.
	 * @see #setImportSsp(ImportSsp)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlan_ImportSsp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='import-ssp' namespace='##targetNamespace'"
	 * @generated
	 */
	ImportSsp getImportSsp();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getImportSsp <em>Import Ssp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Ssp</em>' containment reference.
	 * @see #getImportSsp()
	 * @generated
	 */
	void setImportSsp(ImportSsp value);

	/**
	 * Returns the value of the '<em><b>Local Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Definitions</em>' containment reference.
	 * @see #setLocalDefinitions(AssessmentPlanLocalDefinitions)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlan_LocalDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='local-definitions' namespace='##targetNamespace'"
	 * @generated
	 */
	AssessmentPlanLocalDefinitions getLocalDefinitions();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getLocalDefinitions <em>Local Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Definitions</em>' containment reference.
	 * @see #getLocalDefinitions()
	 * @generated
	 */
	void setLocalDefinitions(AssessmentPlanLocalDefinitions value);

	/**
	 * Returns the value of the '<em><b>Terms And Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms And Conditions</em>' containment reference.
	 * @see #setTermsAndConditions(TermsAndConditions)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlan_TermsAndConditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='terms-and-conditions' namespace='##targetNamespace'"
	 * @generated
	 */
	TermsAndConditions getTermsAndConditions();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getTermsAndConditions <em>Terms And Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terms And Conditions</em>' containment reference.
	 * @see #getTermsAndConditions()
	 * @generated
	 */
	void setTermsAndConditions(TermsAndConditions value);

	/**
	 * Returns the value of the '<em><b>Reviewed Controls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviewed Controls</em>' containment reference.
	 * @see #setReviewedControls(ReviewedControls)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlan_ReviewedControls()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reviewed-controls' namespace='##targetNamespace'"
	 * @generated
	 */
	ReviewedControls getReviewedControls();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getReviewedControls <em>Reviewed Controls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reviewed Controls</em>' containment reference.
	 * @see #getReviewedControls()
	 * @generated
	 */
	void setReviewedControls(ReviewedControls value);

	/**
	 * Returns the value of the '<em><b>Assessment Subject</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.AssessmentSubject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment Subject</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlan_AssessmentSubject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assessment-subject' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='assessment-subjects'"
	 * @generated
	 */
	EList<AssessmentSubject> getAssessmentSubject();

	/**
	 * Returns the value of the '<em><b>Assessment Assets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment Assets</em>' containment reference.
	 * @see #setAssessmentAssets(AssessmentAssets)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlan_AssessmentAssets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assessment-assets' namespace='##targetNamespace'"
	 * @generated
	 */
	AssessmentAssets getAssessmentAssets();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getAssessmentAssets <em>Assessment Assets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment Assets</em>' containment reference.
	 * @see #getAssessmentAssets()
	 * @generated
	 */
	void setAssessmentAssets(AssessmentAssets value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlan_Task()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='task' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='tasks'"
	 * @generated
	 */
	EList<Task> getTask();

	/**
	 * Returns the value of the '<em><b>Back Matter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back Matter</em>' containment reference.
	 * @see #setBackMatter(BackMatter)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlan_BackMatter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='back-matter' namespace='##targetNamespace'"
	 * @generated
	 */
	BackMatter getBackMatter();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getBackMatter <em>Back Matter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Matter</em>' containment reference.
	 * @see #getBackMatter()
	 * @generated
	 */
	void setBackMatter(BackMatter value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Assessment Plan Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier with cross-instance scope that can be used to reference this assessment plan in this or other OSCAL instances. The locally defined UUID of the assessment plan can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance). This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlan_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentPlan#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // AssessmentPlan

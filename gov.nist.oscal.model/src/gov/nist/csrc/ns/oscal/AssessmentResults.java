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
 * A representation of the model object '<em><b>Assessment Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Security Assessment Results (SAR)</b>
 *   : Security assessment results, such as those provided by a FedRAMP assessor in the FedRAMP Security Assessment Report.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentResults#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentResults#getImportAp <em>Import Ap</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentResults#getLocalDefinitions <em>Local Definitions</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentResults#getResult <em>Result</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentResults#getBackMatter <em>Back Matter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentResults#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentResults()
 * @model extendedMetaData="name='oscal-ar-assessment-results-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AssessmentResults extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(Metadata)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentResults_Metadata()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	Metadata getMetadata();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentResults#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Metadata value);

	/**
	 * Returns the value of the '<em><b>Import Ap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Ap</em>' containment reference.
	 * @see #setImportAp(ImportAp)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentResults_ImportAp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='import-ap' namespace='##targetNamespace'"
	 * @generated
	 */
	ImportAp getImportAp();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentResults#getImportAp <em>Import Ap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Ap</em>' containment reference.
	 * @see #getImportAp()
	 * @generated
	 */
	void setImportAp(ImportAp value);

	/**
	 * Returns the value of the '<em><b>Local Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Definitions</em>' containment reference.
	 * @see #setLocalDefinitions(AssessmentResultsLocalDefinitions)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentResults_LocalDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='local-definitions' namespace='##targetNamespace'"
	 * @generated
	 */
	AssessmentResultsLocalDefinitions getLocalDefinitions();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentResults#getLocalDefinitions <em>Local Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Definitions</em>' containment reference.
	 * @see #getLocalDefinitions()
	 * @generated
	 */
	void setLocalDefinitions(AssessmentResultsLocalDefinitions value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Result}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentResults_Result()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='result' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='results'"
	 * @generated
	 */
	EList<Result> getResult();

	/**
	 * Returns the value of the '<em><b>Back Matter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back Matter</em>' containment reference.
	 * @see #setBackMatter(BackMatter)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentResults_BackMatter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='back-matter' namespace='##targetNamespace'"
	 * @generated
	 */
	BackMatter getBackMatter();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentResults#getBackMatter <em>Back Matter</em>}' containment reference.
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
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Assessment Results Universally Unique Identifier</b>
	 *   : A machine-oriented, globally unique identifier with cross-instance scope that can be used to reference this assessment results instance in this or other OSCAL instances. The locally defined UUID of the assessment result can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance). This UUID should be assigned per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentResults_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentResults#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // AssessmentResults

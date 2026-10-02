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
 * A representation of the model object '<em><b>Assessment Results Local Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                        
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Local Definitions</b>
 *   : Used to define data objects that are used in the assessment plan, that do not appear in the referenced SSP.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions#getObjectivesAndMethods <em>Objectives And Methods</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentResultsLocalDefinitions()
 * @model extendedMetaData="name='local-definitions_._2_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AssessmentResultsLocalDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Objectives And Methods</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.LocalObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectives And Methods</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentResultsLocalDefinitions_ObjectivesAndMethods()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='objectives-and-methods' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalObjective> getObjectivesAndMethods();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentResultsLocalDefinitions_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='activities'"
	 * @generated
	 */
	EList<Activity> getActivity();

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentResultsLocalDefinitions_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentResultsLocalDefinitions#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultilineDatatype value);

} // AssessmentResultsLocalDefinitions

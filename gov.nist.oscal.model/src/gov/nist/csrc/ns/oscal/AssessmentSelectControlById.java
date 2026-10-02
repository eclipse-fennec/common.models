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
 * A representation of the model object '<em><b>Assessment Select Control By Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Select Control</b>
 *   : Used to select a control for inclusion/exclusion based on one or more control identifiers. A set of statement identifiers can be used to target the inclusion/exclusion to only specific control statements providing more granularity over the specific statements that are within the assessment scope.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentSelectControlById#getStatementId <em>Statement Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentSelectControlById#getControlId <em>Control Id</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentSelectControlById()
 * @model extendedMetaData="name='oscal-assessment-common-select-control-by-id-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AssessmentSelectControlById extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement Id</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentSelectControlById_StatementId()
	 * @model unique="false" dataType="gov.nist.csrc.ns.oscal.StatementIdType"
	 *        extendedMetaData="kind='element' name='statement-id' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='statement-ids'"
	 * @generated
	 */
	EList<String> getStatementId();

	/**
	 * Returns the value of the '<em><b>Control Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Control Identifier Reference</b>
	 *   : A reference to a control with a corresponding id value. When referencing an externally defined control, the Control Identifier Reference must be used in the context of the external / imported OSCAL instance (e.g., uri-reference).
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Id</em>' attribute.
	 * @see #setControlId(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentSelectControlById_ControlId()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='control-id'"
	 * @generated
	 */
	String getControlId();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentSelectControlById#getControlId <em>Control Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Id</em>' attribute.
	 * @see #getControlId()
	 * @generated
	 */
	void setControlId(String value);

} // AssessmentSelectControlById

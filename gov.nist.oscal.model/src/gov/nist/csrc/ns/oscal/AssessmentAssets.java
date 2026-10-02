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
 * A representation of the model object '<em><b>Assessment Assets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Assessment Assets</b>
 *   : Identifies the assets used to perform this assessment, such as the assessment team, scanning tools, and assumptions.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentAssets#getComponent <em>Component</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentAssets#getAssessmentPlatform <em>Assessment Platform</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentAssets()
 * @model extendedMetaData="name='oscal-assessment-common-assessment-assets-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AssessmentAssets extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.SystemComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentAssets_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='components'"
	 * @generated
	 */
	EList<SystemComponent> getComponent();

	/**
	 * Returns the value of the '<em><b>Assessment Platform</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.AssessmentPlatform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment Platform</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentAssets_AssessmentPlatform()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='assessment-platform' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='assessment-platforms'"
	 * @generated
	 */
	EList<AssessmentPlatform> getAssessmentPlatform();

} // AssessmentAssets

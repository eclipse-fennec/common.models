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
 * A representation of the model object '<em><b>Reviewed Controls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Reviewed Controls and Control Objectives</b>
 *   : Identifies the controls being assessed and their control objectives.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.ReviewedControls#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ReviewedControls#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ReviewedControls#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ReviewedControls#getControlSelection <em>Control Selection</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ReviewedControls#getControlObjectiveSelection <em>Control Objective Selection</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ReviewedControls#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getReviewedControls()
 * @model extendedMetaData="name='oscal-assessment-common-reviewed-controls-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReviewedControls extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Control Objective Description</b>
	 *   : A human-readable description of control objectives.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(MarkupMultilineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getReviewedControls_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ReviewedControls#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(MarkupMultilineDatatype value);

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getReviewedControls_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getReviewedControls_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Control Selection</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ControlSelection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Selection</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getReviewedControls_ControlSelection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='control-selection' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='control-selections'"
	 * @generated
	 */
	EList<ControlSelection> getControlSelection();

	/**
	 * Returns the value of the '<em><b>Control Objective Selection</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Objective Selection</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getReviewedControls_ControlObjectiveSelection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='control-objective-selection' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='control-objective-selections'"
	 * @generated
	 */
	EList<ControlObjectiveSelection> getControlObjectiveSelection();

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getReviewedControls_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ReviewedControls#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultilineDatatype value);

} // ReviewedControls

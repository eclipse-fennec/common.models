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
 * A representation of the model object '<em><b>Control Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                        
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Assessed Controls</b>
 *   : Identifies the controls being assessed. In the assessment plan, these are the planned controls. In the assessment results, these are the actual controls, and reflects any changes from the plan.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlSelection#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlSelection#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlSelection#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlSelection#getIncludeAll <em>Include All</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlSelection#getIncludeControl <em>Include Control</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlSelection#getExcludeControl <em>Exclude Control</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlSelection#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlSelection()
 * @model extendedMetaData="name='control-selection_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ControlSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Assessed Controls Description</b>
	 *   : A human-readable description of in-scope controls specified for assessment.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(MarkupMultilineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlSelection_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ControlSelection#getDescription <em>Description</em>}' containment reference.
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlSelection_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlSelection_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Include All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include All</em>' containment reference.
	 * @see #setIncludeAll(IncludeAll)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlSelection_IncludeAll()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include-all' namespace='##targetNamespace'"
	 * @generated
	 */
	IncludeAll getIncludeAll();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ControlSelection#getIncludeAll <em>Include All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include All</em>' containment reference.
	 * @see #getIncludeAll()
	 * @generated
	 */
	void setIncludeAll(IncludeAll value);

	/**
	 * Returns the value of the '<em><b>Include Control</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.AssessmentSelectControlById}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Control</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlSelection_IncludeControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include-control' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='include-controls'"
	 * @generated
	 */
	EList<AssessmentSelectControlById> getIncludeControl();

	/**
	 * Returns the value of the '<em><b>Exclude Control</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.AssessmentSelectControlById}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Control</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlSelection_ExcludeControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude-control' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='exclude-controls'"
	 * @generated
	 */
	EList<AssessmentSelectControlById> getExcludeControl();

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlSelection_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ControlSelection#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultilineDatatype value);

} // ControlSelection

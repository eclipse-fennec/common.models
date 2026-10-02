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
 * A representation of the model object '<em><b>Control Objective Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                        
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Referenced Control Objectives</b>
 *   : Identifies the control objectives of the assessment. In the assessment plan, these are the planned objectives. In the assessment results, these are the assessed objectives, and reflects any changes from the plan.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getIncludeAll <em>Include All</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getIncludeObjective <em>Include Objective</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getExcludeObjective <em>Exclude Objective</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlObjectiveSelection()
 * @model extendedMetaData="name='control-objective-selection_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ControlObjectiveSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Control Objectives Description</b>
	 *   : A human-readable description of this collection of control objectives.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(MarkupMultilineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlObjectiveSelection_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getDescription <em>Description</em>}' containment reference.
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlObjectiveSelection_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlObjectiveSelection_Link()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlObjectiveSelection_IncludeAll()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include-all' namespace='##targetNamespace'"
	 * @generated
	 */
	IncludeAll getIncludeAll();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getIncludeAll <em>Include All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include All</em>' containment reference.
	 * @see #getIncludeAll()
	 * @generated
	 */
	void setIncludeAll(IncludeAll value);

	/**
	 * Returns the value of the '<em><b>Include Objective</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.SelectObjectiveById}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Objective</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlObjectiveSelection_IncludeObjective()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='include-objective' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='include-objectives'"
	 * @generated
	 */
	EList<SelectObjectiveById> getIncludeObjective();

	/**
	 * Returns the value of the '<em><b>Exclude Objective</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.SelectObjectiveById}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Objective</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlObjectiveSelection_ExcludeObjective()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude-objective' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='exclude-objectives'"
	 * @generated
	 */
	EList<SelectObjectiveById> getExcludeObjective();

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlObjectiveSelection_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ControlObjectiveSelection#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultilineDatatype value);

} // ControlObjectiveSelection

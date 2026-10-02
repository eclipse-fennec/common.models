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
 * A representation of the model object '<em><b>Assessment Plan Local Definitions</b></em>'.
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
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getComponent <em>Component</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getUser <em>User</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getObjectivesAndMethods <em>Objectives And Methods</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getActivity <em>Activity</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlanLocalDefinitions()
 * @model extendedMetaData="name='local-definitions_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AssessmentPlanLocalDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.SystemComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlanLocalDefinitions_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='components'"
	 * @generated
	 */
	EList<SystemComponent> getComponent();

	/**
	 * Returns the value of the '<em><b>Inventory Item</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InventoryItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inventory Item</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlanLocalDefinitions_InventoryItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inventory-item' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='inventory-items'"
	 * @generated
	 */
	EList<InventoryItem> getInventoryItem();

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.SystemUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlanLocalDefinitions_User()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='user' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='users'"
	 * @generated
	 */
	EList<SystemUser> getUser();

	/**
	 * Returns the value of the '<em><b>Objectives And Methods</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.LocalObjective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectives And Methods</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlanLocalDefinitions_ObjectivesAndMethods()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlanLocalDefinitions_Activity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='activities'"
	 * @generated
	 */
	EList<Activity> getActivity();

	/**
	 * Returns the value of the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                              
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Remarks</b>
	 *   : Additional commentary about the containing object.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remarks</em>' attribute.
	 * @see #setRemarks(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAssessmentPlanLocalDefinitions_Remarks()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.AssessmentPlanLocalDefinitions#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

} // AssessmentPlanLocalDefinitions

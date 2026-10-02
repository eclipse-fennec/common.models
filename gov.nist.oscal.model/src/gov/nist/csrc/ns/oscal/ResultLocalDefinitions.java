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
 * A representation of the model object '<em><b>Result Local Definitions</b></em>'.
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
 *   <li>{@link gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getComponent <em>Component</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getUser <em>User</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getAssessmentAssets <em>Assessment Assets</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getAssessmentTask <em>Assessment Task</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResultLocalDefinitions()
 * @model extendedMetaData="name='local-definitions_._1_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ResultLocalDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.SystemComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResultLocalDefinitions_Component()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResultLocalDefinitions_InventoryItem()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResultLocalDefinitions_User()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='user' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='users'"
	 * @generated
	 */
	EList<SystemUser> getUser();

	/**
	 * Returns the value of the '<em><b>Assessment Assets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment Assets</em>' containment reference.
	 * @see #setAssessmentAssets(AssessmentAssets)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResultLocalDefinitions_AssessmentAssets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assessment-assets' namespace='##targetNamespace'"
	 * @generated
	 */
	AssessmentAssets getAssessmentAssets();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ResultLocalDefinitions#getAssessmentAssets <em>Assessment Assets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment Assets</em>' containment reference.
	 * @see #getAssessmentAssets()
	 * @generated
	 */
	void setAssessmentAssets(AssessmentAssets value);

	/**
	 * Returns the value of the '<em><b>Assessment Task</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment Task</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getResultLocalDefinitions_AssessmentTask()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assessment-task' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='tasks'"
	 * @generated
	 */
	EList<Task> getAssessmentTask();

} // ResultLocalDefinitions

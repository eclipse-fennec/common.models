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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Objective By Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Select Objective</b>
 *   : Used to select a control objective for inclusion/exclusion based on the control objective's identifier.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.SelectObjectiveById#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SelectObjectiveById#getObjectiveId <em>Objective Id</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSelectObjectiveById()
 * @model extendedMetaData="name='oscal-assessment-common-select-objective-by-id-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SelectObjectiveById extends EObject {
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSelectObjectiveById_Remarks()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SelectObjectiveById#getRemarks <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' attribute.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(String value);

	/**
	 * Returns the value of the '<em><b>Objective Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Objective ID</b>
	 *   : Points to an assessment objective.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objective Id</em>' attribute.
	 * @see #setObjectiveId(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSelectObjectiveById_ObjectiveId()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='objective-id'"
	 * @generated
	 */
	String getObjectiveId();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SelectObjectiveById#getObjectiveId <em>Objective Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective Id</em>' attribute.
	 * @see #getObjectiveId()
	 * @generated
	 */
	void setObjectiveId(String value);

} // SelectObjectiveById

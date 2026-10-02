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
 * A representation of the model object '<em><b>Control Select Control By Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Select Control</b>
 *   : Select a control or controls from an imported control set.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlSelectControlById#getWithId <em>With Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlSelectControlById#getMatching <em>Matching</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ControlSelectControlById#getWithChildControls <em>With Child Controls</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlSelectControlById()
 * @model extendedMetaData="name='oscal-control-common-select-control-by-id-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ControlSelectControlById extends EObject {
	/**
	 * Returns the value of the '<em><b>With Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With Id</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlSelectControlById_WithId()
	 * @model unique="false" dataType="gov.nist.csrc.ns.oscal.OscalControlCommonWithIdFIELD"
	 *        extendedMetaData="kind='element' name='with-id' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='with-ids'"
	 * @generated
	 */
	EList<String> getWithId();

	/**
	 * Returns the value of the '<em><b>Matching</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Matching}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matching</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlSelectControlById_Matching()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='matching' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Matching> getMatching();

	/**
	 * Returns the value of the '<em><b>With Child Controls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Include Contained Controls with Control</b>
	 *   : When a control is included, whether its child (dependent) controls are also included.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>With Child Controls</em>' attribute.
	 * @see #setWithChildControls(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getControlSelectControlById_WithChildControls()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='with-child-controls'"
	 * @generated
	 */
	String getWithChildControls();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ControlSelectControlById#getWithChildControls <em>With Child Controls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With Child Controls</em>' attribute.
	 * @see #getWithChildControls()
	 * @generated
	 */
	void setWithChildControls(String value);

} // ControlSelectControlById

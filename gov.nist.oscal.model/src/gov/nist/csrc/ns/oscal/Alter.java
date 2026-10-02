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
 * A representation of the model object '<em><b>Alter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                        
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Alteration</b>
 *   : Specifies changes to be made to an included control when a profile is resolved.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Alter#getRemove <em>Remove</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Alter#getAdd <em>Add</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Alter#getControlId <em>Control Id</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAlter()
 * @model extendedMetaData="name='alter_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Alter extends EObject {
	/**
	 * Returns the value of the '<em><b>Remove</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Remove}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAlter_Remove()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remove' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='removes'"
	 * @generated
	 */
	EList<Remove> getRemove();

	/**
	 * Returns the value of the '<em><b>Add</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Add}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAlter_Add()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='add' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='adds'"
	 * @generated
	 */
	EList<Add> getAdd();

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAlter_ControlId()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='control-id'"
	 * @generated
	 */
	String getControlId();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Alter#getControlId <em>Control Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Id</em>' attribute.
	 * @see #getControlId()
	 * @generated
	 */
	void setControlId(String value);

} // Alter

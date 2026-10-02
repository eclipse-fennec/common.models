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
 * A representation of the model object '<em><b>Ssp Control Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Control Implementation</b>
 *   : Describes how the system satisfies a set of controls.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.SspControlImplementation#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SspControlImplementation#getSetParameter <em>Set Parameter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SspControlImplementation#getImplementedRequirement <em>Implemented Requirement</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSspControlImplementation()
 * @model extendedMetaData="name='oscal-ssp-control-implementation-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SspControlImplementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Control Implementation Description</b>
	 *   : A statement describing important things to know about how this set of control satisfaction documentation is approached.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSspControlImplementation_Description()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupMultilineDatatype" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SspControlImplementation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Set Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.SetParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Parameter</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSspControlImplementation_SetParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='set-parameter' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='set-parameters'"
	 * @generated
	 */
	EList<SetParameter> getSetParameter();

	/**
	 * Returns the value of the '<em><b>Implemented Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.SspImplementedRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented Requirement</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSspControlImplementation_ImplementedRequirement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='implemented-requirement' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='implemented-requirements'"
	 * @generated
	 */
	EList<SspImplementedRequirement> getImplementedRequirement();

} // SspControlImplementation

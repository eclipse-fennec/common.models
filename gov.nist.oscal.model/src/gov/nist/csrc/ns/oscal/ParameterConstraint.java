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
 * A representation of the model object '<em><b>Parameter Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Constraint</b>
 *   : A formal or informal expression of a constraint or test.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.ParameterConstraint#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.ParameterConstraint#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParameterConstraint()
 * @model extendedMetaData="name='oscal-control-common-parameter-constraint-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ParameterConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                        
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Constraint Description</b>
	 *   : A textual summary of the constraint to be applied.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(MarkupMultilineDatatype)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParameterConstraint_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getDescription();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.ParameterConstraint#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(MarkupMultilineDatatype value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ConstraintTest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getParameterConstraint_Test()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='test' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='tests'"
	 * @generated
	 */
	EList<ConstraintTest> getTest();

} // ParameterConstraint

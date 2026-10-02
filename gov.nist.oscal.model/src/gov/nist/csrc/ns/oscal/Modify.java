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
 * A representation of the model object '<em><b>Modify</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Modify Controls</b>
 *   : Set parameters or amend controls in resolution.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Modify#getSetParameter <em>Set Parameter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Modify#getAlter <em>Alter</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getModify()
 * @model extendedMetaData="name='oscal-profile-modify-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Modify extends EObject {
	/**
	 * Returns the value of the '<em><b>Set Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ProfileSetParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Parameter</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getModify_SetParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='set-parameter' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='set-parameters'"
	 * @generated
	 */
	EList<ProfileSetParameter> getSetParameter();

	/**
	 * Returns the value of the '<em><b>Alter</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Alter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alter</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getModify_Alter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alter' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='alters'"
	 * @generated
	 */
	EList<Alter> getAlter();

} // Modify

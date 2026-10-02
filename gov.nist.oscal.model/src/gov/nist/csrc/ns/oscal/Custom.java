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
 * A representation of the model object '<em><b>Custom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                           
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Custom Grouping</b>
 *   : Provides an alternate grouping structure that selected controls will be placed in.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Custom#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Custom#getInsertControls <em>Insert Controls</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCustom()
 * @model extendedMetaData="name='custom_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Custom extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ProfileGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCustom_Group()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='groups'"
	 * @generated
	 */
	EList<ProfileGroup> getGroup();

	/**
	 * Returns the value of the '<em><b>Insert Controls</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InsertControls}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert Controls</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCustom_InsertControls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insert-controls' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InsertControls> getInsertControls();

} // Custom

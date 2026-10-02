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
 * A representation of the model object '<em><b>System Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">System Implementation</b>
 *   : Provides information as to how the system is implemented.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemImplementation#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemImplementation#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemImplementation#getLeveragedAuthorization <em>Leveraged Authorization</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemImplementation#getUser <em>User</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemImplementation#getComponent <em>Component</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemImplementation#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemImplementation#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemImplementation()
 * @model extendedMetaData="name='oscal-ssp-system-implementation-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SystemImplementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemImplementation_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemImplementation_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Leveraged Authorization</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.LeveragedAuthorization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leveraged Authorization</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemImplementation_LeveragedAuthorization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='leveraged-authorization' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='leveraged-authorizations'"
	 * @generated
	 */
	EList<LeveragedAuthorization> getLeveragedAuthorization();

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.SystemUser}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemImplementation_User()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='user' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='users'"
	 * @generated
	 */
	EList<SystemUser> getUser();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.SystemComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemImplementation_Component()
	 * @model containment="true" required="true"
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemImplementation_InventoryItem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inventory-item' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='inventory-items'"
	 * @generated
	 */
	EList<InventoryItem> getInventoryItem();

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemImplementation_Remarks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remarks' namespace='##targetNamespace'"
	 * @generated
	 */
	MarkupMultilineDatatype getRemarks();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.SystemImplementation#getRemarks <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remarks</em>' containment reference.
	 * @see #getRemarks()
	 * @generated
	 */
	void setRemarks(MarkupMultilineDatatype value);

} // SystemImplementation

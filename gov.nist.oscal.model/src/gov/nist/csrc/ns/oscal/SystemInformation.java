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
 * A representation of the model object '<em><b>System Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">System Information</b>
 *   : Contains details about all information types that are stored, processed, or transmitted by the system, such as privacy information, and those defined in NIST SP 800-60.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemInformation#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemInformation#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.SystemInformation#getInformationType <em>Information Type</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemInformation()
 * @model extendedMetaData="name='oscal-ssp-system-information-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SystemInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemInformation_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemInformation_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Information Type</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.InformationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Type</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getSystemInformation_InformationType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='information-type' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='information-types'"
	 * @generated
	 */
	EList<InformationType> getInformationType();

} // SystemInformation

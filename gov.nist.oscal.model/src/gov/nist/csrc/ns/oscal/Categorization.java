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
 * A representation of the model object '<em><b>Categorization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                                 
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Information Type Categorization</b>
 *   : A set of information type identifiers qualified by the given identification system used, such as NIST SP 800-60.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Categorization#getInformationTypeId <em>Information Type Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Categorization#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCategorization()
 * @model extendedMetaData="name='categorization_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Categorization extends EObject {
	/**
	 * Returns the value of the '<em><b>Information Type Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Type Id</em>' attribute list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCategorization_InformationTypeId()
	 * @model unique="false" dataType="gov.nist.csrc.ns.oscal.InformationTypeIdType"
	 *        extendedMetaData="kind='element' name='information-type-id' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='information-type-ids'"
	 * @generated
	 */
	EList<String> getInformationTypeId();

	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                    
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Information Type Identification System</b>
	 *   : Specifies the information type identification system used.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getCategorization_System()
	 * @model dataType="gov.nist.csrc.ns.oscal.URIDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='system'"
	 * @generated
	 */
	String getSystem();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Categorization#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(String value);

} // Categorization

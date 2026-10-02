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
 * A representation of the model object '<em><b>Rlink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                                 
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Resource link</b>
 *   : A URL-based pointer to an external resource with an optional hash for verification and change detection.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Rlink#getHash <em>Hash</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Rlink#getHref <em>Href</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Rlink#getMediaType <em>Media Type</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRlink()
 * @model extendedMetaData="name='rlink_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Rlink extends EObject {
	/**
	 * Returns the value of the '<em><b>Hash</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Hash}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hash</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRlink_Hash()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hash' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='hashes'"
	 * @generated
	 */
	EList<Hash> getHash();

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                    
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Hypertext Reference</b>
	 *   : A resolvable URL pointing to the referenced resource.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRlink_Href()
	 * @model dataType="gov.nist.csrc.ns.oscal.URIReferenceDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Rlink#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                    
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Media Type</b>
	 *   : A label that indicates the nature of a resource, as a data serialization or format.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media Type</em>' attribute.
	 * @see #setMediaType(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getRlink_MediaType()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype"
	 *        extendedMetaData="kind='attribute' name='media-type'"
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Rlink#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

} // Rlink

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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base64</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                                 
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Base64</b>
 *   : A resource encoded using the Base64 alphabet defined by RFC 2045.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Base64#getValue <em>Value</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Base64#getFilename <em>Filename</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Base64#getMediaType <em>Media Type</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getBase64()
 * @model extendedMetaData="name='base64_._type' kind='simple'"
 * @generated
 */
@ProviderType
public interface Base64 extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(byte[])
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getBase64_Value()
	 * @model dataType="gov.nist.csrc.ns.oscal.Base64Datatype"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	byte[] getValue();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Base64#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(byte[] value);

	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                          
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">File Name</b>
	 *   : Name of the file before it was encoded as Base64 to be embedded in a resource. This is the name that will be assigned to the file when the file is decoded.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getBase64_Filename()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='filename'"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Base64#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getBase64_MediaType()
	 * @model dataType="gov.nist.csrc.ns.oscal.StringDatatype"
	 *        extendedMetaData="kind='attribute' name='media-type'"
	 * @generated
	 */
	String getMediaType();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Base64#getMediaType <em>Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Type</em>' attribute.
	 * @see #getMediaType()
	 * @generated
	 */
	void setMediaType(String value);

} // Base64

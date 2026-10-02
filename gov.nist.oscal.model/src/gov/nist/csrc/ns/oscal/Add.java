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
 * A representation of the model object '<em><b>Add</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                                 
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Addition</b>
 *   : Specifies contents to be added into controls, in resolution.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.Add#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Add#getParam <em>Param</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Add#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Add#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Add#getPart <em>Part</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Add#getById <em>By Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.Add#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAdd()
 * @model extendedMetaData="name='add_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Add extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                          
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Title Change</b>
	 *   : A name given to the control, which may be used by a tool for display and navigation.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAdd_Title()
	 * @model dataType="gov.nist.csrc.ns.oscal.MarkupLineDatatype"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Add#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAdd_Param()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='params'"
	 * @generated
	 */
	EList<Parameter> getParam();

	/**
	 * Returns the value of the '<em><b>Prop</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAdd_Prop()
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
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAdd_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='link' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='links'"
	 * @generated
	 */
	EList<Link> getLink();

	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.Part}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAdd_Part()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='part' namespace='##targetNamespace'"
	 *        annotation="http://eclipse.org/fennec/codec key='parts'"
	 * @generated
	 */
	EList<Part> getPart();

	/**
	 * Returns the value of the '<em><b>By Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                    
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Reference by ID</b>
	 *   : Target location of the addition.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>By Id</em>' attribute.
	 * @see #setById(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAdd_ById()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='by-id'"
	 * @generated
	 */
	String getById();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Add#getById <em>By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>By Id</em>' attribute.
	 * @see #getById()
	 * @generated
	 */
	void setById(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                    
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Position</b>
	 *   : Where to add the new content with respect to the targeted element (beside it or inside it).
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getAdd_Position()
	 * @model dataType="gov.nist.csrc.ns.oscal.TokenDatatype"
	 *        extendedMetaData="kind='attribute' name='position'"
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.Add#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

} // Add
